//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CSWR Cow Carrier
// Model Creator: Bida
// Created on: 08.12.2021 - 22:52:11
// Last changed on: 08.12.2021 - 22:52:11

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelStampedeRack extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelStampedeRack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[137];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 34, 117, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 48, 120, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 65, 119, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 48, 120, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 34, 117, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 36, 107, textureX, textureY); // Box 80
		bodyModel[6] = new ModelRendererTurbo(this, 36, 110, textureX, textureY); // Box 81
		bodyModel[7] = new ModelRendererTurbo(this, 48, 113, textureX, textureY); // Box 746
		bodyModel[8] = new ModelRendererTurbo(this, 48, 113, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 274, 43, textureX, textureY); // Box 105
		bodyModel[10] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 77, 63, textureX, textureY); // Box 51
		bodyModel[12] = new ModelRendererTurbo(this, 60, 43, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 60, 91, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 77, 111, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 274, 91, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 311, 80, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 389, 80, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 174
		bodyModel[20] = new ModelRendererTurbo(this, 249, 2, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 358, 108, textureX, textureY, "cull"); // Box 38 crossover cull
		bodyModel[22] = new ModelRendererTurbo(this, 302, 114, textureX, textureY); // Box 93
		bodyModel[23] = new ModelRendererTurbo(this, 302, 114, textureX, textureY); // Box 110
		bodyModel[24] = new ModelRendererTurbo(this, 320, 85, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[25] = new ModelRendererTurbo(this, 320, 85, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[26] = new ModelRendererTurbo(this, 357, 87, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[27] = new ModelRendererTurbo(this, 368, 87, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[28] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 358, 108, textureX, textureY, "cull"); // Box 38 crossover cull
		bodyModel[30] = new ModelRendererTurbo(this, 398, 85, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[31] = new ModelRendererTurbo(this, 398, 85, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[32] = new ModelRendererTurbo(this, 302, 114, textureX, textureY); // Box 93
		bodyModel[33] = new ModelRendererTurbo(this, 302, 114, textureX, textureY); // Box 110
		bodyModel[34] = new ModelRendererTurbo(this, 357, 87, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[35] = new ModelRendererTurbo(this, 368, 87, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[36] = new ModelRendererTurbo(this, 10, 88, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 13, 99, textureX, textureY); // Box 87
		bodyModel[38] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 14, 110, textureX, textureY); // Box 132
		bodyModel[40] = new ModelRendererTurbo(this, 62, 117, textureX, textureY); // Box 453
		bodyModel[41] = new ModelRendererTurbo(this, 11, 118, textureX, textureY); // Box 454 brake chain holder
		bodyModel[42] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 286
		bodyModel[43] = new ModelRendererTurbo(this, 17, 70, textureX, textureY); // Box 287
		bodyModel[44] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 302
		bodyModel[45] = new ModelRendererTurbo(this, 25, 68, textureX, textureY); // Box 712
		bodyModel[46] = new ModelRendererTurbo(this, 26, 80, textureX, textureY); // Box 130
		bodyModel[47] = new ModelRendererTurbo(this, 15, 61, textureX, textureY); // Box 118
		bodyModel[48] = new ModelRendererTurbo(this, 26, 61, textureX, textureY); // Box 119
		bodyModel[49] = new ModelRendererTurbo(this, 20, 56, textureX, textureY); // Box 129
		bodyModel[50] = new ModelRendererTurbo(this, -3, 79, textureX, textureY); // Box 196
		bodyModel[51] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 199
		bodyModel[52] = new ModelRendererTurbo(this, -2, 83, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 126
		bodyModel[54] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 723
		bodyModel[55] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Box 724
		bodyModel[56] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 725
		bodyModel[57] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 726
		bodyModel[58] = new ModelRendererTurbo(this, 6, 82, textureX, textureY); // Box 727
		bodyModel[59] = new ModelRendererTurbo(this, -8, 71, textureX, textureY); // Box 124
		bodyModel[60] = new ModelRendererTurbo(this, 88, 117, textureX, textureY); // Box 730
		bodyModel[61] = new ModelRendererTurbo(this, 17, 85, textureX, textureY); // Box 731
		bodyModel[62] = new ModelRendererTurbo(this, 34, 75, textureX, textureY); // Box 446
		bodyModel[63] = new ModelRendererTurbo(this, 34, 75, textureX, textureY); // Box 77
		bodyModel[64] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 77, 104, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 77, 99, textureX, textureY); // Box 87
		bodyModel[67] = new ModelRendererTurbo(this, 77, 72, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 84, 72, textureX, textureY); // Box 96
		bodyModel[69] = new ModelRendererTurbo(this, 91, 72, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 267, 72, textureX, textureY); // Box 98
		bodyModel[71] = new ModelRendererTurbo(this, 260, 72, textureX, textureY); // Box 99
		bodyModel[72] = new ModelRendererTurbo(this, 253, 72, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 246, 72, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 98, 72, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 147, 75, textureX, textureY); // Box 103 dOOr
		bodyModel[76] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 109
		bodyModel[77] = new ModelRendererTurbo(this, 77, 56, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 77, 51, textureX, textureY); // Box 124
		bodyModel[79] = new ModelRendererTurbo(this, 99, 24, textureX, textureY); // Box 125
		bodyModel[80] = new ModelRendererTurbo(this, 246, 24, textureX, textureY); // Box 126
		bodyModel[81] = new ModelRendererTurbo(this, 253, 24, textureX, textureY); // Box 127
		bodyModel[82] = new ModelRendererTurbo(this, 260, 24, textureX, textureY); // Box 128
		bodyModel[83] = new ModelRendererTurbo(this, 267, 24, textureX, textureY); // Box 129
		bodyModel[84] = new ModelRendererTurbo(this, 92, 24, textureX, textureY); // Box 130
		bodyModel[85] = new ModelRendererTurbo(this, 85, 24, textureX, textureY); // Box 131
		bodyModel[86] = new ModelRendererTurbo(this, 78, 24, textureX, textureY); // Box 132
		bodyModel[87] = new ModelRendererTurbo(this, 176, 75, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 176, 96, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 147, 27, textureX, textureY); // Box 150 dOOr
		bodyModel[90] = new ModelRendererTurbo(this, 176, 27, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 176, 48, textureX, textureY); // Box 152
		bodyModel[92] = new ModelRendererTurbo(this, 334, 90, textureX, textureY); // Box 153
		bodyModel[93] = new ModelRendererTurbo(this, 412, 90, textureX, textureY); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 134
		bodyModel[95] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 135
		bodyModel[96] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 136
		bodyModel[97] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Box 137
		bodyModel[98] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 314
		bodyModel[99] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 315
		bodyModel[100] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 316
		bodyModel[101] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 317
		bodyModel[102] = new ModelRendererTurbo(this, 332, 101, textureX, textureY); // Box 318
		bodyModel[103] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 319
		bodyModel[104] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 320
		bodyModel[105] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 321
		bodyModel[106] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 322
		bodyModel[107] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 323
		bodyModel[108] = new ModelRendererTurbo(this, 410, 101, textureX, textureY); // Box 324
		bodyModel[109] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 325
		bodyModel[110] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 326
		bodyModel[111] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 327
		bodyModel[112] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 328
		bodyModel[113] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 329
		bodyModel[114] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 330
		bodyModel[115] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 331
		bodyModel[116] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 332
		bodyModel[117] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 333
		bodyModel[118] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 334
		bodyModel[119] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 335
		bodyModel[120] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 336
		bodyModel[121] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 337
		bodyModel[122] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 338
		bodyModel[123] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 339
		bodyModel[124] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 340
		bodyModel[125] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 341
		bodyModel[126] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 342
		bodyModel[127] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 343
		bodyModel[128] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 344
		bodyModel[129] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 345
		bodyModel[130] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 346
		bodyModel[131] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 347
		bodyModel[132] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 348
		bodyModel[133] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 349
		bodyModel[134] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 350
		bodyModel[135] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 351
		bodyModel[136] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 352

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42F, 5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 0
		bodyModel[1].setRotationPoint(58F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 116, 2, 5, 0F); // Box 0
		bodyModel[2].setRotationPoint(-58F, 3F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 0
		bodyModel[3].setRotationPoint(-63F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[4].setRotationPoint(38F, 5F, -2F);

		bodyModel[5].addBox(0F, -1F, 0F, 11, 2, 0, 0F); // Box 80
		bodyModel[5].setRotationPoint(-61.5F, 4.5F, 1.5F);
		bodyModel[5].rotateAngleY = 0.99483767F;
		bodyModel[5].rotateAngleZ = 0.05235988F;

		bodyModel[6].addBox(-11F, -1F, 0F, 11, 2, 0, 0F); // Box 81
		bodyModel[6].setRotationPoint(61.5F, 4.5F, -1.5F);
		bodyModel[6].rotateAngleY = 0.99483767F;
		bodyModel[6].rotateAngleZ = -0.05235988F;

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 746
		bodyModel[7].setRotationPoint(56.5F, 5F, -2.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 9
		bodyModel[8].setRotationPoint(-57.5F, 5F, -2.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 7, 24, 1, 0F); // Box 105
		bodyModel[9].setRotationPoint(-55.5F, -20F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 111, 1, 20, 0F); // Box 1
		bodyModel[10].setRotationPoint(-55.5F, 2F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Box 51
		bodyModel[11].setRotationPoint(-48.5F, 1F, 10F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 24, 1, 0F); // Box 15
		bodyModel[12].setRotationPoint(48.5F, -20F, 10F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 24, 1, 0F); // Box 16
		bodyModel[13].setRotationPoint(-55.5F, -20F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Box 17
		bodyModel[14].setRotationPoint(-48.5F, 1F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 24, 1, 0F); // Box 18
		bodyModel[15].setRotationPoint(48.5F, -20F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 14
		bodyModel[16].setRotationPoint(-55.5F, -20F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 20
		bodyModel[17].setRotationPoint(54.5F, -20F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-56.5F, 0F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 174
		bodyModel[19].setRotationPoint(-56.5F, -3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 111, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 28
		bodyModel[20].setRotationPoint(-55.5F, -21F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 38 crossover cull
		bodyModel[21].setRotationPoint(-58F, 1F, -5.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 93
		bodyModel[22].setRotationPoint(-54.5F, 3F, -11.01F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 110
		bodyModel[23].setRotationPoint(-54.5F, 3F, 11.01F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[24].setRotationPoint(-56.5F, -7F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[25].setRotationPoint(-56.5F, -7F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[26].setRotationPoint(-54.5F, -7F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[27].setRotationPoint(-54.5F, -7F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[28].setRotationPoint(55.5F, -18F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 38 crossover cull
		bodyModel[29].setRotationPoint(55F, 1F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[30].setRotationPoint(55.5F, -7F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[31].setRotationPoint(55.5F, -7F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 93
		bodyModel[32].setRotationPoint(50.5F, 3F, -11.01F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 110
		bodyModel[33].setRotationPoint(50.5F, 3F, 11.01F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[34].setRotationPoint(50.5F, -7F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[35].setRotationPoint(50.5F, -7F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[36].setRotationPoint(-57.51F, -5.5F, 2F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[37].setRotationPoint(-57.5F, -4F, 3.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[38].setRotationPoint(-56.5F, -5.5F, 2.5F);

		bodyModel[39].addBox(-1F, 0F, 0F, 1, 7, 0, 0F); // Box 132
		bodyModel[39].setRotationPoint(-55.5F, -2F, 4F);
		bodyModel[39].rotateAngleZ = -0.03490659F;

		bodyModel[40].addBox(-0.5F, -0.5F, 0F, 52, 1, 0, 0F); // Box 453
		bodyModel[40].setRotationPoint(-56F, 5F, 4F);
		bodyModel[40].rotateAngleY = 0.03490659F;
		bodyModel[40].rotateAngleZ = -0.00436332F;

		bodyModel[41].addBox(-0.5F, -0.5F, 0F, 4, 2, 0, 0F); // Box 454 brake chain holder
		bodyModel[41].setRotationPoint(-56F, 4F, 4.01F);
		bodyModel[41].rotateAngleZ = 0.55850536F;

		bodyModel[42].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 286
		bodyModel[42].setRotationPoint(12F, 5.5F, -9F);
		bodyModel[42].rotateAngleZ = 0.78539816F;

		bodyModel[43].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 287
		bodyModel[43].setRotationPoint(12F, 5.5F, -6F);
		bodyModel[43].rotateAngleZ = 0.78539816F;

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 302
		bodyModel[44].setRotationPoint(11F, 3F, -9.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 712
		bodyModel[45].setRotationPoint(11F, 3F, -3.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 130
		bodyModel[46].setRotationPoint(2.5F, 3F, -9F);

		bodyModel[47].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[47].setRotationPoint(3F, 5F, 3.5F);
		bodyModel[47].rotateAngleX = -0.78539816F;

		bodyModel[48].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[48].setRotationPoint(1F, 5F, 3.5F);
		bodyModel[48].rotateAngleX = -0.78539816F;

		bodyModel[49].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[49].setRotationPoint(2.5F, 3F, 2.5F);

		bodyModel[50].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[50].setRotationPoint(-2F, 5.26F, 0F);
		bodyModel[50].rotateAngleY = -0.17453293F;

		bodyModel[51].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[51].setRotationPoint(-2F, 5.25F, 0F);
		bodyModel[51].rotateAngleY = -0.17453293F;

		bodyModel[52].addBox(-0.5F, 0F, 0F, 1, 0, 4, 0F); // Box 122
		bodyModel[52].setRotationPoint(-6F, 5.26F, 2F);
		bodyModel[52].rotateAngleY = -0.33161256F;

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[53].setRotationPoint(-4F, 4.5F, 1.25F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 723
		bodyModel[54].setRotationPoint(-4F, 4.5F, -2.25F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 724
		bodyModel[55].setRotationPoint(-7F, 4.5F, 1.25F);

		bodyModel[56].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 725
		bodyModel[56].setRotationPoint(-6F, 4.5F, 3.5F);

		bodyModel[57].addBox(-0.5F, -0.5F, 0F, 38, 1, 0, 0F); // Box 726
		bodyModel[57].setRotationPoint(-3F, 5F, -4F);
		bodyModel[57].rotateAngleY = 3.0368729F;
		bodyModel[57].rotateAngleZ = -0.04363323F;

		bodyModel[58].addBox(-0.5F, 0F, -1F, 1, 0, 5, 0F); // Box 727
		bodyModel[58].setRotationPoint(14F, 5.26F, -1F);
		bodyModel[58].rotateAngleY = -0.17453293F;

		bodyModel[59].addBox(-0.5F, 0F, 0F, 1, 0, 16, 0F); // Box 124
		bodyModel[59].setRotationPoint(-1.75F, 5.26F, 0.5F);
		bodyModel[59].rotateAngleY = -1.57079633F;

		bodyModel[60].addBox(-0.5F, -0.5F, 0F, 26, 1, 0, 0F); // Box 730
		bodyModel[60].setRotationPoint(15F, 5F, 3F);
		bodyModel[60].rotateAngleY = -0.10471976F;
		bodyModel[60].rotateAngleZ = -0.06108652F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[61].setRotationPoint(13F, 4.5F, -2.5F);

		bodyModel[62].addBox(-1F, 1F, 0F, 1, 0, 14, 0F); // Box 446
		bodyModel[62].setRotationPoint(-56F, -8.5F, -7F);

		bodyModel[63].addBox(-1F, 1F, 0F, 1, 0, 14, 0F); // Box 77
		bodyModel[63].setRotationPoint(57F, -8.5F, -7F);

		bodyModel[64].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 78
		bodyModel[64].setRotationPoint(-48.5F, 1F, -10F);
		bodyModel[64].rotateAngleX = 0.78539816F;

		bodyModel[65].addBox(0F, 0F, 0F, 97, 3, 1, 0F); // Box 82
		bodyModel[65].setRotationPoint(-48.5F, -7F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 97, 3, 1, 0F); // Box 87
		bodyModel[66].setRotationPoint(-48.5F, -15F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 95
		bodyModel[67].setRotationPoint(-37.5F, -20F, -11.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 96
		bodyModel[68].setRotationPoint(-25.5F, -20F, -11.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 97
		bodyModel[69].setRotationPoint(-13.5F, -20F, -11.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 98
		bodyModel[70].setRotationPoint(36.5F, -20F, -11.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 99
		bodyModel[71].setRotationPoint(24.5F, -20F, -11.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 100
		bodyModel[72].setRotationPoint(12.5F, -20F, -11.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 101
		bodyModel[73].setRotationPoint(0.5F, -20F, -11.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 102
		bodyModel[74].setRotationPoint(-1.5F, -20F, -11.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 13, 22, 1, 0F); // Box 103 dOOr
		bodyModel[75].setRotationPoint(-13.5F, -19F, -11.75F);

		bodyModel[76].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 109
		bodyModel[76].setRotationPoint(-48.5F, 1F, 10F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addBox(0F, 0F, 0F, 97, 3, 1, 0F); // Box 123
		bodyModel[77].setRotationPoint(-48.5F, -7F, 10F);

		bodyModel[78].addBox(0F, 0F, 0F, 97, 3, 1, 0F); // Box 124
		bodyModel[78].setRotationPoint(-48.5F, -15F, 10F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 125
		bodyModel[79].setRotationPoint(0.5F, -20F, 9.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 126
		bodyModel[80].setRotationPoint(-1.5F, -20F, 9.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 127
		bodyModel[81].setRotationPoint(-13.5F, -20F, 9.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 128
		bodyModel[82].setRotationPoint(-25.5F, -20F, 9.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 129
		bodyModel[83].setRotationPoint(-37.5F, -20F, 9.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 130
		bodyModel[84].setRotationPoint(12.5F, -20F, 9.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 131
		bodyModel[85].setRotationPoint(24.5F, -20F, 9.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 24, 2, 0F); // Box 132
		bodyModel[86].setRotationPoint(36.5F, -20F, 9.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 148
		bodyModel[87].setRotationPoint(-13.5F, -20F, -11.75F);

		bodyModel[88].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 149
		bodyModel[88].setRotationPoint(-13.5F, 3F, -11.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 13, 22, 1, 0F); // Box 150 dOOr
		bodyModel[89].setRotationPoint(0.5F, -19F, 10.75F);

		bodyModel[90].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 151
		bodyModel[90].setRotationPoint(-13.5F, -20F, 10.75F);

		bodyModel[91].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 152
		bodyModel[91].setRotationPoint(-13.5F, 3F, 10.75F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 153
		bodyModel[92].setRotationPoint(-56.5F, -18.5F, -3F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 154
		bodyModel[93].setRotationPoint(53.5F, -18.5F, -3F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 134
		bodyModel[94].setRotationPoint(-42F, 3F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 135
		bodyModel[95].setRotationPoint(38F, 3F, -10F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 136
		bodyModel[96].setRotationPoint(-18F, 3F, -10F);

		bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 137
		bodyModel[97].setRotationPoint(14F, 3F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 314
		bodyModel[98].setRotationPoint(-56.5F, -9F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 315
		bodyModel[99].setRotationPoint(-56.5F, -6F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 316
		bodyModel[100].setRotationPoint(-56.5F, -15F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 317
		bodyModel[101].setRotationPoint(-56.5F, -12F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 318
		bodyModel[102].setRotationPoint(-56.5F, -18F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 319
		bodyModel[103].setRotationPoint(55.5F, -15F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 320
		bodyModel[104].setRotationPoint(55.5F, -12F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 321
		bodyModel[105].setRotationPoint(55.5F, -9F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 322
		bodyModel[106].setRotationPoint(55.5F, -6F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 323
		bodyModel[107].setRotationPoint(55.5F, -3F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 324
		bodyModel[108].setRotationPoint(55.5F, 0F, -11F);

		bodyModel[109].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 325
		bodyModel[109].setRotationPoint(-48.5F, 0F, -10F);
		bodyModel[109].rotateAngleX = 0.78539816F;

		bodyModel[110].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 326
		bodyModel[110].setRotationPoint(-48.5F, -1F, -10F);
		bodyModel[110].rotateAngleX = 0.78539816F;

		bodyModel[111].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 327
		bodyModel[111].setRotationPoint(-48.5F, -2F, -10F);
		bodyModel[111].rotateAngleX = 0.78539816F;

		bodyModel[112].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 328
		bodyModel[112].setRotationPoint(-48.5F, -3F, -10F);
		bodyModel[112].rotateAngleX = 0.78539816F;

		bodyModel[113].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 329
		bodyModel[113].setRotationPoint(-48.5F, -11F, -10F);
		bodyModel[113].rotateAngleX = 0.78539816F;

		bodyModel[114].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 330
		bodyModel[114].setRotationPoint(-48.5F, -7F, -10F);
		bodyModel[114].rotateAngleX = 0.78539816F;

		bodyModel[115].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 331
		bodyModel[115].setRotationPoint(-48.5F, -8F, -10F);
		bodyModel[115].rotateAngleX = 0.78539816F;

		bodyModel[116].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 332
		bodyModel[116].setRotationPoint(-48.5F, -9F, -10F);
		bodyModel[116].rotateAngleX = 0.78539816F;

		bodyModel[117].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 333
		bodyModel[117].setRotationPoint(-48.5F, -10F, -10F);
		bodyModel[117].rotateAngleX = 0.78539816F;

		bodyModel[118].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 334
		bodyModel[118].setRotationPoint(-48.5F, -19F, -10F);
		bodyModel[118].rotateAngleX = 0.78539816F;

		bodyModel[119].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 335
		bodyModel[119].setRotationPoint(-48.5F, -15F, -10F);
		bodyModel[119].rotateAngleX = 0.78539816F;

		bodyModel[120].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 336
		bodyModel[120].setRotationPoint(-48.5F, -16F, -10F);
		bodyModel[120].rotateAngleX = 0.78539816F;

		bodyModel[121].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 337
		bodyModel[121].setRotationPoint(-48.5F, -17F, -10F);
		bodyModel[121].rotateAngleX = 0.78539816F;

		bodyModel[122].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 338
		bodyModel[122].setRotationPoint(-48.5F, -18F, -10F);
		bodyModel[122].rotateAngleX = 0.78539816F;

		bodyModel[123].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 339
		bodyModel[123].setRotationPoint(-48.5F, 0F, 10F);
		bodyModel[123].rotateAngleX = -0.78539816F;

		bodyModel[124].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 340
		bodyModel[124].setRotationPoint(-48.5F, -1F, 10F);
		bodyModel[124].rotateAngleX = -0.78539816F;

		bodyModel[125].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 341
		bodyModel[125].setRotationPoint(-48.5F, -2F, 10F);
		bodyModel[125].rotateAngleX = -0.78539816F;

		bodyModel[126].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 342
		bodyModel[126].setRotationPoint(-48.5F, -3F, 10F);
		bodyModel[126].rotateAngleX = -0.78539816F;

		bodyModel[127].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 343
		bodyModel[127].setRotationPoint(-48.5F, -11F, 10F);
		bodyModel[127].rotateAngleX = -0.78539816F;

		bodyModel[128].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 344
		bodyModel[128].setRotationPoint(-48.5F, -10F, 10F);
		bodyModel[128].rotateAngleX = -0.78539816F;

		bodyModel[129].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 345
		bodyModel[129].setRotationPoint(-48.5F, -9F, 10F);
		bodyModel[129].rotateAngleX = -0.78539816F;

		bodyModel[130].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 346
		bodyModel[130].setRotationPoint(-48.5F, -8F, 10F);
		bodyModel[130].rotateAngleX = -0.78539816F;

		bodyModel[131].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 347
		bodyModel[131].setRotationPoint(-48.5F, -7F, 10F);
		bodyModel[131].rotateAngleX = -0.78539816F;

		bodyModel[132].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 348
		bodyModel[132].setRotationPoint(-48.5F, -19F, 10F);
		bodyModel[132].rotateAngleX = -0.78539816F;

		bodyModel[133].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 349
		bodyModel[133].setRotationPoint(-48.5F, -18F, 10F);
		bodyModel[133].rotateAngleX = -0.78539816F;

		bodyModel[134].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 350
		bodyModel[134].setRotationPoint(-48.5F, -17F, 10F);
		bodyModel[134].rotateAngleX = -0.78539816F;

		bodyModel[135].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 351
		bodyModel[135].setRotationPoint(-48.5F, -16F, 10F);
		bodyModel[135].rotateAngleX = -0.78539816F;

		bodyModel[136].addBox(0F, -0.5F, -0.5F, 97, 0, 1, 0F); // Box 352
		bodyModel[136].setRotationPoint(-48.5F, -15F, 10F);
		bodyModel[136].rotateAngleX = -0.78539816F;
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithStandardFreightRollingStock(bodyModel, entity, f5);

		if(GetColor(entity)==3249){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		}
		GL11.glPushMatrix();
		//GL11.glScalef(1,1,1f);
		GL11.glTranslated(-2.5,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.0,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}