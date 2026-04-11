//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2023 - 11:16:57
// Last changed on: 26.06.2023 - 11:16:57

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelAndrews_Truck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class Modelgatc10000 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Modelgatc10000() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[118];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 374, 73, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 381, 60, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 258, 60, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 381, 92, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 258, 92, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 384, 51, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 267, 51, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 384, 104, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 267, 104, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 227, 73, textureX, textureY); // Box 162
		bodyModel[10] = new ModelRendererTurbo(this, 211, 72, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 242, 72, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 209, 60, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 240, 60, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 219, 58, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 236, 58, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 222, 90, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 240, 82, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 209, 82, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 227, 73, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 236, 58, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 240, 60, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 242, 72, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 240, 82, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 233, 90, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 222, 90, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 209, 82, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 211, 72, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 209, 60, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 219, 58, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 98, 50, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 98, 50, textureX, textureY); // Box 28
		bodyModel[33] = new ModelRendererTurbo(this, 37, 14, textureX, textureY); // Box 254
		bodyModel[34] = new ModelRendererTurbo(this, 15, 2, textureX, textureY); // Box 1 coupler
		bodyModel[35] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 1 coupler
		bodyModel[36] = new ModelRendererTurbo(this, 393, 16, textureX, textureY); // Box 248
		bodyModel[37] = new ModelRendererTurbo(this, 412, 18, textureX, textureY); // Box 249
		bodyModel[38] = new ModelRendererTurbo(this, 389, 22, textureX, textureY); // Box 250
		bodyModel[39] = new ModelRendererTurbo(this, 376, 26, textureX, textureY); // Box 251
		bodyModel[40] = new ModelRendererTurbo(this, 374, 18, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 414, 26, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 395, 11, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 408, 11, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 413, 11, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 49, 37, textureX, textureY); // Box 236
		bodyModel[46] = new ModelRendererTurbo(this, 49, 35, textureX, textureY); // Box 247
		bodyModel[47] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "cull"); // Box 59 cull platform
		bodyModel[48] = new ModelRendererTurbo(this, 61, 40, textureX, textureY, "cull"); // Box 60 cull
		bodyModel[49] = new ModelRendererTurbo(this, 38, 40, textureX, textureY, "cull"); // Box 62 cull
		bodyModel[50] = new ModelRendererTurbo(this, 87, 1, textureX, textureY); // Box 506
		bodyModel[51] = new ModelRendererTurbo(this, 53, 54, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 34, 54, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 85, 55, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 57, 60, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 85, 50, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 57, 45, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 106, 40, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 95, 40, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 84, 40, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 117, 40, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 38, 60, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 72, 50, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 72, 55, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 38, 45, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 107, 2, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 104, 2, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 101, 2, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 170, 19, textureX, textureY); // Box 390
		bodyModel[71] = new ModelRendererTurbo(this, 278, 7, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 170, 17, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 275, 7, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 146, 41, textureX, textureY); // Box 342
		bodyModel[75] = new ModelRendererTurbo(this, 128, 41, textureX, textureY); // Box 351
		bodyModel[76] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 94
		bodyModel[77] = new ModelRendererTurbo(this, 155, 41, textureX, textureY); // Box 95
		bodyModel[78] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 344
		bodyModel[79] = new ModelRendererTurbo(this, 78, 1, textureX, textureY); // Box 99
		bodyModel[80] = new ModelRendererTurbo(this, 24, 120, textureX, textureY); // Box 100
		bodyModel[81] = new ModelRendererTurbo(this, 22, 116, textureX, textureY); // Box 101
		bodyModel[82] = new ModelRendererTurbo(this, 22, 116, textureX, textureY); // Box 102
		bodyModel[83] = new ModelRendererTurbo(this, 29, 113, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 30, 118, textureX, textureY); // Box 104
		bodyModel[85] = new ModelRendererTurbo(this, 29, 113, textureX, textureY); // Box 105
		bodyModel[86] = new ModelRendererTurbo(this, 30, 118, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 331, 28, textureX, textureY, "cull"); // Box 141 roof railings cull
		bodyModel[88] = new ModelRendererTurbo(this, 368, 38, textureX, textureY); // Box 108
		bodyModel[89] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 222
		bodyModel[90] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 223
		bodyModel[91] = new ModelRendererTurbo(this, 19, 24, textureX, textureY); // Box 286
		bodyModel[92] = new ModelRendererTurbo(this, 19, 24, textureX, textureY); // Box 287
		bodyModel[93] = new ModelRendererTurbo(this, -2, 38, textureX, textureY); // Box 196
		bodyModel[94] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 198
		bodyModel[95] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 199
		bodyModel[96] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 200
		bodyModel[97] = new ModelRendererTurbo(this, -3, 38, textureX, textureY); // Box 201
		bodyModel[98] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 202
		bodyModel[99] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 203
		bodyModel[100] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 204
		bodyModel[101] = new ModelRendererTurbo(this, 36, 28, textureX, textureY); // Box 63
		bodyModel[102] = new ModelRendererTurbo(this, 36, 21, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 15, 116, textureX, textureY); // Box 130
		bodyModel[105] = new ModelRendererTurbo(this, 17, 120, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 15, 116, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 17, 120, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 12, 4, textureX, textureY); // Box 134
		bodyModel[109] = new ModelRendererTurbo(this, 12, 0, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 137
		bodyModel[111] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 418, 11, textureX, textureY); // Box 141
		bodyModel[115] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 99, 1, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 102, 1, textureX, textureY); // Box 123

		bodyModel[0].addShapeBox(0F, 0F, 0F, 54, 4, 14, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[0].setRotationPoint(-27F, -6.5F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 54, 4, 7, 0F,0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-27F, -11.5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 54, 4, 7, 0F,0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-27F, -11.5F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 54, 4, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F); // Box 5
		bodyModel[3].setRotationPoint(-27F, -1.5F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 54, 4, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F); // Box 6
		bodyModel[4].setRotationPoint(-27F, -1.5F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 54, 4, 4, 0F,0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-27F, -10.84F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 54, 4, 4, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 8
		bodyModel[6].setRotationPoint(-27F, -10.84F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 54, 4, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-27F, -2.14F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 54, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F); // Box 10
		bodyModel[8].setRotationPoint(-27F, -2.14F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 162
		bodyModel[9].setRotationPoint(-28.5F, -6.5F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-1F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F, -1F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-28F, -6.5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.5F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, -1F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, -1F, 0.34F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-28F, -6.5F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-1F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, -4.5F, -1F, -1F, -4.5F, -1F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, -2F, 0.5F, 0.66F, -2F); // Box 17
		bodyModel[12].setRotationPoint(-28F, -11.5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-1F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -2.5F, -1F, -1F, -2.5F, 0.5F, 0.66F, -2F, 0F, 0.66F, -2F, 0F, 0.66F, 0F, -1F, 0.66F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-28F, -11.5F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-28F, -10.84F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.35F, 0.5F, -1F, -0.35F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F); // Box 20
		bodyModel[15].setRotationPoint(-28F, -10.84F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1.25F, 0F, -1F, 1.25F, 0F); // Box 21
		bodyModel[16].setRotationPoint(-28F, -2.15F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0.5F, 0.66F, -2F, 0F, 0.66F, -2F, 0F, 0.66F, 0F, -1F, 0.66F, 0F, -1F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -2.5F, -1F, -1F, -2.5F); // Box 22
		bodyModel[17].setRotationPoint(-28F, -1.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, -1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.35F, 0.5F, -1F, -0.35F, 0.5F); // Box 23
		bodyModel[18].setRotationPoint(-28F, -2.15F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-1F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, -2F, 0.5F, 0.66F, -2F, -1F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, -4.5F, -1F, -1F, -4.5F); // Box 24
		bodyModel[19].setRotationPoint(-28F, -1.5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 25
		bodyModel[20].setRotationPoint(26.5F, -6.5F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 1.25F, 0F, -1F, 1.25F, 0F, -1F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F); // Box 26
		bodyModel[21].setRotationPoint(27F, -10.84F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, -1F, -4.5F, -1F, -1F, -4.5F, -1F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0.66F, -2F, 0.5F, 0.66F, -2F, -1F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 27
		bodyModel[22].setRotationPoint(27F, -11.5F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0.34F, 0F, 0.5F, 0.34F, 0F, -1F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0.5F, 0.34F, 0F, -1F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 28
		bodyModel[23].setRotationPoint(27F, -6.5F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0.66F, -2F, 0.5F, 0.66F, -2F, -1F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1F, -4.5F, -1F, -1F, -4.5F, -1F, -1F, -2.5F, 0F, -1F, -2.5F); // Box 29
		bodyModel[24].setRotationPoint(27F, -1.5F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, -1F, -0.35F, 0.5F, 0F, -0.35F, 0.5F); // Box 30
		bodyModel[25].setRotationPoint(27F, -2.14F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.5F, -1F, -0.35F, 0.5F, -1F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 31
		bodyModel[26].setRotationPoint(27F, -2.14F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0.66F, 0F, -1F, 0.66F, 0F, 0.5F, 0.66F, -2F, 0F, 0.66F, -2F, 0F, -1F, -2.5F, -1F, -1F, -2.5F, -1F, -1F, -4.5F, 0F, -1F, -4.5F); // Box 32
		bodyModel[27].setRotationPoint(27F, -1.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0.34F, 0F, -1F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, -1F, 0.34F, 0F, 0.5F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 33
		bodyModel[28].setRotationPoint(27F, -6.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, -1F, -2.5F, -1F, -1F, -2.5F, -1F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.66F, 0F, -1F, 0.66F, 0F, 0.5F, 0.66F, -2F, 0F, 0.66F, -2F); // Box 34
		bodyModel[29].setRotationPoint(27F, -11.5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -0.35F, 0.5F, -1F, -0.35F, 0.5F, -1F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(27F, -10.84F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[31].setRotationPoint(-23F, 5.1F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[32].setRotationPoint(20F, 5.1F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 61, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[33].setRotationPoint(-30.5F, 3.5F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[34].setRotationPoint(-33.5F, 3F, -1.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[35].setRotationPoint(30.5F, 3F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 248
		bodyModel[36].setRotationPoint(-2F, -16.5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 249
		bodyModel[37].setRotationPoint(-4F, -16.5F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 250
		bodyModel[38].setRotationPoint(-2F, -15.5F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 251
		bodyModel[39].setRotationPoint(-4F, -15.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 43
		bodyModel[40].setRotationPoint(2F, -16.5F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 44
		bodyModel[41].setRotationPoint(2F, -15.5F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(-1.5F, -17.25F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 52
		bodyModel[43].setRotationPoint(-2.5F, -17.5F, -3.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(-2.5F, -17.5F, 2.25F);

		bodyModel[45].addBox(0F, 0F, 0F, 53, 1, 0, 0F); // Box 236
		bodyModel[45].setRotationPoint(-26.5F, 2.5F, -9.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 53, 1, 0, 0F); // Box 247
		bodyModel[46].setRotationPoint(-26.5F, 2.5F, 9.01F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 59 cull platform
		bodyModel[47].setRotationPoint(-30.5F, 2.5F, -9.01F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 cull
		bodyModel[48].setRotationPoint(-4.5F, -9F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 62 cull
		bodyModel[49].setRotationPoint(-4.5F, -9F, 5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 506
		bodyModel[50].setRotationPoint(-2F, -5.5F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[51].setRotationPoint(-24F, 2F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[52].setRotationPoint(19F, 2F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 66
		bodyModel[53].setRotationPoint(26.5F, 2.5F, -9.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-23F, 4.5F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		bodyModel[55].setRotationPoint(-22.5F, -0.5F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 70
		bodyModel[56].setRotationPoint(-23F, 4.5F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
		bodyModel[57].setRotationPoint(-22.5F, -0.5F, 2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
		bodyModel[58].setRotationPoint(-22.5F, 2.5F, -9.01F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[59].setRotationPoint(-22.5F, 2.5F, 6.01F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[60].setRotationPoint(20.5F, 2.5F, 6.01F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 77
		bodyModel[61].setRotationPoint(20.5F, 2.5F, -9.01F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 78
		bodyModel[62].setRotationPoint(20.5F, -0.5F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[63].setRotationPoint(20F, 4.5F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 80
		bodyModel[64].setRotationPoint(20F, 4.5F, 2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[65].setRotationPoint(20.5F, -0.5F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 82
		bodyModel[66].setRotationPoint(-6F, 3F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 83
		bodyModel[67].setRotationPoint(6F, 3F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[68].setRotationPoint(-6F, 3F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 0, 7, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[69].setRotationPoint(6F, 3F, 2F);

		bodyModel[70].addBox(0F, 0F, 0F, 58, 0, 1, 0F); // Box 390
		bodyModel[70].setRotationPoint(-29F, -5.5F, -8F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 0, 14, 0F); // Box 88
		bodyModel[71].setRotationPoint(-29F, -5.5F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 58, 0, 1, 0F); // Box 89
		bodyModel[72].setRotationPoint(-29F, -5.5F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 0, 14, 0F); // Box 90
		bodyModel[73].setRotationPoint(28F, -5.5F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 342
		bodyModel[74].setRotationPoint(-30.5F, 3.5F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 351
		bodyModel[75].setRotationPoint(-30.5F, 3.5F, 9F);

		bodyModel[76].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 94
		bodyModel[76].setRotationPoint(26.5F, 3.5F, 9F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 95
		bodyModel[77].setRotationPoint(26.5F, 3.5F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 344
		bodyModel[78].setRotationPoint(-19.5F, 0.5F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
		bodyModel[79].setRotationPoint(-2F, -5.5F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 100
		bodyModel[80].setRotationPoint(17.5F, 0.5F, -9F);

		bodyModel[81].addShapeBox(-2F, -2F, 0F, 3, 3, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 101
		bodyModel[81].setRotationPoint(18F, 1.5F, -9.03F);
		bodyModel[81].rotateAngleZ = -0.78539816F;

		bodyModel[82].addShapeBox(-2F, -2F, 0F, 3, 3, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 102
		bodyModel[82].setRotationPoint(-19F, 1.5F, 9.03F);
		bodyModel[82].rotateAngleZ = -0.78539816F;

		bodyModel[83].addShapeBox(0F, -2F, -1F, 0, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[83].setRotationPoint(-28.57F, 1.5F, -6F);
		bodyModel[83].rotateAngleX = 0.78539816F;

		bodyModel[84].addShapeBox(0F, -2F, -1F, 0, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 104
		bodyModel[84].setRotationPoint(-28.5F, 2.5F, -6F);

		bodyModel[85].addShapeBox(0F, -2F, -1F, 0, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 105
		bodyModel[85].setRotationPoint(28.57F, 1.5F, 5F);
		bodyModel[85].rotateAngleX = 0.78539816F;

		bodyModel[86].addShapeBox(0F, -2F, -1F, 0, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 106
		bodyModel[86].setRotationPoint(28.5F, 2.5F, 5F);

		bodyModel[87].addBox(0F, 0F, 0F, 12, 10, 12, 0F); // Box 141 roof railings cull
		bodyModel[87].setRotationPoint(-6F, -17.5F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 12, 0, 12, 0F); // Box 108
		bodyModel[88].setRotationPoint(-6F, -12.5F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 222
		bodyModel[89].setRotationPoint(-30.5F, -2F, 5F);

		bodyModel[90].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[90].setRotationPoint(-30F, -1.5F, 5F);

		bodyModel[91].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[91].setRotationPoint(-3F, 6F, -2F);
		bodyModel[91].rotateAngleX = -0.78539816F;

		bodyModel[92].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[92].setRotationPoint(0F, 6F, -2F);
		bodyModel[92].rotateAngleX = -0.78539816F;

		bodyModel[93].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[93].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[93].rotateAngleY = -0.52359878F;

		bodyModel[94].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[94].setRotationPoint(-9.5F, 6F, -2.5F);

		bodyModel[95].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[95].setRotationPoint(-8F, 6.01F, 0F);
		bodyModel[95].rotateAngleY = -0.52359878F;

		bodyModel[96].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[96].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[96].rotateAngleY = -0.26179939F;

		bodyModel[97].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[97].setRotationPoint(6F, 6.01F, 0F);
		bodyModel[97].rotateAngleY = -0.26179939F;

		bodyModel[98].addBox(-20.5F, 0F, 2F, 16, 0, 1, 0F); // Box 202
		bodyModel[98].setRotationPoint(-2F, 6.01F, -0.5F);
		bodyModel[98].rotateAngleY = 0.10471976F;
		bodyModel[98].rotateAngleZ = 0.05235988F;

		bodyModel[99].addBox(0F, 0F, 0F, 13, 0, 1, 0F); // Box 203
		bodyModel[99].setRotationPoint(-7F, 6F, 1F);

		bodyModel[100].addBox(-1F, 0F, -1.5F, 17, 0, 1, 0F); // Box 204
		bodyModel[100].setRotationPoint(6F, 6.01F, -0.5F);
		bodyModel[100].rotateAngleY = 0.10471976F;
		bodyModel[100].rotateAngleZ = -0.05235988F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 61, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[101].setRotationPoint(-30.5F, 5.5F, -2.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 61, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 125
		bodyModel[102].setRotationPoint(-30.5F, 2.75F, -2.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, 2F, 2.5F, 0F, 2F, 2.5F); // Box 126
		bodyModel[103].setRotationPoint(-22F, -5.5F, -8F);

		bodyModel[104].addShapeBox(-2F, -2F, 0F, 3, 3, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 130
		bodyModel[104].setRotationPoint(-9F, 1.5F, -9.03F);
		bodyModel[104].rotateAngleZ = -0.78539816F;

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 131
		bodyModel[105].setRotationPoint(-9.5F, 0.5F, -9F);

		bodyModel[106].addShapeBox(-2F, -2F, 0F, 3, 3, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 132
		bodyModel[106].setRotationPoint(8F, 1.5F, 9.03F);
		bodyModel[106].rotateAngleZ = -0.78539816F;

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 133
		bodyModel[107].setRotationPoint(7.5F, 0.5F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 3, 9, 0F); // Box 134
		bodyModel[108].setRotationPoint(-31.5F, 2F, 0F);
		bodyModel[108].rotateAngleY = -0.10471976F;

		bodyModel[109].addBox(0F, 0F, -9F, 0, 3, 9, 0F); // Box 136
		bodyModel[109].setRotationPoint(31.5F, 2F, 0F);
		bodyModel[109].rotateAngleY = -0.10471976F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 137
		bodyModel[110].setRotationPoint(-21.5F, -0.5F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 138
		bodyModel[111].setRotationPoint(-21.5F, -0.5F, 2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 139
		bodyModel[112].setRotationPoint(21.5F, -0.5F, 2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[113].setRotationPoint(21.5F, -0.5F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 141
		bodyModel[114].setRotationPoint(-0.75F, 4.5F, -0.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, 2F, 2.5F, 0F, 2F, 2.5F); // Box 121
		bodyModel[115].setRotationPoint(21F, -5.5F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2.5F, 0F, 2F, 2.5F, 0F, 2F, -2.5F, 0F, 2F, -2.5F); // Box 122
		bodyModel[116].setRotationPoint(21F, -5.5F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2.5F, 0F, 2F, 2.5F, 0F, 2F, -2.5F, 0F, 2F, -2.5F); // Box 123
		bodyModel[117].setRotationPoint(-22F, -5.5F, 8F);

	}
	Model70TonTruckEarly bogie = new Model70TonTruckEarly();
	ModelAndrews_Truck bogie2 = new ModelAndrews_Truck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(GetColor(entity)==9534){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/Andrews_Truck_black.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.35,-0.0,-0.0);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.7,-0.0,0.00);
		bogie2.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

	}
}