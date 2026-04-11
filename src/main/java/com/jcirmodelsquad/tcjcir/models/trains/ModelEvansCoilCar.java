//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.05.2025 - 12:11:09
// Last changed on: 03.05.2025 - 12:11:09

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.loads.ModelEvansCoilCar_Coils;
import com.jcirmodelsquad.tcjcir.models.loads.ModelEvansCoilCar_Covers;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

public class ModelEvansCoilCar extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEvansCoilCar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[145];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 100, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 40, 136, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 38, 108, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 10, 109, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 20, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 9 flange
		bodyModel[7] = new ModelRendererTurbo(this, 75, 117, textureX, textureY); // Box 140
		bodyModel[8] = new ModelRendererTurbo(this, 70, 109, textureX, textureY); // Box 140
		bodyModel[9] = new ModelRendererTurbo(this, 128, 117, textureX, textureY); // Box 140
		bodyModel[10] = new ModelRendererTurbo(this, 128, 109, textureX, textureY); // Box 140
		bodyModel[11] = new ModelRendererTurbo(this, 153, 125, textureX, textureY); // Box 140
		bodyModel[12] = new ModelRendererTurbo(this, 5, 27, textureX, textureY,"cull"); // Box 9 Flange 2 cull
		bodyModel[13] = new ModelRendererTurbo(this, 95, 90, textureX, textureY); // Box 35 early stuff
		bodyModel[14] = new ModelRendererTurbo(this, 112, 90, textureX, textureY); // Box 35 early stuff
		bodyModel[15] = new ModelRendererTurbo(this, 146, 90, textureX, textureY); // Box 35 early stuff
		bodyModel[16] = new ModelRendererTurbo(this, 129, 90, textureX, textureY); // Box 35 early stuff
		bodyModel[17] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 140
		bodyModel[18] = new ModelRendererTurbo(this, 116, 117, textureX, textureY); // Box 140
		bodyModel[19] = new ModelRendererTurbo(this, 116, 109, textureX, textureY); // Box 140
		bodyModel[20] = new ModelRendererTurbo(this, 132, 125, textureX, textureY); // Box 140
		bodyModel[21] = new ModelRendererTurbo(this, 132, 137, textureX, textureY); // Box 140
		bodyModel[22] = new ModelRendererTurbo(this, 104, 117, textureX, textureY); // Box 140
		bodyModel[23] = new ModelRendererTurbo(this, 104, 109, textureX, textureY); // Box 140
		bodyModel[24] = new ModelRendererTurbo(this, 110, 125, textureX, textureY); // Box 140
		bodyModel[25] = new ModelRendererTurbo(this, 110, 137, textureX, textureY); // Box 140
		bodyModel[26] = new ModelRendererTurbo(this, 92, 117, textureX, textureY); // Box 140
		bodyModel[27] = new ModelRendererTurbo(this, 92, 109, textureX, textureY); // Box 140
		bodyModel[28] = new ModelRendererTurbo(this, 88, 125, textureX, textureY); // Box 140
		bodyModel[29] = new ModelRendererTurbo(this, 88, 137, textureX, textureY); // Box 140
		bodyModel[30] = new ModelRendererTurbo(this, 75, 91, textureX, textureY,"cull"); // Box 52 stirrup cull
		bodyModel[31] = new ModelRendererTurbo(this, 84, 91, textureX, textureY,"cull"); // Box 52 stirrup cull
		bodyModel[32] = new ModelRendererTurbo(this, 57, 91, textureX, textureY,"cull"); // Box 52 stirrup cull
		bodyModel[33] = new ModelRendererTurbo(this, 66, 91, textureX, textureY,"cull"); // Box 52 stirrup cull
		bodyModel[34] = new ModelRendererTurbo(this, 18, 16, textureX, textureY,"cull"); // Box 8 Trought part 2 cull
		bodyModel[35] = new ModelRendererTurbo(this, 107, 70, textureX, textureY); // Box 9 early stuff
		bodyModel[36] = new ModelRendererTurbo(this, 226, 79, textureX, textureY); // Box 8 early stuff
		bodyModel[37] = new ModelRendererTurbo(this, 144, 70, textureX, textureY); // Box 9 early stuff
		bodyModel[38] = new ModelRendererTurbo(this, 199, 79, textureX, textureY); // Box 8 early stuff
		bodyModel[39] = new ModelRendererTurbo(this, 194, 125, textureX, textureY); // Box 137 Bolster late
		bodyModel[40] = new ModelRendererTurbo(this, 194, 133, textureX, textureY); // Box 137 Bolster late
		bodyModel[41] = new ModelRendererTurbo(this, 172, 125, textureX, textureY); // Box 137 Bolster late
		bodyModel[42] = new ModelRendererTurbo(this, 172, 133, textureX, textureY); // Box 137 Bolster late
		bodyModel[43] = new ModelRendererTurbo(this, 95, 93, textureX, textureY); // Box 35
		bodyModel[44] = new ModelRendererTurbo(this, 112, 93, textureX, textureY); // Box 35
		bodyModel[45] = new ModelRendererTurbo(this, 129, 93, textureX, textureY); // Box 35
		bodyModel[46] = new ModelRendererTurbo(this, 147, 93, textureX, textureY); // Box 35
		bodyModel[47] = new ModelRendererTurbo(this, 240, 82, textureX, textureY,"cull"); // Box 9 early stuff cull
		bodyModel[48] = new ModelRendererTurbo(this, 210, 82, textureX, textureY,"cull"); // Box 9 early stuff cull
		bodyModel[49] = new ModelRendererTurbo(this, 170, 1, textureX, textureY,"cull"); // Box 9 walkway cull
		bodyModel[50] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 15, 44, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 15, 37, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 20, 7, textureX, textureY); // Box 8
		bodyModel[54] = new ModelRendererTurbo(this, 246, 79, textureX, textureY); // Box 8
		bodyModel[55] = new ModelRendererTurbo(this, 175, 80, textureX, textureY); // Box 8
		bodyModel[56] = new ModelRendererTurbo(this, 173, 60, textureX, textureY,"cull"); // Box 11 cull
		bodyModel[57] = new ModelRendererTurbo(this, 173, 40, textureX, textureY,"cull"); // Box 11 cull
		bodyModel[58] = new ModelRendererTurbo(this, 64, 79, textureX, textureY); // Box 60 early
		bodyModel[59] = new ModelRendererTurbo(this, 94, 79, textureX, textureY); // Box 60 early
		bodyModel[60] = new ModelRendererTurbo(this, 55, 70, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 81, 70, textureX, textureY); // Box 60
		bodyModel[62] = new ModelRendererTurbo(this, 68, 79, textureX, textureY); // Box 60 early
		bodyModel[63] = new ModelRendererTurbo(this, 90, 79, textureX, textureY); // Box 60 early
		bodyModel[64] = new ModelRendererTurbo(this, 47, 85, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 39, 85, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 39, 81, textureX, textureY); // Box 66 earl
		bodyModel[67] = new ModelRendererTurbo(this, 47, 81, textureX, textureY); // Box 66
		bodyModel[68] = new ModelRendererTurbo(this, 16, 71, textureX, textureY,"cull"); // Box 60 Grab Bracket cull
		bodyModel[69] = new ModelRendererTurbo(this, 16, 80, textureX, textureY,"cull"); // Box 60 Grab Bracket cull
		bodyModel[70] = new ModelRendererTurbo(this, 25, 78, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 16, 77, textureX, textureY,"cull"); // Box 60 Grab Bracket cull
		bodyModel[72] = new ModelRendererTurbo(this, 16, 74, textureX, textureY,"cull"); // Box 60 Grab Bracket cull
		bodyModel[73] = new ModelRendererTurbo(this, 37, 75, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 37, 70, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 48, 75, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 48, 70, textureX, textureY); // Box 75
		bodyModel[77] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 72
		bodyModel[78] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 72
		bodyModel[79] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 72
		bodyModel[80] = new ModelRendererTurbo(this, 18, 13, textureX, textureY,"cull"); // Box 8 Trought part 2 cull
		bodyModel[81] = new ModelRendererTurbo(this, 215, 28, textureX, textureY); // Box 72
		bodyModel[82] = new ModelRendererTurbo(this, 225, 27, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 229, 30, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 226, 30, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 71, 152, textureX, textureY,"cull"); // Box 286 cull
		bodyModel[86] = new ModelRendererTurbo(this, 62, 152, textureX, textureY); // Box 287
		bodyModel[87] = new ModelRendererTurbo(this, 52, 152, textureX, textureY); // Box 317
		bodyModel[88] = new ModelRendererTurbo(this, 38, 152, textureX, textureY); // Box 318
		bodyModel[89] = new ModelRendererTurbo(this, 16, 152, textureX, textureY); // Box 118
		bodyModel[90] = new ModelRendererTurbo(this, 28, 152, textureX, textureY); // Box 119
		bodyModel[91] = new ModelRendererTurbo(this, 5, 152, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 142, 111, textureX, textureY); // Box 196
		bodyModel[93] = new ModelRendererTurbo(this, 137, 149, textureX, textureY); // Box 122
		bodyModel[94] = new ModelRendererTurbo(this, 24, 110, textureX, textureY); // Box 124
		bodyModel[95] = new ModelRendererTurbo(this, 170, 153, textureX, textureY,"cull"); // Box 126 cull
		bodyModel[96] = new ModelRendererTurbo(this, 93, 152, textureX, textureY); // Box 125
		bodyModel[97] = new ModelRendererTurbo(this, 152, 148, textureX, textureY); // Box 124
		bodyModel[98] = new ModelRendererTurbo(this, 80, 151, textureX, textureY); // Box 124
		bodyModel[99] = new ModelRendererTurbo(this, 180, 151, textureX, textureY,"cull"); // Box 105 cull
		bodyModel[100] = new ModelRendererTurbo(this, 225, 82, textureX, textureY,"cull"); // Box 9 early stuff cull
		bodyModel[101] = new ModelRendererTurbo(this, 195, 82, textureX, textureY,"cull"); // Box 9 early stuff cull
		bodyModel[102] = new ModelRendererTurbo(this, 95, 27, textureX, textureY,"cull"); // Box 9 Flange 2 cull
		bodyModel[103] = new ModelRendererTurbo(this, 239, 79, textureX, textureY); // Box 8 early stuff
		bodyModel[104] = new ModelRendererTurbo(this, 212, 79, textureX, textureY); // Box 8 early stuff
		bodyModel[105] = new ModelRendererTurbo(this, 17, 19, textureX, textureY,"cull"); // Box 9 Flange 2 cull
		bodyModel[106] = new ModelRendererTurbo(this, 17, 23, textureX, textureY,"cull"); // Box 9 Flange 2 cull
		bodyModel[107] = new ModelRendererTurbo(this, 225, 87, textureX, textureY); // Box 8
		bodyModel[108] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 8
		bodyModel[109] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 9 flange
		bodyModel[110] = new ModelRendererTurbo(this, 167, 108, textureX, textureY); // Box 9 flange
		bodyModel[111] = new ModelRendererTurbo(this, 198, 108, textureX, textureY,"cull"); // Box 9 flange cull
		bodyModel[112] = new ModelRendererTurbo(this, 232, 108, textureX, textureY,"cull"); // Box 9 flange cull
		bodyModel[113] = new ModelRendererTurbo(this, 33, 125, textureX, textureY); // Box 137 Bolster early
		bodyModel[114] = new ModelRendererTurbo(this, 33, 114, textureX, textureY); // Box 137 Bolster early
		bodyModel[115] = new ModelRendererTurbo(this, 5, 125, textureX, textureY); // Box 137 Bolster early
		bodyModel[116] = new ModelRendererTurbo(this, 5, 115, textureX, textureY); // Box 137 Bolster early
		bodyModel[117] = new ModelRendererTurbo(this, 4, 159, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[118] = new ModelRendererTurbo(this, 4, 164, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[119] = new ModelRendererTurbo(this, 27, 159, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[120] = new ModelRendererTurbo(this, 27, 164, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[121] = new ModelRendererTurbo(this, 51, 159, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[122] = new ModelRendererTurbo(this, 50, 164, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[123] = new ModelRendererTurbo(this, 73, 159, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[124] = new ModelRendererTurbo(this, 96, 164, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[125] = new ModelRendererTurbo(this, 96, 159, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[126] = new ModelRendererTurbo(this, 73, 164, textureX, textureY,"cull"); // Box 118 cull
		bodyModel[127] = new ModelRendererTurbo(this, 243, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[128] = new ModelRendererTurbo(this, 248, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[129] = new ModelRendererTurbo(this, 243, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[130] = new ModelRendererTurbo(this, 248, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[131] = new ModelRendererTurbo(this, 243, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[132] = new ModelRendererTurbo(this, 248, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[133] = new ModelRendererTurbo(this, 243, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[134] = new ModelRendererTurbo(this, 248, 30, textureX, textureY); // Chessie bulkhead
		bodyModel[135] = new ModelRendererTurbo(this, 280, 59, textureX, textureY); // Box 209 CSX railing
		bodyModel[136] = new ModelRendererTurbo(this, 280, 37, textureX, textureY); // Box 209 CSX railing
		bodyModel[137] = new ModelRendererTurbo(this, 175, 141, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[138] = new ModelRendererTurbo(this, 180, 146, textureX, textureY); // Box 215
		bodyModel[139] = new ModelRendererTurbo(this, 183, 141, textureX, textureY); // Box 216
		bodyModel[140] = new ModelRendererTurbo(this, 175, 146, textureX, textureY,"cull"); // Box 209 cull cutbar holder
		bodyModel[141] = new ModelRendererTurbo(this, 180, 141, textureX, textureY); // Box 215
		bodyModel[142] = new ModelRendererTurbo(this, 183, 146, textureX, textureY); // Box 216
		bodyModel[143] = new ModelRendererTurbo(this, 128, 159, textureX, textureY); // Box 143 ACI plates
		bodyModel[144] = new ModelRendererTurbo(this, 121, 159, textureX, textureY); // Box 143 ACI plates

		bodyModel[0].addBox(0F, 0F, 0F, 87, 2, 5, 0F); // Box 52
		bodyModel[0].setRotationPoint(-43.5F, 3F, -2.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(-46.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[2].setRotationPoint(43.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[3].setRotationPoint(-31.5F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(27.5F, 5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 73, 4, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(-36.5F, -1F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 75, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 9 flange
		bodyModel[6].setRotationPoint(-37.5F, -2F, -8.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 140
		bodyModel[7].setRotationPoint(-1F, 6F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 140
		bodyModel[8].setRotationPoint(-2F, 5F, -2.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 140
		bodyModel[9].setRotationPoint(-20F, 4.25F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[10].setRotationPoint(-20F, 4.25F, 4.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 140
		bodyModel[11].setRotationPoint(-20F, 4.25F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 Flange 2 cull
		bodyModel[12].setRotationPoint(-21F, 3.25F, -8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35 early stuff
		bodyModel[13].setRotationPoint(26.5F, 3F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35 early stuff
		bodyModel[14].setRotationPoint(26.5F, 3F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35 early stuff
		bodyModel[15].setRotationPoint(-33.5F, 3F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35 early stuff
		bodyModel[16].setRotationPoint(-33.5F, 3F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 140
		bodyModel[17].setRotationPoint(-20F, 5F, -4.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 140
		bodyModel[18].setRotationPoint(-9F, 4.25F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[19].setRotationPoint(-9F, 4.25F, 4.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 140
		bodyModel[20].setRotationPoint(-9F, 4.25F, -4.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 140
		bodyModel[21].setRotationPoint(-9F, 5F, -4.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 140
		bodyModel[22].setRotationPoint(8F, 4.25F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[23].setRotationPoint(8F, 4.25F, 4.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 140
		bodyModel[24].setRotationPoint(8F, 4.25F, -4.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 140
		bodyModel[25].setRotationPoint(8F, 5F, -4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 140
		bodyModel[26].setRotationPoint(19F, 4.25F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[27].setRotationPoint(19F, 4.25F, 4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 140
		bodyModel[28].setRotationPoint(19F, 4.25F, -4.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 140
		bodyModel[29].setRotationPoint(19F, 5F, -4.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52 stirrup cull
		bodyModel[30].setRotationPoint(34.5F, 4F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52 stirrup cull
		bodyModel[31].setRotationPoint(34.5F, 4F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52 stirrup cull
		bodyModel[32].setRotationPoint(-37.5F, 4F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 52 stirrup cull
		bodyModel[33].setRotationPoint(-37.5F, 4F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 75, 1, 1, 0F); // Box 8 Trought part 2 cull
		bodyModel[34].setRotationPoint(-37.5F, 3F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 early stuff
		bodyModel[35].setRotationPoint(26F, 2.25F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8 early stuff
		bodyModel[36].setRotationPoint(21F, 3F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 early stuff
		bodyModel[37].setRotationPoint(-27F, 2.25F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8 early stuff
		bodyModel[38].setRotationPoint(-26F, 3F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137 Bolster late
		bodyModel[39].setRotationPoint(-32F, 3F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137 Bolster late
		bodyModel[40].setRotationPoint(27F, 3F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137 Bolster late
		bodyModel[41].setRotationPoint(-32F, 3F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137 Bolster late
		bodyModel[42].setRotationPoint(27F, 3F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35
		bodyModel[43].setRotationPoint(33.5F, 3F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35
		bodyModel[44].setRotationPoint(33.5F, 3F, 10F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35
		bodyModel[45].setRotationPoint(-40.5F, 3F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 35
		bodyModel[46].setRotationPoint(-40.5F, 3F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9 early stuff cull
		bodyModel[47].setRotationPoint(21F, 3.25F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9 early stuff cull
		bodyModel[48].setRotationPoint(-26F, 3.25F, -8.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 81, 0, 22, 0F); // Box 9 walkway cull
		bodyModel[49].setRotationPoint(-40.5F, 2.99F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 73, 1, 7, 0F); // Box 52
		bodyModel[50].setRotationPoint(-36.5F, 2F, -3.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 73, 1, 4, 0F,0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(-36.5F, 2F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 73, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 52
		bodyModel[52].setRotationPoint(-36.5F, 2F, 3.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 73, 4, 1, 0F); // Box 8
		bodyModel[53].setRotationPoint(-36.5F, -1F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 8
		bodyModel[54].setRotationPoint(-37.5F, 3F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 8
		bodyModel[55].setRotationPoint(36.5F, 3F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 36, 2, 16, 0F,-0.01F, -1F, 0F, -0.09F, -1F, 0F, -0.09F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, 0F, -0.09F, 0F, 0F, -0.09F, 0F, 0F, -0.01F, 0F, 0F); // Box 11 cull
		bodyModel[56].setRotationPoint(-36.5F, -3F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 36, 2, 16, 0F,-0.09F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.09F, -1F, 0F, -0.09F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.09F, 0F, 0F); // Box 11 cull
		bodyModel[57].setRotationPoint(0.5F, -3F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 early
		bodyModel[58].setRotationPoint(37.51F, -2F, 5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 early
		bodyModel[59].setRotationPoint(-37.51F, -2F, 5F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 1, 12, 0F); // Box 60
		bodyModel[60].setRotationPoint(37.51F, -2F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 12, 0F); // Box 60
		bodyModel[61].setRotationPoint(-37.51F, -2F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 early
		bodyModel[62].setRotationPoint(37.51F, -2F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60 early
		bodyModel[63].setRotationPoint(-37.51F, -2F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 66
		bodyModel[64].setRotationPoint(39.5F, 3F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 66
		bodyModel[65].setRotationPoint(39.5F, 3F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 66 earl
		bodyModel[66].setRotationPoint(-40.5F, 3F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 66
		bodyModel[67].setRotationPoint(-40.5F, 3F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 60 Grab Bracket cull
		bodyModel[68].setRotationPoint(-40.5F, 3F, 5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 60 Grab Bracket cull
		bodyModel[69].setRotationPoint(-40.5F, 3F, -6F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 72
		bodyModel[70].setRotationPoint(34F, 3.5F, -12F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 60 Grab Bracket cull
		bodyModel[71].setRotationPoint(37.5F, 3F, 5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 60 Grab Bracket cull
		bodyModel[72].setRotationPoint(37.5F, 3F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 75
		bodyModel[73].setRotationPoint(40.5F, 3.5F, 5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 75
		bodyModel[74].setRotationPoint(40.5F, 3.5F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 75
		bodyModel[75].setRotationPoint(-41.5F, 3.5F, 5F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 75
		bodyModel[76].setRotationPoint(-41.5F, 3.5F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 72
		bodyModel[77].setRotationPoint(34F, 3.5F, 11F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 72
		bodyModel[78].setRotationPoint(-38F, 3.5F, -12F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 72
		bodyModel[79].setRotationPoint(-38F, 3.5F, 11F);

		bodyModel[80].addBox(0F, 0F, 0F, 75, 1, 1, 0F); // Box 8 Trought part 2 cull
		bodyModel[80].setRotationPoint(-37.5F, 3F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[81].setRotationPoint(-39.26F, -4F, 2F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[82].setRotationPoint(-39.25F, -2.5F, 3.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[83].setRotationPoint(-38.51F, -4F, 2.5F);

		bodyModel[84].addFlexTrapezoid(0F, 0F, 0F, 1, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 132
		bodyModel[84].setRotationPoint(-38.99F, -1.5F, 3.99F);

		bodyModel[85].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286 cull
		bodyModel[85].setRotationPoint(14F, 6.5F, -7.5F);
		bodyModel[85].rotateAngleX = -0.78539816F;

		bodyModel[86].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[86].setRotationPoint(16F, 6.5F, -7.5F);
		bodyModel[86].rotateAngleX = -0.78539816F;

		bodyModel[87].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[87].setRotationPoint(14.5F, 6.25F, 6.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 318
		bodyModel[88].setRotationPoint(13.5F, 4.25F, 6.5F);

		bodyModel[89].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[89].setRotationPoint(-14F, 5F, -4F);
		bodyModel[89].rotateAngleX = -0.78539816F;

		bodyModel[90].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[90].setRotationPoint(-16F, 5F, -4F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[91].setRotationPoint(-14.5F, 3F, -5F);

		bodyModel[92].addBox(-0.5F, 0F, -4F, 1, 0, 9, 0F); // Box 196
		bodyModel[92].setRotationPoint(-17.5F, 5.51F, -0.5F);
		bodyModel[92].rotateAngleY = 0.03490659F;

		bodyModel[93].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[93].setRotationPoint(-11F, 5.51F, -0.7F);
		bodyModel[93].rotateAngleY = -0.10471976F;

		bodyModel[94].addBox(-0.5F, 0F, 0F, 1, 0, 39, 0F); // Box 124
		bodyModel[94].setRotationPoint(-11F, 5.51F, 3F);
		bodyModel[94].rotateAngleY = -1.57079633F;

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126 cull
		bodyModel[95].setRotationPoint(-13F, 4.75F, -2.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 22, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[96].setRotationPoint(-39F, 4.5F, 4F);
		bodyModel[96].rotateAngleZ = -0.01745329F;

		bodyModel[97].addBox(-0.5F, 0F, 0F, 1, 0, 7, 0F); // Box 124
		bodyModel[97].setRotationPoint(-18F, 5.51F, 0.5F);
		bodyModel[97].rotateAngleY = -1.57079633F;

		bodyModel[98].addBox(-0.5F, 0F, 0F, 1, 0, 4, 0F); // Box 124
		bodyModel[98].setRotationPoint(-17.5F, 5.51F, -4F);
		bodyModel[98].rotateAngleY = -1.57079633F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 105 cull
		bodyModel[99].setRotationPoint(14F, 4F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9 early stuff cull
		bodyModel[100].setRotationPoint(-26F, 3.25F, 6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 9 early stuff cull
		bodyModel[101].setRotationPoint(21F, 3.25F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 42, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 Flange 2 cull
		bodyModel[102].setRotationPoint(-21F, 3.25F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8 early stuff
		bodyModel[103].setRotationPoint(21F, 3F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8 early stuff
		bodyModel[104].setRotationPoint(-26F, 3F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 75, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 Flange 2 cull
		bodyModel[105].setRotationPoint(-37.5F, 3.25F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 75, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 Flange 2 cull
		bodyModel[106].setRotationPoint(-37.5F, 3.25F, 6.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 4, 16, 0F); // Box 8
		bodyModel[107].setRotationPoint(-37.5F, -1F, -8F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 4, 16, 0F); // Box 8
		bodyModel[108].setRotationPoint(36.5F, -1F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 75, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 9 flange
		bodyModel[109].setRotationPoint(-37.5F, -2F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 flange
		bodyModel[110].setRotationPoint(36.5F, -2F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9 flange cull
		bodyModel[111].setRotationPoint(-37.5F, -2F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0.05F, -0.75F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 9 flange cull
		bodyModel[112].setRotationPoint(-0.5F, -2F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137 Bolster early
		bodyModel[113].setRotationPoint(-32F, 3F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137 Bolster early
		bodyModel[114].setRotationPoint(27F, 3F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137 Bolster early
		bodyModel[115].setRotationPoint(-32F, 3F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 137 Bolster early
		bodyModel[116].setRotationPoint(27F, 3F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[117].setRotationPoint(-4F, 3F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 118 cull
		bodyModel[118].setRotationPoint(-4F, 3F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[119].setRotationPoint(-20F, 3F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 118 cull
		bodyModel[120].setRotationPoint(-20F, 3F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[121].setRotationPoint(12F, 3F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 118 cull
		bodyModel[122].setRotationPoint(12F, 3F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[123].setRotationPoint(-28F, 3F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 118 cull
		bodyModel[124].setRotationPoint(-28F, 3F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118 cull
		bodyModel[125].setRotationPoint(20F, 3F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 118 cull
		bodyModel[126].setRotationPoint(20F, 3F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chessie bulkhead
		bodyModel[127].setRotationPoint(-35F, -7.5F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Chessie bulkhead
		bodyModel[128].setRotationPoint(-34.98F, -7.5F, -5F);
		bodyModel[128].rotateAngleZ = -0.36651914F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Chessie bulkhead
		bodyModel[129].setRotationPoint(-35F, -7.5F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Chessie bulkhead
		bodyModel[130].setRotationPoint(-34.98F, -7.5F, 4F);
		bodyModel[130].rotateAngleZ = -0.36651914F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Chessie bulkhead
		bodyModel[131].setRotationPoint(34F, -7.5F, -5F);

		bodyModel[132].addShapeBox(-1F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Chessie bulkhead
		bodyModel[132].setRotationPoint(34.98F, -7.5F, -5F);
		bodyModel[132].rotateAngleZ = 0.36651914F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Chessie bulkhead
		bodyModel[133].setRotationPoint(34F, -7.5F, 4F);

		bodyModel[134].addShapeBox(-1F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F); // Chessie bulkhead
		bodyModel[134].setRotationPoint(34.98F, -7.5F, 4F);
		bodyModel[134].rotateAngleZ = 0.36651914F;

		bodyModel[135].addBox(0F, 0F, 0F, 0, 5, 16, 0F); // Box 209 CSX railing
		bodyModel[135].setRotationPoint(37.55F, -6F, -8F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 5, 16, 0F); // Box 209 CSX railing
		bodyModel[136].setRotationPoint(-37.52F, -6F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[137].setRotationPoint(40.51F, 3F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[138].setRotationPoint(41.5F, 4.5F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[139].setRotationPoint(41.4F, 4.5F, -9.5F);
		bodyModel[139].rotateAngleY = 1.08210414F;
		bodyModel[139].rotateAngleZ = -0.03490659F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209 cull cutbar holder
		bodyModel[140].setRotationPoint(-41.51F, 3F, 9F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 215
		bodyModel[141].setRotationPoint(-41.5F, 4.5F, 9F);

		bodyModel[142].addShapeBox(-11F, 0F, 0F, 11, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[142].setRotationPoint(-41.4F, 4.5F, 9.5F);
		bodyModel[142].rotateAngleY = 1.08210414F;
		bodyModel[142].rotateAngleZ = 0.03490659F;

		bodyModel[143].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 143 ACI plates
		bodyModel[143].setRotationPoint(-1F, 3.1F, -8.51F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 143 ACI plates
		bodyModel[144].setRotationPoint(-1F, 3.1F, 8.51F);
	}

    Model70TonTruck2 bogie = new Model70TonTruck2();
	ModelEvansCoilCar_Coils coils = new ModelEvansCoilCar_Coils();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
		int cargo = ((Freight) entity).getAmmountOfCargo();
		int cargoType = ((Freight) entity).getCargoManager().getSelectedCargo();
        ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);
		if (cargo > 0 && cargoType == 0) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/coilcar_covers/evanscoilcar_coils.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(0.0,0.0,0.0);
			coils.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
        if(GetColor(entity)==3249){
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
        } else {
            Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
        }
        GL11.glPushMatrix();
        GL11.glTranslated(-1.84,0.0,-0.0);
        bogie.render(entity,f,f1,f2,f3,f4,f5);

        GL11.glTranslated(3.68,0.0,0.00);
        bogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
    }
}