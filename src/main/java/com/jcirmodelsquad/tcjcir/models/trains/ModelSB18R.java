//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SB18R
// Model Creator: bidahohchi
// Created on: 10.04.2023 - 18:23:21
// Last changed on: 10.04.2023 - 18:23:21

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

public class ModelSB18R extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSB18R() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[336];

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
		bodyModel[51] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 electrical locker
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
		bodyModel[69] = new ModelRendererTurbo(this, 117, 55, textureX, textureY); // Box 279
		bodyModel[70] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[71] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[72] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[73] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[74] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[75] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[76] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[77] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[78] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[79] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[80] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[81] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[82] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[83] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[84] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[85] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[86] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[87] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[88] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[89] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[90] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[91] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[92] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[93] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[94] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[95] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[96] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[97] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[98] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[99] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[100] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[101] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[102] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[103] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 441 ditchlight r2
		bodyModel[104] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[105] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[106] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[107] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[108] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[109] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[110] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[111] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[112] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[113] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[114] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[115] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[116] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[117] = new ModelRendererTurbo(this, 129, 56, textureX, textureY, "cull"); // Box 330
		bodyModel[118] = new ModelRendererTurbo(this, 114, 55, textureX, textureY); // Box 337
		bodyModel[119] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[120] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[121] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[122] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[123] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[124] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[125] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[126] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[127] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[128] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[129] = new ModelRendererTurbo(this, 74, 123, textureX, textureY); // Box 688
		bodyModel[130] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[131] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[132] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[133] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[134] = new ModelRendererTurbo(this, 332, 90, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[135] = new ModelRendererTurbo(this, 329, 89, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[136] = new ModelRendererTurbo(this, 339, 89, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[137] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[138] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[139] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[140] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[141] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[142] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[143] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[144] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[145] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[146] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[147] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 123
		bodyModel[148] = new ModelRendererTurbo(this, 24, 59, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[149] = new ModelRendererTurbo(this, 26, 54, textureX, textureY); // Box 5
		bodyModel[150] = new ModelRendererTurbo(this, 72, 27, textureX, textureY); // Box 311
		bodyModel[151] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[152] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[153] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[154] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[155] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[156] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[157] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[158] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[159] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[160] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[161] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[162] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[163] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[164] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[165] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[166] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[167] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[168] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[169] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[170] = new ModelRendererTurbo(this, 191, 3, textureX, textureY); // Box 245
		bodyModel[171] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[172] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[173] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[174] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[175] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[176] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[177] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[178] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[179] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[180] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[181] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[182] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[183] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[184] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[185] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[186] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[187] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[188] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[189] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[190] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[191] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 late air
		bodyModel[192] = new ModelRendererTurbo(this, 114, 53, textureX, textureY); // Box 785
		bodyModel[193] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[194] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[195] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[196] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[197] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[198] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[199] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[200] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[201] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[202] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[203] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[204] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[205] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[206] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[207] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[208] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[209] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[210] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[211] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[212] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[213] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge.
		bodyModel[214] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[215] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[216] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[217] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538
		bodyModel[218] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[219] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[220] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[221] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[222] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[223] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[224] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[225] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[226] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[227] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[228] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[229] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[230] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[231] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[232] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[233] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[234] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[235] = new ModelRendererTurbo(this, 403, 40, textureX, textureY); // Box 18
		bodyModel[236] = new ModelRendererTurbo(this, 403, 49, textureX, textureY); // Box 21
		bodyModel[237] = new ModelRendererTurbo(this, 403, 28, textureX, textureY); // Box 344
		bodyModel[238] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 52 door swing right
		bodyModel[239] = new ModelRendererTurbo(this, 76, 18, textureX, textureY); // Box 70
		bodyModel[240] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Box 72
		bodyModel[241] = new ModelRendererTurbo(this, 47, 34, textureX, textureY); // Box 190
		bodyModel[242] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 313
		bodyModel[243] = new ModelRendererTurbo(this, 113, 31, textureX, textureY); // Box 314 door swing right
		bodyModel[244] = new ModelRendererTurbo(this, 30, 66, textureX, textureY); // Box 68
		bodyModel[245] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 69
		bodyModel[246] = new ModelRendererTurbo(this, 112, 74, textureX, textureY); // Box 74
		bodyModel[247] = new ModelRendererTurbo(this, 123, 71, textureX, textureY); // Box 75
		bodyModel[248] = new ModelRendererTurbo(this, 97, 71, textureX, textureY); // Box 76
		bodyModel[249] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[250] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[251] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[252] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[253] = new ModelRendererTurbo(this, 54, 4, textureX, textureY); // Box 332
		bodyModel[254] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 333
		bodyModel[255] = new ModelRendererTurbo(this, 46, 86, textureX, textureY); // Box 67
		bodyModel[256] = new ModelRendererTurbo(this, 47, 59, textureX, textureY); // Box 334
		bodyModel[257] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 335
		bodyModel[258] = new ModelRendererTurbo(this, 373, 82, textureX, textureY); // Box 430
		bodyModel[259] = new ModelRendererTurbo(this, 347, 101, textureX, textureY); // Box 74
		bodyModel[260] = new ModelRendererTurbo(this, 358, 98, textureX, textureY); // Box 75
		bodyModel[261] = new ModelRendererTurbo(this, 332, 98, textureX, textureY); // Box 76
		bodyModel[262] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[263] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[264] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 186 Headlight Rear
		bodyModel[265] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 187 Headlight Rear
		bodyModel[266] = new ModelRendererTurbo(this, 172, 5, textureX, textureY); // Box 438
		bodyModel[267] = new ModelRendererTurbo(this, 148, 5, textureX, textureY); // Box 439
		bodyModel[268] = new ModelRendererTurbo(this, 163, 8, textureX, textureY); // Box 440
		bodyModel[269] = new ModelRendererTurbo(this, 171, 14, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[270] = new ModelRendererTurbo(this, 171, 14, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[271] = new ModelRendererTurbo(this, 165, 189, textureX, textureY); // Box 53
		bodyModel[272] = new ModelRendererTurbo(this, 178, 192, textureX, textureY); // Box 54
		bodyModel[273] = new ModelRendererTurbo(this, 163, 162, textureX, textureY); // Box 55
		bodyModel[274] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[275] = new ModelRendererTurbo(this, 185, 189, textureX, textureY); // Box 235
		bodyModel[276] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[277] = new ModelRendererTurbo(this, 163, 148, textureX, textureY); // Box 125
		bodyModel[278] = new ModelRendererTurbo(this, 198, 197, textureX, textureY); // Box 338
		bodyModel[279] = new ModelRendererTurbo(this, 211, 197, textureX, textureY); // Box 340
		bodyModel[280] = new ModelRendererTurbo(this, 198, 195, textureX, textureY); // Box 344
		bodyModel[281] = new ModelRendererTurbo(this, 201, 184, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[282] = new ModelRendererTurbo(this, 201, 172, textureX, textureY); // Box 574 nose light mount
		bodyModel[283] = new ModelRendererTurbo(this, 201, 179, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[284] = new ModelRendererTurbo(this, 149, 149, textureX, textureY); // Box 292
		bodyModel[285] = new ModelRendererTurbo(this, 157, 157, textureX, textureY); // Box 293
		bodyModel[286] = new ModelRendererTurbo(this, 152, 160, textureX, textureY); // Box 294
		bodyModel[287] = new ModelRendererTurbo(this, 142, 160, textureX, textureY); // Box 406
		bodyModel[288] = new ModelRendererTurbo(this, 139, 157, textureX, textureY); // Box 407
		bodyModel[289] = new ModelRendererTurbo(this, 139, 149, textureX, textureY); // Box 410
		bodyModel[290] = new ModelRendererTurbo(this, 111, 62, textureX, textureY); // Box 336 top gyra bloc
		bodyModel[291] = new ModelRendererTurbo(this, 108, 61, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[292] = new ModelRendererTurbo(this, 120, 61, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[293] = new ModelRendererTurbo(this, 394, 121, textureX, textureY); // Box 204
		bodyModel[294] = new ModelRendererTurbo(this, 395, 128, textureX, textureY); // Box 205
		bodyModel[295] = new ModelRendererTurbo(this, 395, 117, textureX, textureY); // Box 206
		bodyModel[296] = new ModelRendererTurbo(this, 393, 139, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[297] = new ModelRendererTurbo(this, 395, 132, textureX, textureY, "lamp"); // Box 208 sp trashcan light rear
		bodyModel[298] = new ModelRendererTurbo(this, 77, 59, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[299] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box 5
		bodyModel[300] = new ModelRendererTurbo(this, 109, 20, textureX, textureY, "cull"); // Box 416 cull
		bodyModel[301] = new ModelRendererTurbo(this, 109, 9, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[302] = new ModelRendererTurbo(this, 104, 20, textureX, textureY); // Box 287
		bodyModel[303] = new ModelRendererTurbo(this, 104, 9, textureX, textureY); // Box 404
		bodyModel[304] = new ModelRendererTurbo(this, 126, 13, textureX, textureY); // Box 409 commander base
		bodyModel[305] = new ModelRendererTurbo(this, 126, 9, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[306] = new ModelRendererTurbo(this, 126, 24, textureX, textureY); // Box 409 commander base
		bodyModel[307] = new ModelRendererTurbo(this, 126, 20, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[308] = new ModelRendererTurbo(this, 132, 18, textureX, textureY); // Box 421 prime base
		bodyModel[309] = new ModelRendererTurbo(this, 132, 14, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[310] = new ModelRendererTurbo(this, 132, 14, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[311] = new ModelRendererTurbo(this, 132, 14, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[312] = new ModelRendererTurbo(this, 132, 14, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[313] = new ModelRendererTurbo(this, 132, 22, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[314] = new ModelRendererTurbo(this, 68, 195, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[315] = new ModelRendererTurbo(this, 404, 148, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[316] = new ModelRendererTurbo(this, 423, 144, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[317] = new ModelRendererTurbo(this, 91, 199, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[318] = new ModelRendererTurbo(this, 168, 35, textureX, textureY); // Box 332
		bodyModel[319] = new ModelRendererTurbo(this, 177, 35, textureX, textureY); // Box 333
		bodyModel[320] = new ModelRendererTurbo(this, 168, 38, textureX, textureY); // Box 334
		bodyModel[321] = new ModelRendererTurbo(this, 168, 32, textureX, textureY); // Box 335
		bodyModel[322] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[323] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[324] = new ModelRendererTurbo(this, 10, 134, textureX, textureY); // Box 33
		bodyModel[325] = new ModelRendererTurbo(this, 105, 56, textureX, textureY); // Box 277
		bodyModel[326] = new ModelRendererTurbo(this, 102, 50, textureX, textureY); // Box 355 brakewheel
		bodyModel[327] = new ModelRendererTurbo(this, 243, 26, textureX, textureY); // Box 341
		bodyModel[328] = new ModelRendererTurbo(this, 243, 26, textureX, textureY); // Box 342
		bodyModel[329] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 143
		bodyModel[330] = new ModelRendererTurbo(this, 135, 181, textureX, textureY); // Box 132
		bodyModel[331] = new ModelRendererTurbo(this, 122, 177, textureX, textureY); // Box 133
		bodyModel[332] = new ModelRendererTurbo(this, 397, 167, textureX, textureY); // Box 343
		bodyModel[333] = new ModelRendererTurbo(this, 411, 171, textureX, textureY); // Box 344
		bodyModel[334] = new ModelRendererTurbo(this, 17, 194, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[335] = new ModelRendererTurbo(this, 17, 189, textureX, textureY); // Box 307 spedo

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

		bodyModel[51].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[51].setRotationPoint(-13F, -9F, -11F);

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

		bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[69].setRotationPoint(-27F, -25F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[70].setRotationPoint(34F, -4F, -11.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[71].setRotationPoint(34F, -4F, 10.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[72].setRotationPoint(34F, -9F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[73].setRotationPoint(-14F, -17F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[74].setRotationPoint(-14F, -17F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 26, 1, 6, 0F); // Box 294
		bodyModel[75].setRotationPoint(-14F, -17F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[76].setRotationPoint(-3F, -13F, -11.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[77].setRotationPoint(-3F, -13F, 11.01F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[78].setRotationPoint(6F, 3F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[79].setRotationPoint(3F, 3F, -6F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[80].setRotationPoint(37.01F, 7F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[81].setRotationPoint(-37.01F, 7F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[82].setRotationPoint(32.65F, -13F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[83].setRotationPoint(32.65F, -13F, 7F);

		bodyModel[84].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[84].setRotationPoint(28F, 1F, -9F);
		bodyModel[84].rotateAngleY = -3.14159265F;
		bodyModel[84].rotateAngleZ = -0.27925268F;

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[85].setRotationPoint(31F, 1F, -9F);
		bodyModel[85].rotateAngleY = -3.14159265F;

		bodyModel[86].addBox(0F, 0F, 0F, 21, 13, 1, 0F); // Box 283
		bodyModel[86].setRotationPoint(12F, -14F, -7.75F);

		bodyModel[87].addBox(0F, 0F, 0F, 21, 13, 1, 0F); // Box 284
		bodyModel[87].setRotationPoint(12F, -14F, 6.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[88].setRotationPoint(-37.01F, -9F, -10F);
		bodyModel[88].rotateAngleY = -3.14159265F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[89].setRotationPoint(-37.01F, -9F, 11F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[90].setRotationPoint(37.01F, -9F, -10F);
		bodyModel[90].rotateAngleY = -3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[91].setRotationPoint(37.01F, -9F, 11F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[92].setRotationPoint(-37F, 6F, -8F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[93].setRotationPoint(-37F, 6F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[94].setRotationPoint(34F, 6F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[95].setRotationPoint(34F, 6F, -8F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 419 cull atsf bit
		bodyModel[96].setRotationPoint(-18F, -24F, 4.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[97].setRotationPoint(-18F, -25F, 6F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[98].setRotationPoint(-30F, -25F, -1.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[99].setRotationPoint(-29F, -25F, -0.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[100].setRotationPoint(-30F, -25F, 0.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[101].setRotationPoint(-28.5F, -24F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[102].setRotationPoint(37F, -1F, 4.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[103].setRotationPoint(37.25F, -1F, 4.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[104].setRotationPoint(36F, -4F, 4.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[105].setRotationPoint(36.75F, -4F, 4.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[106].setRotationPoint(-37.5F, -1F, 4.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[107].setRotationPoint(-37.75F, -1F, 4.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[108].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[109].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[110].setRotationPoint(34F, 8F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[111].setRotationPoint(34F, 2F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[112].setRotationPoint(34F, -1F, -8F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[113].setRotationPoint(34F, 8F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[114].setRotationPoint(34F, 2F, 7F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[115].setRotationPoint(34F, -1F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[116].setRotationPoint(-15.5F, -24F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[117].setRotationPoint(-25.5F, -24F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[118].setRotationPoint(-18F, -25F, -0.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[119].setRotationPoint(4.5F, -17.5F, -6.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[120].setRotationPoint(3F, -18.25F, -5.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[121].setRotationPoint(2F, -18.5F, -6.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[122].setRotationPoint(3.5F, -18.25F, -7.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[123].setRotationPoint(12F, -17F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[124].setRotationPoint(12F, -18F, 1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[125].setRotationPoint(12F, -18F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[126].setRotationPoint(12F, -18F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[127].setRotationPoint(31F, -18F, -1F);

		bodyModel[128].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[128].setRotationPoint(32F, -18.25F, 0F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[129].setRotationPoint(-31F, -5F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[130].setRotationPoint(-5F, -3F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[131].setRotationPoint(-5F, -3F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[132].setRotationPoint(-5F, -5F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[133].setRotationPoint(-5F, -5F, 10F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[134].setRotationPoint(35F, -19F, -2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[135].setRotationPoint(35.75F, -18.95F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[136].setRotationPoint(35.75F, -18.95F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[137].setRotationPoint(37F, -1F, -7F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[138].setRotationPoint(37F, -9F, -2F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[139].setRotationPoint(37F, -9F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[140].setRotationPoint(37F, -1F, 2F);

		bodyModel[141].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[141].setRotationPoint(37F, -1F, 2F);
		bodyModel[141].rotateAngleY = -3.14159265F;
		bodyModel[141].rotateAngleZ = -1.48352986F;

		bodyModel[142].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[142].setRotationPoint(-37F, -1F, -2F);
		bodyModel[142].rotateAngleZ = -1.48352986F;

		bodyModel[143].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[143].setRotationPoint(-38F, -9F, -2F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[144].setRotationPoint(-38F, -9F, 2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[145].setRotationPoint(-38F, -1F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[146].setRotationPoint(-38F, -1F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[147].setRotationPoint(-27F, -19F, -11F);
		bodyModel[147].rotateAngleX = -0.61086524F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[148].setRotationPoint(-25F, -18F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[149].setRotationPoint(-25F, -19F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[150].setRotationPoint(-27F, -19F, 11F);
		bodyModel[150].rotateAngleX = 0.61086524F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[151].setRotationPoint(-41F, 7F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[152].setRotationPoint(-41F, 7F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[153].setRotationPoint(-40F, 6F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[154].setRotationPoint(-40F, 5F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[155].setRotationPoint(-40F, 6F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[156].setRotationPoint(-40F, 5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[157].setRotationPoint(-40F, 4F, 2F);

		bodyModel[158].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[158].setRotationPoint(-40F, 4F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[159].setRotationPoint(39F, 6F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[160].setRotationPoint(39F, 6F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[161].setRotationPoint(40F, 7F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[162].setRotationPoint(40F, 7F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[163].setRotationPoint(39F, 5F, 2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[164].setRotationPoint(39F, 4F, 2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[165].setRotationPoint(39F, 5F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[166].setRotationPoint(39F, 4F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[167].setRotationPoint(-11F, -22F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[168].setRotationPoint(-11F, -23F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[169].setRotationPoint(-10.75F, -21.5F, -0.25F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 245
		bodyModel[170].setRotationPoint(-13F, -24F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[171].setRotationPoint(-26F, -24.5F, 6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[172].setRotationPoint(-26F, -24.5F, 6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[173].setRotationPoint(-26F, -24.5F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[174].setRotationPoint(-26F, -24.5F, 6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[175].setRotationPoint(-26F, -24F, 6F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[176].setRotationPoint(-37F, 5F, 8F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[177].setRotationPoint(-37F, 5F, -10F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[178].setRotationPoint(34F, 5F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[179].setRotationPoint(34F, 5F, 8F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[180].setRotationPoint(34F, 4F, 8F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[181].setRotationPoint(-37F, 4F, 8F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[182].setRotationPoint(-37F, 4F, -8F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[183].setRotationPoint(34F, 4F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[184].setRotationPoint(3F, 5F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[185].setRotationPoint(5F, 5F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[186].setRotationPoint(6F, 5F, -9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[187].setRotationPoint(8F, 5F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[188].setRotationPoint(21.75F, -12F, 7.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[189].setRotationPoint(19F, -12F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[190].setRotationPoint(16F, -12F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 late air
		bodyModel[191].setRotationPoint(12.5F, -8F, 7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[192].setRotationPoint(-17F, -24F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 66, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[193].setRotationPoint(-33F, 2.75F, -7.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[194].setRotationPoint(-23F, -24.75F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[195].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[196].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[197].setRotationPoint(19.5F, 2F, 6F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[198].setRotationPoint(18.5F, 2.5F, -2F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[199].setRotationPoint(-22.5F, 2.5F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[200].setRotationPoint(-22.5F, 1F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[201].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[202].setRotationPoint(-21.5F, 2F, 6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[203].setRotationPoint(-25F, -25F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[204].setRotationPoint(-25F, -26F, -0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[205].setRotationPoint(-15F, -25F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[206].setRotationPoint(-15F, -26F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 66, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[207].setRotationPoint(-33F, 1F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[208].setRotationPoint(-24.75F, -25F, -6F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[209].setRotationPoint(-23.5F, -24F, -7F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[210].setRotationPoint(-23.5F, -25F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[211].setRotationPoint(-25.25F, -25F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[212].setRotationPoint(6.25F, 0.75F, 8.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge.
		bodyModel[213].setRotationPoint(-17F, -13F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[214].setRotationPoint(19F, -12F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[215].setRotationPoint(21.75F, -12F, -8.25F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[216].setRotationPoint(16F, -12F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[217].setRotationPoint(12.5F, -8F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[218].setRotationPoint(-19.8F, -15F, -5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[219].setRotationPoint(-26.5F, -13F, -3F);
		bodyModel[219].rotateAngleY = -0.45378561F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[220].setRotationPoint(-26.5F, -15F, -3F);
		bodyModel[220].rotateAngleY = -0.45378561F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[221].setRotationPoint(-26.5F, -9F, -3F);
		bodyModel[221].rotateAngleY = -0.45378561F;

		bodyModel[222].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[222].setRotationPoint(-26F, -18F, 0.5F);
		bodyModel[222].rotateAngleY = 0.17453293F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[223].setRotationPoint(13F, -18.51F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[224].setRotationPoint(13F, -18.51F, -15F);

		bodyModel[225].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[225].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[225].rotateAngleX = 1.57079633F;

		bodyModel[226].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[226].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[226].rotateAngleX = -1.57079633F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[227].setRotationPoint(-37.75F, -1F, -5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[228].setRotationPoint(-37.75F, -1F, 3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[229].setRotationPoint(36.75F, -1F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[230].setRotationPoint(36.75F, -1F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[231].setRotationPoint(-40F, 6F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[232].setRotationPoint(-40F, 6F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[233].setRotationPoint(39F, 6F, 0F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[234].setRotationPoint(39F, 6F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[235].setRotationPoint(6.5F, -18.5F, -3F);

		bodyModel[236].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 21
		bodyModel[236].setRotationPoint(2F, -18F, -3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[237].setRotationPoint(6.5F, -23.5F, -3F);

		bodyModel[238].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[238].setRotationPoint(-26.5F, -19F, -9.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[239].setRotationPoint(-15F, -19F, -10F);

		bodyModel[240].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 72
		bodyModel[240].setRotationPoint(-27F, -19F, 10F);

		bodyModel[241].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 190
		bodyModel[241].setRotationPoint(-27F, -19F, -11F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[242].setRotationPoint(-27F, -19F, -6F);

		bodyModel[243].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[243].setRotationPoint(-14.5F, -19F, 10.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[244].setRotationPoint(-27F, -23F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[245].setRotationPoint(-27F, -23F, 9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[246].setRotationPoint(-30F, -23F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[247].setRotationPoint(-29F, -23F, -6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[248].setRotationPoint(-29F, -23F, 1F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[249].setRotationPoint(-27.05F, -22F, -6F);
		bodyModel[249].rotateAngleY = 0.38397244F;

		bodyModel[250].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[250].setRotationPoint(-27.05F, -22F, 6F);
		bodyModel[250].rotateAngleY = -0.38397244F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[251].setRotationPoint(-29.75F, -23F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[252].setRotationPoint(-29.75F, -21F, -1F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[253].setRotationPoint(-27F, -22F, -9F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[254].setRotationPoint(-15F, -22F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[255].setRotationPoint(-27F, -23F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[256].setRotationPoint(-26F, -22F, 6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		bodyModel[257].setRotationPoint(-26F, -22F, -9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[258].setRotationPoint(33F, -17F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[259].setRotationPoint(33.5F, -17F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[260].setRotationPoint(33.5F, -17F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[261].setRotationPoint(33.5F, -17F, 1F);

		bodyModel[262].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[262].setRotationPoint(33.55F, -16F, -6F);
		bodyModel[262].rotateAngleY = -0.38397244F;

		bodyModel[263].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[263].setRotationPoint(33.55F, -16F, 6F);
		bodyModel[263].rotateAngleY = 0.38397244F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Rear
		bodyModel[264].setRotationPoint(35.25F, -17F, -1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Rear
		bodyModel[265].setRotationPoint(35.25F, -15F, -1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[266].setRotationPoint(-14F, -23F, 1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[267].setRotationPoint(-14F, -23F, -6F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 440
		bodyModel[268].setRotationPoint(-14F, -23F, -1F);

		bodyModel[269].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[269].setRotationPoint(-13.95F, -22.5F, -6F);
		bodyModel[269].rotateAngleY = -0.38397244F;

		bodyModel[270].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[270].setRotationPoint(-13.95F, -22.5F, 6F);
		bodyModel[270].rotateAngleY = 0.38397244F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[271].setRotationPoint(-34F, -14F, 1F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[272].setRotationPoint(-34F, -14F, -1F);

		bodyModel[273].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[273].setRotationPoint(-33F, -14F, -6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[274].setRotationPoint(-33.25F, -13F, -5.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[275].setRotationPoint(-34F, -14F, -6F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[276].setRotationPoint(-33.25F, -13F, 3.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[277].setRotationPoint(-33F, -15F, -6F);

		bodyModel[278].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[278].setRotationPoint(-33.5F, -15F, -5.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[279].setRotationPoint(-33.5F, -15F, 5.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[280].setRotationPoint(-30.5F, -15F, 5.5F);
		bodyModel[280].rotateAngleY = -0.78539816F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[281].setRotationPoint(-34.35F, -11F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[282].setRotationPoint(-34.6F, -13F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[283].setRotationPoint(-34.35F, -13F, -1F);

		bodyModel[284].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 292
		bodyModel[284].setRotationPoint(-32F, -13F, -11.01F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[285].setRotationPoint(-34F, -5F, -11.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[286].setRotationPoint(-34F, -10F, -11F);

		bodyModel[287].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[287].setRotationPoint(-34F, -10F, 9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[288].setRotationPoint(-34F, -5F, 10.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[289].setRotationPoint(-32F, -13F, 10.99F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 top gyra bloc
		bodyModel[290].setRotationPoint(-29.5F, -25F, -2F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[291].setRotationPoint(-30.25F, -25F, 0F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[292].setRotationPoint(-30.25F, -25F, -2F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[293].setRotationPoint(34F, -21.75F, -1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[294].setRotationPoint(34F, -20.75F, 1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[295].setRotationPoint(34F, -20.75F, -2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[296].setRotationPoint(34F, -18F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 208 sp trashcan light rear
		bodyModel[297].setRotationPoint(36.1F, -21F, -1.25F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[298].setRotationPoint(-25F, -18F, -12.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[299].setRotationPoint(-25F, -19F, -13F);

		bodyModel[300].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 416 cull
		bodyModel[300].setRotationPoint(-22F, -23F, -11F);

		bodyModel[301].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 419 cull
		bodyModel[301].setRotationPoint(-22F, -23F, 9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[302].setRotationPoint(-21.5F, -24F, -10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[303].setRotationPoint(-21.5F, -24F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[304].setRotationPoint(-18F, -24F, 9.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[305].setRotationPoint(-18F, -25F, 9.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[306].setRotationPoint(-18F, -24F, -10.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[307].setRotationPoint(-18F, -25F, -10.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[308].setRotationPoint(-17F, -26F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[309].setRotationPoint(-17F, -26.5F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[310].setRotationPoint(-17F, -26.5F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[311].setRotationPoint(-17F, -26.5F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[312].setRotationPoint(-17F, -26.5F, -1F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[313].setRotationPoint(-17F, -25F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[314].setRotationPoint(-38F, -1F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[315].setRotationPoint(-39.5F, -1F, -8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[316].setRotationPoint(37F, -1F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 315 cull anticlimber
		bodyModel[317].setRotationPoint(38.5F, -1F, -8F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 332
		bodyModel[318].setRotationPoint(31F, -19.5F, 3.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 333
		bodyModel[319].setRotationPoint(33F, -18.5F, 3.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 334
		bodyModel[320].setRotationPoint(32.25F, -19.5F, 4.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[321].setRotationPoint(32.75F, -19.5F, 2.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[322].setRotationPoint(-34F, -13F, 11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[323].setRotationPoint(-34F, -13F, -11F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 33
		bodyModel[324].setRotationPoint(-31F, -5F, 6F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[325].setRotationPoint(34F, -9F, -5.5F);
		bodyModel[325].rotateAngleY = 1.57079633F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[326].setRotationPoint(34F, -11F, -7.5F);
		bodyModel[326].rotateAngleY = 1.57079633F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[327].setRotationPoint(-12F, -15.5F, -7.15F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[328].setRotationPoint(-12F, -15.5F, 6.15F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[329].setRotationPoint(-33.5F, -14.5F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[330].setRotationPoint(-39F, 6F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[331].setRotationPoint(-39F, 6F, 0F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[332].setRotationPoint(37F, 6F, 0F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[333].setRotationPoint(37F, 6F, -8F);

		bodyModel[334].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[334].setRotationPoint(-24.5F, -17.25F, -2F);
		bodyModel[334].rotateAngleY = 0.78539816F;

		bodyModel[335].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[335].setRotationPoint(-24.5F, -17.25F, -2F);
		bodyModel[335].rotateAngleY = 0.78539816F;
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
		} else if (GetColor(entity) == 4567 ||GetColor(entity) == 8){
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