//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.01.2024 - 09:20:15
// Last changed on: 06.01.2024 - 09:20:15

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelCabooseTruck2;
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

public class ModelICC_Bobber extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelICC_Bobber() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[211];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 82, 16, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 82, 16, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 163, 113, textureX, textureY); // Box 10 frame of the boose
		bodyModel[3] = new ModelRendererTurbo(this, 184, 113, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 227, 60, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 103, 121, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 187, 108, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 65, 71, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 60, 71, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 75, 100, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 65, 79, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 60, 79, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 149, 3, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 157, 33, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 159, 23, textureX, textureY); // Box 52
		bodyModel[25] = new ModelRendererTurbo(this, 160, 43, textureX, textureY, "cull"); // Box 118 cull walkway
		bodyModel[26] = new ModelRendererTurbo(this, 154, 35, textureX, textureY, "cull"); // Box 215 cull support
		bodyModel[27] = new ModelRendererTurbo(this, 156, 25, textureX, textureY, "cull"); // Box cull support
		bodyModel[28] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 56
		bodyModel[29] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 57
		bodyModel[30] = new ModelRendererTurbo(this, 28, 71, textureX, textureY); // Box 58
		bodyModel[31] = new ModelRendererTurbo(this, 23, 71, textureX, textureY); // Box 59
		bodyModel[32] = new ModelRendererTurbo(this, 75, 104, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 28, 79, textureX, textureY); // Box 69
		bodyModel[36] = new ModelRendererTurbo(this, 23, 79, textureX, textureY); // Box 70
		bodyModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 72
		bodyModel[39] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 74
		bodyModel[41] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 75
		bodyModel[42] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 76
		bodyModel[43] = new ModelRendererTurbo(this, 75, 108, textureX, textureY); // Box 77
		bodyModel[44] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 78
		bodyModel[45] = new ModelRendererTurbo(this, 125, 88, textureX, textureY); // Box 80
		bodyModel[46] = new ModelRendererTurbo(this, 133, 55, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 110, 92, textureX, textureY); // Box 82
		bodyModel[48] = new ModelRendererTurbo(this, 115, 92, textureX, textureY); // Box 83
		bodyModel[49] = new ModelRendererTurbo(this, 120, 90, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 138, 90, textureX, textureY); // Box 85
		bodyModel[51] = new ModelRendererTurbo(this, 117, 56, textureX, textureY); // Box 86
		bodyModel[52] = new ModelRendererTurbo(this, 125, 62, textureX, textureY); // Box 87
		bodyModel[53] = new ModelRendererTurbo(this, 117, 82, textureX, textureY); // Box 88
		bodyModel[54] = new ModelRendererTurbo(this, 120, 64, textureX, textureY); // Box 89
		bodyModel[55] = new ModelRendererTurbo(this, 227, 86, textureX, textureY); // Box 90
		bodyModel[56] = new ModelRendererTurbo(this, 138, 64, textureX, textureY); // Box 91
		bodyModel[57] = new ModelRendererTurbo(this, 143, 60, textureX, textureY); // Box 92
		bodyModel[58] = new ModelRendererTurbo(this, 197, 51, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 202, 51, textureX, textureY); // Box 109
		bodyModel[60] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 110
		bodyModel[61] = new ModelRendererTurbo(this, 58, 88, textureX, textureY); // Box 111
		bodyModel[62] = new ModelRendererTurbo(this, 48, 91, textureX, textureY); // Box 112
		bodyModel[63] = new ModelRendererTurbo(this, 21, 88, textureX, textureY); // Box 113
		bodyModel[64] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 11, 91, textureX, textureY); // Box 115
		bodyModel[66] = new ModelRendererTurbo(this, 197, 49, textureX, textureY); // Box 121
		bodyModel[67] = new ModelRendererTurbo(this, 202, 49, textureX, textureY); // Box 122
		bodyModel[68] = new ModelRendererTurbo(this, 44, 59, textureX, textureY); // Box 556
		bodyModel[69] = new ModelRendererTurbo(this, 38, 57, textureX, textureY); // Box 557
		bodyModel[70] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 558
		bodyModel[71] = new ModelRendererTurbo(this, 44, 57, textureX, textureY); // Box 559
		bodyModel[72] = new ModelRendererTurbo(this, 44, 54, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 38, 52, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 41, 52, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 44, 52, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 194
		bodyModel[77] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 195
		bodyModel[78] = new ModelRendererTurbo(this, 28, 57, textureX, textureY); // Box 196
		bodyModel[79] = new ModelRendererTurbo(this, 31, 57, textureX, textureY); // Box 197
		bodyModel[80] = new ModelRendererTurbo(this, 31, 54, textureX, textureY); // Box 147
		bodyModel[81] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 148
		bodyModel[82] = new ModelRendererTurbo(this, 28, 52, textureX, textureY); // Box 149
		bodyModel[83] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 150
		bodyModel[84] = new ModelRendererTurbo(this, 38, 93, textureX, textureY); // Box 151
		bodyModel[85] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 152
		bodyModel[86] = new ModelRendererTurbo(this, 70, 77, textureX, textureY); // Box 153
		bodyModel[87] = new ModelRendererTurbo(this, 1, 79, textureX, textureY); // Box 174
		bodyModel[88] = new ModelRendererTurbo(this, 1, 74, textureX, textureY, "cull"); // Box 175 cull
		bodyModel[89] = new ModelRendererTurbo(this, 12, 74, textureX, textureY, "cull"); // Box 158 cull
		bodyModel[90] = new ModelRendererTurbo(this, 38, 79, textureX, textureY); // Box 159
		bodyModel[91] = new ModelRendererTurbo(this, 38, 74, textureX, textureY, "cull"); // Box 160 cull
		bodyModel[92] = new ModelRendererTurbo(this, 49, 74, textureX, textureY, "cull"); // Box 161 cull
		bodyModel[93] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 286
		bodyModel[94] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 287
		bodyModel[95] = new ModelRendererTurbo(this, 76, 112, textureX, textureY, "cull"); // Box cull brakecyl holder
		bodyModel[96] = new ModelRendererTurbo(this, 93, 97, textureX, textureY,"cull"); // Box 484 cull
		bodyModel[97] = new ModelRendererTurbo(this, 94, 100, textureX, textureY); // Box 485
		bodyModel[98] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 167
		bodyModel[99] = new ModelRendererTurbo(this, 47, 89, textureX, textureY, "cull"); // Box 154 cull
		bodyModel[100] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 277
		bodyModel[101] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 355 brakewheel
		bodyModel[102] = new ModelRendererTurbo(this, 105, 96, textureX, textureY); // Box 157
		bodyModel[103] = new ModelRendererTurbo(this, 105, 70, textureX, textureY); // Box 158
		bodyModel[104] = new ModelRendererTurbo(this, 10, 89, textureX, textureY, "cull"); // Box 159 cull
		bodyModel[105] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 160
		bodyModel[106] = new ModelRendererTurbo(this, 8, 75, textureX, textureY); // Box 161
		bodyModel[107] = new ModelRendererTurbo(this, 47, 84, textureX, textureY); // Box 316
		bodyModel[108] = new ModelRendererTurbo(this, 38, 83, textureX, textureY); // Box 166 handrail
		bodyModel[109] = new ModelRendererTurbo(this, 47, 84, textureX, textureY); // Box 165
		bodyModel[110] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 166
		bodyModel[111] = new ModelRendererTurbo(this, 1, 83, textureX, textureY); // Box 167
		bodyModel[112] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 168
		bodyModel[113] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "marker").setLightFixtureId("front_right_marker"); // Box 410 glow marker
		bodyModel[114] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 170
		bodyModel[115] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "marker").setLightFixtureId("front_left_marker"); // Box 410 glow marker
		bodyModel[116] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 172
		bodyModel[117] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "marker").setLightFixtureId("rear_right_marker"); // Box 410 glow marker
		bodyModel[118] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 174
		bodyModel[119] = new ModelRendererTurbo(this, 155, 45, textureX, textureY, "marker").setLightFixtureId("rear_left_marker"); // Box 410 glow marker
		bodyModel[120] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 176
		bodyModel[121] = new ModelRendererTurbo(this, 148, 5, textureX, textureY, "cull"); // Box 178 cull
		bodyModel[122] = new ModelRendererTurbo(this, 133, 82, textureX, textureY); // Box 179
		bodyModel[123] = new ModelRendererTurbo(this, 110, 66, textureX, textureY); // Box 180
		bodyModel[124] = new ModelRendererTurbo(this, 115, 66, textureX, textureY); // Box 181
		bodyModel[125] = new ModelRendererTurbo(this, 75, 96, textureX, textureY); // Box 214
		bodyModel[126] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 215
		bodyModel[127] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 216
		bodyModel[128] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 217
		bodyModel[129] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 218
		bodyModel[130] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 219
		bodyModel[131] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 220
		bodyModel[132] = new ModelRendererTurbo(this, 12, 55, textureX, textureY); // Box 221
		bodyModel[133] = new ModelRendererTurbo(this, 13, 52, textureX, textureY); // Box 222
		bodyModel[134] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 223
		bodyModel[135] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 224
		bodyModel[136] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 225
		bodyModel[137] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 226
		bodyModel[138] = new ModelRendererTurbo(this, 23, 42, textureX, textureY); // Box 81
		bodyModel[139] = new ModelRendererTurbo(this, 23, 45, textureX, textureY); // Box 248
		bodyModel[140] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp").setLightFixtureId("rear_center"); // Box 426 glow
		bodyModel[141] = new ModelRendererTurbo(this, 461, 2, textureX, textureY, "lamp").setLightFixtureId("front_center"); // Box 250 glow
		bodyModel[142] = new ModelRendererTurbo(this, 148, 5, textureX, textureY); // Box cull
		bodyModel[143] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 261
		bodyModel[144] = new ModelRendererTurbo(this, 156, 64, textureX, textureY); // Box 262
		bodyModel[145] = new ModelRendererTurbo(this, 371, 36, textureX, textureY); // Import Box106
		bodyModel[146] = new ModelRendererTurbo(this, 344, 38, textureX, textureY); // Import Box106
		bodyModel[147] = new ModelRendererTurbo(this, 319, 11, textureX, textureY); // Import Box40
		bodyModel[148] = new ModelRendererTurbo(this, 323, 44, textureX, textureY); // Import Box40
		bodyModel[149] = new ModelRendererTurbo(this, 302, 44, textureX, textureY); // Import Box40
		bodyModel[150] = new ModelRendererTurbo(this, 342, 4, textureX, textureY); // Import Box40
		bodyModel[151] = new ModelRendererTurbo(this, 295, 79, textureX, textureY); // Box 393
		bodyModel[152] = new ModelRendererTurbo(this, 295, 68, textureX, textureY); // Box 395
		bodyModel[153] = new ModelRendererTurbo(this, 278, 68, textureX, textureY); // Box 396
		bodyModel[154] = new ModelRendererTurbo(this, 278, 79, textureX, textureY); // Box 273
		bodyModel[155] = new ModelRendererTurbo(this, 276, 7, textureX, textureY); // Box 274
		bodyModel[156] = new ModelRendererTurbo(this, 263, 31, textureX, textureY); // Box 275
		bodyModel[157] = new ModelRendererTurbo(this, 263, 43, textureX, textureY); // Box 276
		bodyModel[158] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 123
		bodyModel[159] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 124
		bodyModel[160] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 163
		bodyModel[161] = new ModelRendererTurbo(this, 75, 118, textureX, textureY); // Box 164
		bodyModel[162] = new ModelRendererTurbo(this, 80, 71, textureX, textureY); // Box 231
		bodyModel[163] = new ModelRendererTurbo(this, 80, 71, textureX, textureY); // Box 234
		bodyModel[164] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 225
		bodyModel[165] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 226
		bodyModel[166] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 227
		bodyModel[167] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 228
		bodyModel[168] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 175
		bodyModel[169] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 176
		bodyModel[170] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 177
		bodyModel[171] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 178
		bodyModel[172] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 179
		bodyModel[173] = new ModelRendererTurbo(this, 12, 40, textureX, textureY); // Box 180
		bodyModel[174] = new ModelRendererTurbo(this, 275, 11, textureX, textureY, "cull"); // Box 181 cull handrail
		bodyModel[175] = new ModelRendererTurbo(this, 275, 16, textureX, textureY, "cull"); // Box 182 cull handrail
		bodyModel[176] = new ModelRendererTurbo(this, 218, 3, textureX, textureY); // Box 179
		bodyModel[177] = new ModelRendererTurbo(this, 208, 33, textureX, textureY); // Box 180
		bodyModel[178] = new ModelRendererTurbo(this, 241, 86, textureX, textureY, "cull"); // Box cull interior room
		bodyModel[179] = new ModelRendererTurbo(this, 301, 90, textureX, textureY); // Box 183
		bodyModel[180] = new ModelRendererTurbo(this, 272, 90, textureX, textureY); // Box 184
		bodyModel[181] = new ModelRendererTurbo(this, 124, 6, textureX, textureY); // Box 173
		bodyModel[182] = new ModelRendererTurbo(this, 135, 10, textureX, textureY, "cull"); // Box 240 chimney cull
		bodyModel[183] = new ModelRendererTurbo(this, 129, 23, textureX, textureY); // Import Box106
		bodyModel[184] = new ModelRendererTurbo(this, 137, 6, textureX, textureY, "cull"); // Box 188 cull support
		bodyModel[185] = new ModelRendererTurbo(this, 241, 76, textureX, textureY); // Box 189
		bodyModel[186] = new ModelRendererTurbo(this, 125, 43, textureX, textureY); // Box 204
		bodyModel[187] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 205
		bodyModel[188] = new ModelRendererTurbo(this, 62, 32, textureX, textureY); // Box 206
		bodyModel[189] = new ModelRendererTurbo(this, 61, 24, textureX, textureY); // Box 207
		bodyModel[190] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 208
		bodyModel[191] = new ModelRendererTurbo(this, 205, 43, textureX, textureY, "cull"); // Box 195 cull walkway
		bodyModel[192] = new ModelRendererTurbo(this, 208, 23, textureX, textureY); // Box 196
		bodyModel[193] = new ModelRendererTurbo(this, 78, 24, textureX, textureY); // Box 238
		bodyModel[194] = new ModelRendererTurbo(this, 79, 32, textureX, textureY); // Box 239
		bodyModel[195] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 242
		bodyModel[196] = new ModelRendererTurbo(this, 96, 32, textureX, textureY); // Box 243
		bodyModel[197] = new ModelRendererTurbo(this, 95, 9, textureX, textureY, "cull"); // Box 201 cull interiorhandrailing
		bodyModel[198] = new ModelRendererTurbo(this, 374, 115, textureX, textureY); // Box 421 prime base
		bodyModel[199] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime1).setLightFixtureId("prime_1"); // Box 6 PRIME4-1
		bodyModel[200] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime3).setLightFixtureId("prime_3"); // Box 7 PRIME4-3
		bodyModel[201] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime2).setLightFixtureId("prime_2"); // Box 8 PRIME4-2
		bodyModel[202] = new ModelRendererTurbo(this, 374, 119, textureX, textureY, BoxName.prime4).setLightFixtureId("prime_4"); // Box 9 PRIME4-4
		bodyModel[203] = new ModelRendererTurbo(this, 391, 119, textureX, textureY); // Box 361
		bodyModel[204] = new ModelRendererTurbo(this, 383, 125, textureX, textureY); // Box 362
		bodyModel[205] = new ModelRendererTurbo(this, 384, 119, textureX, textureY); // Box 363
		bodyModel[206] = new ModelRendererTurbo(this, 384, 122, textureX, textureY); // Box 364
		bodyModel[207] = new ModelRendererTurbo(this, 176, 54, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[208] = new ModelRendererTurbo(this, 157, 54, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[209] = new ModelRendererTurbo(this, 179, 52, textureX, textureY); // Box 563
		bodyModel[210] = new ModelRendererTurbo(this, 160, 52, textureX, textureY); // Box 564

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-25.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(22.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 10 frame of the boose
		bodyModel[2].setRotationPoint(-22F, 3F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 6
		bodyModel[3].setRotationPoint(16F, 3F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 10
		bodyModel[4].setRotationPoint(16F, -13F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-16F, 4F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 34, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		bodyModel[6].setRotationPoint(-17F, 3F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[7].setRotationPoint(-22F, 3F, 5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[8].setRotationPoint(-22F, 3F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-17F, 3F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[10].setRotationPoint(-17F, 3F, 5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[11].setRotationPoint(-22F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-22F, 9F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(-22F, 7F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(-22F, 5F, -6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(-22F, 7F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(-22F, 3F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(-22F, 3F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(-22F, 5F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(-22F, 3F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(-17F, 3F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 37
		bodyModel[21].setRotationPoint(-17F, 3F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[22].setRotationPoint(-22F, -14F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[23].setRotationPoint(-22F, -14.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[24].setRotationPoint(-22F, -14.5F, 0.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 118 cull walkway
		bodyModel[25].setRotationPoint(-23.5F, -15.5F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F); // Box 215 cull support
		bodyModel[26].setRotationPoint(-23.5F, -14.5F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F); // Box cull support
		bodyModel[27].setRotationPoint(22.5F, -14.5F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[28].setRotationPoint(22F, 3F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 57
		bodyModel[29].setRotationPoint(22F, 3F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[30].setRotationPoint(17F, 3F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 59
		bodyModel[31].setRotationPoint(17F, 3F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[32].setRotationPoint(17F, 3F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[33].setRotationPoint(22F, 3F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[34].setRotationPoint(22F, 3F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[35].setRotationPoint(17F, 3F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[36].setRotationPoint(17F, 3F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[37].setRotationPoint(17F, 5F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[38].setRotationPoint(17F, 3F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 73
		bodyModel[39].setRotationPoint(17F, 5F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 74
		bodyModel[40].setRotationPoint(17F, 7F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[41].setRotationPoint(17F, 7F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[42].setRotationPoint(17F, 9F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[43].setRotationPoint(17F, 3F, 2F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 78
		bodyModel[44].setRotationPoint(16F, -13F, 3F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 80
		bodyModel[45].setRotationPoint(16F, -12F, -2.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 81
		bodyModel[46].setRotationPoint(16F, -13F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[47].setRotationPoint(16F, -12F, 2.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[48].setRotationPoint(16F, -12F, -3.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 84
		bodyModel[49].setRotationPoint(16.5F, -13F, -3.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 85
		bodyModel[50].setRotationPoint(16.5F, -13F, 2.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 86
		bodyModel[51].setRotationPoint(16.5F, -13F, -2.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 87
		bodyModel[52].setRotationPoint(-17F, -12F, -2.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 88
		bodyModel[53].setRotationPoint(-17.5F, -13F, -2.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 89
		bodyModel[54].setRotationPoint(-17.5F, -13F, 2.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 90
		bodyModel[55].setRotationPoint(-17F, -13F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 91
		bodyModel[56].setRotationPoint(-17.5F, -13F, -3.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 92
		bodyModel[57].setRotationPoint(-17F, -13F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[58].setRotationPoint(-17F, 3.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[59].setRotationPoint(15F, 3.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[60].setRotationPoint(-23.01F, 3F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[61].setRotationPoint(-23.01F, 3F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 112
		bodyModel[62].setRotationPoint(-23.01F, 3F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[63].setRotationPoint(22.01F, 3F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[64].setRotationPoint(22.01F, 3F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 115
		bodyModel[65].setRotationPoint(22.01F, 3F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[66].setRotationPoint(-17F, 3.5F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[67].setRotationPoint(15F, 3.5F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 556
		bodyModel[68].setRotationPoint(-12F, 3F, -9.01F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 557
		bodyModel[69].setRotationPoint(-17F, -6F, -9.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 558
		bodyModel[70].setRotationPoint(-17F, -2F, -9.01F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 559
		bodyModel[71].setRotationPoint(-15F, 3F, -9.01F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 139
		bodyModel[72].setRotationPoint(-12F, 3F, 9.01F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 140
		bodyModel[73].setRotationPoint(-17F, -6F, 9.01F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F); // Box 141
		bodyModel[74].setRotationPoint(-17F, -2F, 9.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F); // Box 142
		bodyModel[75].setRotationPoint(-15F, 3F, 9.01F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 194
		bodyModel[76].setRotationPoint(10F, 3F, -9.01F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 195
		bodyModel[77].setRotationPoint(16F, -6F, -9.01F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 196
		bodyModel[78].setRotationPoint(16F, -2F, -9.01F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[79].setRotationPoint(12F, 3F, -9.01F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[80].setRotationPoint(10F, 3F, 9.01F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 148
		bodyModel[81].setRotationPoint(16F, -6F, 9.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1F, 0.5F, 0F); // Box 149
		bodyModel[82].setRotationPoint(16F, -2F, 9.01F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[83].setRotationPoint(12F, 3F, 9.01F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[84].setRotationPoint(-22F, -13F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 16, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[85].setRotationPoint(22F, -13F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[86].setRotationPoint(-3F, 3.5F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 174
		bodyModel[87].setRotationPoint(22.5F, -14F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 cull
		bodyModel[88].setRotationPoint(21.5F, -18F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 158 cull
		bodyModel[89].setRotationPoint(20.5F, -18F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 17, 4, 0F); // Box 159
		bodyModel[90].setRotationPoint(-22.5F, -14F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160 cull
		bodyModel[91].setRotationPoint(-22.5F, -18F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[92].setRotationPoint(-21.5F, -18F, -6F);

		bodyModel[93].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[93].setRotationPoint(-3F, 5F, 4F);
		bodyModel[93].rotateAngleX = -0.78539816F;

		bodyModel[94].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[94].setRotationPoint(0F, 5F, 4F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull brakecyl holder
		bodyModel[95].setRotationPoint(-3F, 3.5F, 2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484 cull
		bodyModel[96].setRotationPoint(-4F, 3.5F, 7.5F);

		bodyModel[97].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[97].setRotationPoint(-3F, 4.5F, 8F);
		bodyModel[97].rotateAngleY = -0.78539816F;

		bodyModel[98].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[98].setRotationPoint(-1F, 4.5F, 8F);
		bodyModel[98].rotateAngleY = -0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 154 cull
		bodyModel[99].setRotationPoint(-23F, -3F, 2F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[100].setRotationPoint(-21.25F, -3F, 3.5F);
		bodyModel[100].rotateAngleY = 1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[101].setRotationPoint(-21.25F, -5F, 1.5F);
		bodyModel[101].rotateAngleY = 1.57079633F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[102].setRotationPoint(-23F, -5F, 4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[103].setRotationPoint(22F, -5F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159 cull
		bodyModel[104].setRotationPoint(22F, -3F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 160
		bodyModel[105].setRotationPoint(21.25F, -5F, -6.5F);
		bodyModel[105].rotateAngleY = 1.57079633F;

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[106].setRotationPoint(22.25F, -3F, -4.5F);
		bodyModel[106].rotateAngleY = 1.57079633F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 316
		bodyModel[107].setRotationPoint(-17.01F, -6F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 166 handrail
		bodyModel[108].setRotationPoint(-17.01F, -6F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 165
		bodyModel[109].setRotationPoint(-17.01F, -6F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 166
		bodyModel[110].setRotationPoint(17.01F, -6F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 167
		bodyModel[111].setRotationPoint(17.01F, -6F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 168
		bodyModel[112].setRotationPoint(17.01F, -6F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[113].setRotationPoint(-17.25F, -13F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[114].setRotationPoint(-16.75F, -13F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[115].setRotationPoint(-17.25F, -13F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[116].setRotationPoint(-16.75F, -13F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[117].setRotationPoint(16.25F, -13F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[118].setRotationPoint(16.75F, -13F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[119].setRotationPoint(16.25F, -13F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[120].setRotationPoint(16.75F, -13F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 178 cull
		bodyModel[121].setRotationPoint(17.5F, -15.5F, 2F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 179
		bodyModel[122].setRotationPoint(-17F, -13F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[123].setRotationPoint(-17F, -12F, -3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		bodyModel[124].setRotationPoint(-17F, -12F, 2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[125].setRotationPoint(-22F, 3F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[126].setRotationPoint(-22F, 3F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 216
		bodyModel[127].setRotationPoint(-22F, 5F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[128].setRotationPoint(-22F, 5F, 6.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 218
		bodyModel[129].setRotationPoint(-22F, 7F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[130].setRotationPoint(-22F, 7F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[131].setRotationPoint(-22F, 9F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[132].setRotationPoint(17F, 5F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[133].setRotationPoint(17F, 3F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[134].setRotationPoint(17F, 5F, -6.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[135].setRotationPoint(17F, 7F, -7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[136].setRotationPoint(17F, 7F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[137].setRotationPoint(17F, 9F, -9F);

		bodyModel[138].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 81
		bodyModel[138].setRotationPoint(24.5F, 4F, -0.5F);
		bodyModel[138].rotateAngleY = 1.30899694F;

		bodyModel[139].addBox(-8F, -0.5F, 0F, 8, 2, 0, 0F); // Box 248
		bodyModel[139].setRotationPoint(-24.5F, 4F, 0.5F);
		bodyModel[139].rotateAngleY = -1.83259571F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 426 glow
		bodyModel[140].setRotationPoint(21.5F, -15.05F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 250 glow
		bodyModel[141].setRotationPoint(-22.5F, -15.05F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[142].setRotationPoint(-21.5F, -15.5F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 34, 16, 1, 0F); // Box 261
		bodyModel[143].setRotationPoint(-17F, -13F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 34, 16, 1, 0F); // Box 262
		bodyModel[144].setRotationPoint(-17F, -13F, 8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[145].setRotationPoint(-6F, -10F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[146].setRotationPoint(-6F, -10F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[147].setRotationPoint(-6F, -19F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[148].setRotationPoint(-6F, -19F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[149].setRotationPoint(-6F, -19F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[150].setRotationPoint(2F, -19F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[151].setRotationPoint(-6F, -13F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[152].setRotationPoint(2F, -13F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[153].setRotationPoint(2F, -13F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[154].setRotationPoint(-6F, -13F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 9, 1, 22, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[155].setRotationPoint(-6F, -20F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 275
		bodyModel[156].setRotationPoint(-6F, -20.5F, -10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[157].setRotationPoint(-6F, -20.5F, 0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[158].setRotationPoint(-12.5F, 3F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 124
		bodyModel[159].setRotationPoint(-12.5F, 3F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[160].setRotationPoint(9.5F, 3F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 164
		bodyModel[161].setRotationPoint(9.5F, 3F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[162].setRotationPoint(-4.5F, 3.5F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[163].setRotationPoint(4.5F, 3.5F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 225
		bodyModel[164].setRotationPoint(-17F, -16F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 226
		bodyModel[165].setRotationPoint(-17F, -16F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 227
		bodyModel[166].setRotationPoint(-11F, -16F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 228
		bodyModel[167].setRotationPoint(-11F, -16F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 175
		bodyModel[168].setRotationPoint(16F, -16F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 176
		bodyModel[169].setRotationPoint(16F, -16F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 177
		bodyModel[170].setRotationPoint(10F, -16F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 178
		bodyModel[171].setRotationPoint(10F, -16F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F); // Box 179
		bodyModel[172].setRotationPoint(4F, -16F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 180
		bodyModel[173].setRotationPoint(4F, -16F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181 cull handrail
		bodyModel[174].setRotationPoint(-5.5F, -20.5F, 7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 182 cull handrail
		bodyModel[175].setRotationPoint(-5.5F, -20.5F, -10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 19, 1, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[176].setRotationPoint(3F, -14F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
		bodyModel[177].setRotationPoint(3F, -14.5F, -8.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull interior room
		bodyModel[178].setRotationPoint(-16F, -13F, -8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 9, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[179].setRotationPoint(-6F, -9F, -8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 9, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[180].setRotationPoint(-6F, -9F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 173
		bodyModel[181].setRotationPoint(4.5F, -23F, 5.62F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240 chimney cull
		bodyModel[182].setRotationPoint(3.87F, -23.26F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[183].setRotationPoint(3.5F, -5F, 3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 188 cull support
		bodyModel[184].setRotationPoint(3.25F, -20F, 5.62F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[185].setRotationPoint(3F, -1F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 204
		bodyModel[186].setRotationPoint(12F, -4F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 205
		bodyModel[187].setRotationPoint(12F, -4F, 2.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[188].setRotationPoint(9F, -5F, 3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[189].setRotationPoint(9F, -1F, 3.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[190].setRotationPoint(10F, 0F, 4.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 195 cull walkway
		bodyModel[191].setRotationPoint(2.5F, -15.5F, -2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[192].setRotationPoint(3F, -14.5F, 0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[193].setRotationPoint(-4.5F, -12F, 5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[194].setRotationPoint(-4.5F, -16F, 5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[195].setRotationPoint(-2.5F, -12F, -9.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[196].setRotationPoint(0.5F, -16F, -9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 cull interiorhandrailing
		bodyModel[197].setRotationPoint(-5F, -16F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[198].setRotationPoint(-2.5F, -21.75F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[199].setRotationPoint(-2.5F, -22.25F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[200].setRotationPoint(-2.5F, -22.25F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[201].setRotationPoint(-2.5F, -22.25F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[202].setRotationPoint(-2.5F, -22.25F, -1F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 361
		bodyModel[203].setRotationPoint(-12F, -31F, 6.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 362
		bodyModel[204].setRotationPoint(-14F, -32F, 7.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 363
		bodyModel[205].setRotationPoint(-13F, -32F, 5.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 364
		bodyModel[206].setRotationPoint(-12F, -32F, 6.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[207].setRotationPoint(7F, -32F, -7.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[208].setRotationPoint(7F, -32F, 4.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[209].setRotationPoint(7.5F, -33F, -6F);

		bodyModel[210].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[210].setRotationPoint(7.5F, -33F, 6F);
	}

	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.625, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(0.625, 0, 0);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
	}
}
