//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RSFDL
// Model Creator: bida
// Created on: 23.03.2024 - 08:30:06
// Last changed on: 23.03.2024 - 08:30:06

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
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

import java.util.ArrayList;

public class ModelRSFDL extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRSFDL() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[251];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 275, 90, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 11, 3, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 236, 101, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 273, 115, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 142, 155, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 142, 149, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 142, 142, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 143, 136, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 259, 73, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 275, 66, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 404, 112, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 263, 97, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 74, 101, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 279, 110, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 388, 123, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 421, 27, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 393, 27, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 402, 12, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 413, 25, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 293, 32, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 111, 115, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 298, 13, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 306, 27, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 306, 6, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 101, 41, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 101, 5, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 130
		bodyModel[33] = new ModelRendererTurbo(this, 27, 17, textureX, textureY); // Box 135
		bodyModel[34] = new ModelRendererTurbo(this, 29, 26, textureX, textureY); // Box 57
		bodyModel[35] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 58
		bodyModel[36] = new ModelRendererTurbo(this, 32, 38, textureX, textureY); // Box 59
		bodyModel[37] = new ModelRendererTurbo(this, 122, 53, textureX, textureY); // Box 315 door swing right
		bodyModel[38] = new ModelRendererTurbo(this, 87, 75, textureX, textureY); // Box 61
		bodyModel[39] = new ModelRendererTurbo(this, 257, 69, textureX, textureY); // Box 62
		bodyModel[40] = new ModelRendererTurbo(this, 80, 39, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 120, 17, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 265, 133, textureX, textureY); // Box 81
		bodyModel[44] = new ModelRendererTurbo(this, 243, 133, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 112, 133, textureX, textureY); // Box 89
		bodyModel[47] = new ModelRendererTurbo(this, 359, 110, textureX, textureY); // Box 92
		bodyModel[48] = new ModelRendererTurbo(this, 282, 110, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 284, 10, textureX, textureY); // Box 94
		bodyModel[50] = new ModelRendererTurbo(this, 283, 34, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 419, 25, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 399, 25, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 157, 112, textureX, textureY); // Box 102
		bodyModel[55] = new ModelRendererTurbo(this, 158, 104, textureX, textureY); // Box 105
		bodyModel[56] = new ModelRendererTurbo(this, 151, 121, textureX, textureY); // Box 107
		bodyModel[57] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 230, 129, textureX, textureY); // Box 111
		bodyModel[59] = new ModelRendererTurbo(this, 259, 108, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 259, 106, textureX, textureY); // Box 120
		bodyModel[62] = new ModelRendererTurbo(this, 249, 106, textureX, textureY); // Box 121
		bodyModel[63] = new ModelRendererTurbo(this, 97, 106, textureX, textureY); // Box 130
		bodyModel[64] = new ModelRendererTurbo(this, 84, 102, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 97, 108, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 87, 106, textureX, textureY); // Box 134
		bodyModel[67] = new ModelRendererTurbo(this, 87, 108, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 144, 152, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 166, 10, textureX, textureY, "lamp"); // Box 399 commander beacon
		bodyModel[72] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 400
		bodyModel[73] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 216
		bodyModel[74] = new ModelRendererTurbo(this, 22, 36, textureX, textureY); // Box 217
		bodyModel[75] = new ModelRendererTurbo(this, 272, 23, textureX, textureY); // Box 221
		bodyModel[76] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 227
		bodyModel[77] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 228
		bodyModel[78] = new ModelRendererTurbo(this, 158, 149, textureX, textureY); // Box 229
		bodyModel[79] = new ModelRendererTurbo(this, 160, 145, textureX, textureY); // Box 230
		bodyModel[80] = new ModelRendererTurbo(this, 158, 142, textureX, textureY); // Box 231
		bodyModel[81] = new ModelRendererTurbo(this, 159, 136, textureX, textureY); // Box 232
		bodyModel[82] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 233
		bodyModel[83] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 236
		bodyModel[84] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 237
		bodyModel[85] = new ModelRendererTurbo(this, 158, 149, textureX, textureY); // Box 238
		bodyModel[86] = new ModelRendererTurbo(this, 160, 145, textureX, textureY); // Box 239
		bodyModel[87] = new ModelRendererTurbo(this, 158, 142, textureX, textureY); // Box 240
		bodyModel[88] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 241
		bodyModel[89] = new ModelRendererTurbo(this, 159, 136, textureX, textureY); // Box 242
		bodyModel[90] = new ModelRendererTurbo(this, 142, 155, textureX, textureY); // Box 243
		bodyModel[91] = new ModelRendererTurbo(this, 144, 152, textureX, textureY); // Box 244
		bodyModel[92] = new ModelRendererTurbo(this, 142, 149, textureX, textureY); // Box 245
		bodyModel[93] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 246
		bodyModel[94] = new ModelRendererTurbo(this, 142, 142, textureX, textureY); // Box 247
		bodyModel[95] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 248
		bodyModel[96] = new ModelRendererTurbo(this, 143, 136, textureX, textureY); // Box 249
		bodyModel[97] = new ModelRendererTurbo(this, 244, 106, textureX, textureY); // Box 250
		bodyModel[98] = new ModelRendererTurbo(this, 82, 106, textureX, textureY); // Box 251
		bodyModel[99] = new ModelRendererTurbo(this, 387, 127, textureX, textureY); // Box 221
		bodyModel[100] = new ModelRendererTurbo(this, 288, 127, textureX, textureY); // Box 222
		bodyModel[101] = new ModelRendererTurbo(this, 128, 112, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 128, 121, textureX, textureY); // Box 107
		bodyModel[103] = new ModelRendererTurbo(this, 125, 105, textureX, textureY); // Box 108
		bodyModel[104] = new ModelRendererTurbo(this, 125, 120, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 56, 3, textureX, textureY); // Box 129
		bodyModel[106] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 130
		bodyModel[107] = new ModelRendererTurbo(this, 54, 9, textureX, textureY); // Box 132
		bodyModel[108] = new ModelRendererTurbo(this, 52, 16, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 54, 25, textureX, textureY); // Box 57
		bodyModel[110] = new ModelRendererTurbo(this, 55, 32, textureX, textureY); // Box 58
		bodyModel[111] = new ModelRendererTurbo(this, 58, 39, textureX, textureY); // Box 59
		bodyModel[112] = new ModelRendererTurbo(this, 91, 144, textureX, textureY); // Box 136
		bodyModel[113] = new ModelRendererTurbo(this, 97, 144, textureX, textureY); // Box 136
		bodyModel[114] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 136
		bodyModel[115] = new ModelRendererTurbo(this, 252, 138, textureX, textureY); // Box 136
		bodyModel[116] = new ModelRendererTurbo(this, 258, 64, textureX, textureY); // Box 62
		bodyModel[117] = new ModelRendererTurbo(this, 246, 102, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 161, 106, textureX, textureY); // Box 105
		bodyModel[119] = new ModelRendererTurbo(this, 161, 109, textureX, textureY); // Box 105
		bodyModel[120] = new ModelRendererTurbo(this, 262, 154, textureX, textureY); // Box 18
		bodyModel[121] = new ModelRendererTurbo(this, 278, 139, textureX, textureY, "cull"); // Underframe support cull
		bodyModel[122] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[123] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[124] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[125] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[126] = new ModelRendererTurbo(this, 235, 5, textureX, textureY); // Box 221
		bodyModel[127] = new ModelRendererTurbo(this, 29, 10, textureX, textureY); // Box 57
		bodyModel[128] = new ModelRendererTurbo(this, 30, 4, textureX, textureY); // Box 58
		bodyModel[129] = new ModelRendererTurbo(this, 89, 15, textureX, textureY); // Box 64
		bodyModel[130] = new ModelRendererTurbo(this, 89, 51, textureX, textureY); // Box 64
		bodyModel[131] = new ModelRendererTurbo(this, 80, 15, textureX, textureY); // Box 64
		bodyModel[132] = new ModelRendererTurbo(this, 80, 51, textureX, textureY); // Box 64
		bodyModel[133] = new ModelRendererTurbo(this, 87, 45, textureX, textureY); // Box 64
		bodyModel[134] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 64
		bodyModel[135] = new ModelRendererTurbo(this, 76, 9, textureX, textureY); // Box 64
		bodyModel[136] = new ModelRendererTurbo(this, 76, 45, textureX, textureY); // Box 64
		bodyModel[137] = new ModelRendererTurbo(this, 97, 149, textureX, textureY); // Box 132
		bodyModel[138] = new ModelRendererTurbo(this, 75, 149, textureX, textureY); // Box 133
		bodyModel[139] = new ModelRendererTurbo(this, 216, 145, textureX, textureY); // Box 307
		bodyModel[140] = new ModelRendererTurbo(this, 238, 145, textureX, textureY); // Box 308
		bodyModel[141] = new ModelRendererTurbo(this, 73, 186, textureX, textureY); // Box 4
		bodyModel[142] = new ModelRendererTurbo(this, 73, 198, textureX, textureY); // Box 4
		bodyModel[143] = new ModelRendererTurbo(this, 110, 178, textureX, textureY); // Box 446
		bodyModel[144] = new ModelRendererTurbo(this, 97, 186, textureX, textureY); // Box 4
		bodyModel[145] = new ModelRendererTurbo(this, 97, 198, textureX, textureY); // Box 4
		bodyModel[146] = new ModelRendererTurbo(this, 64, 178, textureX, textureY); // Box 446
		bodyModel[147] = new ModelRendererTurbo(this, 98, 176, textureX, textureY); // Box 448
		bodyModel[148] = new ModelRendererTurbo(this, 76, 176, textureX, textureY); // Box 448
		bodyModel[149] = new ModelRendererTurbo(this, 214, 182, textureX, textureY); // Box 4
		bodyModel[150] = new ModelRendererTurbo(this, 214, 194, textureX, textureY); // Box 4
		bodyModel[151] = new ModelRendererTurbo(this, 251, 174, textureX, textureY); // Box 446
		bodyModel[152] = new ModelRendererTurbo(this, 238, 182, textureX, textureY); // Box 4
		bodyModel[153] = new ModelRendererTurbo(this, 238, 194, textureX, textureY); // Box 4
		bodyModel[154] = new ModelRendererTurbo(this, 205, 174, textureX, textureY); // Box 446
		bodyModel[155] = new ModelRendererTurbo(this, 239, 172, textureX, textureY); // Box 448
		bodyModel[156] = new ModelRendererTurbo(this, 217, 172, textureX, textureY); // Box 448
		bodyModel[157] = new ModelRendererTurbo(this, 251, 184, textureX, textureY); // Box 24
		bodyModel[158] = new ModelRendererTurbo(this, 201, 184, textureX, textureY); // Box 25
		bodyModel[159] = new ModelRendererTurbo(this, 110, 188, textureX, textureY); // Box 24
		bodyModel[160] = new ModelRendererTurbo(this, 60, 188, textureX, textureY); // Box 25
		bodyModel[161] = new ModelRendererTurbo(this, 176, 13, textureX, textureY); // Box 364 prime base
		bodyModel[162] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[163] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[164] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[165] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[166] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[167] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[168] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[169] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[170] = new ModelRendererTurbo(this, 184, 17, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[171] = new ModelRendererTurbo(this, 186, 13, textureX, textureY); // Box 428
		bodyModel[172] = new ModelRendererTurbo(this, 192, 19, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[173] = new ModelRendererTurbo(this, 199, 17, textureX, textureY); // Box 308
		bodyModel[174] = new ModelRendererTurbo(this, 234, 38, textureX, textureY); // Box 18
		bodyModel[175] = new ModelRendererTurbo(this, 228, 51, textureX, textureY); // Box 21
		bodyModel[176] = new ModelRendererTurbo(this, 234, 26, textureX, textureY); // Box 344
		bodyModel[177] = new ModelRendererTurbo(this, 316, 179, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 365, 168, textureX, textureY); // Box 10
		bodyModel[179] = new ModelRendererTurbo(this, 356, 169, textureX, textureY); // Box 157
		bodyModel[180] = new ModelRendererTurbo(this, 356, 177, textureX, textureY); // Box 158
		bodyModel[181] = new ModelRendererTurbo(this, 349, 171, textureX, textureY); // Box 382
		bodyModel[182] = new ModelRendererTurbo(this, 349, 171, textureX, textureY); // Box 383
		bodyModel[183] = new ModelRendererTurbo(this, 37, 51, textureX, textureY); // Box 74
		bodyModel[184] = new ModelRendererTurbo(this, 22, 48, textureX, textureY); // Box 75
		bodyModel[185] = new ModelRendererTurbo(this, 48, 48, textureX, textureY); // Box 76
		bodyModel[186] = new ModelRendererTurbo(this, 36, 42, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[187] = new ModelRendererTurbo(this, 36, 42, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[188] = new ModelRendererTurbo(this, 44, 42, textureX, textureY, "lamp"); // Box 186 Headlight Rear
		bodyModel[189] = new ModelRendererTurbo(this, 44, 42, textureX, textureY, "lamp"); // Box 187 Headlight Rear
		bodyModel[190] = new ModelRendererTurbo(this, 247, 24, textureX, textureY); // Box 341
		bodyModel[191] = new ModelRendererTurbo(this, 247, 24, textureX, textureY); // Box 342
		bodyModel[192] = new ModelRendererTurbo(this, 243, 32, textureX, textureY); // Box 342
		bodyModel[193] = new ModelRendererTurbo(this, 159, 170, textureX, textureY); // Box 277
		bodyModel[194] = new ModelRendererTurbo(this, 148, 167, textureX, textureY); // Box 355 brakewheel
		bodyModel[195] = new ModelRendererTurbo(this, 161, 187, textureX, textureY); // Box 53
		bodyModel[196] = new ModelRendererTurbo(this, 174, 190, textureX, textureY); // Box 54
		bodyModel[197] = new ModelRendererTurbo(this, 192, 165, textureX, textureY, "lamp"); // Box 71 markerlight cull
		bodyModel[198] = new ModelRendererTurbo(this, 181, 187, textureX, textureY); // Box 235
		bodyModel[199] = new ModelRendererTurbo(this, 192, 165, textureX, textureY, "lamp"); // Box 124 markerlight cull
		bodyModel[200] = new ModelRendererTurbo(this, 157, 148, textureX, textureY); // Box 125
		bodyModel[201] = new ModelRendererTurbo(this, 194, 197, textureX, textureY); // Box 338
		bodyModel[202] = new ModelRendererTurbo(this, 207, 197, textureX, textureY); // Box 340
		bodyModel[203] = new ModelRendererTurbo(this, 194, 195, textureX, textureY); // Box 344
		bodyModel[204] = new ModelRendererTurbo(this, 191, 170, textureX, textureY); // Box 143
		bodyModel[205] = new ModelRendererTurbo(this, 152, 162, textureX, textureY); // Box 55
		bodyModel[206] = new ModelRendererTurbo(this, 250, 77, textureX, textureY); // Box 372
		bodyModel[207] = new ModelRendererTurbo(this, 139, 121, textureX, textureY); // Box 373
		bodyModel[208] = new ModelRendererTurbo(this, 128, 130, textureX, textureY); // Box 374
		bodyModel[209] = new ModelRendererTurbo(this, 155, 18, textureX, textureY); // Box 184 o2 generator
		bodyModel[210] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[211] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[212] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[213] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[214] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[215] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull sp beacon holder
		bodyModel[216] = new ModelRendererTurbo(this, 209, 6, textureX, textureY); // Box 293
		bodyModel[217] = new ModelRendererTurbo(this, 198, 9, textureX, textureY); // Box 294
		bodyModel[218] = new ModelRendererTurbo(this, 198, 6, textureX, textureY); // Box 295
		bodyModel[219] = new ModelRendererTurbo(this, 198, 3, textureX, textureY); // Box 296
		bodyModel[220] = new ModelRendererTurbo(this, 198, 12, textureX, textureY, "cull"); // Box 330
		bodyModel[221] = new ModelRendererTurbo(this, 235, 64, textureX, textureY); // Box 74
		bodyModel[222] = new ModelRendererTurbo(this, 225, 77, textureX, textureY); // Box 75
		bodyModel[223] = new ModelRendererTurbo(this, 225, 67, textureX, textureY); // Box 76
		bodyModel[224] = new ModelRendererTurbo(this, 241, 67, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[225] = new ModelRendererTurbo(this, 241, 67, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[226] = new ModelRendererTurbo(this, 223, 67, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[227] = new ModelRendererTurbo(this, 223, 67, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[228] = new ModelRendererTurbo(this, 229, 75, textureX, textureY); // Box 394
		bodyModel[229] = new ModelRendererTurbo(this, 228, 62, textureX, textureY); // Box 395
		bodyModel[230] = new ModelRendererTurbo(this, 311, 111, textureX, textureY); // Box 253
		bodyModel[231] = new ModelRendererTurbo(this, 311, 114, textureX, textureY); // Box 280
		bodyModel[232] = new ModelRendererTurbo(this, 206, 17, textureX, textureY); // Box 398
		bodyModel[233] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 396
		bodyModel[234] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[235] = new ModelRendererTurbo(this, 62, 92, textureX, textureY); // Box 334
		bodyModel[236] = new ModelRendererTurbo(this, 162, 87, textureX, textureY); // Box 396
		bodyModel[237] = new ModelRendererTurbo(this, 162, 82, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[238] = new ModelRendererTurbo(this, 162, 92, textureX, textureY); // Box 334
		bodyModel[239] = new ModelRendererTurbo(this, 155, 82, textureX, textureY); // Box 405
		bodyModel[240] = new ModelRendererTurbo(this, 169, 82, textureX, textureY); // Box 406
		bodyModel[241] = new ModelRendererTurbo(this, 69, 82, textureX, textureY); // Box 407
		bodyModel[242] = new ModelRendererTurbo(this, 55, 82, textureX, textureY); // Box 408
		bodyModel[243] = new ModelRendererTurbo(this, 21, 43, textureX, textureY); // Box 311
		bodyModel[244] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 123
		bodyModel[245] = new ModelRendererTurbo(this, 39, 69, textureX, textureY); // Box 412 cs
		bodyModel[246] = new ModelRendererTurbo(this, 53, 69, textureX, textureY); // Box 413 cs
		bodyModel[247] = new ModelRendererTurbo(this, 39, 61, textureX, textureY); // Box 86 cs
		bodyModel[248] = new ModelRendererTurbo(this, 34, 82, textureX, textureY); // Box 531 cs
		bodyModel[249] = new ModelRendererTurbo(this, 66, 60, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[250] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 416

		bodyModel[0].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 5
		bodyModel[3].setRotationPoint(-37.01F, -4F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-37F, 1F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 9
		bodyModel[5].setRotationPoint(-37F, 8F, -12F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[6].setRotationPoint(-37F, 6F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[7].setRotationPoint(-37F, 3.5F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		bodyModel[8].setRotationPoint(-37F, 1F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 74, 2, 14, 0F); // Box 14
		bodyModel[9].setRotationPoint(-37F, -1F, -7F);

		bodyModel[10].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 15
		bodyModel[10].setRotationPoint(-34F, -1F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-37F, 1F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 74, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-37F, 1F, -5F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 19
		bodyModel[13].setRotationPoint(37.01F, -4F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[14].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(32F, 1F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 22, 0F); // Box 31
		bodyModel[17].setRotationPoint(-8.5F, 1F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-37F, 1F, 8F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 34
		bodyModel[19].setRotationPoint(-33F, -16F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[20].setRotationPoint(-33F, -16F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(-33F, -16F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[22].setRotationPoint(-33F, -17F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-33F, -17F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 40, 15, 14, 0F); // Box 41
		bodyModel[24].setRotationPoint(-32F, -16F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[25].setRotationPoint(37F, 1F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[26].setRotationPoint(37F, 1F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 40, 1, 10, 0F); // Box 45
		bodyModel[27].setRotationPoint(-32F, -17F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[28].setRotationPoint(-32F, -17F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[29].setRotationPoint(-32F, -17F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 48
		bodyModel[30].setRotationPoint(9F, -19F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 49
		bodyModel[31].setRotationPoint(9F, -19F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[32].setRotationPoint(8F, -20F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 135
		bodyModel[33].setRotationPoint(8F, -23F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[34].setRotationPoint(8F, -23F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[35].setRotationPoint(8F, -21F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[36].setRotationPoint(8F, -20F, -11F);

		bodyModel[37].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[37].setRotationPoint(8.5F, -19F, -10.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		bodyModel[38].setRotationPoint(8F, -5F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 62
		bodyModel[39].setRotationPoint(26F, -3F, 6F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 17, 18, 0F); // Box 63
		bodyModel[40].setRotationPoint(8F, -22F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 17, 17, 0F); // Box 64
		bodyModel[41].setRotationPoint(19F, -22F, -10F);

		bodyModel[42].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[42].setRotationPoint(19.5F, -19F, 7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 81
		bodyModel[43].setRotationPoint(-34F, 1F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 83
		bodyModel[44].setRotationPoint(-34F, 1F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 86
		bodyModel[45].setRotationPoint(34F, 1F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 89
		bodyModel[46].setRotationPoint(34F, 1F, 7F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		bodyModel[47].setRotationPoint(-22.5F, 0F, -11.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		bodyModel[48].setRotationPoint(20.5F, 0F, -11.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 94
		bodyModel[49].setRotationPoint(-30F, -13F, -7.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 95
		bodyModel[50].setRotationPoint(-30F, -13F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[51].setRotationPoint(-33F, -17F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(-33F, -17F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		bodyModel[53].setRotationPoint(-33F, -17F, 4F);

		bodyModel[54].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 102
		bodyModel[54].setRotationPoint(-34F, -9F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		bodyModel[55].setRotationPoint(6F, -17F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 107
		bodyModel[56].setRotationPoint(-34F, -9F, 11F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 108
		bodyModel[57].setRotationPoint(-34F, -9F, -12F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 111
		bodyModel[58].setRotationPoint(-34F, -9F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[59].setRotationPoint(-37F, -9F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[60].setRotationPoint(-37F, -9F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[61].setRotationPoint(-37F, -3F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[62].setRotationPoint(-37F, -3F, 1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 130
		bodyModel[63].setRotationPoint(37F, -9F, 6F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 131
		bodyModel[64].setRotationPoint(37.01F, -9F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 133
		bodyModel[65].setRotationPoint(37F, -3F, 1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 134
		bodyModel[66].setRotationPoint(37F, -9F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[67].setRotationPoint(37F, -3F, -5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		bodyModel[68].setRotationPoint(-37F, 6F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		bodyModel[69].setRotationPoint(-37F, 3.5F, -9F);
		bodyModel[69].rotateAngleX = 0.26179939F;

		bodyModel[70].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[70].setRotationPoint(-37F, 1F, -8F);
		bodyModel[70].rotateAngleX = 0.26179939F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 commander beacon
		bodyModel[71].setRotationPoint(8.32F, -24F, -0.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[72].setRotationPoint(8.5F, -24F, -0.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 216
		bodyModel[73].setRotationPoint(19F, -17F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 217
		bodyModel[74].setRotationPoint(19F, -17F, -12F);

		bodyModel[75].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 221
		bodyModel[75].setRotationPoint(-29F, -18F, -4F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		bodyModel[76].setRotationPoint(-37F, 8F, 10F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		bodyModel[77].setRotationPoint(-37F, 6F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		bodyModel[78].setRotationPoint(-37F, 6F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		bodyModel[79].setRotationPoint(-37F, 3.5F, 9F);
		bodyModel[79].rotateAngleX = -0.26179939F;

		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		bodyModel[80].setRotationPoint(-37F, 3.5F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		bodyModel[81].setRotationPoint(-37F, 1F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		bodyModel[82].setRotationPoint(-37F, 1F, 8F);
		bodyModel[82].rotateAngleX = -0.26179939F;

		bodyModel[83].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 236
		bodyModel[83].setRotationPoint(34F, 8F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 237
		bodyModel[84].setRotationPoint(34F, 6F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 238
		bodyModel[85].setRotationPoint(34F, 6F, 8F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 239
		bodyModel[86].setRotationPoint(34F, 3.5F, 9F);
		bodyModel[86].rotateAngleX = -0.26179939F;

		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 240
		bodyModel[87].setRotationPoint(34F, 3.5F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 241
		bodyModel[88].setRotationPoint(34F, 1F, 8F);
		bodyModel[88].rotateAngleX = -0.26179939F;

		bodyModel[89].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		bodyModel[89].setRotationPoint(34F, 1F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 243
		bodyModel[90].setRotationPoint(34F, 8F, -12F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 244
		bodyModel[91].setRotationPoint(34F, 6F, -10F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 245
		bodyModel[92].setRotationPoint(34F, 6F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 246
		bodyModel[93].setRotationPoint(34F, 3.5F, -9F);
		bodyModel[93].rotateAngleX = 0.26179939F;

		bodyModel[94].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		bodyModel[94].setRotationPoint(34F, 3.5F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		bodyModel[95].setRotationPoint(34F, 1F, -8F);
		bodyModel[95].rotateAngleX = 0.26179939F;

		bodyModel[96].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[96].setRotationPoint(34F, 1F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		bodyModel[97].setRotationPoint(-37.02F, -2.5F, -7F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		bodyModel[98].setRotationPoint(37.02F, -2.5F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 221
		bodyModel[99].setRotationPoint(-23.5F, 2.5F, -2F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 222
		bodyModel[100].setRotationPoint(19.5F, 2.5F, -2F);

		bodyModel[101].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 102
		bodyModel[101].setRotationPoint(20F, -9F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 107
		bodyModel[102].setRotationPoint(29F, -9F, 11F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 108
		bodyModel[103].setRotationPoint(34F, -9F, -12F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 111
		bodyModel[104].setRotationPoint(34F, -9F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[105].setRotationPoint(7F, -21F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[106].setRotationPoint(7F, -20F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[107].setRotationPoint(7F, -23F, 3F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 135
		bodyModel[108].setRotationPoint(7F, -23F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[109].setRotationPoint(7F, -23F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[110].setRotationPoint(7F, -21F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[111].setRotationPoint(7F, -20F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[112].setRotationPoint(37F, -6F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[113].setRotationPoint(37F, -6F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[114].setRotationPoint(-37F, -6F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[115].setRotationPoint(-37F, -6F, 3F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		bodyModel[116].setRotationPoint(6.5F, -3F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 5
		bodyModel[117].setRotationPoint(-37.01F, -9F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[118].setRotationPoint(6F, -19F, -11.01F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F); // Box 105
		bodyModel[119].setRotationPoint(6F, -10F, -11.01F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 74, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 18
		bodyModel[120].setRotationPoint(-37F, 2.5F, -5.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Underframe support cull
		bodyModel[121].setRotationPoint(-10.5F, 2F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[122].setRotationPoint(-22.5F, 2F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[123].setRotationPoint(-22.5F, 2F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[124].setRotationPoint(20.5F, 2F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[125].setRotationPoint(20.5F, 2F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 0, 16, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F); // Box 221
		bodyModel[126].setRotationPoint(-29F, -18.01F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[127].setRotationPoint(8F, -23F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[128].setRotationPoint(8F, -21F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[129].setRotationPoint(19F, -21F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[130].setRotationPoint(8F, -21F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[131].setRotationPoint(19F, -21F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[132].setRotationPoint(8F, -21F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[133].setRotationPoint(19F, -22F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[134].setRotationPoint(8F, -22F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[135].setRotationPoint(19F, -22F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[136].setRotationPoint(8F, -22F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[137].setRotationPoint(-39F, 6F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[138].setRotationPoint(-39F, 6F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[139].setRotationPoint(37F, 6F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[140].setRotationPoint(37F, 6F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		bodyModel[141].setRotationPoint(39F, 6F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[142].setRotationPoint(39F, 7F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 446
		bodyModel[143].setRotationPoint(39.5F, 4F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 4
		bodyModel[144].setRotationPoint(39F, 6F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 4
		bodyModel[145].setRotationPoint(39F, 7F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 446
		bodyModel[146].setRotationPoint(39.5F, 4F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 448
		bodyModel[147].setRotationPoint(39F, 5F, 2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[148].setRotationPoint(39F, 5F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[149].setRotationPoint(-40F, 6F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[150].setRotationPoint(-40F, 7F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[151].setRotationPoint(-40.5F, 4F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[152].setRotationPoint(-40F, 6F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[153].setRotationPoint(-40F, 7F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[154].setRotationPoint(-40.5F, 4F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[155].setRotationPoint(-40F, 5F, 2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
		bodyModel[156].setRotationPoint(-40F, 5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[157].setRotationPoint(-40F, 6F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[158].setRotationPoint(-40F, 6F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 24
		bodyModel[159].setRotationPoint(39F, 6F, 0F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[160].setRotationPoint(39F, 6F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[161].setRotationPoint(13F, -24F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[162].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[163].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[164].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[165].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[166].setRotationPoint(13F, -23.5F, -9.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[167].setRotationPoint(13F, -23.5F, -9.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[168].setRotationPoint(13F, -23.5F, -9.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[169].setRotationPoint(13F, -23.5F, -9.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[170].setRotationPoint(12.5F, -22F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[171].setRotationPoint(13F, -23F, -9.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[172].setRotationPoint(15.8F, -24.5F, -2.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[173].setRotationPoint(16.9F, -25.5F, 0F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[174].setRotationPoint(-19.5F, -18.5F, -3F);

		bodyModel[175].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 21
		bodyModel[175].setRotationPoint(-20F, -18F, -3.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[176].setRotationPoint(-19.5F, -23.5F, -3F);

		bodyModel[177].addBox(0F, 0F, 0F, 11, 4, 16, 0F); // Box 2
		bodyModel[177].setRotationPoint(-2F, 5F, -8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 11, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[178].setRotationPoint(-2F, 2F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[179].setRotationPoint(-2F, 5F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[180].setRotationPoint(-2F, 5F, 8F);

		bodyModel[181].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[181].setRotationPoint(3F, 1.5F, -11.25F);
		bodyModel[181].rotateAngleX = 1.57079633F;

		bodyModel[182].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[182].setRotationPoint(3F, 1.5F, 11.25F);
		bodyModel[182].rotateAngleX = -1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[183].setRotationPoint(20F, -23F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[184].setRotationPoint(20F, -23F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[185].setRotationPoint(20F, -23F, 1F);

		bodyModel[186].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[186].setRotationPoint(20.05F, -22F, -6F);
		bodyModel[186].rotateAngleY = -0.38397244F;

		bodyModel[187].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[187].setRotationPoint(20.05F, -22F, 6F);
		bodyModel[187].rotateAngleY = 0.38397244F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Rear
		bodyModel[188].setRotationPoint(21.75F, -23F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Rear
		bodyModel[189].setRotationPoint(21.75F, -21F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[190].setRotationPoint(0F, -19.5F, -7.15F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[191].setRotationPoint(0F, -19.5F, 6.15F);

		bodyModel[192].addBox(0F, 0F, 0F, 9, 4, 14, 0F); // Box 342
		bodyModel[192].setRotationPoint(-1F, -20F, -7F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[193].setRotationPoint(29F, -9F, -6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[194].setRotationPoint(27F, -11F, -6.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[195].setRotationPoint(33F, -14F, 1F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 13, 2, 0F); // Box 54
		bodyModel[196].setRotationPoint(33F, -14F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[197].setRotationPoint(32.25F, -13F, -5.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 13, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[198].setRotationPoint(33F, -14F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[199].setRotationPoint(32.25F, -13F, 3.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[200].setRotationPoint(20F, -15F, -6F);

		bodyModel[201].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[201].setRotationPoint(27.5F, -14.5F, 5.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[202].setRotationPoint(31.5F, -14.5F, -5.5F);

		bodyModel[203].addBox(-3F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[203].setRotationPoint(25.5F, -15F, 4.5F);
		bodyModel[203].rotateAngleY = 0.61086524F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[204].setRotationPoint(31.5F, -14.5F, -1F);

		bodyModel[205].addBox(0F, 0F, 0F, 13, 13, 12, 0F); // Box 55
		bodyModel[205].setRotationPoint(20F, -14F, -6F);

		bodyModel[206].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // Box 372
		bodyModel[206].setRotationPoint(20F, -5F, 6F);

		bodyModel[207].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 373
		bodyModel[207].setRotationPoint(20F, -13F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, -0.75F, -4F, 0F, -0.75F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0.25F, 0F, 0F); // Box 374
		bodyModel[208].setRotationPoint(25F, -13F, 11.01F);

		bodyModel[209].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[209].setRotationPoint(10.5F, -24.75F, -4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[210].setRotationPoint(21F, -25F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[211].setRotationPoint(21F, -25.5F, -1F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[212].setRotationPoint(21F, -25.5F, -1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[213].setRotationPoint(21F, -25.5F, -1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[214].setRotationPoint(21F, -25.5F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull sp beacon holder
		bodyModel[215].setRotationPoint(21F, -24F, -1.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[216].setRotationPoint(13.25F, -23.5F, 6.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[217].setRotationPoint(13.25F, -24.25F, 5.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[218].setRotationPoint(10.75F, -24.5F, 6.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[219].setRotationPoint(12.75F, -24.25F, 7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 330
		bodyModel[220].setRotationPoint(12.75F, -22.5F, 6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[221].setRotationPoint(-35.5F, -19F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[222].setRotationPoint(-34.5F, -19F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[223].setRotationPoint(-34.5F, -19F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 117 Numberboard
		bodyModel[224].setRotationPoint(-32.55F, -18F, -6F);
		bodyModel[224].rotateAngleY = 0.38397244F;

		bodyModel[225].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 118 Numberboard
		bodyModel[225].setRotationPoint(-32.55F, -18F, 6F);
		bodyModel[225].rotateAngleY = -0.38397244F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[226].setRotationPoint(-35.25F, -19F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[227].setRotationPoint(-35.25F, -17F, -1F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 4, 12, 0F); // Box 394
		bodyModel[228].setRotationPoint(-32.5F, -19F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 395
		bodyModel[229].setRotationPoint(-32.5F, -19.5F, -1F);

		bodyModel[230].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[230].setRotationPoint(29F, 1F, -9F);
		bodyModel[230].rotateAngleY = -3.14159265F;
		bodyModel[230].rotateAngleZ = -0.27925268F;

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[231].setRotationPoint(32F, 1F, -9F);
		bodyModel[231].rotateAngleY = -3.14159265F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[232].setRotationPoint(15.9F, -24F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[233].setRotationPoint(-38F, -6F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[234].setRotationPoint(-38.25F, -6F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,-0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 334
		bodyModel[235].setRotationPoint(-37.75F, -5F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 396
		bodyModel[236].setRotationPoint(37F, -6F, 4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[237].setRotationPoint(37.25F, -6F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[238].setRotationPoint(36.75F, -5F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 405
		bodyModel[239].setRotationPoint(36.75F, -4F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 406
		bodyModel[240].setRotationPoint(36.75F, -2F, 4F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 407
		bodyModel[241].setRotationPoint(-37.75F, -4F, -6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 408
		bodyModel[242].setRotationPoint(-37.75F, -2F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[243].setRotationPoint(10F, -19F, 11F);
		bodyModel[243].rotateAngleX = 0.61086524F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[244].setRotationPoint(10F, -19F, -11F);
		bodyModel[244].rotateAngleX = -0.61086524F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[245].setRotationPoint(12.8F, -16F, -1F);
		bodyModel[245].rotateAngleY = -3.14159265F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[246].setRotationPoint(19.5F, -14F, -3F);
		bodyModel[246].rotateAngleY = -3.59537826F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[247].setRotationPoint(19.5F, -16F, -3F);
		bodyModel[247].rotateAngleY = -3.59537826F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[248].setRotationPoint(19.5F, -10F, -3F);
		bodyModel[248].rotateAngleY = -3.59537826F;

		bodyModel[249].addShapeBox(0F, 0F, -2F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[249].setRotationPoint(19F, -19F, -7.5F);
		bodyModel[249].rotateAngleY = -3.14159265F;

		bodyModel[250].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Box 416
		bodyModel[250].setRotationPoint(10F, -6F, -10F);
	}
	ModelTypeBnew boger = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6 ) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.35, -0.025, 0);
		boger.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(2.7, 0, 0);
		boger.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
}