//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SB18B
// Model Creator: bibuh
// Created on: 04.11.2023 - 17:57:51
// Last changed on: 04.11.2023 - 17:57:51

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
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelSB18B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSB18B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[280];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[12] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[13] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[14] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[15] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 196
		bodyModel[16] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[17] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[18] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[19] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[20] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[21] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[22] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[23] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[24] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[25] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[26] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[28] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[29] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[33] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[34] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[35] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[36] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[37] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[38] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[39] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[40] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[41] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[42] = new ModelRendererTurbo(this, 179, 90, textureX, textureY); // Box 303
		bodyModel[43] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[44] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[45] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[46] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[47] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[48] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[49] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[50] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[51] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 hostler control pannel
		bodyModel[52] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[53] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[54] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 74, 133, textureX, textureY); // Box 2603
		bodyModel[56] = new ModelRendererTurbo(this, 87, 132, textureX, textureY); // Box 261
		bodyModel[57] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[58] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[59] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[60] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[61] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[62] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f2
		bodyModel[63] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[64] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 278 ditchlight r2
		bodyModel[65] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[67] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[68] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[69] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[70] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[71] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[72] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[73] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[74] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[75] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[76] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[77] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[78] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[79] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[80] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[81] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[82] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[83] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[84] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[85] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[86] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[87] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[88] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[89] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[90] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[91] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[92] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[93] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[94] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[95] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[96] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[97] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[98] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 441 ditchlight r2
		bodyModel[99] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[100] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[101] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[102] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[103] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[104] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[105] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[106] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[107] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[108] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[109] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[110] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[111] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[112] = new ModelRendererTurbo(this, 129, 56, textureX, textureY, "cull"); // Box 330
		bodyModel[113] = new ModelRendererTurbo(this, 114, 55, textureX, textureY); // Box 337
		bodyModel[114] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[115] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[116] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[117] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[118] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[119] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[120] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[121] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[122] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[123] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[124] = new ModelRendererTurbo(this, 74, 123, textureX, textureY); // Box 688
		bodyModel[125] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[126] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[128] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[129] = new ModelRendererTurbo(this, 332, 90, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[130] = new ModelRendererTurbo(this, 329, 89, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[131] = new ModelRendererTurbo(this, 339, 89, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[132] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[133] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[134] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[135] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[136] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[137] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[138] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[139] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[140] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[141] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[142] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[143] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[144] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[145] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[146] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[147] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[148] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[149] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[150] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[151] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[152] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[153] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[154] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[155] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[156] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[157] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[158] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[159] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[160] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[161] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[162] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[163] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[164] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[165] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[166] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[167] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[168] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[169] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[170] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[171] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[172] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[173] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[174] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[175] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[176] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[177] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[178] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 late air
		bodyModel[179] = new ModelRendererTurbo(this, 114, 53, textureX, textureY); // Box 785
		bodyModel[180] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[181] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[182] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[183] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[184] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[185] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[186] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[187] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[188] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[189] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[190] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[191] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[192] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[193] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[194] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[195] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[196] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[197] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[198] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[199] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[200] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538
		bodyModel[201] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[202] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[203] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[204] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[205] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[206] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[207] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[208] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[209] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[210] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[211] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[212] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[213] = new ModelRendererTurbo(this, 403, 40, textureX, textureY); // Box 18
		bodyModel[214] = new ModelRendererTurbo(this, 403, 49, textureX, textureY); // Box 21
		bodyModel[215] = new ModelRendererTurbo(this, 403, 28, textureX, textureY); // Box 344
		bodyModel[216] = new ModelRendererTurbo(this, 112, 74, textureX, textureY); // Box 74
		bodyModel[217] = new ModelRendererTurbo(this, 123, 71, textureX, textureY); // Box 75
		bodyModel[218] = new ModelRendererTurbo(this, 97, 71, textureX, textureY); // Box 76
		bodyModel[219] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[220] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[221] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[222] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[223] = new ModelRendererTurbo(this, 373, 82, textureX, textureY); // Box 430
		bodyModel[224] = new ModelRendererTurbo(this, 347, 101, textureX, textureY); // Box 74
		bodyModel[225] = new ModelRendererTurbo(this, 358, 98, textureX, textureY); // Box 75
		bodyModel[226] = new ModelRendererTurbo(this, 332, 98, textureX, textureY); // Box 76
		bodyModel[227] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[228] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[229] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 186 Headlight Rear
		bodyModel[230] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 187 Headlight Rear
		bodyModel[231] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[232] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[233] = new ModelRendererTurbo(this, 149, 149, textureX, textureY); // Box 292
		bodyModel[234] = new ModelRendererTurbo(this, 157, 157, textureX, textureY); // Box 293
		bodyModel[235] = new ModelRendererTurbo(this, 152, 160, textureX, textureY); // Box 294
		bodyModel[236] = new ModelRendererTurbo(this, 142, 160, textureX, textureY); // Box 406
		bodyModel[237] = new ModelRendererTurbo(this, 139, 157, textureX, textureY); // Box 407
		bodyModel[238] = new ModelRendererTurbo(this, 139, 149, textureX, textureY); // Box 410
		bodyModel[239] = new ModelRendererTurbo(this, 111, 62, textureX, textureY); // Box 336 top gyra bloc
		bodyModel[240] = new ModelRendererTurbo(this, 108, 61, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[241] = new ModelRendererTurbo(this, 120, 61, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[242] = new ModelRendererTurbo(this, 394, 121, textureX, textureY); // Box 204
		bodyModel[243] = new ModelRendererTurbo(this, 395, 128, textureX, textureY); // Box 205
		bodyModel[244] = new ModelRendererTurbo(this, 395, 117, textureX, textureY); // Box 206
		bodyModel[245] = new ModelRendererTurbo(this, 393, 139, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[246] = new ModelRendererTurbo(this, 395, 132, textureX, textureY, "lamp"); // Box 208 sp trashcan light rear
		bodyModel[247] = new ModelRendererTurbo(this, 68, 195, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[248] = new ModelRendererTurbo(this, 404, 148, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[249] = new ModelRendererTurbo(this, 423, 144, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[250] = new ModelRendererTurbo(this, 91, 199, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[251] = new ModelRendererTurbo(this, 168, 35, textureX, textureY); // Box 332
		bodyModel[252] = new ModelRendererTurbo(this, 177, 35, textureX, textureY); // Box 333
		bodyModel[253] = new ModelRendererTurbo(this, 168, 38, textureX, textureY); // Box 334
		bodyModel[254] = new ModelRendererTurbo(this, 168, 32, textureX, textureY); // Box 335
		bodyModel[255] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[256] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[257] = new ModelRendererTurbo(this, 105, 56, textureX, textureY); // Box 277
		bodyModel[258] = new ModelRendererTurbo(this, 102, 50, textureX, textureY); // Box 355 brakewheel
		bodyModel[259] = new ModelRendererTurbo(this, 243, 26, textureX, textureY); // Box 341
		bodyModel[260] = new ModelRendererTurbo(this, 243, 26, textureX, textureY); // Box 342
		bodyModel[261] = new ModelRendererTurbo(this, 135, 181, textureX, textureY); // Box 132
		bodyModel[262] = new ModelRendererTurbo(this, 122, 177, textureX, textureY); // Box 133
		bodyModel[263] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 343
		bodyModel[264] = new ModelRendererTurbo(this, 411, 171, textureX, textureY); // Box 344
		bodyModel[265] = new ModelRendererTurbo(this, 146, 7, textureX, textureY); // Box 336
		bodyModel[266] = new ModelRendererTurbo(this, 146, 16, textureX, textureY); // Box 337
		bodyModel[267] = new ModelRendererTurbo(this, 148, 1, textureX, textureY); // Box 338
		bodyModel[268] = new ModelRendererTurbo(this, 77, 2, textureX, textureY); // Box 339
		bodyModel[269] = new ModelRendererTurbo(this, 169, 63, textureX, textureY, "cull"); // Box 340 cull beacon holdy EXTENDUS
		bodyModel[270] = new ModelRendererTurbo(this, 394, 121, textureX, textureY); // Box 204
		bodyModel[271] = new ModelRendererTurbo(this, 395, 128, textureX, textureY); // Box 205
		bodyModel[272] = new ModelRendererTurbo(this, 395, 117, textureX, textureY); // Box 206
		bodyModel[273] = new ModelRendererTurbo(this, 393, 139, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[274] = new ModelRendererTurbo(this, 395, 132, textureX, textureY, "lamp"); // Box 208 sp trashcan light front
		bodyModel[275] = new ModelRendererTurbo(this, 162, 145, textureX, textureY); // Box 346
		bodyModel[276] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 347
		bodyModel[277] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 143
		bodyModel[278] = new ModelRendererTurbo(this, 83, 122, textureX, textureY); // Box 349
		bodyModel[279] = new ModelRendererTurbo(this, 82, 120, textureX, textureY); // Box 350

		bodyModel[0].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-33F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-37.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 47, 15, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-14F, -16F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-37F, -1F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-9F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(7F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[7].setRotationPoint(-30F, -5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 32
		bodyModel[8].setRotationPoint(-31F, -3F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[9].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[10].setRotationPoint(-33F, 2F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[11].setRotationPoint(-33F, 1.5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[12].setRotationPoint(-9F, 5F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[13].setRotationPoint(-9F, 5F, 8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[14].setRotationPoint(-34F, -1F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[15].setRotationPoint(-34F, 7F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[16].setRotationPoint(-37F, 8F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[17].setRotationPoint(-34F, 7F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[18].setRotationPoint(-37F, -1F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[19].setRotationPoint(-37F, 2F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[20].setRotationPoint(-37F, -1F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[21].setRotationPoint(-37F, 2F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[22].setRotationPoint(-37F, 8F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[23].setRotationPoint(-37F, 8F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[24].setRotationPoint(33F, -1F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[25].setRotationPoint(33F, 7F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[26].setRotationPoint(33F, 7F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[27].setRotationPoint(37F, 3F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[28].setRotationPoint(37F, 8F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[29].setRotationPoint(-37F, -1F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[30].setRotationPoint(-37F, -1F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[31].setRotationPoint(-37F, -9F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 66, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[32].setRotationPoint(-33F, 1F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[33].setRotationPoint(-37F, -4F, -6.75F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[34].setRotationPoint(37.01F, -1F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[35].setRotationPoint(37.01F, -1F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[36].setRotationPoint(37.01F, -9F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[37].setRotationPoint(37.01F, -1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[38].setRotationPoint(36F, -4F, -6.75F);

		bodyModel[39].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[39].setRotationPoint(-14F, -13F, 11F);

		bodyModel[40].addBox(0F, 0F, 0F, 33, 8, 0, 0F); // Box 288
		bodyModel[40].setRotationPoint(1F, -9F, 11F);

		bodyModel[41].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[41].setRotationPoint(-14F, -13F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 33, 8, 0, 0F); // Box 303
		bodyModel[42].setRotationPoint(1F, -9F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[43].setRotationPoint(34F, -9F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[44].setRotationPoint(7F, 4F, -9.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[45].setRotationPoint(6F, 1F, 8.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[46].setRotationPoint(4F, 4F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[47].setRotationPoint(4F, 4F, -9.5F);

		bodyModel[48].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[48].setRotationPoint(4.5F, 5.5F, 10.01F);
		bodyModel[48].rotateAngleZ = 0.2268928F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[49].setRotationPoint(-37.5F, -1F, -6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[50].setRotationPoint(37F, -1F, -6.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 hostler control pannel
		bodyModel[51].setRotationPoint(-23F, -18F, -7.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[52].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[53].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[54].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[55].setRotationPoint(-33F, 1F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[56].setRotationPoint(-34F, -1F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[57].setRotationPoint(31F, 1F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[58].setRotationPoint(33F, -1F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[59].setRotationPoint(-37F, 1F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[60].setRotationPoint(-37.25F, -4F, -6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[61].setRotationPoint(32F, 1F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[62].setRotationPoint(-37.75F, -1F, -6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[63].setRotationPoint(36.75F, -4F, -6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[64].setRotationPoint(37.25F, -1F, -6.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[65].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[66].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[67].setRotationPoint(31F, 1F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[68].setRotationPoint(33F, -1F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[69].setRotationPoint(34F, -4F, -11.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[70].setRotationPoint(34F, -4F, 10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[71].setRotationPoint(34F, -9F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[72].setRotationPoint(-14F, -17F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[73].setRotationPoint(-14F, -17F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 26, 1, 6, 0F); // Box 294
		bodyModel[74].setRotationPoint(-14F, -17F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[75].setRotationPoint(-3F, -13F, -11.01F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[76].setRotationPoint(-3F, -13F, 11.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[77].setRotationPoint(6F, 3F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[78].setRotationPoint(3F, 3F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[79].setRotationPoint(37.01F, 7F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[80].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[81].setRotationPoint(32.65F, -13F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[82].setRotationPoint(32.65F, -13F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[83].setRotationPoint(28F, 1F, -9F);
		bodyModel[83].rotateAngleY = -3.14159265F;
		bodyModel[83].rotateAngleZ = -0.27925268F;

		bodyModel[84].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[84].setRotationPoint(31F, 1F, -9F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addBox(0F, 0F, 0F, 21, 13, 1, 0F); // Box 283
		bodyModel[85].setRotationPoint(12F, -14F, -7.75F);

		bodyModel[86].addBox(0F, 0F, 0F, 21, 13, 1, 0F); // Box 284
		bodyModel[86].setRotationPoint(12F, -14F, 6.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[87].setRotationPoint(-37.01F, -9F, -10F);
		bodyModel[87].rotateAngleY = -3.14159265F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[88].setRotationPoint(-37.01F, -9F, 11F);
		bodyModel[88].rotateAngleY = -3.14159265F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[89].setRotationPoint(37.01F, -9F, -10F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[90].setRotationPoint(37.01F, -9F, 11F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[91].setRotationPoint(-37F, 6F, -8F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[92].setRotationPoint(-37F, 6F, 8F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[93].setRotationPoint(34F, 6F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[94].setRotationPoint(34F, 6F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 419 cull atsf bit
		bodyModel[95].setRotationPoint(-18F, -18F, 3.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[96].setRotationPoint(-18F, -19F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[97].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[98].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[99].setRotationPoint(36F, -4F, 4.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[100].setRotationPoint(36.75F, -4F, 4.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[101].setRotationPoint(-37.5F, -1F, 4.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[102].setRotationPoint(-37.75F, -1F, 4.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[103].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[104].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[105].setRotationPoint(34F, 8F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[106].setRotationPoint(34F, 2F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[107].setRotationPoint(34F, -1F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[108].setRotationPoint(34F, 8F, 8F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[109].setRotationPoint(34F, 2F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[110].setRotationPoint(34F, -1F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[111].setRotationPoint(-16.5F, -19F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[112].setRotationPoint(-25.5F, -19F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[113].setRotationPoint(-13F, -19F, -0.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[114].setRotationPoint(4.5F, -17.5F, -6.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[115].setRotationPoint(3F, -18.25F, -5.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[116].setRotationPoint(2F, -18.5F, -6.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[117].setRotationPoint(3.5F, -18.25F, -7.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[118].setRotationPoint(12F, -17F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[119].setRotationPoint(12F, -18F, 1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[120].setRotationPoint(12F, -18F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[121].setRotationPoint(12F, -18F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[122].setRotationPoint(31F, -18F, -1F);

		bodyModel[123].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[123].setRotationPoint(32F, -18.25F, 0F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[124].setRotationPoint(-31F, -5F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[125].setRotationPoint(-5F, -3F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[126].setRotationPoint(-5F, -3F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[127].setRotationPoint(-5F, -5F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[128].setRotationPoint(-5F, -5F, 10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[129].setRotationPoint(35F, -19F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[130].setRotationPoint(35.75F, -18.95F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[131].setRotationPoint(35.75F, -18.95F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[132].setRotationPoint(37F, -1F, -7F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[133].setRotationPoint(37F, -9F, -2F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[134].setRotationPoint(37F, -9F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[135].setRotationPoint(37F, -1F, 2F);

		bodyModel[136].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[136].setRotationPoint(37F, -1F, 2F);
		bodyModel[136].rotateAngleY = -3.14159265F;
		bodyModel[136].rotateAngleZ = -1.48352986F;

		bodyModel[137].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[137].setRotationPoint(-37F, -1F, -2F);
		bodyModel[137].rotateAngleZ = -1.48352986F;

		bodyModel[138].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[138].setRotationPoint(-38F, -9F, -2F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[139].setRotationPoint(-38F, -9F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[140].setRotationPoint(-38F, -1F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[141].setRotationPoint(-38F, -1F, 2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[142].setRotationPoint(-41F, 7F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[143].setRotationPoint(-41F, 7F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[144].setRotationPoint(-40F, 6F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[145].setRotationPoint(-40F, 5F, 2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[146].setRotationPoint(-40F, 6F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[147].setRotationPoint(-40F, 5F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[148].setRotationPoint(-40F, 4F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[149].setRotationPoint(-40F, 4F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[150].setRotationPoint(39F, 6F, 0F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[151].setRotationPoint(39F, 6F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[152].setRotationPoint(40F, 7F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[153].setRotationPoint(40F, 7F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[154].setRotationPoint(39F, 5F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[155].setRotationPoint(39F, 4F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[156].setRotationPoint(39F, 5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[157].setRotationPoint(39F, 4F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[158].setRotationPoint(-3F, -24.5F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[159].setRotationPoint(-3F, -24.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[160].setRotationPoint(-3F, -24.5F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[161].setRotationPoint(-3F, -24.5F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[162].setRotationPoint(-3F, -24F, -1F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[163].setRotationPoint(-37F, 5F, 8F);

		bodyModel[164].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[164].setRotationPoint(-37F, 5F, -10F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[165].setRotationPoint(34F, 5F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[166].setRotationPoint(34F, 5F, 8F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[167].setRotationPoint(34F, 4F, 8F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[168].setRotationPoint(-37F, 4F, 8F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[169].setRotationPoint(-37F, 4F, -8F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[170].setRotationPoint(34F, 4F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[171].setRotationPoint(3F, 5F, -9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[172].setRotationPoint(5F, 5F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[173].setRotationPoint(6F, 5F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[174].setRotationPoint(8F, 5F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[175].setRotationPoint(21.75F, -12F, 7.25F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[176].setRotationPoint(19F, -12F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[177].setRotationPoint(16F, -12F, 7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 late air
		bodyModel[178].setRotationPoint(12.5F, -8F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[179].setRotationPoint(-20F, -19F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 66, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[180].setRotationPoint(-33F, 2.75F, -7.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[181].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[182].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[183].setRotationPoint(19.5F, 2F, 6F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[184].setRotationPoint(18.5F, 2.5F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[185].setRotationPoint(-22.5F, 2.5F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[186].setRotationPoint(-22.5F, 1F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[187].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[188].setRotationPoint(-21.5F, 2F, 6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[189].setRotationPoint(-25F, -20F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[190].setRotationPoint(-25F, -21F, -0.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[191].setRotationPoint(-16F, -20F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[192].setRotationPoint(-16F, -21F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 66, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[193].setRotationPoint(-33F, 1F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[194].setRotationPoint(-6.5F, -18F, -0.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[195].setRotationPoint(-8.5F, -19F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[196].setRotationPoint(6.25F, 0.75F, 8.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[197].setRotationPoint(19F, -12F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[198].setRotationPoint(21.75F, -12F, -8.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[199].setRotationPoint(16F, -12F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[200].setRotationPoint(12.5F, -8F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[201].setRotationPoint(13F, -18.51F, 1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[202].setRotationPoint(13F, -18.51F, -15F);

		bodyModel[203].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[203].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[203].rotateAngleX = 1.57079633F;

		bodyModel[204].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[204].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[204].rotateAngleX = -1.57079633F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[205].setRotationPoint(-37.75F, -1F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[206].setRotationPoint(-37.75F, -1F, 3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[207].setRotationPoint(36.75F, -1F, -5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[208].setRotationPoint(36.75F, -1F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[209].setRotationPoint(-40F, 6F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[210].setRotationPoint(-40F, 6F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[211].setRotationPoint(39F, 6F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[212].setRotationPoint(39F, 6F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[213].setRotationPoint(6.5F, -18.5F, -3F);

		bodyModel[214].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 21
		bodyModel[214].setRotationPoint(2F, -18F, -3.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[215].setRotationPoint(6.5F, -23.5F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[216].setRotationPoint(-36F, -17F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[217].setRotationPoint(-35F, -17F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[218].setRotationPoint(-35F, -17F, 1F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[219].setRotationPoint(-33.05F, -16F, -6F);
		bodyModel[219].rotateAngleY = 0.38397244F;

		bodyModel[220].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[220].setRotationPoint(-33.05F, -16F, 6F);
		bodyModel[220].rotateAngleY = -0.38397244F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[221].setRotationPoint(-35.75F, -17F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[222].setRotationPoint(-35.75F, -15F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[223].setRotationPoint(33F, -17F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[224].setRotationPoint(33.5F, -17F, -1F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[225].setRotationPoint(33.5F, -17F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[226].setRotationPoint(33.5F, -17F, 1F);

		bodyModel[227].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[227].setRotationPoint(33.55F, -16F, -6F);
		bodyModel[227].rotateAngleY = -0.38397244F;

		bodyModel[228].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[228].setRotationPoint(33.55F, -16F, 6F);
		bodyModel[228].rotateAngleY = 0.38397244F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Rear
		bodyModel[229].setRotationPoint(35.25F, -17F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Rear
		bodyModel[230].setRotationPoint(35.25F, -15F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[231].setRotationPoint(-33.15F, -13F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[232].setRotationPoint(-33.15F, -13F, 5F);

		bodyModel[233].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 292
		bodyModel[233].setRotationPoint(-32F, -13F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[234].setRotationPoint(-34F, -5F, -11.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[235].setRotationPoint(-34F, -10F, -11F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[236].setRotationPoint(-34F, -10F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[237].setRotationPoint(-34F, -5F, 10.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[238].setRotationPoint(-32F, -13F, 11F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 top gyra bloc
		bodyModel[239].setRotationPoint(-35.5F, -19F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[240].setRotationPoint(-36.25F, -19F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[241].setRotationPoint(-36.25F, -19F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[242].setRotationPoint(34F, -21.75F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[243].setRotationPoint(34F, -20.75F, 1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[244].setRotationPoint(34F, -20.75F, -2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[245].setRotationPoint(34F, -18F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 208 sp trashcan light rear
		bodyModel[246].setRotationPoint(36.1F, -21F, -1.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[247].setRotationPoint(-38F, -1F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[248].setRotationPoint(-39.5F, -1F, -8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[249].setRotationPoint(37F, -1F, -9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 315 cull anticlimber
		bodyModel[250].setRotationPoint(38.5F, -1F, -8F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 332
		bodyModel[251].setRotationPoint(31F, -19.5F, 3.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 333
		bodyModel[252].setRotationPoint(33F, -18.5F, 3.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 334
		bodyModel[253].setRotationPoint(32.25F, -19.5F, 4.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[254].setRotationPoint(32.75F, -19.5F, 2.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[255].setRotationPoint(-34F, -13F, 11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[256].setRotationPoint(-34F, -13F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[257].setRotationPoint(34F, -9F, -5.5F);
		bodyModel[257].rotateAngleY = 1.57079633F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[258].setRotationPoint(34F, -11F, -7.5F);
		bodyModel[258].rotateAngleY = 1.57079633F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[259].setRotationPoint(-12F, -15.5F, -7.15F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[260].setRotationPoint(-12F, -15.5F, 6.15F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[261].setRotationPoint(-39F, 6F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[262].setRotationPoint(-39F, 6F, 0F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[263].setRotationPoint(37F, 6F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[264].setRotationPoint(37F, 6F, -8F);

		bodyModel[265].addBox(0F, 0F, 0F, 19, 1, 6, 0F); // Box 336
		bodyModel[265].setRotationPoint(-33F, -18F, -3F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[266].setRotationPoint(-33F, -18F, -7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[267].setRotationPoint(-33F, -18F, 3F);

		bodyModel[268].addBox(0F, 0F, 0F, 19, 16, 14, 0F); // Box 339
		bodyModel[268].setRotationPoint(-33F, -17F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 340 cull beacon holdy EXTENDUS
		bodyModel[269].setRotationPoint(-3F, -23F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[270].setRotationPoint(-36.5F, -21.75F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[271].setRotationPoint(-36.5F, -20.75F, 1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[272].setRotationPoint(-36.5F, -20.75F, -2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[273].setRotationPoint(-36.5F, -18F, -1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 208 sp trashcan light front
		bodyModel[274].setRotationPoint(-36.6F, -21F, -1.25F);

		bodyModel[275].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 346
		bodyModel[275].setRotationPoint(-27F, -13F, -11F);

		bodyModel[276].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 347
		bodyModel[276].setRotationPoint(-27F, -13F, 11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[277].setRotationPoint(-32.5F, -18.5F, -1F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 349
		bodyModel[278].setRotationPoint(-31F, -3F, 6F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 350
		bodyModel[279].setRotationPoint(-31F, -5F, 10F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3426||GetColor(entity) == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324||GetColor(entity) == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 7 ||GetColor(entity) == 3234){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14234 || GetColor(entity) == 9234){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.6, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}