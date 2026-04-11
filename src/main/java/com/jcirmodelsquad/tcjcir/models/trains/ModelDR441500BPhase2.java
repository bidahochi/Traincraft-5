//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.08.2020 - 23:40:24
// Last changed on: 21.08.2020 - 23:40:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

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

public class ModelDR441500BPhase2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDR441500BPhase2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[282];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 294, 88, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 465, 133, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 446, 127, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 296, 113, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 330, 134, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 408, 134, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 446, 79, textureX, textureY); // Box 120
		bodyModel[7] = new ModelRendererTurbo(this, 443, 14, textureX, textureY); // Box 481
		bodyModel[8] = new ModelRendererTurbo(this, 278, 85, textureX, textureY); // Box 120
		bodyModel[9] = new ModelRendererTurbo(this, 278, 39, textureX, textureY); // Box 481
		bodyModel[10] = new ModelRendererTurbo(this, 494, 84, textureX, textureY); // Box 120
		bodyModel[11] = new ModelRendererTurbo(this, 468, 84, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 409, 140, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 409, 127, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 331, 140, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 331, 127, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 262, 126, textureX, textureY); // Box 114
		bodyModel[17] = new ModelRendererTurbo(this, 262, 123, textureX, textureY); // Box 74
		bodyModel[18] = new ModelRendererTurbo(this, 262, 129, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 425, 127, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 277, 64, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 314, 66, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 277, 18, textureX, textureY); // Box 61
		bodyModel[23] = new ModelRendererTurbo(this, 314, 20, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 446, 22, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 382, 64, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 380, 71, textureX, textureY); // Rear side door L
		bodyModel[27] = new ModelRendererTurbo(this, 391, 70, textureX, textureY); // Box 79
		bodyModel[28] = new ModelRendererTurbo(this, 377, 70, textureX, textureY); // Box 80
		bodyModel[29] = new ModelRendererTurbo(this, 470, 30, textureX, textureY); // Rear door
		bodyModel[30] = new ModelRendererTurbo(this, 487, 22, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 457, 10, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 477, 20, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 467, 10, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 477, 10, textureX, textureY); // Box 80
		bodyModel[35] = new ModelRendererTurbo(this, 71, 61, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 70, 68, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 88
		bodyModel[38] = new ModelRendererTurbo(this, 471, 85, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 471, 100, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 489, 100, textureX, textureY); // Box 99
		bodyModel[41] = new ModelRendererTurbo(this, 471, 97, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 476, 2, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 461, 1, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[45] = new ModelRendererTurbo(this, 288, 70, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 274, 70, textureX, textureY); // Box 80
		bodyModel[47] = new ModelRendererTurbo(this, 288, 24, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 274, 24, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 277, 71, textureX, textureY); // Front side door L
		bodyModel[50] = new ModelRendererTurbo(this, 277, 25, textureX, textureY); // Front side door R
		bodyModel[51] = new ModelRendererTurbo(this, 152, 222, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 181, 224, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 159, 217, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 160, 205, textureX, textureY); // Box 138
		bodyModel[55] = new ModelRendererTurbo(this, 501, 66, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 457, 66, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 494, 66, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 464, 66, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 473, 63, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 471, 72, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 505, 51, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[62] = new ModelRendererTurbo(this, 209, 75, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 207, 70, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 210, 78, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 208, 21, textureX, textureY); // Box 169
		bodyModel[66] = new ModelRendererTurbo(this, 206, 24, textureX, textureY); // Box 170
		bodyModel[67] = new ModelRendererTurbo(this, 209, 18, textureX, textureY); // Box 171
		bodyModel[68] = new ModelRendererTurbo(this, 189, 42, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 203, 61, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 203, 37, textureX, textureY); // Box 182
		bodyModel[71] = new ModelRendererTurbo(this, 159, 27, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 159, 23, textureX, textureY); // Box 0 exhaust
		bodyModel[73] = new ModelRendererTurbo(this, 380, 193, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 385, 205, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 382, 186, textureX, textureY); // Box 394
		bodyModel[76] = new ModelRendererTurbo(this, 421, 186, textureX, textureY); // Box 394
		bodyModel[77] = new ModelRendererTurbo(this, 318, 216, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 326, 196, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 337, 204, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 340, 204, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 343, 204, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 346, 204, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 352, 204, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 355, 204, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 358, 204, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 286, 184, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 297, 187, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 323, 210, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 308, 184, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 319, 187, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 330, 184, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 341, 187, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 352, 184, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 394
		bodyModel[97] = new ModelRendererTurbo(this, 304, 168, textureX, textureY); // Box 394
		bodyModel[98] = new ModelRendererTurbo(this, 354, 179, textureX, textureY); // Box 394
		bodyModel[99] = new ModelRendererTurbo(this, 406, 225, textureX, textureY); // Box 394
		bodyModel[100] = new ModelRendererTurbo(this, 415, 231, textureX, textureY); // Box 394
		bodyModel[101] = new ModelRendererTurbo(this, 415, 224, textureX, textureY); // Box 394
		bodyModel[102] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 394
		bodyModel[103] = new ModelRendererTurbo(this, 393, 215, textureX, textureY); // Box 394
		bodyModel[104] = new ModelRendererTurbo(this, 427, 180, textureX, textureY); // Box 169
		bodyModel[105] = new ModelRendererTurbo(this, 442, 200, textureX, textureY); // Box 169
		bodyModel[106] = new ModelRendererTurbo(this, 442, 175, textureX, textureY); // Box 439
		bodyModel[107] = new ModelRendererTurbo(this, 439, 158, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 438, 166, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 438, 149, textureX, textureY); // Box 103
		bodyModel[110] = new ModelRendererTurbo(this, 381, 212, textureX, textureY); // Box 394
		bodyModel[111] = new ModelRendererTurbo(this, 381, 224, textureX, textureY); // Box 394
		bodyModel[112] = new ModelRendererTurbo(this, 422, 216, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 468, 208, textureX, textureY); // Box 394
		bodyModel[114] = new ModelRendererTurbo(this, 244, 220, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 244, 203, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 205, 229, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 309, 225, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 204, 222, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 206, 212, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 208, 218, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 208, 208, textureX, textureY); // Box 757
		bodyModel[122] = new ModelRendererTurbo(this, 197, 215, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 199, 209, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 190, 215, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 265, 171, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 267, 203, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 268, 208, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 228, 221, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 235, 214, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 194, 211, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 195, 223, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 235, 220, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 219, 220, textureX, textureY); // Box 471
		bodyModel[135] = new ModelRendererTurbo(this, 231, 207, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 222, 209, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 215, 202, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 215, 207, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 222, 199, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 265, 184, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 266, 194, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 288, 189, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 244, 237, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 279, 193, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 242, 192, textureX, textureY); // Box 394
		bodyModel[148] = new ModelRendererTurbo(this, 227, 190, textureX, textureY); // Box 394
		bodyModel[149] = new ModelRendererTurbo(this, 287, 167, textureX, textureY); // Box 394
		bodyModel[150] = new ModelRendererTurbo(this, 274, 170, textureX, textureY); // Box 394
		bodyModel[151] = new ModelRendererTurbo(this, 274, 175, textureX, textureY); // Box 394
		bodyModel[152] = new ModelRendererTurbo(this, 495, 51, textureX, textureY, "lamp"); // backing light type 3
		bodyModel[153] = new ModelRendererTurbo(this, 500, 48, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[154] = new ModelRendererTurbo(this, 88, 45, textureX, textureY); // Box 80
		bodyModel[155] = new ModelRendererTurbo(this, 81, 46, textureX, textureY); // Box 80
		bodyModel[156] = new ModelRendererTurbo(this, 76, 45, textureX, textureY); // Box 409 commander base
		bodyModel[157] = new ModelRendererTurbo(this, 76, 41, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[158] = new ModelRendererTurbo(this, 251, 187, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 73, 48, textureX, textureY); // Box 336
		bodyModel[160] = new ModelRendererTurbo(this, 346, 127, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 346, 149, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 333, 149, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 336, 154, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[164] = new ModelRendererTurbo(this, 393, 149, textureX, textureY); // Box 343
		bodyModel[165] = new ModelRendererTurbo(this, 396, 154, textureX, textureY); // Box 344
		bodyModel[166] = new ModelRendererTurbo(this, 421, 56, textureX, textureY); // Box 120
		bodyModel[167] = new ModelRendererTurbo(this, 396, 40, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[168] = new ModelRendererTurbo(this, 421, 42, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[169] = new ModelRendererTurbo(this, 380, 18, textureX, textureY); // Box 348
		bodyModel[170] = new ModelRendererTurbo(this, 380, 25, textureX, textureY); // Rear side door R
		bodyModel[171] = new ModelRendererTurbo(this, 394, 66, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 394, 20, textureX, textureY); // Box 62
		bodyModel[173] = new ModelRendererTurbo(this, 421, 39, textureX, textureY); // Box 481
		bodyModel[174] = new ModelRendererTurbo(this, 391, 24, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 377, 24, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 445, 72, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[177] = new ModelRendererTurbo(this, 442, 7, textureX, textureY); // Box 360
		bodyModel[178] = new ModelRendererTurbo(this, 361, 39, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 361, 7, textureX, textureY); // Box 343
		bodyModel[180] = new ModelRendererTurbo(this, 423, 206, textureX, textureY); // Box 169
		bodyModel[181] = new ModelRendererTurbo(this, 442, 242, textureX, textureY); // Box 169
		bodyModel[182] = new ModelRendererTurbo(this, 442, 239, textureX, textureY); // Box 169
		bodyModel[183] = new ModelRendererTurbo(this, 442, 232, textureX, textureY); // Box 347
		bodyModel[184] = new ModelRendererTurbo(this, 442, 229, textureX, textureY); // Box 348
		bodyModel[185] = new ModelRendererTurbo(this, 469, 234, textureX, textureY); // Box 169
		bodyModel[186] = new ModelRendererTurbo(this, 473, 243, textureX, textureY); // Box 169
		bodyModel[187] = new ModelRendererTurbo(this, 473, 229, textureX, textureY); // Box 351
		bodyModel[188] = new ModelRendererTurbo(this, 360, 50, textureX, textureY, "cull"); // Box 0 cull
		bodyModel[189] = new ModelRendererTurbo(this, 314, 8, textureX, textureY, "cull"); // Box 378 cull
		bodyModel[190] = new ModelRendererTurbo(this, 310, 40, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[191] = new ModelRendererTurbo(this, 335, 42, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[192] = new ModelRendererTurbo(this, 181, 191, textureX, textureY); // Box 383
		bodyModel[193] = new ModelRendererTurbo(this, 158, 210, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 428, 231, textureX, textureY); // Box 0
		bodyModel[195] = new ModelRendererTurbo(this, 488, 225, textureX, textureY); // Box 0
		bodyModel[196] = new ModelRendererTurbo(this, 392, 225, textureX, textureY); // Box 394
		bodyModel[197] = new ModelRendererTurbo(this, 393, 228, textureX, textureY); // Box 394
		bodyModel[198] = new ModelRendererTurbo(this, 392, 212, textureX, textureY); // Box 394
		bodyModel[199] = new ModelRendererTurbo(this, 407, 230, textureX, textureY); // Box 394
		bodyModel[200] = new ModelRendererTurbo(this, 181, 216, textureX, textureY); // Box 394
		bodyModel[201] = new ModelRendererTurbo(this, 182, 221, textureX, textureY); // Box 394
		bodyModel[202] = new ModelRendererTurbo(this, 413, 216, textureX, textureY); // Box 394
		bodyModel[203] = new ModelRendererTurbo(this, 414, 221, textureX, textureY); // Box 394
		bodyModel[204] = new ModelRendererTurbo(this, 207, 66, textureX, textureY); // Box 182
		bodyModel[205] = new ModelRendererTurbo(this, 206, 29, textureX, textureY); // Box 402
		bodyModel[206] = new ModelRendererTurbo(this, 206, 33, textureX, textureY, "cull"); // Box 402 cull
		bodyModel[207] = new ModelRendererTurbo(this, 70, 27, textureX, textureY); // Box 88
		bodyModel[208] = new ModelRendererTurbo(this, 66, 24, textureX, textureY); // Box 88
		bodyModel[209] = new ModelRendererTurbo(this, 344, 40, textureX, textureY, "lamp"); // Box 343 glow
		bodyModel[210] = new ModelRendererTurbo(this, 344, 57, textureX, textureY, "lamp"); // Box 454 glow
		bodyModel[211] = new ModelRendererTurbo(this, 76, 37, textureX, textureY); // Box 364 prime base
		bodyModel[212] = new ModelRendererTurbo(this, 76, 29, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[213] = new ModelRendererTurbo(this, 85, 33, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[214] = new ModelRendererTurbo(this, 85, 29, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[215] = new ModelRendererTurbo(this, 76, 33, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[216] = new ModelRendererTurbo(this, 48, 21, textureX, textureY); // Box 364 prime base
		bodyModel[217] = new ModelRendererTurbo(this, 39, 12, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[218] = new ModelRendererTurbo(this, 48, 17, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[219] = new ModelRendererTurbo(this, 48, 12, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[220] = new ModelRendererTurbo(this, 39, 17, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[221] = new ModelRendererTurbo(this, 46, 25, textureX, textureY, "cull"); // Box 364 cull
		bodyModel[222] = new ModelRendererTurbo(this, 73, 76, textureX, textureY); // Box 579
		bodyModel[223] = new ModelRendererTurbo(this, 245, 88, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 250, 133, textureX, textureY); // Box 1
		bodyModel[225] = new ModelRendererTurbo(this, 263, 127, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 282, 127, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 53, 140, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[228] = new ModelRendererTurbo(this, 63, 140, textureX, textureY, "lamp"); // backing light type 3
		bodyModel[229] = new ModelRendererTurbo(this, 58, 137, textureX, textureY, "lamp"); // backing light type 1
		bodyModel[230] = new ModelRendererTurbo(this, 16, 159, textureX, textureY); // Box 128
		bodyModel[231] = new ModelRendererTurbo(this, 34, 174, textureX, textureY); // Box 128
		bodyModel[232] = new ModelRendererTurbo(this, 16, 174, textureX, textureY); // Box 99
		bodyModel[233] = new ModelRendererTurbo(this, 16, 171, textureX, textureY); // Box 99
		bodyModel[234] = new ModelRendererTurbo(this, 2, 140, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 46, 140, textureX, textureY); // Box 128
		bodyModel[236] = new ModelRendererTurbo(this, 9, 140, textureX, textureY); // Box 128
		bodyModel[237] = new ModelRendererTurbo(this, 39, 140, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 18, 137, textureX, textureY); // Box 128
		bodyModel[239] = new ModelRendererTurbo(this, 16, 146, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 89, 182, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 36, 61, textureX, textureY); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 35, 68, textureX, textureY); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 35, 53, textureX, textureY); // Box 88
		bodyModel[244] = new ModelRendererTurbo(this, 38, 48, textureX, textureY); // Box 336
		bodyModel[245] = new ModelRendererTurbo(this, 38, 76, textureX, textureY); // Box 579
		bodyModel[246] = new ModelRendererTurbo(this, 1, 110, textureX, textureY); // Box 565
		bodyModel[247] = new ModelRendererTurbo(this, 22, 117, textureX, textureY); // Front door
		bodyModel[248] = new ModelRendererTurbo(this, 33, 110, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 22, 110, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 9, 90, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 46, 105, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box 80
		bodyModel[253] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 34, 81, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 6, 81, textureX, textureY); // Box 103
		bodyModel[256] = new ModelRendererTurbo(this, 291, 66, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 291, 20, textureX, textureY); // Box 62
		bodyModel[258] = new ModelRendererTurbo(this, 47, 184, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 78, 174, textureX, textureY); // Box 394
		bodyModel[260] = new ModelRendererTurbo(this, 78, 186, textureX, textureY); // Box 394
		bodyModel[261] = new ModelRendererTurbo(this, 53, 171, textureX, textureY); // Box 389
		bodyModel[262] = new ModelRendererTurbo(this, 53, 166, textureX, textureY); // Box 389
		bodyModel[263] = new ModelRendererTurbo(this, 62, 167, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 70, 167, textureX, textureY); // Box 0
		bodyModel[265] = new ModelRendererTurbo(this, 62, 171, textureX, textureY); // Box 389
		bodyModel[266] = new ModelRendererTurbo(this, 70, 172, textureX, textureY); // Box 0
		bodyModel[267] = new ModelRendererTurbo(this, 67, 166, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 53, 176, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 68, 176, textureX, textureY); // Box 394
		bodyModel[270] = new ModelRendererTurbo(this, 66, 33, textureX, textureY); // Box 88
		bodyModel[271] = new ModelRendererTurbo(this, 66, 30, textureX, textureY); // Box 88
		bodyModel[272] = new ModelRendererTurbo(this, 39, 158, textureX, textureY); // Box 120
		bodyModel[273] = new ModelRendererTurbo(this, 13, 158, textureX, textureY); // Box 43
		bodyModel[274] = new ModelRendererTurbo(this, 70, 162, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 62, 162, textureX, textureY); // Box 279
		bodyModel[276] = new ModelRendererTurbo(this, 66, 160, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 67, 163, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 9, 159, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 43, 159, textureX, textureY); // Box 567
		bodyModel[280] = new ModelRendererTurbo(this, 494, 60, textureX, textureY); // Box 128
		bodyModel[281] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Box 567

		bodyModel[0].addBox(0F, 0F, 0F, 71, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(34.5F, 2F, -3.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 71, 1, 12, 0F); // Box 0
		bodyModel[3].setRotationPoint(-35.5F, 2F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[4].setRotationPoint(-22.5F, 2.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 2
		bodyModel[5].setRotationPoint(19F, 2.5F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[6].setRotationPoint(32.5F, 2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[7].setRotationPoint(32.5F, 2F, 11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[8].setRotationPoint(-35.5F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[9].setRotationPoint(-35.5F, 2F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[10].setRotationPoint(36.5F, 2F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[11].setRotationPoint(36.5F, 2F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(20F, 2F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[13].setRotationPoint(20F, 2F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-21.5F, 2F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[16].setRotationPoint(-34F, 2.75F, 9.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[17].setRotationPoint(-34F, 2F, 9.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[18].setRotationPoint(-33.75F, 3F, 9.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(31.5F, 2F, -3.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[20].setRotationPoint(-35.5F, -17F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 0
		bodyModel[21].setRotationPoint(-21.5F, -17F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 61
		bodyModel[22].setRotationPoint(-35.5F, -17F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 30, 17, 1, 0F); // Box 62
		bodyModel[23].setRotationPoint(-21.5F, -17F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 0
		bodyModel[24].setRotationPoint(35.5F, -17F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[25].setRotationPoint(8.5F, -17F, -11F);

		bodyModel[26].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Rear side door L
		bodyModel[26].setRotationPoint(12.5F, -12F, -10F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 79
		bodyModel[27].setRotationPoint(13F, -10F, -12F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 80
		bodyModel[28].setRotationPoint(8F, -10F, -12F);

		bodyModel[29].addBox(0F, 0F, -4F, 1, 15, 4, 0F); // Rear door
		bodyModel[29].setRotationPoint(35.5F, -15F, 2F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 0
		bodyModel[30].setRotationPoint(35.5F, -17F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(35.5F, -19F, -8.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 0
		bodyModel[32].setRotationPoint(35.5F, -17F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[33].setRotationPoint(35.5F, -19F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[34].setRotationPoint(35.5F, -19F, 8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 62, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-25.5F, -22F, -2.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 62, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-25.5F, -22F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 62, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[37].setRotationPoint(-25.5F, -22F, 2.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[38].setRotationPoint(36.5F, 0F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[39].setRotationPoint(36.5F, 1F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[40].setRotationPoint(36.5F, 1F, 4F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[41].setRotationPoint(37.5F, 0F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(35.5F, -21F, -2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(35.5F, -21F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[44].setRotationPoint(35.5F, -21F, 2.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 79
		bodyModel[45].setRotationPoint(-31F, -10F, -12F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 80
		bodyModel[46].setRotationPoint(-36F, -10F, -12F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 108
		bodyModel[47].setRotationPoint(-31F, -10F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 109
		bodyModel[48].setRotationPoint(-36F, -10F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door L
		bodyModel[49].setRotationPoint(-35.5F, -12F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Front side door R
		bodyModel[50].setRotationPoint(-35.5F, -12F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 15, 10, 0F); // Box 0
		bodyModel[51].setRotationPoint(-21.5F, -20F, -5F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 21, 2, 0F); // Box 0
		bodyModel[52].setRotationPoint(-17.5F, -21F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[53].setRotationPoint(-21.5F, -21F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[54].setRotationPoint(-21.5F, -21F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(38F, -16F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[56].setRotationPoint(38F, -16F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[57].setRotationPoint(36.5F, -17F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[58].setRotationPoint(36.5F, -17F, -3.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[59].setRotationPoint(36.5F, -17.5F, -3.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(38F, -18F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[61].setRotationPoint(36.5F, -9F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.17F, 1F, 0F, -0.17F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[62].setRotationPoint(20.5F, -20F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 0
		bodyModel[63].setRotationPoint(20.5F, -20.5F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1F, -0.17F, 1F, -1F, -0.17F, 1F, -1F, 0.17F, 0F, -1F, 0.17F); // Box 0
		bodyModel[64].setRotationPoint(20.5F, -20F, -9.51F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -0.17F, 0F, 0F, -0.17F); // Box 169
		bodyModel[65].setRotationPoint(20.5F, -20F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[66].setRotationPoint(20.5F, -20.5F, 5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 2, 0, 0F,0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0.17F, 1F, -1F, 0.17F, 1F, -1F, -0.17F, 0F, -1F, -0.17F); // Box 171
		bodyModel[67].setRotationPoint(20.5F, -20F, 9.51F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 24, 0, 18, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -9F, 0F, 0F, -9F); // Box 0
		bodyModel[68].setRotationPoint(20.5F, -22.01F, -4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, -0.65F, 0F, -12F, -0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F, 0F, 0.65F, 0F, -12F, 0.65F, 0F, -12F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[69].setRotationPoint(20.5F, -22.01F, -4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 24, 0, 4, 0F,0F, 0F, -2F, -12F, 0F, -2F, -12F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, -12F, 0.65F, 0F, 0F, 0.65F, 0F); // Box 182
		bodyModel[70].setRotationPoint(20.5F, -22.01F, 0.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[71].setRotationPoint(-2.5F, -22.5F, -2F);

		bodyModel[72].addShapeBox(0F, -0.5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 exhaust
		bodyModel[72].setRotationPoint(-6.5F, -22F, 2.5F);
		bodyModel[72].rotateAngleX = -0.31415927F;

		bodyModel[73].addBox(0F, 0F, 0F, 19, 4, 7, 0F); // Box 0
		bodyModel[73].setRotationPoint(-2.5F, -4F, -3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 19, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(-2.5F, -4F, -5.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[75].setRotationPoint(-2.5F, -4F, 3.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[76].setRotationPoint(14.5F, -4F, 3.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(-2.5F, -13F, -3.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[78].setRotationPoint(-1.7F, -15F, -2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[79].setRotationPoint(-1.4F, -15F, -3.83F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[80].setRotationPoint(0.98F, -15F, -3.83F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[81].setRotationPoint(3.36F, -15F, -3.83F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[82].setRotationPoint(5.71F, -15F, -3.83F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(8.08F, -15F, -3.83F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(10.46F, -15F, -3.83F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(12.84F, -15F, -3.83F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(15.22F, -15F, -3.83F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[87].setRotationPoint(-1.7F, -17F, -3.83F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[88].setRotationPoint(0.68F, -17F, -3.83F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.34F, 0F, 0F, -0.34F); // Box 0
		bodyModel[89].setRotationPoint(-2.5F, -10F, -4.83F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[90].setRotationPoint(3.06F, -17F, -3.83F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[91].setRotationPoint(5.41F, -17F, -3.83F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[92].setRotationPoint(7.78F, -17F, -3.83F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[93].setRotationPoint(10.16F, -17F, -3.83F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[94].setRotationPoint(12.54F, -17F, -3.83F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.33F, 0F, 0F, 0.33F); // Box 0
		bodyModel[95].setRotationPoint(14.9F, -17F, -3.83F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 23, 5, 5, 0F,0F, 0F, 0F, -4.37F, 0F, 0F, -4.37F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -4.37F, -1F, 0F, -4.37F, -1F, -1F, 0F, -1F, -1F); // Box 394
		bodyModel[96].setRotationPoint(-4.5F, -15F, 2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[97].setRotationPoint(-2.5F, -17F, 2.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.63F, -0.25F, 0F, -0.63F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 394
		bodyModel[98].setRotationPoint(14.13F, -15F, 2.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 394
		bodyModel[99].setRotationPoint(21.5F, -3.5F, 0F);
		bodyModel[99].rotateAngleX = -0.78539816F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[100].setRotationPoint(23.5F, -3F, -2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[101].setRotationPoint(23.5F, -4F, -2.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[102].setRotationPoint(19.5F, -5.5F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[103].setRotationPoint(19.5F, -6.5F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[104].setRotationPoint(20.5F, -19F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[105].setRotationPoint(20.5F, -19F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[106].setRotationPoint(20.5F, -19F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(20.5F, -21F, -2.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(20.5F, -21F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[109].setRotationPoint(20.5F, -21F, 2.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[110].setRotationPoint(15F, -11F, 9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[111].setRotationPoint(15F, -11F, -10F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 0
		bodyModel[112].setRotationPoint(32.9F, -4F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[113].setRotationPoint(33.5F, -19.75F, -6F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 0
		bodyModel[114].setRotationPoint(-9F, -5F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[115].setRotationPoint(-9F, -9F, -6F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		bodyModel[116].setRotationPoint(-12F, -1F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[117].setRotationPoint(-4F, -3.7F, 0F);
		bodyModel[117].rotateAngleX = -0.78539816F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-12.5F, -2.3F, -2.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[119].setRotationPoint(-12.5F, -4.3F, -1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(-12.5F, -4.3F, -2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		bodyModel[121].setRotationPoint(-12.5F, -4.3F, 1.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[122].setRotationPoint(-12.5F, -7.3F, -1F);

		bodyModel[123].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[123].setRotationPoint(-11.5F, -3.3F, 2F);
		bodyModel[123].rotateAngleX = -1.10828408F;

		bodyModel[124].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[124].setRotationPoint(-11.5F, -3.3F, -2F);
		bodyModel[124].rotateAngleX = 1.10828408F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[125].setRotationPoint(-12.85F, -7.5F, -0.7F);
		bodyModel[125].rotateAngleY = 0.78539816F;

		bodyModel[126].addShapeBox(0F, -0.5F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[126].setRotationPoint(-6.5F, -20.5F, 2.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 0
		bodyModel[127].setRotationPoint(-9F, -11.21F, -4.79F);
		bodyModel[127].rotateAngleX = -0.78539816F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.47F, 0F, 0F, -0.47F); // Box 0
		bodyModel[128].setRotationPoint(-9F, -9.79F, -3.37F);
		bodyModel[128].rotateAngleX = -0.78539816F;

		bodyModel[129].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[129].setRotationPoint(-10F, -4F, -1F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 0
		bodyModel[130].setRotationPoint(-10F, -6F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[131].setRotationPoint(-11.1F, -3.5F, 4F);
		bodyModel[131].rotateAngleY = -0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[132].setRotationPoint(-10.4F, -3.5F, -4.7F);
		bodyModel[132].rotateAngleY = 0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		bodyModel[133].setRotationPoint(-10F, -4F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[134].setRotationPoint(-10F, -4F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[135].setRotationPoint(-10F, -9F, 1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		bodyModel[136].setRotationPoint(-10F, -9F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F); // Box 0
		bodyModel[137].setRotationPoint(-10F, -11.21F, -4.79F);
		bodyModel[137].rotateAngleX = -0.78539816F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0.445F, -0.15F, 0F, 0.445F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-10F, -9F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.145F, 0.435F, 0F, -0.145F, 0.435F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-10F, -11F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-10.5F, -2.99F, 0F);
		bodyModel[140].rotateAngleX = -0.78539816F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-8.5F, -16F, 2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[142].setRotationPoint(-8.5F, -14F, 0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-8.5F, -14F, 5.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-8.51F, -16F, 0.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[145].setRotationPoint(-9F, -1F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[146].setRotationPoint(-6.51F, -12F, 0.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[147].setRotationPoint(-9F, -15.37F, 4F);
		bodyModel[147].rotateAngleX = -0.78539816F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[148].setRotationPoint(-12F, -16.25F, 4F);
		bodyModel[148].rotateAngleX = -0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[149].setRotationPoint(-4.5F, -17F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[150].setRotationPoint(-8.5F, -17F, -0.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 394
		bodyModel[151].setRotationPoint(-8.5F, -15F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[152].setRotationPoint(36.5F, -9F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[153].setRotationPoint(36.5F, -20.5F, -1F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 80
		bodyModel[154].setRotationPoint(-21F, -24F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[155].setRotationPoint(-22F, -23F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[156].setRotationPoint(-24F, -23F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[157].setRotationPoint(-24F, -24F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[158].setRotationPoint(-4.49F, -16F, 0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 336
		bodyModel[159].setRotationPoint(-25.5F, -20F, 8F);

		bodyModel[160].addBox(0F, 0F, 0F, 15, 5, 16, 0F); // Box 0
		bodyModel[160].setRotationPoint(-7F, 2F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[161].setRotationPoint(-7F, 7F, -8F);

		bodyModel[162].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 0
		bodyModel[162].setRotationPoint(-5F, 3F, -9.59F);
		bodyModel[162].rotateAngleX = -0.78539816F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F); // Box 0 cull
		bodyModel[163].setRotationPoint(-3F, 2F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 343
		bodyModel[164].setRotationPoint(-5F, 3F, 9.59F);
		bodyModel[164].rotateAngleX = -0.78539816F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.415F, -0.175F, 0F, 0.415F, -0.175F, 0F, 0.415F, 0F, 0F, 0.415F, 0F); // Box 344
		bodyModel[165].setRotationPoint(-3F, 2F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[166].setRotationPoint(8.5F, 2F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[167].setRotationPoint(8F, 2F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[168].setRotationPoint(12.5F, 2F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 348
		bodyModel[169].setRotationPoint(8.5F, -17F, 10F);

		bodyModel[170].addShapeBox(-4F, 0F, -0.5F, 4, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear side door R
		bodyModel[170].setRotationPoint(12.5F, -12F, 10F);

		bodyModel[171].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 0
		bodyModel[171].setRotationPoint(12.5F, -17F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // Box 62
		bodyModel[172].setRotationPoint(12.5F, -17F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[173].setRotationPoint(8.5F, 2F, 11F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 0
		bodyModel[174].setRotationPoint(12.5F, -10F, 11F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 0
		bodyModel[175].setRotationPoint(8.5F, -10F, 11F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 355 cull
		bodyModel[176].setRotationPoint(32.5F, -4.5F, -12F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 360
		bodyModel[177].setRotationPoint(32.5F, -4.5F, 11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, -5F, 0F); // Box 0
		bodyModel[178].setRotationPoint(20.5F, -15.01F, -11.01F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 24, 10, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, -12F, -5F, 0F, 0F, -5F, 0F); // Box 343
		bodyModel[179].setRotationPoint(20.5F, -15.01F, 11.01F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 12, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[180].setRotationPoint(20.5F, -17F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		bodyModel[181].setRotationPoint(20.5F, -15F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		bodyModel[182].setRotationPoint(20.5F, -15F, -9.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[183].setRotationPoint(20.5F, -15F, 9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[184].setRotationPoint(20.5F, -15F, 8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[185].setRotationPoint(20.5F, -15F, -3.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[186].setRotationPoint(20.5F, -15F, -6.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 351
		bodyModel[187].setRotationPoint(20.5F, -15F, 3.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -5F, 0F, -11F, -5F, 0F, -11F, -5F, 0.02F, 0F, -5F, 0.02F); // Box 0 cull
		bodyModel[188].setRotationPoint(-3.5F, -15.01F, -11.01F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, 0F, 0.02F, -11F, 0F, 0.02F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.02F, -11F, -5F, 0.02F, -11F, -5F, 0F, 0F, -5F, 0F); // Box 378 cull
		bodyModel[189].setRotationPoint(-3.5F, -15.01F, 10.01F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[190].setRotationPoint(-36F, 2F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[191].setRotationPoint(-31.5F, 2F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 21, 2, 0F); // Box 383
		bodyModel[192].setRotationPoint(-17.5F, -21F, 3F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 0
		bodyModel[193].setRotationPoint(-21.5F, -21F, -2.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 0
		bodyModel[194].setRotationPoint(34.78F, -7F, -9.5F);
		bodyModel[194].rotateAngleY = 0.78539816F;

		bodyModel[195].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[195].setRotationPoint(34.79F, -17.5F, -1F);
		bodyModel[195].rotateAngleZ = -0.78539816F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[196].setRotationPoint(19.5F, -7F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[197].setRotationPoint(19.5F, -5F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[198].setRotationPoint(18.5F, -8F, 4.5F);
		bodyModel[198].rotateAngleY = -0.78539816F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[199].setRotationPoint(21.5F, -1F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 394
		bodyModel[200].setRotationPoint(-17.5F, -3.5F, 0F);
		bodyModel[200].rotateAngleX = -0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[201].setRotationPoint(-17.5F, -1F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 394
		bodyModel[202].setRotationPoint(22.5F, -6.66F, 0F);
		bodyModel[202].rotateAngleX = -0.78539816F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[203].setRotationPoint(22.5F, -4.5F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 182
		bodyModel[204].setRotationPoint(20.5F, -22F, 2.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 402
		bodyModel[205].setRotationPoint(20.5F, -22F, -4.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402 cull
		bodyModel[206].setRotationPoint(20.49F, -22.5F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[207].setRotationPoint(-28.5F, -23F, 0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[208].setRotationPoint(-30.5F, -24F, 0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343 glow
		bodyModel[209].setRotationPoint(-1.5F, -4.01F, 11.01F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 454 glow
		bodyModel[210].setRotationPoint(-1.5F, -4.01F, -11.01F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[211].setRotationPoint(-24.5F, -23F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[212].setRotationPoint(-24.5F, -23.5F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[213].setRotationPoint(-24.5F, -23.5F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[214].setRotationPoint(-24.5F, -23.5F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[215].setRotationPoint(-24.5F, -23.5F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[216].setRotationPoint(-29F, -22.25F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[217].setRotationPoint(-29F, -22.75F, 6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[218].setRotationPoint(-29F, -22.75F, 6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[219].setRotationPoint(-29F, -22.75F, 6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[220].setRotationPoint(-29F, -22.75F, 6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.085F, 0F, 0F, 0.085F, 0F); // Box 364 cull
		bodyModel[221].setRotationPoint(-29F, -21.25F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 62, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 579
		bodyModel[222].setRotationPoint(-25.5F, -20F, -11F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 0
		bodyModel[223].setRotationPoint(-36.5F, 0F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[224].setRotationPoint(-38.5F, 3F, -1.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[225].setRotationPoint(-35.5F, 2F, -3.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[226].setRotationPoint(-33.5F, 2F, -3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[227].setRotationPoint(-37F, -9F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 3
		bodyModel[228].setRotationPoint(-37F, -9F, -9F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // backing light type 1
		bodyModel[229].setRotationPoint(-37F, -21F, -1F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 128
		bodyModel[230].setRotationPoint(-37.5F, 0F, -5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[231].setRotationPoint(-37.5F, 1F, -5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[232].setRotationPoint(-37.5F, 1F, 4F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 99
		bodyModel[233].setRotationPoint(-38.5F, 0F, -5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[234].setRotationPoint(-38.5F, -16F, 3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[235].setRotationPoint(-38.5F, -16F, -5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[236].setRotationPoint(-38F, -17F, 3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[237].setRotationPoint(-38F, -17F, -3.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[238].setRotationPoint(-38F, -17.5F, -3.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[239].setRotationPoint(-38.5F, -18F, -5F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 5, 10, 0F); // Box 0
		bodyModel[240].setRotationPoint(-21.5F, -5F, -5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[241].setRotationPoint(-36.5F, -22F, -2.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[242].setRotationPoint(-36.5F, -22F, -8.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		bodyModel[243].setRotationPoint(-36.5F, -22F, 2.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 336
		bodyModel[244].setRotationPoint(-36.5F, -20F, 8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 579
		bodyModel[245].setRotationPoint(-36.5F, -20F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 565
		bodyModel[246].setRotationPoint(-36.5F, -17F, 2F);

		bodyModel[247].addBox(-1F, 0F, -4F, 1, 15, 4, 0F); // Front door
		bodyModel[247].setRotationPoint(-35.5F, -15F, 2F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 0
		bodyModel[248].setRotationPoint(-36.5F, -17F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 0
		bodyModel[249].setRotationPoint(-36.5F, -17F, -2F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[250].setRotationPoint(-36.5F, -19F, -8.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[251].setRotationPoint(-36.5F, -19F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[252].setRotationPoint(-36.5F, -19F, 8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[253].setRotationPoint(-36.5F, -21F, -2.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[254].setRotationPoint(-36.5F, -21F, -8.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[255].setRotationPoint(-36.5F, -21F, 2.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 0
		bodyModel[256].setRotationPoint(-31.5F, -17F, -11F);

		bodyModel[257].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 62
		bodyModel[257].setRotationPoint(-31.5F, -17F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[258].setRotationPoint(-31.5F, -5F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[259].setRotationPoint(-26F, -11F, 9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[260].setRotationPoint(-26F, -11F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[261].setRotationPoint(-31.5F, -5F, 8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 389
		bodyModel[262].setRotationPoint(-30.75F, -5.5F, 6.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[263].setRotationPoint(-29.85F, -6.75F, 8.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[264].setRotationPoint(-29.85F, -7.75F, 6.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 389
		bodyModel[265].setRotationPoint(-29.73F, -7.5F, 7.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 0
		bodyModel[266].setRotationPoint(-30.17F, -5F, 7.12F);
		bodyModel[266].rotateAngleY = -0.78539816F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[267].setRotationPoint(-29.1F, -8F, 7.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[268].setRotationPoint(-31.5F, -3F, 6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 394
		bodyModel[269].setRotationPoint(-28.51F, -4.5F, 7F);
		bodyModel[269].rotateAngleX = -0.78539816F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[270].setRotationPoint(-28F, -23F, -1.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[271].setRotationPoint(-28F, -24F, -1.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[272].setRotationPoint(-36.5F, 2F, -9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[273].setRotationPoint(-36.5F, 2F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[274].setRotationPoint(-29.1F, -10F, 6F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 279
		bodyModel[275].setRotationPoint(-29.1F, -10F, 8.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[276].setRotationPoint(-28.86F, -9.25F, 7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(-29.1F, -10F, 7.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[278].setRotationPoint(-37.5F, -13F, 3.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[279].setRotationPoint(-37.5F, -13F, -3.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 128
		bodyModel[280].setRotationPoint(36.5F, -13F, 3.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 567
		bodyModel[281].setRotationPoint(36.5F, -13F, -3.5F);
	}
	ModelTypeBnew theBetterTrucks = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.59, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.59, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}