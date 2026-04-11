//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.12.2023 - 20:20:00
// Last changed on: 31.12.2023 - 20:20:00

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
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelDash832BWH extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash832BWH() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[407];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 12, 130, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[3] = new ModelRendererTurbo(this, 33, 180, textureX, textureY); // Box 195
		bodyModel[4] = new ModelRendererTurbo(this, 91, 162, textureX, textureY); // Box 199
		bodyModel[5] = new ModelRendererTurbo(this, 78, 158, textureX, textureY); // Box 200
		bodyModel[6] = new ModelRendererTurbo(this, 57, 156, textureX, textureY); // Box 203
		bodyModel[7] = new ModelRendererTurbo(this, 55, 158, textureX, textureY); // Box 204
		bodyModel[8] = new ModelRendererTurbo(this, 54, 167, textureX, textureY); // Box 205
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[10] = new ModelRendererTurbo(this, 470, 166, textureX, textureY); // Box 256
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 267
		bodyModel[13] = new ModelRendererTurbo(this, 67, 169, textureX, textureY); // Box 411
		bodyModel[14] = new ModelRendererTurbo(this, 81, 92, textureX, textureY); // Box 282
		bodyModel[15] = new ModelRendererTurbo(this, 68, 95, textureX, textureY); // Box 283
		bodyModel[16] = new ModelRendererTurbo(this, 107, 88, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 94, 90, textureX, textureY); // Box 322
		bodyModel[18] = new ModelRendererTurbo(this, 70, 84, textureX, textureY); // Box 280
		bodyModel[19] = new ModelRendererTurbo(this, 81, 82, textureX, textureY); // Box 285
		bodyModel[20] = new ModelRendererTurbo(this, 41, 90, textureX, textureY); // Box 727
		bodyModel[21] = new ModelRendererTurbo(this, 28, 92, textureX, textureY); // Box 728
		bodyModel[22] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 729
		bodyModel[23] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Box 730
		bodyModel[24] = new ModelRendererTurbo(this, 15, 84, textureX, textureY); // Box 732
		bodyModel[25] = new ModelRendererTurbo(this, 4, 86, textureX, textureY); // Box 734
		bodyModel[26] = new ModelRendererTurbo(this, 78, 161, textureX, textureY); // Box 201
		bodyModel[27] = new ModelRendererTurbo(this, 55, 161, textureX, textureY); // Box 202
		bodyModel[28] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 293
		bodyModel[29] = new ModelRendererTurbo(this, 68, 159, textureX, textureY); // Box 294
		bodyModel[30] = new ModelRendererTurbo(this, 78, 164, textureX, textureY); // Box 392
		bodyModel[31] = new ModelRendererTurbo(this, 91, 165, textureX, textureY); // Box 393
		bodyModel[32] = new ModelRendererTurbo(this, 67, 165, textureX, textureY); // Box 394
		bodyModel[33] = new ModelRendererTurbo(this, 55, 164, textureX, textureY); // Box 395
		bodyModel[34] = new ModelRendererTurbo(this, 13, 142, textureX, textureY); // box65
		bodyModel[35] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[36] = new ModelRendererTurbo(this, 187, 88, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[37] = new ModelRendererTurbo(this, 391, 105, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[38] = new ModelRendererTurbo(this, 391, 105, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[39] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[40] = new ModelRendererTurbo(this, 391, 105, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[41] = new ModelRendererTurbo(this, 187, 88, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[42] = new ModelRendererTurbo(this, 391, 105, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[43] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 209, 62, textureX, textureY); // Box 251
		bodyModel[45] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 424
		bodyModel[46] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 426
		bodyModel[47] = new ModelRendererTurbo(this, 276, 82, textureX, textureY); // Box 156
		bodyModel[48] = new ModelRendererTurbo(this, 217, 173, textureX, textureY, "cull"); // Box 630 cull thing
		bodyModel[49] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 382
		bodyModel[50] = new ModelRendererTurbo(this, 368, 118, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[51] = new ModelRendererTurbo(this, 44, 173, textureX, textureY); // Box 457
		bodyModel[52] = new ModelRendererTurbo(this, 44, 167, textureX, textureY); // Box 458
		bodyModel[53] = new ModelRendererTurbo(this, 53, 147, textureX, textureY); // Box 462
		bodyModel[54] = new ModelRendererTurbo(this, 41, 173, textureX, textureY); // Box 482
		bodyModel[55] = new ModelRendererTurbo(this, 41, 167, textureX, textureY); // Box 483
		bodyModel[56] = new ModelRendererTurbo(this, 41, 165, textureX, textureY); // Box 485
		bodyModel[57] = new ModelRendererTurbo(this, 50, 147, textureX, textureY); // Box 495
		bodyModel[58] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 496
		bodyModel[59] = new ModelRendererTurbo(this, 377, 111, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 276, 2, textureX, textureY); // Box 6
		bodyModel[61] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 292
		bodyModel[62] = new ModelRendererTurbo(this, 209, 4, textureX, textureY); // Box 293
		bodyModel[63] = new ModelRendererTurbo(this, 210, 11, textureX, textureY); // Box 294
		bodyModel[64] = new ModelRendererTurbo(this, 471, 178, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 44, 147, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 141
		bodyModel[68] = new ModelRendererTurbo(this, 91, 165, textureX, textureY); // Box 142
		bodyModel[69] = new ModelRendererTurbo(this, 78, 164, textureX, textureY); // Box 143
		bodyModel[70] = new ModelRendererTurbo(this, 78, 161, textureX, textureY); // Box 144
		bodyModel[71] = new ModelRendererTurbo(this, 90, 159, textureX, textureY); // Box 145
		bodyModel[72] = new ModelRendererTurbo(this, 91, 169, textureX, textureY); // Box 146
		bodyModel[73] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 78, 158, textureX, textureY); // Box 148
		bodyModel[75] = new ModelRendererTurbo(this, 91, 162, textureX, textureY); // Box 149
		bodyModel[76] = new ModelRendererTurbo(this, 57, 156, textureX, textureY); // Box 150
		bodyModel[77] = new ModelRendererTurbo(this, 55, 158, textureX, textureY); // Box 151
		bodyModel[78] = new ModelRendererTurbo(this, 55, 161, textureX, textureY); // Box 152
		bodyModel[79] = new ModelRendererTurbo(this, 68, 159, textureX, textureY); // Box 153
		bodyModel[80] = new ModelRendererTurbo(this, 67, 165, textureX, textureY); // Box 154
		bodyModel[81] = new ModelRendererTurbo(this, 55, 164, textureX, textureY); // Box 155
		bodyModel[82] = new ModelRendererTurbo(this, 54, 167, textureX, textureY); // Box 156
		bodyModel[83] = new ModelRendererTurbo(this, 67, 169, textureX, textureY); // Box 157
		bodyModel[84] = new ModelRendererTurbo(this, 414, 42, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 367, 99, textureX, textureY); // Box 18 late stack
		bodyModel[86] = new ModelRendererTurbo(this, 380, 96, textureX, textureY); // Box 21 late stack
		bodyModel[87] = new ModelRendererTurbo(this, 367, 91, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[88] = new ModelRendererTurbo(this, 72, 247, textureX, textureY); // Box 231
		bodyModel[89] = new ModelRendererTurbo(this, 76, 216, textureX, textureY); // Box 232
		bodyModel[90] = new ModelRendererTurbo(this, 78, 50, textureX, textureY); // Box 251
		bodyModel[91] = new ModelRendererTurbo(this, 509, 165, textureX, textureY); // Box 252
		bodyModel[92] = new ModelRendererTurbo(this, 465, 168, textureX, textureY); // Box 253
		bodyModel[93] = new ModelRendererTurbo(this, 118, 38, textureX, textureY); // Box 277
		bodyModel[94] = new ModelRendererTurbo(this, 460, 168, textureX, textureY); // Box 278
		bodyModel[95] = new ModelRendererTurbo(this, 506, 165, textureX, textureY); // Box 279
		bodyModel[96] = new ModelRendererTurbo(this, 82, 48, textureX, textureY); // Box 280
		bodyModel[97] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 281
		bodyModel[98] = new ModelRendererTurbo(this, 99, 47, textureX, textureY); // Box 282
		bodyModel[99] = new ModelRendererTurbo(this, 329, 207, textureX, textureY); // Box 361
		bodyModel[100] = new ModelRendererTurbo(this, 327, 198, textureX, textureY); // Box 362
		bodyModel[101] = new ModelRendererTurbo(this, 328, 204, textureX, textureY); // Box 363
		bodyModel[102] = new ModelRendererTurbo(this, 328, 201, textureX, textureY); // Box 364
		bodyModel[103] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[104] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[105] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[106] = new ModelRendererTurbo(this, 497, 111, textureX, textureY); // Box 361
		bodyModel[107] = new ModelRendererTurbo(this, 93, 48, textureX, textureY); // Box 328
		bodyModel[108] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 329
		bodyModel[109] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 398 you tellin me this is a MU plug?
		bodyModel[110] = new ModelRendererTurbo(this, 5, 153, textureX, textureY); // Box 398 no fuckin way this is a MU plug
		bodyModel[111] = new ModelRendererTurbo(this, 480, 163, textureX, textureY); // Box 350
		bodyModel[112] = new ModelRendererTurbo(this, 473, 163, textureX, textureY); // Box 351
		bodyModel[113] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 352
		bodyModel[114] = new ModelRendererTurbo(this, 53, 3, textureX, textureY); // Box 193
		bodyModel[115] = new ModelRendererTurbo(this, 30, 3, textureX, textureY); // Box 273
		bodyModel[116] = new ModelRendererTurbo(this, 343, 82, textureX, textureY); // Box 408 lot of little pipes 3b
		bodyModel[117] = new ModelRendererTurbo(this, 357, 84, textureX, textureY); // Box 409 lot of little pipes 3c
		bodyModel[118] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 4
		bodyModel[119] = new ModelRendererTurbo(this, 33, 70, textureX, textureY); // Box 4
		bodyModel[120] = new ModelRendererTurbo(this, 18, 72, textureX, textureY); // Box 448
		bodyModel[121] = new ModelRendererTurbo(this, 48, 72, textureX, textureY); // Box 449
		bodyModel[122] = new ModelRendererTurbo(this, 288, 228, textureX, textureY); // Box 88
		bodyModel[123] = new ModelRendererTurbo(this, 398, 221, textureX, textureY); // Box 119
		bodyModel[124] = new ModelRendererTurbo(this, 235, 244, textureX, textureY); // Box 127
		bodyModel[125] = new ModelRendererTurbo(this, 398, 214, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 235, 250, textureX, textureY); // Box 130
		bodyModel[127] = new ModelRendererTurbo(this, 237, 236, textureX, textureY); // Box 135
		bodyModel[128] = new ModelRendererTurbo(this, 237, 240, textureX, textureY); // Box 136
		bodyModel[129] = new ModelRendererTurbo(this, 344, 228, textureX, textureY); // Box 233
		bodyModel[130] = new ModelRendererTurbo(this, 288, 242, textureX, textureY); // Box 312
		bodyModel[131] = new ModelRendererTurbo(this, 475, 7, textureX, textureY); // Box 398
		bodyModel[132] = new ModelRendererTurbo(this, 475, 4, textureX, textureY); // Box 399
		bodyModel[133] = new ModelRendererTurbo(this, 413, 81, textureX, textureY); // Box 124
		bodyModel[134] = new ModelRendererTurbo(this, 443, 81, textureX, textureY); // Box 130
		bodyModel[135] = new ModelRendererTurbo(this, 432, 94, textureX, textureY); // Box 131
		bodyModel[136] = new ModelRendererTurbo(this, 468, 7, textureX, textureY); // Box 31
		bodyModel[137] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[138] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[139] = new ModelRendererTurbo(this, 432, 80, textureX, textureY); // Box 132
		bodyModel[140] = new ModelRendererTurbo(this, 424, 65, textureX, textureY); // Box 173
		bodyModel[141] = new ModelRendererTurbo(this, 432, 88, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[142] = new ModelRendererTurbo(this, 414, 67, textureX, textureY); // Box 133
		bodyModel[143] = new ModelRendererTurbo(this, 414, 52, textureX, textureY); // Box 294
		bodyModel[144] = new ModelRendererTurbo(this, 163, 208, textureX, textureY); // Box 305 40 tancc
		bodyModel[145] = new ModelRendererTurbo(this, 389, 104, textureX, textureY); // Box 305 shared air system
		bodyModel[146] = new ModelRendererTurbo(this, 389, 112, textureX, textureY, "cull"); // Box 305 cull shared air system
		bodyModel[147] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 305 shared air system
		bodyModel[148] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 305 shared air system
		bodyModel[149] = new ModelRendererTurbo(this, 389, 104, textureX, textureY); // Box 305 shared air system
		bodyModel[150] = new ModelRendererTurbo(this, 385, 86, textureX, textureY, "cull"); // Box 305 cull shared air system
		bodyModel[151] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 305 shared air system
		bodyModel[152] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 305 shared air system
		bodyModel[153] = new ModelRendererTurbo(this, 414, 109, textureX, textureY, "cull"); // Box 305 cull shared air system
		bodyModel[154] = new ModelRendererTurbo(this, 396, 95, textureX, textureY, "cull"); // Box 305 cull shared air system
		bodyModel[155] = new ModelRendererTurbo(this, 414, 213, textureX, textureY); // Box 547
		bodyModel[156] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 345
		bodyModel[157] = new ModelRendererTurbo(this, 180, 101, textureX, textureY); // Box 254 D9 WALKWAY
		bodyModel[158] = new ModelRendererTurbo(this, 51, 44, textureX, textureY); // Box 425
		bodyModel[159] = new ModelRendererTurbo(this, 446, 13, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[160] = new ModelRendererTurbo(this, 446, 13, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[161] = new ModelRendererTurbo(this, 487, 119, textureX, textureY); // Box 318
		bodyModel[162] = new ModelRendererTurbo(this, 141, 235, textureX, textureY); // Box 305 40 tancc
		bodyModel[163] = new ModelRendererTurbo(this, 206, 200, textureX, textureY); // Box 305 40 tancc
		bodyModel[164] = new ModelRendererTurbo(this, 238, 209, textureX, textureY); // Box 305 40 tancc
		bodyModel[165] = new ModelRendererTurbo(this, 315, 218, textureX, textureY); // Box 81
		bodyModel[166] = new ModelRendererTurbo(this, 315, 221, textureX, textureY); // Box 82
		bodyModel[167] = new ModelRendererTurbo(this, 306, 221, textureX, textureY); // Box 83
		bodyModel[168] = new ModelRendererTurbo(this, 306, 218, textureX, textureY); // Box 84
		bodyModel[169] = new ModelRendererTurbo(this, 306, 224, textureX, textureY); // Box 85
		bodyModel[170] = new ModelRendererTurbo(this, 159, 63, textureX, textureY); // Box 361
		bodyModel[171] = new ModelRendererTurbo(this, 504, 112, textureX, textureY, "cull"); // Box 190 cull
		bodyModel[172] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 339 glow markerlight crl
		bodyModel[173] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 345 glow markerlight crl
		bodyModel[174] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 349 now heres the glower glow
		bodyModel[175] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 349 now heres the glower glow
		bodyModel[176] = new ModelRendererTurbo(this, 456, 134, textureX, textureY); // Box 384
		bodyModel[177] = new ModelRendererTurbo(this, 503, 129, textureX, textureY); // Box 219
		bodyModel[178] = new ModelRendererTurbo(this, 504, 107, textureX, textureY, "cull"); // Box 477 cull
		bodyModel[179] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 482
		bodyModel[180] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 483
		bodyModel[181] = new ModelRendererTurbo(this, 87, 140, textureX, textureY); // Box 432
		bodyModel[182] = new ModelRendererTurbo(this, 65, 140, textureX, textureY); // Box 433
		bodyModel[183] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 434
		bodyModel[184] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[185] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[186] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[187] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[188] = new ModelRendererTurbo(this, 87, 143, textureX, textureY); // Box 435
		bodyModel[189] = new ModelRendererTurbo(this, 90, 143, textureX, textureY); // Box 436
		bodyModel[190] = new ModelRendererTurbo(this, 452, 116, textureX, textureY, "cull"); // Box 441 cull
		bodyModel[191] = new ModelRendererTurbo(this, 463, 117, textureX, textureY, "cull"); // Box 442 cull
		bodyModel[192] = new ModelRendererTurbo(this, 469, 116, textureX, textureY, "cull"); // Box 443 cull
		bodyModel[193] = new ModelRendererTurbo(this, 494, 137, textureX, textureY); // Box 444
		bodyModel[194] = new ModelRendererTurbo(this, 485, 139, textureX, textureY); // Box 445
		bodyModel[195] = new ModelRendererTurbo(this, 472, 137, textureX, textureY); // Box 446
		bodyModel[196] = new ModelRendererTurbo(this, 506, 171, textureX, textureY); // Box 253
		bodyModel[197] = new ModelRendererTurbo(this, 509, 172, textureX, textureY); // Box 254
		bodyModel[198] = new ModelRendererTurbo(this, 472, 171, textureX, textureY); // Box 256
		bodyModel[199] = new ModelRendererTurbo(this, 469, 172, textureX, textureY); // Box 257
		bodyModel[200] = new ModelRendererTurbo(this, 477, 140, textureX, textureY); // Box 447
		bodyModel[201] = new ModelRendererTurbo(this, 499, 140, textureX, textureY); // Box 448
		bodyModel[202] = new ModelRendererTurbo(this, 15, 117, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[203] = new ModelRendererTurbo(this, 27, 112, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[204] = new ModelRendererTurbo(this, 33, 117, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[205] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 410
		bodyModel[206] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 411
		bodyModel[207] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f glow
		bodyModel[208] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f glow
		bodyModel[209] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 551 ditchlight glow
		bodyModel[210] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 550 ditchlight glow
		bodyModel[211] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 549
		bodyModel[212] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 548
		bodyModel[213] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 365 ditchlight glow
		bodyModel[214] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 366
		bodyModel[215] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 367 ditchlight glow
		bodyModel[216] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 368
		bodyModel[217] = new ModelRendererTurbo(this, 377, 116, textureX, textureY); // Box 450
		bodyModel[218] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 462
		bodyModel[219] = new ModelRendererTurbo(this, 82, 121, textureX, textureY, BoxName.ditch); // Box 463 ditchlight glow
		bodyModel[220] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 464
		bodyModel[221] = new ModelRendererTurbo(this, 82, 121, textureX, textureY, BoxName.ditch); // Box 465 ditchlight glow
		bodyModel[222] = new ModelRendererTurbo(this, 368, 111, textureX, textureY); // Box 466
		bodyModel[223] = new ModelRendererTurbo(this, 47, 183, textureX, textureY); // Box 94
		bodyModel[224] = new ModelRendererTurbo(this, 150, 116, textureX, textureY); // Box 100
		bodyModel[225] = new ModelRendererTurbo(this, 104, 70, textureX, textureY); // Box 112
		bodyModel[226] = new ModelRendererTurbo(this, 179, 62, textureX, textureY); // Box 120
		bodyModel[227] = new ModelRendererTurbo(this, 78, 224, textureX, textureY); // Box 1
		bodyModel[228] = new ModelRendererTurbo(this, 97, 226, textureX, textureY); // Box 99
		bodyModel[229] = new ModelRendererTurbo(this, 104, 226, textureX, textureY); // Box 135
		bodyModel[230] = new ModelRendererTurbo(this, 40, 187, textureX, textureY); // Box 150
		bodyModel[231] = new ModelRendererTurbo(this, 75, 187, textureX, textureY); // Box 152
		bodyModel[232] = new ModelRendererTurbo(this, 75, 201, textureX, textureY); // Box 153
		bodyModel[233] = new ModelRendererTurbo(this, 40, 201, textureX, textureY); // Box 154
		bodyModel[234] = new ModelRendererTurbo(this, 108, 62, textureX, textureY); // Box 119
		bodyModel[235] = new ModelRendererTurbo(this, 51, 224, textureX, textureY); // Box 120
		bodyModel[236] = new ModelRendererTurbo(this, 179, 70, textureX, textureY); // Box 121
		bodyModel[237] = new ModelRendererTurbo(this, 54, 87, textureX, textureY); // Box 177
		bodyModel[238] = new ModelRendererTurbo(this, 168, 61, textureX, textureY); // Box 314 door swing right
		bodyModel[239] = new ModelRendererTurbo(this, 2, 193, textureX, textureY); // Box 210
		bodyModel[240] = new ModelRendererTurbo(this, 125, 94, textureX, textureY); // Box 267
		bodyModel[241] = new ModelRendererTurbo(this, 1, 228, textureX, textureY); // Box 137
		bodyModel[242] = new ModelRendererTurbo(this, 94, 69, textureX, textureY); // Box 310 schnozz door
		bodyModel[243] = new ModelRendererTurbo(this, 143, 117, textureX, textureY); // Box 311
		bodyModel[244] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Box 315
		bodyModel[245] = new ModelRendererTurbo(this, 169, 103, textureX, textureY); // Box 309
		bodyModel[246] = new ModelRendererTurbo(this, 128, 83, textureX, textureY); // Box 313
		bodyModel[247] = new ModelRendererTurbo(this, 137, 82, textureX, textureY); // Box 314
		bodyModel[248] = new ModelRendererTurbo(this, 164, 82, textureX, textureY); // Box 315
		bodyModel[249] = new ModelRendererTurbo(this, 164, 88, textureX, textureY); // Box 318
		bodyModel[250] = new ModelRendererTurbo(this, 100, 120, textureX, textureY); // Box 21
		bodyModel[251] = new ModelRendererTurbo(this, 100, 106, textureX, textureY); // Box 269
		bodyModel[252] = new ModelRendererTurbo(this, 100, 113, textureX, textureY); // Box 313
		bodyModel[253] = new ModelRendererTurbo(this, 89, 120, textureX, textureY); // Box 314
		bodyModel[254] = new ModelRendererTurbo(this, 89, 114, textureX, textureY); // Box 310
		bodyModel[255] = new ModelRendererTurbo(this, 114, 125, textureX, textureY); // Box 172
		bodyModel[256] = new ModelRendererTurbo(this, 106, 122, textureX, textureY, "lamp"); // Box 242 numberboard top
		bodyModel[257] = new ModelRendererTurbo(this, 114, 125, textureX, textureY); // Box 317
		bodyModel[258] = new ModelRendererTurbo(this, 106, 122, textureX, textureY, "lamp"); // Box 318 numerboard top
		bodyModel[259] = new ModelRendererTurbo(this, 97, 221, textureX, textureY, "lamp"); // Box 154 headlight nose
		bodyModel[260] = new ModelRendererTurbo(this, 97, 221, textureX, textureY, "lamp"); // Box 155 headlight nose
		bodyModel[261] = new ModelRendererTurbo(this, 68, 227, textureX, textureY); // Box 312 nose cover
		bodyModel[262] = new ModelRendererTurbo(this, 75, 227, textureX, textureY); // Box 122
		bodyModel[263] = new ModelRendererTurbo(this, 126, 249, textureX, textureY); // Box 352 cabmount assembly
		bodyModel[264] = new ModelRendererTurbo(this, 112, 233, textureX, textureY, "lamp"); // Box 353 headlight high
		bodyModel[265] = new ModelRendererTurbo(this, 112, 233, textureX, textureY, "lamp"); // Box 354 headlight high
		bodyModel[266] = new ModelRendererTurbo(this, 423, 22, textureX, textureY); // Box 96
		bodyModel[267] = new ModelRendererTurbo(this, 260, 230, textureX, textureY); // Box 415 D9 intake
		bodyModel[268] = new ModelRendererTurbo(this, 256, 224, textureX, textureY); // Box 415
		bodyModel[269] = new ModelRendererTurbo(this, 189, 128, textureX, textureY); // Box 261
		bodyModel[270] = new ModelRendererTurbo(this, 189, 115, textureX, textureY); // Box 416
		bodyModel[271] = new ModelRendererTurbo(this, 178, 139, textureX, textureY); // Box 467
		bodyModel[272] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "cull"); // Box 305 cull shared air system
		bodyModel[273] = new ModelRendererTurbo(this, 100, 185, textureX, textureY); // Box 32 tancc
		bodyModel[274] = new ModelRendererTurbo(this, 98, 215, textureX, textureY); // Box 32 tancc
		bodyModel[275] = new ModelRendererTurbo(this, 145, 224, textureX, textureY); // Box 32 tancc
		bodyModel[276] = new ModelRendererTurbo(this, 145, 215, textureX, textureY); // Box 32 tancc
		bodyModel[277] = new ModelRendererTurbo(this, 156, 182, textureX, textureY); // Box 342 32 fuses
		bodyModel[278] = new ModelRendererTurbo(this, 81, 61, textureX, textureY); // Box 69 schnozz door
		bodyModel[279] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 94 schnozz door
		bodyModel[280] = new ModelRendererTurbo(this, 89, 62, textureX, textureY); // Box 95 schnozz door
		bodyModel[281] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Box 253
		bodyModel[282] = new ModelRendererTurbo(this, 49, 181, textureX, textureY); // Box 408
		bodyModel[283] = new ModelRendererTurbo(this, 65, 191, textureX, textureY); // Box 410
		bodyModel[284] = new ModelRendererTurbo(this, 107, 194, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[285] = new ModelRendererTurbo(this, 107, 194, textureX, textureY, "lamp"); // Box 396 glow marker
		bodyModel[286] = new ModelRendererTurbo(this, 100, 192, textureX, textureY, "lamp"); // Box 315 aussy markers
		bodyModel[287] = new ModelRendererTurbo(this, 100, 192, textureX, textureY, "lamp"); // Box 316 aussy markers
		bodyModel[288] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // amtk ostricol backplate
		bodyModel[289] = new ModelRendererTurbo(this, 119, 238, textureX, textureY, "cull"); // cull
		bodyModel[290] = new ModelRendererTurbo(this, 126, 238, textureX, textureY, "lamp"); // amtk ostricol glowNoName
		bodyModel[291] = new ModelRendererTurbo(this, 110, 243, textureX, textureY); // Box 232
		bodyModel[292] = new ModelRendererTurbo(this, 114, 34, textureX, textureY); // Box 233
		bodyModel[293] = new ModelRendererTurbo(this, 114, 30, textureX, textureY); // Box 234
		bodyModel[294] = new ModelRendererTurbo(this, 114, 32, textureX, textureY); // Box 235
		bodyModel[295] = new ModelRendererTurbo(this, 114, 20, textureX, textureY); // Box 450
		bodyModel[296] = new ModelRendererTurbo(this, 130, 32, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[297] = new ModelRendererTurbo(this, 130, 32, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[298] = new ModelRendererTurbo(this, 130, 32, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[299] = new ModelRendererTurbo(this, 130, 32, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[300] = new ModelRendererTurbo(this, 121, 32, textureX, textureY); // Box 421 prime base
		bodyModel[301] = new ModelRendererTurbo(this, 399, 83, textureX, textureY); // Box 276
		bodyModel[302] = new ModelRendererTurbo(this, 402, 80, textureX, textureY); // Box 277
		bodyModel[303] = new ModelRendererTurbo(this, 187, 85, textureX, textureY); // Box 400 D9 AC cube support system
		bodyModel[304] = new ModelRendererTurbo(this, 218, 96, textureX, textureY); // Box 419 D9 AC
		bodyModel[305] = new ModelRendererTurbo(this, 136, 29, textureX, textureY); // funny atsf noise
		bodyModel[306] = new ModelRendererTurbo(this, 131, 28, textureX, textureY); // funny atsf noise
		bodyModel[307] = new ModelRendererTurbo(this, 137, 26, textureX, textureY); // funny atsf noise
		bodyModel[308] = new ModelRendererTurbo(this, 139, 32, textureX, textureY); // funny atsf noise
		bodyModel[309] = new ModelRendererTurbo(this, 113, 22, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[310] = new ModelRendererTurbo(this, 113, 22, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[311] = new ModelRendererTurbo(this, 113, 22, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[312] = new ModelRendererTurbo(this, 113, 22, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[313] = new ModelRendererTurbo(this, 113, 26, textureX, textureY); // Box 364 prime base
		bodyModel[314] = new ModelRendererTurbo(this, 344, 197, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[315] = new ModelRendererTurbo(this, 363, 197, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[316] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 563
		bodyModel[317] = new ModelRendererTurbo(this, 327, 218, textureX, textureY); // Box 564
		bodyModel[318] = new ModelRendererTurbo(this, 327, 212, textureX, textureY); // Box 387
		bodyModel[319] = new ModelRendererTurbo(this, 327, 214, textureX, textureY); // Box 388
		bodyModel[320] = new ModelRendererTurbo(this, 122, 24, textureX, textureY); // Box 351
		bodyModel[321] = new ModelRendererTurbo(this, 125, 24, textureX, textureY); // Box 350
		bodyModel[322] = new ModelRendererTurbo(this, 65, 207, textureX, textureY); // Box 393 32 sandcap
		bodyModel[323] = new ModelRendererTurbo(this, 74, 207, textureX, textureY); // Box 394 40 sandcap
		bodyModel[324] = new ModelRendererTurbo(this, 65, 207, textureX, textureY); // Box 395
		bodyModel[325] = new ModelRendererTurbo(this, 74, 207, textureX, textureY); // Box 396
		bodyModel[326] = new ModelRendererTurbo(this, 85, 181, textureX, textureY, "cull"); // Box 397 cull grab
		bodyModel[327] = new ModelRendererTurbo(this, 68, 181, textureX, textureY, "cull"); // Box 398 cull grab
		bodyModel[328] = new ModelRendererTurbo(this, 11, 178, textureX, textureY); // Box 362
		bodyModel[329] = new ModelRendererTurbo(this, 65, 136, textureX, textureY); // Box 471
		bodyModel[330] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 472
		bodyModel[331] = new ModelRendererTurbo(this, 24, 135, textureX, textureY); // Box pluggius
		bodyModel[332] = new ModelRendererTurbo(this, 24, 140, textureX, textureY); // Box pluggius
		bodyModel[333] = new ModelRendererTurbo(this, 17, 135, textureX, textureY); // Box pluggius
		bodyModel[334] = new ModelRendererTurbo(this, 17, 140, textureX, textureY); // Box pluggius
		bodyModel[335] = new ModelRendererTurbo(this, 2, 142, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[336] = new ModelRendererTurbo(this, 2, 137, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[337] = new ModelRendererTurbo(this, 2, 142, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[338] = new ModelRendererTurbo(this, 2, 137, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[339] = new ModelRendererTurbo(this, 80, 192, textureX, textureY); // Box 435
		bodyModel[340] = new ModelRendererTurbo(this, 80, 189, textureX, textureY); // Box 436
		bodyModel[341] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 440 honse m-2
		bodyModel[342] = new ModelRendererTurbo(this, 131, 98, textureX, textureY); // Box 382
		bodyModel[343] = new ModelRendererTurbo(this, 131, 98, textureX, textureY); // Box 384
		bodyModel[344] = new ModelRendererTurbo(this, 131, 94, textureX, textureY, "lamp"); // Box 385 amsnack flashie
		bodyModel[345] = new ModelRendererTurbo(this, 131, 94, textureX, textureY, "lamp"); // Box 386 amsnack flashie
		bodyModel[346] = new ModelRendererTurbo(this, 129, 111, textureX, textureY); // Box 378
		bodyModel[347] = new ModelRendererTurbo(this, 167, 93, textureX, textureY); // Box 379
		bodyModel[348] = new ModelRendererTurbo(this, 89, 107, textureX, textureY); // Box 380
		bodyModel[349] = new ModelRendererTurbo(this, 112, 238, textureX, textureY, "cull"); // cull
		bodyModel[350] = new ModelRendererTurbo(this, 98, 62, textureX, textureY); // Box 391
		bodyModel[351] = new ModelRendererTurbo(this, 128, 89, textureX, textureY); // Box 392
		bodyModel[352] = new ModelRendererTurbo(this, 137, 88, textureX, textureY); // Box 393
		bodyModel[353] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Box 394
		bodyModel[354] = new ModelRendererTurbo(this, 11, 185, textureX, textureY); // Box 395
		bodyModel[355] = new ModelRendererTurbo(this, 200, 90, textureX, textureY, "cull"); // Box 484 cull
		bodyModel[356] = new ModelRendererTurbo(this, 202, 93, textureX, textureY); // Box 485
		bodyModel[357] = new ModelRendererTurbo(this, 76, 136, textureX, textureY); // Box 382
		bodyModel[358] = new ModelRendererTurbo(this, 73, 136, textureX, textureY); // Box 383
		bodyModel[359] = new ModelRendererTurbo(this, 155, 194, textureX, textureY); // Box 123
		bodyModel[360] = new ModelRendererTurbo(this, 155, 197, textureX, textureY); // Box 311
		bodyModel[361] = new ModelRendererTurbo(this, 41, 167, textureX, textureY); // Box 373
		bodyModel[362] = new ModelRendererTurbo(this, 11, 166, textureX, textureY); // Box 374
		bodyModel[363] = new ModelRendererTurbo(this, 4, 174, textureX, textureY); // Box 375
		bodyModel[364] = new ModelRendererTurbo(this, 41, 173, textureX, textureY); // Box 376
		bodyModel[365] = new ModelRendererTurbo(this, 41, 165, textureX, textureY); // Box 377
		bodyModel[366] = new ModelRendererTurbo(this, 41, 167, textureX, textureY); // Box 378
		bodyModel[367] = new ModelRendererTurbo(this, 22, 167, textureX, textureY); // Box 379
		bodyModel[368] = new ModelRendererTurbo(this, 4, 163, textureX, textureY); // Box 380
		bodyModel[369] = new ModelRendererTurbo(this, 41, 173, textureX, textureY); // Box 381
		bodyModel[370] = new ModelRendererTurbo(this, 41, 165, textureX, textureY); // Box 382
		bodyModel[371] = new ModelRendererTurbo(this, 146, 156, textureX, textureY); // Box 236
		bodyModel[372] = new ModelRendererTurbo(this, 143, 166, textureX, textureY); // Box 86
		bodyModel[373] = new ModelRendererTurbo(this, 134, 146, textureX, textureY); // Box 279
		bodyModel[374] = new ModelRendererTurbo(this, 123, 158, textureX, textureY); // Box 282
		bodyModel[375] = new ModelRendererTurbo(this, 123, 140, textureX, textureY); // Box 86
		bodyModel[376] = new ModelRendererTurbo(this, 160, 171, textureX, textureY); // Box 284
		bodyModel[377] = new ModelRendererTurbo(this, 103, 160, textureX, textureY); // Box 285
		bodyModel[378] = new ModelRendererTurbo(this, 176, 168, textureX, textureY); // Box 287
		bodyModel[379] = new ModelRendererTurbo(this, 98, 154, textureX, textureY); // Box 131
		bodyModel[380] = new ModelRendererTurbo(this, 464, 171, textureX, textureY); // Box 383
		bodyModel[381] = new ModelRendererTurbo(this, 459, 171, textureX, textureY); // Box 384
		bodyModel[382] = new ModelRendererTurbo(this, 107, 143, textureX, textureY); // Box 385
		bodyModel[383] = new ModelRendererTurbo(this, 195, 160, textureX, textureY); // Box 429 backwall
		bodyModel[384] = new ModelRendererTurbo(this, 450, 6, textureX, textureY, "lamp"); // Box glow amtrak higherboards
		bodyModel[385] = new ModelRendererTurbo(this, 450, 6, textureX, textureY, "lamp"); // Box glow amtrak higherboards
		bodyModel[386] = new ModelRendererTurbo(this, 24, 135, textureX, textureY); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[387] = new ModelRendererTurbo(this, 24, 140, textureX, textureY); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[388] = new ModelRendererTurbo(this, 17, 140, textureX, textureY); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[389] = new ModelRendererTurbo(this, 17, 135, textureX, textureY); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[390] = new ModelRendererTurbo(this, 109, 186, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[391] = new ModelRendererTurbo(this, 103, 187, textureX, textureY); // Box 335
		bodyModel[392] = new ModelRendererTurbo(this, 186, 153, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[393] = new ModelRendererTurbo(this, 176, 126, textureX, textureY); // Box 253
		bodyModel[394] = new ModelRendererTurbo(this, 180, 129, textureX, textureY); // Box 280
		bodyModel[395] = new ModelRendererTurbo(this, 33, 135, textureX, textureY, "lamp"); // Box 397 glow
		bodyModel[396] = new ModelRendererTurbo(this, 33, 140, textureX, textureY); // Box 398
		bodyModel[397] = new ModelRendererTurbo(this, 33, 135, textureX, textureY, "lamp"); // Box 399 glow
		bodyModel[398] = new ModelRendererTurbo(this, 33, 140, textureX, textureY); // Box 400
		bodyModel[399] = new ModelRendererTurbo(this, 107, 194, textureX, textureY, "lamp"); // Box glow marker rear
		bodyModel[400] = new ModelRendererTurbo(this, 107, 194, textureX, textureY, "lamp"); // Box glow marker rear
		bodyModel[401] = new ModelRendererTurbo(this, 244, 142, textureX, textureY); // Box 415 D9 intake
		bodyModel[402] = new ModelRendererTurbo(this, 244, 148, textureX, textureY); // Box 415
		bodyModel[403] = new ModelRendererTurbo(this, 44, 20, textureX, textureY); // Box 403
		bodyModel[404] = new ModelRendererTurbo(this, 44, 20, textureX, textureY); // Box 404
		bodyModel[405] = new ModelRendererTurbo(this, 47, 20, textureX, textureY); // Box 405
		bodyModel[406] = new ModelRendererTurbo(this, 47, 20, textureX, textureY); // Box 406

		bodyModel[0].addBox(0F, 0F, 0F, 87, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-47.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[2].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 195
		bodyModel[3].setRotationPoint(-44F, -1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[4].setRotationPoint(-47F, -1F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 200
		bodyModel[5].setRotationPoint(-47F, 1F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[6].setRotationPoint(-47F, -1F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 204
		bodyModel[7].setRotationPoint(-47F, 1F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[8].setRotationPoint(-47F, 8F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[9].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 256
		bodyModel[10].setRotationPoint(48.01F, -1F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[12].setRotationPoint(48F, 2.5F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 411
		bodyModel[13].setRotationPoint(-47F, 7F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[14].setRotationPoint(-51F, 7F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[15].setRotationPoint(-51F, 7F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-50F, 6F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[17].setRotationPoint(-50F, 6F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[18].setRotationPoint(-50F, 5F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[19].setRotationPoint(-50F, 5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[20].setRotationPoint(50F, 6F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[21].setRotationPoint(50F, 6F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[22].setRotationPoint(51F, 7F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[23].setRotationPoint(51F, 7F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[24].setRotationPoint(50F, 5F, 2F);

		bodyModel[25].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[25].setRotationPoint(50F, 5F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 201
		bodyModel[26].setRotationPoint(-47F, 3F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 202
		bodyModel[27].setRotationPoint(-47F, 3F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 293
		bodyModel[28].setRotationPoint(-47F, 2F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 294
		bodyModel[29].setRotationPoint(-47F, 2F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 392
		bodyModel[30].setRotationPoint(-47F, 5.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 393
		bodyModel[31].setRotationPoint(-47F, 4.5F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[32].setRotationPoint(-47F, 4.5F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 395
		bodyModel[33].setRotationPoint(-47F, 5.5F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[34].setRotationPoint(-47F, 8F, -9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[35].setRotationPoint(-30F, 2.5F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[36].setRotationPoint(-30F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[37].setRotationPoint(-29F, 2F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[38].setRotationPoint(-29F, 2F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[39].setRotationPoint(28F, 2.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[40].setRotationPoint(29F, 2F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[41].setRotationPoint(28F, 1F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[42].setRotationPoint(29F, 2F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 95, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[43].setRotationPoint(-47F, 2.75F, -7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 95, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[44].setRotationPoint(-47F, 1F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 95, 2, 14, 0F); // Box 424
		bodyModel[45].setRotationPoint(-47F, -1F, -7F);

		bodyModel[46].addBox(0F, 0F, 0F, 87, 2, 4, 0F); // Box 426
		bodyModel[46].setRotationPoint(-43F, -1F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 156
		bodyModel[47].setRotationPoint(-43F, 1.5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 87, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630 cull thing
		bodyModel[48].setRotationPoint(-43F, 1F, -11F);

		bodyModel[49].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 382
		bodyModel[49].setRotationPoint(-5F, 2.25F, -11.25F);
		bodyModel[49].rotateAngleX = -0.29670597F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[50].setRotationPoint(-16.75F, 1F, 8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 457
		bodyModel[51].setRotationPoint(-43F, 6F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[52].setRotationPoint(-43F, 2F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[53].setRotationPoint(-47.01F, 7F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482
		bodyModel[54].setRotationPoint(-43F, 6F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[55].setRotationPoint(-43F, 2F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[56].setRotationPoint(-43F, 1F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		bodyModel[57].setRotationPoint(-47.01F, 7F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 496
		bodyModel[58].setRotationPoint(-47F, 8F, 8F);

		bodyModel[59].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 124
		bodyModel[59].setRotationPoint(12F, 2.25F, -11.25F);
		bodyModel[59].rotateAngleX = -0.29670597F;

		bodyModel[60].addBox(0F, 0F, 0F, 66, 19, 14, 0F); // Box 6
		bodyModel[60].setRotationPoint(-23F, -20F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[61].setRotationPoint(-4F, -21F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[62].setRotationPoint(-4F, -21F, 2F);

		bodyModel[63].addBox(0F, 0F, 0F, 26, 1, 4, 0F); // Box 294
		bodyModel[63].setRotationPoint(-4F, -21F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[64].setRotationPoint(48.02F, 8F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[65].setRotationPoint(48.01F, 7F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[66].setRotationPoint(48.01F, 7F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 141
		bodyModel[67].setRotationPoint(-47F, 7F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 142
		bodyModel[68].setRotationPoint(44F, 4.5F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 143
		bodyModel[69].setRotationPoint(44F, 5.5F, 8F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 144
		bodyModel[70].setRotationPoint(44F, 3F, 8F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 145
		bodyModel[71].setRotationPoint(44F, 2F, 8F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 146
		bodyModel[72].setRotationPoint(44F, 7F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[73].setRotationPoint(44F, 8F, 8F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 148
		bodyModel[74].setRotationPoint(44F, 1F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 149
		bodyModel[75].setRotationPoint(45F, -1F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 150
		bodyModel[76].setRotationPoint(45F, -1F, -8F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 151
		bodyModel[77].setRotationPoint(44F, 1F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 152
		bodyModel[78].setRotationPoint(44F, 3F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 153
		bodyModel[79].setRotationPoint(44F, 2F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 154
		bodyModel[80].setRotationPoint(44F, 4.5F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 155
		bodyModel[81].setRotationPoint(44F, 5.5F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[82].setRotationPoint(44F, 8F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 157
		bodyModel[83].setRotationPoint(44F, 7F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 19, 2, 14, 0F); // Box 96
		bodyModel[84].setRotationPoint(-23F, -22F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[85].setRotationPoint(15F, -22.5F, -3F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[86].setRotationPoint(14.5F, -21.5F, -3.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[87].setRotationPoint(15F, -23.5F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[88].setRotationPoint(-23F, -5F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 232
		bodyModel[89].setRotationPoint(-7F, -3F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 54, 8, 0, 0F); // Box 251
		bodyModel[90].setRotationPoint(-10F, -9F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 252
		bodyModel[91].setRotationPoint(45.01F, -6F, -11.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 253
		bodyModel[92].setRotationPoint(45.01F, -9F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 47, 8, 0, 0F); // Box 277
		bodyModel[93].setRotationPoint(-3F, -9F, 11F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 278
		bodyModel[94].setRotationPoint(45.01F, -9F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 279
		bodyModel[95].setRotationPoint(45.01F, -6F, 10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 280
		bodyModel[96].setRotationPoint(-8F, -9F, 11.01F);

		bodyModel[97].addBox(0F, 0F, 0F, 17, 8, 0, 0F); // Box 281
		bodyModel[97].setRotationPoint(-23F, -13F, 11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 282
		bodyModel[98].setRotationPoint(-7F, -5F, 11F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[99].setRotationPoint(19F, -21F, -6.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[100].setRotationPoint(17F, -22F, -5.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[101].setRotationPoint(18F, -22F, -7.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[102].setRotationPoint(19F, -22F, -6.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[103].setRotationPoint(43F, -23.25F, 1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[104].setRotationPoint(44F, -23.25F, 2.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[105].setRotationPoint(44F, -23.25F, 0.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[106].setRotationPoint(44F, -22.25F, 1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[107].setRotationPoint(44F, -9F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[108].setRotationPoint(44F, -9F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 you tellin me this is a MU plug?
		bodyModel[109].setRotationPoint(-48F, -0.5F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 no fuckin way this is a MU plug
		bodyModel[110].setRotationPoint(-48F, -0.5F, 4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 350
		bodyModel[111].setRotationPoint(47.5F, -0.5F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351
		bodyModel[112].setRotationPoint(47.5F, -0.5F, -6F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[113].setRotationPoint(48.25F, 0.5F, -5.5F);
		bodyModel[113].rotateAngleZ = 0.62831853F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Box 193
		bodyModel[114].setRotationPoint(-47F, 2F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 2F, 0F); // Box 273
		bodyModel[115].setRotationPoint(43F, 2F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[116].setRotationPoint(22F, 0.5F, -10.5F);
		bodyModel[116].rotateAngleY = 1.57079633F;
		bodyModel[116].rotateAngleZ = -0.38397244F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[117].setRotationPoint(40F, 0.5F, -10.5F);
		bodyModel[117].rotateAngleY = 1.57079633F;
		bodyModel[117].rotateAngleZ = -0.38397244F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[118].setRotationPoint(-50F, 4F, 2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[119].setRotationPoint(-50.5F, 4F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[120].setRotationPoint(-50F, 5F, 2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[121].setRotationPoint(-50F, 5F, -10F);

		bodyModel[122].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[122].setRotationPoint(22F, -22F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[123].setRotationPoint(26F, -18F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 127
		bodyModel[124].setRotationPoint(22F, -19F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(26F, -18F, -9F);

		bodyModel[126].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 130
		bodyModel[126].setRotationPoint(22F, -19F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[127].setRotationPoint(22F, -19F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[128].setRotationPoint(22F, -19F, 9F);

		bodyModel[129].addBox(0F, -1F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[129].setRotationPoint(22F, -20F, -11F);

		bodyModel[130].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[130].setRotationPoint(22F, -22F, 0F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[131].setRotationPoint(43.5F, -19.25F, -8.75F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[132].setRotationPoint(43.5F, -19.25F, 7.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[133].setRotationPoint(44F, -21F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[134].setRotationPoint(44F, -21F, 0F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 131
		bodyModel[135].setRotationPoint(43F, -14F, -1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[136].setRotationPoint(46F, -21.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[137].setRotationPoint(45.5F, -21.55F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[138].setRotationPoint(45.5F, -19.55F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 132
		bodyModel[139].setRotationPoint(43F, -21F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[140].setRotationPoint(45F, -22F, -7F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[141].setRotationPoint(43F, -17F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, -0.5F, -2F, 1F, -0.5F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[142].setRotationPoint(45F, -22F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[143].setRotationPoint(43F, -22F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 26, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 40 tancc
		bodyModel[144].setRotationPoint(-8.5F, 2.5F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 305 shared air system
		bodyModel[145].setRotationPoint(-13.5F, 5F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 cull shared air system
		bodyModel[146].setRotationPoint(-14.5F, 2F, 5.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 305 shared air system
		bodyModel[147].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 305 shared air system
		bodyModel[148].setRotationPoint(-12.5F, 6F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 305 shared air system
		bodyModel[149].setRotationPoint(-10.5F, 5F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 cull shared air system
		bodyModel[150].setRotationPoint(-10.5F, 2F, 5.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 305 shared air system
		bodyModel[151].setRotationPoint(-11.5F, 6F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 305 shared air system
		bodyModel[152].setRotationPoint(-9.5F, 6F, -9F);

		bodyModel[153].addBox(-0.5F, -5F, -1F, 1, 5, 1, 0F); // Box 305 cull shared air system
		bodyModel[153].setRotationPoint(-13F, 6.5F, -8.99F);
		bodyModel[153].rotateAngleZ = 0.36651914F;

		bodyModel[154].addBox(-0.5F, -3F, -1F, 1, 3, 4, 0F); // Box 305 cull shared air system
		bodyModel[154].setRotationPoint(-10F, 6.5F, -8.99F);
		bodyModel[154].rotateAngleZ = -0.31415927F;

		bodyModel[155].addShapeBox(0F, 0F, 0.5F, 36, 1, 19, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547
		bodyModel[155].setRotationPoint(25F, -22.4F, 1F);
		bodyModel[155].rotateAngleX = -0.13613568F;

		bodyModel[156].addShapeBox(0F, 0F, -19.5F, 36, 1, 19, 0F,0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[156].setRotationPoint(25F, -22.4F, -1F);
		bodyModel[156].rotateAngleX = 0.13613568F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254 D9 WALKWAY
		bodyModel[157].setRotationPoint(-23F, -5F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 13, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[158].setRotationPoint(-23F, -21F, -11.01F);

		bodyModel[159].addShapeBox(-1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 numberboard
		bodyModel[159].setRotationPoint(43.55F, -17F, -6F);
		bodyModel[159].rotateAngleY = -0.4712389F;

		bodyModel[160].addBox(-1F, 0F, -4.75F, 1, 2, 5, 0F); // Box 395 numberboard
		bodyModel[160].setRotationPoint(43.55F, -17F, 6F);
		bodyModel[160].rotateAngleY = 0.4712389F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[161].setRotationPoint(44.5F, -22.25F, -0.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 26, 4, 16, 0F); // Box 305 40 tancc
		bodyModel[162].setRotationPoint(-8.5F, 5.5F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 40 tancc
		bodyModel[163].setRotationPoint(-8.5F, 5.5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 305 40 tancc
		bodyModel[164].setRotationPoint(-8.5F, 5.5F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[165].setRotationPoint(5F, -22.25F, -2.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[166].setRotationPoint(5F, -22.25F, 1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[167].setRotationPoint(4F, -22.75F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[168].setRotationPoint(4F, -22.75F, 0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[169].setRotationPoint(4F, -22.75F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[170].setRotationPoint(5.5F, -22.25F, -1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 cull 
		bodyModel[171].setRotationPoint(43F, -15F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glow markerlight crl
		bodyModel[172].setRotationPoint(42.4F, -15F, -7.05F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 345 glow markerlight crl
		bodyModel[173].setRotationPoint(42.4F, -15F, 5.05F);

		bodyModel[174].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 now heres the glower glow
		bodyModel[174].setRotationPoint(42.75F, -15F, 5.5F);
		bodyModel[174].rotateAngleY = 0.4712389F;

		bodyModel[175].addShapeBox(-0.25F, 0F, -2.25F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 now heres the glower glow
		bodyModel[175].setRotationPoint(43.5F, -15F, -4.5F);
		bodyModel[175].rotateAngleY = -0.4712389F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[176].setRotationPoint(43.5F, -12.5F, 5.5F);

		bodyModel[177].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[177].setRotationPoint(44F, -15F, -1F);
		bodyModel[177].rotateAngleZ = 0.78539816F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 477 cull
		bodyModel[178].setRotationPoint(43F, -15F, 5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0.1F, -13F, 0F, 0.1F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -13F, 0F, -1.9F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[179].setRotationPoint(27F, -18F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 483
		bodyModel[180].setRotationPoint(27F, -18F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 432
		bodyModel[181].setRotationPoint(-48.5F, -9F, -8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 433
		bodyModel[182].setRotationPoint(-48.5F, -9F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[183].setRotationPoint(-49F, -9F, -2F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[184].setRotationPoint(-47F, -2F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[185].setRotationPoint(-47F, -9F, -8F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[186].setRotationPoint(-47F, -9F, 9F);
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[187].setRotationPoint(-47F, -2F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		bodyModel[188].setRotationPoint(-47F, -8F, -8F);
		bodyModel[188].rotateAngleY = 0.33161256F;

		bodyModel[189].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[189].setRotationPoint(-47F, -8F, 8F);
		bodyModel[189].rotateAngleY = -0.33161256F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 441 cull
		bodyModel[190].setRotationPoint(48F, -1F, -7.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F); // Box 442 cull
		bodyModel[191].setRotationPoint(48F, -1F, -1.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 443 cull
		bodyModel[192].setRotationPoint(48F, -1F, 1.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 444
		bodyModel[193].setRotationPoint(49.5F, -9F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[194].setRotationPoint(50F, -9F, -2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[195].setRotationPoint(49.5F, -9F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 253
		bodyModel[196].setRotationPoint(48F, -9F, 9F);
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 254
		bodyModel[197].setRotationPoint(48F, -2F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 256
		bodyModel[198].setRotationPoint(48F, -9F, -8F);
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 257
		bodyModel[199].setRotationPoint(48F, -2F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 447
		bodyModel[200].setRotationPoint(48F, -8F, -8F);
		bodyModel[200].rotateAngleY = -0.33161256F;

		bodyModel[201].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[201].setRotationPoint(48F, -8F, 8F);
		bodyModel[201].rotateAngleY = 0.33161256F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 162 cull
		bodyModel[202].setRotationPoint(-49F, -1F, -7.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 163 cull
		bodyModel[203].setRotationPoint(-49F, -1F, -1.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164 cull
		bodyModel[204].setRotationPoint(-49F, -1F, 1.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[205].setRotationPoint(-48F, -4F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[206].setRotationPoint(-48F, -4F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[207].setRotationPoint(-48.25F, -4F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[208].setRotationPoint(-48.25F, -4F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight glow
		bodyModel[209].setRotationPoint(-49.1F, -1.75F, 3.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight glow
		bodyModel[210].setRotationPoint(-49.1F, -1.75F, -5.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[211].setRotationPoint(-48.8F, -1.75F, 3.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[212].setRotationPoint(-48.8F, -1.75F, -5.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 365 ditchlight glow
		bodyModel[213].setRotationPoint(48.25F, -4F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[214].setRotationPoint(48F, -4F, 4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ditchlight glow
		bodyModel[215].setRotationPoint(48.25F, -4F, -6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		bodyModel[216].setRotationPoint(48F, -4F, -6F);

		bodyModel[217].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 450
		bodyModel[217].setRotationPoint(2F, 2.25F, 11.25F);
		bodyModel[217].rotateAngleX = 0.29670597F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 462
		bodyModel[218].setRotationPoint(47.8F, -1.75F, 3.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 463 ditchlight glow
		bodyModel[219].setRotationPoint(49.1F, -1.75F, 3.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 464
		bodyModel[220].setRotationPoint(47.8F, -1.75F, -5.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 465 ditchlight glow
		bodyModel[221].setRotationPoint(49.1F, -1.75F, -5.75F);

		bodyModel[222].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 466
		bodyModel[222].setRotationPoint(-6F, 2.25F, 11.25F);
		bodyModel[222].rotateAngleX = 0.29670597F;

		bodyModel[223].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 94
		bodyModel[223].setRotationPoint(-46F, -16F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[224].setRotationPoint(-24F, -21F, -11F);

		bodyModel[225].addShapeBox(3F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[225].setRotationPoint(-39F, -15F, -11F);

		bodyModel[226].addBox(3F, 0F, 0F, 10, 6, 1, 0F); // Box 120
		bodyModel[226].setRotationPoint(-37F, -21F, 10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[227].setRotationPoint(-46F, -13F, -11F);

		bodyModel[228].addShapeBox(3F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[228].setRotationPoint(-39F, -16F, 10F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 135
		bodyModel[229].setRotationPoint(-36F, -16F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,-7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 150
		bodyModel[230].setRotationPoint(-43F, -16F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 152
		bodyModel[231].setRotationPoint(-43F, -16F, 1F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[232].setRotationPoint(-43F, -16F, 1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, 0F); // Box 154
		bodyModel[233].setRotationPoint(-43F, -16F, -11F);

		bodyModel[234].addBox(3F, 0F, 0F, 10, 6, 1, 0F); // Box 119
		bodyModel[234].setRotationPoint(-37F, -21F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 120
		bodyModel[235].setRotationPoint(-46F, -13F, 1F);

		bodyModel[236].addShapeBox(3F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[236].setRotationPoint(-39F, -15F, 10F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 177
		bodyModel[237].setRotationPoint(-46F, -11F, -1F);

		bodyModel[238].addBox(-0.5F, 0F, -3.5F, 1, 15, 4, 0F); // Box 314 door swing right
		bodyModel[238].setRotationPoint(-23.5F, -21F, 10.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 7, 12, 22, 0F); // Box 210
		bodyModel[239].setRotationPoint(-43F, -13F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 267
		bodyModel[240].setRotationPoint(-34F, -23F, -7F);

		bodyModel[241].addBox(0F, 0F, 0F, 13, 5, 22, 0F); // Box 137
		bodyModel[241].setRotationPoint(-36F, -6F, -11F);

		bodyModel[242].addShapeBox(0F, -1F, 2F, 1, 1, 3, 0F,0F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 310 schnozz door
		bodyModel[242].setRotationPoint(-44.75F, -15F, -6F);
		bodyModel[242].rotateAngleY = 0.29670597F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[243].setRotationPoint(-39F, -21F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 315
		bodyModel[244].setRotationPoint(-35F, -21F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 0.59F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F); // Box 309
		bodyModel[245].setRotationPoint(-35F, -23F, -7F);

		bodyModel[246].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,-0.228F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.05F, 1F, 0F, -0.228F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.59F, 0F, 0F); // Box 313
		bodyModel[246].setRotationPoint(-35F, -23F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 314
		bodyModel[247].setRotationPoint(-34F, -23F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[248].setRotationPoint(-24F, -23F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[249].setRotationPoint(-24F, -23F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[250].setRotationPoint(-24F, -23F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 269
		bodyModel[251].setRotationPoint(-34F, -23F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 313
		bodyModel[252].setRotationPoint(-34F, -23F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[253].setRotationPoint(-24F, -23F, -11F);

		bodyModel[254].addShapeBox(0F, 1F, -4F, 1, 1, 4, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.05F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.59F, 0F, 0F); // Box 310
		bodyModel[254].setRotationPoint(-35F, -23F, -7F);

		bodyModel[255].addBox(0F, 0F, -6F, 1, 2, 5, 0F); // Box 172
		bodyModel[255].setRotationPoint(-35.52F, -23.01F, 8F);
		bodyModel[255].rotateAngleY = -0.27488936F;

		bodyModel[256].addShapeBox(0F, 0F, -6F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 242 numberboard top
		bodyModel[256].setRotationPoint(-35.53F, -23.01F, 8F);
		bodyModel[256].rotateAngleY = -0.27488936F;

		bodyModel[257].addBox(0F, 0F, 1F, 1, 2, 5, 0F); // Box 317
		bodyModel[257].setRotationPoint(-35.52F, -23.01F, -8F);
		bodyModel[257].rotateAngleY = 0.27488936F;

		bodyModel[258].addShapeBox(0F, 0F, 1F, 1, 2, 5, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 318 numerboard top
		bodyModel[258].setRotationPoint(-35.53F, -23.01F, -8F);
		bodyModel[258].rotateAngleY = 0.27488936F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 headlight nose
		bodyModel[259].setRotationPoint(-45.75F, -15F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 headlight nose
		bodyModel[260].setRotationPoint(-45.75F, -13F, -1F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 312 nose cover
		bodyModel[261].setRotationPoint(-46F, -15F, -1F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[262].setRotationPoint(-46F, -15F, -1F);

		bodyModel[263].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 352 cabmount assembly
		bodyModel[263].setRotationPoint(-36.25F, -22.99F, -2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 headlight high
		bodyModel[264].setRotationPoint(-36.5F, -22.99F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 headlight high
		bodyModel[265].setRotationPoint(-36.5F, -22.99F, 0F);

		bodyModel[266].addBox(0F, 0F, 0F, 23, 2, 14, 0F); // Box 96
		bodyModel[266].setRotationPoint(-23F, -22F, -7F);

		bodyModel[267].addShapeBox(-1F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 415 D9 intake
		bodyModel[267].setRotationPoint(-9.5F, -21F, -7.37F);

		bodyModel[268].addShapeBox(-1F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[268].setRotationPoint(-9.5F, -21F, 6.37F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -13F, -5F, 0F, -13F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[269].setRotationPoint(-22.5F, -21.5F, -7.01F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 24, 12, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -6F, 0F); // Box 416
		bodyModel[270].setRotationPoint(-23F, -21.5F, 7.01F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 24, 0, 11, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 467
		bodyModel[271].setRotationPoint(-23F, -22.01F, 1F);

		bodyModel[272].addBox(0F, 0F, 0F, 6, 3, 14, 0F); // Box 305 cull shared air system
		bodyModel[272].setRotationPoint(-14.5F, 2.5F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 16, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32 tancc
		bodyModel[273].setRotationPoint(1.5F, 2.5F, -11F);

		bodyModel[274].addBox(0F, 0F, 0F, 16, 4, 14, 0F); // Box 32 tancc
		bodyModel[274].setRotationPoint(1.5F, 5.5F, -7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 2F, 2F, 0F, 2F, 2F); // Box 32 tancc
		bodyModel[275].setRotationPoint(1.5F, 5.5F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 32 tancc
		bodyModel[276].setRotationPoint(1.5F, 5.5F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 6, 5, 18, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342 32 fuses
		bodyModel[277].setRotationPoint(-6.5F, 2.75F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.36F, 0F, 0F, -0.34F, 0F, 0F, 0F, 0F, 0F); // Box 69 schnozz door
		bodyModel[278].setRotationPoint(-44.75F, -14F, -6F);
		bodyModel[278].rotateAngleY = 0.29670597F;

		bodyModel[279].addShapeBox(0F, 0F, 2F, 1, 1, 3, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 94 schnozz door
		bodyModel[279].setRotationPoint(-44.75F, -15F, -6F);
		bodyModel[279].rotateAngleY = 0.29670597F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.55F, 0F, -0.35F, -0.55F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 95 schnozz door
		bodyModel[280].setRotationPoint(-44.75F, -15F, -6F);
		bodyModel[280].rotateAngleY = 0.29670597F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, -1F, 2.5F, 0F, 0.3F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, -2.5F, 0F, 0.3F, 0.2F, 0F); // Box 253
		bodyModel[281].setRotationPoint(-43F, -13.51F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0.3F, -0.2F, 0F, -1F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0.2F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F); // Box 408
		bodyModel[282].setRotationPoint(-43F, -13.51F, 10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, -1F); // Box 410
		bodyModel[283].setRotationPoint(-46F, -16.01F, -2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[284].setRotationPoint(-44F, -12.5F, -9.25F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 396 glow marker
		bodyModel[285].setRotationPoint(-44F, -12.5F, 8.25F);

		bodyModel[286].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 aussy markers
		bodyModel[286].setRotationPoint(-44.25F, -13F, 7.25F);
		bodyModel[286].rotateAngleY = -0.26179939F;

		bodyModel[287].addShapeBox(0F, 0F, -3F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 aussy markers
		bodyModel[287].setRotationPoint(-44.25F, -13F, -7.25F);
		bodyModel[287].rotateAngleY = 0.26179939F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // amtk ostricol backplate
		bodyModel[288].setRotationPoint(-36.01F, -23.01F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F); // cull
		bodyModel[289].setRotationPoint(-37.5F, -23.01F, -2F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // amtk ostricol glowNoName
		bodyModel[290].setRotationPoint(-36.5F, -22.99F, -1F);

		bodyModel[291].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 232
		bodyModel[291].setRotationPoint(-29F, -24F, 1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[292].setRotationPoint(-31F, -24F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[293].setRotationPoint(-31F, -24F, -6F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[294].setRotationPoint(-28F, -24F, 0F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[295].setRotationPoint(-11F, -23F, 0F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[296].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[297].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[298].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[299].setRotationPoint(-31F, -24.5F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[300].setRotationPoint(-31F, -24F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[301].setRotationPoint(37.5F, -11F, -7.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[302].setRotationPoint(39F, -9.5F, -7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400 D9 AC cube support system
		bodyModel[303].setRotationPoint(-23F, -15F, -11F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 8, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419 D9 AC
		bodyModel[304].setRotationPoint(-21F, -14F, -10.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // funny atsf noise
		bodyModel[305].setRotationPoint(8.5F, -23F, 0.5F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // funny atsf noise
		bodyModel[306].setRotationPoint(11F, -22F, -0.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // funny atsf noise
		bodyModel[307].setRotationPoint(9F, -22.75F, -1.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // funny atsf noise
		bodyModel[308].setRotationPoint(10.5F, -22.75F, -0.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[309].setRotationPoint(-34F, -24.5F, 5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[310].setRotationPoint(-34F, -24.5F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[311].setRotationPoint(-34F, -24.5F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[312].setRotationPoint(-34F, -24.5F, 5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[313].setRotationPoint(-34F, -24F, 5F);

		bodyModel[314].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[314].setRotationPoint(-30F, -23.5F, -9F);

		bodyModel[315].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[315].setRotationPoint(-30F, -23.5F, 7F);

		bodyModel[316].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[316].setRotationPoint(-29.5F, -24.5F, -8F);

		bodyModel[317].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[317].setRotationPoint(-29.5F, -24.5F, 8F);

		bodyModel[318].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 387
		bodyModel[318].setRotationPoint(-32.5F, -24F, -6F);

		bodyModel[319].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 388
		bodyModel[319].setRotationPoint(-32.5F, -24F, 6F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[320].setRotationPoint(-32F, -19F, 11F);

		bodyModel[321].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[321].setRotationPoint(-32F, -19F, -12F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 393 32 sandcap
		bodyModel[322].setRotationPoint(-43F, -14.75F, 8.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 394 40 sandcap
		bodyModel[323].setRotationPoint(-42F, -16.25F, -7.75F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 395
		bodyModel[324].setRotationPoint(-43F, -14.75F, -10.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Box 396
		bodyModel[325].setRotationPoint(-42F, -16.25F, 5.75F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 2F, 0F, 0F); // Box 397 cull grab
		bodyModel[326].setRotationPoint(-42F, -15.25F, -8.25F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,2F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 398 cull grab
		bodyModel[327].setRotationPoint(-42F, -15.25F, 4.25F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 362
		bodyModel[328].setRotationPoint(-44F, 6F, -11F);

		bodyModel[329].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 471
		bodyModel[329].setRotationPoint(-43.5F, -2F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[330].setRotationPoint(-43.5F, -10F, -10F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box pluggius
		bodyModel[331].setRotationPoint(-48.02F, 0F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box pluggius
		bodyModel[332].setRotationPoint(-48.02F, 0F, -8.25F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box pluggius
		bodyModel[333].setRotationPoint(-48.02F, 0F, 8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box pluggius
		bodyModel[334].setRotationPoint(-48.02F, 0F, 6.25F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[335].setRotationPoint(-48F, 1F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[336].setRotationPoint(-48.25F, 1F, -6F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[337].setRotationPoint(-48F, 1F, 4F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[338].setRotationPoint(-48.25F, 1F, 4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 435
		bodyModel[339].setRotationPoint(-48F, -0.5F, 2.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 436
		bodyModel[340].setRotationPoint(-48F, -0.5F, -4.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 440 honse m-2
		bodyModel[341].setRotationPoint(-47.25F, 0F, -5.5F);
		bodyModel[341].rotateAngleZ = -0.52359878F;

		bodyModel[342].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[342].setRotationPoint(-35.52F, -23F, -8F);
		bodyModel[342].rotateAngleY = 0.27488936F;

		bodyModel[343].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 384
		bodyModel[343].setRotationPoint(-35.52F, -23F, 8F);
		bodyModel[343].rotateAngleY = -0.27488936F;

		bodyModel[344].addShapeBox(-0.1F, 0F, -1F, 1, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 385 amsnack flashie
		bodyModel[344].setRotationPoint(-35.52F, -22F, -8F);
		bodyModel[344].rotateAngleY = 0.27488936F;

		bodyModel[345].addShapeBox(-0.1F, 0F, -1F, 1, 1, 2, 0F,0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 386 amsnack flashie
		bodyModel[345].setRotationPoint(-35.52F, -22F, 8F);
		bodyModel[345].rotateAngleY = -0.27488936F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 378
		bodyModel[346].setRotationPoint(-39F, -21F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.59F, 0F, 0F); // Box 379
		bodyModel[347].setRotationPoint(-35F, -23F, 0F);

		bodyModel[348].addShapeBox(0F, 1F, -4F, 1, 1, 4, 0F,0.05F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.59F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 380
		bodyModel[348].setRotationPoint(-35F, -23F, 11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.7F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.2F, 0F, 0F, 0.05F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // cull
		bodyModel[349].setRotationPoint(-37.5F, -23.01F, 0F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[350].setRotationPoint(-35F, -21F, 10F);

		bodyModel[351].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,0.05F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.228F, -1F, 0F, 0.59F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.228F, 0F, 0F); // Box 392
		bodyModel[351].setRotationPoint(-35F, -23F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 393
		bodyModel[352].setRotationPoint(-34F, -23F, 7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 394
		bodyModel[353].setRotationPoint(-44F, -1F, 7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 395
		bodyModel[354].setRotationPoint(-44F, 6F, 7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[355].setRotationPoint(-13F, 1.5F, 9.5F);

		bodyModel[356].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[356].setRotationPoint(-11.5F, 2.5F, 10F);
		bodyModel[356].rotateAngleY = -0.78539816F;

		bodyModel[357].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 382
		bodyModel[357].setRotationPoint(-43.5F, -2F, 9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[358].setRotationPoint(-43.5F, -10F, 11F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 8, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[359].setRotationPoint(-33F, -21F, -11F);
		bodyModel[359].rotateAngleX = -0.61086524F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 311
		bodyModel[360].setRotationPoint(-32.5F, -21F, 11F);
		bodyModel[360].rotateAngleX = 0.61086524F;

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 373
		bodyModel[361].setRotationPoint(43F, 2F, 11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[362].setRotationPoint(44F, -1F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 375
		bodyModel[363].setRotationPoint(44F, 6F, 7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 376
		bodyModel[364].setRotationPoint(43F, 6F, 11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[365].setRotationPoint(43F, 1F, 11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 378
		bodyModel[366].setRotationPoint(43F, 2F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[367].setRotationPoint(44F, -1F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[368].setRotationPoint(44F, 6F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 381
		bodyModel[369].setRotationPoint(43F, 6F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[370].setRotationPoint(43F, 1F, -11F);

		bodyModel[371].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 236
		bodyModel[371].setRotationPoint(-36F, -14F, 2F);

		bodyModel[372].addShapeBox(-1F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, -7F, -0.5F, 0F, -7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[372].setRotationPoint(-35F, -15.99F, -4F);

		bodyModel[373].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 279
		bodyModel[373].setRotationPoint(-36F, -16F, 1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 282
		bodyModel[374].setRotationPoint(-34F, -13F, 2F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 86
		bodyModel[375].setRotationPoint(-36.5F, -15.99F, 2.25F);
		bodyModel[375].rotateAngleY = -0.31415927F;

		bodyModel[376].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 284
		bodyModel[376].setRotationPoint(-36F, -14F, -10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 285
		bodyModel[377].setRotationPoint(-34F, -13F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[378].setRotationPoint(-36F, -16F, -10F);

		bodyModel[379].addBox(0F, 0F, 0F, 2, 3, 20, 0F); // Box 131
		bodyModel[379].setRotationPoint(-38F, -16F, -10F);

		bodyModel[380].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 383
		bodyModel[380].setRotationPoint(44.51F, -1F, 9F);

		bodyModel[381].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 384
		bodyModel[381].setRotationPoint(44.51F, -1F, -11F);

		bodyModel[382].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 385
		bodyModel[382].setRotationPoint(-36F, -13F, -6.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429 backwall
		bodyModel[383].setRotationPoint(-25F, -22F, -7F);

		bodyModel[384].addShapeBox(-1F, 0F, 0.75F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box glow amtrak higherboards
		bodyModel[384].setRotationPoint(43.55F, -20F, -6F);
		bodyModel[384].rotateAngleY = -0.4712389F;

		bodyModel[385].addBox(-1F, 0F, -4.75F, 1, 2, 4, 0F); // Box glow amtrak higherboards
		bodyModel[385].setRotationPoint(43.55F, -20F, 6F);
		bodyModel[385].rotateAngleY = 0.4712389F;

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[386].setRotationPoint(48.02F, 0F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[387].setRotationPoint(48.02F, 0F, -8.25F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[388].setRotationPoint(48.02F, 0F, 6.25F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box plugguis 1 thru 4 son of pluggis0
		bodyModel[389].setRotationPoint(48.02F, 0F, 8F);

		bodyModel[390].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[390].setRotationPoint(-36.1F, -24F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[391].setRotationPoint(-36.1F, -24F, -0.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[392].setRotationPoint(-25F, -21F, 1.5F);

		bodyModel[393].addBox(-5F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[393].setRotationPoint(38F, 1F, -9.5F);
		bodyModel[393].rotateAngleZ = 0.27925268F;

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[394].setRotationPoint(38F, 1F, -9.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 397 glow
		bodyModel[395].setRotationPoint(48.25F, 1F, 4F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 398
		bodyModel[396].setRotationPoint(48F, 1F, 4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 399 glow
		bodyModel[397].setRotationPoint(48.25F, 1F, -6F);

		bodyModel[398].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 400
		bodyModel[398].setRotationPoint(48F, 1F, -6F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box glow marker rear
		bodyModel[399].setRotationPoint(42.5F, -14.5F, -6.75F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box glow marker rear
		bodyModel[400].setRotationPoint(42.5F, -14.5F, 5.75F);

		bodyModel[401].addShapeBox(-1F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 415 D9 intake
		bodyModel[401].setRotationPoint(-11.25F, -21F, -7.37F);

		bodyModel[402].addShapeBox(-1F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[402].setRotationPoint(-11.75F, -21F, 6.37F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.35F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.35F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F); // Box 403
		bodyModel[403].setRotationPoint(-41F, -14F, -11.01F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.35F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.35F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F); // Box 404
		bodyModel[404].setRotationPoint(-41F, -14F, 11.01F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3.2F, -2F, 0F, -3.2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 405
		bodyModel[405].setRotationPoint(-46.02F, -14F, 0.99F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,-2F, 0F, -3.2F, 2F, 0F, -3.2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[406].setRotationPoint(-46.02F, -14F, -10.99F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 4){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_amtrakitha.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 14||GetColor(entity) == 7){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_b.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}