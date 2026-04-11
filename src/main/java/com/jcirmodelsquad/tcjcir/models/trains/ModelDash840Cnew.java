//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.09.2023 - 12:54:26
// Last changed on: 14.09.2023 - 12:54:26

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB3_new;
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

public class ModelDash840Cnew extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash840Cnew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[489];

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
		bodyModel[18] = new ModelRendererTurbo(this, 70, 84, textureX, textureY); // Box 280
		bodyModel[19] = new ModelRendererTurbo(this, 81, 82, textureX, textureY); // Box 285
		bodyModel[20] = new ModelRendererTurbo(this, 41, 90, textureX, textureY); // Box 727
		bodyModel[21] = new ModelRendererTurbo(this, 28, 92, textureX, textureY); // Box 728
		bodyModel[22] = new ModelRendererTurbo(this, 15, 94, textureX, textureY); // Box 729
		bodyModel[23] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Box 730
		bodyModel[24] = new ModelRendererTurbo(this, 15, 84, textureX, textureY); // Box 732
		bodyModel[25] = new ModelRendererTurbo(this, 4, 86, textureX, textureY); // Box 734
		bodyModel[26] = new ModelRendererTurbo(this, 70, 161, textureX, textureY); // Box 201
		bodyModel[27] = new ModelRendererTurbo(this, 48, 166, textureX, textureY); // Box 202
		bodyModel[28] = new ModelRendererTurbo(this, 79, 156, textureX, textureY); // Box 293
		bodyModel[29] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 294
		bodyModel[30] = new ModelRendererTurbo(this, 70, 164, textureX, textureY); // Box 392
		bodyModel[31] = new ModelRendererTurbo(this, 79, 158, textureX, textureY); // Box 393
		bodyModel[32] = new ModelRendererTurbo(this, 57, 166, textureX, textureY); // Box 394
		bodyModel[33] = new ModelRendererTurbo(this, 48, 169, textureX, textureY); // Box 395
		bodyModel[34] = new ModelRendererTurbo(this, 13, 142, textureX, textureY); // box65
		bodyModel[35] = new ModelRendererTurbo(this, 259, 128, textureX, textureY); // Box 440 front mounting stuff
		bodyModel[36] = new ModelRendererTurbo(this, 190, 88, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[37] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[38] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[39] = new ModelRendererTurbo(this, 259, 128, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[40] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[41] = new ModelRendererTurbo(this, 220, 85, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[42] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[43] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[45] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[46] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[47] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 209, 62, textureX, textureY); // Box 251
		bodyModel[49] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 424
		bodyModel[50] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 426
		bodyModel[51] = new ModelRendererTurbo(this, 274, 84, textureX, textureY); // Box 156
		bodyModel[52] = new ModelRendererTurbo(this, 217, 173, textureX, textureY, "cull"); // Box 630 cull thing
		bodyModel[53] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 382
		bodyModel[54] = new ModelRendererTurbo(this, 377, 116, textureX, textureY); // Box 450
		bodyModel[55] = new ModelRendererTurbo(this, 368, 118, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[56] = new ModelRendererTurbo(this, 44, 173, textureX, textureY); // Box 457
		bodyModel[57] = new ModelRendererTurbo(this, 44, 167, textureX, textureY); // Box 458
		bodyModel[58] = new ModelRendererTurbo(this, 41, 166, textureX, textureY); // Box 459
		bodyModel[59] = new ModelRendererTurbo(this, 53, 147, textureX, textureY); // Box 462
		bodyModel[60] = new ModelRendererTurbo(this, 15, 117, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[61] = new ModelRendererTurbo(this, 27, 112, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[62] = new ModelRendererTurbo(this, 33, 117, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[63] = new ModelRendererTurbo(this, 27, 117, textureX, textureY); // Box 467
		bodyModel[64] = new ModelRendererTurbo(this, 48, 134, textureX, textureY); // Box 363
		bodyModel[65] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[66] = new ModelRendererTurbo(this, 41, 133, textureX, textureY); // Box 144
		bodyModel[67] = new ModelRendererTurbo(this, 39, 133, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[69] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[70] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[71] = new ModelRendererTurbo(this, 14, 134, textureX, textureY); // Box 870
		bodyModel[72] = new ModelRendererTurbo(this, 17, 133, textureX, textureY); // Box 148
		bodyModel[73] = new ModelRendererTurbo(this, 23, 133, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[75] = new ModelRendererTurbo(this, 11, 164, textureX, textureY); // Box 481
		bodyModel[76] = new ModelRendererTurbo(this, 23, 173, textureX, textureY); // Box 482
		bodyModel[77] = new ModelRendererTurbo(this, 23, 167, textureX, textureY); // Box 483
		bodyModel[78] = new ModelRendererTurbo(this, 20, 166, textureX, textureY); // Box 484
		bodyModel[79] = new ModelRendererTurbo(this, 24, 165, textureX, textureY); // Box 485
		bodyModel[80] = new ModelRendererTurbo(this, 50, 147, textureX, textureY); // Box 495
		bodyModel[81] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 496
		bodyModel[82] = new ModelRendererTurbo(this, 377, 111, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 276, 2, textureX, textureY); // Box 6
		bodyModel[84] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 292
		bodyModel[85] = new ModelRendererTurbo(this, 209, 4, textureX, textureY); // Box 293
		bodyModel[86] = new ModelRendererTurbo(this, 210, 11, textureX, textureY); // Box 294
		bodyModel[87] = new ModelRendererTurbo(this, 471, 178, textureX, textureY); // Box 133
		bodyModel[88] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 134
		bodyModel[89] = new ModelRendererTurbo(this, 44, 147, textureX, textureY); // Box 135
		bodyModel[90] = new ModelRendererTurbo(this, 434, 184, textureX, textureY); // Box 136
		bodyModel[91] = new ModelRendererTurbo(this, 434, 186, textureX, textureY); // Box 137
		bodyModel[92] = new ModelRendererTurbo(this, 434, 192, textureX, textureY); // Box 138
		bodyModel[93] = new ModelRendererTurbo(this, 437, 185, textureX, textureY); // Box 139
		bodyModel[94] = new ModelRendererTurbo(this, 445, 181, textureX, textureY); // Box 140
		bodyModel[95] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 141
		bodyModel[96] = new ModelRendererTurbo(this, 79, 158, textureX, textureY); // Box 142
		bodyModel[97] = new ModelRendererTurbo(this, 70, 164, textureX, textureY); // Box 143
		bodyModel[98] = new ModelRendererTurbo(this, 70, 161, textureX, textureY); // Box 144
		bodyModel[99] = new ModelRendererTurbo(this, 79, 156, textureX, textureY); // Box 145
		bodyModel[100] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 146
		bodyModel[101] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 147
		bodyModel[102] = new ModelRendererTurbo(this, 70, 158, textureX, textureY); // Box 148
		bodyModel[103] = new ModelRendererTurbo(this, 78, 160, textureX, textureY); // Box 149
		bodyModel[104] = new ModelRendererTurbo(this, 56, 168, textureX, textureY); // Box 150
		bodyModel[105] = new ModelRendererTurbo(this, 48, 166, textureX, textureY); // Box 151
		bodyModel[106] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 152
		bodyModel[107] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 153
		bodyModel[108] = new ModelRendererTurbo(this, 57, 166, textureX, textureY); // Box 154
		bodyModel[109] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 155
		bodyModel[110] = new ModelRendererTurbo(this, 47, 175, textureX, textureY); // Box 156
		bodyModel[111] = new ModelRendererTurbo(this, 50, 164, textureX, textureY); // Box 157
		bodyModel[112] = new ModelRendererTurbo(this, 454, 184, textureX, textureY); // Box 158
		bodyModel[113] = new ModelRendererTurbo(this, 454, 186, textureX, textureY); // Box 159
		bodyModel[114] = new ModelRendererTurbo(this, 454, 192, textureX, textureY); // Box 160
		bodyModel[115] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 161
		bodyModel[116] = new ModelRendererTurbo(this, 425, 181, textureX, textureY); // Box 162
		bodyModel[117] = new ModelRendererTurbo(this, 425, 48, textureX, textureY); // Box 96
		bodyModel[118] = new ModelRendererTurbo(this, 156, 227, textureX, textureY); // Box 298
		bodyModel[119] = new ModelRendererTurbo(this, 123, 228, textureX, textureY); // Box 279
		bodyModel[120] = new ModelRendererTurbo(this, 108, 234, textureX, textureY); // Box 282
		bodyModel[121] = new ModelRendererTurbo(this, 93, 234, textureX, textureY); // Box 283
		bodyModel[122] = new ModelRendererTurbo(this, 118, 231, textureX, textureY); // Box 297
		bodyModel[123] = new ModelRendererTurbo(this, 183, 218, textureX, textureY); // Box 298
		bodyModel[124] = new ModelRendererTurbo(this, 169, 208, textureX, textureY); // Box 299
		bodyModel[125] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 300
		bodyModel[126] = new ModelRendererTurbo(this, 154, 219, textureX, textureY); // Box 301
		bodyModel[127] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 302
		bodyModel[128] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 258
		bodyModel[129] = new ModelRendererTurbo(this, 65, 239, textureX, textureY); // Box 275
		bodyModel[130] = new ModelRendererTurbo(this, 151, 204, textureX, textureY); // Box 688
		bodyModel[131] = new ModelRendererTurbo(this, 154, 206, textureX, textureY); // Box 210
		bodyModel[132] = new ModelRendererTurbo(this, 50, 239, textureX, textureY); // Box 208
		bodyModel[133] = new ModelRendererTurbo(this, 85, 237, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[134] = new ModelRendererTurbo(this, 85, 242, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[135] = new ModelRendererTurbo(this, 82, 247, textureX, textureY); // Box 354
		bodyModel[136] = new ModelRendererTurbo(this, 222, 243, textureX, textureY); // Box 317
		bodyModel[137] = new ModelRendererTurbo(this, 222, 241, textureX, textureY); // Box 318
		bodyModel[138] = new ModelRendererTurbo(this, 222, 249, textureX, textureY); // Box 319
		bodyModel[139] = new ModelRendererTurbo(this, 222, 251, textureX, textureY); // Box 220
		bodyModel[140] = new ModelRendererTurbo(this, 219, 241, textureX, textureY); // Box 221
		bodyModel[141] = new ModelRendererTurbo(this, 215, 248, textureX, textureY); // Box 222
		bodyModel[142] = new ModelRendererTurbo(this, 216, 241, textureX, textureY); // Box 223
		bodyModel[143] = new ModelRendererTurbo(this, 212, 248, textureX, textureY); // Box 224
		bodyModel[144] = new ModelRendererTurbo(this, 367, 99, textureX, textureY); // Box 18 late stack
		bodyModel[145] = new ModelRendererTurbo(this, 380, 96, textureX, textureY); // Box 21 late stack
		bodyModel[146] = new ModelRendererTurbo(this, 367, 91, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[147] = new ModelRendererTurbo(this, 52, 228, textureX, textureY); // Box 231
		bodyModel[148] = new ModelRendererTurbo(this, 163, 203, textureX, textureY); // Box 232
		bodyModel[149] = new ModelRendererTurbo(this, 199, 228, textureX, textureY); // Box 355 brakewheel
		bodyModel[150] = new ModelRendererTurbo(this, 210, 231, textureX, textureY); // Box 277
		bodyModel[151] = new ModelRendererTurbo(this, 73, 122, textureX, textureY); // Box 402
		bodyModel[152] = new ModelRendererTurbo(this, 73, 50, textureX, textureY); // Box 258
		bodyModel[153] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 81
		bodyModel[154] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[155] = new ModelRendererTurbo(this, 59, 39, textureX, textureY); // Box 522
		bodyModel[156] = new ModelRendererTurbo(this, 66, 50, textureX, textureY); // Box 244
		bodyModel[157] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 246
		bodyModel[158] = new ModelRendererTurbo(this, 469, 165, textureX, textureY); // Box 247
		bodyModel[159] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 248
		bodyModel[160] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 249
		bodyModel[161] = new ModelRendererTurbo(this, 71, 38, textureX, textureY); // Box 250
		bodyModel[162] = new ModelRendererTurbo(this, 78, 50, textureX, textureY); // Box 251
		bodyModel[163] = new ModelRendererTurbo(this, 509, 165, textureX, textureY); // Box 252
		bodyModel[164] = new ModelRendererTurbo(this, 464, 164, textureX, textureY); // Box 253
		bodyModel[165] = new ModelRendererTurbo(this, 482, 163, textureX, textureY); // Box 247
		bodyModel[166] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 248
		bodyModel[167] = new ModelRendererTurbo(this, 499, 168, textureX, textureY); // Box 249
		bodyModel[168] = new ModelRendererTurbo(this, 481, 168, textureX, textureY); // Box 250
		bodyModel[169] = new ModelRendererTurbo(this, 475, 168, textureX, textureY); // Box 251
		bodyModel[170] = new ModelRendererTurbo(this, 506, 169, textureX, textureY); // Box 252
		bodyModel[171] = new ModelRendererTurbo(this, 506, 171, textureX, textureY); // Box 253
		bodyModel[172] = new ModelRendererTurbo(this, 509, 172, textureX, textureY); // Box 254
		bodyModel[173] = new ModelRendererTurbo(this, 472, 169, textureX, textureY); // Box 255
		bodyModel[174] = new ModelRendererTurbo(this, 472, 171, textureX, textureY); // Box 256
		bodyModel[175] = new ModelRendererTurbo(this, 469, 172, textureX, textureY); // Box 257
		bodyModel[176] = new ModelRendererTurbo(this, 118, 38, textureX, textureY); // Box 277
		bodyModel[177] = new ModelRendererTurbo(this, 459, 164, textureX, textureY); // Box 278
		bodyModel[178] = new ModelRendererTurbo(this, 11, 130, textureX, textureY); // Box 279
		bodyModel[179] = new ModelRendererTurbo(this, 82, 48, textureX, textureY); // Box 280
		bodyModel[180] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 281
		bodyModel[181] = new ModelRendererTurbo(this, 69, 47, textureX, textureY); // Box 282
		bodyModel[182] = new ModelRendererTurbo(this, 317, 207, textureX, textureY); // Box 418
		bodyModel[183] = new ModelRendererTurbo(this, 315, 204, textureX, textureY); // Box 419
		bodyModel[184] = new ModelRendererTurbo(this, 314, 198, textureX, textureY); // Box 420
		bodyModel[185] = new ModelRendererTurbo(this, 315, 201, textureX, textureY); // Box 421
		bodyModel[186] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[187] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[188] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[189] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[190] = new ModelRendererTurbo(this, 254, 201, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[191] = new ModelRendererTurbo(this, 280, 227, textureX, textureY); // Box 428
		bodyModel[192] = new ModelRendererTurbo(this, 87, 123, textureX, textureY); // Box 300
		bodyModel[193] = new ModelRendererTurbo(this, 291, 204, textureX, textureY, BoxName.commander); // Box 334 commander beacon
		bodyModel[194] = new ModelRendererTurbo(this, 291, 208, textureX, textureY); // Box 335
		bodyModel[195] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[196] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[197] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[198] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[199] = new ModelRendererTurbo(this, 270, 227, textureX, textureY); // Box 421 prime base
		bodyModel[200] = new ModelRendererTurbo(this, 337, 206, textureX, textureY); // Box 233
		bodyModel[201] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 234
		bodyModel[202] = new ModelRendererTurbo(this, 337, 202, textureX, textureY); // Box 235
		bodyModel[203] = new ModelRendererTurbo(this, 329, 207, textureX, textureY); // Box 361
		bodyModel[204] = new ModelRendererTurbo(this, 327, 198, textureX, textureY); // Box 362
		bodyModel[205] = new ModelRendererTurbo(this, 328, 204, textureX, textureY); // Box 363
		bodyModel[206] = new ModelRendererTurbo(this, 328, 201, textureX, textureY); // Box 364
		bodyModel[207] = new ModelRendererTurbo(this, 259, 200, textureX, textureY); // Box 184 o2 generator
		bodyModel[208] = new ModelRendererTurbo(this, 270, 217, textureX, textureY); // Box 421 prime base
		bodyModel[209] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[210] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[211] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[212] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[213] = new ModelRendererTurbo(this, 279, 213, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[214] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[215] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[216] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[217] = new ModelRendererTurbo(this, 497, 111, textureX, textureY); // Box 361
		bodyModel[218] = new ModelRendererTurbo(this, 68, 39, textureX, textureY); // Box 326
		bodyModel[219] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 327
		bodyModel[220] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 328
		bodyModel[221] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 329
		bodyModel[222] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[223] = new ModelRendererTurbo(this, 5, 153, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[224] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 440 honse m-2
		bodyModel[225] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 410
		bodyModel[226] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 411
		bodyModel[227] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f glow
		bodyModel[228] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f glow
		bodyModel[229] = new ModelRendererTurbo(this, 59, 116, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[230] = new ModelRendererTurbo(this, 66, 116, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[231] = new ModelRendererTurbo(this, 59, 116, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[232] = new ModelRendererTurbo(this, 66, 116, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[233] = new ModelRendererTurbo(this, 337, 200, textureX, textureY); // Box 341
		bodyModel[234] = new ModelRendererTurbo(this, 296, 199, textureX, textureY); // Box 354
		bodyModel[235] = new ModelRendererTurbo(this, 297, 205, textureX, textureY); // Box 355
		bodyModel[236] = new ModelRendererTurbo(this, 297, 202, textureX, textureY); // Box 356
		bodyModel[237] = new ModelRendererTurbo(this, 305, 211, textureX, textureY); // Box 357
		bodyModel[238] = new ModelRendererTurbo(this, 298, 211, textureX, textureY); // Box 443
		bodyModel[239] = new ModelRendererTurbo(this, 298, 208, textureX, textureY); // Box 444
		bodyModel[240] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 348 chains
		bodyModel[241] = new ModelRendererTurbo(this, 286, 211, textureX, textureY); // Box 373
		bodyModel[242] = new ModelRendererTurbo(this, 286, 208, textureX, textureY); // Box 373
		bodyModel[243] = new ModelRendererTurbo(this, 480, 163, textureX, textureY); // Box 350
		bodyModel[244] = new ModelRendererTurbo(this, 473, 163, textureX, textureY); // Box 351
		bodyModel[245] = new ModelRendererTurbo(this, 479, 170, textureX, textureY); // Box 352
		bodyModel[246] = new ModelRendererTurbo(this, 59, 121, textureX, textureY, "cull"); // Box 353 cull
		bodyModel[247] = new ModelRendererTurbo(this, 66, 121, textureX, textureY, BoxName.ditch); // Box 354 ditchlight glow
		bodyModel[248] = new ModelRendererTurbo(this, 66, 121, textureX, textureY, BoxName.ditch); // Box 355 ditchlight glow
		bodyModel[249] = new ModelRendererTurbo(this, 59, 121, textureX, textureY, "cull"); // Box 356 cull
		bodyModel[250] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 566
		bodyModel[251] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 565
		bodyModel[252] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 564
		bodyModel[253] = new ModelRendererTurbo(this, 278, 197, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[254] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 365 ditchlight glow
		bodyModel[255] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 366
		bodyModel[256] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 367 ditchlight glow
		bodyModel[257] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 368
		bodyModel[258] = new ModelRendererTurbo(this, 82, 123, textureX, textureY); // Box 369
		bodyModel[259] = new ModelRendererTurbo(this, 33, 125, textureX, textureY); // Box 300
		bodyModel[260] = new ModelRendererTurbo(this, 29, 125, textureX, textureY); // Box 301
		bodyModel[261] = new ModelRendererTurbo(this, 62, 146, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[262] = new ModelRendererTurbo(this, 132, 182, textureX, textureY); // Box 412 cs
		bodyModel[263] = new ModelRendererTurbo(this, 132, 202, textureX, textureY); // Box 413 cs
		bodyModel[264] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 86 cs
		bodyModel[265] = new ModelRendererTurbo(this, 132, 195, textureX, textureY); // Box 531 cs
		bodyModel[266] = new ModelRendererTurbo(this, 148, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[267] = new ModelRendererTurbo(this, 108, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[268] = new ModelRendererTurbo(this, 102, 183, textureX, textureY); // Box 307 spedo
		bodyModel[269] = new ModelRendererTurbo(this, 168, 188, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[270] = new ModelRendererTurbo(this, 143, 188, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[271] = new ModelRendererTurbo(this, 491, 160, textureX, textureY); // Box 325
		bodyModel[272] = new ModelRendererTurbo(this, 487, 160, textureX, textureY); // Box 326
		bodyModel[273] = new ModelRendererTurbo(this, 485, 200, textureX, textureY, "cull"); // Box 328 cull crossover sou
		bodyModel[274] = new ModelRendererTurbo(this, 105, 180, textureX, textureY); // Box 530 not a fridge
		bodyModel[275] = new ModelRendererTurbo(this, 193, 238, textureX, textureY); // Box 399
		bodyModel[276] = new ModelRendererTurbo(this, 207, 238, textureX, textureY); // Box 400
		bodyModel[277] = new ModelRendererTurbo(this, 200, 237, textureX, textureY); // Box 401
		bodyModel[278] = new ModelRendererTurbo(this, 200, 234, textureX, textureY); // Box 402
		bodyModel[279] = new ModelRendererTurbo(this, 211, 235, textureX, textureY); // Box 43
		bodyModel[280] = new ModelRendererTurbo(this, 212, 238, textureX, textureY); // Box 43
		bodyModel[281] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 405
		bodyModel[282] = new ModelRendererTurbo(this, 53, 3, textureX, textureY); // Box 193
		bodyModel[283] = new ModelRendererTurbo(this, 30, 3, textureX, textureY); // Box 273
		bodyModel[284] = new ModelRendererTurbo(this, 343, 82, textureX, textureY, ""); // Box 408 lot of little pipes 3b
		bodyModel[285] = new ModelRendererTurbo(this, 357, 84, textureX, textureY, ""); // Box 409 lot of little pipes 3c
		bodyModel[286] = new ModelRendererTurbo(this, 344, 197, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[287] = new ModelRendererTurbo(this, 363, 197, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[288] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 563
		bodyModel[289] = new ModelRendererTurbo(this, 327, 218, textureX, textureY); // Box 564
		bodyModel[290] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 551 ditchlight f mccloud
		bodyModel[291] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 550 ditchlight f mccloud
		bodyModel[292] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 549
		bodyModel[293] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 548
		bodyModel[294] = new ModelRendererTurbo(this, 96, 116, textureX, textureY, BoxName.ditch); // Box 555 ditchlight r mccloud
		bodyModel[295] = new ModelRendererTurbo(this, 96, 116, textureX, textureY, BoxName.ditch); // Box 554 ditchlight r mccloud
		bodyModel[296] = new ModelRendererTurbo(this, 89, 116, textureX, textureY); // Box 553
		bodyModel[297] = new ModelRendererTurbo(this, 89, 116, textureX, textureY); // Box 552
		bodyModel[298] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 4
		bodyModel[299] = new ModelRendererTurbo(this, 33, 70, textureX, textureY); // Box 4
		bodyModel[300] = new ModelRendererTurbo(this, 18, 72, textureX, textureY); // Box 448
		bodyModel[301] = new ModelRendererTurbo(this, 48, 72, textureX, textureY); // Box 449
		bodyModel[302] = new ModelRendererTurbo(this, 175, 177, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[303] = new ModelRendererTurbo(this, 155, 113, textureX, textureY); // Box 7
		bodyModel[304] = new ModelRendererTurbo(this, 130, 113, textureX, textureY); // Box 24
		bodyModel[305] = new ModelRendererTurbo(this, 109, 115, textureX, textureY); // Box 28
		bodyModel[306] = new ModelRendererTurbo(this, 130, 80, textureX, textureY); // Box 30
		bodyModel[307] = new ModelRendererTurbo(this, 169, 94, textureX, textureY); // Box 52 door swing right
		bodyModel[308] = new ModelRendererTurbo(this, 148, 129, textureX, textureY); // Box 314 door swing right
		bodyModel[309] = new ModelRendererTurbo(this, 147, 141, textureX, textureY); // Box 266
		bodyModel[310] = new ModelRendererTurbo(this, 168, 83, textureX, textureY); // Box 268
		bodyModel[311] = new ModelRendererTurbo(this, 159, 129, textureX, textureY); // Box 271
		bodyModel[312] = new ModelRendererTurbo(this, 199, 147, textureX, textureY); // Box 374
		bodyModel[313] = new ModelRendererTurbo(this, 180, 113, textureX, textureY); // Box 375
		bodyModel[314] = new ModelRendererTurbo(this, 154, 83, textureX, textureY); // Box 376
		bodyModel[315] = new ModelRendererTurbo(this, 159, 135, textureX, textureY); // Box 377
		bodyModel[316] = new ModelRendererTurbo(this, 188, 147, textureX, textureY); // Box 378
		bodyModel[317] = new ModelRendererTurbo(this, 180, 116, textureX, textureY); // Box 379
		bodyModel[318] = new ModelRendererTurbo(this, 136, 72, textureX, textureY); // Box 285
		bodyModel[319] = new ModelRendererTurbo(this, 142, 60, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[320] = new ModelRendererTurbo(this, 134, 60, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[321] = new ModelRendererTurbo(this, 136, 65, textureX, textureY); // Box 296
		bodyModel[322] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[323] = new ModelRendererTurbo(this, 180, 121, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[324] = new ModelRendererTurbo(this, 143, 68, textureX, textureY); // Box 371
		bodyModel[325] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 372
		bodyModel[326] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 373
		bodyModel[327] = new ModelRendererTurbo(this, 119, 65, textureX, textureY, "lamp"); // Box 301 markerlight glow
		bodyModel[328] = new ModelRendererTurbo(this, 119, 65, textureX, textureY, "lamp"); // Box 344 markerlight glow
		bodyModel[329] = new ModelRendererTurbo(this, 151, 77, textureX, textureY); // Box 368
		bodyModel[330] = new ModelRendererTurbo(this, 109, 65, textureX, textureY); // Box 419
		bodyModel[331] = new ModelRendererTurbo(this, 106, 68, textureX, textureY); // Box 420
		bodyModel[332] = new ModelRendererTurbo(this, 113, 68, textureX, textureY); // Box 421
		bodyModel[333] = new ModelRendererTurbo(this, 114, 65, textureX, textureY); // Box 422
		bodyModel[334] = new ModelRendererTurbo(this, 127, 68, textureX, textureY); // Box 425
		bodyModel[335] = new ModelRendererTurbo(this, 288, 228, textureX, textureY); // Box 88
		bodyModel[336] = new ModelRendererTurbo(this, 398, 220, textureX, textureY); // Box 119
		bodyModel[337] = new ModelRendererTurbo(this, 235, 244, textureX, textureY); // Box 127
		bodyModel[338] = new ModelRendererTurbo(this, 398, 214, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 235, 250, textureX, textureY); // Box 130
		bodyModel[340] = new ModelRendererTurbo(this, 237, 236, textureX, textureY); // Box 135
		bodyModel[341] = new ModelRendererTurbo(this, 237, 240, textureX, textureY); // Box 136
		bodyModel[342] = new ModelRendererTurbo(this, 344, 228, textureX, textureY); // Box 233
		bodyModel[343] = new ModelRendererTurbo(this, 288, 242, textureX, textureY); // Box 312
		bodyModel[344] = new ModelRendererTurbo(this, 475, 7, textureX, textureY); // Box 398
		bodyModel[345] = new ModelRendererTurbo(this, 475, 4, textureX, textureY); // Box 399
		bodyModel[346] = new ModelRendererTurbo(this, 413, 81, textureX, textureY); // Box 124
		bodyModel[347] = new ModelRendererTurbo(this, 443, 81, textureX, textureY); // Box 130
		bodyModel[348] = new ModelRendererTurbo(this, 432, 94, textureX, textureY); // Box 131
		bodyModel[349] = new ModelRendererTurbo(this, 468, 7, textureX, textureY); // Box 31
		bodyModel[350] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[351] = new ModelRendererTurbo(this, 468, 2, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[352] = new ModelRendererTurbo(this, 432, 80, textureX, textureY); // Box 132
		bodyModel[353] = new ModelRendererTurbo(this, 461, 72, textureX, textureY); // Box 173
		bodyModel[354] = new ModelRendererTurbo(this, 432, 88, textureX, textureY); // Box 422 rear sanscap cover
		bodyModel[355] = new ModelRendererTurbo(this, 444, 72, textureX, textureY); // Box 133
		bodyModel[356] = new ModelRendererTurbo(this, 432, 72, textureX, textureY); // Box 294
		bodyModel[357] = new ModelRendererTurbo(this, 227, 229, textureX, textureY); // Box 415 D9 intake
		bodyModel[358] = new ModelRendererTurbo(this, 13, 214, textureX, textureY); // Box 261
		bodyModel[359] = new ModelRendererTurbo(this, 227, 229, textureX, textureY); // Box 415
		bodyModel[360] = new ModelRendererTurbo(this, 286, 205, textureX, textureY); // Box 388
		bodyModel[361] = new ModelRendererTurbo(this, 286, 202, textureX, textureY); // Box 389
		bodyModel[362] = new ModelRendererTurbo(this, 414, 198, textureX, textureY); // Box 19
		bodyModel[363] = new ModelRendererTurbo(this, 439, 197, textureX, textureY); // Box 495
		bodyModel[364] = new ModelRendererTurbo(this, 439, 200, textureX, textureY); // Box 496
		bodyModel[365] = new ModelRendererTurbo(this, 439, 197, textureX, textureY); // Box 497
		bodyModel[366] = new ModelRendererTurbo(this, 414, 198, textureX, textureY); // Box 498
		bodyModel[367] = new ModelRendererTurbo(this, 439, 200, textureX, textureY); // Box 499
		bodyModel[368] = new ModelRendererTurbo(this, 425, 174, textureX, textureY); // Box 391
		bodyModel[369] = new ModelRendererTurbo(this, 425, 174, textureX, textureY); // Box 392
		bodyModel[370] = new ModelRendererTurbo(this, 425, 174, textureX, textureY); // Box 393
		bodyModel[371] = new ModelRendererTurbo(this, 425, 174, textureX, textureY); // Box 378
		bodyModel[372] = new ModelRendererTurbo(this, 251, 99, textureX, textureY); // Box 380
		bodyModel[373] = new ModelRendererTurbo(this, 221, 93, textureX, textureY); // Box 381
		bodyModel[374] = new ModelRendererTurbo(this, 206, 81, textureX, textureY); // Box 382
		bodyModel[375] = new ModelRendererTurbo(this, 130, 163, textureX, textureY); // late phase flat noseNoName
		bodyModel[376] = new ModelRendererTurbo(this, 93, 154, textureX, textureY); // late phase flat noseNoName
		bodyModel[377] = new ModelRendererTurbo(this, 111, 156, textureX, textureY); // late phase flat noseNoName
		bodyModel[378] = new ModelRendererTurbo(this, 95, 163, textureX, textureY); // late phase flat noseNoName
		bodyModel[379] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // late phase flat noseNoName
		bodyModel[380] = new ModelRendererTurbo(this, 129, 155, textureX, textureY); // late phase flat noseNoName
		bodyModel[381] = new ModelRendererTurbo(this, 72, 7, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[382] = new ModelRendererTurbo(this, 389, 104, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[383] = new ModelRendererTurbo(this, 389, 112, textureX, textureY, "cull"); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[384] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[385] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[386] = new ModelRendererTurbo(this, 389, 104, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[387] = new ModelRendererTurbo(this, 396, 106, textureX, textureY, "cull"); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[388] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[389] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[390] = new ModelRendererTurbo(this, 226, 114, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[391] = new ModelRendererTurbo(this, 244, 140, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[392] = new ModelRendererTurbo(this, 414, 109, textureX, textureY, "cull"); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[393] = new ModelRendererTurbo(this, 205, 118, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[394] = new ModelRendererTurbo(this, 396, 95, textureX, textureY, "cull"); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[395] = new ModelRendererTurbo(this, 415, 112, textureX, textureY, "cull"); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[396] = new ModelRendererTurbo(this, 228, 137, textureX, textureY); // Box 305 early dash8C fueltank arrangement
		bodyModel[397] = new ModelRendererTurbo(this, 62, 214, textureX, textureY); // Box 416
		bodyModel[398] = new ModelRendererTurbo(this, 414, 213, textureX, textureY); // Box 547
		bodyModel[399] = new ModelRendererTurbo(this, 414, 234, textureX, textureY); // Box 345
		bodyModel[400] = new ModelRendererTurbo(this, 168, 199, textureX, textureY); // Box 123
		bodyModel[401] = new ModelRendererTurbo(this, 149, 199, textureX, textureY); // Box 311
		bodyModel[402] = new ModelRendererTurbo(this, 327, 210, textureX, textureY); // Box 350
		bodyModel[403] = new ModelRendererTurbo(this, 324, 210, textureX, textureY); // Box 408
		bodyModel[404] = new ModelRendererTurbo(this, 344, 228, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[405] = new ModelRendererTurbo(this, 289, 222, textureX, textureY); // Box 5
		bodyModel[406] = new ModelRendererTurbo(this, 424, 173, textureX, textureY); // Box 61
		bodyModel[407] = new ModelRendererTurbo(this, 424, 173, textureX, textureY); // Box 62
		bodyModel[408] = new ModelRendererTurbo(this, 424, 173, textureX, textureY); // Box 412
		bodyModel[409] = new ModelRendererTurbo(this, 424, 173, textureX, textureY); // Box 413
		bodyModel[410] = new ModelRendererTurbo(this, 180, 101, textureX, textureY); // Box 254 D9 WALKWAY
		bodyModel[411] = new ModelRendererTurbo(this, 93, 48, textureX, textureY); // Box 367
		bodyModel[412] = new ModelRendererTurbo(this, 45, 50, textureX, textureY); // Box 425
		bodyModel[413] = new ModelRendererTurbo(this, 461, 7, textureX, textureY); // Box 426 early rear light
		bodyModel[414] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 426 early rear light glow
		bodyModel[415] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 426 early rear light glow
		bodyModel[416] = new ModelRendererTurbo(this, 454, 7, textureX, textureY); // Box 421
		bodyModel[417] = new ModelRendererTurbo(this, 454, 2, textureX, textureY, "lamp"); // Box 422 headlight low early glow
		bodyModel[418] = new ModelRendererTurbo(this, 454, 2, textureX, textureY, "lamp"); // Box 423 headlight low early glow
		bodyModel[419] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 393 numberboard
		bodyModel[420] = new ModelRendererTurbo(this, 465, 27, textureX, textureY, "lamp"); // Box 395 numberboard
		bodyModel[421] = new ModelRendererTurbo(this, 487, 119, textureX, textureY); // Box 318
		bodyModel[422] = new ModelRendererTurbo(this, 478, 19, textureX, textureY, "cull"); // Box 427 early ladder cull
		bodyModel[423] = new ModelRendererTurbo(this, 489, 19, textureX, textureY, "cull"); // Box 428 early cull ladder
		bodyModel[424] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[425] = new ModelRendererTurbo(this, 149, 13, textureX, textureY); // Box 157
		bodyModel[426] = new ModelRendererTurbo(this, 149, 21, textureX, textureY); // Box 158
		bodyModel[427] = new ModelRendererTurbo(this, 90, 131, textureX, textureY); // Box 432
		bodyModel[428] = new ModelRendererTurbo(this, 68, 131, textureX, textureY); // Box 433
		bodyModel[429] = new ModelRendererTurbo(this, 81, 133, textureX, textureY); // Box 434
		bodyModel[430] = new ModelRendererTurbo(this, 95, 134, textureX, textureY); // Box 435
		bodyModel[431] = new ModelRendererTurbo(this, 73, 134, textureX, textureY); // Box 436
		bodyModel[432] = new ModelRendererTurbo(this, 325, 222, textureX, textureY); // Box 409 commander base
		bodyModel[433] = new ModelRendererTurbo(this, 320, 224, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[434] = new ModelRendererTurbo(this, 325, 225, textureX, textureY); // Box 409 commander base
		bodyModel[435] = new ModelRendererTurbo(this, 315, 224, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[436] = new ModelRendererTurbo(this, 484, 131, textureX, textureY); // Box 441
		bodyModel[437] = new ModelRendererTurbo(this, 484, 131, textureX, textureY); // Box 442
		bodyModel[438] = new ModelRendererTurbo(this, 484, 131, textureX, textureY); // Box 443
		bodyModel[439] = new ModelRendererTurbo(this, 494, 137, textureX, textureY); // Box 444
		bodyModel[440] = new ModelRendererTurbo(this, 485, 139, textureX, textureY); // Box 445
		bodyModel[441] = new ModelRendererTurbo(this, 472, 137, textureX, textureY); // Box 446
		bodyModel[442] = new ModelRendererTurbo(this, 477, 140, textureX, textureY); // Box 447
		bodyModel[443] = new ModelRendererTurbo(this, 499, 140, textureX, textureY); // Box 448
		bodyModel[444] = new ModelRendererTurbo(this, 315, 218, textureX, textureY); // Box 81
		bodyModel[445] = new ModelRendererTurbo(this, 315, 221, textureX, textureY); // Box 82
		bodyModel[446] = new ModelRendererTurbo(this, 306, 221, textureX, textureY); // Box 83
		bodyModel[447] = new ModelRendererTurbo(this, 306, 218, textureX, textureY); // Box 84
		bodyModel[448] = new ModelRendererTurbo(this, 306, 224, textureX, textureY); // Box 85
		bodyModel[449] = new ModelRendererTurbo(this, 159, 63, textureX, textureY); // Box 361
		bodyModel[450] = new ModelRendererTurbo(this, 57, 147, textureX, textureY); // Box 435
		bodyModel[451] = new ModelRendererTurbo(this, 79, 147, textureX, textureY); // Box 436
		bodyModel[452] = new ModelRendererTurbo(this, 198, 179, textureX, textureY, "cull"); // Box 457 cull ptc 4head
		bodyModel[453] = new ModelRendererTurbo(this, 330, 211, textureX, textureY); // Box 458
		bodyModel[454] = new ModelRendererTurbo(this, 330, 213, textureX, textureY); // Box 459
		bodyModel[455] = new ModelRendererTurbo(this, 168, 66, textureX, textureY); // Box 460
		bodyModel[456] = new ModelRendererTurbo(this, 44, 181, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[457] = new ModelRendererTurbo(this, 44, 181, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[458] = new ModelRendererTurbo(this, 44, 181, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[459] = new ModelRendererTurbo(this, 2, 179, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[460] = new ModelRendererTurbo(this, 2, 179, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[461] = new ModelRendererTurbo(this, 2, 179, textureX, textureY); // Box aftermarket winterization hatches
		bodyModel[462] = new ModelRendererTurbo(this, 2, 202, textureX, textureY); // Box 467
		bodyModel[463] = new ModelRendererTurbo(this, 176, 202, textureX, textureY, "cull"); // Box 468 cull widdle guy
		bodyModel[464] = new ModelRendererTurbo(this, 504, 112, textureX, textureY, "cull"); // Box 190 cull
		bodyModel[465] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 339 glow markerlight crl
		bodyModel[466] = new ModelRendererTurbo(this, 497, 122, textureX, textureY, "lamp"); // Box 345 glow markerlight crl
		bodyModel[467] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 348 glow markerlight sou
		bodyModel[468] = new ModelRendererTurbo(this, 504, 122, textureX, textureY, "lamp"); // Box 349 sou markerlight glow
		bodyModel[469] = new ModelRendererTurbo(this, 456, 134, textureX, textureY); // Box 384
		bodyModel[470] = new ModelRendererTurbo(this, 503, 129, textureX, textureY); // Box 219
		bodyModel[471] = new ModelRendererTurbo(this, 504, 107, textureX, textureY, "cull"); // Box 477 cull
		bodyModel[472] = new ModelRendererTurbo(this, 60, 44, textureX, textureY); // Box 477
		bodyModel[473] = new ModelRendererTurbo(this, 97, 64, textureX, textureY); // Box 317
		bodyModel[474] = new ModelRendererTurbo(this, 97, 62, textureX, textureY); // Box 318
		bodyModel[475] = new ModelRendererTurbo(this, 97, 70, textureX, textureY); // Box 319
		bodyModel[476] = new ModelRendererTurbo(this, 97, 72, textureX, textureY); // Box 220
		bodyModel[477] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 482
		bodyModel[478] = new ModelRendererTurbo(this, 345, 206, textureX, textureY); // Box 483
		bodyModel[479] = new ModelRendererTurbo(this, 261, 84, textureX, textureY); // Box 114
		bodyModel[480] = new ModelRendererTurbo(this, 261, 81, textureX, textureY); // Box 74
		bodyModel[481] = new ModelRendererTurbo(this, 261, 87, textureX, textureY); // Box 78
		bodyModel[482] = new ModelRendererTurbo(this, 254, 81, textureX, textureY); // Box 430
		bodyModel[483] = new ModelRendererTurbo(this, 222, 86, textureX, textureY, "cull"); // Box 484 cull
		bodyModel[484] = new ModelRendererTurbo(this, 231, 86, textureX, textureY); // Box 485
		bodyModel[485] = new ModelRendererTurbo(this, 255, 198, textureX, textureY); // Box 114
		bodyModel[486] = new ModelRendererTurbo(this, 255, 198, textureX, textureY); // Box 74
		bodyModel[487] = new ModelRendererTurbo(this, 255, 198, textureX, textureY); // Box 78
		bodyModel[488] = new ModelRendererTurbo(this, 260, 197, textureX, textureY, "cull"); // Box 1007 cull

		bodyModel[0].addBox(0F, 0F, 0F, 92, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-46F, -2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-50.01F, -2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[2].setRotationPoint(-54F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[3].setRotationPoint(-47F, -2F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[4].setRotationPoint(-50F, -2F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[5].setRotationPoint(-50F, 0F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[6].setRotationPoint(-50F, -2F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[7].setRotationPoint(-50F, 0F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[8].setRotationPoint(-50F, 8F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[9].setRotationPoint(50F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 256
		bodyModel[10].setRotationPoint(50.01F, -2F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-51F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[12].setRotationPoint(50F, 2.5F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 411
		bodyModel[13].setRotationPoint(-50F, 7F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[14].setRotationPoint(-54F, 7F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[15].setRotationPoint(-54F, 7F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-53F, 6F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[17].setRotationPoint(-53F, 6F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[18].setRotationPoint(-53F, 5F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[19].setRotationPoint(-53F, 5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[20].setRotationPoint(52F, 6F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[21].setRotationPoint(52F, 6F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[22].setRotationPoint(53F, 7F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[23].setRotationPoint(53F, 7F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[24].setRotationPoint(52F, 5F, 2F);

		bodyModel[25].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[25].setRotationPoint(52F, 5F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[26].setRotationPoint(-50F, 3F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[27].setRotationPoint(-50F, 3F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[28].setRotationPoint(-50F, 2F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[29].setRotationPoint(-50F, 2F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 392
		bodyModel[30].setRotationPoint(-50F, 5.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 393
		bodyModel[31].setRotationPoint(-50F, 4.5F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[32].setRotationPoint(-50F, 4.5F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 395
		bodyModel[33].setRotationPoint(-50F, 5.5F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[34].setRotationPoint(-50F, 8F, -9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440 front mounting stuff
		bodyModel[35].setRotationPoint(-33F, 1.5F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 631 front mounting stuff
		bodyModel[36].setRotationPoint(-33F, 0F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882 front mounting stuff
		bodyModel[37].setRotationPoint(-32F, 1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883 front mounting stuff
		bodyModel[38].setRotationPoint(-32F, 1F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 182 ph2 mounting stuff
		bodyModel[39].setRotationPoint(29F, 1.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183 ph2 mounting stuff
		bodyModel[40].setRotationPoint(30F, 1F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 184 ph2 mounting stuff
		bodyModel[41].setRotationPoint(29F, 0F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185 ph2 mounting stuff
		bodyModel[42].setRotationPoint(30F, 1F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 32, 4, 16, 0F); // Box 2
		bodyModel[43].setRotationPoint(-15.5F, 5F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 32, 3, 19, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[44].setRotationPoint(-15.5F, 1.5F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 32, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[45].setRotationPoint(-15.5F, 5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 32, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[46].setRotationPoint(-15.5F, 5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 100, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-50F, 1.75F, -7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 100, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[48].setRotationPoint(-50F, 0F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 100, 2, 14, 0F); // Box 424
		bodyModel[49].setRotationPoint(-50F, -2F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 92, 2, 4, 0F); // Box 426
		bodyModel[50].setRotationPoint(-46F, -2F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 156
		bodyModel[51].setRotationPoint(-46F, 0.5F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 92, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630 cull thing
		bodyModel[52].setRotationPoint(-46F, 0F, -11F);

		bodyModel[53].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 382
		bodyModel[53].setRotationPoint(-12F, 1.25F, -11.25F);
		bodyModel[53].rotateAngleX = -0.29670597F;

		bodyModel[54].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 450
		bodyModel[54].setRotationPoint(-12F, 1.25F, 11.25F);
		bodyModel[54].rotateAngleX = 0.29670597F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[55].setRotationPoint(-17.75F, 0F, 8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 457
		bodyModel[56].setRotationPoint(-46F, 6F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[57].setRotationPoint(-46F, 1F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		bodyModel[58].setRotationPoint(-46F, 1F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[59].setRotationPoint(-50.01F, 7F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 162 cull
		bodyModel[60].setRotationPoint(-52F, -2F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 163 cull
		bodyModel[61].setRotationPoint(-52F, -2F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164 cull
		bodyModel[62].setRotationPoint(-52F, -2F, 1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 467
		bodyModel[63].setRotationPoint(-52F, -1F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[64].setRotationPoint(-50F, -9F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[65].setRotationPoint(-50.5F, -10F, -4F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 144
		bodyModel[66].setRotationPoint(-50F, -10F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-50F, -10F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[68].setRotationPoint(-50F, -3F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[69].setRotationPoint(-50F, -10F, -8F);
		bodyModel[69].rotateAngleY = -3.14159265F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[70].setRotationPoint(-50F, -10F, 9F);
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[71].setRotationPoint(-50F, -9F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 148
		bodyModel[72].setRotationPoint(-50F, -10F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[73].setRotationPoint(-50F, -10F, 4F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[74].setRotationPoint(-50F, -3F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 481
		bodyModel[75].setRotationPoint(-47F, -2F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482
		bodyModel[76].setRotationPoint(-46F, 6F, 11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[77].setRotationPoint(-46F, 1F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[78].setRotationPoint(-46F, 0F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[79].setRotationPoint(-46F, 0F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		bodyModel[80].setRotationPoint(-50.01F, 7F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 496
		bodyModel[81].setRotationPoint(-50F, 8F, 8F);

		bodyModel[82].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 124
		bodyModel[82].setRotationPoint(9F, 1.25F, -11.25F);
		bodyModel[82].rotateAngleX = -0.29670597F;

		bodyModel[83].addBox(0F, 0F, 0F, 71, 19, 14, 0F); // Box 6
		bodyModel[83].setRotationPoint(-26F, -21F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 28, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[84].setRotationPoint(-4F, -22F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 28, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[85].setRotationPoint(-4F, -22F, 2F);

		bodyModel[86].addBox(0F, 0F, 0F, 28, 1, 4, 0F); // Box 294
		bodyModel[86].setRotationPoint(-4F, -22F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[87].setRotationPoint(50.02F, 8F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[88].setRotationPoint(50.01F, 7F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[89].setRotationPoint(50.01F, 7F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[90].setRotationPoint(45F, 0F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 137
		bodyModel[91].setRotationPoint(45F, 1F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 138
		bodyModel[92].setRotationPoint(45F, 6F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[93].setRotationPoint(46F, 0F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 140
		bodyModel[94].setRotationPoint(46F, -2F, 7F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 141
		bodyModel[95].setRotationPoint(-50F, 7F, 8F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 142
		bodyModel[96].setRotationPoint(47F, 4.5F, 8F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 143
		bodyModel[97].setRotationPoint(47F, 5.5F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 144
		bodyModel[98].setRotationPoint(47F, 3F, 8F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 145
		bodyModel[99].setRotationPoint(47F, 2F, 8F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 146
		bodyModel[100].setRotationPoint(47F, 7F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[101].setRotationPoint(47F, 8F, 8F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 148
		bodyModel[102].setRotationPoint(47F, 0F, 7F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 149
		bodyModel[103].setRotationPoint(47F, -2F, 7F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 150
		bodyModel[104].setRotationPoint(47F, -2F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 151
		bodyModel[105].setRotationPoint(47F, 0F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 152
		bodyModel[106].setRotationPoint(47F, 3F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 153
		bodyModel[107].setRotationPoint(47F, 2F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 154
		bodyModel[108].setRotationPoint(47F, 4.5F, -8F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 155
		bodyModel[109].setRotationPoint(47F, 5.5F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[110].setRotationPoint(47F, 8F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 157
		bodyModel[111].setRotationPoint(47F, 7F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[112].setRotationPoint(45F, 0F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 159
		bodyModel[113].setRotationPoint(45F, 1F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 160
		bodyModel[114].setRotationPoint(45F, 6F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 161
		bodyModel[115].setRotationPoint(46F, 0F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[116].setRotationPoint(46F, -2F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 23, 2, 14, 0F); // Box 96
		bodyModel[117].setRotationPoint(-26F, -23F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[118].setRotationPoint(-44F, -14F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[119].setRotationPoint(-47.5F, -14F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 282
		bodyModel[120].setRotationPoint(-48.5F, -14F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[121].setRotationPoint(-48.5F, -14F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 297
		bodyModel[122].setRotationPoint(-48.5F, -15.25F, -6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
		bodyModel[123].setRotationPoint(-44F, -15.25F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 299
		bodyModel[124].setRotationPoint(-44F, -15.25F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, -0.5F, -1F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 300
		bodyModel[125].setRotationPoint(-47.5F, -15.25F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // Box 301
		bodyModel[126].setRotationPoint(-47.5F, -15.25F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 302
		bodyModel[127].setRotationPoint(-48.5F, -15.25F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[128].setRotationPoint(-39F, -6F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[129].setRotationPoint(-42F, -6F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[130].setRotationPoint(-43F, -6F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 210
		bodyModel[131].setRotationPoint(-43F, -4F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[132].setRotationPoint(-42F, -6F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[133].setRotationPoint(-49.1F, -14.5F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[134].setRotationPoint(-49.1F, -14.5F, -2F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[135].setRotationPoint(-48.4F, -14.5F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[136].setRotationPoint(-47F, -14.8F, -5.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[137].setRotationPoint(-47F, -14.8F, 1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[138].setRotationPoint(-47F, -14.8F, 5.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[139].setRotationPoint(-47F, -14.8F, -5.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[140].setRotationPoint(-48F, -11.5F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 222
		bodyModel[141].setRotationPoint(-48F, -11.5F, -5.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[142].setRotationPoint(-48F, -11.5F, 5.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[143].setRotationPoint(-48F, -11.5F, 1.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[144].setRotationPoint(16F, -23.5F, -3F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[145].setRotationPoint(15.5F, -22.5F, -3.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[146].setRotationPoint(16F, -24.5F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[147].setRotationPoint(-26F, -6F, 7F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 232
		bodyModel[148].setRotationPoint(-10F, -4F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[149].setRotationPoint(-45.5F, -13.5F, 7.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[150].setRotationPoint(-43.5F, -11.5F, 6.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[151].setRotationPoint(-47.5F, -15F, -1F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 258
		bodyModel[152].setRotationPoint(-46F, -10F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[153].setRotationPoint(-47.01F, -7F, -11.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[154].setRotationPoint(-47.01F, -10F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[155].setRotationPoint(-44F, -10F, -11.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[156].setRotationPoint(-42F, -14F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 246
		bodyModel[157].setRotationPoint(-46F, -10F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[158].setRotationPoint(-47.01F, -7F, 10.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 248
		bodyModel[159].setRotationPoint(-47.01F, -10F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[160].setRotationPoint(-44F, -10F, 11.01F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[161].setRotationPoint(-42F, -14F, 11F);

		bodyModel[162].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 251
		bodyModel[162].setRotationPoint(-13F, -10F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 252
		bodyModel[163].setRotationPoint(47.01F, -7F, -11.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 253
		bodyModel[164].setRotationPoint(47.01F, -10F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 247
		bodyModel[165].setRotationPoint(50.5F, -10F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 248
		bodyModel[166].setRotationPoint(50F, -10F, -5F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 249
		bodyModel[167].setRotationPoint(50F, -10F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[168].setRotationPoint(50F, -10F, 4F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 251
		bodyModel[169].setRotationPoint(50F, -10F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[170].setRotationPoint(50F, -9F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 253
		bodyModel[171].setRotationPoint(50F, -10F, 9F);
		bodyModel[171].rotateAngleY = -3.14159265F;

		bodyModel[172].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 254
		bodyModel[172].setRotationPoint(50F, -3F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[173].setRotationPoint(50F, -9F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 256
		bodyModel[174].setRotationPoint(50F, -10F, -8F);
		bodyModel[174].rotateAngleY = -3.14159265F;

		bodyModel[175].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 257
		bodyModel[175].setRotationPoint(50F, -3F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 52, 8, 0, 0F); // Box 277
		bodyModel[176].setRotationPoint(-6F, -10F, 11F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 278
		bodyModel[177].setRotationPoint(47.01F, -10F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[178].setRotationPoint(47.01F, -7F, 10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 280
		bodyModel[179].setRotationPoint(-11F, -10F, 11.01F);

		bodyModel[180].addBox(0F, 0F, 0F, 17, 8, 0, 0F); // Box 281
		bodyModel[180].setRotationPoint(-26F, -14F, 11F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 282
		bodyModel[181].setRotationPoint(-10F, -6F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[182].setRotationPoint(6.5F, -22F, -6.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[183].setRotationPoint(5F, -22.75F, -5.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[184].setRotationPoint(4F, -23F, -6.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[185].setRotationPoint(6F, -22.75F, -7.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[186].setRotationPoint(-37F, -24.5F, 7.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[187].setRotationPoint(-37F, -24.5F, 7.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[188].setRotationPoint(-37F, -24.5F, 7.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[189].setRotationPoint(-37F, -24.5F, 7.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[190].setRotationPoint(-37.5F, -23F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[191].setRotationPoint(-37F, -24F, 7.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[192].setRotationPoint(-46.5F, -14.75F, 4F);

		bodyModel[193].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[193].setRotationPoint(-40.1F, -23.5F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[194].setRotationPoint(-40.1F, -23.5F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[195].setRotationPoint(-39F, -24.5F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[196].setRotationPoint(-39F, -24.5F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[197].setRotationPoint(-39F, -24.5F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[198].setRotationPoint(-39F, -24.5F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[199].setRotationPoint(-39F, -24F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[200].setRotationPoint(-33F, -24F, 6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[201].setRotationPoint(-33F, -24F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[202].setRotationPoint(-30F, -24F, 0F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[203].setRotationPoint(16F, -22F, -6.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[204].setRotationPoint(14F, -23F, -5.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[205].setRotationPoint(15F, -23F, -7.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[206].setRotationPoint(16F, -23F, -6.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[207].setRotationPoint(-36.5F, -24.5F, -4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[208].setRotationPoint(-38.5F, -25F, -5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[209].setRotationPoint(-38.5F, -25.5F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[210].setRotationPoint(-38.5F, -25.5F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[211].setRotationPoint(-38.5F, -25.5F, -5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[212].setRotationPoint(-38.5F, -25.5F, -5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 355 support cull
		bodyModel[213].setRotationPoint(-38.5F, -24F, -5F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[214].setRotationPoint(45F, -24.25F, 1.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[215].setRotationPoint(46F, -24.25F, 2.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[216].setRotationPoint(46F, -24.25F, 0.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[217].setRotationPoint(46F, -23.25F, 1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[218].setRotationPoint(-47F, -10F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[219].setRotationPoint(-47F, -10F, 11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[220].setRotationPoint(46F, -10F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[221].setRotationPoint(46F, -10F, 11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[222].setRotationPoint(-51F, -1F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[223].setRotationPoint(-51F, -1F, 4F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 440 honse m-2
		bodyModel[224].setRotationPoint(-50.25F, 0F, -5.5F);
		bodyModel[224].rotateAngleZ = -0.31415927F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[225].setRotationPoint(-50.5F, -5F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[226].setRotationPoint(-50.5F, -5F, 4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[227].setRotationPoint(-50.75F, -5F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f glow
		bodyModel[228].setRotationPoint(-50.75F, -5F, 4F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[229].setRotationPoint(-51F, 1F, -7.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[230].setRotationPoint(-51.25F, 1F, -7.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[231].setRotationPoint(-51F, 1F, 5.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[232].setRotationPoint(-51.25F, 1F, 5.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[233].setRotationPoint(-33F, -24F, 0F);

		bodyModel[234].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[234].setRotationPoint(9F, -23.5F, -0.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[235].setRotationPoint(10F, -23.25F, 0.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[236].setRotationPoint(9.5F, -23.25F, -1.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[237].setRotationPoint(11.5F, -22.5F, -0.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 443
		bodyModel[238].setRotationPoint(10.5F, -24.25F, 0.25F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 444
		bodyModel[239].setRotationPoint(10.5F, -24.25F, -1.25F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 7, 7, 0F); // Box 348 chains
		bodyModel[240].setRotationPoint(-51F, -9F, -3.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[241].setRotationPoint(-28F, -24.5F, 5F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[242].setRotationPoint(-28F, -24.5F, -5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 350
		bodyModel[243].setRotationPoint(49.5F, -1F, 4F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351
		bodyModel[244].setRotationPoint(49.5F, -1F, -6F);

		bodyModel[245].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[245].setRotationPoint(50.25F, 0F, -5.5F);
		bodyModel[245].rotateAngleZ = 0.31415927F;

		bodyModel[246].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 353 cull
		bodyModel[246].setRotationPoint(50F, 1F, 5.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight glow
		bodyModel[247].setRotationPoint(50.25F, 1F, 5.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight glow
		bodyModel[248].setRotationPoint(50.25F, 1F, -7.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 356 cull
		bodyModel[249].setRotationPoint(50F, 1F, -7.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[250].setRotationPoint(-42F, -21F, -0.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[251].setRotationPoint(-42.25F, -21.5F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[252].setRotationPoint(-42.25F, -22.5F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[253].setRotationPoint(-42.25F, -22.5F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 365 ditchlight glow
		bodyModel[254].setRotationPoint(49.25F, -5F, 4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[255].setRotationPoint(49F, -5F, 4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ditchlight glow
		bodyModel[256].setRotationPoint(49.25F, -5F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		bodyModel[257].setRotationPoint(49F, -5F, -6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[258].setRotationPoint(-46.5F, -14.75F, -5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 300
		bodyModel[259].setRotationPoint(-51F, -10F, -2F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 301
		bodyModel[260].setRotationPoint(-51F, -10F, 2F);

		bodyModel[261].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[261].setRotationPoint(-50F, -1F, -2F);
		bodyModel[261].rotateAngleZ = -1.48352986F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[262].setRotationPoint(-31.8F, -16F, 1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[263].setRotationPoint(-38.5F, -14F, 3F);
		bodyModel[263].rotateAngleY = -0.45378561F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[264].setRotationPoint(-38.5F, -16F, 3F);
		bodyModel[264].rotateAngleY = -0.45378561F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[265].setRotationPoint(-38.5F, -10F, 3F);
		bodyModel[265].rotateAngleY = -0.45378561F;

		bodyModel[266].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[266].setRotationPoint(-38F, -19F, 7.5F);
		//bodyModel[266].rotateAngleY = 0.17453293F;

		bodyModel[267].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[267].setRotationPoint(-35F, -18.25F, 3F);
		bodyModel[267].rotateAngleY = 0.78539816F;

		bodyModel[268].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[268].setRotationPoint(-35F, -18.25F, 3F);
		bodyModel[268].rotateAngleY = 0.78539816F;

		bodyModel[269].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[269].setRotationPoint(-38F, -14F, -3.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[270].setRotationPoint(-38F, -21F, -0.5F);
		bodyModel[270].rotateAngleY = 0.43633231F;

		bodyModel[271].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 325
		bodyModel[271].setRotationPoint(50F, -10F, -2F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 326
		bodyModel[272].setRotationPoint(50F, -10F, 2F);

		bodyModel[273].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover sou
		bodyModel[273].setRotationPoint(51F, -1F, 2F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 530 not a fridge
		bodyModel[274].setRotationPoint(-28F, -22F, -6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[275].setRotationPoint(-44F, -14F, 6F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[276].setRotationPoint(-40F, -14F, 6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[277].setRotationPoint(-42F, -6F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[278].setRotationPoint(-42F, -14F, 6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[279].setRotationPoint(-41.5F, -12.5F, 6F);

		bodyModel[280].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[280].setRotationPoint(-41F, -10.5F, 6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[281].setRotationPoint(-42F, -13F, 6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Box 193
		bodyModel[282].setRotationPoint(-50F, 1F, -3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 2F, 0F); // Box 273
		bodyModel[283].setRotationPoint(45F, 1F, -3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[284].setRotationPoint(23F, 0F, -10.5F);
		bodyModel[284].rotateAngleY = 1.57079633F;
		bodyModel[284].rotateAngleZ = -0.31415927F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[285].setRotationPoint(41F, 0F, -10.5F);
		bodyModel[285].rotateAngleY = 1.57079633F;
		bodyModel[285].rotateAngleZ = -0.31415927F;

		bodyModel[286].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[286].setRotationPoint(-33F, -23.5F, -9.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[287].setRotationPoint(-33F, -23.5F, 6.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[288].setRotationPoint(-32.5F, -24.5F, -8F);

		bodyModel[289].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[289].setRotationPoint(-32.5F, -24.5F, 8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight f mccloud
		bodyModel[290].setRotationPoint(-52.1F, -2.75F, 3.75F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight f mccloud
		bodyModel[291].setRotationPoint(-52.1F, -2.75F, -5.75F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[292].setRotationPoint(-51.8F, -2.75F, 3.75F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[293].setRotationPoint(-51.8F, -2.75F, -5.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 555 ditchlight r mccloud
		bodyModel[294].setRotationPoint(50F, -3F, -5.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight r mccloud
		bodyModel[295].setRotationPoint(50F, -3F, 3.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[296].setRotationPoint(50F, -3F, 3.75F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[297].setRotationPoint(50F, -3F, -5.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[298].setRotationPoint(-53F, 4F, 2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[299].setRotationPoint(-53.5F, 4F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[300].setRotationPoint(-53F, 5F, 2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[301].setRotationPoint(-53F, 5F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[302].setRotationPoint(-28F, -20.5F, 0.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[303].setRotationPoint(-38F, -20F, -11F);

		bodyModel[304].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[304].setRotationPoint(-38F, -20F, 10F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[305].setRotationPoint(-27F, -20F, -11F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[306].setRotationPoint(-39F, -20F, -7F);

		bodyModel[307].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[307].setRotationPoint(-38.5F, -20F, -10.5F);

		bodyModel[308].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[308].setRotationPoint(-26.5F, -20F, 10.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 266
		bodyModel[309].setRotationPoint(-39F, -23F, -7F);

		bodyModel[310].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[310].setRotationPoint(-38F, -23F, -11F);

		bodyModel[311].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[311].setRotationPoint(-37F, -23F, -11F);

		bodyModel[312].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[312].setRotationPoint(-26F, -23F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[313].setRotationPoint(-38F, -21F, -11F);

		bodyModel[314].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[314].setRotationPoint(-38F, -23F, 7F);

		bodyModel[315].addShapeBox(-1F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F); // Box 377
		bodyModel[315].setRotationPoint(-37F, -23F, 7F);

		bodyModel[316].addShapeBox(-1F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[316].setRotationPoint(-26F, -23F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[317].setRotationPoint(-38F, -21F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[318].setRotationPoint(-40F, -22F, -2F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[319].setRotationPoint(-41F, -22.2F, -2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[320].setRotationPoint(-41F, -22.2F, 0F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 296
		bodyModel[321].setRotationPoint(-40.25F, -22.2F, -2F);

		bodyModel[322].addShapeBox(0F, 0F, -5.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117 numberboard
		bodyModel[322].setRotationPoint(-40.2F, -22.37F, -2F);
		bodyModel[322].rotateAngleY = 0.09162979F;

		bodyModel[323].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 118 numberboard
		bodyModel[323].setRotationPoint(-40.2F, -22.37F, 2F);
		bodyModel[323].rotateAngleY = -0.09162979F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[324].setRotationPoint(-40F, -22F, -7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 372
		bodyModel[325].setRotationPoint(-40F, -21F, -9.75F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[326].setRotationPoint(-40F, -22F, -9.75F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301 markerlight glow
		bodyModel[327].setRotationPoint(-39.7F, -21.5F, -9F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 344 markerlight glow
		bodyModel[328].setRotationPoint(-39.7F, -21.5F, 8F);

		bodyModel[329].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 368
		bodyModel[329].setRotationPoint(-39F, -22F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 419
		bodyModel[330].setRotationPoint(-40F, -22F, -7.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 420
		bodyModel[331].setRotationPoint(-40F, -21F, 7.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 421
		bodyModel[332].setRotationPoint(-40F, -22F, 7.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 422
		bodyModel[333].setRotationPoint(-40F, -22F, 6.75F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 425
		bodyModel[334].setRotationPoint(-40F, -22F, 2F);

		bodyModel[335].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[335].setRotationPoint(24F, -23F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		bodyModel[336].setRotationPoint(28F, -19F, 7F);

		bodyModel[337].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 127
		bodyModel[337].setRotationPoint(24F, -20F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[338].setRotationPoint(28F, -19F, -9F);

		bodyModel[339].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 130
		bodyModel[339].setRotationPoint(24F, -20F, 5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[340].setRotationPoint(24F, -20F, -11F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[341].setRotationPoint(24F, -20F, 9F);

		bodyModel[342].addBox(0F, -1F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[342].setRotationPoint(24F, -21F, -11F);

		bodyModel[343].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[343].setRotationPoint(24F, -23F, 0F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[344].setRotationPoint(45.5F, -20.25F, -8.75F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[345].setRotationPoint(45.5F, -20.25F, 7.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 124
		bodyModel[346].setRotationPoint(46F, -22F, -7F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 20, 7, 0F,1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[347].setRotationPoint(46F, -22F, 0F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 131
		bodyModel[348].setRotationPoint(45F, -15F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[349].setRotationPoint(48F, -22.5F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[350].setRotationPoint(47.5F, -22.55F, -1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[351].setRotationPoint(47.5F, -20.55F, -1F);

		bodyModel[352].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 132
		bodyModel[352].setRotationPoint(45F, -22F, -1F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 173
		bodyModel[353].setRotationPoint(47F, -23F, -7F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 422 rear sanscap cover
		bodyModel[354].setRotationPoint(45F, -18F, -1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, -0.5F, -2F, 1F, -0.5F, -2F, 1F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F); // Box 133
		bodyModel[355].setRotationPoint(47F, -23F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[356].setRotationPoint(45F, -23F, -1F);

		bodyModel[357].addShapeBox(-1F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 415 D9 intake
		bodyModel[357].setRotationPoint(-12.5F, -22F, -7.37F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -13F, -5F, 0F, -13F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[358].setRotationPoint(-25.5F, -22.5F, -7.01F);

		bodyModel[359].addShapeBox(-1F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[359].setRotationPoint(-12.5F, -22F, 6.37F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 388
		bodyModel[360].setRotationPoint(-7F, -24.5F, -5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 389
		bodyModel[361].setRotationPoint(-7F, -24.5F, 5F);

		bodyModel[362].addBox(0F, -0.5F, 0F, 9, 1, 3, 0F); // Box 19
		bodyModel[362].setRotationPoint(-7F, 2F, 8F);
		bodyModel[362].rotateAngleZ = -0.03490659F;

		bodyModel[363].addShapeBox(0F, -1.5F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 495
		bodyModel[363].setRotationPoint(-7F, 2F, 9F);
		bodyModel[363].rotateAngleZ = -0.03490659F;

		bodyModel[364].addShapeBox(0F, 0.5F, 0F, 9, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[364].setRotationPoint(-7F, 2F, 9F);
		bodyModel[364].rotateAngleZ = -0.03490659F;

		bodyModel[365].addShapeBox(-8F, -1.5F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 497
		bodyModel[365].setRotationPoint(11F, 2F, 9F);
		bodyModel[365].rotateAngleZ = 0.03490659F;

		bodyModel[366].addBox(-8F, -0.5F, 0F, 9, 1, 3, 0F); // Box 498
		bodyModel[366].setRotationPoint(11F, 2F, 8F);
		bodyModel[366].rotateAngleZ = 0.03490659F;

		bodyModel[367].addShapeBox(-8F, 0.5F, 0F, 9, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[367].setRotationPoint(11F, 2F, 9F);
		bodyModel[367].rotateAngleZ = 0.03490659F;

		bodyModel[368].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 391
		bodyModel[368].setRotationPoint(18.5F, 0.5F, 8F);

		bodyModel[369].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 392
		bodyModel[369].setRotationPoint(2.5F, 0.5F, 8F);

		bodyModel[370].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 393
		bodyModel[370].setRotationPoint(8.5F, 0.5F, 8F);

		bodyModel[371].addBox(-8F, -0.5F, 0F, 0, 2, 3, 0F); // Box 378
		bodyModel[371].setRotationPoint(12.5F, 0.5F, 8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 380
		bodyModel[372].setRotationPoint(-15.5F, 1.5F, 8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 381
		bodyModel[373].setRotationPoint(12.5F, 1.5F, 8F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 382
		bodyModel[374].setRotationPoint(-7.5F, 3.5F, 8F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[375].setRotationPoint(-48.5F, -15.25F, -6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[376].setRotationPoint(-44F, -15.25F, -7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[377].setRotationPoint(-44F, -15.25F, 0F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.7F, 0F, -0.5F, -0.7F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[378].setRotationPoint(-47.5F, -15.25F, -6F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, 1F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[379].setRotationPoint(-47.5F, -15.25F, 0F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // late phase flat noseNoName
		bodyModel[380].setRotationPoint(-48.5F, -15.25F, 0F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 27, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[381].setRotationPoint(-13.5F, 1.5F, -11F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[382].setRotationPoint(-15.5F, 4F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[383].setRotationPoint(-15.5F, 1F, 5.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[384].setRotationPoint(-16.5F, 5F, -9F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[385].setRotationPoint(-14.5F, 5F, -9F);

		bodyModel[386].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[386].setRotationPoint(14.5F, 4F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[387].setRotationPoint(14.5F, 1F, 5.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[388].setRotationPoint(13.5F, 5F, -9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[389].setRotationPoint(15.5F, 5F, -9F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[390].setRotationPoint(-16.5F, 2F, -7F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[391].setRotationPoint(-16.5F, 2F, -6.5F);

		bodyModel[392].addBox(-0.5F, -5F, -1F, 1, 5, 1, 0F); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[392].setRotationPoint(-15F, 5.5F, -8.99F);
		bodyModel[392].rotateAngleZ = 0.36651914F;

		bodyModel[393].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[393].setRotationPoint(13.5F, 2F, -7F);

		bodyModel[394].addBox(-0.5F, -3F, -1F, 1, 3, 4, 0F); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[394].setRotationPoint(15F, 5.5F, -8.99F);
		bodyModel[394].rotateAngleZ = -0.31415927F;

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 cull early dash8C fueltank arrangement
		bodyModel[395].setRotationPoint(12.75F, 2.75F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 305 early dash8C fueltank arrangement
		bodyModel[396].setRotationPoint(15.5F, 2F, -6.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 24, 12, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -12F, -6F, 0F, -12F, -6F, 0F, 0F, -6F, 0F); // Box 416
		bodyModel[397].setRotationPoint(-26F, -22.5F, 7.01F);

		bodyModel[398].addShapeBox(0F, 0F, 0.5F, 36, 1, 19, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547
		bodyModel[398].setRotationPoint(27F, -23.38F, 1F);
		bodyModel[398].rotateAngleX = -0.13613568F;

		bodyModel[399].addShapeBox(0F, 0F, -19.5F, 36, 1, 19, 0F,0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[399].setRotationPoint(27F, -23.38F, -1F);
		bodyModel[399].rotateAngleX = 0.13613568F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[400].setRotationPoint(-37F, -18.5F, -11F);
		bodyModel[400].rotateAngleX = -0.61086524F;

		bodyModel[401].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[401].setRotationPoint(-37F, -18.5F, 11F);
		bodyModel[401].rotateAngleX = 0.61086524F;

		bodyModel[402].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[402].setRotationPoint(-35F, -17F, -12F);

		bodyModel[403].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 408
		bodyModel[403].setRotationPoint(-35F, -17F, 11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[404].setRotationPoint(-35F, -18F, 10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[405].setRotationPoint(-35F, -19F, 10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 61
		bodyModel[406].setRotationPoint(-18F, 2F, -6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F); // Box 62
		bodyModel[407].setRotationPoint(-18F, 2F, 5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 412
		bodyModel[408].setRotationPoint(16F, 2F, -6F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 413
		bodyModel[409].setRotationPoint(16F, 2F, 5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254 D9 WALKWAY
		bodyModel[410].setRotationPoint(-26F, -6F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 367
		bodyModel[411].setRotationPoint(-18F, -10F, -11.01F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[412].setRotationPoint(-26F, -14F, -11.01F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 426 early rear light
		bodyModel[413].setRotationPoint(48F, -22.5F, -1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 426 early rear light glow
		bodyModel[414].setRotationPoint(48F, -22.55F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 426 early rear light glow
		bodyModel[415].setRotationPoint(48F, -20.55F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[416].setRotationPoint(48F, -18.5F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 422 headlight low early glow
		bodyModel[417].setRotationPoint(47.5F, -18.55F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 423 headlight low early glow
		bodyModel[418].setRotationPoint(47.5F, -16.55F, -1F);

		bodyModel[419].addShapeBox(-1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 numberboard
		bodyModel[419].setRotationPoint(45.55F, -18F, -6F);
		bodyModel[419].rotateAngleY = -0.4712389F;

		bodyModel[420].addBox(-1F, 0F, -4.75F, 1, 2, 5, 0F); // Box 395 numberboard
		bodyModel[420].setRotationPoint(45.55F, -18F, 6F);
		bodyModel[420].rotateAngleY = 0.4712389F;

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[421].setRotationPoint(46.5F, -23.25F, -0.5F);

		bodyModel[422].addBox(-1F, 0F, -4.75F, 1, 11, 4, 0F); // Box 427 early ladder cull
		bodyModel[422].setRotationPoint(45.95F, -16F, 6F);
		bodyModel[422].rotateAngleY = 0.4712389F;

		bodyModel[423].addShapeBox(-1F, 0F, 0.75F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 early cull ladder
		bodyModel[423].setRotationPoint(45.95F, -16F, -6F);
		bodyModel[423].rotateAngleY = -0.4712389F;

		bodyModel[424].addBox(0F, 0F, 0F, 27, 4, 16, 0F); // Box 2
		bodyModel[424].setRotationPoint(-13.5F, 5F, -8F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[425].setRotationPoint(-13.5F, 5F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[426].setRotationPoint(-13.5F, 5F, 8F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 432
		bodyModel[427].setRotationPoint(-51.5F, -10F, -8F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 433
		bodyModel[428].setRotationPoint(-51.5F, -10F, 2F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[429].setRotationPoint(-52F, -10F, -2F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		bodyModel[430].setRotationPoint(-50F, -9F, -8F);
		bodyModel[430].rotateAngleY = 0.33161256F;

		bodyModel[431].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[431].setRotationPoint(-50F, -9F, 8F);
		bodyModel[431].rotateAngleY = -0.33161256F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[432].setRotationPoint(-38F, -24F, 5.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[433].setRotationPoint(-38F, -25F, 5.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[434].setRotationPoint(-38F, -24F, -6.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[435].setRotationPoint(-38F, -25F, -6.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[436].setRotationPoint(50F, -2F, -7.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[437].setRotationPoint(50F, -2F, -1.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[438].setRotationPoint(50F, -2F, 1.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 444
		bodyModel[439].setRotationPoint(51.5F, -10F, 2F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[440].setRotationPoint(52F, -10F, -2F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 446
		bodyModel[441].setRotationPoint(51.5F, -10F, -8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 447
		bodyModel[442].setRotationPoint(50F, -9F, -8F);
		bodyModel[442].rotateAngleY = -0.33161256F;

		bodyModel[443].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[443].setRotationPoint(50F, -9F, 8F);
		bodyModel[443].rotateAngleY = 0.33161256F;

		bodyModel[444].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[444].setRotationPoint(5F, -23.25F, -2.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[445].setRotationPoint(5F, -23.25F, 1.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[446].setRotationPoint(4F, -23.75F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[447].setRotationPoint(4F, -23.75F, 0.5F);

		bodyModel[448].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[448].setRotationPoint(4F, -23.75F, -0.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[449].setRotationPoint(5.5F, -23.25F, -1.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 435
		bodyModel[450].setRotationPoint(-51F, -1.5F, 2.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 436
		bodyModel[451].setRotationPoint(-51F, -1.5F, -4.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 457 cull ptc 4head
		bodyModel[452].setRotationPoint(-40.5F, -23.4F, -7F);

		bodyModel[453].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 458
		bodyModel[453].setRotationPoint(-40F, -24.2F, -4F);

		bodyModel[454].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 459
		bodyModel[454].setRotationPoint(-40F, -24.2F, 4F);

		bodyModel[455].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 460
		bodyModel[455].setRotationPoint(-27F, -22F, -7F);

		bodyModel[456].addShapeBox(0F, 0F, -19.5F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[456].setRotationPoint(27F, -24F, -1F);
		bodyModel[456].rotateAngleX = 0.13613568F;

		bodyModel[457].addShapeBox(0F, 0F, -19.5F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[457].setRotationPoint(33F, -24F, -1F);
		bodyModel[457].rotateAngleX = 0.13613568F;

		bodyModel[458].addShapeBox(0F, 0F, -19.5F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[458].setRotationPoint(39F, -24F, -1F);
		bodyModel[458].rotateAngleX = 0.13613568F;

		bodyModel[459].addShapeBox(0F, 0F, -9F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[459].setRotationPoint(27F, -24F, 1F);
		bodyModel[459].rotateAngleX = -0.13613568F;

		bodyModel[460].addShapeBox(0F, 0F, -9F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[460].setRotationPoint(33F, -24F, 1F);
		bodyModel[460].rotateAngleX = -0.13613568F;

		bodyModel[461].addShapeBox(0F, 0F, -9F, 11, 1, 19, 0F,0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -5.5F, 0F, -9.5F, -5.5F, 0F, 0F, 0F, 0F, 0F); // Box aftermarket winterization hatches
		bodyModel[461].setRotationPoint(39F, -24F, 1F);
		bodyModel[461].rotateAngleX = -0.13613568F;

		bodyModel[462].addShapeBox(0F, 0F, 0F, 24, 0, 11, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 467
		bodyModel[462].setRotationPoint(-26F, -23.01F, 1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 468 cull widdle guy
		bodyModel[463].setRotationPoint(-16F, -4F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 cull 
		bodyModel[464].setRotationPoint(45F, -16F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glow markerlight crl
		bodyModel[465].setRotationPoint(44.4F, -16F, -7.05F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 345 glow markerlight crl
		bodyModel[466].setRotationPoint(44.4F, -16F, 5.05F);

		bodyModel[467].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 348 glow markerlight sou
		bodyModel[467].setRotationPoint(44.75F, -16F, 5.5F);
		bodyModel[467].rotateAngleY = 0.4712389F;

		bodyModel[468].addShapeBox(-0.25F, 0F, -2.25F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 sou markerlight glow
		bodyModel[468].setRotationPoint(45.5F, -16F, -4.5F);
		bodyModel[468].rotateAngleY = -0.4712389F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[469].setRotationPoint(45.5F, -13.5F, 5.5F);

		bodyModel[470].addShapeBox(-1F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[470].setRotationPoint(46F, -16F, -1F);
		bodyModel[470].rotateAngleZ = 0.78539816F;

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 477 cull
		bodyModel[471].setRotationPoint(45F, -16F, 5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[472].setRotationPoint(-16F, -14F, -11.01F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[473].setRotationPoint(-47F, -15F, -5.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[474].setRotationPoint(-47F, -15F, 1.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[475].setRotationPoint(-47F, -15F, 5.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[476].setRotationPoint(-47F, -15F, -5.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0.1F, -13F, 0F, 0.1F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -13F, 0F, -1.9F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[477].setRotationPoint(29F, -19F, -9F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 26, 4, 2, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -1.9F, 0F, 0F, -1.9F); // Box 483
		bodyModel[478].setRotationPoint(29F, -19F, 7F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[479].setRotationPoint(-17F, 3.5F, -10.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[480].setRotationPoint(-17F, 2.5F, -10.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[481].setRotationPoint(-16.75F, 4F, -10.25F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[482].setRotationPoint(-17F, 2F, -10.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[483].setRotationPoint(16F, 0.5F, 9.5F);

		bodyModel[484].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[484].setRotationPoint(17.5F, 1.5F, 10F);
		bodyModel[484].rotateAngleY = -0.78539816F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[485].setRotationPoint(-15F, 2.5F, 7.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[486].setRotationPoint(-15F, 1.5F, 7.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[487].setRotationPoint(-14.75F, 3F, 7.75F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[488].setRotationPoint(-15F, 0.5F, 7.1F);
	}
	ModelFB3_new theTrucks2 = new ModelFB3_new();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_csxandmpblu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9325, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6 ||GetColor(entity) == 18
				||GetColor(entity) == 19){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_silverhigh.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9325, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_uncpeet.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9325, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_blacku.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9325, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}