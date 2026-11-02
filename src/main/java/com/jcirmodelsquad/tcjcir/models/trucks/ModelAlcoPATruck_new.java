//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.09.2021 - 20:25:00
// Last changed on: 25.09.2021 - 20:25:00

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelAlcoPATruck_new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelAlcoPATruck_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[185];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46 whee
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 47 wheel
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48 wheel
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 104 smol bering cab
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 110 smol bering cab
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 339 smol bering cab
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 340 smol bering cab
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30 wheel
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 48 wheel
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 110 smol bering cab
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 339 smol bering cab
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 415
		bodyModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 416
		bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 422
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 423
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 429
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 430
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 420
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 434
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 419
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 431
		bodyModel[25] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 432
		bodyModel[26] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 420
		bodyModel[27] = new ModelRendererTurbo(this, 280, 1, textureX, textureY); // Box 417
		bodyModel[28] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 418
		bodyModel[29] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 420
		bodyModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 453
		bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 454
		bodyModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 455
		bodyModel[33] = new ModelRendererTurbo(this, 408, 1, textureX, textureY); // Box 424
		bodyModel[34] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 425
		bodyModel[35] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 435
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 437
		bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 438
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 446
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 447
		bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 448
		bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 449
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 450
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 451
		bodyModel[44] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 462
		bodyModel[45] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 463
		bodyModel[46] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 464
		bodyModel[47] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 465
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 466
		bodyModel[49] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 467
		bodyModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 474
		bodyModel[51] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 433
		bodyModel[52] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 434
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 436
		bodyModel[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 439
		bodyModel[55] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 440
		bodyModel[56] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 441
		bodyModel[57] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 442
		bodyModel[58] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 443
		bodyModel[59] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 444
		bodyModel[60] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 456
		bodyModel[61] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 457
		bodyModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 458
		bodyModel[63] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 459
		bodyModel[64] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 460
		bodyModel[65] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 461
		bodyModel[66] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 471
		bodyModel[67] = new ModelRendererTurbo(this, 288, 9, textureX, textureY); // Box 410
		bodyModel[68] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 411
		bodyModel[69] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 134
		bodyModel[70] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 138
		bodyModel[71] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 139
		bodyModel[72] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 413
		bodyModel[76] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 431
		bodyModel[77] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 432
		bodyModel[78] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 428
		bodyModel[79] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 453
		bodyModel[80] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 123
		bodyModel[81] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 124
		bodyModel[82] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 117
		bodyModel[83] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 118
		bodyModel[84] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 124
		bodyModel[85] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 125
		bodyModel[86] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 451
		bodyModel[87] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 444
		bodyModel[88] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 5
		bodyModel[89] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 5
		bodyModel[91] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 5
		bodyModel[92] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 957
		bodyModel[93] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 122
		bodyModel[95] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 123
		bodyModel[96] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 472
		bodyModel[97] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 473
		bodyModel[98] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 337
		bodyModel[99] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 422
		bodyModel[100] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 337
		bodyModel[101] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 337
		bodyModel[102] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 422
		bodyModel[103] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 337
		bodyModel[104] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 758
		bodyModel[105] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 759
		bodyModel[106] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 760
		bodyModel[107] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 761
		bodyModel[108] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 762
		bodyModel[109] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 763
		bodyModel[110] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 764
		bodyModel[111] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 766
		bodyModel[112] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 767
		bodyModel[113] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 768
		bodyModel[114] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 769
		bodyModel[115] = new ModelRendererTurbo(this, 464, 17, textureX, textureY); // Box 770
		bodyModel[116] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 771
		bodyModel[117] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 772
		bodyModel[118] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 773
		bodyModel[119] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 774
		bodyModel[120] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 775
		bodyModel[121] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 776
		bodyModel[122] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 777
		bodyModel[123] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 778
		bodyModel[124] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 779
		bodyModel[125] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 780
		bodyModel[126] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 781
		bodyModel[127] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 782
		bodyModel[128] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 783
		bodyModel[129] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 784
		bodyModel[130] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 785
		bodyModel[131] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 789
		bodyModel[132] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 790
		bodyModel[133] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 791
		bodyModel[134] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 792
		bodyModel[135] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 793
		bodyModel[136] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 794
		bodyModel[137] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 795
		bodyModel[138] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 796
		bodyModel[139] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 797
		bodyModel[140] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 798
		bodyModel[141] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 799
		bodyModel[142] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 800
		bodyModel[143] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 801
		bodyModel[144] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 802
		bodyModel[145] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 803
		bodyModel[146] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 804
		bodyModel[147] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 805
		bodyModel[148] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 806
		bodyModel[149] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 807
		bodyModel[150] = new ModelRendererTurbo(this, 72, 33, textureX, textureY); // Box 808
		bodyModel[151] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 809
		bodyModel[152] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 810
		bodyModel[153] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 811
		bodyModel[154] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 812
		bodyModel[155] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 813
		bodyModel[156] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 814
		bodyModel[157] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 815
		bodyModel[158] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 816
		bodyModel[159] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 817
		bodyModel[160] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 818
		bodyModel[161] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 819
		bodyModel[162] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 821
		bodyModel[163] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 822
		bodyModel[164] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 823
		bodyModel[165] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 824
		bodyModel[166] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 825
		bodyModel[167] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 826
		bodyModel[168] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 827
		bodyModel[169] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 828
		bodyModel[170] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 829
		bodyModel[171] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 5
		bodyModel[172] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 958
		bodyModel[173] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 123
		bodyModel[174] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 123
		bodyModel[175] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 765
		bodyModel[176] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 786
		bodyModel[177] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 787
		bodyModel[178] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 788
		bodyModel[179] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 830
		bodyModel[180] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 831
		bodyModel[181] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 832
		bodyModel[182] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 820
		bodyModel[183] = new ModelRendererTurbo(this, 410, 4, textureX, textureY); // Box 183
		bodyModel[184] = new ModelRendererTurbo(this, 417, 5, textureX, textureY); // Box 184

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-13F, 6F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(-1F, 6F, -9F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[2].setRotationPoint(0F, 7F, 5.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46 whee
		bodyModel[3].setRotationPoint(-12F, 7F, 5.5F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47 wheel
		bodyModel[4].setRotationPoint(-12F, 7F, -5.5F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[5].setRotationPoint(0F, 7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104 smol bering cab
		bodyModel[6].setRotationPoint(-13F, 6F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[7].setRotationPoint(-1F, 6F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[8].setRotationPoint(-1F, 6F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340 smol bering cab
		bodyModel[9].setRotationPoint(-13F, 6F, 8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[10].setRotationPoint(11F, 6F, -9F);

		bodyModel[11].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30 wheel
		bodyModel[11].setRotationPoint(12F, 7F, 5.5F);

		bodyModel[12].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48 wheel
		bodyModel[12].setRotationPoint(12F, 7F, -5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110 smol bering cab
		bodyModel[13].setRotationPoint(11F, 6F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339 smol bering cab
		bodyModel[14].setRotationPoint(11F, 6F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 415
		bodyModel[15].setRotationPoint(-14F, 5.5F, 6.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[16].setRotationPoint(-11F, 5.5F, 6.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 422
		bodyModel[17].setRotationPoint(-2F, 5.5F, 6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[18].setRotationPoint(1F, 5.5F, 6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 429
		bodyModel[19].setRotationPoint(10F, 5.5F, 6.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[20].setRotationPoint(13F, 5.5F, 6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[21].setRotationPoint(-17F, 4F, 5.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 434
		bodyModel[22].setRotationPoint(-17F, 4F, 7.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 419
		bodyModel[23].setRotationPoint(16F, 4F, 7.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[24].setRotationPoint(-16F, 4F, 6.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[25].setRotationPoint(14F, 4F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[26].setRotationPoint(16F, 4F, 5.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[27].setRotationPoint(-1F, 8.5F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 418
		bodyModel[28].setRotationPoint(-0.5F, 5.5F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 420
		bodyModel[29].setRotationPoint(-2.75F, 5F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[30].setRotationPoint(-6.75F, 4F, 6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[31].setRotationPoint(-11F, 3F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 455
		bodyModel[32].setRotationPoint(4F, 3F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[33].setRotationPoint(11F, 8.5F, 6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 425
		bodyModel[34].setRotationPoint(11.5F, 5.5F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 435
		bodyModel[35].setRotationPoint(7F, 7F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 437
		bodyModel[36].setRotationPoint(7F, 5.5F, 7.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 438
		bodyModel[37].setRotationPoint(8.25F, 5.5F, 7.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 446
		bodyModel[38].setRotationPoint(5F, 5F, 7.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 447
		bodyModel[39].setRotationPoint(5F, 6.5F, 7.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 448
		bodyModel[40].setRotationPoint(5F, 6.1F, 7.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 449
		bodyModel[41].setRotationPoint(5F, 5.4F, 7.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 450
		bodyModel[42].setRotationPoint(5F, 5.75F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 451
		bodyModel[43].setRotationPoint(5F, 7.25F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[44].setRotationPoint(4.25F, 5F, 7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 463
		bodyModel[45].setRotationPoint(8.75F, 5F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 464
		bodyModel[46].setRotationPoint(8.5F, 7.5F, 7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.55F, 0F); // Box 465
		bodyModel[47].setRotationPoint(8.25F, 7.5F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.75F, 0F); // Box 466
		bodyModel[48].setRotationPoint(4.75F, 7.5F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.45F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.45F, 0F, -3.5F, 0.5F, 0F, 2.5F, -0.75F, 0F, 2.5F, -0.75F, 0F, -3.5F, 0.5F, 0F); // Box 467
		bodyModel[49].setRotationPoint(1.25F, 4.25F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 474
		bodyModel[50].setRotationPoint(10F, 2.37F, 9.45F);
		bodyModel[50].rotateAngleX = -0.78539816F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
		bodyModel[51].setRotationPoint(-9.25F, 7F, 6.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 434
		bodyModel[52].setRotationPoint(-9.25F, 5.5F, 7.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 436
		bodyModel[53].setRotationPoint(-8F, 5.5F, 7.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 439
		bodyModel[54].setRotationPoint(-6.5F, 5F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 440
		bodyModel[55].setRotationPoint(-6.5F, 6.5F, 7.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 441
		bodyModel[56].setRotationPoint(-6.5F, 6.1F, 7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 442
		bodyModel[57].setRotationPoint(-6.5F, 5.4F, 7.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 443
		bodyModel[58].setRotationPoint(-6.5F, 5.75F, 8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 444
		bodyModel[59].setRotationPoint(-6.5F, 7.25F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.55F, 0F); // Box 456
		bodyModel[60].setRotationPoint(-8.25F, 7.5F, 7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 457
		bodyModel[61].setRotationPoint(-10.75F, 5F, 7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 458
		bodyModel[62].setRotationPoint(-10.5F, 7.5F, 7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.75F, 0F); // Box 459
		bodyModel[63].setRotationPoint(-9.25F, 7.5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.2F, 0F, 0F, 2.5F, -0.75F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 2.5F, -0.75F, 0F); // Box 460
		bodyModel[64].setRotationPoint(-2.25F, 4.25F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[65].setRotationPoint(-4.75F, 5F, 7.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 471
		bodyModel[66].setRotationPoint(-12F, 2.37F, 9.45F);
		bodyModel[66].rotateAngleX = -0.78539816F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[67].setRotationPoint(-13F, 8.5F, 6.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 411
		bodyModel[68].setRotationPoint(-12.5F, 5.5F, 6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 134
		bodyModel[69].setRotationPoint(13.25F, 7.5F, 7.26F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 138
		bodyModel[70].setRotationPoint(14.5F, 6.5F, 7.01F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 139
		bodyModel[71].setRotationPoint(15F, 3.5F, 7.01F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 130
		bodyModel[72].setRotationPoint(-15F, 7.5F, 7.26F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[73].setRotationPoint(-16F, 3.5F, 7.01F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 120
		bodyModel[74].setRotationPoint(-15.5F, 6.5F, 7.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 413
		bodyModel[75].setRotationPoint(-14.75F, 5F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		bodyModel[76].setRotationPoint(-14F, 4F, 6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 432
		bodyModel[77].setRotationPoint(6.75F, 4F, 6.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 428
		bodyModel[78].setRotationPoint(14F, 5F, 6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[79].setRotationPoint(-3.75F, 3F, 6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.25F); // Box 123
		bodyModel[80].setRotationPoint(-14.75F, 3.8F, 6.67F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		bodyModel[81].setRotationPoint(-14F, 3.8F, 9.67F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -1F); // Box 117
		bodyModel[82].setRotationPoint(13.75F, 3.8F, 6.67F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[83].setRotationPoint(12F, 3.8F, 9.67F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 124
		bodyModel[84].setRotationPoint(10F, 3F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F); // Box 125
		bodyModel[85].setRotationPoint(-12F, 3F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 451
		bodyModel[86].setRotationPoint(5F, 5F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 444
		bodyModel[87].setRotationPoint(-6.5F, 5F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[88].setRotationPoint(5F, 3.5F, -7.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[89].setRotationPoint(-5F, 3.5F, -4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[90].setRotationPoint(-6.5F, 2F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[91].setRotationPoint(5F, 2F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 957
		bodyModel[92].setRotationPoint(-6.5F, 2F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-2F, 3F, -2F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 122
		bodyModel[94].setRotationPoint(-13.5F, 5.5F, -5F);

		bodyModel[95].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 123
		bodyModel[95].setRotationPoint(6.5F, 5.5F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 472
		bodyModel[96].setRotationPoint(-10F, 3.08F, 9.62F);
		bodyModel[96].rotateAngleX = -0.78539816F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 473
		bodyModel[97].setRotationPoint(7.25F, 3.08F, 9.62F);
		bodyModel[97].rotateAngleX = -0.78539816F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[98].setRotationPoint(-17F, 4F, -5.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[99].setRotationPoint(-17F, 4F, 4.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[100].setRotationPoint(-17F, 6F, -4.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[101].setRotationPoint(16F, 4F, -5.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[102].setRotationPoint(16F, 4F, 4.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[103].setRotationPoint(16F, 6F, -4.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 758
		bodyModel[104].setRotationPoint(-14F, 5.5F, -8.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 759
		bodyModel[105].setRotationPoint(-11F, 5.5F, -8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 760
		bodyModel[106].setRotationPoint(-2F, 5.5F, -8.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 761
		bodyModel[107].setRotationPoint(1F, 5.5F, -8.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 762
		bodyModel[108].setRotationPoint(10F, 5.5F, -8.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 763
		bodyModel[109].setRotationPoint(13F, 5.5F, -8.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		bodyModel[110].setRotationPoint(-17F, 4F, -7.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[111].setRotationPoint(16F, 4F, -8.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 767
		bodyModel[112].setRotationPoint(-16F, 4F, -8.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[113].setRotationPoint(14F, 4F, -8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		bodyModel[114].setRotationPoint(16F, 4F, -7.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 770
		bodyModel[115].setRotationPoint(-1F, 8.5F, -8.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 771
		bodyModel[116].setRotationPoint(-0.5F, 5.5F, -8.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 772
		bodyModel[117].setRotationPoint(-2.75F, 5F, -8.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 773
		bodyModel[118].setRotationPoint(-6.75F, 4F, -8.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 774
		bodyModel[119].setRotationPoint(-11F, 3F, -8.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Box 775
		bodyModel[120].setRotationPoint(4F, 3F, -8.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 776
		bodyModel[121].setRotationPoint(7F, 7F, -8.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 777
		bodyModel[122].setRotationPoint(7F, 5.5F, -8.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 778
		bodyModel[123].setRotationPoint(8.25F, 5.5F, -8.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 779
		bodyModel[124].setRotationPoint(5F, 5F, -8.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 780
		bodyModel[125].setRotationPoint(5F, 6.5F, -8.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 781
		bodyModel[126].setRotationPoint(5F, 6.1F, -9.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 782
		bodyModel[127].setRotationPoint(5F, 5.4F, -9.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 783
		bodyModel[128].setRotationPoint(5F, 5.75F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 784
		bodyModel[129].setRotationPoint(5F, 7.25F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 785
		bodyModel[130].setRotationPoint(4.25F, 5F, -8.25F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, 0F, 0F, -0.75F, 0F); // Box 789
		bodyModel[131].setRotationPoint(4.75F, 7.5F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.45F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.45F, 0F, -3.5F, 0.5F, 0F, 2.5F, -0.75F, 0F, 2.5F, -0.75F, 0F, -3.5F, 0.5F, 0F); // Box 790
		bodyModel[132].setRotationPoint(1.25F, 4.25F, -8.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 791
		bodyModel[133].setRotationPoint(10F, 2.9F, -10.02F);
		bodyModel[133].rotateAngleX = -0.78539816F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 792
		bodyModel[134].setRotationPoint(-9.25F, 7F, -8.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 793
		bodyModel[135].setRotationPoint(-9.25F, 5.5F, -8.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F); // Box 794
		bodyModel[136].setRotationPoint(-8F, 5.5F, -8.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 795
		bodyModel[137].setRotationPoint(-6.5F, 5F, -8.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 796
		bodyModel[138].setRotationPoint(-6.5F, 6.5F, -8.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 797
		bodyModel[139].setRotationPoint(-6.5F, 6.1F, -9.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 798
		bodyModel[140].setRotationPoint(-6.5F, 5.4F, -9.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 799
		bodyModel[141].setRotationPoint(-6.5F, 5.75F, -10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 800
		bodyModel[142].setRotationPoint(-6.5F, 7.25F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.55F, 0F); // Box 801
		bodyModel[143].setRotationPoint(-8.25F, 7.5F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 802
		bodyModel[144].setRotationPoint(-10.75F, 5F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 803
		bodyModel[145].setRotationPoint(-10.5F, 7.5F, -8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.75F, 0F); // Box 804
		bodyModel[146].setRotationPoint(-9.25F, 7.5F, -8.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.2F, 0F, 0F, 2.5F, -0.75F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 2.5F, -0.75F, 0F); // Box 805
		bodyModel[147].setRotationPoint(-2.25F, 4.25F, -8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 806
		bodyModel[148].setRotationPoint(-4.75F, 5F, -8.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 807
		bodyModel[149].setRotationPoint(-12F, 2.9F, -10.02F);
		bodyModel[149].rotateAngleX = -0.78539816F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 808
		bodyModel[150].setRotationPoint(-13F, 8.5F, -8.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 809
		bodyModel[151].setRotationPoint(-12.5F, 5.5F, -8.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[152].setRotationPoint(13.25F, 7.5F, -8.26F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 811
		bodyModel[153].setRotationPoint(14.5F, 6.5F, -8.01F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 812
		bodyModel[154].setRotationPoint(15F, 3.5F, -8.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 813
		bodyModel[155].setRotationPoint(-15F, 7.5F, -8.26F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 814
		bodyModel[156].setRotationPoint(-16F, 3.5F, -8.01F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 815
		bodyModel[157].setRotationPoint(-15.5F, 6.5F, -8.01F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 816
		bodyModel[158].setRotationPoint(-14.75F, 5F, -8.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 817
		bodyModel[159].setRotationPoint(-14F, 4F, -8.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 818
		bodyModel[160].setRotationPoint(6.75F, 4F, -8.75F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 819
		bodyModel[161].setRotationPoint(14F, 5F, -8.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 821
		bodyModel[162].setRotationPoint(-14.75F, 3.8F, -10.67F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 822
		bodyModel[163].setRotationPoint(-14F, 3.8F, -10.67F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 823
		bodyModel[164].setRotationPoint(5F, 5F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 824
		bodyModel[165].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 825
		bodyModel[166].setRotationPoint(-10F, 3.42F, -10.02F);
		bodyModel[166].rotateAngleX = -0.78539816F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 826
		bodyModel[167].setRotationPoint(7.25F, 3.42F, -10.02F);
		bodyModel[167].rotateAngleX = -0.78539816F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 827
		bodyModel[168].setRotationPoint(13.75F, 3.8F, -10.67F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 828
		bodyModel[169].setRotationPoint(12F, 3.8F, -10.67F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 829
		bodyModel[170].setRotationPoint(-9.25F, 3.78F, -9.67F);
		bodyModel[170].rotateAngleX = 0.17453293F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[171].setRotationPoint(-6.5F, 3.5F, -7.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 958
		bodyModel[172].setRotationPoint(5F, 2F, 4F);

		bodyModel[173].addShapeBox(0F, 0F, -3F, 1, 0, 3, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[173].setRotationPoint(-9.25F, 3.78F, 9.63F);
		bodyModel[173].rotateAngleX = -0.17453293F;

		bodyModel[174].addShapeBox(0F, 0F, -3F, 1, 0, 3, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 123
		bodyModel[174].setRotationPoint(8.25F, 3.78F, 9.63F);
		bodyModel[174].rotateAngleX = -0.17453293F;

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		bodyModel[175].setRotationPoint(-17F, 4F, -8.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 786
		bodyModel[176].setRotationPoint(8.75F, 5F, -8.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 787
		bodyModel[177].setRotationPoint(8.5F, 7.5F, -8.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.55F, 0F); // Box 788
		bodyModel[178].setRotationPoint(8.25F, 7.5F, -8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 830
		bodyModel[179].setRotationPoint(8.25F, 3.78F, -9.67F);
		bodyModel[179].rotateAngleX = 0.17453293F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F); // Box 831
		bodyModel[180].setRotationPoint(10F, 3F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.01F, -0.5F, -0.5F, -0.01F, -0.5F, -0.5F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0.25F, 0F, -0.01F, 0.25F, 0F); // Box 832
		bodyModel[181].setRotationPoint(-12F, 3F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 820
		bodyModel[182].setRotationPoint(-3.75F, 3F, -8.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		bodyModel[183].setRotationPoint(11F, 8.5F, -8.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 184
		bodyModel[184].setRotationPoint(11.5F, 5.5F, -8.75F);
	}
}