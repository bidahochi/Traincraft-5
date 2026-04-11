//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelP_S_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelDRGWCoach1005Series extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDRGWCoach1005Series() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[450];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 284, 137, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 72, 43, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 134, 49, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 134, 24, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 74, 58, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 70, 35, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 59
		bodyModel[10] = new ModelRendererTurbo(this, 73, 12, textureX, textureY); // Box 62
		bodyModel[11] = new ModelRendererTurbo(this, 315, 50, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 308, 70, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 323, 61, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 330, 60, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 307, 80, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 312, 38, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 309, 40, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 325, 40, textureX, textureY); // Box 153
		bodyModel[20] = new ModelRendererTurbo(this, 323, 92, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 300, 65, textureX, textureY); // Box 60
		bodyModel[22] = new ModelRendererTurbo(this, 285, 84, textureX, textureY); // Box 13
		bodyModel[23] = new ModelRendererTurbo(this, 285, 61, textureX, textureY); // Box 100
		bodyModel[24] = new ModelRendererTurbo(this, 374, 19, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 349, 30, textureX, textureY); // Box 11
		bodyModel[26] = new ModelRendererTurbo(this, 349, 24, textureX, textureY); // Box 82
		bodyModel[27] = new ModelRendererTurbo(this, 303, 101, textureX, textureY); // Box 100
		bodyModel[28] = new ModelRendererTurbo(this, 373, 10, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 362, 26, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 362, 21, textureX, textureY); // Box 81
		bodyModel[31] = new ModelRendererTurbo(this, 362, 31, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 362, 16, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 300, 88, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 10, 70, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 2, 91, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 2, 60, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 9, 80, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 4, 38, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 17, 40, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 1, 40, textureX, textureY); // Box 153
		bodyModel[42] = new ModelRendererTurbo(this, 9, 92, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 60
		bodyModel[44] = new ModelRendererTurbo(this, 39, 84, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 13
		bodyModel[46] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 17, 60, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 3, 10, textureX, textureY); // Box 34
		bodyModel[49] = new ModelRendererTurbo(this, 4, 19, textureX, textureY); // Box 11
		bodyModel[50] = new ModelRendererTurbo(this, 22, 26, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Box 11
		bodyModel[52] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 11
		bodyModel[53] = new ModelRendererTurbo(this, 22, 21, textureX, textureY); // Box 81
		bodyModel[54] = new ModelRendererTurbo(this, 33, 24, textureX, textureY); // Box 82
		bodyModel[55] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 12
		bodyModel[56] = new ModelRendererTurbo(this, 39, 61, textureX, textureY); // Box 100
		bodyModel[57] = new ModelRendererTurbo(this, 27, 45, textureX, textureY); // Box 50
		bodyModel[58] = new ModelRendererTurbo(this, 22, 31, textureX, textureY); // Box 34
		bodyModel[59] = new ModelRendererTurbo(this, 53, 2, textureX, textureY); // Box 12
		bodyModel[60] = new ModelRendererTurbo(this, 22, 16, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 21, 123, textureX, textureY); // Box 13
		bodyModel[62] = new ModelRendererTurbo(this, 21, 101, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 32, 60, textureX, textureY); // Box 60
		bodyModel[64] = new ModelRendererTurbo(this, 32, 83, textureX, textureY); // Box 129
		bodyModel[65] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 130
		bodyModel[66] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 35, 1, textureX, textureY); // Box 101
		bodyModel[68] = new ModelRendererTurbo(this, 26, 12, textureX, textureY); // Box 60
		bodyModel[69] = new ModelRendererTurbo(this, 32, 88, textureX, textureY); // Box 13
		bodyModel[70] = new ModelRendererTurbo(this, 303, 123, textureX, textureY); // Box 13
		bodyModel[71] = new ModelRendererTurbo(this, 17, 110, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 18, 110, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 266, 116, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 299, 110, textureX, textureY); // Box 2
		bodyModel[75] = new ModelRendererTurbo(this, 274, 110, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 274, 41, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 273, 8, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 288, 26, textureX, textureY); // Rear vestibule door
		bodyModel[79] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 55, 41, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 55, 8, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 46, 26, textureX, textureY); // Front vestibule door
		bodyModel[83] = new ModelRendererTurbo(this, 61, 33, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 60, 87, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 60, 65, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 54, 88, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 60
		bodyModel[89] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 130
		bodyModel[90] = new ModelRendererTurbo(this, 33, 15, textureX, textureY); // Box 83
		bodyModel[91] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 11
		bodyModel[92] = new ModelRendererTurbo(this, 37, 56, textureX, textureY); // Box 12
		bodyModel[93] = new ModelRendererTurbo(this, 35, 52, textureX, textureY); // Box 13
		bodyModel[94] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 35, 1, textureX, textureY); // Box 137
		bodyModel[97] = new ModelRendererTurbo(this, 27, 5, textureX, textureY); // Box 138
		bodyModel[98] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 11
		bodyModel[99] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 141
		bodyModel[100] = new ModelRendererTurbo(this, 72, 1, textureX, textureY); // Box 141
		bodyModel[101] = new ModelRendererTurbo(this, 365, 52, textureX, textureY); // Box 50
		bodyModel[102] = new ModelRendererTurbo(this, 340, 54, textureX, textureY); // Box 12
		bodyModel[103] = new ModelRendererTurbo(this, 357, 45, textureX, textureY); // Box 50
		bodyModel[104] = new ModelRendererTurbo(this, 333, 2, textureX, textureY); // Box 12
		bodyModel[105] = new ModelRendererTurbo(this, 355, 1, textureX, textureY); // Box 137
		bodyModel[106] = new ModelRendererTurbo(this, 357, 5, textureX, textureY); // Box 138
		bodyModel[107] = new ModelRendererTurbo(this, 355, 52, textureX, textureY); // Box 13
		bodyModel[108] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 101
		bodyModel[109] = new ModelRendererTurbo(this, 268, 87, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 268, 65, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 280, 88, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 280, 68, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 349, 36, textureX, textureY); // Box 11
		bodyModel[114] = new ModelRendererTurbo(this, 349, 15, textureX, textureY); // Box 83
		bodyModel[115] = new ModelRendererTurbo(this, 374, 27, textureX, textureY); // Box 11
		bodyModel[116] = new ModelRendererTurbo(this, 307, 60, textureX, textureY); // Box 60
		bodyModel[117] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Box 60
		bodyModel[118] = new ModelRendererTurbo(this, 300, 83, textureX, textureY); // Box 129
		bodyModel[119] = new ModelRendererTurbo(this, 358, 36, textureX, textureY); // Box 130
		bodyModel[120] = new ModelRendererTurbo(this, 358, 12, textureX, textureY); // Box 60
		bodyModel[121] = new ModelRendererTurbo(this, 370, 38, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 349, 56, textureX, textureY); // Box 12
		bodyModel[123] = new ModelRendererTurbo(this, 353, 52, textureX, textureY); // Box 13
		bodyModel[124] = new ModelRendererTurbo(this, 339, 6, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 343, 2, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 304, 29, textureX, textureY); // Box 11
		bodyModel[127] = new ModelRendererTurbo(this, 304, 9, textureX, textureY); // Box 141
		bodyModel[128] = new ModelRendererTurbo(this, 302, 18, textureX, textureY); // Box 141
		bodyModel[129] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 38
		bodyModel[130] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 296, 315, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 296, 280, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 93, 306, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 51, 253, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 40, 120, textureX, textureY); // Front left trapdoor
		bodyModel[136] = new ModelRendererTurbo(this, 40, 114, textureX, textureY); // Front right trapdoor
		bodyModel[137] = new ModelRendererTurbo(this, 280, 120, textureX, textureY); // Rear left trapdoor
		bodyModel[138] = new ModelRendererTurbo(this, 280, 114, textureX, textureY); // Rear right trapdoor
		bodyModel[139] = new ModelRendererTurbo(this, 267, 91, textureX, textureY); // Left rear door
		bodyModel[140] = new ModelRendererTurbo(this, 267, 69, textureX, textureY); // Right rear door
		bodyModel[141] = new ModelRendererTurbo(this, 59, 91, textureX, textureY); // Left front door
		bodyModel[142] = new ModelRendererTurbo(this, 59, 69, textureX, textureY); // Right front door
		bodyModel[143] = new ModelRendererTurbo(this, 267, 135, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 47, 135, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 70, 135, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 2
		bodyModel[147] = new ModelRendererTurbo(this, 258, 142, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 256, 138, textureX, textureY); // Box 2
		bodyModel[149] = new ModelRendererTurbo(this, 72, 142, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 70, 138, textureX, textureY); // Box 2
		bodyModel[151] = new ModelRendererTurbo(this, 134, 142, textureX, textureY); // Box 2
		bodyModel[152] = new ModelRendererTurbo(this, 103, 142, textureX, textureY); // Box 2
		bodyModel[153] = new ModelRendererTurbo(this, 205, 142, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 134, 138, textureX, textureY); // Box 532
		bodyModel[155] = new ModelRendererTurbo(this, 103, 138, textureX, textureY); // Box 533
		bodyModel[156] = new ModelRendererTurbo(this, 205, 138, textureX, textureY); // Box 534
		bodyModel[157] = new ModelRendererTurbo(this, 103, 150, textureX, textureY); // Box 2
		bodyModel[158] = new ModelRendererTurbo(this, 229, 150, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 228, 150, textureX, textureY); // Box 2
		bodyModel[160] = new ModelRendererTurbo(this, 92, 138, textureX, textureY); // Box 540
		bodyModel[161] = new ModelRendererTurbo(this, 228, 138, textureX, textureY); // Box 541
		bodyModel[162] = new ModelRendererTurbo(this, 92, 150, textureX, textureY); // Box 2
		bodyModel[163] = new ModelRendererTurbo(this, 204, 179, textureX, textureY); // Box 341
		bodyModel[164] = new ModelRendererTurbo(this, 165, 176, textureX, textureY); // Box 341
		bodyModel[165] = new ModelRendererTurbo(this, 168, 189, textureX, textureY); // Box 341
		bodyModel[166] = new ModelRendererTurbo(this, 168, 184, textureX, textureY); // Box 341
		bodyModel[167] = new ModelRendererTurbo(this, 168, 194, textureX, textureY); // Box 341
		bodyModel[168] = new ModelRendererTurbo(this, 251, 180, textureX, textureY); // Box 41
		bodyModel[169] = new ModelRendererTurbo(this, 247, 179, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[170] = new ModelRendererTurbo(this, 261, 179, textureX, textureY); // Box 341
		bodyModel[171] = new ModelRendererTurbo(this, 266, 179, textureX, textureY); // Box 341
		bodyModel[172] = new ModelRendererTurbo(this, 160, 186, textureX, textureY); // Box 341
		bodyModel[173] = new ModelRendererTurbo(this, 161, 189, textureX, textureY); // Box 341
		bodyModel[174] = new ModelRendererTurbo(this, 165, 186, textureX, textureY); // Box 341
		bodyModel[175] = new ModelRendererTurbo(this, 148, 188, textureX, textureY); // Box 41
		bodyModel[176] = new ModelRendererTurbo(this, 147, 186, textureX, textureY); // Box 41
		bodyModel[177] = new ModelRendererTurbo(this, 157, 186, textureX, textureY); // Box 41
		bodyModel[178] = new ModelRendererTurbo(this, 167, 160, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[179] = new ModelRendererTurbo(this, 128, 162, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[180] = new ModelRendererTurbo(this, 131, 175, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[181] = new ModelRendererTurbo(this, 131, 170, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[182] = new ModelRendererTurbo(this, 131, 180, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[183] = new ModelRendererTurbo(this, 210, 161, textureX, textureY,"cull"); // DRGW 1006 underbody part cull
		bodyModel[184] = new ModelRendererTurbo(this, 212, 154, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[185] = new ModelRendererTurbo(this, 129, 158, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[186] = new ModelRendererTurbo(this, 130, 161, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[187] = new ModelRendererTurbo(this, 126, 158, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[188] = new ModelRendererTurbo(this, 337, 191, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[189] = new ModelRendererTurbo(this, 340, 185, textureX, textureY,"cull"); // DRGW 1005,1007 underbody part cull
		bodyModel[190] = new ModelRendererTurbo(this, 315, 189, textureX, textureY,"cull"); // DRGW 1005,1007 underbody part cull
		bodyModel[191] = new ModelRendererTurbo(this, 317, 182, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[192] = new ModelRendererTurbo(this, 332, 192, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[193] = new ModelRendererTurbo(this, 337, 192, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[194] = new ModelRendererTurbo(this, 109, 146, textureX, textureY); // Box 341
		bodyModel[195] = new ModelRendererTurbo(this, 187, 147, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 174, 149, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 176, 146, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[198] = new ModelRendererTurbo(this, 166, 146, textureX, textureY); // Box 341
		bodyModel[199] = new ModelRendererTurbo(this, 253, 163, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[200] = new ModelRendererTurbo(this, 261, 166, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[201] = new ModelRendererTurbo(this, 264, 163, textureX, textureY,"cull"); // DRGW 1005,1007 underbody part cull
		bodyModel[202] = new ModelRendererTurbo(this, 323, 116, textureX, textureY); // Box 128
		bodyModel[203] = new ModelRendererTurbo(this, 326, 116, textureX, textureY); // Box 128
		bodyModel[204] = new ModelRendererTurbo(this, 323, 108, textureX, textureY); // Box 202
		bodyModel[205] = new ModelRendererTurbo(this, 326, 108, textureX, textureY); // Box 203
		bodyModel[206] = new ModelRendererTurbo(this, 6, 116, textureX, textureY); // Box 128
		bodyModel[207] = new ModelRendererTurbo(this, 9, 116, textureX, textureY); // Box 128
		bodyModel[208] = new ModelRendererTurbo(this, 6, 108, textureX, textureY); // Box 202
		bodyModel[209] = new ModelRendererTurbo(this, 9, 108, textureX, textureY); // Box 203
		bodyModel[210] = new ModelRendererTurbo(this, 262, 1, textureX, textureY); // Box 128
		bodyModel[211] = new ModelRendererTurbo(this, 136, 6, textureX, textureY); // Box 298
		bodyModel[212] = new ModelRendererTurbo(this, 141, 5, textureX, textureY); // Box 298
		bodyModel[213] = new ModelRendererTurbo(this, 136, 1, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 310, 86, textureX, textureY); // Rear gate closed
		bodyModel[215] = new ModelRendererTurbo(this, 307, 91, textureX, textureY); // Rear gate open
		bodyModel[216] = new ModelRendererTurbo(this, 19, 86, textureX, textureY); // Front gate closed
		bodyModel[217] = new ModelRendererTurbo(this, 16, 91, textureX, textureY); // Front gate open
		bodyModel[218] = new ModelRendererTurbo(this, 303, 148, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[219] = new ModelRendererTurbo(this, 306, 136, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[220] = new ModelRendererTurbo(this, 306, 139, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[221] = new ModelRendererTurbo(this, 306, 143, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[222] = new ModelRendererTurbo(this, 295, 148, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 295, 142, textureX, textureY); // Box 2
		bodyModel[224] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 295, 136, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 297, 139, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 303, 156, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[228] = new ModelRendererTurbo(this, 306, 173, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[229] = new ModelRendererTurbo(this, 306, 169, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[230] = new ModelRendererTurbo(this, 306, 164, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[231] = new ModelRendererTurbo(this, 19, 148, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[232] = new ModelRendererTurbo(this, 22, 136, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[233] = new ModelRendererTurbo(this, 22, 139, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[234] = new ModelRendererTurbo(this, 22, 143, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[235] = new ModelRendererTurbo(this, 19, 156, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[236] = new ModelRendererTurbo(this, 22, 173, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[237] = new ModelRendererTurbo(this, 22, 169, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[238] = new ModelRendererTurbo(this, 22, 164, textureX, textureY,"cull"); // Box 323 cull
		bodyModel[239] = new ModelRendererTurbo(this, 36, 268, textureX, textureY); // Box 128
		bodyModel[240] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 128
		bodyModel[241] = new ModelRendererTurbo(this, 35, 244, textureX, textureY); // Box 128
		bodyModel[242] = new ModelRendererTurbo(this, 95, 286, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 293, 50, textureX, textureY); // Box 12
		bodyModel[244] = new ModelRendererTurbo(this, 303, 1, textureX, textureY); // Box 62
		bodyModel[245] = new ModelRendererTurbo(this, 132, 54, textureX, textureY); // Box 12
		bodyModel[246] = new ModelRendererTurbo(this, 136, 63, textureX, textureY); // Box 12
		bodyModel[247] = new ModelRendererTurbo(this, 136, 60, textureX, textureY); // Box 12
		bodyModel[248] = new ModelRendererTurbo(this, 132, 18, textureX, textureY); // Box 355
		bodyModel[249] = new ModelRendererTurbo(this, 136, 11, textureX, textureY); // Box 356
		bodyModel[250] = new ModelRendererTurbo(this, 136, 15, textureX, textureY); // Box 357
		bodyModel[251] = new ModelRendererTurbo(this, 145, 215, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 142, 206, textureX, textureY); // Box 11
		bodyModel[253] = new ModelRendererTurbo(this, 145, 200, textureX, textureY); // Box 360
		bodyModel[254] = new ModelRendererTurbo(this, 295, 164, textureX, textureY); // Box 361
		bodyModel[255] = new ModelRendererTurbo(this, 295, 170, textureX, textureY); // Box 362
		bodyModel[256] = new ModelRendererTurbo(this, 297, 167, textureX, textureY); // Box 363
		bodyModel[257] = new ModelRendererTurbo(this, 295, 176, textureX, textureY); // Box 364
		bodyModel[258] = new ModelRendererTurbo(this, 297, 173, textureX, textureY); // Box 365
		bodyModel[259] = new ModelRendererTurbo(this, 31, 148, textureX, textureY); // Box 2
		bodyModel[260] = new ModelRendererTurbo(this, 31, 142, textureX, textureY); // Box 2
		bodyModel[261] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 2
		bodyModel[262] = new ModelRendererTurbo(this, 31, 136, textureX, textureY); // Box 2
		bodyModel[263] = new ModelRendererTurbo(this, 33, 139, textureX, textureY); // Box 2
		bodyModel[264] = new ModelRendererTurbo(this, 31, 164, textureX, textureY); // Box 361
		bodyModel[265] = new ModelRendererTurbo(this, 31, 170, textureX, textureY); // Box 362
		bodyModel[266] = new ModelRendererTurbo(this, 33, 167, textureX, textureY); // Box 363
		bodyModel[267] = new ModelRendererTurbo(this, 31, 176, textureX, textureY); // Box 364
		bodyModel[268] = new ModelRendererTurbo(this, 33, 173, textureX, textureY); // Box 365
		bodyModel[269] = new ModelRendererTurbo(this, 55, 294, textureX, textureY); // Box 380
		bodyModel[270] = new ModelRendererTurbo(this, 59, 300, textureX, textureY); // Box 382
		bodyModel[271] = new ModelRendererTurbo(this, 328, 288, textureX, textureY); // Box 380
		bodyModel[272] = new ModelRendererTurbo(this, 337, 296, textureX, textureY); // Box 382
		bodyModel[273] = new ModelRendererTurbo(this, 82, 295, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[274] = new ModelRendererTurbo(this, 58, 308, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 59, 312, textureX, textureY); // Box 38
		bodyModel[276] = new ModelRendererTurbo(this, 328, 294, textureX, textureY); // Box 128
		bodyModel[277] = new ModelRendererTurbo(this, 23, 273, textureX, textureY); // Box 38
		bodyModel[278] = new ModelRendererTurbo(this, 26, 278, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 25, 282, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 341, 291, textureX, textureY); // Box 38
		bodyModel[281] = new ModelRendererTurbo(this, 344, 296, textureX, textureY); // Box 38
		bodyModel[282] = new ModelRendererTurbo(this, 343, 300, textureX, textureY); // Box 38
		bodyModel[283] = new ModelRendererTurbo(this, 115, 158, textureX, textureY); // DRGW 1006 underbody part
		bodyModel[284] = new ModelRendererTurbo(this, 111, 157, textureX, textureY,"cull"); // DRGW 1006 underbody part cull
		bodyModel[285] = new ModelRendererTurbo(this, 223, 194, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[286] = new ModelRendererTurbo(this, 226, 191, textureX, textureY,"cull"); // DRGW 1006? underbody part cull
		bodyModel[287] = new ModelRendererTurbo(this, 282, 189, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[288] = new ModelRendererTurbo(this, 187, 145, textureX, textureY); // Box 41
		bodyModel[289] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 41
		bodyModel[290] = new ModelRendererTurbo(this, 202, 192, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[291] = new ModelRendererTurbo(this, 202, 190, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[292] = new ModelRendererTurbo(this, 220, 190, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[293] = new ModelRendererTurbo(this, 238, 196, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[294] = new ModelRendererTurbo(this, 70, 312, textureX, textureY); // Box 38
		bodyModel[295] = new ModelRendererTurbo(this, 59, 328, textureX, textureY); // Box 38
		bodyModel[296] = new ModelRendererTurbo(this, 59, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[297] = new ModelRendererTurbo(this, 63, 320, textureX, textureY); // Box 38
		bodyModel[298] = new ModelRendererTurbo(this, 76, 328, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 76, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[300] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 75, 319, textureX, textureY); // Box 38
		bodyModel[302] = new ModelRendererTurbo(this, 75, 312, textureX, textureY); // Box 38
		bodyModel[303] = new ModelRendererTurbo(this, 73, 315, textureX, textureY); // Box 38
		bodyModel[304] = new ModelRendererTurbo(this, 86, 303, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 86, 309, textureX, textureY); // Box 38
		bodyModel[306] = new ModelRendererTurbo(this, 86, 315, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 65, 298, textureX, textureY); // Box 38
		bodyModel[308] = new ModelRendererTurbo(this, 65, 304, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[309] = new ModelRendererTurbo(this, 69, 290, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 41, 324, textureX, textureY); // Box 492
		bodyModel[311] = new ModelRendererTurbo(this, 44, 317, textureX, textureY); // Box 493
		bodyModel[312] = new ModelRendererTurbo(this, 41, 299, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[313] = new ModelRendererTurbo(this, 40, 330, textureX, textureY); // Box 492
		bodyModel[314] = new ModelRendererTurbo(this, 40, 311, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[315] = new ModelRendererTurbo(this, 40, 337, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[316] = new ModelRendererTurbo(this, 41, 286, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[317] = new ModelRendererTurbo(this, 22, 324, textureX, textureY); // Box 492
		bodyModel[318] = new ModelRendererTurbo(this, 25, 317, textureX, textureY); // Box 493
		bodyModel[319] = new ModelRendererTurbo(this, 22, 299, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[320] = new ModelRendererTurbo(this, 21, 330, textureX, textureY); // Box 492
		bodyModel[321] = new ModelRendererTurbo(this, 21, 311, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[322] = new ModelRendererTurbo(this, 21, 337, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[323] = new ModelRendererTurbo(this, 23, 286, textureX, textureY,"cull"); // Box 498 cull
		bodyModel[324] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 100, 234, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 103, 238, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 82, 254, textureX, textureY); // Box 425
		bodyModel[328] = new ModelRendererTurbo(this, 84, 247, textureX, textureY); // Box 426
		bodyModel[329] = new ModelRendererTurbo(this, 87, 251, textureX, textureY); // Box 427
		bodyModel[330] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[331] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[332] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[333] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[335] = new ModelRendererTurbo(this, 272, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[336] = new ModelRendererTurbo(this, 283, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[337] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[338] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[340] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[342] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[343] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[345] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[347] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[348] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[349] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[350] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[351] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[352] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[356] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[357] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[362] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[363] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[364] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[365] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[368] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[369] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[370] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[371] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[374] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[375] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[376] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[377] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[378] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[379] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[381] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[383] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[384] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[385] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[387] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[390] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[391] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[392] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[393] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[394] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[395] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[396] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[397] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[398] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[399] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[402] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[403] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[404] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[405] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[406] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[407] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[408] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[409] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[410] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[411] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[412] = new ModelRendererTurbo(this, 283, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[413] = new ModelRendererTurbo(this, 272, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[414] = new ModelRendererTurbo(this, 120, 304, textureX, textureY); // Box 128
		bodyModel[415] = new ModelRendererTurbo(this, 145, 221, textureX, textureY); // Box 11
		bodyModel[416] = new ModelRendererTurbo(this, 176, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[417] = new ModelRendererTurbo(this, 176, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[418] = new ModelRendererTurbo(this, 185, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[419] = new ModelRendererTurbo(this, 185, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[420] = new ModelRendererTurbo(this, 194, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[421] = new ModelRendererTurbo(this, 194, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[422] = new ModelRendererTurbo(this, 203, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[423] = new ModelRendererTurbo(this, 203, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[424] = new ModelRendererTurbo(this, 212, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[425] = new ModelRendererTurbo(this, 212, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[426] = new ModelRendererTurbo(this, 221, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[427] = new ModelRendererTurbo(this, 221, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[428] = new ModelRendererTurbo(this, 230, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[429] = new ModelRendererTurbo(this, 230, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[430] = new ModelRendererTurbo(this, 239, 226, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[431] = new ModelRendererTurbo(this, 239, 230, textureX, textureY,"lamp"); // Box 11 glow
		bodyModel[432] = new ModelRendererTurbo(this, 118, 267, textureX, textureY); // Box 38
		bodyModel[433] = new ModelRendererTurbo(this, 118, 260, textureX, textureY); // Box 462
		bodyModel[434] = new ModelRendererTurbo(this, 374, 2, textureX, textureY); // Box 60
		bodyModel[435] = new ModelRendererTurbo(this, 144, 146, textureX, textureY); // Box 41
		bodyModel[436] = new ModelRendererTurbo(this, 142, 149, textureX, textureY); // Box 41
		bodyModel[437] = new ModelRendererTurbo(this, 153, 151, textureX, textureY); // Box 41
		bodyModel[438] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 341
		bodyModel[439] = new ModelRendererTurbo(this, 159, 149, textureX, textureY); // Box 341
		bodyModel[440] = new ModelRendererTurbo(this, 229, 162, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[441] = new ModelRendererTurbo(this, 227, 165, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[442] = new ModelRendererTurbo(this, 238, 167, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[443] = new ModelRendererTurbo(this, 238, 164, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[444] = new ModelRendererTurbo(this, 244, 165, textureX, textureY); // DRGW 1005,1007 underbody part
		bodyModel[445] = new ModelRendererTurbo(this, 257, 191, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[446] = new ModelRendererTurbo(this, 255, 194, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[447] = new ModelRendererTurbo(this, 250, 196, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[448] = new ModelRendererTurbo(this, 248, 193, textureX, textureY); // DRGW 1006? underbody part
		bodyModel[449] = new ModelRendererTurbo(this, 242, 194, textureX, textureY); // DRGW 1006? underbody part

		bodyModel[0].addBox(0F, 0F, 0F, 96, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-48F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(53F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[3].setRotationPoint(-52F, 1F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-49F, -20F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-24F, -19F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-24F, -19F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[7].setRotationPoint(-51F, -18F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 98, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-49F, -20.5F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[9].setRotationPoint(-49F, -20F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 62
		bodyModel[10].setRotationPoint(-51F, -18F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(53.5F, -15F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(53.5F, 1F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(53.5F, -14F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(55F, -14F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[15].setRotationPoint(55F, -14F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(55F, 1F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[17].setRotationPoint(55F, -15F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 128
		bodyModel[18].setRotationPoint(55F, -16.5F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 153
		bodyModel[19].setRotationPoint(55F, -16.5F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(53.5F, -14F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[21].setRotationPoint(53F, -14F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[22].setRotationPoint(53F, -15F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[23].setRotationPoint(53F, -15F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[24].setRotationPoint(49F, -20.5F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.85F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[25].setRotationPoint(49F, -20.5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.85F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[26].setRotationPoint(49F, -20.5F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[27].setRotationPoint(53F, 1F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0.15F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0.15F, 0F, 0F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 34
		bodyModel[28].setRotationPoint(51F, -20F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, 0F, -0.75F, -1.675F, 0F, -0.75F, -1.5F, 0F, 0F, 0.15F, 0F, 0F, 1.93F, 0F, 0.25F, 1.93F, 0F, 0.25F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 34
		bodyModel[29].setRotationPoint(51F, -20F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.15F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.675F, 0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.93F, 0F, 0F, 1.93F, 0F); // Box 81
		bodyModel[30].setRotationPoint(51F, -20F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.65F, 0F, -0.9F, -0.875F, 0F, -0.75F, -0.675F, 0F, 0F, 0.9F, 0F, 0F, 1.36F, 0F, -0.085F, 1.36F, 0F, 0.25F, 0.93F, 0F, 0F, 0.93F, 0F); // Box 34
		bodyModel[31].setRotationPoint(51F, -19F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.9F, 0F, -0.75F, -0.675F, 0F, -0.9F, -0.875F, 0F, 0F, 0.65F, 0F, 0F, 0.93F, 0F, 0.25F, 0.93F, 0F, -0.085F, 1.36F, 0F, 0F, 1.36F, 0F); // Box 34
		bodyModel[32].setRotationPoint(51F, -19F, 5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[33].setRotationPoint(53F, -14F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[34].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[35].setRotationPoint(-55.5F, 1F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[36].setRotationPoint(-56F, -14F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[37].setRotationPoint(-56F, -14F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[38].setRotationPoint(-56F, 1F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[39].setRotationPoint(-56F, -15F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[40].setRotationPoint(-56F, -16.5F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[41].setRotationPoint(-56F, -16.5F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[42].setRotationPoint(-55.5F, -14F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[43].setRotationPoint(-54F, -14F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[44].setRotationPoint(-54F, -15F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.835F, -1F, 0F, 0F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[45].setRotationPoint(-54F, -16F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, 0.295F, -1F, 0F, 0.415F, -1F, 0F); // Box 50
		bodyModel[46].setRotationPoint(-53F, -17F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[47].setRotationPoint(-54F, -16.5F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.75F, -1.5F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.75F, -1.5F, 0F, 0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.25F, 1.5F, 0F); // Box 34
		bodyModel[48].setRotationPoint(-54F, -20F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Box 11
		bodyModel[49].setRotationPoint(-51F, -20.5F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.75F, -1.675F, 0F, 0F, -0.1F, 0F, 0F, 0.15F, 0F, -0.75F, -1.5F, 0F, 0.25F, 1.93F, 0F, 0F, 1.93F, 0F, 0F, 1.5F, 0F, 0.25F, 1.5F, 0F); // Box 34
		bodyModel[50].setRotationPoint(-54F, -20F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.85F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.85F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Box 11
		bodyModel[51].setRotationPoint(-51F, -20.5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[52].setRotationPoint(-51F, -19F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.75F, -1.5F, 0F, 0F, 0.15F, 0F, 0F, -0.1F, 0F, -0.75F, -1.675F, 0F, 0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.93F, 0F, 0.25F, 1.93F, 0F); // Box 81
		bodyModel[53].setRotationPoint(-54F, -20F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.85F, 0F); // Box 82
		bodyModel[54].setRotationPoint(-51F, -20.5F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[55].setRotationPoint(-52F, -18F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[56].setRotationPoint(-54F, -15F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, 1.12F, 0F, -0.125F, 0.5F, 0F, 0.415F, -1.125F, 0F, -0.705F, -1.125F, 0F, 0F, -1.76F, 0F, 0.915F, -1.76F, 0F); // Box 50
		bodyModel[57].setRotationPoint(-53F, -16.88F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.9F, -0.875F, 0F, 0F, 0.65F, 0F, 0F, 0.9F, 0F, -0.75F, -0.675F, 0F, -0.085F, 1.36F, 0F, 0F, 1.36F, 0F, 0F, 0.93F, 0F, 0.25F, 0.93F, 0F); // Box 34
		bodyModel[58].setRotationPoint(-54F, -19F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 12
		bodyModel[59].setRotationPoint(-52F, -18F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.75F, -0.675F, 0F, 0F, 0.9F, 0F, 0F, 0.65F, 0F, -0.9F, -0.875F, 0F, 0.25F, 0.93F, 0F, 0F, 0.93F, 0F, 0F, 1.36F, 0F, -0.085F, 1.36F, 0F); // Box 34
		bodyModel[60].setRotationPoint(-54F, -19F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[61].setRotationPoint(-54F, 1F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[62].setRotationPoint(-54F, 1F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[63].setRotationPoint(-54F, -15.5F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[64].setRotationPoint(-54F, -15.5F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[65].setRotationPoint(-54F, -16.5F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-55.5F, -14F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -1F, 0F, -0.835F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F); // Box 101
		bodyModel[67].setRotationPoint(-54F, -16F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[68].setRotationPoint(-54F, -16.5F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[69].setRotationPoint(-54F, -14F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[70].setRotationPoint(53F, 1F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 2
		bodyModel[71].setRotationPoint(-54F, 1F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[72].setRotationPoint(-53F, 1F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[73].setRotationPoint(48F, 1F, -5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 10, 0F); // Box 2
		bodyModel[74].setRotationPoint(53F, 1F, -5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[75].setRotationPoint(52F, 1F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[76].setRotationPoint(47F, -15F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[77].setRotationPoint(47F, -15F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear vestibule door
		bodyModel[78].setRotationPoint(47F, -14F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[79].setRotationPoint(47F, -15F, -3F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[80].setRotationPoint(-48F, -15F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[81].setRotationPoint(-48F, -15F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front vestibule door
		bodyModel[82].setRotationPoint(-48F, -14F, 3F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(-48F, -15F, -3F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[84].setRotationPoint(-52F, -15F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[85].setRotationPoint(-52F, -15F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-53F, -15F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
		bodyModel[87].setRotationPoint(-53F, -15F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[88].setRotationPoint(-53F, -16.5F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[89].setRotationPoint(-53F, -15.5F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[90].setRotationPoint(-51F, -19F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[91].setRotationPoint(-51F, -19F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -0.705F, -1F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, -0.705F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[92].setRotationPoint(-52F, -16F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[93].setRotationPoint(-52F, -16F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.36F, 0F, 0F, -0.36F, 0F, -0.705F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.705F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[94].setRotationPoint(-52F, -16F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[95].setRotationPoint(-52F, -16F, 5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0.415F, -1F, 0F, 0.295F, -1F, 0F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F); // Box 137
		bodyModel[96].setRotationPoint(-53F, -17F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.125F, 0.5F, 0F, 0F, 1.12F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0.915F, -1.76F, 0F, 0F, -1.76F, 0F, -0.705F, -1.125F, 0F, 0.415F, -1.125F, 0F); // Box 138
		bodyModel[97].setRotationPoint(-53F, -16.88F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 25, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[98].setRotationPoint(-49F, -19F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 25, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[99].setRotationPoint(-49F, -19F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 25, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[100].setRotationPoint(-49F, -19F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.415F, -1F, 0F, 0.295F, -1F, 0F); // Box 50
		bodyModel[101].setRotationPoint(52F, -17F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[102].setRotationPoint(51F, -18F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1F, 0.12F, 0F, -1F, 0.12F, 0F, -0.125F, 0.5F, 0F, 0F, 1.12F, 0F, -0.705F, -1.125F, 0F, 0.415F, -1.125F, 0F, 0.915F, -1.76F, 0F, 0F, -1.76F, 0F); // Box 50
		bodyModel[103].setRotationPoint(51F, -16.88F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 12
		bodyModel[104].setRotationPoint(51F, -18F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0.295F, -1F, 0F, 0.415F, -1F, 0F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 137
		bodyModel[105].setRotationPoint(52F, -17F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 1.12F, 0F, -0.125F, 0.5F, 0F, -1F, 0.12F, 0F, -1F, 0.12F, 0F, 0F, -1.76F, 0F, 0.915F, -1.76F, 0F, 0.415F, -1.125F, 0F, -0.705F, -1.125F, 0F); // Box 138
		bodyModel[106].setRotationPoint(51F, -16.88F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, -0.835F, -1F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[107].setRotationPoint(52F, -16F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, -0.835F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[108].setRotationPoint(52F, -16F, 5F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[109].setRotationPoint(48F, -15F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[110].setRotationPoint(48F, -15F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.835F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(52F, -15F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.835F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[112].setRotationPoint(52F, -15F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[113].setRotationPoint(49F, -19F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[114].setRotationPoint(49F, -19F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[115].setRotationPoint(49F, -19F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[116].setRotationPoint(53F, -16.5F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		bodyModel[117].setRotationPoint(53F, -15.5F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[118].setRotationPoint(53F, -15.5F, -5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[119].setRotationPoint(51F, -16.5F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[120].setRotationPoint(51F, -16.5F, 3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[121].setRotationPoint(51F, -15.5F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.705F, -1F, 0F, 0F, -1F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, -0.705F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[122].setRotationPoint(51F, -16F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[123].setRotationPoint(51F, -16F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, -1F, 0F, -0.705F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.705F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(51F, -16F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.07F, 0F, 0F, 0.07F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[125].setRotationPoint(51F, -16F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[126].setRotationPoint(40F, -19F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[127].setRotationPoint(40F, -19F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[128].setRotationPoint(40F, -19F, -3F);

		bodyModel[129].addBox(0F, 0F, 0F, 96, 16, 1, 0F); // Box 38
		bodyModel[129].setRotationPoint(-48F, -15F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 96, 16, 1, 0F); // Box 128
		bodyModel[130].setRotationPoint(-48F, -15F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[131].setRotationPoint(46F, -15F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[132].setRotationPoint(40F, -15F, 3F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[133].setRotationPoint(-25F, -15F, -10F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 128
		bodyModel[134].setRotationPoint(-41F, -15F, -10F);

		bodyModel[135].addBox(-4F, 0F, 0F, 4, 0, 5, 0F); // Front left trapdoor
		bodyModel[135].setRotationPoint(-48F, 1F, -10F);

		bodyModel[136].addBox(-4F, 0F, 0F, 4, 0, 5, 0F); // Front right trapdoor
		bodyModel[136].setRotationPoint(-48F, 1F, 5F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 0, 5, 0F); // Rear left trapdoor
		bodyModel[137].setRotationPoint(48F, 1F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 0, 5, 0F); // Rear right trapdoor
		bodyModel[138].setRotationPoint(48F, 1F, 5F);

		bodyModel[139].addShapeBox(0F, 0F, -1F, 5, 16, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left rear door
		bodyModel[139].setRotationPoint(48F, -13F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right rear door
		bodyModel[140].setRotationPoint(48F, -13F, 10F);

		bodyModel[141].addShapeBox(-4F, 0F, -1F, 5, 16, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left front door
		bodyModel[141].setRotationPoint(-48F, -13F, -10F);

		bodyModel[142].addShapeBox(-4F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right front door
		bodyModel[142].setRotationPoint(-48F, -13F, 10F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[143].setRotationPoint(49F, 3F, -4F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[144].setRotationPoint(-53F, 3F, -4F);

		bodyModel[145].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 2
		bodyModel[145].setRotationPoint(-49F, 3F, -2F);

		bodyModel[146].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 2
		bodyModel[146].setRotationPoint(-49F, 3F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[147].setRotationPoint(37.5F, 4F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 2
		bodyModel[148].setRotationPoint(36.5F, 3F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[149].setRotationPoint(-39.5F, 4F, -1F);

		bodyModel[150].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 2
		bodyModel[150].setRotationPoint(-40.5F, 3F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[151].setRotationPoint(-17F, 4F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[152].setRotationPoint(-31F, 4F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[153].setRotationPoint(17F, 4F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[154].setRotationPoint(-17F, 4F, 1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 533
		bodyModel[155].setRotationPoint(-31F, 4F, 1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 534
		bodyModel[156].setRotationPoint(17F, 4F, 1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[157].setRotationPoint(-17F, 4F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[158].setRotationPoint(16F, 4F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[159].setRotationPoint(16F, 3F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 540
		bodyModel[160].setRotationPoint(-17F, 3F, 2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 541
		bodyModel[161].setRotationPoint(16F, 3F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[162].setRotationPoint(-17F, 3F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 341
		bodyModel[163].setRotationPoint(-1F, 3F, -10.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // Box 341
		bodyModel[164].setRotationPoint(-16F, 3F, -10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[165].setRotationPoint(-16F, 5F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 341
		bodyModel[166].setRotationPoint(-16F, 5F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[167].setRotationPoint(-16F, 5F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[168].setRotationPoint(21.5F, 4.45F, 5F);
		bodyModel[168].rotateAngleZ = -0.78539816F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41 cull
		bodyModel[169].setRotationPoint(21F, 3F, 6F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[170].setRotationPoint(23F, 3F, -10.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[171].setRotationPoint(25F, 3F, -10.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[172].setRotationPoint(-24F, 3F, -10.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 341
		bodyModel[173].setRotationPoint(-24F, 4F, -10F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 341
		bodyModel[174].setRotationPoint(-22F, 3F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[175].setRotationPoint(-28F, 2.75F, -9.4F);
		bodyModel[175].rotateAngleX = -0.78539816F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[176].setRotationPoint(-28.01F, 3F, -9.9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[177].setRotationPoint(-24.99F, 3F, -9.9F);

		bodyModel[178].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // DRGW 1006 underbody part
		bodyModel[178].setRotationPoint(0F, 3F, 5.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // DRGW 1006 underbody part
		bodyModel[179].setRotationPoint(-15F, 3F, 5.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1006 underbody part
		bodyModel[180].setRotationPoint(-15F, 5F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // DRGW 1006 underbody part
		bodyModel[181].setRotationPoint(-15F, 5F, 9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1006 underbody part
		bodyModel[182].setRotationPoint(-15F, 5F, 5F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // DRGW 1006 underbody part cull
		bodyModel[183].setRotationPoint(19F, 3F, 5.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // DRGW 1006 underbody part
		bodyModel[184].setRotationPoint(21F, 5.87F, 5.5F);
		bodyModel[184].rotateAngleZ = -0.78539816F;

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // DRGW 1006 underbody part
		bodyModel[185].setRotationPoint(-18F, 3F, 9.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // DRGW 1006 underbody part
		bodyModel[186].setRotationPoint(-18F, 4F, 10F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // DRGW 1006 underbody part
		bodyModel[187].setRotationPoint(-20F, 3F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1005,1007 underbody part
		bodyModel[188].setRotationPoint(26.5F, 4.45F, 5F);
		bodyModel[188].rotateAngleZ = -0.78539816F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1005,1007 underbody part cull
		bodyModel[189].setRotationPoint(26F, 3F, 6F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // DRGW 1005,1007 underbody part cull
		bodyModel[190].setRotationPoint(17F, 3F, -9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F); // DRGW 1005,1007 underbody part
		bodyModel[191].setRotationPoint(19F, 5.87F, -9.5F);
		bodyModel[191].rotateAngleZ = -0.78539816F;

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // DRGW 1005,1007 underbody part
		bodyModel[192].setRotationPoint(22F, 3F, -10.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // DRGW 1005,1007 underbody part
		bodyModel[193].setRotationPoint(24F, 3F, -10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 341
		bodyModel[194].setRotationPoint(-16F, 3F, 5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[195].setRotationPoint(8F, 2.75F, 6F);
		bodyModel[195].rotateAngleX = -0.78539816F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[196].setRotationPoint(7F, 2.75F, 9.4F);
		bodyModel[196].rotateAngleX = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41 cull
		bodyModel[197].setRotationPoint(7.5F, 3F, 8.9F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 341
		bodyModel[198].setRotationPoint(3F, 3F, 9.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // DRGW 1005,1007 underbody part
		bodyModel[199].setRotationPoint(1F, 3F, 9.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // DRGW 1005,1007 underbody part
		bodyModel[200].setRotationPoint(6F, 2.75F, 9.4F);
		bodyModel[200].rotateAngleX = -0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // DRGW 1005,1007 underbody part cull
		bodyModel[201].setRotationPoint(7F, 3F, 8.9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[202].setRotationPoint(48F, -5F, -12F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[203].setRotationPoint(52F, -5F, -12F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[204].setRotationPoint(48F, -5F, 11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[205].setRotationPoint(52F, -5F, 11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[206].setRotationPoint(-52F, -5F, -12F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[207].setRotationPoint(-48F, -5F, -12F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[208].setRotationPoint(-52F, -5F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[209].setRotationPoint(-48F, -5F, 11F);

		bodyModel[210].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F); // Box 128
		bodyModel[210].setRotationPoint(41F, -19F, 8F);
		bodyModel[210].rotateAngleY = -0.78539816F;

		bodyModel[211].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F); // Box 298
		bodyModel[211].setRotationPoint(-42F, -19F, -8F);
		bodyModel[211].rotateAngleY = -0.78539816F;

		bodyModel[212].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F); // Box 298
		bodyModel[212].setRotationPoint(-27F, -19.5F, -7.75F);
		bodyModel[212].rotateAngleY = -0.78539816F;

		bodyModel[213].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F, -0.125F, -1.475F, -0.125F); // Box 128
		bodyModel[213].setRotationPoint(-30F, -19F, 8F);
		bodyModel[213].rotateAngleY = -0.78539816F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[214].setRotationPoint(53.5F, -7F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[215].setRotationPoint(53.5F, -7F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[216].setRotationPoint(-53.5F, -7F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[217].setRotationPoint(-53.5F, -7F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128 cull
		bodyModel[218].setRotationPoint(48F, 3F, 5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[219].setRotationPoint(48F, 5F, 9.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[220].setRotationPoint(48F, 3F, 9.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[221].setRotationPoint(48F, 3F, 8.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[222].setRotationPoint(48F, 2.75F, 5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 2
		bodyModel[223].setRotationPoint(48F, 4.5F, 6.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2
		bodyModel[224].setRotationPoint(48F, 2.75F, 6.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[225].setRotationPoint(48F, 6F, 8.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[226].setRotationPoint(48F, 4.5F, 8.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 323 cull
		bodyModel[227].setRotationPoint(48F, 3F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[228].setRotationPoint(48F, 5F, -10.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[229].setRotationPoint(48F, 3F, -10.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[230].setRotationPoint(48F, 3F, -9.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128 cull
		bodyModel[231].setRotationPoint(-52F, 3F, 5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[232].setRotationPoint(-52F, 5F, 9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[233].setRotationPoint(-52F, 3F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 cull
		bodyModel[234].setRotationPoint(-52F, 3F, 8.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 323 cull
		bodyModel[235].setRotationPoint(-52F, 3F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[236].setRotationPoint(-52F, 5F, -10.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[237].setRotationPoint(-52F, 3F, -10.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323 cull
		bodyModel[238].setRotationPoint(-52F, 3F, -9.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 128
		bodyModel[239].setRotationPoint(-47F, -15F, -4F);

		bodyModel[240].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 128
		bodyModel[240].setRotationPoint(41F, -15F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[241].setRotationPoint(-47F, -15F, 4F);

		bodyModel[242].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 128
		bodyModel[242].setRotationPoint(-40F, -15F, 5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[243].setRotationPoint(40F, -18F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 62
		bodyModel[244].setRotationPoint(40F, -18F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[245].setRotationPoint(-24F, -18F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[246].setRotationPoint(-24F, -17F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[247].setRotationPoint(-24F, -16F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[248].setRotationPoint(-24F, -18F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 64, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 356
		bodyModel[249].setRotationPoint(-24F, -17F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[250].setRotationPoint(-24F, -16F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[251].setRotationPoint(-24F, -19.5F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 64, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[252].setRotationPoint(-24F, -19.5F, -3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 64, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 360
		bodyModel[253].setRotationPoint(-24F, -19.5F, 3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[254].setRotationPoint(48F, 2.75F, -7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 362
		bodyModel[255].setRotationPoint(48F, 4.5F, -8.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 363
		bodyModel[256].setRotationPoint(48F, 2.75F, -6.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[257].setRotationPoint(48F, 6F, -10.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
		bodyModel[258].setRotationPoint(48F, 4.5F, -8.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[259].setRotationPoint(-52F, 2.75F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 2
		bodyModel[260].setRotationPoint(-52F, 4.5F, 6.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 2
		bodyModel[261].setRotationPoint(-52F, 2.75F, 6.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[262].setRotationPoint(-52F, 6F, 8.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[263].setRotationPoint(-52F, 4.5F, 8.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[264].setRotationPoint(-52F, 2.75F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 362
		bodyModel[265].setRotationPoint(-52F, 4.5F, -8.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 363
		bodyModel[266].setRotationPoint(-52F, 2.75F, -6.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[267].setRotationPoint(-52F, 6F, -10.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 365
		bodyModel[268].setRotationPoint(-52F, 4.5F, -8.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[269].setRotationPoint(-40F, -6F, 1F);

		bodyModel[270].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[270].setRotationPoint(-39.25F, -5F, 3F);
		bodyModel[270].rotateAngleY = -0.78539816F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[271].setRotationPoint(41F, -6F, 6F);

		bodyModel[272].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[272].setRotationPoint(41.75F, -5F, 8F);
		bodyModel[272].rotateAngleY = -0.78539816F;

		bodyModel[273].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 128 cull
		bodyModel[273].setRotationPoint(-30F, -6F, 4F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[274].setRotationPoint(-40F, -6F, -3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[275].setRotationPoint(-39.45F, -5F, -2.5F);
		bodyModel[275].rotateAngleY = 0.78539816F;

		bodyModel[276].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 128
		bodyModel[276].setRotationPoint(41F, -15F, 4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[277].setRotationPoint(-45.4F, -2F, -9.75F);
		bodyModel[277].rotateAngleY = 0.78539816F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[278].setRotationPoint(-45.75F, -1F, -9.4F);
		bodyModel[278].rotateAngleY = 0.78539816F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[279].setRotationPoint(-45.4F, 0.5F, -9.75F);
		bodyModel[279].rotateAngleY = 0.78539816F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[280].setRotationPoint(45.4F, -2F, 9.95F);
		bodyModel[280].rotateAngleY = -2.35619449F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[281].setRotationPoint(45.75F, -1F, 9.6F);
		bodyModel[281].rotateAngleY = -2.35619449F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[282].setRotationPoint(45.4F, 0.5F, 9.95F);
		bodyModel[282].rotateAngleY = -2.35619449F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1006 underbody part
		bodyModel[283].setRotationPoint(-21.5F, 4.45F, -10F);
		bodyModel[283].rotateAngleZ = -0.78539816F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1006 underbody part cull
		bodyModel[284].setRotationPoint(-22F, 3F, -9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // DRGW 1006? underbody part
		bodyModel[285].setRotationPoint(-11F, 2.75F, -9.4F);
		bodyModel[285].rotateAngleX = -0.78539816F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // DRGW 1006? underbody part cull
		bodyModel[286].setRotationPoint(-10F, 3F, -9.9F);

		bodyModel[287].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // DRGW 1006? underbody part
		bodyModel[287].setRotationPoint(5F, 3F, -10.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[288].setRotationPoint(7.99F, 3F, 5.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[289].setRotationPoint(15.01F, 3F, 5.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // DRGW 1006? underbody part
		bodyModel[290].setRotationPoint(-15F, 2.75F, -6F);
		bodyModel[290].rotateAngleX = -0.78539816F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // DRGW 1006? underbody part
		bodyModel[291].setRotationPoint(-15.01F, 3F, -6.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // DRGW 1006? underbody part
		bodyModel[292].setRotationPoint(-7.99F, 3F, -6.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // DRGW 1006? underbody part
		bodyModel[293].setRotationPoint(-3F, 3F, -10.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 38
		bodyModel[294].setRotationPoint(-26F, -6F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[295].setRotationPoint(-28F, -3F, -1.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[296].setRotationPoint(-28F, -2F, -1.75F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[297].setRotationPoint(-28F, -6F, -1.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[298].setRotationPoint(-28F, -3F, -6.25F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[299].setRotationPoint(-28F, -2F, -6.25F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[300].setRotationPoint(-28F, -6F, -6.25F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 38
		bodyModel[301].setRotationPoint(-26.5F, -6F, -8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[302].setRotationPoint(-26.5F, -6F, 1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[303].setRotationPoint(-26.5F, -6F, -4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[304].setRotationPoint(-26.5F, -11F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[305].setRotationPoint(-26.5F, -11F, -3.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[306].setRotationPoint(-26.5F, -11F, -8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[307].setRotationPoint(-37F, -3F, 2.25F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[308].setRotationPoint(-37F, -2F, 2.25F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[309].setRotationPoint(-35F, -6F, 2.25F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[310].setRotationPoint(-33F, -3F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[311].setRotationPoint(-33F, -7F, -9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -2F, 0F, -0.49F, -2F, 0F, -0.49F, -2F, -3.5F, 0F, -2F, -3.5F); // Box 498 cull
		bodyModel[312].setRotationPoint(-29.5F, -4.5F, -8.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 492
		bodyModel[313].setRotationPoint(-33F, -2.5F, -9F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.01F, 0F, 0F, -3.99F, 0F, 0F, -3.99F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, -0.51F, 0F, -3.99F, -0.51F, 0F, -3.99F, -0.51F, -0.49F, 0.01F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[314].setRotationPoint(-33F, -2.5F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -0.51F, 0F, -4F, -0.51F, 0F, -4F, -0.51F, -0.49F, 0F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[315].setRotationPoint(-33F, -1.5F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.49F, 0F, -3.5F, -0.49F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3.5F, -0.49F, -2F, -3.5F); // Box 498 cull
		bodyModel[316].setRotationPoint(-33.5F, -4.5F, -8.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 492
		bodyModel[317].setRotationPoint(-38F, -3F, -8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 493
		bodyModel[318].setRotationPoint(-38F, -7F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -2F, 0F, -0.49F, -2F, 0F, -0.49F, -2F, -3.5F, 0F, -2F, -3.5F); // Box 498 cull
		bodyModel[319].setRotationPoint(-34.5F, -4.5F, -8.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 492
		bodyModel[320].setRotationPoint(-38F, -2.5F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.01F, 0F, 0F, -3.99F, 0F, 0F, -3.99F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, -0.51F, 0F, -3.99F, -0.51F, 0F, -3.99F, -0.51F, -0.49F, 0.01F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[321].setRotationPoint(-38F, -2.5F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -0.51F, 0F, -4F, -0.51F, 0F, -4F, -0.51F, -0.49F, 0F, -0.51F, -0.49F); // Box 498 cull
		bodyModel[322].setRotationPoint(-38F, -1.5F, -9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.49F, 0F, -3.5F, -0.49F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3.5F, -0.49F, -2F, -3.5F); // Box 498 cull
		bodyModel[323].setRotationPoint(-38.5F, -4.5F, -8.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 109, 0, 5, 0F,0F, 0F, 0F, -54.5F, 0F, 0F, -54.5F, -0.75F, -2.5F, 0F, -0.75F, -2.5F, 0F, 0F, 0F, -54.5F, 0F, 0F, -54.5F, 0.75F, -2.5F, 0F, 0.75F, -2.5F); // Box 38
		bodyModel[324].setRotationPoint(-15.25F, -13.75F, 7.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 109, 0, 3, 0F,0F, 0F, 0F, -54.5F, 0F, 0F, -54.5F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, 0F, -54.5F, 0F, 0F, -54.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 38
		bodyModel[325].setRotationPoint(-15.25F, -13.75F, 7.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 109, 2, 0, 0F,0F, 0F, 0F, -54.5F, 0F, 0F, -54.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -54.5F, -0.5F, 0F, -54.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[326].setRotationPoint(-15.25F, -14.5F, 9.99F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 125, 0, 5, 0F,0F, -0.75F, -2.5F, -62.5F, -0.75F, -2.5F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -2.5F, -62.5F, 0.75F, -2.5F, -62.5F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[327].setRotationPoint(-23.25F, -13.75F, -12.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 125, 0, 3, 0F,0F, 0.75F, -0.5F, -62.5F, 0.75F, -0.5F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -62.5F, -0.75F, -0.5F, -62.5F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[328].setRotationPoint(-23.25F, -13.75F, -10.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 125, 2, 0, 0F,0F, 0F, 0F, -62.5F, 0F, 0F, -62.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -62.5F, -0.5F, 0F, -62.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
		bodyModel[329].setRotationPoint(-23.25F, -14.5F, -9.99F);

		bodyModel[330].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[330].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[331].setRotationPoint(34.5F, -8F, 7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[332].setRotationPoint(33F, -1F, 5F);

		bodyModel[333].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[334].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[335].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[336].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[336].rotateAngleY = -3.14159265F;

		bodyModel[337].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[337].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[337].rotateAngleY = -3.14159265F;

		bodyModel[338].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(24.5F, -8F, 7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[339].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(24.5F, -8F, -7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[341].setRotationPoint(23F, -1F, 5F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[342].setRotationPoint(23F, -1F, -9F);

		bodyModel[343].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[344].setRotationPoint(24.5F, -3F, 7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[346].setRotationPoint(24.5F, -3F, -7F);
		bodyModel[346].rotateAngleY = -3.14159265F;

		bodyModel[347].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[347].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[347].rotateAngleY = -3.14159265F;

		bodyModel[348].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[348].setRotationPoint(24.5F, -5F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[349].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[350].setRotationPoint(24.5F, -5F, -7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[351].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[352].setRotationPoint(14.5F, -8F, 7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[353].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[354].setRotationPoint(14.5F, -8F, -7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[355].setRotationPoint(13F, -1F, 5F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[356].setRotationPoint(13F, -1F, -9F);

		bodyModel[357].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[357].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[358].setRotationPoint(14.5F, -3F, 7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[360].setRotationPoint(14.5F, -3F, -7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[361].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[362].setRotationPoint(14.5F, -5F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[363].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[364].setRotationPoint(14.5F, -5F, -7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[365].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(4.5F, -8F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[367].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[368].setRotationPoint(4.5F, -8F, -7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[369].setRotationPoint(3F, -1F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[370].setRotationPoint(3F, -1F, -9F);

		bodyModel[371].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[372].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[373].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[374].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[375].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[376].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[377].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[378].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[379].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[380].setRotationPoint(-5.5F, -8F, 7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[381].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[382].setRotationPoint(-5.5F, -8F, -7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[383].setRotationPoint(-7F, -1F, 5F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[384].setRotationPoint(-7F, -1F, -9F);

		bodyModel[385].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[385].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[386].setRotationPoint(-5.5F, -3F, 7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[387].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[388].setRotationPoint(-5.5F, -3F, -7F);
		bodyModel[388].rotateAngleY = -3.14159265F;

		bodyModel[389].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[389].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[390].setRotationPoint(-5.5F, -5F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[391].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[392].setRotationPoint(-5.5F, -5F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[393].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[394].setRotationPoint(-15.5F, -8F, 7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[395].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[396].setRotationPoint(-15.5F, -8F, -7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[397].setRotationPoint(-17F, -1F, 5F);

		bodyModel[398].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[398].setRotationPoint(-17F, -1F, -9F);

		bodyModel[399].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[399].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[400].setRotationPoint(-15.5F, -3F, 7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[401].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[402].setRotationPoint(-15.5F, -3F, -7F);
		bodyModel[402].rotateAngleY = -3.14159265F;

		bodyModel[403].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[403].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[403].rotateAngleY = -3.14159265F;

		bodyModel[404].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[404].setRotationPoint(-15.5F, -5F, 7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[405].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull test
		bodyModel[406].setRotationPoint(-15.5F, -5F, -7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[407].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[408].setRotationPoint(34.5F, -8F, -7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[409].setRotationPoint(33F, -1F, -9F);

		bodyModel[410].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[410].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[411].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[412].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[413].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[414].setRotationPoint(-24F, -7F, -3F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11
		bodyModel[415].setRotationPoint(-24F, -18F, -1.5F);

		bodyModel[416].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[416].setRotationPoint(-20F, -17.75F, 0F);
		bodyModel[416].rotateAngleY = -0.78539816F;

		bodyModel[417].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[417].setRotationPoint(-20F, -17.25F, 0F);
		bodyModel[417].rotateAngleY = -0.78539816F;

		bodyModel[418].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[418].setRotationPoint(-12F, -17.75F, 0F);
		bodyModel[418].rotateAngleY = -0.78539816F;

		bodyModel[419].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[419].setRotationPoint(-12F, -17.25F, 0F);
		bodyModel[419].rotateAngleY = -0.78539816F;

		bodyModel[420].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[420].setRotationPoint(-4F, -17.75F, 0F);
		bodyModel[420].rotateAngleY = -0.78539816F;

		bodyModel[421].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[421].setRotationPoint(-4F, -17.25F, 0F);
		bodyModel[421].rotateAngleY = -0.78539816F;

		bodyModel[422].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[422].setRotationPoint(4F, -17.75F, 0F);
		bodyModel[422].rotateAngleY = -0.78539816F;

		bodyModel[423].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[423].setRotationPoint(4F, -17.25F, 0F);
		bodyModel[423].rotateAngleY = -0.78539816F;

		bodyModel[424].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[424].setRotationPoint(12F, -17.75F, 0F);
		bodyModel[424].rotateAngleY = -0.78539816F;

		bodyModel[425].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[425].setRotationPoint(12F, -17.25F, 0F);
		bodyModel[425].rotateAngleY = -0.78539816F;

		bodyModel[426].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[426].setRotationPoint(20F, -17.75F, 0F);
		bodyModel[426].rotateAngleY = -0.78539816F;

		bodyModel[427].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[427].setRotationPoint(20F, -17.25F, 0F);
		bodyModel[427].rotateAngleY = -0.78539816F;

		bodyModel[428].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[428].setRotationPoint(28F, -17.75F, 0F);
		bodyModel[428].rotateAngleY = -0.78539816F;

		bodyModel[429].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[429].setRotationPoint(28F, -17.25F, 0F);
		bodyModel[429].rotateAngleY = -0.78539816F;

		bodyModel[430].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11 glow
		bodyModel[430].setRotationPoint(36F, -17.75F, 0F);
		bodyModel[430].rotateAngleY = -0.78539816F;

		bodyModel[431].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 11 glow
		bodyModel[431].setRotationPoint(36F, -17.25F, 0F);
		bodyModel[431].rotateAngleY = -0.78539816F;

		bodyModel[432].addShapeBox(0F, 0F, 0F, 94, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[432].setRotationPoint(-47F, -12F, -9.9F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 94, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[433].setRotationPoint(-47F, -12F, 9.9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[434].setRotationPoint(51F, -16.5F, -3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 41
		bodyModel[435].setRotationPoint(0F, 3F, 8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[436].setRotationPoint(-0.5F, 3.2F, 8.5F);
		bodyModel[436].rotateAngleX = -0.78539816F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 41
		bodyModel[437].setRotationPoint(2.5F, 4.5F, 8.5F);
		bodyModel[437].rotateAngleX = -0.78539816F;

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 341
		bodyModel[438].setRotationPoint(2.5F, 3.75F, 8F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 341
		bodyModel[439].setRotationPoint(4.5F, 4.25F, 8.25F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // DRGW 1005,1007 underbody part
		bodyModel[440].setRotationPoint(-2F, 3F, 8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // DRGW 1005,1007 underbody part
		bodyModel[441].setRotationPoint(-2.5F, 3.2F, 8.5F);
		bodyModel[441].rotateAngleX = -0.78539816F;

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // DRGW 1005,1007 underbody part
		bodyModel[442].setRotationPoint(0.5F, 4.5F, 8.5F);
		bodyModel[442].rotateAngleX = -0.78539816F;

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // DRGW 1005,1007 underbody part
		bodyModel[443].setRotationPoint(0.5F, 3.75F, 8F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // DRGW 1005,1007 underbody part
		bodyModel[444].setRotationPoint(2.5F, 4.25F, 8.25F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // DRGW 1006? underbody part
		bodyModel[445].setRotationPoint(-1F, 3F, -9F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // DRGW 1006? underbody part
		bodyModel[446].setRotationPoint(-1.5F, 3.2F, -8.5F);
		bodyModel[446].rotateAngleX = -0.78539816F;

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // DRGW 1006? underbody part
		bodyModel[447].setRotationPoint(-2.5F, 4.5F, -8.5F);
		bodyModel[447].rotateAngleX = -0.78539816F;

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // DRGW 1006? underbody part
		bodyModel[448].setRotationPoint(-3.5F, 3.75F, -9F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // DRGW 1006? underbody part
		bodyModel[449].setRotationPoint(-5.5F, 4.25F, -9.25F);
	}
	ModelP_S_Truck bogie1 = new ModelP_S_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 450; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(GetColor(entity)==12345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/P_S_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.4, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(4.8, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/P_S_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.4, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(4.8, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}