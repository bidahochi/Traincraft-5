//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SW1600
// Model Creator: biduh
// Created on: 16.10.2024 - 11:00:53
// Last changed on: 16.10.2024 - 11:00:53

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeAnew;
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

public class ModelSW1600 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW1600() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[322];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 11, 230, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 48, 217, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 48, 217, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 37, 215, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 37, 215, textureX, textureY); // Box 146
		bodyModel[5] = new ModelRendererTurbo(this, 13, 43, textureX, textureY); // Box 246
		bodyModel[6] = new ModelRendererTurbo(this, 10, 62, textureX, textureY); // Box 61
		bodyModel[7] = new ModelRendererTurbo(this, 54, 62, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 1, 237, textureX, textureY); // Box 197
		bodyModel[9] = new ModelRendererTurbo(this, 17, 38, textureX, textureY); // Box 144
		bodyModel[10] = new ModelRendererTurbo(this, 13, 53, textureX, textureY); // Box 226
		bodyModel[11] = new ModelRendererTurbo(this, 11, 49, textureX, textureY); // Box 227
		bodyModel[12] = new ModelRendererTurbo(this, 11, 224, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 64, 43, textureX, textureY); // Box 55
		bodyModel[14] = new ModelRendererTurbo(this, 62, 49, textureX, textureY); // Box 56
		bodyModel[15] = new ModelRendererTurbo(this, 64, 53, textureX, textureY); // Box 57
		bodyModel[16] = new ModelRendererTurbo(this, 68, 38, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 105, 62, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 61, 62, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 100, 67, textureX, textureY); // Box 202
		bodyModel[20] = new ModelRendererTurbo(this, 111, 69, textureX, textureY); // Box 204
		bodyModel[21] = new ModelRendererTurbo(this, 111, 72, textureX, textureY); // Box 301
		bodyModel[22] = new ModelRendererTurbo(this, 14, 37, textureX, textureY); // Box 66
		bodyModel[23] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 67
		bodyModel[24] = new ModelRendererTurbo(this, 25, 42, textureX, textureY); // Box 68
		bodyModel[25] = new ModelRendererTurbo(this, 62, 102, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 1, 187, textureX, textureY); // Box 240
		bodyModel[27] = new ModelRendererTurbo(this, 155, 76, textureX, textureY); // Box 249
		bodyModel[28] = new ModelRendererTurbo(this, 155, 72, textureX, textureY); // Box 250
		bodyModel[29] = new ModelRendererTurbo(this, 177, 69, textureX, textureY); // Box 251
		bodyModel[30] = new ModelRendererTurbo(this, 177, 74, textureX, textureY); // Box 252
		bodyModel[31] = new ModelRendererTurbo(this, 177, 82, textureX, textureY); // Box 253
		bodyModel[32] = new ModelRendererTurbo(this, 153, 80, textureX, textureY); // Box 254
		bodyModel[33] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 255
		bodyModel[34] = new ModelRendererTurbo(this, 186, 69, textureX, textureY); // Box 260
		bodyModel[35] = new ModelRendererTurbo(this, 88, 202, textureX, textureY); // Box 264
		bodyModel[36] = new ModelRendererTurbo(this, 77, 205, textureX, textureY); // Box 265
		bodyModel[37] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 266
		bodyModel[38] = new ModelRendererTurbo(this, 99, 205, textureX, textureY); // Box 269
		bodyModel[39] = new ModelRendererTurbo(this, 110, 202, textureX, textureY); // Box 270
		bodyModel[40] = new ModelRendererTurbo(this, 124, 208, textureX, textureY); // Box 271
		bodyModel[41] = new ModelRendererTurbo(this, 95, 203, textureX, textureY); // Box 274
		bodyModel[42] = new ModelRendererTurbo(this, 84, 203, textureX, textureY); // Box 275
		bodyModel[43] = new ModelRendererTurbo(this, 207, 102, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 8, 167, textureX, textureY); // Box 279
		bodyModel[45] = new ModelRendererTurbo(this, 144, 108, textureX, textureY); // Box 293
		bodyModel[46] = new ModelRendererTurbo(this, 254, 113, textureX, textureY); // Box 350
		bodyModel[47] = new ModelRendererTurbo(this, 254, 141, textureX, textureY); // Box 351
		bodyModel[48] = new ModelRendererTurbo(this, 86, 167, textureX, textureY); // Box 352
		bodyModel[49] = new ModelRendererTurbo(this, 33, 160, textureX, textureY); // Box 353
		bodyModel[50] = new ModelRendererTurbo(this, 67, 160, textureX, textureY); // Box 354
		bodyModel[51] = new ModelRendererTurbo(this, 111, 150, textureX, textureY); // Box 355
		bodyModel[52] = new ModelRendererTurbo(this, 150, 164, textureX, textureY); // Box 315 door swing right
		bodyModel[53] = new ModelRendererTurbo(this, 52, 163, textureX, textureY); // Box 61 door swing right
		bodyModel[54] = new ModelRendererTurbo(this, 250, 145, textureX, textureY); // Box 368
		bodyModel[55] = new ModelRendererTurbo(this, 229, 141, textureX, textureY); // Box 370
		bodyModel[56] = new ModelRendererTurbo(this, 226, 25, textureX, textureY); // Box 372
		bodyModel[57] = new ModelRendererTurbo(this, 231, 25, textureX, textureY); // Box 375
		bodyModel[58] = new ModelRendererTurbo(this, 26, 159, textureX, textureY); // Box 386
		bodyModel[59] = new ModelRendererTurbo(this, 212, 107, textureX, textureY); // Box 33
		bodyModel[60] = new ModelRendererTurbo(this, 150, 40, textureX, textureY); // Box 399
		bodyModel[61] = new ModelRendererTurbo(this, 140, 33, textureX, textureY); // Box 287
		bodyModel[62] = new ModelRendererTurbo(this, 143, 24, textureX, textureY); // Box 288
		bodyModel[63] = new ModelRendererTurbo(this, 140, 39, textureX, textureY); // Box 289
		bodyModel[64] = new ModelRendererTurbo(this, 143, 37, textureX, textureY); // Box 290
		bodyModel[65] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 188
		bodyModel[67] = new ModelRendererTurbo(this, 8, 31, textureX, textureY, BoxName.ditch); // Box 189 lamp ditchlight front up
		bodyModel[68] = new ModelRendererTurbo(this, 8, 31, textureX, textureY, BoxName.ditch); // Box 190 lamp ditchlight front up
		bodyModel[69] = new ModelRendererTurbo(this, 8, 36, textureX, textureY, BoxName.ditch); // Box 416 lamp ditchlight front down
		bodyModel[70] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 417
		bodyModel[71] = new ModelRendererTurbo(this, 8, 36, textureX, textureY, BoxName.ditch); // Box 418 lamp ditchlight front down
		bodyModel[72] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 419
		bodyModel[73] = new ModelRendererTurbo(this, 1, 55, textureX, textureY, BoxName.ditch); // Box 180 lamp ditchlight rear down
		bodyModel[74] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 181
		bodyModel[75] = new ModelRendererTurbo(this, 8, 45, textureX, textureY, BoxName.ditch); // Box 182 lamp ditchlight rear up
		bodyModel[76] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 183
		bodyModel[77] = new ModelRendererTurbo(this, 1, 55, textureX, textureY, BoxName.ditch); // Box 184 lamp ditchlight rear down
		bodyModel[78] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 185
		bodyModel[79] = new ModelRendererTurbo(this, 8, 45, textureX, textureY, BoxName.ditch); // Box 186 lamp ditchlight rear up
		bodyModel[80] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 187
		bodyModel[81] = new ModelRendererTurbo(this, 2, 104, textureX, textureY); // Box 195
		bodyModel[82] = new ModelRendererTurbo(this, 32, 90, textureX, textureY); // Box 196
		bodyModel[83] = new ModelRendererTurbo(this, 29, 106, textureX, textureY); // Box 197
		bodyModel[84] = new ModelRendererTurbo(this, 17, 102, textureX, textureY); // Box 198
		bodyModel[85] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 199
		bodyModel[86] = new ModelRendererTurbo(this, 49, 112, textureX, textureY); // Box 200
		bodyModel[87] = new ModelRendererTurbo(this, 51, 109, textureX, textureY); // Box 201
		bodyModel[88] = new ModelRendererTurbo(this, 51, 109, textureX, textureY); // Box 202
		bodyModel[89] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // Box 205
		bodyModel[90] = new ModelRendererTurbo(this, 156, 83, textureX, textureY); // Box 206
		bodyModel[91] = new ModelRendererTurbo(this, 238, 240, textureX, textureY); // Box 367
		bodyModel[92] = new ModelRendererTurbo(this, 238, 240, textureX, textureY); // Box 368
		bodyModel[93] = new ModelRendererTurbo(this, 78, 216, textureX, textureY); // Box 86
		bodyModel[94] = new ModelRendererTurbo(this, 78, 220, textureX, textureY); // Box 87
		bodyModel[95] = new ModelRendererTurbo(this, 124, 223, textureX, textureY); // Box 375
		bodyModel[96] = new ModelRendererTurbo(this, 124, 219, textureX, textureY); // Box 376
		bodyModel[97] = new ModelRendererTurbo(this, 150, 31, textureX, textureY); // Box 377
		bodyModel[98] = new ModelRendererTurbo(this, 219, 31, textureX, textureY); // Box 261
		bodyModel[99] = new ModelRendererTurbo(this, 132, 44, textureX, textureY); // Box 379
		bodyModel[100] = new ModelRendererTurbo(this, 132, 44, textureX, textureY); // Box 380
		bodyModel[101] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 381
		bodyModel[102] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 382
		bodyModel[103] = new ModelRendererTurbo(this, 212, 98, textureX, textureY); // Box 383
		bodyModel[104] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 354
		bodyModel[105] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 355
		bodyModel[106] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 356
		bodyModel[107] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 357
		bodyModel[108] = new ModelRendererTurbo(this, 24, 4, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Box 74
		bodyModel[110] = new ModelRendererTurbo(this, 24, 7, textureX, textureY); // Box 78
		bodyModel[111] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 245
		bodyModel[112] = new ModelRendererTurbo(this, 29, 4, textureX, textureY); // Box 418
		bodyModel[113] = new ModelRendererTurbo(this, 221, 93, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[114] = new ModelRendererTurbo(this, 50, 1, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[115] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 363
		bodyModel[116] = new ModelRendererTurbo(this, 35, 12, textureX, textureY, BoxName.commander); // Box 364 glow commander beacon
		bodyModel[117] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "cull"); // Box 366 cull
		bodyModel[118] = new ModelRendererTurbo(this, 27, 16, textureX, textureY); // Box 367
		bodyModel[119] = new ModelRendererTurbo(this, 28, 12, textureX, textureY, BoxName.commander); // Box 368 glow commander beacon
		bodyModel[120] = new ModelRendererTurbo(this, 10, 41, textureX, textureY); // Box 353
		bodyModel[121] = new ModelRendererTurbo(this, 8, 16, textureX, textureY); // Box 383
		bodyModel[122] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 384
		bodyModel[123] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 385
		bodyModel[124] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 386
		bodyModel[125] = new ModelRendererTurbo(this, 32, 31, textureX, textureY); // Box 452
		bodyModel[126] = new ModelRendererTurbo(this, 39, 31, textureX, textureY); // Box 453
		bodyModel[127] = new ModelRendererTurbo(this, 108, 161, textureX, textureY); // Box 122
		bodyModel[128] = new ModelRendererTurbo(this, 108, 157, textureX, textureY); // Box 123
		bodyModel[129] = new ModelRendererTurbo(this, 274, 148, textureX, textureY); // Box 456
		bodyModel[130] = new ModelRendererTurbo(this, 299, 151, textureX, textureY); // Box 457
		bodyModel[131] = new ModelRendererTurbo(this, 234, 228, textureX, textureY); // Box 462
		bodyModel[132] = new ModelRendererTurbo(this, 234, 228, textureX, textureY); // Box 463
		bodyModel[133] = new ModelRendererTurbo(this, 230, 39, textureX, textureY); // Box 299
		bodyModel[134] = new ModelRendererTurbo(this, 230, 30, textureX, textureY); // Box 303
		bodyModel[135] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 307
		bodyModel[136] = new ModelRendererTurbo(this, 236, 31, textureX, textureY); // Box 308
		bodyModel[137] = new ModelRendererTurbo(this, 126, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[138] = new ModelRendererTurbo(this, 107, 192, textureX, textureY); // Box 296
		bodyModel[139] = new ModelRendererTurbo(this, 55, 185, textureX, textureY); // Box 297
		bodyModel[140] = new ModelRendererTurbo(this, 120, 194, textureX, textureY); // Box 299
		bodyModel[141] = new ModelRendererTurbo(this, 137, 194, textureX, textureY); // Box 300
		bodyModel[142] = new ModelRendererTurbo(this, 150, 189, textureX, textureY); // Box 301
		bodyModel[143] = new ModelRendererTurbo(this, 128, 185, textureX, textureY); // Box 302
		bodyModel[144] = new ModelRendererTurbo(this, 98, 185, textureX, textureY); // Box 303
		bodyModel[145] = new ModelRendererTurbo(this, 85, 187, textureX, textureY); // Box 304
		bodyModel[146] = new ModelRendererTurbo(this, 98, 192, textureX, textureY); // Box 305
		bodyModel[147] = new ModelRendererTurbo(this, 66, 186, textureX, textureY); // Box 306
		bodyModel[148] = new ModelRendererTurbo(this, 117, 187, textureX, textureY); // Box 307
		bodyModel[149] = new ModelRendererTurbo(this, 72, 189, textureX, textureY); // Box 298
		bodyModel[150] = new ModelRendererTurbo(this, 51, 84, textureX, textureY); // Box 359
		bodyModel[151] = new ModelRendererTurbo(this, 51, 93, textureX, textureY); // Box 360
		bodyModel[152] = new ModelRendererTurbo(this, 145, 246, textureX, textureY); // Box 19
		bodyModel[153] = new ModelRendererTurbo(this, 155, 229, textureX, textureY); // Box 489
		bodyModel[154] = new ModelRendererTurbo(this, 148, 227, textureX, textureY); // Box 278
		bodyModel[155] = new ModelRendererTurbo(this, 152, 245, textureX, textureY); // Box 281
		bodyModel[156] = new ModelRendererTurbo(this, 199, 228, textureX, textureY); // Box 288
		bodyModel[157] = new ModelRendererTurbo(this, 148, 233, textureX, textureY); // Box 315
		bodyModel[158] = new ModelRendererTurbo(this, 152, 239, textureX, textureY); // Box 316
		bodyModel[159] = new ModelRendererTurbo(this, 238, 93, textureX, textureY, "cull"); // Box 377 cull
		bodyModel[160] = new ModelRendererTurbo(this, 61, 215, textureX, textureY); // Box 288
		bodyModel[161] = new ModelRendererTurbo(this, 61, 215, textureX, textureY); // Box 379
		bodyModel[162] = new ModelRendererTurbo(this, 294, 125, textureX, textureY); // Box 356
		bodyModel[163] = new ModelRendererTurbo(this, 291, 125, textureX, textureY); // Box 358
		bodyModel[164] = new ModelRendererTurbo(this, 288, 125, textureX, textureY); // Box 359
		bodyModel[165] = new ModelRendererTurbo(this, 301, 126, textureX, textureY); // Box 360
		bodyModel[166] = new ModelRendererTurbo(this, 301, 129, textureX, textureY); // Box 294
		bodyModel[167] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // Box 132
		bodyModel[168] = new ModelRendererTurbo(this, 252, 125, textureX, textureY); // Box 135
		bodyModel[169] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 57
		bodyModel[170] = new ModelRendererTurbo(this, 258, 106, textureX, textureY); // Box 280
		bodyModel[171] = new ModelRendererTurbo(this, 258, 109, textureX, textureY); // Box 281
		bodyModel[172] = new ModelRendererTurbo(this, 281, 115, textureX, textureY); // Box 282
		bodyModel[173] = new ModelRendererTurbo(this, 285, 131, textureX, textureY); // Box 284
		bodyModel[174] = new ModelRendererTurbo(this, 294, 133, textureX, textureY); // Box 285
		bodyModel[175] = new ModelRendererTurbo(this, 290, 117, textureX, textureY); // Box 286
		bodyModel[176] = new ModelRendererTurbo(this, 303, 125, textureX, textureY); // Box 408
		bodyModel[177] = new ModelRendererTurbo(this, 300, 125, textureX, textureY); // Box 409
		bodyModel[178] = new ModelRendererTurbo(this, 315, 129, textureX, textureY); // Box 410
		bodyModel[179] = new ModelRendererTurbo(this, 308, 125, textureX, textureY); // Box 411
		bodyModel[180] = new ModelRendererTurbo(this, 315, 126, textureX, textureY); // Box 412
		bodyModel[181] = new ModelRendererTurbo(this, 317, 125, textureX, textureY); // Box 413
		bodyModel[182] = new ModelRendererTurbo(this, 314, 125, textureX, textureY); // Box 414
		bodyModel[183] = new ModelRendererTurbo(this, 140, 246, textureX, textureY); // Box 415
		bodyModel[184] = new ModelRendererTurbo(this, 125, 100, textureX, textureY); // Box 457
		bodyModel[185] = new ModelRendererTurbo(this, 107, 109, textureX, textureY); // Box 458
		bodyModel[186] = new ModelRendererTurbo(this, 138, 122, textureX, textureY); // Box 43
		bodyModel[187] = new ModelRendererTurbo(this, 139, 125, textureX, textureY); // Box 43
		bodyModel[188] = new ModelRendererTurbo(this, 133, 144, textureX, textureY); // Box 574
		bodyModel[189] = new ModelRendererTurbo(this, 144, 208, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[190] = new ModelRendererTurbo(this, 146, 203, textureX, textureY); // Box 5 aww
		bodyModel[191] = new ModelRendererTurbo(this, 121, 202, textureX, textureY); // Box 303
		bodyModel[192] = new ModelRendererTurbo(this, 135, 209, textureX, textureY); // Box 305
		bodyModel[193] = new ModelRendererTurbo(this, 54, 203, textureX, textureY); // Box 306
		bodyModel[194] = new ModelRendererTurbo(this, 63, 203, textureX, textureY); // Box 307
		bodyModel[195] = new ModelRendererTurbo(this, 59, 16, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[196] = new ModelRendererTurbo(this, 59, 10, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[197] = new ModelRendererTurbo(this, 48, 10, textureX, textureY, "cull"); // Box 594 cull
		bodyModel[198] = new ModelRendererTurbo(this, 48, 16, textureX, textureY, "cull"); // Box 595 cull
		bodyModel[199] = new ModelRendererTurbo(this, 203, 108, textureX, textureY); // Box 359 smoke
		bodyModel[200] = new ModelRendererTurbo(this, 203, 112, textureX, textureY); // Box 360 smoke
		bodyModel[201] = new ModelRendererTurbo(this, 19, 4, textureX, textureY); // Box 361 up 1198
		bodyModel[202] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 362
		bodyModel[203] = new ModelRendererTurbo(this, 19, 7, textureX, textureY); // Box 363
		bodyModel[204] = new ModelRendererTurbo(this, 265, 230, textureX, textureY); // Box 364
		bodyModel[205] = new ModelRendererTurbo(this, 265, 230, textureX, textureY); // Box 365
		bodyModel[206] = new ModelRendererTurbo(this, 178, 168, textureX, textureY); // Box 366
		bodyModel[207] = new ModelRendererTurbo(this, 65, 53, textureX, textureY); // Box 519
		bodyModel[208] = new ModelRendererTurbo(this, 233, 30, textureX, textureY); // Box 368
		bodyModel[209] = new ModelRendererTurbo(this, 233, 39, textureX, textureY); // Box 369
		bodyModel[210] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 370
		bodyModel[211] = new ModelRendererTurbo(this, 50, 53, textureX, textureY); // Box 371
		bodyModel[212] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 372
		bodyModel[213] = new ModelRendererTurbo(this, 10, 43, textureX, textureY); // Box 383
		bodyModel[214] = new ModelRendererTurbo(this, 80, 131, textureX, textureY); // Box 390
		bodyModel[215] = new ModelRendererTurbo(this, 83, 131, textureX, textureY); // Box 391
		bodyModel[216] = new ModelRendererTurbo(this, 179, 66, textureX, textureY); // Box 392
		bodyModel[217] = new ModelRendererTurbo(this, 180, 62, textureX, textureY); // Box 393
		bodyModel[218] = new ModelRendererTurbo(this, 155, 74, textureX, textureY); // Box 394
		bodyModel[219] = new ModelRendererTurbo(this, 166, 76, textureX, textureY); // Box 395
		bodyModel[220] = new ModelRendererTurbo(this, 166, 74, textureX, textureY); // Box 396
		bodyModel[221] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 397
		bodyModel[222] = new ModelRendererTurbo(this, 167, 78, textureX, textureY); // Box 398
		bodyModel[223] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 399
		bodyModel[224] = new ModelRendererTurbo(this, 164, 85, textureX, textureY); // Box 400
		bodyModel[225] = new ModelRendererTurbo(this, 186, 82, textureX, textureY); // Box 401
		bodyModel[226] = new ModelRendererTurbo(this, 186, 74, textureX, textureY); // Box 402
		bodyModel[227] = new ModelRendererTurbo(this, 166, 72, textureX, textureY); // Box 403
		bodyModel[228] = new ModelRendererTurbo(this, 188, 66, textureX, textureY); // Box 405
		bodyModel[229] = new ModelRendererTurbo(this, 189, 62, textureX, textureY); // Box 406
		bodyModel[230] = new ModelRendererTurbo(this, 155, 72, textureX, textureY); // Box 407
		bodyModel[231] = new ModelRendererTurbo(this, 155, 74, textureX, textureY); // Box 408
		bodyModel[232] = new ModelRendererTurbo(this, 155, 76, textureX, textureY); // Box 409
		bodyModel[233] = new ModelRendererTurbo(this, 195, 74, textureX, textureY); // Box 410
		bodyModel[234] = new ModelRendererTurbo(this, 195, 69, textureX, textureY); // Box 411
		bodyModel[235] = new ModelRendererTurbo(this, 197, 66, textureX, textureY); // Box 412
		bodyModel[236] = new ModelRendererTurbo(this, 198, 62, textureX, textureY); // Box 413
		bodyModel[237] = new ModelRendererTurbo(this, 156, 78, textureX, textureY); // Box 414
		bodyModel[238] = new ModelRendererTurbo(this, 153, 80, textureX, textureY); // Box 415
		bodyModel[239] = new ModelRendererTurbo(this, 195, 82, textureX, textureY); // Box 416
		bodyModel[240] = new ModelRendererTurbo(this, 156, 83, textureX, textureY); // Box 417
		bodyModel[241] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 418
		bodyModel[242] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 419
		bodyModel[243] = new ModelRendererTurbo(this, 164, 85, textureX, textureY); // Box 420
		bodyModel[244] = new ModelRendererTurbo(this, 167, 78, textureX, textureY); // Box 421
		bodyModel[245] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 422
		bodyModel[246] = new ModelRendererTurbo(this, 166, 76, textureX, textureY); // Box 423
		bodyModel[247] = new ModelRendererTurbo(this, 166, 74, textureX, textureY); // Box 424
		bodyModel[248] = new ModelRendererTurbo(this, 166, 72, textureX, textureY); // Box 425
		bodyModel[249] = new ModelRendererTurbo(this, 204, 69, textureX, textureY); // Box 426
		bodyModel[250] = new ModelRendererTurbo(this, 204, 74, textureX, textureY); // Box 427
		bodyModel[251] = new ModelRendererTurbo(this, 204, 82, textureX, textureY); // Box 428
		bodyModel[252] = new ModelRendererTurbo(this, 206, 66, textureX, textureY); // Box 429
		bodyModel[253] = new ModelRendererTurbo(this, 207, 62, textureX, textureY); // Box 430
		bodyModel[254] = new ModelRendererTurbo(this, 245, 25, textureX, textureY); // Box 283
		bodyModel[255] = new ModelRendererTurbo(this, 240, 25, textureX, textureY); // Box 284
		bodyModel[256] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 390
		bodyModel[257] = new ModelRendererTurbo(this, 26, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[258] = new ModelRendererTurbo(this, 26, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[259] = new ModelRendererTurbo(this, 15, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[260] = new ModelRendererTurbo(this, 15, 218, textureX, textureY, "cull"); // Box 391 cull
		bodyModel[261] = new ModelRendererTurbo(this, 56, 109, textureX, textureY); // Box 395
		bodyModel[262] = new ModelRendererTurbo(this, 56, 109, textureX, textureY); // Box 396
		bodyModel[263] = new ModelRendererTurbo(this, 292, 230, textureX, textureY); // Box 397 smol fuel tank addition
		bodyModel[264] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 331 lamp rear 2 beam sp
		bodyModel[265] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 332 lamp rear 2 beam sp
		bodyModel[266] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "lamp"); // Box 333 lamp rear gyro sp
		bodyModel[267] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "lamp"); // Box 334 lamp rear gyro sp
		bodyModel[268] = new ModelRendererTurbo(this, 190, 150, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[269] = new ModelRendererTurbo(this, 200, 150, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[270] = new ModelRendererTurbo(this, 179, 149, textureX, textureY); // Box 349
		bodyModel[271] = new ModelRendererTurbo(this, 180, 149, textureX, textureY); // Box 416
		bodyModel[272] = new ModelRendererTurbo(this, 201, 157, textureX, textureY); // Box 417
		bodyModel[273] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 418
		bodyModel[274] = new ModelRendererTurbo(this, 164, 148, textureX, textureY); // Box 419
		bodyModel[275] = new ModelRendererTurbo(this, 211, 143, textureX, textureY); // Box 420
		bodyModel[276] = new ModelRendererTurbo(this, 220, 145, textureX, textureY); // Box 421
		bodyModel[277] = new ModelRendererTurbo(this, 154, 146, textureX, textureY); // Box 422
		bodyModel[278] = new ModelRendererTurbo(this, 161, 134, textureX, textureY); // Box 423
		bodyModel[279] = new ModelRendererTurbo(this, 174, 134, textureX, textureY); // Box 424
		bodyModel[280] = new ModelRendererTurbo(this, 163, 143, textureX, textureY); // Box 425
		bodyModel[281] = new ModelRendererTurbo(this, 209, 133, textureX, textureY); // Box 188
		bodyModel[282] = new ModelRendererTurbo(this, 237, 132, textureX, textureY); // Box 189
		bodyModel[283] = new ModelRendererTurbo(this, 222, 132, textureX, textureY); // Box 190
		bodyModel[284] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 193 numberboard glow
		bodyModel[285] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 194 numberboard glow
		bodyModel[286] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 331 lamp front 2 beam sp
		bodyModel[287] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 332 lamp front 2 beam sp
		bodyModel[288] = new ModelRendererTurbo(this, 88, 141, textureX, textureY, "lamp"); // Box 333 lamp front gyro sp
		bodyModel[289] = new ModelRendererTurbo(this, 88, 141, textureX, textureY, "lamp"); // Box 334 lamp front gyro sp
		bodyModel[290] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 299
		bodyModel[291] = new ModelRendererTurbo(this, 108, 135, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[292] = new ModelRendererTurbo(this, 98, 135, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[293] = new ModelRendererTurbo(this, 87, 134, textureX, textureY); // Box 349
		bodyModel[294] = new ModelRendererTurbo(this, 126, 136, textureX, textureY); // Box 414
		bodyModel[295] = new ModelRendererTurbo(this, 51, 140, textureX, textureY); // Box 415
		bodyModel[296] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Box 364 prime base
		bodyModel[297] = new ModelRendererTurbo(this, 33, 22, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[298] = new ModelRendererTurbo(this, 33, 22, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[299] = new ModelRendererTurbo(this, 33, 22, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[300] = new ModelRendererTurbo(this, 33, 22, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[301] = new ModelRendererTurbo(this, 40, 24, textureX, textureY, "cull"); // Box 431 cull support
		bodyModel[302] = new ModelRendererTurbo(this, 342, 211, textureX, textureY); // Box 412 cs
		bodyModel[303] = new ModelRendererTurbo(this, 353, 210, textureX, textureY); // Box 413 cs
		bodyModel[304] = new ModelRendererTurbo(this, 342, 203, textureX, textureY); // Box 86 cs
		bodyModel[305] = new ModelRendererTurbo(this, 353, 218, textureX, textureY); // Box 531 cs
		bodyModel[306] = new ModelRendererTurbo(this, 359, 195, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[307] = new ModelRendererTurbo(this, 140, 237, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[308] = new ModelRendererTurbo(this, 105, 80, textureX, textureY); // Box 186 fan
		bodyModel[309] = new ModelRendererTurbo(this, 105, 80, textureX, textureY); // Box 682 fan
		bodyModel[310] = new ModelRendererTurbo(this, 114, 76, textureX, textureY); // Box 433
		bodyModel[311] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[312] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[313] = new ModelRendererTurbo(this, 93, 89, textureX, textureY); // Box 438
		bodyModel[314] = new ModelRendererTurbo(this, 219, 72, textureX, textureY); // Box 445
		bodyModel[315] = new ModelRendererTurbo(this, 212, 76, textureX, textureY); // Box 19
		bodyModel[316] = new ModelRendererTurbo(this, 244, 76, textureX, textureY); // Box 20
		bodyModel[317] = new ModelRendererTurbo(this, 15, 33, textureX, textureY); // Box 442
		bodyModel[318] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Box 443
		bodyModel[319] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 416
		bodyModel[320] = new ModelRendererTurbo(this, 20, 91, textureX, textureY); // Box 417
		bodyModel[321] = new ModelRendererTurbo(this, 3, 75, textureX, textureY); // Box 446

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-35F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[2].setRotationPoint(32F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[4].setRotationPoint(31F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 246
		bodyModel[5].setRotationPoint(-31.01F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[6].setRotationPoint(-31F, -2F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[7].setRotationPoint(-31F, -2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 62, 3, 14, 0F); // Box 197
		bodyModel[8].setRotationPoint(-31F, 0F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 144
		bodyModel[9].setRotationPoint(-31F, -8F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[10].setRotationPoint(-31.01F, 8F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[11].setRotationPoint(-31.01F, 7F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 40
		bodyModel[12].setRotationPoint(-27F, 0F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 55
		bodyModel[13].setRotationPoint(31.01F, 0F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 56
		bodyModel[14].setRotationPoint(31.01F, 7F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[15].setRotationPoint(31.01F, 8F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 58
		bodyModel[16].setRotationPoint(31F, -8F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 59
		bodyModel[17].setRotationPoint(31F, -2F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(31F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[19].setRotationPoint(31F, 0F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[20].setRotationPoint(31F, 0F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[21].setRotationPoint(31F, 0F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[22].setRotationPoint(-32F, 0F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[23].setRotationPoint(-32F, 0F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[24].setRotationPoint(-32F, 0F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 5
		bodyModel[25].setRotationPoint(-24F, -14F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 240
		bodyModel[26].setRotationPoint(11F, -5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[27].setRotationPoint(-31F, 3F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 250
		bodyModel[28].setRotationPoint(-31F, 0F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[29].setRotationPoint(-28F, 0F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[30].setRotationPoint(-28F, 1F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.4F, 0F, -1F); // Box 253
		bodyModel[31].setRotationPoint(-28F, 5F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[32].setRotationPoint(-31F, 5F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[33].setRotationPoint(-31F, 8F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
		bodyModel[34].setRotationPoint(-28F, 0F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[35].setRotationPoint(26F, -5F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 265
		bodyModel[36].setRotationPoint(26F, -3F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[37].setRotationPoint(26F, -3F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 269
		bodyModel[38].setRotationPoint(26F, -3F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[39].setRotationPoint(26F, -5F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[40].setRotationPoint(26F, -3F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 274
		bodyModel[41].setRotationPoint(26F, -4F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 275
		bodyModel[42].setRotationPoint(26F, -2F, -2F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 107
		bodyModel[43].setRotationPoint(3F, -14F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 279
		bodyModel[44].setRotationPoint(12F, -20F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 17, 16, 14, 0F); // Box 293
		bodyModel[45].setRotationPoint(-14F, -16F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[46].setRotationPoint(11F, -21F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[47].setRotationPoint(11F, -21F, 9F);

		bodyModel[48].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 352
		bodyModel[48].setRotationPoint(12F, -20F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 353
		bodyModel[49].setRotationPoint(23F, -20F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 354
		bodyModel[50].setRotationPoint(23F, -20F, 3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 355
		bodyModel[51].setRotationPoint(11F, -20F, -7F);

		bodyModel[52].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
		bodyModel[52].setRotationPoint(11.5F, -20F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, -5F, 1, 14, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61 door swing right
		bodyModel[53].setRotationPoint(23F, -19F, 2F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 368
		bodyModel[54].setRotationPoint(11F, -21F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 370
		bodyModel[55].setRotationPoint(23F, -21F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 372
		bodyModel[56].setRotationPoint(9F, -4F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 375
		bodyModel[57].setRotationPoint(8F, -2F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 386
		bodyModel[58].setRotationPoint(23F, -20F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 33
		bodyModel[59].setRotationPoint(1F, -22F, -1F);

		bodyModel[60].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 399
		bodyModel[60].setRotationPoint(-28F, -8F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[61].setRotationPoint(-28F, -6F, -11.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 288
		bodyModel[62].setRotationPoint(-28F, -8F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[63].setRotationPoint(-28F, -6F, 10.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 290
		bodyModel[64].setRotationPoint(-28F, -8F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(-31F, -2F, 4.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[66].setRotationPoint(-31F, -2F, -6.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditchlight front up
		bodyModel[67].setRotationPoint(-31.25F, -2F, 4.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp ditchlight front up
		bodyModel[68].setRotationPoint(-31.25F, -2F, -6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp ditchlight front down
		bodyModel[69].setRotationPoint(-32.25F, 0F, -6.75F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 417
		bodyModel[70].setRotationPoint(-32F, 0F, -6.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp ditchlight front down
		bodyModel[71].setRotationPoint(-32.25F, 0F, 4.75F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 419
		bodyModel[72].setRotationPoint(-32F, 0F, 4.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 180 lamp ditchlight rear down
		bodyModel[73].setRotationPoint(31.25F, 0F, -6.75F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 181
		bodyModel[74].setRotationPoint(31F, 0F, -6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 lamp ditchlight rear up
		bodyModel[75].setRotationPoint(30.25F, -2F, -6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[76].setRotationPoint(30F, -2F, -6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 184 lamp ditchlight rear down
		bodyModel[77].setRotationPoint(31.25F, 0F, 4.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 185
		bodyModel[78].setRotationPoint(31F, 0F, 4.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 lamp ditchlight rear up
		bodyModel[79].setRotationPoint(30.25F, -2F, 4.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[80].setRotationPoint(30F, -2F, 4.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		bodyModel[81].setRotationPoint(-27F, -14F, -6F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 196
		bodyModel[82].setRotationPoint(-26F, -14F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 10, 14, 0F); // Box 197
		bodyModel[83].setRotationPoint(-26F, -10F, -7F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 198
		bodyModel[84].setRotationPoint(-26F, -13F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[85].setRotationPoint(-26F, -11F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[86].setRotationPoint(-26F, -11F, 5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 201
		bodyModel[87].setRotationPoint(-25.5F, -11F, -6.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		bodyModel[88].setRotationPoint(-25.5F, -11F, 5.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 205
		bodyModel[89].setRotationPoint(-31F, 4F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[90].setRotationPoint(-31F, 7F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 367
		bodyModel[91].setRotationPoint(-19F, 3F, -2F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 368
		bodyModel[92].setRotationPoint(15F, 3F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[93].setRotationPoint(-10F, 1F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[94].setRotationPoint(-10F, 2F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[95].setRotationPoint(-10F, 2F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[96].setRotationPoint(-10F, 1F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 377
		bodyModel[97].setRotationPoint(-28F, -8F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[98].setRotationPoint(6F, -8F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -4F, 0F); // Box 379
		bodyModel[99].setRotationPoint(24F, -9F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 4F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -4F, 0F); // Box 380
		bodyModel[100].setRotationPoint(24F, -9F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 381
		bodyModel[101].setRotationPoint(27F, -9F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 382
		bodyModel[102].setRotationPoint(27F, -9F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 383
		bodyModel[103].setRotationPoint(-11F, -22F, -1F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[104].setRotationPoint(9F, -23.5F, -0.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[105].setRotationPoint(10F, -23.25F, 0.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[106].setRotationPoint(9.5F, -23.25F, -1.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[107].setRotationPoint(11.5F, -22.5F, -0.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[108].setRotationPoint(-4F, -18.5F, -0.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[109].setRotationPoint(-4F, -19.5F, -0.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[110].setRotationPoint(-3.75F, -18F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[111].setRotationPoint(-4F, -20.5F, -0.550000000000001F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[112].setRotationPoint(-4F, -19.5F, 0.45F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 420 cull
		bodyModel[113].setRotationPoint(0F, -24.5F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360 cull
		bodyModel[114].setRotationPoint(17.5F, -21.5F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 363
		bodyModel[115].setRotationPoint(18.18F, -22.5F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 glow commander beacon
		bodyModel[116].setRotationPoint(18F, -23.5F, -9.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 366 cull
		bodyModel[117].setRotationPoint(17.5F, -21.5F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 367
		bodyModel[118].setRotationPoint(18.18F, -22.5F, 8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368 glow commander beacon
		bodyModel[119].setRotationPoint(18F, -23.5F, 8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[120].setRotationPoint(21.5F, -23F, 0F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[121].setRotationPoint(11.05F, -22.25F, 6.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[122].setRotationPoint(9.55F, -23.25F, 5.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[123].setRotationPoint(11.05F, -23.25F, 6.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[124].setRotationPoint(10.3F, -23.25F, 7.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 452
		bodyModel[125].setRotationPoint(-31.5F, -3F, -4.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 453
		bodyModel[126].setRotationPoint(30.5F, -3F, 2.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[127].setRotationPoint(13F, -20F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[128].setRotationPoint(13F, -20F, -12F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 456
		bodyModel[129].setRotationPoint(-33F, 6.5F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 457
		bodyModel[130].setRotationPoint(31F, 6.5F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 462
		bodyModel[131].setRotationPoint(-19F, 1F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 463
		bodyModel[132].setRotationPoint(15F, 1F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 299
		bodyModel[133].setRotationPoint(27.5F, -2F, 10F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 303
		bodyModel[134].setRotationPoint(27.5F, -2F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 307
		bodyModel[135].setRotationPoint(24.5F, -8F, 8F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 308
		bodyModel[136].setRotationPoint(24.5F, -8F, -8F);

		bodyModel[137].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[137].setRotationPoint(14F, -16F, 5F);
		bodyModel[137].rotateAngleY = 0.78539816F;

		bodyModel[138].addShapeBox(-1F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[138].setRotationPoint(12F, -12F, 9F);
		bodyModel[138].rotateAngleY = -1.57079633F;

		bodyModel[139].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 297
		bodyModel[139].setRotationPoint(12F, -14F, -7F);

		bodyModel[140].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 299
		bodyModel[140].setRotationPoint(18F, -6F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 300
		bodyModel[141].setRotationPoint(16F, -6F, -10F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 301
		bodyModel[142].setRotationPoint(18F, -6F, 5F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 302
		bodyModel[143].setRotationPoint(12F, -6F, 3F);

		bodyModel[144].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 303
		bodyModel[144].setRotationPoint(11.4F, -14F, 4F);
		bodyModel[144].rotateAngleY = -0.38397244F;

		bodyModel[145].addBox(0F, 0F, 0F, 3, 10, 3, 0F); // Box 304
		bodyModel[145].setRotationPoint(17.5F, -15F, 2F);

		bodyModel[146].addShapeBox(2F, 3F, 0.5F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 305
		bodyModel[146].setRotationPoint(11.4F, -14F, 4F);
		bodyModel[146].rotateAngleY = -0.38397244F;

		bodyModel[147].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 306
		bodyModel[147].setRotationPoint(19F, -11F, -10F);

		bodyModel[148].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[148].setRotationPoint(14F, -16F, 5F);
		bodyModel[148].rotateAngleY = 0.78539816F;

		bodyModel[149].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 298
		bodyModel[149].setRotationPoint(12F, -12F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[150].setRotationPoint(-16F, -17F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[151].setRotationPoint(-16F, -17F, -7F);

		bodyModel[152].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 19
		bodyModel[152].setRotationPoint(3.5F, 2F, -11F);
		bodyModel[152].rotateAngleX = 0.78539816F;

		bodyModel[153].addBox(0F, 0F, 0F, 10, 3, 22, 0F); // Box 489
		bodyModel[153].setRotationPoint(-5F, 3F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[154].setRotationPoint(-5F, 2F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[155].setRotationPoint(-5F, 6F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[156].setRotationPoint(-5F, 6F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[157].setRotationPoint(-5F, 2F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[158].setRotationPoint(-5F, 6F, 9F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 377 cull
		bodyModel[159].setRotationPoint(-12F, -24.5F, -2F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 288
		bodyModel[160].setRotationPoint(-31F, 2.5F, -2F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 379
		bodyModel[161].setRotationPoint(27F, 2.5F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 356
		bodyModel[162].setRotationPoint(10F, -22.5F, -9F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 358
		bodyModel[163].setRotationPoint(10F, -22F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Box 359
		bodyModel[164].setRotationPoint(10F, -22.5F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 360
		bodyModel[165].setRotationPoint(10F, -21F, 9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 294
		bodyModel[166].setRotationPoint(10F, -21F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[167].setRotationPoint(12F, -22.5F, 3F);

		bodyModel[168].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[168].setRotationPoint(11F, -22F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[169].setRotationPoint(12F, -22.5F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 280
		bodyModel[170].setRotationPoint(12F, -20F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[171].setRotationPoint(12F, -20F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 282
		bodyModel[172].setRotationPoint(11F, -22.5F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
		bodyModel[173].setRotationPoint(11F, -22.5F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
		bodyModel[174].setRotationPoint(23F, -22.5F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 286
		bodyModel[175].setRotationPoint(23F, -22.5F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 408
		bodyModel[176].setRotationPoint(24F, -22F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 409
		bodyModel[177].setRotationPoint(24F, -22.5F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[178].setRotationPoint(24F, -21F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 411
		bodyModel[179].setRotationPoint(24F, -22.5F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 412
		bodyModel[180].setRotationPoint(24F, -21F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 413
		bodyModel[181].setRotationPoint(25F, -22.5F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 414
		bodyModel[182].setRotationPoint(25F, -22.5F, 3F);

		bodyModel[183].addBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F); // Box 415
		bodyModel[183].setRotationPoint(3.5F, 2F, 11F);
		bodyModel[183].rotateAngleX = -0.78539816F;

		bodyModel[184].addBox(0F, 0F, 0F, 2, 7, 14, 0F); // Box 457
		bodyModel[184].setRotationPoint(-16F, -16F, -7F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 8, 13, 0F); // Box 458
		bodyModel[185].setRotationPoint(-16F, -9F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[186].setRotationPoint(-15.5F, -8.5F, -7F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 43
		bodyModel[187].setRotationPoint(-15F, -6.5F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 574
		bodyModel[188].setRotationPoint(-16F, -1F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[189].setRotationPoint(14F, -19F, 10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[190].setRotationPoint(14F, -20F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[191].setRotationPoint(26F, -5F, 8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[192].setRotationPoint(27F, -5F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 306
		bodyModel[193].setRotationPoint(27F, -5F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[194].setRotationPoint(26F, -5F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull
		bodyModel[195].setRotationPoint(-31.5F, -3F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[196].setRotationPoint(-31.5F, -4F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594 cull
		bodyModel[197].setRotationPoint(30.5F, -4F, -2F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 595 cull
		bodyModel[198].setRotationPoint(30.5F, -3F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 359 smoke
		bodyModel[199].setRotationPoint(1F, -23F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 360 smoke
		bodyModel[200].setRotationPoint(-11F, -23F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 361 up 1198
		bodyModel[201].setRotationPoint(-21F, 2F, 9.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[202].setRotationPoint(-21F, 1F, 9.25F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 363
		bodyModel[203].setRotationPoint(-20.75F, 2.5F, 9.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364
		bodyModel[204].setRotationPoint(16F, 2F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 365
		bodyModel[205].setRotationPoint(-18F, 2F, -11F);

		bodyModel[206].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 366
		bodyModel[206].setRotationPoint(14.5F, -23.5F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[207].setRotationPoint(31F, -8F, -10F);
		bodyModel[207].rotateAngleY = -3.14159265F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[208].setRotationPoint(27.5F, -8F, -10F);
		bodyModel[208].rotateAngleY = -3.14159265F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[209].setRotationPoint(27.5F, -8F, 11F);
		bodyModel[209].rotateAngleY = -3.14159265F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[210].setRotationPoint(31F, -8F, 11F);
		bodyModel[210].rotateAngleY = -3.14159265F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[211].setRotationPoint(-31F, -8F, -10F);
		bodyModel[211].rotateAngleY = -3.14159265F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[212].setRotationPoint(-31F, -8F, 11F);
		bodyModel[212].rotateAngleY = -3.14159265F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[213].setRotationPoint(14F, -22.5F, -6F);

		bodyModel[214].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 390
		bodyModel[214].setRotationPoint(14F, -19F, 11F);

		bodyModel[215].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 391
		bodyModel[215].setRotationPoint(14F, -19F, -12F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 392
		bodyModel[216].setRotationPoint(-28F, 0F, -8F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 393
		bodyModel[217].setRotationPoint(-28F, 1F, -8F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 394
		bodyModel[218].setRotationPoint(-31F, 3F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[219].setRotationPoint(-31F, 3F, 8F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 396
		bodyModel[220].setRotationPoint(-31F, 3F, 7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[221].setRotationPoint(-31F, 5F, 8F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 398
		bodyModel[222].setRotationPoint(-31F, 4F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[223].setRotationPoint(-31F, 7F, 9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[224].setRotationPoint(-31F, 8F, 9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -1F, -0.6F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 401
		bodyModel[225].setRotationPoint(-28F, 5F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 402
		bodyModel[226].setRotationPoint(-28F, 1F, 8F);

		bodyModel[227].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 403
		bodyModel[227].setRotationPoint(-31F, 0F, 7F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 405
		bodyModel[228].setRotationPoint(-28F, 0F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 406
		bodyModel[229].setRotationPoint(-28F, 1F, 7F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 407
		bodyModel[230].setRotationPoint(28F, 0F, -8F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 408
		bodyModel[231].setRotationPoint(28F, 3F, -8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[232].setRotationPoint(28F, 3F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 410
		bodyModel[233].setRotationPoint(27F, 1F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[234].setRotationPoint(27F, 0F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 412
		bodyModel[235].setRotationPoint(27F, 0F, -8F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 413
		bodyModel[236].setRotationPoint(28F, 1F, -8F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 414
		bodyModel[237].setRotationPoint(28F, 4F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 415
		bodyModel[238].setRotationPoint(27F, 5F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -1F, -0.6F, 0F, -1F); // Box 416
		bodyModel[239].setRotationPoint(27F, 5F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 417
		bodyModel[240].setRotationPoint(28F, 7F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 418
		bodyModel[241].setRotationPoint(27F, 8F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 419
		bodyModel[242].setRotationPoint(28F, 7F, 9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[243].setRotationPoint(27F, 8F, 9F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 421
		bodyModel[244].setRotationPoint(28F, 4F, 8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 422
		bodyModel[245].setRotationPoint(27F, 5F, 8F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 423
		bodyModel[246].setRotationPoint(28F, 3F, 8F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 424
		bodyModel[247].setRotationPoint(28F, 3F, 7F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 425
		bodyModel[248].setRotationPoint(28F, 0F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[249].setRotationPoint(27F, 0F, 8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[250].setRotationPoint(27F, 1F, 8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[251].setRotationPoint(27F, 5F, 8F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 429
		bodyModel[252].setRotationPoint(27F, 0F, 7F);

		bodyModel[253].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 430
		bodyModel[253].setRotationPoint(28F, 1F, 7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[254].setRotationPoint(8F, -5F, -11F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 5, 0, 0F); // Box 284
		bodyModel[255].setRotationPoint(9F, -5F, -11F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 390
		bodyModel[256].setRotationPoint(9F, -2F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391 cull
		bodyModel[257].setRotationPoint(-33F, 6F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391 cull
		bodyModel[258].setRotationPoint(-33F, 6F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391 cull
		bodyModel[259].setRotationPoint(31F, 6F, 7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391 cull
		bodyModel[260].setRotationPoint(31F, 6F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 395
		bodyModel[261].setRotationPoint(24.5F, -5.75F, -10.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 396
		bodyModel[262].setRotationPoint(24.5F, -5.75F, 9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 smol fuel tank addition
		bodyModel[263].setRotationPoint(-5F, 3F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 331 lamp rear 2 beam sp
		bodyModel[264].setRotationPoint(25.25F, -21.65F, 1.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 332 lamp rear 2 beam sp
		bodyModel[265].setRotationPoint(25.25F, -21.65F, 3.45F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 333 lamp rear gyro sp
		bodyModel[266].setRotationPoint(25.5F, -21.65F, -5.45F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 lamp rear gyro sp
		bodyModel[267].setRotationPoint(25.5F, -21.65F, -3.5F);

		bodyModel[268].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F); // Box 300 glow marker
		bodyModel[268].setRotationPoint(25.25F, -21F, -6F);
		bodyModel[268].rotateAngleY = -0.59341195F;

		bodyModel[269].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F); // Box 348 glow marker
		bodyModel[269].setRotationPoint(25.25F, -21F, 6F);
		bodyModel[269].rotateAngleY = 0.59341195F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 349
		bodyModel[270].setRotationPoint(24F, -21.5F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 416
		bodyModel[271].setRotationPoint(24F, -21.65F, -5.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.1F, 0.5F, 1F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[272].setRotationPoint(24F, -21.5F, 6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.38F, 0F, 0F, 0.38F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[273].setRotationPoint(24F, -21.5F, 1.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[274].setRotationPoint(24F, -22.5F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, 0F, 1F); // Box 420
		bodyModel[275].setRotationPoint(25F, -22.5F, 0F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 1F, 0F, -0.9F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -0.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 421
		bodyModel[276].setRotationPoint(25F, -22.5F, -6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 422
		bodyModel[277].setRotationPoint(24F, -22.5F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[278].setRotationPoint(26.01F, -21.5F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		bodyModel[279].setRotationPoint(26.01F, -21.5F, 0F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 0, 11, 0F); // Box 425
		bodyModel[280].setRotationPoint(24F, -19.49F, -5.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[281].setRotationPoint(9F, -22F, -2F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1.25F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[282].setRotationPoint(9F, -22F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1.25F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 190
		bodyModel[283].setRotationPoint(9F, -22F, 2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F); // Box 193 numberboard glow
		bodyModel[284].setRotationPoint(9.5F, -22.05F, -6.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Box 194 numberboard glow
		bodyModel[285].setRotationPoint(9.5F, -22.05F, 2.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331 lamp front 2 beam sp
		bodyModel[286].setRotationPoint(-29.25F, -19.15F, -5.45F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 lamp front 2 beam sp
		bodyModel[287].setRotationPoint(-29.25F, -19.15F, -3.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 333 lamp front gyro sp
		bodyModel[288].setRotationPoint(-29.5F, -19.15F, 1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 334 lamp front gyro sp
		bodyModel[289].setRotationPoint(-29.5F, -19.15F, 3.45F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F); // Box 299
		bodyModel[290].setRotationPoint(-29F, -19.15F, 1.5F);

		bodyModel[291].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 300 glow marker
		bodyModel[291].setRotationPoint(-28.25F, -18.5F, -6F);
		bodyModel[291].rotateAngleY = 0.59341195F;

		bodyModel[292].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 348 glow marker
		bodyModel[292].setRotationPoint(-28.25F, -18.5F, 6F);
		bodyModel[292].rotateAngleY = -0.59341195F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[293].setRotationPoint(-28F, -19F, 6F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 414
		bodyModel[294].setRotationPoint(-28F, -19F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[295].setRotationPoint(-29F, -19F, -5.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[296].setRotationPoint(22F, -24F, 1.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[297].setRotationPoint(22F, -24.5F, 1.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[298].setRotationPoint(22F, -24.5F, 1.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[299].setRotationPoint(22F, -24.5F, 1.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[300].setRotationPoint(22F, -24.5F, 1.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 431 cull support
		bodyModel[301].setRotationPoint(22F, -23F, 1.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[302].setRotationPoint(17.7F, -16F, 2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[303].setRotationPoint(11F, -14F, 4F);
		bodyModel[303].rotateAngleY = -0.45378561F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[304].setRotationPoint(11F, -16F, 4F);
		bodyModel[304].rotateAngleY = -0.45378561F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[305].setRotationPoint(11F, -10F, 4F);
		bodyModel[305].rotateAngleY = -0.45378561F;

		bodyModel[306].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[306].setRotationPoint(11.5F, -19.5F, 7.5F);
		//bodyModel[306].rotateAngleY = 0.17453293F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[307].setRotationPoint(11F, 1F, 8.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[308].setRotationPoint(-20F, -20F, -2.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[309].setRotationPoint(-26F, -20F, -2.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 433
		bodyModel[310].setRotationPoint(-26F, -19F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[311].setRotationPoint(-26F, -18.5F, 6.1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[312].setRotationPoint(-26F, -18.5F, -7.1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[313].setRotationPoint(-16F, -19F, -7F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[314].setRotationPoint(3F, -18F, -7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[315].setRotationPoint(8F, -15F, -7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[316].setRotationPoint(8F, -15F, 0F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 442
		bodyModel[317].setRotationPoint(-31.75F, -3F, -4.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443
		bodyModel[318].setRotationPoint(30.75F, -3F, 2.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[319].setRotationPoint(-27F, -19F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[320].setRotationPoint(-27F, -19F, 0F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 446
		bodyModel[321].setRotationPoint(-27F, -17F, -6F);
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1234) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16 ||GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 634) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black2.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}