//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.06.2022 - 23:26:41
// Last changed on: 16.06.2022 - 23:26:41

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeAnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.ModelTypeAClassico;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelSW1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSW1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[428];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 266, 142, textureX, textureY); // Box 316
		bodyModel[1] = new ModelRendererTurbo(this, 125, 61, textureX, textureY); // Box 315
		bodyModel[2] = new ModelRendererTurbo(this, 320, 19, textureX, textureY); // Box 296
		bodyModel[3] = new ModelRendererTurbo(this, 320, 22, textureX, textureY); // Box 295
		bodyModel[4] = new ModelRendererTurbo(this, 320, 25, textureX, textureY); // Box 294
		bodyModel[5] = new ModelRendererTurbo(this, 320, 28, textureX, textureY); // Box 293
		bodyModel[6] = new ModelRendererTurbo(this, 262, 17, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[7] = new ModelRendererTurbo(this, 320, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[8] = new ModelRendererTurbo(this, 320, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[9] = new ModelRendererTurbo(this, 320, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[10] = new ModelRendererTurbo(this, 320, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[11] = new ModelRendererTurbo(this, 320, 5, textureX, textureY); // Box 421 prime base
		bodyModel[12] = new ModelRendererTurbo(this, 367, 17, textureX, textureY); // Box 199
		bodyModel[13] = new ModelRendererTurbo(this, 374, 17, textureX, textureY); // Box 198
		bodyModel[14] = new ModelRendererTurbo(this, 367, 5, textureX, textureY); // Box 197
		bodyModel[15] = new ModelRendererTurbo(this, 367, 8, textureX, textureY); // Box 196
		bodyModel[16] = new ModelRendererTurbo(this, 367, 11, textureX, textureY); // Box 195
		bodyModel[17] = new ModelRendererTurbo(this, 376, 14, textureX, textureY); // Box 182
		bodyModel[18] = new ModelRendererTurbo(this, 367, 14, textureX, textureY); // Box 181
		bodyModel[19] = new ModelRendererTurbo(this, 376, 11, textureX, textureY); // Box 166
		bodyModel[20] = new ModelRendererTurbo(this, 339, 29, textureX, textureY); // Box 166
		bodyModel[21] = new ModelRendererTurbo(this, 334, 29, textureX, textureY); // Box 165
		bodyModel[22] = new ModelRendererTurbo(this, 329, 29, textureX, textureY); // Box 164
		bodyModel[23] = new ModelRendererTurbo(this, 337, 26, textureX, textureY); // Box 270
		bodyModel[24] = new ModelRendererTurbo(this, 354, 23, textureX, textureY); // Box 387
		bodyModel[25] = new ModelRendererTurbo(this, 344, 23, textureX, textureY); // Box 386
		bodyModel[26] = new ModelRendererTurbo(this, 344, 29, textureX, textureY); // Box 385
		bodyModel[27] = new ModelRendererTurbo(this, 344, 26, textureX, textureY); // Box 384
		bodyModel[28] = new ModelRendererTurbo(this, 339, 20, textureX, textureY); // Box 418
		bodyModel[29] = new ModelRendererTurbo(this, 332, 20, textureX, textureY); // Box 245
		bodyModel[30] = new ModelRendererTurbo(this, 344, 20, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 349, 20, textureX, textureY); // Box 74
		bodyModel[32] = new ModelRendererTurbo(this, 354, 20, textureX, textureY); // Box 114
		bodyModel[33] = new ModelRendererTurbo(this, 345, 16, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[34] = new ModelRendererTurbo(this, 345, 16, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[35] = new ModelRendererTurbo(this, 345, 16, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[36] = new ModelRendererTurbo(this, 345, 16, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[37] = new ModelRendererTurbo(this, 354, 16, textureX, textureY); // Box 364 prime base
		bodyModel[38] = new ModelRendererTurbo(this, 352, 9, textureX, textureY); // Box 280
		bodyModel[39] = new ModelRendererTurbo(this, 352, 5, textureX, textureY); // Box 279
		bodyModel[40] = new ModelRendererTurbo(this, 337, 5, textureX, textureY); // box65
		bodyModel[41] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // box64
		bodyModel[42] = new ModelRendererTurbo(this, 323, 15, textureX, textureY); // Box 269
		bodyModel[43] = new ModelRendererTurbo(this, 331, 14, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[44] = new ModelRendererTurbo(this, 326, 15, textureX, textureY); // Box 409 commander base
		bodyModel[45] = new ModelRendererTurbo(this, 332, 8, textureX, textureY); // Box 351
		bodyModel[46] = new ModelRendererTurbo(this, 329, 8, textureX, textureY); // Box 350
		bodyModel[47] = new ModelRendererTurbo(this, 332, 14, textureX, textureY, "cull"); // Box 1100 cull
		bodyModel[48] = new ModelRendererTurbo(this, 280, 31, textureX, textureY, "lamp"); // Box 78 glow
		bodyModel[49] = new ModelRendererTurbo(this, 281, 24, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 268
		bodyModel[51] = new ModelRendererTurbo(this, 33, 80, textureX, textureY); // Box 267
		bodyModel[52] = new ModelRendererTurbo(this, 38, 82, textureX, textureY); // Box 266
		bodyModel[53] = new ModelRendererTurbo(this, 38, 80, textureX, textureY); // Box 265
		bodyModel[54] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 264
		bodyModel[55] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 263
		bodyModel[56] = new ModelRendererTurbo(this, 148, 225, textureX, textureY); // Box 262
		bodyModel[57] = new ModelRendererTurbo(this, 146, 235, textureX, textureY); // Box 261
		bodyModel[58] = new ModelRendererTurbo(this, 156, 233, textureX, textureY); // Box 260
		bodyModel[59] = new ModelRendererTurbo(this, 117, 228, textureX, textureY); // Box 259
		bodyModel[60] = new ModelRendererTurbo(this, 127, 226, textureX, textureY); // Box 258
		bodyModel[61] = new ModelRendererTurbo(this, 100, 223, textureX, textureY); // Box 257
		bodyModel[62] = new ModelRendererTurbo(this, 131, 235, textureX, textureY); // Box 256
		bodyModel[63] = new ModelRendererTurbo(this, 142, 235, textureX, textureY); // Box 255
		bodyModel[64] = new ModelRendererTurbo(this, 305, 148, textureX, textureY); // Box 254
		bodyModel[65] = new ModelRendererTurbo(this, 205, 131, textureX, textureY, "lamp"); // Box 200 lamp headlight rear double
		bodyModel[66] = new ModelRendererTurbo(this, 212, 131, textureX, textureY, "lamp"); // Box 197 lamp headlight rear double
		bodyModel[67] = new ModelRendererTurbo(this, 205, 136, textureX, textureY, "lamp"); // Box 172 lamp headlight front double
		bodyModel[68] = new ModelRendererTurbo(this, 212, 136, textureX, textureY, "lamp"); // Box 171 lamp headlight front double
		bodyModel[69] = new ModelRendererTurbo(this, 174, 78, textureX, textureY); // Box 319
		bodyModel[70] = new ModelRendererTurbo(this, 256, 136, textureX, textureY); // Box 276
		bodyModel[71] = new ModelRendererTurbo(this, 256, 141, textureX, textureY); // Box 275
		bodyModel[72] = new ModelRendererTurbo(this, 272, 10, textureX, textureY); // Box 298
		bodyModel[73] = new ModelRendererTurbo(this, 285, 8, textureX, textureY); // Box 297
		bodyModel[74] = new ModelRendererTurbo(this, 313, 11, textureX, textureY); // Box 398
		bodyModel[75] = new ModelRendererTurbo(this, 302, 9, textureX, textureY); // Box 397
		bodyModel[76] = new ModelRendererTurbo(this, 467, 85, textureX, textureY); // Box 267
		bodyModel[77] = new ModelRendererTurbo(this, 311, 25, textureX, textureY); // Box xxx control stand bits
		bodyModel[78] = new ModelRendererTurbo(this, 312, 29, textureX, textureY); // Box xxx control stand bits
		bodyModel[79] = new ModelRendererTurbo(this, 311, 20, textureX, textureY); // Box xxx control stand bits
		bodyModel[80] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Box xxx control stand bits
		bodyModel[81] = new ModelRendererTurbo(this, 295, 24, textureX, textureY); // Box xxx control stand bits
		bodyModel[82] = new ModelRendererTurbo(this, 272, 22, textureX, textureY); // Box xxx control stand bits
		bodyModel[83] = new ModelRendererTurbo(this, 290, 24, textureX, textureY); // Box xxx control stand bits
		bodyModel[84] = new ModelRendererTurbo(this, 229, 188, textureX, textureY); // Box 259
		bodyModel[85] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Box 316
		bodyModel[86] = new ModelRendererTurbo(this, 21, 215, textureX, textureY); // Box 315
		bodyModel[87] = new ModelRendererTurbo(this, 63, 108, textureX, textureY); // Box 306
		bodyModel[88] = new ModelRendererTurbo(this, 34, 224, textureX, textureY); // Box 305
		bodyModel[89] = new ModelRendererTurbo(this, 204, 161, textureX, textureY); // Box 146
		bodyModel[90] = new ModelRendererTurbo(this, 194, 166, textureX, textureY); // Box 53
		bodyModel[91] = new ModelRendererTurbo(this, 204, 169, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 194, 174, textureX, textureY); // Box 52
		bodyModel[93] = new ModelRendererTurbo(this, 7, 230, textureX, textureY); // Box 25
		bodyModel[94] = new ModelRendererTurbo(this, 8, 217, textureX, textureY); // Box 24
		bodyModel[95] = new ModelRendererTurbo(this, 76, 111, textureX, textureY); // Box 283
		bodyModel[96] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 282
		bodyModel[97] = new ModelRendererTurbo(this, 263, 146, textureX, textureY); // Box 265
		bodyModel[98] = new ModelRendererTurbo(this, 263, 144, textureX, textureY); // Box 264
		bodyModel[99] = new ModelRendererTurbo(this, 229, 181, textureX, textureY); // Box 263
		bodyModel[100] = new ModelRendererTurbo(this, 237, 181, textureX, textureY); // Box 262
		bodyModel[101] = new ModelRendererTurbo(this, 229, 190, textureX, textureY); // Box 261
		bodyModel[102] = new ModelRendererTurbo(this, 250, 179, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[103] = new ModelRendererTurbo(this, 253, 154, textureX, textureY); // Box 179
		bodyModel[104] = new ModelRendererTurbo(this, 250, 186, textureX, textureY, "cull"); // Box 186 cull
		bodyModel[105] = new ModelRendererTurbo(this, 260, 154, textureX, textureY); // Box 50
		bodyModel[106] = new ModelRendererTurbo(this, 158, 81, textureX, textureY); // Box 285
		bodyModel[107] = new ModelRendererTurbo(this, 164, 102, textureX, textureY); // Box 525
		bodyModel[108] = new ModelRendererTurbo(this, 139, 78, textureX, textureY); // Box 524
		bodyModel[109] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 523
		bodyModel[110] = new ModelRendererTurbo(this, 172, 90, textureX, textureY); // Box 540
		bodyModel[111] = new ModelRendererTurbo(this, 162, 88, textureX, textureY); // Box 539
		bodyModel[112] = new ModelRendererTurbo(this, 152, 90, textureX, textureY); // Box 538
		bodyModel[113] = new ModelRendererTurbo(this, 165, 78, textureX, textureY); // Box 383
		bodyModel[114] = new ModelRendererTurbo(this, 141, 123, textureX, textureY); // Box 397
		bodyModel[115] = new ModelRendererTurbo(this, 141, 136, textureX, textureY); // Box 396
		bodyModel[116] = new ModelRendererTurbo(this, 229, 137, textureX, textureY); // Box 256
		bodyModel[117] = new ModelRendererTurbo(this, 100, 171, textureX, textureY); // Box 255
		bodyModel[118] = new ModelRendererTurbo(this, 103, 171, textureX, textureY); // Box 254
		bodyModel[119] = new ModelRendererTurbo(this, 106, 171, textureX, textureY); // Box 253
		bodyModel[120] = new ModelRendererTurbo(this, 109, 171, textureX, textureY); // Box 252
		bodyModel[121] = new ModelRendererTurbo(this, 48, 101, textureX, textureY); // Box 251
		bodyModel[122] = new ModelRendererTurbo(this, 51, 101, textureX, textureY); // Box 250
		bodyModel[123] = new ModelRendererTurbo(this, 99, 167, textureX, textureY); // Box 393
		bodyModel[124] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 392
		bodyModel[125] = new ModelRendererTurbo(this, 9, 123, textureX, textureY); // Box 391
		bodyModel[126] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 390
		bodyModel[127] = new ModelRendererTurbo(this, 54, 173, textureX, textureY); // Box 186
		bodyModel[128] = new ModelRendererTurbo(this, 54, 169, textureX, textureY); // Box 185
		bodyModel[129] = new ModelRendererTurbo(this, 53, 184, textureX, textureY); // Box 184
		bodyModel[130] = new ModelRendererTurbo(this, 77, 169, textureX, textureY); // Box 183
		bodyModel[131] = new ModelRendererTurbo(this, 77, 173, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 53, 177, textureX, textureY); // Box 181
		bodyModel[133] = new ModelRendererTurbo(this, 47, 202, textureX, textureY); // Box 202
		bodyModel[134] = new ModelRendererTurbo(this, 97, 203, textureX, textureY); // Box 89
		bodyModel[135] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // Box 392
		bodyModel[136] = new ModelRendererTurbo(this, 105, 28, textureX, textureY); // Box 391
		bodyModel[137] = new ModelRendererTurbo(this, 105, 28, textureX, textureY); // Box 390
		bodyModel[138] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // Box 389
		bodyModel[139] = new ModelRendererTurbo(this, 58, 26, textureX, textureY); // Box 388
		bodyModel[140] = new ModelRendererTurbo(this, 105, 28, textureX, textureY); // Box 134
		bodyModel[141] = new ModelRendererTurbo(this, 105, 28, textureX, textureY); // Box 133
		bodyModel[142] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // Box 130
		bodyModel[143] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // Box 129
		bodyModel[144] = new ModelRendererTurbo(this, 75, 26, textureX, textureY); // Box 69
		bodyModel[145] = new ModelRendererTurbo(this, 135, 10, textureX, textureY); // Box 108
		bodyModel[146] = new ModelRendererTurbo(this, 55, 84, textureX, textureY); // Box 190
		bodyModel[147] = new ModelRendererTurbo(this, 33, 84, textureX, textureY); // Box 188
		bodyModel[148] = new ModelRendererTurbo(this, 66, 94, textureX, textureY); // Box 1097
		bodyModel[149] = new ModelRendererTurbo(this, 66, 85, textureX, textureY); // Box 1096
		bodyModel[150] = new ModelRendererTurbo(this, 54, 101, textureX, textureY); // Box 377
		bodyModel[151] = new ModelRendererTurbo(this, 48, 103, textureX, textureY); // Box 376
		bodyModel[152] = new ModelRendererTurbo(this, 51, 103, textureX, textureY); // Box 374
		bodyModel[153] = new ModelRendererTurbo(this, 44, 84, textureX, textureY); // Box 373
		bodyModel[154] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Box 372
		bodyModel[155] = new ModelRendererTurbo(this, 22, 84, textureX, textureY); // Box 371
		bodyModel[156] = new ModelRendererTurbo(this, 256, 141, textureX, textureY); // Box 274
		bodyModel[157] = new ModelRendererTurbo(this, 321, 133, textureX, textureY); // Box 394
		bodyModel[158] = new ModelRendererTurbo(this, 310, 133, textureX, textureY); // Box 393
		bodyModel[159] = new ModelRendererTurbo(this, 321, 136, textureX, textureY); // Box 392
		bodyModel[160] = new ModelRendererTurbo(this, 310, 136, textureX, textureY); // Box 391
		bodyModel[161] = new ModelRendererTurbo(this, 310, 139, textureX, textureY); // Box 390
		bodyModel[162] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 389
		bodyModel[163] = new ModelRendererTurbo(this, 112, 104, textureX, textureY); // Box 489
		bodyModel[164] = new ModelRendererTurbo(this, 32, 179, textureX, textureY); // Box 1
		bodyModel[165] = new ModelRendererTurbo(this, 112, 111, textureX, textureY); // Box 490
		bodyModel[166] = new ModelRendererTurbo(this, 310, 139, textureX, textureY); // Box 355
		bodyModel[167] = new ModelRendererTurbo(this, 321, 139, textureX, textureY); // Box 354
		bodyModel[168] = new ModelRendererTurbo(this, 310, 136, textureX, textureY); // Box 353
		bodyModel[169] = new ModelRendererTurbo(this, 321, 136, textureX, textureY); // Box 352
		bodyModel[170] = new ModelRendererTurbo(this, 321, 133, textureX, textureY); // Box 351
		bodyModel[171] = new ModelRendererTurbo(this, 310, 133, textureX, textureY); // Box 350
		bodyModel[172] = new ModelRendererTurbo(this, 117, 165, textureX, textureY); // Box 184
		bodyModel[173] = new ModelRendererTurbo(this, 321, 127, textureX, textureY); // Box 344
		bodyModel[174] = new ModelRendererTurbo(this, 310, 130, textureX, textureY); // Box 349
		bodyModel[175] = new ModelRendererTurbo(this, 321, 130, textureX, textureY); // Box 348
		bodyModel[176] = new ModelRendererTurbo(this, 321, 124, textureX, textureY); // Box 347
		bodyModel[177] = new ModelRendererTurbo(this, 310, 124, textureX, textureY); // Box 346
		bodyModel[178] = new ModelRendererTurbo(this, 310, 127, textureX, textureY); // Box 345
		bodyModel[179] = new ModelRendererTurbo(this, 99, 111, textureX, textureY); // Box 491
		bodyModel[180] = new ModelRendererTurbo(this, 256, 136, textureX, textureY); // Box 273
		bodyModel[181] = new ModelRendererTurbo(this, 310, 130, textureX, textureY); // Box 342
		bodyModel[182] = new ModelRendererTurbo(this, 321, 130, textureX, textureY); // Box 341
		bodyModel[183] = new ModelRendererTurbo(this, 310, 127, textureX, textureY); // Box 340
		bodyModel[184] = new ModelRendererTurbo(this, 321, 127, textureX, textureY); // Box 339
		bodyModel[185] = new ModelRendererTurbo(this, 310, 124, textureX, textureY); // Box 338
		bodyModel[186] = new ModelRendererTurbo(this, 321, 124, textureX, textureY); // Box 337
		bodyModel[187] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // Box 135
		bodyModel[188] = new ModelRendererTurbo(this, 51, 105, textureX, textureY); // Box 232
		bodyModel[189] = new ModelRendererTurbo(this, 48, 105, textureX, textureY); // Box 231
		bodyModel[190] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 187
		bodyModel[191] = new ModelRendererTurbo(this, 59, 96, textureX, textureY); // Box 131
		bodyModel[192] = new ModelRendererTurbo(this, 51, 108, textureX, textureY); // Box 68
		bodyModel[193] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 67
		bodyModel[194] = new ModelRendererTurbo(this, 294, 131, textureX, textureY); // Box 628
		bodyModel[195] = new ModelRendererTurbo(this, 292, 137, textureX, textureY); // Box 627
		bodyModel[196] = new ModelRendererTurbo(this, 294, 133, textureX, textureY, "lamp"); // Box 626 sp numberboard
		bodyModel[197] = new ModelRendererTurbo(this, 294, 147, textureX, textureY, "lamp"); // Box 625 sp numerbboard
		bodyModel[198] = new ModelRendererTurbo(this, 294, 151, textureX, textureY); // Box 624
		bodyModel[199] = new ModelRendererTurbo(this, 292, 142, textureX, textureY); // Box 623
		bodyModel[200] = new ModelRendererTurbo(this, 213, 142, textureX, textureY, "cull"); // Box 219 cull headlight enclosure
		bodyModel[201] = new ModelRendererTurbo(this, 153, 154, textureX, textureY); // Box 387
		bodyModel[202] = new ModelRendererTurbo(this, 154, 152, textureX, textureY, "lamp"); // Box 386 numberboard front 2beam
		bodyModel[203] = new ModelRendererTurbo(this, 161, 152, textureX, textureY, "lamp"); // Box 385 numberboard front 2beam
		bodyModel[204] = new ModelRendererTurbo(this, 160, 154, textureX, textureY); // Box 384
		bodyModel[205] = new ModelRendererTurbo(this, 186, 142, textureX, textureY); // Box 383
		bodyModel[206] = new ModelRendererTurbo(this, 204, 141, textureX, textureY); // Box 382
		bodyModel[207] = new ModelRendererTurbo(this, 142, 158, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[208] = new ModelRendererTurbo(this, 161, 150, textureX, textureY, "lamp"); // Box 168 numberboard front single
		bodyModel[209] = new ModelRendererTurbo(this, 161, 148, textureX, textureY, "lamp"); // Box 167 numberboard front single
		bodyModel[210] = new ModelRendererTurbo(this, 167, 154, textureX, textureY); // Box 173
		bodyModel[211] = new ModelRendererTurbo(this, 174, 154, textureX, textureY); // Box 148
		bodyModel[212] = new ModelRendererTurbo(this, 185, 148, textureX, textureY); // Box 147
		bodyModel[213] = new ModelRendererTurbo(this, 216, 149, textureX, textureY, "cull"); // Box 220 cull headlight enclosure
		bodyModel[214] = new ModelRendererTurbo(this, 174, 150, textureX, textureY); // Box 387
		bodyModel[215] = new ModelRendererTurbo(this, 168, 148, textureX, textureY, "lamp"); // Box 386 numberboard front 2beam
		bodyModel[216] = new ModelRendererTurbo(this, 175, 148, textureX, textureY, "lamp"); // Box 385 numberboard front 2beam
		bodyModel[217] = new ModelRendererTurbo(this, 167, 150, textureX, textureY); // Box 384
		bodyModel[218] = new ModelRendererTurbo(this, 195, 142, textureX, textureY); // Box 383
		bodyModel[219] = new ModelRendererTurbo(this, 207, 148, textureX, textureY); // Box 382
		bodyModel[220] = new ModelRendererTurbo(this, 151, 158, textureX, textureY, "lamp"); // Box 169 headlight front big
		bodyModel[221] = new ModelRendererTurbo(this, 142, 152, textureX, textureY, "lamp"); // Box 168 numberboard front single
		bodyModel[222] = new ModelRendererTurbo(this, 147, 152, textureX, textureY, "lamp"); // Box 167 numberboard front single
		bodyModel[223] = new ModelRendererTurbo(this, 167, 158, textureX, textureY); // Box 173
		bodyModel[224] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 148
		bodyModel[225] = new ModelRendererTurbo(this, 196, 148, textureX, textureY); // Box 147
		bodyModel[226] = new ModelRendererTurbo(this, 269, 76, textureX, textureY); // Box 1074
		bodyModel[227] = new ModelRendererTurbo(this, 289, 75, textureX, textureY); // Box 1073
		bodyModel[228] = new ModelRendererTurbo(this, 266, 76, textureX, textureY); // Box 1072
		bodyModel[229] = new ModelRendererTurbo(this, 272, 76, textureX, textureY); // Box 1071
		bodyModel[230] = new ModelRendererTurbo(this, 286, 75, textureX, textureY); // Box 1070
		bodyModel[231] = new ModelRendererTurbo(this, 275, 76, textureX, textureY); // Box 1069
		bodyModel[232] = new ModelRendererTurbo(this, 292, 75, textureX, textureY); // Box 1068
		bodyModel[233] = new ModelRendererTurbo(this, 278, 76, textureX, textureY); // Box 1067
		bodyModel[234] = new ModelRendererTurbo(this, 281, 76, textureX, textureY); // Box 1065
		bodyModel[235] = new ModelRendererTurbo(this, 283, 75, textureX, textureY); // Box 1063
		bodyModel[236] = new ModelRendererTurbo(this, 122, 135, textureX, textureY); // Box 196
		bodyModel[237] = new ModelRendererTurbo(this, 113, 180, textureX, textureY); // Box 235
		bodyModel[238] = new ModelRendererTurbo(this, 74, 179, textureX, textureY); // Box 234
		bodyModel[239] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 107
		bodyModel[240] = new ModelRendererTurbo(this, 174, 118, textureX, textureY); // Box 397
		bodyModel[241] = new ModelRendererTurbo(this, 174, 129, textureX, textureY); // Box 396
		bodyModel[242] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 138
		bodyModel[243] = new ModelRendererTurbo(this, 1, 125, textureX, textureY); // Box 20
		bodyModel[244] = new ModelRendererTurbo(this, 76, 125, textureX, textureY); // Box 19
		bodyModel[245] = new ModelRendererTurbo(this, 1, 136, textureX, textureY); // Box 5
		bodyModel[246] = new ModelRendererTurbo(this, 260, 61, textureX, textureY); // Box 396
		bodyModel[247] = new ModelRendererTurbo(this, 271, 61, textureX, textureY); // Box 395
		bodyModel[248] = new ModelRendererTurbo(this, 257, 67, textureX, textureY); // Box 381
		bodyModel[249] = new ModelRendererTurbo(this, 270, 67, textureX, textureY); // Box 380
		bodyModel[250] = new ModelRendererTurbo(this, 283, 67, textureX, textureY); // Box 379
		bodyModel[251] = new ModelRendererTurbo(this, 296, 67, textureX, textureY); // Box 378
		bodyModel[252] = new ModelRendererTurbo(this, 189, 54, textureX, textureY); // Box 412
		bodyModel[253] = new ModelRendererTurbo(this, 152, 54, textureX, textureY); // Box 411
		bodyModel[254] = new ModelRendererTurbo(this, 226, 53, textureX, textureY); // Box 348
		bodyModel[255] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 347
		bodyModel[256] = new ModelRendererTurbo(this, 226, 68, textureX, textureY); // Box 39
		bodyModel[257] = new ModelRendererTurbo(this, 229, 45, textureX, textureY); // Box 374
		bodyModel[258] = new ModelRendererTurbo(this, 258, 76, textureX, textureY); // Box 373
		bodyModel[259] = new ModelRendererTurbo(this, 258, 45, textureX, textureY); // Box 371
		bodyModel[260] = new ModelRendererTurbo(this, 224, 86, textureX, textureY); // Box 315 door swing right
		bodyModel[261] = new ModelRendererTurbo(this, 185, 72, textureX, textureY); // Box 15
		bodyModel[262] = new ModelRendererTurbo(this, 235, 89, textureX, textureY); // Box 10
		bodyModel[263] = new ModelRendererTurbo(this, 235, 104, textureX, textureY); // Box 9
		bodyModel[264] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 119
		bodyModel[265] = new ModelRendererTurbo(this, 169, 192, textureX, textureY); // Box 61 door swign right
		bodyModel[266] = new ModelRendererTurbo(this, 180, 187, textureX, textureY); // Box 71
		bodyModel[267] = new ModelRendererTurbo(this, 148, 187, textureX, textureY); // Box 9
		bodyModel[268] = new ModelRendererTurbo(this, 143, 82, textureX, textureY); // Box 201
		bodyModel[269] = new ModelRendererTurbo(this, 143, 91, textureX, textureY); // Box 200
		bodyModel[270] = new ModelRendererTurbo(this, 144, 78, textureX, textureY); // Box 194 stacc
		bodyModel[271] = new ModelRendererTurbo(this, 151, 78, textureX, textureY); // Box 193 stacc
		bodyModel[272] = new ModelRendererTurbo(this, 80, 34, textureX, textureY); // Box 192
		bodyModel[273] = new ModelRendererTurbo(this, 80, 36, textureX, textureY); // Box 191 skirt
		bodyModel[274] = new ModelRendererTurbo(this, 142, 86, textureX, textureY); // Box 174
		bodyModel[275] = new ModelRendererTurbo(this, 134, 82, textureX, textureY); // Box 173
		bodyModel[276] = new ModelRendererTurbo(this, 137, 82, textureX, textureY); // Box 172
		bodyModel[277] = new ModelRendererTurbo(this, 164, 95, textureX, textureY); // Box 171
		bodyModel[278] = new ModelRendererTurbo(this, 100, 38, textureX, textureY); // Box 159
		bodyModel[279] = new ModelRendererTurbo(this, 80, 38, textureX, textureY); // Box 158
		bodyModel[280] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 157
		bodyModel[281] = new ModelRendererTurbo(this, 112, 42, textureX, textureY); // Box 156
		bodyModel[282] = new ModelRendererTurbo(this, 117, 38, textureX, textureY); // Box 155
		bodyModel[283] = new ModelRendererTurbo(this, 85, 38, textureX, textureY); // Box 154
		bodyModel[284] = new ModelRendererTurbo(this, 103, 38, textureX, textureY); // Box 153
		bodyModel[285] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 152
		bodyModel[286] = new ModelRendererTurbo(this, 120, 38, textureX, textureY); // Box 151
		bodyModel[287] = new ModelRendererTurbo(this, 90, 38, textureX, textureY); // Box 150
		bodyModel[288] = new ModelRendererTurbo(this, 106, 38, textureX, textureY); // Box 149
		bodyModel[289] = new ModelRendererTurbo(this, 115, 42, textureX, textureY); // Box 148
		bodyModel[290] = new ModelRendererTurbo(this, 237, 184, textureX, textureY); // Box 183
		bodyModel[291] = new ModelRendererTurbo(this, 231, 181, textureX, textureY); // Box 182
		bodyModel[292] = new ModelRendererTurbo(this, 234, 181, textureX, textureY); // Box 180
		bodyModel[293] = new ModelRendererTurbo(this, 227, 146, textureX, textureY); // Box 177
		bodyModel[294] = new ModelRendererTurbo(this, 230, 174, textureX, textureY); // Box 176
		bodyModel[295] = new ModelRendererTurbo(this, 227, 144, textureX, textureY); // Box 174
		bodyModel[296] = new ModelRendererTurbo(this, 250, 137, textureX, textureY); // Box 169
		bodyModel[297] = new ModelRendererTurbo(this, 253, 137, textureX, textureY); // Box 168
		bodyModel[298] = new ModelRendererTurbo(this, 230, 130, textureX, textureY); // Box 166
		bodyModel[299] = new ModelRendererTurbo(this, 120, 42, textureX, textureY); // Box 154
		bodyModel[300] = new ModelRendererTurbo(this, 117, 40, textureX, textureY); // Box 153
		bodyModel[301] = new ModelRendererTurbo(this, 95, 38, textureX, textureY); // Box 152
		bodyModel[302] = new ModelRendererTurbo(this, 109, 38, textureX, textureY); // Box 151
		bodyModel[303] = new ModelRendererTurbo(this, 143, 64, textureX, textureY); // Box 117
		bodyModel[304] = new ModelRendererTurbo(this, 143, 60, textureX, textureY); // Box 116
		bodyModel[305] = new ModelRendererTurbo(this, 149, 63, textureX, textureY); // Box 115
		bodyModel[306] = new ModelRendererTurbo(this, 149, 58, textureX, textureY); // Box 114
		bodyModel[307] = new ModelRendererTurbo(this, 154, 62, textureX, textureY); // Box 113
		bodyModel[308] = new ModelRendererTurbo(this, 138, 61, textureX, textureY); // Box 78
		bodyModel[309] = new ModelRendererTurbo(this, 138, 65, textureX, textureY); // Box 74
		bodyModel[310] = new ModelRendererTurbo(this, 133, 61, textureX, textureY); // Box 114
		bodyModel[311] = new ModelRendererTurbo(this, 169, 120, textureX, textureY); // Box 43
		bodyModel[312] = new ModelRendererTurbo(this, 174, 81, textureX, textureY); // Box 33
		bodyModel[313] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
		bodyModel[314] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[315] = new ModelRendererTurbo(this, 268, 142, textureX, textureY); // Box 317
		bodyModel[316] = new ModelRendererTurbo(this, 273, 142, textureX, textureY); // Box 318
		bodyModel[317] = new ModelRendererTurbo(this, 275, 142, textureX, textureY); // Box 319
		bodyModel[318] = new ModelRendererTurbo(this, 268, 140, textureX, textureY); // Box 320
		bodyModel[319] = new ModelRendererTurbo(this, 275, 140, textureX, textureY); // Box 321
		bodyModel[320] = new ModelRendererTurbo(this, 273, 134, textureX, textureY); // Box 322
		bodyModel[321] = new ModelRendererTurbo(this, 266, 134, textureX, textureY); // Box 323
		bodyModel[322] = new ModelRendererTurbo(this, 54, 105, textureX, textureY); // Box 324
		bodyModel[323] = new ModelRendererTurbo(this, 54, 107, textureX, textureY); // Box 325
		bodyModel[324] = new ModelRendererTurbo(this, 184, 75, textureX, textureY); // Box 326
		bodyModel[325] = new ModelRendererTurbo(this, 104, 71, textureX, textureY); // Box 115
		bodyModel[326] = new ModelRendererTurbo(this, 82, 78, textureX, textureY); // Box 116
		bodyModel[327] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Box 117
		bodyModel[328] = new ModelRendererTurbo(this, 83, 77, textureX, textureY); // Box 120
		bodyModel[329] = new ModelRendererTurbo(this, 94, 77, textureX, textureY); // Box 121
		bodyModel[330] = new ModelRendererTurbo(this, 97, 76, textureX, textureY); // Box 122
		bodyModel[331] = new ModelRendererTurbo(this, 97, 78, textureX, textureY); // Box 123
		bodyModel[332] = new ModelRendererTurbo(this, 85, 76, textureX, textureY); // Box 124
		bodyModel[333] = new ModelRendererTurbo(this, 85, 64, textureX, textureY); // Box 335
		bodyModel[334] = new ModelRendererTurbo(this, 94, 65, textureX, textureY); // Box 336
		bodyModel[335] = new ModelRendererTurbo(this, 104, 69, textureX, textureY); // Box 337
		bodyModel[336] = new ModelRendererTurbo(this, 97, 66, textureX, textureY); // Box 338
		bodyModel[337] = new ModelRendererTurbo(this, 97, 64, textureX, textureY); // Box 339
		bodyModel[338] = new ModelRendererTurbo(this, 83, 65, textureX, textureY); // Box 340
		bodyModel[339] = new ModelRendererTurbo(this, 82, 66, textureX, textureY); // Box 341
		bodyModel[340] = new ModelRendererTurbo(this, 93, 66, textureX, textureY); // Box 342
		bodyModel[341] = new ModelRendererTurbo(this, 359, 25, textureX, textureY); // Box 240
		bodyModel[342] = new ModelRendererTurbo(this, 319, 33, textureX, textureY, "lamp"); // Box 171 lamp headlight retrofit
		bodyModel[343] = new ModelRendererTurbo(this, 326, 33, textureX, textureY, "lamp"); // Box 171 lamp headlight retrofit
		bodyModel[344] = new ModelRendererTurbo(this, 205, 126, textureX, textureY, "lamp"); // Box 346
		bodyModel[345] = new ModelRendererTurbo(this, 212, 126, textureX, textureY, "lamp"); // Box 347
		bodyModel[346] = new ModelRendererTurbo(this, 315, 50, textureX, textureY); // Box 2
		bodyModel[347] = new ModelRendererTurbo(this, 340, 51, textureX, textureY, "lamp"); // Box Glow
		bodyModel[348] = new ModelRendererTurbo(this, 338, 44, textureX, textureY, "lamp"); // Box Glow
		bodyModel[349] = new ModelRendererTurbo(this, 335, 51, textureX, textureY, "lamp"); // Box Glow
		bodyModel[350] = new ModelRendererTurbo(this, 333, 44, textureX, textureY, "lamp"); // Box Glow
		bodyModel[351] = new ModelRendererTurbo(this, 324, 47, textureX, textureY); // Box 2
		bodyModel[352] = new ModelRendererTurbo(this, 315, 45, textureX, textureY); // Box 2
		bodyModel[353] = new ModelRendererTurbo(this, 328, 44, textureX, textureY, "lamp"); // Box Glow
		bodyModel[354] = new ModelRendererTurbo(this, 330, 51, textureX, textureY, "lamp"); // Box Glow
		bodyModel[355] = new ModelRendererTurbo(this, 324, 51, textureX, textureY, "lamp"); // Box Glow
		bodyModel[356] = new ModelRendererTurbo(this, 323, 44, textureX, textureY, "lamp"); // Box Glow
		bodyModel[357] = new ModelRendererTurbo(this, 323, 40, textureX, textureY); // Box 2
		bodyModel[358] = new ModelRendererTurbo(this, 312, 38, textureX, textureY); // Box 36
		bodyModel[359] = new ModelRendererTurbo(this, 301, 38, textureX, textureY); // Box 37
		bodyModel[360] = new ModelRendererTurbo(this, 308, 45, textureX, textureY); // Box 36
		bodyModel[361] = new ModelRendererTurbo(this, 301, 45, textureX, textureY); // Box 37
		bodyModel[362] = new ModelRendererTurbo(this, 159, 227, textureX, textureY); // Box 364
		bodyModel[363] = new ModelRendererTurbo(this, 164, 227, textureX, textureY); // Box 365
		bodyModel[364] = new ModelRendererTurbo(this, 159, 225, textureX, textureY); // Box 366
		bodyModel[365] = new ModelRendererTurbo(this, 164, 225, textureX, textureY); // Box 367
		bodyModel[366] = new ModelRendererTurbo(this, 378, 40, textureX, textureY); // Box 4
		bodyModel[367] = new ModelRendererTurbo(this, 396, 35, textureX, textureY); // Box 4
		bodyModel[368] = new ModelRendererTurbo(this, 363, 44, textureX, textureY); // Box 4
		bodyModel[369] = new ModelRendererTurbo(this, 398, 24, textureX, textureY); // Box 448
		bodyModel[370] = new ModelRendererTurbo(this, 383, 27, textureX, textureY); // Box 449
		bodyModel[371] = new ModelRendererTurbo(this, 368, 30, textureX, textureY); // Box 4
		bodyModel[372] = new ModelRendererTurbo(this, 363, 54, textureX, textureY); // Box 372
		bodyModel[373] = new ModelRendererTurbo(this, 362, 64, textureX, textureY); // Box 373
		bodyModel[374] = new ModelRendererTurbo(this, 395, 69, textureX, textureY); // Box 374
		bodyModel[375] = new ModelRendererTurbo(this, 394, 56, textureX, textureY); // Box 375
		bodyModel[376] = new ModelRendererTurbo(this, 377, 54, textureX, textureY); // Box 376
		bodyModel[377] = new ModelRendererTurbo(this, 379, 66, textureX, textureY); // Box 377
		bodyModel[378] = new ModelRendererTurbo(this, 280, 47, textureX, textureY); // Box 78
		bodyModel[379] = new ModelRendererTurbo(this, 280, 47, textureX, textureY); // Box 188
		bodyModel[380] = new ModelRendererTurbo(this, 273, 47, textureX, textureY, BoxName.ditch); // Box 189 lamp ditchlight front up
		bodyModel[381] = new ModelRendererTurbo(this, 273, 47, textureX, textureY, BoxName.ditch); // Box 190 lamp ditchlight front up
		bodyModel[382] = new ModelRendererTurbo(this, 280, 37, textureX, textureY, BoxName.ditch); // Box 182 lamp ditchlight rear up
		bodyModel[383] = new ModelRendererTurbo(this, 273, 37, textureX, textureY); // Box 183
		bodyModel[384] = new ModelRendererTurbo(this, 280, 37, textureX, textureY, BoxName.ditch); // Box 186 lamp ditchlight rear up
		bodyModel[385] = new ModelRendererTurbo(this, 273, 37, textureX, textureY); // Box 187
		bodyModel[386] = new ModelRendererTurbo(this, 280, 42, textureX, textureY); // Box 599
		bodyModel[387] = new ModelRendererTurbo(this, 280, 42, textureX, textureY); // Box 600
		bodyModel[388] = new ModelRendererTurbo(this, 273, 42, textureX, textureY, BoxName.ditch); // Box 601 lamp ditchlight front down
		bodyModel[389] = new ModelRendererTurbo(this, 273, 42, textureX, textureY, BoxName.ditch); // Box 602 lamp ditchlight front down
		bodyModel[390] = new ModelRendererTurbo(this, 273, 52, textureX, textureY); // Box 603
		bodyModel[391] = new ModelRendererTurbo(this, 280, 52, textureX, textureY, BoxName.ditch); // Box 604 lamp ditchlight rear down
		bodyModel[392] = new ModelRendererTurbo(this, 273, 52, textureX, textureY); // Box 605
		bodyModel[393] = new ModelRendererTurbo(this, 280, 52, textureX, textureY, BoxName.ditch); // Box 606 lamp ditchlight rear down
		bodyModel[394] = new ModelRendererTurbo(this, 324, 56, textureX, textureY); // Box 336
		bodyModel[395] = new ModelRendererTurbo(this, 306, 63, textureX, textureY); // Box 337
		bodyModel[396] = new ModelRendererTurbo(this, 306, 60, textureX, textureY); // Box 338
		bodyModel[397] = new ModelRendererTurbo(this, 308, 54, textureX, textureY); // Box 339
		bodyModel[398] = new ModelRendererTurbo(this, 333, 32, textureX, textureY); // Box 405
		bodyModel[399] = new ModelRendererTurbo(this, 308, 57, textureX, textureY); // Box 406
		bodyModel[400] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 407
		bodyModel[401] = new ModelRendererTurbo(this, 329, 56, textureX, textureY); // Box 402
		bodyModel[402] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 403
		bodyModel[403] = new ModelRendererTurbo(this, 329, 83, textureX, textureY); // Box 404
		bodyModel[404] = new ModelRendererTurbo(this, 349, 33, textureX, textureY); // Box 404
		bodyModel[405] = new ModelRendererTurbo(this, 344, 33, textureX, textureY); // Box 405
		bodyModel[406] = new ModelRendererTurbo(this, 349, 36, textureX, textureY); // Box 406
		bodyModel[407] = new ModelRendererTurbo(this, 305, 33, textureX, textureY, "lamp"); // Box 407 lamp headlight retrofit
		bodyModel[408] = new ModelRendererTurbo(this, 312, 33, textureX, textureY, "lamp"); // Box 408 lamp headlight retrofit
		bodyModel[409] = new ModelRendererTurbo(this, 298, 33, textureX, textureY, "lamp"); // Box 409 lamp headlight retrofit
		bodyModel[410] = new ModelRendererTurbo(this, 291, 33, textureX, textureY, "lamp"); // Box 410 lamp headlight retrofit
		bodyModel[411] = new ModelRendererTurbo(this, 389, 7, textureX, textureY); // Box 353
		bodyModel[412] = new ModelRendererTurbo(this, 397, 9, textureX, textureY); // Box 312
		bodyModel[413] = new ModelRendererTurbo(this, 394, 9, textureX, textureY); // Box 313
		bodyModel[414] = new ModelRendererTurbo(this, 389, 9, textureX, textureY, BoxName.commander); // Box 315 glow commander beacon
		bodyModel[415] = new ModelRendererTurbo(this, 389, 4, textureX, textureY); // Box 316
		bodyModel[416] = new ModelRendererTurbo(this, 348, 98, textureX, textureY, "cull"); // Box 215 cull
		bodyModel[417] = new ModelRendererTurbo(this, 363, 94, textureX, textureY); // Box 228
		bodyModel[418] = new ModelRendererTurbo(this, 348, 106, textureX, textureY, "cull"); // Box 231 cull
		bodyModel[419] = new ModelRendererTurbo(this, 349, 96, textureX, textureY); // Box 232
		bodyModel[420] = new ModelRendererTurbo(this, 380, 100, textureX, textureY); // Box 228
		bodyModel[421] = new ModelRendererTurbo(this, 402, 100, textureX, textureY); // Box 229
		bodyModel[422] = new ModelRendererTurbo(this, 393, 100, textureX, textureY); // Box 231
		bodyModel[423] = new ModelRendererTurbo(this, 363, 100, textureX, textureY); // Box 232
		bodyModel[424] = new ModelRendererTurbo(this, 341, 97, textureX, textureY); // Box 428
		bodyModel[425] = new ModelRendererTurbo(this, 320, 15, textureX, textureY); // Box 429
		bodyModel[426] = new ModelRendererTurbo(this, 331, 4, textureX, textureY, BoxName.commander); // Box 430 glow commander
		bodyModel[427] = new ModelRendererTurbo(this, 326, 2, textureX, textureY); // Box 431

		bodyModel[0].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 316
		bodyModel[0].setRotationPoint(-29.99F, -7F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[1].setRotationPoint(-21.55F, -11.5F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[2].setRotationPoint(5.75F, -20.75F, 6.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[3].setRotationPoint(6.75F, -21F, 5.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[4].setRotationPoint(5.25F, -20.75F, 4.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[5].setRotationPoint(7.25F, -20F, 5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[6].setRotationPoint(9F, -22F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[7].setRotationPoint(9F, -23.5F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[8].setRotationPoint(9F, -23.5F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[9].setRotationPoint(9F, -23.5F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[10].setRotationPoint(9F, -23.5F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[11].setRotationPoint(9F, -23F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 199
		bodyModel[12].setRotationPoint(6F, -22F, -2.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 198
		bodyModel[13].setRotationPoint(6F, -22F, 1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[14].setRotationPoint(5.5F, -22.25F, 0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[15].setRotationPoint(5.5F, -22.25F, -1.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195
		bodyModel[16].setRotationPoint(5F, -22.5F, -0.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 182
		bodyModel[17].setRotationPoint(5.5F, -19.5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
		bodyModel[18].setRotationPoint(5F, -20F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[19].setRotationPoint(7F, -21.5F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[20].setRotationPoint(6F, -20F, -0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[21].setRotationPoint(5F, -20F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[22].setRotationPoint(4F, -20F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 270
		bodyModel[23].setRotationPoint(5F, -19F, -0.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 387
		bodyModel[24].setRotationPoint(-9F, -17.5F, -0.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[25].setRotationPoint(-10F, -18F, 0.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[26].setRotationPoint(-9.25F, -18F, -0.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[27].setRotationPoint(-10.75F, -18F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[28].setRotationPoint(-7F, -17F, 0.45F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[29].setRotationPoint(-7F, -18F, -0.550000000000001F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[30].setRotationPoint(-6.75F, -15.5F, -0.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[31].setRotationPoint(-7F, -17F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[32].setRotationPoint(-7F, -16F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[33].setRotationPoint(12F, -22F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[34].setRotationPoint(12F, -22F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[35].setRotationPoint(12F, -22F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[36].setRotationPoint(12F, -22F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[37].setRotationPoint(12F, -21.5F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[38].setRotationPoint(10F, -16F, 10.97F);
		bodyModel[38].rotateAngleX = 0.26179939F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 279
		bodyModel[39].setRotationPoint(10F, -16.25F, -11.97F);
		bodyModel[39].rotateAngleX = -0.26179939F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[40].setRotationPoint(10F, -16.25F, -11.97F);
		bodyModel[40].rotateAngleX = -0.26179939F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[41].setRotationPoint(10F, -16F, 11F);
		bodyModel[41].rotateAngleX = 0.26179939F;

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 269
		bodyModel[42].setRotationPoint(15F, -22.5F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[43].setRotationPoint(13F, -22.5F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[44].setRotationPoint(13F, -21.5F, -0.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[45].setRotationPoint(10F, -15F, 11F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[46].setRotationPoint(10F, -15F, -12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 1100 cull
		bodyModel[47].setRotationPoint(23F, -1F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 glow
		bodyModel[48].setRotationPoint(12F, -19.5F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
		bodyModel[49].setRotationPoint(8.01F, -19F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[50].setRotationPoint(22.01F, -7F, 11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 267
		bodyModel[51].setRotationPoint(25.01F, -7F, 11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[52].setRotationPoint(22.01F, -7F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 265
		bodyModel[53].setRotationPoint(25.01F, -7F, -11F);

		bodyModel[54].addShapeBox(1.5F, 0.5F, 0.1F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 264
		bodyModel[54].setRotationPoint(-19F, -16F, 5F);
		bodyModel[54].rotateAngleY = 1.13446401F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[55].setRotationPoint(7F, -19F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 262
		bodyModel[56].setRotationPoint(7F, -19F, -11F);

		bodyModel[57].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[57].setRotationPoint(7.5F, -19F, 0.5F);

		bodyModel[58].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 260
		bodyModel[58].setRotationPoint(7.5F, -19F, -6.5F);

		bodyModel[59].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[59].setRotationPoint(7.5F, -19F, 0.5F);

		bodyModel[60].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[60].setRotationPoint(7.5F, -19F, -6.5F);

		bodyModel[61].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[61].setRotationPoint(7.5F, -18F, -6.5F);

		bodyModel[62].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[62].setRotationPoint(7.5F, -18F, 7.5F);

		bodyModel[63].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[63].setRotationPoint(7.5F, -18F, -10.5F);

		bodyModel[64].addShapeBox(1.5F, 0F, -1.1F, 1, 1, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 254
		bodyModel[64].setRotationPoint(-19F, -15.5F, -5F);
		bodyModel[64].rotateAngleY = -1.13446401F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 200 lamp headlight rear double
		bodyModel[65].setRotationPoint(20.75F, -20F, -0.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 197 lamp headlight rear double
		bodyModel[66].setRotationPoint(20.75F, -18.5F, -0.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 lamp headlight front double
		bodyModel[67].setRotationPoint(-23.75F, -13F, -0.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 lamp headlight front double
		bodyModel[68].setRotationPoint(-23.75F, -14.5F, -0.75F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 319
		bodyModel[69].setRotationPoint(-4F, -21F, -1F);
		bodyModel[69].rotateAngleX = 0.9250245F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[70].setRotationPoint(30.02F, 5F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[71].setRotationPoint(30.02F, 5F, 6F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 298
		bodyModel[72].setRotationPoint(8F, -10F, -1F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 9, 6, 0F); // Box 297
		bodyModel[73].setRotationPoint(8F, -12F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398
		bodyModel[74].setRotationPoint(17.25F, -10F, 2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 397
		bodyModel[75].setRotationPoint(17.2F, -12F, 0.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[76].setRotationPoint(8F, -4F, 3F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box xxx control stand bits
		bodyModel[77].setRotationPoint(8F, -9.3F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box xxx control stand bits
		bodyModel[78].setRotationPoint(7.5F, -13.5F, 4.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box xxx control stand bits
		bodyModel[79].setRotationPoint(9.5F, -13F, 3.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box xxx control stand bits
		bodyModel[80].setRotationPoint(8F, -12.3F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box xxx control stand bits
		bodyModel[81].setRotationPoint(9F, -11F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box xxx control stand bits
		bodyModel[82].setRotationPoint(10F, -11F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box xxx control stand bits
		bodyModel[83].setRotationPoint(11F, -11F, 4F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 259
		bodyModel[84].setRotationPoint(-29.99F, 8F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 316
		bodyModel[85].setRotationPoint(32F, 6F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 315
		bodyModel[86].setRotationPoint(32F, 6F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[87].setRotationPoint(33F, 7F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 305
		bodyModel[88].setRotationPoint(33F, 7F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[89].setRotationPoint(30F, 2.5F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[90].setRotationPoint(31F, 3F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[91].setRotationPoint(-31F, 2.5F, -2F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[92].setRotationPoint(-34F, 3F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[93].setRotationPoint(-33F, 6F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[94].setRotationPoint(-33F, 6F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[95].setRotationPoint(-34F, 7F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[96].setRotationPoint(-34F, 7F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[97].setRotationPoint(-29.99F, -7F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 264
		bodyModel[98].setRotationPoint(-29.99F, -7F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 263
		bodyModel[99].setRotationPoint(30.01F, 1F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[100].setRotationPoint(30.01F, -7F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 261
		bodyModel[101].setRotationPoint(30.01F, 8F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[102].setRotationPoint(30F, 7F, -2F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 179
		bodyModel[103].setRotationPoint(30.01F, 9F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 cull
		bodyModel[104].setRotationPoint(-32F, 7F, -2F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[105].setRotationPoint(-33F, 9F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[106].setRotationPoint(-4F, -19F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[107].setRotationPoint(-6.5F, -21F, -1.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[108].setRotationPoint(-6F, -22F, -0.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[109].setRotationPoint(-1F, -22F, -0.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[110].setRotationPoint(-4.5F, -19F, -1.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[111].setRotationPoint(-4.5F, -22F, -1.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[112].setRotationPoint(-4.5F, -21F, -1.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[113].setRotationPoint(-4F, -21F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[114].setRotationPoint(0F, -13F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[115].setRotationPoint(0F, -13F, -8F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 256
		bodyModel[116].setRotationPoint(-30.01F, 1F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[117].setRotationPoint(5.01F, 2F, -9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[118].setRotationPoint(5.01F, 2F, 8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[119].setRotationPoint(-5.01F, 2F, 8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[120].setRotationPoint(-5.01F, 2F, -9.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[121].setRotationPoint(-21F, -7F, 11.02F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[122].setRotationPoint(-21F, -7F, -11.02F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		bodyModel[123].setRotationPoint(0F, -11F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 392
		bodyModel[124].setRotationPoint(0F, -11F, -9F);

		bodyModel[125].addBox(0F, 0F, 0F, 20, 0, 1, 0F); // Box 391
		bodyModel[125].setRotationPoint(-20F, -11F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 20, 0, 1, 0F); // Box 390
		bodyModel[126].setRotationPoint(-20F, -11F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[127].setRotationPoint(-5F, 4F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[128].setRotationPoint(-5F, 4F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[129].setRotationPoint(-5F, 3F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183
		bodyModel[130].setRotationPoint(-5F, 4F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 182
		bodyModel[131].setRotationPoint(-5F, 4F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 181
		bodyModel[132].setRotationPoint(-5F, 3F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 202
		bodyModel[133].setRotationPoint(-5F, 7F, -7F);

		bodyModel[134].addBox(0F, 0F, 0F, 10, 4, 14, 0F); // Box 89
		bodyModel[134].setRotationPoint(-5F, 3F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 392
		bodyModel[135].setRotationPoint(14.5F, 2F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 391
		bodyModel[136].setRotationPoint(15.5F, 2F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 390
		bodyModel[137].setRotationPoint(15.5F, 2F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[138].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 388
		bodyModel[139].setRotationPoint(14F, 3F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 134
		bodyModel[140].setRotationPoint(-16.5F, 2F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[141].setRotationPoint(-16.5F, 2F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[142].setRotationPoint(-17.5F, 2F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[143].setRotationPoint(-17.5F, 2F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[144].setRotationPoint(-18F, 3F, -2F);

		bodyModel[145].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 108
		bodyModel[145].setRotationPoint(-26F, 2F, -8F);

		bodyModel[146].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 190
		bodyModel[146].setRotationPoint(22F, -6F, 11.01F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 188
		bodyModel[147].setRotationPoint(22F, -6F, -11.01F);

		bodyModel[148].addBox(0F, 0F, 0F, 29, 8, 0, 0F); // Box 1097
		bodyModel[148].setRotationPoint(-22F, -7F, 11F);

		bodyModel[149].addBox(0F, 0F, 0F, 29, 8, 0, 0F); // Box 1096
		bodyModel[149].setRotationPoint(-22F, -7F, -11.01F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[150].setRotationPoint(-23F, -7F, 11.02F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[151].setRotationPoint(-23F, -7F, -11.02F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[152].setRotationPoint(-27F, -7F, 11.02F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 373
		bodyModel[153].setRotationPoint(-27F, -7F, 11.01F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[154].setRotationPoint(-27F, -7F, -11.02F);

		bodyModel[155].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 371
		bodyModel[155].setRotationPoint(-27F, -7F, -11.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[156].setRotationPoint(-30.02F, 5F, 6F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 394
		bodyModel[157].setRotationPoint(-30F, 2F, 6F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 393
		bodyModel[158].setRotationPoint(-30F, 4F, 5.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 392
		bodyModel[159].setRotationPoint(-30F, 4F, 7.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 391
		bodyModel[160].setRotationPoint(-30F, 6F, 7F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 390
		bodyModel[161].setRotationPoint(-30F, 8F, 9F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 389
		bodyModel[162].setRotationPoint(-30F, 6F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[163].setRotationPoint(-26F, 2F, 5F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 1
		bodyModel[164].setRotationPoint(-30F, 1F, -6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[165].setRotationPoint(26F, 2F, 5F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 355
		bodyModel[166].setRotationPoint(26F, 8F, 9F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 354
		bodyModel[167].setRotationPoint(26F, 6F, 9F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 353
		bodyModel[168].setRotationPoint(26F, 6F, 7F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 352
		bodyModel[169].setRotationPoint(26F, 4F, 7.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 351
		bodyModel[170].setRotationPoint(26F, 2F, 6F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 350
		bodyModel[171].setRotationPoint(26F, 4F, 5.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 184
		bodyModel[172].setRotationPoint(26F, 1F, -6F);

		bodyModel[173].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 344
		bodyModel[173].setRotationPoint(26F, 4F, -7.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 349
		bodyModel[174].setRotationPoint(26F, 8F, -11F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 348
		bodyModel[175].setRotationPoint(26F, 6F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 347
		bodyModel[176].setRotationPoint(26F, 2F, -6F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 346
		bodyModel[177].setRotationPoint(26F, 4F, -7.5F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 345
		bodyModel[178].setRotationPoint(26F, 6F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[179].setRotationPoint(26F, 2F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 273
		bodyModel[180].setRotationPoint(-30.02F, 5F, -9F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 342
		bodyModel[181].setRotationPoint(-30F, 8F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 341
		bodyModel[182].setRotationPoint(-30F, 6F, -9F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 340
		bodyModel[183].setRotationPoint(-30F, 6F, -9F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 339
		bodyModel[184].setRotationPoint(-30F, 4F, -7.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 338
		bodyModel[185].setRotationPoint(-30F, 4F, -7.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 337
		bodyModel[186].setRotationPoint(-30F, 2F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[187].setRotationPoint(-26F, 2F, -11F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 232
		bodyModel[188].setRotationPoint(19F, -12F, -3F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 231
		bodyModel[189].setRotationPoint(19F, -12F, 3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[190].setRotationPoint(23F, -12F, 3F);
		bodyModel[190].rotateAngleY = -3.14159265F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[191].setRotationPoint(23F, -12F, -3F);
		bodyModel[191].rotateAngleY = -3.14159265F;

		bodyModel[192].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 68
		bodyModel[192].setRotationPoint(22F, -6F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 67
		bodyModel[193].setRotationPoint(22F, -6F, -3F);

		bodyModel[194].addBox(-2.5F, 2F, 0F, 5, 1, 0, 0F); // Box 628
		bodyModel[194].setRotationPoint(-19F, -16F, 5F);
		bodyModel[194].rotateAngleY = 1.13446401F;

		bodyModel[195].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[195].setRotationPoint(-19F, -16F, 5F);
		bodyModel[195].rotateAngleY = 1.13446401F;

		bodyModel[196].addShapeBox(-2.5F, 0F, 0.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[196].setRotationPoint(-19F, -16F, 5F);
		bodyModel[196].rotateAngleY = 1.13446401F;

		bodyModel[197].addShapeBox(-2.5F, 0F, -1.1F, 4, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[197].setRotationPoint(-19F, -16F, -5F);
		bodyModel[197].rotateAngleY = -1.13446401F;

		bodyModel[198].addBox(-2.5F, 2F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[198].setRotationPoint(-19F, -16F, -5F);
		bodyModel[198].rotateAngleY = -1.13446401F;

		bodyModel[199].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[199].setRotationPoint(-19F, -16F, -5F);
		bodyModel[199].rotateAngleY = -1.13446401F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[200].setRotationPoint(-24F, -14.5F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387
		bodyModel[201].setRotationPoint(-23F, -14F, 1F);

		bodyModel[202].addBox(0.1F, 0F, 0F, 2, 1, 0, 0F); // Box 386 numberboard front 2beam
		bodyModel[202].setRotationPoint(-23F, -13.5F, 1F);
		bodyModel[202].rotateAngleY = 0.4712389F;

		bodyModel[203].addBox(0.1F, 0F, 0F, 2, 1, 0, 0F); // Box 385 numberboard front 2beam
		bodyModel[203].setRotationPoint(-23F, -13.5F, -1F);
		bodyModel[203].rotateAngleY = -0.4712389F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[204].setRotationPoint(-23F, -14F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[205].setRotationPoint(-23F, -14.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[206].setRotationPoint(-22F, -14.5F, -1.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[207].setRotationPoint(-23.25F, -14.25F, -1.25F);

		bodyModel[208].addBox(0.1F, 0F, 0F, 2, 1, 0, 0F); // Box 168 numberboard front single
		bodyModel[208].setRotationPoint(-23F, -13.5F, 1.5F);
		bodyModel[208].rotateAngleY = 0.4712389F;

		bodyModel[209].addBox(0.1F, 0F, 0F, 2, 1, 0, 0F); // Box 167 numberboard front single
		bodyModel[209].setRotationPoint(-23F, -13.5F, -1.5F);
		bodyModel[209].rotateAngleY = -0.4712389F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[210].setRotationPoint(-23F, -14F, 1.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[211].setRotationPoint(-23F, -14F, -2.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[212].setRotationPoint(-23F, -14.5F, -1.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[213].setRotationPoint(21F, -20F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387
		bodyModel[214].setRotationPoint(19F, -19.5F, 1F);

		bodyModel[215].addBox(-2.1F, 0F, 0F, 2, 1, 0, 0F); // Box 386 numberboard front 2beam
		bodyModel[215].setRotationPoint(21F, -19F, 1F);
		bodyModel[215].rotateAngleY = -0.4712389F;

		bodyModel[216].addBox(-2.1F, 0F, 0F, 2, 1, 0, 0F); // Box 385 numberboard front 2beam
		bodyModel[216].setRotationPoint(21F, -19F, -1F);
		bodyModel[216].rotateAngleY = 0.4712389F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[217].setRotationPoint(19F, -19.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383
		bodyModel[218].setRotationPoint(19F, -20F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[219].setRotationPoint(19F, -20F, -1.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[220].setRotationPoint(20.25F, -19.75F, -1.25F);

		bodyModel[221].addBox(-2.1F, 0F, 0F, 2, 1, 0, 0F); // Box 168 numberboard front single
		bodyModel[221].setRotationPoint(21F, -19F, 1.5F);
		bodyModel[221].rotateAngleY = -0.4712389F;

		bodyModel[222].addBox(-2.1F, 0F, 0F, 2, 1, 0, 0F); // Box 167 numberboard front single
		bodyModel[222].setRotationPoint(21F, -19F, -1.5F);
		bodyModel[222].rotateAngleY = 0.4712389F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 173
		bodyModel[223].setRotationPoint(19F, -19.5F, 1.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[224].setRotationPoint(19F, -19.5F, -2.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[225].setRotationPoint(19F, -20F, -1.5F);

		bodyModel[226].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 1074
		bodyModel[226].setRotationPoint(6F, -17F, -13F);

		bodyModel[227].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 1073
		bodyModel[227].setRotationPoint(6F, -19F, -9F);

		bodyModel[228].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 1072
		bodyModel[228].setRotationPoint(6F, -20.5F, -4F);

		bodyModel[229].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,-0.5F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 1071
		bodyModel[229].setRotationPoint(6F, -17F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1070
		bodyModel[230].setRotationPoint(6F, -19F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 1069
		bodyModel[231].setRotationPoint(19F, -17F, -13F);

		bodyModel[232].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 1068
		bodyModel[232].setRotationPoint(19F, -19F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 2F, 1, 0, 4, 0F,0F, 2F, 0F, -0.5F, 2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 1067
		bodyModel[233].setRotationPoint(19F, -17F, 5F);

		bodyModel[234].addBox(0F, 0F, 2F, 1, 0, 4, 0F); // Box 1065
		bodyModel[234].setRotationPoint(19F, -20.5F, -4F);

		bodyModel[235].addShapeBox(0F, 0F, 2F, 1, 0, 5, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1063
		bodyModel[235].setRotationPoint(19F, -19F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 196
		bodyModel[236].setRotationPoint(5F, -12F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[237].setRotationPoint(-25F, -3F, -8F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 5, 16, 0F); // Box 234
		bodyModel[238].setRotationPoint(-24F, -4F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 7, 12, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[239].setRotationPoint(0F, -11F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F); // Box 397
		bodyModel[240].setRotationPoint(0F, -13F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, -0.7F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[241].setRotationPoint(0F, -13F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 14, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -14F, 0F, -7F, -14F); // Box 138
		bodyModel[242].setRotationPoint(-21.5F, -11.25F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 21, 1, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[243].setRotationPoint(-21F, -14F, 0F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 21, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[244].setRotationPoint(-21F, -14F, -8F);

		bodyModel[245].addBox(0F, 0F, 0F, 21, 14, 16, 0F); // Box 5
		bodyModel[245].setRotationPoint(-21F, -13F, -8F);

		bodyModel[246].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 396
		bodyModel[246].setRotationPoint(18F, -20F, -4F);

		bodyModel[247].addBox(0F, 0F, 2F, 1, 1, 4, 0F); // Box 395
		bodyModel[247].setRotationPoint(7F, -20F, -4F);

		bodyModel[248].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[248].setRotationPoint(7F, -21F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[249].setRotationPoint(18F, -21F, 0F);

		bodyModel[250].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[250].setRotationPoint(18F, -21F, -9F);

		bodyModel[251].addShapeBox(0F, 0F, 2F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[251].setRotationPoint(7F, -21F, -9F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 412
		bodyModel[252].setRotationPoint(18F, -19F, -7F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[253].setRotationPoint(7F, -19F, -7F);

		bodyModel[254].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 348
		bodyModel[254].setRotationPoint(8F, -21F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 2F, 12, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[255].setRotationPoint(7F, -21F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 2F, 10, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[256].setRotationPoint(8F, -21F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 374
		bodyModel[257].setRotationPoint(8F, -19F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[258].setRotationPoint(18F, -19F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[259].setRotationPoint(18F, -19F, 7F);

		bodyModel[260].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[260].setRotationPoint(7.5F, -16F, -10.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 15
		bodyModel[261].setRotationPoint(7F, -16F, -7F);

		bodyModel[262].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 10
		bodyModel[262].setRotationPoint(8F, -16F, -11F);

		bodyModel[263].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 9
		bodyModel[263].setRotationPoint(8F, -16F, 10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[264].setRotationPoint(8F, -19F, -11F);

		bodyModel[265].addShapeBox(-0.5F, 0F, 0F, 1, 13, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 61 door swign right
		bodyModel[265].setRotationPoint(18.5F, -16F, -2F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 71
		bodyModel[266].setRotationPoint(18F, -16F, 2F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 13, 9, 0F); // Box 9
		bodyModel[267].setRotationPoint(18F, -16F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 201
		bodyModel[268].setRotationPoint(-4F, -16F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 200
		bodyModel[269].setRotationPoint(-4F, -15F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194 stacc
		bodyModel[270].setRotationPoint(-4F, -22F, 0F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193 stacc
		bodyModel[271].setRotationPoint(-4F, -22F, -1F);

		bodyModel[272].addBox(0F, 0F, 0F, 52, 1, 0, 0F); // Box 192
		bodyModel[272].setRotationPoint(-26F, 2F, -11F);

		bodyModel[273].addBox(0F, 0F, 0F, 52, 1, 0, 0F); // Box 191 skirt
		bodyModel[273].setRotationPoint(-26F, 2F, 11F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[274].setRotationPoint(-9F, -19F, -1.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 173
		bodyModel[275].setRotationPoint(-9F, -15.5F, 1.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 172
		bodyModel[276].setRotationPoint(-9F, -15.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // Box 171
		bodyModel[277].setRotationPoint(-9F, -18F, -1.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 159
		bodyModel[278].setRotationPoint(25F, 3F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 158
		bodyModel[279].setRotationPoint(23F, 4F, -11F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 157
		bodyModel[280].setRotationPoint(23F, 3F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 156
		bodyModel[281].setRotationPoint(22F, 3F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
		bodyModel[282].setRotationPoint(22F, 3F, 11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 154
		bodyModel[283].setRotationPoint(23F, 4F, 11F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 153
		bodyModel[284].setRotationPoint(25F, 3F, 11F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 152
		bodyModel[285].setRotationPoint(23F, 3F, 11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[286].setRotationPoint(-23F, 3F, 11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[287].setRotationPoint(-25F, 4F, 11F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
		bodyModel[288].setRotationPoint(-26F, 3F, 11F);

		bodyModel[289].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
		bodyModel[289].setRotationPoint(-25F, 3F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 183
		bodyModel[290].setRotationPoint(30.01F, -7F, -11F);

		bodyModel[291].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 182
		bodyModel[291].setRotationPoint(30.01F, -6F, 10F);

		bodyModel[292].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[292].setRotationPoint(30.01F, -6F, -11F);

		bodyModel[293].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 177
		bodyModel[293].setRotationPoint(30.01F, 7F, -11F);

		bodyModel[294].addBox(0F, 0F, 0F, 0, 8, 19, 0F); // Box 176
		bodyModel[294].setRotationPoint(30.01F, -7F, -9.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 174
		bodyModel[295].setRotationPoint(-30.01F, 7F, -11F);

		bodyModel[296].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 169
		bodyModel[296].setRotationPoint(-30.01F, -6F, 10F);

		bodyModel[297].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 168
		bodyModel[297].setRotationPoint(-30.01F, -6F, -11F);

		bodyModel[298].addBox(0F, 0F, 0F, 0, 8, 19, 0F); // Box 166
		bodyModel[298].setRotationPoint(-30.01F, -7F, -9.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[299].setRotationPoint(-23F, 3F, -11F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 153
		bodyModel[300].setRotationPoint(-25F, 3F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[301].setRotationPoint(-25F, 4F, -11F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 151
		bodyModel[302].setRotationPoint(-26F, 3F, -11F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[303].setRotationPoint(-20F, -14.5F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[304].setRotationPoint(-20F, -18.5F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[305].setRotationPoint(-20F, -18F, 1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[306].setRotationPoint(-20F, -18F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[307].setRotationPoint(-20F, -15F, -2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[308].setRotationPoint(-19.75F, -16.5F, -0.25F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[309].setRotationPoint(-20F, -18F, -0.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[310].setRotationPoint(-20F, -17F, -0.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[311].setRotationPoint(5F, -1F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 33
		bodyModel[312].setRotationPoint(-4F, -21F, -1F);

		bodyModel[313].addBox(0F, 0F, 0F, 16, 4, 22, 0F); // Box 18
		bodyModel[313].setRotationPoint(7F, -3F, -11F);

		bodyModel[314].addBox(0F, 0F, 0F, 52, 1, 22, 0F); // Box 0
		bodyModel[314].setRotationPoint(-26F, 1F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 317
		bodyModel[315].setRotationPoint(-29.99F, -1F, -11F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 318
		bodyModel[316].setRotationPoint(-29.99F, -7F, 5.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[317].setRotationPoint(-29.99F, -1F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 320
		bodyModel[318].setRotationPoint(30F, -1F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[319].setRotationPoint(30F, -1F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 322
		bodyModel[320].setRotationPoint(30F, -7F, 5.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 323
		bodyModel[321].setRotationPoint(29.99F, -7F, -8.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[322].setRotationPoint(-26F, -7F, 11.02F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[323].setRotationPoint(-26F, -7F, -11.02F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F); // Box 326
		bodyModel[324].setRotationPoint(-4F, -21.5F, -1F);

		bodyModel[325].addBox(0F, 0F, 0F, 0, 1, 12, 0F); // Box 115
		bodyModel[325].setRotationPoint(-30F, -7F, -6F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[326].setRotationPoint(-30F, -7F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 117
		bodyModel[327].setRotationPoint(-30F, -7F, 6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[328].setRotationPoint(-30F, -1F, -5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[329].setRotationPoint(-30F, -1F, 1F);

		bodyModel[330].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 122
		bodyModel[330].setRotationPoint(-30F, -6F, -5F);

		bodyModel[331].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 123
		bodyModel[331].setRotationPoint(-30F, -6F, 4F);

		bodyModel[332].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 124
		bodyModel[332].setRotationPoint(-30F, -1F, -1F);

		bodyModel[333].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 335
		bodyModel[333].setRotationPoint(30F, -1F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 336
		bodyModel[334].setRotationPoint(30F, -1F, 1F);

		bodyModel[335].addBox(0F, 0F, 0F, 0, 1, 12, 0F); // Box 337
		bodyModel[335].setRotationPoint(30F, -7F, -6F);

		bodyModel[336].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 338
		bodyModel[336].setRotationPoint(30F, -6F, 4F);

		bodyModel[337].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 339
		bodyModel[337].setRotationPoint(30F, -6F, -5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[338].setRotationPoint(30F, -1F, -5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[339].setRotationPoint(30F, -7F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 342
		bodyModel[340].setRotationPoint(30F, -7F, 6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[341].setRotationPoint(-4.5F, -21.5F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 lamp headlight retrofit
		bodyModel[342].setRotationPoint(-23.25F, -14.5F, -0.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 lamp headlight retrofit
		bodyModel[343].setRotationPoint(-23.25F, -13F, -0.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 346
		bodyModel[344].setRotationPoint(20.25F, -20F, -0.75F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 347
		bodyModel[345].setRotationPoint(20.25F, -18.5F, -0.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[346].setRotationPoint(-23.5F, -13.5F, 6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[347].setRotationPoint(-23.85F, -13F, 6.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box Glow
		bodyModel[348].setRotationPoint(-23F, -13F, 5.65F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box Glow
		bodyModel[349].setRotationPoint(-23F, -13F, 7.35F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[350].setRotationPoint(-22.15F, -13F, 6.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[351].setRotationPoint(-23F, -11.75F, 6.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[352].setRotationPoint(-23.5F, -13.5F, -8F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[353].setRotationPoint(-23.85F, -13F, -7.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box Glow
		bodyModel[354].setRotationPoint(-23F, -13F, -8.35F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box Glow
		bodyModel[355].setRotationPoint(-23F, -13F, -6.65F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[356].setRotationPoint(-22.15F, -13F, -7.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[357].setRotationPoint(-23F, -11.75F, -7.5F);

		bodyModel[358].addShapeBox(0F, 0F, -4F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 36
		bodyModel[358].setRotationPoint(-22F, -16F, -6F);
		bodyModel[358].rotateAngleY = 0.78539816F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[359].setRotationPoint(-22F, -16F, 6F);
		bodyModel[359].rotateAngleY = -0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[360].setRotationPoint(-20.3F, -16F, -7.95F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
		bodyModel[361].setRotationPoint(-20.3F, -16F, 5.95F);

		bodyModel[362].addShapeBox(-0.5F, 0F, -0.5F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[362].setRotationPoint(7.49F, -17F, -10.5F);

		bodyModel[363].addShapeBox(-0.5F, 0F, -0.5F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[363].setRotationPoint(7.49F, -18F, -8.5F);

		bodyModel[364].addShapeBox(-0.5F, 0F, -0.5F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[364].setRotationPoint(8.51F, -17F, 9.5F);

		bodyModel[365].addShapeBox(-0.5F, 0F, -0.5F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[365].setRotationPoint(8.51F, -18F, 7.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[366].setRotationPoint(-33F, 6F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[367].setRotationPoint(-33F, 6F, -10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, -1F, 2F, 0F); // Box 4
		bodyModel[368].setRotationPoint(-33.5F, 3F, -10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[369].setRotationPoint(-33F, 4F, 2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -0.5F, -2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[370].setRotationPoint(-33F, 4F, -10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, -2F, 0F, -3F, -2F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[371].setRotationPoint(-33F, 3F, 2F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -1.5F, 2F, 0F, -1F, 2F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F); // Box 372
		bodyModel[372].setRotationPoint(30.5F, 3F, 2F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 2F, 0F, -2F, 2F, 0F); // Box 373
		bodyModel[373].setRotationPoint(30F, 3F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 374
		bodyModel[374].setRotationPoint(30F, 4F, -10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[375].setRotationPoint(30F, 6F, 0F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 376
		bodyModel[376].setRotationPoint(30F, 6F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, -2F, 0F, -0.5F, -2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[377].setRotationPoint(30F, 4F, 2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[378].setRotationPoint(-30F, -1F, 4.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[379].setRotationPoint(-30F, -1F, -6.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp ditchlight front up
		bodyModel[380].setRotationPoint(-30.25F, -1F, 4.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp ditchlight front up
		bodyModel[381].setRotationPoint(-30.25F, -1F, -6.75F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 lamp ditchlight rear up
		bodyModel[382].setRotationPoint(29.25F, -1F, -6.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[383].setRotationPoint(29F, -1F, -6.75F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 lamp ditchlight rear up
		bodyModel[384].setRotationPoint(29.25F, -1F, 4.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[385].setRotationPoint(29F, -1F, 4.75F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[386].setRotationPoint(-30.5F, 1F, -5.75F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[387].setRotationPoint(-30.5F, 1F, 3.75F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 601 lamp ditchlight front down
		bodyModel[388].setRotationPoint(-30.75F, 1F, -5.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 602 lamp ditchlight front down
		bodyModel[389].setRotationPoint(-30.75F, 1F, 3.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[390].setRotationPoint(29.5F, 1F, -5.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 604 lamp ditchlight rear down
		bodyModel[391].setRotationPoint(29.75F, 1F, -5.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 605
		bodyModel[392].setRotationPoint(29.5F, 1F, 3.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 606 lamp ditchlight rear down
		bodyModel[393].setRotationPoint(29.75F, 1F, 3.75F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[394].setRotationPoint(-11F, -15F, -6.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[395].setRotationPoint(-10F, -14.75F, -7.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[396].setRotationPoint(-10.5F, -14.75F, -5.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[397].setRotationPoint(-9F, -14F, -6.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 405
		bodyModel[398].setRotationPoint(6F, -20.25F, -1.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 406
		bodyModel[399].setRotationPoint(5F, -19.75F, -0.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[400].setRotationPoint(9F, -15F, -15F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 402
		bodyModel[401].setRotationPoint(9F, -16.5F, -15F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 403
		bodyModel[402].setRotationPoint(9F, -15F, 10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F); // Box 404
		bodyModel[403].setRotationPoint(9F, -16.5F, 10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 404
		bodyModel[404].setRotationPoint(-8F, -16F, -0.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[405].setRotationPoint(-7F, -16F, -0.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 406
		bodyModel[406].setRotationPoint(-9F, -16F, -0.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 407 lamp headlight retrofit
		bodyModel[407].setRotationPoint(-23.25F, -13.75F, 0.02F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 408 lamp headlight retrofit
		bodyModel[408].setRotationPoint(-23.25F, -13.75F, -1.53F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F); // Box 409 lamp headlight retrofit
		bodyModel[409].setRotationPoint(20.25F, -19.25F, -2.02F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F); // Box 410 lamp headlight retrofit
		bodyModel[410].setRotationPoint(20.25F, -19.25F, -0.47F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[411].setRotationPoint(11.5F, -21.5F, 0F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 312
		bodyModel[412].setRotationPoint(12.5F, -23.5F, -0.5F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 313
		bodyModel[413].setRotationPoint(12.5F, -23.5F, 0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow commander beacon
		bodyModel[414].setRotationPoint(12.53F, -25.5F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[415].setRotationPoint(12.68F, -24.5F, -0.5F);

		bodyModel[416].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 215 cull
		bodyModel[416].setRotationPoint(-9F, -18F, -1.5F);

		bodyModel[417].addBox(-26F, 0F, -0.5F, 28, 1, 0, 0F); // Box 228
		bodyModel[417].setRotationPoint(-9F, -19F, 0F);
		bodyModel[417].rotateAngleZ = -0.06981317F;

		bodyModel[418].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 231 cull
		bodyModel[418].setRotationPoint(12F, -21.5F, -2F);

		bodyModel[419].addBox(0F, -0.5F, 0F, 23, 1, 0, 0F); // Box 232
		bodyModel[419].setRotationPoint(13F, -22.5F, 0F);
		bodyModel[419].rotateAngleZ = 0.01745329F;

		bodyModel[420].addBox(17F, -0.5F, -0.5F, 5, 1, 1, 0F); // Box 228
		bodyModel[420].setRotationPoint(13F, -22.5F, 0F);
		bodyModel[420].rotateAngleZ = 0.01745329F;

		bodyModel[421].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 229
		bodyModel[421].setRotationPoint(12.5F, -22.5F, -0.5F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 231
		bodyModel[422].setRotationPoint(-8.5F, -19F, -0.5F);

		bodyModel[423].addBox(-27F, 0F, 0F, 7, 1, 1, 0F); // Box 232
		bodyModel[423].setRotationPoint(-7F, -19F, -1F);
		bodyModel[423].rotateAngleZ = -0.06981317F;

		bodyModel[424].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[424].setRotationPoint(-18F, -20F, -1.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 429
		bodyModel[425].setRotationPoint(8F, -22.5F, 0F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 430 glow commander
		bodyModel[426].setRotationPoint(7F, -22.5F, -0.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 431
		bodyModel[427].setRotationPoint(7F, -21.5F, -0.5F);
	}
	ModelTypeAClassico theTrucks2 = new ModelTypeAClassico();
	ModelTypeAnew theSussyBogisNewWawawawEdition = new ModelTypeAnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 436) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 788) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeA_SP.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 18 || GetColor(entity) == 19 || GetColor(entity) == 6 || GetColor(entity) == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,-0.035F,0F);
			theSussyBogisNewWawawawEdition.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theSussyBogisNewWawawawEdition.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {// the classic type a is textures/trains/typeA_Black_2.png
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,-0.035F,0F);
			theSussyBogisNewWawawawEdition.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theSussyBogisNewWawawawEdition.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}