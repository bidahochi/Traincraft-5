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

public class ModelACFGN28SeatCoach_Dinette extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelACFGN28SeatCoach_Dinette() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[568];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 44, 116, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 335, 120, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 301, 132, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 29, 123, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 48, 132, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 74, 132, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 310, 119, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 64, 119, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Left trapdoor
		bodyModel[11] = new ModelRendererTurbo(this, 35, 129, textureX, textureY); // Right trapdoor
		bodyModel[12] = new ModelRendererTurbo(this, 72, 69, textureX, textureY); // Left side door
		bodyModel[13] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 83, 87, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 28, 90, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 29, 56, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 45, 30, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Right side door
		bodyModel[20] = new ModelRendererTurbo(this, 359, 22, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 327, 22, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 35, 81, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 344, 16, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 72, 66, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 72, 87, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Vestibule door
		bodyModel[28] = new ModelRendererTurbo(this, 344, 24, textureX, textureY); // Rear end door
		bodyModel[29] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 72, 49, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[33] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[34] = new ModelRendererTurbo(this, 358, 6, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 363, 14, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 72, 218, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 375, 14, textureX, textureY); // Box 176
		bodyModel[38] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[39] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[41] = new ModelRendererTurbo(this, 32, 24, textureX, textureY); // Front gate closed
		bodyModel[42] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Front gate open
		bodyModel[43] = new ModelRendererTurbo(this, 101, 7, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 96, 2, textureX, textureY); // Box 176
		bodyModel[46] = new ModelRendererTurbo(this, 63, 3, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 369, 2, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 77, 151, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 253, 148, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 253, 151, textureX, textureY); // Box 2
		bodyModel[54] = new ModelRendererTurbo(this, 260, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[55] = new ModelRendererTurbo(this, 258, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[56] = new ModelRendererTurbo(this, 93, 148, textureX, textureY); // Box 2
		bodyModel[57] = new ModelRendererTurbo(this, 91, 151, textureX, textureY); // Box 2
		bodyModel[58] = new ModelRendererTurbo(this, 246, 148, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 244, 151, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 100, 148, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 100, 151, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 105, 148, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[63] = new ModelRendererTurbo(this, 107, 151, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[64] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // Box 24
		bodyModel[65] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 25
		bodyModel[66] = new ModelRendererTurbo(this, 84, 141, textureX, textureY); // Box 27
		bodyModel[67] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 28
		bodyModel[68] = new ModelRendererTurbo(this, 253, 141, textureX, textureY); // Box 29
		bodyModel[69] = new ModelRendererTurbo(this, 260, 141, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[70] = new ModelRendererTurbo(this, 258, 138, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[71] = new ModelRendererTurbo(this, 93, 138, textureX, textureY); // Box 32
		bodyModel[72] = new ModelRendererTurbo(this, 91, 141, textureX, textureY); // Box 33
		bodyModel[73] = new ModelRendererTurbo(this, 246, 138, textureX, textureY); // Box 34
		bodyModel[74] = new ModelRendererTurbo(this, 244, 141, textureX, textureY); // Box 35
		bodyModel[75] = new ModelRendererTurbo(this, 100, 138, textureX, textureY); // Box 36
		bodyModel[76] = new ModelRendererTurbo(this, 100, 141, textureX, textureY); // Box 37
		bodyModel[77] = new ModelRendererTurbo(this, 105, 138, textureX, textureY); // Box 38
		bodyModel[78] = new ModelRendererTurbo(this, 107, 141, textureX, textureY); // Box 39
		bodyModel[79] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 84, 138, textureX, textureY); // Box 41
		bodyModel[81] = new ModelRendererTurbo(this, 377, 31, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 393, 61, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 377, 44, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 398, 44, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 384, 43, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 391, 43, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 404, 62, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 388, 31, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 376, 25, textureX, textureY); // Box 128
		bodyModel[90] = new ModelRendererTurbo(this, 388, 25, textureX, textureY); // Box 153
		bodyModel[91] = new ModelRendererTurbo(this, 27, 3, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 14, 31, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 22, 14, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 4, 1, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 21, 5, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 153
		bodyModel[101] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 383, 24, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 72, 228, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 72, 187, textureX, textureY); // Box 193
		bodyModel[105] = new ModelRendererTurbo(this, 72, 224, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 194
		bodyModel[107] = new ModelRendererTurbo(this, 215, 87, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 201, 87, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 201, 91, textureX, textureY); // Right side loading door
		bodyModel[110] = new ModelRendererTurbo(this, 198, 97, textureX, textureY); // Box 202
		bodyModel[111] = new ModelRendererTurbo(this, 212, 97, textureX, textureY); // Box 203
		bodyModel[112] = new ModelRendererTurbo(this, 3, 114, textureX, textureY); // Box 38
		bodyModel[113] = new ModelRendererTurbo(this, 10, 103, textureX, textureY); // Box 38
		bodyModel[114] = new ModelRendererTurbo(this, 2, 110, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 8, 100, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 1, 141, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 7, 96, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 2, 99, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 6, 91, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 5, 82, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 2, 91, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 247
		bodyModel[125] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 248
		bodyModel[126] = new ModelRendererTurbo(this, 2, 63, textureX, textureY); // Box 249
		bodyModel[127] = new ModelRendererTurbo(this, 8, 70, textureX, textureY); // Box 250
		bodyModel[128] = new ModelRendererTurbo(this, 1, 67, textureX, textureY); // Box 251
		bodyModel[129] = new ModelRendererTurbo(this, 7, 73, textureX, textureY); // Box 252
		bodyModel[130] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 253
		bodyModel[131] = new ModelRendererTurbo(this, 6, 77, textureX, textureY); // Box 254
		bodyModel[132] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 255
		bodyModel[133] = new ModelRendererTurbo(this, 51, 69, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 63, 69, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 51, 90, textureX, textureY); // Box 202
		bodyModel[136] = new ModelRendererTurbo(this, 63, 90, textureX, textureY); // Box 203
		bodyModel[137] = new ModelRendererTurbo(this, 366, 87, textureX, textureY); // Box 38
		bodyModel[138] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 373, 97, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 372, 91, textureX, textureY); // Box 128
		bodyModel[141] = new ModelRendererTurbo(this, 370, 83, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 366, 67, textureX, textureY); // Box 248
		bodyModel[143] = new ModelRendererTurbo(this, 374, 67, textureX, textureY); // Box 250
		bodyModel[144] = new ModelRendererTurbo(this, 373, 72, textureX, textureY); // Box 252
		bodyModel[145] = new ModelRendererTurbo(this, 372, 77, textureX, textureY); // Box 254
		bodyModel[146] = new ModelRendererTurbo(this, 371, 86, textureX, textureY); // Box 38
		bodyModel[147] = new ModelRendererTurbo(this, 385, 110, textureX, textureY); // Box 128
		bodyModel[148] = new ModelRendererTurbo(this, 392, 84, textureX, textureY); // Box 128
		bodyModel[149] = new ModelRendererTurbo(this, 384, 104, textureX, textureY); // Box 128
		bodyModel[150] = new ModelRendererTurbo(this, 385, 99, textureX, textureY); // Box 128
		bodyModel[151] = new ModelRendererTurbo(this, 381, 83, textureX, textureY); // Box 128
		bodyModel[152] = new ModelRendererTurbo(this, 385, 75, textureX, textureY); // Box 128
		bodyModel[153] = new ModelRendererTurbo(this, 371, 66, textureX, textureY); // Box 247
		bodyModel[154] = new ModelRendererTurbo(this, 385, 60, textureX, textureY); // Box 249
		bodyModel[155] = new ModelRendererTurbo(this, 384, 64, textureX, textureY); // Box 251
		bodyModel[156] = new ModelRendererTurbo(this, 385, 70, textureX, textureY); // Box 253
		bodyModel[157] = new ModelRendererTurbo(this, 385, 91, textureX, textureY); // Box 255
		bodyModel[158] = new ModelRendererTurbo(this, 321, 84, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 331, 105, textureX, textureY); // Box 204
		bodyModel[160] = new ModelRendererTurbo(this, 74, 145, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[162] = new ModelRendererTurbo(this, 57, 146, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[163] = new ModelRendererTurbo(this, 65, 150, textureX, textureY,"cull"); // Box 31 cull
		bodyModel[164] = new ModelRendererTurbo(this, 57, 144, textureX, textureY); // Box 31
		bodyModel[165] = new ModelRendererTurbo(this, 65, 148, textureX, textureY); // Box 31
		bodyModel[166] = new ModelRendererTurbo(this, 277, 138, textureX, textureY,"cull"); // Box 475 cull
		bodyModel[167] = new ModelRendererTurbo(this, 277, 143, textureX, textureY); // Box 476
		bodyModel[168] = new ModelRendererTurbo(this, 154, 12, textureX, textureY); // Box 257
		bodyModel[169] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 258
		bodyModel[170] = new ModelRendererTurbo(this, 154, 6, textureX, textureY); // Box 259
		bodyModel[171] = new ModelRendererTurbo(this, 154, 2, textureX, textureY); // Box 260
		bodyModel[172] = new ModelRendererTurbo(this, 154, 4, textureX, textureY); // Box 261
		bodyModel[173] = new ModelRendererTurbo(this, 149, 5, textureX, textureY); // Box 275
		bodyModel[174] = new ModelRendererTurbo(this, 172, 2, textureX, textureY); // Box 275
		bodyModel[175] = new ModelRendererTurbo(this, 172, 5, textureX, textureY); // Box 701
		bodyModel[176] = new ModelRendererTurbo(this, 142, 2, textureX, textureY); // Box 275
		bodyModel[177] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Box 701
		bodyModel[178] = new ModelRendererTurbo(this, 142, 18, textureX, textureY); // Box 549
		bodyModel[179] = new ModelRendererTurbo(this, 142, 21, textureX, textureY); // Box 550
		bodyModel[180] = new ModelRendererTurbo(this, 149, 22, textureX, textureY); // Box 264
		bodyModel[181] = new ModelRendererTurbo(this, 149, 19, textureX, textureY); // Box 264
		bodyModel[182] = new ModelRendererTurbo(this, 149, 16, textureX, textureY); // Box 264
		bodyModel[183] = new ModelRendererTurbo(this, 149, 12, textureX, textureY); // Box 264
		bodyModel[184] = new ModelRendererTurbo(this, 149, 14, textureX, textureY); // Box 264
		bodyModel[185] = new ModelRendererTurbo(this, 159, 17, textureX, textureY); // Box 260
		bodyModel[186] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 259
		bodyModel[187] = new ModelRendererTurbo(this, 154, 19, textureX, textureY); // Box 264
		bodyModel[188] = new ModelRendererTurbo(this, 154, 22, textureX, textureY); // Box 264
		bodyModel[189] = new ModelRendererTurbo(this, 159, 5, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 159, 1, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 74, 165, textureX, textureY); // Box 2
		bodyModel[192] = new ModelRendererTurbo(this, 74, 173, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 208, 159, textureX, textureY); // Box 41
		bodyModel[194] = new ModelRendererTurbo(this, 208, 157, textureX, textureY); // Box 41
		bodyModel[195] = new ModelRendererTurbo(this, 228, 157, textureX, textureY); // Box 41
		bodyModel[196] = new ModelRendererTurbo(this, 77, 160, textureX, textureY); // Box 41
		bodyModel[197] = new ModelRendererTurbo(this, 74, 160, textureX, textureY); // Box 41
		bodyModel[198] = new ModelRendererTurbo(this, 96, 160, textureX, textureY); // Box 41
		bodyModel[199] = new ModelRendererTurbo(this, 99, 160, textureX, textureY); // Box 52
		bodyModel[200] = new ModelRendererTurbo(this, 144, 159, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 153, 159, textureX, textureY); // Box 38
		bodyModel[204] = new ModelRendererTurbo(this, 108, 158, textureX, textureY); // Box 41
		bodyModel[205] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 41
		bodyModel[206] = new ModelRendererTurbo(this, 117, 158, textureX, textureY); // Box 41
		bodyModel[207] = new ModelRendererTurbo(this, 130, 158, textureX, textureY); // Box 41
		bodyModel[208] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 41
		bodyModel[209] = new ModelRendererTurbo(this, 109, 158, textureX, textureY); // Box 41
		bodyModel[210] = new ModelRendererTurbo(this, 158, 157, textureX, textureY); // Box 2
		bodyModel[211] = new ModelRendererTurbo(this, 158, 166, textureX, textureY); // Box 2
		bodyModel[212] = new ModelRendererTurbo(this, 185, 157, textureX, textureY); // Box 2
		bodyModel[213] = new ModelRendererTurbo(this, 185, 166, textureX, textureY); // Box 2
		bodyModel[214] = new ModelRendererTurbo(this, 83, 179, textureX, textureY); // Box 41
		bodyModel[215] = new ModelRendererTurbo(this, 92, 180, textureX, textureY); // Box 41
		bodyModel[216] = new ModelRendererTurbo(this, 84, 180, textureX, textureY); // Box 41
		bodyModel[217] = new ModelRendererTurbo(this, 74, 179, textureX, textureY); // Box 52
		bodyModel[218] = new ModelRendererTurbo(this, 95, 180, textureX, textureY); // Box 52
		bodyModel[219] = new ModelRendererTurbo(this, 103, 179, textureX, textureY); // Box 41
		bodyModel[220] = new ModelRendererTurbo(this, 112, 180, textureX, textureY); // Box 41
		bodyModel[221] = new ModelRendererTurbo(this, 104, 180, textureX, textureY); // Box 41
		bodyModel[222] = new ModelRendererTurbo(this, 116, 179, textureX, textureY); // Box 52
		bodyModel[223] = new ModelRendererTurbo(this, 125, 175, textureX, textureY); // Box 52
		bodyModel[224] = new ModelRendererTurbo(this, 159, 175, textureX, textureY); // Box 52
		bodyModel[225] = new ModelRendererTurbo(this, 150, 178, textureX, textureY); // Box 52
		bodyModel[226] = new ModelRendererTurbo(this, 191, 178, textureX, textureY); // Box 52
		bodyModel[227] = new ModelRendererTurbo(this, 182, 178, textureX, textureY); // Box 52
		bodyModel[228] = new ModelRendererTurbo(this, 48, 264, textureX, textureY); // Box 38
		bodyModel[229] = new ModelRendererTurbo(this, 48, 293, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 1, 245, textureX, textureY); // Box 38
		bodyModel[231] = new ModelRendererTurbo(this, 15, 265, textureX, textureY); // Box 38
		bodyModel[232] = new ModelRendererTurbo(this, 15, 240, textureX, textureY); // Box 276
		bodyModel[233] = new ModelRendererTurbo(this, 157, 268, textureX, textureY); // Box 38
		bodyModel[234] = new ModelRendererTurbo(this, 157, 293, textureX, textureY); // Box 38
		bodyModel[235] = new ModelRendererTurbo(this, 195, 268, textureX, textureY); // Box 38
		bodyModel[236] = new ModelRendererTurbo(this, 174, 269, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 338, 293, textureX, textureY); // Box 38
		bodyModel[238] = new ModelRendererTurbo(this, 334, 268, textureX, textureY); // Box 38
		bodyModel[239] = new ModelRendererTurbo(this, 347, 263, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 355, 297, textureX, textureY); // Box 38
		bodyModel[241] = new ModelRendererTurbo(this, 364, 307, textureX, textureY); // Box 38
		bodyModel[242] = new ModelRendererTurbo(this, 41, 308, textureX, textureY); // Box 38
		bodyModel[243] = new ModelRendererTurbo(this, 31, 308, textureX, textureY); // Box 38
		bodyModel[244] = new ModelRendererTurbo(this, 36, 308, textureX, textureY); // Box 38
		bodyModel[245] = new ModelRendererTurbo(this, 41, 279, textureX, textureY); // Box 38
		bodyModel[246] = new ModelRendererTurbo(this, 31, 279, textureX, textureY); // Box 38
		bodyModel[247] = new ModelRendererTurbo(this, 36, 279, textureX, textureY); // Box 38
		bodyModel[248] = new ModelRendererTurbo(this, 18, 304, textureX, textureY); // Box 38
		bodyModel[249] = new ModelRendererTurbo(this, 21, 309, textureX, textureY); // Box 38
		bodyModel[250] = new ModelRendererTurbo(this, 20, 313, textureX, textureY); // Box 38
		bodyModel[251] = new ModelRendererTurbo(this, 18, 275, textureX, textureY); // Box 38
		bodyModel[252] = new ModelRendererTurbo(this, 21, 280, textureX, textureY); // Box 38
		bodyModel[253] = new ModelRendererTurbo(this, 20, 284, textureX, textureY); // Box 38
		bodyModel[254] = new ModelRendererTurbo(this, 1, 299, textureX, textureY); // Box 38
		bodyModel[255] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 38
		bodyModel[256] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 38
		bodyModel[257] = new ModelRendererTurbo(this, 30, 270, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[258] = new ModelRendererTurbo(this, 58, 242, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 32, 235, textureX, textureY); // Box 38
		bodyModel[260] = new ModelRendererTurbo(this, 72, 261, textureX, textureY); // Box 276
		bodyModel[261] = new ModelRendererTurbo(this, 185, 300, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 314, 248, textureX, textureY); // Box 38
		bodyModel[263] = new ModelRendererTurbo(this, 317, 259, textureX, textureY); // Box 276
		bodyModel[264] = new ModelRendererTurbo(this, 185, 307, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 174, 296, textureX, textureY); // Box 38
		bodyModel[266] = new ModelRendererTurbo(this, 186, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[267] = new ModelRendererTurbo(this, 228, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[268] = new ModelRendererTurbo(this, 333, 294, textureX, textureY); // swing door left
		bodyModel[269] = new ModelRendererTurbo(this, 334, 286, textureX, textureY); // swing door right
		bodyModel[270] = new ModelRendererTurbo(this, 323, 267, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 485, 316, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 485, 340, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 498, 250, textureX, textureY); // Box 38
		bodyModel[274] = new ModelRendererTurbo(this, 471, 231, textureX, textureY); // Box 38
		bodyModel[275] = new ModelRendererTurbo(this, 498, 242, textureX, textureY); // Box 276
		bodyModel[276] = new ModelRendererTurbo(this, 417, 266, textureX, textureY); // Box 128
		bodyModel[277] = new ModelRendererTurbo(this, 420, 281, textureX, textureY); // Box 128
		bodyModel[278] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 128
		bodyModel[279] = new ModelRendererTurbo(this, 399, 279, textureX, textureY); // Box 128
		bodyModel[280] = new ModelRendererTurbo(this, 372, 271, textureX, textureY); // Box 128
		bodyModel[281] = new ModelRendererTurbo(this, 461, 272, textureX, textureY); // Box 128
		bodyModel[282] = new ModelRendererTurbo(this, 371, 278, textureX, textureY); // Box 128
		bodyModel[283] = new ModelRendererTurbo(this, 450, 279, textureX, textureY); // Box 128
		bodyModel[284] = new ModelRendererTurbo(this, 440, 269, textureX, textureY); // Box 128
		bodyModel[285] = new ModelRendererTurbo(this, 388, 269, textureX, textureY); // Box 128
		bodyModel[286] = new ModelRendererTurbo(this, 417, 295, textureX, textureY); // Box 358
		bodyModel[287] = new ModelRendererTurbo(this, 420, 310, textureX, textureY); // Box 359
		bodyModel[288] = new ModelRendererTurbo(this, 409, 302, textureX, textureY); // Box 360
		bodyModel[289] = new ModelRendererTurbo(this, 399, 308, textureX, textureY); // Box 361
		bodyModel[290] = new ModelRendererTurbo(this, 372, 300, textureX, textureY); // Box 363
		bodyModel[291] = new ModelRendererTurbo(this, 459, 295, textureX, textureY); // Box 364
		bodyModel[292] = new ModelRendererTurbo(this, 435, 308, textureX, textureY); // Box 368
		bodyModel[293] = new ModelRendererTurbo(this, 448, 304, textureX, textureY); // Box 375
		bodyModel[294] = new ModelRendererTurbo(this, 388, 298, textureX, textureY); // Box 377
		bodyModel[295] = new ModelRendererTurbo(this, 440, 298, textureX, textureY); // Box 378
		bodyModel[296] = new ModelRendererTurbo(this, 414, 310, textureX, textureY); // Box 366
		bodyModel[297] = new ModelRendererTurbo(this, 428, 310, textureX, textureY); // Box 366
		bodyModel[298] = new ModelRendererTurbo(this, 414, 281, textureX, textureY); // Box 399
		bodyModel[299] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 400
		bodyModel[300] = new ModelRendererTurbo(this, 440, 295, textureX, textureY); // Box 380
		bodyModel[301] = new ModelRendererTurbo(this, 456, 295, textureX, textureY); // Box 380
		bodyModel[302] = new ModelRendererTurbo(this, 388, 295, textureX, textureY); // Box 380
		bodyModel[303] = new ModelRendererTurbo(this, 404, 295, textureX, textureY); // Box 380
		bodyModel[304] = new ModelRendererTurbo(this, 384, 279, textureX, textureY); // Box 128
		bodyModel[305] = new ModelRendererTurbo(this, 371, 307, textureX, textureY); // Box 445
		bodyModel[306] = new ModelRendererTurbo(this, 384, 308, textureX, textureY); // Box 446
		bodyModel[307] = new ModelRendererTurbo(this, 435, 279, textureX, textureY); // Box 128
		bodyModel[308] = new ModelRendererTurbo(this, 450, 308, textureX, textureY); // Box 446
		bodyModel[309] = new ModelRendererTurbo(this, 445, 295, textureX, textureY); // Box 380
		bodyModel[310] = new ModelRendererTurbo(this, 393, 295, textureX, textureY); // Box 380
		bodyModel[311] = new ModelRendererTurbo(this, 397, 304, textureX, textureY); // Box 375
		bodyModel[312] = new ModelRendererTurbo(this, 448, 275, textureX, textureY); // Box 463
		bodyModel[313] = new ModelRendererTurbo(this, 397, 275, textureX, textureY); // Box 464
		bodyModel[314] = new ModelRendererTurbo(this, 471, 330, textureX, textureY); // Box 128
		bodyModel[315] = new ModelRendererTurbo(this, 471, 354, textureX, textureY); // Box 445
		bodyModel[316] = new ModelRendererTurbo(this, 472, 280, textureX, textureY); // Box 128
		bodyModel[317] = new ModelRendererTurbo(this, 472, 309, textureX, textureY); // Box 445
		bodyModel[318] = new ModelRendererTurbo(this, 418, 318, textureX, textureY); // Box 128
		bodyModel[319] = new ModelRendererTurbo(this, 421, 333, textureX, textureY); // Box 128
		bodyModel[320] = new ModelRendererTurbo(this, 410, 325, textureX, textureY); // Box 128
		bodyModel[321] = new ModelRendererTurbo(this, 472, 323, textureX, textureY); // Box 128
		bodyModel[322] = new ModelRendererTurbo(this, 451, 331, textureX, textureY); // Box 128
		bodyModel[323] = new ModelRendererTurbo(this, 389, 321, textureX, textureY); // Box 128
		bodyModel[324] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Box 128
		bodyModel[325] = new ModelRendererTurbo(this, 418, 342, textureX, textureY); // Box 358
		bodyModel[326] = new ModelRendererTurbo(this, 421, 357, textureX, textureY); // Box 359
		bodyModel[327] = new ModelRendererTurbo(this, 410, 349, textureX, textureY); // Box 360
		bodyModel[328] = new ModelRendererTurbo(this, 385, 355, textureX, textureY); // Box 361
		bodyModel[329] = new ModelRendererTurbo(this, 472, 347, textureX, textureY); // Box 364
		bodyModel[330] = new ModelRendererTurbo(this, 436, 355, textureX, textureY); // Box 368
		bodyModel[331] = new ModelRendererTurbo(this, 449, 351, textureX, textureY); // Box 375
		bodyModel[332] = new ModelRendererTurbo(this, 390, 345, textureX, textureY); // Box 377
		bodyModel[333] = new ModelRendererTurbo(this, 441, 345, textureX, textureY); // Box 378
		bodyModel[334] = new ModelRendererTurbo(this, 429, 357, textureX, textureY); // Box 366
		bodyModel[335] = new ModelRendererTurbo(this, 465, 357, textureX, textureY); // Box 366
		bodyModel[336] = new ModelRendererTurbo(this, 415, 333, textureX, textureY); // Box 399
		bodyModel[337] = new ModelRendererTurbo(this, 465, 333, textureX, textureY); // Box 400
		bodyModel[338] = new ModelRendererTurbo(this, 441, 342, textureX, textureY); // Box 380
		bodyModel[339] = new ModelRendererTurbo(this, 457, 342, textureX, textureY); // Box 380
		bodyModel[340] = new ModelRendererTurbo(this, 390, 342, textureX, textureY); // Box 380
		bodyModel[341] = new ModelRendererTurbo(this, 406, 342, textureX, textureY); // Box 380
		bodyModel[342] = new ModelRendererTurbo(this, 385, 331, textureX, textureY); // Box 128
		bodyModel[343] = new ModelRendererTurbo(this, 400, 355, textureX, textureY); // Box 446
		bodyModel[344] = new ModelRendererTurbo(this, 436, 331, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 451, 355, textureX, textureY); // Box 446
		bodyModel[346] = new ModelRendererTurbo(this, 446, 342, textureX, textureY); // Box 380
		bodyModel[347] = new ModelRendererTurbo(this, 395, 342, textureX, textureY); // Box 380
		bodyModel[348] = new ModelRendererTurbo(this, 398, 351, textureX, textureY); // Box 375
		bodyModel[349] = new ModelRendererTurbo(this, 449, 327, textureX, textureY); // Box 463
		bodyModel[350] = new ModelRendererTurbo(this, 398, 327, textureX, textureY); // Box 464
		bodyModel[351] = new ModelRendererTurbo(this, 465, 310, textureX, textureY); // Box 366
		bodyModel[352] = new ModelRendererTurbo(this, 415, 357, textureX, textureY); // Box 366
		bodyModel[353] = new ModelRendererTurbo(this, 428, 281, textureX, textureY); // Box 399
		bodyModel[354] = new ModelRendererTurbo(this, 429, 333, textureX, textureY); // Box 400
		bodyModel[355] = new ModelRendererTurbo(this, 391, 289, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[356] = new ModelRendererTurbo(this, 392, 292, textureX, textureY); // Box 275
		bodyModel[357] = new ModelRendererTurbo(this, 390, 260, textureX, textureY,"lamp"); // Box 485 glow
		bodyModel[358] = new ModelRendererTurbo(this, 391, 263, textureX, textureY); // Box 486
		bodyModel[359] = new ModelRendererTurbo(this, 346, 268, textureX, textureY); // Box 38
		bodyModel[360] = new ModelRendererTurbo(this, 497, 255, textureX, textureY); // Box 128
		bodyModel[361] = new ModelRendererTurbo(this, 497, 237, textureX, textureY); // Box 193
		bodyModel[362] = new ModelRendererTurbo(this, 448, 237, textureX, textureY); // Box 38
		bodyModel[363] = new ModelRendererTurbo(this, 311, 226, textureX, textureY); // Box 38
		bodyModel[364] = new ModelRendererTurbo(this, 419, 229, textureX, textureY); // Box 38
		bodyModel[365] = new ModelRendererTurbo(this, 360, 244, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 360, 225, textureX, textureY); // Box 38
		bodyModel[367] = new ModelRendererTurbo(this, 462, 212, textureX, textureY); // Box 128
		bodyModel[368] = new ModelRendererTurbo(this, 363, 216, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 363, 235, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 366, 239, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[371] = new ModelRendererTurbo(this, 366, 220, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[372] = new ModelRendererTurbo(this, 341, 233, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[373] = new ModelRendererTurbo(this, 415, 236, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[374] = new ModelRendererTurbo(this, 366, 241, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 366, 222, textureX, textureY); // Box 508
		bodyModel[376] = new ModelRendererTurbo(this, 340, 236, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 420, 239, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 343, 241, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 343, 238, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 431, 244, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 431, 232, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 354, 241, textureX, textureY); // Box 516
		bodyModel[383] = new ModelRendererTurbo(this, 354, 238, textureX, textureY); // Box 517
		bodyModel[384] = new ModelRendererTurbo(this, 420, 244, textureX, textureY); // Box 518
		bodyModel[385] = new ModelRendererTurbo(this, 420, 241, textureX, textureY); // Box 519
		bodyModel[386] = new ModelRendererTurbo(this, 343, 228, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 343, 225, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 431, 229, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 431, 241, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 351, 228, textureX, textureY); // Box 516
		bodyModel[391] = new ModelRendererTurbo(this, 351, 225, textureX, textureY); // Box 517
		bodyModel[392] = new ModelRendererTurbo(this, 423, 232, textureX, textureY); // Box 518
		bodyModel[393] = new ModelRendererTurbo(this, 423, 229, textureX, textureY); // Box 519
		bodyModel[394] = new ModelRendererTurbo(this, 366, 232, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 366, 213, textureX, textureY); // Box 508
		bodyModel[396] = new ModelRendererTurbo(this, 340, 223, textureX, textureY); // Box 38
		bodyModel[397] = new ModelRendererTurbo(this, 420, 227, textureX, textureY); // Box 38
		bodyModel[398] = new ModelRendererTurbo(this, 103, 244, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 105, 239, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[401] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[402] = new ModelRendererTurbo(this, 105, 257, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[403] = new ModelRendererTurbo(this, 105, 242, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[404] = new ModelRendererTurbo(this, 104, 328, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[405] = new ModelRendererTurbo(this, 104, 325, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[406] = new ModelRendererTurbo(this, 130, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[407] = new ModelRendererTurbo(this, 137, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[408] = new ModelRendererTurbo(this, 144, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[409] = new ModelRendererTurbo(this, 151, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[410] = new ModelRendererTurbo(this, 85, 276, textureX, textureY); // Right seat part
		bodyModel[411] = new ModelRendererTurbo(this, 85, 286, textureX, textureY); // Right seat part
		bodyModel[412] = new ModelRendererTurbo(this, 76, 269, textureX, textureY); // Right seat part
		bodyModel[413] = new ModelRendererTurbo(this, 65, 279, textureX, textureY); // Right seat part
		bodyModel[414] = new ModelRendererTurbo(this, 65, 269, textureX, textureY); // Right seat part
		bodyModel[415] = new ModelRendererTurbo(this, 76, 289, textureX, textureY); // Right seat part
		bodyModel[416] = new ModelRendererTurbo(this, 76, 286, textureX, textureY); // Right seat part
		bodyModel[417] = new ModelRendererTurbo(this, 76, 279, textureX, textureY); // Right seat part
		bodyModel[418] = new ModelRendererTurbo(this, 76, 276, textureX, textureY); // Right seat part
		bodyModel[419] = new ModelRendererTurbo(this, 85, 314, textureX, textureY); // Left seat part
		bodyModel[420] = new ModelRendererTurbo(this, 85, 304, textureX, textureY); // Left seat part
		bodyModel[421] = new ModelRendererTurbo(this, 76, 297, textureX, textureY); // Left seat part
		bodyModel[422] = new ModelRendererTurbo(this, 76, 307, textureX, textureY); // Left seat part
		bodyModel[423] = new ModelRendererTurbo(this, 76, 304, textureX, textureY); // Left seat part
		bodyModel[424] = new ModelRendererTurbo(this, 76, 317, textureX, textureY); // Left seat part
		bodyModel[425] = new ModelRendererTurbo(this, 76, 314, textureX, textureY); // Left seat part
		bodyModel[426] = new ModelRendererTurbo(this, 116, 276, textureX, textureY); // Right seat part
		bodyModel[427] = new ModelRendererTurbo(this, 116, 286, textureX, textureY); // Right seat part
		bodyModel[428] = new ModelRendererTurbo(this, 107, 269, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 96, 269, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 107, 289, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 107, 286, textureX, textureY); // Right seat part
		bodyModel[432] = new ModelRendererTurbo(this, 107, 279, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 107, 276, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 116, 314, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 116, 304, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 107, 297, textureX, textureY); // Left seat part
		bodyModel[437] = new ModelRendererTurbo(this, 96, 297, textureX, textureY); // Left seat part
		bodyModel[438] = new ModelRendererTurbo(this, 107, 307, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 107, 304, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 107, 317, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 107, 314, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 147, 276, textureX, textureY); // Right seat part
		bodyModel[443] = new ModelRendererTurbo(this, 147, 286, textureX, textureY); // Right seat part
		bodyModel[444] = new ModelRendererTurbo(this, 127, 269, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 138, 289, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 138, 286, textureX, textureY); // Right seat part
		bodyModel[447] = new ModelRendererTurbo(this, 138, 279, textureX, textureY); // Right seat part
		bodyModel[448] = new ModelRendererTurbo(this, 138, 276, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 147, 314, textureX, textureY); // Left seat part
		bodyModel[450] = new ModelRendererTurbo(this, 147, 304, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 138, 297, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 127, 297, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 138, 307, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 138, 304, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 138, 317, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 138, 314, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 96, 279, textureX, textureY); // Right seat part
		bodyModel[458] = new ModelRendererTurbo(this, 127, 279, textureX, textureY); // Right seat part
		bodyModel[459] = new ModelRendererTurbo(this, 65, 307, textureX, textureY); // Left seat part
		bodyModel[460] = new ModelRendererTurbo(this, 96, 307, textureX, textureY); // Left seat part
		bodyModel[461] = new ModelRendererTurbo(this, 127, 307, textureX, textureY); // Left seat part
		bodyModel[462] = new ModelRendererTurbo(this, 138, 269, textureX, textureY); // Right seat part
		bodyModel[463] = new ModelRendererTurbo(this, 323, 288, textureX, textureY); // Box 38
		bodyModel[464] = new ModelRendererTurbo(this, 277, 296, textureX, textureY); // Box 38
		bodyModel[465] = new ModelRendererTurbo(this, 278, 300, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[466] = new ModelRendererTurbo(this, 235, 302, textureX, textureY); // Box 38
		bodyModel[467] = new ModelRendererTurbo(this, 252, 313, textureX, textureY); // Box 128
		bodyModel[468] = new ModelRendererTurbo(this, 254, 297, textureX, textureY); // Box 128
		bodyModel[469] = new ModelRendererTurbo(this, 249, 304, textureX, textureY); // Box 128
		bodyModel[470] = new ModelRendererTurbo(this, 250, 312, textureX, textureY); // Box 128
		bodyModel[471] = new ModelRendererTurbo(this, 269, 304, textureX, textureY); // Box 128
		bodyModel[472] = new ModelRendererTurbo(this, 260, 288, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 270, 312, textureX, textureY); // Box 128
		bodyModel[474] = new ModelRendererTurbo(this, 275, 312, textureX, textureY); // Box 128
		bodyModel[475] = new ModelRendererTurbo(this, 298, 302, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 315, 314, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 316, 304, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 243, 274, textureX, textureY); // Box 38
		bodyModel[479] = new ModelRendererTurbo(this, 234, 284, textureX, textureY); // Folding sink part R
		bodyModel[480] = new ModelRendererTurbo(this, 234, 290, textureX, textureY); // Box 128
		bodyModel[481] = new ModelRendererTurbo(this, 234, 279, textureX, textureY); // Folding sink part R
		bodyModel[482] = new ModelRendererTurbo(this, 236, 297, textureX, textureY); // Box 128
		bodyModel[483] = new ModelRendererTurbo(this, 366, 103, textureX, textureY); // Box 128
		bodyModel[484] = new ModelRendererTurbo(this, 366, 101, textureX, textureY); // Box 261
		bodyModel[485] = new ModelRendererTurbo(this, 8, 119, textureX, textureY); // Box 128
		bodyModel[486] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 261
		bodyModel[487] = new ModelRendererTurbo(this, 260, 282, textureX, textureY); // folding prep surface
		bodyModel[488] = new ModelRendererTurbo(this, 261, 274, textureX, textureY); // Box 38
		bodyModel[489] = new ModelRendererTurbo(this, 276, 274, textureX, textureY); // Box 38
		bodyModel[490] = new ModelRendererTurbo(this, 277, 284, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 300, 285, textureX, textureY); // Box 128
		bodyModel[492] = new ModelRendererTurbo(this, 351, 297, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[493] = new ModelRendererTurbo(this, 106, 262, textureX, textureY); // Box 38
		bodyModel[494] = new ModelRendererTurbo(this, 106, 233, textureX, textureY); // Box 462
		bodyModel[495] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Left seat part
		bodyModel[496] = new ModelRendererTurbo(this, 390, 254, textureX, textureY); // Box 38
		bodyModel[497] = new ModelRendererTurbo(this, 390, 251, textureX, textureY); // Box 557
		bodyModel[498] = new ModelRendererTurbo(this, 278, 302, textureX, textureY); // Box 38
		bodyModel[499] = new ModelRendererTurbo(this, 400, 331, textureX, textureY); // Box 128

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 2
		bodyModel[1].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(-60.5F, 1F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[4].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[5].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[6].setRotationPoint(-60.5F, 3F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[7].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(43F, 4F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-45F, 4F, -1F);

		bodyModel[10].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[10].setRotationPoint(-56.5F, 1F, -10.99F);

		bodyModel[11].addShapeBox(-4F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Right trapdoor
		bodyModel[11].setRotationPoint(-56.5F, 1F, 4.99F);

		bodyModel[12].addShapeBox(-4F, 0F, -1F, 4, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left side door
		bodyModel[12].setRotationPoint(-56.49F, -14F, -10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 118, 16, 1, 0F); // Box 38
		bodyModel[13].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 56, 16, 1, 0F); // Box 128
		bodyModel[14].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[15].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[16].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[17].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 128
		bodyModel[18].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[19].addShapeBox(-4F, 0F, 0F, 4, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door
		bodyModel[19].setRotationPoint(-56.49F, -14F, 10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[20].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 128
		bodyModel[21].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[22].setRotationPoint(-56.5F, -15F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[23].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[24].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[25].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 128
		bodyModel[26].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[27].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[27].setRotationPoint(-55.49F, -14F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Rear end door
		bodyModel[28].setRotationPoint(60.51F, -14F, 3F);

		bodyModel[29].addBox(0F, 0F, 0F, 123, 2, 6, 0F); // Box 128
		bodyModel[29].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[30].setRotationPoint(-61.5F, -20F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[31].setRotationPoint(-61.5F, -19F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[32].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[33].setRotationPoint(-61.5F, -19F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[34].setRotationPoint(60.5F, -17F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[35].setRotationPoint(60.5F, -18F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[36].setRotationPoint(-61.5F, -19F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[37].setRotationPoint(60.5F, -18F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[38].setRotationPoint(-61.5F, -19F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[39].setRotationPoint(-61.5F, -16F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[40].setRotationPoint(-61.5F, -16F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[41].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[42].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[43].setRotationPoint(-61.5F, -17F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 128
		bodyModel[44].setRotationPoint(-61.5F, -18F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 176
		bodyModel[45].setRotationPoint(-61.5F, -18F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[46].setRotationPoint(-61.5F, -16.25F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[47].setRotationPoint(60.5F, -16.25F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 89, 1, 14, 0F); // Box 128
		bodyModel[48].setRotationPoint(-61.5F, -18F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[49].setRotationPoint(-61.5F, 3F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[50].setRotationPoint(-61.5F, 4F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[51].setRotationPoint(-56.5F, 4F, 10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[52].setRotationPoint(52.25F, 3F, 10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[53].setRotationPoint(53F, 4F, 10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[54].setRotationPoint(54.5F, 4F, 10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[55].setRotationPoint(53.5F, 3F, 10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[56].setRotationPoint(-53.25F, 3F, 10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[57].setRotationPoint(-55F, 4F, 10.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 2
		bodyModel[58].setRotationPoint(34.75F, 3F, 10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F); // Box 2
		bodyModel[59].setRotationPoint(33F, 4F, 10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 2
		bodyModel[60].setRotationPoint(-35.75F, 3F, 10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F); // Box 2
		bodyModel[61].setRotationPoint(-35F, 4F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2 cull
		bodyModel[62].setRotationPoint(-34.5F, 3F, 10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2 cull
		bodyModel[63].setRotationPoint(-33.5F, 4F, 10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
		bodyModel[64].setRotationPoint(-61.5F, 3F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[65].setRotationPoint(-61.5F, 4F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[66].setRotationPoint(-56.5F, 4F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 28
		bodyModel[67].setRotationPoint(52.25F, 3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[68].setRotationPoint(53F, 4F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30 cull
		bodyModel[69].setRotationPoint(54.5F, 4F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31 cull
		bodyModel[70].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 32
		bodyModel[71].setRotationPoint(-53.25F, 3F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[72].setRotationPoint(-55F, 4F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 34
		bodyModel[73].setRotationPoint(34.75F, 3F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[74].setRotationPoint(33F, 4F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 36
		bodyModel[75].setRotationPoint(-35.75F, 3F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[76].setRotationPoint(-35F, 4F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[77].setRotationPoint(-34.5F, 3F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[78].setRotationPoint(-33.5F, 4F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[79].setRotationPoint(-56.5F, 3F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[80].setRotationPoint(-56.5F, 3F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[82].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[83].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(63F, -14F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(63F, -14F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[87].setRotationPoint(63F, 1F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(63F, -15F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[89].setRotationPoint(63F, -16F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[90].setRotationPoint(63F, -16F, 1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(-63F, -15F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-63F, 1F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[93].setRotationPoint(-63F, -14F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-63F, -14F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[97].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[98].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[99].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[100].setRotationPoint(-63.5F, -16F, 1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-63.5F, -16F, -1.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(63F, -16F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[103].setRotationPoint(-55.5F, -16F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 78, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[104].setRotationPoint(-55.5F, -16F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-55.5F, -18F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 116, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[106].setRotationPoint(-55.5F, -18F, 6.7F);

		bodyModel[107].addBox(0F, 0F, 0F, 58, 16, 1, 0F); // Box 128
		bodyModel[107].setRotationPoint(3.5F, -15F, 10F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 128
		bodyModel[108].setRotationPoint(-0.5F, -15F, 10F);

		bodyModel[109].addBox(-4F, 0F, 0F, 4, 14, 1, 0F); // Right side loading door
		bodyModel[109].setRotationPoint(3.5F, -13F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[110].setRotationPoint(-1F, -6F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[111].setRotationPoint(4F, -6F, 11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[112].setRotationPoint(-63.5F, -15F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[113].setRotationPoint(-63F, -15F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[114].setRotationPoint(-63.5F, -16F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[115].setRotationPoint(-63F, -15F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[116].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(-63.5F, -19F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(-63F, -19F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(-63.5F, -19.5F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[120].setRotationPoint(-63F, -20F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-63.5F, -20F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(-63F, -20F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[123].setRotationPoint(-63.5F, -20F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[124].setRotationPoint(-63.5F, -15F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[125].setRotationPoint(-63F, -15F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[126].setRotationPoint(-63.5F, -16F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[127].setRotationPoint(-63F, -15F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[128].setRotationPoint(-63.5F, -19F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[129].setRotationPoint(-63F, -19F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[130].setRotationPoint(-63.5F, -19.5F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[131].setRotationPoint(-63F, -20F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[132].setRotationPoint(-63.5F, -20F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[133].setRotationPoint(-61F, -6F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[134].setRotationPoint(-56F, -6F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[135].setRotationPoint(-61F, -6F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[136].setRotationPoint(-56F, -6F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[137].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.25F, -1F, 0F, 2.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, -1F, 0F, -2.25F, -1F); // Box 128
		bodyModel[138].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(61.5F, -19F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[140].setRotationPoint(61.5F, -20F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[141].setRotationPoint(61.5F, -20F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 18, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[142].setRotationPoint(61.5F, -15F, 11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 2.25F, -1F, -0.5F, 2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -1F, -0.5F, -2.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[143].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 252
		bodyModel[144].setRotationPoint(61.5F, -19F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[145].setRotationPoint(61.5F, -20F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[146].setRotationPoint(63F, -15F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[147].setRotationPoint(63F, -16F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[148].setRotationPoint(63F, 1F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[149].setRotationPoint(63F, -19F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[150].setRotationPoint(63F, -19.5F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[151].setRotationPoint(63F, -20F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[152].setRotationPoint(63F, -20F, -5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[153].setRotationPoint(63F, -15F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1.25F, -1F, -0.5F, 1.25F, -1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[154].setRotationPoint(63F, -16F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[155].setRotationPoint(63F, -19F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 253
		bodyModel[156].setRotationPoint(63F, -19.5F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[157].setRotationPoint(63F, -20F, 3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[158].setRotationPoint(57.5F, -1.5F, -12F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[159].setRotationPoint(57.5F, -1.5F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[160].setRotationPoint(58.5F, 6F, -10.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[161].setRotationPoint(58.5F, 6F, 10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[162].setRotationPoint(58.49F, 3F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31 cull
		bodyModel[163].setRotationPoint(58.49F, 3F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[164].setRotationPoint(58.49F, 5F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 31
		bodyModel[165].setRotationPoint(58.49F, 5F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 475 cull
		bodyModel[166].setRotationPoint(0.5F, 3F, 10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 476
		bodyModel[167].setRotationPoint(0.5F, 4.5F, 10.5F);

		bodyModel[168].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 257
		bodyModel[168].setRotationPoint(2.5F, -19.75F, 5.85F);
		bodyModel[168].rotateAngleY = -0.78539816F;

		bodyModel[169].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 258
		bodyModel[169].setRotationPoint(2.5F, -20.4F, 5.85F);
		bodyModel[169].rotateAngleY = -0.78539816F;

		bodyModel[170].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 259
		bodyModel[170].setRotationPoint(2.5F, -20.9F, 5.85F);
		bodyModel[170].rotateAngleY = -0.78539816F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 260
		bodyModel[171].setRotationPoint(3.05F, -21.4F, 5.85F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 261
		bodyModel[172].setRotationPoint(2.85F, -20.9F, 5.85F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 275
		bodyModel[173].setRotationPoint(-10.5F, -19F, 7.3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[174].setRotationPoint(56.5F, -17.5F, 9.85F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[175].setRotationPoint(56.5F, -17.5F, 9.85F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F); // Box 275
		bodyModel[176].setRotationPoint(-52.5F, -17.5F, 9.85F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F); // Box 701
		bodyModel[177].setRotationPoint(-52.5F, -17.5F, 9.85F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.05F, 0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Box 549
		bodyModel[178].setRotationPoint(-52.5F, -17.5F, -10.85F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.26F, 0.15F, -1F, -0.26F, 0.15F, -1F); // Box 550
		bodyModel[179].setRotationPoint(-52.5F, -17.5F, -10.85F);

		bodyModel[180].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 264
		bodyModel[180].setRotationPoint(0.5F, -19.75F, -4.85F);
		bodyModel[180].rotateAngleY = -0.78539816F;

		bodyModel[181].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 264
		bodyModel[181].setRotationPoint(0.5F, -20.4F, -4.85F);
		bodyModel[181].rotateAngleY = -0.78539816F;

		bodyModel[182].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 264
		bodyModel[182].setRotationPoint(0.5F, -20.9F, -4.85F);
		bodyModel[182].rotateAngleY = -0.78539816F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 264
		bodyModel[183].setRotationPoint(1.05F, -21.4F, -4.85F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 264
		bodyModel[184].setRotationPoint(0.85F, -20.9F, -4.85F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, 0.16F, 0F, -1F, 0.16F); // Box 260
		bodyModel[185].setRotationPoint(2.5F, -18.25F, -10.45F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.41F, -0.26F, 0F, 0.41F, -0.26F, 0F, 0.41F, -0.74F, 0F, 0.41F, -0.74F); // Box 259
		bodyModel[186].setRotationPoint(2.5F, -18F, -11F);

		bodyModel[187].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 264
		bodyModel[187].setRotationPoint(0.5F, -20.9F, -4.85F);
		bodyModel[187].rotateAngleY = -0.78539816F;

		bodyModel[188].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 264
		bodyModel[188].setRotationPoint(0.5F, -20.15F, -4.85F);
		bodyModel[188].rotateAngleY = -0.78539816F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[189].setRotationPoint(0.5F, -20.25F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[190].setRotationPoint(0.5F, -20.25F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[191].setRotationPoint(11.5F, 4F, -2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[192].setRotationPoint(11.5F, 6.5F, -2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[193].setRotationPoint(-27.5F, 4F, 0F);
		bodyModel[193].rotateAngleX = -0.78539816F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[194].setRotationPoint(-27.51F, 4F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[195].setRotationPoint(-19.49F, 4F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[196].setRotationPoint(19.5F, 3F, -8.9F);
		bodyModel[196].rotateAngleX = -0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[197].setRotationPoint(19.49F, 3F, -9.4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[198].setRotationPoint(26.51F, 3F, -9.4F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[199].setRotationPoint(10F, 3F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[200].setRotationPoint(3.8F, 4F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[201].setRotationPoint(7.8F, 4F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 38
		bodyModel[202].setRotationPoint(6.8F, 4F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -1.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, -1.375F, -0.5F, -0.25F, -0.375F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, -0.375F, -0.5F); // Box 38
		bodyModel[203].setRotationPoint(2.8F, 3.75F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[204].setRotationPoint(4.3F, 4.2F, -9.5F);
		bodyModel[204].rotateAngleZ = -0.78539816F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[205].setRotationPoint(7.5F, 4.2F, -9.5F);
		bodyModel[205].rotateAngleZ = -0.78539816F;

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[206].setRotationPoint(3.8F, 3F, -5.49F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[207].setRotationPoint(7F, 3F, -5.49F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[208].setRotationPoint(7F, 3F, -9.49F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[209].setRotationPoint(3.8F, 3F, -9.49F);

		bodyModel[210].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Box 2
		bodyModel[210].setRotationPoint(-13.5F, 3F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[211].setRotationPoint(-13.5F, 6F, -10F);

		bodyModel[212].addBox(0F, 0F, 0F, 6, 3, 5, 0F); // Box 2
		bodyModel[212].setRotationPoint(-32.5F, 3F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[213].setRotationPoint(-32.5F, 6F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[214].setRotationPoint(10.5F, 3.2F, 6F);
		bodyModel[214].rotateAngleZ = -0.78539816F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[215].setRotationPoint(10F, 3F, 10.01F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[216].setRotationPoint(10F, 3F, 5.99F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[217].setRotationPoint(12.5F, 3F, 8F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 52
		bodyModel[218].setRotationPoint(3.5F, 3F, 9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[219].setRotationPoint(0.5F, 3.2F, 6F);
		bodyModel[219].rotateAngleZ = -0.78539816F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[220].setRotationPoint(0F, 3F, 10.01F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		bodyModel[221].setRotationPoint(0F, 3F, 5.99F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[222].setRotationPoint(-5.5F, 3F, 8F);

		bodyModel[223].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 52
		bodyModel[223].setRotationPoint(-12.5F, 3F, 5F);

		bodyModel[224].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 52
		bodyModel[224].setRotationPoint(-23.5F, 3F, 5F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[225].setRotationPoint(-14.5F, 3F, 8F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 52
		bodyModel[226].setRotationPoint(-27.5F, 3F, 8F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 52
		bodyModel[227].setRotationPoint(-25.5F, 3F, 8F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[228].setRotationPoint(-48.5F, -15F, 3F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[229].setRotationPoint(-48.5F, -15F, -10F);

		bodyModel[230].addBox(0F, 0F, 0F, 11, 2, 16, 0F); // Box 38
		bodyModel[230].setRotationPoint(-55.5F, -17F, -8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[231].setRotationPoint(-55.5F, -17F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[232].setRotationPoint(-55.5F, -17F, 8F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[233].setRotationPoint(-10.5F, -15F, 3F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[234].setRotationPoint(-10.5F, -15F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 16, 15, 0F); // Box 38
		bodyModel[235].setRotationPoint(-5.5F, -15F, -5F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 16, 6, 0F); // Box 38
		bodyModel[236].setRotationPoint(-9.5F, -15F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 38
		bodyModel[237].setRotationPoint(18.5F, -15F, -5F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 38
		bodyModel[238].setRotationPoint(19.5F, -15F, 7F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 38
		bodyModel[239].setRotationPoint(22.5F, -15F, 2F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 38
		bodyModel[240].setRotationPoint(22.5F, -15F, -10F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 38
		bodyModel[241].setRotationPoint(22.5F, -6F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[242].setRotationPoint(-50.5F, -6F, -10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[243].setRotationPoint(-50.5F, -6F, -9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[244].setRotationPoint(-49.5F, -6F, -9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[245].setRotationPoint(-50.5F, -6F, 9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[246].setRotationPoint(-50.5F, -6F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[247].setRotationPoint(-49.5F, -6F, 8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 38
		bodyModel[248].setRotationPoint(-54.36F, -2F, -10.28F);
		bodyModel[248].rotateAngleY = 0.78539816F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 38
		bodyModel[249].setRotationPoint(-54.53F, -1F, -9.75F);
		bodyModel[249].rotateAngleY = 0.78539816F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 38
		bodyModel[250].setRotationPoint(-53.83F, 0.5F, -9.75F);
		bodyModel[250].rotateAngleY = 0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[251].setRotationPoint(-54.72F, -2F, 7.81F);
		bodyModel[251].rotateAngleY = -0.78539816F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[252].setRotationPoint(-55.07F, -1F, 8.87F);
		bodyModel[252].rotateAngleY = -0.78539816F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[253].setRotationPoint(-55.07F, 0.5F, 8.17F);
		bodyModel[253].rotateAngleY = -0.78539816F;

		bodyModel[254].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[254].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[255].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 38
		bodyModel[255].setRotationPoint(-55.5F, -15F, 3F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[256].setRotationPoint(-55.5F, -15F, -5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[257].setRotationPoint(-52.5F, -15F, -0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 6, 2, 16, 0F); // Box 38
		bodyModel[258].setRotationPoint(-10.5F, -17F, -8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 33, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[259].setRotationPoint(-10.5F, -17F, -10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[260].setRotationPoint(-10.5F, -17F, 8F);

		bodyModel[261].addBox(0F, 0F, 0F, 23, 2, 4, 0F); // Box 38
		bodyModel[261].setRotationPoint(-4.5F, -17F, -8F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 2, 16, 0F); // Box 38
		bodyModel[262].setRotationPoint(18.5F, -17F, -8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[263].setRotationPoint(18.5F, -17F, 8F);

		bodyModel[264].addBox(0F, 0F, 0F, 23, 16, 1, 0F); // Box 38
		bodyModel[264].setRotationPoint(-4.5F, -15F, -5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[265].setRotationPoint(-9.5F, -15F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[266].setRotationPoint(2F, -15F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[267].setRotationPoint(13F, -15F, -8F);

		bodyModel[268].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // swing door left
		bodyModel[268].setRotationPoint(19F, -12F, 2F);

		bodyModel[269].addBox(0F, 0F, -2F, 0, 7, 2, 0F); // swing door right
		bodyModel[269].setRotationPoint(19F, -12F, 6F);

		bodyModel[270].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 38
		bodyModel[270].setRotationPoint(18.5F, -15F, 6F);

		bodyModel[271].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 38
		bodyModel[271].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[272].addBox(0F, 0F, 0F, 5, 16, 7, 0F); // Box 38
		bodyModel[272].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[273].setRotationPoint(56.5F, -17F, -10F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 2, 16, 0F); // Box 38
		bodyModel[274].setRotationPoint(56.5F, -17F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[275].setRotationPoint(56.5F, -17F, 8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[276].setRotationPoint(29.5F, -6F, 7F);

		bodyModel[277].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 128
		bodyModel[277].setRotationPoint(30.5F, -3F, 7F);

		bodyModel[278].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 128
		bodyModel[278].setRotationPoint(24.5F, -3F, 9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[279].setRotationPoint(27.5F, -3F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[280].setRotationPoint(23.5F, -6F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[281].setRotationPoint(37.5F, -6F, 7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[282].setRotationPoint(23.5F, -3F, 5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[283].setRotationPoint(32.5F, -3F, 5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[284].setRotationPoint(24.5F, -6F, 5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[285].setRotationPoint(32.5F, -6F, 5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 358
		bodyModel[286].setRotationPoint(29.5F, -6F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 359
		bodyModel[287].setRotationPoint(30.5F, -3F, -9F);

		bodyModel[288].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 360
		bodyModel[288].setRotationPoint(24.5F, -3F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 361
		bodyModel[289].setRotationPoint(27.5F, -3F, -9F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[290].setRotationPoint(23.5F, -6F, -10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 364
		bodyModel[291].setRotationPoint(37.5F, -6F, -10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 368
		bodyModel[292].setRotationPoint(32.5F, -3F, -9F);

		bodyModel[293].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[293].setRotationPoint(35.5F, -5F, -5F);
		bodyModel[293].rotateAngleY = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[294].setRotationPoint(24.5F, -6F, -9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[295].setRotationPoint(32.5F, -6F, -9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[296].setRotationPoint(30.5F, -3F, -7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 366
		bodyModel[297].setRotationPoint(31.5F, -3F, -7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[298].setRotationPoint(30.5F, -3F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[299].setRotationPoint(31.5F, -3F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[300].setRotationPoint(32.5F, -6F, -5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[301].setRotationPoint(37.5F, -6F, -5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[302].setRotationPoint(24.5F, -6F, -5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[303].setRotationPoint(29.5F, -6F, -5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[304].setRotationPoint(24.5F, -3F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[305].setRotationPoint(23.5F, -3F, -10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[306].setRotationPoint(24.5F, -3F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[307].setRotationPoint(35.5F, -3F, 5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[308].setRotationPoint(35.5F, -3F, -9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[309].setRotationPoint(33.5F, -6F, -5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[310].setRotationPoint(25.5F, -6F, -5F);

		bodyModel[311].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[311].setRotationPoint(27.5F, -5F, -5F);
		bodyModel[311].rotateAngleY = -0.78539816F;

		bodyModel[312].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[312].setRotationPoint(35.5F, -5F, 5F);
		bodyModel[312].rotateAngleY = -0.78539816F;

		bodyModel[313].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[313].setRotationPoint(27.5F, -5F, 5F);
		bodyModel[313].rotateAngleY = -0.78539816F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[314].setRotationPoint(54.5F, -3F, 5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[315].setRotationPoint(54.5F, -3F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[316].setRotationPoint(38.5F, -3F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[317].setRotationPoint(38.5F, -3F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[318].setRotationPoint(45.5F, -6F, 7F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 128
		bodyModel[319].setRotationPoint(46.5F, -3F, 7F);

		bodyModel[320].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 128
		bodyModel[320].setRotationPoint(40.5F, -3F, 9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[321].setRotationPoint(53.5F, -6F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[322].setRotationPoint(48.5F, -3F, 5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[323].setRotationPoint(40.5F, -6F, 5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3.75F, 0F, 0F, -4F, -3F, 0F, 0F); // Box 128
		bodyModel[324].setRotationPoint(48.5F, -6F, 5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 358
		bodyModel[325].setRotationPoint(45.5F, -6F, -10F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 359
		bodyModel[326].setRotationPoint(46.5F, -3F, -9F);

		bodyModel[327].addBox(0F, 0F, 0F, 14, 4, 1, 0F); // Box 360
		bodyModel[327].setRotationPoint(40.5F, -3F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 361
		bodyModel[328].setRotationPoint(43.5F, -3F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 364
		bodyModel[329].setRotationPoint(53.5F, -6F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 368
		bodyModel[330].setRotationPoint(48.5F, -3F, -9F);

		bodyModel[331].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[331].setRotationPoint(51.5F, -5F, -5F);
		bodyModel[331].rotateAngleY = -0.78539816F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[332].setRotationPoint(40.5F, -6F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[333].setRotationPoint(48.5F, -6F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[334].setRotationPoint(46.5F, -3F, -7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 366
		bodyModel[335].setRotationPoint(47.5F, -3F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[336].setRotationPoint(46.5F, -3F, 5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[337].setRotationPoint(47.5F, -3F, 5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[338].setRotationPoint(48.5F, -6F, -5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[339].setRotationPoint(53.5F, -6F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 380
		bodyModel[340].setRotationPoint(40.5F, -6F, -5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 380
		bodyModel[341].setRotationPoint(45.5F, -6F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[342].setRotationPoint(40.5F, -3F, 5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[343].setRotationPoint(40.5F, -3F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[344].setRotationPoint(51.5F, -3F, 5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[345].setRotationPoint(51.5F, -3F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[346].setRotationPoint(49.5F, -6F, -5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[347].setRotationPoint(41.5F, -6F, -5F);

		bodyModel[348].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[348].setRotationPoint(43.5F, -5F, -5F);
		bodyModel[348].rotateAngleY = -0.78539816F;

		bodyModel[349].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[349].setRotationPoint(51.5F, -5F, 5F);
		bodyModel[349].rotateAngleY = -0.78539816F;

		bodyModel[350].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[350].setRotationPoint(43.5F, -5F, 5F);
		bodyModel[350].rotateAngleY = -0.78539816F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[351].setRotationPoint(38.5F, -3F, -7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 366
		bodyModel[352].setRotationPoint(39.5F, -3F, -7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[353].setRotationPoint(38.5F, -3F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[354].setRotationPoint(39.5F, -3F, 5F);

		bodyModel[355].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Box 275 glow
		bodyModel[355].setRotationPoint(23.5F, -11F, -10F);

		bodyModel[356].addBox(0F, 0F, 0F, 32, 1, 0, 0F); // Box 275
		bodyModel[356].setRotationPoint(23.5F, -11F, -8.99F);

		bodyModel[357].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Box 485 glow
		bodyModel[357].setRotationPoint(23.5F, -11F, 9F);

		bodyModel[358].addBox(0F, 0F, 0F, 32, 1, 0, 0F); // Box 486
		bodyModel[358].setRotationPoint(23.5F, -11F, 8.99F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 38
		bodyModel[359].setRotationPoint(22.5F, -17F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F); // Box 128
		bodyModel[360].setRotationPoint(56.5F, -16F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, -0.65F, 0F, -2F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[361].setRotationPoint(56.5F, -16F, 7F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 38
		bodyModel[362].setRotationPoint(55.5F, -17F, -10F);

		bodyModel[363].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 38
		bodyModel[363].setRotationPoint(23.5F, -17F, -10F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 38
		bodyModel[364].setRotationPoint(51.5F, -17F, -10F);

		bodyModel[365].addBox(0F, 0F, 0F, 24, 1, 5, 0F); // Box 38
		bodyModel[365].setRotationPoint(27.5F, -17F, -10F);

		bodyModel[366].addBox(0F, 0F, 0F, 24, 1, 5, 0F); // Box 38
		bodyModel[366].setRotationPoint(27.5F, -17F, 5F);

		bodyModel[367].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 128
		bodyModel[367].setRotationPoint(51.5F, -18F, -7F);

		bodyModel[368].addBox(0F, 0F, 0F, 24, 1, 2, 0F); // Box 38
		bodyModel[368].setRotationPoint(27.5F, -18F, 5F);

		bodyModel[369].addBox(0F, 0F, 0F, 24, 1, 2, 0F); // Box 38
		bodyModel[369].setRotationPoint(27.5F, -18F, -7F);

		bodyModel[370].addBox(0F, 0F, 0F, 22, 0, 1, 0F); // Box 38 glow
		bodyModel[370].setRotationPoint(28.5F, -17.01F, -5F);

		bodyModel[371].addBox(0F, 0F, 0F, 22, 0, 1, 0F); // Box 38 glow
		bodyModel[371].setRotationPoint(28.5F, -17.01F, 4F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // Box 38 glow
		bodyModel[372].setRotationPoint(27.5F, -17.01F, -5F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 0, 10, 0F); // Box 38 glow
		bodyModel[373].setRotationPoint(50.5F, -17.01F, -5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[374].setRotationPoint(28.5F, -17F, -5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[375].setRotationPoint(28.5F, -17F, 4F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[376].setRotationPoint(27.5F, -17F, -4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[377].setRotationPoint(50.5F, -17F, -4F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[378].setRotationPoint(27.5F, -17F, -5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[379].setRotationPoint(27.5F, -17F, -5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[380].setRotationPoint(50.5F, -17F, -5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[381].setRotationPoint(50.5F, -17F, -5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[382].setRotationPoint(27.5F, -17F, 4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[383].setRotationPoint(27.5F, -17F, 4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 518
		bodyModel[384].setRotationPoint(50.5F, -17F, 4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[385].setRotationPoint(50.5F, -17F, 4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[386].setRotationPoint(27.5F, -18F, -5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[387].setRotationPoint(27.5F, -18F, -5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[388].setRotationPoint(50.5F, -18F, -5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[389].setRotationPoint(50.5F, -18F, -5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[390].setRotationPoint(27.5F, -18F, 4F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[391].setRotationPoint(27.5F, -18F, 4F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 518
		bodyModel[392].setRotationPoint(50.5F, -18F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[393].setRotationPoint(50.5F, -18F, 4F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[394].setRotationPoint(28.5F, -18F, -5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[395].setRotationPoint(28.5F, -18F, 4F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[396].setRotationPoint(27.5F, -18F, -4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[397].setRotationPoint(50.5F, -18F, -4F);

		bodyModel[398].addBox(0F, 0F, 0F, 37, 1, 3, 0F); // Box 38
		bodyModel[398].setRotationPoint(-47.5F, -14F, 7F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[399].setRotationPoint(-47.5F, -13F, 9F);

		bodyModel[400].addBox(0F, 0F, 0F, 37, 1, 3, 0F); // Box 275
		bodyModel[400].setRotationPoint(-47.5F, -14F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[401].setRotationPoint(-47.5F, -13F, -10F);

		bodyModel[402].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 275 glow
		bodyModel[402].setRotationPoint(-47.5F, -12.99F, -8.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 37, 0, 1, 0F); // Box 285 glow
		bodyModel[403].setRotationPoint(-47.5F, -12.99F, 7.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 37, 0, 2, 0F); // Box 275 glow
		bodyModel[404].setRotationPoint(-47.5F, -12.99F, -9F);

		bodyModel[405].addBox(0F, 0F, 0F, 37, 0, 2, 0F); // Box 285 glow
		bodyModel[405].setRotationPoint(-47.5F, -12.99F, 7F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[406].setRotationPoint(-43.5F, -17F, -0.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[407].setRotationPoint(-33.5F, -17F, -0.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[408].setRotationPoint(-23.5F, -17F, -0.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[409].setRotationPoint(-13.5F, -17F, -0.5F);

		bodyModel[410].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[410].setRotationPoint(-42F, -5F, 7F);
		bodyModel[410].rotateAngleY = -3.14159265F;

		bodyModel[411].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[411].setRotationPoint(-42F, -5F, 7F);
		bodyModel[411].rotateAngleY = -3.14159265F;

		bodyModel[412].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[412].setRotationPoint(-42F, -3F, 7F);
		bodyModel[412].rotateAngleY = -3.14159265F;

		bodyModel[413].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[413].setRotationPoint(-42F, -3F, 7F);
		bodyModel[413].rotateAngleY = -3.14159265F;

		bodyModel[414].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[414].setRotationPoint(-42F, -8F, 7F);
		bodyModel[414].rotateAngleY = -3.14159265F;

		bodyModel[415].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[415].setRotationPoint(-42F, -4F, 7F);
		bodyModel[415].rotateAngleY = -3.14159265F;

		bodyModel[416].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[416].setRotationPoint(-42F, -5F, 7F);
		bodyModel[416].rotateAngleY = -3.14159265F;

		bodyModel[417].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[417].setRotationPoint(-42F, -4F, 7F);
		bodyModel[417].rotateAngleY = -3.14159265F;

		bodyModel[418].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[418].setRotationPoint(-42F, -5F, 7F);
		bodyModel[418].rotateAngleY = -3.14159265F;

		bodyModel[419].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[419].setRotationPoint(-42F, -5F, -7F);
		bodyModel[419].rotateAngleY = -3.14159265F;

		bodyModel[420].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[420].setRotationPoint(-42F, -5F, -7F);
		bodyModel[420].rotateAngleY = -3.14159265F;

		bodyModel[421].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[421].setRotationPoint(-42F, -3F, -7F);
		bodyModel[421].rotateAngleY = -3.14159265F;

		bodyModel[422].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[422].setRotationPoint(-42F, -4F, -7F);
		bodyModel[422].rotateAngleY = -3.14159265F;

		bodyModel[423].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[423].setRotationPoint(-42F, -5F, -7F);
		bodyModel[423].rotateAngleY = -3.14159265F;

		bodyModel[424].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[424].setRotationPoint(-42F, -4F, -7F);
		bodyModel[424].rotateAngleY = -3.14159265F;

		bodyModel[425].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[425].setRotationPoint(-42F, -5F, -7F);
		bodyModel[425].rotateAngleY = -3.14159265F;

		bodyModel[426].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[426].setRotationPoint(-32F, -5F, 7F);
		bodyModel[426].rotateAngleY = -3.14159265F;

		bodyModel[427].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[427].setRotationPoint(-32F, -5F, 7F);
		bodyModel[427].rotateAngleY = -3.14159265F;

		bodyModel[428].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[428].setRotationPoint(-32F, -3F, 7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(-32F, -8F, 7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[430].setRotationPoint(-32F, -4F, 7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[431].setRotationPoint(-32F, -5F, 7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[432].setRotationPoint(-32F, -4F, 7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[433].setRotationPoint(-32F, -5F, 7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[434].setRotationPoint(-32F, -5F, -7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[435].setRotationPoint(-32F, -5F, -7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[436].setRotationPoint(-32F, -3F, -7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[437].setRotationPoint(-32F, -8F, -7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[438].setRotationPoint(-32F, -4F, -7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[439].setRotationPoint(-32F, -5F, -7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[440].setRotationPoint(-32F, -4F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[441].setRotationPoint(-32F, -5F, -7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Right seat part
		bodyModel[442].setRotationPoint(-22F, -5F, 7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Right seat part
		bodyModel[443].setRotationPoint(-22F, -5F, 7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(-22F, -8F, 7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Right seat part
		bodyModel[445].setRotationPoint(-22F, -4F, 7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[446].setRotationPoint(-22F, -5F, 7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Right seat part
		bodyModel[447].setRotationPoint(-22F, -4F, 7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(-22F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addBox(0.5F, 0F, -3F, 2, 6, 1, 0F); // Left seat part
		bodyModel[449].setRotationPoint(-22F, -5F, -7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addBox(0.5F, 0F, 2F, 2, 6, 1, 0F); // Left seat part
		bodyModel[450].setRotationPoint(-22F, -5F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Left seat part
		bodyModel[451].setRotationPoint(-22F, -3F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[452].setRotationPoint(-22F, -8F, -7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addBox(-2.5F, 0F, 2F, 3, 5, 1, 0F); // Left seat part
		bodyModel[453].setRotationPoint(-22F, -4F, -7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2.5F, 0F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(-22F, -5F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addBox(-2.5F, 0F, -3F, 3, 5, 1, 0F); // Left seat part
		bodyModel[455].setRotationPoint(-22F, -4F, -7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-2.5F, 0F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(-22F, -5F, -7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[457].setRotationPoint(-32F, -3F, 7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Right seat part
		bodyModel[458].setRotationPoint(-22F, -3F, 7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[459].setRotationPoint(-42F, -3F, -7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[460].setRotationPoint(-32F, -3F, -7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(-2.5F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Left seat part
		bodyModel[461].setRotationPoint(-22F, -3F, -7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addBox(-1.5F, 0F, -2F, 5, 2, 4, 0F); // Right seat part
		bodyModel[462].setRotationPoint(-22F, -3F, 7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[463].setRotationPoint(18.5F, -15F, 2F);

		bodyModel[464].addBox(0F, 0F, 0F, 23, 1, 2, 0F); // Box 38
		bodyModel[464].setRotationPoint(-4.5F, -17F, 1.5F);

		bodyModel[465].addBox(0F, 0F, 0F, 23, 0, 1, 0F); // Box 38 glow
		bodyModel[465].setRotationPoint(-4.5F, -15.99F, 2F);

		bodyModel[466].addBox(0F, 0F, 0F, 2, 18, 5, 0F); // Box 38
		bodyModel[466].setRotationPoint(-4.5F, -17F, -4F);

		bodyModel[467].addBox(0F, 0F, 0F, 6, 7, 5, 0F); // Box 128
		bodyModel[467].setRotationPoint(-2.5F, -6F, -4F);

		bodyModel[468].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 128
		bodyModel[468].setRotationPoint(-2.5F, -13F, -4F);

		bodyModel[469].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 128
		bodyModel[469].setRotationPoint(-2.5F, -10F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[470].setRotationPoint(-2.5F, -8.75F, -1F);

		bodyModel[471].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 128
		bodyModel[471].setRotationPoint(2.5F, -10F, -4F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 128
		bodyModel[472].setRotationPoint(0F, -19F, -3F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[473].setRotationPoint(2.5F, -8.75F, -1F);

		bodyModel[474].addBox(0F, 0F, 0F, 3, 7, 6, 0F); // Box 128
		bodyModel[474].setRotationPoint(5.5F, -6F, -4F);

		bodyModel[475].addBox(0F, 0F, 0F, 3, 18, 5, 0F); // Box 128
		bodyModel[475].setRotationPoint(8.5F, -17F, -4F);

		bodyModel[476].addBox(0F, 0F, 0F, 7, 7, 4, 0F); // Box 128
		bodyModel[476].setRotationPoint(11.5F, -6F, -4F);

		bodyModel[477].addBox(0F, 0F, 0F, 7, 6, 3, 0F); // Box 38
		bodyModel[477].setRotationPoint(11.5F, -17F, -4F);

		bodyModel[478].addBox(0F, 0F, 0F, 4, 18, 4, 0F); // Box 38
		bodyModel[478].setRotationPoint(-4.5F, -17F, 6F);

		bodyModel[479].addShapeBox(-0.8F, -2F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.2F); // Folding sink part R
		bodyModel[479].setRotationPoint(-3.7F, -5F, 2.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[480].setRotationPoint(-4.5F, -5F, 2.5F);

		bodyModel[481].addShapeBox(-0.8F, -3F, 0F, 1, 1, 3, 0F,0F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Folding sink part R
		bodyModel[481].setRotationPoint(-3.7F, -5F, 2.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[482].setRotationPoint(-4.5F, -2F, 3.75F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[483].setRotationPoint(63.5F, -7F, -10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[484].setRotationPoint(63.5F, -7F, 5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[485].setRotationPoint(-63.5F, -7F, -10F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[486].setRotationPoint(-63.5F, -7F, 5F);

		bodyModel[487].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // folding prep surface
		bodyModel[487].setRotationPoint(-0.5F, -6F, 6F);

		bodyModel[488].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Box 38
		bodyModel[488].setRotationPoint(-0.5F, -17F, 7F);

		bodyModel[489].addBox(0F, 0F, 0F, 15, 6, 3, 0F); // Box 38
		bodyModel[489].setRotationPoint(3.5F, -17F, 7F);

		bodyModel[490].addBox(0F, 0F, 0F, 7, 7, 4, 0F); // Box 128
		bodyModel[490].setRotationPoint(3.5F, -6F, 6F);

		bodyModel[491].addBox(0F, 0F, 0F, 8, 7, 3, 0F); // Box 128
		bodyModel[491].setRotationPoint(10.5F, -6F, 7F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[492].setRotationPoint(20F, -15F, 0.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[493].setRotationPoint(-47.5F, -11F, -9.9F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[494].setRotationPoint(-47.5F, -11F, 9.9F);

		bodyModel[495].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[495].setRotationPoint(-42F, -8F, -7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[496].setRotationPoint(23.5F, -16F, -9.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[497].setRotationPoint(23.5F, -16F, 8.5F);

		bodyModel[498].addBox(0F, 0F, 0F, 5, 6, 3, 0F); // Box 38
		bodyModel[498].setRotationPoint(3.5F, -17F, -4F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[499].setRotationPoint(43.5F, -3F, 5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 274, 326, textureX, textureY); // Box 128
		bodyModel[501] = new ModelRendererTurbo(this, 275, 312, textureX, textureY); // Box 128
		bodyModel[502] = new ModelRendererTurbo(this, 158, 249, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[503] = new ModelRendererTurbo(this, 392, 364, textureX, textureY); // Box 38
		bodyModel[504] = new ModelRendererTurbo(this, 409, 206, textureX, textureY); // Box 564
		bodyModel[505] = new ModelRendererTurbo(this, 357, 292, textureX, textureY); // Box 275
		bodyModel[506] = new ModelRendererTurbo(this, 382, 265, textureX, textureY); // Box 566
		bodyModel[507] = new ModelRendererTurbo(this, 341, 48, textureX, textureY); // Right step part
		bodyModel[508] = new ModelRendererTurbo(this, 341, 54, textureX, textureY); // Right step part
		bodyModel[509] = new ModelRendererTurbo(this, 339, 51, textureX, textureY); // Right step part
		bodyModel[510] = new ModelRendererTurbo(this, 343, 63, textureX, textureY); // Right step part
		bodyModel[511] = new ModelRendererTurbo(this, 350, 50, textureX, textureY); // Box 142
		bodyModel[512] = new ModelRendererTurbo(this, 356, 47, textureX, textureY); // Right step part
		bodyModel[513] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Right step part
		bodyModel[514] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Right step part
		bodyModel[515] = new ModelRendererTurbo(this, 330, 50, textureX, textureY); // Box 142
		bodyModel[516] = new ModelRendererTurbo(this, 330, 47, textureX, textureY); // Right step part
		bodyModel[517] = new ModelRendererTurbo(this, 334, 84, textureX, textureY); // Box 1353
		bodyModel[518] = new ModelRendererTurbo(this, 350, 84, textureX, textureY); // Box 1354
		bodyModel[519] = new ModelRendererTurbo(this, 350, 82, textureX, textureY); // Box 1357
		bodyModel[520] = new ModelRendererTurbo(this, 334, 82, textureX, textureY); // Box 1358
		bodyModel[521] = new ModelRendererTurbo(this, 350, 88, textureX, textureY); // Box 1359
		bodyModel[522] = new ModelRendererTurbo(this, 334, 88, textureX, textureY); // Box 1360
		bodyModel[523] = new ModelRendererTurbo(this, 339, 85, textureX, textureY); // Box 1356
		bodyModel[524] = new ModelRendererTurbo(this, 339, 45, textureX, textureY); // Right step part
		bodyModel[525] = new ModelRendererTurbo(this, 341, 98, textureX, textureY); // Right step part
		bodyModel[526] = new ModelRendererTurbo(this, 341, 102, textureX, textureY); // Right step part
		bodyModel[527] = new ModelRendererTurbo(this, 341, 88, textureX, textureY); // Box 1355
		bodyModel[528] = new ModelRendererTurbo(this, 341, 92, textureX, textureY); // Right step part
		bodyModel[529] = new ModelRendererTurbo(this, 339, 95, textureX, textureY); // Right step part
		bodyModel[530] = new ModelRendererTurbo(this, 339, 105, textureX, textureY); // Right step part
		bodyModel[531] = new ModelRendererTurbo(this, 336, 96, textureX, textureY); // Right step part
		bodyModel[532] = new ModelRendererTurbo(this, 350, 96, textureX, textureY); // Right step part
		bodyModel[533] = new ModelRendererTurbo(this, 336, 98, textureX, textureY); // Right step part
		bodyModel[534] = new ModelRendererTurbo(this, 350, 98, textureX, textureY); // Right step part
		bodyModel[535] = new ModelRendererTurbo(this, 336, 93, textureX, textureY); // Right step part
		bodyModel[536] = new ModelRendererTurbo(this, 350, 93, textureX, textureY); // Right step part
		bodyModel[537] = new ModelRendererTurbo(this, 345, 69, textureX, textureY); // Box 550
		bodyModel[538] = new ModelRendererTurbo(this, 345, 75, textureX, textureY); // Box 552
		bodyModel[539] = new ModelRendererTurbo(this, 343, 72, textureX, textureY); // Box 553
		bodyModel[540] = new ModelRendererTurbo(this, 352, 81, textureX, textureY); // Box 554
		bodyModel[541] = new ModelRendererTurbo(this, 354, 70, textureX, textureY); // Box 555
		bodyModel[542] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // Box 556
		bodyModel[543] = new ModelRendererTurbo(this, 343, 78, textureX, textureY); // Box 557
		bodyModel[544] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 558
		bodyModel[545] = new ModelRendererTurbo(this, 361, 50, textureX, textureY); // Box 559
		bodyModel[546] = new ModelRendererTurbo(this, 361, 47, textureX, textureY); // Box 560
		bodyModel[547] = new ModelRendererTurbo(this, 322, 59, textureX, textureY); // Box 26
		bodyModel[548] = new ModelRendererTurbo(this, 338, 59, textureX, textureY); // Box 26
		bodyModel[549] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Box 26
		bodyModel[550] = new ModelRendererTurbo(this, 322, 57, textureX, textureY); // Box 26
		bodyModel[551] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Box 26
		bodyModel[552] = new ModelRendererTurbo(this, 322, 63, textureX, textureY); // Box 26
		bodyModel[553] = new ModelRendererTurbo(this, 327, 60, textureX, textureY); // Box 26
		bodyModel[554] = new ModelRendererTurbo(this, 343, 66, textureX, textureY); // Box 551
		bodyModel[555] = new ModelRendererTurbo(this, 329, 77, textureX, textureY); // Left step part
		bodyModel[556] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[557] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 26
		bodyModel[558] = new ModelRendererTurbo(this, 329, 67, textureX, textureY); // Left step part
		bodyModel[559] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Left step part
		bodyModel[560] = new ModelRendererTurbo(this, 327, 80, textureX, textureY); // Left step part
		bodyModel[561] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Left step part
		bodyModel[562] = new ModelRendererTurbo(this, 324, 73, textureX, textureY); // Left step part
		bodyModel[563] = new ModelRendererTurbo(this, 338, 71, textureX, textureY); // Left step part
		bodyModel[564] = new ModelRendererTurbo(this, 324, 71, textureX, textureY); // Left step part
		bodyModel[565] = new ModelRendererTurbo(this, 324, 68, textureX, textureY); // Left step part
		bodyModel[566] = new ModelRendererTurbo(this, 338, 68, textureX, textureY); // Left step part
		bodyModel[567] = new ModelRendererTurbo(this, 494, 313, textureX, textureY,"lamp"); // Box 38 glow

		bodyModel[500].addBox(0F, 0F, 0F, 2, 7, 5, 0F); // Box 128
		bodyModel[500].setRotationPoint(3.5F, -6F, -4F);

		bodyModel[501].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 128
		bodyModel[501].setRotationPoint(3.5F, -6F, 1F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[502].setRotationPoint(-9F, -15F, -0.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 32, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[503].setRotationPoint(23.5F, -16F, -10F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 32, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[504].setRotationPoint(23.5F, -16F, 9F);

		bodyModel[505].addBox(0F, 0F, 0F, 17, 2, 0, 0F); // Box 275
		bodyModel[505].setRotationPoint(31F, -10F, -9.99F);

		bodyModel[506].addBox(0F, 0F, 0F, 17, 2, 0, 0F); // Box 566
		bodyModel[506].setRotationPoint(31F, -10F, 9.99F);

		bodyModel[507].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[507].setRotationPoint(-60.49F, 0.75F, 8.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[508].setRotationPoint(-60.49F, 4.5F, 8F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[509].setRotationPoint(-60.49F, 4.5F, 6.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[510].setRotationPoint(-60.49F, 8F, 9.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[511].setRotationPoint(-56.51F, 3F, 5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[512].setRotationPoint(-56.51F, 3F, 9.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[513].setRotationPoint(-60.49F, 6.25F, 8F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Right step part
		bodyModel[514].setRotationPoint(-60.49F, 6.25F, 9.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
		bodyModel[515].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[516].setRotationPoint(-60.49F, 3F, 9.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[517].setRotationPoint(-60.5F, 3F, 4.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[518].setRotationPoint(-56.5F, 3F, 4.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[519].setRotationPoint(-56.5F, 3F, 7.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[520].setRotationPoint(-60.5F, 3F, 7.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1359
		bodyModel[521].setRotationPoint(-56.5F, 4F, 7.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1360
		bodyModel[522].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[523].setRotationPoint(-60.49F, 3F, 5F);

		bodyModel[524].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[524].setRotationPoint(-60.5F, 0.75F, 7F);

		bodyModel[525].addShapeBox(0F, -3F, 3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[525].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[526].addShapeBox(0F, 0F, 3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.02F, 0F, 0.5F, -0.02F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[526].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[527].setRotationPoint(-60.49F, 3F, 7F);

		bodyModel[528].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[528].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[529].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[529].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[530].addShapeBox(0F, 2F, 0.5F, 4, 0, 2, 0F,0F, 1F, -0.5F, -0.02F, 1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.02F, -1F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[530].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[531].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[531].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[532].addShapeBox(0F, -1F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[532].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[533].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[533].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[534].addShapeBox(0F, 0F, 1F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Right step part
		bodyModel[534].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[535].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[535].setRotationPoint(-60.49F, 4F, 8F);

		bodyModel[536].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[536].setRotationPoint(-56.51F, 4F, 8F);

		bodyModel[537].addShapeBox(0F, 2F, -2F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 550
		bodyModel[537].setRotationPoint(-60.49F, 0.75F, -4.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 552
		bodyModel[538].setRotationPoint(-60.49F, 4.5F, -8F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[539].setRotationPoint(-60.49F, 4.5F, -8.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[540].setRotationPoint(-60.49F, 8F, -11.5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 555
		bodyModel[541].setRotationPoint(-56.51F, 3F, -10F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[542].setRotationPoint(-56.51F, 3F, -11.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[543].setRotationPoint(-60.49F, 6.25F, -10F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.02F, -0.25F, 0F, -0.02F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 558
		bodyModel[544].setRotationPoint(-60.49F, 6.25F, -9.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 559
		bodyModel[545].setRotationPoint(-60.49F, 3F, -10F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[546].setRotationPoint(-60.49F, 3F, -11.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[547].setRotationPoint(-60.5F, 3F, -7.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[548].setRotationPoint(-56.5F, 3F, -7.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[549].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[550].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[551].setRotationPoint(-56.5F, 4F, -10.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[552].setRotationPoint(-60.5F, 4F, -10.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[553].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[554].addShapeBox(0F, 2F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[554].setRotationPoint(-60.5F, 0.75F, -5F);

		bodyModel[555].addShapeBox(0F, 0F, -3F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 0F, 0.5F, 0F, 0F, 0.5F); // Left step part
		bodyModel[555].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[556].addShapeBox(0F, -3F, -3F, 4, 3, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[556].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[557].setRotationPoint(-60.49F, 3F, -7F);

		bodyModel[558].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[558].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[559].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[559].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[560].addShapeBox(0F, 2F, -3F, 4, 0, 2, 0F,0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.02F, 0F, -0.5F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[560].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[561].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[561].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[562].addShapeBox(0F, 0F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[562].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[563].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[563].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[564].addShapeBox(0F, -1F, -3F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[564].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[565].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[565].setRotationPoint(-60.49F, 4F, -8F);

		bodyModel[566].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[566].setRotationPoint(-56.51F, 4F, -8F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[567].setRotationPoint(57F, -15F, -0.5F);
	}
	ModelPS_Truck bogie1 = new ModelPS_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 568; i++)
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
		if(GetColor(entity)==6 || GetColor(entity)==123456){
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