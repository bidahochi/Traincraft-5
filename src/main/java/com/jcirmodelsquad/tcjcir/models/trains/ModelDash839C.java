//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.06.2023 - 21:00:25
// Last changed on: 11.06.2023 - 21:00:25

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

public class ModelDash839C extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDash839C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[429];

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
		bodyModel[36] = new ModelRendererTurbo(this, 191, 88, textureX, textureY); // Box 631 front mounting stuff
		bodyModel[37] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 882 front mounting stuff
		bodyModel[38] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 883 front mounting stuff
		bodyModel[39] = new ModelRendererTurbo(this, 259, 128, textureX, textureY); // Box 182 ph2 mounting stuff
		bodyModel[40] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 183 ph2 mounting stuff
		bodyModel[41] = new ModelRendererTurbo(this, 222, 86, textureX, textureY); // Box 184 ph2 mounting stuff
		bodyModel[42] = new ModelRendererTurbo(this, 260, 121, textureX, textureY); // Box 185 ph2 mounting stuff
		bodyModel[43] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[45] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[46] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[47] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 209, 62, textureX, textureY); // Box 251
		bodyModel[49] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 424
		bodyModel[50] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 426
		bodyModel[51] = new ModelRendererTurbo(this, 389, 110, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 389, 106, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[53] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 19
		bodyModel[54] = new ModelRendererTurbo(this, 368, 108, textureX, textureY); // Box 548
		bodyModel[55] = new ModelRendererTurbo(this, 389, 110, textureX, textureY); // Box 19
		bodyModel[56] = new ModelRendererTurbo(this, 389, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[57] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 19
		bodyModel[58] = new ModelRendererTurbo(this, 410, 108, textureX, textureY); // Box 548
		bodyModel[59] = new ModelRendererTurbo(this, 274, 84, textureX, textureY); // Box 156
		bodyModel[60] = new ModelRendererTurbo(this, 217, 173, textureX, textureY, "cull"); // Box 630 cull thing
		bodyModel[61] = new ModelRendererTurbo(this, 226, 114, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[62] = new ModelRendererTurbo(this, 244, 140, textureX, textureY); // Box 441
		bodyModel[63] = new ModelRendererTurbo(this, 414, 109, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[64] = new ModelRendererTurbo(this, 205, 118, textureX, textureY); // Box 443
		bodyModel[65] = new ModelRendererTurbo(this, 410, 118, textureX, textureY, "cull"); // Box 445 pipe cull
		bodyModel[66] = new ModelRendererTurbo(this, 415, 112, textureX, textureY, "cull"); // Box 447 pipe cull
		bodyModel[67] = new ModelRendererTurbo(this, 339, 124, textureX, textureY); // Box 382
		bodyModel[68] = new ModelRendererTurbo(this, 348, 129, textureX, textureY); // Box 450
		bodyModel[69] = new ModelRendererTurbo(this, 348, 121, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[70] = new ModelRendererTurbo(this, 44, 173, textureX, textureY); // Box 457
		bodyModel[71] = new ModelRendererTurbo(this, 44, 167, textureX, textureY); // Box 458
		bodyModel[72] = new ModelRendererTurbo(this, 41, 166, textureX, textureY); // Box 459
		bodyModel[73] = new ModelRendererTurbo(this, 53, 147, textureX, textureY); // Box 462
		bodyModel[74] = new ModelRendererTurbo(this, 15, 117, textureX, textureY, "cull"); // Box 162 cull
		bodyModel[75] = new ModelRendererTurbo(this, 27, 112, textureX, textureY, "cull"); // Box 163 cull
		bodyModel[76] = new ModelRendererTurbo(this, 33, 117, textureX, textureY, "cull"); // Box 164 cull
		bodyModel[77] = new ModelRendererTurbo(this, 27, 117, textureX, textureY); // Box 467
		bodyModel[78] = new ModelRendererTurbo(this, 48, 134, textureX, textureY); // Box 363
		bodyModel[79] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[80] = new ModelRendererTurbo(this, 41, 133, textureX, textureY); // Box 144
		bodyModel[81] = new ModelRendererTurbo(this, 39, 133, textureX, textureY); // Box 80
		bodyModel[82] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[83] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[84] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[85] = new ModelRendererTurbo(this, 14, 134, textureX, textureY); // Box 870
		bodyModel[86] = new ModelRendererTurbo(this, 17, 133, textureX, textureY); // Box 148
		bodyModel[87] = new ModelRendererTurbo(this, 23, 133, textureX, textureY); // Box 147
		bodyModel[88] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[89] = new ModelRendererTurbo(this, 11, 164, textureX, textureY); // Box 481
		bodyModel[90] = new ModelRendererTurbo(this, 23, 173, textureX, textureY); // Box 482
		bodyModel[91] = new ModelRendererTurbo(this, 23, 167, textureX, textureY); // Box 483
		bodyModel[92] = new ModelRendererTurbo(this, 20, 166, textureX, textureY); // Box 484
		bodyModel[93] = new ModelRendererTurbo(this, 24, 165, textureX, textureY); // Box 485
		bodyModel[94] = new ModelRendererTurbo(this, 50, 147, textureX, textureY); // Box 495
		bodyModel[95] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 496
		bodyModel[96] = new ModelRendererTurbo(this, 339, 129, textureX, textureY); // Box 124
		bodyModel[97] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[98] = new ModelRendererTurbo(this, 228, 17, textureX, textureY); // Box 292
		bodyModel[99] = new ModelRendererTurbo(this, 231, 2, textureX, textureY); // Box 293
		bodyModel[100] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[101] = new ModelRendererTurbo(this, 443, 2, textureX, textureY); // Box 284
		bodyModel[102] = new ModelRendererTurbo(this, 216, 25, textureX, textureY); // Box 285
		bodyModel[103] = new ModelRendererTurbo(this, 242, 27, textureX, textureY); // Box 157
		bodyModel[104] = new ModelRendererTurbo(this, 443, 24, textureX, textureY); // Box 283
		bodyModel[105] = new ModelRendererTurbo(this, 471, 178, textureX, textureY); // Box 133
		bodyModel[106] = new ModelRendererTurbo(this, 47, 147, textureX, textureY); // Box 134
		bodyModel[107] = new ModelRendererTurbo(this, 44, 147, textureX, textureY); // Box 135
		bodyModel[108] = new ModelRendererTurbo(this, 434, 184, textureX, textureY); // Box 136
		bodyModel[109] = new ModelRendererTurbo(this, 434, 186, textureX, textureY); // Box 137
		bodyModel[110] = new ModelRendererTurbo(this, 434, 192, textureX, textureY); // Box 138
		bodyModel[111] = new ModelRendererTurbo(this, 437, 185, textureX, textureY); // Box 139
		bodyModel[112] = new ModelRendererTurbo(this, 445, 181, textureX, textureY); // Box 140
		bodyModel[113] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 141
		bodyModel[114] = new ModelRendererTurbo(this, 79, 158, textureX, textureY); // Box 142
		bodyModel[115] = new ModelRendererTurbo(this, 70, 164, textureX, textureY); // Box 143
		bodyModel[116] = new ModelRendererTurbo(this, 70, 161, textureX, textureY); // Box 144
		bodyModel[117] = new ModelRendererTurbo(this, 79, 156, textureX, textureY); // Box 145
		bodyModel[118] = new ModelRendererTurbo(this, 72, 156, textureX, textureY); // Box 146
		bodyModel[119] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 147
		bodyModel[120] = new ModelRendererTurbo(this, 70, 158, textureX, textureY); // Box 148
		bodyModel[121] = new ModelRendererTurbo(this, 78, 160, textureX, textureY); // Box 149
		bodyModel[122] = new ModelRendererTurbo(this, 56, 168, textureX, textureY); // Box 150
		bodyModel[123] = new ModelRendererTurbo(this, 48, 166, textureX, textureY); // Box 151
		bodyModel[124] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 152
		bodyModel[125] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 153
		bodyModel[126] = new ModelRendererTurbo(this, 57, 166, textureX, textureY); // Box 154
		bodyModel[127] = new ModelRendererTurbo(this, 48, 172, textureX, textureY); // Box 155
		bodyModel[128] = new ModelRendererTurbo(this, 47, 175, textureX, textureY); // Box 156
		bodyModel[129] = new ModelRendererTurbo(this, 50, 164, textureX, textureY); // Box 157
		bodyModel[130] = new ModelRendererTurbo(this, 454, 184, textureX, textureY); // Box 158
		bodyModel[131] = new ModelRendererTurbo(this, 454, 186, textureX, textureY); // Box 159
		bodyModel[132] = new ModelRendererTurbo(this, 454, 192, textureX, textureY); // Box 160
		bodyModel[133] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 161
		bodyModel[134] = new ModelRendererTurbo(this, 425, 181, textureX, textureY); // Box 162
		bodyModel[135] = new ModelRendererTurbo(this, 91, 20, textureX, textureY); // Box 88
		bodyModel[136] = new ModelRendererTurbo(this, 136, 12, textureX, textureY); // Box 233
		bodyModel[137] = new ModelRendererTurbo(this, 91, 6, textureX, textureY); // Box 312
		bodyModel[138] = new ModelRendererTurbo(this, 491, 116, textureX, textureY); // Box 6
		bodyModel[139] = new ModelRendererTurbo(this, 459, 116, textureX, textureY); // Box 7
		bodyModel[140] = new ModelRendererTurbo(this, 458, 146, textureX, textureY); // Box 31
		bodyModel[141] = new ModelRendererTurbo(this, 458, 153, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[142] = new ModelRendererTurbo(this, 458, 153, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[143] = new ModelRendererTurbo(this, 72, 18, textureX, textureY); // Box 181
		bodyModel[144] = new ModelRendererTurbo(this, 478, 118, textureX, textureY); // Box 182
		bodyModel[145] = new ModelRendererTurbo(this, 153, 2, textureX, textureY); // Box 183
		bodyModel[146] = new ModelRendererTurbo(this, 153, 7, textureX, textureY); // Box 184
		bodyModel[147] = new ModelRendererTurbo(this, 210, 4, textureX, textureY); // Box 398
		bodyModel[148] = new ModelRendererTurbo(this, 205, 4, textureX, textureY); // Box 399
		bodyModel[149] = new ModelRendererTurbo(this, 487, 119, textureX, textureY); // Box 318
		bodyModel[150] = new ModelRendererTurbo(this, 475, 108, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[151] = new ModelRendererTurbo(this, 504, 112, textureX, textureY, "cull"); // Box 190 cull markerlight
		bodyModel[152] = new ModelRendererTurbo(this, 504, 117, textureX, textureY, "cull"); // Box 191 cull markerlight
		bodyModel[153] = new ModelRendererTurbo(this, 425, 48, textureX, textureY); // Box 96
		bodyModel[154] = new ModelRendererTurbo(this, 63, 208, textureX, textureY); // Box 350
		bodyModel[155] = new ModelRendererTurbo(this, 63, 188, textureX, textureY); // Box 351
		bodyModel[156] = new ModelRendererTurbo(this, 61, 192, textureX, textureY); // Box 132
		bodyModel[157] = new ModelRendererTurbo(this, 27, 197, textureX, textureY); // Box 135
		bodyModel[158] = new ModelRendererTurbo(this, 61, 200, textureX, textureY); // Box 57
		bodyModel[159] = new ModelRendererTurbo(this, 43, 189, textureX, textureY); // Box 282
		bodyModel[160] = new ModelRendererTurbo(this, 34, 187, textureX, textureY); // Box 284
		bodyModel[161] = new ModelRendererTurbo(this, 52, 187, textureX, textureY); // Box 285
		bodyModel[162] = new ModelRendererTurbo(this, 127, 158, textureX, textureY); // Box 368
		bodyModel[163] = new ModelRendererTurbo(this, 25, 189, textureX, textureY); // Box 286
		bodyModel[164] = new ModelRendererTurbo(this, 106, 160, textureX, textureY); // Box 370
		bodyModel[165] = new ModelRendererTurbo(this, 156, 227, textureX, textureY); // Box 298
		bodyModel[166] = new ModelRendererTurbo(this, 123, 228, textureX, textureY); // Box 279
		bodyModel[167] = new ModelRendererTurbo(this, 108, 234, textureX, textureY); // Box 282
		bodyModel[168] = new ModelRendererTurbo(this, 93, 234, textureX, textureY); // Box 283
		bodyModel[169] = new ModelRendererTurbo(this, 118, 231, textureX, textureY); // Box 297
		bodyModel[170] = new ModelRendererTurbo(this, 183, 218, textureX, textureY); // Box 298
		bodyModel[171] = new ModelRendererTurbo(this, 169, 208, textureX, textureY); // Box 299
		bodyModel[172] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 300
		bodyModel[173] = new ModelRendererTurbo(this, 154, 219, textureX, textureY); // Box 301
		bodyModel[174] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 302
		bodyModel[175] = new ModelRendererTurbo(this, 54, 212, textureX, textureY); // Box 7
		bodyModel[176] = new ModelRendererTurbo(this, 129, 212, textureX, textureY); // Box 24
		bodyModel[177] = new ModelRendererTurbo(this, 79, 195, textureX, textureY); // Box 28
		bodyModel[178] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 30
		bodyModel[179] = new ModelRendererTurbo(this, 43, 209, textureX, textureY); // Box 52 door swing right
		bodyModel[180] = new ModelRendererTurbo(this, 118, 209, textureX, textureY); // Box 314 door swing right
		bodyModel[181] = new ModelRendererTurbo(this, 15, 206, textureX, textureY); // Box 48
		bodyModel[182] = new ModelRendererTurbo(this, 8, 203, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[183] = new ModelRendererTurbo(this, 8, 208, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[184] = new ModelRendererTurbo(this, 86, 177, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[185] = new ModelRendererTurbo(this, 78, 180, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[186] = new ModelRendererTurbo(this, 62, 180, textureX, textureY); // Box 43
		bodyModel[187] = new ModelRendererTurbo(this, 70, 177, textureX, textureY); // Box 175
		bodyModel[188] = new ModelRendererTurbo(this, 15, 202, textureX, textureY); // Box 133
		bodyModel[189] = new ModelRendererTurbo(this, 15, 198, textureX, textureY); // Box 187
		bodyModel[190] = new ModelRendererTurbo(this, 83, 172, textureX, textureY); // Box 299
		bodyModel[191] = new ModelRendererTurbo(this, 94, 176, textureX, textureY, "lamp"); // Box 301 markerlight glow
		bodyModel[192] = new ModelRendererTurbo(this, 78, 175, textureX, textureY); // Box 302
		bodyModel[193] = new ModelRendererTurbo(this, 94, 179, textureX, textureY, "lamp"); // Box 303 markerlight glow
		bodyModel[194] = new ModelRendererTurbo(this, 1, 229, textureX, textureY); // Box 258
		bodyModel[195] = new ModelRendererTurbo(this, 65, 239, textureX, textureY); // Box 275
		bodyModel[196] = new ModelRendererTurbo(this, 151, 204, textureX, textureY); // Box 688
		bodyModel[197] = new ModelRendererTurbo(this, 154, 206, textureX, textureY); // Box 210
		bodyModel[198] = new ModelRendererTurbo(this, 50, 239, textureX, textureY); // Box 208
		bodyModel[199] = new ModelRendererTurbo(this, 85, 237, textureX, textureY, "lamp"); // Box 352 headlight nose
		bodyModel[200] = new ModelRendererTurbo(this, 85, 242, textureX, textureY, "lamp"); // Box 353 headlight nose
		bodyModel[201] = new ModelRendererTurbo(this, 82, 247, textureX, textureY); // Box 354
		bodyModel[202] = new ModelRendererTurbo(this, 222, 243, textureX, textureY); // Box 317
		bodyModel[203] = new ModelRendererTurbo(this, 222, 241, textureX, textureY); // Box 318
		bodyModel[204] = new ModelRendererTurbo(this, 222, 249, textureX, textureY); // Box 319
		bodyModel[205] = new ModelRendererTurbo(this, 222, 251, textureX, textureY); // Box 220
		bodyModel[206] = new ModelRendererTurbo(this, 219, 241, textureX, textureY); // Box 221
		bodyModel[207] = new ModelRendererTurbo(this, 215, 248, textureX, textureY); // Box 222
		bodyModel[208] = new ModelRendererTurbo(this, 216, 241, textureX, textureY); // Box 223
		bodyModel[209] = new ModelRendererTurbo(this, 212, 248, textureX, textureY); // Box 224
		bodyModel[210] = new ModelRendererTurbo(this, 168, 199, textureX, textureY); // Box 123
		bodyModel[211] = new ModelRendererTurbo(this, 149, 199, textureX, textureY); // Box 311
		bodyModel[212] = new ModelRendererTurbo(this, 367, 99, textureX, textureY); // Box 18 late stack
		bodyModel[213] = new ModelRendererTurbo(this, 380, 96, textureX, textureY); // Box 21 late stack
		bodyModel[214] = new ModelRendererTurbo(this, 367, 91, textureX, textureY); // Box 405 EXTRA STACC
		bodyModel[215] = new ModelRendererTurbo(this, 50, 230, textureX, textureY); // Box 231
		bodyModel[216] = new ModelRendererTurbo(this, 163, 203, textureX, textureY); // Box 232
		bodyModel[217] = new ModelRendererTurbo(this, 199, 228, textureX, textureY); // Box 355 brakewheel
		bodyModel[218] = new ModelRendererTurbo(this, 210, 231, textureX, textureY); // Box 277
		bodyModel[219] = new ModelRendererTurbo(this, 73, 122, textureX, textureY); // Box 402
		bodyModel[220] = new ModelRendererTurbo(this, 73, 50, textureX, textureY); // Box 258
		bodyModel[221] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 81
		bodyModel[222] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[223] = new ModelRendererTurbo(this, 83, 36, textureX, textureY); // Box 522
		bodyModel[224] = new ModelRendererTurbo(this, 66, 50, textureX, textureY); // Box 244
		bodyModel[225] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 246
		bodyModel[226] = new ModelRendererTurbo(this, 469, 165, textureX, textureY); // Box 247
		bodyModel[227] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 248
		bodyModel[228] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 249
		bodyModel[229] = new ModelRendererTurbo(this, 71, 38, textureX, textureY); // Box 250
		bodyModel[230] = new ModelRendererTurbo(this, 78, 50, textureX, textureY); // Box 251
		bodyModel[231] = new ModelRendererTurbo(this, 509, 165, textureX, textureY); // Box 252
		bodyModel[232] = new ModelRendererTurbo(this, 464, 164, textureX, textureY); // Box 253
		bodyModel[233] = new ModelRendererTurbo(this, 482, 163, textureX, textureY); // Box 247
		bodyModel[234] = new ModelRendererTurbo(this, 497, 168, textureX, textureY); // Box 248
		bodyModel[235] = new ModelRendererTurbo(this, 499, 168, textureX, textureY); // Box 249
		bodyModel[236] = new ModelRendererTurbo(this, 481, 168, textureX, textureY); // Box 250
		bodyModel[237] = new ModelRendererTurbo(this, 475, 168, textureX, textureY); // Box 251
		bodyModel[238] = new ModelRendererTurbo(this, 506, 169, textureX, textureY); // Box 252
		bodyModel[239] = new ModelRendererTurbo(this, 506, 171, textureX, textureY); // Box 253
		bodyModel[240] = new ModelRendererTurbo(this, 509, 172, textureX, textureY); // Box 254
		bodyModel[241] = new ModelRendererTurbo(this, 472, 169, textureX, textureY); // Box 255
		bodyModel[242] = new ModelRendererTurbo(this, 472, 171, textureX, textureY); // Box 256
		bodyModel[243] = new ModelRendererTurbo(this, 469, 172, textureX, textureY); // Box 257
		bodyModel[244] = new ModelRendererTurbo(this, 462, 108, textureX, textureY); // Box 254
		bodyModel[245] = new ModelRendererTurbo(this, 475, 108, textureX, textureY, "lamp"); // Box 257
		bodyModel[246] = new ModelRendererTurbo(this, 462, 108, textureX, textureY); // Box 258
		bodyModel[247] = new ModelRendererTurbo(this, 415, 83, textureX, textureY); // Box 235
		bodyModel[248] = new ModelRendererTurbo(this, 423, 90, textureX, textureY); // Box 260
		bodyModel[249] = new ModelRendererTurbo(this, 424, 65, textureX, textureY); // Box 261
		bodyModel[250] = new ModelRendererTurbo(this, 480, 73, textureX, textureY); // Box 262
		bodyModel[251] = new ModelRendererTurbo(this, 469, 66, textureX, textureY); // Box 263
		bodyModel[252] = new ModelRendererTurbo(this, 480, 81, textureX, textureY); // Box 234
		bodyModel[253] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Box 265
		bodyModel[254] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 266
		bodyModel[255] = new ModelRendererTurbo(this, 491, 81, textureX, textureY); // Box 267
		bodyModel[256] = new ModelRendererTurbo(this, 462, 97, textureX, textureY); // Box 268
		bodyModel[257] = new ModelRendererTurbo(this, 480, 73, textureX, textureY); // Box 269
		bodyModel[258] = new ModelRendererTurbo(this, 469, 66, textureX, textureY); // Box 270
		bodyModel[259] = new ModelRendererTurbo(this, 480, 81, textureX, textureY); // Box 271
		bodyModel[260] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Box 272
		bodyModel[261] = new ModelRendererTurbo(this, 451, 97, textureX, textureY); // Box 273
		bodyModel[262] = new ModelRendererTurbo(this, 440, 97, textureX, textureY); // Box 275
		bodyModel[263] = new ModelRendererTurbo(this, 458, 89, textureX, textureY); // Box 276
		bodyModel[264] = new ModelRendererTurbo(this, 110, 38, textureX, textureY); // Box 277
		bodyModel[265] = new ModelRendererTurbo(this, 459, 164, textureX, textureY); // Box 278
		bodyModel[266] = new ModelRendererTurbo(this, 11, 130, textureX, textureY); // Box 279
		bodyModel[267] = new ModelRendererTurbo(this, 82, 48, textureX, textureY); // Box 280
		bodyModel[268] = new ModelRendererTurbo(this, 83, 38, textureX, textureY); // Box 281
		bodyModel[269] = new ModelRendererTurbo(this, 69, 47, textureX, textureY); // Box 282
		bodyModel[270] = new ModelRendererTurbo(this, 369, 84, textureX, textureY); // Box 283 coal stacc
		bodyModel[271] = new ModelRendererTurbo(this, 339, 91, textureX, textureY); // Box 284 coal box
		bodyModel[272] = new ModelRendererTurbo(this, 317, 207, textureX, textureY); // Box 418
		bodyModel[273] = new ModelRendererTurbo(this, 315, 204, textureX, textureY); // Box 419
		bodyModel[274] = new ModelRendererTurbo(this, 314, 198, textureX, textureY); // Box 420
		bodyModel[275] = new ModelRendererTurbo(this, 315, 201, textureX, textureY); // Box 421
		bodyModel[276] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[277] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[278] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[279] = new ModelRendererTurbo(this, 280, 223, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[280] = new ModelRendererTurbo(this, 247, 213, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[281] = new ModelRendererTurbo(this, 280, 227, textureX, textureY); // Box 428
		bodyModel[282] = new ModelRendererTurbo(this, 87, 123, textureX, textureY); // Box 300
		bodyModel[283] = new ModelRendererTurbo(this, 291, 204, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[284] = new ModelRendererTurbo(this, 291, 208, textureX, textureY); // Box 335
		bodyModel[285] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime4); // Box 9 PRIME5-4
		bodyModel[286] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime2); // Box 8 PRIME5-2
		bodyModel[287] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime3); // Box 7 PRIME5-3
		bodyModel[288] = new ModelRendererTurbo(this, 270, 223, textureX, textureY, BoxName.prime1); // Box 6 PRIME5-1
		bodyModel[289] = new ModelRendererTurbo(this, 270, 227, textureX, textureY); // Box 421 prime base
		bodyModel[290] = new ModelRendererTurbo(this, 337, 206, textureX, textureY); // Box 233
		bodyModel[291] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 234
		bodyModel[292] = new ModelRendererTurbo(this, 337, 202, textureX, textureY); // Box 235
		bodyModel[293] = new ModelRendererTurbo(this, 329, 207, textureX, textureY); // Box 361
		bodyModel[294] = new ModelRendererTurbo(this, 327, 198, textureX, textureY); // Box 362
		bodyModel[295] = new ModelRendererTurbo(this, 328, 204, textureX, textureY); // Box 363
		bodyModel[296] = new ModelRendererTurbo(this, 328, 201, textureX, textureY); // Box 364
		bodyModel[297] = new ModelRendererTurbo(this, 259, 200, textureX, textureY); // Box 184 o2 generator
		bodyModel[298] = new ModelRendererTurbo(this, 270, 217, textureX, textureY); // Box 421 prime base
		bodyModel[299] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[300] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[301] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[302] = new ModelRendererTurbo(this, 270, 213, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[303] = new ModelRendererTurbo(this, 279, 213, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[304] = new ModelRendererTurbo(this, 490, 112, textureX, textureY); // Box 364
		bodyModel[305] = new ModelRendererTurbo(this, 490, 109, textureX, textureY); // Box 363
		bodyModel[306] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 362
		bodyModel[307] = new ModelRendererTurbo(this, 497, 111, textureX, textureY); // Box 361
		bodyModel[308] = new ModelRendererTurbo(this, 68, 39, textureX, textureY); // Box 326
		bodyModel[309] = new ModelRendererTurbo(this, 68, 41, textureX, textureY); // Box 327
		bodyModel[310] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 328
		bodyModel[311] = new ModelRendererTurbo(this, 68, 43, textureX, textureY); // Box 329
		bodyModel[312] = new ModelRendererTurbo(this, 5, 148, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[313] = new ModelRendererTurbo(this, 5, 153, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[314] = new ModelRendererTurbo(this, 21, 134, textureX, textureY); // Box 440 honse m-2
		bodyModel[315] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 410
		bodyModel[316] = new ModelRendererTurbo(this, 66, 131, textureX, textureY); // Box 411
		bodyModel[317] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[318] = new ModelRendererTurbo(this, 66, 126, textureX, textureY, BoxName.ditch); // Box 412 ditchlight f
		bodyModel[319] = new ModelRendererTurbo(this, 59, 116, textureX, textureY, "cull"); // Box 101 cull
		bodyModel[320] = new ModelRendererTurbo(this, 66, 116, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f d
		bodyModel[321] = new ModelRendererTurbo(this, 59, 116, textureX, textureY, "cull"); // Box 444 cull
		bodyModel[322] = new ModelRendererTurbo(this, 66, 116, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f d
		bodyModel[323] = new ModelRendererTurbo(this, 337, 200, textureX, textureY); // Box 341
		bodyModel[324] = new ModelRendererTurbo(this, 296, 199, textureX, textureY); // Box 354
		bodyModel[325] = new ModelRendererTurbo(this, 297, 205, textureX, textureY); // Box 355
		bodyModel[326] = new ModelRendererTurbo(this, 297, 202, textureX, textureY); // Box 356
		bodyModel[327] = new ModelRendererTurbo(this, 305, 211, textureX, textureY); // Box 357
		bodyModel[328] = new ModelRendererTurbo(this, 298, 211, textureX, textureY); // Box 443
		bodyModel[329] = new ModelRendererTurbo(this, 298, 208, textureX, textureY); // Box 444
		bodyModel[330] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 348 chains
		bodyModel[331] = new ModelRendererTurbo(this, 397, 212, textureX, textureY); // Box 547
		bodyModel[332] = new ModelRendererTurbo(this, 397, 234, textureX, textureY); // Box 345
		bodyModel[333] = new ModelRendererTurbo(this, 481, 145, textureX, textureY, "lamp"); // Box 339 glow markerlight crl
		bodyModel[334] = new ModelRendererTurbo(this, 481, 145, textureX, textureY, "lamp"); // Box 345 glow markerlight crl
		bodyModel[335] = new ModelRendererTurbo(this, 286, 211, textureX, textureY); // Box 373
		bodyModel[336] = new ModelRendererTurbo(this, 286, 208, textureX, textureY); // Box 373
		bodyModel[337] = new ModelRendererTurbo(this, 493, 145, textureX, textureY, "lamp"); // Box 348 glow markerlight sou
		bodyModel[338] = new ModelRendererTurbo(this, 493, 145, textureX, textureY, "lamp"); // Box 349 sou markerlight glow
		bodyModel[339] = new ModelRendererTurbo(this, 480, 163, textureX, textureY); // Box 350
		bodyModel[340] = new ModelRendererTurbo(this, 473, 163, textureX, textureY); // Box 351
		bodyModel[341] = new ModelRendererTurbo(this, 479, 170, textureX, textureY); // Box 352
		bodyModel[342] = new ModelRendererTurbo(this, 59, 121, textureX, textureY); // Box 353
		bodyModel[343] = new ModelRendererTurbo(this, 66, 121, textureX, textureY, BoxName.ditch); // Box 354 ditchlight r d
		bodyModel[344] = new ModelRendererTurbo(this, 66, 121, textureX, textureY, BoxName.ditch); // Box 355 ditchlight r d
		bodyModel[345] = new ModelRendererTurbo(this, 59, 121, textureX, textureY); // Box 356
		bodyModel[346] = new ModelRendererTurbo(this, 279, 204, textureX, textureY); // Box 114
		bodyModel[347] = new ModelRendererTurbo(this, 279, 204, textureX, textureY); // Box 74
		bodyModel[348] = new ModelRendererTurbo(this, 279, 204, textureX, textureY); // Box 78
		bodyModel[349] = new ModelRendererTurbo(this, 278, 200, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[350] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 566
		bodyModel[351] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 565
		bodyModel[352] = new ModelRendererTurbo(this, 299, 215, textureX, textureY); // Box 564
		bodyModel[353] = new ModelRendererTurbo(this, 239, 208, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[354] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 365 ditchlight r
		bodyModel[355] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 366
		bodyModel[356] = new ModelRendererTurbo(this, 59, 126, textureX, textureY, BoxName.ditch); // Box 367 ditchlight r
		bodyModel[357] = new ModelRendererTurbo(this, 59, 131, textureX, textureY); // Box 368
		bodyModel[358] = new ModelRendererTurbo(this, 82, 123, textureX, textureY); // Box 369
		bodyModel[359] = new ModelRendererTurbo(this, 33, 125, textureX, textureY); // Box 300
		bodyModel[360] = new ModelRendererTurbo(this, 29, 125, textureX, textureY); // Box 301
		bodyModel[361] = new ModelRendererTurbo(this, 62, 146, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[362] = new ModelRendererTurbo(this, 132, 182, textureX, textureY); // Box 412 cs
		bodyModel[363] = new ModelRendererTurbo(this, 132, 202, textureX, textureY); // Box 413 cs
		bodyModel[364] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 86 cs
		bodyModel[365] = new ModelRendererTurbo(this, 132, 195, textureX, textureY); // Box 531 cs
		bodyModel[366] = new ModelRendererTurbo(this, 148, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[367] = new ModelRendererTurbo(this, 108, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[368] = new ModelRendererTurbo(this, 102, 183, textureX, textureY); // Box 307 spedo
		bodyModel[369] = new ModelRendererTurbo(this, 168, 188, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[370] = new ModelRendererTurbo(this, 143, 188, textureX, textureY, "lamp"); // Box 412 cab signalling glowey
		bodyModel[371] = new ModelRendererTurbo(this, 491, 160, textureX, textureY); // Box 325
		bodyModel[372] = new ModelRendererTurbo(this, 487, 160, textureX, textureY); // Box 326
		bodyModel[373] = new ModelRendererTurbo(this, 485, 200, textureX, textureY, "cull"); // Box 328 cull crossover sou
		bodyModel[374] = new ModelRendererTurbo(this, 456, 134, textureX, textureY); // Box 384
		bodyModel[375] = new ModelRendererTurbo(this, 458, 93, textureX, textureY); // Box 385
		bodyModel[376] = new ModelRendererTurbo(this, 285, 200, textureX, textureY); // Box 383
		bodyModel[377] = new ModelRendererTurbo(this, 286, 204, textureX, textureY); // Box 384
		bodyModel[378] = new ModelRendererTurbo(this, 286, 204, textureX, textureY); // Box 385
		bodyModel[379] = new ModelRendererTurbo(this, 286, 204, textureX, textureY); // Box 386
		bodyModel[380] = new ModelRendererTurbo(this, 491, 81, textureX, textureY); // Box 387
		bodyModel[381] = new ModelRendererTurbo(this, 228, 137, textureX, textureY); // Box 387
		bodyModel[382] = new ModelRendererTurbo(this, 105, 180, textureX, textureY); // Box 530 not a fridge
		bodyModel[383] = new ModelRendererTurbo(this, 73, 131, textureX, textureY, "lamp"); // Box 247 headlight front 2
		bodyModel[384] = new ModelRendererTurbo(this, 73, 126, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[385] = new ModelRendererTurbo(this, 59, 138, textureX, textureY); // Box 311
		bodyModel[386] = new ModelRendererTurbo(this, 248, 206, textureX, textureY); // Box 336
		bodyModel[387] = new ModelRendererTurbo(this, 255, 201, textureX, textureY, "lamp"); // Box 337 cull
		bodyModel[388] = new ModelRendererTurbo(this, 248, 201, textureX, textureY, "lamp"); // Box 338 cull
		bodyModel[389] = new ModelRendererTurbo(this, 463, 158, textureX, textureY, "lamp"); // Box 396 headlight r
		bodyModel[390] = new ModelRendererTurbo(this, 456, 158, textureX, textureY); // Box 397
		bodyModel[391] = new ModelRendererTurbo(this, 463, 158, textureX, textureY, "lamp"); // Box 398 headlight r
		bodyModel[392] = new ModelRendererTurbo(this, 193, 238, textureX, textureY); // Box 399
		bodyModel[393] = new ModelRendererTurbo(this, 207, 238, textureX, textureY); // Box 400
		bodyModel[394] = new ModelRendererTurbo(this, 200, 237, textureX, textureY); // Box 401
		bodyModel[395] = new ModelRendererTurbo(this, 200, 234, textureX, textureY); // Box 402
		bodyModel[396] = new ModelRendererTurbo(this, 211, 235, textureX, textureY); // Box 43
		bodyModel[397] = new ModelRendererTurbo(this, 212, 238, textureX, textureY); // Box 43
		bodyModel[398] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 405
		bodyModel[399] = new ModelRendererTurbo(this, 468, 200, textureX, textureY, "cull"); // Box 403 cull crossover cR
		bodyModel[400] = new ModelRendererTurbo(this, 53, 3, textureX, textureY); // Box 193
		bodyModel[401] = new ModelRendererTurbo(this, 30, 3, textureX, textureY); // Box 273
		bodyModel[402] = new ModelRendererTurbo(this, 343, 82, textureX, textureY); // Box 408 lot of little pipes 3b
		bodyModel[403] = new ModelRendererTurbo(this, 357, 84, textureX, textureY); // Box 409 lot of little pipes 3c
		bodyModel[404] = new ModelRendererTurbo(this, 310, 215, textureX, textureY); // Box 570 mma mirrors
		bodyModel[405] = new ModelRendererTurbo(this, 316, 215, textureX, textureY); // Box 570 mma mirrors
		bodyModel[406] = new ModelRendererTurbo(this, 313, 215, textureX, textureY); // Box 350
		bodyModel[407] = new ModelRendererTurbo(this, 319, 215, textureX, textureY); // Box 408
		bodyModel[408] = new ModelRendererTurbo(this, 301, 222, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[409] = new ModelRendererTurbo(this, 289, 222, textureX, textureY); // Box 5
		bodyModel[410] = new ModelRendererTurbo(this, 327, 225, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[411] = new ModelRendererTurbo(this, 327, 220, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[412] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 563
		bodyModel[413] = new ModelRendererTurbo(this, 327, 218, textureX, textureY); // Box 564
		bodyModel[414] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 551 ditchlight f mccloud
		bodyModel[415] = new ModelRendererTurbo(this, 82, 116, textureX, textureY, BoxName.ditch); // Box 550 ditchlight f mccloud
		bodyModel[416] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 549
		bodyModel[417] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 548
		bodyModel[418] = new ModelRendererTurbo(this, 96, 116, textureX, textureY, BoxName.ditch); // Box 555 ditchlight r mccloud
		bodyModel[419] = new ModelRendererTurbo(this, 96, 116, textureX, textureY, BoxName.ditch); // Box 554 ditchlight r mccloud
		bodyModel[420] = new ModelRendererTurbo(this, 89, 116, textureX, textureY); // Box 553
		bodyModel[421] = new ModelRendererTurbo(this, 89, 116, textureX, textureY); // Box 552
		bodyModel[422] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 4
		bodyModel[423] = new ModelRendererTurbo(this, 33, 70, textureX, textureY); // Box 4
		bodyModel[424] = new ModelRendererTurbo(this, 18, 72, textureX, textureY); // Box 448
		bodyModel[425] = new ModelRendererTurbo(this, 48, 72, textureX, textureY); // Box 449
		bodyModel[426] = new ModelRendererTurbo(this, 175, 177, textureX, textureY); // Box 431 backpannel bulgy bit
		bodyModel[427] = new ModelRendererTurbo(this, 322, 216, textureX, textureY); // Box 104 cnrc antenna
		bodyModel[428] = new ModelRendererTurbo(this, 334, 135, textureX, textureY); // Box 428 cnrc circumsized fueltank

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

		bodyModel[43].addBox(0F, 0F, 0F, 27, 4, 16, 0F); // Box 2
		bodyModel[43].setRotationPoint(-13.5F, 5F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 27, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[44].setRotationPoint(-13.5F, 1.5F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[45].setRotationPoint(-13.5F, 5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[46].setRotationPoint(-13.5F, 5F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 100, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[47].setRotationPoint(-50F, 1.75F, -7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 100, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[48].setRotationPoint(-50F, 0F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 100, 2, 14, 0F); // Box 424
		bodyModel[49].setRotationPoint(-50F, -2F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 92, 2, 4, 0F); // Box 426
		bodyModel[50].setRotationPoint(-46F, -2F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[51].setRotationPoint(-15.5F, 4F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[52].setRotationPoint(-15.5F, 1F, 5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[53].setRotationPoint(-16.5F, 5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[54].setRotationPoint(-14.5F, 5F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[55].setRotationPoint(14.5F, 4F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[56].setRotationPoint(14.5F, 1F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[57].setRotationPoint(13.5F, 5F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[58].setRotationPoint(15.5F, 5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 156
		bodyModel[59].setRotationPoint(-46F, 0.5F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 92, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630 cull thing
		bodyModel[60].setRotationPoint(-46F, 0F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 310 cull fueltank support
		bodyModel[61].setRotationPoint(-16.5F, 2F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 441
		bodyModel[62].setRotationPoint(-16.5F, 2F, -6.5F);

		bodyModel[63].addBox(-0.5F, -5F, -1F, 1, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[63].setRotationPoint(-15F, 5.5F, -8.99F);
		bodyModel[63].rotateAngleZ = 0.36651914F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 443
		bodyModel[64].setRotationPoint(13.5F, 2F, -7F);

		bodyModel[65].addBox(-0.5F, -3F, -1F, 1, 3, 4, 0F); // Box 445 pipe cull
		bodyModel[65].setRotationPoint(15F, 5.5F, -8.99F);
		bodyModel[65].rotateAngleZ = -0.31415927F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 pipe cull
		bodyModel[66].setRotationPoint(12.75F, 2.75F, -10F);

		bodyModel[67].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 382
		bodyModel[67].setRotationPoint(-12F, 1.25F, -11.25F);
		bodyModel[67].rotateAngleX = -0.29670597F;

		bodyModel[68].addBox(0F, -0.5F, -3F, 1, 1, 3, 0F); // Box 450
		bodyModel[68].setRotationPoint(-12F, 1.25F, 11.25F);
		bodyModel[68].rotateAngleX = 0.29670597F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[69].setRotationPoint(-17.75F, 0F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 457
		bodyModel[70].setRotationPoint(-46F, 6F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[71].setRotationPoint(-46F, 1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		bodyModel[72].setRotationPoint(-46F, 1F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[73].setRotationPoint(-50.01F, 7F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 162 cull
		bodyModel[74].setRotationPoint(-52F, -2F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 163
		bodyModel[75].setRotationPoint(-52F, -2F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 164 cull
		bodyModel[76].setRotationPoint(-52F, -2F, 1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 467
		bodyModel[77].setRotationPoint(-52F, -1F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[78].setRotationPoint(-50F, -9F, -8F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[79].setRotationPoint(-50.5F, -10F, -4F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 144
		bodyModel[80].setRotationPoint(-50F, -10F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
		bodyModel[81].setRotationPoint(-50F, -10F, -5F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[82].setRotationPoint(-50F, -3F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[83].setRotationPoint(-50F, -10F, -8F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[84].setRotationPoint(-50F, -10F, 9F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		bodyModel[85].setRotationPoint(-50F, -9F, 7F);

		bodyModel[86].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 148
		bodyModel[86].setRotationPoint(-50F, -10F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[87].setRotationPoint(-50F, -10F, 4F);

		bodyModel[88].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[88].setRotationPoint(-50F, -3F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 481
		bodyModel[89].setRotationPoint(-47F, -2F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 482
		bodyModel[90].setRotationPoint(-46F, 6F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[91].setRotationPoint(-46F, 1F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[92].setRotationPoint(-46F, 0F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[93].setRotationPoint(-46F, 0F, 11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495
		bodyModel[94].setRotationPoint(-50.01F, 7F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 496
		bodyModel[95].setRotationPoint(-50F, 8F, 8F);

		bodyModel[96].addBox(0F, -0.5F, 0F, 1, 1, 3, 0F); // Box 124
		bodyModel[96].setRotationPoint(9F, 1.25F, -11.25F);
		bodyModel[96].rotateAngleX = -0.29670597F;

		bodyModel[97].addBox(0F, 0F, 0F, 70, 20, 14, 0F); // Box 6
		bodyModel[97].setRotationPoint(-26F, -21F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[98].setRotationPoint(-4F, -22F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[99].setRotationPoint(-4F, -22F, 3F);

		bodyModel[100].addBox(0F, 0F, 0F, 28, 1, 6, 0F); // Box 294
		bodyModel[100].setRotationPoint(-4F, -22F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 31, 20, 1, 0F); // Box 284
		bodyModel[101].setRotationPoint(14F, -21F, 6.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[102].setRotationPoint(14F, -22F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[103].setRotationPoint(14F, -22F, 3F);

		bodyModel[104].addBox(0F, 0F, 0F, 31, 20, 1, 0F); // Box 283
		bodyModel[104].setRotationPoint(14F, -21F, -7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 19, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[105].setRotationPoint(50.02F, 8F, -9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[106].setRotationPoint(50.01F, 7F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[107].setRotationPoint(50.01F, 7F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[108].setRotationPoint(45F, 0F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 137
		bodyModel[109].setRotationPoint(45F, 1F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 138
		bodyModel[110].setRotationPoint(45F, 6F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[111].setRotationPoint(46F, 0F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 140
		bodyModel[112].setRotationPoint(46F, -2F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 141
		bodyModel[113].setRotationPoint(-50F, 7F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 142
		bodyModel[114].setRotationPoint(47F, 4.5F, 8F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 143
		bodyModel[115].setRotationPoint(47F, 5.5F, 8F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 144
		bodyModel[116].setRotationPoint(47F, 3F, 8F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 145
		bodyModel[117].setRotationPoint(47F, 2F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 146
		bodyModel[118].setRotationPoint(47F, 7F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[119].setRotationPoint(47F, 8F, 8F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 148
		bodyModel[120].setRotationPoint(47F, 0F, 7F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 149
		bodyModel[121].setRotationPoint(47F, -2F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 150
		bodyModel[122].setRotationPoint(47F, -2F, -8F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 151
		bodyModel[123].setRotationPoint(47F, 0F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 152
		bodyModel[124].setRotationPoint(47F, 3F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 153
		bodyModel[125].setRotationPoint(47F, 2F, -8F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 154
		bodyModel[126].setRotationPoint(47F, 4.5F, -8F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 155
		bodyModel[127].setRotationPoint(47F, 5.5F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[128].setRotationPoint(47F, 8F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 157
		bodyModel[129].setRotationPoint(47F, 7F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[130].setRotationPoint(45F, 0F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 159
		bodyModel[131].setRotationPoint(45F, 1F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 160
		bodyModel[132].setRotationPoint(45F, 6F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 161
		bodyModel[133].setRotationPoint(46F, 0F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[134].setRotationPoint(46F, -2F, -10F);

		bodyModel[135].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[135].setRotationPoint(24F, -23F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 233
		bodyModel[136].setRotationPoint(24F, -22F, -11F);

		bodyModel[137].addShapeBox(0F, -1F, 0F, 22, 2, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[137].setRotationPoint(24F, -23F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[138].setRotationPoint(45F, -22F, 1.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 20, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7
		bodyModel[139].setRotationPoint(45F, -22F, -7.75F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[140].setRotationPoint(46.5F, -18.5F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[141].setRotationPoint(47.75F, -18.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[142].setRotationPoint(47.75F, -18.5F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[143].setRotationPoint(45F, -20F, -7.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 182
		bodyModel[144].setRotationPoint(46F, -22F, -2.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 183
		bodyModel[145].setRotationPoint(24F, -20F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 184
		bodyModel[146].setRotationPoint(24F, -20F, 8F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 398
		bodyModel[147].setRotationPoint(45.5F, -20.25F, -7.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[148].setRotationPoint(45.5F, -20.25F, 6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[149].setRotationPoint(46.5F, -22.75F, -0.5F);

		bodyModel[150].addShapeBox(-1F, 0F, -4.75F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[150].setRotationPoint(45.8F, -18.5F, 7F);
		bodyModel[150].rotateAngleY = 0.50614548F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 190 cull markerlight
		bodyModel[151].setRotationPoint(45F, -16F, -7.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.15F, 0.05F, 0F, -0.15F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0.05F, 0F, -0.15F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 191 cull markerlight
		bodyModel[152].setRotationPoint(45F, -16F, 5.75F);

		bodyModel[153].addBox(0F, 0F, 0F, 22, 2, 14, 0F); // Box 96
		bodyModel[153].setRotationPoint(-26F, -23F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[154].setRotationPoint(-39F, -21F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[155].setRotationPoint(-39F, -21F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[156].setRotationPoint(-38F, -22.5F, 3F);

		bodyModel[157].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[157].setRotationPoint(-39F, -22F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[158].setRotationPoint(-38F, -22.5F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 282
		bodyModel[159].setRotationPoint(-39F, -22.5F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
		bodyModel[160].setRotationPoint(-39F, -22.5F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
		bodyModel[161].setRotationPoint(-27F, -22.5F, 3F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 368
		bodyModel[162].setRotationPoint(-39F, -21F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 286
		bodyModel[163].setRotationPoint(-27F, -22.5F, -9F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 370
		bodyModel[164].setRotationPoint(-27F, -21F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[165].setRotationPoint(-44F, -14F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 279
		bodyModel[166].setRotationPoint(-47.5F, -14F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 282
		bodyModel[167].setRotationPoint(-48.5F, -14F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 283
		bodyModel[168].setRotationPoint(-48.5F, -14F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 297
		bodyModel[169].setRotationPoint(-48.5F, -15.25F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 298
		bodyModel[170].setRotationPoint(-44F, -15.25F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 299
		bodyModel[171].setRotationPoint(-44F, -15.25F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1F, 0F, -0.5F, -1F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 300
		bodyModel[172].setRotationPoint(-47.5F, -15.25F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 1F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, 0F, 0.25F, 0F); // Box 301
		bodyModel[173].setRotationPoint(-47.5F, -15.25F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 302
		bodyModel[174].setRotationPoint(-48.5F, -15.25F, 0F);

		bodyModel[175].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[175].setRotationPoint(-38F, -20F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[176].setRotationPoint(-38F, -20F, 10F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[177].setRotationPoint(-27F, -20F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[178].setRotationPoint(-39F, -20F, -7F);

		bodyModel[179].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[179].setRotationPoint(-38.5F, -20F, -10.5F);

		bodyModel[180].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[180].setRotationPoint(-26.5F, -20F, 10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[181].setRotationPoint(-40.5F, -21.75F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[182].setRotationPoint(-40.75F, -21.75F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[183].setRotationPoint(-40.75F, -19.75F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117 numberboard
		bodyModel[184].setRotationPoint(-40.6F, -21.25F, -1F);
		bodyModel[184].rotateAngleY = 0.25307274F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 118 numberboard
		bodyModel[185].setRotationPoint(-40.6F, -21.25F, 1F);
		bodyModel[185].rotateAngleY = -0.25307274F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 43
		bodyModel[186].setRotationPoint(-40F, -21.25F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 175
		bodyModel[187].setRotationPoint(-40F, -21.25F, 1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[188].setRotationPoint(-40.5F, -18F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[189].setRotationPoint(-40.5F, -22.5F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 299
		bodyModel[190].setRotationPoint(-39.75F, -21.25F, -8F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 301 markerlight glow
		bodyModel[191].setRotationPoint(-39.5F, -21F, -7.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 302
		bodyModel[192].setRotationPoint(-39.75F, -21.25F, 6F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 303 markerlight glow
		bodyModel[193].setRotationPoint(-39.5F, -21F, 6.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[194].setRotationPoint(-39F, -6F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[195].setRotationPoint(-42F, -6F, -11F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[196].setRotationPoint(-43F, -6F, -11F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 210
		bodyModel[197].setRotationPoint(-43F, -4F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[198].setRotationPoint(-42F, -6F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight nose
		bodyModel[199].setRotationPoint(-49.1F, -14.5F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 353 headlight nose
		bodyModel[200].setRotationPoint(-49.1F, -14.5F, -2F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 354
		bodyModel[201].setRotationPoint(-48.4F, -14.5F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[202].setRotationPoint(-47F, -14.8F, -5.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[203].setRotationPoint(-47F, -14.8F, 1.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[204].setRotationPoint(-47F, -14.8F, 5.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 220
		bodyModel[205].setRotationPoint(-47F, -14.8F, -5.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[206].setRotationPoint(-48F, -11.5F, -5.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 222
		bodyModel[207].setRotationPoint(-48F, -11.5F, -5.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[208].setRotationPoint(-48F, -11.5F, 5.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[209].setRotationPoint(-48F, -11.5F, 1.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[210].setRotationPoint(-37F, -18.5F, -11F);
		bodyModel[210].rotateAngleX = -0.61086524F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[211].setRotationPoint(-37F, -18.5F, 11F);
		bodyModel[211].rotateAngleX = 0.61086524F;

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18 late stack
		bodyModel[212].setRotationPoint(15.5F, -23.5F, -3F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 21 late stack
		bodyModel[213].setRotationPoint(15F, -22.5F, -3.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 405 EXTRA STACC
		bodyModel[214].setRotationPoint(15.5F, -24.5F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[215].setRotationPoint(-26F, -6F, 7F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 232
		bodyModel[216].setRotationPoint(-14F, -4F, 7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[217].setRotationPoint(-45.5F, -14F, 7.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[218].setRotationPoint(-43.5F, -12F, 6.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[219].setRotationPoint(-47.5F, -15F, -1F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 258
		bodyModel[220].setRotationPoint(-46F, -10F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[221].setRotationPoint(-47.01F, -7F, -11.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[222].setRotationPoint(-47.01F, -10F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[223].setRotationPoint(-44F, -10F, -11.01F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[224].setRotationPoint(-42F, -14F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 246
		bodyModel[225].setRotationPoint(-46F, -10F, 11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[226].setRotationPoint(-47.01F, -7F, 10.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 248
		bodyModel[227].setRotationPoint(-47.01F, -10F, 9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[228].setRotationPoint(-44F, -10F, 11.01F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[229].setRotationPoint(-42F, -14F, 11F);

		bodyModel[230].addBox(0F, 0F, 0F, 72, 8, 0, 0F); // Box 251
		bodyModel[230].setRotationPoint(-26F, -10F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 252
		bodyModel[231].setRotationPoint(47.01F, -7F, -11.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 253
		bodyModel[232].setRotationPoint(47.01F, -10F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 247
		bodyModel[233].setRotationPoint(50.5F, -10F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 248
		bodyModel[234].setRotationPoint(50F, -10F, -5F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 249
		bodyModel[235].setRotationPoint(50F, -10F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[236].setRotationPoint(50F, -10F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 251
		bodyModel[237].setRotationPoint(50F, -10F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[238].setRotationPoint(50F, -9F, 7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 253
		bodyModel[239].setRotationPoint(50F, -10F, 9F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 254
		bodyModel[240].setRotationPoint(50F, -3F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[241].setRotationPoint(50F, -9F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 256
		bodyModel[242].setRotationPoint(50F, -10F, -8F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 257
		bodyModel[243].setRotationPoint(50F, -3F, -11F);

		bodyModel[244].addShapeBox(-1.1F, 0F, -4.75F, 1, 2, 5, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 254
		bodyModel[244].setRotationPoint(45.8F, -18.5F, 7F);
		bodyModel[244].rotateAngleY = 0.50614548F;

		bodyModel[245].addShapeBox(-1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[245].setRotationPoint(45.8F, -18.5F, -7F);
		bodyModel[245].rotateAngleY = -0.50614548F;

		bodyModel[246].addShapeBox(-1.1F, 0F, -0.25F, 1, 2, 5, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 258
		bodyModel[246].setRotationPoint(45.8F, -18.5F, -7F);
		bodyModel[246].rotateAngleY = -0.50614548F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[247].setRotationPoint(-14.5F, -22.5F, 6.1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[248].setRotationPoint(-14.5F, -22.5F, -7.1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 22, 10, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 261
		bodyModel[249].setRotationPoint(-25.5F, -22.5F, -7.01F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[250].setRotationPoint(27F, -19F, -7.9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[251].setRotationPoint(34.5F, -19F, -7.9F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[252].setRotationPoint(27F, -13F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[253].setRotationPoint(32F, -13F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[254].setRotationPoint(29.5F, -9F, -8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[255].setRotationPoint(39.5F, -13F, -8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[256].setRotationPoint(24F, -8F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[257].setRotationPoint(27F, -19F, 6.9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[258].setRotationPoint(34.5F, -19F, 6.9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[259].setRotationPoint(27F, -13F, 7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[260].setRotationPoint(32F, -13F, 7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[261].setRotationPoint(29.5F, -9F, 7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[262].setRotationPoint(24F, -8F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[263].setRotationPoint(24F, -13F, 7F);

		bodyModel[264].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 277
		bodyModel[264].setRotationPoint(-10F, -10F, 11F);

		bodyModel[265].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 278
		bodyModel[265].setRotationPoint(47.01F, -10F, 9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[266].setRotationPoint(47.01F, -7F, 10.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,-2F, 4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -4F, 0F); // Box 280
		bodyModel[267].setRotationPoint(-15F, -10F, 11.01F);

		bodyModel[268].addBox(0F, 0F, 0F, 13, 8, 0, 0F); // Box 281
		bodyModel[268].setRotationPoint(-26F, -14F, 11F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 282
		bodyModel[269].setRotationPoint(-14F, -6F, 11F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 283 coal stacc
		bodyModel[270].setRotationPoint(16F, -24F, -2.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 284 coal box
		bodyModel[271].setRotationPoint(19F, -23.5F, -8F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[272].setRotationPoint(6.5F, -23F, -6.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[273].setRotationPoint(5F, -23.75F, -5.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[274].setRotationPoint(4F, -24F, -6.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[275].setRotationPoint(6F, -23.75F, -7.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[276].setRotationPoint(-37F, -23.5F, 7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[277].setRotationPoint(-37F, -23.5F, 7.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[278].setRotationPoint(-37F, -23.5F, 7.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[279].setRotationPoint(-37F, -23.5F, 7.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[280].setRotationPoint(-37.5F, -22F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[281].setRotationPoint(-37F, -23F, 7.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[282].setRotationPoint(-46.5F, -14.75F, 4F);

		bodyModel[283].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[283].setRotationPoint(-40.25F, -23F, -0.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[284].setRotationPoint(-40.25F, -23F, -0.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[285].setRotationPoint(-39F, -23.5F, -3F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[286].setRotationPoint(-39F, -23.5F, -3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[287].setRotationPoint(-39F, -23.5F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[288].setRotationPoint(-39F, -23.5F, -3F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[289].setRotationPoint(-39F, -23F, -3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[290].setRotationPoint(-33F, -22.5F, 6F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[291].setRotationPoint(-33F, -22.5F, -6F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[292].setRotationPoint(-30F, -23F, 0F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[293].setRotationPoint(16F, -22F, -6.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[294].setRotationPoint(14F, -23F, -5.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[295].setRotationPoint(15F, -23F, -7.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[296].setRotationPoint(16F, -23F, -6.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[297].setRotationPoint(-36.5F, -23.5F, -4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[298].setRotationPoint(-38.5F, -23F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[299].setRotationPoint(-38.5F, -23.5F, -7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[300].setRotationPoint(-38.5F, -23.5F, -7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[301].setRotationPoint(-38.5F, -23.5F, -7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[302].setRotationPoint(-38.5F, -23.5F, -7F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 355 support cull
		bodyModel[303].setRotationPoint(-38.5F, -22F, -7F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[304].setRotationPoint(45.25F, -24.25F, 1.75F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[305].setRotationPoint(46.25F, -24.25F, 2.75F);

		bodyModel[306].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[306].setRotationPoint(46.25F, -24.25F, 0.75F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[307].setRotationPoint(46.25F, -23.25F, 1.25F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 326
		bodyModel[308].setRotationPoint(-47F, -10F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[309].setRotationPoint(-47F, -10F, 11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[310].setRotationPoint(46F, -10F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[311].setRotationPoint(46F, -10F, 11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[312].setRotationPoint(-51F, -1F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[313].setRotationPoint(-51F, -1F, 4F);

		bodyModel[314].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 440 honse m-2
		bodyModel[314].setRotationPoint(-50.25F, 0F, -5.5F);
		bodyModel[314].rotateAngleZ = -0.31415927F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[315].setRotationPoint(-50F, -5F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[316].setRotationPoint(-50F, -5F, 4F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[317].setRotationPoint(-50.25F, -5F, -6F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[318].setRotationPoint(-50.25F, -5F, 4F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101 cull
		bodyModel[319].setRotationPoint(-51F, 1F, -7.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f d
		bodyModel[320].setRotationPoint(-51.25F, 1F, -7.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444 cull
		bodyModel[321].setRotationPoint(-51F, 1F, 5.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f d
		bodyModel[322].setRotationPoint(-51.25F, 1F, 5.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[323].setRotationPoint(-33F, -23F, 0F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[324].setRotationPoint(6F, -23.5F, -0.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[325].setRotationPoint(7F, -23.25F, 0.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[326].setRotationPoint(6.5F, -23.25F, -1.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[327].setRotationPoint(8.5F, -22.5F, -0.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 443
		bodyModel[328].setRotationPoint(7.5F, -24.25F, 0.25F);

		bodyModel[329].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 444
		bodyModel[329].setRotationPoint(7.5F, -24.25F, -1.25F);

		bodyModel[330].addBox(0F, 0F, 0F, 0, 7, 7, 0F); // Box 348 chains
		bodyModel[330].setRotationPoint(-51F, -9F, -3.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0.5F, 36, 1, 19, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -9.4F, 0F, 0F, -9.4F); // Box 547
		bodyModel[331].setRotationPoint(27F, -23.38F, 1F);
		bodyModel[331].rotateAngleX = -0.13613568F;

		bodyModel[332].addShapeBox(0F, 0F, -19.5F, 36, 1, 19, 0F,0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.4F, -18F, 0F, -9.4F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[332].setRotationPoint(27F, -23.38F, -1F);
		bodyModel[332].rotateAngleX = 0.13613568F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glow markerlight crl
		bodyModel[333].setRotationPoint(44.4F, -16F, -7.8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 345 glow markerlight crl
		bodyModel[334].setRotationPoint(44.4F, -16F, 5.8F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[335].setRotationPoint(-28F, -23.5F, 5F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[336].setRotationPoint(-28F, -23.5F, -5F);

		bodyModel[337].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 348 glow markerlight sou
		bodyModel[337].setRotationPoint(45.25F, -16F, 5.8F);
		bodyModel[337].rotateAngleY = 0.52359878F;

		bodyModel[338].addShapeBox(-0.25F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349 sou markerlight glow
		bodyModel[338].setRotationPoint(45.25F, -16F, -6.2F);
		bodyModel[338].rotateAngleY = -0.52359878F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 350
		bodyModel[339].setRotationPoint(49.5F, -1F, 4F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351
		bodyModel[340].setRotationPoint(49.5F, -1F, -6F);

		bodyModel[341].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[341].setRotationPoint(50.25F, 0F, -5.5F);
		bodyModel[341].rotateAngleZ = 0.31415927F;

		bodyModel[342].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 353
		bodyModel[342].setRotationPoint(50F, 1F, 5.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 354 ditchlight r d
		bodyModel[343].setRotationPoint(50.25F, 1F, 5.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 355 ditchlight r d
		bodyModel[344].setRotationPoint(50.25F, 1F, -7.5F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 356
		bodyModel[345].setRotationPoint(50F, 1F, -7.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[346].setRotationPoint(-15F, 2.5F, 7.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[347].setRotationPoint(-15F, 1.5F, 7.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[348].setRotationPoint(-14.75F, 3F, 7.75F);

		bodyModel[349].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[349].setRotationPoint(-15F, 0.5F, 7.1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[350].setRotationPoint(-42.25F, -20F, -0.25F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[351].setRotationPoint(-42.5F, -20.5F, -0.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[352].setRotationPoint(-42.5F, -21.5F, -0.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[353].setRotationPoint(-42.5F, -21.5F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 365 ditchlight r
		bodyModel[354].setRotationPoint(49.25F, -5F, 4F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[355].setRotationPoint(49F, -5F, 4F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ditchlight r
		bodyModel[356].setRotationPoint(49.25F, -5F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 368
		bodyModel[357].setRotationPoint(49F, -5F, -6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[358].setRotationPoint(-46.5F, -14.75F, -5F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 300
		bodyModel[359].setRotationPoint(-51F, -10F, -2F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 301
		bodyModel[360].setRotationPoint(-51F, -10F, 2F);

		bodyModel[361].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[361].setRotationPoint(-50F, -1F, -2F);
		bodyModel[361].rotateAngleZ = -1.48352986F;

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[362].setRotationPoint(-31.8F, -16F, 1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[363].setRotationPoint(-38.5F, -14F, 3F);
		bodyModel[363].rotateAngleY = -0.45378561F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[364].setRotationPoint(-38.5F, -16F, 3F);
		bodyModel[364].rotateAngleY = -0.45378561F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[365].setRotationPoint(-38.5F, -10F, 3F);
		bodyModel[365].rotateAngleY = -0.45378561F;

		bodyModel[366].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[366].setRotationPoint(-38F, -19F, 6.5F);
		bodyModel[366].rotateAngleY = 0.17453293F;

		bodyModel[367].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[367].setRotationPoint(-35F, -18.25F, 3F);
		bodyModel[367].rotateAngleY = 0.78539816F;

		bodyModel[368].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[368].setRotationPoint(-35F, -18.25F, 3F);
		bodyModel[368].rotateAngleY = 0.78539816F;

		bodyModel[369].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[369].setRotationPoint(-38F, -14F, -4.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 412 cab signalling glowey
		bodyModel[370].setRotationPoint(-38F, -21F, -0.5F);
		bodyModel[370].rotateAngleY = 0.43633231F;

		bodyModel[371].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 325
		bodyModel[371].setRotationPoint(50F, -10F, -2F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 10, 0, 0F); // Box 326
		bodyModel[372].setRotationPoint(50F, -10F, 2F);

		bodyModel[373].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover sou
		bodyModel[373].setRotationPoint(50F, -1F, 2F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[374].setRotationPoint(45.75F, -13.5F, 5.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 22, 3, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[375].setRotationPoint(-25.5F, -17F, 7.01F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 383
		bodyModel[376].setRotationPoint(15F, 0.5F, 7.1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[377].setRotationPoint(15F, 1.5F, 7.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 385
		bodyModel[378].setRotationPoint(15F, 2.5F, 7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 386
		bodyModel[379].setRotationPoint(15.25F, 3F, 7.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[380].setRotationPoint(39.5F, -13F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 387
		bodyModel[381].setRotationPoint(15.5F, 2F, -6.5F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 15, 12, 0F); // Box 530 not a fridge
		bodyModel[382].setRotationPoint(-28F, -21F, -6F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight front 2
		bodyModel[383].setRotationPoint(-49.1F, -12.5F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[384].setRotationPoint(-49.1F, -14.5F, -1F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 311
		bodyModel[385].setRotationPoint(-48.35F, -14.5F, -1F);

		bodyModel[386].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[386].setRotationPoint(-39F, -24F, -2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 cull
		bodyModel[387].setRotationPoint(-39.75F, -24F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 cull
		bodyModel[388].setRotationPoint(-39.75F, -24F, -2F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 396 headlight r
		bodyModel[389].setRotationPoint(47.9F, -20.5F, -1F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 397
		bodyModel[390].setRotationPoint(47.65F, -22.5F, -1F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 headlight r
		bodyModel[391].setRotationPoint(47.9F, -22.5F, -1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[392].setRotationPoint(-44F, -14F, 6F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[393].setRotationPoint(-40F, -14F, 6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[394].setRotationPoint(-42F, -6F, 6F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[395].setRotationPoint(-42F, -14F, 6F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[396].setRotationPoint(-41.5F, -12.5F, 6F);

		bodyModel[397].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[397].setRotationPoint(-41F, -10.5F, 6F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[398].setRotationPoint(-42F, -13F, 6F);

		bodyModel[399].addBox(-2F, 0F, 0F, 3, 1, 4, 0F); // Box 403 cull crossover cR
		bodyModel[399].setRotationPoint(51F, -2F, 2F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Box 193
		bodyModel[400].setRotationPoint(-50F, 1F, -3F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 2F, 0F); // Box 273
		bodyModel[401].setRotationPoint(45F, 1F, -3F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 408 lot of little pipes 3b
		bodyModel[402].setRotationPoint(23F, 0F, -10.5F);
		bodyModel[402].rotateAngleY = 1.57079633F;
		bodyModel[402].rotateAngleZ = -0.31415927F;

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 409 lot of little pipes 3c
		bodyModel[403].setRotationPoint(41F, 0F, -10.5F);
		bodyModel[403].rotateAngleY = 1.57079633F;
		bodyModel[403].rotateAngleZ = -0.31415927F;

		bodyModel[404].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 570 mma mirrors
		bodyModel[404].setRotationPoint(-36F, -17F, -11.75F);
		bodyModel[404].rotateAngleY = 0.52359878F;

		bodyModel[405].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570 mma mirrors
		bodyModel[405].setRotationPoint(-36F, -17F, -10.75F);

		bodyModel[406].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[406].setRotationPoint(-35F, -17F, -12F);

		bodyModel[407].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 408
		bodyModel[407].setRotationPoint(-35F, -17F, 11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[408].setRotationPoint(-35F, -18F, 10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[409].setRotationPoint(-35F, -19F, 10F);

		bodyModel[410].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[410].setRotationPoint(-36F, -21.5F, -9.5F);

		bodyModel[411].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[411].setRotationPoint(-36F, -21.5F, 6.5F);

		bodyModel[412].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[412].setRotationPoint(-35.5F, -22.5F, -8F);

		bodyModel[413].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[413].setRotationPoint(-35.5F, -22.5F, 8F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551 ditchlight f mccloud
		bodyModel[414].setRotationPoint(-52.1F, -2.75F, 3.75F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 550 ditchlight f mccloud
		bodyModel[415].setRotationPoint(-52.1F, -2.75F, -5.75F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[416].setRotationPoint(-51.8F, -2.75F, 3.75F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[417].setRotationPoint(-51.8F, -2.75F, -5.75F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 555 ditchlight r mccloud
		bodyModel[418].setRotationPoint(50F, -3F, -5.75F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 554 ditchlight r mccloud
		bodyModel[419].setRotationPoint(50F, -3F, 3.75F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[420].setRotationPoint(50F, -3F, 3.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[421].setRotationPoint(50F, -3F, -5.75F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[422].setRotationPoint(-53F, 4F, 2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[423].setRotationPoint(-53.5F, 4F, -10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[424].setRotationPoint(-53F, 5F, 2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[425].setRotationPoint(-53F, 5F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -5.125F, 0.125F, -0.125F, -5.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -0.125F, 0.125F, -5.125F, -5.125F, 0.125F, -5.125F, -5.125F); // Box 431 backpannel bulgy bit
		bodyModel[426].setRotationPoint(-28F, -20.5F, 0.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[427].setRotationPoint(-31F, -26.5F, 1F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 27, 2, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 428 cnrc circumsized fueltank
		bodyModel[428].setRotationPoint(-13.5F, 5F, -9F);
	}

	ModelFB3_new theTrucks2 = new ModelFB3_new();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 843) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_greygray.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.9325, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.875, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb3_new_earliie_silvers.png"));
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