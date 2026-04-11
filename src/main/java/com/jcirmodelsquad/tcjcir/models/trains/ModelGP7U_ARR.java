//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GP7U ARR
// Model Creator: bibda
// Created on: 16.06.2023 - 12:15:37
// Last changed on: 16.06.2023 - 12:15:37

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

public class ModelGP7U_ARR extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelGP7U_ARR() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[327];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 203, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 271
		bodyModel[2] = new ModelRendererTurbo(this, 24, 182, textureX, textureY); // Box 272
		bodyModel[3] = new ModelRendererTurbo(this, 24, 176, textureX, textureY); // Box 273
		bodyModel[4] = new ModelRendererTurbo(this, 27, 180, textureX, textureY); // Box 275
		bodyModel[5] = new ModelRendererTurbo(this, 27, 174, textureX, textureY); // Box 276
		bodyModel[6] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 271
		bodyModel[7] = new ModelRendererTurbo(this, 33, 182, textureX, textureY); // Box 272
		bodyModel[8] = new ModelRendererTurbo(this, 33, 176, textureX, textureY); // Box 273
		bodyModel[9] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 274
		bodyModel[10] = new ModelRendererTurbo(this, 36, 180, textureX, textureY); // Box 275
		bodyModel[11] = new ModelRendererTurbo(this, 36, 174, textureX, textureY); // Box 276
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
		bodyModel[37] = new ModelRendererTurbo(this, 263, 229, textureX, textureY); // Box 486
		bodyModel[38] = new ModelRendererTurbo(this, 263, 217, textureX, textureY); // Box 487
		bodyModel[39] = new ModelRendererTurbo(this, 251, 236, textureX, textureY); // Box 488
		bodyModel[40] = new ModelRendererTurbo(this, 263, 224, textureX, textureY); // Box 489
		bodyModel[41] = new ModelRendererTurbo(this, 263, 212, textureX, textureY); // Box 805
		bodyModel[42] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 196, 182, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 498
		bodyModel[48] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 430
		bodyModel[49] = new ModelRendererTurbo(this, 429, 247, textureX, textureY); // Box 431
		bodyModel[50] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 432
		bodyModel[51] = new ModelRendererTurbo(this, 417, 247, textureX, textureY); // Box 433
		bodyModel[52] = new ModelRendererTurbo(this, 196, 178, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 257, 200, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 118, 250, textureX, textureY); // Box 143
		bodyModel[56] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 129
		bodyModel[58] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 130
		bodyModel[59] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 133
		bodyModel[60] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 134
		bodyModel[61] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 322
		bodyModel[62] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 323
		bodyModel[63] = new ModelRendererTurbo(this, 134, 246, textureX, textureY); // Box 324
		bodyModel[64] = new ModelRendererTurbo(this, 123, 242, textureX, textureY); // Box 325
		bodyModel[65] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 4
		bodyModel[66] = new ModelRendererTurbo(this, 115, 225, textureX, textureY); // Box 327
		bodyModel[67] = new ModelRendererTurbo(this, 261, 191, textureX, textureY); // Box 490
		bodyModel[68] = new ModelRendererTurbo(this, 268, 191, textureX, textureY); // Box 330
		bodyModel[69] = new ModelRendererTurbo(this, 434, 250, textureX, textureY); // Box 332
		bodyModel[70] = new ModelRendererTurbo(this, 49, 228, textureX, textureY); // Box 334
		bodyModel[71] = new ModelRendererTurbo(this, 5, 228, textureX, textureY); // Box 335
		bodyModel[72] = new ModelRendererTurbo(this, 185, 228, textureX, textureY); // Box 336
		bodyModel[73] = new ModelRendererTurbo(this, 141, 228, textureX, textureY); // Box 337
		bodyModel[74] = new ModelRendererTurbo(this, 315, 194, textureX, textureY); // Box 338
		bodyModel[75] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 339
		bodyModel[76] = new ModelRendererTurbo(this, 392, 231, textureX, textureY); // Box 340
		bodyModel[77] = new ModelRendererTurbo(this, 268, 183, textureX, textureY); // Box 342
		bodyModel[78] = new ModelRendererTurbo(this, 261, 183, textureX, textureY); // Box 343
		bodyModel[79] = new ModelRendererTurbo(this, 315, 186, textureX, textureY); // Box 344
		bodyModel[80] = new ModelRendererTurbo(this, 402, 232, textureX, textureY); // Box 346
		bodyModel[81] = new ModelRendererTurbo(this, 239, 140, textureX, textureY); // Box 344
		bodyModel[82] = new ModelRendererTurbo(this, 218, 157, textureX, textureY); // Box 345 gp16 cutback frontbit
		bodyModel[83] = new ModelRendererTurbo(this, 218, 145, textureX, textureY); // Box 346 mogus
		bodyModel[84] = new ModelRendererTurbo(this, 355, 40, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 136
		bodyModel[88] = new ModelRendererTurbo(this, 211, 149, textureX, textureY); // Box 141
		bodyModel[89] = new ModelRendererTurbo(this, 103, 120, textureX, textureY); // Box 216
		bodyModel[90] = new ModelRendererTurbo(this, 73, 120, textureX, textureY); // Box 217
		bodyModel[91] = new ModelRendererTurbo(this, 92, 124, textureX, textureY); // Box 218
		bodyModel[92] = new ModelRendererTurbo(this, 123, 112, textureX, textureY); // Box 215
		bodyModel[93] = new ModelRendererTurbo(this, 204, 161, textureX, textureY); // Box 373
		bodyModel[94] = new ModelRendererTurbo(this, 1, 201, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[95] = new ModelRendererTurbo(this, 1, 195, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[96] = new ModelRendererTurbo(this, 308, 88, textureX, textureY); // Box 9
		bodyModel[97] = new ModelRendererTurbo(this, 235, 88, textureX, textureY); // Box 10
		bodyModel[98] = new ModelRendererTurbo(this, 185, 71, textureX, textureY); // Box 15
		bodyModel[99] = new ModelRendererTurbo(this, 258, 71, textureX, textureY); // Box 21
		bodyModel[100] = new ModelRendererTurbo(this, 297, 85, textureX, textureY); // Box 314 door swing right
		bodyModel[101] = new ModelRendererTurbo(this, 224, 85, textureX, textureY); // Box 315 door swing right
		bodyModel[102] = new ModelRendererTurbo(this, 152, 54, textureX, textureY); // Box 411
		bodyModel[103] = new ModelRendererTurbo(this, 189, 53, textureX, textureY); // Box 412
		bodyModel[104] = new ModelRendererTurbo(this, 346, 113, textureX, textureY); // Box 219
		bodyModel[105] = new ModelRendererTurbo(this, 365, 117, textureX, textureY); // Box 220
		bodyModel[106] = new ModelRendererTurbo(this, 376, 113, textureX, textureY); // Box 221
		bodyModel[107] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 223
		bodyModel[108] = new ModelRendererTurbo(this, 398, 130, textureX, textureY); // Box 43
		bodyModel[109] = new ModelRendererTurbo(this, 399, 133, textureX, textureY); // Box 43
		bodyModel[110] = new ModelRendererTurbo(this, 371, 90, textureX, textureY); // Box 89 dynamic fan
		bodyModel[111] = new ModelRendererTurbo(this, 340, 85, textureX, textureY); // Box 91
		bodyModel[112] = new ModelRendererTurbo(this, 352, 75, textureX, textureY); // Box 101
		bodyModel[113] = new ModelRendererTurbo(this, 338, 75, textureX, textureY); // Box 105
		bodyModel[114] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 172
		bodyModel[115] = new ModelRendererTurbo(this, 352, 80, textureX, textureY); // Box 173
		bodyModel[116] = new ModelRendererTurbo(this, 338, 80, textureX, textureY); // Box 176
		bodyModel[117] = new ModelRendererTurbo(this, 374, 80, textureX, textureY); // Box 177
		bodyModel[118] = new ModelRendererTurbo(this, 352, 101, textureX, textureY); // Box 178
		bodyModel[119] = new ModelRendererTurbo(this, 374, 101, textureX, textureY); // Box 179
		bodyModel[120] = new ModelRendererTurbo(this, 374, 106, textureX, textureY); // Box 180
		bodyModel[121] = new ModelRendererTurbo(this, 352, 106, textureX, textureY); // Box 181
		bodyModel[122] = new ModelRendererTurbo(this, 338, 106, textureX, textureY); // Box 182
		bodyModel[123] = new ModelRendererTurbo(this, 338, 101, textureX, textureY); // Box 183
		bodyModel[124] = new ModelRendererTurbo(this, 314, 81, textureX, textureY); // Box 184
		bodyModel[125] = new ModelRendererTurbo(this, 325, 81, textureX, textureY); // Box 185
		bodyModel[126] = new ModelRendererTurbo(this, 314, 75, textureX, textureY); // Box 247 extra stack
		bodyModel[127] = new ModelRendererTurbo(this, 325, 75, textureX, textureY); // Box 248 extra stack
		bodyModel[128] = new ModelRendererTurbo(this, 405, 97, textureX, textureY); // Box 186
		bodyModel[129] = new ModelRendererTurbo(this, 437, 97, textureX, textureY); // Box 188
		bodyModel[130] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 189
		bodyModel[131] = new ModelRendererTurbo(this, 366, 113, textureX, textureY); // Box 191
		bodyModel[132] = new ModelRendererTurbo(this, 421, 67, textureX, textureY, "cull"); // Box 196 winterization hatch tall
		bodyModel[133] = new ModelRendererTurbo(this, 388, 40, textureX, textureY); // Box 176
		bodyModel[134] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 500
		bodyModel[135] = new ModelRendererTurbo(this, 379, 40, textureX, textureY); // Box 313
		bodyModel[136] = new ModelRendererTurbo(this, 469, 40, textureX, textureY); // Box 462
		bodyModel[137] = new ModelRendererTurbo(this, 469, 24, textureX, textureY); // Box 463
		bodyModel[138] = new ModelRendererTurbo(this, 324, 158, textureX, textureY); // Box 362
		bodyModel[139] = new ModelRendererTurbo(this, 345, 162, textureX, textureY); // Box 237
		bodyModel[140] = new ModelRendererTurbo(this, 308, 148, textureX, textureY); // Box 363
		bodyModel[141] = new ModelRendererTurbo(this, 321, 152, textureX, textureY); // Box 238
		bodyModel[142] = new ModelRendererTurbo(this, 388, 24, textureX, textureY); // Box 38R
		bodyModel[143] = new ModelRendererTurbo(this, 379, 26, textureX, textureY); // Box 314
		bodyModel[144] = new ModelRendererTurbo(this, 413, 117, textureX, textureY, "lamp"); // Box 359 headlight rear 1
		bodyModel[145] = new ModelRendererTurbo(this, 406, 119, textureX, textureY); // Box 360
		bodyModel[146] = new ModelRendererTurbo(this, 413, 122, textureX, textureY, "lamp"); // Box 223 headlight rear 2
		bodyModel[147] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[148] = new ModelRendererTurbo(this, 398, 121, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[149] = new ModelRendererTurbo(this, 363, 14, textureX, textureY); // Box 361
		bodyModel[150] = new ModelRendererTurbo(this, 372, 14, textureX, textureY); // Box 362
		bodyModel[151] = new ModelRendererTurbo(this, 363, 11, textureX, textureY); // Box 363
		bodyModel[152] = new ModelRendererTurbo(this, 363, 17, textureX, textureY); // Box 364
		bodyModel[153] = new ModelRendererTurbo(this, 310, 28, textureX, textureY); // Box 114
		bodyModel[154] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 74
		bodyModel[155] = new ModelRendererTurbo(this, 310, 31, textureX, textureY); // Box 78
		bodyModel[156] = new ModelRendererTurbo(this, 309, 21, textureX, textureY); // Box 245
		bodyModel[157] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 256
		bodyModel[158] = new ModelRendererTurbo(this, 354, 154, textureX, textureY); // Box 583
		bodyModel[159] = new ModelRendererTurbo(this, 347, 38, textureX, textureY); // Box 341
		bodyModel[160] = new ModelRendererTurbo(this, 254, 186, textureX, textureY); // Box 114
		bodyModel[161] = new ModelRendererTurbo(this, 254, 183, textureX, textureY); // Box 74
		bodyModel[162] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Box 78
		bodyModel[163] = new ModelRendererTurbo(this, 40, 208, textureX, textureY); // Box 78
		bodyModel[164] = new ModelRendererTurbo(this, 40, 208, textureX, textureY); // Box 188
		bodyModel[165] = new ModelRendererTurbo(this, 33, 208, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[166] = new ModelRendererTurbo(this, 33, 208, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[167] = new ModelRendererTurbo(this, 148, 209, textureX, textureY); // Box 239
		bodyModel[168] = new ModelRendererTurbo(this, 155, 209, textureX, textureY, BoxName.ditch); // Box 240 ditchlight rear
		bodyModel[169] = new ModelRendererTurbo(this, 155, 209, textureX, textureY, BoxName.ditch); // Box 241 ditchlight rear
		bodyModel[170] = new ModelRendererTurbo(this, 148, 209, textureX, textureY); // Box 242
		bodyModel[171] = new ModelRendererTurbo(this, 64, 238, textureX, textureY); // Box 132
		bodyModel[172] = new ModelRendererTurbo(this, 51, 234, textureX, textureY); // Box 133
		bodyModel[173] = new ModelRendererTurbo(this, 78, 244, textureX, textureY); // Box 22
		bodyModel[174] = new ModelRendererTurbo(this, 92, 237, textureX, textureY); // Box 23
		bodyModel[175] = new ModelRendererTurbo(this, 78, 232, textureX, textureY); // Box 24
		bodyModel[176] = new ModelRendererTurbo(this, 92, 225, textureX, textureY); // Box 25
		bodyModel[177] = new ModelRendererTurbo(this, 227, 242, textureX, textureY); // Box 431
		bodyModel[178] = new ModelRendererTurbo(this, 213, 238, textureX, textureY); // Box 432
		bodyModel[179] = new ModelRendererTurbo(this, 213, 226, textureX, textureY); // Box 433
		bodyModel[180] = new ModelRendererTurbo(this, 227, 230, textureX, textureY); // Box 434
		bodyModel[181] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[182] = new ModelRendererTurbo(this, 354, 164, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[183] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[184] = new ModelRendererTurbo(this, 310, 235, textureX, textureY); // Box 452 rear fuel fill
		bodyModel[185] = new ModelRendererTurbo(this, 283, 73, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[186] = new ModelRendererTurbo(this, 283, 62, textureX, textureY, "cull"); // Box 306 cull aww
		bodyModel[187] = new ModelRendererTurbo(this, 295, 218, textureX, textureY); // Box 455
		bodyModel[188] = new ModelRendererTurbo(this, 285, 186, textureX, textureY); // Box 456
		bodyModel[189] = new ModelRendererTurbo(this, 279, 186, textureX, textureY); // Box 457
		bodyModel[190] = new ModelRendererTurbo(this, 279, 195, textureX, textureY); // Box 458
		bodyModel[191] = new ModelRendererTurbo(this, 285, 195, textureX, textureY); // Box 459
		bodyModel[192] = new ModelRendererTurbo(this, 271, 189, textureX, textureY); // Box 460
		bodyModel[193] = new ModelRendererTurbo(this, 271, 197, textureX, textureY); // Box 461
		bodyModel[194] = new ModelRendererTurbo(this, 8, 233, textureX, textureY, "cull"); // Box 456 cull
		bodyModel[195] = new ModelRendererTurbo(this, 156, 235, textureX, textureY, "cull"); // Box 476 cull
		bodyModel[196] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 486
		bodyModel[197] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 488
		bodyModel[198] = new ModelRendererTurbo(this, 338, 39, textureX, textureY); // Box 347
		bodyModel[199] = new ModelRendererTurbo(this, 316, 40, textureX, textureY); // Box 364 prime base
		bodyModel[200] = new ModelRendererTurbo(this, 316, 36, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[201] = new ModelRendererTurbo(this, 316, 36, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[202] = new ModelRendererTurbo(this, 316, 36, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[203] = new ModelRendererTurbo(this, 316, 36, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[204] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 559
		bodyModel[205] = new ModelRendererTurbo(this, 199, 233, textureX, textureY); // Box 552
		bodyModel[206] = new ModelRendererTurbo(this, 178, 233, textureX, textureY); // Box 553
		bodyModel[207] = new ModelRendererTurbo(this, 9, 199, textureX, textureY); // Box 555
		bodyModel[208] = new ModelRendererTurbo(this, 12, 203, textureX, textureY); // Box 556
		bodyModel[209] = new ModelRendererTurbo(this, 9, 205, textureX, textureY); // Box 557
		bodyModel[210] = new ModelRendererTurbo(this, 12, 197, textureX, textureY); // Box 558
		bodyModel[211] = new ModelRendererTurbo(this, 12, 192, textureX, textureY); // Box 559
		bodyModel[212] = new ModelRendererTurbo(this, 10, 194, textureX, textureY); // Box 560
		bodyModel[213] = new ModelRendererTurbo(this, 10, 189, textureX, textureY); // Box 561
		bodyModel[214] = new ModelRendererTurbo(this, 21, 203, textureX, textureY); // Box 562
		bodyModel[215] = new ModelRendererTurbo(this, 18, 205, textureX, textureY); // Box 563
		bodyModel[216] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 564
		bodyModel[217] = new ModelRendererTurbo(this, 21, 197, textureX, textureY); // Box 565
		bodyModel[218] = new ModelRendererTurbo(this, 19, 194, textureX, textureY); // Box 566
		bodyModel[219] = new ModelRendererTurbo(this, 21, 192, textureX, textureY); // Box 567
		bodyModel[220] = new ModelRendererTurbo(this, 19, 189, textureX, textureY); // Box 568
		bodyModel[221] = new ModelRendererTurbo(this, 93, 112, textureX, textureY); // Box 565
		bodyModel[222] = new ModelRendererTurbo(this, 121, 215, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[223] = new ModelRendererTurbo(this, 121, 209, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[224] = new ModelRendererTurbo(this, 493, 75, textureX, textureY, "lamp"); // Box 591 speedoooo
		bodyModel[225] = new ModelRendererTurbo(this, 80, 221, textureX, textureY); // Box 448
		bodyModel[226] = new ModelRendererTurbo(this, 94, 214, textureX, textureY); // Box 323
		bodyModel[227] = new ModelRendererTurbo(this, 80, 211, textureX, textureY); // Box 280
		bodyModel[228] = new ModelRendererTurbo(this, 94, 204, textureX, textureY); // Box 285
		bodyModel[229] = new ModelRendererTurbo(this, 229, 209, textureX, textureY); // Box 517
		bodyModel[230] = new ModelRendererTurbo(this, 229, 219, textureX, textureY); // Box 518
		bodyModel[231] = new ModelRendererTurbo(this, 215, 215, textureX, textureY); // Box 519
		bodyModel[232] = new ModelRendererTurbo(this, 215, 205, textureX, textureY); // Box 520
		bodyModel[233] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[234] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[235] = new ModelRendererTurbo(this, 340, 93, textureX, textureY); // Box 184
		bodyModel[236] = new ModelRendererTurbo(this, 340, 87, textureX, textureY); // Box 247 extra stack
		bodyModel[237] = new ModelRendererTurbo(this, 218, 52, textureX, textureY); // Box 224
		bodyModel[238] = new ModelRendererTurbo(this, 258, 52, textureX, textureY); // Box 223
		bodyModel[239] = new ModelRendererTurbo(this, 229, 52, textureX, textureY); // Box 222
		bodyModel[240] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 221
		bodyModel[241] = new ModelRendererTurbo(this, 219, 60, textureX, textureY); // Box 220
		bodyModel[242] = new ModelRendererTurbo(this, 236, 37, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[243] = new ModelRendererTurbo(this, 236, 37, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[244] = new ModelRendererTurbo(this, 220, 39, textureX, textureY); // Box 44
		bodyModel[245] = new ModelRendererTurbo(this, 244, 39, textureX, textureY); // Box 43
		bodyModel[246] = new ModelRendererTurbo(this, 235, 42, textureX, textureY); // Box 48
		bodyModel[247] = new ModelRendererTurbo(this, 258, 76, textureX, textureY); // Box 210
		bodyModel[248] = new ModelRendererTurbo(this, 218, 76, textureX, textureY); // Box 11
		bodyModel[249] = new ModelRendererTurbo(this, 221, 31, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[250] = new ModelRendererTurbo(this, 221, 31, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[251] = new ModelRendererTurbo(this, 235, 33, textureX, textureY); // Box 133
		bodyModel[252] = new ModelRendererTurbo(this, 467, 92, textureX, textureY); // Box 412 cs
		bodyModel[253] = new ModelRendererTurbo(this, 477, 92, textureX, textureY); // Box 413 cs
		bodyModel[254] = new ModelRendererTurbo(this, 469, 85, textureX, textureY); // Box 86 cs
		bodyModel[255] = new ModelRendererTurbo(this, 478, 100, textureX, textureY); // Box 531 cs
		bodyModel[256] = new ModelRendererTurbo(this, 377, 10, textureX, textureY, "cull"); // Box 354 cull horn mount
		bodyModel[257] = new ModelRendererTurbo(this, 354, 14, textureX, textureY); // Box 355
		bodyModel[258] = new ModelRendererTurbo(this, 354, 11, textureX, textureY); // Box 356
		bodyModel[259] = new ModelRendererTurbo(this, 94, 119, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[260] = new ModelRendererTurbo(this, 94, 119, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[261] = new ModelRendererTurbo(this, 88, 117, textureX, textureY); // Box 221
		bodyModel[262] = new ModelRendererTurbo(this, 100, 119, textureX, textureY); // Box 222
		bodyModel[263] = new ModelRendererTurbo(this, 207, 159, textureX, textureY); // Box 363
		bodyModel[264] = new ModelRendererTurbo(this, 257, 199, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[265] = new ModelRendererTurbo(this, 10, 178, textureX, textureY); // Box 401
		bodyModel[266] = new ModelRendererTurbo(this, 10, 173, textureX, textureY); // Box 402
		bodyModel[267] = new ModelRendererTurbo(this, 245, 33, textureX, textureY, "cull"); // Box 308 cull baffle
		bodyModel[268] = new ModelRendererTurbo(this, 245, 33, textureX, textureY, "cull"); // Box 309 cull baffle
		bodyModel[269] = new ModelRendererTurbo(this, 333, 39, textureX, textureY); // Box 402 arr speakerbell
		bodyModel[270] = new ModelRendererTurbo(this, 328, 40, textureX, textureY); // Box 0 arr speakerbell
		bodyModel[271] = new ModelRendererTurbo(this, 328, 40, textureX, textureY); // Box 213 arr speakerbell
		bodyModel[272] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 373
		bodyModel[273] = new ModelRendererTurbo(this, 354, 144, textureX, textureY); // Box 374
		bodyModel[274] = new ModelRendererTurbo(this, 333, 12, textureX, textureY); // Box 409 commander base
		bodyModel[275] = new ModelRendererTurbo(this, 333, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[276] = new ModelRendererTurbo(this, 306, 70, textureX, textureY); // Box 5 aww
		bodyModel[277] = new ModelRendererTurbo(this, 306, 65, textureX, textureY); // Box 378 aww
		bodyModel[278] = new ModelRendererTurbo(this, 225, 110, textureX, textureY); // Box 123 sunshade
		bodyModel[279] = new ModelRendererTurbo(this, 225, 107, textureX, textureY); // Box 311 sunshade
		bodyModel[280] = new ModelRendererTurbo(this, 421, 58, textureX, textureY, "cull"); // Box 381 winterization hatch taller
		bodyModel[281] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Box 382
		bodyModel[282] = new ModelRendererTurbo(this, 133, 216, textureX, textureY); // Box 383
		bodyModel[283] = new ModelRendererTurbo(this, 133, 211, textureX, textureY); // Box 384
		bodyModel[284] = new ModelRendererTurbo(this, 247, 147, textureX, textureY); // Box 385 professionals have standards
		bodyModel[285] = new ModelRendererTurbo(this, 330, 28, textureX, textureY, "lamp"); // Box 338 headlight highbeam
		bodyModel[286] = new ModelRendererTurbo(this, 320, 28, textureX, textureY, "lamp"); // Box 337 headlight highbeam
		bodyModel[287] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 336
		bodyModel[288] = new ModelRendererTurbo(this, 359, 114, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[289] = new ModelRendererTurbo(this, 359, 114, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[290] = new ModelRendererTurbo(this, 354, 38, textureX, textureY); // Box 522
		bodyModel[291] = new ModelRendererTurbo(this, 208, 149, textureX, textureY); // Box 393
		bodyModel[292] = new ModelRendererTurbo(this, 332, 19, textureX, textureY); // Box 543
		bodyModel[293] = new ModelRendererTurbo(this, 321, 19, textureX, textureY); // Box 544
		bodyModel[294] = new ModelRendererTurbo(this, 323, 22, textureX, textureY); // Box 545
		bodyModel[295] = new ModelRendererTurbo(this, 323, 16, textureX, textureY); // Box 546
		bodyModel[296] = new ModelRendererTurbo(this, 29, 243, textureX, textureY); // Box 296
		bodyModel[297] = new ModelRendererTurbo(this, 13, 243, textureX, textureY); // Box 297
		bodyModel[298] = new ModelRendererTurbo(this, 177, 245, textureX, textureY); // Box 298
		bodyModel[299] = new ModelRendererTurbo(this, 161, 245, textureX, textureY); // Box 299
		bodyModel[300] = new ModelRendererTurbo(this, -19, 233, textureX, textureY); // Box 50
		bodyModel[301] = new ModelRendererTurbo(this, 129, 235, textureX, textureY); // Box 475
		bodyModel[302] = new ModelRendererTurbo(this, 338, 12, textureX, textureY); // Box 409 commander base
		bodyModel[303] = new ModelRendererTurbo(this, 338, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[304] = new ModelRendererTurbo(this, 321, 213, textureX, textureY); // Box 281 1802 plow bit
		bodyModel[305] = new ModelRendererTurbo(this, 321, 226, textureX, textureY); // Box 282 1802 plow bit
		bodyModel[306] = new ModelRendererTurbo(this, 337, 223, textureX, textureY); // Box 283 1802 plow bit
		bodyModel[307] = new ModelRendererTurbo(this, 337, 210, textureX, textureY); // Box 284 1802 plow bit
		bodyModel[308] = new ModelRendererTurbo(this, 321, 239, textureX, textureY); // Box 332 1802 plow bit
		bodyModel[309] = new ModelRendererTurbo(this, 336, 236, textureX, textureY); // Box 335 1802 plow bit
		bodyModel[310] = new ModelRendererTurbo(this, 21, 164, textureX, textureY); // Box 268
		bodyModel[311] = new ModelRendererTurbo(this, 1, 164, textureX, textureY); // Box 269
		bodyModel[312] = new ModelRendererTurbo(this, 15, 166, textureX, textureY); // Box 431
		bodyModel[313] = new ModelRendererTurbo(this, 323, 201, textureX, textureY); // Box 323 1802 plow bit
		bodyModel[314] = new ModelRendererTurbo(this, 323, 190, textureX, textureY); // Box 324 1802 plow bit
		bodyModel[315] = new ModelRendererTurbo(this, 323, 179, textureX, textureY); // Box 325 1802 plow bit
		bodyModel[316] = new ModelRendererTurbo(this, 339, 198, textureX, textureY); // Box 326 1802 plow bit
		bodyModel[317] = new ModelRendererTurbo(this, 339, 187, textureX, textureY); // Box 327 1802 plow bit
		bodyModel[318] = new ModelRendererTurbo(this, 339, 176, textureX, textureY); // Box 328 1802 plow bit
		bodyModel[319] = new ModelRendererTurbo(this, 3, 178, textureX, textureY); // Box 329 1802 mu bit
		bodyModel[320] = new ModelRendererTurbo(this, 3, 173, textureX, textureY); // Box 330 1802 mu bit
		bodyModel[321] = new ModelRendererTurbo(this, 52, 193, textureX, textureY); // Box 331 1802 handrail
		bodyModel[322] = new ModelRendererTurbo(this, 81, 206, textureX, textureY); // Box 332 1802 handrail
		bodyModel[323] = new ModelRendererTurbo(this, 49, 206, textureX, textureY); // Box 333 1802 handrail
		bodyModel[324] = new ModelRendererTurbo(this, 335, 36, textureX, textureY); // Box 450
		bodyModel[325] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 325
		bodyModel[326] = new ModelRendererTurbo(this, 17, 173, textureX, textureY); // Box 326 snowplow mu plug

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

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[37].setRotationPoint(-10F, 6F, -10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		bodyModel[38].setRotationPoint(-10F, 6F, 7.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 14, 4, 15, 0F); // Box 488
		bodyModel[39].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 489
		bodyModel[40].setRotationPoint(-10F, 5F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 14, 1, 3, 0F); // Box 805
		bodyModel[41].setRotationPoint(-10F, 5F, 7.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 60
		bodyModel[42].setRotationPoint(-10F, 3F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		bodyModel[43].setRotationPoint(-14F, 3F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-14F, 3F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(11F, 3F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[46].setRotationPoint(11F, 3F, -6F);

		bodyModel[47].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 498
		bodyModel[47].setRotationPoint(9.5F, 6.5F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 430
		bodyModel[48].setRotationPoint(5.5F, 3F, -10.01F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 431
		bodyModel[49].setRotationPoint(9F, 3F, -10.01F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 432
		bodyModel[50].setRotationPoint(9F, 3F, 10.01F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 433
		bodyModel[51].setRotationPoint(5.5F, 3F, 10.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 72
		bodyModel[52].setRotationPoint(-10F, 3F, 5F);

		bodyModel[53].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 78
		bodyModel[53].setRotationPoint(-10F, 3F, -4.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[54].setRotationPoint(-24F, 2.75F, -2F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[55].setRotationPoint(20F, 2.75F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 75, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[56].setRotationPoint(-37F, 3F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[57].setRotationPoint(-23.5F, 2F, -10.6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[58].setRotationPoint(-23.5F, 2F, 6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[59].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[60].setRotationPoint(-22.5F, 2F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 322
		bodyModel[61].setRotationPoint(20.5F, 2F, -10.6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[62].setRotationPoint(21.5F, 2F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 324
		bodyModel[63].setRotationPoint(20.5F, 2F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[64].setRotationPoint(21.5F, 2F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[65].setRotationPoint(-37F, 2.5F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 327
		bodyModel[66].setRotationPoint(33F, 2.5F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 490
		bodyModel[67].setRotationPoint(-14F, 3F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 330
		bodyModel[68].setRotationPoint(-11F, 3F, 11F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[69].setRotationPoint(5.75F, 6F, -10.01F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 334
		bodyModel[70].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 335
		bodyModel[71].setRotationPoint(-37.01F, 7F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 336
		bodyModel[72].setRotationPoint(38.01F, 7F, 10F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 337
		bodyModel[73].setRotationPoint(38.01F, 7F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[74].setRotationPoint(12F, 3F, 11F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 339
		bodyModel[75].setRotationPoint(9F, 3F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 340
		bodyModel[76].setRotationPoint(5.5F, 3F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 23, 2, 0, 0F); // Box 342
		bodyModel[77].setRotationPoint(-11F, 3F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[78].setRotationPoint(-14F, 3F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[79].setRotationPoint(12F, 3F, -11F);

		bodyModel[80].addBox(-1.5F, -1.5F, 0F, 3, 3, 20, 0F); // Box 346
		bodyModel[80].setRotationPoint(6F, 6.5F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 344
		bodyModel[81].setRotationPoint(-22F, -4F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 345 gp16 cutback frontbit
		bodyModel[82].setRotationPoint(-28F, -4F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // Box 346 mogus
		bodyModel[83].setRotationPoint(-32F, -4F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 132
		bodyModel[84].setRotationPoint(-28F, -12F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 10, 0, 0F); // Box 133
		bodyModel[85].setRotationPoint(-34F, -6F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 134
		bodyModel[86].setRotationPoint(-34F, -6F, 11F);

		bodyModel[87].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 136
		bodyModel[87].setRotationPoint(-33F, -12F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[88].setRotationPoint(-32.75F, -1.5F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[89].setRotationPoint(-34F, -12F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[90].setRotationPoint(-34F, -12F, 1F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 218
		bodyModel[91].setRotationPoint(-34F, -12F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 215
		bodyModel[92].setRotationPoint(-31F, -12F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[93].setRotationPoint(-29F, -4F, -11.01F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[94].setRotationPoint(-37.5F, -2F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[95].setRotationPoint(-37.5F, -3F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 9
		bodyModel[96].setRotationPoint(-21F, -17F, 10F);

		bodyModel[97].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 10
		bodyModel[97].setRotationPoint(-21F, -17F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 15
		bodyModel[98].setRotationPoint(-22F, -17F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 21
		bodyModel[99].setRotationPoint(-11F, -17F, -11F);

		bodyModel[100].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[100].setRotationPoint(-10.5F, -17F, 10.5F);

		bodyModel[101].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[101].setRotationPoint(-21.5F, -17F, -10.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[102].setRotationPoint(-22F, -20F, -7F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[103].setRotationPoint(-11F, -20F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[104].setRotationPoint(32F, -19F, -7F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 20, 2, 0F); // Box 220
		bodyModel[105].setRotationPoint(32F, -19F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[106].setRotationPoint(32F, -19F, 1F);

		bodyModel[107].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 223
		bodyModel[107].setRotationPoint(-10F, -19F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[108].setRotationPoint(33.2F, -6F, 4.5F);
		bodyModel[108].rotateAngleY = -1.11701072F;

		bodyModel[109].addBox(0.5F, 0F, 0F, 0, 5, 1, 0F); // Box 43
		bodyModel[109].setRotationPoint(33.2F, -4F, 4.5F);
		bodyModel[109].rotateAngleY = -1.11701072F;

		bodyModel[110].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 89 dynamic fan
		bodyModel[110].setRotationPoint(7F, -20.5F, -3.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 91
		bodyModel[111].setRotationPoint(6.5F, -20F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[112].setRotationPoint(6.5F, -18F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[113].setRotationPoint(2.5F, -18F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[114].setRotationPoint(14.5F, -18F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[115].setRotationPoint(6.5F, -20F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[116].setRotationPoint(2.5F, -20F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 177
		bodyModel[117].setRotationPoint(14.5F, -20F, 7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[118].setRotationPoint(6.5F, -20F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[119].setRotationPoint(14.5F, -20F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[120].setRotationPoint(14.5F, -18F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[121].setRotationPoint(6.5F, -18F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[122].setRotationPoint(2.5F, -18F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[123].setRotationPoint(2.5F, -20F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[124].setRotationPoint(3.5F, -21F, -1.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185
		bodyModel[125].setRotationPoint(15.5F, -21F, -1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247 extra stack
		bodyModel[126].setRotationPoint(3.5F, -23F, -1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248 extra stack
		bodyModel[127].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186
		bodyModel[128].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 188
		bodyModel[129].setRotationPoint(25.5F, -20F, -2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 189
		bodyModel[130].setRotationPoint(19.5F, -20F, -2.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 191
		bodyModel[131].setRotationPoint(31.5F, -19.5F, -1F);

		bodyModel[132].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 196 winterization hatch tall
		bodyModel[132].setRotationPoint(24F, -22.5F, -3.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 176
		bodyModel[133].setRotationPoint(-6F, -7F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 500
		bodyModel[134].setRotationPoint(-10F, -12F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[135].setRotationPoint(-5F, -12F, -11.01F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 462
		bodyModel[136].setRotationPoint(34F, -7F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 463
		bodyModel[137].setRotationPoint(34F, -7F, 11F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 362
		bodyModel[138].setRotationPoint(-10F, -4F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[139].setRotationPoint(-4F, -4F, -11.01F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 363
		bodyModel[140].setRotationPoint(-10F, -4F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[141].setRotationPoint(-8F, -4F, 11.01F);

		bodyModel[142].addBox(0F, 0F, 0F, 40, 8, 0, 0F); // Box 38R
		bodyModel[142].setRotationPoint(-6F, -7F, 11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.25F, 0F, 0F); // Box 314
		bodyModel[143].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 359 headlight rear 1
		bodyModel[144].setRotationPoint(34.75F, -18F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 360
		bodyModel[145].setRotationPoint(34.5F, -18F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 223 headlight rear 2
		bodyModel[146].setRotationPoint(34.75F, -16F, -1F);

		bodyModel[147].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[147].setRotationPoint(32.55F, -16.5F, -6F);
		bodyModel[147].rotateAngleY = -0.46687557F;

		bodyModel[148].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[148].setRotationPoint(32.55F, -16.5F, 6F);
		bodyModel[148].rotateAngleY = 0.46687557F;

		bodyModel[149].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 361
		bodyModel[149].setRotationPoint(-2.5F, -22F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
		bodyModel[150].setRotationPoint(-2F, -21F, -0.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[151].setRotationPoint(-3.5F, -22F, 0.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 364
		bodyModel[152].setRotationPoint(-4F, -22F, -1.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[153].setRotationPoint(0.5F, -17.5F, 7.7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[154].setRotationPoint(0.5F, -18.5F, 7.7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[155].setRotationPoint(0.75F, -17F, 7.95F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[156].setRotationPoint(0.5F, -19.5F, 6.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[157].setRotationPoint(19F, -17.5F, -7.05F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 583
		bodyModel[158].setRotationPoint(19F, -17.5F, 6.05F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 341
		bodyModel[159].setRotationPoint(-33F, -7F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[160].setRotationPoint(-12.5F, 3F, -10.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[161].setRotationPoint(-12.5F, 2F, -10.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[162].setRotationPoint(-12.25F, 3.5F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[163].setRotationPoint(-37F, -1F, 4.75F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[164].setRotationPoint(-37F, -1F, -6.75F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[165].setRotationPoint(-37.25F, -1F, 4.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[166].setRotationPoint(-37.25F, -1F, -6.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[167].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear
		bodyModel[168].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight rear
		bodyModel[169].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[170].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[171].setRotationPoint(-39.01F, 6F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[172].setRotationPoint(-39.01F, 6F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[173].setRotationPoint(-41F, 7F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[174].setRotationPoint(-41F, 7F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[175].setRotationPoint(-40F, 6F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[176].setRotationPoint(-40F, 6F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[177].setRotationPoint(41F, 7F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[178].setRotationPoint(41F, 7F, -10F);

		bodyModel[179].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[179].setRotationPoint(41F, 6F, -10F);

		bodyModel[180].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[180].setRotationPoint(41F, 6F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[181].setRotationPoint(6.5F, -18.5F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[182].setRotationPoint(6.5F, -18.5F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F); // Box 452 rear fuel fill
		bodyModel[183].setRotationPoint(4F, 3F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -2.1F, 0F, -0.1F, -2.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 1.9F, 0F, -0.1F, 1.9F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 452 rear fuel fill
		bodyModel[184].setRotationPoint(4F, 3F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[185].setRotationPoint(-19F, -16F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 306 cull aww
		bodyModel[186].setRotationPoint(-19F, -16F, -12.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 455
		bodyModel[187].setRotationPoint(4F, 5F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[188].setRotationPoint(5F, 4F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 457
		bodyModel[189].setRotationPoint(1F, 4F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 458
		bodyModel[190].setRotationPoint(1F, 4F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[191].setRotationPoint(5F, 4F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[192].setRotationPoint(-3F, 4F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[193].setRotationPoint(-3F, 4F, 11F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 456 cull
		bodyModel[194].setRotationPoint(-38F, 7F, -9F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 476 cull
		bodyModel[195].setRotationPoint(38F, 7F, -9F);

		bodyModel[196].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 486
		bodyModel[196].setRotationPoint(-37F, 2F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 488
		bodyModel[197].setRotationPoint(-37F, 2F, -7F);

		bodyModel[198].addBox(0F, 0F, 2F, 1, 2, 0, 0F); // Box 347
		bodyModel[198].setRotationPoint(-13F, -22F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[199].setRotationPoint(-23F, -21F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[200].setRotationPoint(-23F, -21.5F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[201].setRotationPoint(-23F, -21.5F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[202].setRotationPoint(-23F, -21.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[203].setRotationPoint(-23F, -21.5F, -1F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 559
		bodyModel[204].setRotationPoint(-12F, -19F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[205].setRotationPoint(38.01F, 6F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[206].setRotationPoint(38.01F, 6F, -8F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 555
		bodyModel[207].setRotationPoint(34F, 5F, -10F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 556
		bodyModel[208].setRotationPoint(34F, 7F, -8F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 557
		bodyModel[209].setRotationPoint(34F, 8F, -11F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 558
		bodyModel[210].setRotationPoint(34F, 4F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 559
		bodyModel[211].setRotationPoint(34F, 2F, -7F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 560
		bodyModel[212].setRotationPoint(34F, 3F, -9F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 561
		bodyModel[213].setRotationPoint(34F, 1F, -8F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 562
		bodyModel[214].setRotationPoint(34F, 7F, 8F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 563
		bodyModel[215].setRotationPoint(34F, 8F, 8F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 0, 3, 0F); // Box 564
		bodyModel[216].setRotationPoint(34F, 5F, 7F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 565
		bodyModel[217].setRotationPoint(34F, 4F, 7F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 566
		bodyModel[218].setRotationPoint(34F, 3F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 567
		bodyModel[219].setRotationPoint(34F, 2F, 7F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 568
		bodyModel[220].setRotationPoint(34F, 1F, 6F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 565
		bodyModel[221].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[222].setRotationPoint(37.5F, -2F, -2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[223].setRotationPoint(37.5F, -3F, -2F);

		bodyModel[224].addShapeBox(0F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo
		bodyModel[224].setRotationPoint(-22.1F, -17F, 7F);
		bodyModel[224].rotateAngleY = -1.3962634F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[225].setRotationPoint(-40F, 5F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[226].setRotationPoint(-40F, 5F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[227].setRotationPoint(-40F, 4F, 2F);

		bodyModel[228].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[228].setRotationPoint(-40F, 4F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[229].setRotationPoint(40F, 4F, 2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[230].setRotationPoint(40F, 5F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[231].setRotationPoint(40F, 5F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[232].setRotationPoint(40F, 4F, -8F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[233].setRotationPoint(8F, -21F, -1.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[234].setRotationPoint(8F, -23F, -1.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184
		bodyModel[235].setRotationPoint(11F, -21F, -1.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 247 extra stack
		bodyModel[236].setRotationPoint(11F, -23F, -1.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[237].setRotationPoint(-22F, -20F, 7F);

		bodyModel[238].addShapeBox(-0.5F, 0F, -3.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[238].setRotationPoint(-10.5F, -20F, 10.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[239].setRotationPoint(-21F, -20F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[240].setRotationPoint(-21F, -20F, -11F);

		bodyModel[241].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[241].setRotationPoint(-21F, -20F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[242].setRotationPoint(-24.5F, -18F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[243].setRotationPoint(-24.5F, -20F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[244].setRotationPoint(-24F, -20F, 1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[245].setRotationPoint(-24F, -20F, -6F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[246].setRotationPoint(-24F, -20F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[247].setRotationPoint(-11F, -20F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[248].setRotationPoint(-22F, -20F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[249].setRotationPoint(-22.05F, -18.5F, -6F);
		bodyModel[249].rotateAngleY = 0.38397244F;

		bodyModel[250].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[250].setRotationPoint(-22.05F, -18.5F, 6F);
		bodyModel[250].rotateAngleY = -0.38397244F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[251].setRotationPoint(-24F, -16F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[252].setRotationPoint(-15.05F, -14F, 1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[253].setRotationPoint(-21.75F, -12F, 3F);
		bodyModel[253].rotateAngleY = -0.45378561F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[254].setRotationPoint(-21.75F, -14F, 3F);
		bodyModel[254].rotateAngleY = -0.45378561F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[255].setRotationPoint(-21.75F, -8F, 3F);
		bodyModel[255].rotateAngleY = -0.45378561F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F); // Box 354 cull horn mount
		bodyModel[256].setRotationPoint(-2F, -20.5F, -2F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[257].setRotationPoint(-3.5F, -23F, -1F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[258].setRotationPoint(-3F, -23F, 0F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[259].setRotationPoint(-31.75F, -11F, -6.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[260].setRotationPoint(-31.75F, -11F, 4.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[261].setRotationPoint(-31.75F, -9F, -6.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 222
		bodyModel[262].setRotationPoint(-31.75F, -2F, -6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[263].setRotationPoint(-29F, -2F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[264].setRotationPoint(-13F, 2F, 8.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[265].setRotationPoint(-37F, -5.5F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[266].setRotationPoint(-37.5F, -5.25F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 cull baffle
		bodyModel[267].setRotationPoint(-25.25F, -17F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 cull baffle
		bodyModel[268].setRotationPoint(-25.25F, -19F, -1F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 arr speakerbell
		bodyModel[269].setRotationPoint(-20F, -21.5F, 3.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, 0.125F, 0F, 0.25F, 0.15F, 0F, 0.25F, 0.25F, 0.25F, -0.125F, -0.25F, 0.25F, -0.125F, 0.125F, 0F, 0.25F, 0.15F); // Box 0 arr speakerbell
		bodyModel[270].setRotationPoint(-21F, -21.5F, 2.75F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.15F, 0.25F, -0.125F, 0.125F, 0.25F, -0.125F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.15F, 0.25F, -0.125F, 0.125F, 0.25F, -0.125F, -0.25F, 0F, 0.25F, 0.25F); // Box 213 arr speakerbell
		bodyModel[271].setRotationPoint(-21F, -21.5F, 4.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F, 0F); // Box 373
		bodyModel[272].setRotationPoint(-5F, -17.5F, -7.05F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F, 0F); // Box 374
		bodyModel[273].setRotationPoint(-5F, -17.5F, 6.05F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[274].setRotationPoint(-21F, -21F, -0.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[275].setRotationPoint(-21F, -22F, -0.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[276].setRotationPoint(-19F, -17F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378 aww
		bodyModel[277].setRotationPoint(-19F, -17F, -13F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123 sunshade
		bodyModel[278].setRotationPoint(-20.5F, -17F, -11F);
		bodyModel[278].rotateAngleX = -0.78539816F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311 sunshade
		bodyModel[279].setRotationPoint(-20.5F, -17F, 11F);
		bodyModel[279].rotateAngleX = 0.78539816F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381 winterization hatch taller
		bodyModel[280].setRotationPoint(24F, -23.5F, -3.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-1F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[281].setRotationPoint(-34F, -12F, 11.01F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383
		bodyModel[282].setRotationPoint(37F, -5.5F, 2F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 384
		bodyModel[283].setRotationPoint(37.5F, -5.25F, 2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 385 professionals have standards
		bodyModel[284].setRotationPoint(-32F, -4F, 5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 headlight highbeam
		bodyModel[285].setRotationPoint(-24.75F, -22F, -2F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 headlight highbeam
		bodyModel[286].setRotationPoint(-24.75F, -22F, 0F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[287].setRotationPoint(-24F, -22F, -2F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[288].setRotationPoint(31.75F, -11F, -6.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[289].setRotationPoint(31.75F, -11F, 4.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0.5F, 0F, 0F, -3F, 5F, 0F, -3F, 5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, -5F, 0F, -2.5F, -5F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[290].setRotationPoint(-30F, -7F, -11.01F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 393
		bodyModel[291].setRotationPoint(-8.25F, -1.5F, 7F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 543
		bodyModel[292].setRotationPoint(-22F, -21F, -6F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 544
		bodyModel[293].setRotationPoint(-22.5F, -22F, -6F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 545
		bodyModel[294].setRotationPoint(-24F, -21.75F, -7F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 546
		bodyModel[295].setRotationPoint(-23.5F, -21.75F, -5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[296].setRotationPoint(-38F, 5F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[297].setRotationPoint(-38F, 5F, 4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[298].setRotationPoint(38F, 5F, 4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[299].setRotationPoint(38F, 5F, -9F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[300].setRotationPoint(-40F, 9F, -10F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 475
		bodyModel[301].setRotationPoint(38F, 9F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[302].setRotationPoint(-19F, -21F, -0.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[303].setRotationPoint(-19F, -22F, -0.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 281 1802 plow bit
		bodyModel[304].setRotationPoint(-39F, 6F, 0F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 282 1802 plow bit
		bodyModel[305].setRotationPoint(-40F, 7F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283 1802 plow bit
		bodyModel[306].setRotationPoint(-40F, 7F, -11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284 1802 plow bit
		bodyModel[307].setRotationPoint(-39F, 6F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, -1F, -3.5F, 0F, -1F); // Box 332 1802 plow bit
		bodyModel[308].setRotationPoint(-41F, 8F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-5F, 0F, 0F, 4.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, -1F, 3F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335 1802 plow bit
		bodyModel[309].setRotationPoint(-41F, 8F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[310].setRotationPoint(-40F, 1F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 269
		bodyModel[311].setRotationPoint(-40F, 1F, 1F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 431
		bodyModel[312].setRotationPoint(-40F, 1F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, 0F, -3F, 0F, 0F, -0.65F, 0F, 0F, 0.15F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F); // Box 323 1802 plow bit
		bodyModel[313].setRotationPoint(-39F, 4F, 2F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, -0.75F, -1F, 0F, -0.75F, 1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 324 1802 plow bit
		bodyModel[314].setRotationPoint(-39F, 3F, 2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1.5F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 325 1802 plow bit
		bodyModel[315].setRotationPoint(-40F, 2F, 2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0.15F, 0F, 0F, -0.65F, 0F, 0F); // Box 326 1802 plow bit
		bodyModel[316].setRotationPoint(-39F, 4F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -0.75F, 0.5F, 0F, -0.75F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 327 1802 plow bit
		bodyModel[317].setRotationPoint(-39F, 3F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, 1.5F, 0F, -1F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 328 1802 plow bit
		bodyModel[318].setRotationPoint(-40F, 2F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329 1802 mu bit
		bodyModel[319].setRotationPoint(-38F, -5.5F, -5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 330 1802 mu bit
		bodyModel[320].setRotationPoint(-38.5F, -5.25F, -5F);

		bodyModel[321].addBox(0F, 0F, 0F, 0, 8, 14, 0F); // Box 331 1802 handrail
		bodyModel[321].setRotationPoint(-38F, -7F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, -1.5F, 3F, 1F, -1.5F, 3F, 1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332 1802 handrail
		bodyModel[322].setRotationPoint(-37F, -7F, -10F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,-1F, 0F, -4F, 1F, 0F, -4F, 1F, -1.5F, 3F, -1F, -1.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333 1802 handrail
		bodyModel[323].setRotationPoint(-37F, -7F, 11F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[324].setRotationPoint(-16.5F, -21F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[325].setRotationPoint(-33F, -4F, 11.01F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 326 snowplow mu plug
		bodyModel[326].setRotationPoint(-37.5F, -3.25F, -5F);
	}
	ModelBlombergBnew theBlombi = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 13245) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1435){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_DarkGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3546){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_DarkerGrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theBlombi.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.37, -0.0, 0);//front & rear
			theB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.74, 0, 0);//rear
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}