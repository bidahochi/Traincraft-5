//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GPFDL
// Model Creator: bida
// Created on: 30.09.2023 - 12:59:13
// Last changed on: 30.09.2023 - 12:59:13

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

public class ModelGPFDL extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGPFDL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[392];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 203, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 271
		bodyModel[2] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 272
		bodyModel[3] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 273
		bodyModel[4] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 275
		bodyModel[5] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 276
		bodyModel[6] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 271
		bodyModel[7] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 272
		bodyModel[8] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 273
		bodyModel[9] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 274
		bodyModel[10] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 275
		bodyModel[11] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 276
		bodyModel[12] = new ModelRendererTurbo(this, 5, 220, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 115, 242, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 144, 203, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 33, 174, textureX, textureY); // Box 266
		bodyModel[18] = new ModelRendererTurbo(this, 120, 236, textureX, textureY); // Box 5
		bodyModel[19] = new ModelRendererTurbo(this, 185, 220, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 141, 220, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 127, 242, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 52, 219, textureX, textureY); // Box 209
		bodyModel[23] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 210
		bodyModel[24] = new ModelRendererTurbo(this, 52, 212, textureX, textureY); // Box 211
		bodyModel[25] = new ModelRendererTurbo(this, 12, 198, textureX, textureY); // Box 214
		bodyModel[26] = new ModelRendererTurbo(this, 148, 198, textureX, textureY); // Box 364
		bodyModel[27] = new ModelRendererTurbo(this, 188, 220, textureX, textureY); // Box 365
		bodyModel[28] = new ModelRendererTurbo(this, 188, 213, textureX, textureY); // Box 366
		bodyModel[29] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 143
		bodyModel[30] = new ModelRendererTurbo(this, 5, 213, textureX, textureY); // Box 143
		bodyModel[31] = new ModelRendererTurbo(this, 141, 213, textureX, textureY); // Box 143
		bodyModel[32] = new ModelRendererTurbo(this, 185, 213, textureX, textureY); // Box 143
		bodyModel[33] = new ModelRendererTurbo(this, 48, 165, textureX, textureY); // Box 1
		bodyModel[34] = new ModelRendererTurbo(this, 48, 156, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 53, 172, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 53, 163, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[39] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[40] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[47] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[48] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[49] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[50] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[51] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[52] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[53] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[54] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[56] = new ModelRendererTurbo(this, 261, 191, textureX, textureY); // Box 490
		bodyModel[57] = new ModelRendererTurbo(this, 268, 191, textureX, textureY); // Box 330
		bodyModel[58] = new ModelRendererTurbo(this, 315, 191, textureX, textureY); // Box 331
		bodyModel[59] = new ModelRendererTurbo(this, 49, 228, textureX, textureY); // Box 334
		bodyModel[60] = new ModelRendererTurbo(this, 5, 228, textureX, textureY); // Box 335
		bodyModel[61] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 336
		bodyModel[62] = new ModelRendererTurbo(this, 141, 228, textureX, textureY); // Box 337
		bodyModel[63] = new ModelRendererTurbo(this, 268, 183, textureX, textureY); // Box 342
		bodyModel[64] = new ModelRendererTurbo(this, 261, 183, textureX, textureY); // Box 343
		bodyModel[65] = new ModelRendererTurbo(this, 315, 183, textureX, textureY); // Box 345
		bodyModel[66] = new ModelRendererTurbo(this, 239, 140, textureX, textureY); // Box 344
		bodyModel[67] = new ModelRendererTurbo(this, 214, 157, textureX, textureY); // Box 345 gp16 cutback frontbit
		bodyModel[68] = new ModelRendererTurbo(this, 214, 145, textureX, textureY); // Box 346 gp16 cutback frontbit
		bodyModel[69] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 131
		bodyModel[70] = new ModelRendererTurbo(this, 349, 40, textureX, textureY); // Box 132
		bodyModel[71] = new ModelRendererTurbo(this, 343, 40, textureX, textureY); // Box 133
		bodyModel[72] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 135
		bodyModel[74] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[75] = new ModelRendererTurbo(this, 199, 161, textureX, textureY); // Box 139
		bodyModel[76] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 140
		bodyModel[77] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 141
		bodyModel[78] = new ModelRendererTurbo(this, 199, 149, textureX, textureY); // Box 142
		bodyModel[79] = new ModelRendererTurbo(this, 103, 120, textureX, textureY); // Box 216
		bodyModel[80] = new ModelRendererTurbo(this, 73, 120, textureX, textureY); // Box 217
		bodyModel[81] = new ModelRendererTurbo(this, 92, 124, textureX, textureY); // Box 218
		bodyModel[82] = new ModelRendererTurbo(this, 125, 112, textureX, textureY); // Box 367
		bodyModel[83] = new ModelRendererTurbo(this, 125, 89, textureX, textureY); // Box 350
		bodyModel[84] = new ModelRendererTurbo(this, 103, 97, textureX, textureY); // Box 351
		bodyModel[85] = new ModelRendererTurbo(this, 92, 101, textureX, textureY); // Box 352
		bodyModel[86] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 353
		bodyModel[87] = new ModelRendererTurbo(this, 108, 97, textureX, textureY); // Box 357
		bodyModel[88] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 117 numberboard front high
		bodyModel[89] = new ModelRendererTurbo(this, 91, 93, textureX, textureY, "lamp"); // Box 118 numberboard front high
		bodyModel[90] = new ModelRendererTurbo(this, 32, 120, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[91] = new ModelRendererTurbo(this, 25, 120, textureX, textureY); // Box 216
		bodyModel[92] = new ModelRendererTurbo(this, 32, 125, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[93] = new ModelRendererTurbo(this, 25, 125, textureX, textureY); // Box 311
		bodyModel[94] = new ModelRendererTurbo(this, 188, 160, textureX, textureY); // Box 137
		bodyModel[95] = new ModelRendererTurbo(this, 188, 148, textureX, textureY); // Box 138
		bodyModel[96] = new ModelRendererTurbo(this, 2, 97, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[97] = new ModelRendererTurbo(this, 2, 91, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[98] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 218, 45, textureX, textureY); // Box 125
		bodyModel[100] = new ModelRendererTurbo(this, 308, 89, textureX, textureY); // Box 9
		bodyModel[101] = new ModelRendererTurbo(this, 235, 89, textureX, textureY); // Box 10
		bodyModel[102] = new ModelRendererTurbo(this, 185, 72, textureX, textureY); // Box 15
		bodyModel[103] = new ModelRendererTurbo(this, 258, 72, textureX, textureY); // Box 21
		bodyModel[104] = new ModelRendererTurbo(this, 297, 86, textureX, textureY); // Box 314 door swing right
		bodyModel[105] = new ModelRendererTurbo(this, 224, 86, textureX, textureY); // Box 315 door swing right
		bodyModel[106] = new ModelRendererTurbo(this, 258, 45, textureX, textureY); // Box 371
		bodyModel[107] = new ModelRendererTurbo(this, 218, 76, textureX, textureY); // Box 372
		bodyModel[108] = new ModelRendererTurbo(this, 258, 76, textureX, textureY); // Box 373
		bodyModel[109] = new ModelRendererTurbo(this, 229, 45, textureX, textureY); // Box 374
		bodyModel[110] = new ModelRendererTurbo(this, 152, 54, textureX, textureY); // Box 411
		bodyModel[111] = new ModelRendererTurbo(this, 189, 54, textureX, textureY); // Box 412
		bodyModel[112] = new ModelRendererTurbo(this, 226, 68, textureX, textureY); // Box 39
		bodyModel[113] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 347
		bodyModel[114] = new ModelRendererTurbo(this, 226, 53, textureX, textureY); // Box 348
		bodyModel[115] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[116] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[117] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[118] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[119] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[120] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[121] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[122] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[123] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[124] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[125] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[128] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[129] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[130] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[131] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[132] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[133] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[134] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[135] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 186
		bodyModel[136] = new ModelRendererTurbo(this, 389, 99, textureX, textureY); // Box 187
		bodyModel[137] = new ModelRendererTurbo(this, 437, 97, textureX, textureY); // Box 188
		bodyModel[138] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 189
		bodyModel[139] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[140] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 190
		bodyModel[141] = new ModelRendererTurbo(this, 413, 86, textureX, textureY, "cull"); // Box 196 winterization hatch EXTRA THICC
		bodyModel[142] = new ModelRendererTurbo(this, 421, 67, textureX, textureY, "cull"); // Box 196 winterization hatch tall
		bodyModel[143] = new ModelRendererTurbo(this, 421, 77, textureX, textureY, "cull"); // Box 196 winterization hatch smol
		bodyModel[144] = new ModelRendererTurbo(this, 364, 4, textureX, textureY); // Box 236
		bodyModel[145] = new ModelRendererTurbo(this, 364, 7, textureX, textureY); // Box 237
		bodyModel[146] = new ModelRendererTurbo(this, 381, 126, textureX, textureY); // Box 457
		bodyModel[147] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[148] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[149] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[150] = new ModelRendererTurbo(this, 379, 42, textureX, textureY); // Box 313
		bodyModel[151] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[152] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[153] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[154] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[155] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[156] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[157] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[158] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[159] = new ModelRendererTurbo(this, 433, 160, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[160] = new ModelRendererTurbo(this, 426, 160, textureX, textureY); // Box 360
		bodyModel[161] = new ModelRendererTurbo(this, 426, 165, textureX, textureY); // Box 222
		bodyModel[162] = new ModelRendererTurbo(this, 433, 165, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[163] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[164] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[165] = new ModelRendererTurbo(this, 351, 14, textureX, textureY); // Box 207
		bodyModel[166] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Box 208
		bodyModel[167] = new ModelRendererTurbo(this, 351, 11, textureX, textureY); // Box 209
		bodyModel[168] = new ModelRendererTurbo(this, 351, 20, textureX, textureY); // Box 210
		bodyModel[169] = new ModelRendererTurbo(this, 338, 4, textureX, textureY); // Box 361
		bodyModel[170] = new ModelRendererTurbo(this, 338, 10, textureX, textureY); // Box 362
		bodyModel[171] = new ModelRendererTurbo(this, 338, 1, textureX, textureY); // Box 363
		bodyModel[172] = new ModelRendererTurbo(this, 338, 7, textureX, textureY); // Box 364
		bodyModel[173] = new ModelRendererTurbo(this, 280, 26, textureX, textureY); // Box 192
		bodyModel[174] = new ModelRendererTurbo(this, 280, 23, textureX, textureY); // Box 193
		bodyModel[175] = new ModelRendererTurbo(this, 280, 17, textureX, textureY); // Box 194
		bodyModel[176] = new ModelRendererTurbo(this, 280, 20, textureX, textureY); // Box 195
		bodyModel[177] = new ModelRendererTurbo(this, 310, 28, textureX, textureY); // Box 114
		bodyModel[178] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 74
		bodyModel[179] = new ModelRendererTurbo(this, 310, 31, textureX, textureY); // Box 78
		bodyModel[180] = new ModelRendererTurbo(this, 309, 21, textureX, textureY); // Box 245
		bodyModel[181] = new ModelRendererTurbo(this, 325, 8, textureX, textureY); // Box 354
		bodyModel[182] = new ModelRendererTurbo(this, 325, 17, textureX, textureY); // Box 355
		bodyModel[183] = new ModelRendererTurbo(this, 325, 11, textureX, textureY); // Box 356
		bodyModel[184] = new ModelRendererTurbo(this, 325, 14, textureX, textureY); // Box 357
		bodyModel[185] = new ModelRendererTurbo(this, 53, 105, textureX, textureY); // Box 259
		bodyModel[186] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 74
		bodyModel[187] = new ModelRendererTurbo(this, 63, 84, textureX, textureY, "lamp"); // Box 186 headlight f chop 1
		bodyModel[188] = new ModelRendererTurbo(this, 63, 89, textureX, textureY, "lamp"); // Box 187 headlight f chop 2
		bodyModel[189] = new ModelRendererTurbo(this, 71, 75, textureX, textureY); // Box 644
		bodyModel[190] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 645
		bodyModel[191] = new ModelRendererTurbo(this, 61, 71, textureX, textureY); // Box 646
		bodyModel[192] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 647
		bodyModel[193] = new ModelRendererTurbo(this, 45, 75, textureX, textureY); // Box 648
		bodyModel[194] = new ModelRendererTurbo(this, 67, 71, textureX, textureY); // Box 649
		bodyModel[195] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 363 numberboard chop A
		bodyModel[196] = new ModelRendererTurbo(this, 73, 84, textureX, textureY, "lamp"); // Box 364 numberboard chop A
		bodyModel[197] = new ModelRendererTurbo(this, 26, 82, textureX, textureY, "cull"); // Box 286 antenna plate cull
		bodyModel[198] = new ModelRendererTurbo(this, 40, 84, textureX, textureY); // Box 287
		bodyModel[199] = new ModelRendererTurbo(this, 38, 91, textureX, textureY); // Box 372
		bodyModel[200] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[201] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 257
		bodyModel[202] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[203] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 584
		bodyModel[204] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[205] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[206] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[207] = new ModelRendererTurbo(this, 302, 10, textureX, textureY); // Box 355
		bodyModel[208] = new ModelRendererTurbo(this, 302, 1, textureX, textureY); // Box 356
		bodyModel[209] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 357
		bodyModel[210] = new ModelRendererTurbo(this, 302, 7, textureX, textureY); // Box 358
		bodyModel[211] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 188
		bodyModel[212] = new ModelRendererTurbo(this, 8, 112, textureX, textureY); // Box 190
		bodyModel[213] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 190
		bodyModel[214] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 188
		bodyModel[215] = new ModelRendererTurbo(this, 8, 122, textureX, textureY); // Box 190
		bodyModel[216] = new ModelRendererTurbo(this, 8, 127, textureX, textureY); // Box 190
		bodyModel[217] = new ModelRendererTurbo(this, 458, 173, textureX, textureY); // Box 188
		bodyModel[218] = new ModelRendererTurbo(this, 465, 170, textureX, textureY); // Box 190
		bodyModel[219] = new ModelRendererTurbo(this, 465, 175, textureX, textureY); // Box 190
		bodyModel[220] = new ModelRendererTurbo(this, 458, 163, textureX, textureY); // Box 188
		bodyModel[221] = new ModelRendererTurbo(this, 465, 160, textureX, textureY); // Box 190
		bodyModel[222] = new ModelRendererTurbo(this, 465, 165, textureX, textureY); // Box 190
		bodyModel[223] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 409 commander base
		bodyModel[224] = new ModelRendererTurbo(this, 26, 73, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[225] = new ModelRendererTurbo(this, 26, 84, textureX, textureY); // Box 409 commander base
		bodyModel[226] = new ModelRendererTurbo(this, 26, 80, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[227] = new ModelRendererTurbo(this, 66, 100, textureX, textureY); // Box 409 commander base
		bodyModel[228] = new ModelRendererTurbo(this, 66, 96, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[229] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 364 prime base
		bodyModel[230] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[231] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[232] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[233] = new ModelRendererTurbo(this, 16, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[234] = new ModelRendererTurbo(this, 15, 86, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[235] = new ModelRendererTurbo(this, 444, 170, textureX, textureY); // Box 392
		bodyModel[236] = new ModelRendererTurbo(this, 444, 165, textureX, textureY); // Box 393
		bodyModel[237] = new ModelRendererTurbo(this, 451, 170, textureX, textureY); // Box 394
		bodyModel[238] = new ModelRendererTurbo(this, 451, 165, textureX, textureY); // Box 395
		bodyModel[239] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 396
		bodyModel[240] = new ModelRendererTurbo(this, 1, 132, textureX, textureY); // Box 397
		bodyModel[241] = new ModelRendererTurbo(this, 8, 137, textureX, textureY); // Box 398
		bodyModel[242] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 399
		bodyModel[243] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 78
		bodyModel[244] = new ModelRendererTurbo(this, 1, 106, textureX, textureY); // Box 188
		bodyModel[245] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f up2
		bodyModel[246] = new ModelRendererTurbo(this, 8, 106, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f up2
		bodyModel[247] = new ModelRendererTurbo(this, 444, 185, textureX, textureY); // Box 239
		bodyModel[248] = new ModelRendererTurbo(this, 451, 185, textureX, textureY, BoxName.ditch); // Box 24 ditchlight r up2
		bodyModel[249] = new ModelRendererTurbo(this, 451, 185, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r up2
		bodyModel[250] = new ModelRendererTurbo(this, 444, 185, textureX, textureY); // Box 242
		bodyModel[251] = new ModelRendererTurbo(this, 51, 240, textureX, textureY); // Box 132
		bodyModel[252] = new ModelRendererTurbo(this, 30, 240, textureX, textureY); // Box 133
		bodyModel[253] = new ModelRendererTurbo(this, 62, 242, textureX, textureY); // Box 22
		bodyModel[254] = new ModelRendererTurbo(this, 85, 242, textureX, textureY); // Box 23
		bodyModel[255] = new ModelRendererTurbo(this, 65, 230, textureX, textureY); // Box 24
		bodyModel[256] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Box 25
		bodyModel[257] = new ModelRendererTurbo(this, 221, 242, textureX, textureY); // Box 431
		bodyModel[258] = new ModelRendererTurbo(this, 198, 242, textureX, textureY); // Box 432
		bodyModel[259] = new ModelRendererTurbo(this, 201, 230, textureX, textureY); // Box 433
		bodyModel[260] = new ModelRendererTurbo(this, 224, 230, textureX, textureY); // Box 434
		bodyModel[261] = new ModelRendererTurbo(this, 68, 218, textureX, textureY); // Box 4
		bodyModel[262] = new ModelRendererTurbo(this, 91, 218, textureX, textureY); // Box 322
		bodyModel[263] = new ModelRendererTurbo(this, 71, 206, textureX, textureY); // Box 438
		bodyModel[264] = new ModelRendererTurbo(this, 94, 206, textureX, textureY); // Box 439
		bodyModel[265] = new ModelRendererTurbo(this, 204, 218, textureX, textureY); // Box 441
		bodyModel[266] = new ModelRendererTurbo(this, 230, 206, textureX, textureY); // Box 442
		bodyModel[267] = new ModelRendererTurbo(this, 207, 206, textureX, textureY); // Box 443
		bodyModel[268] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[269] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[270] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 336
		bodyModel[271] = new ModelRendererTurbo(this, 32, 95, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam front
		bodyModel[272] = new ModelRendererTurbo(this, 39, 95, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam front
		bodyModel[273] = new ModelRendererTurbo(this, 444, 141, textureX, textureY); // Box 336
		bodyModel[274] = new ModelRendererTurbo(this, 464, 143, textureX, textureY, "lamp"); // Box 337 headlight ane 2 beam rear
		bodyModel[275] = new ModelRendererTurbo(this, 457, 143, textureX, textureY, "lamp"); // Box 338 headlight ane 2 beam rear
		bodyModel[276] = new ModelRendererTurbo(this, 283, 73, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[277] = new ModelRendererTurbo(this, 283, 62, textureX, textureY, "cull"); // Box 306 cull aww
		bodyModel[278] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 462
		bodyModel[279] = new ModelRendererTurbo(this, 47, 103, textureX, textureY); // Box 114
		bodyModel[280] = new ModelRendererTurbo(this, 47, 100, textureX, textureY); // Box 74
		bodyModel[281] = new ModelRendererTurbo(this, 47, 106, textureX, textureY); // Box 78
		bodyModel[282] = new ModelRendererTurbo(this, 7, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[283] = new ModelRendererTurbo(this, 143, 233, textureX, textureY, "cull"); // Box 476 cull
		bodyModel[284] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[285] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[286] = new ModelRendererTurbo(this, 449, 155, textureX, textureY); // Box 514
		bodyModel[287] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 515
		bodyModel[288] = new ModelRendererTurbo(this, 449, 158, textureX, textureY); // Box 516
		bodyModel[289] = new ModelRendererTurbo(this, 64, 107, textureX, textureY); // Box 364 prime base
		bodyModel[290] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[291] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[292] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[293] = new ModelRendererTurbo(this, 64, 103, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[294] = new ModelRendererTurbo(this, 125, 114, textureX, textureY); // Box 355
		bodyModel[295] = new ModelRendererTurbo(this, 40, 81, textureX, textureY); // Box 347
		bodyModel[296] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 262
		bodyModel[297] = new ModelRendererTurbo(this, 466, 92, textureX, textureY); // Box 412 cs1
		bodyModel[298] = new ModelRendererTurbo(this, 477, 92, textureX, textureY); // Box 413 cs1
		bodyModel[299] = new ModelRendererTurbo(this, 469, 86, textureX, textureY); // Box 86 cs1
		bodyModel[300] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // Box 364 prime base
		bodyModel[301] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[302] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[303] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[304] = new ModelRendererTurbo(this, 7, 78, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[305] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 403
		bodyModel[306] = new ModelRendererTurbo(this, 59, 106, textureX, textureY); // Box 404
		bodyModel[307] = new ModelRendererTurbo(this, 59, 109, textureX, textureY); // Box 405
		bodyModel[308] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[309] = new ModelRendererTurbo(this, 187, 240, textureX, textureY); // Box 552
		bodyModel[310] = new ModelRendererTurbo(this, 166, 240, textureX, textureY); // Box 553
		bodyModel[311] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 554
		bodyModel[312] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[313] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[314] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[315] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[316] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[317] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[318] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[319] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[320] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[321] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[322] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[323] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[324] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[325] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[326] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[327] = new ModelRendererTurbo(this, 122, 95, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[328] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[329] = new ModelRendererTurbo(this, 395, 124, textureX, textureY, "lamp"); // Box 559 markerlight
		bodyModel[330] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 565
		bodyModel[331] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 568
		bodyModel[332] = new ModelRendererTurbo(this, 45, 57, textureX, textureY); // Box 570
		bodyModel[333] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 573 numberboard milw chop
		bodyModel[334] = new ModelRendererTurbo(this, 47, 84, textureX, textureY, "lamp"); // Box 574 numberboard milw chop
		bodyModel[335] = new ModelRendererTurbo(this, 472, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[336] = new ModelRendererTurbo(this, 472, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[337] = new ModelRendererTurbo(this, 374, 9, textureX, textureY); // Box 593
		bodyModel[338] = new ModelRendererTurbo(this, 374, 12, textureX, textureY); // Box 594
		bodyModel[339] = new ModelRendererTurbo(this, 374, 15, textureX, textureY); // Box 595
		bodyModel[340] = new ModelRendererTurbo(this, 75, 242, textureX, textureY); // Box 448
		bodyModel[341] = new ModelRendererTurbo(this, 81, 218, textureX, textureY); // Box 323
		bodyModel[342] = new ModelRendererTurbo(this, 78, 230, textureX, textureY); // Box 280
		bodyModel[343] = new ModelRendererTurbo(this, 84, 206, textureX, textureY); // Box 285
		bodyModel[344] = new ModelRendererTurbo(this, 220, 206, textureX, textureY); // Box 517
		bodyModel[345] = new ModelRendererTurbo(this, 217, 218, textureX, textureY); // Box 518
		bodyModel[346] = new ModelRendererTurbo(this, 211, 242, textureX, textureY); // Box 519
		bodyModel[347] = new ModelRendererTurbo(this, 214, 230, textureX, textureY); // Box 520
		bodyModel[348] = new ModelRendererTurbo(this, 47, 95, textureX, textureY, "cull"); // Box 470 Nose bell hang cull
		bodyModel[349] = new ModelRendererTurbo(this, 441, 148, textureX, textureY, "cull"); // Box 517 rear bell hang cull
		bodyModel[350] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 621 low ditchlight f
		bodyModel[351] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 622 cull
		bodyModel[352] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, BoxName.ditch); // Box 623 low ditchlight f
		bodyModel[353] = new ModelRendererTurbo(this, 1, 147, textureX, textureY, "cull"); // Box 624 cull
		bodyModel[354] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 625 low ditchlight r
		bodyModel[355] = new ModelRendererTurbo(this, 451, 180, textureX, textureY, BoxName.ditch); // Box 626 low ditchlight r
		bodyModel[356] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 627 cull
		bodyModel[357] = new ModelRendererTurbo(this, 444, 180, textureX, textureY, "cull"); // Box 628 cull
		bodyModel[358] = new ModelRendererTurbo(this, 225, 110, textureX, textureY); // Box 123 sunshade
		bodyModel[359] = new ModelRendererTurbo(this, 225, 107, textureX, textureY); // Box 311 sunshade
		bodyModel[360] = new ModelRendererTurbo(this, 250, 203, textureX, textureY); // Box 2
		bodyModel[361] = new ModelRendererTurbo(this, 262, 224, textureX, textureY); // Box 10
		bodyModel[362] = new ModelRendererTurbo(this, 319, 209, textureX, textureY); // Box 19
		bodyModel[363] = new ModelRendererTurbo(this, 263, 232, textureX, textureY); // Box 157
		bodyModel[364] = new ModelRendererTurbo(this, 263, 248, textureX, textureY); // Box 158
		bodyModel[365] = new ModelRendererTurbo(this, 319, 218, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[366] = new ModelRendererTurbo(this, 327, 214, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[367] = new ModelRendererTurbo(this, 319, 209, textureX, textureY); // Box 19
		bodyModel[368] = new ModelRendererTurbo(this, 319, 218, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[369] = new ModelRendererTurbo(this, 322, 212, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[370] = new ModelRendererTurbo(this, 301, 232, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[371] = new ModelRendererTurbo(this, 301, 232, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[372] = new ModelRendererTurbo(this, 297, 207, textureX, textureY); // Box 19
		bodyModel[373] = new ModelRendererTurbo(this, 297, 207, textureX, textureY); // Box 548
		bodyModel[374] = new ModelRendererTurbo(this, 297, 207, textureX, textureY); // Box 19
		bodyModel[375] = new ModelRendererTurbo(this, 297, 207, textureX, textureY); // Box 548
		bodyModel[376] = new ModelRendererTurbo(this, 320, 203, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[377] = new ModelRendererTurbo(this, 331, 209, textureX, textureY); // Box 382
		bodyModel[378] = new ModelRendererTurbo(this, 331, 209, textureX, textureY); // Box 383
		bodyModel[379] = new ModelRendererTurbo(this, 262, 240, textureX, textureY); // Box 752
		bodyModel[380] = new ModelRendererTurbo(this, 308, 71, textureX, textureY); // Box 18
		bodyModel[381] = new ModelRendererTurbo(this, 306, 79, textureX, textureY); // Box 21
		bodyModel[382] = new ModelRendererTurbo(this, 5, 70, textureX, textureY, "cull"); // Box 354 cull horn mount
		bodyModel[383] = new ModelRendererTurbo(this, 190, 40, textureX, textureY); // Box 184 o2 generator
		bodyModel[384] = new ModelRendererTurbo(this, 209, 37, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[385] = new ModelRendererTurbo(this, 215, 35, textureX, textureY); // Box 450
		bodyModel[386] = new ModelRendererTurbo(this, 39, 120, textureX, textureY, "lamp"); // Box 149 headlight front nose
		bodyModel[387] = new ModelRendererTurbo(this, 39, 125, textureX, textureY, "lamp"); // Box 149 headlight front nose
		bodyModel[388] = new ModelRendererTurbo(this, 46, 120, textureX, textureY, "lamp"); // Box 149 headlight front nose -1
		bodyModel[389] = new ModelRendererTurbo(this, 497, 90, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[390] = new ModelRendererTurbo(this, 497, 85, textureX, textureY); // Box 307 spedo
		bodyModel[391] = new ModelRendererTurbo(this, 238, 152, textureX, textureY); // Box 36 cubort doobort here is your detatched 70s era crab signalling box use it well my son use it till the cows come home or something like that haha thats funny right there (maybe)

		bodyModel[0].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[0].setRotationPoint(-37.01F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[1].setRotationPoint(-37F, 1F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[2].setRotationPoint(-37F, 8F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[3].setRotationPoint(-37F, 5F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[4].setRotationPoint(-37F, 7F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[5].setRotationPoint(-37F, 4F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 271
		bodyModel[6].setRotationPoint(-37F, 1F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 272
		bodyModel[7].setRotationPoint(-37F, 8F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 273
		bodyModel[8].setRotationPoint(-37F, 5F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[9].setRotationPoint(-37F, 3F, 7F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[10].setRotationPoint(-37F, 7F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[11].setRotationPoint(-37F, 4F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[12].setRotationPoint(-37F, -1F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[13].setRotationPoint(-37F, -1F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[14].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[16].setRotationPoint(38.01F, 1F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 75, 2, 12, 0F); // Box 266
		bodyModel[17].setRotationPoint(-37F, 1F, -6F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[18].setRotationPoint(39F, 3F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[19].setRotationPoint(38F, -1F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[20].setRotationPoint(38F, -1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[21].setRotationPoint(38F, 2.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[22].setRotationPoint(-33F, 2F, -11F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 210
		bodyModel[23].setRotationPoint(-37F, 3F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[24].setRotationPoint(-33F, 2F, 6F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 214
		bodyModel[25].setRotationPoint(-37F, -7F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 364
		bodyModel[26].setRotationPoint(38F, -7F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 365
		bodyModel[27].setRotationPoint(34F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[28].setRotationPoint(34F, 2F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[29].setRotationPoint(-37F, -7F, -10F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[30].setRotationPoint(-37F, -7F, 11F);
		bodyModel[30].rotateAngleY = -3.14159265F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[31].setRotationPoint(38F, -7F, -10F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[32].setRotationPoint(38F, -7F, 11F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 1
		bodyModel[33].setRotationPoint(-33F, 1F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 67, 1, 5, 0F); // Box 47
		bodyModel[34].setRotationPoint(-33F, 1F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 48
		bodyModel[35].setRotationPoint(-33F, 2F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 67, 1, 0, 0F); // Box 49
		bodyModel[36].setRotationPoint(-33F, 2F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 60
		bodyModel[37].setRotationPoint(-7F, 3F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[38].setRotationPoint(-14F, 3F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[39].setRotationPoint(-14F, 3F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[40].setRotationPoint(11F, 3F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[41].setRotationPoint(11F, 3F, -6F);

		bodyModel[42].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 72
		bodyModel[42].setRotationPoint(-7F, 3F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[43].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[44].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[45].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[46].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[47].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[48].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[49].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[50].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[51].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[52].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[53].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[54].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[55].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[56].setRotationPoint(-14F, 3F, 11F);

		bodyModel[57].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[57].setRotationPoint(-11F, 3F, 11.01F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[58].setRotationPoint(12F, 3F, 11F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 334
		bodyModel[59].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 335
		bodyModel[60].setRotationPoint(-37.01F, 7F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 336
		bodyModel[61].setRotationPoint(38.01F, 7F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 337
		bodyModel[62].setRotationPoint(38.01F, 7F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[63].setRotationPoint(-11F, 3F, -11.01F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[64].setRotationPoint(-14F, 3F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[65].setRotationPoint(12F, 3F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[66].setRotationPoint(-22F, -4F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 345 gp16 cutback frontbit
		bodyModel[67].setRotationPoint(-30F, -4F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 346 gp16 cutback frontbit
		bodyModel[68].setRotationPoint(-30F, -4F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[69].setRotationPoint(-31.01F, -12F, -11.01F);
		bodyModel[69].rotateAngleY = -3.14159265F;

		bodyModel[70].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 132
		bodyModel[70].setRotationPoint(-31F, -12F, -11.01F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 133
		bodyModel[71].setRotationPoint(-34F, -6F, -11.01F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[72].setRotationPoint(-34F, -6F, 11.01F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[73].setRotationPoint(-33.01F, -12F, 11.02F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addBox(0F, 0F, 0F, 9, 8, 0, 0F); // Box 136
		bodyModel[74].setRotationPoint(-31F, -12F, 11.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[75].setRotationPoint(-32F, -4F, -11.01F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 140
		bodyModel[76].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 141
		bodyModel[77].setRotationPoint(-31F, -4F, 11.01F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[78].setRotationPoint(-32F, -4F, 11.01F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[79].setRotationPoint(-34F, -12F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[80].setRotationPoint(-34F, -12F, 1F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[81].setRotationPoint(-34F, -12F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 367
		bodyModel[82].setRotationPoint(-31F, -12F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 350
		bodyModel[83].setRotationPoint(-31F, -19F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[84].setRotationPoint(-34F, -19F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[85].setRotationPoint(-34F, -19F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[86].setRotationPoint(-34F, -19F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 357
		bodyModel[87].setRotationPoint(-32F, -18F, -7F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 numberboard front high
		bodyModel[88].setRotationPoint(-31.55F, -16.5F, -6F);
		bodyModel[88].rotateAngleY = 0.46687557F;

		bodyModel[89].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 numberboard front high
		bodyModel[89].setRotationPoint(-31.55F, -16.5F, 6F);
		bodyModel[89].rotateAngleY = -0.46687557F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[90].setRotationPoint(-35.25F, -18F, -1F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 216
		bodyModel[91].setRotationPoint(-34.5F, -18F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[92].setRotationPoint(-35.25F, -16F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 311
		bodyModel[93].setRotationPoint(-34.5F, -16F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 137
		bodyModel[94].setRotationPoint(-32F, -1F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 138
		bodyModel[95].setRotationPoint(-32F, -1F, 5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[96].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[97].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[98].setRotationPoint(-21F, -19F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[99].setRotationPoint(-22F, -19F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 9
		bodyModel[100].setRotationPoint(-21F, -16F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 10, 12, 1, 0F); // Box 10
		bodyModel[101].setRotationPoint(-21F, -16F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 15
		bodyModel[102].setRotationPoint(-22F, -16F, -7F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 21
		bodyModel[103].setRotationPoint(-11F, -16F, -11F);

		bodyModel[104].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[104].setRotationPoint(-10.5F, -16F, 10.5F);

		bodyModel[105].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[105].setRotationPoint(-21.5F, -16F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[106].setRotationPoint(-11F, -19F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[107].setRotationPoint(-22F, -19F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[108].setRotationPoint(-11F, -19F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[109].setRotationPoint(-21F, -19F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[110].setRotationPoint(-22F, -19F, -7F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[111].setRotationPoint(-11F, -19F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[112].setRotationPoint(-22F, -21F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 2F, 12, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[113].setRotationPoint(-22F, -21F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 2F, 12, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 348
		bodyModel[114].setRotationPoint(-22F, -21F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[115].setRotationPoint(32F, -19F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[116].setRotationPoint(32F, -19F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[117].setRotationPoint(32F, -19F, 1F);

		bodyModel[118].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[118].setRotationPoint(-10F, -19F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[119].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[119].rotateAngleY = -1.11701072F;

		bodyModel[120].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[120].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[120].rotateAngleY = -1.11701072F;

		bodyModel[121].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[121].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[122].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[123].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[124].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[125].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[126].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[127].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[128].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[129].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[130].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[131].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[132].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[133].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[134].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[135].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[135].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 187
		bodyModel[136].setRotationPoint(-10F, -20F, -2.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[137].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[138].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[139].setRotationPoint(31F, -19.5F, -1F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 190
		bodyModel[140].setRotationPoint(-32F, -19.5F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 13, 2, 8, 0F); // Box 196 winterization hatch EXTRA THICC
		bodyModel[141].setRotationPoint(18F, -21F, -4F);

		bodyModel[142].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 196 winterization hatch tall
		bodyModel[142].setRotationPoint(18F, -22F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 196 winterization hatch smol
		bodyModel[143].setRotationPoint(18F, -21F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 236
		bodyModel[144].setRotationPoint(30F, -21F, 5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 237
		bodyModel[145].setRotationPoint(30.25F, -20F, 5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F); // Box 457
		bodyModel[146].setRotationPoint(32F, -18F, -7F);

		bodyModel[147].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[147].setRotationPoint(-6F, -7F, -11.01F);

		bodyModel[148].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[148].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[149].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[150].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[151].setRotationPoint(34F, -7F, -11.01F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[152].setRotationPoint(34F, -7F, 11.01F);

		bodyModel[153].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[153].setRotationPoint(-10F, -4F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[154].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[155].setRotationPoint(-10F, -4F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[156].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[157].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[157].setRotationPoint(-6F, -7F, 11.01F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[158].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[159].setRotationPoint(34.75F, -18F, -1F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[160].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 222
		bodyModel[161].setRotationPoint(34.5F, -16F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[162].setRotationPoint(34.75F, -16F, -1F);

		bodyModel[163].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[163].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[163].rotateAngleY = -0.46687557F;

		bodyModel[164].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[164].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[164].rotateAngleY = 0.46687557F;

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 207
		bodyModel[165].setRotationPoint(10F, -22F, -8F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 208
		bodyModel[166].setRotationPoint(11.25F, -21.85F, -9F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 209
		bodyModel[167].setRotationPoint(11.25F, -21.85F, -7F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 210
		bodyModel[168].setRotationPoint(12F, -21F, -8F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[169].setRotationPoint(-3.5F, -21F, -6F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		bodyModel[170].setRotationPoint(-3F, -20F, -6F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[171].setRotationPoint(-4.5F, -21F, -5F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[172].setRotationPoint(-5F, -21F, -7F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[173].setRotationPoint(-30F, -20F, -6F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[174].setRotationPoint(-32F, -21F, -7F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 194
		bodyModel[175].setRotationPoint(-31.5F, -21F, -5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[176].setRotationPoint(-30.5F, -21F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[177].setRotationPoint(0.5F, -17.5F, 7.7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[178].setRotationPoint(0.5F, -18.5F, 7.7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[179].setRotationPoint(0.75F, -17F, 7.95F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[180].setRotationPoint(0.5F, -19.5F, 6.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[181].setRotationPoint(-16.5F, -22F, 0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[182].setRotationPoint(-15F, -21.25F, -0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[183].setRotationPoint(-17.5F, -22.25F, -0.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[184].setRotationPoint(-17F, -22F, -1.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 259
		bodyModel[185].setRotationPoint(-30F, -21F, -2F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[186].setRotationPoint(-24F, -20.5F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight f chop 1
		bodyModel[187].setRotationPoint(-24.25F, -20.5F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight f chop 2
		bodyModel[188].setRotationPoint(-24.25F, -18.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[189].setRotationPoint(-24F, -18.5F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 645
		bodyModel[190].setRotationPoint(-24F, -20.5F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[191].setRotationPoint(-23F, -20.5F, -2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[192].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[193].setRotationPoint(-24F, -18.5F, 1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[194].setRotationPoint(-23F, -20.5F, 1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 363 numberboard chop A
		bodyModel[195].setRotationPoint(-22.4F, -18.55F, -6F);
		bodyModel[195].rotateAngleY = 0.32288591F;

		bodyModel[196].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 364 numberboard chop A
		bodyModel[196].setRotationPoint(-22.4F, -18.55F, 6F);
		bodyModel[196].rotateAngleY = -0.32288591F;

		bodyModel[197].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 286 antenna plate cull
		bodyModel[197].setRotationPoint(-21F, -20F, -9F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 287
		bodyModel[198].setRotationPoint(-20F, -22F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[199].setRotationPoint(-20.5F, -21F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[200].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[201].setRotationPoint(-9F, -17.5F, -7.05F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[202].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 584
		bodyModel[203].setRotationPoint(-9F, -17.5F, 6.05F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[204].setRotationPoint(-11.5F, 3F, -10.25F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[205].setRotationPoint(-11.5F, 2F, -10.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[206].setRotationPoint(-11.25F, 3.5F, -10F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[207].setRotationPoint(-21.5F, -21.25F, -0.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[208].setRotationPoint(-23F, -22F, 0.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 357
		bodyModel[209].setRotationPoint(-24F, -22.25F, -0.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 358
		bodyModel[210].setRotationPoint(-23.5F, -22F, -1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[211].setRotationPoint(-37F, -5F, -4.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[212].setRotationPoint(-37.25F, -5F, -4.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[213].setRotationPoint(-37.25F, -3F, -4.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[214].setRotationPoint(-37F, -5F, 2.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[215].setRotationPoint(-37.25F, -5F, 2.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190
		bodyModel[216].setRotationPoint(-37.25F, -3F, 2.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[217].setRotationPoint(37F, -5F, -4.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[218].setRotationPoint(37.25F, -5F, -4.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[219].setRotationPoint(37.25F, -3F, -4.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[220].setRotationPoint(37F, -5F, 2.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[221].setRotationPoint(37.25F, -5F, 2.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190
		bodyModel[222].setRotationPoint(37.25F, -3F, 2.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[223].setRotationPoint(-21F, -21.5F, -0.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[224].setRotationPoint(-21F, -22.5F, -0.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[225].setRotationPoint(-12F, -21.5F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[226].setRotationPoint(-12F, -22.5F, -0.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[227].setRotationPoint(-29F, -20F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[228].setRotationPoint(-29F, -21F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[229].setRotationPoint(-20.5F, -20F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[230].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[231].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[232].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[233].setRotationPoint(-20.5F, -20.5F, 7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[234].setRotationPoint(-21F, -19F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[235].setRotationPoint(37F, -1F, -4.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[236].setRotationPoint(37F, -1F, 2.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394
		bodyModel[237].setRotationPoint(37.25F, -1F, -4.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395
		bodyModel[238].setRotationPoint(37.25F, -1F, 2.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[239].setRotationPoint(-37F, -1F, -4.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[240].setRotationPoint(-37F, -1F, 2.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398
		bodyModel[241].setRotationPoint(-37.25F, -1F, -4.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399
		bodyModel[242].setRotationPoint(-37.25F, -1F, 2.75F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[243].setRotationPoint(-37F, -2F, 3.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[244].setRotationPoint(-37F, -2F, -5.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[245].setRotationPoint(-37.25F, -2F, 3.75F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[246].setRotationPoint(-37.25F, -2F, -5.75F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[247].setRotationPoint(37F, -2F, -5.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[248].setRotationPoint(37.25F, -2F, -5.75F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[249].setRotationPoint(37.25F, -2F, 3.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[250].setRotationPoint(37F, -2F, 3.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[251].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[252].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[253].setRotationPoint(-41F, 7F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[254].setRotationPoint(-41F, 7F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[255].setRotationPoint(-40F, 6F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[256].setRotationPoint(-40F, 6F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[257].setRotationPoint(41F, 7F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[258].setRotationPoint(41F, 7F, -10F);

		bodyModel[259].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[259].setRotationPoint(41F, 6F, -10F);

		bodyModel[260].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[260].setRotationPoint(41F, 6F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[261].setRotationPoint(-40F, 6F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[262].setRotationPoint(-40F, 6F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[263].setRotationPoint(-40F, 5F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[264].setRotationPoint(-40F, 5F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[265].setRotationPoint(40F, 6F, -10F);

		bodyModel[266].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[266].setRotationPoint(41F, 5F, 0F);

		bodyModel[267].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[267].setRotationPoint(41F, 5F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[268].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[269].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[270].setRotationPoint(-34.5F, -21F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam front
		bodyModel[271].setRotationPoint(-35.25F, -21F, 0F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam front
		bodyModel[272].setRotationPoint(-35.25F, -21F, -2F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[273].setRotationPoint(33.5F, -21F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 337 headlight ane 2 beam rear
		bodyModel[274].setRotationPoint(35.25F, -21F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 338 headlight ane 2 beam rear
		bodyModel[275].setRotationPoint(35.25F, -21F, -2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[276].setRotationPoint(-19F, -16F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306 cull aww
		bodyModel[277].setRotationPoint(-19F, -16F, -12.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 462
		bodyModel[278].setRotationPoint(-22F, -22.5F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[279].setRotationPoint(-35.5F, -19.5F, -0.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[280].setRotationPoint(-35.5F, -20.5F, -0.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[281].setRotationPoint(-35.25F, -19F, -0.25F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 456 cull
		bodyModel[282].setRotationPoint(-38F, 7F, -10F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 476 cull
		bodyModel[283].setRotationPoint(38F, 7F, -10F);

		bodyModel[284].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[284].setRotationPoint(-37F, 2F, 7F);

		bodyModel[285].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[285].setRotationPoint(-37F, 2F, -7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 514
		bodyModel[286].setRotationPoint(35.5F, -19.5F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[287].setRotationPoint(35.5F, -20.5F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 516
		bodyModel[288].setRotationPoint(35.25F, -19F, -0.25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[289].setRotationPoint(-29F, -20F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[290].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[291].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[292].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[293].setRotationPoint(-29F, -20.5F, -1F);

		bodyModel[294].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 355
		bodyModel[294].setRotationPoint(-24F, -10F, 7F);

		bodyModel[295].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[295].setRotationPoint(-19F, -22.5F, -2F);

		bodyModel[296].addShapeBox(0F, 0F, 2F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[296].setRotationPoint(-17F, -21.5F, -2F);

		bodyModel[297].addBox(0.5F, 0F, 0.5F, 2, 9, 3, 0F); // Box 412 cs1
		bodyModel[297].setRotationPoint(-16.5F, -13F, -7F);
		bodyModel[297].rotateAngleY = -0.26179939F;

		bodyModel[298].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[298].setRotationPoint(-21.6F, -11F, -3F);
		bodyModel[298].rotateAngleY = -0.59341195F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[299].setRotationPoint(-21.6F, -13F, -3F);
		bodyModel[299].rotateAngleY = -0.59341195F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[300].setRotationPoint(-9F, -21.5F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[301].setRotationPoint(-9F, -22F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[302].setRotationPoint(-9F, -22F, -1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[303].setRotationPoint(-9F, -22F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[304].setRotationPoint(-9F, -22F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[305].setRotationPoint(-36F, 3F, 5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[306].setRotationPoint(-36F, 4F, 5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[307].setRotationPoint(-35.75F, 4.5F, 5.25F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 559
		bodyModel[308].setRotationPoint(-12F, -19F, -7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[309].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[310].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[311].setRotationPoint(40F, 6F, 0F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[312].setRotationPoint(34F, 5F, -10F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[313].setRotationPoint(34F, 7F, -8F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[314].setRotationPoint(34F, 8F, -11F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[315].setRotationPoint(34F, 4F, -7F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[316].setRotationPoint(34F, 2F, -7F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[317].setRotationPoint(34F, 3F, -9F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[318].setRotationPoint(34F, 1F, -8F);

		bodyModel[319].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[319].setRotationPoint(34F, 7F, 8F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[320].setRotationPoint(34F, 8F, 8F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[321].setRotationPoint(34F, 5F, 7F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[322].setRotationPoint(34F, 4F, 7F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[323].setRotationPoint(34F, 3F, 7F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[324].setRotationPoint(34F, 2F, 7F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[325].setRotationPoint(34F, 1F, 6F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[326].setRotationPoint(-32F, -18F, -6.51F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[327].setRotationPoint(-32F, -18F, 6.51F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 559 markerlight
		bodyModel[328].setRotationPoint(32F, -18F, -6.51F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Box 559 markerlight
		bodyModel[329].setRotationPoint(32F, -18F, 6.51F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 565
		bodyModel[330].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[331].setRotationPoint(-24F, -20.5F, -7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 570
		bodyModel[332].setRotationPoint(-24F, -20.5F, 1F);

		bodyModel[333].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 573 numberboard milw chop
		bodyModel[333].setRotationPoint(-22.4F, -19.55F, 6F);
		bodyModel[333].rotateAngleY = -0.32288591F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 574 numberboard milw chop
		bodyModel[334].setRotationPoint(-22.4F, -19.55F, -6F);
		bodyModel[334].rotateAngleY = 0.32288591F;

		bodyModel[335].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[335].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[336].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 593
		bodyModel[337].setRotationPoint(29.25F, -20.85F, 6F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 594
		bodyModel[338].setRotationPoint(28.25F, -21F, 5F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 595
		bodyModel[339].setRotationPoint(29.25F, -20.85F, 4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[340].setRotationPoint(-40F, 5F, 2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[341].setRotationPoint(-40F, 5F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[342].setRotationPoint(-40F, 4F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[343].setRotationPoint(-40F, 4F, -8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[344].setRotationPoint(40F, 4F, 2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[345].setRotationPoint(40F, 5F, 2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[346].setRotationPoint(40F, 5F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[347].setRotationPoint(40F, 4F, -8F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 470 Nose bell hang cull
		bodyModel[348].setRotationPoint(-36F, -20.5F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 517 rear bell hang cull
		bodyModel[349].setRotationPoint(35F, -20.5F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 621 low ditchlight f
		bodyModel[350].setRotationPoint(-37.75F, 1F, -6.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 622 cull
		bodyModel[351].setRotationPoint(-37.5F, 1F, -6.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 623 low ditchlight f
		bodyModel[352].setRotationPoint(-37.75F, 1F, 4.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 624 cull
		bodyModel[353].setRotationPoint(-37.5F, 1F, 4.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 625 low ditchlight r
		bodyModel[354].setRotationPoint(37.75F, 1F, -6.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 626 low ditchlight r
		bodyModel[355].setRotationPoint(37.75F, 1F, 4.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 627 cull
		bodyModel[356].setRotationPoint(37.5F, 1F, 4.75F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 628 cull
		bodyModel[357].setRotationPoint(37.5F, 1F, -6.75F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123 sunshade
		bodyModel[358].setRotationPoint(-20.5F, -16F, -11F);
		bodyModel[358].rotateAngleX = -0.78539816F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311 sunshade
		bodyModel[359].setRotationPoint(-20.5F, -16F, 11F);
		bodyModel[359].rotateAngleX = 0.78539816F;

		bodyModel[360].addBox(0F, 0F, 0F, 15, 4, 16, 0F); // Box 2
		bodyModel[360].setRotationPoint(-7F, 5F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[361].setRotationPoint(-7F, 2F, -11F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[362].setRotationPoint(9F, 4F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[363].setRotationPoint(-7F, 5F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 15, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[364].setRotationPoint(-7F, 5F, 8F);

		bodyModel[365].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[365].setRotationPoint(9.5F, 6F, -9.5F);
		bodyModel[365].rotateAngleZ = -0.10471976F;

		bodyModel[366].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[366].setRotationPoint(8F, 1.05F, 8.5F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[367].setRotationPoint(-9F, 4F, -9F);

		bodyModel[368].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[368].setRotationPoint(-8.5F, 6F, -9.5F);
		bodyModel[368].rotateAngleZ = 0.10471976F;

		bodyModel[369].addBox(-0.5F, -4F, -1F, 1, 4, 1, 0F); // Box 305 pipe cull
		bodyModel[369].setRotationPoint(-8.5F, 5.5F, 10.01F);
		bodyModel[369].rotateAngleZ = -0.2268928F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[370].setRotationPoint(8F, 3F, -6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[371].setRotationPoint(-10F, 3F, -6F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[372].setRotationPoint(-10F, 5F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[373].setRotationPoint(-8F, 5F, -9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[374].setRotationPoint(8F, 5F, -9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[375].setRotationPoint(10F, 5F, -9F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[376].setRotationPoint(8.25F, 1.75F, 8.5F);

		bodyModel[377].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[377].setRotationPoint(1F, 1.5F, -11.25F);
		bodyModel[377].rotateAngleX = 1.57079633F;

		bodyModel[378].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[378].setRotationPoint(1F, 1.5F, 11.25F);
		bodyModel[378].rotateAngleX = -1.57079633F;

		bodyModel[379].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		bodyModel[379].setRotationPoint(-7F, 2F, 7F);

		bodyModel[380].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 18
		bodyModel[380].setRotationPoint(2F, -21F, -2.5F);

		bodyModel[381].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[381].setRotationPoint(1.5F, -19.5F, -3F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F); // Box 354 cull horn mount
		bodyModel[382].setRotationPoint(-9F, -20.5F, -2F);

		bodyModel[383].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[383].setRotationPoint(-19.5F, -21.5F, -4F);

		bodyModel[384].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[384].setRotationPoint(-14.05F, -22F, -2.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[385].setRotationPoint(-13.5F, -23F, 0F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front nose
		bodyModel[386].setRotationPoint(-34.75F, -12F, -1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front nose
		bodyModel[387].setRotationPoint(-34.75F, -10F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 149 headlight front nose -1
		bodyModel[388].setRotationPoint(-34.75F, -14F, -1F);

		bodyModel[389].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[389].setRotationPoint(-18F, -15.25F, -3.5F);
		bodyModel[389].rotateAngleY = 0.78539816F;

		bodyModel[390].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[390].setRotationPoint(-18F, -15.25F, -3.5F);
		bodyModel[390].rotateAngleY = 0.78539816F;

		bodyModel[391].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 cubort doobort here is your detatched 70s era crab signalling box use it well my son use it till the cows come home or something like that haha thats funny right there (maybe)
		bodyModel[391].setRotationPoint(-29.5F, -8F, 7F);
	}

	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 1355||GetColor(entity) == 23544
				||GetColor(entity) == 25234) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 || GetColor(entity) == 16){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 5465){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
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