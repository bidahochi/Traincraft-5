//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.06.2024 - 11:14:54
// Last changed on: 02.06.2024 - 11:14:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruckEarly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelGATC4180Airslide extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGATC4180Airslide() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[165];

		initbodyModel_1();

		translateAll(0F, -1F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 117, textureX, textureY); // Box 178
		bodyModel[1] = new ModelRendererTurbo(this, 9, 110, textureX, textureY); // Box 179
		bodyModel[2] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 177
		bodyModel[3] = new ModelRendererTurbo(this, 328, 145, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 36, 46, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 25, 15, textureX, textureY); // Box 6 roof
		bodyModel[6] = new ModelRendererTurbo(this, 25, 30, textureX, textureY); // Box 6 roof
		bodyModel[7] = new ModelRendererTurbo(this, 376, 145, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 374, 100, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 330, 100, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 374, 52, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 329, 52, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 223, 47, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 38, 107, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[14] = new ModelRendererTurbo(this, 23, 72, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[15] = new ModelRendererTurbo(this, 208, 47, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 213, 47, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 218, 47, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 228, 47, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 197, 47, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 182, 47, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 187, 47, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 192, 47, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 202, 47, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 8, 159, textureX, textureY); // Box 180
		bodyModel[25] = new ModelRendererTurbo(this, 8, 159, textureX, textureY); // Box 181
		bodyModel[26] = new ModelRendererTurbo(this, 68, 107, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[27] = new ModelRendererTurbo(this, 98, 107, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[28] = new ModelRendererTurbo(this, 88, 107, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[29] = new ModelRendererTurbo(this, 78, 107, textureX, textureY, "cull"); // Stirrup Cull
		bodyModel[30] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[31] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[32] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[33] = new ModelRendererTurbo(this, 9, 206, textureX, textureY); // Box 137
		bodyModel[34] = new ModelRendererTurbo(this, 186, 74, textureX, textureY); // Box 27
		bodyModel[35] = new ModelRendererTurbo(this, 23, 47, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[36] = new ModelRendererTurbo(this, 50, 107, textureX, textureY, "cull"); // Box 45 ladder cull
		bodyModel[37] = new ModelRendererTurbo(this, 201, 74, textureX, textureY); // Box 27
		bodyModel[38] = new ModelRendererTurbo(this, 196, 74, textureX, textureY); // Box 27
		bodyModel[39] = new ModelRendererTurbo(this, 191, 74, textureX, textureY); // Box 27
		bodyModel[40] = new ModelRendererTurbo(this, 181, 74, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 213, 74, textureX, textureY); // Box 27
		bodyModel[42] = new ModelRendererTurbo(this, 228, 74, textureX, textureY); // Box 27
		bodyModel[43] = new ModelRendererTurbo(this, 223, 74, textureX, textureY); // Box 27
		bodyModel[44] = new ModelRendererTurbo(this, 218, 74, textureX, textureY); // Box 27
		bodyModel[45] = new ModelRendererTurbo(this, 208, 74, textureX, textureY); // Box 27
		bodyModel[46] = new ModelRendererTurbo(this, 283, 96, textureX, textureY); // Box 67 end shid
		bodyModel[47] = new ModelRendererTurbo(this, 282, 50, textureX, textureY); // Box 67 end shid
		bodyModel[48] = new ModelRendererTurbo(this, 275, 61, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 270, 67, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 260, 63, textureX, textureY, "cull"); // Box 87 brakestand cull
		bodyModel[51] = new ModelRendererTurbo(this, 310, 103, textureX, textureY, "cull"); // Box 465 cull walkway
		bodyModel[52] = new ModelRendererTurbo(this, 32, 135, textureX, textureY); // Box 79
		bodyModel[53] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 36, 71, textureX, textureY); // Box 82
		bodyModel[55] = new ModelRendererTurbo(this, 179, 190, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 129, 190, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 80, 176, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 32, 176, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 80, 190, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 32, 190, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 129, 135, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 177, 135, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 129, 176, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 179, 175, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 6, 123, textureX, textureY, "cull"); // Box 108 cull
		bodyModel[66] = new ModelRendererTurbo(this, 7, 146, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 6, 134, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 32, 148, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 80, 148, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 129, 162, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 179, 162, textureX, textureY); // Box 79
		bodyModel[72] = new ModelRendererTurbo(this, 129, 148, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 178, 148, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 32, 162, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 80, 162, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 177, 122, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 129, 122, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 80, 122, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 32, 122, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 247, 172, textureX, textureY); // Box 125
		bodyModel[81] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 39
		bodyModel[82] = new ModelRendererTurbo(this, 2, 3, textureX, textureY); // Box 39
		bodyModel[83] = new ModelRendererTurbo(this, 179, 4, textureX, textureY); // Box 39
		bodyModel[84] = new ModelRendererTurbo(this, 217, 10, textureX, textureY); // Box 39
		bodyModel[85] = new ModelRendererTurbo(this, 217, 12, textureX, textureY); // Box 39
		bodyModel[86] = new ModelRendererTurbo(this, 196, 213, textureX, textureY); // Box 135
		bodyModel[87] = new ModelRendererTurbo(this, 146, 214, textureX, textureY); // Box 135
		bodyModel[88] = new ModelRendererTurbo(this, 96, 214, textureX, textureY); // Box 135
		bodyModel[89] = new ModelRendererTurbo(this, 47, 214, textureX, textureY); // Box 135
		bodyModel[90] = new ModelRendererTurbo(this, 64, 226, textureX, textureY); // Box 286
		bodyModel[91] = new ModelRendererTurbo(this, 55, 226, textureX, textureY); // Box 287 air resivor
		bodyModel[92] = new ModelRendererTurbo(this, 37, 226, textureX, textureY); // Box 317
		bodyModel[93] = new ModelRendererTurbo(this, 35, 222, textureX, textureY); // Box 318
		bodyModel[94] = new ModelRendererTurbo(this, 96, 225, textureX, textureY); // Box 118
		bodyModel[95] = new ModelRendererTurbo(this, 108, 225, textureX, textureY); // Box 119
		bodyModel[96] = new ModelRendererTurbo(this, 116, 226, textureX, textureY); // Box 196
		bodyModel[97] = new ModelRendererTurbo(this, 81, 226, textureX, textureY); // Box 122
		bodyModel[98] = new ModelRendererTurbo(this, 172, 222, textureX, textureY); // Box 124
		bodyModel[99] = new ModelRendererTurbo(this, 15, 221, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[100] = new ModelRendererTurbo(this, 35, 221, textureX, textureY); // Box 124
		bodyModel[101] = new ModelRendererTurbo(this, 15, 221, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[102] = new ModelRendererTurbo(this, 7, 235, textureX, textureY); // Box 124
		bodyModel[103] = new ModelRendererTurbo(this, 15, 221, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[104] = new ModelRendererTurbo(this, 158, 216, textureX, textureY); // Box 124
		bodyModel[105] = new ModelRendererTurbo(this, 11, 166, textureX, textureY, "cull"); // Box bracket cull
		bodyModel[106] = new ModelRendererTurbo(this, 75, 226, textureX, textureY, "cull"); // Box 108 cull
		bodyModel[107] = new ModelRendererTurbo(this, 137, 205, textureX, textureY, "cull"); // Box 159 bottom pipes cull
		bodyModel[108] = new ModelRendererTurbo(this, 39, 205, textureX, textureY, "cull"); // Box 159 bottom pipes cull
		bodyModel[109] = new ModelRendererTurbo(this, 87, 205, textureX, textureY, "cull"); // Box 159 bottom pipes cull
		bodyModel[110] = new ModelRendererTurbo(this, 187, 205, textureX, textureY, "cull"); // Box 159 bottom pipes cull
		bodyModel[111] = new ModelRendererTurbo(this, 281, 218, textureX, textureY); // Box 163
		bodyModel[112] = new ModelRendererTurbo(this, 281, 196, textureX, textureY); // Box 163
		bodyModel[113] = new ModelRendererTurbo(this, 10, 172, textureX, textureY, "cull"); // Box 108 cull
		bodyModel[114] = new ModelRendererTurbo(this, 146, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[115] = new ModelRendererTurbo(this, 129, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[116] = new ModelRendererTurbo(this, 112, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[117] = new ModelRendererTurbo(this, 180, 16, textureX, textureY); // Box 148
		bodyModel[118] = new ModelRendererTurbo(this, 180, 31, textureX, textureY); // Box 148
		bodyModel[119] = new ModelRendererTurbo(this, 0, 6, textureX, textureY, "cull"); // Box 151 roofwalk end bracket cull
		bodyModel[120] = new ModelRendererTurbo(this, 204, 6, textureX, textureY, "cull"); // Box 151 roofwalk end bracket cull
		bodyModel[121] = new ModelRendererTurbo(this, 311, 56, textureX, textureY, "cull"); // Box 465 cull walkway
		bodyModel[122] = new ModelRendererTurbo(this, 78, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[123] = new ModelRendererTurbo(this, 66, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[124] = new ModelRendererTurbo(this, 53, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[125] = new ModelRendererTurbo(this, 41, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[126] = new ModelRendererTurbo(this, 95, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[127] = new ModelRendererTurbo(this, 358, 41, textureX, textureY); // Box 81
		bodyModel[128] = new ModelRendererTurbo(this, 376, 35, textureX, textureY, "cull"); // Box 15 cut bar support cull
		bodyModel[129] = new ModelRendererTurbo(this, 264, 41, textureX, textureY); // Box 81
		bodyModel[130] = new ModelRendererTurbo(this, 264, 35, textureX, textureY, "cull"); // Box 15 cut bar support cull
		bodyModel[131] = new ModelRendererTurbo(this, 237, 99, textureX, textureY, "cull"); // end sheet cull
		bodyModel[132] = new ModelRendererTurbo(this, 235, 53, textureX, textureY, "cull"); // Box 3 end sheet cull
		bodyModel[133] = new ModelRendererTurbo(this, 118, 208, textureX, textureY, "cull"); // Box 144 air resivior bracket cull
		bodyModel[134] = new ModelRendererTurbo(this, 180, 35, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 180, 35, textureX, textureY); // Box 167
		bodyModel[136] = new ModelRendererTurbo(this, 180, 35, textureX, textureY); // Box 167
		bodyModel[137] = new ModelRendererTurbo(this, 180, 35, textureX, textureY); // Box 167
		bodyModel[138] = new ModelRendererTurbo(this, 180, 35, textureX, textureY); // Box 167
		bodyModel[139] = new ModelRendererTurbo(this, 180, 20, textureX, textureY); // Box 167
		bodyModel[140] = new ModelRendererTurbo(this, 180, 20, textureX, textureY); // Box 167
		bodyModel[141] = new ModelRendererTurbo(this, 180, 20, textureX, textureY); // Box 167
		bodyModel[142] = new ModelRendererTurbo(this, 180, 20, textureX, textureY); // Box 167
		bodyModel[143] = new ModelRendererTurbo(this, 180, 20, textureX, textureY); // Box 167
		bodyModel[144] = new ModelRendererTurbo(this, 281, 218, textureX, textureY); // Box 163
		bodyModel[145] = new ModelRendererTurbo(this, 281, 196, textureX, textureY); // Box 163
		bodyModel[146] = new ModelRendererTurbo(this, 78, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[147] = new ModelRendererTurbo(this, 66, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[148] = new ModelRendererTurbo(this, 53, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[149] = new ModelRendererTurbo(this, 41, 98, textureX, textureY, "cull"); // Box 144 shaker bracket cull
		bodyModel[150] = new ModelRendererTurbo(this, 307, 50, textureX, textureY); // Box 132
		bodyModel[151] = new ModelRendererTurbo(this, 330, 123, textureX, textureY); // Box 12
		bodyModel[152] = new ModelRendererTurbo(this, 374, 123, textureX, textureY); // Box 12
		bodyModel[153] = new ModelRendererTurbo(this, 329, 75, textureX, textureY); // Box 12
		bodyModel[154] = new ModelRendererTurbo(this, 374, 75, textureX, textureY); // Box 12
		bodyModel[155] = new ModelRendererTurbo(this, 381, 83, textureX, textureY); // Box 12
		bodyModel[156] = new ModelRendererTurbo(this, 361, 82, textureX, textureY); // Box 12
		bodyModel[157] = new ModelRendererTurbo(this, 275, 49, textureX, textureY); // Box 72
		bodyModel[158] = new ModelRendererTurbo(this, 269, 57, textureX, textureY); // Box 87
		bodyModel[159] = new ModelRendererTurbo(this, 260, 51, textureX, textureY, "cull"); // Box 87 brakestand cull
		bodyModel[160] = new ModelRendererTurbo(this, 288, 52, textureX, textureY, "cull"); // Box 124 cull roof walkway
		bodyModel[161] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 12
		bodyModel[162] = new ModelRendererTurbo(this, 381, 129, textureX, textureY); // Box 12
		bodyModel[163] = new ModelRendererTurbo(this, 230, 2, textureX, textureY); // Box 163
		bodyModel[164] = new ModelRendererTurbo(this, 230, 2, textureX, textureY); // Box 163



		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 178
		bodyModel[0].setRotationPoint(-38.5F, 4F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 179
		bodyModel[1].setRotationPoint(35.5F, 4F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 71, 2, 5, 0F); // Box 177
		bodyModel[2].setRotationPoint(-35.5F, 4F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 3
		bodyModel[3].setRotationPoint(34F, 2F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 70, 22, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-35F, -18F, -11.01F);

		bodyModel[5].addShapeBox(0F, 0F, -12F, 70, 1, 12, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6 roof
		bodyModel[5].setRotationPoint(-35F, -19F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 70, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 6 roof
		bodyModel[6].setRotationPoint(-35F, -19F, 0F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 3
		bodyModel[7].setRotationPoint(-35F, 2F, -10F);

		bodyModel[8].addShapeBox(-1F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[8].setRotationPoint(35F, -10F, -10F);

		bodyModel[9].addShapeBox(-1F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[9].setRotationPoint(35F, -14F, -10F);

		bodyModel[10].addShapeBox(-1F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-34F, -10F, -10F);

		bodyModel[11].addShapeBox(-1F, 0F, 0F, 1, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-34F, -14F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[12].setRotationPoint(20F, -17F, -11.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[13].setRotationPoint(-34.99F, -5.99F, -11.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 45 ladder cull
		bodyModel[14].setRotationPoint(30.99F, -16.99F, -11.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[15].setRotationPoint(5F, -17F, -11.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[16].setRotationPoint(10F, -17F, -11.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[17].setRotationPoint(15F, -17F, -11.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27
		bodyModel[18].setRotationPoint(25F, -17F, -11.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[19].setRotationPoint(-11F, -17F, -11.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27
		bodyModel[20].setRotationPoint(-26F, -17F, -11.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[21].setRotationPoint(-21F, -17F, -11.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[22].setRotationPoint(-16F, -17F, -11.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[23].setRotationPoint(-6F, -17F, -11.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 180
		bodyModel[24].setRotationPoint(-29.5F, 6F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 181
		bodyModel[25].setRotationPoint(25.5F, 6F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Stirrup Cull
		bodyModel[26].setRotationPoint(31.5F, 3.99F, 9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Stirrup Cull
		bodyModel[27].setRotationPoint(31.5F, 3.99F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Stirrup Cull
		bodyModel[28].setRotationPoint(-34.5F, 3.99F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Stirrup Cull
		bodyModel[29].setRotationPoint(-34.5F, 3.99F, 9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[30].setRotationPoint(-30F, 3F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[31].setRotationPoint(25F, 3F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137
		bodyModel[32].setRotationPoint(-30F, 3F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137
		bodyModel[33].setRotationPoint(25F, 3F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[34].setRotationPoint(20F, -17F, 10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 45 ladder cull
		bodyModel[35].setRotationPoint(-34.99F, -16.99F, 10.51F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 45 ladder cull
		bodyModel[36].setRotationPoint(30.99F, -5.99F, 10.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[37].setRotationPoint(5F, -17F, 10.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[38].setRotationPoint(10F, -17F, 10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[39].setRotationPoint(15F, -17F, 10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27
		bodyModel[40].setRotationPoint(25F, -16.99F, 10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27  cull
		bodyModel[41].setRotationPoint(-11F, -17F, 10.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27
		bodyModel[42].setRotationPoint(-26F, -16.99F, 10.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[43].setRotationPoint(-21F, -17F, 10.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[44].setRotationPoint(-16F, -17F, 10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 27 cull
		bodyModel[45].setRotationPoint(-6F, -17F, 10.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 23, 22, 0F); // Box 67 end shid
		bodyModel[46].setRotationPoint(35.01F, -19F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 23, 22, 0F); // Box 67 end shid
		bodyModel[47].setRotationPoint(-35.01F, -19F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[48].setRotationPoint(-37.01F, -5.5F, 2F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[49].setRotationPoint(-37F, -4F, 3.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87 brakestand cull
		bodyModel[50].setRotationPoint(-36F, -5.5F, 2.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 465 cull walkway
		bodyModel[51].setRotationPoint(35F, 2F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[52].setRotationPoint(-32F, 0F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[53].setRotationPoint(-12F, 0F, 4F);

		bodyModel[54].addBox(0F, 0F, 0F, 70, 22, 1, 0F); // Box 82
		bodyModel[54].setRotationPoint(-35F, -18F, 10.01F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -3F); // Box 79
		bodyModel[55].setRotationPoint(12F, -0.75F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, 0F); // Box 79
		bodyModel[56].setRotationPoint(-8F, -0.75F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[57].setRotationPoint(-8F, 0F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[58].setRotationPoint(12F, 0F, 4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[59].setRotationPoint(-8F, -0.75F, 1F);

		bodyModel[60].addShapeBox(-13F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[60].setRotationPoint(25F, -0.75F, 1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[61].setRotationPoint(-32F, 0F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[62].setRotationPoint(-12F, 0F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[63].setRotationPoint(-8F, 0F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[64].setRotationPoint(12F, 0F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, -7F, 2, 3, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 108 cull
		bodyModel[65].setRotationPoint(-1F, 4F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 108
		bodyModel[66].setRotationPoint(-1F, 4F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 108
		bodyModel[67].setRotationPoint(-1F, 4F, -3.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[68].setRotationPoint(-32F, -0.75F, 1F);

		bodyModel[69].addShapeBox(-13F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[69].setRotationPoint(1F, -0.75F, 1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[70].setRotationPoint(-8F, -0.75F, -10F);

		bodyModel[71].addShapeBox(-13F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[71].setRotationPoint(25F, -0.75F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 79
		bodyModel[72].setRotationPoint(-32F, -0.75F, -10F);

		bodyModel[73].addShapeBox(-13F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(1F, -0.75F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -3F); // Box 79
		bodyModel[74].setRotationPoint(12F, -0.75F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, 0F); // Box 79
		bodyModel[75].setRotationPoint(-8F, -0.75F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -3F); // Box 79
		bodyModel[76].setRotationPoint(-12F, -0.75F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, 0F); // Box 79
		bodyModel[77].setRotationPoint(-32F, -1.75F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -3F); // Box 79
		bodyModel[78].setRotationPoint(-12F, -0.75F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 20, 9, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, 0F); // Box 79
		bodyModel[79].setRotationPoint(-32F, -0.75F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 66, 1, 20, 0F); // Box 125
		bodyModel[80].setRotationPoint(-33F, -2F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 72, 0, 7, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 39
		bodyModel[81].setRotationPoint(-36F, -19.01F, -3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 0, 10, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 39
		bodyModel[82].setRotationPoint(-36.5F, -19F, 2F);
		bodyModel[82].rotateAngleX = -0.08726646F;

		bodyModel[83].addShapeBox(0F, 0F, -8.5F, 7, 0, 9, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 39
		bodyModel[83].setRotationPoint(29.5F, -19F, -2F);
		bodyModel[83].rotateAngleX = 0.08726646F;

		bodyModel[84].addBox(0F, -1F, 0F, 4, 1, 0, 0F); // Box 39
		bodyModel[84].setRotationPoint(-34.99F, -17.22F, 10.99F);

		bodyModel[85].addBox(0F, -1F, 0F, 4, 1, 0, 0F); // Box 39
		bodyModel[85].setRotationPoint(30.99F, -17.22F, -10.99F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 135
		bodyModel[86].setRotationPoint(10F, 8.55F, -7.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 135
		bodyModel[87].setRotationPoint(10F, 8.05F, 3.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 135
		bodyModel[88].setRotationPoint(-14F, 8.05F, -7.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 135
		bodyModel[89].setRotationPoint(-14F, 8.05F, 3.5F);

		bodyModel[90].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[90].setRotationPoint(-3F, 6.5F, -5.5F);
		bodyModel[90].rotateAngleX = -0.78539816F;
		bodyModel[90].rotateAngleY = -1.57079633F;

		bodyModel[91].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287 air resivor
		bodyModel[91].setRotationPoint(-3F, 6.5F, -7.5F);
		bodyModel[91].rotateAngleX = -0.78539816F;
		bodyModel[91].rotateAngleY = -1.57079633F;

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 317
		bodyModel[92].setRotationPoint(2.5F, 6F, 8.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 318
		bodyModel[93].setRotationPoint(1.5F, 4F, 8.5F);

		bodyModel[94].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[94].setRotationPoint(-4F, 6F, 3F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[95].setRotationPoint(-6F, 6F, 3F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 196
		bodyModel[96].setRotationPoint(4.5F, 6.51F, -3F);
		bodyModel[96].rotateAngleY = -0.05235988F;

		bodyModel[97].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 122
		bodyModel[97].setRotationPoint(-9.5F, 6.51F, -2.6F);
		bodyModel[97].rotateAngleY = -0.26179939F;

		bodyModel[98].addBox(-0.5F, 0F, 0F, 0, 1, 31, 0F); // Box 124
		bodyModel[98].setRotationPoint(-36F, 5F, 3.01F);
		bodyModel[98].rotateAngleX = -0.03490659F;
		bodyModel[98].rotateAngleY = -1.58824962F;

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126 cull
		bodyModel[99].setRotationPoint(3F, 5.75F, 1F);

		bodyModel[100].addBox(-0.5F, 0F, 0F, 1, 0, 13, 0F); // Box 124
		bodyModel[100].setRotationPoint(-8F, 6.5F, 0F);
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126 cull
		bodyModel[101].setRotationPoint(-10.5F, 5.75F, -2F);

		bodyModel[102].addBox(-0.5F, 0F, 0F, 1, 0, 20, 0F); // Box 124
		bodyModel[102].setRotationPoint(5F, 6.5F, 2.5F);
		bodyModel[102].rotateAngleY = -1.57079633F;

		bodyModel[103].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126 cull
		bodyModel[103].setRotationPoint(-10.5F, 5.75F, 1F);

		bodyModel[104].addBox(-0.5F, 0F, 0F, 1, 0, 16, 0F); // Box 124
		bodyModel[104].setRotationPoint(-25F, 6.5F, -2.5F);
		bodyModel[104].rotateAngleY = -1.57079633F;

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box bracket cull
		bodyModel[105].setRotationPoint(2F, 5F, 2.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, -1F, -1F); // Box 108 cull
		bodyModel[106].setRotationPoint(-4F, 4.01F, 9.99F);

		bodyModel[107].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 159 bottom pipes cull
		bodyModel[107].setRotationPoint(-18F, 6.25F, 5F);

		bodyModel[108].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 159 bottom pipes cull
		bodyModel[108].setRotationPoint(-18F, 6.25F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 159 bottom pipes cull
		bodyModel[109].setRotationPoint(6F, 6.25F, 5F);

		bodyModel[110].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 159 bottom pipes cull
		bodyModel[110].setRotationPoint(6F, 6.25F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 60, 20, 0, 0F); // Box 163
		bodyModel[111].setRotationPoint(-30F, -17F, -11.51F);

		bodyModel[112].addBox(0F, 0F, 0F, 60, 20, 0, 0F); // Box 163
		bodyModel[112].setRotationPoint(-30F, -17F, 11.51F);

		bodyModel[113].addShapeBox(0F, 0F, -1F, 2, 1, 5, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 108 cull
		bodyModel[113].setRotationPoint(2F, 6F, 6.99F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0.05F, -0.5F, -2F, 0.05F, -0.5F, -2F, 0.05F, -2F, 0F, 0.05F, -2F); // Box 144 shaker bracket cull
		bodyModel[114].setRotationPoint(24F, 3F, 10.52F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0.05F, -0.5F, -2F, 0.05F, -0.5F, -2F, 0.05F, -2F, 0F, 0.05F, -2F); // Box 144 shaker bracket cull
		bodyModel[115].setRotationPoint(24F, 3F, -12.02F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0.05F, -0.5F, -2F, 0.05F, -0.5F, -2F, 0.05F, -2F, 0F, 0.05F, -2F); // Box 144 shaker bracket cull
		bodyModel[116].setRotationPoint(-27F, 3F, -12.02F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 148
		bodyModel[117].setRotationPoint(-35F, -18F, 11F);
		bodyModel[117].rotateAngleX = -0.08726646F;

		bodyModel[118].addShapeBox(0F, 0F, -1F, 70, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[118].setRotationPoint(-35F, -18F, -11F);
		bodyModel[118].rotateAngleX = 0.08726646F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 151 roofwalk end bracket cull
		bodyModel[119].setRotationPoint(-36F, -19F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 151 roofwalk end bracket cull
		bodyModel[120].setRotationPoint(35F, -19F, -2F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Box 465 cull walkway
		bodyModel[121].setRotationPoint(-37F, 2F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[122].setRotationPoint(-15F, 3.2F, -12.02F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[123].setRotationPoint(11F, 3.2F, -12.02F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[124].setRotationPoint(-15F, 3.2F, 10.52F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[125].setRotationPoint(11F, 3.2F, 10.52F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0.05F, -0.5F, -2F, 0.05F, -0.5F, -2F, 0.05F, -2F, 0F, 0.05F, -2F); // Box 144 shaker bracket cull
		bodyModel[126].setRotationPoint(-27F, 3F, 10.52F);

		bodyModel[127].addBox(-9F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[127].setRotationPoint(37.5F, 5F, -2.5F);
		bodyModel[127].rotateAngleY = 1.29154365F;

		bodyModel[128].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[128].setRotationPoint(35.02F, 3F, -10.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 12, 2, 0, 0F); // Box 81
		bodyModel[129].setRotationPoint(-35F, 5F, 11F);
		bodyModel[129].rotateAngleY = -1.8675023F;

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15 cut bar support cull
		bodyModel[130].setRotationPoint(-36.02F, 3F, 8.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // end sheet cull
		bodyModel[131].setRotationPoint(33.01F, -18F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 3 end sheet cull
		bodyModel[132].setRotationPoint(-34.01F, -18F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 144 air resivior bracket cull
		bodyModel[133].setRotationPoint(-3.5F, 3.01F, -10.51F);

		bodyModel[134].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[134].setRotationPoint(-20F, -18.75F, -8.2F);
		bodyModel[134].rotateAngleX = 0.08726646F;

		bodyModel[135].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[135].setRotationPoint(21F, -18.75F, -8.2F);
		bodyModel[135].rotateAngleX = 0.08726646F;

		bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[136].setRotationPoint(-10.5F, -18.75F, -8.2F);
		bodyModel[136].rotateAngleX = 0.08726646F;

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[137].setRotationPoint(2.5F, -18.75F, -8.2F);
		bodyModel[137].rotateAngleX = 0.08726646F;

		bodyModel[138].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[138].setRotationPoint(11F, -18.75F, -8.2F);
		bodyModel[138].rotateAngleX = 0.08726646F;

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[139].setRotationPoint(-25F, -19F, 4.25F);
		bodyModel[139].rotateAngleX = -0.08726646F;

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[140].setRotationPoint(16F, -19F, 4.25F);
		bodyModel[140].rotateAngleX = -0.08726646F;

		bodyModel[141].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[141].setRotationPoint(-15F, -19F, 4.25F);
		bodyModel[141].rotateAngleX = -0.08726646F;

		bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[142].setRotationPoint(-6.5F, -19F, 4.25F);
		bodyModel[142].rotateAngleX = -0.08726646F;

		bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 167
		bodyModel[143].setRotationPoint(6.5F, -19F, 4.25F);
		bodyModel[143].rotateAngleX = -0.08726646F;

		bodyModel[144].addBox(0F, 0F, 0F, 60, 20, 0, 0F); // Box 163
		bodyModel[144].setRotationPoint(-30F, -17F, -11.51F);

		bodyModel[145].addBox(0F, 0F, 0F, 60, 20, 0, 0F); // Box 163
		bodyModel[145].setRotationPoint(-30F, -17F, 11.51F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[146].setRotationPoint(-15F, 3.2F, -12.02F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[147].setRotationPoint(11F, 3.2F, -12.02F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[148].setRotationPoint(-15F, 3.2F, 10.52F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 144 shaker bracket cull
		bodyModel[149].setRotationPoint(11F, 3.2F, 10.52F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 20, 0, 0F); // Box 132
		bodyModel[150].setRotationPoint(-36.25F, -14F, 3.5F);

		bodyModel[151].addBox(-1F, 0F, 0F, 1, 1, 20, 0F); // Box 12
		bodyModel[151].setRotationPoint(35F, -11.5F, -10F);

		bodyModel[152].addBox(-1F, 0F, 0F, 1, 1, 20, 0F); // Box 12
		bodyModel[152].setRotationPoint(35F, -6.5F, -10F);

		bodyModel[153].addBox(-1F, 0F, 0F, 1, 1, 20, 0F); // Box 12
		bodyModel[153].setRotationPoint(-34F, -11.5F, -10F);

		bodyModel[154].addBox(-1F, 0F, 0F, 1, 1, 20, 0F); // Box 12
		bodyModel[154].setRotationPoint(-34F, -6.5F, -10F);

		bodyModel[155].addShapeBox(-1F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 12
		bodyModel[155].setRotationPoint(-34F, -5.5F, -2.25F);

		bodyModel[156].addShapeBox(-1F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 12
		bodyModel[156].setRotationPoint(-34F, -5.5F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[157].setRotationPoint(-37.01F, -16.5F, 2F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[158].setRotationPoint(-37F, -15F, 3.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87 brakestand cull
		bodyModel[159].setRotationPoint(-36F, -16.5F, 2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 124 cull roof walkway
		bodyModel[160].setRotationPoint(-37F, -11.5F, 2F);

		bodyModel[161].addShapeBox(-1F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 12
		bodyModel[161].setRotationPoint(35F, -5.5F, -2.25F);

		bodyModel[162].addShapeBox(-1F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 12
		bodyModel[162].setRotationPoint(35F, -5.5F, 2F);

		bodyModel[163].addBox(0F, 0F, 0F, 42, 0, 1, 0F); // Box 163
		bodyModel[163].setRotationPoint(-21F, 3.1F, 10.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 42, 0, 1, 0F); // Box 163
		bodyModel[164].setRotationPoint(-21F, 3.1F, -11.5F);
	}

	Model70TonTruck2 bogie2 = new Model70TonTruck2();
	Model70TonTruckEarly bogie = new Model70TonTruckEarly();

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
		GL11.glTranslated(-1.7,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.4,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}