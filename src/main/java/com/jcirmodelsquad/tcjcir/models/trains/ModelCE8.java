//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CE8 (Ph 2)
// Model Creator: Biba
// Created on: 05.01.2023 - 20:59:28
// Last changed on: 05.01.2023 - 20:59:28

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelNewBlombergA1ATruck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelCE8 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCE8() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[361];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[5] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[6] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 336
		bodyModel[7] = new ModelRendererTurbo(this, 152, 216, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 15, 165, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 356
		bodyModel[12] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 151
		bodyModel[13] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 184
		bodyModel[14] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[15] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[16] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[18] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 32, 203, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[24] = new ModelRendererTurbo(this, 105, 186, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 67
		bodyModel[26] = new ModelRendererTurbo(this, 10, 187, textureX, textureY); // Box 68
		bodyModel[27] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[28] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[29] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[30] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[35] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 78
		bodyModel[37] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[39] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[40] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[41] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[42] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[46] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[47] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[48] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[49] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[50] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[51] = new ModelRendererTurbo(this, 367, 199, textureX, textureY); // Box 378
		bodyModel[52] = new ModelRendererTurbo(this, 367, 205, textureX, textureY); // Box 379
		bodyModel[53] = new ModelRendererTurbo(this, 367, 202, textureX, textureY); // Box 380
		bodyModel[54] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[55] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[56] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[57] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[58] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[59] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 129, 216, textureX, textureY); // Box 346
		bodyModel[61] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[62] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[63] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[64] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[65] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[66] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[68] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[69] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[70] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[71] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[72] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[73] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[74] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[75] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[76] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[77] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[78] = new ModelRendererTurbo(this, 32, 192, textureX, textureY); // Box 617
		bodyModel[79] = new ModelRendererTurbo(this, 32, 190, textureX, textureY); // Box 618
		bodyModel[80] = new ModelRendererTurbo(this, 10, 198, textureX, textureY); // Box 620
		bodyModel[81] = new ModelRendererTurbo(this, 10, 200, textureX, textureY); // Box 621
		bodyModel[82] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[83] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[84] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[85] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[86] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[87] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[88] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[89] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[90] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[91] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[92] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[93] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[94] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[95] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[96] = new ModelRendererTurbo(this, 288, 196, textureX, textureY); // Box 37
		bodyModel[97] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[99] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 125, 230, textureX, textureY); // Box 38
		bodyModel[103] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[104] = new ModelRendererTurbo(this, 175, 216, textureX, textureY); // Box 40
		bodyModel[105] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 94
		bodyModel[106] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 95
		bodyModel[107] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[108] = new ModelRendererTurbo(this, 175, 221, textureX, textureY); // Box 600
		bodyModel[109] = new ModelRendererTurbo(this, 126, 236, textureX, textureY); // Box 128 engine oil sump
		bodyModel[110] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 347
		bodyModel[111] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 130
		bodyModel[112] = new ModelRendererTurbo(this, 220, 232, textureX, textureY); // Box 93
		bodyModel[113] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[114] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[115] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 526
		bodyModel[116] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 527
		bodyModel[117] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[118] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[119] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 142
		bodyModel[120] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 143
		bodyModel[121] = new ModelRendererTurbo(this, 410, 193, textureX, textureY); // Box 53
		bodyModel[122] = new ModelRendererTurbo(this, 423, 196, textureX, textureY); // Box 54
		bodyModel[123] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 55
		bodyModel[124] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[125] = new ModelRendererTurbo(this, 430, 193, textureX, textureY); // Box 235
		bodyModel[126] = new ModelRendererTurbo(this, 403, 196, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[127] = new ModelRendererTurbo(this, 408, 152, textureX, textureY); // Box 125
		bodyModel[128] = new ModelRendererTurbo(this, 402, 213, textureX, textureY); // Box 143
		bodyModel[129] = new ModelRendererTurbo(this, 443, 200, textureX, textureY); // Box 338
		bodyModel[130] = new ModelRendererTurbo(this, 456, 200, textureX, textureY); // Box 340
		bodyModel[131] = new ModelRendererTurbo(this, 454, 198, textureX, textureY); // Box 344
		bodyModel[132] = new ModelRendererTurbo(this, 304, 130, textureX, textureY); // Box 52 door swing right
		bodyModel[133] = new ModelRendererTurbo(this, 379, 103, textureX, textureY); // Box 68
		bodyModel[134] = new ModelRendererTurbo(this, 395, 96, textureX, textureY); // Box 69
		bodyModel[135] = new ModelRendererTurbo(this, 348, 117, textureX, textureY); // Box 70
		bodyModel[136] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[137] = new ModelRendererTurbo(this, 348, 101, textureX, textureY); // Box 75
		bodyModel[138] = new ModelRendererTurbo(this, 322, 101, textureX, textureY); // Box 76
		bodyModel[139] = new ModelRendererTurbo(this, 396, 133, textureX, textureY); // Box 72
		bodyModel[140] = new ModelRendererTurbo(this, 315, 133, textureX, textureY); // Box 190
		bodyModel[141] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[142] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[143] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[144] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[145] = new ModelRendererTurbo(this, 269, 118, textureX, textureY); // Box 313
		bodyModel[146] = new ModelRendererTurbo(this, 385, 130, textureX, textureY); // Box 314 door swing right
		bodyModel[147] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[148] = new ModelRendererTurbo(this, 288, 107, textureX, textureY); // Box 332
		bodyModel[149] = new ModelRendererTurbo(this, 326, 111, textureX, textureY); // Box 333
		bodyModel[150] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 67
		bodyModel[151] = new ModelRendererTurbo(this, 68, 19, textureX, textureY); // Box 176
		bodyModel[152] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[153] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[154] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[155] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Box 574 nose light mount
		bodyModel[156] = new ModelRendererTurbo(this, 403, 208, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[157] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[158] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[159] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[160] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[161] = new ModelRendererTurbo(this, 438, 129, textureX, textureY); // Box 412 cs1
		bodyModel[162] = new ModelRendererTurbo(this, 458, 131, textureX, textureY); // Box 413 cs1
		bodyModel[163] = new ModelRendererTurbo(this, 450, 125, textureX, textureY); // Box 86 cs1
		bodyModel[164] = new ModelRendererTurbo(this, 501, 144, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[165] = new ModelRendererTurbo(this, 435, 123, textureX, textureY); // Box 476 cs1 radio
		bodyModel[166] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 482
		bodyModel[167] = new ModelRendererTurbo(this, 463, 116, textureX, textureY); // Box 487 cab heater
		bodyModel[168] = new ModelRendererTurbo(this, 68, 40, textureX, textureY); // Box 81
		bodyModel[169] = new ModelRendererTurbo(this, 428, 114, textureX, textureY); // Box 334
		bodyModel[170] = new ModelRendererTurbo(this, 428, 107, textureX, textureY); // Box 335
		bodyModel[171] = new ModelRendererTurbo(this, 375, 234, textureX, textureY); // Box 184 o2 generator
		bodyModel[172] = new ModelRendererTurbo(this, 252, 129, textureX, textureY); // box64
		bodyModel[173] = new ModelRendererTurbo(this, 235, 129, textureX, textureY); // box65
		bodyModel[174] = new ModelRendererTurbo(this, 487, 189, textureX, textureY); // Box 3 cull AWW 2window
		bodyModel[175] = new ModelRendererTurbo(this, 489, 184, textureX, textureY); // Box 5 AWW 2window
		bodyModel[176] = new ModelRendererTurbo(this, 487, 206, textureX, textureY); // Box 3 cull AWW 2window
		bodyModel[177] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 5 AWW 2window
		bodyModel[178] = new ModelRendererTurbo(this, 263, 136, textureX, textureY); // Box 350
		bodyModel[179] = new ModelRendererTurbo(this, 266, 136, textureX, textureY); // Box 351
		bodyModel[180] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[181] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[182] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[183] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[184] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[185] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[186] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[187] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[188] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[189] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[190] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[191] = new ModelRendererTurbo(this, 238, 87, textureX, textureY); // Box 333
		bodyModel[192] = new ModelRendererTurbo(this, 247, 86, textureX, textureY, "lamp"); // Box 334 Rear Gyralight L
		bodyModel[193] = new ModelRendererTurbo(this, 254, 86, textureX, textureY, "lamp"); // Box 335 Rear Gyralight R
		bodyModel[194] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[195] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[196] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[197] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[198] = new ModelRendererTurbo(this, 46, 83, textureX, textureY); // Box 51
		bodyModel[199] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[200] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[201] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[202] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[203] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[204] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[205] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[206] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[207] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base
		bodyModel[208] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[209] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[210] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[211] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[212] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[213] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[214] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[215] = new ModelRendererTurbo(this, 389, 199, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[216] = new ModelRendererTurbo(this, 380, 199, textureX, textureY); // Box 428
		bodyModel[217] = new ModelRendererTurbo(this, 154, 8, textureX, textureY,"cull"); // Box 282 antenna plate cull
		bodyModel[218] = new ModelRendererTurbo(this, 161, 16, textureX, textureY); // Box 450
		bodyModel[219] = new ModelRendererTurbo(this, 367, 190, textureX, textureY); // Box 427
		bodyModel[220] = new ModelRendererTurbo(this, 367, 193, textureX, textureY); // Box 428
		bodyModel[221] = new ModelRendererTurbo(this, 367, 196, textureX, textureY); // Box 429
		bodyModel[222] = new ModelRendererTurbo(this, 376, 193, textureX, textureY); // Box 430
		bodyModel[223] = new ModelRendererTurbo(this, 387, 181, textureX, textureY); // Box 354
		bodyModel[224] = new ModelRendererTurbo(this, 396, 187, textureX, textureY); // Box 355
		bodyModel[225] = new ModelRendererTurbo(this, 385, 187, textureX, textureY); // Box 356
		bodyModel[226] = new ModelRendererTurbo(this, 387, 193, textureX, textureY); // Box 357
		bodyModel[227] = new ModelRendererTurbo(this, 389, 190, textureX, textureY); // Box 358
		bodyModel[228] = new ModelRendererTurbo(this, 389, 184, textureX, textureY); // Box 359
		bodyModel[229] = new ModelRendererTurbo(this, 161, 18, textureX, textureY); // Box 285
		bodyModel[230] = new ModelRendererTurbo(this, 381, 195, textureX, textureY); // Box 409 commander base
		bodyModel[231] = new ModelRendererTurbo(this, 381, 191, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[232] = new ModelRendererTurbo(this, 400, 176, textureX, textureY); // Box 114
		bodyModel[233] = new ModelRendererTurbo(this, 400, 173, textureX, textureY); // Box 74
		bodyModel[234] = new ModelRendererTurbo(this, 400, 179, textureX, textureY); // Box 78
		bodyModel[235] = new ModelRendererTurbo(this, 398, 168, textureX, textureY); // Box 245
		bodyModel[236] = new ModelRendererTurbo(this, 459, 172, textureX, textureY); // Box 285
		bodyModel[237] = new ModelRendererTurbo(this, 472, 172, textureX, textureY); // Box 286
		bodyModel[238] = new ModelRendererTurbo(this, 473, 166, textureX, textureY); // Box 287
		bodyModel[239] = new ModelRendererTurbo(this, 468, 168, textureX, textureY); // Box 288
		bodyModel[240] = new ModelRendererTurbo(this, 468, 165, textureX, textureY); // Box 289
		bodyModel[241] = new ModelRendererTurbo(this, 475, 162, textureX, textureY); // Box 290
		bodyModel[242] = new ModelRendererTurbo(this, 498, 172, textureX, textureY); // Box 393
		bodyModel[243] = new ModelRendererTurbo(this, 486, 166, textureX, textureY); // Box 394
		bodyModel[244] = new ModelRendererTurbo(this, 485, 172, textureX, textureY); // Box 395
		bodyModel[245] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 396
		bodyModel[246] = new ModelRendererTurbo(this, 497, 165, textureX, textureY); // Box 397
		bodyModel[247] = new ModelRendererTurbo(this, 488, 162, textureX, textureY); // Box 398
		bodyModel[248] = new ModelRendererTurbo(this, 380, 212, textureX, textureY); // Box 364 prime base
		bodyModel[249] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[250] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[251] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[252] = new ModelRendererTurbo(this, 389, 212, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[253] = new ModelRendererTurbo(this, 163, 171, textureX, textureY); // Box 22
		bodyModel[254] = new ModelRendererTurbo(this, 215, 171, textureX, textureY); // Box 23
		bodyModel[255] = new ModelRendererTurbo(this, 176, 169, textureX, textureY); // Box 24
		bodyModel[256] = new ModelRendererTurbo(this, 228, 169, textureX, textureY); // Box 25
		bodyModel[257] = new ModelRendererTurbo(this, 319, 171, textureX, textureY); // Box 431
		bodyModel[258] = new ModelRendererTurbo(this, 267, 171, textureX, textureY); // Box 432
		bodyModel[259] = new ModelRendererTurbo(this, 280, 169, textureX, textureY); // Box 433
		bodyModel[260] = new ModelRendererTurbo(this, 332, 169, textureX, textureY); // Box 434
		bodyModel[261] = new ModelRendererTurbo(this, 367, 177, textureX, textureY); // Box 327
		bodyModel[262] = new ModelRendererTurbo(this, 369, 171, textureX, textureY); // Box 328
		bodyModel[263] = new ModelRendererTurbo(this, 369, 183, textureX, textureY); // Box 329
		bodyModel[264] = new ModelRendererTurbo(this, 378, 177, textureX, textureY); // Box 330
		bodyModel[265] = new ModelRendererTurbo(this, 371, 174, textureX, textureY); // Box 331
		bodyModel[266] = new ModelRendererTurbo(this, 371, 180, textureX, textureY); // Box 332
		bodyModel[267] = new ModelRendererTurbo(this, 390, 171, textureX, textureY); // Box 323
		bodyModel[268] = new ModelRendererTurbo(this, 390, 174, textureX, textureY); // Box 324
		bodyModel[269] = new ModelRendererTurbo(this, 390, 168, textureX, textureY); // Box 325
		bodyModel[270] = new ModelRendererTurbo(this, 389, 164, textureX, textureY); // Box 326
		bodyModel[271] = new ModelRendererTurbo(this, 231, 19, textureX, textureY); // Box 244
		bodyModel[272] = new ModelRendererTurbo(this, 220, 40, textureX, textureY); // Box 249
		bodyModel[273] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[274] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[275] = new ModelRendererTurbo(this, 331, 111, textureX, textureY); // Box 336
		bodyModel[276] = new ModelRendererTurbo(this, 317, 113, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[277] = new ModelRendererTurbo(this, 324, 113, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[278] = new ModelRendererTurbo(this, 361, 227, textureX, textureY); // Box 278
		bodyModel[279] = new ModelRendererTurbo(this, 361, 224, textureX, textureY); // Box 279
		bodyModel[280] = new ModelRendererTurbo(this, 361, 221, textureX, textureY); // Box 280
		bodyModel[281] = new ModelRendererTurbo(this, 356, 224, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[282] = new ModelRendererTurbo(this, 344, 230, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[283] = new ModelRendererTurbo(this, 344, 233, textureX, textureY); // Box 272
		bodyModel[284] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 273
		bodyModel[285] = new ModelRendererTurbo(this, 339, 233, textureX, textureY); // Box 274
		bodyModel[286] = new ModelRendererTurbo(this, 33, 135, textureX, textureY); // DBox 89 actual dynamic fan
		bodyModel[287] = new ModelRendererTurbo(this, 5, 129, textureX, textureY); // DBox 91
		bodyModel[288] = new ModelRendererTurbo(this, 15, 119, textureX, textureY); // DBox 101
		bodyModel[289] = new ModelRendererTurbo(this, 2, 119, textureX, textureY); // DBox 105
		bodyModel[290] = new ModelRendererTurbo(this, 36, 119, textureX, textureY); // DBox 172
		bodyModel[291] = new ModelRendererTurbo(this, 15, 124, textureX, textureY); // DBox 173
		bodyModel[292] = new ModelRendererTurbo(this, 2, 124, textureX, textureY); // DBox 176
		bodyModel[293] = new ModelRendererTurbo(this, 36, 124, textureX, textureY); // DBox 177
		bodyModel[294] = new ModelRendererTurbo(this, 15, 145, textureX, textureY); // DBox 178
		bodyModel[295] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // DBox 179
		bodyModel[296] = new ModelRendererTurbo(this, 36, 150, textureX, textureY); // DBox 180
		bodyModel[297] = new ModelRendererTurbo(this, 15, 150, textureX, textureY); // DBox 181
		bodyModel[298] = new ModelRendererTurbo(this, 2, 150, textureX, textureY); // DBox 182
		bodyModel[299] = new ModelRendererTurbo(this, 2, 145, textureX, textureY); // DBox 183
		bodyModel[300] = new ModelRendererTurbo(this, 360, 231, textureX, textureY); // Box 311
		bodyModel[301] = new ModelRendererTurbo(this, 355, 231, textureX, textureY); // Box 312
		bodyModel[302] = new ModelRendererTurbo(this, 174, 61, textureX, textureY); // Box 354
		bodyModel[303] = new ModelRendererTurbo(this, 174, 61, textureX, textureY); // Box 355
		bodyModel[304] = new ModelRendererTurbo(this, 398, 230, textureX, textureY, "cull"); // Box 73 antenna plate cull
		bodyModel[305] = new ModelRendererTurbo(this, 376, 226, textureX, textureY); // Box 457
		bodyModel[306] = new ModelRendererTurbo(this, 335, 226, textureX, textureY); // Box 78
		bodyModel[307] = new ModelRendererTurbo(this, 335, 226, textureX, textureY); // Box 188
		bodyModel[308] = new ModelRendererTurbo(this, 335, 221, textureX, textureY, "ditch"); // Box 189 ditchlight f up2
		bodyModel[309] = new ModelRendererTurbo(this, 335, 221, textureX, textureY, "ditch"); // Box 190 ditchlight f up2
		bodyModel[310] = new ModelRendererTurbo(this, 328, 226, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[311] = new ModelRendererTurbo(this, 328, 221, textureX, textureY); // Box 190 mu plug
		bodyModel[312] = new ModelRendererTurbo(this, 321, 226, textureX, textureY); // Box 239
		bodyModel[313] = new ModelRendererTurbo(this, 321, 221, textureX, textureY, "ditch"); // Box 24 ditchlight r up2
		bodyModel[314] = new ModelRendererTurbo(this, 321, 221, textureX, textureY, "ditch"); // Box 241 ditchlight r up2
		bodyModel[315] = new ModelRendererTurbo(this, 321, 226, textureX, textureY); // Box 242
		bodyModel[316] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[317] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[318] = new ModelRendererTurbo(this, 223, 12, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[319] = new ModelRendererTurbo(this, 136, 53, textureX, textureY); // Box 519 frame stripe fix
		bodyModel[320] = new ModelRendererTurbo(this, 150, 32, textureX, textureY); // Box 520 frame stripe fix
		bodyModel[321] = new ModelRendererTurbo(this, 224, 18, textureX, textureY, "cull"); // Box 243 handrail cull
		bodyModel[322] = new ModelRendererTurbo(this, 213, 39, textureX, textureY, "cull"); // Box 250 handrail cull
		bodyModel[323] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 514 brw 42 rear triangle
		bodyModel[324] = new ModelRendererTurbo(this, 22, 101, textureX, textureY); // Box 515 brw 42 rear triangle
		bodyModel[325] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 186 fan
		bodyModel[326] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 682 fan
		bodyModel[327] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 186 fan
		bodyModel[328] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 682 fan
		bodyModel[329] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 186 fan
		bodyModel[330] = new ModelRendererTurbo(this, 203, 79, textureX, textureY); // Box 682 fan
		bodyModel[331] = new ModelRendererTurbo(this, 201, 72, textureX, textureY); // Box 375 fan for dynamics
		bodyModel[332] = new ModelRendererTurbo(this, 201, 72, textureX, textureY); // Box 376 fan for dynamics
		bodyModel[333] = new ModelRendererTurbo(this, 2, 114, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[334] = new ModelRendererTurbo(this, 2, 114, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[335] = new ModelRendererTurbo(this, 71, 39, textureX, textureY, "cull"); // Box 81 handrail cull
		bodyModel[336] = new ModelRendererTurbo(this, 71, 20, textureX, textureY, "cull"); // Box 177 handrail cull
		bodyModel[337] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 527
		bodyModel[338] = new ModelRendererTurbo(this, 42, 202, textureX, textureY); // Box 374
		bodyModel[339] = new ModelRendererTurbo(this, 4, 184, textureX, textureY); // Box 65
		bodyModel[340] = new ModelRendererTurbo(this, 3, 187, textureX, textureY, "cull"); // Box 66 stairbit cull
		bodyModel[341] = new ModelRendererTurbo(this, 41, 205, textureX, textureY, "cull"); // Box 79 stairbit cull
		bodyModel[342] = new ModelRendererTurbo(this, 41, 192, textureX, textureY, "cull"); // Box 616 stairbit cull
		bodyModel[343] = new ModelRendererTurbo(this, 3, 200, textureX, textureY, "cull"); // Box 619 stairbit cull
		bodyModel[344] = new ModelRendererTurbo(this, 4, 197, textureX, textureY); // Box 622
		bodyModel[345] = new ModelRendererTurbo(this, 42, 189, textureX, textureY); // Box 623
		bodyModel[346] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[347] = new ModelRendererTurbo(this, 93, 129, textureX, textureY); // Box 526
		bodyModel[348] = new ModelRendererTurbo(this, 78, 27, textureX, textureY); // Box 192
		bodyModel[349] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 196
		bodyModel[350] = new ModelRendererTurbo(this, 56, 143, textureX, textureY); // Box 73 low engi box
		bodyModel[351] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 522
		bodyModel[352] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 523
		bodyModel[353] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 524
		bodyModel[354] = new ModelRendererTurbo(this, 433, 231, textureX, textureY); // Box 42
		bodyModel[355] = new ModelRendererTurbo(this, 57, 230, textureX, textureY); // Box 324
		bodyModel[356] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 506
		bodyModel[357] = new ModelRendererTurbo(this, 224, 79, textureX, textureY, "cull"); // Box 529 spark arrestor
		bodyModel[358] = new ModelRendererTurbo(this, 224, 79, textureX, textureY, "cull"); // Box 529 spark arrestor
		bodyModel[359] = new ModelRendererTurbo(this, 224, 79, textureX, textureY, "cull"); // Box 529 spark arrestor
		bodyModel[360] = new ModelRendererTurbo(this, 224, 79, textureX, textureY, "cull"); // Box 529 spark arrestor

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-48.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-45.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[2].setRotationPoint(-47.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[3].setRotationPoint(-47.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[4].setRotationPoint(-45.01F, 7.5F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[5].setRotationPoint(-45.01F, 8.5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[6].setRotationPoint(-46F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[7].setRotationPoint(-45F, 2F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-45.01F, 8.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-45.01F, 8.5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[10].setRotationPoint(-46F, 1F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[11].setRotationPoint(-46F, 1F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[12].setRotationPoint(-46F, 1F, -2.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 90, 2, 12, 0F); // Box 184
		bodyModel[13].setRotationPoint(-45F, 1F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[14].setRotationPoint(-41F, 1F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[15].setRotationPoint(-45F, 8.5F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[16].setRotationPoint(-45F, 7.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 7
		bodyModel[17].setRotationPoint(-40F, 0F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-45F, 6.25F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[19].setRotationPoint(-45F, 4.5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[20].setRotationPoint(-45F, 2.75F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[21].setRotationPoint(-40F, 2F, -9F);
		bodyModel[21].rotateAngleY = 0.5846853F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[22].setRotationPoint(-45F, 5.25F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[23].setRotationPoint(-45F, 3.5F, -6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 82, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[24].setRotationPoint(-41F, 3F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[25].setRotationPoint(-40F, 2F, 9F);
		bodyModel[25].rotateAngleY = -0.5846853F;

		bodyModel[26].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[26].setRotationPoint(-40F, 4F, 9F);
		bodyModel[26].rotateAngleY = -0.5846853F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[27].setRotationPoint(-41F, 1F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[28].setRotationPoint(-45F, 8.5F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[29].setRotationPoint(-45F, 7.5F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[30].setRotationPoint(-45.01F, 7F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[31].setRotationPoint(-45F, 6.25F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[32].setRotationPoint(-45F, 5.25F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[33].setRotationPoint(-45F, 4.5F, 6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[34].setRotationPoint(-45F, 3.5F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[35].setRotationPoint(-45F, 2.75F, 5.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[36].setRotationPoint(-40F, 4F, -9F);
		bodyModel[36].rotateAngleY = 0.5846853F;

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[37].setRotationPoint(-28.75F, 2.75F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[38].setRotationPoint(-28.25F, 2F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[39].setRotationPoint(-28.25F, 2F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[40].setRotationPoint(-27.25F, 2F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[41].setRotationPoint(-27.25F, 2F, 9F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[42].setRotationPoint(-45.01F, 0F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[43].setRotationPoint(-45.01F, 0F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[44].setRotationPoint(-45.01F, -7F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[45].setRotationPoint(-45.01F, -7F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[46].setRotationPoint(-46.01F, -7F, -2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[47].setRotationPoint(-45.01F, -7F, 3F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[48].setRotationPoint(-45.01F, -7F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[49].setRotationPoint(-45.01F, -7F, -8F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[50].setRotationPoint(-45.01F, -7F, 9F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[51].setRotationPoint(-43.5F, 3F, 4.3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[52].setRotationPoint(-43.25F, 4.5F, 4.55F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[53].setRotationPoint(-43.5F, 4F, 4.3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[54].setRotationPoint(-46.25F, 1F, -2.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[55].setRotationPoint(45.5F, 3F, -1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[56].setRotationPoint(45.01F, 1F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[57].setRotationPoint(45.01F, 7.5F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[58].setRotationPoint(45.01F, 8.5F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[59].setRotationPoint(45F, 3F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[60].setRotationPoint(40F, 2F, -3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[61].setRotationPoint(45F, 1F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[62].setRotationPoint(45F, 1F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[63].setRotationPoint(45F, 1F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[64].setRotationPoint(45.01F, 8.5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[65].setRotationPoint(45.01F, 8.5F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[66].setRotationPoint(45.01F, 7F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[67].setRotationPoint(39F, 1F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[68].setRotationPoint(39F, 1F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[69].setRotationPoint(45.01F, -7F, -8F);
		bodyModel[69].rotateAngleY = -3.14159265F;

		bodyModel[70].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[70].setRotationPoint(45.01F, 0F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[71].setRotationPoint(45.01F, -7F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[72].setRotationPoint(45.01F, -7F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[73].setRotationPoint(46.01F, -7F, -2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[74].setRotationPoint(45.01F, -7F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[75].setRotationPoint(45.01F, -7F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[76].setRotationPoint(45.01F, -7F, 9F);
		bodyModel[76].rotateAngleY = -3.14159265F;

		bodyModel[77].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[77].setRotationPoint(45.01F, 0F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[78].setRotationPoint(40F, 4F, -9F);
		bodyModel[78].rotateAngleY = -0.5846853F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[79].setRotationPoint(40F, 2F, -9F);
		bodyModel[79].rotateAngleY = -0.5846853F;

		bodyModel[80].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[80].setRotationPoint(40F, 2F, 9F);
		bodyModel[80].rotateAngleY = 0.5846853F;

		bodyModel[81].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[81].setRotationPoint(40F, 4F, 9F);
		bodyModel[81].rotateAngleY = 0.5846853F;

		bodyModel[82].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[82].setRotationPoint(40F, 7.5F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[83].setRotationPoint(40F, 8.5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[84].setRotationPoint(40F, 6.25F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[85].setRotationPoint(41F, 5.25F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[86].setRotationPoint(41F, 4.5F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[87].setRotationPoint(41F, 3.5F, -6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[88].setRotationPoint(42F, 2.75F, -7.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[89].setRotationPoint(40F, 7.5F, 9F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[90].setRotationPoint(40F, 8.5F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[91].setRotationPoint(41F, 5.25F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[92].setRotationPoint(40F, 6.25F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[93].setRotationPoint(41F, 3.5F, 6.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[94].setRotationPoint(41F, 4.5F, 6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[95].setRotationPoint(42F, 2.75F, 5.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 37
		bodyModel[96].setRotationPoint(12F, 0F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[97].setRotationPoint(24.75F, 2.75F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[98].setRotationPoint(25.25F, 2F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[99].setRotationPoint(25.25F, 2F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[100].setRotationPoint(26.25F, 2F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[101].setRotationPoint(26.25F, 2F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 24, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[102].setRotationPoint(-12F, 0F, -10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[103].setRotationPoint(12F, 2F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[104].setRotationPoint(-16F, 2F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[105].setRotationPoint(-12F, 3.5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[106].setRotationPoint(-12F, 3.5F, 9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[107].setRotationPoint(12F, 2F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[108].setRotationPoint(-16F, 2F, 9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128 engine oil sump
		bodyModel[109].setRotationPoint(12F, 3F, -3F);
		bodyModel[109].rotateAngleZ = -1.11701072F;

		bodyModel[110].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 347
		bodyModel[110].setRotationPoint(-10F, 6.5F, -8F);
		bodyModel[110].rotateAngleZ = 0.78539816F;

		bodyModel[111].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 130
		bodyModel[111].setRotationPoint(11F, 6.5F, -8F);
		bodyModel[111].rotateAngleZ = 0.78539816F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 24, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[112].setRotationPoint(-12F, 0F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[113].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[114].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526
		bodyModel[115].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527
		bodyModel[116].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[117].setRotationPoint(-4.5F, 0.5F, 9.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[118].setRotationPoint(-4.5F, 0.5F, -10.75F);

		bodyModel[119].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 142
		bodyModel[119].setRotationPoint(-10.5F, 3F, -8.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 143
		bodyModel[120].setRotationPoint(-10.5F, 3F, 8.01F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[121].setRotationPoint(-42F, -13F, 1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[122].setRotationPoint(-42F, -13F, -1F);

		bodyModel[123].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[123].setRotationPoint(-41F, -13F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[124].setRotationPoint(-41.25F, -12F, -5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[125].setRotationPoint(-42F, -13F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[126].setRotationPoint(-41.25F, -12F, 3.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[127].setRotationPoint(-41F, -14F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[128].setRotationPoint(-41.5F, -13.5F, -1F);

		bodyModel[129].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[129].setRotationPoint(-41.5F, -14F, -5.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[130].setRotationPoint(-41.5F, -14F, 5.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[131].setRotationPoint(-38.5F, -14F, 5.5F);
		bodyModel[131].rotateAngleY = -0.78539816F;

		bodyModel[132].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[132].setRotationPoint(-34.5F, -18F, -9.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[133].setRotationPoint(-35F, -22F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[134].setRotationPoint(-35F, -22F, 9F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 13, 17, 0F); // Box 70
		bodyModel[135].setRotationPoint(-21F, -18F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[136].setRotationPoint(-38F, -22F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[137].setRotationPoint(-37F, -22F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[138].setRotationPoint(-37F, -22F, 1F);

		bodyModel[139].addBox(0F, 0F, 0F, 14, 13, 1, 0F); // Box 72
		bodyModel[139].setRotationPoint(-35F, -18F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 190
		bodyModel[140].setRotationPoint(-35F, -18F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[141].setRotationPoint(-35.05F, -21F, -6F);
		bodyModel[141].rotateAngleY = 0.38397244F;

		bodyModel[142].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[142].setRotationPoint(-35.05F, -21F, 6F);
		bodyModel[142].rotateAngleY = -0.38397244F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[143].setRotationPoint(-37.75F, -22F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[144].setRotationPoint(-37.75F, -20F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 313
		bodyModel[145].setRotationPoint(-35F, -18F, -6F);

		bodyModel[146].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[146].setRotationPoint(-20.5F, -18F, 10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[147].setRotationPoint(-35F, -5F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[148].setRotationPoint(-35F, -21F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[149].setRotationPoint(-21F, -21F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[150].setRotationPoint(-35F, -22F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[151].setRotationPoint(-40.5F, -5F, 10.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[152].setRotationPoint(-38F, -4F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[153].setRotationPoint(-39F, -2F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[154].setRotationPoint(-42.35F, -10F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[155].setRotationPoint(-42.6F, -12F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[156].setRotationPoint(-42.35F, -12F, -1F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[157].setRotationPoint(-20F, -4F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[158].setRotationPoint(-20F, -5F, 11.01F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[159].setRotationPoint(-19F, -2F, 7F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[160].setRotationPoint(-19F, -4F, 11.01F);

		bodyModel[161].addBox(0.5F, 0F, 0.5F, 4, 9, 3, 0F); // Box 412 cs1
		bodyModel[161].setRotationPoint(-29F, -14F, 0F);
		bodyModel[161].rotateAngleY = -0.26179939F;

		bodyModel[162].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Box 413 cs1
		bodyModel[162].setRotationPoint(-34.1F, -12F, 4F);
		bodyModel[162].rotateAngleY = -0.59341195F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 86 cs1
		bodyModel[163].setRotationPoint(-34.1F, -14F, 4F);
		bodyModel[163].rotateAngleY = -0.59341195F;

		bodyModel[164].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[164].setRotationPoint(-34F, -12F, -4F);

		bodyModel[165].addShapeBox(0.5F, 0F, 0.5F, 4, 2, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 476 cs1 radio
		bodyModel[165].setRotationPoint(-29F, -16F, 0F);
		bodyModel[165].rotateAngleY = -0.26179939F;

		bodyModel[166].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 482
		bodyModel[166].setRotationPoint(-22F, -21F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487 cab heater
		bodyModel[167].setRotationPoint(-34F, -10F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[168].setRotationPoint(-40.5F, -5F, -11.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[169].setRotationPoint(-34F, -21F, 6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[170].setRotationPoint(-34F, -21F, -9F);

		bodyModel[171].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[171].setRotationPoint(-30.5F, -23.75F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[172].setRotationPoint(-34F, -18F, 11F);
		bodyModel[172].rotateAngleX = 0.26179939F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[173].setRotationPoint(-34F, -18.25F, -11.97F);
		bodyModel[173].rotateAngleX = -0.26179939F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[174].setRotationPoint(-34F, -17F, 10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[175].setRotationPoint(-34F, -18F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull AWW 2window
		bodyModel[176].setRotationPoint(-27F, -17F, -10F);
		bodyModel[176].rotateAngleY = -3.14159265F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 AWW 2window
		bodyModel[177].setRotationPoint(-27F, -18F, -10F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[178].setRotationPoint(-34F, -16F, -12F);

		bodyModel[179].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[179].setRotationPoint(-34F, -16F, 11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[180].setRotationPoint(40F, -20F, 1F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[181].setRotationPoint(40F, -20F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[182].setRotationPoint(40F, -20F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[183].setRotationPoint(42.5F, -18.5F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[184].setRotationPoint(42.75F, -18.5F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[185].setRotationPoint(42.75F, -16.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[186].setRotationPoint(40F, -1F, 1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[187].setRotationPoint(40F, -8F, 1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[188].setRotationPoint(40F, -8F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[189].setRotationPoint(39.75F, -7F, 3.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[190].setRotationPoint(39.75F, -5F, 4F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[191].setRotationPoint(42F, -20.5F, -2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 Rear Gyralight L
		bodyModel[192].setRotationPoint(43.25F, -20.5F, -2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 Rear Gyralight R
		bodyModel[193].setRotationPoint(43.25F, -20.5F, 0F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[194].setRotationPoint(42F, -8F, 2.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[195].setRotationPoint(39.5F, -20.5F, -1F);

		bodyModel[196].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[196].setRotationPoint(40.51F, -17F, -6F);
		bodyModel[196].rotateAngleY = -0.4712389F;

		bodyModel[197].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[197].setRotationPoint(40.51F, -17F, 6F);
		bodyModel[197].rotateAngleY = 0.4712389F;

		bodyModel[198].addBox(0F, 0F, 0F, 60, 20, 14, 0F); // Box 51
		bodyModel[198].setRotationPoint(-20F, -20F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[199].setRotationPoint(-5.25F, -22F, -1.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[200].setRotationPoint(-2.75F, -22F, -1.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[201].setRotationPoint(19.75F, -22F, -1.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[202].setRotationPoint(22.25F, -22F, -1.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[203].setRotationPoint(5.5F, -18.5F, 6.1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[204].setRotationPoint(27F, -18.5F, 6.1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[205].setRotationPoint(27F, -18.5F, -7.1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[206].setRotationPoint(5.5F, -18.5F, -7.1F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base
		bodyModel[207].setRotationPoint(-34F, -23F, -8.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[208].setRotationPoint(-34F, -24F, -8.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[209].setRotationPoint(-34F, -24F, -8.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[210].setRotationPoint(-34F, -24F, -8.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[211].setRotationPoint(-34F, -24F, -8.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[212].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[213].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[214].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[215].setRotationPoint(-34F, -23.5F, 6.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[216].setRotationPoint(-34F, -23F, 6.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[217].setRotationPoint(-25F, -24F, -2.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[218].setRotationPoint(-24F, -25F, 0F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[219].setRotationPoint(-34F, -23.5F, -8.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428
		bodyModel[220].setRotationPoint(-33F, -23.5F, -7.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429
		bodyModel[221].setRotationPoint(-34F, -23.5F, -6.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430
		bodyModel[222].setRotationPoint(-32.5F, -22.5F, -7.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[223].setRotationPoint(-24.5F, -23.5F, -5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[224].setRotationPoint(-23F, -22.75F, -6F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[225].setRotationPoint(-25.5F, -23.75F, -6F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[226].setRotationPoint(-25F, -23.5F, -7F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[227].setRotationPoint(-24F, -24.75F, -6.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[228].setRotationPoint(-24F, -24.75F, -5.25F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[229].setRotationPoint(-25.5F, -23F, 6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[230].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[231].setRotationPoint(-25F, -24F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[232].setRotationPoint(-19F, -18.25F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[233].setRotationPoint(-19F, -19.25F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[234].setRotationPoint(-18.75F, -17.75F, -8.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[235].setRotationPoint(-19F, -20.25F, -8.8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -1F, 1F, 1F, 0F, 1F, 1F); // Box 285
		bodyModel[236].setRotationPoint(-28F, -26F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[237].setRotationPoint(-28F, -26F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[238].setRotationPoint(-28F, -28F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[239].setRotationPoint(-28F, -28F, 8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[240].setRotationPoint(-28F, -29F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[241].setRotationPoint(-28F, -29F, 6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 1F, 1F, -1F, 1F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[242].setRotationPoint(-28F, -26F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[243].setRotationPoint(-28F, -28F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[244].setRotationPoint(-28F, -26F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[245].setRotationPoint(-28F, -28F, -9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[246].setRotationPoint(-28F, -29F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[247].setRotationPoint(-28F, -29F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[248].setRotationPoint(-37.5F, -25F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[249].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[250].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[251].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[252].setRotationPoint(-37.5F, -25.5F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[253].setRotationPoint(-49F, 7.5F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[254].setRotationPoint(-49F, 7.5F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[255].setRotationPoint(-48F, 6.5F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[256].setRotationPoint(-48F, 6.5F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[257].setRotationPoint(48F, 7.5F, 0F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[258].setRotationPoint(48F, 7.5F, -10F);

		bodyModel[259].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 433
		bodyModel[259].setRotationPoint(48F, 6.5F, -10F);

		bodyModel[260].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 434
		bodyModel[260].setRotationPoint(48F, 6.5F, 0F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[261].setRotationPoint(4.5F, -21.5F, -6F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[262].setRotationPoint(5.5F, -21.25F, -5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[263].setRotationPoint(5F, -21.25F, -7F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[264].setRotationPoint(7F, -20.5F, -6F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[265].setRotationPoint(6F, -22.5F, -5.25F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[266].setRotationPoint(6F, -22.5F, -6.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[267].setRotationPoint(1F, -18F, 7.7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[268].setRotationPoint(1.25F, -17.5F, 7.95F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[269].setRotationPoint(1F, -19F, 7.7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[270].setRotationPoint(1F, -20F, 7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[271].setRotationPoint(40.5F, -6F, 10.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[272].setRotationPoint(40.5F, -6F, -11.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 92
		bodyModel[273].setRotationPoint(-15F, -8F, 11F);

		bodyModel[274].addBox(0F, 0F, 0F, 60, 8, 0, 0F); // Box 99
		bodyModel[274].setRotationPoint(-20F, -8F, -11F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[275].setRotationPoint(-37.5F, -24F, -2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[276].setRotationPoint(-38.25F, -24F, 0F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[277].setRotationPoint(-38.25F, -24F, -2F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[278].setRotationPoint(-38F, -24.5F, -1.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[279].setRotationPoint(-37F, -24.5F, -0.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[280].setRotationPoint(-39F, -24.5F, 0.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[281].setRotationPoint(-36F, -23.5F, -0.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[282].setRotationPoint(-37F, -24F, 7F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[283].setRotationPoint(-34F, -24F, 6F);

		bodyModel[284].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[284].setRotationPoint(-36F, -24F, 5F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[285].setRotationPoint(-34F, -23F, 6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89 actual dynamic fan
		bodyModel[286].setRotationPoint(6.5F, -21.5F, -3F);

		bodyModel[287].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[287].setRotationPoint(6.5F, -21F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[288].setRotationPoint(5.5F, -19F, 7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[289].setRotationPoint(1.5F, -19F, 7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[290].setRotationPoint(13.5F, -19F, 7F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[291].setRotationPoint(5.5F, -21F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[292].setRotationPoint(1.5F, -21F, 7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[293].setRotationPoint(13.5F, -21F, 7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[294].setRotationPoint(5.5F, -21F, -9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[295].setRotationPoint(13.5F, -21F, -9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[296].setRotationPoint(13.5F, -19F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[297].setRotationPoint(5.5F, -19F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[298].setRotationPoint(1.5F, -19F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[299].setRotationPoint(1.5F, -21F, -9F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[300].setRotationPoint(36F, -21.5F, 5F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[301].setRotationPoint(36F, -20.5F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 354
		bodyModel[302].setRotationPoint(-19F, -18.5F, 6.1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 355
		bodyModel[303].setRotationPoint(-19F, -18.5F, -7.1F);

		bodyModel[304].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 73 antenna plate cull
		bodyModel[304].setRotationPoint(-36F, -24F, -3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[305].setRotationPoint(-35F, -25F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[306].setRotationPoint(-45F, -2F, 3.75F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[307].setRotationPoint(-45F, -2F, -5.75F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[308].setRotationPoint(-45.25F, -2F, 3.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[309].setRotationPoint(-45.25F, -2F, -5.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[310].setRotationPoint(-45.25F, -3F, -4.75F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[311].setRotationPoint(-45.5F, -3F, -4.75F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[312].setRotationPoint(44F, -2F, -5.75F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[313].setRotationPoint(44.25F, -2F, -5.75F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[314].setRotationPoint(44.25F, -2F, 3.75F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[315].setRotationPoint(44F, -2F, 3.75F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[316].setRotationPoint(44.5F, -3F, 2.75F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[317].setRotationPoint(44.75F, -3F, 2.75F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 53, 1, 22, 0F,0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F); // Box 488 handrail extension cull
		bodyModel[318].setRotationPoint(-14F, 0.48F, -11F);

		bodyModel[319].addBox(0F, 0F, 0F, 24, 4, 0, 0F); // Box 519 frame stripe fix
		bodyModel[319].setRotationPoint(-12F, 0F, -10.51F);

		bodyModel[320].addBox(0F, 0F, 0F, 24, 4, 0, 0F); // Box 520 frame stripe fix
		bodyModel[320].setRotationPoint(-12F, 0F, 10.51F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243 handrail cull
		bodyModel[321].setRotationPoint(40F, -8F, 9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250 handrail cull
		bodyModel[322].setRotationPoint(40F, -8F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 514 brw 42 rear triangle
		bodyModel[323].setRotationPoint(47.01F, 6.5F, 0F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515 brw 42 rear triangle
		bodyModel[324].setRotationPoint(47.01F, 6.5F, 8F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[325].setRotationPoint(-12F, -21F, -2.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[326].setRotationPoint(-18F, -21F, -2.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[327].setRotationPoint(10F, -21F, -2.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[328].setRotationPoint(4F, -21F, -2.5F);

		bodyModel[329].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[329].setRotationPoint(32F, -21F, -2.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[330].setRotationPoint(26F, -21F, -2.5F);

		bodyModel[331].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 375 fan for dynamics
		bodyModel[331].setRotationPoint(1F, -21F, -2.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 376 fan for dynamics
		bodyModel[332].setRotationPoint(13F, -21F, -2.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[333].setRotationPoint(5.5F, -19.5F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[334].setRotationPoint(5.5F, -19.5F, 8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81 handrail cull
		bodyModel[335].setRotationPoint(-40.5F, -11F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177 handrail cull
		bodyModel[336].setRotationPoint(-40.5F, -11F, 9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 527
		bodyModel[337].setRotationPoint(-40.5F, -10F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[338].setRotationPoint(-39.25F, 2F, -11F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[339].setRotationPoint(-39.25F, 2F, 11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66 stairbit cull
		bodyModel[340].setRotationPoint(-40F, 2F, 9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79 stairbit cull
		bodyModel[341].setRotationPoint(-40F, 2F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 616 stairbit cull
		bodyModel[342].setRotationPoint(39F, 2F, -11F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 619 stairbit cull
		bodyModel[343].setRotationPoint(39F, 2F, 9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[344].setRotationPoint(37.25F, 2F, 11F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[345].setRotationPoint(37.25F, 2F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[346].setRotationPoint(-39F, -11F, -11F);

		bodyModel[347].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 526
		bodyModel[347].setRotationPoint(-40F, -11F, -11.01F);

		bodyModel[348].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 192
		bodyModel[348].setRotationPoint(-40F, -11F, 11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0.75F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F); // Box 196
		bodyModel[349].setRotationPoint(-36.5F, -11F, 11.01F);

		bodyModel[350].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 73 low engi box
		bodyModel[350].setRotationPoint(-40F, -3F, 6F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[351].setRotationPoint(-17F, -10F, 11.01F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1.25F, -3F, 0F, -1.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, 0.25F, 0F, 0F); // Box 523
		bodyModel[352].setRotationPoint(-20F, -13F, 11.01F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 524
		bodyModel[353].setRotationPoint(-18F, -10F, 11.01F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 18, 3, 20, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 42
		bodyModel[354].setRotationPoint(-8.75F, 4.1F, -10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 18, 2, 16, 0F,-0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 324
		bodyModel[355].setRotationPoint(-8.75F, 7.1F, -8F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 18, 1, 18, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, -0.5F, 1F); // Box 506
		bodyModel[356].setRotationPoint(-8.75F, 3.85F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 529 spark arrestor
		bodyModel[357].setRotationPoint(-5.75F, -23F, -1.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.375F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F); // Box 529 spark arrestor
		bodyModel[358].setRotationPoint(-3.25F, -23F, -1.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 529 spark arrestor
		bodyModel[359].setRotationPoint(19.25F, -23F, -1.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.375F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F); // Box 529 spark arrestor
		bodyModel[360].setRotationPoint(21.75F, -23F, -1.5F);
	}
	ModelNewBlombergA1ATruck theTruck = new ModelNewBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity ,f5);

		if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBlombergA1ATruckSilverFncc.png"));

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/NewBlombergA1ATruckBlack.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.67, -0.02, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.35, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}