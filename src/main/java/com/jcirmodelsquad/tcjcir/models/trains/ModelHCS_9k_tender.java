//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.06.2024 - 09:24:36
// Last changed on: 11.06.2024 - 09:24:36

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelASF_crown_LS_truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelHCS_9k_tender extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelHCS_9k_tender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[171];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 7, 208, textureX, textureY, "cull"); // Box cull deck
		bodyModel[1] = new ModelRendererTurbo(this, 11, 22, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[2] = new ModelRendererTurbo(this, 11, 27, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[3] = new ModelRendererTurbo(this, 11, 32, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[4] = new ModelRendererTurbo(this, 11, 37, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[5] = new ModelRendererTurbo(this, 2, 22, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[6] = new ModelRendererTurbo(this, 2, 27, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[7] = new ModelRendererTurbo(this, 2, 32, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[8] = new ModelRendererTurbo(this, 2, 37, textureX, textureY, "cull"); // Box cull ladder
		bodyModel[9] = new ModelRendererTurbo(this, 147, 35, textureX, textureY); // Box 440
		bodyModel[10] = new ModelRendererTurbo(this, 147, 40, textureX, textureY); // Box 441
		bodyModel[11] = new ModelRendererTurbo(this, 149, 20, textureX, textureY); // Box 442
		bodyModel[12] = new ModelRendererTurbo(this, 143, 5, textureX, textureY); // Box 443
		bodyModel[13] = new ModelRendererTurbo(this, 154, 20, textureX, textureY); // Box 444
		bodyModel[14] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 445
		bodyModel[15] = new ModelRendererTurbo(this, 14, 9, textureX, textureY); // Box 446
		bodyModel[16] = new ModelRendererTurbo(this, 83, 144, textureX, textureY); // Box 465
		bodyModel[17] = new ModelRendererTurbo(this, 108, 158, textureX, textureY); // Box 468
		bodyModel[18] = new ModelRendererTurbo(this, 102, 146, textureX, textureY); // Box 470
		bodyModel[19] = new ModelRendererTurbo(this, 4, 172, textureX, textureY); // Box 483
		bodyModel[20] = new ModelRendererTurbo(this, 4, 178, textureX, textureY); // Box 484
		bodyModel[21] = new ModelRendererTurbo(this, 16, 83, textureX, textureY); // Box 485
		bodyModel[22] = new ModelRendererTurbo(this, 90, 223, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 185, 222, textureX, textureY); // Box 51
		bodyModel[24] = new ModelRendererTurbo(this, 182, 222, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 197, 174, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 183, 201, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 164, 201, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 150, 191, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 10, 117, textureX, textureY); // Box 198
		bodyModel[30] = new ModelRendererTurbo(this, 1, 184, textureX, textureY, "cull"); // Box 394 cull walkway
		bodyModel[31] = new ModelRendererTurbo(this, 41, 165, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 4, 165, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 101, 72, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 1, 194, textureX, textureY, "cull"); // Box 68 cull tender handrails
		bodyModel[35] = new ModelRendererTurbo(this, 30, 214, textureX, textureY, "cull"); // Box cull tender handrails
		bodyModel[36] = new ModelRendererTurbo(this, 46, 212, textureX, textureY, "cull"); // Box cull tender handrails
		bodyModel[37] = new ModelRendererTurbo(this, 102, 8, textureX, textureY); // Box epsee frontals
		bodyModel[38] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Box epsee frontals
		bodyModel[39] = new ModelRendererTurbo(this, 95, 5, textureX, textureY); // Box epsee frontals
		bodyModel[40] = new ModelRendererTurbo(this, 95, 1, textureX, textureY); // Box epsee frontals
		bodyModel[41] = new ModelRendererTurbo(this, 93, 9, textureX, textureY, "lamp"); // Box epsee frontals glow
		bodyModel[42] = new ModelRendererTurbo(this, 113, 7, textureX, textureY); // Box epsee frontals
		bodyModel[43] = new ModelRendererTurbo(this, 136, 14, textureX, textureY); // Box frontals
		bodyModel[44] = new ModelRendererTurbo(this, 139, 1, textureX, textureY, "lamp"); // Box 205 glow
		bodyModel[45] = new ModelRendererTurbo(this, 104, 1, textureX, textureY); // Box 206
		bodyModel[46] = new ModelRendererTurbo(this, 148, 1, textureX, textureY); // Box 207
		bodyModel[47] = new ModelRendererTurbo(this, 139, 11, textureX, textureY); // Box 208
		bodyModel[48] = new ModelRendererTurbo(this, 146, 12, textureX, textureY); // Box 209
		bodyModel[49] = new ModelRendererTurbo(this, 146, 8, textureX, textureY); // Box 210
		bodyModel[50] = new ModelRendererTurbo(this, 139, 8, textureX, textureY); // Box 211
		bodyModel[51] = new ModelRendererTurbo(this, 90, 18, textureX, textureY); // Box 2
		bodyModel[52] = new ModelRendererTurbo(this, 93, 19, textureX, textureY); // Box 2
		bodyModel[53] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 86
		bodyModel[54] = new ModelRendererTurbo(this, 14, 3, textureX, textureY); // Box 87
		bodyModel[55] = new ModelRendererTurbo(this, 110, 34, textureX, textureY); // Box 1086
		bodyModel[56] = new ModelRendererTurbo(this, 114, 14, textureX, textureY); // Box 341
		bodyModel[57] = new ModelRendererTurbo(this, 130, 25, textureX, textureY); // Box 378
		bodyModel[58] = new ModelRendererTurbo(this, 208, 219, textureX, textureY); // Box 91
		bodyModel[59] = new ModelRendererTurbo(this, 178, 172, textureX, textureY); // Box 92
		bodyModel[60] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 93
		bodyModel[61] = new ModelRendererTurbo(this, 195, 196, textureX, textureY); // Box coal tender guard bits
		bodyModel[62] = new ModelRendererTurbo(this, 122, 202, textureX, textureY); // Box coal tender guard bits
		bodyModel[63] = new ModelRendererTurbo(this, 115, 224, textureX, textureY); // Box coal tender guard bits
		bodyModel[64] = new ModelRendererTurbo(this, 199, 221, textureX, textureY); // Box 99
		bodyModel[65] = new ModelRendererTurbo(this, 199, 231, textureX, textureY); // Box 100
		bodyModel[66] = new ModelRendererTurbo(this, 132, 223, textureX, textureY); // Box 101
		bodyModel[67] = new ModelRendererTurbo(this, 177, 221, textureX, textureY); // Box coal tender guard bits
		bodyModel[68] = new ModelRendererTurbo(this, 172, 221, textureX, textureY); // Box coal tender guard bits
		bodyModel[69] = new ModelRendererTurbo(this, 167, 221, textureX, textureY); // Box coal tender guard bits
		bodyModel[70] = new ModelRendererTurbo(this, 162, 221, textureX, textureY); // Box coal tender guard bits
		bodyModel[71] = new ModelRendererTurbo(this, 240, 219, textureX, textureY); // Box 106
		bodyModel[72] = new ModelRendererTurbo(this, 202, 206, textureX, textureY); // Box 107
		bodyModel[73] = new ModelRendererTurbo(this, 202, 213, textureX, textureY); // Box 108
		bodyModel[74] = new ModelRendererTurbo(this, 233, 219, textureX, textureY); // Box 109
		bodyModel[75] = new ModelRendererTurbo(this, 112, 100, textureX, textureY); // Box 110
		bodyModel[76] = new ModelRendererTurbo(this, 127, 66, textureX, textureY); // Box 111
		bodyModel[77] = new ModelRendererTurbo(this, 129, 2, textureX, textureY); // Box 31
		bodyModel[78] = new ModelRendererTurbo(this, 122, 2, textureX, textureY, "lamp").setLightFixtureId("rear_headlight"); // Box 248 headlight rear
		bodyModel[79] = new ModelRendererTurbo(this, 3, 113, textureX, textureY); // Box oiltank var2 (upfit)
		bodyModel[80] = new ModelRendererTurbo(this, 143, 203, textureX, textureY); // Box 112
		bodyModel[81] = new ModelRendererTurbo(this, 192, 185, textureX, textureY); // Box 277
		bodyModel[82] = new ModelRendererTurbo(this, 189, 183, textureX, textureY); // Box 355 brakewheel
		bodyModel[83] = new ModelRendererTurbo(this, 225, 183, textureX, textureY); // Box 115
		bodyModel[84] = new ModelRendererTurbo(this, 181, 1, textureX, textureY); // Box 116
		bodyModel[85] = new ModelRendererTurbo(this, 78, 128, textureX, textureY); // Box 117
		bodyModel[86] = new ModelRendererTurbo(this, 78, 121, textureX, textureY); // Box 118
		bodyModel[87] = new ModelRendererTurbo(this, 218, 1, textureX, textureY); // Box 119
		bodyModel[88] = new ModelRendererTurbo(this, 166, 1, textureX, textureY, "lamp"); // Box 284 glow
		bodyModel[89] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Box 285
		bodyModel[90] = new ModelRendererTurbo(this, 166, 1, textureX, textureY, "lamp"); // Box 284 glow
		bodyModel[91] = new ModelRendererTurbo(this, 167, 5, textureX, textureY); // Box 287
		bodyModel[92] = new ModelRendererTurbo(this, 141, 173, textureX, textureY); // Box 124
		bodyModel[93] = new ModelRendererTurbo(this, 144, 165, textureX, textureY); // Box 125
		bodyModel[94] = new ModelRendererTurbo(this, 144, 169, textureX, textureY); // Box 126
		bodyModel[95] = new ModelRendererTurbo(this, 71, 184, textureX, textureY, "cull"); // Box cull handgrabs
		bodyModel[96] = new ModelRendererTurbo(this, 140, 192, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 71, 194, textureX, textureY, "cull"); // Box cull handgrabs
		bodyModel[98] = new ModelRendererTurbo(this, 140, 182, textureX, textureY); // Box 130
		bodyModel[99] = new ModelRendererTurbo(this, 154, 106, textureX, textureY, "cull"); // Box cull
		bodyModel[100] = new ModelRendererTurbo(this, 165, 106, textureX, textureY, "cull"); // Box cull
		bodyModel[101] = new ModelRendererTurbo(this, 198, 30, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 207, 30, textureX, textureY); // Box 137
		bodyModel[103] = new ModelRendererTurbo(this, 207, 30, textureX, textureY); // Box 138
		bodyModel[104] = new ModelRendererTurbo(this, 198, 30, textureX, textureY); // Box 139
		bodyModel[105] = new ModelRendererTurbo(this, 227, 27, textureX, textureY, "cull"); // Box cull tank steppies
		bodyModel[106] = new ModelRendererTurbo(this, 216, 27, textureX, textureY, "cull"); // Box cull tank steppies
		bodyModel[107] = new ModelRendererTurbo(this, 166, 27, textureX, textureY); // Box 142
		bodyModel[108] = new ModelRendererTurbo(this, 147, 27, textureX, textureY); // Box 143
		bodyModel[109] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 28
		bodyModel[110] = new ModelRendererTurbo(this, 185, 30, textureX, textureY); // Box 145
		bodyModel[111] = new ModelRendererTurbo(this, 113, 1, textureX, textureY, "cull"); // Box espee interwar light
		bodyModel[112] = new ModelRendererTurbo(this, 59, 154, textureX, textureY); // Box 148
		bodyModel[113] = new ModelRendererTurbo(this, 54, 154, textureX, textureY); // Box 149
		bodyModel[114] = new ModelRendererTurbo(this, 215, 18, textureX, textureY); // Box 286
		bodyModel[115] = new ModelRendererTurbo(this, 226, 18, textureX, textureY); // Box 287
		bodyModel[116] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box cull brakecyl holder
		bodyModel[117] = new ModelRendererTurbo(this, 46, 223, textureX, textureY, "cull"); // Box cull pipos
		bodyModel[118] = new ModelRendererTurbo(this, 161, 100, textureX, textureY); // Box 151
		bodyModel[119] = new ModelRendererTurbo(this, 175, 135, textureX, textureY); // Box 152
		bodyModel[120] = new ModelRendererTurbo(this, 181, 159, textureX, textureY); // Box 153
		bodyModel[121] = new ModelRendererTurbo(this, 175, 74, textureX, textureY); // Box 159
		bodyModel[122] = new ModelRendererTurbo(this, 181, 52, textureX, textureY); // Box 160
		bodyModel[123] = new ModelRendererTurbo(this, 147, 63, textureX, textureY); // Box 161
		bodyModel[124] = new ModelRendererTurbo(this, 147, 148, textureX, textureY); // Box 162
		bodyModel[125] = new ModelRendererTurbo(this, 141, 87, textureX, textureY); // Box 163
		bodyModel[126] = new ModelRendererTurbo(this, 141, 121, textureX, textureY); // Box 164
		bodyModel[127] = new ModelRendererTurbo(this, 115, 146, textureX, textureY); // Box 165
		bodyModel[128] = new ModelRendererTurbo(this, 128, 144, textureX, textureY); // Box 166
		bodyModel[129] = new ModelRendererTurbo(this, 102, 169, textureX, textureY); // Box 167
		bodyModel[130] = new ModelRendererTurbo(this, 83, 167, textureX, textureY); // Box 168
		bodyModel[131] = new ModelRendererTurbo(this, 115, 169, textureX, textureY); // Box 169
		bodyModel[132] = new ModelRendererTurbo(this, 128, 167, textureX, textureY); // Box 170
		bodyModel[133] = new ModelRendererTurbo(this, 87, 157, textureX, textureY); // Box 171
		bodyModel[134] = new ModelRendererTurbo(this, 132, 157, textureX, textureY); // Box 172
		bodyModel[135] = new ModelRendererTurbo(this, 1, 141, textureX, textureY); // Box oil tanker var 2 (as delivered)
		bodyModel[136] = new ModelRendererTurbo(this, 7, 122, textureX, textureY); // Box 179
		bodyModel[137] = new ModelRendererTurbo(this, 7, 118, textureX, textureY); // Box 180
		bodyModel[138] = new ModelRendererTurbo(this, 86, 23, textureX, textureY, "cull"); // Box cull pipes
		bodyModel[139] = new ModelRendererTurbo(this, 197, 172, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 231, 200, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 231, 196, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 227, 208, textureX, textureY); // Box coal tender guard bits
		bodyModel[143] = new ModelRendererTurbo(this, 227, 211, textureX, textureY); // Box coal tender guard bits
		bodyModel[144] = new ModelRendererTurbo(this, 227, 205, textureX, textureY); // Box coal tender guard bits
		bodyModel[145] = new ModelRendererTurbo(this, 227, 31, textureX, textureY, "cull"); // Box cull tank steppies
		bodyModel[146] = new ModelRendererTurbo(this, 216, 31, textureX, textureY, "cull"); // Box cull tank steppies
		bodyModel[147] = new ModelRendererTurbo(this, 1, 236, textureX, textureY, "cull"); // Box 519 cull
		bodyModel[148] = new ModelRendererTurbo(this, 27, 52, textureX, textureY); // Box coal
		bodyModel[149] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box coal
		bodyModel[150] = new ModelRendererTurbo(this, 30, 60, textureX, textureY); // Box coal
		bodyModel[151] = new ModelRendererTurbo(this, 1, 60, textureX, textureY); // Box coal
		bodyModel[152] = new ModelRendererTurbo(this, 195, 200, textureX, textureY); // Box coal tender guard bits
		bodyModel[153] = new ModelRendererTurbo(this, 38, 49, textureX, textureY); // Box coal
		bodyModel[154] = new ModelRendererTurbo(this, 91, 25, textureX, textureY); // Box 157
		bodyModel[155] = new ModelRendererTurbo(this, 2, 96, textureX, textureY); // Box 158
		bodyModel[156] = new ModelRendererTurbo(this, 70, 208, textureX, textureY, "cull"); // Box cull tender handrails
		bodyModel[157] = new ModelRendererTurbo(this, 1, 86, textureX, textureY); // Box oiltank var2 (upfit)
		bodyModel[158] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box oil tanker var 2 (as delivered)
		bodyModel[159] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box stokerbit
		bodyModel[160] = new ModelRendererTurbo(this, 64, 10, textureX, textureY); // Box fncc rear'ds
		bodyModel[161] = new ModelRendererTurbo(this, 57, 14, textureX, textureY); // Box fncc rear'ds glow
		bodyModel[162] = new ModelRendererTurbo(this, 52, 8, textureX, textureY); // Box fncc rear'ds glow
		bodyModel[163] = new ModelRendererTurbo(this, 66, 3, textureX, textureY); // Box fncc rear'ds
		bodyModel[164] = new ModelRendererTurbo(this, 60, 4, textureX, textureY); // Box fncc rear'ds
		bodyModel[165] = new ModelRendererTurbo(this, 25, 16, textureX, textureY, "cull"); // Box cull deck support
		bodyModel[166] = new ModelRendererTurbo(this, 166, 101, textureX, textureY, "cull"); // Box cull small steppa
		bodyModel[167] = new ModelRendererTurbo(this, 158, 101, textureX, textureY, "cull"); // Box cull small steppa
		bodyModel[168] = new ModelRendererTurbo(this, 83, 104, textureX, textureY); // Box LETTeurs
		bodyModel[169] = new ModelRendererTurbo(this, 23, 97, textureX, textureY); // Box water extendodingle
		bodyModel[170] = new ModelRendererTurbo(this, 80, 210, textureX, textureY, "cull"); // Box cull

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull deck
		bodyModel[0].setRotationPoint(-27F, -2.5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[1].setRotationPoint(-27F, -2.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[2].setRotationPoint(-27F, 0.5F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[3].setRotationPoint(-27F, 3.5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[4].setRotationPoint(-27F, 6.5F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[5].setRotationPoint(-27F, -2.5F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[6].setRotationPoint(-27F, 0.5F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[7].setRotationPoint(-27F, 3.5F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box cull ladder
		bodyModel[8].setRotationPoint(-27F, 6.5F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 51, 2, 2, 0F); // Box 440
		bodyModel[9].setRotationPoint(-24.5F, 3F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 51, 2, 2, 0F); // Box 441
		bodyModel[10].setRotationPoint(-24.5F, 3F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[11].setRotationPoint(25.5F, 2F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 19, 0F); // Box 443
		bodyModel[12].setRotationPoint(25.5F, 2F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[13].setRotationPoint(25.5F, 2F, 9.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 445
		bodyModel[14].setRotationPoint(28.5F, 3F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 446
		bodyModel[15].setRotationPoint(27.5F, 3F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, -1F, -3.5F, -1F, -1F, -3.5F, -1F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.66F, -0.5F, -1F, 0.66F, -0.5F, 0.5F, 0.66F, -2.75F, 0F, 0.66F, -2.75F); // Box 465
		bodyModel[16].setRotationPoint(26.01F, -12F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, -0.16F, 0F, 0.5F, -0.16F, 0F, 0.5F, -0.16F, 0.5F, 0F, -0.16F, 0.5F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0.5F, 0.34F, 0.5F, 0F, 0.34F, 0.5F); // Box 468
		bodyModel[17].setRotationPoint(26.01F, -7.5F, -2.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, -1.35F, -0.5F, -1F, -1.35F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[18].setRotationPoint(26.01F, -12.34F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483
		bodyModel[19].setRotationPoint(-6F, -2F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 484
		bodyModel[20].setRotationPoint(-6F, -2F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[21].setRotationPoint(-6F, -8.5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[22].setRotationPoint(-24F, -2.5F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		bodyModel[23].setRotationPoint(-22F, -18.5F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 53
		bodyModel[24].setRotationPoint(-22F, -18.5F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[25].setRotationPoint(-24F, -16.5F, -11.01F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[26].setRotationPoint(-23F, -13.5F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[27].setRotationPoint(-23F, -13.5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[28].setRotationPoint(-23F, -13.5F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 3, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[29].setRotationPoint(-6F, -20.5F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 31, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394 cull walkway
		bodyModel[30].setRotationPoint(-6F, -13.25F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[31].setRotationPoint(11F, 2.5F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[32].setRotationPoint(11F, 2.5F, 5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 15, 0F,0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-22.99F, -3.5F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 31, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68 cull tender handrails
		bodyModel[34].setRotationPoint(-6F, -18.25F, -3.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box cull tender handrails
		bodyModel[35].setRotationPoint(7F, -18.25F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box cull tender handrails
		bodyModel[36].setRotationPoint(16F, -17.25F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[37].setRotationPoint(22.5F, -15.25F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[38].setRotationPoint(23.5F, -16.25F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[39].setRotationPoint(22.5F, -15.75F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box epsee frontals
		bodyModel[40].setRotationPoint(22.5F, -15.75F, 1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box epsee frontals glow
		bodyModel[41].setRotationPoint(24.75F, -16.25F, -1.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box epsee frontals
		bodyModel[42].setRotationPoint(24.5F, -16.25F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box frontals
		bodyModel[43].setRotationPoint(26.5F, -10.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 205 glow
		bodyModel[44].setRotationPoint(27.75F, -13.5F, -1.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[45].setRotationPoint(26.5F, -13.5F, -1.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 207
		bodyModel[46].setRotationPoint(27.5F, -13.5F, -1.5F);

		bodyModel[47].addShapeBox(-0.35F, 0F, -0.05F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[47].setRotationPoint(26.5F, -12.5F, 1.5F);
		bodyModel[47].rotateAngleY = -0.4712389F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 209
		bodyModel[48].setRotationPoint(26.5F, -13F, 1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[49].setRotationPoint(26.5F, -13F, -2.5F);

		bodyModel[50].addShapeBox(-0.35F, 0F, -0.95F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 211
		bodyModel[50].setRotationPoint(26.5F, -12.5F, -1.5F);
		bodyModel[50].rotateAngleY = 0.4712389F;

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 17, 0F); // Box 2
		bodyModel[51].setRotationPoint(27.51F, 9F, -8.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 7, 17, 0F); // Box 2
		bodyModel[52].setRotationPoint(27.51F, 2F, -8.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 86
		bodyModel[53].setRotationPoint(-26.5F, 3F, -6F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 87
		bodyModel[54].setRotationPoint(-28.5F, 3F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1086
		bodyModel[55].setRotationPoint(27F, 0.5F, -9.5F);

		bodyModel[56].addBox(0F, -3F, 0F, 0, 3, 16, 0F); // Box 341
		bodyModel[56].setRotationPoint(28.5F, 4.5F, -8F);
		bodyModel[56].rotateAngleZ = 0.27925268F;

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 378
		bodyModel[57].setRotationPoint(27.25F, 2F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 14, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[58].setRotationPoint(-21F, -16.5F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F,0F, -5.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -5.5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F); // Box 92
		bodyModel[59].setRotationPoint(-18F, -8.5F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[60].setRotationPoint(-7F, -16.5F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box coal tender guard bits
		bodyModel[61].setRotationPoint(-21F, -18.5F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box coal tender guard bits
		bodyModel[62].setRotationPoint(-21F, -18.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box coal tender guard bits
		bodyModel[63].setRotationPoint(-7F, -18.5F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 99
		bodyModel[64].setRotationPoint(-20.5F, -16.5F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[65].setRotationPoint(-20.5F, -16.5F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 101
		bodyModel[66].setRotationPoint(-21F, -3.5F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box coal tender guard bits
		bodyModel[67].setRotationPoint(-21F, -18.5F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box coal tender guard bits
		bodyModel[68].setRotationPoint(-21F, -18.5F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box coal tender guard bits
		bodyModel[69].setRotationPoint(-7F, -18.5F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box coal tender guard bits
		bodyModel[70].setRotationPoint(-7F, -18.5F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 106
		bodyModel[71].setRotationPoint(-20.5F, -8.5F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, -0.5F, 0F, 0.5F, -0.5F); // Box 107
		bodyModel[72].setRotationPoint(-18F, -8.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, -5F, -0.5F, 0.5F, -5F, 0F, 0F, 0.5F, 0F); // Box 108
		bodyModel[73].setRotationPoint(-18F, -8.5F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[74].setRotationPoint(-20.5F, -8.5F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 5, 15, 0F,0F, -5.06F, 0F, 0.5F, -0.16F, 0F, 0.5F, -0.16F, 0F, 0F, -5.06F, 0F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 110
		bodyModel[75].setRotationPoint(-17.99F, -7.5F, -7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,0.5F, -0.16F, 0F, 0F, 0.965F, 0F, 0F, 0.965F, 0F, 0.5F, -0.16F, 0F, 0.5F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F); // Box 111
		bodyModel[76].setRotationPoint(-7.99F, -7.5F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[77].setRotationPoint(27.5F, -5F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[78].setRotationPoint(27.7F, -5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 14, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box oiltank var2 (upfit)
		bodyModel[79].setRotationPoint(-20.5F, -17.75F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[80].setRotationPoint(-23F, -10.5F, -4F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[81].setRotationPoint(-23.75F, -11F, 7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 355 brakewheel
		bodyModel[82].setRotationPoint(-23.75F, -13F, 5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[83].setRotationPoint(-25F, -6.5F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 18, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[84].setRotationPoint(-24F, -16.5F, -11.01F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 31, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[85].setRotationPoint(-6F, -7.35F, -7.51F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 31, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[86].setRotationPoint(-6F, -7.35F, 7.51F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[87].setRotationPoint(-24F, -16.5F, 11.01F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 284 glow
		bodyModel[88].setRotationPoint(25.05F, -12F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[89].setRotationPoint(25F, -11.75F, 5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 284 glow
		bodyModel[90].setRotationPoint(25.05F, -12F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[91].setRotationPoint(25F, -11.75F, -5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[92].setRotationPoint(26F, -8.25F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[93].setRotationPoint(26F, -8.25F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[94].setRotationPoint(26F, -8.25F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, -3.5F, 31, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull handgrabs
		bodyModel[95].setRotationPoint(-6F, -8.5F, -4.25F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 1F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(25F, -8.85F, -9.85F);

		bodyModel[97].addShapeBox(0F, 0F, 0.5F, 31, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull handgrabs
		bodyModel[97].setRotationPoint(-6F, -8.5F, 4.25F);
		bodyModel[97].rotateAngleX = 0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[98].setRotationPoint(25F, -8.85F, 6.85F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[99].setRotationPoint(24F, -2F, -10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[100].setRotationPoint(24F, -2F, 7.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[101].setRotationPoint(-17.5F, 0F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[102].setRotationPoint(-17.5F, 0F, 4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[103].setRotationPoint(14.5F, 0F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[104].setRotationPoint(14.5F, 0F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box cull tank steppies
		bodyModel[105].setRotationPoint(17F, -9F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull tank steppies
		bodyModel[106].setRotationPoint(17F, -9F, 6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[107].setRotationPoint(-17.5F, 4F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[108].setRotationPoint(14.5F, 4F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[109].setRotationPoint(-17.5F, 4.75F, -1.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[110].setRotationPoint(14.5F, 4.75F, -1.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box espee interwar light
		bodyModel[111].setRotationPoint(25.5F, -16.25F, -1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[112].setRotationPoint(25.75F, -8.75F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[113].setRotationPoint(25.75F, -8.75F, -6F);

		bodyModel[114].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[114].setRotationPoint(-3F, 5F, -0.5F);
		bodyModel[114].rotateAngleX = -0.78539816F;

		bodyModel[115].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[115].setRotationPoint(0F, 5F, -0.5F);
		bodyModel[115].rotateAngleX = -0.78539816F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull brakecyl holder
		bodyModel[116].setRotationPoint(-3F, 2.5F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box cull pipos
		bodyModel[117].setRotationPoint(-31F, 1F, -2.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 32, 5, 15, 0F,0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 151
		bodyModel[118].setRotationPoint(-5.99F, -7.5F, -7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 32, 4, 8, 0F,0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.66F, -0.5F, 0F, 0.66F, -0.5F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 152
		bodyModel[119].setRotationPoint(-5.99F, -12F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 32, 5, 5, 0F,0F, -1.35F, -0.5F, 0F, -1.35F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[120].setRotationPoint(-5.99F, -12.34F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 32, 4, 8, 0F,0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, -0.5F, 0F, 0.66F, -0.5F); // Box 159
		bodyModel[121].setRotationPoint(-5.99F, -12F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 32, 5, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.35F, -0.5F, 0F, -1.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 160
		bodyModel[122].setRotationPoint(-5.99F, -12.34F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 49, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.35F, -0.5F, 0F, -1.35F, -0.5F); // Box 161
		bodyModel[123].setRotationPoint(-22.99F, -2.16F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 49, 5, 5, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, -0.5F, 0F, -1.35F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 162
		bodyModel[124].setRotationPoint(-22.99F, -2.16F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 49, 4, 8, 0F,0F, 0.66F, -0.5F, 0F, 0.66F, -0.5F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F); // Box 163
		bodyModel[125].setRotationPoint(-22.99F, -1.5F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 49, 4, 8, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, -0.5F, 0F, 0.66F, -0.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F); // Box 164
		bodyModel[126].setRotationPoint(-22.99F, -1.5F, 0F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -1.35F, -0.5F, 0F, -1.35F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 165
		bodyModel[127].setRotationPoint(26.01F, -12.34F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, -1F, -4.5F, -1F, -1F, -4.5F, -1F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0.66F, -2.75F, 0.5F, 0.66F, -2.75F, -1F, 0.66F, -0.5F, 0F, 0.66F, -0.5F); // Box 166
		bodyModel[128].setRotationPoint(26.01F, -12F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, -0.5F, -1F, -1.35F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 167
		bodyModel[129].setRotationPoint(26.01F, -2.16F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0.66F, -0.5F, -1F, 0.66F, -0.5F, 0.5F, 0.66F, -2.75F, 0F, 0.66F, -2.75F, 0F, -1F, -3.5F, -1F, -1F, -3.5F, -1F, -1F, -4.5F, 0F, -1F, -4.5F); // Box 168
		bodyModel[130].setRotationPoint(26F, -1.5F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -1.35F, -0.5F, 0F, -1.35F, -0.5F); // Box 169
		bodyModel[131].setRotationPoint(26.01F, -2.16F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0.66F, -2.75F, 0.5F, 0.66F, -2.75F, -1F, 0.66F, -0.5F, 0F, 0.66F, -0.5F, 0F, -1F, -4.5F, -1F, -1F, -4.5F, -1F, -1F, -3.5F, 0F, -1F, -3.5F); // Box 170
		bodyModel[132].setRotationPoint(26F, -1.5F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, -0.16F, 0.25F, -1F, -0.16F, 0.25F, 0.5F, -0.16F, 0.5F, 0F, -0.16F, 0.5F, 0F, 0.34F, 0.25F, -1F, 0.34F, 0.25F, 0.5F, 0.34F, 0.5F, 0F, 0.34F, 0.5F); // Box 171
		bodyModel[133].setRotationPoint(26.01F, -7.5F, -7.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, -0.16F, 0.5F, 0.5F, -0.16F, 0.5F, -1F, -0.16F, 0.25F, 0F, -0.16F, 0.25F, 0F, 0.34F, 0.5F, 0.5F, 0.34F, 0.5F, -1F, 0.34F, 0.25F, 0F, 0.34F, 0.25F); // Box 172
		bodyModel[134].setRotationPoint(26.01F, -7.5F, 3.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box oil tanker var 2 (as delivered)
		bodyModel[135].setRotationPoint(-21F, -17.5F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 3, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
		bodyModel[136].setRotationPoint(-6F, -20.5F, 2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 3, 8, 0F,0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[137].setRotationPoint(-6F, -20.5F, -10.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box cull pipes
		bodyModel[138].setRotationPoint(26.5F, 4.98F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[139].setRotationPoint(-24F, -16.5F, 11.01F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[140].setRotationPoint(-24F, -17.5F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[141].setRotationPoint(-24F, -17.5F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box coal tender guard bits
		bodyModel[142].setRotationPoint(-6F, -20.5F, -2.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box coal tender guard bits
		bodyModel[143].setRotationPoint(-6F, -20.5F, -7.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box coal tender guard bits
		bodyModel[144].setRotationPoint(-6F, -20.5F, 2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull tank steppies
		bodyModel[145].setRotationPoint(2F, -9F, 6.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box cull tank steppies
		bodyModel[146].setRotationPoint(2F, -9F, -8.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 35, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 519 cull
		bodyModel[147].setRotationPoint(-24F, 1.5F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box coal
		bodyModel[148].setRotationPoint(-17.5F, -20F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box coal
		bodyModel[149].setRotationPoint(-17.5F, -20F, 6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box coal
		bodyModel[150].setRotationPoint(-17.5F, -20F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box coal
		bodyModel[151].setRotationPoint(-17.5F, -20F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box coal tender guard bits
		bodyModel[152].setRotationPoint(-21F, -18.5F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box coal
		bodyModel[153].setRotationPoint(-20.5F, -17F, -10.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 2, 19, 0F); // Box 157
		bodyModel[154].setRotationPoint(26.51F, 2F, -9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 158
		bodyModel[155].setRotationPoint(11F, -13.25F, -2.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull tender handrails
		bodyModel[156].setRotationPoint(24F, -17.25F, -3.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box oiltank var2 (upfit)
		bodyModel[157].setRotationPoint(-19F, -18.25F, -3.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box oil tanker var 2 (as delivered)
		bodyModel[158].setRotationPoint(-19F, -18F, -3.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // Box stokerbit
		bodyModel[159].setRotationPoint(-30.5F, -1F, -1.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box fncc rear'ds
		bodyModel[160].setRotationPoint(22.5F, -16.25F, -1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box fncc rear'ds glow
		bodyModel[161].setRotationPoint(25F, -16.25F, -1.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box fncc rear'ds glow
		bodyModel[162].setRotationPoint(23F, -15.75F, -1.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box fncc rear'ds
		bodyModel[163].setRotationPoint(26.5F, -16.25F, -1.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box fncc rear'ds
		bodyModel[164].setRotationPoint(25.5F, -16.25F, -1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box cull deck support
		bodyModel[165].setRotationPoint(-27F, -2.5F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull small steppa
		bodyModel[166].setRotationPoint(25.5F, 4F, 9.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull small steppa
		bodyModel[167].setRotationPoint(25.5F, 4F, -10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,-0.45F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box LETTeurs
		bodyModel[168].setRotationPoint(26.55F, -7.5F, -2.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box water extendodingle
		bodyModel[169].setRotationPoint(12F, -17.25F, -1.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[170].setRotationPoint(0F, -18.25F, -3.5F);
	}
	ModelASF_crown_LS_truck truck = new ModelASF_crown_LS_truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/asf_crown_ls_truck_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.0F, 0.0F, 0F);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.0F, 0.0F, 0);
		truck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}
