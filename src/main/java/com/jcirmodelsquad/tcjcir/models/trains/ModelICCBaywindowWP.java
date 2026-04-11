//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.12.2023 - 18:28:52
// Last changed on: 02.12.2023 - 18:28:52

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
import net.minecraft.client.Minecraft;
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

public class ModelICCBaywindowWP extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelICCBaywindowWP() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[260];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 158, 64, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 306, 120, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 306, 120, textureX, textureY); // Box 1 coupler
		bodyModel[3] = new ModelRendererTurbo(this, 163, 113, textureX, textureY); // Box 10 frame of the boose
		bodyModel[4] = new ModelRendererTurbo(this, 184, 113, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 298, 60, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 100, 120, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 187, 108, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 32
		bodyModel[18] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 75, 100, textureX, textureY); // Box 35
		bodyModel[21] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 149, 3, textureX, textureY); // Box 49
		bodyModel[24] = new ModelRendererTurbo(this, 159, 33, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 159, 23, textureX, textureY); // Box 52
		bodyModel[26] = new ModelRendererTurbo(this, 160, 43, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[27] = new ModelRendererTurbo(this, 156, 35, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[28] = new ModelRendererTurbo(this, 156, 25, textureX, textureY, "cull"); // Box 216
		bodyModel[29] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 56
		bodyModel[30] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 57
		bodyModel[31] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 58
		bodyModel[32] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 59
		bodyModel[33] = new ModelRendererTurbo(this, 75, 104, textureX, textureY); // Box 66
		bodyModel[34] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 69
		bodyModel[37] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 71
		bodyModel[39] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 72
		bodyModel[40] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 73
		bodyModel[41] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 74
		bodyModel[42] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 75
		bodyModel[43] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 76
		bodyModel[44] = new ModelRendererTurbo(this, 75, 108, textureX, textureY); // Box 77
		bodyModel[45] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 78
		bodyModel[46] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 80
		bodyModel[47] = new ModelRendererTurbo(this, 133, 55, textureX, textureY); // Box 81
		bodyModel[48] = new ModelRendererTurbo(this, 110, 92, textureX, textureY); // Box 82
		bodyModel[49] = new ModelRendererTurbo(this, 115, 92, textureX, textureY); // Box 83
		bodyModel[50] = new ModelRendererTurbo(this, 120, 90, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 138, 90, textureX, textureY); // Box 85
		bodyModel[52] = new ModelRendererTurbo(this, 117, 56, textureX, textureY); // Box 86
		bodyModel[53] = new ModelRendererTurbo(this, 125, 62, textureX, textureY); // Box 87
		bodyModel[54] = new ModelRendererTurbo(this, 117, 82, textureX, textureY); // Box 88
		bodyModel[55] = new ModelRendererTurbo(this, 120, 64, textureX, textureY); // Box 89
		bodyModel[56] = new ModelRendererTurbo(this, 298, 86, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 138, 64, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 143, 60, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 206, 62, textureX, textureY); // Box 155
		bodyModel[60] = new ModelRendererTurbo(this, 238, 62, textureX, textureY); // Box 156
		bodyModel[61] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 158
		bodyModel[62] = new ModelRendererTurbo(this, 216, 56, textureX, textureY); // Box 159
		bodyModel[63] = new ModelRendererTurbo(this, 214, 88, textureX, textureY); // Box 106
		bodyModel[64] = new ModelRendererTurbo(this, 207, 49, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 197, 51, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 202, 51, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 110
		bodyModel[68] = new ModelRendererTurbo(this, 58, 88, textureX, textureY); // Box 111
		bodyModel[69] = new ModelRendererTurbo(this, 48, 91, textureX, textureY); // Box 112
		bodyModel[70] = new ModelRendererTurbo(this, 21, 88, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 114
		bodyModel[72] = new ModelRendererTurbo(this, 11, 91, textureX, textureY); // Box 115
		bodyModel[73] = new ModelRendererTurbo(this, 207, 51, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 197, 49, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 202, 49, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 214, 61, textureX, textureY); // Box 129
		bodyModel[79] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 130
		bodyModel[80] = new ModelRendererTurbo(this, 255, 90, textureX, textureY); // Box 131
		bodyModel[81] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 132
		bodyModel[82] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 133
		bodyModel[83] = new ModelRendererTurbo(this, 44, 59, textureX, textureY); // Box 556
		bodyModel[84] = new ModelRendererTurbo(this, 38, 57, textureX, textureY); // Box 557
		bodyModel[85] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 558
		bodyModel[86] = new ModelRendererTurbo(this, 44, 57, textureX, textureY); // Box 559
		bodyModel[87] = new ModelRendererTurbo(this, 44, 54, textureX, textureY); // Box 139
		bodyModel[88] = new ModelRendererTurbo(this, 38, 52, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 44, 52, textureX, textureY); // Box 142
		bodyModel[91] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 194
		bodyModel[92] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 195
		bodyModel[93] = new ModelRendererTurbo(this, 28, 57, textureX, textureY); // Box 196
		bodyModel[94] = new ModelRendererTurbo(this, 31, 57, textureX, textureY); // Box 197
		bodyModel[95] = new ModelRendererTurbo(this, 31, 54, textureX, textureY); // Box 147
		bodyModel[96] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 148
		bodyModel[97] = new ModelRendererTurbo(this, 28, 52, textureX, textureY); // Box 149
		bodyModel[98] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 150
		bodyModel[99] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 151
		bodyModel[100] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 152
		bodyModel[101] = new ModelRendererTurbo(this, 73, 77, textureX, textureY); // Box 153
		bodyModel[102] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 174
		bodyModel[103] = new ModelRendererTurbo(this, 1, 74, textureX, textureY, "cull"); // Box 175 cull
		bodyModel[104] = new ModelRendererTurbo(this, 12, 74, textureX, textureY, "cull"); // Box 158 cull
		bodyModel[105] = new ModelRendererTurbo(this, 38, 79, textureX, textureY); // Box 159
		bodyModel[106] = new ModelRendererTurbo(this, 38, 74, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[107] = new ModelRendererTurbo(this, 49, 74, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[108] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 286
		bodyModel[109] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 287
		bodyModel[110] = new ModelRendererTurbo(this, 76, 112, textureX, textureY, "cull"); // Box cull brakecyl holder
		bodyModel[111] = new ModelRendererTurbo(this, 93, 97, textureX, textureY, "cull"); // Box 484 cull
		bodyModel[112] = new ModelRendererTurbo(this, 94, 100, textureX, textureY); // Box 485
		bodyModel[113] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 167
		bodyModel[114] = new ModelRendererTurbo(this, 150, 33, textureX, textureY); // Box 524 chimney
		bodyModel[115] = new ModelRendererTurbo(this, 150, 24, textureX, textureY); // Box 132 chimney
		bodyModel[116] = new ModelRendererTurbo(this, 149, 29, textureX, textureY); // Box 133 chimney
		bodyModel[117] = new ModelRendererTurbo(this, 143, 13, textureX, textureY); // Box 172
		bodyModel[118] = new ModelRendererTurbo(this, 137, 6, textureX, textureY); // Box 173
		bodyModel[119] = new ModelRendererTurbo(this, 136, 3, textureX, textureY, "cull"); // Box 240 chimney cull
		bodyModel[120] = new ModelRendererTurbo(this, 247, 57, textureX, textureY); // Box 145
		bodyModel[121] = new ModelRendererTurbo(this, 239, 54, textureX, textureY); // Box 146
		bodyModel[122] = new ModelRendererTurbo(this, 238, 89, textureX, textureY); // Box 147
		bodyModel[123] = new ModelRendererTurbo(this, 206, 89, textureX, textureY); // Box 148
		bodyModel[124] = new ModelRendererTurbo(this, 217, 92, textureX, textureY); // Box 149
		bodyModel[125] = new ModelRendererTurbo(this, 216, 83, textureX, textureY); // Box 150
		bodyModel[126] = new ModelRendererTurbo(this, 250, 83, textureX, textureY); // Box 151
		bodyModel[127] = new ModelRendererTurbo(this, 239, 81, textureX, textureY); // Box 152
		bodyModel[128] = new ModelRendererTurbo(this, 143, 4, textureX, textureY); // Box 373 get yo long ass antennae out of the caption
		bodyModel[129] = new ModelRendererTurbo(this, 47, 89, textureX, textureY, "cull"); // Box 154 cull
		bodyModel[130] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 277
		bodyModel[131] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 355 brakewheel
		bodyModel[132] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 105, 70, textureX, textureY); // Box 158
		bodyModel[134] = new ModelRendererTurbo(this, 10, 89, textureX, textureY, "cull"); // Box 159 cull
		bodyModel[135] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 160
		bodyModel[136] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 161
		bodyModel[137] = new ModelRendererTurbo(this, 47, 84, textureX, textureY); // Box 316
		bodyModel[138] = new ModelRendererTurbo(this, 38, 83, textureX, textureY); // Box 166 handrail
		bodyModel[139] = new ModelRendererTurbo(this, 47, 84, textureX, textureY); // Box 165
		bodyModel[140] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 166
		bodyModel[141] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 167
		bodyModel[142] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 168
		bodyModel[143] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[144] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 170
		bodyModel[145] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[146] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 172
		bodyModel[147] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[148] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 174
		bodyModel[149] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "lamp"); // Box 410 glow marker
		bodyModel[150] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 176
		bodyModel[151] = new ModelRendererTurbo(this, 148, 5, textureX, textureY, "cull"); // Box 178 cull
		bodyModel[152] = new ModelRendererTurbo(this, 133, 81, textureX, textureY); // Box 179
		bodyModel[153] = new ModelRendererTurbo(this, 110, 66, textureX, textureY); // Box 180
		bodyModel[154] = new ModelRendererTurbo(this, 115, 66, textureX, textureY); // Box 181
		bodyModel[155] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 182
		bodyModel[156] = new ModelRendererTurbo(this, 249, 64, textureX, textureY); // Box 183
		bodyModel[157] = new ModelRendererTurbo(this, 249, 90, textureX, textureY); // Box 184
		bodyModel[158] = new ModelRendererTurbo(this, 201, 90, textureX, textureY); // Box 185
		bodyModel[159] = new ModelRendererTurbo(this, 195, 85, textureX, textureY); // Box 186
		bodyModel[160] = new ModelRendererTurbo(this, 195, 58, textureX, textureY); // Box 187
		bodyModel[161] = new ModelRendererTurbo(this, 55, 1, textureX, textureY); // Box 188
		bodyModel[162] = new ModelRendererTurbo(this, 129, 23, textureX, textureY); // Import Box106
		bodyModel[163] = new ModelRendererTurbo(this, 104, 1, textureX, textureY, "cull"); // Box 213 cull partition
		bodyModel[164] = new ModelRendererTurbo(this, 91, 1, textureX, textureY, "cull"); // Box 191 cull partition
		bodyModel[165] = new ModelRendererTurbo(this, 78, 1, textureX, textureY, "cull"); // Box 192 cull parition
		bodyModel[166] = new ModelRendererTurbo(this, 78, 24, textureX, textureY); // Box 238
		bodyModel[167] = new ModelRendererTurbo(this, 79, 32, textureX, textureY); // Box 239
		bodyModel[168] = new ModelRendererTurbo(this, 86, 30, textureX, textureY); // Box 240
		bodyModel[169] = new ModelRendererTurbo(this, 103, 30, textureX, textureY); // Box 241
		bodyModel[170] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 242
		bodyModel[171] = new ModelRendererTurbo(this, 96, 32, textureX, textureY); // Box 243
		bodyModel[172] = new ModelRendererTurbo(this, 78, 46, textureX, textureY, "cull"); // Box 199 cull vanity
		bodyModel[173] = new ModelRendererTurbo(this, 93, 41, textureX, textureY); // Box 200
		bodyModel[174] = new ModelRendererTurbo(this, 117, 2, textureX, textureY); // Box 202
		bodyModel[175] = new ModelRendererTurbo(this, 125, 37, textureX, textureY); // Box 203
		bodyModel[176] = new ModelRendererTurbo(this, 125, 43, textureX, textureY); // Box 204
		bodyModel[177] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 205
		bodyModel[178] = new ModelRendererTurbo(this, 62, 32, textureX, textureY); // Box 206
		bodyModel[179] = new ModelRendererTurbo(this, 61, 24, textureX, textureY); // Box 207
		bodyModel[180] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 208
		bodyModel[181] = new ModelRendererTurbo(this, 113, 32, textureX, textureY); // Box 209
		bodyModel[182] = new ModelRendererTurbo(this, 112, 24, textureX, textureY); // Box 210
		bodyModel[183] = new ModelRendererTurbo(this, 120, 30, textureX, textureY); // Box 211
		bodyModel[184] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 212
		bodyModel[185] = new ModelRendererTurbo(this, 125, 43, textureX, textureY); // Box 213
		bodyModel[186] = new ModelRendererTurbo(this, 75, 96, textureX, textureY); // Box 214
		bodyModel[187] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 215
		bodyModel[188] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 216
		bodyModel[189] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 217
		bodyModel[190] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 218
		bodyModel[191] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 219
		bodyModel[192] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 220
		bodyModel[193] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 221
		bodyModel[194] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 222
		bodyModel[195] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 223
		bodyModel[196] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 224
		bodyModel[197] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 225
		bodyModel[198] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 226
		bodyModel[199] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 227
		bodyModel[200] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 230
		bodyModel[201] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 231
		bodyModel[202] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 232
		bodyModel[203] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 233
		bodyModel[204] = new ModelRendererTurbo(this, 78, 71, textureX, textureY); // Box 234
		bodyModel[205] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 209
		bodyModel[206] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 214
		bodyModel[207] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 225
		bodyModel[208] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 226
		bodyModel[209] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 227
		bodyModel[210] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 228
		bodyModel[211] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 229
		bodyModel[212] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 230
		bodyModel[213] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 235
		bodyModel[214] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 236
		bodyModel[215] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 237
		bodyModel[216] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 238
		bodyModel[217] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 239
		bodyModel[218] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 240
		bodyModel[219] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 241
		bodyModel[220] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 242
		bodyModel[221] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 243
		bodyModel[222] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 244
		bodyModel[223] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 245
		bodyModel[224] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 246
		bodyModel[225] = new ModelRendererTurbo(this, 23, 42, textureX, textureY); // Box 81
		bodyModel[226] = new ModelRendererTurbo(this, 23, 45, textureX, textureY); // Box 248
		bodyModel[227] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 426 glow
		bodyModel[228] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp"); // Box 250 glow
		bodyModel[229] = new ModelRendererTurbo(this, 408, 102, textureX, textureY); // Box 282
		bodyModel[230] = new ModelRendererTurbo(this, 395, 99, textureX, textureY); // Box 283
		bodyModel[231] = new ModelRendererTurbo(this, 421, 100, textureX, textureY); // Box 24
		bodyModel[232] = new ModelRendererTurbo(this, 434, 98, textureX, textureY); // Box 25
		bodyModel[233] = new ModelRendererTurbo(this, 408, 115, textureX, textureY); // Box 729
		bodyModel[234] = new ModelRendererTurbo(this, 395, 112, textureX, textureY); // Box 730
		bodyModel[235] = new ModelRendererTurbo(this, 434, 111, textureX, textureY); // Box 405
		bodyModel[236] = new ModelRendererTurbo(this, 421, 113, textureX, textureY); // Box 406
		bodyModel[237] = new ModelRendererTurbo(this, 391, 119, textureX, textureY); // Box 361
		bodyModel[238] = new ModelRendererTurbo(this, 383, 125, textureX, textureY); // Box 362
		bodyModel[239] = new ModelRendererTurbo(this, 384, 119, textureX, textureY); // Box 363
		bodyModel[240] = new ModelRendererTurbo(this, 384, 122, textureX, textureY); // Box 364
		bodyModel[241] = new ModelRendererTurbo(this, 384, 116, textureX, textureY); // Box 373
		bodyModel[242] = new ModelRendererTurbo(this, 387, 116, textureX, textureY); // Box 373
		bodyModel[243] = new ModelRendererTurbo(this, 374, 115, textureX, textureY); // Box 421 prime base
		bodyModel[244] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[245] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[246] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[247] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[248] = new ModelRendererTurbo(this, 374, 123, textureX, textureY, "cull"); // Box 355 support cull
		bodyModel[249] = new ModelRendererTurbo(this, 148, 5, textureX, textureY, "cull"); // Box 275
		bodyModel[250] = new ModelRendererTurbo(this, 176, 54, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[251] = new ModelRendererTurbo(this, 157, 54, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[252] = new ModelRendererTurbo(this, 179, 52, textureX, textureY); // Box 563
		bodyModel[253] = new ModelRendererTurbo(this, 160, 52, textureX, textureY); // Box 564
		bodyModel[254] = new ModelRendererTurbo(this, 79, 70, textureX, textureY); // Box 410
		bodyModel[255] = new ModelRendererTurbo(this, 91, 66, textureX, textureY, "lamp"); // Box 411 front light R
		bodyModel[256] = new ModelRendererTurbo(this, 86, 69, textureX, textureY, "lamp"); // Box 412 front light L
		bodyModel[257] = new ModelRendererTurbo(this, 86, 69, textureX, textureY, "lamp"); // Box 257
		bodyModel[258] = new ModelRendererTurbo(this, 91, 66, textureX, textureY, "lamp"); // Box 258
		bodyModel[259] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Box 259

		bodyModel[0].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 2
		bodyModel[0].setRotationPoint(-25F, -13F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[2].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[3].setRotationPoint(-30F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 6
		bodyModel[4].setRotationPoint(24F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 10
		bodyModel[5].setRotationPoint(24F, -13F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-24F, 4F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 50, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-25F, 3F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[8].setRotationPoint(-30F, 3F, 5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-30F, 3F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[10].setRotationPoint(-25F, 3F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[11].setRotationPoint(-25F, 3F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[12].setRotationPoint(-30F, 3F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[13].setRotationPoint(-30F, 9F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[14].setRotationPoint(-30F, 7F, -7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[15].setRotationPoint(-30F, 5F, -6.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[16].setRotationPoint(-30F, 7F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[17].setRotationPoint(-30F, 3F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-30F, 3F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[19].setRotationPoint(-30F, 5F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[20].setRotationPoint(-30F, 3F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(-25F, 3F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 37
		bodyModel[22].setRotationPoint(-25F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 60, 1, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[23].setRotationPoint(-30F, -14F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 60, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[24].setRotationPoint(-30F, -14.5F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 60, 1, 8, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[25].setRotationPoint(-30F, -14.5F, 0.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 63, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[26].setRotationPoint(-31.5F, -15.5F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[27].setRotationPoint(-31.5F, -14.5F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box 216
		bodyModel[28].setRotationPoint(30.5F, -14.5F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[29].setRotationPoint(30F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 57
		bodyModel[30].setRotationPoint(30F, 3F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[31].setRotationPoint(25F, 3F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 59
		bodyModel[32].setRotationPoint(25F, 3F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[33].setRotationPoint(25F, 3F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[34].setRotationPoint(30F, 3F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[35].setRotationPoint(30F, 3F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[36].setRotationPoint(25F, 3F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[37].setRotationPoint(25F, 3F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[38].setRotationPoint(25F, 5F, 6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[39].setRotationPoint(25F, 3F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 73
		bodyModel[40].setRotationPoint(25F, 5F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 74
		bodyModel[41].setRotationPoint(25F, 7F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[42].setRotationPoint(25F, 7F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[43].setRotationPoint(25F, 9F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[44].setRotationPoint(25F, 3F, 2F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 78
		bodyModel[45].setRotationPoint(24F, -13F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 80
		bodyModel[46].setRotationPoint(24F, -12F, -2.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 81
		bodyModel[47].setRotationPoint(24F, -13F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[48].setRotationPoint(24F, -12F, 2.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[49].setRotationPoint(24F, -12F, -3.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 84
		bodyModel[50].setRotationPoint(24.5F, -13F, -3.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 85
		bodyModel[51].setRotationPoint(24.5F, -13F, 2.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 86
		bodyModel[52].setRotationPoint(24.5F, -13F, -2.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 87
		bodyModel[53].setRotationPoint(-25F, -12F, -2.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 88
		bodyModel[54].setRotationPoint(-25.5F, -13F, -2.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 89
		bodyModel[55].setRotationPoint(-25.5F, -13F, 2.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 90
		bodyModel[56].setRotationPoint(-25F, -13F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 91
		bodyModel[57].setRotationPoint(-25.5F, -13F, -3.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 92
		bodyModel[58].setRotationPoint(-25F, -13F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[59].setRotationPoint(-5.5F, -11F, -13F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[60].setRotationPoint(4.5F, -11F, -13F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		bodyModel[61].setRotationPoint(-4.5F, -11F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 159
		bodyModel[62].setRotationPoint(-4.5F, -13F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 106
		bodyModel[63].setRotationPoint(-5.5F, 3F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[64].setRotationPoint(-10F, 3.5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[65].setRotationPoint(-25F, 3.5F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[66].setRotationPoint(23F, 3.5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[67].setRotationPoint(-31.01F, 3F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[68].setRotationPoint(-31.01F, 3F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 112
		bodyModel[69].setRotationPoint(-31.01F, 3F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[70].setRotationPoint(30.01F, 3F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[71].setRotationPoint(30.01F, 3F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 115
		bodyModel[72].setRotationPoint(30.01F, 3F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 20, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[73].setRotationPoint(-10F, 3.5F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[74].setRotationPoint(-25F, 3.5F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[75].setRotationPoint(23F, 3.5F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(-18.5F, 3F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 124
		bodyModel[77].setRotationPoint(-18.5F, 3F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 129
		bodyModel[78].setRotationPoint(-5.5F, 3F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 130
		bodyModel[79].setRotationPoint(5F, -13F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 131
		bodyModel[80].setRotationPoint(-25F, -13F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 20, 16, 1, 0F); // Box 132
		bodyModel[81].setRotationPoint(5F, -13F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[82].setRotationPoint(15.5F, 3F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 556
		bodyModel[83].setRotationPoint(-20F, 3F, -9.01F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 557
		bodyModel[84].setRotationPoint(-25F, -6F, -9.01F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 558
		bodyModel[85].setRotationPoint(-25F, -2F, -9.01F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 559
		bodyModel[86].setRotationPoint(-23F, 3F, -9.01F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 139
		bodyModel[87].setRotationPoint(-20F, 3F, 9.01F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 140
		bodyModel[88].setRotationPoint(-25F, -6F, 9.01F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 141
		bodyModel[89].setRotationPoint(-25F, -2F, 9.01F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 142
		bodyModel[90].setRotationPoint(-23F, 3F, 9.01F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 194
		bodyModel[91].setRotationPoint(18F, 3F, -9.01F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 195
		bodyModel[92].setRotationPoint(24F, -6F, -9.01F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 196
		bodyModel[93].setRotationPoint(24F, -2F, -9.01F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[94].setRotationPoint(20F, 3F, -9.01F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[95].setRotationPoint(18F, 3F, 9.01F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 148
		bodyModel[96].setRotationPoint(24F, -6F, 9.01F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 149
		bodyModel[97].setRotationPoint(24F, -2F, 9.01F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[98].setRotationPoint(20F, 3F, 9.01F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[99].setRotationPoint(-30F, -13F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[100].setRotationPoint(30F, -13F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[101].setRotationPoint(3.5F, 4.5F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 174
		bodyModel[102].setRotationPoint(30.5F, -14F, 2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 cull
		bodyModel[103].setRotationPoint(29.5F, -18F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 158 cull
		bodyModel[104].setRotationPoint(28.5F, -18F, 2F);

		bodyModel[105].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 159
		bodyModel[105].setRotationPoint(-30.5F, -14F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 cull
		bodyModel[106].setRotationPoint(-30.5F, -18F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[107].setRotationPoint(-29.5F, -18F, -6F);

		bodyModel[108].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[108].setRotationPoint(-3F, 5F, -7F);
		bodyModel[108].rotateAngleX = -0.78539816F;

		bodyModel[109].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[109].setRotationPoint(0F, 5F, -7F);
		bodyModel[109].rotateAngleX = -0.78539816F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull brakecyl holder
		bodyModel[110].setRotationPoint(-3F, 3.5F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[111].setRotationPoint(-7F, 3.5F, -8.5F);

		bodyModel[112].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[112].setRotationPoint(-6F, 4.5F, -8F);
		bodyModel[112].rotateAngleY = -0.78539816F;

		bodyModel[113].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[113].setRotationPoint(-4F, 4.5F, -8F);
		bodyModel[113].rotateAngleY = -0.78539816F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F); // Box 524 chimney
		bodyModel[114].setRotationPoint(-8.5F, -17F, -6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 132 chimney
		bodyModel[115].setRotationPoint(-8.5F, -19F, -6.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133 chimney
		bodyModel[116].setRotationPoint(-8.5F, -15F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[117].setRotationPoint(-8.75F, -19.5F, -6.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 173
		bodyModel[118].setRotationPoint(-9.51F, -20F, 6.62F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.05F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.05F, 0F, 0.5F); // Box 240 chimney cull
		bodyModel[119].setRotationPoint(-9.88F, -20.26F, 6.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[120].setRotationPoint(-5.5F, -13F, -13F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, -2F, -0.5F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[121].setRotationPoint(4.5F, -13F, -13F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 147
		bodyModel[122].setRotationPoint(-5.5F, -11F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[123].setRotationPoint(4.5F, -11F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[124].setRotationPoint(-4.5F, -11F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[125].setRotationPoint(-4.5F, -13F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, -0.5F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 151
		bodyModel[126].setRotationPoint(-5.5F, -13F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 152
		bodyModel[127].setRotationPoint(4.5F, -13F, 9F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 373 get yo long ass antennae out of the caption
		bodyModel[128].setRotationPoint(12F, -20.5F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 154 cull
		bodyModel[129].setRotationPoint(-31F, -3F, 2F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[130].setRotationPoint(-29.25F, -3F, 3.5F);
		bodyModel[130].rotateAngleY = 1.57079633F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[131].setRotationPoint(-29.25F, -5F, 1.5F);
		bodyModel[131].rotateAngleY = 1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[132].setRotationPoint(-31F, -5F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[133].setRotationPoint(30F, -5F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159 cull
		bodyModel[134].setRotationPoint(30F, -3F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 160
		bodyModel[135].setRotationPoint(29.25F, -5F, -6.5F);
		bodyModel[135].rotateAngleY = 1.57079633F;

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[136].setRotationPoint(30.25F, -3F, -4.5F);
		bodyModel[136].rotateAngleY = 1.57079633F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 316
		bodyModel[137].setRotationPoint(-25.01F, -6F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 166 handrail
		bodyModel[138].setRotationPoint(-25.01F, -6F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 165
		bodyModel[139].setRotationPoint(-25.01F, -6F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 166
		bodyModel[140].setRotationPoint(25.01F, -6F, 7F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 167
		bodyModel[141].setRotationPoint(25.01F, -6F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 168
		bodyModel[142].setRotationPoint(25.01F, -6F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[143].setRotationPoint(-24.25F, -13F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[144].setRotationPoint(-23.75F, -13F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[145].setRotationPoint(-24.25F, -13F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[146].setRotationPoint(-23.75F, -13F, 9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[147].setRotationPoint(23.25F, -13F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[148].setRotationPoint(23.75F, -13F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[149].setRotationPoint(23.25F, -13F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[150].setRotationPoint(23.75F, -13F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 178 cull
		bodyModel[151].setRotationPoint(25.5F, -15.5F, 2F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 179
		bodyModel[152].setRotationPoint(-25F, -13F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[153].setRotationPoint(-25F, -12F, -3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[154].setRotationPoint(-25F, -12F, 2.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[155].setRotationPoint(-5F, -13F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[156].setRotationPoint(4F, -13F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[157].setRotationPoint(-5F, -13F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 185
		bodyModel[158].setRotationPoint(4F, -13F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[159].setRotationPoint(-4.5F, -12F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 187
		bodyModel[160].setRotationPoint(-4.5F, -12F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 6, 16, 5, 0F); // Box 188
		bodyModel[161].setRotationPoint(-11F, -13F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[162].setRotationPoint(-10F, -5F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213 cull partition
		bodyModel[163].setRotationPoint(-5.5F, -13F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191 cull partition
		bodyModel[164].setRotationPoint(4.5F, -13F, 3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192 cull parition
		bodyModel[165].setRotationPoint(4.5F, -13F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[166].setRotationPoint(-2F, -1F, 5.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[167].setRotationPoint(-2F, -5F, 5.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[168].setRotationPoint(-1F, 0F, 6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[169].setRotationPoint(-1F, 0F, -8.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[170].setRotationPoint(-2F, -1F, -9.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[171].setRotationPoint(1F, -5F, -9.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 cull vanity
		bodyModel[172].setRotationPoint(6.99F, -5F, 5.01F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[173].setRotationPoint(11F, -5F, 4.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 5, 16, 4, 0F); // Box 202
		bodyModel[174].setRotationPoint(10.5F, -13F, -8F);

		bodyModel[175].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 203
		bodyModel[175].setRotationPoint(5.5F, -4F, -8F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 204
		bodyModel[176].setRotationPoint(20F, -4F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[177].setRotationPoint(20F, -4F, 2.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[178].setRotationPoint(17F, -5F, 3.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[179].setRotationPoint(17F, -1F, 3.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[180].setRotationPoint(18F, 0F, 4.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[181].setRotationPoint(-18F, -5F, -7.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[182].setRotationPoint(-21F, -1F, -7.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[183].setRotationPoint(-20F, 0F, -6.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[184].setRotationPoint(-24F, -4F, -3.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 213
		bodyModel[185].setRotationPoint(-24F, -4F, -8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[186].setRotationPoint(-30F, 3F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[187].setRotationPoint(-30F, 3F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 216
		bodyModel[188].setRotationPoint(-30F, 5F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[189].setRotationPoint(-30F, 5F, 6.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 218
		bodyModel[190].setRotationPoint(-30F, 7F, 6.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[191].setRotationPoint(-30F, 7F, 8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[192].setRotationPoint(-30F, 9F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[193].setRotationPoint(25F, 5F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[194].setRotationPoint(25F, 3F, -5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[195].setRotationPoint(25F, 5F, -6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[196].setRotationPoint(25F, 7F, -7.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[197].setRotationPoint(25F, 7F, -8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[198].setRotationPoint(25F, 9F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 227
		bodyModel[199].setRotationPoint(15.5F, 3F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[200].setRotationPoint(-8.5F, 3.5F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[201].setRotationPoint(-2.5F, 3.5F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[202].setRotationPoint(-2.5F, 3.5F, -9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[203].setRotationPoint(7.5F, 3.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[204].setRotationPoint(1.5F, 3.5F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 209
		bodyModel[205].setRotationPoint(-25F, -16F, -8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 214
		bodyModel[206].setRotationPoint(-25F, -16F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 225
		bodyModel[207].setRotationPoint(-20F, -16F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 226
		bodyModel[208].setRotationPoint(-20F, -16F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 227
		bodyModel[209].setRotationPoint(-15F, -16F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 228
		bodyModel[210].setRotationPoint(-15F, -16F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 229
		bodyModel[211].setRotationPoint(-10F, -16F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 230
		bodyModel[212].setRotationPoint(-10F, -16F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 235
		bodyModel[213].setRotationPoint(-5F, -16F, -8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 236
		bodyModel[214].setRotationPoint(-5F, -16F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 237
		bodyModel[215].setRotationPoint(24F, -16F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 238
		bodyModel[216].setRotationPoint(14F, -16F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 239
		bodyModel[217].setRotationPoint(14F, -16F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 240
		bodyModel[218].setRotationPoint(9F, -16F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 241
		bodyModel[219].setRotationPoint(9F, -16F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 242
		bodyModel[220].setRotationPoint(4F, -16F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 243
		bodyModel[221].setRotationPoint(4F, -16F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 244
		bodyModel[222].setRotationPoint(19F, -16F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 245
		bodyModel[223].setRotationPoint(19F, -16F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 246
		bodyModel[224].setRotationPoint(24F, -16F, 0F);

		bodyModel[225].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 81
		bodyModel[225].setRotationPoint(32.5F, 4F, -0.5F);
		bodyModel[225].rotateAngleY = 1.30899694F;

		bodyModel[226].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 248
		bodyModel[226].setRotationPoint(-32.5F, 4F, 0.5F);
		bodyModel[226].rotateAngleY = -1.83259571F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 426 glow
		bodyModel[227].setRotationPoint(29.5F, -15.05F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 250 glow
		bodyModel[228].setRotationPoint(-30.5F, -15.05F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[229].setRotationPoint(-34F, 7F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[230].setRotationPoint(-34F, 7F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[231].setRotationPoint(-33F, 6F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[232].setRotationPoint(-33F, 6F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[233].setRotationPoint(33F, 7F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[234].setRotationPoint(33F, 7F, 0F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[235].setRotationPoint(32F, 6F, 0F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[236].setRotationPoint(32F, 6F, -10F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 361
		bodyModel[237].setRotationPoint(0F, -15F, -6.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[238].setRotationPoint(-2F, -16F, -5.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[239].setRotationPoint(-1F, -16F, -7.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[240].setRotationPoint(0F, -16F, -6.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[241].setRotationPoint(5.75F, -16.25F, 5F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[242].setRotationPoint(5.75F, -16.25F, -5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[243].setRotationPoint(-0.5F, -17F, 6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[244].setRotationPoint(-0.5F, -17.5F, 6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[245].setRotationPoint(-0.5F, -17.5F, 6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[246].setRotationPoint(-0.5F, -17.5F, 6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[247].setRotationPoint(-0.5F, -17.5F, 6F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 355 support cull
		bodyModel[248].setRotationPoint(-0.5F, -16F, 6F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[249].setRotationPoint(-29.5F, -15.5F, -6F);

		bodyModel[250].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[250].setRotationPoint(-20F, -16F, -7.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[251].setRotationPoint(-20F, -16F, 4.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[252].setRotationPoint(-19.5F, -17F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[253].setRotationPoint(-19.5F, -17F, 6F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 410
		bodyModel[254].setRotationPoint(-30F, -13F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 front light R
		bodyModel[255].setRotationPoint(-30.25F, -12.95F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 front light L
		bodyModel[256].setRotationPoint(-30.25F, -12.95F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 257
		bodyModel[257].setRotationPoint(29.25F, -12.95F, -2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 258
		bodyModel[258].setRotationPoint(29.25F, -12.95F, 0F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 259
		bodyModel[259].setRotationPoint(29F, -13F, -2F);
	}
	ModelCabooseTruck2 theTrucks2 = new ModelCabooseTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 14|| GetColor(entity) == 18) {
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
		}else if (GetColor(entity) == 6|| GetColor(entity) == 1845){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_left-generator3.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck3.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}else if (GetColor(entity) == 17){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_left-generator4.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck4.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck_left-generator.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.055, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/swing-motion_caboose_Truck.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(1.06, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}