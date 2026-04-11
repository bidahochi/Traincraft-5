//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U50
// Model Creator: Bida
// Created on: 22.02.2021 - 19:27:41
// Last changed on: 22.02.2021 - 19:27:41

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnewSmol;
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

public class ModelU50 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelU50() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[269];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 55, 145, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 14, 139, textureX, textureY); // Box 21
		bodyModel[2] = new ModelRendererTurbo(this, 40, 75, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 27, 41, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 87, 58, textureX, textureY); // Box 24
		bodyModel[5] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 26
		bodyModel[7] = new ModelRendererTurbo(this, 10, 53, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 247, 45, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 264, 38, textureX, textureY); // Box 292
		bodyModel[10] = new ModelRendererTurbo(this, 264, 25, textureX, textureY); // Box 293
		bodyModel[11] = new ModelRendererTurbo(this, 265, 32, textureX, textureY); // Box 294
		bodyModel[12] = new ModelRendererTurbo(this, 225, 111, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 42, 4, textureX, textureY); // Box 45
		bodyModel[15] = new ModelRendererTurbo(this, 117, 9, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 96, 24, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 73, 24, textureX, textureY); // Box 48
		bodyModel[18] = new ModelRendererTurbo(this, 121, 50, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 93, 27, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 86, 24, textureX, textureY, "lamp"); // Box 186 headlight front up
		bodyModel[21] = new ModelRendererTurbo(this, 86, 29, textureX, textureY, "lamp"); // Box 187 headlight front up
		bodyModel[22] = new ModelRendererTurbo(this, 70, 19, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[23] = new ModelRendererTurbo(this, 70, 19, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[24] = new ModelRendererTurbo(this, 199, 194, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 168, 205, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 111
		bodyModel[28] = new ModelRendererTurbo(this, 95, 181, textureX, textureY); // Box 239
		bodyModel[29] = new ModelRendererTurbo(this, 68, 186, textureX, textureY); // Box 25
		bodyModel[30] = new ModelRendererTurbo(this, 81, 189, textureX, textureY); // Box 26
		bodyModel[31] = new ModelRendererTurbo(this, 170, 185, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 189, 185, textureX, textureY); // Box 29
		bodyModel[33] = new ModelRendererTurbo(this, 287, 191, textureX, textureY); // Box 31
		bodyModel[34] = new ModelRendererTurbo(this, 404, 192, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 100, 189, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 159, 183, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 313, 189, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 294, 193, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 326, 195, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 347, 187, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 391, 195, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 144, 182, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 326, 188, textureX, textureY); // Box 104
		bodyModel[44] = new ModelRendererTurbo(this, 372, 205, textureX, textureY); // Box 127
		bodyModel[45] = new ModelRendererTurbo(this, 92, 199, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 411, 144, textureX, textureY); // Box 38
		bodyModel[47] = new ModelRendererTurbo(this, 419, 183, textureX, textureY); // Box 554
		bodyModel[48] = new ModelRendererTurbo(this, 402, 28, textureX, textureY); // Box 18
		bodyModel[49] = new ModelRendererTurbo(this, 400, 35, textureX, textureY); // Box 21
		bodyModel[50] = new ModelRendererTurbo(this, 156, 91, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 250, 35, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 252, 28, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 118, 43, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 337, 126, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 191, 178, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 409 commander base
		bodyModel[57] = new ModelRendererTurbo(this, 76, 1, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[58] = new ModelRendererTurbo(this, 79, 12, textureX, textureY); // Box 409 commander base
		bodyModel[59] = new ModelRendererTurbo(this, 79, 8, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[60] = new ModelRendererTurbo(this, 77, 15, textureX, textureY, "cull"); // Box 88 cull
		bodyModel[61] = new ModelRendererTurbo(this, 173, 127, textureX, textureY); // Box 89
		bodyModel[62] = new ModelRendererTurbo(this, 412, 84, textureX, textureY); // Box 90
		bodyModel[63] = new ModelRendererTurbo(this, 429, 120, textureX, textureY); // Box 91
		bodyModel[64] = new ModelRendererTurbo(this, 128, 6, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 128, 23, textureX, textureY); // Box 93
		bodyModel[66] = new ModelRendererTurbo(this, 125, 0, textureX, textureY); // Box 94
		bodyModel[67] = new ModelRendererTurbo(this, 112, 13, textureX, textureY); // Box 96
		bodyModel[68] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // Box 97
		bodyModel[69] = new ModelRendererTurbo(this, 112, 3, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 107, 54, textureX, textureY); // Box 51
		bodyModel[71] = new ModelRendererTurbo(this, 151, 54, textureX, textureY); // Box 51
		bodyModel[72] = new ModelRendererTurbo(this, 72, 27, textureX, textureY); // Box 103
		bodyModel[73] = new ModelRendererTurbo(this, 125, 26, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 137, 50, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 42, 26, textureX, textureY); // Box 185
		bodyModel[76] = new ModelRendererTurbo(this, 51, 25, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[77] = new ModelRendererTurbo(this, 39, 25, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[78] = new ModelRendererTurbo(this, 86, 8, textureX, textureY, "lamp"); // Box 109 SP front gyro red
		bodyModel[79] = new ModelRendererTurbo(this, 92, 5, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 92, 11, textureX, textureY); // Box 111
		bodyModel[81] = new ModelRendererTurbo(this, 67, 6, textureX, textureY); // Box 364 prime base
		bodyModel[82] = new ModelRendererTurbo(this, 67, 2, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[83] = new ModelRendererTurbo(this, 67, 2, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[84] = new ModelRendererTurbo(this, 67, 2, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[85] = new ModelRendererTurbo(this, 67, 2, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[86] = new ModelRendererTurbo(this, 183, 75, textureX, textureY, "cull"); // Box 117 walkway up cull
		bodyModel[87] = new ModelRendererTurbo(this, 408, 68, textureX, textureY); // Box 118
		bodyModel[88] = new ModelRendererTurbo(this, 479, 154, textureX, textureY); // Box 121
		bodyModel[89] = new ModelRendererTurbo(this, 61, 81, textureX, textureY); // Box 114
		bodyModel[90] = new ModelRendererTurbo(this, 60, 77, textureX, textureY); // Box 74
		bodyModel[91] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 78
		bodyModel[92] = new ModelRendererTurbo(this, 93, 17, textureX, textureY); // Box 125 SP front gyro HOLDER
		bodyModel[93] = new ModelRendererTurbo(this, 86, 14, textureX, textureY, "lamp"); // Box 126 SP front gyro
		bodyModel[94] = new ModelRendererTurbo(this, 86, 19, textureX, textureY, "lamp"); // Box 127 SP front gyro
		bodyModel[95] = new ModelRendererTurbo(this, 439, 76, textureX, textureY, "cull"); // Box 128 walkway cull
		bodyModel[96] = new ModelRendererTurbo(this, 102, 5, textureX, textureY); // Box 129
		bodyModel[97] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 130
		bodyModel[98] = new ModelRendererTurbo(this, 113, 2, textureX, textureY); // Box 131
		bodyModel[99] = new ModelRendererTurbo(this, 113, 5, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 183, 83, textureX, textureY, "cull"); // Box 133 walkway sp cull
		bodyModel[101] = new ModelRendererTurbo(this, 321, 19, textureX, textureY); // Box 134
		bodyModel[102] = new ModelRendererTurbo(this, 308, 19, textureX, textureY); // Box 135
		bodyModel[103] = new ModelRendererTurbo(this, 348, 19, textureX, textureY); // Box 136
		bodyModel[104] = new ModelRendererTurbo(this, 335, 19, textureX, textureY); // Box 137
		bodyModel[105] = new ModelRendererTurbo(this, 112, 15, textureX, textureY); // Box 745
		bodyModel[106] = new ModelRendererTurbo(this, 101, 15, textureX, textureY); // Box 746
		bodyModel[107] = new ModelRendererTurbo(this, 103, 18, textureX, textureY); // Box 747
		bodyModel[108] = new ModelRendererTurbo(this, 103, 12, textureX, textureY); // Box 748
		bodyModel[109] = new ModelRendererTurbo(this, 264, 205, textureX, textureY); // Box 143
		bodyModel[110] = new ModelRendererTurbo(this, 202, 223, textureX, textureY); // Box 144
		bodyModel[111] = new ModelRendererTurbo(this, 205, 206, textureX, textureY); // Box 145
		bodyModel[112] = new ModelRendererTurbo(this, 261, 194, textureX, textureY); // Box 146
		bodyModel[113] = new ModelRendererTurbo(this, 200, 197, textureX, textureY); // Box 147 sp fuel cover
		bodyModel[114] = new ModelRendererTurbo(this, 209, 226, textureX, textureY); // Box 148 sp fuel cover
		bodyModel[115] = new ModelRendererTurbo(this, 262, 204, textureX, textureY); // Box 149 filler up please
		bodyModel[116] = new ModelRendererTurbo(this, 267, 204, textureX, textureY); // Box 150 filler up please
		bodyModel[117] = new ModelRendererTurbo(this, 209, 195, textureX, textureY); // Box 151 cull up fuel shit
		bodyModel[118] = new ModelRendererTurbo(this, 164, 147, textureX, textureY); // Box 152
		bodyModel[119] = new ModelRendererTurbo(this, 350, 150, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, 110, 137, textureX, textureY); // Box 154
		bodyModel[121] = new ModelRendererTurbo(this, 323, 145, textureX, textureY); // Box 155
		bodyModel[122] = new ModelRendererTurbo(this, 297, 144, textureX, textureY); // Box 156
		bodyModel[123] = new ModelRendererTurbo(this, 138, 136, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 141, 159, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 300, 167, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 171, 11, textureX, textureY); // Box 161
		bodyModel[127] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 163
		bodyModel[128] = new ModelRendererTurbo(this, 179, 137, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 215, 41, textureX, textureY); // Box 165
		bodyModel[130] = new ModelRendererTurbo(this, 175, 58, textureX, textureY); // Box 166
		bodyModel[131] = new ModelRendererTurbo(this, 176, 42, textureX, textureY); // Box 167
		bodyModel[132] = new ModelRendererTurbo(this, 180, 27, textureX, textureY); // Box 168
		bodyModel[133] = new ModelRendererTurbo(this, 204, 60, textureX, textureY); // Box 170
		bodyModel[134] = new ModelRendererTurbo(this, 170, 60, textureX, textureY); // Box 171
		bodyModel[135] = new ModelRendererTurbo(this, 222, 50, textureX, textureY); // Box 172
		bodyModel[136] = new ModelRendererTurbo(this, 224, 30, textureX, textureY); // Box 173
		bodyModel[137] = new ModelRendererTurbo(this, 225, 44, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 199, 28, textureX, textureY); // Box 175
		bodyModel[139] = new ModelRendererTurbo(this, 225, 47, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 167, 38, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 422, 50, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 422, 30, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 444, 41, textureX, textureY); // Box 180
		bodyModel[144] = new ModelRendererTurbo(this, 425, 44, textureX, textureY); // Box 181
		bodyModel[145] = new ModelRendererTurbo(this, 425, 47, textureX, textureY); // Box 182
		bodyModel[146] = new ModelRendererTurbo(this, 436, 28, textureX, textureY); // Box 183
		bodyModel[147] = new ModelRendererTurbo(this, 449, 12, textureX, textureY); // Box 184
		bodyModel[148] = new ModelRendererTurbo(this, 481, 130, textureX, textureY); // Box 185
		bodyModel[149] = new ModelRendererTurbo(this, 435, 130, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 482, 61, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 453, 59, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 454, 43, textureX, textureY); // Box 189
		bodyModel[153] = new ModelRendererTurbo(this, 458, 28, textureX, textureY); // Box 190
		bodyModel[154] = new ModelRendererTurbo(this, 448, 61, textureX, textureY); // Box 191
		bodyModel[155] = new ModelRendererTurbo(this, 481, 39, textureX, textureY); // Box 192
		bodyModel[156] = new ModelRendererTurbo(this, 126, 79, textureX, textureY); // Box 193
		bodyModel[157] = new ModelRendererTurbo(this, 126, 79, textureX, textureY); // Box 194
		bodyModel[158] = new ModelRendererTurbo(this, 126, 79, textureX, textureY); // Box 195
		bodyModel[159] = new ModelRendererTurbo(this, 126, 79, textureX, textureY); // Box 196
		bodyModel[160] = new ModelRendererTurbo(this, 269, 100, textureX, textureY); // Box 197
		bodyModel[161] = new ModelRendererTurbo(this, 276, 101, textureX, textureY); // Box 198
		bodyModel[162] = new ModelRendererTurbo(this, 258, 101, textureX, textureY); // Box 199
		bodyModel[163] = new ModelRendererTurbo(this, 290, 101, textureX, textureY); // Box 200
		bodyModel[164] = new ModelRendererTurbo(this, 308, 101, textureX, textureY); // Box 201
		bodyModel[165] = new ModelRendererTurbo(this, 301, 100, textureX, textureY); // Box 202
		bodyModel[166] = new ModelRendererTurbo(this, 291, 125, textureX, textureY); // Box 203
		bodyModel[167] = new ModelRendererTurbo(this, 273, 125, textureX, textureY); // Box 204
		bodyModel[168] = new ModelRendererTurbo(this, 284, 124, textureX, textureY); // Box 205
		bodyModel[169] = new ModelRendererTurbo(this, 323, 125, textureX, textureY); // Box 206
		bodyModel[170] = new ModelRendererTurbo(this, 316, 124, textureX, textureY); // Box 207
		bodyModel[171] = new ModelRendererTurbo(this, 305, 125, textureX, textureY); // Box 208
		bodyModel[172] = new ModelRendererTurbo(this, 52, 39, textureX, textureY); // Box 209
		bodyModel[173] = new ModelRendererTurbo(this, 26, 39, textureX, textureY); // Box 210
		bodyModel[174] = new ModelRendererTurbo(this, 39, 33, textureX, textureY); // Box 211
		bodyModel[175] = new ModelRendererTurbo(this, 362, 96, textureX, textureY); // Box 212
		bodyModel[176] = new ModelRendererTurbo(this, 371, 88, textureX, textureY); // Box 213
		bodyModel[177] = new ModelRendererTurbo(this, 396, 96, textureX, textureY); // Box 214
		bodyModel[178] = new ModelRendererTurbo(this, 454, 152, textureX, textureY, "cull"); // Box 215 cull reverse box sp rear steps
		bodyModel[179] = new ModelRendererTurbo(this, 337, 124, textureX, textureY); // Box 216
		bodyModel[180] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Box 217
		bodyModel[181] = new ModelRendererTurbo(this, 322, 102, textureX, textureY); // Box 218
		bodyModel[182] = new ModelRendererTurbo(this, 39, 104, textureX, textureY); // Box 18
		bodyModel[183] = new ModelRendererTurbo(this, 23, 113, textureX, textureY); // Box 94
		bodyModel[184] = new ModelRendererTurbo(this, 59, 113, textureX, textureY); // Box 95
		bodyModel[185] = new ModelRendererTurbo(this, 20, 110, textureX, textureY); // Box 96
		bodyModel[186] = new ModelRendererTurbo(this, 39, 97, textureX, textureY); // Box 100
		bodyModel[187] = new ModelRendererTurbo(this, 32, 97, textureX, textureY); // Box 101
		bodyModel[188] = new ModelRendererTurbo(this, 41, 112, textureX, textureY); // Box 94
		bodyModel[189] = new ModelRendererTurbo(this, 51, 122, textureX, textureY); // Box 95
		bodyModel[190] = new ModelRendererTurbo(this, 33, 122, textureX, textureY); // Box 95
		bodyModel[191] = new ModelRendererTurbo(this, 15, 110, textureX, textureY); // Box 96
		bodyModel[192] = new ModelRendererTurbo(this, 68, 110, textureX, textureY); // Box 96
		bodyModel[193] = new ModelRendererTurbo(this, 77, 110, textureX, textureY); // Box 96
		bodyModel[194] = new ModelRendererTurbo(this, 46, 97, textureX, textureY); // Box 101
		bodyModel[195] = new ModelRendererTurbo(this, 479, 139, textureX, textureY); // Box 233 up rear step
		bodyModel[196] = new ModelRendererTurbo(this, 354, 103, textureX, textureY); // Box 234
		bodyModel[197] = new ModelRendererTurbo(this, 353, 96, textureX, textureY); // Box 235
		bodyModel[198] = new ModelRendererTurbo(this, 351, 96, textureX, textureY); // Box 444
		bodyModel[199] = new ModelRendererTurbo(this, 352, 85, textureX, textureY); // Box 527 brakewheel rear
		bodyModel[200] = new ModelRendererTurbo(this, 457, 156, textureX, textureY); // Box 238
		bodyModel[201] = new ModelRendererTurbo(this, 415, 77, textureX, textureY, "lamp"); // Box 239 headlight rear sp
		bodyModel[202] = new ModelRendererTurbo(this, 408, 77, textureX, textureY, "lamp"); // Box 240 headlight rear sp
		bodyModel[203] = new ModelRendererTurbo(this, 425, 77, textureX, textureY, "lamp"); // Box 241 headlight rear up
		bodyModel[204] = new ModelRendererTurbo(this, 466, 157, textureX, textureY); // Box 242
		bodyModel[205] = new ModelRendererTurbo(this, 456, 157, textureX, textureY); // Box 243
		bodyModel[206] = new ModelRendererTurbo(this, 52, 52, textureX, textureY); // Box 244
		bodyModel[207] = new ModelRendererTurbo(this, 38, 52, textureX, textureY); // Box 245
		bodyModel[208] = new ModelRendererTurbo(this, 63, 54, textureX, textureY); // Box 246
		bodyModel[209] = new ModelRendererTurbo(this, 21, 51, textureX, textureY); // Box 247
		bodyModel[210] = new ModelRendererTurbo(this, 38, 47, textureX, textureY, "lamp"); // Box 248 markerlight
		bodyModel[211] = new ModelRendererTurbo(this, 38, 47, textureX, textureY, "lamp"); // Box 249 markerlight
		bodyModel[212] = new ModelRendererTurbo(this, 240, 135, textureX, textureY); // Box 250
		bodyModel[213] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 123
		bodyModel[214] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 311
		bodyModel[215] = new ModelRendererTurbo(this, 407, 201, textureX, textureY); // Box 253
		bodyModel[216] = new ModelRendererTurbo(this, 406, 183, textureX, textureY); // Box 254
		bodyModel[217] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 255
		bodyModel[218] = new ModelRendererTurbo(this, 430, 194, textureX, textureY); // Box 256
		bodyModel[219] = new ModelRendererTurbo(this, 450, 194, textureX, textureY); // Box 257
		bodyModel[220] = new ModelRendererTurbo(this, 236, 68, textureX, textureY, "cull"); // Box 258 ladder cull
		bodyModel[221] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // Box 785
		bodyModel[222] = new ModelRendererTurbo(this, 163, 14, textureX, textureY); // Box 418
		bodyModel[223] = new ModelRendererTurbo(this, 154, 11, textureX, textureY); // Box 419
		bodyModel[224] = new ModelRendererTurbo(this, 152, 14, textureX, textureY); // Box 420
		bodyModel[225] = new ModelRendererTurbo(this, 154, 17, textureX, textureY); // Box 421
		bodyModel[226] = new ModelRendererTurbo(this, 22, 22, textureX, textureY); // Box 264
		bodyModel[227] = new ModelRendererTurbo(this, 47, 22, textureX, textureY); // Box 265
		bodyModel[228] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 86 cs dials
		bodyModel[229] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 407 cs button pannel backer
		bodyModel[230] = new ModelRendererTurbo(this, 14, 37, textureX, textureY); // Box 408 cs button pannel
		bodyModel[231] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 409 cs throttle box
		bodyModel[232] = new ModelRendererTurbo(this, 8, 47, textureX, textureY); // Box 412 cs ind brakestand
		bodyModel[233] = new ModelRendererTurbo(this, 209, 231, textureX, textureY); // Box 234
		bodyModel[234] = new ModelRendererTurbo(this, 215, 41, textureX, textureY); // Box 235
		bodyModel[235] = new ModelRendererTurbo(this, 215, 41, textureX, textureY); // Box 236
		bodyModel[236] = new ModelRendererTurbo(this, 291, 16, textureX, textureY); // Box 237
		bodyModel[237] = new ModelRendererTurbo(this, 291, 16, textureX, textureY); // Box 238
		bodyModel[238] = new ModelRendererTurbo(this, 2, 190, textureX, textureY, "cull"); // Box 239 cull footgrabs early
		bodyModel[239] = new ModelRendererTurbo(this, 2, 170, textureX, textureY, "cull"); // Box 243 cull handrails early
		bodyModel[240] = new ModelRendererTurbo(this, 30, 170, textureX, textureY, "cull"); // Box 243 cull handrails
		bodyModel[241] = new ModelRendererTurbo(this, 16, 190, textureX, textureY, "cull"); // Box 250 cull footgrabs
		bodyModel[242] = new ModelRendererTurbo(this, 14, 170, textureX, textureY, "cull"); // Box 243 cull handrails
		bodyModel[243] = new ModelRendererTurbo(this, 32, 190, textureX, textureY, "cull"); // Box 250 cull footgrabs
		bodyModel[244] = new ModelRendererTurbo(this, 2, 228, textureX, textureY, "cull"); // Box 239 cull footgrabs early
		bodyModel[245] = new ModelRendererTurbo(this, 2, 208, textureX, textureY, "cull"); // Box 243 cull handrails early
		bodyModel[246] = new ModelRendererTurbo(this, 30, 208, textureX, textureY, "cull"); // Box 243 cull handrails
		bodyModel[247] = new ModelRendererTurbo(this, 16, 228, textureX, textureY, "cull"); // Box 250 cull footgrabs
		bodyModel[248] = new ModelRendererTurbo(this, 14, 208, textureX, textureY, "cull"); // Box 243 cull handrails
		bodyModel[249] = new ModelRendererTurbo(this, 32, 228, textureX, textureY, "cull"); // Box 250 cull footgrabs
		bodyModel[250] = new ModelRendererTurbo(this, 70, 9, textureX, textureY); // Box 350
		bodyModel[251] = new ModelRendererTurbo(this, 67, 9, textureX, textureY); // Box 321
		bodyModel[252] = new ModelRendererTurbo(this, 21, 35, textureX, textureY); // Box 253 cs ab brakestand
		bodyModel[253] = new ModelRendererTurbo(this, 19, 45, textureX, textureY); // Box 254 cs ab brakestand 2
		bodyModel[254] = new ModelRendererTurbo(this, 32, 29, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[255] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 256 cab backpannel
		bodyModel[256] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 256
		bodyModel[257] = new ModelRendererTurbo(this, 167, 4, textureX, textureY); // Box 257
		bodyModel[258] = new ModelRendererTurbo(this, 158, 1, textureX, textureY); // Box 258
		bodyModel[259] = new ModelRendererTurbo(this, 156, 4, textureX, textureY); // Box 259
		bodyModel[260] = new ModelRendererTurbo(this, 158, 7, textureX, textureY); // Box 260
		bodyModel[261] = new ModelRendererTurbo(this, 175, 2, textureX, textureY); // Box 261 rear horn
		bodyModel[262] = new ModelRendererTurbo(this, 180, 4, textureX, textureY); // Box 263 rear horn
		bodyModel[263] = new ModelRendererTurbo(this, 180, 1, textureX, textureY); // Box 264 rear horn
		bodyModel[264] = new ModelRendererTurbo(this, 167, 7, textureX, textureY); // Box 265
		bodyModel[265] = new ModelRendererTurbo(this, 167, 1, textureX, textureY); // Box 266
		bodyModel[266] = new ModelRendererTurbo(this, 174, 5, textureX, textureY, "cull"); // Box 267 CULL rear horn mount
		bodyModel[267] = new ModelRendererTurbo(this, 466, 152, textureX, textureY); // Box 270
		bodyModel[268] = new ModelRendererTurbo(this, 456, 152, textureX, textureY); // Box 271

		bodyModel[0].addBox(0F, 0F, 0F, 16, 7, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-45F, -6.5F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 21
		bodyModel[1].setRotationPoint(-56F, -6.5F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 15, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[2].setRotationPoint(-61F, -14.5F, -3F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 15, 18, 0F); // Box 23
		bodyModel[3].setRotationPoint(-59F, -14.5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[4].setRotationPoint(-59F, -14.5F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 15, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[5].setRotationPoint(-61F, -14.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[6].setRotationPoint(-59F, -14.5F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 15, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 27
		bodyModel[7].setRotationPoint(-61F, -14.5F, 3F);

		bodyModel[8].addBox(0F, 0F, 0F, 73, 16, 14, 0F); // Box 6
		bodyModel[8].setRotationPoint(-30F, -22.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 65, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[9].setRotationPoint(-26F, -23.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 65, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[10].setRotationPoint(-26F, -23.5F, 2F);

		bodyModel[11].addBox(0F, 0F, 0F, 65, 1, 4, 0F); // Box 294
		bodyModel[11].setRotationPoint(-26F, -23.5F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 93, 8, 0, 0F); // Box 43
		bodyModel[12].setRotationPoint(-45F, -14.5F, -10.99F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[13].setRotationPoint(-56F, -22.5F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 45
		bodyModel[14].setRotationPoint(-56F, -22.5F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 11, 1, 12, 0F); // Box 46
		bodyModel[15].setRotationPoint(-55F, -24.5F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 47
		bodyModel[16].setRotationPoint(-57F, -24.5F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[17].setRotationPoint(-57F, -24.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, -0.1F, 0F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[18].setRotationPoint(-46F, -24.5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[19].setRotationPoint(-58.05F, -24.45F, -1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front up
		bodyModel[20].setRotationPoint(-58.15F, -24.5F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front up
		bodyModel[21].setRotationPoint(-58.15F, -22.5F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0.75F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard
		bodyModel[22].setRotationPoint(-56.6F, -23F, -7F);
		bodyModel[22].rotateAngleY = 0.20943951F;

		bodyModel[23].addShapeBox(0F, 0F, -5.75F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard
		bodyModel[23].setRotationPoint(-56.6F, -23F, 7F);
		bodyModel[23].rotateAngleY = -0.20943951F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 20, 7, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[24].setRotationPoint(-10F, 0.5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[25].setRotationPoint(-10F, 7.5F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[26].setRotationPoint(-64F, 3F, -1.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 111
		bodyModel[27].setRotationPoint(61F, 3F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[28].setRotationPoint(-53.5F, 0F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 25
		bodyModel[29].setRotationPoint(-59.5F, 3F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[30].setRotationPoint(-56.5F, 2F, -3F);

		bodyModel[31].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 28
		bodyModel[31].setRotationPoint(-24.5F, 1.5F, -4F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 29
		bodyModel[32].setRotationPoint(-19.5F, 2.5F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 31
		bodyModel[33].setRotationPoint(16.5F, 2.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(56.5F, 3F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 95
		bodyModel[35].setRotationPoint(-53.5F, 1F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[36].setRotationPoint(-27.5F, 1F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[37].setRotationPoint(24.5F, 1F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 98
		bodyModel[38].setRotationPoint(19.5F, 1.5F, -4F);

		bodyModel[39].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 99
		bodyModel[39].setRotationPoint(27.5F, 1F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(35.5F, 0F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		bodyModel[41].setRotationPoint(53.5F, 2F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 103
		bodyModel[42].setRotationPoint(-33F, 0.5F, -2.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 104
		bodyModel[43].setRotationPoint(28F, 0.5F, -2.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 127
		bodyModel[44].setRotationPoint(42.5F, 1.5F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 128
		bodyModel[45].setRotationPoint(-47.5F, 1.5F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 7, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 38
		bodyModel[46].setRotationPoint(48F, -6.5F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 6, 1, 18, 0F); // Box 554
		bodyModel[47].setRotationPoint(56F, 1F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[48].setRotationPoint(35.5F, -25F, -2.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[49].setRotationPoint(35F, -24F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 84
		bodyModel[50].setRotationPoint(-44F, -24.5F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 87
		bodyModel[51].setRotationPoint(-25F, -24F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 88
		bodyModel[52].setRotationPoint(-24.5F, -25F, -2.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 17, 14, 0F); // Box 91
		bodyModel[53].setRotationPoint(-46F, -23.5F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 92
		bodyModel[54].setRotationPoint(48F, -14.5F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 36, 1, 13, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[55].setRotationPoint(-18F, 0.25F, -6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[56].setRotationPoint(-54.5F, -25.5F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[57].setRotationPoint(-54.5F, -26.5F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[58].setRotationPoint(-49.5F, -26F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[59].setRotationPoint(-49.5F, -27F, -0.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 88 cull
		bodyModel[60].setRotationPoint(-50F, -25F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 1, 15, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 89
		bodyModel[61].setRotationPoint(-44F, -22F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 90
		bodyModel[62].setRotationPoint(39F, -24.5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 1, 15, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
		bodyModel[63].setRotationPoint(39F, -22F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[64].setRotationPoint(-55F, -24.5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 93
		bodyModel[65].setRotationPoint(-55F, -24.5F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -2F, -1F, 0F, -2F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -1F, 1F, 0F, 0F, -1F, 0F, 1F); // Box 94
		bodyModel[66].setRotationPoint(-56F, -24.5F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[67].setRotationPoint(-57F, -24.5F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F); // Box 97
		bodyModel[68].setRotationPoint(-56F, -24.5F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F); // Box 96
		bodyModel[69].setRotationPoint(-57F, -24.5F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[70].setRotationPoint(-46F, -22.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 51
		bodyModel[71].setRotationPoint(-46F, -22.5F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[72].setRotationPoint(-56F, -24.5F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,-1F, 0F, 1F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -2F); // Box 104
		bodyModel[73].setRotationPoint(-56F, -24.5F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0.1F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 105
		bodyModel[74].setRotationPoint(-46F, -24.5F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[75].setRotationPoint(-61.25F, -14.75F, -2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[76].setRotationPoint(-61.85F, -14.7F, -2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[77].setRotationPoint(-61.85F, -14.7F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 109 SP front gyro red
		bodyModel[78].setRotationPoint(-58.15F, -26.75F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 110
		bodyModel[79].setRotationPoint(-58.05F, -26.75F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[80].setRotationPoint(-57.05F, -26.5F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[81].setRotationPoint(-56.5F, -25.5F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[82].setRotationPoint(-56.5F, -26F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[83].setRotationPoint(-56.5F, -26F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[84].setRotationPoint(-56.5F, -26F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[85].setRotationPoint(-56.5F, -26F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 19, 3, 4, 0F); // Box 117 walkway up cull
		bodyModel[86].setRotationPoint(-44F, -25.5F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 20, 14, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[87].setRotationPoint(57F, -24.5F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F); // Box 121
		bodyModel[88].setRotationPoint(59F, -4.5F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[89].setRotationPoint(-54F, 1.5F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[90].setRotationPoint(-54F, 0.5F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[91].setRotationPoint(-53.75F, 2F, -8.25F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 125 SP front gyro HOLDER
		bodyModel[92].setRotationPoint(-58.5F, -24.45F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 126 SP front gyro
		bodyModel[93].setRotationPoint(-58.7F, -24.5F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 127 SP front gyro
		bodyModel[94].setRotationPoint(-58.7F, -22.5F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 19, 3, 4, 0F); // Box 128 walkway cull
		bodyModel[95].setRotationPoint(38F, -25.5F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 129
		bodyModel[96].setRotationPoint(-44F, -25.75F, -1.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 130
		bodyModel[97].setRotationPoint(-38F, -25.75F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[98].setRotationPoint(-41F, -25.75F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[99].setRotationPoint(-38F, -25.75F, -0.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 19, 3, 4, 0F); // Box 133 walkway sp cull
		bodyModel[100].setRotationPoint(-44F, -25.5F, -2F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 134
		bodyModel[101].setRotationPoint(0F, -23.75F, 0.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 135
		bodyModel[102].setRotationPoint(0F, -23.75F, -4.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 136
		bodyModel[103].setRotationPoint(11F, -23.75F, -4.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 137
		bodyModel[104].setRotationPoint(11F, -23.75F, 0.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[105].setRotationPoint(-45.75F, -25F, -0.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[106].setRotationPoint(-48.25F, -26F, -0.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[107].setRotationPoint(-47.25F, -25.75F, 0.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[108].setRotationPoint(-47.25F, -25.75F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 2, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[109].setRotationPoint(-1F, 7.5F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // Box 144
		bodyModel[110].setRotationPoint(-4F, 7.5F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[111].setRotationPoint(-10F, 0.5F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[112].setRotationPoint(-1F, 0.5F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147 sp fuel cover
		bodyModel[113].setRotationPoint(-4F, 0.5F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148 sp fuel cover
		bodyModel[114].setRotationPoint(-4F, 7.5F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149 filler up please
		bodyModel[115].setRotationPoint(5.5F, 3F, -11.25F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 150 filler up please
		bodyModel[116].setRotationPoint(5.5F, 3F, 10.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F); // Box 151 cull up fuel shit
		bodyModel[117].setRotationPoint(-4F, 0F, -10.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 54, 7, 22, 0F); // Box 152
		bodyModel[118].setRotationPoint(-27F, -6.5F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 19, 7, 22, 0F); // Box 153
		bodyModel[119].setRotationPoint(29F, -6.5F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 4, 22, 0F); // Box 154
		bodyModel[120].setRotationPoint(-29F, -6.5F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 4, 22, 0F); // Box 155
		bodyModel[121].setRotationPoint(27F, -6.5F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 156
		bodyModel[122].setRotationPoint(27F, -2.5F, -10.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 1, 21, 0F); // Box 157
		bodyModel[123].setRotationPoint(-29F, -2.5F, -10.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 158
		bodyModel[124].setRotationPoint(-29F, -1.5F, -9F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 159
		bodyModel[125].setRotationPoint(27F, -1.5F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 161
		bodyModel[126].setRotationPoint(-41F, -21F, -6.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 163
		bodyModel[127].setRotationPoint(-37F, -21F, 6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 164
		bodyModel[128].setRotationPoint(-37F, -21F, -7.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 165
		bodyModel[129].setRotationPoint(-36.5F, -20F, -1F);

		bodyModel[130].addBox(0F, 0F, 0F, 8, 4, 12, 0F); // Box 166
		bodyModel[130].setRotationPoint(-43.5F, -10.5F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 167
		bodyModel[131].setRotationPoint(-42.5F, -13.5F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 168
		bodyModel[132].setRotationPoint(-40.5F, -15.5F, -6F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 9, 0, 0F); // Box 170
		bodyModel[133].setRotationPoint(-43.5F, -15.5F, 6.01F);

		bodyModel[134].addBox(0F, 0F, 0F, 8, 9, 0, 0F); // Box 171
		bodyModel[134].setRotationPoint(-43.5F, -15.5F, -6.01F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 8, 9, 0F); // Box 172
		bodyModel[135].setRotationPoint(-32.5F, -14.5F, -4.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 173
		bodyModel[136].setRotationPoint(-31.5F, -18.5F, -4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F); // Box 174
		bodyModel[137].setRotationPoint(-37.5F, -17.5F, 0F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[138].setRotationPoint(-39F, -19.5F, -4.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 176
		bodyModel[139].setRotationPoint(-37.5F, -17.5F, -1F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 7, 8, 0F); // Box 177
		bodyModel[140].setRotationPoint(-44.5F, -21.5F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 8, 9, 0F); // Box 178
		bodyModel[141].setRotationPoint(42.5F, -14.5F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[142].setRotationPoint(42.5F, -18.5F, -4.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 180
		bodyModel[143].setRotationPoint(47.5F, -20F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F); // Box 181
		bodyModel[144].setRotationPoint(42.5F, -17.5F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 182
		bodyModel[145].setRotationPoint(42.5F, -17.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[146].setRotationPoint(45F, -19.5F, -4.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 184
		bodyModel[147].setRotationPoint(43F, -21F, -6.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 185
		bodyModel[148].setRotationPoint(47F, -21F, 6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 186
		bodyModel[149].setRotationPoint(47F, -21F, -7.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 8, 9, 0, 0F); // Box 187
		bodyModel[150].setRotationPoint(48.5F, -15.5F, 6.01F);

		bodyModel[151].addBox(0F, 0F, 0F, 8, 4, 12, 0F); // Box 188
		bodyModel[151].setRotationPoint(48.5F, -10.5F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[152].setRotationPoint(48.5F, -13.5F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 190
		bodyModel[153].setRotationPoint(50.5F, -15.5F, -6F);

		bodyModel[154].addBox(0F, 0F, 0F, 8, 9, 0, 0F); // Box 191
		bodyModel[154].setRotationPoint(48.5F, -15.5F, -6.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 7, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[155].setRotationPoint(55.5F, -21.5F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 28, 32, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -14F, -16F, 0F, -14F, -16F, 0F, 0F, -16F, 0F); // Box 193
		bodyModel[156].setRotationPoint(-44F, -22.5F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 28, 32, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -14F, -16F, 0F, -14F, -16F, 0F, 0F, -16F, 0F); // Box 194
		bodyModel[157].setRotationPoint(-44F, -22.5F, 7F);

		bodyModel[158].addShapeBox(-14F, 0F, 0F, 28, 32, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -14F, -16F, 0F, -14F, -16F, 0F, 0F, -16F, 0F); // Box 195
		bodyModel[158].setRotationPoint(43F, -22.5F, 7F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(-14F, 0F, 0F, 28, 32, 0, 0F,0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -14F, -16F, 0F, -14F, -16F, 0F, 0F, -16F, 0F); // Box 196
		bodyModel[159].setRotationPoint(43F, -22.5F, -7F);
		bodyModel[159].rotateAngleY = -3.14159265F;

		bodyModel[160].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 197
		bodyModel[160].setRotationPoint(-29F, -15.5F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[161].setRotationPoint(-27F, -14.5F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[162].setRotationPoint(-33F, -14.5F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[163].setRotationPoint(23F, -14.5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[164].setRotationPoint(29F, -14.5F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 202
		bodyModel[165].setRotationPoint(27F, -15.5F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[166].setRotationPoint(-27F, -14.5F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[167].setRotationPoint(-33F, -14.5F, 10F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 205
		bodyModel[168].setRotationPoint(-29F, -15.5F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[169].setRotationPoint(29F, -14.5F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 207
		bodyModel[170].setRotationPoint(27F, -15.5F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[171].setRotationPoint(23F, -14.5F, 10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[172].setRotationPoint(-59F, -15.5F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[173].setRotationPoint(-59F, -15.5F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[174].setRotationPoint(-59F, -15.5F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 212
		bodyModel[175].setRotationPoint(59F, -14.5F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 10, 12, 0F); // Box 213
		bodyModel[176].setRotationPoint(61F, -14.5F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[177].setRotationPoint(59F, -14.5F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.18F); // Box 215 cull reverse box sp rear steps
		bodyModel[178].setRotationPoint(57F, -6.5F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 216
		bodyModel[179].setRotationPoint(54F, -14.5F, -10.47F);
		bodyModel[179].rotateAngleY = 0.08726646F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 217
		bodyModel[180].setRotationPoint(54F, -14.5F, 10.47F);
		bodyModel[180].rotateAngleY = -0.08726646F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 218
		bodyModel[181].setRotationPoint(48F, -14.5F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[182].setRotationPoint(-62.5F, 1.75F, -3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[183].setRotationPoint(-61F, 1.5F, 3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 95
		bodyModel[184].setRotationPoint(-61F, 1.5F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.01F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, -0.01F, 0F, 1F, 0F, -1F); // Box 96
		bodyModel[185].setRotationPoint(-59F, 1.5F, 9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[186].setRotationPoint(-61F, 1.49F, -3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 101
		bodyModel[187].setRotationPoint(-61F, 1.49F, 3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 1.15F, 0F, 0F); // Box 94
		bodyModel[188].setRotationPoint(-61F, 1.5F, -3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.67F, 0F, 0F, 1.67F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, -1.82F, 0F, 0F, 1.82F, 0F, 0F); // Box 95
		bodyModel[189].setRotationPoint(-60.33F, 8.5F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.67F, 0F, 0F, -1.67F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.82F, 0F, 0F, -1.82F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F); // Box 95
		bodyModel[190].setRotationPoint(-60.33F, 8.5F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[191].setRotationPoint(-56F, 1.5F, 9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 1F, 1F, 0F, -1F, 0F, -0.01F, 0F, 0F, 0F, 0F, 1F, 0F, 1F); // Box 96
		bodyModel[192].setRotationPoint(-59F, 1.5F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[193].setRotationPoint(-56F, 1.5F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[194].setRotationPoint(-61F, 1.49F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F); // Box 233 up rear step
		bodyModel[195].setRotationPoint(59F, -6.5F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[196].setRotationPoint(59F, -10F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[197].setRotationPoint(59F, -13F, -4.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[198].setRotationPoint(58.75F, -12.5F, -3.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 527 brakewheel rear
		bodyModel[199].setRotationPoint(58.75F, -14.5F, -5.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 238
		bodyModel[200].setRotationPoint(61F, -3F, -3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 239 headlight rear sp
		bodyModel[201].setRotationPoint(56.35F, -20.75F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 240 headlight rear sp
		bodyModel[202].setRotationPoint(56.35F, -20.75F, 0F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 241 headlight rear up
		bodyModel[203].setRotationPoint(56.75F, -20.75F, 3F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 242
		bodyModel[204].setRotationPoint(60.25F, -6.5F, -0.15F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 243
		bodyModel[205].setRotationPoint(60.25F, -6.5F, -1.85F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 244
		bodyModel[206].setRotationPoint(-61.25F, -6.5F, -1.85F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 245
		bodyModel[207].setRotationPoint(-61.25F, -6.5F, -0.15F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 246
		bodyModel[208].setRotationPoint(-61.05F, -1.5F, -3.85F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 247
		bodyModel[209].setRotationPoint(-62.5F, -2.25F, -3F);

		bodyModel[210].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 markerlight
		bodyModel[210].setRotationPoint(-59.4F, -14F, -8F);
		bodyModel[210].rotateAngleY = 0.33161256F;

		bodyModel[211].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 249 markerlight
		bodyModel[211].setRotationPoint(-59.4F, -14F, 8F);
		bodyModel[211].rotateAngleY = -0.33161256F;

		bodyModel[212].addBox(0F, 0F, 0F, 93, 8, 0, 0F); // Box 250
		bodyModel[212].setRotationPoint(-45F, -14.5F, 10.99F);

		bodyModel[213].addShapeBox(-9F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[213].setRotationPoint(-46F, -22.5F, -10.9F);
		bodyModel[213].rotateAngleX = -0.61086524F;
		bodyModel[213].rotateAngleY = -0.08726646F;

		bodyModel[214].addShapeBox(-9F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[214].setRotationPoint(-46F, -22.5F, 10.9F);
		bodyModel[214].rotateAngleX = 0.61086524F;
		bodyModel[214].rotateAngleY = 0.08726646F;

		bodyModel[215].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 253
		bodyModel[215].setRotationPoint(57F, 3F, -8F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 254
		bodyModel[216].setRotationPoint(57F, 3F, 3F);

		bodyModel[217].addBox(0F, 0F, 0F, 0, 6, 18, 0F); // Box 255
		bodyModel[217].setRotationPoint(60.01F, 3F, -9F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 6, 0, 0F); // Box 256
		bodyModel[218].setRotationPoint(59F, 2F, -9F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 6, 0, 0F); // Box 257
		bodyModel[219].setRotationPoint(59F, 2F, 9F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 15, 1, 0F); // Box 258 ladder cull
		bodyModel[220].setRotationPoint(15F, -22F, 6.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[221].setRotationPoint(-51F, -25.5F, 0F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[222].setRotationPoint(-16.5F, -23.5F, -6.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[223].setRotationPoint(-18F, -24.25F, -5.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[224].setRotationPoint(-19F, -24.5F, -6.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[225].setRotationPoint(-17.5F, -24.25F, -7.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 264
		bodyModel[226].setRotationPoint(-53F, -15.5F, -11.25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 265
		bodyModel[227].setRotationPoint(-53F, -15.5F, 10.25F);

		bodyModel[228].addShapeBox(-1F, 0F, -1F, 11, 3, 3, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs dials
		bodyModel[228].setRotationPoint(-54.5F, -16.5F, 2F);
		bodyModel[228].rotateAngleY = -0.82030475F;

		bodyModel[229].addBox(0F, 0F, 0F, 4, 8, 2, 0F); // Box 407 cs button pannel backer
		bodyModel[229].setRotationPoint(-56.1F, -14.5F, 2F);
		bodyModel[229].rotateAngleY = -0.82030475F;

		bodyModel[230].addShapeBox(1F, 0F, 2F, 2, 8, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408 cs button pannel
		bodyModel[230].setRotationPoint(-56.1F, -14.5F, 2F);
		bodyModel[230].rotateAngleY = -0.82030475F;

		bodyModel[231].addBox(-1F, 1F, -1F, 3, 1, 2, 0F); // Box 409 cs throttle box
		bodyModel[231].setRotationPoint(-54.5F, -16.5F, 2F);
		bodyModel[231].rotateAngleY = -0.82030475F;

		bodyModel[232].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 412 cs ind brakestand
		bodyModel[232].setRotationPoint(-54F, -13.5F, 7.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 234
		bodyModel[233].setRotationPoint(-4F, 7.5F, 9F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 235
		bodyModel[234].setRotationPoint(-34.5F, -13F, -1F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 236
		bodyModel[235].setRotationPoint(45.5F, -13F, -1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F); // Box 237
		bodyModel[236].setRotationPoint(3F, -21.25F, -7.1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F); // Box 238
		bodyModel[237].setRotationPoint(3F, -21.25F, 6.1F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 239 cull footgrabs early
		bodyModel[238].setRotationPoint(-41F, 0.5F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243 cull handrails early
		bodyModel[239].setRotationPoint(-41F, -14.5F, 10.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243 cull handrails
		bodyModel[240].setRotationPoint(38F, -14.5F, 10.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 250 cull footgrabs
		bodyModel[241].setRotationPoint(39F, -5.5F, 10.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243 cull handrails
		bodyModel[242].setRotationPoint(-24F, -14.5F, 10.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 250 cull footgrabs
		bodyModel[243].setRotationPoint(-23F, -5.5F, 10.75F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 7, 1, 0F); // Box 239 cull footgrabs early
		bodyModel[244].setRotationPoint(-41F, 0.5F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243 cull handrails early
		bodyModel[245].setRotationPoint(-41F, -14.5F, -11.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243 cull handrails
		bodyModel[246].setRotationPoint(38F, -14.5F, -11.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 250 cull footgrabs
		bodyModel[247].setRotationPoint(39F, -5.5F, -11.75F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 243 cull handrails
		bodyModel[248].setRotationPoint(-24F, -14.5F, -11.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 250 cull footgrabs
		bodyModel[249].setRotationPoint(-23F, -5.5F, -11.75F);

		bodyModel[250].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[250].setRotationPoint(-51F, -20F, -10.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[251].setRotationPoint(-51.01F, -20F, 10.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 253 cs ab brakestand
		bodyModel[252].setRotationPoint(-52F, -13.5F, -1F);
		bodyModel[252].rotateAngleY = -0.34906585F;

		bodyModel[253].addShapeBox(0.5F, 0F, 0F, 2, 3, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 254 cs ab brakestand 2
		bodyModel[253].setRotationPoint(-52F, -16.5F, -1F);
		bodyModel[253].rotateAngleY = -0.34906585F;

		bodyModel[254].addShapeBox(0F, 0F, -2.5F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[254].setRotationPoint(-55F, -19.5F, 1.5F);
		bodyModel[254].rotateAngleY = 0.75049158F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, -4F, -6F); // Box 256 cab backpannel
		bodyModel[255].setRotationPoint(-46.1F, -20F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 256
		bodyModel[256].setRotationPoint(-53F, -25.5F, -3F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 257
		bodyModel[257].setRotationPoint(-45.5F, -25F, -5.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 258
		bodyModel[258].setRotationPoint(-47F, -25.75F, -4.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 259
		bodyModel[259].setRotationPoint(-48F, -26F, -5.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 260
		bodyModel[260].setRotationPoint(-47.5F, -25.75F, -6.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261 rear horn
		bodyModel[261].setRotationPoint(57.5F, -25F, 4.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 263 rear horn
		bodyModel[262].setRotationPoint(57F, -25.5F, 5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 264 rear horn
		bodyModel[263].setRotationPoint(57.5F, -25.5F, 4F);

		bodyModel[264].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 265
		bodyModel[264].setRotationPoint(-46.5F, -27F, -4.85F);

		bodyModel[265].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 266
		bodyModel[265].setRotationPoint(-46.75F, -27F, -6.13F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267 CULL rear horn mount
		bodyModel[266].setRotationPoint(57F, -24F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 270
		bodyModel[267].setRotationPoint(60.25F, -1.5F, 2.85F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 271
		bodyModel[268].setRotationPoint(60.25F, -1.5F, -4.85F);
	}
	ModelTypeBnewSmol theBetterTrucks = new ModelTypeBnewSmol();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 7 ||GetColor(entity) == 16
				||GetColor(entity) == 17||GetColor(entity) == 0
				||GetColor(entity) == 18) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.38, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(-1.43, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(4.19, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(1.43, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/tuypeB_southrn_pasicifc_textuire.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.38, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(-1.43, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(4.19, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(1.43, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.38, -0.03, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(-1.43, 0, 0);
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(4.19, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(1.43, 0, 0);//rear
			theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}