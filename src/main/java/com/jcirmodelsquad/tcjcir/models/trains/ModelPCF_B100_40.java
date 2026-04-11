//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.03.2024 - 20:16:56
// Last changed on: 01.03.2024 - 20:16:56

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPCF_B100_40 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPCF_B100_40() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[237];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 3, 146, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 106, 87, textureX, textureY); // Sides01
		bodyModel[2] = new ModelRendererTurbo(this, 2, 87, textureX, textureY); // Sides01
		bodyModel[3] = new ModelRendererTurbo(this, 27, 129, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 86, 121, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 10, 49, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 167, 61, textureX, textureY); // Box 50
		bodyModel[7] = new ModelRendererTurbo(this, 211, 61, textureX, textureY); // Box 50
		bodyModel[8] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[10] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[11] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[12] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[13] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[14] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[15] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 27, 138, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 27, 132, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[20] = new ModelRendererTurbo(this, 198, 42, textureX, textureY, "cull"); // Stirrup cull
		bodyModel[21] = new ModelRendererTurbo(this, 27, 135, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 59
		bodyModel[23] = new ModelRendererTurbo(this, 320, 116, textureX, textureY); // Box 60
		bodyModel[24] = new ModelRendererTurbo(this, 347, 123, textureX, textureY); // Box 61
		bodyModel[25] = new ModelRendererTurbo(this, 307, 109, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 320, 102, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 347, 109, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 307, 95, textureX, textureY); // Box 59
		bodyModel[29] = new ModelRendererTurbo(this, 320, 88, textureX, textureY); // Box 60
		bodyModel[30] = new ModelRendererTurbo(this, 347, 95, textureX, textureY); // Box 61
		bodyModel[31] = new ModelRendererTurbo(this, 307, 81, textureX, textureY); // Box 59
		bodyModel[32] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 60
		bodyModel[33] = new ModelRendererTurbo(this, 347, 81, textureX, textureY); // Box 61
		bodyModel[34] = new ModelRendererTurbo(this, 307, 67, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 320, 60, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 347, 67, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 307, 53, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 320, 46, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 347, 53, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 308, 39, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 320, 32, textureX, textureY); // Box 60
		bodyModel[42] = new ModelRendererTurbo(this, 347, 39, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 255, 25, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 267, 18, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 294, 25, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 294, 123, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 267, 116, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 254, 123, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 294, 109, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 267, 102, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 254, 109, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 294, 95, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 267, 88, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 254, 95, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 294, 81, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 267, 74, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 254, 67, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 294, 67, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 267, 60, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 254, 81, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 294, 53, textureX, textureY); // Box 59
		bodyModel[62] = new ModelRendererTurbo(this, 267, 46, textureX, textureY); // Box 60
		bodyModel[63] = new ModelRendererTurbo(this, 254, 53, textureX, textureY); // Box 61
		bodyModel[64] = new ModelRendererTurbo(this, 294, 39, textureX, textureY); // Box 59
		bodyModel[65] = new ModelRendererTurbo(this, 267, 32, textureX, textureY); // Box 60
		bodyModel[66] = new ModelRendererTurbo(this, 254, 39, textureX, textureY); // Box 61
		bodyModel[67] = new ModelRendererTurbo(this, 347, 25, textureX, textureY); // Box 59
		bodyModel[68] = new ModelRendererTurbo(this, 320, 18, textureX, textureY); // Box 60
		bodyModel[69] = new ModelRendererTurbo(this, 308, 25, textureX, textureY); // Box 61
		bodyModel[70] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Roof slopes02
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Roof slopes03
		bodyModel[72] = new ModelRendererTurbo(this, 214, 40, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[73] = new ModelRendererTurbo(this, 207, 48, textureX, textureY); // Box 214
		bodyModel[74] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 215
		bodyModel[75] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 216
		bodyModel[76] = new ModelRendererTurbo(this, 227, 40, textureX, textureY, "cull"); // Box 209 cull cutbar holder
		bodyModel[77] = new ModelRendererTurbo(this, 197, 48, textureX, textureY); // Box 210
		bodyModel[78] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 212
		bodyModel[80] = new ModelRendererTurbo(this, 215, 28, textureX, textureY); // Box 72
		bodyModel[81] = new ModelRendererTurbo(this, 225, 27, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 226, 30, textureX, textureY); // Box 132
		bodyModel[84] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 140
		bodyModel[85] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[87] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[88] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[90] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[91] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[92] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 140
		bodyModel[93] = new ModelRendererTurbo(this, 125, 183, textureX, textureY); // Box 286
		bodyModel[94] = new ModelRendererTurbo(this, 115, 183, textureX, textureY); // Box 287
		bodyModel[95] = new ModelRendererTurbo(this, 119, 178, textureX, textureY); // Box 302
		bodyModel[96] = new ModelRendererTurbo(this, 100, 184, textureX, textureY); // Box 317
		bodyModel[97] = new ModelRendererTurbo(this, 98, 178, textureX, textureY); // Box 318
		bodyModel[98] = new ModelRendererTurbo(this, 58, 184, textureX, textureY); // Box 118
		bodyModel[99] = new ModelRendererTurbo(this, 71, 184, textureX, textureY); // Box 119
		bodyModel[100] = new ModelRendererTurbo(this, 57, 178, textureX, textureY); // Box 129
		bodyModel[101] = new ModelRendererTurbo(this, 28, 193, textureX, textureY); // Box 196
		bodyModel[102] = new ModelRendererTurbo(this, 30, 187, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[103] = new ModelRendererTurbo(this, 2, 205, textureX, textureY); // Box 125
		bodyModel[104] = new ModelRendererTurbo(this, 2, 178, textureX, textureY); // Box 124
		bodyModel[105] = new ModelRendererTurbo(this, 162, 165, textureX, textureY); // Box 124
		bodyModel[106] = new ModelRendererTurbo(this, 2, 189, textureX, textureY); // Box 140
		bodyModel[107] = new ModelRendererTurbo(this, 36, 177, textureX, textureY); // Box 140
		bodyModel[108] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 4, 141, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 2, 189, textureX, textureY); // Box 140
		bodyModel[111] = new ModelRendererTurbo(this, 2, 189, textureX, textureY); // Box 140
		bodyModel[112] = new ModelRendererTurbo(this, 2, 189, textureX, textureY); // Box 140
		bodyModel[113] = new ModelRendererTurbo(this, 307, 160, textureX, textureY); // Box 88
		bodyModel[114] = new ModelRendererTurbo(this, 312, 160, textureX, textureY); // Box 89
		bodyModel[115] = new ModelRendererTurbo(this, 317, 160, textureX, textureY); // Box 90
		bodyModel[116] = new ModelRendererTurbo(this, 322, 160, textureX, textureY); // Box 91
		bodyModel[117] = new ModelRendererTurbo(this, 327, 160, textureX, textureY); // Box 92
		bodyModel[118] = new ModelRendererTurbo(this, 287, 160, textureX, textureY); // Box 93
		bodyModel[119] = new ModelRendererTurbo(this, 272, 160, textureX, textureY); // Box 95
		bodyModel[120] = new ModelRendererTurbo(this, 277, 160, textureX, textureY); // Box 96
		bodyModel[121] = new ModelRendererTurbo(this, 282, 160, textureX, textureY); // Box 97
		bodyModel[122] = new ModelRendererTurbo(this, 302, 160, textureX, textureY); // Box 94
		bodyModel[123] = new ModelRendererTurbo(this, 292, 160, textureX, textureY); // Box 94
		bodyModel[124] = new ModelRendererTurbo(this, 297, 160, textureX, textureY); // Box 94
		bodyModel[125] = new ModelRendererTurbo(this, 267, 160, textureX, textureY); // Box 95
		bodyModel[126] = new ModelRendererTurbo(this, 332, 160, textureX, textureY); // Box 92
		bodyModel[127] = new ModelRendererTurbo(this, 86, 118, textureX, textureY); // Box 6
		bodyModel[128] = new ModelRendererTurbo(this, 62, 113, textureX, textureY); // Box 6
		bodyModel[129] = new ModelRendererTurbo(this, 62, 87, textureX, textureY); // Box 6
		bodyModel[130] = new ModelRendererTurbo(this, 197, 160, textureX, textureY); // Box 179 door right
		bodyModel[131] = new ModelRendererTurbo(this, 238, 137, textureX, textureY); // Box 174 door right
		bodyModel[132] = new ModelRendererTurbo(this, 190, 137, textureX, textureY); // Box 175 door right
		bodyModel[133] = new ModelRendererTurbo(this, 219, 149, textureX, textureY); // Box 178 door right
		bodyModel[134] = new ModelRendererTurbo(this, 196, 143, textureX, textureY); // Box 179 door right
		bodyModel[135] = new ModelRendererTurbo(this, 196, 146, textureX, textureY); // Box 180 door right
		bodyModel[136] = new ModelRendererTurbo(this, 208, 151, textureX, textureY); // Box 181 door right
		bodyModel[137] = new ModelRendererTurbo(this, 196, 149, textureX, textureY); // Box 182 door right
		bodyModel[138] = new ModelRendererTurbo(this, 246, 137, textureX, textureY); // Box 183 door right
		bodyModel[139] = new ModelRendererTurbo(this, 243, 137, textureX, textureY); // Box 184 door right
		bodyModel[140] = new ModelRendererTurbo(this, 196, 140, textureX, textureY); // Box 179 door right
		bodyModel[141] = new ModelRendererTurbo(this, 196, 137, textureX, textureY); // Box 179 door right
		bodyModel[142] = new ModelRendererTurbo(this, 197, 158, textureX, textureY); // Box 179 door right
		bodyModel[143] = new ModelRendererTurbo(this, 197, 125, textureX, textureY); // Box 185 door right handle
		bodyModel[144] = new ModelRendererTurbo(this, 191, 7, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[145] = new ModelRendererTurbo(this, 216, 7, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[146] = new ModelRendererTurbo(this, 360, 102, textureX, textureY, "cull"); // Box 57 cull
		bodyModel[147] = new ModelRendererTurbo(this, -7, 27, textureX, textureY); // Box 16
		bodyModel[148] = new ModelRendererTurbo(this, 2, 55, textureX, textureY); // Sides01
		bodyModel[149] = new ModelRendererTurbo(this, 105, 55, textureX, textureY); // Sides01
		bodyModel[150] = new ModelRendererTurbo(this, 2, 121, textureX, textureY); // Box 6
		bodyModel[151] = new ModelRendererTurbo(this, 10, 52, textureX, textureY); // Box 6
		bodyModel[152] = new ModelRendererTurbo(this, 292, 132, textureX, textureY); // Box 88
		bodyModel[153] = new ModelRendererTurbo(this, 287, 132, textureX, textureY); // Box 89
		bodyModel[154] = new ModelRendererTurbo(this, 282, 132, textureX, textureY); // Box 90
		bodyModel[155] = new ModelRendererTurbo(this, 277, 132, textureX, textureY); // Box 91
		bodyModel[156] = new ModelRendererTurbo(this, 272, 132, textureX, textureY); // Box 92
		bodyModel[157] = new ModelRendererTurbo(this, 312, 132, textureX, textureY); // Box 93
		bodyModel[158] = new ModelRendererTurbo(this, 327, 132, textureX, textureY); // Box 95
		bodyModel[159] = new ModelRendererTurbo(this, 322, 132, textureX, textureY); // Box 96
		bodyModel[160] = new ModelRendererTurbo(this, 317, 132, textureX, textureY); // Box 97
		bodyModel[161] = new ModelRendererTurbo(this, 297, 132, textureX, textureY); // Box 94
		bodyModel[162] = new ModelRendererTurbo(this, 307, 132, textureX, textureY); // Box 94
		bodyModel[163] = new ModelRendererTurbo(this, 302, 132, textureX, textureY); // Box 94
		bodyModel[164] = new ModelRendererTurbo(this, 332, 132, textureX, textureY); // Box 95
		bodyModel[165] = new ModelRendererTurbo(this, 267, 132, textureX, textureY); // Box 92
		bodyModel[166] = new ModelRendererTurbo(this, 2, 118, textureX, textureY); // Box 6
		bodyModel[167] = new ModelRendererTurbo(this, 61, 55, textureX, textureY); // Box 6
		bodyModel[168] = new ModelRendererTurbo(this, 195, 134, textureX, textureY); // Box 179 door right
		bodyModel[169] = new ModelRendererTurbo(this, 238, 111, textureX, textureY); // Box 174 door right
		bodyModel[170] = new ModelRendererTurbo(this, 190, 111, textureX, textureY); // Box 175 door right
		bodyModel[171] = new ModelRendererTurbo(this, 219, 122, textureX, textureY); // Box 178 door right
		bodyModel[172] = new ModelRendererTurbo(this, 196, 117, textureX, textureY); // Box 179 door right
		bodyModel[173] = new ModelRendererTurbo(this, 196, 120, textureX, textureY); // Box 180 door right
		bodyModel[174] = new ModelRendererTurbo(this, 208, 125, textureX, textureY); // Box 181 door right
		bodyModel[175] = new ModelRendererTurbo(this, 195, 123, textureX, textureY); // Box 182 door right
		bodyModel[176] = new ModelRendererTurbo(this, 243, 110, textureX, textureY); // Box 183 door right
		bodyModel[177] = new ModelRendererTurbo(this, 246, 110, textureX, textureY); // Box 184 door right
		bodyModel[178] = new ModelRendererTurbo(this, 196, 114, textureX, textureY); // Box 179 door right
		bodyModel[179] = new ModelRendererTurbo(this, 196, 111, textureX, textureY); // Box 179 door right
		bodyModel[180] = new ModelRendererTurbo(this, 195, 132, textureX, textureY); // Box 179 door right
		bodyModel[181] = new ModelRendererTurbo(this, 61, 81, textureX, textureY); // Box 6
		bodyModel[182] = new ModelRendererTurbo(this, 30, 187, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[183] = new ModelRendererTurbo(this, 1, 211, textureX, textureY, "cull"); // Box 192 cull
		bodyModel[184] = new ModelRendererTurbo(this, 197, 151, textureX, textureY); // Box 185 door right handle
		bodyModel[185] = new ModelRendererTurbo(this, 191, 19, textureX, textureY, "lamp"); // amtrak EOT light
		bodyModel[186] = new ModelRendererTurbo(this, 196, 19, textureX, textureY, "lamp"); // amtrak EOT light
		bodyModel[187] = new ModelRendererTurbo(this, 191, 22, textureX, textureY, "cull"); // amtrak EOT and bracket cull
		bodyModel[188] = new ModelRendererTurbo(this, 196, 22, textureX, textureY, "cull"); // amtrak EOT and bracket cull
		bodyModel[189] = new ModelRendererTurbo(this, 336, 104, textureX, textureY); // Box 189
		bodyModel[190] = new ModelRendererTurbo(this, 316, 105, textureX, textureY); // Box 189
		bodyModel[191] = new ModelRendererTurbo(this, 335, 91, textureX, textureY); // Box 189
		bodyModel[192] = new ModelRendererTurbo(this, 316, 91, textureX, textureY); // Box 189
		bodyModel[193] = new ModelRendererTurbo(this, 336, 77, textureX, textureY); // Box 189
		bodyModel[194] = new ModelRendererTurbo(this, 316, 76, textureX, textureY); // Box 189
		bodyModel[195] = new ModelRendererTurbo(this, 336, 63, textureX, textureY); // Box 189
		bodyModel[196] = new ModelRendererTurbo(this, 316, 63, textureX, textureY); // Box 189
		bodyModel[197] = new ModelRendererTurbo(this, 336, 49, textureX, textureY); // Box 189
		bodyModel[198] = new ModelRendererTurbo(this, 317, 48, textureX, textureY); // Box 189
		bodyModel[199] = new ModelRendererTurbo(this, 337, 35, textureX, textureY); // Box 189
		bodyModel[200] = new ModelRendererTurbo(this, 316, 35, textureX, textureY); // Box 189
		bodyModel[201] = new ModelRendererTurbo(this, 263, 105, textureX, textureY); // Box 189
		bodyModel[202] = new ModelRendererTurbo(this, 286, 105, textureX, textureY); // Box 189
		bodyModel[203] = new ModelRendererTurbo(this, 263, 90, textureX, textureY); // Box 189
		bodyModel[204] = new ModelRendererTurbo(this, 284, 90, textureX, textureY); // Box 189
		bodyModel[205] = new ModelRendererTurbo(this, 263, 76, textureX, textureY); // Box 189
		bodyModel[206] = new ModelRendererTurbo(this, 283, 76, textureX, textureY); // Box 189
		bodyModel[207] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 189
		bodyModel[208] = new ModelRendererTurbo(this, 283, 62, textureX, textureY); // Box 189
		bodyModel[209] = new ModelRendererTurbo(this, 263, 46, textureX, textureY); // Box 189
		bodyModel[210] = new ModelRendererTurbo(this, 284, 47, textureX, textureY); // Box 189
		bodyModel[211] = new ModelRendererTurbo(this, 263, 35, textureX, textureY); // Box 189
		bodyModel[212] = new ModelRendererTurbo(this, 284, 35, textureX, textureY); // Box 189
		bodyModel[213] = new ModelRendererTurbo(this, 307, 185, textureX, textureY); // Box 88
		bodyModel[214] = new ModelRendererTurbo(this, 312, 185, textureX, textureY); // Box 89
		bodyModel[215] = new ModelRendererTurbo(this, 317, 185, textureX, textureY); // Box 90
		bodyModel[216] = new ModelRendererTurbo(this, 322, 185, textureX, textureY); // Box 91
		bodyModel[217] = new ModelRendererTurbo(this, 327, 185, textureX, textureY); // Box 92
		bodyModel[218] = new ModelRendererTurbo(this, 287, 185, textureX, textureY); // Box 93
		bodyModel[219] = new ModelRendererTurbo(this, 272, 185, textureX, textureY); // Box 95
		bodyModel[220] = new ModelRendererTurbo(this, 277, 185, textureX, textureY); // Box 96
		bodyModel[221] = new ModelRendererTurbo(this, 282, 185, textureX, textureY); // Box 97
		bodyModel[222] = new ModelRendererTurbo(this, 302, 185, textureX, textureY); // Box 94
		bodyModel[223] = new ModelRendererTurbo(this, 292, 185, textureX, textureY); // Box 94
		bodyModel[224] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 94
		bodyModel[225] = new ModelRendererTurbo(this, 292, 157, textureX, textureY); // Box 88
		bodyModel[226] = new ModelRendererTurbo(this, 287, 157, textureX, textureY); // Box 89
		bodyModel[227] = new ModelRendererTurbo(this, 282, 157, textureX, textureY); // Box 90
		bodyModel[228] = new ModelRendererTurbo(this, 277, 157, textureX, textureY); // Box 91
		bodyModel[229] = new ModelRendererTurbo(this, 272, 157, textureX, textureY); // Box 92
		bodyModel[230] = new ModelRendererTurbo(this, 312, 157, textureX, textureY); // Box 93
		bodyModel[231] = new ModelRendererTurbo(this, 327, 157, textureX, textureY); // Box 95
		bodyModel[232] = new ModelRendererTurbo(this, 322, 157, textureX, textureY); // Box 96
		bodyModel[233] = new ModelRendererTurbo(this, 317, 157, textureX, textureY); // Box 97
		bodyModel[234] = new ModelRendererTurbo(this, 297, 157, textureX, textureY); // Box 94
		bodyModel[235] = new ModelRendererTurbo(this, 307, 157, textureX, textureY); // Box 94
		bodyModel[236] = new ModelRendererTurbo(this, 302, 157, textureX, textureY); // Box 94

		bodyModel[0].addBox(0F, 0F, 0F, 77, 1, 19, 0F); // Box 16
		bodyModel[0].setRotationPoint(-38.5F, 2F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 28, 24, 1, 0F); // Sides01
		bodyModel[1].setRotationPoint(-38.5F, -21F, 9.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 24, 1, 0F); // Sides01
		bodyModel[2].setRotationPoint(10.5F, -21F, 9.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(-39.5F, 3F, 9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[4].setRotationPoint(-30F, 2.5F, 11F);

		bodyModel[5].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-39.5F, -21.5F, 10.01F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 50
		bodyModel[6].setRotationPoint(38.5F, -22F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 25, 20, 0F); // Box 50
		bodyModel[7].setRotationPoint(-39.5F, -22F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 86, 2, 5, 0F); // Box 52
		bodyModel[8].setRotationPoint(-43F, 3F, -2.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[9].setRotationPoint(-38.5F, 4F, 9.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[10].setRotationPoint(35.5F, 4F, 9.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 57
		bodyModel[11].setRotationPoint(-39.5F, 3F, -9.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 57
		bodyModel[12].setRotationPoint(-39.5F, 3F, 8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 57
		bodyModel[13].setRotationPoint(38.5F, 3F, -9.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 57
		bodyModel[14].setRotationPoint(38.5F, 3F, 8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[15].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[16].setRotationPoint(43F, 3F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 59, 1, 1, 0F); // Box 6
		bodyModel[17].setRotationPoint(-29.5F, 4F, 9.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[18].setRotationPoint(-39.5F, 3F, -10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[19].setRotationPoint(-38.5F, 4F, -10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[20].setRotationPoint(35.5F, 4F, -10.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 59, 1, 1, 0F); // Box 6
		bodyModel[21].setRotationPoint(-29.5F, 4F, -10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[22].setRotationPoint(39.5F, 0.25F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[23].setRotationPoint(39.5F, 0.25F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[24].setRotationPoint(39.5F, 0.25F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[25].setRotationPoint(39.5F, -2.25F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[26].setRotationPoint(39.5F, -2.25F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[27].setRotationPoint(39.5F, -2.25F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[28].setRotationPoint(39.5F, -4.75F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[29].setRotationPoint(39.5F, -4.75F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[30].setRotationPoint(39.5F, -4.75F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[31].setRotationPoint(39.5F, -7.25F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[32].setRotationPoint(39.5F, -7.25F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[33].setRotationPoint(39.5F, -7.25F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[34].setRotationPoint(39.5F, -12F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[35].setRotationPoint(39.5F, -12F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[36].setRotationPoint(39.5F, -12F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[37].setRotationPoint(39.5F, -14.5F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[38].setRotationPoint(39.5F, -14.5F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[39].setRotationPoint(39.5F, -14.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[40].setRotationPoint(39.5F, -17F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[41].setRotationPoint(39.5F, -17F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[42].setRotationPoint(39.5F, -17F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[43].setRotationPoint(39.5F, -19.5F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[44].setRotationPoint(39.5F, -19.5F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[45].setRotationPoint(39.5F, -19.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[46].setRotationPoint(-40.5F, 1.25F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[47].setRotationPoint(-40.5F, 1.25F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[48].setRotationPoint(-40.5F, 1.25F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[49].setRotationPoint(-40.5F, -1.25F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[50].setRotationPoint(-40.5F, -1.25F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[51].setRotationPoint(-40.5F, -1.25F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[52].setRotationPoint(-40.5F, -3.75F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[53].setRotationPoint(-40.5F, -3.75F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[54].setRotationPoint(-40.5F, -3.75F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[55].setRotationPoint(-40.5F, -6.25F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[56].setRotationPoint(-40.5F, -6.25F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[57].setRotationPoint(-40.5F, -6.25F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[58].setRotationPoint(-40.5F, -11F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[59].setRotationPoint(-40.5F, -11F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[60].setRotationPoint(-40.5F, -11F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[61].setRotationPoint(-40.5F, -13.5F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[62].setRotationPoint(-40.5F, -13.5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[63].setRotationPoint(-40.5F, -13.5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[64].setRotationPoint(-40.5F, -16F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[65].setRotationPoint(-40.5F, -16F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[66].setRotationPoint(-40.5F, -16F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[67].setRotationPoint(-40.5F, -18.5F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[68].setRotationPoint(-40.5F, -18.5F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[69].setRotationPoint(-40.5F, -18.5F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 79, 1, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Roof slopes02
		bodyModel[70].setRotationPoint(-39.5F, -23F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 79, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Roof slopes03
		bodyModel[71].setRotationPoint(-39.5F, -23F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[72].setRotationPoint(39.51F, 3F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 214
		bodyModel[73].setRotationPoint(40.5F, 4.5F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[74].setRotationPoint(40.5F, 4.5F, -10F);

		bodyModel[75].addBox(-9F, 0F, 0F, 9, 1, 0, 0F); // Box 216
		bodyModel[75].setRotationPoint(45F, 4.5F, -0.5F);
		bodyModel[75].rotateAngleY = 1.04719755F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[76].setRotationPoint(-40.51F, 3.5F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 210
		bodyModel[77].setRotationPoint(-40.5F, 5F, 5F);

		bodyModel[78].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[78].setRotationPoint(-45F, 5F, 0.5F);
		bodyModel[78].rotateAngleY = 1.04719755F;

		bodyModel[79].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 212
		bodyModel[79].setRotationPoint(-40.5F, 5F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[80].setRotationPoint(-41.25F, -5F, 2F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[81].setRotationPoint(-41.25F, -3.5F, 3.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[82].setRotationPoint(-40.49F, -5F, 2.5F);

		bodyModel[83].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[83].setRotationPoint(-40.99F, -2.5F, 4F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 140
		bodyModel[84].setRotationPoint(-1F, 6F, -1F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[85].setRotationPoint(-9F, 3F, -9.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[86].setRotationPoint(8F, 3F, -9.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[87].setRotationPoint(-9F, 3F, 2.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[88].setRotationPoint(8F, 3F, 2.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[89].setRotationPoint(19F, 3F, -9.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[90].setRotationPoint(19F, 3F, 2.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[91].setRotationPoint(-20F, 3F, -9.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[92].setRotationPoint(-20F, 3F, 2.5F);

		bodyModel[93].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[93].setRotationPoint(-8F, 4.5F, -7.5F);
		bodyModel[93].rotateAngleX = -0.78539816F;

		bodyModel[94].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[94].setRotationPoint(-6F, 4.5F, -7.5F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302
		bodyModel[95].setRotationPoint(-7F, 3F, -8.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[96].setRotationPoint(-16.5F, 6F, -9.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[97].setRotationPoint(-17.5F, 4F, -9.5F);

		bodyModel[98].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[98].setRotationPoint(13F, 5F, 4F);
		bodyModel[98].rotateAngleX = -0.78539816F;

		bodyModel[99].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[99].setRotationPoint(11F, 5F, 4F);
		bodyModel[99].rotateAngleX = -0.78539816F;

		bodyModel[100].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[100].setRotationPoint(12.5F, 3F, 3F);

		bodyModel[101].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[101].setRotationPoint(4.5F, 5.51F, 0F);
		bodyModel[101].rotateAngleY = -0.05235988F;

		bodyModel[102].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126 cull
		bodyModel[102].setRotationPoint(3F, 4.75F, -2.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 53, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[103].setRotationPoint(-41F, 3.5F, 4F);
		bodyModel[103].rotateAngleZ = -0.01745329F;

		bodyModel[104].addBox(-0.5F, 0F, 0F, 1, 0, 23, 0F); // Box 124
		bodyModel[104].setRotationPoint(4F, 5.51F, 0.5F);
		bodyModel[104].rotateAngleY = -1.57079633F;

		bodyModel[105].addBox(-0.5F, 0F, 0F, 1, 0, 34, 0F); // Box 124
		bodyModel[105].setRotationPoint(-29.5F, 5.51F, -3.5F);
		bodyModel[105].rotateAngleY = -1.57079633F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[106].setRotationPoint(19F, 5F, -4.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[107].setRotationPoint(-2F, 5F, -2.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[108].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[109].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[110].setRotationPoint(8F, 5F, -4.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[111].setRotationPoint(-9F, 5F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[112].setRotationPoint(-20F, 5F, -4.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 88
		bodyModel[113].setRotationPoint(-15.5F, -21F, 9.99F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 89
		bodyModel[114].setRotationPoint(-20.5F, -21F, 9.99F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 90
		bodyModel[115].setRotationPoint(-25.5F, -21F, 9.99F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 91
		bodyModel[116].setRotationPoint(-30.5F, -21F, 9.99F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 92
		bodyModel[117].setRotationPoint(-35.5F, -21F, 9.99F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 93
		bodyModel[118].setRotationPoint(19.5F, -21F, 9.99F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 95
		bodyModel[119].setRotationPoint(34.5F, -21F, 9.99F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 96
		bodyModel[120].setRotationPoint(29.5F, -21F, 9.99F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 97
		bodyModel[121].setRotationPoint(24.5F, -21F, 9.99F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[122].setRotationPoint(-11F, -21F, 9.99F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[123].setRotationPoint(14.5F, -21F, 9.99F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[124].setRotationPoint(10F, -21F, 9.99F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 95
		bodyModel[125].setRotationPoint(38.49F, -21F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 92
		bodyModel[126].setRotationPoint(-39.49F, -21F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[127].setRotationPoint(-30F, -22F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 6
		bodyModel[128].setRotationPoint(-10F, 1.5F, 10F);

		bodyModel[129].addBox(0F, 0F, 0F, 20, 23, 1, 0F); // Box 6
		bodyModel[129].setRotationPoint(-10F, -20.5F, 9.75F);

		bodyModel[130].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Box 179 door right
		bodyModel[130].setRotationPoint(-10F, -1.5F, 11.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 door right
		bodyModel[131].setRotationPoint(-10F, -20.5F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 door right
		bodyModel[132].setRotationPoint(9F, -20.5F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[133].setRotationPoint(-1F, -14F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[134].setRotationPoint(-9F, -8F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180 door right
		bodyModel[135].setRotationPoint(-9F, 0.5F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181 door right
		bodyModel[136].setRotationPoint(-2F, -7F, 10F);

		bodyModel[137].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 182 door right
		bodyModel[137].setRotationPoint(-6F, -5.5F, 10.96F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 183 door right
		bodyModel[138].setRotationPoint(-6.5F, -21F, 11.02F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 184 door right
		bodyModel[139].setRotationPoint(5.5F, -21F, 11.02F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[140].setRotationPoint(-9F, -15F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[141].setRotationPoint(-9F, -20.5F, 10F);

		bodyModel[142].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Box 179 door right
		bodyModel[142].setRotationPoint(-10F, -10F, 11.01F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 185 door right handle
		bodyModel[143].setRotationPoint(-1.5F, -1F, -11.02F);
		bodyModel[143].rotateAngleZ = 1.57079633F;

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 56 crossover cull
		bodyModel[144].setRotationPoint(39.51F, 1.5F, -5F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 56 crossover cull
		bodyModel[145].setRotationPoint(-41.51F, 1.5F, -5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 12, 21, 0F,0F, 0F, 0F, 79.02F, 0F, 0F, 79.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 79.02F, 0F, 0F, 79.02F, 0F, 0F, 0F, 0F, 0F); // Box 57 cull
		bodyModel[146].setRotationPoint(-40.01F, -9F, -10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 16
		bodyModel[147].setRotationPoint(-38.5F, -22F, -10F);

		bodyModel[148].addBox(0F, 0F, 0F, 28, 24, 1, 0F); // Sides01
		bodyModel[148].setRotationPoint(-38.5F, -21F, -10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 28, 24, 1, 0F); // Sides01
		bodyModel[149].setRotationPoint(10.5F, -21F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[150].setRotationPoint(-10F, 2.5F, -11.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[151].setRotationPoint(-39.5F, -21.5F, -11.01F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 88
		bodyModel[152].setRotationPoint(-15.5F, -21F, -10.99F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 89
		bodyModel[153].setRotationPoint(-20.5F, -21F, -10.99F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 90
		bodyModel[154].setRotationPoint(-25.5F, -21F, -10.99F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 91
		bodyModel[155].setRotationPoint(-30.5F, -21F, -10.99F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 92
		bodyModel[156].setRotationPoint(-35.5F, -21F, -10.99F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 93
		bodyModel[157].setRotationPoint(19.5F, -21F, -10.99F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 95
		bodyModel[158].setRotationPoint(34.5F, -21F, -10.99F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 96
		bodyModel[159].setRotationPoint(29.5F, -21F, -10.99F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 97
		bodyModel[160].setRotationPoint(24.5F, -21F, -10.99F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[161].setRotationPoint(-11F, -21F, -10.99F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[162].setRotationPoint(14.5F, -21F, -10.99F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 94
		bodyModel[163].setRotationPoint(10F, -21F, -10.99F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 95
		bodyModel[164].setRotationPoint(38.49F, -21F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 92
		bodyModel[165].setRotationPoint(-39.49F, -21F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[166].setRotationPoint(-10F, -22F, -11.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 20, 23, 1, 0F); // Box 6
		bodyModel[167].setRotationPoint(-10F, -20.5F, -10.74F);

		bodyModel[168].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Box 179 door right
		bodyModel[168].setRotationPoint(-10F, -1.5F, -11.01F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 door right
		bodyModel[169].setRotationPoint(-10F, -20.5F, -11.74F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 door right
		bodyModel[170].setRotationPoint(9F, -20.5F, -11.74F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[171].setRotationPoint(-1F, -14F, -11.74F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[172].setRotationPoint(-9F, -8F, -11.74F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180 door right
		bodyModel[173].setRotationPoint(-9F, 0.5F, -11.74F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181 door right
		bodyModel[174].setRotationPoint(-2F, -7F, -11.74F);

		bodyModel[175].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 182 door right
		bodyModel[175].setRotationPoint(-6F, -5.5F, -10.96F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 183 door right
		bodyModel[176].setRotationPoint(-6.5F, -21F, -11.02F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 24, 0, 0F); // Box 184 door right
		bodyModel[177].setRotationPoint(5.5F, -21.01F, -11.02F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[178].setRotationPoint(-9F, -15F, -11.74F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[179].setRotationPoint(-9F, -20.5F, -11.74F);

		bodyModel[180].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Box 179 door right
		bodyModel[180].setRotationPoint(-10F, -10F, -11.01F);

		bodyModel[181].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 6
		bodyModel[181].setRotationPoint(-10F, 1.5F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126 cull
		bodyModel[182].setRotationPoint(3F, 4.75F, 1.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 79, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21.02F, 0F, 0F, 21.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21.02F, 0F, 0F, 21.02F); // Box 192 cull
		bodyModel[183].setRotationPoint(-39.5F, -22F, -11.01F);

		bodyModel[184].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 185 door right handle
		bodyModel[184].setRotationPoint(-3.5F, -1F, 11.02F);
		bodyModel[184].rotateAngleZ = 1.57079633F;

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // amtrak EOT light
		bodyModel[185].setRotationPoint(40.02F, -5.5F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // amtrak EOT light
		bodyModel[186].setRotationPoint(-41.02F, -5.5F, -0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // amtrak EOT and bracket cull
		bodyModel[187].setRotationPoint(40.02F, -4.5F, -0.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // amtrak EOT and bracket cull
		bodyModel[188].setRotationPoint(-41.02F, -4.5F, -0.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[189].setRotationPoint(39.5F, -0.5F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[190].setRotationPoint(39.5F, -0.5F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[191].setRotationPoint(39.5F, -3F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[192].setRotationPoint(39.5F, -3F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[193].setRotationPoint(39.5F, -5.5F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[194].setRotationPoint(39.5F, -5.5F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[195].setRotationPoint(39.5F, -12.75F, 5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[196].setRotationPoint(39.5F, -12.75F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[197].setRotationPoint(39.5F, -15.25F, 5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[198].setRotationPoint(39.5F, -15.25F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F); // Box 189
		bodyModel[199].setRotationPoint(39.5F, -17.75F, 5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[200].setRotationPoint(39.5F, -17.75F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[201].setRotationPoint(-40.5F, -0.5F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[202].setRotationPoint(-40.5F, -0.5F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[203].setRotationPoint(-40.5F, -3F, 5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[204].setRotationPoint(-40.5F, -3F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[205].setRotationPoint(-40.5F, -5.5F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[206].setRotationPoint(-40.5F, -5.5F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[207].setRotationPoint(-40.5F, -12.75F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[208].setRotationPoint(-40.5F, -12.75F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[209].setRotationPoint(-40.5F, -15.25F, 5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[210].setRotationPoint(-40.5F, -15.25F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F); // Box 189
		bodyModel[211].setRotationPoint(-40.5F, -17.75F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 189
		bodyModel[212].setRotationPoint(-40.5F, -17.75F, -11F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[213].setRotationPoint(-15.5F, 2.5F, 9.98F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 89
		bodyModel[214].setRotationPoint(-20.5F, 2.5F, 9.98F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
		bodyModel[215].setRotationPoint(-25.5F, 2.5F, 9.98F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 91
		bodyModel[216].setRotationPoint(-30.5F, 2.5F, 9.98F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		bodyModel[217].setRotationPoint(-35.5F, 2.5F, 9.98F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		bodyModel[218].setRotationPoint(19.5F, 2.5F, 9.98F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		bodyModel[219].setRotationPoint(34.5F, 2.5F, 9.98F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[220].setRotationPoint(29.5F, 2.5F, 9.98F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		bodyModel[221].setRotationPoint(24.5F, 2.5F, 9.98F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[222].setRotationPoint(-11F, 2.5F, 9.98F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[223].setRotationPoint(14.5F, 2.5F, 9.98F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[224].setRotationPoint(10F, 2.5F, 9.98F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[225].setRotationPoint(-15.5F, 2.5F, -10.98F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 89
		bodyModel[226].setRotationPoint(-20.5F, 2.5F, -10.98F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
		bodyModel[227].setRotationPoint(-25.5F, 2.5F, -10.98F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 91
		bodyModel[228].setRotationPoint(-30.5F, 2.5F, -10.98F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 92
		bodyModel[229].setRotationPoint(-35.5F, 2.5F, -10.98F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		bodyModel[230].setRotationPoint(19.5F, 2.5F, -10.98F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		bodyModel[231].setRotationPoint(34.5F, 2.5F, -10.98F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[232].setRotationPoint(29.5F, 2.5F, -10.98F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		bodyModel[233].setRotationPoint(24.5F, 2.5F, -10.98F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[234].setRotationPoint(-11F, 2.5F, -10.98F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[235].setRotationPoint(14.5F, 2.5F, -10.98F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[236].setRotationPoint(10F, 2.5F, -10.98F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		//ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if(GetColor(entity)==621){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.84,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.68,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}

//well then