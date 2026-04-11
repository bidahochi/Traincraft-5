//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.04.2021 - 02:36:29
// Last changed on: 14.04.2021 - 02:36:29

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPRECO_Truck;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPS_Truck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelPRECOPendulumCoach extends ModelConverter//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPRECOPendulumCoach() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[671];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 51, 110, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 349, 105, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 325, 112, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 360, 149, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 352, 149, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 345, 149, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 74, 150, textureX, textureY,"cull"); // Box 2 cull
		bodyModel[7] = new ModelRendererTurbo(this, 91, 150, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 290, 150, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 146, 150, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 153, 150, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 360, 143, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 352, 143, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 345, 143, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 74, 143, textureX, textureY,"cull"); // Box 30 cull
		bodyModel[15] = new ModelRendererTurbo(this, 91, 143, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 290, 143, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 146, 143, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 153, 143, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 337, 127, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 29, 127, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 74, 137, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 159, 158, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 159, 170, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 74, 170, textureX, textureY); // Box 41
		bodyModel[25] = new ModelRendererTurbo(this, 75, 166, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[26] = new ModelRendererTurbo(this, 344, 106, textureX, textureY); // Left trapdoor
		bodyModel[27] = new ModelRendererTurbo(this, 344, 114, textureX, textureY); // Right trapdoor
		bodyModel[28] = new ModelRendererTurbo(this, 72, 68, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 333, 20, textureX, textureY); // Box 128
		bodyModel[31] = new ModelRendererTurbo(this, 363, 20, textureX, textureY); // Box 128
		bodyModel[32] = new ModelRendererTurbo(this, 384, 20, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 415, 20, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 128
		bodyModel[35] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 128
		bodyModel[36] = new ModelRendererTurbo(this, 342, 13, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 399, 20, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 27, 17, textureX, textureY); // Box 128
		bodyModel[39] = new ModelRendererTurbo(this, 314, 62, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 314, 86, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 348, 21, textureX, textureY); // Vestibule door
		bodyModel[42] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Front end door
		bodyModel[43] = new ModelRendererTurbo(this, 434, 23, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 434, 35, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 410, 2, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 431, 2, textureX, textureY); // Box 128
		bodyModel[47] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 128
		bodyModel[48] = new ModelRendererTurbo(this, 424, 1, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 445, 35, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 445, 23, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 22, 43, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 46, 35, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 128
		bodyModel[54] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 58, 1, textureX, textureY); // Box 128
		bodyModel[56] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Box 128
		bodyModel[57] = new ModelRendererTurbo(this, 33, 43, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 72, 40, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 72, 47, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 73, 53, textureX, textureY); // Box 128
		bodyModel[62] = new ModelRendererTurbo(this, 72, 34, textureX, textureY); // Box 168
		bodyModel[63] = new ModelRendererTurbo(this, 72, 29, textureX, textureY); // Box 169
		bodyModel[64] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 28, 7, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 72, 216, textureX, textureY); // Box 128
		bodyModel[67] = new ModelRendererTurbo(this, 16, 7, textureX, textureY); // Box 176
		bodyModel[68] = new ModelRendererTurbo(this, 72, 196, textureX, textureY); // Box 177
		bodyModel[69] = new ModelRendererTurbo(this, 72, 58, textureX, textureY); // Box 128
		bodyModel[70] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 170
		bodyModel[71] = new ModelRendererTurbo(this, 399, 29, textureX, textureY); // Rear gate closed
		bodyModel[72] = new ModelRendererTurbo(this, 412, 34, textureX, textureY); // Rear gate open
		bodyModel[73] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 490, 22, textureX, textureY); // Box 128
		bodyModel[75] = new ModelRendererTurbo(this, 458, 22, textureX, textureY); // Box 176
		bodyModel[76] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 128
		bodyModel[78] = new ModelRendererTurbo(this, 72, 202, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 353, 76, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 356, 76, textureX, textureY); // Box 128
		bodyModel[81] = new ModelRendererTurbo(this, 59, 82, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 353, 98, textureX, textureY); // Box 202
		bodyModel[83] = new ModelRendererTurbo(this, 356, 98, textureX, textureY); // Box 203
		bodyModel[84] = new ModelRendererTurbo(this, 59, 106, textureX, textureY); // Box 204
		bodyModel[85] = new ModelRendererTurbo(this, 74, 148, textureX, textureY); // Box 128
		bodyModel[86] = new ModelRendererTurbo(this, 74, 155, textureX, textureY); // Box 205
		bodyModel[87] = new ModelRendererTurbo(this, 76, 175, textureX, textureY); // Box 2
		bodyModel[88] = new ModelRendererTurbo(this, 74, 175, textureX, textureY); // Box 52
		bodyModel[89] = new ModelRendererTurbo(this, 125, 160, textureX, textureY); // Box 52
		bodyModel[90] = new ModelRendererTurbo(this, 194, 161, textureX, textureY); // Box 41
		bodyModel[91] = new ModelRendererTurbo(this, 195, 157, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[92] = new ModelRendererTurbo(this, 77, 268, textureX, textureY); // Box 38
		bodyModel[93] = new ModelRendererTurbo(this, 76, 298, textureX, textureY); // Box 38
		bodyModel[94] = new ModelRendererTurbo(this, 368, 269, textureX, textureY); // Box 38
		bodyModel[95] = new ModelRendererTurbo(this, 377, 299, textureX, textureY); // Box 38
		bodyModel[96] = new ModelRendererTurbo(this, 1, 180, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 447, 75, textureX, textureY); // Box 38
		bodyModel[98] = new ModelRendererTurbo(this, 103, 244, textureX, textureY); // Box 38
		bodyModel[99] = new ModelRendererTurbo(this, 105, 239, textureX, textureY); // Box 38
		bodyModel[100] = new ModelRendererTurbo(this, 103, 252, textureX, textureY); // Box 275
		bodyModel[101] = new ModelRendererTurbo(this, 105, 259, textureX, textureY); // Box 276
		bodyModel[102] = new ModelRendererTurbo(this, 105, 257, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[103] = new ModelRendererTurbo(this, 105, 242, textureX, textureY,"lamp"); // Box 285 glow
		bodyModel[104] = new ModelRendererTurbo(this, 106, 262, textureX, textureY); // Box 38
		bodyModel[105] = new ModelRendererTurbo(this, 106, 233, textureX, textureY); // Box 462
		bodyModel[106] = new ModelRendererTurbo(this, 126, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[107] = new ModelRendererTurbo(this, 135, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[108] = new ModelRendererTurbo(this, 144, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[109] = new ModelRendererTurbo(this, 153, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[110] = new ModelRendererTurbo(this, 162, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[111] = new ModelRendererTurbo(this, 171, 344, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[112] = new ModelRendererTurbo(this, 122, 346, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[113] = new ModelRendererTurbo(this, 413, 313, textureX, textureY); // Box 38
		bodyModel[114] = new ModelRendererTurbo(this, 413, 304, textureX, textureY); // Box 38
		bodyModel[115] = new ModelRendererTurbo(this, 391, 260, textureX, textureY); // Box 38
		bodyModel[116] = new ModelRendererTurbo(this, 391, 269, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 337, 304, textureX, textureY); // Box 38
		bodyModel[118] = new ModelRendererTurbo(this, 314, 94, textureX, textureY); // Right side door part
		bodyModel[119] = new ModelRendererTurbo(this, 314, 65, textureX, textureY); // Left side door part
		bodyModel[120] = new ModelRendererTurbo(this, 72, 336, textureX, textureY); // Box 194
		bodyModel[121] = new ModelRendererTurbo(this, 72, 353, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 72, 332, textureX, textureY); // Box 193
		bodyModel[123] = new ModelRendererTurbo(this, 72, 339, textureX, textureY); // Box 192
		bodyModel[124] = new ModelRendererTurbo(this, 72, 356, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 72, 348, textureX, textureY); // Box 128
		bodyModel[126] = new ModelRendererTurbo(this, 462, 49, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 462, 69, textureX, textureY); // Box 176
		bodyModel[128] = new ModelRendererTurbo(this, 17, 154, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 17, 175, textureX, textureY); // Box 176
		bodyModel[130] = new ModelRendererTurbo(this, 453, 55, textureX, textureY); // Box 128
		bodyModel[131] = new ModelRendererTurbo(this, 5, 159, textureX, textureY); // Box 128
		bodyModel[132] = new ModelRendererTurbo(this, 332, 92, textureX, textureY); // Right step part
		bodyModel[133] = new ModelRendererTurbo(this, 330, 95, textureX, textureY); // Right step part
		bodyModel[134] = new ModelRendererTurbo(this, 332, 98, textureX, textureY); // Right step part
		bodyModel[135] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Right step part
		bodyModel[136] = new ModelRendererTurbo(this, 331, 105, textureX, textureY); // Right step part
		bodyModel[137] = new ModelRendererTurbo(this, 329, 98, textureX, textureY); // Right step part
		bodyModel[138] = new ModelRendererTurbo(this, 341, 98, textureX, textureY); // Right step part
		bodyModel[139] = new ModelRendererTurbo(this, 325, 84, textureX, textureY); // Box 1353
		bodyModel[140] = new ModelRendererTurbo(this, 341, 84, textureX, textureY); // Box 1354
		bodyModel[141] = new ModelRendererTurbo(this, 332, 88, textureX, textureY); // Box 1355
		bodyModel[142] = new ModelRendererTurbo(this, 330, 85, textureX, textureY); // Box 1356
		bodyModel[143] = new ModelRendererTurbo(this, 341, 82, textureX, textureY); // Box 1357
		bodyModel[144] = new ModelRendererTurbo(this, 329, 82, textureX, textureY); // Box 1358
		bodyModel[145] = new ModelRendererTurbo(this, 325, 59, textureX, textureY); // Box 26
		bodyModel[146] = new ModelRendererTurbo(this, 341, 59, textureX, textureY); // Box 26
		bodyModel[147] = new ModelRendererTurbo(this, 332, 63, textureX, textureY); // Box 26
		bodyModel[148] = new ModelRendererTurbo(this, 330, 60, textureX, textureY); // Box 26
		bodyModel[149] = new ModelRendererTurbo(this, 341, 57, textureX, textureY); // Box 26
		bodyModel[150] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 26
		bodyModel[151] = new ModelRendererTurbo(this, 341, 64, textureX, textureY); // Box 26
		bodyModel[152] = new ModelRendererTurbo(this, 327, 64, textureX, textureY); // Box 26
		bodyModel[153] = new ModelRendererTurbo(this, 341, 89, textureX, textureY); // Box 1359
		bodyModel[154] = new ModelRendererTurbo(this, 327, 89, textureX, textureY); // Box 1360
		bodyModel[155] = new ModelRendererTurbo(this, 332, 76, textureX, textureY); // Left step part
		bodyModel[156] = new ModelRendererTurbo(this, 327, 69, textureX, textureY); // Left step part
		bodyModel[157] = new ModelRendererTurbo(this, 332, 67, textureX, textureY); // Left step part
		bodyModel[158] = new ModelRendererTurbo(this, 330, 70, textureX, textureY); // Left step part
		bodyModel[159] = new ModelRendererTurbo(this, 332, 73, textureX, textureY); // Left step part
		bodyModel[160] = new ModelRendererTurbo(this, 341, 69, textureX, textureY); // Left step part
		bodyModel[161] = new ModelRendererTurbo(this, 331, 80, textureX, textureY); // Left step part
		bodyModel[162] = new ModelRendererTurbo(this, 341, 73, textureX, textureY); // Left step part
		bodyModel[163] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Left step part
		bodyModel[164] = new ModelRendererTurbo(this, 106, 4, textureX, textureY); // Box 128
		bodyModel[165] = new ModelRendererTurbo(this, 106, 9, textureX, textureY); // Box 128
		bodyModel[166] = new ModelRendererTurbo(this, 93, 19, textureX, textureY,"cull"); // Box 205 cull
		bodyModel[167] = new ModelRendererTurbo(this, 69, 76, textureX, textureY); // Box 128
		bodyModel[168] = new ModelRendererTurbo(this, 69, 100, textureX, textureY); // Box 202
		bodyModel[169] = new ModelRendererTurbo(this, 426, 19, textureX, textureY); // Box 128
		bodyModel[170] = new ModelRendererTurbo(this, 446, 16, textureX, textureY); // Box 153
		bodyModel[171] = new ModelRendererTurbo(this, 17, 42, textureX, textureY); // Box 128
		bodyModel[172] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 153
		bodyModel[173] = new ModelRendererTurbo(this, 147, 166, textureX, textureY); // Box 2
		bodyModel[174] = new ModelRendererTurbo(this, 147, 157, textureX, textureY); // Box 59
		bodyModel[175] = new ModelRendererTurbo(this, 202, 171, textureX, textureY); // Box 52
		bodyModel[176] = new ModelRendererTurbo(this, 222, 162, textureX, textureY); // Box 52
		bodyModel[177] = new ModelRendererTurbo(this, 202, 161, textureX, textureY); // Box 2
		bodyModel[178] = new ModelRendererTurbo(this, 327, 94, textureX, textureY); // Right step part
		bodyModel[179] = new ModelRendererTurbo(this, 341, 94, textureX, textureY); // Right step part
		bodyModel[180] = new ModelRendererTurbo(this, 320, 125, textureX, textureY); // Box 2
		bodyModel[181] = new ModelRendererTurbo(this, 34, 125, textureX, textureY); // Box 2
		bodyModel[182] = new ModelRendererTurbo(this, 72, 76, textureX, textureY); // Box 38
		bodyModel[183] = new ModelRendererTurbo(this, 72, 62, textureX, textureY); // Box 38
		bodyModel[184] = new ModelRendererTurbo(this, 72, 98, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 72, 133, textureX, textureY); // Box 128
		bodyModel[186] = new ModelRendererTurbo(this, 72, 106, textureX, textureY); // Box 38
		bodyModel[187] = new ModelRendererTurbo(this, 72, 84, textureX, textureY); // Box 128
		bodyModel[188] = new ModelRendererTurbo(this, 348, 68, textureX, textureY); // Box 38
		bodyModel[189] = new ModelRendererTurbo(this, 348, 90, textureX, textureY); // Box 128
		bodyModel[190] = new ModelRendererTurbo(this, 348, 76, textureX, textureY); // Box 38
		bodyModel[191] = new ModelRendererTurbo(this, 348, 62, textureX, textureY); // Box 38
		bodyModel[192] = new ModelRendererTurbo(this, 348, 98, textureX, textureY); // Box 128
		bodyModel[193] = new ModelRendererTurbo(this, 348, 84, textureX, textureY); // Box 128
		bodyModel[194] = new ModelRendererTurbo(this, 62, 21, textureX, textureY); // Box 38
		bodyModel[195] = new ModelRendererTurbo(this, 62, 27, textureX, textureY); // Box 38
		bodyModel[196] = new ModelRendererTurbo(this, 62, 35, textureX, textureY); // Box 38
		bodyModel[197] = new ModelRendererTurbo(this, 57, 21, textureX, textureY); // Box 280
		bodyModel[198] = new ModelRendererTurbo(this, 57, 27, textureX, textureY); // Box 281
		bodyModel[199] = new ModelRendererTurbo(this, 57, 35, textureX, textureY); // Box 282
		bodyModel[200] = new ModelRendererTurbo(this, 328, 21, textureX, textureY); // Box 38
		bodyModel[201] = new ModelRendererTurbo(this, 328, 27, textureX, textureY); // Box 38
		bodyModel[202] = new ModelRendererTurbo(this, 328, 35, textureX, textureY); // Box 38
		bodyModel[203] = new ModelRendererTurbo(this, 378, 21, textureX, textureY); // Box 280
		bodyModel[204] = new ModelRendererTurbo(this, 378, 27, textureX, textureY); // Box 281
		bodyModel[205] = new ModelRendererTurbo(this, 378, 35, textureX, textureY); // Box 282
		bodyModel[206] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 38
		bodyModel[207] = new ModelRendererTurbo(this, 395, 10, textureX, textureY); // Box 38
		bodyModel[208] = new ModelRendererTurbo(this, 395, 18, textureX, textureY); // Box 38
		bodyModel[209] = new ModelRendererTurbo(this, 400, 4, textureX, textureY); // Box 280
		bodyModel[210] = new ModelRendererTurbo(this, 400, 10, textureX, textureY); // Box 281
		bodyModel[211] = new ModelRendererTurbo(this, 400, 18, textureX, textureY); // Box 282
		bodyModel[212] = new ModelRendererTurbo(this, 368, 128, textureX, textureY); // Box 128
		bodyModel[213] = new ModelRendererTurbo(this, 368, 101, textureX, textureY); // Box 38
		bodyModel[214] = new ModelRendererTurbo(this, 54, 118, textureX, textureY); // Box 2
		bodyModel[215] = new ModelRendererTurbo(this, 98, 143, textureX, textureY); // Box 30
		bodyModel[216] = new ModelRendererTurbo(this, 54, 124, textureX, textureY); // Box 333
		bodyModel[217] = new ModelRendererTurbo(this, 141, 143, textureX, textureY); // Box 30
		bodyModel[218] = new ModelRendererTurbo(this, 141, 146, textureX, textureY); // Box 30
		bodyModel[219] = new ModelRendererTurbo(this, 98, 150, textureX, textureY); // Box 373
		bodyModel[220] = new ModelRendererTurbo(this, 141, 150, textureX, textureY); // Box 374
		bodyModel[221] = new ModelRendererTurbo(this, 141, 153, textureX, textureY); // Box 375
		bodyModel[222] = new ModelRendererTurbo(this, 308, 118, textureX, textureY); // Box 2
		bodyModel[223] = new ModelRendererTurbo(this, 302, 143, textureX, textureY); // Box 30
		bodyModel[224] = new ModelRendererTurbo(this, 308, 124, textureX, textureY); // Box 333
		bodyModel[225] = new ModelRendererTurbo(this, 302, 150, textureX, textureY); // Box 373
		bodyModel[226] = new ModelRendererTurbo(this, 297, 143, textureX, textureY); // Box 30
		bodyModel[227] = new ModelRendererTurbo(this, 297, 146, textureX, textureY); // Box 30
		bodyModel[228] = new ModelRendererTurbo(this, 297, 150, textureX, textureY); // Box 374
		bodyModel[229] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 375
		bodyModel[230] = new ModelRendererTurbo(this, 368, 137, textureX, textureY); // Box 2
		bodyModel[231] = new ModelRendererTurbo(this, 365, 142, textureX, textureY); // Box 2
		bodyModel[232] = new ModelRendererTurbo(this, 368, 140, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 368, 143, textureX, textureY); // Box 191
		bodyModel[234] = new ModelRendererTurbo(this, 365, 148, textureX, textureY); // Box 192
		bodyModel[235] = new ModelRendererTurbo(this, 368, 146, textureX, textureY); // Box 194
		bodyModel[236] = new ModelRendererTurbo(this, 58, 139, textureX, textureY); // Box 2
		bodyModel[237] = new ModelRendererTurbo(this, 71, 142, textureX, textureY); // Box 2
		bodyModel[238] = new ModelRendererTurbo(this, 58, 137, textureX, textureY); // Box 2
		bodyModel[239] = new ModelRendererTurbo(this, 58, 144, textureX, textureY); // Box 191
		bodyModel[240] = new ModelRendererTurbo(this, 71, 149, textureX, textureY); // Box 192
		bodyModel[241] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 194
		bodyModel[242] = new ModelRendererTurbo(this, 19, 53, textureX, textureY); // Box 31
		bodyModel[243] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 459
		bodyModel[244] = new ModelRendererTurbo(this, 8, 54, textureX, textureY); // Box 31
		bodyModel[245] = new ModelRendererTurbo(this, 462, 30, textureX, textureY); // Box 31
		bodyModel[246] = new ModelRendererTurbo(this, 480, 30, textureX, textureY); // Box 459
		bodyModel[247] = new ModelRendererTurbo(this, 469, 31, textureX, textureY); // Box 31
		bodyModel[248] = new ModelRendererTurbo(this, 314, 70, textureX, textureY); // Left side door part
		bodyModel[249] = new ModelRendererTurbo(this, 314, 78, textureX, textureY); // Left side door part
		bodyModel[250] = new ModelRendererTurbo(this, 311, 71, textureX, textureY); // Left side door part
		bodyModel[251] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Right side door part
		bodyModel[252] = new ModelRendererTurbo(this, 314, 102, textureX, textureY); // Right side door part
		bodyModel[253] = new ModelRendererTurbo(this, 311, 95, textureX, textureY); // Right side door part
		bodyModel[254] = new ModelRendererTurbo(this, 106, 19, textureX, textureY); // Box 403
		bodyModel[255] = new ModelRendererTurbo(this, 93, 14, textureX, textureY); // Box 205
		bodyModel[256] = new ModelRendererTurbo(this, 106, 14, textureX, textureY); // Box 405
		bodyModel[257] = new ModelRendererTurbo(this, 80, 9, textureX, textureY); // Box 38
		bodyModel[258] = new ModelRendererTurbo(this, 119, 9, textureX, textureY); // Box 38
		bodyModel[259] = new ModelRendererTurbo(this, 93, 4, textureX, textureY); // Box 204
		bodyModel[260] = new ModelRendererTurbo(this, 93, 9, textureX, textureY); // Box 205
		bodyModel[261] = new ModelRendererTurbo(this, 129, 6, textureX, textureY); // Box 38
		bodyModel[262] = new ModelRendererTurbo(this, 129, 11, textureX, textureY); // Box 487
		bodyModel[263] = new ModelRendererTurbo(this, 74, 161, textureX, textureY); // Box 41
		bodyModel[264] = new ModelRendererTurbo(this, 75, 157, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[265] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Box 41
		bodyModel[266] = new ModelRendererTurbo(this, 114, 160, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[267] = new ModelRendererTurbo(this, 95, 165, textureX, textureY); // Box 41
		bodyModel[268] = new ModelRendererTurbo(this, 96, 160, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[269] = new ModelRendererTurbo(this, 106, 154, textureX, textureY); // Box 38
		bodyModel[270] = new ModelRendererTurbo(this, 108, 165, textureX, textureY); // Box 38
		bodyModel[271] = new ModelRendererTurbo(this, 108, 160, textureX, textureY); // Box 38
		bodyModel[272] = new ModelRendererTurbo(this, 112, 153, textureX, textureY); // Box 38
		bodyModel[273] = new ModelRendererTurbo(this, 138, 163, textureX, textureY); // Box 41
		bodyModel[274] = new ModelRendererTurbo(this, 139, 156, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[275] = new ModelRendererTurbo(this, 128, 160, textureX, textureY); // Box 41
		bodyModel[276] = new ModelRendererTurbo(this, 128, 154, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[277] = new ModelRendererTurbo(this, 227, 164, textureX, textureY); // Box 41
		bodyModel[278] = new ModelRendererTurbo(this, 229, 159, textureX, textureY,"cull"); // Box 41 cull
		bodyModel[279] = new ModelRendererTurbo(this, 213, 171, textureX, textureY); // Box 2
		bodyModel[280] = new ModelRendererTurbo(this, 209, 171, textureX, textureY); // Box 52
		bodyModel[281] = new ModelRendererTurbo(this, 400, 302, textureX, textureY); // Box 38
		bodyModel[282] = new ModelRendererTurbo(this, 400, 308, textureX, textureY); // Box 38
		bodyModel[283] = new ModelRendererTurbo(this, 361, 254, textureX, textureY); // Box 280
		bodyModel[284] = new ModelRendererTurbo(this, 361, 260, textureX, textureY); // Box 281
		bodyModel[285] = new ModelRendererTurbo(this, 63, 291, textureX, textureY); // Box 38
		bodyModel[286] = new ModelRendererTurbo(this, 63, 297, textureX, textureY); // Box 38
		bodyModel[287] = new ModelRendererTurbo(this, 70, 253, textureX, textureY); // Box 280
		bodyModel[288] = new ModelRendererTurbo(this, 70, 259, textureX, textureY); // Box 281
		bodyModel[289] = new ModelRendererTurbo(this, 110, 267, textureX, textureY); // Right seat part
		bodyModel[290] = new ModelRendererTurbo(this, 110, 297, textureX, textureY); // Left seat part
		bodyModel[291] = new ModelRendererTurbo(this, 141, 267, textureX, textureY); // Right seat part
		bodyModel[292] = new ModelRendererTurbo(this, 141, 297, textureX, textureY); // Left seat part
		bodyModel[293] = new ModelRendererTurbo(this, 172, 267, textureX, textureY); // Right seat part
		bodyModel[294] = new ModelRendererTurbo(this, 172, 297, textureX, textureY); // Left seat part
		bodyModel[295] = new ModelRendererTurbo(this, 203, 297, textureX, textureY); // Left seat part
		bodyModel[296] = new ModelRendererTurbo(this, 203, 267, textureX, textureY); // Right seat part
		bodyModel[297] = new ModelRendererTurbo(this, 234, 267, textureX, textureY); // Right seat part
		bodyModel[298] = new ModelRendererTurbo(this, 234, 297, textureX, textureY); // Left seat part
		bodyModel[299] = new ModelRendererTurbo(this, 265, 267, textureX, textureY); // Right seat part
		bodyModel[300] = new ModelRendererTurbo(this, 265, 297, textureX, textureY); // Left seat part
		bodyModel[301] = new ModelRendererTurbo(this, 296, 267, textureX, textureY); // Right seat part
		bodyModel[302] = new ModelRendererTurbo(this, 296, 297, textureX, textureY); // Left seat part
		bodyModel[303] = new ModelRendererTurbo(this, 322, 269, textureX, textureY); // Box 38
		bodyModel[304] = new ModelRendererTurbo(this, 322, 299, textureX, textureY); // Box 38
		bodyModel[305] = new ModelRendererTurbo(this, 317, 302, textureX, textureY); // Box 38
		bodyModel[306] = new ModelRendererTurbo(this, 317, 308, textureX, textureY); // Box 38
		bodyModel[307] = new ModelRendererTurbo(this, 317, 272, textureX, textureY); // Box 280
		bodyModel[308] = new ModelRendererTurbo(this, 317, 278, textureX, textureY); // Box 281
		bodyModel[309] = new ModelRendererTurbo(this, 398, 75, textureX, textureY); // Box 38
		bodyModel[310] = new ModelRendererTurbo(this, 413, 49, textureX, textureY); // Box 128
		bodyModel[311] = new ModelRendererTurbo(this, 413, 69, textureX, textureY); // Box 176
		bodyModel[312] = new ModelRendererTurbo(this, 404, 55, textureX, textureY); // Box 128
		bodyModel[313] = new ModelRendererTurbo(this, 355, 274, textureX, textureY); // Box 38
		bodyModel[314] = new ModelRendererTurbo(this, 364, 304, textureX, textureY); // Box 38
		bodyModel[315] = new ModelRendererTurbo(this, 441, 274, textureX, textureY); // Box 38
		bodyModel[316] = new ModelRendererTurbo(this, 450, 304, textureX, textureY); // Box 38
		bodyModel[317] = new ModelRendererTurbo(this, 40, 379, textureX, textureY); // Right seat part
		bodyModel[318] = new ModelRendererTurbo(this, 40, 409, textureX, textureY); // Left seat part
		bodyModel[319] = new ModelRendererTurbo(this, 10, 380, textureX, textureY); // Box 38
		bodyModel[320] = new ModelRendererTurbo(this, 10, 410, textureX, textureY); // Box 38
		bodyModel[321] = new ModelRendererTurbo(this, 1, 413, textureX, textureY); // Box 38
		bodyModel[322] = new ModelRendererTurbo(this, 1, 419, textureX, textureY); // Box 38
		bodyModel[323] = new ModelRendererTurbo(this, 1, 383, textureX, textureY); // Box 280
		bodyModel[324] = new ModelRendererTurbo(this, 1, 389, textureX, textureY); // Box 281
		bodyModel[325] = new ModelRendererTurbo(this, 20, 251, textureX, textureY); // Box 38
		bodyModel[326] = new ModelRendererTurbo(this, 19, 319, textureX, textureY); // Box 38
		bodyModel[327] = new ModelRendererTurbo(this, 14, 321, textureX, textureY); // Box 38
		bodyModel[328] = new ModelRendererTurbo(this, 14, 327, textureX, textureY); // Box 38
		bodyModel[329] = new ModelRendererTurbo(this, 15, 253, textureX, textureY); // Box 280
		bodyModel[330] = new ModelRendererTurbo(this, 15, 259, textureX, textureY); // Box 281
		bodyModel[331] = new ModelRendererTurbo(this, 2, 260, textureX, textureY); // Box 38
		bodyModel[332] = new ModelRendererTurbo(this, 5, 265, textureX, textureY); // Box 38
		bodyModel[333] = new ModelRendererTurbo(this, 4, 269, textureX, textureY); // Box 38
		bodyModel[334] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 38
		bodyModel[335] = new ModelRendererTurbo(this, 4, 326, textureX, textureY); // Box 38
		bodyModel[336] = new ModelRendererTurbo(this, 3, 330, textureX, textureY); // Box 38
		bodyModel[337] = new ModelRendererTurbo(this, 38, 273, textureX, textureY); // Box 38
		bodyModel[338] = new ModelRendererTurbo(this, 30, 303, textureX, textureY); // Box 38
		bodyModel[339] = new ModelRendererTurbo(this, 105, 329, textureX, textureY); // Box 276
		bodyModel[340] = new ModelRendererTurbo(this, 105, 326, textureX, textureY); // Box 491
		bodyModel[341] = new ModelRendererTurbo(this, 403, 266, textureX, textureY); // Box 38
		bodyModel[342] = new ModelRendererTurbo(this, 408, 285, textureX, textureY); // Box 38
		bodyModel[343] = new ModelRendererTurbo(this, 408, 271, textureX, textureY); // Box 38
		bodyModel[344] = new ModelRendererTurbo(this, 408, 277, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[345] = new ModelRendererTurbo(this, 391, 278, textureX, textureY); // Box 38
		bodyModel[346] = new ModelRendererTurbo(this, 391, 284, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[347] = new ModelRendererTurbo(this, 412, 260, textureX, textureY); // Box 38
		bodyModel[348] = new ModelRendererTurbo(this, 412, 257, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[349] = new ModelRendererTurbo(this, 412, 267, textureX, textureY); // Box 38
		bodyModel[350] = new ModelRendererTurbo(this, 412, 264, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[351] = new ModelRendererTurbo(this, 437, 313, textureX, textureY); // Box 38
		bodyModel[352] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 38
		bodyModel[353] = new ModelRendererTurbo(this, 433, 298, textureX, textureY); // Box 38
		bodyModel[354] = new ModelRendererTurbo(this, 433, 304, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[355] = new ModelRendererTurbo(this, 420, 308, textureX, textureY); // Box 38
		bodyModel[356] = new ModelRendererTurbo(this, 420, 314, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[357] = new ModelRendererTurbo(this, 428, 297, textureX, textureY); // Box 38
		bodyModel[358] = new ModelRendererTurbo(this, 428, 294, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[359] = new ModelRendererTurbo(this, 428, 304, textureX, textureY); // Box 38
		bodyModel[360] = new ModelRendererTurbo(this, 428, 301, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[361] = new ModelRendererTurbo(this, 335, 268, textureX, textureY); // Box 38
		bodyModel[362] = new ModelRendererTurbo(this, 338, 273, textureX, textureY); // Box 38
		bodyModel[363] = new ModelRendererTurbo(this, 337, 277, textureX, textureY); // Box 38
		bodyModel[364] = new ModelRendererTurbo(this, 344, 309, textureX, textureY); // Box 38
		bodyModel[365] = new ModelRendererTurbo(this, 347, 314, textureX, textureY); // Box 38
		bodyModel[366] = new ModelRendererTurbo(this, 346, 318, textureX, textureY); // Box 38
		bodyModel[367] = new ModelRendererTurbo(this, 348, 265, textureX, textureY); // Box 38
		bodyModel[368] = new ModelRendererTurbo(this, 348, 274, textureX, textureY); // Box 38
		bodyModel[369] = new ModelRendererTurbo(this, 357, 313, textureX, textureY); // Box 38
		bodyModel[370] = new ModelRendererTurbo(this, 357, 304, textureX, textureY); // Box 38
		bodyModel[371] = new ModelRendererTurbo(this, 346, 283, textureX, textureY); // Box 38
		bodyModel[372] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 38
		bodyModel[373] = new ModelRendererTurbo(this, 369, 356, textureX, textureY); // Box 38
		bodyModel[374] = new ModelRendererTurbo(this, 372, 361, textureX, textureY); // Box 38
		bodyModel[375] = new ModelRendererTurbo(this, 371, 365, textureX, textureY); // Box 38
		bodyModel[376] = new ModelRendererTurbo(this, 378, 325, textureX, textureY); // Box 38
		bodyModel[377] = new ModelRendererTurbo(this, 356, 360, textureX, textureY); // Box 38
		bodyModel[378] = new ModelRendererTurbo(this, 363, 360, textureX, textureY); // Box 38
		bodyModel[379] = new ModelRendererTurbo(this, 368, 322, textureX, textureY); // Box 38
		bodyModel[380] = new ModelRendererTurbo(this, 369, 332, textureX, textureY); // Box 38
		bodyModel[381] = new ModelRendererTurbo(this, 352, 328, textureX, textureY); // Box 38
		bodyModel[382] = new ModelRendererTurbo(this, 352, 334, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[383] = new ModelRendererTurbo(this, 377, 322, textureX, textureY); // Box 38
		bodyModel[384] = new ModelRendererTurbo(this, 356, 342, textureX, textureY); // Box 38
		bodyModel[385] = new ModelRendererTurbo(this, 369, 341, textureX, textureY); // Box 128
		bodyModel[386] = new ModelRendererTurbo(this, 425, 274, textureX, textureY); // Box 38
		bodyModel[387] = new ModelRendererTurbo(this, 432, 274, textureX, textureY); // Box 38
		bodyModel[388] = new ModelRendererTurbo(this, 370, 370, textureX, textureY); // Box 38
		bodyModel[389] = new ModelRendererTurbo(this, 373, 375, textureX, textureY); // Box 38
		bodyModel[390] = new ModelRendererTurbo(this, 372, 379, textureX, textureY); // Box 38
		bodyModel[391] = new ModelRendererTurbo(this, 365, 385, textureX, textureY); // Box 38
		bodyModel[392] = new ModelRendererTurbo(this, 370, 383, textureX, textureY); // Box 38
		bodyModel[393] = new ModelRendererTurbo(this, 356, 388, textureX, textureY); // Box 38
		bodyModel[394] = new ModelRendererTurbo(this, 356, 379, textureX, textureY); // Box 38
		bodyModel[395] = new ModelRendererTurbo(this, 356, 370, textureX, textureY); // Box 38
		bodyModel[396] = new ModelRendererTurbo(this, 363, 370, textureX, textureY); // Box 38
		bodyModel[397] = new ModelRendererTurbo(this, 43, 312, textureX, textureY); // Box 38
		bodyModel[398] = new ModelRendererTurbo(this, 43, 303, textureX, textureY); // Box 38
		bodyModel[399] = new ModelRendererTurbo(this, 51, 282, textureX, textureY); // Box 38
		bodyModel[400] = new ModelRendererTurbo(this, 58, 282, textureX, textureY); // Box 38
		bodyModel[401] = new ModelRendererTurbo(this, 56, 298, textureX, textureY); // Box 38
		bodyModel[402] = new ModelRendererTurbo(this, 43, 294, textureX, textureY); // Box 38
		bodyModel[403] = new ModelRendererTurbo(this, 53, 268, textureX, textureY); // Box 38
		bodyModel[404] = new ModelRendererTurbo(this, 53, 274, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[405] = new ModelRendererTurbo(this, 50, 307, textureX, textureY); // Box 38
		bodyModel[406] = new ModelRendererTurbo(this, 50, 313, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[407] = new ModelRendererTurbo(this, 70, 282, textureX, textureY); // Box 38
		bodyModel[408] = new ModelRendererTurbo(this, 70, 273, textureX, textureY); // Box 38
		bodyModel[409] = new ModelRendererTurbo(this, 65, 282, textureX, textureY); // Box 38
		bodyModel[410] = new ModelRendererTurbo(this, 6, 359, textureX, textureY); // Box 38
		bodyModel[411] = new ModelRendererTurbo(this, 6, 368, textureX, textureY); // Box 38
		bodyModel[412] = new ModelRendererTurbo(this, 6, 350, textureX, textureY); // Box 38
		bodyModel[413] = new ModelRendererTurbo(this, 6, 341, textureX, textureY); // Box 38
		bodyModel[414] = new ModelRendererTurbo(this, 19, 346, textureX, textureY); // Box 38
		bodyModel[415] = new ModelRendererTurbo(this, 19, 352, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[416] = new ModelRendererTurbo(this, 19, 360, textureX, textureY); // Box 38
		bodyModel[417] = new ModelRendererTurbo(this, 19, 366, textureX, textureY,"cull"); // Box 38 cull
		bodyModel[418] = new ModelRendererTurbo(this, 13, 371, textureX, textureY); // Box 38
		bodyModel[419] = new ModelRendererTurbo(this, 13, 341, textureX, textureY); // Box 38
		bodyModel[420] = new ModelRendererTurbo(this, 1, 368, textureX, textureY); // Box 38
		bodyModel[421] = new ModelRendererTurbo(this, 1, 359, textureX, textureY); // Box 38
		bodyModel[422] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Box 38
		bodyModel[423] = new ModelRendererTurbo(this, 1, 350, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 264, 244, textureX, textureY); // Box 38
		bodyModel[425] = new ModelRendererTurbo(this, 262, 239, textureX, textureY); // Box 38
		bodyModel[426] = new ModelRendererTurbo(this, 264, 252, textureX, textureY); // Box 275
		bodyModel[427] = new ModelRendererTurbo(this, 262, 259, textureX, textureY); // Box 276
		bodyModel[428] = new ModelRendererTurbo(this, 47, 401, textureX, textureY,"lamp"); // Box 275 glow
		bodyModel[429] = new ModelRendererTurbo(this, 179, 346, textureX, textureY,"lamp"); // Box 38 glow
		bodyModel[430] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Right seat part
		bodyModel[431] = new ModelRendererTurbo(this, 289, 303, textureX, textureY); // Left seat part
		bodyModel[432] = new ModelRendererTurbo(this, 296, 285, textureX, textureY); // Right seat part
		bodyModel[433] = new ModelRendererTurbo(this, 301, 292, textureX, textureY); // Right seat part
		bodyModel[434] = new ModelRendererTurbo(this, 303, 285, textureX, textureY); // Right seat part
		bodyModel[435] = new ModelRendererTurbo(this, 310, 285, textureX, textureY); // Right seat part
		bodyModel[436] = new ModelRendererTurbo(this, 296, 274, textureX, textureY); // Right seat part
		bodyModel[437] = new ModelRendererTurbo(this, 301, 281, textureX, textureY); // Right seat part
		bodyModel[438] = new ModelRendererTurbo(this, 303, 274, textureX, textureY); // Right seat part
		bodyModel[439] = new ModelRendererTurbo(this, 310, 274, textureX, textureY); // Right seat part
		bodyModel[440] = new ModelRendererTurbo(this, 296, 315, textureX, textureY); // Left seat part
		bodyModel[441] = new ModelRendererTurbo(this, 301, 322, textureX, textureY); // Left seat part
		bodyModel[442] = new ModelRendererTurbo(this, 303, 315, textureX, textureY); // Left seat part
		bodyModel[443] = new ModelRendererTurbo(this, 310, 315, textureX, textureY); // Left seat part
		bodyModel[444] = new ModelRendererTurbo(this, 296, 304, textureX, textureY); // Left seat part
		bodyModel[445] = new ModelRendererTurbo(this, 301, 311, textureX, textureY); // Left seat part
		bodyModel[446] = new ModelRendererTurbo(this, 303, 304, textureX, textureY); // Left seat part
		bodyModel[447] = new ModelRendererTurbo(this, 310, 304, textureX, textureY); // Left seat part
		bodyModel[448] = new ModelRendererTurbo(this, 285, 284, textureX, textureY); // Boc 42
		bodyModel[449] = new ModelRendererTurbo(this, 285, 314, textureX, textureY); // Box 638
		bodyModel[450] = new ModelRendererTurbo(this, 300, 288, textureX, textureY); // Right seat part
		bodyModel[451] = new ModelRendererTurbo(this, 300, 277, textureX, textureY); // Right seat part
		bodyModel[452] = new ModelRendererTurbo(this, 300, 318, textureX, textureY); // Left seat part
		bodyModel[453] = new ModelRendererTurbo(this, 300, 307, textureX, textureY); // Left seat part
		bodyModel[454] = new ModelRendererTurbo(this, 309, 288, textureX, textureY); // Right seat part
		bodyModel[455] = new ModelRendererTurbo(this, 309, 277, textureX, textureY); // Right seat part
		bodyModel[456] = new ModelRendererTurbo(this, 309, 318, textureX, textureY); // Left seat part
		bodyModel[457] = new ModelRendererTurbo(this, 309, 307, textureX, textureY); // Left seat part
		bodyModel[458] = new ModelRendererTurbo(this, 254, 284, textureX, textureY); // Boc 42
		bodyModel[459] = new ModelRendererTurbo(this, 254, 314, textureX, textureY); // Box 638
		bodyModel[460] = new ModelRendererTurbo(this, 223, 284, textureX, textureY); // Boc 42
		bodyModel[461] = new ModelRendererTurbo(this, 223, 314, textureX, textureY); // Box 638
		bodyModel[462] = new ModelRendererTurbo(this, 192, 284, textureX, textureY); // Boc 42
		bodyModel[463] = new ModelRendererTurbo(this, 192, 314, textureX, textureY); // Box 638
		bodyModel[464] = new ModelRendererTurbo(this, 161, 284, textureX, textureY); // Boc 42
		bodyModel[465] = new ModelRendererTurbo(this, 161, 314, textureX, textureY); // Box 638
		bodyModel[466] = new ModelRendererTurbo(this, 130, 284, textureX, textureY); // Boc 42
		bodyModel[467] = new ModelRendererTurbo(this, 130, 314, textureX, textureY); // Box 638
		bodyModel[468] = new ModelRendererTurbo(this, 99, 284, textureX, textureY); // Boc 42
		bodyModel[469] = new ModelRendererTurbo(this, 99, 314, textureX, textureY); // Box 638
		bodyModel[470] = new ModelRendererTurbo(this, 29, 396, textureX, textureY); // Boc 42
		bodyModel[471] = new ModelRendererTurbo(this, 29, 426, textureX, textureY); // Box 638
		bodyModel[472] = new ModelRendererTurbo(this, 25, 274, textureX, textureY); // Box 128
		bodyModel[473] = new ModelRendererTurbo(this, 10, 273, textureX, textureY); // Box 38
		bodyModel[474] = new ModelRendererTurbo(this, 2, 303, textureX, textureY); // Box 38
		bodyModel[475] = new ModelRendererTurbo(this, 17, 304, textureX, textureY); // Box 128
		bodyModel[476] = new ModelRendererTurbo(this, 36, 342, textureX, textureY); // Box 38
		bodyModel[477] = new ModelRendererTurbo(this, 36, 360, textureX, textureY); // Box 38
		bodyModel[478] = new ModelRendererTurbo(this, 196, 273, textureX, textureY); // Right seat part
		bodyModel[479] = new ModelRendererTurbo(this, 196, 303, textureX, textureY); // Left seat part
		bodyModel[480] = new ModelRendererTurbo(this, 227, 273, textureX, textureY); // Right seat part
		bodyModel[481] = new ModelRendererTurbo(this, 227, 303, textureX, textureY); // Left seat part
		bodyModel[482] = new ModelRendererTurbo(this, 258, 273, textureX, textureY); // Right seat part
		bodyModel[483] = new ModelRendererTurbo(this, 258, 303, textureX, textureY); // Left seat part
		bodyModel[484] = new ModelRendererTurbo(this, 203, 285, textureX, textureY); // Right seat part
		bodyModel[485] = new ModelRendererTurbo(this, 210, 285, textureX, textureY); // Right seat part
		bodyModel[486] = new ModelRendererTurbo(this, 217, 285, textureX, textureY); // Right seat part
		bodyModel[487] = new ModelRendererTurbo(this, 203, 274, textureX, textureY); // Right seat part
		bodyModel[488] = new ModelRendererTurbo(this, 210, 274, textureX, textureY); // Right seat part
		bodyModel[489] = new ModelRendererTurbo(this, 217, 274, textureX, textureY); // Right seat part
		bodyModel[490] = new ModelRendererTurbo(this, 203, 315, textureX, textureY); // Left seat part
		bodyModel[491] = new ModelRendererTurbo(this, 210, 315, textureX, textureY); // Left seat part
		bodyModel[492] = new ModelRendererTurbo(this, 217, 315, textureX, textureY); // Left seat part
		bodyModel[493] = new ModelRendererTurbo(this, 203, 304, textureX, textureY); // Left seat part
		bodyModel[494] = new ModelRendererTurbo(this, 210, 304, textureX, textureY); // Left seat part
		bodyModel[495] = new ModelRendererTurbo(this, 265, 285, textureX, textureY); // Right seat part
		bodyModel[496] = new ModelRendererTurbo(this, 272, 285, textureX, textureY); // Right seat part
		bodyModel[497] = new ModelRendererTurbo(this, 279, 285, textureX, textureY); // Right seat part
		bodyModel[498] = new ModelRendererTurbo(this, 265, 274, textureX, textureY); // Right seat part
		bodyModel[499] = new ModelRendererTurbo(this, 272, 274, textureX, textureY); // Right seat part

		bodyModel[0].addBox(0F, 0F, 0F, 118, 2, 20, 0F); // Box 2
		bodyModel[0].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 2
		bodyModel[1].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 2
		bodyModel[2].setRotationPoint(56.5F, 1F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 2
		bodyModel[3].setRotationPoint(60.5F, 3F, 10.25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 2
		bodyModel[4].setRotationPoint(54.5F, 3F, 10.25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 2
		bodyModel[5].setRotationPoint(53F, 4F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 2 cull
		bodyModel[6].setRotationPoint(-61.5F, 3F, 10.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[7].setRotationPoint(-54.5F, 4F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[8].setRotationPoint(33.5F, 4F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 2
		bodyModel[9].setRotationPoint(-35F, 4F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 67, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 2
		bodyModel[10].setRotationPoint(-33.5F, 3F, 10.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 25
		bodyModel[11].setRotationPoint(60.5F, 3F, -10.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 27
		bodyModel[12].setRotationPoint(54.5F, 3F, -10.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(53F, 4F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 30 cull
		bodyModel[14].setRotationPoint(-61.5F, 3F, -10.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-54.5F, 4F, -10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[16].setRotationPoint(33.5F, 4F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 37
		bodyModel[17].setRotationPoint(-35F, 4F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 67, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 39
		bodyModel[18].setRotationPoint(-33.5F, 3F, -10.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(61F, 3F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[20].setRotationPoint(-63.5F, 3F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 114, 1, 4, 0F); // Box 2
		bodyModel[21].setRotationPoint(-57F, 3F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-7.5F, 4F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[23].setRotationPoint(-7.5F, 6.5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[24].setRotationPoint(-33F, 3F, -8.5F);
		bodyModel[24].rotateAngleX = -0.78539816F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F); // Box 41 cull
		bodyModel[25].setRotationPoint(-33F, 3F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Left trapdoor
		bodyModel[26].setRotationPoint(56.5F, 1F, -10.99F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right trapdoor
		bodyModel[27].setRotationPoint(56.5F, 1F, 4.99F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[28].setRotationPoint(-61.5F, -11F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-61.5F, -11F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[30].setRotationPoint(55.5F, -15F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[31].setRotationPoint(55.5F, -15F, 3F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[32].setRotationPoint(60.5F, -15F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[33].setRotationPoint(60.5F, -15F, 3F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[34].setRotationPoint(-61.5F, -15F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 128
		bodyModel[35].setRotationPoint(-61.5F, -15F, 3F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[36].setRotationPoint(55.5F, -15F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[37].setRotationPoint(60.5F, -15F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 128
		bodyModel[38].setRotationPoint(-61.5F, -15F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 128
		bodyModel[39].setRotationPoint(56.5F, -15F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0.19F, 0F, 0F, 0.19F); // Box 128
		bodyModel[40].setRotationPoint(56.5F, -15F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, -6F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Vestibule door
		bodyModel[41].setRotationPoint(55.5F, -14F, 3F);

		bodyModel[42].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front end door
		bodyModel[42].setRotationPoint(-60.5F, -14F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[43].setRotationPoint(61.5F, -15F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[44].setRotationPoint(62.5F, 1F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[45].setRotationPoint(61.5F, -14F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[46].setRotationPoint(61.5F, -14F, 3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[47].setRotationPoint(63F, -14F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[48].setRotationPoint(63F, -14F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(63F, 1F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(63F, -15F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-63F, -15F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[52].setRotationPoint(-63F, 1F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[53].setRotationPoint(-63F, -14F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[54].setRotationPoint(-63F, -14F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[55].setRotationPoint(-63.5F, -14F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[56].setRotationPoint(-63.5F, -14F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[57].setRotationPoint(-63.5F, 1F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-63.5F, -15F, -5F);

		bodyModel[59].addBox(0F, 0F, 0F, 123, 2, 4, 0F); // Box 128
		bodyModel[59].setRotationPoint(-61.5F, -20F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[60].setRotationPoint(-61.5F, -20F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[61].setRotationPoint(-61.5F, -19F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[62].setRotationPoint(-61.5F, -20F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 123, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F); // Box 169
		bodyModel[63].setRotationPoint(-61.5F, -19F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[64].setRotationPoint(-61.5F, -17F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-61.5F, -18F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[66].setRotationPoint(-61.5F, -19F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[67].setRotationPoint(-61.5F, -18F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 123, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[68].setRotationPoint(-61.5F, -19F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[69].setRotationPoint(-61.5F, -16F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 123, 1, 2, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		bodyModel[70].setRotationPoint(-61.5F, -16F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate closed
		bodyModel[71].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear gate open
		bodyModel[72].setRotationPoint(61.5F, -7F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[73].setRotationPoint(55.5F, -17F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[74].setRotationPoint(55.5F, -18F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[75].setRotationPoint(55.5F, -18F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[76].setRotationPoint(55.5F, -16.25F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 128
		bodyModel[77].setRotationPoint(-61.5F, -16.25F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 123, 1, 12, 0F); // Box 128
		bodyModel[78].setRotationPoint(-61.5F, -18F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, 0.12F, 0F, 0F, 0.12F); // Box 128
		bodyModel[79].setRotationPoint(56F, -6F, -11.96F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, 0.12F, 0F, 0F, 0.12F); // Box 128
		bodyModel[80].setRotationPoint(61F, -6F, -11.96F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(-61.5F, -2.5F, -11.92F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F); // Box 202
		bodyModel[82].setRotationPoint(56F, -6F, 10.96F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F); // Box 203
		bodyModel[83].setRotationPoint(61F, -6F, 10.96F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[84].setRotationPoint(-61.5F, -2.5F, 10.92F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[85].setRotationPoint(-61F, 6F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[86].setRotationPoint(-61F, 6F, 10F);

		bodyModel[87].addBox(0F, 0F, 0F, 8, 4, 5, 0F); // Box 2
		bodyModel[87].setRotationPoint(-20.5F, 3F, 4.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[88].setRotationPoint(-26.5F, 3F, 8.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[89].setRotationPoint(-15F, 3F, -9.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[90].setRotationPoint(-1.5F, 3F, -8.5F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F); // Box 41 cull
		bodyModel[91].setRotationPoint(-1.5F, 3F, -9F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 16, 6, 0F); // Box 38
		bodyModel[92].setRotationPoint(-46.5F, -15F, 3F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 16, 6, 0F); // Box 38
		bodyModel[93].setRotationPoint(-46.5F, -15F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 5, 16, 6, 0F); // Box 38
		bodyModel[94].setRotationPoint(41.5F, -15F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 16, 6, 0F); // Box 38
		bodyModel[95].setRotationPoint(41.5F, -15F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 19, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[96].setRotationPoint(-60.5F, -16.25F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 14, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[97].setRotationPoint(41.5F, -16.25F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Box 38
		bodyModel[98].setRotationPoint(-41.5F, -14F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.185F, 0F, 0F, 0.185F); // Box 38
		bodyModel[99].setRotationPoint(-41.5F, -13F, 8.38F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[100].setRotationPoint(-41.5F, -14F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.185F, 0F, 0F, 0.185F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[101].setRotationPoint(-41.5F, -13F, -9.38F);

		bodyModel[102].addBox(0F, 0F, 0F, 83, 0, 1, 0F); // Box 275 glow
		bodyModel[102].setRotationPoint(-41.5F, -12.99F, -7F);

		bodyModel[103].addBox(0F, 0F, 0F, 83, 0, 1, 0F); // Box 285 glow
		bodyModel[103].setRotationPoint(-41.5F, -12.99F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 116, 4, 0, 0F,0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, 0.21F, 0F, 0F, 0.21F, 0F, 0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0.04F, 0F, 0F, 0.04F); // Box 38
		bodyModel[104].setRotationPoint(-60.5F, -10F, -9.9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 116, 4, 0, 0F,0F, 0F, 0.21F, 0F, 0F, 0.21F, 0F, 0F, -0.21F, 0F, 0F, -0.21F, 0F, 0F, 0.04F, 0F, 0F, 0.04F, 0F, 0F, -0.04F, 0F, 0F, -0.04F); // Box 462
		bodyModel[105].setRotationPoint(-60.5F, -10F, 9.9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[106].setRotationPoint(-37.5F, -17F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[107].setRotationPoint(-22.5F, -17F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[108].setRotationPoint(-7.5F, -17F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[109].setRotationPoint(7.5F, -17F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[110].setRotationPoint(22.5F, -17F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38 glow
		bodyModel[111].setRotationPoint(37.5F, -17F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[112].setRotationPoint(-51.5F, -14.99F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[113].setRotationPoint(46.5F, -6F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[114].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[115].setRotationPoint(46.5F, -6F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[116].setRotationPoint(46.5F, -6F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[117].setRotationPoint(36.5F, -15F, -5F);

		bodyModel[118].addShapeBox(-0.06F, 0F, 0.13F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Right side door part
		bodyModel[118].setRotationPoint(56.56F, -11F, 10.12F);

		bodyModel[119].addShapeBox(-0.06F, 0F, -1.13F, 5, 3, 1, 0F,0F, 0F, -1.06F, -1F, 0F, -1.06F, -1F, 0F, 0.56F, 0F, 0F, 0.56F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Left side door part
		bodyModel[119].setRotationPoint(56.56F, -14F, -10.12F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[120].setRotationPoint(-41.5F, -18F, 6.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 77, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[121].setRotationPoint(-41.5F, -18F, -7.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 77, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[122].setRotationPoint(-41.5F, -16F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[123].setRotationPoint(-41.5F, -17F, 4.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 77, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[124].setRotationPoint(-41.5F, -16F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 77, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[125].setRotationPoint(-41.5F, -17F, -7.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[126].setRotationPoint(41.5F, -18F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[127].setRotationPoint(41.5F, -18F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[128].setRotationPoint(-60.5F, -18F, -9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[129].setRotationPoint(-60.5F, -18F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[130].setRotationPoint(41.5F, -17F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 19, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[131].setRotationPoint(-60.5F, -17F, -7F);

		bodyModel[132].addShapeBox(0F, -1F, 1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[132].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[133].addShapeBox(0F, -1F, 1F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[133].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[134].addShapeBox(0F, -3F, 3F, 4, 2, 0, 0F,0F, 0F, 0.19F, -0.02F, 0F, 0.19F, -0.02F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[134].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[135].addShapeBox(0F, -1F, 3F, 4, 3, 0, 0F,0F, 0F, 0.25F, -0.02F, 0F, 0.25F, -0.02F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, -0.02F, 0F, 1F, -0.02F, 0F, -1F, 0F, 0F, -1F); // Right step part
		bodyModel[135].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[136].addShapeBox(0F, 2F, 1F, 4, 0, 1, 0F,0F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.02F, -1F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[136].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[137].addShapeBox(0F, -1F, 1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[137].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[138].addShapeBox(0F, -1F, 1F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right step part
		bodyModel[138].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[139].setRotationPoint(56.5F, 3F, 4.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[140].setRotationPoint(60.5F, 3F, 4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[141].setRotationPoint(56.51F, 3F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[142].setRotationPoint(56.51F, 3F, 5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1357
		bodyModel[143].setRotationPoint(60.5F, 3F, 9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1358
		bodyModel[144].setRotationPoint(56.5F, 3F, 9.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[145].setRotationPoint(56.5F, 3F, -7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		bodyModel[146].setRotationPoint(60.5F, 3F, -7.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[147].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[148].setRotationPoint(56.51F, 3F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[149].setRotationPoint(60.5F, 3F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[150].setRotationPoint(56.5F, 3F, -10.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[151].setRotationPoint(60.5F, 3F, -9.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[152].setRotationPoint(56.5F, 3F, -9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1359
		bodyModel[153].setRotationPoint(60.5F, 3F, 7.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1360
		bodyModel[154].setRotationPoint(56.5F, 3F, 7.5F);

		bodyModel[155].addShapeBox(0F, -1F, -3F, 4, 3, 0, 0F,0F, 0F, -0.25F, -0.02F, 0F, -0.25F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.02F, 0F, -1F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Left step part
		bodyModel[155].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[156].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[156].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[157].addShapeBox(0F, -1F, -1F, 4, 2, 0, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[157].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[158].addShapeBox(0F, -1F, -3F, 4, 0, 2, 0F,0F, 0F, -0.25F, -0.02F, 0F, -0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.02F, 0F, -0.25F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[158].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[159].addShapeBox(0F, -3F, -3F, 4, 2, 0, 0F,0F, 0F, -0.19F, -0.02F, 0F, -0.19F, -0.02F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -0.25F, -0.02F, 0F, -0.25F, -0.02F, 0F, 0.25F, 0F, 0F, 0.25F); // Left step part
		bodyModel[159].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[160].addShapeBox(0F, -3F, -3F, 0, 2, 2, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Left step part
		bodyModel[160].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[161].addShapeBox(0F, 2F, -2F, 4, 0, 1, 0F,0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[161].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[162].addShapeBox(0F, -1F, -2F, 0, 3, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[162].setRotationPoint(60.49F, 4F, -8F);

		bodyModel[163].addShapeBox(0F, -1F, -2F, 0, 3, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Left step part
		bodyModel[163].setRotationPoint(56.51F, 4F, -8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 128
		bodyModel[164].setRotationPoint(-56F, -18.5F, 6.85F);
		bodyModel[164].rotateAngleX = 1.04283423F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 128
		bodyModel[165].setRotationPoint(-56F, -17.25F, 9F);
		bodyModel[165].rotateAngleX = 0.41887902F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.19F, -0.5F, -1F, 0.19F, -0.5F, -1F, 0.19F, -0.01F, 0F, 0.19F, -0.01F, 0F, -1.54F, -0.5F, -1F, -1.54F, -0.5F, -1F, -1.54F, -0.01F, 0F, -1.54F, -0.01F); // Box 205 cull
		bodyModel[166].setRotationPoint(-55.5F, -16.74F, -10.32F);
		bodyModel[166].rotateAngleX = -0.41887902F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, 0.12F, 0F, 0F, 0.12F); // Box 128
		bodyModel[167].setRotationPoint(-61F, -6F, -11.96F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.12F, 0F, 0F, 0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F); // Box 202
		bodyModel[168].setRotationPoint(-61F, -6F, 10.96F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[169].setRotationPoint(63F, -16F, -5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[170].setRotationPoint(63F, -16F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[171].setRotationPoint(-63.5F, -16F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[172].setRotationPoint(-63.5F, -16F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[173].setRotationPoint(-7.5F, 3F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 59
		bodyModel[174].setRotationPoint(-7.5F, 3F, -9.75F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[175].setRotationPoint(9.5F, 3F, 8.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 52
		bodyModel[176].setRotationPoint(28.5F, 3F, -9.75F);

		bodyModel[177].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 2
		bodyModel[177].setRotationPoint(12.5F, 3F, -9.5F);

		bodyModel[178].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -1.81F, 0F, 0F, -1.81F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[178].setRotationPoint(56.51F, 4F, 8F);

		bodyModel[179].addShapeBox(0F, -3F, 1F, 0, 2, 2, 0F,0F, 0F, -1.81F, 0F, 0F, -1.81F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right step part
		bodyModel[179].setRotationPoint(60.49F, 4F, 8F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[180].setRotationPoint(57F, 3F, -4F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 2
		bodyModel[181].setRotationPoint(-61F, 3F, -4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0.19F, 0F, 0F, 0.19F); // Box 38
		bodyModel[182].setRotationPoint(-61.5F, -5F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
		bodyModel[183].setRotationPoint(-61.5F, -15F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 128
		bodyModel[184].setRotationPoint(-61.5F, -5F, 10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 118, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[185].setRotationPoint(-61.5F, 1F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 118, 2, 1, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[186].setRotationPoint(-61.5F, 1F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[187].setRotationPoint(-61.5F, -15F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[188].setRotationPoint(60.5F, -11F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[189].setRotationPoint(60.5F, -11F, 10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0.19F, 0F, 0F, 0.19F); // Box 38
		bodyModel[190].setRotationPoint(60.5F, -5F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
		bodyModel[191].setRotationPoint(60.5F, -15F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 128
		bodyModel[192].setRotationPoint(60.5F, -5F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[193].setRotationPoint(60.5F, -15F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[194].setRotationPoint(-61.5F, -15F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[195].setRotationPoint(-61.5F, -11F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[196].setRotationPoint(-61.5F, -5F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[197].setRotationPoint(-61.5F, -15F, 9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[198].setRotationPoint(-61.5F, -11F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 282
		bodyModel[199].setRotationPoint(-61.5F, -5F, 9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[200].setRotationPoint(55.5F, -15F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[201].setRotationPoint(55.5F, -11F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[202].setRotationPoint(55.5F, -5F, -10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[203].setRotationPoint(55.5F, -15F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[204].setRotationPoint(55.5F, -11F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 282
		bodyModel[205].setRotationPoint(55.5F, -5F, 9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[206].setRotationPoint(60.5F, -15F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[207].setRotationPoint(60.5F, -11F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[208].setRotationPoint(60.5F, -5F, -10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[209].setRotationPoint(60.5F, -15F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[210].setRotationPoint(60.5F, -11F, 9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 282
		bodyModel[211].setRotationPoint(60.5F, -5F, 9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[212].setRotationPoint(60.5F, 1F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[213].setRotationPoint(60.5F, 1F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 2
		bodyModel[214].setRotationPoint(-46F, 3F, -7.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[215].setRotationPoint(-54.5F, 3F, -10.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 333
		bodyModel[216].setRotationPoint(-46F, 3F, 3.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[217].setRotationPoint(-34.5F, 3F, -10.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[218].setRotationPoint(-34.5F, 3F, -10.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 373
		bodyModel[219].setRotationPoint(-54.5F, 3F, 9.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 374
		bodyModel[220].setRotationPoint(-34.5F, 3F, 9.75F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 375
		bodyModel[221].setRotationPoint(-34.5F, 3F, 9.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 2
		bodyModel[222].setRotationPoint(42F, 3F, -7.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[223].setRotationPoint(34.5F, 3F, -10.75F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 333
		bodyModel[224].setRotationPoint(42F, 3F, 3.75F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 373
		bodyModel[225].setRotationPoint(34.5F, 3F, 9.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[226].setRotationPoint(33.5F, 3F, -10.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 30
		bodyModel[227].setRotationPoint(33.5F, 3F, -10.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 374
		bodyModel[228].setRotationPoint(33.5F, 3F, 9.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 375
		bodyModel[229].setRotationPoint(33.5F, 3F, 9.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 2
		bodyModel[230].setRotationPoint(61F, 3F, -9.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[231].setRotationPoint(61F, 3F, -10.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 2
		bodyModel[232].setRotationPoint(61F, 5.25F, -9.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 191
		bodyModel[233].setRotationPoint(61F, 3F, 3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 192
		bodyModel[234].setRotationPoint(61F, 3F, 9.25F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 194
		bodyModel[235].setRotationPoint(61F, 5.25F, 4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 2
		bodyModel[236].setRotationPoint(-61F, 3F, -9.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		bodyModel[237].setRotationPoint(-61F, 3F, -10.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 2
		bodyModel[238].setRotationPoint(-61F, 5.25F, -9.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 191
		bodyModel[239].setRotationPoint(-61F, 3F, 3.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 192
		bodyModel[240].setRotationPoint(-61F, 3F, 9.25F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 194
		bodyModel[241].setRotationPoint(-61F, 5.25F, 4F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 31
		bodyModel[242].setRotationPoint(-62.5F, 1F, -10.25F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 459
		bodyModel[243].setRotationPoint(-62.5F, 1F, 4F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[244].setRotationPoint(-62.5F, 1F, -4F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 31
		bodyModel[245].setRotationPoint(61.5F, 1F, -10.25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 459
		bodyModel[246].setRotationPoint(61.5F, 1F, 4F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[247].setRotationPoint(61.5F, 1F, -4F);

		bodyModel[248].addShapeBox(-0.06F, 0F, -1.13F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Left side door part
		bodyModel[248].setRotationPoint(56.56F, -11F, -10.12F);

		bodyModel[249].addShapeBox(-0.06F, 0F, -0.88F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.19F, -1F, 0F, -0.19F, -1F, 0F, -0.31F, 0F, 0F, -0.31F); // Left side door part
		bodyModel[249].setRotationPoint(56.56F, -5F, -10.12F);

		bodyModel[250].addShapeBox(-0.5F, 0F, 0F, 1, 6, 0, 0F,-0.12F, 0F, -0.06F, -0.56F, 0F, 0.38F, -0.56F, 0F, -0.38F, -0.12F, 0F, 0.06F, 0.13F, -0.01F, -0.06F, -0.56F, -0.01F, 0.63F, -0.56F, -0.01F, -0.63F, 0.13F, -0.01F, 0.06F); // Left side door part
		bodyModel[250].setRotationPoint(56.56F, -11F, -10.12F);

		bodyModel[251].addShapeBox(-0.06F, 0F, 0.13F, 5, 3, 1, 0F,0F, 0F, 0.56F, -1F, 0F, 0.56F, -1F, 0F, -1.06F, 0F, 0F, -1.06F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Right side door part
		bodyModel[251].setRotationPoint(56.56F, -14F, 10.12F);

		bodyModel[252].addShapeBox(-0.06F, 0F, 0.38F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.19F, -1F, 0F, 0.19F, -1F, 0F, -0.69F, 0F, 0F, -0.69F); // Right side door part
		bodyModel[252].setRotationPoint(56.56F, -5F, 10.12F);

		bodyModel[253].addShapeBox(-0.5F, 0F, 0F, 1, 6, 0, 0F,-0.12F, 0F, 0.06F, -0.56F, 0F, -0.38F, -0.56F, 0F, 0.38F, -0.12F, 0F, -0.06F, 0.13F, -0.01F, 0.06F, -0.56F, -0.01F, -0.63F, -0.56F, -0.01F, 0.63F, 0.13F, -0.01F, -0.06F); // Right side door part
		bodyModel[253].setRotationPoint(56.56F, -11F, 10.12F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.19F, -0.01F, -1F, 0.19F, -0.01F, -1F, 0.19F, -0.5F, 0F, 0.19F, -0.5F, 0F, -1.54F, -0.01F, -1F, -1.54F, -0.01F, -1F, -1.54F, -0.5F, 0F, -1.54F, -0.5F); // Box 403
		bodyModel[254].setRotationPoint(-55.5F, -16.33F, 9.41F);
		bodyModel[254].rotateAngleX = 0.41887902F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.19F, -0.1F, -1F, 0.19F, -0.1F, -1F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -1.68F, -0.1F, -1F, -1.68F, -0.1F, -1F, -1.68F, -0.675F, 0F, -1.68F, -0.675F); // Box 205
		bodyModel[255].setRotationPoint(-55.5F, -16.32F, -10.32F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.19F, 0F, -1F, 0.19F, 0F, -1F, 0.19F, -0.1F, 0F, 0.19F, -0.1F, 0F, -1.68F, -0.675F, -1F, -1.68F, -0.675F, -1F, -1.68F, -0.1F, 0F, -1.68F, -0.1F); // Box 405
		bodyModel[256].setRotationPoint(-55.5F, -16.32F, 9.32F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[257].setRotationPoint(-60F, -20.5F, -1.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[258].setRotationPoint(36F, -20.5F, -1.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.51F, 0F, 0F, -0.51F, 0F); // Box 204
		bodyModel[259].setRotationPoint(-56F, -19.36F, -7.36F);
		bodyModel[259].rotateAngleX = -1.04283423F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0.16F, -0.5F, 0F, 0.16F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.54F, 0F, 0F, -0.54F, 0F); // Box 205
		bodyModel[260].setRotationPoint(-56F, -17.65F, -9.92F);
		bodyModel[260].rotateAngleX = -0.41887902F;

		bodyModel[261].addShapeBox(0F, -0.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[261].setRotationPoint(50F, -19F, -6F);
		bodyModel[261].rotateAngleX = 0.2443461F;

		bodyModel[262].addShapeBox(0F, -0.5F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		bodyModel[262].setRotationPoint(50F, -19.75F, 3F);
		bodyModel[262].rotateAngleX = -0.2443461F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[263].setRotationPoint(-33F, 3F, -5.5F);
		bodyModel[263].rotateAngleX = -0.78539816F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F); // Box 41 cull
		bodyModel[264].setRotationPoint(-33F, 3F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[265].setRotationPoint(-20F, 3.2F, -8.8F);
		bodyModel[265].rotateAngleX = -0.78539816F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41 cull
		bodyModel[266].setRotationPoint(-19.99F, 2F, -9.3F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
		bodyModel[267].setRotationPoint(-24.5F, 3.2F, -5.5F);
		bodyModel[267].rotateAngleX = -0.78539816F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41 cull
		bodyModel[268].setRotationPoint(-24.51F, 2F, -6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.5F, 1.25F, 0F); // Box 38
		bodyModel[269].setRotationPoint(-21F, 3F, -9.1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, 0F, -0.5F, -1.125F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F); // Box 38
		bodyModel[270].setRotationPoint(-21F, 3F, -5.1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 38
		bodyModel[271].setRotationPoint(-21F, 3F, -6.1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -1.375F, -0.25F, 0F, -1.375F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 38
		bodyModel[272].setRotationPoint(-21F, 2.75F, -10.1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[273].setRotationPoint(-9.5F, 3.2F, -9F);
		bodyModel[273].rotateAngleZ = -0.78539816F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.75F, 0.01F, 0F, -0.75F, 0.01F, 0F, -0.75F, 0.01F, 0F, -0.75F, 0.01F); // Box 41 cull
		bodyModel[274].setRotationPoint(-10F, 3F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[275].setRotationPoint(-11.75F, 3.2F, -9F);
		bodyModel[275].rotateAngleZ = -0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 41 cull
		bodyModel[276].setRotationPoint(-12.25F, 3F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[277].setRotationPoint(19.5F, 4F, 0F);
		bodyModel[277].rotateAngleX = -0.78539816F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F); // Box 41 cull
		bodyModel[278].setRotationPoint(19.5F, 4F, -0.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 2
		bodyModel[279].setRotationPoint(15.5F, 3F, 4.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 52
		bodyModel[280].setRotationPoint(12F, 3F, 8.75F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[281].setRotationPoint(41.5F, -15F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[282].setRotationPoint(41.5F, -11F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[283].setRotationPoint(41.5F, -15F, 9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[284].setRotationPoint(41.5F, -11F, 9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[285].setRotationPoint(-46.5F, -15F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[286].setRotationPoint(-46.5F, -11F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[287].setRotationPoint(-46.5F, -15F, 9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[288].setRotationPoint(-46.5F, -11F, 9F);

		bodyModel[289].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[289].setRotationPoint(-36F, -3F, 7F);
		bodyModel[289].rotateAngleY = -3.14159265F;

		bodyModel[290].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[290].setRotationPoint(-36F, -3F, -7F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[291].setRotationPoint(-25F, -3F, 7F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[292].setRotationPoint(-25F, -3F, -7F);
		bodyModel[292].rotateAngleY = -3.14159265F;

		bodyModel[293].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[293].setRotationPoint(-14F, -3F, 7F);
		bodyModel[293].rotateAngleY = -3.14159265F;

		bodyModel[294].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[294].setRotationPoint(-14F, -3F, -7F);
		bodyModel[294].rotateAngleY = -3.14159265F;

		bodyModel[295].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[295].setRotationPoint(-3F, -3F, -7F);
		bodyModel[295].rotateAngleY = -3.14159265F;

		bodyModel[296].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[296].setRotationPoint(-3F, -3F, 7F);
		bodyModel[296].rotateAngleY = -3.14159265F;

		bodyModel[297].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[297].setRotationPoint(8F, -3F, 7F);
		bodyModel[297].rotateAngleY = -3.14159265F;

		bodyModel[298].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[298].setRotationPoint(8F, -3F, -7F);
		bodyModel[298].rotateAngleY = -3.14159265F;

		bodyModel[299].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[299].setRotationPoint(19F, -3F, 7F);
		bodyModel[299].rotateAngleY = -3.14159265F;

		bodyModel[300].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[300].setRotationPoint(19F, -3F, -7F);
		bodyModel[300].rotateAngleY = -3.14159265F;

		bodyModel[301].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[301].setRotationPoint(30F, -3F, 7F);
		bodyModel[301].rotateAngleY = -3.14159265F;

		bodyModel[302].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[302].setRotationPoint(30F, -3F, -7F);
		bodyModel[302].rotateAngleY = -3.14159265F;

		bodyModel[303].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[303].setRotationPoint(35.5F, -15F, 3F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 16, 6, 0F); // Box 38
		bodyModel[304].setRotationPoint(35.5F, -15F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[305].setRotationPoint(35.5F, -15F, -10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[306].setRotationPoint(35.5F, -11F, -10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[307].setRotationPoint(35.5F, -15F, 9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[308].setRotationPoint(35.5F, -11F, 9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 38
		bodyModel[309].setRotationPoint(35.5F, -16.25F, -9F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[310].setRotationPoint(35.5F, -18F, -9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 176
		bodyModel[311].setRotationPoint(35.5F, -18F, 6F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 128
		bodyModel[312].setRotationPoint(35.5F, -17F, -6F);

		bodyModel[313].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[313].setRotationPoint(36.5F, -15F, 3F);

		bodyModel[314].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[314].setRotationPoint(36.5F, -15F, -4F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Box 38
		bodyModel[315].setRotationPoint(51.5F, -15F, 3F);

		bodyModel[316].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 38
		bodyModel[316].setRotationPoint(46.5F, -15F, -4F);

		bodyModel[317].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[317].setRotationPoint(-52F, -3F, 7F);
		bodyModel[317].rotateAngleY = -3.14159265F;

		bodyModel[318].addShapeBox(-2.5F, 0F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[318].setRotationPoint(-52F, -3F, -7F);
		bodyModel[318].rotateAngleY = -3.14159265F;

		bodyModel[319].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 38
		bodyModel[319].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 38
		bodyModel[320].setRotationPoint(-60.5F, -15F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[321].setRotationPoint(-60.5F, -15F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[322].setRotationPoint(-60.5F, -11F, -10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[323].setRotationPoint(-60.5F, -15F, 9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[324].setRotationPoint(-60.5F, -11F, 9F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[325].setRotationPoint(-56.5F, -15F, 4F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 16, 5, 0F); // Box 38
		bodyModel[326].setRotationPoint(-56.5F, -15F, -9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[327].setRotationPoint(-56.5F, -15F, -10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[328].setRotationPoint(-56.5F, -11F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 280
		bodyModel[329].setRotationPoint(-56.5F, -15F, 9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[330].setRotationPoint(-56.5F, -11F, 9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[331].setRotationPoint(-60.45F, -2F, 8.4F);
		bodyModel[331].rotateAngleY = -0.78539816F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[332].setRotationPoint(-60.1F, -1F, 8.75F);
		bodyModel[332].rotateAngleY = -0.78539816F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[333].setRotationPoint(-60.45F, 0.5F, 8.4F);
		bodyModel[333].rotateAngleY = -0.78539816F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[334].setRotationPoint(-59F, -2F, -9.8F);
		bodyModel[334].rotateAngleY = 0.78539816F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[335].setRotationPoint(-59.35F, -1F, -9.45F);
		bodyModel[335].rotateAngleY = 0.78539816F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[336].setRotationPoint(-59F, 0.5F, -9.8F);
		bodyModel[336].rotateAngleY = 0.78539816F;

		bodyModel[337].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[337].setRotationPoint(-51.5F, -15F, 3F);

		bodyModel[338].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 38
		bodyModel[338].setRotationPoint(-51.5F, -15F, -4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 276
		bodyModel[339].setRotationPoint(-60.5F, -11F, -9.8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 116, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Box 491
		bodyModel[340].setRotationPoint(-60.5F, -11F, 8.8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[341].setRotationPoint(52.5F, -6F, 9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[342].setRotationPoint(51.5F, -4F, 4F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[343].setRotationPoint(52.5F, -3F, 6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[344].setRotationPoint(52.5F, -2F, 6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[345].setRotationPoint(46.51F, -3F, 5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[346].setRotationPoint(46.51F, -2F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[347].setRotationPoint(55F, -8.5F, 9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F); // Box 38 glow
		bodyModel[348].setRotationPoint(55F, -8F, 9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[349].setRotationPoint(55F, -8.5F, 5.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F); // Box 38 glow
		bodyModel[350].setRotationPoint(55F, -8F, 5.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[351].setRotationPoint(52.5F, -6F, -10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[352].setRotationPoint(51.5F, -4F, -5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[353].setRotationPoint(52.5F, -3F, -8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[354].setRotationPoint(52.5F, -2F, -8F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[355].setRotationPoint(46.51F, -3F, -7F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[356].setRotationPoint(46.51F, -2F, -7F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[357].setRotationPoint(55F, -8.5F, -6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F); // Box 38 glow
		bodyModel[358].setRotationPoint(55F, -8F, -6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[359].setRotationPoint(55F, -8.5F, -9.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F, 0.01F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, -0.49F, 0.01F, 0F, -0.49F); // Box 38 glow
		bodyModel[360].setRotationPoint(55F, -8F, -9.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[361].setRotationPoint(36.55F, -2F, 8.4F);
		bodyModel[361].rotateAngleY = -0.78539816F;

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[362].setRotationPoint(36.9F, -1F, 8.75F);
		bodyModel[362].rotateAngleY = -0.78539816F;

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[363].setRotationPoint(36.55F, 0.5F, 8.4F);
		bodyModel[363].rotateAngleY = -0.78539816F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[364].setRotationPoint(38F, -2F, -9.8F);
		bodyModel[364].rotateAngleY = 0.78539816F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[365].setRotationPoint(37.65F, -1F, -9.45F);
		bodyModel[365].rotateAngleY = 0.78539816F;

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[366].setRotationPoint(38F, 0.5F, -9.8F);
		bodyModel[366].rotateAngleY = 0.78539816F;

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[367].setRotationPoint(39.5F, -6F, 9F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[368].setRotationPoint(39.5F, -6F, 8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[369].setRotationPoint(39.5F, -6F, -10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[370].setRotationPoint(39.5F, -6F, -9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[371].setRotationPoint(37.5F, -6F, 4F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[372].setRotationPoint(36.5F, -6F, 4F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 38
		bodyModel[373].setRotationPoint(52.94F, -2F, -8.73999999999999F);
		bodyModel[373].rotateAngleY = -0.78539816F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[374].setRotationPoint(53.11F, -1F, -8.21F);
		bodyModel[374].rotateAngleY = -0.78539816F;

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[375].setRotationPoint(52.76F, 0.5F, -8.56F);
		bodyModel[375].rotateAngleY = -0.78539816F;

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[376].setRotationPoint(53.5F, -6F, 4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[377].setRotationPoint(46.5F, -6F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[378].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[379].setRotationPoint(46.5F, -6F, 8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[380].setRotationPoint(46.5F, -6F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[381].setRotationPoint(46.51F, -3F, 4F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[382].setRotationPoint(46.51F, -2F, 4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[383].setRotationPoint(51.5F, -6F, 4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 38
		bodyModel[384].setRotationPoint(46.5F, -15F, -6F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[385].setRotationPoint(48.5F, -15F, 3.5F);

		bodyModel[386].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 38
		bodyModel[386].setRotationPoint(46.5F, -15F, 3F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[387].setRotationPoint(48.5F, -15F, 3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[388].setRotationPoint(53.96F, -2F, 9.82F);
		bodyModel[388].rotateAngleY = -2.35619449F;

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 38
		bodyModel[389].setRotationPoint(54.31F, -1F, 9.47F);
		bodyModel[389].rotateAngleY = -2.35619449F;

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 38
		bodyModel[390].setRotationPoint(53.96F, 0.5F, 9.82F);
		bodyModel[390].rotateAngleY = -2.35619449F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[391].setRotationPoint(53.5F, -6F, 4F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 38
		bodyModel[392].setRotationPoint(54.5F, -6F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[393].setRotationPoint(46.5F, -4F, -5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[394].setRotationPoint(46.5F, -4F, 4F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[395].setRotationPoint(46.5F, -6F, 9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[396].setRotationPoint(46.5F, -6F, 8F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[397].setRotationPoint(-55.5F, -6F, -10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[398].setRotationPoint(-55.5F, -6F, -9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[399].setRotationPoint(-55.5F, -6F, 9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[400].setRotationPoint(-55.5F, -6F, 8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[401].setRotationPoint(-48.5F, -6F, -6F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[402].setRotationPoint(-51.5F, -6F, -5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[403].setRotationPoint(-48.51F, -3F, 7F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[404].setRotationPoint(-48.51F, -2F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[405].setRotationPoint(-48.51F, -3F, -9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[406].setRotationPoint(-48.51F, -2F, -9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[407].setRotationPoint(-48.5F, -6F, 4F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[408].setRotationPoint(-48.5F, -6F, 5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[409].setRotationPoint(-51.5F, -6F, 4F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[410].setRotationPoint(-51.5F, -6F, -5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[411].setRotationPoint(-51.5F, -6F, -6F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[412].setRotationPoint(-51.5F, -6F, 4F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[413].setRotationPoint(-51.5F, -6F, 5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[414].setRotationPoint(-48.51F, -3F, 4F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[415].setRotationPoint(-48.51F, -2F, 4F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 38
		bodyModel[416].setRotationPoint(-48.51F, -3F, -6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -0.01F, 0F, -2F, -0.01F, 0F, -2F, -0.01F, -2F, 0F, -0.01F, -2F); // Box 38 cull
		bodyModel[417].setRotationPoint(-48.51F, -2F, -6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 38
		bodyModel[418].setRotationPoint(-47.5F, -4F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[419].setRotationPoint(-47.5F, -4F, 7F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 38
		bodyModel[420].setRotationPoint(-55.5F, -6F, -9F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[421].setRotationPoint(-55.5F, -6F, -8F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 38
		bodyModel[422].setRotationPoint(-55.5F, -6F, 8F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(-55.5F, -6F, 7F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Box 38
		bodyModel[424].setRotationPoint(35.5F, -14F, 6F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.185F, 0F, 0F, 0.185F); // Box 38
		bodyModel[425].setRotationPoint(35.5F, -13F, 8.38F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[426].setRotationPoint(35.5F, -14F, -9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.005F, 0F, 0F, -0.005F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.185F, 0F, 0F, 0.185F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[427].setRotationPoint(35.5F, -13F, -9.38F);

		bodyModel[428].addBox(0F, 0F, 0F, 11, 0, 14, 0F); // Box 275 glow
		bodyModel[428].setRotationPoint(-57.5F, -14.99F, -7F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38 glow
		bodyModel[429].setRotationPoint(45F, -14.99F, -0.5F);

		bodyModel[430].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[430].setRotationPoint(30F, -8F, 7F);
		bodyModel[430].rotateAngleY = -3.14159265F;

		bodyModel[431].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[431].setRotationPoint(30F, -8F, -7F);
		bodyModel[431].rotateAngleY = -3.14159265F;

		bodyModel[432].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[432].setRotationPoint(30F, -5F, 7F);
		bodyModel[432].rotateAngleY = -3.14159265F;

		bodyModel[433].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[433].setRotationPoint(30F, -3F, 7F);
		bodyModel[433].rotateAngleY = -3.14159265F;

		bodyModel[434].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[434].setRotationPoint(30F, -5F, 7F);
		bodyModel[434].rotateAngleY = -3.14159265F;

		bodyModel[435].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[435].setRotationPoint(30F, -4F, 7F);
		bodyModel[435].rotateAngleY = -3.14159265F;

		bodyModel[436].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[436].setRotationPoint(30F, -5F, 7F);
		bodyModel[436].rotateAngleY = -3.14159265F;

		bodyModel[437].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[437].setRotationPoint(30F, -3F, 7F);
		bodyModel[437].rotateAngleY = -3.14159265F;

		bodyModel[438].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[438].setRotationPoint(30F, -5F, 7F);
		bodyModel[438].rotateAngleY = -3.14159265F;

		bodyModel[439].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[439].setRotationPoint(30F, -4F, 7F);
		bodyModel[439].rotateAngleY = -3.14159265F;

		bodyModel[440].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[440].setRotationPoint(30F, -5F, -7F);
		bodyModel[440].rotateAngleY = -3.14159265F;

		bodyModel[441].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[441].setRotationPoint(30F, -3F, -7F);
		bodyModel[441].rotateAngleY = -3.14159265F;

		bodyModel[442].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[442].setRotationPoint(30F, -5F, -7F);
		bodyModel[442].rotateAngleY = -3.14159265F;

		bodyModel[443].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[443].setRotationPoint(30F, -4F, -7F);
		bodyModel[443].rotateAngleY = -3.14159265F;

		bodyModel[444].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[444].setRotationPoint(30F, -5F, -7F);
		bodyModel[444].rotateAngleY = -3.14159265F;

		bodyModel[445].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[445].setRotationPoint(30F, -3F, -7F);
		bodyModel[445].rotateAngleY = -3.14159265F;

		bodyModel[446].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[446].setRotationPoint(30F, -5F, -7F);
		bodyModel[446].rotateAngleY = -3.14159265F;

		bodyModel[447].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[447].setRotationPoint(30F, -4F, -7F);
		bodyModel[447].rotateAngleY = -3.14159265F;

		bodyModel[448].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[448].setRotationPoint(28.5F, -1F, 5F);

		bodyModel[449].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[449].setRotationPoint(28.5F, -1F, -9F);

		bodyModel[450].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[450].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[450].rotateAngleY = -3.14159265F;

		bodyModel[451].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[451].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[451].rotateAngleY = -3.14159265F;

		bodyModel[452].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[452].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[452].rotateAngleY = -3.14159265F;

		bodyModel[453].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[453].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[453].rotateAngleY = -3.14159265F;

		bodyModel[454].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[454].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[454].rotateAngleY = -3.14159265F;

		bodyModel[455].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[455].setRotationPoint(30F, -4.5F, 7F);
		bodyModel[455].rotateAngleY = -3.14159265F;

		bodyModel[456].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[456].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[456].rotateAngleY = -3.14159265F;

		bodyModel[457].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[457].setRotationPoint(30F, -4.5F, -7F);
		bodyModel[457].rotateAngleY = -3.14159265F;

		bodyModel[458].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[458].setRotationPoint(17.5F, -1F, 5F);

		bodyModel[459].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[459].setRotationPoint(17.5F, -1F, -9F);

		bodyModel[460].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[460].setRotationPoint(6.5F, -1F, 5F);

		bodyModel[461].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[461].setRotationPoint(6.5F, -1F, -9F);

		bodyModel[462].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[462].setRotationPoint(-4.5F, -1F, 5F);

		bodyModel[463].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[463].setRotationPoint(-4.5F, -1F, -9F);

		bodyModel[464].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[464].setRotationPoint(-15.5F, -1F, 5F);

		bodyModel[465].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[465].setRotationPoint(-15.5F, -1F, -9F);

		bodyModel[466].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[466].setRotationPoint(-26.5F, -1F, 5F);

		bodyModel[467].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[467].setRotationPoint(-26.5F, -1F, -9F);

		bodyModel[468].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[468].setRotationPoint(-37.5F, -1F, 5F);

		bodyModel[469].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[469].setRotationPoint(-37.5F, -1F, -9F);

		bodyModel[470].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Boc 42
		bodyModel[470].setRotationPoint(-53.5F, -1F, 5F);

		bodyModel[471].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 638
		bodyModel[471].setRotationPoint(-53.5F, -1F, -9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[472].setRotationPoint(-54.5F, -15F, 3.5F);

		bodyModel[473].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[473].setRotationPoint(-60.5F, -15F, 3F);

		bodyModel[474].addBox(0F, 0F, 0F, 6, 16, 1, 0F); // Box 38
		bodyModel[474].setRotationPoint(-60.5F, -15F, -4F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 6, 14, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[475].setRotationPoint(-54.5F, -15F, -3.5F);

		bodyModel[476].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[476].setRotationPoint(-54.5F, -15F, 3F);

		bodyModel[477].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 38
		bodyModel[477].setRotationPoint(-54.5F, -15F, -4F);

		bodyModel[478].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[478].setRotationPoint(-3F, -8F, 7F);
		bodyModel[478].rotateAngleY = -3.14159265F;

		bodyModel[479].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[479].setRotationPoint(-3F, -8F, -7F);
		bodyModel[479].rotateAngleY = -3.14159265F;

		bodyModel[480].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[480].setRotationPoint(8F, -8F, 7F);
		bodyModel[480].rotateAngleY = -3.14159265F;

		bodyModel[481].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[481].setRotationPoint(8F, -8F, -7F);
		bodyModel[481].rotateAngleY = -3.14159265F;

		bodyModel[482].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[482].setRotationPoint(19F, -8F, 7F);
		bodyModel[482].rotateAngleY = -3.14159265F;

		bodyModel[483].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[483].setRotationPoint(19F, -8F, -7F);
		bodyModel[483].rotateAngleY = -3.14159265F;

		bodyModel[484].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[484].setRotationPoint(-3F, -5F, 7F);
		bodyModel[484].rotateAngleY = -3.14159265F;

		bodyModel[485].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[485].setRotationPoint(-3F, -5F, 7F);
		bodyModel[485].rotateAngleY = -3.14159265F;

		bodyModel[486].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[486].setRotationPoint(-3F, -4F, 7F);
		bodyModel[486].rotateAngleY = -3.14159265F;

		bodyModel[487].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[487].setRotationPoint(-3F, -5F, 7F);
		bodyModel[487].rotateAngleY = -3.14159265F;

		bodyModel[488].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[488].setRotationPoint(-3F, -5F, 7F);
		bodyModel[488].rotateAngleY = -3.14159265F;

		bodyModel[489].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[489].setRotationPoint(-3F, -4F, 7F);
		bodyModel[489].rotateAngleY = -3.14159265F;

		bodyModel[490].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[490].setRotationPoint(-3F, -5F, -7F);
		bodyModel[490].rotateAngleY = -3.14159265F;

		bodyModel[491].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[491].setRotationPoint(-3F, -5F, -7F);
		bodyModel[491].rotateAngleY = -3.14159265F;

		bodyModel[492].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[492].setRotationPoint(-3F, -4F, -7F);
		bodyModel[492].rotateAngleY = -3.14159265F;

		bodyModel[493].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[493].setRotationPoint(-3F, -5F, -7F);
		bodyModel[493].rotateAngleY = -3.14159265F;

		bodyModel[494].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[494].setRotationPoint(-3F, -5F, -7F);
		bodyModel[494].rotateAngleY = -3.14159265F;

		bodyModel[495].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[495].setRotationPoint(19F, -5F, 7F);
		bodyModel[495].rotateAngleY = -3.14159265F;

		bodyModel[496].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[496].setRotationPoint(19F, -5F, 7F);
		bodyModel[496].rotateAngleY = -3.14159265F;

		bodyModel[497].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[497].setRotationPoint(19F, -4F, 7F);
		bodyModel[497].rotateAngleY = -3.14159265F;

		bodyModel[498].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[498].setRotationPoint(19F, -5F, 7F);
		bodyModel[498].rotateAngleY = -3.14159265F;

		bodyModel[499].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[499].setRotationPoint(19F, -5F, 7F);
		bodyModel[499].rotateAngleY = -3.14159265F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 279, 274, textureX, textureY); // Right seat part
		bodyModel[501] = new ModelRendererTurbo(this, 234, 285, textureX, textureY); // Right seat part
		bodyModel[502] = new ModelRendererTurbo(this, 241, 285, textureX, textureY); // Right seat part
		bodyModel[503] = new ModelRendererTurbo(this, 248, 285, textureX, textureY); // Right seat part
		bodyModel[504] = new ModelRendererTurbo(this, 234, 274, textureX, textureY); // Right seat part
		bodyModel[505] = new ModelRendererTurbo(this, 241, 274, textureX, textureY); // Right seat part
		bodyModel[506] = new ModelRendererTurbo(this, 248, 274, textureX, textureY); // Right seat part
		bodyModel[507] = new ModelRendererTurbo(this, 265, 315, textureX, textureY); // Left seat part
		bodyModel[508] = new ModelRendererTurbo(this, 272, 315, textureX, textureY); // Left seat part
		bodyModel[509] = new ModelRendererTurbo(this, 279, 315, textureX, textureY); // Left seat part
		bodyModel[510] = new ModelRendererTurbo(this, 265, 304, textureX, textureY); // Left seat part
		bodyModel[511] = new ModelRendererTurbo(this, 272, 304, textureX, textureY); // Left seat part
		bodyModel[512] = new ModelRendererTurbo(this, 279, 304, textureX, textureY); // Left seat part
		bodyModel[513] = new ModelRendererTurbo(this, 234, 315, textureX, textureY); // Left seat part
		bodyModel[514] = new ModelRendererTurbo(this, 241, 315, textureX, textureY); // Left seat part
		bodyModel[515] = new ModelRendererTurbo(this, 248, 315, textureX, textureY); // Left seat part
		bodyModel[516] = new ModelRendererTurbo(this, 234, 304, textureX, textureY); // Left seat part
		bodyModel[517] = new ModelRendererTurbo(this, 241, 304, textureX, textureY); // Left seat part
		bodyModel[518] = new ModelRendererTurbo(this, 248, 304, textureX, textureY); // Left seat part
		bodyModel[519] = new ModelRendererTurbo(this, 217, 304, textureX, textureY); // Left seat part
		bodyModel[520] = new ModelRendererTurbo(this, 208, 292, textureX, textureY); // Right seat part
		bodyModel[521] = new ModelRendererTurbo(this, 208, 281, textureX, textureY); // Right seat part
		bodyModel[522] = new ModelRendererTurbo(this, 208, 322, textureX, textureY); // Left seat part
		bodyModel[523] = new ModelRendererTurbo(this, 208, 311, textureX, textureY); // Left seat part
		bodyModel[524] = new ModelRendererTurbo(this, 270, 292, textureX, textureY); // Right seat part
		bodyModel[525] = new ModelRendererTurbo(this, 270, 281, textureX, textureY); // Right seat part
		bodyModel[526] = new ModelRendererTurbo(this, 239, 292, textureX, textureY); // Right seat part
		bodyModel[527] = new ModelRendererTurbo(this, 239, 281, textureX, textureY); // Right seat part
		bodyModel[528] = new ModelRendererTurbo(this, 270, 322, textureX, textureY); // Left seat part
		bodyModel[529] = new ModelRendererTurbo(this, 270, 311, textureX, textureY); // Left seat part
		bodyModel[530] = new ModelRendererTurbo(this, 239, 322, textureX, textureY); // Left seat part
		bodyModel[531] = new ModelRendererTurbo(this, 239, 311, textureX, textureY); // Left seat part
		bodyModel[532] = new ModelRendererTurbo(this, 165, 303, textureX, textureY); // Left seat part
		bodyModel[533] = new ModelRendererTurbo(this, 172, 285, textureX, textureY); // Right seat part
		bodyModel[534] = new ModelRendererTurbo(this, 177, 292, textureX, textureY); // Right seat part
		bodyModel[535] = new ModelRendererTurbo(this, 179, 285, textureX, textureY); // Right seat part
		bodyModel[536] = new ModelRendererTurbo(this, 186, 285, textureX, textureY); // Right seat part
		bodyModel[537] = new ModelRendererTurbo(this, 172, 274, textureX, textureY); // Right seat part
		bodyModel[538] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Right seat part
		bodyModel[539] = new ModelRendererTurbo(this, 179, 274, textureX, textureY); // Right seat part
		bodyModel[540] = new ModelRendererTurbo(this, 186, 274, textureX, textureY); // Right seat part
		bodyModel[541] = new ModelRendererTurbo(this, 172, 315, textureX, textureY); // Left seat part
		bodyModel[542] = new ModelRendererTurbo(this, 177, 322, textureX, textureY); // Left seat part
		bodyModel[543] = new ModelRendererTurbo(this, 179, 315, textureX, textureY); // Left seat part
		bodyModel[544] = new ModelRendererTurbo(this, 186, 315, textureX, textureY); // Left seat part
		bodyModel[545] = new ModelRendererTurbo(this, 172, 304, textureX, textureY); // Left seat part
		bodyModel[546] = new ModelRendererTurbo(this, 177, 311, textureX, textureY); // Left seat part
		bodyModel[547] = new ModelRendererTurbo(this, 179, 304, textureX, textureY); // Left seat part
		bodyModel[548] = new ModelRendererTurbo(this, 186, 304, textureX, textureY); // Left seat part
		bodyModel[549] = new ModelRendererTurbo(this, 165, 273, textureX, textureY); // Right seat part
		bodyModel[550] = new ModelRendererTurbo(this, 134, 273, textureX, textureY); // Right seat part
		bodyModel[551] = new ModelRendererTurbo(this, 134, 303, textureX, textureY); // Left seat part
		bodyModel[552] = new ModelRendererTurbo(this, 141, 285, textureX, textureY); // Right seat part
		bodyModel[553] = new ModelRendererTurbo(this, 146, 292, textureX, textureY); // Right seat part
		bodyModel[554] = new ModelRendererTurbo(this, 148, 285, textureX, textureY); // Right seat part
		bodyModel[555] = new ModelRendererTurbo(this, 155, 285, textureX, textureY); // Right seat part
		bodyModel[556] = new ModelRendererTurbo(this, 141, 274, textureX, textureY); // Right seat part
		bodyModel[557] = new ModelRendererTurbo(this, 146, 281, textureX, textureY); // Right seat part
		bodyModel[558] = new ModelRendererTurbo(this, 148, 274, textureX, textureY); // Right seat part
		bodyModel[559] = new ModelRendererTurbo(this, 155, 274, textureX, textureY); // Right seat part
		bodyModel[560] = new ModelRendererTurbo(this, 141, 315, textureX, textureY); // Left seat part
		bodyModel[561] = new ModelRendererTurbo(this, 146, 322, textureX, textureY); // Left seat part
		bodyModel[562] = new ModelRendererTurbo(this, 148, 315, textureX, textureY); // Left seat part
		bodyModel[563] = new ModelRendererTurbo(this, 155, 315, textureX, textureY); // Left seat part
		bodyModel[564] = new ModelRendererTurbo(this, 141, 304, textureX, textureY); // Left seat part
		bodyModel[565] = new ModelRendererTurbo(this, 146, 311, textureX, textureY); // Left seat part
		bodyModel[566] = new ModelRendererTurbo(this, 148, 304, textureX, textureY); // Left seat part
		bodyModel[567] = new ModelRendererTurbo(this, 155, 304, textureX, textureY); // Left seat part
		bodyModel[568] = new ModelRendererTurbo(this, 103, 273, textureX, textureY); // Right seat part
		bodyModel[569] = new ModelRendererTurbo(this, 103, 303, textureX, textureY); // Left seat part
		bodyModel[570] = new ModelRendererTurbo(this, 110, 285, textureX, textureY); // Right seat part
		bodyModel[571] = new ModelRendererTurbo(this, 115, 292, textureX, textureY); // Right seat part
		bodyModel[572] = new ModelRendererTurbo(this, 117, 285, textureX, textureY); // Right seat part
		bodyModel[573] = new ModelRendererTurbo(this, 124, 285, textureX, textureY); // Right seat part
		bodyModel[574] = new ModelRendererTurbo(this, 110, 274, textureX, textureY); // Right seat part
		bodyModel[575] = new ModelRendererTurbo(this, 115, 281, textureX, textureY); // Right seat part
		bodyModel[576] = new ModelRendererTurbo(this, 117, 274, textureX, textureY); // Right seat part
		bodyModel[577] = new ModelRendererTurbo(this, 124, 274, textureX, textureY); // Right seat part
		bodyModel[578] = new ModelRendererTurbo(this, 110, 315, textureX, textureY); // Left seat part
		bodyModel[579] = new ModelRendererTurbo(this, 115, 322, textureX, textureY); // Left seat part
		bodyModel[580] = new ModelRendererTurbo(this, 117, 315, textureX, textureY); // Left seat part
		bodyModel[581] = new ModelRendererTurbo(this, 124, 315, textureX, textureY); // Left seat part
		bodyModel[582] = new ModelRendererTurbo(this, 110, 304, textureX, textureY); // Left seat part
		bodyModel[583] = new ModelRendererTurbo(this, 115, 311, textureX, textureY); // Left seat part
		bodyModel[584] = new ModelRendererTurbo(this, 117, 304, textureX, textureY); // Left seat part
		bodyModel[585] = new ModelRendererTurbo(this, 124, 304, textureX, textureY); // Left seat part
		bodyModel[586] = new ModelRendererTurbo(this, 278, 288, textureX, textureY); // Right seat part
		bodyModel[587] = new ModelRendererTurbo(this, 278, 277, textureX, textureY); // Right seat part
		bodyModel[588] = new ModelRendererTurbo(this, 278, 318, textureX, textureY); // Left seat part
		bodyModel[589] = new ModelRendererTurbo(this, 278, 307, textureX, textureY); // Left seat part
		bodyModel[590] = new ModelRendererTurbo(this, 247, 288, textureX, textureY); // Right seat part
		bodyModel[591] = new ModelRendererTurbo(this, 247, 277, textureX, textureY); // Right seat part
		bodyModel[592] = new ModelRendererTurbo(this, 247, 318, textureX, textureY); // Left seat part
		bodyModel[593] = new ModelRendererTurbo(this, 247, 307, textureX, textureY); // Left seat part
		bodyModel[594] = new ModelRendererTurbo(this, 216, 288, textureX, textureY); // Right seat part
		bodyModel[595] = new ModelRendererTurbo(this, 216, 277, textureX, textureY); // Right seat part
		bodyModel[596] = new ModelRendererTurbo(this, 216, 318, textureX, textureY); // Left seat part
		bodyModel[597] = new ModelRendererTurbo(this, 216, 307, textureX, textureY); // Left seat part
		bodyModel[598] = new ModelRendererTurbo(this, 185, 288, textureX, textureY); // Right seat part
		bodyModel[599] = new ModelRendererTurbo(this, 185, 277, textureX, textureY); // Right seat part
		bodyModel[600] = new ModelRendererTurbo(this, 185, 318, textureX, textureY); // Left seat part
		bodyModel[601] = new ModelRendererTurbo(this, 185, 307, textureX, textureY); // Left seat part
		bodyModel[602] = new ModelRendererTurbo(this, 154, 288, textureX, textureY); // Right seat part
		bodyModel[603] = new ModelRendererTurbo(this, 154, 277, textureX, textureY); // Right seat part
		bodyModel[604] = new ModelRendererTurbo(this, 154, 318, textureX, textureY); // Left seat part
		bodyModel[605] = new ModelRendererTurbo(this, 154, 307, textureX, textureY); // Left seat part
		bodyModel[606] = new ModelRendererTurbo(this, 123, 288, textureX, textureY); // Right seat part
		bodyModel[607] = new ModelRendererTurbo(this, 123, 277, textureX, textureY); // Right seat part
		bodyModel[608] = new ModelRendererTurbo(this, 123, 318, textureX, textureY); // Left seat part
		bodyModel[609] = new ModelRendererTurbo(this, 123, 307, textureX, textureY); // Left seat part
		bodyModel[610] = new ModelRendererTurbo(this, 33, 385, textureX, textureY); // Right seat part
		bodyModel[611] = new ModelRendererTurbo(this, 33, 415, textureX, textureY); // Left seat part
		bodyModel[612] = new ModelRendererTurbo(this, 40, 397, textureX, textureY); // Right seat part
		bodyModel[613] = new ModelRendererTurbo(this, 45, 404, textureX, textureY); // Right seat part
		bodyModel[614] = new ModelRendererTurbo(this, 47, 397, textureX, textureY); // Right seat part
		bodyModel[615] = new ModelRendererTurbo(this, 54, 397, textureX, textureY); // Right seat part
		bodyModel[616] = new ModelRendererTurbo(this, 40, 386, textureX, textureY); // Right seat part
		bodyModel[617] = new ModelRendererTurbo(this, 45, 393, textureX, textureY); // Right seat part
		bodyModel[618] = new ModelRendererTurbo(this, 47, 386, textureX, textureY); // Right seat part
		bodyModel[619] = new ModelRendererTurbo(this, 54, 386, textureX, textureY); // Right seat part
		bodyModel[620] = new ModelRendererTurbo(this, 40, 427, textureX, textureY); // Left seat part
		bodyModel[621] = new ModelRendererTurbo(this, 45, 434, textureX, textureY); // Left seat part
		bodyModel[622] = new ModelRendererTurbo(this, 47, 427, textureX, textureY); // Left seat part
		bodyModel[623] = new ModelRendererTurbo(this, 54, 427, textureX, textureY); // Left seat part
		bodyModel[624] = new ModelRendererTurbo(this, 40, 416, textureX, textureY); // Left seat part
		bodyModel[625] = new ModelRendererTurbo(this, 45, 423, textureX, textureY); // Left seat part
		bodyModel[626] = new ModelRendererTurbo(this, 47, 416, textureX, textureY); // Left seat part
		bodyModel[627] = new ModelRendererTurbo(this, 54, 416, textureX, textureY); // Left seat part
		bodyModel[628] = new ModelRendererTurbo(this, 53, 400, textureX, textureY); // Right seat part
		bodyModel[629] = new ModelRendererTurbo(this, 53, 389, textureX, textureY); // Right seat part
		bodyModel[630] = new ModelRendererTurbo(this, 53, 430, textureX, textureY); // Left seat part
		bodyModel[631] = new ModelRendererTurbo(this, 53, 419, textureX, textureY); // Left seat part
		bodyModel[632] = new ModelRendererTurbo(this, 269, 288, textureX, textureY); // Right seat part
		bodyModel[633] = new ModelRendererTurbo(this, 269, 277, textureX, textureY); // Right seat part
		bodyModel[634] = new ModelRendererTurbo(this, 269, 318, textureX, textureY); // Left seat part
		bodyModel[635] = new ModelRendererTurbo(this, 269, 307, textureX, textureY); // Left seat part
		bodyModel[636] = new ModelRendererTurbo(this, 238, 288, textureX, textureY); // Right seat part
		bodyModel[637] = new ModelRendererTurbo(this, 238, 277, textureX, textureY); // Right seat part
		bodyModel[638] = new ModelRendererTurbo(this, 238, 318, textureX, textureY); // Left seat part
		bodyModel[639] = new ModelRendererTurbo(this, 238, 307, textureX, textureY); // Left seat part
		bodyModel[640] = new ModelRendererTurbo(this, 207, 288, textureX, textureY); // Right seat part
		bodyModel[641] = new ModelRendererTurbo(this, 207, 277, textureX, textureY); // Right seat part
		bodyModel[642] = new ModelRendererTurbo(this, 207, 318, textureX, textureY); // Left seat part
		bodyModel[643] = new ModelRendererTurbo(this, 207, 307, textureX, textureY); // Left seat part
		bodyModel[644] = new ModelRendererTurbo(this, 176, 288, textureX, textureY); // Right seat part
		bodyModel[645] = new ModelRendererTurbo(this, 176, 277, textureX, textureY); // Right seat part
		bodyModel[646] = new ModelRendererTurbo(this, 176, 318, textureX, textureY); // Left seat part
		bodyModel[647] = new ModelRendererTurbo(this, 176, 307, textureX, textureY); // Left seat part
		bodyModel[648] = new ModelRendererTurbo(this, 145, 288, textureX, textureY); // Right seat part
		bodyModel[649] = new ModelRendererTurbo(this, 145, 277, textureX, textureY); // Right seat part
		bodyModel[650] = new ModelRendererTurbo(this, 145, 318, textureX, textureY); // Left seat part
		bodyModel[651] = new ModelRendererTurbo(this, 145, 307, textureX, textureY); // Left seat part
		bodyModel[652] = new ModelRendererTurbo(this, 114, 288, textureX, textureY); // Right seat part
		bodyModel[653] = new ModelRendererTurbo(this, 114, 277, textureX, textureY); // Right seat part
		bodyModel[654] = new ModelRendererTurbo(this, 114, 318, textureX, textureY); // Left seat part
		bodyModel[655] = new ModelRendererTurbo(this, 114, 307, textureX, textureY); // Left seat part
		bodyModel[656] = new ModelRendererTurbo(this, 44, 400, textureX, textureY); // Right seat part
		bodyModel[657] = new ModelRendererTurbo(this, 44, 389, textureX, textureY); // Right seat part
		bodyModel[658] = new ModelRendererTurbo(this, 44, 430, textureX, textureY); // Left seat part
		bodyModel[659] = new ModelRendererTurbo(this, 44, 419, textureX, textureY); // Left seat part
		bodyModel[660] = new ModelRendererTurbo(this, 82, 194, textureX, textureY); // Box 2
		bodyModel[661] = new ModelRendererTurbo(this, 229, 336, textureX, textureY); // Box 194
		bodyModel[662] = new ModelRendererTurbo(this, 229, 353, textureX, textureY); // Box 128
		bodyModel[663] = new ModelRendererTurbo(this, 231, 332, textureX, textureY); // Box 193
		bodyModel[664] = new ModelRendererTurbo(this, 233, 339, textureX, textureY); // Box 192
		bodyModel[665] = new ModelRendererTurbo(this, 231, 356, textureX, textureY); // Box 128
		bodyModel[666] = new ModelRendererTurbo(this, 233, 348, textureX, textureY); // Box 128
		bodyModel[667] = new ModelRendererTurbo(this, 102, 362, textureX, textureY); // Box 128
		bodyModel[668] = new ModelRendererTurbo(this, 102, 360, textureX, textureY); // Box 669
		bodyModel[669] = new ModelRendererTurbo(this, 53, 366, textureX, textureY); // Box 128
		bodyModel[670] = new ModelRendererTurbo(this, 53, 364, textureX, textureY); // Box 671

		bodyModel[500].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[500].setRotationPoint(19F, -4F, 7F);
		bodyModel[500].rotateAngleY = -3.14159265F;

		bodyModel[501].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[501].setRotationPoint(8F, -5F, 7F);
		bodyModel[501].rotateAngleY = -3.14159265F;

		bodyModel[502].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[502].setRotationPoint(8F, -5F, 7F);
		bodyModel[502].rotateAngleY = -3.14159265F;

		bodyModel[503].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[503].setRotationPoint(8F, -4F, 7F);
		bodyModel[503].rotateAngleY = -3.14159265F;

		bodyModel[504].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[504].setRotationPoint(8F, -5F, 7F);
		bodyModel[504].rotateAngleY = -3.14159265F;

		bodyModel[505].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[505].setRotationPoint(8F, -5F, 7F);
		bodyModel[505].rotateAngleY = -3.14159265F;

		bodyModel[506].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[506].setRotationPoint(8F, -4F, 7F);
		bodyModel[506].rotateAngleY = -3.14159265F;

		bodyModel[507].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[507].setRotationPoint(19F, -5F, -7F);
		bodyModel[507].rotateAngleY = -3.14159265F;

		bodyModel[508].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[508].setRotationPoint(19F, -5F, -7F);
		bodyModel[508].rotateAngleY = -3.14159265F;

		bodyModel[509].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[509].setRotationPoint(19F, -4F, -7F);
		bodyModel[509].rotateAngleY = -3.14159265F;

		bodyModel[510].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[510].setRotationPoint(19F, -5F, -7F);
		bodyModel[510].rotateAngleY = -3.14159265F;

		bodyModel[511].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[511].setRotationPoint(19F, -5F, -7F);
		bodyModel[511].rotateAngleY = -3.14159265F;

		bodyModel[512].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[512].setRotationPoint(19F, -4F, -7F);
		bodyModel[512].rotateAngleY = -3.14159265F;

		bodyModel[513].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[513].setRotationPoint(8F, -5F, -7F);
		bodyModel[513].rotateAngleY = -3.14159265F;

		bodyModel[514].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[514].setRotationPoint(8F, -5F, -7F);
		bodyModel[514].rotateAngleY = -3.14159265F;

		bodyModel[515].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[515].setRotationPoint(8F, -4F, -7F);
		bodyModel[515].rotateAngleY = -3.14159265F;

		bodyModel[516].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[516].setRotationPoint(8F, -5F, -7F);
		bodyModel[516].rotateAngleY = -3.14159265F;

		bodyModel[517].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[517].setRotationPoint(8F, -5F, -7F);
		bodyModel[517].rotateAngleY = -3.14159265F;

		bodyModel[518].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[518].setRotationPoint(8F, -4F, -7F);
		bodyModel[518].rotateAngleY = -3.14159265F;

		bodyModel[519].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[519].setRotationPoint(-3F, -4F, -7F);
		bodyModel[519].rotateAngleY = -3.14159265F;

		bodyModel[520].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[520].setRotationPoint(-3F, -3F, 7F);
		bodyModel[520].rotateAngleY = -3.14159265F;

		bodyModel[521].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[521].setRotationPoint(-3F, -3F, 7F);
		bodyModel[521].rotateAngleY = -3.14159265F;

		bodyModel[522].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[522].setRotationPoint(-3F, -3F, -7F);
		bodyModel[522].rotateAngleY = -3.14159265F;

		bodyModel[523].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[523].setRotationPoint(-3F, -3F, -7F);
		bodyModel[523].rotateAngleY = -3.14159265F;

		bodyModel[524].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[524].setRotationPoint(19F, -3F, 7F);
		bodyModel[524].rotateAngleY = -3.14159265F;

		bodyModel[525].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[525].setRotationPoint(19F, -3F, 7F);
		bodyModel[525].rotateAngleY = -3.14159265F;

		bodyModel[526].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[526].setRotationPoint(8F, -3F, 7F);
		bodyModel[526].rotateAngleY = -3.14159265F;

		bodyModel[527].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[527].setRotationPoint(8F, -3F, 7F);
		bodyModel[527].rotateAngleY = -3.14159265F;

		bodyModel[528].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[528].setRotationPoint(19F, -3F, -7F);
		bodyModel[528].rotateAngleY = -3.14159265F;

		bodyModel[529].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[529].setRotationPoint(19F, -3F, -7F);
		bodyModel[529].rotateAngleY = -3.14159265F;

		bodyModel[530].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[530].setRotationPoint(8F, -3F, -7F);
		bodyModel[530].rotateAngleY = -3.14159265F;

		bodyModel[531].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[531].setRotationPoint(8F, -3F, -7F);
		bodyModel[531].rotateAngleY = -3.14159265F;

		bodyModel[532].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[532].setRotationPoint(-14F, -8F, -7F);
		bodyModel[532].rotateAngleY = -3.14159265F;

		bodyModel[533].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[533].setRotationPoint(-14F, -5F, 7F);
		bodyModel[533].rotateAngleY = -3.14159265F;

		bodyModel[534].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[534].setRotationPoint(-14F, -3F, 7F);
		bodyModel[534].rotateAngleY = -3.14159265F;

		bodyModel[535].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[535].setRotationPoint(-14F, -5F, 7F);
		bodyModel[535].rotateAngleY = -3.14159265F;

		bodyModel[536].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[536].setRotationPoint(-14F, -4F, 7F);
		bodyModel[536].rotateAngleY = -3.14159265F;

		bodyModel[537].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[537].setRotationPoint(-14F, -5F, 7F);
		bodyModel[537].rotateAngleY = -3.14159265F;

		bodyModel[538].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[538].setRotationPoint(-14F, -3F, 7F);
		bodyModel[538].rotateAngleY = -3.14159265F;

		bodyModel[539].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[539].setRotationPoint(-14F, -5F, 7F);
		bodyModel[539].rotateAngleY = -3.14159265F;

		bodyModel[540].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[540].setRotationPoint(-14F, -4F, 7F);
		bodyModel[540].rotateAngleY = -3.14159265F;

		bodyModel[541].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[541].setRotationPoint(-14F, -5F, -7F);
		bodyModel[541].rotateAngleY = -3.14159265F;

		bodyModel[542].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[542].setRotationPoint(-14F, -3F, -7F);
		bodyModel[542].rotateAngleY = -3.14159265F;

		bodyModel[543].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[543].setRotationPoint(-14F, -5F, -7F);
		bodyModel[543].rotateAngleY = -3.14159265F;

		bodyModel[544].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[544].setRotationPoint(-14F, -4F, -7F);
		bodyModel[544].rotateAngleY = -3.14159265F;

		bodyModel[545].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[545].setRotationPoint(-14F, -5F, -7F);
		bodyModel[545].rotateAngleY = -3.14159265F;

		bodyModel[546].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[546].setRotationPoint(-14F, -3F, -7F);
		bodyModel[546].rotateAngleY = -3.14159265F;

		bodyModel[547].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[547].setRotationPoint(-14F, -5F, -7F);
		bodyModel[547].rotateAngleY = -3.14159265F;

		bodyModel[548].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[548].setRotationPoint(-14F, -4F, -7F);
		bodyModel[548].rotateAngleY = -3.14159265F;

		bodyModel[549].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[549].setRotationPoint(-14F, -8F, 7F);
		bodyModel[549].rotateAngleY = -3.14159265F;

		bodyModel[550].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[550].setRotationPoint(-25F, -8F, 7F);
		bodyModel[550].rotateAngleY = -3.14159265F;

		bodyModel[551].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[551].setRotationPoint(-25F, -8F, -7F);
		bodyModel[551].rotateAngleY = -3.14159265F;

		bodyModel[552].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[552].setRotationPoint(-25F, -5F, 7F);
		bodyModel[552].rotateAngleY = -3.14159265F;

		bodyModel[553].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[553].setRotationPoint(-25F, -3F, 7F);
		bodyModel[553].rotateAngleY = -3.14159265F;

		bodyModel[554].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[554].setRotationPoint(-25F, -5F, 7F);
		bodyModel[554].rotateAngleY = -3.14159265F;

		bodyModel[555].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[555].setRotationPoint(-25F, -4F, 7F);
		bodyModel[555].rotateAngleY = -3.14159265F;

		bodyModel[556].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[556].setRotationPoint(-25F, -5F, 7F);
		bodyModel[556].rotateAngleY = -3.14159265F;

		bodyModel[557].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[557].setRotationPoint(-25F, -3F, 7F);
		bodyModel[557].rotateAngleY = -3.14159265F;

		bodyModel[558].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[558].setRotationPoint(-25F, -5F, 7F);
		bodyModel[558].rotateAngleY = -3.14159265F;

		bodyModel[559].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[559].setRotationPoint(-25F, -4F, 7F);
		bodyModel[559].rotateAngleY = -3.14159265F;

		bodyModel[560].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[560].setRotationPoint(-25F, -5F, -7F);
		bodyModel[560].rotateAngleY = -3.14159265F;

		bodyModel[561].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[561].setRotationPoint(-25F, -3F, -7F);
		bodyModel[561].rotateAngleY = -3.14159265F;

		bodyModel[562].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[562].setRotationPoint(-25F, -5F, -7F);
		bodyModel[562].rotateAngleY = -3.14159265F;

		bodyModel[563].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[563].setRotationPoint(-25F, -4F, -7F);
		bodyModel[563].rotateAngleY = -3.14159265F;

		bodyModel[564].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[564].setRotationPoint(-25F, -5F, -7F);
		bodyModel[564].rotateAngleY = -3.14159265F;

		bodyModel[565].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[565].setRotationPoint(-25F, -3F, -7F);
		bodyModel[565].rotateAngleY = -3.14159265F;

		bodyModel[566].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[566].setRotationPoint(-25F, -5F, -7F);
		bodyModel[566].rotateAngleY = -3.14159265F;

		bodyModel[567].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[567].setRotationPoint(-25F, -4F, -7F);
		bodyModel[567].rotateAngleY = -3.14159265F;

		bodyModel[568].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[568].setRotationPoint(-36F, -8F, 7F);
		bodyModel[568].rotateAngleY = -3.14159265F;

		bodyModel[569].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[569].setRotationPoint(-36F, -8F, -7F);
		bodyModel[569].rotateAngleY = -3.14159265F;

		bodyModel[570].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[570].setRotationPoint(-36F, -5F, 7F);
		bodyModel[570].rotateAngleY = -3.14159265F;

		bodyModel[571].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[571].setRotationPoint(-36F, -3F, 7F);
		bodyModel[571].rotateAngleY = -3.14159265F;

		bodyModel[572].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[572].setRotationPoint(-36F, -5F, 7F);
		bodyModel[572].rotateAngleY = -3.14159265F;

		bodyModel[573].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[573].setRotationPoint(-36F, -4F, 7F);
		bodyModel[573].rotateAngleY = -3.14159265F;

		bodyModel[574].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[574].setRotationPoint(-36F, -5F, 7F);
		bodyModel[574].rotateAngleY = -3.14159265F;

		bodyModel[575].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[575].setRotationPoint(-36F, -3F, 7F);
		bodyModel[575].rotateAngleY = -3.14159265F;

		bodyModel[576].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[576].setRotationPoint(-36F, -5F, 7F);
		bodyModel[576].rotateAngleY = -3.14159265F;

		bodyModel[577].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[577].setRotationPoint(-36F, -4F, 7F);
		bodyModel[577].rotateAngleY = -3.14159265F;

		bodyModel[578].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[578].setRotationPoint(-36F, -5F, -7F);
		bodyModel[578].rotateAngleY = -3.14159265F;

		bodyModel[579].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[579].setRotationPoint(-36F, -3F, -7F);
		bodyModel[579].rotateAngleY = -3.14159265F;

		bodyModel[580].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[580].setRotationPoint(-36F, -5F, -7F);
		bodyModel[580].rotateAngleY = -3.14159265F;

		bodyModel[581].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[581].setRotationPoint(-36F, -4F, -7F);
		bodyModel[581].rotateAngleY = -3.14159265F;

		bodyModel[582].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[582].setRotationPoint(-36F, -5F, -7F);
		bodyModel[582].rotateAngleY = -3.14159265F;

		bodyModel[583].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[583].setRotationPoint(-36F, -3F, -7F);
		bodyModel[583].rotateAngleY = -3.14159265F;

		bodyModel[584].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[584].setRotationPoint(-36F, -5F, -7F);
		bodyModel[584].rotateAngleY = -3.14159265F;

		bodyModel[585].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[585].setRotationPoint(-36F, -4F, -7F);
		bodyModel[585].rotateAngleY = -3.14159265F;

		bodyModel[586].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[586].setRotationPoint(19F, -4.5F, 7F);
		bodyModel[586].rotateAngleY = -3.14159265F;

		bodyModel[587].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[587].setRotationPoint(19F, -4.5F, 7F);
		bodyModel[587].rotateAngleY = -3.14159265F;

		bodyModel[588].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[588].setRotationPoint(19F, -4.5F, -7F);
		bodyModel[588].rotateAngleY = -3.14159265F;

		bodyModel[589].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[589].setRotationPoint(19F, -4.5F, -7F);
		bodyModel[589].rotateAngleY = -3.14159265F;

		bodyModel[590].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[590].setRotationPoint(8F, -4.5F, 7F);
		bodyModel[590].rotateAngleY = -3.14159265F;

		bodyModel[591].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[591].setRotationPoint(8F, -4.5F, 7F);
		bodyModel[591].rotateAngleY = -3.14159265F;

		bodyModel[592].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[592].setRotationPoint(8F, -4.5F, -7F);
		bodyModel[592].rotateAngleY = -3.14159265F;

		bodyModel[593].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[593].setRotationPoint(8F, -4.5F, -7F);
		bodyModel[593].rotateAngleY = -3.14159265F;

		bodyModel[594].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[594].setRotationPoint(-3F, -4.5F, 7F);
		bodyModel[594].rotateAngleY = -3.14159265F;

		bodyModel[595].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[595].setRotationPoint(-3F, -4.5F, 7F);
		bodyModel[595].rotateAngleY = -3.14159265F;

		bodyModel[596].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[596].setRotationPoint(-3F, -4.5F, -7F);
		bodyModel[596].rotateAngleY = -3.14159265F;

		bodyModel[597].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[597].setRotationPoint(-3F, -4.5F, -7F);
		bodyModel[597].rotateAngleY = -3.14159265F;

		bodyModel[598].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[598].setRotationPoint(-14F, -4.5F, 7F);
		bodyModel[598].rotateAngleY = -3.14159265F;

		bodyModel[599].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[599].setRotationPoint(-14F, -4.5F, 7F);
		bodyModel[599].rotateAngleY = -3.14159265F;

		bodyModel[600].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[600].setRotationPoint(-14F, -4.5F, -7F);
		bodyModel[600].rotateAngleY = -3.14159265F;

		bodyModel[601].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[601].setRotationPoint(-14F, -4.5F, -7F);
		bodyModel[601].rotateAngleY = -3.14159265F;

		bodyModel[602].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[602].setRotationPoint(-25F, -4.5F, 7F);
		bodyModel[602].rotateAngleY = -3.14159265F;

		bodyModel[603].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[603].setRotationPoint(-25F, -4.5F, 7F);
		bodyModel[603].rotateAngleY = -3.14159265F;

		bodyModel[604].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[604].setRotationPoint(-25F, -4.5F, -7F);
		bodyModel[604].rotateAngleY = -3.14159265F;

		bodyModel[605].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[605].setRotationPoint(-25F, -4.5F, -7F);
		bodyModel[605].rotateAngleY = -3.14159265F;

		bodyModel[606].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[606].setRotationPoint(-36F, -4.5F, 7F);
		bodyModel[606].rotateAngleY = -3.14159265F;

		bodyModel[607].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[607].setRotationPoint(-36F, -4.5F, 7F);
		bodyModel[607].rotateAngleY = -3.14159265F;

		bodyModel[608].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[608].setRotationPoint(-36F, -4.5F, -7F);
		bodyModel[608].rotateAngleY = -3.14159265F;

		bodyModel[609].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[609].setRotationPoint(-36F, -4.5F, -7F);
		bodyModel[609].rotateAngleY = -3.14159265F;

		bodyModel[610].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[610].setRotationPoint(-52F, -8F, 7F);
		bodyModel[610].rotateAngleY = -3.14159265F;

		bodyModel[611].addShapeBox(-2.5F, 0F, -2F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[611].setRotationPoint(-52F, -8F, -7F);
		bodyModel[611].rotateAngleY = -3.14159265F;

		bodyModel[612].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[612].setRotationPoint(-52F, -5F, 7F);
		bodyModel[612].rotateAngleY = -3.14159265F;

		bodyModel[613].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Right seat part
		bodyModel[613].setRotationPoint(-52F, -3F, 7F);
		bodyModel[613].rotateAngleY = -3.14159265F;

		bodyModel[614].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[614].setRotationPoint(-52F, -5F, 7F);
		bodyModel[614].rotateAngleY = -3.14159265F;

		bodyModel[615].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[615].setRotationPoint(-52F, -4F, 7F);
		bodyModel[615].rotateAngleY = -3.14159265F;

		bodyModel[616].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Right seat part
		bodyModel[616].setRotationPoint(-52F, -5F, 7F);
		bodyModel[616].rotateAngleY = -3.14159265F;

		bodyModel[617].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Right seat part
		bodyModel[617].setRotationPoint(-52F, -3F, 7F);
		bodyModel[617].rotateAngleY = -3.14159265F;

		bodyModel[618].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Right seat part
		bodyModel[618].setRotationPoint(-52F, -5F, 7F);
		bodyModel[618].rotateAngleY = -3.14159265F;

		bodyModel[619].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Right seat part
		bodyModel[619].setRotationPoint(-52F, -4F, 7F);
		bodyModel[619].rotateAngleY = -3.14159265F;

		bodyModel[620].addShapeBox(0F, 0F, 2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[620].setRotationPoint(-52F, -5F, -7F);
		bodyModel[620].rotateAngleY = -3.14159265F;

		bodyModel[621].addBox(-2.5F, 0F, 2F, 5, 2, 1, 0F); // Left seat part
		bodyModel[621].setRotationPoint(-52F, -3F, -7F);
		bodyModel[621].rotateAngleY = -3.14159265F;

		bodyModel[622].addShapeBox(-2F, 0F, 2F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[622].setRotationPoint(-52F, -5F, -7F);
		bodyModel[622].rotateAngleY = -3.14159265F;

		bodyModel[623].addShapeBox(-2.5F, 0F, 2F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[623].setRotationPoint(-52F, -4F, -7F);
		bodyModel[623].rotateAngleY = -3.14159265F;

		bodyModel[624].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Left seat part
		bodyModel[624].setRotationPoint(-52F, -5F, -7F);
		bodyModel[624].rotateAngleY = -3.14159265F;

		bodyModel[625].addBox(-2.5F, 0F, -3F, 5, 2, 1, 0F); // Left seat part
		bodyModel[625].setRotationPoint(-52F, -3F, -7F);
		bodyModel[625].rotateAngleY = -3.14159265F;

		bodyModel[626].addShapeBox(-2F, 0F, -3F, 2, 1, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F); // Left seat part
		bodyModel[626].setRotationPoint(-52F, -5F, -7F);
		bodyModel[626].rotateAngleY = -3.14159265F;

		bodyModel[627].addShapeBox(-2.5F, 0F, -3F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Left seat part
		bodyModel[627].setRotationPoint(-52F, -4F, -7F);
		bodyModel[627].rotateAngleY = -3.14159265F;

		bodyModel[628].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[628].setRotationPoint(-52F, -4.5F, 7F);
		bodyModel[628].rotateAngleY = -3.14159265F;

		bodyModel[629].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[629].setRotationPoint(-52F, -4.5F, 7F);
		bodyModel[629].rotateAngleY = -3.14159265F;

		bodyModel[630].addShapeBox(-2F, 0F, 2F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[630].setRotationPoint(-52F, -4.5F, -7F);
		bodyModel[630].rotateAngleY = -3.14159265F;

		bodyModel[631].addShapeBox(-2F, 0F, -3F, 2, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[631].setRotationPoint(-52F, -4.5F, -7F);
		bodyModel[631].rotateAngleY = -3.14159265F;

		bodyModel[632].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[632].setRotationPoint(19F, -4.5F, 7F);
		bodyModel[632].rotateAngleY = -3.14159265F;

		bodyModel[633].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[633].setRotationPoint(19F, -4.5F, 7F);
		bodyModel[633].rotateAngleY = -3.14159265F;

		bodyModel[634].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[634].setRotationPoint(19F, -4.5F, -7F);
		bodyModel[634].rotateAngleY = -3.14159265F;

		bodyModel[635].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[635].setRotationPoint(19F, -4.5F, -7F);
		bodyModel[635].rotateAngleY = -3.14159265F;

		bodyModel[636].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[636].setRotationPoint(8F, -4.5F, 7F);
		bodyModel[636].rotateAngleY = -3.14159265F;

		bodyModel[637].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[637].setRotationPoint(8F, -4.5F, 7F);
		bodyModel[637].rotateAngleY = -3.14159265F;

		bodyModel[638].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[638].setRotationPoint(8F, -4.5F, -7F);
		bodyModel[638].rotateAngleY = -3.14159265F;

		bodyModel[639].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[639].setRotationPoint(8F, -4.5F, -7F);
		bodyModel[639].rotateAngleY = -3.14159265F;

		bodyModel[640].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[640].setRotationPoint(-3F, -4.5F, 7F);
		bodyModel[640].rotateAngleY = -3.14159265F;

		bodyModel[641].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[641].setRotationPoint(-3F, -4.5F, 7F);
		bodyModel[641].rotateAngleY = -3.14159265F;

		bodyModel[642].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[642].setRotationPoint(-3F, -4.5F, -7F);
		bodyModel[642].rotateAngleY = -3.14159265F;

		bodyModel[643].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[643].setRotationPoint(-3F, -4.5F, -7F);
		bodyModel[643].rotateAngleY = -3.14159265F;

		bodyModel[644].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[644].setRotationPoint(-14F, -4.5F, 7F);
		bodyModel[644].rotateAngleY = -3.14159265F;

		bodyModel[645].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[645].setRotationPoint(-14F, -4.5F, 7F);
		bodyModel[645].rotateAngleY = -3.14159265F;

		bodyModel[646].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[646].setRotationPoint(-14F, -4.5F, -7F);
		bodyModel[646].rotateAngleY = -3.14159265F;

		bodyModel[647].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[647].setRotationPoint(-14F, -4.5F, -7F);
		bodyModel[647].rotateAngleY = -3.14159265F;

		bodyModel[648].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[648].setRotationPoint(-25F, -4.5F, 7F);
		bodyModel[648].rotateAngleY = -3.14159265F;

		bodyModel[649].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[649].setRotationPoint(-25F, -4.5F, 7F);
		bodyModel[649].rotateAngleY = -3.14159265F;

		bodyModel[650].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[650].setRotationPoint(-25F, -4.5F, -7F);
		bodyModel[650].rotateAngleY = -3.14159265F;

		bodyModel[651].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[651].setRotationPoint(-25F, -4.5F, -7F);
		bodyModel[651].rotateAngleY = -3.14159265F;

		bodyModel[652].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[652].setRotationPoint(-36F, -4.5F, 7F);
		bodyModel[652].rotateAngleY = -3.14159265F;

		bodyModel[653].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[653].setRotationPoint(-36F, -4.5F, 7F);
		bodyModel[653].rotateAngleY = -3.14159265F;

		bodyModel[654].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[654].setRotationPoint(-36F, -4.5F, -7F);
		bodyModel[654].rotateAngleY = -3.14159265F;

		bodyModel[655].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[655].setRotationPoint(-36F, -4.5F, -7F);
		bodyModel[655].rotateAngleY = -3.14159265F;

		bodyModel[656].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[656].setRotationPoint(-52F, -4.5F, 7F);
		bodyModel[656].rotateAngleY = -3.14159265F;

		bodyModel[657].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Right seat part
		bodyModel[657].setRotationPoint(-52F, -4.5F, 7F);
		bodyModel[657].rotateAngleY = -3.14159265F;

		bodyModel[658].addShapeBox(-0.5F, 0F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[658].setRotationPoint(-52F, -4.5F, -7F);
		bodyModel[658].rotateAngleY = -3.14159265F;

		bodyModel[659].addShapeBox(-0.5F, 0F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Left seat part
		bodyModel[659].setRotationPoint(-52F, -4.5F, -7F);
		bodyModel[659].rotateAngleY = -3.14159265F;

		bodyModel[660].addBox(0F, 0F, 0F, 116, 0, 1, 0F); // Box 2
		bodyModel[660].setRotationPoint(-60.5F, 0.99F, -0.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[661].setRotationPoint(35.5F, -18F, 6.25F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.725F, 0F, 0F, -0.725F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 128
		bodyModel[662].setRotationPoint(35.5F, -18F, -7.25F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[663].setRotationPoint(35.5F, -16F, 7F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 192
		bodyModel[664].setRotationPoint(35.5F, -17F, 4.25F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.275F, -0.25F, 0F, 1.275F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 128
		bodyModel[665].setRotationPoint(35.5F, -16F, -9F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Box 128
		bodyModel[666].setRotationPoint(35.5F, -17F, -7.25F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 49, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.19F, 0F, 0F, -0.19F, 0F, 0F, 0.19F, 0F, 0F, 0.19F); // Box 128
		bodyModel[667].setRotationPoint(-22F, -13.5F, 10.29F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 49, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0F, 0F, -0.19F, 0F, 0F, -0.19F); // Box 669
		bodyModel[668].setRotationPoint(-22F, -13.5F, -10.29F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 98, 1, 0, 0F,0F, 0F, -0.03F, 0F, 0F, -0.03F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[669].setRotationPoint(-49F, -2.5F, 10.9F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 98, 1, 0, 0F,0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, -0.03F, 0F, 0F, -0.03F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		bodyModel[670].setRotationPoint(-49F, -2.5F, -10.9F);
	}
	ModelPRECO_Truck bogie1 = new ModelPRECO_Truck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 671; i++)
		{
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
		if(GetColor(entity)==14 || GetColor(entity)==2 || GetColor(entity)==1){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/PRECO_truck_black.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/PRECO_truck_silver.png"));
			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(2.75, -0.03, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);//rear truck

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(5.5, 0, 0);
			bogie1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}