//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2024 - 16:04:54
// Last changed on: 18.06.2024 - 16:04:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelCA11 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelCA11() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[269];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 296, 102, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 296, 102, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 163, 113, textureX, textureY); // Box 10 frame of the boose
		bodyModel[3] = new ModelRendererTurbo(this, 184, 113, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 100, 120, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 123
		bodyModel[6] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 124
		bodyModel[7] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 133
		bodyModel[8] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 227
		bodyModel[9] = new ModelRendererTurbo(this, 21, 88, textureX, textureY); // Box 113
		bodyModel[10] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 114
		bodyModel[11] = new ModelRendererTurbo(this, 11, 91, textureX, textureY); // Box 115
		bodyModel[12] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 110
		bodyModel[13] = new ModelRendererTurbo(this, 58, 88, textureX, textureY); // Box 111
		bodyModel[14] = new ModelRendererTurbo(this, 48, 91, textureX, textureY); // Box 112
		bodyModel[15] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 75, 100, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 75, 96, textureX, textureY); // Box 214
		bodyModel[29] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 215
		bodyModel[30] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 216
		bodyModel[31] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 217
		bodyModel[32] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 218
		bodyModel[33] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 219
		bodyModel[34] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 220
		bodyModel[35] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 67
		bodyModel[40] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 68
		bodyModel[41] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 70
		bodyModel[43] = new ModelRendererTurbo(this, 75, 104, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 72
		bodyModel[46] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 73
		bodyModel[47] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 74
		bodyModel[48] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 75
		bodyModel[49] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 76
		bodyModel[50] = new ModelRendererTurbo(this, 75, 108, textureX, textureY); // Box 77
		bodyModel[51] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 221
		bodyModel[52] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 222
		bodyModel[53] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 223
		bodyModel[54] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 224
		bodyModel[55] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 225
		bodyModel[56] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 226
		bodyModel[57] = new ModelRendererTurbo(this, 192, 108, textureX, textureY); // Box 12
		bodyModel[58] = new ModelRendererTurbo(this, 158, 64, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 282, 86, textureX, textureY); // Box 90
		bodyModel[60] = new ModelRendererTurbo(this, 143, 60, textureX, textureY); // Box 92
		bodyModel[61] = new ModelRendererTurbo(this, 255, 90, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 282, 60, textureX, textureY); // Box 10
		bodyModel[63] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 78
		bodyModel[64] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 130
		bodyModel[65] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 132
		bodyModel[66] = new ModelRendererTurbo(this, 206, 62, textureX, textureY); // Box 155
		bodyModel[67] = new ModelRendererTurbo(this, 238, 62, textureX, textureY); // Box 156
		bodyModel[68] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 158
		bodyModel[69] = new ModelRendererTurbo(this, 216, 56, textureX, textureY); // Box 159
		bodyModel[70] = new ModelRendererTurbo(this, 247, 57, textureX, textureY); // Box 145
		bodyModel[71] = new ModelRendererTurbo(this, 239, 54, textureX, textureY); // Box 146
		bodyModel[72] = new ModelRendererTurbo(this, 238, 89, textureX, textureY); // Box 147
		bodyModel[73] = new ModelRendererTurbo(this, 206, 89, textureX, textureY); // Box 148
		bodyModel[74] = new ModelRendererTurbo(this, 217, 92, textureX, textureY); // Box 149
		bodyModel[75] = new ModelRendererTurbo(this, 216, 52, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 247, 51, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 239, 48, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 168, 13, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 168, 10, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 178, 109, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 178, 109, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 125, 62, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 117, 82, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 120, 64, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 138, 64, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 120, 90, textureX, textureY); // Box 84
		bodyModel[87] = new ModelRendererTurbo(this, 138, 90, textureX, textureY); // Box 85
		bodyModel[88] = new ModelRendererTurbo(this, 117, 56, textureX, textureY); // Box 86
		bodyModel[89] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 80
		bodyModel[90] = new ModelRendererTurbo(this, 134, 51, textureX, textureY); // Box 81
		bodyModel[91] = new ModelRendererTurbo(this, 110, 92, textureX, textureY); // Box 82
		bodyModel[92] = new ModelRendererTurbo(this, 115, 92, textureX, textureY); // Box 83
		bodyModel[93] = new ModelRendererTurbo(this, 133, 82, textureX, textureY); // Box 179
		bodyModel[94] = new ModelRendererTurbo(this, 110, 66, textureX, textureY); // Box 180
		bodyModel[95] = new ModelRendererTurbo(this, 115, 66, textureX, textureY); // Box 181
		bodyModel[96] = new ModelRendererTurbo(this, 334, 4, textureX, textureY, "cull"); // Box roof cull
		bodyModel[97] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 113
		bodyModel[98] = new ModelRendererTurbo(this, 21, 22, textureX, textureY); // Box 114
		bodyModel[99] = new ModelRendererTurbo(this, 2, 22, textureX, textureY); // Box 115
		bodyModel[100] = new ModelRendererTurbo(this, 21, 31, textureX, textureY); // Box 116
		bodyModel[101] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 25
		bodyModel[102] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 26
		bodyModel[103] = new ModelRendererTurbo(this, 34, 12, textureX, textureY); // Box 316
		bodyModel[104] = new ModelRendererTurbo(this, 38, 83, textureX, textureY); // Box 166 handrail
		bodyModel[105] = new ModelRendererTurbo(this, 29, 12, textureX, textureY); // Box 165
		bodyModel[106] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 166
		bodyModel[107] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 167
		bodyModel[108] = new ModelRendererTurbo(this, 29, 9, textureX, textureY); // Box 168
		bodyModel[109] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 151
		bodyModel[110] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 152
		bodyModel[111] = new ModelRendererTurbo(this, 44, 59, textureX, textureY); // Box 556
		bodyModel[112] = new ModelRendererTurbo(this, 38, 57, textureX, textureY); // Box 557
		bodyModel[113] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 558
		bodyModel[114] = new ModelRendererTurbo(this, 44, 57, textureX, textureY); // Box 559
		bodyModel[115] = new ModelRendererTurbo(this, 44, 54, textureX, textureY); // Box 139
		bodyModel[116] = new ModelRendererTurbo(this, 38, 52, textureX, textureY); // Box 140
		bodyModel[117] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 141
		bodyModel[118] = new ModelRendererTurbo(this, 44, 52, textureX, textureY); // Box 142
		bodyModel[119] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 194
		bodyModel[120] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 195
		bodyModel[121] = new ModelRendererTurbo(this, 28, 57, textureX, textureY); // Box 196
		bodyModel[122] = new ModelRendererTurbo(this, 31, 57, textureX, textureY); // Box 197
		bodyModel[123] = new ModelRendererTurbo(this, 31, 54, textureX, textureY); // Box 147
		bodyModel[124] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 148
		bodyModel[125] = new ModelRendererTurbo(this, 28, 52, textureX, textureY); // Box 149
		bodyModel[126] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 150
		bodyModel[127] = new ModelRendererTurbo(this, 137, 6, textureX, textureY); // Box 173
		bodyModel[128] = new ModelRendererTurbo(this, 136, 3, textureX, textureY, "cull"); // Box 240 chimney cull
		bodyModel[129] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 230
		bodyModel[130] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 233
		bodyModel[131] = new ModelRendererTurbo(this, 40, 38, textureX, textureY, "cull"); // Box 154 cull
		bodyModel[132] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 277
		bodyModel[133] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 355 brakewheel
		bodyModel[134] = new ModelRendererTurbo(this, 49, 38, textureX, textureY, "cull"); // Box 159 cull
		bodyModel[135] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 160
		bodyModel[136] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 161
		bodyModel[137] = new ModelRendererTurbo(this, 206, 44, textureX, textureY); // Box 107
		bodyModel[138] = new ModelRendererTurbo(this, 206, 48, textureX, textureY); // Box 160
		bodyModel[139] = new ModelRendererTurbo(this, 180, 47, textureX, textureY); // Box 165
		bodyModel[140] = new ModelRendererTurbo(this, 158, 53, textureX, textureY); // Box 166
		bodyModel[141] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 286
		bodyModel[142] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 287
		bodyModel[143] = new ModelRendererTurbo(this, 89, 114, textureX, textureY, "cull"); // Box cull brakecyl holder
		bodyModel[144] = new ModelRendererTurbo(this, 70, 77, textureX, textureY); // Box 153
		bodyModel[145] = new ModelRendererTurbo(this, 93, 97, textureX, textureY, "cull"); // Box 484 cull
		bodyModel[146] = new ModelRendererTurbo(this, 94, 100, textureX, textureY); // Box 485
		bodyModel[147] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 167
		bodyModel[148] = new ModelRendererTurbo(this, 23, 42, textureX, textureY); // Box 81
		bodyModel[149] = new ModelRendererTurbo(this, 23, 45, textureX, textureY); // Box 248
		bodyModel[150] = new ModelRendererTurbo(this, 34, 6, textureX, textureY); // Box 176
		bodyModel[151] = new ModelRendererTurbo(this, 29, 6, textureX, textureY); // Box 177
		bodyModel[152] = new ModelRendererTurbo(this, 34, 3, textureX, textureY); // Box 178
		bodyModel[153] = new ModelRendererTurbo(this, 29, 3, textureX, textureY); // Box 179
		bodyModel[154] = new ModelRendererTurbo(this, 206, 46, textureX, textureY); // Box 180
		bodyModel[155] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 182
		bodyModel[156] = new ModelRendererTurbo(this, 249, 64, textureX, textureY); // Box 183
		bodyModel[157] = new ModelRendererTurbo(this, 249, 90, textureX, textureY); // Box 184
		bodyModel[158] = new ModelRendererTurbo(this, 201, 90, textureX, textureY); // Box 185
		bodyModel[159] = new ModelRendererTurbo(this, 104, 1, textureX, textureY, "cull"); // Box 213 cull partition
		bodyModel[160] = new ModelRendererTurbo(this, 91, 1, textureX, textureY, "cull"); // Box 191 cull partition
		bodyModel[161] = new ModelRendererTurbo(this, 78, 1, textureX, textureY, "cull"); // Box 192 cull parition
		bodyModel[162] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 165
		bodyModel[163] = new ModelRendererTurbo(this, 112, 23, textureX, textureY); // Box 166
		bodyModel[164] = new ModelRendererTurbo(this, 125, 43, textureX, textureY); // Box 204
		bodyModel[165] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 205
		bodyModel[166] = new ModelRendererTurbo(this, 5, 13, textureX, textureY); // Box 206
		bodyModel[167] = new ModelRendererTurbo(this, 16, 13, textureX, textureY); // Box 207
		bodyModel[168] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 208
		bodyModel[169] = new ModelRendererTurbo(this, 129, 23, textureX, textureY); // Import Box106
		bodyModel[170] = new ModelRendererTurbo(this, 78, 24, textureX, textureY); // Box 238
		bodyModel[171] = new ModelRendererTurbo(this, 79, 32, textureX, textureY); // Box 239
		bodyModel[172] = new ModelRendererTurbo(this, 86, 30, textureX, textureY); // Box 240
		bodyModel[173] = new ModelRendererTurbo(this, 295, 57, textureX, textureY); // Box 241
		bodyModel[174] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 242
		bodyModel[175] = new ModelRendererTurbo(this, 96, 32, textureX, textureY); // Box 243
		bodyModel[176] = new ModelRendererTurbo(this, 117, 2, textureX, textureY); // Box 202
		bodyModel[177] = new ModelRendererTurbo(this, 125, 36, textureX, textureY); // Box 180
		bodyModel[178] = new ModelRendererTurbo(this, 50, 5, textureX, textureY); // Box 181
		bodyModel[179] = new ModelRendererTurbo(this, 78, 46, textureX, textureY, "cull"); // Box 199 cull vanity
		bodyModel[180] = new ModelRendererTurbo(this, 93, 41, textureX, textureY); // Box 200
		bodyModel[181] = new ModelRendererTurbo(this, 159, 33, textureX, textureY); // Box 184
		bodyModel[182] = new ModelRendererTurbo(this, 159, 22, textureX, textureY); // Box 185
		bodyModel[183] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 192
		bodyModel[184] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 193
		bodyModel[185] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 194
		bodyModel[186] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 195
		bodyModel[187] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 196
		bodyModel[188] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 197
		bodyModel[189] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 200
		bodyModel[190] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 201
		bodyModel[191] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 202
		bodyModel[192] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 203
		bodyModel[193] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 204
		bodyModel[194] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 205
		bodyModel[195] = new ModelRendererTurbo(this, 164, 16, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[196] = new ModelRendererTurbo(this, 156, 35, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[197] = new ModelRendererTurbo(this, 156, 25, textureX, textureY, "cull"); // Box 216 cull support
		bodyModel[198] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 174
		bodyModel[199] = new ModelRendererTurbo(this, 1, 74, textureX, textureY, "cull"); // Box 175 cull
		bodyModel[200] = new ModelRendererTurbo(this, 12, 74, textureX, textureY, "cull"); // Box 158 cull
		bodyModel[201] = new ModelRendererTurbo(this, 38, 79, textureX, textureY); // Box 159
		bodyModel[202] = new ModelRendererTurbo(this, 38, 74, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[203] = new ModelRendererTurbo(this, 49, 74, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[204] = new ModelRendererTurbo(this, 148, 5, textureX, textureY, "cull"); // Box 178 cull
		bodyModel[205] = new ModelRendererTurbo(this, 148, 5, textureX, textureY, "cull"); // Box 275 cull walkway
		bodyModel[206] = new ModelRendererTurbo(this, 150, 33, textureX, textureY); // Box 524 chimney
		bodyModel[207] = new ModelRendererTurbo(this, 150, 24, textureX, textureY); // Box 132 chimney
		bodyModel[208] = new ModelRendererTurbo(this, 149, 29, textureX, textureY); // Box 133 chimney
		bodyModel[209] = new ModelRendererTurbo(this, 143, 13, textureX, textureY); // Box 172
		bodyModel[210] = new ModelRendererTurbo(this, 299, 4, textureX, textureY, "cull"); // Box 223 roof cull
		bodyModel[211] = new ModelRendererTurbo(this, 264, 4, textureX, textureY, "cull"); // Box 224 roof cull
		bodyModel[212] = new ModelRendererTurbo(this, 229, 4, textureX, textureY, "cull"); // Box 225 roof cull
		bodyModel[213] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 426 light rear
		bodyModel[214] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 250 light front
		bodyModel[215] = new ModelRendererTurbo(this, 210, 10, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[216] = new ModelRendererTurbo(this, 191, 10, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[217] = new ModelRendererTurbo(this, 168, 8, textureX, textureY); // Box 563
		bodyModel[218] = new ModelRendererTurbo(this, 168, 6, textureX, textureY); // Box 564
		bodyModel[219] = new ModelRendererTurbo(this, 374, 115, textureX, textureY); // Box 421 prime base
		bodyModel[220] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[221] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[222] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[223] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[224] = new ModelRendererTurbo(this, 374, 123, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[225] = new ModelRendererTurbo(this, 143, 4, textureX, textureY); // Box 373 get yo long ass antennae out of the caption
		bodyModel[226] = new ModelRendererTurbo(this, 384, 116, textureX, textureY); // Box 373
		bodyModel[227] = new ModelRendererTurbo(this, 387, 116, textureX, textureY); // Box 373
		bodyModel[228] = new ModelRendererTurbo(this, 79, 70, textureX, textureY); // Box 410 fncc light holder
		bodyModel[229] = new ModelRendererTurbo(this, 91, 66, textureX, textureY, "lamp"); // Box 411 front light R
		bodyModel[230] = new ModelRendererTurbo(this, 86, 69, textureX, textureY, "lamp"); // Box 412 front light L
		bodyModel[231] = new ModelRendererTurbo(this, 86, 69, textureX, textureY, "lamp"); // Box 257 rear light l
		bodyModel[232] = new ModelRendererTurbo(this, 91, 66, textureX, textureY, "lamp"); // Box 257 real light r
		bodyModel[233] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 259 fncc light holder
		bodyModel[234] = new ModelRendererTurbo(this, 391, 119, textureX, textureY); // Box 361
		bodyModel[235] = new ModelRendererTurbo(this, 383, 125, textureX, textureY); // Box 362
		bodyModel[236] = new ModelRendererTurbo(this, 384, 119, textureX, textureY); // Box 363
		bodyModel[237] = new ModelRendererTurbo(this, 384, 122, textureX, textureY); // Box 364
		bodyModel[238] = new ModelRendererTurbo(this, 63, 55, textureX, textureY, "lamp"); // Box 247 Headlight Front
		bodyModel[239] = new ModelRendererTurbo(this, 77, 55, textureX, textureY, "lamp"); // Box 248 Headlight Front
		bodyModel[240] = new ModelRendererTurbo(this, 98, 54, textureX, textureY); // Box 296
		bodyModel[241] = new ModelRendererTurbo(this, 70, 55, textureX, textureY, "lamp"); // Box 264 glow
		bodyModel[242] = new ModelRendererTurbo(this, 91, 54, textureX, textureY); // Box 263
		bodyModel[243] = new ModelRendererTurbo(this, 84, 55, textureX, textureY, "lamp"); // Box 264 glow
		bodyModel[244] = new ModelRendererTurbo(this, 62, 32, textureX, textureY); // Box 206
		bodyModel[245] = new ModelRendererTurbo(this, 61, 24, textureX, textureY); // Box 207
		bodyModel[246] = new ModelRendererTurbo(this, 40, 31, textureX, textureY, "cull"); // Box 255 cull
		bodyModel[247] = new ModelRendererTurbo(this, 49, 31, textureX, textureY, "cull"); // Box 256 cull
		bodyModel[248] = new ModelRendererTurbo(this, 295, 63, textureX, textureY); // Box 257
		bodyModel[249] = new ModelRendererTurbo(this, 311, 54, textureX, textureY); // Box 258
		bodyModel[250] = new ModelRendererTurbo(this, 304, 54, textureX, textureY); // Box 259
		bodyModel[251] = new ModelRendererTurbo(this, 134, 6, textureX, textureY); // Box 260
		bodyModel[252] = new ModelRendererTurbo(this, 134, 6, textureX, textureY); // Box 261
		bodyModel[253] = new ModelRendererTurbo(this, 297, 72, textureX, textureY); // Box 253
		bodyModel[254] = new ModelRendererTurbo(this, 297, 78, textureX, textureY); // Box 254
		bodyModel[255] = new ModelRendererTurbo(this, 297, 76, textureX, textureY); // Box 255
		bodyModel[256] = new ModelRendererTurbo(this, 297, 74, textureX, textureY); // Box 256
		bodyModel[257] = new ModelRendererTurbo(this, 297, 72, textureX, textureY); // Box 257
		bodyModel[258] = new ModelRendererTurbo(this, 297, 78, textureX, textureY); // Box 258
		bodyModel[259] = new ModelRendererTurbo(this, 297, 76, textureX, textureY); // Box 259
		bodyModel[260] = new ModelRendererTurbo(this, 297, 74, textureX, textureY); // Box 260
		bodyModel[261] = new ModelRendererTurbo(this, 408, 102, textureX, textureY); // Box 282
		bodyModel[262] = new ModelRendererTurbo(this, 395, 99, textureX, textureY); // Box 283
		bodyModel[263] = new ModelRendererTurbo(this, 421, 100, textureX, textureY); // Box 24
		bodyModel[264] = new ModelRendererTurbo(this, 434, 98, textureX, textureY); // Box 25
		bodyModel[265] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 729
		bodyModel[266] = new ModelRendererTurbo(this, 395, 112, textureX, textureY); // Box 730
		bodyModel[267] = new ModelRendererTurbo(this, 434, 111, textureX, textureY); // Box 405
		bodyModel[268] = new ModelRendererTurbo(this, 421, 113, textureX, textureY); // Box 406

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[2].setRotationPoint(-30F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 6
		bodyModel[3].setRotationPoint(25F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 50, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-25F, 4F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[5].setRotationPoint(-18.5F, 3F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 124
		bodyModel[6].setRotationPoint(-18.5F, 3F, 2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[7].setRotationPoint(15.5F, 3F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.05F, 0F, -1F, -0.05F); // Box 227
		bodyModel[8].setRotationPoint(15.5F, 3F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[9].setRotationPoint(30.01F, 3F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[10].setRotationPoint(30.01F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 115
		bodyModel[11].setRotationPoint(30.01F, 3F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[12].setRotationPoint(-31.01F, 3F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[13].setRotationPoint(-31.01F, 3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 112
		bodyModel[14].setRotationPoint(-31.01F, 3F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-30F, 3F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-30F, 3F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[17].setRotationPoint(-30F, 3F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-30F, 9F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-30F, 7F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-30F, 5F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-30F, 7F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(-30F, 3F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(-30F, 3F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-30F, 5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-30F, 3F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(-25F, 3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 37
		bodyModel[27].setRotationPoint(-25F, 3F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[28].setRotationPoint(-30F, 3F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[29].setRotationPoint(-30F, 3F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 216
		bodyModel[30].setRotationPoint(-30F, 5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[31].setRotationPoint(-30F, 5F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 218
		bodyModel[32].setRotationPoint(-30F, 7F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[33].setRotationPoint(-30F, 7F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[34].setRotationPoint(-30F, 9F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[35].setRotationPoint(30F, 3F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 57
		bodyModel[36].setRotationPoint(30F, 3F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[37].setRotationPoint(25F, 3F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 59
		bodyModel[38].setRotationPoint(25F, 3F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[39].setRotationPoint(30F, 3F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[40].setRotationPoint(30F, 3F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[41].setRotationPoint(25F, 3F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[42].setRotationPoint(25F, 3F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[43].setRotationPoint(25F, 3F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[44].setRotationPoint(25F, 5F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[45].setRotationPoint(25F, 3F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 73
		bodyModel[46].setRotationPoint(25F, 5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 74
		bodyModel[47].setRotationPoint(25F, 7F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[48].setRotationPoint(25F, 7F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[49].setRotationPoint(25F, 9F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[50].setRotationPoint(25F, 3F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[51].setRotationPoint(25F, 5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[52].setRotationPoint(25F, 3F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[53].setRotationPoint(25F, 5F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[54].setRotationPoint(25F, 7F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[55].setRotationPoint(25F, 7F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[56].setRotationPoint(25F, 9F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 50, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		bodyModel[57].setRotationPoint(-25F, 3F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 2
		bodyModel[58].setRotationPoint(-17F, -13F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 90
		bodyModel[59].setRotationPoint(-17F, -13F, 3F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 92
		bodyModel[60].setRotationPoint(-17F, -13F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 131
		bodyModel[61].setRotationPoint(-17F, -13F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 10
		bodyModel[62].setRotationPoint(16F, -13F, -8F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 78
		bodyModel[63].setRotationPoint(16F, -13F, 3F);

		bodyModel[64].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 130
		bodyModel[64].setRotationPoint(5F, -13F, -9F);

		bodyModel[65].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 132
		bodyModel[65].setRotationPoint(5F, -13F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[66].setRotationPoint(-5.5F, -11F, -13F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[67].setRotationPoint(4.5F, -11F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		bodyModel[68].setRotationPoint(-4.5F, -11F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 159
		bodyModel[69].setRotationPoint(-4.5F, -12F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[70].setRotationPoint(-5.5F, -12F, -13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[71].setRotationPoint(4.5F, -12F, -13F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 147
		bodyModel[72].setRotationPoint(-5.5F, -11F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[73].setRotationPoint(4.5F, -11F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[74].setRotationPoint(-4.5F, -11F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[75].setRotationPoint(-4.5F, -12F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 88
		bodyModel[76].setRotationPoint(-5.5F, -12F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 89
		bodyModel[77].setRotationPoint(4.5F, -12F, 9F);

		bodyModel[78].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 90
		bodyModel[78].setRotationPoint(-5F, -13F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 91
		bodyModel[79].setRotationPoint(-5F, -13F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 92
		bodyModel[80].setRotationPoint(-5F, 3F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[81].setRotationPoint(-5F, 3F, 9F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 87
		bodyModel[82].setRotationPoint(-17F, -12F, -2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 88
		bodyModel[83].setRotationPoint(-17.5F, -13F, -2.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 89
		bodyModel[84].setRotationPoint(-17.5F, -13F, 2.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 91
		bodyModel[85].setRotationPoint(-17.5F, -13F, -3.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 84
		bodyModel[86].setRotationPoint(16.5F, -13F, -3.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 85
		bodyModel[87].setRotationPoint(16.5F, -13F, 2.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 86
		bodyModel[88].setRotationPoint(16.5F, -13F, -2.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 80
		bodyModel[89].setRotationPoint(16F, -12F, -2.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 81
		bodyModel[90].setRotationPoint(16F, -13F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[91].setRotationPoint(16F, -12F, 2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[92].setRotationPoint(16F, -12F, -3.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 179
		bodyModel[93].setRotationPoint(-17F, -13F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[94].setRotationPoint(-17F, -12F, -3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[95].setRotationPoint(-17F, -12F, 2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box roof cull
		bodyModel[96].setRotationPoint(-25F, -14F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 113
		bodyModel[97].setRotationPoint(17F, -4F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[98].setRotationPoint(17F, -4F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 115
		bodyModel[99].setRotationPoint(-25F, -4F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[100].setRotationPoint(-25F, -4F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[101].setRotationPoint(-25F, 3F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[102].setRotationPoint(-25F, 3F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 316
		bodyModel[103].setRotationPoint(-30.01F, -6F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 166 handrail
		bodyModel[104].setRotationPoint(-30.01F, -6F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 165
		bodyModel[105].setRotationPoint(-30.01F, -6F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 166
		bodyModel[106].setRotationPoint(30.01F, -6F, 7F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 167
		bodyModel[107].setRotationPoint(30.01F, -6F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 168
		bodyModel[108].setRotationPoint(30.01F, -6F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[109].setRotationPoint(-25.01F, -13F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[110].setRotationPoint(25.01F, -13F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 556
		bodyModel[111].setRotationPoint(-20F, 3F, -9.01F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 557
		bodyModel[112].setRotationPoint(-25F, -4F, -9.01F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 558
		bodyModel[113].setRotationPoint(-25F, -2F, -9.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 559
		bodyModel[114].setRotationPoint(-23F, 3F, -9.01F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 139
		bodyModel[115].setRotationPoint(-20F, 3F, 9.01F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 140
		bodyModel[116].setRotationPoint(-25F, -4F, 9.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 141
		bodyModel[117].setRotationPoint(-25F, -2F, 9.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 142
		bodyModel[118].setRotationPoint(-23F, 3F, 9.01F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 194
		bodyModel[119].setRotationPoint(18F, 3F, -9.01F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 195
		bodyModel[120].setRotationPoint(24F, -4F, -9.01F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 196
		bodyModel[121].setRotationPoint(24F, -2F, -9.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[122].setRotationPoint(20F, 3F, -9.01F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[123].setRotationPoint(18F, 3F, 9.01F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 148
		bodyModel[124].setRotationPoint(24F, -4F, 9.01F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 149
		bodyModel[125].setRotationPoint(24F, -2F, 9.01F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[126].setRotationPoint(20F, 3F, 9.01F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 173
		bodyModel[127].setRotationPoint(7.5F, -20F, 5.62F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F); // Box 240 chimney cull
		bodyModel[128].setRotationPoint(7.37F, -20.5F, 4.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[129].setRotationPoint(-8.5F, 3.5F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[130].setRotationPoint(7.5F, 3.5F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 154 cull
		bodyModel[131].setRotationPoint(-31F, -4F, 2F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[132].setRotationPoint(-29.25F, -3F, 3.5F);
		bodyModel[132].rotateAngleY = 1.57079633F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[133].setRotationPoint(-29.25F, -5F, 1.5F);
		bodyModel[133].rotateAngleY = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159 cull
		bodyModel[134].setRotationPoint(30F, -4F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 160
		bodyModel[135].setRotationPoint(29.25F, -5F, -6.5F);
		bodyModel[135].rotateAngleY = 1.57079633F;

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[136].setRotationPoint(30.25F, -3F, -4.5F);
		bodyModel[136].rotateAngleY = 1.57079633F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 50, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[137].setRotationPoint(-25F, 3.5F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[138].setRotationPoint(-25F, 3.5F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[139].setRotationPoint(17F, -2F, 3.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[140].setRotationPoint(-25F, -2F, -8.5F);

		bodyModel[141].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[141].setRotationPoint(-3F, 5F, -7F);
		bodyModel[141].rotateAngleX = -0.78539816F;

		bodyModel[142].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[142].setRotationPoint(0F, 5F, -7F);
		bodyModel[142].rotateAngleX = -0.78539816F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull brakecyl holder
		bodyModel[143].setRotationPoint(-3F, 3.5F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[144].setRotationPoint(-8.5F, 4.5F, 2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[145].setRotationPoint(-7F, 3.5F, -8.5F);

		bodyModel[146].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[146].setRotationPoint(-6F, 4.5F, -8F);
		bodyModel[146].rotateAngleY = -0.78539816F;

		bodyModel[147].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[147].setRotationPoint(-4F, 4.5F, -8F);
		bodyModel[147].rotateAngleY = -0.78539816F;

		bodyModel[148].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 81
		bodyModel[148].setRotationPoint(32.5F, 4F, -0.5F);
		bodyModel[148].rotateAngleY = 1.30899694F;

		bodyModel[149].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 248
		bodyModel[149].setRotationPoint(-32.5F, 4F, 0.5F);
		bodyModel[149].rotateAngleY = -1.83259571F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 176
		bodyModel[150].setRotationPoint(-25.02F, -5F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 177
		bodyModel[151].setRotationPoint(-25.02F, -5F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 178
		bodyModel[152].setRotationPoint(25.02F, -5F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 179
		bodyModel[153].setRotationPoint(25.02F, -5F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 35, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 180
		bodyModel[154].setRotationPoint(-10F, 3.5F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[155].setRotationPoint(-5F, -12F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[156].setRotationPoint(4F, -12F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[157].setRotationPoint(-5F, -12F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 185
		bodyModel[158].setRotationPoint(4F, -12F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213 cull partition
		bodyModel[159].setRotationPoint(-4.5F, -7F, 4F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191 cull partition
		bodyModel[160].setRotationPoint(3.5F, -7F, 4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192 cull parition
		bodyModel[161].setRotationPoint(3.5F, -7F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[162].setRotationPoint(9F, -13F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[163].setRotationPoint(-4.5F, -7F, -9F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 204
		bodyModel[164].setRotationPoint(-16F, -4F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[165].setRotationPoint(-16F, -4F, -3.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[166].setRotationPoint(15F, -5F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[167].setRotationPoint(12F, -1F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[168].setRotationPoint(-12F, 0F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[169].setRotationPoint(5F, -5F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[170].setRotationPoint(-2F, -1F, 5.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[171].setRotationPoint(-2F, -5F, 5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[172].setRotationPoint(-1F, 0F, 6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[173].setRotationPoint(-1F, 0F, -8.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[174].setRotationPoint(-2F, -1F, -9.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[175].setRotationPoint(1F, -5F, -9.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 202
		bodyModel[176].setRotationPoint(-7.5F, -13F, 5F);

		bodyModel[177].addBox(0F, 0F, 0F, 9, 1, 5, 0F); // Box 180
		bodyModel[177].setRotationPoint(-16F, -1F, 3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[178].setRotationPoint(10F, -13F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 cull vanity
		bodyModel[179].setRotationPoint(8.99F, -5F, 5.01F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[180].setRotationPoint(12F, -5F, 4.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 34, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[181].setRotationPoint(-17F, -14F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 34, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[182].setRotationPoint(-17F, -14F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 192
		bodyModel[183].setRotationPoint(-10.5F, -15.5F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 193
		bodyModel[184].setRotationPoint(-10.5F, -15.5F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 194
		bodyModel[185].setRotationPoint(-4F, -15.5F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 195
		bodyModel[186].setRotationPoint(-4F, -15.5F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 196
		bodyModel[187].setRotationPoint(3F, -15.5F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 197
		bodyModel[188].setRotationPoint(3F, -15.5F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 200
		bodyModel[189].setRotationPoint(9.5F, -15.5F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 201
		bodyModel[190].setRotationPoint(9.5F, -15.5F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 202
		bodyModel[191].setRotationPoint(16F, -15.5F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 203
		bodyModel[192].setRotationPoint(16F, -15.5F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 204
		bodyModel[193].setRotationPoint(-17F, -15.5F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 205
		bodyModel[194].setRotationPoint(-17F, -15.5F, -8F);

		bodyModel[195].addBox(0F, 0F, 0F, 53, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[195].setRotationPoint(-26.5F, -15.25F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[196].setRotationPoint(-26.5F, -14.25F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box 216 cull support
		bodyModel[197].setRotationPoint(25.5F, -14.25F, -2F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 174
		bodyModel[198].setRotationPoint(25.5F, -14F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 cull
		bodyModel[199].setRotationPoint(24.5F, -18F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 158 cull
		bodyModel[200].setRotationPoint(23.5F, -18F, 2F);

		bodyModel[201].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 159
		bodyModel[201].setRotationPoint(-25.5F, -14F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 cull
		bodyModel[202].setRotationPoint(-25.5F, -18F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[203].setRotationPoint(-24.5F, -18F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 178 cull
		bodyModel[204].setRotationPoint(20.5F, -15.5F, 2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275 cull walkway
		bodyModel[205].setRotationPoint(-24.5F, -15.5F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 524 chimney
		bodyModel[206].setRotationPoint(13.5F, -16F, -6.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 132 chimney
		bodyModel[207].setRotationPoint(13.5F, -18F, -6.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133 chimney
		bodyModel[208].setRotationPoint(13.5F, -14F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[209].setRotationPoint(13.25F, -18.5F, -6.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223 roof cull
		bodyModel[210].setRotationPoint(-25F, -14F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 224 roof cull
		bodyModel[211].setRotationPoint(17F, -14F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225 roof cull
		bodyModel[212].setRotationPoint(17F, -14F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 426 light rear
		bodyModel[213].setRotationPoint(24.51F, -14.55F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 250 light front
		bodyModel[214].setRotationPoint(-25.51F, -14.55F, -1F);

		bodyModel[215].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[215].setRotationPoint(-17F, -15.5F, -7.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[216].setRotationPoint(-17F, -15.5F, 4.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[217].setRotationPoint(-16.5F, -16.5F, -6F);

		bodyModel[218].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[218].setRotationPoint(-16.5F, -16.5F, 6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[219].setRotationPoint(-0.5F, -16.75F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[220].setRotationPoint(-0.5F, -17.25F, 3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[221].setRotationPoint(-0.5F, -17.25F, 3F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[222].setRotationPoint(-0.5F, -17.25F, 3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[223].setRotationPoint(-0.5F, -17.25F, 3F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[224].setRotationPoint(-0.5F, -15.75F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 373 get yo long ass antennae out of the caption
		bodyModel[225].setRotationPoint(-9F, -20.5F, -6F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[226].setRotationPoint(10.75F, -15.75F, 5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[227].setRotationPoint(10.75F, -15.75F, -5F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 410 fncc light holder
		bodyModel[228].setRotationPoint(-26.01F, -14.25F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 front light R
		bodyModel[229].setRotationPoint(-26.26F, -14.2F, -2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 front light L
		bodyModel[230].setRotationPoint(-26.26F, -14.2F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 rear light l
		bodyModel[231].setRotationPoint(25.25F, -14.2F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257 real light r
		bodyModel[232].setRotationPoint(25.25F, -14.2F, 0F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 259 fncc light holder
		bodyModel[233].setRotationPoint(25F, -14.25F, -2F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 361
		bodyModel[234].setRotationPoint(0F, -15.05F, -6.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[235].setRotationPoint(-2F, -16.05F, -5.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[236].setRotationPoint(-1F, -16.05F, -7.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[237].setRotationPoint(0F, -16.05F, -6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 Headlight Front
		bodyModel[238].setRotationPoint(17F, -12.2F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 Headlight Front
		bodyModel[239].setRotationPoint(17F, -10.2F, -8F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 296
		bodyModel[240].setRotationPoint(16.25F, -12.2F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 264 glow
		bodyModel[241].setRotationPoint(-18F, -12.2F, 6F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 263
		bodyModel[242].setRotationPoint(-17.25F, -12.2F, 6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 264 glow
		bodyModel[243].setRotationPoint(-18F, -10.2F, 6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[244].setRotationPoint(-10F, -5F, -7.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[245].setRotationPoint(-13F, -1F, -7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 255 cull
		bodyModel[246].setRotationPoint(29F, 0F, -5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 256 cull
		bodyModel[247].setRotationPoint(-30F, 0F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[248].setRotationPoint(-1F, -7.5F, -1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[249].setRotationPoint(-1.4F, -13F, -1.01F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 16, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[250].setRotationPoint(-1.4F, -13F, 1.01F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 1.5F, 3F, 0F, 1.5F); // Box 260
		bodyModel[251].setRotationPoint(7.5F, -18.5F, 5.48F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, -1.5F, 3F, 0F, -1.5F); // Box 261
		bodyModel[252].setRotationPoint(7.5F, -18.5F, 5.48F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 253
		bodyModel[253].setRotationPoint(-5F, -10.75F, -11.01F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 254
		bodyModel[254].setRotationPoint(0F, -10.25F, -11.01F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[255].setRotationPoint(-5F, -4.25F, -11.01F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 256
		bodyModel[256].setRotationPoint(0F, -3.75F, -11.01F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 257
		bodyModel[257].setRotationPoint(-5F, -10.75F, 11.01F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 258
		bodyModel[258].setRotationPoint(0F, -10.25F, 11.01F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 259
		bodyModel[259].setRotationPoint(-5F, -4.25F, 11.01F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 260
		bodyModel[260].setRotationPoint(0F, -3.75F, 11.01F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[261].setRotationPoint(-34F, 7F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[262].setRotationPoint(-34F, 7F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[263].setRotationPoint(-33F, 6F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[264].setRotationPoint(-33F, 6F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[265].setRotationPoint(33F, 7F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[266].setRotationPoint(33F, 7F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[267].setRotationPoint(32F, 6F, 0F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[268].setRotationPoint(32F, 6F, -10F);
	}
	ModelCabooseTruck2 theTrucks2 = new ModelCabooseTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 269; i++) {
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
		if (GetColor(entity) == 1124) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver_generator2.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_Silver2.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_left-generator3rigth.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck4.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}