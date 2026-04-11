//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RS1
// Model Creator: 
// Created on: 29.04.2020 - 23:08:36
// Last changed on: 29.04.2020 - 23:08:36

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

public class ModelRS1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRS1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[385];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 275, 90, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 11, 3, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 194, 130, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 236, 101, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 273, 115, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 142, 155, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 142, 149, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 142, 142, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 143, 136, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 259, 73, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 275, 66, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 404, 112, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 263, 97, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 74, 101, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 45, 114, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 11, 11, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 279, 110, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 388, 123, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 421, 27, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 393, 27, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 402, 12, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 413, 25, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 293, 32, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 111, 115, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 298, 13, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 306, 27, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 306, 6, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 101, 41, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 101, 5, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 130
		bodyModel[35] = new ModelRendererTurbo(this, 27, 17, textureX, textureY); // Box 135
		bodyModel[36] = new ModelRendererTurbo(this, 29, 26, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 32, 38, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 122, 53, textureX, textureY); // Box 315 door swing right
		bodyModel[40] = new ModelRendererTurbo(this, 87, 75, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 258, 70, textureX, textureY); // Box 62
		bodyModel[42] = new ModelRendererTurbo(this, 80, 39, textureX, textureY); // Box 63
		bodyModel[43] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 64
		bodyModel[44] = new ModelRendererTurbo(this, 70, 67, textureX, textureY, "lamp"); // short hood lamp
		bodyModel[45] = new ModelRendererTurbo(this, 120, 17, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 265, 133, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 243, 133, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 112, 133, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 434, 29, textureX, textureY, "lamp"); // long hood lamp
		bodyModel[51] = new ModelRendererTurbo(this, 359, 110, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 282, 110, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 284, 10, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 283, 34, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 419, 25, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 399, 25, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 271, 56, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 271, 51, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 274, 46, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 157, 112, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 158, 104, textureX, textureY); // Box 105
		bodyModel[63] = new ModelRendererTurbo(this, 151, 121, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Box 108
		bodyModel[65] = new ModelRendererTurbo(this, 230, 129, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 259, 108, textureX, textureY); // Box 116
		bodyModel[67] = new ModelRendererTurbo(this, 249, 108, textureX, textureY); // Box 117
		bodyModel[68] = new ModelRendererTurbo(this, 259, 106, textureX, textureY); // Box 120
		bodyModel[69] = new ModelRendererTurbo(this, 249, 106, textureX, textureY); // Box 121
		bodyModel[70] = new ModelRendererTurbo(this, 97, 106, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 84, 102, textureX, textureY); // Box 131
		bodyModel[72] = new ModelRendererTurbo(this, 97, 108, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 87, 106, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 87, 108, textureX, textureY); // Box 136
		bodyModel[75] = new ModelRendererTurbo(this, 144, 152, textureX, textureY); // Box 137
		bodyModel[76] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 138
		bodyModel[77] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 139
		bodyModel[78] = new ModelRendererTurbo(this, 199, 41, textureX, textureY); // NP Bell 1
		bodyModel[79] = new ModelRendererTurbo(this, 199, 38, textureX, textureY); // NP Bell 1
		bodyModel[80] = new ModelRendererTurbo(this, 199, 44, textureX, textureY); // NP Bell 1
		bodyModel[81] = new ModelRendererTurbo(this, 204, 40, textureX, textureY, "cull"); // NP Bell frame cull
		bodyModel[82] = new ModelRendererTurbo(this, 205, 47, textureX, textureY); // NP Bell 1
		bodyModel[83] = new ModelRendererTurbo(this, 413, 17, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[84] = new ModelRendererTurbo(this, 403, 17, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[85] = new ModelRendererTurbo(this, 85, 88, textureX, textureY); // Box 67
		bodyModel[86] = new ModelRendererTurbo(this, 102, 84, textureX, textureY); // Box 70
		bodyModel[87] = new ModelRendererTurbo(this, 156, 53, textureX, textureY, BoxName.ditch); // Long hood Ditchlight r
		bodyModel[88] = new ModelRendererTurbo(this, 156, 48, textureX, textureY); // Box 212
		bodyModel[89] = new ModelRendererTurbo(this, 156, 48, textureX, textureY); // Box 213
		bodyModel[90] = new ModelRendererTurbo(this, 156, 53, textureX, textureY, BoxName.ditch); // Long hood Ditchlight l
		bodyModel[91] = new ModelRendererTurbo(this, 149, 53, textureX, textureY, BoxName.ditch); // Short hood ditchlight l
		bodyModel[92] = new ModelRendererTurbo(this, 149, 48, textureX, textureY); // Box 161
		bodyModel[93] = new ModelRendererTurbo(this, 149, 48, textureX, textureY); // Box 162
		bodyModel[94] = new ModelRendererTurbo(this, 149, 53, textureX, textureY, BoxName.ditch); // Short hood ditchlight r
		bodyModel[95] = new ModelRendererTurbo(this, 413, 13, textureX, textureY); // Box 211
		bodyModel[96] = new ModelRendererTurbo(this, 403, 13, textureX, textureY); // Box 212
		bodyModel[97] = new ModelRendererTurbo(this, 166, 10, textureX, textureY, BoxName.commander); // Box 399 commander beacon
		bodyModel[98] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 400
		bodyModel[99] = new ModelRendererTurbo(this, 172, 10, textureX, textureY); // Box 215
		bodyModel[100] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 216
		bodyModel[101] = new ModelRendererTurbo(this, 22, 36, textureX, textureY); // Box 217
		bodyModel[102] = new ModelRendererTurbo(this, 17, 43, textureX, textureY); // box64
		bodyModel[103] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // box65
		bodyModel[104] = new ModelRendererTurbo(this, 274, 41, textureX, textureY); // Box 220 atsf stack
		bodyModel[105] = new ModelRendererTurbo(this, 272, 23, textureX, textureY); // Box 221
		bodyModel[106] = new ModelRendererTurbo(this, 266, 39, textureX, textureY); // Box 222
		bodyModel[107] = new ModelRendererTurbo(this, 223, 132, textureX, textureY); // Box 223
		bodyModel[108] = new ModelRendererTurbo(this, 223, 130, textureX, textureY); // Box 224
		bodyModel[109] = new ModelRendererTurbo(this, 67, 110, textureX, textureY); // Box 225
		bodyModel[110] = new ModelRendererTurbo(this, 67, 112, textureX, textureY); // Box 226
		bodyModel[111] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 227
		bodyModel[112] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 228
		bodyModel[113] = new ModelRendererTurbo(this, 158, 149, textureX, textureY); // Box 229
		bodyModel[114] = new ModelRendererTurbo(this, 160, 145, textureX, textureY); // Box 230
		bodyModel[115] = new ModelRendererTurbo(this, 158, 142, textureX, textureY); // Box 231
		bodyModel[116] = new ModelRendererTurbo(this, 159, 136, textureX, textureY); // Box 232
		bodyModel[117] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 233
		bodyModel[118] = new ModelRendererTurbo(this, 158, 155, textureX, textureY); // Box 236
		bodyModel[119] = new ModelRendererTurbo(this, 160, 152, textureX, textureY); // Box 237
		bodyModel[120] = new ModelRendererTurbo(this, 158, 149, textureX, textureY); // Box 238
		bodyModel[121] = new ModelRendererTurbo(this, 160, 145, textureX, textureY); // Box 239
		bodyModel[122] = new ModelRendererTurbo(this, 158, 142, textureX, textureY); // Box 240
		bodyModel[123] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 241
		bodyModel[124] = new ModelRendererTurbo(this, 159, 136, textureX, textureY); // Box 242
		bodyModel[125] = new ModelRendererTurbo(this, 142, 155, textureX, textureY); // Box 243
		bodyModel[126] = new ModelRendererTurbo(this, 144, 152, textureX, textureY); // Box 244
		bodyModel[127] = new ModelRendererTurbo(this, 142, 149, textureX, textureY); // Box 245
		bodyModel[128] = new ModelRendererTurbo(this, 144, 145, textureX, textureY); // Box 246
		bodyModel[129] = new ModelRendererTurbo(this, 142, 142, textureX, textureY); // Box 247
		bodyModel[130] = new ModelRendererTurbo(this, 144, 138, textureX, textureY); // Box 248
		bodyModel[131] = new ModelRendererTurbo(this, 143, 136, textureX, textureY); // Box 249
		bodyModel[132] = new ModelRendererTurbo(this, 244, 106, textureX, textureY); // Box 250
		bodyModel[133] = new ModelRendererTurbo(this, 82, 106, textureX, textureY); // Box 251
		bodyModel[134] = new ModelRendererTurbo(this, 186, 41, textureX, textureY); // Box 114
		bodyModel[135] = new ModelRendererTurbo(this, 186, 38, textureX, textureY); // Box 74
		bodyModel[136] = new ModelRendererTurbo(this, 186, 44, textureX, textureY); // Box 78
		bodyModel[137] = new ModelRendererTurbo(this, 387, 127, textureX, textureY); // Box 221
		bodyModel[138] = new ModelRendererTurbo(this, 288, 127, textureX, textureY); // Box 222
		bodyModel[139] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Box 34
		bodyModel[140] = new ModelRendererTurbo(this, 1, 133, textureX, textureY); // Box 36
		bodyModel[141] = new ModelRendererTurbo(this, 13, 133, textureX, textureY); // Box 37
		bodyModel[142] = new ModelRendererTurbo(this, 47, 142, textureX, textureY); // Box 38
		bodyModel[143] = new ModelRendererTurbo(this, 9, 122, textureX, textureY); // Box 39
		bodyModel[144] = new ModelRendererTurbo(this, 13, 119, textureX, textureY); // Box 96
		bodyModel[145] = new ModelRendererTurbo(this, 43, 122, textureX, textureY); // Box 97
		bodyModel[146] = new ModelRendererTurbo(this, 43, 119, textureX, textureY); // Box 98
		bodyModel[147] = new ModelRendererTurbo(this, 8, 138, textureX, textureY); // Box 41
		bodyModel[148] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 45
		bodyModel[149] = new ModelRendererTurbo(this, 31, 129, textureX, textureY); // Box 46
		bodyModel[150] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 47
		bodyModel[151] = new ModelRendererTurbo(this, 128, 112, textureX, textureY); // Box 102
		bodyModel[152] = new ModelRendererTurbo(this, 128, 121, textureX, textureY); // Box 107
		bodyModel[153] = new ModelRendererTurbo(this, 128, 130, textureX, textureY); // Box 105
		bodyModel[154] = new ModelRendererTurbo(this, 125, 105, textureX, textureY); // Box 108
		bodyModel[155] = new ModelRendererTurbo(this, 125, 120, textureX, textureY); // Box 111
		bodyModel[156] = new ModelRendererTurbo(this, 56, 3, textureX, textureY); // Box 129
		bodyModel[157] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 130
		bodyModel[158] = new ModelRendererTurbo(this, 54, 9, textureX, textureY); // Box 132
		bodyModel[159] = new ModelRendererTurbo(this, 52, 16, textureX, textureY); // Box 135
		bodyModel[160] = new ModelRendererTurbo(this, 54, 25, textureX, textureY); // Box 57
		bodyModel[161] = new ModelRendererTurbo(this, 55, 32, textureX, textureY); // Box 58
		bodyModel[162] = new ModelRendererTurbo(this, 58, 39, textureX, textureY); // Box 59
		bodyModel[163] = new ModelRendererTurbo(this, 26, 3, textureX, textureY); // Box 129
		bodyModel[164] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 130
		bodyModel[165] = new ModelRendererTurbo(this, 26, 9, textureX, textureY); // Box 132
		bodyModel[166] = new ModelRendererTurbo(this, 24, 16, textureX, textureY); // Box 135
		bodyModel[167] = new ModelRendererTurbo(this, 26, 25, textureX, textureY); // Box 57
		bodyModel[168] = new ModelRendererTurbo(this, 27, 32, textureX, textureY); // Box 58
		bodyModel[169] = new ModelRendererTurbo(this, 28, 39, textureX, textureY); // Box 59
		bodyModel[170] = new ModelRendererTurbo(this, 71, 52, textureX, textureY, "lamp"); // Box 149 glow
		bodyModel[171] = new ModelRendererTurbo(this, 71, 52, textureX, textureY, "lamp"); // Box 150 glow
		bodyModel[172] = new ModelRendererTurbo(this, 329, 128, textureX, textureY); // Box 31
		bodyModel[173] = new ModelRendererTurbo(this, 341, 142, textureX, textureY); // Box 31
		bodyModel[174] = new ModelRendererTurbo(this, 360, 136, textureX, textureY); // Box 31
		bodyModel[175] = new ModelRendererTurbo(this, 371, 142, textureX, textureY); // Box 31
		bodyModel[176] = new ModelRendererTurbo(this, 331, 116, textureX, textureY); // Box 31
		bodyModel[177] = new ModelRendererTurbo(this, 320, 110, textureX, textureY); // Box 31
		bodyModel[178] = new ModelRendererTurbo(this, 350, 110, textureX, textureY); // Box 31
		bodyModel[179] = new ModelRendererTurbo(this, 335, 112, textureX, textureY); // Box 31
		bodyModel[180] = new ModelRendererTurbo(this, 371, 138, textureX, textureY); // Box 31
		bodyModel[181] = new ModelRendererTurbo(this, 191, 41, textureX, textureY); // Box 38
		bodyModel[182] = new ModelRendererTurbo(this, 192, 38, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 258, 77, textureX, textureY); // Box 62
		bodyModel[184] = new ModelRendererTurbo(this, 227, 13, textureX, textureY, "cull"); // Alaska number board suport cull
		bodyModel[185] = new ModelRendererTurbo(this, 243, 18, textureX, textureY); // Alaska number boards socket
		bodyModel[186] = new ModelRendererTurbo(this, 243, 18, textureX, textureY); // Alaska number boards socket
		bodyModel[187] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 78 lamp socket
		bodyModel[188] = new ModelRendererTurbo(this, 67, 1, textureX, textureY); // Box 31
		bodyModel[189] = new ModelRendererTurbo(this, 78, 3, textureX, textureY, "lamp"); // Back left lamp
		bodyModel[190] = new ModelRendererTurbo(this, 78, 3, textureX, textureY, "lamp"); // Back right lamp
		bodyModel[191] = new ModelRendererTurbo(this, 66, 47, textureX, textureY, "lamp"); // short hood left lamp
		bodyModel[192] = new ModelRendererTurbo(this, 66, 47, textureX, textureY, "lamp"); // short hood right lamp
		bodyModel[193] = new ModelRendererTurbo(this, 68, 56, textureX, textureY, "lamp"); // short hood top lamp
		bodyModel[194] = new ModelRendererTurbo(this, 68, 61, textureX, textureY, "lamp"); // short hood bottom lamp
		bodyModel[195] = new ModelRendererTurbo(this, 434, 37, textureX, textureY, ""); // long hood lamp socket
		bodyModel[196] = new ModelRendererTurbo(this, 444, 55, textureX, textureY, "lamp"); // long hood left lamp
		bodyModel[197] = new ModelRendererTurbo(this, 444, 55, textureX, textureY, "lamp"); // long hood right lamp
		bodyModel[198] = new ModelRendererTurbo(this, 442, 44, textureX, textureY, "lamp"); // long hood top lamp
		bodyModel[199] = new ModelRendererTurbo(this, 442, 49, textureX, textureY, "lamp"); // long hood bottom lamp
		bodyModel[200] = new ModelRendererTurbo(this, 59, 48, textureX, textureY); // Box 78 lamp socket
		bodyModel[201] = new ModelRendererTurbo(this, 61, 58, textureX, textureY); // Box 78 lamp socket
		bodyModel[202] = new ModelRendererTurbo(this, 433, 53, textureX, textureY); // Box 78 lamp socket
		bodyModel[203] = new ModelRendererTurbo(this, 435, 45, textureX, textureY); // Box 78 lamp socket
		bodyModel[204] = new ModelRendererTurbo(this, 213, 41, textureX, textureY); // Box 114
		bodyModel[205] = new ModelRendererTurbo(this, 213, 38, textureX, textureY); // Box 74
		bodyModel[206] = new ModelRendererTurbo(this, 213, 44, textureX, textureY); // Box 78
		bodyModel[207] = new ModelRendererTurbo(this, 218, 40, textureX, textureY, "cull"); // Bell frame cul
		bodyModel[208] = new ModelRendererTurbo(this, 434, 13, textureX, textureY); // long hood lamp socket
		bodyModel[209] = new ModelRendererTurbo(this, 432, 20, textureX, textureY); // Box 38
		bodyModel[210] = new ModelRendererTurbo(this, 441, 19, textureX, textureY, "lamp"); // long hood top lamp
		bodyModel[211] = new ModelRendererTurbo(this, 441, 19, textureX, textureY, "lamp"); // long hood bottom lamp
		bodyModel[212] = new ModelRendererTurbo(this, 50, 43, textureX, textureY); // Box 34
		bodyModel[213] = new ModelRendererTurbo(this, 57, 48, textureX, textureY); // Box 34
		bodyModel[214] = new ModelRendererTurbo(this, 57, 37, textureX, textureY); // Box 34
		bodyModel[215] = new ModelRendererTurbo(this, 408, 48, textureX, textureY); // Box 34
		bodyModel[216] = new ModelRendererTurbo(this, 405, 47, textureX, textureY); // Box 34
		bodyModel[217] = new ModelRendererTurbo(this, 415, 43, textureX, textureY); // Box 34
		bodyModel[218] = new ModelRendererTurbo(this, 91, 144, textureX, textureY); // Box 136
		bodyModel[219] = new ModelRendererTurbo(this, 97, 144, textureX, textureY); // Box 136
		bodyModel[220] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 136
		bodyModel[221] = new ModelRendererTurbo(this, 252, 138, textureX, textureY); // Box 136
		bodyModel[222] = new ModelRendererTurbo(this, 91, 137, textureX, textureY); // Box 23
		bodyModel[223] = new ModelRendererTurbo(this, 253, 29, textureX, textureY); // Box 31
		bodyModel[224] = new ModelRendererTurbo(this, 148, 60, textureX, textureY); // Box 2
		bodyModel[225] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 2
		bodyModel[226] = new ModelRendererTurbo(this, 148, 60, textureX, textureY); // Box 2
		bodyModel[227] = new ModelRendererTurbo(this, 158, 62, textureX, textureY, "lamp"); // Markelight glow
		bodyModel[228] = new ModelRendererTurbo(this, 158, 65, textureX, textureY, "lamp"); // Markelight glow
		bodyModel[229] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 2
		bodyModel[230] = new ModelRendererTurbo(this, 253, 138, textureX, textureY); // Box 23
		bodyModel[231] = new ModelRendererTurbo(this, 261, 46, textureX, textureY); // Box 99
		bodyModel[232] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Steam gen exhast 2
		bodyModel[233] = new ModelRendererTurbo(this, 3, 24, textureX, textureY); // Steam gen exhast 2
		bodyModel[234] = new ModelRendererTurbo(this, 272, 22, textureX, textureY); // Box 31
		bodyModel[235] = new ModelRendererTurbo(this, 267, 24, textureX, textureY); // Box 31
		bodyModel[236] = new ModelRendererTurbo(this, 2, 63, textureX, textureY); // Box 34
		bodyModel[237] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 36
		bodyModel[238] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 37
		bodyModel[239] = new ModelRendererTurbo(this, 47, 67, textureX, textureY); // Box 38
		bodyModel[240] = new ModelRendererTurbo(this, 9, 51, textureX, textureY); // Box 39
		bodyModel[241] = new ModelRendererTurbo(this, 13, 48, textureX, textureY); // Box 96
		bodyModel[242] = new ModelRendererTurbo(this, 43, 51, textureX, textureY); // Box 97
		bodyModel[243] = new ModelRendererTurbo(this, 43, 48, textureX, textureY); // Box 98
		bodyModel[244] = new ModelRendererTurbo(this, 8, 63, textureX, textureY); // Box 41
		bodyModel[245] = new ModelRendererTurbo(this, 8, 46, textureX, textureY); // Box 45
		bodyModel[246] = new ModelRendererTurbo(this, 31, 58, textureX, textureY); // Box 46
		bodyModel[247] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 47
		bodyModel[248] = new ModelRendererTurbo(this, 84, 146, textureX, textureY); // Box 135 MU connection
		bodyModel[249] = new ModelRendererTurbo(this, 104, 146, textureX, textureY); // Box 135 MU connection
		bodyModel[250] = new ModelRendererTurbo(this, 260, 137, textureX, textureY); // Box 135 MU connection
		bodyModel[251] = new ModelRendererTurbo(this, 252, 137, textureX, textureY); // Box 135 MU connection
		bodyModel[252] = new ModelRendererTurbo(this, 256, 107, textureX, textureY); // Box 135 MU connection
		bodyModel[253] = new ModelRendererTurbo(this, 94, 107, textureX, textureY); // Box 135 MU connection
		bodyModel[254] = new ModelRendererTurbo(this, 172, 30, textureX, textureY); // Box 299
		bodyModel[255] = new ModelRendererTurbo(this, 181, 30, textureX, textureY); // Box 300
		bodyModel[256] = new ModelRendererTurbo(this, 172, 27, textureX, textureY); // Box 299
		bodyModel[257] = new ModelRendererTurbo(this, 181, 27, textureX, textureY); // Box 300
		bodyModel[258] = new ModelRendererTurbo(this, 172, 24, textureX, textureY); // Box 299
		bodyModel[259] = new ModelRendererTurbo(this, 181, 24, textureX, textureY); // Box 300
		bodyModel[260] = new ModelRendererTurbo(this, 2, 99, textureX, textureY); // Box 34
		bodyModel[261] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Box 36
		bodyModel[262] = new ModelRendererTurbo(this, 13, 99, textureX, textureY); // Box 37
		bodyModel[263] = new ModelRendererTurbo(this, 8, 99, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 47, 103, textureX, textureY); // Box 38
		bodyModel[265] = new ModelRendererTurbo(this, 9, 88, textureX, textureY); // Box 39
		bodyModel[266] = new ModelRendererTurbo(this, 13, 85, textureX, textureY); // Box 96
		bodyModel[267] = new ModelRendererTurbo(this, 43, 88, textureX, textureY); // Box 97
		bodyModel[268] = new ModelRendererTurbo(this, 43, 85, textureX, textureY); // Box 98
		bodyModel[269] = new ModelRendererTurbo(this, 8, 83, textureX, textureY); // Box 45
		bodyModel[270] = new ModelRendererTurbo(this, 31, 95, textureX, textureY); // Box 46
		bodyModel[271] = new ModelRendererTurbo(this, 1, 95, textureX, textureY); // Box 47
		bodyModel[272] = new ModelRendererTurbo(this, 75, 86, textureX, textureY); // Box 67
		bodyModel[273] = new ModelRendererTurbo(this, 85, 80, textureX, textureY); // Box 67
		bodyModel[274] = new ModelRendererTurbo(this, 100, 88, textureX, textureY); // Box 70
		bodyModel[275] = new ModelRendererTurbo(this, 258, 64, textureX, textureY); // Box 62
		bodyModel[276] = new ModelRendererTurbo(this, 246, 102, textureX, textureY); // Box 5
		bodyModel[277] = new ModelRendererTurbo(this, 145, 27, textureX, textureY); // Box 299
		bodyModel[278] = new ModelRendererTurbo(this, 161, 106, textureX, textureY); // Box 105
		bodyModel[279] = new ModelRendererTurbo(this, 131, 133, textureX, textureY); // Box 105
		bodyModel[280] = new ModelRendererTurbo(this, 131, 130, textureX, textureY); // Box 105
		bodyModel[281] = new ModelRendererTurbo(this, 161, 109, textureX, textureY); // Box 105
		bodyModel[282] = new ModelRendererTurbo(this, 262, 154, textureX, textureY); // Box 18
		bodyModel[283] = new ModelRendererTurbo(this, 278, 139, textureX, textureY, "cull"); // Underframe support cull
		bodyModel[284] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[285] = new ModelRendererTurbo(this, 367, 126, textureX, textureY); // Box 92
		bodyModel[286] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[287] = new ModelRendererTurbo(this, 311, 126, textureX, textureY); // Box 92
		bodyModel[288] = new ModelRendererTurbo(this, 235, 5, textureX, textureY); // Box 221
		bodyModel[289] = new ModelRendererTurbo(this, 158, 62, textureX, textureY, "lamp"); // Markelight glow
		bodyModel[290] = new ModelRendererTurbo(this, 158, 65, textureX, textureY, "lamp"); // Markelight glow
		bodyModel[291] = new ModelRendererTurbo(this, 29, 10, textureX, textureY); // Box 57
		bodyModel[292] = new ModelRendererTurbo(this, 30, 4, textureX, textureY); // Box 58
		bodyModel[293] = new ModelRendererTurbo(this, 89, 15, textureX, textureY); // Box 64
		bodyModel[294] = new ModelRendererTurbo(this, 89, 51, textureX, textureY); // Box 64
		bodyModel[295] = new ModelRendererTurbo(this, 80, 15, textureX, textureY); // Box 64
		bodyModel[296] = new ModelRendererTurbo(this, 80, 51, textureX, textureY); // Box 64
		bodyModel[297] = new ModelRendererTurbo(this, 87, 45, textureX, textureY); // Box 64
		bodyModel[298] = new ModelRendererTurbo(this, 87, 9, textureX, textureY); // Box 64
		bodyModel[299] = new ModelRendererTurbo(this, 76, 9, textureX, textureY); // Box 64
		bodyModel[300] = new ModelRendererTurbo(this, 76, 45, textureX, textureY); // Box 64
		bodyModel[301] = new ModelRendererTurbo(this, 124, 6, textureX, textureY, "cull"); // Box 3 cull
		bodyModel[302] = new ModelRendererTurbo(this, 126, 1, textureX, textureY); // Box 5
		bodyModel[303] = new ModelRendererTurbo(this, 128, 37, textureX, textureY); // Box 304
		bodyModel[304] = new ModelRendererTurbo(this, 126, 42, textureX, textureY, "cull"); // Box 311 cull
		bodyModel[305] = new ModelRendererTurbo(this, 361, 110, textureX, textureY); // Box 31
		bodyModel[306] = new ModelRendererTurbo(this, 376, 136, textureX, textureY); // Box 31
		bodyModel[307] = new ModelRendererTurbo(this, 88, 75, textureX, textureY); // Box 67
		bodyModel[308] = new ModelRendererTurbo(this, 74, 80, textureX, textureY); // Box 67
		bodyModel[309] = new ModelRendererTurbo(this, 74, 83, textureX, textureY); // Box 67
		bodyModel[310] = new ModelRendererTurbo(this, 69, 31, textureX, textureY, "lamp"); // Alaska short hood top lamp
		bodyModel[311] = new ModelRendererTurbo(this, 69, 36, textureX, textureY, "lamp"); // Alaska short hood bottom lamp
		bodyModel[312] = new ModelRendererTurbo(this, 62, 34, textureX, textureY); // Alaska lamp socket
		bodyModel[313] = new ModelRendererTurbo(this, 448, 19, textureX, textureY, "lamp"); // long hood bottom lamp
		bodyModel[314] = new ModelRendererTurbo(this, 448, 19, textureX, textureY, "lamp"); // long hood top lamp
		bodyModel[315] = new ModelRendererTurbo(this, 231, 147, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[316] = new ModelRendererTurbo(this, 90, 148, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[317] = new ModelRendererTurbo(this, 97, 149, textureX, textureY); // Box 132
		bodyModel[318] = new ModelRendererTurbo(this, 75, 149, textureX, textureY); // Box 133
		bodyModel[319] = new ModelRendererTurbo(this, 216, 145, textureX, textureY); // Box 307
		bodyModel[320] = new ModelRendererTurbo(this, 238, 145, textureX, textureY); // Box 308
		bodyModel[321] = new ModelRendererTurbo(this, 73, 186, textureX, textureY); // Box 4
		bodyModel[322] = new ModelRendererTurbo(this, 73, 198, textureX, textureY); // Box 4
		bodyModel[323] = new ModelRendererTurbo(this, 110, 178, textureX, textureY); // Box 446
		bodyModel[324] = new ModelRendererTurbo(this, 97, 186, textureX, textureY); // Box 4
		bodyModel[325] = new ModelRendererTurbo(this, 97, 198, textureX, textureY); // Box 4
		bodyModel[326] = new ModelRendererTurbo(this, 64, 178, textureX, textureY); // Box 446
		bodyModel[327] = new ModelRendererTurbo(this, 98, 174, textureX, textureY); // Box 448
		bodyModel[328] = new ModelRendererTurbo(this, 76, 174, textureX, textureY); // Box 448
		bodyModel[329] = new ModelRendererTurbo(this, 109, 166, textureX, textureY); // Box 361
		bodyModel[330] = new ModelRendererTurbo(this, 98, 161, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[331] = new ModelRendererTurbo(this, 65, 166, textureX, textureY); // Box 361
		bodyModel[332] = new ModelRendererTurbo(this, 76, 161, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[333] = new ModelRendererTurbo(this, 214, 182, textureX, textureY); // Box 4
		bodyModel[334] = new ModelRendererTurbo(this, 214, 194, textureX, textureY); // Box 4
		bodyModel[335] = new ModelRendererTurbo(this, 251, 174, textureX, textureY); // Box 446
		bodyModel[336] = new ModelRendererTurbo(this, 238, 182, textureX, textureY); // Box 4
		bodyModel[337] = new ModelRendererTurbo(this, 238, 194, textureX, textureY); // Box 4
		bodyModel[338] = new ModelRendererTurbo(this, 205, 174, textureX, textureY); // Box 446
		bodyModel[339] = new ModelRendererTurbo(this, 239, 170, textureX, textureY); // Box 448
		bodyModel[340] = new ModelRendererTurbo(this, 217, 170, textureX, textureY); // Box 448
		bodyModel[341] = new ModelRendererTurbo(this, 250, 162, textureX, textureY); // Box 361
		bodyModel[342] = new ModelRendererTurbo(this, 239, 157, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[343] = new ModelRendererTurbo(this, 206, 162, textureX, textureY); // Box 361
		bodyModel[344] = new ModelRendererTurbo(this, 217, 157, textureX, textureY); // Box 361 big fuck off plow
		bodyModel[345] = new ModelRendererTurbo(this, 251, 184, textureX, textureY); // Box 24
		bodyModel[346] = new ModelRendererTurbo(this, 201, 184, textureX, textureY); // Box 25
		bodyModel[347] = new ModelRendererTurbo(this, 110, 188, textureX, textureY); // Box 24
		bodyModel[348] = new ModelRendererTurbo(this, 60, 188, textureX, textureY); // Box 25
		bodyModel[349] = new ModelRendererTurbo(this, 165, 21, textureX, textureY); // Box 331 M5
		bodyModel[350] = new ModelRendererTurbo(this, 165, 18, textureX, textureY); // Box 331 M5
		bodyModel[351] = new ModelRendererTurbo(this, 165, 30, textureX, textureY); // Box 331 M5
		bodyModel[352] = new ModelRendererTurbo(this, 165, 24, textureX, textureY); // Box 331 M5
		bodyModel[353] = new ModelRendererTurbo(this, 163, 27, textureX, textureY); // Box 331 M5
		bodyModel[354] = new ModelRendererTurbo(this, 156, 21, textureX, textureY); // Box 331 M5
		bodyModel[355] = new ModelRendererTurbo(this, 156, 18, textureX, textureY); // Box 331 M5
		bodyModel[356] = new ModelRendererTurbo(this, 156, 30, textureX, textureY); // Box 331 M5
		bodyModel[357] = new ModelRendererTurbo(this, 156, 24, textureX, textureY); // Box 331 M5
		bodyModel[358] = new ModelRendererTurbo(this, 154, 27, textureX, textureY); // Box 331 M5
		bodyModel[359] = new ModelRendererTurbo(this, 283, 46, textureX, textureY); // Box 220 fucking frisco stack
		bodyModel[360] = new ModelRendererTurbo(this, 176, 13, textureX, textureY); // Box 364 prime base
		bodyModel[361] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[362] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[363] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[364] = new ModelRendererTurbo(this, 176, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[365] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Steam gen exhast 1
		bodyModel[366] = new ModelRendererTurbo(this, 227, 18, textureX, textureY, "lamp"); // Alaska number boards glow
		bodyModel[367] = new ModelRendererTurbo(this, 227, 18, textureX, textureY, "lamp"); // Alaska number boards glow
		bodyModel[368] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime1); // Box 6 PRIME3-1
		bodyModel[369] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime3); // Box 7 PRIME3-3
		bodyModel[370] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime2); // Box 8 PRIME3-2
		bodyModel[371] = new ModelRendererTurbo(this, 186, 9, textureX, textureY, BoxName.prime4); // Box 9 PRIME3-4
		bodyModel[372] = new ModelRendererTurbo(this, 184, 17, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[373] = new ModelRendererTurbo(this, 186, 13, textureX, textureY); // Box 428
		bodyModel[374] = new ModelRendererTurbo(this, 192, 19, textureX, textureY, "cull"); // Box 418 cull platform atsf
		bodyModel[375] = new ModelRendererTurbo(this, 199, 17, textureX, textureY); // Box 308
		bodyModel[376] = new ModelRendererTurbo(this, 197, 9, textureX, textureY); // Box 185
		bodyModel[377] = new ModelRendererTurbo(this, 199, 4, textureX, textureY, "lamp"); // Box 247  fncc gyra front
		bodyModel[378] = new ModelRendererTurbo(this, 199, 4, textureX, textureY, "lamp"); // Box 248 fncc gyra front
		bodyModel[379] = new ModelRendererTurbo(this, 208, 9, textureX, textureY); // Box 185
		bodyModel[380] = new ModelRendererTurbo(this, 210, 4, textureX, textureY, "lamp"); // Box 247  fncc gyra rear
		bodyModel[381] = new ModelRendererTurbo(this, 210, 4, textureX, textureY, "lamp"); // Box 248 fncc gyra rear
		bodyModel[382] = new ModelRendererTurbo(this, 168, 48, textureX, textureY, "lamp"); // Box 401 tidewater cab gyra
		bodyModel[383] = new ModelRendererTurbo(this, 167, 53, textureX, textureY); // Box 400 tidewater cab grya box
		bodyModel[384] = new ModelRendererTurbo(this, 167, 58, textureX, textureY, "cull"); // Box 438 tidewader cab gyra CULL

		bodyModel[0].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 50
		bodyModel[3].setRotationPoint(-40F, 8F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 5
		bodyModel[4].setRotationPoint(-37.01F, -4F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-37F, 1F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 9
		bodyModel[6].setRotationPoint(-37F, 8F, -12F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		bodyModel[7].setRotationPoint(-37F, 6F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		bodyModel[8].setRotationPoint(-37F, 3.5F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		bodyModel[9].setRotationPoint(-37F, 1F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 74, 2, 14, 0F); // Box 14
		bodyModel[10].setRotationPoint(-37F, -1F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 68, 2, 4, 0F); // Box 15
		bodyModel[11].setRotationPoint(-34F, -1F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(-37F, 1F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 74, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-37F, 1F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 13, 22, 0F); // Box 19
		bodyModel[14].setRotationPoint(37.01F, -4F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 0, 22, 0F); // Box 21
		bodyModel[15].setRotationPoint(37F, 8F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		bodyModel[16].setRotationPoint(38F, 3F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(32F, 1F, -3F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 6, 22, 0F); // Box 31
		bodyModel[19].setRotationPoint(-8.5F, 1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-37F, 1F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 34
		bodyModel[21].setRotationPoint(-33F, -16F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-33F, -16F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-33F, -16F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[24].setRotationPoint(-33F, -17F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-33F, -17F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 40, 15, 14, 0F); // Box 41
		bodyModel[26].setRotationPoint(-32F, -16F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(37F, 1F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(37F, 1F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 40, 1, 10, 0F); // Box 45
		bodyModel[29].setRotationPoint(-32F, -17F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[30].setRotationPoint(-32F, -17F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[31].setRotationPoint(-32F, -17F, -7F);

		bodyModel[32].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 48
		bodyModel[32].setRotationPoint(9F, -19F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 49
		bodyModel[33].setRotationPoint(9F, -19F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[34].setRotationPoint(8F, -20F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 135
		bodyModel[35].setRotationPoint(8F, -23F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[36].setRotationPoint(8F, -23F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[37].setRotationPoint(8F, -21F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[38].setRotationPoint(8F, -20F, -11F);

		bodyModel[39].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[39].setRotationPoint(8.5F, -19F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		bodyModel[40].setRotationPoint(8F, -5F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 62
		bodyModel[41].setRotationPoint(20F, -3F, 7F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 17, 18, 0F); // Box 63
		bodyModel[42].setRotationPoint(8F, -22F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 17, 17, 0F); // Box 64
		bodyModel[43].setRotationPoint(19F, -22F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // short hood lamp
		bodyModel[44].setRotationPoint(32.5F, -15F, -1.5F);

		bodyModel[45].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[45].setRotationPoint(19.5F, -19F, 7.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 81
		bodyModel[46].setRotationPoint(-34F, 1F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 83
		bodyModel[47].setRotationPoint(-34F, 1F, 7F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 86
		bodyModel[48].setRotationPoint(34F, 1F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 7, 4, 0F); // Box 89
		bodyModel[49].setRotationPoint(34F, 1F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // long hood lamp
		bodyModel[50].setRotationPoint(-33.5F, -15F, -1.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		bodyModel[51].setRotationPoint(-22.5F, 0F, -11.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		bodyModel[52].setRotationPoint(20.5F, 0F, -11.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 94
		bodyModel[53].setRotationPoint(-30F, -13F, -7.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 95
		bodyModel[54].setRotationPoint(-30F, -13F, 6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[55].setRotationPoint(-33F, -17F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		bodyModel[56].setRotationPoint(-33F, -17F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		bodyModel[57].setRotationPoint(-33F, -17F, 4F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 99
		bodyModel[58].setRotationPoint(-5F, -18F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-5F, -19F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 101
		bodyModel[60].setRotationPoint(-4F, -21F, -3.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 102
		bodyModel[61].setRotationPoint(-34F, -9F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		bodyModel[62].setRotationPoint(6F, -17F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 107
		bodyModel[63].setRotationPoint(-34F, -9F, 11F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 108
		bodyModel[64].setRotationPoint(-34F, -9F, -12F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 111
		bodyModel[65].setRotationPoint(-34F, -9F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1F, 0F, 4.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 116
		bodyModel[66].setRotationPoint(-37F, -9F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 4.25F, -1F, 0F, 4.25F, -1F); // Box 117
		bodyModel[67].setRotationPoint(-37F, -9F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[68].setRotationPoint(-37F, -3F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		bodyModel[69].setRotationPoint(-37F, -3F, 1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 130
		bodyModel[70].setRotationPoint(37F, -9F, 6F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 131
		bodyModel[71].setRotationPoint(37.01F, -9F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 133
		bodyModel[72].setRotationPoint(37F, -3F, 1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 134
		bodyModel[73].setRotationPoint(37F, -9F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[74].setRotationPoint(37F, -3F, -5F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		bodyModel[75].setRotationPoint(-37F, 6F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		bodyModel[76].setRotationPoint(-37F, 3.5F, -9F);
		bodyModel[76].rotateAngleX = 0.26179939F;

		bodyModel[77].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		bodyModel[77].setRotationPoint(-37F, 1F, -8F);
		bodyModel[77].rotateAngleX = 0.26179939F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // NP Bell 1
		bodyModel[78].setRotationPoint(2F, -19.5F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // NP Bell 1
		bodyModel[79].setRotationPoint(2F, -20.5F, -0.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // NP Bell 1
		bodyModel[80].setRotationPoint(2.25F, -19F, -0.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // NP Bell frame cull
		bodyModel[81].setRotationPoint(2F, -20.5F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // NP Bell 1
		bodyModel[82].setRotationPoint(2F, -17.5F, -1F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		bodyModel[83].setRotationPoint(-30F, -15F, -7.25F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		bodyModel[84].setRotationPoint(-30F, -15F, 6.25F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 67
		bodyModel[85].setRotationPoint(11F, -10F, 1F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 70
		bodyModel[86].setRotationPoint(9.5F, -13F, 4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Long hood Ditchlight r
		bodyModel[87].setRotationPoint(-37.5F, -3F, 4.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[88].setRotationPoint(-37F, -3F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[89].setRotationPoint(-37F, -3F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Long hood Ditchlight l
		bodyModel[90].setRotationPoint(-37.5F, -3F, -5.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Short hood ditchlight l
		bodyModel[91].setRotationPoint(38F, -3F, -4.25F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[92].setRotationPoint(37.5F, -3F, -4F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		bodyModel[93].setRotationPoint(37.5F, -3F, 6F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Short hood ditchlight r
		bodyModel[94].setRotationPoint(38F, -3F, 5.75F);
		bodyModel[94].rotateAngleY = -3.14159265F;

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 211
		bodyModel[95].setRotationPoint(-32F, -17.5F, -5.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 212
		bodyModel[96].setRotationPoint(-32F, -17.5F, 3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 commander beacon
		bodyModel[97].setRotationPoint(8.32F, -24F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[98].setRotationPoint(8.5F, -24F, -0.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 215
		bodyModel[99].setRotationPoint(15F, -23.5F, -6.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 216
		bodyModel[100].setRotationPoint(19F, -17F, 11F);

		bodyModel[101].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 217
		bodyModel[101].setRotationPoint(19F, -17F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[102].setRotationPoint(11F, -19F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[103].setRotationPoint(11F, -19F, -12F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 220 atsf stack
		bodyModel[104].setRotationPoint(-4F, -23F, -3.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 221
		bodyModel[105].setRotationPoint(-29F, -18F, -4F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		bodyModel[106].setRotationPoint(-13F, -17.5F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[107].setRotationPoint(-40F, 7F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[108].setRotationPoint(-40F, 7F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[109].setRotationPoint(37F, 7F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[110].setRotationPoint(37F, 7F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		bodyModel[111].setRotationPoint(-37F, 8F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		bodyModel[112].setRotationPoint(-37F, 6F, 10F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		bodyModel[113].setRotationPoint(-37F, 6F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		bodyModel[114].setRotationPoint(-37F, 3.5F, 9F);
		bodyModel[114].rotateAngleX = -0.26179939F;

		bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		bodyModel[115].setRotationPoint(-37F, 3.5F, 7F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		bodyModel[116].setRotationPoint(-37F, 1F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		bodyModel[117].setRotationPoint(-37F, 1F, 8F);
		bodyModel[117].rotateAngleX = -0.26179939F;

		bodyModel[118].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 236
		bodyModel[118].setRotationPoint(34F, 8F, 10F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 237
		bodyModel[119].setRotationPoint(34F, 6F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 238
		bodyModel[120].setRotationPoint(34F, 6F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 239
		bodyModel[121].setRotationPoint(34F, 3.5F, 9F);
		bodyModel[121].rotateAngleX = -0.26179939F;

		bodyModel[122].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 240
		bodyModel[122].setRotationPoint(34F, 3.5F, 7F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 241
		bodyModel[123].setRotationPoint(34F, 1F, 8F);
		bodyModel[123].rotateAngleX = -0.26179939F;

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		bodyModel[124].setRotationPoint(34F, 1F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 243
		bodyModel[125].setRotationPoint(34F, 8F, -12F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 244
		bodyModel[126].setRotationPoint(34F, 6F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 245
		bodyModel[127].setRotationPoint(34F, 6F, -10F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 246
		bodyModel[128].setRotationPoint(34F, 3.5F, -9F);
		bodyModel[128].rotateAngleX = 0.26179939F;

		bodyModel[129].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		bodyModel[129].setRotationPoint(34F, 3.5F, -9F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		bodyModel[130].setRotationPoint(34F, 1F, -8F);
		bodyModel[130].rotateAngleX = 0.26179939F;

		bodyModel[131].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		bodyModel[131].setRotationPoint(34F, 1F, -8F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		bodyModel[132].setRotationPoint(-37.02F, -2.5F, -7F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		bodyModel[133].setRotationPoint(37.02F, -2.5F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[134].setRotationPoint(-35F, -17F, -0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[135].setRotationPoint(-35F, -18F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[136].setRotationPoint(-34.75F, -16.5F, -0.25F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 221
		bodyModel[137].setRotationPoint(-23.5F, 2.5F, -2F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 222
		bodyModel[138].setRotationPoint(19.5F, 2.5F, -2F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 34
		bodyModel[139].setRotationPoint(32F, -8F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[140].setRotationPoint(32F, -8F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[141].setRotationPoint(32F, -8F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[142].setRotationPoint(32F, -9F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		bodyModel[143].setRotationPoint(32F, -9F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[144].setRotationPoint(32F, -9F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[145].setRotationPoint(32F, -9F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 98
		bodyModel[146].setRotationPoint(32F, -9F, 4F);

		bodyModel[147].addBox(0F, 0F, 0F, 12, 7, 14, 0F); // Box 41
		bodyModel[147].setRotationPoint(20F, -8F, -7F);

		bodyModel[148].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 45
		bodyModel[148].setRotationPoint(20F, -9F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[149].setRotationPoint(20F, -9F, 5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[150].setRotationPoint(20F, -9F, -7F);

		bodyModel[151].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 102
		bodyModel[151].setRotationPoint(20F, -9F, -11F);

		bodyModel[152].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 107
		bodyModel[152].setRotationPoint(23F, -9F, 11F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		bodyModel[153].setRotationPoint(21F, -17F, 11F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 108
		bodyModel[154].setRotationPoint(34F, -9F, -12F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 14, 1, 0F); // Box 111
		bodyModel[155].setRotationPoint(34F, -9F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[156].setRotationPoint(7F, -21F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[157].setRotationPoint(7F, -20F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[158].setRotationPoint(7F, -23F, 3F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 135
		bodyModel[159].setRotationPoint(7F, -23F, -3F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[160].setRotationPoint(7F, -23F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[161].setRotationPoint(7F, -21F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[162].setRotationPoint(7F, -20F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		bodyModel[163].setRotationPoint(20F, -21F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[164].setRotationPoint(20F, -20F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[165].setRotationPoint(20F, -23F, 3F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 135
		bodyModel[166].setRotationPoint(20F, -23F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[167].setRotationPoint(20F, -23F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[168].setRotationPoint(20F, -21F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[169].setRotationPoint(20F, -20F, -11F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		bodyModel[170].setRotationPoint(28F, -15F, -7.25F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		bodyModel[171].setRotationPoint(28F, -15F, 6.25F);

		bodyModel[172].addBox(0F, 0F, 0F, 10, 5, 8, 0F); // Box 31
		bodyModel[172].setRotationPoint(-1.5F, 2F, -4F);

		bodyModel[173].addBox(0F, 0F, 0F, 6, 5, 6, 0F); // Box 31
		bodyModel[173].setRotationPoint(0.5F, 2F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 31
		bodyModel[174].setRotationPoint(6.5F, 3.5F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[175].setRotationPoint(-1.5F, 3.5F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 6, 5, 6, 0F); // Box 31
		bodyModel[176].setRotationPoint(0.5F, 2F, 4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 31
		bodyModel[177].setRotationPoint(6.5F, 3.5F, 4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[178].setRotationPoint(-1.5F, 3.5F, 4F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 31
		bodyModel[179].setRotationPoint(3F, 1F, 10.9F);
		bodyModel[179].rotateAngleX = -0.89011792F;

		bodyModel[180].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 31
		bodyModel[180].setRotationPoint(3F, 1.75F, -11.55F);
		bodyModel[180].rotateAngleX = 0.89011792F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[181].setRotationPoint(-34F, -17.95F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 38
		bodyModel[182].setRotationPoint(-35F, -18.25F, -0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 62
		bodyModel[183].setRotationPoint(20F, -5F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.625F, 0F, 0F); // Alaska number board suport cull
		bodyModel[184].setRotationPoint(-29.5F, -18.5F, -6F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Alaska number boards socket
		bodyModel[185].setRotationPoint(-29.5F, -20.5F, -6.25F);
		bodyModel[185].rotateAngleY = 0.26179939F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Alaska number boards socket
		bodyModel[186].setRotationPoint(-30.5F, -20.5F, 2.4F);
		bodyModel[186].rotateAngleY = -0.26179939F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78 lamp socket
		bodyModel[187].setRotationPoint(32.5F, -15.5F, -2F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31
		bodyModel[188].setRotationPoint(20F, -23F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back left lamp
		bodyModel[189].setRotationPoint(20.25F, -23F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back right lamp
		bodyModel[190].setRotationPoint(20.25F, -23F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood left lamp
		bodyModel[191].setRotationPoint(32.75F, -14.5F, -2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood right lamp
		bodyModel[192].setRotationPoint(32.75F, -14.5F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood top lamp
		bodyModel[193].setRotationPoint(32.75F, -15.5F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // short hood bottom lamp
		bodyModel[194].setRotationPoint(32.75F, -13.5F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // long hood lamp socket
		bodyModel[195].setRotationPoint(-33.5F, -15F, -1.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood left lamp
		bodyModel[196].setRotationPoint(-34.25F, -14.5F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood right lamp
		bodyModel[197].setRotationPoint(-34.25F, -14.5F, 0F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood top lamp
		bodyModel[198].setRotationPoint(-34.25F, -15.5F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood bottom lamp
		bodyModel[199].setRotationPoint(-34.25F, -13.5F, -1F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 78 lamp socket
		bodyModel[200].setRotationPoint(32.5F, -14.5F, -2F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 78 lamp socket
		bodyModel[201].setRotationPoint(32.5F, -15.5F, -1F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 78 lamp socket
		bodyModel[202].setRotationPoint(-33.5F, -14.5F, -2F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 78 lamp socket
		bodyModel[203].setRotationPoint(-33.5F, -15.5F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[204].setRotationPoint(-19F, -19F, 0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[205].setRotationPoint(-19F, -20F, 0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[206].setRotationPoint(-18.75F, -18.5F, 0.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Bell frame cul
		bodyModel[207].setRotationPoint(-19F, -20F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // long hood lamp socket
		bodyModel[208].setRotationPoint(-33F, -19.5F, -1.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[209].setRotationPoint(-32F, -20F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood top lamp
		bodyModel[210].setRotationPoint(-33.75F, -20F, -1F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood bottom lamp
		bodyModel[211].setRotationPoint(-33.75F, -18F, -1F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 34
		bodyModel[212].setRotationPoint(32.5F, -8.5F, -1F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[213].setRotationPoint(33F, -8F, -0.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 34
		bodyModel[214].setRotationPoint(34.01F, -9.5F, -2F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 34
		bodyModel[215].setRotationPoint(-33.5F, -8.5F, -1F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[216].setRotationPoint(-34F, -8F, -0.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 34
		bodyModel[217].setRotationPoint(-34.01F, -9.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[218].setRotationPoint(37F, -6F, -5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[219].setRotationPoint(37F, -6F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[220].setRotationPoint(-37F, -6F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[221].setRotationPoint(-37F, -6F, 3F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[222].setRotationPoint(36.5F, -5.5F, -2F);

		bodyModel[223].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Box 31
		bodyModel[223].setRotationPoint(1F, -13F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[224].setRotationPoint(-32F, -15.5F, 7.35F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[225].setRotationPoint(-31.5F, -13.75F, 6.6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[226].setRotationPoint(-32F, -15.5F, -9.35F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markelight glow
		bodyModel[227].setRotationPoint(-32F, -15F, -8.85F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markelight glow
		bodyModel[228].setRotationPoint(-31.5F, -15F, -9.35F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[229].setRotationPoint(-31.5F, -13.75F, -8.7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[230].setRotationPoint(-37.5F, -5.5F, -2F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 99
		bodyModel[231].setRotationPoint(-5F, -23F, -4F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Steam gen exhast 2
		bodyModel[232].setRotationPoint(27F, -18.5F, -4F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Steam gen exhast 2
		bodyModel[233].setRotationPoint(27.5F, -18F, -3.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 31
		bodyModel[234].setRotationPoint(6F, -23F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 2F, 3F, 0F, 2F); // Box 31
		bodyModel[235].setRotationPoint(6F, -16F, 7F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 34
		bodyModel[236].setRotationPoint(32F, -16F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[237].setRotationPoint(32F, -16F, -7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[238].setRotationPoint(32F, -16F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[239].setRotationPoint(32F, -17F, -4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		bodyModel[240].setRotationPoint(32F, -17F, -7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[241].setRotationPoint(32F, -17F, -5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[242].setRotationPoint(32F, -17F, 4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 98
		bodyModel[243].setRotationPoint(32F, -17F, 4F);

		bodyModel[244].addBox(0F, 0F, 0F, 12, 5, 14, 0F); // Box 41
		bodyModel[244].setRotationPoint(20F, -16F, -7F);

		bodyModel[245].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 45
		bodyModel[245].setRotationPoint(20F, -17F, -5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[246].setRotationPoint(20F, -17F, 5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[247].setRotationPoint(20F, -17F, -7F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[248].setRotationPoint(36.5F, -7.5F, -4F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[249].setRotationPoint(36.5F, -7.5F, 3F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[250].setRotationPoint(-37.5F, -7.5F, -4F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[251].setRotationPoint(-37.5F, -7.5F, 3F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[252].setRotationPoint(-37.5F, -4F, -0.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135 MU connection
		bodyModel[253].setRotationPoint(36.5F, -4F, -0.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[254].setRotationPoint(17F, -24F, -5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[255].setRotationPoint(17F, -23F, -5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[256].setRotationPoint(8F, -24F, 5F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[257].setRotationPoint(10F, -23F, 5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[258].setRotationPoint(20.5F, -18.5F, -0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[259].setRotationPoint(20.5F, -17.5F, -0.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 34
		bodyModel[260].setRotationPoint(32F, -11F, -4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[261].setRotationPoint(32F, -11F, -7F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[262].setRotationPoint(32F, -11F, 4F);

		bodyModel[263].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 41
		bodyModel[263].setRotationPoint(20F, -11F, -7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[264].setRotationPoint(32F, -12F, -4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		bodyModel[265].setRotationPoint(32F, -12F, -7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[266].setRotationPoint(32F, -12F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[267].setRotationPoint(32F, -12F, 4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 98
		bodyModel[268].setRotationPoint(32F, -12F, 4F);

		bodyModel[269].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 45
		bodyModel[269].setRotationPoint(20F, -12F, -5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[270].setRotationPoint(20F, -12F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[271].setRotationPoint(20F, -12F, -7F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 7, 3, 0F); // Box 67
		bodyModel[272].setRotationPoint(15F, -14F, 1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[273].setRotationPoint(11F, -14F, 1F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 70
		bodyModel[274].setRotationPoint(9F, -11F, 4F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		bodyModel[275].setRotationPoint(6.5F, -3F, -11F);

		bodyModel[276].addBox(0F, 0F, 0F, 0, 5, 12, 0F); // Box 5
		bodyModel[276].setRotationPoint(-37.01F, -9F, -6F);

		bodyModel[277].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[277].setRotationPoint(5F, -22F, -0.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[278].setRotationPoint(6F, -19F, -11.01F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,1.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 105
		bodyModel[279].setRotationPoint(21F, -19F, 11.01F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F); // Box 105
		bodyModel[280].setRotationPoint(21F, -10F, 11.01F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1.25F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.25F, -1F, 0F); // Box 105
		bodyModel[281].setRotationPoint(6F, -10F, -11.01F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 74, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 18
		bodyModel[282].setRotationPoint(-37F, 2.5F, -5.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Underframe support cull
		bodyModel[283].setRotationPoint(-10.5F, 2F, -4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[284].setRotationPoint(-22.5F, 2F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[285].setRotationPoint(-22.5F, 2F, 5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[286].setRotationPoint(20.5F, 2F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[287].setRotationPoint(20.5F, 2F, 5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 16, 0, 16, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -8F, 0F, 0F, -8F); // Box 221
		bodyModel[288].setRotationPoint(-29F, -18.01F, -4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markelight glow
		bodyModel[289].setRotationPoint(-32F, -15F, 7.85F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Markelight glow
		bodyModel[290].setRotationPoint(-31.5F, -15F, 7.35F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[291].setRotationPoint(8F, -23F, 3F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[292].setRotationPoint(8F, -21F, 7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[293].setRotationPoint(19F, -21F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[294].setRotationPoint(8F, -21F, -10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[295].setRotationPoint(19F, -21F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[296].setRotationPoint(8F, -21F, 7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[297].setRotationPoint(19F, -22F, -7F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[298].setRotationPoint(8F, -22F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[299].setRotationPoint(19F, -22F, 3F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[300].setRotationPoint(8F, -22F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[301].setRotationPoint(11F, -17F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[302].setRotationPoint(11F, -18F, 10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[303].setRotationPoint(11F, -18F, -13F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[304].setRotationPoint(11F, -17F, -15F);

		bodyModel[305].addBox(0F, 0F, 0F, 10, 5, 0, 0F); // Box 31
		bodyModel[305].setRotationPoint(-1.5F, 2F, 10.01F);

		bodyModel[306].addBox(0F, 0F, 0F, 10, 5, 0, 0F); // Box 31
		bodyModel[306].setRotationPoint(-1.5F, 2F, -10.01F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[307].setRotationPoint(11.5F, -9.5F, 4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[308].setRotationPoint(11F, -15F, 2.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 67
		bodyModel[309].setRotationPoint(11F, -15F, 1.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Alaska short hood top lamp
		bodyModel[310].setRotationPoint(20F, -23F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Alaska short hood bottom lamp
		bodyModel[311].setRotationPoint(20F, -21F, -1F);

		bodyModel[312].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Alaska lamp socket
		bodyModel[312].setRotationPoint(19.75F, -23F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood bottom lamp
		bodyModel[313].setRotationPoint(-33.75F, -19F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // long hood top lamp
		bodyModel[314].setRotationPoint(-33.75F, -19F, -2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[315].setRotationPoint(37F, 8F, -2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[316].setRotationPoint(-39F, 8F, -2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[317].setRotationPoint(-39F, 6F, -8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[318].setRotationPoint(-39F, 6F, 0F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[319].setRotationPoint(37F, 6F, 0F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[320].setRotationPoint(37F, 6F, -8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		bodyModel[321].setRotationPoint(39F, 6F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[322].setRotationPoint(39F, 7F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 446
		bodyModel[323].setRotationPoint(39.5F, 4F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 4
		bodyModel[324].setRotationPoint(39F, 6F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 4
		bodyModel[325].setRotationPoint(39F, 7F, 0F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 446
		bodyModel[326].setRotationPoint(39.5F, 4F, 2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 448
		bodyModel[327].setRotationPoint(39F, 3F, 2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[328].setRotationPoint(39F, 3F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 361
		bodyModel[329].setRotationPoint(39.5F, 3F, 2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.5F, -4F, 0F, -1F, -4F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[330].setRotationPoint(39.5F, -1F, 2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 361
		bodyModel[331].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1.5F, 0F, 0F, -2F, 0F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[332].setRotationPoint(39.5F, -1F, -10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[333].setRotationPoint(-40F, 6F, -10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[334].setRotationPoint(-40F, 7F, -10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[335].setRotationPoint(-40.5F, 4F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[336].setRotationPoint(-40F, 6F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[337].setRotationPoint(-40F, 7F, 0F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 446
		bodyModel[338].setRotationPoint(-40.5F, 4F, 2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[339].setRotationPoint(-40F, 3F, 2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 448
		bodyModel[340].setRotationPoint(-40F, 3F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361
		bodyModel[341].setRotationPoint(-40.5F, 3F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-1F, -4F, 0F, 0.5F, -4F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[342].setRotationPoint(-40.5F, -1F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361
		bodyModel[343].setRotationPoint(-40.5F, 3F, -10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -4F, 0F, -1F, -4F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 361 big fuck off plow
		bodyModel[344].setRotationPoint(-40.5F, -1F, -10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[345].setRotationPoint(-40F, 6F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[346].setRotationPoint(-40F, 6F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 24
		bodyModel[347].setRotationPoint(39F, 6F, 0F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[348].setRotationPoint(39F, 6F, -10F);

		bodyModel[349].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[349].setRotationPoint(5.75F, -25F, -1F);

		bodyModel[350].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[350].setRotationPoint(5.55F, -25F, 0F);

		bodyModel[351].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[351].setRotationPoint(5.9F, -24F, -1.5F);

		bodyModel[352].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[352].setRotationPoint(5.75F, -24F, 0.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 331 M5
		bodyModel[353].setRotationPoint(5F, -24F, -0.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[354].setRotationPoint(20.25F, -25F, 0F);

		bodyModel[355].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[355].setRotationPoint(20.45F, -25F, -1F);

		bodyModel[356].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[356].setRotationPoint(20.1F, -24F, 0.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331 M5
		bodyModel[357].setRotationPoint(20.25F, -24F, -1.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 331 M5
		bodyModel[358].setRotationPoint(20F, -24F, -0.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 220 fucking frisco stack
		bodyModel[359].setRotationPoint(-4F, -26F, -3.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[360].setRotationPoint(13F, -24F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[361].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[362].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[363].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[364].setRotationPoint(13F, -24.5F, -1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Steam gen exhast 1
		bodyModel[365].setRotationPoint(20F, -23F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Alaska number boards glow
		bodyModel[366].setRotationPoint(-29.51F, -20.5F, -6.25F);
		bodyModel[366].rotateAngleY = 0.26179939F;

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Alaska number boards glow
		bodyModel[367].setRotationPoint(-30.51F, -20.5F, 2.4F);
		bodyModel[367].rotateAngleY = -0.26179939F;

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[368].setRotationPoint(13F, -23.5F, 7.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[369].setRotationPoint(13F, -23.5F, 7.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[370].setRotationPoint(13F, -23.5F, 7.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[371].setRotationPoint(13F, -23.5F, 7.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[372].setRotationPoint(12.5F, -22F, 7F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[373].setRotationPoint(13F, -23F, 7.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform atsf
		bodyModel[374].setRotationPoint(13.9F, -24.5F, -2.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[375].setRotationPoint(14.9F, -25.5F, 0F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 185
		bodyModel[376].setRotationPoint(-33.75F, -11.5F, -2F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247  fncc gyra front
		bodyModel[377].setRotationPoint(-34.35F, -11.45F, -2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 fncc gyra front
		bodyModel[378].setRotationPoint(-34.35F, -11.45F, 0F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 185
		bodyModel[379].setRotationPoint(32.75F, -11.5F, -2F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247  fncc gyra rear
		bodyModel[380].setRotationPoint(33.35F, -11.45F, -2F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 fncc gyra rear
		bodyModel[381].setRotationPoint(33.35F, -11.45F, 0F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 tidewater cab gyra
		bodyModel[382].setRotationPoint(11.9F, -26F, -1F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 400 tidewater cab grya box
		bodyModel[383].setRotationPoint(12F, -26F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438 tidewader cab gyra CULL
		bodyModel[384].setRotationPoint(12.5F, -25F, -1.5F);
	}
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 3426||GetColor(entity) == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324||GetColor(entity) == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver_Fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6323){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black_Fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.7, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}