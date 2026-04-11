//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPSCombine extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCombine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[541];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 340, 104, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 202, 173, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 151, 163, textureX, textureY); // Box 52
		bodyModel[13] = new ModelRendererTurbo(this, 266, 174, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 141, 174, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 96, 172, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 74, 158, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 156, 177, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 176, 175, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 179, 177, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 199, 175, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 89, 157, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 91, 158, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 101, 158, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 219, 162, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 219, 160, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 239, 160, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 200, 162, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 216, 160, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[38] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[39] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[40] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[41] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[42] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[43] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[44] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[45] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[46] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[47] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[48] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[49] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[50] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[51] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[52] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[53] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[54] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[55] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[56] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[57] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[58] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[59] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[60] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[61] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[62] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[63] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[64] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[65] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[66] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[67] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[68] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[69] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[70] = new ModelRendererTurbo(this, 118, 68, textureX, textureY); // Box 38
		bodyModel[71] = new ModelRendererTurbo(this, 118, 87, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[77] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[85] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[86] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[88] = new ModelRendererTurbo(this, 320, 17, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 323, 59, textureX, textureY); // Box 190
		bodyModel[91] = new ModelRendererTurbo(this, 325, 55, textureX, textureY); // Box 191
		bodyModel[92] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 190
		bodyModel[93] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 144, 6, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[96] = new ModelRendererTurbo(this, 65, 19, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 107, 2, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 89, 2, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 89, 6, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 71, 1, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 71, 5, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 116, 15, textureX, textureY); // Box 210
		bodyModel[104] = new ModelRendererTurbo(this, 116, 11, textureX, textureY); // Box 211
		bodyModel[105] = new ModelRendererTurbo(this, 98, 15, textureX, textureY); // Box 212
		bodyModel[106] = new ModelRendererTurbo(this, 98, 11, textureX, textureY); // Box 213
		bodyModel[107] = new ModelRendererTurbo(this, 80, 15, textureX, textureY); // Box 214
		bodyModel[108] = new ModelRendererTurbo(this, 80, 11, textureX, textureY); // Box 215
		bodyModel[109] = new ModelRendererTurbo(this, 158, 15, textureX, textureY); // Box 210
		bodyModel[110] = new ModelRendererTurbo(this, 158, 11, textureX, textureY); // Box 211
		bodyModel[111] = new ModelRendererTurbo(this, 156, 5, textureX, textureY); // Box 211
		bodyModel[112] = new ModelRendererTurbo(this, 126, 13, textureX, textureY); // Box 212
		bodyModel[113] = new ModelRendererTurbo(this, 53, 86, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[114] = new ModelRendererTurbo(this, 9, 86, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[115] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 62, 85, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[119] = new ModelRendererTurbo(this, 62, 105, textureX, textureY); // Box 204
		bodyModel[120] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[121] = new ModelRendererTurbo(this, 53, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[122] = new ModelRendererTurbo(this, 9, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[123] = new ModelRendererTurbo(this, 54, 77, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[124] = new ModelRendererTurbo(this, 46, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[125] = new ModelRendererTurbo(this, 10, 77, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[126] = new ModelRendererTurbo(this, 16, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[127] = new ModelRendererTurbo(this, 35, 80, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[128] = new ModelRendererTurbo(this, 23, 80, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[129] = new ModelRendererTurbo(this, 27, 71, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[130] = new ModelRendererTurbo(this, 53, 103, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[131] = new ModelRendererTurbo(this, 9, 103, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[132] = new ModelRendererTurbo(this, 368, 86, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[133] = new ModelRendererTurbo(this, 412, 86, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[134] = new ModelRendererTurbo(this, 368, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[135] = new ModelRendererTurbo(this, 412, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[136] = new ModelRendererTurbo(this, 369, 77, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[137] = new ModelRendererTurbo(this, 375, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[138] = new ModelRendererTurbo(this, 413, 77, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[139] = new ModelRendererTurbo(this, 405, 82, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[140] = new ModelRendererTurbo(this, 382, 80, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[141] = new ModelRendererTurbo(this, 394, 80, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[142] = new ModelRendererTurbo(this, 386, 71, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[143] = new ModelRendererTurbo(this, 368, 103, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[144] = new ModelRendererTurbo(this, 412, 103, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[145] = new ModelRendererTurbo(this, 280, 243, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 297, 243, textureX, textureY); // Box 38
		bodyModel[147] = new ModelRendererTurbo(this, 212, 274, textureX, textureY); // Right seat part
		bodyModel[148] = new ModelRendererTurbo(this, 212, 284, textureX, textureY); // Right seat part
		bodyModel[149] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[150] = new ModelRendererTurbo(this, 192, 267, textureX, textureY); // Right seat part
		bodyModel[151] = new ModelRendererTurbo(this, 203, 287, textureX, textureY); // Right seat part
		bodyModel[152] = new ModelRendererTurbo(this, 203, 284, textureX, textureY); // Right seat part
		bodyModel[153] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[154] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[155] = new ModelRendererTurbo(this, 212, 312, textureX, textureY); // Left seat part
		bodyModel[156] = new ModelRendererTurbo(this, 212, 302, textureX, textureY); // Left seat part
		bodyModel[157] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[158] = new ModelRendererTurbo(this, 192, 295, textureX, textureY); // Left seat part
		bodyModel[159] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[160] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[161] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Left seat part
		bodyModel[162] = new ModelRendererTurbo(this, 203, 312, textureX, textureY); // Left seat part
		bodyModel[163] = new ModelRendererTurbo(this, 192, 277, textureX, textureY); // Right seat part
		bodyModel[164] = new ModelRendererTurbo(this, 192, 305, textureX, textureY); // Left seat part
		bodyModel[165] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Right seat part
		bodyModel[166] = new ModelRendererTurbo(this, 243, 284, textureX, textureY); // Right seat part
		bodyModel[167] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[168] = new ModelRendererTurbo(this, 223, 267, textureX, textureY); // Right seat part
		bodyModel[169] = new ModelRendererTurbo(this, 234, 287, textureX, textureY); // Right seat part
		bodyModel[170] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Right seat part
		bodyModel[171] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[172] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[173] = new ModelRendererTurbo(this, 243, 312, textureX, textureY); // Left seat part
		bodyModel[174] = new ModelRendererTurbo(this, 243, 302, textureX, textureY); // Left seat part
		bodyModel[175] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[176] = new ModelRendererTurbo(this, 223, 295, textureX, textureY); // Left seat part
		bodyModel[177] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[178] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[179] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Left seat part
		bodyModel[180] = new ModelRendererTurbo(this, 234, 312, textureX, textureY); // Left seat part
		bodyModel[181] = new ModelRendererTurbo(this, 223, 277, textureX, textureY); // Right seat part
		bodyModel[182] = new ModelRendererTurbo(this, 223, 305, textureX, textureY); // Left seat part
		bodyModel[183] = new ModelRendererTurbo(this, 274, 274, textureX, textureY); // Right seat part
		bodyModel[184] = new ModelRendererTurbo(this, 274, 284, textureX, textureY); // Right seat part
		bodyModel[185] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[186] = new ModelRendererTurbo(this, 254, 267, textureX, textureY); // Right seat part
		bodyModel[187] = new ModelRendererTurbo(this, 265, 287, textureX, textureY); // Right seat part
		bodyModel[188] = new ModelRendererTurbo(this, 265, 284, textureX, textureY); // Right seat part
		bodyModel[189] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[190] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[191] = new ModelRendererTurbo(this, 274, 312, textureX, textureY); // Left seat part
		bodyModel[192] = new ModelRendererTurbo(this, 274, 302, textureX, textureY); // Left seat part
		bodyModel[193] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[194] = new ModelRendererTurbo(this, 254, 295, textureX, textureY); // Left seat part
		bodyModel[195] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[196] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[197] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Left seat part
		bodyModel[198] = new ModelRendererTurbo(this, 265, 312, textureX, textureY); // Left seat part
		bodyModel[199] = new ModelRendererTurbo(this, 254, 277, textureX, textureY); // Right seat part
		bodyModel[200] = new ModelRendererTurbo(this, 254, 305, textureX, textureY); // Left seat part
		bodyModel[201] = new ModelRendererTurbo(this, 172, 197, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 161, 220, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 223, 220, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 224, 202, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 176, 225, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 238, 225, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 139, 200, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 150, 214, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 163, 211, textureX, textureY); // Conductor's door
		bodyModel[211] = new ModelRendererTurbo(this, 155, 203, textureX, textureY); // Box 38
		bodyModel[212] = new ModelRendererTurbo(this, 148, 203, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 193, 250, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 195, 337, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 193, 262, textureX, textureY); // Box 333
		bodyModel[216] = new ModelRendererTurbo(this, 195, 343, textureX, textureY); // Box 334
		bodyModel[217] = new ModelRendererTurbo(this, 196, 207, textureX, textureY); // Box 38
		bodyModel[218] = new ModelRendererTurbo(this, 195, 204, textureX, textureY); // Box 38
		bodyModel[219] = new ModelRendererTurbo(this, 202, 203, textureX, textureY); // Box 401
		bodyModel[220] = new ModelRendererTurbo(this, 210, 230, textureX, textureY); // Box 350
		bodyModel[221] = new ModelRendererTurbo(this, 209, 227, textureX, textureY); // Box 351
		bodyModel[222] = new ModelRendererTurbo(this, 216, 226, textureX, textureY); // Box 352
		bodyModel[223] = new ModelRendererTurbo(this, 27, 241, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 6, 221, textureX, textureY); // Box 38
		bodyModel[225] = new ModelRendererTurbo(this, 6, 199, textureX, textureY); // Box 360
		bodyModel[226] = new ModelRendererTurbo(this, 22, 239, textureX, textureY); // Box 38
		bodyModel[227] = new ModelRendererTurbo(this, 1, 221, textureX, textureY); // Box 38
		bodyModel[228] = new ModelRendererTurbo(this, 1, 197, textureX, textureY); // Box 363
		bodyModel[229] = new ModelRendererTurbo(this, 192, 325, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 195, 331, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[231] = new ModelRendererTurbo(this, 181, 274, textureX, textureY); // Right seat part
		bodyModel[232] = new ModelRendererTurbo(this, 181, 284, textureX, textureY); // Right seat part
		bodyModel[233] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[234] = new ModelRendererTurbo(this, 161, 267, textureX, textureY); // Right seat part
		bodyModel[235] = new ModelRendererTurbo(this, 172, 287, textureX, textureY); // Right seat part
		bodyModel[236] = new ModelRendererTurbo(this, 172, 284, textureX, textureY); // Right seat part
		bodyModel[237] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[238] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[239] = new ModelRendererTurbo(this, 181, 312, textureX, textureY); // Left seat part
		bodyModel[240] = new ModelRendererTurbo(this, 181, 302, textureX, textureY); // Left seat part
		bodyModel[241] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[242] = new ModelRendererTurbo(this, 161, 295, textureX, textureY); // Left seat part
		bodyModel[243] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[244] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[245] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Left seat part
		bodyModel[246] = new ModelRendererTurbo(this, 172, 312, textureX, textureY); // Left seat part
		bodyModel[247] = new ModelRendererTurbo(this, 161, 277, textureX, textureY); // Right seat part
		bodyModel[248] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Left seat part
		bodyModel[249] = new ModelRendererTurbo(this, 163, 250, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 163, 262, textureX, textureY); // Box 333
		bodyModel[252] = new ModelRendererTurbo(this, 169, 343, textureX, textureY); // Box 334
		bodyModel[253] = new ModelRendererTurbo(this, 160, 325, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 169, 331, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[255] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 141, 293, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 118, 245, textureX, textureY); // Box 128
		bodyModel[258] = new ModelRendererTurbo(this, 126, 284, textureX, textureY); // C&O bulkhead door
		bodyModel[259] = new ModelRendererTurbo(this, 89, 267, textureX, textureY); // Box 38
		bodyModel[260] = new ModelRendererTurbo(this, 106, 269, textureX, textureY); // Box 38
		bodyModel[261] = new ModelRendererTurbo(this, 79, 276, textureX, textureY); // Box 176
		bodyModel[262] = new ModelRendererTurbo(this, 78, 270, textureX, textureY); // Box 177
		bodyModel[263] = new ModelRendererTurbo(this, 78, 283, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 88, 310, textureX, textureY); // Box 405
		bodyModel[265] = new ModelRendererTurbo(this, 91, 303, textureX, textureY); // Box 406
		bodyModel[266] = new ModelRendererTurbo(this, 91, 296, textureX, textureY); // Box 407
		bodyModel[267] = new ModelRendererTurbo(this, 91, 291, textureX, textureY); // Box 408
		bodyModel[268] = new ModelRendererTurbo(this, 35, 301, textureX, textureY); // Box 405
		bodyModel[269] = new ModelRendererTurbo(this, 35, 309, textureX, textureY); // Box 405
		bodyModel[270] = new ModelRendererTurbo(this, 30, 295, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 25, 295, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 23, 275, textureX, textureY); // Box 413
		bodyModel[273] = new ModelRendererTurbo(this, 23, 283, textureX, textureY); // Box 414
		bodyModel[274] = new ModelRendererTurbo(this, 18, 269, textureX, textureY); // Box 415
		bodyModel[275] = new ModelRendererTurbo(this, 13, 269, textureX, textureY); // Box 416
		bodyModel[276] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 414
		bodyModel[277] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 414
		bodyModel[278] = new ModelRendererTurbo(this, 81, 294, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[279] = new ModelRendererTurbo(this, 72, 294, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[280] = new ModelRendererTurbo(this, 63, 294, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[281] = new ModelRendererTurbo(this, 15, 306, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[282] = new ModelRendererTurbo(this, 6, 309, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[283] = new ModelRendererTurbo(this, 46, 292, textureX, textureY); // Box 38
		bodyModel[284] = new ModelRendererTurbo(this, 17, 311, textureX, textureY); // Box 38
		bodyModel[285] = new ModelRendererTurbo(this, 17, 316, textureX, textureY); // Box 38
		bodyModel[286] = new ModelRendererTurbo(this, 15, 320, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[287] = new ModelRendererTurbo(this, 17, 292, textureX, textureY); // Box 429
		bodyModel[288] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Box 430
		bodyModel[289] = new ModelRendererTurbo(this, 15, 301, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[290] = new ModelRendererTurbo(this, 5, 292, textureX, textureY); // Box 414
		bodyModel[291] = new ModelRendererTurbo(this, 6, 300, textureX, textureY); // Box 414
		bodyModel[292] = new ModelRendererTurbo(this, 5, 304, textureX, textureY); // Box 414
		bodyModel[293] = new ModelRendererTurbo(this, 4, 284, textureX, textureY); // Box 414
		bodyModel[294] = new ModelRendererTurbo(this, 3, 289, textureX, textureY); // Folding table
		bodyModel[295] = new ModelRendererTurbo(this, 141, 354, textureX, textureY); // Box 38
		bodyModel[296] = new ModelRendererTurbo(this, 141, 380, textureX, textureY); // Box 38
		bodyModel[297] = new ModelRendererTurbo(this, 126, 371, textureX, textureY); // D&RGW bulkhead door
		bodyModel[298] = new ModelRendererTurbo(this, 97, 464, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 82, 458, textureX, textureY); // Box 128
		bodyModel[300] = new ModelRendererTurbo(this, 81, 334, textureX, textureY); // Box 128
		bodyModel[301] = new ModelRendererTurbo(this, 1, 491, textureX, textureY); // Box 128
		bodyModel[302] = new ModelRendererTurbo(this, 83, 348, textureX, textureY); // Box 128
		bodyModel[303] = new ModelRendererTurbo(this, 83, 342, textureX, textureY); // Box 177
		bodyModel[304] = new ModelRendererTurbo(this, 86, 476, textureX, textureY); // Front dorm door
		bodyModel[305] = new ModelRendererTurbo(this, 4, 334, textureX, textureY); // Box 128
		bodyModel[306] = new ModelRendererTurbo(this, 6, 348, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 6, 342, textureX, textureY); // Box 177
		bodyModel[308] = new ModelRendererTurbo(this, 1, 452, textureX, textureY); // Box 38
		bodyModel[309] = new ModelRendererTurbo(this, 62, 368, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 105, 368, textureX, textureY); // Box 38
		bodyModel[311] = new ModelRendererTurbo(this, 89, 373, textureX, textureY); // Box 128
		bodyModel[312] = new ModelRendererTurbo(this, 1, 438, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 95, 380, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 112, 386, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 95, 381, textureX, textureY); // Box 128
		bodyModel[316] = new ModelRendererTurbo(this, 17, 417, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 8, 417, textureX, textureY); // Steward door
		bodyModel[318] = new ModelRendererTurbo(this, 49, 417, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 38, 417, textureX, textureY); // Dorm door
		bodyModel[320] = new ModelRendererTurbo(this, 1, 485, textureX, textureY); // Box 128
		bodyModel[321] = new ModelRendererTurbo(this, 76, 355, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 107, 356, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 19, 440, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 96, 369, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 61, 360, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 62, 400, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 9, 387, textureX, textureY); // Box 38
		bodyModel[328] = new ModelRendererTurbo(this, 29, 371, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 29, 402, textureX, textureY); // Box 38
		bodyModel[330] = new ModelRendererTurbo(this, 67, 461, textureX, textureY); // Box 38
		bodyModel[331] = new ModelRendererTurbo(this, 34, 468, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 34, 463, textureX, textureY); // Box 38
		bodyModel[333] = new ModelRendererTurbo(this, 58, 457, textureX, textureY); // Box 38
		bodyModel[334] = new ModelRendererTurbo(this, 7, 368, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 28, 356, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 1, 364, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 26, 354, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 8, 399, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 29, 387, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Box 38
		bodyModel[341] = new ModelRendererTurbo(this, 27, 385, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 43, 457, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[343] = new ModelRendererTurbo(this, 2, 354, textureX, textureY, "lamp"); // Box 128 glow
		bodyModel[344] = new ModelRendererTurbo(this, 98, 359, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 100, 356, textureX, textureY); // Box 176
		bodyModel[346] = new ModelRendererTurbo(this, 64, 87, textureX, textureY); // Box 128
		bodyModel[347] = new ModelRendererTurbo(this, 96, 86, textureX, textureY); // Box 128
		bodyModel[348] = new ModelRendererTurbo(this, 95, 90, textureX, textureY); // Baggage door R
		bodyModel[349] = new ModelRendererTurbo(this, 64, 67, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 96, 66, textureX, textureY); // Box 192
		bodyModel[351] = new ModelRendererTurbo(this, 95, 70, textureX, textureY); // Baggage door L
		bodyModel[352] = new ModelRendererTurbo(this, 188, 202, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 187, 211, textureX, textureY); // Box 38
		bodyModel[354] = new ModelRendererTurbo(this, 192, 211, textureX, textureY); // Box 38
		bodyModel[355] = new ModelRendererTurbo(this, 200, 212, textureX, textureY); // Box 38
		bodyModel[356] = new ModelRendererTurbo(this, 202, 225, textureX, textureY); // Box 346
		bodyModel[357] = new ModelRendererTurbo(this, 201, 234, textureX, textureY); // Box 347
		bodyModel[358] = new ModelRendererTurbo(this, 206, 234, textureX, textureY); // Box 348
		bodyModel[359] = new ModelRendererTurbo(this, 214, 235, textureX, textureY); // Box 349
		bodyModel[360] = new ModelRendererTurbo(this, 143, 226, textureX, textureY); // Box 349
		bodyModel[361] = new ModelRendererTurbo(this, 152, 226, textureX, textureY); // Box 349
		bodyModel[362] = new ModelRendererTurbo(this, 159, 205, textureX, textureY); // Conductor's seat
		bodyModel[363] = new ModelRendererTurbo(this, 143, 221, textureX, textureY); // Box 349
		bodyModel[364] = new ModelRendererTurbo(this, 167, 203, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[365] = new ModelRendererTurbo(this, 144, 236, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 144, 247, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[367] = new ModelRendererTurbo(this, 144, 242, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 27, 354, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 31, 352, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 28, 385, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 32, 383, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 188, 190, textureX, textureY); // Box 128
		bodyModel[373] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[376] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[377] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[378] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[379] = new ModelRendererTurbo(this, 72, 41, textureX, textureY); // Box 128
		bodyModel[380] = new ModelRendererTurbo(this, 433, 45, textureX, textureY); // Box 128
		bodyModel[381] = new ModelRendererTurbo(this, 444, 61, textureX, textureY); // Box 128
		bodyModel[382] = new ModelRendererTurbo(this, 444, 90, textureX, textureY); // Box 176
		bodyModel[383] = new ModelRendererTurbo(this, 427, 68, textureX, textureY); // Box 128
		bodyModel[384] = new ModelRendererTurbo(this, 11, 221, textureX, textureY); // Box 128
		bodyModel[385] = new ModelRendererTurbo(this, 11, 199, textureX, textureY); // Box 177
		bodyModel[386] = new ModelRendererTurbo(this, 1, 205, textureX, textureY); // Box 128
		bodyModel[387] = new ModelRendererTurbo(this, 157, 188, textureX, textureY); // Box 128
		bodyModel[388] = new ModelRendererTurbo(this, 94, 239, textureX, textureY); // Box 128
		bodyModel[389] = new ModelRendererTurbo(this, 130, 188, textureX, textureY); // Box 177
		bodyModel[390] = new ModelRendererTurbo(this, 66, 245, textureX, textureY); // Box 128
		bodyModel[391] = new ModelRendererTurbo(this, 27, 187, textureX, textureY); // Box 193
		bodyModel[392] = new ModelRendererTurbo(this, 27, 235, textureX, textureY); // Box 128
		bodyModel[393] = new ModelRendererTurbo(this, 27, 227, textureX, textureY); // Box 128
		bodyModel[394] = new ModelRendererTurbo(this, 27, 194, textureX, textureY); // Box 192
		bodyModel[395] = new ModelRendererTurbo(this, 27, 232, textureX, textureY); // Box 128
		bodyModel[396] = new ModelRendererTurbo(this, 27, 191, textureX, textureY); // Box 194
		bodyModel[397] = new ModelRendererTurbo(this, 103, 187, textureX, textureY); // Box 193
		bodyModel[398] = new ModelRendererTurbo(this, 103, 235, textureX, textureY); // Box 128
		bodyModel[399] = new ModelRendererTurbo(this, 102, 227, textureX, textureY); // Box 128
		bodyModel[400] = new ModelRendererTurbo(this, 102, 194, textureX, textureY); // Box 192
		bodyModel[401] = new ModelRendererTurbo(this, 104, 232, textureX, textureY); // Box 128
		bodyModel[402] = new ModelRendererTurbo(this, 104, 191, textureX, textureY); // Box 194
		bodyModel[403] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 131, 259, textureX, textureY); // Box 222
		bodyModel[405] = new ModelRendererTurbo(this, 103, 247, textureX, textureY); // Box 128
		bodyModel[406] = new ModelRendererTurbo(this, 132, 256, textureX, textureY); // Box 128
		bodyModel[407] = new ModelRendererTurbo(this, 142, 258, textureX, textureY); // Box 526
		bodyModel[408] = new ModelRendererTurbo(this, 250, 202, textureX, textureY); // Box 170
		bodyModel[409] = new ModelRendererTurbo(this, 250, 206, textureX, textureY); // Box 528
		bodyModel[410] = new ModelRendererTurbo(this, 61, 330, textureX, textureY); // Box 170
		bodyModel[411] = new ModelRendererTurbo(this, 61, 326, textureX, textureY); // Box 528
		bodyModel[412] = new ModelRendererTurbo(this, 141, 358, textureX, textureY); // Box 128
		bodyModel[413] = new ModelRendererTurbo(this, 190, 370, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Box 222
		bodyModel[415] = new ModelRendererTurbo(this, 164, 360, textureX, textureY); // Box 128
		bodyModel[416] = new ModelRendererTurbo(this, 201, 367, textureX, textureY); // Box 128
		bodyModel[417] = new ModelRendererTurbo(this, 191, 367, textureX, textureY); // Box 526
		bodyModel[418] = new ModelRendererTurbo(this, 9, 391, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 12, 396, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 1, 496, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 183, 360, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 88, 370, textureX, textureY); // Box 176
		bodyModel[423] = new ModelRendererTurbo(this, 26, 446, textureX, textureY); // Box 176
		bodyModel[424] = new ModelRendererTurbo(this, 84, 377, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 28, 450, textureX, textureY); // Box 128
		bodyModel[426] = new ModelRendererTurbo(this, 87, 467, textureX, textureY); // Box 552
		bodyModel[427] = new ModelRendererTurbo(this, 87, 460, textureX, textureY); // Box 553
		bodyModel[428] = new ModelRendererTurbo(this, 26, 353, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 27, 384, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[432] = new ModelRendererTurbo(this, 63, 148, textureX, textureY); // Box 2
		bodyModel[433] = new ModelRendererTurbo(this, 71, 148, textureX, textureY); // Box 2
		bodyModel[434] = new ModelRendererTurbo(this, 65, 149, textureX, textureY); // Box 2
		bodyModel[435] = new ModelRendererTurbo(this, 65, 152, textureX, textureY); // Box 2
		bodyModel[436] = new ModelRendererTurbo(this, 63, 138, textureX, textureY); // Box 154
		bodyModel[437] = new ModelRendererTurbo(this, 71, 138, textureX, textureY); // Box 155
		bodyModel[438] = new ModelRendererTurbo(this, 65, 139, textureX, textureY); // Box 156
		bodyModel[439] = new ModelRendererTurbo(this, 65, 142, textureX, textureY); // Box 157
		bodyModel[440] = new ModelRendererTurbo(this, 431, 18, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 437, 35, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 409, 2, textureX, textureY); // Box 128
		bodyModel[443] = new ModelRendererTurbo(this, 430, 2, textureX, textureY); // Box 128
		bodyModel[444] = new ModelRendererTurbo(this, 416, 1, textureX, textureY); // Box 128
		bodyModel[445] = new ModelRendererTurbo(this, 423, 1, textureX, textureY); // Box 128
		bodyModel[446] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 424, 35, textureX, textureY); // Box 128
		bodyModel[448] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 444, 19, textureX, textureY); // Box 153
		bodyModel[450] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[451] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[452] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[453] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[456] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 128
		bodyModel[457] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[459] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[460] = new ModelRendererTurbo(this, 327, 52, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 30, 94, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 29, 11, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 176
		bodyModel[464] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 177
		bodyModel[467] = new ModelRendererTurbo(this, 43, 51, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 95, 406, textureX, textureY); // Box 38
		bodyModel[470] = new ModelRendererTurbo(this, 95, 404, textureX, textureY); // Box 452
		bodyModel[471] = new ModelRendererTurbo(this, 110, 414, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 110, 408, textureX, textureY); // Box 462
		bodyModel[473] = new ModelRendererTurbo(this, 165, 159, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 179, 158, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 38
		bodyModel[476] = new ModelRendererTurbo(this, 165, 155, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 183, 161, textureX, textureY); // Box 41
		bodyModel[478] = new ModelRendererTurbo(this, 188, 169, textureX, textureY); // Box 41
		bodyModel[479] = new ModelRendererTurbo(this, 192, 160, textureX, textureY); // Box 41
		bodyModel[480] = new ModelRendererTurbo(this, 184, 160, textureX, textureY); // Box 41
		bodyModel[481] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 41
		bodyModel[482] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 41
		bodyModel[483] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[484] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[485] = new ModelRendererTurbo(this, 257, 138, textureX, textureY); // Box 28
		bodyModel[486] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 29
		bodyModel[487] = new ModelRendererTurbo(this, 261, 148, textureX, textureY); // Box 2
		bodyModel[488] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 41
		bodyModel[489] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 2
		bodyModel[490] = new ModelRendererTurbo(this, 273, 151, textureX, textureY); // Box 2
		bodyModel[491] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[492] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[493] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[494] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[495] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[496] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[497] = new ModelRendererTurbo(this, 274, 138, textureX, textureY); // Box 24
		bodyModel[498] = new ModelRendererTurbo(this, 274, 141, textureX, textureY); // Box 25
		bodyModel[499] = new ModelRendererTurbo(this, 267, 138, textureX, textureY); // Box 26

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[4].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[6].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(43F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-45F, 4F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 2
		bodyModel[10].setRotationPoint(0.5F, 3F, 4F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Box 2
		bodyModel[11].setRotationPoint(14.5F, 3F, 4F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 52
		bodyModel[12].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 5, 4, 0F); // Box 2
		bodyModel[13].setRotationPoint(23.5F, 3F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 2
		bodyModel[14].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[15].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 59
		bodyModel[17].setRotationPoint(-28.5F, 3F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-24.5F, 3F, 7.25F);
		bodyModel[18].rotateAngleX = -0.78539816F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[19].setRotationPoint(-24.51F, 3F, 6.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[20].setRotationPoint(-16.49F, 3F, 6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[21].setRotationPoint(-15.5F, 3F, 7.25F);
		bodyModel[21].rotateAngleX = -0.78539816F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[22].setRotationPoint(-15.51F, 3F, 6.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[23].setRotationPoint(-7.49F, 3F, 6.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[24].setRotationPoint(-31F, 3F, 4F);
		bodyModel[24].rotateAngleZ = -0.78539816F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-31.5F, 3F, 3.99F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-31.5F, 3F, 9.01F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[27].setRotationPoint(23.5F, 4F, 0F);
		bodyModel[27].rotateAngleX = -0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[28].setRotationPoint(23.49F, 4F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[29].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(23.5F, 3F, -7F);
		bodyModel[30].rotateAngleX = -0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[31].setRotationPoint(23.49F, 3F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[32].setRotationPoint(29.51F, 3F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[33].rotateAngleX = -0.78539816F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[34].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-21F, 3F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[37].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[38].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[39].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[39].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[40].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[40].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[41].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[41].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[42].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[42].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[43].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[43].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[44].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[44].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[45].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[46].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[46].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[47].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[47].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[48].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[49].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[49].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[50].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[51].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[51].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[52].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[53].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[54].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[54].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[55].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[55].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[56].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[56].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[57].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[57].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[58].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[58].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[59].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[59].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[60].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[61].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[61].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[62].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[62].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[63].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[64].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[64].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[65].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[66].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[67].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[68].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[69].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[69].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 95, 16, 1, 0F); // Box 38
		bodyModel[70].setRotationPoint(-38.5F, -15F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 95, 16, 1, 0F); // Box 128
		bodyModel[71].setRotationPoint(-38.5F, -15F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[72].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[73].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[74].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[75].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[76].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[77].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[78].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[79].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[80].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[82].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[83].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[84].setRotationPoint(55.51F, -14F, -3F);

		bodyModel[85].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[85].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[86].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[87].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(44.5F, -18F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[89].setRotationPoint(44.5F, -18.5F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[90].setRotationPoint(41.5F, -18F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[91].setRotationPoint(41.5F, -18.5F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[92].setRotationPoint(41.5F, -18F, -11.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-10.5F, -18F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-10.5F, -18.5F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[95].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[96].addBox(0F, 0F, 0F, 125, 1, 2, 0F); // Box 128
		bodyModel[96].setRotationPoint(-62.5F, -21F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-26.5F, -19.5F, 5.85F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-26.5F, -20.25F, 3.85F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-41.5F, -19.5F, 5.85F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[100].setRotationPoint(-41.5F, -20.25F, 3.85F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-58.5F, -19.5F, 5.85F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(-58.5F, -20.25F, 3.85F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 210
		bodyModel[103].setRotationPoint(-21.5F, -19.5F, -7.85F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[104].setRotationPoint(-21.5F, -20.25F, -5.85F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 212
		bodyModel[105].setRotationPoint(-33.5F, -19.5F, -7.85F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[106].setRotationPoint(-33.5F, -20.25F, -5.85F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 214
		bodyModel[107].setRotationPoint(-50.5F, -19.5F, -7.85F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[108].setRotationPoint(-50.5F, -20.25F, -5.85F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 210
		bodyModel[109].setRotationPoint(-1.5F, -19.5F, -7.85F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[110].setRotationPoint(-1.5F, -20.25F, -5.85F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.15F, -0.01F, 0F, -0.15F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, -0.15F, -0.01F, -0.5F, -0.15F); // Box 211
		bodyModel[111].setRotationPoint(-1.5F, -20.75F, -4.85F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F); // Box 212
		bodyModel[112].setRotationPoint(-34.5F, -18.9F, -8.85F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[113].setRotationPoint(-62.5F, -15F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[114].setRotationPoint(-62.5F, -15F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(61F, -6F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[118].setRotationPoint(61F, -6F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[119].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[120].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[121].setRotationPoint(-62.5F, -16F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[122].setRotationPoint(-62.5F, -16F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[123].setRotationPoint(-62.5F, -17F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[124].setRotationPoint(-62.5F, -19F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[125].setRotationPoint(-62.5F, -17F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F); // Box 38 cull
		bodyModel[126].setRotationPoint(-62.5F, -19F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[127].setRotationPoint(-62.5F, -20F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38 cull
		bodyModel[128].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 38 cull
		bodyModel[129].setRotationPoint(-62.5F, -20F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38 cull
		bodyModel[130].setRotationPoint(-62.5F, -1F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 38 cull
		bodyModel[131].setRotationPoint(-62.5F, -1F, 9F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[132].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 38 cull
		bodyModel[133].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[134].setRotationPoint(61.5F, -16F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38 cull
		bodyModel[135].setRotationPoint(61.5F, -16F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[136].setRotationPoint(61.5F, -17F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[137].setRotationPoint(61.5F, -19F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38 cull
		bodyModel[138].setRotationPoint(61.5F, -17F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F); // Box 38 cull
		bodyModel[139].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[140].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38 cull
		bodyModel[141].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 38 cull
		bodyModel[142].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[143].setRotationPoint(61.5F, -1F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38 cull
		bodyModel[144].setRotationPoint(61.5F, -1F, 9F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[145].setRotationPoint(39.5F, -15F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[146].setRotationPoint(39.5F, -15F, -10F);

		bodyModel[147].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[147].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[147].rotateAngleY = -3.14159265F;

		bodyModel[148].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[148].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[148].rotateAngleY = -3.14159265F;

		bodyModel[149].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[149].setRotationPoint(11.5F, -3F, 7F);
		bodyModel[149].rotateAngleY = -3.14159265F;

		bodyModel[150].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[150].setRotationPoint(11.5F, -8F, 7F);
		bodyModel[150].rotateAngleY = -3.14159265F;

		bodyModel[151].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[151].setRotationPoint(11.5F, -4F, 7F);
		bodyModel[151].rotateAngleY = -3.14159265F;

		bodyModel[152].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[152].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[152].rotateAngleY = -3.14159265F;

		bodyModel[153].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[153].setRotationPoint(11.5F, -4F, 7F);
		bodyModel[153].rotateAngleY = -3.14159265F;

		bodyModel[154].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[154].setRotationPoint(11.5F, -5F, 7F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[155].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[156].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[157].setRotationPoint(11.5F, -3F, -7F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[158].setRotationPoint(11.5F, -8F, -7F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[159].setRotationPoint(11.5F, -4F, -7F);
		bodyModel[159].rotateAngleY = -3.14159265F;

		bodyModel[160].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[160].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[160].rotateAngleY = -3.14159265F;

		bodyModel[161].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[161].setRotationPoint(11.5F, -4F, -7F);
		bodyModel[161].rotateAngleY = -3.14159265F;

		bodyModel[162].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[162].setRotationPoint(11.5F, -5F, -7F);
		bodyModel[162].rotateAngleY = -3.14159265F;

		bodyModel[163].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[163].setRotationPoint(11.5F, -3F, 7F);
		bodyModel[163].rotateAngleY = -3.14159265F;

		bodyModel[164].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[164].setRotationPoint(11.5F, -3F, -7F);
		bodyModel[164].rotateAngleY = -3.14159265F;

		bodyModel[165].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[165].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[165].rotateAngleY = -3.14159265F;

		bodyModel[166].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[166].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[166].rotateAngleY = -3.14159265F;

		bodyModel[167].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[167].setRotationPoint(22.5F, -3F, 7F);
		bodyModel[167].rotateAngleY = -3.14159265F;

		bodyModel[168].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[168].setRotationPoint(22.5F, -8F, 7F);
		bodyModel[168].rotateAngleY = -3.14159265F;

		bodyModel[169].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[169].setRotationPoint(22.5F, -4F, 7F);
		bodyModel[169].rotateAngleY = -3.14159265F;

		bodyModel[170].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[170].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[170].rotateAngleY = -3.14159265F;

		bodyModel[171].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[171].setRotationPoint(22.5F, -4F, 7F);
		bodyModel[171].rotateAngleY = -3.14159265F;

		bodyModel[172].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[172].setRotationPoint(22.5F, -5F, 7F);
		bodyModel[172].rotateAngleY = -3.14159265F;

		bodyModel[173].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[173].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[173].rotateAngleY = -3.14159265F;

		bodyModel[174].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[174].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[174].rotateAngleY = -3.14159265F;

		bodyModel[175].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[175].setRotationPoint(22.5F, -3F, -7F);
		bodyModel[175].rotateAngleY = -3.14159265F;

		bodyModel[176].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[176].setRotationPoint(22.5F, -8F, -7F);
		bodyModel[176].rotateAngleY = -3.14159265F;

		bodyModel[177].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[177].setRotationPoint(22.5F, -4F, -7F);
		bodyModel[177].rotateAngleY = -3.14159265F;

		bodyModel[178].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[178].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[178].rotateAngleY = -3.14159265F;

		bodyModel[179].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[179].setRotationPoint(22.5F, -4F, -7F);
		bodyModel[179].rotateAngleY = -3.14159265F;

		bodyModel[180].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[180].setRotationPoint(22.5F, -5F, -7F);
		bodyModel[180].rotateAngleY = -3.14159265F;

		bodyModel[181].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[181].setRotationPoint(22.5F, -3F, 7F);
		bodyModel[181].rotateAngleY = -3.14159265F;

		bodyModel[182].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[182].setRotationPoint(22.5F, -3F, -7F);
		bodyModel[182].rotateAngleY = -3.14159265F;

		bodyModel[183].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[183].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[183].rotateAngleY = -3.14159265F;

		bodyModel[184].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[184].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[185].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[186].setRotationPoint(33.5F, -8F, 7F);
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[187].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[188].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[188].rotateAngleY = -3.14159265F;

		bodyModel[189].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[189].setRotationPoint(33.5F, -4F, 7F);
		bodyModel[189].rotateAngleY = -3.14159265F;

		bodyModel[190].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[190].setRotationPoint(33.5F, -5F, 7F);
		bodyModel[190].rotateAngleY = -3.14159265F;

		bodyModel[191].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[191].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[191].rotateAngleY = -3.14159265F;

		bodyModel[192].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[192].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[192].rotateAngleY = -3.14159265F;

		bodyModel[193].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[193].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[193].rotateAngleY = -3.14159265F;

		bodyModel[194].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[194].setRotationPoint(33.5F, -8F, -7F);
		bodyModel[194].rotateAngleY = -3.14159265F;

		bodyModel[195].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[195].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[195].rotateAngleY = -3.14159265F;

		bodyModel[196].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[196].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[196].rotateAngleY = -3.14159265F;

		bodyModel[197].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[197].setRotationPoint(33.5F, -4F, -7F);
		bodyModel[197].rotateAngleY = -3.14159265F;

		bodyModel[198].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[198].setRotationPoint(33.5F, -5F, -7F);
		bodyModel[198].rotateAngleY = -3.14159265F;

		bodyModel[199].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[199].setRotationPoint(33.5F, -3F, 7F);
		bodyModel[199].rotateAngleY = -3.14159265F;

		bodyModel[200].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[200].setRotationPoint(33.5F, -3F, -7F);
		bodyModel[200].rotateAngleY = -3.14159265F;

		bodyModel[201].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[201].setRotationPoint(44.5F, -15F, 4F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[202].setRotationPoint(45.5F, -15F, -10F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[203].setRotationPoint(50.5F, -15F, 4F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[204].setRotationPoint(50.5F, -15F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[205].setRotationPoint(44.5F, -15F, 3F);

		bodyModel[206].addBox(0F, 0F, 0F, 11, 16, 1, 0F); // Box 38
		bodyModel[206].setRotationPoint(40.5F, -15F, -4F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[207].setRotationPoint(51.5F, -15F, -5F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[208].setRotationPoint(40.5F, -15F, 3F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 38
		bodyModel[209].setRotationPoint(40.5F, -5F, 6F);

		bodyModel[210].addBox(0F, 0F, -1F, 3, 7, 1, 0F); // Conductor's door
		bodyModel[210].setRotationPoint(41.5F, -6F, 4F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 38
		bodyModel[211].setRotationPoint(41.5F, -15F, 3F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 38
		bodyModel[212].setRotationPoint(40.5F, -15F, 6F);

		bodyModel[213].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 38
		bodyModel[213].setRotationPoint(5.5F, -14F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(5.5F, -13F, 9F);

		bodyModel[215].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 333
		bodyModel[215].setRotationPoint(5.5F, -14F, -10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 334
		bodyModel[216].setRotationPoint(5.5F, -13F, -10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[217].setRotationPoint(48.68F, -2F, 6.78F);
		bodyModel[217].rotateAngleY = 0.78539816F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[218].setRotationPoint(49.03F, -1F, 7.84F);
		bodyModel[218].rotateAngleY = 0.78539816F;

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 401
		bodyModel[219].setRotationPoint(45.5F, -5F, 8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 350
		bodyModel[220].setRotationPoint(47.27F, -2F, -8.19F);
		bodyModel[220].rotateAngleY = -0.78539816F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[221].setRotationPoint(48.33F, -1F, -8.54F);
		bodyModel[221].rotateAngleY = -0.78539816F;

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 352
		bodyModel[222].setRotationPoint(49.5F, -5F, -6F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 38
		bodyModel[223].setRotationPoint(-38.5F, -17F, -9F);
		bodyModel[223].rotateAngleY = -0.78539816F;

		bodyModel[224].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 38
		bodyModel[224].setRotationPoint(-49F, -17F, -9F);
		bodyModel[224].rotateAngleY = -0.78539816F;

		bodyModel[225].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 360
		bodyModel[225].setRotationPoint(-49F, -17F, 8F);
		bodyModel[225].rotateAngleY = -0.78539816F;

		bodyModel[226].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 38
		bodyModel[226].setRotationPoint(-38.5F, -19F, -6F);
		bodyModel[226].rotateAngleY = -0.78539816F;

		bodyModel[227].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 38
		bodyModel[227].setRotationPoint(-49F, -19F, -6F);
		bodyModel[227].rotateAngleY = -0.78539816F;

		bodyModel[228].addBox(0F, 0F, 0F, 1, 20, 1, 0F); // Box 363
		bodyModel[228].setRotationPoint(-49F, -19F, 5F);
		bodyModel[228].rotateAngleY = -0.78539816F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[229].setRotationPoint(5.5F, -17F, -2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[230].setRotationPoint(5.5F, -16.5F, -0.5F);

		bodyModel[231].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[231].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[232].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[232].rotateAngleY = -3.14159265F;

		bodyModel[233].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[233].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[233].rotateAngleY = -3.14159265F;

		bodyModel[234].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[234].setRotationPoint(0.5F, -8F, 7F);
		bodyModel[234].rotateAngleY = -3.14159265F;

		bodyModel[235].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[235].setRotationPoint(0.5F, -4F, 7F);
		bodyModel[235].rotateAngleY = -3.14159265F;

		bodyModel[236].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[236].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[236].rotateAngleY = -3.14159265F;

		bodyModel[237].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[237].setRotationPoint(0.5F, -4F, 7F);
		bodyModel[237].rotateAngleY = -3.14159265F;

		bodyModel[238].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[238].setRotationPoint(0.5F, -5F, 7F);
		bodyModel[238].rotateAngleY = -3.14159265F;

		bodyModel[239].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[239].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[239].rotateAngleY = -3.14159265F;

		bodyModel[240].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[240].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[240].rotateAngleY = -3.14159265F;

		bodyModel[241].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[241].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[241].rotateAngleY = -3.14159265F;

		bodyModel[242].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[242].setRotationPoint(0.5F, -8F, -7F);
		bodyModel[242].rotateAngleY = -3.14159265F;

		bodyModel[243].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[243].setRotationPoint(0.5F, -4F, -7F);
		bodyModel[243].rotateAngleY = -3.14159265F;

		bodyModel[244].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[244].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[245].setRotationPoint(0.5F, -4F, -7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[246].setRotationPoint(0.5F, -5F, -7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[247].setRotationPoint(0.5F, -3F, 7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[248].setRotationPoint(0.5F, -3F, -7F);
		bodyModel[248].rotateAngleY = -3.14159265F;

		bodyModel[249].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 38
		bodyModel[249].setRotationPoint(-5.5F, -14F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[250].setRotationPoint(-5.5F, -13F, 9F);

		bodyModel[251].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Box 333
		bodyModel[251].setRotationPoint(-5.5F, -14F, -10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 334
		bodyModel[252].setRotationPoint(-5.5F, -13F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[253].setRotationPoint(-5.5F, -17F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[254].setRotationPoint(-5.5F, -16.5F, -0.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[255].setRotationPoint(-6.5F, -15F, 3F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[256].setRotationPoint(-6.5F, -15F, -10F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 128
		bodyModel[257].setRotationPoint(-6.5F, -16F, -10F);

		bodyModel[258].addBox(0F, 0F, -6F, 1, 16, 6, 0F); // C&O bulkhead door
		bodyModel[258].setRotationPoint(-6.5F, -15F, 3F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 38
		bodyModel[259].setRotationPoint(-11.5F, -16F, 3F);

		bodyModel[260].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 38
		bodyModel[260].setRotationPoint(-10.5F, -19F, 3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[261].setRotationPoint(-11.5F, -18F, 7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[262].setRotationPoint(-11.5F, -19F, 3F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 38
		bodyModel[263].setRotationPoint(-11.5F, -18F, 3F);

		bodyModel[264].addBox(0F, 0F, 0F, 10, 17, 6, 0F); // Box 405
		bodyModel[264].setRotationPoint(-16.5F, -16F, -10F);

		bodyModel[265].addBox(0F, 0F, 0F, 10, 2, 3, 0F); // Box 406
		bodyModel[265].setRotationPoint(-16.5F, -18F, -7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[266].setRotationPoint(-16.5F, -18F, -10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[267].setRotationPoint(-16.5F, -19F, -7F);

		bodyModel[268].addBox(0F, 0F, 0F, 20, 1, 6, 0F); // Box 405
		bodyModel[268].setRotationPoint(-36.5F, -12F, -10F);

		bodyModel[269].addBox(0F, 0F, 0F, 20, 1, 6, 0F); // Box 405
		bodyModel[269].setRotationPoint(-36.5F, -6F, -10F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 38
		bodyModel[270].setRotationPoint(-26.5F, -12F, -4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 38
		bodyModel[271].setRotationPoint(-36.5F, -11F, -5F);

		bodyModel[272].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 413
		bodyModel[272].setRotationPoint(-32.5F, -12F, 4F);

		bodyModel[273].addBox(0F, 0F, 0F, 21, 1, 6, 0F); // Box 414
		bodyModel[273].setRotationPoint(-32.5F, -6F, 4F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 415
		bodyModel[274].setRotationPoint(-22F, -12F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 416
		bodyModel[275].setRotationPoint(-32.5F, -11F, 4F);

		bodyModel[276].addBox(0F, 0F, 0F, 5, 14, 5, 0F); // Box 414
		bodyModel[276].setRotationPoint(-37.5F, -13F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[277].setRotationPoint(-37.5F, -15F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[278].setRotationPoint(-12.5F, -19F, -1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[279].setRotationPoint(-23.5F, -19F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[280].setRotationPoint(-34.5F, -19F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[281].setRotationPoint(-45.5F, -19F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[282].setRotationPoint(-55.5F, -19F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[283].setRotationPoint(-41F, -19F, -2F);

		bodyModel[284].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 38
		bodyModel[284].setRotationPoint(-43F, -19F, -7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.74F, 0.48F, 0F, -0.74F, 0.48F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[285].setRotationPoint(-43F, -16F, -7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[286].setRotationPoint(-43.5F, -14.86F, -7.96F);
		bodyModel[286].rotateAngleX = -0.2443461F;

		bodyModel[287].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 429
		bodyModel[287].setRotationPoint(-43F, -19F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.74F, 0.48F, 0F, -0.74F, 0.48F); // Box 430
		bodyModel[288].setRotationPoint(-43F, -16F, 6F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[289].setRotationPoint(-43.5F, -14.38F, 6.02F);
		bodyModel[289].rotateAngleX = 0.2443461F;

		bodyModel[290].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 414
		bodyModel[290].setRotationPoint(-57.5F, -13F, 8F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 414
		bodyModel[291].setRotationPoint(-57.5F, -8F, 9F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 414
		bodyModel[292].setRotationPoint(-57.5F, -6F, 8F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 414
		bodyModel[293].setRotationPoint(-60.5F, -10F, 9F);

		bodyModel[294].addBox(0F, 0F, -2F, 3, 0, 2, 0F); // Folding table
		bodyModel[294].setRotationPoint(-60.5F, -7F, 9F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[295].setRotationPoint(4.5F, -15F, 3F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[296].setRotationPoint(4.5F, -15F, -10F);

		bodyModel[297].addBox(0F, 0F, -6F, 1, 16, 6, 0F); // D&RGW bulkhead door
		bodyModel[297].setRotationPoint(4.5F, -15F, 3F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 16, 16, 0F); // Box 38
		bodyModel[298].setRotationPoint(-26.5F, -15F, -6F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 128
		bodyModel[299].setRotationPoint(-26.5F, -18F, -7F);

		bodyModel[300].addBox(0F, 0F, 0F, 32, 1, 6, 0F); // Box 128
		bodyModel[300].setRotationPoint(-26.5F, -19F, -3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[301].setRotationPoint(-26.5F, -16.25F, -10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[302].setRotationPoint(-26.5F, -19F, -7F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[303].setRotationPoint(-26.5F, -19F, 3F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Front dorm door
		bodyModel[304].setRotationPoint(-26.5F, -15F, -10F);

		bodyModel[305].addBox(0F, 0F, 0F, 32, 1, 6, 0F); // Box 128
		bodyModel[305].setRotationPoint(-58.5F, -19F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[306].setRotationPoint(-58.5F, -19F, -7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[307].setRotationPoint(-58.5F, -19F, 3F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[308].setRotationPoint(-18.5F, -15F, -5F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[309].setRotationPoint(-5.5F, -15F, -5F);

		bodyModel[310].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[310].setRotationPoint(-4.5F, -15F, 3F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 128
		bodyModel[311].setRotationPoint(-5.5F, -17F, 4F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 128
		bodyModel[312].setRotationPoint(-18.5F, -18F, -5F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[313].setRotationPoint(-0.5F, -15F, -10F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[314].setRotationPoint(0.5F, -15F, -4F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 128
		bodyModel[315].setRotationPoint(-0.5F, -18F, -7F);

		bodyModel[316].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[316].setRotationPoint(-22.5F, -15F, -6F);

		bodyModel[317].addBox(-3F, 0F, -1F, 3, 16, 1, 0F); // Steward door
		bodyModel[317].setRotationPoint(-22.5F, -15F, -5F);

		bodyModel[318].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[318].setRotationPoint(-9.5F, -15F, -6F);

		bodyModel[319].addBox(-4F, 0F, -1F, 4, 16, 1, 0F); // Dorm door
		bodyModel[319].setRotationPoint(-9.5F, -15F, -5F);

		bodyModel[320].addBox(0F, 0F, 0F, 25, 3, 2, 0F); // Box 128
		bodyModel[320].setRotationPoint(-25.5F, -18F, -7F);

		bodyModel[321].addBox(0F, 0F, 0F, 6, 3, 9, 0F); // Box 128
		bodyModel[321].setRotationPoint(-5.5F, -18F, -5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 128
		bodyModel[322].setRotationPoint(0.5F, -18F, -4F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 128
		bodyModel[323].setRotationPoint(-18.5F, -17F, -5F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 128
		bodyModel[324].setRotationPoint(-5.5F, -18F, 4F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[325].setRotationPoint(-9.5F, -18F, -5F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[326].setRotationPoint(-17.5F, -18F, -5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[327].setRotationPoint(-13.5F, -6F, 9F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[328].setRotationPoint(-9.5F, -3F, -2F);

		bodyModel[329].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[329].setRotationPoint(-17.5F, -3F, -2F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 19, 3, 0F); // Box 38
		bodyModel[330].setRotationPoint(-22.5F, -18F, -5F);

		bodyModel[331].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[331].setRotationPoint(-22.5F, -3F, -2F);

		bodyModel[332].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 38
		bodyModel[332].setRotationPoint(-25.5F, -3F, 7F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 38
		bodyModel[333].setRotationPoint(-25.5F, -18F, 2F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[334].setRotationPoint(-9.5F, -15F, -2F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[335].setRotationPoint(-9.5F, -9F, -2F);

		bodyModel[336].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 38
		bodyModel[336].setRotationPoint(-9.51F, -15F, -2F);

		bodyModel[337].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 38
		bodyModel[337].setRotationPoint(-9.51F, -17F, 8F);

		bodyModel[338].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[338].setRotationPoint(-17.5F, -15F, -2F);

		bodyModel[339].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 38
		bodyModel[339].setRotationPoint(-17.5F, -9F, -2F);

		bodyModel[340].addBox(0F, 0F, 0F, 0, 16, 3, 0F); // Box 38
		bodyModel[340].setRotationPoint(-13.49F, -15F, -2F);

		bodyModel[341].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 38
		bodyModel[341].setRotationPoint(-13.49F, -17F, 8F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[342].setRotationPoint(-22.5F, -18F, -2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128 glow
		bodyModel[343].setRotationPoint(-12F, -18F, 1F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 128
		bodyModel[344].setRotationPoint(-0.5F, -18F, 4F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176
		bodyModel[345].setRotationPoint(-0.5F, -18F, 7F);

		bodyModel[346].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 128
		bodyModel[346].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[347].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 128
		bodyModel[347].setRotationPoint(-47.5F, -15F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Baggage door R
		bodyModel[348].setRotationPoint(-47.5F, -13F, 10F);

		bodyModel[349].addBox(0F, 0F, 0F, 14, 16, 1, 0F); // Box 38
		bodyModel[349].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[350].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 192
		bodyModel[350].setRotationPoint(-47.5F, -15F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.01F, 0F, 0F, -0.01F); // Baggage door L
		bodyModel[351].setRotationPoint(-47.5F, -13F, -11F);

		bodyModel[352].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[352].setRotationPoint(45.5F, -6F, 4F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 38
		bodyModel[353].setRotationPoint(45.5F, -6F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[354].setRotationPoint(46.5F, -6F, 5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[355].setRotationPoint(49F, -5F, 8.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 346
		bodyModel[356].setRotationPoint(46.5F, -6F, -5F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 347
		bodyModel[357].setRotationPoint(46.5F, -6F, -6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[358].setRotationPoint(47.5F, -6F, -6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 349
		bodyModel[359].setRotationPoint(49F, -5F, -10.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[360].setRotationPoint(40.5F, -6F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		bodyModel[361].setRotationPoint(40.5F, -6.5F, -6F);

		bodyModel[362].addBox(-2F, -1F, 0F, 2, 1, 3, 0F); // Conductor's seat
		bodyModel[362].setRotationPoint(44.5F, -2F, 7F);
		bodyModel[362].rotateAngleZ = 1.57079633F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[363].setRotationPoint(40.5F, -15F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[364].setRotationPoint(42.5F, -15F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[365].setRotationPoint(41.5F, -3F, -7F);
		bodyModel[365].rotateAngleY = -0.78539816F;

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[366].setRotationPoint(41.5F, -2F, -7F);
		bodyModel[366].rotateAngleY = -0.78539816F;

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[367].setRotationPoint(41.5F, 0F, -7F);
		bodyModel[367].rotateAngleY = -0.78539816F;

		bodyModel[368].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 38
		bodyModel[368].setRotationPoint(-9.51F, -15F, 5F);

		bodyModel[369].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 38
		bodyModel[369].setRotationPoint(-9.51F, -18F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 38
		bodyModel[370].setRotationPoint(-13.49F, -15F, 5F);

		bodyModel[371].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 38
		bodyModel[371].setRotationPoint(-13.49F, -18F, 5F);

		bodyModel[372].addBox(0F, 0F, 0F, 56, 1, 6, 0F); // Box 128
		bodyModel[372].setRotationPoint(5.5F, -19F, -3F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[373].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[374].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[375].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[376].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[377].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[378].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[379].addBox(0F, 0F, 0F, 123, 1, 6, 0F); // Box 128
		bodyModel[379].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 22, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[380].setRotationPoint(39.5F, -17F, -7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[381].setRotationPoint(39.5F, -18F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[382].setRotationPoint(39.5F, -18F, 7F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 22, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[383].setRotationPoint(39.5F, -16.25F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 56, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[384].setRotationPoint(5.5F, -19F, -7F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 56, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[385].setRotationPoint(5.5F, -19F, 3F);

		bodyModel[386].addBox(0F, 0F, 0F, 56, 1, 14, 0F); // Box 128
		bodyModel[386].setRotationPoint(5.5F, -18F, -7F);

		bodyModel[387].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 128
		bodyModel[387].setRotationPoint(-6.5F, -19F, -3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[388].setRotationPoint(-6.5F, -19F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[389].setRotationPoint(-6.5F, -19F, 3F);

		bodyModel[390].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 128
		bodyModel[390].setRotationPoint(-6.5F, -18F, -7F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[391].setRotationPoint(5.5F, -16F, 8F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[392].setRotationPoint(5.5F, -16F, -10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[393].setRotationPoint(5.5F, -17F, -8.25F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[394].setRotationPoint(5.5F, -17F, 5.25F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[395].setRotationPoint(5.5F, -18F, -8.25F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[396].setRotationPoint(5.5F, -18F, 7.25F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[397].setRotationPoint(-5.5F, -16F, 8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[398].setRotationPoint(-5.5F, -16F, -10F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[399].setRotationPoint(-5.5F, -17F, -8.25F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[400].setRotationPoint(-5.5F, -17F, 5.25F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[401].setRotationPoint(-5.5F, -18F, -8.25F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[402].setRotationPoint(-5.5F, -18F, 7.25F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 38
		bodyModel[403].setRotationPoint(-6.5F, -17.42F, -10F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 222
		bodyModel[404].setRotationPoint(-6.5F, -17.42F, 8F);

		bodyModel[405].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 128
		bodyModel[405].setRotationPoint(-6.5F, -17F, -8F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[406].setRotationPoint(-6.5F, -18F, 7F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[407].setRotationPoint(-6.5F, -18F, -8F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 54, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[408].setRotationPoint(-60.5F, -16.85F, 9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 54, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[409].setRotationPoint(-60.5F, -16.85F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 170
		bodyModel[410].setRotationPoint(-6.5F, -16.85F, 9F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, 0F, -0.15F, -1F); // Box 528
		bodyModel[411].setRotationPoint(-6.5F, -16.85F, -10F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 128
		bodyModel[412].setRotationPoint(4.5F, -16F, -10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 38
		bodyModel[413].setRotationPoint(4.5F, -17.42F, -10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 222
		bodyModel[414].setRotationPoint(4.5F, -17.42F, 8F);

		bodyModel[415].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 128
		bodyModel[415].setRotationPoint(4.5F, -17F, -8F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[416].setRotationPoint(4.5F, -18F, 7F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[417].setRotationPoint(4.5F, -18F, -8F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[418].setRotationPoint(-13.5F, -4.5F, 9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 38
		bodyModel[419].setRotationPoint(-11.75F, -1.5F, 9.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 27, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[420].setRotationPoint(-26.5F, -18F, -10F);

		bodyModel[421].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 128
		bodyModel[421].setRotationPoint(4.5F, -18F, -7F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176
		bodyModel[422].setRotationPoint(-5.5F, -18F, 7F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176
		bodyModel[423].setRotationPoint(-18.5F, -18F, 7F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[424].setRotationPoint(-5.5F, -17F, 9F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[425].setRotationPoint(-18.5F, -17F, 9F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 552
		bodyModel[426].setRotationPoint(-26.5F, -16.25F, 7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 553
		bodyModel[427].setRotationPoint(-26.5F, -18F, 7F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[428].setRotationPoint(-9.51F, -17.5F, 8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[429].setRotationPoint(-13.49F, -17.5F, 8F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[430].setRotationPoint(56F, -6F, -12F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[431].setRotationPoint(56F, -6F, 11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		bodyModel[432].setRotationPoint(-40.49F, 3F, 10.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 2
		bodyModel[433].setRotationPoint(-38.51F, 3F, 10.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[434].setRotationPoint(-40.5F, 4.5F, 10.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[435].setRotationPoint(-40.5F, 6.5F, 10.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 154
		bodyModel[436].setRotationPoint(-40.49F, 3F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
		bodyModel[437].setRotationPoint(-38.51F, 3F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 156
		bodyModel[438].setRotationPoint(-40.5F, 4.5F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 157
		bodyModel[439].setRotationPoint(-40.5F, 6.5F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[440].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[441].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[442].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[443].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[444].setRotationPoint(63F, -14F, -5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[445].setRotationPoint(63F, -14F, 3F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[446].setRotationPoint(63F, 1F, -5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[447].setRotationPoint(63F, -15F, -5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[448].setRotationPoint(63F, -16F, -5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[449].setRotationPoint(63F, -16F, 0F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[450].setRotationPoint(-63F, -15F, -4F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[451].setRotationPoint(-63F, 1F, -4F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[452].setRotationPoint(-63F, -14F, -4F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(-63F, -14F, 3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[454].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[455].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[456].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[457].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[458].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[459].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[460].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.35F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[460].setRotationPoint(47F, -20.75F, -4.5F);
		bodyModel[460].rotateAngleY = -0.78539816F;

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[461].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[462].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[463].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[464].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[465].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[466].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[467].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 128
		bodyModel[467].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[468].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 128
		bodyModel[468].setRotationPoint(-61.5F, -19F, -3F);

		bodyModel[469].addBox(0F, 0F, 0F, 105, 1, 0, 0F); // Box 38
		bodyModel[469].setRotationPoint(-57.5F, -1.5F, -11.01F);

		bodyModel[470].addBox(0F, 0F, 0F, 105, 1, 0, 0F); // Box 452
		bodyModel[470].setRotationPoint(-57.5F, -1.5F, 11.01F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 45, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[471].setRotationPoint(-5.5F, -11F, -9.9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 45, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[472].setRotationPoint(-5.5F, -11F, 9.9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[473].setRotationPoint(15.25F, 4F, -10.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[474].setRotationPoint(19.25F, 4F, -10.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[475].setRotationPoint(18.25F, 4F, -10.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[476].setRotationPoint(14.25F, 3.75F, -10.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[477].setRotationPoint(15.55F, 4.2F, -10F);
		bodyModel[477].rotateAngleZ = -0.78539816F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[478].setRotationPoint(18.75F, 4.2F, -10F);
		bodyModel[478].rotateAngleZ = -0.78539816F;

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[479].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[480].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[481].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[482].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[483].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[484].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[485].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[486].setRotationPoint(53F, 4F, -11F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[487].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[488].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[489].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[490].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[491].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[492].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[493].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[494].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[495].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[496].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[497].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[498].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[499].setRotationPoint(54.5F, 3F, -11F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 267, 141, textureX, textureY); // Box 27
		bodyModel[501] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[502] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[503] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[504] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[505] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[506] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[507] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[508] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[509] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[510] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[511] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[512] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[513] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[514] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[515] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[516] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[517] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[518] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[519] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[520] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[521] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[522] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[523] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[524] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[525] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[526] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[527] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[528] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[529] = new ModelRendererTurbo(this, 62, 485, textureX, textureY); // Folding seat/bed
		bodyModel[530] = new ModelRendererTurbo(this, 64, 445, textureX, textureY); // Box 38
		bodyModel[531] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 60, 99, textureX, textureY); // Box 202
		bodyModel[533] = new ModelRendererTurbo(this, 93, 435, textureX, textureY); // Box 38
		bodyModel[534] = new ModelRendererTurbo(this, 88, 440, textureX, textureY); // Box 38
		bodyModel[535] = new ModelRendererTurbo(this, 125, 356, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 125, 357, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 195, 260, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[538] = new ModelRendererTurbo(this, 195, 248, textureX, textureY, "lamp"); // Box 285 glow
		bodyModel[539] = new ModelRendererTurbo(this, 165, 260, textureX, textureY, "lamp"); // Box 275 glow
		bodyModel[540] = new ModelRendererTurbo(this, 165, 248, textureX, textureY, "lamp"); // Box 285 glow

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[500].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[501].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[502].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[503].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[504].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[505].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[506].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[507].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[508].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[509].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[510].setRotationPoint(-26.5F, 4F, 10.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[511].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[512].setRotationPoint(33F, 4F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[513].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[514].setRotationPoint(-35F, 4F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[515].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[516].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[517].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[518].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[519].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[520].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[521].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[522].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[523].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[524].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[525].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[526].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[527].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[528].setRotationPoint(-55F, 4F, -11F);

		bodyModel[529].addBox(-0.5F, -3.5F, 0F, 1, 4, 12, 0F); // Folding seat/bed
		bodyModel[529].setRotationPoint(-19F, -3.5F, -2F);

		bodyModel[530].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 38
		bodyModel[530].setRotationPoint(-21.5F, -1F, -2F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[531].setRotationPoint(-38.5F, -6F, -12F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[532].setRotationPoint(-38.5F, -6F, 11F);

		bodyModel[533].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 38
		bodyModel[533].setRotationPoint(-26.5F, -15F, -10F);

		bodyModel[534].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 38
		bodyModel[534].setRotationPoint(-26.5F, -14F, -10F);

		bodyModel[535].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 128
		bodyModel[535].setRotationPoint(-0.5F, -17F, 4F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[536].setRotationPoint(-0.5F, -17F, 9F);

		bodyModel[537].addBox(0F, 0F, 0F, 34, 0, 1, 0F); // Box 275 glow
		bodyModel[537].setRotationPoint(5.5F, -12.99F, -8.5F);

		bodyModel[538].addBox(0F, 0F, 0F, 34, 0, 1, 0F); // Box 285 glow
		bodyModel[538].setRotationPoint(5.5F, -12.99F, 7.5F);

		bodyModel[539].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // Box 275 glow
		bodyModel[539].setRotationPoint(-5.5F, -12.99F, -8.5F);

		bodyModel[540].addBox(0F, 0F, 0F, 11, 0, 1, 0F); // Box 285 glow
		bodyModel[540].setRotationPoint(-5.5F, -12.99F, 7.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 541; i++)
		{
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if(GetColor(entity)==4 || GetColor(entity)==1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}