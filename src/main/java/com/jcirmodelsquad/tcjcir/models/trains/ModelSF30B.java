//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SF30B
// Model Creator: bida
// Created on: 23.01.2025 - 10:53:09
// Last changed on: 23.01.2025 - 10:53:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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

public class ModelSF30B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSF30B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[349];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 269, 187, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 200, 217, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 319, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 112, 49, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 224, 152, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 194, 191, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 355, 124, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 141, 40, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 62, 40, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 102, 29, textureX, textureY); // Box 68
		bodyModel[11] = new ModelRendererTurbo(this, 127, 43, textureX, textureY); // Box 106
		bodyModel[12] = new ModelRendererTurbo(this, 84, 43, textureX, textureY); // Box 107
		bodyModel[13] = new ModelRendererTurbo(this, 378, 43, textureX, textureY); // Box 148
		bodyModel[14] = new ModelRendererTurbo(this, 391, 55, textureX, textureY); // Box 149
		bodyModel[15] = new ModelRendererTurbo(this, 363, 55, textureX, textureY); // Box 150
		bodyModel[16] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 157
		bodyModel[17] = new ModelRendererTurbo(this, 213, 238, textureX, textureY); // Box 158
		bodyModel[18] = new ModelRendererTurbo(this, 111, 23, textureX, textureY); // Box 160
		bodyModel[19] = new ModelRendererTurbo(this, 101, 21, textureX, textureY); // Box 161
		bodyModel[20] = new ModelRendererTurbo(this, 141, 21, textureX, textureY); // Box 162
		bodyModel[21] = new ModelRendererTurbo(this, 101, 9, textureX, textureY); // Box 163
		bodyModel[22] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 164
		bodyModel[23] = new ModelRendererTurbo(this, 144, 29, textureX, textureY); // Box 166
		bodyModel[24] = new ModelRendererTurbo(this, 111, 11, textureX, textureY); // Box 169
		bodyModel[25] = new ModelRendererTurbo(this, 84, 5, textureX, textureY); // Box 48
		bodyModel[26] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[27] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[28] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[29] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[30] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[31] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[32] = new ModelRendererTurbo(this, 224, 171, textureX, textureY); // Box 215
		bodyModel[33] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[34] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[36] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 251
		bodyModel[37] = new ModelRendererTurbo(this, 223, 49, textureX, textureY); // Box 277
		bodyModel[38] = new ModelRendererTurbo(this, 295, 96, textureX, textureY); // Box 285
		bodyModel[39] = new ModelRendererTurbo(this, 339, 96, textureX, textureY); // Box 288
		bodyModel[40] = new ModelRendererTurbo(this, 292, 107, textureX, textureY); // Box 300
		bodyModel[41] = new ModelRendererTurbo(this, 339, 109, textureX, textureY); // Box 303
		bodyModel[42] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[43] = new ModelRendererTurbo(this, 376, 135, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[44] = new ModelRendererTurbo(this, 364, 135, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[45] = new ModelRendererTurbo(this, 355, 124, textureX, textureY); // Box 19
		bodyModel[46] = new ModelRendererTurbo(this, 406, 138, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[47] = new ModelRendererTurbo(this, 192, 38, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[48] = new ModelRendererTurbo(this, 201, 38, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[49] = new ModelRendererTurbo(this, 155, 2, textureX, textureY); // Box 114
		bodyModel[50] = new ModelRendererTurbo(this, 155, 2, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 155, 5, textureX, textureY); // Box 78
		bodyModel[52] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[53] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[54] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[55] = new ModelRendererTurbo(this, 487, 145, textureX, textureY); // Box 273
		bodyModel[56] = new ModelRendererTurbo(this, 194, 33, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[57] = new ModelRendererTurbo(this, 201, 33, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[58] = new ModelRendererTurbo(this, 193, 52, textureX, textureY, "lamp"); // Box 186 Headlight Front up NOSE
		bodyModel[59] = new ModelRendererTurbo(this, 193, 57, textureX, textureY, "lamp"); // Box 187 Headlight Front down NOSE
		bodyModel[60] = new ModelRendererTurbo(this, 406, 66, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[61] = new ModelRendererTurbo(this, 406, 61, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[62] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[64] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[65] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[66] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[67] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[68] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[69] = new ModelRendererTurbo(this, 234, 15, textureX, textureY); // Box 292
		bodyModel[70] = new ModelRendererTurbo(this, 234, 1, textureX, textureY); // Box 293
		bodyModel[71] = new ModelRendererTurbo(this, 232, 7, textureX, textureY); // Box 294
		bodyModel[72] = new ModelRendererTurbo(this, 223, 5, textureX, textureY); // Box 286
		bodyModel[73] = new ModelRendererTurbo(this, 218, 8, textureX, textureY); // Box 287
		bodyModel[74] = new ModelRendererTurbo(this, 223, 11, textureX, textureY); // Box 288
		bodyModel[75] = new ModelRendererTurbo(this, 223, 8, textureX, textureY); // Box 289
		bodyModel[76] = new ModelRendererTurbo(this, 298, 107, textureX, textureY); // Box 296
		bodyModel[77] = new ModelRendererTurbo(this, 113, 19, textureX, textureY); // Box 309
		bodyModel[78] = new ModelRendererTurbo(this, 323, 131, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[79] = new ModelRendererTurbo(this, 323, 131, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[80] = new ModelRendererTurbo(this, 101, 54, textureX, textureY); // Box 52 door swing right
		bodyModel[81] = new ModelRendererTurbo(this, 180, 54, textureX, textureY); // Box 314 door swing right
		bodyModel[82] = new ModelRendererTurbo(this, 275, 136, textureX, textureY); // Box 253
		bodyModel[83] = new ModelRendererTurbo(this, 278, 129, textureX, textureY); // Box 280
		bodyModel[84] = new ModelRendererTurbo(this, 466, 21, textureX, textureY); // Box 283
		bodyModel[85] = new ModelRendererTurbo(this, 466, 2, textureX, textureY); // Box 284
		bodyModel[86] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[87] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[88] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[89] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[90] = new ModelRendererTurbo(this, 201, 38, textureX, textureY, "cull"); // Box 440 cull
		bodyModel[91] = new ModelRendererTurbo(this, 201, 33, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[92] = new ModelRendererTurbo(this, 192, 38, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[93] = new ModelRendererTurbo(this, 194, 33, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[94] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[95] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[96] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[97] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[98] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[99] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[100] = new ModelRendererTurbo(this, 406, 58, textureX, textureY); // Box 298
		bodyModel[101] = new ModelRendererTurbo(this, 415, 49, textureX, textureY); // Box 369
		bodyModel[102] = new ModelRendererTurbo(this, 415, 36, textureX, textureY); // Box 370
		bodyModel[103] = new ModelRendererTurbo(this, 421, 45, textureX, textureY); // Box 371
		bodyModel[104] = new ModelRendererTurbo(this, 388, 43, textureX, textureY); // Box 291
		bodyModel[105] = new ModelRendererTurbo(this, 404, 42, textureX, textureY, "lamp"); // Box 339 glowey marker fictional
		bodyModel[106] = new ModelRendererTurbo(this, 404, 42, textureX, textureY, "lamp"); // Box 340 glowey marker fictional
		bodyModel[107] = new ModelRendererTurbo(this, 85, 50, textureX, textureY); // Box 123
		bodyModel[108] = new ModelRendererTurbo(this, 164, 37, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[109] = new ModelRendererTurbo(this, 166, 32, textureX, textureY); // Box 5
		bodyModel[110] = new ModelRendererTurbo(this, 85, 53, textureX, textureY); // Box 311
		bodyModel[111] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[112] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[113] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[114] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[115] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[116] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[117] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[118] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[119] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[120] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[121] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[122] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[123] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[124] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[125] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[126] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[127] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[128] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[129] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[130] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[131] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[132] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[133] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[134] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[135] = new ModelRendererTurbo(this, 141, 135, textureX, textureY); // Box 206 early stairwell pillar
		bodyModel[136] = new ModelRendererTurbo(this, 141, 135, textureX, textureY); // Box 207 early stairwell pillar
		bodyModel[137] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217 early stairwell pillar
		bodyModel[138] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 221 early stairwell pillar
		bodyModel[139] = new ModelRendererTurbo(this, 376, 128, textureX, textureY); // Box 19
		bodyModel[140] = new ModelRendererTurbo(this, 376, 128, textureX, textureY); // Box 548
		bodyModel[141] = new ModelRendererTurbo(this, 376, 128, textureX, textureY); // Box 19
		bodyModel[142] = new ModelRendererTurbo(this, 376, 128, textureX, textureY); // Box 548
		bodyModel[143] = new ModelRendererTurbo(this, 495, 54, textureX, textureY); // Box 293
		bodyModel[144] = new ModelRendererTurbo(this, 484, 55, textureX, textureY); // Box 293
		bodyModel[145] = new ModelRendererTurbo(this, 199, 5, textureX, textureY); // Box 786
		bodyModel[146] = new ModelRendererTurbo(this, 190, 2, textureX, textureY); // Box 787
		bodyModel[147] = new ModelRendererTurbo(this, 188, 5, textureX, textureY); // Box 788
		bodyModel[148] = new ModelRendererTurbo(this, 190, 8, textureX, textureY); // Box 789
		bodyModel[149] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[150] = new ModelRendererTurbo(this, 406, 43, textureX, textureY, "lamp"); // Box 165 numberboard rear fictional
		bodyModel[151] = new ModelRendererTurbo(this, 247, 165, textureX, textureY); // Box 63
		bodyModel[152] = new ModelRendererTurbo(this, 169, 5, textureX, textureY); // Box 184 o2 generator
		bodyModel[153] = new ModelRendererTurbo(this, 266, 120, textureX, textureY); // Box 318
		bodyModel[154] = new ModelRendererTurbo(this, 265, 134, textureX, textureY); // Box 322
		bodyModel[155] = new ModelRendererTurbo(this, 265, 134, textureX, textureY); // Box 757
		bodyModel[156] = new ModelRendererTurbo(this, 265, 128, textureX, textureY); // Box 758
		bodyModel[157] = new ModelRendererTurbo(this, 265, 128, textureX, textureY); // Box 440
		bodyModel[158] = new ModelRendererTurbo(this, 234, 122, textureX, textureY); // Box 631
		bodyModel[159] = new ModelRendererTurbo(this, 265, 134, textureX, textureY); // Box 882
		bodyModel[160] = new ModelRendererTurbo(this, 265, 134, textureX, textureY); // Box 883
		bodyModel[161] = new ModelRendererTurbo(this, 269, 212, textureX, textureY); // Box 630
		bodyModel[162] = new ModelRendererTurbo(this, 223, 2, textureX, textureY); // Box 526
		bodyModel[163] = new ModelRendererTurbo(this, 223, 14, textureX, textureY); // Box 527
		bodyModel[164] = new ModelRendererTurbo(this, 355, 134, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[165] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[166] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[167] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[168] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[169] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[170] = new ModelRendererTurbo(this, 419, 156, textureX, textureY); // Box 547
		bodyModel[171] = new ModelRendererTurbo(this, 419, 171, textureX, textureY); // Box 548
		bodyModel[172] = new ModelRendererTurbo(this, 205, 227, textureX, textureY); // Box 382 fuel filler late
		bodyModel[173] = new ModelRendererTurbo(this, 205, 227, textureX, textureY); // Box 383 fuel filler late
		bodyModel[174] = new ModelRendererTurbo(this, 113, 31, textureX, textureY); // Box 165
		bodyModel[175] = new ModelRendererTurbo(this, 95, 140, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[176] = new ModelRendererTurbo(this, 95, 135, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[177] = new ModelRendererTurbo(this, 435, 144, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[178] = new ModelRendererTurbo(this, 435, 139, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[179] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[180] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[181] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[182] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[183] = new ModelRendererTurbo(this, 223, 52, textureX, textureY); // Box 355 brakewheel
		bodyModel[184] = new ModelRendererTurbo(this, 71, 12, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[185] = new ModelRendererTurbo(this, 71, 12, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[186] = new ModelRendererTurbo(this, 91, 4, textureX, textureY); // Box 43
		bodyModel[187] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 175
		bodyModel[188] = new ModelRendererTurbo(this, 387, 135, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[189] = new ModelRendererTurbo(this, 206, 2, textureX, textureY); // Box 525
		bodyModel[190] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 364 prime base
		bodyModel[191] = new ModelRendererTurbo(this, 168, 1, textureX, textureY, "prime1"); // Box 6 PRIME6-1
		bodyModel[192] = new ModelRendererTurbo(this, 168, 1, textureX, textureY, "prime3"); // Box 7 PRIME6-3
		bodyModel[193] = new ModelRendererTurbo(this, 168, 1, textureX, textureY, "prime2"); // Box 8 PRIME6-2
		bodyModel[194] = new ModelRendererTurbo(this, 168, 1, textureX, textureY, "prime4"); // Box 9 PRIME6-4
		bodyModel[195] = new ModelRendererTurbo(this, 168, 9, textureX, textureY, "cull"); // Box 426 cull big beacon holder
		bodyModel[196] = new ModelRendererTurbo(this, 206, 5, textureX, textureY); // Box 433
		bodyModel[197] = new ModelRendererTurbo(this, 215, 5, textureX, textureY); // Box 434
		bodyModel[198] = new ModelRendererTurbo(this, 206, 8, textureX, textureY); // Box 436
		bodyModel[199] = new ModelRendererTurbo(this, 9, 79, textureX, textureY); // Box 25
		bodyModel[200] = new ModelRendererTurbo(this, 97, 103, textureX, textureY); // Box 410
		bodyModel[201] = new ModelRendererTurbo(this, 445, 119, textureX, textureY); // Box 256
		bodyModel[202] = new ModelRendererTurbo(this, 155, 131, textureX, textureY); // Box 63
		bodyModel[203] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[204] = new ModelRendererTurbo(this, 152, 146, textureX, textureY); // Box 196
		bodyModel[205] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[206] = new ModelRendererTurbo(this, 101, 117, textureX, textureY); // box65
		bodyModel[207] = new ModelRendererTurbo(this, 155, 145, textureX, textureY); // Box 2603
		bodyModel[208] = new ModelRendererTurbo(this, 146, 146, textureX, textureY); // Box 261
		bodyModel[209] = new ModelRendererTurbo(this, 142, 124, textureX, textureY); // Box 298
		bodyModel[210] = new ModelRendererTurbo(this, 94, 124, textureX, textureY); // Box 299
		bodyModel[211] = new ModelRendererTurbo(this, 284, 96, textureX, textureY); // Box 410
		bodyModel[212] = new ModelRendererTurbo(this, 281, 96, textureX, textureY); // Box 310
		bodyModel[213] = new ModelRendererTurbo(this, 284, 109, textureX, textureY); // Box 250
		bodyModel[214] = new ModelRendererTurbo(this, 80, 122, textureX, textureY); // Box 81
		bodyModel[215] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 81
		bodyModel[216] = new ModelRendererTurbo(this, 77, 125, textureX, textureY); // Box 275
		bodyModel[217] = new ModelRendererTurbo(this, 77, 123, textureX, textureY); // Box 276
		bodyModel[218] = new ModelRendererTurbo(this, 449, 133, textureX, textureY); // Box 231
		bodyModel[219] = new ModelRendererTurbo(this, 442, 140, textureX, textureY); // Box 300
		bodyModel[220] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 301
		bodyModel[221] = new ModelRendererTurbo(this, 84, 80, textureX, textureY); // Box 558
		bodyModel[222] = new ModelRendererTurbo(this, 84, 12, textureX, textureY, "lamp"); // Box 186 Headlight Front up CAB
		bodyModel[223] = new ModelRendererTurbo(this, 84, 17, textureX, textureY, "lamp"); // Box 187 Headlight Front down CAB
		bodyModel[224] = new ModelRendererTurbo(this, 318, 62, textureX, textureY); // Box 264
		bodyModel[225] = new ModelRendererTurbo(this, 318, 58, textureX, textureY); // Box 265
		bodyModel[226] = new ModelRendererTurbo(this, 285, 62, textureX, textureY); // Box 432
		bodyModel[227] = new ModelRendererTurbo(this, 285, 58, textureX, textureY); // Box 433
		bodyModel[228] = new ModelRendererTurbo(this, 363, 39, textureX, textureY); // Box 278
		bodyModel[229] = new ModelRendererTurbo(this, 391, 42, textureX, textureY); // Box 435
		bodyModel[230] = new ModelRendererTurbo(this, 362, 36, textureX, textureY); // Box 436
		bodyModel[231] = new ModelRendererTurbo(this, 274, 26, textureX, textureY); // Box 18 late stack for fictionals
		bodyModel[232] = new ModelRendererTurbo(this, 295, 25, textureX, textureY); // Box 21 late stack
		bodyModel[233] = new ModelRendererTurbo(this, 222, 50, textureX, textureY); // Box 276
		bodyModel[234] = new ModelRendererTurbo(this, 228, 42, textureX, textureY); // Box 224
		bodyModel[235] = new ModelRendererTurbo(this, 228, 34, textureX, textureY); // Box 225
		bodyModel[236] = new ModelRendererTurbo(this, 195, 50, textureX, textureY); // Box 226
		bodyModel[237] = new ModelRendererTurbo(this, 146, 110, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[238] = new ModelRendererTurbo(this, 147, 109, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[239] = new ModelRendererTurbo(this, 113, 110, textureX, textureY); // Box 80
		bodyModel[240] = new ModelRendererTurbo(this, 149, 118, textureX, textureY, "cull"); // Box 445 cull anticlimber
		bodyModel[241] = new ModelRendererTurbo(this, 167, 118, textureX, textureY, "cull"); // Box 446 cull anticlimber
		bodyModel[242] = new ModelRendererTurbo(this, 102, 111, textureX, textureY); // Box 447
		bodyModel[243] = new ModelRendererTurbo(this, 97, 116, textureX, textureY); // Box 448
		bodyModel[244] = new ModelRendererTurbo(this, 126, 111, textureX, textureY); // Box 449
		bodyModel[245] = new ModelRendererTurbo(this, 137, 116, textureX, textureY); // Box 450
		bodyModel[246] = new ModelRendererTurbo(this, 212, 50, textureX, textureY); // Box 451
		bodyModel[247] = new ModelRendererTurbo(this, 213, 46, textureX, textureY); // Box 452
		bodyModel[248] = new ModelRendererTurbo(this, 204, 46, textureX, textureY); // Box 402
		bodyModel[249] = new ModelRendererTurbo(this, 449, 111, textureX, textureY); // Box 454
		bodyModel[250] = new ModelRendererTurbo(this, 449, 112, textureX, textureY); // Box 455
		bodyModel[251] = new ModelRendererTurbo(this, 452, 120, textureX, textureY); // Box 456
		bodyModel[252] = new ModelRendererTurbo(this, 470, 120, textureX, textureY); // Box 457
		bodyModel[253] = new ModelRendererTurbo(this, 505, 141, textureX, textureY); // Box 458
		bodyModel[254] = new ModelRendererTurbo(this, 474, 127, textureX, textureY); // Box 459
		bodyModel[255] = new ModelRendererTurbo(this, 461, 126, textureX, textureY); // Box 460
		bodyModel[256] = new ModelRendererTurbo(this, 450, 127, textureX, textureY); // Box 461
		bodyModel[257] = new ModelRendererTurbo(this, 505, 132, textureX, textureY); // Box 462
		bodyModel[258] = new ModelRendererTurbo(this, 404, 54, textureX, textureY, "cull"); // Box 463 cull rear headlight holder
		bodyModel[259] = new ModelRendererTurbo(this, 77, 79, textureX, textureY); // Box 300
		bodyModel[260] = new ModelRendererTurbo(this, 66, 82, textureX, textureY); // Box 301
		bodyModel[261] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 388
		bodyModel[262] = new ModelRendererTurbo(this, 200, 55, textureX, textureY, "cull"); // Box 303 cull headlight enclosure
		bodyModel[263] = new ModelRendererTurbo(this, 168, 110, textureX, textureY); // Box 407
		bodyModel[264] = new ModelRendererTurbo(this, 466, 78, textureX, textureY); // Box 293 b23-7 radi
		bodyModel[265] = new ModelRendererTurbo(this, 466, 87, textureX, textureY); // Box 310
		bodyModel[266] = new ModelRendererTurbo(this, 288, 35, textureX, textureY); // Box 311
		bodyModel[267] = new ModelRendererTurbo(this, 466, 65, textureX, textureY); // Box 312
		bodyModel[268] = new ModelRendererTurbo(this, 71, 84, textureX, textureY); // Box 313
		bodyModel[269] = new ModelRendererTurbo(this, 287, 25, textureX, textureY); // Box 18 early stack
		bodyModel[270] = new ModelRendererTurbo(this, 409, 187, textureX, textureY); // Box 315
		bodyModel[271] = new ModelRendererTurbo(this, 367, 236, textureX, textureY); // Box 316
		bodyModel[272] = new ModelRendererTurbo(this, 367, 241, textureX, textureY); // Box 317
		bodyModel[273] = new ModelRendererTurbo(this, 409, 212, textureX, textureY); // Box 318
		bodyModel[274] = new ModelRendererTurbo(this, 136, 217, textureX, textureY); // Box 319 late tank
		bodyModel[275] = new ModelRendererTurbo(this, 167, 250, textureX, textureY); // Box 320 late tank
		bodyModel[276] = new ModelRendererTurbo(this, 70, 84, textureX, textureY); // Box 322
		bodyModel[277] = new ModelRendererTurbo(this, 70, 93, textureX, textureY); // Box 323
		bodyModel[278] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 314
		bodyModel[279] = new ModelRendererTurbo(this, 66, 82, textureX, textureY); // Box 315
		bodyModel[280] = new ModelRendererTurbo(this, 273, 63, textureX, textureY); // Box 316
		bodyModel[281] = new ModelRendererTurbo(this, 273, 60, textureX, textureY); // Box 317
		bodyModel[282] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 319 flange lubricator 6419
		bodyModel[283] = new ModelRendererTurbo(this, 282, 43, textureX, textureY); // Box 320 flange lubricator 6419
		bodyModel[284] = new ModelRendererTurbo(this, 282, 43, textureX, textureY); // Box 321 flange lubricator 6419
		bodyModel[285] = new ModelRendererTurbo(this, 279, 38, textureX, textureY); // Box 322 flange lubricator bit
		bodyModel[286] = new ModelRendererTurbo(this, 484, 46, textureX, textureY); // Box 323
		bodyModel[287] = new ModelRendererTurbo(this, 473, 55, textureX, textureY); // Box 324
		bodyModel[288] = new ModelRendererTurbo(this, 473, 46, textureX, textureY); // Box 325
		bodyModel[289] = new ModelRendererTurbo(this, 397, 138, textureX, textureY); // Box 326 why dont you fucking FILTER THE FUCKING BITCHES AGAIN WHY ARE THERE TWO OF THESE WHAT THE FUCK SANTA FE
		bodyModel[290] = new ModelRendererTurbo(this, 114, 64, textureX, textureY); // Box 327 interior cab wall
		bodyModel[291] = new ModelRendererTurbo(this, 35, 64, textureX, textureY); // Box 328 interior cab wall
		bodyModel[292] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 329
		bodyModel[293] = new ModelRendererTurbo(this, 103, 1, textureX, textureY); // Box 330
		bodyModel[294] = new ModelRendererTurbo(this, 143, 1, textureX, textureY); // Box 331
		bodyModel[295] = new ModelRendererTurbo(this, 113, 5, textureX, textureY); // Box 332
		bodyModel[296] = new ModelRendererTurbo(this, 284, 107, textureX, textureY); // Box 333
		bodyModel[297] = new ModelRendererTurbo(this, 289, 96, textureX, textureY); // Box 334
		bodyModel[298] = new ModelRendererTurbo(this, 2, 79, textureX, textureY); // Box 335 this is the floor i decree it so
		bodyModel[299] = new ModelRendererTurbo(this, 192, 14, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[300] = new ModelRendererTurbo(this, 199, 12, textureX, textureY); // Box 308
		bodyModel[301] = new ModelRendererTurbo(this, 363, 42, textureX, textureY); // Box 321
		bodyModel[302] = new ModelRendererTurbo(this, 412, 36, textureX, textureY); // Box 322
		bodyModel[303] = new ModelRendererTurbo(this, 390, 36, textureX, textureY); // Box 323
		bodyModel[304] = new ModelRendererTurbo(this, 391, 39, textureX, textureY); // Box 324
		bodyModel[305] = new ModelRendererTurbo(this, 352, 57, textureX, textureY, "cull"); // Box 325 cull rear ladder
		bodyModel[306] = new ModelRendererTurbo(this, 234, 77, textureX, textureY); // Box 327
		bodyModel[307] = new ModelRendererTurbo(this, 406, 43, textureX, textureY, "lamp"); // Box 329 numberboard rear fictional
		bodyModel[308] = new ModelRendererTurbo(this, 200, 50, textureX, textureY, "lamp"); // Box 307 glowey marker fictional
		bodyModel[309] = new ModelRendererTurbo(this, 200, 50, textureX, textureY, "lamp"); // Box 308 glowey marker fictional
		bodyModel[310] = new ModelRendererTurbo(this, 110, 129, textureX, textureY); // Box 440 honse
		bodyModel[311] = new ModelRendererTurbo(this, 430, 142, textureX, textureY); // Box 333 honse
		bodyModel[312] = new ModelRendererTurbo(this, 213, 29, textureX, textureY); // Box 136
		bodyModel[313] = new ModelRendererTurbo(this, 213, 18, textureX, textureY); // Box 287
		bodyModel[314] = new ModelRendererTurbo(this, 213, 22, textureX, textureY); // Box 288
		bodyModel[315] = new ModelRendererTurbo(this, 215, 26, textureX, textureY); // Box 289
		bodyModel[316] = new ModelRendererTurbo(this, 214, 15, textureX, textureY); // Box 299
		bodyModel[317] = new ModelRendererTurbo(this, 156, 23, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[318] = new ModelRendererTurbo(this, 175, 23, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[319] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 563
		bodyModel[320] = new ModelRendererTurbo(this, 179, 21, textureX, textureY); // Box 564
		bodyModel[321] = new ModelRendererTurbo(this, 162, 18, textureX, textureY, "cull"); // Box 382 cull ptc antenna shiz
		bodyModel[322] = new ModelRendererTurbo(this, 159, 9, textureX, textureY, "cull"); // Box 333 cull small beacon holder
		bodyModel[323] = new ModelRendererTurbo(this, 161, 6, textureX, textureY); // Box 409 commander base
		bodyModel[324] = new ModelRendererTurbo(this, 161, 2, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[325] = new ModelRendererTurbo(this, 295, 107, textureX, textureY); // Box 336
		bodyModel[326] = new ModelRendererTurbo(this, 292, 109, textureX, textureY); // Box 337
		bodyModel[327] = new ModelRendererTurbo(this, 339, 107, textureX, textureY); // Box 338
		bodyModel[328] = new ModelRendererTurbo(this, 310, 96, textureX, textureY); // Box 339
		bodyModel[329] = new ModelRendererTurbo(this, 339, 94, textureX, textureY); // Box 340
		bodyModel[330] = new ModelRendererTurbo(this, 310, 94, textureX, textureY); // Box 341
		bodyModel[331] = new ModelRendererTurbo(this, 194, 28, textureX, textureY); // Box 101
		bodyModel[332] = new ModelRendererTurbo(this, 194, 23, textureX, textureY, "ditch"); // Box 275 ditchlight f1
		bodyModel[333] = new ModelRendererTurbo(this, 194, 28, textureX, textureY); // Box 444
		bodyModel[334] = new ModelRendererTurbo(this, 194, 23, textureX, textureY, "ditch"); // Box 445 ditchlight f1
		bodyModel[335] = new ModelRendererTurbo(this, 201, 28, textureX, textureY); // Box 101
		bodyModel[336] = new ModelRendererTurbo(this, 201, 23, textureX, textureY, "ditch"); // Box 278 ditchlight r1
		bodyModel[337] = new ModelRendererTurbo(this, 201, 28, textureX, textureY); // Box 440
		bodyModel[338] = new ModelRendererTurbo(this, 201, 23, textureX, textureY, "ditch"); // Box 441 ditchlight r1
		bodyModel[339] = new ModelRendererTurbo(this, 350, 183, textureX, textureY); // Box 350 regulah frame for regulah people
		bodyModel[340] = new ModelRendererTurbo(this, 352, 208, textureX, textureY); // Box 351 regulah frame for regulah people
		bodyModel[341] = new ModelRendererTurbo(this, 163, 244, textureX, textureY); // Box 352 EARLY MASSIVE TANK
		bodyModel[342] = new ModelRendererTurbo(this, 210, 227, textureX, textureY); // Box 353 fule filler EARLY
		bodyModel[343] = new ModelRendererTurbo(this, 210, 227, textureX, textureY); // Box 354 fuel filler EARLY
		bodyModel[344] = new ModelRendererTurbo(this, 471, 112, textureX, textureY); // Box 356
		bodyModel[345] = new ModelRendererTurbo(this, 295, 94, textureX, textureY); // Box 357
		bodyModel[346] = new ModelRendererTurbo(this, 257, 77, textureX, textureY); // Box 347
		bodyModel[347] = new ModelRendererTurbo(this, 185, 42, textureX, textureY); // Box 348
		bodyModel[348] = new ModelRendererTurbo(this, 208, 14, textureX, textureY); // Box 104 cnrc antenna

		bodyModel[0].addBox(0F, 0F, 0F, 29, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 59, 19, 14, 0F); // Box 6
		bodyModel[2].setRotationPoint(-21F, -20F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-34F, -18F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-42F, -1F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 10
		bodyModel[5].setRotationPoint(-9F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(10F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[7].setRotationPoint(-22F, -18F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[8].setRotationPoint(-34F, -18F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[9].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0.4F, 0F, -3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[10].setRotationPoint(-34F, -21F, -11F);

		bodyModel[11].addBox(0F, 0F, -1F, 14, 3, 1, 0F); // Box 106
		bodyModel[11].setRotationPoint(-22F, -21F, -7F);
		bodyModel[11].rotateAngleY = 1.57079633F;

		bodyModel[12].addBox(0F, 0F, -1F, 14, 3, 1, 0F); // Box 107
		bodyModel[12].setRotationPoint(-34F, -21F, -7F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 21, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[13].setRotationPoint(37F, -22F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[14].setRotationPoint(38F, -15F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[15].setRotationPoint(38F, -15F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[16].setRotationPoint(-9F, 5F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[17].setRotationPoint(-9F, 5F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[18].setRotationPoint(-33F, -22F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[19].setRotationPoint(-34F, -22F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[20].setRotationPoint(-22F, -22F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[21].setRotationPoint(-34F, -22F, 1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[22].setRotationPoint(-22F, -22F, 1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0.4F, 0F, -3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[23].setRotationPoint(-22F, -21F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[24].setRotationPoint(-33F, -22F, 1F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[25].setRotationPoint(-35F, -22F, -1F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[26].setRotationPoint(-42F, 8F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[27].setRotationPoint(-42F, -1F, 7F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[28].setRotationPoint(-42F, 2F, 7F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[29].setRotationPoint(-42F, -1F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[30].setRotationPoint(-42F, 2F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[31].setRotationPoint(-42F, 8F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[32].setRotationPoint(38F, -1F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[33].setRotationPoint(38F, 7F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[34].setRotationPoint(38F, 7F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[35].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[36].setRotationPoint(-38F, 1F, -7F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[37].setRotationPoint(-36.6F, -10F, 7.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 285
		bodyModel[38].setRotationPoint(-17F, -13F, 11F);

		bodyModel[39].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 288
		bodyModel[39].setRotationPoint(8F, -9F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F); // Box 300
		bodyModel[40].setRotationPoint(-21F, -13F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 303
		bodyModel[41].setRotationPoint(8F, -9F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[42].setRotationPoint(39F, -9F, -11F);

		bodyModel[43].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[43].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[43].rotateAngleZ = -0.10471976F;

		bodyModel[44].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[44].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[45].setRotationPoint(-11F, 4F, -9F);

		bodyModel[46].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[46].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[46].rotateAngleZ = -0.19198622F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101 cull
		bodyModel[47].setRotationPoint(-44.5F, -1.01F, -6.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101 cull
		bodyModel[48].setRotationPoint(43F, -1.01F, -6.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[49].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[50].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[51].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[52].setRotationPoint(36F, 1F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[53].setRotationPoint(38F, -1F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[54].setRotationPoint(-42F, 1F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[55].setRotationPoint(37F, 1F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[56].setRotationPoint(-44.75F, -1.01F, -6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[57].setRotationPoint(44.25F, -1.01F, -6.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up NOSE
		bodyModel[58].setRotationPoint(-41.2F, -13F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down NOSE
		bodyModel[59].setRotationPoint(-41.2F, -11F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[60].setRotationPoint(38.5F, -16F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[61].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[63].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[64].setRotationPoint(36F, 1F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[65].setRotationPoint(38F, -1F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[66].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[67].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[68].setRotationPoint(39F, -9F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[69].setRotationPoint(-21F, -21F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[70].setRotationPoint(-21F, -21F, 3F);

		bodyModel[71].addBox(0F, 0F, 0F, 38, 1, 6, 0F); // Box 294
		bodyModel[71].setRotationPoint(-21F, -21F, -3F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[72].setRotationPoint(36F, -23.75F, 3.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[73].setRotationPoint(37.5F, -23F, 2.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[74].setRotationPoint(36.5F, -23.75F, 1.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[75].setRotationPoint(36F, -24F, 2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[76].setRotationPoint(-19F, -13F, -11.01F);

		bodyModel[77].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[77].setRotationPoint(-34F, -22F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[78].setRotationPoint(9F, 3F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[79].setRotationPoint(-12F, 3F, -6F);

		bodyModel[80].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[80].setRotationPoint(-33.5F, -18F, -10.5F);

		bodyModel[81].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[81].setRotationPoint(-21.5F, -18F, 10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[82].setRotationPoint(-32F, 1F, 9F);
		bodyModel[82].rotateAngleZ = -0.27925268F;

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[83].setRotationPoint(-35F, 1F, 9F);

		bodyModel[84].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[84].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[85].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[85].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[86].setRotationPoint(-42F, 6F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[87].setRotationPoint(-42F, 6F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[88].setRotationPoint(39F, 6F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[89].setRotationPoint(39F, 6F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440 cull
		bodyModel[90].setRotationPoint(43F, -1.01F, 4.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[91].setRotationPoint(44.25F, -1.01F, 4.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444 cull
		bodyModel[92].setRotationPoint(-44.5F, -1.01F, 4.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[93].setRotationPoint(-44.75F, -1.01F, 4.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[94].setRotationPoint(39F, 8F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[95].setRotationPoint(39F, 2F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[96].setRotationPoint(39F, -1F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[97].setRotationPoint(39F, 8F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[98].setRotationPoint(39F, 2F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[99].setRotationPoint(39F, -1F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[100].setRotationPoint(17F, -21F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[101].setRotationPoint(17F, -22F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[102].setRotationPoint(17F, -22F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[103].setRotationPoint(17F, -22F, -1F);

		bodyModel[104].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[104].setRotationPoint(38F, -22.4F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker fictional
		bodyModel[105].setRotationPoint(38.8F, -20F, -7.5F);
		bodyModel[105].rotateAngleY = -0.05235988F;

		bodyModel[106].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker fictional
		bodyModel[106].setRotationPoint(38.8F, -20F, 7.5F);
		bodyModel[106].rotateAngleY = 0.05235988F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[107].setRotationPoint(-32F, -18F, -11.4F);
		bodyModel[107].rotateAngleX = -0.61086524F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[108].setRotationPoint(-30F, -17F, 10.4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[109].setRotationPoint(-30F, -18F, 10.4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[110].setRotationPoint(-32F, -18F, 11.4F);
		bodyModel[110].rotateAngleX = 0.61086524F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[111].setRotationPoint(-46F, 7F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[112].setRotationPoint(-46F, 7F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[113].setRotationPoint(-45F, 6F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[114].setRotationPoint(-45F, 5F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[115].setRotationPoint(-45F, 6F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[116].setRotationPoint(-45F, 5F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[117].setRotationPoint(-45F, 4F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[118].setRotationPoint(-45F, 4F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[119].setRotationPoint(44F, 6F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[120].setRotationPoint(44F, 6F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[121].setRotationPoint(45F, 7F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[122].setRotationPoint(45F, 7F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[123].setRotationPoint(44F, 5F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[124].setRotationPoint(44F, 4F, 2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[125].setRotationPoint(44F, 5F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[126].setRotationPoint(44F, 4F, -8F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[127].setRotationPoint(-42F, 5F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[128].setRotationPoint(-42F, 5F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[129].setRotationPoint(39F, 5F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[130].setRotationPoint(39F, 5F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[131].setRotationPoint(39F, 4F, 8F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[132].setRotationPoint(-42F, 4F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[133].setRotationPoint(-42F, 4F, -8F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[134].setRotationPoint(39F, 4F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early stairwell pillar
		bodyModel[135].setRotationPoint(-39F, 3F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 early stairwell pillar
		bodyModel[136].setRotationPoint(-39F, 3F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217 early stairwell pillar
		bodyModel[137].setRotationPoint(38F, 3F, 10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 early stairwell pillar
		bodyModel[138].setRotationPoint(38F, 3F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[139].setRotationPoint(-12F, 5F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[140].setRotationPoint(-10F, 5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[141].setRotationPoint(9F, 5F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[142].setRotationPoint(11F, 5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[143].setRotationPoint(25F, -12F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 293
		bodyModel[144].setRotationPoint(17.5F, -5F, 7.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 786
		bodyModel[145].setRotationPoint(-12.5F, -22.75F, -0.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[146].setRotationPoint(-14F, -23.5F, 0.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[147].setRotationPoint(-15F, -23.5F, -1.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[148].setRotationPoint(-13F, -23.75F, -0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[149].setRotationPoint(-23.5F, -21F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard rear fictional
		bodyModel[150].setRotationPoint(38.9F, -18F, -7.25F);
		bodyModel[150].rotateAngleY = -0.12217305F;
		bodyModel[150].rotateAngleZ = -0.13962634F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[151].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[152].setRotationPoint(-33F, -23.5F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[153].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[154].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[155].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[156].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[157].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[158].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[159].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[160].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 29, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[161].setRotationPoint(-38F, 1F, -11F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 526
		bodyModel[162].setRotationPoint(36.5F, -25F, 3.25F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 527
		bodyModel[163].setRotationPoint(36.5F, -25F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[164].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[165].setRotationPoint(-26.8F, -15F, 1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[166].setRotationPoint(-33.5F, -13F, 3F);
		bodyModel[166].rotateAngleY = -0.45378561F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[167].setRotationPoint(-33.5F, -15F, 3F);
		bodyModel[167].rotateAngleY = -0.45378561F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[168].setRotationPoint(-33.5F, -9F, 3F);
		bodyModel[168].rotateAngleY = -0.45378561F;

		bodyModel[169].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[169].setRotationPoint(-33F, -18F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[170].setRotationPoint(18F, -22.51F, 1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[171].setRotationPoint(18F, -22.51F, -15F);

		bodyModel[172].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382 fuel filler late
		bodyModel[172].setRotationPoint(-8.5F, 1F, -10.75F);
		bodyModel[172].rotateAngleX = 1.11701072F;

		bodyModel[173].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383 fuel filler late
		bodyModel[173].setRotationPoint(-8.5F, 1F, 10.75F);
		bodyModel[173].rotateAngleX = -1.11701072F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[174].setRotationPoint(-33F, -19F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[175].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[176].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[177].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[178].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[179].setRotationPoint(-45F, 6F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[180].setRotationPoint(-45F, 6F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[181].setRotationPoint(44F, 6F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[182].setRotationPoint(44F, 6F, -10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[183].setRotationPoint(-38.6F, -12F, 8.5F);

		bodyModel[184].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[184].setRotationPoint(-35.05F, -20.5F, -1.5F);
		bodyModel[184].rotateAngleY = 0.13089969F;

		bodyModel[185].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[185].setRotationPoint(-35.05F, -20.5F, 1F);
		bodyModel[185].rotateAngleY = -0.13089969F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[186].setRotationPoint(-35F, -20.5F, -6.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[187].setRotationPoint(-35F, -20.5F, 1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[188].setRotationPoint(7F, 1.5F, -9F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[189].setRotationPoint(2.75F, -22.25F, -4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[190].setRotationPoint(-35F, -24F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME6-1
		bodyModel[191].setRotationPoint(-35F, -24.75F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME6-3
		bodyModel[192].setRotationPoint(-35F, -24.75F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME6-2
		bodyModel[193].setRotationPoint(-35F, -24.75F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME6-4
		bodyModel[194].setRotationPoint(-35F, -24.75F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 426 cull big beacon holder
		bodyModel[195].setRotationPoint(-35F, -23F, -1F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 433
		bodyModel[196].setRotationPoint(4.5F, -22.5F, -5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 434
		bodyModel[197].setRotationPoint(4.5F, -21.5F, -5F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 436
		bodyModel[198].setRotationPoint(2.75F, -22.25F, -6F);

		bodyModel[199].addBox(0F, 0F, 0F, 19, 4, 22, 0F); // Box 25
		bodyModel[199].setRotationPoint(-37F, -5F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 410
		bodyModel[200].setRotationPoint(-42.01F, -1F, -11F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 256
		bodyModel[201].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[202].setRotationPoint(-38F, 1F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[203].setRotationPoint(-39F, -1F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[204].setRotationPoint(-39F, 7F, 10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[205].setRotationPoint(-39F, 7F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[206].setRotationPoint(-42F, 8F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[207].setRotationPoint(-38F, 1F, 7F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[208].setRotationPoint(-39F, -1F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[209].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[209].rotateAngleY = -3.14159265F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[210].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[210].rotateAngleY = -3.14159265F;

		bodyModel[211].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 410
		bodyModel[211].setRotationPoint(-38F, -13F, 11F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[212].setRotationPoint(-39F, -13F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 250
		bodyModel[213].setRotationPoint(-39F, -13F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[214].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[215].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[216].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[217].setRotationPoint(-39F, -13F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[218].setRotationPoint(42F, 8F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[219].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[219].rotateAngleY = -3.14159265F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[220].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[220].rotateAngleY = -3.14159265F;

		bodyModel[221].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 558
		bodyModel[221].setRotationPoint(-11F, -5F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up CAB
		bodyModel[222].setRotationPoint(-35.25F, -21.85F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down CAB
		bodyModel[223].setRotationPoint(-35.25F, -19.95F, -1F);

		bodyModel[224].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 264
		bodyModel[224].setRotationPoint(7F, -17F, -8.15F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[225].setRotationPoint(7F, -19F, -8.15F);

		bodyModel[226].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 432
		bodyModel[226].setRotationPoint(7F, -17F, 7.15F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[227].setRotationPoint(7F, -19F, 7.15F);

		bodyModel[228].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,-0.25F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 278
		bodyModel[228].setRotationPoint(39F, -22F, -8F);
		bodyModel[228].rotateAngleY = 1.57079633F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 435
		bodyModel[229].setRotationPoint(38F, -21F, 2F);

		bodyModel[230].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F,-0.25F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[230].setRotationPoint(38F, -22F, -8F);
		bodyModel[230].rotateAngleY = 1.57079633F;

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack for fictionals
		bodyModel[231].setRotationPoint(10.5F, -22.5F, -3F);

		bodyModel[232].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[232].setRotationPoint(10F, -21.5F, -3.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 7, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Box 276
		bodyModel[233].setRotationPoint(-41F, -13F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[234].setRotationPoint(-41F, -14F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Box 225
		bodyModel[235].setRotationPoint(-41F, -14F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[236].setRotationPoint(-42F, -13F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 314 cull anticlimber
		bodyModel[237].setRotationPoint(-44F, -1F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 315 cull anticlimber
		bodyModel[238].setRotationPoint(-44.5F, -1F, -3F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 80
		bodyModel[239].setRotationPoint(-44.5F, -9F, -3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F); // Box 445 cull anticlimber
		bodyModel[240].setRotationPoint(-44.5F, -1F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 446 cull anticlimber
		bodyModel[241].setRotationPoint(-44.5F, -1F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 447
		bodyModel[242].setRotationPoint(-44.5F, -9F, 3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[243].setRotationPoint(-43.5F, -9F, 8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[244].setRotationPoint(-44.5F, -9F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[245].setRotationPoint(-43.5F, -9F, -8F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 9, 2, 0F); // Box 451
		bodyModel[246].setRotationPoint(-37.5F, -10F, 6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 452
		bodyModel[247].setRotationPoint(-37F, -11F, 6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[248].setRotationPoint(-40.5F, -13.75F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454
		bodyModel[249].setRotationPoint(43.5F, -1F, -3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 455
		bodyModel[250].setRotationPoint(42F, -1F, -8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 456
		bodyModel[251].setRotationPoint(43.5F, -1F, -8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 457
		bodyModel[252].setRotationPoint(43.5F, -1F, 3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[253].setRotationPoint(41.5F, -9F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 459
		bodyModel[254].setRotationPoint(44.5F, -9F, 3F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 460
		bodyModel[255].setRotationPoint(44.5F, -9F, -3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 8, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[256].setRotationPoint(44.5F, -9F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 462
		bodyModel[257].setRotationPoint(41.5F, -9F, -8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463 cull rear headlight holder
		bodyModel[258].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 300
		bodyModel[259].setRotationPoint(-38F, -5F, 11F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 301
		bodyModel[260].setRotationPoint(-38F, -3F, 6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 388
		bodyModel[261].setRotationPoint(-35F, -18F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.84F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.84F, 0F, 0F); // Box 303 cull headlight enclosure
		bodyModel[262].setRotationPoint(-42F, -13F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[263].setRotationPoint(-44.5F, 0F, -2.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 293 b23-7 radi
		bodyModel[264].setRotationPoint(27.75F, -14F, 7.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[265].setRotationPoint(27.75F, -6.5F, 7.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 10, 18, 3, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 11.15F, 0F, 0F, 11.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 11.15F, 0F, 0F, 11.15F); // Box 311
		bodyModel[266].setRotationPoint(7F, -19F, -7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F); // Box 312
		bodyModel[267].setRotationPoint(27.75F, -14F, -8.25F);

		bodyModel[268].addBox(0F, 0F, 0F, 18, 2, 22, 0F); // Box 313
		bodyModel[268].setRotationPoint(-11F, -3F, -11F);

		bodyModel[269].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18 early stack
		bodyModel[269].setRotationPoint(11F, -22.5F, -2.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 29, 2, 22, 0F); // Box 315
		bodyModel[270].setRotationPoint(9F, -1F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, -2F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 316
		bodyModel[271].setRotationPoint(7F, -1F, -11F);
		bodyModel[271].rotateAngleY = 1.57079633F;

		bodyModel[272].addShapeBox(0F, 0F, -2F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 317
		bodyModel[272].setRotationPoint(-9F, -1F, -11F);
		bodyModel[272].rotateAngleY = 1.57079633F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 29, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 318
		bodyModel[273].setRotationPoint(9F, 1F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.125F, 0F, 0.15F, -0.125F, 0F, 0.15F, -0.125F, 0F, 0.15F, -0.125F, 0F, 0.15F, -0.125F); // Box 319 late tank
		bodyModel[274].setRotationPoint(-7F, -1F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, -2F, 18, 3, 2, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 320 late tank
		bodyModel[275].setRotationPoint(-9F, -1F, -9F);
		bodyModel[275].rotateAngleY = 1.57079633F;

		bodyModel[276].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 322
		bodyModel[276].setRotationPoint(-18F, -5F, 7F);

		bodyModel[277].addBox(0F, 0F, 0F, 7, 2, 4, 0F); // Box 323
		bodyModel[277].setRotationPoint(-18F, -3F, -11F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 314
		bodyModel[278].setRotationPoint(-38F, -5F, -11F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 315
		bodyModel[279].setRotationPoint(-38F, -3F, -11F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 15, 1, 0F); // Box 316
		bodyModel[280].setRotationPoint(-14F, -18F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[281].setRotationPoint(-14F, -19F, -8F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 319 flange lubricator 6419
		bodyModel[282].setRotationPoint(-17.5F, -15F, -9.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 320 flange lubricator 6419
		bodyModel[283].setRotationPoint(-18.5F, -15F, -8.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 321 flange lubricator 6419
		bodyModel[284].setRotationPoint(-16.5F, -15F, -8.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 322 flange lubricator bit
		bodyModel[285].setRotationPoint(-18F, -5F, -9F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 323
		bodyModel[286].setRotationPoint(17.5F, -16.5F, 7.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 324
		bodyModel[287].setRotationPoint(17.5F, -5F, -8.25F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 325
		bodyModel[288].setRotationPoint(17.5F, -16.5F, -8.25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 326 why dont you fucking FILTER THE FUCKING BITCHES AGAIN WHY ARE THERE TWO OF THESE WHAT THE FUCK SANTA FE
		bodyModel[289].setRotationPoint(-11.25F, 3F, -10.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 327 interior cab wall
		bodyModel[290].setRotationPoint(-33F, -18F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 11, 13, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328 interior cab wall
		bodyModel[291].setRotationPoint(-33F, -18F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 329
		bodyModel[292].setRotationPoint(-34F, -18F, 11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.4F, 0F, -3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 330
		bodyModel[293].setRotationPoint(-34F, -21F, 7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.4F, 0F, -3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 331
		bodyModel[294].setRotationPoint(-22F, -21F, 7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0.4F, 0F, -1F, 0.4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 332
		bodyModel[295].setRotationPoint(-33F, -19F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 333
		bodyModel[296].setRotationPoint(-37F, -13F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F); // Box 334
		bodyModel[297].setRotationPoint(-36F, -13F, 11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 0, 22, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 335 this is the floor i decree it so
		bodyModel[298].setRotationPoint(-37F, -5.01F, -11F);

		bodyModel[299].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[299].setRotationPoint(-27F, -23.5F, -2.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[300].setRotationPoint(-26F, -24.5F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[301].setRotationPoint(38F, -21F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 12.75F, 0F, 0F, 13F, 0F, 0F, 0F, -0.38F, 0F, -0.25F, -0.38F, 0F, 12.75F, 0F, 0F, 13F); // Box 322
		bodyModel[302].setRotationPoint(38F, -21F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F,-1F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[303].setRotationPoint(38F, -22F, 1F);
		bodyModel[303].rotateAngleY = 1.57079633F;

		bodyModel[304].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, 0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[304].setRotationPoint(39F, -22F, 2F);
		bodyModel[304].rotateAngleY = 1.57079633F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 19, 4, 0F,-0.5F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 325 cull rear ladder
		bodyModel[305].setRotationPoint(39F, -21.5F, -2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 22, 10, 0F,1F, 0F, -5F, -1F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -11F, -5F, -1F, -11F, -5F, 0.5F, -11F, 0F, 0F, -11F, 0F); // Box 327
		bodyModel[306].setRotationPoint(38.5F, -14.5F, -12.25F);

		bodyModel[307].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 329 numberboard rear fictional
		bodyModel[307].setRotationPoint(38.9F, -18F, 7.25F);
		bodyModel[307].rotateAngleY = 0.12217305F;
		bodyModel[307].rotateAngleZ = -0.13962634F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 307 glowey marker fictional
		bodyModel[308].setRotationPoint(-41.15F, -12.7F, -6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 glowey marker fictional
		bodyModel[309].setRotationPoint(-41.15F, -12.7F, 4F);

		bodyModel[310].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 440 honse
		bodyModel[310].setRotationPoint(-42.25F, 0F, -4.5F);
		bodyModel[310].rotateAngleZ = -0.59341195F;

		bodyModel[311].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 333 honse
		bodyModel[311].setRotationPoint(42.25F, 0F, -4.5F);
		bodyModel[311].rotateAngleZ = 0.59341195F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[312].setRotationPoint(-37.25F, -19.25F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[313].setRotationPoint(-37.25F, -21.25F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 288
		bodyModel[314].setRotationPoint(-37.25F, -20.25F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[315].setRotationPoint(-36.75F, -19.25F, -0.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[316].setRotationPoint(-36.75F, -22.25F, -0.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 4, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[317].setRotationPoint(-31F, -22.5F, -9.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 6, 4, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[318].setRotationPoint(-31F, -22.5F, 6.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[319].setRotationPoint(-30.5F, -23.5F, -8F);

		bodyModel[320].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[320].setRotationPoint(-30.5F, -23.5F, 8F);

		bodyModel[321].addBox(0F, 0F, -1F, 13, 1, 1, 0F); // Box 382 cull ptc antenna shiz
		bodyModel[321].setRotationPoint(-27.5F, -22.5F, -6.5F);
		bodyModel[321].rotateAngleY = 1.57079633F;

		bodyModel[322].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 333 cull small beacon holder
		bodyModel[322].setRotationPoint(-35F, -23F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[323].setRotationPoint(-34.5F, -24F, -0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[324].setRotationPoint(-34.5F, -25F, -0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 336
		bodyModel[325].setRotationPoint(-20F, -13F, -11F);

		bodyModel[326].addBox(0F, 0F, 0F, 23, 8, 0, 0F); // Box 337
		bodyModel[326].setRotationPoint(-17F, -11F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 338
		bodyModel[327].setRotationPoint(6F, -11F, -11.01F);

		bodyModel[328].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 339
		bodyModel[328].setRotationPoint(-8F, -11F, 11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 340
		bodyModel[329].setRotationPoint(6F, -11F, 11.01F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 341
		bodyModel[330].setRotationPoint(-10F, -13F, 11.01F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[331].setRotationPoint(-42.5F, 1F, -7.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f1
		bodyModel[332].setRotationPoint(-42.75F, 1F, -7.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[333].setRotationPoint(-42.5F, 1F, 5.75F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f1
		bodyModel[334].setRotationPoint(-42.75F, 1F, 5.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[335].setRotationPoint(42F, 1F, -7.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r1
		bodyModel[336].setRotationPoint(42.25F, 1F, -7.75F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[337].setRotationPoint(42F, 1F, 5.75F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r1
		bodyModel[338].setRotationPoint(42.25F, 1F, 5.75F);

		bodyModel[339].addBox(0F, 0F, 0F, 18, 2, 22, 0F); // Box 350 regulah frame for regulah people
		bodyModel[339].setRotationPoint(-9F, -1F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 16, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351 regulah frame for regulah people
		bodyModel[340].setRotationPoint(-7F, 1F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, -2F, 22, 3, 2, 0F,-0.125F, -0.15F, 0F, -0.125F, -0.15F, 0F, -0.125F, -0.15F, 0F, -0.125F, -0.15F, 0F, -0.125F, 0.15F, 0F, -0.125F, 0.15F, 0F, -0.125F, 0.15F, 0F, -0.125F, 0.15F, 0F); // Box 352 EARLY MASSIVE TANK
		bodyModel[341].setRotationPoint(-9F, -1F, -11F);
		bodyModel[341].rotateAngleY = 1.57079633F;

		bodyModel[342].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 353 fule filler EARLY
		bodyModel[342].setRotationPoint(-8.5F, -3.5F, 11F);
		bodyModel[342].rotateAngleX = -1.11701072F;

		bodyModel[343].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 354 fuel filler EARLY
		bodyModel[343].setRotationPoint(-8.5F, -3.5F, -11F);
		bodyModel[343].rotateAngleX = 1.11701072F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F); // Box 356
		bodyModel[344].setRotationPoint(44.5F, 0F, -2.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F); // Box 357
		bodyModel[345].setRotationPoint(-21F, -13F, 11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 22, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -5F, 1F, 0F, -5F, 0F, -11F, 0F, 0.5F, -11F, 0F, -1F, -11F, -5F, 1F, -11F, -5F); // Box 347
		bodyModel[346].setRotationPoint(38.5F, -14.5F, 2.25F);

		bodyModel[347].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 348
		bodyModel[347].setRotationPoint(-30F, -16F, -12.4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[348].setRotationPoint(-26F, -26F, -1F);
	}

	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1 || GetColor(entity) == 116) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 4 || GetColor(entity) == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 || GetColor(entity) == 12
				|| GetColor(entity) == 14){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}