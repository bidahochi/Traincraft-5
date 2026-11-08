//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: sd70m
// Model Creator: bidahochi
// Created on: 15.02.2025 - 14:06:03
// Last changed on: 15.02.2025 - 14:06:03

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBLW_commonwealth_c;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.LightSourceFaceDirection;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.library.Info;

public class ModelDT662000 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelDT662000() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[653];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 277, 175, textureX, textureY); // Box 301
		bodyModel[1] = new ModelRendererTurbo(this, 13, 176, textureX, textureY); // Box 217
		bodyModel[2] = new ModelRendererTurbo(this, 302, 129, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 92, 234, textureX, textureY); // Box 301
		bodyModel[4] = new ModelRendererTurbo(this, 92, 249, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[5] = new ModelRendererTurbo(this, 92, 244, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[6] = new ModelRendererTurbo(this, 13, 197, textureX, textureY); // Box 217
		bodyModel[7] = new ModelRendererTurbo(this, 59, 197, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 103, 236, textureX, textureY); // Box 217
		bodyModel[9] = new ModelRendererTurbo(this, 92, 233, textureX, textureY); // Box 301
		bodyModel[10] = new ModelRendererTurbo(this, 59, 178, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 60, 184, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 38, 182, textureX, textureY); // Box 301
		bodyModel[13] = new ModelRendererTurbo(this, 69, 182, textureX, textureY); // Box 301
		bodyModel[14] = new ModelRendererTurbo(this, 72, 178, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[15] = new ModelRendererTurbo(this, 103, 245, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 92, 237, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 72, 185, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[18] = new ModelRendererTurbo(this, 254, 211, textureX, textureY); // Box 217
		bodyModel[19] = new ModelRendererTurbo(this, 275, 232, textureX, textureY); // Box 217
		bodyModel[20] = new ModelRendererTurbo(this, 272, 232, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 219, 178, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 220, 184, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 222, 182, textureX, textureY); // Box 301
		bodyModel[24] = new ModelRendererTurbo(this, 195, 182, textureX, textureY); // Box 301
		bodyModel[25] = new ModelRendererTurbo(this, 212, 178, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[26] = new ModelRendererTurbo(this, 212, 185, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[27] = new ModelRendererTurbo(this, 257, 191, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 97, 176, textureX, textureY); // Box 217
		bodyModel[29] = new ModelRendererTurbo(this, 135, 251, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[30] = new ModelRendererTurbo(this, 136, 229, textureX, textureY,"cull"); // Box 217 cull
		bodyModel[31] = new ModelRendererTurbo(this, 121, 234, textureX, textureY); // Box 301
		bodyModel[32] = new ModelRendererTurbo(this, 159, 233, textureX, textureY); // Box 301
		bodyModel[33] = new ModelRendererTurbo(this, 159, 237, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 152, 236, textureX, textureY); // Box 217
		bodyModel[35] = new ModelRendererTurbo(this, 152, 245, textureX, textureY); // Box 32
		bodyModel[36] = new ModelRendererTurbo(this, 21, 54, textureX, textureY); // box03
		bodyModel[37] = new ModelRendererTurbo(this, 16, 32, textureX, textureY); // box03
		bodyModel[38] = new ModelRendererTurbo(this, 24, 37, textureX, textureY); // box03
		bodyModel[39] = new ModelRendererTurbo(this, 35, 51, textureX, textureY); // box03
		bodyModel[40] = new ModelRendererTurbo(this, 35, 34, textureX, textureY); // box03
		bodyModel[41] = new ModelRendererTurbo(this, 16, 28, textureX, textureY); // box03
		bodyModel[42] = new ModelRendererTurbo(this, 15, 64, textureX, textureY); // box03
		bodyModel[43] = new ModelRendererTurbo(this, 16, 67, textureX, textureY); // Box 308
		bodyModel[44] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // box03
		bodyModel[45] = new ModelRendererTurbo(this, 20, 51, textureX, textureY); // Box 90
		bodyModel[46] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 90
		bodyModel[47] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // box03
		bodyModel[48] = new ModelRendererTurbo(this, 1, 62, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 6, 54, textureX, textureY); // Box 94
		bodyModel[50] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // box03
		bodyModel[51] = new ModelRendererTurbo(this, 183, 54, textureX, textureY); // box03
		bodyModel[52] = new ModelRendererTurbo(this, 360, 67, textureX, textureY); // box03
		bodyModel[53] = new ModelRendererTurbo(this, 186, 37, textureX, textureY); // box03
		bodyModel[54] = new ModelRendererTurbo(this, 197, 34, textureX, textureY); // box03
		bodyModel[55] = new ModelRendererTurbo(this, 360, 64, textureX, textureY); // box03
		bodyModel[56] = new ModelRendererTurbo(this, 345, 46, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 345, 62, textureX, textureY); // Box 90
		bodyModel[58] = new ModelRendererTurbo(this, 345, 54, textureX, textureY); // box03
		bodyModel[59] = new ModelRendererTurbo(this, 298, 56, textureX, textureY); // box03
		bodyModel[60] = new ModelRendererTurbo(this, 325, 67, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 197, 51, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 325, 64, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 330, 46, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 330, 62, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 330, 54, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 136, 70, textureX, textureY); // Box 315 door swing left
		bodyModel[67] = new ModelRendererTurbo(this, 303, 145, textureX, textureY); // Box 16
		bodyModel[68] = new ModelRendererTurbo(this, 302, 136, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 174, 147, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 272, 143, textureX, textureY,"cull"); // Box 119 cull
		bodyModel[71] = new ModelRendererTurbo(this, 303, 152, textureX, textureY); // Box 120
		bodyModel[72] = new ModelRendererTurbo(this, 272, 139, textureX, textureY,"cull"); // Box 122 cull
		bodyModel[73] = new ModelRendererTurbo(this, 267, 143, textureX, textureY,"cull"); // Box 124 cull
		bodyModel[74] = new ModelRendererTurbo(this, 265, 139, textureX, textureY,"cull"); // Box 125 cull
		bodyModel[75] = new ModelRendererTurbo(this, 172, 70, textureX, textureY); // Box 315
		bodyModel[76] = new ModelRendererTurbo(this, 196, 121, textureX, textureY); // Box 35
		bodyModel[77] = new ModelRendererTurbo(this, 136, 51, textureX, textureY); // Box 130
		bodyModel[78] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 315
		bodyModel[79] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 133
		bodyModel[80] = new ModelRendererTurbo(this, 172, 51, textureX, textureY); // Box 315 door swing right
		bodyModel[81] = new ModelRendererTurbo(this, 143, 34, textureX, textureY); // box03
		bodyModel[82] = new ModelRendererTurbo(this, 144, 42, textureX, textureY); // box03
		bodyModel[83] = new ModelRendererTurbo(this, 146, 49, textureX, textureY); // box03
		bodyModel[84] = new ModelRendererTurbo(this, 144, 27, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 164, 22, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 165, 16, textureX, textureY); // box03
		bodyModel[87] = new ModelRendererTurbo(this, 179, 48, textureX, textureY); // box03
		bodyModel[88] = new ModelRendererTurbo(this, 174, 19, textureX, textureY); // box03
		bodyModel[89] = new ModelRendererTurbo(this, 185, 46, textureX, textureY); // box03
		bodyModel[90] = new ModelRendererTurbo(this, 169, 8, textureX, textureY); // box03
		bodyModel[91] = new ModelRendererTurbo(this, 176, 31, textureX, textureY); // box03
		bodyModel[92] = new ModelRendererTurbo(this, 179, 11, textureX, textureY); // box03
		bodyModel[93] = new ModelRendererTurbo(this, 177, 39, textureX, textureY); // box03
		bodyModel[94] = new ModelRendererTurbo(this, 172, 2, textureX, textureY); // Box 149
		bodyModel[95] = new ModelRendererTurbo(this, 189, 15, textureX, textureY); // Box 150
		bodyModel[96] = new ModelRendererTurbo(this, 174, 16, textureX, textureY); // Box 151
		bodyModel[97] = new ModelRendererTurbo(this, 190, 22, textureX, textureY); // Box 152
		bodyModel[98] = new ModelRendererTurbo(this, 178, 3, textureX, textureY); // Box 153
		bodyModel[99] = new ModelRendererTurbo(this, 185, 28, textureX, textureY); // Box 154
		bodyModel[100] = new ModelRendererTurbo(this, 211, 134, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[101] = new ModelRendererTurbo(this, 202, 139, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[102] = new ModelRendererTurbo(this, 211, 139, textureX, textureY,"cull"); // Box 35 cull
		bodyModel[103] = new ModelRendererTurbo(this, 236, 177, textureX, textureY,"cull"); // Box 197 cull
		bodyModel[104] = new ModelRendererTurbo(this, 127, 244, textureX, textureY,"cull"); // Box 116 cull
		bodyModel[105] = new ModelRendererTurbo(this, 128, 229, textureX, textureY,"cull"); // Box 116 cull
		bodyModel[106] = new ModelRendererTurbo(this, 121, 242, textureX, textureY,"cull"); // Box 120 cull
		bodyModel[107] = new ModelRendererTurbo(this, 121, 232, textureX, textureY,"cull"); // Box 121 cull
		bodyModel[108] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 184
		bodyModel[110] = new ModelRendererTurbo(this, 89, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[111] = new ModelRendererTurbo(this, 104, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[112] = new ModelRendererTurbo(this, 92, 241, textureX, textureY,"cull"); // Box 189 cull
		bodyModel[113] = new ModelRendererTurbo(this, 129, 170, textureX, textureY); // Box 301
		bodyModel[114] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 301
		bodyModel[115] = new ModelRendererTurbo(this, 129, 184, textureX, textureY); // Box 713
		bodyModel[116] = new ModelRendererTurbo(this, 127, 172, textureX, textureY); // Box 301
		bodyModel[117] = new ModelRendererTurbo(this, 134, 197, textureX, textureY); // Box 196
		bodyModel[118] = new ModelRendererTurbo(this, 146, 201, textureX, textureY); // Box 197
		bodyModel[119] = new ModelRendererTurbo(this, 129, 190, textureX, textureY); // Box 198
		bodyModel[120] = new ModelRendererTurbo(this, 146, 170, textureX, textureY); // Box 301
		bodyModel[121] = new ModelRendererTurbo(this, 146, 177, textureX, textureY); // Box 301
		bodyModel[122] = new ModelRendererTurbo(this, 146, 184, textureX, textureY); // Box 713
		bodyModel[123] = new ModelRendererTurbo(this, 158, 172, textureX, textureY); // Box 301
		bodyModel[124] = new ModelRendererTurbo(this, 151, 197, textureX, textureY); // Box 196
		bodyModel[125] = new ModelRendererTurbo(this, 163, 201, textureX, textureY); // Box 197
		bodyModel[126] = new ModelRendererTurbo(this, 146, 190, textureX, textureY); // Box 198
		bodyModel[127] = new ModelRendererTurbo(this, 284, 53, textureX, textureY); // box03
		bodyModel[128] = new ModelRendererTurbo(this, 288, 42, textureX, textureY); // box03
		bodyModel[129] = new ModelRendererTurbo(this, 301, 42, textureX, textureY); // box03
		bodyModel[130] = new ModelRendererTurbo(this, 287, 39, textureX, textureY); // box03
		bodyModel[131] = new ModelRendererTurbo(this, 283, 42, textureX, textureY); // box03
		bodyModel[132] = new ModelRendererTurbo(this, 122, 53, textureX, textureY); // Box 211
		bodyModel[133] = new ModelRendererTurbo(this, 126, 42, textureX, textureY); // Box 212
		bodyModel[134] = new ModelRendererTurbo(this, 139, 42, textureX, textureY); // Box 213
		bodyModel[135] = new ModelRendererTurbo(this, 121, 39, textureX, textureY); // Box 214
		bodyModel[136] = new ModelRendererTurbo(this, 121, 42, textureX, textureY); // Box 215
		bodyModel[137] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 364
		bodyModel[138] = new ModelRendererTurbo(this, 82, 8, textureX, textureY); // Box 365
		bodyModel[139] = new ModelRendererTurbo(this, 237, 17, textureX, textureY); // Box 218
		bodyModel[140] = new ModelRendererTurbo(this, 237, 12, textureX, textureY); // Box 219
		bodyModel[141] = new ModelRendererTurbo(this, 98, 17, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 272, 10, textureX, textureY); // Box 175
		bodyModel[143] = new ModelRendererTurbo(this, 265, 117, textureX, textureY); // box03
		bodyModel[144] = new ModelRendererTurbo(this, 74, 25, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[145] = new ModelRendererTurbo(this, 67, 17, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[146] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 175
		bodyModel[147] = new ModelRendererTurbo(this, 46, 6, textureX, textureY); // Box 175
		bodyModel[148] = new ModelRendererTurbo(this, 10, 17, textureX, textureY); // Box 175
		bodyModel[149] = new ModelRendererTurbo(this, 306, 5, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[150] = new ModelRendererTurbo(this, 276, 3, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[151] = new ModelRendererTurbo(this, 302, 1, textureX, textureY); // Box 175
		bodyModel[152] = new ModelRendererTurbo(this, 297, 15, textureX, textureY); // Box 175
		bodyModel[153] = new ModelRendererTurbo(this, 303, 22, textureX, textureY); // Box 233
		bodyModel[154] = new ModelRendererTurbo(this, 304, 117, textureX, textureY); // Box 225
		bodyModel[155] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 2
		bodyModel[156] = new ModelRendererTurbo(this, 113, 96, textureX, textureY,"markerlight_type1_1"); // Markerlight glow
		bodyModel[157] = new ModelRendererTurbo(this, 113, 93, textureX, textureY,"markerlight_type1_2"); // Markerlight glow
		bodyModel[158] = new ModelRendererTurbo(this, 116, 102, textureX, textureY); // Box 2
		bodyModel[159] = new ModelRendererTurbo(this, 115, 110, textureX, textureY,"markerlight_type1_3"); // Markerlight glow
		bodyModel[160] = new ModelRendererTurbo(this, 115, 113, textureX, textureY,"markerlight_type1_4"); // Markerlight glow
		bodyModel[161] = new ModelRendererTurbo(this, 120, 107, textureX, textureY,"numberboard_type1_1"); // Box 2 Numberboard type 1
		bodyModel[162] = new ModelRendererTurbo(this, 120, 95, textureX, textureY,"numberboard_type1_2"); // Box 245 numberboard type 1
		bodyModel[163] = new ModelRendererTurbo(this, 149, 97, textureX, textureY); // Box 2
		bodyModel[164] = new ModelRendererTurbo(this, 160, 89, textureX, textureY,"markerlight_type1_5"); // Markerlight glow
		bodyModel[165] = new ModelRendererTurbo(this, 160, 92, textureX, textureY,"markerlight_type1_6"); // Markerlight glow
		bodyModel[166] = new ModelRendererTurbo(this, 149, 102, textureX, textureY); // Box 2
		bodyModel[167] = new ModelRendererTurbo(this, 160, 110, textureX, textureY,"markerlight_type1_7"); // Markerlight glow
		bodyModel[168] = new ModelRendererTurbo(this, 160, 107, textureX, textureY,"markerlight_type1_8"); // Markerlight glow
		bodyModel[169] = new ModelRendererTurbo(this, 153, 107, textureX, textureY,"numberboard_type1_3"); // Box 2 Numberboard type 1
		bodyModel[170] = new ModelRendererTurbo(this, 153, 95, textureX, textureY,"numberboard_type1_4"); // Box 245 numberboard type 1
		bodyModel[171] = new ModelRendererTurbo(this, 37, 96, textureX, textureY); // Box 147
		bodyModel[172] = new ModelRendererTurbo(this, 46, 89, textureX, textureY,"headlight_high_large"); // Box 169 headlight front big high
		bodyModel[173] = new ModelRendererTurbo(this, 55, 90, textureX, textureY,"headlight_high_A1"); // Box 171 headlight front 2beam high
		bodyModel[174] = new ModelRendererTurbo(this, 55, 95, textureX, textureY,"headlight_high_A2"); // Box 172 headlight front 2beam high
		bodyModel[175] = new ModelRendererTurbo(this, 37, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[176] = new ModelRendererTurbo(this, 235, 96, textureX, textureY); // Box 147
		bodyModel[177] = new ModelRendererTurbo(this, 226, 89, textureX, textureY,"backlight_high_large"); // Box 169 headlight rear big high
		bodyModel[178] = new ModelRendererTurbo(this, 219, 90, textureX, textureY,"backlight_high_A1"); // Box 171 headlight rear 2beam high
		bodyModel[179] = new ModelRendererTurbo(this, 219, 95, textureX, textureY,"backlight_high_A2"); // Box 172 headlight rear 2beam high
		bodyModel[180] = new ModelRendererTurbo(this, 235, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[181] = new ModelRendererTurbo(this, 131, 13, textureX, textureY); // Box 183
		bodyModel[182] = new ModelRendererTurbo(this, 119, 7, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 274, 26, textureX, textureY); // Box 266
		bodyModel[184] = new ModelRendererTurbo(this, 283, 23, textureX, textureY); // Box 267
		bodyModel[185] = new ModelRendererTurbo(this, 381, 82, textureX, textureY); // Box 0
		bodyModel[186] = new ModelRendererTurbo(this, 381, 129, textureX, textureY); // Box 0
		bodyModel[187] = new ModelRendererTurbo(this, 444, 91, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 445, 110, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[189] = new ModelRendererTurbo(this, 360, 91, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 341, 110, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[191] = new ModelRendererTurbo(this, 159, 188, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[192] = new ModelRendererTurbo(this, 170, 175, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[193] = new ModelRendererTurbo(this, 159, 194, textureX, textureY,"cull"); // Box 285 cull
		bodyModel[194] = new ModelRendererTurbo(this, 122, 188, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[195] = new ModelRendererTurbo(this, 74, 175, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[196] = new ModelRendererTurbo(this, 122, 194, textureX, textureY,"cull"); // Box 301 cull
		bodyModel[197] = new ModelRendererTurbo(this, 99, 175, textureX, textureY); // Box 16
		bodyModel[198] = new ModelRendererTurbo(this, 103, 182, textureX, textureY); // Box 16
		bodyModel[199] = new ModelRendererTurbo(this, 99, 186, textureX, textureY); // Box 304
		bodyModel[200] = new ModelRendererTurbo(this, 103, 193, textureX, textureY); // Box 305
		bodyModel[201] = new ModelRendererTurbo(this, 175, 175, textureX, textureY); // Box 16
		bodyModel[202] = new ModelRendererTurbo(this, 179, 182, textureX, textureY); // Box 16
		bodyModel[203] = new ModelRendererTurbo(this, 175, 186, textureX, textureY); // Box 304
		bodyModel[204] = new ModelRendererTurbo(this, 179, 193, textureX, textureY); // Box 305
		bodyModel[205] = new ModelRendererTurbo(this, 116, 181, textureX, textureY); // Box 114
		bodyModel[206] = new ModelRendererTurbo(this, 116, 178, textureX, textureY); // Box 74
		bodyModel[207] = new ModelRendererTurbo(this, 116, 184, textureX, textureY); // Box 78
		bodyModel[208] = new ModelRendererTurbo(this, 114, 175, textureX, textureY,"cull"); // Box 74 cull
		bodyModel[209] = new ModelRendererTurbo(this, 170, 181, textureX, textureY); // Box 114
		bodyModel[210] = new ModelRendererTurbo(this, 170, 178, textureX, textureY); // Box 74
		bodyModel[211] = new ModelRendererTurbo(this, 170, 184, textureX, textureY); // Box 78
		bodyModel[212] = new ModelRendererTurbo(this, 169, 175, textureX, textureY,"cull"); // Box 74 cull
		bodyModel[213] = new ModelRendererTurbo(this, 384, 158, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 373, 161, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 373, 156, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[216] = new ModelRendererTurbo(this, 383, 151, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[217] = new ModelRendererTurbo(this, 404, 168, textureX, textureY,"cull"); // Box 0 cull
		bodyModel[218] = new ModelRendererTurbo(this, 408, 166, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 403, 166, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 438, 153, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 403, 168, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 429, 171, textureX, textureY,"cull"); // Box 329 cull
		bodyModel[223] = new ModelRendererTurbo(this, 426, 171, textureX, textureY); // Box 329
		bodyModel[224] = new ModelRendererTurbo(this, 434, 171, textureX, textureY); // Box 322
		bodyModel[225] = new ModelRendererTurbo(this, 389, 163, textureX, textureY); // Box 0 and RT624 MN&S
		bodyModel[226] = new ModelRendererTurbo(this, 395, 163, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 367, 155, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 392, 163, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 393, 168, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 385, 163, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 383, 161, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 383, 159, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 423, 168, textureX, textureY); // Box 340
		bodyModel[234] = new ModelRendererTurbo(this, 414, 170, textureX, textureY); // Box 341
		bodyModel[235] = new ModelRendererTurbo(this, 411, 170, textureX, textureY); // Box 342
		bodyModel[236] = new ModelRendererTurbo(this, 377, 166, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 372, 167, textureX, textureY,"cull"); // Box 322 cull
		bodyModel[238] = new ModelRendererTurbo(this, 374, 150, textureX, textureY); // Box 345
		bodyModel[239] = new ModelRendererTurbo(this, 374, 152, textureX, textureY,"cull"); // Box 345 cull
		bodyModel[240] = new ModelRendererTurbo(this, 357, 163, textureX, textureY,"cull"); // Box 322 cull
		bodyModel[241] = new ModelRendererTurbo(this, 355, 167, textureX, textureY); // Box 322
		bodyModel[242] = new ModelRendererTurbo(this, 364, 162, textureX, textureY,"cull"); // Box 345 cull
		bodyModel[243] = new ModelRendererTurbo(this, 403, 162, textureX, textureY); // Box 322
		bodyModel[244] = new ModelRendererTurbo(this, 405, 161, textureX, textureY,"cull"); // Box 322 cull
		bodyModel[245] = new ModelRendererTurbo(this, 426, 173, textureX, textureY); // Box 322
		bodyModel[246] = new ModelRendererTurbo(this, 411, 18, textureX, textureY); // Box 391 cab floor raised
		bodyModel[247] = new ModelRendererTurbo(this, 371, 10, textureX, textureY); // Box 395 cs
		bodyModel[248] = new ModelRendererTurbo(this, 387, 10, textureX, textureY,"gauges2"); // Box 396 cs
		bodyModel[249] = new ModelRendererTurbo(this, 387, 17, textureX, textureY,"cull"); // Box 397 cull cs dial shield
		bodyModel[250] = new ModelRendererTurbo(this, 364, 12, textureX, textureY); // Box 398 cs
		bodyModel[251] = new ModelRendererTurbo(this, 402, 10, textureX, textureY); // Box 399 cs
		bodyModel[252] = new ModelRendererTurbo(this, 382, 11, textureX, textureY); // Box 401 cs
		bodyModel[253] = new ModelRendererTurbo(this, 397, 21, textureX, textureY); // Box 402 cs ab
		bodyModel[254] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 403 cs ab
		bodyModel[255] = new ModelRendererTurbo(this, 385, 22, textureX, textureY); // Box 404 cs ab
		bodyModel[256] = new ModelRendererTurbo(this, 372, 21, textureX, textureY); // Box 408 cab pannel
		bodyModel[257] = new ModelRendererTurbo(this, 411, 12, textureX, textureY); // Box 391 cab floor raised
		bodyModel[258] = new ModelRendererTurbo(this, 424, 18, textureX, textureY); // Box 391 cab floor raised
		bodyModel[259] = new ModelRendererTurbo(this, 388, 49, textureX, textureY); // Box 372
		bodyModel[260] = new ModelRendererTurbo(this, 390, 42, textureX, textureY); // Box 372
		bodyModel[261] = new ModelRendererTurbo(this, 405, 48, textureX, textureY); // Box 372
		bodyModel[262] = new ModelRendererTurbo(this, 411, 24, textureX, textureY); // Box 375 cab pannel
		bodyModel[263] = new ModelRendererTurbo(this, 385, 45, textureX, textureY); // Box 394
		bodyModel[264] = new ModelRendererTurbo(this, 386, 49, textureX, textureY); // Box 394
		bodyModel[265] = new ModelRendererTurbo(this, 405, 30, textureX, textureY); // Box 277
		bodyModel[266] = new ModelRendererTurbo(this, 402, 24, textureX, textureY); // Box 355 brakewheel
		bodyModel[267] = new ModelRendererTurbo(this, 404, 33, textureX, textureY); // Box 394
		bodyModel[268] = new ModelRendererTurbo(this, 378, 74, textureX, textureY); // Box 381
		bodyModel[269] = new ModelRendererTurbo(this, 369, 68, textureX, textureY); // Box 382
		bodyModel[270] = new ModelRendererTurbo(this, 367, 74, textureX, textureY); // Box 383
		bodyModel[271] = new ModelRendererTurbo(this, 391, 57, textureX, textureY); // Box 384
		bodyModel[272] = new ModelRendererTurbo(this, 393, 58, textureX, textureY); // Box 385
		bodyModel[273] = new ModelRendererTurbo(this, 401, 58, textureX, textureY); // Box 386
		bodyModel[274] = new ModelRendererTurbo(this, 392, 69, textureX, textureY,"gauges"); // Box 387
		bodyModel[275] = new ModelRendererTurbo(this, 392, 76, textureX, textureY); // Box 388
		bodyModel[276] = new ModelRendererTurbo(this, 423, 71, textureX, textureY); // Box 389
		bodyModel[277] = new ModelRendererTurbo(this, 407, 70, textureX, textureY); // Box 390
		bodyModel[278] = new ModelRendererTurbo(this, 412, 69, textureX, textureY); // Box 391
		bodyModel[279] = new ModelRendererTurbo(this, 279, 140, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[280] = new ModelRendererTurbo(this, 300, 154, textureX, textureY,"cull"); // Box 124 cull
		bodyModel[281] = new ModelRendererTurbo(this, 296, 150, textureX, textureY,"cull"); // Box 125 cull
		bodyModel[282] = new ModelRendererTurbo(this, 279, 131, textureX, textureY); // Box 118 battery
		bodyModel[283] = new ModelRendererTurbo(this, 89, 114, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[284] = new ModelRendererTurbo(this, 265, 104, textureX, textureY); // box03
		bodyModel[285] = new ModelRendererTurbo(this, 304, 104, textureX, textureY); // Box 400
		bodyModel[286] = new ModelRendererTurbo(this, 37, 112, textureX, textureY); // Box 147
		bodyModel[287] = new ModelRendererTurbo(this, 46, 105, textureX, textureY,"headlight_mid_large"); // Box 169 headlight front big medium
		bodyModel[288] = new ModelRendererTurbo(this, 55, 106, textureX, textureY,"headlight_mid_A1"); // Box 171 headlight front 2beam medium
		bodyModel[289] = new ModelRendererTurbo(this, 55, 111, textureX, textureY,"headlight_mid_A2"); // Box 172 headlight front 2beam medium
		bodyModel[290] = new ModelRendererTurbo(this, 37, 105, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[291] = new ModelRendererTurbo(this, 235, 112, textureX, textureY); // Box 147
		bodyModel[292] = new ModelRendererTurbo(this, 226, 105, textureX, textureY,"backlight_mid_large"); // Box 169 headlight rear big medium
		bodyModel[293] = new ModelRendererTurbo(this, 219, 106, textureX, textureY,"backlight_mid_A1"); // Box 171 headlight rear 2beam medium
		bodyModel[294] = new ModelRendererTurbo(this, 219, 111, textureX, textureY,"backlight_mid_A2"); // Box 172 headlight rear 2beam medium
		bodyModel[295] = new ModelRendererTurbo(this, 235, 105, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[296] = new ModelRendererTurbo(this, 150, 232, textureX, textureY); // Box 208
		bodyModel[297] = new ModelRendererTurbo(this, 53, 232, textureX, textureY); // Box 209
		bodyModel[298] = new ModelRendererTurbo(this, 129, 220, textureX, textureY); // Box 194 mu stepup box SINGLE
		bodyModel[299] = new ModelRendererTurbo(this, 119, 224, textureX, textureY,"cull"); // Box 160 cull crossover SINGLE
		bodyModel[300] = new ModelRendererTurbo(this, 119, 218, textureX, textureY,"cull"); // Box 161 cull crossover SINGLE
		bodyModel[301] = new ModelRendererTurbo(this, 165, 221, textureX, textureY,"cull"); // Box 160 cull crossover DOUBLE
		bodyModel[302] = new ModelRendererTurbo(this, 165, 215, textureX, textureY,"cull"); // Box 161 cull crossover DOUBLE
		bodyModel[303] = new ModelRendererTurbo(this, 144, 221, textureX, textureY,"cull"); // Box 160 cull crossover DOUBLE
		bodyModel[304] = new ModelRendererTurbo(this, 144, 215, textureX, textureY,"cull"); // Box 161 cull crossover DOUBLE
		bodyModel[305] = new ModelRendererTurbo(this, 155, 215, textureX, textureY,"cull"); // Box 444 cull AIR MU DOUBLE cull
		bodyModel[306] = new ModelRendererTurbo(this, 126, 217, textureX, textureY); // Box 446 mu plug DOUBLE
		bodyModel[307] = new ModelRendererTurbo(this, 155, 211, textureX, textureY); // Box 448 technically a lamp
		bodyModel[308] = new ModelRendererTurbo(this, 162, 208, textureX, textureY); // Box 449 AIR MU HOSE
		bodyModel[309] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 450 AIR MU HOSE
		bodyModel[310] = new ModelRendererTurbo(this, 162, 222, textureX, textureY); // Box 451 AIR MU HOSE
		bodyModel[311] = new ModelRendererTurbo(this, 208, 212, textureX, textureY); // Box 194 mu stepup box SINGLE
		bodyModel[312] = new ModelRendererTurbo(this, 222, 216, textureX, textureY,"cull"); // Box 160 cull crossover SINGLE
		bodyModel[313] = new ModelRendererTurbo(this, 222, 210, textureX, textureY,"cull"); // Box 161 cull crossover SINGLE
		bodyModel[314] = new ModelRendererTurbo(this, 176, 221, textureX, textureY,"cull"); // Box 160 cull crossover DOUBLE
		bodyModel[315] = new ModelRendererTurbo(this, 176, 215, textureX, textureY,"cull"); // Box 161 cull crossover DOUBLE
		bodyModel[316] = new ModelRendererTurbo(this, 197, 213, textureX, textureY,"cull"); // Box 160 cull crossover DOUBLE
		bodyModel[317] = new ModelRendererTurbo(this, 197, 207, textureX, textureY,"cull"); // Box 161 cull crossover DOUBLE
		bodyModel[318] = new ModelRendererTurbo(this, 219, 209, textureX, textureY); // Box 447 mu plug DOUBLE
		bodyModel[319] = new ModelRendererTurbo(this, 187, 215, textureX, textureY,"cull"); // Box 444 cull AIR MU DOUBLE cull
		bodyModel[320] = new ModelRendererTurbo(this, 187, 211, textureX, textureY); // Box 448 AIR MU DOUBLE technically a lamp
		bodyModel[321] = new ModelRendererTurbo(this, 194, 208, textureX, textureY); // Box 449 AIR MU HOSE
		bodyModel[322] = new ModelRendererTurbo(this, 194, 215, textureX, textureY); // Box 450 AIR MU HOSE
		bodyModel[323] = new ModelRendererTurbo(this, 194, 222, textureX, textureY); // Box 451 AIR MU HOSE
		bodyModel[324] = new ModelRendererTurbo(this, 26, 180, textureX, textureY); // Box 442
		bodyModel[325] = new ModelRendererTurbo(this, 26, 187, textureX, textureY); // Box 443
		bodyModel[326] = new ModelRendererTurbo(this, 279, 215, textureX, textureY); // Box 440
		bodyModel[327] = new ModelRendererTurbo(this, 279, 222, textureX, textureY); // Box 441
		bodyModel[328] = new ModelRendererTurbo(this, 112, 224, textureX, textureY); // Box 188 ELECTRIC MU TYPE 1
		bodyModel[329] = new ModelRendererTurbo(this, 112, 219, textureX, textureY); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[330] = new ModelRendererTurbo(this, 233, 213, textureX, textureY); // Box 188 ELECTRIC MU TYPE 1
		bodyModel[331] = new ModelRendererTurbo(this, 233, 208, textureX, textureY); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[332] = new ModelRendererTurbo(this, 279, 150, textureX, textureY,"cull"); // Box 431 cull
		bodyModel[333] = new ModelRendererTurbo(this, 279, 160, textureX, textureY); // Box 435
		bodyModel[334] = new ModelRendererTurbo(this, 74, 219, textureX, textureY,"cull"); // Box 160 cull crossover LOW
		bodyModel[335] = new ModelRendererTurbo(this, 74, 213, textureX, textureY,"cull"); // Box 161 cull crossover LOW
		bodyModel[336] = new ModelRendererTurbo(this, 69, 201, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[337] = new ModelRendererTurbo(this, 83, 208, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[338] = new ModelRendererTurbo(this, 62, 207, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[339] = new ModelRendererTurbo(this, 62, 203, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[340] = new ModelRendererTurbo(this, 83, 201, textureX, textureY); // Box 441 ELECTRIC MU TYPE 2
		bodyModel[341] = new ModelRendererTurbo(this, 71, 208, textureX, textureY); // Box 442 ELECTRIC MU TYPE 2
		bodyModel[342] = new ModelRendererTurbo(this, 90, 207, textureX, textureY); // Box 443 ELECTRIC MU TYPE 2
		bodyModel[343] = new ModelRendererTurbo(this, 90, 203, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[344] = new ModelRendererTurbo(this, 271, 190, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[345] = new ModelRendererTurbo(this, 273, 204, textureX, textureY); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[346] = new ModelRendererTurbo(this, 270, 185, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[347] = new ModelRendererTurbo(this, 270, 181, textureX, textureY); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[348] = new ModelRendererTurbo(this, 271, 214, textureX, textureY); // Box 445 ELECTRIC MU TYPE 2
		bodyModel[349] = new ModelRendererTurbo(this, 273, 221, textureX, textureY); // Box 446 ELECTRIC MU TYPE 2
		bodyModel[350] = new ModelRendererTurbo(this, 264, 218, textureX, textureY); // Box 447 ELECTRIC MU TYPE 2
		bodyModel[351] = new ModelRendererTurbo(this, 264, 214, textureX, textureY); // Box 448 ELECTRIC MU TYPE 2
		bodyModel[352] = new ModelRendererTurbo(this, 88, 221, textureX, textureY); // Box 188 AIR MU SINGLE
		bodyModel[353] = new ModelRendererTurbo(this, 129, 239, textureX, textureY,"cull"); // Box 116 cull
		bodyModel[354] = new ModelRendererTurbo(this, 138, 229, textureX, textureY,"cull"); // Box 116 cull
		bodyModel[355] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 450 AIR MU SINGLE HOSE
		bodyModel[356] = new ModelRendererTurbo(this, 97, 224, textureX, textureY); // Box 451 AIR MU SINGLE HOSE
		bodyModel[357] = new ModelRendererTurbo(this, 100, 217, textureX, textureY); // Box 450 AIR MU SINGLE HOSE
		bodyModel[358] = new ModelRendererTurbo(this, 100, 224, textureX, textureY); // Box 451 AIR MU SINGLE HOSE
		bodyModel[359] = new ModelRendererTurbo(this, 103, 223, textureX, textureY); // Box 466 AIR MU SINGLE
		bodyModel[360] = new ModelRendererTurbo(this, 105, 217, textureX, textureY,"cull"); // Box 188 AIR MU SINGLE cull
		bodyModel[361] = new ModelRendererTurbo(this, 63, 215, textureX, textureY,"cull"); // Box 188 AIR MU SINGLE cull
		bodyModel[362] = new ModelRendererTurbo(this, 63, 223, textureX, textureY,"cull"); // Box 469 AIR MU SINGLE cull
		bodyModel[363] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 448 AIR MU SINGLE technically a lamp
		bodyModel[364] = new ModelRendererTurbo(this, 255, 214, textureX, textureY); // Box 188 AIR MU SINGLE
		bodyModel[365] = new ModelRendererTurbo(this, 240, 213, textureX, textureY); // Box 466 AIR MU SINGLE
		bodyModel[366] = new ModelRendererTurbo(this, 257, 207, textureX, textureY,"cull"); // Box 188 AIR MU SINGLE cull
		bodyModel[367] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 450 AIR MU SINGLE HOSE
		bodyModel[368] = new ModelRendererTurbo(this, 249, 216, textureX, textureY); // Box 451 AIR MU SINGLE HOSE
		bodyModel[369] = new ModelRendererTurbo(this, 252, 209, textureX, textureY); // Box 450 AIR MU SINGLE HOSE
		bodyModel[370] = new ModelRendererTurbo(this, 252, 216, textureX, textureY); // Box 451 AIR MU SINGLE HOSE
		bodyModel[371] = new ModelRendererTurbo(this, 262, 205, textureX, textureY,"cull"); // Box 160 cull crossover LOW
		bodyModel[372] = new ModelRendererTurbo(this, 259, 191, textureX, textureY,"cull"); // Box 161 cull crossover LOW
		bodyModel[373] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 448 AIR MU SINGLE technically a lamp
		bodyModel[374] = new ModelRendererTurbo(this, 219, 100, textureX, textureY,"backlight_high_B1"); // Box 171 headlight rear 2beam horizontal high
		bodyModel[375] = new ModelRendererTurbo(this, 226, 100, textureX, textureY,"backlight_high_B2"); // Box 171 headlight rear 2beam horizontal high
		bodyModel[376] = new ModelRendererTurbo(this, 219, 116, textureX, textureY,"backlight_mid_B1"); // Box 171 headlight rear 2beam horizontal medium
		bodyModel[377] = new ModelRendererTurbo(this, 226, 116, textureX, textureY,"backlight_mid_B2"); // Box 171 headlight rear 2beam horizontal medium
		bodyModel[378] = new ModelRendererTurbo(this, 48, 100, textureX, textureY,"headight_high_B1"); // Box 171 headlight front 2beam horizontal high
		bodyModel[379] = new ModelRendererTurbo(this, 55, 100, textureX, textureY,"headight_high_B2"); // Box 171 headlight front 2beam horizontal high
		bodyModel[380] = new ModelRendererTurbo(this, 48, 116, textureX, textureY,"headlight_mid_B1"); // Box 171 headlight front 2beam horizontal medium
		bodyModel[381] = new ModelRendererTurbo(this, 55, 116, textureX, textureY,"headlight_mid_B2"); // Box 171 headlight front 2beam horizontal medium
		bodyModel[382] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 147
		bodyModel[383] = new ModelRendererTurbo(this, 210, 96, textureX, textureY,"backlight_low_large"); // Box 169 headlight rear big low
		bodyModel[384] = new ModelRendererTurbo(this, 194, 90, textureX, textureY,"backlight_low_A1"); // Box 171 headlight rear 2beam low
		bodyModel[385] = new ModelRendererTurbo(this, 194, 95, textureX, textureY,"backlight_low_A2"); // Box 172 headlight rear 2beam low
		bodyModel[386] = new ModelRendererTurbo(this, 210, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[387] = new ModelRendererTurbo(this, 194, 100, textureX, textureY,"backlight_low_B1"); // Box 171 headlight rear 2beam horizontal low
		bodyModel[388] = new ModelRendererTurbo(this, 201, 100, textureX, textureY,"backlight_low_B2"); // Box 171 headlight rear 2beam horizontal low
		bodyModel[389] = new ModelRendererTurbo(this, 71, 89, textureX, textureY); // Box 147
		bodyModel[390] = new ModelRendererTurbo(this, 62, 96, textureX, textureY,"headlight_low_large"); // Box 169 headlight front big low
		bodyModel[391] = new ModelRendererTurbo(this, 80, 90, textureX, textureY,"headlight_low_A1"); // Box 171 headlight front 2beam low
		bodyModel[392] = new ModelRendererTurbo(this, 80, 95, textureX, textureY,"headlight_low_A2"); // Box 172 headlight front 2beam low
		bodyModel[393] = new ModelRendererTurbo(this, 62, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring
		bodyModel[394] = new ModelRendererTurbo(this, 73, 100, textureX, textureY,"headlight_low_B1"); // Box 171 headlight front 2beam horizontal low
		bodyModel[395] = new ModelRendererTurbo(this, 80, 100, textureX, textureY,"headlight_low_B2"); // Box 171 headlight front 2beam horizontal low
		bodyModel[396] = new ModelRendererTurbo(this, 396, 96, textureX, textureY); // Box 35 SOO
		bodyModel[397] = new ModelRendererTurbo(this, 396, 99, textureX, textureY); // Box 507 SOO
		bodyModel[398] = new ModelRendererTurbo(this, 381, 130, textureX, textureY); // Box 0 SOO
		bodyModel[399] = new ModelRendererTurbo(this, 478, 169, textureX, textureY); // Box 322 SOO
		bodyModel[400] = new ModelRendererTurbo(this, 461, 151, textureX, textureY,"cull"); // Box 322 SOO cull
		bodyModel[401] = new ModelRendererTurbo(this, 478, 167, textureX, textureY); // Box 322 SOO
		bodyModel[402] = new ModelRendererTurbo(this, 447, 164, textureX, textureY); // Box 329 SOO
		bodyModel[403] = new ModelRendererTurbo(this, 444, 164, textureX, textureY); // Box 514 SOO
		bodyModel[404] = new ModelRendererTurbo(this, 446, 160, textureX, textureY,"cull"); // Box 0 SOO cull
		bodyModel[405] = new ModelRendererTurbo(this, 453, 161, textureX, textureY,"cull"); // Box 0 SOO cull
		bodyModel[406] = new ModelRendererTurbo(this, 441, 147, textureX, textureY); // Box 0 SOO
		bodyModel[407] = new ModelRendererTurbo(this, 444, 171, textureX, textureY); // Box 0 SOO
		bodyModel[408] = new ModelRendererTurbo(this, 455, 164, textureX, textureY); // Box 322 SOO
		bodyModel[409] = new ModelRendererTurbo(this, 356, 123, textureX, textureY,"cull"); // Box 322 SOO cull
		bodyModel[410] = new ModelRendererTurbo(this, 447, 168, textureX, textureY); // Box 0 SOO and RT624
		bodyModel[411] = new ModelRendererTurbo(this, 447, 166, textureX, textureY); // Box 0 SOO
		bodyModel[412] = new ModelRendererTurbo(this, 375, 145, textureX, textureY); // Box 345 SOO
		bodyModel[413] = new ModelRendererTurbo(this, 380, 147, textureX, textureY); // Box 345 SOO
		bodyModel[414] = new ModelRendererTurbo(this, 387, 147, textureX, textureY); // Box 345 SOO
		bodyModel[415] = new ModelRendererTurbo(this, 461, 163, textureX, textureY,"cull"); // Box 0 RT624 cull
		bodyModel[416] = new ModelRendererTurbo(this, 463, 161, textureX, textureY); // Box 0 RT624
		bodyModel[417] = new ModelRendererTurbo(this, 381, 141, textureX, textureY); // Box 0 RT624
		bodyModel[418] = new ModelRendererTurbo(this, 381, 137, textureX, textureY); // Box 322 RT624
		bodyModel[419] = new ModelRendererTurbo(this, 440, 70, textureX, textureY); // Box 322 RT624
		bodyModel[420] = new ModelRendererTurbo(this, 461, 159, textureX, textureY); // Box 322 RT624
		bodyModel[421] = new ModelRendererTurbo(this, 460, 125, textureX, textureY,"cull"); // Box 322 RT624 cull
		bodyModel[422] = new ModelRendererTurbo(this, 461, 157, textureX, textureY); // Box 539 RT624
		bodyModel[423] = new ModelRendererTurbo(this, 389, 138, textureX, textureY,"cull"); // Box 540 RT624 cull
		bodyModel[424] = new ModelRendererTurbo(this, 392, 135, textureX, textureY); // Box 540 RT624
		bodyModel[425] = new ModelRendererTurbo(this, 387, 135, textureX, textureY); // Box 540 RT624
		bodyModel[426] = new ModelRendererTurbo(this, 388, 138, textureX, textureY); // Box 540 RT624
		bodyModel[427] = new ModelRendererTurbo(this, 466, 162, textureX, textureY); // Box 0 RT624
		bodyModel[428] = new ModelRendererTurbo(this, 468, 166, textureX, textureY); // Box 545 RT624 MN&S
		bodyModel[429] = new ModelRendererTurbo(this, 470, 164, textureX, textureY); // Box 546 RT624 MN&S
		bodyModel[430] = new ModelRendererTurbo(this, 463, 169, textureX, textureY); // Box 0 RT624 MN&S
		bodyModel[431] = new ModelRendererTurbo(this, 385, 131, textureX, textureY); // Box 0 RT624 MN&S
		bodyModel[432] = new ModelRendererTurbo(this, 392, 130, textureX, textureY); // Box 0 RT624 MN&S
		bodyModel[433] = new ModelRendererTurbo(this, 381, 107, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 246, 105, textureX, textureY,"numberboard_type4_front_R"); // Box 387 side numberboard FR glow
		bodyModel[435] = new ModelRendererTurbo(this, 350, 99, textureX, textureY,"numberboard_type4_back_R"); // Box 387 side numberboard BR glow
		bodyModel[436] = new ModelRendererTurbo(this, 57, 6, textureX, textureY); // Box 558 RT624
		bodyModel[437] = new ModelRendererTurbo(this, 269, 1, textureX, textureY); // Box 559 RT624
		bodyModel[438] = new ModelRendererTurbo(this, 151, 91, textureX, textureY); // Box 2
		bodyModel[439] = new ModelRendererTurbo(this, 153, 89, textureX, textureY,"numberboard_type2_1"); // Box 245 numberboard type 2
		bodyModel[440] = new ModelRendererTurbo(this, 153, 113, textureX, textureY,"numberboard_type2_2"); // Box 562 Numberboard type 2
		bodyModel[441] = new ModelRendererTurbo(this, 151, 109, textureX, textureY); // Box 563
		bodyModel[442] = new ModelRendererTurbo(this, 118, 91, textureX, textureY); // Box 2
		bodyModel[443] = new ModelRendererTurbo(this, 120, 89, textureX, textureY,"numberboard_type2_3"); // Box 245 numberboard type 2
		bodyModel[444] = new ModelRendererTurbo(this, 120, 113, textureX, textureY,"numberboard_type2_4"); // Box 562 Numberboard type 2
		bodyModel[445] = new ModelRendererTurbo(this, 120, 109, textureX, textureY); // Box 563
		bodyModel[446] = new ModelRendererTurbo(this, 139, 98, textureX, textureY); // Box 2
		bodyModel[447] = new ModelRendererTurbo(this, 143, 103, textureX, textureY,"markerlight_type2_1"); // Markerlight Type 2 glow
		bodyModel[448] = new ModelRendererTurbo(this, 143, 106, textureX, textureY,"markerlight_type2_2"); // Markerlight Type 2 glow
		bodyModel[449] = new ModelRendererTurbo(this, 139, 93, textureX, textureY); // Box 571
		bodyModel[450] = new ModelRendererTurbo(this, 146, 92, textureX, textureY,"markerlight_type2_3"); // Markerlight Type 2 glow
		bodyModel[451] = new ModelRendererTurbo(this, 146, 89, textureX, textureY,"markerlight_type2_4"); // Markerlight Type 2 glow
		bodyModel[452] = new ModelRendererTurbo(this, 130, 98, textureX, textureY); // Box 2
		bodyModel[453] = new ModelRendererTurbo(this, 130, 93, textureX, textureY); // Box 571
		bodyModel[454] = new ModelRendererTurbo(this, 127, 92, textureX, textureY,"markerlight_type2_5"); // Markerlight Type 2 glow
		bodyModel[455] = new ModelRendererTurbo(this, 127, 89, textureX, textureY,"markerlight_type2_6"); // Markerlight Type 2 glow
		bodyModel[456] = new ModelRendererTurbo(this, 129, 103, textureX, textureY,"markerlight_type2_7"); // Markerlight Type 2 glow
		bodyModel[457] = new ModelRendererTurbo(this, 129, 106, textureX, textureY,"markerlight_type2_8"); // Markerlight Type 2 glow
		bodyModel[458] = new ModelRendererTurbo(this, 341, 110, textureX, textureY,"numberboard_type3_back_L"); // Box 582 side numberboard Type 2 BL glow
		bodyModel[459] = new ModelRendererTurbo(this, 256, 111, textureX, textureY,"numberboard_type3_front_L"); // Box 582 side numberboard Type 2 FL glow
		bodyModel[460] = new ModelRendererTurbo(this, 90, 100, textureX, textureY); // Box 114
		bodyModel[461] = new ModelRendererTurbo(this, 90, 97, textureX, textureY); // Box 74
		bodyModel[462] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 78
		bodyModel[463] = new ModelRendererTurbo(this, 88, 95, textureX, textureY); // Box 189 holder
		bodyModel[464] = new ModelRendererTurbo(this, 186, 100, textureX, textureY); // Box 114
		bodyModel[465] = new ModelRendererTurbo(this, 186, 97, textureX, textureY); // Box 74
		bodyModel[466] = new ModelRendererTurbo(this, 186, 103, textureX, textureY); // Box 78
		bodyModel[467] = new ModelRendererTurbo(this, 184, 95, textureX, textureY); // Box 189 holder
		bodyModel[468] = new ModelRendererTurbo(this, 202, 103, textureX, textureY,"cull"); // Box 90 EJ&E numberboard cull
		bodyModel[469] = new ModelRendererTurbo(this, 64, 103, textureX, textureY,"cull"); // Box 90 EJ&E numberboard cull
		bodyModel[470] = new ModelRendererTurbo(this, 342, 38, textureX, textureY); // Box 90
		bodyModel[471] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 90
		bodyModel[472] = new ModelRendererTurbo(this, 197, 111, textureX, textureY); // Box 114
		bodyModel[473] = new ModelRendererTurbo(this, 197, 108, textureX, textureY); // Box 74
		bodyModel[474] = new ModelRendererTurbo(this, 197, 114, textureX, textureY); // Box 78
		bodyModel[475] = new ModelRendererTurbo(this, 195, 105, textureX, textureY); // Box 189 holder
		bodyModel[476] = new ModelRendererTurbo(this, 79, 105, textureX, textureY); // Box 601 holder
		bodyModel[477] = new ModelRendererTurbo(this, 79, 111, textureX, textureY); // Box 114
		bodyModel[478] = new ModelRendererTurbo(this, 79, 108, textureX, textureY); // Box 74
		bodyModel[479] = new ModelRendererTurbo(this, 79, 114, textureX, textureY); // Box 78
		bodyModel[480] = new ModelRendererTurbo(this, 183, 89, textureX, textureY); // Box 110 ATSF numberboard
		bodyModel[481] = new ModelRendererTurbo(this, 183, 106, textureX, textureY); // Box 110 ATSF numberboard
		bodyModel[482] = new ModelRendererTurbo(this, 87, 89, textureX, textureY); // Box 110 ATSF numberboard
		bodyModel[483] = new ModelRendererTurbo(this, 87, 106, textureX, textureY); // Box 110 ATSF numberboard
		bodyModel[484] = new ModelRendererTurbo(this, 98, 105, textureX, textureY); // Box 2
		bodyModel[485] = new ModelRendererTurbo(this, 99, 102, textureX, textureY,"markerlight_type3_1"); // Box Glow
		bodyModel[486] = new ModelRendererTurbo(this, 100, 99, textureX, textureY,"markerlight_type3_2"); // Box Glow
		bodyModel[487] = new ModelRendererTurbo(this, 99, 110, textureX, textureY); // Box 2
		bodyModel[488] = new ModelRendererTurbo(this, 107, 105, textureX, textureY); // Box 613
		bodyModel[489] = new ModelRendererTurbo(this, 108, 110, textureX, textureY); // Box 614
		bodyModel[490] = new ModelRendererTurbo(this, 108, 102, textureX, textureY,"markerlight_type3_3"); // Box Glow
		bodyModel[491] = new ModelRendererTurbo(this, 109, 99, textureX, textureY,"markerlight_type3_4"); // Box Glow
		bodyModel[492] = new ModelRendererTurbo(this, 174, 105, textureX, textureY); // Box 2
		bodyModel[493] = new ModelRendererTurbo(this, 175, 102, textureX, textureY,"markerlight_type3_5"); // Box Glow
		bodyModel[494] = new ModelRendererTurbo(this, 176, 99, textureX, textureY,"markerlight_type3_6"); // Box Glow
		bodyModel[495] = new ModelRendererTurbo(this, 175, 110, textureX, textureY); // Box 2
		bodyModel[496] = new ModelRendererTurbo(this, 165, 105, textureX, textureY); // Box 613
		bodyModel[497] = new ModelRendererTurbo(this, 166, 110, textureX, textureY); // Box 614
		bodyModel[498] = new ModelRendererTurbo(this, 166, 102, textureX, textureY,"markerlight_type3_7"); // Box Glow
		bodyModel[499] = new ModelRendererTurbo(this, 167, 99, textureX, textureY,"markerlight_type3_8"); // Box Glow

		bodyModel[0].addBox(0F, 0F, 0F, 105, 3, 12, 0F); // Box 301
		bodyModel[0].setRotationPoint(-52.5F, -1F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 20, 24, 0F); // Box 217
		bodyModel[1].setRotationPoint(-52.51F, -12F, -12F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 16
		bodyModel[2].setRotationPoint(-48.5F, -1F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 301
		bodyModel[3].setRotationPoint(-52.5F, 5F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F); // Box 301 cull
		bodyModel[4].setRotationPoint(-52.5F, 5F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 301 cull
		bodyModel[5].setRotationPoint(-52.5F, 2F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[6].setRotationPoint(-52.51F, -1F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(-52.51F, -1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[8].setRotationPoint(-48.5F, 1F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 301
		bodyModel[9].setRotationPoint(-52.5F, -1F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[10].setRotationPoint(-56.5F, 3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-53.5F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[12].setRotationPoint(-52.5F, 2F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[13].setRotationPoint(-47.5F, 2F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, -2F, 3F, -0.5F, -2F); // Box 301 cull
		bodyModel[14].setRotationPoint(-45.5F, 2F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		bodyModel[15].setRotationPoint(-48.5F, 1F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 36
		bodyModel[16].setRotationPoint(-52.5F, -1F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, -2F, -3F, -0.5F, -2F, -3F, -0.5F, 0F, 3F, -0.5F, 0F); // Box 38 cull
		bodyModel[17].setRotationPoint(-45.5F, 2F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 20, 24, 0F); // Box 217
		bodyModel[18].setRotationPoint(52.51F, -12F, -12F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[19].setRotationPoint(52.51F, -1F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(52.51F, -1F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[21].setRotationPoint(53.5F, 3F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[22].setRotationPoint(52.5F, 2.5F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[23].setRotationPoint(47.5F, 2F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 301
		bodyModel[24].setRotationPoint(44.5F, 2F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, -2F, -3F, -0.5F, -2F); // Box 301 cull
		bodyModel[25].setRotationPoint(44.5F, 2F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -2F, 3F, -0.5F, -2F, 3F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 38 cull
		bodyModel[26].setRotationPoint(44.5F, 2F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 105, 0, 22, 0F); // Box 50
		bodyModel[27].setRotationPoint(-52.5F, 2F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[28].setRotationPoint(-48.51F, -8F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 96.02F, 0F, -1F, 96.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 96.02F, 0F, 0F, 96.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[29].setRotationPoint(-48.51F, -9F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 96.02F, 0F, 0F, 96.02F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 96.02F, 0F, 0F, 96.02F, 0F, 0F, 0F, 0F, 0F); // Box 217 cull
		bodyModel[30].setRotationPoint(-48.51F, -9F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 0, 20, 0F); // Box 301
		bodyModel[31].setRotationPoint(48.5F, 5F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 301
		bodyModel[32].setRotationPoint(48.5F, -1F, 6F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 36
		bodyModel[33].setRotationPoint(48.5F, -1F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[34].setRotationPoint(48.5F, 1F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		bodyModel[35].setRotationPoint(48.5F, 1F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 43, 20, 14, 0F); // box03
		bodyModel[36].setRotationPoint(-48.5F, -21F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[37].setRotationPoint(-49.5F, -21F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 42, 1, 12, 0F); // box03
		bodyModel[38].setRotationPoint(-48.5F, -22F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[39].setRotationPoint(-48.5F, -22F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[40].setRotationPoint(-48.5F, -22F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[41].setRotationPoint(-49.5F, -22F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[42].setRotationPoint(-49.5F, -22F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[43].setRotationPoint(-49.5F, -21F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // box03
		bodyModel[44].setRotationPoint(-49.5F, -22F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[45].setRotationPoint(-49.5F, -22F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[46].setRotationPoint(-50.5F, -21F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // box03
		bodyModel[47].setRotationPoint(-50F, -22F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[48].setRotationPoint(-50.5F, -21F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.75F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[49].setRotationPoint(-50F, -22F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // box03
		bodyModel[50].setRotationPoint(-49.5F, -21F, -6F);

		bodyModel[51].addBox(0F, 0F, 0F, 43, 20, 14, 0F); // box03
		bodyModel[51].setRotationPoint(5.5F, -21F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // box03
		bodyModel[52].setRotationPoint(48.5F, -21F, 6F);

		bodyModel[53].addBox(0F, 0F, 0F, 42, 1, 12, 0F); // box03
		bodyModel[53].setRotationPoint(6.5F, -22F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[54].setRotationPoint(6.5F, -22F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // box03
		bodyModel[55].setRotationPoint(48.5F, -22F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[56].setRotationPoint(48.5F, -22F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[57].setRotationPoint(49.5F, -21F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // box03
		bodyModel[58].setRotationPoint(49F, -22F, 0F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // box03
		bodyModel[59].setRotationPoint(48.5F, -21F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[60].setRotationPoint(48.5F, -21F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 42, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[61].setRotationPoint(6.5F, -22F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[62].setRotationPoint(48.5F, -22F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[63].setRotationPoint(48.5F, -22F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[64].setRotationPoint(49.5F, -21F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[65].setRotationPoint(49F, -22F, -6F);

		bodyModel[66].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing left
		bodyModel[66].setRotationPoint(-6F, -20F, -10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 16
		bodyModel[67].setRotationPoint(20.5F, -1F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 117
		bodyModel[68].setRotationPoint(-48.5F, -1F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 41, 5, 22, 0F); // Box 118
		bodyModel[69].setRotationPoint(-20.5F, -3F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 0F, 21F); // Box 119 cull
		bodyModel[70].setRotationPoint(20.5F, 1F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 28, 1, 5, 0F); // Box 120
		bodyModel[71].setRotationPoint(20.5F, -1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 21F, 0F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 122 cull
		bodyModel[72].setRotationPoint(20.5F, -3F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -1F, 0F, 21F); // Box 124 cull
		bodyModel[73].setRotationPoint(-21.5F, 1F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -2F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 125 cull
		bodyModel[74].setRotationPoint(-22.5F, -3F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 315
		bodyModel[75].setRotationPoint(5.5F, -20F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 13, 3, 22, 0F); // Box 35
		bodyModel[76].setRotationPoint(-6.5F, -6F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 130
		bodyModel[77].setRotationPoint(-6.5F, -20F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 315
		bodyModel[78].setRotationPoint(-5.5F, -20F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 133
		bodyModel[79].setRotationPoint(-5.5F, -20F, 10F);

		bodyModel[80].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[80].setRotationPoint(6F, -20F, 10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // box03
		bodyModel[81].setRotationPoint(-6.5F, -23F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[82].setRotationPoint(-6.5F, -23F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[83].setRotationPoint(-5.5F, -22F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 139
		bodyModel[84].setRotationPoint(-6.5F, -23F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 140
		bodyModel[85].setRotationPoint(-5.5F, -22F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[86].setRotationPoint(-6.5F, -22F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[87].setRotationPoint(5.5F, -22F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[88].setRotationPoint(-6.5F, -21F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[89].setRotationPoint(5.5F, -21F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[90].setRotationPoint(-6.5F, -22F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[91].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[92].setRotationPoint(-6.5F, -22F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[93].setRotationPoint(5.5F, -22F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 149
		bodyModel[94].setRotationPoint(-6.5F, -22F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 150
		bodyModel[95].setRotationPoint(5.5F, -22F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[96].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[97].setRotationPoint(5.5F, -21F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[98].setRotationPoint(-6.5F, -22F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[99].setRotationPoint(5.5F, -22F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 21F, -1.5F, 0F, 21F, 0F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, 20.99F, 0F, -0.5F, 20.99F); // Box 35 cull
		bodyModel[100].setRotationPoint(-8F, -7F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, -0.01F, -0.5F, 0F, 20.99F, 0F, -1.5F, 21F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 21F, 0F, -0.5F, 21F); // Box 35 cull
		bodyModel[101].setRotationPoint(-10.5F, -4.5F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 20.99F, -0.5F, 0F, 20.99F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 21F, -0.5F, -0.5F, 21F); // Box 35 cull
		bodyModel[102].setRotationPoint(-8.5F, -4.5F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, 0F, 104.04F, 0F, 0F, 104.04F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 104.04F, 0F, 0F, 104.04F, 0F, 0F, 0F, 0F, 0F); // Box 197 cull
		bodyModel[103].setRotationPoint(-52.52F, -2.5F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -5F, 0F, 104F, -5F, 0F, 104F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 104F, 4F, -1F, 104F, 0F, 0F, 0F, 0F, 0F); // Box 116 cull
		bodyModel[104].setRotationPoint(-52.5F, -9F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 104F, 0F, 0F, 104F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 104F, 0F, 0F, 104F, 4F, -1F, 0F, 4F, -1F); // Box 116 cull
		bodyModel[105].setRotationPoint(-52.5F, -9F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 4F, -1F, 104F, 4F, -1F, 104F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 104F, -5F, 0F, 104F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[106].setRotationPoint(-52.5F, -3F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 104F, 0F, 0F, 104F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 104F, 0F, 0F, 104F, -5F, 0F, 0F, -5F, 0F); // Box 121 cull
		bodyModel[107].setRotationPoint(-52.5F, -3F, 1F);

		bodyModel[108].addBox(0F, 0F, 0F, 97, 21, 0, 0F); // Box 109
		bodyModel[108].setRotationPoint(-48.5F, -13F, 11F);

		bodyModel[109].addBox(0F, 0F, 0F, 97, 21, 0, 0F); // Box 184
		bodyModel[109].setRotationPoint(-48.5F, -13F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[110].setRotationPoint(-23.5F, -11F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 21F, 1F, 0F, 21F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 21F, -1F, 0F, 21F); // Box 186 cull
		bodyModel[111].setRotationPoint(22.5F, -11F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F); // Box 189 cull
		bodyModel[112].setRotationPoint(-52.5F, 1F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301
		bodyModel[113].setRotationPoint(-32.5F, 0F, 6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301
		bodyModel[114].setRotationPoint(-32.5F, 1F, 6F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[115].setRotationPoint(-33F, 2F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[116].setRotationPoint(-31.75F, 1F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[117].setRotationPoint(-31.75F, 1F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[118].setRotationPoint(-32.5F, 0F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[119].setRotationPoint(-32.5F, 1F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301
		bodyModel[120].setRotationPoint(29.5F, 0F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301
		bodyModel[121].setRotationPoint(29.5F, 1F, 6F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[122].setRotationPoint(29F, 2F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[123].setRotationPoint(30.25F, 1F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[124].setRotationPoint(30.25F, 1F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[125].setRotationPoint(29.5F, 0F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[126].setRotationPoint(29.5F, 1F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[127].setRotationPoint(13.5F, -16F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[128].setRotationPoint(13.5F, -21F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[129].setRotationPoint(18.5F, -21F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // box03
		bodyModel[130].setRotationPoint(13F, -21.75F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // box03
		bodyModel[131].setRotationPoint(12.5F, -21F, 7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 211
		bodyModel[132].setRotationPoint(-18.5F, -16F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[133].setRotationPoint(-18.5F, -21F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[134].setRotationPoint(-13.5F, -21F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 214
		bodyModel[135].setRotationPoint(-19F, -21.75F, -8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 215
		bodyModel[136].setRotationPoint(-19.5F, -21F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 364
		bodyModel[137].setRotationPoint(-18F, -23F, -4.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 365
		bodyModel[138].setRotationPoint(-18F, -24F, -4.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 218
		bodyModel[139].setRotationPoint(16F, -23F, 2.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 219
		bodyModel[140].setRotationPoint(16F, -24F, 2.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[141].setRotationPoint(-36F, -22.5F, -2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[142].setRotationPoint(22F, -22.5F, -2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 17, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 13.02F, 0F, -5F, 13.02F); // box03
		bodyModel[143].setRotationPoint(-47.5F, -9F, -7.01F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175 cull
		bodyModel[144].setRotationPoint(-47.5F, -22.5F, -3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 175 cull
		bodyModel[145].setRotationPoint(-48F, -22.75F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, -2F, 0F, -0.76F, -2F); // Box 175
		bodyModel[146].setRotationPoint(-43F, -22.74F, -1.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 175
		bodyModel[147].setRotationPoint(-43.5F, -23F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 21, 0, 14, 0F,-0.01F, 0F, -0.01F, -11.01F, 0F, -0.01F, -11.01F, 0F, -7.01F, -0.01F, 0F, -7.01F, -0.01F, 0F, -0.01F, -11.01F, 0F, -0.01F, -11.01F, 0F, -7.01F, -0.01F, 0F, -7.01F); // Box 175
		bodyModel[148].setRotationPoint(-48.5F, -22.01F, -3.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175 cull
		bodyModel[149].setRotationPoint(38.5F, -22.5F, -3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 175 cull
		bodyModel[150].setRotationPoint(38F, -22.75F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.76F, 0F, 0F, -0.76F, 0F, 0F, -0.76F, -2F, 0F, -0.76F, -2F); // Box 175
		bodyModel[151].setRotationPoint(43F, -22.74F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 21, 0, 14, 0F,-0.01F, 0F, -0.01F, -11.01F, 0F, -0.01F, -11.01F, 0F, -7.01F, -0.01F, 0F, -7.01F, -0.01F, 0F, -0.01F, -11.01F, 0F, -0.01F, -11.01F, 0F, -7.01F, -0.01F, 0F, -7.01F); // Box 175
		bodyModel[152].setRotationPoint(38.5F, -22.01F, -3.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 233
		bodyModel[153].setRotationPoint(42.5F, -23F, -5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 17, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -5F, 0F, -8F, -5F, 0F, -8F, -5F, 13.02F, 0F, -5F, 13.02F); // Box 225
		bodyModel[154].setRotationPoint(38.5F, -9F, -7.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[155].setRotationPoint(-50.9F, -20.5F, 5.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[156].setRotationPoint(-51.35F, -20F, 6.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[157].setRotationPoint(-50.5F, -20F, 7.45F);
		bodyModel[157].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[158].setRotationPoint(-50.9F, -20.5F, -7.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[159].setRotationPoint(-51.35F, -20F, -7.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[160].setRotationPoint(-50.5F, -20F, -7.75F);
		bodyModel[160].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Numberboard type 1
		bodyModel[161].setRotationPoint(-49.2F, -20F, -7.56F);
		bodyModel[161].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 numberboard type 1
		bodyModel[162].setRotationPoint(-49.2F, -20F, 7.56F);
		bodyModel[162].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[163].setRotationPoint(46.75F, -20.5F, 5.75F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[164].setRotationPoint(50.3F, -20F, 6.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[165].setRotationPoint(49.45F, -20F, 7.45F);
		bodyModel[165].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 2
		bodyModel[166].setRotationPoint(46.75F, -20.5F, -7.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight glow
		bodyModel[167].setRotationPoint(50.3F, -20F, -7.25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight glow
		bodyModel[168].setRotationPoint(49.45F, -20F, -7.75F);
		bodyModel[168].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2 Numberboard type 1
		bodyModel[169].setRotationPoint(47.4F, -20F, -7.56F);
		bodyModel[169].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 numberboard type 1
		bodyModel[170].setRotationPoint(47.4F, -20F, 7.56F);
		bodyModel[170].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[171].setRotationPoint(-50F, -21.75F, -1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big high
		bodyModel[172].setRotationPoint(-50.25F, -21.5F, -1.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam high
		bodyModel[173].setRotationPoint(-50.25F, -21.75F, -0.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam high
		bodyModel[174].setRotationPoint(-50.25F, -20.25F, -0.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[175].setRotationPoint(-51F, -21.75F, -1.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Box 147
		bodyModel[176].setRotationPoint(49F, -21.75F, -1.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big high
		bodyModel[177].setRotationPoint(49.25F, -21.5F, -1.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam high
		bodyModel[178].setRotationPoint(49.25F, -21.75F, -0.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam high
		bodyModel[179].setRotationPoint(49.25F, -20.25F, -0.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[180].setRotationPoint(50F, -21.75F, -1.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[181].setRotationPoint(-17F, -22.5F, 2.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[182].setRotationPoint(-19F, -23.5F, 2.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 266
		bodyModel[183].setRotationPoint(16F, -22.5F, -3.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 267
		bodyModel[184].setRotationPoint(16F, -23.5F, -3.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 19, 4, 20, 0F); // Box 0
		bodyModel[185].setRotationPoint(-9.5F, 2F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 19, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[186].setRotationPoint(-9.5F, 7F, -10F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[187].setRotationPoint(12.5F, 2.83F, -8F);
		bodyModel[187].rotateAngleZ = -0.78539816F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,-0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F); // Box 0 cull
		bodyModel[188].setRotationPoint(11F, 2F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[189].setRotationPoint(-12.5F, 2.83F, -8F);
		bodyModel[189].rotateAngleZ = -0.78539816F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,-0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F, -0.085F, 0.245F, 0F); // Box 0 cull
		bodyModel[190].setRotationPoint(-14F, 2F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 11.5F, 0F, 0F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 11.5F, 0F, 0F, 11.5F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 285 cull
		bodyModel[191].setRotationPoint(27.5F, 1F, 7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 285 cull
		bodyModel[192].setRotationPoint(27.5F, 0F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 11.5F, -1F, -0.01F, 11.5F, 0F, 0F, 0F, 0F, 0F); // Box 285 cull
		bodyModel[193].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 11.5F, 0F, 0F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 11.5F, 0F, 0F, 11.5F, -1F, -0.01F, 0F, -1F, -0.01F); // Box 301 cull
		bodyModel[194].setRotationPoint(-40F, 1F, 7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 301 cull
		bodyModel[195].setRotationPoint(-40F, 0F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.01F, 11.5F, 0F, -0.01F, 11.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 11.5F, -1F, -0.01F, 11.5F, 0F, 0F, 0F, 0F, 0F); // Box 301 cull
		bodyModel[196].setRotationPoint(-40F, 1F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 16
		bodyModel[197].setRotationPoint(-47.5F, 0F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.99F, 1F, 0F, 0.99F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 16
		bodyModel[198].setRotationPoint(-46.5F, 2F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[199].setRotationPoint(-47.5F, 0F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0.99F, 1F, 0F, 0.99F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 305
		bodyModel[200].setRotationPoint(-46.5F, 2F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 16
		bodyModel[201].setRotationPoint(43.5F, 0F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.99F, 1F, 0F, 0.99F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 16
		bodyModel[202].setRotationPoint(44.5F, 2F, 8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[203].setRotationPoint(43.5F, 0F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0.99F, 1F, 0F, 0.99F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 305
		bodyModel[204].setRotationPoint(44.5F, 2F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[205].setRotationPoint(-42F, 1.75F, -10.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[206].setRotationPoint(-42F, 1F, -10.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[207].setRotationPoint(-41.75F, 2F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 74 cull
		bodyModel[208].setRotationPoint(-42.5F, 0F, -10.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[209].setRotationPoint(41F, 1.75F, 9.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[210].setRotationPoint(41F, 1F, 9.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[211].setRotationPoint(41.25F, 2F, 9.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 74 cull
		bodyModel[212].setRotationPoint(40.5F, 0F, 9.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-11F, 2.75F, -7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[214].setRotationPoint(-18F, 2.75F, 6F);
		bodyModel[214].rotateAngleY = -0.78539816F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.26F, 0F, -0.375F, -0.26F, 0F, -0.375F, -0.26F, -0.5F, -0.125F, -0.26F, -0.5F); // Box 0 cull
		bodyModel[215].setRotationPoint(-17F, 2F, 4.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 19.02F, 0F, -2.5F, 19.02F); // Box 0 cull
		bodyModel[216].setRotationPoint(-18F, 2F, -10.01F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.01F, -0.5F, -0.5F, 0.01F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 cull
		bodyModel[217].setRotationPoint(12F, 4F, -10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[218].setRotationPoint(9F, 3.5F, -10.01F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[219].setRotationPoint(9F, 3F, -10.01F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.49F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.49F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[220].setRotationPoint(10F, 3F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, -1F, 0.01F, 0.25F, -1F, -0.01F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0.01F, -0.3F, 0F, -0.01F, 0F, -0.5F, 0F); // Box 0
		bodyModel[221].setRotationPoint(10.5F, 3F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 329 cull
		bodyModel[222].setRotationPoint(12.25F, 4F, 8.01F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 329
		bodyModel[223].setRotationPoint(11.75F, 3.5F, 8.01F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 322
		bodyModel[224].setRotationPoint(11F, 3.5F, 10.01F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F); // Box 0 and RT624 MN&S
		bodyModel[225].setRotationPoint(-12.75F, 3.5F, -8.01F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[226].setRotationPoint(-10.5F, 2.25F, -8.01F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[227].setRotationPoint(-10.5F, 2.25F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[228].setRotationPoint(-11.5F, 2F, -8.01F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[229].setRotationPoint(-12.25F, 6F, -8.01F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[230].setRotationPoint(-10.5F, 2.5F, -9.01F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[231].setRotationPoint(-17.5F, 2F, -9.01F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[232].setRotationPoint(-18F, 2F, -9.01F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 340
		bodyModel[233].setRotationPoint(9.5F, 2.5F, 9.01F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[234].setRotationPoint(10.5F, 2F, 9.01F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 342
		bodyModel[235].setRotationPoint(14F, 2F, 9.01F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 0
		bodyModel[236].setRotationPoint(-10.5F, 2.25F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.01F, -1F, 0F, 0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0.01F, -1F, -0.5F, 0.01F); // Box 322 cull
		bodyModel[237].setRotationPoint(-10.5F, 3.5F, 9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.03F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.03F, -0.5F, 0F); // Box 345
		bodyModel[238].setRotationPoint(-15F, 4F, 8.01F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0.01F, 0F, -1.25F, 0.01F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0.01F, 0F, 0.75F, 0.01F); // Box 345 cull
		bodyModel[239].setRotationPoint(-15.53F, 2.75F, 6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.49F, -1F, 0F, -0.49F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.49F, -1F, -0.5F, -0.49F); // Box 322 cull
		bodyModel[240].setRotationPoint(-10.5F, 2F, 8.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322
		bodyModel[241].setRotationPoint(-18.5F, 2F, 8.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 345 cull
		bodyModel[242].setRotationPoint(-18.5F, 2.25F, 6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F); // Box 322
		bodyModel[243].setRotationPoint(-12F, 2F, 9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 322 cull
		bodyModel[244].setRotationPoint(-19.25F, 2F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322
		bodyModel[245].setRotationPoint(18F, 2F, 10.01F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[246].setRotationPoint(-2.5F, -7.5F, 4F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 395 cs
		bodyModel[247].setRotationPoint(-5F, -14F, 3.75F);
		bodyModel[247].rotateAngleY = -0.52359878F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 396 cs
		bodyModel[248].setRotationPoint(-5F, -17F, 3.75F);
		bodyModel[248].rotateAngleY = -0.52359878F;

		bodyModel[249].addShapeBox(0F, 0F, 1F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull cs dial shield
		bodyModel[249].setRotationPoint(-5F, -17F, 3.75F);
		bodyModel[249].rotateAngleY = -0.52359878F;

		bodyModel[250].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 398 cs
		bodyModel[250].setRotationPoint(-5F, -17F, 3.74F);
		bodyModel[250].rotateAngleY = -0.52359878F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 399 cs
		bodyModel[251].setRotationPoint(-1.5F, -14F, 2F);

		bodyModel[252].addShapeBox(1F, 0F, 2F, 1, 8, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401 cs
		bodyModel[252].setRotationPoint(-5F, -14F, 3.75F);
		bodyModel[252].rotateAngleY = -0.52359878F;

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 402 cs ab
		bodyModel[253].setRotationPoint(-5F, -14F, 8F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 403 cs ab
		bodyModel[254].setRotationPoint(-5F, -12F, 6F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 404 cs ab
		bodyModel[255].setRotationPoint(-5F, -13F, 6F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -6F, 0F, -4F, -6F); // Box 408 cab pannel
		bodyModel[256].setRotationPoint(-5.49F, -19F, -1F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[257].setRotationPoint(-5.5F, -7.5F, 7F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 391 cab floor raised
		bodyModel[258].setRotationPoint(0.5F, -7.5F, 4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		bodyModel[259].setRotationPoint(-2.5F, -7.5F, -10F);

		bodyModel[260].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 372
		bodyModel[260].setRotationPoint(-2.5F, -10.5F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[261].setRotationPoint(3.5F, -8.5F, -10F);
		bodyModel[261].rotateAngleY = 0.52359878F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 375 cab pannel
		bodyModel[262].setRotationPoint(5.49F, -19F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[263].setRotationPoint(-3.5F, -14F, -10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[264].setRotationPoint(-3.5F, -12F, -10F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[265].setRotationPoint(-2F, -12F, 0.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[266].setRotationPoint(-4F, -14F, 0.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394
		bodyModel[267].setRotationPoint(-2.5F, -12.5F, 1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[268].setRotationPoint(-0.5F, -7.5F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 382
		bodyModel[269].setRotationPoint(-2.5F, -7.5F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 383
		bodyModel[270].setRotationPoint(-2.5F, -7.5F, -7F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 384
		bodyModel[271].setRotationPoint(4F, -14F, -9F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 385
		bodyModel[272].setRotationPoint(3F, -12F, -9F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[273].setRotationPoint(3F, -13F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 387
		bodyModel[274].setRotationPoint(1.35F, -17F, -3.99F);
		bodyModel[274].rotateAngleY = -0.52359878F;

		bodyModel[275].addShapeBox(0F, 0F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		bodyModel[275].setRotationPoint(0.85F, -17F, -4.86F);
		bodyModel[275].rotateAngleY = -0.52359878F;

		bodyModel[276].addBox(0F, 0F, 0F, 3, 4, 0, 0F); // Box 389
		bodyModel[276].setRotationPoint(2.35F, -17F, -2.25F);
		bodyModel[276].rotateAngleY = -0.52359878F;

		bodyModel[277].addShapeBox(1F, 0F, 2F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 390
		bodyModel[277].setRotationPoint(-0.15F, -14F, -6.6F);
		bodyModel[277].rotateAngleY = -0.52359878F;

		bodyModel[278].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 391
		bodyModel[278].setRotationPoint(1.35F, -14F, -4F);
		bodyModel[278].rotateAngleY = -0.52359878F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 118 cull
		bodyModel[279].setRotationPoint(-26.5F, -3F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -1F, 0F, 21F); // Box 124 cull
		bodyModel[280].setRotationPoint(-27.5F, 1F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -2F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, 21F); // Box 125 cull
		bodyModel[281].setRotationPoint(-28.5F, -3F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.51F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, -0.01F, 0F, -0.51F, -0.01F); // Box 118 battery
		bodyModel[282].setRotationPoint(-26F, -1.5F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[283].setRotationPoint(-29.5F, -11F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 17, 11, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -6F, 0F, -8F, -6F, 0F, -8F, -6F, 13.02F, 0F, -6F, 13.02F); // box03
		bodyModel[284].setRotationPoint(-47.5F, -16F, -7.01F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 17, 11, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -6F, 0F, -8F, -6F, 0F, -8F, -6F, 13.02F, 0F, -6F, 13.02F); // Box 400
		bodyModel[285].setRotationPoint(38.5F, -16F, -7.01F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[286].setRotationPoint(-50F, -18.75F, -1.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big medium
		bodyModel[287].setRotationPoint(-50.25F, -18.5F, -1.25F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam medium
		bodyModel[288].setRotationPoint(-50.25F, -18.75F, -0.75F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam medium
		bodyModel[289].setRotationPoint(-50.25F, -17.25F, -0.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[290].setRotationPoint(-51F, -18.75F, -1.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 147
		bodyModel[291].setRotationPoint(49F, -18.75F, -1.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big medium
		bodyModel[292].setRotationPoint(49.25F, -18.5F, -1.25F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam medium
		bodyModel[293].setRotationPoint(49.25F, -18.75F, -0.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam medium
		bodyModel[294].setRotationPoint(49.25F, -17.25F, -0.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[295].setRotationPoint(50F, -18.75F, -1.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 208
		bodyModel[296].setRotationPoint(48.5F, 8F, -11F);

		bodyModel[297].addBox(0F, 0F, 0F, 7, 0, 22, 0F); // Box 209
		bodyModel[297].setRotationPoint(-55.5F, 8F, -11F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 194 mu stepup box SINGLE
		bodyModel[298].setRotationPoint(-52.5F, -3F, -2F);

		bodyModel[299].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover SINGLE
		bodyModel[299].setRotationPoint(-52.5F, -3.5F, -2F);

		bodyModel[300].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover SINGLE
		bodyModel[300].setRotationPoint(-52.5F, -3.5F, -2F);

		bodyModel[301].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover DOUBLE
		bodyModel[301].setRotationPoint(-52.5F, -3.5F, -5F);

		bodyModel[302].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover DOUBLE
		bodyModel[302].setRotationPoint(-52.5F, -3.5F, -5F);

		bodyModel[303].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover DOUBLE
		bodyModel[303].setRotationPoint(-52.5F, -3.5F, 1F);

		bodyModel[304].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover DOUBLE
		bodyModel[304].setRotationPoint(-52.5F, -3.5F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 cull AIR MU DOUBLE cull
		bodyModel[305].setRotationPoint(-52.75F, -12F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 446 mu plug DOUBLE
		bodyModel[306].setRotationPoint(-53F, -3F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 technically a lamp
		bodyModel[307].setRotationPoint(-53.01F, -11.99F, -1F);

		bodyModel[308].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 449 AIR MU HOSE
		bodyModel[308].setRotationPoint(-52.75F, -11F, 0.5F);
		bodyModel[308].rotateAngleX = -0.10471976F;
		bodyModel[308].rotateAngleY = 0.64577182F;
		bodyModel[308].rotateAngleZ = -0.13962634F;

		bodyModel[309].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU HOSE
		bodyModel[309].setRotationPoint(-52.75F, -9F, 0.5F);
		bodyModel[309].rotateAngleY = 0.64577182F;
		bodyModel[309].rotateAngleZ = -0.13962634F;

		bodyModel[310].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU HOSE
		bodyModel[310].setRotationPoint(-52.75F, -7F, 0.5F);
		bodyModel[310].rotateAngleX = 0.10471976F;
		bodyModel[310].rotateAngleY = 0.64577182F;
		bodyModel[310].rotateAngleZ = -0.13962634F;

		bodyModel[311].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 194 mu stepup box SINGLE
		bodyModel[311].setRotationPoint(49.5F, -3F, -2F);

		bodyModel[312].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover SINGLE
		bodyModel[312].setRotationPoint(52.5F, -3.5F, -2F);

		bodyModel[313].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover SINGLE
		bodyModel[313].setRotationPoint(52.5F, -3.5F, -2F);

		bodyModel[314].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover DOUBLE
		bodyModel[314].setRotationPoint(52.5F, -3.5F, -5F);

		bodyModel[315].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover DOUBLE
		bodyModel[315].setRotationPoint(52.5F, -3.5F, -5F);

		bodyModel[316].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover DOUBLE
		bodyModel[316].setRotationPoint(52.5F, -3.5F, 1F);

		bodyModel[317].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover DOUBLE
		bodyModel[317].setRotationPoint(52.5F, -3.5F, 1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 447 mu plug DOUBLE
		bodyModel[318].setRotationPoint(52F, -3F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 444 cull AIR MU DOUBLE cull
		bodyModel[319].setRotationPoint(51.75F, -12F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 AIR MU DOUBLE technically a lamp
		bodyModel[320].setRotationPoint(52.01F, -11.99F, -1F);

		bodyModel[321].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 449 AIR MU HOSE
		bodyModel[321].setRotationPoint(52.75F, -11F, -0.5F);
		bodyModel[321].rotateAngleX = -0.10471976F;
		bodyModel[321].rotateAngleY = -2.49582083F;
		bodyModel[321].rotateAngleZ = -0.13962634F;

		bodyModel[322].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU HOSE
		bodyModel[322].setRotationPoint(52.75F, -9F, -0.5F);
		bodyModel[322].rotateAngleY = -2.49582083F;
		bodyModel[322].rotateAngleZ = -0.13962634F;

		bodyModel[323].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU HOSE
		bodyModel[323].setRotationPoint(52.75F, -7F, -0.5F);
		bodyModel[323].rotateAngleX = 0.10471976F;
		bodyModel[323].rotateAngleY = -2.49582083F;
		bodyModel[323].rotateAngleZ = -0.13962634F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[324].setRotationPoint(-54.5F, 6F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[325].setRotationPoint(-54.5F, 6F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[326].setRotationPoint(52.5F, 6F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[327].setRotationPoint(52.5F, 6F, -3F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 ELECTRIC MU TYPE 1
		bodyModel[328].setRotationPoint(-52.75F, -7F, 2.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[329].setRotationPoint(-53F, -7F, 2.75F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 ELECTRIC MU TYPE 1
		bodyModel[330].setRotationPoint(51.75F, -7F, -4.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 1
		bodyModel[331].setRotationPoint(52F, -7F, -4.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 431 cull
		bodyModel[332].setRotationPoint(-26.5F, -3F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, -0.01F, -1F, -0.51F, -0.01F, -1F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 435
		bodyModel[333].setRotationPoint(-26F, -1.5F, 7F);

		bodyModel[334].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover LOW
		bodyModel[334].setRotationPoint(-52.5F, -1F, -2F);

		bodyModel[335].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover LOW
		bodyModel[335].setRotationPoint(-52.5F, -1F, -2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[336].setRotationPoint(-52.75F, -8F, 3F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[337].setRotationPoint(-52.75F, -8F, 2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[338].setRotationPoint(-53F, -6.5F, 2.75F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[339].setRotationPoint(-53F, -7.75F, 2.75F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 441 ELECTRIC MU TYPE 2
		bodyModel[340].setRotationPoint(-52.75F, -8F, -5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 442 ELECTRIC MU TYPE 2
		bodyModel[341].setRotationPoint(-52.75F, -8F, -3F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ELECTRIC MU TYPE 2
		bodyModel[342].setRotationPoint(-53F, -6.5F, -4.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[343].setRotationPoint(-53F, -7.75F, -4.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[344].setRotationPoint(52F, -8F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 444 ELECTRIC MU TYPE 2
		bodyModel[345].setRotationPoint(52F, -8F, 2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[346].setRotationPoint(52.5F, -6.5F, 2.75F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190 ELECTRIC MU TYPE 2
		bodyModel[347].setRotationPoint(52.5F, -7.75F, 2.75F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 445 ELECTRIC MU TYPE 2
		bodyModel[348].setRotationPoint(52F, -8F, -5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 446 ELECTRIC MU TYPE 2
		bodyModel[349].setRotationPoint(52F, -8F, -3F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 447 ELECTRIC MU TYPE 2
		bodyModel[350].setRotationPoint(52.5F, -6.5F, -4.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 ELECTRIC MU TYPE 2
		bodyModel[351].setRotationPoint(52.5F, -7.75F, -4.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 AIR MU SINGLE
		bodyModel[352].setRotationPoint(-52.75F, -7F, 2.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 104F, -1F, 0F, 104F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 104F, 0F, -1F, 104F, -2F, 0F, 0F, -2F, 0F); // Box 116 cull
		bodyModel[353].setRotationPoint(-52.5F, -10F, -6F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 2F, 0F, 104F, 2F, 0F, 104F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 104F, -2F, 0F, 104F, 0F, -1F, 0F, 0F, -1F); // Box 116 cull
		bodyModel[354].setRotationPoint(-52.5F, -10F, 3F);

		bodyModel[355].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU SINGLE HOSE
		bodyModel[355].setRotationPoint(-52.75F, -7F, 5F);
		bodyModel[355].rotateAngleY = 0.64577182F;
		bodyModel[355].rotateAngleZ = -0.13962634F;

		bodyModel[356].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU SINGLE HOSE
		bodyModel[356].setRotationPoint(-52.75F, -5F, 5F);
		bodyModel[356].rotateAngleX = 0.10471976F;
		bodyModel[356].rotateAngleY = 0.64577182F;
		bodyModel[356].rotateAngleZ = -0.13962634F;

		bodyModel[357].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU SINGLE HOSE
		bodyModel[357].setRotationPoint(-52.75F, -7F, 3.5F);
		bodyModel[357].rotateAngleY = 0.64577182F;
		bodyModel[357].rotateAngleZ = -0.13962634F;

		bodyModel[358].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU SINGLE HOSE
		bodyModel[358].setRotationPoint(-52.75F, -5F, 3.5F);
		bodyModel[358].rotateAngleX = 0.10471976F;
		bodyModel[358].rotateAngleY = 0.64577182F;
		bodyModel[358].rotateAngleZ = -0.13962634F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 466 AIR MU SINGLE
		bodyModel[359].setRotationPoint(-52.75F, -7F, -5.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 188 AIR MU SINGLE cull
		bodyModel[360].setRotationPoint(-53.25F, -6.75F, -4.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 104F, 0F, 0F, 104F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 104F, 0F, 0F, 104F, 0F, -2F, 0F, 0F, -2F); // Box 188 AIR MU SINGLE cull
		bodyModel[361].setRotationPoint(-52.5F, -4F, 3F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -2F, 104F, 0F, -2F, 104F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 104F, 0F, -2F, 104F, 0F, 0F, 0F, 0F, 0F); // Box 469 AIR MU SINGLE cull
		bodyModel[362].setRotationPoint(-52.5F, -4F, -7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 AIR MU SINGLE technically a lamp
		bodyModel[363].setRotationPoint(-53.51F, -10.99F, 3.5F);
		bodyModel[363].rotateAngleX = -0.52359878F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 AIR MU SINGLE
		bodyModel[364].setRotationPoint(52F, -7F, 2.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 466 AIR MU SINGLE
		bodyModel[365].setRotationPoint(52F, -7F, -5.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 188 AIR MU SINGLE cull
		bodyModel[366].setRotationPoint(52.75F, -6.75F, 3.25F);

		bodyModel[367].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU SINGLE HOSE
		bodyModel[367].setRotationPoint(52.75F, -7F, -5F);
		bodyModel[367].rotateAngleY = -2.49582083F;
		bodyModel[367].rotateAngleZ = -0.13962634F;

		bodyModel[368].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU SINGLE HOSE
		bodyModel[368].setRotationPoint(52.75F, -5F, -5F);
		bodyModel[368].rotateAngleX = 0.10471976F;
		bodyModel[368].rotateAngleY = -2.49582083F;
		bodyModel[368].rotateAngleZ = -0.13962634F;

		bodyModel[369].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 450 AIR MU SINGLE HOSE
		bodyModel[369].setRotationPoint(52.75F, -7F, -3.5F);
		bodyModel[369].rotateAngleY = -2.49582083F;
		bodyModel[369].rotateAngleZ = -0.13962634F;

		bodyModel[370].addBox(-1F, 0F, 0F, 1, 6, 0, 0F); // Box 451 AIR MU SINGLE HOSE
		bodyModel[370].setRotationPoint(52.75F, -5F, -3.5F);
		bodyModel[370].rotateAngleX = 0.10471976F;
		bodyModel[370].rotateAngleY = -2.49582083F;
		bodyModel[370].rotateAngleZ = -0.13962634F;

		bodyModel[371].addBox(-0.5F, -3F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover LOW
		bodyModel[371].setRotationPoint(52.5F, -1F, -2F);

		bodyModel[372].addShapeBox(-0.5F, -4F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover LOW
		bodyModel[372].setRotationPoint(52.5F, -1F, -2F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 448 AIR MU SINGLE technically a lamp
		bodyModel[373].setRotationPoint(52.51F, -9.99F, -5.25F);
		bodyModel[373].rotateAngleX = 0.52359878F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal high
		bodyModel[374].setRotationPoint(49.25F, -21F, -1.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal high
		bodyModel[375].setRotationPoint(49.25F, -21F, 0F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal medium
		bodyModel[376].setRotationPoint(49.25F, -18F, -1.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal medium
		bodyModel[377].setRotationPoint(49.25F, -18F, 0F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal high
		bodyModel[378].setRotationPoint(-50.25F, -21F, 0F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal high
		bodyModel[379].setRotationPoint(-50.25F, -21F, -1.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal medium
		bodyModel[380].setRotationPoint(-50.25F, -18F, 0F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal medium
		bodyModel[381].setRotationPoint(-50.25F, -18F, -1.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 147
		bodyModel[382].setRotationPoint(49F, -18.25F, -1.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight rear big low
		bodyModel[383].setRotationPoint(49.25F, -18F, -1.25F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight rear 2beam low
		bodyModel[384].setRotationPoint(49.25F, -18.25F, -0.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight rear 2beam low
		bodyModel[385].setRotationPoint(49.25F, -16.75F, -0.75F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[386].setRotationPoint(50F, -18.25F, -1.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal low
		bodyModel[387].setRotationPoint(49.25F, -17.5F, -1.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F); // Box 171 headlight rear 2beam horizontal low
		bodyModel[388].setRotationPoint(49.25F, -17.5F, 0F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[389].setRotationPoint(-50F, -18.25F, -1.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big low
		bodyModel[390].setRotationPoint(-50.25F, -18F, -1.25F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam low
		bodyModel[391].setRotationPoint(-50.25F, -18.25F, -0.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam low
		bodyModel[392].setRotationPoint(-50.25F, -16.75F, -0.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring
		bodyModel[393].setRotationPoint(-51F, -18.25F, -1.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal low
		bodyModel[394].setRotationPoint(-50.25F, -17.5F, 0F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beam horizontal low
		bodyModel[395].setRotationPoint(-50.25F, -17.5F, -1.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F); // Box 35 SOO
		bodyModel[396].setRotationPoint(-4.5F, 2.25F, 10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.01F, 0F, -0.25F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507 SOO
		bodyModel[397].setRotationPoint(1.5F, 2.25F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0 SOO
		bodyModel[398].setRotationPoint(-16.5F, 2F, -9.01F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322 SOO
		bodyModel[399].setRotationPoint(14.5F, 2F, -7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0.01F, 0F, -0.25F, 0.01F); // Box 322 SOO cull
		bodyModel[400].setRotationPoint(14.5F, 2.5F, -10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 322 SOO
		bodyModel[401].setRotationPoint(14F, 3.25F, 10.01F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 329 SOO
		bodyModel[402].setRotationPoint(12F, 4F, 10.01F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 514 SOO
		bodyModel[403].setRotationPoint(16F, 2F, 9.01F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0 SOO cull
		bodyModel[404].setRotationPoint(11F, 3F, -10F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0 SOO cull
		bodyModel[405].setRotationPoint(11F, 2F, -8F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,-0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F); // Box 0 SOO
		bodyModel[406].setRotationPoint(-15F, 3F, -10.01F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 SOO
		bodyModel[407].setRotationPoint(-15.25F, 3F, -10.01F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 322 SOO
		bodyModel[408].setRotationPoint(-15.5F, 2F, 7F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.01F, -1F, -0.5F, 0.01F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322 SOO cull
		bodyModel[409].setRotationPoint(-15.75F, 2.5F, -10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 5, 4, 0, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F); // Box 0 SOO and RT624
		bodyModel[410].setRotationPoint(-13.75F, 2.5F, -8.01F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 SOO
		bodyModel[411].setRotationPoint(-15.75F, 2F, -8.01F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 345 SOO
		bodyModel[412].setRotationPoint(-12.5F, 4F, 8F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.15F, -3F, 0F, 0.15F, -3F, 0F, 0F, -0.5F, 0F); // Box 345 SOO
		bodyModel[413].setRotationPoint(-12.5F, 4F, 10.01F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345 SOO
		bodyModel[414].setRotationPoint(-11.25F, 2.36F, 10.01F);
		bodyModel[414].rotateAngleZ = 0.67195176F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0 RT624 cull
		bodyModel[415].setRotationPoint(12.25F, 2.5F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 RT624
		bodyModel[416].setRotationPoint(12F, 2.5F, -10F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 0 RT624
		bodyModel[417].setRotationPoint(-14F, 2.5F, -10.01F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 322 RT624
		bodyModel[418].setRotationPoint(-13.75F, 3F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 0, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.01F, 0F, -1F, 0.01F); // Box 322 RT624
		bodyModel[419].setRotationPoint(-13.75F, 2.5F, -8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F); // Box 322 RT624
		bodyModel[420].setRotationPoint(12.5F, 3.75F, 10.01F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.01F, 0F, -0.5F, 0.01F); // Box 322 RT624 cull
		bodyModel[421].setRotationPoint(14F, 2.5F, -10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 539 RT624
		bodyModel[422].setRotationPoint(14F, 2F, 7.01F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 540 RT624 cull
		bodyModel[423].setRotationPoint(-12.75F, 2.5F, 8.01F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540 RT624
		bodyModel[424].setRotationPoint(-12.25F, 2F, 9.25F);
		bodyModel[424].rotateAngleY = -0.78539816F;

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 540 RT624
		bodyModel[425].setRotationPoint(-13.9F, 2F, 9.25F);
		bodyModel[425].rotateAngleY = -0.78539816F;

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 540 RT624
		bodyModel[426].setRotationPoint(-12.75F, 2F, 9.01F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0 RT624
		bodyModel[427].setRotationPoint(12.25F, 2.5F, -9.01F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 545 RT624 MN&S
		bodyModel[428].setRotationPoint(12.25F, 2.5F, -10.01F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 546 RT624 MN&S
		bodyModel[429].setRotationPoint(12.25F, 2F, -9.01F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F); // Box 0 RT624 MN&S
		bodyModel[430].setRotationPoint(11F, 3F, -10.01F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, 0F, -1F, 0F); // Box 0 RT624 MN&S
		bodyModel[431].setRotationPoint(-13.75F, 2.5F, -8.01F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0 RT624 MN&S
		bodyModel[432].setRotationPoint(-12F, 2.5F, -10.01F);

		bodyModel[433].addBox(0F, 0F, 0F, 19, 1, 20, 0F); // Box 0
		bodyModel[433].setRotationPoint(-9.5F, 6F, -10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 387 side numberboard FR glow
		bodyModel[434].setRotationPoint(-37.5F, -21F, 7.01F);
		bodyModel[434].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 387 side numberboard BR glow
		bodyModel[435].setRotationPoint(33.5F, -21F, 7.01F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 558 RT624
		bodyModel[436].setRotationPoint(-43.5F, -23F, -5F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 559 RT624
		bodyModel[437].setRotationPoint(42.5F, -23F, 4F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F); // Box 2
		bodyModel[438].setRotationPoint(46.85F, -20.5F, 7.55F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F); // Box 245 numberboard type 2
		bodyModel[439].setRotationPoint(47.15F, -20F, 8.44F);
		bodyModel[439].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F); // Box 562 Numberboard type 2
		bodyModel[440].setRotationPoint(47.15F, -20F, -8.44F);
		bodyModel[440].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 563
		bodyModel[441].setRotationPoint(46.85F, -20.5F, -8.55F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, -1F); // Box 2
		bodyModel[442].setRotationPoint(-49.9F, -20.5F, 7.55F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F, 0F, 0F, 0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.765F); // Box 245 numberboard type 2
		bodyModel[443].setRotationPoint(-49.2F, -20F, 8.44F);
		bodyModel[443].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F, 0F, 0F, -0.765F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.765F); // Box 562 Numberboard type 2
		bodyModel[444].setRotationPoint(-49.2F, -20F, -8.44F);
		bodyModel[444].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 563
		bodyModel[445].setRotationPoint(-49.9F, -20.5F, -8.55F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 2
		bodyModel[446].setRotationPoint(48.75F, -20.5F, -7.2F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight Type 2 glow
		bodyModel[447].setRotationPoint(50.3F, -20F, -6.7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight Type 2 glow
		bodyModel[448].setRotationPoint(49.45F, -20F, -7.2F);
		bodyModel[448].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 571
		bodyModel[449].setRotationPoint(48.75F, -20.5F, 5.2F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight Type 2 glow
		bodyModel[450].setRotationPoint(50.3F, -20F, 5.75F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight Type 2 glow
		bodyModel[451].setRotationPoint(49.45F, -20F, 6.95F);
		bodyModel[451].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 2
		bodyModel[452].setRotationPoint(-50.5F, -20.5F, -7.2F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F); // Box 571
		bodyModel[453].setRotationPoint(-50.5F, -20.5F, 5.2F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight Type 2 glow
		bodyModel[454].setRotationPoint(-51.35F, -20F, 5.75F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight Type 2 glow
		bodyModel[455].setRotationPoint(-50.5F, -20F, 6.95F);
		bodyModel[455].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Markerlight Type 2 glow
		bodyModel[456].setRotationPoint(-51.35F, -20F, -6.75F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Markerlight Type 2 glow
		bodyModel[457].setRotationPoint(-50.5F, -20F, -7.25F);
		bodyModel[457].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 13.02F, -0.5F, 0F, 13.02F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13.02F, -0.5F, 0F, 13.02F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 582 side numberboard Type 2 BL glow
		bodyModel[458].setRotationPoint(38.5F, -19.5F, 6.01F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 582 side numberboard Type 2 FL glow
		bodyModel[459].setRotationPoint(-41F, -19.5F, -7.01F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[460].setRotationPoint(-51.5F, -20.99F, -0.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[461].setRotationPoint(-51.5F, -21.99F, -0.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[462].setRotationPoint(-51.25F, -20.49F, -0.25F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0.01F, 0F, -0.45F, 0.01F, 0F, 0F, 0F, 0F); // Box 189 holder
		bodyModel[463].setRotationPoint(-51.5F, -22F, -0.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[464].setRotationPoint(50.5F, -20.99F, -0.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[465].setRotationPoint(50.5F, -21.99F, -0.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[466].setRotationPoint(50.75F, -20.49F, -0.25F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-0.45F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.01F, 0F, -0.45F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0.01F, 0F); // Box 189 holder
		bodyModel[467].setRotationPoint(48.5F, -22F, -0.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 90 EJ&E numberboard cull
		bodyModel[468].setRotationPoint(49.76F, -18.5F, -2.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 90 EJ&E numberboard cull
		bodyModel[469].setRotationPoint(-50.01F, -18.5F, -2.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.04F, 0F, 0.5F, -0.917F, 0F, 0F, -0.96F, 0F, -0.5F, -0.04F, 0F, -0.5F, -0.04F, 0F, 0.5F, -0.917F, 0F, 0F, -0.96F, 0F, -0.5F, -0.04F, 0F, -0.5F); // Box 90
		bodyModel[470].setRotationPoint(49.92F, -15F, 0F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.917F, 0F, 0F, -0.04F, 0F, 0.5F, -0.04F, 0F, -0.5F, -0.96F, 0F, -0.5F, -0.917F, 0F, 0F, -0.04F, 0F, 0.5F, -0.04F, 0F, -0.5F, -0.96F, 0F, -0.5F); // Box 90
		bodyModel[471].setRotationPoint(-50.92F, -15F, 0F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[472].setRotationPoint(50.35F, -18.99F, -4.01F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[473].setRotationPoint(50.35F, -19.99F, -4.01F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[474].setRotationPoint(50.6F, -18.49F, -3.76F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.315F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.395F, 0F, 0F, -0.315F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.395F, -0.25F, 0F); // Box 189 holder
		bodyModel[475].setRotationPoint(49.35F, -20.75F, -4.01F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.395F, 0F, 0F, -0.315F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.395F, -0.25F, 0F, -0.315F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 601 holder
		bodyModel[476].setRotationPoint(-51.35F, -20.75F, 3.01F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[477].setRotationPoint(-51.35F, -18.99F, 3.01F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[478].setRotationPoint(-51.35F, -19.99F, 3.01F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[479].setRotationPoint(-51.1F, -18.49F, 3.26F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 110 ATSF numberboard
		bodyModel[480].setRotationPoint(48.85F, -22.5F, -2F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, -0.825F, 0F, -0.25F, -0.825F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.825F, -0.25F, -0.25F, -0.825F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 110 ATSF numberboard
		bodyModel[481].setRotationPoint(49.85F, -16.25F, -2F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.15F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F); // Box 110 ATSF numberboard
		bodyModel[482].setRotationPoint(-49.85F, -22.5F, -2F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, -0.825F, 0F, -0.25F, -0.825F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.825F, -0.25F, -0.25F, -0.825F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 110 ATSF numberboard
		bodyModel[483].setRotationPoint(-50.02F, -16.25F, -2F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[484].setRotationPoint(-49.75F, -20.25F, 7.25F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[485].setRotationPoint(-49.75F, -19.75F, 7.75F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[486].setRotationPoint(-49.25F, -19.75F, 8.95F);
		bodyModel[486].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[487].setRotationPoint(-49.25F, -18.5F, 6.75F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 613
		bodyModel[488].setRotationPoint(-49.75F, -20.25F, -9.25F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
		bodyModel[489].setRotationPoint(-49.25F, -18.5F, -8.75F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[490].setRotationPoint(-49.75F, -19.75F, -8.75F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[491].setRotationPoint(-49.25F, -19.75F, -9.25F);
		bodyModel[491].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[492].setRotationPoint(47.75F, -20.25F, 7.25F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[493].setRotationPoint(47.75F, -19.75F, 7.75F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[494].setRotationPoint(48.25F, -19.75F, 8.95F);
		bodyModel[494].setLightSourceFace(LightSourceFaceDirection.POSITIVE_Z);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[495].setRotationPoint(48.25F, -18.5F, 6.75F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 613
		bodyModel[496].setRotationPoint(47.75F, -20.25F, -9.25F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
		bodyModel[497].setRotationPoint(48.25F, -18.5F, -8.75F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Glow
		bodyModel[498].setRotationPoint(47.75F, -19.75F, -8.75F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box Glow
		bodyModel[499].setRotationPoint(48.25F, -19.75F, -9.25F);
		bodyModel[499].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 46, 3, textureX, textureY); // Box 175 radiator fill extension
		bodyModel[501] = new ModelRendererTurbo(this, 303, 19, textureX, textureY); // Box 175 radiator fill extension
		bodyModel[502] = new ModelRendererTurbo(this, 43, 9, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[503] = new ModelRendererTurbo(this, 300, 25, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[504] = new ModelRendererTurbo(this, 237, 7, textureX, textureY); // Box 219 stack extension
		bodyModel[505] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 219 stack extension
		bodyModel[506] = new ModelRendererTurbo(this, 214, 12, textureX, textureY); // box64
		bodyModel[507] = new ModelRendererTurbo(this, 214, 22, textureX, textureY); // box65
		bodyModel[508] = new ModelRendererTurbo(this, 130, 2, textureX, textureY); // Box 183
		bodyModel[509] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 426
		bodyModel[510] = new ModelRendererTurbo(this, 146, 16, textureX, textureY); // Box 426
		bodyModel[511] = new ModelRendererTurbo(this, 99, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[512] = new ModelRendererTurbo(this, 94, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[513] = new ModelRendererTurbo(this, 200, 136, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[514] = new ModelRendererTurbo(this, 252, 136, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[515] = new ModelRendererTurbo(this, 200, 133, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[516] = new ModelRendererTurbo(this, 252, 133, textureX, textureY); // Box 35 SSW cope geometry
		bodyModel[517] = new ModelRendererTurbo(this, 218, 5, textureX, textureY); // Box 133 3 pane window
		bodyModel[518] = new ModelRendererTurbo(this, 218, 26, textureX, textureY); // Box 553 3 pane window
		bodyModel[519] = new ModelRendererTurbo(this, 110, 6, textureX, textureY); // Box 405 air whistle
		bodyModel[520] = new ModelRendererTurbo(this, 283, 26, textureX, textureY); // Box 405 air whistle
		bodyModel[521] = new ModelRendererTurbo(this, 54, 9, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[522] = new ModelRendererTurbo(this, 266, 4, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[523] = new ModelRendererTurbo(this, 193, 1, textureX, textureY,"cull"); // Box 3 cull
		bodyModel[524] = new ModelRendererTurbo(this, 193, 22, textureX, textureY,"cull"); // Box 311 cull
		bodyModel[525] = new ModelRendererTurbo(this, 254, 13, textureX, textureY); // Box 315 EJ&E engine heater?
		bodyModel[526] = new ModelRendererTurbo(this, 259, 3, textureX, textureY); // Box 315 EJ&E engine heater?
		bodyModel[527] = new ModelRendererTurbo(this, 266, 9, textureX, textureY); // Box 315 EJ&E engine heater?
		bodyModel[528] = new ModelRendererTurbo(this, 267, 14, textureX, textureY); // Box 315 EJ&E engine heater?
		bodyModel[529] = new ModelRendererTurbo(this, 67, 10, textureX, textureY); // Box 183
		bodyModel[530] = new ModelRendererTurbo(this, 65, 4, textureX, textureY); // Box 184
		bodyModel[531] = new ModelRendererTurbo(this, 295, 26, textureX, textureY); // Box 266
		bodyModel[532] = new ModelRendererTurbo(this, 293, 20, textureX, textureY); // Box 267
		bodyModel[533] = new ModelRendererTurbo(this, 137, 27, textureX, textureY); // box03 small dynamics
		bodyModel[534] = new ModelRendererTurbo(this, 124, 31, textureX, textureY); // box03 small dynamics
		bodyModel[535] = new ModelRendererTurbo(this, 317, 37, textureX, textureY,"cull"); // box03 small dynamics cull
		bodyModel[536] = new ModelRendererTurbo(this, 436, 2, textureX, textureY); // box03 small dynamics
		bodyModel[537] = new ModelRendererTurbo(this, 120, 25, textureX, textureY); // box03 small dynamics
		bodyModel[538] = new ModelRendererTurbo(this, 138, 19, textureX, textureY); // Box 183
		bodyModel[539] = new ModelRendererTurbo(this, 137, 16, textureX, textureY); // Box 184
		bodyModel[540] = new ModelRendererTurbo(this, 143, 11, textureX, textureY); // Box 183
		bodyModel[541] = new ModelRendererTurbo(this, 139, 8, textureX, textureY); // Box 184
		bodyModel[542] = new ModelRendererTurbo(this, 143, 18, textureX, textureY,"cull"); // Box 418 cull platform atsf
		bodyModel[543] = new ModelRendererTurbo(this, 146, 21, textureX, textureY); // Box 426
		bodyModel[544] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 448 awning
		bodyModel[545] = new ModelRendererTurbo(this, 197, 14, textureX, textureY); // Box 449 awning
		bodyModel[546] = new ModelRendererTurbo(this, 16, 241, textureX, textureY); // Box 22
		bodyModel[547] = new ModelRendererTurbo(this, 39, 241, textureX, textureY); // Box 23
		bodyModel[548] = new ModelRendererTurbo(this, 3, 233, textureX, textureY); // Box 4
		bodyModel[549] = new ModelRendererTurbo(this, 52, 233, textureX, textureY); // Box 322
		bodyModel[550] = new ModelRendererTurbo(this, 5, 221, textureX, textureY); // Box 438
		bodyModel[551] = new ModelRendererTurbo(this, 50, 221, textureX, textureY); // Box 439
		bodyModel[552] = new ModelRendererTurbo(this, 20, 231, textureX, textureY); // Box 448
		bodyModel[553] = new ModelRendererTurbo(this, 39, 231, textureX, textureY); // Box 323
		bodyModel[554] = new ModelRendererTurbo(this, 20, 221, textureX, textureY); // Box 280
		bodyModel[555] = new ModelRendererTurbo(this, 39, 221, textureX, textureY); // Box 285
		bodyModel[556] = new ModelRendererTurbo(this, 223, 240, textureX, textureY); // Box 431
		bodyModel[557] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 432
		bodyModel[558] = new ModelRendererTurbo(this, 187, 233, textureX, textureY); // Box 441
		bodyModel[559] = new ModelRendererTurbo(this, 234, 221, textureX, textureY); // Box 442
		bodyModel[560] = new ModelRendererTurbo(this, 189, 221, textureX, textureY); // Box 443
		bodyModel[561] = new ModelRendererTurbo(this, 247, 223, textureX, textureY); // Box 554
		bodyModel[562] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 517
		bodyModel[563] = new ModelRendererTurbo(this, 223, 230, textureX, textureY); // Box 518
		bodyModel[564] = new ModelRendererTurbo(this, 204, 230, textureX, textureY); // Box 519
		bodyModel[565] = new ModelRendererTurbo(this, 204, 220, textureX, textureY); // Box 520
		bodyModel[566] = new ModelRendererTurbo(this, 26, 89, textureX, textureY); // Box 147 trona
		bodyModel[567] = new ModelRendererTurbo(this, 28, 98, textureX, textureY,"headlight_trona_big"); // Box 169 headlight front big Trona
		bodyModel[568] = new ModelRendererTurbo(this, 17, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring trona
		bodyModel[569] = new ModelRendererTurbo(this, 17, 96, textureX, textureY,"headlight_trona_F1"); // Box 171 headlight front 2beamTrona
		bodyModel[570] = new ModelRendererTurbo(this, 24, 96, textureX, textureY,"headlight_trona_F2"); // Box 172 headlight front 2beamTrona
		bodyModel[571] = new ModelRendererTurbo(this, 244, 89, textureX, textureY); // Box 147 trona
		bodyModel[572] = new ModelRendererTurbo(this, 244, 98, textureX, textureY,"backlight_trona_big"); // Box 169 headlight front big Trona
		bodyModel[573] = new ModelRendererTurbo(this, 255, 89, textureX, textureY,"cull"); // Box 358 cull headlight ring trona
		bodyModel[574] = new ModelRendererTurbo(this, 257, 96, textureX, textureY,"backlight_trona_F1"); // Box 171 headlight front 2beamTrona
		bodyModel[575] = new ModelRendererTurbo(this, 250, 96, textureX, textureY,"backlight_trona_F2"); // Box 172 headlight front 2beamTrona
		bodyModel[576] = new ModelRendererTurbo(this, 154, 12, textureX, textureY); // Box 364 prime base
		bodyModel[577] = new ModelRendererTurbo(this, 154, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[578] = new ModelRendererTurbo(this, 163, 4, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[579] = new ModelRendererTurbo(this, 154, 2, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[580] = new ModelRendererTurbo(this, 163, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[581] = new ModelRendererTurbo(this, 229, 21, textureX, textureY,"cull"); // Box 219 spark arrestor cull
		bodyModel[582] = new ModelRendererTurbo(this, 91, 4, textureX, textureY,"cull"); // Box 219 spark arrestor cull
		bodyModel[583] = new ModelRendererTurbo(this, 119, 10, textureX, textureY); // Box 354
		bodyModel[584] = new ModelRendererTurbo(this, 118, 13, textureX, textureY); // Box 356
		bodyModel[585] = new ModelRendererTurbo(this, 283, 20, textureX, textureY); // Box 716
		bodyModel[586] = new ModelRendererTurbo(this, 282, 17, textureX, textureY); // Box 717
		bodyModel[587] = new ModelRendererTurbo(this, 129, 10, textureX, textureY); // Box 354
		bodyModel[588] = new ModelRendererTurbo(this, 128, 7, textureX, textureY); // Box 356
		bodyModel[589] = new ModelRendererTurbo(this, 130, 4, textureX, textureY); // Box 359
		bodyModel[590] = new ModelRendererTurbo(this, 272, 17, textureX, textureY); // Box 721
		bodyModel[591] = new ModelRendererTurbo(this, 271, 20, textureX, textureY); // Box 722
		bodyModel[592] = new ModelRendererTurbo(this, 273, 23, textureX, textureY); // Box 723
		bodyModel[593] = new ModelRendererTurbo(this, 294, 23, textureX, textureY); // Box 721
		bodyModel[594] = new ModelRendererTurbo(this, 294, 17, textureX, textureY); // Box 723
		bodyModel[595] = new ModelRendererTurbo(this, 66, 1, textureX, textureY); // Box 727
		bodyModel[596] = new ModelRendererTurbo(this, 66, 7, textureX, textureY); // Box 728
		bodyModel[597] = new ModelRendererTurbo(this, 149, 15, textureX, textureY); // Box 409 commander base
		bodyModel[598] = new ModelRendererTurbo(this, 149, 11, textureX, textureY,"commander"); // Box 410 commander beacon
		bodyModel[599] = new ModelRendererTurbo(this, 154, 16, textureX, textureY); // Box 183
		bodyModel[600] = new ModelRendererTurbo(this, 150, 8, textureX, textureY); // Box 426
		bodyModel[601] = new ModelRendererTurbo(this, 249, 18, textureX, textureY); // Box 426
		bodyModel[602] = new ModelRendererTurbo(this, 361, 22, textureX, textureY); // Box 404
		bodyModel[603] = new ModelRendererTurbo(this, 354, 17, textureX, textureY); // Box 405
		bodyModel[604] = new ModelRendererTurbo(this, 264, 89, textureX, textureY); // Box 400
		bodyModel[605] = new ModelRendererTurbo(this, 307, 89, textureX, textureY); // Box 400
		bodyModel[606] = new ModelRendererTurbo(this, 175, 96, textureX, textureY); // Box 739 prr trainphone
		bodyModel[607] = new ModelRendererTurbo(this, 176, 89, textureX, textureY); // Box 739 prr trainphone
		bodyModel[608] = new ModelRendererTurbo(this, 176, 93, textureX, textureY); // Box 739 prr trainphone
		bodyModel[609] = new ModelRendererTurbo(this, 97, 96, textureX, textureY); // Box 743 prr trainphone
		bodyModel[610] = new ModelRendererTurbo(this, 98, 89, textureX, textureY); // Box 743 prr trainphone
		bodyModel[611] = new ModelRendererTurbo(this, 98, 93, textureX, textureY); // Box 743 prr trainphone
		bodyModel[612] = new ModelRendererTurbo(this, 6, 13, textureX, textureY); // Box 293 prr trainphone
		bodyModel[613] = new ModelRendererTurbo(this, 1, 12, textureX, textureY,"cull"); // Box 293 prr trainphone cull
		bodyModel[614] = new ModelRendererTurbo(this, 254, 30, textureX, textureY); // Box 747 prr trainphone
		bodyModel[615] = new ModelRendererTurbo(this, 339, 30, textureX, textureY,"cull"); // Box 748 prr trainphone cull
		bodyModel[616] = new ModelRendererTurbo(this, 303, 215, textureX, textureY); // Box 217
		bodyModel[617] = new ModelRendererTurbo(this, 245, 139, textureX, textureY,"cull"); // Box 683 cull
		bodyModel[618] = new ModelRendererTurbo(this, 245, 134, textureX, textureY,"cull"); // Box 684 cull
		bodyModel[619] = new ModelRendererTurbo(this, 252, 139, textureX, textureY,"cull"); // Box 685 cull
		bodyModel[620] = new ModelRendererTurbo(this, 159, 244, textureX, textureY,"cull"); // Box 686 cull
		bodyModel[621] = new ModelRendererTurbo(this, 159, 249, textureX, textureY,"cull"); // Box 687 cull
		bodyModel[622] = new ModelRendererTurbo(this, 159, 241, textureX, textureY,"cull"); // Box 688 cull
		bodyModel[623] = new ModelRendererTurbo(this, 28, 174, textureX, textureY); // Box 217
		bodyModel[624] = new ModelRendererTurbo(this, 28, 194, textureX, textureY); // Box 34
		bodyModel[625] = new ModelRendererTurbo(this, 290, 214, textureX, textureY); // Box 217
		bodyModel[626] = new ModelRendererTurbo(this, 279, 229, textureX, textureY); // Box 34
		bodyModel[627] = new ModelRendererTurbo(this, 310, 166, textureX, textureY); // Box 34
		bodyModel[628] = new ModelRendererTurbo(this, 301, 159, textureX, textureY); // Box 273
		bodyModel[629] = new ModelRendererTurbo(this, 310, 159, textureX, textureY); // Box 274
		bodyModel[630] = new ModelRendererTurbo(this, 301, 166, textureX, textureY); // Box 34
		bodyModel[631] = new ModelRendererTurbo(this, 106, 93, textureX, textureY,"markerlight_type4_front_1"); // Box 743 prr markerlight F
		bodyModel[632] = new ModelRendererTurbo(this, 106, 90, textureX, textureY,"markerlight_type4_front_2"); // Box 633 prr markerlight F
		bodyModel[633] = new ModelRendererTurbo(this, 170, 93, textureX, textureY,"markerlight_type4_back_1"); // Box 633 prr markerlight R
		bodyModel[634] = new ModelRendererTurbo(this, 170, 90, textureX, textureY,"markerlight_type4_back_2"); // Box 633 prr markerlight R
		bodyModel[635] = new ModelRendererTurbo(this, 122, 181, textureX, textureY); // Box 114
		bodyModel[636] = new ModelRendererTurbo(this, 122, 178, textureX, textureY); // Box 74
		bodyModel[637] = new ModelRendererTurbo(this, 122, 184, textureX, textureY); // Box 78
		bodyModel[638] = new ModelRendererTurbo(this, 113, 115, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[639] = new ModelRendererTurbo(this, 352, 1, textureX, textureY,"cull"); // Box 175 cull
		bodyModel[640] = new ModelRendererTurbo(this, 126, 3, textureX, textureY); // Box 426
		bodyModel[641] = new ModelRendererTurbo(this, 137, 34, textureX, textureY); // box03 small dynamics
		bodyModel[642] = new ModelRendererTurbo(this, 84, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[643] = new ModelRendererTurbo(this, 109, 118, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[644] = new ModelRendererTurbo(this, 415, 214, textureX, textureY); // Box 16
		bodyModel[645] = new ModelRendererTurbo(this, 361, 24, textureX, textureY,"cull"); // Box 404 cull
		bodyModel[646] = new ModelRendererTurbo(this, 328, 214, textureX, textureY); // Box 16
		bodyModel[647] = new ModelRendererTurbo(this, 362, 110, textureX, textureY); // Box 400 fuck you EJ&E
		bodyModel[648] = new ModelRendererTurbo(this, 319, 159, textureX, textureY); // box03 fuck you EJ&E
		bodyModel[649] = new ModelRendererTurbo(this, 247, 117, textureX, textureY,"numberboard_type4_front_L"); // Box 649 side numberboard FL glow
		bodyModel[650] = new ModelRendererTurbo(this, 341, 104, textureX, textureY,"numberboard_type4_back_L"); // Box 650 side numberboard BL glow
		bodyModel[651] = new ModelRendererTurbo(this, 249, 111, textureX, textureY,"numberboard_type3_front_R"); // Box 653 side numberboard Type 2 FR glow
		bodyModel[652] = new ModelRendererTurbo(this, 341, 115, textureX, textureY,"numberboard_type3_back_R"); // Box 654 side numberboard Type 2 BR glow

		bodyModel[500].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 175 radiator fill extension
		bodyModel[500].setRotationPoint(-43.5F, -24F, 4F);

		bodyModel[501].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 175 radiator fill extension
		bodyModel[501].setRotationPoint(42.5F, -24F, -5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175 cull
		bodyModel[502].setRotationPoint(-44.5F, -22.5F, 3.75F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175 cull
		bodyModel[503].setRotationPoint(41.5F, -22.5F, -5.25F);

		bodyModel[504].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 219 stack extension
		bodyModel[504].setRotationPoint(16F, -26F, 2.5F);

		bodyModel[505].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 219 stack extension
		bodyModel[505].setRotationPoint(-18F, -26F, -4.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[506].setRotationPoint(-3F, -20F, 11F);
		bodyModel[506].rotateAngleX = 0.36651914F;

		bodyModel[507].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[507].setRotationPoint(-3F, -20.25F, -11.97F);
		bodyModel[507].rotateAngleX = -0.36651914F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[508].setRotationPoint(-10F, -23F, 0F);

		bodyModel[509].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[509].setRotationPoint(7F, -24F, 0F);

		bodyModel[510].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[510].setRotationPoint(-4.5F, -25F, 0F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 21F, 1F, 0F, 21F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 21F, -1F, 0F, 21F); // Box 186 cull
		bodyModel[511].setRotationPoint(8.5F, -13F, -11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[512].setRotationPoint(-9.5F, -13F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, -1.66F, 0F, -0.98F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0.01F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[513].setRotationPoint(-10.5F, -4F, -11.01F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.98F, 0F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[514].setRotationPoint(6.5F, -4F, -11.01F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, -1.66F, 0F, -0.98F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.98F, 0.01F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[515].setRotationPoint(-10.5F, -4F, 10.99F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -1.66F, 0F, 0F, -1.66F, 0F, -0.98F, 0F, 0F, -0.98F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.98F, 0F, 0F, -0.98F); // Box 35 SSW cope geometry
		bodyModel[516].setRotationPoint(6.5F, -4F, 10.99F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 133 3 pane window
		bodyModel[517].setRotationPoint(-1.88F, -19F, 10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 553 3 pane window
		bodyModel[518].setRotationPoint(-1.88F, -19F, -11F);

		bodyModel[519].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 air whistle
		bodyModel[519].setRotationPoint(-18.25F, -24F, 1.5F);
		bodyModel[519].rotateAngleY = 1.57079633F;

		bodyModel[520].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 405 air whistle
		bodyModel[520].setRotationPoint(17.25F, -24F, -4.5F);
		bodyModel[520].rotateAngleY = 1.57079633F;

		bodyModel[521].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175 cull
		bodyModel[521].setRotationPoint(-44.5F, -22.5F, -5.25F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175 cull
		bodyModel[522].setRotationPoint(41.5F, -22.5F, 3.75F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull
		bodyModel[523].setRotationPoint(-3.5F, -19F, 10F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 cull
		bodyModel[524].setRotationPoint(-3.5F, -19F, -15F);

		bodyModel[525].addBox(0F, 0F, 0F, 4, 12, 4, 0F); // Box 315 EJ&E engine heater?
		bodyModel[525].setRotationPoint(6.5F, -15F, -11F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 315 EJ&E engine heater?
		bodyModel[526].setRotationPoint(7F, -23F, -8F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 315 EJ&E engine heater?
		bodyModel[527].setRotationPoint(6.5F, -23.25F, -8.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315 EJ&E engine heater?
		bodyModel[528].setRotationPoint(10.75F, -19F, -7.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[529].setRotationPoint(-38F, -22.5F, 3.75F);

		bodyModel[530].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[530].setRotationPoint(-40F, -23.5F, 3.75F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 266
		bodyModel[531].setRotationPoint(37F, -22.5F, -4.75F);

		bodyModel[532].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 267
		bodyModel[532].setRotationPoint(37F, -23.5F, -4.75F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03 small dynamics
		bodyModel[533].setRotationPoint(-13.5F, -21F, 7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // box03 small dynamics
		bodyModel[534].setRotationPoint(-13.5F, -23.5F, -1.5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 15.02F, 0F, 0F, 15.02F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 15.02F, 0F, -5F, 15.02F); // box03 small dynamics cull
		bodyModel[535].setRotationPoint(-13.5F, -23F, -8.01F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03 small dynamics
		bodyModel[536].setRotationPoint(-13.5F, -23F, -8F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // box03 small dynamics
		bodyModel[537].setRotationPoint(-14F, -24.25F, -2F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[538].setRotationPoint(-3.5F, -23.5F, 1F);

		bodyModel[539].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[539].setRotationPoint(-5.5F, -24.5F, 1F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
		bodyModel[540].setRotationPoint(2.5F, -23.5F, -2F);

		bodyModel[541].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 184
		bodyModel[541].setRotationPoint(2.5F, -24.5F, -2F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 418 cull platform atsf
		bodyModel[542].setRotationPoint(1.5F, -23F, -9F);

		bodyModel[543].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[543].setRotationPoint(3F, -25F, -6F);

		bodyModel[544].addShapeBox(0F, 0F, -2F, 7, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448 awning
		bodyModel[544].setRotationPoint(-3.5F, -20F, -11F);
		bodyModel[544].rotateAngleX = 0.38397244F;

		bodyModel[545].addShapeBox(0F, 0F, 0F, 7, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449 awning
		bodyModel[545].setRotationPoint(-3.5F, -20F, 11F);
		bodyModel[545].rotateAngleX = -0.38397244F;

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 22
		bodyModel[546].setRotationPoint(-56.5F, 7F, 0F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[547].setRotationPoint(-56.5F, 7F, -10F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[548].setRotationPoint(-55.5F, 6F, 0F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[549].setRotationPoint(-55.5F, 6F, -10F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 438
		bodyModel[550].setRotationPoint(-55.5F, 5F, 0F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[551].setRotationPoint(-55.5F, 5F, -10F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[552].setRotationPoint(-55.5F, 5F, 2F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[553].setRotationPoint(-55.5F, 5F, -10F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[554].setRotationPoint(-55.5F, 4F, 2F);

		bodyModel[555].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[555].setRotationPoint(-55.5F, 4F, -8F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 431
		bodyModel[556].setRotationPoint(55.5F, 7F, 0F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 432
		bodyModel[557].setRotationPoint(55.5F, 7F, -10F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 441
		bodyModel[558].setRotationPoint(54.5F, 6F, -10F);

		bodyModel[559].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 442
		bodyModel[559].setRotationPoint(55.5F, 5F, 0F);

		bodyModel[560].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 443
		bodyModel[560].setRotationPoint(55.5F, 5F, -10F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 554
		bodyModel[561].setRotationPoint(54.5F, 6F, 0F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[562].setRotationPoint(54.5F, 4F, 2F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 518
		bodyModel[563].setRotationPoint(54.5F, 5F, 2F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[564].setRotationPoint(54.5F, 5F, -10F);

		bodyModel[565].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[565].setRotationPoint(54.5F, 4F, -8F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 147 trona
		bodyModel[566].setRotationPoint(-51.5F, -22.25F, -1.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big Trona
		bodyModel[567].setRotationPoint(-51.75F, -22F, -1.25F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring trona
		bodyModel[568].setRotationPoint(-52.5F, -22.25F, -1.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beamTrona
		bodyModel[569].setRotationPoint(-51.75F, -21.5F, -1.5F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 172 headlight front 2beamTrona
		bodyModel[570].setRotationPoint(-51.75F, -21.5F, 0F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 147 trona
		bodyModel[571].setRotationPoint(49F, -22.25F, -1.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big Trona
		bodyModel[572].setRotationPoint(51F, -22F, -1.25F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 358 cull headlight ring trona
		bodyModel[573].setRotationPoint(50.75F, -22.25F, -1.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 171 headlight front 2beamTrona
		bodyModel[574].setRotationPoint(51F, -21.5F, 0F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, -0.5F, -0.55F); // Box 172 headlight front 2beamTrona
		bodyModel[575].setRotationPoint(51F, -21.5F, -1.5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[576].setRotationPoint(-1F, -24F, -1F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[577].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[578].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[579].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[580].setRotationPoint(-1F, -24.5F, -1F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -3F, 0F, -3F, -3F); // Box 219 spark arrestor cull
		bodyModel[581].setRotationPoint(15.5F, -25F, 2F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, -3F, 0F, -3F, -3F); // Box 219 spark arrestor cull
		bodyModel[582].setRotationPoint(-18.5F, -25F, -5F);

		bodyModel[583].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[583].setRotationPoint(-18.5F, -23.5F, 3.5F);

		bodyModel[584].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[584].setRotationPoint(-19.5F, -23.5F, 1.5F);

		bodyModel[585].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 716
		bodyModel[585].setRotationPoint(15.5F, -23.5F, -4.5F);

		bodyModel[586].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 717
		bodyModel[586].setRotationPoint(15.5F, -23.5F, -2.5F);

		bodyModel[587].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[587].setRotationPoint(-19F, -23.5F, 1.5F);

		bodyModel[588].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[588].setRotationPoint(-19.5F, -23.5F, 2.5F);

		bodyModel[589].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[589].setRotationPoint(-18F, -23.5F, 3.5F);

		bodyModel[590].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 721
		bodyModel[590].setRotationPoint(16F, -23.5F, -2.5F);

		bodyModel[591].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 722
		bodyModel[591].setRotationPoint(15.5F, -23.5F, -3.5F);

		bodyModel[592].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 723
		bodyModel[592].setRotationPoint(16F, -23.5F, -4.5F);

		bodyModel[593].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 721
		bodyModel[593].setRotationPoint(36F, -23.5F, -5.75F);

		bodyModel[594].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 723
		bodyModel[594].setRotationPoint(37F, -23.5F, -3.75F);

		bodyModel[595].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 727
		bodyModel[595].setRotationPoint(-38F, -23.5F, 4.75F);

		bodyModel[596].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 728
		bodyModel[596].setRotationPoint(-39F, -23.5F, 2.75F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[597].setRotationPoint(-0.5F, -24F, -0.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[598].setRotationPoint(-0.5F, -25F, -0.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[599].setRotationPoint(1.5F, -24F, 0F);

		bodyModel[600].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[600].setRotationPoint(-0.5F, -25F, 0F);

		bodyModel[601].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[601].setRotationPoint(17F, -24F, 0F);

		bodyModel[602].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404
		bodyModel[602].setRotationPoint(-49F, -26F, 0F);

		bodyModel[603].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405
		bodyModel[603].setRotationPoint(-50.5F, -24F, -2F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 13.02F, 0F, 0F, 13.02F); // Box 400
		bodyModel[604].setRotationPoint(-48.5F, -20F, -7.01F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 20, 13, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 13.02F, 0F, 0F, 13.02F); // Box 400
		bodyModel[605].setRotationPoint(38.5F, -20F, -7.01F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.885F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.82F, 0F, -0.125F, -0.885F, -0.25F, -0.125F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, -0.82F, -0.25F, -0.125F); // Box 739 prr trainphone
		bodyModel[606].setRotationPoint(48.77F, -20.5F, 4F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 739 prr trainphone
		bodyModel[607].setRotationPoint(50.75F, -23F, 4.25F);
		bodyModel[607].rotateAngleZ = -0.78539816F;

		bodyModel[608].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.625F, -0.25F, -0.2F, -0.625F); // Box 739 prr trainphone
		bodyModel[608].setRotationPoint(49.75F, -21.3F, 4.25F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.125F, -0.82F, 0F, -0.125F, -0.885F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -1F, -0.125F, -0.82F, -0.25F, -0.125F, -0.885F, -0.25F, -0.125F, 0F, -1F, -0.125F); // Box 743 prr trainphone
		bodyModel[609].setRotationPoint(-51.77F, -20.5F, -5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 743 prr trainphone
		bodyModel[610].setRotationPoint(-50.75F, -23F, -5.25F);
		bodyModel[610].rotateAngleZ = -0.78539816F;

		bodyModel[611].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, -0.2F, -0.625F, -0.25F, -0.2F, -0.625F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F); // Box 743 prr trainphone
		bodyModel[611].setRotationPoint(-51.75F, -21.3F, -5.25F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 42, 3, 0, 0F,0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F); // Box 293 prr trainphone
		bodyModel[612].setRotationPoint(-48.5F, -25F, 4F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 40.99F, 0F, -1F, 40.99F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 40.99F, 0F, 1F, 40.99F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 293 prr trainphone cull
		bodyModel[613].setRotationPoint(-48.5F, -25F, 3F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 42, 3, 0, 0F,-0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F); // Box 747 prr trainphone
		bodyModel[614].setRotationPoint(6.5F, -25F, -4F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,40.99F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 40.99F, 0F, -1F, 40.99F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1F, 40.99F, 0F, 1F); // Box 748 prr trainphone cull
		bodyModel[615].setRotationPoint(47.5F, -25F, -4F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 0, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[616].setRotationPoint(48.51F, -8F, -12F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, 20.99F, 0F, 0F, 20.99F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 21F, 0F, -0.5F, 21F); // Box 683 cull
		bodyModel[617].setRotationPoint(6.5F, -4.5F, -11F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 21F, -0.5F, 0F, 21F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 20.99F, -0.5F, -0.5F, 20.99F); // Box 684 cull
		bodyModel[618].setRotationPoint(6F, -7F, -11F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 21F, -0.5F, 0F, 21F, -0.5F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, 21F, -0.5F, -0.5F, 21F); // Box 685 cull
		bodyModel[619].setRotationPoint(7.5F, -4.5F, -11F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 686 cull
		bodyModel[620].setRotationPoint(48.5F, 2F, -8F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F); // Box 687 cull
		bodyModel[621].setRotationPoint(48.5F, 5F, -9F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F); // Box 688 cull
		bodyModel[622].setRotationPoint(48.5F, 1F, -7F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[623].setRotationPoint(-47.5F, 1F, 11F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[624].setRotationPoint(-47.5F, 1F, -11F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 217
		bodyModel[625].setRotationPoint(43.5F, 1F, 11F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[626].setRotationPoint(43.5F, 1F, -11F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[627].setRotationPoint(12.5F, 2F, -11F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[628].setRotationPoint(-16.5F, 2F, 11F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[629].setRotationPoint(12.5F, 2F, 11F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[630].setRotationPoint(-16.5F, 2F, -11F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.41F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 743 prr markerlight F
		bodyModel[631].setRotationPoint(-50.17F, -17F, -5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.41F, 0F, 0F, 0F, 0F, 0F); // Box 633 prr markerlight F
		bodyModel[632].setRotationPoint(-50.17F, -17F, 4F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 633 prr markerlight R
		bodyModel[633].setRotationPoint(49.17F, -17F, -5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, 0F); // Box 633 prr markerlight R
		bodyModel[634].setRotationPoint(49.17F, -17F, 4F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F); // Box 114
		bodyModel[635].setRotationPoint(-17F, 2.75F, -10.25F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[636].setRotationPoint(-17F, 2F, -10.25F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[637].setRotationPoint(-16.75F, 3F, -10F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175 cull
		bodyModel[638].setRotationPoint(-48.5F, -22.5F, -3.5F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175 cull
		bodyModel[639].setRotationPoint(39.5F, -22.5F, -3.5F);

		bodyModel[640].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 426
		bodyModel[640].setRotationPoint(-18F, -24F, 2F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03 small dynamics
		bodyModel[641].setRotationPoint(-13.5F, -21F, -8F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 21F, -2F, -1F, 21F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 21F, 0F, 1F, 21F); // Box 186 cull
		bodyModel[642].setRotationPoint(-43.5F, -11F, -11F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 21F, 1F, 0F, 21F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 21F, -1F, 0F, 21F); // Box 186 cull
		bodyModel[643].setRotationPoint(42.5F, -11F, -11F);

		bodyModel[644].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 16
		bodyModel[644].setRotationPoint(-41.5F, -3F, -11F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.25F, 0F); // Box 404 cull
		bodyModel[645].setRotationPoint(-50F, -23F, -1.5F);

		bodyModel[646].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 16
		bodyModel[646].setRotationPoint(20.5F, -3F, -11F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 13.02F, 0F, -5.5F, 13.02F); // Box 400 fuck you EJ&E
		bodyModel[647].setRotationPoint(41.5F, -17.5F, -7.01F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 13.02F, 0F, -5.5F, 13.02F); // box03 fuck you EJ&E
		bodyModel[648].setRotationPoint(-47.5F, -17.5F, -7.01F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 649 side numberboard FL glow
		bodyModel[649].setRotationPoint(-37.5F, -21F, -7.01F);
		bodyModel[649].setLightSourceFace(LightSourceFaceDirection.NEGATIVE_Z);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 8, 4, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F); // Box 650 side numberboard BL glow
		bodyModel[650].setRotationPoint(33.5F, -21F, -7.01F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 653 side numberboard Type 2 FR glow
		bodyModel[651].setRotationPoint(-41F, -19.5F, 7.01F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 3, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 13.02F, 0F, 0F, 13.02F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 13.02F, 0F, 0F, 13.02F); // Box 654 side numberboard Type 2 BR glow
		bodyModel[652].setRotationPoint(38.5F, -19.5F, -6.01F);
	}
	ModelBLW_commonwealth_c bogie = new ModelBLW_commonwealth_c();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 12) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_EJ&E_green_fric_cutout.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 1234) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_silver_roller.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_roller.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_fric_cutout.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_fric_bulge.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 16 || GetColor(entity) == 17 || GetColor(entity) == 33) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_silver_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/blw_commonwealth_c_black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(1.93F, -0.005F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(3.86F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}