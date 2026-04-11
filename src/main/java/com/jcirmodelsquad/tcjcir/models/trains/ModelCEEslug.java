//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: u23b slug thing
// Model Creator: 
// Created on: 26.03.2024 - 18:47:38
// Last changed on: 26.03.2024 - 18:47:38

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

public class ModelCEEslug extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCEEslug() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[352];

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
		bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 217, 102, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 183, 102, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[25] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[32] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[33] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[34] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[35] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[36] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[39] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[40] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[41] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[42] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[43] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[44] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[45] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[46] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[47] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[48] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[49] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[50] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[51] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[53] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[54] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[58] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[59] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[60] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[61] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[62] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[63] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[64] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[65] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[66] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[67] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[68] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[69] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[70] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[71] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[72] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[74] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[75] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[77] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 electrical locker
		bodyModel[78] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[79] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[80] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[81] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[82] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[83] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[84] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[85] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[86] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[87] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[88] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f2
		bodyModel[89] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[90] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[91] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[92] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[93] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[95] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[96] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[97] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[98] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[99] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[100] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[101] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[102] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[103] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[104] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[105] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[106] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[107] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[108] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 300
		bodyModel[109] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Box 301
		bodyModel[110] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[111] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[112] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[113] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[114] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[115] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[116] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[117] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[118] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[119] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[120] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[121] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[122] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[123] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[124] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[125] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[126] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[127] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[128] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[129] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[130] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[131] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[132] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[133] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[134] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[135] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[136] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[137] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427
		bodyModel[138] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428
		bodyModel[139] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429
		bodyModel[140] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430
		bodyModel[141] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[142] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[143] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[144] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[145] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[146] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[147] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[148] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[149] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[150] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[151] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[152] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[153] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 330
		bodyModel[154] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[155] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[156] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[157] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[158] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[159] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[160] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[161] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[162] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[163] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[164] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[165] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[166] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[167] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[168] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[169] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[170] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[171] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[172] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[173] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[174] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[175] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[176] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[178] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[179] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[180] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[181] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[182] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[183] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[184] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[185] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[186] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[187] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[188] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[189] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[190] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[191] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[192] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[193] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[194] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[195] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[196] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[197] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[198] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[199] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[200] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[201] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[202] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[204] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[205] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[206] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[207] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[208] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[209] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[210] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[211] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245
		bodyModel[212] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[213] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[214] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[215] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[216] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[217] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[218] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[219] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[220] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[221] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[222] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[223] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[224] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[225] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[226] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[227] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 206 early stairwell pillar
		bodyModel[228] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 207 early stairwell pillar
		bodyModel[229] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 217 early stairwell pillar
		bodyModel[230] = new ModelRendererTurbo(this, 435, 106, textureX, textureY); // Box 221 early stairwell pillar
		bodyModel[231] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[232] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[233] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[234] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[235] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[236] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[237] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[238] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[239] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[240] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 410
		bodyModel[241] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[242] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 81
		bodyModel[243] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[244] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[245] = new ModelRendererTurbo(this, 95, 95, textureX, textureY); // Box 250
		bodyModel[246] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[247] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[248] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[249] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[250] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[251] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[252] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[253] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[254] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[255] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[256] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[257] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[258] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[259] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[260] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[261] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[262] = new ModelRendererTurbo(this, 173, 7, textureX, textureY); // Box 409 commander base
		bodyModel[263] = new ModelRendererTurbo(this, 173, 3, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[264] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[265] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[266] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[267] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[268] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[269] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[270] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[271] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[272] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[273] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[274] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[275] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[276] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[277] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[278] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[279] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[280] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[281] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[282] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[283] = new ModelRendererTurbo(this, 414, 109, textureX, textureY); // Box 324
		bodyModel[284] = new ModelRendererTurbo(this, 414, 125, textureX, textureY); // Box 327
		bodyModel[285] = new ModelRendererTurbo(this, 68, 121, textureX, textureY); // Box 302
		bodyModel[286] = new ModelRendererTurbo(this, 84, 121, textureX, textureY); // Box 303
		bodyModel[287] = new ModelRendererTurbo(this, 78, 120, textureX, textureY); // Box 279
		bodyModel[288] = new ModelRendererTurbo(this, 416, 118, textureX, textureY); // Box 280
		bodyModel[289] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[290] = new ModelRendererTurbo(this, 87, 115, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[291] = new ModelRendererTurbo(this, 413, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[292] = new ModelRendererTurbo(this, 424, 126, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[293] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[294] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[295] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[296] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[297] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[298] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[299] = new ModelRendererTurbo(this, 12, 86, textureX, textureY, "lamp"); // Box 401 schnoz gyra
		bodyModel[300] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[301] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[302] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[303] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[304] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[305] = new ModelRendererTurbo(this, 437, 78, textureX, textureY); // Box 430 early nonsense
		bodyModel[306] = new ModelRendererTurbo(this, 437, 74, textureX, textureY); // Box 431 early nonsense
		bodyModel[307] = new ModelRendererTurbo(this, 303, 204, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[308] = new ModelRendererTurbo(this, 257, 197, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[309] = new ModelRendererTurbo(this, 251, 218, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[310] = new ModelRendererTurbo(this, 303, 219, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[311] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[312] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[313] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[314] = new ModelRendererTurbo(this, 305, 198, textureX, textureY); // Box 296 fuel tank smol support
		bodyModel[315] = new ModelRendererTurbo(this, 304, 229, textureX, textureY); // Box 421 engineroom oil drain small tank
		bodyModel[316] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[317] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[318] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[319] = new ModelRendererTurbo(this, 183, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[320] = new ModelRendererTurbo(this, 183, 59, textureX, textureY); // Box 428 prime base
		bodyModel[321] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[322] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull sp beacon holder
		bodyModel[323] = new ModelRendererTurbo(this, 174, 29, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[324] = new ModelRendererTurbo(this, 193, 29, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[325] = new ModelRendererTurbo(this, 178, 27, textureX, textureY); // Box 563
		bodyModel[326] = new ModelRendererTurbo(this, 197, 27, textureX, textureY); // Box 564
		bodyModel[327] = new ModelRendererTurbo(this, 152, 203, textureX, textureY); // box65 emd cab
		bodyModel[328] = new ModelRendererTurbo(this, 157, 242, textureX, textureY); // Box 224 emd cab
		bodyModel[329] = new ModelRendererTurbo(this, 107, 242, textureX, textureY); // Box 223 emd cab
		bodyModel[330] = new ModelRendererTurbo(this, 175, 213, textureX, textureY); // Box 221 emd cab
		bodyModel[331] = new ModelRendererTurbo(this, 192, 207, textureX, textureY); // Box 220 emd cab
		bodyModel[332] = new ModelRendererTurbo(this, 105, 224, textureX, textureY); // Box 219 emd cab
		bodyModel[333] = new ModelRendererTurbo(this, 156, 188, textureX, textureY, "lamp"); // Box 187 headlight front cab emd cab
		bodyModel[334] = new ModelRendererTurbo(this, 156, 188, textureX, textureY, "lamp"); // Box 186 headlight front cab emd cab
		bodyModel[335] = new ModelRendererTurbo(this, 152, 193, textureX, textureY); // Box 44 emd cab
		bodyModel[336] = new ModelRendererTurbo(this, 168, 193, textureX, textureY); // Box 43 emd cab
		bodyModel[337] = new ModelRendererTurbo(this, 163, 187, textureX, textureY); // Box 48 emd cab
		bodyModel[338] = new ModelRendererTurbo(this, 137, 224, textureX, textureY); // Box 211 emd cab
		bodyModel[339] = new ModelRendererTurbo(this, 98, 238, textureX, textureY); // Box 210 emd cab
		bodyModel[340] = new ModelRendererTurbo(this, 164, 238, textureX, textureY); // Box 11 emd cab
		bodyModel[341] = new ModelRendererTurbo(this, 140, 219, textureX, textureY); // Box 314 door swing right emd cab
		bodyModel[342] = new ModelRendererTurbo(this, 80, 205, textureX, textureY); // Box 313 emd cab
		bodyModel[343] = new ModelRendererTurbo(this, 101, 207, textureX, textureY); // Box 190 emd cab
		bodyModel[344] = new ModelRendererTurbo(this, 147, 207, textureX, textureY); // Box 72 emd cab
		bodyModel[345] = new ModelRendererTurbo(this, 154, 205, textureX, textureY); // Box 70 emd cab
		bodyModel[346] = new ModelRendererTurbo(this, 122, 219, textureX, textureY); // Box 52 door swing right emd cab
		bodyModel[347] = new ModelRendererTurbo(this, 144, 190, textureX, textureY, "lamp"); // Box 117 numberboard front emd cab
		bodyModel[348] = new ModelRendererTurbo(this, 144, 190, textureX, textureY, "lamp"); // Box 118 numberboard front emd cab
		bodyModel[349] = new ModelRendererTurbo(this, 163, 194, textureX, textureY); // Box 133 emd cab
		bodyModel[350] = new ModelRendererTurbo(this, 175, 205, textureX, textureY); // Box 360 emd cab
		bodyModel[351] = new ModelRendererTurbo(this, 104, 203, textureX, textureY); // box64 emd cab

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-20F, -20F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-32F, -18F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-42F, -1F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[6].setRotationPoint(-9F, 2F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(10F, 4F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[8].setRotationPoint(-32F, -18F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-33F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[10].setRotationPoint(-21F, -18F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[11].setRotationPoint(-33F, -18F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[12].setRotationPoint(-36F, -5F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[13].setRotationPoint(-37F, -3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[14].setRotationPoint(-37F, -5F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 35
		bodyModel[15].setRotationPoint(-20F, -5F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 36
		bodyModel[16].setRotationPoint(-20F, -5F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[17].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-38F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-33F, -21F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(-33F, -21F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[21].setRotationPoint(-21F, -21F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[22].setRotationPoint(-33F, -21F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[23].setRotationPoint(38F, -21F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[24].setRotationPoint(38F, -21F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(38F, -21F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[26].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-9F, 5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[28].setRotationPoint(-9F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[29].setRotationPoint(-32F, -22F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-33F, -22F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[31].setRotationPoint(-21F, -22F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[32].setRotationPoint(-33F, -22F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[33].setRotationPoint(-21F, -22F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[34].setRotationPoint(-21F, -21F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[35].setRotationPoint(-21F, -21F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[36].setRotationPoint(-32F, -22F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[37].setRotationPoint(-34F, -22F, -1F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[38].setRotationPoint(-38.75F, -13.75F, -2F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[39].setRotationPoint(-39F, -1F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[40].setRotationPoint(-39F, 7F, 10F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[41].setRotationPoint(-42F, 8F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[42].setRotationPoint(-39F, 7F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[43].setRotationPoint(-42F, -1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[44].setRotationPoint(-42F, 2F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[45].setRotationPoint(-42F, -1F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[46].setRotationPoint(-42F, 2F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[47].setRotationPoint(-42F, 8F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[48].setRotationPoint(-42F, 8F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[49].setRotationPoint(38F, -1F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[50].setRotationPoint(38F, 7F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[51].setRotationPoint(38F, 7F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[52].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[53].setRotationPoint(42F, 8F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[54].setRotationPoint(-42F, -1F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[55].setRotationPoint(-42F, -1F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[56].setRotationPoint(-42F, -9F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[57].setRotationPoint(-38F, 1F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[58].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[59].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[60].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[61].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[62].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[63].setRotationPoint(-36F, -11F, 6.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[64].setRotationPoint(-25F, -23.5F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[65].setRotationPoint(-20F, -13F, 11F);

		bodyModel[66].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 288
		bodyModel[66].setRotationPoint(-5F, -9F, 11F);

		bodyModel[67].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[67].setRotationPoint(-20F, -13F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 44, 8, 0, 0F); // Box 303
		bodyModel[68].setRotationPoint(-5F, -9F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[69].setRotationPoint(39F, -9F, -11F);

		bodyModel[70].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[70].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[70].rotateAngleZ = -0.10471976F;

		bodyModel[71].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[71].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[72].setRotationPoint(-11F, 4F, -9F);

		bodyModel[73].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[73].setRotationPoint(-10.5F, 6F, -9.5F);
		bodyModel[73].rotateAngleZ = 0.10471976F;

		bodyModel[74].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[74].setRotationPoint(-10.5F, 5.5F, 10.01F);
		bodyModel[74].rotateAngleZ = -0.2268928F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[75].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[76].setRotationPoint(-44F, 8F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[77].setRotationPoint(-19F, -9F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[78].setRotationPoint(-11F, 2.5F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[79].setRotationPoint(-11F, 1.5F, 8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[80].setRotationPoint(-10.75F, 3F, 8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[81].setRotationPoint(-38F, 1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[82].setRotationPoint(-39F, -1F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[83].setRotationPoint(36F, 1F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[84].setRotationPoint(38F, -1F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[85].setRotationPoint(-42F, 1F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[86].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[87].setRotationPoint(37F, 1F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[88].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[89].setRotationPoint(-34.1F, -22F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[90].setRotationPoint(-34.1F, -20F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[91].setRotationPoint(-39.35F, -13.7F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[92].setRotationPoint(-39.35F, -13.7F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[94].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[95].setRotationPoint(36F, 1F, 7F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[96].setRotationPoint(38F, -1F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[97].setRotationPoint(-28F, -23.5F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[98].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[99].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[100].setRotationPoint(39F, -9F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[101].setRotationPoint(-20F, -21F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[102].setRotationPoint(-20F, -21F, 3F);

		bodyModel[103].addBox(0F, 0F, 0F, 37, 1, 6, 0F); // Box 294
		bodyModel[103].setRotationPoint(-20F, -21F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[104].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[105].setRotationPoint(-9F, -13F, 11.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[106].setRotationPoint(-38F, -13F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[107].setRotationPoint(-38F, -14F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[108].setRotationPoint(-38F, -14F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[109].setRotationPoint(-38F, -14F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[110].setRotationPoint(-39F, -13F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[111].setRotationPoint(-39F, -13F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[112].setRotationPoint(-39F, -13F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[113].setRotationPoint(-38.85F, -12.7F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[114].setRotationPoint(-38.85F, -12.7F, 5F);

		bodyModel[115].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[115].setRotationPoint(-33F, -22F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[116].setRotationPoint(9F, 3F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[117].setRotationPoint(-12F, 3F, -6F);

		bodyModel[118].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[118].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[119].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[119].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[120].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[121].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[122].setRotationPoint(-37.5F, -14F, -1F);

		bodyModel[123].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[123].setRotationPoint(-32F, 1F, 9F);
		bodyModel[123].rotateAngleZ = -0.27925268F;

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[124].setRotationPoint(-35F, 1F, 9F);

		bodyModel[125].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[125].setRotationPoint(17F, -18F, -7.75F);

		bodyModel[126].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[126].setRotationPoint(17F, -18F, 6.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[127].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[127].rotateAngleY = -3.14159265F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[128].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[128].rotateAngleY = -3.14159265F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[129].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[129].rotateAngleY = -3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[130].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[131].setRotationPoint(-42F, 6F, -8F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[132].setRotationPoint(-42F, 6F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[133].setRotationPoint(39F, 6F, 8F);

		bodyModel[134].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[134].setRotationPoint(39F, 6F, -8F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull atsf bit
		bodyModel[135].setRotationPoint(-24F, -23F, 3.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[136].setRotationPoint(-24F, -24F, 5F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[137].setRotationPoint(-34F, -23.5F, -1.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[138].setRotationPoint(-33F, -23.5F, -0.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[139].setRotationPoint(-34F, -23.5F, 0.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[140].setRotationPoint(-32.5F, -22.5F, -0.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[141].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[142].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[143].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[144].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[145].setRotationPoint(39F, 8F, -11F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[146].setRotationPoint(39F, 2F, -9F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[147].setRotationPoint(39F, -1F, -8F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[148].setRotationPoint(39F, 8F, 8F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[149].setRotationPoint(39F, 2F, 7F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[150].setRotationPoint(39F, -1F, 7F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[151].setRotationPoint(-33F, -24F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[152].setRotationPoint(-31.5F, -21F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[153].setRotationPoint(-31.5F, -21F, 7F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[154].setRotationPoint(-19F, -23F, -1.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[155].setRotationPoint(4.5F, -21.5F, -6.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[156].setRotationPoint(3F, -22.25F, -5.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[157].setRotationPoint(2F, -22.5F, -6.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[158].setRotationPoint(3.5F, -22.25F, -7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[159].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[160].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[161].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[162].setRotationPoint(-30F, -22.5F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[163].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[164].setRotationPoint(-30F, -22F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[165].setRotationPoint(-24F, -23F, 0F);

		bodyModel[166].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[166].setRotationPoint(17F, -21F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[167].setRotationPoint(17F, -22F, 1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[168].setRotationPoint(17F, -22F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[169].setRotationPoint(17F, -22F, -1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[170].setRotationPoint(37F, -22F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[171].setRotationPoint(38F, -22F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[172].setRotationPoint(38F, -22F, 1F);

		bodyModel[173].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[173].setRotationPoint(38F, -22.25F, 0F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[174].setRotationPoint(-37F, -5F, -11F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[175].setRotationPoint(-11F, -3F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[176].setRotationPoint(-11F, -3F, 7F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[177].setRotationPoint(-11F, -5F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[178].setRotationPoint(-11F, -5F, 10F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[179].setRotationPoint(38.75F, -20.25F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[180].setRotationPoint(42F, -1F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[181].setRotationPoint(42F, -9F, -2F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[182].setRotationPoint(42F, -9F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[183].setRotationPoint(42F, -1F, 2F);

		bodyModel[184].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[184].setRotationPoint(42F, -1F, 2F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[185].setRotationPoint(-42F, -1F, -2F);
		bodyModel[185].rotateAngleZ = -1.48352986F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[186].setRotationPoint(-43F, -9F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[187].setRotationPoint(-43F, -9F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[188].setRotationPoint(-43F, -1F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[189].setRotationPoint(-43F, -1F, 2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[190].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[191].setRotationPoint(-37F, -13.75F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[192].setRotationPoint(-37F, -13.75F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[193].setRotationPoint(-37F, -13.75F, 6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[194].setRotationPoint(-31F, -18F, -11F);
		bodyModel[194].rotateAngleX = -0.61086524F;

		bodyModel[195].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[195].setRotationPoint(-29F, -16F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[196].setRotationPoint(-29.01F, -16F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[197].setRotationPoint(-29F, -17F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[198].setRotationPoint(-29F, -18F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[199].setRotationPoint(-31F, -18F, 11F);
		bodyModel[199].rotateAngleX = 0.61086524F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[200].setRotationPoint(-46F, 7F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[201].setRotationPoint(-46F, 7F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[202].setRotationPoint(-45F, 6F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[203].setRotationPoint(-45F, 5F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[204].setRotationPoint(-45F, 6F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[205].setRotationPoint(-45F, 5F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[206].setRotationPoint(-45F, 4F, 2F);

		bodyModel[207].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[207].setRotationPoint(-45F, 4F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[208].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[209].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[210].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[211].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[212].setRotationPoint(-16F, -16.5F, 6.15F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[213].setRotationPoint(-18.5F, -16.5F, 6.15F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[214].setRotationPoint(-18.5F, -19F, 6.15F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[215].setRotationPoint(-14.5F, -22F, -0.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[216].setRotationPoint(-17F, -23F, -0.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[217].setRotationPoint(-16F, -22.75F, 0.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[218].setRotationPoint(-15.5F, -22.75F, -1.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[219].setRotationPoint(-42F, 5F, 8F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[220].setRotationPoint(-42F, 5F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[221].setRotationPoint(39F, 5F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[222].setRotationPoint(39F, 5F, 8F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[223].setRotationPoint(39F, 4F, 8F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[224].setRotationPoint(-42F, 4F, 8F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[225].setRotationPoint(-42F, 4F, -8F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[226].setRotationPoint(39F, 4F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early stairwell pillar
		bodyModel[227].setRotationPoint(-39F, 3F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 early stairwell pillar
		bodyModel[228].setRotationPoint(-39F, 3F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217 early stairwell pillar
		bodyModel[229].setRotationPoint(38F, 3F, 10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 early stairwell pillar
		bodyModel[230].setRotationPoint(38F, 3F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[231].setRotationPoint(-12F, 5F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[232].setRotationPoint(-10F, 5F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[233].setRotationPoint(9F, 5F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[234].setRotationPoint(11F, 5F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[235].setRotationPoint(-18F, -22F, 0F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[236].setRotationPoint(-16.5F, -21.5F, -4.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[237].setRotationPoint(-17F, -22.25F, -3.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[238].setRotationPoint(-19F, -22.5F, -4.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[239].setRotationPoint(-18F, -22.25F, -5.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[240].setRotationPoint(-38F, -13F, 11F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[241].setRotationPoint(-39F, -13F, 11F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[242].setRotationPoint(-39.01F, -8F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[243].setRotationPoint(-39.01F, -5F, -11.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[244].setRotationPoint(-39F, -12F, -9.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[245].setRotationPoint(-39F, -13F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[246].setRotationPoint(-39F, -13F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[247].setRotationPoint(-22.5F, -21F, -6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[248].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[249].setRotationPoint(-30F, -23.5F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[250].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[251].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[252].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[253].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[254].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[254].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[255].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[256].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[257].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[258].setRotationPoint(-31F, -22F, 7.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[259].setRotationPoint(-31F, -23F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[260].setRotationPoint(-31F, -22F, -8.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[261].setRotationPoint(-31F, -23F, -8.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[262].setRotationPoint(-29.5F, -23F, -0.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[263].setRotationPoint(-29.5F, -24F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[264].setRotationPoint(-38F, 1F, -11F);

		bodyModel[265].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[265].setRotationPoint(-33.75F, -23F, 5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[266].setRotationPoint(-32.5F, -22F, 4F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[267].setRotationPoint(-32.5F, -23F, 4F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[268].setRotationPoint(-34.25F, -23F, 3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[269].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[270].setRotationPoint(-23F, -13F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[271].setRotationPoint(-25.8F, -15F, 1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[272].setRotationPoint(-32.5F, -13F, 3F);
		bodyModel[272].rotateAngleY = -0.45378561F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[273].setRotationPoint(-32.5F, -15F, 3F);
		bodyModel[273].rotateAngleY = -0.45378561F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[274].setRotationPoint(-32.5F, -9F, 3F);
		bodyModel[274].rotateAngleY = -0.45378561F;

		bodyModel[275].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[275].setRotationPoint(-32F, -18F, 6.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[276].setRotationPoint(-18.5F, -19F, -7.15F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[277].setRotationPoint(-18.5F, -16.5F, -7.15F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[278].setRotationPoint(-16F, -16.5F, -7.15F);

		bodyModel[279].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[279].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[279].rotateAngleX = 1.57079633F;

		bodyModel[280].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[280].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[280].rotateAngleX = -1.57079633F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[281].setRotationPoint(-32F, -19F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[282].setRotationPoint(-32F, -19F, 7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[283].setRotationPoint(42F, -1F, -8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[284].setRotationPoint(42F, -1F, 2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[285].setRotationPoint(-43F, -1F, -8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[286].setRotationPoint(-43F, -1F, 2F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 279
		bodyModel[287].setRotationPoint(-43F, -1F, -2F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 280
		bodyModel[288].setRotationPoint(42F, -1F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[289].setRotationPoint(-43F, -1F, -5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[290].setRotationPoint(-43F, -1F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[291].setRotationPoint(42F, -1F, -5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[292].setRotationPoint(42F, -1F, 3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[293].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[294].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[295].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[296].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[297].setRotationPoint(-45F, 6F, 0F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[298].setRotationPoint(-45F, 6F, -10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 schnoz gyra
		bodyModel[299].setRotationPoint(-39F, -13.7F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[300].setRotationPoint(-38F, -13F, 7.5F);

		bodyModel[301].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[301].setRotationPoint(-34.05F, -21F, -1.5F);
		bodyModel[301].rotateAngleY = 0.13089969F;

		bodyModel[302].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[302].setRotationPoint(-34.05F, -21F, 1F);
		bodyModel[302].rotateAngleY = -0.13089969F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[303].setRotationPoint(-34F, -21F, -6.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[304].setRotationPoint(-34F, -21F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F); // Box 430 early nonsense
		bodyModel[305].setRotationPoint(13F, -20F, -8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 431 early nonsense
		bodyModel[306].setRotationPoint(13F, -20F, 7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[307].setRotationPoint(-7F, 5F, -11F);

		bodyModel[308].addBox(0F, 0F, 0F, 14, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[308].setRotationPoint(-7F, 5F, -8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 14, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[309].setRotationPoint(-7F, 2F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[310].setRotationPoint(-7F, 5F, 8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[311].setRotationPoint(-9F, 3F, -5.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 296 fuel tank smol support
		bodyModel[312].setRotationPoint(-9F, 3F, 5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[313].setRotationPoint(7F, 3F, -5.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296 fuel tank smol support
		bodyModel[314].setRotationPoint(7F, 3F, 5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 engineroom oil drain small tank
		bodyModel[315].setRotationPoint(7F, 1.5F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[316].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[317].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[318].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[319].setRotationPoint(-34F, -24.5F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[320].setRotationPoint(-34F, -24F, -1F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[321].setRotationPoint(-34.25F, -23F, 3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[322].setRotationPoint(-34F, -23F, -1.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[323].setRotationPoint(-28F, -22F, -9.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[324].setRotationPoint(-28F, -22F, 6.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[325].setRotationPoint(-27.5F, -23F, -8F);

		bodyModel[326].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[326].setRotationPoint(-27.5F, -23F, 8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65 emd cab
		bodyModel[327].setRotationPoint(-30F, -19F, -12F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224 emd cab
		bodyModel[328].setRotationPoint(-33F, -22F, 7F);

		bodyModel[329].addShapeBox(-0.5F, 0F, -3.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223 emd cab
		bodyModel[329].setRotationPoint(-20.5F, -22F, 10.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221 emd cab
		bodyModel[330].setRotationPoint(-32F, -20F, -11F);

		bodyModel[331].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 220 emd cab
		bodyModel[331].setRotationPoint(-32F, -22F, -7F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219 emd cab
		bodyModel[332].setRotationPoint(-21F, -22F, -7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front cab emd cab
		bodyModel[333].setRotationPoint(-35.25F, -20F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front cab emd cab
		bodyModel[334].setRotationPoint(-35.25F, -22F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44 emd cab
		bodyModel[335].setRotationPoint(-35F, -22F, 1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43 emd cab
		bodyModel[336].setRotationPoint(-35F, -22F, -6F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 emd cab
		bodyModel[337].setRotationPoint(-35F, -22F, -1F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211 emd cab
		bodyModel[338].setRotationPoint(-33F, -22F, -7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210 emd cab
		bodyModel[339].setRotationPoint(-21F, -22F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11 emd cab
		bodyModel[340].setRotationPoint(-33F, -22F, -11F);

		bodyModel[341].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right emd cab
		bodyModel[341].setRotationPoint(-20.5F, -19F, 10.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313 emd cab
		bodyModel[342].setRotationPoint(-33F, -19F, -7F);

		bodyModel[343].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 190 emd cab
		bodyModel[343].setRotationPoint(-32F, -19F, -11F);

		bodyModel[344].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 72 emd cab
		bodyModel[344].setRotationPoint(-32F, -19F, 10F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70 emd cab
		bodyModel[345].setRotationPoint(-21F, -19F, -11F);

		bodyModel[346].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right emd cab
		bodyModel[346].setRotationPoint(-32.5F, -19F, -10.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front emd cab
		bodyModel[347].setRotationPoint(-33.05F, -20.5F, -6F);
		bodyModel[347].rotateAngleY = 0.38397244F;

		bodyModel[348].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front emd cab
		bodyModel[348].setRotationPoint(-33.05F, -20.5F, 6F);
		bodyModel[348].rotateAngleY = -0.38397244F;

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133 emd cab
		bodyModel[349].setRotationPoint(-35F, -18F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360 emd cab
		bodyModel[350].setRotationPoint(-32F, -20F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64 emd cab
		bodyModel[351].setRotationPoint(-30F, -19F, 11F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 1412||GetColor(entity) == 325
				||GetColor(entity) == 1326) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1333||GetColor(entity) == 612
				||GetColor(entity) == 2225){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1112 || GetColor(entity) == 27321
				|| GetColor(entity) == 30321){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_up_early.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 2123 ||GetColor(entity) == 1128){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 ||GetColor(entity) == 16){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 9354){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_de_bleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 29354){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_grey.png"));
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