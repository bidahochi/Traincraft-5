//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U30B(H)
// Model Creator: Bidahochi
// Created on: 15.07.2021 - 18:10:46
// Last changed on: 15.07.2021 - 18:10:46

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.Modelu30bh_details_crl;
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
import train.common.library.Info;

public class ModelU30BH extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU30BH() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[325];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[12] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[14] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[15] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[16] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[17] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[18] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[19] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[20] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[21] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[22] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[23] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[24] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[25] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[26] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[27] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[28] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[29] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[30] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[31] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[32] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[33] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[34] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[35] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[36] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[37] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[38] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[40] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[41] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[42] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[43] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[44] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[45] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[46] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[47] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[48] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[49] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[50] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[51] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[53] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[54] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[55] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[56] = new ModelRendererTurbo(this, 112, 145, textureX, textureY); // Box 205
		bodyModel[57] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[58] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[60] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[62] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[63] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[64] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[65] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[66] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[67] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[68] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[69] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[70] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[71] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[72] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[73] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[75] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[76] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[77] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[78] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[79] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[80] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[81] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[82] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[83] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[84] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[85] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[86] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[87] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[88] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[89] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[90] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[91] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 300
		bodyModel[92] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Box 301
		bodyModel[93] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[94] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[95] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[96] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[97] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[98] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[99] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[100] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[101] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[102] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[103] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[104] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[105] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[106] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[107] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[108] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[109] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[110] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[111] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[112] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[113] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[114] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[115] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[116] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[117] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[118] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[119] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[120] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[121] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[122] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[123] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[124] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[125] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[126] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[127] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[128] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[129] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[130] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[131] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[132] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[133] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[134] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[135] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[136] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[137] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[138] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[139] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[140] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[141] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[142] = new ModelRendererTurbo(this, 246, 68, textureX, textureY); // Box 21
		bodyModel[143] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[144] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[145] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[146] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[147] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[148] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[149] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[150] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[151] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[152] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[153] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[154] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[155] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[156] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[157] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[158] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[159] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[160] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[161] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[162] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[163] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[164] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[165] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[166] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[167] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[168] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[169] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[170] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[171] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[172] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[173] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[174] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[175] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[176] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[177] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[178] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[179] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[180] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[181] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[182] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[183] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[184] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[185] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[186] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[187] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[188] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[189] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[190] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[191] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[192] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[193] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[194] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[195] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[196] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[197] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[198] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[199] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[200] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[201] = new ModelRendererTurbo(this, 176, 16, textureX, textureY); // Box 401
		bodyModel[202] = new ModelRendererTurbo(this, 173, 15, textureX, textureY); // Box 402
		bodyModel[203] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[204] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[205] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[206] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[207] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[208] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[209] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[210] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[211] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[212] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[213] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[214] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[215] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[216] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[217] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[218] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[219] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[220] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[221] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[222] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[223] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[224] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[225] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[226] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[227] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[228] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[229] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[230] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[231] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[232] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[233] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[234] = new ModelRendererTurbo(this, 112, 106, textureX, textureY); // Box 279
		bodyModel[235] = new ModelRendererTurbo(this, 416, 118, textureX, textureY); // Box 280
		bodyModel[236] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[237] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[238] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[239] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[240] = new ModelRendererTurbo(this, 143, 101, textureX, textureY); // Box 790 cab signalling
		bodyModel[241] = new ModelRendererTurbo(this, 184, 99, textureX, textureY); // Box 791 u30bh bit
		bodyModel[242] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[243] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[244] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[245] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[246] = new ModelRendererTurbo(this, 12, 86, textureX, textureY, "lamp"); // Box 401 schnoz gyra
		bodyModel[247] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[248] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[249] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[250] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[251] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[252] = new ModelRendererTurbo(this, 303, 204, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[253] = new ModelRendererTurbo(this, 257, 197, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[254] = new ModelRendererTurbo(this, 251, 218, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[255] = new ModelRendererTurbo(this, 303, 219, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[256] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[257] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[258] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[259] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[260] = new ModelRendererTurbo(this, 304, 229, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[261] = new ModelRendererTurbo(this, 10, 101, textureX, textureY, "cull"); // Box 316 cull nose handrail
		bodyModel[262] = new ModelRendererTurbo(this, 8, 96, textureX, textureY, "cull"); // Box 318 cull nose handrail
		bodyModel[263] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[264] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[265] = new ModelRendererTurbo(this, 97, 103, textureX, textureY); // Box 410
		bodyModel[266] = new ModelRendererTurbo(this, 445, 119, textureX, textureY); // Box 256
		bodyModel[267] = new ModelRendererTurbo(this, 155, 131, textureX, textureY); // Box 63
		bodyModel[268] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[269] = new ModelRendererTurbo(this, 152, 146, textureX, textureY); // Box 196
		bodyModel[270] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[271] = new ModelRendererTurbo(this, 101, 125, textureX, textureY); // box65
		bodyModel[272] = new ModelRendererTurbo(this, 155, 145, textureX, textureY); // Box 2603
		bodyModel[273] = new ModelRendererTurbo(this, 146, 146, textureX, textureY); // Box 261
		bodyModel[274] = new ModelRendererTurbo(this, 142, 124, textureX, textureY); // Box 298
		bodyModel[275] = new ModelRendererTurbo(this, 94, 124, textureX, textureY); // Box 299
		bodyModel[276] = new ModelRendererTurbo(this, 90, 115, textureX, textureY); // Box 410
		bodyModel[277] = new ModelRendererTurbo(this, 90, 124, textureX, textureY); // Box 310
		bodyModel[278] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 250
		bodyModel[279] = new ModelRendererTurbo(this, 80, 122, textureX, textureY); // Box 81
		bodyModel[280] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 81
		bodyModel[281] = new ModelRendererTurbo(this, 77, 125, textureX, textureY); // Box 275
		bodyModel[282] = new ModelRendererTurbo(this, 77, 123, textureX, textureY); // Box 276
		bodyModel[283] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[284] = new ModelRendererTurbo(this, 442, 140, textureX, textureY); // Box 300
		bodyModel[285] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 301
		bodyModel[286] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[287] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[288] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[289] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[290] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[291] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[292] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // Box 48 ph2 headlight
		bodyModel[293] = new ModelRendererTurbo(this, 9, 106, textureX, textureY, "lamp"); // Box 186 Headlight Front up ph2
		bodyModel[294] = new ModelRendererTurbo(this, 9, 111, textureX, textureY, "lamp"); // Box 187 Headlight Front down ph2
		bodyModel[295] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 133 ph2 headlight
		bodyModel[296] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 187 ph2 headlight
		bodyModel[297] = new ModelRendererTurbo(this, 127, 71, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[298] = new ModelRendererTurbo(this, 129, 66, textureX, textureY); // Box 5
		bodyModel[299] = new ModelRendererTurbo(this, 22, 190, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[300] = new ModelRendererTurbo(this, 12, 194, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[301] = new ModelRendererTurbo(this, 12, 189, textureX, textureY); // Box 307 spedo
		bodyModel[302] = new ModelRendererTurbo(this, 151, 100, textureX, textureY); // Box 429 u30bh bit
		bodyModel[303] = new ModelRendererTurbo(this, 153, 71, textureX, textureY, "cull"); // Box 339 cull pw beacon holdy
		bodyModel[304] = new ModelRendererTurbo(this, 160, 71, textureX, textureY, "cull"); // Box 340 cull pw beacon holdy
		bodyModel[305] = new ModelRendererTurbo(this, 161, 67, textureX, textureY, "commander"); // Box 410 commander beacon pw
		bodyModel[306] = new ModelRendererTurbo(this, 154, 67, textureX, textureY, "commander"); // Box 342 commander beacon pw
		bodyModel[307] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[308] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[309] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[310] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[311] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[312] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull fncc beacon holder
		bodyModel[313] = new ModelRendererTurbo(this, 128, 64, textureX, textureY); // Box 785 sinclair fncc2
		bodyModel[314] = new ModelRendererTurbo(this, 136, 28, textureX, textureY); // Box 184 o2 generator
		bodyModel[315] = new ModelRendererTurbo(this, 127, 56, textureX, textureY, "cull"); // Box 418 cull platform fncc
		bodyModel[316] = new ModelRendererTurbo(this, 134, 64, textureX, textureY); // Box 308 sinclair fncc
		bodyModel[317] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786 horn
		bodyModel[318] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787 horn
		bodyModel[319] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788 horn
		bodyModel[320] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789 horn
		bodyModel[321] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354 horn pick 9502
		bodyModel[322] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355 horn pick 9502
		bodyModel[323] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356 horn pick 9502
		bodyModel[324] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357 horn pick 9502

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[2].setRotationPoint(-20F, -20F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[3].setRotationPoint(-32F, -18F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-42F, -1F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-9F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[6].setRotationPoint(10F, 4F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[7].setRotationPoint(-32F, -18F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[8].setRotationPoint(-21F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[9].setRotationPoint(-33F, -18F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[10].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[11].setRotationPoint(-33F, -21F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[12].setRotationPoint(-33F, -21F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[13].setRotationPoint(-21F, -21F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[14].setRotationPoint(-33F, -21F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[15].setRotationPoint(38F, -21F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[16].setRotationPoint(38F, -21F, 1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[17].setRotationPoint(38F, -21F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[18].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[19].setRotationPoint(-9F, 5F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[20].setRotationPoint(-9F, 5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[21].setRotationPoint(-32F, -22F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[22].setRotationPoint(-33F, -22F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[23].setRotationPoint(-21F, -22F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[24].setRotationPoint(-33F, -22F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[25].setRotationPoint(-21F, -22F, 1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[26].setRotationPoint(-21F, -21F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[27].setRotationPoint(-21F, -21F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[28].setRotationPoint(-32F, -22F, 1F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[29].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[30].setRotationPoint(-42F, 8F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[31].setRotationPoint(-42F, -1F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[32].setRotationPoint(-42F, 2F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[33].setRotationPoint(-42F, -1F, -8F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[34].setRotationPoint(-42F, 2F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[35].setRotationPoint(-42F, 8F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[36].setRotationPoint(38F, -1F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[37].setRotationPoint(38F, 7F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[38].setRotationPoint(38F, 7F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[39].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[40].setRotationPoint(-38F, 1F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[41].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[42].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[43].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[44].setRotationPoint(-20F, -13F, 11F);

		bodyModel[45].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[45].setRotationPoint(-5F, -9F, 11F);

		bodyModel[46].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[46].setRotationPoint(-20F, -13F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[47].setRotationPoint(-5F, -9F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[48].setRotationPoint(39F, -9F, -11F);

		bodyModel[49].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[49].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[49].rotateAngleZ = -0.10471976F;

		bodyModel[50].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[50].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[51].setRotationPoint(-11F, 4F, -9F);

		bodyModel[52].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[52].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[52].rotateAngleZ = 0.10471976F;

		bodyModel[53].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[53].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[53].rotateAngleZ = -0.2268928F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[54].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[55].setRotationPoint(42F, -1F, -6.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[56].setRotationPoint(-44F, 8F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[57].setRotationPoint(42F, 8F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[58].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[59].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[60].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[61].setRotationPoint(36F, 1F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[62].setRotationPoint(38F, -1F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[63].setRotationPoint(-42F, 1F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[64].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[65].setRotationPoint(37F, 1F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[66].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[67].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[68].setRotationPoint(42.25F, -1F, -6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[69].setRotationPoint(-39.35F, -13.7F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[70].setRotationPoint(-39.35F, -13.7F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[71].setRotationPoint(38.1F, -16F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[72].setRotationPoint(38.1F, -18F, -1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[73].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[74].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[75].setRotationPoint(36F, 1F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[76].setRotationPoint(38F, -1F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[77].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[78].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[79].setRotationPoint(39F, -9F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[80].setRotationPoint(-20F, -21F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[81].setRotationPoint(-20F, -21F, 3F);

		bodyModel[82].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[82].setRotationPoint(-20F, -21F, -3F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[83].setRotationPoint(36F, -23.5F, 3.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[84].setRotationPoint(37.5F, -22.75F, 2.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[85].setRotationPoint(36.5F, -23.5F, 1.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[86].setRotationPoint(36F, -23.75F, 2.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[87].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[88].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[89].setRotationPoint(-38F, -13F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[90].setRotationPoint(-38F, -14F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[91].setRotationPoint(-38F, -14F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[92].setRotationPoint(-38F, -14F, 1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[93].setRotationPoint(-39F, -13F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[94].setRotationPoint(-39F, -13F, 1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[95].setRotationPoint(-39F, -13F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[96].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[97].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[98].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[98].setRotationPoint(-33F, -22F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[99].setRotationPoint(9F, 3F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[100].setRotationPoint(-12F, 3F, -6F);

		bodyModel[101].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[101].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[102].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[102].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[103].setRotationPoint(37.85F, -14F, -7F);
		bodyModel[103].rotateAngleY = -0.05235988F;

		bodyModel[104].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[104].setRotationPoint(37.85F, -14F, 7F);
		bodyModel[104].rotateAngleY = 0.05235988F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[105].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[106].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[106].setRotationPoint(-32F, 1F, 9F);
		bodyModel[106].rotateAngleZ = -0.27925268F;

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[107].setRotationPoint(-35F, 1F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[108].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[109].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[109].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[110].setRotationPoint(-42F, 6F, -8F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[111].setRotationPoint(-42F, 6F, 8F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[112].setRotationPoint(39F, 6F, 8F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[113].setRotationPoint(39F, 6F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[114].setRotationPoint(42F, -1F, 4.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[115].setRotationPoint(42.25F, -1F, 4.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[116].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[117].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[118].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[119].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[120].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[121].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[122].setRotationPoint(39F, 8F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[123].setRotationPoint(39F, 2F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[124].setRotationPoint(39F, -1F, -8F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[125].setRotationPoint(39F, 8F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[126].setRotationPoint(39F, 2F, 7F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[127].setRotationPoint(39F, -1F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[128].setRotationPoint(-32F, -23.25F, 3.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[129].setRotationPoint(4.5F, -21.5F, -6.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[130].setRotationPoint(3F, -22.25F, -5.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[131].setRotationPoint(2F, -22.5F, -6.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[132].setRotationPoint(3.5F, -22.25F, -7.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[133].setRotationPoint(17F, -21F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[134].setRotationPoint(17F, -22F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[135].setRotationPoint(17F, -22F, -8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[136].setRotationPoint(17F, -22F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[137].setRotationPoint(37F, -22F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[138].setRotationPoint(38F, -22F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[139].setRotationPoint(38F, -22F, 1F);

		bodyModel[140].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[140].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[141].setRotationPoint(12.5F, -22.5F, -2.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[142].setRotationPoint(12F, -21.5F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[143].setRotationPoint(37.8F, -20F, -7.5F);
		bodyModel[143].rotateAngleY = -0.05235988F;

		bodyModel[144].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[144].setRotationPoint(37.8F, -20F, 7.5F);
		bodyModel[144].rotateAngleY = 0.05235988F;

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[145].setRotationPoint(38.75F, -20.25F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[146].setRotationPoint(39.5F, -20.2F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[147].setRotationPoint(39.5F, -20.2F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[148].setRotationPoint(42F, -1F, -7F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[149].setRotationPoint(42F, -9F, -2F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[150].setRotationPoint(42F, -9F, 2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[151].setRotationPoint(42F, -1F, 2F);

		bodyModel[152].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[152].setRotationPoint(42F, -1F, 2F);
		bodyModel[152].rotateAngleY = -3.14159265F;
		bodyModel[152].rotateAngleZ = -1.48352986F;

		bodyModel[153].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[153].setRotationPoint(-42F, -1F, -2F);
		bodyModel[153].rotateAngleZ = -1.48352986F;

		bodyModel[154].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[154].setRotationPoint(-43F, -9F, -2F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[155].setRotationPoint(-43F, -9F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[156].setRotationPoint(-43F, -1F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[157].setRotationPoint(-43F, -1F, 2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[158].setRotationPoint(-31F, -18F, -11F);
		bodyModel[158].rotateAngleX = -0.61086524F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[159].setRotationPoint(-29F, -17F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[160].setRotationPoint(-29F, -18F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[161].setRotationPoint(-31F, -18F, 11F);
		bodyModel[161].rotateAngleX = 0.61086524F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[162].setRotationPoint(-46F, 7F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[163].setRotationPoint(-46F, 7F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[164].setRotationPoint(-45F, 6F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[165].setRotationPoint(-45F, 5F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[166].setRotationPoint(-45F, 6F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[167].setRotationPoint(-45F, 5F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[168].setRotationPoint(-45F, 4F, 2F);

		bodyModel[169].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[169].setRotationPoint(-45F, 4F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[170].setRotationPoint(44F, 6F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[171].setRotationPoint(44F, 6F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[172].setRotationPoint(45F, 7F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[173].setRotationPoint(45F, 7F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[174].setRotationPoint(44F, 5F, 2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[175].setRotationPoint(44F, 4F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[176].setRotationPoint(44F, 5F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[177].setRotationPoint(44F, 4F, -8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[178].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[179].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[180].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[181].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[182].setRotationPoint(30.5F, -6F, 7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[183].setRotationPoint(27F, -6F, 7F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[184].setRotationPoint(-42F, 5F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[185].setRotationPoint(-42F, 5F, -10F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[186].setRotationPoint(39F, 5F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[187].setRotationPoint(39F, 5F, 8F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[188].setRotationPoint(39F, 4F, 8F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[189].setRotationPoint(-42F, 4F, 8F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[190].setRotationPoint(-42F, 4F, -8F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[191].setRotationPoint(39F, 4F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[192].setRotationPoint(-12F, 5F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[193].setRotationPoint(-10F, 5F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[194].setRotationPoint(9F, 5F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[195].setRotationPoint(11F, 5F, -9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[196].setRotationPoint(26.75F, -14F, 7.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[197].setRotationPoint(24F, -14F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[198].setRotationPoint(21F, -14F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[199].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[200].setRotationPoint(-22.5F, -21F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[201].setRotationPoint(-33F, -23.25F, -4.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[202].setRotationPoint(-32F, -23.25F, -4.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[203].setRotationPoint(38.3F, -18F, -6.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[204].setRotationPoint(38.3F, -18F, 1.25F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[205].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[206].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[207].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[208].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[209].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[210].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[211].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[212].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[213].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[214].setRotationPoint(-38F, 1F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[215].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[216].setRotationPoint(-23F, -13F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[217].setRotationPoint(24F, -14F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[218].setRotationPoint(26.75F, -14F, -8.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[219].setRotationPoint(21F, -14F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[220].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[221].setRotationPoint(-25.8F, -15F, 1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[222].setRotationPoint(-32.5F, -13F, 3F);
		bodyModel[222].rotateAngleY = -0.45378561F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[223].setRotationPoint(-32.5F, -15F, 3F);
		bodyModel[223].rotateAngleY = -0.45378561F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[224].setRotationPoint(-32.5F, -9F, 3F);
		bodyModel[224].rotateAngleY = -0.45378561F;

		bodyModel[225].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[225].setRotationPoint(-32F, -18F, 6.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[226].setRotationPoint(27F, -6F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[227].setRotationPoint(30.5F, -6F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[228].setRotationPoint(18F, -22.51F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[229].setRotationPoint(18F, -22.51F, -15F);

		bodyModel[230].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[230].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[230].rotateAngleX = 1.57079633F;

		bodyModel[231].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[231].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[231].rotateAngleX = -1.57079633F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[232].setRotationPoint(-32F, -19F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[233].setRotationPoint(-32F, -19F, 7F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279
		bodyModel[234].setRotationPoint(-43F, -1F, -2F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280
		bodyModel[235].setRotationPoint(42F, -1F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[236].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[237].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[238].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[239].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 790 cab signalling
		bodyModel[240].setRotationPoint(-17F, -9F, -11F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 791 u30bh bit
		bodyModel[241].setRotationPoint(-20F, -7F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[242].setRotationPoint(-45F, 6F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[243].setRotationPoint(-45F, 6F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[244].setRotationPoint(44F, 6F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[245].setRotationPoint(44F, 6F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 schnoz gyra
		bodyModel[246].setRotationPoint(-39F, -13.7F, -1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[247].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[248].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[248].setRotationPoint(-34.05F, -21F, -1.5F);
		bodyModel[248].rotateAngleY = 0.13089969F;

		bodyModel[249].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[249].setRotationPoint(-34.05F, -21F, 1F);
		bodyModel[249].rotateAngleY = -0.13089969F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[250].setRotationPoint(-34F, -21F, -6.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[251].setRotationPoint(-34F, -21F, 1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[252].setRotationPoint(-7F, 5F, -11F);

		bodyModel[253].addBox(0F, 0F, 0F, 14, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[253].setRotationPoint(-7F, 5F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 14, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[254].setRotationPoint(-7F, 2F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[255].setRotationPoint(-7F, 5F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[256].setRotationPoint(-9F, 3F, -5.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[257].setRotationPoint(-9F, 3F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[258].setRotationPoint(7F, 3F, -5.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[259].setRotationPoint(7F, 3F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[260].setRotationPoint(7F, 1.5F, -9.01F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316 cull nose handrail
		bodyModel[261].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318 cull nose handrail
		bodyModel[262].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[263].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[263].setRotationPoint(-36F, -5F, -11F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[264].setRotationPoint(-37F, -5F, 7F);

		bodyModel[265].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 410
		bodyModel[265].setRotationPoint(-42.01F, -9F, -11F);

		bodyModel[266].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 256
		bodyModel[266].setRotationPoint(42.01F, -9F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[267].setRotationPoint(-38F, 2F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[268].setRotationPoint(-39F, -1F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[269].setRotationPoint(-39F, 7F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[270].setRotationPoint(-39F, 7F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[271].setRotationPoint(-42F, 8F, -9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[272].setRotationPoint(-38F, 1F, 7F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[273].setRotationPoint(-39F, -1F, 7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[274].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[275].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[276].setRotationPoint(-38F, -13F, 11F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[277].setRotationPoint(-39F, -13F, 11F);

		bodyModel[278].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[278].setRotationPoint(-39F, -13F, -11F);

		bodyModel[279].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[279].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[280].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[281].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[282].setRotationPoint(-39F, -13F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[283].setRotationPoint(42F, 8F, -9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[284].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[285].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[286].setRotationPoint(-37F, -3F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[287].setRotationPoint(-37F, -5F, -11F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[288].setRotationPoint(-11F, -3F, -10F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[289].setRotationPoint(-11F, -3F, 7F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[290].setRotationPoint(-11F, -5F, -11F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[291].setRotationPoint(-11F, -5F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48 ph2 headlight
		bodyModel[292].setRotationPoint(-34F, -21.75F, -1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up ph2
		bodyModel[293].setRotationPoint(-34.1F, -21.85F, -1F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down ph2
		bodyModel[294].setRotationPoint(-34.1F, -19.95F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133 ph2 headlight
		bodyModel[295].setRotationPoint(-34F, -18.25F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 ph2 headlight
		bodyModel[296].setRotationPoint(-34F, -22.5F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[297].setRotationPoint(-29F, -17F, -15F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[298].setRotationPoint(-29F, -18F, -13F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[299].setRotationPoint(-32F, -20.5F, -0.5F);
		bodyModel[299].rotateAngleY = 0.43633231F;

		bodyModel[300].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[300].setRotationPoint(-29F, -17.25F, 3F);
		bodyModel[300].rotateAngleY = 0.78539816F;

		bodyModel[301].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[301].setRotationPoint(-29F, -17.25F, 3F);
		bodyModel[301].rotateAngleY = 0.78539816F;

		bodyModel[302].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 429 u30bh bit
		bodyModel[302].setRotationPoint(-18F, -21.25F, -5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 339 cull pw beacon holdy
		bodyModel[303].setRotationPoint(-31F, -21F, 7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 cull pw beacon holdy
		bodyModel[304].setRotationPoint(-31F, -21F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon pw
		bodyModel[305].setRotationPoint(-31F, -22.75F, -8.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon pw
		bodyModel[306].setRotationPoint(-31F, -22.75F, 7.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[307].setRotationPoint(-34F, -23.75F, -1F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[308].setRotationPoint(-34F, -24.25F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[309].setRotationPoint(-34F, -24.25F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[310].setRotationPoint(-34F, -24.25F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[311].setRotationPoint(-34F, -24.25F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull fncc beacon holder
		bodyModel[312].setRotationPoint(-34F, -22.75F, -1.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785 sinclair fncc2
		bodyModel[313].setRotationPoint(-23F, -24F, -2F);

		bodyModel[314].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[314].setRotationPoint(-30.5F, -23F, -4F);

		bodyModel[315].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform fncc
		bodyModel[315].setRotationPoint(-25.1F, -23F, -2.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308 sinclair fncc
		bodyModel[316].setRotationPoint(-24.1F, -24F, 0F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 786 horn
		bodyModel[317].setRotationPoint(-16.5F, -22.5F, -4.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787 horn
		bodyModel[318].setRotationPoint(-17F, -23.25F, -3.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788 horn
		bodyModel[319].setRotationPoint(-19F, -23.5F, -4.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789 horn
		bodyModel[320].setRotationPoint(-18F, -23.25F, -5.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354 horn pick 9502
		bodyModel[321].setRotationPoint(-35F, -23F, -6.25F);

		bodyModel[322].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355 horn pick 9502
		bodyModel[322].setRotationPoint(-34F, -22.75F, -5.25F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356 horn pick 9502
		bodyModel[323].setRotationPoint(-34.5F, -22.75F, -7.25F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357 horn pick 9502
		bodyModel[324].setRotationPoint(-32.5F, -22F, -6.25F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();
	Modelu30bh_details_crl crldeets = new Modelu30bh_details_crl();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 567) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_nocta.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 5){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1721){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 17 ||GetColor(entity) == 18 ||
				GetColor(entity) == 19){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/U30BH_/u30bh_details_crl.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0, 0, 0);
			crldeets.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}
//wowie