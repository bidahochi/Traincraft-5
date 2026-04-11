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

public class ModelNYCPrewar56SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNYCPrewar56SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[676];

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
		bodyModel[3] = new ModelRendererTurbo(this, 270, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 270, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 262, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 262, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 252, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 252, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 75, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[10] = new ModelRendererTurbo(this, 75, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[11] = new ModelRendererTurbo(this, 94, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 92, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 270, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 270, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 262, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 262, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 252, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 252, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 75, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[26] = new ModelRendererTurbo(this, 75, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[27] = new ModelRendererTurbo(this, 94, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 92, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 257, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 257, 138, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 60, 123, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 107, 173, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 107, 181, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 84, 163, textureX, textureY); // Box 41
		bodyModel[45] = new ModelRendererTurbo(this, 81, 163, textureX, textureY); // Box 41
		bodyModel[46] = new ModelRendererTurbo(this, 95, 163, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 67, 169, textureX, textureY); // Box 41
		bodyModel[48] = new ModelRendererTurbo(this, 67, 167, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 87, 167, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[51] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[52] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[53] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[66] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[67] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[87] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[88] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[92] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[93] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[95] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[96] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[97] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 492, 24, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 460, 24, textureX, textureY); // Box 176
		bodyModel[100] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 62, 84, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[107] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[108] = new ModelRendererTurbo(this, 62, 103, textureX, textureY); // Box 204
		bodyModel[109] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[110] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[115] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[116] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[117] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[118] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[119] = new ModelRendererTurbo(this, 384, 101, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 387, 92, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[122] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 249
		bodyModel[123] = new ModelRendererTurbo(this, 36, 86, textureX, textureY); // Box 38
		bodyModel[124] = new ModelRendererTurbo(this, 41, 87, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 21, 101, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 29, 103, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 28, 97, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 27, 91, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 25, 83, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 36, 66, textureX, textureY); // Box 247
		bodyModel[132] = new ModelRendererTurbo(this, 41, 67, textureX, textureY); // Box 248
		bodyModel[133] = new ModelRendererTurbo(this, 21, 67, textureX, textureY); // Box 249
		bodyModel[134] = new ModelRendererTurbo(this, 29, 67, textureX, textureY); // Box 250
		bodyModel[135] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 252
		bodyModel[136] = new ModelRendererTurbo(this, 27, 77, textureX, textureY); // Box 254
		bodyModel[137] = new ModelRendererTurbo(this, 75, 145, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 75, 155, textureX, textureY); // Box 205
		bodyModel[139] = new ModelRendererTurbo(this, 108, 163, textureX, textureY); // Box 2
		bodyModel[140] = new ModelRendererTurbo(this, 145, 155, textureX, textureY); // Box 52
		bodyModel[141] = new ModelRendererTurbo(this, 298, 170, textureX, textureY); // Box 52
		bodyModel[142] = new ModelRendererTurbo(this, 166, 156, textureX, textureY); // Box 41
		bodyModel[143] = new ModelRendererTurbo(this, 165, 154, textureX, textureY); // Box 41
		bodyModel[144] = new ModelRendererTurbo(this, 187, 154, textureX, textureY); // Box 41
		bodyModel[145] = new ModelRendererTurbo(this, 82, 288, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 297, 323, textureX, textureY); // Box 38
		bodyModel[147] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 38
		bodyModel[148] = new ModelRendererTurbo(this, 431, 75, textureX, textureY); // Box 38
		bodyModel[149] = new ModelRendererTurbo(this, 106, 339, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[150] = new ModelRendererTurbo(this, 106, 346, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[151] = new ModelRendererTurbo(this, 105, 351, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[152] = new ModelRendererTurbo(this, 105, 344, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[153] = new ModelRendererTurbo(this, 106, 269, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 106, 263, textureX, textureY); // Box 462
		bodyModel[155] = new ModelRendererTurbo(this, 155, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[156] = new ModelRendererTurbo(this, 160, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[157] = new ModelRendererTurbo(this, 165, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[158] = new ModelRendererTurbo(this, 170, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[159] = new ModelRendererTurbo(this, 175, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[160] = new ModelRendererTurbo(this, 180, 258, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[161] = new ModelRendererTurbo(this, 297, 272, textureX, textureY); // Box 38
		bodyModel[162] = new ModelRendererTurbo(this, 374, 307, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 330, 321, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 418, 286, textureX, textureY); // Box 38
		bodyModel[165] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 38
		bodyModel[166] = new ModelRendererTurbo(this, 342, 321, textureX, textureY); // Box 38
		bodyModel[167] = new ModelRendererTurbo(this, 340, 325, textureX, textureY); // Box 38
		bodyModel[168] = new ModelRendererTurbo(this, 378, 294, textureX, textureY); // Box 38
		bodyModel[169] = new ModelRendererTurbo(this, 375, 291, textureX, textureY); // Box 38
		bodyModel[170] = new ModelRendererTurbo(this, 380, 291, textureX, textureY); // Box 38
		bodyModel[171] = new ModelRendererTurbo(this, 378, 278, textureX, textureY); // Box 38
		bodyModel[172] = new ModelRendererTurbo(this, 375, 281, textureX, textureY); // Box 38
		bodyModel[173] = new ModelRendererTurbo(this, 380, 281, textureX, textureY); // Box 38
		bodyModel[174] = new ModelRendererTurbo(this, 363, 281, textureX, textureY); // Box 38
		bodyModel[175] = new ModelRendererTurbo(this, 58, 307, textureX, textureY); // Box 38
		bodyModel[176] = new ModelRendererTurbo(this, 25, 307, textureX, textureY); // Box 38
		bodyModel[177] = new ModelRendererTurbo(this, 41, 286, textureX, textureY); // Box 38
		bodyModel[178] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 1, 283, textureX, textureY); // Box 38
		bodyModel[180] = new ModelRendererTurbo(this, 70, 292, textureX, textureY); // Box 38
		bodyModel[181] = new ModelRendererTurbo(this, 12, 294, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 17, 291, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 12, 291, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 12, 261, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 17, 264, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 12, 264, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 11, 280, textureX, textureY); // Box 38
		bodyModel[188] = new ModelRendererTurbo(this, 25, 301, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[190] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[191] = new ModelRendererTurbo(this, 330, 294, textureX, textureY); // Box 526
		bodyModel[192] = new ModelRendererTurbo(this, 331, 273, textureX, textureY); // Box 527
		bodyModel[193] = new ModelRendererTurbo(this, 342, 270, textureX, textureY); // Box 528
		bodyModel[194] = new ModelRendererTurbo(this, 329, 270, textureX, textureY); // Box 529
		bodyModel[195] = new ModelRendererTurbo(this, 346, 273, textureX, textureY); // Box 530
		bodyModel[196] = new ModelRendererTurbo(this, 333, 273, textureX, textureY); // Box 531
		bodyModel[197] = new ModelRendererTurbo(this, 331, 285, textureX, textureY); // Box 532
		bodyModel[198] = new ModelRendererTurbo(this, 341, 275, textureX, textureY); // Box 533
		bodyModel[199] = new ModelRendererTurbo(this, 328, 275, textureX, textureY); // Box 534
		bodyModel[200] = new ModelRendererTurbo(this, 379, 284, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 364, 284, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 379, 297, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 12, 267, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 12, 284, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 12, 297, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 18, 269, textureX, textureY); // Box 526
		bodyModel[207] = new ModelRendererTurbo(this, 19, 234, textureX, textureY); // Box 527
		bodyModel[208] = new ModelRendererTurbo(this, 23, 257, textureX, textureY); // Box 528
		bodyModel[209] = new ModelRendererTurbo(this, 36, 257, textureX, textureY); // Box 529
		bodyModel[210] = new ModelRendererTurbo(this, 23, 260, textureX, textureY); // Box 530
		bodyModel[211] = new ModelRendererTurbo(this, 36, 260, textureX, textureY); // Box 531
		bodyModel[212] = new ModelRendererTurbo(this, 19, 253, textureX, textureY); // Box 532
		bodyModel[213] = new ModelRendererTurbo(this, 28, 262, textureX, textureY); // Box 533
		bodyModel[214] = new ModelRendererTurbo(this, 41, 262, textureX, textureY); // Box 534
		bodyModel[215] = new ModelRendererTurbo(this, 25, 293, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 24, 286, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[217] = new ModelRendererTurbo(this, 11, 274, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[218] = new ModelRendererTurbo(this, 72, 237, textureX, textureY); // Box 194
		bodyModel[219] = new ModelRendererTurbo(this, 241, 238, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 72, 233, textureX, textureY); // Box 193
		bodyModel[221] = new ModelRendererTurbo(this, 72, 240, textureX, textureY); // Box 192
		bodyModel[222] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 128
		bodyModel[223] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 128
		bodyModel[224] = new ModelRendererTurbo(this, 448, 47, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 448, 69, textureX, textureY); // Box 176
		bodyModel[226] = new ModelRendererTurbo(this, 18, 146, textureX, textureY); // Box 128
		bodyModel[227] = new ModelRendererTurbo(this, 18, 168, textureX, textureY); // Box 176
		bodyModel[228] = new ModelRendererTurbo(this, 437, 53, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 7, 152, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 329, 92, textureX, textureY); // Right step part
		bodyModel[231] = new ModelRendererTurbo(this, 327, 95, textureX, textureY); // Right step part
		bodyModel[232] = new ModelRendererTurbo(this, 329, 98, textureX, textureY); // Right step part
		bodyModel[233] = new ModelRendererTurbo(this, 329, 102, textureX, textureY); // Right step part
		bodyModel[234] = new ModelRendererTurbo(this, 327, 105, textureX, textureY); // Right step part
		bodyModel[235] = new ModelRendererTurbo(this, 324, 96, textureX, textureY); // Right step part
		bodyModel[236] = new ModelRendererTurbo(this, 338, 96, textureX, textureY); // Right step part
		bodyModel[237] = new ModelRendererTurbo(this, 324, 98, textureX, textureY); // Right step part
		bodyModel[238] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Right step part
		bodyModel[239] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 1353
		bodyModel[240] = new ModelRendererTurbo(this, 338, 84, textureX, textureY); // Box 1354
		bodyModel[241] = new ModelRendererTurbo(this, 329, 88, textureX, textureY); // Box 1355
		bodyModel[242] = new ModelRendererTurbo(this, 327, 85, textureX, textureY); // Box 1356
		bodyModel[243] = new ModelRendererTurbo(this, 338, 82, textureX, textureY); // Box 1357
		bodyModel[244] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 1358
		bodyModel[245] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[246] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[247] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[248] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[249] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[250] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[251] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[252] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[253] = new ModelRendererTurbo(this, 338, 88, textureX, textureY); // Box 1359
		bodyModel[254] = new ModelRendererTurbo(this, 322, 88, textureX, textureY); // Box 1360
		bodyModel[255] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[256] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[257] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[258] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[259] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[260] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[261] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[262] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[263] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[264] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[265] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[266] = new ModelRendererTurbo(this, 303, 5, textureX, textureY); // Box 128
		bodyModel[267] = new ModelRendererTurbo(this, 303, 9, textureX, textureY); // Box 128
		bodyModel[268] = new ModelRendererTurbo(this, 75, 8, textureX, textureY); // Box 204
		bodyModel[269] = new ModelRendererTurbo(this, 75, 12, textureX, textureY); // Box 205
		bodyModel[270] = new ModelRendererTurbo(this, 382, 90, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 380, 82, textureX, textureY); // Box 128
		bodyModel[272] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[273] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 153
		bodyModel[274] = new ModelRendererTurbo(this, 418, 45, textureX, textureY); // Box 128
		bodyModel[275] = new ModelRendererTurbo(this, 426, 46, textureX, textureY); // Box 128
		bodyModel[276] = new ModelRendererTurbo(this, 382, 76, textureX, textureY); // Box 253
		bodyModel[277] = new ModelRendererTurbo(this, 412, 46, textureX, textureY); // Box 255
		bodyModel[278] = new ModelRendererTurbo(this, 383, 96, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 383, 71, textureX, textureY); // Box 251
		bodyModel[280] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[281] = new ModelRendererTurbo(this, 446, 17, textureX, textureY); // Box 153
		bodyModel[282] = new ModelRendererTurbo(this, 18, 90, textureX, textureY); // Box 128
		bodyModel[283] = new ModelRendererTurbo(this, 16, 82, textureX, textureY); // Box 128
		bodyModel[284] = new ModelRendererTurbo(this, 14, 116, textureX, textureY); // Box 128
		bodyModel[285] = new ModelRendererTurbo(this, 4, 116, textureX, textureY); // Box 153
		bodyModel[286] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Box 128
		bodyModel[287] = new ModelRendererTurbo(this, 18, 110, textureX, textureY); // Box 128
		bodyModel[288] = new ModelRendererTurbo(this, 18, 76, textureX, textureY); // Box 253
		bodyModel[289] = new ModelRendererTurbo(this, 4, 110, textureX, textureY); // Box 255
		bodyModel[290] = new ModelRendererTurbo(this, 19, 96, textureX, textureY); // Box 128
		bodyModel[291] = new ModelRendererTurbo(this, 19, 71, textureX, textureY); // Box 251
		bodyModel[292] = new ModelRendererTurbo(this, 16, 42, textureX, textureY); // Box 128
		bodyModel[293] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[294] = new ModelRendererTurbo(this, 90, 165, textureX, textureY); // Box 2
		bodyModel[295] = new ModelRendererTurbo(this, 86, 176, textureX, textureY); // Box 59
		bodyModel[296] = new ModelRendererTurbo(this, 301, 159, textureX, textureY); // Box 2
		bodyModel[297] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 52
		bodyModel[298] = new ModelRendererTurbo(this, 436, 189, textureX, textureY); // Box 41
		bodyModel[299] = new ModelRendererTurbo(this, 435, 187, textureX, textureY); // Box 41
		bodyModel[300] = new ModelRendererTurbo(this, 457, 187, textureX, textureY); // Box 41
		bodyModel[301] = new ModelRendererTurbo(this, 331, 147, textureX, textureY); // Box 2
		bodyModel[302] = new ModelRendererTurbo(this, 340, 147, textureX, textureY); // Box 2
		bodyModel[303] = new ModelRendererTurbo(this, 340, 159, textureX, textureY); // Box 2
		bodyModel[304] = new ModelRendererTurbo(this, 333, 150, textureX, textureY); // Box 2
		bodyModel[305] = new ModelRendererTurbo(this, 342, 150, textureX, textureY); // Box 2
		bodyModel[306] = new ModelRendererTurbo(this, 340, 153, textureX, textureY); // Box 2
		bodyModel[307] = new ModelRendererTurbo(this, 342, 156, textureX, textureY); // Box 2
		bodyModel[308] = new ModelRendererTurbo(this, 351, 149, textureX, textureY); // Box 128
		bodyModel[309] = new ModelRendererTurbo(this, 351, 156, textureX, textureY); // Box 128
		bodyModel[310] = new ModelRendererTurbo(this, 333, 149, textureX, textureY); // Box 128
		bodyModel[311] = new ModelRendererTurbo(this, 337, 156, textureX, textureY); // Box 128
		bodyModel[312] = new ModelRendererTurbo(this, 331, 130, textureX, textureY); // Box 628
		bodyModel[313] = new ModelRendererTurbo(this, 340, 130, textureX, textureY); // Box 629
		bodyModel[314] = new ModelRendererTurbo(this, 340, 142, textureX, textureY); // Box 630
		bodyModel[315] = new ModelRendererTurbo(this, 333, 133, textureX, textureY); // Box 631
		bodyModel[316] = new ModelRendererTurbo(this, 342, 133, textureX, textureY); // Box 632
		bodyModel[317] = new ModelRendererTurbo(this, 340, 136, textureX, textureY); // Box 633
		bodyModel[318] = new ModelRendererTurbo(this, 342, 139, textureX, textureY); // Box 634
		bodyModel[319] = new ModelRendererTurbo(this, 351, 132, textureX, textureY); // Box 635
		bodyModel[320] = new ModelRendererTurbo(this, 351, 139, textureX, textureY); // Box 636
		bodyModel[321] = new ModelRendererTurbo(this, 333, 132, textureX, textureY); // Box 638
		bodyModel[322] = new ModelRendererTurbo(this, 337, 139, textureX, textureY); // Box 639
		bodyModel[323] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 38
		bodyModel[324] = new ModelRendererTurbo(this, 325, 321, textureX, textureY); // Box 38
		bodyModel[325] = new ModelRendererTurbo(this, 36, 286, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 64, 286, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 440, 178, textureX, textureY); // Box 2
		bodyModel[328] = new ModelRendererTurbo(this, 435, 179, textureX, textureY); // Box 2
		bodyModel[329] = new ModelRendererTurbo(this, 324, 93, textureX, textureY); // Right step part
		bodyModel[330] = new ModelRendererTurbo(this, 338, 93, textureX, textureY); // Right step part
		bodyModel[331] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[332] = new ModelRendererTurbo(this, 410, 52, textureX, textureY); // Box 261
		bodyModel[333] = new ModelRendererTurbo(this, 14, 116, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 2, 116, textureX, textureY); // Box 261
		bodyModel[335] = new ModelRendererTurbo(this, 385, 272, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 17, 299, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[337] = new ModelRendererTurbo(this, 24, 297, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[338] = new ModelRendererTurbo(this, 348, 280, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 353, 283, textureX, textureY); // Box 38
		bodyModel[340] = new ModelRendererTurbo(this, 348, 283, textureX, textureY); // Box 38
		bodyModel[341] = new ModelRendererTurbo(this, 349, 286, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 357, 286, textureX, textureY,"cull"); // Box 612 cull
		bodyModel[343] = new ModelRendererTurbo(this, 369, 286, textureX, textureY,"cull"); // Box 612 cull
		bodyModel[344] = new ModelRendererTurbo(this, 397, 254, textureX, textureY); // Box 38
		bodyModel[345] = new ModelRendererTurbo(this, 387, 274, textureX, textureY); // Box 38
		bodyModel[346] = new ModelRendererTurbo(this, 390, 279, textureX, textureY); // Box 38
		bodyModel[347] = new ModelRendererTurbo(this, 389, 283, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 74, 13, textureX, textureY); // Box 128
		bodyModel[349] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[352] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 272, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[355] = new ModelRendererTurbo(this, 283, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[356] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[357] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[359] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[360] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[361] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[362] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[365] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 244, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[367] = new ModelRendererTurbo(this, 255, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[368] = new ModelRendererTurbo(this, 255, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[369] = new ModelRendererTurbo(this, 244, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[370] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[373] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[374] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[375] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[376] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[377] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[378] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[379] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 216, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[381] = new ModelRendererTurbo(this, 227, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[382] = new ModelRendererTurbo(this, 227, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[383] = new ModelRendererTurbo(this, 216, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[384] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[385] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[386] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[387] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[389] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[390] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[392] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 188, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[395] = new ModelRendererTurbo(this, 199, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[396] = new ModelRendererTurbo(this, 199, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[397] = new ModelRendererTurbo(this, 188, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[398] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[399] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[401] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[402] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[403] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[404] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[407] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[408] = new ModelRendererTurbo(this, 160, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[409] = new ModelRendererTurbo(this, 171, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[410] = new ModelRendererTurbo(this, 171, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[411] = new ModelRendererTurbo(this, 160, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[412] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part test
		bodyModel[415] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part test
		bodyModel[416] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[417] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[418] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[420] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part test
		bodyModel[421] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part test
		bodyModel[422] = new ModelRendererTurbo(this, 132, 277, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[423] = new ModelRendererTurbo(this, 143, 295, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[424] = new ModelRendererTurbo(this, 143, 330, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[425] = new ModelRendererTurbo(this, 132, 312, textureX, textureY,"cull"); // Left seat part cull test
		bodyModel[426] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[427] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[428] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[429] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[430] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 115, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[432] = new ModelRendererTurbo(this, 104, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[433] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[434] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[436] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 283, 330, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[439] = new ModelRendererTurbo(this, 272, 312, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[440] = new ModelRendererTurbo(this, 106, 353, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[441] = new ModelRendererTurbo(this, 106, 361, textureX, textureY,"cull"); // Box 275 cull
		bodyModel[442] = new ModelRendererTurbo(this, 104, 366, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[443] = new ModelRendererTurbo(this, 104, 358, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[444] = new ModelRendererTurbo(this, 86, 280, textureX, textureY); // Box 38
		bodyModel[445] = new ModelRendererTurbo(this, 87, 261, textureX, textureY); // Box 38
		bodyModel[446] = new ModelRendererTurbo(this, 308, 315, textureX, textureY); // Box 38
		bodyModel[447] = new ModelRendererTurbo(this, 309, 296, textureX, textureY); // Box 38
		bodyModel[448] = new ModelRendererTurbo(this, 76, 260, textureX, textureY); // Box 38
		bodyModel[449] = new ModelRendererTurbo(this, 69, 277, textureX, textureY); // Box 38
		bodyModel[450] = new ModelRendererTurbo(this, 65, 260, textureX, textureY); // Box 38
		bodyModel[451] = new ModelRendererTurbo(this, 297, 307, textureX, textureY); // Box 38
		bodyModel[452] = new ModelRendererTurbo(this, 106, 377, textureX, textureY); // Box 38
		bodyModel[453] = new ModelRendererTurbo(this, 106, 369, textureX, textureY); // Box 488
		bodyModel[454] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[455] = new ModelRendererTurbo(this, 74, 192, textureX, textureY); // Box 194
		bodyModel[456] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[457] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 323, 253, textureX, textureY); // Box 526
		bodyModel[459] = new ModelRendererTurbo(this, 359, 246, textureX, textureY); // Box 527
		bodyModel[460] = new ModelRendererTurbo(this, 343, 255, textureX, textureY); // Box 528
		bodyModel[461] = new ModelRendererTurbo(this, 347, 258, textureX, textureY); // Box 530
		bodyModel[462] = new ModelRendererTurbo(this, 342, 251, textureX, textureY); // Box 532
		bodyModel[463] = new ModelRendererTurbo(this, 342, 260, textureX, textureY); // Box 533
		bodyModel[464] = new ModelRendererTurbo(this, 389, 255, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 390, 258, textureX, textureY); // Box 38
		bodyModel[466] = new ModelRendererTurbo(this, 75, 16, textureX, textureY); // Box 199
		bodyModel[467] = new ModelRendererTurbo(this, 73, 64, textureX, textureY); // Box 38
		bodyModel[468] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 503
		bodyModel[469] = new ModelRendererTurbo(this, 296, 9, textureX, textureY); // Box 504
		bodyModel[470] = new ModelRendererTurbo(this, 79, 245, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[471] = new ModelRendererTurbo(this, 72, 254, textureX, textureY,"lamp"); // Box 505 glow
		bodyModel[472] = new ModelRendererTurbo(this, 72, 245, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[473] = new ModelRendererTurbo(this, 229, 254, textureX, textureY,"lamp"); // Box 505 glow
		bodyModel[474] = new ModelRendererTurbo(this, 72, 249, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 322, 5, textureX, textureY); // Box 204
		bodyModel[476] = new ModelRendererTurbo(this, 322, 9, textureX, textureY); // Box 205
		bodyModel[477] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 204
		bodyModel[478] = new ModelRendererTurbo(this, 76, 4, textureX, textureY); // Box 205
		bodyModel[479] = new ModelRendererTurbo(this, 310, 5, textureX, textureY); // Box 128
		bodyModel[480] = new ModelRendererTurbo(this, 310, 9, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 315, 5, textureX, textureY); // Box 128
		bodyModel[482] = new ModelRendererTurbo(this, 315, 9, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 86, 4, textureX, textureY); // Box 128
		bodyModel[484] = new ModelRendererTurbo(this, 86, 8, textureX, textureY); // Box 128
		bodyModel[485] = new ModelRendererTurbo(this, 63, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[486] = new ModelRendererTurbo(this, 63, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[487] = new ModelRendererTurbo(this, 63, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[488] = new ModelRendererTurbo(this, 63, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[489] = new ModelRendererTurbo(this, 351, 160, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 337, 160, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 351, 143, textureX, textureY); // Box 536
		bodyModel[492] = new ModelRendererTurbo(this, 337, 143, textureX, textureY); // Box 537
		bodyModel[493] = new ModelRendererTurbo(this, 358, 158, textureX, textureY); // Box 2
		bodyModel[494] = new ModelRendererTurbo(this, 365, 151, textureX, textureY); // Box 128
		bodyModel[495] = new ModelRendererTurbo(this, 360, 151, textureX, textureY); // Box 128
		bodyModel[496] = new ModelRendererTurbo(this, 358, 141, textureX, textureY); // Box 630
		bodyModel[497] = new ModelRendererTurbo(this, 365, 134, textureX, textureY); // Box 636
		bodyModel[498] = new ModelRendererTurbo(this, 360, 134, textureX, textureY); // Box 639
		bodyModel[499] = new ModelRendererTurbo(this, 68, 151, textureX, textureY,"cull"); // Box 31 cull

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[4].setRotationPoint(60.5F, 4F, 10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[5].setRotationPoint(54.5F, 3F, 10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[6].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[7].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[9].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[10].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[11].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[12].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[13].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[14].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[15].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[16].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[17].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[18].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[19].setRotationPoint(60.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(60.5F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[21].setRotationPoint(54.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[23].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(53F, 4F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[25].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[26].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[27].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-55F, 4F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[29].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(33F, 4F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[31].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-35F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[33].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[35].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[36].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[38].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[39].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[40].setRotationPoint(43F, 4F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[41].setRotationPoint(-45F, 4F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[42].setRotationPoint(-13.5F, 4F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[43].setRotationPoint(-13.5F, 6.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[44].setRotationPoint(-23.5F, 3.5F, 8.9F);
		bodyModel[44].rotateAngleX = -0.78539816F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 41
		bodyModel[45].setRotationPoint(-23.51F, 3F, 8.4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 41
		bodyModel[46].setRotationPoint(-19.49F, 3F, 8.4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[47].setRotationPoint(-33.5F, 4F, 0F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[48].setRotationPoint(-33.51F, 4F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[49].setRotationPoint(-25.49F, 4F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[50].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[51].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[52].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[52].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[53].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[54].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[55].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[56].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[57].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[58].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[59].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[60].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[61].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[62].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[63].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[64].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[65].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[66].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[66].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[68].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(63F, -14F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(63F, -14F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(63F, 1F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(63F, -15F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(-63F, -15F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-63F, 1F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-63F, -14F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-63F, -14F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[86].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[87].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[88].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[89].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[91].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[92].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[93].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[94].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[95].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[96].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[97].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[98].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[99].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[100].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[102].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(56F, -6F, -12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(61F, -6F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[106].setRotationPoint(56F, -6F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[107].setRotationPoint(61F, -6F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[108].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[109].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[110].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[111].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[114].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[115].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[116].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[117].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[118].setRotationPoint(63F, -15F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(63F, -17F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(63F, 1F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[121].setRotationPoint(63F, -15F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[122].setRotationPoint(63F, -17F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[123].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[124].setRotationPoint(-63F, -15F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[125].setRotationPoint(-63.5F, -17F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[126].setRotationPoint(-63F, -15F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-63F, -19F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(-63F, -20F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(-63F, -20F, -3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[131].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[132].setRotationPoint(-63F, -15F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[133].setRotationPoint(-63.5F, -17F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[134].setRotationPoint(-63F, -15F, 9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[135].setRotationPoint(-63F, -19F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[136].setRotationPoint(-63F, -20F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[137].setRotationPoint(-61F, 6F, -10.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[138].setRotationPoint(-61F, 6F, 10.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 2
		bodyModel[139].setRotationPoint(-5.5F, 3F, 5F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[140].setRotationPoint(12.5F, 3F, 9F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 52
		bodyModel[141].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[142].setRotationPoint(21.5F, 3F, 8.1F);
		bodyModel[142].rotateAngleX = -0.78539816F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[143].setRotationPoint(21.49F, 3F, 7.6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[144].setRotationPoint(30.51F, 3F, 7.6F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 38
		bodyModel[145].setRotationPoint(-40.5F, -7F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 38
		bodyModel[146].setRotationPoint(31.5F, -7F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 16, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[147].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 19, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[148].setRotationPoint(36.5F, -16.25F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,0F, 0F, 0F, -7.01F, 0F, 0F, -7.01F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, -7.01F, 0F, 0F, -7.01F, 0.5F, -0.01F, 0F, 0.5F, -0.01F); // Box 38 cull
		bodyModel[149].setRotationPoint(-39.5F, -14F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,-0.01F, 0F, -0.01F, -7F, 0F, -0.01F, -7F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0.5F, -0.01F, -7F, 0.5F, -0.01F, -7F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[150].setRotationPoint(-44.5F, -14F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 83, 0, 1, 0F,0F, 0F, -0.01F, -7F, 0F, -0.01F, -7F, 0.17F, 0F, 0F, 0.17F, 0F, 0F, 0F, -0.01F, -7F, 0F, -0.01F, -7F, -0.17F, 0F, 0F, -0.17F, 0F); // Box 275 glow
		bodyModel[151].setRotationPoint(-44.5F, -12.49F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 83, 0, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, -0.16F, -0.01F, 0F, -0.16F, -0.01F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0.16F, -0.01F, 0F, 0.16F, -0.01F); // Box 285 glow
		bodyModel[152].setRotationPoint(-39.5F, -12.65F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 100, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[153].setRotationPoint(-44.5F, -11F, -9.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 96, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[154].setRotationPoint(-59.5F, -11F, 9.9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[155].setRotationPoint(-39.5F, -17F, -0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[156].setRotationPoint(-25.5F, -17F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[157].setRotationPoint(-11.5F, -17F, -0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[158].setRotationPoint(2.5F, -17F, -0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[159].setRotationPoint(16.5F, -17F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[160].setRotationPoint(30.5F, -17F, -0.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[161].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[162].setRotationPoint(50.5F, -15F, -5F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[163].setRotationPoint(37.5F, -15F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[164].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[165].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[165].setRotationPoint(43.5F, -15F, -6F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 38
		bodyModel[166].setRotationPoint(40.5F, -15F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 13, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[167].setRotationPoint(40.5F, -13F, -5.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[168].setRotationPoint(44.5F, -5F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[169].setRotationPoint(44.5F, -5F, -4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[170].setRotationPoint(45.5F, -5F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[171].setRotationPoint(44.5F, -5F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[172].setRotationPoint(44.5F, -5F, 8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[173].setRotationPoint(45.5F, -5F, 8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[174].setRotationPoint(41F, -5F, 9F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[175].setRotationPoint(-45.5F, -15F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[176].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[177].addBox(0F, 0F, 0F, 10, 16, 1, 0F); // Box 38
		bodyModel[177].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[178].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[179].setRotationPoint(-60.5F, -15F, 6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[180].setRotationPoint(-42.5F, -7F, 7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[181].setRotationPoint(-55.5F, -5F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[182].setRotationPoint(-54.5F, -5F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[183].setRotationPoint(-55.5F, -5F, -9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[184].setRotationPoint(-55.5F, -5F, 4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[185].setRotationPoint(-54.5F, -5F, 3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[186].setRotationPoint(-55.5F, -5F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[187].setRotationPoint(-55.5F, -5F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(-51F, -4F, -10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[189].setRotationPoint(56.5F, -14F, 10.5F);

		bodyModel[190].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[190].setRotationPoint(56.5F, -14F, -10.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[191].setRotationPoint(38.5F, -3F, -4.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[192].setRotationPoint(38F, -6F, -4.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[193].setRotationPoint(37.75F, -4.5F, 2.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[194].setRotationPoint(37.75F, -4.5F, -4.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[195].setRotationPoint(39.25F, -4.5F, 2.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[196].setRotationPoint(39.25F, -4.5F, -4.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[197].setRotationPoint(38F, -2.5F, -4.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[198].setRotationPoint(37.5F, -1.5F, 1.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[199].setRotationPoint(37.5F, -1.5F, -4.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[200].setRotationPoint(45.87F, -4F, 8.63F);
		bodyModel[200].rotateAngleY = 0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[201].setRotationPoint(42.17F, -4F, 9.1F);
		bodyModel[201].rotateAngleY = 0.78539816F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[202].setRotationPoint(45.87F, -4F, -4.69F);
		bodyModel[202].rotateAngleY = 0.78539816F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[203].setRotationPoint(-54.53F, -4F, 3.63F);
		bodyModel[203].rotateAngleY = 0.78539816F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[204].setRotationPoint(-54.95F, -4F, -0.5F);
		bodyModel[204].rotateAngleY = 0.78539816F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[205].setRotationPoint(-54.53F, -4F, -9.69F);
		bodyModel[205].rotateAngleY = 0.78539816F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[206].setRotationPoint(-48.5F, -3F, -9.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 527
		bodyModel[207].setRotationPoint(-47F, -6F, -9.25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[208].setRotationPoint(-47.75F, -4.5F, 4.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[209].setRotationPoint(-47.75F, -4.5F, -9.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[210].setRotationPoint(-48.75F, -4.5F, 4.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[211].setRotationPoint(-48.75F, -4.5F, -9.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[212].setRotationPoint(-46.5F, -2.5F, -9.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[213].setRotationPoint(-47F, -1.5F, 3.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[214].setRotationPoint(-47F, -1.5F, -9.25F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[215].setRotationPoint(-51F, -2F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.5F, -2F, -0.01F, -0.5F, -2F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128 cull
		bodyModel[216].setRotationPoint(-51F, -4F, -6.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[217].setRotationPoint(-53.25F, -4F, 3.99F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[218].setRotationPoint(-44.5F, -18F, 7.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[219].setRotationPoint(-44.5F, -18F, -8.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 81, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[220].setRotationPoint(-44.5F, -16F, 8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 81, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[221].setRotationPoint(-44.5F, -17F, 5.25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 81, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[222].setRotationPoint(-44.5F, -16F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 81, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[223].setRotationPoint(-44.5F, -17F, -8.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[224].setRotationPoint(36.5F, -18F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[225].setRotationPoint(36.5F, -18F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[226].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[227].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[228].setRotationPoint(36.5F, -17F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[229].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[230].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[230].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[231].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[231].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[232].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[232].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[233].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[233].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[234].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[234].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[235].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[235].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[236].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[236].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[237].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[237].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[238].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[239].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[240].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[241].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[242].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[243].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[244].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[245].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[246].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[247].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[248].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[249].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[250].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[251].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[252].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[253].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[254].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[255].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[255].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[256].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[256].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[257].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[257].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[258].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[258].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[259].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[259].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[260].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[260].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[261].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[261].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[262].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[263].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[263].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[264].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[264].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[265].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[265].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F); // Box 128
		bodyModel[266].setRotationPoint(47.5F, -18F, 8.71F);
		bodyModel[266].rotateAngleX = 1.04283423F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[267].setRotationPoint(47.5F, -17.25F, 10F);
		bodyModel[267].rotateAngleX = 0.41887902F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[268].setRotationPoint(-57.5F, -18.86F, -9.22F);
		bodyModel[268].rotateAngleX = -1.04283423F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[269].setRotationPoint(-57.5F, -17.65F, -10.92F);
		bodyModel[269].rotateAngleX = -0.41887902F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[270].setRotationPoint(63F, -20F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[271].setRotationPoint(63F, -20F, -3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[272].setRotationPoint(63F, -16F, -4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[273].setRotationPoint(63F, -16F, 1F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[274].setRotationPoint(63F, -19F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[275].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[276].setRotationPoint(63F, -20F, 3F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[277].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[278].setRotationPoint(63F, -19F, -10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[279].setRotationPoint(63F, -19F, 7F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[280].setRotationPoint(63F, -16F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[281].setRotationPoint(63F, -16F, 0F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[282].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[283].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[284].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[285].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[286].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[287].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[288].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[289].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[290].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[291].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[292].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[293].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[294].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 2
		bodyModel[294].setRotationPoint(-13.5F, 3F, 2F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 59
		bodyModel[295].setRotationPoint(-13.5F, 3F, -10F);

		bodyModel[296].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 2
		bodyModel[296].setRotationPoint(-24.5F, 3F, 5F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[297].setRotationPoint(-2.5F, 3F, 9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[298].setRotationPoint(-5.5F, 3F, -8.9F);
		bodyModel[298].rotateAngleX = -0.78539816F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[299].setRotationPoint(-5.51F, 3F, -9.4F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[300].setRotationPoint(3.51F, 3F, -9.4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[301].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[302].setRotationPoint(56.5F, 4F, 6.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[303].setRotationPoint(56.5F, 7F, 9.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[304].setRotationPoint(56.5F, 2.5F, 6.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[305].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[306].setRotationPoint(56.5F, 5.5F, 8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[307].setRotationPoint(56.5F, 5.5F, 9.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[308].setRotationPoint(60.49F, 3F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[309].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[310].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[311].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[312].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[313].setRotationPoint(56.5F, 4F, -8.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 630
		bodyModel[314].setRotationPoint(56.5F, 7F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[315].setRotationPoint(56.5F, 2.5F, -6.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[316].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[317].setRotationPoint(56.5F, 5.5F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[318].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[319].setRotationPoint(60.49F, 3F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[320].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[321].setRotationPoint(56.51F, 3F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[322].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[323].setRotationPoint(50.5F, -15F, -6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[324].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[325].setRotationPoint(-56.5F, -15F, 5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[326].setRotationPoint(-45.5F, -15F, 5F);

		bodyModel[327].addBox(0F, 0F, 0F, 10, 4, 5, 0F); // Box 2
		bodyModel[327].setRotationPoint(-1.5F, 3F, 5F);

		bodyModel[328].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 2
		bodyModel[328].setRotationPoint(-7.5F, 3F, 9F);

		bodyModel[329].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[329].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[330].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[330].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[331].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[332].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[333].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[334].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[335].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[335].setRotationPoint(46.5F, -15F, -5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 38 cull
		bodyModel[336].setRotationPoint(-53F, -4F, -9.99F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.5F, -2F, -0.01F, -0.5F, -2F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128 cull
		bodyModel[337].setRotationPoint(-51F, -1F, -8.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[338].setRotationPoint(37.5F, -5F, 9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[339].setRotationPoint(38.5F, -5F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[340].setRotationPoint(37.5F, -5F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[341].setRotationPoint(38.5F, -4F, 8.63F);
		bodyModel[341].rotateAngleY = 0.78539816F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 612 cull
		bodyModel[342].setRotationPoint(39.5F, -4F, 8.99F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.35F, 0F, -0.5F, -0.85F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 612 cull
		bodyModel[343].setRotationPoint(43F, -4F, 8.99F);

		bodyModel[344].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[344].setRotationPoint(47.5F, -15F, 2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F); // Box 38
		bodyModel[345].setRotationPoint(48.9F, -2F, 9.95F);
		bodyModel[345].rotateAngleY = -2.18166156F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[346].setRotationPoint(49.25F, -1F, 9.6F);
		bodyModel[346].rotateAngleY = -2.18166156F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[347].setRotationPoint(48.9F, 0.5F, 9.95F);
		bodyModel[347].rotateAngleY = -2.18166156F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 123, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[348].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[349].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[349].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[350].setRotationPoint(26.5F, -8F, 7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[351].setRotationPoint(25F, -1F, 5F);

		bodyModel[352].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[352].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[353].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[354].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[355].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[356].setRotationPoint(15.5F, -3F, 7F);
		bodyModel[356].rotateAngleY = -3.14159265F;

		bodyModel[357].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[357].setRotationPoint(15.5F, -8F, 7F);
		bodyModel[357].rotateAngleY = -3.14159265F;

		bodyModel[358].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[358].setRotationPoint(15.5F, -3F, -7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[359].setRotationPoint(15.5F, -8F, -7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[360].setRotationPoint(14F, -1F, 5F);

		bodyModel[361].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[361].setRotationPoint(14F, -1F, -9F);

		bodyModel[362].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[362].setRotationPoint(15.5F, -3F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(15.5F, -3F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[364].setRotationPoint(15.5F, -3F, -7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[365].setRotationPoint(15.5F, -3F, -7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[366].setRotationPoint(15.5F, -5F, 7F);
		bodyModel[366].rotateAngleY = -3.14159265F;

		bodyModel[367].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[367].setRotationPoint(15.5F, -5F, 7F);
		bodyModel[367].rotateAngleY = -3.14159265F;

		bodyModel[368].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[368].setRotationPoint(15.5F, -5F, -7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[369].setRotationPoint(15.5F, -5F, -7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[370].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(4.5F, -8F, 7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[372].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[373].setRotationPoint(4.5F, -8F, -7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[374].setRotationPoint(3F, -1F, 5F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[375].setRotationPoint(3F, -1F, -9F);

		bodyModel[376].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[376].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[376].rotateAngleY = -3.14159265F;

		bodyModel[377].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[377].setRotationPoint(4.5F, -3F, 7F);
		bodyModel[377].rotateAngleY = -3.14159265F;

		bodyModel[378].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[378].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(4.5F, -3F, -7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[380].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[381].setRotationPoint(4.5F, -5F, 7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[382].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[382].rotateAngleY = -3.14159265F;

		bodyModel[383].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[383].setRotationPoint(4.5F, -5F, -7F);
		bodyModel[383].rotateAngleY = -3.14159265F;

		bodyModel[384].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[384].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[384].rotateAngleY = -3.14159265F;

		bodyModel[385].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[385].setRotationPoint(-6.5F, -8F, 7F);
		bodyModel[385].rotateAngleY = -3.14159265F;

		bodyModel[386].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[386].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[386].rotateAngleY = -3.14159265F;

		bodyModel[387].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[387].setRotationPoint(-6.5F, -8F, -7F);
		bodyModel[387].rotateAngleY = -3.14159265F;

		bodyModel[388].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[388].setRotationPoint(-8F, -1F, 5F);

		bodyModel[389].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[389].setRotationPoint(-8F, -1F, -9F);

		bodyModel[390].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[390].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[391].setRotationPoint(-6.5F, -3F, 7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[392].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[393].setRotationPoint(-6.5F, -3F, -7F);
		bodyModel[393].rotateAngleY = -3.14159265F;

		bodyModel[394].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[394].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[394].rotateAngleY = -3.14159265F;

		bodyModel[395].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[395].setRotationPoint(-6.5F, -5F, 7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[396].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[397].setRotationPoint(-6.5F, -5F, -7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[398].setRotationPoint(-17.5F, -3F, 7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[399].setRotationPoint(-17.5F, -8F, 7F);
		bodyModel[399].rotateAngleY = -3.14159265F;

		bodyModel[400].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[400].setRotationPoint(-17.5F, -3F, -7F);
		bodyModel[400].rotateAngleY = -3.14159265F;

		bodyModel[401].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[401].setRotationPoint(-17.5F, -8F, -7F);
		bodyModel[401].rotateAngleY = -3.14159265F;

		bodyModel[402].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[402].setRotationPoint(-19F, -1F, 5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[403].setRotationPoint(-19F, -1F, -9F);

		bodyModel[404].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(-17.5F, -3F, 7F);
		bodyModel[404].rotateAngleY = -3.14159265F;

		bodyModel[405].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[405].setRotationPoint(-17.5F, -3F, 7F);
		bodyModel[405].rotateAngleY = -3.14159265F;

		bodyModel[406].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[406].setRotationPoint(-17.5F, -3F, -7F);
		bodyModel[406].rotateAngleY = -3.14159265F;

		bodyModel[407].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[407].setRotationPoint(-17.5F, -3F, -7F);
		bodyModel[407].rotateAngleY = -3.14159265F;

		bodyModel[408].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[408].setRotationPoint(-17.5F, -5F, 7F);
		bodyModel[408].rotateAngleY = -3.14159265F;

		bodyModel[409].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[409].setRotationPoint(-17.5F, -5F, 7F);
		bodyModel[409].rotateAngleY = -3.14159265F;

		bodyModel[410].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[410].setRotationPoint(-17.5F, -5F, -7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[411].setRotationPoint(-17.5F, -5F, -7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[412].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[413].setRotationPoint(-28.5F, -8F, 7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part test
		bodyModel[414].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[415].setRotationPoint(-28.5F, -8F, -7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[416].setRotationPoint(-30F, -1F, 5F);

		bodyModel[417].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[417].setRotationPoint(-30F, -1F, -9F);

		bodyModel[418].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[418].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[419].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[420].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part test
		bodyModel[421].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[422].setRotationPoint(-28.5F, -5F, 7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part cull
		bodyModel[423].setRotationPoint(-28.5F, -5F, 7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull test
		bodyModel[424].setRotationPoint(-28.5F, -5F, -7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull test
		bodyModel[425].setRotationPoint(-28.5F, -5F, -7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[426].setRotationPoint(-39.5F, -3F, -7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[427].setRotationPoint(-39.5F, -8F, -7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[428].setRotationPoint(-41F, -1F, -9F);

		bodyModel[429].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[429].setRotationPoint(-39.5F, -3F, -7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(-39.5F, -3F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[431].setRotationPoint(-39.5F, -5F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[432].setRotationPoint(-39.5F, -5F, -7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[433].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[434].setRotationPoint(26.5F, -8F, -7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[435].setRotationPoint(25F, -1F, -9F);

		bodyModel[436].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[436].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[438].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part cull
		bodyModel[439].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,-0.01F, 0F, 0F, -7.01F, 0F, 0F, -7.01F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0F, -7.01F, 0F, 0F, -7.01F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 38 cull
		bodyModel[440].setRotationPoint(-39.5F, -14F, 7F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 83, 1, 3, 0F,-0.01F, 0F, -0.01F, -7.01F, 0F, -0.01F, -7.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -7.01F, 0F, -0.01F, -7.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 275 cull
		bodyModel[441].setRotationPoint(-44.5F, -14F, -10F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 83, 0, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 275 glow
		bodyModel[442].setRotationPoint(-44.5F, -12.99F, -9.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 83, 0, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 285 glow
		bodyModel[443].setRotationPoint(-39.5F, -12.99F, 7.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 38
		bodyModel[444].setRotationPoint(-40.5F, -8F, 3F);

		bodyModel[445].addBox(0F, 0F, 0F, 0, 12, 7, 0F); // Box 38
		bodyModel[445].setRotationPoint(-40F, -17F, 3F);

		bodyModel[446].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 38
		bodyModel[446].setRotationPoint(31.5F, -8F, -10F);

		bodyModel[447].addBox(0F, 0F, 0F, 0, 12, 7, 0F); // Box 38
		bodyModel[447].setRotationPoint(32F, -17F, -10F);

		bodyModel[448].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 38
		bodyModel[448].setRotationPoint(-40.5F, -17F, 6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38
		bodyModel[449].setRotationPoint(-41.5F, -5F, 3F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,-0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38
		bodyModel[450].setRotationPoint(-41.5F, -17F, 6F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 38
		bodyModel[451].setRotationPoint(31.5F, -17F, -10F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,0F, 0F, 0F, -7.01F, 0F, 0F, -7.01F, -0.5F, -3.01F, 0F, -0.5F, -3.01F, 0F, -0.5F, 0F, -7.05F, -0.5F, 0F, -7.01F, 0F, -3.01F, 0F, 0F, -3.01F); // Box 38
		bodyModel[452].setRotationPoint(-39.5F, -13.5F, 7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,-0.01F, -0.5F, -3.01F, -7F, -0.5F, -3.01F, -7F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -3.01F, -7F, 0F, -3.01F, -7F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 488
		bodyModel[453].setRotationPoint(-44.5F, -13.5F, -13F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 81, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[454].setRotationPoint(-44.5F, -16F, 7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 81, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[455].setRotationPoint(-44.5F, -18F, 6.7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 81, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[456].setRotationPoint(-44.5F, -16F, -10F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 81, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[457].setRotationPoint(-44.5F, -18F, -9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[458].setRotationPoint(38.5F, -3F, -4.25F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[459].setRotationPoint(38F, -6F, -4.25F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[460].setRotationPoint(37.75F, -4.5F, 9.25F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[461].setRotationPoint(39.25F, -4.5F, 9.25F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[462].setRotationPoint(38F, -2.5F, -4.25F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[463].setRotationPoint(37.5F, -1.5F, 8.75F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[464].setRotationPoint(42F, -5F, 9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[465].setRotationPoint(43.17F, -4F, 9.1F);
		bodyModel[465].rotateAngleY = 0.78539816F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.09F, 0F, 0.25F, 0.09F, 0F, 0.25F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0.09F, -1F, 0.25F, 0.09F, -1F, 0.25F); // Box 199
		bodyModel[466].setRotationPoint(-56.5F, -18.25F, -10.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 118, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[467].setRotationPoint(-61.5F, -8.25F, -11.01F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 118, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 503
		bodyModel[468].setRotationPoint(-61.5F, -8.25F, 11.01F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.09F, 0F, 0.25F, 0.09F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.09F, -1F, 0.25F, 0.09F, -1F, 0.25F, 0F, 1.15F, 0F, 0F, 1.15F, 0F); // Box 504
		bodyModel[469].setRotationPoint(47.5F, -18.25F, 8.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128 glow
		bodyModel[470].setRotationPoint(-44.5F, -17F, -5.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 505 glow
		bodyModel[471].setRotationPoint(-39.5F, -17F, 3.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128 glow
		bodyModel[472].setRotationPoint(31.5F, -17F, -5.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.01F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 505 glow
		bodyModel[473].setRotationPoint(-40F, -17F, 3.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 81, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[474].setRotationPoint(-44.5F, -17F, -1.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[475].setRotationPoint(53.5F, -18.86F, -9.22F);
		bodyModel[475].rotateAngleX = -1.04283423F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[476].setRotationPoint(53.5F, -17.65F, -10.92F);
		bodyModel[476].rotateAngleX = -0.41887902F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[477].setRotationPoint(-57.5F, -18.86F, -9.22F);
		bodyModel[477].rotateAngleX = -1.04283423F;

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[478].setRotationPoint(-57.5F, -17.65F, -10.92F);
		bodyModel[478].rotateAngleX = -0.41887902F;

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F); // Box 128
		bodyModel[479].setRotationPoint(48.5F, -18F, 8.71F);
		bodyModel[479].rotateAngleX = 1.04283423F;

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[480].setRotationPoint(48.5F, -17.25F, 10F);
		bodyModel[480].rotateAngleX = 0.41887902F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F); // Box 128
		bodyModel[481].setRotationPoint(53.5F, -18F, 8.71F);
		bodyModel[481].rotateAngleX = 1.04283423F;

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[482].setRotationPoint(53.5F, -17.25F, 10F);
		bodyModel[482].rotateAngleX = 0.41887902F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.425F, -0.75F, 0F, -0.425F, -0.75F); // Box 128
		bodyModel[483].setRotationPoint(-57.5F, -18F, 8.71F);
		bodyModel[483].rotateAngleX = 1.04283423F;

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.08F, -0.75F, 0F, 0.08F, -0.75F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.75F, 0F, -0.54F, -0.75F); // Box 128
		bodyModel[484].setRotationPoint(-57.5F, -17.25F, 10F);
		bodyModel[484].rotateAngleX = 0.41887902F;

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[485].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[486].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[487].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[488].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[489].setRotationPoint(60.49F, 6F, 9.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[490].setRotationPoint(56.51F, 6F, 9.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[491].setRotationPoint(60.49F, 6F, -11.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[492].setRotationPoint(56.51F, 6F, -11.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 2
		bodyModel[493].setRotationPoint(56.5F, 7F, 9.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[494].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[495].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 630
		bodyModel[496].setRotationPoint(56.5F, 7F, -11.25F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[497].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[498].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[499].setRotationPoint(-60.5F, 3F, 10.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 68, 149, textureX, textureY); // Box 31
		bodyModel[501] = new ModelRendererTurbo(this, 68, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[502] = new ModelRendererTurbo(this, 68, 139, textureX, textureY); // Box 31
		bodyModel[503] = new ModelRendererTurbo(this, 56, 151, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[504] = new ModelRendererTurbo(this, 56, 149, textureX, textureY); // Box 31
		bodyModel[505] = new ModelRendererTurbo(this, 56, 141, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[506] = new ModelRendererTurbo(this, 56, 139, textureX, textureY); // Box 31
		bodyModel[507] = new ModelRendererTurbo(this, 310, 155, textureX, textureY); // Box 2
		bodyModel[508] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 29
		bodyModel[509] = new ModelRendererTurbo(this, 276, 155, textureX, textureY); // Box 2
		bodyModel[510] = new ModelRendererTurbo(this, 276, 148, textureX, textureY); // Box 35
		bodyModel[511] = new ModelRendererTurbo(this, 276, 152, textureX, textureY); // Box 2 cull test
		bodyModel[512] = new ModelRendererTurbo(this, 276, 145, textureX, textureY); // Box 41 cull test
		bodyModel[513] = new ModelRendererTurbo(this, 82, 159, textureX, textureY); // Box 2
		bodyModel[514] = new ModelRendererTurbo(this, 82, 155, textureX, textureY); // Box 33
		bodyModel[515] = new ModelRendererTurbo(this, 130, 159, textureX, textureY); // Box 2
		bodyModel[516] = new ModelRendererTurbo(this, 130, 155, textureX, textureY); // Box 37
		bodyModel[517] = new ModelRendererTurbo(this, 89, 159, textureX, textureY); // Box 2 cull test
		bodyModel[518] = new ModelRendererTurbo(this, 89, 155, textureX, textureY); // Box 41 cull test
		bodyModel[519] = new ModelRendererTurbo(this, 47, 77, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 8, 76, textureX, textureY); // Box 255
		bodyModel[522] = new ModelRendererTurbo(this, 7, 102, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 8, 96, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Box 251
		bodyModel[525] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 253
		bodyModel[526] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 578
		bodyModel[531] = new ModelRendererTurbo(this, 1, 77, textureX, textureY); // Box 579
		bodyModel[532] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 580
		bodyModel[533] = new ModelRendererTurbo(this, 384, 49, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 395, 82, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 399, 90, textureX, textureY); // Box 128
		bodyModel[536] = new ModelRendererTurbo(this, 399, 76, textureX, textureY); // Box 255
		bodyModel[537] = new ModelRendererTurbo(this, 398, 102, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 399, 96, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 398, 63, textureX, textureY); // Box 251
		bodyModel[540] = new ModelRendererTurbo(this, 399, 70, textureX, textureY); // Box 253
		bodyModel[541] = new ModelRendererTurbo(this, 410, 107, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 410, 98, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 128
		bodyModel[544] = new ModelRendererTurbo(this, 410, 84, textureX, textureY); // Box 578
		bodyModel[545] = new ModelRendererTurbo(this, 410, 93, textureX, textureY); // Box 579
		bodyModel[546] = new ModelRendererTurbo(this, 411, 89, textureX, textureY); // Box 580
		bodyModel[547] = new ModelRendererTurbo(this, 49, 91, textureX, textureY); // Box 128
		bodyModel[548] = new ModelRendererTurbo(this, 54, 101, textureX, textureY); // Box 128
		bodyModel[549] = new ModelRendererTurbo(this, 49, 101, textureX, textureY); // Box 128
		bodyModel[550] = new ModelRendererTurbo(this, 51, 51, textureX, textureY); // Box 128
		bodyModel[551] = new ModelRendererTurbo(this, 66, 58, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 46, 58, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 66, 55, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 46, 55, textureX, textureY); // Box 606
		bodyModel[555] = new ModelRendererTurbo(this, 414, 59, textureX, textureY); // Box 128
		bodyModel[556] = new ModelRendererTurbo(this, 409, 62, textureX, textureY); // Box 128
		bodyModel[557] = new ModelRendererTurbo(this, 429, 62, textureX, textureY); // Box 128
		bodyModel[558] = new ModelRendererTurbo(this, 409, 59, textureX, textureY); // Box 128
		bodyModel[559] = new ModelRendererTurbo(this, 429, 59, textureX, textureY); // Box 606
		bodyModel[560] = new ModelRendererTurbo(this, 347, 45, textureX, textureY); // Box 128
		bodyModel[561] = new ModelRendererTurbo(this, 347, 55, textureX, textureY); // Box 128
		bodyModel[562] = new ModelRendererTurbo(this, 361, 55, textureX, textureY); // Box 128
		bodyModel[563] = new ModelRendererTurbo(this, 141, 163, textureX, textureY); // Box 52
		bodyModel[564] = new ModelRendererTurbo(this, 156, 175, textureX, textureY); // Box 52
		bodyModel[565] = new ModelRendererTurbo(this, 191, 177, textureX, textureY); // Box 52
		bodyModel[566] = new ModelRendererTurbo(this, 83, 176, textureX, textureY); // Box 52
		bodyModel[567] = new ModelRendererTurbo(this, 69, 176, textureX, textureY); // Box 52
		bodyModel[568] = new ModelRendererTurbo(this, 78, 176, textureX, textureY); // Box 52
		bodyModel[569] = new ModelRendererTurbo(this, 156, 176, textureX, textureY); // Box 52
		bodyModel[570] = new ModelRendererTurbo(this, 103, 163, textureX, textureY); // Box 52
		bodyModel[571] = new ModelRendererTurbo(this, 76, 163, textureX, textureY); // Box 52
		bodyModel[572] = new ModelRendererTurbo(this, 108, 163, textureX, textureY); // Box 52
		bodyModel[573] = new ModelRendererTurbo(this, 137, 155, textureX, textureY); // Box 52
		bodyModel[574] = new ModelRendererTurbo(this, 152, 155, textureX, textureY); // Box 41
		bodyModel[575] = new ModelRendererTurbo(this, 162, 157, textureX, textureY); // Box 41
		bodyModel[576] = new ModelRendererTurbo(this, 154, 157, textureX, textureY); // Box 41
		bodyModel[577] = new ModelRendererTurbo(this, 138, 157, textureX, textureY); // Box 41
		bodyModel[578] = new ModelRendererTurbo(this, 139, 159, textureX, textureY); // Box 41
		bodyModel[579] = new ModelRendererTurbo(this, 145, 159, textureX, textureY); // Box 41
		bodyModel[580] = new ModelRendererTurbo(this, 174, 163, textureX, textureY); // Box 52
		bodyModel[581] = new ModelRendererTurbo(this, 211, 174, textureX, textureY); // Box 52
		bodyModel[582] = new ModelRendererTurbo(this, 243, 169, textureX, textureY); // Box 52
		bodyModel[583] = new ModelRendererTurbo(this, 196, 161, textureX, textureY); // Box 52
		bodyModel[584] = new ModelRendererTurbo(this, 189, 160, textureX, textureY); // Box 52
		bodyModel[585] = new ModelRendererTurbo(this, 195, 167, textureX, textureY); // Box 52
		bodyModel[586] = new ModelRendererTurbo(this, 203, 159, textureX, textureY); // Box 52
		bodyModel[587] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 52
		bodyModel[588] = new ModelRendererTurbo(this, 241, 170, textureX, textureY); // Box 52
		bodyModel[589] = new ModelRendererTurbo(this, 270, 175, textureX, textureY); // Box 41
		bodyModel[590] = new ModelRendererTurbo(this, 271, 171, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[591] = new ModelRendererTurbo(this, 260, 172, textureX, textureY); // Box 52
		bodyModel[592] = new ModelRendererTurbo(this, 241, 182, textureX, textureY); // Box 2
		bodyModel[593] = new ModelRendererTurbo(this, 241, 190, textureX, textureY); // Box 2
		bodyModel[594] = new ModelRendererTurbo(this, 255, 160, textureX, textureY); // Box 2
		bodyModel[595] = new ModelRendererTurbo(this, 257, 171, textureX, textureY); // Box 59
		bodyModel[596] = new ModelRendererTurbo(this, 269, 163, textureX, textureY); // Box 41
		bodyModel[597] = new ModelRendererTurbo(this, 268, 160, textureX, textureY); // Box 41
		bodyModel[598] = new ModelRendererTurbo(this, 290, 160, textureX, textureY); // Box 41
		bodyModel[599] = new ModelRendererTurbo(this, 247, 160, textureX, textureY); // Box 41
		bodyModel[600] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 41
		bodyModel[601] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 41
		bodyModel[602] = new ModelRendererTurbo(this, 277, 170, textureX, textureY); // Box 41
		bodyModel[603] = new ModelRendererTurbo(this, 276, 167, textureX, textureY); // Box 41
		bodyModel[604] = new ModelRendererTurbo(this, 298, 167, textureX, textureY); // Box 41
		bodyModel[605] = new ModelRendererTurbo(this, 245, 156, textureX, textureY); // Box 52
		bodyModel[606] = new ModelRendererTurbo(this, 210, 155, textureX, textureY); // Box 52
		bodyModel[607] = new ModelRendererTurbo(this, 226, 160, textureX, textureY); // Box 52
		bodyModel[608] = new ModelRendererTurbo(this, 209, 155, textureX, textureY); // Box 52
		bodyModel[609] = new ModelRendererTurbo(this, 190, 155, textureX, textureY); // Box 52
		bodyModel[610] = new ModelRendererTurbo(this, 195, 155, textureX, textureY); // Box 52
		bodyModel[611] = new ModelRendererTurbo(this, 202, 155, textureX, textureY); // Box 52
		bodyModel[612] = new ModelRendererTurbo(this, 316, 175, textureX, textureY); // Box 52
		bodyModel[613] = new ModelRendererTurbo(this, 334, 176, textureX, textureY); // Box 52
		bodyModel[614] = new ModelRendererTurbo(this, 339, 176, textureX, textureY); // Box 52
		bodyModel[615] = new ModelRendererTurbo(this, 365, 178, textureX, textureY); // Box 52
		bodyModel[616] = new ModelRendererTurbo(this, 357, 175, textureX, textureY); // Box 52
		bodyModel[617] = new ModelRendererTurbo(this, 345, 178, textureX, textureY); // Box 52
		bodyModel[618] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[619] = new ModelRendererTurbo(this, 349, 164, textureX, textureY); // Box 2
		bodyModel[620] = new ModelRendererTurbo(this, 332, 179, textureX, textureY); // Box 59
		bodyModel[621] = new ModelRendererTurbo(this, 287, 186, textureX, textureY); // Box 2
		bodyModel[622] = new ModelRendererTurbo(this, 332, 190, textureX, textureY); // Box 2
		bodyModel[623] = new ModelRendererTurbo(this, 363, 167, textureX, textureY); // Box 41
		bodyModel[624] = new ModelRendererTurbo(this, 362, 165, textureX, textureY); // Box 41
		bodyModel[625] = new ModelRendererTurbo(this, 384, 165, textureX, textureY); // Box 41
		bodyModel[626] = new ModelRendererTurbo(this, 337, 164, textureX, textureY); // Box 52
		bodyModel[627] = new ModelRendererTurbo(this, 344, 165, textureX, textureY); // Box 52
		bodyModel[628] = new ModelRendererTurbo(this, 464, 195, textureX, textureY); // Box 2
		bodyModel[629] = new ModelRendererTurbo(this, 464, 204, textureX, textureY); // Box 2
		bodyModel[630] = new ModelRendererTurbo(this, 461, 195, textureX, textureY); // Box 52
		bodyModel[631] = new ModelRendererTurbo(this, 394, 187, textureX, textureY); // Box 52
		bodyModel[632] = new ModelRendererTurbo(this, 415, 187, textureX, textureY); // Box 52
		bodyModel[633] = new ModelRendererTurbo(this, 381, 189, textureX, textureY); // Box 52
		bodyModel[634] = new ModelRendererTurbo(this, 398, 178, textureX, textureY); // Box 52
		bodyModel[635] = new ModelRendererTurbo(this, 419, 178, textureX, textureY); // Box 52
		bodyModel[636] = new ModelRendererTurbo(this, 477, 181, textureX, textureY); // Box 41
		bodyModel[637] = new ModelRendererTurbo(this, 476, 179, textureX, textureY); // Box 41
		bodyModel[638] = new ModelRendererTurbo(this, 498, 179, textureX, textureY); // Box 41
		bodyModel[639] = new ModelRendererTurbo(this, 459, 190, textureX, textureY); // Box 52
		bodyModel[640] = new ModelRendererTurbo(this, 463, 180, textureX, textureY); // Box 52
		bodyModel[641] = new ModelRendererTurbo(this, 12, 326, textureX, textureY); // Box 38
		bodyModel[642] = new ModelRendererTurbo(this, 15, 331, textureX, textureY); // Box 38
		bodyModel[643] = new ModelRendererTurbo(this, 14, 335, textureX, textureY); // Box 38
		bodyModel[644] = new ModelRendererTurbo(this, 301, 132, textureX, textureY); // Box 2
		bodyModel[645] = new ModelRendererTurbo(this, 32, 117, textureX, textureY); // Box 2
		bodyModel[646] = new ModelRendererTurbo(this, 235, 224, textureX, textureY); // Box 38
		bodyModel[647] = new ModelRendererTurbo(this, 372, 299, textureX, textureY,"cull"); // Box 612 cull
		bodyModel[648] = new ModelRendererTurbo(this, 27, 269, textureX, textureY); // Box 530
		bodyModel[649] = new ModelRendererTurbo(this, 64, 304, textureX, textureY); // Box 38
		bodyModel[650] = new ModelRendererTurbo(this, 325, 303, textureX, textureY); // Box 38
		bodyModel[651] = new ModelRendererTurbo(this, 291, 175, textureX, textureY); // Box 52
		bodyModel[652] = new ModelRendererTurbo(this, 81, 363, textureX, textureY); // Box 488
		bodyModel[653] = new ModelRendererTurbo(this, 285, 371, textureX, textureY); // Box 488
		bodyModel[654] = new ModelRendererTurbo(this, 285, 369, textureX, textureY); // Box 488
		bodyModel[655] = new ModelRendererTurbo(this, 284, 361, textureX, textureY); // Box 488
		bodyModel[656] = new ModelRendererTurbo(this, 107, 385, textureX, textureY); // Box 656
		bodyModel[657] = new ModelRendererTurbo(this, 106, 393, textureX, textureY); // Box 657
		bodyModel[658] = new ModelRendererTurbo(this, 95, 401, textureX, textureY); // Box 2
		bodyModel[659] = new ModelRendererTurbo(this, 67, 401, textureX, textureY); // Box 2
		bodyModel[660] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 2
		bodyModel[661] = new ModelRendererTurbo(this, 108, 401, textureX, textureY); // Box 2
		bodyModel[662] = new ModelRendererTurbo(this, 72, 409, textureX, textureY); // Box 2
		bodyModel[663] = new ModelRendererTurbo(this, 280, 420, textureX, textureY); // Box 2
		bodyModel[664] = new ModelRendererTurbo(this, 274, 419, textureX, textureY); // Box 2
		bodyModel[665] = new ModelRendererTurbo(this, 275, 412, textureX, textureY); // Box 2
		bodyModel[666] = new ModelRendererTurbo(this, 320, 412, textureX, textureY); // Box 2
		bodyModel[667] = new ModelRendererTurbo(this, 306, 304, textureX, textureY); // Box 38
		bodyModel[668] = new ModelRendererTurbo(this, 87, 261, textureX, textureY); // Box 669
		bodyModel[669] = new ModelRendererTurbo(this, 146, 422, textureX, textureY); // Box 38
		bodyModel[670] = new ModelRendererTurbo(this, 100, 424, textureX, textureY); // Box 38
		bodyModel[671] = new ModelRendererTurbo(this, 146, 426, textureX, textureY); // Box 451
		bodyModel[672] = new ModelRendererTurbo(this, 100, 428, textureX, textureY); // Box 452
		bodyModel[673] = new ModelRendererTurbo(this, 332, 263, textureX, textureY); // Box 674
		bodyModel[674] = new ModelRendererTurbo(this, 310, 332, textureX, textureY); // Box 38
		bodyModel[675] = new ModelRendererTurbo(this, 82, 304, textureX, textureY); // Box 38

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[500].setRotationPoint(-60.5F, 4.25F, 10.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[501].setRotationPoint(-60.5F, 3F, -11F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[502].setRotationPoint(-60.5F, 4.25F, -11F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[503].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[504].setRotationPoint(-61.5F, 4.25F, 10.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31 cull
		bodyModel[505].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 31
		bodyModel[506].setRotationPoint(-61.5F, 4.25F, -11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[507].setRotationPoint(52.5F, 4F, 10.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		bodyModel[508].setRotationPoint(52.5F, 4F, -11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[509].setRotationPoint(33.5F, 4F, 10.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[510].setRotationPoint(33.5F, 4F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[511].setRotationPoint(34.5F, 3F, 10.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[512].setRotationPoint(34.5F, 3F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[513].setRotationPoint(-54.5F, 4F, 10.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[514].setRotationPoint(-54.5F, 4F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 2
		bodyModel[515].setRotationPoint(-35.5F, 4F, 10.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[516].setRotationPoint(-35.5F, 4F, -11F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull test
		bodyModel[517].setRotationPoint(-53.5F, 3F, 10.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41 cull test
		bodyModel[518].setRotationPoint(-53.5F, 3F, -11F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[519].setRotationPoint(-63.5F, -17F, -5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[520].setRotationPoint(-63.5F, -19.75F, -5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[521].setRotationPoint(-63.5F, -19.75F, 3F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[522].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[523].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[524].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 253
		bodyModel[525].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[526].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[527].setRotationPoint(-63.5F, -18.5F, -10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[528].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.585F, 0F, -0.5F, -0.585F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[529].setRotationPoint(-63.5F, -19F, -8F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.085F, 0F, -0.5F, -0.085F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 578
		bodyModel[530].setRotationPoint(-63.5F, -18.5F, 8F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[531].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 580
		bodyModel[532].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[533].setRotationPoint(63F, -17F, -5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[534].setRotationPoint(63F, -20F, -3F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[535].setRotationPoint(63F, -20F, -5F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[536].setRotationPoint(63F, -20F, 3F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 128
		bodyModel[537].setRotationPoint(63F, -19F, -10F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[538].setRotationPoint(63F, -19.5F, -7F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[539].setRotationPoint(63F, -19F, 7F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.7F, 0F, 0F, 0.7F, 0F); // Box 253
		bodyModel[540].setRotationPoint(63F, -19.5F, 5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[541].setRotationPoint(63F, -18.5F, -10F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[542].setRotationPoint(63F, -19.5F, -7F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.585F, 0F, -0.5F, -0.585F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[543].setRotationPoint(63F, -19F, -8F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.085F, 0F, -0.5F, -0.085F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 578
		bodyModel[544].setRotationPoint(63F, -18.5F, 8F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[545].setRotationPoint(63F, -19.5F, 5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.585F, 0F, 0F, -0.585F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 580
		bodyModel[546].setRotationPoint(63F, -19F, 7F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[547].setRotationPoint(-63F, -15F, -4F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[548].setRotationPoint(-63F, -14F, -4F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[549].setRotationPoint(-63F, -14F, 3F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[550].setRotationPoint(-62.5F, -17F, -3F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[551].setRotationPoint(-62.5F, -19F, -4F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[552].setRotationPoint(-62.5F, -19F, 3F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[553].setRotationPoint(-62.5F, -20F, -4F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[554].setRotationPoint(-62.5F, -20F, 3F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[555].setRotationPoint(61.5F, -17F, -3F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[556].setRotationPoint(61.5F, -19F, -4F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[557].setRotationPoint(61.5F, -19F, 3F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[558].setRotationPoint(61.5F, -20F, -4F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[559].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[560].setRotationPoint(62.5F, -15F, -4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[561].setRotationPoint(62.5F, -14F, -4F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[562].setRotationPoint(62.5F, -14F, 3F);

		bodyModel[563].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 52
		bodyModel[563].setRotationPoint(-5.5F, 3F, -10F);

		bodyModel[564].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 52
		bodyModel[564].setRotationPoint(6.5F, 3F, -10F);

		bodyModel[565].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 52
		bodyModel[565].setRotationPoint(20.5F, 3F, -10F);

		bodyModel[566].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 52
		bodyModel[566].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[567].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52
		bodyModel[567].setRotationPoint(-33.5F, 3F, -10F);

		bodyModel[568].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[568].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[569].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[569].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[570].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[570].setRotationPoint(-9.5F, 3F, 9F);

		bodyModel[571].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[571].setRotationPoint(-28.5F, 3F, 9F);

		bodyModel[572].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[572].setRotationPoint(-6.5F, 3F, 9F);

		bodyModel[573].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[573].setRotationPoint(5.5F, 3F, 9F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[574].setRotationPoint(19.5F, 3F, 5F);
		bodyModel[574].rotateAngleZ = -0.78539816F;

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[575].setRotationPoint(19F, 3F, 4.99F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[576].setRotationPoint(19F, 3F, 10.01F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[577].setRotationPoint(8.5F, 3.5F, 6F);
		bodyModel[577].rotateAngleZ = -0.78539816F;

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 41
		bodyModel[578].setRotationPoint(8F, 3F, 5.99F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 41
		bodyModel[579].setRotationPoint(8F, 3F, 10.01F);

		bodyModel[580].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 52
		bodyModel[580].setRotationPoint(-23.5F, 3F, -10F);

		bodyModel[581].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 52
		bodyModel[581].setRotationPoint(-0.5F, 3F, -10F);

		bodyModel[582].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 52
		bodyModel[582].setRotationPoint(14.5F, 3F, -10F);

		bodyModel[583].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 52
		bodyModel[583].setRotationPoint(-30.5F, 3F, -10F);

		bodyModel[584].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 52
		bodyModel[584].setRotationPoint(-33.5F, 3F, -9F);

		bodyModel[585].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 52
		bodyModel[585].setRotationPoint(-17.5F, 3F, -10F);

		bodyModel[586].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[586].setRotationPoint(-26.5F, 3F, -10F);

		bodyModel[587].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 52
		bodyModel[587].setRotationPoint(-9.5F, 3F, -10F);

		bodyModel[588].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 52
		bodyModel[588].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[589].setRotationPoint(24.5F, 3.5F, -9.5F);
		bodyModel[589].rotateAngleX = -0.78539816F;

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F); // Box 41 cull
		bodyModel[590].setRotationPoint(25.49F, 3F, -10F);

		bodyModel[591].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 52
		bodyModel[591].setRotationPoint(18.5F, 3F, -10F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[592].setRotationPoint(8.5F, 4F, -2F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[593].setRotationPoint(8.5F, 6.5F, -2F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[594].setRotationPoint(21.5F, 3F, 2F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[595].setRotationPoint(21.5F, 3F, -10F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[596].setRotationPoint(10.5F, 4F, 8.1F);
		bodyModel[596].rotateAngleX = -0.78539816F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[597].setRotationPoint(10.49F, 3F, 7.6F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[598].setRotationPoint(19.51F, 3F, 7.6F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 41
		bodyModel[599].setRotationPoint(7.5F, 4F, 5F);
		bodyModel[599].rotateAngleZ = -0.78539816F;

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[600].setRotationPoint(7F, 3F, 4.99F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[601].setRotationPoint(7F, 3F, 10.01F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[602].setRotationPoint(20.5F, 4F, 8.1F);
		bodyModel[602].rotateAngleX = -0.78539816F;

		bodyModel[603].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[603].setRotationPoint(20.49F, 3F, 7.6F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[604].setRotationPoint(29.51F, 3F, 7.6F);

		bodyModel[605].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 52
		bodyModel[605].setRotationPoint(-8.5F, 3F, 9F);

		bodyModel[606].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 52
		bodyModel[606].setRotationPoint(-23.5F, 3F, 5F);

		bodyModel[607].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 52
		bodyModel[607].setRotationPoint(-17.5F, 3F, 5F);

		bodyModel[608].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[608].setRotationPoint(-24.5F, 3F, 9F);

		bodyModel[609].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 52
		bodyModel[609].setRotationPoint(-33.5F, 3F, 9F);

		bodyModel[610].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 52
		bodyModel[610].setRotationPoint(-32.5F, 3F, 8F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[611].setRotationPoint(-29.5F, 3F, 9F);

		bodyModel[612].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 52
		bodyModel[612].setRotationPoint(-14.5F, 3F, -10F);

		bodyModel[613].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 52
		bodyModel[613].setRotationPoint(0.5F, 3F, -10F);

		bodyModel[614].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[614].setRotationPoint(2.5F, 3F, -10F);

		bodyModel[615].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 52
		bodyModel[615].setRotationPoint(18.5F, 3F, -10F);

		bodyModel[616].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 52
		bodyModel[616].setRotationPoint(13.5F, 3F, -10F);

		bodyModel[617].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 52
		bodyModel[617].setRotationPoint(9.5F, 3F, -10F);

		bodyModel[618].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 2
		bodyModel[618].setRotationPoint(-14.5F, 3F, 5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[619].setRotationPoint(6.5F, 3F, 2F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[620].setRotationPoint(6.5F, 3F, -10F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[621].setRotationPoint(-6.5F, 4F, -2F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[622].setRotationPoint(-6.5F, 6.5F, -2F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[623].setRotationPoint(13.5F, 3F, 8.1F);
		bodyModel[623].rotateAngleX = -0.78539816F;

		bodyModel[624].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[624].setRotationPoint(13.49F, 3F, 7.6F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[625].setRotationPoint(22.51F, 3F, 7.6F);

		bodyModel[626].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 52
		bodyModel[626].setRotationPoint(-6.5F, 3F, 9F);

		bodyModel[627].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 52
		bodyModel[627].setRotationPoint(-2.5F, 3F, 9F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 19, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[628].setRotationPoint(9.5F, 3F, -9F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[629].setRotationPoint(9.5F, 6.5F, -9F);

		bodyModel[630].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 52
		bodyModel[630].setRotationPoint(9.5F, 3F, -10F);

		bodyModel[631].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 52
		bodyModel[631].setRotationPoint(-21.5F, 3F, -10F);

		bodyModel[632].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 52
		bodyModel[632].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[633].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 52
		bodyModel[633].setRotationPoint(-29.5F, 3F, -10F);

		bodyModel[634].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 52
		bodyModel[634].setRotationPoint(-21.5F, 3F, 5F);

		bodyModel[635].addBox(0F, 0F, 0F, 5, 3, 5, 0F); // Box 52
		bodyModel[635].setRotationPoint(-15.5F, 3F, 5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[636].setRotationPoint(12.5F, 3F, 8.1F);
		bodyModel[636].rotateAngleX = -0.78539816F;

		bodyModel[637].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[637].setRotationPoint(12.49F, 3F, 7.6F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[638].setRotationPoint(21.51F, 3F, 7.6F);

		bodyModel[639].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 52
		bodyModel[639].setRotationPoint(9.5F, 3F, -5F);

		bodyModel[640].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 52
		bodyModel[640].setRotationPoint(9.5F, 3F, 2F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[641].setRotationPoint(-59F, -2F, -9.75F);
		bodyModel[641].rotateAngleY = 0.78539816F;

		bodyModel[642].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[642].setRotationPoint(-59.35F, -1F, -9.4F);
		bodyModel[642].rotateAngleY = 0.78539816F;

		bodyModel[643].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[643].setRotationPoint(-59F, 0.5F, -9.75F);
		bodyModel[643].rotateAngleY = 0.78539816F;

		bodyModel[644].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[644].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[645].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[645].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[646].addBox(0F, 0F, 0F, 74, 0, 4, 0F); // Box 38
		bodyModel[646].setRotationPoint(-41F, -16.99F, -2F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 612 cull
		bodyModel[647].setRotationPoint(43.5F, -4F, -4.99F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[648].setRotationPoint(-48.75F, -1.5F, -2.75F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[649].setRotationPoint(-45.5F, -15F, 5F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[650].setRotationPoint(36.5F, -15F, -6F);

		bodyModel[651].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 52
		bodyModel[651].setRotationPoint(-28.5F, 3F, -10F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 0, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 488
		bodyModel[652].setRotationPoint(-44.49F, -13.5F, -7F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 0, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 488
		bodyModel[653].setRotationPoint(36.49F, -13.5F, -5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 82, 1, 6, 0F,-0.01F, -0.5F, -3.01F, -7F, -0.5F, -3.01F, -7F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -3.01F, -7F, 0F, -3.01F, -7F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 488
		bodyModel[654].setRotationPoint(-44F, -13.5F, -13F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,-0.02F, -0.51F, -3.02F, -7.01F, -0.51F, -3.02F, -7.01F, -0.01F, -0.01F, -0.02F, -0.05F, -0.01F, -0.02F, -0.01F, -3.02F, -7.01F, -0.01F, -3.02F, -7.01F, -0.51F, -0.01F, -0.02F, -0.51F, -0.01F); // Box 488
		bodyModel[655].setRotationPoint(-44.5F, -13.5F, -13F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 82, 1, 6, 0F,-0.01F, 0F, 0F, -7F, 0F, 0F, -7F, -0.5F, -3.01F, -0.01F, -0.5F, -3.01F, -0.01F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, 0F, -3.01F, -0.01F, 0F, -3.01F); // Box 656
		bodyModel[656].setRotationPoint(-39F, -13.5F, 7F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 83, 1, 6, 0F,-0.02F, -0.05F, -0.01F, -7.01F, -0.01F, -0.01F, -7.01F, -0.51F, -3.02F, -0.02F, -0.51F, -3.02F, -0.02F, -0.51F, -0.01F, -7.01F, -0.51F, -0.01F, -7.01F, -0.01F, -3.02F, -0.02F, -0.01F, -3.02F); // Box 657
		bodyModel[657].setRotationPoint(-39.5F, -13.5F, 7F);

		bodyModel[658].addBox(0F, 0F, 0F, 80, 0, 20, 0F); // Box 2
		bodyModel[658].setRotationPoint(-44F, 0.99F, -10F);

		bodyModel[659].addBox(0F, 0F, 0F, 15, 0, 9, 0F); // Box 2
		bodyModel[659].setRotationPoint(-60F, 0.99F, -0.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[660].setRotationPoint(-45F, 0.99F, 7.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[661].setRotationPoint(-44.5F, 0.99F, 6.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[662].setRotationPoint(-60.5F, 0.99F, -0.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[663].setRotationPoint(36.5F, 0.99F, -8.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[664].setRotationPoint(34.5F, 0.99F, -8.5F);

		bodyModel[665].addBox(0F, 0F, 0F, 18, 0, 9, 0F); // Box 2
		bodyModel[665].setRotationPoint(37F, 0.99F, -8.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[666].setRotationPoint(55F, 0.99F, -0.5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F); // Box 38
		bodyModel[667].setRotationPoint(32F, -15F, -9.99F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F); // Box 669
		bodyModel[668].setRotationPoint(-41F, -15F, 9.99F);

		bodyModel[669].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 38
		bodyModel[669].setRotationPoint(-25.5F, -13.5F, -11.01F);

		bodyModel[670].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 38
		bodyModel[670].setRotationPoint(-48F, -2.5F, -11.01F);

		bodyModel[671].addBox(0F, 0F, 0F, 49, 1, 0, 0F); // Box 451
		bodyModel[671].setRotationPoint(-25.5F, -13.5F, 11.01F);

		bodyModel[672].addBox(0F, 0F, 0F, 95, 1, 0, 0F); // Box 452
		bodyModel[672].setRotationPoint(-48F, -2.5F, 11.01F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 674
		bodyModel[673].setRotationPoint(39.25F, -1.5F, 1.75F);

		bodyModel[674].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 38
		bodyModel[674].setRotationPoint(31.5F, -5F, -10F);

		bodyModel[675].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 38
		bodyModel[675].setRotationPoint(-40.5F, -5F, 3F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 676; i++)
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
		if(GetColor(entity)== 28 || GetColor(entity) == 29 || GetColor(entity) == 30 || GetColor(entity) == 31){ //add back in once Sue line skin is remade: ||GetColor(entity)==0
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-N-11_truck_silver.png"));
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