//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
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
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPCF_RBL_Smoothbrain extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelPCF_RBL_Smoothbrain() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[198];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 208, 115, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 3, 146, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 103, 85, textureX, textureY); // Sides01
		bodyModel[3] = new ModelRendererTurbo(this, 170, 115, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 1, 85, textureX, textureY); // Sides01
		bodyModel[5] = new ModelRendererTurbo(this, 27, 129, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 74, 115, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 198, 29, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[9] = new ModelRendererTurbo(this, 198, 29, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[10] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Sides01
		bodyModel[11] = new ModelRendererTurbo(this, 103, 55, textureX, textureY); // Sides01
		bodyModel[12] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 198, 29, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[15] = new ModelRendererTurbo(this, 198, 29, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[16] = new ModelRendererTurbo(this, 168, 65, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 211, 65, textureX, textureY); // Box 50
		bodyModel[18] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 198, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[20] = new ModelRendererTurbo(this, 198, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[21] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[22] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[23] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 208, 44, textureX, textureY); // Box 57
		bodyModel[25] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 163, 181, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 27, 138, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 27, 132, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 198, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[30] = new ModelRendererTurbo(this, 198, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[31] = new ModelRendererTurbo(this, 27, 135, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 59
		bodyModel[33] = new ModelRendererTurbo(this, 320, 116, textureX, textureY); // Box 60
		bodyModel[34] = new ModelRendererTurbo(this, 347, 123, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 307, 109, textureX, textureY); // Box 59
		bodyModel[36] = new ModelRendererTurbo(this, 320, 102, textureX, textureY); // Box 60
		bodyModel[37] = new ModelRendererTurbo(this, 347, 109, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 307, 95, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 320, 88, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 347, 95, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 307, 81, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 347, 81, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 307, 67, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 320, 60, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 347, 67, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 307, 53, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 320, 46, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 347, 53, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 308, 39, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 320, 32, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 347, 39, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 316, 22, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 329, 15, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 294, 123, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 267, 116, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 254, 123, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 294, 109, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 267, 102, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 254, 109, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 294, 95, textureX, textureY); // Box 59
		bodyModel[63] = new ModelRendererTurbo(this, 267, 88, textureX, textureY); // Box 60
		bodyModel[64] = new ModelRendererTurbo(this, 254, 95, textureX, textureY); // Box 61
		bodyModel[65] = new ModelRendererTurbo(this, 294, 81, textureX, textureY); // Box 59
		bodyModel[66] = new ModelRendererTurbo(this, 267, 74, textureX, textureY); // Box 60
		bodyModel[67] = new ModelRendererTurbo(this, 254, 67, textureX, textureY); // Box 61
		bodyModel[68] = new ModelRendererTurbo(this, 294, 67, textureX, textureY); // Box 59
		bodyModel[69] = new ModelRendererTurbo(this, 267, 60, textureX, textureY); // Box 60
		bodyModel[70] = new ModelRendererTurbo(this, 254, 81, textureX, textureY); // Box 61
		bodyModel[71] = new ModelRendererTurbo(this, 294, 53, textureX, textureY); // Box 59
		bodyModel[72] = new ModelRendererTurbo(this, 267, 46, textureX, textureY); // Box 60
		bodyModel[73] = new ModelRendererTurbo(this, 254, 53, textureX, textureY); // Box 61
		bodyModel[74] = new ModelRendererTurbo(this, 294, 39, textureX, textureY); // Box 59
		bodyModel[75] = new ModelRendererTurbo(this, 267, 32, textureX, textureY); // Box 60
		bodyModel[76] = new ModelRendererTurbo(this, 254, 39, textureX, textureY); // Box 61
		bodyModel[77] = new ModelRendererTurbo(this, 409, 22, textureX, textureY); // Box 59
		bodyModel[78] = new ModelRendererTurbo(this, 382, 15, textureX, textureY); // Box 60
		bodyModel[79] = new ModelRendererTurbo(this, 369, 22, textureX, textureY); // Box 61
		bodyModel[80] = new ModelRendererTurbo(this, 403, 76, textureX, textureY,"cull"); // Box 56 crossover cull
		bodyModel[81] = new ModelRendererTurbo(this, 403, 107, textureX, textureY,"cull"); // Box 56 crossover cull
		bodyModel[82] = new ModelRendererTurbo(this, 214, 40, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[83] = new ModelRendererTurbo(this, 207, 48, textureX, textureY); // Box 214
		bodyModel[84] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 215
		bodyModel[85] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 216
		bodyModel[86] = new ModelRendererTurbo(this, 227, 40, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[87] = new ModelRendererTurbo(this, 197, 48, textureX, textureY); // Box 210
		bodyModel[88] = new ModelRendererTurbo(this, 218, 50, textureX, textureY); // Box 80
		bodyModel[89] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 212
		bodyModel[90] = new ModelRendererTurbo(this, 215, 28, textureX, textureY); // Box 72
		bodyModel[91] = new ModelRendererTurbo(this, 225, 27, textureX, textureY); // Box 87
		bodyModel[92] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 87
		bodyModel[93] = new ModelRendererTurbo(this, 226, 30, textureX, textureY); // Box 132
		bodyModel[94] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 140
		bodyModel[95] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[96] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[97] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[98] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[99] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[100] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[101] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[102] = new ModelRendererTurbo(this, 18, 183, textureX, textureY); // Box 140
		bodyModel[103] = new ModelRendererTurbo(this, 125, 183, textureX, textureY); // Box 286
		bodyModel[104] = new ModelRendererTurbo(this, 115, 183, textureX, textureY); // Box 287
		bodyModel[105] = new ModelRendererTurbo(this, 119, 178, textureX, textureY); // Box 302
		bodyModel[106] = new ModelRendererTurbo(this, 100, 184, textureX, textureY); // Box 317
		bodyModel[107] = new ModelRendererTurbo(this, 98, 178, textureX, textureY); // Box 318
		bodyModel[108] = new ModelRendererTurbo(this, 58, 184, textureX, textureY); // Box 118
		bodyModel[109] = new ModelRendererTurbo(this, 71, 184, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 57, 178, textureX, textureY); // Box 129
		bodyModel[111] = new ModelRendererTurbo(this, 85, 192, textureX, textureY); // Box 196
		bodyModel[112] = new ModelRendererTurbo(this, 71, 191, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 73, 202, textureX, textureY); // Box 124
		bodyModel[114] = new ModelRendererTurbo(this, 74, 199, textureX, textureY); // Box 126
		bodyModel[115] = new ModelRendererTurbo(this, 6, 220, textureX, textureY); // Box 125
		bodyModel[116] = new ModelRendererTurbo(this, 54, 193, textureX, textureY); // Box 124
		bodyModel[117] = new ModelRendererTurbo(this, 3, 185, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[119] = new ModelRendererTurbo(this, 36, 177, textureX, textureY); // Box 140
		bodyModel[120] = new ModelRendererTurbo(this, 4, 132, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 4, 141, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[123] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 177
		bodyModel[126] = new ModelRendererTurbo(this, 66, 85, textureX, textureY); // Box 6
		bodyModel[127] = new ModelRendererTurbo(this, 66, 55, textureX, textureY); // Box 6
		bodyModel[128] = new ModelRendererTurbo(this, 222, 186, textureX, textureY); // Box 179 door right
		bodyModel[129] = new ModelRendererTurbo(this, 263, 161, textureX, textureY); // Box 174 door right
		bodyModel[130] = new ModelRendererTurbo(this, 216, 161, textureX, textureY); // Box 175 door right
		bodyModel[131] = new ModelRendererTurbo(this, 239, 173, textureX, textureY); // Box 178 door right
		bodyModel[132] = new ModelRendererTurbo(this, 221, 167, textureX, textureY); // Box 179 door right
		bodyModel[133] = new ModelRendererTurbo(this, 221, 183, textureX, textureY); // Box 180 door right
		bodyModel[134] = new ModelRendererTurbo(this, 225, 175, textureX, textureY); // Box 181 door right
		bodyModel[135] = new ModelRendererTurbo(this, 228, 170, textureX, textureY); // Box 182 door right
		bodyModel[136] = new ModelRendererTurbo(this, 259, 161, textureX, textureY); // Box 183 door right
		bodyModel[137] = new ModelRendererTurbo(this, 255, 161, textureX, textureY); // Box 184 door right
		bodyModel[138] = new ModelRendererTurbo(this, 221, 164, textureX, textureY); // Box 179 door right
		bodyModel[139] = new ModelRendererTurbo(this, 221, 161, textureX, textureY); // Box 179 door right
		bodyModel[140] = new ModelRendererTurbo(this, 229, 172, textureX, textureY); // Box 185 door right handle
		bodyModel[141] = new ModelRendererTurbo(this, 222, 188, textureX, textureY); // Box 179 door right
		bodyModel[142] = new ModelRendererTurbo(this, 316, 161, textureX, textureY); // Box 174 door right
		bodyModel[143] = new ModelRendererTurbo(this, 269, 161, textureX, textureY); // Box 175 door right
		bodyModel[144] = new ModelRendererTurbo(this, 286, 173, textureX, textureY); // Box 178 door right
		bodyModel[145] = new ModelRendererTurbo(this, 275, 167, textureX, textureY); // Box 179 door right
		bodyModel[146] = new ModelRendererTurbo(this, 275, 183, textureX, textureY); // Box 180 door right
		bodyModel[147] = new ModelRendererTurbo(this, 274, 175, textureX, textureY); // Box 181 door right
		bodyModel[148] = new ModelRendererTurbo(this, 282, 170, textureX, textureY); // Box 182 door right
		bodyModel[149] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 183 door right
		bodyModel[150] = new ModelRendererTurbo(this, 309, 161, textureX, textureY); // Box 184 door right
		bodyModel[151] = new ModelRendererTurbo(this, 275, 161, textureX, textureY); // Box 179 door right
		bodyModel[152] = new ModelRendererTurbo(this, 275, 172, textureX, textureY); // Box 185 door right handle
		bodyModel[153] = new ModelRendererTurbo(this, 275, 164, textureX, textureY); // Box 179 door right
		bodyModel[154] = new ModelRendererTurbo(this, 276, 186, textureX, textureY); // Box 179 door right
		bodyModel[155] = new ModelRendererTurbo(this, 276, 188, textureX, textureY); // Box 179 door right
		bodyModel[156] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 6
		bodyModel[157] = new ModelRendererTurbo(this, 1, 52, textureX, textureY); // Box 6
		bodyModel[158] = new ModelRendererTurbo(this, 106, 121, textureX, textureY); // vents
		bodyModel[159] = new ModelRendererTurbo(this, 111, 121, textureX, textureY); // vents
		bodyModel[160] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // vents
		bodyModel[161] = new ModelRendererTurbo(this, 116, 121, textureX, textureY); // vents
		bodyModel[162] = new ModelRendererTurbo(this, 57, 178, textureX, textureY); // Box 129
		bodyModel[163] = new ModelRendererTurbo(this, 6, 220, textureX, textureY); // Box 125
		bodyModel[164] = new ModelRendererTurbo(this, 186, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[165] = new ModelRendererTurbo(this, 186, 42, textureX, textureY,"cull"); // Stirrup cull
		bodyModel[166] = new ModelRendererTurbo(this, 240, 28, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[167] = new ModelRendererTurbo(this, 240, 28, textureX, textureY,"cull"); // Box 45 ladder cull
		bodyModel[168] = new ModelRendererTurbo(this, 229, 11, textureX, textureY); // Box 72
		bodyModel[169] = new ModelRendererTurbo(this, 232, 22, textureX, textureY); // Box 87
		bodyModel[170] = new ModelRendererTurbo(this, 240, 13, textureX, textureY); // Box 87
		bodyModel[171] = new ModelRendererTurbo(this, 249, 11, textureX, textureY); // Box 132
		bodyModel[172] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 179 door right
		bodyModel[173] = new ModelRendererTurbo(this, 217, 196, textureX, textureY); // Box 179 door right
		bodyModel[174] = new ModelRendererTurbo(this, 218, 199, textureX, textureY); // Box 185 door right handle
		bodyModel[175] = new ModelRendererTurbo(this, 269, 196, textureX, textureY); // Box 179 door right
		bodyModel[176] = new ModelRendererTurbo(this, 271, 199, textureX, textureY); // Box 185 door right handle
		bodyModel[177] = new ModelRendererTurbo(this, 269, 193, textureX, textureY); // Box 179 door right
		bodyModel[178] = new ModelRendererTurbo(this, 286, 191, textureX, textureY); // Box 179 door right
		bodyModel[179] = new ModelRendererTurbo(this, 286, 191, textureX, textureY); // Box 179 door right
		bodyModel[180] = new ModelRendererTurbo(this, 255, 186, textureX, textureY); // Box 178 door right
		bodyModel[181] = new ModelRendererTurbo(this, 309, 186, textureX, textureY); // Box 178 door right
		bodyModel[182] = new ModelRendererTurbo(this, 221, 191, textureX, textureY); // Box 179 door right
		bodyModel[183] = new ModelRendererTurbo(this, 221, 191, textureX, textureY); // Box 179 door right
		bodyModel[184] = new ModelRendererTurbo(this, 181, 4, textureX, textureY,"cull"); // roofwalk cull
		bodyModel[185] = new ModelRendererTurbo(this, 184, 12, textureX, textureY,"cull"); // roofwalk 3 cull
		bodyModel[186] = new ModelRendererTurbo(this, 203, 15, textureX, textureY,"cull"); // roofwalk 2 cull
		bodyModel[187] = new ModelRendererTurbo(this, 263, 186, textureX, textureY); // Box 184 door right
		bodyModel[188] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 183 door right
		bodyModel[189] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 184 door right
		bodyModel[190] = new ModelRendererTurbo(this, 275, 191, textureX, textureY); // Box 179 door right
		bodyModel[191] = new ModelRendererTurbo(this, 275, 191, textureX, textureY); // Box 179 door right
		bodyModel[192] = new ModelRendererTurbo(this, 263, 186, textureX, textureY); // Box 183 door right
		bodyModel[193] = new ModelRendererTurbo(this, 243, 191, textureX, textureY); // Box 179 door right
		bodyModel[194] = new ModelRendererTurbo(this, 243, 191, textureX, textureY); // Box 179 door right
		bodyModel[195] = new ModelRendererTurbo(this, 364, 63, textureX, textureY,"cull"); // smoll platform cull
		bodyModel[196] = new ModelRendererTurbo(this, 360, 53, textureX, textureY,"cull"); // Box 57 cull
		bodyModel[197] = new ModelRendererTurbo(this, 360, 84, textureX, textureY,"cull"); // Box 57 cull

		bodyModel[0].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 6
		bodyModel[0].setRotationPoint(-8.5F, 2F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 16
		bodyModel[1].setRotationPoint(-38.5F, 2F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 31, 24, 1, 0F); // Sides01
		bodyModel[2].setRotationPoint(-39.5F, -21F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(-8.5F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 31, 24, 1, 0F); // Sides01
		bodyModel[4].setRotationPoint(8.5F, -21F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-39.5F, 3F, 9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-25.5F, 2.5F, 10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 79, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(-39.5F, -23F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 45 ladder cull
		bodyModel[8].setRotationPoint(-38.5F, -8F, 10.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 45 ladder cull
		bodyModel[9].setRotationPoint(35.5F, -8F, 10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 31, 24, 1, 0F); // Sides01
		bodyModel[10].setRotationPoint(-39.5F, -21F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 31, 24, 1, 0F); // Sides01
		bodyModel[11].setRotationPoint(8.5F, -21F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 79, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[12].setRotationPoint(-39.5F, -23F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[13].setRotationPoint(-9.5F, 2.5F, -11.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 45 ladder cull
		bodyModel[14].setRotationPoint(-38.5F, -8F, -11.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 45 ladder cull
		bodyModel[15].setRotationPoint(35.5F, -8F, -11.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 50
		bodyModel[16].setRotationPoint(38.5F, -23F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 26, 20, 0F); // Box 50
		bodyModel[17].setRotationPoint(-39.5F, -23F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 87, 2, 5, 0F); // Box 52
		bodyModel[18].setRotationPoint(-43.5F, 3F, -2.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[19].setRotationPoint(-38.5F, 4F, 9.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[20].setRotationPoint(35.5F, 4F, 9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[21].setRotationPoint(-39.5F, 3F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[22].setRotationPoint(-39.5F, 3F, 8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[23].setRotationPoint(38.5F, 3F, -9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[24].setRotationPoint(38.5F, 3F, 8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[25].setRotationPoint(-46.5F, 3F, -1.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[26].setRotationPoint(43.5F, 3F, -1.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 6
		bodyModel[27].setRotationPoint(-34.5F, 4F, 9.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 79, 1, 1, 0F); // Box 6
		bodyModel[28].setRotationPoint(-39.5F, 3F, -10.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[29].setRotationPoint(-38.5F, 4F, -10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[30].setRotationPoint(35.5F, 4F, -10.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 69, 1, 1, 0F); // Box 6
		bodyModel[31].setRotationPoint(-34.5F, 4F, -10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[32].setRotationPoint(39.5F, 0.5F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[33].setRotationPoint(39.5F, 0.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[34].setRotationPoint(39.5F, 0.5F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[35].setRotationPoint(39.5F, -2.5F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[36].setRotationPoint(39.5F, -2.5F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[37].setRotationPoint(39.5F, -2.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[38].setRotationPoint(39.5F, -5.5F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[39].setRotationPoint(39.5F, -5.5F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[40].setRotationPoint(39.5F, -5.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[41].setRotationPoint(39.5F, -8.5F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[42].setRotationPoint(39.5F, -8.5F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[43].setRotationPoint(39.5F, -8.5F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[44].setRotationPoint(39.5F, -11.5F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[45].setRotationPoint(39.5F, -11.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[46].setRotationPoint(39.5F, -11.5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[47].setRotationPoint(39.5F, -14.5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[48].setRotationPoint(39.5F, -14.5F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[49].setRotationPoint(39.5F, -14.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[50].setRotationPoint(39.5F, -17.5F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[51].setRotationPoint(39.5F, -17.5F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[52].setRotationPoint(39.5F, -17.5F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[53].setRotationPoint(39.5F, -20.5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 60
		bodyModel[54].setRotationPoint(39.5F, -20.5F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 61
		bodyModel[55].setRotationPoint(39.5F, -20.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[56].setRotationPoint(-40.5F, 1.5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[57].setRotationPoint(-40.5F, 1.5F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[58].setRotationPoint(-40.5F, 1.5F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-40.5F, -1.5F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-40.5F, -1.5F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-40.5F, -1.5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[62].setRotationPoint(-40.5F, -4.5F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[63].setRotationPoint(-40.5F, -4.5F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[64].setRotationPoint(-40.5F, -4.5F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[65].setRotationPoint(-40.5F, -7.5F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[66].setRotationPoint(-40.5F, -7.5F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[67].setRotationPoint(-40.5F, -7.5F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[68].setRotationPoint(-40.5F, -10.5F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[69].setRotationPoint(-40.5F, -10.5F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[70].setRotationPoint(-40.5F, -10.5F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[71].setRotationPoint(-40.5F, -13.5F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[72].setRotationPoint(-40.5F, -13.5F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[73].setRotationPoint(-40.5F, -13.5F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[74].setRotationPoint(-40.5F, -16.5F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[75].setRotationPoint(-40.5F, -16.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[76].setRotationPoint(-40.5F, -16.5F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 59
		bodyModel[77].setRotationPoint(-40.5F, -19.5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[78].setRotationPoint(-40.5F, -19.5F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 61
		bodyModel[79].setRotationPoint(-40.5F, -19.5F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 56 crossover cull
		bodyModel[80].setRotationPoint(39.51F, 2F, -4.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 56 crossover cull
		bodyModel[81].setRotationPoint(-41.51F, 2F, -4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[82].setRotationPoint(39.51F, 3F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 214
		bodyModel[83].setRotationPoint(40.5F, 4.5F, -9F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[84].setRotationPoint(40.5F, 4.5F, -10F);

		bodyModel[85].addBox(-9F, 0F, 0F, 9, 1, 0, 0F); // Box 216
		bodyModel[85].setRotationPoint(45F, 4.5F, -0.5F);
		bodyModel[85].rotateAngleY = 1.04719755F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[86].setRotationPoint(-40.51F, 3.5F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 210
		bodyModel[87].setRotationPoint(-40.5F, 5F, 5F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[88].setRotationPoint(-45F, 5F, 0.5F);
		bodyModel[88].rotateAngleY = 1.04719755F;

		bodyModel[89].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 212
		bodyModel[89].setRotationPoint(-40.5F, 5F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[90].setRotationPoint(-41.25F, -5F, 2F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[91].setRotationPoint(-41.25F, -3.5F, 3.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[92].setRotationPoint(-40.49F, -5F, 2.5F);

		bodyModel[93].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[93].setRotationPoint(-40.99F, -2.5F, 4F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 140
		bodyModel[94].setRotationPoint(-1F, 6F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[95].setRotationPoint(-9F, 3F, -9.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[96].setRotationPoint(8F, 3F, -9.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[97].setRotationPoint(-9F, 3F, 2.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[98].setRotationPoint(8F, 3F, 2.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[99].setRotationPoint(19F, 3F, -9.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[100].setRotationPoint(19F, 3F, 2.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[101].setRotationPoint(-20F, 3F, -9.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 140
		bodyModel[102].setRotationPoint(-20F, 3F, 2.5F);

		bodyModel[103].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[103].setRotationPoint(-19F, 4.5F, -7.5F);
		bodyModel[103].rotateAngleX = -0.78539816F;

		bodyModel[104].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[104].setRotationPoint(-17F, 4.5F, -7.5F);
		bodyModel[104].rotateAngleX = -0.78539816F;

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 302
		bodyModel[105].setRotationPoint(-18F, 3F, -8.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[106].setRotationPoint(-11.5F, 6F, -9.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[107].setRotationPoint(-12.5F, 4F, -9.5F);

		bodyModel[108].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[108].setRotationPoint(6F, 5F, 4F);
		bodyModel[108].rotateAngleX = -0.78539816F;

		bodyModel[109].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[109].setRotationPoint(4F, 5F, 4F);
		bodyModel[109].rotateAngleX = -0.78539816F;

		bodyModel[110].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[110].setRotationPoint(5.5F, 3F, 3F);

		bodyModel[111].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[111].setRotationPoint(3.5F, 5.51F, 0F);
		bodyModel[111].rotateAngleY = -0.05235988F;

		bodyModel[112].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[112].setRotationPoint(12F, 5.51F, 0F);
		bodyModel[112].rotateAngleY = -0.10471976F;

		bodyModel[113].addBox(-0.5F, 0F, 0F, 1, 0, 16, 0F); // Box 124
		bodyModel[113].setRotationPoint(12F, 5.51F, 3F);
		bodyModel[113].rotateAngleY = -1.57079633F;

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126
		bodyModel[114].setRotationPoint(10F, 4.75F, -2.25F);

		bodyModel[115].addBox(0F, 0F, 0F, 45, 1, 0, 0F); // Box 125
		bodyModel[115].setRotationPoint(-41F, 3.5F, 4F);
		bodyModel[115].rotateAngleZ = -0.01745329F;

		bodyModel[116].addBox(-0.5F, 0F, 0F, 1, 0, 9, 0F); // Box 124
		bodyModel[116].setRotationPoint(3F, 5.51F, 0.5F);
		bodyModel[116].rotateAngleY = -1.57079633F;

		bodyModel[117].addBox(-0.5F, 0F, 0F, 1, 0, 33, 0F); // Box 124
		bodyModel[117].setRotationPoint(-29.5F, 5.51F, -3.5F);
		bodyModel[117].rotateAngleY = -1.57079633F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[118].setRotationPoint(19F, 5F, -4.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[119].setRotationPoint(-2F, 5F, -2.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[120].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[121].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[122].setRotationPoint(8F, 5F, -4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[123].setRotationPoint(-9F, 5F, -4.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[124].setRotationPoint(-20F, 5F, -4.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 177
		bodyModel[125].setRotationPoint(-38.5F, -23F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 6
		bodyModel[126].setRotationPoint(-8.5F, -21F, 10F);

		bodyModel[127].addBox(0F, 0F, 0F, 17, 23, 1, 0F); // Box 6
		bodyModel[127].setRotationPoint(-8.5F, -21F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[128].setRotationPoint(-7.5F, -1F, 11.26F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 door right
		bodyModel[129].setRotationPoint(-8.5F, -21F, 10.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175 door right
		bodyModel[130].setRotationPoint(7.5F, -21F, 10.25F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[131].setRotationPoint(-1F, -14.5F, 10.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[132].setRotationPoint(-7.5F, -7.5F, 10.25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180 door right
		bodyModel[133].setRotationPoint(-7.5F, 1F, 10.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181 door right
		bodyModel[134].setRotationPoint(-2F, -6.5F, 10.25F);

		bodyModel[135].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 182 door right
		bodyModel[135].setRotationPoint(-5F, -5F, 11.24F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[136].setRotationPoint(-6F, -21F, 11.27F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[137].setRotationPoint(5F, -21F, 11.27F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[138].setRotationPoint(-7.5F, -15.5F, 10.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[139].setRotationPoint(-7.5F, -21F, 10.25F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[140].setRotationPoint(-1.5F, -1.5F, 11.26F);
		bodyModel[140].rotateAngleZ = 1.57079633F;

		bodyModel[141].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[141].setRotationPoint(-7.5F, -10F, 11.26F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 174 door right
		bodyModel[142].setRotationPoint(7.5F, -21F, -11.26F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 175 door right
		bodyModel[143].setRotationPoint(-8.5F, -21F, -11.26F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178 door right
		bodyModel[144].setRotationPoint(-1F, -14.5F, -11.26F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[145].setRotationPoint(-7.5F, -7.5F, -11.26F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 180 door right
		bodyModel[146].setRotationPoint(-7.5F, 1F, -11.26F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 181 door right
		bodyModel[147].setRotationPoint(-2F, -6.5F, -11.26F);

		bodyModel[148].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 182 door right
		bodyModel[148].setRotationPoint(-5F, -5F, -11.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[149].setRotationPoint(5F, -21F, -11.28F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[150].setRotationPoint(-6F, -21F, -11.28F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[151].setRotationPoint(-7.5F, -21F, -11.26F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[152].setRotationPoint(0.5F, -1.5F, -11.27F);
		bodyModel[152].rotateAngleZ = 1.57079633F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[153].setRotationPoint(-7.5F, -15.5F, -11.26F);

		bodyModel[154].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[154].setRotationPoint(-7.5F, -1F, -11.27F);

		bodyModel[155].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 179 door right
		bodyModel[155].setRotationPoint(-7.5F, -10F, -11.27F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[156].setRotationPoint(-25.5F, -22.5F, 10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[157].setRotationPoint(-9.5F, -22.5F, -11.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // vents
		bodyModel[158].setRotationPoint(-32F, -20.5F, -11.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // vents
		bodyModel[159].setRotationPoint(-32F, -20.5F, 10.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // vents
		bodyModel[160].setRotationPoint(31F, -20.5F, -11.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // vents
		bodyModel[161].setRotationPoint(31F, -20.5F, 10.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[162].setRotationPoint(5.5F, 3F, 3F);

		bodyModel[163].addBox(0F, 0F, 0F, 45, 1, 0, 0F); // Box 125
		bodyModel[163].setRotationPoint(-41F, 3.5F, 4F);
		bodyModel[163].rotateAngleZ = -0.01745329F;

		bodyModel[164].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[164].setRotationPoint(-10F, 4F, -10.48F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Stirrup cull
		bodyModel[165].setRotationPoint(7F, 4F, 9.48F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 45 ladder cull
		bodyModel[166].setRotationPoint(-38.5F, -22F, 10.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 45 ladder cull
		bodyModel[167].setRotationPoint(35.5F, -22F, -11.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[168].setRotationPoint(-41.25F, -21F, 2F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[169].setRotationPoint(-41.25F, -19.5F, 3.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[170].setRotationPoint(-40.49F, -21F, 2.5F);

		bodyModel[171].addFlexTrapezoid(0F, 0F, 0F, 1, 16, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[171].setRotationPoint(-40.99F, -18.5F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[172].setRotationPoint(-8.5F, -4.5F, 10.1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 door right
		bodyModel[173].setRotationPoint(-8.5F, -12.5F, 10.1F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[174].setRotationPoint(-0.5F, 1.25F, 11.12F);
		bodyModel[174].rotateAngleZ = 1.57079633F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[175].setRotationPoint(-8.5F, -4.5F, -11.1F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 185 door right handle
		bodyModel[176].setRotationPoint(-0.5F, 1.25F, -11.12F);
		bodyModel[176].rotateAngleZ = 1.57079633F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179 door right
		bodyModel[177].setRotationPoint(-8.5F, -12.5F, -11.1F);

		bodyModel[178].addBox(0F, -1F, 0F, 8, 1, 0, 0F); // Box 179 door right
		bodyModel[178].setRotationPoint(0F, 0F, 11.11F);
		bodyModel[178].rotateAngleY = 0.01745329F;
		bodyModel[178].rotateAngleZ = 0.73303829F;

		bodyModel[179].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 179 door right
		bodyModel[179].setRotationPoint(0F, 0F, 11.11F);
		bodyModel[179].rotateAngleY = -0.01745329F;
		bodyModel[179].rotateAngleZ = 2.40855437F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 23, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178 door right
		bodyModel[180].setRotationPoint(-1F, -21F, 10.05F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178 door right
		bodyModel[181].setRotationPoint(-1F, -21F, -11.05F);

		bodyModel[182].addBox(0F, -1F, 0F, 8, 1, 0, 0F); // Box 179 door right
		bodyModel[182].setRotationPoint(0F, 0F, -11.11F);
		bodyModel[182].rotateAngleY = -0.01745329F;
		bodyModel[182].rotateAngleZ = 0.73303829F;

		bodyModel[183].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 179 door right
		bodyModel[183].setRotationPoint(0F, 0F, -11.11F);
		bodyModel[183].rotateAngleY = 0.01745329F;
		bodyModel[183].rotateAngleZ = 2.40855437F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 82, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // roofwalk cull
		bodyModel[184].setRotationPoint(-41F, -23.25F, -2F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // roofwalk 3 cull
		bodyModel[185].setRotationPoint(35F, -23.25F, -10F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // roofwalk 2 cull
		bodyModel[186].setRotationPoint(-39F, -23.25F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[187].setRotationPoint(3F, -21F, 11.27F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[188].setRotationPoint(3F, -21F, -11.28F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 door right
		bodyModel[189].setRotationPoint(-4F, -21F, -11.28F);

		bodyModel[190].addBox(0F, -1F, 0F, 5, 1, 0, 0F); // Box 179 door right
		bodyModel[190].setRotationPoint(0.5F, 0F, 11.11F);
		bodyModel[190].rotateAngleZ = 0.78539816F;

		bodyModel[191].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 179 door right
		bodyModel[191].setRotationPoint(-0.5F, 0F, 11.11F);
		bodyModel[191].rotateAngleZ = 2.35619449F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 24, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 door right
		bodyModel[192].setRotationPoint(-4F, -21F, 11.27F);

		bodyModel[193].addBox(0F, -1F, 0F, 5, 1, 0, 0F); // Box 179 door right
		bodyModel[193].setRotationPoint(0.5F, 0F, -11.11F);
		bodyModel[193].rotateAngleZ = 0.78539816F;

		bodyModel[194].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 179 door right
		bodyModel[194].setRotationPoint(-0.5F, 0F, -11.11F);
		bodyModel[194].rotateAngleZ = 2.35619449F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // smoll platform cull
		bodyModel[195].setRotationPoint(-42F, -15F, 2F);

		bodyModel[196].addBox(0F, 0F, 0F, 0, 26, 21, 0F); // Box 57 cull
		bodyModel[196].setRotationPoint(40.01F, -23F, -10.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 26, 21, 0F); // Box 57 cull
		bodyModel[197].setRotationPoint(-40.01F, -23F, -10.5F);
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