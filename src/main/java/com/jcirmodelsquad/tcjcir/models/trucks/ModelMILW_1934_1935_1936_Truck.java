//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.05.2021 - 23:09:26
// Last changed on: 08.05.2021 - 23:09:26

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelMILW_1934_1935_1936_Truck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelMILW_1934_1935_1936_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[175];

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
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 79
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 79
		bodyModel[42] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 526
		bodyModel[44] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 527
		bodyModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 66
		bodyModel[46] = new ModelRendererTurbo(this, 106, 9, textureX, textureY); // Box 37
		bodyModel[47] = new ModelRendererTurbo(this, 154, 9, textureX, textureY); // Box 37
		bodyModel[48] = new ModelRendererTurbo(this, 170, 9, textureX, textureY); // Box 37
		bodyModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[50] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		bodyModel[51] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 79
		bodyModel[53] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 526
		bodyModel[56] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 527
		bodyModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 17
		bodyModel[58] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 17
		bodyModel[59] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 17
		bodyModel[61] = new ModelRendererTurbo(this, 257, 9, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[62] = new ModelRendererTurbo(this, 305, 9, textureX, textureY,"cull"); // Box 17 cull
		bodyModel[63] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 17
		bodyModel[64] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 17
		bodyModel[65] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		bodyModel[66] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 17
		bodyModel[67] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 537
		bodyModel[68] = new ModelRendererTurbo(this, 153, 6, textureX, textureY); // Box 538
		bodyModel[69] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 442
		bodyModel[70] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 538
		bodyModel[71] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 537
		bodyModel[72] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 538
		bodyModel[73] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 537
		bodyModel[74] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 538
		bodyModel[75] = new ModelRendererTurbo(this, 401, 9, textureX, textureY,"cull"); // Box 538 cull
		bodyModel[76] = new ModelRendererTurbo(this, 417, 9, textureX, textureY,"cull"); // Box 601 cull
		bodyModel[77] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 538
		bodyModel[78] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 457, 9, textureX, textureY,"cull"); // Box 79 cull
		bodyModel[80] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 605
		bodyModel[81] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 606
		bodyModel[82] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 607
		bodyModel[83] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 608
		bodyModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 609
		bodyModel[85] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 610
		bodyModel[86] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 611
		bodyModel[87] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 612
		bodyModel[88] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 613
		bodyModel[89] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 614
		bodyModel[90] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 615
		bodyModel[91] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 616
		bodyModel[92] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 617
		bodyModel[93] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 618
		bodyModel[94] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 619
		bodyModel[95] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 620
		bodyModel[96] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 621
		bodyModel[97] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 622
		bodyModel[98] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 623
		bodyModel[99] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 624
		bodyModel[100] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 625
		bodyModel[101] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 626
		bodyModel[102] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 627
		bodyModel[103] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 628
		bodyModel[104] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 629
		bodyModel[105] = new ModelRendererTurbo(this, 266, 17, textureX, textureY); // Box 630
		bodyModel[106] = new ModelRendererTurbo(this, 282, 17, textureX, textureY); // Box 631
		bodyModel[107] = new ModelRendererTurbo(this, 298, 17, textureX, textureY); // Box 632
		bodyModel[108] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 633
		bodyModel[109] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 634
		bodyModel[110] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 636
		bodyModel[111] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 637
		bodyModel[112] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 638
		bodyModel[113] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 639
		bodyModel[114] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 640
		bodyModel[115] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 641
		bodyModel[116] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 642
		bodyModel[117] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 643
		bodyModel[118] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 644
		bodyModel[119] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 526
		bodyModel[120] = new ModelRendererTurbo(this, 441, 17, textureX, textureY,"cull"); // Box 628 cull
		bodyModel[121] = new ModelRendererTurbo(this, 456, 16, textureX, textureY,"cull"); // Box 628 cull
		bodyModel[122] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 526
		bodyModel[123] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 526
		bodyModel[124] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 79
		bodyModel[125] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 79
		bodyModel[126] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 79
		bodyModel[127] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 653
		bodyModel[128] = new ModelRendererTurbo(this, 361, 5, textureX, textureY); // Box 654
		bodyModel[129] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 655
		bodyModel[130] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 656
		bodyModel[131] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 657
		bodyModel[132] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 658
		bodyModel[133] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 659
		bodyModel[134] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 660
		bodyModel[135] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 442
		bodyModel[136] = new ModelRendererTurbo(this, 36, 28, textureX, textureY); // Box 79
		bodyModel[137] = new ModelRendererTurbo(this, 29, 29, textureX, textureY); // Box 79
		bodyModel[138] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 15, 29, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 36, 24, textureX, textureY); // Box 79
		bodyModel[141] = new ModelRendererTurbo(this, 29, 25, textureX, textureY); // Box 79
		bodyModel[142] = new ModelRendererTurbo(this, 22, 24, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 15, 25, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 131, 22, textureX, textureY); // Box 79
		bodyModel[145] = new ModelRendererTurbo(this, 118, 22, textureX, textureY,"cull"); // Box 79 cull
		bodyModel[146] = new ModelRendererTurbo(this, 113, 24, textureX, textureY); // Box 526
		bodyModel[147] = new ModelRendererTurbo(this, 108, 29, textureX, textureY); // Box 79
		bodyModel[148] = new ModelRendererTurbo(this, 86, 26, textureX, textureY); // Box 79
		bodyModel[149] = new ModelRendererTurbo(this, 69, 29, textureX, textureY); // Box 526
		bodyModel[150] = new ModelRendererTurbo(this, 97, 26, textureX, textureY); // Box 527
		bodyModel[151] = new ModelRendererTurbo(this, 140, 28, textureX, textureY); // Box 527
		bodyModel[152] = new ModelRendererTurbo(this, 74, 26, textureX, textureY); // Box 162
		bodyModel[153] = new ModelRendererTurbo(this, 131, 27, textureX, textureY); // Box 163
		bodyModel[154] = new ModelRendererTurbo(this, 118, 27, textureX, textureY,"cull"); // Box 164 cull
		bodyModel[155] = new ModelRendererTurbo(this, 113, 29, textureX, textureY); // Box 165
		bodyModel[156] = new ModelRendererTurbo(this, 170, 23, textureX, textureY); // Box 17
		bodyModel[157] = new ModelRendererTurbo(this, 172, 25, textureX, textureY); // Box 526
		bodyModel[158] = new ModelRendererTurbo(this, 150, 23, textureX, textureY,"cull"); // Box 628 cull
		bodyModel[159] = new ModelRendererTurbo(this, 163, 26, textureX, textureY,"cull"); // Box 628 cull
		bodyModel[160] = new ModelRendererTurbo(this, 192, 26, textureX, textureY); // Box 655
		bodyModel[161] = new ModelRendererTurbo(this, 197, 26, textureX, textureY); // Box 656
		bodyModel[162] = new ModelRendererTurbo(this, 184, 27, textureX, textureY); // Box 657
		bodyModel[163] = new ModelRendererTurbo(this, 201, 30, textureX, textureY); // Box 660
		bodyModel[164] = new ModelRendererTurbo(this, 232, 26, textureX, textureY,"cull"); // Box 601 cull
		bodyModel[165] = new ModelRendererTurbo(this, 232, 22, textureX, textureY); // Box 538
		bodyModel[166] = new ModelRendererTurbo(this, 227, 28, textureX, textureY); // Box 644
		bodyModel[167] = new ModelRendererTurbo(this, 205, 27, textureX, textureY); // Box 654
		bodyModel[168] = new ModelRendererTurbo(this, 184, 30, textureX, textureY); // Box 184
		bodyModel[169] = new ModelRendererTurbo(this, 201, 27, textureX, textureY); // Box 185
		bodyModel[170] = new ModelRendererTurbo(this, 218, 27, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[171] = new ModelRendererTurbo(this, 227, 30, textureX, textureY); // Box 187
		bodyModel[172] = new ModelRendererTurbo(this, 205, 30, textureX, textureY); // Box 188
		bodyModel[173] = new ModelRendererTurbo(this, 197, 29, textureX, textureY); // Box 442
		bodyModel[174] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 442

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

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[18].setRotationPoint(-7.75F, 4.25F, 6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[19].setRotationPoint(5F, 5.5F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[20].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[21].setRotationPoint(-3.5F, 7.75F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[22].setRotationPoint(3.5F, 7.75F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 17
		bodyModel[23].setRotationPoint(3.75F, 5.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-4.5F, 7.75F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 17
		bodyModel[25].setRotationPoint(-4.75F, 5.5F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 144
		bodyModel[26].setRotationPoint(-3.75F, 5.25F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 144
		bodyModel[27].setRotationPoint(2.25F, 5.25F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 144
		bodyModel[28].setRotationPoint(2.25F, 7.25F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 144
		bodyModel[29].setRotationPoint(-3.75F, 7.25F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[30].setRotationPoint(-1.5F, 4.75F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[31].setRotationPoint(-7.75F, 3.75F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[32].setRotationPoint(-5.25F, 3.75F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[33].setRotationPoint(5.25F, 3.75F, 6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 79
		bodyModel[34].setRotationPoint(3.25F, 3.75F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[35].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[36].setRotationPoint(-8.75F, 3.75F, 6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 79
		bodyModel[37].setRotationPoint(-10.75F, 3.75F, 6.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 79
		bodyModel[38].setRotationPoint(7.75F, 3.75F, 6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[39].setRotationPoint(8.75F, 3.75F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[40].setRotationPoint(10.25F, 3.75F, 5.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[41].setRotationPoint(10.25F, 4.75F, 5.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[42].setRotationPoint(10.25F, 5.75F, -5.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[43].setRotationPoint(10.25F, 3.75F, -7.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[44].setRotationPoint(10.25F, 4.75F, -6.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 66
		bodyModel[45].setRotationPoint(-1.5F, 5F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[46].setRotationPoint(-1.5F, 6.1F, 5.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.33F, 0F); // Box 37
		bodyModel[47].setRotationPoint(-1.5F, 5.4F, 5.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 37
		bodyModel[48].setRotationPoint(-1.5F, 5.75F, 6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[49].setRotationPoint(1.5F, 5F, -6.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		bodyModel[50].setRotationPoint(-2.5F, 5F, -6.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 66
		bodyModel[51].setRotationPoint(-1.5F, 6.5F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[52].setRotationPoint(-10.75F, 3.75F, 5.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[53].setRotationPoint(-10.75F, 4.75F, 5.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[54].setRotationPoint(-10.75F, 5.75F, -5.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[55].setRotationPoint(-10.75F, 3.75F, -7.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[56].setRotationPoint(-10.75F, 4.75F, -6.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, -3F, -0.41F, 0F, -3F, -0.41F, 0F, 0F, -0.41F, 0F); // Box 17
		bodyModel[57].setRotationPoint(-1.5F, 5.25F, 7.32F);
		bodyModel[57].rotateAngleX = 0.26179939F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[58].setRotationPoint(-1F, 7.25F, -7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 17
		bodyModel[59].setRotationPoint(2F, 5.25F, 6.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[60].setRotationPoint(-5F, 5.25F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17 cull
		bodyModel[61].setRotationPoint(5F, 8.25F, 6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17 cull
		bodyModel[62].setRotationPoint(-7F, 8.25F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[63].setRotationPoint(-9.75F, 6F, 5.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F); // Box 17
		bodyModel[64].setRotationPoint(-10.25F, 3.25F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[65].setRotationPoint(8.75F, 6F, 5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 17
		bodyModel[66].setRotationPoint(9.25F, 3.25F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 537
		bodyModel[67].setRotationPoint(-2.25F, 3.76F, 5.75F);
		bodyModel[67].rotateAngleX = -0.17453293F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[68].setRotationPoint(1.5F, 4.03F, 8.95F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[69].setRotationPoint(0.25F, 3.95F, 8.96F);
		bodyModel[69].rotateAngleX = -0.78539816F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[70].setRotationPoint(-4.25F, 4.28F, 8.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 537
		bodyModel[71].setRotationPoint(1.25F, 3.76F, 5.75F);
		bodyModel[71].rotateAngleX = -0.17453293F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[72].setRotationPoint(1F, 4.28F, 8.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0.16F, 0F, 0F, -0.34F, 0F, 0F, -0.42F, 0F, -0.5F, 0.08F, 0F, -0.5F, 0.16F, 0F, 0F, -0.34F, 0F, 0F, -0.42F, 0F, -0.5F, 0.08F, 0F, -0.5F); // Box 537
		bodyModel[73].setRotationPoint(-1.75F, 3.85F, 6.25F);
		bodyModel[73].rotateAngleX = -0.17453293F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 538
		bodyModel[74].setRotationPoint(4.25F, 3.25F, 6.95F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, -0.5F, -0.27F, 0.5F, 0F, -0.27F, 0.5F); // Box 538 cull
		bodyModel[75].setRotationPoint(4.5F, 3.3F, 5.45F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.27F, 0.5F, -0.5F, -0.27F, 0.5F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F); // Box 601 cull
		bodyModel[76].setRotationPoint(4.5F, 3.3F, -8.45F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 0, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 538
		bodyModel[77].setRotationPoint(4.5F, 4.5F, -4.7F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 79
		bodyModel[78].setRotationPoint(4.5F, 5.5F, 3.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -0.37F, -0.075F, 0F, -0.37F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.37F, -1.16F, 0F, -0.37F, -1.16F, 0F, 0F, 0F, 0F); // Box 79 cull
		bodyModel[79].setRotationPoint(7.5F, 5.5F, 3.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 605
		bodyModel[80].setRotationPoint(6.75F, 5.25F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.09F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.09F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 606
		bodyModel[81].setRotationPoint(4.25F, 5.75F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.5F, -0.09F, 0F, -0.5F, -0.09F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 607
		bodyModel[82].setRotationPoint(-5.25F, 5.75F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 608
		bodyModel[83].setRotationPoint(-7.75F, 5.25F, -8.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[84].setRotationPoint(-7.75F, 4.25F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 610
		bodyModel[85].setRotationPoint(5F, 5.5F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 611
		bodyModel[86].setRotationPoint(-6.5F, 5.5F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[87].setRotationPoint(-3.5F, 7.75F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[88].setRotationPoint(3.5F, 7.75F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.55F, 0F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 614
		bodyModel[89].setRotationPoint(3.75F, 5.5F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 615
		bodyModel[90].setRotationPoint(-4.5F, 7.75F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 616
		bodyModel[91].setRotationPoint(-4.75F, 5.5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 617
		bodyModel[92].setRotationPoint(-3.75F, 5.25F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, 0F, -5F, 0F); // Box 618
		bodyModel[93].setRotationPoint(2.25F, 5.25F, -8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 619
		bodyModel[94].setRotationPoint(2.25F, 7.25F, -8.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 620
		bodyModel[95].setRotationPoint(-3.75F, 7.25F, -8.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[96].setRotationPoint(-7.75F, 3.75F, -8.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 622
		bodyModel[97].setRotationPoint(-5.25F, 3.75F, -8.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 623
		bodyModel[98].setRotationPoint(5.25F, 3.75F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 624
		bodyModel[99].setRotationPoint(3.25F, 3.75F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[100].setRotationPoint(-8.75F, 3.75F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[101].setRotationPoint(-10.75F, 3.75F, -8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 627
		bodyModel[102].setRotationPoint(7.75F, 3.75F, -8.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[103].setRotationPoint(8.75F, 3.75F, -8.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 629
		bodyModel[104].setRotationPoint(-1.5F, 5F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.33F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F); // Box 630
		bodyModel[105].setRotationPoint(-1.5F, 6.1F, -8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.33F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F); // Box 631
		bodyModel[106].setRotationPoint(-1.5F, 5.4F, -8.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.23F, 0F); // Box 632
		bodyModel[107].setRotationPoint(-1.5F, 5.75F, -9.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 633
		bodyModel[108].setRotationPoint(-1.5F, 6.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 3, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, -3F, -0.41F, 0F, -3F, -0.41F, 0F, 0F, -0.41F, 0F); // Box 634
		bodyModel[109].setRotationPoint(-1.5F, 5.25F, -7.32F);
		bodyModel[109].rotateAngleX = -0.26179939F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 636
		bodyModel[110].setRotationPoint(2F, 5.25F, -8.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 637
		bodyModel[111].setRotationPoint(-5F, 5.25F, -8.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 638
		bodyModel[112].setRotationPoint(5F, 8.25F, -8.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 639
		bodyModel[113].setRotationPoint(-7F, 8.25F, -8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[114].setRotationPoint(-9.75F, 6F, -6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F); // Box 641
		bodyModel[115].setRotationPoint(-10.25F, 3.25F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[116].setRotationPoint(8.75F, 6F, -6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 643
		bodyModel[117].setRotationPoint(9.25F, 3.25F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 644
		bodyModel[118].setRotationPoint(4.25F, 3.25F, -6.95F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, 0F, -0.175F, 0F); // Box 526
		bodyModel[119].setRotationPoint(12.13F, 5.25F, -8.25F);
		bodyModel[119].rotateAngleZ = -0.78539816F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0.26F, 0F, 0F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.26F, -1.5F, 0F, 0.26F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 628 cull
		bodyModel[120].setRotationPoint(7.5F, 4.75F, -7.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.63F, 0F, 0F, -0.63F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, -0.63F, -0.42F, 0F, -0.63F, -0.42F, 0F, 0F, -0.42F, 0F); // Box 628 cull
		bodyModel[121].setRotationPoint(10.76F, 5.25F, -6.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 526
		bodyModel[122].setRotationPoint(12.13F, 5.82F, -4.25F);
		bodyModel[122].rotateAngleZ = -0.78539816F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 526
		bodyModel[123].setRotationPoint(12.13F, 5.75F, 3.75F);
		bodyModel[123].rotateAngleZ = -0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.01F, -0.125F, 0.25F, -0.25F, -0.375F, -0.125F, -0.25F, -0.375F, -0.375F, 0.01F, -0.125F, 0F, 0.01F, -0.125F, 0.25F, -0.25F, -0.375F, -0.125F, -0.25F, -0.375F, -0.375F, 0.01F, -0.125F, 0F); // Box 79
		bodyModel[124].setRotationPoint(10.75F, 4.87F, 5.12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.135F, -0.375F, -0.25F, -0.125F, -0.375F, -0.25F, -0.375F, 0F, 0F, -0.385F, 0F, -1F, -0.135F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.375F, 0F, -1F, -0.385F); // Box 79
		bodyModel[125].setRotationPoint(12.38F, 5.35F, 5.12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.135F, -0.375F, -0.5F, -0.125F, -0.375F, -0.5F, -0.375F, 0F, 0F, -0.385F, 0.175F, -0.055F, -0.125F, -1F, 0.125F, -0.125F, -1F, 0.125F, -0.375F, 0.175F, -0.055F, -0.375F); // Box 79
		bodyModel[126].setRotationPoint(12.38F, 5.35F, 5.12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 653
		bodyModel[127].setRotationPoint(-2.25F, 4.28F, -8.7F);
		bodyModel[127].rotateAngleX = 0.17453293F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 654
		bodyModel[128].setRotationPoint(1.5F, 4.03F, -8.95F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[129].setRotationPoint(-1F, 3.6F, -8.96F);
		bodyModel[129].rotateAngleX = -0.78539816F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 656
		bodyModel[130].setRotationPoint(0.25F, 3.95F, -8.96F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 657
		bodyModel[131].setRotationPoint(-4.25F, 4.28F, -9.2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 658
		bodyModel[132].setRotationPoint(1.25F, 4.28F, -8.7F);
		bodyModel[132].rotateAngleX = 0.17453293F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0.08F, 0F, -0.5F, -0.42F, 0F, -0.5F, -0.34F, 0F, 0F, 0.16F, 0F, 0F, 0.08F, 0F, -0.5F, -0.42F, 0F, -0.5F, -0.34F, 0F, 0F, 0.16F, 0F, 0F); // Box 659
		bodyModel[133].setRotationPoint(-1.75F, 4.03F, -7.25F);
		bodyModel[133].rotateAngleX = 0.17453293F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 660
		bodyModel[134].setRotationPoint(1F, 4.28F, -9.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[135].setRotationPoint(-1F, 3.6F, 8.96F);
		bodyModel[135].rotateAngleX = -0.78539816F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, 0F, 0.5F, -0.5F); // Box 79
		bodyModel[136].setRotationPoint(7.75F, 3.75F, 6.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0.25F, -0.75F, 0.5F, 0.75F, -0.75F, 0.5F, -1F, 0F, 0.125F, 0F, 0F, 0F, 0.25F, -0.75F, -0.5F, 0.75F, -0.75F, -0.5F, -1F, 0F, 0F, 0F); // Box 79
		bodyModel[137].setRotationPoint(8.5F, 3.75F, 6.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0.125F, -1F, -0.25F, 0.125F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 0F, 0.5F, 0F); // Box 139
		bodyModel[138].setRotationPoint(7.75F, 3.75F, -8.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.125F, 0F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, 0.75F, 0F, 0.125F, 0.25F, 0F, 0F, 0F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, 0.75F, 0F, 0F, 0.25F); // Box 140
		bodyModel[139].setRotationPoint(8.5F, 3.75F, -7.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0.125F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0.125F, -1F, -0.25F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, 0F, -1F); // Box 79
		bodyModel[140].setRotationPoint(-8.75F, 3.75F, 6.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.5F, 0.75F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0F, -0.75F, 0.5F, -1F, -0.75F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -0.5F, -1F); // Box 79
		bodyModel[141].setRotationPoint(-10.5F, 3.75F, 6.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0.125F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0.125F, 0.25F, -0.25F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.25F, 0F, 0.25F); // Box 143
		bodyModel[142].setRotationPoint(-8.75F, 3.75F, -8.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.5F, -1F, 0F, 0.125F, 0F, 0F, 0.125F, 0.25F, -0.75F, 0.5F, 0.75F, -0.75F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, -0.5F, 0.75F); // Box 144
		bodyModel[143].setRotationPoint(-10.5F, 3.75F, -7.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[144].setRotationPoint(4.5F, 5.5F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -0.37F, -0.075F, 0F, -0.37F, -0.075F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.37F, -1.16F, 0F, -0.37F, -1.16F, -0.5F, 0F, 0F, -0.5F); // Box 79 cull
		bodyModel[145].setRotationPoint(7.5F, 5.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F); // Box 526
		bodyModel[146].setRotationPoint(12.13F, 5.75F, -1F);
		bodyModel[146].rotateAngleZ = -0.78539816F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[147].setRotationPoint(10.25F, 3.75F, 5.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[148].setRotationPoint(10.25F, 5.75F, -1.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[149].setRotationPoint(10.25F, 3.75F, -6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F); // Box 527
		bodyModel[150].setRotationPoint(10.25F, 3.75F, -5.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F); // Box 527
		bodyModel[151].setRotationPoint(10.75F, 5.25F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[152].setRotationPoint(10.25F, 3.75F, 1.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[153].setRotationPoint(4.5F, 5.5F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.5F, -0.37F, -0.075F, -0.5F, -0.37F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.37F, -1.16F, -0.5F, -0.37F, -1.16F, 0F, 0F, 0F, 0F); // Box 164 cull
		bodyModel[154].setRotationPoint(7.5F, 5.5F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, -0.5F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 165
		bodyModel[155].setRotationPoint(12.13F, 5.75F, 0F);
		bodyModel[155].rotateAngleZ = -0.78539816F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 0, 1, 0F,0F, 0F, 0F, 0.25F, -0.625F, 0F, 0.25F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.625F, 0F, 0.25F, 0.625F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[156].setRotationPoint(1.5F, 4.75F, -0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.175F, 0F, 0F, -0.175F, 0F, 0F, 0F, 0F, 0F, 0F, -0.175F, 0F, -0.175F, -0.175F, 0F, -0.175F, -0.175F, 0F, 0F, -0.175F, 0F); // Box 526
		bodyModel[157].setRotationPoint(12.13F, 5.25F, -7.25F);
		bodyModel[157].rotateAngleZ = -0.78539816F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 628 cull
		bodyModel[158].setRotationPoint(10.74F, 4.75F, -6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.62F, 0F, 0F, -0.62F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, -0.62F, -0.42F, 0F, -0.62F, -0.42F, 0F, 0F, -0.42F, 0F); // Box 628 cull
		bodyModel[159].setRotationPoint(10.75F, 5.25F, -5.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[160].setRotationPoint(-0.25F, 3.6F, -8.96F);
		bodyModel[160].rotateAngleX = -0.78539816F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 656
		bodyModel[161].setRotationPoint(-1F, 3.95F, -8.96F);
		bodyModel[161].rotateAngleX = -0.78539816F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 657
		bodyModel[162].setRotationPoint(0.75F, 4.28F, -9.2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 660
		bodyModel[163].setRotationPoint(-2F, 4.28F, -9.2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.52F, 0.5F, 0F, -0.52F, 0.5F, 0F, -0.05F, 0.75F, 0F, -0.05F, 0.75F); // Box 601 cull
		bodyModel[164].setRotationPoint(-4.75F, 3.55F, -8.45F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 0, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 538
		bodyModel[165].setRotationPoint(-4.75F, 4.5F, -4.7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 644
		bodyModel[166].setRotationPoint(-5.25F, 3.55F, -6.95F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 654
		bodyModel[167].setRotationPoint(-4.25F, 4.03F, -8.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[168].setRotationPoint(0.75F, 4.28F, 8.2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[169].setRotationPoint(-2F, 4.28F, 8.2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.05F, 0.75F, 0F, -0.05F, 0.75F, 0F, -0.52F, 0.5F, -0.5F, -0.52F, 0.5F); // Box 186 cull
		bodyModel[170].setRotationPoint(-4.75F, 3.55F, 5.45F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 187
		bodyModel[171].setRotationPoint(-5.25F, 3.55F, 6.95F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[172].setRotationPoint(-4.25F, 4.03F, 8.7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 442
		bodyModel[173].setRotationPoint(-1F, 3.95F, 8.96F);
		bodyModel[173].rotateAngleX = -0.78539816F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[174].setRotationPoint(-0.25F, 3.6F, 8.96F);
		bodyModel[174].rotateAngleX = -0.78539816F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 175; i++) {
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