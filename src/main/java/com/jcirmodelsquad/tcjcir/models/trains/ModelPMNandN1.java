//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PM N and N-1
// Model Creator: Prof_Binky
// Created on: 13.11.2023 - 14:00:28
// Last changed on: 13.11.2023 - 14:00:28

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPMPilotTruck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPMTrailingTruck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelPMNandN1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPMNandN1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[503];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 197, 74, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 196, 61, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 196, 86, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 214, 74, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 213, 61, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 213, 86, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 184, 38, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 68, 72, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 68, 61, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 68, 83, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 68, 72, textureX, textureY); // Box 3
		bodyModel[11] = new ModelRendererTurbo(this, 68, 83, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 68, 61, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 146, 68, textureX, textureY); // Box 3
		bodyModel[15] = new ModelRendererTurbo(this, 145, 55, textureX, textureY); // Box 6
		bodyModel[16] = new ModelRendererTurbo(this, 145, 75, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 146, 68, textureX, textureY); // Box 3
		bodyModel[18] = new ModelRendererTurbo(this, 145, 75, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 145, 55, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 134, 32, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 358, 61, textureX, textureY, "cull"); // CAB walls
		bodyModel[22] = new ModelRendererTurbo(this, 100, 174, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 56
		bodyModel[24] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 78, 161, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 91
		bodyModel[29] = new ModelRendererTurbo(this, 69, 139, textureX, textureY); // Box 116
		bodyModel[30] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 275
		bodyModel[31] = new ModelRendererTurbo(this, 81, 167, textureX, textureY); // Box 276
		bodyModel[32] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 278
		bodyModel[33] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 280
		bodyModel[34] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 281
		bodyModel[35] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 283
		bodyModel[36] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 284
		bodyModel[37] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 89
		bodyModel[38] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 93
		bodyModel[39] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 280
		bodyModel[40] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 281
		bodyModel[41] = new ModelRendererTurbo(this, 78, 161, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 81, 167, textureX, textureY); // Box 276
		bodyModel[44] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 275
		bodyModel[46] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 278
		bodyModel[47] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 280
		bodyModel[48] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 281
		bodyModel[49] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 283
		bodyModel[50] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 284
		bodyModel[51] = new ModelRendererTurbo(this, 63, 164, textureX, textureY); // Box 280
		bodyModel[52] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 281
		bodyModel[53] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 86
		bodyModel[54] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 88
		bodyModel[56] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 89
		bodyModel[57] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 90
		bodyModel[58] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 103, 148, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 103, 148, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 90
		bodyModel[63] = new ModelRendererTurbo(this, 103, 148, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 89, 139, textureX, textureY); // Box 93
		bodyModel[66] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 1
		bodyModel[69] = new ModelRendererTurbo(this, 67, 99, textureX, textureY); // Box 53
		bodyModel[70] = new ModelRendererTurbo(this, 47, 114, textureX, textureY); // Box 53
		bodyModel[71] = new ModelRendererTurbo(this, 117, 99, textureX, textureY); // Box 53
		bodyModel[72] = new ModelRendererTurbo(this, 76, 108, textureX, textureY); // Box 53
		bodyModel[73] = new ModelRendererTurbo(this, 90, 94, textureX, textureY); // Box 53
		bodyModel[74] = new ModelRendererTurbo(this, 127, 132, textureX, textureY); // Box 53
		bodyModel[75] = new ModelRendererTurbo(this, 61, 132, textureX, textureY); // Box 53
		bodyModel[76] = new ModelRendererTurbo(this, 4, 134, textureX, textureY); // Box 116
		bodyModel[77] = new ModelRendererTurbo(this, 66, 143, textureX, textureY); // Box 116
		bodyModel[78] = new ModelRendererTurbo(this, 36, 134, textureX, textureY); // Box 116
		bodyModel[79] = new ModelRendererTurbo(this, 15, 138, textureX, textureY); // Box 116
		bodyModel[80] = new ModelRendererTurbo(this, 66, 143, textureX, textureY); // Box 116
		bodyModel[81] = new ModelRendererTurbo(this, 52, 146, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 52, 146, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 52, 146, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 66, 143, textureX, textureY); // Box 116
		bodyModel[85] = new ModelRendererTurbo(this, 66, 143, textureX, textureY); // Box 116
		bodyModel[86] = new ModelRendererTurbo(this, 331, 61, textureX, textureY, "cull"); // CAB walls
		bodyModel[87] = new ModelRendererTurbo(this, 269, 17, textureX, textureY, "cull"); // Cab roof cull
		bodyModel[88] = new ModelRendererTurbo(this, 48, 123, textureX, textureY); // Box 53
		bodyModel[89] = new ModelRendererTurbo(this, 212, 214, textureX, textureY); // Box 53
		bodyModel[90] = new ModelRendererTurbo(this, 54, 99, textureX, textureY); // Box 53
		bodyModel[91] = new ModelRendererTurbo(this, 314, 24, textureX, textureY); // Box 22
		bodyModel[92] = new ModelRendererTurbo(this, 108, 99, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 86, 99, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 68, 118, textureX, textureY); // Box 53
		bodyModel[95] = new ModelRendererTurbo(this, 54, 102, textureX, textureY); // Box 53
		bodyModel[96] = new ModelRendererTurbo(this, 135, 114, textureX, textureY); // Box 53
		bodyModel[97] = new ModelRendererTurbo(this, 134, 123, textureX, textureY); // Box 53
		bodyModel[98] = new ModelRendererTurbo(this, 212, 181, textureX, textureY); // Box 53
		bodyModel[99] = new ModelRendererTurbo(this, 114, 118, textureX, textureY); // Box 53
		bodyModel[100] = new ModelRendererTurbo(this, 140, 102, textureX, textureY); // Box 53
		bodyModel[101] = new ModelRendererTurbo(this, 140, 99, textureX, textureY); // Box 53
		bodyModel[102] = new ModelRendererTurbo(this, 89, 108, textureX, textureY); // Box 53
		bodyModel[103] = new ModelRendererTurbo(this, 109, 108, textureX, textureY); // Box 53
		bodyModel[104] = new ModelRendererTurbo(this, 376, 77, textureX, textureY, "cull"); // Back under cab sheet cull
		bodyModel[105] = new ModelRendererTurbo(this, 363, 53, textureX, textureY); // Box 22
		bodyModel[106] = new ModelRendererTurbo(this, 14, 149, textureX, textureY); // Box 2
		bodyModel[107] = new ModelRendererTurbo(this, 291, 75, textureX, textureY); // Box 3
		bodyModel[108] = new ModelRendererTurbo(this, 259, 44, textureX, textureY); // Box 3
		bodyModel[109] = new ModelRendererTurbo(this, 159, 10, textureX, textureY); // Box 3
		bodyModel[110] = new ModelRendererTurbo(this, 166, 23, textureX, textureY); // Box 3
		bodyModel[111] = new ModelRendererTurbo(this, 144, 3, textureX, textureY); // Box 3
		bodyModel[112] = new ModelRendererTurbo(this, 154, 25, textureX, textureY); // Box 3
		bodyModel[113] = new ModelRendererTurbo(this, 159, 23, textureX, textureY); // Box 3
		bodyModel[114] = new ModelRendererTurbo(this, 113, 3, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 117, 11, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 129, 3, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 134, 15, textureX, textureY); // Box 2
		bodyModel[121] = new ModelRendererTurbo(this, 108, 11, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 108, 5, textureX, textureY); // Box 2
		bodyModel[123] = new ModelRendererTurbo(this, 138, 11, textureX, textureY); // Box 2
		bodyModel[124] = new ModelRendererTurbo(this, 138, 5, textureX, textureY); // Box 2
		bodyModel[125] = new ModelRendererTurbo(this, 166, 2, textureX, textureY); // Box 3
		bodyModel[126] = new ModelRendererTurbo(this, 200, 3, textureX, textureY); // Box 3
		bodyModel[127] = new ModelRendererTurbo(this, 202, 25, textureX, textureY); // Box 3
		bodyModel[128] = new ModelRendererTurbo(this, 195, 24, textureX, textureY); // Box 3
		bodyModel[129] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 3
		bodyModel[130] = new ModelRendererTurbo(this, 159, 2, textureX, textureY); // Box 3
		bodyModel[131] = new ModelRendererTurbo(this, 202, 4, textureX, textureY); // Box 3
		bodyModel[132] = new ModelRendererTurbo(this, 195, 3, textureX, textureY); // Box 3
		bodyModel[133] = new ModelRendererTurbo(this, 163, 114, textureX, textureY); // Box 2
		bodyModel[134] = new ModelRendererTurbo(this, 191, 114, textureX, textureY); // Box 2
		bodyModel[135] = new ModelRendererTurbo(this, 156, 109, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 166, 124, textureX, textureY); // Box 2
		bodyModel[137] = new ModelRendererTurbo(this, 194, 124, textureX, textureY); // Box 2
		bodyModel[138] = new ModelRendererTurbo(this, 187, 120, textureX, textureY); // Box 2
		bodyModel[139] = new ModelRendererTurbo(this, 110, 138, textureX, textureY); // Box 116
		bodyModel[140] = new ModelRendererTurbo(this, 110, 138, textureX, textureY); // Box 116
		bodyModel[141] = new ModelRendererTurbo(this, 121, 143, textureX, textureY); // Box 116
		bodyModel[142] = new ModelRendererTurbo(this, 121, 143, textureX, textureY); // Box 116
		bodyModel[143] = new ModelRendererTurbo(this, 140, 142, textureX, textureY); // Box 83
		bodyModel[144] = new ModelRendererTurbo(this, 127, 140, textureX, textureY); // Box 116
		bodyModel[145] = new ModelRendererTurbo(this, 43, 69, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 49, 62, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 43, 71, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 55, 71, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 49, 82, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 40, 82, textureX, textureY); // Box 2
		bodyModel[151] = new ModelRendererTurbo(this, 58, 82, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 85, 8, textureX, textureY); // Box 2
		bodyModel[153] = new ModelRendererTurbo(this, 88, 10, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 97, 8, textureX, textureY); // Box 2
		bodyModel[155] = new ModelRendererTurbo(this, 261, 44, textureX, textureY); // Box 3
		bodyModel[156] = new ModelRendererTurbo(this, 17, 122, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 37, 122, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 16, 62, textureX, textureY, "cull"); // Front steps cull
		bodyModel[159] = new ModelRendererTurbo(this, 1, 62, textureX, textureY, "cull"); // Front steps cull
		bodyModel[160] = new ModelRendererTurbo(this, 277, 25, textureX, textureY, "cull"); // Cab cull
		bodyModel[161] = new ModelRendererTurbo(this, 283, 37, textureX, textureY); // Box 26
		bodyModel[162] = new ModelRendererTurbo(this, 277, 30, textureX, textureY); // Box 26
		bodyModel[163] = new ModelRendererTurbo(this, 277, 12, textureX, textureY, "cull"); // Cab cull
		bodyModel[164] = new ModelRendererTurbo(this, 283, 3, textureX, textureY); // Box 26
		bodyModel[165] = new ModelRendererTurbo(this, 277, 7, textureX, textureY); // Box 26
		bodyModel[166] = new ModelRendererTurbo(this, 337, 29, textureX, textureY); // Box 22
		bodyModel[167] = new ModelRendererTurbo(this, 339, 40, textureX, textureY); // Box 22
		bodyModel[168] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 22
		bodyModel[169] = new ModelRendererTurbo(this, 324, 29, textureX, textureY); // Box 22
		bodyModel[170] = new ModelRendererTurbo(this, 326, 40, textureX, textureY); // Box 22
		bodyModel[171] = new ModelRendererTurbo(this, 324, 34, textureX, textureY); // Box 22
		bodyModel[172] = new ModelRendererTurbo(this, 27, 71, textureX, textureY, "cull"); // Front steps cull
		bodyModel[173] = new ModelRendererTurbo(this, 1, 54, textureX, textureY, "cull"); // Front steps cull
		bodyModel[174] = new ModelRendererTurbo(this, 14, 83, textureX, textureY); // Box 109
		bodyModel[175] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // Box 109
		bodyModel[176] = new ModelRendererTurbo(this, 14, 75, textureX, textureY); // Box 109
		bodyModel[177] = new ModelRendererTurbo(this, 4, 83, textureX, textureY); // Box 109
		bodyModel[178] = new ModelRendererTurbo(this, 16, 80, textureX, textureY); // Box 113
		bodyModel[179] = new ModelRendererTurbo(this, 6, 80, textureX, textureY); // Box 113
		bodyModel[180] = new ModelRendererTurbo(this, 14, 83, textureX, textureY); // Box 109
		bodyModel[181] = new ModelRendererTurbo(this, 4, 75, textureX, textureY); // Box 109
		bodyModel[182] = new ModelRendererTurbo(this, 14, 75, textureX, textureY); // Box 109
		bodyModel[183] = new ModelRendererTurbo(this, 4, 83, textureX, textureY); // Box 109
		bodyModel[184] = new ModelRendererTurbo(this, 16, 80, textureX, textureY); // Box 113
		bodyModel[185] = new ModelRendererTurbo(this, 6, 80, textureX, textureY); // Box 113
		bodyModel[186] = new ModelRendererTurbo(this, 15, 95, textureX, textureY); // Box 2
		bodyModel[187] = new ModelRendererTurbo(this, 9, 112, textureX, textureY, "cull"); // Front air compressor cover cull
		bodyModel[188] = new ModelRendererTurbo(this, 28, 113, textureX, textureY); // Box 109
		bodyModel[189] = new ModelRendererTurbo(this, 25, 111, textureX, textureY); // Box 109
		bodyModel[190] = new ModelRendererTurbo(this, 7, 98, textureX, textureY); // Box 109
		bodyModel[191] = new ModelRendererTurbo(this, 18, 112, textureX, textureY, "cull"); // Front air compressor cover cull
		bodyModel[192] = new ModelRendererTurbo(this, 6, 113, textureX, textureY); // Box 109
		bodyModel[193] = new ModelRendererTurbo(this, 5, 111, textureX, textureY); // Box 109
		bodyModel[194] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 2
		bodyModel[195] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 16, 89, textureX, textureY); // Box 2
		bodyModel[197] = new ModelRendererTurbo(this, 16, 97, textureX, textureY); // Box 2
		bodyModel[198] = new ModelRendererTurbo(this, 3, 97, textureX, textureY); // Box 2
		bodyModel[199] = new ModelRendererTurbo(this, 422, 36, textureX, textureY); // Box 3
		bodyModel[200] = new ModelRendererTurbo(this, 430, 52, textureX, textureY); // Box 6
		bodyModel[201] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 3
		bodyModel[202] = new ModelRendererTurbo(this, 410, 48, textureX, textureY); // Box 3
		bodyModel[203] = new ModelRendererTurbo(this, 201, 135, textureX, textureY); // Box 109
		bodyModel[204] = new ModelRendererTurbo(this, 206, 109, textureX, textureY); // Box 109
		bodyModel[205] = new ModelRendererTurbo(this, 201, 101, textureX, textureY); // Box 109
		bodyModel[206] = new ModelRendererTurbo(this, 123, 5, textureX, textureY); // Box 2
		bodyModel[207] = new ModelRendererTurbo(this, 3, 11, textureX, textureY); // N-1 steam thingy
		bodyModel[208] = new ModelRendererTurbo(this, 184, 109, textureX, textureY); // N series running board
		bodyModel[209] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // N series steam thingy?
		bodyModel[210] = new ModelRendererTurbo(this, 109, 24, textureX, textureY); // Box 2
		bodyModel[211] = new ModelRendererTurbo(this, 105, 21, textureX, textureY); // Box 2
		bodyModel[212] = new ModelRendererTurbo(this, 12, 22, textureX, textureY); // N-1 steam thingy
		bodyModel[213] = new ModelRendererTurbo(this, 2, 18, textureX, textureY); // N-1 steam thingy
		bodyModel[214] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // N-1 steam thingy
		bodyModel[215] = new ModelRendererTurbo(this, 17, 34, textureX, textureY); // N series steam thingy?
		bodyModel[216] = new ModelRendererTurbo(this, 12, 39, textureX, textureY); // N series steam thingy?
		bodyModel[217] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // N series steam thingy?
		bodyModel[218] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 2
		bodyModel[219] = new ModelRendererTurbo(this, 67, 21, textureX, textureY); // Box 2
		bodyModel[220] = new ModelRendererTurbo(this, 71, 24, textureX, textureY); // Box 2
		bodyModel[221] = new ModelRendererTurbo(this, 190, 106, textureX, textureY); // Box 2
		bodyModel[222] = new ModelRendererTurbo(this, 195, 101, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 248, 100, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 248, 103, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 269, 93, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 279, 96, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 274, 96, textureX, textureY); // Box 2
		bodyModel[228] = new ModelRendererTurbo(this, 269, 96, textureX, textureY); // Box 2
		bodyModel[229] = new ModelRendererTurbo(this, 267, 104, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 153, 92, textureX, textureY, "cull"); // Drivers boiler suport cull
		bodyModel[231] = new ModelRendererTurbo(this, 159, 88, textureX, textureY, "cull"); // Drivers boiler suport cull
		bodyModel[232] = new ModelRendererTurbo(this, 159, 88, textureX, textureY, "cull"); // Drivers boiler suport cull
		bodyModel[233] = new ModelRendererTurbo(this, 68, 10, textureX, textureY); // Box 2
		bodyModel[234] = new ModelRendererTurbo(this, 69, 4, textureX, textureY); // Box 2
		bodyModel[235] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 233, 31, textureX, textureY); // Box 2
		bodyModel[237] = new ModelRendererTurbo(this, 200, 31, textureX, textureY); // Box 2
		bodyModel[238] = new ModelRendererTurbo(this, 193, 43, textureX, textureY); // Box 2
		bodyModel[239] = new ModelRendererTurbo(this, 193, 37, textureX, textureY); // Box 2
		bodyModel[240] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 184, 35, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 230, 33, textureX, textureY); // Box 2
		bodyModel[243] = new ModelRendererTurbo(this, 197, 33, textureX, textureY); // Box 2
		bodyModel[244] = new ModelRendererTurbo(this, 190, 43, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 190, 37, textureX, textureY); // Box 2
		bodyModel[246] = new ModelRendererTurbo(this, 190, 41, textureX, textureY); // Box 2
		bodyModel[247] = new ModelRendererTurbo(this, 141, 111, textureX, textureY); // Box 53
		bodyModel[248] = new ModelRendererTurbo(this, 52, 111, textureX, textureY); // Box 53
		bodyModel[249] = new ModelRendererTurbo(this, 118, 108, textureX, textureY); // Box 53
		bodyModel[250] = new ModelRendererTurbo(this, 66, 108, textureX, textureY); // Box 53
		bodyModel[251] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 26
		bodyModel[252] = new ModelRendererTurbo(this, 313, 30, textureX, textureY); // Box 26
		bodyModel[253] = new ModelRendererTurbo(this, 315, 4, textureX, textureY); // Box 26
		bodyModel[254] = new ModelRendererTurbo(this, 310, 4, textureX, textureY); // Box 26
		bodyModel[255] = new ModelRendererTurbo(this, 213, 223, textureX, textureY); // Box 84
		bodyModel[256] = new ModelRendererTurbo(this, 243, 212, textureX, textureY); // Box 84
		bodyModel[257] = new ModelRendererTurbo(this, 254, 214, textureX, textureY); // Box 84
		bodyModel[258] = new ModelRendererTurbo(this, 285, 211, textureX, textureY); // Box 84
		bodyModel[259] = new ModelRendererTurbo(this, 254, 211, textureX, textureY); // Box 84
		bodyModel[260] = new ModelRendererTurbo(this, 278, 200, textureX, textureY); // Box 84
		bodyModel[261] = new ModelRendererTurbo(this, 270, 208, textureX, textureY); // Box 84
		bodyModel[262] = new ModelRendererTurbo(this, 228, 201, textureX, textureY); // Box 84
		bodyModel[263] = new ModelRendererTurbo(this, 223, 193, textureX, textureY); // Box 84
		bodyModel[264] = new ModelRendererTurbo(this, 259, 201, textureX, textureY, "cull"); // STUPID BAKER VALVE GEAR PART CULL
		bodyModel[265] = new ModelRendererTurbo(this, 261, 203, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[266] = new ModelRendererTurbo(this, 244, 195, textureX, textureY); // Box 84
		bodyModel[267] = new ModelRendererTurbo(this, 246, 198, textureX, textureY); // Box 84
		bodyModel[268] = new ModelRendererTurbo(this, 206, 210, textureX, textureY); // Box 53
		bodyModel[269] = new ModelRendererTurbo(this, 206, 207, textureX, textureY); // Box 53
		bodyModel[270] = new ModelRendererTurbo(this, 219, 204, textureX, textureY); // Box 84
		bodyModel[271] = new ModelRendererTurbo(this, 292, 210, textureX, textureY); // Box 84
		bodyModel[272] = new ModelRendererTurbo(this, 254, 207, textureX, textureY); // Box 84
		bodyModel[273] = new ModelRendererTurbo(this, 254, 202, textureX, textureY); // Box 84
		bodyModel[274] = new ModelRendererTurbo(this, 254, 197, textureX, textureY); // Box 84
		bodyModel[275] = new ModelRendererTurbo(this, 230, 193, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[276] = new ModelRendererTurbo(this, 243, 206, textureX, textureY, "cull"); // Box 53
		bodyModel[277] = new ModelRendererTurbo(this, 244, 202, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[278] = new ModelRendererTurbo(this, 263, 199, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[279] = new ModelRendererTurbo(this, 281, 175, textureX, textureY); // Box 335
		bodyModel[280] = new ModelRendererTurbo(this, 213, 190, textureX, textureY); // Box 84
		bodyModel[281] = new ModelRendererTurbo(this, 243, 179, textureX, textureY); // Box 84
		bodyModel[282] = new ModelRendererTurbo(this, 254, 181, textureX, textureY); // Box 84
		bodyModel[283] = new ModelRendererTurbo(this, 285, 178, textureX, textureY); // Box 84
		bodyModel[284] = new ModelRendererTurbo(this, 254, 178, textureX, textureY); // Box 84
		bodyModel[285] = new ModelRendererTurbo(this, 228, 168, textureX, textureY); // Box 84
		bodyModel[286] = new ModelRendererTurbo(this, 223, 160, textureX, textureY); // Box 84
		bodyModel[287] = new ModelRendererTurbo(this, 206, 177, textureX, textureY); // Box 53
		bodyModel[288] = new ModelRendererTurbo(this, 219, 171, textureX, textureY); // Box 84
		bodyModel[289] = new ModelRendererTurbo(this, 292, 177, textureX, textureY); // Box 84
		bodyModel[290] = new ModelRendererTurbo(this, 254, 174, textureX, textureY); // Box 84
		bodyModel[291] = new ModelRendererTurbo(this, 254, 169, textureX, textureY); // Box 84
		bodyModel[292] = new ModelRendererTurbo(this, 230, 160, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[293] = new ModelRendererTurbo(this, 243, 173, textureX, textureY); // Box 53
		bodyModel[294] = new ModelRendererTurbo(this, 244, 169, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[295] = new ModelRendererTurbo(this, 279, 167, textureX, textureY); // Box 84
		bodyModel[296] = new ModelRendererTurbo(this, 270, 175, textureX, textureY); // Box 84
		bodyModel[297] = new ModelRendererTurbo(this, 259, 168, textureX, textureY, "cull"); // STUPID BAKER VALVE GEAR PART CULL
		bodyModel[298] = new ModelRendererTurbo(this, 261, 170, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[299] = new ModelRendererTurbo(this, 244, 162, textureX, textureY); // Box 84
		bodyModel[300] = new ModelRendererTurbo(this, 246, 165, textureX, textureY); // Box 84
		bodyModel[301] = new ModelRendererTurbo(this, 254, 164, textureX, textureY); // Box 84
		bodyModel[302] = new ModelRendererTurbo(this, 263, 166, textureX, textureY, "cull"); // PM BAKER VALVE GEAR BS CULL
		bodyModel[303] = new ModelRendererTurbo(this, 206, 174, textureX, textureY); // Box 53
		bodyModel[304] = new ModelRendererTurbo(this, 398, 106, textureX, textureY); // Box 109
		bodyModel[305] = new ModelRendererTurbo(this, 190, 98, textureX, textureY); // Box 2
		bodyModel[306] = new ModelRendererTurbo(this, 377, 108, textureX, textureY); // Box 84
		bodyModel[307] = new ModelRendererTurbo(this, 389, 105, textureX, textureY); // Box 109
		bodyModel[308] = new ModelRendererTurbo(this, 206, 203, textureX, textureY, "cull"); // MORE STUPID CULL
		bodyModel[309] = new ModelRendererTurbo(this, 240, 104, textureX, textureY); // Box 2
		bodyModel[310] = new ModelRendererTurbo(this, 248, 106, textureX, textureY); // Box 2
		bodyModel[311] = new ModelRendererTurbo(this, 411, 106, textureX, textureY); // Box 109
		bodyModel[312] = new ModelRendererTurbo(this, 418, 105, textureX, textureY); // Box 109
		bodyModel[313] = new ModelRendererTurbo(this, 367, 111, textureX, textureY); // Box 84
		bodyModel[314] = new ModelRendererTurbo(this, 206, 198, textureX, textureY, "cull"); // MORE STUPID CULL
		bodyModel[315] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Mechanical lubricator
		bodyModel[316] = new ModelRendererTurbo(this, 206, 170, textureX, textureY, "cull"); // MORE STUPID CULL
		bodyModel[317] = new ModelRendererTurbo(this, 206, 165, textureX, textureY, "cull"); // MORE STUPID CULL
		bodyModel[318] = new ModelRendererTurbo(this, 209, 160, textureX, textureY); // Mechanical lubricator
		bodyModel[319] = new ModelRendererTurbo(this, 201, 134, textureX, textureY); // Box 376
		bodyModel[320] = new ModelRendererTurbo(this, 203, 146, textureX, textureY); // Box 376
		bodyModel[321] = new ModelRendererTurbo(this, 221, 134, textureX, textureY); // Box 376
		bodyModel[322] = new ModelRendererTurbo(this, 223, 146, textureX, textureY); // Box 376
		bodyModel[323] = new ModelRendererTurbo(this, 234, 186, textureX, textureY); // Box 84
		bodyModel[324] = new ModelRendererTurbo(this, 241, 186, textureX, textureY); // Box 84
		bodyModel[325] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 84
		bodyModel[326] = new ModelRendererTurbo(this, 258, 186, textureX, textureY); // Box 84
		bodyModel[327] = new ModelRendererTurbo(this, 234, 219, textureX, textureY); // Box 84
		bodyModel[328] = new ModelRendererTurbo(this, 241, 219, textureX, textureY); // Box 84
		bodyModel[329] = new ModelRendererTurbo(this, 249, 218, textureX, textureY); // Box 84
		bodyModel[330] = new ModelRendererTurbo(this, 258, 219, textureX, textureY); // Box 84
		bodyModel[331] = new ModelRendererTurbo(this, 238, 15, textureX, textureY); // Box 388
		bodyModel[332] = new ModelRendererTurbo(this, 254, 11, textureX, textureY, "cull"); // Cab cull
		bodyModel[333] = new ModelRendererTurbo(this, 238, 11, textureX, textureY, "cull"); // Cab cull
		bodyModel[334] = new ModelRendererTurbo(this, 225, 16, textureX, textureY); // Box 388
		bodyModel[335] = new ModelRendererTurbo(this, 284, 96, textureX, textureY); // Box 2
		bodyModel[336] = new ModelRendererTurbo(this, 136, 153, textureX, textureY); // Box 83
		bodyModel[337] = new ModelRendererTurbo(this, 127, 153, textureX, textureY); // Box 83
		bodyModel[338] = new ModelRendererTurbo(this, 148, 149, textureX, textureY); // Box 83
		bodyModel[339] = new ModelRendererTurbo(this, 136, 153, textureX, textureY); // Box 83
		bodyModel[340] = new ModelRendererTurbo(this, 127, 153, textureX, textureY); // Box 83
		bodyModel[341] = new ModelRendererTurbo(this, 148, 149, textureX, textureY); // Box 83
		bodyModel[342] = new ModelRendererTurbo(this, 207, 24, textureX, textureY, "cull"); // Valve protector cull
		bodyModel[343] = new ModelRendererTurbo(this, 218, 20, textureX, textureY); // Safty valves
		bodyModel[344] = new ModelRendererTurbo(this, 208, 20, textureX, textureY); // Safty valves
		bodyModel[345] = new ModelRendererTurbo(this, 213, 20, textureX, textureY); // Safty valves
		bodyModel[346] = new ModelRendererTurbo(this, 212, 18, textureX, textureY); // Box 400
		bodyModel[347] = new ModelRendererTurbo(this, 212, 15, textureX, textureY); // Box 400
		bodyModel[348] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // PM N class sand pipes
		bodyModel[349] = new ModelRendererTurbo(this, 97, 27, textureX, textureY); // PM N class sand pipes
		bodyModel[350] = new ModelRendererTurbo(this, 92, 33, textureX, textureY); // PM N class sand pipes
		bodyModel[351] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // PM N class sand pipes
		bodyModel[352] = new ModelRendererTurbo(this, 102, 28, textureX, textureY); // PM N class sand pipes
		bodyModel[353] = new ModelRendererTurbo(this, 87, 28, textureX, textureY); // PM N class sand pipes
		bodyModel[354] = new ModelRendererTurbo(this, 73, 37, textureX, textureY); // PM N class sand pipes
		bodyModel[355] = new ModelRendererTurbo(this, 87, 34, textureX, textureY); // PM N class sand pipes
		bodyModel[356] = new ModelRendererTurbo(this, 102, 37, textureX, textureY); // PM N class sand pipes
		bodyModel[357] = new ModelRendererTurbo(this, 102, 34, textureX, textureY); // PM N class sand pipes
		bodyModel[358] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // PM N class sand pipes
		bodyModel[359] = new ModelRendererTurbo(this, 97, 27, textureX, textureY); // PM N class sand pipes
		bodyModel[360] = new ModelRendererTurbo(this, 92, 33, textureX, textureY); // PM N class sand pipes
		bodyModel[361] = new ModelRendererTurbo(this, 92, 27, textureX, textureY); // PM N class sand pipes
		bodyModel[362] = new ModelRendererTurbo(this, 102, 28, textureX, textureY); // PM N class sand pipes
		bodyModel[363] = new ModelRendererTurbo(this, 87, 28, textureX, textureY); // PM N class sand pipes
		bodyModel[364] = new ModelRendererTurbo(this, 73, 37, textureX, textureY); // PM N class sand pipes
		bodyModel[365] = new ModelRendererTurbo(this, 87, 34, textureX, textureY); // PM N class sand pipes
		bodyModel[366] = new ModelRendererTurbo(this, 102, 37, textureX, textureY); // PM N class sand pipes
		bodyModel[367] = new ModelRendererTurbo(this, 102, 34, textureX, textureY); // PM N class sand pipes
		bodyModel[368] = new ModelRendererTurbo(this, 134, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[369] = new ModelRendererTurbo(this, 134, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[370] = new ModelRendererTurbo(this, 129, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[371] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[372] = new ModelRendererTurbo(this, 139, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[373] = new ModelRendererTurbo(this, 139, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[374] = new ModelRendererTurbo(this, 144, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[375] = new ModelRendererTurbo(this, 144, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[376] = new ModelRendererTurbo(this, 124, 25, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[377] = new ModelRendererTurbo(this, 116, 34, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[378] = new ModelRendererTurbo(this, 124, 31, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[379] = new ModelRendererTurbo(this, 123, 37, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[380] = new ModelRendererTurbo(this, 134, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[381] = new ModelRendererTurbo(this, 134, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[382] = new ModelRendererTurbo(this, 129, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[383] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[384] = new ModelRendererTurbo(this, 139, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[385] = new ModelRendererTurbo(this, 139, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[386] = new ModelRendererTurbo(this, 144, 33, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[387] = new ModelRendererTurbo(this, 144, 27, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[388] = new ModelRendererTurbo(this, 124, 25, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[389] = new ModelRendererTurbo(this, 116, 34, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[390] = new ModelRendererTurbo(this, 124, 31, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[391] = new ModelRendererTurbo(this, 123, 37, textureX, textureY); // PM N-1 class sand pipes
		bodyModel[392] = new ModelRendererTurbo(this, 221, 7, textureX, textureY); // Box 445
		bodyModel[393] = new ModelRendererTurbo(this, 219, 10, textureX, textureY); // Box 445
		bodyModel[394] = new ModelRendererTurbo(this, 226, 27, textureX, textureY, "cull"); // Generator suport cull
		bodyModel[395] = new ModelRendererTurbo(this, 225, 22, textureX, textureY); // Generator
		bodyModel[396] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 2
		bodyModel[397] = new ModelRendererTurbo(this, 42, 24, textureX, textureY); // Box 2
		bodyModel[398] = new ModelRendererTurbo(this, 166, 132, textureX, textureY); // Box 2
		bodyModel[399] = new ModelRendererTurbo(this, 276, 132, textureX, textureY); // Box 452
		bodyModel[400] = new ModelRendererTurbo(this, 270, 132, textureX, textureY); // Box 452
		bodyModel[401] = new ModelRendererTurbo(this, 283, 135, textureX, textureY); // Box 452
		bodyModel[402] = new ModelRendererTurbo(this, 268, 137, textureX, textureY); // Box 452
		bodyModel[403] = new ModelRendererTurbo(this, 263, 135, textureX, textureY); // Box 452
		bodyModel[404] = new ModelRendererTurbo(this, 266, 142, textureX, textureY); // Steam thiny support cul
		bodyModel[405] = new ModelRendererTurbo(this, 284, 89, textureX, textureY); // Box 456
		bodyModel[406] = new ModelRendererTurbo(this, 277, 105, textureX, textureY); // Box 456
		bodyModel[407] = new ModelRendererTurbo(this, 281, 83, textureX, textureY); // Box 458
		bodyModel[408] = new ModelRendererTurbo(this, 268, 86, textureX, textureY); // Box 458
		bodyModel[409] = new ModelRendererTurbo(this, 268, 83, textureX, textureY); // Box 458
		bodyModel[410] = new ModelRendererTurbo(this, 274, 103, textureX, textureY); // Box 458
		bodyModel[411] = new ModelRendererTurbo(this, 399, 91, textureX, textureY); // Box 83
		bodyModel[412] = new ModelRendererTurbo(this, 164, 141, textureX, textureY); // Box 2
		bodyModel[413] = new ModelRendererTurbo(this, 365, 88, textureX, textureY); // Box 83
		bodyModel[414] = new ModelRendererTurbo(this, 383, 88, textureX, textureY); // Box 83
		bodyModel[415] = new ModelRendererTurbo(this, 374, 91, textureX, textureY); // Box 83
		bodyModel[416] = new ModelRendererTurbo(this, 269, 109, textureX, textureY); // Box 2
		bodyModel[417] = new ModelRendererTurbo(this, 159, 142, textureX, textureY, "cull"); // Undercab supports cull
		bodyModel[418] = new ModelRendererTurbo(this, 184, 148, textureX, textureY, "cull"); // Undercab supports cull
		bodyModel[419] = new ModelRendererTurbo(this, 358, 40, textureX, textureY); // CAB walls
		bodyModel[420] = new ModelRendererTurbo(this, 361, 21, textureX, textureY); // Box 22
		bodyModel[421] = new ModelRendererTurbo(this, 363, 32, textureX, textureY); // Box 22
		bodyModel[422] = new ModelRendererTurbo(this, 361, 26, textureX, textureY); // Box 22
		bodyModel[423] = new ModelRendererTurbo(this, 373, 21, textureX, textureY); // Box 22
		bodyModel[424] = new ModelRendererTurbo(this, 375, 32, textureX, textureY); // Box 22
		bodyModel[425] = new ModelRendererTurbo(this, 373, 26, textureX, textureY); // Box 22
		bodyModel[426] = new ModelRendererTurbo(this, 372, 40, textureX, textureY); // CAB walls
		bodyModel[427] = new ModelRendererTurbo(this, 360, 26, textureX, textureY); // CAB walls
		bodyModel[428] = new ModelRendererTurbo(this, 146, 122, textureX, textureY); // Box 2
		bodyModel[429] = new ModelRendererTurbo(this, 169, 142, textureX, textureY); // Box 2
		bodyModel[430] = new ModelRendererTurbo(this, 405, 84, textureX, textureY); // Box 83
		bodyModel[431] = new ModelRendererTurbo(this, 367, 97, textureX, textureY); // Box 484
		bodyModel[432] = new ModelRendererTurbo(this, 367, 102, textureX, textureY); // Box 484
		bodyModel[433] = new ModelRendererTurbo(this, 374, 84, textureX, textureY); // Box 83
		bodyModel[434] = new ModelRendererTurbo(this, 168, 156, textureX, textureY, "cull"); // Undercab supports cull
		bodyModel[435] = new ModelRendererTurbo(this, 290, 138, textureX, textureY); // Box 452
		bodyModel[436] = new ModelRendererTurbo(this, 34, 29, textureX, textureY, "cull"); // Bell holder cull
		bodyModel[437] = new ModelRendererTurbo(this, 37, 33, textureX, textureY); // Box 114
		bodyModel[438] = new ModelRendererTurbo(this, 37, 33, textureX, textureY); // Box 74
		bodyModel[439] = new ModelRendererTurbo(this, 37, 36, textureX, textureY); // Box 78
		bodyModel[440] = new ModelRendererTurbo(this, 36, 25, textureX, textureY, "cull"); // Bell holder cull
		bodyModel[441] = new ModelRendererTurbo(this, 31, 51, textureX, textureY, "cull"); // Light support cull
		bodyModel[442] = new ModelRendererTurbo(this, 33, 42, textureX, textureY); // Box 2 headlight
		bodyModel[443] = new ModelRendererTurbo(this, 28, 42, textureX, textureY, "lamp"); // Box 2 headlight glow
		bodyModel[444] = new ModelRendererTurbo(this, 33, 39, textureX, textureY); // Box 2 headlight
		bodyModel[445] = new ModelRendererTurbo(this, 33, 47, textureX, textureY); // Box 2 headlight
		bodyModel[446] = new ModelRendererTurbo(this, 21, 52, textureX, textureY); // Box 2 Numberboard
		bodyModel[447] = new ModelRendererTurbo(this, 32, 51, textureX, textureY); // Numberboard nonlit
		bodyModel[448] = new ModelRendererTurbo(this, 21, 48, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_448"); // Box 2 Numberboard glow
		bodyModel[449] = new ModelRendererTurbo(this, 21, 48, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_449"); // Box 2 Numberboard glow
		bodyModel[450] = new ModelRendererTurbo(this, 4, 159, textureX, textureY); // Box 505
		bodyModel[451] = new ModelRendererTurbo(this, 4, 159, textureX, textureY); // Box 505
		bodyModel[452] = new ModelRendererTurbo(this, 30, 159, textureX, textureY); // Box 505
		bodyModel[453] = new ModelRendererTurbo(this, 30, 159, textureX, textureY); // Box 505
		bodyModel[454] = new ModelRendererTurbo(this, 15, 151, textureX, textureY); // Box 2
		bodyModel[455] = new ModelRendererTurbo(this, 44, 165, textureX, textureY); // Box 2
		bodyModel[456] = new ModelRendererTurbo(this, 10, 165, textureX, textureY); // Box 2
		bodyModel[457] = new ModelRendererTurbo(this, 8, 175, textureX, textureY, "cull"); // Plow step cull
		bodyModel[458] = new ModelRendererTurbo(this, 42, 175, textureX, textureY, "cull"); // Plow step cull
		bodyModel[459] = new ModelRendererTurbo(this, 15, 171, textureX, textureY); // Damn plow parts
		bodyModel[460] = new ModelRendererTurbo(this, 24, 173, textureX, textureY); // Damn plow parts
		bodyModel[461] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Damn plow parts
		bodyModel[462] = new ModelRendererTurbo(this, 30, 173, textureX, textureY); // Damn plow parts
		bodyModel[463] = new ModelRendererTurbo(this, 30, 175, textureX, textureY); // Damn plow parts
		bodyModel[464] = new ModelRendererTurbo(this, 35, 171, textureX, textureY); // Damn plow parts
		bodyModel[465] = new ModelRendererTurbo(this, 341, 16, textureX, textureY); // Cab roof hatch middle
		bodyModel[466] = new ModelRendererTurbo(this, 358, 13, textureX, textureY); // Cab roof hatch engineer side
		bodyModel[467] = new ModelRendererTurbo(this, 328, 13, textureX, textureY); // Cab roof hatch fireman sie
		bodyModel[468] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 2
		bodyModel[469] = new ModelRendererTurbo(this, 264, 50, textureX, textureY); // Box 3
		bodyModel[470] = new ModelRendererTurbo(this, 486, 62, textureX, textureY); // Box 521
		bodyModel[471] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 277
		bodyModel[472] = new ModelRendererTurbo(this, 472, 69, textureX, textureY); // Box 277
		bodyModel[473] = new ModelRendererTurbo(this, 484, 53, textureX, textureY); // Box 2
		bodyModel[474] = new ModelRendererTurbo(this, 484, 58, textureX, textureY); // Box 2
		bodyModel[475] = new ModelRendererTurbo(this, 479, 67, textureX, textureY); // Box 277
		bodyModel[476] = new ModelRendererTurbo(this, 479, 63, textureX, textureY); // Box 277
		bodyModel[477] = new ModelRendererTurbo(this, 453, 23, textureX, textureY); // Box 529
		bodyModel[478] = new ModelRendererTurbo(this, 456, 40, textureX, textureY, "cull"); // COCK SUPPORT cull
		bodyModel[479] = new ModelRendererTurbo(this, 464, 52, textureX, textureY); // Box 531
		bodyModel[480] = new ModelRendererTurbo(this, 457, 69, textureX, textureY); // Box 531
		bodyModel[481] = new ModelRendererTurbo(this, 464, 69, textureX, textureY); // Box 531
		bodyModel[482] = new ModelRendererTurbo(this, 470, 43, textureX, textureY); // Box 276
		bodyModel[483] = new ModelRendererTurbo(this, 444, 45, textureX, textureY); // Box 276
		bodyModel[484] = new ModelRendererTurbo(this, 479, 43, textureX, textureY); // Box 531
		bodyModel[485] = new ModelRendererTurbo(this, 457, 56, textureX, textureY, "cull"); // Cab cover cull
		bodyModel[486] = new ModelRendererTurbo(this, 455, 55, textureX, textureY); // Box 2
		bodyModel[487] = new ModelRendererTurbo(this, 448, 55, textureX, textureY); // Box 2
		bodyModel[488] = new ModelRendererTurbo(this, 448, 56, textureX, textureY); // Pipeing
		bodyModel[489] = new ModelRendererTurbo(this, 471, 52, textureX, textureY); // Flux capacitor
		bodyModel[490] = new ModelRendererTurbo(this, 58, 33, textureX, textureY); // Box 2
		bodyModel[491] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Box 2
		bodyModel[492] = new ModelRendererTurbo(this, 49, 30, textureX, textureY); // Box 2 Numberboard
		bodyModel[493] = new ModelRendererTurbo(this, 58, 26, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_493"); // Box 2 Numberboard glow
		bodyModel[494] = new ModelRendererTurbo(this, 46, 26, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_494"); // Box 2 Numberboard glow
		bodyModel[495] = new ModelRendererTurbo(this, 58, 30, textureX, textureY); // Box 2 Numberboard
		bodyModel[496] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 27
		bodyModel[497] = new ModelRendererTurbo(this, 100, 174, textureX, textureY); // Box 27
		bodyModel[498] = new ModelRendererTurbo(this, 100, 174, textureX, textureY); // Box 27
		bodyModel[499] = new ModelRendererTurbo(this, 149, 195, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, 0F, 0F, 27, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[0].setRotationPoint(12F, -20F, -2.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 27, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(12F, -20F, 2.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 27, 6, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(12F, -20F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(12F, -9F, -2.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 6
		bodyModel[4].setRotationPoint(12F, -9F, 2.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[5].setRotationPoint(12F, -9F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[6].setRotationPoint(12F, -14F, -8.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 30, 5, 5, 0F); // Box 3
		bodyModel[7].setRotationPoint(-34F, -19F, -2.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(-34F, -19F, 2.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[9].setRotationPoint(-34F, -19F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[10].setRotationPoint(-34F, -9F, -2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 6
		bodyModel[11].setRotationPoint(-34F, -9F, 2.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 30, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[12].setRotationPoint(-34F, -9F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 30, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[13].setRotationPoint(-34F, -14F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[14].setRotationPoint(-4F, -20F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		bodyModel[15].setRotationPoint(-4F, -20F, 2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F,0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[16].setRotationPoint(-4F, -20F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[17].setRotationPoint(-4F, -4F, -2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 6
		bodyModel[18].setRotationPoint(-4F, -9F, 2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 6, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[19].setRotationPoint(-4F, -9F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[20].setRotationPoint(-4F, -14F, -8.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // CAB walls
		bodyModel[21].setRotationPoint(35F, -17F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[22].setRotationPoint(9.5F, 0F, 5.51F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 3, 11, 0F); // Box 56
		bodyModel[23].setRotationPoint(2F, 3.5F, -5.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 3, 11, 0F); // Box 56
		bodyModel[24].setRotationPoint(13F, 3.5F, -5.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 3, 11, 0F); // Box 56
		bodyModel[25].setRotationPoint(-20F, 3.5F, -5.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 3, 11, 0F); // Box 56
		bodyModel[26].setRotationPoint(-9F, 3.5F, -5.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 39, 2, 3, 0F); // Box 83
		bodyModel[27].setRotationPoint(-22F, 1.5F, -5.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 91
		bodyModel[28].setRotationPoint(-22F, 7.5F, -5.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 4, 11, 0F); // Box 116
		bodyModel[29].setRotationPoint(-22F, 3.5F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 275
		bodyModel[30].setRotationPoint(-21.5F, -0.5F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 39, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[31].setRotationPoint(-21.5F, -1F, -4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[32].setRotationPoint(-19F, 0.5F, -5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 280
		bodyModel[33].setRotationPoint(-10.5F, -0.5F, -5.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[34].setRotationPoint(-8F, 0.5F, -5.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 283
		bodyModel[35].setRotationPoint(11.5F, -0.5F, -5.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[36].setRotationPoint(14F, 0.5F, -5.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 89
		bodyModel[37].setRotationPoint(16F, 3.5F, -5.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 93
		bodyModel[38].setRotationPoint(11F, 7.5F, -5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 280
		bodyModel[39].setRotationPoint(0.5F, -0.5F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[40].setRotationPoint(3F, 0.5F, -5.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 39, 2, 3, 0F); // Box 83
		bodyModel[41].setRotationPoint(-22F, 1.5F, 2.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 91
		bodyModel[42].setRotationPoint(-22F, 7.5F, 2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 39, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[43].setRotationPoint(-21.5F, -1F, 4.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 93
		bodyModel[44].setRotationPoint(11F, 7.5F, 2.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 275
		bodyModel[45].setRotationPoint(-21.5F, -0.5F, 4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[46].setRotationPoint(-19F, 0.5F, 4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 280
		bodyModel[47].setRotationPoint(-10.5F, -0.5F, 4.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[48].setRotationPoint(-8F, 0.5F, 4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 283
		bodyModel[49].setRotationPoint(11.5F, -0.5F, 4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[50].setRotationPoint(14F, 0.5F, 4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 280
		bodyModel[51].setRotationPoint(0.5F, -0.5F, 4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[52].setRotationPoint(3F, 0.5F, 4.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 86
		bodyModel[53].setRotationPoint(-17F, 3.5F, -5.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 87
		bodyModel[54].setRotationPoint(-6F, 3.5F, -5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 88
		bodyModel[55].setRotationPoint(-10F, 3.5F, -5.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 89
		bodyModel[56].setRotationPoint(5F, 3.5F, -5.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 90
		bodyModel[57].setRotationPoint(1F, 3.5F, -5.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 92
		bodyModel[58].setRotationPoint(-11F, 7.5F, -5.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 93
		bodyModel[59].setRotationPoint(0F, 7.5F, -5.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 1, 11, 0F); // Box 94
		bodyModel[60].setRotationPoint(-16F, 6.5F, -5.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 6, 1, 11, 0F); // Box 95
		bodyModel[61].setRotationPoint(-5F, 6.5F, -5.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // Box 90
		bodyModel[62].setRotationPoint(12F, 3.5F, -5.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 6, 1, 11, 0F); // Box 95
		bodyModel[63].setRotationPoint(6F, 6.5F, -5.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 92
		bodyModel[64].setRotationPoint(-11F, 7.5F, 2.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 93
		bodyModel[65].setRotationPoint(0F, 7.5F, 2.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 2
		bodyModel[66].setRotationPoint(-40F, 2F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[67].setRotationPoint(-44F, 3F, -1.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[68].setRotationPoint(-41F, 2.5F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 53
		bodyModel[69].setRotationPoint(-32F, -2F, 7.49F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[70].setRotationPoint(-31.5F, 5F, 5.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 53
		bodyModel[71].setRotationPoint(-32F, -2F, -11.49F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 53
		bodyModel[72].setRotationPoint(-31F, -2.5F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Box 53
		bodyModel[73].setRotationPoint(-30.5F, -6F, -4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 53
		bodyModel[74].setRotationPoint(-31F, 3F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[75].setRotationPoint(-31F, 3F, 2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[76].setRotationPoint(-39F, 2.5F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 116
		bodyModel[77].setRotationPoint(-24F, 2.5F, -5.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 116
		bodyModel[78].setRotationPoint(-32F, 2.5F, -4F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Box 116
		bodyModel[79].setRotationPoint(-38F, 2.5F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 116
		bodyModel[80].setRotationPoint(-24F, 2.5F, 2.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 3, 11, 0F); // Box 86
		bodyModel[81].setRotationPoint(-13.5F, 3.5F, -5.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 11, 0F); // Box 86
		bodyModel[82].setRotationPoint(-2.5F, 3.5F, -5.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 11, 0F); // Box 86
		bodyModel[83].setRotationPoint(8.5F, 3.5F, -5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F); // Box 116
		bodyModel[84].setRotationPoint(-24F, 5.5F, -5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F); // Box 116
		bodyModel[85].setRotationPoint(-24F, 5.5F, 2.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 12, 12, 1, 0F); // CAB walls
		bodyModel[86].setRotationPoint(35F, -17F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Cab roof cull
		bodyModel[87].setRotationPoint(30F, -22F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 53
		bodyModel[88].setRotationPoint(-31.5F, 7F, 5.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 53
		bodyModel[89].setRotationPoint(-27.5F, 4.5F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[90].setRotationPoint(-31F, -2.5F, 11F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 22
		bodyModel[91].setRotationPoint(35F, -21F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.01F, 2F, 0F, -0.01F, 2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0F, -0.01F, -2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[92].setRotationPoint(-30.5F, -5.75F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 2F, 0F, -0.01F, 2F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -2F, 0F, -0.01F, -2F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-30.5F, -5.75F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 53
		bodyModel[94].setRotationPoint(-32F, 2.5F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[95].setRotationPoint(-31F, -1.5F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[96].setRotationPoint(-31.5F, 5F, -11.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 53
		bodyModel[97].setRotationPoint(-31.5F, 7F, -11.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 53
		bodyModel[98].setRotationPoint(-25.5F, 4.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F); // Box 53
		bodyModel[99].setRotationPoint(-32F, 2.5F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[100].setRotationPoint(-31F, -1.5F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[101].setRotationPoint(-31F, -2.5F, -12F);

		bodyModel[102].addBox(-1F, 0F, -1F, 2, 9, 2, 0F); // Box 53
		bodyModel[102].setRotationPoint(-28.5F, -9F, 6.5F);
		bodyModel[102].rotateAngleX = 0.41887902F;

		bodyModel[103].addBox(-1F, 0F, -1F, 2, 9, 2, 0F); // Box 53
		bodyModel[103].setRotationPoint(-28.5F, -9F, -6.5F);
		bodyModel[103].rotateAngleX = -0.41887902F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -2F, 0F, -0.01F, -2F, 0F, -0.01F, -2F, 0F, -0.01F, -2F); // Back under cab sheet cull
		bodyModel[104].setRotationPoint(44.01F, -4F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 12, 1, 22, 0F); // Box 22
		bodyModel[105].setRotationPoint(35F, -5F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[106].setRotationPoint(-40F, 4F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 19, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[107].setRotationPoint(21F, -9F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 18, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // Box 3
		bodyModel[108].setRotationPoint(21F, -4F, -8.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 14, 5, 7, 0F); // Box 3
		bodyModel[109].setRotationPoint(-0.5F, -22F, -3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[110].setRotationPoint(0.5F, -20.5F, -5.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[111].setRotationPoint(-1.5F, -21.5F, -3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[112].setRotationPoint(-1.5F, -20.5F, -4.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[113].setRotationPoint(-0.5F, -20.5F, -5.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[114].setRotationPoint(-11.5F, -22F, -1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[115].setRotationPoint(-10.5F, -22F, -2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 3F, 1F, 0F, 1.5F); // Box 2
		bodyModel[116].setRotationPoint(-11.5F, -19.5F, -2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[117].setRotationPoint(-10.5F, -19.5F, -2.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[118].setRotationPoint(-7.5F, -22F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[119].setRotationPoint(-10.5F, -22F, 1.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 2
		bodyModel[120].setRotationPoint(-10.5F, -22F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-11.5F, -22F, -2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F); // Box 2
		bodyModel[122].setRotationPoint(-11.5F, -22F, 1.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		bodyModel[123].setRotationPoint(-7.5F, -22F, -2.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 2
		bodyModel[124].setRotationPoint(-7.5F, -22F, 1.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[125].setRotationPoint(0.5F, -20.5F, 3.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[126].setRotationPoint(13.5F, -21.5F, -3.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[127].setRotationPoint(13.5F, -20.5F, -4.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[128].setRotationPoint(12.5F, -20.5F, -5.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 3
		bodyModel[129].setRotationPoint(-1.5F, -20.5F, 3.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 3
		bodyModel[130].setRotationPoint(-0.5F, -20.5F, 3.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 3
		bodyModel[131].setRotationPoint(13.5F, -20.5F, 3.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		bodyModel[132].setRotationPoint(12.5F, -20.5F, 3.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 2
		bodyModel[133].setRotationPoint(-34F, -7F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 66, 1, 4, 0F); // Box 2
		bodyModel[134].setRotationPoint(-31F, -10F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 2
		bodyModel[135].setRotationPoint(-31F, -9F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 2
		bodyModel[136].setRotationPoint(-34F, -7F, 7F);

		bodyModel[137].addBox(0F, 0F, 0F, 61, 1, 4, 0F); // Box 2
		bodyModel[137].setRotationPoint(-26F, -10F, 7F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 2
		bodyModel[138].setRotationPoint(-26F, -9F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 116
		bodyModel[139].setRotationPoint(17F, 1.5F, -5.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 116
		bodyModel[140].setRotationPoint(17F, 1.5F, 2.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F); // Box 116
		bodyModel[141].setRotationPoint(17F, 7.5F, -5.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Box 116
		bodyModel[142].setRotationPoint(17F, 7.5F, 2.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 83
		bodyModel[143].setRotationPoint(41F, 3F, -1.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 4, 8, 0F); // Box 116
		bodyModel[144].setRotationPoint(18F, 3.5F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[145].setRotationPoint(-35F, -13F, -4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[146].setRotationPoint(-35F, -16F, -1.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[147].setRotationPoint(-35F, -16F, 1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[148].setRotationPoint(-35F, -16F, -4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[149].setRotationPoint(-35F, -10F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, 0F); // Box 2
		bodyModel[150].setRotationPoint(-35F, -10F, 1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[151].setRotationPoint(-35F, -10F, -4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 2
		bodyModel[152].setRotationPoint(-31F, -22F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 2
		bodyModel[153].setRotationPoint(-30F, -22F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 2
		bodyModel[154].setRotationPoint(-28F, -22F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -7F); // Box 3
		bodyModel[155].setRotationPoint(23F, 1F, -8.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 2
		bodyModel[156].setRotationPoint(-38F, 2F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 2
		bodyModel[157].setRotationPoint(-38F, 2F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Front steps cull
		bodyModel[158].setRotationPoint(-36F, -6F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Front steps cull
		bodyModel[159].setRotationPoint(-36F, -6F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Cab cull
		bodyModel[160].setRotationPoint(35F, -22F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[161].setRotationPoint(35F, -19F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 26
		bodyModel[162].setRotationPoint(35F, -21.5F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cab cull
		bodyModel[163].setRotationPoint(35F, -22F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[164].setRotationPoint(35F, -19F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[165].setRotationPoint(35F, -21.5F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[166].setRotationPoint(35F, -21F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[167].setRotationPoint(35F, -19F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[168].setRotationPoint(35F, -21F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[169].setRotationPoint(35F, -21F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[170].setRotationPoint(35F, -19F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[171].setRotationPoint(35F, -21F, 6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 1.125F, 0F, 0F); // Front steps cull
		bodyModel[172].setRotationPoint(-35.03F, -3.25F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 1.125F, 0F, 0F); // Front steps cull
		bodyModel[173].setRotationPoint(-35.03F, -3.25F, 7F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 109
		bodyModel[174].setRotationPoint(-34.5F, 0F, 5F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 109
		bodyModel[175].setRotationPoint(-36.25F, -3F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 109
		bodyModel[176].setRotationPoint(-34.5F, -3F, 5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 109
		bodyModel[177].setRotationPoint(-36.25F, 0F, 5F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 113
		bodyModel[178].setRotationPoint(-34F, -1F, 5.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 113
		bodyModel[179].setRotationPoint(-35.75F, -1F, 5.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 109
		bodyModel[180].setRotationPoint(-34.5F, 0F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 109
		bodyModel[181].setRotationPoint(-36.25F, -3F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 109
		bodyModel[182].setRotationPoint(-34.5F, -3F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 109
		bodyModel[183].setRotationPoint(-36.25F, 0F, -7F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 113
		bodyModel[184].setRotationPoint(-34F, -1F, -6.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 113
		bodyModel[185].setRotationPoint(-35.75F, -1F, -6.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 2
		bodyModel[186].setRotationPoint(-38F, 2F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front air compressor cover cull
		bodyModel[187].setRotationPoint(-37F, -3F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 109
		bodyModel[188].setRotationPoint(-37F, -4F, -5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 109
		bodyModel[189].setRotationPoint(-37F, -3F, -5F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 1, 11, 0F); // Box 109
		bodyModel[190].setRotationPoint(-36.25F, -5.15F, -5.5F);
		bodyModel[190].rotateAngleZ = 0.78539816F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front air compressor cover cull
		bodyModel[191].setRotationPoint(-37F, -3F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 109
		bodyModel[192].setRotationPoint(-37F, -4F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[193].setRotationPoint(-37F, -3F, 4F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 2
		bodyModel[194].setRotationPoint(-36F, -3F, 3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[195].setRotationPoint(-36F, -3F, 1F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 2
		bodyModel[196].setRotationPoint(-36F, -3F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[197].setRotationPoint(-36F, -3F, -3F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 2
		bodyModel[198].setRotationPoint(-37F, -1F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[199].setRotationPoint(39F, -20F, -2.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[200].setRotationPoint(39F, -20F, 2.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[201].setRotationPoint(39F, -20F, -8.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 9, 17, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[202].setRotationPoint(40F, -14F, -8.5F);

		bodyModel[203].addBox(0F, -1.5F, -1.5F, 15, 3, 3, 0F); // Box 109
		bodyModel[203].setRotationPoint(1.5F, -7F, -8.5F);
		bodyModel[203].rotateAngleX = 0.78539816F;

		bodyModel[204].addShapeBox(0F, -1F, -1F, 11, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 109
		bodyModel[204].setRotationPoint(-24.52F, -7F, 7.5F);
		bodyModel[204].rotateAngleX = 0.78539816F;

		bodyModel[205].addShapeBox(0F, -1F, -1F, 16, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 109
		bodyModel[205].setRotationPoint(0.5F, -7F, 8.5F);
		bodyModel[205].rotateAngleX = 0.78539816F;

		bodyModel[206].addBox(-0.5F, -4F, -0.5F, 1, 4, 1, 0F); // Box 2
		bodyModel[206].setRotationPoint(-9F, -19.5F, -3F);
		bodyModel[206].rotateAngleZ = -0.9250245F;

		bodyModel[207].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // N-1 steam thingy
		bodyModel[207].setRotationPoint(-23F, -9F, -10.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // N series running board
		bodyModel[208].setRotationPoint(-26F, -10F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // N series steam thingy?
		bodyModel[209].setRotationPoint(-23F, -8F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[210].setRotationPoint(-21.5F, -13F, -8.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
		bodyModel[211].setRotationPoint(-20.5F, -13F, -8.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // N-1 steam thingy
		bodyModel[212].setRotationPoint(-30.5F, -6F, -10.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // N-1 steam thingy
		bodyModel[213].setRotationPoint(-31.5F, -6F, -10.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // N-1 steam thingy
		bodyModel[214].setRotationPoint(-19F, -8F, -10F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // N series steam thingy?
		bodyModel[215].setRotationPoint(-19F, -7F, -10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // N series steam thingy?
		bodyModel[216].setRotationPoint(-30.5F, -5F, -10.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // N series steam thingy?
		bodyModel[217].setRotationPoint(-31.5F, -5F, -10.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[218].setRotationPoint(-9.5F, -14F, 7.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
		bodyModel[219].setRotationPoint(-14.5F, -16.3F, 4.8F);
		bodyModel[219].rotateAngleX = 0.78539816F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[220].setRotationPoint(-9.5F, -17F, 7.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[221].setRotationPoint(-6.5F, -2F, 3.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0.02F, 0F, 3F, 0.02F, 0F, -3F, 0F, 0F); // Box 2
		bodyModel[222].setRotationPoint(-9.5F, -5F, 3.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 2
		bodyModel[223].setRotationPoint(32.5F, 2F, 8.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[224].setRotationPoint(28.5F, -1F, 8.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F); // Box 2
		bodyModel[225].setRotationPoint(33.5F, -4F, 8.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 2
		bodyModel[226].setRotationPoint(30.5F, -14F, 8.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F); // Box 2
		bodyModel[227].setRotationPoint(30.5F, -8F, 8.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[228].setRotationPoint(40.5F, -3F, 7.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[229].setRotationPoint(40.5F, 3F, 7.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 10, 8, 8, 0F); // Drivers boiler suport cull
		bodyModel[230].setRotationPoint(-1.5F, -5.5F, -4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Drivers boiler suport cull
		bodyModel[231].setRotationPoint(-1.5F, -5.35F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Drivers boiler suport cull
		bodyModel[232].setRotationPoint(-1.5F, -5.35F, 4F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 2
		bodyModel[233].setRotationPoint(-33.5F, -21F, -2.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 2
		bodyModel[234].setRotationPoint(-33.5F, -22F, -2F);

		bodyModel[235].addBox(0F, -1F, 0F, 26, 1, 0, 0F); // Box 2
		bodyModel[235].setRotationPoint(-30F, -16F, -5.5F);
		bodyModel[235].rotateAngleX = 0.78539816F;

		bodyModel[236].addBox(0F, -1F, 0F, 23, 1, 0, 0F); // Box 2
		bodyModel[236].setRotationPoint(12F, -16.5F, -6F);
		bodyModel[236].rotateAngleX = 0.78539816F;

		bodyModel[237].addShapeBox(0F, -1F, 0F, 16, 1, 0, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[237].setRotationPoint(-4F, -16F, -5.5F);
		bodyModel[237].rotateAngleX = 0.78539816F;

		bodyModel[238].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 2
		bodyModel[238].setRotationPoint(-33F, -14F, -8.5F);

		bodyModel[239].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.175F, 0F, -3F, -0.175F, 0F, -3F, -0.175F, 0F, 3F, -0.175F, 0F); // Box 2
		bodyModel[239].setRotationPoint(-30F, -16F, -5.5F);
		bodyModel[239].rotateAngleX = -0.78539816F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[240].setRotationPoint(-33F, -15F, -8.5F);

		bodyModel[241].addBox(0F, -1F, 0F, 26, 1, 0, 0F); // Box 2
		bodyModel[241].setRotationPoint(-30F, -16F, 5.5F);
		bodyModel[241].rotateAngleX = -0.78539816F;

		bodyModel[242].addBox(0F, -1F, 0F, 23, 1, 0, 0F); // Box 2
		bodyModel[242].setRotationPoint(12F, -16.5F, 6F);
		bodyModel[242].rotateAngleX = -0.78539816F;

		bodyModel[243].addShapeBox(0F, -1F, 0F, 16, 1, 0, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[243].setRotationPoint(-4F, -16F, 5.5F);
		bodyModel[243].rotateAngleX = -0.78539816F;

		bodyModel[244].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 2
		bodyModel[244].setRotationPoint(-33F, -14F, 7.5F);

		bodyModel[245].addShapeBox(0F, 0F, -1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.175F, 0F, 3F, -0.175F, 0F, 3F, -0.175F, 0F, -3F, -0.175F, 0F); // Box 2
		bodyModel[245].setRotationPoint(-33F, -14F, 7.5F);
		bodyModel[245].rotateAngleX = -2.35619449F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[246].setRotationPoint(-33F, -15F, 7.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[247].setRotationPoint(-31.5F, 4F, -11.99F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[248].setRotationPoint(-31.5F, 4F, 10.99F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[249].setRotationPoint(-31.35F, 1F, -11.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[250].setRotationPoint(-31.35F, 1F, 6.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, -0.75F, -0.25F, 0.125F, -1F, -0.5F, -0.25F, 0F, -0.25F, -0.125F); // Box 26
		bodyModel[251].setRotationPoint(47F, -19F, 9.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0.05F, 0.525F, -0.3F, 0.335F, -0.675F, 0F, 0.25F, -0.625F, 0F, 0F, 0F, -0.5F, -1.05F, 0.525F, -0.3F, -1.335F, -0.675F, 0F, 0F, 0F); // Box 26
		bodyModel[252].setRotationPoint(47F, -18F, 10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.125F, -1F, -0.5F, -0.25F, -0.75F, -0.25F, 0.125F, 0F, 0F, 0F); // Box 26
		bodyModel[253].setRotationPoint(47F, -19F, -10.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.625F, -0.3F, 0.335F, -0.675F, -0.5F, 0.05F, 0.525F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.3F, -1.335F, -0.675F, -0.5F, -1.05F, 0.525F, 0F, 0F, 0F); // Box 26
		bodyModel[254].setRotationPoint(47F, -18F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 84
		bodyModel[255].setRotationPoint(-19F, 7F, 5.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[256].setRotationPoint(-17F, 3.5F, 7.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 84
		bodyModel[257].setRotationPoint(-16F, 4.5F, 8F);
		bodyModel[257].rotateAngleZ = -0.12217305F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[258].setRotationPoint(2.75F, 4.25F, 9F);
		bodyModel[258].rotateAngleZ = -1.23918377F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[259].setRotationPoint(-11F, 2.5F, 9F);
		bodyModel[259].rotateAngleZ = -0.13089969F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84
		bodyModel[260].setRotationPoint(-2.5F, -5F, 8.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[261].setRotationPoint(-10.5F, -5F, 9F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[262].setRotationPoint(-22.5F, 5.5F, 9F);
		bodyModel[262].rotateAngleZ = 0.15707963F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[263].setRotationPoint(-22.5F, -2.5F, 10F);

		bodyModel[264].addShapeBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // STUPID BAKER VALVE GEAR PART CULL
		bodyModel[264].setRotationPoint(-10F, -2.5F, 8.75F);
		bodyModel[264].rotateAngleZ = -0.06981317F;

		bodyModel[265].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 4, 3, 0F,0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[265].setRotationPoint(-10F, -0.5F, 8.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[266].setRotationPoint(-12.5F, -3F, 9F);

		bodyModel[267].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[267].setRotationPoint(-12.5F, -3F, 9F);

		bodyModel[268].addBox(0F, 0F, 0F, 17, 1, 2, 0F); // Box 53
		bodyModel[268].setRotationPoint(-28.5F, 2.49F, 7.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 53
		bodyModel[269].setRotationPoint(-28.5F, -0.5F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[270].setRotationPoint(-22.5F, -1.5F, 9F);
		bodyModel[270].rotateAngleZ = -0.03490659F;

		bodyModel[271].addShapeBox(2.25F, -0.5F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[271].setRotationPoint(2.75F, 4.25F, 9F);
		bodyModel[271].rotateAngleZ = -1.23918377F;

		bodyModel[272].addShapeBox(-0.5F, -1.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[272].setRotationPoint(-10.5F, 3F, 9F);
		bodyModel[272].rotateAngleZ = -0.13962634F;

		bodyModel[273].addShapeBox(0.5F, -3.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[273].setRotationPoint(-10.5F, 3F, 9F);
		bodyModel[273].rotateAngleZ = -0.13962634F;

		bodyModel[274].addShapeBox(-0.5F, -5.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[274].setRotationPoint(-10.5F, 3F, 9F);
		bodyModel[274].rotateAngleZ = -0.13962634F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[275].setRotationPoint(-13.5F, -4F, 8.25F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 53
		bodyModel[276].setRotationPoint(-15.52F, 0.49F, 7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[277].setRotationPoint(-15.52F, 0F, 8.25F);

		bodyModel[278].addBox(-0.5F, -4.5F, -0.5F, 1, 1, 1, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[278].setRotationPoint(-10F, -0.5F, 9.25F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 335
		bodyModel[279].setRotationPoint(-2.5F, 0.5F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0.125F, 0.25F, -0.05F, 0.125F, 0.25F, -0.05F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, -0.05F, 0.125F, 0.25F, -0.05F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F); // Box 84
		bodyModel[280].setRotationPoint(-16.25F, 5F, -6.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 84
		bodyModel[281].setRotationPoint(-14F, 3.5F, -9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 84
		bodyModel[282].setRotationPoint(-13F, 4.5F, -9F);
		bodyModel[282].rotateAngleZ = -0.02617994F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[283].setRotationPoint(3.25F, 6F, -9.5F);
		bodyModel[283].rotateAngleZ = 0.26179939F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[284].setRotationPoint(-9F, 2.5F, -10.5F);
		bodyModel[284].rotateAngleZ = -0.2443461F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[285].setRotationPoint(-19.5F, 4.5F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[286].setRotationPoint(-23F, -2.5F, -11F);
		bodyModel[286].rotateAngleZ = 0.45378561F;

		bodyModel[287].addBox(0F, 0F, 0F, 17, 1, 2, 0F); // Box 53
		bodyModel[287].setRotationPoint(-28.5F, 2.49F, -9.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[288].setRotationPoint(-22.5F, -1.5F, -10F);
		bodyModel[288].rotateAngleZ = -0.03490659F;

		bodyModel[289].addShapeBox(2.25F, -0.5F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[289].setRotationPoint(3.25F, 6F, -9.5F);
		bodyModel[289].rotateAngleZ = 0.26179939F;

		bodyModel[290].addShapeBox(-0.5F, -1.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[290].setRotationPoint(-8.5F, 3F, -9.5F);
		bodyModel[290].rotateAngleZ = 0.29670597F;

		bodyModel[291].addShapeBox(0.5F, -3.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[291].setRotationPoint(-8.5F, 3F, -9.5F);
		bodyModel[291].rotateAngleZ = 0.29670597F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[292].setRotationPoint(-13.5F, -4F, -10.25F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[293].setRotationPoint(-15.52F, 0.49F, -10.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[294].setRotationPoint(-15.52F, 0F, -10.25F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84
		bodyModel[295].setRotationPoint(-2.5F, -5F, -10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[296].setRotationPoint(-10.5F, -5F, -9.5F);

		bodyModel[297].addShapeBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // STUPID BAKER VALVE GEAR PART CULL
		bodyModel[297].setRotationPoint(-10F, -2.5F, -9.75F);
		bodyModel[297].rotateAngleZ = 0.2268928F;

		bodyModel[298].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 4, 3, 0F,0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.475F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[298].setRotationPoint(-10F, -0.5F, -10.25F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[299].setRotationPoint(-12.5F, -3F, -9.5F);

		bodyModel[300].addShapeBox(0F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[300].setRotationPoint(-12.5F, -3F, -9.5F);

		bodyModel[301].addShapeBox(-0.5F, -5.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[301].setRotationPoint(-8.5F, 3F, -9.5F);
		bodyModel[301].rotateAngleZ = 0.29670597F;

		bodyModel[302].addBox(-0.5F, -4.5F, -0.5F, 1, 1, 1, 0F); // PM BAKER VALVE GEAR BS CULL
		bodyModel[302].setRotationPoint(-10F, -0.5F, -9.25F);

		bodyModel[303].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 53
		bodyModel[303].setRotationPoint(-28.5F, -0.5F, -10F);

		bodyModel[304].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 109
		bodyModel[304].setRotationPoint(8.5F, -2.5F, 8.5F);
		bodyModel[304].rotateAngleX = 0.78539816F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 2
		bodyModel[305].setRotationPoint(-9.5F, -9F, 7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[306].setRotationPoint(-2.5F, -3F, 9F);

		bodyModel[307].addBox(0F, -1F, -1F, 3, 1, 1, 0F); // Box 109
		bodyModel[307].setRotationPoint(5.5F, -2F, 9F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // MORE STUPID CULL
		bodyModel[308].setRotationPoint(-25F, -1.5F, 8.75F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[309].setRotationPoint(19.5F, -1.5F, 4.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[310].setRotationPoint(20.5F, -1F, 8.5F);

		bodyModel[311].addBox(0F, -1F, -1F, 2, 2, 2, 0F); // Box 109
		bodyModel[311].setRotationPoint(12.5F, -2F, 8.5F);
		bodyModel[311].rotateAngleX = 0.78539816F;

		bodyModel[312].addBox(0F, -1F, -1F, 2, 1, 1, 0F); // Box 109
		bodyModel[312].setRotationPoint(14.5F, -2F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, -1F, 0F, 0F, -0.5F); // Box 84
		bodyModel[313].setRotationPoint(15.5F, -3F, 9F);
		bodyModel[313].rotateAngleZ = 0.25307274F;

		bodyModel[314].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // MORE STUPID CULL
		bodyModel[314].setRotationPoint(-25F, -3.5F, 8.75F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Mechanical lubricator
		bodyModel[315].setRotationPoint(-23.5F, -5.5F, 8.75F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // MORE STUPID CULL
		bodyModel[316].setRotationPoint(-25F, -1.5F, -10.75F);

		bodyModel[317].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // MORE STUPID CULL
		bodyModel[317].setRotationPoint(-25F, -3.5F, -10.75F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Mechanical lubricator
		bodyModel[318].setRotationPoint(-23.5F, -5.5F, -10.75F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[319].setRotationPoint(-13.51F, -9F, 2.25F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 376
		bodyModel[320].setRotationPoint(-13.51F, 0F, 4.25F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 9, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 376
		bodyModel[321].setRotationPoint(-13.51F, -9F, -10.25F);

		bodyModel[322].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 376
		bodyModel[322].setRotationPoint(-13.51F, 0F, -10.25F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[323].setRotationPoint(-16.5F, 4.5F, -6.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[324].setRotationPoint(-5.5F, 4.5F, -6.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[325].setRotationPoint(5.5F, 4.5F, -7.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[326].setRotationPoint(16.5F, 4.5F, -6.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[327].setRotationPoint(-19.5F, 6.5F, 5.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[328].setRotationPoint(-8.5F, 6.5F, 5.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 84
		bodyModel[329].setRotationPoint(2.5F, 6.5F, 5.5F);

		bodyModel[330].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 84
		bodyModel[330].setRotationPoint(13.5F, 6.5F, 5.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 388
		bodyModel[331].setRotationPoint(30F, -21F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.275F, -0.375F, 0F, -0.275F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cab cull
		bodyModel[332].setRotationPoint(30F, -22F, -5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, -0.375F, 0F, -0.275F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cab cull
		bodyModel[333].setRotationPoint(30F, -22F, 3F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 388
		bodyModel[334].setRotationPoint(26F, -21F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[335].setRotationPoint(30.5F, -19F, 8.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[336].setRotationPoint(23F, 3.5F, 4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 83
		bodyModel[337].setRotationPoint(20F, 3.5F, 3F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 83
		bodyModel[338].setRotationPoint(37F, 3F, 4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[339].setRotationPoint(23F, 3.5F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 83
		bodyModel[340].setRotationPoint(20F, 3.5F, -4F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F); // Box 83
		bodyModel[341].setRotationPoint(37F, 3F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0F, 0F, 0F); // Valve protector cull
		bodyModel[342].setRotationPoint(19F, -21.5F, -2F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Safty valves
		bodyModel[343].setRotationPoint(19.15F, -21.75F, 0.25F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Safty valves
		bodyModel[344].setRotationPoint(19.15F, -21.75F, -1.25F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Safty valves
		bodyModel[345].setRotationPoint(20.5F, -21.75F, -0.5F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 400
		bodyModel[346].setRotationPoint(15.6F, -20F, -3F);
		bodyModel[346].rotateAngleY = 0.15707963F;
		bodyModel[346].rotateAngleZ = 0.50614548F;

		bodyModel[347].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 400
		bodyModel[347].setRotationPoint(18.5F, -20.5F, -2.5F);
		bodyModel[347].rotateAngleX = 0.78539816F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[348].setRotationPoint(7F, -14F, 8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[349].setRotationPoint(7F, -18F, 8F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[350].setRotationPoint(4.5F, -14F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[351].setRotationPoint(4.5F, -18F, 8F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[352].setRotationPoint(9.5F, -18F, 8.25F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[353].setRotationPoint(2F, -18F, 7.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // PM N class sand pipes
		bodyModel[354].setRotationPoint(-5F, -10F, 7.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N class sand pipes
		bodyModel[355].setRotationPoint(2F, -14F, 7.75F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F); // PM N class sand pipes
		bodyModel[356].setRotationPoint(9.5F, -10F, 8.25F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // PM N class sand pipes
		bodyModel[357].setRotationPoint(9.5F, -14F, 8.25F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[358].setRotationPoint(7F, -14F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[359].setRotationPoint(7F, -18F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[360].setRotationPoint(4.5F, -14F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[361].setRotationPoint(4.5F, -18F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[362].setRotationPoint(9.5F, -18F, -9.25F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N class sand pipes
		bodyModel[363].setRotationPoint(2F, -18F, -8.75F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // PM N class sand pipes
		bodyModel[364].setRotationPoint(-5F, -10F, -8.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N class sand pipes
		bodyModel[365].setRotationPoint(2F, -14F, -8.75F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F); // PM N class sand pipes
		bodyModel[366].setRotationPoint(9.5F, -10F, -9.25F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // PM N class sand pipes
		bodyModel[367].setRotationPoint(9.5F, -14F, -9.25F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[368].setRotationPoint(6F, -14F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[369].setRotationPoint(6F, -18F, -9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[370].setRotationPoint(4F, -18F, -9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[371].setRotationPoint(4F, -14F, -9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[372].setRotationPoint(8F, -14F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[373].setRotationPoint(8F, -18F, -9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[374].setRotationPoint(10F, -14F, -9.25F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[375].setRotationPoint(10F, -18F, -9.25F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[376].setRotationPoint(2F, -18F, -8.75F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // PM N-1 class sand pipes
		bodyModel[377].setRotationPoint(-2F, -10F, -8.75F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[378].setRotationPoint(2F, -14F, -8.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0.5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[379].setRotationPoint(1F, -9F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[380].setRotationPoint(6F, -14F, 8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[381].setRotationPoint(6F, -18F, 8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[382].setRotationPoint(4F, -18F, 8F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[383].setRotationPoint(4F, -14F, 8F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[384].setRotationPoint(8F, -14F, 8F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[385].setRotationPoint(8F, -18F, 8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[386].setRotationPoint(10F, -14F, 8.25F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[387].setRotationPoint(10F, -18F, 8.25F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PM N-1 class sand pipes
		bodyModel[388].setRotationPoint(2F, -18F, 7.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // PM N-1 class sand pipes
		bodyModel[389].setRotationPoint(-2F, -10F, 7.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[390].setRotationPoint(2F, -14F, 7.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0.5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F); // PM N-1 class sand pipes
		bodyModel[391].setRotationPoint(1F, -9F, 8F);

		bodyModel[392].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F, 0.375F, 0F, 0.375F); // Box 445
		bodyModel[392].setRotationPoint(24F, -21.5F, 0F);
		bodyModel[392].rotateAngleY = -0.78539816F;

		bodyModel[393].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 445
		bodyModel[393].setRotationPoint(24F, -21F, 0F);
		bodyModel[393].rotateAngleY = -0.78539816F;

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Generator suport cull
		bodyModel[394].setRotationPoint(25.75F, -19F, -4.5F);

		bodyModel[395].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Generator
		bodyModel[395].setRotationPoint(25.5F, -20F, -3.75F);
		bodyModel[395].rotateAngleX = 0.52359878F;

		bodyModel[396].addBox(0F, 0F, 0F, 0, 9, 9, 0F); // Box 2
		bodyModel[396].setRotationPoint(-35.01F, -16F, -4.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 0, 15, 15, 0F); // Box 2
		bodyModel[397].setRotationPoint(-34.01F, -19F, -7.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[398].setRotationPoint(-31.5F, -4F, -5.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[399].setRotationPoint(20F, -4F, -9.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[400].setRotationPoint(19.5F, -4F, -8.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[401].setRotationPoint(23F, 5.5F, -8.5F);

		bodyModel[402].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 452
		bodyModel[402].setRotationPoint(19F, 6F, -8F);
		bodyModel[402].rotateAngleX = 0.78539816F;

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F); // Box 452
		bodyModel[403].setRotationPoint(19.5F, -3F, -5.5F);

		bodyModel[404].addShapeBox(0F, 0F, -1F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Steam thiny support cul
		bodyModel[404].setRotationPoint(19.01F, 6.45F, -8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 456
		bodyModel[405].setRotationPoint(20F, 7F, 6F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 456
		bodyModel[406].setRotationPoint(43F, 7.5F, 8.5F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 458
		bodyModel[407].setRotationPoint(20F, -2F, 6.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 458
		bodyModel[408].setRotationPoint(20F, -7F, 9F);
		bodyModel[408].rotateAngleX = -0.45378561F;

		bodyModel[409].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 458
		bodyModel[409].setRotationPoint(25F, -9F, 9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[410].setRotationPoint(40.5F, 4F, 9F);
		bodyModel[410].rotateAngleZ = 0.56723201F;

		bodyModel[411].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 83
		bodyModel[411].setRotationPoint(39F, -1F, -1.5F);
		bodyModel[411].rotateAngleZ = 0.12217305F;

		bodyModel[412].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 2
		bodyModel[412].setRotationPoint(41F, 2.99F, -8F);

		bodyModel[413].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 83
		bodyModel[413].setRotationPoint(40.5F, 1.74F, -8.5F);
		bodyModel[413].rotateAngleZ = 0.78539816F;

		bodyModel[414].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 83
		bodyModel[414].setRotationPoint(43F, 1.74F, -8.5F);
		bodyModel[414].rotateAngleZ = 0.78539816F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.75F, 0.25F, -0.01F, 0.75F, 0.25F, -0.01F, 0.75F, 0.25F, -0.01F, 0.75F, 0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 83
		bodyModel[415].setRotationPoint(40.75F, 1.99F, -8.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[416].setRotationPoint(40.5F, 5F, 7.5F);

		bodyModel[417].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Undercab supports cull
		bodyModel[417].setRotationPoint(43F, 3F, -4.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Undercab supports cull
		bodyModel[418].setRotationPoint(43F, 3F, -7.5F);

		bodyModel[419].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // CAB walls
		bodyModel[419].setRotationPoint(46F, -20F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[420].setRotationPoint(46F, -21F, -6F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[421].setRotationPoint(46F, -19F, -10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[422].setRotationPoint(46F, -21F, -9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[423].setRotationPoint(46F, -21F, 3F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[424].setRotationPoint(46F, -19F, 9F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[425].setRotationPoint(46F, -21F, 6F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // CAB walls
		bodyModel[426].setRotationPoint(46F, -20F, 5F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // CAB walls
		bodyModel[427].setRotationPoint(46F, -21F, -5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[428].setRotationPoint(40F, 5F, -8.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
		bodyModel[429].setRotationPoint(40F, 3.5F, -6F);

		bodyModel[430].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 83
		bodyModel[430].setRotationPoint(39F, -4F, -1.5F);
		bodyModel[430].rotateAngleZ = 0.01745329F;

		bodyModel[431].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 484
		bodyModel[431].setRotationPoint(38.25F, 0F, -8F);

		bodyModel[432].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 484
		bodyModel[432].setRotationPoint(41.25F, 4F, -8F);
		bodyModel[432].rotateAngleX = 0.78539816F;

		bodyModel[433].addBox(-1F, -1F, 0F, 2, 2, 4, 0F); // Box 83
		bodyModel[433].setRotationPoint(44F, -2F, 2.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Undercab supports cull
		bodyModel[434].setRotationPoint(43F, 3F, 3.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 452
		bodyModel[435].setRotationPoint(37F, 6.5F, -8.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 2F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 2F, 0.01F, 0F, -2F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0.01F); // Bell holder cull
		bodyModel[436].setRotationPoint(-36F, -19F, -1F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[437].setRotationPoint(-36F, -20F, -0.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[438].setRotationPoint(-36F, -21F, -0.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[439].setRotationPoint(-35.75F, -19.5F, -0.25F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Bell holder cull
		bodyModel[440].setRotationPoint(-36F, -21.01F, -1F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Light support cull
		bodyModel[441].setRotationPoint(-37.5F, -10F, -1F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.125F, 0.125F); // Box 2 headlight
		bodyModel[442].setRotationPoint(-37.5F, -12.25F, -1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight glow
		bodyModel[443].setRotationPoint(-37.51F, -12.25F, -1F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 2 headlight
		bodyModel[444].setRotationPoint(-36.5F, -11.75F, -0.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 headlight
		bodyModel[445].setRotationPoint(-36.5F, -11F, -1F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.375F); // Box 2 Numberboard
		bodyModel[446].setRotationPoint(-37.5F, -11.75F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Numberboard nonlit
		bodyModel[447].setRotationPoint(-37.51F, -10F, -1.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.05F, -0.05F, -2F, -0.05F, -0.05F, -2F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -1.05F, -0.05F, -2F, -1.05F, -0.05F, -2F, -1.05F, -0.8F, 0F, -1.05F, -0.8F); // Box 2 Numberboard glow
		bodyModel[448].setRotationPoint(-37.45F, -11.75F, -1.25F);
		bodyModel[448].rotateAngleY = -0.41887902F;

		bodyModel[449].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -0.05F, -0.8F, -2F, -0.05F, -0.8F, -2F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -1.05F, -0.8F, -2F, -1.05F, -0.8F, -2F, -1.05F, -0.05F, 0F, -1.05F, -0.05F); // Box 2 Numberboard glow
		bodyModel[449].setRotationPoint(-37.45F, -11.75F, 1.25F);
		bodyModel[449].rotateAngleY = 0.41887902F;

		bodyModel[450].addShapeBox(0F, 0F, 0F, 0, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F); // Box 505
		bodyModel[450].setRotationPoint(-40.01F, 6F, 0F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 0, 3, 12, 0F,3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 505
		bodyModel[451].setRotationPoint(-40.01F, 6F, 0F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 0, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, -6F, 3F, 0F, -6F); // Box 505
		bodyModel[452].setRotationPoint(-40.01F, 6F, -6F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 0, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, 3F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, 3F, 0F, -6F); // Box 505
		bodyModel[453].setRotationPoint(-40.01F, 6F, -6F);

		bodyModel[454].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 2
		bodyModel[454].setRotationPoint(-40.01F, 4F, -7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[455].setRotationPoint(-40F, 5F, -7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[456].setRotationPoint(-40F, 5F, 6F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow step cull
		bodyModel[457].setRotationPoint(-42.02F, 6F, 6F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow step cull
		bodyModel[458].setRotationPoint(-42.02F, 6F, -8F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Damn plow parts
		bodyModel[459].setRotationPoint(-42.02F, 8F, 2F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Damn plow parts
		bodyModel[460].setRotationPoint(-43.02F, 8F, 0F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Damn plow parts
		bodyModel[461].setRotationPoint(-42.02F, 8F, 0F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Damn plow parts
		bodyModel[462].setRotationPoint(-43.02F, 8F, -2F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Damn plow parts
		bodyModel[463].setRotationPoint(-42.02F, 8F, -2F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Damn plow parts
		bodyModel[464].setRotationPoint(-42.02F, 8F, -6F);

		bodyModel[465].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Cab roof hatch middle
		bodyModel[465].setRotationPoint(36F, -22.5F, -2F);

		bodyModel[466].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Cab roof hatch engineer side
		bodyModel[466].setRotationPoint(37F, -22.35F, 3.5F);
		bodyModel[466].rotateAngleX = -0.2268928F;

		bodyModel[467].addBox(0F, 0F, -4F, 4, 1, 4, 0F); // Cab roof hatch fireman sie
		bodyModel[467].setRotationPoint(37F, -22.35F, -3.5F);
		bodyModel[467].rotateAngleX = 0.2268928F;

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F, 1.5F, 0F, 0F, 3F); // Box 2
		bodyModel[468].setRotationPoint(-7.5F, -19.5F, -2.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[469].setRotationPoint(29F, 5F, -0.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 521
		bodyModel[470].setRotationPoint(42.62F, -10.5F, 7.75F);

		bodyModel[471].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 277
		bodyModel[471].setRotationPoint(41.5F, -9F, 6.6F);
		bodyModel[471].rotateAngleY = -1.30899694F;

		bodyModel[472].addBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F); // Box 277
		bodyModel[472].setRotationPoint(42F, -9.5F, 6.85F);
		bodyModel[472].rotateAngleY = -1.30899694F;

		bodyModel[473].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 2
		bodyModel[473].setRotationPoint(37F, -17F, 6.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 2
		bodyModel[474].setRotationPoint(39.75F, -14.5F, 6F);

		bodyModel[475].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 277
		bodyModel[475].setRotationPoint(41F, -11F, 8F);
		bodyModel[475].rotateAngleY = -1.30899694F;

		bodyModel[476].addBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F); // Box 277
		bodyModel[476].setRotationPoint(41.25F, -12.5F, 8.75F);
		bodyModel[476].rotateAngleY = -1.30899694F;

		bodyModel[477].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 529
		bodyModel[477].setRotationPoint(42F, -19.93F, -7F);
		bodyModel[477].rotateAngleZ = -0.26179939F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // COCK SUPPORT cull
		bodyModel[478].setRotationPoint(39.5F, -18F, -4.5F);

		bodyModel[479].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 531
		bodyModel[479].setRotationPoint(39.9F, -15F, -1F);
		bodyModel[479].rotateAngleZ = 0.12217305F;

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[480].setRotationPoint(39.9F, -10F, -2F);
		bodyModel[480].rotateAngleZ = 0.12217305F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 531
		bodyModel[481].setRotationPoint(39.9F, -10F, 0F);
		bodyModel[481].rotateAngleZ = 0.12217305F;

		bodyModel[482].addBox(0F, 0F, 0F, 7, 5, 0, 0F); // Box 276
		bodyModel[482].setRotationPoint(37F, -19F, 8F);

		bodyModel[483].addBox(0F, 0F, 0F, 10, 3, 0, 0F); // Box 276
		bodyModel[483].setRotationPoint(36F, -19.5F, -7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 531
		bodyModel[484].setRotationPoint(37F, -21F, 2F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cab cover cull
		bodyModel[485].setRotationPoint(40F, -12F, -2F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 2
		bodyModel[486].setRotationPoint(40.25F, -14.5F, -6F);
		bodyModel[486].rotateAngleY = -0.34906585F;

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 2
		bodyModel[487].setRotationPoint(39.5F, -14.5F, -8F);
		bodyModel[487].rotateAngleY = -0.34906585F;

		bodyModel[488].addBox(0F, 0F, 0F, 0, 14, 4, 0F); // Pipeing
		bodyModel[488].setRotationPoint(39.47F, -19F, -8.5F);
		bodyModel[488].rotateAngleY = -0.2268928F;
		bodyModel[488].rotateAngleZ = 0.1134464F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -3F, 0F, -2.5F, -3F); // Flux capacitor
		bodyModel[489].setRotationPoint(39.25F, -17.5F, 1.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[490].setRotationPoint(-36.01F, -20F, -4F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -2F, 0F, -0.65F); // Box 2
		bodyModel[491].setRotationPoint(-36.01F, -20F, 2F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 2 Numberboard
		bodyModel[492].setRotationPoint(-35.95F, -21.01F, 2F);
		bodyModel[492].rotateAngleY = 0.78539816F;

		bodyModel[493].addShapeBox(0F, 0F, -1.1F, 4, 2, 1, 0F,0F, -0.05F, -0.05F, -2F, -0.05F, -0.05F, -2F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -1.05F, -0.05F, -2F, -1.05F, -0.05F, -2F, -1.05F, -0.8F, 0F, -1.05F, -0.8F); // Box 2 Numberboard glow
		bodyModel[493].setRotationPoint(-35.95F, -21.01F, -2F);
		bodyModel[493].rotateAngleY = -0.78539816F;

		bodyModel[494].addShapeBox(0F, 0F, 0.1F, 4, 2, 1, 0F,0F, -0.05F, -0.8F, -2F, -0.05F, -0.8F, -2F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -1.05F, -0.8F, -2F, -1.05F, -0.8F, -2F, -1.05F, -0.05F, 0F, -1.05F, -0.05F); // Box 2 Numberboard glow
		bodyModel[494].setRotationPoint(-35.95F, -21.01F, 2F);
		bodyModel[494].rotateAngleY = 0.78539816F;

		bodyModel[495].addShapeBox(0F, 0F, -1F, 2, 1, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 2 Numberboard
		bodyModel[495].setRotationPoint(-35.95F, -21.01F, -2F);
		bodyModel[495].rotateAngleY = -0.78539816F;

		bodyModel[496].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[496].setRotationPoint(-1.5F, 0F, 5.51F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[497].setRotationPoint(-12.5F, 0F, 5.51F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[498].setRotationPoint(-23.5F, 0F, 5.51F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[499].setRotationPoint(-1.5F, 0F, -5.51F);
	}

	private void initbodyModel_2() {
		bodyModel[500] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 27
		bodyModel[501] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 27
		bodyModel[502] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 27

		bodyModel[500].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[500].setRotationPoint(-12.5F, 0F, -5.51F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[501].setRotationPoint(-23.5F, 0F, -5.51F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 27
		bodyModel[502].setRotationPoint(9.5F, 0F, -5.51F);
	}

	ModelPMPilotTruck bogiefronttruck = new ModelPMPilotTruck();
	ModelPMTrailingTruck bogiereartruck = new ModelPMTrailingTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/pm_n_locomotive_Grey.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.85F, 0.0F, 0F);
		bogiefronttruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/pm_n_locomotive_Grey.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(1.85F, 0.0F, 0F);
		bogiereartruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}