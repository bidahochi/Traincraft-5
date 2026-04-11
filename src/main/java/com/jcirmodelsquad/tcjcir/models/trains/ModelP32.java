//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P42/40
// Model Creator: 
// Created on: 31.10.2020 - 23:38:21
// Last changed on: 31.10.2020 - 23:38:21

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelGenesisTruck;
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

public class ModelP32 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelP32() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[434];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 434, 118, textureX, textureY); // Coupler back
		bodyModel[1] = new ModelRendererTurbo(this, 182, 131, textureX, textureY); // Coupler front
		bodyModel[2] = new ModelRendererTurbo(this, 232, 120, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 182, 130, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 430, 124, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 419, 130, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 458, 105, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 188, 137, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 491, 129, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 486, 140, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 476, 129, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 492, 105, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 459, 92, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 493, 92, textureX, textureY); // Box 12
		bodyModel[15] = new ModelRendererTurbo(this, 290, 61, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 34, 139, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 304, 52, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 304, 91, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 290, 100, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 18, 164, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 20, 155, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 18, 175, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 60, 164, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 62, 155, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 60, 175, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 278, 14, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 297, 29, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 297, 4, textureX, textureY); // Box 103
		bodyModel[30] = new ModelRendererTurbo(this, 347, 34, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 347, 1, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 493, 84, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 477, 92, textureX, textureY, "cull"); // Box 10 cull
		bodyModel[34] = new ModelRendererTurbo(this, 470, 85, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 490, 85, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 461, 106, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 503, 106, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 463, 79, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 489, 76, textureX, textureY); // Box 36
		bodyModel[40] = new ModelRendererTurbo(this, 503, 96, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 461, 96, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 285, 24, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 284, 9, textureX, textureY); // Box 38
		bodyModel[44] = new ModelRendererTurbo(this, 471, 77, textureX, textureY); // Box 36
		bodyModel[45] = new ModelRendererTurbo(this, 495, 78, textureX, textureY); // Box 39
		bodyModel[46] = new ModelRendererTurbo(this, 81, 133, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 462, 137, textureX, textureY); // Box 3
		bodyModel[48] = new ModelRendererTurbo(this, 441, 136, textureX, textureY); // Box 7
		bodyModel[49] = new ModelRendererTurbo(this, 1, 133, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 29, 140, textureX, textureY); // Box 9
		bodyModel[51] = new ModelRendererTurbo(this, 203, 123, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 21, 129, textureX, textureY); // Box 9
		bodyModel[53] = new ModelRendererTurbo(this, 41, 141, textureX, textureY); // Box 9
		bodyModel[54] = new ModelRendererTurbo(this, 53, 141, textureX, textureY); // Box 9
		bodyModel[55] = new ModelRendererTurbo(this, 194, 115, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 202, 127, textureX, textureY); // Box 5
		bodyModel[57] = new ModelRendererTurbo(this, 82, 122, textureX, textureY); // Box 2
		bodyModel[58] = new ModelRendererTurbo(this, 0, 122, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 240, 61, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 270, 70, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 268, 58, textureX, textureY); // Box 2 Fireman side door swing left
		bodyModel[62] = new ModelRendererTurbo(this, 262, 60, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 284, 60, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 269, 51, textureX, textureY); // Box 2 Fireman side door swing left
		bodyModel[65] = new ModelRendererTurbo(this, 276, 51, textureX, textureY); // Box 2 Fireman side door swing left
		bodyModel[66] = new ModelRendererTurbo(this, 268, 97, textureX, textureY); // Box 2 Engineer side door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 269, 90, textureX, textureY); // Box 2 Engineer side door swing right
		bodyModel[68] = new ModelRendererTurbo(this, 276, 90, textureX, textureY); // Box 2 Engineer side door swing right
		bodyModel[69] = new ModelRendererTurbo(this, 240, 100, textureX, textureY); // Box 2
		bodyModel[70] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 217, 118, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 259, 61, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 287, 61, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 238, 54, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 238, 93, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 270, 75, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 279, 71, textureX, textureY); // Box 2
		bodyModel[79] = new ModelRendererTurbo(this, 270, 73, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 270, 109, textureX, textureY); // Box 2
		bodyModel[81] = new ModelRendererTurbo(this, 262, 99, textureX, textureY); // Box 2
		bodyModel[82] = new ModelRendererTurbo(this, 284, 99, textureX, textureY); // Box 2
		bodyModel[83] = new ModelRendererTurbo(this, 259, 100, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 287, 100, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 270, 114, textureX, textureY); // Box 2
		bodyModel[86] = new ModelRendererTurbo(this, 265, 110, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 279, 110, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 270, 112, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 81, 111, textureX, textureY); // Box 2
		bodyModel[90] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 21, 119, textureX, textureY); // Box 9
		bodyModel[92] = new ModelRendererTurbo(this, 63, 119, textureX, textureY); // Box 9
		bodyModel[93] = new ModelRendererTurbo(this, 32, 133, textureX, textureY); // Box 9
		bodyModel[94] = new ModelRendererTurbo(this, 40, 133, textureX, textureY); // Box 9
		bodyModel[95] = new ModelRendererTurbo(this, 63, 129, textureX, textureY); // Box 9
		bodyModel[96] = new ModelRendererTurbo(this, 66, 133, textureX, textureY); // Box 9
		bodyModel[97] = new ModelRendererTurbo(this, 52, 133, textureX, textureY); // Box 9
		bodyModel[98] = new ModelRendererTurbo(this, 57, 140, textureX, textureY); // Box 9
		bodyModel[99] = new ModelRendererTurbo(this, 24, 130, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 74, 130, textureX, textureY); // Box 2
		bodyModel[101] = new ModelRendererTurbo(this, 32, 121, textureX, textureY); // Box 9
		bodyModel[102] = new ModelRendererTurbo(this, 52, 121, textureX, textureY); // Box 9
		bodyModel[103] = new ModelRendererTurbo(this, 52, 113, textureX, textureY); // Box 9
		bodyModel[104] = new ModelRendererTurbo(this, 262, 90, textureX, textureY); // Box 2 Engineer side door
		bodyModel[105] = new ModelRendererTurbo(this, 262, 51, textureX, textureY); // Box 2 Engineer side door
		bodyModel[106] = new ModelRendererTurbo(this, 257, 55, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 285, 55, textureX, textureY); // Box 2
		bodyModel[108] = new ModelRendererTurbo(this, 257, 94, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 285, 94, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 37, 134, textureX, textureY); // Box 2
		bodyModel[111] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 2
		bodyModel[112] = new ModelRendererTurbo(this, 61, 131, textureX, textureY); // Box 2
		bodyModel[113] = new ModelRendererTurbo(this, 61, 134, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 82, 137, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 2, 137, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 21, 141, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 73, 141, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 19, 130, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 79, 130, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 32, 89, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[121] = new ModelRendererTurbo(this, 62, 111, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 52, 89, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[123] = new ModelRendererTurbo(this, 27, 95, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 44, 121, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 48, 114, textureX, textureY, "lamp"); // Box 2 headlight glow
		bodyModel[126] = new ModelRendererTurbo(this, 48, 114, textureX, textureY, "lamp"); // Box 2 headlight glow
		bodyModel[127] = new ModelRendererTurbo(this, 53, 111, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 36, 113, textureX, textureY); // Box 9
		bodyModel[129] = new ModelRendererTurbo(this, 26, 111, textureX, textureY); // Box 2
		bodyModel[130] = new ModelRendererTurbo(this, 45, 111, textureX, textureY); // Box 2
		bodyModel[131] = new ModelRendererTurbo(this, 6, 95, textureX, textureY); // Box 158
		bodyModel[132] = new ModelRendererTurbo(this, 86, 95, textureX, textureY); // Box 159
		bodyModel[133] = new ModelRendererTurbo(this, 76, 95, textureX, textureY); // Box 2
		bodyModel[134] = new ModelRendererTurbo(this, 81, 95, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 22, 95, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 17, 95, textureX, textureY); // Box 2
		bodyModel[137] = new ModelRendererTurbo(this, 71, 95, textureX, textureY); // Box 2
		bodyModel[138] = new ModelRendererTurbo(this, 64, 122, textureX, textureY, BoxName.ditch); // Box 5 ditchlight glow
		bodyModel[139] = new ModelRendererTurbo(this, 32, 122, textureX, textureY, BoxName.ditch); // Box 5 ditchlight glow
		bodyModel[140] = new ModelRendererTurbo(this, 24, 124, textureX, textureY, "lamp"); // Box 5 marker light glow
		bodyModel[141] = new ModelRendererTurbo(this, 74, 122, textureX, textureY, "lamp"); // Box 5 marker light glow
		bodyModel[142] = new ModelRendererTurbo(this, 53, 92, textureX, textureY, "lamp"); // Box 2 Headlight 2 glow
		bodyModel[143] = new ModelRendererTurbo(this, 43, 93, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[144] = new ModelRendererTurbo(this, 43, 93, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[145] = new ModelRendererTurbo(this, 42, 83, textureX, textureY); // Box 2 
		bodyModel[146] = new ModelRendererTurbo(this, 52, 83, textureX, textureY); // Box 2 
		bodyModel[147] = new ModelRendererTurbo(this, 69, 80, textureX, textureY); // Box 38
		bodyModel[148] = new ModelRendererTurbo(this, 70, 85, textureX, textureY); // Box 38
		bodyModel[149] = new ModelRendererTurbo(this, 61, 79, textureX, textureY); // Box 38
		bodyModel[150] = new ModelRendererTurbo(this, 61, 84, textureX, textureY); // Box 38
		bodyModel[151] = new ModelRendererTurbo(this, 33, 79, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 33, 84, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 61, 74, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 2 
		bodyModel[155] = new ModelRendererTurbo(this, 52, 78, textureX, textureY, "cull"); // Box 2 cull
		bodyModel[156] = new ModelRendererTurbo(this, 69, 75, textureX, textureY); // Box 39
		bodyModel[157] = new ModelRendererTurbo(this, 299, 56, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 82, 86, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 77, 86, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 25, 80, textureX, textureY); // Box 38
		bodyModel[161] = new ModelRendererTurbo(this, 26, 85, textureX, textureY); // Box 38
		bodyModel[162] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 39
		bodyModel[163] = new ModelRendererTurbo(this, 299, 95, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 16, 86, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 21, 86, textureX, textureY); // Box 2
		bodyModel[166] = new ModelRendererTurbo(this, 33, 74, textureX, textureY); // Box 38
		bodyModel[167] = new ModelRendererTurbo(this, 69, 70, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 25, 70, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 123, 83, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 165, 117, textureX, textureY); // Box 2
		bodyModel[171] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 110, 105, textureX, textureY); // Box 2
		bodyModel[173] = new ModelRendererTurbo(this, 92, 219, textureX, textureY); // Box 2
		bodyModel[174] = new ModelRendererTurbo(this, 94, 225, textureX, textureY); // Box 2
		bodyModel[175] = new ModelRendererTurbo(this, 122, 225, textureX, textureY); // Box 2
		bodyModel[176] = new ModelRendererTurbo(this, 412, 65, textureX, textureY); // Box 2
		bodyModel[177] = new ModelRendererTurbo(this, 428, 65, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 409, 66, textureX, textureY); // Box 2
		bodyModel[179] = new ModelRendererTurbo(this, 431, 66, textureX, textureY); // Box 2
		bodyModel[180] = new ModelRendererTurbo(this, 412, 104, textureX, textureY); // Box 2
		bodyModel[181] = new ModelRendererTurbo(this, 428, 104, textureX, textureY); // Box 2
		bodyModel[182] = new ModelRendererTurbo(this, 431, 105, textureX, textureY); // Box 2
		bodyModel[183] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 2
		bodyModel[184] = new ModelRendererTurbo(this, 409, 99, textureX, textureY); // Box 2
		bodyModel[185] = new ModelRendererTurbo(this, 415, 98, textureX, textureY); // Box 2
		bodyModel[186] = new ModelRendererTurbo(this, 434, 100, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 429, 99, textureX, textureY); // Box 2
		bodyModel[188] = new ModelRendererTurbo(this, 409, 60, textureX, textureY); // Box 2
		bodyModel[189] = new ModelRendererTurbo(this, 415, 59, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 434, 61, textureX, textureY); // Box 2
		bodyModel[191] = new ModelRendererTurbo(this, 429, 60, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 415, 62, textureX, textureY); // Box 2 rear door swing right
		bodyModel[193] = new ModelRendererTurbo(this, 415, 101, textureX, textureY); // Box 2 rear door swing left
		bodyModel[194] = new ModelRendererTurbo(this, 363, 10, textureX, textureY); // Box 37
		bodyModel[195] = new ModelRendererTurbo(this, 386, 14, textureX, textureY); // Box 37
		bodyModel[196] = new ModelRendererTurbo(this, 392, 24, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 392, 9, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 479, 14, textureX, textureY); // Box 37
		bodyModel[199] = new ModelRendererTurbo(this, 485, 22, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 485, 9, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 430, 38, textureX, textureY, "cull"); // Box 37 cull
		bodyModel[202] = new ModelRendererTurbo(this, 420, 38, textureX, textureY); // Box 2
		bodyModel[203] = new ModelRendererTurbo(this, 377, 222, textureX, textureY); // Box 2 radiator boxes
		bodyModel[204] = new ModelRendererTurbo(this, 445, 217, textureX, textureY); // Box 2 radiator boxes
		bodyModel[205] = new ModelRendererTurbo(this, 327, 217, textureX, textureY); // Box 2 radiator boxes
		bodyModel[206] = new ModelRendererTurbo(this, 444, 223, textureX, textureY); // Box 2 radiator boxes
		bodyModel[207] = new ModelRendererTurbo(this, 326, 223, textureX, textureY); // Box 2 radiator boxes
		bodyModel[208] = new ModelRendererTurbo(this, 477, 108, textureX, textureY); // Box 10 
		bodyModel[209] = new ModelRendererTurbo(this, 178, 247, textureX, textureY); // Box 31
		bodyModel[210] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 33
		bodyModel[211] = new ModelRendererTurbo(this, 179, 203, textureX, textureY); // Box 16
		bodyModel[212] = new ModelRendererTurbo(this, 179, 194, textureX, textureY); // Box 17
		bodyModel[213] = new ModelRendererTurbo(this, 233, 202, textureX, textureY); // Box 18
		bodyModel[214] = new ModelRendererTurbo(this, 233, 187, textureX, textureY); // Box 19
		bodyModel[215] = new ModelRendererTurbo(this, 174, 212, textureX, textureY); // Box 20
		bodyModel[216] = new ModelRendererTurbo(this, 154, 221, textureX, textureY); // Box 45
		bodyModel[217] = new ModelRendererTurbo(this, 153, 214, textureX, textureY); // Box 46
		bodyModel[218] = new ModelRendererTurbo(this, 148, 227, textureX, textureY); // Box 47
		bodyModel[219] = new ModelRendererTurbo(this, 154, 208, textureX, textureY); // Box 48
		bodyModel[220] = new ModelRendererTurbo(this, 154, 245, textureX, textureY); // Box 49
		bodyModel[221] = new ModelRendererTurbo(this, 154, 239, textureX, textureY); // Box 50
		bodyModel[222] = new ModelRendererTurbo(this, 156, 202, textureX, textureY); // Box 51
		bodyModel[223] = new ModelRendererTurbo(this, 133, 240, textureX, textureY); // Box 54
		bodyModel[224] = new ModelRendererTurbo(this, 138, 217, textureX, textureY); // Box 56
		bodyModel[225] = new ModelRendererTurbo(this, 168, 204, textureX, textureY); // Box 66
		bodyModel[226] = new ModelRendererTurbo(this, 144, 204, textureX, textureY); // Box 67
		bodyModel[227] = new ModelRendererTurbo(this, 164, 191, textureX, textureY); // Box 69
		bodyModel[228] = new ModelRendererTurbo(this, 151, 192, textureX, textureY); // Box 75
		bodyModel[229] = new ModelRendererTurbo(this, 146, 191, textureX, textureY); // Box 34
		bodyModel[230] = new ModelRendererTurbo(this, 157, 185, textureX, textureY); // Box 71
		bodyModel[231] = new ModelRendererTurbo(this, 232, 240, textureX, textureY); // Box 36
		bodyModel[232] = new ModelRendererTurbo(this, 264, 240, textureX, textureY); // Box 37
		bodyModel[233] = new ModelRendererTurbo(this, 232, 225, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 234, 234, textureX, textureY); // Box 39
		bodyModel[235] = new ModelRendererTurbo(this, 232, 219, textureX, textureY); // Box 40
		bodyModel[236] = new ModelRendererTurbo(this, 240, 224, textureX, textureY); // Box 41
		bodyModel[237] = new ModelRendererTurbo(this, 258, 219, textureX, textureY); // Box 42
		bodyModel[238] = new ModelRendererTurbo(this, 256, 234, textureX, textureY); // Box 43
		bodyModel[239] = new ModelRendererTurbo(this, 258, 225, textureX, textureY); // Box 44
		bodyModel[240] = new ModelRendererTurbo(this, 246, 240, textureX, textureY); // Box 45
		bodyModel[241] = new ModelRendererTurbo(this, 238, 242, textureX, textureY); // Box 46
		bodyModel[242] = new ModelRendererTurbo(this, 257, 243, textureX, textureY); // Box 47
		bodyModel[243] = new ModelRendererTurbo(this, 252, 250, textureX, textureY); // Box 48
		bodyModel[244] = new ModelRendererTurbo(this, 252, 245, textureX, textureY); // Box 49
		bodyModel[245] = new ModelRendererTurbo(this, 247, 250, textureX, textureY); // Box 50
		bodyModel[246] = new ModelRendererTurbo(this, 221, 230, textureX, textureY); // Box 51
		bodyModel[247] = new ModelRendererTurbo(this, 271, 230, textureX, textureY); // Box 79
		bodyModel[248] = new ModelRendererTurbo(this, 232, 182, textureX, textureY); // Box 80
		bodyModel[249] = new ModelRendererTurbo(this, 232, 197, textureX, textureY); // Box 81
		bodyModel[250] = new ModelRendererTurbo(this, 228, 251, textureX, textureY); // Box 82
		bodyModel[251] = new ModelRendererTurbo(this, 152, 251, textureX, textureY); // Box 83
		bodyModel[252] = new ModelRendererTurbo(this, 286, 234, textureX, textureY); // Box 84
		bodyModel[253] = new ModelRendererTurbo(this, 300, 234, textureX, textureY); // Box 86
		bodyModel[254] = new ModelRendererTurbo(this, 287, 229, textureX, textureY); // Box 87
		bodyModel[255] = new ModelRendererTurbo(this, 293, 229, textureX, textureY); // Box 88
		bodyModel[256] = new ModelRendererTurbo(this, 307, 229, textureX, textureY); // Box 89
		bodyModel[257] = new ModelRendererTurbo(this, 301, 229, textureX, textureY); // Box 90
		bodyModel[258] = new ModelRendererTurbo(this, 288, 239, textureX, textureY); // Box 91
		bodyModel[259] = new ModelRendererTurbo(this, 302, 239, textureX, textureY); // Box 92
		bodyModel[260] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 101
		bodyModel[261] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 102
		bodyModel[262] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 103
		bodyModel[263] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 104
		bodyModel[264] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 105
		bodyModel[265] = new ModelRendererTurbo(this, 275, 203, textureX, textureY); // Box 106
		bodyModel[266] = new ModelRendererTurbo(this, 286, 247, textureX, textureY); // Box 109
		bodyModel[267] = new ModelRendererTurbo(this, 300, 247, textureX, textureY); // Box 110
		bodyModel[268] = new ModelRendererTurbo(this, 287, 242, textureX, textureY); // Box 111
		bodyModel[269] = new ModelRendererTurbo(this, 293, 242, textureX, textureY); // Box 112
		bodyModel[270] = new ModelRendererTurbo(this, 307, 242, textureX, textureY); // Box 113
		bodyModel[271] = new ModelRendererTurbo(this, 301, 242, textureX, textureY); // Box 114
		bodyModel[272] = new ModelRendererTurbo(this, 288, 252, textureX, textureY); // Box 115
		bodyModel[273] = new ModelRendererTurbo(this, 302, 252, textureX, textureY); // Box 116
		bodyModel[274] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 117
		bodyModel[275] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 118
		bodyModel[276] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 119
		bodyModel[277] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 120
		bodyModel[278] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 121
		bodyModel[279] = new ModelRendererTurbo(this, 275, 188, textureX, textureY); // Box 122
		bodyModel[280] = new ModelRendererTurbo(this, 202, 181, textureX, textureY); // Box 2
		bodyModel[281] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 150, 61, textureX, textureY); // Box 2
		bodyModel[283] = new ModelRendererTurbo(this, 103, 72, textureX, textureY); // Box 2
		bodyModel[284] = new ModelRendererTurbo(this, 95, 47, textureX, textureY); // Box 2
		bodyModel[285] = new ModelRendererTurbo(this, 97, 54, textureX, textureY); // Box 2 refrigerator
		bodyModel[286] = new ModelRendererTurbo(this, 129, 40, textureX, textureY); // Box 2
		bodyModel[287] = new ModelRendererTurbo(this, 120, 73, textureX, textureY); // Box 2
		bodyModel[288] = new ModelRendererTurbo(this, 158, 74, textureX, textureY); // Box 2
		bodyModel[289] = new ModelRendererTurbo(this, 184, 60, textureX, textureY); // Box 2
		bodyModel[290] = new ModelRendererTurbo(this, 137, 71, textureX, textureY); // Box 2
		bodyModel[291] = new ModelRendererTurbo(this, 132, 61, textureX, textureY); // Box 2
		bodyModel[292] = new ModelRendererTurbo(this, 173, 72, textureX, textureY); // Box 2
		bodyModel[293] = new ModelRendererTurbo(this, 149, 53, textureX, textureY); // Box 2
		bodyModel[294] = new ModelRendererTurbo(this, 159, 53, textureX, textureY); // Box 2
		bodyModel[295] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 2
		bodyModel[296] = new ModelRendererTurbo(this, 149, 40, textureX, textureY); // Box 2
		bodyModel[297] = new ModelRendererTurbo(this, 121, 40, textureX, textureY); // Box 2
		bodyModel[298] = new ModelRendererTurbo(this, 125, 32, textureX, textureY); // Box 2
		bodyModel[299] = new ModelRendererTurbo(this, 140, 32, textureX, textureY); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Box 2
		bodyModel[301] = new ModelRendererTurbo(this, 246, 48, textureX, textureY); // Box 2
		bodyModel[302] = new ModelRendererTurbo(this, 246, 87, textureX, textureY); // Box 2
		bodyModel[303] = new ModelRendererTurbo(this, 140, 61, textureX, textureY); // Box 2
		bodyModel[304] = new ModelRendererTurbo(this, 148, 51, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 230, 145, textureX, textureY); // Box 4
		bodyModel[306] = new ModelRendererTurbo(this, 426, 145, textureX, textureY); // Box 4
		bodyModel[307] = new ModelRendererTurbo(this, 237, 146, textureX, textureY); // Box 4
		bodyModel[308] = new ModelRendererTurbo(this, 273, 158, textureX, textureY); // Box 2
		bodyModel[309] = new ModelRendererTurbo(this, 257, 163, textureX, textureY); // Box 2
		bodyModel[310] = new ModelRendererTurbo(this, 319, 163, textureX, textureY); // Box 2
		bodyModel[311] = new ModelRendererTurbo(this, 358, 158, textureX, textureY); // Box 2
		bodyModel[312] = new ModelRendererTurbo(this, 347, 163, textureX, textureY); // Box 2
		bodyModel[313] = new ModelRendererTurbo(this, 409, 163, textureX, textureY); // Box 2
		bodyModel[314] = new ModelRendererTurbo(this, 343, 169, textureX, textureY); // Box 2
		bodyModel[315] = new ModelRendererTurbo(this, 301, 169, textureX, textureY); // Box 2
		bodyModel[316] = new ModelRendererTurbo(this, 303, 191, textureX, textureY); // Box 4
		bodyModel[317] = new ModelRendererTurbo(this, 276, 172, textureX, textureY); // Box 2
		bodyModel[318] = new ModelRendererTurbo(this, 278, 169, textureX, textureY); // Box 2
		bodyModel[319] = new ModelRendererTurbo(this, 278, 169, textureX, textureY); // Box 2
		bodyModel[320] = new ModelRendererTurbo(this, 278, 169, textureX, textureY); // Box 2
		bodyModel[321] = new ModelRendererTurbo(this, 278, 177, textureX, textureY); // Box 2
		bodyModel[322] = new ModelRendererTurbo(this, 278, 177, textureX, textureY); // Box 2
		bodyModel[323] = new ModelRendererTurbo(this, 278, 177, textureX, textureY); // Box 2
		bodyModel[324] = new ModelRendererTurbo(this, 372, 172, textureX, textureY); // Box 2
		bodyModel[325] = new ModelRendererTurbo(this, 374, 169, textureX, textureY); // Box 2
		bodyModel[326] = new ModelRendererTurbo(this, 374, 169, textureX, textureY); // Box 2
		bodyModel[327] = new ModelRendererTurbo(this, 374, 169, textureX, textureY); // Box 2
		bodyModel[328] = new ModelRendererTurbo(this, 374, 177, textureX, textureY); // Box 2
		bodyModel[329] = new ModelRendererTurbo(this, 374, 177, textureX, textureY); // Box 2
		bodyModel[330] = new ModelRendererTurbo(this, 374, 177, textureX, textureY); // Box 2
		bodyModel[331] = new ModelRendererTurbo(this, 260, 171, textureX, textureY); // Box 4
		bodyModel[332] = new ModelRendererTurbo(this, 253, 170, textureX, textureY); // Box 4
		bodyModel[333] = new ModelRendererTurbo(this, 267, 175, textureX, textureY); // Box 4
		bodyModel[334] = new ModelRendererTurbo(this, 273, 170, textureX, textureY); // Box 4
		bodyModel[335] = new ModelRendererTurbo(this, 397, 170, textureX, textureY); // Box 4
		bodyModel[336] = new ModelRendererTurbo(this, 276, 173, textureX, textureY); // Box 4
		bodyModel[337] = new ModelRendererTurbo(this, 394, 173, textureX, textureY); // Box 4
		bodyModel[338] = new ModelRendererTurbo(this, 303, 171, textureX, textureY); // Box 4
		bodyModel[339] = new ModelRendererTurbo(this, 367, 171, textureX, textureY); // Box 4
		bodyModel[340] = new ModelRendererTurbo(this, 298, 173, textureX, textureY); // Box 4
		bodyModel[341] = new ModelRendererTurbo(this, 370, 173, textureX, textureY); // Box 4
		bodyModel[342] = new ModelRendererTurbo(this, 324, 180, textureX, textureY); // Box 2
		bodyModel[343] = new ModelRendererTurbo(this, 323, 181, textureX, textureY); // Box 4
		bodyModel[344] = new ModelRendererTurbo(this, 326, 183, textureX, textureY); // Box 4
		bodyModel[345] = new ModelRendererTurbo(this, 250, 172, textureX, textureY); // Box 4
		bodyModel[346] = new ModelRendererTurbo(this, 462, 151, textureX, textureY, "cull"); // Box 3 Cull
		bodyModel[347] = new ModelRendererTurbo(this, 486, 151, textureX, textureY, "cull"); // Box 3 Cull
		bodyModel[348] = new ModelRendererTurbo(this, 272, 180, textureX, textureY); // Box 2
		bodyModel[349] = new ModelRendererTurbo(this, 343, 183, textureX, textureY); // Box 2
		bodyModel[350] = new ModelRendererTurbo(this, 340, 181, textureX, textureY); // Box 2
		bodyModel[351] = new ModelRendererTurbo(this, 239, 15, textureX, textureY); // Box 37
		bodyModel[352] = new ModelRendererTurbo(this, 257, 15, textureX, textureY); // Box 80
		bodyModel[353] = new ModelRendererTurbo(this, 250, 22, textureX, textureY); // Box 81
		bodyModel[354] = new ModelRendererTurbo(this, 250, 10, textureX, textureY); // Box 82
		bodyModel[355] = new ModelRendererTurbo(this, 248, 19, textureX, textureY); // Box 83
		bodyModel[356] = new ModelRendererTurbo(this, 248, 13, textureX, textureY); // Box 84
		bodyModel[357] = new ModelRendererTurbo(this, 248, 16, textureX, textureY); // Box 85
		bodyModel[358] = new ModelRendererTurbo(this, 319, 10, textureX, textureY); // Box 37
		bodyModel[359] = new ModelRendererTurbo(this, 401, 29, textureX, textureY); // Box 39
		bodyModel[360] = new ModelRendererTurbo(this, 401, 4, textureX, textureY); // Box 103
		bodyModel[361] = new ModelRendererTurbo(this, 354, 26, textureX, textureY); // Box 37
		bodyModel[362] = new ModelRendererTurbo(this, 338, 8, textureX, textureY); // Box 37
		bodyModel[363] = new ModelRendererTurbo(this, 354, 5, textureX, textureY); // Box 37
		bodyModel[364] = new ModelRendererTurbo(this, 35, 50, textureX, textureY); // Box 9
		bodyModel[365] = new ModelRendererTurbo(this, 53, 50, textureX, textureY); // Box 9
		bodyModel[366] = new ModelRendererTurbo(this, 70, 57, textureX, textureY); // Box 2
		bodyModel[367] = new ModelRendererTurbo(this, 32, 57, textureX, textureY); // Box 2
		bodyModel[368] = new ModelRendererTurbo(this, 73, 58, textureX, textureY); // Box 2
		bodyModel[369] = new ModelRendererTurbo(this, 29, 58, textureX, textureY); // Box 2
		bodyModel[370] = new ModelRendererTurbo(this, 346, 41, textureX, textureY); // Box 2
		bodyModel[371] = new ModelRendererTurbo(this, 355, 41, textureX, textureY); // Box 2
		bodyModel[372] = new ModelRendererTurbo(this, 364, 41, textureX, textureY); // Box 2
		bodyModel[373] = new ModelRendererTurbo(this, 379, 41, textureX, textureY); // Box 2
		bodyModel[374] = new ModelRendererTurbo(this, 390, 41, textureX, textureY); // Box 2
		bodyModel[375] = new ModelRendererTurbo(this, 343, 80, textureX, textureY); // Box 2
		bodyModel[376] = new ModelRendererTurbo(this, 364, 80, textureX, textureY); // Box 2
		bodyModel[377] = new ModelRendererTurbo(this, 379, 80, textureX, textureY); // Box 2
		bodyModel[378] = new ModelRendererTurbo(this, 390, 80, textureX, textureY); // Box 2
		bodyModel[379] = new ModelRendererTurbo(this, 441, 69, textureX, textureY); // Box 2
		bodyModel[380] = new ModelRendererTurbo(this, 441, 54, textureX, textureY); // Box 2
		bodyModel[381] = new ModelRendererTurbo(this, 441, 69, textureX, textureY); // Box 2
		bodyModel[382] = new ModelRendererTurbo(this, 441, 54, textureX, textureY); // Box 2
		bodyModel[383] = new ModelRendererTurbo(this, 481, 78, textureX, textureY, "lamp"); // Box 2 rear headlight glow
		bodyModel[384] = new ModelRendererTurbo(this, 481, 78, textureX, textureY, "lamp"); // Box 2 rear headlight glow
		bodyModel[385] = new ModelRendererTurbo(this, 479, 83, textureX, textureY, "cull"); // Box 10 cull
		bodyModel[386] = new ModelRendererTurbo(this, 469, 94, textureX, textureY, "lamp"); // Box 2 rear marker lightt glow
		bodyModel[387] = new ModelRendererTurbo(this, 493, 94, textureX, textureY, "lamp"); // Box 2 rear marker lightt glow
		bodyModel[388] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 2 front ladders
		bodyModel[389] = new ModelRendererTurbo(this, 243, 122, textureX, textureY); // Box 2 front ladders
		bodyModel[390] = new ModelRendererTurbo(this, 421, 117, textureX, textureY); // Box 2 back ladders
		bodyModel[391] = new ModelRendererTurbo(this, 421, 122, textureX, textureY); // Box 2 back ladders
		bodyModel[392] = new ModelRendererTurbo(this, 269, 78, textureX, textureY); // Box 2 front ladders
		bodyModel[393] = new ModelRendererTurbo(this, 269, 83, textureX, textureY); // Box 2 front ladders
		bodyModel[394] = new ModelRendererTurbo(this, 416, 78, textureX, textureY); // Box 2 back ladders
		bodyModel[395] = new ModelRendererTurbo(this, 416, 83, textureX, textureY); // Box 2 back ladders
		bodyModel[396] = new ModelRendererTurbo(this, 232, 14, textureX, textureY); // Box 37
		bodyModel[397] = new ModelRendererTurbo(this, 232, 12, textureX, textureY); // Box 37
		bodyModel[398] = new ModelRendererTurbo(this, 232, 16, textureX, textureY); // Box 37
		bodyModel[399] = new ModelRendererTurbo(this, 232, 18, textureX, textureY); // Box 37
		bodyModel[400] = new ModelRendererTurbo(this, 223, 158, textureX, textureY); // Box 4
		bodyModel[401] = new ModelRendererTurbo(this, 398, 158, textureX, textureY); // Box 4
		bodyModel[402] = new ModelRendererTurbo(this, 425, 170, textureX, textureY); // Box 4
		bodyModel[403] = new ModelRendererTurbo(this, 399, 170, textureX, textureY); // Box 4
		bodyModel[404] = new ModelRendererTurbo(this, 224, 170, textureX, textureY); // Box 4
		bodyModel[405] = new ModelRendererTurbo(this, 224, 160, textureX, textureY); // Box 4
		bodyModel[406] = new ModelRendererTurbo(this, 18, 48, textureX, textureY); // Box 2
		bodyModel[407] = new ModelRendererTurbo(this, 76, 48, textureX, textureY); // Box 2
		bodyModel[408] = new ModelRendererTurbo(this, 44, 86, textureX, textureY, "lamp"); // Box 2 number board glow
		bodyModel[409] = new ModelRendererTurbo(this, 52, 86, textureX, textureY, "lamp"); // Box 2 number board glow
		bodyModel[410] = new ModelRendererTurbo(this, 43, 74, textureX, textureY, "lamp"); // Box 2 weird ass becon glow
		bodyModel[411] = new ModelRendererTurbo(this, 48, 75, textureX, textureY, "lamp"); // Box 2 weird ass becon grouped glow
		bodyModel[412] = new ModelRendererTurbo(this, 55, 74, textureX, textureY, "lamp"); // Box 2 weird ass becon glow
		bodyModel[413] = new ModelRendererTurbo(this, 52, 75, textureX, textureY, "lamp"); // Box 2 weird ass becon grouped glow
		bodyModel[414] = new ModelRendererTurbo(this, 10, 53, textureX, textureY); // Box 2
		bodyModel[415] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 2
		bodyModel[416] = new ModelRendererTurbo(this, 10, 55, textureX, textureY); // Box 2
		bodyModel[417] = new ModelRendererTurbo(this, 76, 53, textureX, textureY); // Box 2
		bodyModel[418] = new ModelRendererTurbo(this, 76, 51, textureX, textureY); // Box 2
		bodyModel[419] = new ModelRendererTurbo(this, 76, 55, textureX, textureY); // Box 2
		bodyModel[420] = new ModelRendererTurbo(this, 76, 62, textureX, textureY); // Box 2
		bodyModel[421] = new ModelRendererTurbo(this, 76, 60, textureX, textureY); // Box 2
		bodyModel[422] = new ModelRendererTurbo(this, 76, 58, textureX, textureY); // Box 2
		bodyModel[423] = new ModelRendererTurbo(this, 10, 62, textureX, textureY); // Box 2
		bodyModel[424] = new ModelRendererTurbo(this, 10, 60, textureX, textureY); // Box 2
		bodyModel[425] = new ModelRendererTurbo(this, 10, 58, textureX, textureY); // Box 2
		bodyModel[426] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 2
		bodyModel[427] = new ModelRendererTurbo(this, 10, 46, textureX, textureY); // Box 2
		bodyModel[428] = new ModelRendererTurbo(this, 368, 180, textureX, textureY); // Box 2
		bodyModel[429] = new ModelRendererTurbo(this, 364, 41, textureX, textureY); // Box 2
		bodyModel[430] = new ModelRendererTurbo(this, 379, 41, textureX, textureY); // Box 2
		bodyModel[431] = new ModelRendererTurbo(this, 492, 38, textureX, textureY); // Box 2
		bodyModel[432] = new ModelRendererTurbo(this, 41, 67, textureX, textureY); // Box 448
		bodyModel[433] = new ModelRendererTurbo(this, 52, 67, textureX, textureY); // Box 449

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Coupler back
		bodyModel[0].setRotationPoint(47F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Coupler front
		bodyModel[1].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 82, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[2].setRotationPoint(-36F, 0F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 3
		bodyModel[3].setRotationPoint(-45F, 2F, -8.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Box 4
		bodyModel[4].setRotationPoint(40F, 2F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38F, 2F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(46F, -15F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 7
		bodyModel[7].setRotationPoint(-46F, 1F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(46F, 0F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 9
		bodyModel[9].setRotationPoint(46F, 0F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(46F, 1F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(46F, 0F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(46F, -15F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[13].setRotationPoint(46F, -20F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 12
		bodyModel[14].setRotationPoint(46F, -20F, 3F);

		bodyModel[15].addBox(0F, 0F, 0F, 58, 15, 1, 0F); // Box 2
		bodyModel[15].setRotationPoint(-21F, -15F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 2
		bodyModel[16].setRotationPoint(-45F, -6F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 67, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[17].setRotationPoint(-21F, -20F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 67, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(-21F, -20F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 58, 15, 1, 0F); // Box 2
		bodyModel[19].setRotationPoint(-21F, -15F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-47.5F, 6F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-47.5F, 5F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[22].setRotationPoint(-47.5F, 7F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[23].setRotationPoint(-47.5F, 6F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-48F, 5F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(46F, -21F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-35F, -23F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-35F, -22.5F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 103
		bodyModel[29].setRotationPoint(-35F, -22.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[30].setRotationPoint(-35F, -21F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[31].setRotationPoint(-35F, -21F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 6
		bodyModel[32].setRotationPoint(46F, -21F, 3F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 10 cull
		bodyModel[33].setRotationPoint(47F, -23F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.625F, 0F, 0F, 0.625F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0.625F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[34].setRotationPoint(46F, -22F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(46F, -22F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 0.125F, 0F, -1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(46F, -20F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[37].setRotationPoint(46F, -20F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.375F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		bodyModel[38].setRotationPoint(46F, -22.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[39].setRotationPoint(47F, -23F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[40].setRotationPoint(46F, -21F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[41].setRotationPoint(46F, -21F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[42].setRotationPoint(-35F, -23F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[43].setRotationPoint(-35F, -23F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[44].setRotationPoint(47F, -23F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 39
		bodyModel[45].setRotationPoint(46F, -22.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 2
		bodyModel[46].setRotationPoint(-45F, 0F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 6, 21, 0F); // Box 3
		bodyModel[47].setRotationPoint(45F, 2F, -10.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 7
		bodyModel[48].setRotationPoint(46F, 2F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F); // Box 2
		bodyModel[49].setRotationPoint(-45F, 0F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, -0.45F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.65F); // Box 9
		bodyModel[50].setRotationPoint(-46F, 0F, 2F);

		bodyModel[51].addBox(0F, 0F, 0F, 9, 2, 16, 0F); // Box 2
		bodyModel[51].setRotationPoint(-45F, 0F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 9
		bodyModel[52].setRotationPoint(-46F, -4F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Box 9
		bodyModel[53].setRotationPoint(-47F, 0F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 9
		bodyModel[54].setRotationPoint(-47F, 0F, -2F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Box 4
		bodyModel[55].setRotationPoint(-44F, 2F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[56].setRotationPoint(-39F, 2F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 2
		bodyModel[57].setRotationPoint(-45F, -6F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[58].setRotationPoint(-45F, -6F, 10F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 15, 1, 0F); // Box 2
		bodyModel[59].setRotationPoint(-36F, -15F, -11F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[60].setRotationPoint(-26F, -5F, -11F);

		bodyModel[61].addBox(0F, 0F, -1F, 5, 10, 1, 0F); // Box 2 Fireman side door swing left
		bodyModel[61].setRotationPoint(-27F, -15F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[62].setRotationPoint(-27.5F, -16F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[63].setRotationPoint(-21.5F, -16F, -11F);

		bodyModel[64].addShapeBox(0F, -5F, -1F, 2, 5, 1, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Fireman side door swing left
		bodyModel[64].setRotationPoint(-27F, -15F, -10F);

		bodyModel[65].addShapeBox(2F, -5F, -1F, 3, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Fireman side door swing left
		bodyModel[65].setRotationPoint(-27F, -15F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 2 Engineer side door swing right
		bodyModel[66].setRotationPoint(-27F, -15F, 10F);

		bodyModel[67].addShapeBox(0F, -5F, 0F, 2, 5, 1, 0F,-2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Engineer side door swing right
		bodyModel[67].setRotationPoint(-27F, -15F, 10F);

		bodyModel[68].addShapeBox(2F, -5F, 0F, 3, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Engineer side door swing right
		bodyModel[68].setRotationPoint(-27F, -15F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 15, 1, 0F); // Box 2
		bodyModel[69].setRotationPoint(-36F, -15F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[70].setRotationPoint(-45F, 0F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[71].setRotationPoint(-45F, 0F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 2
		bodyModel[72].setRotationPoint(-28F, -16F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 2
		bodyModel[73].setRotationPoint(-22F, -16F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[74].setRotationPoint(-36F, -20F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[75].setRotationPoint(-36F, -20F, 10F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[76].setRotationPoint(-26F, -1F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[77].setRotationPoint(-27F, -5F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[78].setRotationPoint(-23F, -5F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 2
		bodyModel[79].setRotationPoint(-26F, -3F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[80].setRotationPoint(-26F, -5F, 10F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[81].setRotationPoint(-27.5F, -16F, 10F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 2
		bodyModel[82].setRotationPoint(-21.5F, -16F, 10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 2
		bodyModel[83].setRotationPoint(-28F, -16F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 16, 0, 0F); // Box 2
		bodyModel[84].setRotationPoint(-22F, -16F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[85].setRotationPoint(-26F, -1F, 10F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[86].setRotationPoint(-27F, -5F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 2
		bodyModel[87].setRotationPoint(-23F, -5F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 2
		bodyModel[88].setRotationPoint(-26F, -3F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 2
		bodyModel[89].setRotationPoint(-45F, -15F, -11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -9F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[90].setRotationPoint(-45F, -15F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 9
		bodyModel[91].setRotationPoint(-46F, -5F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.3F, -1F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 9
		bodyModel[92].setRotationPoint(-46F, -5F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 9
		bodyModel[93].setRotationPoint(-46F, -2F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0.725F, 0F, -0.15F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0.725F, 0F, -0.15F); // Box 9
		bodyModel[94].setRotationPoint(-46F, -2F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 9
		bodyModel[95].setRotationPoint(-46F, -4F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.26F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.26F, 0F, 0F); // Box 9
		bodyModel[96].setRotationPoint(-46F, -2F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.725F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 1.3F, 0F, 0F, 0.725F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 9
		bodyModel[97].setRotationPoint(-46F, -2F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.05F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, -0.65F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 9
		bodyModel[98].setRotationPoint(-46F, 0F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, -0.45F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, -0.45F); // Box 2
		bodyModel[99].setRotationPoint(-46F, -5F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.05F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.05F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 2
		bodyModel[100].setRotationPoint(-46F, -5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.125F, -1F, 0F); // Box 9
		bodyModel[101].setRotationPoint(-46F, -5F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.775F, 0F, 0F, 0.125F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 9
		bodyModel[102].setRotationPoint(-46F, -5F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6125F, 0F, 0F); // Box 9
		bodyModel[103].setRotationPoint(-46F, -6F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 2 Engineer side door
		bodyModel[104].setRotationPoint(-27F, -20F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2 Engineer side door
		bodyModel[105].setRotationPoint(-27F, -20F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 2
		bodyModel[106].setRotationPoint(-28F, -20F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 2
		bodyModel[107].setRotationPoint(-22F, -20F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		bodyModel[108].setRotationPoint(-28F, -20F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		bodyModel[109].setRotationPoint(-22F, -20F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 2
		bodyModel[110].setRotationPoint(-46F, -1.5F, 4.1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 2
		bodyModel[111].setRotationPoint(-46F, -1.5F, 5.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 2
		bodyModel[112].setRotationPoint(-46F, -1.5F, -6.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 2
		bodyModel[113].setRotationPoint(-46F, -1.5F, -5.1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 2
		bodyModel[114].setRotationPoint(-45F, 2F, -10.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 5, 0, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[115].setRotationPoint(-45F, 2F, 10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.89F, 0F, 0F, 0.89F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.89F); // Box 2
		bodyModel[116].setRotationPoint(-40F, 6F, 10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -0.89F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.89F, 0F, 0F, -0.89F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.89F); // Box 2
		bodyModel[117].setRotationPoint(-40F, 6F, -10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.4F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, -0.45F); // Box 2
		bodyModel[118].setRotationPoint(-46F, -6F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.05F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 2
		bodyModel[119].setRotationPoint(-46F, -6F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, 0F, 0F, 7.3F, 0F, 0F); // Box 2 cull
		bodyModel[120].setRotationPoint(-37.65F, -20F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.05F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.525F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-46F, -7F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 13, 8, 0F,-1F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.3F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, 0F, 0F, 8F, 0F, 0F); // Box 2 cull
		bodyModel[122].setRotationPoint(-37.65F, -20F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, 8.6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 8.55F, 0F, -0.4F); // Box 2
		bodyModel[123].setRotationPoint(-37F, -20F, 8F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 2
		bodyModel[124].setRotationPoint(-45F, -7F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 headlight glow
		bodyModel[125].setRotationPoint(-46F, -7F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 headlight glow
		bodyModel[126].setRotationPoint(-46F, -7F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.005F, 0F, 0F, -0.005F, 0F, 0F, -0.175F, 0F, 0F, 0.175F, 0F, 0F, 1.145F, 0F, 0F, -1.145F, 0F, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F); // Box 2
		bodyModel[127].setRotationPoint(-45.47F, -7F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.6125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Box 9
		bodyModel[128].setRotationPoint(-46F, -6F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.525F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 2
		bodyModel[129].setRotationPoint(-46F, -7F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.175F, 0F, 0F, -0.175F, 0F, 0F, -0.005F, 0F, 0F, 0.005F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.145F, 0F, 0F, 1.145F, 0F, 0F); // Box 2
		bodyModel[130].setRotationPoint(-45.47F, -7F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-9F, 0F, -1F, 5F, -5F, -2F, 5F, -5F, 2F, -9F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[131].setRotationPoint(-45F, -20F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-9F, 0F, 1F, 5F, -5F, 2F, 5F, -5F, -2F, -9F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[132].setRotationPoint(-45F, -20F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.4F, 8.55F, 0F, -1.4F, -9.55F, 0F, -1.4F, -9.55F, 0F, 0.4F, 8.55F, 0F, 0.4F); // Box 2
		bodyModel[133].setRotationPoint(-37F, -20F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 8F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, 8.55F, 0F, 0.4F); // Box 2
		bodyModel[134].setRotationPoint(-37F, -20F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.4F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 8.55F, 0F, 0.4F, -9.55F, 0F, 0.4F, -9.55F, 0F, -1.4F, 8.55F, 0F, -1.4F); // Box 2
		bodyModel[135].setRotationPoint(-37F, -20F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 8.55F, 0F, 0.4F, -9F, 0F, 0F, -9F, 0F, -1F, 8F, 0F, -1F); // Box 2
		bodyModel[136].setRotationPoint(-37F, -20F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 8.55F, 0F, -0.4F, -9F, 0F, 0F, -9F, 0F, 0F, 8.6F, 0F, 0F); // Box 2
		bodyModel[137].setRotationPoint(-37F, -20F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.15F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.15F, -0.125F, -0.125F); // Box 5 ditchlight glow
		bodyModel[138].setRotationPoint(-46.51F, -4.5F, -6.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.15F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, 0.15F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F); // Box 5 ditchlight glow
		bodyModel[139].setRotationPoint(-46.51F, -4.5F, 4.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, 0.35F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.3F, -0.125F, -0.125F); // Box 5 marker light glow
		bodyModel[140].setRotationPoint(-46F, -6F, 4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F, 0.3F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.35F, -0.125F, -0.125F); // Box 5 marker light glow
		bodyModel[141].setRotationPoint(-46F, -6F, -5.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 Headlight 2 glow
		bodyModel[142].setRotationPoint(-43.06F, -11F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.355F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F); // Box 2 cull
		bodyModel[143].setRotationPoint(-44.06F, -11F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.96F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, 0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.355F, 0F, 0F); // Box 2 cull
		bodyModel[144].setRotationPoint(-44.06F, -11F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.65F, 0F, 0F, -1.65F, 0F, 0F, -1.4F, 0F, 0F, 1.275F, 0F, 0F); // Box 2 
		bodyModel[145].setRotationPoint(-36F, -22F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 1.275F, 0F, 0F, -1.4F, 0F, 0F, -1.65F, 0F, 0F, 1.65F, 0F, 0F); // Box 2 
		bodyModel[146].setRotationPoint(-36F, -22F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.385F, 0F, 0F, 0.233F, 0F, 0F); // Box 38
		bodyModel[147].setRotationPoint(-36F, -22F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.055F, 0F, 0F, -0.125F, 0F, 0F, -0.385F, 0F, 0F, 0.23F, 0F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -1.16F, 0F, 0F, 0.9F, 0F, 0F); // Box 38
		bodyModel[148].setRotationPoint(-36F, -21F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.233F, 0F, 0F, -0.385F, 0F, 0F, -0.7F, 0F, 0F, 0.64F, 0F, 0F); // Box 38
		bodyModel[149].setRotationPoint(-36F, -22F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.155F, 0F, 0F, -0.475F, 0F, 0F, 0.41F, 0F, 0F, 0.67F, 0F, 0F, -0.93F, 0F, 0F, -1.175F, 0F, 0F, 1.05F, 0F, 0F); // Box 38
		bodyModel[150].setRotationPoint(-36.23F, -21F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0.64F, 0F, 0F, -0.7F, 0F, 0F, -0.385F, 0F, 0F, 0.233F, 0F, 0F); // Box 38
		bodyModel[151].setRotationPoint(-36F, -22F, 3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.41F, 0F, 0F, -0.475F, 0F, 0F, -0.155F, 0F, 0F, 0F, 0F, 0F, 1.05F, 0F, 0F, -1.175F, 0F, 0F, -0.93F, 0F, 0F, 0.67F, 0F, 0F); // Box 38
		bodyModel[152].setRotationPoint(-36.23F, -21F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.65F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[153].setRotationPoint(-36F, -23F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 
		bodyModel[154].setRotationPoint(-36F, -23F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 2 cull
		bodyModel[155].setRotationPoint(-36F, -23F, -3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 39
		bodyModel[156].setRotationPoint(-36F, -22.5F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[157].setRotationPoint(-36F, -21F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.2F, 0F, -1F, 0.65F, 0F, -1F, 0.65F, 0F, 0F, -1.142F, 0F, 0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.4F); // Box 2
		bodyModel[158].setRotationPoint(-37F, -21F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.142F, 0F, -0.4F, 1F, 0F, 0F, 0.875F, 0F, 0F, -1.055F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 2
		bodyModel[159].setRotationPoint(-37F, -21F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.2F, -1F, 0F, 0.233F, 0F, 0F, -0.385F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 38
		bodyModel[160].setRotationPoint(-36F, -22F, 6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.23F, 0F, 0F, -0.385F, 0F, 0F, -0.125F, 0F, 0F, -0.055F, 0F, 0F, 0.9F, 0F, 0F, -1.16F, 0F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F); // Box 38
		bodyModel[161].setRotationPoint(-36F, -21F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 39
		bodyModel[162].setRotationPoint(-36F, -22.5F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.65F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[163].setRotationPoint(-36F, -21F, 9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.142F, 0F, 0.4F, 0.65F, 0F, 0F, 0.65F, 0F, -1F, -1.2F, 0F, -1F, -0.4F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[164].setRotationPoint(-37F, -21F, 9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.055F, 0F, 0F, 0.875F, 0F, 0F, 1F, 0F, 0F, -1.142F, 0F, -0.4F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F); // Box 2
		bodyModel[165].setRotationPoint(-37F, -21F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 38
		bodyModel[166].setRotationPoint(-36F, -23F, 3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F); // Box 38
		bodyModel[167].setRotationPoint(-36F, -21F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[168].setRotationPoint(-36F, -21F, 6F);

		bodyModel[169].addBox(0F, 0F, 0F, 8, 5, 16, 0F); // Box 2
		bodyModel[169].setRotationPoint(-44F, -5F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[170].setRotationPoint(-45F, -5F, 8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[171].setRotationPoint(-45F, -5F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 17, 5, 20, 0F); // Box 2
		bodyModel[172].setRotationPoint(-36F, -5F, -10F);

		bodyModel[173].addBox(0F, 0F, 0F, 8, 22, 12, 0F); // Box 2
		bodyModel[173].setRotationPoint(-20F, -22F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[174].setRotationPoint(-19F, -22F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[175].setRotationPoint(-19F, -22F, 6F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 2
		bodyModel[176].setRotationPoint(37.5F, -11F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 2
		bodyModel[177].setRotationPoint(43.5F, -11F, -11F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 2
		bodyModel[178].setRotationPoint(37F, -11F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 2
		bodyModel[179].setRotationPoint(43F, -11F, -10F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 2
		bodyModel[180].setRotationPoint(37.5F, -11F, 10F);

		bodyModel[181].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 2
		bodyModel[181].setRotationPoint(43.5F, -11F, 10F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 2
		bodyModel[182].setRotationPoint(43F, -11F, 10F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 2
		bodyModel[183].setRotationPoint(37F, -11F, 10F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 2
		bodyModel[184].setRotationPoint(37F, -15F, 10F);

		bodyModel[185].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
		bodyModel[185].setRotationPoint(38F, -15F, 10F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 2
		bodyModel[186].setRotationPoint(44F, -15F, 10F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 2
		bodyModel[187].setRotationPoint(43F, -15F, 10F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 2
		bodyModel[188].setRotationPoint(37F, -15F, -11F);

		bodyModel[189].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
		bodyModel[189].setRotationPoint(38F, -15F, -11F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 2
		bodyModel[190].setRotationPoint(44F, -15F, -11F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 2
		bodyModel[191].setRotationPoint(43F, -15F, -11F);

		bodyModel[192].addBox(-5F, 0F, -1F, 5, 14, 1, 0F); // Box 2 rear door swing right
		bodyModel[192].setRotationPoint(43F, -14F, -10F);

		bodyModel[193].addBox(-5F, 0F, 0F, 5, 14, 1, 0F); // Box 2 rear door swing left
		bodyModel[193].setRotationPoint(43F, -14F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[194].setRotationPoint(-6F, -22.5F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 38, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[195].setRotationPoint(-1F, -23F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 38, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[196].setRotationPoint(-1F, -23F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 38, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[197].setRotationPoint(-1F, -23F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[198].setRotationPoint(37F, -23F, -3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(37F, -23F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[200].setRotationPoint(37F, -23F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37 cull
		bodyModel[201].setRotationPoint(5F, -23.25F, -5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[202].setRotationPoint(6F, -23.5F, -3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 27, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 radiator boxes
		bodyModel[203].setRotationPoint(15F, -22F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 27, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 radiator boxes
		bodyModel[204].setRotationPoint(15F, -22F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 27, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 radiator boxes
		bodyModel[205].setRotationPoint(15F, -22F, 6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 27, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 radiator boxes
		bodyModel[206].setRotationPoint(15F, -20F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 27, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 radiator boxes
		bodyModel[207].setRotationPoint(15F, -20F, 6F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Box 10 
		bodyModel[208].setRotationPoint(47F, -14F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[209].setRotationPoint(-5.5F, -1F, -3.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 15, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[210].setRotationPoint(-5.5F, -8F, -5.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[211].setRotationPoint(-5.5F, -14F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[212].setRotationPoint(-5.5F, -14F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, -2F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[213].setRotationPoint(-5F, -16F, -4F);
		bodyModel[213].rotateAngleX = 0.27925268F;

		bodyModel[214].addShapeBox(0F, 0F, -2F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[214].setRotationPoint(-5F, -16F, 4F);
		bodyModel[214].rotateAngleX = -0.27925268F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 15, 4, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[215].setRotationPoint(-5.5F, -12F, -5.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[216].setRotationPoint(-10.5F, -8F, -3.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[217].setRotationPoint(-10.5F, -8F, -1.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[218].setRotationPoint(-10.5F, -5.5F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 48
		bodyModel[219].setRotationPoint(-10.5F, -8F, 1.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 49
		bodyModel[220].setRotationPoint(-10.5F, -3F, 1.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[221].setRotationPoint(-10.5F, -3F, -3.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 51
		bodyModel[222].setRotationPoint(-10.5F, -10F, -1.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[223].setRotationPoint(-13.5F, -5F, -1.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 56
		bodyModel[224].setRotationPoint(-6.5F, -12F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[225].setRotationPoint(-10.5F, -12F, -3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		bodyModel[226].setRotationPoint(-10.5F, -12F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[227].setRotationPoint(-7.5F, -14F, -5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[228].setRotationPoint(-7.5F, -10F, -4F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[229].setRotationPoint(-7.5F, -14F, 1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[230].setRotationPoint(-7.5F, -14F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[231].setRotationPoint(9.5F, -12F, -5.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[232].setRotationPoint(9.5F, -12F, 4.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[233].setRotationPoint(9F, -17F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[234].setRotationPoint(9F, -17F, -3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 40
		bodyModel[235].setRotationPoint(9F, -17F, 1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[236].setRotationPoint(9F, -14.5F, -3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		bodyModel[237].setRotationPoint(9F, -13F, 1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[238].setRotationPoint(9F, -13F, -3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[239].setRotationPoint(9F, -12.5F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[240].setRotationPoint(9.5F, -10F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[241].setRotationPoint(9F, -5F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[242].setRotationPoint(10F, -12F, 1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 48
		bodyModel[243].setRotationPoint(9.5F, -7F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[244].setRotationPoint(9.5F, -10F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[245].setRotationPoint(9.5F, -10F, -2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[246].setRotationPoint(10.5F, -17F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[247].setRotationPoint(10.5F, -17F, 4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 80
		bodyModel[248].setRotationPoint(-6.5F, -13.5F, -7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[249].setRotationPoint(-6.5F, -13.5F, 5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[250].setRotationPoint(-2F, -1.5F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[251].setRotationPoint(-2F, -1.5F, 5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[252].setRotationPoint(-4.5F, -6.5F, -6.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[253].setRotationPoint(3.5F, -6.5F, -6.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[254].setRotationPoint(-3.5F, -6.5F, -6.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[255].setRotationPoint(-1.5F, -6.5F, -6.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[256].setRotationPoint(6.5F, -6.5F, -6.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 90
		bodyModel[257].setRotationPoint(4.5F, -6.5F, -6.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[258].setRotationPoint(-3.5F, -3.5F, -6.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[259].setRotationPoint(4.5F, -3.5F, -6.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 101
		bodyModel[260].setRotationPoint(-4.25F, -15.5F, -6.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 102
		bodyModel[261].setRotationPoint(-1.75F, -15.5F, -6.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[262].setRotationPoint(0.75F, -15.5F, -6.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 104
		bodyModel[263].setRotationPoint(3.25F, -15.5F, -6.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 105
		bodyModel[264].setRotationPoint(5.75F, -15.5F, -6.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 106
		bodyModel[265].setRotationPoint(8.25F, -15.5F, -6.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
		bodyModel[266].setRotationPoint(-4.5F, -6.5F, 5.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[267].setRotationPoint(3.5F, -6.5F, 5.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[268].setRotationPoint(-3.5F, -6.5F, 5.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[269].setRotationPoint(-1.5F, -6.5F, 5.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[270].setRotationPoint(6.5F, -6.5F, 5.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[271].setRotationPoint(4.5F, -6.5F, 5.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[272].setRotationPoint(-3.5F, -3.5F, 5.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[273].setRotationPoint(4.5F, -3.5F, 5.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[274].setRotationPoint(-4.25F, -15.5F, 2.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[275].setRotationPoint(-1.75F, -15.5F, 2.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[276].setRotationPoint(0.75F, -15.5F, 2.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[277].setRotationPoint(3.25F, -15.5F, 2.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[278].setRotationPoint(5.75F, -15.5F, 2.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[279].setRotationPoint(8.25F, -15.5F, 2.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[280].setRotationPoint(6F, -21.5F, -3F);

		bodyModel[281].addBox(0F, 0F, 0F, 6, 1, 17, 0F); // Box 2
		bodyModel[281].setRotationPoint(-41F, -13F, -8.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[282].setRotationPoint(-39F, -16F, 8.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[283].setRotationPoint(-41F, -13F, -10.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Box 2
		bodyModel[284].setRotationPoint(-41F, -12F, -8.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 4, 6, 3, 0F); // Box 2 refrigerator
		bodyModel[285].setRotationPoint(-32F, -11F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[286].setRotationPoint(-39F, -16F, -8.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 6, 7, 2, 0F); // Box 2
		bodyModel[287].setRotationPoint(-41F, -12F, -8.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 6, 7, 1, 0F); // Box 2
		bodyModel[288].setRotationPoint(-41F, -12F, 7.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 2
		bodyModel[289].setRotationPoint(-35F, -13F, 2F);

		bodyModel[290].addBox(0F, 0F, 0F, 6, 7, 4, 0F); // Box 2
		bodyModel[290].setRotationPoint(-41F, -12F, -2F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[291].setRotationPoint(-39F, -16F, -10.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[292].setRotationPoint(-41F, -13F, 8.5F);

		bodyModel[293].addShapeBox(-0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 2
		bodyModel[293].setRotationPoint(-36F, -12.5F, 4F);

		bodyModel[294].addShapeBox(-0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 2
		bodyModel[294].setRotationPoint(-36F, -12.5F, 7.5F);
		bodyModel[294].rotateAngleZ = -0.40142573F;

		bodyModel[295].addShapeBox(-0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 2
		bodyModel[295].setRotationPoint(-36F, -12.5F, 6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[296].setRotationPoint(-37F, -21F, 0F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[297].setRotationPoint(-37F, -21F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[298].setRotationPoint(-35F, -22F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[299].setRotationPoint(-35F, -22F, 3F);

		bodyModel[300].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 2
		bodyModel[300].setRotationPoint(-35F, -22F, -3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 2
		bodyModel[301].setRotationPoint(-35F, -19.5F, -12F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 2
		bodyModel[302].setRotationPoint(-35F, -19.5F, 11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[303].setRotationPoint(-38F, -16F, -3.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 0, 18, 0F); // Box 2
		bodyModel[304].setRotationPoint(-38.75F, -16.01F, -9F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 4
		bodyModel[305].setRotationPoint(-24F, 2.5F, -2F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 4
		bodyModel[306].setRotationPoint(26F, 2.5F, -2F);

		bodyModel[307].addBox(0F, 0F, 0F, 89, 1, 10, 0F); // Box 4
		bodyModel[307].setRotationPoint(-44F, 2F, -5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[308].setRotationPoint(-5F, 2F, -10.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 2
		bodyModel[309].setRotationPoint(-9F, 2F, -10.75F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -4F, 0F, -0.375F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[310].setRotationPoint(9F, 2F, -10.75F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 2
		bodyModel[311].setRotationPoint(-5F, 2F, 4.75F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -4F, 0F, -0.375F); // Box 2
		bodyModel[312].setRotationPoint(-9F, 2F, 9.75F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 2
		bodyModel[313].setRotationPoint(9F, 2F, 9.75F);

		bodyModel[314].addBox(0F, 0F, 0F, 8, 5, 6, 0F); // Box 2
		bodyModel[314].setRotationPoint(7F, 4F, 3F);

		bodyModel[315].addBox(0F, 0F, 0F, 8, 5, 6, 0F); // Box 2
		bodyModel[315].setRotationPoint(7F, 4F, -9F);

		bodyModel[316].addBox(0F, 0F, 0F, 23, 1, 10, 0F); // Box 4
		bodyModel[316].setRotationPoint(-8F, 3F, -5F);

		bodyModel[317].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 2
		bodyModel[317].setRotationPoint(-4.75F, 6.75F, -8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[318].setRotationPoint(-4.75F, 5.75F, -8F);

		bodyModel[319].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 2
		bodyModel[319].setRotationPoint(-4.75F, 5.75F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[320].setRotationPoint(-4.75F, 5.75F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[321].setRotationPoint(-4.75F, 7.75F, -8F);

		bodyModel[322].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 2
		bodyModel[322].setRotationPoint(-4.75F, 7.75F, -7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[323].setRotationPoint(-4.75F, 7.75F, -6F);

		bodyModel[324].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 2
		bodyModel[324].setRotationPoint(-4.75F, 6.75F, 5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[325].setRotationPoint(-4.75F, 5.75F, 5F);

		bodyModel[326].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 2
		bodyModel[326].setRotationPoint(-4.75F, 5.75F, 6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[327].setRotationPoint(-4.75F, 5.75F, 7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[328].setRotationPoint(-4.75F, 7.75F, 5F);

		bodyModel[329].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 2
		bodyModel[329].setRotationPoint(-4.75F, 7.75F, 6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[330].setRotationPoint(-4.75F, 7.75F, 7F);

		bodyModel[331].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 4
		bodyModel[331].setRotationPoint(-8F, 4.5F, -9F);

		bodyModel[332].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 4
		bodyModel[332].setRotationPoint(-9F, 4.5F, -9F);

		bodyModel[333].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 4
		bodyModel[333].setRotationPoint(-8F, 3.5F, -8F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 4
		bodyModel[334].setRotationPoint(-6.75F, 1.75F, -6.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 4
		bodyModel[335].setRotationPoint(-6.75F, 1.75F, 6.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 4
		bodyModel[336].setRotationPoint(-5.75F, 6.75F, -6.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 4
		bodyModel[337].setRotationPoint(-5.75F, 6.75F, 6.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 4
		bodyModel[338].setRotationPoint(5.75F, 4.75F, -6.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 4
		bodyModel[339].setRotationPoint(5.75F, 4.75F, 6.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 4
		bodyModel[340].setRotationPoint(3.75F, 6.75F, -6.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 4
		bodyModel[341].setRotationPoint(3.75F, 6.75F, 6.5F);

		bodyModel[342].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 2
		bodyModel[342].setRotationPoint(-3F, 3.75F, -2.5F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 4
		bodyModel[343].setRotationPoint(-5F, 3.75F, 0F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 4
		bodyModel[344].setRotationPoint(-4F, 5.75F, 0F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 4
		bodyModel[345].setRotationPoint(-9.5F, 1.5F, -7.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 3 Cull
		bodyModel[346].setRotationPoint(46F, 7F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 3 Cull
		bodyModel[347].setRotationPoint(46F, 7F, 5F);

		bodyModel[348].addBox(0F, 0F, 0F, 10, 4, 6, 0F); // Box 2
		bodyModel[348].setRotationPoint(4.5F, 4.5F, -3F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 2
		bodyModel[349].setRotationPoint(4F, 8.75F, -0.5F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 0, 9, 0F); // Box 2
		bodyModel[350].setRotationPoint(5F, 8.75F, 0.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[351].setRotationPoint(-9F, -22.5F, -3F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 80
		bodyModel[352].setRotationPoint(-7.1F, -22.5F, 1F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[353].setRotationPoint(-8F, -22.5F, 0F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[354].setRotationPoint(-8F, -22.5F, 4F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[355].setRotationPoint(-9F, -23F, 1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[356].setRotationPoint(-9F, -23F, 3F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[357].setRotationPoint(-9F, -23F, 2F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[358].setRotationPoint(-15F, -22.5F, -6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 52, 1, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[359].setRotationPoint(-6F, -22.5F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 52, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 103
		bodyModel[360].setRotationPoint(-6F, -22.5F, 6F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[361].setRotationPoint(-10F, -21.5F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[362].setRotationPoint(-10F, -21.5F, -8F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		bodyModel[363].setRotationPoint(-10F, -21.5F, 8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 0, 6, 8, 0F,1.3F, -1F, 0F, -1.3F, -1F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 1.3F, -2.5F, 0F, -1.3F, -2.5F, 0F, -0.125F, -3.5F, 0F, 0.125F, -3.5F, 0F); // Box 9
		bodyModel[364].setRotationPoint(-46.01F, -5F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 0, 6, 8, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.3F, -1F, 0F, 1.3F, -1F, 0F, 0.125F, -3.5F, 0F, -0.125F, -3.5F, 0F, -1.3F, -2.5F, 0F, 1.3F, -2.5F, 0F); // Box 9
		bodyModel[365].setRotationPoint(-46.01F, -5F, -8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0.05F, 0F, -0.45F, -0.05F, 0F, -0.45F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.05F, -3.5F, -0.45F, -0.05F, -3.5F, -0.45F, -0.125F, -3.5F, 0F, 0.125F, -3.5F, 0F); // Box 2
		bodyModel[366].setRotationPoint(-46.01F, -5F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.05F, 0F, -0.45F, 0.05F, 0F, -0.45F, 0.125F, -3.5F, 0F, -0.125F, -3.5F, 0F, -0.05F, -3.5F, -0.45F, 0.05F, -3.5F, -0.45F); // Box 2
		bodyModel[367].setRotationPoint(-46.01F, -5F, 8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0.05F, 0F, -0.45F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.05F, 0F, 0.45F, 0.05F, -3.5F, -0.45F, 0F, -4F, 0F, 0F, -4F, 0F, 0.05F, -3.5F, 0.45F); // Box 2
		bodyModel[368].setRotationPoint(-46F, -5F, -9.01F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0.05F, 0F, 0.45F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.05F, 0F, -0.45F, 0.05F, -3.5F, 0.45F, 0F, -4F, 0F, 0F, -4F, 0F, 0.05F, -3.5F, -0.45F); // Box 2
		bodyModel[369].setRotationPoint(-46F, -5F, 9.01F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[370].setRotationPoint(-16F, -20F, -11.01F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[371].setRotationPoint(-10F, -20F, -11.01F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 7, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[372].setRotationPoint(-3F, -20F, -11.01F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[373].setRotationPoint(5F, -20F, -11.01F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[374].setRotationPoint(17F, -20F, -11.01F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 10, 10, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[375].setRotationPoint(-16F, -20F, 11.01F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 7, 10, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[376].setRotationPoint(-3F, -20F, 11.01F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[377].setRotationPoint(5F, -20F, 11.01F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[378].setRotationPoint(17F, -20F, 11.01F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 9, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 2
		bodyModel[379].setRotationPoint(26F, -8F, 11.01F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 7, 14, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, -6F, 0F); // Box 2
		bodyModel[380].setRotationPoint(18F, -8F, 11.01F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 9, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 2
		bodyModel[381].setRotationPoint(26F, -8F, -11.01F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 7, 14, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, -6F, 0F); // Box 2
		bodyModel[382].setRotationPoint(18F, -8F, -11.01F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 rear headlight glow
		bodyModel[383].setRotationPoint(47F, -19F, -2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 rear headlight glow
		bodyModel[384].setRotationPoint(47F, -19F, 0F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F); // Box 10 cull
		bodyModel[385].setRotationPoint(47.5F, -19F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, -0.125F, -0.125F, -0.2F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.3F, -0.125F, -0.125F, -0.2F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F); // Box 2 rear marker lightt glow
		bodyModel[386].setRotationPoint(46.55F, -19F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.2F, -0.125F, -0.125F, -0.3F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.2F, -0.125F, -0.125F, -0.3F, -0.125F, -0.125F); // Box 2 rear marker lightt glow
		bodyModel[387].setRotationPoint(46.55F, -19F, 7F);

		bodyModel[388].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 2 front ladders
		bodyModel[388].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[389].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 2 front ladders
		bodyModel[389].setRotationPoint(-27F, 6F, 10.75F);

		bodyModel[390].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 2 back ladders
		bodyModel[390].setRotationPoint(38F, 2F, 10.75F);

		bodyModel[391].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 2 back ladders
		bodyModel[391].setRotationPoint(38F, 6F, 10.75F);

		bodyModel[392].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 2 front ladders
		bodyModel[392].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[393].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 2 front ladders
		bodyModel[393].setRotationPoint(-27F, 6F, -10.75F);

		bodyModel[394].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 2 back ladders
		bodyModel[394].setRotationPoint(38F, 2F, -10.75F);

		bodyModel[395].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Box 2 back ladders
		bodyModel[395].setRotationPoint(38F, 6F, -10.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[396].setRotationPoint(-33F, -23.75F, 4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[397].setRotationPoint(-24F, -24F, 3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[398].setRotationPoint(-31F, -23.75F, -4F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[399].setRotationPoint(-25F, -24F, -3F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 4
		bodyModel[400].setRotationPoint(-23F, 1.5F, -11F);

		bodyModel[401].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 4
		bodyModel[401].setRotationPoint(27F, 1.5F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[402].setRotationPoint(27F, 2.5F, -10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[403].setRotationPoint(27F, 2.5F, 2F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[404].setRotationPoint(-23F, 2.5F, -10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[405].setRotationPoint(-23F, 2.5F, 2F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F); // Box 2
		bodyModel[406].setRotationPoint(-41F, -8F, 11.01F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F); // Box 2
		bodyModel[407].setRotationPoint(-41F, -8F, -11.01F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 number board glow
		bodyModel[408].setRotationPoint(-41.35F, -14F, 0F);
		bodyModel[408].rotateAngleX = -0.04363323F;
		bodyModel[408].rotateAngleY = -0.08726646F;
		bodyModel[408].rotateAngleZ = -0.55850536F;

		bodyModel[409].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 number board glow
		bodyModel[409].setRotationPoint(-41.35F, -14F, 0F);
		bodyModel[409].rotateAngleX = 0.04363323F;
		bodyModel[409].rotateAngleY = 0.08726646F;
		bodyModel[409].rotateAngleZ = -0.55850536F;

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 weird ass becon glow
		bodyModel[410].setRotationPoint(-35.9F, -21.5F, 6F);
		bodyModel[410].rotateAngleX = -0.06981317F;
		bodyModel[410].rotateAngleY = -0.13089969F;
		bodyModel[410].rotateAngleZ = -0.61086524F;

		bodyModel[411].addShapeBox(0F, 0F, -1F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 weird ass becon grouped glow
		bodyModel[411].setRotationPoint(-36.73F, -21.5F, 0F);
		bodyModel[411].rotateAngleX = 0.06981317F;
		bodyModel[411].rotateAngleY = 0.13962634F;
		bodyModel[411].rotateAngleZ = -0.55850536F;

		bodyModel[412].addShapeBox(0F, 0F, -2F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 weird ass becon glow
		bodyModel[412].setRotationPoint(-35.9F, -21.5F, -6F);
		bodyModel[412].rotateAngleX = 0.06981317F;
		bodyModel[412].rotateAngleY = 0.13089969F;
		bodyModel[412].rotateAngleZ = -0.59341195F;

		bodyModel[413].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 weird ass becon grouped glow
		bodyModel[413].setRotationPoint(-36.73F, -21.5F, 0F);
		bodyModel[413].rotateAngleX = -0.06981317F;
		bodyModel[413].rotateAngleY = -0.13962634F;
		bodyModel[413].rotateAngleZ = -0.55850536F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -8.325F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.325F, -2F, 0F, 7.15F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.15F, -2F); // Box 2
		bodyModel[414].setRotationPoint(-45F, -13F, 11.01F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -9.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -2F, 0F, 8.325F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.325F, -2F); // Box 2
		bodyModel[415].setRotationPoint(-45F, -15F, 11.01F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -7.15F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.15F, -2F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F); // Box 2
		bodyModel[416].setRotationPoint(-45F, -11F, 11.01F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -8.325F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.325F, 2F, 0F, 7.15F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.15F, 2F); // Box 2
		bodyModel[417].setRotationPoint(-45F, -13F, -11.01F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -9.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 2F, 0F, 8.325F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.325F, 2F); // Box 2
		bodyModel[418].setRotationPoint(-45F, -15F, -11.01F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -7.15F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.15F, 2F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 2F); // Box 2
		bodyModel[419].setRotationPoint(-45F, -11F, -11.01F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -1.165F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 2
		bodyModel[420].setRotationPoint(-45F, -5F, -11.01F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -2.335F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.335F, 2F, 0F, 1.165F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.165F, 2F); // Box 2
		bodyModel[421].setRotationPoint(-45F, -7F, -11.01F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -3.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 2F, 0F, 2.335F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.335F, 2F); // Box 2
		bodyModel[422].setRotationPoint(-45F, -9F, -11.01F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -1.165F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.165F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bodyModel[423].setRotationPoint(-45F, -5F, 11.01F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -2.335F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.335F, -2F, 0F, 1.165F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.165F, -2F); // Box 2
		bodyModel[424].setRotationPoint(-45F, -7F, 11.01F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, -3.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -2F, 0F, 2.335F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.335F, -2F); // Box 2
		bodyModel[425].setRotationPoint(-45F, -9F, 11.01F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 9, 1, 0, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Box 2
		bodyModel[426].setRotationPoint(-45F, -10F, -11.01F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 9, 1, 0, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 2
		bodyModel[427].setRotationPoint(-45F, -10F, 11.01F);

		bodyModel[428].addBox(0F, 0F, 0F, 4, 5, 12, 0F); // Box 2
		bodyModel[428].setRotationPoint(-9.5F, 3.5F, -6F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 7, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[429].setRotationPoint(25F, -20F, -11.01F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 2
		bodyModel[430].setRotationPoint(33F, -20F, -11.01F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[431].setRotationPoint(40F, -23.5F, -5F);

		bodyModel[432].addShapeBox(0F, 0.8F, -6F, 1, 2, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[432].setRotationPoint(-36.73F, -21.5F, 0F);
		bodyModel[432].rotateAngleY = 0.12217305F;
		bodyModel[432].rotateAngleZ = -0.57595865F;

		bodyModel[433].addShapeBox(0F, 0.8F, 2F, 1, 2, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[433].setRotationPoint(-36.73F, -21.5F, 0F);
		bodyModel[433].rotateAngleY = -0.12217305F;
		bodyModel[433].rotateAngleZ = -0.57595865F;
	}
	ModelGenesisTruck theTruck = new ModelGenesisTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity ,f5);

		if (GetColor(entity) == 327) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/p32_bogie_silver.png"));

		} else if (GetColor(entity) == 34654) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/P42-40_truck_AMTK_Pz_V_longy.png"));

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/p32_bogie_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.67, -0.0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.35, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
}