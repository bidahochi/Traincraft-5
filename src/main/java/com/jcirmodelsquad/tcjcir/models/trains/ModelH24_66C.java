//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.01.2021 - 23:04:07
// Last changed on: 27.01.2021 - 23:04:07

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFMTrimountTruck;
import net.minecraft.client.Minecraft;
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

import java.util.ArrayList;

public class ModelH24_66C extends ModelConverter //Same as Filename
{

	int textureX = 512;
	int textureY = 512;

	public ModelH24_66C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[472];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 170, 86, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 170, 59, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 393, 93, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 235, 60, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 24, 74, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 357, 330, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 33, 130, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 38, 70, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 32, 71, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 38, 81, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 32, 75, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 37, 129, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 37, 133, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 1, 120, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 38, 116, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 1, 71, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 76, 131, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 39, 85, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 43, 119, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 38, 127, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 38, 131, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 35, 77, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 43, 131, textureX, textureY); // Box 47
		bodyModel[26] = new ModelRendererTurbo(this, 4, 70, textureX, textureY); // Box 52
		bodyModel[27] = new ModelRendererTurbo(this, 6, 71, textureX, textureY); // Box 53
		bodyModel[28] = new ModelRendererTurbo(this, 1, 85, textureX, textureY); // Box 54
		bodyModel[29] = new ModelRendererTurbo(this, 5, 79, textureX, textureY); // Box 55
		bodyModel[30] = new ModelRendererTurbo(this, 6, 75, textureX, textureY); // Box 56
		bodyModel[31] = new ModelRendererTurbo(this, 3, 129, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 58
		bodyModel[33] = new ModelRendererTurbo(this, 1, 119, textureX, textureY); // Box 59
		bodyModel[34] = new ModelRendererTurbo(this, 4, 127, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 4, 131, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 6, 77, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 9, 130, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 329, 402, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 15, 156, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 10, 148, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 317, 354, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 315, 366, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 314, 330, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 314, 345, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 352, 345, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 306, 394, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 366, 382, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 366, 390, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 366, 386, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 316, 380, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 316, 384, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 317, 378, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 317, 382, textureX, textureY); // Box 2
		bodyModel[54] = new ModelRendererTurbo(this, 367, 388, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 392, 382, textureX, textureY); // Box 53
		bodyModel[56] = new ModelRendererTurbo(this, 392, 390, textureX, textureY); // Box 55
		bodyModel[57] = new ModelRendererTurbo(this, 392, 386, textureX, textureY); // Box 56
		bodyModel[58] = new ModelRendererTurbo(this, 348, 380, textureX, textureY); // Box 57
		bodyModel[59] = new ModelRendererTurbo(this, 348, 384, textureX, textureY); // Box 58
		bodyModel[60] = new ModelRendererTurbo(this, 349, 378, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 349, 382, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 393, 388, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 322, 378, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 346, 378, textureX, textureY); // Box 59
		bodyModel[65] = new ModelRendererTurbo(this, 317, 364, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 364, 381, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 398, 381, textureX, textureY); // Box 52
		bodyModel[68] = new ModelRendererTurbo(this, 349, 364, textureX, textureY); // Box 66
		bodyModel[69] = new ModelRendererTurbo(this, 362, 382, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 361, 357, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 361, 371, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 399, 371, textureX, textureY); // Box 54
		bodyModel[73] = new ModelRendererTurbo(this, 295, 148, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 178, 112, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 291, 122, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 310, 174, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 310, 167, textureX, textureY); // Box 121
		bodyModel[78] = new ModelRendererTurbo(this, 340, 141, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 367, 137, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 363, 145, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 363, 141, textureX, textureY); // Box 136
		bodyModel[82] = new ModelRendererTurbo(this, 271, 122, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 297, 132, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 296, 124, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 294, 122, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 306, 126, textureX, textureY); // Box 136
		bodyModel[89] = new ModelRendererTurbo(this, 332, 77, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 321, 61, textureX, textureY); // Box 145
		bodyModel[91] = new ModelRendererTurbo(this, 358, 92, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 358, 62, textureX, textureY); // Box 147
		bodyModel[93] = new ModelRendererTurbo(this, 136, 207, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 137, 170, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 140, 184, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 128, 188, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 140, 203, textureX, textureY); // Box 162
		bodyModel[98] = new ModelRendererTurbo(this, 355, 301, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 383, 301, textureX, textureY); // Box 14
		bodyModel[100] = new ModelRendererTurbo(this, 250, 210, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 313, 221, textureX, textureY); // Box 2
		bodyModel[102] = new ModelRendererTurbo(this, 313, 189, textureX, textureY); // Box 173
		bodyModel[103] = new ModelRendererTurbo(this, 312, 236, textureX, textureY); // Box 2
		bodyModel[104] = new ModelRendererTurbo(this, 337, 236, textureX, textureY); // Box 2
		bodyModel[105] = new ModelRendererTurbo(this, 312, 181, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 337, 181, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 228, 203, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 250, 199, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 263, 197, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 261, 195, textureX, textureY); // Box 2
		bodyModel[111] = new ModelRendererTurbo(this, 263, 204, textureX, textureY); // Box 162
		bodyModel[112] = new ModelRendererTurbo(this, 370, 287, textureX, textureY); // Box 2
		bodyModel[113] = new ModelRendererTurbo(this, 353, 298, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 393, 298, textureX, textureY); // Box 224
		bodyModel[115] = new ModelRendererTurbo(this, 145, 96, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 58, 22, textureX, textureY); // Box 14
		bodyModel[118] = new ModelRendererTurbo(this, 65, 14, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 71, 12, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 72, 18, textureX, textureY); // Box 2
		bodyModel[121] = new ModelRendererTurbo(this, 79, 19, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 57, 16, textureX, textureY); // Box 224
		bodyModel[123] = new ModelRendererTurbo(this, 73, 206, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 174, 44, textureX, textureY); // front door
		bodyModel[125] = new ModelRendererTurbo(this, 89, 62, textureX, textureY); // Box 2
		bodyModel[126] = new ModelRendererTurbo(this, 145, 72, textureX, textureY); // Box 247
		bodyModel[127] = new ModelRendererTurbo(this, 136, 45, textureX, textureY); // Box 247
		bodyModel[128] = new ModelRendererTurbo(this, 385, 45, textureX, textureY); // Box 247
		bodyModel[129] = new ModelRendererTurbo(this, 337, 44, textureX, textureY); // rear door
		bodyModel[130] = new ModelRendererTurbo(this, 111, 22, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 111, 41, textureX, textureY); // Box 162
		bodyModel[132] = new ModelRendererTurbo(this, 346, 33, textureX, textureY); // Box 2
		bodyModel[133] = new ModelRendererTurbo(this, 408, 48, textureX, textureY); // Box 2
		bodyModel[134] = new ModelRendererTurbo(this, 413, 32, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 138, 7, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 138, 23, textureX, textureY); // Box 162
		bodyModel[137] = new ModelRendererTurbo(this, 385, 40, textureX, textureY); // Box 247
		bodyModel[138] = new ModelRendererTurbo(this, 146, 85, textureX, textureY); // Box 247
		bodyModel[139] = new ModelRendererTurbo(this, 380, 38, textureX, textureY); // Box 162
		bodyModel[140] = new ModelRendererTurbo(this, 380, 41, textureX, textureY); // Box 247
		bodyModel[141] = new ModelRendererTurbo(this, 173, 37, textureX, textureY); // Box 162
		bodyModel[142] = new ModelRendererTurbo(this, 178, 38, textureX, textureY); // Box 162
		bodyModel[143] = new ModelRendererTurbo(this, 375, 38, textureX, textureY); // Box 162
		bodyModel[144] = new ModelRendererTurbo(this, 168, 37, textureX, textureY); // Box 162
		bodyModel[145] = new ModelRendererTurbo(this, 102, 49, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 138, 19, textureX, textureY); // Box 294
		bodyModel[147] = new ModelRendererTurbo(this, 136, 40, textureX, textureY); // Box 295
		bodyModel[148] = new ModelRendererTurbo(this, 146, 61, textureX, textureY); // Box 296
		bodyModel[149] = new ModelRendererTurbo(this, 143, 38, textureX, textureY); // Box 297
		bodyModel[150] = new ModelRendererTurbo(this, 143, 41, textureX, textureY); // Box 298
		bodyModel[151] = new ModelRendererTurbo(this, 148, 38, textureX, textureY); // Box 299
		bodyModel[152] = new ModelRendererTurbo(this, 402, 45, textureX, textureY); // Box 300
		bodyModel[153] = new ModelRendererTurbo(this, 342, 37, textureX, textureY); // Box 301
		bodyModel[154] = new ModelRendererTurbo(this, 337, 38, textureX, textureY); // Box 304
		bodyModel[155] = new ModelRendererTurbo(this, 347, 37, textureX, textureY); // Box 305
		bodyModel[156] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 101, 12, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 96, 12, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 105, 16, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 91, 15, textureX, textureY); // Box 334
		bodyModel[161] = new ModelRendererTurbo(this, 101, 21, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 336
		bodyModel[163] = new ModelRendererTurbo(this, 91, 19, textureX, textureY); // Box 337
		bodyModel[164] = new ModelRendererTurbo(this, 95, 24, textureX, textureY, BoxName.lamp); // headlight F
		bodyModel[165] = new ModelRendererTurbo(this, 95, 30, textureX, textureY,BoxName.lamp); // headlight F
		bodyModel[166] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 100, 14, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 103, 14, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 346
		bodyModel[170] = new ModelRendererTurbo(this, 99, 18, textureX, textureY); // Box 2
		bodyModel[171] = new ModelRendererTurbo(this, 103, 18, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 96, 18, textureX, textureY); // Box 346
		bodyModel[173] = new ModelRendererTurbo(this, 389, 231, textureX, textureY); // Box 2
		bodyModel[174] = new ModelRendererTurbo(this, 385, 207, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 387, 190, textureX, textureY); // Box 2
		bodyModel[176] = new ModelRendererTurbo(this, 387, 225, textureX, textureY); // Box 162
		bodyModel[177] = new ModelRendererTurbo(this, 389, 183, textureX, textureY); // Box 358
		bodyModel[178] = new ModelRendererTurbo(this, 398, 208, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 368, 208, textureX, textureY); // Box 2
		bodyModel[180] = new ModelRendererTurbo(this, 51, 42, textureX, textureY,BoxName.lamp); // marker light FL
		bodyModel[181] = new ModelRendererTurbo(this, 15, 42, textureX, textureY,BoxName.lamp); // marker light FR
		bodyModel[182] = new ModelRendererTurbo(this, 341, 303, textureX, textureY,BoxName.lamp); // marker light RL
		bodyModel[183] = new ModelRendererTurbo(this, 405, 303, textureX, textureY,BoxName.lamp); // marker light RR
		bodyModel[184] = new ModelRendererTurbo(this, 44, 33, textureX, textureY); // Box 2
		bodyModel[185] = new ModelRendererTurbo(this, 16, 33, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 49, 26, textureX, textureY,BoxName.lamp); // numberboard type 1 F
		bodyModel[187] = new ModelRendererTurbo(this, 11, 28, textureX, textureY,BoxName.lamp); // numberboard type 1 F
		bodyModel[188] = new ModelRendererTurbo(this, 242, 167, textureX, textureY); // exhaust
		bodyModel[189] = new ModelRendererTurbo(this, 242, 162, textureX, textureY); // exhaust
		bodyModel[190] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 425, 29, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 424, 20, textureX, textureY); // Box 456
		bodyModel[193] = new ModelRendererTurbo(this, 360, 388, textureX, textureY); // Box 2
		bodyModel[194] = new ModelRendererTurbo(this, 361, 381, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 401, 381, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 256, 141, textureX, textureY); // Box 2
		bodyModel[197] = new ModelRendererTurbo(this, 256, 121, textureX, textureY); // Box 2
		bodyModel[198] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		bodyModel[199] = new ModelRendererTurbo(this, 41, 70, textureX, textureY); // Box 2
		bodyModel[200] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 93, 139, textureX, textureY); // Box 2
		bodyModel[202] = new ModelRendererTurbo(this, 93, 119, textureX, textureY); // Box 2
		bodyModel[203] = new ModelRendererTurbo(this, 151, 152, textureX, textureY); // Box 2
		bodyModel[204] = new ModelRendererTurbo(this, 151, 132, textureX, textureY); // Box 417
		bodyModel[205] = new ModelRendererTurbo(this, 151, 150, textureX, textureY); // Box 2
		bodyModel[206] = new ModelRendererTurbo(this, 151, 130, textureX, textureY); // Box 419
		bodyModel[207] = new ModelRendererTurbo(this, 99, 140, textureX, textureY); // Box 2
		bodyModel[208] = new ModelRendererTurbo(this, 99, 120, textureX, textureY); // Box 421
		bodyModel[209] = new ModelRendererTurbo(this, 120, 142, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 120, 122, textureX, textureY); // Box 423
		bodyModel[211] = new ModelRendererTurbo(this, 250, 142, textureX, textureY); // Box 2
		bodyModel[212] = new ModelRendererTurbo(this, 250, 122, textureX, textureY); // Box 425
		bodyModel[213] = new ModelRendererTurbo(this, 123, 142, textureX, textureY); // Box 2
		bodyModel[214] = new ModelRendererTurbo(this, 123, 122, textureX, textureY); // Box 427
		bodyModel[215] = new ModelRendererTurbo(this, 392, 228, textureX, textureY); // Box 2
		bodyModel[216] = new ModelRendererTurbo(this, 389, 224, textureX, textureY); // Box 162
		bodyModel[217] = new ModelRendererTurbo(this, 389, 210, textureX, textureY); // Box 2
		bodyModel[218] = new ModelRendererTurbo(this, 362, 228, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 359, 224, textureX, textureY); // Box 162
		bodyModel[220] = new ModelRendererTurbo(this, 359, 210, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 392, 183, textureX, textureY); // Box 427
		bodyModel[222] = new ModelRendererTurbo(this, 389, 190, textureX, textureY); // Box 429
		bodyModel[223] = new ModelRendererTurbo(this, 389, 204, textureX, textureY); // Box 431
		bodyModel[224] = new ModelRendererTurbo(this, 362, 183, textureX, textureY); // Box 432
		bodyModel[225] = new ModelRendererTurbo(this, 359, 190, textureX, textureY); // Box 434
		bodyModel[226] = new ModelRendererTurbo(this, 359, 204, textureX, textureY); // Box 436
		bodyModel[227] = new ModelRendererTurbo(this, 72, 12, textureX, textureY); // Box 2
		bodyModel[228] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 161
		bodyModel[229] = new ModelRendererTurbo(this, 138, 13, textureX, textureY); // Box 161
		bodyModel[230] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 455
		bodyModel[231] = new ModelRendererTurbo(this, 58, 16, textureX, textureY); // Box 456
		bodyModel[232] = new ModelRendererTurbo(this, 58, 10, textureX, textureY); // Box 458
		bodyModel[233] = new ModelRendererTurbo(this, 137, 163, textureX, textureY); // Box 459
		bodyModel[234] = new ModelRendererTurbo(this, 138, 1, textureX, textureY); // Box 460
		bodyModel[235] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 161
		bodyModel[236] = new ModelRendererTurbo(this, 385, 194, textureX, textureY); // Box 462
		bodyModel[237] = new ModelRendererTurbo(this, 250, 206, textureX, textureY); // Box 161
		bodyModel[238] = new ModelRendererTurbo(this, 249, 192, textureX, textureY); // Box 459
		bodyModel[239] = new ModelRendererTurbo(this, 365, 290, textureX, textureY); // Box 2
		bodyModel[240] = new ModelRendererTurbo(this, 358, 295, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 358, 289, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 353, 214, textureX, textureY); // Box 161
		bodyModel[243] = new ModelRendererTurbo(this, 383, 214, textureX, textureY); // Box 161
		bodyModel[244] = new ModelRendererTurbo(this, 381, 290, textureX, textureY); // Box 471
		bodyModel[245] = new ModelRendererTurbo(this, 382, 295, textureX, textureY); // Box 472
		bodyModel[246] = new ModelRendererTurbo(this, 382, 289, textureX, textureY); // Box 473
		bodyModel[247] = new ModelRendererTurbo(this, 353, 194, textureX, textureY); // Box 474
		bodyModel[248] = new ModelRendererTurbo(this, 383, 194, textureX, textureY); // Box 475
		bodyModel[249] = new ModelRendererTurbo(this, 192, 40, textureX, textureY); // Box 2
		bodyModel[250] = new ModelRendererTurbo(this, 183, 44, textureX, textureY); // Box 2
		bodyModel[251] = new ModelRendererTurbo(this, 311, 40, textureX, textureY); // Box 2
		bodyModel[252] = new ModelRendererTurbo(this, 328, 44, textureX, textureY); // Box 2
		bodyModel[253] = new ModelRendererTurbo(this, 209, 44, textureX, textureY); // Box 509
		bodyModel[254] = new ModelRendererTurbo(this, 302, 44, textureX, textureY); // Box 510
		bodyModel[255] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 509
		bodyModel[256] = new ModelRendererTurbo(this, 218, 43, textureX, textureY); // Box 509
		bodyModel[257] = new ModelRendererTurbo(this, 242, 51, textureX, textureY); // Box 197
		bodyModel[258] = new ModelRendererTurbo(this, 244, 47, textureX, textureY); // Box 197
		bodyModel[259] = new ModelRendererTurbo(this, 251, 51, textureX, textureY); // Box 197
		bodyModel[260] = new ModelRendererTurbo(this, 253, 47, textureX, textureY); // Box 197
		bodyModel[261] = new ModelRendererTurbo(this, 251, 55, textureX, textureY); // Box 197
		bodyModel[262] = new ModelRendererTurbo(this, 227, 43, textureX, textureY); // Box 197
		bodyModel[263] = new ModelRendererTurbo(this, 278, 49, textureX, textureY); // Box 509
		bodyModel[264] = new ModelRendererTurbo(this, 287, 43, textureX, textureY); // Box 509
		bodyModel[265] = new ModelRendererTurbo(this, 288, 34, textureX, textureY); // Box 509
		bodyModel[266] = new ModelRendererTurbo(this, 286, 43, textureX, textureY); // Box 197
		bodyModel[267] = new ModelRendererTurbo(this, 269, 51, textureX, textureY); // Box 524
		bodyModel[268] = new ModelRendererTurbo(this, 271, 47, textureX, textureY); // Box 525
		bodyModel[269] = new ModelRendererTurbo(this, 260, 51, textureX, textureY); // Box 526
		bodyModel[270] = new ModelRendererTurbo(this, 262, 47, textureX, textureY); // Box 527
		bodyModel[271] = new ModelRendererTurbo(this, 264, 55, textureX, textureY); // Box 528
		bodyModel[272] = new ModelRendererTurbo(this, 7, 73, textureX, textureY); // Box 537
		bodyModel[273] = new ModelRendererTurbo(this, 367, 384, textureX, textureY); // Box 2
		bodyModel[274] = new ModelRendererTurbo(this, 393, 384, textureX, textureY); // Box 540
		bodyModel[275] = new ModelRendererTurbo(this, 414, 330, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[276] = new ModelRendererTurbo(this, 414, 335, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[277] = new ModelRendererTurbo(this, 407, 330, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[278] = new ModelRendererTurbo(this, 83, 13, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[279] = new ModelRendererTurbo(this, 81, 24, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[280] = new ModelRendererTurbo(this, 84, 18, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[281] = new ModelRendererTurbo(this, 336, 122, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 122, 72, textureX, textureY); // Box 2
		bodyModel[283] = new ModelRendererTurbo(this, 122, 26, textureX, textureY); // Box 2
		bodyModel[284] = new ModelRendererTurbo(this, 99, 176, textureX, textureY); // CP steam generator part
		bodyModel[285] = new ModelRendererTurbo(this, 102, 167, textureX, textureY); // CP steam generator part
		bodyModel[286] = new ModelRendererTurbo(this, 102, 172, textureX, textureY); // CP steam generator part
		bodyModel[287] = new ModelRendererTurbo(this, 102, 164, textureX, textureY); // Box 2
		bodyModel[288] = new ModelRendererTurbo(this, 102, 160, textureX, textureY); // CP steam generator part
		bodyModel[289] = new ModelRendererTurbo(this, 99, 104, textureX, textureY); // CP steam generator part
		bodyModel[290] = new ModelRendererTurbo(this, 102, 95, textureX, textureY); // CP steam generator part
		bodyModel[291] = new ModelRendererTurbo(this, 102, 100, textureX, textureY); // CP steam generator part
		bodyModel[292] = new ModelRendererTurbo(this, 102, 92, textureX, textureY); // CP steam generator part
		bodyModel[293] = new ModelRendererTurbo(this, 102, 88, textureX, textureY); // CP steam generator part
		bodyModel[294] = new ModelRendererTurbo(this, 91, 160, textureX, textureY); // CP steam generator part
		bodyModel[295] = new ModelRendererTurbo(this, 91, 88, textureX, textureY); // CP steam generator part
		bodyModel[296] = new ModelRendererTurbo(this, 203, 152, textureX, textureY); // CP box thing
		bodyModel[297] = new ModelRendererTurbo(this, 260, 167, textureX, textureY); // exhaust extension
		bodyModel[298] = new ModelRendererTurbo(this, 260, 162, textureX, textureY); // exhaust extension
		bodyModel[299] = new ModelRendererTurbo(this, 74, 178, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 29, 84, textureX, textureY); // Box 2
		bodyModel[301] = new ModelRendererTurbo(this, 6, 84, textureX, textureY); // Box 700
		bodyModel[302] = new ModelRendererTurbo(this, 364, 393, textureX, textureY); // Box 2
		bodyModel[303] = new ModelRendererTurbo(this, 400, 393, textureX, textureY); // Box 700
		bodyModel[304] = new ModelRendererTurbo(this, 392, 52, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 43
		bodyModel[306] = new ModelRendererTurbo(this, 2, 8, textureX, textureY); // Box 43
		bodyModel[307] = new ModelRendererTurbo(this, 3, 24, textureX, textureY); // Box 43
		bodyModel[308] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 2
		bodyModel[309] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 43
		bodyModel[310] = new ModelRendererTurbo(this, 4, 30, textureX, textureY); // Box 43
		bodyModel[311] = new ModelRendererTurbo(this, 50, 142, textureX, textureY); // Box 2
		bodyModel[312] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // CP brake wheel part
		bodyModel[313] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // CP brake wheel part
		bodyModel[314] = new ModelRendererTurbo(this, 8, 41, textureX, textureY); // CP brake wheel part
		bodyModel[315] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // CP brake wheel part
		bodyModel[316] = new ModelRendererTurbo(this, 1, 54, textureX, textureY); // CP brake wheel part
		bodyModel[317] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // CP brake wheel part
		bodyModel[318] = new ModelRendererTurbo(this, 49, 63, textureX, textureY); // Box 2
		bodyModel[319] = new ModelRendererTurbo(this, 24, 77, textureX, textureY); // Box 2
		bodyModel[320] = new ModelRendererTurbo(this, 16, 77, textureX, textureY); // Box 720
		bodyModel[321] = new ModelRendererTurbo(this, 5, 77, textureX, textureY); // drop platform F
		bodyModel[322] = new ModelRendererTurbo(this, 5, 84, textureX, textureY); // drop platform dummy, delete when animated
		bodyModel[323] = new ModelRendererTurbo(this, 374, 382, textureX, textureY); // Box 2
		bodyModel[324] = new ModelRendererTurbo(this, 385, 382, textureX, textureY); // Box 720
		bodyModel[325] = new ModelRendererTurbo(this, 363, 393, textureX, textureY); // drop platform R
		bodyModel[326] = new ModelRendererTurbo(this, 384, 393, textureX, textureY); // drop platform dummy, delete when animated
		bodyModel[327] = new ModelRendererTurbo(this, 89, 22, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[328] = new ModelRendererTurbo(this, 88, 33, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[329] = new ModelRendererTurbo(this, 88, 27, textureX, textureY); // headlight R
		bodyModel[330] = new ModelRendererTurbo(this, 414, 320, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[331] = new ModelRendererTurbo(this, 414, 325, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[332] = new ModelRendererTurbo(this, 407, 320, textureX, textureY); // headlight R
		bodyModel[333] = new ModelRendererTurbo(this, 392, 45, textureX, textureY); // Box 2
		bodyModel[334] = new ModelRendererTurbo(this, 34, 84, textureX, textureY); // Box 2
		bodyModel[335] = new ModelRendererTurbo(this, 34, 80, textureX, textureY); // Box 2
		bodyModel[336] = new ModelRendererTurbo(this, 405, 393, textureX, textureY); // Box 736
		bodyModel[337] = new ModelRendererTurbo(this, 410, 393, textureX, textureY); // Box 737
		bodyModel[338] = new ModelRendererTurbo(this, 23, 149, textureX, textureY); // Box 1
		bodyModel[339] = new ModelRendererTurbo(this, 17, 149, textureX, textureY); // Box 1
		bodyModel[340] = new ModelRendererTurbo(this, 331, 395, textureX, textureY); // Box 1
		bodyModel[341] = new ModelRendererTurbo(this, 337, 395, textureX, textureY); // Box 1
		bodyModel[342] = new ModelRendererTurbo(this, 21, 12, textureX, textureY); // Box 0
		bodyModel[343] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 21, 15, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 21, 2, textureX, textureY); // Box 470
		bodyModel[346] = new ModelRendererTurbo(this, 21, 5, textureX, textureY); // Box 470
		bodyModel[347] = new ModelRendererTurbo(this, 36, 7, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 36, 10, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 470
		bodyModel[351] = new ModelRendererTurbo(this, 41, 3, textureX, textureY); // Box 470
		bodyModel[352] = new ModelRendererTurbo(this, 88, 70, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[353] = new ModelRendererTurbo(this, 410, 296, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 410, 289, textureX, textureY); // Box 0
		bodyModel[355] = new ModelRendererTurbo(this, 410, 293, textureX, textureY); // Box 0
		bodyModel[356] = new ModelRendererTurbo(this, 405, 286, textureX, textureY); // Box 470
		bodyModel[357] = new ModelRendererTurbo(this, 405, 289, textureX, textureY); // Box 470
		bodyModel[358] = new ModelRendererTurbo(this, 104, 41, textureX, textureY); // Box 302
		bodyModel[359] = new ModelRendererTurbo(this, 172, 8, textureX, textureY); // Box 302
		bodyModel[360] = new ModelRendererTurbo(this, 151, 236, textureX, textureY); // Box 2
		bodyModel[361] = new ModelRendererTurbo(this, 151, 156, textureX, textureY); // Box 761
		bodyModel[362] = new ModelRendererTurbo(this, 183, 31, textureX, textureY); // Box 775
		bodyModel[363] = new ModelRendererTurbo(this, 172, 31, textureX, textureY); // Box 776
		bodyModel[364] = new ModelRendererTurbo(this, 172, 28, textureX, textureY); // Box 777
		bodyModel[365] = new ModelRendererTurbo(this, 172, 34, textureX, textureY); // Box 778
		bodyModel[366] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // box64
		bodyModel[367] = new ModelRendererTurbo(this, 150, 89, textureX, textureY); // box65
		bodyModel[368] = new ModelRendererTurbo(this, 251, 167, textureX, textureY); // exhaust extension
		bodyModel[369] = new ModelRendererTurbo(this, 251, 162, textureX, textureY); // exhaust extension
		bodyModel[370] = new ModelRendererTurbo(this, 170, 236, textureX, textureY); // Box 2
		bodyModel[371] = new ModelRendererTurbo(this, 170, 156, textureX, textureY); // Box 761
		bodyModel[372] = new ModelRendererTurbo(this, 368, 295, textureX, textureY); // Box 2
		bodyModel[373] = new ModelRendererTurbo(this, 29, 80, textureX, textureY); // Box 2
		bodyModel[374] = new ModelRendererTurbo(this, 395, 393, textureX, textureY); // Box 2
		bodyModel[375] = new ModelRendererTurbo(this, 148, 93, textureX, textureY); // box65
		bodyModel[376] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 350
		bodyModel[377] = new ModelRendererTurbo(this, 167, 89, textureX, textureY); // Box 350
		bodyModel[378] = new ModelRendererTurbo(this, 148, 69, textureX, textureY); // Box 856
		bodyModel[379] = new ModelRendererTurbo(this, 269, 162, textureX, textureY); // exhaust extension
		bodyModel[380] = new ModelRendererTurbo(this, 269, 167, textureX, textureY); // Box 817
		bodyModel[381] = new ModelRendererTurbo(this, 71, 49, textureX, textureY); // Box 2
		bodyModel[382] = new ModelRendererTurbo(this, 191, 34, textureX, textureY); // Box 302
		bodyModel[383] = new ModelRendererTurbo(this, 196, 34, textureX, textureY); // Box 470
		bodyModel[384] = new ModelRendererTurbo(this, 196, 37, textureX, textureY); // Box 468
		bodyModel[385] = new ModelRendererTurbo(this, 196, 31, textureX, textureY); // Box 471
		bodyModel[386] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 834
		bodyModel[387] = new ModelRendererTurbo(this, 167, 65, textureX, textureY); // Box 835
		bodyModel[388] = new ModelRendererTurbo(this, 107, 8, textureX, textureY); // Box 2
		bodyModel[389] = new ModelRendererTurbo(this, 107, 15, textureX, textureY); // Box 161
		bodyModel[390] = new ModelRendererTurbo(this, 107, 1, textureX, textureY); // Box 457
		bodyModel[391] = new ModelRendererTurbo(this, 70, 228, textureX, textureY); // Box 2
		bodyModel[392] = new ModelRendererTurbo(this, 394, 299, textureX, textureY); // Box 2
		bodyModel[393] = new ModelRendererTurbo(this, 346, 299, textureX, textureY); // Box 2
		bodyModel[394] = new ModelRendererTurbo(this, 396, 302, textureX, textureY,BoxName.lamp); // numberboard type 1 R
		bodyModel[395] = new ModelRendererTurbo(this, 346, 302, textureX, textureY,BoxName.lamp); // numberboard type 1 R
		bodyModel[396] = new ModelRendererTurbo(this, 219, 34, textureX, textureY); // Box 509
		bodyModel[397] = new ModelRendererTurbo(this, 250, 144, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 250, 124, textureX, textureY); // Box 425
		bodyModel[399] = new ModelRendererTurbo(this, 452, 301, textureX, textureY); // Box 2
		bodyModel[400] = new ModelRendererTurbo(this, 455, 301, textureX, textureY); // Box 2
		bodyModel[401] = new ModelRendererTurbo(this, 452, 301, textureX, textureY); // Box 2
		bodyModel[402] = new ModelRendererTurbo(this, 458, 301, textureX, textureY); // Box 346
		bodyModel[403] = new ModelRendererTurbo(this, 455, 305, textureX, textureY); // Box 2
		bodyModel[404] = new ModelRendererTurbo(this, 452, 305, textureX, textureY); // Box 2
		bodyModel[405] = new ModelRendererTurbo(this, 458, 305, textureX, textureY); // Box 346
		bodyModel[406] = new ModelRendererTurbo(this, 452, 308, textureX, textureY); // Box 2
		bodyModel[407] = new ModelRendererTurbo(this, 447, 299, textureX, textureY); // Box 2
		bodyModel[408] = new ModelRendererTurbo(this, 452, 299, textureX, textureY); // Box 2
		bodyModel[409] = new ModelRendererTurbo(this, 447, 303, textureX, textureY); // Box 2
		bodyModel[410] = new ModelRendererTurbo(this, 461, 303, textureX, textureY); // Box 334
		bodyModel[411] = new ModelRendererTurbo(this, 447, 308, textureX, textureY); // Box 2
		bodyModel[412] = new ModelRendererTurbo(this, 457, 299, textureX, textureY); // Box 336
		bodyModel[413] = new ModelRendererTurbo(this, 457, 308, textureX, textureY); // Box 337
		bodyModel[414] = new ModelRendererTurbo(this, 466, 300, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[415] = new ModelRendererTurbo(this, 466, 305, textureX, textureY,BoxName.lamp); // headlight R
		bodyModel[416] = new ModelRendererTurbo(this, 330, 394, textureX, textureY); // Box 1
		bodyModel[417] = new ModelRendererTurbo(this, 340, 394, textureX, textureY); // Box 1
		bodyModel[418] = new ModelRendererTurbo(this, 340, 411, textureX, textureY); // Box 1
		bodyModel[419] = new ModelRendererTurbo(this, 340, 403, textureX, textureY); // Box 1
		bodyModel[420] = new ModelRendererTurbo(this, 16, 148, textureX, textureY); // Box 1
		bodyModel[421] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 1
		bodyModel[422] = new ModelRendererTurbo(this, 14, 180, textureX, textureY); // Box 1
		bodyModel[423] = new ModelRendererTurbo(this, 14, 172, textureX, textureY); // Box 1
		bodyModel[424] = new ModelRendererTurbo(this, 33, 148, textureX, textureY); // Box 1
		bodyModel[425] = new ModelRendererTurbo(this, 50, 148, textureX, textureY); // Box 1
		bodyModel[426] = new ModelRendererTurbo(this, 307, 394, textureX, textureY); // Box 1
		bodyModel[427] = new ModelRendererTurbo(this, 294, 394, textureX, textureY); // Box 1
		bodyModel[428] = new ModelRendererTurbo(this, 136, 29, textureX, textureY); // Box 2
		bodyModel[429] = new ModelRendererTurbo(this, 243, 246, textureX, textureY); // Box 2
		bodyModel[430] = new ModelRendererTurbo(this, 243, 236, textureX, textureY); // Box 171
		bodyModel[431] = new ModelRendererTurbo(this, 412, 64, textureX, textureY); // Box 267
		bodyModel[432] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 2
		bodyModel[433] = new ModelRendererTurbo(this, 439, 64, textureX, textureY); // Box 2
		bodyModel[434] = new ModelRendererTurbo(this, 439, 73, textureX, textureY); // Box 2
		bodyModel[435] = new ModelRendererTurbo(this, 439, 49, textureX, textureY); // dynamic brake opening plug
		bodyModel[436] = new ModelRendererTurbo(this, 413, 67, textureX, textureY); // Box 2
		bodyModel[437] = new ModelRendererTurbo(this, 405, 73, textureX, textureY); // Box 449
		bodyModel[438] = new ModelRendererTurbo(this, 413, 49, textureX, textureY); // dynamic brake opening plug
		bodyModel[439] = new ModelRendererTurbo(this, 154, 36, textureX, textureY); // Box 162
		bodyModel[440] = new ModelRendererTurbo(this, 151, 36, textureX, textureY); // Box 162
		bodyModel[441] = new ModelRendererTurbo(this, 373, 35, textureX, textureY); // Box 162
		bodyModel[442] = new ModelRendererTurbo(this, 376, 35, textureX, textureY); // Box 162
		bodyModel[443] = new ModelRendererTurbo(this, 166, 34, textureX, textureY); // Box 868
		bodyModel[444] = new ModelRendererTurbo(this, 169, 34, textureX, textureY); // Box 869
		bodyModel[445] = new ModelRendererTurbo(this, 351, 34, textureX, textureY); // Box 870
		bodyModel[446] = new ModelRendererTurbo(this, 348, 34, textureX, textureY); // Box 871
		bodyModel[447] = new ModelRendererTurbo(this, 171, 40, textureX, textureY); // front door
		bodyModel[448] = new ModelRendererTurbo(this, 178, 41, textureX, textureY); // front door
		bodyModel[449] = new ModelRendererTurbo(this, 342, 40, textureX, textureY); // rear door
		bodyModel[450] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // rear door
		bodyModel[451] = new ModelRendererTurbo(this, 15, 9, textureX, textureY); // Box 43
		bodyModel[452] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 883
		bodyModel[453] = new ModelRendererTurbo(this, 359, 392, textureX, textureY); // Box 884
		bodyModel[454] = new ModelRendererTurbo(this, 56, 66, textureX, textureY); // Box 2
		bodyModel[455] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 2
		bodyModel[456] = new ModelRendererTurbo(this, 15, 40, textureX, textureY); // Box 14
		bodyModel[457] = new ModelRendererTurbo(this, 410, 148, textureX, textureY); // Box 2
		bodyModel[458] = new ModelRendererTurbo(this, 410, 121, textureX, textureY); // Box 2
		bodyModel[459] = new ModelRendererTurbo(this, 262, 131, textureX, textureY); // Box 2
		bodyModel[460] = new ModelRendererTurbo(this, 393, 131, textureX, textureY); // Box 2
		bodyModel[461] = new ModelRendererTurbo(this, 259, 136, textureX, textureY); // Box 2
		bodyModel[462] = new ModelRendererTurbo(this, 259, 122, textureX, textureY); // Box 125
		bodyModel[463] = new ModelRendererTurbo(this, 390, 136, textureX, textureY); // Box 2
		bodyModel[464] = new ModelRendererTurbo(this, 390, 122, textureX, textureY); // Box 125
		bodyModel[465] = new ModelRendererTurbo(this, 179, 4, textureX, textureY); // Box 302
		bodyModel[466] = new ModelRendererTurbo(this, 184, 4, textureX, textureY); // Box 470
		bodyModel[467] = new ModelRendererTurbo(this, 179, 7, textureX, textureY); // Box 468
		bodyModel[468] = new ModelRendererTurbo(this, 179, 1, textureX, textureY); // Box 471
		bodyModel[469] = new ModelRendererTurbo(this, 256, 172, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[470] = new ModelRendererTurbo(this, 256, 153, textureX, textureY,"cull"); // Box 793 cull
		bodyModel[471] = new ModelRendererTurbo(this, 128, 109, textureX, textureY); // Box 2

		bodyModel[0].addBox(0F, 0F, 0F, 81, 3, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-40.5F, -2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 21, 4, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-37.5F, -6F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 19, 4, 22, 0F); // Box 2
		bodyModel[2].setRotationPoint(18.5F, -6F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 35, 4, 15, 0F); // Box 2
		bodyModel[3].setRotationPoint(-16.5F, -6F, -7.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 4, 22, 0F); // Box 2
		bodyModel[4].setRotationPoint(-40.5F, -6F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 4, 22, 0F); // Box 2
		bodyModel[5].setRotationPoint(37.5F, -6F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 4, 18, 0F); // Box 2
		bodyModel[6].setRotationPoint(-43.5F, -6F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 3, 16, 0F); // Box 2
		bodyModel[7].setRotationPoint(-43.5F, -2F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 2
		bodyModel[8].setRotationPoint(-43.5F, -2F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 2
		bodyModel[9].setRotationPoint(-43.5F, -6F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[10].setRotationPoint(-43.5F, -4F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[11].setRotationPoint(-43.5F, 1.5F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[12].setRotationPoint(-43.5F, -1.25F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[13].setRotationPoint(-43.5F, 4.25F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[14].setRotationPoint(-43.5F, 7F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 2
		bodyModel[15].setRotationPoint(-43.5F, 1F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 2
		bodyModel[16].setRotationPoint(-41.5F, -2F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 2
		bodyModel[17].setRotationPoint(-41.5F, -6F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-41.5F, -2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(-41.5F, -6F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 2
		bodyModel[20].setRotationPoint(-41.5F, 1F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[21].setRotationPoint(-43.5F, 3.5F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-43.5F, 6.25F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[23].setRotationPoint(-43.5F, 0.75F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-43.5F, -2F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[25].setRotationPoint(-41.5F, -2F, 10F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 52
		bodyModel[26].setRotationPoint(-43.5F, -6F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 53
		bodyModel[27].setRotationPoint(-43.5F, -4F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 54
		bodyModel[28].setRotationPoint(-41.5F, -6F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 55
		bodyModel[29].setRotationPoint(-43.5F, 1.5F, 9F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 56
		bodyModel[30].setRotationPoint(-43.5F, -1.25F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 57
		bodyModel[31].setRotationPoint(-43.5F, 4.25F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 58
		bodyModel[32].setRotationPoint(-43.5F, 7F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 59
		bodyModel[33].setRotationPoint(-41.5F, 1F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 60
		bodyModel[34].setRotationPoint(-43.5F, 3.5F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 61
		bodyModel[35].setRotationPoint(-43.5F, 6.25F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		bodyModel[36].setRotationPoint(-43.5F, 0.75F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 66
		bodyModel[37].setRotationPoint(-43.5F, -2F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[38].setRotationPoint(44.5F, 3F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[39].setRotationPoint(-47.5F, 3F, -1.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 2
		bodyModel[40].setRotationPoint(-45.5F, 8F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 3, 16, 0F); // Box 2
		bodyModel[41].setRotationPoint(41.5F, -2F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 2
		bodyModel[42].setRotationPoint(43.5F, 1F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 2
		bodyModel[43].setRotationPoint(40.5F, -2F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[44].setRotationPoint(40.5F, -2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(40.5F, -2F, 10F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 2
		bodyModel[46].setRotationPoint(43.5F, 8F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[47].setRotationPoint(41.5F, -4F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[48].setRotationPoint(41.5F, 1.5F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[49].setRotationPoint(41.5F, -1.25F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[50].setRotationPoint(41.5F, 4.25F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[51].setRotationPoint(41.5F, 7F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[52].setRotationPoint(41.5F, 3.5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[53].setRotationPoint(41.5F, 6.25F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[54].setRotationPoint(41.5F, 0.75F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 53
		bodyModel[55].setRotationPoint(41.5F, -4F, 9F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 55
		bodyModel[56].setRotationPoint(41.5F, 1.5F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 56
		bodyModel[57].setRotationPoint(41.5F, -1.25F, 9F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 57
		bodyModel[58].setRotationPoint(41.5F, 4.25F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 58
		bodyModel[59].setRotationPoint(41.5F, 7F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 60
		bodyModel[60].setRotationPoint(41.5F, 3.5F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 61
		bodyModel[61].setRotationPoint(41.5F, 6.25F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		bodyModel[62].setRotationPoint(41.5F, 0.75F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 2
		bodyModel[63].setRotationPoint(41.5F, 1F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 59
		bodyModel[64].setRotationPoint(41.5F, 1F, 9F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 2
		bodyModel[65].setRotationPoint(43.5F, -2F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 2
		bodyModel[66].setRotationPoint(43.5F, -6F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 52
		bodyModel[67].setRotationPoint(43.5F, -6F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 66
		bodyModel[68].setRotationPoint(43.5F, -2F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 4, 18, 0F); // Box 2
		bodyModel[69].setRotationPoint(41.5F, -6F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 2
		bodyModel[70].setRotationPoint(40.5F, -6F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[71].setRotationPoint(40.5F, -6F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[72].setRotationPoint(40.5F, -6F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[73].setRotationPoint(-7.5F, 7F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 87, 1, 8, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[74].setRotationPoint(-43.5F, 1F, -4F);

		bodyModel[75].addBox(0F, 0F, 0F, 12, 5, 20, 0F); // Box 2
		bodyModel[75].setRotationPoint(-7.5F, 2F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-7.5F, 2F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 121
		bodyModel[77].setRotationPoint(-7.5F, 2F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[78].setRotationPoint(7.23F, 3.5F, -8F);
		bodyModel[78].rotateAngleZ = -0.78539816F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[79].setRotationPoint(10.77F, 3.5F, -8F);
		bodyModel[79].rotateAngleZ = -0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[80].setRotationPoint(5.5F, 2F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 136
		bodyModel[81].setRotationPoint(5.5F, 2F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[82].setRotationPoint(-11.5F, 1F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[83].setRotationPoint(-11F, 2.5F, -6F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 2
		bodyModel[84].setRotationPoint(-11F, 3F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[85].setRotationPoint(-10.5F, 2.5F, 1F);
		bodyModel[85].rotateAngleZ = -0.78539816F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[86].setRotationPoint(-11F, 2.5F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[87].setRotationPoint(-12F, 3F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 136
		bodyModel[88].setRotationPoint(-11.5F, 2.5F, 4F);

		bodyModel[89].addBox(0F, 0F, 0F, 14, 3, 4, 0F); // Box 2
		bodyModel[89].setRotationPoint(-15.5F, -5F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 14, 3, 4, 0F); // Box 145
		bodyModel[90].setRotationPoint(-15.5F, -5F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Box 2
		bodyModel[91].setRotationPoint(-1.5F, -5F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 20, 3, 4, 0F); // Box 147
		bodyModel[92].setRotationPoint(-1.5F, -5F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 38, 13, 15, 0F); // Box 2
		bodyModel[93].setRotationPoint(-12.5F, -19F, -7.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 48, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[94].setRotationPoint(-22.5F, -21.75F, -2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 2
		bodyModel[95].setRotationPoint(-21.5F, -20.25F, 6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 48, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[96].setRotationPoint(-22.5F, -20.25F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 47, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 162
		bodyModel[97].setRotationPoint(-21.5F, -20.25F, -7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[98].setRotationPoint(41.5F, -19F, -7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[99].setRotationPoint(41.5F, -19F, 2.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 16, 10, 15, 0F); // Box 2
		bodyModel[100].setRotationPoint(25.5F, -16F, -7.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,0F, -5.75F, 0F, 0F, -5.75F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 2
		bodyModel[101].setRotationPoint(25.5F, -21.75F, -7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 173
		bodyModel[102].setRotationPoint(25.5F, -21.75F, -0.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[103].setRotationPoint(28.5F, -17.43F, -6.44F);
		bodyModel[103].rotateAngleX = 0.65449847F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[104].setRotationPoint(35.5F, -17.43F, -6.44F);
		bodyModel[104].rotateAngleX = 0.65449847F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[105].setRotationPoint(28.5F, -21.08F, 1.68F);
		bodyModel[105].rotateAngleX = -0.65449847F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[106].setRotationPoint(35.5F, -21.08F, 1.68F);
		bodyModel[106].rotateAngleX = -0.65449847F;

		bodyModel[107].addBox(0F, 0F, 0F, 3, 3, 15, 0F); // Box 2
		bodyModel[107].setRotationPoint(25.5F, -19F, -7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[108].setRotationPoint(25.5F, -21.75F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 2
		bodyModel[109].setRotationPoint(25.5F, -20.25F, 6.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[110].setRotationPoint(25.5F, -20.25F, -6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 162
		bodyModel[111].setRotationPoint(25.5F, -20.25F, -7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[112].setRotationPoint(41.5F, -21.75F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, 0F, -1F, -1.25F, 0F, -0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.89F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[113].setRotationPoint(41.5F, -20.25F, -7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.89F, 0F, 0F, -1F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.89F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 224
		bodyModel[114].setRotationPoint(41.5F, -20.25F, 6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[115].setRotationPoint(-31.5F, -17F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[116].setRotationPoint(-42.5F, -19F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[117].setRotationPoint(-42.5F, -19F, 2.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 2
		bodyModel[118].setRotationPoint(-42.5F, -21.75F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 2
		bodyModel[119].setRotationPoint(-42.5F, -21.75F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.89F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 2
		bodyModel[120].setRotationPoint(-42.5F, -20.25F, -6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -0.89F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.89F, 0.25F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-42.5F, -20.25F, -7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.89F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1F, -1.25F, 0F, -0.89F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 224
		bodyModel[122].setRotationPoint(-42.5F, -20.25F, 6.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 6, 6, 15, 0F); // Box 2
		bodyModel[123].setRotationPoint(-41.5F, -19F, -7.5F);

		bodyModel[124].addShapeBox(0F, 0F, -3F, 1, 11, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // front door
		bodyModel[124].setRotationPoint(-31.5F, -17F, -6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[125].setRotationPoint(-35.5F, -18F, -7.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[126].setRotationPoint(-31.5F, -17F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 247
		bodyModel[127].setRotationPoint(-31.5F, -17F, 7.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 247
		bodyModel[128].setRotationPoint(-22.5F, -17F, -10F);

		bodyModel[129].addShapeBox(-1F, 0F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // rear door
		bodyModel[129].setRotationPoint(-21.5F, -17F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 2
		bodyModel[130].setRotationPoint(-41.5F, -20.25F, 6.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 162
		bodyModel[131].setRotationPoint(-41.5F, -20.25F, -7.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 13, 14, 0F); // Box 2
		bodyModel[132].setRotationPoint(-22.5F, -19F, -7.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[133].setRotationPoint(-18F, -18F, 6.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 15, 0F); // Box 2
		bodyModel[134].setRotationPoint(-17.5F, -19F, -7.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[135].setRotationPoint(-30.5F, -21.75F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162
		bodyModel[136].setRotationPoint(-31.5F, -20.25F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 247
		bodyModel[137].setRotationPoint(-22.5F, -19.25F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 247
		bodyModel[138].setRotationPoint(-31.5F, -19.25F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
		bodyModel[139].setRotationPoint(-22.5F, -19F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 247
		bodyModel[140].setRotationPoint(-22.5F, -18.5F, -8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[141].setRotationPoint(-31.5F, -19F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 162
		bodyModel[142].setRotationPoint(-31.5F, -18.5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
		bodyModel[143].setRotationPoint(-22.5F, -19.5F, -7.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 162
		bodyModel[144].setRotationPoint(-31.5F, -19.5F, -7.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 2
		bodyModel[145].setRotationPoint(-35.5F, -19F, -7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 294
		bodyModel[146].setRotationPoint(-31.5F, -20.25F, 6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 295
		bodyModel[147].setRotationPoint(-31.5F, -19.25F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 1.25F, -1F, 0F, 1.25F, -1F); // Box 296
		bodyModel[148].setRotationPoint(-30.5F, -19.25F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 297
		bodyModel[149].setRotationPoint(-31.5F, -19F, 7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
		bodyModel[150].setRotationPoint(-31.5F, -18.5F, 7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		bodyModel[151].setRotationPoint(-31.5F, -19.5F, 6.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 300
		bodyModel[152].setRotationPoint(-21.5F, -19F, 6.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[153].setRotationPoint(-22.5F, -19F, 7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		bodyModel[154].setRotationPoint(-22.5F, -18.5F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 305
		bodyModel[155].setRotationPoint(-22.5F, -19.5F, 6.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.06F, 0F, 0.125F, 0.06F, 0F, 0.125F, 0.06F, -0.75F, 0.125F, 0.06F, -0.75F, -0.875F, 0.185F, 0F, -0.875F, 0.185F, 0F, -0.875F, 0.185F, -0.75F, -0.875F, 0.185F); // Box 2
		bodyModel[156].setRotationPoint(-43F, -16F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.125F, -0.815F, 0F, 0.125F, -0.815F, 0F, -0.125F, -0.06F, -0.75F, -0.125F, -0.06F, -0.75F, -0.31F, 0.125F, 0F, -0.31F, 0.125F, 0F, -0.185F, -0.875F, -0.75F, -0.185F, -0.875F); // Box 2
		bodyModel[157].setRotationPoint(-43F, -18.75F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.625F, 0.185F, 0F, -0.625F, 0.185F, 0F, -0.625F, 0.185F, -0.75F, -0.625F, 0.185F, -0.75F, -0.125F, 0.06F, 0F, -0.125F, 0.06F, 0F, -0.125F, 0.06F, -0.75F, -0.125F, 0.06F); // Box 2
		bodyModel[158].setRotationPoint(-43F, -19.5F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.06F, 0.125F, 0F, 0.06F, 0.125F, 0F, -0.065F, -0.875F, -0.75F, -0.065F, -0.875F, -0.75F, 0.31F, 0.125F, 0F, 0.31F, 0.125F, 0F, 0.185F, -0.875F, -0.75F, 0.185F, -0.875F); // Box 2
		bodyModel[159].setRotationPoint(-43F, -18F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.065F, -0.875F, 0F, -0.065F, -0.875F, 0F, 0.06F, 0.125F, -0.75F, 0.06F, 0.125F, -0.75F, 0.185F, -0.875F, 0F, 0.185F, -0.875F, 0F, 0.31F, 0.125F, -0.75F, 0.31F, 0.125F); // Box 334
		bodyModel[160].setRotationPoint(-43F, -18F, 0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.31F, 0.125F, 0F, -0.31F, 0.125F, 0F, -0.185F, -0.875F, -0.75F, -0.185F, -0.875F, -0.75F, 0.125F, -0.815F, 0F, 0.125F, -0.815F, 0F, -0.125F, -0.06F, -0.75F, -0.125F, -0.06F); // Box 2
		bodyModel[161].setRotationPoint(-43F, -17F, -1.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.125F, -0.06F, 0F, -0.125F, -0.06F, 0F, 0.125F, -0.815F, -0.75F, 0.125F, -0.815F, -0.75F, -0.185F, -0.875F, 0F, -0.185F, -0.875F, 0F, -0.31F, 0.125F, -0.75F, -0.31F, 0.125F); // Box 336
		bodyModel[162].setRotationPoint(-43F, -18.75F, 0.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.185F, -0.875F, 0F, -0.185F, -0.875F, 0F, -0.31F, 0.125F, -0.75F, -0.31F, 0.125F, -0.75F, -0.125F, -0.06F, 0F, -0.125F, -0.06F, 0F, 0.125F, -0.815F, -0.75F, 0.125F, -0.815F); // Box 337
		bodyModel[163].setRotationPoint(-43F, -17F, 0.5F);

		bodyModel[164].addShapeBox(0F, -1.41F, -1F, 1, 2, 2, 0F,-0.125F, -0.2F, -0.45F, -0.75F, -0.2F, -0.45F, -0.75F, -0.2F, -0.45F, -0.125F, -0.2F, -0.45F, -0.125F, -0.7F, -0.45F, -0.75F, -0.7F, -0.45F, -0.75F, -0.7F, -0.45F, -0.125F, -0.7F, -0.45F); // headlight F
		bodyModel[164].setRotationPoint(-42.25F, -17.38F, 0F);

		bodyModel[165].addShapeBox(0F, -0.09F, -1F, 1, 2, 2, 0F,-0.125F, -0.2F, -0.45F, -0.75F, -0.2F, -0.45F, -0.75F, -0.2F, -0.45F, -0.125F, -0.2F, -0.45F, -0.125F, -0.7F, -0.45F, -0.75F, -0.7F, -0.45F, -0.75F, -0.7F, -0.45F, -0.125F, -0.7F, -0.45F); // headlight F
		bodyModel[165].setRotationPoint(-42.25F, -17.38F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F); // Box 2
		bodyModel[166].setRotationPoint(-42.01F, -18F, -1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F); // Box 2
		bodyModel[167].setRotationPoint(-42.01F, -18.75F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F); // Box 2
		bodyModel[168].setRotationPoint(-42.01F, -18.75F, -1.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F); // Box 346
		bodyModel[169].setRotationPoint(-42.01F, -18.75F, 0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F); // Box 2
		bodyModel[170].setRotationPoint(-42.01F, -17F, -0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F); // Box 2
		bodyModel[171].setRotationPoint(-42.01F, -17F, -1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F); // Box 346
		bodyModel[172].setRotationPoint(-42.01F, -17F, 0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 2
		bodyModel[173].setRotationPoint(34.5F, -19F, -7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[174].setRotationPoint(34.5F, -21.75F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F); // Box 2
		bodyModel[175].setRotationPoint(34.5F, -20.25F, 6.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 162
		bodyModel[176].setRotationPoint(34.5F, -20.25F, -7.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 358
		bodyModel[177].setRotationPoint(34.5F, -19F, 7.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[178].setRotationPoint(35.5F, -21.75F, -0.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[179].setRotationPoint(28.5F, -21.75F, -0.5F);

		bodyModel[180].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // marker light FL
		bodyModel[180].setRotationPoint(-40.64F, -16.5F, -7F);
		bodyModel[180].rotateAngleY = 0.52359878F;

		bodyModel[181].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // marker light FR
		bodyModel[181].setRotationPoint(-41.14F, -16.5F, 6.14F);
		bodyModel[181].rotateAngleY = -0.52359878F;

		bodyModel[182].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F); // marker light RL
		bodyModel[182].setRotationPoint(41.5F, -16.5F, -7.5F);
		bodyModel[182].rotateAngleY = -0.52359878F;

		bodyModel[183].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,-0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // marker light RR
		bodyModel[183].setRotationPoint(42.01F, -16.5F, 6.63F);
		bodyModel[183].rotateAngleY = 0.52359878F;

		bodyModel[184].addShapeBox(-1F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 2
		bodyModel[184].setRotationPoint(-40.56F, -19F, -7.17F);
		bodyModel[184].rotateAngleY = 0.33161256F;

		bodyModel[185].addShapeBox(-1F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[185].setRotationPoint(-41.86F, -19F, 3.39F);
		bodyModel[185].rotateAngleY = -0.33161256F;

		bodyModel[186].addShapeBox(-1F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // numberboard type 1 F
		bodyModel[186].setRotationPoint(-40.57F, -19F, -7.17F);
		bodyModel[186].rotateAngleY = 0.33161256F;

		bodyModel[187].addShapeBox(-1F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // numberboard type 1 F
		bodyModel[187].setRotationPoint(-41.87F, -19F, 3.39F);
		bodyModel[187].rotateAngleY = -0.33161256F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // exhaust
		bodyModel[188].setRotationPoint(17.25F, -21.68F, -3F);
		bodyModel[188].rotateAngleX = 0.15707963F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // exhaust
		bodyModel[189].setRotationPoint(17.25F, -21.99F, 1F);
		bodyModel[189].rotateAngleX = -0.15707963F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[190].setRotationPoint(-18F, -22F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.03F, 0F, -0.75F, -0.03F); // Box 2
		bodyModel[191].setRotationPoint(-18F, -21.68F, -3F);
		bodyModel[191].rotateAngleX = 0.30979594F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.03F, 0F, -0.75F, -0.03F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 456
		bodyModel[192].setRotationPoint(-18F, -21.99F, 2.03F);
		bodyModel[192].rotateAngleX = -0.30979594F;

		bodyModel[193].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 2
		bodyModel[193].setRotationPoint(43.5F, -13F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 2
		bodyModel[194].setRotationPoint(43.5F, -6F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 2
		bodyModel[195].setRotationPoint(43.5F, -6F, 10F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[196].setRotationPoint(41.5F, -13F, -11F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[197].setRotationPoint(41.5F, -13F, 10F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 2
		bodyModel[198].setRotationPoint(-43.5F, -13F, -11F);

		bodyModel[199].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 2
		bodyModel[199].setRotationPoint(-43.5F, -6F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 2
		bodyModel[200].setRotationPoint(-43.5F, -6F, 10F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[201].setRotationPoint(-41.5F, -13F, -11F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[202].setRotationPoint(-41.5F, -13F, 10F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 2
		bodyModel[203].setRotationPoint(-16.5F, -5F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 417
		bodyModel[204].setRotationPoint(-16.5F, -5F, 11F);

		bodyModel[205].addBox(0F, 0F, 0F, 35, 1, 0, 0F); // Box 2
		bodyModel[205].setRotationPoint(-16.5F, -6F, -11F);

		bodyModel[206].addBox(0F, 0F, 0F, 35, 1, 0, 0F); // Box 419
		bodyModel[206].setRotationPoint(-16.5F, -6F, 11F);

		bodyModel[207].addBox(0F, 0F, 0F, 10, 7, 0, 0F); // Box 2
		bodyModel[207].setRotationPoint(-41.5F, -13F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 10, 7, 0, 0F); // Box 421
		bodyModel[208].setRotationPoint(-41.5F, -13F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[209].setRotationPoint(-18.5F, -13F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[210].setRotationPoint(-18.5F, -13F, 11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[211].setRotationPoint(19.5F, -13F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 425
		bodyModel[212].setRotationPoint(19.5F, -13F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 63, 7, 0, 0F); // Box 2
		bodyModel[213].setRotationPoint(-21.5F, -13F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 63, 7, 0, 0F); // Box 427
		bodyModel[214].setRotationPoint(-21.5F, -13F, 11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 13, 6, 0, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[215].setRotationPoint(35.5F, -19F, -7.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, -1.25F, 0F, -7F, -1.25F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 1.25F, 0F, -7F, 1.25F, 0F, -7F, 0F, -2F, 0F, 0F, -2F); // Box 162
		bodyModel[216].setRotationPoint(35.5F, -20.25F, -7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[217].setRotationPoint(35.5F, -21.75F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 13, 6, 0, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[218].setRotationPoint(28.5F, -19F, -7.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, -1.25F, 0F, -7F, -1.25F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 1.25F, 0F, -7F, 1.25F, 0F, -7F, 0F, -2F, 0F, 0F, -2F); // Box 162
		bodyModel[219].setRotationPoint(28.5F, -20.25F, -7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[220].setRotationPoint(28.5F, -21.75F, -2F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 13, 6, 0, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 427
		bodyModel[221].setRotationPoint(35.5F, -19F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, -2F, -7F, 0F, -2F, -7F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 429
		bodyModel[222].setRotationPoint(35.5F, -20.25F, 4.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[223].setRotationPoint(35.5F, -21.75F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 13, 6, 0, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F); // Box 432
		bodyModel[224].setRotationPoint(28.5F, -19F, 7.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, -2F, -7F, 0F, -2F, -7F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 434
		bodyModel[225].setRotationPoint(28.5F, -20.25F, 4.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 13, 0, 3, 0F,0F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[226].setRotationPoint(28.5F, -21.75F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.89F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.89F, 0.17F, 0F, 0F, 0.17F, 0F, 0F, 0.17F, -0.5F, -0.5F, 0.17F, -0.5F); // Box 2
		bodyModel[227].setRotationPoint(-42.5F, -21.42F, -6.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 48, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 161
		bodyModel[228].setRotationPoint(-22.5F, -21.75F, -6.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 161
		bodyModel[229].setRotationPoint(-30.5F, -21.75F, -6.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 455
		bodyModel[230].setRotationPoint(-42.5F, -21.75F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.89F, 0F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.89F, 0.25F, 0F); // Box 456
		bodyModel[231].setRotationPoint(-42.5F, -20.25F, 2.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.17F, 0F, -0.89F, -1.17F, 0F, -0.5F, 0.17F, -0.5F, 0F, 0.17F, -0.5F, 0F, 0.17F, 0F, -0.89F, 0.17F, 0F); // Box 458
		bodyModel[232].setRotationPoint(-42.5F, -21.42F, 2.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 48, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 459
		bodyModel[233].setRotationPoint(-22.5F, -21.75F, 2.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 460
		bodyModel[234].setRotationPoint(-30.5F, -21.75F, 2.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[235].setRotationPoint(34.5F, -21.75F, -6.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 462
		bodyModel[236].setRotationPoint(34.5F, -21.75F, 2.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 161
		bodyModel[237].setRotationPoint(25.5F, -21.75F, -6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 459
		bodyModel[238].setRotationPoint(25.5F, -21.75F, 2.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.33F, 0F, -0.5F, -0.33F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[239].setRotationPoint(41.5F, -21.75F, -3F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.89F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -0.89F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 2
		bodyModel[240].setRotationPoint(41.5F, -20.25F, -6.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1.17F, 0F, -0.89F, -1.17F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.17F, 0F, -0.89F, 0.17F, 0F, -0.5F, 0.17F, -0.5F, 0F, 0.17F, -0.5F); // Box 2
		bodyModel[241].setRotationPoint(41.5F, -21.42F, -6.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 13, 0, 9, 0F,0F, -1.5F, 0F, -7F, -1.5F, 0F, -7F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1.5F, 0F, -7F, 1.5F, 0F, -7F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 161
		bodyModel[242].setRotationPoint(28.5F, -21.75F, -6.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 13, 0, 9, 0F,0F, -1.5F, 0F, -7F, -1.5F, 0F, -7F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1.5F, 0F, -7F, 1.5F, 0F, -7F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 161
		bodyModel[243].setRotationPoint(35.5F, -21.75F, -6.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 471
		bodyModel[244].setRotationPoint(41.5F, -21.75F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.89F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 472
		bodyModel[245].setRotationPoint(41.5F, -20.25F, 2.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.89F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.17F, -0.5F, -0.5F, 0.17F, -0.5F, -0.89F, 0.17F, 0F, 0F, 0.17F, 0F); // Box 473
		bodyModel[246].setRotationPoint(41.5F, -21.42F, 2.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 13, 0, 9, 0F,0F, 0F, -4.5F, -7F, 0F, -4.5F, -7F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -4.5F, -7F, 0F, -4.5F, -7F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 474
		bodyModel[247].setRotationPoint(28.5F, -21.75F, -2.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 13, 0, 9, 0F,0F, 0F, -4.5F, -7F, 0F, -4.5F, -7F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -4.5F, -7F, 0F, -4.5F, -7F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 475
		bodyModel[248].setRotationPoint(35.5F, -21.75F, -2.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 11, 7, 0F); // Box 2
		bodyModel[249].setRotationPoint(-30.5F, -17F, -3.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[250].setRotationPoint(-30.5F, -17F, -6.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 11, 7, 0F); // Box 2
		bodyModel[251].setRotationPoint(-23.5F, -17F, -3.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[252].setRotationPoint(-23.5F, -17F, 3.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[253].setRotationPoint(-30.5F, -17F, 3.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[254].setRotationPoint(-23.5F, -17F, -6.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 509
		bodyModel[255].setRotationPoint(-29.82F, -12F, 4.46F);
		bodyModel[255].rotateAngleY = 0.32288591F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.84F, 0F, 0F, -2.84F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -2.84F, 0F, -5F, -2.84F); // Box 509
		bodyModel[256].setRotationPoint(-29.5F, -16F, 3.5F);
		bodyModel[256].rotateAngleY = 0.32288591F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 197
		bodyModel[257].setRotationPoint(-28.5F, -11F, 2.5F);
		bodyModel[257].rotateAngleY = -0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F); // Box 197
		bodyModel[258].setRotationPoint(-27.79F, -12F, 2.5F);
		bodyModel[258].rotateAngleY = -0.78539816F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 197
		bodyModel[259].setRotationPoint(-26.5F, -10.5F, 2.5F);
		bodyModel[259].rotateAngleY = -0.78539816F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F); // Box 197
		bodyModel[260].setRotationPoint(-25.79F, -11.5F, 2.5F);
		bodyModel[260].rotateAngleY = -0.78539816F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 197
		bodyModel[261].setRotationPoint(-26.5F, -10.01F, 2.25F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 197
		bodyModel[262].setRotationPoint(-30.5F, -19F, 5.7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 509
		bodyModel[263].setRotationPoint(-24.4F, -12F, -7.13F);
		bodyModel[263].rotateAngleY = 0.32288591F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 9, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.84F, 0F, 0F, -2.84F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -2.84F, 0F, -5F, -2.84F); // Box 509
		bodyModel[264].setRotationPoint(-22.97F, -16F, -6.65F);
		bodyModel[264].rotateAngleY = 0.32288591F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.84F, 0F, 0F, -2.84F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2.84F, 0F, -2F, -2.84F); // Box 509
		bodyModel[265].setRotationPoint(-23.29F, -17F, -5.7F);
		bodyModel[265].rotateAngleY = 0.32288591F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 197
		bodyModel[266].setRotationPoint(-23.25F, -19F, -7.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 524
		bodyModel[267].setRotationPoint(-26.5F, -11F, -2.5F);
		bodyModel[267].rotateAngleY = -0.78539816F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F); // Box 525
		bodyModel[268].setRotationPoint(-25.79F, -12F, -2.5F);
		bodyModel[268].rotateAngleY = -0.78539816F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 526
		bodyModel[269].setRotationPoint(-28.5F, -10.5F, -2.5F);
		bodyModel[269].rotateAngleY = -0.78539816F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F, -0.125F, -1F, -0.125F); // Box 527
		bodyModel[270].setRotationPoint(-27.79F, -11.5F, -2.5F);
		bodyModel[270].rotateAngleY = -0.78539816F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 528
		bodyModel[271].setRotationPoint(-26.5F, -10.01F, -3.25F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 537
		bodyModel[272].setRotationPoint(-43.5F, -2F, 9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[273].setRotationPoint(41.5F, -2F, -9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 540
		bodyModel[274].setRotationPoint(41.5F, -2F, 9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[275].setRotationPoint(42F, -19.68F, -0.55F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[276].setRotationPoint(42F, -18.36F, -0.55F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, -0.4F, 0F, -0.075F, -0.4F); // headlight R
		bodyModel[277].setRotationPoint(42F, -19.93F, -0.8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[278].setRotationPoint(-42.5F, -19.68F, -0.55F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[279].setRotationPoint(-42.5F, -18.36F, -0.55F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, -0.4F, 0F, -0.075F, -0.4F); // headlight R
		bodyModel[280].setRotationPoint(-42.25F, -19.93F, -0.8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[281].setRotationPoint(5.5F, 1F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.92F, 0F, 0F, -2.92F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, -2.92F, 0F, -0.75F, -2.92F); // Box 2
		bodyModel[282].setRotationPoint(-35F, -21.01F, -5F);
		bodyModel[282].rotateAngleX = 0.32288591F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.92F, 0F, 0F, -2.92F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, -2.92F, 0F, -0.75F, -2.92F); // Box 2
		bodyModel[283].setRotationPoint(-37F, -21.98F, 2.08F);
		bodyModel[283].rotateAngleX = -0.32288591F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 10, 11, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // CP steam generator part
		bodyModel[284].setRotationPoint(-40.5F, -17F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // CP steam generator part
		bodyModel[285].setRotationPoint(-40.5F, -19.25F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // CP steam generator part
		bodyModel[286].setRotationPoint(-40.5F, -19.25F, -8.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[287].setRotationPoint(-40.5F, -19.25F, -7.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CP steam generator part
		bodyModel[288].setRotationPoint(-40.5F, -20.25F, -8.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 10, 11, 4, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // CP steam generator part
		bodyModel[289].setRotationPoint(-40.5F, -17F, 7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // CP steam generator part
		bodyModel[290].setRotationPoint(-40.5F, -19.25F, 9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // CP steam generator part
		bodyModel[291].setRotationPoint(-40.5F, -19.25F, 7.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // CP steam generator part
		bodyModel[292].setRotationPoint(-40.5F, -19.25F, 6.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CP steam generator part
		bodyModel[293].setRotationPoint(-40.5F, -20.25F, 6.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -2F, 0F, 0F, -2F, 0F); // CP steam generator part
		bodyModel[294].setRotationPoint(-39.5F, -20.25F, -9.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // CP steam generator part
		bodyModel[295].setRotationPoint(-39.5F, -20.25F, 6.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // CP box thing
		bodyModel[296].setRotationPoint(21.5F, -22.75F, -4F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // exhaust extension
		bodyModel[297].setRotationPoint(17.25F, -22.68F, -3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // exhaust extension
		bodyModel[298].setRotationPoint(17.25F, -22.68F, 1F);

		bodyModel[299].addBox(0F, 0F, 0F, 5, 13, 14, 0F); // Box 2
		bodyModel[299].setRotationPoint(-35.5F, -19F, -6.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[300].setRotationPoint(-44F, -6F, -4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 700
		bodyModel[301].setRotationPoint(-44F, -6F, 3F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[302].setRotationPoint(43.5F, -6F, -4F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 700
		bodyModel[303].setRotationPoint(43.5F, -6F, 3F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 2
		bodyModel[304].setRotationPoint(-21.5F, -10F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[305].setRotationPoint(-33F, -12.5F, 7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[306].setRotationPoint(-32.5F, -10.5F, 7.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[307].setRotationPoint(-32F, -11.5F, 8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 2
		bodyModel[308].setRotationPoint(-32.51F, -12.25F, 7.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 43
		bodyModel[309].setRotationPoint(-32.5F, -11F, 8.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[310].setRotationPoint(-32F, -8.5F, 8.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 5, 7, 15, 0F); // Box 2
		bodyModel[311].setRotationPoint(-40.5F, -13F, -7.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // CP brake wheel part
		bodyModel[312].setRotationPoint(-41.5F, -12.5F, 4.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // CP brake wheel part
		bodyModel[313].setRotationPoint(-42.01F, -13.25F, 4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // CP brake wheel part
		bodyModel[314].setRotationPoint(-42F, -12F, 5.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // CP brake wheel part
		bodyModel[315].setRotationPoint(-41.5F, -9.5F, 5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // CP brake wheel part
		bodyModel[316].setRotationPoint(-42.5F, -13F, 6.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.67F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.67F, 0F, 0F); // CP brake wheel part
		bodyModel[317].setRotationPoint(-42.5F, -13F, 2.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 2
		bodyModel[318].setRotationPoint(-41.5F, -13F, 4.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 13, 0, 0F); // Box 2
		bodyModel[319].setRotationPoint(-45.5F, -13F, -3F);

		bodyModel[320].addBox(0F, 0F, 0F, 2, 13, 0, 0F); // Box 720
		bodyModel[320].setRotationPoint(-45.5F, -13F, 3F);

		bodyModel[321].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // drop platform F
		bodyModel[321].setRotationPoint(-45.5F, -6F, -3F);

		bodyModel[322].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // drop platform dummy, delete when animated
		bodyModel[322].setRotationPoint(-45.5F, 0F, -3F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 13, 0, 0F); // Box 2
		bodyModel[323].setRotationPoint(43.5F, -13F, -3F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 13, 0, 0F); // Box 720
		bodyModel[324].setRotationPoint(43.5F, -13F, 3F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // drop platform R
		bodyModel[325].setRotationPoint(43.5F, -6F, -3F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // drop platform dummy, delete when animated
		bodyModel[326].setRotationPoint(43.5F, 0F, -3F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[327].setRotationPoint(-42.5F, -19.93F, -0.55F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[328].setRotationPoint(-42.5F, -18.61F, -0.55F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, -0.4F, 0F, -0.075F, -0.4F); // headlight R
		bodyModel[329].setRotationPoint(-42.25F, -20.18F, -0.8F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[330].setRotationPoint(42F, -19.93F, -0.55F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // headlight R
		bodyModel[331].setRotationPoint(42F, -18.61F, -0.55F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.075F, 0F, -0.75F, -0.075F, 0F, -0.75F, -0.075F, -0.4F, 0F, -0.075F, -0.4F); // headlight R
		bodyModel[332].setRotationPoint(42F, -20.18F, -0.8F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 2
		bodyModel[333].setRotationPoint(-21.5F, -11F, -11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		bodyModel[334].setRotationPoint(-44F, -6F, -7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[335].setRotationPoint(-44F, -6F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 736
		bodyModel[336].setRotationPoint(43.5F, -6F, 5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 737
		bodyModel[337].setRotationPoint(43.5F, -6F, 6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[338].setRotationPoint(-44.5F, 0.5F, -2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[339].setRotationPoint(-44.5F, 0.5F, 2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[340].setRotationPoint(43.5F, 0.5F, -2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[341].setRotationPoint(43.5F, 0.5F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 0
		bodyModel[342].setRotationPoint(-44F, -20F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F); // Box 0
		bodyModel[343].setRotationPoint(-44F, -21.25F, 2F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0
		bodyModel[344].setRotationPoint(-43.75F, -19.5F, 2.25F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[345].setRotationPoint(-42F, -21.75F, 2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 470
		bodyModel[346].setRotationPoint(-44F, -21.75F, 2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 0
		bodyModel[347].setRotationPoint(-43.75F, -21F, -0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F); // Box 0
		bodyModel[348].setRotationPoint(-43.75F, -22.25F, -0.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0
		bodyModel[349].setRotationPoint(-43.5F, -20.5F, -0.25F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 470
		bodyModel[350].setRotationPoint(-44F, -22.75F, -0.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 470
		bodyModel[351].setRotationPoint(-42F, -22.25F, -0.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.125F, 0.75F, 0F, 0.125F, 0.75F, 0F, 0.125F, 0.75F, -2.92F, 0.125F, 0.75F, -2.92F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, -2.92F, 1F, -0.75F, -2.92F); // Box 2 cull
		bodyModel[352].setRotationPoint(-34.5F, -21.01F, -5F);
		bodyModel[352].rotateAngleX = 0.32288591F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 0
		bodyModel[353].setRotationPoint(42.75F, -21F, -0.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F); // Box 0
		bodyModel[354].setRotationPoint(42.75F, -22.25F, -0.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0
		bodyModel[355].setRotationPoint(43F, -20.5F, -0.25F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 470
		bodyModel[356].setRotationPoint(41F, -22.75F, -0.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 470
		bodyModel[357].setRotationPoint(41F, -22.25F, -0.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[358].setRotationPoint(-36F, -22.55F, 2.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[359].setRotationPoint(-29.5F, -22.75F, 0F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[360].setRotationPoint(-10.5F, -18F, -8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[361].setRotationPoint(-10.5F, -18F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		bodyModel[362].setRotationPoint(-26.5F, -20.72F, 6.75F);
		bodyModel[362].rotateAngleX = -0.32288591F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 776
		bodyModel[363].setRotationPoint(-29F, -21.67F, 7.07F);
		bodyModel[363].rotateAngleX = -0.32288591F;

		bodyModel[364].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 777
		bodyModel[364].setRotationPoint(-27.5F, -21.35F, 8.02F);
		bodyModel[364].rotateAngleX = -0.32288591F;

		bodyModel[365].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 778
		bodyModel[365].setRotationPoint(-26.5F, -21.99F, 6.12F);
		bodyModel[365].rotateAngleX = -0.32288591F;

		bodyModel[366].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[366].setRotationPoint(-29.5F, -17F, 11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[367].setRotationPoint(-29.5F, -17F, -12F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // exhaust extension
		bodyModel[368].setRotationPoint(17.25F, -22.15F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // exhaust extension
		bodyModel[369].setRotationPoint(17.25F, -22.15F, 1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[370].setRotationPoint(-2.5F, -18F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[371].setRotationPoint(-2.5F, -18F, 7F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[372].setRotationPoint(41.5F, -21F, -3F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[373].setRotationPoint(-44F, -8F, -4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[374].setRotationPoint(43.5F, -8F, 3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[375].setRotationPoint(-30.5F, -16F, -12F);

		bodyModel[376].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[376].setRotationPoint(-28.75F, -15F, -12F);

		bodyModel[377].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[377].setRotationPoint(-24.25F, -15F, -12F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		bodyModel[378].setRotationPoint(-30.5F, -16F, 11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // exhaust extension
		bodyModel[379].setRotationPoint(17.25F, -23.18F, 1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 817
		bodyModel[380].setRotationPoint(17.25F, -23.18F, -3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		bodyModel[381].setRotationPoint(-42.5F, -21F, -3F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 302
		bodyModel[382].setRotationPoint(-21.5F, -20.72F, -6.65F);
		bodyModel[382].rotateAngleX = 0.32288591F;

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[383].setRotationPoint(-21.5F, -21.35F, -7.92F);
		bodyModel[383].rotateAngleX = 0.32288591F;

		bodyModel[384].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[384].setRotationPoint(-21.5F, -21.67F, -6.97F);
		bodyModel[384].rotateAngleX = 0.32288591F;

		bodyModel[385].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471
		bodyModel[385].setRotationPoint(-23.5F, -21.99F, -6.02F);
		bodyModel[385].rotateAngleX = 0.32288591F;

		bodyModel[386].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 834
		bodyModel[386].setRotationPoint(-28.75F, -15F, 11F);

		bodyModel[387].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 835
		bodyModel[387].setRotationPoint(-24.25F, -15F, 11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[388].setRotationPoint(-41.5F, -21.75F, -2F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 161
		bodyModel[389].setRotationPoint(-41.5F, -21.75F, -6.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 457
		bodyModel[390].setRotationPoint(-41.5F, -21.75F, 2.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 11, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[391].setRotationPoint(-41.5F, -20.25F, -6.5F);

		bodyModel[392].addShapeBox(-1F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1F, 0F, 0.4F); // Box 2
		bodyModel[392].setRotationPoint(42.93F, -19F, 3.34F);
		bodyModel[392].rotateAngleY = 0.33161256F;

		bodyModel[393].addShapeBox(-1F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[393].setRotationPoint(41.63F, -19F, -7.11F);
		bodyModel[393].rotateAngleY = -0.33161256F;

		bodyModel[394].addShapeBox(-1F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // numberboard type 1 R
		bodyModel[394].setRotationPoint(43.88F, -19F, 3.66F);
		bodyModel[394].rotateAngleY = 0.33161256F;

		bodyModel[395].addShapeBox(-1F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // numberboard type 1 R
		bodyModel[395].setRotationPoint(42.58F, -19F, -7.44F);
		bodyModel[395].rotateAngleY = -0.33161256F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.84F, 0F, 0F, -2.84F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2.84F, 0F, -2F, -2.84F); // Box 509
		bodyModel[396].setRotationPoint(-29.5F, -17F, 3.5F);
		bodyModel[396].rotateAngleY = 0.32288591F;

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[397].setRotationPoint(22.5F, -13F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 425
		bodyModel[398].setRotationPoint(22.5F, -13F, 11F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, -0.065F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F, 0F, 0.185F, -0.125F); // Box 2
		bodyModel[399].setRotationPoint(42.01F, -19.25F, -1.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F); // Box 2
		bodyModel[400].setRotationPoint(42.01F, -20F, -0.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F); // Box 2
		bodyModel[401].setRotationPoint(42.01F, -20F, -1.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F); // Box 346
		bodyModel[402].setRotationPoint(42.01F, -20F, 0.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.185F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F, 0F, -0.125F, 0.065F); // Box 2
		bodyModel[403].setRotationPoint(42.01F, -18.25F, -0.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F); // Box 2
		bodyModel[404].setRotationPoint(42.01F, -18.25F, -1.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.185F, -0.065F, 0F, -0.185F, -0.065F, 0F, -0.185F, -0.125F, 0F, -0.185F, -0.125F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.065F, 0F, -0.125F, -0.935F, 0F, -0.125F, -0.935F); // Box 346
		bodyModel[405].setRotationPoint(42.01F, -18.25F, 0.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.125F, 0.06F, 0F, 0.125F, 0.06F, 0F, 0.125F, 0.06F, -0.75F, 0.125F, 0.06F, -0.75F, -0.875F, 0.185F, 0F, -0.875F, 0.185F, 0F, -0.875F, 0.185F, -0.75F, -0.875F, 0.185F); // Box 2
		bodyModel[406].setRotationPoint(41.25F, -17.25F, -0.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.125F, -0.815F, 0F, 0.125F, -0.815F, 0F, -0.125F, -0.06F, -0.75F, -0.125F, -0.06F, -0.75F, -0.31F, 0.125F, 0F, -0.31F, 0.125F, 0F, -0.185F, -0.875F, -0.75F, -0.185F, -0.875F); // Box 2
		bodyModel[407].setRotationPoint(41.25F, -20F, -1.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.625F, 0.185F, 0F, -0.625F, 0.185F, 0F, -0.625F, 0.185F, -0.75F, -0.625F, 0.185F, -0.75F, -0.125F, 0.06F, 0F, -0.125F, 0.06F, 0F, -0.125F, 0.06F, -0.75F, -0.125F, 0.06F); // Box 2
		bodyModel[408].setRotationPoint(41.25F, -20.75F, -0.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0.06F, 0.125F, 0F, 0.06F, 0.125F, 0F, -0.065F, -0.875F, -0.75F, -0.065F, -0.875F, -0.75F, 0.31F, 0.125F, 0F, 0.31F, 0.125F, 0F, 0.185F, -0.875F, -0.75F, 0.185F, -0.875F); // Box 2
		bodyModel[409].setRotationPoint(41.25F, -19.25F, -1.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.065F, -0.875F, 0F, -0.065F, -0.875F, 0F, 0.06F, 0.125F, -0.75F, 0.06F, 0.125F, -0.75F, 0.185F, -0.875F, 0F, 0.185F, -0.875F, 0F, 0.31F, 0.125F, -0.75F, 0.31F, 0.125F); // Box 334
		bodyModel[410].setRotationPoint(41.25F, -19.25F, 0.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.31F, 0.125F, 0F, -0.31F, 0.125F, 0F, -0.185F, -0.875F, -0.75F, -0.185F, -0.875F, -0.75F, 0.125F, -0.815F, 0F, 0.125F, -0.815F, 0F, -0.125F, -0.06F, -0.75F, -0.125F, -0.06F); // Box 2
		bodyModel[411].setRotationPoint(41.25F, -18.25F, -1.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.125F, -0.06F, 0F, -0.125F, -0.06F, 0F, 0.125F, -0.815F, -0.75F, 0.125F, -0.815F, -0.75F, -0.185F, -0.875F, 0F, -0.185F, -0.875F, 0F, -0.31F, 0.125F, -0.75F, -0.31F, 0.125F); // Box 336
		bodyModel[412].setRotationPoint(41.25F, -20F, 0.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.185F, -0.875F, 0F, -0.185F, -0.875F, 0F, -0.31F, 0.125F, -0.75F, -0.31F, 0.125F, -0.75F, -0.125F, -0.06F, 0F, -0.125F, -0.06F, 0F, 0.125F, -0.815F, -0.75F, 0.125F, -0.815F); // Box 337
		bodyModel[413].setRotationPoint(41.25F, -18.25F, 0.5F);

		bodyModel[414].addShapeBox(0F, -1.41F, -1F, 1, 2, 2, 0F,0F, -0.2F, -0.45F, -0.875F, -0.2F, -0.45F, -0.875F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.7F, -0.45F, -0.875F, -0.7F, -0.45F, -0.875F, -0.7F, -0.45F, 0F, -0.7F, -0.45F); // headlight R
		bodyModel[414].setRotationPoint(42F, -18.63F, 0F);

		bodyModel[415].addShapeBox(0F, -0.09F, -1F, 1, 2, 2, 0F,0F, -0.2F, -0.45F, -0.875F, -0.2F, -0.45F, -0.875F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.7F, -0.45F, -0.875F, -0.7F, -0.45F, -0.875F, -0.7F, -0.45F, 0F, -0.7F, -0.45F); // headlight R
		bodyModel[415].setRotationPoint(42F, -18.63F, 0F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.01F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[416].setRotationPoint(43.5F, 1.5F, -2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[417].setRotationPoint(43.5F, 5.5F, -3F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[418].setRotationPoint(45.5F, 6.5F, -3F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[419].setRotationPoint(44.5F, 6.5F, -3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[420].setRotationPoint(-44.5F, 1.5F, -2F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[421].setRotationPoint(-44.5F, 5.5F, -3F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[422].setRotationPoint(-46.5F, 6.5F, -3F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[423].setRotationPoint(-45.5F, 6.5F, -3F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 1
		bodyModel[424].setRotationPoint(-43.5F, 1.5F, -2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[425].setRotationPoint(-40.5F, 1.5F, -2F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[426].setRotationPoint(40.5F, 1.5F, -2F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[427].setRotationPoint(39.5F, 1.5F, -2F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.92F, 0F, 0F, -2.92F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, -2.92F, 0F, -0.75F, -2.92F); // Box 2
		bodyModel[428].setRotationPoint(-40F, -21.98F, 2.08F);
		bodyModel[428].rotateAngleX = -0.32288591F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 33, 9, 1, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[429].setRotationPoint(24.5F, -15F, -7.75F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 33, 9, 1, 0F,0F, 0F, -0.75F, -17F, 0F, -0.75F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -17F, 0F, -0.75F, -17F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[430].setRotationPoint(24.5F, -15F, 6.75F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 267
		bodyModel[431].setRotationPoint(-17.5F, -18F, 5.5F);

		bodyModel[432].addBox(0F, 0F, 0F, 5, 4, 11, 0F); // Box 2
		bodyModel[432].setRotationPoint(-17.5F, -18F, -5.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[433].setRotationPoint(-17.5F, -18F, -7.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[434].setRotationPoint(-17.5F, -18F, -7.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // dynamic brake opening plug
		bodyModel[435].setRotationPoint(-17.5F, -18F, -7.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 5, 8, 15, 0F); // Box 2
		bodyModel[436].setRotationPoint(-17.5F, -14F, -7.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, -5F, 0F); // Box 449
		bodyModel[437].setRotationPoint(-17.5F, -18F, 7.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // dynamic brake opening plug
		bodyModel[438].setRotationPoint(-17.5F, -18F, 5.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 162
		bodyModel[439].setRotationPoint(-31.51F, -19F, -8.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.72F, 0F, -0.75F, -0.72F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 162
		bodyModel[440].setRotationPoint(-31.51F, -19.25F, -9.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 162
		bodyModel[441].setRotationPoint(-21.49F, -19F, -8.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.72F, 0F, -0.75F, -0.72F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 162
		bodyModel[442].setRotationPoint(-21.49F, -19.25F, -9.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 868
		bodyModel[443].setRotationPoint(-31.51F, -19F, 7.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.72F, 0F, -0.75F, -0.72F); // Box 869
		bodyModel[444].setRotationPoint(-31.51F, -19.25F, 8.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 870
		bodyModel[445].setRotationPoint(-21.49F, -19F, 7.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.72F, 0F, -0.75F, -0.72F); // Box 871
		bodyModel[446].setRotationPoint(-21.49F, -19.25F, 8.5F);

		bodyModel[447].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // front door
		bodyModel[447].setRotationPoint(-31.5F, -18F, -6.5F);

		bodyModel[448].addShapeBox(0F, 0F, -3.5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // front door
		bodyModel[448].setRotationPoint(-31.5F, -18F, -6.5F);

		bodyModel[449].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F); // rear door
		bodyModel[449].setRotationPoint(-21.5F, -18F, 6.5F);

		bodyModel[450].addShapeBox(-1F, 0F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // rear door
		bodyModel[450].setRotationPoint(-21.5F, -18F, 6.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[451].setRotationPoint(-33F, -12.5F, 7.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 883
		bodyModel[452].setRotationPoint(-44F, -8F, 3F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyModel[453].setRotationPoint(43.5F, -8F, -4F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // Box 2
		bodyModel[454].setRotationPoint(-41.5F, -13F, -7.5F);

		bodyModel[455].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 2
		bodyModel[455].setRotationPoint(-41.5F, -13F, 6.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[456].setRotationPoint(-42.5F, -13F, 2.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 12, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[457].setRotationPoint(-7.5F, 1.5F, -11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 12, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 2
		bodyModel[458].setRotationPoint(-7.5F, 5F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[459].setRotationPoint(-31.25F, 2F, -1.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[460].setRotationPoint(28.75F, 2F, -1.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[461].setRotationPoint(-30.75F, 1F, -11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
		bodyModel[462].setRotationPoint(-30.75F, 1F, 4F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[463].setRotationPoint(29.25F, 1F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
		bodyModel[464].setRotationPoint(29.25F, 1F, 4F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[465].setRotationPoint(-26.5F, -20.72F, -7.75F);
		bodyModel[465].rotateAngleX = 0.32288591F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[466].setRotationPoint(-26.5F, -21.67F, -8.07F);
		bodyModel[466].rotateAngleX = 0.32288591F;

		bodyModel[467].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 468
		bodyModel[467].setRotationPoint(-27.5F, -21.35F, -9.02F);
		bodyModel[467].rotateAngleX = 0.32288591F;

		bodyModel[468].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471
		bodyModel[468].setRotationPoint(-28.5F, -21.99F, -7.12F);
		bodyModel[468].rotateAngleX = 0.32288591F;

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -3F, 0.5F, -1F, -3F); // Box 2 cull
		bodyModel[469].setRotationPoint(17.75F, -23.68F, -3.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, -3F, -0.5F, -1F, -3F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 793 cull
		bodyModel[470].setRotationPoint(17.75F, -23.68F, -2.5F);

		bodyModel[471].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Box 2
		bodyModel[471].setRotationPoint(-33.5F, -11F, 6F);
	}
	ModelFMTrimountTruck theTruc = new ModelFMTrimountTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 123456){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FM_trimount_Silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.7, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.38, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
		else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FM_trimount_Black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.7, -0.03, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.38, 0, 0);
			theTruc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}