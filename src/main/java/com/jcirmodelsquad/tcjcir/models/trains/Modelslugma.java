//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SlugMA
// Model Creator: biba
// Created on: 03.12.2022 - 11:02:37
// Last changed on: 03.12.2022 - 11:02:37

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

public class Modelslugma extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelslugma() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[233];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 174, textureX, textureY); // Box 266
		bodyModel[1] = new ModelRendererTurbo(this, 48, 165, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 48, 156, textureX, textureY); // Box 47
		bodyModel[3] = new ModelRendererTurbo(this, 53, 172, textureX, textureY); // Box 48
		bodyModel[4] = new ModelRendererTurbo(this, 53, 163, textureX, textureY); // Box 49
		bodyModel[5] = new ModelRendererTurbo(this, 263, 229, textureX, textureY); // Box 486
		bodyModel[6] = new ModelRendererTurbo(this, 263, 217, textureX, textureY); // Box 487
		bodyModel[7] = new ModelRendererTurbo(this, 251, 236, textureX, textureY); // Box 488
		bodyModel[8] = new ModelRendererTurbo(this, 263, 224, textureX, textureY); // Box 489
		bodyModel[9] = new ModelRendererTurbo(this, 263, 212, textureX, textureY); // Box 805
		bodyModel[10] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[12] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[13] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 498
		bodyModel[16] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 430
		bodyModel[17] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 431
		bodyModel[18] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 432
		bodyModel[19] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 433
		bodyModel[20] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[21] = new ModelRendererTurbo(this, 257, 200, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[24] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[26] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[28] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[30] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[31] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[32] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[33] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[35] = new ModelRendererTurbo(this, 261, 191, textureX, textureY); // Box 490
		bodyModel[36] = new ModelRendererTurbo(this, 268, 191, textureX, textureY); // Box 330
		bodyModel[37] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 331
		bodyModel[38] = new ModelRendererTurbo(this, 434, 250, textureX, textureY); // Box 332
		bodyModel[39] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 339
		bodyModel[40] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 340
		bodyModel[41] = new ModelRendererTurbo(this, 268, 183, textureX, textureY); // Box 342
		bodyModel[42] = new ModelRendererTurbo(this, 261, 183, textureX, textureY); // Box 343
		bodyModel[43] = new ModelRendererTurbo(this, 315, 183, textureX, textureY); // Box 345
		bodyModel[44] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 346
		bodyModel[45] = new ModelRendererTurbo(this, 8, 203, textureX, textureY); // Box 3
		bodyModel[46] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 271
		bodyModel[47] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 272
		bodyModel[48] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 273
		bodyModel[49] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 276
		bodyModel[50] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 271
		bodyModel[51] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 272
		bodyModel[52] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 273
		bodyModel[53] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 274
		bodyModel[54] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 275
		bodyModel[55] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 276
		bodyModel[56] = new ModelRendererTurbo(this, 5, 220, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 115, 242, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 52, 219, textureX, textureY); // Box 209
		bodyModel[61] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 210
		bodyModel[62] = new ModelRendererTurbo(this, 52, 212, textureX, textureY); // Box 211
		bodyModel[63] = new ModelRendererTurbo(this, 12, 198, textureX, textureY); // Box 214
		bodyModel[64] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 143
		bodyModel[65] = new ModelRendererTurbo(this, 5, 213, textureX, textureY); // Box 143
		bodyModel[66] = new ModelRendererTurbo(this, 49, 228, textureX, textureY); // Box 334
		bodyModel[67] = new ModelRendererTurbo(this, 5, 228, textureX, textureY); // Box 335
		bodyModel[68] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[69] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[70] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[71] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[72] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[73] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[74] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 275
		bodyModel[75] = new ModelRendererTurbo(this, 144, 203, textureX, textureY); // Box 3
		bodyModel[76] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 5
		bodyModel[77] = new ModelRendererTurbo(this, 185, 220, textureX, textureY); // Box 61
		bodyModel[78] = new ModelRendererTurbo(this, 141, 220, textureX, textureY); // Box 63
		bodyModel[79] = new ModelRendererTurbo(this, 127, 242, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 148, 198, textureX, textureY); // Box 364
		bodyModel[81] = new ModelRendererTurbo(this, 188, 220, textureX, textureY); // Box 365
		bodyModel[82] = new ModelRendererTurbo(this, 188, 213, textureX, textureY); // Box 366
		bodyModel[83] = new ModelRendererTurbo(this, 141, 213, textureX, textureY); // Box 143
		bodyModel[84] = new ModelRendererTurbo(this, 185, 213, textureX, textureY); // Box 143
		bodyModel[85] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 336
		bodyModel[86] = new ModelRendererTurbo(this, 141, 228, textureX, textureY); // Box 337
		bodyModel[87] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[88] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[89] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[90] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[91] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[92] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[93] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[94] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[95] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[96] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[97] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[98] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[99] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[100] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[101] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[102] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[103] = new ModelRendererTurbo(this, 472, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[104] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[105] = new ModelRendererTurbo(this, 239, 140, textureX, textureY); // Box 344
		bodyModel[106] = new ModelRendererTurbo(this, 218, 157, textureX, textureY); // Box 345 gp16 cutback frontbit
		bodyModel[107] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 346 gp16 cutback frontbit
		bodyModel[108] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 131
		bodyModel[109] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 343, 40, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 135
		bodyModel[113] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[114] = new ModelRendererTurbo(this, 199, 161, textureX, textureY); // Box 139
		bodyModel[115] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 140
		bodyModel[116] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 141
		bodyModel[117] = new ModelRendererTurbo(this, 199, 149, textureX, textureY); // Box 142
		bodyModel[118] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 370
		bodyModel[119] = new ModelRendererTurbo(this, 205, 157, textureX, textureY); // Box 374
		bodyModel[120] = new ModelRendererTurbo(this, 188, 160, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 188, 148, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[123] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[124] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[125] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[126] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[127] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[128] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[129] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[130] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[131] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[132] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[133] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[134] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[135] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[136] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[137] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[138] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[139] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[140] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[141] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[142] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[143] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 350
		bodyModel[144] = new ModelRendererTurbo(this, 103, 97, textureX, textureY); // Box 351
		bodyModel[145] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Box 352
		bodyModel[146] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 353
		bodyModel[147] = new ModelRendererTurbo(this, 108, 103, textureX, textureY); // Box 357
		bodyModel[148] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[149] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 216
		bodyModel[150] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[151] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 311
		bodyModel[152] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[153] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 190
		bodyModel[154] = new ModelRendererTurbo(this, 381, 126, textureX, textureY); // Box 457
		bodyModel[155] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[156] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[157] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[158] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[159] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[160] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[161] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 117 numberboard front high
		bodyModel[162] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 118 numberboard front high
		bodyModel[163] = new ModelRendererTurbo(this, 117, 61, textureX, textureY); // Box 163
		bodyModel[164] = new ModelRendererTurbo(this, 349, 49, textureX, textureY); // Box 164
		bodyModel[165] = new ModelRendererTurbo(this, 349, 49, textureX, textureY); // Box 165
		bodyModel[166] = new ModelRendererTurbo(this, 388, 49, textureX, textureY); // Box 166
		bodyModel[167] = new ModelRendererTurbo(this, 388, 49, textureX, textureY); // Box 167
		bodyModel[168] = new ModelRendererTurbo(this, 64, 107, textureX, textureY); // Box 364 prime base
		bodyModel[169] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[170] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[171] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[172] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[173] = new ModelRendererTurbo(this, 62, 111, textureX, textureY, "cull"); // Box 173 cull
		bodyModel[174] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 336
		bodyModel[175] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam front
		bodyModel[176] = new ModelRendererTurbo(this, 39, 95, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam front
		bodyModel[177] = new ModelRendererTurbo(this, 444, 141, textureX, textureY); // Box 336
		bodyModel[178] = new ModelRendererTurbo(this, 464, 143, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam rear
		bodyModel[179] = new ModelRendererTurbo(this, 457, 143, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam rear
		bodyModel[180] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[181] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[182] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[183] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[184] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[185] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[186] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[187] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[188] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[189] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[190] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[191] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[192] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[193] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[194] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[195] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[196] = new ModelRendererTurbo(this, 66, 93, textureX, textureY); // Box 372
		bodyModel[197] = new ModelRendererTurbo(this, 61, 95, textureX, textureY, "cull"); // Box 369 cull
		bodyModel[198] = new ModelRendererTurbo(this, 84, 72, textureX, textureY); // Box 392
		bodyModel[199] = new ModelRendererTurbo(this, 85, 62, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[200] = new ModelRendererTurbo(this, 85, 80, textureX, textureY); // Box 392
		bodyModel[201] = new ModelRendererTurbo(this, 75, 72, textureX, textureY); // Box 392 Santa Fe connector
		bodyModel[202] = new ModelRendererTurbo(this, 76, 80, textureX, textureY); // Box 392 Santa Fe connector
		bodyModel[203] = new ModelRendererTurbo(this, 76, 62, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[204] = new ModelRendererTurbo(this, 76, 67, textureX, textureY); // Box 204
		bodyModel[205] = new ModelRendererTurbo(this, 85, 67, textureX, textureY); // Box 205
		bodyModel[206] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 246 roof air tank
		bodyModel[207] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 249 roof air tank
		bodyModel[208] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 250
		bodyModel[209] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 251
		bodyModel[210] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 252
		bodyModel[211] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 253
		bodyModel[212] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 578
		bodyModel[213] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 579
		bodyModel[214] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 580
		bodyModel[215] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 581
		bodyModel[216] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 582
		bodyModel[217] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 583
		bodyModel[218] = new ModelRendererTurbo(this, 52, 78, textureX, textureY); // Box 383
		bodyModel[219] = new ModelRendererTurbo(this, 52, 94, textureX, textureY); // Box 384
		bodyModel[220] = new ModelRendererTurbo(this, 52, 85, textureX, textureY); // Box 385
		bodyModel[221] = new ModelRendererTurbo(this, 52, 88, textureX, textureY); // Box 386
		bodyModel[222] = new ModelRendererTurbo(this, 66, 77, textureX, textureY); // Box 312
		bodyModel[223] = new ModelRendererTurbo(this, 63, 77, textureX, textureY); // Box 313
		bodyModel[224] = new ModelRendererTurbo(this, 52, 81, textureX, textureY, BoxName.commander); // Box 315 glow commander beacon
		bodyModel[225] = new ModelRendererTurbo(this, 52, 91, textureX, textureY); // Box 316
		bodyModel[226] = new ModelRendererTurbo(this, 60, 77, textureX, textureY); // Box 226
		bodyModel[227] = new ModelRendererTurbo(this, 57, 77, textureX, textureY); // Box 227
		bodyModel[228] = new ModelRendererTurbo(this, 57, 81, textureX, textureY, BoxName.commander); // Box 228
		bodyModel[229] = new ModelRendererTurbo(this, 52, 97, textureX, textureY); // Box 229
		bodyModel[230] = new ModelRendererTurbo(this, 133, 48, textureX, textureY); // Box 42
		bodyModel[231] = new ModelRendererTurbo(this, 102, 35, textureX, textureY); // Box 231
		bodyModel[232] = new ModelRendererTurbo(this, 102, 47, textureX, textureY); // Box 232

		bodyModel[0].addBox(0F, 0F, 0F, 75, 2, 12, 0F); // Box 266
		bodyModel[0].setRotationPoint(-37F, 1F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 1
		bodyModel[1].setRotationPoint(-33F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 47
		bodyModel[2].setRotationPoint(-33F, 1F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 48
		bodyModel[3].setRotationPoint(-33F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 49
		bodyModel[4].setRotationPoint(-33F, 2F, 11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[5].setRotationPoint(-10F, 6F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[6].setRotationPoint(-10F, 6F, 7.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 14, 4, 15, 0F); // Box 488
		bodyModel[7].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 489
		bodyModel[8].setRotationPoint(-10F, 5F, -10.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 805
		bodyModel[9].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[10].setRotationPoint(-10F, 3F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[11].setRotationPoint(-14F, 3F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[12].setRotationPoint(-14F, 3F, 5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[13].setRotationPoint(11F, 3F, 5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[14].setRotationPoint(11F, 3F, -6F);

		bodyModel[15].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[15].setRotationPoint(9.5F, 6.5F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 430
		bodyModel[16].setRotationPoint(5.5F, 3F, -10.01F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 431
		bodyModel[17].setRotationPoint(9F, 3F, -10.01F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 432
		bodyModel[18].setRotationPoint(9F, 3F, 10.01F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 433
		bodyModel[19].setRotationPoint(5.5F, 3F, 10.01F);

		bodyModel[20].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[20].setRotationPoint(-10F, 3F, 5F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 78
		bodyModel[21].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[22].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[23].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[24].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[25].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[26].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[27].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[28].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[29].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[30].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[31].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[32].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[34].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[35].setRotationPoint(-14F, 3F, 11F);

		bodyModel[36].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[36].setRotationPoint(-11F, 3F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[37].setRotationPoint(12F, 3F, 11F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[38].setRotationPoint(5.75F, 6F, -10.01F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 339
		bodyModel[39].setRotationPoint(9F, 3F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 340
		bodyModel[40].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[41].setRotationPoint(-11F, 3F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[42].setRotationPoint(-14F, 3F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[43].setRotationPoint(12F, 3F, -11F);

		bodyModel[44].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 346
		bodyModel[44].setRotationPoint(6F, 6.5F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[45].setRotationPoint(-37.01F, 1F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[46].setRotationPoint(-37F, 1F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[47].setRotationPoint(-37F, 8F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[48].setRotationPoint(-37F, 5F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[49].setRotationPoint(-37F, 4F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[50].setRotationPoint(-37F, 1F, 6F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[51].setRotationPoint(-37F, 8F, 8F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[52].setRotationPoint(-37F, 5F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[53].setRotationPoint(-37F, 3F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[54].setRotationPoint(-37F, 7F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[55].setRotationPoint(-37F, 4F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[56].setRotationPoint(-37F, -1F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[57].setRotationPoint(-37F, -1F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[58].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[59].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[60].setRotationPoint(-33F, 2F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[61].setRotationPoint(-37F, 3F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[62].setRotationPoint(-33F, 2F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[63].setRotationPoint(-37F, -7F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[64].setRotationPoint(-37F, -7F, -10F);
		bodyModel[64].rotateAngleY = -3.14159265F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[65].setRotationPoint(-37F, -7F, 11F);
		bodyModel[65].rotateAngleY = -3.14159265F;

		bodyModel[66].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 334
		bodyModel[66].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 335
		bodyModel[67].setRotationPoint(-37.01F, 7F, 10F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[68].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[69].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[70].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[71].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[72].setRotationPoint(-37F, 2F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[73].setRotationPoint(-37F, 2F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[74].setRotationPoint(-37F, 7F, -8F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[75].setRotationPoint(38.01F, 1F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[76].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[77].setRotationPoint(38F, -1F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[78].setRotationPoint(38F, -1F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[79].setRotationPoint(38F, 2.5F, -2F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[80].setRotationPoint(38F, -7F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[81].setRotationPoint(34F, 2F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[82].setRotationPoint(34F, 2F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[83].setRotationPoint(38F, -7F, -10F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[84].setRotationPoint(38F, -7F, 11F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 336
		bodyModel[85].setRotationPoint(38.01F, 7F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 337
		bodyModel[86].setRotationPoint(38.01F, 7F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[87].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[88].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[89].setRotationPoint(34F, 5F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[90].setRotationPoint(34F, 7F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[91].setRotationPoint(34F, 8F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[92].setRotationPoint(34F, 4F, -7F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[93].setRotationPoint(34F, 2F, -7F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[94].setRotationPoint(34F, 3F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[95].setRotationPoint(34F, 1F, -8F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[96].setRotationPoint(34F, 7F, 8F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[97].setRotationPoint(34F, 8F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[98].setRotationPoint(34F, 5F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[99].setRotationPoint(34F, 4F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[100].setRotationPoint(34F, 3F, 7F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[101].setRotationPoint(34F, 2F, 7F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[102].setRotationPoint(34F, 1F, 6F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[103].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[104].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[105].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[105].setRotationPoint(-22F, -4F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 345 gp16 cutback frontbit
		bodyModel[106].setRotationPoint(-28F, -4F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 346 gp16 cutback frontbit
		bodyModel[107].setRotationPoint(-28F, -4F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[108].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[108].rotateAngleY = -3.14159265F;

		bodyModel[109].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[109].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[110].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[111].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[112].setRotationPoint(-33.01F, -12F, 11.02F);
		bodyModel[112].rotateAngleY = -3.14159265F;

		bodyModel[113].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[113].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[114].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[115].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[116].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[117].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 370
		bodyModel[118].setRotationPoint(-30F, -4F, 7F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 374
		bodyModel[119].setRotationPoint(-30F, -4F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[120].setRotationPoint(-32F, -1F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[121].setRotationPoint(-32F, -1F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[122].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[122].rotateAngleY = -1.11701072F;

		bodyModel[123].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[123].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[123].rotateAngleY = -1.11701072F;

		bodyModel[124].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[124].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[125].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[126].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[127].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[128].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[129].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[129].setRotationPoint(-10F, -4F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[130].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[131].setRotationPoint(-10F, -4F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[132].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[133].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[133].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[134].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[135].setRotationPoint(32F, -11F, -7F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 220
		bodyModel[136].setRotationPoint(32F, -11F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[137].setRotationPoint(32F, -11F, 1F);

		bodyModel[138].addBox(0F, 0F, 0F, 42, 12, 14, 0F); // Box 223
		bodyModel[138].setRotationPoint(-10F, -11F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[139].setRotationPoint(34.75F, -10F, -1F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[140].setRotationPoint(34.5F, -10F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[141].setRotationPoint(34.5F, -8F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[142].setRotationPoint(34.75F, -8F, -1F);

		bodyModel[143].addBox(0F, 0F, 0F, 9, 12, 14, 0F); // Box 350
		bodyModel[143].setRotationPoint(-31F, -11F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[144].setRotationPoint(-34F, -11F, -7F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 352
		bodyModel[145].setRotationPoint(-34F, -11F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[146].setRotationPoint(-34F, -11F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 357
		bodyModel[147].setRotationPoint(-32F, -10F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[148].setRotationPoint(-35.25F, -10F, -1F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[149].setRotationPoint(-34.5F, -10F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[150].setRotationPoint(-35.25F, -8F, -1F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[151].setRotationPoint(-34.5F, -8F, -1F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[152].setRotationPoint(31F, -11.5F, -1F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[153].setRotationPoint(-32F, -11.5F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 457
		bodyModel[154].setRotationPoint(32F, -10F, -7F);

		bodyModel[155].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[155].setRotationPoint(32.55F, -8.5F, -6F);
		bodyModel[155].rotateAngleY = -0.46687557F;

		bodyModel[156].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[156].setRotationPoint(32.55F, -8.5F, 6F);
		bodyModel[156].rotateAngleY = 0.46687557F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[157].setRotationPoint(-32F, -10F, -6.51F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[158].setRotationPoint(-32F, -10F, 6.51F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[159].setRotationPoint(32F, -10F, -6.51F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[160].setRotationPoint(32F, -10F, 6.51F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 numberboard front high
		bodyModel[161].setRotationPoint(-31.55F, -8.5F, -6F);
		bodyModel[161].rotateAngleY = 0.46687557F;

		bodyModel[162].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 numberboard front high
		bodyModel[162].setRotationPoint(-31.55F, -8.5F, 6F);
		bodyModel[162].rotateAngleY = -0.46687557F;

		bodyModel[163].addBox(0F, 0F, 0F, 12, 12, 14, 0F); // Box 163
		bodyModel[163].setRotationPoint(-22F, -11F, -7F);

		bodyModel[164].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 164
		bodyModel[164].setRotationPoint(-22F, -12F, -11.01F);

		bodyModel[165].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 165
		bodyModel[165].setRotationPoint(-22F, -12F, 11.01F);

		bodyModel[166].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 166
		bodyModel[166].setRotationPoint(-34F, -7F, -11.01F);

		bodyModel[167].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 167
		bodyModel[167].setRotationPoint(-34F, -7F, 11.01F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[168].setRotationPoint(-17F, -15F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[169].setRotationPoint(-17F, -15.5F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[170].setRotationPoint(-17F, -15.5F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[171].setRotationPoint(-17F, -15.5F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[172].setRotationPoint(-17F, -15.5F, -1F);

		bodyModel[173].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 173 cull
		bodyModel[173].setRotationPoint(-17.5F, -14F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[174].setRotationPoint(-34.5F, -13F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam front
		bodyModel[175].setRotationPoint(-35.25F, -13F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam front
		bodyModel[176].setRotationPoint(-35.25F, -13F, -2F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[177].setRotationPoint(33.5F, -13F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam rear
		bodyModel[178].setRotationPoint(35.25F, -13F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam rear
		bodyModel[179].setRotationPoint(35.25F, -13F, -2F);

		bodyModel[180].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[180].setRotationPoint(-3.5F, -12.5F, -3.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[181].setRotationPoint(-4F, -12F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[182].setRotationPoint(-4F, -10F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[183].setRotationPoint(-8F, -10F, 7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[184].setRotationPoint(4F, -10F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[185].setRotationPoint(-4F, -12F, 7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[186].setRotationPoint(-8F, -12F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[187].setRotationPoint(4F, -12F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[188].setRotationPoint(-4F, -12F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[189].setRotationPoint(4F, -12F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[190].setRotationPoint(4F, -10F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[191].setRotationPoint(-4F, -10F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[192].setRotationPoint(-8F, -10F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[193].setRotationPoint(-8F, -12F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[194].setRotationPoint(-4F, -10.5F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[195].setRotationPoint(-4F, -10.5F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[196].setRotationPoint(-26F, -14F, 4F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 369 cull
		bodyModel[197].setRotationPoint(-26F, -13F, 2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[198].setRotationPoint(37F, -4F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[199].setRotationPoint(38.25F, -4F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[200].setRotationPoint(38F, 1F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 392 Santa Fe connector
		bodyModel[201].setRotationPoint(-38F, -4F, 4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 392 Santa Fe connector
		bodyModel[202].setRotationPoint(-38F, 1F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[203].setRotationPoint(-38.25F, -4F, 4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 204
		bodyModel[204].setRotationPoint(-38.25F, -2F, 4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 205
		bodyModel[205].setRotationPoint(38.25F, -2F, -6F);

		bodyModel[206].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[206].setRotationPoint(-9.5F, -13.5F, -7F);

		bodyModel[207].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[207].setRotationPoint(-9.5F, -13.5F, 5F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[208].setRotationPoint(-9.51F, -13F, -6.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[209].setRotationPoint(-9.51F, -13F, 5.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[210].setRotationPoint(9.51F, -13F, 5.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[211].setRotationPoint(9.51F, -13F, -6.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 578
		bodyModel[212].setRotationPoint(-9.51F, -13F, -4.25F);

		bodyModel[213].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 579
		bodyModel[213].setRotationPoint(-9.5F, -13.5F, -4.75F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 580
		bodyModel[214].setRotationPoint(9.51F, -13F, -4.25F);

		bodyModel[215].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 581
		bodyModel[215].setRotationPoint(-9.5F, -13.5F, 2.75F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 582
		bodyModel[216].setRotationPoint(-9.51F, -13F, 3.25F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 583
		bodyModel[217].setRotationPoint(9.51F, -13F, 3.25F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[218].setRotationPoint(31.05F, -12F, 4.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[219].setRotationPoint(30.55F, -13F, 3.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[220].setRotationPoint(30.05F, -13F, 4.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[221].setRotationPoint(31.3F, -13F, 5.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 312
		bodyModel[222].setRotationPoint(29F, -14F, -0.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 313
		bodyModel[223].setRotationPoint(29F, -14F, 0.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow commander beacon
		bodyModel[224].setRotationPoint(29.03F, -16F, -0.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[225].setRotationPoint(29.18F, -15F, -0.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 226
		bodyModel[226].setRotationPoint(-29F, -14F, -0.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 227
		bodyModel[227].setRotationPoint(-29F, -14F, 0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 228
		bodyModel[228].setRotationPoint(-28.97F, -16F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 229
		bodyModel[229].setRotationPoint(-28.82F, -15F, -0.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 9, 5, 6, 0F); // Box 42
		bodyModel[230].setRotationPoint(-10F, 4F, -10F);

		bodyModel[231].addBox(0F, 0F, 0F, 9, 5, 6, 0F); // Box 231
		bodyModel[231].setRotationPoint(-10F, 4F, 4F);

		bodyModel[232].addBox(0F, 0F, 0F, 9, 6, 6, 0F); // Box 232
		bodyModel[232].setRotationPoint(-10F, 3F, -3F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 15 || GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver_SINGLESHOE.png"));
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