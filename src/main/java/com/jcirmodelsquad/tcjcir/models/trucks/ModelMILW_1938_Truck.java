//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMILW_1938_Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelMILW_1938_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 79
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 381
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 79 axle
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 79
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2 wheel
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 381
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2 wheel
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 79 axle
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 79
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 79
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 144
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 144
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 144
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 144
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 466, 5, textureX, textureY); // Box 79
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 526
		bodyModel[42] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 527
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 79
		bodyModel[46] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 79
		bodyModel[47] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 79
		bodyModel[48] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 526
		bodyModel[49] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 527
		bodyModel[50] = new ModelRendererTurbo(this, 201, 9, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[51] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 17
		bodyModel[52] = new ModelRendererTurbo(this, 232, 9, textureX, textureY); // Box 17
		bodyModel[53] = new ModelRendererTurbo(this, 257, 9, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[54] = new ModelRendererTurbo(this, 305, 9, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[55] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 17
		bodyModel[56] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 17
		bodyModel[57] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		bodyModel[58] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 17
		bodyModel[59] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 537
		bodyModel[60] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 537
		bodyModel[61] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 457, 9, textureX, textureY,"cull"); // Box 79 cull
		bodyModel[63] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 605
		bodyModel[64] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 606
		bodyModel[65] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 607
		bodyModel[66] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 608
		bodyModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 609
		bodyModel[68] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 610
		bodyModel[69] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 611
		bodyModel[70] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 612
		bodyModel[71] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 613
		bodyModel[72] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 614
		bodyModel[73] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 615
		bodyModel[74] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 616
		bodyModel[75] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 617
		bodyModel[76] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 618
		bodyModel[77] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 619
		bodyModel[78] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 620
		bodyModel[79] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 625
		bodyModel[80] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 626
		bodyModel[81] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 627
		bodyModel[82] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 628
		bodyModel[83] = new ModelRendererTurbo(this, 329, 17, textureX, textureY,"cull"); // Box 634 cull
		bodyModel[84] = new ModelRendererTurbo(this, 358, 21, textureX, textureY); // Box 637
		bodyModel[85] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 638
		bodyModel[86] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 639
		bodyModel[87] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 640
		bodyModel[88] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 641
		bodyModel[89] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 642
		bodyModel[90] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 643
		bodyModel[91] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 526
		bodyModel[92] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 526
		bodyModel[93] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 653
		bodyModel[94] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 658
		bodyModel[95] = new ModelRendererTurbo(this, 192, 26, textureX, textureY); // Box 655
		bodyModel[96] = new ModelRendererTurbo(this, 197, 26, textureX, textureY); // Box 656
		bodyModel[97] = new ModelRendererTurbo(this, 184, 27, textureX, textureY); // Box 657
		bodyModel[98] = new ModelRendererTurbo(this, 201, 30, textureX, textureY); // Box 660
		bodyModel[99] = new ModelRendererTurbo(this, 184, 30, textureX, textureY); // Box 184
		bodyModel[100] = new ModelRendererTurbo(this, 201, 27, textureX, textureY); // Box 185
		bodyModel[101] = new ModelRendererTurbo(this, 197, 29, textureX, textureY); // Box 442
		bodyModel[102] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 442
		bodyModel[103] = new ModelRendererTurbo(this, 97, 14, textureX, textureY); // Box 79
		bodyModel[104] = new ModelRendererTurbo(this, 51, 10, textureX, textureY); // Box 79
		bodyModel[105] = new ModelRendererTurbo(this, 61, 7, textureX, textureY); // Box 79
		bodyModel[106] = new ModelRendererTurbo(this, 56, 7, textureX, textureY); // Box 180
		bodyModel[107] = new ModelRendererTurbo(this, 51, 7, textureX, textureY); // Box 181
		bodyModel[108] = new ModelRendererTurbo(this, 434, 14, textureX, textureY); // Box 182
		bodyModel[109] = new ModelRendererTurbo(this, 101, 8, textureX, textureY); // Box 79
		bodyModel[110] = new ModelRendererTurbo(this, 349, 15, textureX, textureY); // Box 144
		bodyModel[111] = new ModelRendererTurbo(this, 340, 15, textureX, textureY); // Box 185
		bodyModel[112] = new ModelRendererTurbo(this, 386, 22, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[113] = new ModelRendererTurbo(this, 386, 17, textureX, textureY,"cull"); // Box 187 cull
		bodyModel[114] = new ModelRendererTurbo(this, 348, 5, textureX, textureY); // Box 17
		bodyModel[115] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[116] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		bodyModel[117] = new ModelRendererTurbo(this, 112, 5, textureX, textureY); // Box 17
		bodyModel[118] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		bodyModel[119] = new ModelRendererTurbo(this, 443, 1, textureX, textureY); // Box 17
		bodyModel[120] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 161
		bodyModel[121] = new ModelRendererTurbo(this, 263, 14, textureX, textureY,"cull"); // Box 79 cull
		bodyModel[122] = new ModelRendererTurbo(this, 256, 14, textureX, textureY,"cull"); // Box 79 cull
		bodyModel[123] = new ModelRendererTurbo(this, 348, 1, textureX, textureY); // Box 197
		bodyModel[124] = new ModelRendererTurbo(this, 420, 1, textureX, textureY); // Box 198
		bodyModel[125] = new ModelRendererTurbo(this, 428, 1, textureX, textureY); // Box 199
		bodyModel[126] = new ModelRendererTurbo(this, 107, 5, textureX, textureY); // Box 200
		bodyModel[127] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 201
		bodyModel[128] = new ModelRendererTurbo(this, 448, 1, textureX, textureY); // Box 202
		bodyModel[129] = new ModelRendererTurbo(this, 404, 1, textureX, textureY); // Box 203
		bodyModel[130] = new ModelRendererTurbo(this, 457, 5, textureX, textureY); // Box 79
		bodyModel[131] = new ModelRendererTurbo(this, 423, 4, textureX, textureY); // Box 79
		bodyModel[132] = new ModelRendererTurbo(this, 448, 5, textureX, textureY); // Box 79
		bodyModel[133] = new ModelRendererTurbo(this, 439, 5, textureX, textureY); // Box 212
		bodyModel[134] = new ModelRendererTurbo(this, 430, 5, textureX, textureY); // Box 215
		bodyModel[135] = new ModelRendererTurbo(this, 249, 14, textureX, textureY,"cull"); // Box 151 cull
		bodyModel[136] = new ModelRendererTurbo(this, 242, 14, textureX, textureY,"cull"); // Box 152 cull
		bodyModel[137] = new ModelRendererTurbo(this, 416, 4, textureX, textureY); // Box 79
		bodyModel[138] = new ModelRendererTurbo(this, 475, 5, textureX, textureY); // Box 152
		bodyModel[139] = new ModelRendererTurbo(this, 393, 5, textureX, textureY); // Box 153
		bodyModel[140] = new ModelRendererTurbo(this, 409, 4, textureX, textureY); // Box 154
		bodyModel[141] = new ModelRendererTurbo(this, 402, 4, textureX, textureY); // Box 155
		bodyModel[142] = new ModelRendererTurbo(this, 304, 6, textureX, textureY); // Box 611
		bodyModel[143] = new ModelRendererTurbo(this, 299, 6, textureX, textureY); // Box 611
		bodyModel[144] = new ModelRendererTurbo(this, 294, 6, textureX, textureY); // Box 158
		bodyModel[145] = new ModelRendererTurbo(this, 289, 6, textureX, textureY); // Box 159

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[0].setRotationPoint(6F, 7F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[1].setRotationPoint(5.25F, 6.25F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[2].setRotationPoint(5.25F, 6.25F, -9.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[3].setRotationPoint(6F, 7F, 6F);

		bodyModel[4].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[4].setRotationPoint(6F, 7F, -6.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[5].setRotationPoint(5F, 6F, 6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[6].setRotationPoint(5F, 6F, -8.5F);

		bodyModel[7].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[7].setRotationPoint(-6F, 7F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[8].setRotationPoint(-6.75F, 6.25F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[9].setRotationPoint(-6.75F, 6.25F, -9.5F);

		bodyModel[10].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 2 wheel
		bodyModel[10].setRotationPoint(-6F, 7F, 6F);

		bodyModel[11].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 79 axle
		bodyModel[11].setRotationPoint(-6F, 7F, -6.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 79
		bodyModel[12].setRotationPoint(-7F, 6F, 6.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[13].setRotationPoint(-7F, 6F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F); // Box 17
		bodyModel[14].setRotationPoint(6.75F, 5.25F, 6.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.09F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.09F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[15].setRotationPoint(4.25F, 5.75F, 6.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, -0.09F, 0F, 0F, -0.09F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 17
		bodyModel[16].setRotationPoint(-5.25F, 5.75F, 6.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 17
		bodyModel[17].setRotationPoint(-7.75F, 5.25F, 6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[18].setRotationPoint(-7.75F, 4.25F, 6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[19].setRotationPoint(5F, 5.5F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[20].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[21].setRotationPoint(-3.5F, 7.75F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[22].setRotationPoint(3.5F, 7.75F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0.375F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.375F, 0.25F, 0F); // Box 17
		bodyModel[23].setRotationPoint(3.75F, 5.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-4.5F, 7.75F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 17
		bodyModel[25].setRotationPoint(-4.75F, 5.5F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 144
		bodyModel[26].setRotationPoint(-3.5F, 5.25F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 144
		bodyModel[27].setRotationPoint(2F, 5.25F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 144
		bodyModel[28].setRotationPoint(2F, 7.25F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 144
		bodyModel[29].setRotationPoint(-3.5F, 7.25F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[30].setRotationPoint(-1.5F, 4.75F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, -0.5F, 0F, -0.625F, -0.5F); // Box 79
		bodyModel[31].setRotationPoint(-7.75F, 3.75F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, -0.5F, 0F, -0.625F, -0.5F); // Box 79
		bodyModel[32].setRotationPoint(6F, 3.75F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[34].setRotationPoint(-8.75F, 3.75F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 79
		bodyModel[35].setRotationPoint(-10.75F, 3.75F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 79
		bodyModel[36].setRotationPoint(7.75F, 3.75F, 6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[37].setRotationPoint(8.75F, 3.75F, 6.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[38].setRotationPoint(10.25F, 3.75F, 5.25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[39].setRotationPoint(10.25F, 4.75F, 5.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[40].setRotationPoint(10.25F, 5.75F, -5.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[41].setRotationPoint(10.25F, 3.75F, -7.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[42].setRotationPoint(10.25F, 4.75F, -6.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[43].setRotationPoint(1.5F, 5F, -6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[44].setRotationPoint(-2.5F, 5F, -6.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[45].setRotationPoint(-10.75F, 3.75F, 5.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[46].setRotationPoint(-10.75F, 4.75F, 5.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[47].setRotationPoint(-10.75F, 5.75F, -5.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[48].setRotationPoint(-10.75F, 3.75F, -7.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[49].setRotationPoint(-10.75F, 4.75F, -6.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.07F, -0.51F, 0F, -0.07F, -0.51F, 0F, -0.22F, 0F, -2F, -0.22F, 0F, -2F, -0.22F, 0F, 0F, -0.22F, 0F); // Box 17 cull
		bodyModel[50].setRotationPoint(-1F, 6.25F, 8.25F);
		bodyModel[50].rotateAngleX = 0.13962634F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[51].setRotationPoint(-1F, 7.25F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[52].setRotationPoint(-5F, 5.25F, 6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17 cull
		bodyModel[53].setRotationPoint(5F, 8.25F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17 cull
		bodyModel[54].setRotationPoint(-7F, 8.25F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[55].setRotationPoint(-9.75F, 6F, 5.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F); // Box 17
		bodyModel[56].setRotationPoint(-10.25F, 3.25F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[57].setRotationPoint(8.75F, 6F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 17
		bodyModel[58].setRotationPoint(9.25F, 3.25F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 537
		bodyModel[59].setRotationPoint(-2.25F, 3.83F, 5.71F);
		bodyModel[59].rotateAngleX = -0.08726646F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 537
		bodyModel[60].setRotationPoint(1.25F, 3.83F, 5.71F);
		bodyModel[60].rotateAngleX = -0.08726646F;

		bodyModel[61].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 79
		bodyModel[61].setRotationPoint(4.5F, 5.5F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0.25F, -0.075F, 0F, 0.25F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.16F, 0F, 0.25F, -1.16F, 0F, 0F, 0F, 0F); // Box 79 cull
		bodyModel[62].setRotationPoint(7.5F, 5.5F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 605
		bodyModel[63].setRotationPoint(6.75F, 5.25F, -8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.09F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.09F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 606
		bodyModel[64].setRotationPoint(4.25F, 5.75F, -8.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, -0.09F, 0F, -0.5F, -0.09F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 607
		bodyModel[65].setRotationPoint(-5.25F, 5.75F, -8.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 608
		bodyModel[66].setRotationPoint(-7.75F, 5.25F, -8.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0.125F, -0.5F, -0.5F, 0.125F, -0.5F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[67].setRotationPoint(-7.75F, 4.25F, -8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 610
		bodyModel[68].setRotationPoint(5F, 5.5F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 611
		bodyModel[69].setRotationPoint(-6.5F, 5.5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[70].setRotationPoint(-3.5F, 7.75F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[71].setRotationPoint(3.5F, 7.75F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0.375F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.375F, 0.25F, 0F); // Box 614
		bodyModel[72].setRotationPoint(3.75F, 5.5F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 615
		bodyModel[73].setRotationPoint(-4.5F, 7.75F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0.375F, 0.25F, 0F, 0.375F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 616
		bodyModel[74].setRotationPoint(-4.75F, 5.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 617
		bodyModel[75].setRotationPoint(-3.5F, 5.25F, -8.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 618
		bodyModel[76].setRotationPoint(2F, 5.25F, -8.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 619
		bodyModel[77].setRotationPoint(2F, 7.25F, -8.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 620
		bodyModel[78].setRotationPoint(-3.5F, 7.25F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[79].setRotationPoint(-8.75F, 3.75F, -8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[80].setRotationPoint(-10.75F, 3.75F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 627
		bodyModel[81].setRotationPoint(7.75F, 3.75F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[82].setRotationPoint(8.75F, 3.75F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.07F, 0.49F, -2F, -0.07F, 0.49F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.21F, 1F, -2F, -0.21F, 1F, -2F, -0.21F, -1F, 0F, -0.21F, -1F); // Box 634 cull
		bodyModel[83].setRotationPoint(-1F, 6.25F, -8.25F);
		bodyModel[83].rotateAngleX = -0.13962634F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 637
		bodyModel[84].setRotationPoint(-5F, 5.25F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 638
		bodyModel[85].setRotationPoint(5F, 8.25F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 639
		bodyModel[86].setRotationPoint(-7F, 8.25F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[87].setRotationPoint(-9.75F, 6F, -6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F); // Box 641
		bodyModel[88].setRotationPoint(-10.25F, 3.25F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[89].setRotationPoint(8.75F, 6F, -6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 643
		bodyModel[90].setRotationPoint(9.25F, 3.25F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, 0F, -0.175F, 0F); // Box 526
		bodyModel[91].setRotationPoint(10.75F, 5.25F, -1.5F);
		bodyModel[91].rotateAngleZ = -0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 526
		bodyModel[92].setRotationPoint(10.75F, 5.75F, -2.5F);
		bodyModel[92].rotateAngleZ = -0.78539816F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 653
		bodyModel[93].setRotationPoint(-2.25F, 4.1F, -8.7F);
		bodyModel[93].rotateAngleX = 0.08726646F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 658
		bodyModel[94].setRotationPoint(1.25F, 4.1F, -8.7F);
		bodyModel[94].rotateAngleX = 0.08726646F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[95].setRotationPoint(-1F, 3.42F, -8.96F);
		bodyModel[95].rotateAngleX = -0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 656
		bodyModel[96].setRotationPoint(0.25F, 3.77F, -8.96F);
		bodyModel[96].rotateAngleX = -0.78539816F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 657
		bodyModel[97].setRotationPoint(-4.25F, 4.1F, -9.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 660
		bodyModel[98].setRotationPoint(1F, 4.1F, -9.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[99].setRotationPoint(-4.25F, 4.1F, 8.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[100].setRotationPoint(1F, 4.1F, 8.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[101].setRotationPoint(0.25F, 3.77F, 8.96F);
		bodyModel[101].rotateAngleX = -0.78539816F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[102].setRotationPoint(-1F, 3.42F, 8.96F);
		bodyModel[102].rotateAngleX = -0.78539816F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[103].setRotationPoint(10.25F, 4.25F, -5.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[104].setRotationPoint(10.25F, 4.75F, -6.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[105].setRotationPoint(10.25F, 3.75F, -5.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 180
		bodyModel[106].setRotationPoint(10.25F, 4.75F, 5.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[107].setRotationPoint(10.25F, 3.75F, 4.25F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 182
		bodyModel[108].setRotationPoint(4.5F, 5.5F, 1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[109].setRotationPoint(10.75F, 4.25F, -1.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, -0.5F, 0F, -3F, -0.5F); // Box 144
		bodyModel[110].setRotationPoint(-0.75F, 5.25F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 0F, -3F, 0F); // Box 185
		bodyModel[111].setRotationPoint(-0.75F, 5.25F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.01F, 0F, 0.25F, 0.01F, 0F, 0.25F, 0.01F, 0F, -0.75F, 0.01F, 0F, -0.75F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, -0.5F, 0.01F, -0.5F, -0.5F); // Box 17 cull
		bodyModel[112].setRotationPoint(-1F, 5.25F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.01F, 0F, -0.75F, 0.01F, 0F, -0.75F, 0.01F, 0F, 0.25F, 0.01F, 0F, 0.25F, 0.01F, -0.5F, -0.5F, 0.01F, -0.5F, -0.5F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F); // Box 187 cull
		bodyModel[113].setRotationPoint(-1F, 5.25F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 17
		bodyModel[114].setRotationPoint(-0.25F, 5.75F, 8.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F); // Box 17
		bodyModel[115].setRotationPoint(-0.5F, 7F, 8.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F); // Box 17
		bodyModel[116].setRotationPoint(0.5F, 7F, 8.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[117].setRotationPoint(-0.5F, 8.01F, 8.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 17
		bodyModel[118].setRotationPoint(-0.5F, 6F, 6.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 17
		bodyModel[119].setRotationPoint(0.5F, 6F, 6.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 161
		bodyModel[120].setRotationPoint(-0.25F, 5.25F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F); // Box 79 cull
		bodyModel[121].setRotationPoint(0.5F, 5.75F, 8.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 79 cull
		bodyModel[122].setRotationPoint(-2.5F, 5.75F, 8.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 197
		bodyModel[123].setRotationPoint(-0.25F, 5.75F, -9.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 198
		bodyModel[124].setRotationPoint(-0.5F, 7F, -9.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F); // Box 199
		bodyModel[125].setRotationPoint(0.5F, 7F, -9.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 200
		bodyModel[126].setRotationPoint(-0.5F, 8.01F, -9.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[127].setRotationPoint(-0.5F, 6F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[128].setRotationPoint(0.5F, 6F, -8.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 203
		bodyModel[129].setRotationPoint(-0.25F, 5.25F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1.375F, 0F, 0F, -1.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[130].setRotationPoint(6F, 3.25F, 6.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, 1.375F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, -0.5F, 1.375F, -1.125F, -0.5F); // Box 79
		bodyModel[131].setRotationPoint(5F, 3.25F, 6.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 79
		bodyModel[132].setRotationPoint(-8F, 3.25F, 6.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[133].setRotationPoint(6F, 3.25F, -8.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 215
		bodyModel[134].setRotationPoint(-8F, 3.25F, -8.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.01F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.01F, -0.5F, 0F); // Box 151 cull
		bodyModel[135].setRotationPoint(0.5F, 5.75F, -9.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 152 cull
		bodyModel[136].setRotationPoint(-2.5F, 5.75F, -9.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.125F, 0F, 1.375F, -1.125F, 0F, 1.375F, -1.125F, -0.5F, 0F, -1.125F, -0.5F); // Box 79
		bodyModel[137].setRotationPoint(-6F, 3.25F, 6.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, -0.25F, -0.625F, -0.5F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 152
		bodyModel[138].setRotationPoint(-7.75F, 3.75F, -8.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, -0.25F, -0.625F, -0.5F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Box 153
		bodyModel[139].setRotationPoint(6F, 3.75F, -8.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, 1.375F, -1.125F, -0.5F, 0F, -1.125F, -0.5F, 0F, -1.125F, 0F, 1.375F, -1.125F, 0F); // Box 154
		bodyModel[140].setRotationPoint(5F, 3.25F, -8.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, -0.5F, 1.375F, -1.125F, -0.5F, 1.375F, -1.125F, 0F, 0F, -1.125F, 0F); // Box 155
		bodyModel[141].setRotationPoint(-6F, 3.25F, -8.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[142].setRotationPoint(-6.5F, 5.25F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[143].setRotationPoint(5.5F, 5.25F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[144].setRotationPoint(-6.5F, 5.25F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[145].setRotationPoint(5.5F, 5.25F, 7F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 146; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}