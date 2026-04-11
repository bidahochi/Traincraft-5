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

public class ModelPSSleeper565 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSSleeper565() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[615];

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
		bodyModel[14] = new ModelRendererTurbo(this, 139, 174, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 94, 173, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 72, 158, textureX, textureY); // Box 59
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
		bodyModel[33] = new ModelRendererTurbo(this, 165, 159, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 179, 158, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 165, 155, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 183, 161, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 188, 169, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 192, 160, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 184, 160, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 41
		bodyModel[43] = new ModelRendererTurbo(this, 150, 156, textureX, textureY); // Box 41
		bodyModel[44] = new ModelRendererTurbo(this, 150, 154, textureX, textureY); // Box 41
		bodyModel[45] = new ModelRendererTurbo(this, 162, 154, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 141, 162, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 256, 154, textureX, textureY); // Box 24
		bodyModel[48] = new ModelRendererTurbo(this, 249, 154, textureX, textureY); // Box 24
		bodyModel[49] = new ModelRendererTurbo(this, 331, 62, textureX, textureY); // Left step part
		bodyModel[50] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Left step part
		bodyModel[51] = new ModelRendererTurbo(this, 331, 68, textureX, textureY); // Left step part
		bodyModel[52] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Left step part
		bodyModel[53] = new ModelRendererTurbo(this, 331, 77, textureX, textureY); // Left step part
		bodyModel[54] = new ModelRendererTurbo(this, 322, 79, textureX, textureY); // Left step part
		bodyModel[55] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Left step part
		bodyModel[56] = new ModelRendererTurbo(this, 323, 74, textureX, textureY); // Left step part
		bodyModel[57] = new ModelRendererTurbo(this, 340, 79, textureX, textureY); // Left step part
		bodyModel[58] = new ModelRendererTurbo(this, 340, 77, textureX, textureY); // Left step part
		bodyModel[59] = new ModelRendererTurbo(this, 341, 74, textureX, textureY); // Left step part
		bodyModel[60] = new ModelRendererTurbo(this, 331, 74, textureX, textureY); // Left step part
		bodyModel[61] = new ModelRendererTurbo(this, 327, 81, textureX, textureY); // Left step part
		bodyModel[62] = new ModelRendererTurbo(this, 256, 163, textureX, textureY); // Box 144
		bodyModel[63] = new ModelRendererTurbo(this, 249, 163, textureX, textureY); // Box 145
		bodyModel[64] = new ModelRendererTurbo(this, 331, 87, textureX, textureY); // Right step part
		bodyModel[65] = new ModelRendererTurbo(this, 329, 90, textureX, textureY); // Right step part
		bodyModel[66] = new ModelRendererTurbo(this, 331, 93, textureX, textureY); // Right step part
		bodyModel[67] = new ModelRendererTurbo(this, 329, 96, textureX, textureY); // Right step part
		bodyModel[68] = new ModelRendererTurbo(this, 331, 102, textureX, textureY); // Right step part
		bodyModel[69] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Right step part
		bodyModel[70] = new ModelRendererTurbo(this, 322, 98, textureX, textureY); // Right step part
		bodyModel[71] = new ModelRendererTurbo(this, 323, 95, textureX, textureY); // Right step part
		bodyModel[72] = new ModelRendererTurbo(this, 340, 100, textureX, textureY); // Right step part
		bodyModel[73] = new ModelRendererTurbo(this, 340, 98, textureX, textureY); // Right step part
		bodyModel[74] = new ModelRendererTurbo(this, 341, 95, textureX, textureY); // Right step part
		bodyModel[75] = new ModelRendererTurbo(this, 331, 99, textureX, textureY); // Right step part
		bodyModel[76] = new ModelRendererTurbo(this, 327, 106, textureX, textureY); // Right step part
		bodyModel[77] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[78] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[79] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[80] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[81] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[87] = new ModelRendererTurbo(this, 55, 19, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[95] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[96] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[99] = new ModelRendererTurbo(this, 63, 403, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 63, 397, textureX, textureY); // Box 177
		bodyModel[101] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[103] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[104] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[105] = new ModelRendererTurbo(this, 320, 17, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 319, 22, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 323, 59, textureX, textureY); // Box 190
		bodyModel[108] = new ModelRendererTurbo(this, 327, 51, textureX, textureY); // Box 191
		bodyModel[109] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[114] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[115] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[116] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[117] = new ModelRendererTurbo(this, 394, 295, textureX, textureY); // Box 38
		bodyModel[118] = new ModelRendererTurbo(this, 336, 227, textureX, textureY); // Box 38
		bodyModel[119] = new ModelRendererTurbo(this, 507, 295, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 202, 227, textureX, textureY); // Box 38
		bodyModel[121] = new ModelRendererTurbo(this, 66, 234, textureX, textureY); // Box 38
		bodyModel[122] = new ModelRendererTurbo(this, 129, 222, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 275, 223, textureX, textureY); // Box 38
		bodyModel[124] = new ModelRendererTurbo(this, 324, 285, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 137, 285, textureX, textureY); // Box 38
		bodyModel[126] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 381, 291, textureX, textureY); // Box 38
		bodyModel[128] = new ModelRendererTurbo(this, 189, 294, textureX, textureY); // Box 38
		bodyModel[129] = new ModelRendererTurbo(this, 255, 280, textureX, textureY); // Box 38
		bodyModel[130] = new ModelRendererTurbo(this, 67, 280, textureX, textureY); // Box 38
		bodyModel[131] = new ModelRendererTurbo(this, 377, 212, textureX, textureY); // Box 38
		bodyModel[132] = new ModelRendererTurbo(this, 257, 226, textureX, textureY); // Box 38
		bodyModel[133] = new ModelRendererTurbo(this, 166, 198, textureX, textureY); // Box 225
		bodyModel[134] = new ModelRendererTurbo(this, 1, 191, textureX, textureY); // Box 225
		bodyModel[135] = new ModelRendererTurbo(this, 151, 193, textureX, textureY); // Box 38
		bodyModel[136] = new ModelRendererTurbo(this, 389, 274, textureX, textureY); // Box 38
		bodyModel[137] = new ModelRendererTurbo(this, 231, 360, textureX, textureY); // Box 38
		bodyModel[138] = new ModelRendererTurbo(this, 328, 355, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 299, 360, textureX, textureY); // Box 38
		bodyModel[140] = new ModelRendererTurbo(this, 216, 355, textureX, textureY); // Box 38
		bodyModel[141] = new ModelRendererTurbo(this, 356, 292, textureX, textureY); // Box 38
		bodyModel[142] = new ModelRendererTurbo(this, 173, 331, textureX, textureY); // Box 225
		bodyModel[143] = new ModelRendererTurbo(this, 153, 326, textureX, textureY); // Box 38
		bodyModel[144] = new ModelRendererTurbo(this, 168, 331, textureX, textureY); // Box 225
		bodyModel[145] = new ModelRendererTurbo(this, 264, 225, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 250, 326, textureX, textureY); // Box 38
		bodyModel[147] = new ModelRendererTurbo(this, 241, 331, textureX, textureY); // Box 38
		bodyModel[148] = new ModelRendererTurbo(this, 212, 336, textureX, textureY); // Box 38
		bodyModel[149] = new ModelRendererTurbo(this, 299, 227, textureX, textureY); // Box 38
		bodyModel[150] = new ModelRendererTurbo(this, 314, 231, textureX, textureY); // Box 38
		bodyModel[151] = new ModelRendererTurbo(this, 367, 295, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 341, 299, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 486, 223, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 176, 291, textureX, textureY); // Box 38
		bodyModel[155] = new ModelRendererTurbo(this, 206, 299, textureX, textureY); // Box 38
		bodyModel[156] = new ModelRendererTurbo(this, 214, 295, textureX, textureY); // Box 38
		bodyModel[157] = new ModelRendererTurbo(this, 171, 295, textureX, textureY); // Box 38
		bodyModel[158] = new ModelRendererTurbo(this, 153, 299, textureX, textureY); // Box 38
		bodyModel[159] = new ModelRendererTurbo(this, 203, 293, textureX, textureY); // Box 38
		bodyModel[160] = new ModelRendererTurbo(this, 159, 292, textureX, textureY); // Box 38
		bodyModel[161] = new ModelRendererTurbo(this, 191, 285, textureX, textureY); // Box 38
		bodyModel[162] = new ModelRendererTurbo(this, 124, 285, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 446, 217, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 1, 294, textureX, textureY); // Box 38
		bodyModel[165] = new ModelRendererTurbo(this, 18, 299, textureX, textureY); // Box 38
		bodyModel[166] = new ModelRendererTurbo(this, 26, 295, textureX, textureY); // Box 38
		bodyModel[167] = new ModelRendererTurbo(this, 481, 227, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 463, 231, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 15, 293, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 469, 224, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 3, 285, textureX, textureY); // Box 38
		bodyModel[172] = new ModelRendererTurbo(this, 434, 217, textureX, textureY); // Box 38
		bodyModel[173] = new ModelRendererTurbo(this, 304, 224, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 38
		bodyModel[175] = new ModelRendererTurbo(this, 312, 285, textureX, textureY); // Box 38
		bodyModel[176] = new ModelRendererTurbo(this, 345, 292, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 158, 298, textureX, textureY); // Box 38
		bodyModel[178] = new ModelRendererTurbo(this, 160, 303, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 468, 230, textureX, textureY); // Box 38
		bodyModel[180] = new ModelRendererTurbo(this, 470, 235, textureX, textureY); // Box 38
		bodyModel[181] = new ModelRendererTurbo(this, 305, 230, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 305, 235, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 346, 298, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 346, 303, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 66, 264, textureX, textureY); // upper bed
		bodyModel[186] = new ModelRendererTurbo(this, 4, 268, textureX, textureY); // lower rotating bed
		bodyModel[187] = new ModelRendererTurbo(this, 66, 248, textureX, textureY); // upper bed
		bodyModel[188] = new ModelRendererTurbo(this, 28, 260, textureX, textureY); // lower rotating bed
		bodyModel[189] = new ModelRendererTurbo(this, 70, 271, textureX, textureY); // upper bed cable front
		bodyModel[190] = new ModelRendererTurbo(this, 67, 271, textureX, textureY); // upper bed cable rear
		bodyModel[191] = new ModelRendererTurbo(this, 70, 265, textureX, textureY); // upper bed cable front
		bodyModel[192] = new ModelRendererTurbo(this, 67, 265, textureX, textureY); // upper bed cable rear
		bodyModel[193] = new ModelRendererTurbo(this, 459, 206, textureX, textureY); // upper bed
		bodyModel[194] = new ModelRendererTurbo(this, 434, 200, textureX, textureY); // lower rotating bed
		bodyModel[195] = new ModelRendererTurbo(this, 459, 190, textureX, textureY); // upper bed
		bodyModel[196] = new ModelRendererTurbo(this, 410, 192, textureX, textureY); // lower rotating bed
		bodyModel[197] = new ModelRendererTurbo(this, 492, 213, textureX, textureY); // upper bed cable front
		bodyModel[198] = new ModelRendererTurbo(this, 489, 213, textureX, textureY); // upper bed cable rear
		bodyModel[199] = new ModelRendererTurbo(this, 492, 207, textureX, textureY); // upper bed cable front
		bodyModel[200] = new ModelRendererTurbo(this, 489, 207, textureX, textureY); // upper bed cable rear
		bodyModel[201] = new ModelRendererTurbo(this, 43, 277, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 46, 290, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 49, 277, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 431, 209, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 428, 222, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 415, 209, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 53, 310, textureX, textureY); // seat sliding part
		bodyModel[208] = new ModelRendererTurbo(this, 49, 282, textureX, textureY); // seat backrest
		bodyModel[209] = new ModelRendererTurbo(this, 35, 299, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[210] = new ModelRendererTurbo(this, 35, 294, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[211] = new ModelRendererTurbo(this, 34, 304, textureX, textureY); // Box 128
		bodyModel[212] = new ModelRendererTurbo(this, 34, 309, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 27, 309, textureX, textureY); // Box 128
		bodyModel[214] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Box 128
		bodyModel[215] = new ModelRendererTurbo(this, 50, 297, textureX, textureY); // seat sliding part
		bodyModel[216] = new ModelRendererTurbo(this, 50, 288, textureX, textureY); // seat backrest
		bodyModel[217] = new ModelRendererTurbo(this, 413, 235, textureX, textureY); // seat sliding part
		bodyModel[218] = new ModelRendererTurbo(this, 415, 214, textureX, textureY); // seat backrest
		bodyModel[219] = new ModelRendererTurbo(this, 431, 231, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[220] = new ModelRendererTurbo(this, 431, 226, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[221] = new ModelRendererTurbo(this, 430, 236, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 430, 241, textureX, textureY); // Box 128
		bodyModel[223] = new ModelRendererTurbo(this, 423, 241, textureX, textureY); // Box 128
		bodyModel[224] = new ModelRendererTurbo(this, 423, 234, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 416, 229, textureX, textureY); // seat sliding part
		bodyModel[226] = new ModelRendererTurbo(this, 416, 220, textureX, textureY); // seat backrest
		bodyModel[227] = new ModelRendererTurbo(this, 172, 252, textureX, textureY); // upper bed
		bodyModel[228] = new ModelRendererTurbo(this, 192, 268, textureX, textureY); // lower rotating bed
		bodyModel[229] = new ModelRendererTurbo(this, 195, 250, textureX, textureY); // upper bed
		bodyModel[230] = new ModelRendererTurbo(this, 216, 260, textureX, textureY); // lower rotating bed
		bodyModel[231] = new ModelRendererTurbo(this, 199, 257, textureX, textureY); // upper bed cable front
		bodyModel[232] = new ModelRendererTurbo(this, 196, 257, textureX, textureY); // upper bed cable rear
		bodyModel[233] = new ModelRendererTurbo(this, 199, 251, textureX, textureY); // upper bed cable front
		bodyModel[234] = new ModelRendererTurbo(this, 196, 251, textureX, textureY); // upper bed cable rear
		bodyModel[235] = new ModelRendererTurbo(this, 231, 277, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 234, 290, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 237, 277, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // seat sliding part
		bodyModel[239] = new ModelRendererTurbo(this, 237, 282, textureX, textureY); // seat backrest
		bodyModel[240] = new ModelRendererTurbo(this, 223, 299, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[241] = new ModelRendererTurbo(this, 223, 294, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[242] = new ModelRendererTurbo(this, 222, 304, textureX, textureY); // Box 128
		bodyModel[243] = new ModelRendererTurbo(this, 222, 309, textureX, textureY); // Box 128
		bodyModel[244] = new ModelRendererTurbo(this, 215, 309, textureX, textureY); // Box 128
		bodyModel[245] = new ModelRendererTurbo(this, 215, 304, textureX, textureY); // Box 128
		bodyModel[246] = new ModelRendererTurbo(this, 238, 297, textureX, textureY); // seat sliding part
		bodyModel[247] = new ModelRendererTurbo(this, 238, 288, textureX, textureY); // seat backrest
		bodyModel[248] = new ModelRendererTurbo(this, 289, 206, textureX, textureY); // upper bed
		bodyModel[249] = new ModelRendererTurbo(this, 314, 200, textureX, textureY); // lower rotating bed
		bodyModel[250] = new ModelRendererTurbo(this, 289, 190, textureX, textureY); // upper bed
		bodyModel[251] = new ModelRendererTurbo(this, 338, 192, textureX, textureY); // lower rotating bed
		bodyModel[252] = new ModelRendererTurbo(this, 293, 213, textureX, textureY); // upper bed cable front
		bodyModel[253] = new ModelRendererTurbo(this, 290, 213, textureX, textureY); // upper bed cable rear
		bodyModel[254] = new ModelRendererTurbo(this, 293, 207, textureX, textureY); // upper bed cable front
		bodyModel[255] = new ModelRendererTurbo(this, 290, 207, textureX, textureY); // upper bed cable rear
		bodyModel[256] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 356, 222, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 359, 209, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 363, 242, textureX, textureY); // seat sliding part
		bodyModel[260] = new ModelRendererTurbo(this, 359, 214, textureX, textureY); // seat backrest
		bodyModel[261] = new ModelRendererTurbo(this, 345, 231, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[262] = new ModelRendererTurbo(this, 345, 226, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[263] = new ModelRendererTurbo(this, 344, 236, textureX, textureY); // Box 128
		bodyModel[264] = new ModelRendererTurbo(this, 344, 241, textureX, textureY); // Box 128
		bodyModel[265] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 128
		bodyModel[266] = new ModelRendererTurbo(this, 337, 236, textureX, textureY); // Box 128
		bodyModel[267] = new ModelRendererTurbo(this, 360, 229, textureX, textureY); // seat sliding part
		bodyModel[268] = new ModelRendererTurbo(this, 360, 220, textureX, textureY); // seat backrest
		bodyModel[269] = new ModelRendererTurbo(this, 149, 274, textureX, textureY); // upper bed
		bodyModel[270] = new ModelRendererTurbo(this, 124, 268, textureX, textureY); // lower rotating bed
		bodyModel[271] = new ModelRendererTurbo(this, 149, 258, textureX, textureY); // upper bed
		bodyModel[272] = new ModelRendererTurbo(this, 100, 260, textureX, textureY); // lower rotating bed
		bodyModel[273] = new ModelRendererTurbo(this, 182, 281, textureX, textureY); // upper bed cable front
		bodyModel[274] = new ModelRendererTurbo(this, 179, 281, textureX, textureY); // upper bed cable rear
		bodyModel[275] = new ModelRendererTurbo(this, 182, 275, textureX, textureY); // upper bed cable front
		bodyModel[276] = new ModelRendererTurbo(this, 179, 275, textureX, textureY); // upper bed cable rear
		bodyModel[277] = new ModelRendererTurbo(this, 121, 277, textureX, textureY); // Box 38
		bodyModel[278] = new ModelRendererTurbo(this, 118, 290, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 105, 277, textureX, textureY); // Box 38
		bodyModel[280] = new ModelRendererTurbo(this, 103, 303, textureX, textureY); // seat sliding part
		bodyModel[281] = new ModelRendererTurbo(this, 105, 282, textureX, textureY); // seat backrest
		bodyModel[282] = new ModelRendererTurbo(this, 121, 299, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[283] = new ModelRendererTurbo(this, 121, 294, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[284] = new ModelRendererTurbo(this, 120, 304, textureX, textureY); // Box 128
		bodyModel[285] = new ModelRendererTurbo(this, 120, 309, textureX, textureY); // Box 128
		bodyModel[286] = new ModelRendererTurbo(this, 113, 309, textureX, textureY); // Box 128
		bodyModel[287] = new ModelRendererTurbo(this, 113, 302, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 106, 297, textureX, textureY); // seat sliding part
		bodyModel[289] = new ModelRendererTurbo(this, 106, 288, textureX, textureY); // seat backrest
		bodyModel[290] = new ModelRendererTurbo(this, 337, 274, textureX, textureY); // upper bed
		bodyModel[291] = new ModelRendererTurbo(this, 312, 268, textureX, textureY); // lower rotating bed
		bodyModel[292] = new ModelRendererTurbo(this, 342, 258, textureX, textureY); // upper bed
		bodyModel[293] = new ModelRendererTurbo(this, 288, 260, textureX, textureY); // lower rotating bed
		bodyModel[294] = new ModelRendererTurbo(this, 370, 281, textureX, textureY); // upper bed cable front
		bodyModel[295] = new ModelRendererTurbo(this, 367, 281, textureX, textureY); // upper bed cable rear
		bodyModel[296] = new ModelRendererTurbo(this, 370, 275, textureX, textureY); // upper bed cable front
		bodyModel[297] = new ModelRendererTurbo(this, 367, 275, textureX, textureY); // upper bed cable rear
		bodyModel[298] = new ModelRendererTurbo(this, 309, 277, textureX, textureY); // Box 38
		bodyModel[299] = new ModelRendererTurbo(this, 306, 290, textureX, textureY); // Box 38
		bodyModel[300] = new ModelRendererTurbo(this, 293, 277, textureX, textureY); // Box 38
		bodyModel[301] = new ModelRendererTurbo(this, 291, 303, textureX, textureY); // seat sliding part
		bodyModel[302] = new ModelRendererTurbo(this, 293, 282, textureX, textureY); // seat backrest
		bodyModel[303] = new ModelRendererTurbo(this, 309, 299, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[304] = new ModelRendererTurbo(this, 309, 294, textureX, textureY, "cull"); // seat sliding part cull
		bodyModel[305] = new ModelRendererTurbo(this, 308, 304, textureX, textureY); // Box 128
		bodyModel[306] = new ModelRendererTurbo(this, 308, 309, textureX, textureY); // Box 128
		bodyModel[307] = new ModelRendererTurbo(this, 301, 309, textureX, textureY); // Box 128
		bodyModel[308] = new ModelRendererTurbo(this, 301, 302, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 294, 297, textureX, textureY); // seat sliding part
		bodyModel[310] = new ModelRendererTurbo(this, 294, 288, textureX, textureY); // seat backrest
		bodyModel[311] = new ModelRendererTurbo(this, 47, 226, textureX, textureY); // Box 38
		bodyModel[312] = new ModelRendererTurbo(this, 40, 229, textureX, textureY); // Box 38
		bodyModel[313] = new ModelRendererTurbo(this, 14, 224, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 27, 224, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 40, 238, textureX, textureY); // Box 38
		bodyModel[316] = new ModelRendererTurbo(this, 6, 230, textureX, textureY); // roomette bed rear
		bodyModel[317] = new ModelRendererTurbo(this, 33, 26, textureX, textureY); // Box 128
		bodyModel[318] = new ModelRendererTurbo(this, 42, 19, textureX, textureY); // Box 128
		bodyModel[319] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // roomette bed rear
		bodyModel[320] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // roomette bed rear
		bodyModel[321] = new ModelRendererTurbo(this, 27, 233, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 39, 33, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 1, 230, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 1, 234, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 71, 219, textureX, textureY); // Box 128
		bodyModel[326] = new ModelRendererTurbo(this, 119, 226, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 112, 229, textureX, textureY); // Box 38
		bodyModel[328] = new ModelRendererTurbo(this, 86, 224, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 99, 224, textureX, textureY); // Box 38
		bodyModel[330] = new ModelRendererTurbo(this, 110, 238, textureX, textureY); // Box 38
		bodyModel[331] = new ModelRendererTurbo(this, 76, 230, textureX, textureY); // roomette bed rear
		bodyModel[332] = new ModelRendererTurbo(this, 53, 229, textureX, textureY); // Box 128
		bodyModel[333] = new ModelRendererTurbo(this, 71, 242, textureX, textureY); // roomette bed rear
		bodyModel[334] = new ModelRendererTurbo(this, 71, 239, textureX, textureY); // roomette bed rear
		bodyModel[335] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 82, 236, textureX, textureY); // Box 128
		bodyModel[337] = new ModelRendererTurbo(this, 71, 230, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 71, 234, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 176, 237, textureX, textureY); // Box 128
		bodyModel[340] = new ModelRendererTurbo(this, 197, 230, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 197, 234, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 157, 233, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 12, 236, textureX, textureY); // Box 128
		bodyModel[344] = new ModelRendererTurbo(this, 170, 230, textureX, textureY); // roomette bed front
		bodyModel[345] = new ModelRendererTurbo(this, 191, 242, textureX, textureY); // roomette bed front
		bodyModel[346] = new ModelRendererTurbo(this, 193, 239, textureX, textureY); // roomette bed front
		bodyModel[347] = new ModelRendererTurbo(this, 171, 224, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 156, 224, textureX, textureY); // Box 38
		bodyModel[349] = new ModelRendererTurbo(this, 144, 226, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 151, 229, textureX, textureY); // Box 38
		bodyModel[351] = new ModelRendererTurbo(this, 144, 238, textureX, textureY); // Box 38
		bodyModel[352] = new ModelRendererTurbo(this, 288, 225, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 23, 191, textureX, textureY); // Box 128
		bodyModel[354] = new ModelRendererTurbo(this, 18, 196, textureX, textureY); // Box 128
		bodyModel[355] = new ModelRendererTurbo(this, 34, 207, textureX, textureY); // Box 128
		bodyModel[356] = new ModelRendererTurbo(this, 23, 201, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 23, 205, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 28, 201, textureX, textureY); // roomette bed rear
		bodyModel[359] = new ModelRendererTurbo(this, 23, 213, textureX, textureY); // roomette bed rear
		bodyModel[360] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // roomette bed rear
		bodyModel[361] = new ModelRendererTurbo(this, 49, 204, textureX, textureY); // Box 38
		bodyModel[362] = new ModelRendererTurbo(this, 69, 197, textureX, textureY); // Box 38
		bodyModel[363] = new ModelRendererTurbo(this, 62, 200, textureX, textureY); // Box 38
		bodyModel[364] = new ModelRendererTurbo(this, 36, 195, textureX, textureY); // Box 38
		bodyModel[365] = new ModelRendererTurbo(this, 49, 195, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 62, 209, textureX, textureY); // Box 38
		bodyModel[367] = new ModelRendererTurbo(this, 88, 205, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 93, 190, textureX, textureY); // Box 128
		bodyModel[369] = new ModelRendererTurbo(this, 75, 200, textureX, textureY); // Box 128
		bodyModel[370] = new ModelRendererTurbo(this, 104, 207, textureX, textureY); // Box 128
		bodyModel[371] = new ModelRendererTurbo(this, 98, 201, textureX, textureY); // roomette bed rear
		bodyModel[372] = new ModelRendererTurbo(this, 93, 213, textureX, textureY); // roomette bed rear
		bodyModel[373] = new ModelRendererTurbo(this, 93, 210, textureX, textureY); // roomette bed rear
		bodyModel[374] = new ModelRendererTurbo(this, 93, 201, textureX, textureY); // Box 128
		bodyModel[375] = new ModelRendererTurbo(this, 93, 205, textureX, textureY); // Box 128
		bodyModel[376] = new ModelRendererTurbo(this, 119, 204, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 141, 197, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 134, 200, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 132, 209, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 6, 353, textureX, textureY); // Box 128
		bodyModel[383] = new ModelRendererTurbo(this, 54, 360, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 47, 363, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 21, 358, textureX, textureY); // Box 38
		bodyModel[386] = new ModelRendererTurbo(this, 34, 358, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 45, 372, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 11, 364, textureX, textureY); // roomette bed rear
		bodyModel[389] = new ModelRendererTurbo(this, 6, 376, textureX, textureY); // roomette bed rear
		bodyModel[390] = new ModelRendererTurbo(this, 6, 373, textureX, textureY); // roomette bed rear
		bodyModel[391] = new ModelRendererTurbo(this, 32, 367, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 6, 364, textureX, textureY); // Box 128
		bodyModel[393] = new ModelRendererTurbo(this, 6, 368, textureX, textureY); // Box 128
		bodyModel[394] = new ModelRendererTurbo(this, 1, 368, textureX, textureY); // Box 128
		bodyModel[395] = new ModelRendererTurbo(this, 77, 368, textureX, textureY); // Box 38
		bodyModel[396] = new ModelRendererTurbo(this, 82, 353, textureX, textureY); // Box 128
		bodyModel[397] = new ModelRendererTurbo(this, 130, 360, textureX, textureY); // Box 38
		bodyModel[398] = new ModelRendererTurbo(this, 123, 363, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 97, 358, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 110, 358, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 121, 372, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 87, 364, textureX, textureY); // roomette bed rear
		bodyModel[403] = new ModelRendererTurbo(this, 64, 363, textureX, textureY); // Box 128
		bodyModel[404] = new ModelRendererTurbo(this, 82, 376, textureX, textureY); // roomette bed rear
		bodyModel[405] = new ModelRendererTurbo(this, 82, 373, textureX, textureY); // roomette bed rear
		bodyModel[406] = new ModelRendererTurbo(this, 108, 367, textureX, textureY); // Box 38
		bodyModel[407] = new ModelRendererTurbo(this, 93, 370, textureX, textureY); // Box 128
		bodyModel[408] = new ModelRendererTurbo(this, 82, 364, textureX, textureY); // Box 128
		bodyModel[409] = new ModelRendererTurbo(this, 82, 368, textureX, textureY); // Box 128
		bodyModel[410] = new ModelRendererTurbo(this, 153, 368, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 158, 353, textureX, textureY); // Box 128
		bodyModel[412] = new ModelRendererTurbo(this, 206, 360, textureX, textureY); // Box 38
		bodyModel[413] = new ModelRendererTurbo(this, 199, 363, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 173, 358, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 186, 358, textureX, textureY); // Box 38
		bodyModel[416] = new ModelRendererTurbo(this, 197, 372, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 163, 364, textureX, textureY); // roomette bed rear
		bodyModel[418] = new ModelRendererTurbo(this, 140, 363, textureX, textureY); // Box 128
		bodyModel[419] = new ModelRendererTurbo(this, 158, 376, textureX, textureY); // roomette bed rear
		bodyModel[420] = new ModelRendererTurbo(this, 158, 373, textureX, textureY); // roomette bed rear
		bodyModel[421] = new ModelRendererTurbo(this, 184, 367, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 169, 370, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 158, 364, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 158, 368, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 14, 338, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 19, 323, textureX, textureY); // Box 128
		bodyModel[427] = new ModelRendererTurbo(this, 30, 340, textureX, textureY); // Box 128
		bodyModel[428] = new ModelRendererTurbo(this, 24, 334, textureX, textureY); // roomette bed rear
		bodyModel[429] = new ModelRendererTurbo(this, 19, 346, textureX, textureY); // roomette bed rear
		bodyModel[430] = new ModelRendererTurbo(this, 19, 343, textureX, textureY); // roomette bed rear
		bodyModel[431] = new ModelRendererTurbo(this, 19, 334, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 19, 338, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 45, 337, textureX, textureY); // Box 38
		bodyModel[434] = new ModelRendererTurbo(this, 67, 330, textureX, textureY); // Box 38
		bodyModel[435] = new ModelRendererTurbo(this, 60, 333, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 34, 328, textureX, textureY); // Box 38
		bodyModel[437] = new ModelRendererTurbo(this, 47, 328, textureX, textureY); // Box 38
		bodyModel[438] = new ModelRendererTurbo(this, 58, 342, textureX, textureY); // Box 38
		bodyModel[439] = new ModelRendererTurbo(this, 90, 338, textureX, textureY); // Box 38
		bodyModel[440] = new ModelRendererTurbo(this, 95, 323, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 106, 340, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 100, 334, textureX, textureY); // roomette bed rear
		bodyModel[443] = new ModelRendererTurbo(this, 95, 346, textureX, textureY); // roomette bed rear
		bodyModel[444] = new ModelRendererTurbo(this, 95, 343, textureX, textureY); // roomette bed rear
		bodyModel[445] = new ModelRendererTurbo(this, 95, 334, textureX, textureY); // Box 128
		bodyModel[446] = new ModelRendererTurbo(this, 95, 338, textureX, textureY); // Box 128
		bodyModel[447] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 143, 330, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 136, 333, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 110, 328, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 123, 328, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 134, 342, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Box 128
		bodyModel[454] = new ModelRendererTurbo(this, 77, 333, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 144, 438, textureX, textureY); // Box 38
		bodyModel[456] = new ModelRendererTurbo(this, 193, 438, textureX, textureY); // Box 38
		bodyModel[457] = new ModelRendererTurbo(this, 143, 455, textureX, textureY); // Box 38
		bodyModel[458] = new ModelRendererTurbo(this, 365, 87, textureX, textureY); // Box 38
		bodyModel[459] = new ModelRendererTurbo(this, 373, 103, textureX, textureY); // Box 128
		bodyModel[460] = new ModelRendererTurbo(this, 372, 97, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 371, 91, textureX, textureY); // Box 128
		bodyModel[462] = new ModelRendererTurbo(this, 369, 83, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 365, 67, textureX, textureY); // Box 248
		bodyModel[464] = new ModelRendererTurbo(this, 373, 67, textureX, textureY); // Box 250
		bodyModel[465] = new ModelRendererTurbo(this, 372, 72, textureX, textureY); // Box 252
		bodyModel[466] = new ModelRendererTurbo(this, 371, 77, textureX, textureY); // Box 254
		bodyModel[467] = new ModelRendererTurbo(this, 389, 59, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 389, 98, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 402, 89, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 402, 69, textureX, textureY); // Box 128
		bodyModel[471] = new ModelRendererTurbo(this, 370, 86, textureX, textureY); // Box 38
		bodyModel[472] = new ModelRendererTurbo(this, 384, 102, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 413, 67, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 382, 90, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 380, 82, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 426, 69, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 411, 69, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 410, 57, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[480] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 153
		bodyModel[481] = new ModelRendererTurbo(this, 418, 45, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 426, 46, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 370, 66, textureX, textureY); // Box 247
		bodyModel[484] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 249
		bodyModel[485] = new ModelRendererTurbo(this, 382, 76, textureX, textureY); // Box 253
		bodyModel[486] = new ModelRendererTurbo(this, 412, 46, textureX, textureY); // Box 255
		bodyModel[487] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[488] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 5, 130, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[493] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[494] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[497] = new ModelRendererTurbo(this, 18, 132, textureX, textureY); // Box 128
		bodyModel[498] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 128
		bodyModel[499] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 128

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

		bodyModel[14].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 2
		bodyModel[14].setRotationPoint(-28.5F, 3F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 17, 4, 10, 0F); // Box 2
		bodyModel[15].setRotationPoint(-28.5F, 4F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-28.5F, 8F, -5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 59
		bodyModel[17].setRotationPoint(-28.5F, 3F, -10F);

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

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[33].setRotationPoint(15.25F, 4F, -10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[34].setRotationPoint(19.25F, 4F, -10.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[35].setRotationPoint(18.25F, 4F, -10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[36].setRotationPoint(14.25F, 3.75F, -10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[37].setRotationPoint(15.55F, 4.2F, -10F);
		bodyModel[37].rotateAngleZ = -0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[38].setRotationPoint(18.75F, 4.2F, -10F);
		bodyModel[38].rotateAngleZ = -0.78539816F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[39].setRotationPoint(15.05F, 3F, -5.99F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[40].setRotationPoint(15.05F, 3F, -9.99F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[41].setRotationPoint(18.25F, 3F, -5.99F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[42].setRotationPoint(18.25F, 3F, -9.99F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[43].setRotationPoint(-16.5F, 3F, -7.25F);
		bodyModel[43].rotateAngleX = -0.78539816F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[44].setRotationPoint(-16.51F, 3F, -7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[45].setRotationPoint(-12.49F, 3F, -7.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[46].setRotationPoint(-21F, 3F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[47].setRotationPoint(60.51F, 3F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 24
		bodyModel[48].setRotationPoint(56.49F, 3F, -9F);

		bodyModel[49].addShapeBox(0F, 1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[49].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[50].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[50].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[51].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[51].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[52].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[52].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[53].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[53].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[54].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[54].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[55].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[56].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[56].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[57].addShapeBox(0F, 1F, -3F, 0, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[57].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, -3F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[58].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[59].addShapeBox(0F, -3F, -3F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[59].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[60].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[61].addShapeBox(0F, 2F, -2.5F, 4, 0, 4, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, -0.5F, 0F, 1F, -0.5F); // Left step part
		bodyModel[61].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 144
		bodyModel[62].setRotationPoint(60.51F, 3F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 145
		bodyModel[63].setRotationPoint(56.49F, 3F, 8F);

		bodyModel[64].addShapeBox(0F, 1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[64].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[65].addShapeBox(0F, 1F, -1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[65].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[66].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[67].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[67].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[68].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[68].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[69].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[69].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[70].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[71].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[71].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[72].addShapeBox(0F, 1F, -1F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Right step part
		bodyModel[72].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, -1F, 0, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[73].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[74].addShapeBox(0F, -3F, 0F, 0, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[74].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[75].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[76].addShapeBox(0F, 2F, -1.5F, 4, 0, 4, 0F,0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[76].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[77].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[78].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[79].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[79].setRotationPoint(56.51F, -14F, -10.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[80].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[82].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[83].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[84].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[85].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[86].setRotationPoint(56.51F, -14F, 10.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 128
		bodyModel[87].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[88].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[89].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[90].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[91].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[92].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[93].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[94].setRotationPoint(55.51F, -14F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[95].setRotationPoint(-61.49F, -14F, -3F);

		bodyModel[96].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[96].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[98].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[100].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[101].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[102].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[103].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[104].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(44.5F, -18F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[106].setRotationPoint(44.5F, -18.5F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F); // Box 190
		bodyModel[107].setRotationPoint(45.5F, -18F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F); // Box 191
		bodyModel[108].setRotationPoint(45.5F, -18.5F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(56F, -6F, -12F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[110].setRotationPoint(61F, -6F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[113].setRotationPoint(56F, -6F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[114].setRotationPoint(61F, -6F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[115].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[116].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 55, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[117].setRotationPoint(-34.5F, -16F, 5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[118].setRotationPoint(-35.5F, -16F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[119].setRotationPoint(20.5F, -16F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 26, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[120].setRotationPoint(-60.5F, -16F, -4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[121].setRotationPoint(-52.5F, -12F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[122].setRotationPoint(-43.5F, -16F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[123].setRotationPoint(-33.5F, -16F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[124].setRotationPoint(18.5F, -13F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[125].setRotationPoint(0.5F, -13F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[126].setRotationPoint(-35.5F, -13F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[127].setRotationPoint(18.5F, -16F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[128].setRotationPoint(0.5F, -13F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[129].setRotationPoint(10.5F, -17F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[130].setRotationPoint(-7.5F, -17F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 18, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[131].setRotationPoint(-25.5F, -17F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[132].setRotationPoint(-34.5F, -16F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[133].setRotationPoint(-58.5F, -16F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[134].setRotationPoint(-60.5F, -16F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[135].setRotationPoint(-40.5F, -16F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[136].setRotationPoint(20.5F, -16F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 29, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[137].setRotationPoint(20.5F, -16F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[138].setRotationPoint(52.5F, -16F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[139].setRotationPoint(49.5F, -16F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[140].setRotationPoint(46.5F, -16F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[141].setRotationPoint(19.75F, -16F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 18, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[142].setRotationPoint(26.5F, -16F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[143].setRotationPoint(43.5F, -16F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[144].setRotationPoint(25.5F, -16F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 38
		bodyModel[145].setRotationPoint(-37.5F, -16F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[146].setRotationPoint(53.5F, -16F, 4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[147].setRotationPoint(50.5F, -16F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[148].setRotationPoint(44.5F, -8F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[149].setRotationPoint(-33.75F, -16F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[150].setRotationPoint(-33.75F, -12F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[151].setRotationPoint(18.75F, -16F, -5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[152].setRotationPoint(18.75F, -12F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[153].setRotationPoint(-16.25F, -16F, -5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 17, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[154].setRotationPoint(1.75F, -16F, -5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[155].setRotationPoint(2.25F, -12F, -5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[156].setRotationPoint(2.25F, -16F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[157].setRotationPoint(0.75F, -16F, -5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[158].setRotationPoint(0.75F, -12F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[159].setRotationPoint(2.5F, -13F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[160].setRotationPoint(0.5F, -13F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[161].setRotationPoint(0.5F, -16F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[162].setRotationPoint(3F, -16F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[163].setRotationPoint(-17.5F, -13F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[164].setRotationPoint(-17.5F, -13F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F); // Box 38
		bodyModel[165].setRotationPoint(-15.75F, -12F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[166].setRotationPoint(-15.75F, -16F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F); // Box 38
		bodyModel[167].setRotationPoint(-17.25F, -16F, -5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[168].setRotationPoint(-17.25F, -12F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[169].setRotationPoint(-15.5F, -13F, -5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[170].setRotationPoint(-17.5F, -13F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[171].setRotationPoint(-17.5F, -16F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[172].setRotationPoint(-15F, -16F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 38
		bodyModel[173].setRotationPoint(-33.5F, -13F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[174].setRotationPoint(-35.5F, -16F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[175].setRotationPoint(21F, -16F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[176].setRotationPoint(18.5F, -13F, -4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[177].setRotationPoint(0.5F, -7F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[178].setRotationPoint(1.5F, -6F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[179].setRotationPoint(-17.5F, -7F, -4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[180].setRotationPoint(-16.5F, -6F, -4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[181].setRotationPoint(-33.75F, -7F, -4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[182].setRotationPoint(-33.75F, -6F, -4F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[183].setRotationPoint(18.5F, -7F, -4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[184].setRotationPoint(19.5F, -6F, -4F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[185].setRotationPoint(-11.5F, -17F, -9F);

		bodyModel[186].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[186].setRotationPoint(-11.5F, -2.5F, 3.5F);
		bodyModel[186].rotateAngleX = -1.57079633F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[187].setRotationPoint(-11.5F, -17.5F, -9F);

		bodyModel[188].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[188].setRotationPoint(-11.5F, -2.5F, 3.5F);
		bodyModel[188].rotateAngleX = -1.57079633F;

		bodyModel[189].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[189].setRotationPoint(-11.51F, -17.5F, -8F);
		bodyModel[189].rotateAngleZ = -1.57079633F;

		bodyModel[190].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[190].setRotationPoint(-7.51F, -17.51F, -8F);
		bodyModel[190].rotateAngleZ = 1.57079633F;

		bodyModel[191].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[191].setRotationPoint(-11.51F, -17.5F, 4F);
		bodyModel[191].rotateAngleZ = -1.57079633F;

		bodyModel[192].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[192].setRotationPoint(-7.51F, -17.51F, 4F);
		bodyModel[192].rotateAngleZ = 1.57079633F;

		bodyModel[193].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[193].setRotationPoint(-24.5F, -17F, -9F);

		bodyModel[194].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[194].setRotationPoint(-24.5F, -2.5F, 3.5F);
		bodyModel[194].rotateAngleX = -1.57079633F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[195].setRotationPoint(-24.5F, -17.5F, -9F);

		bodyModel[196].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[196].setRotationPoint(-24.5F, -2.5F, 3.5F);
		bodyModel[196].rotateAngleX = -1.57079633F;

		bodyModel[197].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[197].setRotationPoint(-24.49F, -17.5F, -8F);
		bodyModel[197].rotateAngleZ = -1.57079633F;

		bodyModel[198].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[198].setRotationPoint(-20.49F, -17.51F, -8F);
		bodyModel[198].rotateAngleZ = 1.57079633F;

		bodyModel[199].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[199].setRotationPoint(-24.49F, -17.5F, 4F);
		bodyModel[199].rotateAngleZ = -1.57079633F;

		bodyModel[200].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[200].setRotationPoint(-20.49F, -17.51F, 4F);
		bodyModel[200].rotateAngleZ = 1.57079633F;

		bodyModel[201].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[201].setRotationPoint(-11.52F, -16F, 4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[202].setRotationPoint(-11.52F, -4F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[203].setRotationPoint(-11.5F, -1F, 3F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[204].setRotationPoint(-20.49F, -16F, 4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[205].setRotationPoint(-20.49F, -4F, 3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(-24.5F, -1F, 3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[207].setRotationPoint(-13F, -3F, -5F);

		bodyModel[208].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[208].setRotationPoint(-9F, -3F, -5F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[209].setRotationPoint(-12.5F, -4F, -6F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[210].setRotationPoint(-12.5F, -4F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[211].setRotationPoint(-13F, -2F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[212].setRotationPoint(-13F, -2F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[213].setRotationPoint(-13F, 0.99F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[214].setRotationPoint(-8.5F, 0.99F, -5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[215].setRotationPoint(-9F, -3F, -5F);

		bodyModel[216].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[216].setRotationPoint(-9F, -3F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[217].setRotationPoint(-23F, -3F, -5F);

		bodyModel[218].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[218].setRotationPoint(-19F, -3F, -5F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[219].setRotationPoint(-22.5F, -4F, -6F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[220].setRotationPoint(-22.5F, -4F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[221].setRotationPoint(-23F, -2F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[222].setRotationPoint(-23F, -2F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[223].setRotationPoint(-23F, 0.99F, -5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[224].setRotationPoint(-18.5F, 0.99F, -5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[225].setRotationPoint(-19F, -3F, -5F);

		bodyModel[226].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[226].setRotationPoint(-19F, -3F, -5F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[227].setRotationPoint(6.5F, -17F, -9F);

		bodyModel[228].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[228].setRotationPoint(6.5F, -2.5F, 3.5F);
		bodyModel[228].rotateAngleX = -1.57079633F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[229].setRotationPoint(6.5F, -17.5F, -9F);

		bodyModel[230].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[230].setRotationPoint(6.5F, -2.5F, 3.5F);
		bodyModel[230].rotateAngleX = -1.57079633F;

		bodyModel[231].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[231].setRotationPoint(6.49F, -17.5F, -8F);
		bodyModel[231].rotateAngleZ = -1.57079633F;

		bodyModel[232].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[232].setRotationPoint(10.49F, -17.51F, -8F);
		bodyModel[232].rotateAngleZ = 1.57079633F;

		bodyModel[233].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[233].setRotationPoint(6.49F, -17.5F, 4F);
		bodyModel[233].rotateAngleZ = -1.57079633F;

		bodyModel[234].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[234].setRotationPoint(10.49F, -17.51F, 4F);
		bodyModel[234].rotateAngleZ = 1.57079633F;

		bodyModel[235].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[235].setRotationPoint(6.48F, -16F, 4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[236].setRotationPoint(6.48F, -4F, 3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[237].setRotationPoint(6.5F, -1F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[238].setRotationPoint(5F, -3F, -5F);

		bodyModel[239].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[239].setRotationPoint(9F, -3F, -5F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[240].setRotationPoint(5.5F, -4F, -6F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[241].setRotationPoint(5.5F, -4F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[242].setRotationPoint(5F, -2F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[243].setRotationPoint(5F, -2F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[244].setRotationPoint(5F, 0.99F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[245].setRotationPoint(9.5F, 0.99F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[246].setRotationPoint(9F, -3F, -5F);

		bodyModel[247].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[247].setRotationPoint(9F, -3F, -5F);

		bodyModel[248].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[248].setRotationPoint(-29.5F, -17F, -9F);

		bodyModel[249].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[249].setRotationPoint(-29.5F, -2.5F, 3.5F);
		bodyModel[249].rotateAngleX = -1.57079633F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[250].setRotationPoint(-29.5F, -17.5F, -9F);

		bodyModel[251].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[251].setRotationPoint(-29.5F, -2.5F, 3.5F);
		bodyModel[251].rotateAngleX = -1.57079633F;

		bodyModel[252].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[252].setRotationPoint(-29.51F, -17.5F, -8F);
		bodyModel[252].rotateAngleZ = -1.57079633F;

		bodyModel[253].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[253].setRotationPoint(-25.51F, -17.51F, -8F);
		bodyModel[253].rotateAngleZ = 1.57079633F;

		bodyModel[254].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[254].setRotationPoint(-29.51F, -17.5F, 4F);
		bodyModel[254].rotateAngleZ = -1.57079633F;

		bodyModel[255].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[255].setRotationPoint(-25.51F, -17.51F, 4F);
		bodyModel[255].rotateAngleZ = 1.57079633F;

		bodyModel[256].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[256].setRotationPoint(-29.52F, -16F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[257].setRotationPoint(-29.52F, -4F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[258].setRotationPoint(-29.5F, -1F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[259].setRotationPoint(-31F, -3F, -5F);

		bodyModel[260].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[260].setRotationPoint(-27F, -3F, -5F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[261].setRotationPoint(-30.5F, -4F, -6F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[262].setRotationPoint(-30.5F, -4F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[263].setRotationPoint(-31F, -2F, -1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[264].setRotationPoint(-31F, -2F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[265].setRotationPoint(-31F, 0.99F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[266].setRotationPoint(-26.5F, 0.99F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[267].setRotationPoint(-27F, -3F, -5F);

		bodyModel[268].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[268].setRotationPoint(-27F, -3F, -5F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[269].setRotationPoint(-6.5F, -17F, -9F);

		bodyModel[270].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[270].setRotationPoint(-6.5F, -2.5F, 3.5F);
		bodyModel[270].rotateAngleX = -1.57079633F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[271].setRotationPoint(-6.5F, -17.5F, -9F);

		bodyModel[272].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[272].setRotationPoint(-6.5F, -2.5F, 3.5F);
		bodyModel[272].rotateAngleX = -1.57079633F;

		bodyModel[273].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[273].setRotationPoint(-6.49F, -17.5F, -8F);
		bodyModel[273].rotateAngleZ = -1.57079633F;

		bodyModel[274].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[274].setRotationPoint(-2.49F, -17.51F, -8F);
		bodyModel[274].rotateAngleZ = 1.57079633F;

		bodyModel[275].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[275].setRotationPoint(-6.49F, -17.5F, 4F);
		bodyModel[275].rotateAngleZ = -1.57079633F;

		bodyModel[276].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[276].setRotationPoint(-2.49F, -17.51F, 4F);
		bodyModel[276].rotateAngleZ = 1.57079633F;

		bodyModel[277].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[277].setRotationPoint(-2.49F, -16F, 4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[278].setRotationPoint(-2.49F, -4F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[279].setRotationPoint(-6.5F, -1F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[280].setRotationPoint(-5F, -3F, -5F);

		bodyModel[281].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[281].setRotationPoint(-1F, -3F, -5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[282].setRotationPoint(-4.5F, -4F, -6F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[283].setRotationPoint(-4.5F, -4F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[284].setRotationPoint(-5F, -2F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[285].setRotationPoint(-5F, -2F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[286].setRotationPoint(-5F, 0.99F, -5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[287].setRotationPoint(-0.5F, 0.99F, -5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[288].setRotationPoint(-1F, -3F, -5F);

		bodyModel[289].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[289].setRotationPoint(-1F, -3F, -5F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // upper bed
		bodyModel[290].setRotationPoint(11.5F, -17F, -9F);

		bodyModel[291].addBox(0F, -0.5F, -13.5F, 4, 1, 15, 0F); // lower rotating bed
		bodyModel[291].setRotationPoint(11.5F, -2.5F, 3.5F);
		bodyModel[291].rotateAngleX = -1.57079633F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // upper bed
		bodyModel[292].setRotationPoint(11.5F, -17.5F, -9F);

		bodyModel[293].addShapeBox(0F, -1F, -13.5F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // lower rotating bed
		bodyModel[293].setRotationPoint(11.5F, -2.5F, 3.5F);
		bodyModel[293].rotateAngleX = -1.57079633F;

		bodyModel[294].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[294].setRotationPoint(11.51F, -17.5F, -8F);
		bodyModel[294].rotateAngleZ = -1.57079633F;

		bodyModel[295].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[295].setRotationPoint(15.51F, -17.51F, -8F);
		bodyModel[295].rotateAngleZ = 1.57079633F;

		bodyModel[296].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable front
		bodyModel[296].setRotationPoint(11.51F, -17.5F, 4F);
		bodyModel[296].rotateAngleZ = -1.57079633F;

		bodyModel[297].addBox(0F, -5F, 0F, 0, 5, 1, 0F); // upper bed cable rear
		bodyModel[297].setRotationPoint(15.51F, -17.51F, 4F);
		bodyModel[297].rotateAngleZ = 1.57079633F;

		bodyModel[298].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 38
		bodyModel[298].setRotationPoint(15.51F, -16F, 4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[299].setRotationPoint(15.51F, -4F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[300].setRotationPoint(11.5F, -1F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // seat sliding part
		bodyModel[301].setRotationPoint(13F, -3F, -5F);

		bodyModel[302].addShapeBox(-0.4F, -5.5F, 0F, 2, 1, 4, 0F,-0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // seat backrest
		bodyModel[302].setRotationPoint(17F, -3F, -5F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[303].setRotationPoint(13.5F, -4F, -6F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // seat sliding part cull
		bodyModel[304].setRotationPoint(13.5F, -4F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[305].setRotationPoint(13F, -2F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -5F, -0.01F, 0F, -5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[306].setRotationPoint(13F, -2F, -6F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[307].setRotationPoint(13F, 0.99F, -5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[308].setRotationPoint(17.5F, 0.99F, -5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // seat sliding part
		bodyModel[309].setRotationPoint(17F, -3F, -5F);

		bodyModel[310].addShapeBox(0F, -4F, 0F, 1, 4, 4, 0F,-0.25F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // seat backrest
		bodyModel[310].setRotationPoint(17F, -3F, -5F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[311].setRotationPoint(-54.5F, -6F, -5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[312].setRotationPoint(-54.5F, -6F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[313].setRotationPoint(-55F, -2F, -9F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[314].setRotationPoint(-55F, -3F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[315].setRotationPoint(-54.5F, -13F, -10F);

		bodyModel[316].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[316].setRotationPoint(-61F, -3.5F, -10F);
		bodyModel[316].rotateAngleZ = 1.57079633F;

		bodyModel[317].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 128
		bodyModel[317].setRotationPoint(-61.5F, -15F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[318].setRotationPoint(-61.5F, -12F, -10F);

		bodyModel[319].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[319].setRotationPoint(-61F, -3.5F, -6F);
		bodyModel[319].rotateAngleZ = 1.57079633F;

		bodyModel[320].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[320].setRotationPoint(-61F, -3.5F, -6F);
		bodyModel[320].rotateAngleZ = 1.57079633F;

		bodyModel[321].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[321].setRotationPoint(-60.5F, -3F, -10F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[322].setRotationPoint(-61.5F, -3F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[323].setRotationPoint(-61.5F, -12F, -6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[324].setRotationPoint(-61.5F, -10F, -6F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[325].setRotationPoint(-52.5F, -16F, -10F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[326].setRotationPoint(-45.5F, -6F, -5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[327].setRotationPoint(-45.5F, -6F, -6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[328].setRotationPoint(-46F, -2F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[329].setRotationPoint(-46F, -3F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[330].setRotationPoint(-45.5F, -13F, -10F);

		bodyModel[331].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[331].setRotationPoint(-52F, -3.5F, -10F);
		bodyModel[331].rotateAngleZ = 1.57079633F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[332].setRotationPoint(-52.5F, -12F, -10F);

		bodyModel[333].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[333].setRotationPoint(-52F, -3.5F, -6F);
		bodyModel[333].rotateAngleZ = 1.57079633F;

		bodyModel[334].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[334].setRotationPoint(-52F, -3.5F, -6F);
		bodyModel[334].rotateAngleZ = 1.57079633F;

		bodyModel[335].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[335].setRotationPoint(-51.5F, -3F, -10F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[336].setRotationPoint(-52.5F, -3F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[337].setRotationPoint(-52.5F, -12F, -6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[338].setRotationPoint(-52.5F, -10F, -6F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[339].setRotationPoint(-34.5F, -16F, -10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[340].setRotationPoint(-34.5F, -12F, -6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[341].setRotationPoint(-34.5F, -10F, -6F);

		bodyModel[342].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[342].setRotationPoint(-37.5F, -3F, -10F);

		bodyModel[343].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[343].setRotationPoint(-34.5F, -3F, -10F);

		bodyModel[344].addShapeBox(-8.5F, -0.5F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed front
		bodyModel[344].setRotationPoint(-34F, -3.5F, -10F);
		bodyModel[344].rotateAngleZ = -1.57079633F;

		bodyModel[345].addShapeBox(-3.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed front
		bodyModel[345].setRotationPoint(-34F, -3.5F, -6F);
		bodyModel[345].rotateAngleZ = -1.57079633F;

		bodyModel[346].addShapeBox(-6.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // roomette bed front
		bodyModel[346].setRotationPoint(-34F, -3.5F, -6F);
		bodyModel[346].rotateAngleZ = -1.57079633F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[347].setRotationPoint(-42.5F, -2F, -9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[348].setRotationPoint(-42.5F, -3F, -10F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[349].setRotationPoint(-42.5F, -6F, -5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[350].setRotationPoint(-42.5F, -6F, -6F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[351].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[352].setRotationPoint(-35.5F, -16F, -3F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[353].setRotationPoint(-58.5F, -16F, 5F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 128
		bodyModel[354].setRotationPoint(-58.5F, -16F, 4F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 128
		bodyModel[355].setRotationPoint(-58.5F, -3F, 5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[356].setRotationPoint(-58.5F, -12F, 5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[357].setRotationPoint(-58.5F, -10F, 5F);

		bodyModel[358].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[358].setRotationPoint(-58F, -3.5F, 6F);
		bodyModel[358].rotateAngleZ = 1.57079633F;

		bodyModel[359].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[359].setRotationPoint(-58F, -3.5F, 5F);
		bodyModel[359].rotateAngleZ = 1.57079633F;

		bodyModel[360].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[360].setRotationPoint(-58F, -3.5F, 5F);
		bodyModel[360].rotateAngleZ = 1.57079633F;

		bodyModel[361].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[361].setRotationPoint(-57.5F, -3F, 4F);

		bodyModel[362].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[362].setRotationPoint(-51.5F, -6F, 4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[363].setRotationPoint(-51.5F, -6F, 5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[364].setRotationPoint(-52F, -2F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[365].setRotationPoint(-52F, -3F, 7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[366].setRotationPoint(-51.5F, -13F, 4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[367].setRotationPoint(-49.5F, -12F, 4F);

		bodyModel[368].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[368].setRotationPoint(-49.5F, -16F, 4F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[369].setRotationPoint(-49.5F, -12F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[370].setRotationPoint(-49.5F, -3F, 4F);

		bodyModel[371].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[371].setRotationPoint(-49F, -3.5F, 6F);
		bodyModel[371].rotateAngleZ = 1.57079633F;

		bodyModel[372].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[372].setRotationPoint(-49F, -3.5F, 5F);
		bodyModel[372].rotateAngleZ = 1.57079633F;

		bodyModel[373].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[373].setRotationPoint(-49F, -3.5F, 5F);
		bodyModel[373].rotateAngleZ = 1.57079633F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[374].setRotationPoint(-49.5F, -12F, 5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[375].setRotationPoint(-49.5F, -10F, 5F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[376].setRotationPoint(-48.5F, -3F, 4F);

		bodyModel[377].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[377].setRotationPoint(-42.5F, -6F, 4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[378].setRotationPoint(-42.5F, -6F, 5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[379].setRotationPoint(-43F, -2F, 7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[380].setRotationPoint(-43F, -3F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[381].setRotationPoint(-42.5F, -13F, 4F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[382].setRotationPoint(19.5F, -16F, -10F);

		bodyModel[383].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[383].setRotationPoint(26.5F, -6F, -5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[384].setRotationPoint(26.5F, -6F, -6F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[385].setRotationPoint(26F, -2F, -9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[386].setRotationPoint(26F, -3F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[387].setRotationPoint(26.5F, -13F, -10F);

		bodyModel[388].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[388].setRotationPoint(20F, -3.5F, -10F);
		bodyModel[388].rotateAngleZ = 1.57079633F;

		bodyModel[389].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[389].setRotationPoint(20F, -3.5F, -6F);
		bodyModel[389].rotateAngleZ = 1.57079633F;

		bodyModel[390].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[390].setRotationPoint(20F, -3.5F, -6F);
		bodyModel[390].rotateAngleZ = 1.57079633F;

		bodyModel[391].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[391].setRotationPoint(20.5F, -3F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[392].setRotationPoint(19.5F, -12F, -6F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[393].setRotationPoint(19.5F, -10F, -6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[394].setRotationPoint(19.75F, -12F, -5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[395].setRotationPoint(28.5F, -12F, -5F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[396].setRotationPoint(28.5F, -16F, -10F);

		bodyModel[397].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[397].setRotationPoint(35.5F, -6F, -5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[398].setRotationPoint(35.5F, -6F, -6F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[399].setRotationPoint(35F, -2F, -9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[400].setRotationPoint(35F, -3F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[401].setRotationPoint(35.5F, -13F, -10F);

		bodyModel[402].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[402].setRotationPoint(29F, -3.5F, -10F);
		bodyModel[402].rotateAngleZ = 1.57079633F;

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[403].setRotationPoint(28.5F, -12F, -10F);

		bodyModel[404].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[404].setRotationPoint(29F, -3.5F, -6F);
		bodyModel[404].rotateAngleZ = 1.57079633F;

		bodyModel[405].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[405].setRotationPoint(29F, -3.5F, -6F);
		bodyModel[405].rotateAngleZ = 1.57079633F;

		bodyModel[406].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[406].setRotationPoint(29.5F, -3F, -10F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[407].setRotationPoint(28.5F, -3F, -10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[408].setRotationPoint(28.5F, -12F, -6F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[409].setRotationPoint(28.5F, -10F, -6F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(37.5F, -12F, -5F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[411].setRotationPoint(37.5F, -16F, -10F);

		bodyModel[412].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[412].setRotationPoint(44.5F, -6F, -5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[413].setRotationPoint(44.5F, -6F, -6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[414].setRotationPoint(44F, -2F, -9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[415].setRotationPoint(44F, -3F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[416].setRotationPoint(44.5F, -13F, -10F);

		bodyModel[417].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[417].setRotationPoint(38F, -3.5F, -10F);
		bodyModel[417].rotateAngleZ = 1.57079633F;

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[418].setRotationPoint(37.5F, -12F, -10F);

		bodyModel[419].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[419].setRotationPoint(38F, -3.5F, -6F);
		bodyModel[419].rotateAngleZ = 1.57079633F;

		bodyModel[420].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[420].setRotationPoint(38F, -3.5F, -6F);
		bodyModel[420].rotateAngleZ = 1.57079633F;

		bodyModel[421].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[421].setRotationPoint(38.5F, -3F, -10F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[422].setRotationPoint(37.5F, -3F, -10F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[423].setRotationPoint(37.5F, -12F, -6F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[424].setRotationPoint(37.5F, -10F, -6F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[425].setRotationPoint(25.5F, -12F, 4F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[426].setRotationPoint(25.5F, -16F, 4F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[427].setRotationPoint(25.5F, -3F, 4F);

		bodyModel[428].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[428].setRotationPoint(26F, -3.5F, 6F);
		bodyModel[428].rotateAngleZ = 1.57079633F;

		bodyModel[429].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[429].setRotationPoint(26F, -3.5F, 5F);
		bodyModel[429].rotateAngleZ = 1.57079633F;

		bodyModel[430].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[430].setRotationPoint(26F, -3.5F, 5F);
		bodyModel[430].rotateAngleZ = 1.57079633F;

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[431].setRotationPoint(25.5F, -12F, 5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[432].setRotationPoint(25.5F, -10F, 5F);

		bodyModel[433].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[433].setRotationPoint(26.5F, -3F, 4F);

		bodyModel[434].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[434].setRotationPoint(32.5F, -6F, 4F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[435].setRotationPoint(32.5F, -6F, 5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[436].setRotationPoint(32F, -2F, 7F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[437].setRotationPoint(32F, -3F, 7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[438].setRotationPoint(32.5F, -13F, 4F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[439].setRotationPoint(34.5F, -12F, 4F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[440].setRotationPoint(34.5F, -16F, 4F);

		bodyModel[441].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[441].setRotationPoint(34.5F, -3F, 4F);

		bodyModel[442].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 4, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[442].setRotationPoint(35F, -3.5F, 6F);
		bodyModel[442].rotateAngleZ = 1.57079633F;

		bodyModel[443].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // roomette bed rear
		bodyModel[443].setRotationPoint(35F, -3.5F, 5F);
		bodyModel[443].rotateAngleZ = 1.57079633F;

		bodyModel[444].addShapeBox(3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // roomette bed rear
		bodyModel[444].setRotationPoint(35F, -3.5F, 5F);
		bodyModel[444].rotateAngleZ = 1.57079633F;

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 128
		bodyModel[445].setRotationPoint(34.5F, -12F, 5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 128
		bodyModel[446].setRotationPoint(34.5F, -10F, 5F);

		bodyModel[447].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 38
		bodyModel[447].setRotationPoint(35.5F, -3F, 4F);

		bodyModel[448].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 38
		bodyModel[448].setRotationPoint(41.5F, -6F, 4F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[449].setRotationPoint(41.5F, -6F, 5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[450].setRotationPoint(41F, -2F, 7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[451].setRotationPoint(41F, -3F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[452].setRotationPoint(41.5F, -13F, 4F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[453].setRotationPoint(25.5F, -12F, 5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[454].setRotationPoint(34.5F, -12F, 5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[455].setRotationPoint(-20.5F, -17.5F, -9F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[456].setRotationPoint(-2.5F, -17.5F, -9F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[457].setRotationPoint(-29.5F, -17.5F, -10F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[458].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[459].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[460].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[461].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[462].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[463].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[464].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[465].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[466].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[467].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[468].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[469].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[470].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[471].setRotationPoint(63F, -15F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[472].setRotationPoint(63F, -16F, -11F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[473].setRotationPoint(63F, 1F, -10F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[474].setRotationPoint(63F, -20F, -7F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(63F, -20F, -3F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[476].setRotationPoint(63F, -14F, -5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[477].setRotationPoint(63F, -14F, 3F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[478].setRotationPoint(63F, -15F, -5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[479].setRotationPoint(63F, -16F, -4F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[480].setRotationPoint(63F, -16F, 1F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[481].setRotationPoint(63F, -19F, -1F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[482].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[483].setRotationPoint(63F, -15F, 10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[484].setRotationPoint(63F, -16F, 9F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[485].setRotationPoint(63F, -20F, 3F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[486].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[487].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[488].setRotationPoint(-63F, -15F, -11F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[489].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[490].setRotationPoint(-63F, -15F, -11F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[491].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[492].setRotationPoint(-63F, -19F, -10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[493].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[494].setRotationPoint(-63F, -20F, -7F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[495].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[496].setRotationPoint(-63F, -20F, -3F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[497].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[498].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[499].setRotationPoint(-63.5F, -15F, -5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[501] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[502] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[503] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[504] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[505] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[506] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[507] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[508] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[509] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[510] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[511] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[512] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 128
		bodyModel[513] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 128
		bodyModel[514] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 128
		bodyModel[516] = new ModelRendererTurbo(this, 17, 370, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 72, 261, textureX, textureY); // bed ladder front
		bodyModel[518] = new ModelRendererTurbo(this, 481, 203, textureX, textureY); // bed ladder rear
		bodyModel[519] = new ModelRendererTurbo(this, 201, 247, textureX, textureY); // bed ladder front
		bodyModel[520] = new ModelRendererTurbo(this, 295, 203, textureX, textureY); // bed ladder front
		bodyModel[521] = new ModelRendererTurbo(this, 171, 271, textureX, textureY); // bed ladder rear
		bodyModel[522] = new ModelRendererTurbo(this, 359, 271, textureX, textureY); // bed ladder rear
		bodyModel[523] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Box 190
		bodyModel[524] = new ModelRendererTurbo(this, 58, 104, textureX, textureY); // Box 204
		bodyModel[525] = new ModelRendererTurbo(this, 48, 79, textureX, textureY); // Box 194
		bodyModel[526] = new ModelRendererTurbo(this, 193, 187, textureX, textureY); // Box 528
		bodyModel[527] = new ModelRendererTurbo(this, 308, 184, textureX, textureY); // Box 627
		bodyModel[528] = new ModelRendererTurbo(this, 271, 184, textureX, textureY); // Box 627
		bodyModel[529] = new ModelRendererTurbo(this, 236, 335, textureX, textureY, "cull"); // Box 38 cull
		bodyModel[530] = new ModelRendererTurbo(this, 232, 325, textureX, textureY); // Box 38
		bodyModel[531] = new ModelRendererTurbo(this, 62, 431, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 73, 447, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 64, 425, textureX, textureY); // Box 176
		bodyModel[534] = new ModelRendererTurbo(this, 68, 3, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 57, 456, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 226, 431, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 141, 431, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 458, 1, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 226, 456, textureX, textureY); // Box 128
		bodyModel[540] = new ModelRendererTurbo(this, 141, 459, textureX, textureY); // Box 128
		bodyModel[541] = new ModelRendererTurbo(this, 54, 409, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 234, 409, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 239, 447, textureX, textureY); // Box 128
		bodyModel[544] = new ModelRendererTurbo(this, 146, 464, textureX, textureY); // Box 38
		bodyModel[545] = new ModelRendererTurbo(this, 177, 464, textureX, textureY); // Box 38
		bodyModel[546] = new ModelRendererTurbo(this, 208, 464, textureX, textureY); // Box 38
		bodyModel[547] = new ModelRendererTurbo(this, 133, 409, textureX, textureY); // Box 38
		bodyModel[548] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[549] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 238, 55, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 144, 58, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 143, 54, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 74, 151, textureX, textureY); // Box 2
		bodyModel[554] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 2
		bodyModel[555] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[556] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[557] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[558] = new ModelRendererTurbo(this, 245, 151, textureX, textureY); // Box 2
		bodyModel[559] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[560] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[561] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[562] = new ModelRendererTurbo(this, 122, 151, textureX, textureY); // Box 2
		bodyModel[563] = new ModelRendererTurbo(this, 74, 141, textureX, textureY); // Box 30
		bodyModel[564] = new ModelRendererTurbo(this, 74, 138, textureX, textureY); // Box 31
		bodyModel[565] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[566] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[567] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[568] = new ModelRendererTurbo(this, 251, 141, textureX, textureY); // Box 35
		bodyModel[569] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[570] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[571] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[572] = new ModelRendererTurbo(this, 122, 141, textureX, textureY); // Box 39
		bodyModel[573] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[574] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 55
		bodyModel[575] = new ModelRendererTurbo(this, 226, 141, textureX, textureY); // Box 39
		bodyModel[576] = new ModelRendererTurbo(this, 205, 141, textureX, textureY); // Box 39
		bodyModel[577] = new ModelRendererTurbo(this, 256, 148, textureX, textureY); // Box 2
		bodyModel[578] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 2
		bodyModel[579] = new ModelRendererTurbo(this, 257, 138, textureX, textureY); // Box 28
		bodyModel[580] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 29
		bodyModel[581] = new ModelRendererTurbo(this, 261, 148, textureX, textureY); // Box 2
		bodyModel[582] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 41
		bodyModel[583] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 2
		bodyModel[584] = new ModelRendererTurbo(this, 273, 151, textureX, textureY); // Box 2
		bodyModel[585] = new ModelRendererTurbo(this, 266, 148, textureX, textureY); // Box 2
		bodyModel[586] = new ModelRendererTurbo(this, 266, 151, textureX, textureY); // Box 2
		bodyModel[587] = new ModelRendererTurbo(this, 247, 164, textureX, textureY); // Box 140
		bodyModel[588] = new ModelRendererTurbo(this, 248, 167, textureX, textureY); // Box 141
		bodyModel[589] = new ModelRendererTurbo(this, 256, 164, textureX, textureY); // Box 142
		bodyModel[590] = new ModelRendererTurbo(this, 257, 167, textureX, textureY); // Box 143
		bodyModel[591] = new ModelRendererTurbo(this, 274, 138, textureX, textureY); // Box 24
		bodyModel[592] = new ModelRendererTurbo(this, 274, 141, textureX, textureY); // Box 25
		bodyModel[593] = new ModelRendererTurbo(this, 267, 138, textureX, textureY); // Box 26
		bodyModel[594] = new ModelRendererTurbo(this, 267, 141, textureX, textureY); // Box 27
		bodyModel[595] = new ModelRendererTurbo(this, 247, 155, textureX, textureY); // Box 26
		bodyModel[596] = new ModelRendererTurbo(this, 248, 158, textureX, textureY); // Box 26
		bodyModel[597] = new ModelRendererTurbo(this, 256, 155, textureX, textureY); // Box 26
		bodyModel[598] = new ModelRendererTurbo(this, 257, 158, textureX, textureY); // Box 26
		bodyModel[599] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[601] = new ModelRendererTurbo(this, 383, 96, textureX, textureY); // Box 128
		bodyModel[602] = new ModelRendererTurbo(this, 383, 71, textureX, textureY); // Box 251
		bodyModel[603] = new ModelRendererTurbo(this, 446, 23, textureX, textureY); // Box 128
		bodyModel[604] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[605] = new ModelRendererTurbo(this, 443, 19, textureX, textureY); // Box 153
		bodyModel[606] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 128
		bodyModel[607] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[608] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[609] = new ModelRendererTurbo(this, 95, 383, textureX, textureY); // Box 38
		bodyModel[610] = new ModelRendererTurbo(this, 95, 381, textureX, textureY); // Box 452
		bodyModel[611] = new ModelRendererTurbo(this, 83, 391, textureX, textureY); // Box 38
		bodyModel[612] = new ModelRendererTurbo(this, 89, 385, textureX, textureY); // Box 462
		bodyModel[613] = new ModelRendererTurbo(this, 411, 180, textureX, textureY, "lamp"); // Box 38 glow
		bodyModel[614] = new ModelRendererTurbo(this, 338, 52, textureX, textureY); // Box 128

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[500].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[501].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[502].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[503].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[504].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[505].setRotationPoint(-63F, -15F, 11F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[506].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[507].setRotationPoint(-63F, -15F, 9F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[508].setRotationPoint(-63F, -19F, 7F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[509].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[510].setRotationPoint(-63F, -20F, 3F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[511].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[512].setRotationPoint(-63F, -15F, -4F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[513].setRotationPoint(-63F, 1F, -4F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[514].setRotationPoint(-63F, -14F, -4F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[515].setRotationPoint(-63F, -14F, 3F);

		bodyModel[516].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128
		bodyModel[516].setRotationPoint(19.5F, -3F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[517].setRotationPoint(-11.51F, -17.51F, -7F);
		bodyModel[517].rotateAngleX = 1.57079633F;
		bodyModel[517].rotateAngleZ = -1.57079633F;

		bodyModel[518].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[518].setRotationPoint(-20.49F, -17.51F, -7F);
		bodyModel[518].rotateAngleX = 1.57079633F;
		bodyModel[518].rotateAngleZ = 1.57079633F;

		bodyModel[519].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[519].setRotationPoint(6.49F, -17.51F, -7F);
		bodyModel[519].rotateAngleX = 1.57079633F;
		bodyModel[519].rotateAngleZ = -1.57079633F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder front
		bodyModel[520].setRotationPoint(-29.51F, -17.51F, -7F);
		bodyModel[520].rotateAngleX = 1.57079633F;
		bodyModel[520].rotateAngleZ = -1.57079633F;

		bodyModel[521].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[521].setRotationPoint(-2.49F, -17.51F, -7F);
		bodyModel[521].rotateAngleX = 1.57079633F;
		bodyModel[521].rotateAngleZ = 1.57079633F;

		bodyModel[522].addShapeBox(0F, 0F, 0F, 0, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // bed ladder rear
		bodyModel[522].setRotationPoint(15.51F, -17.51F, -7F);
		bodyModel[522].rotateAngleX = 1.57079633F;
		bodyModel[522].rotateAngleZ = 1.57079633F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		bodyModel[523].setRotationPoint(45.5F, -18F, -11.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[524].setRotationPoint(-61F, -6F, 11F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[525].setRotationPoint(-61F, -6F, -12F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 113, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 528
		bodyModel[526].setRotationPoint(-60.5F, -16F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[527].setRotationPoint(26.5F, -16F, 9F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[528].setRotationPoint(-57.5F, -16F, 9F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 cull
		bodyModel[529].setRotationPoint(49.5F, -5F, 4F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 4, 9, 0, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[530].setRotationPoint(48.5F, -16F, 4.99F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 32, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[531].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 32, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[532].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 123, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[533].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 31, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[535].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 46, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[536].setRotationPoint(15.5F, -17F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 46, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[537].setRotationPoint(15.5F, -18F, -10F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[538].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 40, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[539].setRotationPoint(15.5F, -16.25F, -10F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 45, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[540].setRotationPoint(-29.5F, -16.25F, 7F);

		bodyModel[541].addBox(0F, 0F, 0F, 32, 1, 14, 0F); // Box 128
		bodyModel[541].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[542].addBox(0F, 0F, 0F, 46, 1, 14, 0F); // Box 128
		bodyModel[542].setRotationPoint(15.5F, -18F, -7F);

		bodyModel[543].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 128
		bodyModel[543].setRotationPoint(-29.5F, -18F, 5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[544].setRotationPoint(-25.5F, -17.5F, -9F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[545].setRotationPoint(-7.5F, -17.5F, -9F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[546].setRotationPoint(10.5F, -17.5F, -9F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 45, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[547].setRotationPoint(-29.5F, -18F, -7F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[548].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[549].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 46, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[550].setRotationPoint(15.5F, -19F, -10F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[551].setRotationPoint(-29.5F, -18F, -10F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 45, 2, 2, 0F,0F, -1.165F, 0F, 0F, -1.165F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[552].setRotationPoint(-29.5F, -19F, -9F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[553].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[554].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[555].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[556].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[557].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[558].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[559].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[560].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[561].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 60, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[562].setRotationPoint(-26.5F, 4F, 10.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[563].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[564].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[565].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[566].setRotationPoint(-55F, 4F, -11F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[567].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[568].setRotationPoint(33F, 4F, -11F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[569].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[570].setRotationPoint(-35F, 4F, -11F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[571].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[572].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[573].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[574].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[575].setRotationPoint(22.5F, 4F, -11F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		bodyModel[576].setRotationPoint(13.5F, 4F, -11F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[577].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[578].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[579].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[580].setRotationPoint(53F, 4F, -11F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[581].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[582].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[583].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[584].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[585].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[586].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		bodyModel[587].setRotationPoint(56.5F, 3F, 7F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		bodyModel[588].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[589].setRotationPoint(60.5F, 3F, 7F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[590].setRotationPoint(60.5F, 4F, 8F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[591].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[592].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[593].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[594].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[595].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[596].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 26
		bodyModel[597].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		bodyModel[598].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[599].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[600].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[601].setRotationPoint(63F, -19F, -10F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[602].setRotationPoint(63F, -19F, 7F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[603].setRotationPoint(63F, 1F, -5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[604].setRotationPoint(63F, -16F, -5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[605].setRotationPoint(63F, -16F, 0F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[606].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[607].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[608].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[609].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[609].setRotationPoint(-47.5F, -1.5F, -11.01F);

		bodyModel[610].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[610].setRotationPoint(-47.5F, -1.5F, 11.01F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 107, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[611].setRotationPoint(-60.5F, -11F, -9.9F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 101, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[612].setRotationPoint(-57.5F, -11F, 9.9F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 47, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[613].setRotationPoint(-30.5F, -15.99F, -5F);

		bodyModel[614].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.35F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[614].setRotationPoint(51F, -20.75F, -4.5F);
		bodyModel[614].rotateAngleY = -0.78539816F;
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 615; i++)
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
		if(GetColor(entity)==11){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_NKP_blue.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_black.png"));
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