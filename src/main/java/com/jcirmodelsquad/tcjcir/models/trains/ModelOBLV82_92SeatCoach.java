//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck_41E;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelOBLV82_92SeatCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOBLV82_92SeatCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[674];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 60, 111, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 40, 126, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 339, 137, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 311, 138, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 49, 138, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 76, 138, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 310, 142, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 79, 69, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 79, 91, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 13, 60, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 13, 90, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 357, 94, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 357, 72, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[16] = new ModelRendererTurbo(this, 72, 50, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 72, 32, textureX, textureY); // Box 168
		bodyModel[18] = new ModelRendererTurbo(this, 390, 72, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 394, 110, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 406, 93, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 414, 93, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 399, 92, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 421, 92, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 405, 110, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 401, 80, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 27, 124, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 14, 152, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 8, 135, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 17, 135, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 24, 134, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 4, 122, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 370, 68, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 328, 126, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 51, 118, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 62, 135, textureX, textureY); // Trapdoor FL
		bodyModel[39] = new ModelRendererTurbo(this, 64, 121, textureX, textureY); // Trapdoor FR
		bodyModel[40] = new ModelRendererTurbo(this, 307, 118, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 304, 135, textureX, textureY); // Trapdoor RL
		bodyModel[42] = new ModelRendererTurbo(this, 302, 121, textureX, textureY); // Trapdoor RR
		bodyModel[43] = new ModelRendererTurbo(this, 45, 88, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 45, 66, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 30, 81, textureX, textureY); // Vestibule door F
		bodyModel[46] = new ModelRendererTurbo(this, 30, 73, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 325, 66, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 325, 88, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 342, 81, textureX, textureY); // Vestibule door R
		bodyModel[50] = new ModelRendererTurbo(this, 5, 86, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 4, 55, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 379, 93, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 379, 71, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 398, 82, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 414, 82, textureX, textureY); // Box 153
		bodyModel[56] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 17, 124, textureX, textureY); // Box 153
		bodyModel[58] = new ModelRendererTurbo(this, 8, 95, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 8, 65, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 79, 107, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 79, 65, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 47, 117, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 6, 88, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 51, 139, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 56, 119, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 73, 58, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[72] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 73, 180, textureX, textureY); // Box 177
		bodyModel[74] = new ModelRendererTurbo(this, 296, 317, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 296, 282, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 319, 226, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 61, 206, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 1, 266, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 299, 206, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 314, 245, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 314, 269, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 128
		bodyModel[84] = new ModelRendererTurbo(this, 297, 275, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 297, 308, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 297, 310, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 342, 72, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 343, 74, textureX, textureY); // Box 128
		bodyModel[89] = new ModelRendererTurbo(this, 342, 103, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 343, 105, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 30, 103, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 39, 66, textureX, textureY); // Box 128
		bodyModel[93] = new ModelRendererTurbo(this, 30, 64, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 39, 105, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 89, 226, textureX, textureY); // Box 65
		bodyModel[96] = new ModelRendererTurbo(this, 89, 235, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 313, 286, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 394, 76, textureX, textureY); // Box 128
		bodyModel[100] = new ModelRendererTurbo(this, 394, 98, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 374, 98, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 374, 76, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 326, 117, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 327, 119, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 331, 139, textureX, textureY); // Box 104
		bodyModel[107] = new ModelRendererTurbo(this, 311, 86, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 311, 64, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 65, 86, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 77, 159, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 311, 89, textureX, textureY); // Side door RR part
		bodyModel[113] = new ModelRendererTurbo(this, 311, 92, textureX, textureY); // Side door RR part
		bodyModel[114] = new ModelRendererTurbo(this, 308, 86, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 308, 64, textureX, textureY); // Box 120
		bodyModel[116] = new ModelRendererTurbo(this, 76, 86, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 76, 64, textureX, textureY); // Box 120
		bodyModel[118] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Side door RL part
		bodyModel[119] = new ModelRendererTurbo(this, 311, 70, textureX, textureY); // Side door RL part
		bodyModel[120] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Side door FR part
		bodyModel[121] = new ModelRendererTurbo(this, 65, 92, textureX, textureY); // Side door FR part
		bodyModel[122] = new ModelRendererTurbo(this, 65, 67, textureX, textureY); // Side door FL part
		bodyModel[123] = new ModelRendererTurbo(this, 65, 70, textureX, textureY); // Side door FL part
		bodyModel[124] = new ModelRendererTurbo(this, 76, 108, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 76, 135, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 308, 108, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 308, 135, textureX, textureY); // Box 130
		bodyModel[128] = new ModelRendererTurbo(this, 352, 16, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 314, 18, textureX, textureY); // Box 151
		bodyModel[130] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 66, 19, textureX, textureY); // Box 151
		bodyModel[132] = new ModelRendererTurbo(this, 32, 152, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 58, 145, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 63, 152, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 35, 151, textureX, textureY); // Box 128
		bodyModel[139] = new ModelRendererTurbo(this, 32, 156, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 47, 148, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 38, 148, textureX, textureY); // Box 2
		bodyModel[142] = new ModelRendererTurbo(this, 39, 160, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 49, 151, textureX, textureY); // Box 2
		bodyModel[144] = new ModelRendererTurbo(this, 40, 151, textureX, textureY); // Box 2
		bodyModel[145] = new ModelRendererTurbo(this, 18, 118, textureX, textureY); // Box 216
		bodyModel[146] = new ModelRendererTurbo(this, 44, 109, textureX, textureY); // Box 217
		bodyModel[147] = new ModelRendererTurbo(this, 44, 115, textureX, textureY); // Box 218
		bodyModel[148] = new ModelRendererTurbo(this, 49, 116, textureX, textureY); // Box 219
		bodyModel[149] = new ModelRendererTurbo(this, 49, 120, textureX, textureY); // Box 220
		bodyModel[150] = new ModelRendererTurbo(this, 19, 111, textureX, textureY); // Box 221
		bodyModel[151] = new ModelRendererTurbo(this, 21, 117, textureX, textureY); // Box 222
		bodyModel[152] = new ModelRendererTurbo(this, 18, 122, textureX, textureY); // Box 223
		bodyModel[153] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Box 224
		bodyModel[154] = new ModelRendererTurbo(this, 24, 114, textureX, textureY); // Box 225
		bodyModel[155] = new ModelRendererTurbo(this, 24, 126, textureX, textureY); // Box 226
		bodyModel[156] = new ModelRendererTurbo(this, 35, 117, textureX, textureY); // Box 227
		bodyModel[157] = new ModelRendererTurbo(this, 26, 117, textureX, textureY); // Box 228
		bodyModel[158] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 330, 145, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 335, 152, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 335, 156, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 307, 151, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 304, 156, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 2
		bodyModel[168] = new ModelRendererTurbo(this, 319, 160, textureX, textureY); // Box 2
		bodyModel[169] = new ModelRendererTurbo(this, 312, 151, textureX, textureY); // Box 2
		bodyModel[170] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 2
		bodyModel[171] = new ModelRendererTurbo(this, 336, 116, textureX, textureY); // Box 216
		bodyModel[172] = new ModelRendererTurbo(this, 354, 113, textureX, textureY); // Box 217
		bodyModel[173] = new ModelRendererTurbo(this, 354, 119, textureX, textureY); // Box 218
		bodyModel[174] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Box 219
		bodyModel[175] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Box 220
		bodyModel[176] = new ModelRendererTurbo(this, 337, 109, textureX, textureY); // Box 221
		bodyModel[177] = new ModelRendererTurbo(this, 339, 115, textureX, textureY); // Box 222
		bodyModel[178] = new ModelRendererTurbo(this, 336, 120, textureX, textureY); // Box 223
		bodyModel[179] = new ModelRendererTurbo(this, 343, 112, textureX, textureY); // Box 224
		bodyModel[180] = new ModelRendererTurbo(this, 343, 118, textureX, textureY); // Box 225
		bodyModel[181] = new ModelRendererTurbo(this, 343, 130, textureX, textureY); // Box 226
		bodyModel[182] = new ModelRendererTurbo(this, 345, 115, textureX, textureY); // Box 227
		bodyModel[183] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 228
		bodyModel[184] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 297, 159, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 89, 159, textureX, textureY); // Box 128
		bodyModel[187] = new ModelRendererTurbo(this, 259, 155, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 84, 162, textureX, textureY); // Box 128
		bodyModel[189] = new ModelRendererTurbo(this, 84, 159, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 112, 159, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 117, 162, textureX, textureY); // Box 128
		bodyModel[192] = new ModelRendererTurbo(this, 117, 159, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 77, 155, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 264, 159, textureX, textureY); // Box 128
		bodyModel[195] = new ModelRendererTurbo(this, 259, 162, textureX, textureY); // Box 128
		bodyModel[196] = new ModelRendererTurbo(this, 259, 159, textureX, textureY); // Box 128
		bodyModel[197] = new ModelRendererTurbo(this, 287, 159, textureX, textureY); // Box 128
		bodyModel[198] = new ModelRendererTurbo(this, 292, 162, textureX, textureY); // Box 128
		bodyModel[199] = new ModelRendererTurbo(this, 292, 159, textureX, textureY); // Box 128
		bodyModel[200] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 258
		bodyModel[201] = new ModelRendererTurbo(this, 122, 144, textureX, textureY); // Box 259
		bodyModel[202] = new ModelRendererTurbo(this, 297, 148, textureX, textureY); // Box 260
		bodyModel[203] = new ModelRendererTurbo(this, 89, 148, textureX, textureY); // Box 261
		bodyModel[204] = new ModelRendererTurbo(this, 77, 144, textureX, textureY); // Box 262
		bodyModel[205] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 263
		bodyModel[206] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 264
		bodyModel[207] = new ModelRendererTurbo(this, 112, 148, textureX, textureY); // Box 265
		bodyModel[208] = new ModelRendererTurbo(this, 117, 151, textureX, textureY); // Box 266
		bodyModel[209] = new ModelRendererTurbo(this, 117, 148, textureX, textureY); // Box 267
		bodyModel[210] = new ModelRendererTurbo(this, 259, 144, textureX, textureY); // Box 268
		bodyModel[211] = new ModelRendererTurbo(this, 264, 148, textureX, textureY); // Box 269
		bodyModel[212] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 270
		bodyModel[213] = new ModelRendererTurbo(this, 259, 148, textureX, textureY); // Box 271
		bodyModel[214] = new ModelRendererTurbo(this, 287, 148, textureX, textureY); // Box 272
		bodyModel[215] = new ModelRendererTurbo(this, 292, 151, textureX, textureY); // Box 273
		bodyModel[216] = new ModelRendererTurbo(this, 292, 148, textureX, textureY); // Box 274
		bodyModel[217] = new ModelRendererTurbo(this, 86, 5, textureX, textureY); // Box 128
		bodyModel[218] = new ModelRendererTurbo(this, 91, 2, textureX, textureY); // Box 128
		bodyModel[219] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Box 199
		bodyModel[220] = new ModelRendererTurbo(this, 283, 20, textureX, textureY); // Box 199
		bodyModel[221] = new ModelRendererTurbo(this, 285, 17, textureX, textureY); // Box 199
		bodyModel[222] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 199
		bodyModel[223] = new ModelRendererTurbo(this, 77, 17, textureX, textureY); // Box 199
		bodyModel[224] = new ModelRendererTurbo(this, 283, 1, textureX, textureY); // Box 280
		bodyModel[225] = new ModelRendererTurbo(this, 285, 7, textureX, textureY); // Box 281
		bodyModel[226] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 282
		bodyModel[227] = new ModelRendererTurbo(this, 77, 7, textureX, textureY); // Box 283
		bodyModel[228] = new ModelRendererTurbo(this, 308, 77, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Box 128
		bodyModel[230] = new ModelRendererTurbo(this, 308, 99, textureX, textureY); // Box 202
		bodyModel[231] = new ModelRendererTurbo(this, 322, 99, textureX, textureY); // Box 203
		bodyModel[232] = new ModelRendererTurbo(this, 62, 77, textureX, textureY); // Box 128
		bodyModel[233] = new ModelRendererTurbo(this, 76, 77, textureX, textureY); // Box 128
		bodyModel[234] = new ModelRendererTurbo(this, 62, 99, textureX, textureY); // Box 202
		bodyModel[235] = new ModelRendererTurbo(this, 76, 99, textureX, textureY); // Box 203
		bodyModel[236] = new ModelRendererTurbo(this, 38, 154, textureX, textureY); // Box 2
		bodyModel[237] = new ModelRendererTurbo(this, 40, 157, textureX, textureY); // Box 2
		bodyModel[238] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 225
		bodyModel[239] = new ModelRendererTurbo(this, 26, 123, textureX, textureY); // Box 228
		bodyModel[240] = new ModelRendererTurbo(this, 319, 154, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 321, 157, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 343, 124, textureX, textureY); // Box 225
		bodyModel[243] = new ModelRendererTurbo(this, 345, 127, textureX, textureY); // Box 228
		bodyModel[244] = new ModelRendererTurbo(this, 183, 159, textureX, textureY); // Box 2
		bodyModel[245] = new ModelRendererTurbo(this, 125, 170, textureX, textureY); // Box 2
		bodyModel[246] = new ModelRendererTurbo(this, 154, 175, textureX, textureY); // Box 2
		bodyModel[247] = new ModelRendererTurbo(this, 122, 175, textureX, textureY); // Box 2
		bodyModel[248] = new ModelRendererTurbo(this, 191, 170, textureX, textureY); // Box 41
		bodyModel[249] = new ModelRendererTurbo(this, 208, 171, textureX, textureY); // Box 41
		bodyModel[250] = new ModelRendererTurbo(this, 188, 171, textureX, textureY); // Box 41
		bodyModel[251] = new ModelRendererTurbo(this, 122, 160, textureX, textureY); // Box 316
		bodyModel[252] = new ModelRendererTurbo(this, 151, 164, textureX, textureY); // Box 317
		bodyModel[253] = new ModelRendererTurbo(this, 176, 163, textureX, textureY); // Box 52
		bodyModel[254] = new ModelRendererTurbo(this, 152, 169, textureX, textureY); // Box 41
		bodyModel[255] = new ModelRendererTurbo(this, 165, 169, textureX, textureY); // Box 41
		bodyModel[256] = new ModelRendererTurbo(this, 149, 169, textureX, textureY); // Box 41
		bodyModel[257] = new ModelRendererTurbo(this, 170, 175, textureX, textureY); // Box 41
		bodyModel[258] = new ModelRendererTurbo(this, 185, 175, textureX, textureY); // Box 41
		bodyModel[259] = new ModelRendererTurbo(this, 167, 175, textureX, textureY); // Box 41
		bodyModel[260] = new ModelRendererTurbo(this, 332, 286, textureX, textureY); // Box 128
		bodyModel[261] = new ModelRendererTurbo(this, 339, 286, textureX, textureY); // Box 128
		bodyModel[262] = new ModelRendererTurbo(this, 361, 291, textureX, textureY); // Box 38
		bodyModel[263] = new ModelRendererTurbo(this, 364, 296, textureX, textureY); // Box 38
		bodyModel[264] = new ModelRendererTurbo(this, 363, 300, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 332, 321, textureX, textureY); // Box 365
		bodyModel[266] = new ModelRendererTurbo(this, 339, 321, textureX, textureY); // Box 366
		bodyModel[267] = new ModelRendererTurbo(this, 364, 331, textureX, textureY); // Box 368
		bodyModel[268] = new ModelRendererTurbo(this, 363, 335, textureX, textureY); // Box 369
		bodyModel[269] = new ModelRendererTurbo(this, 361, 326, textureX, textureY); // Box 370
		bodyModel[270] = new ModelRendererTurbo(this, 343, 288, textureX, textureY); // Box 128
		bodyModel[271] = new ModelRendererTurbo(this, 82, 239, textureX, textureY); // Box 128
		bodyModel[272] = new ModelRendererTurbo(this, 82, 230, textureX, textureY); // Box 374
		bodyModel[273] = new ModelRendererTurbo(this, 346, 289, textureX, textureY); // Box 128
		bodyModel[274] = new ModelRendererTurbo(this, 341, 296, textureX, textureY); // Box 128
		bodyModel[275] = new ModelRendererTurbo(this, 353, 296, textureX, textureY); // Box 41
		bodyModel[276] = new ModelRendererTurbo(this, 343, 323, textureX, textureY); // Box 379
		bodyModel[277] = new ModelRendererTurbo(this, 346, 324, textureX, textureY); // Box 380
		bodyModel[278] = new ModelRendererTurbo(this, 341, 331, textureX, textureY); // Box 381
		bodyModel[279] = new ModelRendererTurbo(this, 353, 331, textureX, textureY); // Box 382
		bodyModel[280] = new ModelRendererTurbo(this, 317, 318, textureX, textureY,"lamp"); // Box 86 glow
		bodyModel[281] = new ModelRendererTurbo(this, 317, 283, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[282] = new ModelRendererTurbo(this, 275, 286, textureX, textureY); // Right seat part
		bodyModel[283] = new ModelRendererTurbo(this, 285, 276, textureX, textureY); // Right seat part
		bodyModel[284] = new ModelRendererTurbo(this, 275, 321, textureX, textureY); // Left seat part
		bodyModel[285] = new ModelRendererTurbo(this, 285, 311, textureX, textureY); // Left seat part
		bodyModel[286] = new ModelRendererTurbo(this, 268, 297, textureX, textureY); // Boc 42
		bodyModel[287] = new ModelRendererTurbo(this, 268, 332, textureX, textureY); // Box 638
		bodyModel[288] = new ModelRendererTurbo(this, 272, 281, textureX, textureY); // Right seat part
		bodyModel[289] = new ModelRendererTurbo(this, 283, 299, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 283, 334, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 272, 316, textureX, textureY); // Left seat part
		bodyModel[292] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[297] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[298] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[299] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[302] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[303] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[304] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[305] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[306] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[307] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[308] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[309] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[310] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[311] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[312] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[313] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[314] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[315] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[316] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[317] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[318] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[319] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[320] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[321] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[322] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[323] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[324] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[325] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[326] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[327] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[328] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[329] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[330] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[331] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[332] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[333] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[334] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part
		bodyModel[335] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part
		bodyModel[336] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[337] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[338] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[339] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[340] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part
		bodyModel[341] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part
		bodyModel[342] = new ModelRendererTurbo(this, 107, 286, textureX, textureY); // Right seat part
		bodyModel[343] = new ModelRendererTurbo(this, 117, 276, textureX, textureY); // Right seat part
		bodyModel[344] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[345] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[346] = new ModelRendererTurbo(this, 100, 297, textureX, textureY); // Boc 42
		bodyModel[347] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[348] = new ModelRendererTurbo(this, 104, 281, textureX, textureY); // Right seat part
		bodyModel[349] = new ModelRendererTurbo(this, 115, 299, textureX, textureY); // Right seat part
		bodyModel[350] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[351] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[352] = new ModelRendererTurbo(this, 79, 286, textureX, textureY); // Right seat part
		bodyModel[353] = new ModelRendererTurbo(this, 89, 276, textureX, textureY); // Right seat part
		bodyModel[354] = new ModelRendererTurbo(this, 79, 321, textureX, textureY); // Left seat part
		bodyModel[355] = new ModelRendererTurbo(this, 89, 311, textureX, textureY); // Left seat part
		bodyModel[356] = new ModelRendererTurbo(this, 72, 297, textureX, textureY); // Boc 42
		bodyModel[357] = new ModelRendererTurbo(this, 72, 332, textureX, textureY); // Box 638
		bodyModel[358] = new ModelRendererTurbo(this, 76, 281, textureX, textureY); // Right seat part
		bodyModel[359] = new ModelRendererTurbo(this, 87, 299, textureX, textureY); // Right seat part
		bodyModel[360] = new ModelRendererTurbo(this, 87, 334, textureX, textureY); // Left seat part
		bodyModel[361] = new ModelRendererTurbo(this, 76, 316, textureX, textureY); // Left seat part
		bodyModel[362] = new ModelRendererTurbo(this, 51, 286, textureX, textureY); // Right seat part
		bodyModel[363] = new ModelRendererTurbo(this, 61, 276, textureX, textureY); // Right seat part
		bodyModel[364] = new ModelRendererTurbo(this, 51, 321, textureX, textureY); // Left seat part
		bodyModel[365] = new ModelRendererTurbo(this, 61, 311, textureX, textureY); // Left seat part
		bodyModel[366] = new ModelRendererTurbo(this, 44, 297, textureX, textureY); // Boc 42
		bodyModel[367] = new ModelRendererTurbo(this, 44, 332, textureX, textureY); // Box 638
		bodyModel[368] = new ModelRendererTurbo(this, 48, 281, textureX, textureY); // Right seat part
		bodyModel[369] = new ModelRendererTurbo(this, 59, 299, textureX, textureY); // Right seat part
		bodyModel[370] = new ModelRendererTurbo(this, 59, 334, textureX, textureY); // Left seat part
		bodyModel[371] = new ModelRendererTurbo(this, 48, 316, textureX, textureY); // Left seat part
		bodyModel[372] = new ModelRendererTurbo(this, 23, 286, textureX, textureY); // Right seat part
		bodyModel[373] = new ModelRendererTurbo(this, 33, 276, textureX, textureY); // Right seat part
		bodyModel[374] = new ModelRendererTurbo(this, 23, 321, textureX, textureY); // Left seat part
		bodyModel[375] = new ModelRendererTurbo(this, 33, 311, textureX, textureY); // Left seat part
		bodyModel[376] = new ModelRendererTurbo(this, 16, 297, textureX, textureY); // Boc 42
		bodyModel[377] = new ModelRendererTurbo(this, 16, 332, textureX, textureY); // Box 638
		bodyModel[378] = new ModelRendererTurbo(this, 20, 281, textureX, textureY); // Right seat part
		bodyModel[379] = new ModelRendererTurbo(this, 31, 299, textureX, textureY); // Right seat part
		bodyModel[380] = new ModelRendererTurbo(this, 31, 334, textureX, textureY); // Left seat part
		bodyModel[381] = new ModelRendererTurbo(this, 20, 316, textureX, textureY); // Left seat part
		bodyModel[382] = new ModelRendererTurbo(this, 382, 78, textureX, textureY); // Rear gate closed
		bodyModel[383] = new ModelRendererTurbo(this, 379, 83, textureX, textureY); // Rear gate open
		bodyModel[384] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Front gate closed
		bodyModel[385] = new ModelRendererTurbo(this, 1, 112, textureX, textureY); // Front gate open
		bodyModel[386] = new ModelRendererTurbo(this, 52, 237, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[387] = new ModelRendererTurbo(this, 52, 234, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[388] = new ModelRendererTurbo(this, 89, 244, textureX, textureY); // Box 384
		bodyModel[389] = new ModelRendererTurbo(this, 8, 385, textureX, textureY); // Right seat part
		bodyModel[390] = new ModelRendererTurbo(this, 18, 340, textureX, textureY); // Right seat part
		bodyModel[391] = new ModelRendererTurbo(this, 8, 350, textureX, textureY); // Left seat part
		bodyModel[392] = new ModelRendererTurbo(this, 18, 375, textureX, textureY); // Left seat part
		bodyModel[393] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Boc 42
		bodyModel[394] = new ModelRendererTurbo(this, 1, 396, textureX, textureY); // Box 638
		bodyModel[395] = new ModelRendererTurbo(this, 5, 345, textureX, textureY); // Right seat part
		bodyModel[396] = new ModelRendererTurbo(this, 16, 363, textureX, textureY); // Right seat part
		bodyModel[397] = new ModelRendererTurbo(this, 16, 398, textureX, textureY); // Left seat part
		bodyModel[398] = new ModelRendererTurbo(this, 5, 380, textureX, textureY); // Left seat part
		bodyModel[399] = new ModelRendererTurbo(this, 102, 373, textureX, textureY); // Box 128
		bodyModel[400] = new ModelRendererTurbo(this, 102, 366, textureX, textureY); // Box 1083
		bodyModel[401] = new ModelRendererTurbo(this, 91, 354, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 91, 360, textureX, textureY); // Box 462
		bodyModel[403] = new ModelRendererTurbo(this, 53, 36, textureX, textureY); // Box 128
		bodyModel[404] = new ModelRendererTurbo(this, 46, 36, textureX, textureY); // Box 128
		bodyModel[405] = new ModelRendererTurbo(this, 55, 39, textureX, textureY); // Box 128
		bodyModel[406] = new ModelRendererTurbo(this, 47, 39, textureX, textureY); // Box 529
		bodyModel[407] = new ModelRendererTurbo(this, 328, 14, textureX, textureY); // Box 128
		bodyModel[408] = new ModelRendererTurbo(this, 330, 5, textureX, textureY); // Box 128
		bodyModel[409] = new ModelRendererTurbo(this, 331, 8, textureX, textureY); // Box 128
		bodyModel[410] = new ModelRendererTurbo(this, 339, 8, textureX, textureY); // Box 529
		bodyModel[411] = new ModelRendererTurbo(this, 339, 13, textureX, textureY); // Box 128
		bodyModel[412] = new ModelRendererTurbo(this, 345, 5, textureX, textureY); // Box 128
		bodyModel[413] = new ModelRendererTurbo(this, 323, 13, textureX, textureY); // Box 536
		bodyModel[414] = new ModelRendererTurbo(this, 317, 5, textureX, textureY); // Box 537
		bodyModel[415] = new ModelRendererTurbo(this, 58, 28, textureX, textureY); // Box 128
		bodyModel[416] = new ModelRendererTurbo(this, 58, 20, textureX, textureY); // Box 128
		bodyModel[417] = new ModelRendererTurbo(this, 54, 52, textureX, textureY); // Box 540
		bodyModel[418] = new ModelRendererTurbo(this, 47, 49, textureX, textureY); // Box 541
		bodyModel[419] = new ModelRendererTurbo(this, 294, 20, textureX, textureY); // Box 199
		bodyModel[420] = new ModelRendererTurbo(this, 296, 17, textureX, textureY); // Box 199
		bodyModel[421] = new ModelRendererTurbo(this, 294, 1, textureX, textureY); // Box 280
		bodyModel[422] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 281
		bodyModel[423] = new ModelRendererTurbo(this, 173, 164, textureX, textureY); // Box 317
		bodyModel[424] = new ModelRendererTurbo(this, 154, 159, textureX, textureY); // Box 2
		bodyModel[425] = new ModelRendererTurbo(this, 152, 172, textureX, textureY); // Box 41
		bodyModel[426] = new ModelRendererTurbo(this, 165, 172, textureX, textureY); // Box 41
		bodyModel[427] = new ModelRendererTurbo(this, 149, 172, textureX, textureY); // Box 41
		bodyModel[428] = new ModelRendererTurbo(this, 186, 294, textureX, textureY); // Right seat part
		bodyModel[429] = new ModelRendererTurbo(this, 189, 274, textureX, textureY); // Right seat part
		bodyModel[430] = new ModelRendererTurbo(this, 186, 329, textureX, textureY); // Left seat part
		bodyModel[431] = new ModelRendererTurbo(this, 189, 309, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 214, 294, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 214, 329, textureX, textureY); // Left seat part
		bodyModel[435] = new ModelRendererTurbo(this, 217, 309, textureX, textureY); // Left seat part
		bodyModel[436] = new ModelRendererTurbo(this, 242, 294, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 245, 274, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 242, 329, textureX, textureY); // Left seat part
		bodyModel[439] = new ModelRendererTurbo(this, 245, 309, textureX, textureY); // Left seat part
		bodyModel[440] = new ModelRendererTurbo(this, 270, 294, textureX, textureY); // Right seat part
		bodyModel[441] = new ModelRendererTurbo(this, 273, 274, textureX, textureY); // Right seat part
		bodyModel[442] = new ModelRendererTurbo(this, 270, 329, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 273, 309, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 158, 294, textureX, textureY); // Right seat part
		bodyModel[445] = new ModelRendererTurbo(this, 161, 274, textureX, textureY); // Right seat part
		bodyModel[446] = new ModelRendererTurbo(this, 158, 329, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 161, 309, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 130, 294, textureX, textureY); // Right seat part
		bodyModel[449] = new ModelRendererTurbo(this, 133, 274, textureX, textureY); // Right seat part
		bodyModel[450] = new ModelRendererTurbo(this, 130, 329, textureX, textureY); // Left seat part
		bodyModel[451] = new ModelRendererTurbo(this, 133, 309, textureX, textureY); // Left seat part
		bodyModel[452] = new ModelRendererTurbo(this, 102, 294, textureX, textureY); // Right seat part
		bodyModel[453] = new ModelRendererTurbo(this, 105, 274, textureX, textureY); // Right seat part
		bodyModel[454] = new ModelRendererTurbo(this, 102, 329, textureX, textureY); // Left seat part
		bodyModel[455] = new ModelRendererTurbo(this, 105, 309, textureX, textureY); // Left seat part
		bodyModel[456] = new ModelRendererTurbo(this, 115, 295, textureX, textureY); // Right seat part
		bodyModel[457] = new ModelRendererTurbo(this, 115, 330, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 104, 312, textureX, textureY); // Left seat part
		bodyModel[459] = new ModelRendererTurbo(this, 74, 294, textureX, textureY); // Right seat part
		bodyModel[460] = new ModelRendererTurbo(this, 77, 274, textureX, textureY); // Right seat part
		bodyModel[461] = new ModelRendererTurbo(this, 74, 329, textureX, textureY); // Left seat part
		bodyModel[462] = new ModelRendererTurbo(this, 77, 309, textureX, textureY); // Left seat part
		bodyModel[463] = new ModelRendererTurbo(this, 46, 294, textureX, textureY); // Right seat part
		bodyModel[464] = new ModelRendererTurbo(this, 49, 274, textureX, textureY); // Right seat part
		bodyModel[465] = new ModelRendererTurbo(this, 46, 329, textureX, textureY); // Left seat part
		bodyModel[466] = new ModelRendererTurbo(this, 49, 309, textureX, textureY); // Left seat part
		bodyModel[467] = new ModelRendererTurbo(this, 18, 294, textureX, textureY); // Right seat part
		bodyModel[468] = new ModelRendererTurbo(this, 21, 274, textureX, textureY); // Right seat part
		bodyModel[469] = new ModelRendererTurbo(this, 18, 329, textureX, textureY); // Left seat part
		bodyModel[470] = new ModelRendererTurbo(this, 21, 309, textureX, textureY); // Left seat part
		bodyModel[471] = new ModelRendererTurbo(this, 3, 358, textureX, textureY); // Right seat part
		bodyModel[472] = new ModelRendererTurbo(this, 6, 338, textureX, textureY); // Right seat part
		bodyModel[473] = new ModelRendererTurbo(this, 3, 393, textureX, textureY); // Left seat part
		bodyModel[474] = new ModelRendererTurbo(this, 6, 373, textureX, textureY); // Left seat part
		bodyModel[475] = new ModelRendererTurbo(this, 93, 406, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 94, 388, textureX, textureY); // Box 128
		bodyModel[477] = new ModelRendererTurbo(this, 73, 189, textureX, textureY); // Box 128
		bodyModel[478] = new ModelRendererTurbo(this, 315, 189, textureX, textureY); // Box 128
		bodyModel[479] = new ModelRendererTurbo(this, 127, 380, textureX, textureY,"cull"); // Box 386 cull
		bodyModel[480] = new ModelRendererTurbo(this, 91, 339, textureX, textureY,"cull"); // Box 658 cull
		bodyModel[481] = new ModelRendererTurbo(this, 124, 189, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[482] = new ModelRendererTurbo(this, 104, 399, textureX, textureY); // Box 95
		bodyModel[483] = new ModelRendererTurbo(this, 91, 349, textureX, textureY,"cull"); // Box 658 cull
		bodyModel[484] = new ModelRendererTurbo(this, 113, 390, textureX, textureY,"cull"); // Box 664 cull
		bodyModel[485] = new ModelRendererTurbo(this, 316, 50, textureX, textureY); // Box 128
		bodyModel[486] = new ModelRendererTurbo(this, 316, 197, textureX, textureY); // Box 128
		bodyModel[487] = new ModelRendererTurbo(this, 121, 50, textureX, textureY); // Box 128
		bodyModel[488] = new ModelRendererTurbo(this, 117, 200, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 301, 203, textureX, textureY); // Box 128
		bodyModel[490] = new ModelRendererTurbo(this, 129, 200, textureX, textureY); // Box 128
		bodyModel[491] = new ModelRendererTurbo(this, 316, 32, textureX, textureY); // Box 168
		bodyModel[492] = new ModelRendererTurbo(this, 316, 180, textureX, textureY); // Box 177
		bodyModel[493] = new ModelRendererTurbo(this, 121, 32, textureX, textureY); // Box 675
		bodyModel[494] = new ModelRendererTurbo(this, 122, 181, textureX, textureY); // Box 676
		bodyModel[495] = new ModelRendererTurbo(this, 301, 180, textureX, textureY); // Box 677
		bodyModel[496] = new ModelRendererTurbo(this, 129, 197, textureX, textureY); // Box 678
		bodyModel[497] = new ModelRendererTurbo(this, 112, 380, textureX, textureY,"cull"); // Box 386 cull
		bodyModel[498] = new ModelRendererTurbo(this, 140, 207, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[499] = new ModelRendererTurbo(this, 157, 205, textureX, textureY,"lamp"); // Box 128 glow

		bodyModel[0].addBox(0F, 0F, 0F, 113, 2, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-56.5F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[1].setRotationPoint(-61.5F, 1F, -4F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(59.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 2
		bodyModel[3].setRotationPoint(56.5F, 3F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 2
		bodyModel[4].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 2
		bodyModel[5].setRotationPoint(-61.5F, 3F, -4F);

		bodyModel[6].addBox(0F, 0F, 0F, 113, 1, 4, 0F); // Box 2
		bodyModel[6].setRotationPoint(-56.5F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[7].setRotationPoint(43F, 4F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[8].setRotationPoint(-45F, 4F, -1F);

		bodyModel[9].addBox(0F, 0F, 0F, 113, 14, 1, 0F); // Box 38
		bodyModel[9].setRotationPoint(-56.5F, -13F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 113, 14, 1, 0F); // Box 128
		bodyModel[10].setRotationPoint(-56.5F, -13F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(-61.5F, -13F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(-61.5F, -13F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[13].setRotationPoint(60.5F, -13F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[14].setRotationPoint(60.5F, -13F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 121, 2, 6, 0F); // Box 128
		bodyModel[15].setRotationPoint(-60.5F, -20F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[16].setRotationPoint(-60.5F, -20F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 168
		bodyModel[17].setRotationPoint(-60.5F, -20F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[18].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[19].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(63F, -14F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(63F, -14F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(63F, 1F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(63F, -15F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-63F, -15F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[27].setRotationPoint(-63F, 1F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[28].setRotationPoint(-63F, -14F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-63F, -14F, 3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[30].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[31].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[32].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[33].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[34].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[35].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[36].setRotationPoint(60.5F, 1F, -4F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[37].setRotationPoint(-60.5F, 1F, -5F);

		bodyModel[38].addShapeBox(-4F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F); // Trapdoor FL
		bodyModel[38].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[39].addShapeBox(-4F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Trapdoor FR
		bodyModel[39].setRotationPoint(-56.5F, 1F, 5F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[40].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Trapdoor RL
		bodyModel[41].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Trapdoor RR
		bodyModel[42].setRotationPoint(56.5F, 1F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[43].setRotationPoint(-56.5F, -13F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[44].setRotationPoint(-56.5F, -13F, 3F);

		bodyModel[45].addShapeBox(-1F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door F
		bodyModel[45].setRotationPoint(-55.5F, -14F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[46].setRotationPoint(-56.5F, -15F, -3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[47].setRotationPoint(55.5F, -13F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[48].setRotationPoint(55.5F, -13F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door R
		bodyModel[49].setRotationPoint(55.5F, -14F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-61.5F, -15F, 4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(60.5F, -15F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[54].setRotationPoint(63F, -16.5F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[55].setRotationPoint(63F, -16.5F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[56].setRotationPoint(-63.5F, -16.5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[57].setRotationPoint(-63.5F, -16.5F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-61.5F, -15F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-56.5F, -15F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[61].setRotationPoint(-56.5F, 1F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 113, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[63].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-61.5F, 1F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[68].setRotationPoint(-61.5F, 1F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 121, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 128
		bodyModel[70].setRotationPoint(-60.5F, -17F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 121, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 170
		bodyModel[71].setRotationPoint(-60.5F, -17F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(-60.5F, -19F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[73].setRotationPoint(-60.5F, -19F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[74].setRotationPoint(47.5F, -13F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[75].setRotationPoint(47.5F, -13F, 3F);

		bodyModel[76].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 128
		bodyModel[76].setRotationPoint(47.5F, -15F, -3F);

		bodyModel[77].addBox(0F, 0F, 0F, 19, 2, 17, 0F); // Box 128
		bodyModel[77].setRotationPoint(-60.5F, -17F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-60.5F, -17F, -9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-60.5F, -17F, 8.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 13, 2, 17, 0F); // Box 128
		bodyModel[80].setRotationPoint(47.5F, -17F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(47.5F, -17F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(47.5F, -17F, 8.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[83].setRotationPoint(47.5F, -15F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[84].setRotationPoint(47.5F, -15F, 9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 86
		bodyModel[85].setRotationPoint(47.5F, -15F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(47.5F, -15F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[87].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[88].setRotationPoint(55.5F, -15F, 9F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 90
		bodyModel[89].setRotationPoint(55.5F, -15F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[90].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[91].setRotationPoint(-56.5F, -15F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[92].setRotationPoint(-56.5F, -15F, 9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 94
		bodyModel[93].setRotationPoint(-56.5F, -15F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[94].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 89, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[95].setRotationPoint(-41.5F, -17F, -9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 89, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 97
		bodyModel[96].setRotationPoint(-41.5F, -17F, 7.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 128
		bodyModel[97].setRotationPoint(48.5F, -15F, 3F);

		bodyModel[98].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 102
		bodyModel[98].setRotationPoint(48.5F, -15F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[99].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.46F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[100].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 128
		bodyModel[101].setRotationPoint(60.5F, -15F, -4F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 106
		bodyModel[102].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[104].setRotationPoint(60.5F, 1F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[105].setRotationPoint(60.5F, 1F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[106].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[107].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 112
		bodyModel[108].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[109].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 114
		bodyModel[110].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 128
		bodyModel[111].setRotationPoint(-56.5F, 3F, 9.5F);

		bodyModel[112].addShapeBox(-0.25F, 0F, 0.25F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.76F, 0F, 0F, -0.76F); // Side door RR part
		bodyModel[112].setRotationPoint(56.75F, -14F, 10.25F);

		bodyModel[113].addShapeBox(-0.25F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F); // Side door RR part
		bodyModel[113].setRotationPoint(56.75F, -13F, 10.25F);

		bodyModel[114].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[114].setRotationPoint(56.75F, -13F, 10.5F);

		bodyModel[115].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[115].setRotationPoint(56.75F, -13F, -10.5F);

		bodyModel[116].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[116].setRotationPoint(-56.5F, -13F, 10.5F);

		bodyModel[117].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[117].setRotationPoint(-56.5F, -13F, -10.5F);

		bodyModel[118].addShapeBox(-0.25F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door RL part
		bodyModel[118].setRotationPoint(56.75F, -14F, -10.25F);

		bodyModel[119].addShapeBox(-0.25F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door RL part
		bodyModel[119].setRotationPoint(56.75F, -13F, -10.25F);

		bodyModel[120].addShapeBox(-3.75F, 0F, -0.25F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Side door FR part
		bodyModel[120].setRotationPoint(-56.75F, -14F, 10.25F);

		bodyModel[121].addShapeBox(-3.75F, 0F, -0.5F, 4, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F); // Side door FR part
		bodyModel[121].setRotationPoint(-56.75F, -13F, 10.25F);

		bodyModel[122].addShapeBox(-3.75F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door FL part
		bodyModel[122].setRotationPoint(-56.75F, -14F, -10.25F);

		bodyModel[123].addShapeBox(-3.75F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door FL part
		bodyModel[123].setRotationPoint(-56.75F, -13F, -10.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-57.25F, 1F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[125].setRotationPoint(-57.25F, 1F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(56.5F, 1F, 10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[127].setRotationPoint(56.5F, 1F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.32F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.32F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[128].setRotationPoint(60.5F, -17F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.32F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -0.32F, 0F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[129].setRotationPoint(60.5F, -17F, 7.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0.14F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, 0F, -1F, 0.14F, 0F, -1F); // Box 128
		bodyModel[130].setRotationPoint(-61.04F, -17F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.14F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0.14F, 0F, -1F, -0.46F, 0F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[131].setRotationPoint(-61.04F, -17F, 7.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[132].setRotationPoint(-60.5F, 3F, 9.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[133].setRotationPoint(-56.5F, 3F, 5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[134].setRotationPoint(-56.5F, 3F, 8.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[135].setRotationPoint(-56.5F, 3F, 9.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[136].setRotationPoint(-56.5F, 6F, 9.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[137].setRotationPoint(-60.5F, 3F, 5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[138].setRotationPoint(-60.5F, 3F, 8.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[139].setRotationPoint(-60.5F, 6F, 9.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[140].setRotationPoint(-60.5F, 2.5F, 5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[141].setRotationPoint(-60.5F, 4F, 6.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[142].setRotationPoint(-60.5F, 7F, 8.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[143].setRotationPoint(-60.5F, 2.5F, 6.25F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[144].setRotationPoint(-60.5F, 4F, 7.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[145].setRotationPoint(-60.5F, 3F, -10.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[146].setRotationPoint(-56.5F, 3F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[147].setRotationPoint(-56.5F, 3F, -10.25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[148].setRotationPoint(-56.5F, 3F, -10.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[149].setRotationPoint(-56.5F, 6F, -10.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[150].setRotationPoint(-60.5F, 3F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[151].setRotationPoint(-60.5F, 3F, -10.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[152].setRotationPoint(-60.5F, 6F, -10.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[153].setRotationPoint(-60.5F, 2.5F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[154].setRotationPoint(-60.5F, 4F, -8.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[155].setRotationPoint(-60.5F, 7F, -10.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[156].setRotationPoint(-60.5F, 2.5F, -6.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[157].setRotationPoint(-60.5F, 4F, -7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[158].setRotationPoint(56.5F, 3F, 9.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[159].setRotationPoint(60.5F, 3F, 5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[160].setRotationPoint(60.5F, 3F, 8.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[161].setRotationPoint(60.5F, 3F, 9.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[162].setRotationPoint(60.5F, 6F, 9.75F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[163].setRotationPoint(56.5F, 3F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[164].setRotationPoint(56.5F, 3F, 8.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[165].setRotationPoint(56.5F, 6F, 9.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[166].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[167].setRotationPoint(56.5F, 4F, 6.25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[168].setRotationPoint(56.5F, 7F, 8.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[169].setRotationPoint(56.5F, 2.5F, 6.25F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[170].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[171].setRotationPoint(56.5F, 3F, -10.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[172].setRotationPoint(60.5F, 3F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[173].setRotationPoint(60.5F, 3F, -10.25F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[174].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[175].setRotationPoint(60.5F, 6F, -10.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[176].setRotationPoint(56.5F, 3F, -8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[177].setRotationPoint(56.5F, 3F, -10.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[178].setRotationPoint(56.5F, 6F, -10.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[179].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[180].setRotationPoint(56.5F, 4F, -8.25F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[181].setRotationPoint(56.5F, 7F, -10.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[182].setRotationPoint(56.5F, 2.5F, -6.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[183].setRotationPoint(56.5F, 4F, -7.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[184].setRotationPoint(-33.5F, 3F, 9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[185].setRotationPoint(54.5F, 3F, 9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[186].setRotationPoint(-54F, 3F, 9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[187].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[188].setRotationPoint(-54.5F, 3.5F, 9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[189].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[190].setRotationPoint(-35F, 3F, 9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[191].setRotationPoint(-34.5F, 3.5F, 9.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[192].setRotationPoint(-34F, 3F, 9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[193].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[194].setRotationPoint(34F, 3F, 9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[195].setRotationPoint(33.5F, 3.5F, 9.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[196].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[197].setRotationPoint(53F, 3F, 9.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[198].setRotationPoint(53.5F, 3.5F, 9.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[199].setRotationPoint(54F, 3F, 9.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 258
		bodyModel[200].setRotationPoint(-56.5F, 3F, -10.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[201].setRotationPoint(-33.5F, 3F, -10.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[202].setRotationPoint(54.5F, 3F, -10.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 261
		bodyModel[203].setRotationPoint(-54F, 3F, -10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[204].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[205].setRotationPoint(-54.5F, 3.5F, -10.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 264
		bodyModel[206].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 265
		bodyModel[207].setRotationPoint(-35F, 3F, -10.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 266
		bodyModel[208].setRotationPoint(-34.5F, 3.5F, -10.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 267
		bodyModel[209].setRotationPoint(-34F, 3F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[210].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 269
		bodyModel[211].setRotationPoint(34F, 3F, -10.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[212].setRotationPoint(33.5F, 3.5F, -10.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 271
		bodyModel[213].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 272
		bodyModel[214].setRotationPoint(53F, 3F, -10.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 273
		bodyModel[215].setRotationPoint(53.5F, 3.5F, -10.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 274
		bodyModel[216].setRotationPoint(54F, 3F, -10.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[217].setRotationPoint(-56.5F, -20.25F, -3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[218].setRotationPoint(-56.5F, -20.25F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 199
		bodyModel[219].setRotationPoint(-56.5F, -20.25F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[220].setRotationPoint(44.5F, -20.25F, 6.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[221].setRotationPoint(44.5F, -20.25F, 5.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[222].setRotationPoint(-40.5F, -20.25F, 6.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[223].setRotationPoint(-40.5F, -20.25F, 5.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[224].setRotationPoint(44.5F, -20.25F, -9.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[225].setRotationPoint(44.5F, -20.25F, -6.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[226].setRotationPoint(-40.5F, -20.25F, -9.25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[227].setRotationPoint(-40.5F, -20.25F, -6.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[228].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[229].setRotationPoint(60.5F, -6F, -12F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[230].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[231].setRotationPoint(60.5F, -6F, 11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[232].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[233].setRotationPoint(-56.5F, -6F, -12F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[234].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[235].setRotationPoint(-56.5F, -6F, 11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[236].setRotationPoint(-60.5F, 5.5F, 7.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[237].setRotationPoint(-60.5F, 5.5F, 8.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[238].setRotationPoint(-60.5F, 5.5F, -9.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[239].setRotationPoint(-60.5F, 5.5F, -8.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[240].setRotationPoint(56.5F, 5.5F, 7.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[241].setRotationPoint(56.5F, 5.5F, 8.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[242].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[243].setRotationPoint(56.5F, 5.5F, -8.75F);

		bodyModel[244].addBox(0F, 0F, 0F, 11, 4, 5, 0F); // Box 2
		bodyModel[244].setRotationPoint(-17.5F, 3F, -9.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 2
		bodyModel[245].setRotationPoint(7.5F, 3F, 4.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[246].setRotationPoint(1.5F, 3F, 7.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 2
		bodyModel[247].setRotationPoint(22.5F, 3F, 9.49F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[248].setRotationPoint(-31.5F, 4F, 0F);
		bodyModel[248].rotateAngleX = -0.78539816F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[249].setRotationPoint(-31.51F, 4F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[250].setRotationPoint(-25.49F, 4F, -0.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[251].setRotationPoint(7.5F, 3F, -9.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 317
		bodyModel[252].setRotationPoint(4.5F, 3F, -9.49F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[253].setRotationPoint(-5.5F, 3F, -9.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 41
		bodyModel[254].setRotationPoint(-3.5F, 3.34F, -3F);
		bodyModel[254].rotateAngleX = -0.78539816F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[255].setRotationPoint(-3.51F, 3F, -3.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[256].setRotationPoint(1.51F, 3F, -3.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 41
		bodyModel[257].setRotationPoint(-9.5F, 2.75F, 6.5F);
		bodyModel[257].rotateAngleX = -0.78539816F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[258].setRotationPoint(-9.51F, 3F, 6F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[259].setRotationPoint(-4.49F, 3F, 6F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[260].setRotationPoint(48.5F, -15F, 4F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[261].setRotationPoint(53.5F, -15F, 4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[262].setRotationPoint(54.05F, -2F, 9.95F);
		bodyModel[262].rotateAngleY = -2.35619449F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[263].setRotationPoint(54.4F, -1F, 9.6F);
		bodyModel[263].rotateAngleY = -2.35619449F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[264].setRotationPoint(54.05F, 0.5F, 9.95F);
		bodyModel[264].rotateAngleY = -2.35619449F;

		bodyModel[265].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 365
		bodyModel[265].setRotationPoint(48.5F, -15F, -5F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 366
		bodyModel[266].setRotationPoint(53.5F, -15F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[267].setRotationPoint(53.15F, -1F, -8.35F);
		bodyModel[267].rotateAngleY = -0.78539816F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[268].setRotationPoint(52.45F, 0.5F, -8.35F);
		bodyModel[268].rotateAngleY = -0.78539816F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[269].setRotationPoint(51.55F, -2F, -8.9F);
		bodyModel[269].rotateAngleY = -0.78539816F;

		bodyModel[270].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 128
		bodyModel[270].setRotationPoint(48.5F, -8.5F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[271].setRotationPoint(-55.5F, -15F, 9.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 111, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[272].setRotationPoint(-55.5F, -15F, -10.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[273].setRotationPoint(48.5F, -6F, 5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 128
		bodyModel[274].setRotationPoint(48.5F, -2.4F, 5F);
		bodyModel[274].rotateAngleZ = 1.04719755F;

		bodyModel[275].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[275].setRotationPoint(49.75F, -5F, 7.5F);
		bodyModel[275].rotateAngleY = -0.78539816F;

		bodyModel[276].addBox(0F, 0F, 0F, 1, 0, 5, 0F); // Box 379
		bodyModel[276].setRotationPoint(48.5F, -8.5F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[277].setRotationPoint(48.5F, -6F, -10F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 0, 5, 0F); // Box 381
		bodyModel[278].setRotationPoint(48.5F, -2.4F, -10F);
		bodyModel[278].rotateAngleZ = 1.04719755F;

		bodyModel[279].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[279].setRotationPoint(49.75F, -5F, -7.5F);
		bodyModel[279].rotateAngleY = -0.78539816F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86 glow
		bodyModel[280].setRotationPoint(50.5F, -14.99F, -7.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384 glow
		bodyModel[281].setRotationPoint(50.5F, -14.99F, 6.5F);

		bodyModel[282].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[282].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[283].setRotationPoint(43.5F, -8F, 7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[284].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[285].setRotationPoint(43.5F, -8F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[286].setRotationPoint(42F, -1F, 5F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[287].setRotationPoint(42F, -1F, -9F);

		bodyModel[288].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[288].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(43.5F, -3F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[291].setRotationPoint(43.5F, -3F, -7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[292].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(34.5F, -8F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[294].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(34.5F, -8F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[296].setRotationPoint(33F, -1F, 5F);

		bodyModel[297].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[297].setRotationPoint(33F, -1F, -9F);

		bodyModel[298].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[298].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[299].setRotationPoint(34.5F, -3F, 7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[300].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[301].setRotationPoint(34.5F, -3F, -7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[302].setRotationPoint(25.5F, -3F, 7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[303].setRotationPoint(25.5F, -8F, 7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[304].setRotationPoint(25.5F, -3F, -7F);
		bodyModel[304].rotateAngleY = -3.14159265F;

		bodyModel[305].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[305].setRotationPoint(25.5F, -8F, -7F);
		bodyModel[305].rotateAngleY = -3.14159265F;

		bodyModel[306].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[306].setRotationPoint(24F, -1F, 5F);

		bodyModel[307].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[307].setRotationPoint(24F, -1F, -9F);

		bodyModel[308].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[308].setRotationPoint(25.5F, -3F, 7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[309].setRotationPoint(25.5F, -3F, 7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[310].setRotationPoint(25.5F, -3F, -7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[311].setRotationPoint(25.5F, -3F, -7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[312].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[313].setRotationPoint(16.5F, -8F, 7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[314].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[315].setRotationPoint(16.5F, -8F, -7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[316].setRotationPoint(15F, -1F, 5F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[317].setRotationPoint(15F, -1F, -9F);

		bodyModel[318].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[318].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[319].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[319].rotateAngleY = -3.14159265F;

		bodyModel[320].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[320].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[321].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[322].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[323].setRotationPoint(7.5F, -8F, 7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[324].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[325].setRotationPoint(7.5F, -8F, -7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[326].setRotationPoint(6F, -1F, 5F);

		bodyModel[327].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[327].setRotationPoint(6F, -1F, -9F);

		bodyModel[328].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[328].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[328].rotateAngleY = -3.14159265F;

		bodyModel[329].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[329].setRotationPoint(7.5F, -3F, 7F);
		bodyModel[329].rotateAngleY = -3.14159265F;

		bodyModel[330].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[330].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[330].rotateAngleY = -3.14159265F;

		bodyModel[331].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[331].setRotationPoint(7.5F, -3F, -7F);
		bodyModel[331].rotateAngleY = -3.14159265F;

		bodyModel[332].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[332].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[332].rotateAngleY = -3.14159265F;

		bodyModel[333].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[333].setRotationPoint(-1.5F, -8F, 7F);
		bodyModel[333].rotateAngleY = -3.14159265F;

		bodyModel[334].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[334].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[334].rotateAngleY = -3.14159265F;

		bodyModel[335].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[335].setRotationPoint(-1.5F, -8F, -7F);
		bodyModel[335].rotateAngleY = -3.14159265F;

		bodyModel[336].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[336].setRotationPoint(-3F, -1F, 5F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[337].setRotationPoint(-3F, -1F, -9F);

		bodyModel[338].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[338].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[338].rotateAngleY = -3.14159265F;

		bodyModel[339].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[339].setRotationPoint(-1.5F, -3F, 7F);
		bodyModel[339].rotateAngleY = -3.14159265F;

		bodyModel[340].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[340].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[340].rotateAngleY = -3.14159265F;

		bodyModel[341].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[341].setRotationPoint(-1.5F, -3F, -7F);
		bodyModel[341].rotateAngleY = -3.14159265F;

		bodyModel[342].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[342].setRotationPoint(-10.5F, -3F, 7F);
		bodyModel[342].rotateAngleY = -3.14159265F;

		bodyModel[343].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[343].setRotationPoint(-10.5F, -8F, 7F);
		bodyModel[343].rotateAngleY = -3.14159265F;

		bodyModel[344].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[344].setRotationPoint(-10.5F, -3F, -7F);
		bodyModel[344].rotateAngleY = -3.14159265F;

		bodyModel[345].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[345].setRotationPoint(-10.5F, -8F, -7F);
		bodyModel[345].rotateAngleY = -3.14159265F;

		bodyModel[346].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[346].setRotationPoint(-12F, -1F, 5F);

		bodyModel[347].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[347].setRotationPoint(-12F, -1F, -9F);

		bodyModel[348].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[348].setRotationPoint(-10.5F, -3F, 7F);
		bodyModel[348].rotateAngleY = -3.14159265F;

		bodyModel[349].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[349].setRotationPoint(-10.5F, -3F, 7F);
		bodyModel[349].rotateAngleY = -3.14159265F;

		bodyModel[350].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[350].setRotationPoint(-10.5F, -3F, -7F);
		bodyModel[350].rotateAngleY = -3.14159265F;

		bodyModel[351].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[351].setRotationPoint(-10.5F, -3F, -7F);
		bodyModel[351].rotateAngleY = -3.14159265F;

		bodyModel[352].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[352].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[352].rotateAngleY = -3.14159265F;

		bodyModel[353].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[353].setRotationPoint(-19.5F, -8F, 7F);
		bodyModel[353].rotateAngleY = -3.14159265F;

		bodyModel[354].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[354].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[354].rotateAngleY = -3.14159265F;

		bodyModel[355].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[355].setRotationPoint(-19.5F, -8F, -7F);
		bodyModel[355].rotateAngleY = -3.14159265F;

		bodyModel[356].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[356].setRotationPoint(-21F, -1F, 5F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[357].setRotationPoint(-21F, -1F, -9F);

		bodyModel[358].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[358].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[358].rotateAngleY = -3.14159265F;

		bodyModel[359].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[359].setRotationPoint(-19.5F, -3F, 7F);
		bodyModel[359].rotateAngleY = -3.14159265F;

		bodyModel[360].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[360].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[360].rotateAngleY = -3.14159265F;

		bodyModel[361].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[361].setRotationPoint(-19.5F, -3F, -7F);
		bodyModel[361].rotateAngleY = -3.14159265F;

		bodyModel[362].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[362].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[362].rotateAngleY = -3.14159265F;

		bodyModel[363].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[363].setRotationPoint(-28.5F, -8F, 7F);
		bodyModel[363].rotateAngleY = -3.14159265F;

		bodyModel[364].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[364].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[364].rotateAngleY = -3.14159265F;

		bodyModel[365].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[365].setRotationPoint(-28.5F, -8F, -7F);
		bodyModel[365].rotateAngleY = -3.14159265F;

		bodyModel[366].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[366].setRotationPoint(-30F, -1F, 5F);

		bodyModel[367].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[367].setRotationPoint(-30F, -1F, -9F);

		bodyModel[368].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[368].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[368].rotateAngleY = -3.14159265F;

		bodyModel[369].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[369].setRotationPoint(-28.5F, -3F, 7F);
		bodyModel[369].rotateAngleY = -3.14159265F;

		bodyModel[370].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[370].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[370].rotateAngleY = -3.14159265F;

		bodyModel[371].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[371].setRotationPoint(-28.5F, -3F, -7F);
		bodyModel[371].rotateAngleY = -3.14159265F;

		bodyModel[372].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[372].setRotationPoint(-37.5F, -3F, 7F);
		bodyModel[372].rotateAngleY = -3.14159265F;

		bodyModel[373].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[373].setRotationPoint(-37.5F, -8F, 7F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[374].setRotationPoint(-37.5F, -3F, -7F);
		bodyModel[374].rotateAngleY = -3.14159265F;

		bodyModel[375].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[375].setRotationPoint(-37.5F, -8F, -7F);
		bodyModel[375].rotateAngleY = -3.14159265F;

		bodyModel[376].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[376].setRotationPoint(-39F, -1F, 5F);

		bodyModel[377].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[377].setRotationPoint(-39F, -1F, -9F);

		bodyModel[378].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[378].setRotationPoint(-37.5F, -3F, 7F);
		bodyModel[378].rotateAngleY = -3.14159265F;

		bodyModel[379].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[379].setRotationPoint(-37.5F, -3F, 7F);
		bodyModel[379].rotateAngleY = -3.14159265F;

		bodyModel[380].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[380].setRotationPoint(-37.5F, -3F, -7F);
		bodyModel[380].rotateAngleY = -3.14159265F;

		bodyModel[381].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[381].setRotationPoint(-37.5F, -3F, -7F);
		bodyModel[381].rotateAngleY = -3.14159265F;

		bodyModel[382].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[382].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[383].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate closed
		bodyModel[384].setRotationPoint(-61.5F, -7F, -3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front gate open
		bodyModel[385].setRotationPoint(-61.5F, -7F, 2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384 glow
		bodyModel[386].setRotationPoint(-55.5F, -13.99F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[387].setRotationPoint(-55.5F, -13.99F, 6F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 89, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 384
		bodyModel[388].setRotationPoint(-41.5F, -17.49F, -1F);

		bodyModel[389].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[389].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[389].rotateAngleY = -3.14159265F;

		bodyModel[390].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[390].setRotationPoint(-46.5F, -8F, 7F);
		bodyModel[390].rotateAngleY = -3.14159265F;

		bodyModel[391].addBox(-3F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[391].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[391].rotateAngleY = -3.14159265F;

		bodyModel[392].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[392].setRotationPoint(-46.5F, -8F, -7F);
		bodyModel[392].rotateAngleY = -3.14159265F;

		bodyModel[393].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[393].setRotationPoint(-48F, -1F, 5F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[394].setRotationPoint(-48F, -1F, -9F);

		bodyModel[395].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[395].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[395].rotateAngleY = -3.14159265F;

		bodyModel[396].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[396].setRotationPoint(-46.5F, -3F, 7F);
		bodyModel[396].rotateAngleY = -3.14159265F;

		bodyModel[397].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[397].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[397].rotateAngleY = -3.14159265F;

		bodyModel[398].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[398].setRotationPoint(-46.5F, -3F, -7F);
		bodyModel[398].rotateAngleY = -3.14159265F;

		bodyModel[399].addBox(0F, 0F, 0F, 91, 5, 1, 0F); // Box 128
		bodyModel[399].setRotationPoint(-47F, -11F, 10F);

		bodyModel[400].addBox(0F, 0F, 0F, 91, 5, 1, 0F); // Box 1083
		bodyModel[400].setRotationPoint(-47F, -11F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[401].setRotationPoint(-55.5F, -11F, -9.9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 103, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[402].setRotationPoint(-55.5F, -11F, 9.9F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 128
		bodyModel[403].setRotationPoint(-61.5F, -19F, -4F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[404].setRotationPoint(-61.5F, -20F, -3F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3625F, 0F, 0F, -0.3625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[405].setRotationPoint(-61.5F, -20F, -4F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3625F, 0F, 0F, -0.3625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[406].setRotationPoint(-61.5F, -20F, 3F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 128
		bodyModel[407].setRotationPoint(60.5F, -19F, -4F);

		bodyModel[408].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[408].setRotationPoint(60.5F, -20F, -3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3625F, 0F, 0F, -0.3625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[409].setRotationPoint(60.5F, -20F, -4F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3625F, 0F, 0F, -0.3625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[410].setRotationPoint(60.5F, -20F, 3F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.32F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.32F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[411].setRotationPoint(60.5F, -18F, 4F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.0025F, 0F, 0F, -0.0025F, 0F, -0.32F, -1.64F, -0.5F, 0F, -1.64F, -0.5F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, -0.32F, -0.36F, -0.5F, 0F, -0.36F, -0.5F); // Box 128
		bodyModel[412].setRotationPoint(60.5F, -19.64F, 4F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, -0.5F, -0.32F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.32F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[413].setRotationPoint(60.5F, -18F, -9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.64F, -0.5F, -0.32F, -1.64F, -0.5F, 0F, -0.0025F, 0F, 0F, -0.0025F, 0F, 0F, -0.36F, -0.5F, -0.32F, -0.36F, -0.5F, 0F, -0.36F, 0F, 0F, -0.36F, 0F); // Box 537
		bodyModel[414].setRotationPoint(60.5F, -19.64F, -9F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.32F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.32F, 0F, -0.5F); // Box 128
		bodyModel[415].setRotationPoint(-61.5F, -18F, 4F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.0025F, 0F, 0F, -0.0025F, 0F, 0F, -1.64F, -0.5F, -0.32F, -1.64F, -0.5F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, -0.5F, -0.32F, -0.36F, -0.5F); // Box 128
		bodyModel[416].setRotationPoint(-61.5F, -19.64F, 4F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.32F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.32F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[417].setRotationPoint(-61.5F, -18F, -9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.32F, -1.64F, -0.5F, 0F, -1.64F, -0.5F, 0F, -0.0025F, 0F, 0F, -0.0025F, 0F, -0.32F, -0.36F, -0.5F, 0F, -0.36F, -0.5F, 0F, -0.36F, 0F, 0F, -0.36F, 0F); // Box 541
		bodyModel[418].setRotationPoint(-61.5F, -19.64F, -9F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[419].setRotationPoint(50.5F, -20.25F, 6.25F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[420].setRotationPoint(50.5F, -20.25F, 5.75F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[421].setRotationPoint(50.5F, -20.25F, -9.25F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[422].setRotationPoint(50.5F, -20.25F, -6.75F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 317
		bodyModel[423].setRotationPoint(-2.5F, 3F, -9.49F);

		bodyModel[424].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 2
		bodyModel[424].setRotationPoint(-0.5F, 3F, -9.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 41
		bodyModel[425].setRotationPoint(-3.5F, 3.34F, 3F);
		bodyModel[425].rotateAngleX = -0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[426].setRotationPoint(-3.51F, 3F, 2.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[427].setRotationPoint(1.51F, 3F, 2.5F);

		bodyModel[428].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[428].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[428].rotateAngleY = -3.14159265F;

		bodyModel[429].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[429].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[429].rotateAngleY = -3.14159265F;

		bodyModel[430].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[430].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(25.5F, -5F, 7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[433].setRotationPoint(25.5F, -5F, 7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[434].setRotationPoint(25.5F, -5F, -7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[435].setRotationPoint(25.5F, -5F, -7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[437].setRotationPoint(34.5F, -5F, 7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[438].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[439].setRotationPoint(34.5F, -5F, -7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[440].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[441].setRotationPoint(43.5F, -5F, 7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[443].setRotationPoint(43.5F, -5F, -7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[444].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[445].setRotationPoint(7.5F, -5F, 7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(7.5F, -5F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[448].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[448].rotateAngleY = -3.14159265F;

		bodyModel[449].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[449].setRotationPoint(-1.5F, -5F, 7F);
		bodyModel[449].rotateAngleY = -3.14159265F;

		bodyModel[450].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[450].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[451].setRotationPoint(-1.5F, -5F, -7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[452].setRotationPoint(-10.5F, -5F, 7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[453].setRotationPoint(-10.5F, -5F, 7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[454].setRotationPoint(-10.5F, -5F, -7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[455].setRotationPoint(-10.5F, -5F, -7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[456].setRotationPoint(-10.5F, -4.5F, 7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(-10.5F, -4.5F, -7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[458].setRotationPoint(-10.5F, -4.5F, -7F);
		bodyModel[458].rotateAngleY = -3.14159265F;

		bodyModel[459].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[459].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[459].rotateAngleY = -3.14159265F;

		bodyModel[460].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[460].setRotationPoint(-19.5F, -5F, 7F);
		bodyModel[460].rotateAngleY = -3.14159265F;

		bodyModel[461].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[461].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[461].rotateAngleY = -3.14159265F;

		bodyModel[462].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[462].setRotationPoint(-19.5F, -5F, -7F);
		bodyModel[462].rotateAngleY = -3.14159265F;

		bodyModel[463].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[463].setRotationPoint(-28.5F, -5F, 7F);
		bodyModel[463].rotateAngleY = -3.14159265F;

		bodyModel[464].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[464].setRotationPoint(-28.5F, -5F, 7F);
		bodyModel[464].rotateAngleY = -3.14159265F;

		bodyModel[465].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[465].setRotationPoint(-28.5F, -5F, -7F);
		bodyModel[465].rotateAngleY = -3.14159265F;

		bodyModel[466].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[466].setRotationPoint(-28.5F, -5F, -7F);
		bodyModel[466].rotateAngleY = -3.14159265F;

		bodyModel[467].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[467].setRotationPoint(-37.5F, -5F, 7F);
		bodyModel[467].rotateAngleY = -3.14159265F;

		bodyModel[468].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[468].setRotationPoint(-37.5F, -5F, 7F);
		bodyModel[468].rotateAngleY = -3.14159265F;

		bodyModel[469].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[469].setRotationPoint(-37.5F, -5F, -7F);
		bodyModel[469].rotateAngleY = -3.14159265F;

		bodyModel[470].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[470].setRotationPoint(-37.5F, -5F, -7F);
		bodyModel[470].rotateAngleY = -3.14159265F;

		bodyModel[471].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[471].setRotationPoint(-46.5F, -5F, 7F);
		bodyModel[471].rotateAngleY = -3.14159265F;

		bodyModel[472].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[472].setRotationPoint(-46.5F, -5F, 7F);
		bodyModel[472].rotateAngleY = -3.14159265F;

		bodyModel[473].addShapeBox(-2F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[473].setRotationPoint(-46.5F, -5F, -7F);
		bodyModel[473].rotateAngleY = -3.14159265F;

		bodyModel[474].addShapeBox(-2F, 0F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[474].setRotationPoint(-46.5F, -5F, -7F);
		bodyModel[474].rotateAngleY = -3.14159265F;

		bodyModel[475].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 128
		bodyModel[475].setRotationPoint(-42.5F, -13F, -10F);

		bodyModel[476].addBox(0F, 0F, 0F, 1, 2, 15, 0F); // Box 128
		bodyModel[476].setRotationPoint(-42.5F, -15F, -9F);

		bodyModel[477].addBox(0F, 0F, 0F, 19, 1, 6, 0F); // Box 128
		bodyModel[477].setRotationPoint(-60.5F, -18F, -3F);

		bodyModel[478].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 128
		bodyModel[478].setRotationPoint(47.5F, -18F, -3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 85, 1, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.005F, 0F, 0F, -0.005F); // Box 386 cull
		bodyModel[479].setRotationPoint(-37.5F, -12.98F, 7F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 89, 1, 3, 0F,-0.01F, 0F, -0.165F, -0.01F, 0F, -0.165F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.005F, -0.01F, 0F, -0.005F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 658 cull
		bodyModel[480].setRotationPoint(-41.5F, -12.98F, -10F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 89, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384 glow
		bodyModel[481].setRotationPoint(-41.5F, -18F, -3F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[482].setRotationPoint(-42.5F, -15F, -10F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 88, 1, 3, 0F,-0.01F, 0F, -0.165F, -0.01F, 0F, -0.165F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.005F, -0.01F, 0F, -0.005F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 658 cull
		bodyModel[483].setRotationPoint(-41F, -12.98F, -10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 85, 1, 3, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.005F, 0F, 0F, -0.005F); // Box 664 cull
		bodyModel[484].setRotationPoint(-38F, -12.98F, 7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[485].setRotationPoint(48.5F, -20F, -8.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[486].setRotationPoint(48.5F, -19F, -9F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 91, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Box 128
		bodyModel[487].setRotationPoint(-42.5F, -20F, -8.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[488].setRotationPoint(-42.5F, -18F, -8.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[489].setRotationPoint(47.5F, -18F, -8.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[490].setRotationPoint(-41.5F, -18F, -8.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 168
		bodyModel[491].setRotationPoint(48.5F, -20F, 3F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[492].setRotationPoint(48.5F, -19F, 3F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 91, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 675
		bodyModel[493].setRotationPoint(-42.5F, -20F, 2.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[494].setRotationPoint(-42.5F, -18F, 2.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[495].setRotationPoint(47.5F, -18F, 2.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 89, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[496].setRotationPoint(-41.5F, -18F, 7.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.165F, -0.01F, 0F, -0.165F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.005F, -0.01F, 0F, -0.005F); // Box 386 cull
		bodyModel[497].setRotationPoint(-41.5F, -12.98F, 7F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[498].setRotationPoint(-40.25F, -17.5F, -4.25F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[499].setRotationPoint(-35.75F, -17.5F, -7.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 195, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[501] = new ModelRendererTurbo(this, 233, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[502] = new ModelRendererTurbo(this, 271, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[503] = new ModelRendererTurbo(this, 380, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[504] = new ModelRendererTurbo(this, 418, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[505] = new ModelRendererTurbo(this, 456, 205, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[506] = new ModelRendererTurbo(this, 380, 224, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[507] = new ModelRendererTurbo(this, 418, 224, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[508] = new ModelRendererTurbo(this, 456, 224, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[509] = new ModelRendererTurbo(this, 380, 243, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[510] = new ModelRendererTurbo(this, 418, 243, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[511] = new ModelRendererTurbo(this, 456, 243, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[512] = new ModelRendererTurbo(this, 380, 262, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[513] = new ModelRendererTurbo(this, 418, 262, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[514] = new ModelRendererTurbo(this, 456, 262, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[515] = new ModelRendererTurbo(this, 418, 281, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[516] = new ModelRendererTurbo(this, 456, 281, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[517] = new ModelRendererTurbo(this, 176, 207, textureX, textureY); // Box 128
		bodyModel[518] = new ModelRendererTurbo(this, 214, 207, textureX, textureY); // Box 128
		bodyModel[519] = new ModelRendererTurbo(this, 252, 207, textureX, textureY); // Box 128
		bodyModel[520] = new ModelRendererTurbo(this, 361, 207, textureX, textureY); // Box 128
		bodyModel[521] = new ModelRendererTurbo(this, 399, 207, textureX, textureY); // Box 128
		bodyModel[522] = new ModelRendererTurbo(this, 437, 207, textureX, textureY); // Box 128
		bodyModel[523] = new ModelRendererTurbo(this, 361, 226, textureX, textureY); // Box 128
		bodyModel[524] = new ModelRendererTurbo(this, 399, 226, textureX, textureY); // Box 128
		bodyModel[525] = new ModelRendererTurbo(this, 437, 226, textureX, textureY); // Box 128
		bodyModel[526] = new ModelRendererTurbo(this, 361, 245, textureX, textureY); // Box 128
		bodyModel[527] = new ModelRendererTurbo(this, 399, 245, textureX, textureY); // Box 128
		bodyModel[528] = new ModelRendererTurbo(this, 437, 245, textureX, textureY); // Box 128
		bodyModel[529] = new ModelRendererTurbo(this, 361, 264, textureX, textureY); // Box 128
		bodyModel[530] = new ModelRendererTurbo(this, 399, 264, textureX, textureY); // Box 128
		bodyModel[531] = new ModelRendererTurbo(this, 437, 264, textureX, textureY); // Box 128
		bodyModel[532] = new ModelRendererTurbo(this, 399, 283, textureX, textureY); // Box 128
		bodyModel[533] = new ModelRendererTurbo(this, 437, 283, textureX, textureY); // Box 128
		bodyModel[534] = new ModelRendererTurbo(this, 430, 307, textureX, textureY); // Box 128
		bodyModel[535] = new ModelRendererTurbo(this, 418, 305, textureX, textureY,"lamp"); // Box 128 glow
		bodyModel[536] = new ModelRendererTurbo(this, 406, 307, textureX, textureY); // Box 128
		bodyModel[537] = new ModelRendererTurbo(this, 418, 308, textureX, textureY); // Box 128
		bodyModel[538] = new ModelRendererTurbo(this, 430, 318, textureX, textureY); // Box 128
		bodyModel[539] = new ModelRendererTurbo(this, 418, 302, textureX, textureY); // Box 668
		bodyModel[540] = new ModelRendererTurbo(this, 430, 302, textureX, textureY); // Box 669
		bodyModel[541] = new ModelRendererTurbo(this, 128, 209, textureX, textureY); // Box 128
		bodyModel[542] = new ModelRendererTurbo(this, 152, 209, textureX, textureY); // Box 128
		bodyModel[543] = new ModelRendererTurbo(this, 152, 210, textureX, textureY); // Box 128
		bodyModel[544] = new ModelRendererTurbo(this, 152, 203, textureX, textureY); // Box 668
		bodyModel[545] = new ModelRendererTurbo(this, 134, 204, textureX, textureY); // Box 669
		bodyModel[546] = new ModelRendererTurbo(this, 134, 220, textureX, textureY); // Box 128
		bodyModel[547] = new ModelRendererTurbo(this, 333, 41, textureX, textureY); // Box 669
		bodyModel[548] = new ModelRendererTurbo(this, 333, 23, textureX, textureY); // Box 669
		bodyModel[549] = new ModelRendererTurbo(this, 104, 277, textureX, textureY); // Right seat part
		bodyModel[550] = new ModelRendererTurbo(this, 87, 295, textureX, textureY); // Right seat part
		bodyModel[551] = new ModelRendererTurbo(this, 87, 330, textureX, textureY); // Left seat part
		bodyModel[552] = new ModelRendererTurbo(this, 76, 312, textureX, textureY); // Left seat part
		bodyModel[553] = new ModelRendererTurbo(this, 76, 277, textureX, textureY); // Right seat part
		bodyModel[554] = new ModelRendererTurbo(this, 59, 295, textureX, textureY); // Right seat part
		bodyModel[555] = new ModelRendererTurbo(this, 59, 330, textureX, textureY); // Left seat part
		bodyModel[556] = new ModelRendererTurbo(this, 48, 312, textureX, textureY); // Left seat part
		bodyModel[557] = new ModelRendererTurbo(this, 48, 277, textureX, textureY); // Right seat part
		bodyModel[558] = new ModelRendererTurbo(this, 31, 295, textureX, textureY); // Right seat part
		bodyModel[559] = new ModelRendererTurbo(this, 31, 330, textureX, textureY); // Left seat part
		bodyModel[560] = new ModelRendererTurbo(this, 20, 312, textureX, textureY); // Left seat part
		bodyModel[561] = new ModelRendererTurbo(this, 20, 277, textureX, textureY); // Right seat part
		bodyModel[562] = new ModelRendererTurbo(this, 16, 359, textureX, textureY); // Right seat part
		bodyModel[563] = new ModelRendererTurbo(this, 16, 394, textureX, textureY); // Left seat part
		bodyModel[564] = new ModelRendererTurbo(this, 5, 376, textureX, textureY); // Left seat part
		bodyModel[565] = new ModelRendererTurbo(this, 5, 341, textureX, textureY); // Right seat part
		bodyModel[566] = new ModelRendererTurbo(this, 143, 295, textureX, textureY); // Right seat part
		bodyModel[567] = new ModelRendererTurbo(this, 143, 330, textureX, textureY); // Left seat part
		bodyModel[568] = new ModelRendererTurbo(this, 132, 312, textureX, textureY); // Left seat part
		bodyModel[569] = new ModelRendererTurbo(this, 132, 277, textureX, textureY); // Right seat part
		bodyModel[570] = new ModelRendererTurbo(this, 171, 295, textureX, textureY); // Right seat part
		bodyModel[571] = new ModelRendererTurbo(this, 171, 330, textureX, textureY); // Left seat part
		bodyModel[572] = new ModelRendererTurbo(this, 160, 312, textureX, textureY); // Left seat part
		bodyModel[573] = new ModelRendererTurbo(this, 160, 277, textureX, textureY); // Right seat part
		bodyModel[574] = new ModelRendererTurbo(this, 199, 295, textureX, textureY); // Right seat part
		bodyModel[575] = new ModelRendererTurbo(this, 199, 330, textureX, textureY); // Left seat part
		bodyModel[576] = new ModelRendererTurbo(this, 188, 312, textureX, textureY); // Left seat part
		bodyModel[577] = new ModelRendererTurbo(this, 188, 277, textureX, textureY); // Right seat part
		bodyModel[578] = new ModelRendererTurbo(this, 227, 295, textureX, textureY); // Right seat part
		bodyModel[579] = new ModelRendererTurbo(this, 227, 330, textureX, textureY); // Left seat part
		bodyModel[580] = new ModelRendererTurbo(this, 216, 312, textureX, textureY); // Left seat part
		bodyModel[581] = new ModelRendererTurbo(this, 216, 277, textureX, textureY); // Right seat part
		bodyModel[582] = new ModelRendererTurbo(this, 255, 295, textureX, textureY); // Right seat part
		bodyModel[583] = new ModelRendererTurbo(this, 255, 330, textureX, textureY); // Left seat part
		bodyModel[584] = new ModelRendererTurbo(this, 244, 312, textureX, textureY); // Left seat part
		bodyModel[585] = new ModelRendererTurbo(this, 244, 277, textureX, textureY); // Right seat part
		bodyModel[586] = new ModelRendererTurbo(this, 283, 295, textureX, textureY); // Right seat part
		bodyModel[587] = new ModelRendererTurbo(this, 283, 330, textureX, textureY); // Left seat part
		bodyModel[588] = new ModelRendererTurbo(this, 272, 312, textureX, textureY); // Left seat part
		bodyModel[589] = new ModelRendererTurbo(this, 272, 277, textureX, textureY); // Right seat part
		bodyModel[590] = new ModelRendererTurbo(this, 13, 414, textureX, textureY); // Box 128
		bodyModel[591] = new ModelRendererTurbo(this, 14, 404, textureX, textureY); // Box 128
		bodyModel[592] = new ModelRendererTurbo(this, 16, 407, textureX, textureY); // Box 95
		bodyModel[593] = new ModelRendererTurbo(this, 2, 419, textureX, textureY); // Box 128
		bodyModel[594] = new ModelRendererTurbo(this, 32, 419, textureX, textureY); // Box 128
		bodyModel[595] = new ModelRendererTurbo(this, 37, 412, textureX, textureY); // Box 128
		bodyModel[596] = new ModelRendererTurbo(this, 63, 353, textureX, textureY); // Box 128
		bodyModel[597] = new ModelRendererTurbo(this, 331, 310, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[598] = new ModelRendererTurbo(this, 12, 206, textureX, textureY); // Box 128
		bodyModel[599] = new ModelRendererTurbo(this, 28, 228, textureX, textureY); // Box 128
		bodyModel[600] = new ModelRendererTurbo(this, 24, 234, textureX, textureY); // Box 128
		bodyModel[601] = new ModelRendererTurbo(this, 31, 244, textureX, textureY); // Box 128
		bodyModel[602] = new ModelRendererTurbo(this, 41, 234, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[603] = new ModelRendererTurbo(this, 30, 247, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[604] = new ModelRendererTurbo(this, 372, 328, textureX, textureY); // Box 102
		bodyModel[605] = new ModelRendererTurbo(this, 389, 328, textureX, textureY); // Box 102
		bodyModel[606] = new ModelRendererTurbo(this, 57, 416, textureX, textureY); // Box 379
		bodyModel[607] = new ModelRendererTurbo(this, 56, 420, textureX, textureY); // Box 380
		bodyModel[608] = new ModelRendererTurbo(this, 55, 425, textureX, textureY); // Box 381
		bodyModel[609] = new ModelRendererTurbo(this, 59, 429, textureX, textureY); // Box 382
		bodyModel[610] = new ModelRendererTurbo(this, 1, 406, textureX, textureY); // Box 38
		bodyModel[611] = new ModelRendererTurbo(this, 4, 411, textureX, textureY); // Box 38
		bodyModel[612] = new ModelRendererTurbo(this, 3, 415, textureX, textureY); // Box 38
		bodyModel[613] = new ModelRendererTurbo(this, 37, 403, textureX, textureY); // Box 380
		bodyModel[614] = new ModelRendererTurbo(this, 38, 375, textureX, textureY); // Box 38
		bodyModel[615] = new ModelRendererTurbo(this, 38, 381, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[616] = new ModelRendererTurbo(this, 38, 389, textureX, textureY); // Box 38
		bodyModel[617] = new ModelRendererTurbo(this, 38, 395, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[618] = new ModelRendererTurbo(this, 64, 431, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[619] = new ModelRendererTurbo(this, 67, 416, textureX, textureY); // Box 526
		bodyModel[620] = new ModelRendererTurbo(this, 58, 405, textureX, textureY); // Box 527
		bodyModel[621] = new ModelRendererTurbo(this, 73, 425, textureX, textureY); // Box 531
		bodyModel[622] = new ModelRendererTurbo(this, 78, 414, textureX, textureY); // Box 532
		bodyModel[623] = new ModelRendererTurbo(this, 73, 404, textureX, textureY); // Box 531
		bodyModel[624] = new ModelRendererTurbo(this, 67, 383, textureX, textureY); // Box 526
		bodyModel[625] = new ModelRendererTurbo(this, 58, 372, textureX, textureY); // Box 527
		bodyModel[626] = new ModelRendererTurbo(this, 73, 392, textureX, textureY); // Box 531
		bodyModel[627] = new ModelRendererTurbo(this, 78, 381, textureX, textureY); // Box 532
		bodyModel[628] = new ModelRendererTurbo(this, 73, 371, textureX, textureY); // Box 531
		bodyModel[629] = new ModelRendererTurbo(this, 31, 357, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[630] = new ModelRendererTurbo(this, 33, 367, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[631] = new ModelRendererTurbo(this, 29, 358, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[632] = new ModelRendererTurbo(this, 3, 403, textureX, textureY,"lamp"); // Box 86 glow
		bodyModel[633] = new ModelRendererTurbo(this, 145, 395, textureX, textureY); // Box 128
		bodyModel[634] = new ModelRendererTurbo(this, 153, 429, textureX, textureY); // Box 128
		bodyModel[635] = new ModelRendererTurbo(this, 153, 471, textureX, textureY); // Box 642
		bodyModel[636] = new ModelRendererTurbo(this, 144, 400, textureX, textureY); // Side door FR part
		bodyModel[637] = new ModelRendererTurbo(this, 144, 442, textureX, textureY); // Side door FL part
		bodyModel[638] = new ModelRendererTurbo(this, 380, 400, textureX, textureY); // Side door RR part
		bodyModel[639] = new ModelRendererTurbo(this, 380, 442, textureX, textureY); // Side door RL part
		bodyModel[640] = new ModelRendererTurbo(this, 153, 400, textureX, textureY); // Box 128
		bodyModel[641] = new ModelRendererTurbo(this, 153, 442, textureX, textureY); // Box 661
		bodyModel[642] = new ModelRendererTurbo(this, 133, 399, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[643] = new ModelRendererTurbo(this, 389, 399, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[644] = new ModelRendererTurbo(this, 133, 441, textureX, textureY,"cull"); // Box 664 cull
		bodyModel[645] = new ModelRendererTurbo(this, 389, 441, textureX, textureY,"cull"); // Box 665 cull
		bodyModel[646] = new ModelRendererTurbo(this, 128, 431, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[647] = new ModelRendererTurbo(this, 128, 395, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[648] = new ModelRendererTurbo(this, 128, 401, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[649] = new ModelRendererTurbo(this, 400, 431, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[650] = new ModelRendererTurbo(this, 400, 395, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[651] = new ModelRendererTurbo(this, 400, 401, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[652] = new ModelRendererTurbo(this, 128, 473, textureX, textureY,"cull"); // Box 674 cull
		bodyModel[653] = new ModelRendererTurbo(this, 128, 437, textureX, textureY,"cull"); // Box 675 cull
		bodyModel[654] = new ModelRendererTurbo(this, 128, 443, textureX, textureY,"cull"); // Box 676 cull
		bodyModel[655] = new ModelRendererTurbo(this, 400, 473, textureX, textureY,"cull"); // Box 677 cull
		bodyModel[656] = new ModelRendererTurbo(this, 400, 437, textureX, textureY,"cull"); // Box 678 cull
		bodyModel[657] = new ModelRendererTurbo(this, 400, 443, textureX, textureY,"cull"); // Box 679 cull
		bodyModel[658] = new ModelRendererTurbo(this, 145, 437, textureX, textureY); // Box 680
		bodyModel[659] = new ModelRendererTurbo(this, 428, 67, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[660] = new ModelRendererTurbo(this, 428, 70, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[661] = new ModelRendererTurbo(this, 35, 45, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[662] = new ModelRendererTurbo(this, 35, 48, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[663] = new ModelRendererTurbo(this, 428, 89, textureX, textureY,"cull"); // Box 685 cull
		bodyModel[664] = new ModelRendererTurbo(this, 428, 92, textureX, textureY,"cull"); // Box 686 cull
		bodyModel[665] = new ModelRendererTurbo(this, 35, 26, textureX, textureY,"cull"); // Box 687 cull
		bodyModel[666] = new ModelRendererTurbo(this, 35, 29, textureX, textureY,"cull"); // Box 688 cull
		bodyModel[667] = new ModelRendererTurbo(this, 93, 166, textureX, textureY); // Box 316
		bodyModel[668] = new ModelRendererTurbo(this, 206, 170, textureX, textureY); // Box 316
		bodyModel[669] = new ModelRendererTurbo(this, 64, 1, textureX, textureY); // Box 282
		bodyModel[670] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 283
		bodyModel[671] = new ModelRendererTurbo(this, 317, 315, textureX, textureY,"lamp"); // Box 86 glow
		bodyModel[672] = new ModelRendererTurbo(this, 321, 234, textureX, textureY); // Box 128
		bodyModel[673] = new ModelRendererTurbo(this, 112, 385, textureX, textureY,"cull"); // Box 386 cull

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[500].setRotationPoint(-31.25F, -17.5F, -7.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[501].setRotationPoint(-26.75F, -17.5F, -7.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[502].setRotationPoint(-22.25F, -17.5F, -7.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[503].setRotationPoint(-17.75F, -17.5F, -7.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[504].setRotationPoint(-13.25F, -17.5F, -7.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[505].setRotationPoint(-8.75F, -17.5F, -7.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[506].setRotationPoint(-4.25F, -17.5F, -7.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[507].setRotationPoint(0.25F, -17.5F, -7.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[508].setRotationPoint(4.75F, -17.5F, -7.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[509].setRotationPoint(9.25F, -17.5F, -7.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[510].setRotationPoint(13.75F, -17.5F, -7.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[511].setRotationPoint(18.25F, -17.5F, -7.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[512].setRotationPoint(22.75F, -17.5F, -7.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[513].setRotationPoint(27.25F, -17.5F, -7.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[514].setRotationPoint(31.75F, -17.5F, -7.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[515].setRotationPoint(36.25F, -17.5F, -7.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[516].setRotationPoint(40.75F, -17.5F, -7.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[517].setRotationPoint(-33.5F, -17.5F, -7.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[518].setRotationPoint(-29F, -17.5F, -7.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[519].setRotationPoint(-24.5F, -17.5F, -7.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[520].setRotationPoint(-20F, -17.5F, -7.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[521].setRotationPoint(-15.5F, -17.5F, -7.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[522].setRotationPoint(-11F, -17.5F, -7.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[523].setRotationPoint(-6.5F, -17.5F, -7.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[524].setRotationPoint(-2F, -17.5F, -7.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[525].setRotationPoint(2.5F, -17.5F, -7.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[526].setRotationPoint(7F, -17.5F, -7.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[527].setRotationPoint(11.5F, -17.5F, -7.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[528].setRotationPoint(16F, -17.5F, -7.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[529].setRotationPoint(20.5F, -17.5F, -7.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[530].setRotationPoint(25F, -17.5F, -7.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[531].setRotationPoint(29.5F, -17.5F, -7.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[532].setRotationPoint(34F, -17.5F, -7.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[533].setRotationPoint(38.5F, -17.5F, -7.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, -0.51F, 0F, 0.25F, -0.51F, 0F, 0.25F, -0.51F, -0.5F, -1.25F, -0.51F, -0.5F); // Box 128
		bodyModel[534].setRotationPoint(46.25F, -17.5F, -4.25F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128 glow
		bodyModel[535].setRotationPoint(45.25F, -17.5F, -4.25F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[536].setRotationPoint(43F, -17.5F, -4.25F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0.25F); // Box 128
		bodyModel[537].setRotationPoint(43F, -17.5F, -7.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 128
		bodyModel[538].setRotationPoint(43.5F, -17.5F, -7.5F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,1.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F); // Box 668
		bodyModel[539].setRotationPoint(43F, -17.5F, 4.5F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 669
		bodyModel[540].setRotationPoint(43.5F, -17.5F, 4.5F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.51F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, -0.5F, 0F, -0.51F, -0.5F); // Box 128
		bodyModel[541].setRotationPoint(-41.5F, -17.5F, -4.25F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, -0.5F, -0.5F, -1.51F, -0.5F); // Box 128
		bodyModel[542].setRotationPoint(-38F, -17.5F, -4.25F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0.25F); // Box 128
		bodyModel[543].setRotationPoint(-38F, -17.5F, -7.5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0.25F, -0.5F, -1.51F, 0F, -0.5F, -1.51F, 0F); // Box 668
		bodyModel[544].setRotationPoint(-38F, -17.5F, 4.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 669
		bodyModel[545].setRotationPoint(-41.5F, -17.5F, 4.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 128
		bodyModel[546].setRotationPoint(-41.5F, -17.5F, -7.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 82, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 669
		bodyModel[547].setRotationPoint(-35.75F, -17F, -7.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 82, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 669
		bodyModel[548].setRotationPoint(-40.25F, -17F, -7.5F);

		bodyModel[549].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[549].setRotationPoint(-10.5F, -4.5F, 7F);
		bodyModel[549].rotateAngleY = -3.14159265F;

		bodyModel[550].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[550].setRotationPoint(-19.5F, -4.5F, 7F);
		bodyModel[550].rotateAngleY = -3.14159265F;

		bodyModel[551].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[551].setRotationPoint(-19.5F, -4.5F, -7F);
		bodyModel[551].rotateAngleY = -3.14159265F;

		bodyModel[552].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[552].setRotationPoint(-19.5F, -4.5F, -7F);
		bodyModel[552].rotateAngleY = -3.14159265F;

		bodyModel[553].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[553].setRotationPoint(-19.5F, -4.5F, 7F);
		bodyModel[553].rotateAngleY = -3.14159265F;

		bodyModel[554].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[554].setRotationPoint(-28.5F, -4.5F, 7F);
		bodyModel[554].rotateAngleY = -3.14159265F;

		bodyModel[555].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[555].setRotationPoint(-28.5F, -4.5F, -7F);
		bodyModel[555].rotateAngleY = -3.14159265F;

		bodyModel[556].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[556].setRotationPoint(-28.5F, -4.5F, -7F);
		bodyModel[556].rotateAngleY = -3.14159265F;

		bodyModel[557].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[557].setRotationPoint(-28.5F, -4.5F, 7F);
		bodyModel[557].rotateAngleY = -3.14159265F;

		bodyModel[558].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[558].setRotationPoint(-37.5F, -4.5F, 7F);
		bodyModel[558].rotateAngleY = -3.14159265F;

		bodyModel[559].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[559].setRotationPoint(-37.5F, -4.5F, -7F);
		bodyModel[559].rotateAngleY = -3.14159265F;

		bodyModel[560].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[560].setRotationPoint(-37.5F, -4.5F, -7F);
		bodyModel[560].rotateAngleY = -3.14159265F;

		bodyModel[561].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[561].setRotationPoint(-37.5F, -4.5F, 7F);
		bodyModel[561].rotateAngleY = -3.14159265F;

		bodyModel[562].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[562].setRotationPoint(-46.5F, -4.5F, 7F);
		bodyModel[562].rotateAngleY = -3.14159265F;

		bodyModel[563].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[563].setRotationPoint(-46.5F, -4.5F, -7F);
		bodyModel[563].rotateAngleY = -3.14159265F;

		bodyModel[564].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[564].setRotationPoint(-46.5F, -4.5F, -7F);
		bodyModel[564].rotateAngleY = -3.14159265F;

		bodyModel[565].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[565].setRotationPoint(-46.5F, -4.5F, 7F);
		bodyModel[565].rotateAngleY = -3.14159265F;

		bodyModel[566].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[566].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[566].rotateAngleY = -3.14159265F;

		bodyModel[567].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[567].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[567].rotateAngleY = -3.14159265F;

		bodyModel[568].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[568].setRotationPoint(-1.5F, -4.5F, -7F);
		bodyModel[568].rotateAngleY = -3.14159265F;

		bodyModel[569].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[569].setRotationPoint(-1.5F, -4.5F, 7F);
		bodyModel[569].rotateAngleY = -3.14159265F;

		bodyModel[570].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[570].setRotationPoint(7.5F, -4.5F, 7F);
		bodyModel[570].rotateAngleY = -3.14159265F;

		bodyModel[571].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[571].setRotationPoint(7.5F, -4.5F, -7F);
		bodyModel[571].rotateAngleY = -3.14159265F;

		bodyModel[572].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[572].setRotationPoint(7.5F, -4.5F, -7F);
		bodyModel[572].rotateAngleY = -3.14159265F;

		bodyModel[573].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[573].setRotationPoint(7.5F, -4.5F, 7F);
		bodyModel[573].rotateAngleY = -3.14159265F;

		bodyModel[574].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[574].setRotationPoint(16.5F, -4.5F, 7F);
		bodyModel[574].rotateAngleY = -3.14159265F;

		bodyModel[575].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[575].setRotationPoint(16.5F, -4.5F, -7F);
		bodyModel[575].rotateAngleY = -3.14159265F;

		bodyModel[576].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[576].setRotationPoint(16.5F, -4.5F, -7F);
		bodyModel[576].rotateAngleY = -3.14159265F;

		bodyModel[577].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[577].setRotationPoint(16.5F, -4.5F, 7F);
		bodyModel[577].rotateAngleY = -3.14159265F;

		bodyModel[578].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[578].setRotationPoint(25.5F, -4.5F, 7F);
		bodyModel[578].rotateAngleY = -3.14159265F;

		bodyModel[579].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[579].setRotationPoint(25.5F, -4.5F, -7F);
		bodyModel[579].rotateAngleY = -3.14159265F;

		bodyModel[580].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[580].setRotationPoint(25.5F, -4.5F, -7F);
		bodyModel[580].rotateAngleY = -3.14159265F;

		bodyModel[581].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[581].setRotationPoint(25.5F, -4.5F, 7F);
		bodyModel[581].rotateAngleY = -3.14159265F;

		bodyModel[582].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[582].setRotationPoint(34.5F, -4.5F, 7F);
		bodyModel[582].rotateAngleY = -3.14159265F;

		bodyModel[583].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[583].setRotationPoint(34.5F, -4.5F, -7F);
		bodyModel[583].rotateAngleY = -3.14159265F;

		bodyModel[584].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[584].setRotationPoint(34.5F, -4.5F, -7F);
		bodyModel[584].rotateAngleY = -3.14159265F;

		bodyModel[585].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[585].setRotationPoint(34.5F, -4.5F, 7F);
		bodyModel[585].rotateAngleY = -3.14159265F;

		bodyModel[586].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[586].setRotationPoint(43.5F, -4.5F, 7F);
		bodyModel[586].rotateAngleY = -3.14159265F;

		bodyModel[587].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[587].setRotationPoint(43.5F, -4.5F, -7F);
		bodyModel[587].rotateAngleY = -3.14159265F;

		bodyModel[588].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[588].setRotationPoint(43.5F, -4.5F, -7F);
		bodyModel[588].rotateAngleY = -3.14159265F;

		bodyModel[589].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[589].setRotationPoint(43.5F, -4.5F, 7F);
		bodyModel[589].rotateAngleY = -3.14159265F;

		bodyModel[590].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 128
		bodyModel[590].setRotationPoint(-51.5F, -13F, -10F);

		bodyModel[591].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 128
		bodyModel[591].setRotationPoint(-51.5F, -15F, -9F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[592].setRotationPoint(-51.5F, -15F, -10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 128
		bodyModel[593].setRotationPoint(-55.5F, -15F, -4F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F); // Box 128
		bodyModel[594].setRotationPoint(-51.5F, -15F, -2F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[595].setRotationPoint(-52.5F, -15F, -2F);

		bodyModel[596].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 128
		bodyModel[596].setRotationPoint(-51.5F, -15F, 5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[597].setRotationPoint(49.5F, -13.99F, -0.5F);

		bodyModel[598].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 128
		bodyModel[598].setRotationPoint(-55.5F, -15F, -10F);

		bodyModel[599].addBox(0F, 0F, 0F, 14, 1, 4, 0F); // Box 128
		bodyModel[599].setRotationPoint(-55.5F, -15F, 6F);

		bodyModel[600].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 128
		bodyModel[600].setRotationPoint(-55.5F, -15F, -2F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[601].setRotationPoint(-55.5F, -15F, -3F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[602].setRotationPoint(-50.5F, -13.99F, 7.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[603].setRotationPoint(-54.5F, -13.99F, -0.5F);

		bodyModel[604].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 102
		bodyModel[604].setRotationPoint(48.5F, -3F, -10F);

		bodyModel[605].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 102
		bodyModel[605].setRotationPoint(53.5F, -3F, -10F);

		bodyModel[606].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 379
		bodyModel[606].setRotationPoint(-50.5F, -8.5F, -10F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[607].setRotationPoint(-50.5F, -6F, -10F);

		bodyModel[608].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 381
		bodyModel[608].setRotationPoint(-50.5F, -2.4F, -10F);
		bodyModel[608].rotateAngleZ = 1.04719755F;

		bodyModel[609].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[609].setRotationPoint(-49.25F, -5F, -8.5F);
		bodyModel[609].rotateAngleY = -0.78539816F;

		bodyModel[610].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[610].setRotationPoint(-55.5F, -2F, -8F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[611].setRotationPoint(-55.5F, -1F, -7.55F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[612].setRotationPoint(-55.5F, 0.5F, -8.05F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0F, -0.39F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.39F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[613].setRotationPoint(-51.5F, -6F, -2F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[614].setRotationPoint(-51F, -3F, 2F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[615].setRotationPoint(-51F, -2F, 2F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[616].setRotationPoint(-51F, -3F, -1F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38 cull
		bodyModel[617].setRotationPoint(-51F, -2F, -1F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38 cull
		bodyModel[618].setRotationPoint(-49F, -4F, -10F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[619].setRotationPoint(-45.25F, -3F, -9.25F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[620].setRotationPoint(-44F, -6F, -9.25F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, -1.5F, -4.5F, -0.5F); // Box 531
		bodyModel[621].setRotationPoint(-46.75F, -4.5F, -9.75F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[622].setRotationPoint(-43.5F, -2.5F, -9.25F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, -1.5F, -4.5F, -0.5F); // Box 531
		bodyModel[623].setRotationPoint(-46.75F, -4.5F, -3.25F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 526
		bodyModel[624].setRotationPoint(-45.25F, -3F, -1.75F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[625].setRotationPoint(-44F, -6F, -1.75F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, -1.5F, -4.5F, -0.5F); // Box 531
		bodyModel[626].setRotationPoint(-46.75F, -4.5F, -2.25F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[627].setRotationPoint(-43.5F, -2.5F, -1.75F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, -1.5F, -4.5F, -0.5F); // Box 531
		bodyModel[628].setRotationPoint(-46.75F, -4.5F, 4.25F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[629].setRotationPoint(-46F, -14.99F, -10F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[630].setRotationPoint(-49F, -14.99F, -10F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 glow
		bodyModel[631].setRotationPoint(-49F, -14.99F, -2F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86 glow
		bodyModel[632].setRotationPoint(-55F, -13.99F, -7.25F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 121, 4, 0, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 128
		bodyModel[633].setRotationPoint(-60.5F, -15F, 11.01F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 113, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 128
		bodyModel[634].setRotationPoint(-56.5F, 1F, 11.01F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 113, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 642
		bodyModel[635].setRotationPoint(-56.5F, 1F, -11.01F);

		bodyModel[636].addShapeBox(-3.75F, 0F, -0.49F, 4, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F); // Side door FR part
		bodyModel[636].setRotationPoint(-56.75F, -13F, 11.25F);

		bodyModel[637].addShapeBox(-3.75F, 0F, -0.51F, 4, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F); // Side door FL part
		bodyModel[637].setRotationPoint(-56.75F, -13F, -10.25F);

		bodyModel[638].addShapeBox(-0.25F, 0F, 0.51F, 4, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F); // Side door RR part
		bodyModel[638].setRotationPoint(56.75F, -13F, 10.25F);

		bodyModel[639].addShapeBox(-0.25F, 0F, -0.51F, 4, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F, 0F, -14.01F, 0F); // Side door RL part
		bodyModel[639].setRotationPoint(56.75F, -13F, -10.25F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 113, 28, 0, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F); // Box 128
		bodyModel[640].setRotationPoint(-56.5F, -13F, 11.01F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 113, 28, 0, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0F); // Box 661
		bodyModel[641].setRotationPoint(-56.5F, -13F, -11.01F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -14F, 0F, -0.01F, -14F, 0F, -0.01F, -14F, -0.5F, -0.01F, -14F, -0.5F); // Box 128 cull
		bodyModel[642].setRotationPoint(-60.5F, -13F, 10.51F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -14F, 0F, -0.01F, -14F, 0F, -0.01F, -14F, -0.5F, -0.01F, -14F, -0.5F); // Box 128 cull
		bodyModel[643].setRotationPoint(56.5F, -13F, 10.51F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -14F, -0.5F, -0.01F, -14F, -0.5F, -0.01F, -14F, 0F, -0.01F, -14F, 0F); // Box 664 cull
		bodyModel[644].setRotationPoint(-60.5F, -13F, -11.51F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 4, 28, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -14F, -0.5F, -0.01F, -14F, -0.5F, -0.01F, -14F, 0F, -0.01F, -14F, 0F); // Box 665 cull
		bodyModel[645].setRotationPoint(56.5F, -13F, -11.51F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.415F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.49F, -0.49F, -2F, -0.49F); // Box 128 cull
		bodyModel[646].setRotationPoint(-61.5F, 1F, 10F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.415F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.415F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.01F, -0.49F, -2F, 0.01F); // Box 128 cull
		bodyModel[647].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,-0.42F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.42F, -14F, 0F, 0.01F, -14F, 0F, 0.01F, -14F, 0.01F, -0.49F, -14F, 0.01F); // Box 128 cull
		bodyModel[648].setRotationPoint(-61.5F, -13F, 10F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.415F, 0F, 0F, -0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -2F, 0F, -0.415F, -2F, 0F, -0.49F, -2F, -0.49F, 0F, -2F, -0.49F); // Box 128 cull
		bodyModel[649].setRotationPoint(60.5F, 1F, 10F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.415F, 0F, 0F, -0.45F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, -2F, 0F, -0.415F, -2F, 0F, -0.49F, -2F, 0.01F, 0F, -2F, 0.01F); // Box 128 cull
		bodyModel[650].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0.01F, 0F, 0F, -0.42F, 0F, 0F, -0.49F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, -14F, 0F, -0.42F, -14F, 0F, -0.49F, -14F, 0.01F, 0.01F, -14F, 0.01F); // Box 128 cull
		bodyModel[651].setRotationPoint(60.5F, -13F, 10F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.49F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, -0.415F, 0F, 0F, -0.49F, -2F, -0.49F, 0F, -2F, -0.49F, 0F, -2F, 0F, -0.415F, -2F, 0F); // Box 674 cull
		bodyModel[652].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.45F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, 0F, -0.415F, 0F, 0F, -0.49F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0F, -0.415F, -2F, 0F); // Box 675 cull
		bodyModel[653].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,-0.49F, 0F, 0.01F, 0.01F, 0F, 0.01F, 0.01F, 0F, 0F, -0.42F, 0F, 0F, -0.49F, -14F, 0.01F, 0.01F, -14F, 0.01F, 0.01F, -14F, 0F, -0.42F, -14F, 0F); // Box 676 cull
		bodyModel[654].setRotationPoint(-61.5F, -13F, -11F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.49F, -0.49F, -2F, -0.49F, -0.415F, -2F, 0F, 0F, -2F, 0F); // Box 677 cull
		bodyModel[655].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.415F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.01F, -0.49F, -2F, 0.01F, -0.415F, -2F, 0F, 0F, -2F, 0F); // Box 678 cull
		bodyModel[656].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,0.01F, 0F, 0.01F, -0.49F, 0F, 0.01F, -0.42F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -14F, 0.01F, -0.49F, -14F, 0.01F, -0.42F, -14F, 0F, 0.01F, -14F, 0F); // Box 679 cull
		bodyModel[657].setRotationPoint(60.5F, -13F, -11F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 121, 4, 0, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 680
		bodyModel[658].setRotationPoint(-60.5F, -15F, -11.01F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[659].setRotationPoint(56.5F, -14F, 10F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[660].setRotationPoint(56.5F, -13F, 9.99F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[661].setRotationPoint(-60.5F, -14F, 10F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[662].setRotationPoint(-60.5F, -13F, 9.99F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 685 cull
		bodyModel[663].setRotationPoint(56.5F, -14F, -11F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 686 cull
		bodyModel[664].setRotationPoint(56.5F, -13F, -10.99F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 687 cull
		bodyModel[665].setRotationPoint(-60.5F, -14F, -11F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 688 cull
		bodyModel[666].setRotationPoint(-60.5F, -13F, -10.99F);

		bodyModel[667].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[667].setRotationPoint(17.5F, 3F, -9.5F);

		bodyModel[668].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[668].setRotationPoint(-22.5F, 3F, 4.5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[669].setRotationPoint(-49.5F, -20.25F, -9.25F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[670].setRotationPoint(-49.5F, -20.25F, -6.75F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86 glow
		bodyModel[671].setRotationPoint(50.5F, -13.99F, -7.5F);

		bodyModel[672].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 128
		bodyModel[672].setRotationPoint(48.5F, -15F, -9F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.005F, 0F, 0F, -0.005F); // Box 386 cull
		bodyModel[673].setRotationPoint(-37F, -12.98F, 7F);
	}
	ModelPS_Truck_41E bogie1 = new ModelPS_Truck_41E();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 674; i++)
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
		if(GetColor(entity)==10||GetColor(entity)==0
				||GetColor(entity)==15||GetColor(entity)==7
				||GetColor(entity)==8||GetColor(entity)==3
				||GetColor(entity)==1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-E_truck_black_roller.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/41-E_truck_black.png"));
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