//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.08.2022 - 19:54:35
// Last changed on: 23.08.2022 - 19:54:35

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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

public class ModelSDP40 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSDP40() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[453];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307
		bodyModel[1] = new ModelRendererTurbo(this, 107, 149, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[2] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[3] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[4] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[5] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[6] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[7] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[8] = new ModelRendererTurbo(this, 498, 45, textureX, textureY); // Box 318
		bodyModel[9] = new ModelRendererTurbo(this, 503, 5, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 498, 2, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[11] = new ModelRendererTurbo(this, 498, 2, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[12] = new ModelRendererTurbo(this, 166, 194, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 470, 40, textureX, textureY); // Box 318
		bodyModel[14] = new ModelRendererTurbo(this, 474, 45, textureX, textureY); // Box 318
		bodyModel[15] = new ModelRendererTurbo(this, 201, 123, textureX, textureY); // Box 291
		bodyModel[16] = new ModelRendererTurbo(this, 208, 123, textureX, textureY); // Box 315
		bodyModel[17] = new ModelRendererTurbo(this, 198, 123, textureX, textureY); // Box 315
		bodyModel[18] = new ModelRendererTurbo(this, 416, 101, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 501, 124, textureX, textureY); // Box 259
		bodyModel[20] = new ModelRendererTurbo(this, 501, 121, textureX, textureY); // Box 259
		bodyModel[21] = new ModelRendererTurbo(this, 453, 116, textureX, textureY); // Box 259
		bodyModel[22] = new ModelRendererTurbo(this, 453, 113, textureX, textureY); // Box 259
		bodyModel[23] = new ModelRendererTurbo(this, 476, 151, textureX, textureY); // Box 319
		bodyModel[24] = new ModelRendererTurbo(this, 476, 156, textureX, textureY); // Box 319
		bodyModel[25] = new ModelRendererTurbo(this, 476, 161, textureX, textureY); // Box 319
		bodyModel[26] = new ModelRendererTurbo(this, 465, 151, textureX, textureY); // Box 319
		bodyModel[27] = new ModelRendererTurbo(this, 465, 156, textureX, textureY); // Box 319
		bodyModel[28] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 319
		bodyModel[29] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 242
		bodyModel[30] = new ModelRendererTurbo(this, 449, 128, textureX, textureY, BoxName.ditch); // Box 241 ditchlight r
		bodyModel[31] = new ModelRendererTurbo(this, 449, 128, textureX, textureY, BoxName.ditch); // Box 240 ditchlight r
		bodyModel[32] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 239
		bodyModel[33] = new ModelRendererTurbo(this, 221, 145, textureX, textureY); // Box 315
		bodyModel[34] = new ModelRendererTurbo(this, 461, 65, textureX, textureY); // Box 31
		bodyModel[35] = new ModelRendererTurbo(this, 454, 67, textureX, textureY, "lamp"); // Box 295 lamp rear SDP40
		bodyModel[36] = new ModelRendererTurbo(this, 454, 67, textureX, textureY, "lamp"); // Box 295 lamp rear SDP40
		bodyModel[37] = new ModelRendererTurbo(this, 474, 148, textureX, textureY); // Box 329
		bodyModel[38] = new ModelRendererTurbo(this, 463, 148, textureX, textureY); // Box 323
		bodyModel[39] = new ModelRendererTurbo(this, 499, 42, textureX, textureY); // Box 318
		bodyModel[40] = new ModelRendererTurbo(this, 455, 136, textureX, textureY); // Box 234
		bodyModel[41] = new ModelRendererTurbo(this, 503, 138, textureX, textureY); // Box 234
		bodyModel[42] = new ModelRendererTurbo(this, 449, 132, textureX, textureY); // Box 251
		bodyModel[43] = new ModelRendererTurbo(this, 509, 132, textureX, textureY); // Box 241
		bodyModel[44] = new ModelRendererTurbo(this, 474, 153, textureX, textureY); // Box 329
		bodyModel[45] = new ModelRendererTurbo(this, 474, 158, textureX, textureY); // Box 327
		bodyModel[46] = new ModelRendererTurbo(this, 474, 163, textureX, textureY); // Box 326
		bodyModel[47] = new ModelRendererTurbo(this, 463, 153, textureX, textureY); // Box 323
		bodyModel[48] = new ModelRendererTurbo(this, 463, 158, textureX, textureY); // Box 322
		bodyModel[49] = new ModelRendererTurbo(this, 463, 163, textureX, textureY); // Box 319
		bodyModel[50] = new ModelRendererTurbo(this, 458, 115, textureX, textureY); // Box 234
		bodyModel[51] = new ModelRendererTurbo(this, 506, 132, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 452, 132, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 481, 112, textureX, textureY); // Box 266
		bodyModel[54] = new ModelRendererTurbo(this, 468, 124, textureX, textureY); // Box 265
		bodyModel[55] = new ModelRendererTurbo(this, 488, 124, textureX, textureY); // Box 264
		bodyModel[56] = new ModelRendererTurbo(this, 458, 113, textureX, textureY); // Box 262
		bodyModel[57] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 261
		bodyModel[58] = new ModelRendererTurbo(this, 467, 116, textureX, textureY); // Box 259
		bodyModel[59] = new ModelRendererTurbo(this, 488, 116, textureX, textureY); // Box 164
		bodyModel[60] = new ModelRendererTurbo(this, 460, 75, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 289
		bodyModel[62] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 288
		bodyModel[63] = new ModelRendererTurbo(this, 175, 5, textureX, textureY); // Box 287
		bodyModel[64] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[65] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[66] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[67] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[68] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[69] = new ModelRendererTurbo(this, 208, 12, textureX, textureY); // Box 421 prime base
		bodyModel[70] = new ModelRendererTurbo(this, 463, 23, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[71] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[72] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[73] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[74] = new ModelRendererTurbo(this, 89, 134, textureX, textureY); // Box 402
		bodyModel[75] = new ModelRendererTurbo(this, 88, 139, textureX, textureY); // Box 401
		bodyModel[76] = new ModelRendererTurbo(this, 88, 144, textureX, textureY); // Box 400
		bodyModel[77] = new ModelRendererTurbo(this, 71, 134, textureX, textureY); // Box 396
		bodyModel[78] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[79] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[80] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[81] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[82] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[83] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[84] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[85] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 398
		bodyModel[86] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 397
		bodyModel[87] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 396
		bodyModel[88] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 395
		bodyModel[89] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[90] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[91] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 447
		bodyModel[92] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 446
		bodyModel[93] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[94] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[95] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[96] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[97] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[98] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[99] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[100] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[101] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[102] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[103] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, BoxName.commander); // Box 340 glow commander
		bodyModel[104] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[105] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[106] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 452
		bodyModel[107] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[108] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[109] = new ModelRendererTurbo(this, 187, 35, textureX, textureY); // Box 329
		bodyModel[110] = new ModelRendererTurbo(this, 187, 29, textureX, textureY); // Box 328
		bodyModel[111] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[112] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[113] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[114] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[115] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[116] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[117] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, BoxName.commander); // Box 410 glow commander
		bodyModel[118] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[119] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f
		bodyModel[120] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, BoxName.ditch); // Box 189 ditchlight f
		bodyModel[121] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[122] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[123] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[124] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[125] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[126] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[127] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[128] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[129] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[130] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[131] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[132] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[133] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[134] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[135] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[136] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[137] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[138] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[139] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[140] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[141] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[142] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[143] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[144] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[145] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[146] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[147] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[148] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[149] = new ModelRendererTurbo(this, 229, 135, textureX, textureY); // Box 316
		bodyModel[150] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[151] = new ModelRendererTurbo(this, 118, 135, textureX, textureY); // Box 312
		bodyModel[152] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[153] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[154] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[155] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[156] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[157] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[158] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[159] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[160] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[161] = new ModelRendererTurbo(this, 306, 19, textureX, textureY); // Box 274
		bodyModel[162] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[163] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[164] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[165] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[166] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[167] = new ModelRendererTurbo(this, 99, 136, textureX, textureY); // Box 258
		bodyModel[168] = new ModelRendererTurbo(this, 86, 136, textureX, textureY); // Box 274
		bodyModel[169] = new ModelRendererTurbo(this, 86, 141, textureX, textureY); // Box 273
		bodyModel[170] = new ModelRendererTurbo(this, 86, 146, textureX, textureY); // Box 272
		bodyModel[171] = new ModelRendererTurbo(this, 88, 132, textureX, textureY); // Box 271
		bodyModel[172] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[173] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[174] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[175] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[176] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[177] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[178] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[179] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[180] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[181] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[182] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[183] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[184] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[185] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[187] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[188] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[189] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[190] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[191] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[192] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[193] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[194] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[195] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[196] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[197] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[198] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[199] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[201] = new ModelRendererTurbo(this, 424, 163, textureX, textureY); // Box 4
		bodyModel[202] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[204] = new ModelRendererTurbo(this, 439, 165, textureX, textureY); // Box 4
		bodyModel[205] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[206] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[207] = new ModelRendererTurbo(this, 366, 168, textureX, textureY); // Box 3
		bodyModel[208] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[209] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[211] = new ModelRendererTurbo(this, 38, 160, textureX, textureY); // Box 4
		bodyModel[212] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[213] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[214] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 4
		bodyModel[215] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[216] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[217] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[218] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[219] = new ModelRendererTurbo(this, 309, 116, textureX, textureY); // Box 36
		bodyModel[220] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[222] = new ModelRendererTurbo(this, 297, 231, textureX, textureY); // Box 23
		bodyModel[223] = new ModelRendererTurbo(this, 95, 233, textureX, textureY); // Box 63
		bodyModel[224] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[225] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 409
		bodyModel[226] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[227] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[228] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[229] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[230] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[231] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 408
		bodyModel[232] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[233] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[234] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[235] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // Box 195
		bodyModel[236] = new ModelRendererTurbo(this, 435, 220, textureX, textureY); // Box 297 vent 2 part f
		bodyModel[237] = new ModelRendererTurbo(this, 387, 220, textureX, textureY); // Box 299 vent 2 part e
		bodyModel[238] = new ModelRendererTurbo(this, 435, 220, textureX, textureY); // Box 272 vent 2 part f
		bodyModel[239] = new ModelRendererTurbo(this, 387, 220, textureX, textureY); // Box 273 vent 2 part e
		bodyModel[240] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[241] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[242] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[243] = new ModelRendererTurbo(this, 133, 90, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[244] = new ModelRendererTurbo(this, 125, 87, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[245] = new ModelRendererTurbo(this, 173, 57, textureX, textureY); // Box 184 o2 generator
		bodyModel[246] = new ModelRendererTurbo(this, 238, 196, textureX, textureY); // Box 378
		bodyModel[247] = new ModelRendererTurbo(this, 499, 29, textureX, textureY); // Box 379
		bodyModel[248] = new ModelRendererTurbo(this, 198, 195, textureX, textureY); // Box 380
		bodyModel[249] = new ModelRendererTurbo(this, 413, 15, textureX, textureY); // Box 146
		bodyModel[250] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 147
		bodyModel[251] = new ModelRendererTurbo(this, 499, 20, textureX, textureY); // Box 148
		bodyModel[252] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 361
		bodyModel[253] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 362
		bodyModel[254] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 363
		bodyModel[255] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 364
		bodyModel[256] = new ModelRendererTurbo(this, 483, 8, textureX, textureY); // Box 376
		bodyModel[257] = new ModelRendererTurbo(this, 483, 14, textureX, textureY); // Box 377
		bodyModel[258] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[259] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[260] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[261] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[262] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[263] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[264] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[265] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[266] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[267] = new ModelRendererTurbo(this, 184, 154, textureX, textureY); // Box 564
		bodyModel[268] = new ModelRendererTurbo(this, 188, 166, textureX, textureY); // Box 565
		bodyModel[269] = new ModelRendererTurbo(this, 180, 150, textureX, textureY); // Box 566
		bodyModel[270] = new ModelRendererTurbo(this, 187, 161, textureX, textureY); // Box 567
		bodyModel[271] = new ModelRendererTurbo(this, 186, 156, textureX, textureY); // Box 568
		bodyModel[272] = new ModelRendererTurbo(this, 187, 161, textureX, textureY); // Box 569
		bodyModel[273] = new ModelRendererTurbo(this, 188, 166, textureX, textureY); // Box 570
		bodyModel[274] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[275] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[276] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[277] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[278] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 576
		bodyModel[279] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 577
		bodyModel[280] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[281] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[282] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 562
		bodyModel[283] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box 563
		bodyModel[284] = new ModelRendererTurbo(this, 231, 151, textureX, textureY); // Box 575
		bodyModel[285] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 436
		bodyModel[286] = new ModelRendererTurbo(this, 325, 137, textureX, textureY); // Box 437
		bodyModel[287] = new ModelRendererTurbo(this, 330, 142, textureX, textureY); // Box 438
		bodyModel[288] = new ModelRendererTurbo(this, 325, 142, textureX, textureY); // Box 439
		bodyModel[289] = new ModelRendererTurbo(this, 383, 65, textureX, textureY); // Box 201
		bodyModel[290] = new ModelRendererTurbo(this, 383, 67, textureX, textureY); // Box 200
		bodyModel[291] = new ModelRendererTurbo(this, 353, 110, textureX, textureY); // Box 197
		bodyModel[292] = new ModelRendererTurbo(this, 372, 114, textureX, textureY); // Box 113
		bodyModel[293] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[294] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Box 199
		bodyModel[295] = new ModelRendererTurbo(this, 380, 65, textureX, textureY); // Box 198
		bodyModel[296] = new ModelRendererTurbo(this, 312, 114, textureX, textureY); // Box 196
		bodyModel[297] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 116
		bodyModel[298] = new ModelRendererTurbo(this, 373, 110, textureX, textureY); // Box 644
		bodyModel[299] = new ModelRendererTurbo(this, 373, 110, textureX, textureY); // Box 645
		bodyModel[300] = new ModelRendererTurbo(this, 87, 103, textureX, textureY); // Box 246
		bodyModel[301] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 176
		bodyModel[302] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[303] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 267
		bodyModel[304] = new ModelRendererTurbo(this, 125, 123, textureX, textureY); // Box 306
		bodyModel[305] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 307
		bodyModel[306] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 868
		bodyModel[307] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[308] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[309] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[310] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[311] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[312] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[313] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[314] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[315] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[316] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[317] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[318] = new ModelRendererTurbo(this, 391, 138, textureX, textureY); // Box 202
		bodyModel[319] = new ModelRendererTurbo(this, 416, 135, textureX, textureY); // Box 364
		bodyModel[320] = new ModelRendererTurbo(this, 331, 22, textureX, textureY); // Box 285
		bodyModel[321] = new ModelRendererTurbo(this, 331, 15, textureX, textureY); // Box 286
		bodyModel[322] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[323] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[324] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[325] = new ModelRendererTurbo(this, 84, 45, textureX, textureY); // Box 43
		bodyModel[326] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[327] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[328] = new ModelRendererTurbo(this, 151, 69, textureX, textureY); // Box 355 brakewheel
		bodyModel[329] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 522
		bodyModel[330] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 440 honse
		bodyModel[331] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[332] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[333] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[334] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[335] = new ModelRendererTurbo(this, 15, 123, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[336] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[337] = new ModelRendererTurbo(this, 15, 123, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[338] = new ModelRendererTurbo(this, 8, 123, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[339] = new ModelRendererTurbo(this, 35, 172, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[340] = new ModelRendererTurbo(this, 32, 166, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[341] = new ModelRendererTurbo(this, 503, 136, textureX, textureY); // Box 427
		bodyModel[342] = new ModelRendererTurbo(this, 500, 136, textureX, textureY); // Box 428
		bodyModel[343] = new ModelRendererTurbo(this, 226, 50, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[344] = new ModelRendererTurbo(this, 226, 57, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[345] = new ModelRendererTurbo(this, 242, 51, textureX, textureY); // Box 563
		bodyModel[346] = new ModelRendererTurbo(this, 242, 58, textureX, textureY); // Box 564
		bodyModel[347] = new ModelRendererTurbo(this, 407, 182, textureX, textureY); // Box 337
		bodyModel[348] = new ModelRendererTurbo(this, 407, 177, textureX, textureY, BoxName.ditch); // Box 338 ditchlight glow r
		bodyModel[349] = new ModelRendererTurbo(this, 407, 182, textureX, textureY); // Box 339
		bodyModel[350] = new ModelRendererTurbo(this, 407, 177, textureX, textureY, BoxName.ditch); // Box 340 ditchlight glow l
		bodyModel[351] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 249 not a ditclight
		bodyModel[352] = new ModelRendererTurbo(this, 150, 145, textureX, textureY); // Box 250
		bodyModel[353] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 251
		bodyModel[354] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 252 not a ditchlight
		bodyModel[355] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 253
		bodyModel[356] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 446
		bodyModel[357] = new ModelRendererTurbo(this, 252, 32, textureX, textureY); // Box 447
		bodyModel[358] = new ModelRendererTurbo(this, 267, 47, textureX, textureY); // Box 448
		bodyModel[359] = new ModelRendererTurbo(this, 267, 49, textureX, textureY); // Box 449
		bodyModel[360] = new ModelRendererTurbo(this, 316, 21, textureX, textureY); // Box 274 exhausting
		bodyModel[361] = new ModelRendererTurbo(this, 220, 24, textureX, textureY); // Box 1231
		bodyModel[362] = new ModelRendererTurbo(this, 211, 24, textureX, textureY); // Box 1232
		bodyModel[363] = new ModelRendererTurbo(this, 216, 21, textureX, textureY); // Box 1233
		bodyModel[364] = new ModelRendererTurbo(this, 210, 27, textureX, textureY); // Box 1234
		bodyModel[365] = new ModelRendererTurbo(this, 440, 11, textureX, textureY); // Box 518
		bodyModel[366] = new ModelRendererTurbo(this, 440, 11, textureX, textureY); // Box 253
		bodyModel[367] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[368] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[369] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5 aww
		bodyModel[370] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[371] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[372] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[373] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[374] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[375] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[376] = new ModelRendererTurbo(this, 481, 116, textureX, textureY); // Box 468
		bodyModel[377] = new ModelRendererTurbo(this, 493, 154, textureX, textureY); // Box 392
		bodyModel[378] = new ModelRendererTurbo(this, 500, 154, textureX, textureY); // Box 393
		bodyModel[379] = new ModelRendererTurbo(this, 496, 146, textureX, textureY); // Box 313 mount
		bodyModel[380] = new ModelRendererTurbo(this, 486, 154, textureX, textureY, "lamp"); // Box 313 mount
		bodyModel[381] = new ModelRendererTurbo(this, 486, 154, textureX, textureY, "lamp"); // Box 313 mount
		bodyModel[382] = new ModelRendererTurbo(this, 485, 145, textureX, textureY); // Box 313 mount
		bodyModel[383] = new ModelRendererTurbo(this, 256, 12, textureX, textureY); // Box 421 prime base
		bodyModel[384] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[385] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[386] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[387] = new ModelRendererTurbo(this, 256, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[388] = new ModelRendererTurbo(this, 256, 16, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[389] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[390] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[391] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[392] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[393] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[394] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 342
		bodyModel[395] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 343
		bodyModel[396] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 344
		bodyModel[397] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 345
		bodyModel[398] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 894
		bodyModel[399] = new ModelRendererTurbo(this, 220, 37, textureX, textureY); // Box 895
		bodyModel[400] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[401] = new ModelRendererTurbo(this, 225, 31, textureX, textureY); // Box 570
		bodyModel[402] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 278
		bodyModel[403] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 279
		bodyModel[404] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 280
		bodyModel[405] = new ModelRendererTurbo(this, 264, 20, textureX, textureY); // Box 214
		bodyModel[406] = new ModelRendererTurbo(this, 117, 107, textureX, textureY); // Box 303
		bodyModel[407] = new ModelRendererTurbo(this, 113, 102, textureX, textureY); // Box 304
		bodyModel[408] = new ModelRendererTurbo(this, 112, 107, textureX, textureY); // Box 305
		bodyModel[409] = new ModelRendererTurbo(this, 108, 102, textureX, textureY); // Box 836
		bodyModel[410] = new ModelRendererTurbo(this, 73, 112, textureX, textureY); // Box 420
		bodyModel[411] = new ModelRendererTurbo(this, 83, 112, textureX, textureY); // Box 421
		bodyModel[412] = new ModelRendererTurbo(this, 80, 112, textureX, textureY); // Box 422
		bodyModel[413] = new ModelRendererTurbo(this, 149, 25, textureX, textureY); // Box 430
		bodyModel[414] = new ModelRendererTurbo(this, 28, 221, textureX, textureY); // Box 497
		bodyModel[415] = new ModelRendererTurbo(this, 28, 237, textureX, textureY); // Box 423
		bodyModel[416] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[417] = new ModelRendererTurbo(this, 267, 66, textureX, textureY); // Box 4
		bodyModel[418] = new ModelRendererTurbo(this, 267, 57, textureX, textureY); // Box 203
		bodyModel[419] = new ModelRendererTurbo(this, 406, 209, textureX, textureY); // Box 425
		bodyModel[420] = new ModelRendererTurbo(this, 406, 209, textureX, textureY); // Box 427
		bodyModel[421] = new ModelRendererTurbo(this, 315, 195, textureX, textureY); // Box 393
		bodyModel[422] = new ModelRendererTurbo(this, 315, 198, textureX, textureY); // Box 410
		bodyModel[423] = new ModelRendererTurbo(this, 335, 195, textureX, textureY); // Box 411
		bodyModel[424] = new ModelRendererTurbo(this, 328, 195, textureX, textureY); // Box 412
		bodyModel[425] = new ModelRendererTurbo(this, 319, 198, textureX, textureY); // Box 413
		bodyModel[426] = new ModelRendererTurbo(this, 471, 57, textureX, textureY); // Box 223
		bodyModel[427] = new ModelRendererTurbo(this, 495, 68, textureX, textureY); // Box 318
		bodyModel[428] = new ModelRendererTurbo(this, 410, 165, textureX, textureY); // Box 432
		bodyModel[429] = new ModelRendererTurbo(this, 389, 164, textureX, textureY); // Box 433
		bodyModel[430] = new ModelRendererTurbo(this, 389, 164, textureX, textureY); // Box 434
		bodyModel[431] = new ModelRendererTurbo(this, 403, 164, textureX, textureY); // Box 435
		bodyModel[432] = new ModelRendererTurbo(this, 396, 164, textureX, textureY); // Box 436
		bodyModel[433] = new ModelRendererTurbo(this, 396, 164, textureX, textureY); // Box 437
		bodyModel[434] = new ModelRendererTurbo(this, 206, 209, textureX, textureY); // Box 558
		bodyModel[435] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 560
		bodyModel[436] = new ModelRendererTurbo(this, 206, 209, textureX, textureY); // Box 562
		bodyModel[437] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 563
		bodyModel[438] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 403
		bodyModel[439] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 404
		bodyModel[440] = new ModelRendererTurbo(this, 198, 28, textureX, textureY); // Box 405
		bodyModel[441] = new ModelRendererTurbo(this, 196, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[442] = new ModelRendererTurbo(this, 193, 43, textureX, textureY); // Box 1231
		bodyModel[443] = new ModelRendererTurbo(this, 183, 46, textureX, textureY); // Box 1232
		bodyModel[444] = new ModelRendererTurbo(this, 182, 43, textureX, textureY); // Box 1233
		bodyModel[445] = new ModelRendererTurbo(this, 183, 49, textureX, textureY); // Box 1234
		bodyModel[446] = new ModelRendererTurbo(this, 447, 78, textureX, textureY); // Duel Steam Genorator
		bodyModel[447] = new ModelRendererTurbo(this, 239, 23, textureX, textureY); // M5 Hork
		bodyModel[448] = new ModelRendererTurbo(this, 239, 29, textureX, textureY); // M5 Hork
		bodyModel[449] = new ModelRendererTurbo(this, 239, 26, textureX, textureY); // M5 Hork
		bodyModel[450] = new ModelRendererTurbo(this, 239, 35, textureX, textureY); // M5 Hork
		bodyModel[451] = new ModelRendererTurbo(this, 239, 32, textureX, textureY); // M5 Hork
		bodyModel[452] = new ModelRendererTurbo(this, 239, 20, textureX, textureY); // M3 Hork

		bodyModel[0].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[0].setRotationPoint(-30F, -16.25F, 2F);
		bodyModel[0].rotateAngleY = 0.78539816F;

		bodyModel[1].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[1].setRotationPoint(-30F, -16.25F, 2F);
		bodyModel[1].rotateAngleY = 0.78539816F;

		bodyModel[2].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[2].setRotationPoint(-23.5F, -20F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[3].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[4].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[5].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[6].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[7].setRotationPoint(-28.5F, -22F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[8].setRotationPoint(39.5F, -21.75F, -4.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[9].setRotationPoint(37F, -19F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[10].setRotationPoint(38.25F, -19F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[11].setRotationPoint(38.25F, -17F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 34
		bodyModel[12].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[13].setRotationPoint(40.5F, -22.5F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[14].setRotationPoint(41F, -21.75F, 1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 291
		bodyModel[15].setRotationPoint(32.5F, -9F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[16].setRotationPoint(35.5F, -9F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 315
		bodyModel[17].setRotationPoint(31.5F, -9F, 11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[18].setRotationPoint(33F, -2F, -11.25F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[19].setRotationPoint(41.5F, 2F, -11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[20].setRotationPoint(41.5F, 1F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[21].setRotationPoint(41.5F, 2F, 10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[22].setRotationPoint(41.5F, 1F, 10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[23].setRotationPoint(43.5F, 0F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[24].setRotationPoint(43.5F, 2.5F, -10.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[25].setRotationPoint(43.5F, 5F, -10.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[26].setRotationPoint(43.5F, 0F, 10.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[27].setRotationPoint(43.5F, 2.5F, 10.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[28].setRotationPoint(43.5F, 5F, 10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[29].setRotationPoint(47.5F, -2F, 4.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[30].setRotationPoint(47.75F, -2F, 4.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[31].setRotationPoint(47.75F, -2F, -6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[32].setRotationPoint(47.5F, -2F, -6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[33].setRotationPoint(35.5F, -10F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[34].setRotationPoint(44F, -19F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear SDP40
		bodyModel[35].setRotationPoint(45.25F, -19F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear SDP40
		bodyModel[36].setRotationPoint(45.25F, -17F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[37].setRotationPoint(43.5F, 0F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[38].setRotationPoint(43.5F, 0F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[39].setRotationPoint(44F, -21.5F, -0.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[40].setRotationPoint(46.5F, -8F, 11F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[41].setRotationPoint(46.5F, -8F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 251
		bodyModel[42].setRotationPoint(42.51F, -8F, 10.5F);

		bodyModel[43].addBox(0F, 0F, -1F, 0, 13, 1, 0F); // Box 241
		bodyModel[43].setRotationPoint(42.51F, -8F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[44].setRotationPoint(43.5F, 2.5F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[45].setRotationPoint(43.5F, 5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[46].setRotationPoint(43.5F, 8F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[47].setRotationPoint(43.5F, 2.5F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[48].setRotationPoint(43.5F, 5F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[49].setRotationPoint(43.5F, 8F, 9F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 234
		bodyModel[50].setRotationPoint(48.5F, -8F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 63
		bodyModel[51].setRotationPoint(46.49F, -8F, -11.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 61
		bodyModel[52].setRotationPoint(46.49F, -8F, 10.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 266
		bodyModel[53].setRotationPoint(43.5F, 0F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		bodyModel[54].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[55].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[56].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[57].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[58].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[59].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 8, 21, 14, 0F); // Box 34
		bodyModel[60].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[61].setRotationPoint(-13.5F, 3.25F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[62].setRotationPoint(-14F, 2.75F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[63].setRotationPoint(-14F, 1.75F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[64].setRotationPoint(-14F, 3.25F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[65].setRotationPoint(-34.5F, -22.5F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[66].setRotationPoint(-34.5F, -22.5F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[67].setRotationPoint(-34.5F, -22.5F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[68].setRotationPoint(-34.5F, -22.5F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[69].setRotationPoint(-34.5F, -22F, -1F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[70].setRotationPoint(14.25F, -23F, -3.5F);

		bodyModel[71].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[71].setRotationPoint(-31F, -14F, 1F);
		bodyModel[71].rotateAngleY = -0.38397244F;

		bodyModel[72].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[72].setRotationPoint(-32.6F, -12F, 1F);
		bodyModel[72].rotateAngleY = -0.38397244F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[73].setRotationPoint(-32.5F, -13F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[74].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[75].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[76].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[77].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[78].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[79].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[80].setRotationPoint(-47.75F, -3F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[81].setRotationPoint(-47.75F, -3F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[82].setRotationPoint(-47.5F, -3F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[83].setRotationPoint(-47.5F, -3F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[84].setRotationPoint(-39.5F, -2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[85].setRotationPoint(46.5F, 3F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[86].setRotationPoint(47F, 3F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[87].setRotationPoint(46.5F, 4F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[88].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[89].setRotationPoint(-50.5F, 4F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[90].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[91].setRotationPoint(-50.5F, 3F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[92].setRotationPoint(-51F, 3F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[93].setRotationPoint(-45.5F, -13F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[94].setRotationPoint(-45.5F, -11F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[95].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[96].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[97].setRotationPoint(-45.5F, -13F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[98].setRotationPoint(-45.5F, -12F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[99].setRotationPoint(-45.5F, -10F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[100].setRotationPoint(-44.48F, -13F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[101].setRotationPoint(-45.5F, -10F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 341
		bodyModel[102].setRotationPoint(-27F, -22F, -0.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[103].setRotationPoint(-27F, -23F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[104].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[105].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[106].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[107].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[108].setRotationPoint(-4.5F, -21.5F, -6.99F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[109].setRotationPoint(-6.5F, -22.25F, -7.99F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[110].setRotationPoint(-6F, -22.25F, -5.99F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[111].setRotationPoint(-7F, -22.5F, -6.99F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[112].setRotationPoint(-30.5F, -16F, 11F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[113].setRotationPoint(-30.5F, -16F, -12F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[114].setRotationPoint(-30.5F, -18F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[115].setRotationPoint(-30.5F, -18F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[116].setRotationPoint(-28.5F, -22F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[117].setRotationPoint(-34F, -23F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409
		bodyModel[118].setRotationPoint(-34F, -22F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[119].setRotationPoint(-48.25F, 0F, -7.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[120].setRotationPoint(-48.25F, 0F, 5.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[121].setRotationPoint(-48F, 0F, -7.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[122].setRotationPoint(-48F, 0F, 5.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[123].setRotationPoint(-13.25F, 3.25F, -10.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[124].setRotationPoint(-13.5F, 1.75F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[125].setRotationPoint(-13.5F, 2.75F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[126].setRotationPoint(-31.5F, -22F, 2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[127].setRotationPoint(-31.5F, -23F, 2F);

		bodyModel[128].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[128].setRotationPoint(-30.5F, -23F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[129].setRotationPoint(-31.5F, -22F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[130].setRotationPoint(-31.5F, -23F, -6F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[131].setRotationPoint(-30.5F, -23F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[132].setRotationPoint(-37.5F, -21F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[133].setRotationPoint(-37.25F, -18.5F, -0.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[134].setRotationPoint(-37.5F, -20F, -0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[135].setRotationPoint(-37.5F, -19F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[136].setRotationPoint(-8.5F, -21F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[137].setRotationPoint(9.5F, -21F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[138].setRotationPoint(9.5F, -21F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[139].setRotationPoint(-8.5F, -21F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[140].setRotationPoint(-3.5F, -21F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[141].setRotationPoint(-3.5F, -21F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[142].setRotationPoint(-41.5F, -9F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 345
		bodyModel[143].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[144].setRotationPoint(-40.5F, -6.5F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[145].setRotationPoint(-41F, -8.5F, -7F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[146].setRotationPoint(-41.5F, -13F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[147].setRotationPoint(-45.5F, -8F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[148].setRotationPoint(-43F, -13.5F, -0.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 316
		bodyModel[149].setRotationPoint(37.5F, -8F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[150].setRotationPoint(-21.5F, -12F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 312
		bodyModel[151].setRotationPoint(-19.5F, -10F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[152].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[153].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[154].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[155].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 291
		bodyModel[155].setRotationPoint(-16.5F, -8F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[156].setRotationPoint(-40.5F, -4F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[157].setRotationPoint(-39.5F, -4F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[158].setRotationPoint(3.5F, -22F, -3F);

		bodyModel[159].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[159].setRotationPoint(-3.5F, -22F, -3F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[160].setRotationPoint(-10.5F, -21.5F, -4F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[161].setRotationPoint(-9.5F, -22.5F, -2.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[162].setRotationPoint(-19.5F, -22F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[163].setRotationPoint(-18F, -15F, -9F);

		bodyModel[164].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[164].setRotationPoint(-18F, -13F, -9F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[165].setRotationPoint(-21.5F, -10F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 260
		bodyModel[166].setRotationPoint(-38.5F, -12F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 10, 0, 0F); // Box 258
		bodyModel[167].setRotationPoint(-43.5F, -10F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[168].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[169].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[170].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[171].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[172].setRotationPoint(-43.5F, -8F, -11.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 81
		bodyModel[173].setRotationPoint(-43.5F, -10F, -11F);

		bodyModel[174].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 245
		bodyModel[174].setRotationPoint(-38.5F, -4F, -11F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[175].setRotationPoint(-47.5F, 7F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[176].setRotationPoint(-47.5F, 8F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[177].setRotationPoint(46.51F, 8F, -10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[178].setRotationPoint(-33.5F, -21F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[179].setRotationPoint(-22.5F, -21F, 7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[180].setRotationPoint(-32.5F, -21F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[181].setRotationPoint(-32.5F, -21F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[182].setRotationPoint(-32.5F, -21F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[183].setRotationPoint(-22.5F, -21F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[184].setRotationPoint(-36F, -19F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[185].setRotationPoint(-36F, -21F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[186].setRotationPoint(-35.5F, -21F, 1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[187].setRotationPoint(-35.5F, -21F, -6F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[188].setRotationPoint(-35.5F, -21F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[189].setRotationPoint(-33.5F, -21F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[190].setRotationPoint(-22.5F, -21F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[191].setRotationPoint(-33.5F, -21F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[192].setRotationPoint(-33.5F, -4F, -11F);

		bodyModel[193].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[193].setRotationPoint(-22F, -18F, 10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[194].setRotationPoint(-33.5F, -18F, -7F);

		bodyModel[195].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[195].setRotationPoint(-32.5F, -18F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[196].setRotationPoint(-32.5F, -18F, 10F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[197].setRotationPoint(-22.5F, -18F, -11F);

		bodyModel[198].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[198].setRotationPoint(-33F, -18F, -10.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[199].setRotationPoint(46.5F, 2.5F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[200].setRotationPoint(46.5F, 7F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[201].setRotationPoint(47F, 5F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[202].setRotationPoint(46.5F, 6F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[203].setRotationPoint(46.5F, 7F, 0F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[204].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[205].setRotationPoint(46.5F, 6F, 0F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[206].setRotationPoint(46.5F, 3F, -1.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 3
		bodyModel[207].setRotationPoint(46.51F, 0F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[208].setRotationPoint(-42.5F, 0F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[209].setRotationPoint(-48.5F, 2.5F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[210].setRotationPoint(-50.5F, 7F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[211].setRotationPoint(-51F, 5F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[212].setRotationPoint(-50.5F, 6F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[213].setRotationPoint(-50.5F, 7F, 0F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[214].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[215].setRotationPoint(-50.5F, 6F, 0F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[216].setRotationPoint(-51.5F, 3F, -1.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[217].setRotationPoint(-47.51F, 0F, -10F);

		bodyModel[218].addBox(0F, 0F, 0F, 59, 21, 14, 0F); // Box 34
		bodyModel[218].setRotationPoint(-21.5F, -21F, -7F);

		bodyModel[219].addBox(0F, 0F, 0F, 58, 2, 4, 0F); // Box 36
		bodyModel[219].setRotationPoint(-21.5F, -2F, -11F);

		bodyModel[220].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[220].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[221].addBox(0F, 0F, 0F, 94, 1, 14, 0F); // Box 170
		bodyModel[221].setRotationPoint(-47.5F, 0F, -7F);

		bodyModel[222].addBox(0F, 0F, 0F, 94, 2, 12, 0F); // Box 23
		bodyModel[222].setRotationPoint(-47.5F, 1F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 94, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[223].setRotationPoint(-47.5F, 3F, -6.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[224].setRotationPoint(-29.5F, 3F, -2F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 409
		bodyModel[225].setRotationPoint(-29F, 1F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[226].setRotationPoint(-29F, 2F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[227].setRotationPoint(-29F, 2F, 6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[228].setRotationPoint(-28F, 2F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[229].setRotationPoint(-28F, 2F, 9F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[230].setRotationPoint(25.5F, 3F, -2F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 408
		bodyModel[231].setRotationPoint(26F, 1F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[232].setRotationPoint(26F, 2F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[233].setRotationPoint(27F, 2F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[234].setRotationPoint(26F, 2F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[235].setRotationPoint(27F, 2F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 297 vent 2 part f
		bodyModel[236].setRotationPoint(26.25F, -19.5F, -7.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 299 vent 2 part e
		bodyModel[237].setRotationPoint(26F, -19.5F, 6.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10F, -1F, 0F, -10F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 272 vent 2 part f
		bodyModel[238].setRotationPoint(16F, -20.5F, -7.25F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, -1F, 0F, -10F, -1F, 0F, -10F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 273 vent 2 part e
		bodyModel[239].setRotationPoint(15.75F, -20.5F, 6.25F);

		bodyModel[240].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[240].setRotationPoint(30F, -22.5F, -3F);

		bodyModel[241].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[241].setRotationPoint(23F, -22.5F, -3F);

		bodyModel[242].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[242].setRotationPoint(16F, -22.5F, -3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[243].setRotationPoint(-33.55F, -19.5F, -6F);
		bodyModel[243].rotateAngleY = 0.38397244F;

		bodyModel[244].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[244].setRotationPoint(-33.55F, -19.5F, 6F);
		bodyModel[244].rotateAngleY = -0.38397244F;

		bodyModel[245].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[245].setRotationPoint(-30.5F, -22.75F, -4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[246].setRotationPoint(14.5F, -21F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[247].setRotationPoint(31.5F, -21F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[248].setRotationPoint(14.5F, -21F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 146
		bodyModel[249].setRotationPoint(9.5F, -21F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 147
		bodyModel[250].setRotationPoint(9.5F, -21F, -9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[251].setRotationPoint(31.5F, -21F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[252].setRotationPoint(17F, -22.5F, 4.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[253].setRotationPoint(15F, -23.5F, 6.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[254].setRotationPoint(16F, -23.5F, 4.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[255].setRotationPoint(17F, -23.5F, 5.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[256].setRotationPoint(9.5F, -21F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[257].setRotationPoint(9.5F, -21F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[258].setRotationPoint(-43.15F, -12F, -6.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[259].setRotationPoint(-43.15F, -12F, 4.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 16, 3, 22, 0F); // Box 489
		bodyModel[260].setRotationPoint(-8F, 3F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[261].setRotationPoint(-8F, 2F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[262].setRotationPoint(-8F, 6F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 16, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[263].setRotationPoint(-8F, 6F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[264].setRotationPoint(-8F, 2F, 8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 16, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[265].setRotationPoint(-8F, 6F, 9F);

		bodyModel[266].addBox(0F, 0F, 0F, 16, 1, 16, 0F); // Box 559
		bodyModel[266].setRotationPoint(-8F, 2F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[267].setRotationPoint(8F, 6F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[268].setRotationPoint(8F, 6F, -11F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 566
		bodyModel[269].setRotationPoint(8F, 3F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[270].setRotationPoint(8F, 2F, -11F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 568
		bodyModel[271].setRotationPoint(8F, 2F, -8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[272].setRotationPoint(8F, 2F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[273].setRotationPoint(8F, 6F, 9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[274].setRotationPoint(-12F, 6F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[275].setRotationPoint(-12F, 6F, -11F);

		bodyModel[276].addBox(0F, 0F, 0F, 4, 3, 22, 0F); // Box 573
		bodyModel[276].setRotationPoint(-12F, 3F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[277].setRotationPoint(-12F, 2F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[278].setRotationPoint(-12F, 6F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[279].setRotationPoint(-12F, 2F, 8F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[280].setRotationPoint(-7F, 2F, -11.25F);
		bodyModel[280].rotateAngleX = 1.02974426F;

		bodyModel[281].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[281].setRotationPoint(-7F, 2F, 11.25F);
		bodyModel[281].rotateAngleX = 1.02974426F;
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 562
		bodyModel[282].setRotationPoint(-4.5F, 1.3F, -9.5F);
		bodyModel[282].rotateAngleX = 0.78539816F;

		bodyModel[283].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[283].setRotationPoint(-4.5F, 1.3F, 9.5F);
		bodyModel[283].rotateAngleX = 0.78539816F;

		bodyModel[284].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 575
		bodyModel[284].setRotationPoint(-12F, 2F, -8F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 436
		bodyModel[285].setRotationPoint(-11F, 2F, -11.25F);
		bodyModel[285].rotateAngleX = 1.02974426F;

		bodyModel[286].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[286].setRotationPoint(-11F, 2F, 11.25F);
		bodyModel[286].rotateAngleX = 1.02974426F;
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[287].setRotationPoint(10.75F, 2F, -11.25F);
		bodyModel[287].rotateAngleX = 1.02974426F;

		bodyModel[288].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[288].setRotationPoint(10.75F, 2F, 11.25F);
		bodyModel[288].rotateAngleX = 1.02974426F;
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 201
		bodyModel[289].setRotationPoint(11.5F, 1F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
		bodyModel[290].setRotationPoint(12.5F, 1F, 11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[291].setRotationPoint(11.5F, 1F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[292].setRotationPoint(12.5F, 1F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[293].setRotationPoint(-15.5F, 1F, 8.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[294].setRotationPoint(-42.5F, 1F, 11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[295].setRotationPoint(-13.5F, 1F, 11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[296].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[297].setRotationPoint(-13.5F, 1F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 644
		bodyModel[298].setRotationPoint(41.5F, 1F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 645
		bodyModel[299].setRotationPoint(41.5F, 1F, 10F);

		bodyModel[300].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[300].setRotationPoint(-40.5F, -4F, 7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[301].setRotationPoint(-43.5F, -10F, 10.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[302].setRotationPoint(-43.5F, -12F, 9F);

		bodyModel[303].addBox(0F, 0F, 0F, 10, 8, 0, 0F); // Box 267
		bodyModel[303].setRotationPoint(-43.5F, -12F, 11F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[304].setRotationPoint(-21.5F, -12F, 11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[305].setRotationPoint(-20.5F, -12F, 11F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[306].setRotationPoint(-17.5F, -8F, 11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[307].setRotationPoint(-47.5F, -8F, -8F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[308].setRotationPoint(-47.5F, -1F, 10F);

		bodyModel[309].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[309].setRotationPoint(-47.5F, -1F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[310].setRotationPoint(-47.5F, -8F, -6F);

		bodyModel[311].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[311].setRotationPoint(-47.5F, -8F, -8F);

		bodyModel[312].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[312].setRotationPoint(-48.5F, -8F, -4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[313].setRotationPoint(-47.5F, -8F, 4F);

		bodyModel[314].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[314].setRotationPoint(-47.5F, -8F, 6F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[315].setRotationPoint(-47.51F, -7F, -8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[316].setRotationPoint(-47.51F, -7F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[317].setRotationPoint(-47.5F, -8F, 9F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202
		bodyModel[318].setRotationPoint(46.5F, 0F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 364
		bodyModel[319].setRotationPoint(47.5F, 0F, -10F);

		bodyModel[320].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 285
		bodyModel[320].setRotationPoint(-20.5F, -20.5F, -7.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 286
		bodyModel[321].setRotationPoint(-20.5F, -20.5F, 6.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[322].setRotationPoint(-45.5F, -13F, -7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[323].setRotationPoint(-45.5F, -10F, -7F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[324].setRotationPoint(-45.5F, -8F, -7F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[325].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[326].setRotationPoint(-41.5F, -13F, -7F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[327].setRotationPoint(-40F, -11F, -7.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[328].setRotationPoint(-42F, -13F, -7.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 2F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 2F, 0F, 0F, -2F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, -2F, 0F); // Box 522
		bodyModel[329].setRotationPoint(-40.5F, -8F, -11.01F);

		bodyModel[330].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 440 honse
		bodyModel[330].setRotationPoint(-48.5F, -1F, -4F);
		bodyModel[330].rotateAngleZ = -0.08726646F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[331].setRotationPoint(-48.5F, -2F, -4.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[332].setRotationPoint(-48.5F, -2F, 2.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[333].setRotationPoint(-48.75F, -2F, -4.75F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[334].setRotationPoint(-48.75F, -2F, 2.75F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[335].setRotationPoint(-48.5F, 0.5F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[336].setRotationPoint(-48.75F, 0.5F, -6F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[337].setRotationPoint(-48.5F, 0.5F, 4F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[338].setRotationPoint(-48.75F, 0.5F, 4F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[339].setRotationPoint(-49F, -3F, -2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[340].setRotationPoint(-49F, -4F, -2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 427
		bodyModel[341].setRotationPoint(47.5F, -8F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 428
		bodyModel[342].setRotationPoint(47.5F, -8F, 11F);

		bodyModel[343].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[343].setRotationPoint(-29F, -22F, -9.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[344].setRotationPoint(-29F, -22F, 6.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[345].setRotationPoint(-28.5F, -23F, -8F);

		bodyModel[346].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[346].setRotationPoint(-28.5F, -23F, 8F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 337
		bodyModel[347].setRotationPoint(48.15F, 0.05F, 4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 ditchlight glow r
		bodyModel[348].setRotationPoint(48.4F, 0.05F, 4F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 339
		bodyModel[349].setRotationPoint(48.15F, 0.05F, -6F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340 ditchlight glow l
		bodyModel[350].setRotationPoint(48.4F, 0.05F, -6F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 249 not a ditclight
		bodyModel[351].setRotationPoint(47.75F, -2F, -4.75F);

		bodyModel[352].addBox(0F, 0F, 0F, 0, 4, 8, 0F); // Box 250
		bodyModel[352].setRotationPoint(48.5F, -1F, -4F);
		bodyModel[352].rotateAngleZ = 0.08726646F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 251
		bodyModel[353].setRotationPoint(47.5F, -2F, -4.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 252 not a ditchlight
		bodyModel[354].setRotationPoint(47.75F, -2F, 2.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 253
		bodyModel[355].setRotationPoint(47.5F, -2F, 2.75F);

		bodyModel[356].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 446
		bodyModel[356].setRotationPoint(-16F, -22.5F, 2.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 447
		bodyModel[357].setRotationPoint(-16F, -22.5F, -6.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[358].setRotationPoint(-15.5F, -23.5F, -4.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[359].setRotationPoint(-15.5F, -23.5F, 4.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 274 exhausting
		bodyModel[360].setRotationPoint(-9.5F, -23F, -2.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1231
		bodyModel[361].setRotationPoint(37.25F, -22F, 2.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1232
		bodyModel[362].setRotationPoint(36.75F, -22.75F, 3.5F);

		bodyModel[363].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1233
		bodyModel[363].setRotationPoint(36.75F, -23F, 2.5F);

		bodyModel[364].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1234
		bodyModel[364].setRotationPoint(37.25F, -22.75F, 1.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -5F, 0F); // Box 518
		bodyModel[365].setRotationPoint(-19F, -20.5F, -7.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -5F, 0F); // Box 253
		bodyModel[366].setRotationPoint(-19F, -20.5F, 6.5F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[367].setRotationPoint(-13.5F, 0.75F, -10.9F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[368].setRotationPoint(-30.5F, -17F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[369].setRotationPoint(-30.5F, -18F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[370].setRotationPoint(-43.5F, 0F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[371].setRotationPoint(-43.5F, 5F, 7F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[372].setRotationPoint(-43.5F, 5F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[373].setRotationPoint(-43.5F, 0F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[374].setRotationPoint(-43.5F, 1F, 7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[375].setRotationPoint(-43.5F, 1F, -11F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 468
		bodyModel[376].setRotationPoint(43.5F, 0F, 7F);

		bodyModel[377].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 392
		bodyModel[377].setRotationPoint(38.5F, -16F, -6.25F);
		bodyModel[377].rotateAngleY = -0.36651914F;

		bodyModel[378].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 393
		bodyModel[378].setRotationPoint(38.5F, -16F, 6.25F);
		bodyModel[378].rotateAngleY = 0.36651914F;

		bodyModel[379].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 313 mount
		bodyModel[379].setRotationPoint(38.5F, -20.75F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 mount
		bodyModel[380].setRotationPoint(38.75F, -20.75F, -1F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313 mount
		bodyModel[381].setRotationPoint(38.75F, -18.75F, -1F);

		bodyModel[382].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 313 mount
		bodyModel[382].setRotationPoint(37F, -21.25F, -1.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[383].setRotationPoint(-34F, -24F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[384].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[385].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[386].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[387].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[388].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[388].setRotationPoint(-34F, -23F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[389].setRotationPoint(-32.5F, -22F, 4F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[390].setRotationPoint(-32.5F, -22.5F, 4F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[391].setRotationPoint(-32.5F, -22.5F, 4F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[392].setRotationPoint(-32.5F, -22.5F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[393].setRotationPoint(-32.5F, -22.5F, 4F);

		bodyModel[394].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 342
		bodyModel[394].setRotationPoint(-33F, -23F, -5.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 343
		bodyModel[395].setRotationPoint(-33.75F, -22.5F, -4.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 344
		bodyModel[396].setRotationPoint(-34.5F, -22.5F, -6.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[397].setRotationPoint(-32.75F, -22.5F, -5.5F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[398].setRotationPoint(8F, -23F, 5.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[399].setRotationPoint(8F, -22F, 5.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[400].setRotationPoint(7F, -22.75F, 4.5F);

		bodyModel[401].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[401].setRotationPoint(6.5F, -22.75F, 6.5F);

		bodyModel[402].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[402].setRotationPoint(9.75F, -23.5F, -1.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[403].setRotationPoint(11.75F, -23.5F, -0.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[404].setRotationPoint(9.75F, -23.5F, 0.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 214
		bodyModel[405].setRotationPoint(11.75F, -22.5F, -0.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[406].setRotationPoint(-19.5F, -4F, 11F);

		bodyModel[407].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[407].setRotationPoint(-20.5F, -2F, 7F);

		bodyModel[408].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[408].setRotationPoint(-21.5F, -4F, 11F);

		bodyModel[409].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[409].setRotationPoint(-21.5F, -4F, 7F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 420
		bodyModel[410].setRotationPoint(-41.5F, -2F, 7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[411].setRotationPoint(-42.5F, -4F, 11F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 422
		bodyModel[412].setRotationPoint(-41.5F, -4F, 11F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[413].setRotationPoint(-29F, -23F, 5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 32, 14, 0, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -16F, -7F, 0F, -16F, -7F, 0F, 0F, -7F, 0F); // Box 497
		bodyModel[414].setRotationPoint(-4F, -6F, 11.05F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 32, 14, 0, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -16F, -7F, 0F, -16F, -7F, 0F, 0F, -7F, 0F); // Box 423
		bodyModel[415].setRotationPoint(-4F, -6F, -11.05F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[416].setRotationPoint(-35.5F, -17F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[417].setRotationPoint(-47.5F, 3F, -2.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[418].setRotationPoint(41.5F, 3F, -2.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5.5F, -5F, 0F, -5.5F, -5F, 0F, 0F, -5F, 0F); // Box 425
		bodyModel[419].setRotationPoint(38.25F, -19.5F, 6.1F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5.5F, -5F, 0F, -5.5F, -5F, 0F, 0F, -5F, 0F); // Box 427
		bodyModel[420].setRotationPoint(38.25F, -19.5F, -7.1F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 393
		bodyModel[421].setRotationPoint(39.5F, -18.5F, 7.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[422].setRotationPoint(44.5F, -20.5F, 7.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[423].setRotationPoint(39.5F, -18.5F, 6.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 412
		bodyModel[424].setRotationPoint(41.5F, -18.5F, 7.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[425].setRotationPoint(44.5F, -20.5F, 7.5F);
		bodyModel[425].rotateAngleX = 0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[426].setRotationPoint(38.5F, -22F, -7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[427].setRotationPoint(36.75F, -21.5F, -0.5F);

		bodyModel[428].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 432
		bodyModel[428].setRotationPoint(44F, -21.25F, -1.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 433
		bodyModel[429].setRotationPoint(45.75F, -20.75F, -1F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 434
		bodyModel[430].setRotationPoint(45.75F, -18.75F, -1F);

		bodyModel[431].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 435
		bodyModel[431].setRotationPoint(45.5F, -20.75F, -1F);

		bodyModel[432].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 436
		bodyModel[432].setRotationPoint(45.5F, -16F, -6.25F);
		bodyModel[432].rotateAngleY = -0.36651914F;

		bodyModel[433].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 437
		bodyModel[433].setRotationPoint(45.5F, -16F, 6.25F);
		bodyModel[433].rotateAngleY = 0.36651914F;

		bodyModel[434].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 558
		bodyModel[434].setRotationPoint(15.5F, -20.05F, -8.95F);
		bodyModel[434].rotateAngleX = 0.31415927F;

		bodyModel[435].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 560
		bodyModel[435].setRotationPoint(23.5F, -20.05F, -8.95F);
		bodyModel[435].rotateAngleX = 0.31415927F;

		bodyModel[436].addShapeBox(0F, 0F, -1F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 562
		bodyModel[436].setRotationPoint(15.5F, -20.05F, 9.05F);
		bodyModel[436].rotateAngleX = -0.31415927F;

		bodyModel[437].addShapeBox(0F, 0F, -1F, 15, 13, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -8F, -7.5F, 0F, -8F, -7.5F, 0F, 0F, -7.5F, 0F); // Box 563
		bodyModel[437].setRotationPoint(23.5F, -20.05F, 9.05F);
		bodyModel[437].rotateAngleX = -0.31415927F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[438].setRotationPoint(2F, -24F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[439].setRotationPoint(2F, -23F, -0.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[440].setRotationPoint(2.25F, -22.5F, -0.25F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[441].setRotationPoint(2F, -24F, -1.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 1231
		bodyModel[442].setRotationPoint(44F, -21.5F, 4.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1232
		bodyModel[443].setRotationPoint(43.5F, -22.25F, 5.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 1233
		bodyModel[444].setRotationPoint(43.5F, -22.5F, 4.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1234
		bodyModel[445].setRotationPoint(44F, -22.25F, 3.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Duel Steam Genorator
		bodyModel[446].setRotationPoint(38.5F, -21.7F, -4F);

		bodyModel[447].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // M5 Hork
		bodyModel[447].setRotationPoint(15F, -22.5F, -8.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[448].setRotationPoint(16F, -22.25F, -7.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // M5 Hork
		bodyModel[449].setRotationPoint(15.5F, -22.25F, -9.5F);

		bodyModel[450].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[450].setRotationPoint(16.5F, -23.5F, -9F);

		bodyModel[451].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // M5 Hork
		bodyModel[451].setRotationPoint(16.5F, -23.5F, -7.75F);

		bodyModel[452].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // M3 Hork
		bodyModel[452].setRotationPoint(17.5F, -21.5F, -8.5F);
	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	//ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3246 ) {
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
		} else {
			//black regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.725F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.45F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}