//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Thrall63FootCenterbeam
// Model Creator: Bidahochi
// Created on: 09.11.2021 - 10:12:37
// Last changed on: 09.11.2021 - 10:12:37

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.loads.*;
import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import cpw.mods.fml.common.Mod;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.library.Info;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Modelthrall63centerbeam extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Modelthrall63centerbeam() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[242];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 234, 145, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 234, 145, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 10, 148, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 67, 79, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 4, 159, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 15, 223, textureX, textureY, "cull"); // Box 66 cull spine
		bodyModel[8] = new ModelRendererTurbo(this, 107, 94, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 57, 94, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 42, 72, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 24, 111, textureX, textureY, "cull"); // Box 89 crossover cull
		bodyModel[12] = new ModelRendererTurbo(this, 65, 43, textureX, textureY); // Box 124
		bodyModel[13] = new ModelRendererTurbo(this, 71, 63, textureX, textureY); // Box 70
		bodyModel[14] = new ModelRendererTurbo(this, 88, 92, textureX, textureY); // Box 71
		bodyModel[15] = new ModelRendererTurbo(this, 42, 96, textureX, textureY); // Box 72
		bodyModel[16] = new ModelRendererTurbo(this, 5, 191, textureX, textureY); // Box 79
		bodyModel[17] = new ModelRendererTurbo(this, 88, 72, textureX, textureY); // Box 83
		bodyModel[18] = new ModelRendererTurbo(this, 88, 72, textureX, textureY); // Box 84
		bodyModel[19] = new ModelRendererTurbo(this, 52, 94, textureX, textureY); // Box 85
		bodyModel[20] = new ModelRendererTurbo(this, 52, 94, textureX, textureY); // Box 86
		bodyModel[21] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[22] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[23] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[24] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[25] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[26] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[27] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[28] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[29] = new ModelRendererTurbo(this, 6, 222, textureX, textureY); // Box 100
		bodyModel[30] = new ModelRendererTurbo(this, 204, 222, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[32] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[33] = new ModelRendererTurbo(this, 213, 222, textureX, textureY); // Box 100
		bodyModel[34] = new ModelRendererTurbo(this, 27, 128, textureX, textureY); // Box 334
		bodyModel[35] = new ModelRendererTurbo(this, 26, 137, textureX, textureY); // Box 335
		bodyModel[36] = new ModelRendererTurbo(this, 26, 144, textureX, textureY); // Box 336
		bodyModel[37] = new ModelRendererTurbo(this, 126, 95, textureX, textureY); // Box 337
		bodyModel[38] = new ModelRendererTurbo(this, 131, 95, textureX, textureY); // Box 338
		bodyModel[39] = new ModelRendererTurbo(this, 126, 92, textureX, textureY); // Box 339
		bodyModel[40] = new ModelRendererTurbo(this, 131, 92, textureX, textureY); // Box 340
		bodyModel[41] = new ModelRendererTurbo(this, 76, 92, textureX, textureY); // Box 341
		bodyModel[42] = new ModelRendererTurbo(this, 140, 103, textureX, textureY); // Box 342
		bodyModel[43] = new ModelRendererTurbo(this, 139, 101, textureX, textureY); // Box 343
		bodyModel[44] = new ModelRendererTurbo(this, 137, 95, textureX, textureY); // Box 344
		bodyModel[45] = new ModelRendererTurbo(this, 37, 107, textureX, textureY); // Box 345
		bodyModel[46] = new ModelRendererTurbo(this, 26, 116, textureX, textureY); // Box 346
		bodyModel[47] = new ModelRendererTurbo(this, 27, 140, textureX, textureY); // Box 347
		bodyModel[48] = new ModelRendererTurbo(this, 26, 125, textureX, textureY); // Box 348
		bodyModel[49] = new ModelRendererTurbo(this, 26, 132, textureX, textureY); // Box 349
		bodyModel[50] = new ModelRendererTurbo(this, 139, 101, textureX, textureY); // Box 350
		bodyModel[51] = new ModelRendererTurbo(this, 140, 103, textureX, textureY); // Box 351
		bodyModel[52] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 80
		bodyModel[53] = new ModelRendererTurbo(this, 2, 146, textureX, textureY); // Box 442
		bodyModel[54] = new ModelRendererTurbo(this, 226, 146, textureX, textureY); // Box 443
		bodyModel[55] = new ModelRendererTurbo(this, 42, 92, textureX, textureY); // Box 444
		bodyModel[56] = new ModelRendererTurbo(this, 51, 73, textureX, textureY); // Box 445
		bodyModel[57] = new ModelRendererTurbo(this, 34, 75, textureX, textureY); // Box 446
		bodyModel[58] = new ModelRendererTurbo(this, 39, 58, textureX, textureY); // Box 447
		bodyModel[59] = new ModelRendererTurbo(this, 27, 112, textureX, textureY); // Box 448
		bodyModel[60] = new ModelRendererTurbo(this, 10, 88, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 13, 99, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 14, 110, textureX, textureY); // Box 132
		bodyModel[64] = new ModelRendererTurbo(this, 1, 184, textureX, textureY); // Box 453
		bodyModel[65] = new ModelRendererTurbo(this, 11, 118, textureX, textureY); // Box 454 brake chain holder
		bodyModel[66] = new ModelRendererTurbo(this, 20, 103, textureX, textureY); // Box 455
		bodyModel[67] = new ModelRendererTurbo(this, 6, 105, textureX, textureY); // Box 456
		bodyModel[68] = new ModelRendererTurbo(this, 121, 95, textureX, textureY); // Box 457
		bodyModel[69] = new ModelRendererTurbo(this, 121, 92, textureX, textureY); // Box 458
		bodyModel[70] = new ModelRendererTurbo(this, 116, 95, textureX, textureY); // Box 459
		bodyModel[71] = new ModelRendererTurbo(this, 116, 92, textureX, textureY); // Box 460
		bodyModel[72] = new ModelRendererTurbo(this, 137, 95, textureX, textureY); // Box 461
		bodyModel[73] = new ModelRendererTurbo(this, 140, 96, textureX, textureY); // Box 462 kartrak my beloved
		bodyModel[74] = new ModelRendererTurbo(this, 10, 206, textureX, textureY); // Box 463
		bodyModel[75] = new ModelRendererTurbo(this, 10, 199, textureX, textureY); // Box 464
		bodyModel[76] = new ModelRendererTurbo(this, 9, 202, textureX, textureY); // Box 465
		bodyModel[77] = new ModelRendererTurbo(this, 142, 111, textureX, textureY, "cull"); // Box 89 crossover cull
		bodyModel[78] = new ModelRendererTurbo(this, 155, 107, textureX, textureY); // Box 467
		bodyModel[79] = new ModelRendererTurbo(this, 145, 112, textureX, textureY); // Box 468
		bodyModel[80] = new ModelRendererTurbo(this, 144, 116, textureX, textureY); // Box 469
		bodyModel[81] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 470
		bodyModel[82] = new ModelRendererTurbo(this, 2, 146, textureX, textureY); // Box 471
		bodyModel[83] = new ModelRendererTurbo(this, 140, 103, textureX, textureY); // Box 472
		bodyModel[84] = new ModelRendererTurbo(this, 139, 101, textureX, textureY); // Box 473
		bodyModel[85] = new ModelRendererTurbo(this, 140, 103, textureX, textureY); // Box 474
		bodyModel[86] = new ModelRendererTurbo(this, 139, 101, textureX, textureY); // Box 475
		bodyModel[87] = new ModelRendererTurbo(this, 244, 95, textureX, textureY); // Box 476
		bodyModel[88] = new ModelRendererTurbo(this, 249, 95, textureX, textureY); // Box 477
		bodyModel[89] = new ModelRendererTurbo(this, 249, 92, textureX, textureY); // Box 478
		bodyModel[90] = new ModelRendererTurbo(this, 244, 92, textureX, textureY); // Box 479
		bodyModel[91] = new ModelRendererTurbo(this, 137, 95, textureX, textureY); // Box 480
		bodyModel[92] = new ModelRendererTurbo(this, 140, 96, textureX, textureY); // Box 481 kartrak my beloved
		bodyModel[93] = new ModelRendererTurbo(this, 225, 94, textureX, textureY); // Box 482
		bodyModel[94] = new ModelRendererTurbo(this, 206, 92, textureX, textureY); // Box 483
		bodyModel[95] = new ModelRendererTurbo(this, 189, 63, textureX, textureY); // Box 484
		bodyModel[96] = new ModelRendererTurbo(this, 160, 72, textureX, textureY); // Box 485
		bodyModel[97] = new ModelRendererTurbo(this, 175, 94, textureX, textureY); // Box 486
		bodyModel[98] = new ModelRendererTurbo(this, 194, 92, textureX, textureY); // Box 487
		bodyModel[99] = new ModelRendererTurbo(this, 239, 92, textureX, textureY); // Box 488
		bodyModel[100] = new ModelRendererTurbo(this, 239, 95, textureX, textureY); // Box 489
		bodyModel[101] = new ModelRendererTurbo(this, 234, 92, textureX, textureY); // Box 490
		bodyModel[102] = new ModelRendererTurbo(this, 234, 95, textureX, textureY); // Box 491
		bodyModel[103] = new ModelRendererTurbo(this, 137, 95, textureX, textureY); // Box 492
		bodyModel[104] = new ModelRendererTurbo(this, 185, 79, textureX, textureY); // Box 493
		bodyModel[105] = new ModelRendererTurbo(this, 183, 43, textureX, textureY); // Box 494
		bodyModel[106] = new ModelRendererTurbo(this, 160, 96, textureX, textureY); // Box 495
		bodyModel[107] = new ModelRendererTurbo(this, 206, 72, textureX, textureY); // Box 496
		bodyModel[108] = new ModelRendererTurbo(this, 206, 72, textureX, textureY); // Box 497
		bodyModel[109] = new ModelRendererTurbo(this, 170, 94, textureX, textureY); // Box 498
		bodyModel[110] = new ModelRendererTurbo(this, 170, 94, textureX, textureY); // Box 499
		bodyModel[111] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 500
		bodyModel[112] = new ModelRendererTurbo(this, 152, 75, textureX, textureY); // Box 501
		bodyModel[113] = new ModelRendererTurbo(this, 157, 58, textureX, textureY); // Box 502
		bodyModel[114] = new ModelRendererTurbo(this, 160, 92, textureX, textureY); // Box 503
		bodyModel[115] = new ModelRendererTurbo(this, 6, 212, textureX, textureY); // Box 506
		bodyModel[116] = new ModelRendererTurbo(this, 6, 217, textureX, textureY); // Box 507
		bodyModel[117] = new ModelRendererTurbo(this, 186, 217, textureX, textureY); // Box 508
		bodyModel[118] = new ModelRendererTurbo(this, 186, 212, textureX, textureY); // Box 509
		bodyModel[119] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 511
		bodyModel[120] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 512
		bodyModel[121] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 519
		bodyModel[122] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 521
		bodyModel[123] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 523
		bodyModel[124] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 524
		bodyModel[125] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 531
		bodyModel[126] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 532
		bodyModel[127] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[128] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[129] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[130] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[131] = new ModelRendererTurbo(this, 232, 136, textureX, textureY); // Box 666
		bodyModel[132] = new ModelRendererTurbo(this, 232, 136, textureX, textureY); // Box 667
		bodyModel[133] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 688
		bodyModel[134] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 689
		bodyModel[135] = new ModelRendererTurbo(this, 68, 56, textureX, textureY); // Box 80
		bodyModel[136] = new ModelRendererTurbo(this, 171, 56, textureX, textureY); // Box 693
		bodyModel[137] = new ModelRendererTurbo(this, 186, 56, textureX, textureY); // Box 694
		bodyModel[138] = new ModelRendererTurbo(this, 53, 56, textureX, textureY); // Box 695
		bodyModel[139] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 696
		bodyModel[140] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 697
		bodyModel[141] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 698
		bodyModel[142] = new ModelRendererTurbo(this, 123, 85, textureX, textureY); // Box 699
		bodyModel[143] = new ModelRendererTurbo(this, 128, 81, textureX, textureY); // Box 700
		bodyModel[144] = new ModelRendererTurbo(this, 128, 81, textureX, textureY); // Box 701
		bodyModel[145] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 286
		bodyModel[146] = new ModelRendererTurbo(this, 17, 70, textureX, textureY); // Box 287
		bodyModel[147] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 302
		bodyModel[148] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 712
		bodyModel[149] = new ModelRendererTurbo(this, 26, 80, textureX, textureY); // Box 130
		bodyModel[150] = new ModelRendererTurbo(this, 15, 61, textureX, textureY); // Box 118
		bodyModel[151] = new ModelRendererTurbo(this, 26, 61, textureX, textureY); // Box 119
		bodyModel[152] = new ModelRendererTurbo(this, 20, 56, textureX, textureY); // Box 129
		bodyModel[153] = new ModelRendererTurbo(this, -3, 79, textureX, textureY); // Box 196
		bodyModel[154] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 199
		bodyModel[155] = new ModelRendererTurbo(this, -2, 83, textureX, textureY); // Box 122
		bodyModel[156] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 126
		bodyModel[157] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 723
		bodyModel[158] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Box 724
		bodyModel[159] = new ModelRendererTurbo(this, 1, 182, textureX, textureY); // Box 725
		bodyModel[160] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 726
		bodyModel[161] = new ModelRendererTurbo(this, 6, 82, textureX, textureY); // Box 727
		bodyModel[162] = new ModelRendererTurbo(this, -8, 71, textureX, textureY); // Box 124
		bodyModel[163] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 730
		bodyModel[164] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Box 731
		bodyModel[165] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 732
		bodyModel[166] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 733
		bodyModel[167] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 734
		bodyModel[168] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 735
		bodyModel[169] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 736
		bodyModel[170] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 737
		bodyModel[171] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 738
		bodyModel[172] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 739
		bodyModel[173] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 740
		bodyModel[174] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 741
		bodyModel[175] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 742
		bodyModel[176] = new ModelRendererTurbo(this, 211, 168, textureX, textureY); // Box 743
		bodyModel[177] = new ModelRendererTurbo(this, 233, 168, textureX, textureY); // Box 744
		bodyModel[178] = new ModelRendererTurbo(this, 233, 168, textureX, textureY); // Box 745
		bodyModel[179] = new ModelRendererTurbo(this, 235, 151, textureX, textureY); // Box 746
		bodyModel[180] = new ModelRendererTurbo(this, 232, 136, textureX, textureY); // Box 747
		bodyModel[181] = new ModelRendererTurbo(this, 232, 136, textureX, textureY); // Box 748
		bodyModel[182] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 749
		bodyModel[183] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 750
		bodyModel[184] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 751
		bodyModel[185] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 752
		bodyModel[186] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 753
		bodyModel[187] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 754
		bodyModel[188] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 755
		bodyModel[189] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 756
		bodyModel[190] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 757
		bodyModel[191] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 758
		bodyModel[192] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 759
		bodyModel[193] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 760
		bodyModel[194] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 761
		bodyModel[195] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 762
		bodyModel[196] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 763
		bodyModel[197] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 764
		bodyModel[198] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 765
		bodyModel[199] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 766
		bodyModel[200] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 767
		bodyModel[201] = new ModelRendererTurbo(this, 234, 127, textureX, textureY); // Box 768
		bodyModel[202] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[203] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[204] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[205] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[206] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[207] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[208] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[209] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[210] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[211] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[212] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[213] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[214] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[215] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[216] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[217] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[218] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[219] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[220] = new ModelRendererTurbo(this, 128, 78, textureX, textureY); // Box 533
		bodyModel[221] = new ModelRendererTurbo(this, 135, 77, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[222] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[223] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[224] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[225] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[226] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[227] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[228] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[229] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[230] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[231] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[232] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[233] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[234] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[235] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[236] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[237] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[238] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[239] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull
		bodyModel[240] = new ModelRendererTurbo(this, 128, 74, textureX, textureY); // Box 533
		bodyModel[241] = new ModelRendererTurbo(this, 135, 73, textureX, textureY, "cull"); // Box 534 cull

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-55.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(52.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-38F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(34F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 105, 2, 5, 0F); // Box 13
		bodyModel[4].setRotationPoint(-52.5F, 3F, -2.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 24, 18, 0F); // Box 17
		bodyModel[5].setRotationPoint(-47.5F, -22F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 93, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[6].setRotationPoint(-46.5F, 2F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 93, 26, 1, 0F); // Box 66 cull spine
		bodyModel[7].setRotationPoint(-46.5F, -23F, -0.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // Box 67
		bodyModel[8].setRotationPoint(-49.5F, -23F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // Box 68
		bodyModel[9].setRotationPoint(-49.5F, -23F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 73
		bodyModel[10].setRotationPoint(-49.5F, -23F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 89 crossover cull
		bodyModel[11].setRotationPoint(-52.5F, 1F, -5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 124
		bodyModel[12].setRotationPoint(-49.5F, 2F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[13].setRotationPoint(-49.5F, -24F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[14].setRotationPoint(-49.5F, -24F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 23, 2, 0F); // Box 72
		bodyModel[15].setRotationPoint(-49.5F, -21F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 98, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[16].setRotationPoint(-49F, -24F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 83
		bodyModel[17].setRotationPoint(-49.25F, -5F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 84
		bodyModel[18].setRotationPoint(-49.25F, -16F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 85
		bodyModel[19].setRotationPoint(-48.25F, -22F, 5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 86
		bodyModel[20].setRotationPoint(-48.25F, -22F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[21].setRotationPoint(-40.5F, -23F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[22].setRotationPoint(-36.5F, -23F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[23].setRotationPoint(-32.5F, -23F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[24].setRotationPoint(31.5F, -23F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[25].setRotationPoint(35.5F, -23F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[26].setRotationPoint(39.5F, -23F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[27].setRotationPoint(-24.5F, -23F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[28].setRotationPoint(-16.5F, -23F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[29].setRotationPoint(-8.5F, -23F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[30].setRotationPoint(-0.5F, -23F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[31].setRotationPoint(7.5F, -23F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[32].setRotationPoint(15.5F, -23F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 25, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[33].setRotationPoint(23.5F, -23F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 97, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 334
		bodyModel[34].setRotationPoint(-48.5F, 3F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[35].setRotationPoint(-49F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[36].setRotationPoint(-49F, 4F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[37].setRotationPoint(-49.5F, -22F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 338
		bodyModel[38].setRotationPoint(-47.5F, -21F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[39].setRotationPoint(-49.5F, -23F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 340
		bodyModel[40].setRotationPoint(-47.5F, -22F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[41].setRotationPoint(-49.5F, -24F, 7F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 342
		bodyModel[42].setRotationPoint(-49F, 5F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 343
		bodyModel[43].setRotationPoint(-49F, 3.75F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 344
		bodyModel[44].setRotationPoint(-48F, -5F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 345
		bodyModel[45].setRotationPoint(-49.5F, 3F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 346
		bodyModel[46].setRotationPoint(-49.5F, 3F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 97, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[47].setRotationPoint(-48.5F, 3F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[48].setRotationPoint(-49F, 2F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 98, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[49].setRotationPoint(-49F, 4F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[50].setRotationPoint(-49F, 3.75F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 351
		bodyModel[51].setRotationPoint(-49F, 5F, 11F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[52].setRotationPoint(-54.5F, 4.5F, 0F);
		bodyModel[52].rotateAngleY = 1.04719755F;
		bodyModel[52].rotateAngleZ = 0.05235988F;

		bodyModel[53].addBox(9F, 0F, 0F, 1, 3, 0, 0F); // Box 442
		bodyModel[53].setRotationPoint(-54.5F, 4.5F, 0F);
		bodyModel[53].rotateAngleY = 1.04719755F;
		bodyModel[53].rotateAngleZ = 0.05235988F;

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 443
		bodyModel[54].setRotationPoint(-52.5F, 5F, -2.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[55].setRotationPoint(-49.5F, -22F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 12, 4, 0F); // Box 445
		bodyModel[56].setRotationPoint(-49.51F, -8F, -10F);

		bodyModel[57].addBox(-1F, 1F, 0F, 1, 0, 14, 0F); // Box 446
		bodyModel[57].setRotationPoint(-49.5F, -8.5F, -7F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 27, 4, 0F); // Box 447
		bodyModel[58].setRotationPoint(-49.51F, -23F, 6F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 448
		bodyModel[59].setRotationPoint(-49.5F, 5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[60].setRotationPoint(-51.51F, -5.5F, 2F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[61].setRotationPoint(-51.5F, -4F, 3.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[62].setRotationPoint(-50.5F, -5.5F, 2.5F);

		bodyModel[63].addBox(-1F, 0F, 0F, 1, 7, 0, 0F); // Box 132
		bodyModel[63].setRotationPoint(-49.5F, -2F, 4F);
		bodyModel[63].rotateAngleZ = -0.03490659F;

		bodyModel[64].addBox(-0.5F, -0.5F, 0F, 46, 1, 0, 0F); // Box 453
		bodyModel[64].setRotationPoint(-50F, 5F, 4F);
		bodyModel[64].rotateAngleY = 0.03490659F;
		bodyModel[64].rotateAngleZ = -0.00436332F;

		bodyModel[65].addBox(-0.5F, -0.5F, 0F, 4, 2, 0, 0F); // Box 454 brake chain holder
		bodyModel[65].setRotationPoint(-50F, 4F, 4.01F);
		bodyModel[65].rotateAngleZ = 0.55850536F;

		bodyModel[66].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 455
		bodyModel[66].setRotationPoint(-49.51F, -5.5F, 0.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 456
		bodyModel[67].setRotationPoint(-49.5F, -5.5F, 5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[68].setRotationPoint(-49.5F, -22F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[69].setRotationPoint(-49.5F, -23F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 459
		bodyModel[70].setRotationPoint(-47.5F, -21F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 460
		bodyModel[71].setRotationPoint(-47.5F, -22F, 10F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 461
		bodyModel[72].setRotationPoint(-48F, -5F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 462 kartrak my beloved
		bodyModel[73].setRotationPoint(-46.5F, -9.5F, 11F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 463
		bodyModel[74].setRotationPoint(-49F, -24F, -4F);

		bodyModel[75].addBox(0F, 0F, 0F, 98, 1, 1, 0F); // Box 464
		bodyModel[75].setRotationPoint(-49F, -24F, 3F);

		bodyModel[76].addBox(0F, 0F, 0F, 98, 1, 2, 0F); // Box 465
		bodyModel[76].setRotationPoint(-49F, -24F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 89 crossover cull
		bodyModel[77].setRotationPoint(49.5F, 1F, -5.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 467
		bodyModel[78].setRotationPoint(48.5F, 3F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 468
		bodyModel[79].setRotationPoint(48.5F, 5F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 469
		bodyModel[80].setRotationPoint(48.5F, 3F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Box 470
		bodyModel[81].setRotationPoint(54.5F, 4.5F, 0F);
		bodyModel[81].rotateAngleY = 4.1887902F;
		bodyModel[81].rotateAngleZ = 0.05235988F;

		bodyModel[82].addBox(9F, 0F, 0F, 1, 3, 0, 0F); // Box 471
		bodyModel[82].setRotationPoint(54.5F, 4.5F, 0F);
		bodyModel[82].rotateAngleY = 4.1887902F;
		bodyModel[82].rotateAngleZ = 0.05235988F;

		bodyModel[83].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 472
		bodyModel[83].setRotationPoint(45F, 5F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 473
		bodyModel[84].setRotationPoint(45F, 3.75F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 474
		bodyModel[85].setRotationPoint(45F, 5F, 11F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 475
		bodyModel[86].setRotationPoint(45F, 3.75F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 476
		bodyModel[87].setRotationPoint(48.5F, -22F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[88].setRotationPoint(46.5F, -21F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[89].setRotationPoint(46.5F, -22F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 479
		bodyModel[90].setRotationPoint(48.5F, -23F, 10F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 480
		bodyModel[91].setRotationPoint(48F, -5F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 481 kartrak my beloved
		bodyModel[92].setRotationPoint(45.5F, -9.5F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // Box 482
		bodyModel[93].setRotationPoint(46.5F, -23F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 483
		bodyModel[94].setRotationPoint(48.5F, -24F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 484
		bodyModel[95].setRotationPoint(48.5F, -24F, -7F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 485
		bodyModel[96].setRotationPoint(46.5F, -23F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 26, 1, 0F); // Box 486
		bodyModel[97].setRotationPoint(46.5F, -23F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 487
		bodyModel[98].setRotationPoint(48.5F, -24F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 488
		bodyModel[99].setRotationPoint(48.5F, -23F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 489
		bodyModel[100].setRotationPoint(48.5F, -22F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[101].setRotationPoint(46.5F, -22F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[102].setRotationPoint(46.5F, -21F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 492
		bodyModel[103].setRotationPoint(48F, -5F, -11F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 24, 18, 0F); // Box 493
		bodyModel[104].setRotationPoint(46.5F, -22F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 494
		bodyModel[105].setRotationPoint(46.5F, 2F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 23, 2, 0F); // Box 495
		bodyModel[106].setRotationPoint(47.5F, -21F, -1F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 496
		bodyModel[107].setRotationPoint(48.25F, -5F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 497
		bodyModel[108].setRotationPoint(48.25F, -16F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 498
		bodyModel[109].setRotationPoint(47.25F, -22F, 5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 24, 1, 0F); // Box 499
		bodyModel[110].setRotationPoint(47.25F, -22F, -6F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 12, 4, 0F); // Box 500
		bodyModel[111].setRotationPoint(49.51F, -8F, 6F);

		bodyModel[112].addBox(-1F, 1F, 0F, 1, 0, 14, 0F); // Box 501
		bodyModel[112].setRotationPoint(50.5F, -8.5F, -7F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 27, 4, 0F); // Box 502
		bodyModel[113].setRotationPoint(49.51F, -23F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[114].setRotationPoint(47.5F, -22F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 506
		bodyModel[115].setRotationPoint(-46.5F, -16F, -1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 507
		bodyModel[116].setRotationPoint(-46.5F, -5F, -1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 508
		bodyModel[117].setRotationPoint(32.5F, -5F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 509
		bodyModel[118].setRotationPoint(32.5F, -16F, -1.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 511
		bodyModel[119].setRotationPoint(-40.5F, 2F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 512
		bodyModel[120].setRotationPoint(-32.5F, 2F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 519
		bodyModel[121].setRotationPoint(31.5F, 2F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 521
		bodyModel[122].setRotationPoint(39.5F, 2F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 523
		bodyModel[123].setRotationPoint(39.5F, 2F, 1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 524
		bodyModel[124].setRotationPoint(31.5F, 2F, 1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 531
		bodyModel[125].setRotationPoint(-32.5F, 2F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		bodyModel[126].setRotationPoint(-40.5F, 2F, 1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[127].setRotationPoint(-41F, 3.25F, -11.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[128].setRotationPoint(-40.5F, 3.25F, -11.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[129].setRotationPoint(-41F, 3.25F, 10.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[130].setRotationPoint(-40.5F, 3.25F, 9.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 666
		bodyModel[131].setRotationPoint(-37.5F, 3F, -9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[132].setRotationPoint(-37.5F, 3F, 2.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 688
		bodyModel[133].setRotationPoint(39.5F, 3F, -9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[134].setRotationPoint(39.5F, 3F, 2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 80
		bodyModel[135].setRotationPoint(-38F, 3F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 693
		bodyModel[136].setRotationPoint(-38F, 3F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 694
		bodyModel[137].setRotationPoint(34F, 3F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 695
		bodyModel[138].setRotationPoint(34F, 3F, 10F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 696
		bodyModel[139].setRotationPoint(-40F, 5F, 11F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 697
		bodyModel[140].setRotationPoint(-40F, 5F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 698
		bodyModel[141].setRotationPoint(38F, 5F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 699
		bodyModel[142].setRotationPoint(38F, 5F, 11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 700
		bodyModel[143].setRotationPoint(-17F, 2.5F, 11.01F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 701
		bodyModel[144].setRotationPoint(17F, 2.5F, -11.01F);

		bodyModel[145].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 286
		bodyModel[145].setRotationPoint(12F, 5.5F, -9F);
		bodyModel[145].rotateAngleZ = 0.78539816F;

		bodyModel[146].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 287
		bodyModel[146].setRotationPoint(12F, 5.5F, -6F);
		bodyModel[146].rotateAngleZ = 0.78539816F;

		bodyModel[147].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 302
		bodyModel[147].setRotationPoint(11F, 3F, -9.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 712
		bodyModel[148].setRotationPoint(11F, 3F, -3.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 130
		bodyModel[149].setRotationPoint(2.5F, 3F, -9F);

		bodyModel[150].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[150].setRotationPoint(3F, 5F, 3.5F);
		bodyModel[150].rotateAngleX = -0.78539816F;

		bodyModel[151].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[151].setRotationPoint(1F, 5F, 3.5F);
		bodyModel[151].rotateAngleX = -0.78539816F;

		bodyModel[152].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[152].setRotationPoint(2.5F, 3F, 2.5F);

		bodyModel[153].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[153].setRotationPoint(-2F, 5.26F, 0F);
		bodyModel[153].rotateAngleY = -0.17453293F;

		bodyModel[154].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[154].setRotationPoint(-2F, 5.25F, 0F);
		bodyModel[154].rotateAngleY = -0.17453293F;

		bodyModel[155].addBox(-0.5F, 0F, 0F, 1, 0, 4, 0F); // Box 122
		bodyModel[155].setRotationPoint(-6F, 5.26F, 2F);
		bodyModel[155].rotateAngleY = -0.33161256F;

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[156].setRotationPoint(-4F, 4.5F, 1.25F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 723
		bodyModel[157].setRotationPoint(-4F, 4.5F, -2.25F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 724
		bodyModel[158].setRotationPoint(-7F, 4.5F, 1.25F);

		bodyModel[159].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 725
		bodyModel[159].setRotationPoint(-6F, 4.5F, 3.5F);

		bodyModel[160].addBox(-0.5F, -0.5F, 0F, 34, 1, 0, 0F); // Box 726
		bodyModel[160].setRotationPoint(-3F, 5F, -4F);
		bodyModel[160].rotateAngleY = 3.0368729F;
		bodyModel[160].rotateAngleZ = -0.05235988F;

		bodyModel[161].addBox(-0.5F, 0F, -1F, 1, 0, 5, 0F); // Box 727
		bodyModel[161].setRotationPoint(14F, 5.26F, -1F);
		bodyModel[161].rotateAngleY = -0.17453293F;

		bodyModel[162].addBox(-0.5F, 0F, 0F, 1, 0, 16, 0F); // Box 124
		bodyModel[162].setRotationPoint(-1.75F, 5.26F, 0.5F);
		bodyModel[162].rotateAngleY = -1.57079633F;

		bodyModel[163].addBox(-0.5F, -0.5F, 0F, 22, 1, 0, 0F); // Box 730
		bodyModel[163].setRotationPoint(15F, 5F, 3F);
		bodyModel[163].rotateAngleY = -0.10471976F;
		bodyModel[163].rotateAngleZ = -0.08726646F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[164].setRotationPoint(13F, 4.5F, -2.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 732
		bodyModel[165].setRotationPoint(-16.5F, 2F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 733
		bodyModel[166].setRotationPoint(-24.5F, 2F, -10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 734
		bodyModel[167].setRotationPoint(-24.5F, 2F, 1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 735
		bodyModel[168].setRotationPoint(-16.5F, 2F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 736
		bodyModel[169].setRotationPoint(-8.5F, 2F, 1F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 737
		bodyModel[170].setRotationPoint(-8.5F, 2F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 738
		bodyModel[171].setRotationPoint(15.5F, 2F, -10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 739
		bodyModel[172].setRotationPoint(23.5F, 2F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 740
		bodyModel[173].setRotationPoint(15.5F, 2F, 1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 741
		bodyModel[174].setRotationPoint(23.5F, 2F, 1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 742
		bodyModel[175].setRotationPoint(7.5F, 2F, 1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 743
		bodyModel[176].setRotationPoint(7.5F, 2F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 744
		bodyModel[177].setRotationPoint(-0.5F, 2F, 1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 745
		bodyModel[178].setRotationPoint(-0.5F, 2F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 746
		bodyModel[179].setRotationPoint(51.5F, 5F, -2.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 747
		bodyModel[180].setRotationPoint(34.5F, 3F, -9.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[181].setRotationPoint(34.5F, 3F, 2.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 749
		bodyModel[182].setRotationPoint(31.5F, 3F, -9.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[183].setRotationPoint(31.5F, 3F, 2.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 751
		bodyModel[184].setRotationPoint(23.5F, 3F, -9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		bodyModel[185].setRotationPoint(23.5F, 3F, 2.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 753
		bodyModel[186].setRotationPoint(15.5F, 3F, -9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[187].setRotationPoint(15.5F, 3F, 2.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 755
		bodyModel[188].setRotationPoint(7.5F, 3F, -9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[189].setRotationPoint(7.5F, 3F, 2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 757
		bodyModel[190].setRotationPoint(-0.5F, 3F, -9.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		bodyModel[191].setRotationPoint(-0.5F, 3F, 2.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 759
		bodyModel[192].setRotationPoint(-8.5F, 3F, -9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[193].setRotationPoint(-8.5F, 3F, 2.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 761
		bodyModel[194].setRotationPoint(-16.5F, 3F, -9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[195].setRotationPoint(-16.5F, 3F, 2.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 763
		bodyModel[196].setRotationPoint(-24.5F, 3F, -9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		bodyModel[197].setRotationPoint(-24.5F, 3F, 2.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 765
		bodyModel[198].setRotationPoint(-32.5F, 3F, -9.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[199].setRotationPoint(-32.5F, 3F, 2.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 767
		bodyModel[200].setRotationPoint(-40.5F, 3F, -9.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[201].setRotationPoint(-40.5F, 3F, 2.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[202].setRotationPoint(-33F, 3.25F, -11.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[203].setRotationPoint(-32.5F, 3.25F, -11.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[204].setRotationPoint(-25F, 3.25F, -11.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[205].setRotationPoint(-24.5F, 3.25F, -11.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[206].setRotationPoint(-17F, 3.25F, -11.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[207].setRotationPoint(-16.5F, 3.25F, -11.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[208].setRotationPoint(-9F, 3.25F, -11.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[209].setRotationPoint(-8.5F, 3.25F, -11.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[210].setRotationPoint(-1F, 3.25F, -11.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[211].setRotationPoint(-0.5F, 3.25F, -11.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[212].setRotationPoint(7F, 3.25F, -11.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[213].setRotationPoint(7.5F, 3.25F, -11.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[214].setRotationPoint(15F, 3.25F, -11.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[215].setRotationPoint(15.5F, 3.25F, -11.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[216].setRotationPoint(23F, 3.25F, -11.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[217].setRotationPoint(23.5F, 3.25F, -11.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[218].setRotationPoint(31F, 3.25F, -11.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[219].setRotationPoint(31.5F, 3.25F, -11.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[220].setRotationPoint(39F, 3.25F, -11.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[221].setRotationPoint(39.5F, 3.25F, -11.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[222].setRotationPoint(-33F, 3.25F, 10.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[223].setRotationPoint(-32.5F, 3.25F, 9.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[224].setRotationPoint(-25F, 3.25F, 10.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[225].setRotationPoint(-24.5F, 3.25F, 9.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[226].setRotationPoint(-17F, 3.25F, 10.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[227].setRotationPoint(-16.5F, 3.25F, 9.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[228].setRotationPoint(-9F, 3.25F, 10.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[229].setRotationPoint(-8.5F, 3.25F, 9.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[230].setRotationPoint(-1F, 3.25F, 10.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[231].setRotationPoint(-0.5F, 3.25F, 9.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[232].setRotationPoint(7F, 3.25F, 10.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[233].setRotationPoint(7.5F, 3.25F, 9.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[234].setRotationPoint(15F, 3.25F, 10.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[235].setRotationPoint(15.5F, 3.25F, 9.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[236].setRotationPoint(23F, 3.25F, 10.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[237].setRotationPoint(23.5F, 3.25F, 9.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[238].setRotationPoint(31F, 3.25F, 10.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[239].setRotationPoint(31.5F, 3.25F, 9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 533
		bodyModel[240].setRotationPoint(39F, 3.25F, 10.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 534 cull
		bodyModel[241].setRotationPoint(39.5F, 3.25F, 9.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	//Modelthrall63tiedownsA tiedownsA = new Modelthrall63tiedownsA();
	//Modelthrall63tiedownsB tiedownsB = new Modelthrall63tiedownsB();
	//Modelthrall63tiedownsLoaded tiedownsL = new Modelthrall63tiedownsLoaded();
	//Modelwrappedwood load1 = new Modelwrappedwood();
	//ModelWrappedWoodDeluxe1 wood1 = new ModelWrappedWoodDeluxe1();
	//ModelWrappedWoodDeluxe5 wood5 = new ModelWrappedWoodDeluxe5();

	/*List<String> planks = Arrays.asList(new String[]{
			"tile.wood.oak","tile.wood.spruce",
			"tile.wood.birch","tile.wood.jungle",
			"tile.wood.acacia","tile.wood.big_oak",
			"tile.widePlank3_", "tile.widePlank2_",
			"tile.widePlank_", "tile.logs3.redwoodWood"});*/


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		for(int i = 0; i < 242; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==324){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.25,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(4.5,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}
}