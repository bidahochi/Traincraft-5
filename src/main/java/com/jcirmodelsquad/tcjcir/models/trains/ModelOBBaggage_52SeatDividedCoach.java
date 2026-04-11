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

public class ModelOBBaggage_52SeatDividedCoach extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOBBaggage_52SeatDividedCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[538];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 52, 111, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 40, 126, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 339, 137, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 311, 138, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 49, 138, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 76, 138, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 310, 142, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 127, 69, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 127, 91, textureX, textureY); // Box 128
		bodyModel[11] = new ModelRendererTurbo(this, 357, 94, textureX, textureY); // Box 128
		bodyModel[12] = new ModelRendererTurbo(this, 357, 72, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[14] = new ModelRendererTurbo(this, 72, 50, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 72, 32, textureX, textureY); // Box 168
		bodyModel[16] = new ModelRendererTurbo(this, 390, 72, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 394, 110, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 406, 93, textureX, textureY); // Box 128
		bodyModel[19] = new ModelRendererTurbo(this, 414, 93, textureX, textureY); // Box 128
		bodyModel[20] = new ModelRendererTurbo(this, 399, 92, textureX, textureY); // Box 128
		bodyModel[21] = new ModelRendererTurbo(this, 421, 92, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 405, 110, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 401, 80, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 27, 124, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 14, 152, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 8, 135, textureX, textureY); // Box 128
		bodyModel[27] = new ModelRendererTurbo(this, 17, 135, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 1, 134, textureX, textureY); // Box 128
		bodyModel[29] = new ModelRendererTurbo(this, 24, 134, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 4, 122, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 19, 73, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 370, 68, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 328, 126, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 307, 118, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 304, 135, textureX, textureY); // Trapdoor RL
		bodyModel[37] = new ModelRendererTurbo(this, 302, 121, textureX, textureY); // Trapdoor RR
		bodyModel[38] = new ModelRendererTurbo(this, 14, 92, textureX, textureY); // End door F
		bodyModel[39] = new ModelRendererTurbo(this, 325, 66, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 325, 88, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 342, 81, textureX, textureY); // Vestibule door R
		bodyModel[42] = new ModelRendererTurbo(this, 34, 102, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 379, 93, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 379, 71, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 398, 82, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 414, 82, textureX, textureY); // Box 153
		bodyModel[48] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 17, 124, textureX, textureY); // Box 153
		bodyModel[50] = new ModelRendererTurbo(this, 29, 89, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 29, 107, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 71, 85, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 71, 134, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 71, 65, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 71, 107, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 53, 122, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 42, 137, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 73, 58, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 72, 26, textureX, textureY); // Box 170
		bodyModel[60] = new ModelRendererTurbo(this, 73, 207, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 73, 216, textureX, textureY); // Box 177
		bodyModel[62] = new ModelRendererTurbo(this, 335, 64, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 298, 249, textureX, textureY); // Box 128
		bodyModel[64] = new ModelRendererTurbo(this, 314, 245, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 314, 269, textureX, textureY); // Box 83
		bodyModel[66] = new ModelRendererTurbo(this, 342, 72, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 343, 74, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 342, 103, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 343, 105, textureX, textureY); // Box 91
		bodyModel[70] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 65
		bodyModel[71] = new ModelRendererTurbo(this, 89, 234, textureX, textureY); // Box 97
		bodyModel[72] = new ModelRendererTurbo(this, 394, 76, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 394, 98, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 374, 98, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 374, 76, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 330, 137, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 326, 117, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 327, 119, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 331, 139, textureX, textureY); // Box 104
		bodyModel[80] = new ModelRendererTurbo(this, 311, 86, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 311, 64, textureX, textureY); // Box 112
		bodyModel[82] = new ModelRendererTurbo(this, 69, 159, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 311, 89, textureX, textureY); // Side door RR part
		bodyModel[84] = new ModelRendererTurbo(this, 311, 92, textureX, textureY); // Side door RR part
		bodyModel[85] = new ModelRendererTurbo(this, 308, 86, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 308, 64, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 311, 67, textureX, textureY); // Side door RL part
		bodyModel[88] = new ModelRendererTurbo(this, 311, 70, textureX, textureY); // Side door RL part
		bodyModel[89] = new ModelRendererTurbo(this, 110, 91, textureX, textureY); // Baggage door R part
		bodyModel[90] = new ModelRendererTurbo(this, 110, 69, textureX, textureY); // Baggage door L part
		bodyModel[91] = new ModelRendererTurbo(this, 308, 108, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 308, 135, textureX, textureY); // Box 130
		bodyModel[93] = new ModelRendererTurbo(this, 347, 48, textureX, textureY); // Box 135
		bodyModel[94] = new ModelRendererTurbo(this, 357, 41, textureX, textureY); // Box 136
		bodyModel[95] = new ModelRendererTurbo(this, 323, 58, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 334, 59, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 314, 58, textureX, textureY); // Box 128
		bodyModel[98] = new ModelRendererTurbo(this, 368, 38, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 347, 23, textureX, textureY); // Box 147
		bodyModel[100] = new ModelRendererTurbo(this, 357, 33, textureX, textureY); // Box 148
		bodyModel[101] = new ModelRendererTurbo(this, 323, 18, textureX, textureY); // Box 149
		bodyModel[102] = new ModelRendererTurbo(this, 334, 19, textureX, textureY); // Box 150
		bodyModel[103] = new ModelRendererTurbo(this, 314, 18, textureX, textureY); // Box 151
		bodyModel[104] = new ModelRendererTurbo(this, 368, 30, textureX, textureY); // Box 152
		bodyModel[105] = new ModelRendererTurbo(this, 346, 40, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 346, 33, textureX, textureY); // Box 154
		bodyModel[107] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 128
		bodyModel[108] = new ModelRendererTurbo(this, 366, 47, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 158
		bodyModel[110] = new ModelRendererTurbo(this, 315, 48, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 366, 22, textureX, textureY); // Box 163
		bodyModel[112] = new ModelRendererTurbo(this, 315, 24, textureX, textureY); // Box 164
		bodyModel[113] = new ModelRendererTurbo(this, 332, 49, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 332, 25, textureX, textureY); // Box 166
		bodyModel[115] = new ModelRendererTurbo(this, 342, 49, textureX, textureY); // Box 128
		bodyModel[116] = new ModelRendererTurbo(this, 342, 25, textureX, textureY); // Box 168
		bodyModel[117] = new ModelRendererTurbo(this, 326, 41, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 315, 41, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 326, 34, textureX, textureY); // Box 171
		bodyModel[120] = new ModelRendererTurbo(this, 315, 34, textureX, textureY); // Box 172
		bodyModel[121] = new ModelRendererTurbo(this, 45, 72, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 3, 56, textureX, textureY); // Box 135
		bodyModel[123] = new ModelRendererTurbo(this, 6, 48, textureX, textureY); // Box 136
		bodyModel[124] = new ModelRendererTurbo(this, 6, 39, textureX, textureY); // Box 148
		bodyModel[125] = new ModelRendererTurbo(this, 44, 49, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 46, 42, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 44, 44, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 61, 48, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 61, 41, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 330, 145, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 330, 151, textureX, textureY); // Box 128
		bodyModel[133] = new ModelRendererTurbo(this, 335, 152, textureX, textureY); // Box 128
		bodyModel[134] = new ModelRendererTurbo(this, 335, 156, textureX, textureY); // Box 128
		bodyModel[135] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 128
		bodyModel[136] = new ModelRendererTurbo(this, 307, 151, textureX, textureY); // Box 128
		bodyModel[137] = new ModelRendererTurbo(this, 304, 156, textureX, textureY); // Box 128
		bodyModel[138] = new ModelRendererTurbo(this, 310, 148, textureX, textureY); // Box 2
		bodyModel[139] = new ModelRendererTurbo(this, 319, 148, textureX, textureY); // Box 2
		bodyModel[140] = new ModelRendererTurbo(this, 319, 160, textureX, textureY); // Box 2
		bodyModel[141] = new ModelRendererTurbo(this, 312, 151, textureX, textureY); // Box 2
		bodyModel[142] = new ModelRendererTurbo(this, 321, 151, textureX, textureY); // Box 2
		bodyModel[143] = new ModelRendererTurbo(this, 336, 116, textureX, textureY); // Box 216
		bodyModel[144] = new ModelRendererTurbo(this, 354, 113, textureX, textureY); // Box 217
		bodyModel[145] = new ModelRendererTurbo(this, 354, 119, textureX, textureY); // Box 218
		bodyModel[146] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Box 219
		bodyModel[147] = new ModelRendererTurbo(this, 359, 124, textureX, textureY); // Box 220
		bodyModel[148] = new ModelRendererTurbo(this, 337, 109, textureX, textureY); // Box 221
		bodyModel[149] = new ModelRendererTurbo(this, 339, 115, textureX, textureY); // Box 222
		bodyModel[150] = new ModelRendererTurbo(this, 336, 120, textureX, textureY); // Box 223
		bodyModel[151] = new ModelRendererTurbo(this, 343, 112, textureX, textureY); // Box 224
		bodyModel[152] = new ModelRendererTurbo(this, 343, 118, textureX, textureY); // Box 225
		bodyModel[153] = new ModelRendererTurbo(this, 343, 130, textureX, textureY); // Box 226
		bodyModel[154] = new ModelRendererTurbo(this, 345, 115, textureX, textureY); // Box 227
		bodyModel[155] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 228
		bodyModel[156] = new ModelRendererTurbo(this, 122, 155, textureX, textureY); // Box 128
		bodyModel[157] = new ModelRendererTurbo(this, 297, 159, textureX, textureY); // Box 128
		bodyModel[158] = new ModelRendererTurbo(this, 89, 159, textureX, textureY); // Box 128
		bodyModel[159] = new ModelRendererTurbo(this, 259, 155, textureX, textureY); // Box 128
		bodyModel[160] = new ModelRendererTurbo(this, 84, 162, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 84, 159, textureX, textureY); // Box 128
		bodyModel[162] = new ModelRendererTurbo(this, 112, 159, textureX, textureY); // Box 128
		bodyModel[163] = new ModelRendererTurbo(this, 117, 162, textureX, textureY); // Box 128
		bodyModel[164] = new ModelRendererTurbo(this, 117, 159, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 77, 155, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 264, 159, textureX, textureY); // Box 128
		bodyModel[167] = new ModelRendererTurbo(this, 259, 162, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 259, 159, textureX, textureY); // Box 128
		bodyModel[169] = new ModelRendererTurbo(this, 287, 159, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 292, 162, textureX, textureY); // Box 128
		bodyModel[171] = new ModelRendererTurbo(this, 292, 159, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Box 258
		bodyModel[173] = new ModelRendererTurbo(this, 122, 144, textureX, textureY); // Box 259
		bodyModel[174] = new ModelRendererTurbo(this, 297, 148, textureX, textureY); // Box 260
		bodyModel[175] = new ModelRendererTurbo(this, 89, 148, textureX, textureY); // Box 261
		bodyModel[176] = new ModelRendererTurbo(this, 259, 144, textureX, textureY); // Box 262
		bodyModel[177] = new ModelRendererTurbo(this, 97, 151, textureX, textureY); // Box 263
		bodyModel[178] = new ModelRendererTurbo(this, 84, 148, textureX, textureY); // Box 264
		bodyModel[179] = new ModelRendererTurbo(this, 112, 148, textureX, textureY); // Box 265
		bodyModel[180] = new ModelRendererTurbo(this, 117, 151, textureX, textureY); // Box 266
		bodyModel[181] = new ModelRendererTurbo(this, 117, 148, textureX, textureY); // Box 267
		bodyModel[182] = new ModelRendererTurbo(this, 77, 144, textureX, textureY); // Box 268
		bodyModel[183] = new ModelRendererTurbo(this, 264, 148, textureX, textureY); // Box 269
		bodyModel[184] = new ModelRendererTurbo(this, 259, 151, textureX, textureY); // Box 270
		bodyModel[185] = new ModelRendererTurbo(this, 259, 148, textureX, textureY); // Box 271
		bodyModel[186] = new ModelRendererTurbo(this, 287, 148, textureX, textureY); // Box 272
		bodyModel[187] = new ModelRendererTurbo(this, 292, 151, textureX, textureY); // Box 273
		bodyModel[188] = new ModelRendererTurbo(this, 292, 148, textureX, textureY); // Box 274
		bodyModel[189] = new ModelRendererTurbo(this, 265, 5, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 270, 2, textureX, textureY); // Box 128
		bodyModel[191] = new ModelRendererTurbo(this, 270, 13, textureX, textureY); // Box 199
		bodyModel[192] = new ModelRendererTurbo(this, 294, 20, textureX, textureY); // Box 199
		bodyModel[193] = new ModelRendererTurbo(this, 296, 17, textureX, textureY); // Box 199
		bodyModel[194] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 199
		bodyModel[195] = new ModelRendererTurbo(this, 77, 17, textureX, textureY); // Box 199
		bodyModel[196] = new ModelRendererTurbo(this, 294, 1, textureX, textureY); // Box 280
		bodyModel[197] = new ModelRendererTurbo(this, 296, 7, textureX, textureY); // Box 281
		bodyModel[198] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 282
		bodyModel[199] = new ModelRendererTurbo(this, 77, 7, textureX, textureY); // Box 283
		bodyModel[200] = new ModelRendererTurbo(this, 308, 77, textureX, textureY); // Box 128
		bodyModel[201] = new ModelRendererTurbo(this, 322, 77, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 308, 99, textureX, textureY); // Box 202
		bodyModel[203] = new ModelRendererTurbo(this, 322, 99, textureX, textureY); // Box 203
		bodyModel[204] = new ModelRendererTurbo(this, 59, 76, textureX, textureY); // Box 128
		bodyModel[205] = new ModelRendererTurbo(this, 62, 76, textureX, textureY); // Box 128
		bodyModel[206] = new ModelRendererTurbo(this, 59, 98, textureX, textureY); // Box 202
		bodyModel[207] = new ModelRendererTurbo(this, 62, 98, textureX, textureY); // Box 203
		bodyModel[208] = new ModelRendererTurbo(this, 319, 154, textureX, textureY); // Box 2
		bodyModel[209] = new ModelRendererTurbo(this, 321, 157, textureX, textureY); // Box 2
		bodyModel[210] = new ModelRendererTurbo(this, 343, 124, textureX, textureY); // Box 225
		bodyModel[211] = new ModelRendererTurbo(this, 345, 127, textureX, textureY); // Box 228
		bodyModel[212] = new ModelRendererTurbo(this, 165, 159, textureX, textureY); // Box 2
		bodyModel[213] = new ModelRendererTurbo(this, 256, 167, textureX, textureY); // Box 41
		bodyModel[214] = new ModelRendererTurbo(this, 255, 165, textureX, textureY); // Box 41
		bodyModel[215] = new ModelRendererTurbo(this, 271, 165, textureX, textureY); // Box 41
		bodyModel[216] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 316
		bodyModel[217] = new ModelRendererTurbo(this, 135, 159, textureX, textureY); // Box 52
		bodyModel[218] = new ModelRendererTurbo(this, 229, 161, textureX, textureY); // Box 41
		bodyModel[219] = new ModelRendererTurbo(this, 226, 161, textureX, textureY); // Box 41
		bodyModel[220] = new ModelRendererTurbo(this, 242, 161, textureX, textureY); // Box 41
		bodyModel[221] = new ModelRendererTurbo(this, 323, 291, textureX, textureY); // Box 38
		bodyModel[222] = new ModelRendererTurbo(this, 326, 296, textureX, textureY); // Box 38
		bodyModel[223] = new ModelRendererTurbo(this, 325, 300, textureX, textureY); // Box 38
		bodyModel[224] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 366
		bodyModel[225] = new ModelRendererTurbo(this, 320, 331, textureX, textureY); // Box 368
		bodyModel[226] = new ModelRendererTurbo(this, 319, 335, textureX, textureY); // Box 369
		bodyModel[227] = new ModelRendererTurbo(this, 317, 326, textureX, textureY); // Box 370
		bodyModel[228] = new ModelRendererTurbo(this, 82, 238, textureX, textureY); // Box 128
		bodyModel[229] = new ModelRendererTurbo(this, 82, 229, textureX, textureY); // Box 374
		bodyModel[230] = new ModelRendererTurbo(this, 307, 318, textureX, textureY); // Box 379
		bodyModel[231] = new ModelRendererTurbo(this, 306, 322, textureX, textureY); // Box 380
		bodyModel[232] = new ModelRendererTurbo(this, 305, 327, textureX, textureY); // Box 381
		bodyModel[233] = new ModelRendererTurbo(this, 309, 331, textureX, textureY); // Box 382
		bodyModel[234] = new ModelRendererTurbo(this, 285, 319, textureX, textureY,"lamp"); // Box 86 glow
		bodyModel[235] = new ModelRendererTurbo(this, 90, 243, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[236] = new ModelRendererTurbo(this, 90, 249, textureX, textureY,"lamp"); // Box 386 glow
		bodyModel[237] = new ModelRendererTurbo(this, 326, 273, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[238] = new ModelRendererTurbo(this, 91, 266, textureX, textureY); // Box 386
		bodyModel[239] = new ModelRendererTurbo(this, 91, 255, textureX, textureY); // Box 391
		bodyModel[240] = new ModelRendererTurbo(this, 85, 346, textureX, textureY); // Box 386
		bodyModel[241] = new ModelRendererTurbo(this, 85, 339, textureX, textureY); // Box 393
		bodyModel[242] = new ModelRendererTurbo(this, 88, 262, textureX, textureY); // Box 386
		bodyModel[243] = new ModelRendererTurbo(this, 88, 251, textureX, textureY); // Box 395
		bodyModel[244] = new ModelRendererTurbo(this, 247, 286, textureX, textureY); // Right seat part
		bodyModel[245] = new ModelRendererTurbo(this, 257, 276, textureX, textureY); // Right seat part
		bodyModel[246] = new ModelRendererTurbo(this, 247, 321, textureX, textureY); // Left seat part
		bodyModel[247] = new ModelRendererTurbo(this, 257, 311, textureX, textureY); // Left seat part
		bodyModel[248] = new ModelRendererTurbo(this, 240, 297, textureX, textureY); // Boc 42
		bodyModel[249] = new ModelRendererTurbo(this, 240, 332, textureX, textureY); // Box 638
		bodyModel[250] = new ModelRendererTurbo(this, 244, 281, textureX, textureY); // Right seat part
		bodyModel[251] = new ModelRendererTurbo(this, 255, 299, textureX, textureY); // Right seat part
		bodyModel[252] = new ModelRendererTurbo(this, 255, 334, textureX, textureY); // Left seat part
		bodyModel[253] = new ModelRendererTurbo(this, 244, 316, textureX, textureY); // Left seat part
		bodyModel[254] = new ModelRendererTurbo(this, 244, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[255] = new ModelRendererTurbo(this, 255, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[256] = new ModelRendererTurbo(this, 255, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[257] = new ModelRendererTurbo(this, 244, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[258] = new ModelRendererTurbo(this, 219, 286, textureX, textureY); // Right seat part
		bodyModel[259] = new ModelRendererTurbo(this, 229, 276, textureX, textureY); // Right seat part
		bodyModel[260] = new ModelRendererTurbo(this, 219, 321, textureX, textureY); // Left seat part
		bodyModel[261] = new ModelRendererTurbo(this, 229, 311, textureX, textureY); // Left seat part
		bodyModel[262] = new ModelRendererTurbo(this, 212, 297, textureX, textureY); // Boc 42
		bodyModel[263] = new ModelRendererTurbo(this, 212, 332, textureX, textureY); // Box 638
		bodyModel[264] = new ModelRendererTurbo(this, 216, 281, textureX, textureY); // Right seat part
		bodyModel[265] = new ModelRendererTurbo(this, 227, 299, textureX, textureY); // Right seat part
		bodyModel[266] = new ModelRendererTurbo(this, 227, 334, textureX, textureY); // Left seat part
		bodyModel[267] = new ModelRendererTurbo(this, 216, 316, textureX, textureY); // Left seat part
		bodyModel[268] = new ModelRendererTurbo(this, 216, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[269] = new ModelRendererTurbo(this, 227, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[270] = new ModelRendererTurbo(this, 227, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[271] = new ModelRendererTurbo(this, 216, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[272] = new ModelRendererTurbo(this, 191, 286, textureX, textureY); // Right seat part
		bodyModel[273] = new ModelRendererTurbo(this, 201, 276, textureX, textureY); // Right seat part
		bodyModel[274] = new ModelRendererTurbo(this, 191, 321, textureX, textureY); // Left seat part
		bodyModel[275] = new ModelRendererTurbo(this, 201, 311, textureX, textureY); // Left seat part
		bodyModel[276] = new ModelRendererTurbo(this, 184, 297, textureX, textureY); // Boc 42
		bodyModel[277] = new ModelRendererTurbo(this, 184, 332, textureX, textureY); // Box 638
		bodyModel[278] = new ModelRendererTurbo(this, 188, 281, textureX, textureY); // Right seat part
		bodyModel[279] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Right seat part
		bodyModel[280] = new ModelRendererTurbo(this, 199, 334, textureX, textureY); // Left seat part
		bodyModel[281] = new ModelRendererTurbo(this, 188, 316, textureX, textureY); // Left seat part
		bodyModel[282] = new ModelRendererTurbo(this, 188, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[283] = new ModelRendererTurbo(this, 199, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[284] = new ModelRendererTurbo(this, 199, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[285] = new ModelRendererTurbo(this, 188, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[286] = new ModelRendererTurbo(this, 163, 286, textureX, textureY); // Right seat part
		bodyModel[287] = new ModelRendererTurbo(this, 173, 276, textureX, textureY); // Right seat part
		bodyModel[288] = new ModelRendererTurbo(this, 163, 321, textureX, textureY); // Left seat part
		bodyModel[289] = new ModelRendererTurbo(this, 173, 311, textureX, textureY); // Left seat part
		bodyModel[290] = new ModelRendererTurbo(this, 156, 297, textureX, textureY); // Boc 42
		bodyModel[291] = new ModelRendererTurbo(this, 156, 332, textureX, textureY); // Box 638
		bodyModel[292] = new ModelRendererTurbo(this, 160, 281, textureX, textureY); // Right seat part
		bodyModel[293] = new ModelRendererTurbo(this, 171, 299, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 171, 334, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 160, 316, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 160, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[297] = new ModelRendererTurbo(this, 171, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[298] = new ModelRendererTurbo(this, 171, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[299] = new ModelRendererTurbo(this, 160, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[300] = new ModelRendererTurbo(this, 135, 286, textureX, textureY); // Right seat part
		bodyModel[301] = new ModelRendererTurbo(this, 145, 276, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 135, 321, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 145, 311, textureX, textureY); // Left seat part
		bodyModel[304] = new ModelRendererTurbo(this, 128, 297, textureX, textureY); // Boc 42
		bodyModel[305] = new ModelRendererTurbo(this, 128, 332, textureX, textureY); // Box 638
		bodyModel[306] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Right seat part
		bodyModel[307] = new ModelRendererTurbo(this, 143, 299, textureX, textureY); // Right seat part
		bodyModel[308] = new ModelRendererTurbo(this, 143, 334, textureX, textureY); // Left seat part
		bodyModel[309] = new ModelRendererTurbo(this, 132, 316, textureX, textureY); // Left seat part
		bodyModel[310] = new ModelRendererTurbo(this, 132, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[311] = new ModelRendererTurbo(this, 143, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[312] = new ModelRendererTurbo(this, 143, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[313] = new ModelRendererTurbo(this, 132, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[314] = new ModelRendererTurbo(this, 107, 286, textureX, textureY); // Right seat part
		bodyModel[315] = new ModelRendererTurbo(this, 117, 276, textureX, textureY); // Right seat part
		bodyModel[316] = new ModelRendererTurbo(this, 107, 321, textureX, textureY); // Left seat part
		bodyModel[317] = new ModelRendererTurbo(this, 117, 311, textureX, textureY); // Left seat part
		bodyModel[318] = new ModelRendererTurbo(this, 100, 297, textureX, textureY); // Boc 42
		bodyModel[319] = new ModelRendererTurbo(this, 100, 332, textureX, textureY); // Box 638
		bodyModel[320] = new ModelRendererTurbo(this, 104, 281, textureX, textureY); // Right seat part
		bodyModel[321] = new ModelRendererTurbo(this, 115, 299, textureX, textureY); // Right seat part
		bodyModel[322] = new ModelRendererTurbo(this, 115, 334, textureX, textureY); // Left seat part
		bodyModel[323] = new ModelRendererTurbo(this, 104, 316, textureX, textureY); // Left seat part
		bodyModel[324] = new ModelRendererTurbo(this, 104, 275, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[325] = new ModelRendererTurbo(this, 115, 293, textureX, textureY,"cull"); // Right seat part cull
		bodyModel[326] = new ModelRendererTurbo(this, 115, 328, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[327] = new ModelRendererTurbo(this, 104, 310, textureX, textureY,"cull"); // Left seat part cull
		bodyModel[328] = new ModelRendererTurbo(this, 382, 78, textureX, textureY); // Rear gate closed
		bodyModel[329] = new ModelRendererTurbo(this, 379, 83, textureX, textureY); // Rear gate open
		bodyModel[330] = new ModelRendererTurbo(this, 88, 258, textureX, textureY); // Box 384
		bodyModel[331] = new ModelRendererTurbo(this, 91, 353, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 91, 359, textureX, textureY); // Box 462
		bodyModel[333] = new ModelRendererTurbo(this, 268, 282, textureX, textureY); // Box 128
		bodyModel[334] = new ModelRendererTurbo(this, 269, 273, textureX, textureY); // Box 128
		bodyModel[335] = new ModelRendererTurbo(this, 278, 275, textureX, textureY); // Box 128
		bodyModel[336] = new ModelRendererTurbo(this, 285, 286, textureX, textureY); // Box 128
		bodyModel[337] = new ModelRendererTurbo(this, 306, 286, textureX, textureY); // Box 128
		bodyModel[338] = new ModelRendererTurbo(this, 336, 286, textureX, textureY); // Box 128
		bodyModel[339] = new ModelRendererTurbo(this, 313, 283, textureX, textureY); // Box 128
		bodyModel[340] = new ModelRendererTurbo(this, 312, 287, textureX, textureY); // Box 128
		bodyModel[341] = new ModelRendererTurbo(this, 311, 292, textureX, textureY); // Box 128
		bodyModel[342] = new ModelRendererTurbo(this, 315, 296, textureX, textureY); // Box 41
		bodyModel[343] = new ModelRendererTurbo(this, 285, 284, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[344] = new ModelRendererTurbo(this, 87, 376, textureX, textureY); // Box 128
		bodyModel[345] = new ModelRendererTurbo(this, 88, 367, textureX, textureY); // Box 128
		bodyModel[346] = new ModelRendererTurbo(this, 88, 369, textureX, textureY); // Box 128
		bodyModel[347] = new ModelRendererTurbo(this, 86, 409, textureX, textureY); // Box 128
		bodyModel[348] = new ModelRendererTurbo(this, 87, 400, textureX, textureY); // Box 86
		bodyModel[349] = new ModelRendererTurbo(this, 87, 402, textureX, textureY); // Box 87
		bodyModel[350] = new ModelRendererTurbo(this, 115, 386, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 268, 317, textureX, textureY); // Box 561
		bodyModel[352] = new ModelRendererTurbo(this, 269, 308, textureX, textureY); // Box 562
		bodyModel[353] = new ModelRendererTurbo(this, 278, 310, textureX, textureY); // Box 563
		bodyModel[354] = new ModelRendererTurbo(this, 285, 321, textureX, textureY); // Box 564
		bodyModel[355] = new ModelRendererTurbo(this, 104, 366, textureX, textureY); // Box 128
		bodyModel[356] = new ModelRendererTurbo(this, 87, 398, textureX, textureY); // Box 128
		bodyModel[357] = new ModelRendererTurbo(this, 88, 365, textureX, textureY); // Box 83
		bodyModel[358] = new ModelRendererTurbo(this, 230, 169, textureX, textureY); // Box 316
		bodyModel[359] = new ModelRendererTurbo(this, 210, 162, textureX, textureY); // Box 41
		bodyModel[360] = new ModelRendererTurbo(this, 209, 160, textureX, textureY); // Box 41
		bodyModel[361] = new ModelRendererTurbo(this, 223, 160, textureX, textureY); // Box 41
		bodyModel[362] = new ModelRendererTurbo(this, 139, 159, textureX, textureY); // Box 2
		bodyModel[363] = new ModelRendererTurbo(this, 108, 20, textureX, textureY); // Box 199
		bodyModel[364] = new ModelRendererTurbo(this, 110, 17, textureX, textureY); // Box 199
		bodyModel[365] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 282
		bodyModel[366] = new ModelRendererTurbo(this, 99, 7, textureX, textureY); // Box 283
		bodyModel[367] = new ModelRendererTurbo(this, 115, 394, textureX, textureY); // Box 128 baggage bulkead door
		bodyModel[368] = new ModelRendererTurbo(this, 330, 321, textureX, textureY); // Box 623
		bodyModel[369] = new ModelRendererTurbo(this, 285, 162, textureX, textureY); // Box 128
		bodyModel[370] = new ModelRendererTurbo(this, 89, 162, textureX, textureY); // Box 128
		bodyModel[371] = new ModelRendererTurbo(this, 278, 162, textureX, textureY); // Box 128
		bodyModel[372] = new ModelRendererTurbo(this, 273, 162, textureX, textureY); // Box 128
		bodyModel[373] = new ModelRendererTurbo(this, 96, 162, textureX, textureY); // Box 128
		bodyModel[374] = new ModelRendererTurbo(this, 285, 151, textureX, textureY); // Box 571
		bodyModel[375] = new ModelRendererTurbo(this, 102, 151, textureX, textureY); // Box 572
		bodyModel[376] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 573
		bodyModel[377] = new ModelRendererTurbo(this, 278, 151, textureX, textureY); // Box 574
		bodyModel[378] = new ModelRendererTurbo(this, 273, 151, textureX, textureY); // Box 575
		bodyModel[379] = new ModelRendererTurbo(this, 109, 151, textureX, textureY); // Box 576
		bodyModel[380] = new ModelRendererTurbo(this, 247, 365, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 249, 370, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 247, 375, textureX, textureY); // Box 275
		bodyModel[383] = new ModelRendererTurbo(this, 249, 380, textureX, textureY); // Box 276
		bodyModel[384] = new ModelRendererTurbo(this, 181, 383, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[385] = new ModelRendererTurbo(this, 181, 373, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[386] = new ModelRendererTurbo(this, 182, 365, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 184, 370, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 182, 375, textureX, textureY); // Box 275
		bodyModel[389] = new ModelRendererTurbo(this, 184, 380, textureX, textureY); // Box 276
		bodyModel[390] = new ModelRendererTurbo(this, 428, 67, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[391] = new ModelRendererTurbo(this, 428, 70, textureX, textureY,"cull"); // Box 128 cull
		bodyModel[392] = new ModelRendererTurbo(this, 428, 89, textureX, textureY,"cull"); // Box 685 cull
		bodyModel[393] = new ModelRendererTurbo(this, 428, 92, textureX, textureY,"cull"); // Box 686 cull
		bodyModel[394] = new ModelRendererTurbo(this, 97, 20, textureX, textureY); // Box 199
		bodyModel[395] = new ModelRendererTurbo(this, 99, 17, textureX, textureY); // Box 199
		bodyModel[396] = new ModelRendererTurbo(this, 83, 282, textureX, textureY); // Box 128
		bodyModel[397] = new ModelRendererTurbo(this, 68, 291, textureX, textureY); // Box 128
		bodyModel[398] = new ModelRendererTurbo(this, 77, 293, textureX, textureY); // Box 128
		bodyModel[399] = new ModelRendererTurbo(this, 83, 317, textureX, textureY); // Box 128
		bodyModel[400] = new ModelRendererTurbo(this, 59, 315, textureX, textureY); // Box 86
		bodyModel[401] = new ModelRendererTurbo(this, 68, 317, textureX, textureY); // Box 87
		bodyModel[402] = new ModelRendererTurbo(this, 65, 300, textureX, textureY); // Box 128
		bodyModel[403] = new ModelRendererTurbo(this, 37, 293, textureX, textureY); // Box 128
		bodyModel[404] = new ModelRendererTurbo(this, 68, 313, textureX, textureY); // Box 128
		bodyModel[405] = new ModelRendererTurbo(this, 77, 289, textureX, textureY); // Box 83
		bodyModel[406] = new ModelRendererTurbo(this, 74, 302, textureX, textureY); // Box 128 bulkead door
		bodyModel[407] = new ModelRendererTurbo(this, 65, 69, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 65, 91, textureX, textureY); // Box 128
		bodyModel[409] = new ModelRendererTurbo(this, 22, 229, textureX, textureY); // Box 374
		bodyModel[410] = new ModelRendererTurbo(this, 22, 238, textureX, textureY); // Box 128
		bodyModel[411] = new ModelRendererTurbo(this, 42, 80, textureX, textureY); // Box 128
		bodyModel[412] = new ModelRendererTurbo(this, 19, 81, textureX, textureY); // Box 128
		bodyModel[413] = new ModelRendererTurbo(this, 42, 104, textureX, textureY); // Box 487
		bodyModel[414] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 128
		bodyModel[415] = new ModelRendererTurbo(this, 28, 66, textureX, textureY); // Box 128
		bodyModel[416] = new ModelRendererTurbo(this, 2, 84, textureX, textureY); // Box 128
		bodyModel[417] = new ModelRendererTurbo(this, 26, 57, textureX, textureY); // Box 128
		bodyModel[418] = new ModelRendererTurbo(this, 35, 68, textureX, textureY); // Box 65
		bodyModel[419] = new ModelRendererTurbo(this, 3, 98, textureX, textureY); // Box 128
		bodyModel[420] = new ModelRendererTurbo(this, 46, 62, textureX, textureY); // Box 128
		bodyModel[421] = new ModelRendererTurbo(this, 53, 63, textureX, textureY); // Box 128
		bodyModel[422] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 128
		bodyModel[423] = new ModelRendererTurbo(this, 10, 34, textureX, textureY); // Box 128
		bodyModel[424] = new ModelRendererTurbo(this, 43, 61, textureX, textureY); // Box 128
		bodyModel[425] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 128
		bodyModel[426] = new ModelRendererTurbo(this, 32, 72, textureX, textureY); // Box 128
		bodyModel[427] = new ModelRendererTurbo(this, 17, 48, textureX, textureY); // Box 128
		bodyModel[428] = new ModelRendererTurbo(this, 26, 40, textureX, textureY); // Box 128
		bodyModel[429] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 128
		bodyModel[430] = new ModelRendererTurbo(this, 33, 44, textureX, textureY); // Box 128
		bodyModel[431] = new ModelRendererTurbo(this, 13, 59, textureX, textureY); // Box 128
		bodyModel[432] = new ModelRendererTurbo(this, 13, 55, textureX, textureY); // Box 128
		bodyModel[433] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 128
		bodyModel[434] = new ModelRendererTurbo(this, 28, 62, textureX, textureY); // Box 65
		bodyModel[435] = new ModelRendererTurbo(this, 18, 68, textureX, textureY); // Box 135
		bodyModel[436] = new ModelRendererTurbo(this, 18, 64, textureX, textureY); // Box 135
		bodyModel[437] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Box 128
		bodyModel[438] = new ModelRendererTurbo(this, 42, 57, textureX, textureY); // Box 128
		bodyModel[439] = new ModelRendererTurbo(this, 35, 56, textureX, textureY); // Box 128
		bodyModel[440] = new ModelRendererTurbo(this, 35, 60, textureX, textureY); // Box 128
		bodyModel[441] = new ModelRendererTurbo(this, 58, 63, textureX, textureY); // Box 128
		bodyModel[442] = new ModelRendererTurbo(this, 21, 60, textureX, textureY); // Box 65
		bodyModel[443] = new ModelRendererTurbo(this, 41, 70, textureX, textureY); // Box 65
		bodyModel[444] = new ModelRendererTurbo(this, 33, 64, textureX, textureY); // Box 65
		bodyModel[445] = new ModelRendererTurbo(this, 40, 64, textureX, textureY); // Box 65
		bodyModel[446] = new ModelRendererTurbo(this, 46, 66, textureX, textureY); // Box 65
		bodyModel[447] = new ModelRendererTurbo(this, 61, 27, textureX, textureY); // Box 499
		bodyModel[448] = new ModelRendererTurbo(this, 61, 34, textureX, textureY); // Box 500
		bodyModel[449] = new ModelRendererTurbo(this, 44, 27, textureX, textureY); // Box 487
		bodyModel[450] = new ModelRendererTurbo(this, 46, 35, textureX, textureY); // Box 488
		bodyModel[451] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 489
		bodyModel[452] = new ModelRendererTurbo(this, 43, 80, textureX, textureY); // Box 128
		bodyModel[453] = new ModelRendererTurbo(this, 43, 104, textureX, textureY); // Box 91
		bodyModel[454] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 537
		bodyModel[455] = new ModelRendererTurbo(this, 5, 9, textureX, textureY); // Box 538
		bodyModel[456] = new ModelRendererTurbo(this, 15, 8, textureX, textureY); // Box 539
		bodyModel[457] = new ModelRendererTurbo(this, 15, 12, textureX, textureY); // Box 540
		bodyModel[458] = new ModelRendererTurbo(this, 20, 6, textureX, textureY); // Box 542
		bodyModel[459] = new ModelRendererTurbo(this, 26, 9, textureX, textureY); // Box 543
		bodyModel[460] = new ModelRendererTurbo(this, 26, 19, textureX, textureY); // Box 544
		bodyModel[461] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 545
		bodyModel[462] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Box 546
		bodyModel[463] = new ModelRendererTurbo(this, 26, 29, textureX, textureY); // Box 547
		bodyModel[464] = new ModelRendererTurbo(this, 21, 17, textureX, textureY); // Box 548
		bodyModel[465] = new ModelRendererTurbo(this, 38, 1, textureX, textureY); // Box 549
		bodyModel[466] = new ModelRendererTurbo(this, 31, 7, textureX, textureY); // Box 551
		bodyModel[467] = new ModelRendererTurbo(this, 26, 15, textureX, textureY); // Box 552
		bodyModel[468] = new ModelRendererTurbo(this, 38, 7, textureX, textureY); // Box 553
		bodyModel[469] = new ModelRendererTurbo(this, 43, 14, textureX, textureY); // Box 554
		bodyModel[470] = new ModelRendererTurbo(this, 46, 22, textureX, textureY); // Box 555
		bodyModel[471] = new ModelRendererTurbo(this, 60, 19, textureX, textureY); // Box 556
		bodyModel[472] = new ModelRendererTurbo(this, 31, 12, textureX, textureY); // Box 557
		bodyModel[473] = new ModelRendererTurbo(this, 38, 12, textureX, textureY); // Box 558
		bodyModel[474] = new ModelRendererTurbo(this, 48, 18, textureX, textureY); // Box 559
		bodyModel[475] = new ModelRendererTurbo(this, 55, 19, textureX, textureY); // Box 560
		bodyModel[476] = new ModelRendererTurbo(this, 43, 18, textureX, textureY); // Box 561
		bodyModel[477] = new ModelRendererTurbo(this, 26, 34, textureX, textureY); // Box 562
		bodyModel[478] = new ModelRendererTurbo(this, 42, 21, textureX, textureY); // Box 563
		bodyModel[479] = new ModelRendererTurbo(this, 33, 24, textureX, textureY); // Box 564
		bodyModel[480] = new ModelRendererTurbo(this, 35, 20, textureX, textureY); // Box 565
		bodyModel[481] = new ModelRendererTurbo(this, 35, 16, textureX, textureY); // Box 566
		bodyModel[482] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Box 567
		bodyModel[483] = new ModelRendererTurbo(this, 2, 77, textureX, textureY); // Box 568
		bodyModel[484] = new ModelRendererTurbo(this, 5, 66, textureX, textureY); // Box 569
		bodyModel[485] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 570
		bodyModel[486] = new ModelRendererTurbo(this, 27, 1, textureX, textureY); // Box 575
		bodyModel[487] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Box 576
		bodyModel[488] = new ModelRendererTurbo(this, 69, 163, textureX, textureY); // Box 128
		bodyModel[489] = new ModelRendererTurbo(this, 56, 159, textureX, textureY); // Box 154
		bodyModel[490] = new ModelRendererTurbo(this, 66, 148, textureX, textureY); // Box 155
		bodyModel[491] = new ModelRendererTurbo(this, 58, 149, textureX, textureY); // Box 156
		bodyModel[492] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 157
		bodyModel[493] = new ModelRendererTurbo(this, 56, 148, textureX, textureY); // Box 332
		bodyModel[494] = new ModelRendererTurbo(this, 66, 159, textureX, textureY); // Box 333
		bodyModel[495] = new ModelRendererTurbo(this, 58, 160, textureX, textureY); // Box 334
		bodyModel[496] = new ModelRendererTurbo(this, 58, 162, textureX, textureY); // Box 335
		bodyModel[497] = new ModelRendererTurbo(this, 122, 147, textureX, textureY); // Box 154
		bodyModel[498] = new ModelRendererTurbo(this, 132, 147, textureX, textureY); // Box 155
		bodyModel[499] = new ModelRendererTurbo(this, 124, 148, textureX, textureY); // Box 156

		bodyModel[0].addBox(0F, 0F, 0F, 116, 2, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-59.5F, 1F, -10F);

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

		bodyModel[9].addBox(0F, 0F, 0F, 89, 14, 1, 0F); // Box 38
		bodyModel[9].setRotationPoint(-32.5F, -13F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 89, 14, 1, 0F); // Box 128
		bodyModel[10].setRotationPoint(-32.5F, -13F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[11].setRotationPoint(60.5F, -13F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(60.5F, -13F, 4F);

		bodyModel[13].addBox(0F, 0F, 0F, 115, 3, 6, 0F); // Box 128
		bodyModel[13].setRotationPoint(-57.5F, -20F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[14].setRotationPoint(-57.5F, -20F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 115, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 168
		bodyModel[15].setRotationPoint(-57.5F, -20F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[16].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[17].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[18].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[19].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[20].setRotationPoint(63F, -14F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(63F, -14F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[22].setRotationPoint(63F, 1F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[23].setRotationPoint(63F, -15F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-63F, -15F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-63F, 1F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[26].setRotationPoint(-63F, -14F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[27].setRotationPoint(-63F, -14F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[28].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[30].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[31].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[32].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[33].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 2
		bodyModel[34].setRotationPoint(60.5F, 1F, -4F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[35].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Trapdoor RL
		bodyModel[36].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, 0F, 0F, -0.26F); // Trapdoor RR
		bodyModel[37].setRotationPoint(56.5F, 1F, 5F);

		bodyModel[38].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // End door F
		bodyModel[38].setRotationPoint(-60F, -14F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[39].setRotationPoint(55.5F, -13F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[40].setRotationPoint(55.5F, -13F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door R
		bodyModel[41].setRotationPoint(55.5F, -14F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[42].setRotationPoint(-60.5F, -15F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[43].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[44].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[45].setRotationPoint(60.5F, -15F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[46].setRotationPoint(63F, -16.5F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[47].setRotationPoint(63F, -16.5F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[48].setRotationPoint(-63.5F, -16.5F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[49].setRotationPoint(-63.5F, -16.5F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(-61.5F, -15F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 117, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(-60.5F, -15F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 117, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[53].setRotationPoint(-60.5F, 1F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 117, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[54].setRotationPoint(-60.5F, -15F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 117, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[55].setRotationPoint(-60.5F, 1F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[56].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[57].setRotationPoint(-61.5F, 1F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 117, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 128
		bodyModel[58].setRotationPoint(-58.5F, -17F, -10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 117, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 170
		bodyModel[59].setRotationPoint(-58.5F, -17F, 8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 117, 2, 6, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-59.5F, -19F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 117, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		bodyModel[61].setRotationPoint(-59.5F, -19F, 3F);

		bodyModel[62].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 128
		bodyModel[62].setRotationPoint(45.5F, -15F, -3F);

		bodyModel[63].addBox(0F, 0F, 0F, 13, 2, 17, 0F); // Box 128
		bodyModel[63].setRotationPoint(45.5F, -17F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[64].setRotationPoint(45.5F, -17F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[65].setRotationPoint(45.5F, -17F, 8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[66].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[67].setRotationPoint(55.5F, -15F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 90
		bodyModel[68].setRotationPoint(55.5F, -15F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[69].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 105, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[70].setRotationPoint(-59.5F, -17F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 105, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 97
		bodyModel[71].setRotationPoint(-59.5F, -17F, 7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[72].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.46F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[73].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 128
		bodyModel[74].setRotationPoint(60.5F, -15F, -4F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 106
		bodyModel[75].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[77].setRotationPoint(60.5F, 1F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.425F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[78].setRotationPoint(60.5F, 1F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.425F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.425F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[79].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[80].setRotationPoint(56.5F, -15F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 112
		bodyModel[81].setRotationPoint(56.5F, -15F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 128
		bodyModel[82].setRotationPoint(-60.5F, 3F, 9.5F);

		bodyModel[83].addShapeBox(-0.25F, 0F, 0.25F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.76F, 0F, 0F, -0.76F); // Side door RR part
		bodyModel[83].setRotationPoint(56.75F, -14F, 10.25F);

		bodyModel[84].addShapeBox(-0.25F, 0F, 0F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F); // Side door RR part
		bodyModel[84].setRotationPoint(56.75F, -13F, 10.25F);

		bodyModel[85].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 128
		bodyModel[85].setRotationPoint(56.75F, -13F, 10.5F);

		bodyModel[86].addShapeBox(-0.25F, 0F, 0F, 1, 13, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.75F, -0.01F, 0F, -0.75F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 120
		bodyModel[86].setRotationPoint(56.75F, -13F, -10.5F);

		bodyModel[87].addShapeBox(-0.25F, 0F, -1.25F, 4, 1, 1, 0F,0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Side door RL part
		bodyModel[87].setRotationPoint(56.75F, -14F, -10.25F);

		bodyModel[88].addShapeBox(-0.25F, 0F, -1F, 4, 14, 1, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -0.51F, 0F, -0.01F, -0.51F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Side door RL part
		bodyModel[88].setRotationPoint(56.75F, -13F, -10.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Baggage door R part
		bodyModel[89].setRotationPoint(-39.5F, -13F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Baggage door L part
		bodyModel[90].setRotationPoint(-39.5F, -13F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[91].setRotationPoint(56.5F, 1F, 10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[92].setRotationPoint(56.5F, 1F, -10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -2F, -0.5F, -0.46F, -2F, -0.5F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, -0.5F, -0.46F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[93].setRotationPoint(58.5F, -17F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[94].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, -2F, 0F, 0.04F, -2F, 0F, -1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, 0F, 0F, 0.04F, 0F, 0F, -1.96F, -0.38F, -1F, -0.04F, -0.38F, -1F); // Box 128
		bodyModel[95].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, -2F, -0.96F, -2F, 0F, -0.825F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, -0.38F, -2F, -0.96F, 0F, 0F, -0.825F, -0.38F, 0F, -0.04F, -0.38F, 0F); // Box 128
		bodyModel[96].setRotationPoint(59F, -17F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -0.46F, 0F, 0F, -0.46F, -0.38F, -1F, 0F, -0.38F, -1F); // Box 128
		bodyModel[97].setRotationPoint(58.5F, -17F, -10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0.235F, 0F, -1F, -2.36F, 0F, -1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.365F, 0F, -1F, 0.365F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 128
		bodyModel[98].setRotationPoint(59.5F, -18.6F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, -0.46F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.46F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[99].setRotationPoint(58.5F, -17F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[100].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.04F, 1F, -1F, -1.96F, 1F, -1F, 0.04F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, -0.38F, -1F, -1.96F, -0.38F, -1F, 0.04F, 0F, 0F, -0.04F, 0F, 0F); // Box 149
		bodyModel[101].setRotationPoint(59F, -17F, 7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.04F, 1F, 0F, -0.825F, -1.62F, 0F, -0.96F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, -0.38F, 0F, -0.825F, -0.38F, 0F, -0.96F, 0F, 0F, -0.04F, -0.38F, -2F); // Box 150
		bodyModel[102].setRotationPoint(59F, -17F, 8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -0.38F, -1F, -0.46F, -0.38F, -1F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[103].setRotationPoint(58.5F, -17F, 7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 1F, 0F, -1F, -1.6F, 0F, -1F, -2.36F, 0F, 0F, 0.235F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.365F, 0F, 0F, 0.365F, 0F); // Box 152
		bodyModel[104].setRotationPoint(59.5F, -18.6F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[105].setRotationPoint(58.5F, -17F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 154
		bodyModel[106].setRotationPoint(58.5F, -17F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.38F, 0F, -0.46F, -0.38F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F); // Box 128
		bodyModel[107].setRotationPoint(58.5F, -17F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0.2F, 0F, -0.865F, -2.42F, 0F, -0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.42F, 0F, -0.865F, 0.42F, 0F, -0.535F, -0.435F, -0.5F, -0.46F, -0.435F, -0.5F); // Box 128
		bodyModel[108].setRotationPoint(59.04F, -17.8F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, -1.235F, -0.5F, 0F, -1.235F, -0.5F, -0.46F, -0.38F, 0F, 0F, -0.38F, 0F); // Box 158
		bodyModel[109].setRotationPoint(58.5F, -17F, 3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.46F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[110].setRotationPoint(57.5F, -20F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.865F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, -0.435F, -0.5F, -0.535F, -0.435F, -0.5F, -0.865F, 0.42F, 0F, 0F, 0.42F, 0F); // Box 163
		bodyModel[111].setRotationPoint(59.04F, -17.8F, 3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[112].setRotationPoint(57.5F, -20F, 2.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -0.35F, 0F, -0.76F, -0.35F, 0F, -0.3F, -0.35F, -0.5F, 0.02F, -0.35F, -0.5F); // Box 128
		bodyModel[113].setRotationPoint(57.8F, -19.65F, -8.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.76F, -0.35F, 0F, -1.24F, -0.35F, 0F); // Box 166
		bodyModel[114].setRotationPoint(57.8F, -19.65F, 3.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F); // Box 128
		bodyModel[115].setRotationPoint(57.8F, -19.65F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0.02F, -0.35F, 0F); // Box 168
		bodyModel[116].setRotationPoint(57.8F, -19.65F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(57.5F, -20F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.975F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[119].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[120].setRotationPoint(57.5F, -20F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, -0.46F, -2F, 0F, -0.46F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, -0.46F, 0F, -1F, -0.46F, -2F, -1F, 0F, -2F, -1F); // Box 128
		bodyModel[121].setRotationPoint(-59.04F, -17F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -0.765F, 0F, 0F, -0.765F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[122].setRotationPoint(-61.5F, -17F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[123].setRotationPoint(-61.5F, -17F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[124].setRotationPoint(-61.5F, -17F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.46F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -0.46F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 128
		bodyModel[125].setRotationPoint(-59.5F, -20F, -8.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.76F, -1.65F, 0F, -1.24F, -1.65F, 0F, 0.02F, -0.015F, -0.5F, -0.3F, -0.815F, -0.5F, -0.76F, 1.65F, 0F, -1.24F, 1.65F, 0F, 0.02F, 0.015F, -0.5F, -0.3F, 0.015F, -0.5F); // Box 128
		bodyModel[126].setRotationPoint(-59.8F, -19.65F, -8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.815F, 0F, 0.02F, -0.015F, 0F, 0.3F, 0.35F, 0F, -0.3F, -0.625F, 0F, -0.3F, 0.015F, 0F, 0.02F, 0.015F, 0F, 0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F); // Box 128
		bodyModel[127].setRotationPoint(-59.8F, -19.65F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.975F, 0F, 0F, 0F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -2F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 128
		bodyModel[129].setRotationPoint(-59.5F, -20F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[130].setRotationPoint(56.5F, 3F, 9.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[131].setRotationPoint(60.5F, 3F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[132].setRotationPoint(60.5F, 3F, 8.25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[133].setRotationPoint(60.5F, 3F, 9.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[134].setRotationPoint(60.5F, 6F, 9.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[135].setRotationPoint(56.5F, 3F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[136].setRotationPoint(56.5F, 3F, 8.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[137].setRotationPoint(56.5F, 6F, 9.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[138].setRotationPoint(56.5F, 2.5F, 5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[139].setRotationPoint(56.5F, 4F, 6.25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[140].setRotationPoint(56.5F, 7F, 8.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[141].setRotationPoint(56.5F, 2.5F, 6.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[142].setRotationPoint(56.5F, 4F, 7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[143].setRotationPoint(56.5F, 3F, -10.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 217
		bodyModel[144].setRotationPoint(60.5F, 3F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[145].setRotationPoint(60.5F, 3F, -10.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[146].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[147].setRotationPoint(60.5F, 6F, -10.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F); // Box 221
		bodyModel[148].setRotationPoint(56.5F, 3F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[149].setRotationPoint(56.5F, 3F, -10.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[150].setRotationPoint(56.5F, 6F, -10.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[151].setRotationPoint(56.5F, 2.5F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[152].setRotationPoint(56.5F, 4F, -8.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[153].setRotationPoint(56.5F, 7F, -10.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[154].setRotationPoint(56.5F, 2.5F, -6.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[155].setRotationPoint(56.5F, 4F, -7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[156].setRotationPoint(-33.5F, 3F, 9.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[157].setRotationPoint(54.5F, 3F, 9.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[158].setRotationPoint(-54F, 3F, 9.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[159].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[160].setRotationPoint(-54.5F, 3.5F, 9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[161].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[162].setRotationPoint(-35F, 3F, 9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[163].setRotationPoint(-34.5F, 3.5F, 9.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[164].setRotationPoint(-34F, 3F, 9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[165].setRotationPoint(-54.5F, 3F, 9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[166].setRotationPoint(34F, 3F, 9.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[167].setRotationPoint(33.5F, 3.5F, 9.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[168].setRotationPoint(33.5F, 3F, 9.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F); // Box 128
		bodyModel[169].setRotationPoint(53F, 3F, 9.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 128
		bodyModel[170].setRotationPoint(53.5F, 3.5F, 9.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 128
		bodyModel[171].setRotationPoint(54F, 3F, 9.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 258
		bodyModel[172].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[173].setRotationPoint(-33.5F, 3F, -10.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[174].setRotationPoint(54.5F, 3F, -10.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 261
		bodyModel[175].setRotationPoint(-54F, 3F, -10.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[176].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[177].setRotationPoint(-54.5F, 3.5F, -10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 264
		bodyModel[178].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 265
		bodyModel[179].setRotationPoint(-35F, 3F, -10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 266
		bodyModel[180].setRotationPoint(-34.5F, 3.5F, -10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 267
		bodyModel[181].setRotationPoint(-34F, 3F, -10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[182].setRotationPoint(-54.5F, 3F, -10.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -1F, -0.5F, -0.125F, -1F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 269
		bodyModel[183].setRotationPoint(34F, 3F, -10.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[184].setRotationPoint(33.5F, 3.5F, -10.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 271
		bodyModel[185].setRotationPoint(33.5F, 3F, -10.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.375F, -1F, -0.5F, -0.375F); // Box 272
		bodyModel[186].setRotationPoint(53F, 3F, -10.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 273
		bodyModel[187].setRotationPoint(53.5F, 3.5F, -10.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.375F, 0F, -0.5F, -0.375F); // Box 274
		bodyModel[188].setRotationPoint(54F, 3F, -10.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[189].setRotationPoint(44.5F, -20.25F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 128
		bodyModel[190].setRotationPoint(44.5F, -20.25F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 199
		bodyModel[191].setRotationPoint(44.5F, -20.25F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[192].setRotationPoint(53.5F, -20.25F, 6.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[193].setRotationPoint(53.5F, -20.25F, 5.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[194].setRotationPoint(-51.5F, -20.25F, 6.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[195].setRotationPoint(-51.5F, -20.25F, 5.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 280
		bodyModel[196].setRotationPoint(53.5F, -20.25F, -9.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 281
		bodyModel[197].setRotationPoint(53.5F, -20.25F, -6.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[198].setRotationPoint(-51.5F, -20.25F, -9.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[199].setRotationPoint(-51.5F, -20.25F, -6.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[200].setRotationPoint(56.5F, -6F, -12F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[201].setRotationPoint(60.5F, -6F, -12F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[202].setRotationPoint(56.5F, -6F, 11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[203].setRotationPoint(60.5F, -6F, 11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[204].setRotationPoint(-60.5F, -6F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[205].setRotationPoint(-39.5F, -6F, -12F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[206].setRotationPoint(-60.5F, -6F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[207].setRotationPoint(-39.5F, -6F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[208].setRotationPoint(56.5F, 5.5F, 7.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[209].setRotationPoint(56.5F, 5.5F, 8.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[210].setRotationPoint(56.5F, 5.5F, -9.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[211].setRotationPoint(56.5F, 5.5F, -8.75F);

		bodyModel[212].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 2
		bodyModel[212].setRotationPoint(2.5F, 3F, 4.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[213].setRotationPoint(25.5F, 4F, 0F);
		bodyModel[213].rotateAngleX = -0.78539816F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[214].setRotationPoint(25.49F, 4F, -0.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[215].setRotationPoint(31.51F, 4F, -0.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 316
		bodyModel[216].setRotationPoint(2.5F, 3F, -9.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[217].setRotationPoint(25.5F, 3F, 8.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 41
		bodyModel[218].setRotationPoint(-14.5F, 3.34F, 9F);
		bodyModel[218].rotateAngleX = -0.78539816F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[219].setRotationPoint(-14.51F, 3F, 8.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 41
		bodyModel[220].setRotationPoint(-9.49F, 3F, 8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[221].setRotationPoint(54.05F, -2F, 9.95F);
		bodyModel[221].rotateAngleY = -2.35619449F;

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[222].setRotationPoint(54.4F, -1F, 9.6F);
		bodyModel[222].rotateAngleY = -2.35619449F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[223].setRotationPoint(54.05F, 0.5F, 9.95F);
		bodyModel[223].rotateAngleY = -2.35619449F;

		bodyModel[224].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 366
		bodyModel[224].setRotationPoint(52.5F, -15F, -5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 368
		bodyModel[225].setRotationPoint(53.15F, -1F, -8.35F);
		bodyModel[225].rotateAngleY = -0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 369
		bodyModel[226].setRotationPoint(52.45F, 0.5F, -8.35F);
		bodyModel[226].rotateAngleY = -0.78539816F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[227].setRotationPoint(51.55F, -2F, -8.9F);
		bodyModel[227].rotateAngleY = -0.78539816F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 88, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[228].setRotationPoint(-32.5F, -15F, 9.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 88, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[229].setRotationPoint(-32.5F, -15F, -10.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 379
		bodyModel[230].setRotationPoint(46.5F, -8.5F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[231].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 381
		bodyModel[232].setRotationPoint(46.5F, -2.4F, -9F);
		bodyModel[232].rotateAngleZ = 1.04719755F;

		bodyModel[233].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 382
		bodyModel[233].setRotationPoint(47.75F, -5F, -7.5F);
		bodyModel[233].rotateAngleY = -0.78539816F;

		bodyModel[234].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 86 glow
		bodyModel[234].setRotationPoint(50.5F, -14.99F, -7.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 384 glow
		bodyModel[235].setRotationPoint(-18.5F, -16.99F, -5F);

		bodyModel[236].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 386 glow
		bodyModel[236].setRotationPoint(-18.5F, -16.99F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[237].setRotationPoint(51F, -13.99F, -0.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 64, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 386
		bodyModel[238].setRotationPoint(-18.5F, -14F, 9.66F);
		bodyModel[238].rotateAngleX = 0.16580628F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 64, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 391
		bodyModel[239].setRotationPoint(-18.5F, -14F, -9.66F);
		bodyModel[239].rotateAngleX = -0.16580628F;

		bodyModel[240].addShapeBox(0F, 0F, -3F, 64, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 386
		bodyModel[240].setRotationPoint(-18.5F, -11.98F, 10F);
		bodyModel[240].rotateAngleX = -0.34906585F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 64, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 393
		bodyModel[241].setRotationPoint(-18.5F, -11.98F, -10F);
		bodyModel[241].rotateAngleX = 0.34906585F;

		bodyModel[242].addShapeBox(0F, 0F, -3F, 64, 0, 3, 0F,0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[242].setRotationPoint(-18.5F, -14F, 9.66F);
		bodyModel[242].rotateAngleX = 0.38135444F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 64, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F); // Box 395
		bodyModel[243].setRotationPoint(-18.5F, -14F, -9.66F);
		bodyModel[243].rotateAngleX = -0.38135444F;

		bodyModel[244].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[244].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[244].rotateAngleY = -3.14159265F;

		bodyModel[245].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[245].setRotationPoint(36.5F, -8F, 7F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[246].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[246].rotateAngleY = -3.14159265F;

		bodyModel[247].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[247].setRotationPoint(36.5F, -8F, -7F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[248].setRotationPoint(35F, -1F, 5F);

		bodyModel[249].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[249].setRotationPoint(35F, -1F, -9F);

		bodyModel[250].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[250].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[251].setRotationPoint(36.5F, -3F, 7F);
		bodyModel[251].rotateAngleY = -3.14159265F;

		bodyModel[252].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[252].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[252].rotateAngleY = -3.14159265F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[253].setRotationPoint(36.5F, -3F, -7F);
		bodyModel[253].rotateAngleY = -3.14159265F;

		bodyModel[254].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[254].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[254].rotateAngleY = -3.14159265F;

		bodyModel[255].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[255].setRotationPoint(36.5F, -5F, 7F);
		bodyModel[255].rotateAngleY = -3.14159265F;

		bodyModel[256].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[256].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[256].rotateAngleY = -3.14159265F;

		bodyModel[257].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[257].setRotationPoint(36.5F, -5F, -7F);
		bodyModel[257].rotateAngleY = -3.14159265F;

		bodyModel[258].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[258].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[258].rotateAngleY = -3.14159265F;

		bodyModel[259].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[259].setRotationPoint(26.5F, -8F, 7F);
		bodyModel[259].rotateAngleY = -3.14159265F;

		bodyModel[260].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[260].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[260].rotateAngleY = -3.14159265F;

		bodyModel[261].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[261].setRotationPoint(26.5F, -8F, -7F);
		bodyModel[261].rotateAngleY = -3.14159265F;

		bodyModel[262].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[262].setRotationPoint(25F, -1F, 5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[263].setRotationPoint(25F, -1F, -9F);

		bodyModel[264].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[264].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[264].rotateAngleY = -3.14159265F;

		bodyModel[265].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[265].setRotationPoint(26.5F, -3F, 7F);
		bodyModel[265].rotateAngleY = -3.14159265F;

		bodyModel[266].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[266].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[266].rotateAngleY = -3.14159265F;

		bodyModel[267].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[267].setRotationPoint(26.5F, -3F, -7F);
		bodyModel[267].rotateAngleY = -3.14159265F;

		bodyModel[268].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[268].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[268].rotateAngleY = -3.14159265F;

		bodyModel[269].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[269].setRotationPoint(26.5F, -5F, 7F);
		bodyModel[269].rotateAngleY = -3.14159265F;

		bodyModel[270].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[270].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[270].rotateAngleY = -3.14159265F;

		bodyModel[271].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[271].setRotationPoint(26.5F, -5F, -7F);
		bodyModel[271].rotateAngleY = -3.14159265F;

		bodyModel[272].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[272].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[272].rotateAngleY = -3.14159265F;

		bodyModel[273].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[273].setRotationPoint(16.5F, -8F, 7F);
		bodyModel[273].rotateAngleY = -3.14159265F;

		bodyModel[274].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[274].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[275].setRotationPoint(16.5F, -8F, -7F);
		bodyModel[275].rotateAngleY = -3.14159265F;

		bodyModel[276].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[276].setRotationPoint(15F, -1F, 5F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[277].setRotationPoint(15F, -1F, -9F);

		bodyModel[278].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[278].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[278].rotateAngleY = -3.14159265F;

		bodyModel[279].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[279].setRotationPoint(16.5F, -3F, 7F);
		bodyModel[279].rotateAngleY = -3.14159265F;

		bodyModel[280].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[280].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[280].rotateAngleY = -3.14159265F;

		bodyModel[281].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[281].setRotationPoint(16.5F, -3F, -7F);
		bodyModel[281].rotateAngleY = -3.14159265F;

		bodyModel[282].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[282].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[282].rotateAngleY = -3.14159265F;

		bodyModel[283].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[283].setRotationPoint(16.5F, -5F, 7F);
		bodyModel[283].rotateAngleY = -3.14159265F;

		bodyModel[284].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[284].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[285].setRotationPoint(16.5F, -5F, -7F);
		bodyModel[285].rotateAngleY = -3.14159265F;

		bodyModel[286].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[286].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[286].rotateAngleY = -3.14159265F;

		bodyModel[287].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[287].setRotationPoint(6.5F, -8F, 7F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[288].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[289].setRotationPoint(6.5F, -8F, -7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[290].setRotationPoint(5F, -1F, 5F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[291].setRotationPoint(5F, -1F, -9F);

		bodyModel[292].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[292].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(6.5F, -3F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(6.5F, -3F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[296].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[297].setRotationPoint(6.5F, -5F, 7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[298].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[299].setRotationPoint(6.5F, -5F, -7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[300].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(-3.5F, -8F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[302].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[303].setRotationPoint(-3.5F, -8F, -7F);
		bodyModel[303].rotateAngleY = -3.14159265F;

		bodyModel[304].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[304].setRotationPoint(-5F, -1F, 5F);

		bodyModel[305].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[305].setRotationPoint(-5F, -1F, -9F);

		bodyModel[306].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[306].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[306].rotateAngleY = -3.14159265F;

		bodyModel[307].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[307].setRotationPoint(-3.5F, -3F, 7F);
		bodyModel[307].rotateAngleY = -3.14159265F;

		bodyModel[308].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[308].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[308].rotateAngleY = -3.14159265F;

		bodyModel[309].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[309].setRotationPoint(-3.5F, -3F, -7F);
		bodyModel[309].rotateAngleY = -3.14159265F;

		bodyModel[310].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[310].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[310].rotateAngleY = -3.14159265F;

		bodyModel[311].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[311].setRotationPoint(-3.5F, -5F, 7F);
		bodyModel[311].rotateAngleY = -3.14159265F;

		bodyModel[312].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[312].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[312].rotateAngleY = -3.14159265F;

		bodyModel[313].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[313].setRotationPoint(-3.5F, -5F, -7F);
		bodyModel[313].rotateAngleY = -3.14159265F;

		bodyModel[314].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Right seat part
		bodyModel[314].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[314].rotateAngleY = -3.14159265F;

		bodyModel[315].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[315].setRotationPoint(-13.5F, -8F, 7F);
		bodyModel[315].rotateAngleY = -3.14159265F;

		bodyModel[316].addBox(-2.5F, 0F, -2F, 6, 2, 4, 0F); // Left seat part
		bodyModel[316].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[316].rotateAngleY = -3.14159265F;

		bodyModel[317].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[317].setRotationPoint(-13.5F, -8F, -7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[318].setRotationPoint(-15F, -1F, 5F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[319].setRotationPoint(-15F, -1F, -9F);

		bodyModel[320].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[320].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[321].setRotationPoint(-13.5F, -3F, 7F);
		bodyModel[321].rotateAngleY = -3.14159265F;

		bodyModel[322].addShapeBox(-2.5F, 0F, 2F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[322].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[322].rotateAngleY = -3.14159265F;

		bodyModel[323].addShapeBox(-2.5F, 0F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[323].setRotationPoint(-13.5F, -3F, -7F);
		bodyModel[323].rotateAngleY = -3.14159265F;

		bodyModel[324].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[324].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[324].rotateAngleY = -3.14159265F;

		bodyModel[325].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Right seat part cull
		bodyModel[325].setRotationPoint(-13.5F, -5F, 7F);
		bodyModel[325].rotateAngleY = -3.14159265F;

		bodyModel[326].addShapeBox(-2.5F, 0F, 2F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[326].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[326].rotateAngleY = -3.14159265F;

		bodyModel[327].addShapeBox(-2.5F, 0F, -3F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Left seat part cull
		bodyModel[327].setRotationPoint(-13.5F, -5F, -7F);
		bodyModel[327].rotateAngleY = -3.14159265F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[328].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[329].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 384
		bodyModel[330].setRotationPoint(-18.5F, -17F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 74, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[331].setRotationPoint(-18.5F, -11F, -9.9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 74, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[332].setRotationPoint(-18.5F, -11F, 9.9F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[333].setRotationPoint(45.5F, -13F, 3F);

		bodyModel[334].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[334].setRotationPoint(45.5F, -15F, 3F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[335].setRotationPoint(45.5F, -15F, 9F);

		bodyModel[336].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 128
		bodyModel[336].setRotationPoint(46.5F, -15F, 3F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 128
		bodyModel[337].setRotationPoint(46.5F, -15F, 4F);

		bodyModel[338].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 128
		bodyModel[338].setRotationPoint(52.5F, -15F, 4F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 128
		bodyModel[339].setRotationPoint(46.5F, -8.5F, 6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[340].setRotationPoint(46.5F, -6F, 6F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 128
		bodyModel[341].setRotationPoint(46.5F, -2.4F, 6F);
		bodyModel[341].rotateAngleZ = 1.04719755F;

		bodyModel[342].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 41
		bodyModel[342].setRotationPoint(47.75F, -5F, 7.5F);
		bodyModel[342].rotateAngleY = -0.78539816F;

		bodyModel[343].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 384 glow
		bodyModel[343].setRotationPoint(50.5F, -14.99F, 6.5F);

		bodyModel[344].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[344].setRotationPoint(-19.5F, -13F, 3F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[345].setRotationPoint(-19.5F, -15F, 3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[346].setRotationPoint(-19.5F, -15F, 9F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[347].setRotationPoint(-19.5F, -13F, -10F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 86
		bodyModel[348].setRotationPoint(-19.5F, -15F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[349].setRotationPoint(-19.5F, -15F, -10F);

		bodyModel[350].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[350].setRotationPoint(-19.5F, -15F, -3F);

		bodyModel[351].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 561
		bodyModel[351].setRotationPoint(45.5F, -13F, -10F);

		bodyModel[352].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 562
		bodyModel[352].setRotationPoint(45.5F, -15F, -9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[353].setRotationPoint(45.5F, -15F, -10F);

		bodyModel[354].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 564
		bodyModel[354].setRotationPoint(46.5F, -15F, -4F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[355].setRotationPoint(-19.5F, -17F, -8.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[356].setRotationPoint(-19.5F, -17F, -9.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[357].setRotationPoint(-19.5F, -17F, 8.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 316
		bodyModel[358].setRotationPoint(16.5F, 3F, -9.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[359].setRotationPoint(-22.5F, 3F, 8F);
		bodyModel[359].rotateAngleX = -0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[360].setRotationPoint(-22.51F, 3F, 7.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[361].setRotationPoint(-17.49F, 3F, 7.5F);

		bodyModel[362].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 2
		bodyModel[362].setRotationPoint(17.5F, 3F, 4.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[363].setRotationPoint(-9.5F, -20.25F, 6.25F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[364].setRotationPoint(-9.5F, -20.25F, 5.75F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[365].setRotationPoint(-26.5F, -20.25F, -9.25F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[366].setRotationPoint(-26.5F, -20.25F, -6.75F);

		bodyModel[367].addBox(-0.5F, 0F, 0F, 1, 15, 6, 0F); // Box 128 baggage bulkead door
		bodyModel[367].setRotationPoint(-19F, -14F, -3F);

		bodyModel[368].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 623
		bodyModel[368].setRotationPoint(46.5F, -15F, -5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 128
		bodyModel[369].setRotationPoint(52.5F, 3F, 9.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[370].setRotationPoint(-55.5F, 3F, 9.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[371].setRotationPoint(52.5F, 3F, 9.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 128
		bodyModel[372].setRotationPoint(51.5F, 3F, 9.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[373].setRotationPoint(-55.5F, 3F, 9.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 571
		bodyModel[374].setRotationPoint(52.5F, 3F, -10.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[375].setRotationPoint(-55.5F, 3F, -10.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[376].setRotationPoint(-60.5F, 3F, -10.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[377].setRotationPoint(52.5F, 3F, -10.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 575
		bodyModel[378].setRotationPoint(51.5F, 3F, -10.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[379].setRotationPoint(-55.5F, 3F, -10.5F);

		bodyModel[380].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 38
		bodyModel[380].setRotationPoint(11.5F, -14F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[381].setRotationPoint(11.5F, -13F, 9F);

		bodyModel[382].addBox(0F, 0F, 0F, 34, 1, 3, 0F); // Box 275
		bodyModel[382].setRotationPoint(11.5F, -14F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[383].setRotationPoint(11.5F, -13F, -10F);

		bodyModel[384].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 275 glow
		bodyModel[384].setRotationPoint(-18.5F, -12.99F, -8.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 64, 0, 1, 0F); // Box 285 glow
		bodyModel[385].setRotationPoint(-18.5F, -12.99F, 7.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 38
		bodyModel[386].setRotationPoint(-18.5F, -14F, 7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[387].setRotationPoint(-18.5F, -13F, 9F);

		bodyModel[388].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 275
		bodyModel[388].setRotationPoint(-18.5F, -14F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[389].setRotationPoint(-18.5F, -13F, -10F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F); // Box 128 cull
		bodyModel[390].setRotationPoint(56.5F, -14F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F); // Box 128 cull
		bodyModel[391].setRotationPoint(56.5F, -13F, 9.99F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.01F, -0.01F, -0.51F, -0.01F, -0.01F, -0.51F, -0.01F, -0.01F, 0.25F, -0.01F, -0.01F, 0.25F, -0.01F, 0F, -0.26F, -0.01F, 0F, -0.26F, -0.01F, 0F, 0.01F, -0.01F, 0F, 0.01F); // Box 685 cull
		bodyModel[392].setRotationPoint(56.5F, -14F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F,-0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 686 cull
		bodyModel[393].setRotationPoint(56.5F, -13F, -10.99F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[394].setRotationPoint(-21.5F, -20.25F, 6.25F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[395].setRotationPoint(-21.5F, -20.25F, 5.75F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[396].setRotationPoint(10.5F, -13F, 3F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 128
		bodyModel[397].setRotationPoint(10.5F, -15F, 3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[398].setRotationPoint(10.5F, -15F, 9F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 128
		bodyModel[399].setRotationPoint(10.5F, -13F, -10F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 86
		bodyModel[400].setRotationPoint(10.5F, -15F, -9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[401].setRotationPoint(10.5F, -15F, -10F);

		bodyModel[402].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[402].setRotationPoint(10.5F, -15F, -3F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 2, 17, 0F); // Box 128
		bodyModel[403].setRotationPoint(10.5F, -17F, -8.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[404].setRotationPoint(10.5F, -17F, -9.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[405].setRotationPoint(10.5F, -17F, 8.5F);

		bodyModel[406].addBox(-0.5F, 0F, 0F, 1, 15, 6, 0F); // Box 128 bulkead door
		bodyModel[406].setRotationPoint(11F, -14F, -3F);
		bodyModel[406].rotateAngleY = -1.57079633F;

		bodyModel[407].addBox(0F, 0F, 0F, 21, 14, 1, 0F); // Box 38
		bodyModel[407].setRotationPoint(-60.5F, -13F, -11F);

		bodyModel[408].addBox(0F, 0F, 0F, 21, 14, 1, 0F); // Box 128
		bodyModel[408].setRotationPoint(-60.5F, -13F, 10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[409].setRotationPoint(-59.5F, -15F, -10.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 128
		bodyModel[410].setRotationPoint(-59.5F, -15F, 9.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		bodyModel[411].setRotationPoint(-61F, -13F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[412].setRotationPoint(-60.5F, -15F, -3F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 14, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 487
		bodyModel[413].setRotationPoint(-61F, -13F, 3F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[414].setRotationPoint(-60.5F, -17F, -5.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.42F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.46F, 0F, 0F, -0.42F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.42F, 0F, 0F); // Box 128
		bodyModel[415].setRotationPoint(-60.5F, -17F, -9.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, -2.365F, 0F, 0F, 0.235F, 0F, 0F, 1F, 0F, -1F, -1.6F, 0F, -1.05F, 1.365F, 0F, 0F, -1.185F, 0F, 0F, -1.95F, 0F, -1.05F, 0.6F, 0F); // Box 128
		bodyModel[416].setRotationPoint(-62.5F, -18.6F, -4F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.46F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.01F, 0F, 0F, -0.42F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[417].setRotationPoint(-60.5F, -17F, -7.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.04F, 0F, 0F, 0.05F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0.04F, -1F, 0F); // Box 65
		bodyModel[418].setRotationPoint(-60F, -17F, -9.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -2F, 0F, -0.04F, 1F, -2F, -0.04F, 1F, 0F, -0.85F, -1.62F, 0F, -1.06F, 1F, -0.01F, -0.04F, -1.95F, -2F, -0.04F, -1.95F, 0F, -0.9F, 0.62F, 0F); // Box 128
		bodyModel[419].setRotationPoint(-62F, -17F, -10.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.635F, 0F, 0F, -0.635F, 0F, 0F, 0F, -0.25F, -0.825F, 0F, -0.25F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 128
		bodyModel[420].setRotationPoint(-60.5F, -18F, -7.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -1F, 0F, 0F, -1F, 0F, 0F, -0.635F, 0F, -0.75F, -0.635F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.46F, 0F, 0F); // Box 128
		bodyModel[421].setRotationPoint(-60.5F, -18F, -8.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 128
		bodyModel[422].setRotationPoint(-59.5F, -17.05F, -3F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.825F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 128
		bodyModel[423].setRotationPoint(-60.5F, -18F, -5.75F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.825F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, -0.75F, -0.77F, 0F, -0.75F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.01F, 0F, -0.75F); // Box 128
		bodyModel[424].setRotationPoint(-60.5F, -18F, -5.75F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.76F, -1.7F, 0F, -0.24F, -1.7F, 0F, -0.525F, -1.19F, -0.25F, -0.475F, -1.19F, -0.25F, 0F, 1.65F, 0F, -0.24F, 1.65F, 0F, -0.525F, 0.65F, -0.25F, -0.1275F, 0.65F, -0.25F); // Box 128
		bodyModel[425].setRotationPoint(-59.8F, -19.65F, -8.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -2F, 0F, -0.04F, -2F, 0F, -0.04F, 1F, -1F, -1.96F, 1F, -1F, -1.02F, -0.21F, -1.11F, -0.04F, -0.21F, -1.11F, -0.04F, -2F, -1F, -1.96F, -2F, -1F); // Box 128
		bodyModel[426].setRotationPoint(-61F, -17F, -10.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.64F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.235F, 0F, 0F, -0.235F, 0F, 0F, -1F, 0F, -0.05F, -1F, 0F); // Box 128
		bodyModel[427].setRotationPoint(-61.5F, -17F, -4F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.785F, -0.5F, 0F, 0F, -0.21F, 0F, 0F, 0.55F, 0F, -0.785F, 0.27F, 0F, -0.785F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.785F, 0F, 0F); // Box 128
		bodyModel[428].setRotationPoint(-60.5F, -19F, -4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.91F, 0F, 0F, 0.29F, 0F, 0F, 0.29F, 0F, 0F, -0.32F, 0F, 0F, -0.14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F); // Box 128
		bodyModel[429].setRotationPoint(-61F, -18F, -4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.61F, -1F, 0F, -0.015F, -0.5F, 0F, -0.015F, 0.27F, 0F, -0.02F, -1F, 0F, -0.61F, 0F, 0F, -0.015F, 0F, 0F, -0.015F, 0F, 0F, -0.02F, 0F, 0F); // Box 128
		bodyModel[430].setRotationPoint(-60.7F, -19F, -4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.43F, 0F, -0.07F, -0.43F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[431].setRotationPoint(-61F, -16F, -7.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, 0.235F, -0.5F, 0F, 0.235F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[432].setRotationPoint(-61F, -16F, -5.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.01F, 0F, 0F, 0.01F, 0F, 0F, -0.46F, 0F, 0F, -0.54F, 0F, 0F, 0.125F, -0.57F, 0F, -0.02F, -0.57F, 0F, -0.45F, -0.95F, 0F, 0.285F, -0.95F, 0F); // Box 128
		bodyModel[433].setRotationPoint(-61.05F, -17F, -7.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.07F, -0.305F, -1F, -0.83F, 0F, -1F, -1.07F, 0F, 0F, 0.07F, 0F, 0F, 0.11F, 0.8F, -0.1F, -1.055F, 0.8F, -0.1F, -1.08F, 1F, -2F, 0.11F, 1F, -2F); // Box 65
		bodyModel[434].setRotationPoint(-59.97F, -17F, -9.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.04F, -1F, 0F, -0.04F, -0.79F, 0.11F, 0F, -0.79F, 0.11F, 0F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[435].setRotationPoint(-61F, -16F, -10.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.79F, -0.11F, -0.08F, -0.79F, -0.11F, -0.07F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[436].setRotationPoint(-61F, -16F, -9.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.64F, 0F, -0.5F, -0.165F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.235F, -0.5F, -0.05F, -0.235F, -0.5F); // Box 128
		bodyModel[437].setRotationPoint(-61.5F, -17F, -5.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.02F, 0F, 0F, 0.045F, 0F, 0F, 0.045F, 0F, -0.5F, -0.66F, 0F, -0.5F, -0.24F, 0F, 0F, -0.255F, 0F, 0F, -0.255F, 0F, -0.5F, 0.11F, 0F, -0.5F); // Box 128
		bodyModel[438].setRotationPoint(-60.75F, -18F, -5.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.985F, -0.785F, 0F, 0.175F, -0.54F, 0F, 0F, -0.21F, -0.25F, -1F, -0.21F, -0.25F, -1F, 0F, 0F, 0.175F, 0F, 0F, 0F, -0.64F, -0.25F, -1F, -0.64F, -0.25F); // Box 128
		bodyModel[439].setRotationPoint(-60.5F, -19F, -5.75F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.985F, -0.785F, 0F, -0.015F, -0.785F, 0F, 0F, -0.21F, -0.25F, -1F, -0.21F, -0.25F, -0.825F, 0F, 0F, -0.015F, 0F, 0F, 0.035F, 0F, -0.25F, -0.41F, 0F, -0.25F); // Box 128
		bodyModel[440].setRotationPoint(-60.5F, -19F, -5.75F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.34F, -1F, -0.38F, -0.04F, -0.05F, -1F, -0.04F, -0.05F, 0F, -0.205F, -1F, 0F, -0.34F, 0F, -0.38F, -0.04F, 0F, -1F, -0.04F, 0F, 0F, -0.205F, 0F, 0F); // Box 128
		bodyModel[441].setRotationPoint(-60F, -18F, -9.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.96F, -0.305F, -1F, -0.04F, -0.305F, -1F, -0.04F, 0F, 0F, -0.96F, 0F, 0F, 0.04F, 0.795F, -0.105F, -0.075F, 0.795F, -0.105F, -0.07F, 0.43F, 0F, 0.175F, 0.43F, 0F); // Box 65
		bodyModel[442].setRotationPoint(-61F, -17F, -9.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.34F, 0F, -0.38F, -0.04F, 0F, -1F, -0.04F, 0F, -1F, -0.2F, 0F, -1F, 0F, 0.795F, -0.1F, -1F, 0.795F, -0.1F, -0.04F, -1F, -1F, -0.2F, -1F, -1F); // Box 65
		bodyModel[443].setRotationPoint(-60F, -17F, -9.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.96F, -0.505F, -0.28F, 0.34F, 0F, -0.38F, 0.2F, 0F, -1F, -0.96F, -0.305F, -1F, -0.92F, 0.795F, -0.1F, 0F, 0.795F, -0.1F, 0.2F, -1F, -1F, -0.96F, -0.695F, -1F); // Box 65
		bodyModel[444].setRotationPoint(-61F, -17F, -9.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.36F, -0.505F, -0.28F, 0.36F, -0.505F, -0.28F, 0.36F, -0.305F, -1F, -1.36F, -0.305F, -1F, -0.36F, 0.795F, -0.105F, 0.32F, 0.795F, -0.105F, 0.36F, -0.695F, -1F, -1.36F, -0.695F, -1F); // Box 65
		bodyModel[445].setRotationPoint(-61.4F, -17F, -9.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.35F, 0F, -1.03F, 0.35F, 0F, -1.03F, 0.35F, 0F, -0.97F, -1.35F, 0F, -0.97F, -0.05F, 0.99F, 0.29F, 0F, 0.795F, -0.75F, 0F, 0.795F, -1.245F, 0.04F, 0.795F, -1.245F); // Box 65
		bodyModel[446].setRotationPoint(-61F, -17F, -10.15F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.975F, 0F, 0F, -0.05F, 0F, -2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 499
		bodyModel[447].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -2F, -0.05F, 0F); // Box 500
		bodyModel[448].setRotationPoint(-59.5F, -20F, 0F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -0.46F, -2F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, -0.46F, 2F, 0F); // Box 487
		bodyModel[449].setRotationPoint(-59.5F, -20F, 2.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.3F, -0.815F, -0.5F, 0.02F, -0.015F, -0.5F, -1.24F, -1.65F, 0F, -0.76F, -1.65F, 0F, -0.3F, 0.015F, -0.5F, 0.02F, 0.015F, -0.5F, -1.24F, 1.65F, 0F, -0.76F, 1.65F, 0F); // Box 488
		bodyModel[450].setRotationPoint(-59.8F, -19.65F, 3.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, -0.625F, 0F, 0.3F, 0.35F, 0F, 0.02F, -0.015F, 0F, -0.3F, -0.815F, 0F, -0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.02F, 0.015F, 0F, -0.3F, 0.015F, 0F); // Box 489
		bodyModel[451].setRotationPoint(-59.8F, -19.65F, 3F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[452].setRotationPoint(-60.5F, -15F, 9F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[453].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.89F, -2.42F, 0F, 0F, 0.2F, 0F, -0.46F, 1.035F, -0.5F, -0.535F, -1.565F, -0.5F, -0.94F, 1.42F, 0F, 0F, -1.15F, 0F, -0.46F, -1.985F, -0.5F, -0.585F, 0.565F, -0.5F); // Box 537
		bodyModel[454].setRotationPoint(-62.04F, -17.8F, -8.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -0.765F, 0F, -0.5F, -0.765F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 538
		bodyModel[455].setRotationPoint(-61.5F, -17F, 4F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.07F, -0.43F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[456].setRotationPoint(-61F, -16F, 5.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.235F, -0.5F, -0.5F, 0.235F, -0.5F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[457].setRotationPoint(-61F, -16F, 3.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.43F, 0F, -0.07F, -0.43F, 0F, -0.08F, -0.79F, -0.11F, 0F, -0.79F, -0.11F, 0F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[458].setRotationPoint(-61F, -16F, 7.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.46F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.42F, -2F, 0F, -0.42F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.42F, 0F, 0F); // Box 543
		bodyModel[459].setRotationPoint(-60.5F, -17F, 7.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.42F, 0F, 0F); // Box 544
		bodyModel[460].setRotationPoint(-60.5F, -17F, 5.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.64F, 0F, 0F, -0.05F, -1F, 0F, 0F, -1F, 0F, 0F, -0.235F, 0F, -0.05F, -0.235F, 0F); // Box 545
		bodyModel[461].setRotationPoint(-61.5F, -17F, 0F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.54F, 0F, 0F, -0.46F, 0F, 0F, 0.01F, 0F, 0F, -1.01F, 0F, 0F, 0.285F, -0.95F, 0F, -0.45F, -0.95F, 0F, -0.02F, -0.57F, 0F, 0.125F, -0.57F, 0F); // Box 546
		bodyModel[462].setRotationPoint(-61.05F, -17F, 5.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.64F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.05F, -0.235F, -0.5F, 0F, -0.235F, -0.5F, 0F, 0.05F, 0F, -0.165F, 0.05F, 0F); // Box 547
		bodyModel[463].setRotationPoint(-61.5F, -17F, 3.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.96F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, -0.305F, -1F, -0.96F, -0.305F, -1F, 0.175F, 0.43F, 0F, -0.07F, 0.43F, 0F, -0.075F, 0.795F, -0.105F, 0.04F, 0.795F, -0.105F); // Box 548
		bodyModel[464].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, -1F, -0.46F, 1F, -1F, -0.46F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -0.46F, -2F, -1F, -0.46F, 0F, -1F, 0F, 0F, -1F); // Box 549
		bodyModel[465].setRotationPoint(-59.04F, -17F, 7.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.04F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.2F, 0F, -1F, 0.04F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0.05F, 1F, 0F); // Box 551
		bodyModel[466].setRotationPoint(-60F, -17F, 7.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.07F, 0F, 0F, -1.07F, 0F, 0F, -0.83F, 0F, -1F, 0.07F, -0.305F, -1F, 0.11F, 1F, -2F, -1.08F, 1F, -2F, -1.055F, 0.8F, -0.1F, 0.11F, 0.8F, -0.1F); // Box 552
		bodyModel[467].setRotationPoint(-59.97F, -17F, 7.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, -1F, -0.04F, 0F, -1F, -0.04F, 0F, -1F, -0.34F, 0F, -0.38F, -0.2F, -1F, -1F, -0.04F, -1F, -1F, -1F, 0.795F, -0.1F, 0F, 0.795F, -0.1F); // Box 553
		bodyModel[468].setRotationPoint(-60F, -17F, 7.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.35F, 0F, -0.97F, 0.35F, 0F, -0.97F, 0.35F, 0F, -1.03F, -1.35F, 0F, -1.03F, 0.04F, 0.795F, -1.245F, 0F, 0.795F, -1.245F, 0F, 0.795F, -0.75F, -0.05F, 0.99F, 0.29F); // Box 554
		bodyModel[469].setRotationPoint(-61F, -17F, 8.15F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.475F, -1.19F, -0.25F, -0.525F, -1.19F, -0.25F, -0.24F, -1.7F, 0F, -0.76F, -1.7F, 0F, -0.1275F, 0.65F, -0.25F, -0.525F, 0.65F, -0.25F, -0.24F, 1.65F, 0F, 0F, 1.65F, 0F); // Box 555
		bodyModel[470].setRotationPoint(-59.8F, -19.65F, 5.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.205F, -1F, 0F, -0.04F, -0.05F, 0F, -0.04F, -0.05F, -1F, -0.34F, -1F, -0.38F, -0.205F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, 0F, -1F, -0.34F, 0F, -0.38F); // Box 556
		bodyModel[471].setRotationPoint(-60F, -18F, 8.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.96F, -0.305F, -1F, 0.2F, 0F, -1F, 0.34F, 0F, -0.38F, -0.96F, -0.505F, -0.28F, -0.96F, -0.695F, -1F, 0.2F, -1F, -1F, 0F, 0.795F, -0.1F, -0.92F, 0.795F, -0.1F); // Box 557
		bodyModel[472].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.36F, -0.305F, -1F, 0.36F, -0.305F, -1F, 0.36F, -0.505F, -0.28F, -1.36F, -0.505F, -0.28F, -1.36F, -0.695F, -1F, 0.36F, -0.695F, -1F, 0.32F, 0.795F, -0.105F, -0.36F, 0.795F, -0.105F); // Box 558
		bodyModel[473].setRotationPoint(-61.4F, -17F, 7.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.825F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.635F, 0F, -0.75F, -0.635F, 0F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.46F, 0F, 0F); // Box 559
		bodyModel[474].setRotationPoint(-60.5F, -18F, 5.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.635F, 0F, 0F, -0.635F, 0F, 0F, -1F, 0F, -0.7F, -1F, 0F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 560
		bodyModel[475].setRotationPoint(-60.5F, -18F, 7.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.77F, 0F, -0.75F, -0.175F, 0F, -0.75F, -0.175F, 0F, 0F, -0.825F, 0F, 0F, 0.01F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.05F, 0F, 0F); // Box 561
		bodyModel[476].setRotationPoint(-60.5F, -18F, 4.75F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.32F, 0F, 0F, 0.29F, 0F, 0F, 0.29F, 0F, 0F, -0.91F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.14F, 0F, 0F); // Box 562
		bodyModel[477].setRotationPoint(-61F, -18F, 0F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.66F, 0F, -0.5F, 0.045F, 0F, -0.5F, 0.045F, 0F, 0F, -1.02F, 0F, 0F, 0.11F, 0F, -0.5F, -0.255F, 0F, -0.5F, -0.255F, 0F, 0F, -0.24F, 0F, 0F); // Box 563
		bodyModel[478].setRotationPoint(-60.75F, -18F, 3.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.785F, 0.27F, 0F, 0F, 0.55F, 0F, 0F, -0.21F, 0F, -0.785F, -0.5F, 0F, -0.785F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.785F, 0F, 0F); // Box 564
		bodyModel[479].setRotationPoint(-60.5F, -19F, 0F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.21F, -0.25F, 0F, -0.21F, -0.25F, 0.175F, -0.54F, 0F, -0.985F, -0.785F, 0F, -1F, -0.64F, -0.25F, 0F, -0.64F, -0.25F, 0.175F, 0F, 0F, -1F, 0F, 0F); // Box 565
		bodyModel[480].setRotationPoint(-60.5F, -19F, 3.75F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.21F, -0.25F, 0F, -0.21F, -0.25F, -0.015F, -0.785F, 0F, -0.985F, -0.785F, 0F, -0.41F, 0F, -0.25F, 0.035F, 0F, -0.25F, -0.015F, 0F, 0F, -0.825F, 0F, 0F); // Box 566
		bodyModel[481].setRotationPoint(-60.5F, -19F, 3.75F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.02F, -1F, 0F, -0.015F, 0.27F, 0F, -0.015F, -0.5F, 0F, -0.61F, -1F, 0F, -0.02F, 0F, 0F, -0.015F, 0F, 0F, -0.015F, 0F, 0F, -0.61F, 0F, 0F); // Box 567
		bodyModel[482].setRotationPoint(-60.7F, -19F, 0F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, -1.6F, 0F, 0F, 1F, 0F, 0F, 0.235F, 0F, -1F, -2.365F, 0F, -1.05F, 0.6F, 0F, 0F, -1.95F, 0F, 0F, -1.185F, 0F, -1.05F, 1.365F, 0F); // Box 568
		bodyModel[483].setRotationPoint(-62.5F, -18.6F, 0F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.85F, -1.62F, 0F, -0.04F, 1F, 0F, -0.04F, 1F, -2F, -1F, -2F, 0F, -0.9F, 0.62F, 0F, -0.04F, -1.95F, 0F, -0.04F, -1.95F, -2F, -1.06F, 1F, -0.01F); // Box 569
		bodyModel[484].setRotationPoint(-62F, -17F, 8.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.535F, -1.565F, -0.5F, -0.46F, 1.035F, -0.5F, 0F, 0.2F, 0F, -0.89F, -2.42F, 0F, -0.585F, 0.565F, -0.5F, -0.46F, -1.985F, -0.5F, 0F, -1.15F, 0F, -0.94F, 1.42F, 0F); // Box 570
		bodyModel[485].setRotationPoint(-62.04F, -17.8F, 3.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1.96F, 1F, -1F, -0.04F, 1F, -1F, -0.04F, -2F, 0F, 0F, -2F, 0F, -1.96F, -2F, -1F, -0.04F, -2F, -1F, -0.04F, -0.21F, -1.11F, -1.02F, -0.21F, -1.11F); // Box 575
		bodyModel[486].setRotationPoint(-61F, -17F, 7.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.79F, 0.11F, -0.04F, -0.79F, 0.11F, -0.04F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[487].setRotationPoint(-61F, -16F, 9.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[488].setRotationPoint(-60.5F, 3F, 9.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		bodyModel[489].setRotationPoint(-60.49F, 3F, -10.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[490].setRotationPoint(-57.51F, 3F, -10.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 156
		bodyModel[491].setRotationPoint(-60.5F, 4.5F, -10.5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 157
		bodyModel[492].setRotationPoint(-60.5F, 6F, -10.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[493].setRotationPoint(-60.49F, 3F, 9.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[494].setRotationPoint(-57.51F, 3F, 9.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 334
		bodyModel[495].setRotationPoint(-60.5F, 4.5F, 9.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 335
		bodyModel[496].setRotationPoint(-60.5F, 6F, 9.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		bodyModel[497].setRotationPoint(-38.49F, 3F, -10.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[498].setRotationPoint(-35.51F, 3F, -10.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 156
		bodyModel[499].setRotationPoint(-38.5F, 4.5F, -10.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 124, 150, textureX, textureY); // Box 157
		bodyModel[501] = new ModelRendererTurbo(this, 122, 158, textureX, textureY); // Box 332
		bodyModel[502] = new ModelRendererTurbo(this, 132, 158, textureX, textureY); // Box 333
		bodyModel[503] = new ModelRendererTurbo(this, 124, 159, textureX, textureY); // Box 334
		bodyModel[504] = new ModelRendererTurbo(this, 124, 161, textureX, textureY); // Box 335
		bodyModel[505] = new ModelRendererTurbo(this, 194, 159, textureX, textureY); // Box 52
		bodyModel[506] = new ModelRendererTurbo(this, 86, 20, textureX, textureY); // Box 199
		bodyModel[507] = new ModelRendererTurbo(this, 88, 17, textureX, textureY); // Box 199
		bodyModel[508] = new ModelRendererTurbo(this, 86, 1, textureX, textureY); // Box 282
		bodyModel[509] = new ModelRendererTurbo(this, 88, 7, textureX, textureY); // Box 283
		bodyModel[510] = new ModelRendererTurbo(this, 3, 259, textureX, textureY); // Box 384
		bodyModel[511] = new ModelRendererTurbo(this, 1, 263, textureX, textureY); // Box 384
		bodyModel[512] = new ModelRendererTurbo(this, 8, 263, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[513] = new ModelRendererTurbo(this, 17, 263, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[514] = new ModelRendererTurbo(this, 26, 263, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[515] = new ModelRendererTurbo(this, 35, 263, textureX, textureY,"lamp"); // Box 384 glow
		bodyModel[516] = new ModelRendererTurbo(this, 65, 229, textureX, textureY); // Box 374
		bodyModel[517] = new ModelRendererTurbo(this, 65, 238, textureX, textureY); // Box 521
		bodyModel[518] = new ModelRendererTurbo(this, 39, 388, textureX, textureY); // Box 374
		bodyModel[519] = new ModelRendererTurbo(this, 17, 229, textureX, textureY); // Box 374
		bodyModel[520] = new ModelRendererTurbo(this, 17, 238, textureX, textureY); // Box 525
		bodyModel[521] = new ModelRendererTurbo(this, 39, 361, textureX, textureY); // Box 526
		bodyModel[522] = new ModelRendererTurbo(this, 44, 390, textureX, textureY,"cull"); // Box 374 cull
		bodyModel[523] = new ModelRendererTurbo(this, 44, 365, textureX, textureY,"cull"); // Box 528 cull
		bodyModel[524] = new ModelRendererTurbo(this, 41, 391, textureX, textureY); // Box 374
		bodyModel[525] = new ModelRendererTurbo(this, 41, 366, textureX, textureY); // Box 530
		bodyModel[526] = new ModelRendererTurbo(this, 73, 390, textureX, textureY,"cull"); // Box 374 cull
		bodyModel[527] = new ModelRendererTurbo(this, 73, 363, textureX, textureY); // Box 526
		bodyModel[528] = new ModelRendererTurbo(this, 73, 368, textureX, textureY); // Box 526
		bodyModel[529] = new ModelRendererTurbo(this, 1, 399, textureX, textureY,"cull"); // Box 374 cull
		bodyModel[530] = new ModelRendererTurbo(this, 1, 388, textureX, textureY); // Box 374
		bodyModel[531] = new ModelRendererTurbo(this, 1, 374, textureX, textureY,"cull"); // Box 536 cull
		bodyModel[532] = new ModelRendererTurbo(this, 1, 363, textureX, textureY); // Box 537
		bodyModel[533] = new ModelRendererTurbo(this, 31, 148, textureX, textureY); // Box 2
		bodyModel[534] = new ModelRendererTurbo(this, 73, 398, textureX, textureY); // Baggage door L part
		bodyModel[535] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Baggage door R part
		bodyModel[536] = new ModelRendererTurbo(this, 24, 115, textureX, textureY); // Box 487
		bodyModel[537] = new ModelRendererTurbo(this, 13, 109, textureX, textureY); // Box 487

		bodyModel[500].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 157
		bodyModel[500].setRotationPoint(-38.5F, 6F, -10.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[501].setRotationPoint(-38.49F, 3F, 9.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[502].setRotationPoint(-35.51F, 3F, 9.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 334
		bodyModel[503].setRotationPoint(-38.5F, 4.5F, 9.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 335
		bodyModel[504].setRotationPoint(-38.5F, 6F, 9.5F);

		bodyModel[505].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 52
		bodyModel[505].setRotationPoint(11.5F, 3F, 4.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 199
		bodyModel[506].setRotationPoint(-42.5F, -20.25F, 6.25F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F); // Box 199
		bodyModel[507].setRotationPoint(-42.5F, -20.25F, 5.75F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 282
		bodyModel[508].setRotationPoint(-42.5F, -20.25F, -9.25F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.25F); // Box 283
		bodyModel[509].setRotationPoint(-42.5F, -20.25F, -6.75F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384
		bodyModel[510].setRotationPoint(-59.5F, -17F, -1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 384
		bodyModel[511].setRotationPoint(-60F, -17F, -1F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 glow
		bodyModel[512].setRotationPoint(-56F, -16.5F, -1F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 glow
		bodyModel[513].setRotationPoint(-46F, -16.5F, -1F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 glow
		bodyModel[514].setRotationPoint(-36F, -16.5F, -1F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384 glow
		bodyModel[515].setRotationPoint(-26F, -16.5F, -1F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.335F, 0F, 0F, -0.335F); // Box 374
		bodyModel[516].setRotationPoint(-39.5F, -15F, -10.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 521
		bodyModel[517].setRotationPoint(-39.5F, -15F, 9.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 21, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[518].setRotationPoint(-46.5F, -13.01F, -10.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 374
		bodyModel[519].setRotationPoint(-60F, -15F, -10.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 525
		bodyModel[520].setRotationPoint(-60F, -15F, 9.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 21, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 526
		bodyModel[521].setRotationPoint(-46.5F, -13.01F, 9.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 13, 16, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, -0.48F, 0F, -1F, -0.48F); // Box 374 cull
		bodyModel[522].setRotationPoint(-32.5F, -14F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 13, 16, 1, 0F,0F, 0F, -0.48F, -6F, 0F, -0.48F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.48F, -6F, -1F, -0.48F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 528 cull
		bodyModel[523].setRotationPoint(-32.5F, -14F, 9F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[524].setRotationPoint(-39.51F, -13F, -10.5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 0, 14, 1, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 530
		bodyModel[525].setRotationPoint(-39.51F, -13F, 9.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, -0.5F, -0.03F, 0F, -0.5F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.03F, 0F, 0.5F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 cull
		bodyModel[526].setRotationPoint(-29.5F, -14F, -9.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.175F, 0F, 0F, 0.175F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 526
		bodyModel[527].setRotationPoint(-25.5F, -14F, 7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 4, 10, 3, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[528].setRotationPoint(-25.5F, -13F, 7F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 374 cull
		bodyModel[529].setRotationPoint(-58.5F, -4F, -10F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 19, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 374
		bodyModel[530].setRotationPoint(-58.5F, -3F, -9.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 536 cull
		bodyModel[531].setRotationPoint(-58.5F, -4F, 9F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 19, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 537
		bodyModel[532].setRotationPoint(-58.5F, -3F, 9.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[533].setRotationPoint(-60.5F, 1F, -10F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Baggage door L part
		bodyModel[534].setRotationPoint(-39F, -11.5F, -9.49F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Baggage door R part
		bodyModel[535].setRotationPoint(-39F, -11.5F, 9.49F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.51F, 0F, -0.5F, -0.51F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.51F, -0.5F, -0.5F); // Box 487
		bodyModel[536].setRotationPoint(-61.5F, -11F, 7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 487
		bodyModel[537].setRotationPoint(-61F, -12.25F, 5.75F);
	}
	ModelPS_Truck_41E bogie1 = new ModelPS_Truck_41E();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 538; i++)
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