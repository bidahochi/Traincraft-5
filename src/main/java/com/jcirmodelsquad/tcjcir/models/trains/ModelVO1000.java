//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.02.2020 - 15:35:18
// Last changed on: 23.02.2020 - 15:35:18

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeAnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelVO1000 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelVO1000() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[263];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 180, -2, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // box20
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // box21
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // box22
		bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // box23
		bodyModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // box03
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // box08
		bodyModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // box24
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // box25
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // box28
		bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // box29
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box48
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box50
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // box51
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // box56
		bodyModel[20] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // box57
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // box58
		bodyModel[22] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // box04
		bodyModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // box70
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // box81
		bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // box82
		bodyModel[26] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 134
		bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 135
		bodyModel[28] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 217
		bodyModel[29] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 371
		bodyModel[30] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 372
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 376
		bodyModel[32] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 377
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "lamp"); // Front headlight lamp
		bodyModel[34] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 389
		bodyModel[35] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 467
		bodyModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 468
		bodyModel[37] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // box64
		bodyModel[38] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // box65
		bodyModel[39] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 478
		bodyModel[40] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 479
		bodyModel[41] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 485
		bodyModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 487
		bodyModel[43] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 488
		bodyModel[44] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 489
		bodyModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 490
		bodyModel[46] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 491
		bodyModel[47] = new ModelRendererTurbo(this, 175, 25, textureX, textureY); // Box 494
		bodyModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 497
		bodyModel[49] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 500
		bodyModel[50] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 501
		bodyModel[51] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 502
		bodyModel[52] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 503
		bodyModel[53] = new ModelRendererTurbo(this, 100, 21, textureX, textureY); // Box 504
		bodyModel[54] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 505
		bodyModel[55] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 506
		bodyModel[56] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 512
		bodyModel[57] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 513
		bodyModel[58] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 514
		bodyModel[59] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 515
		bodyModel[60] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 516
		bodyModel[61] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 518
		bodyModel[62] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 523
		bodyModel[63] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 524
		bodyModel[64] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 525
		bodyModel[65] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 526
		bodyModel[66] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 528
		bodyModel[67] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 529
		bodyModel[68] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 530
		bodyModel[69] = new ModelRendererTurbo(this, 473, 9, textureX, textureY, "lamp"); // Back headlight lamp
		bodyModel[70] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 534
		bodyModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 535
		bodyModel[72] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 536
		bodyModel[73] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 537
		bodyModel[74] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 538
		bodyModel[75] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 539
		bodyModel[76] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 540
		bodyModel[77] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 541
		bodyModel[78] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 542
		bodyModel[79] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 543
		bodyModel[80] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 545
		bodyModel[81] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 546
		bodyModel[82] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 547
		bodyModel[83] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 548
		bodyModel[84] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 549
		bodyModel[85] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 550
		bodyModel[86] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 551
		bodyModel[87] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 552
		bodyModel[88] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 554
		bodyModel[89] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 555
		bodyModel[90] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 708
		bodyModel[91] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 709
		bodyModel[92] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 710
		bodyModel[93] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 711
		bodyModel[94] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 712
		bodyModel[95] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 713
		bodyModel[96] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 792
		bodyModel[97] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 74
		bodyModel[99] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 78
		bodyModel[100] = new ModelRendererTurbo(this, 93, 43, textureX, textureY); // Box 875
		bodyModel[101] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 876
		bodyModel[102] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 877
		bodyModel[103] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 878
		bodyModel[104] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 879
		bodyModel[105] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 314 door swing right
		bodyModel[106] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 315 door swing right
		bodyModel[107] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 883
		bodyModel[108] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 884
		bodyModel[109] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 887
		bodyModel[110] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 888
		bodyModel[111] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 889
		bodyModel[112] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 890
		bodyModel[113] = new ModelRendererTurbo(this, 49, 49, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[114] = new ModelRendererTurbo(this, 95, 51, textureX, textureY); // Box 165
		bodyModel[115] = new ModelRendererTurbo(this, 273, 49, textureX, textureY, "lamp"); // Box 897 liveryimg 1
		bodyModel[116] = new ModelRendererTurbo(this, 289, 49, textureX, textureY, "lamp"); // Box 898 liveryimg 1
		bodyModel[117] = new ModelRendererTurbo(this, 305, 49, textureX, textureY, "lamp"); // Box 899 liveryimg 1
		bodyModel[118] = new ModelRendererTurbo(this, 457, 49, textureX, textureY, "lamp"); // Box 900 liveryimg 1
		bodyModel[119] = new ModelRendererTurbo(this, 481, 49, textureX, textureY, "lamp"); // Box 901 liveryimg 1
		bodyModel[120] = new ModelRendererTurbo(this, 273, 49, textureX, textureY, "lamp"); // Box 902 liveryimg 2
		bodyModel[121] = new ModelRendererTurbo(this, 289, 49, textureX, textureY, "lamp"); // Box 903 liveryimg 2
		bodyModel[122] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 174
		bodyModel[123] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 175
		bodyModel[124] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 177
		bodyModel[125] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 178
		bodyModel[126] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 179
		bodyModel[127] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 180
		bodyModel[128] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 181
		bodyModel[129] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 184
		bodyModel[130] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 187
		bodyModel[131] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 188
		bodyModel[132] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 196
		bodyModel[133] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 197
		bodyModel[134] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 555
		bodyModel[135] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 2
		bodyModel[136] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 2
		bodyModel[137] = new ModelRendererTurbo(this, 169, 57, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[138] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 165
		bodyModel[139] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 196
		bodyModel[140] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 196
		bodyModel[141] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 879
		bodyModel[142] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 879
		bodyModel[143] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 879
		bodyModel[144] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // box03
		bodyModel[145] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // box03
		bodyModel[146] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // box03
		bodyModel[147] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // box03
		bodyModel[148] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // box03
		bodyModel[149] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // box03
		bodyModel[150] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // box03
		bodyModel[151] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // box03
		bodyModel[152] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // box03
		bodyModel[153] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // box03
		bodyModel[154] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // box03
		bodyModel[155] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 879
		bodyModel[156] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // box03
		bodyModel[157] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // box03
		bodyModel[158] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 547
		bodyModel[159] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 547
		bodyModel[160] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 547
		bodyModel[161] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 534
		bodyModel[162] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 535
		bodyModel[163] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 536
		bodyModel[164] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 537
		bodyModel[165] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 538
		bodyModel[166] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 539
		bodyModel[167] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 540
		bodyModel[168] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // box03
		bodyModel[169] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // box03
		bodyModel[170] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 184
		bodyModel[171] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 184
		bodyModel[172] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 184
		bodyModel[173] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 184
		bodyModel[174] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 184
		bodyModel[175] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 184
		bodyModel[176] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 184
		bodyModel[177] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 184
		bodyModel[178] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 184
		bodyModel[179] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 184
		bodyModel[180] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 184
		bodyModel[181] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 184
		bodyModel[182] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 184
		bodyModel[185] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // box56
		bodyModel[186] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // box57
		bodyModel[187] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // box58
		bodyModel[188] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // box56
		bodyModel[189] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // box57
		bodyModel[190] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // box58
		bodyModel[191] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // box56
		bodyModel[192] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // box57
		bodyModel[193] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // box58
		bodyModel[194] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // box56
		bodyModel[195] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // box57
		bodyModel[196] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // box58
		bodyModel[197] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 518
		bodyModel[198] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 523
		bodyModel[199] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 489
		bodyModel[200] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 494
		bodyModel[201] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 0
		bodyModel[203] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 0
		bodyModel[204] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 184
		bodyModel[205] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 184
		bodyModel[206] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 879
		bodyModel[207] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 184
		bodyModel[208] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 184
		bodyModel[209] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 184
		bodyModel[210] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 184
		bodyModel[211] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 875
		bodyModel[212] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 875
		bodyModel[213] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 184
		bodyModel[214] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 184
		bodyModel[215] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 184
		bodyModel[216] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 184
		bodyModel[217] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 184
		bodyModel[218] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 184
		bodyModel[219] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 184
		bodyModel[220] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 879
		bodyModel[221] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // box56
		bodyModel[222] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // box57
		bodyModel[223] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // box58
		bodyModel[224] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // box56
		bodyModel[225] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // box57
		bodyModel[226] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // box58
		bodyModel[227] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[228] = new ModelRendererTurbo(this, 137, 89, textureX, textureY, "lamp"); // Back left lamp
		bodyModel[229] = new ModelRendererTurbo(this, 145, 89, textureX, textureY, "lamp"); // Back right lamp
		bodyModel[230] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 147
		bodyModel[231] = new ModelRendererTurbo(this, 169, 89, textureX, textureY, "lamp"); // Box 148 glow
		bodyModel[232] = new ModelRendererTurbo(this, 177, 89, textureX, textureY, "lamp"); // Top front lamp
		bodyModel[233] = new ModelRendererTurbo(this, 193, 89, textureX, textureY, "lamp"); // Bottom front lamp
		bodyModel[234] = new ModelRendererTurbo(this, 209, 89, textureX, textureY, "lamp"); // Box 173 glow
		bodyModel[235] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 147
		bodyModel[236] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // box25
		bodyModel[237] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 879
		bodyModel[238] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 879
		bodyModel[239] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // box03
		bodyModel[240] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // box03
		bodyModel[241] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // box03
		bodyModel[242] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // box03
		bodyModel[243] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // box03
		bodyModel[244] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // box03
		bodyModel[245] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // box03
		bodyModel[246] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // box03
		bodyModel[247] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // box03
		bodyModel[248] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // box03
		bodyModel[249] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 890
		bodyModel[250] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 177
		bodyModel[251] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 890
		bodyModel[252] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 196
		bodyModel[253] = new ModelRendererTurbo(this, 225, 17, textureX, textureY, "lamp"); // Box 902 liveryimg 2
		bodyModel[254] = new ModelRendererTurbo(this, 233, 17, textureX, textureY, "lamp"); // Box 903 liveryimg 2
		bodyModel[255] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 555
		bodyModel[256] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 887
		bodyModel[257] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 888
		bodyModel[258] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 177
		bodyModel[259] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 548
		bodyModel[260] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 548
		bodyModel[261] = new ModelRendererTurbo(this, 115, 107, textureX, textureY); // Box 67
		bodyModel[262] = new ModelRendererTurbo(this, 104, 108, textureX, textureY); // Box 70

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-29.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		bodyModel[1].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[2].setRotationPoint(32.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 5
		bodyModel[3].setRotationPoint(-32.5F, 0F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 6
		bodyModel[4].setRotationPoint(-32.51F, 0F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // box20
		bodyModel[5].setRotationPoint(17.5F, -18F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box21
		bodyModel[6].setRotationPoint(18.5F, -18F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box22
		bodyModel[7].setRotationPoint(18.5F, -18F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // box23
		bodyModel[8].setRotationPoint(28.5F, -18F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 20
		bodyModel[9].setRotationPoint(29.5F, 0F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 46, 18, 14, 0F); // box03
		bodyModel[10].setRotationPoint(-28.5F, -17F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // box08
		bodyModel[11].setRotationPoint(17.5F, -22F, -3F);

		bodyModel[12].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // box24
		bodyModel[12].setRotationPoint(7.5F, -5F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // box25
		bodyModel[13].setRotationPoint(7.5F, -5F, 7F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // box28
		bodyModel[14].setRotationPoint(5.5F, -2.5F, 7F);

		bodyModel[15].addBox(0F, 0F, -14F, 2, 0, 4, 0F); // box29
		bodyModel[15].setRotationPoint(5.5F, -2.5F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box48
		bodyModel[16].setRotationPoint(16.5F, -9F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box50
		bodyModel[17].setRotationPoint(15.5F, -7F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box51
		bodyModel[18].setRotationPoint(13.5F, -6F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
		bodyModel[19].setRotationPoint(13.5F, -6F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
		bodyModel[20].setRotationPoint(15.5F, -7F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
		bodyModel[21].setRotationPoint(16.5F, -9F, 11F);

		bodyModel[22].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // box04
		bodyModel[22].setRotationPoint(-6.5F, 2F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // box70
		bodyModel[23].setRotationPoint(-5.5F, 2F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // box81
		bodyModel[24].setRotationPoint(4.5F, 0.5F, -8.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // box82
		bodyModel[25].setRotationPoint(-6.5F, 0.5F, -8.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 134
		bodyModel[26].setRotationPoint(-5.5F, 2F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 135
		bodyModel[27].setRotationPoint(-5.5F, 2F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 217
		bodyModel[28].setRotationPoint(-32.5F, -8F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[29].setRotationPoint(17.5F, -19F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[30].setRotationPoint(17.5F, -21F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[31].setRotationPoint(17.5F, -22F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[32].setRotationPoint(17.5F, -22F, 3F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Front headlight lamp
		bodyModel[33].setRotationPoint(-30F, -20F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 389
		bodyModel[34].setRotationPoint(17.5F, -21F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[35].setRotationPoint(17.5F, -21F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[36].setRotationPoint(17.5F, -19F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[37].setRotationPoint(20F, -18F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[38].setRotationPoint(20F, -18F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		bodyModel[39].setRotationPoint(-32.5F, -8F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 479
		bodyModel[40].setRotationPoint(-32.5F, -6F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 485
		bodyModel[41].setRotationPoint(-32.5F, 6F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 487
		bodyModel[42].setRotationPoint(-32.5F, 2F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 488
		bodyModel[43].setRotationPoint(-32.5F, 4F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		bodyModel[44].setRotationPoint(-29.5F, 1F, -8F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 490
		bodyModel[45].setRotationPoint(-32.5F, 4F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 491
		bodyModel[46].setRotationPoint(-32.5F, 6F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[47].setRotationPoint(-29.5F, 1F, 6F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 497
		bodyModel[48].setRotationPoint(-32.5F, 2F, 8F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 500
		bodyModel[49].setRotationPoint(-32.5F, -6F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 501
		bodyModel[50].setRotationPoint(-32.5F, -8F, 9F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 502
		bodyModel[51].setRotationPoint(-35.5F, 7F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 503
		bodyModel[52].setRotationPoint(-35.5F, 7F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 22, 0F); // Box 504
		bodyModel[53].setRotationPoint(32.51F, 0F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 505
		bodyModel[54].setRotationPoint(32.5F, 7F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 506
		bodyModel[55].setRotationPoint(32.5F, 7F, 3F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 512
		bodyModel[56].setRotationPoint(32.5F, -6F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 513
		bodyModel[57].setRotationPoint(32.5F, -8F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 514
		bodyModel[58].setRotationPoint(32.5F, -8F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 515
		bodyModel[59].setRotationPoint(32.5F, -8F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 516
		bodyModel[60].setRotationPoint(32.5F, -6F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 518
		bodyModel[61].setRotationPoint(29.5F, 1F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 523
		bodyModel[62].setRotationPoint(29.5F, 1F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 524
		bodyModel[63].setRotationPoint(29.5F, 6F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 525
		bodyModel[64].setRotationPoint(29.5F, 4F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 526
		bodyModel[65].setRotationPoint(29.5F, 2F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 528
		bodyModel[66].setRotationPoint(29.5F, 6F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 529
		bodyModel[67].setRotationPoint(29.5F, 4F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 530
		bodyModel[68].setRotationPoint(29.5F, 2F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Back headlight lamp
		bodyModel[69].setRotationPoint(29F, -21F, -1.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		bodyModel[70].setRotationPoint(29.5F, -19F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 535
		bodyModel[71].setRotationPoint(29.5F, -21F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[72].setRotationPoint(29.5F, -19F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 537
		bodyModel[73].setRotationPoint(29.5F, -21F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[74].setRotationPoint(29.5F, -22F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[75].setRotationPoint(29.5F, -22F, 3F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 540
		bodyModel[76].setRotationPoint(29.5F, -22F, -3F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 541
		bodyModel[77].setRotationPoint(-29.5F, -6F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 542
		bodyModel[78].setRotationPoint(-29.5F, -8F, 11F);

		bodyModel[79].addBox(0F, 0F, 0F, 30, 8, 0, 0F); // Box 543
		bodyModel[79].setRotationPoint(-27.5F, -8F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 545
		bodyModel[80].setRotationPoint(-24.5F, -8F, 11F);

		bodyModel[81].addBox(0F, 0F, 0F, 11, 1, 0, 0F); // Box 546
		bodyModel[81].setRotationPoint(6.5F, -12F, 11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 547
		bodyModel[82].setRotationPoint(2.5F, -12F, 11F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 548
		bodyModel[83].setRotationPoint(9.5F, -11F, 11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 549
		bodyModel[84].setRotationPoint(-24.5F, -8F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 30, 8, 0, 0F); // Box 550
		bodyModel[85].setRotationPoint(-27.5F, -8F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 551
		bodyModel[86].setRotationPoint(10.5F, -11F, -11F);

		bodyModel[87].addBox(0F, 0F, 0F, 11, 1, 0, 0F); // Box 552
		bodyModel[87].setRotationPoint(6.5F, -12F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 554
		bodyModel[88].setRotationPoint(-29.5F, -8F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 555
		bodyModel[89].setRotationPoint(-29.5F, -6F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 708
		bodyModel[90].setRotationPoint(4.5F, 0.5F, 7.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 709
		bodyModel[91].setRotationPoint(-5.5F, 2F, 8F);

		bodyModel[92].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 710
		bodyModel[92].setRotationPoint(-5.5F, 2F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 711
		bodyModel[93].setRotationPoint(-5.5F, 2F, 6F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 712
		bodyModel[94].setRotationPoint(-6.5F, 0.5F, 7.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		bodyModel[95].setRotationPoint(-20.5F, 2F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 792
		bodyModel[96].setRotationPoint(15.5F, 2F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[97].setRotationPoint(7F, -22F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[98].setRotationPoint(7F, -23F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[99].setRotationPoint(7.25F, -21.5F, -0.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 875
		bodyModel[100].setRotationPoint(7F, -23F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[101].setRotationPoint(7F, -23F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[102].setRotationPoint(7.25F, -23.25F, -2F);

		bodyModel[103].addBox(0F, 0F, 0F, 12, 5, 22, 0F); // Box 878
		bodyModel[103].setRotationPoint(17.5F, -5F, -11F);

		bodyModel[104].addBox(0F, 0F, 0F, 37, 0, 16, 0F); // Box 879
		bodyModel[104].setRotationPoint(-22.5F, -13F, -8F);

		bodyModel[105].addBox(-0.5F, 0F, -5.5F, 1, 13, 6, 0F); // Box 314 door swing right
		bodyModel[105].setRotationPoint(29F, -18F, 2.5F);

		bodyModel[106].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		bodyModel[106].setRotationPoint(18F, -18F, -10.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // Box 883
		bodyModel[107].setRotationPoint(28.5F, -18F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 884
		bodyModel[108].setRotationPoint(29.5F, -3F, -3F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 887
		bodyModel[109].setRotationPoint(15.75F, -24F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 888
		bodyModel[110].setRotationPoint(17.25F, -24F, 0F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 889
		bodyModel[111].setRotationPoint(16F, -21F, -10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 890
		bodyModel[112].setRotationPoint(17.5F, -20F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[113].setRotationPoint(17.82F, -24F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[114].setRotationPoint(18F, -23F, -0.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 897 liveryimg 1
		bodyModel[115].setRotationPoint(-30.01F, -3F, -2F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 898 liveryimg 1
		bodyModel[116].setRotationPoint(29.55F, -20F, 2F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 899 liveryimg 1
		bodyModel[117].setRotationPoint(29.55F, -20F, -6F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 900 liveryimg 1
		bodyModel[118].setRotationPoint(19.55F, -10F, 11.05F);

		bodyModel[119].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 901 liveryimg 1
		bodyModel[119].setRotationPoint(19.55F, -10F, -11.05F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 902 liveryimg 2
		bodyModel[120].setRotationPoint(-4.45F, -17F, -7.05F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 903 liveryimg 2
		bodyModel[121].setRotationPoint(-4.45F, -17F, 7.05F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[122].setRotationPoint(-28.5F, -20.5F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[123].setRotationPoint(-28.5F, -20.5F, -6F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		bodyModel[124].setRotationPoint(16F, -24F, -0.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[125].setRotationPoint(29.55F, -11F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[126].setRotationPoint(29.55F, -11F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[127].setRotationPoint(29.55F, -1F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[128].setRotationPoint(29.55F, -1F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Box 184
		bodyModel[129].setRotationPoint(9.5F, -22.5F, -1.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 187
		bodyModel[130].setRotationPoint(29F, -16F, 3.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
		bodyModel[131].setRotationPoint(29F, -16F, -3.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[132].setRotationPoint(25.5F, -24F, 0F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 197
		bodyModel[133].setRotationPoint(-27.5F, -20.5F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[134].setRotationPoint(-28.5F, -17F, 6.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[135].setRotationPoint(-33.5F, 2F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[136].setRotationPoint(32.5F, 2F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		bodyModel[137].setRotationPoint(22.82F, -25.5F, -2.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[138].setRotationPoint(23F, -24.5F, -2.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[139].setRotationPoint(22.85F, -23.5F, -2.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[140].setRotationPoint(22.85F, -23.5F, -1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[141].setRotationPoint(-28.5F, -19.5F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[142].setRotationPoint(-28.5F, -19.5F, -5.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[143].setRotationPoint(-28.5F, -19.5F, 4.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 17, 5, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[144].setRotationPoint(-30F, -17F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // box03
		bodyModel[145].setRotationPoint(-30F, -17F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[146].setRotationPoint(-29.5F, -17F, -7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[147].setRotationPoint(-29.5F, -17F, 6F);

		bodyModel[148].addBox(0F, 0F, 0F, 46, 1, 12, 0F); // box03
		bodyModel[148].setRotationPoint(-28.5F, -18F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[149].setRotationPoint(-28.5F, -18F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 46, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[150].setRotationPoint(-28.5F, -18F, 6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[151].setRotationPoint(-30F, -17F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.125F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[152].setRotationPoint(-29.5F, -18F, 1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.375F, -0.125F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.375F, -0.125F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[153].setRotationPoint(-30F, -18F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // box03
		bodyModel[154].setRotationPoint(-29.5F, -18F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 879
		bodyModel[155].setRotationPoint(-28F, -20F, -1.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.35F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // box03
		bodyModel[156].setRotationPoint(-29.5F, -18F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[157].setRotationPoint(-29.5F, -18F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 547
		bodyModel[158].setRotationPoint(2.5F, -12F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 547
		bodyModel[159].setRotationPoint(13.5F, -16F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 547
		bodyModel[160].setRotationPoint(13.5F, -16F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		bodyModel[161].setRotationPoint(16.5F, -19F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 535
		bodyModel[162].setRotationPoint(16.5F, -21F, 7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[163].setRotationPoint(16.5F, -19F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 537
		bodyModel[164].setRotationPoint(16.5F, -21F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[165].setRotationPoint(16.5F, -22F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		bodyModel[166].setRotationPoint(16.5F, -22F, 3F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 540
		bodyModel[167].setRotationPoint(16.5F, -22F, -3F);

		bodyModel[168].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // box03
		bodyModel[168].setRotationPoint(-22.5F, -19F, -5F);

		bodyModel[169].addBox(0F, 0F, 0F, 18, 1, 10, 0F); // box03
		bodyModel[169].setRotationPoint(-12.5F, -18.5F, -5F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[170].setRotationPoint(2.5F, -22.5F, -1F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[171].setRotationPoint(0F, -22.5F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[172].setRotationPoint(-2.5F, -22.5F, -1F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[173].setRotationPoint(-5F, -22.5F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[174].setRotationPoint(-7.5F, -22.5F, -1F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[175].setRotationPoint(-10F, -22.5F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 184
		bodyModel[176].setRotationPoint(-12.5F, -22.5F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[177].setRotationPoint(2.5F, -20.5F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[178].setRotationPoint(-2.5F, -20.5F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[179].setRotationPoint(-7.5F, -20.5F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[180].setRotationPoint(-12.5F, -20.5F, -1F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 184
		bodyModel[181].setRotationPoint(3F, -22.5F, -0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 184
		bodyModel[182].setRotationPoint(-2F, -22.5F, -0.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 184
		bodyModel[183].setRotationPoint(-7F, -22.5F, -0.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 184
		bodyModel[184].setRotationPoint(-12F, -22.5F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box56
		bodyModel[185].setRotationPoint(25.5F, 1F, 11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box57
		bodyModel[186].setRotationPoint(27.5F, 1F, 11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // box58
		bodyModel[187].setRotationPoint(28.5F, 1F, 11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box56
		bodyModel[188].setRotationPoint(25.5F, 1F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // box57
		bodyModel[189].setRotationPoint(27.5F, 1F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // box58
		bodyModel[190].setRotationPoint(28.5F, 1F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box56
		bodyModel[191].setRotationPoint(-27.5F, 1F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box57
		bodyModel[192].setRotationPoint(-28.5F, 1F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // box58
		bodyModel[193].setRotationPoint(-29.5F, 1F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box56
		bodyModel[194].setRotationPoint(-27.5F, 1F, 11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // box57
		bodyModel[195].setRotationPoint(-28.5F, 1F, 11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // box58
		bodyModel[196].setRotationPoint(-29.5F, 1F, 11F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 518
		bodyModel[197].setRotationPoint(-29.5F, 1F, 8F);

		bodyModel[198].addBox(0F, 0F, 0F, 0, 5, 3, 0F); // Box 523
		bodyModel[198].setRotationPoint(-29.5F, 1F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		bodyModel[199].setRotationPoint(29.5F, 1F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[200].setRotationPoint(29.5F, 1F, 6F);

		bodyModel[201].addBox(0F, 0F, 0F, 59, 1, 16, 0F); // Box 0
		bodyModel[201].setRotationPoint(-29.5F, 1F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[202].setRotationPoint(-32.5F, 2F, -2.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[203].setRotationPoint(28.5F, 2F, -2.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 184
		bodyModel[204].setRotationPoint(-1.5F, -22.5F, -1.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 184
		bodyModel[205].setRotationPoint(-9.5F, -22.5F, -1.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 0, 4, 16, 0F); // Box 879
		bodyModel[206].setRotationPoint(-22.5F, -13F, -8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 184
		bodyModel[207].setRotationPoint(3F, -22.5F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 184
		bodyModel[208].setRotationPoint(-2F, -22.5F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 184
		bodyModel[209].setRotationPoint(-7F, -22.5F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 184
		bodyModel[210].setRotationPoint(-12F, -22.5F, -0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[211].setRotationPoint(7F, -20F, -2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[212].setRotationPoint(7F, -19F, -0.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[213].setRotationPoint(2.5F, -19.5F, -1F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[214].setRotationPoint(0F, -19.5F, -1F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[215].setRotationPoint(-2.5F, -19.5F, -1F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[216].setRotationPoint(-5F, -19.5F, -1F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[217].setRotationPoint(-7.5F, -19.5F, -1F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[218].setRotationPoint(-10F, -19.5F, -1F);

		bodyModel[219].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 184
		bodyModel[219].setRotationPoint(-12.5F, -19.5F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[220].setRotationPoint(-29F, -20F, -1.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
		bodyModel[221].setRotationPoint(2.5F, -2F, 11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
		bodyModel[222].setRotationPoint(5.5F, -3F, 11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
		bodyModel[223].setRotationPoint(6.5F, -5F, 11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
		bodyModel[224].setRotationPoint(2.5F, -2F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
		bodyModel[225].setRotationPoint(5.5F, -3F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
		bodyModel[226].setRotationPoint(6.5F, -5F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[227].setRotationPoint(28F, -20.5F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back left lamp
		bodyModel[228].setRotationPoint(29.25F, -20.5F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Back right lamp
		bodyModel[229].setRotationPoint(29.25F, -20.5F, 0F);

		bodyModel[230].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 147
		bodyModel[230].setRotationPoint(-31.5F, -20F, -1.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148 glow
		bodyModel[231].setRotationPoint(-31F, -19.5F, -2.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Top front lamp
		bodyModel[232].setRotationPoint(-32F, -20.25F, -0.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Bottom front lamp
		bodyModel[233].setRotationPoint(-32F, -18.25F, -0.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173 glow
		bodyModel[234].setRotationPoint(-31F, -19.5F, 1.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[235].setRotationPoint(-28.5F, -20F, -1.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 7, 4, 0F); // box25
		bodyModel[236].setRotationPoint(12.5F, -12F, 7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[237].setRotationPoint(-28.5F, -18.5F, -5.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 6, 0, 16, 0F); // Box 879
		bodyModel[238].setRotationPoint(-28.5F, -13F, -8F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // box03
		bodyModel[239].setRotationPoint(-18.5F, -20F, -5F);

		bodyModel[240].addBox(0F, 0F, 0F, 15, 1, 7, 0F); // box03
		bodyModel[240].setRotationPoint(-12.5F, -19.5F, -3.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 15, 1, 5, 0F); // box03
		bodyModel[241].setRotationPoint(-12.5F, -20.5F, -2.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[242].setRotationPoint(-12.5F, -20.5F, -3.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[243].setRotationPoint(-12.5F, -20.5F, 2.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // box03
		bodyModel[244].setRotationPoint(-10.5F, -23.5F, -1F);

		bodyModel[245].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // box03
		bodyModel[245].setRotationPoint(-3.5F, -23.5F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[246].setRotationPoint(-27.5F, -22.5F, -6.25F);
		bodyModel[246].rotateAngleY = 0.26179939F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box03
		bodyModel[247].setRotationPoint(-28.5F, -22.5F, 2.4F);
		bodyModel[247].rotateAngleY = -0.26179939F;

		bodyModel[248].addBox(0F, 0F, 0F, 10, 5, 15, 0F); // box03
		bodyModel[248].setRotationPoint(-22.5F, -22F, -7.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 890
		bodyModel[249].setRotationPoint(17.5F, -23F, -0.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		bodyModel[250].setRotationPoint(14F, -20F, -0.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 890
		bodyModel[251].setRotationPoint(15.5F, -19F, -0.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		bodyModel[252].setRotationPoint(17.5F, -24F, 1F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 902 liveryimg 2
		bodyModel[253].setRotationPoint(-10.45F, -16F, -7.05F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 903 liveryimg 2
		bodyModel[254].setRotationPoint(-10.45F, -16F, 7.05F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[255].setRotationPoint(-28.5F, -17F, -7.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 887
		bodyModel[256].setRotationPoint(17F, -24F, -1.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 888
		bodyModel[257].setRotationPoint(16.5F, -24F, -0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		bodyModel[258].setRotationPoint(15.5F, -24F, 0.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 548
		bodyModel[259].setRotationPoint(6.5F, -11F, 11F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 548
		bodyModel[260].setRotationPoint(6.5F, -11F, -11F);

		bodyModel[261].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		bodyModel[261].setRotationPoint(16.5F, -11.98F, -2.5F);
		bodyModel[261].rotateAngleY = -0.48869219F;

		bodyModel[262].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[262].setRotationPoint(18.5F, -12F, 2F);
	}
	ModelTypeAnew theTypeA = new ModelTypeAnew();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity ,f5);

		if(GetColor(entity)==15){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.155, -0.1, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.25, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1634) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_rolly.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.155, -0.1, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.25, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.155, -0.1, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.25, 0, 0);
			theTypeA.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}