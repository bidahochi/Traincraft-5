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

public class ModelPSCEI60SeatCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPSCEI60SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[580];

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
		bodyModel[3] = new ModelRendererTurbo(this, 272, 148, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 272, 151, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 263, 148, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 260, 151, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 74, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[10] = new ModelRendererTurbo(this, 74, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[11] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 105, 148, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 107, 151, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 272, 138, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 272, 141, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 263, 138, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 260, 141, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 74, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[26] = new ModelRendererTurbo(this, 74, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[27] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 258, 148, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 258, 138, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 347, 117, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 30, 122, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 311, 121, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 74, 166, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 74, 174, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 125, 158, textureX, textureY); // Box 41
		bodyModel[47] = new ModelRendererTurbo(this, 124, 156, textureX, textureY); // Box 41
		bodyModel[48] = new ModelRendererTurbo(this, 144, 156, textureX, textureY); // Box 41
		bodyModel[49] = new ModelRendererTurbo(this, 201, 170, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 201, 168, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 221, 168, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 314, 108, textureX, textureY); // Left trapdoor
		bodyModel[53] = new ModelRendererTurbo(this, 329, 118, textureX, textureY); // Right trapdoor
		bodyModel[54] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[55] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 327, 20, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 361, 20, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 380, 19, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 35, 19, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 337, 19, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 391, 19, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 27, 18, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 311, 66, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 311, 87, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 346, 21, textureX, textureY); // Vestibule door
		bodyModel[68] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[69] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 20, 43, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 44, 35, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 31, 43, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[89] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[90] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 30, 8, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 18, 8, textureX, textureY); // Box 176
		bodyModel[94] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[95] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[97] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[98] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[99] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 492, 24, textureX, textureY); // Box 128
		bodyModel[101] = new ModelRendererTurbo(this, 460, 24, textureX, textureY); // Box 176
		bodyModel[102] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 52, 3, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 349, 77, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 352, 77, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 59, 84, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 349, 98, textureX, textureY); // Box 202
		bodyModel[109] = new ModelRendererTurbo(this, 352, 98, textureX, textureY); // Box 203
		bodyModel[110] = new ModelRendererTurbo(this, 59, 103, textureX, textureY); // Box 204
		bodyModel[111] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[112] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[117] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[118] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[119] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[120] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[121] = new ModelRendererTurbo(this, 384, 101, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 392, 84, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[124] = new ModelRendererTurbo(this, 384, 67, textureX, textureY); // Box 249
		bodyModel[125] = new ModelRendererTurbo(this, 35, 86, textureX, textureY); // Box 38
		bodyModel[126] = new ModelRendererTurbo(this, 40, 87, textureX, textureY); // Box 38
		bodyModel[127] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 7, 114, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 27, 97, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 24, 83, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 35, 66, textureX, textureY); // Box 247
		bodyModel[134] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 248
		bodyModel[135] = new ModelRendererTurbo(this, 19, 67, textureX, textureY); // Box 249
		bodyModel[136] = new ModelRendererTurbo(this, 28, 67, textureX, textureY); // Box 250
		bodyModel[137] = new ModelRendererTurbo(this, 27, 72, textureX, textureY); // Box 252
		bodyModel[138] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 254
		bodyModel[139] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[141] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 2
		bodyModel[142] = new ModelRendererTurbo(this, 146, 159, textureX, textureY); // Box 52
		bodyModel[143] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 52
		bodyModel[144] = new ModelRendererTurbo(this, 90, 180, textureX, textureY); // Box 52
		bodyModel[145] = new ModelRendererTurbo(this, 125, 181, textureX, textureY); // Box 41
		bodyModel[146] = new ModelRendererTurbo(this, 124, 179, textureX, textureY); // Box 41
		bodyModel[147] = new ModelRendererTurbo(this, 142, 179, textureX, textureY); // Box 41
		bodyModel[148] = new ModelRendererTurbo(this, 81, 269, textureX, textureY); // Box 38
		bodyModel[149] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 38
		bodyModel[150] = new ModelRendererTurbo(this, 316, 269, textureX, textureY); // Box 38
		bodyModel[151] = new ModelRendererTurbo(this, 316, 297, textureX, textureY); // Box 38
		bodyModel[152] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 38
		bodyModel[153] = new ModelRendererTurbo(this, 431, 75, textureX, textureY); // Box 38
		bodyModel[154] = new ModelRendererTurbo(this, 103, 244, textureX, textureY); // Box 38
		bodyModel[155] = new ModelRendererTurbo(this, 105, 239, textureX, textureY); // Box 38
		bodyModel[156] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[157] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[158] = new ModelRendererTurbo(this, 105, 257, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[159] = new ModelRendererTurbo(this, 105, 242, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[160] = new ModelRendererTurbo(this, 106, 262, textureX, textureY); // Box 38
		bodyModel[161] = new ModelRendererTurbo(this, 106, 233, textureX, textureY); // Box 462
		bodyModel[162] = new ModelRendererTurbo(this, 156, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[163] = new ModelRendererTurbo(this, 163, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[164] = new ModelRendererTurbo(this, 170, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[165] = new ModelRendererTurbo(this, 177, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[166] = new ModelRendererTurbo(this, 184, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[167] = new ModelRendererTurbo(this, 191, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[168] = new ModelRendererTurbo(this, 198, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[169] = new ModelRendererTurbo(this, 99, 269, textureX, textureY); // Right seat part
		bodyModel[170] = new ModelRendererTurbo(this, 99, 297, textureX, textureY); // Left seat part
		bodyModel[171] = new ModelRendererTurbo(this, 130, 269, textureX, textureY); // Right seat part
		bodyModel[172] = new ModelRendererTurbo(this, 130, 297, textureX, textureY); // Left seat part
		bodyModel[173] = new ModelRendererTurbo(this, 161, 269, textureX, textureY); // Right seat part
		bodyModel[174] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Left seat part
		bodyModel[175] = new ModelRendererTurbo(this, 192, 269, textureX, textureY); // Right seat part
		bodyModel[176] = new ModelRendererTurbo(this, 192, 297, textureX, textureY); // Left seat part
		bodyModel[177] = new ModelRendererTurbo(this, 223, 269, textureX, textureY); // Right seat part
		bodyModel[178] = new ModelRendererTurbo(this, 223, 297, textureX, textureY); // Left seat part
		bodyModel[179] = new ModelRendererTurbo(this, 254, 269, textureX, textureY); // Right seat part
		bodyModel[180] = new ModelRendererTurbo(this, 254, 297, textureX, textureY); // Left seat part
		bodyModel[181] = new ModelRendererTurbo(this, 285, 269, textureX, textureY); // Right seat part
		bodyModel[182] = new ModelRendererTurbo(this, 285, 297, textureX, textureY); // Left seat part
		bodyModel[183] = new ModelRendererTurbo(this, 358, 260, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 427, 259, textureX, textureY); // Box 38
		bodyModel[185] = new ModelRendererTurbo(this, 338, 303, textureX, textureY); // Box 38
		bodyModel[186] = new ModelRendererTurbo(this, 462, 274, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 204, 250, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[188] = new ModelRendererTurbo(this, 152, 250, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[189] = new ModelRendererTurbo(this, 360, 303, textureX, textureY); // Box 38
		bodyModel[190] = new ModelRendererTurbo(this, 349, 303, textureX, textureY); // Box 38
		bodyModel[191] = new ModelRendererTurbo(this, 347, 307, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 460, 299, textureX, textureY); // Box 38
		bodyModel[193] = new ModelRendererTurbo(this, 420, 282, textureX, textureY); // Box 38
		bodyModel[194] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 422, 278, textureX, textureY); // Box 38
		bodyModel[196] = new ModelRendererTurbo(this, 420, 233, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 417, 237, textureX, textureY); // Box 38
		bodyModel[198] = new ModelRendererTurbo(this, 422, 237, textureX, textureY); // Box 38
		bodyModel[199] = new ModelRendererTurbo(this, 418, 248, textureX, textureY); // Box 38
		bodyModel[200] = new ModelRendererTurbo(this, 411, 235, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 333, 274, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 333, 283, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 37, 293, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 4, 289, textureX, textureY); // Box 38
		bodyModel[205] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Box 38
		bodyModel[206] = new ModelRendererTurbo(this, 4, 286, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 70, 303, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 4, 265, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 68, 272, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 16, 278, textureX, textureY); // Box 38
		bodyModel[211] = new ModelRendererTurbo(this, 20, 274, textureX, textureY); // Box 38
		bodyModel[212] = new ModelRendererTurbo(this, 15, 274, textureX, textureY); // Box 38
		bodyModel[213] = new ModelRendererTurbo(this, 16, 235, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 20, 239, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 15, 239, textureX, textureY); // Box 38
		bodyModel[216] = new ModelRendererTurbo(this, 15, 250, textureX, textureY); // Box 38
		bodyModel[217] = new ModelRendererTurbo(this, 19, 286, textureX, textureY); // Box 38
		bodyModel[218] = new ModelRendererTurbo(this, 21, 241, textureX, textureY); // Box 38
		bodyModel[219] = new ModelRendererTurbo(this, 30, 254, textureX, textureY); // Box 128
		bodyModel[220] = new ModelRendererTurbo(this, 37, 247, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[221] = new ModelRendererTurbo(this, 32, 258, textureX, textureY); // Box 128
		bodyModel[222] = new ModelRendererTurbo(this, 447, 299, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 311, 90, textureX, textureY); // Right side door
		bodyModel[224] = new ModelRendererTurbo(this, 311, 69, textureX, textureY); // Left side door
		bodyModel[225] = new ModelRendererTurbo(this, 405, 280, textureX, textureY); // Box 526
		bodyModel[226] = new ModelRendererTurbo(this, 394, 268, textureX, textureY); // Box 527
		bodyModel[227] = new ModelRendererTurbo(this, 394, 277, textureX, textureY); // Box 528
		bodyModel[228] = new ModelRendererTurbo(this, 394, 286, textureX, textureY); // Box 529
		bodyModel[229] = new ModelRendererTurbo(this, 403, 277, textureX, textureY); // Box 530
		bodyModel[230] = new ModelRendererTurbo(this, 403, 286, textureX, textureY); // Box 531
		bodyModel[231] = new ModelRendererTurbo(this, 394, 280, textureX, textureY); // Box 532
		bodyModel[232] = new ModelRendererTurbo(this, 391, 279, textureX, textureY); // Box 533
		bodyModel[233] = new ModelRendererTurbo(this, 391, 288, textureX, textureY); // Box 534
		bodyModel[234] = new ModelRendererTurbo(this, 405, 259, textureX, textureY); // Box 526
		bodyModel[235] = new ModelRendererTurbo(this, 394, 247, textureX, textureY); // Box 527
		bodyModel[236] = new ModelRendererTurbo(this, 394, 256, textureX, textureY); // Box 528
		bodyModel[237] = new ModelRendererTurbo(this, 394, 265, textureX, textureY); // Box 529
		bodyModel[238] = new ModelRendererTurbo(this, 403, 256, textureX, textureY); // Box 530
		bodyModel[239] = new ModelRendererTurbo(this, 403, 265, textureX, textureY); // Box 531
		bodyModel[240] = new ModelRendererTurbo(this, 394, 259, textureX, textureY); // Box 532
		bodyModel[241] = new ModelRendererTurbo(this, 391, 258, textureX, textureY); // Box 533
		bodyModel[242] = new ModelRendererTurbo(this, 391, 267, textureX, textureY); // Box 534
		bodyModel[243] = new ModelRendererTurbo(this, 405, 238, textureX, textureY); // Box 526
		bodyModel[244] = new ModelRendererTurbo(this, 394, 226, textureX, textureY); // Box 527
		bodyModel[245] = new ModelRendererTurbo(this, 394, 235, textureX, textureY); // Box 528
		bodyModel[246] = new ModelRendererTurbo(this, 394, 244, textureX, textureY); // Box 529
		bodyModel[247] = new ModelRendererTurbo(this, 403, 235, textureX, textureY); // Box 530
		bodyModel[248] = new ModelRendererTurbo(this, 403, 244, textureX, textureY); // Box 531
		bodyModel[249] = new ModelRendererTurbo(this, 394, 238, textureX, textureY); // Box 532
		bodyModel[250] = new ModelRendererTurbo(this, 391, 237, textureX, textureY); // Box 533
		bodyModel[251] = new ModelRendererTurbo(this, 391, 246, textureX, textureY); // Box 534
		bodyModel[252] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Boc 42
		bodyModel[253] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Boc 42
		bodyModel[254] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[255] = new ModelRendererTurbo(this, 110, 295, textureX, textureY); // Left seat part
		bodyModel[256] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[257] = new ModelRendererTurbo(this, 115, 277, textureX, textureY); // Right seat part
		bodyModel[258] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 110, 277, textureX, textureY); // Right seat part
		bodyModel[260] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[261] = new ModelRendererTurbo(this, 110, 282, textureX, textureY); // Right seat part
		bodyModel[262] = new ModelRendererTurbo(this, 115, 285, textureX, textureY); // Right seat part
		bodyModel[263] = new ModelRendererTurbo(this, 117, 282, textureX, textureY); // Right seat part
		bodyModel[264] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 124, 282, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 110, 302, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 115, 305, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 117, 302, textureX, textureY); // Left seat part
		bodyModel[269] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Left seat part
		bodyModel[270] = new ModelRendererTurbo(this, 124, 302, textureX, textureY); // Left seat part
		bodyModel[271] = new ModelRendererTurbo(this, 110, 310, textureX, textureY); // Left seat part
		bodyModel[272] = new ModelRendererTurbo(this, 115, 313, textureX, textureY); // Left seat part
		bodyModel[273] = new ModelRendererTurbo(this, 117, 310, textureX, textureY); // Left seat part
		bodyModel[274] = new ModelRendererTurbo(this, 110, 313, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 124, 310, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 128, 285, textureX, textureY); // Boc 42
		bodyModel[277] = new ModelRendererTurbo(this, 128, 313, textureX, textureY); // Boc 42
		bodyModel[278] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 141, 295, textureX, textureY); // Left seat part
		bodyModel[280] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[281] = new ModelRendererTurbo(this, 146, 277, textureX, textureY); // Right seat part
		bodyModel[282] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 141, 277, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[285] = new ModelRendererTurbo(this, 141, 282, textureX, textureY); // Right seat part
		bodyModel[286] = new ModelRendererTurbo(this, 146, 285, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 148, 282, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 155, 282, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 141, 302, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 146, 305, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 148, 302, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 141, 305, textureX, textureY); // Left seat part
		bodyModel[294] = new ModelRendererTurbo(this, 155, 302, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 141, 310, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 146, 313, textureX, textureY); // Left seat part
		bodyModel[297] = new ModelRendererTurbo(this, 148, 310, textureX, textureY); // Left seat part
		bodyModel[298] = new ModelRendererTurbo(this, 141, 313, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 190, 285, textureX, textureY); // Boc 42
		bodyModel[300] = new ModelRendererTurbo(this, 159, 285, textureX, textureY); // Boc 42
		bodyModel[301] = new ModelRendererTurbo(this, 190, 313, textureX, textureY); // Boc 42
		bodyModel[302] = new ModelRendererTurbo(this, 159, 313, textureX, textureY); // Boc 42
		bodyModel[303] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 172, 295, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 203, 295, textureX, textureY); // Left seat part
		bodyModel[306] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 208, 277, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 203, 277, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[311] = new ModelRendererTurbo(this, 203, 282, textureX, textureY); // Right seat part
		bodyModel[312] = new ModelRendererTurbo(this, 208, 285, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 210, 282, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 217, 282, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[317] = new ModelRendererTurbo(this, 177, 277, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 172, 277, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 172, 282, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 177, 285, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 179, 282, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[325] = new ModelRendererTurbo(this, 186, 282, textureX, textureY); // Right seat part
		bodyModel[326] = new ModelRendererTurbo(this, 203, 302, textureX, textureY); // Left seat part
		bodyModel[327] = new ModelRendererTurbo(this, 208, 305, textureX, textureY); // Left seat part
		bodyModel[328] = new ModelRendererTurbo(this, 210, 302, textureX, textureY); // Left seat part
		bodyModel[329] = new ModelRendererTurbo(this, 203, 305, textureX, textureY); // Left seat part
		bodyModel[330] = new ModelRendererTurbo(this, 217, 302, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 203, 310, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 208, 313, textureX, textureY); // Left seat part
		bodyModel[333] = new ModelRendererTurbo(this, 210, 310, textureX, textureY); // Left seat part
		bodyModel[334] = new ModelRendererTurbo(this, 203, 313, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 217, 310, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 172, 302, textureX, textureY); // Left seat part
		bodyModel[337] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Left seat part
		bodyModel[338] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Left seat part
		bodyModel[339] = new ModelRendererTurbo(this, 172, 305, textureX, textureY); // Left seat part
		bodyModel[340] = new ModelRendererTurbo(this, 186, 302, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 172, 310, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Left seat part
		bodyModel[343] = new ModelRendererTurbo(this, 179, 310, textureX, textureY); // Left seat part
		bodyModel[344] = new ModelRendererTurbo(this, 172, 313, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 186, 310, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[347] = new ModelRendererTurbo(this, 221, 285, textureX, textureY); // Boc 42
		bodyModel[348] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Boc 42
		bodyModel[349] = new ModelRendererTurbo(this, 221, 313, textureX, textureY); // Boc 42
		bodyModel[350] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[351] = new ModelRendererTurbo(this, 234, 295, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 265, 295, textureX, textureY); // Left seat part
		bodyModel[354] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[355] = new ModelRendererTurbo(this, 270, 277, textureX, textureY); // Right seat part
		bodyModel[356] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part
		bodyModel[357] = new ModelRendererTurbo(this, 265, 277, textureX, textureY); // Right seat part
		bodyModel[358] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 265, 282, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 270, 285, textureX, textureY); // Right seat part
		bodyModel[361] = new ModelRendererTurbo(this, 272, 282, textureX, textureY); // Right seat part
		bodyModel[362] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 279, 282, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[365] = new ModelRendererTurbo(this, 239, 277, textureX, textureY); // Right seat part
		bodyModel[366] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[367] = new ModelRendererTurbo(this, 234, 277, textureX, textureY); // Right seat part
		bodyModel[368] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 234, 282, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 239, 285, textureX, textureY); // Right seat part
		bodyModel[371] = new ModelRendererTurbo(this, 241, 282, textureX, textureY); // Right seat part
		bodyModel[372] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 248, 282, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 265, 302, textureX, textureY); // Left seat part
		bodyModel[375] = new ModelRendererTurbo(this, 270, 305, textureX, textureY); // Left seat part
		bodyModel[376] = new ModelRendererTurbo(this, 272, 302, textureX, textureY); // Left seat part
		bodyModel[377] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Left seat part
		bodyModel[378] = new ModelRendererTurbo(this, 279, 302, textureX, textureY); // Left seat part
		bodyModel[379] = new ModelRendererTurbo(this, 265, 310, textureX, textureY); // Left seat part
		bodyModel[380] = new ModelRendererTurbo(this, 270, 313, textureX, textureY); // Left seat part
		bodyModel[381] = new ModelRendererTurbo(this, 272, 310, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Left seat part
		bodyModel[383] = new ModelRendererTurbo(this, 279, 310, textureX, textureY); // Left seat part
		bodyModel[384] = new ModelRendererTurbo(this, 234, 302, textureX, textureY); // Left seat part
		bodyModel[385] = new ModelRendererTurbo(this, 239, 305, textureX, textureY); // Left seat part
		bodyModel[386] = new ModelRendererTurbo(this, 241, 302, textureX, textureY); // Left seat part
		bodyModel[387] = new ModelRendererTurbo(this, 234, 305, textureX, textureY); // Left seat part
		bodyModel[388] = new ModelRendererTurbo(this, 248, 302, textureX, textureY); // Left seat part
		bodyModel[389] = new ModelRendererTurbo(this, 234, 310, textureX, textureY); // Left seat part
		bodyModel[390] = new ModelRendererTurbo(this, 239, 313, textureX, textureY); // Left seat part
		bodyModel[391] = new ModelRendererTurbo(this, 241, 310, textureX, textureY); // Left seat part
		bodyModel[392] = new ModelRendererTurbo(this, 234, 313, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 248, 310, textureX, textureY); // Left seat part
		bodyModel[394] = new ModelRendererTurbo(this, 283, 285, textureX, textureY); // Boc 42
		bodyModel[395] = new ModelRendererTurbo(this, 283, 313, textureX, textureY); // Box 638
		bodyModel[396] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Right seat part
		bodyModel[398] = new ModelRendererTurbo(this, 301, 277, textureX, textureY); // Right seat part
		bodyModel[399] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[400] = new ModelRendererTurbo(this, 296, 277, textureX, textureY); // Right seat part
		bodyModel[401] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[402] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Right seat part
		bodyModel[403] = new ModelRendererTurbo(this, 301, 285, textureX, textureY); // Right seat part
		bodyModel[404] = new ModelRendererTurbo(this, 303, 282, textureX, textureY); // Right seat part
		bodyModel[405] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[406] = new ModelRendererTurbo(this, 310, 282, textureX, textureY); // Right seat part
		bodyModel[407] = new ModelRendererTurbo(this, 296, 295, textureX, textureY); // Left seat part
		bodyModel[408] = new ModelRendererTurbo(this, 296, 302, textureX, textureY); // Left seat part
		bodyModel[409] = new ModelRendererTurbo(this, 301, 305, textureX, textureY); // Left seat part
		bodyModel[410] = new ModelRendererTurbo(this, 303, 302, textureX, textureY); // Left seat part
		bodyModel[411] = new ModelRendererTurbo(this, 296, 305, textureX, textureY); // Left seat part
		bodyModel[412] = new ModelRendererTurbo(this, 310, 302, textureX, textureY); // Left seat part
		bodyModel[413] = new ModelRendererTurbo(this, 296, 310, textureX, textureY); // Left seat part
		bodyModel[414] = new ModelRendererTurbo(this, 301, 313, textureX, textureY); // Left seat part
		bodyModel[415] = new ModelRendererTurbo(this, 303, 310, textureX, textureY); // Left seat part
		bodyModel[416] = new ModelRendererTurbo(this, 296, 313, textureX, textureY); // Left seat part
		bodyModel[417] = new ModelRendererTurbo(this, 310, 310, textureX, textureY); // Left seat part
		bodyModel[418] = new ModelRendererTurbo(this, 276, 249, textureX, textureY); // Box 128
		bodyModel[419] = new ModelRendererTurbo(this, 285, 246, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 294, 253, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 300, 257, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 306, 245, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 304, 250, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 302, 261, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 420, 241, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 420, 252, textureX, textureY); // Box 38
		bodyModel[427] = new ModelRendererTurbo(this, 421, 286, textureX, textureY); // Box 38
		bodyModel[428] = new ModelRendererTurbo(this, 17, 243, textureX, textureY); // Box 38
		bodyModel[429] = new ModelRendererTurbo(this, 17, 254, textureX, textureY); // Box 38
		bodyModel[430] = new ModelRendererTurbo(this, 16, 282, textureX, textureY); // Box 38
		bodyModel[431] = new ModelRendererTurbo(this, 418, 228, textureX, textureY); // Box 38
		bodyModel[432] = new ModelRendererTurbo(this, 418, 221, textureX, textureY); // Box 38
		bodyModel[433] = new ModelRendererTurbo(this, 418, 273, textureX, textureY); // Box 773
		bodyModel[434] = new ModelRendererTurbo(this, 418, 266, textureX, textureY); // Box 774
		bodyModel[435] = new ModelRendererTurbo(this, 15, 230, textureX, textureY); // Box 38
		bodyModel[436] = new ModelRendererTurbo(this, 27, 233, textureX, textureY); // Box 38
		bodyModel[437] = new ModelRendererTurbo(this, 15, 269, textureX, textureY); // Box 773
		bodyModel[438] = new ModelRendererTurbo(this, 15, 262, textureX, textureY); // Box 774
		bodyModel[439] = new ModelRendererTurbo(this, 22, 287, textureX, textureY); // Box 526
		bodyModel[440] = new ModelRendererTurbo(this, 27, 278, textureX, textureY); // Box 527
		bodyModel[441] = new ModelRendererTurbo(this, 30, 274, textureX, textureY); // Box 528
		bodyModel[442] = new ModelRendererTurbo(this, 30, 296, textureX, textureY); // Box 529
		bodyModel[443] = new ModelRendererTurbo(this, 25, 275, textureX, textureY); // Box 530
		bodyModel[444] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Box 531
		bodyModel[445] = new ModelRendererTurbo(this, 31, 290, textureX, textureY); // Box 532
		bodyModel[446] = new ModelRendererTurbo(this, 34, 277, textureX, textureY); // Box 533
		bodyModel[447] = new ModelRendererTurbo(this, 34, 299, textureX, textureY); // Box 534
		bodyModel[448] = new ModelRendererTurbo(this, 30, 264, textureX, textureY); // Box 128
		bodyModel[449] = new ModelRendererTurbo(this, 37, 257, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[450] = new ModelRendererTurbo(this, 32, 268, textureX, textureY); // Box 128
		bodyModel[451] = new ModelRendererTurbo(this, 419, 260, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[452] = new ModelRendererTurbo(this, 24, 266, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[453] = new ModelRendererTurbo(this, 72, 326, textureX, textureY); // Box 194
		bodyModel[454] = new ModelRendererTurbo(this, 72, 345, textureX, textureY); // Box 128
		bodyModel[455] = new ModelRendererTurbo(this, 72, 322, textureX, textureY); // Box 193
		bodyModel[456] = new ModelRendererTurbo(this, 72, 329, textureX, textureY); // Box 192
		bodyModel[457] = new ModelRendererTurbo(this, 72, 348, textureX, textureY); // Box 128
		bodyModel[458] = new ModelRendererTurbo(this, 72, 340, textureX, textureY); // Box 128
		bodyModel[459] = new ModelRendererTurbo(this, 72, 334, textureX, textureY); // Box 38
		bodyModel[460] = new ModelRendererTurbo(this, 448, 47, textureX, textureY); // Box 128
		bodyModel[461] = new ModelRendererTurbo(this, 448, 69, textureX, textureY); // Box 176
		bodyModel[462] = new ModelRendererTurbo(this, 18, 146, textureX, textureY); // Box 128
		bodyModel[463] = new ModelRendererTurbo(this, 18, 168, textureX, textureY); // Box 176
		bodyModel[464] = new ModelRendererTurbo(this, 437, 53, textureX, textureY); // Box 128
		bodyModel[465] = new ModelRendererTurbo(this, 7, 152, textureX, textureY); // Box 128
		bodyModel[466] = new ModelRendererTurbo(this, 329, 92, textureX, textureY); // Right step part
		bodyModel[467] = new ModelRendererTurbo(this, 327, 95, textureX, textureY); // Right step part
		bodyModel[468] = new ModelRendererTurbo(this, 329, 98, textureX, textureY); // Right step part
		bodyModel[469] = new ModelRendererTurbo(this, 329, 102, textureX, textureY); // Right step part
		bodyModel[470] = new ModelRendererTurbo(this, 327, 105, textureX, textureY); // Right step part
		bodyModel[471] = new ModelRendererTurbo(this, 324, 96, textureX, textureY); // Right step part
		bodyModel[472] = new ModelRendererTurbo(this, 338, 96, textureX, textureY); // Right step part
		bodyModel[473] = new ModelRendererTurbo(this, 324, 98, textureX, textureY); // Right step part
		bodyModel[474] = new ModelRendererTurbo(this, 338, 98, textureX, textureY); // Right step part
		bodyModel[475] = new ModelRendererTurbo(this, 322, 84, textureX, textureY); // Box 1353
		bodyModel[476] = new ModelRendererTurbo(this, 338, 84, textureX, textureY); // Box 1354
		bodyModel[477] = new ModelRendererTurbo(this, 329, 88, textureX, textureY); // Box 1355
		bodyModel[478] = new ModelRendererTurbo(this, 327, 85, textureX, textureY); // Box 1356
		bodyModel[479] = new ModelRendererTurbo(this, 338, 82, textureX, textureY); // Box 1357
		bodyModel[480] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 1358
		bodyModel[481] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[482] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[483] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[484] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[485] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[486] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[487] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[488] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[489] = new ModelRendererTurbo(this, 338, 88, textureX, textureY); // Box 1359
		bodyModel[490] = new ModelRendererTurbo(this, 322, 88, textureX, textureY); // Box 1360
		bodyModel[491] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[492] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[493] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[494] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[495] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[496] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[497] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[498] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[499] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part

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

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[37].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[38].setRotationPoint(56.5F, 3F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[39].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 2
		bodyModel[40].setRotationPoint(-61.5F, 3F, -5F);

		bodyModel[41].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[41].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[42].setRotationPoint(43F, 4F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[43].setRotationPoint(-45F, 4F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[44].setRotationPoint(-29.5F, 4F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[45].setRotationPoint(-29.5F, 6.5F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[46].setRotationPoint(-11.5F, 3F, 8.9F);
		bodyModel[46].rotateAngleX = -0.78539816F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[47].setRotationPoint(-11.51F, 3F, 8.4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[48].setRotationPoint(-3.49F, 3F, 8.4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[49].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[49].rotateAngleX = -0.78539816F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[50].setRotationPoint(19.49F, 4F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[51].setRotationPoint(27.51F, 4F, -0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[52].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[53].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[54].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[54].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 128
		bodyModel[55].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[56].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[57].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[58].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[59].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[60].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[61].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[62].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[63].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[64].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[65].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[66].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[67].setRotationPoint(55.51F, -14F, 3F);

		bodyModel[68].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[68].setRotationPoint(-60.49F, -14F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[69].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[73].setRotationPoint(63F, -14F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[74].setRotationPoint(63F, -14F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[75].setRotationPoint(63F, 1F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(63F, -15F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-63F, -15F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-63F, 1F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[79].setRotationPoint(-63F, -14F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[80].setRotationPoint(-63F, -14F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[85].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[88].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[89].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[90].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[91].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[93].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[94].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[95].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[96].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[97].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[98].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[99].setRotationPoint(55.5F, -17F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[100].setRotationPoint(55.5F, -18F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[101].setRotationPoint(55.5F, -18F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[102].setRotationPoint(55.5F, -16.25F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[103].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 123, 1, 14, 0F); // Box 128
		bodyModel[104].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(56F, -6F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[106].setRotationPoint(61F, -6F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[107].setRotationPoint(-61.5F, -1.5F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[108].setRotationPoint(56F, -6F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[109].setRotationPoint(61F, -6F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[110].setRotationPoint(-61.5F, -1.5F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[111].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[112].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[115].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[116].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[117].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[118].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[119].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[120].setRotationPoint(63F, -15F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[121].setRotationPoint(63F, -16F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(63F, 1F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[123].setRotationPoint(63F, -15F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[124].setRotationPoint(63F, -16F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[125].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[126].setRotationPoint(-63F, -15F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[127].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[128].setRotationPoint(-63F, -15F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[130].setRotationPoint(-63F, -19F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[131].setRotationPoint(-63F, -20F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[132].setRotationPoint(-63F, -20F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[133].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[134].setRotationPoint(-63F, -15F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[135].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[136].setRotationPoint(-63F, -15F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[137].setRotationPoint(-63F, -19F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[138].setRotationPoint(-63F, -20F, 3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(-61.5F, 6F, -10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[140].setRotationPoint(-61.5F, 6F, 10.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 2
		bodyModel[141].setRotationPoint(6.5F, 3F, 5F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[142].setRotationPoint(-0.5F, 3F, 9F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[143].setRotationPoint(-1.5F, 3F, -10F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 52
		bodyModel[144].setRotationPoint(-23.5F, 3F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[145].setRotationPoint(-14.5F, 3F, -8.9F);
		bodyModel[145].rotateAngleX = -0.78539816F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[146].setRotationPoint(-14.51F, 3F, -9.4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[147].setRotationPoint(-7.49F, 3F, -9.4F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[148].setRotationPoint(-42.5F, -15F, 3F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[149].setRotationPoint(-42.5F, -15F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[150].setRotationPoint(35.5F, -15F, 3F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[151].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 19, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[152].setRotationPoint(-60.5F, -16.25F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[153].setRotationPoint(35.5F, -16.25F, -10F);

		bodyModel[154].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 38
		bodyModel[154].setRotationPoint(-41.5F, -14F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[155].setRotationPoint(-41.5F, -13F, 9F);

		bodyModel[156].addBox(0F, 0F, 0F, 77, 1, 3, 0F); // Box 275
		bodyModel[156].setRotationPoint(-41.5F, -14F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[157].setRotationPoint(-41.5F, -13F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 275 glow
		bodyModel[158].setRotationPoint(-41.5F, -12.99F, -8.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 77, 0, 1, 0F); // Box 285 glow
		bodyModel[159].setRotationPoint(-41.5F, -12.99F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 91, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[160].setRotationPoint(-41.5F, -11F, -9.9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 90, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[161].setRotationPoint(-54.5F, -11F, 9.9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[162].setRotationPoint(-34F, -16.5F, -0.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[163].setRotationPoint(-24F, -16.5F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[164].setRotationPoint(-14F, -16.5F, -0.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[165].setRotationPoint(-4F, -16.5F, -0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[166].setRotationPoint(6F, -16.5F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[167].setRotationPoint(16F, -16.5F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[168].setRotationPoint(26F, -16.5F, -0.5F);

		bodyModel[169].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[169].setRotationPoint(-30F, -8F, 7F);

		bodyModel[170].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[170].setRotationPoint(-30F, -8F, -7F);

		bodyModel[171].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[171].setRotationPoint(-20F, -8F, 7F);

		bodyModel[172].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[172].setRotationPoint(-20F, -8F, -7F);

		bodyModel[173].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[173].setRotationPoint(-10F, -8F, 7F);

		bodyModel[174].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[174].setRotationPoint(-10F, -8F, -7F);

		bodyModel[175].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[175].setRotationPoint(0F, -8F, 7F);

		bodyModel[176].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[176].setRotationPoint(0F, -8F, -7F);

		bodyModel[177].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[177].setRotationPoint(10F, -8F, 7F);

		bodyModel[178].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[178].setRotationPoint(10F, -8F, -7F);

		bodyModel[179].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[179].setRotationPoint(20F, -8F, 7F);

		bodyModel[180].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[180].setRotationPoint(20F, -8F, -7F);

		bodyModel[181].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[181].setRotationPoint(30F, -8F, 7F);

		bodyModel[182].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[182].setRotationPoint(30F, -8F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[183].setRotationPoint(41.5F, -15F, -5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[184].setRotationPoint(50.5F, -15F, -5F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[185].setRotationPoint(42.5F, -15F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[186].setRotationPoint(51.5F, -15F, 1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[187].setRotationPoint(38.5F, -14.99F, -0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[188].setRotationPoint(-45.5F, -14.99F, -0.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[189].setRotationPoint(48.5F, -15F, -6F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 38
		bodyModel[190].setRotationPoint(45.5F, -15F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 13, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[191].setRotationPoint(45.5F, -13F, -5.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[192].setRotationPoint(54.5F, -15F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[193].setRotationPoint(48.5F, -5F, -5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(48.5F, -5F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[195].setRotationPoint(49.5F, -5F, -4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[196].setRotationPoint(48.5F, -5F, 9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[197].setRotationPoint(48.5F, -5F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[198].setRotationPoint(49.5F, -5F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[199].setRotationPoint(48.5F, -5F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[200].setRotationPoint(46F, -5F, 8F);

		bodyModel[201].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[201].setRotationPoint(36.5F, -10F, 3F);

		bodyModel[202].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 38
		bodyModel[202].setRotationPoint(36.5F, -4F, 3F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[203].setRotationPoint(-47.5F, -15F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[204].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[205].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 38
		bodyModel[205].setRotationPoint(-55.5F, -15F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[207].setRotationPoint(-46.5F, -15F, -4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[208].setRotationPoint(-60.5F, -15F, 6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 16, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[209].setRotationPoint(-44.5F, -15F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[210].setRotationPoint(-55.5F, -5F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[211].setRotationPoint(-54.5F, -5F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[212].setRotationPoint(-55.5F, -5F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[213].setRotationPoint(-55.5F, -5F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(-54.5F, -5F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[215].setRotationPoint(-55.5F, -5F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[216].setRotationPoint(-55.5F, -5F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[217].setRotationPoint(-53F, -5F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[218].setRotationPoint(-49F, -5F, -3F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[219].setRotationPoint(-50.75F, -3.5F, 2F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -2F, 0F, 0F, -2F); // Box 128 cull
		bodyModel[220].setRotationPoint(-51.25F, -6.5F, 2F);

		bodyModel[221].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[221].setRotationPoint(-50F, -2.5F, 3F);
		bodyModel[221].rotateAngleY = -0.78539816F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[222].setRotationPoint(53.5F, -15F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[223].setRotationPoint(56.5F, -14F, 10.5F);

		bodyModel[224].addShapeBox(0F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[224].setRotationPoint(56.5F, -14F, -10.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[225].setRotationPoint(43.5F, -3F, -4.25F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[226].setRotationPoint(43F, -6F, -4.25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[227].setRotationPoint(42.75F, -4.5F, -0.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[228].setRotationPoint(42.75F, -4.5F, -4.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[229].setRotationPoint(44.25F, -4.5F, -0.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[230].setRotationPoint(44.25F, -4.5F, -4.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[231].setRotationPoint(43F, -2.5F, -4.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[232].setRotationPoint(42.5F, -1.5F, -1.25F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[233].setRotationPoint(42.5F, -1.5F, -4.25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[234].setRotationPoint(43.5F, -3F, 0.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[235].setRotationPoint(43F, -6F, 0.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[236].setRotationPoint(42.75F, -4.5F, 4.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[237].setRotationPoint(42.75F, -4.5F, 0.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[238].setRotationPoint(44.25F, -4.5F, 4.25F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[239].setRotationPoint(44.25F, -4.5F, 0.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[240].setRotationPoint(43F, -2.5F, 0.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[241].setRotationPoint(42.5F, -1.5F, 3.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[242].setRotationPoint(42.5F, -1.5F, 0.75F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[243].setRotationPoint(43.5F, -3F, 5.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527
		bodyModel[244].setRotationPoint(43F, -6F, 5.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[245].setRotationPoint(42.75F, -4.5F, 9.25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[246].setRotationPoint(42.75F, -4.5F, 5.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[247].setRotationPoint(44.25F, -4.5F, 9.25F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[248].setRotationPoint(44.25F, -4.5F, 5.25F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[249].setRotationPoint(43F, -2.5F, 5.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[250].setRotationPoint(42.5F, -1.5F, 8.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[251].setRotationPoint(42.5F, -1.5F, 5.75F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[252].setRotationPoint(-31.5F, 0F, 4F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[253].setRotationPoint(-31.5F, 0F, -10F);

		bodyModel[254].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[254].setRotationPoint(-30F, -3F, 7F);

		bodyModel[255].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[255].setRotationPoint(-30F, -3F, -7F);

		bodyModel[256].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[256].setRotationPoint(-30F, -5F, 7F);

		bodyModel[257].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[257].setRotationPoint(-30F, -3F, 7F);

		bodyModel[258].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[258].setRotationPoint(-30F, -5F, 7F);

		bodyModel[259].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[259].setRotationPoint(-30F, -4.5F, 7F);

		bodyModel[260].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[260].setRotationPoint(-30F, -4F, 7F);

		bodyModel[261].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[261].setRotationPoint(-30F, -5F, 7F);

		bodyModel[262].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[262].setRotationPoint(-30F, -3F, 7F);

		bodyModel[263].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[263].setRotationPoint(-30F, -5F, 7F);

		bodyModel[264].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[264].setRotationPoint(-30F, -4.5F, 7F);

		bodyModel[265].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[265].setRotationPoint(-30F, -4F, 7F);

		bodyModel[266].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(-30F, -5F, -7F);

		bodyModel[267].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[267].setRotationPoint(-30F, -3F, -7F);

		bodyModel[268].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[268].setRotationPoint(-30F, -5F, -7F);

		bodyModel[269].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[269].setRotationPoint(-30F, -4.5F, -7F);

		bodyModel[270].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[270].setRotationPoint(-30F, -4F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[271].setRotationPoint(-30F, -5F, -7F);

		bodyModel[272].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[272].setRotationPoint(-30F, -3F, -7F);

		bodyModel[273].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[273].setRotationPoint(-30F, -5F, -7F);

		bodyModel[274].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[274].setRotationPoint(-30F, -4.5F, -7F);

		bodyModel[275].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[275].setRotationPoint(-30F, -4F, -7F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[276].setRotationPoint(-21.5F, 0F, 4F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[277].setRotationPoint(-21.5F, 0F, -10F);

		bodyModel[278].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(-20F, -3F, 7F);

		bodyModel[279].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[279].setRotationPoint(-20F, -3F, -7F);

		bodyModel[280].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[280].setRotationPoint(-20F, -5F, 7F);

		bodyModel[281].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[281].setRotationPoint(-20F, -3F, 7F);

		bodyModel[282].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[282].setRotationPoint(-20F, -5F, 7F);

		bodyModel[283].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[283].setRotationPoint(-20F, -4.5F, 7F);

		bodyModel[284].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[284].setRotationPoint(-20F, -4F, 7F);

		bodyModel[285].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[285].setRotationPoint(-20F, -5F, 7F);

		bodyModel[286].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[286].setRotationPoint(-20F, -3F, 7F);

		bodyModel[287].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(-20F, -5F, 7F);

		bodyModel[288].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[288].setRotationPoint(-20F, -4.5F, 7F);

		bodyModel[289].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(-20F, -4F, 7F);

		bodyModel[290].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(-20F, -5F, -7F);

		bodyModel[291].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[291].setRotationPoint(-20F, -3F, -7F);

		bodyModel[292].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-20F, -5F, -7F);

		bodyModel[293].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[293].setRotationPoint(-20F, -4.5F, -7F);

		bodyModel[294].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-20F, -4F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(-20F, -5F, -7F);

		bodyModel[296].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[296].setRotationPoint(-20F, -3F, -7F);

		bodyModel[297].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[297].setRotationPoint(-20F, -5F, -7F);

		bodyModel[298].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[298].setRotationPoint(-20F, -4.5F, -7F);

		bodyModel[299].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[299].setRotationPoint(-1.5F, 0F, 4F);

		bodyModel[300].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[300].setRotationPoint(-11.5F, 0F, 4F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[301].setRotationPoint(-1.5F, 0F, -10F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[302].setRotationPoint(-11.5F, 0F, -10F);

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(-10F, -3F, 7F);

		bodyModel[304].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[304].setRotationPoint(-10F, -3F, -7F);

		bodyModel[305].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[305].setRotationPoint(0F, -3F, -7F);

		bodyModel[306].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[306].setRotationPoint(0F, -5F, 7F);

		bodyModel[307].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[307].setRotationPoint(0F, -3F, 7F);

		bodyModel[308].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[308].setRotationPoint(0F, -5F, 7F);

		bodyModel[309].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[309].setRotationPoint(0F, -4.5F, 7F);

		bodyModel[310].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[310].setRotationPoint(0F, -4F, 7F);

		bodyModel[311].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[311].setRotationPoint(0F, -5F, 7F);

		bodyModel[312].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[312].setRotationPoint(0F, -3F, 7F);

		bodyModel[313].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(0F, -5F, 7F);

		bodyModel[314].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[314].setRotationPoint(0F, -4.5F, 7F);

		bodyModel[315].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(0F, -4F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[316].setRotationPoint(-10F, -5F, 7F);

		bodyModel[317].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[317].setRotationPoint(-10F, -3F, 7F);

		bodyModel[318].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[318].setRotationPoint(-10F, -5F, 7F);

		bodyModel[319].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[319].setRotationPoint(-10F, -4.5F, 7F);

		bodyModel[320].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-10F, -4F, 7F);

		bodyModel[321].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(-10F, -5F, 7F);

		bodyModel[322].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[322].setRotationPoint(-10F, -3F, 7F);

		bodyModel[323].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[323].setRotationPoint(-10F, -5F, 7F);

		bodyModel[324].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[324].setRotationPoint(-10F, -4.5F, 7F);

		bodyModel[325].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[325].setRotationPoint(-10F, -4F, 7F);

		bodyModel[326].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[326].setRotationPoint(0F, -5F, -7F);

		bodyModel[327].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[327].setRotationPoint(0F, -3F, -7F);

		bodyModel[328].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[328].setRotationPoint(0F, -5F, -7F);

		bodyModel[329].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[329].setRotationPoint(0F, -4.5F, -7F);

		bodyModel[330].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(0F, -4F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[331].setRotationPoint(0F, -5F, -7F);

		bodyModel[332].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[332].setRotationPoint(0F, -3F, -7F);

		bodyModel[333].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[333].setRotationPoint(0F, -5F, -7F);

		bodyModel[334].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[334].setRotationPoint(0F, -4.5F, -7F);

		bodyModel[335].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[335].setRotationPoint(0F, -4F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[336].setRotationPoint(-10F, -5F, -7F);

		bodyModel[337].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[337].setRotationPoint(-10F, -3F, -7F);

		bodyModel[338].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[338].setRotationPoint(-10F, -5F, -7F);

		bodyModel[339].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[339].setRotationPoint(-10F, -4.5F, -7F);

		bodyModel[340].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(-10F, -4F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[341].setRotationPoint(-10F, -5F, -7F);

		bodyModel[342].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[342].setRotationPoint(-10F, -3F, -7F);

		bodyModel[343].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[343].setRotationPoint(-10F, -5F, -7F);

		bodyModel[344].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[344].setRotationPoint(-10F, -4.5F, -7F);

		bodyModel[345].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(-10F, -4F, -7F);

		bodyModel[346].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[346].setRotationPoint(0F, -3F, 7F);

		bodyModel[347].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[347].setRotationPoint(8.5F, 0F, 4F);

		bodyModel[348].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[348].setRotationPoint(18.5F, 0F, -10F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[349].setRotationPoint(8.5F, 0F, -10F);

		bodyModel[350].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[350].setRotationPoint(10F, -3F, 7F);

		bodyModel[351].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(10F, -3F, -7F);

		bodyModel[352].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[352].setRotationPoint(20F, -3F, 7F);

		bodyModel[353].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[353].setRotationPoint(20F, -3F, -7F);

		bodyModel[354].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[354].setRotationPoint(20F, -5F, 7F);

		bodyModel[355].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[355].setRotationPoint(20F, -3F, 7F);

		bodyModel[356].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[356].setRotationPoint(20F, -5F, 7F);

		bodyModel[357].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[357].setRotationPoint(20F, -4.5F, 7F);

		bodyModel[358].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[358].setRotationPoint(20F, -4F, 7F);

		bodyModel[359].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[359].setRotationPoint(20F, -5F, 7F);

		bodyModel[360].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[360].setRotationPoint(20F, -3F, 7F);

		bodyModel[361].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[361].setRotationPoint(20F, -5F, 7F);

		bodyModel[362].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[362].setRotationPoint(20F, -4.5F, 7F);

		bodyModel[363].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(20F, -4F, 7F);

		bodyModel[364].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[364].setRotationPoint(10F, -5F, 7F);

		bodyModel[365].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[365].setRotationPoint(10F, -3F, 7F);

		bodyModel[366].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[366].setRotationPoint(10F, -5F, 7F);

		bodyModel[367].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[367].setRotationPoint(10F, -4.5F, 7F);

		bodyModel[368].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(10F, -4F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(10F, -5F, 7F);

		bodyModel[370].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[370].setRotationPoint(10F, -3F, 7F);

		bodyModel[371].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[371].setRotationPoint(10F, -5F, 7F);

		bodyModel[372].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[372].setRotationPoint(10F, -4.5F, 7F);

		bodyModel[373].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(10F, -4F, 7F);

		bodyModel[374].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[374].setRotationPoint(20F, -5F, -7F);

		bodyModel[375].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[375].setRotationPoint(20F, -3F, -7F);

		bodyModel[376].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[376].setRotationPoint(20F, -5F, -7F);

		bodyModel[377].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[377].setRotationPoint(20F, -4.5F, -7F);

		bodyModel[378].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[378].setRotationPoint(20F, -4F, -7F);

		bodyModel[379].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[379].setRotationPoint(20F, -5F, -7F);

		bodyModel[380].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[380].setRotationPoint(20F, -3F, -7F);

		bodyModel[381].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[381].setRotationPoint(20F, -5F, -7F);

		bodyModel[382].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[382].setRotationPoint(20F, -4.5F, -7F);

		bodyModel[383].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[383].setRotationPoint(20F, -4F, -7F);

		bodyModel[384].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[384].setRotationPoint(10F, -5F, -7F);

		bodyModel[385].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[385].setRotationPoint(10F, -3F, -7F);

		bodyModel[386].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[386].setRotationPoint(10F, -5F, -7F);

		bodyModel[387].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[387].setRotationPoint(10F, -4.5F, -7F);

		bodyModel[388].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[388].setRotationPoint(10F, -4F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[389].setRotationPoint(10F, -5F, -7F);

		bodyModel[390].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[390].setRotationPoint(10F, -3F, -7F);

		bodyModel[391].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[391].setRotationPoint(10F, -5F, -7F);

		bodyModel[392].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[392].setRotationPoint(10F, -4.5F, -7F);

		bodyModel[393].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[393].setRotationPoint(10F, -4F, -7F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[394].setRotationPoint(28.5F, 0F, 4F);

		bodyModel[395].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 638
		bodyModel[395].setRotationPoint(28.5F, 0F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[396].setRotationPoint(30F, -5F, 7F);

		bodyModel[397].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[397].setRotationPoint(30F, -3F, 7F);

		bodyModel[398].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Right seat part
		bodyModel[398].setRotationPoint(30F, -3F, 7F);

		bodyModel[399].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[399].setRotationPoint(30F, -5F, 7F);

		bodyModel[400].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[400].setRotationPoint(30F, -4.5F, 7F);

		bodyModel[401].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[401].setRotationPoint(30F, -4F, 7F);

		bodyModel[402].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[402].setRotationPoint(30F, -5F, 7F);

		bodyModel[403].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Right seat part
		bodyModel[403].setRotationPoint(30F, -3F, 7F);

		bodyModel[404].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[404].setRotationPoint(30F, -5F, 7F);

		bodyModel[405].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Right seat part
		bodyModel[405].setRotationPoint(30F, -4.5F, 7F);

		bodyModel[406].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[406].setRotationPoint(30F, -4F, 7F);

		bodyModel[407].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[407].setRotationPoint(30F, -3F, -7F);

		bodyModel[408].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[408].setRotationPoint(30F, -5F, -7F);

		bodyModel[409].addBox(-2.5F, 0F, 2F, 5, 3, 1, 0F); // Left seat part
		bodyModel[409].setRotationPoint(30F, -3F, -7F);

		bodyModel[410].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[410].setRotationPoint(30F, -5F, -7F);

		bodyModel[411].addShapeBox(1.5F, 0F, 2.25F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[411].setRotationPoint(30F, -4.5F, -7F);

		bodyModel[412].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[412].setRotationPoint(30F, -4F, -7F);

		bodyModel[413].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[413].setRotationPoint(30F, -5F, -7F);

		bodyModel[414].addBox(-2.5F, 0F, -3F, 5, 3, 1, 0F); // Left seat part
		bodyModel[414].setRotationPoint(30F, -3F, -7F);

		bodyModel[415].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[415].setRotationPoint(30F, -5F, -7F);

		bodyModel[416].addShapeBox(1.5F, 0F, -2.75F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Left seat part
		bodyModel[416].setRotationPoint(30F, -4.5F, -7F);

		bodyModel[417].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[417].setRotationPoint(30F, -4F, -7F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[418].setRotationPoint(-36.5F, -5F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 128
		bodyModel[419].setRotationPoint(-39.5F, -5F, -10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Box 128
		bodyModel[420].setRotationPoint(-39.5F, -4F, -7F);

		bodyModel[421].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[421].setRotationPoint(-40.5F, -3F, -9F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[422].setRotationPoint(-41F, -6F, -9F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 128
		bodyModel[423].setRotationPoint(-41F, -4F, -9F);

		bodyModel[424].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 128
		bodyModel[424].setRotationPoint(-39.63F, -2F, -8F);
		bodyModel[424].rotateAngleY = -0.78539816F;

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[425].setRotationPoint(49.87F, -4F, 8.63F);
		bodyModel[425].rotateAngleY = 0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[426].setRotationPoint(49.67F, -4F, -0.6F);
		bodyModel[426].rotateAngleY = 0.78539816F;

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[427].setRotationPoint(49.87F, -4F, -4.69F);
		bodyModel[427].rotateAngleY = 0.78539816F;

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[428].setRotationPoint(-54.53F, -4F, 3.63F);
		bodyModel[428].rotateAngleY = 0.78539816F;

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[429].setRotationPoint(-54.33F, -4F, -0.5F);
		bodyModel[429].rotateAngleY = 0.78539816F;

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[430].setRotationPoint(-54.53F, -4F, -9.69F);
		bodyModel[430].rotateAngleY = 0.78539816F;

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[431].setRotationPoint(48.5F, -9F, 8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[432].setRotationPoint(48.5F, -14F, 8F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 773
		bodyModel[433].setRotationPoint(48.5F, -9F, -5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 774
		bodyModel[434].setRotationPoint(48.5F, -14F, -5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[435].setRotationPoint(-55.5F, -9F, 3F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[436].setRotationPoint(-55.5F, -14F, 3F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 773
		bodyModel[437].setRotationPoint(-55.5F, -9F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 774
		bodyModel[438].setRotationPoint(-55.5F, -14F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 526
		bodyModel[439].setRotationPoint(-50.5F, -3F, -9.25F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 527
		bodyModel[440].setRotationPoint(-49F, -6F, -9.25F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 528
		bodyModel[441].setRotationPoint(-49.75F, -4.5F, -5.75F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 529
		bodyModel[442].setRotationPoint(-49.75F, -4.5F, -9.75F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 530
		bodyModel[443].setRotationPoint(-50.75F, -4.5F, -5.75F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 531
		bodyModel[444].setRotationPoint(-50.75F, -4.5F, -9.75F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 532
		bodyModel[445].setRotationPoint(-48.5F, -2.5F, -9.25F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 533
		bodyModel[446].setRotationPoint(-49F, -1.5F, -6.25F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 534
		bodyModel[447].setRotationPoint(-49F, -1.5F, -9.25F);

		bodyModel[448].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 128
		bodyModel[448].setRotationPoint(-50.75F, -3.5F, -2F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -2F, 0F, 0F, -2F); // Box 128 cull
		bodyModel[449].setRotationPoint(-51.25F, -6.5F, -2F);

		bodyModel[450].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[450].setRotationPoint(-50F, -2.5F, -1F);
		bodyModel[450].rotateAngleY = -0.78539816F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.85F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.85F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.35F); // Box 38 cull
		bodyModel[451].setRotationPoint(49.99F, -4F, -3.25F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.85F, -0.5F, -0.5F, -0.35F, 0F, -0.5F, 0F); // Box 38 cull
		bodyModel[452].setRotationPoint(-55.49F, -4F, 0.75F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[453].setRotationPoint(-41.5F, -18F, 7.25F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[454].setRotationPoint(-41.5F, -18F, -8.25F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 77, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[455].setRotationPoint(-41.5F, -16F, 8F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[456].setRotationPoint(-41.5F, -17F, 5.25F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 77, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[457].setRotationPoint(-41.5F, -16F, -10F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[458].setRotationPoint(-41.5F, -17F, -8.25F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 77, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[459].setRotationPoint(-41.5F, -17F, -2F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[460].setRotationPoint(35.5F, -18F, -10F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[461].setRotationPoint(35.5F, -18F, 7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[462].setRotationPoint(-60.5F, -18F, -10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[463].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[464].setRotationPoint(35.5F, -17F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[465].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[466].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[466].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[467].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[467].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[468].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[468].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[469].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[469].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[470].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[470].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[471].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[471].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[472].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[472].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[473].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[473].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[474].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[474].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[475].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[476].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[477].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[478].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[479].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[480].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[481].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[482].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[483].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[484].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[485].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[486].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[487].setRotationPoint(60.5F, 4F, -10.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[488].setRotationPoint(56.5F, 4F, -10.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[489].setRotationPoint(60.5F, 4F, 7.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[490].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[491].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[491].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[492].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[492].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[493].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[493].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[494].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[494].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[495].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[495].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[496].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[496].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[497].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[497].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[498].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[498].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[499].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[499].setRotationPoint(56.51F, 4F, -8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[501] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[502] = new ModelRendererTurbo(this, 311, 16, textureX, textureY); // Box 275
		bodyModel[503] = new ModelRendererTurbo(this, 310, 21, textureX, textureY); // Box 276
		bodyModel[504] = new ModelRendererTurbo(this, 301, 20, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 301, 15, textureX, textureY); // Box 128
		bodyModel[506] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 847
		bodyModel[507] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 848
		bodyModel[508] = new ModelRendererTurbo(this, 301, 1, textureX, textureY); // Box 204
		bodyModel[509] = new ModelRendererTurbo(this, 301, 6, textureX, textureY); // Box 205
		bodyModel[510] = new ModelRendererTurbo(this, 69, 78, textureX, textureY); // Box 128
		bodyModel[511] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 202
		bodyModel[512] = new ModelRendererTurbo(this, 382, 90, textureX, textureY); // Box 128
		bodyModel[513] = new ModelRendererTurbo(this, 380, 82, textureX, textureY); // Box 128
		bodyModel[514] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[515] = new ModelRendererTurbo(this, 412, 52, textureX, textureY); // Box 153
		bodyModel[516] = new ModelRendererTurbo(this, 418, 45, textureX, textureY); // Box 128
		bodyModel[517] = new ModelRendererTurbo(this, 426, 46, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 382, 76, textureX, textureY); // Box 253
		bodyModel[519] = new ModelRendererTurbo(this, 412, 46, textureX, textureY); // Box 255
		bodyModel[520] = new ModelRendererTurbo(this, 383, 96, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 383, 71, textureX, textureY); // Box 251
		bodyModel[522] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 446, 17, textureX, textureY); // Box 153
		bodyModel[524] = new ModelRendererTurbo(this, 17, 90, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 153
		bodyModel[528] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 18, 109, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 253
		bodyModel[531] = new ModelRendererTurbo(this, 4, 109, textureX, textureY); // Box 255
		bodyModel[532] = new ModelRendererTurbo(this, 18, 96, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 18, 71, textureX, textureY); // Box 251
		bodyModel[534] = new ModelRendererTurbo(this, 16, 42, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[536] = new ModelRendererTurbo(this, 111, 155, textureX, textureY); // Box 2
		bodyModel[537] = new ModelRendererTurbo(this, 111, 180, textureX, textureY); // Box 59
		bodyModel[538] = new ModelRendererTurbo(this, 76, 155, textureX, textureY); // Box 2
		bodyModel[539] = new ModelRendererTurbo(this, 196, 159, textureX, textureY); // Box 52
		bodyModel[540] = new ModelRendererTurbo(this, 151, 181, textureX, textureY); // Box 52
		bodyModel[541] = new ModelRendererTurbo(this, 75, 181, textureX, textureY); // Box 41
		bodyModel[542] = new ModelRendererTurbo(this, 74, 179, textureX, textureY); // Box 41
		bodyModel[543] = new ModelRendererTurbo(this, 88, 179, textureX, textureY); // Box 41
		bodyModel[544] = new ModelRendererTurbo(this, 319, 164, textureX, textureY); // Box 2
		bodyModel[545] = new ModelRendererTurbo(this, 328, 164, textureX, textureY); // Box 2
		bodyModel[546] = new ModelRendererTurbo(this, 329, 176, textureX, textureY); // Box 2
		bodyModel[547] = new ModelRendererTurbo(this, 321, 167, textureX, textureY); // Box 2
		bodyModel[548] = new ModelRendererTurbo(this, 330, 167, textureX, textureY); // Box 2
		bodyModel[549] = new ModelRendererTurbo(this, 328, 170, textureX, textureY); // Box 2
		bodyModel[550] = new ModelRendererTurbo(this, 330, 173, textureX, textureY); // Box 2
		bodyModel[551] = new ModelRendererTurbo(this, 339, 166, textureX, textureY); // Box 128
		bodyModel[552] = new ModelRendererTurbo(this, 339, 173, textureX, textureY); // Box 128
		bodyModel[553] = new ModelRendererTurbo(this, 321, 166, textureX, textureY); // Box 128
		bodyModel[554] = new ModelRendererTurbo(this, 325, 173, textureX, textureY); // Box 128
		bodyModel[555] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 628
		bodyModel[556] = new ModelRendererTurbo(this, 328, 148, textureX, textureY); // Box 629
		bodyModel[557] = new ModelRendererTurbo(this, 329, 160, textureX, textureY); // Box 630
		bodyModel[558] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 631
		bodyModel[559] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 632
		bodyModel[560] = new ModelRendererTurbo(this, 328, 154, textureX, textureY); // Box 633
		bodyModel[561] = new ModelRendererTurbo(this, 330, 157, textureX, textureY); // Box 634
		bodyModel[562] = new ModelRendererTurbo(this, 339, 150, textureX, textureY); // Box 635
		bodyModel[563] = new ModelRendererTurbo(this, 339, 157, textureX, textureY); // Box 636
		bodyModel[564] = new ModelRendererTurbo(this, 321, 150, textureX, textureY); // Box 638
		bodyModel[565] = new ModelRendererTurbo(this, 325, 157, textureX, textureY); // Box 639
		bodyModel[566] = new ModelRendererTurbo(this, 367, 303, textureX, textureY); // Box 38
		bodyModel[567] = new ModelRendererTurbo(this, 333, 303, textureX, textureY); // Box 38
		bodyModel[568] = new ModelRendererTurbo(this, 39, 275, textureX, textureY); // Box 38
		bodyModel[569] = new ModelRendererTurbo(this, 63, 275, textureX, textureY); // Box 38
		bodyModel[570] = new ModelRendererTurbo(this, 153, 166, textureX, textureY); // Box 2
		bodyModel[571] = new ModelRendererTurbo(this, 184, 166, textureX, textureY); // Box 2
		bodyModel[572] = new ModelRendererTurbo(this, 324, 93, textureX, textureY); // Right step part
		bodyModel[573] = new ModelRendererTurbo(this, 338, 93, textureX, textureY); // Right step part
		bodyModel[574] = new ModelRendererTurbo(this, 252, 285, textureX, textureY); // Boc 42
		bodyModel[575] = new ModelRendererTurbo(this, 155, 310, textureX, textureY); // Left seat part
		bodyModel[576] = new ModelRendererTurbo(this, 422, 52, textureX, textureY); // Box 128
		bodyModel[577] = new ModelRendererTurbo(this, 410, 52, textureX, textureY); // Box 261
		bodyModel[578] = new ModelRendererTurbo(this, 14, 115, textureX, textureY); // Box 128
		bodyModel[579] = new ModelRendererTurbo(this, 2, 115, textureX, textureY); // Box 261

		bodyModel[500].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[500].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[501].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[501].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.6F, -0.75F, 0F, -1.1F, -0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
		bodyModel[502].setRotationPoint(53.5F, -18F, 10F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0.15F, 0F, 0F, 0.15F, -0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 276
		bodyModel[503].setRotationPoint(53.5F, -18.5F, 8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[504].setRotationPoint(49F, -18.5F, 7.85F);
		bodyModel[504].rotateAngleX = 1.04283423F;

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F); // Box 128
		bodyModel[505].setRotationPoint(49F, -17.25F, 10F);
		bodyModel[505].rotateAngleX = 0.41887902F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1.1F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.5F, -0.35F, 0F, -1F, -0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F); // Box 847
		bodyModel[506].setRotationPoint(-59.5F, -18F, -11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.85F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F); // Box 848
		bodyModel[507].setRotationPoint(-59.5F, -18.5F, -10F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[508].setRotationPoint(49F, -19.36F, -8.36F);
		bodyModel[508].rotateAngleX = -1.04283423F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.54F, -0.5F, 0F, -0.54F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[509].setRotationPoint(49F, -17.65F, -10.92F);
		bodyModel[509].rotateAngleX = -0.41887902F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[510].setRotationPoint(-61F, -6F, -12F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[511].setRotationPoint(-61F, -6F, 11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[512].setRotationPoint(63F, -20F, -7F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[513].setRotationPoint(63F, -20F, -3F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[514].setRotationPoint(63F, -16F, -4F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[515].setRotationPoint(63F, -16F, 1F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[516].setRotationPoint(63F, -19F, -1F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[517].setRotationPoint(63F, -18.75F, -5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[518].setRotationPoint(63F, -20F, 3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[519].setRotationPoint(63F, -18.75F, 4F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[520].setRotationPoint(63F, -19F, -10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[521].setRotationPoint(63F, -19F, 7F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[522].setRotationPoint(63F, -16F, -5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[523].setRotationPoint(63F, -16F, 0F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[524].setRotationPoint(-63.5F, -20F, -7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[525].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[526].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[527].setRotationPoint(-63.5F, -16F, 1F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[528].setRotationPoint(-63.5F, -19F, -1F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[529].setRotationPoint(-63.5F, -18.75F, -5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[530].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 255
		bodyModel[531].setRotationPoint(-63.5F, -18.75F, 4F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[532].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[533].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[534].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[535].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[536].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 2
		bodyModel[536].setRotationPoint(-17.5F, 3F, 2F);

		bodyModel[537].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 59
		bodyModel[537].setRotationPoint(-17.5F, 3F, -10F);

		bodyModel[538].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 2
		bodyModel[538].setRotationPoint(-23.5F, 3F, 5F);

		bodyModel[539].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[539].setRotationPoint(25.5F, 3F, 9F);

		bodyModel[540].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[540].setRotationPoint(2.5F, 3F, -10F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[541].setRotationPoint(-32.5F, 3F, -8.9F);
		bodyModel[541].rotateAngleX = -0.78539816F;

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[542].setRotationPoint(-32.51F, 3F, -9.4F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[543].setRotationPoint(-27.49F, 3F, -9.4F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[544].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[545].setRotationPoint(56.5F, 4F, 6.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 2
		bodyModel[546].setRotationPoint(56.5F, 7F, 9.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[547].setRotationPoint(56.5F, 2.5F, 6.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[548].setRotationPoint(56.5F, 4F, 8F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 2
		bodyModel[549].setRotationPoint(56.5F, 5.5F, 8F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 2
		bodyModel[550].setRotationPoint(56.5F, 5.5F, 9.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[551].setRotationPoint(60.49F, 3F, 5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[552].setRotationPoint(60.49F, 3F, 9.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[553].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[554].setRotationPoint(56.51F, 3F, 9.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 628
		bodyModel[555].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 629
		bodyModel[556].setRotationPoint(56.5F, 4F, -8.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 630
		bodyModel[557].setRotationPoint(56.5F, 7F, -10.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 631
		bodyModel[558].setRotationPoint(56.5F, 2.5F, -6.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 632
		bodyModel[559].setRotationPoint(56.5F, 4F, -8F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 633
		bodyModel[560].setRotationPoint(56.5F, 5.5F, -10F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 634
		bodyModel[561].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 635
		bodyModel[562].setRotationPoint(60.49F, 3F, -9F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[563].setRotationPoint(60.49F, 3F, -11.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 638
		bodyModel[564].setRotationPoint(56.51F, 3F, -9F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[565].setRotationPoint(56.51F, 3F, -11.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[566].setRotationPoint(50.5F, -15F, -6F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[567].setRotationPoint(41.5F, -15F, -6F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[568].setRotationPoint(-56.5F, -15F, 5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[569].setRotationPoint(-47.5F, -15F, 5F);

		bodyModel[570].addBox(0F, 0F, 0F, 10, 5, 5, 0F); // Box 2
		bodyModel[570].setRotationPoint(6.5F, 3F, 5F);

		bodyModel[571].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 2
		bodyModel[571].setRotationPoint(19.5F, 3F, 5F);

		bodyModel[572].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[572].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[573].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[573].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[574].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Boc 42
		bodyModel[574].setRotationPoint(18.5F, 0F, 4F);

		bodyModel[575].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[575].setRotationPoint(-20F, -4F, -7F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[576].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[577].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[578].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[579].setRotationPoint(-63.5F, -7F, 5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 580; i++)
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
		if(GetColor(entity)==123456){
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