//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MP900
// Model Creator: cubed64
// Created on: 30.07.2023 - 19:39:59
// Last changed on: 30.07.2023 - 19:39:59

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

public class ModelMP900 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMP900() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[302];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 343, 131, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 491, 233, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 491, 233, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 491, 239, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 491, 239, textureX, textureY); // Box 146
		bodyModel[5] = new ModelRendererTurbo(this, 258, 174, textureX, textureY); // Box 246
		bodyModel[6] = new ModelRendererTurbo(this, 326, 107, textureX, textureY); // Box 197
		bodyModel[7] = new ModelRendererTurbo(this, 315, 186, textureX, textureY); // Box 226
		bodyModel[8] = new ModelRendererTurbo(this, 313, 182, textureX, textureY); // Box 227
		bodyModel[9] = new ModelRendererTurbo(this, 343, 125, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 481, 187, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 500, 224, textureX, textureY); // Box 46
		bodyModel[12] = new ModelRendererTurbo(this, 482, 214, textureX, textureY); // Box 47
		bodyModel[13] = new ModelRendererTurbo(this, 471, 214, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 472, 211, textureX, textureY); // Box 49
		bodyModel[15] = new ModelRendererTurbo(this, 494, 213, textureX, textureY); // Box 50
		bodyModel[16] = new ModelRendererTurbo(this, 256, 180, textureX, textureY); // Box 56
		bodyModel[17] = new ModelRendererTurbo(this, 258, 184, textureX, textureY); // Box 57
		bodyModel[18] = new ModelRendererTurbo(this, 466, 171, textureX, textureY); // Box 241
		bodyModel[19] = new ModelRendererTurbo(this, 482, 217, textureX, textureY); // Box 242
		bodyModel[20] = new ModelRendererTurbo(this, 471, 217, textureX, textureY); // Box 243
		bodyModel[21] = new ModelRendererTurbo(this, 483, 211, textureX, textureY); // Box 244
		bodyModel[22] = new ModelRendererTurbo(this, 484, 209, textureX, textureY); // Box 245
		bodyModel[23] = new ModelRendererTurbo(this, 500, 230, textureX, textureY); // Box 246
		bodyModel[24] = new ModelRendererTurbo(this, 492, 187, textureX, textureY); // Box 247
		bodyModel[25] = new ModelRendererTurbo(this, 477, 171, textureX, textureY); // Box 248
		bodyModel[26] = new ModelRendererTurbo(this, 494, 215, textureX, textureY); // Box 249
		bodyModel[27] = new ModelRendererTurbo(this, 481, 200, textureX, textureY); // Box 250
		bodyModel[28] = new ModelRendererTurbo(this, 494, 219, textureX, textureY); // Box 254
		bodyModel[29] = new ModelRendererTurbo(this, 472, 220, textureX, textureY); // Box 255
		bodyModel[30] = new ModelRendererTurbo(this, 483, 223, textureX, textureY); // Box 206
		bodyModel[31] = new ModelRendererTurbo(this, 495, 205, textureX, textureY); // Box 207
		bodyModel[32] = new ModelRendererTurbo(this, 495, 207, textureX, textureY); // Box 208
		bodyModel[33] = new ModelRendererTurbo(this, 495, 209, textureX, textureY); // Box 209
		bodyModel[34] = new ModelRendererTurbo(this, 495, 211, textureX, textureY); // Box 210
		bodyModel[35] = new ModelRendererTurbo(this, 483, 157, textureX, textureY); // Box 367
		bodyModel[36] = new ModelRendererTurbo(this, 483, 151, textureX, textureY); // Box 368
		bodyModel[37] = new ModelRendererTurbo(this, 318, 82, textureX, textureY); // Box 462
		bodyModel[38] = new ModelRendererTurbo(this, 482, 227, textureX, textureY); // Box 422
		bodyModel[39] = new ModelRendererTurbo(this, 474, 223, textureX, textureY); // Box 423
		bodyModel[40] = new ModelRendererTurbo(this, 494, 221, textureX, textureY); // Box 424
		bodyModel[41] = new ModelRendererTurbo(this, 494, 217, textureX, textureY); // Box 425
		bodyModel[42] = new ModelRendererTurbo(this, 483, 220, textureX, textureY); // Box 426
		bodyModel[43] = new ModelRendererTurbo(this, 473, 227, textureX, textureY); // Box 427
		bodyModel[44] = new ModelRendererTurbo(this, 481, 195, textureX, textureY); // Box 428
		bodyModel[45] = new ModelRendererTurbo(this, 281, 181, textureX, textureY); // Box 202
		bodyModel[46] = new ModelRendererTurbo(this, 284, 183, textureX, textureY); // Box 204
		bodyModel[47] = new ModelRendererTurbo(this, 284, 186, textureX, textureY); // Box 301
		bodyModel[48] = new ModelRendererTurbo(this, 318, 82, textureX, textureY); // Box 362
		bodyModel[49] = new ModelRendererTurbo(this, 488, 247, textureX, textureY); // Box 287
		bodyModel[50] = new ModelRendererTurbo(this, 488, 247, textureX, textureY); // Box 288
		bodyModel[51] = new ModelRendererTurbo(this, 51, 126, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[52] = new ModelRendererTurbo(this, 52, 121, textureX, textureY, BoxName.ditch); // Box 256 ditchlight front 1
		bodyModel[53] = new ModelRendererTurbo(this, 51, 126, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[54] = new ModelRendererTurbo(this, 52, 121, textureX, textureY, BoxName.ditch); // Box 256 ditchlight front 1
		bodyModel[55] = new ModelRendererTurbo(this, 42, 126, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[56] = new ModelRendererTurbo(this, 43, 121, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear 1
		bodyModel[57] = new ModelRendererTurbo(this, 42, 126, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[58] = new ModelRendererTurbo(this, 43, 121, textureX, textureY, BoxName.ditch); // Box 256 ditchlight rear 1
		bodyModel[59] = new ModelRendererTurbo(this, 30, 36, textureX, textureY); // Box 282
		bodyModel[60] = new ModelRendererTurbo(this, 43, 33, textureX, textureY); // Box 283
		bodyModel[61] = new ModelRendererTurbo(this, 115, 92, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[62] = new ModelRendererTurbo(this, 124, 94, textureX, textureY); // Box 307
		bodyModel[63] = new ModelRendererTurbo(this, 92, 111, textureX, textureY); // Box 413
		bodyModel[64] = new ModelRendererTurbo(this, 87, 158, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 107, 109, textureX, textureY); // Box 304
		bodyModel[66] = new ModelRendererTurbo(this, 114, 99, textureX, textureY); // Box 307
		bodyModel[67] = new ModelRendererTurbo(this, 120, 106, textureX, textureY); // Box 308
		bodyModel[68] = new ModelRendererTurbo(this, 368, 158, textureX, textureY); // Box 3
		bodyModel[69] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[70] = new ModelRendererTurbo(this, 23, 119, textureX, textureY); // Box 303
		bodyModel[71] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[72] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[73] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[74] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[75] = new ModelRendererTurbo(this, 37, 132, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 41, 134, textureX, textureY); // Box 144
		bodyModel[77] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[78] = new ModelRendererTurbo(this, 23, 132, textureX, textureY); // Box 147
		bodyModel[79] = new ModelRendererTurbo(this, 19, 134, textureX, textureY); // Box 148
		bodyModel[80] = new ModelRendererTurbo(this, 42, 133, textureX, textureY); // Box 363
		bodyModel[81] = new ModelRendererTurbo(this, 20, 133, textureX, textureY); // Box 870
		bodyModel[82] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[83] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[84] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[85] = new ModelRendererTurbo(this, 375, 167, textureX, textureY); // Box 80
		bodyModel[86] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 81
		bodyModel[87] = new ModelRendererTurbo(this, 380, 161, textureX, textureY); // Box 234
		bodyModel[88] = new ModelRendererTurbo(this, 375, 165, textureX, textureY); // Box 236
		bodyModel[89] = new ModelRendererTurbo(this, 397, 165, textureX, textureY); // Box 206
		bodyModel[90] = new ModelRendererTurbo(this, 402, 166, textureX, textureY); // Box 871
		bodyModel[91] = new ModelRendererTurbo(this, 372, 166, textureX, textureY); // Box 872
		bodyModel[92] = new ModelRendererTurbo(this, 404, 168, textureX, textureY); // Box 560
		bodyModel[93] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 561
		bodyModel[94] = new ModelRendererTurbo(this, 268, 86, textureX, textureY, "cull"); // Box 243 cull
		bodyModel[95] = new ModelRendererTurbo(this, 370, 160, textureX, textureY); // Box 542
		bodyModel[96] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 543
		bodyModel[97] = new ModelRendererTurbo(this, 222, 86, textureX, textureY); // Box 38R
		bodyModel[98] = new ModelRendererTurbo(this, 218, 77, textureX, textureY); // Box 316
		bodyModel[99] = new ModelRendererTurbo(this, 1, 187, textureX, textureY); // Box 240
		bodyModel[100] = new ModelRendererTurbo(this, 8, 167, textureX, textureY); // Box 279
		bodyModel[101] = new ModelRendererTurbo(this, 254, 113, textureX, textureY); // Box 350
		bodyModel[102] = new ModelRendererTurbo(this, 254, 141, textureX, textureY); // Box 351
		bodyModel[103] = new ModelRendererTurbo(this, 86, 167, textureX, textureY); // Box 352
		bodyModel[104] = new ModelRendererTurbo(this, 111, 150, textureX, textureY); // Box 355
		bodyModel[105] = new ModelRendererTurbo(this, 150, 164, textureX, textureY); // Box 315 door swing right
		bodyModel[106] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 252, 125, textureX, textureY); // Box 135
		bodyModel[108] = new ModelRendererTurbo(this, 252, 117, textureX, textureY); // Box 57
		bodyModel[109] = new ModelRendererTurbo(this, 281, 115, textureX, textureY); // Box 282
		bodyModel[110] = new ModelRendererTurbo(this, 285, 131, textureX, textureY); // Box 284
		bodyModel[111] = new ModelRendererTurbo(this, 294, 133, textureX, textureY); // Box 285
		bodyModel[112] = new ModelRendererTurbo(this, 290, 117, textureX, textureY); // Box 286
		bodyModel[113] = new ModelRendererTurbo(this, 232, 141, textureX, textureY); // Box 370
		bodyModel[114] = new ModelRendererTurbo(this, 166, 164, textureX, textureY); // Box 440
		bodyModel[115] = new ModelRendererTurbo(this, 144, 167, textureX, textureY); // Box 441
		bodyModel[116] = new ModelRendererTurbo(this, 254, 146, textureX, textureY); // Box 443
		bodyModel[117] = new ModelRendererTurbo(this, 44, 54, textureX, textureY); // Box 293
		bodyModel[118] = new ModelRendererTurbo(this, 51, 84, textureX, textureY); // Box 359
		bodyModel[119] = new ModelRendererTurbo(this, 51, 93, textureX, textureY); // Box 360
		bodyModel[120] = new ModelRendererTurbo(this, 149, 60, textureX, textureY); // Box 447
		bodyModel[121] = new ModelRendererTurbo(this, 149, 69, textureX, textureY); // Box 448
		bodyModel[122] = new ModelRendererTurbo(this, 142, 78, textureX, textureY); // Box 449
		bodyModel[123] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 331 lamp front 2 beam sp
		bodyModel[124] = new ModelRendererTurbo(this, 102, 141, textureX, textureY, "lamp"); // Box 332 lamp front 2 beam sp
		bodyModel[125] = new ModelRendererTurbo(this, 117, 135, textureX, textureY); // Box 299
		bodyModel[126] = new ModelRendererTurbo(this, 78, 139, textureX, textureY); // Box 347
		bodyModel[127] = new ModelRendererTurbo(this, 87, 134, textureX, textureY); // Box 349
		bodyModel[128] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 355
		bodyModel[129] = new ModelRendererTurbo(this, 126, 137, textureX, textureY); // Box 356
		bodyModel[130] = new ModelRendererTurbo(this, 98, 141, textureX, textureY); // Box 310 sp light cover
		bodyModel[131] = new ModelRendererTurbo(this, 126, 136, textureX, textureY); // Box 414
		bodyModel[132] = new ModelRendererTurbo(this, 110, 134, textureX, textureY); // Box 415
		bodyModel[133] = new ModelRendererTurbo(this, 85, 152, textureX, textureY, "lamp"); // Box 333 lamp front gyro sp
		bodyModel[134] = new ModelRendererTurbo(this, 78, 152, textureX, textureY, "lamp"); // Box 334 lamp front gyro sp
		bodyModel[135] = new ModelRendererTurbo(this, 88, 134, textureX, textureY); // Box 299
		bodyModel[136] = new ModelRendererTurbo(this, 108, 135, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[137] = new ModelRendererTurbo(this, 98, 135, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[138] = new ModelRendererTurbo(this, 135, 134, textureX, textureY); // Box 308 sp light cover
		bodyModel[139] = new ModelRendererTurbo(this, 148, 134, textureX, textureY); // Box 309 sp light cover
		bodyModel[140] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 331 lamp rear 2 beam sp
		bodyModel[141] = new ModelRendererTurbo(this, 194, 156, textureX, textureY, "lamp"); // Box 332 lamp rear 2 beam sp
		bodyModel[142] = new ModelRendererTurbo(this, 179, 149, textureX, textureY); // Box 349
		bodyModel[143] = new ModelRendererTurbo(this, 201, 157, textureX, textureY); // Box 417
		bodyModel[144] = new ModelRendererTurbo(this, 202, 149, textureX, textureY); // Box 418
		bodyModel[145] = new ModelRendererTurbo(this, 164, 148, textureX, textureY); // Box 419
		bodyModel[146] = new ModelRendererTurbo(this, 211, 143, textureX, textureY); // Box 420
		bodyModel[147] = new ModelRendererTurbo(this, 220, 145, textureX, textureY); // Box 421
		bodyModel[148] = new ModelRendererTurbo(this, 154, 146, textureX, textureY); // Box 422
		bodyModel[149] = new ModelRendererTurbo(this, 180, 156, textureX, textureY, "lamp"); // Box 333 lamp rear gyro sp
		bodyModel[150] = new ModelRendererTurbo(this, 173, 157, textureX, textureY, "lamp"); // Box 334 lamp rear gyro sp
		bodyModel[151] = new ModelRendererTurbo(this, 190, 150, textureX, textureY, "lamp"); // Box 300 glow marker
		bodyModel[152] = new ModelRendererTurbo(this, 200, 150, textureX, textureY, "lamp"); // Box 348 glow marker
		bodyModel[153] = new ModelRendererTurbo(this, 180, 149, textureX, textureY); // Box 416
		bodyModel[154] = new ModelRendererTurbo(this, 161, 134, textureX, textureY); // Box 423
		bodyModel[155] = new ModelRendererTurbo(this, 174, 134, textureX, textureY); // Box 424
		bodyModel[156] = new ModelRendererTurbo(this, 242, 107, textureX, textureY); // Box 283
		bodyModel[157] = new ModelRendererTurbo(this, 234, 107, textureX, textureY); // Box 284
		bodyModel[158] = new ModelRendererTurbo(this, 242, 102, textureX, textureY); // Box 390
		bodyModel[159] = new ModelRendererTurbo(this, 237, 102, textureX, textureY); // Box 486
		bodyModel[160] = new ModelRendererTurbo(this, 230, 102, textureX, textureY); // Box 487
		bodyModel[161] = new ModelRendererTurbo(this, 225, 102, textureX, textureY); // Box 488
		bodyModel[162] = new ModelRendererTurbo(this, 229, 107, textureX, textureY); // Box 489
		bodyModel[163] = new ModelRendererTurbo(this, 239, 107, textureX, textureY); // Box 490
		bodyModel[164] = new ModelRendererTurbo(this, 245, 97, textureX, textureY); // Box 306
		bodyModel[165] = new ModelRendererTurbo(this, 238, 97, textureX, textureY); // Box 307
		bodyModel[166] = new ModelRendererTurbo(this, 235, 97, textureX, textureY); // Box 868
		bodyModel[167] = new ModelRendererTurbo(this, 235, 95, textureX, textureY); // Box 494
		bodyModel[168] = new ModelRendererTurbo(this, 238, 95, textureX, textureY); // Box 495
		bodyModel[169] = new ModelRendererTurbo(this, 245, 95, textureX, textureY); // Box 496
		bodyModel[170] = new ModelRendererTurbo(this, 224, 59, textureX, textureY); // Box 497
		bodyModel[171] = new ModelRendererTurbo(this, 261, 86, textureX, textureY, "cull"); // Box 498 cull
		bodyModel[172] = new ModelRendererTurbo(this, 269, 61, textureX, textureY, "cull"); // Box 499 cull
		bodyModel[173] = new ModelRendererTurbo(this, 219, 68, textureX, textureY); // Box 501
		bodyModel[174] = new ModelRendererTurbo(this, 264, 61, textureX, textureY, "cull"); // Box 502 cull
		bodyModel[175] = new ModelRendererTurbo(this, 370, 160, textureX, textureY); // Box 503
		bodyModel[176] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 504
		bodyModel[177] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 583
		bodyModel[178] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 582
		bodyModel[179] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 581
		bodyModel[180] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 580
		bodyModel[181] = new ModelRendererTurbo(this, 454, 14, textureX, textureY); // Box 579
		bodyModel[182] = new ModelRendererTurbo(this, 451, 15, textureX, textureY); // Box 578
		bodyModel[183] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 253
		bodyModel[184] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 252
		bodyModel[185] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 251
		bodyModel[186] = new ModelRendererTurbo(this, 451, 10, textureX, textureY); // Box 250
		bodyModel[187] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 249 roof air tank
		bodyModel[188] = new ModelRendererTurbo(this, 454, 9, textureX, textureY); // Box 246 roof air tank
		bodyModel[189] = new ModelRendererTurbo(this, 16, 102, textureX, textureY); // Box 33
		bodyModel[190] = new ModelRendererTurbo(this, 7, 102, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 281, 61, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 277, 84, textureX, textureY); // Box 10
		bodyModel[193] = new ModelRendererTurbo(this, 318, 65, textureX, textureY); // Box 157
		bodyModel[194] = new ModelRendererTurbo(this, 318, 72, textureX, textureY); // Box 548
		bodyModel[195] = new ModelRendererTurbo(this, 318, 60, textureX, textureY); // Box 382
		bodyModel[196] = new ModelRendererTurbo(this, 318, 60, textureX, textureY); // Box 383
		bodyModel[197] = new ModelRendererTurbo(this, 209, 133, textureX, textureY); // Box 188
		bodyModel[198] = new ModelRendererTurbo(this, 237, 132, textureX, textureY); // Box 189
		bodyModel[199] = new ModelRendererTurbo(this, 222, 132, textureX, textureY); // Box 190
		bodyModel[200] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 193 numberboard glow
		bodyModel[201] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 194 numberboard glow
		bodyModel[202] = new ModelRendererTurbo(this, 237, 132, textureX, textureY); // Box 556
		bodyModel[203] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 557
		bodyModel[204] = new ModelRendererTurbo(this, 209, 133, textureX, textureY); // Box 558
		bodyModel[205] = new ModelRendererTurbo(this, 222, 132, textureX, textureY); // Box 559
		bodyModel[206] = new ModelRendererTurbo(this, 236, 141, textureX, textureY, "lamp"); // Box 560
		bodyModel[207] = new ModelRendererTurbo(this, 294, 125, textureX, textureY); // Box 356
		bodyModel[208] = new ModelRendererTurbo(this, 291, 125, textureX, textureY); // Box 358
		bodyModel[209] = new ModelRendererTurbo(this, 288, 125, textureX, textureY); // Box 359
		bodyModel[210] = new ModelRendererTurbo(this, 301, 126, textureX, textureY); // Box 360
		bodyModel[211] = new ModelRendererTurbo(this, 301, 129, textureX, textureY); // Box 294
		bodyModel[212] = new ModelRendererTurbo(this, 294, 125, textureX, textureY); // Box 566
		bodyModel[213] = new ModelRendererTurbo(this, 291, 125, textureX, textureY); // Box 567
		bodyModel[214] = new ModelRendererTurbo(this, 288, 125, textureX, textureY); // Box 568
		bodyModel[215] = new ModelRendererTurbo(this, 301, 126, textureX, textureY); // Box 569
		bodyModel[216] = new ModelRendererTurbo(this, 301, 129, textureX, textureY); // Box 570
		bodyModel[217] = new ModelRendererTurbo(this, 308, 19, textureX, textureY); // Box 571
		bodyModel[218] = new ModelRendererTurbo(this, 401, 27, textureX, textureY); // Box 572
		bodyModel[219] = new ModelRendererTurbo(this, 293, 17, textureX, textureY); // Box 575
		bodyModel[220] = new ModelRendererTurbo(this, 4, 41, textureX, textureY); // Box 24
		bodyModel[221] = new ModelRendererTurbo(this, 17, 39, textureX, textureY); // Box 25
		bodyModel[222] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 580
		bodyModel[223] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 581
		bodyModel[224] = new ModelRendererTurbo(this, 4, 28, textureX, textureY); // Box 582
		bodyModel[225] = new ModelRendererTurbo(this, 43, 21, textureX, textureY); // Box 583
		bodyModel[226] = new ModelRendererTurbo(this, 238, 99, textureX, textureY); // Box 310 nasa cap
		bodyModel[227] = new ModelRendererTurbo(this, 233, 99, textureX, textureY); // Box 311 nasa cap
		bodyModel[228] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 403
		bodyModel[229] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 404
		bodyModel[230] = new ModelRendererTurbo(this, 196, 15, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[231] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 361
		bodyModel[232] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 362
		bodyModel[233] = new ModelRendererTurbo(this, 204, 37, textureX, textureY); // Box 363
		bodyModel[234] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 364
		bodyModel[235] = new ModelRendererTurbo(this, 149, 34, textureX, textureY); // Box 448
		bodyModel[236] = new ModelRendererTurbo(this, 149, 32, textureX, textureY); // Box 415
		bodyModel[237] = new ModelRendererTurbo(this, 108, 161, textureX, textureY); // Box 122
		bodyModel[238] = new ModelRendererTurbo(this, 108, 157, textureX, textureY); // Box 123
		bodyModel[239] = new ModelRendererTurbo(this, 67, 17, textureX, textureY); // Box 364 prime base
		bodyModel[240] = new ModelRendererTurbo(this, 67, 13, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[241] = new ModelRendererTurbo(this, 67, 13, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[242] = new ModelRendererTurbo(this, 67, 13, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[243] = new ModelRendererTurbo(this, 67, 13, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[244] = new ModelRendererTurbo(this, 76, 16, textureX, textureY, "cull"); // Box 431 cull support
		bodyModel[245] = new ModelRendererTurbo(this, 144, 38, textureX, textureY); // Box 566
		bodyModel[246] = new ModelRendererTurbo(this, 144, 35, textureX, textureY); // Box 565
		bodyModel[247] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 564
		bodyModel[248] = new ModelRendererTurbo(this, 149, 36, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[249] = new ModelRendererTurbo(this, 163, 143, textureX, textureY); // Box 425
		bodyModel[250] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[251] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 256
		bodyModel[252] = new ModelRendererTurbo(this, 55, 185, textureX, textureY); // Box 297
		bodyModel[253] = new ModelRendererTurbo(this, 72, 189, textureX, textureY); // Box 298
		bodyModel[254] = new ModelRendererTurbo(this, 220, 33, textureX, textureY); // Box 894
		bodyModel[255] = new ModelRendererTurbo(this, 229, 33, textureX, textureY); // Box 895
		bodyModel[256] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 259
		bodyModel[257] = new ModelRendererTurbo(this, 220, 30, textureX, textureY); // Box 260
		bodyModel[258] = new ModelRendererTurbo(this, 293, 9, textureX, textureY); // Box 261
		bodyModel[259] = new ModelRendererTurbo(this, 225, 5, textureX, textureY, "cull"); // Box 262
		bodyModel[260] = new ModelRendererTurbo(this, 252, 12, textureX, textureY, "cull"); // Box 263
		bodyModel[261] = new ModelRendererTurbo(this, 293, 1, textureX, textureY); // Box 264
		bodyModel[262] = new ModelRendererTurbo(this, 293, 25, textureX, textureY); // Box 265
		bodyModel[263] = new ModelRendererTurbo(this, 158, 38, textureX, textureY); // Box 279
		bodyModel[264] = new ModelRendererTurbo(this, 161, 34, textureX, textureY); // Box 409 commander base
		bodyModel[265] = new ModelRendererTurbo(this, 161, 37, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[266] = new ModelRendererTurbo(this, 498, 134, textureX, textureY); // Box 397 hb
		bodyModel[267] = new ModelRendererTurbo(this, 501, 145, textureX, textureY); // Box 398 hb
		bodyModel[268] = new ModelRendererTurbo(this, 387, 23, textureX, textureY); // Box 354
		bodyModel[269] = new ModelRendererTurbo(this, 371, 29, textureX, textureY); // Box 355
		bodyModel[270] = new ModelRendererTurbo(this, 385, 29, textureX, textureY); // Box 356
		bodyModel[271] = new ModelRendererTurbo(this, 387, 35, textureX, textureY); // Box 357
		bodyModel[272] = new ModelRendererTurbo(this, 389, 32, textureX, textureY); // Box 358
		bodyModel[273] = new ModelRendererTurbo(this, 389, 26, textureX, textureY); // Box 359
		bodyModel[274] = new ModelRendererTurbo(this, 401, 40, textureX, textureY); // Box 271
		bodyModel[275] = new ModelRendererTurbo(this, 378, 32, textureX, textureY); // Box 81
		bodyModel[276] = new ModelRendererTurbo(this, 378, 23, textureX, textureY); // Box 82
		bodyModel[277] = new ModelRendererTurbo(this, 376, 29, textureX, textureY); // Box 83
		bodyModel[278] = new ModelRendererTurbo(this, 376, 26, textureX, textureY); // Box 84
		bodyModel[279] = new ModelRendererTurbo(this, 211, 24, textureX, textureY); // Box 279
		bodyModel[280] = new ModelRendererTurbo(this, 50, 1, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[281] = new ModelRendererTurbo(this, 34, 16, textureX, textureY); // Box 363
		bodyModel[282] = new ModelRendererTurbo(this, 35, 12, textureX, textureY, BoxName.commander); // Box 364 glow commander beacon
		bodyModel[283] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "cull"); // Box 366 cull
		bodyModel[284] = new ModelRendererTurbo(this, 27, 16, textureX, textureY); // Box 367
		bodyModel[285] = new ModelRendererTurbo(this, 28, 12, textureX, textureY, BoxName.commander); // Box 368 glow commander beacon
		bodyModel[286] = new ModelRendererTurbo(this, 152, 27, textureX, textureY); // Box 522
		bodyModel[287] = new ModelRendererTurbo(this, 161, 24, textureX, textureY); // Box 523
		bodyModel[288] = new ModelRendererTurbo(this, 152, 24, textureX, textureY); // Box 524
		bodyModel[289] = new ModelRendererTurbo(this, 152, 21, textureX, textureY); // Box 525
		bodyModel[290] = new ModelRendererTurbo(this, 153, 2, textureX, textureY); // Box 290 wrx firepump
		bodyModel[291] = new ModelRendererTurbo(this, 153, 10, textureX, textureY, "cull"); // Box 291 cull
		bodyModel[292] = new ModelRendererTurbo(this, 134, 7, textureX, textureY); // Box 130 wrx water tank
		bodyModel[293] = new ModelRendererTurbo(this, 135, 14, textureX, textureY); // Box 131 wrx water tank
		bodyModel[294] = new ModelRendererTurbo(this, 135, 3, textureX, textureY); // Box 132 wrx water tank
		bodyModel[295] = new ModelRendererTurbo(this, 116, 11, textureX, textureY, "cull"); // Box 295 cull
		bodyModel[296] = new ModelRendererTurbo(this, 150, 10, textureX, textureY); // Box 296 wrx bit
		bodyModel[297] = new ModelRendererTurbo(this, 150, 10, textureX, textureY); // Box 297 wrx bit
		bodyModel[298] = new ModelRendererTurbo(this, 150, 2, textureX, textureY); // Box 298 wrx bit
		bodyModel[299] = new ModelRendererTurbo(this, 173, 2, textureX, textureY); // Box 299 wrx firehose
		bodyModel[300] = new ModelRendererTurbo(this, 170, 33, textureX, textureY); // Box 438 amador central FPE
		bodyModel[301] = new ModelRendererTurbo(this, 171, 30, textureX, textureY); // Box 301 FPE

		bodyModel[0].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[2].setRotationPoint(34.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-32.5F, 2.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[4].setRotationPoint(33.5F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 246
		bodyModel[5].setRotationPoint(-31.51F, 0F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 65, 3, 14, 0F); // Box 197
		bodyModel[6].setRotationPoint(-31.5F, 0F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[7].setRotationPoint(-31.51F, 8F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[8].setRotationPoint(-31.51F, 7F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 58, 1, 4, 0F); // Box 40
		bodyModel[9].setRotationPoint(-28.5F, 0F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[10].setRotationPoint(29.5F, 1F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[11].setRotationPoint(29.5F, 0F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 47
		bodyModel[12].setRotationPoint(29.5F, 5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
		bodyModel[13].setRotationPoint(29.5F, 8F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[14].setRotationPoint(30.5F, 3F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[15].setRotationPoint(30.5F, 1F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 56
		bodyModel[16].setRotationPoint(33.51F, 7F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[17].setRotationPoint(33.51F, 8F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 241
		bodyModel[18].setRotationPoint(29.5F, 3F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 242
		bodyModel[19].setRotationPoint(29.5F, 5F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[20].setRotationPoint(29.5F, 8F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 244
		bodyModel[21].setRotationPoint(30.5F, 3F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 245
		bodyModel[22].setRotationPoint(30.5F, 1F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[23].setRotationPoint(29.5F, 0F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[24].setRotationPoint(29.5F, 1F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[25].setRotationPoint(29.5F, 3F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[26].setRotationPoint(-31.5F, 2.5F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 250
		bodyModel[27].setRotationPoint(-31.5F, 0F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 254
		bodyModel[28].setRotationPoint(-31.5F, 5.5F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 255
		bodyModel[29].setRotationPoint(-31.5F, 8F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 206
		bodyModel[30].setRotationPoint(-31.5F, 1.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 207
		bodyModel[31].setRotationPoint(30.5F, 7F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 208
		bodyModel[32].setRotationPoint(30.5F, 4F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 209
		bodyModel[33].setRotationPoint(30.5F, 4F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 210
		bodyModel[34].setRotationPoint(30.5F, 7F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 367
		bodyModel[35].setRotationPoint(-19F, 3F, -2F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 368
		bodyModel[36].setRotationPoint(17F, 3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[37].setRotationPoint(-18F, 1F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 422
		bodyModel[38].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 423
		bodyModel[39].setRotationPoint(-31.5F, 1.5F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 424
		bodyModel[40].setRotationPoint(-31.5F, 2.5F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 425
		bodyModel[41].setRotationPoint(-31.5F, 5.5F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 426
		bodyModel[42].setRotationPoint(-31.5F, 8F, 9F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 427
		bodyModel[43].setRotationPoint(-28.5F, 1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 428
		bodyModel[44].setRotationPoint(-31.5F, 0F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[45].setRotationPoint(33.5F, 0F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[46].setRotationPoint(33.5F, 0F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[47].setRotationPoint(33.5F, 0F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[48].setRotationPoint(18F, 1F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 287
		bodyModel[49].setRotationPoint(29.5F, 2.5F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 288
		bodyModel[50].setRotationPoint(-31.5F, 2.5F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255 cull
		bodyModel[51].setRotationPoint(-33F, -0.1F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight front 1
		bodyModel[52].setRotationPoint(-33.25F, -0.1F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255 cull
		bodyModel[53].setRotationPoint(-33F, -0.1F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight front 1
		bodyModel[54].setRotationPoint(-33.25F, -0.1F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255 cull
		bodyModel[55].setRotationPoint(33F, -0.1F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight rear 1
		bodyModel[56].setRotationPoint(34.75F, -0.1F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255 cull
		bodyModel[57].setRotationPoint(33F, -0.1F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 256 ditchlight rear 1
		bodyModel[58].setRotationPoint(34.75F, -0.1F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[59].setRotationPoint(-35.5F, 7F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[60].setRotationPoint(-35.5F, 7F, -10F);

		bodyModel[61].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[61].setRotationPoint(-3F, -16.25F, 3F);
		bodyModel[61].rotateAngleY = 0.95993109F;

		bodyModel[62].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[62].setRotationPoint(-3F, -16.25F, 3F);
		bodyModel[62].rotateAngleY = 0.95993109F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 413
		bodyModel[63].setRotationPoint(-5.5F, -12F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[64].setRotationPoint(-5.5F, -14F, 2F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 304
		bodyModel[65].setRotationPoint(-1.5F, -14F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 307
		bodyModel[66].setRotationPoint(-5.5F, -8F, 2F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 8, 4, 0F); // Box 308
		bodyModel[67].setRotationPoint(-0.5F, -12F, -2F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[68].setRotationPoint(33.51F, 0F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[69].setRotationPoint(-32.5F, 0F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[70].setRotationPoint(-32.5F, 0F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[71].setRotationPoint(-32.5F, 0F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[72].setRotationPoint(-31.5F, -8F, -8F);
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[73].setRotationPoint(-31.5F, -1F, 10F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[74].setRotationPoint(-31.5F, -1F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-31.5F, -8F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 144
		bodyModel[76].setRotationPoint(-31.5F, -8F, -8F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[77].setRotationPoint(-32.5F, -8F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[78].setRotationPoint(-31.5F, -8F, 4F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 148
		bodyModel[79].setRotationPoint(-31.5F, -8F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[80].setRotationPoint(-31.51F, -7F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[81].setRotationPoint(-31.51F, -7F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[82].setRotationPoint(-31.5F, -8F, 9F);
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[83].setRotationPoint(33.5F, -1F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[84].setRotationPoint(33.5F, -1F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 80
		bodyModel[85].setRotationPoint(33.5F, -8F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 8, 2, 0F); // Box 81
		bodyModel[86].setRotationPoint(33.5F, -8F, 6F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[87].setRotationPoint(34.5F, -8F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[88].setRotationPoint(33.5F, -8F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[89].setRotationPoint(33.5F, -8F, 4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[90].setRotationPoint(33.51F, -7F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 872
		bodyModel[91].setRotationPoint(33.51F, -7F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[92].setRotationPoint(33.5F, -8F, 9F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[93].setRotationPoint(33.5F, -8F, -8F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243 cull
		bodyModel[94].setRotationPoint(29.5F, -8F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[95].setRotationPoint(30F, -3F, -11.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[96].setRotationPoint(30F, -3F, 10.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 38R
		bodyModel[97].setRotationPoint(10.5F, -8F, 11F);

		bodyModel[98].addBox(0F, 0F, 0F, 23, 8, 0, 0F); // Box 316
		bodyModel[98].setRotationPoint(6.5F, -8F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 240
		bodyModel[99].setRotationPoint(-6.5F, -4F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 279
		bodyModel[100].setRotationPoint(-5.5F, -19F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[101].setRotationPoint(-6.5F, -20F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[102].setRotationPoint(-6.5F, -20F, 9F);

		bodyModel[103].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 352
		bodyModel[103].setRotationPoint(-5.5F, -19F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 355
		bodyModel[104].setRotationPoint(-6.5F, -19F, -7F);

		bodyModel[105].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
		bodyModel[105].setRotationPoint(-6F, -19F, -10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[106].setRotationPoint(-5.5F, -21.5F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[107].setRotationPoint(-6.5F, -21F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[108].setRotationPoint(-5.5F, -21.5F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 282
		bodyModel[109].setRotationPoint(-6.5F, -21.5F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
		bodyModel[110].setRotationPoint(-6.5F, -21.5F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
		bodyModel[111].setRotationPoint(5.5F, -21.5F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 286
		bodyModel[112].setRotationPoint(5.5F, -21.5F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 370
		bodyModel[113].setRotationPoint(5.5F, -20F, -9F);

		bodyModel[114].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 440
		bodyModel[114].setRotationPoint(6F, -19F, 7.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 441
		bodyModel[115].setRotationPoint(5.5F, -19F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 443
		bodyModel[116].setRotationPoint(-6.5F, -20F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 20, 15, 14, 0F); // Box 293
		bodyModel[117].setRotationPoint(-26.5F, -15F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[118].setRotationPoint(-26.5F, -16F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[119].setRotationPoint(-26.5F, -16F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 22, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[120].setRotationPoint(6.5F, -16F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 22, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[121].setRotationPoint(6.5F, -16F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 22, 15, 14, 0F); // Box 449
		bodyModel[122].setRotationPoint(6.5F, -15F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331 lamp front 2 beam sp
		bodyModel[123].setRotationPoint(-28.75F, -15.15F, -5.45F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 lamp front 2 beam sp
		bodyModel[124].setRotationPoint(-28.75F, -15.15F, -3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -0.9F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -0.1F, -0.5F); // Box 299
		bodyModel[125].setRotationPoint(-28.5F, -16F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[126].setRotationPoint(-27.5F, -16F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[127].setRotationPoint(-27.5F, -15F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 355
		bodyModel[128].setRotationPoint(-27.5F, -16F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.9F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[129].setRotationPoint(-28.5F, -16F, -6F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 0, 11, 0F); // Box 310 sp light cover
		bodyModel[130].setRotationPoint(-28.5F, -13F, -5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.5F, 1F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 414
		bodyModel[131].setRotationPoint(-27.5F, -15F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.38F, 0F, 0F, 0.38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[132].setRotationPoint(-28.5F, -15F, -5.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 333 lamp front gyro sp
		bodyModel[133].setRotationPoint(-29F, -15.15F, 1.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 334 lamp front gyro sp
		bodyModel[134].setRotationPoint(-29F, -15.15F, 3.45F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F); // Box 299
		bodyModel[135].setRotationPoint(-28.5F, -15.15F, 1.5F);

		bodyModel[136].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 300 glow marker
		bodyModel[136].setRotationPoint(-27.75F, -14.5F, -6F);
		bodyModel[136].rotateAngleY = 0.59341195F;

		bodyModel[137].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 348 glow marker
		bodyModel[137].setRotationPoint(-27.75F, -14.5F, 6F);
		bodyModel[137].rotateAngleY = -0.59341195F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 308 sp light cover
		bodyModel[138].setRotationPoint(-28.49F, -15F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309 sp light cover
		bodyModel[139].setRotationPoint(-28.49F, -15F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 331 lamp rear 2 beam sp
		bodyModel[140].setRotationPoint(29.75F, -15.15F, 1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 332 lamp rear 2 beam sp
		bodyModel[141].setRotationPoint(29.75F, -15.15F, 3.45F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 349
		bodyModel[142].setRotationPoint(28.5F, -15F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.1F, 0.5F, 1F, 0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[143].setRotationPoint(28.5F, -15F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0.38F, 0F, 0F, 0.38F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[144].setRotationPoint(28.5F, -15F, 1.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[145].setRotationPoint(28.5F, -16F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, 0F, 1F); // Box 420
		bodyModel[146].setRotationPoint(29.5F, -16F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 1F, 0F, -0.9F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -0.1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 421
		bodyModel[147].setRotationPoint(29.5F, -16F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 422
		bodyModel[148].setRotationPoint(28.5F, -16F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 333 lamp rear gyro sp
		bodyModel[149].setRotationPoint(30F, -15.15F, -5.45F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 lamp rear gyro sp
		bodyModel[150].setRotationPoint(30F, -15.15F, -3.5F);

		bodyModel[151].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F); // Box 300 glow marker
		bodyModel[151].setRotationPoint(29.75F, -14.5F, -6F);
		bodyModel[151].rotateAngleY = -0.59341195F;

		bodyModel[152].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F); // Box 348 glow marker
		bodyModel[152].setRotationPoint(29.75F, -14.5F, 6F);
		bodyModel[152].rotateAngleY = 0.59341195F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0.375F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 416
		bodyModel[153].setRotationPoint(28.5F, -15.15F, -5.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[154].setRotationPoint(30.49F, -15F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 424
		bodyModel[155].setRotationPoint(30.49F, -15F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[156].setRotationPoint(-9.5F, -4F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 284
		bodyModel[157].setRotationPoint(-8.5F, -4F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 390
		bodyModel[158].setRotationPoint(-9.5F, -2F, -11F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 486
		bodyModel[159].setRotationPoint(-8.5F, -4F, -11F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 487
		bodyModel[160].setRotationPoint(6.5F, -2F, 7F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 488
		bodyModel[161].setRotationPoint(6.5F, -4F, 7F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 489
		bodyModel[162].setRotationPoint(6.5F, -4F, 11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[163].setRotationPoint(8.5F, -4F, 11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[164].setRotationPoint(6F, -12F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 307
		bodyModel[165].setRotationPoint(7F, -12F, 11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[166].setRotationPoint(10F, -8F, 11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[167].setRotationPoint(-11.5F, -8F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F); // Box 495
		bodyModel[168].setRotationPoint(-10.5F, -12F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 496
		bodyModel[169].setRotationPoint(-7.5F, -12F, -11F);

		bodyModel[170].addBox(0F, 0F, 0F, 17, 8, 0, 0F); // Box 497
		bodyModel[170].setRotationPoint(-28.5F, -8F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 498 cull
		bodyModel[171].setRotationPoint(29.5F, -8F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499 cull
		bodyModel[172].setRotationPoint(-28.51F, -8F, -11F);

		bodyModel[173].addBox(0F, 0F, 0F, 22, 8, 0, 0F); // Box 501
		bodyModel[173].setRotationPoint(-28.5F, -8F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502 cull
		bodyModel[174].setRotationPoint(-28.51F, -8F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 503
		bodyModel[175].setRotationPoint(-28.51F, -3F, -11.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 504
		bodyModel[176].setRotationPoint(-28.51F, -3F, 10.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 583
		bodyModel[177].setRotationPoint(15.01F, -17F, 2.25F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 582
		bodyModel[178].setRotationPoint(6.99F, -17F, 2.25F);

		bodyModel[179].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 581
		bodyModel[179].setRotationPoint(7F, -17.5F, 1.75F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 580
		bodyModel[180].setRotationPoint(15.01F, -17F, -3.25F);

		bodyModel[181].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 579
		bodyModel[181].setRotationPoint(7F, -17.5F, -3.75F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 578
		bodyModel[182].setRotationPoint(6.99F, -17F, -3.25F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 253
		bodyModel[183].setRotationPoint(15.01F, -17F, -5.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 252
		bodyModel[184].setRotationPoint(15.01F, -17F, 4.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 251
		bodyModel[185].setRotationPoint(6.99F, -17F, 4.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 250
		bodyModel[186].setRotationPoint(6.99F, -17F, -5.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 249 roof air tank
		bodyModel[187].setRotationPoint(7F, -17.5F, 4F);

		bodyModel[188].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 246 roof air tank
		bodyModel[188].setRotationPoint(7F, -17.5F, -6F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 33
		bodyModel[189].setRotationPoint(15.5F, -21F, -1F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 128
		bodyModel[190].setRotationPoint(-17F, -21F, -1F);

		bodyModel[191].addBox(0F, 0F, 0F, 9, 4, 18, 0F); // Box 2
		bodyModel[191].setRotationPoint(-4F, 4.5F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[192].setRotationPoint(-4F, 1.5F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[193].setRotationPoint(-4F, 4.5F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 548
		bodyModel[194].setRotationPoint(-4F, 4.5F, 9F);

		bodyModel[195].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[195].setRotationPoint(0F, 1F, -11.25F);
		bodyModel[195].rotateAngleX = 1.22173048F;

		bodyModel[196].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[196].setRotationPoint(0F, 1F, 11.25F);
		bodyModel[196].rotateAngleX = -1.22173048F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[197].setRotationPoint(-8.5F, -21F, -2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-1.25F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[198].setRotationPoint(-8.5F, -21F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1.25F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 190
		bodyModel[199].setRotationPoint(-8.5F, -21F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F); // Box 193 numberboard glow
		bodyModel[200].setRotationPoint(-8F, -21.05F, -6.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F); // Box 194 numberboard glow
		bodyModel[201].setRotationPoint(-8F, -21.05F, 2.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, -1.25F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[202].setRotationPoint(6.5F, -21F, 2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 557
		bodyModel[203].setRotationPoint(7F, -21.05F, 2.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[204].setRotationPoint(6.5F, -21F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0.125F, 0F, -1.25F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[205].setRotationPoint(6.5F, -21F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 560
		bodyModel[206].setRotationPoint(7F, -21.05F, -6.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 356
		bodyModel[207].setRotationPoint(-7.5F, -21.5F, -9F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 358
		bodyModel[208].setRotationPoint(-7.5F, -21F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Box 359
		bodyModel[209].setRotationPoint(-7.5F, -21.5F, 3F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 360
		bodyModel[210].setRotationPoint(-7.5F, -20F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 294
		bodyModel[211].setRotationPoint(-7.5F, -20F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 566
		bodyModel[212].setRotationPoint(6.5F, -21.5F, 3F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 567
		bodyModel[213].setRotationPoint(6.5F, -21F, -3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 568
		bodyModel[214].setRotationPoint(6.5F, -21.5F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[215].setRotationPoint(6.5F, -20F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 570
		bodyModel[216].setRotationPoint(6.5F, -20F, 9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 13, 2, 26, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -13F, 0F, 0F, -13F, 0F, -1F, 0F, -6.5F, -1F, 0F, -6.5F, -1F, -13F, 0F, -1F, -13F); // Box 571
		bodyModel[217].setRotationPoint(-26F, -15.55F, -6.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 13, 2, 26, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -13F, 0F, 0F, -13F, 0F, -1F, 0F, -6.5F, -1F, 0F, -6.5F, -1F, -13F, 0F, -1F, -13F); // Box 572
		bodyModel[218].setRotationPoint(21.5F, -15.55F, -6.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 575
		bodyModel[219].setRotationPoint(-25.5F, -7F, -7.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[220].setRotationPoint(-34.5F, 6F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[221].setRotationPoint(-34.5F, 6F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 580
		bodyModel[222].setRotationPoint(36.5F, 7F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 581
		bodyModel[223].setRotationPoint(35.5F, 6F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 582
		bodyModel[224].setRotationPoint(36.5F, 7F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 583
		bodyModel[225].setRotationPoint(35.5F, 6F, 0F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[226].setRotationPoint(16.25F, -22.5F, -1F);
		bodyModel[226].rotateAngleZ = -0.87266463F;

		bodyModel[227].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[227].setRotationPoint(-16.25F, -22.5F, -1F);
		bodyModel[227].rotateAngleZ = -0.87266463F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[228].setRotationPoint(-19F, -18.25F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[229].setRotationPoint(-19F, -17.25F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[230].setRotationPoint(-19F, -18.25F, -1.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[231].setRotationPoint(-3F, -21.25F, -9.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[232].setRotationPoint(-5F, -22.25F, -7.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[233].setRotationPoint(-4F, -22.25F, -9.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[234].setRotationPoint(-3F, -22.25F, -8.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[235].setRotationPoint(-4.5F, -21.75F, 4.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[236].setRotationPoint(1.5F, -21.75F, -4.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[237].setRotationPoint(-4.5F, -19F, 11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[238].setRotationPoint(-4.5F, -19F, -12F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[239].setRotationPoint(-1F, -23.5F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[240].setRotationPoint(-1F, -24F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[241].setRotationPoint(-1F, -24F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[242].setRotationPoint(-1F, -24F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[243].setRotationPoint(-1F, -24F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 431 cull support
		bodyModel[244].setRotationPoint(-1F, -22.5F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[245].setRotationPoint(9.75F, -19.5F, -0.25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[246].setRotationPoint(9.5F, -20F, -0.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[247].setRotationPoint(9.5F, -21F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[248].setRotationPoint(8.5F, -21F, -1F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 0, 11, 0F); // Box 425
		bodyModel[249].setRotationPoint(28.5F, -13F, -5.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[250].setRotationPoint(-28F, -16F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 256
		bodyModel[251].setRotationPoint(28F, -16F, -1F);

		bodyModel[252].addBox(0F, 0F, 0F, 2, 11, 6, 0F); // Box 297
		bodyModel[252].setRotationPoint(4F, -15F, -7F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 9, 4, 0F); // Box 298
		bodyModel[253].setRotationPoint(4F, -13F, -1F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[254].setRotationPoint(18.5F, -17F, 4.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[255].setRotationPoint(18.5F, -16F, 4.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 259
		bodyModel[256].setRotationPoint(-17.5F, -16F, -5.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 260
		bodyModel[257].setRotationPoint(-19.5F, -17F, -5.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[258].setRotationPoint(-25.5F, -7F, 6.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[259].setRotationPoint(-25.5F, -7F, -6.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 6, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 263
		bodyModel[260].setRotationPoint(21.5F, -7F, -6.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[261].setRotationPoint(21.5F, -7F, 6.25F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		bodyModel[262].setRotationPoint(21.5F, -7F, -7.25F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[263].setRotationPoint(3F, -23F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[264].setRotationPoint(-3.5F, -22F, -0.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[265].setRotationPoint(-3.5F, -23F, -0.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 397 hb
		bodyModel[266].setRotationPoint(0.5F, -13F, -9F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 398 hb
		bodyModel[267].setRotationPoint(2.5F, -11F, -10.01F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[268].setRotationPoint(-8.5F, -22.25F, 0.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[269].setRotationPoint(-7F, -21.5F, -0.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[270].setRotationPoint(-9.5F, -22.5F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[271].setRotationPoint(-9F, -22.25F, -1.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[272].setRotationPoint(-8F, -23.5F, -1F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[273].setRotationPoint(-8F, -23.5F, 0.25F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271
		bodyModel[274].setRotationPoint(3.75F, -22.5F, 5.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[275].setRotationPoint(3F, -22F, 7.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[276].setRotationPoint(3F, -22F, 3.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[277].setRotationPoint(3.5F, -22.5F, 6.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[278].setRotationPoint(3.5F, -22.5F, 4.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[279].setRotationPoint(4F, -21.25F, 4.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 360 cull
		bodyModel[280].setRotationPoint(-1F, -20.5F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 363
		bodyModel[281].setRotationPoint(-0.32F, -21.5F, -9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 glow commander beacon
		bodyModel[282].setRotationPoint(-0.5F, -22.5F, -9.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 366 cull
		bodyModel[283].setRotationPoint(-1F, -20.5F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 367
		bodyModel[284].setRotationPoint(-0.32F, -21.5F, 8.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368 glow commander beacon
		bodyModel[285].setRotationPoint(-0.5F, -22.5F, 8.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[286].setRotationPoint(-1.75F, -23F, 0.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[287].setRotationPoint(-0.5F, -22F, -0.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[288].setRotationPoint(-0.5F, -23F, -0.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[289].setRotationPoint(-2.25F, -23F, -1.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 290 wrx firepump
		bodyModel[290].setRotationPoint(-14F, -18.5F, -6F);

		bodyModel[291].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 291 cull
		bodyModel[291].setRotationPoint(-14F, -15.5F, -6F);

		bodyModel[292].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 130 wrx water tank
		bodyModel[292].setRotationPoint(-13F, -19.5F, 5F);
		bodyModel[292].rotateAngleY = -1.57079633F;

		bodyModel[293].addShapeBox(0F, 0F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131 wrx water tank
		bodyModel[293].setRotationPoint(-13F, -18.5F, 5F);
		bodyModel[293].rotateAngleY = -1.57079633F;

		bodyModel[294].addShapeBox(0F, 0F, 2F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 wrx water tank
		bodyModel[294].setRotationPoint(-13F, -18.5F, 5F);
		bodyModel[294].rotateAngleY = -1.57079633F;

		bodyModel[295].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 295 cull
		bodyModel[295].setRotationPoint(-14F, -16.5F, 5F);
		bodyModel[295].rotateAngleY = -1.57079633F;

		bodyModel[296].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 296 wrx bit
		bodyModel[296].setRotationPoint(-13F, -16.5F, -2F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 297 wrx bit
		bodyModel[297].setRotationPoint(-13.5F, -17F, -7.25F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 298 wrx bit
		bodyModel[298].setRotationPoint(-13F, -19.5F, 3F);
		bodyModel[298].rotateAngleX = 0.59341195F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 8, 20, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, -10F, 0F, -4F, -10F, 0F, 0F, -10F, 0F); // Box 299 wrx firehose
		bodyModel[299].setRotationPoint(-15F, -17F, -7.26F);

		bodyModel[300].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 438 amador central FPE
		bodyModel[300].setRotationPoint(8.5F, -5F, -8.75F);
		bodyModel[300].rotateAngleY = -0.78539816F;

		bodyModel[301].addShapeBox(-1F, -1F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 301 FPE
		bodyModel[301].setRotationPoint(8.5F, -5F, -8.75F);
		bodyModel[301].rotateAngleY = -0.78539816F;
	}
	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeAnew theTypeA = new ModelTypeAnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1342) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));//white bearing caps
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 654
				||GetColor(entity) == 1348) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Silver.png"));// self explanitory
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));// lol
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, -0.03, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.24, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black2.png"));//full blacj
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.33, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.24, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}