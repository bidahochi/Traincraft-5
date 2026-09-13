//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.05.2023 - 00:50:36
// Last changed on: 22.05.2023 - 00:50:36

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.client.renderhelper.ModelRenderHelper;
import train.common.enums.BoxName;

import java.util.ArrayList;

public class Modelmk60 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelmk60() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[606];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 102, 17, textureX, textureY); // Box 592
		bodyModel[1] = new ModelRendererTurbo(this, 95, 17, textureX, textureY); // Box 591
		bodyModel[2] = new ModelRendererTurbo(this, 99, 172, textureX, textureY); // Box 86 cs
		bodyModel[3] = new ModelRendererTurbo(this, 89, 173, textureX, textureY); // dieselcontrolstand
		bodyModel[4] = new ModelRendererTurbo(this, 10, 188, textureX, textureY); // Box 588
		bodyModel[5] = new ModelRendererTurbo(this, 10, 180, textureX, textureY); // Box 587
		bodyModel[6] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 586
		bodyModel[7] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 585
		bodyModel[8] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 584
		bodyModel[9] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 583
		bodyModel[10] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 582
		bodyModel[11] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 172, 172, textureX, textureY); // Box 585
		bodyModel[13] = new ModelRendererTurbo(this, 179, 172, textureX, textureY); // Box 584
		bodyModel[14] = new ModelRendererTurbo(this, 186, 172, textureX, textureY); // Box 583
		bodyModel[15] = new ModelRendererTurbo(this, 193, 172, textureX, textureY); // Box 582
		bodyModel[16] = new ModelRendererTurbo(this, 200, 171, textureX, textureY); // Box 581
		bodyModel[17] = new ModelRendererTurbo(this, 340, 216, textureX, textureY, "cull"); // Box 355 cull
		bodyModel[18] = new ModelRendererTurbo(this, 355, 215, textureX, textureY, "cull"); // Box 354 cull
		bodyModel[19] = new ModelRendererTurbo(this, 351, 225, textureX, textureY); // Box 627
		bodyModel[20] = new ModelRendererTurbo(this, 337, 221, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_20"); // Box 626 numberboard
		bodyModel[21] = new ModelRendererTurbo(this, 352, 221, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_21"); // Box 625 numerbboard
		bodyModel[22] = new ModelRendererTurbo(this, 336, 225, textureX, textureY); // Box 623
		bodyModel[23] = new ModelRendererTurbo(this, 241, 232, textureX, textureY); // Box 576
		bodyModel[24] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 575
		bodyModel[25] = new ModelRendererTurbo(this, 264, 142, textureX, textureY); // Box 574
		bodyModel[26] = new ModelRendererTurbo(this, 385, 230, textureX, textureY); // Box 572
		bodyModel[27] = new ModelRendererTurbo(this, 385, 230, textureX, textureY); // Box 571
		bodyModel[28] = new ModelRendererTurbo(this, 385, 230, textureX, textureY); // Box 283
		bodyModel[29] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 569
		bodyModel[30] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 568
		bodyModel[31] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 581
		bodyModel[32] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 580
		bodyModel[33] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 579
		bodyModel[34] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 578
		bodyModel[35] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 577
		bodyModel[36] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 576
		bodyModel[37] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // this is an example for wastey
		bodyModel[38] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 574
		bodyModel[39] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 573
		bodyModel[40] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 572
		bodyModel[41] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 571
		bodyModel[42] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 570
		bodyModel[43] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 569
		bodyModel[44] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 568
		bodyModel[45] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 567
		bodyModel[46] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 566
		bodyModel[47] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 565
		bodyModel[48] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 564
		bodyModel[49] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 563
		bodyModel[50] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 562
		bodyModel[51] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 561
		bodyModel[52] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 560
		bodyModel[53] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 559
		bodyModel[54] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 558
		bodyModel[55] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 574
		bodyModel[56] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 573
		bodyModel[57] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 572
		bodyModel[58] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 190
		bodyModel[59] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 189
		bodyModel[60] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 188
		bodyModel[61] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 187
		bodyModel[62] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 186
		bodyModel[63] = new ModelRendererTurbo(this, 1, 201, textureX, textureY, "cull"); // Box 581 cull
		bodyModel[64] = new ModelRendererTurbo(this, 409, 193, textureX, textureY, "cull"); // Box 519 cull
		bodyModel[65] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 563
		bodyModel[66] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // when she boost on my er till i steam locomotive subclass
		bodyModel[67] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 562
		bodyModel[68] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 560
		bodyModel[69] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 558
		bodyModel[70] = new ModelRendererTurbo(this, 353, 193, textureX, textureY, "marker").setLightFixtureId("marker_body_70"); // Box 595 glow marker
		bodyModel[71] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 594
		bodyModel[72] = new ModelRendererTurbo(this, 345, 193, textureX, textureY, "marker").setLightFixtureId("marker_body_72"); // Box 410 glow marker
		bodyModel[73] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 589
		bodyModel[74] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 583
		bodyModel[75] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 577
		bodyModel[76] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 576
		bodyModel[77] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 575
		bodyModel[78] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 574
		bodyModel[79] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 573
		bodyModel[80] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 572
		bodyModel[81] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 571
		bodyModel[82] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 570
		bodyModel[83] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 569
		bodyModel[84] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 568
		bodyModel[85] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 567
		bodyModel[86] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 566
		bodyModel[87] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 555
		bodyModel[88] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 182
		bodyModel[89] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 178
		bodyModel[90] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 597
		bodyModel[91] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 596
		bodyModel[92] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 595
		bodyModel[93] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 594
		bodyModel[94] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 755
		bodyModel[95] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 754
		bodyModel[96] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[97] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[98] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[99] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[100] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[101] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[102] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 592
		bodyModel[103] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 591
		bodyModel[104] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 590 
		bodyModel[105] = new ModelRendererTurbo(this, 49, 169, textureX, textureY, "cull"); // Box cull
		bodyModel[106] = new ModelRendererTurbo(this, 33, 169, textureX, textureY, "cull"); // Box cull
		bodyModel[107] = new ModelRendererTurbo(this, 9, 169, textureX, textureY, "cull"); // Box cull
		bodyModel[108] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 593
		bodyModel[109] = new ModelRendererTurbo(this, 51, 229, textureX, textureY); // Box 592
		bodyModel[110] = new ModelRendererTurbo(this, 51, 229, textureX, textureY); // Box 591
		bodyModel[111] = new ModelRendererTurbo(this, 98, 229, textureX, textureY); // Box 590
		bodyModel[112] = new ModelRendererTurbo(this, 98, 229, textureX, textureY); // Box 589
		bodyModel[113] = new ModelRendererTurbo(this, 51, 229, textureX, textureY); // Box 588
		bodyModel[114] = new ModelRendererTurbo(this, 51, 229, textureX, textureY); // Box 587
		bodyModel[115] = new ModelRendererTurbo(this, 5, 229, textureX, textureY); // Box 586
		bodyModel[116] = new ModelRendererTurbo(this, 474, 172, textureX, textureY, "cull"); // Box 586 CULL
		bodyModel[117] = new ModelRendererTurbo(this, 473, 161, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_117"); // Box 585 numberboard glow
		bodyModel[118] = new ModelRendererTurbo(this, 457, 161, textureX, textureY, "numberboard").setLightFixtureId("numberboard_body_118"); // Box 584 numberboard glow
		bodyModel[119] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 584
		bodyModel[120] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 583
		bodyModel[121] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 605
		bodyModel[122] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 604
		bodyModel[123] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 603
		bodyModel[124] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 602
		bodyModel[125] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 601
		bodyModel[126] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 600
		bodyModel[127] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 599
		bodyModel[128] = new ModelRendererTurbo(this, 345, 161, textureX, textureY, "cull"); // Box 598 cull
		bodyModel[129] = new ModelRendererTurbo(this, 329, 161, textureX, textureY, "cull"); // Box 597 cull ???
		bodyModel[130] = new ModelRendererTurbo(this, 297, 161, textureX, textureY, "cull"); // Box 596 cull
		bodyModel[131] = new ModelRendererTurbo(this, 281, 161, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[132] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 594
		bodyModel[133] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 279
		bodyModel[134] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 280
		bodyModel[135] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 614
		bodyModel[136] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 613
		bodyModel[137] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 359
		bodyModel[138] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 190
		bodyModel[139] = new ModelRendererTurbo(this, 162, 161, textureX, textureY, "cull"); // Box 478 cull
		bodyModel[140] = new ModelRendererTurbo(this, 162, 165, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[141] = new ModelRendererTurbo(this, 162, 165, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[142] = new ModelRendererTurbo(this, 162, 165, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[143] = new ModelRendererTurbo(this, 162, 165, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[144] = new ModelRendererTurbo(this, 162, 173, textureX, textureY); // Box 364 prime base
		bodyModel[145] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 183
		bodyModel[146] = new ModelRendererTurbo(this, 457, 153, textureX, textureY, "cull"); // Box 231 cull antennae support
		bodyModel[147] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 269
		bodyModel[148] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 599
		bodyModel[149] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 598
		bodyModel[150] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 597
		bodyModel[151] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 596
		bodyModel[152] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 595
		bodyModel[153] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 594
		bodyModel[154] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 589
		bodyModel[155] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 584
		bodyModel[156] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 583
		bodyModel[157] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 582
		bodyModel[158] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 580
		bodyModel[159] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 579
		bodyModel[160] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 578
		bodyModel[161] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 576
		bodyModel[162] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 579
		bodyModel[163] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 578
		bodyModel[164] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 266
		bodyModel[165] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 575
		bodyModel[166] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 574
		bodyModel[167] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 573
		bodyModel[168] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 572
		bodyModel[169] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 571
		bodyModel[170] = new ModelRendererTurbo(this, 491, 138, textureX, textureY); // Box 278
		bodyModel[171] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 221
		bodyModel[172] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 567
		bodyModel[173] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 566
		bodyModel[174] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 283
		bodyModel[175] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 273
		bodyModel[176] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 272
		bodyModel[177] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 506
		bodyModel[178] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 505
		bodyModel[179] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 504
		bodyModel[180] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 503
		bodyModel[181] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 557
		bodyModel[182] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 354
		bodyModel[183] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 622
		bodyModel[184] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 621
		bodyModel[185] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 620
		bodyModel[186] = new ModelRendererTurbo(this, 257, 144, textureX, textureY); // Box 616
		bodyModel[187] = new ModelRendererTurbo(this, 251, 144, textureX, textureY); // Box 615
		bodyModel[188] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 614
		bodyModel[189] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 501
		bodyModel[190] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 500
		bodyModel[191] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 498
		bodyModel[192] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 63
		bodyModel[194] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 62
		bodyModel[195] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 61
		bodyModel[196] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 348
		bodyModel[197] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 345
		bodyModel[198] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 343
		bodyModel[199] = new ModelRendererTurbo(this, 201, 145, textureX, textureY, "cull"); // Box 561 cull bell holder
		bodyModel[200] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 206
		bodyModel[201] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 162, 169, textureX, textureY); // Box 201
		bodyModel[203] = new ModelRendererTurbo(this, 25, 145, textureX, textureY, "cull"); // Box 524 cull support
		bodyModel[204] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 147
		bodyModel[205] = new ModelRendererTurbo(this, 329, 137, textureX, textureY, "prime1"); // Box 169 glow front lamp
		bodyModel[206] = new ModelRendererTurbo(this, 153, 145, textureX, textureY, "cull"); // Box 521 cull
		bodyModel[207] = new ModelRendererTurbo(this, 121, 145, textureX, textureY, "cull"); // Box 520 cull
		bodyModel[208] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 518
		bodyModel[209] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 516
		bodyModel[210] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 515
		bodyModel[211] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 514
		bodyModel[212] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 513
		bodyModel[213] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 512
		bodyModel[214] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 511
		bodyModel[215] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 510
		bodyModel[216] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 504
		bodyModel[217] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 503
		bodyModel[218] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 502
		bodyModel[219] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 501
		bodyModel[220] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 500
		bodyModel[221] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 499
		bodyModel[222] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 498
		bodyModel[223] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 497
		bodyModel[224] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 496
		bodyModel[225] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 493
		bodyModel[226] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 492
		bodyModel[227] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 491
		bodyModel[228] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 490
		bodyModel[229] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 489
		bodyModel[230] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 488
		bodyModel[231] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 487
		bodyModel[232] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 486
		bodyModel[233] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 485
		bodyModel[234] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 484
		bodyModel[235] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 483
		bodyModel[236] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 504
		bodyModel[237] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 503
		bodyModel[238] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 501
		bodyModel[239] = new ModelRendererTurbo(this, 209, 236, textureX, textureY); // Box 2
		bodyModel[240] = new ModelRendererTurbo(this, 192, 228, textureX, textureY); // Box 2
		bodyModel[241] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 496
		bodyModel[242] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 495
		bodyModel[243] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 494
		bodyModel[244] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 493
		bodyModel[245] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 492
		bodyModel[246] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 491
		bodyModel[247] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 490
		bodyModel[248] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 489
		bodyModel[249] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 488
		bodyModel[250] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 487
		bodyModel[251] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 486
		bodyModel[252] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 485
		bodyModel[253] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 483
		bodyModel[254] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 481
		bodyModel[255] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 480
		bodyModel[256] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 476
		bodyModel[257] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 474
		bodyModel[258] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 473
		bodyModel[259] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 468
		bodyModel[260] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 467
		bodyModel[261] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 201
		bodyModel[262] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 202
		bodyModel[263] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 2
		bodyModel[264] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 2
		bodyModel[265] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 2
		bodyModel[266] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 2
		bodyModel[267] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 2
		bodyModel[268] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 2
		bodyModel[269] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 2
		bodyModel[270] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 2
		bodyModel[271] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 452
		bodyModel[272] = new ModelRendererTurbo(this, 177, 129, textureX, textureY,"cull"); // Box 449
		bodyModel[273] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 452
		bodyModel[274] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 451
		bodyModel[275] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 450
		bodyModel[276] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 443
		bodyModel[277] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 441
		bodyModel[278] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 436
		bodyModel[279] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 434
		bodyModel[280] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 430
		bodyModel[281] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 429
		bodyModel[282] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 428
		bodyModel[283] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 427
		bodyModel[284] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 189
		bodyModel[285] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 189
		bodyModel[286] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 424
		bodyModel[287] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 109
		bodyModel[288] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 417
		bodyModel[289] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 416
		bodyModel[290] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 415
		bodyModel[291] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 414
		bodyModel[292] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 412
		bodyModel[293] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 406
		bodyModel[294] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 405
		bodyModel[295] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 403
		bodyModel[296] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 402
		bodyModel[297] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 401
		bodyModel[298] = new ModelRendererTurbo(this, 489, 113, textureX, textureY, "cull"); // Box cull
		bodyModel[299] = new ModelRendererTurbo(this, 329, 121, textureX, textureY, "cull"); // Box 2
		bodyModel[300] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 394
		bodyModel[301] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 393
		bodyModel[302] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 392
		bodyModel[303] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 391
		bodyModel[304] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 390
		bodyModel[305] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 389
		bodyModel[306] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 388
		bodyModel[307] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 387
		bodyModel[308] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 386
		bodyModel[309] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 385
		bodyModel[310] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 384
		bodyModel[311] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 381
		bodyModel[312] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 380
		bodyModel[313] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 379
		bodyModel[314] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 378
		bodyModel[315] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 377
		bodyModel[316] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 376
		bodyModel[317] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 375
		bodyModel[318] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 377
		bodyModel[319] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 376
		bodyModel[320] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 375
		bodyModel[321] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 380
		bodyModel[322] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 370
		bodyModel[323] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 369
		bodyModel[324] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 368
		bodyModel[325] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 367
		bodyModel[326] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 366
		bodyModel[327] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 364
		bodyModel[328] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 363
		bodyModel[329] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 362
		bodyModel[330] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 361
		bodyModel[331] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 360
		bodyModel[332] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 359
		bodyModel[333] = new ModelRendererTurbo(this, 497, 89, textureX, textureY, "cull"); // Box cull
		bodyModel[334] = new ModelRendererTurbo(this, 201, 89, textureX, textureY, "cull"); // Box cull
		bodyModel[335] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 352
		bodyModel[336] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 351
		bodyModel[337] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 350
		bodyModel[338] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 349
		bodyModel[339] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 348
		bodyModel[340] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 347
		bodyModel[341] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 346
		bodyModel[342] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 345
		bodyModel[343] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 344
		bodyModel[344] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 343
		bodyModel[345] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 342
		bodyModel[346] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 341
		bodyModel[347] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 340
		bodyModel[348] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 338
		bodyModel[349] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 337
		bodyModel[350] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 336
		bodyModel[351] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 335
		bodyModel[352] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 334
		bodyModel[353] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 333
		bodyModel[354] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 332
		bodyModel[355] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 331
		bodyModel[356] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 330
		bodyModel[357] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 329
		bodyModel[358] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 319
		bodyModel[359] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 318
		bodyModel[360] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 317
		bodyModel[361] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 315
		bodyModel[362] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 313
		bodyModel[363] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 312
		bodyModel[364] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 473
		bodyModel[365] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 322 
		bodyModel[366] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 320
		bodyModel[367] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 319
		bodyModel[368] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 318
		bodyModel[369] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 317
		bodyModel[370] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 315
		bodyModel[371] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 314
		bodyModel[372] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 313
		bodyModel[373] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 312
		bodyModel[374] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 311
		bodyModel[375] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 310
		bodyModel[376] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 309
		bodyModel[377] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 308
		bodyModel[378] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 307
		bodyModel[379] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 306
		bodyModel[380] = new ModelRendererTurbo(this, 207, 171, textureX, textureY); // Box 289
		bodyModel[381] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 288
		bodyModel[382] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 287
		bodyModel[383] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 286
		bodyModel[384] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 285
		bodyModel[385] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 284
		bodyModel[386] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 283
		bodyModel[387] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 282
		bodyModel[388] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 284
		bodyModel[389] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 283
		bodyModel[390] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 282
		bodyModel[391] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 281
		bodyModel[392] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 280
		bodyModel[393] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 279
		bodyModel[394] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 277
		bodyModel[395] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 216
		bodyModel[396] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 278
		bodyModel[397] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 277
		bodyModel[398] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 276
		bodyModel[399] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 275
		bodyModel[400] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 274
		bodyModel[401] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 273
		bodyModel[402] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 272
		bodyModel[403] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 271
		bodyModel[404] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 270
		bodyModel[405] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 267
		bodyModel[406] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 266
		bodyModel[407] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 265
		bodyModel[408] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 264
		bodyModel[409] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 263
		bodyModel[410] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 262
		bodyModel[411] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 281
		bodyModel[412] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 160
		bodyModel[413] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 256
		bodyModel[414] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 255
		bodyModel[415] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 254
		bodyModel[416] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 253
		bodyModel[417] = new ModelRendererTurbo(this, 177, 57, textureX, textureY, "cull"); // Box cull
		bodyModel[418] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 251
		bodyModel[419] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 250
		bodyModel[420] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 248
		bodyModel[421] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 247
		bodyModel[422] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 246
		bodyModel[423] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 245
		bodyModel[424] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 244
		bodyModel[425] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 243
		bodyModel[426] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 242
		bodyModel[427] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 241
		bodyModel[428] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 240
		bodyModel[429] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 235
		bodyModel[430] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 234
		bodyModel[431] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 233
		bodyModel[432] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 232
		bodyModel[433] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 230
		bodyModel[434] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 228
		bodyModel[435] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 370
		bodyModel[436] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 368
		bodyModel[437] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 57
		bodyModel[438] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 135
		bodyModel[439] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 132
		bodyModel[440] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 74
		bodyModel[441] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 114
		bodyModel[442] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 207
		bodyModel[443] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 224
		bodyModel[444] = new ModelRendererTurbo(this, 129, 33, textureX, textureY, "cull"); // Box 223 cull
		bodyModel[445] = new ModelRendererTurbo(this, 305, 49, textureX, textureY, "cull"); // Box 222 cull
		bodyModel[446] = new ModelRendererTurbo(this, 425, 25, textureX, textureY, "cull"); // Box 221 cull
		bodyModel[447] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 220
		bodyModel[448] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 219
		bodyModel[449] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 218
		bodyModel[450] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 217
		bodyModel[451] = new ModelRendererTurbo(this, 281, 49, textureX, textureY, "cull"); // Box cull
		bodyModel[452] = new ModelRendererTurbo(this, 57, 41, textureX, textureY, "lamp"); // Box 146 glow front lamp
		bodyModel[453] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 56
		bodyModel[454] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 229
		bodyModel[455] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 201
		bodyModel[456] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 132
		bodyModel[457] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 131
		bodyModel[458] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 130
		bodyModel[459] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 166
		bodyModel[460] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 204
		bodyModel[461] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 203
		bodyModel[462] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 202
		bodyModel[463] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 201
		bodyModel[464] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 199
		bodyModel[465] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 197
		bodyModel[466] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 196
		bodyModel[467] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 194
		bodyModel[468] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 193
		bodyModel[469] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 256
		bodyModel[470] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 255
		bodyModel[471] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 254
		bodyModel[472] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 252
		bodyModel[473] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 251
		bodyModel[474] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 250
		bodyModel[475] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 249
		bodyModel[476] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 248
		bodyModel[477] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 183
		bodyModel[478] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 182
		bodyModel[479] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 181
		bodyModel[480] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 180
		bodyModel[481] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 179
		bodyModel[482] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 178
		bodyModel[483] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 172
		bodyModel[484] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 162
		bodyModel[485] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 161
		bodyModel[486] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 160
		bodyModel[487] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 158
		bodyModel[488] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 157
		bodyModel[489] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 156
		bodyModel[490] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 149
		bodyModel[491] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 145
		bodyModel[492] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 143
		bodyModel[493] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 257
		bodyModel[494] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 19
		bodyModel[495] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 18
		bodyModel[496] = new ModelRendererTurbo(this, 105, 220, textureX, textureY); // Box 135
		bodyModel[497] = new ModelRendererTurbo(this, 96, 219, textureX, textureY); // Box 134
		bodyModel[498] = new ModelRendererTurbo(this, 96, 219, textureX, textureY); // Box 133
		bodyModel[499] = new ModelRendererTurbo(this, 105, 220, textureX, textureY); // Box 132

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[0].setRotationPoint(-33.5F, -24F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 591
		bodyModel[1].setRotationPoint(-33.5F, -22F, -4.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -2.5F, -2F, -0.5F, -2.5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[2].setRotationPoint(35.5F, -12.5F, 2.5F);
		bodyModel[2].rotateAngleY = -0.78539816F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // dieselcontrolstand
		bodyModel[3].setRotationPoint(36.5F, -10.5F, 2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 5, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 588
		bodyModel[4].setRotationPoint(29.5F, -10.25F, -11.02F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 587
		bodyModel[5].setRotationPoint(29.5F, -10.25F, 11.02F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[6].setRotationPoint(35.03F, -20.75F, 0.25F);
		bodyModel[6].rotateAngleY = 0.01745329F;

		bodyModel[7].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[7].setRotationPoint(32.5F, -20.25F, 1.25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[8].setRotationPoint(35.03F, -20.75F, -2.25F);
		bodyModel[8].rotateAngleY = 0.01745329F;

		bodyModel[9].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[9].setRotationPoint(32.5F, -20.25F, -1.25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[10].setRotationPoint(-48.99F, 0.5F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[11].setRotationPoint(-46.99F, 0.5F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[12].setRotationPoint(14F, -7F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[13].setRotationPoint(12F, -9F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[14].setRotationPoint(0F, -9F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 582
		bodyModel[15].setRotationPoint(-8F, -7F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 581
		bodyModel[16].setRotationPoint(10.5F, -8F, -11F);

		bodyModel[17].addShapeBox(0.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355 cull
		bodyModel[17].setRotationPoint(-25.5F, -20.5F, -5F);
		bodyModel[17].rotateAngleY = -0.6981317F;

		bodyModel[18].addShapeBox(0.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 354 cull
		bodyModel[18].setRotationPoint(-25.5F, -20.5F, 5F);
		bodyModel[18].rotateAngleY = 0.6981317F;

		bodyModel[19].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[19].setRotationPoint(-25.5F, -22.5F, 5F);
		bodyModel[19].rotateAngleY = 0.6981317F;

		bodyModel[20].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 numberboard
		bodyModel[20].setRotationPoint(-25.5F, -22.5F, 5F);
		bodyModel[20].rotateAngleY = 0.6981317F;

		bodyModel[21].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 numerbboard
		bodyModel[21].setRotationPoint(-25.5F, -22.5F, -5F);
		bodyModel[21].rotateAngleY = -0.6981317F;

		bodyModel[22].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[22].setRotationPoint(-25.5F, -22.5F, -5F);
		bodyModel[22].rotateAngleY = -0.6981317F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 0, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[23].setRotationPoint(-46.5F, 1.99F, -9F);

		bodyModel[24].addShapeBox(-0.25F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[24].setRotationPoint(37F, -20F, 8.25F);
		bodyModel[24].rotateAngleX = 0.38397244F;
		bodyModel[24].rotateAngleY = 1.57079633F;

		bodyModel[25].addShapeBox(-0.5F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[25].setRotationPoint(29F, -20F, 7.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[26].setRotationPoint(-19.25F, -4F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[27].setRotationPoint(3F, -4F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[28].setRotationPoint(-9F, -4F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F); // Box 569
		bodyModel[29].setRotationPoint(-32.5F, -8F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[30].setRotationPoint(-33.5F, -17F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 581
		bodyModel[31].setRotationPoint(-41.25F, -16F, 7.5F);
		bodyModel[31].rotateAngleX = 2.35619449F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 580
		bodyModel[32].setRotationPoint(-41.25F, -16F, -7.5F);
		bodyModel[32].rotateAngleX = 0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 579
		bodyModel[33].setRotationPoint(-8F, -23.5F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, -5F, -2F, 0F, -5F); // Box 578
		bodyModel[34].setRotationPoint(-39.5F, -7F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[35].setRotationPoint(-39.5F, -17F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 576
		bodyModel[36].setRotationPoint(-39.5F, -21F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0.5F, 0F, 0F, -7F, 0.5F, 0F, -7F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 7F, 0.5F, 0F, 7F, -0.5F, 0F, -0.5F, 0F); // this is an example for wastey
		bodyModel[37].setRotationPoint(-27.5F, -15F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[38].setRotationPoint(-32.5F, -16F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[39].setRotationPoint(-33.5F, -17F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 572
		bodyModel[40].setRotationPoint(30.25F, 3F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.125F, -0.625F, 0F, -0.125F); // Box 571
		bodyModel[41].setRotationPoint(32F, 3F, 5.15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0.75F, -1.5F, 0F, 0.75F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0F, 0F); // Box 570
		bodyModel[42].setRotationPoint(31F, 1.5F, 6.15F);

		bodyModel[43].addShapeBox(0F, 1F, 0F, 3, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 569
		bodyModel[43].setRotationPoint(28F, 1F, 6.15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.75F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.75F, -1.5F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.75F, 0F); // Box 568
		bodyModel[44].setRotationPoint(27F, 1.5F, 6.15F);

		bodyModel[45].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F,-0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.375F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.375F, 0F, 0F); // Box 567
		bodyModel[45].setRotationPoint(26F, 3F, 5.15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[46].setRotationPoint(25.5F, 4.5F, 7.15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 565
		bodyModel[47].setRotationPoint(26.5F, 3F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 564
		bodyModel[48].setRotationPoint(27.5F, 2.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 563
		bodyModel[49].setRotationPoint(30.25F, 3F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.625F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, 0F, -0.625F, 0F, 0F); // Box 562
		bodyModel[50].setRotationPoint(32F, 3F, -9.15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0.75F, -1.5F, 0F, 0.75F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0F, 0F); // Box 561
		bodyModel[51].setRotationPoint(31F, 1.5F, -8.15F);

		bodyModel[52].addShapeBox(0F, 1F, 0F, 3, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 560
		bodyModel[52].setRotationPoint(28F, 1F, -8.15F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.75F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.75F, -1.5F, 0F, 0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.75F, 0F); // Box 559
		bodyModel[53].setRotationPoint(27F, 1.5F, -8.15F);

		bodyModel[54].addShapeBox(0F, 0F, 1F, 1, 2, 2, 0F,-0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.375F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.375F, 0F, 0F); // Box 558
		bodyModel[54].setRotationPoint(26F, 3F, -9.15F);

		bodyModel[55].addBox(0F, 0F, 0F, 13, 4, 0, 0F); // Box 574
		bodyModel[55].setRotationPoint(29F, -22F, 6F);

		bodyModel[56].addShapeBox(24F, -3F, 0F, 2, 2, 1, 0F,-0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F); // Box 573
		bodyModel[56].setRotationPoint(-26F, 4.5F, 7.5F);
		bodyModel[56].rotateAngleZ = -0.10471976F;

		bodyModel[57].addShapeBox(24F, -3F, 0F, 2, 2, 1, 0F,-0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, -0.35F, 0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F); // Box 572
		bodyModel[57].setRotationPoint(-26F, 4.5F, -8.5F);
		bodyModel[57].rotateAngleZ = -0.10471976F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 190
		bodyModel[58].setRotationPoint(3.25F, -3.75F, -10.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 189
		bodyModel[59].setRotationPoint(5.5F, -8.25F, -10.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 188
		bodyModel[60].setRotationPoint(3.25F, -8.25F, -10.25F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 187
		bodyModel[61].setRotationPoint(6F, -5F, -9.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 186
		bodyModel[62].setRotationPoint(3.75F, -5F, -9.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 44, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 581 cull
		bodyModel[63].setRotationPoint(-37.55F, -5.5F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 32, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 519 cull
		bodyModel[64].setRotationPoint(-31F, -5.5F, -11F);

		bodyModel[65].addShapeBox(24.5F, -3F, -1F, 1, 1, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 563
		bodyModel[65].setRotationPoint(-26F, 4.5F, 9.5F);
		bodyModel[65].rotateAngleZ = -0.10471976F;

		bodyModel[66].addBox(0F, 0F, 0F, 6, 6, 10, 0F); // when she boost on my er till i steam locomotive subclass
		bodyModel[66].setRotationPoint(26.5F, 3F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F); // Box 562
		bodyModel[67].setRotationPoint(-14F, -3.75F, -11F);
		bodyModel[67].rotateAngleX = 0.78539816F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.175F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.175F, 0F, 0.5F, 0F); // Box 560
		bodyModel[68].setRotationPoint(23.5F, 5F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.175F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0.175F, 0F, -0.5F, -1F, 0F, 0.5F, -1F); // Box 558
		bodyModel[69].setRotationPoint(23.5F, 5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 595 glow marker
		bodyModel[70].setRotationPoint(-41.05F, -20F, 6.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[71].setRotationPoint(-41F, -19.75F, 7.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow marker
		bodyModel[72].setRotationPoint(-41.05F, -20F, -7.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[73].setRotationPoint(25.5F, 4.5F, -8.15F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 583
		bodyModel[74].setRotationPoint(25.5F, 5F, 6.12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 577
		bodyModel[75].setRotationPoint(27.5F, 3.75F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 576
		bodyModel[76].setRotationPoint(30.5F, 4.25F, 7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 575
		bodyModel[77].setRotationPoint(27.5F, 4.25F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[78].setRotationPoint(29F, 4.5F, 8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 573
		bodyModel[79].setRotationPoint(28.5F, 5F, 8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[80].setRotationPoint(28F, 5.5F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[81].setRotationPoint(26.5F, 7F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[82].setRotationPoint(31.5F, 7.5F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 569
		bodyModel[83].setRotationPoint(27.5F, 8F, 6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 568
		bodyModel[84].setRotationPoint(32.5F, 5F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[85].setRotationPoint(23.5F, 5F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 566
		bodyModel[86].setRotationPoint(23.5F, 7F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 555
		bodyModel[87].setRotationPoint(25.5F, 5F, -8.12F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 182
		bodyModel[88].setRotationPoint(26.5F, 3F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 178
		bodyModel[89].setRotationPoint(27.5F, 2.5F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 597
		bodyModel[90].setRotationPoint(27.5F, 3.75F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 596
		bodyModel[91].setRotationPoint(30.5F, 4.25F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595
		bodyModel[92].setRotationPoint(27.5F, 4.25F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[93].setRotationPoint(29F, 4.5F, -9.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		bodyModel[94].setRotationPoint(43F, -1F, 5.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[95].setRotationPoint(43F, -1F, -5.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[96].setRotationPoint(7F, -2F, 3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[97].setRotationPoint(7F, -2F, -4.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[98].setRotationPoint(-5F, -2F, 3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[99].setRotationPoint(-5F, -2F, -4.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[100].setRotationPoint(-17F, -2F, 3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[101].setRotationPoint(-17F, -2F, -4.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[102].setRotationPoint(-1.5F, -17F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 27, 9, 4, 0F,0F, 4F, 0F, 0F, 4.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 591
		bodyModel[103].setRotationPoint(-28.5F, -16.5F, 4.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590 
		bodyModel[104].setRotationPoint(-45F, -0.5F, 3.26F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[105].setRotationPoint(-28F, -1.25F, 7.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[106].setRotationPoint(-30F, -0.25F, 7.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull
		bodyModel[107].setRotationPoint(-30F, -2.25F, 7.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F); // Box 593
		bodyModel[108].setRotationPoint(-2F, 6F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 592
		bodyModel[109].setRotationPoint(5.5F, -1F, -6.01F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 591
		bodyModel[110].setRotationPoint(5.5F, -1F, 6.01F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 590
		bodyModel[111].setRotationPoint(-6.5F, -1F, -6.01F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 589
		bodyModel[112].setRotationPoint(-6.5F, -1F, 6.01F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 588
		bodyModel[113].setRotationPoint(-18.5F, -1F, 6.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 587
		bodyModel[114].setRotationPoint(-18.5F, -1F, -6.01F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 586
		bodyModel[115].setRotationPoint(-30.5F, -1F, 6.01F);

		bodyModel[116].addShapeBox(0F, -0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 586 CULL
		bodyModel[116].setRotationPoint(-40F, 0.5F, -6F);
		bodyModel[116].rotateAngleZ = 0.78539816F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, -0.9F); // Box 585 numberboard glow
		bodyModel[117].setRotationPoint(-45F, -13.5F, 1.51F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.9F, -0.1F, -0.25F, 0.05F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 584 numberboard glow
		bodyModel[118].setRotationPoint(-45F, -13.5F, -2.51F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[119].setRotationPoint(41.5F, 2F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 583
		bodyModel[120].setRotationPoint(44.5F, 3F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F); // Box 605
		bodyModel[121].setRotationPoint(42.5F, -1F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 604
		bodyModel[122].setRotationPoint(42.5F, -1F, 10.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 603
		bodyModel[123].setRotationPoint(42F, -20.5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[124].setRotationPoint(42F, -21.5F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[125].setRotationPoint(42F, -21.5F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[126].setRotationPoint(28F, -21.5F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[127].setRotationPoint(28F, -21.5F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 598 cull
		bodyModel[128].setRotationPoint(28.45F, -3.5F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 597 cull ???
		bodyModel[129].setRotationPoint(24.45F, -5.5F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 596 cull
		bodyModel[130].setRotationPoint(14.45F, -5.5F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[131].setRotationPoint(-27F, -23.5F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 3F, -3F, 0F, 3F); // Box 594
		bodyModel[132].setRotationPoint(-17F, -7.5F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 279
		bodyModel[133].setRotationPoint(32.5F, -20.75F, -11.97F);
		bodyModel[133].rotateAngleX = -0.26179939F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[134].setRotationPoint(32.5F, -20.5F, 10.97F);
		bodyModel[134].rotateAngleX = 0.26179939F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[135].setRotationPoint(42.5F, -13F, -10.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 613
		bodyModel[136].setRotationPoint(43.5F, -12F, -10.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[137].setRotationPoint(42.5F, -13F, 10.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 190
		bodyModel[138].setRotationPoint(43.5F, -12F, 10.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 478 cull
		bodyModel[139].setRotationPoint(27F, -24.5F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[140].setRotationPoint(27F, -26F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[141].setRotationPoint(27F, -26F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[142].setRotationPoint(27F, -26F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[143].setRotationPoint(27F, -26F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[144].setRotationPoint(27F, -25.5F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[145].setRotationPoint(29F, -24.75F, 5F);

		bodyModel[146].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 231 cull antennae support
		bodyModel[146].setRotationPoint(28F, -23.75F, 3.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 269
		bodyModel[147].setRotationPoint(30F, -26.75F, 5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[148].setRotationPoint(37F, 2.25F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[149].setRotationPoint(40F, -1F, 8.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[150].setRotationPoint(40F, 3F, 8.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 596
		bodyModel[151].setRotationPoint(39.5F, 1.5F, 8.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[152].setRotationPoint(22.5F, 1.25F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0.2F, -8.5F, 0F, 0.2F, -8.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0.2F, 0F, 0F); // Box 594
		bodyModel[153].setRotationPoint(15.5F, -7.25F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[154].setRotationPoint(10.5F, -7.25F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[155].setRotationPoint(35.5F, 0.5F, -1.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[156].setRotationPoint(25.5F, -0.5F, 8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[157].setRotationPoint(27F, -2F, 8.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[158].setRotationPoint(1.25F, -8.5F, 9.45F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[159].setRotationPoint(2.25F, -7.5F, 9.2F);
		bodyModel[159].rotateAngleX = 0.78539816F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[160].setRotationPoint(1.25F, -7.5F, 8.5F);
		bodyModel[160].rotateAngleX = 0.78539816F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[161].setRotationPoint(5.25F, -7.5F, 8.5F);
		bodyModel[161].rotateAngleX = 0.78539816F;

		bodyModel[162].addBox(0F, 0F, 0F, 4, 0, 14, 0F); // Box 579
		bodyModel[162].setRotationPoint(43F, -1.5F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[163].setRotationPoint(39.25F, 0.5F, -5F);

		bodyModel[164].addBox(0F, 0F, 0F, 8, 0, 6, 0F); // Box 266
		bodyModel[164].setRotationPoint(41F, -0.5F, -3F);
		bodyModel[164].rotateAngleZ = -0.06981317F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 2, 16, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[165].setRotationPoint(43F, 2.5F, -8F);

		bodyModel[166].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // Box 574
		bodyModel[166].setRotationPoint(43F, -0.5F, -10F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 573
		bodyModel[167].setRotationPoint(43F, -3.5F, 7F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 572
		bodyModel[168].setRotationPoint(43F, -3.5F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[169].setRotationPoint(35F, 0F, -2F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Box 278
		bodyModel[170].setRotationPoint(34F, -7F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[171].setRotationPoint(36F, -6F, -2F);

		bodyModel[172].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 567
		bodyModel[172].setRotationPoint(34.5F, -14F, 3.5F);

		bodyModel[173].addShapeBox(-0.5F, 0F, -0.5F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[173].setRotationPoint(35.55F, -14F, 2.5F);

		bodyModel[174].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 283
		bodyModel[174].setRotationPoint(35F, -8F, 3.5F);
		bodyModel[174].rotateAngleY = -0.78539816F;

		bodyModel[175].addBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F); // Box 273
		bodyModel[175].setRotationPoint(34.5F, -15F, -1F);
		bodyModel[175].rotateAngleY = -0.78539816F;

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 272
		bodyModel[176].setRotationPoint(35F, -9F, 2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[177].setRotationPoint(35.53F, -19.75F, 2.5F);
		bodyModel[177].rotateAngleY = 0.01745329F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[178].setRotationPoint(35.53F, -19.75F, -4.5F);
		bodyModel[178].rotateAngleY = 0.01745329F;

		bodyModel[179].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[179].setRotationPoint(33F, -19.25F, 3.5F);

		bodyModel[180].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[180].setRotationPoint(33F, -19.25F, -3.5F);

		bodyModel[181].addShapeBox(-0.5F, 0F, -0.5F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[181].setRotationPoint(35.55F, -18F, -6.5F);

		bodyModel[182].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 354
		bodyModel[182].setRotationPoint(34.5F, -18F, -5.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[183].setRotationPoint(36F, -10F, 6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[184].setRotationPoint(36F, -9F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[185].setRotationPoint(35F, -8F, 5.5F);

		bodyModel[186].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[186].setRotationPoint(36F, -11.5F, 8.75F);

		bodyModel[187].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[187].setRotationPoint(35F, -11.5F, 7.75F);
		bodyModel[187].rotateAngleZ = 0.15707963F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[188].setRotationPoint(31F, -4.5F, 8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 18, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -5F, 0F, -9F, -5F); // Box 501
		bodyModel[189].setRotationPoint(35F, -9.5F, -8.5F);
		bodyModel[189].rotateAngleZ = 0.12217305F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[190].setRotationPoint(34.5F, -10.5F, -8.5F);

		bodyModel[191].addShapeBox(-0.5F, 0F, -5F, 1, 4, 7, 0F,0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 498
		bodyModel[191].setRotationPoint(35F, -12.5F, -6F);
		bodyModel[191].rotateAngleY = -0.26179939F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[192].setRotationPoint(-41F, -19.75F, -7.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,3F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 63
		bodyModel[193].setRotationPoint(-47F, 6.5F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,2.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 62
		bodyModel[194].setRotationPoint(-48F, 8.5F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 3F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.5F, 0F, 0F); // Box 61
		bodyModel[195].setRotationPoint(-47F, 6.5F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,3F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 348
		bodyModel[196].setRotationPoint(-48F, 6F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 345
		bodyModel[197].setRotationPoint(-48F, 6F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F); // Box 343
		bodyModel[198].setRotationPoint(-48F, 8.5F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 561 cull bell holder
		bodyModel[199].setRotationPoint(-41.5F, -22F, -1F);

		bodyModel[200].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 206
		bodyModel[200].setRotationPoint(-42F, -20F, 0F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 202
		bodyModel[201].setRotationPoint(-42.5F, -21.5F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 201
		bodyModel[202].setRotationPoint(-43F, -20.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524 cull support
		bodyModel[203].setRotationPoint(-45F, -15F, -1.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[204].setRotationPoint(-45F, -17.5F, -1.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 glow front lamp
		bodyModel[205].setRotationPoint(-45.25F, -17.25F, -1.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521 cull
		bodyModel[206].setRotationPoint(-31.5F, -23F, -2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520 cull
		bodyModel[207].setRotationPoint(2.75F, -10.5F, -10F);

		bodyModel[208].addShapeBox(0F, 2F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[208].setRotationPoint(-17F, 0F, 8F);
		bodyModel[208].rotateAngleZ = 0.2268928F;

		bodyModel[209].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[209].setRotationPoint(-17F, 0F, 8F);
		bodyModel[209].rotateAngleZ = 0.2268928F;

		bodyModel[210].addShapeBox(0F, -1F, 0F, 15, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 515
		bodyModel[210].setRotationPoint(-15.5F, 3F, 8.65F);
		bodyModel[210].rotateAngleZ = -0.13962634F;

		bodyModel[211].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 514
		bodyModel[211].setRotationPoint(-30F, 5F, 8.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[212].setRotationPoint(-27F, 4F, 8F);

		bodyModel[213].addShapeBox(-0.5F, 0F, 0F, 1, 6, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F); // Box 512
		bodyModel[213].setRotationPoint(-27.5F, -1F, 8.75F);
		bodyModel[213].rotateAngleZ = -0.38397244F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[214].setRotationPoint(-28F, -1.25F, 7.25F);

		bodyModel[215].addShapeBox(0F, -1F, 0F, 11, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 510
		bodyModel[215].setRotationPoint(-28.5F, -0.25F, 8F);
		bodyModel[215].rotateAngleZ = -0.03490659F;

		bodyModel[216].addShapeBox(24F, -1F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 504
		bodyModel[216].setRotationPoint(-26F, 4.5F, 7.5F);
		bodyModel[216].rotateAngleZ = -0.10471976F;

		bodyModel[217].addShapeBox(0F, -1F, 0F, 26, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 503
		bodyModel[217].setRotationPoint(-26F, 4.5F, 7.65F);
		bodyModel[217].rotateAngleZ = -0.10471976F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 502
		bodyModel[218].setRotationPoint(-27.5F, 3.75F, 7.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 501
		bodyModel[219].setRotationPoint(-27.5F, 5F, 7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 500
		bodyModel[220].setRotationPoint(-27.5F, 3F, 7.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[221].setRotationPoint(-30.5F, 5.75F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 498
		bodyModel[222].setRotationPoint(-30.5F, 2.25F, 7.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 497
		bodyModel[223].setRotationPoint(10F, 6F, 6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 496
		bodyModel[224].setRotationPoint(-14F, 6F, 6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 493
		bodyModel[225].setRotationPoint(-24F, 6F, 6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 492
		bodyModel[226].setRotationPoint(-26F, 6F, 6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 491
		bodyModel[227].setRotationPoint(-18.75F, -2F, 5.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 490
		bodyModel[228].setRotationPoint(-18.75F, -2F, 8.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[229].setRotationPoint(-19.25F, -3F, 5.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[230].setRotationPoint(-19.25F, -2F, 5.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[231].setRotationPoint(-19.25F, -2F, 8.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[232].setRotationPoint(-19.25F, 1F, 5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[233].setRotationPoint(-19.25F, 2F, 5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[234].setRotationPoint(-19.25F, 2F, 9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 483
		bodyModel[235].setRotationPoint(-19.25F, 8F, 6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[236].setRotationPoint(-48.5F, 6F, 0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 503
		bodyModel[237].setRotationPoint(-48.5F, 6F, -0.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 501
		bodyModel[238].setRotationPoint(-48.5F, 6F, -4.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 2, 0, 15, 0F); // Box 2
		bodyModel[239].setRotationPoint(-49.51F, 9F, -7.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 7, 15, 0F); // Box 2
		bodyModel[240].setRotationPoint(-47.51F, 2F, -7.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[241].setRotationPoint(26F, -17F, 8.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 495
		bodyModel[242].setRotationPoint(26F, -21F, 9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F); // Box 494
		bodyModel[243].setRotationPoint(-19.5F, -7F, 8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 493
		bodyModel[244].setRotationPoint(-17F, -7.5F, 9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[245].setRotationPoint(-22.5F, -9F, 8.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 491
		bodyModel[246].setRotationPoint(-24.5F, -7.5F, 9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[247].setRotationPoint(-27.5F, -10.5F, 8.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 489
		bodyModel[248].setRotationPoint(-22F, -19.5F, 9.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 488
		bodyModel[249].setRotationPoint(-23F, -16.5F, 8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 487
		bodyModel[250].setRotationPoint(-20F, -16.5F, 8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[251].setRotationPoint(-26.5F, -11F, 8.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[252].setRotationPoint(-25.5F, -9F, 8.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 483
		bodyModel[253].setRotationPoint(-3.75F, -4F, 6.5F);
		bodyModel[253].rotateAngleX = 0.78539816F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 481
		bodyModel[254].setRotationPoint(11.5F, -3F, 8.75F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 480
		bodyModel[255].setRotationPoint(9.25F, -3F, 8.75F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 476
		bodyModel[256].setRotationPoint(9F, -7.5F, 8.75F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 474
		bodyModel[257].setRotationPoint(12F, -4F, 9.25F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 473
		bodyModel[258].setRotationPoint(9.75F, -4F, 9.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 468
		bodyModel[259].setRotationPoint(27F, -20.5F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 467
		bodyModel[260].setRotationPoint(27F, -20.5F, -11F);

		bodyModel[261].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 201
		bodyModel[261].setRotationPoint(7F, -22.55F, 1.25F);
		bodyModel[261].rotateAngleZ = 0.78539816F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 202
		bodyModel[262].setRotationPoint(7F, -24.5F, -1.25F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 2
		bodyModel[263].setRotationPoint(18.25F, -23.5F, 0.25F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 2
		bodyModel[264].setRotationPoint(17.25F, -23F, -1.25F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 2
		bodyModel[265].setRotationPoint(16.75F, -23F, 0.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 2
		bodyModel[266].setRotationPoint(-41.25F, -8F, 7.5F);
		bodyModel[266].rotateAngleX = -2.35619449F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 2
		bodyModel[267].setRotationPoint(-41.25F, -8F, -7.5F);
		bodyModel[267].rotateAngleX = -0.78539816F;

		bodyModel[268].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 2
		bodyModel[268].setRotationPoint(-41.25F, -16F, 7.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 2
		bodyModel[269].setRotationPoint(-41.25F, -16F, -7.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[270].setRotationPoint(-41.25F, -4.75F, -4.25F);

		bodyModel[271].addShapeBox(0F, -0.25F, 0F, 0, 2, 12, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 452
		bodyModel[271].setRotationPoint(-40.25F, -21.75F, -6F);

		bodyModel[272].addBox(0F, -3F, -2.88F, 69, 3, 3, 0F); // Box 449
		bodyModel[272].setRotationPoint(-40.25F, -19.82F, 7.93F);
		bodyModel[272].rotateAngleX = 0.78539816F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[273].setRotationPoint(-37F, -4F, -6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 451
		bodyModel[274].setRotationPoint(-37F, -7F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[275].setRotationPoint(-37F, -10F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[276].setRotationPoint(-24.5F, -12F, -9.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F); // Box 441
		bodyModel[277].setRotationPoint(-35.75F, -17F, -9F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 436
		bodyModel[278].setRotationPoint(-21F, -19.5F, 9.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 434
		bodyModel[279].setRotationPoint(-22F, -21.5F, 3.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 430
		bodyModel[280].setRotationPoint(24.5F, -17F, 8.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 429
		bodyModel[281].setRotationPoint(24.5F, -21F, 9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[282].setRotationPoint(23F, -22F, -5.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 427
		bodyModel[283].setRotationPoint(23F, -23F, -4.5F);

		bodyModel[284].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[284].setRotationPoint(29F, -23F, -2F);
		bodyModel[284].rotateAngleZ = 0.27925268F;

		bodyModel[285].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[285].setRotationPoint(36F, -23F, -2F);
		bodyModel[285].rotateAngleZ = 0.27925268F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 424
		bodyModel[286].setRotationPoint(-23F, -7.5F, -10.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 109
		bodyModel[287].setRotationPoint(-30F, -4F, -11F);
		bodyModel[287].rotateAngleX = 0.78539816F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[288].setRotationPoint(-23F, -13.5F, -9.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 416
		bodyModel[289].setRotationPoint(-20F, -16.5F, -9.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 415
		bodyModel[290].setRotationPoint(-22.5F, -16.5F, -9.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F); // Box 414
		bodyModel[291].setRotationPoint(-21F, -19.5F, -10.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[292].setRotationPoint(-31.5F, -14F, -9F);

		bodyModel[293].addShapeBox(0F, -1F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 406
		bodyModel[293].setRotationPoint(-30F, 5F, -9.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[294].setRotationPoint(-27F, 4F, -9F);

		bodyModel[295].addShapeBox(-0.5F, 0F, 0F, 1, 6, 1, 0F,-0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 403
		bodyModel[295].setRotationPoint(-27.5F, -1F, -9.75F);
		bodyModel[295].rotateAngleZ = -0.38397244F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 402
		bodyModel[296].setRotationPoint(-28F, -1.25F, -10.25F);

		bodyModel[297].addShapeBox(0F, -1F, 0F, 11, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 401
		bodyModel[297].setRotationPoint(-27.5F, -0.25F, -9F);
		bodyModel[297].rotateAngleZ = -0.03490659F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull
		bodyModel[298].setRotationPoint(-28F, -1.25F, -10.25F);

		bodyModel[299].addShapeBox(3F, -3F, -0.12F, 69, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[299].setRotationPoint(-43.25F, -19.82F, -7.93F);
		bodyModel[299].rotateAngleX = -0.78539816F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 394
		bodyModel[300].setRotationPoint(-22F, -19.5F, -10.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 393
		bodyModel[301].setRotationPoint(-22F, -21.5F, -4.5F);

		bodyModel[302].addShapeBox(0F, 2F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[302].setRotationPoint(-17F, 0F, -9F);
		bodyModel[302].rotateAngleZ = 0.2268928F;

		bodyModel[303].addShapeBox(24.5F, -3F, -1F, 1, 1, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 391
		bodyModel[303].setRotationPoint(-26F, 4.5F, -8.5F);
		bodyModel[303].rotateAngleZ = -0.10471976F;

		bodyModel[304].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 390
		bodyModel[304].setRotationPoint(-17F, 0F, -9F);
		bodyModel[304].rotateAngleZ = 0.2268928F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 389
		bodyModel[305].setRotationPoint(-18.75F, -2F, -6.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 388
		bodyModel[306].setRotationPoint(-18.75F, -2F, -9.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 387
		bodyModel[307].setRotationPoint(-19.25F, -3F, -9.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[308].setRotationPoint(-19.25F, -2F, -6.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[309].setRotationPoint(-19.25F, -2F, -9.5F);

		bodyModel[310].addShapeBox(0F, -1F, 0F, 15, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 384
		bodyModel[310].setRotationPoint(-15.5F, 3F, -9.65F);
		bodyModel[310].rotateAngleZ = -0.13962634F;

		bodyModel[311].addShapeBox(24F, -1F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 381
		bodyModel[311].setRotationPoint(-26F, 4.5F, -8.5F);
		bodyModel[311].rotateAngleZ = -0.10471976F;

		bodyModel[312].addShapeBox(0F, -1F, 0F, 26, 2, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 380
		bodyModel[312].setRotationPoint(-26F, 4.5F, -8.65F);
		bodyModel[312].rotateAngleZ = -0.10471976F;

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 379
		bodyModel[313].setRotationPoint(-27.5F, 3.75F, -8.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 378
		bodyModel[314].setRotationPoint(-27.5F, 5F, -8.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 377
		bodyModel[315].setRotationPoint(-27.5F, 3F, -8.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[316].setRotationPoint(-30.5F, 5.75F, -8.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 375
		bodyModel[317].setRotationPoint(-30.5F, 2.25F, -8.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 377
		bodyModel[318].setRotationPoint(-2F, 6F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 376
		bodyModel[319].setRotationPoint(10F, 6F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 375
		bodyModel[320].setRotationPoint(-14F, 6F, -7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[321].setRotationPoint(-24F, 6F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 370
		bodyModel[322].setRotationPoint(-26F, 6F, -7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[323].setRotationPoint(-19.25F, 0F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[324].setRotationPoint(-19.25F, 1F, -6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[325].setRotationPoint(-19.25F, 1F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[326].setRotationPoint(-19.25F, 8F, -9F);

		bodyModel[327].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 364
		bodyModel[327].setRotationPoint(1.5F, 6F, -5F);

		bodyModel[328].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 363
		bodyModel[328].setRotationPoint(1.5F, 6F, 3F);

		bodyModel[329].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 362
		bodyModel[329].setRotationPoint(-10.5F, 6F, -5F);

		bodyModel[330].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 361
		bodyModel[330].setRotationPoint(-10.5F, 6F, 3F);

		bodyModel[331].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 360
		bodyModel[331].setRotationPoint(-22.5F, 6F, 3F);

		bodyModel[332].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 359
		bodyModel[332].setRotationPoint(-22.5F, 6F, -5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull
		bodyModel[333].setRotationPoint(-30F, -0.25F, -10.25F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull
		bodyModel[334].setRotationPoint(-30F, -2.25F, -10.25F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[335].setRotationPoint(-38.5F, 2.75F, 6.25F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 351
		bodyModel[336].setRotationPoint(-38.5F, -2.25F, 7.25F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[337].setRotationPoint(-38F, -2F, 5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[338].setRotationPoint(-38F, -2F, 6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[339].setRotationPoint(-38F, -3F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 347
		bodyModel[340].setRotationPoint(-38.5F, -2.25F, -10.25F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[341].setRotationPoint(-38F, -2F, -6F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 345
		bodyModel[342].setRotationPoint(-38.5F, 2.75F, -10.25F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[343].setRotationPoint(-37.5F, -5F, 6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 343
		bodyModel[344].setRotationPoint(-37.5F, -7F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[345].setRotationPoint(-37.5F, -10F, 8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 341
		bodyModel[346].setRotationPoint(-43.5F, -3.5F, 4F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,-3F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, -0.5F, -3F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 340
		bodyModel[347].setRotationPoint(-43.5F, -3.5F, -4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 338
		bodyModel[348].setRotationPoint(-31.25F, -19F, 6F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[349].setRotationPoint(-31.5F, -21F, 6F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 336
		bodyModel[350].setRotationPoint(-37F, -17F, 8F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 335
		bodyModel[351].setRotationPoint(-35.75F, -22F, 4F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 1.5F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 1.5F, 0F, -1F); // Box 334
		bodyModel[352].setRotationPoint(-35.5F, -21F, 9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[353].setRotationPoint(38.25F, 0.5F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[354].setRotationPoint(37.25F, -0.5F, -10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[355].setRotationPoint(21.25F, -1.5F, -10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[356].setRotationPoint(17.25F, -3.5F, -10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[357].setRotationPoint(7.25F, -3.5F, -10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[358].setRotationPoint(-26.5F, -10F, -9.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[359].setRotationPoint(-32.5F, -14F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[360].setRotationPoint(-33.5F, -17F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 315
		bodyModel[361].setRotationPoint(-35.75F, -22F, -5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 313
		bodyModel[362].setRotationPoint(-35.75F, -21F, -6F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 312
		bodyModel[363].setRotationPoint(-33.5F, -21F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 473
		bodyModel[364].setRotationPoint(-35.75F, -20F, -10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322 
		bodyModel[365].setRotationPoint(-45F, -0.5F, -4.26F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 320
		bodyModel[366].setRotationPoint(-45F, -1F, -7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 319
		bodyModel[367].setRotationPoint(-42F, -3F, -10.74F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 318
		bodyModel[368].setRotationPoint(-40F, -5.5F, -10.74F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[369].setRotationPoint(-42F, -3F, 8.74F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 315
		bodyModel[370].setRotationPoint(-40F, -5.5F, 8.74F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 314
		bodyModel[371].setRotationPoint(14F, -6F, 8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 313
		bodyModel[372].setRotationPoint(12F, -8F, 9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 312
		bodyModel[373].setRotationPoint(1F, -10F, 9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 311
		bodyModel[374].setRotationPoint(-7F, -8F, 9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 310
		bodyModel[375].setRotationPoint(-34F, -6F, 8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 309
		bodyModel[376].setRotationPoint(-38F, -6F, 8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		bodyModel[377].setRotationPoint(-38F, -6F, 9F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307
		bodyModel[378].setRotationPoint(-32F, -6F, 8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 306
		bodyModel[379].setRotationPoint(-40F, -6F, 8F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 289
		bodyModel[380].setRotationPoint(1F, -8F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 288
		bodyModel[381].setRotationPoint(2F, -9F, -11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		bodyModel[382].setRotationPoint(11F, -6F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 286
		bodyModel[383].setRotationPoint(-34F, -6F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 285
		bodyModel[384].setRotationPoint(-38F, -6F, -9F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 284
		bodyModel[385].setRotationPoint(-38F, -6F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 283
		bodyModel[386].setRotationPoint(-32F, -6F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 282
		bodyModel[387].setRotationPoint(-40F, -6F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 284
		bodyModel[388].setRotationPoint(-36F, -9F, -9.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[389].setRotationPoint(-40.51F, -20.5F, -8.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 0, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[390].setRotationPoint(-41.51F, -17.5F, -5.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[391].setRotationPoint(-41.75F, -10F, -5.75F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[392].setRotationPoint(-41.75F, -15F, -5.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 279
		bodyModel[393].setRotationPoint(-40.75F, -9.5F, -8.75F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[394].setRotationPoint(-40.75F, -15.5F, -8.75F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 216
		bodyModel[395].setRotationPoint(-36F, -9F, 6.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 278
		bodyModel[396].setRotationPoint(-39F, -0.5F, -5.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 2, 4, 11, 0F); // Box 277
		bodyModel[397].setRotationPoint(-41F, -1.5F, -5.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[398].setRotationPoint(-42F, -0.5F, -5.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[399].setRotationPoint(-38F, -4F, -4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[400].setRotationPoint(-38F, -2F, -5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[401].setRotationPoint(-38F, 2F, 10F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 272
		bodyModel[402].setRotationPoint(-38F, -2F, 10F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 271
		bodyModel[403].setRotationPoint(-38F, 6F, 9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 270
		bodyModel[404].setRotationPoint(-38F, 6F, 5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[405].setRotationPoint(-38F, -3F, 10F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[406].setRotationPoint(-38F, 2F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[407].setRotationPoint(-38F, -2F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 264
		bodyModel[408].setRotationPoint(-38F, 6F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 263
		bodyModel[409].setRotationPoint(-38F, 6F, -9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[410].setRotationPoint(-38F, -2F, -7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[411].setRotationPoint(-38F, -3F, -10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[412].setRotationPoint(-38F, -3F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[413].setRotationPoint(-44F, -13F, -1.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[414].setRotationPoint(-44F, -14F, -1.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 254
		bodyModel[415].setRotationPoint(-45F, -13.5F, 1.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[416].setRotationPoint(-45F, -13.5F, -2.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box cull
		bodyModel[417].setRotationPoint(-45F, -11F, -2F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[418].setRotationPoint(42F, -18.5F, 5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 250
		bodyModel[419].setRotationPoint(42F, -18.5F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 248
		bodyModel[420].setRotationPoint(43F, -20.5F, 10F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 247
		bodyModel[421].setRotationPoint(43F, -20.5F, -11F);

		bodyModel[422].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 246
		bodyModel[422].setRotationPoint(42F, -18.5F, 6F);

		bodyModel[423].addBox(0F, 0F, 0F, 1, 15, 5, 0F); // Box 245
		bodyModel[423].setRotationPoint(42F, -18.5F, -11F);

		bodyModel[424].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 244
		bodyModel[424].setRotationPoint(34F, -1.5F, -6F);

		bodyModel[425].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 243
		bodyModel[425].setRotationPoint(34F, -3.5F, -7F);

		bodyModel[426].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 242
		bodyModel[426].setRotationPoint(34F, -3.5F, 6F);

		bodyModel[427].addBox(0F, 0F, 0F, 15, 0, 4, 0F); // Box 241
		bodyModel[427].setRotationPoint(28F, -3.49F, 7F);

		bodyModel[428].addBox(0F, 0F, 0F, 15, 0, 4, 0F); // Box 240
		bodyModel[428].setRotationPoint(28F, -3.49F, -11F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 235
		bodyModel[429].setRotationPoint(28F, -20.5F, 4F);

		bodyModel[430].addBox(0F, 0F, 0F, 1, 17, 7, 0F); // Box 234
		bodyModel[430].setRotationPoint(28F, -20.5F, -11F);

		bodyModel[431].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 233
		bodyModel[431].setRotationPoint(29F, -20.5F, 10F);

		bodyModel[432].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 232
		bodyModel[432].setRotationPoint(29F, -20.5F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 230
		bodyModel[433].setRotationPoint(27F, -22.5F, 8F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 22, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 228
		bodyModel[434].setRotationPoint(27F, -22.5F, -11F);

		bodyModel[435].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 370
		bodyModel[435].setRotationPoint(42F, -22.5F, -8F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 368
		bodyModel[436].setRotationPoint(28F, -22.5F, -8F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57
		bodyModel[437].setRotationPoint(27F, -24F, -8F);

		bodyModel[438].addBox(0F, 0F, 0F, 22, 1, 6, 0F); // Box 135
		bodyModel[438].setRotationPoint(27F, -23.5F, -3F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[439].setRotationPoint(27F, -24F, 3F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[440].setRotationPoint(-27F, -23.5F, -0.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[441].setRotationPoint(-27F, -22.5F, -0.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 11F, -0.05F, -0.05F, 11F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 11F, -0.05F, -0.05F, 11F); // Box 207
		bodyModel[442].setRotationPoint(-39.5F, -22.5F, -6.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[443].setRotationPoint(33.5F, -16.5F, 4.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 223 cull
		bodyModel[444].setRotationPoint(19F, -22.5F, -1F);

		bodyModel[445].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 222 cull
		bodyModel[445].setRotationPoint(17F, -22.5F, -2F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 221 cull
		bodyModel[446].setRotationPoint(16F, -22.5F, -1F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 17, 4, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[447].setRotationPoint(33.5F, -16.5F, -8.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.6F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[448].setRotationPoint(33.5F, -20.5F, 4.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 21, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[449].setRotationPoint(33.5F, -20.5F, -4.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -4F, 0F, -0.6F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[450].setRotationPoint(33.5F, -20.5F, -8.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box cull
		bodyModel[451].setRotationPoint(-44F, -11F, -2F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 glow front lamp
		bodyModel[452].setRotationPoint(-45.5F, -14F, -1.5F);

		bodyModel[453].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 56
		bodyModel[453].setRotationPoint(-45F, -14F, -1.5F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 229
		bodyModel[454].setRotationPoint(6.5F, -21.5F, -1.5F);

		bodyModel[455].addBox(-1F, -1F, 0F, 2, 2, 3, 0F); // Box 201
		bodyModel[455].setRotationPoint(7F, -22.5F, -1.5F);
		bodyModel[455].rotateAngleZ = 0.78539816F;

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[456].setRotationPoint(-37F, -22F, -6F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[457].setRotationPoint(-40F, -22F, -6F);

		bodyModel[458].addBox(0F, 0F, 0F, 2, 4, 12, 0F); // Box 130
		bodyModel[458].setRotationPoint(-39F, -23F, -6F);

		bodyModel[459].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 166
		bodyModel[459].setRotationPoint(-35.5F, -24F, -2F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F); // Box 204
		bodyModel[460].setRotationPoint(-19F, -22.5F, -3.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 203
		bodyModel[461].setRotationPoint(-23F, -22.5F, -4.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 202
		bodyModel[462].setRotationPoint(-24F, -22.5F, -3.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 201
		bodyModel[463].setRotationPoint(-23F, -21F, -4.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 199
		bodyModel[464].setRotationPoint(-19F, -21F, -3.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 197
		bodyModel[465].setRotationPoint(-19F, -23.5F, -3.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 196
		bodyModel[466].setRotationPoint(-24F, -21F, -3.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 194
		bodyModel[467].setRotationPoint(-24F, -23.5F, -3.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 193
		bodyModel[468].setRotationPoint(-23F, -23.5F, -3.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 256
		bodyModel[469].setRotationPoint(-14F, -21.5F, -2.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 255
		bodyModel[470].setRotationPoint(-8F, -21.5F, -2.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 254
		bodyModel[471].setRotationPoint(-13F, -21.5F, -3.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 252
		bodyModel[472].setRotationPoint(-8F, -23F, -2.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 251
		bodyModel[473].setRotationPoint(-14F, -23F, -2.5F);

		bodyModel[474].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 250
		bodyModel[474].setRotationPoint(-13F, -23F, -3.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 249
		bodyModel[475].setRotationPoint(-14F, -23.5F, -2.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 248
		bodyModel[476].setRotationPoint(-13F, -23.5F, -2.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[477].setRotationPoint(-41.5F, -14.5F, 2.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[478].setRotationPoint(-41.5F, -14.5F, -5.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 181
		bodyModel[479].setRotationPoint(-41.5F, -9.5F, 2.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[480].setRotationPoint(-41.5F, -9.5F, -5.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[481].setRotationPoint(-41.5F, -17.5F, -2.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[482].setRotationPoint(-41.5F, -17.5F, 2.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[483].setRotationPoint(-41.5F, -17.5F, -5.5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -1.5F, 1F, 0F); // Box 162
		bodyModel[484].setRotationPoint(15.5F, -2.5F, -9F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F,0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 161
		bodyModel[485].setRotationPoint(15.5F, -20.5F, 4.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 18, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 160
		bodyModel[486].setRotationPoint(15.5F, -16.5F, -9F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 18, 4, 9, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 158
		bodyModel[487].setRotationPoint(15.5F, -20.5F, -4.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F,0F, -3.5F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 157
		bodyModel[488].setRotationPoint(15.5F, -20.5F, -8.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 27, 17, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 156
		bodyModel[489].setRotationPoint(-28.5F, -20.5F, -4.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 27, 9, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 4.5F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 4.5F, -0.5F, 0F, 4F, 0F); // Box 149
		bodyModel[490].setRotationPoint(-28.5F, -16.5F, -8.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 145
		bodyModel[491].setRotationPoint(-1.5F, -17F, -9F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 17, 18, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[492].setRotationPoint(-1.5F, -21F, -5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[493].setRotationPoint(-40.5F, -16.5F, 4.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 19
		bodyModel[494].setRotationPoint(-40.5F, -16.5F, -8.5F);

		bodyModel[495].addBox(0F, 0F, 0F, 12, 17, 9, 0F); // Box 18
		bodyModel[495].setRotationPoint(-40.5F, -20.5F, -4.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 135
		bodyModel[496].setRotationPoint(32F, 1F, 6F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 134
		bodyModel[497].setRotationPoint(29.5F, 1.5F, 6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 133
		bodyModel[498].setRotationPoint(26.5F, 1.5F, 6F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 132
		bodyModel[499].setRotationPoint(26F, 1F, 6F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 454
		bodyModel[501] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 453
		bodyModel[502] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 214
		bodyModel[503] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 211
		bodyModel[504] = new ModelRendererTurbo(this, 96, 219, textureX, textureY); // Box 119
		bodyModel[505] = new ModelRendererTurbo(this, 96, 219, textureX, textureY); // Box 118
		bodyModel[506] = new ModelRendererTurbo(this, 105, 220, textureX, textureY); // Box 117
		bodyModel[507] = new ModelRendererTurbo(this, 105, 220, textureX, textureY); // Box 116
		bodyModel[508] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 415
		bodyModel[509] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 113
		bodyModel[510] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 112
		bodyModel[511] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 111
		bodyModel[512] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 109
		bodyModel[513] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 107
		bodyModel[514] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 105
		bodyModel[515] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 104
		bodyModel[516] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 102
		bodyModel[517] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 100
		bodyModel[518] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 99
		bodyModel[519] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
		bodyModel[520] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 97
		bodyModel[521] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 96
		bodyModel[522] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 95
		bodyModel[523] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 103
		bodyModel[524] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 102
		bodyModel[525] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 101
		bodyModel[526] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 100
		bodyModel[527] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 99
		bodyModel[528] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 98
		bodyModel[529] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 97
		bodyModel[530] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 96
		bodyModel[531] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 95
		bodyModel[532] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 1
		bodyModel[533] = new ModelRendererTurbo(this, 347, 19, textureX, textureY, "cull"); // Box 93 cull
		bodyModel[534] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 92
		bodyModel[535] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 91
		bodyModel[536] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 90
		bodyModel[537] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 88
		bodyModel[538] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 86
		bodyModel[539] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 85
		bodyModel[540] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 84
		bodyModel[541] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 83
		bodyModel[542] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 81
		bodyModel[543] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 80
		bodyModel[544] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 76
		bodyModel[545] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 71
		bodyModel[546] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 68
		bodyModel[547] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 67
		bodyModel[548] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 64
		bodyModel[549] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 63
		bodyModel[550] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 60
		bodyModel[551] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 59
		bodyModel[552] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 56
		bodyModel[553] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 55
		bodyModel[554] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[555] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 52
		bodyModel[556] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 51
		bodyModel[557] = new ModelRendererTurbo(this, 340, 240, textureX, textureY, "cull"); // Box cull
		bodyModel[558] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 48
		bodyModel[559] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 47
		bodyModel[560] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 44
		bodyModel[561] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 43
		bodyModel[562] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 95
		bodyModel[563] = new ModelRendererTurbo(this, 325, 240, textureX, textureY); // Box 94
		bodyModel[564] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 38
		bodyModel[565] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 37
		bodyModel[566] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 36
		bodyModel[567] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[568] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		bodyModel[569] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		bodyModel[570] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 32
		bodyModel[571] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 31
		bodyModel[572] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 30
		bodyModel[573] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		bodyModel[574] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 28
		bodyModel[575] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 27
		bodyModel[576] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 26
		bodyModel[577] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[578] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 24
		bodyModel[579] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 23
		bodyModel[580] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[581] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 19
		bodyModel[582] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 18
		bodyModel[583] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 17
		bodyModel[584] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
		bodyModel[585] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		bodyModel[586] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		bodyModel[587] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[588] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 12
		bodyModel[589] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		bodyModel[590] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		bodyModel[591] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[592] = new ModelRendererTurbo(this, 5, 229, textureX, textureY); // Box 1
		bodyModel[593] = new ModelRendererTurbo(this, 100, 159, textureX, textureY); // Box 138 fmsr pilot beam
		bodyModel[594] = new ModelRendererTurbo(this, 104, 165, textureX, textureY); // Box 214 fmsr pin puller
		bodyModel[595] = new ModelRendererTurbo(this, 96, 190, textureX, textureY); // Box 595 fmsr steppy
		bodyModel[596] = new ModelRendererTurbo(this, 100, 195, textureX, textureY, "cull"); // Box 596 cull fmsr step support
		bodyModel[597] = new ModelRendererTurbo(this, 54, 164, textureX, textureY); // Box 186 fmsr step support
		bodyModel[598] = new ModelRendererTurbo(this, 52, 190, textureX, textureY); // Box 187 fmsr pilot step
		bodyModel[599] = new ModelRendererTurbo(this, 89, 193, textureX, textureY, "cull"); // Box 240 cull fmsr headlight baffle
		bodyModel[600] = new ModelRendererTurbo(this, 84, 195, textureX, textureY); // Box 600 fmsr bit
		bodyModel[601] = new ModelRendererTurbo(this, 77, 194, textureX, textureY, "cull"); // Box 345 cull fmsr hoses
		bodyModel[602] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 346 fmsr hoses
		bodyModel[603] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 603 fmsr hoses
		bodyModel[604] = new ModelRendererTurbo(this, 71, 173, textureX, textureY, "cull"); // Box 604 cull fmsr handrails
		bodyModel[605] = new ModelRendererTurbo(this, 67, 194, textureX, textureY); // Box 180 fmsr whistle

		bodyModel[500].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 454
		bodyModel[500].setRotationPoint(-41F, 6.25F, -1.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 453
		bodyModel[501].setRotationPoint(-41F, 6.25F, 0.5F);

		bodyModel[502].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 214
		bodyModel[502].setRotationPoint(-35F, 2.25F, -1.5F);

		bodyModel[503].addBox(0F, 0F, 0F, 3, 3, 9, 0F); // Box 211
		bodyModel[503].setRotationPoint(-44F, 5.5F, -4.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[504].setRotationPoint(29.5F, 1.5F, -7F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 118
		bodyModel[505].setRotationPoint(26.5F, 1.5F, -7F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 117
		bodyModel[506].setRotationPoint(26F, 1F, -7F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 116
		bodyModel[507].setRotationPoint(32F, 1F, -7F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[508].setRotationPoint(28.5F, 5F, -9.75F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[509].setRotationPoint(28F, 5.5F, -9F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[510].setRotationPoint(26.5F, 7F, -8F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[511].setRotationPoint(31.5F, 7.5F, -8F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[512].setRotationPoint(27.5F, 8F, -8.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[513].setRotationPoint(34.5F, 5F, -6F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		bodyModel[514].setRotationPoint(32.5F, 5F, -8F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[515].setRotationPoint(23.5F, 5F, -8F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 4F, 0F, -0.5F, 0F); // Box 102
		bodyModel[516].setRotationPoint(15.5F, 6F, 2F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F); // Box 100
		bodyModel[517].setRotationPoint(13.5F, 6F, -2F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 99
		bodyModel[518].setRotationPoint(23.5F, 7F, -8F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 2.5F, 0F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, -2.5F, 0F); // Box 98
		bodyModel[519].setRotationPoint(17.5F, 6F, 3F);

		bodyModel[520].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 97
		bodyModel[520].setRotationPoint(16.5F, 3.5F, 3F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[521].setRotationPoint(13.5F, 2F, 3F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F); // Box 95
		bodyModel[522].setRotationPoint(15.5F, 6F, -4F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 2.5F, 0F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, -2.5F, 0F); // Box 103
		bodyModel[523].setRotationPoint(17.5F, 6F, -5F);

		bodyModel[524].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 102
		bodyModel[524].setRotationPoint(1.5F, 3F, -5F);

		bodyModel[525].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 101
		bodyModel[525].setRotationPoint(-10.5F, 3F, -5F);

		bodyModel[526].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 100
		bodyModel[526].setRotationPoint(-22.5F, 3F, -5F);

		bodyModel[527].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 99
		bodyModel[527].setRotationPoint(1.5F, 3F, 3F);

		bodyModel[528].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 98
		bodyModel[528].setRotationPoint(-10.5F, 3F, 3F);

		bodyModel[529].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 97
		bodyModel[529].setRotationPoint(-22.5F, 3F, 3F);

		bodyModel[530].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 96
		bodyModel[530].setRotationPoint(-48.5F, 3F, -2F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 95
		bodyModel[531].setRotationPoint(-31.5F, 2F, 3F);

		bodyModel[532].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[532].setRotationPoint(-51.5F, 3F, -1.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 93 cull
		bodyModel[533].setRotationPoint(-47.5F, 2F, -8F);

		bodyModel[534].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 92
		bodyModel[534].setRotationPoint(-46.5F, 2F, 3F);

		bodyModel[535].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 91
		bodyModel[535].setRotationPoint(-46.5F, 2F, -5F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 90
		bodyModel[536].setRotationPoint(-31.5F, 2F, -5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 88
		bodyModel[537].setRotationPoint(-39.5F, 4F, 3F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[538].setRotationPoint(-39.5F, 4F, -5F);

		bodyModel[539].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 85
		bodyModel[539].setRotationPoint(-36.5F, 4F, 3F);

		bodyModel[540].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 84
		bodyModel[540].setRotationPoint(-36.5F, 4F, -5F);

		bodyModel[541].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 83
		bodyModel[541].setRotationPoint(39.5F, 2F, -4F);

		bodyModel[542].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 81
		bodyModel[542].setRotationPoint(26.5F, 2F, 2F);

		bodyModel[543].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 80
		bodyModel[543].setRotationPoint(26.5F, 2F, -4F);

		bodyModel[544].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 76
		bodyModel[544].setRotationPoint(16.5F, 3.5F, -5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[545].setRotationPoint(13.5F, 2F, -5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 68
		bodyModel[546].setRotationPoint(11F, -1.5F, 3.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 67
		bodyModel[547].setRotationPoint(7F, -1.5F, 3.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 64
		bodyModel[548].setRotationPoint(11F, -1.5F, -4.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 63
		bodyModel[549].setRotationPoint(7F, -1.5F, -4.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 60
		bodyModel[550].setRotationPoint(-1F, -1.5F, 3.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 59
		bodyModel[551].setRotationPoint(-5F, -1.5F, 3.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 56
		bodyModel[552].setRotationPoint(-1F, -1.5F, -4.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 55
		bodyModel[553].setRotationPoint(-5F, -1.5F, -4.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[554].setRotationPoint(-29F, -2F, 3.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 52
		bodyModel[555].setRotationPoint(-25F, -1.5F, 3.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 51
		bodyModel[556].setRotationPoint(-29F, -1.5F, 3.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box cull
		bodyModel[557].setRotationPoint(-29F, -2F, -4.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 48
		bodyModel[558].setRotationPoint(-25F, -1.5F, -4.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 47
		bodyModel[559].setRotationPoint(-29F, -1.5F, -4.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 44
		bodyModel[560].setRotationPoint(-13F, -1.5F, -4.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 43
		bodyModel[561].setRotationPoint(-17F, -1.5F, -4.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 95
		bodyModel[562].setRotationPoint(-17F, -1.5F, 3.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[563].setRotationPoint(-13F, -1.5F, 3.5F);

		bodyModel[564].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 38
		bodyModel[564].setRotationPoint(8.5F, 3F, 3F);

		bodyModel[565].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 37
		bodyModel[565].setRotationPoint(8.5F, 3F, -5F);

		bodyModel[566].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 36
		bodyModel[566].setRotationPoint(12.5F, 3F, -5F);

		bodyModel[567].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 35
		bodyModel[567].setRotationPoint(12.5F, 3F, 3F);

		bodyModel[568].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 34
		bodyModel[568].setRotationPoint(-3.5F, 3F, 3F);

		bodyModel[569].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 33
		bodyModel[569].setRotationPoint(-3.5F, 3F, -5F);

		bodyModel[570].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 32
		bodyModel[570].setRotationPoint(0.5F, 3F, -5F);

		bodyModel[571].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 31
		bodyModel[571].setRotationPoint(0.5F, 3F, 3F);

		bodyModel[572].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 30
		bodyModel[572].setRotationPoint(-15.5F, 3F, 3F);

		bodyModel[573].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 29
		bodyModel[573].setRotationPoint(-15.5F, 3F, -5F);

		bodyModel[574].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 28
		bodyModel[574].setRotationPoint(-11.5F, 3F, -5F);

		bodyModel[575].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 27
		bodyModel[575].setRotationPoint(-11.5F, 3F, 3F);

		bodyModel[576].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 26
		bodyModel[576].setRotationPoint(-23.5F, 3F, -5F);

		bodyModel[577].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 25
		bodyModel[577].setRotationPoint(-23.5F, 3F, 3F);

		bodyModel[578].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 24
		bodyModel[578].setRotationPoint(-27.5F, 3F, 3F);

		bodyModel[579].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 23
		bodyModel[579].setRotationPoint(-27.5F, 3F, -5F);

		bodyModel[580].addBox(0F, 0F, 0F, 41, 1, 2, 0F); // Box 22
		bodyModel[580].setRotationPoint(-27.5F, 2F, 3F);

		bodyModel[581].addBox(0F, 0F, 0F, 41, 1, 2, 0F); // Box 19
		bodyModel[581].setRotationPoint(-27.5F, 2F, -5F);

		bodyModel[582].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 18
		bodyModel[582].setRotationPoint(9.5F, 3F, -6F);

		bodyModel[583].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 17
		bodyModel[583].setRotationPoint(-2.5F, 3F, -6F);

		bodyModel[584].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 16
		bodyModel[584].setRotationPoint(-14.5F, 3F, -6F);

		bodyModel[585].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 15
		bodyModel[585].setRotationPoint(-26.5F, 3F, -6F);

		bodyModel[586].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 14
		bodyModel[586].setRotationPoint(28.5F, 5F, -6F);

		bodyModel[587].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 13
		bodyModel[587].setRotationPoint(-43.5F, 6F, -6F);

		bodyModel[588].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 12
		bodyModel[588].setRotationPoint(-45.5F, 4F, 6F);

		bodyModel[589].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 11
		bodyModel[589].setRotationPoint(25.5F, 2F, 6F);

		bodyModel[590].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 6
		bodyModel[590].setRotationPoint(-45.5F, 4F, -6F);

		bodyModel[591].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 5
		bodyModel[591].setRotationPoint(25.5F, 2F, -6F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 22, 22, 0, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, 0F, -11F, 0F); // Box 1
		bodyModel[592].setRotationPoint(-30.5F, -1F, -6.01F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 fmsr pilot beam
		bodyModel[593].setRotationPoint(-47.5F, 1.97F, -11F);

		bodyModel[594].addBox(0F, -3F, 0F, 0, 3, 20, 0F); // Box 214 fmsr pin puller
		bodyModel[594].setRotationPoint(-47.5F, 3.5F, -10F);
		bodyModel[594].rotateAngleZ = 0.48869219F;

		bodyModel[595].addShapeBox(0F, 0F, -3F, 22, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 595 fmsr steppy
		bodyModel[595].setRotationPoint(-45F, -1F, -11F);
		bodyModel[595].rotateAngleY = 1.57079633F;

		bodyModel[596].addShapeBox(0F, 0F, -1F, 20, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 596 cull fmsr step support
		bodyModel[596].setRotationPoint(-44F, -0.5F, -10F);
		bodyModel[596].rotateAngleY = 1.57079633F;

		bodyModel[597].addShapeBox(0F, 0F, 0F, 0, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 fmsr step support
		bodyModel[597].setRotationPoint(-47.51F, 4.5F, -10.5F);

		bodyModel[598].addShapeBox(0F, 0F, -2F, 21, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 fmsr pilot step
		bodyModel[598].setRotationPoint(-49.51F, 8.5F, -10.5F);
		bodyModel[598].rotateAngleY = 1.57079633F;

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 240 cull fmsr headlight baffle
		bodyModel[599].setRotationPoint(-46F, -14F, -1.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 600 fmsr bit
		bodyModel[600].setRotationPoint(-37F, -24F, 4F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345 cull fmsr hoses
		bodyModel[601].setRotationPoint(-48.5F, 1.95F, 3F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, -0.625F, 0F, 0F, 0.625F, 0F, 0F); // Box 346 fmsr hoses
		bodyModel[602].setRotationPoint(-48.5F, 3.45F, 3F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603 fmsr hoses
		bodyModel[603].setRotationPoint(-49.5F, 6.45F, 3F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,-0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 13F, -0.5F, 0F, 13F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 13F, -0.5F, 0F, 13F); // Box 604 cull fmsr handrails
		bodyModel[604].setRotationPoint(-47F, -5.5F, -8F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 180 fmsr whistle
		bodyModel[605].setRotationPoint(15F, -23F, 2.25F);
		bodyModel[605].rotateAngleZ = 0.9250245F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
	}
}