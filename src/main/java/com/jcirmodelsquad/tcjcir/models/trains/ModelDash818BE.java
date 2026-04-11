//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B18-8E
// Model Creator: Bida & Cubed
// Created on: 19.12.2024 - 20:56:20
// Last changed on: 19.12.2024 - 20:56:20

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelDash818BE extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash818BE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[368];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 12, 130, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[3] = new ModelRendererTurbo(this, 32, 164, textureX, textureY); // Box 195
		bodyModel[4] = new ModelRendererTurbo(this, 78, 160, textureX, textureY); // Box 199
		bodyModel[5] = new ModelRendererTurbo(this, 70, 158, textureX, textureY); // Box 200
		bodyModel[6] = new ModelRendererTurbo(this, 56, 168, textureX, textureY); // Box 203
		bodyModel[7] = new ModelRendererTurbo(this, 48, 169, textureX, textureY); // Box 204
		bodyModel[8] = new ModelRendererTurbo(this, 47, 175, textureX, textureY); // Box 205
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[10] = new ModelRendererTurbo(this, 470, 166, textureX, textureY); // Box 256
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 267
		bodyModel[13] = new ModelRendererTurbo(this, 50, 164, textureX, textureY); // Box 411
		bodyModel[14] = new ModelRendererTurbo(this, 81, 92, textureX, textureY); // Box 282
		bodyModel[15] = new ModelRendererTurbo(this, 68, 95, textureX, textureY); // Box 283
		bodyModel[16] = new ModelRendererTurbo(this, 107, 88, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 94, 90, textureX, textureY); // Box 322
		bodyModel[18] = new ModelRendererTurbo(this, 41, 90, textureX, textureY); // Box 727
		bodyModel[19] = new ModelRendererTurbo(this, 28, 92, textureX, textureY); // Box 728
		bodyModel[20] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 729
		bodyModel[21] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Box 730
		bodyModel[22] = new ModelRendererTurbo(this, 15, 84, textureX, textureY); // Box 732
		bodyModel[23] = new ModelRendererTurbo(this, 4, 86, textureX, textureY); // Box 734
		bodyModel[24] = new ModelRendererTurbo(this, 70, 161, textureX, textureY); // Box 201
		bodyModel[25] = new ModelRendererTurbo(this, 48, 166, textureX, textureY); // Box 202
		bodyModel[26] = new ModelRendererTurbo(this, 79, 156, textureX, textureY); // Box 293
		bodyModel[27] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 294
		bodyModel[28] = new ModelRendererTurbo(this, 70, 164, textureX, textureY); // Box 392
		bodyModel[29] = new ModelRendererTurbo(this, 79, 158, textureX, textureY); // Box 393
		bodyModel[30] = new ModelRendererTurbo(this, 57, 166, textureX, textureY); // Box 394
		bodyModel[31] = new ModelRendererTurbo(this, 48, 169, textureX, textureY); // Box 395
		bodyModel[32] = new ModelRendererTurbo(this, 13, 142, textureX, textureY); // box65
		bodyModel[33] = new ModelRendererTurbo(this, 270, 140, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[34] = new ModelRendererTurbo(this, 187, 88, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[35] = new ModelRendererTurbo(this, 272, 132, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[36] = new ModelRendererTurbo(this, 272, 132, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[37] = new ModelRendererTurbo(this, 302, 117, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[38] = new ModelRendererTurbo(this, 281, 116, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[39] = new ModelRendererTurbo(this, 178, 57, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[40] = new ModelRendererTurbo(this, 281, 116, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[41] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 209, 62, textureX, textureY); // Box 251
		bodyModel[43] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 424
		bodyModel[44] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 426
		bodyModel[45] = new ModelRendererTurbo(this, 274, 84, textureX, textureY); // Box 156
		bodyModel[46] = new ModelRendererTurbo(this, 217, 173, textureX, textureY, "cull"); // Box 630 cull thing
		bodyModel[47] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 382
		bodyModel[48] = new ModelRendererTurbo(this, 44, 173, textureX, textureY); // Box 457
		bodyModel[49] = new ModelRendererTurbo(this, 44, 167, textureX, textureY); // Box 458
		bodyModel[50] = new ModelRendererTurbo(this, 41, 166, textureX, textureY); // Box 459
		bodyModel[51] = new ModelRendererTurbo(this, 53, 147, textureX, textureY); // Box 462
		bodyModel[52] = new ModelRendererTurbo(this, 11, 164, textureX, textureY); // Box 481
		bodyModel[53] = new ModelRendererTurbo(this, 23, 173, textureX, textureY); // Box 482
		bodyModel[54] = new ModelRendererTurbo(this, 23, 167, textureX, textureY); // Box 483
		bodyModel[55] = new ModelRendererTurbo(this, 20, 166, textureX, textureY); // Box 484
		bodyModel[56] = new ModelRendererTurbo(this, 24, 165, textureX, textureY); // Box 485
		bodyModel[57] = new ModelRendererTurbo(this, 50, 147, textureX, textureY); // Box 495
		bodyModel[58] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 496
		bodyModel[59] = new ModelRendererTurbo(this, 377, 111, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 276, 2, textureX, textureY); // Box 6
		bodyModel[61] = new ModelRendererTurbo(this, 218, 17, textureX, textureY); // Box 292
		bodyModel[62] = new ModelRendererTurbo(this, 218, 4, textureX, textureY); // Box 293
		bodyModel[63] = new ModelRendererTurbo(this, 219, 11, textureX, textureY); // Box 294
		bodyModel[64] = new ModelRendererTurbo(this, 471, 178, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 44, 147, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 434, 184, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 434, 186, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 434, 192, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 437, 185, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 445, 181, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 141
		bodyModel[73] = new ModelRendererTurbo(this, 79, 158, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 70, 164, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 70, 161, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 79, 156, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 146
		bodyModel[78] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 147
		bodyModel[79] = new ModelRendererTurbo(this, 70, 158, textureX, textureY); // Box 148
		bodyModel[80] = new ModelRendererTurbo(this, 78, 160, textureX, textureY); // Box 149
		bodyModel[81] = new ModelRendererTurbo(this, 56, 168, textureX, textureY); // Box 150
		bodyModel[82] = new ModelRendererTurbo(this, 48, 166, textureX, textureY); // Box 151
		bodyModel[83] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 152
		bodyModel[84] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 153
		bodyModel[85] = new ModelRendererTurbo(this, 57, 166, textureX, textureY); // Box 154
		bodyModel[86] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 155
		bodyModel[87] = new ModelRendererTurbo(this, 47, 175, textureX, textureY); // Box 156
		bodyModel[88] = new ModelRendererTurbo(this, 50, 164, textureX, textureY); // Box 157
		bodyModel[89] = new ModelRendererTurbo(this, 454, 184, textureX, textureY); // Box 158
		bodyModel[90] = new ModelRendererTurbo(this, 454, 186, textureX, textureY); // Box 159
		bodyModel[91] = new ModelRendererTurbo(this, 454, 192, textureX, textureY); // Box 160
		bodyModel[92] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 161
		bodyModel[93] = new ModelRendererTurbo(this, 425, 181, textureX, textureY); // Box 162
		bodyModel[94] = new ModelRendererTurbo(this, 425, 48, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 156, 227, textureX, textureY); // Box 298
		bodyModel[96] = new ModelRendererTurbo(this, 123, 228, textureX, textureY); // Box 279
		bodyModel[97] = new ModelRendererTurbo(this, 108, 234, textureX, textureY); // Box 282
		bodyModel[98] = new ModelRendererTurbo(this, 93, 234, textureX, textureY); // Box 283
		bodyModel[99] = new ModelRendererTurbo(this, 118, 231, textureX, textureY); // Box 297
		bodyModel[100] = new ModelRendererTurbo(this, 183, 218, textureX, textureY); // Box 298
		bodyModel[101] = new ModelRendererTurbo(this, 169, 208, textureX, textureY); // Box 299
		bodyModel[102] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 300
		bodyModel[103] = new ModelRendererTurbo(this, 154, 219, textureX, textureY); // Box 301
		bodyModel[104] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 302
		bodyModel[105] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 258
		bodyModel[106] = new ModelRendererTurbo(this, 65, 239, textureX, textureY); // Box 275
		bodyModel[107] = new ModelRendererTurbo(this, 151, 204, textureX, textureY); // Box 688
		bodyModel[108] = new ModelRendererTurbo(this, 154, 206, textureX, textureY); // Box 210
		bodyModel[109] = new ModelRendererTurbo(this, 50, 239, textureX, textureY); // Box 208
		bodyModel[110] = new ModelRendererTurbo(this, 85, 237, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[111] = new ModelRendererTurbo(this, 85, 242, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[112] = new ModelRendererTurbo(this, 82, 247, textureX, textureY); // Box 354
		bodyModel[113] = new ModelRendererTurbo(this, 222, 243, textureX, textureY); // Box 317
		bodyModel[114] = new ModelRendererTurbo(this, 222, 241, textureX, textureY); // Box 318
		bodyModel[115] = new ModelRendererTurbo(this, 222, 249, textureX, textureY); // Box 319
		bodyModel[116] = new ModelRendererTurbo(this, 222, 251, textureX, textureY); // Box 220
		bodyModel[117] = new ModelRendererTurbo(this, 219, 241, textureX, textureY); // Box 221
		bodyModel[118] = new ModelRendererTurbo(this, 215, 248, textureX, textureY); // Box 222
		bodyModel[119] = new ModelRendererTurbo(this, 216, 241, textureX, textureY); // Box 223
		bodyModel[120] = new ModelRendererTurbo(this, 212, 248, textureX, textureY); // Box 224
		bodyModel[121] = new ModelRendererTurbo(this, 367, 99, textureX, textureY); // Box 18 late stack
		bodyModel[122] = new ModelRendererTurbo(this, 380, 96, textureX, textureY); // Box 21 late stack
		bodyModel[123] = new ModelRendererTurbo(this, 367, 91, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[124] = new ModelRendererTurbo(this, 52, 228, textureX, textureY); // Box 231
		bodyModel[125] = new ModelRendererTurbo(this, 163, 203, textureX, textureY); // Box 232
		bodyModel[126] = new ModelRendererTurbo(this, 199, 228, textureX, textureY); // Box 355 brakewheel
		bodyModel[127] = new ModelRendererTurbo(this, 210, 231, textureX, textureY); // Box 277
		bodyModel[128] = new ModelRendererTurbo(this, 108, 230, textureX, textureY); // Box 402
		bodyModel[129] = new ModelRendererTurbo(this, 73, 50, textureX, textureY); // Box 258
		bodyModel[130] = new ModelRendererTurbo(this, 59, 39, textureX, textureY); // Box 522
		bodyModel[131] = new ModelRendererTurbo(this, 66, 50, textureX, textureY); // Box 244
		bodyModel[132] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 246
		bodyModel[133] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 249
		bodyModel[134] = new ModelRendererTurbo(this, 71, 38, textureX, textureY); // Box 250
		bodyModel[135] = new ModelRendererTurbo(this, 78, 50, textureX, textureY); // Box 251
		bodyModel[136] = new ModelRendererTurbo(this, 509, 165, textureX, textureY); // Box 252
		bodyModel[137] = new ModelRendererTurbo(this, 464, 164, textureX, textureY); // Box 253
		bodyModel[138] = new ModelRendererTurbo(this, 118, 38, textureX, textureY); // Box 277
		bodyModel[139] = new ModelRendererTurbo(this, 459, 164, textureX, textureY); // Box 278
		bodyModel[140] = new ModelRendererTurbo(this, 11, 130, textureX, textureY); // Box 279
		bodyModel[141] = new ModelRendererTurbo(this, 82, 48, textureX, textureY); // Box 280
		bodyModel[142] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 281
		bodyModel[143] = new ModelRendererTurbo(this, 69, 47, textureX, textureY); // Box 282
		bodyModel[144] = new ModelRendererTurbo(this, 317, 207, textureX, textureY); // Box 418
		bodyModel[145] = new ModelRendererTurbo(this, 315, 204, textureX, textureY); // Box 419
		bodyModel[146] = new ModelRendererTurbo(this, 314, 198, textureX, textureY); // Box 420
		bodyModel[147] = new ModelRendererTurbo(this, 315, 201, textureX, textureY); // Box 421
		bodyModel[148] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, "prime4"); // Box 6 PRIME1-1
		bodyModel[149] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, "prime2"); // Box 7 PRIME1-3
		bodyModel[150] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, "prime3"); // Box 8 PRIME1-2
		bodyModel[151] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, "prime1"); // Box 9 PRIME1-4
		bodyModel[152] = new ModelRendererTurbo(this, 280, 227, textureX, textureY); // Box 428
		bodyModel[153] = new ModelRendererTurbo(this, 107, 227, textureX, textureY); // Box 300
		bodyModel[154] = new ModelRendererTurbo(this, 337, 206, textureX, textureY); // Box 233
		bodyModel[155] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 234
		bodyModel[156] = new ModelRendererTurbo(this, 337, 202, textureX, textureY); // Box 235
		bodyModel[157] = new ModelRendererTurbo(this, 259, 200, textureX, textureY); // Box 184 o2 generator
		bodyModel[158] = new ModelRendererTurbo(this, 68, 39, textureX, textureY); // Box 326
		bodyModel[159] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 327
		bodyModel[160] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 328
		bodyModel[161] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 329
		bodyModel[162] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[163] = new ModelRendererTurbo(this, 5, 153, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[164] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 440 honse m-2
		bodyModel[165] = new ModelRendererTurbo(this, 337, 200, textureX, textureY); // Box 341
		bodyModel[166] = new ModelRendererTurbo(this, 296, 199, textureX, textureY); // Box 354
		bodyModel[167] = new ModelRendererTurbo(this, 297, 205, textureX, textureY); // Box 355
		bodyModel[168] = new ModelRendererTurbo(this, 297, 202, textureX, textureY); // Box 356
		bodyModel[169] = new ModelRendererTurbo(this, 305, 211, textureX, textureY); // Box 357
		bodyModel[170] = new ModelRendererTurbo(this, 298, 211, textureX, textureY); // Box 443
		bodyModel[171] = new ModelRendererTurbo(this, 298, 208, textureX, textureY); // Box 444
		bodyModel[172] = new ModelRendererTurbo(this, 480, 163, textureX, textureY); // Box 350
		bodyModel[173] = new ModelRendererTurbo(this, 473, 163, textureX, textureY); // Box 351
		bodyModel[174] = new ModelRendererTurbo(this, 479, 170, textureX, textureY); // Box 352
		bodyModel[175] = new ModelRendererTurbo(this, 112, 227, textureX, textureY); // Box 369
		bodyModel[176] = new ModelRendererTurbo(this, 132, 182, textureX, textureY); // Box 412 cs
		bodyModel[177] = new ModelRendererTurbo(this, 132, 202, textureX, textureY); // Box 413 cs
		bodyModel[178] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 86 cs
		bodyModel[179] = new ModelRendererTurbo(this, 132, 195, textureX, textureY); // Box 531 cs
		bodyModel[180] = new ModelRendererTurbo(this, 148, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[181] = new ModelRendererTurbo(this, 108, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[182] = new ModelRendererTurbo(this, 102, 183, textureX, textureY); // Box 307 spedo
		bodyModel[183] = new ModelRendererTurbo(this, 168, 188, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[184] = new ModelRendererTurbo(this, 143, 188, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[185] = new ModelRendererTurbo(this, 105, 180, textureX, textureY); // Box 530 not a fridge
		bodyModel[186] = new ModelRendererTurbo(this, 193, 238, textureX, textureY); // Box 399
		bodyModel[187] = new ModelRendererTurbo(this, 207, 238, textureX, textureY); // Box 400
		bodyModel[188] = new ModelRendererTurbo(this, 200, 237, textureX, textureY); // Box 401
		bodyModel[189] = new ModelRendererTurbo(this, 200, 234, textureX, textureY); // Box 402
		bodyModel[190] = new ModelRendererTurbo(this, 211, 235, textureX, textureY); // Box 43
		bodyModel[191] = new ModelRendererTurbo(this, 212, 238, textureX, textureY); // Box 43
		bodyModel[192] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 405
		bodyModel[193] = new ModelRendererTurbo(this, 53, 3, textureX, textureY); // Box 193
		bodyModel[194] = new ModelRendererTurbo(this, 30, 3, textureX, textureY); // Box 273
		bodyModel[195] = new ModelRendererTurbo(this, 343, 82, textureX, textureY); // Box 408 lot of little pipes 3b
		bodyModel[196] = new ModelRendererTurbo(this, 357, 84, textureX, textureY); // Box 409 lot of little pipes 3c
		bodyModel[197] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 4
		bodyModel[198] = new ModelRendererTurbo(this, 33, 70, textureX, textureY); // Box 4
		bodyModel[199] = new ModelRendererTurbo(this, 18, 72, textureX, textureY); // Box 448
		bodyModel[200] = new ModelRendererTurbo(this, 48, 72, textureX, textureY); // Box 449
		bodyModel[201] = new ModelRendererTurbo(this, 175, 177, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[202] = new ModelRendererTurbo(this, 155, 113, textureX, textureY); // Box 7
		bodyModel[203] = new ModelRendererTurbo(this, 130, 113, textureX, textureY); // Box 24
		bodyModel[204] = new ModelRendererTurbo(this, 109, 115, textureX, textureY); // Box 28
		bodyModel[205] = new ModelRendererTurbo(this, 130, 80, textureX, textureY); // Box 30
		bodyModel[206] = new ModelRendererTurbo(this, 169, 94, textureX, textureY); // Box 52 door swing right
		bodyModel[207] = new ModelRendererTurbo(this, 148, 129, textureX, textureY); // Box 314 door swing right
		bodyModel[208] = new ModelRendererTurbo(this, 147, 141, textureX, textureY); // Box 266
		bodyModel[209] = new ModelRendererTurbo(this, 168, 83, textureX, textureY); // Box 268
		bodyModel[210] = new ModelRendererTurbo(this, 159, 129, textureX, textureY); // Box 271
		bodyModel[211] = new ModelRendererTurbo(this, 199, 147, textureX, textureY); // Box 374
		bodyModel[212] = new ModelRendererTurbo(this, 180, 113, textureX, textureY); // Box 375
		bodyModel[213] = new ModelRendererTurbo(this, 154, 83, textureX, textureY); // Box 376
		bodyModel[214] = new ModelRendererTurbo(this, 159, 135, textureX, textureY); // Box 377
		bodyModel[215] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 378
		bodyModel[216] = new ModelRendererTurbo(this, 180, 116, textureX, textureY); // Box 379
		bodyModel[217] = new ModelRendererTurbo(this, 136, 72, textureX, textureY); // Box 285
		bodyModel[218] = new ModelRendererTurbo(this, 142, 60, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[219] = new ModelRendererTurbo(this, 134, 60, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[220] = new ModelRendererTurbo(this, 136, 65, textureX, textureY); // Box 296
		bodyModel[221] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[222] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[223] = new ModelRendererTurbo(this, 143, 68, textureX, textureY); // Box 371
		bodyModel[224] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 372
		bodyModel[225] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 373
		bodyModel[226] = new ModelRendererTurbo(this, 119, 65, textureX, textureY, "lamp"); // Box 301 markerlight glow
		bodyModel[227] = new ModelRendererTurbo(this, 119, 65, textureX, textureY, "lamp"); // Box 344 markerlight glow
		bodyModel[228] = new ModelRendererTurbo(this, 151, 77, textureX, textureY); // Box 368
		bodyModel[229] = new ModelRendererTurbo(this, 109, 65, textureX, textureY); // Box 419
		bodyModel[230] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 420
		bodyModel[231] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 421
		bodyModel[232] = new ModelRendererTurbo(this, 114, 65, textureX, textureY); // Box 422
		bodyModel[233] = new ModelRendererTurbo(this, 127, 68, textureX, textureY); // Box 425
		bodyModel[234] = new ModelRendererTurbo(this, 288, 228, textureX, textureY); // Box 88
		bodyModel[235] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 119
		bodyModel[236] = new ModelRendererTurbo(this, 235, 244, textureX, textureY); // Box 127
		bodyModel[237] = new ModelRendererTurbo(this, 398, 214, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 235, 250, textureX, textureY); // Box 130
		bodyModel[239] = new ModelRendererTurbo(this, 237, 236, textureX, textureY); // Box 135
		bodyModel[240] = new ModelRendererTurbo(this, 237, 240, textureX, textureY); // Box 136
		bodyModel[241] = new ModelRendererTurbo(this, 344, 228, textureX, textureY); // Box 233
		bodyModel[242] = new ModelRendererTurbo(this, 288, 242, textureX, textureY); // Box 312
		bodyModel[243] = new ModelRendererTurbo(this, 475, 7, textureX, textureY); // Box 398
		bodyModel[244] = new ModelRendererTurbo(this, 475, 4, textureX, textureY); // Box 399
		bodyModel[245] = new ModelRendererTurbo(this, 413, 81, textureX, textureY); // Box 124
		bodyModel[246] = new ModelRendererTurbo(this, 443, 81, textureX, textureY); // Box 130
		bodyModel[247] = new ModelRendererTurbo(this, 432, 94, textureX, textureY); // Box 131
		bodyModel[248] = new ModelRendererTurbo(this, 468, 7, textureX, textureY); // Box 31
		bodyModel[249] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[250] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[251] = new ModelRendererTurbo(this, 432, 80, textureX, textureY); // Box 132
		bodyModel[252] = new ModelRendererTurbo(this, 461, 72, textureX, textureY); // Box 173
		bodyModel[253] = new ModelRendererTurbo(this, 432, 88, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[254] = new ModelRendererTurbo(this, 444, 72, textureX, textureY); // Box 133
		bodyModel[255] = new ModelRendererTurbo(this, 432, 72, textureX, textureY); // Box 294
		bodyModel[256] = new ModelRendererTurbo(this, 227, 229, textureX, textureY); // Box 415 D9 intake
		bodyModel[257] = new ModelRendererTurbo(this, 13, 214, textureX, textureY); // Box 261
		bodyModel[258] = new ModelRendererTurbo(this, 227, 229, textureX, textureY); // Box 415
		bodyModel[259] = new ModelRendererTurbo(this, 414, 213, textureX, textureY); // Box 547
		bodyModel[260] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 345
		bodyModel[261] = new ModelRendererTurbo(this, 168, 199, textureX, textureY); // Box 123
		bodyModel[262] = new ModelRendererTurbo(this, 149, 199, textureX, textureY); // Box 311
		bodyModel[263] = new ModelRendererTurbo(this, 327, 210, textureX, textureY); // Box 350
		bodyModel[264] = new ModelRendererTurbo(this, 324, 210, textureX, textureY); // Box 408
		bodyModel[265] = new ModelRendererTurbo(this, 344, 228, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[266] = new ModelRendererTurbo(this, 289, 222, textureX, textureY); // Box 5
		bodyModel[267] = new ModelRendererTurbo(this, 180, 101, textureX, textureY); // Box 254 D9 WALKWAY
		bodyModel[268] = new ModelRendererTurbo(this, 93, 48, textureX, textureY); // Box 367
		bodyModel[269] = new ModelRendererTurbo(this, 45, 50, textureX, textureY); // Box 425
		bodyModel[270] = new ModelRendererTurbo(this, 454, 7, textureX, textureY); // Box 421
		bodyModel[271] = new ModelRendererTurbo(this, 454, 2, textureX, textureY, "lamp"); // Box 422 headlight low early glow
		bodyModel[272] = new ModelRendererTurbo(this, 454, 2, textureX, textureY, "lamp"); // Box 423 headlight low early glow
		bodyModel[273] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[274] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[275] = new ModelRendererTurbo(this, 487, 119, textureX, textureY); // Box 318
		bodyModel[276] = new ModelRendererTurbo(this, 478, 19, textureX, textureY, "cull"); // Box 427 early ladder cull
		bodyModel[277] = new ModelRendererTurbo(this, 489, 19, textureX, textureY, "cull"); // Box 428 early cull ladder
		bodyModel[278] = new ModelRendererTurbo(this, 191, 115, textureX, textureY); // Box 460
		bodyModel[279] = new ModelRendererTurbo(this, 2, 202, textureX, textureY); // Box 467
		bodyModel[280] = new ModelRendererTurbo(this, 176, 202, textureX, textureY, "cull"); // Box 468 cull widdle guy
		bodyModel[281] = new ModelRendererTurbo(this, 504, 112, textureX, textureY, "cull"); // Box 190 cull
		bodyModel[282] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 339 glow markerlight crl
		bodyModel[283] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 345 glow markerlight crl
		bodyModel[284] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 348 glow markerlight sou
		bodyModel[285] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 349 sou markerlight glow
		bodyModel[286] = new ModelRendererTurbo(this, 456, 134, textureX, textureY); // Box 384
		bodyModel[287] = new ModelRendererTurbo(this, 503, 129, textureX, textureY); // Box 219
		bodyModel[288] = new ModelRendererTurbo(this, 504, 107, textureX, textureY, "cull"); // Box 477 cull
		bodyModel[289] = new ModelRendererTurbo(this, 60, 44, textureX, textureY); // Box 477
		bodyModel[290] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 482
		bodyModel[291] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 483
		bodyModel[292] = new ModelRendererTurbo(this, 15, 129, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[293] = new ModelRendererTurbo(this, 27, 130, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[294] = new ModelRendererTurbo(this, 34, 129, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[295] = new ModelRendererTurbo(this, 87, 140, textureX, textureY); // Box 432
		bodyModel[296] = new ModelRendererTurbo(this, 65, 140, textureX, textureY); // Box 433
		bodyModel[297] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 434
		bodyModel[298] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[299] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[300] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[301] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[302] = new ModelRendererTurbo(this, 87, 143, textureX, textureY); // Box 435
		bodyModel[303] = new ModelRendererTurbo(this, 90, 143, textureX, textureY); // Box 436
		bodyModel[304] = new ModelRendererTurbo(this, 452, 116, textureX, textureY, "cull"); // Box 441 cull
		bodyModel[305] = new ModelRendererTurbo(this, 463, 117, textureX, textureY, "cull"); // Box 442 cull
		bodyModel[306] = new ModelRendererTurbo(this, 469, 116, textureX, textureY, "cull"); // Box 443 cull
		bodyModel[307] = new ModelRendererTurbo(this, 494, 137, textureX, textureY); // Box 444
		bodyModel[308] = new ModelRendererTurbo(this, 485, 139, textureX, textureY); // Box 445
		bodyModel[309] = new ModelRendererTurbo(this, 472, 137, textureX, textureY); // Box 446
		bodyModel[310] = new ModelRendererTurbo(this, 506, 171, textureX, textureY); // Box 253
		bodyModel[311] = new ModelRendererTurbo(this, 509, 172, textureX, textureY); // Box 254
		bodyModel[312] = new ModelRendererTurbo(this, 472, 171, textureX, textureY); // Box 256
		bodyModel[313] = new ModelRendererTurbo(this, 469, 172, textureX, textureY); // Box 257
		bodyModel[314] = new ModelRendererTurbo(this, 477, 140, textureX, textureY); // Box 447
		bodyModel[315] = new ModelRendererTurbo(this, 499, 140, textureX, textureY); // Box 448
		bodyModel[316] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 81
		bodyModel[317] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[318] = new ModelRendererTurbo(this, 469, 165, textureX, textureY); // Box 247
		bodyModel[319] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 248
		bodyModel[320] = new ModelRendererTurbo(this, 359, 129, textureX, textureY); // Box 407
		bodyModel[321] = new ModelRendererTurbo(this, 331, 129, textureX, textureY); // Box 408
		bodyModel[322] = new ModelRendererTurbo(this, 271, 130, textureX, textureY); // Box 409
		bodyModel[323] = new ModelRendererTurbo(this, 331, 137, textureX, textureY); // Box 410
		bodyModel[324] = new ModelRendererTurbo(this, 333, 217, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[325] = new ModelRendererTurbo(this, 349, 217, textureX, textureY); // Box 5
		bodyModel[326] = new ModelRendererTurbo(this, 270, 124, textureX, textureY); // Box 411
		bodyModel[327] = new ModelRendererTurbo(this, 301, 107, textureX, textureY); // Box 412
		bodyModel[328] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 413
		bodyModel[329] = new ModelRendererTurbo(this, 322, 105, textureX, textureY); // Box 414
		bodyModel[330] = new ModelRendererTurbo(this, 259, 122, textureX, textureY, "cull"); // Box 415 cull
		bodyModel[331] = new ModelRendererTurbo(this, 270, 97, textureX, textureY); // Box 416
		bodyModel[332] = new ModelRendererTurbo(this, 343, 93, textureX, textureY); // Box 417
		bodyModel[333] = new ModelRendererTurbo(this, 282, 130, textureX, textureY, "cull"); // Box 418 cull
		bodyModel[334] = new ModelRendererTurbo(this, 301, 107, textureX, textureY); // Box 419
		bodyModel[335] = new ModelRendererTurbo(this, 322, 105, textureX, textureY); // Box 420
		bodyModel[336] = new ModelRendererTurbo(this, 269, 116, textureX, textureY, "cull"); // Box 421 cull
		bodyModel[337] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 422
		bodyModel[338] = new ModelRendererTurbo(this, 303, 89, textureX, textureY); // Box 423
		bodyModel[339] = new ModelRendererTurbo(this, 270, 97, textureX, textureY); // Box 424
		bodyModel[340] = new ModelRendererTurbo(this, 258, 132, textureX, textureY, "cull"); // Box 425 cull
		bodyModel[341] = new ModelRendererTurbo(this, 248, 122, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[342] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 410
		bodyModel[343] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 411
		bodyModel[344] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, "ditch"); // Box 412 ditchlight f glow
		bodyModel[345] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, "ditch"); // Box 412 ditchlight f glow
		bodyModel[346] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, "ditch"); // Box 365 ditchlight glow
		bodyModel[347] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 366
		bodyModel[348] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, "ditch"); // Box 367 ditchlight glow
		bodyModel[349] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 368
		bodyModel[350] = new ModelRendererTurbo(this, 377, 116, textureX, textureY); // Box 450
		bodyModel[351] = new ModelRendererTurbo(this, 158, 69, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[352] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull atsf bit
		bodyModel[353] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[354] = new ModelRendererTurbo(this, 169, 67, textureX, textureY); // Box 308
		bodyModel[355] = new ModelRendererTurbo(this, 178, 62, textureX, textureY); // Box 454
		bodyModel[356] = new ModelRendererTurbo(this, 344, 202, textureX, textureY); // Box 455
		bodyModel[357] = new ModelRendererTurbo(this, 124, 64, textureX, textureY, "prime4"); // Box 9 PRIME5-4
		bodyModel[358] = new ModelRendererTurbo(this, 124, 64, textureX, textureY, "prime2"); // Box 8 PRIME5-2
		bodyModel[359] = new ModelRendererTurbo(this, 124, 64, textureX, textureY, "prime3"); // Box 7 PRIME5-3
		bodyModel[360] = new ModelRendererTurbo(this, 124, 64, textureX, textureY, "prime1"); // Box 6 PRIME5-1
		bodyModel[361] = new ModelRendererTurbo(this, 120, 68, textureX, textureY); // Box 421 prime base lifted
		bodyModel[362] = new ModelRendererTurbo(this, 289, 227, textureX, textureY, "cull"); // Box 423 support cull
		bodyModel[363] = new ModelRendererTurbo(this, 368, 111, textureX, textureY); // Box 466
		bodyModel[364] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[365] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[366] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[367] = new ModelRendererTurbo(this, 497, 111, textureX, textureY, "cull"); // Box 361 cull

		bodyModel[0].addBox(0F, 0F, 0F, 78, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-43.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[2].setRotationPoint(-47F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[3].setRotationPoint(-40F, -1F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[4].setRotationPoint(-43F, -1F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[5].setRotationPoint(-43F, 1F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[6].setRotationPoint(-43F, -1F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[7].setRotationPoint(-43F, 1F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[8].setRotationPoint(-43F, 8F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[9].setRotationPoint(43F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 256
		bodyModel[10].setRotationPoint(43.01F, -1F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-44F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[12].setRotationPoint(43F, 2.5F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 411
		bodyModel[13].setRotationPoint(-43F, 7F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[14].setRotationPoint(-47F, 7F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[15].setRotationPoint(-47F, 7F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-46F, 6F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[17].setRotationPoint(-46F, 6F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[18].setRotationPoint(45F, 6F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[19].setRotationPoint(45F, 6F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[20].setRotationPoint(46F, 7F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[21].setRotationPoint(46F, 7F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[22].setRotationPoint(45F, 5F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[23].setRotationPoint(45F, 5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[24].setRotationPoint(-43F, 3F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[25].setRotationPoint(-43F, 3F, -10F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[26].setRotationPoint(-43F, 2F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[27].setRotationPoint(-43F, 2F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 392
		bodyModel[28].setRotationPoint(-43F, 5.5F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 393
		bodyModel[29].setRotationPoint(-43F, 4.5F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[30].setRotationPoint(-43F, 4.5F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 395
		bodyModel[31].setRotationPoint(-43F, 5.5F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[32].setRotationPoint(-43F, 8F, -9.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[33].setRotationPoint(-26F, 2.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[34].setRotationPoint(-26F, 1F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[35].setRotationPoint(-25F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[36].setRotationPoint(-25F, 2F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[37].setRotationPoint(23F, 2.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[38].setRotationPoint(24F, 2F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[39].setRotationPoint(23F, 1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[40].setRotationPoint(24F, 2F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 86, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[41].setRotationPoint(-43F, 2.75F, -7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 86, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[42].setRotationPoint(-43F, 1F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 86, 2, 14, 0F); // Box 424
		bodyModel[43].setRotationPoint(-43F, -1F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 78, 2, 4, 0F); // Box 426
		bodyModel[44].setRotationPoint(-39F, -1F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 156
		bodyModel[45].setRotationPoint(-39F, 1.5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 78, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630 cull thing
		bodyModel[46].setRotationPoint(-39F, 1F, -11F);

		bodyModel[47].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 382
		bodyModel[47].setRotationPoint(8F, 2.25F, -11.25F);
		bodyModel[47].rotateAngleX = -0.29670597F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 457
		bodyModel[48].setRotationPoint(-39F, 6F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[49].setRotationPoint(-39F, 2F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		bodyModel[50].setRotationPoint(-39F, 2F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[51].setRotationPoint(-43.01F, 7F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 481
		bodyModel[52].setRotationPoint(-40F, -1F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482
		bodyModel[53].setRotationPoint(-39F, 6F, 11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[54].setRotationPoint(-39F, 2F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[55].setRotationPoint(-39F, 1F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[56].setRotationPoint(-39F, 1F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		bodyModel[57].setRotationPoint(-43.01F, 7F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 496
		bodyModel[58].setRotationPoint(-43F, 8F, 8F);

		bodyModel[59].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 124
		bodyModel[59].setRotationPoint(-4F, 2.25F, -11.25F);
		bodyModel[59].rotateAngleX = -0.29670597F;

		bodyModel[60].addBox(0F, 0F, 0F, 57, 19, 14, 0F); // Box 6
		bodyModel[60].setRotationPoint(-19F, -20F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[61].setRotationPoint(0F, -21F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[62].setRotationPoint(0F, -21F, 2F);

		bodyModel[63].addBox(0F, 0F, 0F, 17, 1, 4, 0F); // Box 294
		bodyModel[63].setRotationPoint(0F, -21F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[64].setRotationPoint(43.02F, 8F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[65].setRotationPoint(43.01F, 7F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[66].setRotationPoint(43.01F, 7F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[67].setRotationPoint(38F, 1F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 137
		bodyModel[68].setRotationPoint(38F, 2F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 138
		bodyModel[69].setRotationPoint(38F, 6F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[70].setRotationPoint(39F, 1F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 140
		bodyModel[71].setRotationPoint(39F, -1F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 141
		bodyModel[72].setRotationPoint(-43F, 7F, 8F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 142
		bodyModel[73].setRotationPoint(40F, 4.5F, 8F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 143
		bodyModel[74].setRotationPoint(40F, 5.5F, 8F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 144
		bodyModel[75].setRotationPoint(40F, 3F, 8F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 145
		bodyModel[76].setRotationPoint(40F, 2F, 8F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 146
		bodyModel[77].setRotationPoint(40F, 7F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[78].setRotationPoint(40F, 8F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 148
		bodyModel[79].setRotationPoint(40F, 1F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 149
		bodyModel[80].setRotationPoint(40F, -1F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 150
		bodyModel[81].setRotationPoint(40F, -1F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 151
		bodyModel[82].setRotationPoint(40F, 1F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 152
		bodyModel[83].setRotationPoint(40F, 3F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 153
		bodyModel[84].setRotationPoint(40F, 2F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 154
		bodyModel[85].setRotationPoint(40F, 4.5F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 155
		bodyModel[86].setRotationPoint(40F, 5.5F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[87].setRotationPoint(40F, 8F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 157
		bodyModel[88].setRotationPoint(40F, 7F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[89].setRotationPoint(38F, 1F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 159
		bodyModel[90].setRotationPoint(38F, 2F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 160
		bodyModel[91].setRotationPoint(38F, 6F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 161
		bodyModel[92].setRotationPoint(39F, 1F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[93].setRotationPoint(39F, -1F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 19, 2, 14, 0F); // Box 96
		bodyModel[94].setRotationPoint(-19F, -22F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[95].setRotationPoint(-37F, -13F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[96].setRotationPoint(-40.5F, -13F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 282
		bodyModel[97].setRotationPoint(-41.5F, -13F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[98].setRotationPoint(-41.5F, -13F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 297
		bodyModel[99].setRotationPoint(-41.5F, -14.25F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
		bodyModel[100].setRotationPoint(-37F, -14.25F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 299
		bodyModel[101].setRotationPoint(-37F, -14.25F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, -0.5F, -1F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 300
		bodyModel[102].setRotationPoint(-40.5F, -14.25F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // Box 301
		bodyModel[103].setRotationPoint(-40.5F, -14.25F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 302
		bodyModel[104].setRotationPoint(-41.5F, -14.25F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[105].setRotationPoint(-32F, -5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[106].setRotationPoint(-35F, -5F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[107].setRotationPoint(-36F, -5F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 210
		bodyModel[108].setRotationPoint(-36F, -3F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[109].setRotationPoint(-35F, -5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[110].setRotationPoint(-42.1F, -13.5F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[111].setRotationPoint(-42.1F, -13.5F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[112].setRotationPoint(-41.4F, -13.5F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[113].setRotationPoint(-40F, -13.8F, -5.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[114].setRotationPoint(-40F, -13.8F, 1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[115].setRotationPoint(-40F, -13.8F, 5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[116].setRotationPoint(-40F, -13.8F, -5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[117].setRotationPoint(-41F, -10.5F, -5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 222
		bodyModel[118].setRotationPoint(-41F, -10.5F, -5.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[119].setRotationPoint(-41F, -10.5F, 5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[120].setRotationPoint(-41F, -10.5F, 1.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[121].setRotationPoint(10F, -22.5F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[122].setRotationPoint(9.5F, -21.5F, -3.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[123].setRotationPoint(10F, -23.5F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[124].setRotationPoint(-19F, -5F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 232
		bodyModel[125].setRotationPoint(-3F, -3F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[126].setRotationPoint(-38.5F, -12.5F, 7.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[127].setRotationPoint(-36.5F, -10.5F, 6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[128].setRotationPoint(-40.5F, -14F, -1F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 258
		bodyModel[129].setRotationPoint(-39F, -9F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[130].setRotationPoint(-37F, -9F, -11.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[131].setRotationPoint(-35F, -13F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 246
		bodyModel[132].setRotationPoint(-39F, -9F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[133].setRotationPoint(-37F, -9F, 11.01F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[134].setRotationPoint(-35F, -13F, 11F);

		bodyModel[135].addBox(0F, 0F, 0F, 45, 8, 0, 0F); // Box 251
		bodyModel[135].setRotationPoint(-6F, -9F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 252
		bodyModel[136].setRotationPoint(40.01F, -6F, -11.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 253
		bodyModel[137].setRotationPoint(40.01F, -9F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 277
		bodyModel[138].setRotationPoint(1F, -9F, 11F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 278
		bodyModel[139].setRotationPoint(40.01F, -9F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[140].setRotationPoint(40.01F, -6F, 10.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 280
		bodyModel[141].setRotationPoint(-4F, -9F, 11.01F);

		bodyModel[142].addBox(0F, 0F, 0F, 17, 8, 0, 0F); // Box 281
		bodyModel[142].setRotationPoint(-19F, -13F, 11F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 282
		bodyModel[143].setRotationPoint(-3F, -5F, 11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 418
		bodyModel[144].setRotationPoint(7.5F, -21.5F, -6.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[145].setRotationPoint(6F, -22.25F, -5.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[146].setRotationPoint(5F, -22.5F, -6.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[147].setRotationPoint(7F, -22.25F, -7.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[148].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[149].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[150].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[151].setRotationPoint(-33.5F, -23.5F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[152].setRotationPoint(-33.5F, -23F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[153].setRotationPoint(-39.5F, -13.75F, 4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[154].setRotationPoint(-26F, -23F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[155].setRotationPoint(-26F, -23F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[156].setRotationPoint(-23F, -23F, 0F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[157].setRotationPoint(-29.5F, -23.5F, -4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[158].setRotationPoint(-40F, -9F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[159].setRotationPoint(-40F, -9F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[160].setRotationPoint(39F, -9F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[161].setRotationPoint(39F, -9F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[162].setRotationPoint(-44F, -0.5F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[163].setRotationPoint(-44F, -0.5F, 4F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 440 honse m-2
		bodyModel[164].setRotationPoint(-43.25F, 0.5F, -5.5F);
		bodyModel[164].rotateAngleZ = -0.59341195F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[165].setRotationPoint(-26F, -23F, 0F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[166].setRotationPoint(4F, -22.5F, -0.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[167].setRotationPoint(5F, -22.25F, 0.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[168].setRotationPoint(4.5F, -22.25F, -1.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[169].setRotationPoint(6.5F, -21.5F, -0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 443
		bodyModel[170].setRotationPoint(5.5F, -23.25F, 0.25F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 444
		bodyModel[171].setRotationPoint(5.5F, -23.25F, -1.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 350
		bodyModel[172].setRotationPoint(42.5F, -0.5F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351
		bodyModel[173].setRotationPoint(42.5F, -0.5F, -6F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[174].setRotationPoint(43.25F, 0.5F, -5.5F);
		bodyModel[174].rotateAngleZ = 0.62831853F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[175].setRotationPoint(-39.5F, -13.75F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[176].setRotationPoint(-24.8F, -15F, 1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[177].setRotationPoint(-31.5F, -13F, 3F);
		bodyModel[177].rotateAngleY = -0.45378561F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[178].setRotationPoint(-31.5F, -15F, 3F);
		bodyModel[178].rotateAngleY = -0.45378561F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[179].setRotationPoint(-31.5F, -9F, 3F);
		bodyModel[179].rotateAngleY = -0.45378561F;

		bodyModel[180].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[180].setRotationPoint(-31F, -18F, 6.5F);
		//bodyModel[180].rotateAngleY = 0.17453293F;

		bodyModel[181].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[181].setRotationPoint(-28F, -17.25F, 3F);
		bodyModel[181].rotateAngleY = 0.78539816F;

		bodyModel[182].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[182].setRotationPoint(-28F, -17.25F, 3F);
		bodyModel[182].rotateAngleY = 0.78539816F;

		bodyModel[183].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[183].setRotationPoint(-31F, -13F, -3.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[184].setRotationPoint(-31F, -20F, -0.5F);
		bodyModel[184].rotateAngleY = 0.43633231F;

		bodyModel[185].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 530 not a fridge
		bodyModel[185].setRotationPoint(-21F, -21F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[186].setRotationPoint(-37F, -13F, 6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[187].setRotationPoint(-33F, -13F, 6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[188].setRotationPoint(-35F, -5F, 6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[189].setRotationPoint(-35F, -13F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[190].setRotationPoint(-34.5F, -11.5F, 6F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[191].setRotationPoint(-34F, -9.5F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[192].setRotationPoint(-35F, -12F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Box 193
		bodyModel[193].setRotationPoint(-43F, 2F, -3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 2F, 0F); // Box 273
		bodyModel[194].setRotationPoint(38F, 2F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[195].setRotationPoint(17F, 1F, -10.5F);
		bodyModel[195].rotateAngleY = 1.57079633F;
		bodyModel[195].rotateAngleZ = -0.31415927F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[196].setRotationPoint(35F, 1F, -10.5F);
		bodyModel[196].rotateAngleY = 1.57079633F;
		bodyModel[196].rotateAngleZ = -0.31415927F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[197].setRotationPoint(-46F, 4F, 2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[198].setRotationPoint(-46.5F, 4F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[199].setRotationPoint(-46F, 5F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[200].setRotationPoint(-46F, 5F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[201].setRotationPoint(-21F, -19.5F, 0.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[202].setRotationPoint(-31F, -19F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[203].setRotationPoint(-31F, -19F, 10F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[204].setRotationPoint(-20F, -19F, -11F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[205].setRotationPoint(-32F, -19F, -7F);

		bodyModel[206].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[206].setRotationPoint(-31.5F, -19F, -10.5F);

		bodyModel[207].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[207].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 266
		bodyModel[208].setRotationPoint(-32F, -22F, -7F);

		bodyModel[209].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[209].setRotationPoint(-31F, -22F, -11F);

		bodyModel[210].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[210].setRotationPoint(-30F, -22F, -11F);

		bodyModel[211].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[211].setRotationPoint(-19F, -22F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[212].setRotationPoint(-31F, -20F, -11F);

		bodyModel[213].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[213].setRotationPoint(-31F, -22F, 7F);

		bodyModel[214].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F); // Box 377
		bodyModel[214].setRotationPoint(-30F, -22F, 7F);

		bodyModel[215].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[215].setRotationPoint(-19F, -22F, 7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[216].setRotationPoint(-31F, -20F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[217].setRotationPoint(-33F, -21F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[218].setRotationPoint(-34F, -21.2F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[219].setRotationPoint(-34F, -21.2F, 0F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 296
		bodyModel[220].setRotationPoint(-33.25F, -21.2F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, -5.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117 numberboard
		bodyModel[221].setRotationPoint(-33.2F, -21.37F, -2F);
		bodyModel[221].rotateAngleY = 0.09162979F;

		bodyModel[222].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 118 numberboard
		bodyModel[222].setRotationPoint(-33.2F, -21.37F, 2F);
		bodyModel[222].rotateAngleY = -0.09162979F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[223].setRotationPoint(-33F, -21F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 372
		bodyModel[224].setRotationPoint(-33F, -20F, -9.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[225].setRotationPoint(-33F, -21F, -9.75F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301 markerlight glow
		bodyModel[226].setRotationPoint(-32.7F, -20.5F, -9F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 344 markerlight glow
		bodyModel[227].setRotationPoint(-32.7F, -20.5F, 8F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 368
		bodyModel[228].setRotationPoint(-32F, -21F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 419
		bodyModel[229].setRotationPoint(-33F, -21F, -7.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 420
		bodyModel[230].setRotationPoint(-33F, -20F, 7.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 421
		bodyModel[231].setRotationPoint(-33F, -21F, 7.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 422
		bodyModel[232].setRotationPoint(-33F, -21F, 6.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 425
		bodyModel[233].setRotationPoint(-33F, -21F, 2F);

		bodyModel[234].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[234].setRotationPoint(17F, -22F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[235].setRotationPoint(21F, -18F, 7F);

		bodyModel[236].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 127
		bodyModel[236].setRotationPoint(17F, -19F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[237].setRotationPoint(21F, -18F, -9F);

		bodyModel[238].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 130
		bodyModel[238].setRotationPoint(17F, -19F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[239].setRotationPoint(17F, -19F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[240].setRotationPoint(17F, -19F, 9F);

		bodyModel[241].addBox(0F, -1F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[241].setRotationPoint(17F, -20F, -11F);

		bodyModel[242].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[242].setRotationPoint(17F, -22F, 0F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[243].setRotationPoint(38.5F, -19.25F, -8.75F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[244].setRotationPoint(38.5F, -19.25F, 7.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[245].setRotationPoint(39F, -21F, -7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[246].setRotationPoint(39F, -21F, 0F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 131
		bodyModel[247].setRotationPoint(38F, -14F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[248].setRotationPoint(41F, -21.5F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[249].setRotationPoint(40.5F, -21.55F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[250].setRotationPoint(40.5F, -19.55F, -1F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 132
		bodyModel[251].setRotationPoint(38F, -21F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[252].setRotationPoint(40F, -22F, -7F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[253].setRotationPoint(38F, -17F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, -0.5F, -2F, 1F, -0.5F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[254].setRotationPoint(40F, -22F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[255].setRotationPoint(38F, -22F, -1F);

		bodyModel[256].addShapeBox(-1F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 415 D9 intake
		bodyModel[256].setRotationPoint(-7.75F, -21F, -7.37F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 20, 10, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -10F, -5F, 0F, -10F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[257].setRotationPoint(-19F, -21.5F, -7.01F);

		bodyModel[258].addShapeBox(-1F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[258].setRotationPoint(-7.75F, -21F, 6.37F);

		bodyModel[259].addShapeBox(0F, 0F, 0.5F, 36, 1, 19, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547
		bodyModel[259].setRotationPoint(20F, -22.4F, 1F);
		bodyModel[259].rotateAngleX = -0.13613568F;

		bodyModel[260].addShapeBox(0F, 0F, -19.5F, 36, 1, 19, 0F,0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[260].setRotationPoint(20F, -22.4F, -1F);
		bodyModel[260].rotateAngleX = 0.13613568F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[261].setRotationPoint(-30F, -17.5F, -11F);
		bodyModel[261].rotateAngleX = -0.61086524F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[262].setRotationPoint(-30F, -17.5F, 11F);
		bodyModel[262].rotateAngleX = 0.61086524F;

		bodyModel[263].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[263].setRotationPoint(-28F, -16F, -12F);

		bodyModel[264].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 408
		bodyModel[264].setRotationPoint(-28F, -16F, 11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[265].setRotationPoint(-28F, -17F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[266].setRotationPoint(-28F, -18F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254 D9 WALKWAY
		bodyModel[267].setRotationPoint(-19F, -5F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 367
		bodyModel[268].setRotationPoint(-11F, -9F, -11.01F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 10, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[269].setRotationPoint(-19F, -19F, -11.01F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[270].setRotationPoint(41F, -17.5F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 422 headlight low early glow
		bodyModel[271].setRotationPoint(40.5F, -17.55F, -1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 423 headlight low early glow
		bodyModel[272].setRotationPoint(40.5F, -15.55F, -1F);

		bodyModel[273].addShapeBox(-1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 numberboard
		bodyModel[273].setRotationPoint(38.55F, -17F, -6F);
		bodyModel[273].rotateAngleY = -0.4712389F;

		bodyModel[274].addBox(-1F, 0F, -4.75F, 1, 2, 5, 0F); // Box 395 numberboard
		bodyModel[274].setRotationPoint(38.55F, -17F, 6F);
		bodyModel[274].rotateAngleY = 0.4712389F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[275].setRotationPoint(39.5F, -22.25F, -0.5F);

		bodyModel[276].addBox(-1F, 0F, -4.75F, 1, 11, 4, 0F); // Box 427 early ladder cull
		bodyModel[276].setRotationPoint(38.95F, -15F, 6F);
		bodyModel[276].rotateAngleY = 0.4712389F;

		bodyModel[277].addShapeBox(-1F, 0F, 0.75F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 early cull ladder
		bodyModel[277].setRotationPoint(38.95F, -15F, -6F);
		bodyModel[277].rotateAngleY = -0.4712389F;

		bodyModel[278].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 460
		bodyModel[278].setRotationPoint(-20F, -21F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 20, 0, 11, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 467
		bodyModel[279].setRotationPoint(-19F, -22.01F, 1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 468 cull widdle guy
		bodyModel[280].setRotationPoint(-9F, -3F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 cull 
		bodyModel[281].setRotationPoint(38F, -15F, -7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glow markerlight crl
		bodyModel[282].setRotationPoint(37.4F, -15F, -7.05F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 345 glow markerlight crl
		bodyModel[283].setRotationPoint(37.4F, -15F, 5.05F);

		bodyModel[284].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 348 glow markerlight sou
		bodyModel[284].setRotationPoint(37.75F, -15F, 5.5F);
		bodyModel[284].rotateAngleY = 0.4712389F;

		bodyModel[285].addShapeBox(-0.25F, 0F, -2.25F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 sou markerlight glow
		bodyModel[285].setRotationPoint(38.5F, -15F, -4.5F);
		bodyModel[285].rotateAngleY = -0.4712389F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[286].setRotationPoint(38.5F, -12.5F, 5.5F);

		bodyModel[287].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[287].setRotationPoint(39F, -15F, -1F);
		bodyModel[287].rotateAngleZ = 0.78539816F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 477 cull
		bodyModel[288].setRotationPoint(38F, -15F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[289].setRotationPoint(-9F, -13F, -11.01F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0.1F, -13F, 0F, 0.1F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -13F, 0F, -1.9F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[290].setRotationPoint(22F, -18F, -9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 483
		bodyModel[291].setRotationPoint(22F, -18F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 162 cull
		bodyModel[292].setRotationPoint(-45F, -1F, -7.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F); // Box 163 cull
		bodyModel[293].setRotationPoint(-45F, -1F, -1.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F); // Box 164 cull
		bodyModel[294].setRotationPoint(-45F, -1F, 1.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 432
		bodyModel[295].setRotationPoint(-44.5F, -9F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 433
		bodyModel[296].setRotationPoint(-44.5F, -9F, 2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[297].setRotationPoint(-45F, -9F, -2F);

		bodyModel[298].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[298].setRotationPoint(-43F, -2F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[299].setRotationPoint(-43F, -9F, -8F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[300].setRotationPoint(-43F, -9F, 9F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[301].setRotationPoint(-43F, -2F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		bodyModel[302].setRotationPoint(-43F, -8F, -8F);
		bodyModel[302].rotateAngleY = 0.33161256F;

		bodyModel[303].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[303].setRotationPoint(-43F, -8F, 8F);
		bodyModel[303].rotateAngleY = -0.33161256F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 441 cull
		bodyModel[304].setRotationPoint(43F, -1F, -7.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F); // Box 442 cull
		bodyModel[305].setRotationPoint(43F, -1F, -1.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 443 cull
		bodyModel[306].setRotationPoint(43F, -1F, 1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 444
		bodyModel[307].setRotationPoint(44.5F, -9F, 2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[308].setRotationPoint(45F, -9F, -2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[309].setRotationPoint(44.5F, -9F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 253
		bodyModel[310].setRotationPoint(43F, -9F, 9F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 254
		bodyModel[311].setRotationPoint(43F, -2F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 256
		bodyModel[312].setRotationPoint(43F, -9F, -8F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 257
		bodyModel[313].setRotationPoint(43F, -2F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 447
		bodyModel[314].setRotationPoint(43F, -8F, -8F);
		bodyModel[314].rotateAngleY = -0.33161256F;

		bodyModel[315].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[315].setRotationPoint(43F, -8F, 8F);
		bodyModel[315].rotateAngleY = 0.33161256F;

		bodyModel[316].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[316].setRotationPoint(-40.01F, -6F, -11.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[317].setRotationPoint(-40.01F, -9F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[318].setRotationPoint(-40.01F, -6F, 10.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 248
		bodyModel[319].setRotationPoint(-40.01F, -9F, 9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 20, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[320].setRotationPoint(-9.5F, 2.5F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 20, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[321].setRotationPoint(-9.5F, 5.5F, -11F);

		bodyModel[322].addBox(0F, 0F, 0F, 20, 4, 16, 0F); // Box 409
		bodyModel[322].setRotationPoint(-9.5F, 5.5F, -8F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 20, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 410
		bodyModel[323].setRotationPoint(-9.5F, 5.5F, 8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[324].setRotationPoint(-28F, -17F, -15F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[325].setRotationPoint(-28F, -18F, -13F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 411
		bodyModel[326].setRotationPoint(-13.25F, 1F, 8.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 412
		bodyModel[327].setRotationPoint(-11.5F, 5F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 413
		bodyModel[328].setRotationPoint(-10.5F, 6F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[329].setRotationPoint(-12.5F, 6F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 cull
		bodyModel[330].setRotationPoint(-10.5F, 2F, 5.5F);
		bodyModel[330].rotateAngleZ = -0.19198622F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 416
		bodyModel[331].setRotationPoint(-12.5F, 3F, -6.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 417
		bodyModel[332].setRotationPoint(-12.5F, 3F, -7F);

		bodyModel[333].addBox(-0.5F, -5F, -1F, 1, 5, 1, 0F); // Box 418 cull
		bodyModel[333].setRotationPoint(-11F, 6.5F, -8.99F);
		bodyModel[333].rotateAngleZ = 0.48869219F;

		bodyModel[334].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 419
		bodyModel[334].setRotationPoint(11.5F, 5F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[335].setRotationPoint(10.5F, 6F, -9F);

		bodyModel[336].addBox(-0.5F, -3F, -1F, 1, 3, 4, 0F); // Box 421 cull
		bodyModel[336].setRotationPoint(12F, 6.5F, -8.99F);
		bodyModel[336].rotateAngleZ = -0.31415927F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 422
		bodyModel[337].setRotationPoint(12.5F, 6F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 423
		bodyModel[338].setRotationPoint(10.5F, 3F, -7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 424
		bodyModel[339].setRotationPoint(12.5F, 3F, -6.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425 cull
		bodyModel[340].setRotationPoint(9.75F, 3.75F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426 cull
		bodyModel[341].setRotationPoint(11.5F, 2F, 5.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[342].setRotationPoint(-44F, -4F, -6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[343].setRotationPoint(-44F, -4F, 4F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[344].setRotationPoint(-44.25F, -4F, -6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[345].setRotationPoint(-44.25F, -4F, 4F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 365 ditchlight glow
		bodyModel[346].setRotationPoint(43.25F, -4F, 4F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[347].setRotationPoint(43F, -4F, 4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ditchlight glow
		bodyModel[348].setRotationPoint(43.25F, -4F, -6F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		bodyModel[349].setRotationPoint(43F, -4F, -6F);

		bodyModel[350].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 450
		bodyModel[350].setRotationPoint(8F, 2.25F, 11.25F);
		bodyModel[350].rotateAngleX = 0.29670597F;

		bodyModel[351].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[351].setRotationPoint(-24F, -23.5F, -2.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull atsf bit
		bodyModel[352].setRotationPoint(-24F, -23.5F, 4.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[353].setRotationPoint(-24F, -24.5F, 6F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[354].setRotationPoint(-23F, -24.5F, 0F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[355].setRotationPoint(-23F, -25.5F, 6F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[356].setRotationPoint(-26F, -24F, 0F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[357].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[358].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[359].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[360].setRotationPoint(-32F, -23.5F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base lifted
		bodyModel[361].setRotationPoint(-32F, -23F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423 support cull
		bodyModel[362].setRotationPoint(-33F, -22F, -1F);

		bodyModel[363].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 466
		bodyModel[363].setRotationPoint(-4F, 2.25F, 11.25F);
		bodyModel[363].rotateAngleX = 0.29670597F;

		bodyModel[364].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[364].setRotationPoint(38F, -23.5F, 1.5F);

		bodyModel[365].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[365].setRotationPoint(39F, -23.5F, 2.5F);

		bodyModel[366].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[366].setRotationPoint(39F, -23.5F, 0.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361 cull
		bodyModel[367].setRotationPoint(39F, -22.5F, 1F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, -0.01, 0);//front
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.56, -0.01, 0);//rear
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_b.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5, -0.01, 0);//front
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.56, -0.01, 0);//rear
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
    public float[] getTrans() {
        return new float[]{-1.525F, 0.155F, 0F}; }

    public ArrayList<double[]> getSmokePosition() {
        return new ArrayList<double[]>() {
            {
                add(new double[]{0.8D, 1.35D, 0.0D});//front
            }
        };
    }
}