//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U23B(W) - U18B(W)H
// Model Creator: bibahochie
// Created on: 06.01.2024 - 16:51:33
// Last changed on: 06.01.2024 - 16:51:33

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

public class ModelU23BW extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU23BW() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[367];

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
		bodyModel[8] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[12] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[13] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[14] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[15] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[16] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[17] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[18] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[19] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[20] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[21] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[22] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[23] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[24] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[25] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[26] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[27] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[28] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[29] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[31] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[32] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[35] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[36] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[37] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[38] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[39] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[40] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[41] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[42] = new ModelRendererTurbo(this, 188, 72, textureX, textureY); // Box 285
		bodyModel[43] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[44] = new ModelRendererTurbo(this, 154, 81, textureX, textureY); // Box 300
		bodyModel[45] = new ModelRendererTurbo(this, 169, 90, textureX, textureY); // Box 303
		bodyModel[46] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[47] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[48] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[49] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[50] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[51] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[52] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[54] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 crab signal system
		bodyModel[55] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[56] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[58] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[59] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[61] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[62] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[63] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[64] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[65] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f2
		bodyModel[66] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 276 ditchlight r1
		bodyModel[67] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 278 ditchlight r2
		bodyModel[68] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[69] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[70] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[72] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[73] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[74] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[75] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[76] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[77] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[78] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[79] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[80] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[81] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[82] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[83] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[84] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[85] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[86] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[87] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[88] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[89] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[90] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[91] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[92] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[93] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[94] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[95] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[96] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[97] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[98] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[99] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[100] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[101] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[102] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[103] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[104] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[105] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 441 ditchlight r2
		bodyModel[106] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[107] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[108] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[109] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[110] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[111] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[112] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[113] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[114] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[115] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[116] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[117] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[118] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[119] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[120] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[121] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[122] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[123] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[124] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[125] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[126] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[127] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[128] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[129] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[130] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[131] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[132] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[133] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[134] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[135] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[136] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[137] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[138] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[140] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[141] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[142] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[143] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[144] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[145] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[146] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[147] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[148] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[149] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[150] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[151] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[152] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[153] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[154] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[155] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[156] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[157] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[158] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[159] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[160] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[161] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[162] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[163] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[164] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[165] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[166] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[167] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[168] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[169] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[170] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[171] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[172] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[173] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[174] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[175] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[176] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[177] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[178] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[179] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[180] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[181] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[182] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[183] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[184] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[185] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[186] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[187] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[188] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[189] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[190] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[191] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[192] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[193] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[194] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[195] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[196] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[197] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[198] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[199] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[200] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[201] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[202] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[203] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[204] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[205] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[206] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[207] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[208] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[209] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[210] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[211] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[212] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[213] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[214] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[215] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[216] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[217] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[218] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[219] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[220] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[221] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[222] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[223] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[224] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[225] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[226] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[227] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[228] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[229] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[230] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[231] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[232] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[233] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[234] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[235] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[236] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[237] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[238] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[239] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[240] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[241] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[242] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[243] = new ModelRendererTurbo(this, 303, 204, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[244] = new ModelRendererTurbo(this, 257, 197, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[245] = new ModelRendererTurbo(this, 251, 218, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[246] = new ModelRendererTurbo(this, 303, 219, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[247] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[248] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[249] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[250] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[251] = new ModelRendererTurbo(this, 304, 229, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[252] = new ModelRendererTurbo(this, 75, 68, textureX, textureY); // Box 35
		bodyModel[253] = new ModelRendererTurbo(this, 94, 64, textureX, textureY); // Box 55
		bodyModel[254] = new ModelRendererTurbo(this, 105, 71, textureX, textureY); // Box 35
		bodyModel[255] = new ModelRendererTurbo(this, 34, 64, textureX, textureY); // Box 55
		bodyModel[256] = new ModelRendererTurbo(this, 94, 71, textureX, textureY); // Box 355
		bodyModel[257] = new ModelRendererTurbo(this, 34, 71, textureX, textureY); // Box 356
		bodyModel[258] = new ModelRendererTurbo(this, 19, 71, textureX, textureY); // Box 348
		bodyModel[259] = new ModelRendererTurbo(this, 37, 44, textureX, textureY); // Box 68
		bodyModel[260] = new ModelRendererTurbo(this, 82, 48, textureX, textureY); // Box 69
		bodyModel[261] = new ModelRendererTurbo(this, 104, 11, textureX, textureY); // Box 70
		bodyModel[262] = new ModelRendererTurbo(this, 78, 25, textureX, textureY); // Box 72
		bodyModel[263] = new ModelRendererTurbo(this, 53, 25, textureX, textureY); // Box 190
		bodyModel[264] = new ModelRendererTurbo(this, 6, 4, textureX, textureY); // Box 313
		bodyModel[265] = new ModelRendererTurbo(this, 107, 3, textureX, textureY); // Box 314 door swing right
		bodyModel[266] = new ModelRendererTurbo(this, 31, 3, textureX, textureY); // Box 332
		bodyModel[267] = new ModelRendererTurbo(this, 75, 3, textureX, textureY); // Box 333
		bodyModel[268] = new ModelRendererTurbo(this, 82, 41, textureX, textureY); // Box 67
		bodyModel[269] = new ModelRendererTurbo(this, 67, 14, textureX, textureY); // Box 74
		bodyModel[270] = new ModelRendererTurbo(this, 78, 11, textureX, textureY); // Box 75
		bodyModel[271] = new ModelRendererTurbo(this, 52, 11, textureX, textureY); // Box 76
		bodyModel[272] = new ModelRendererTurbo(this, 45, 68, textureX, textureY); // Box 366
		bodyModel[273] = new ModelRendererTurbo(this, 61, 64, textureX, textureY); // Box 367
		bodyModel[274] = new ModelRendererTurbo(this, 64, 70, textureX, textureY); // Box 52 door swing right cab front
		bodyModel[275] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[276] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[277] = new ModelRendererTurbo(this, 21, 90, textureX, textureY); // Box 350
		bodyModel[278] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[279] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[280] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[281] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[282] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[283] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[284] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[285] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[286] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 332
		bodyModel[287] = new ModelRendererTurbo(this, 132, 39, textureX, textureY); // Box 331
		bodyModel[288] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[289] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front BLOCK R
		bodyModel[290] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front BLOCK L
		bodyModel[291] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[292] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[293] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[294] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[295] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[296] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[297] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[298] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[299] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[300] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[301] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[302] = new ModelRendererTurbo(this, 182, 8, textureX, textureY); // Box 409 commander base
		bodyModel[303] = new ModelRendererTurbo(this, 182, 4, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[304] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[305] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[306] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[307] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[308] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[309] = new ModelRendererTurbo(this, 179, 101, textureX, textureY); // Box 486 rail for crab signal
		bodyModel[310] = new ModelRendererTurbo(this, 141, 100, textureX, textureY); // Box 487 crab walkway
		bodyModel[311] = new ModelRendererTurbo(this, 155, 105, textureX, textureY); // Box 488 crab support
		bodyModel[312] = new ModelRendererTurbo(this, 148, 106, textureX, textureY); // Box 489 crab step
		bodyModel[313] = new ModelRendererTurbo(this, 8, 57, textureX, textureY); // Box 48
		bodyModel[314] = new ModelRendererTurbo(this, 8, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[315] = new ModelRendererTurbo(this, 8, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[316] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[317] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[318] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[319] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[320] = new ModelRendererTurbo(this, 117, 40, textureX, textureY); // Box 413
		bodyModel[321] = new ModelRendererTurbo(this, 23, 47, textureX, textureY); // Box 334
		bodyModel[322] = new ModelRendererTurbo(this, 23, 40, textureX, textureY); // Box 335
		bodyModel[323] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 327
		bodyModel[324] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 328
		bodyModel[325] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 329
		bodyModel[326] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 330
		bodyModel[327] = new ModelRendererTurbo(this, 238, 39, textureX, textureY); // Box 331 air intake u18bwh
		bodyModel[328] = new ModelRendererTurbo(this, 257, 39, textureX, textureY); // Box 332 air intake u18bwh
		bodyModel[329] = new ModelRendererTurbo(this, 239, 35, textureX, textureY); // Box 333 air intake u18bwh
		bodyModel[330] = new ModelRendererTurbo(this, 239, 35, textureX, textureY); // Box 334 air intake u18bwh
		bodyModel[331] = new ModelRendererTurbo(this, 238, 39, textureX, textureY); // Box 335 air intake u18bwh
		bodyModel[332] = new ModelRendererTurbo(this, 257, 39, textureX, textureY); // Box 336 air intake u18bwh
		bodyModel[333] = new ModelRendererTurbo(this, 238, 73, textureX, textureY); // Box 337 u18bwh exhaust
		bodyModel[334] = new ModelRendererTurbo(this, 96, 3, textureX, textureY); // Box 314 door swing left
		bodyModel[335] = new ModelRendererTurbo(this, 1, 42, textureX, textureY, "lamp"); // Box 339 red gyra amtk u18bwh
		bodyModel[336] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[337] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[338] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[339] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[340] = new ModelRendererTurbo(this, 105, 196, textureX, textureY); // Box 132
		bodyModel[341] = new ModelRendererTurbo(this, 84, 196, textureX, textureY); // Box 133
		bodyModel[342] = new ModelRendererTurbo(this, 129, 178, textureX, textureY); // Box 61
		bodyModel[343] = new ModelRendererTurbo(this, 151, 178, textureX, textureY); // Box 356
		bodyModel[344] = new ModelRendererTurbo(this, 138, 176, textureX, textureY); // Box 151
		bodyModel[345] = new ModelRendererTurbo(this, 138, 184, textureX, textureY); // Box 415
		bodyModel[346] = new ModelRendererTurbo(this, 127, 113, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[347] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[348] = new ModelRendererTurbo(this, 136, 66, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[349] = new ModelRendererTurbo(this, 156, 68, textureX, textureY); // Box 308
		bodyModel[350] = new ModelRendererTurbo(this, 237, 53, textureX, textureY); // Box 355
		bodyModel[351] = new ModelRendererTurbo(this, 237, 46, textureX, textureY); // Box 356
		bodyModel[352] = new ModelRendererTurbo(this, 73, 5, textureX, textureY); // Box 123
		bodyModel[353] = new ModelRendererTurbo(this, 82, 55, textureX, textureY); // Box 350
		bodyModel[354] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[355] = new ModelRendererTurbo(this, 16, 66, textureX, textureY); // Box 5
		bodyModel[356] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 311
		bodyModel[357] = new ModelRendererTurbo(this, 12, 194, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[358] = new ModelRendererTurbo(this, 12, 189, textureX, textureY); // Box 307 spedo
		bodyModel[359] = new ModelRendererTurbo(this, 22, 190, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[360] = new ModelRendererTurbo(this, 94, 55, textureX, textureY); // Box 288
		bodyModel[361] = new ModelRendererTurbo(this, 85, 55, textureX, textureY); // Box 289
		bodyModel[362] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[363] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 364
		bodyModel[364] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 365
		bodyModel[365] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 366
		bodyModel[366] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 367

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-6F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-20F, -20F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-42F, -1F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-6F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(-8F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 25
		bodyModel[7].setRotationPoint(-35F, -5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 35
		bodyModel[8].setRotationPoint(-20F, -5F, 7F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[9].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[10].setRotationPoint(-38F, 2F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[11].setRotationPoint(38F, -21F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[12].setRotationPoint(38F, -21F, 1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[13].setRotationPoint(38F, -21F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[14].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[15].setRotationPoint(-6F, 5F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[16].setRotationPoint(-6F, 5F, 8F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[17].setRotationPoint(-39F, -1F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[18].setRotationPoint(-39F, 7F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[19].setRotationPoint(-42F, 8F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[20].setRotationPoint(-39F, 7F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[21].setRotationPoint(-42F, -1F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[22].setRotationPoint(-42F, 2F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[23].setRotationPoint(-42F, -1F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[24].setRotationPoint(-42F, 2F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[25].setRotationPoint(-42F, 8F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[26].setRotationPoint(-42F, 8F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[27].setRotationPoint(38F, -1F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[28].setRotationPoint(38F, 7F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[29].setRotationPoint(38F, 7F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[30].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[31].setRotationPoint(42F, 8F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[32].setRotationPoint(-42F, -1F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[33].setRotationPoint(-42F, -1F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[34].setRotationPoint(-42F, -9F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[35].setRotationPoint(-38F, 1F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[36].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[37].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[38].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[39].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[40].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[41].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 285
		bodyModel[42].setRotationPoint(-22F, -13F, 11F);

		bodyModel[43].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[43].setRotationPoint(-5F, -9F, 11F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[44].setRotationPoint(-22F, -13F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 53, 8, 0, 0F); // Box 303
		bodyModel[45].setRotationPoint(-14F, -9F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[46].setRotationPoint(39F, -9F, -11F);

		bodyModel[47].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[47].setRotationPoint(-7.5F, 6F, -9.5F);
		bodyModel[47].rotateAngleZ = -0.10471976F;

		bodyModel[48].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[48].setRotationPoint(-9F, 1F, 8.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[49].setRotationPoint(-11F, 4F, -9F);

		bodyModel[50].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[50].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[50].rotateAngleZ = 0.10471976F;

		bodyModel[51].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[51].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[51].rotateAngleZ = -0.2268928F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[52].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[53].setRotationPoint(42F, -1F, -6.75F);

		bodyModel[54].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 crab signal system
		bodyModel[54].setRotationPoint(-18.5F, -4.75F, -9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[55].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[56].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[57].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[58].setRotationPoint(-38F, 1F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[59].setRotationPoint(-39F, -1F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[60].setRotationPoint(36F, 1F, -11F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[61].setRotationPoint(38F, -1F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[62].setRotationPoint(-42F, 1F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[63].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[64].setRotationPoint(37F, 1F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[65].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[66].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[67].setRotationPoint(42.25F, -1F, -6.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[68].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[69].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[70].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[71].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[72].setRotationPoint(36F, 1F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[73].setRotationPoint(38F, -1F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[74].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[75].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[76].setRotationPoint(39F, -9F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[77].setRotationPoint(-20F, -21F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[78].setRotationPoint(-20F, -21F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[79].setRotationPoint(-20F, -21F, -3F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[80].setRotationPoint(36F, -23.5F, 3.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[81].setRotationPoint(37.5F, -22.75F, 2.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[82].setRotationPoint(36.5F, -23.5F, 1.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[83].setRotationPoint(36F, -23.75F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[84].setRotationPoint(-18F, -13F, -11.01F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[85].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[86].setRotationPoint(-9F, 3F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[87].setRotationPoint(-12F, 3F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[88].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[89].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[90].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[90].rotateAngleY = -0.05235988F;

		bodyModel[91].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[91].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[91].rotateAngleY = 0.05235988F;

		bodyModel[92].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[92].setRotationPoint(-32F, 1F, 9F);
		bodyModel[92].rotateAngleZ = -0.27925268F;

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[93].setRotationPoint(-35F, 1F, 9F);

		bodyModel[94].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[94].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[95].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[96].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[97].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[97].rotateAngleY = -3.14159265F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[98].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[98].rotateAngleY = -3.14159265F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[99].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[99].rotateAngleY = -3.14159265F;

		bodyModel[100].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[100].setRotationPoint(-42F, 6F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[101].setRotationPoint(-42F, 6F, 8F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[102].setRotationPoint(39F, 6F, 8F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[103].setRotationPoint(39F, 6F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[104].setRotationPoint(42F, -1F, 4.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[105].setRotationPoint(42.25F, -1F, 4.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[106].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[107].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[108].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[109].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[110].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[111].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[112].setRotationPoint(39F, 8F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[113].setRotationPoint(39F, 2F, -9F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[114].setRotationPoint(39F, -1F, -8F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[115].setRotationPoint(39F, 8F, 8F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[116].setRotationPoint(39F, 2F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[117].setRotationPoint(39F, -1F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[118].setRotationPoint(-19F, -22.5F, 3.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[119].setRotationPoint(-17.5F, -22F, 4.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[120].setRotationPoint(-18F, -23F, 4.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[121].setRotationPoint(-19F, -22.5F, 5.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[122].setRotationPoint(-19F, -23F, -1.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[123].setRotationPoint(4.5F, -21.5F, -6.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[124].setRotationPoint(3F, -22.25F, -5.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[125].setRotationPoint(2F, -22.5F, -6.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[126].setRotationPoint(3.5F, -22.25F, -7.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[127].setRotationPoint(17F, -21F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[128].setRotationPoint(17F, -22F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[129].setRotationPoint(17F, -22F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[130].setRotationPoint(17F, -22F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[131].setRotationPoint(37F, -22F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[132].setRotationPoint(38F, -22F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[133].setRotationPoint(38F, -22F, 1F);

		bodyModel[134].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[134].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[135].setRotationPoint(11.5F, -22.5F, -2.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[136].setRotationPoint(11F, -21.5F, -3F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[137].setRotationPoint(-20F, -3F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[138].setRotationPoint(-11F, -3F, 7F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[139].setRotationPoint(-20F, -5F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[140].setRotationPoint(-11F, -5F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[141].setRotationPoint(37.8F, -20F, -7.5F);
		bodyModel[141].rotateAngleY = -0.05235988F;

		bodyModel[142].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[142].setRotationPoint(37.8F, -20F, 7.5F);
		bodyModel[142].rotateAngleY = 0.05235988F;

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[143].setRotationPoint(38.75F, -20.25F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[144].setRotationPoint(39.5F, -20.2F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[145].setRotationPoint(39.5F, -20.2F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[146].setRotationPoint(42F, -1F, -7F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[147].setRotationPoint(42F, -9F, -2F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[148].setRotationPoint(42F, -9F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[149].setRotationPoint(42F, -1F, 2F);

		bodyModel[150].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[150].setRotationPoint(42F, -1F, 2F);
		bodyModel[150].rotateAngleY = -3.14159265F;
		bodyModel[150].rotateAngleZ = -1.48352986F;

		bodyModel[151].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[151].setRotationPoint(-42F, -1F, -2F);
		bodyModel[151].rotateAngleZ = -1.48352986F;

		bodyModel[152].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[152].setRotationPoint(-43F, -9F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[153].setRotationPoint(-43F, -9F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[154].setRotationPoint(-43F, -1F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[155].setRotationPoint(-43F, -1F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[156].setRotationPoint(-46F, 7F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[157].setRotationPoint(-46F, 7F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[158].setRotationPoint(-45F, 6F, 0F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[159].setRotationPoint(-45F, 5F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[160].setRotationPoint(-45F, 6F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[161].setRotationPoint(-45F, 5F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[162].setRotationPoint(-45F, 4F, 2F);

		bodyModel[163].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[163].setRotationPoint(-45F, 4F, -8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[164].setRotationPoint(44F, 6F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[165].setRotationPoint(44F, 6F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[166].setRotationPoint(45F, 7F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[167].setRotationPoint(45F, 7F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[168].setRotationPoint(44F, 5F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[169].setRotationPoint(44F, 4F, 2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[170].setRotationPoint(44F, 5F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[171].setRotationPoint(44F, 4F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[172].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[173].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[174].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[175].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[176].setRotationPoint(-16F, -16.5F, 6.15F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[177].setRotationPoint(-18.5F, -16.5F, 6.15F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[178].setRotationPoint(-18.5F, -19F, 6.15F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 745
		bodyModel[179].setRotationPoint(-14.5F, -22.5F, -0.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[180].setRotationPoint(-17F, -23.5F, -0.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[181].setRotationPoint(-16F, -23.25F, 0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[182].setRotationPoint(-15.5F, -23.25F, -1.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[183].setRotationPoint(-42F, 5F, 8F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[184].setRotationPoint(-42F, 5F, -10F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[185].setRotationPoint(39F, 5F, -10F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[186].setRotationPoint(39F, 5F, 8F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[187].setRotationPoint(39F, 4F, 8F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[188].setRotationPoint(-42F, 4F, 8F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[189].setRotationPoint(-42F, 4F, -8F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[190].setRotationPoint(39F, 4F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[191].setRotationPoint(-12F, 5F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[192].setRotationPoint(-10F, 5F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[193].setRotationPoint(-9F, 5F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[194].setRotationPoint(-7F, 5F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[195].setRotationPoint(26.75F, -14F, 7.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[196].setRotationPoint(24F, -14F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[197].setRotationPoint(21F, -14F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[198].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[199].setRotationPoint(-18F, -22F, 3F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[200].setRotationPoint(-16.5F, -21.5F, -4.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[201].setRotationPoint(-17F, -22.25F, -3.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[202].setRotationPoint(-19F, -22.5F, -4.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[203].setRotationPoint(-18F, -22.25F, -5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[204].setRotationPoint(-24.5F, -21F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[205].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[206].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[207].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[208].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[209].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[210].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[211].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[212].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[213].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[214].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[215].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[216].setRotationPoint(-38F, 1F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[217].setRotationPoint(-8.75F, 0.75F, 8.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[218].setRotationPoint(-25F, -13F, -5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[219].setRotationPoint(24F, -14F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[220].setRotationPoint(26.75F, -14F, -8.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[221].setRotationPoint(21F, -14F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[222].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[223].setRotationPoint(-27.8F, -15F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[224].setRotationPoint(-34.5F, -13F, 3F);
		bodyModel[224].rotateAngleY = -0.45378561F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[225].setRotationPoint(-34.5F, -15F, 3F);
		bodyModel[225].rotateAngleY = -0.45378561F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[226].setRotationPoint(-34.5F, -9F, 3F);
		bodyModel[226].rotateAngleY = -0.45378561F;

		bodyModel[227].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[227].setRotationPoint(-34F, -18F, 6.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[228].setRotationPoint(-18.5F, -19F, -7.15F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[229].setRotationPoint(-18.5F, -16.5F, -7.15F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[230].setRotationPoint(-16F, -16.5F, -7.15F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[231].setRotationPoint(18F, -22.51F, 1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[232].setRotationPoint(18F, -22.51F, -15F);

		bodyModel[233].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[233].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[233].rotateAngleX = 1.57079633F;

		bodyModel[234].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[234].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[234].rotateAngleX = -1.57079633F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[235].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[236].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[237].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[238].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[239].setRotationPoint(-45F, 6F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[240].setRotationPoint(-45F, 6F, -10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[241].setRotationPoint(44F, 6F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[242].setRotationPoint(44F, 6F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[243].setRotationPoint(-4F, 5F, -11F);

		bodyModel[244].addBox(0F, 0F, 0F, 14, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[244].setRotationPoint(-4F, 5F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 14, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[245].setRotationPoint(-4F, 2F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[246].setRotationPoint(-4F, 5F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[247].setRotationPoint(-6F, 3F, -5.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[248].setRotationPoint(-6F, 3F, 5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[249].setRotationPoint(10F, 3F, -5.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[250].setRotationPoint(10F, 3F, 5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[251].setRotationPoint(10F, 1.5F, -9F);

		bodyModel[252].addShapeBox(0F, -1F, 0F, 4, 13, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[252].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[253].setRotationPoint(-39F, -14F, -11F);

		bodyModel[254].addShapeBox(0F, -1F, 0F, 3, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[254].setRotationPoint(-38F, -11F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[255].setRotationPoint(-39F, -14F, 7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 355
		bodyModel[256].setRotationPoint(-39F, -12F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[257].setRotationPoint(-39F, -12F, 7F);

		bodyModel[258].addShapeBox(0F, -1F, 0F, 3, 11, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[258].setRotationPoint(-38F, -11F, 7F);

		bodyModel[259].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[259].setRotationPoint(-35F, -22F, -9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[260].setRotationPoint(-35F, -22F, 9F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 70
		bodyModel[261].setRotationPoint(-23F, -18F, -7F);

		bodyModel[262].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 72
		bodyModel[262].setRotationPoint(-34F, -18F, 10F);

		bodyModel[263].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 190
		bodyModel[263].setRotationPoint(-34F, -18F, -11F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 13, 22, 0F); // Box 313
		bodyModel[264].setRotationPoint(-35F, -18F, -11F);

		bodyModel[265].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[265].setRotationPoint(-22.5F, -18F, 10.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[266].setRotationPoint(-35F, -21F, -9F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[267].setRotationPoint(-23F, -21F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[268].setRotationPoint(-35F, -22F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[269].setRotationPoint(-38F, -22F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[270].setRotationPoint(-37F, -22F, -6F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[271].setRotationPoint(-37F, -22F, 1F);

		bodyModel[272].addShapeBox(0F, -1F, 0F, 4, 13, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[272].setRotationPoint(-39.5F, -13F, 2F);

		bodyModel[273].addShapeBox(0F, -1F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[273].setRotationPoint(-39.5F, -13F, -2F);

		bodyModel[274].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 52 door swing right cab front
		bodyModel[274].setRotationPoint(-38.5F, -13F, -1.5F);

		bodyModel[275].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[275].setRotationPoint(-39.65F, -12.7F, -7F);
		bodyModel[275].rotateAngleY = 0.36651914F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[276].setRotationPoint(-39.65F, -12.7F, 7F);
		bodyModel[276].rotateAngleY = -0.36651914F;

		bodyModel[277].addBox(0F, 0F, 0F, 2, 17, 14, 0F); // Box 350
		bodyModel[277].setRotationPoint(-22F, -22F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[278].setRotationPoint(-37.6F, -22F, -1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[279].setRotationPoint(-37.6F, -20F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, -5.1F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 117 numberboard
		bodyModel[280].setRotationPoint(-37.05F, -21F, -1F);
		bodyModel[280].rotateAngleY = 0.37524579F;

		bodyModel[281].addShapeBox(0F, 0F, 0.35F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[281].setRotationPoint(-37.05F, -21F, 1F);
		bodyModel[281].rotateAngleY = -0.37524579F;

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[282].setRotationPoint(-34F, -23.5F, -7F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[283].setRotationPoint(-33F, -23.25F, -6F);

		bodyModel[284].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[284].setRotationPoint(-33.5F, -23.25F, -8F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[285].setRotationPoint(-31.5F, -22.5F, -7F);

		bodyModel[286].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[286].setRotationPoint(-32.5F, -24.5F, -7.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[287].setRotationPoint(-32.5F, -24.5F, -6.25F);

		bodyModel[288].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[288].setRotationPoint(-37.75F, -24F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front BLOCK R
		bodyModel[289].setRotationPoint(-38.35F, -23.95F, -2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front BLOCK L
		bodyModel[290].setRotationPoint(-38.35F, -23.95F, 0F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[291].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[292].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[293].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[294].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[295].setRotationPoint(-34F, -23F, 6.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[296].setRotationPoint(-36F, -23.5F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[297].setRotationPoint(-36F, -23.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[298].setRotationPoint(-36F, -23.5F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[299].setRotationPoint(-36F, -23.5F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[300].setRotationPoint(-36F, -23F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[301].setRotationPoint(-33F, -23.5F, -4F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[302].setRotationPoint(-26F, -23F, -0.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[303].setRotationPoint(-26F, -24F, -0.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 419 cull atsf bit
		bodyModel[304].setRotationPoint(-24F, -23F, 3.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[305].setRotationPoint(-24F, -24F, 5F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[306].setRotationPoint(-35.75F, -23.75F, 4.75F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[307].setRotationPoint(-34.5F, -22.75F, 4.25F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[308].setRotationPoint(-34.5F, -23.75F, 3.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 486 rail for crab signal
		bodyModel[309].setRotationPoint(-11F, -13F, -11.01F);

		bodyModel[310].addBox(0F, 0F, 0F, 9, 0, 4, 0F); // Box 487 crab walkway
		bodyModel[310].setRotationPoint(-20F, -5F, -11F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 488 crab support
		bodyModel[311].setRotationPoint(-14F, -5F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 489 crab step
		bodyModel[312].setRotationPoint(-11F, -3F, -11F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[313].setRotationPoint(-39.25F, -12F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[314].setRotationPoint(-39.35F, -12F, -1F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[315].setRotationPoint(-39.35F, -10F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[316].setRotationPoint(-29F, -23F, 7.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[317].setRotationPoint(-29F, -24F, 7.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[318].setRotationPoint(-29F, -23F, -8.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[319].setRotationPoint(-29F, -24F, -8.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[320].setRotationPoint(-24F, -23F, 0F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[321].setRotationPoint(-34F, -21F, 6F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[322].setRotationPoint(-34F, -21F, -9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[323].setRotationPoint(-39F, -9F, -10F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 328
		bodyModel[324].setRotationPoint(-38.99F, -1F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[325].setRotationPoint(-39F, -9F, 11F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 330
		bodyModel[326].setRotationPoint(-38.99F, -1F, 10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 331 air intake u18bwh
		bodyModel[327].setRotationPoint(-8F, -16.5F, -7.15F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 332 air intake u18bwh
		bodyModel[328].setRotationPoint(-10.5F, -16.5F, -7.15F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 333 air intake u18bwh
		bodyModel[329].setRotationPoint(-10.5F, -19F, -7.15F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 334 air intake u18bwh
		bodyModel[330].setRotationPoint(-10.5F, -19F, 6.15F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 335 air intake u18bwh
		bodyModel[331].setRotationPoint(-8F, -16.5F, 6.15F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 336 air intake u18bwh
		bodyModel[332].setRotationPoint(-10.5F, -16.5F, 6.15F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 337 u18bwh exhaust
		bodyModel[333].setRotationPoint(-17.5F, -21.5F, -1.5F);

		bodyModel[334].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 314 door swing left
		bodyModel[334].setRotationPoint(-22.5F, -18F, -10.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 red gyra amtk u18bwh
		bodyModel[335].setRotationPoint(-37.75F, -21F, -1F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[336].setRotationPoint(-37F, -23.5F, -1.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[337].setRotationPoint(-36F, -23.5F, -0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[338].setRotationPoint(-37F, -23.5F, 0.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[339].setRotationPoint(-35.5F, -22.5F, -0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[340].setRotationPoint(-44.01F, 6F, -8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[341].setRotationPoint(-44.01F, 6F, 0F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[342].setRotationPoint(-43F, -1F, 3F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[343].setRotationPoint(-43F, -1F, -6F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[344].setRotationPoint(-43F, -1F, -2.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[345].setRotationPoint(-43.25F, -1F, -2.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[346].setRotationPoint(-42.5F, -1.25F, -5F);
		bodyModel[346].rotateAngleY = 0.27925268F;

		bodyModel[347].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[347].setRotationPoint(-42.5F, -1.25F, 5F);
		bodyModel[347].rotateAngleY = -0.27925268F;

		bodyModel[348].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[348].setRotationPoint(-26F, -23.5F, -2.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[349].setRotationPoint(-25F, -24.5F, 0F);

		bodyModel[350].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[350].setRotationPoint(3.5F, -23.5F, -7F);

		bodyModel[351].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 356
		bodyModel[351].setRotationPoint(4.5F, -23.5F, -5.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[352].setRotationPoint(-33F, -18F, -11F);
		bodyModel[352].rotateAngleX = -0.61086524F;

		bodyModel[353].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[353].setRotationPoint(-31F, -16F, -11F);
		bodyModel[353].rotateAngleY = 0.52359878F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[354].setRotationPoint(-31F, -17F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[355].setRotationPoint(-31F, -18F, 10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[356].setRotationPoint(-33F, -18F, 11F);
		bodyModel[356].rotateAngleX = 0.61086524F;

		bodyModel[357].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[357].setRotationPoint(-31F, -17.25F, 3F);
		bodyModel[357].rotateAngleY = 0.78539816F;

		bodyModel[358].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[358].setRotationPoint(-31F, -17.25F, 3F);
		bodyModel[358].rotateAngleY = 0.78539816F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[359].setRotationPoint(-34F, -20F, -0.5F);
		bodyModel[359].rotateAngleY = 0.43633231F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[360].setRotationPoint(-35F, -14F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[361].setRotationPoint(-35F, -14F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[362].setRotationPoint(-39.5F, -14.25F, -7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 364
		bodyModel[363].setRotationPoint(-39.5F, -14.25F, 5F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 365
		bodyModel[364].setRotationPoint(-34.5F, -22.75F, -4.75F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 366
		bodyModel[365].setRotationPoint(-34.5F, -23.75F, -4.25F);

		bodyModel[366].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 367
		bodyModel[366].setRotationPoint(-35.75F, -23.75F, -5.25F);
	}

	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 0324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 19324){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 ||GetColor(entity) == 9){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 17546){
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