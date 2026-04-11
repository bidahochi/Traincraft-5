//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.07.2023 - 16:55:35
// Last changed on: 28.07.2023 - 16:55:35

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelNewBlombergA1ATruck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelSMSC1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSMSC1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[200];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[5] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[6] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 336
		bodyModel[7] = new ModelRendererTurbo(this, 152, 216, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 15, 165, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 356
		bodyModel[12] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 151
		bodyModel[13] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 184
		bodyModel[14] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[15] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[16] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[18] = new ModelRendererTurbo(this, 42, 204, textureX, textureY); // Box 374
		bodyModel[19] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 33, 203, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[25] = new ModelRendererTurbo(this, 105, 186, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 4, 186, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 4, 187, textureX, textureY); // Box 66
		bodyModel[28] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 67
		bodyModel[29] = new ModelRendererTurbo(this, 9, 187, textureX, textureY); // Box 68
		bodyModel[30] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[31] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[32] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[33] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[34] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[35] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[36] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[37] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[38] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[39] = new ModelRendererTurbo(this, 33, 205, textureX, textureY); // Box 78
		bodyModel[40] = new ModelRendererTurbo(this, 42, 205, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[44] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[45] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[46] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[50] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[51] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[52] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[53] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[54] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[55] = new ModelRendererTurbo(this, 367, 199, textureX, textureY); // Box 378
		bodyModel[56] = new ModelRendererTurbo(this, 367, 205, textureX, textureY); // Box 379
		bodyModel[57] = new ModelRendererTurbo(this, 367, 202, textureX, textureY); // Box 380
		bodyModel[58] = new ModelRendererTurbo(this, 24, 168, textureX, textureY); // Box 415
		bodyModel[59] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[60] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[61] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[62] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[63] = new ModelRendererTurbo(this, 128, 229, textureX, textureY); // Box 2
		bodyModel[64] = new ModelRendererTurbo(this, 129, 216, textureX, textureY); // Box 346
		bodyModel[65] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[66] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[67] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[68] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[70] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[72] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[73] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[74] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[75] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[76] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[77] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[78] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[79] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[80] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[81] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[82] = new ModelRendererTurbo(this, 42, 192, textureX, textureY); // Box 616
		bodyModel[83] = new ModelRendererTurbo(this, 33, 192, textureX, textureY); // Box 617
		bodyModel[84] = new ModelRendererTurbo(this, 33, 190, textureX, textureY); // Box 618
		bodyModel[85] = new ModelRendererTurbo(this, 4, 200, textureX, textureY); // Box 619
		bodyModel[86] = new ModelRendererTurbo(this, 9, 198, textureX, textureY); // Box 620
		bodyModel[87] = new ModelRendererTurbo(this, 9, 200, textureX, textureY); // Box 621
		bodyModel[88] = new ModelRendererTurbo(this, 4, 199, textureX, textureY); // Box 622
		bodyModel[89] = new ModelRendererTurbo(this, 42, 191, textureX, textureY); // Box 623
		bodyModel[90] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[91] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[92] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[93] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[94] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[95] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[96] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[97] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[98] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[99] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[100] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[101] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[102] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[103] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[104] = new ModelRendererTurbo(this, 288, 196, textureX, textureY); // Box 37
		bodyModel[105] = new ModelRendererTurbo(this, 78, 187, textureX, textureY); // Box 143
		bodyModel[106] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[108] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 125, 230, textureX, textureY); // Box 38
		bodyModel[111] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[112] = new ModelRendererTurbo(this, 175, 216, textureX, textureY); // Box 40
		bodyModel[113] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 94
		bodyModel[114] = new ModelRendererTurbo(this, 173, 226, textureX, textureY); // Box 95
		bodyModel[115] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[116] = new ModelRendererTurbo(this, 175, 221, textureX, textureY); // Box 600
		bodyModel[117] = new ModelRendererTurbo(this, 71, 228, textureX, textureY); // Box 42
		bodyModel[118] = new ModelRendererTurbo(this, 52, 234, textureX, textureY); // Box 44
		bodyModel[119] = new ModelRendererTurbo(this, 1, 232, textureX, textureY); // Box 324
		bodyModel[120] = new ModelRendererTurbo(this, 52, 241, textureX, textureY); // Box 325
		bodyModel[121] = new ModelRendererTurbo(this, 126, 236, textureX, textureY); // Box 128 engine oil sump
		bodyModel[122] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 347
		bodyModel[123] = new ModelRendererTurbo(this, 291, 234, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 220, 232, textureX, textureY); // Box 93
		bodyModel[125] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[126] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[127] = new ModelRendererTurbo(this, 158, 29, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[128] = new ModelRendererTurbo(this, 144, 50, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[129] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 526
		bodyModel[130] = new ModelRendererTurbo(this, 220, 246, textureX, textureY); // Box 527
		bodyModel[131] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[132] = new ModelRendererTurbo(this, 213, 244, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[133] = new ModelRendererTurbo(this, 140, 53, textureX, textureY); // Box 519 frame stripe fix
		bodyModel[134] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 520 frame stripe fix
		bodyModel[135] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 142
		bodyModel[136] = new ModelRendererTurbo(this, 330, 250, textureX, textureY); // Box 143
		bodyModel[137] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[138] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[139] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[140] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[141] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[142] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[143] = new ModelRendererTurbo(this, 230, 86, textureX, textureY); // Box 402
		bodyModel[144] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[145] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[146] = new ModelRendererTurbo(this, 132, 73, textureX, textureY); // Box 237
		bodyModel[147] = new ModelRendererTurbo(this, 157, 73, textureX, textureY); // Box 238
		bodyModel[148] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base
		bodyModel[149] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[150] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[151] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[152] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[153] = new ModelRendererTurbo(this, 154, 8, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[154] = new ModelRendererTurbo(this, 161, 16, textureX, textureY); // Box 450
		bodyModel[155] = new ModelRendererTurbo(this, 367, 177, textureX, textureY); // Box 327
		bodyModel[156] = new ModelRendererTurbo(this, 369, 171, textureX, textureY); // Box 328
		bodyModel[157] = new ModelRendererTurbo(this, 369, 183, textureX, textureY); // Box 329
		bodyModel[158] = new ModelRendererTurbo(this, 378, 177, textureX, textureY); // Box 330
		bodyModel[159] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 243
		bodyModel[160] = new ModelRendererTurbo(this, 229, 19, textureX, textureY); // Box 244
		bodyModel[161] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 245
		bodyModel[162] = new ModelRendererTurbo(this, 218, 40, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 250
		bodyModel[164] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 251
		bodyModel[165] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[166] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[167] = new ModelRendererTurbo(this, 328, 226, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[168] = new ModelRendererTurbo(this, 328, 221, textureX, textureY); // Box 190 mu plug
		bodyModel[169] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[170] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[171] = new ModelRendererTurbo(this, 244, 117, textureX, textureY); // Box 362
		bodyModel[172] = new ModelRendererTurbo(this, 195, 109, textureX, textureY); // Box 363
		bodyModel[173] = new ModelRendererTurbo(this, 214, 113, textureX, textureY); // Box 364
		bodyModel[174] = new ModelRendererTurbo(this, 47, 109, textureX, textureY); // Box 365
		bodyModel[175] = new ModelRendererTurbo(this, 66, 113, textureX, textureY); // Box 366
		bodyModel[176] = new ModelRendererTurbo(this, 77, 109, textureX, textureY); // Box 367
		bodyModel[177] = new ModelRendererTurbo(this, 46, 82, textureX, textureY); // Box 368
		bodyModel[178] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 369
		bodyModel[179] = new ModelRendererTurbo(this, 218, 40, textureX, textureY); // Box 370
		bodyModel[180] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 371
		bodyModel[181] = new ModelRendererTurbo(this, 229, 19, textureX, textureY); // Box 372
		bodyModel[182] = new ModelRendererTurbo(this, 213, 39, textureX, textureY); // Box 373
		bodyModel[183] = new ModelRendererTurbo(this, 224, 18, textureX, textureY); // Box 374
		bodyModel[184] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 375
		bodyModel[185] = new ModelRendererTurbo(this, 62, 20, textureX, textureY); // Box 376
		bodyModel[186] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 377
		bodyModel[187] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 378
		bodyModel[188] = new ModelRendererTurbo(this, 257, 108, textureX, textureY); // Box 74
		bodyModel[189] = new ModelRendererTurbo(this, 251, 100, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[190] = new ModelRendererTurbo(this, 251, 100, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[191] = new ModelRendererTurbo(this, 265, 108, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[192] = new ModelRendererTurbo(this, 265, 108, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[193] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[194] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[195] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[196] = new ModelRendererTurbo(this, 230, 86, textureX, textureY); // Box 387
		bodyModel[197] = new ModelRendererTurbo(this, 143, 7, textureX, textureY, "cull"); // Box 388 cull
		bodyModel[198] = new ModelRendererTurbo(this, 250, 108, textureX, textureY, "cull"); // Box 389 cull
		bodyModel[199] = new ModelRendererTurbo(this, 244, 85, textureX, textureY, "cull"); // Box 390 cull

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-48.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-45.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[2].setRotationPoint(-47.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[3].setRotationPoint(-47.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[4].setRotationPoint(-45.01F, 7.5F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[5].setRotationPoint(-45.01F, 8.5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[6].setRotationPoint(-46F, 3F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[7].setRotationPoint(-45F, 2F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(-45.01F, 8.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-45.01F, 8.5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[10].setRotationPoint(-46F, 1F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 356
		bodyModel[11].setRotationPoint(-46F, 1F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[12].setRotationPoint(-46F, 1F, -2.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 90, 2, 12, 0F); // Box 184
		bodyModel[13].setRotationPoint(-45F, 1F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[14].setRotationPoint(-41F, 1F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[15].setRotationPoint(-45F, 8.5F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[16].setRotationPoint(-45F, 7.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 7
		bodyModel[17].setRotationPoint(-40F, 0F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[18].setRotationPoint(-40F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[19].setRotationPoint(-45F, 6.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[20].setRotationPoint(-45F, 4.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[21].setRotationPoint(-45F, 2.75F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[22].setRotationPoint(-40F, 2F, -9F);
		bodyModel[22].rotateAngleY = 0.5846853F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[23].setRotationPoint(-45F, 5.25F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[24].setRotationPoint(-45F, 3.5F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 82, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-41F, 3F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[26].setRotationPoint(-40F, 2F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[27].setRotationPoint(-40F, 2F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[28].setRotationPoint(-40F, 2F, 9F);
		bodyModel[28].rotateAngleY = -0.5846853F;

		bodyModel[29].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[29].setRotationPoint(-40F, 4F, 9F);
		bodyModel[29].rotateAngleY = -0.5846853F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[30].setRotationPoint(-41F, 1F, 6F);

		bodyModel[31].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[31].setRotationPoint(-45F, 8.5F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[32].setRotationPoint(-45F, 7.5F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[33].setRotationPoint(-45.01F, 7F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[34].setRotationPoint(-45F, 6.25F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[35].setRotationPoint(-45F, 5.25F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[36].setRotationPoint(-45F, 4.5F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[37].setRotationPoint(-45F, 3.5F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[38].setRotationPoint(-45F, 2.75F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[39].setRotationPoint(-40F, 4F, -9F);
		bodyModel[39].rotateAngleY = 0.5846853F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[40].setRotationPoint(-40F, 2F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[41].setRotationPoint(-28.75F, 2.75F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[42].setRotationPoint(-28.25F, 2F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[43].setRotationPoint(-28.25F, 2F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[44].setRotationPoint(-27.25F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[45].setRotationPoint(-27.25F, 2F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[46].setRotationPoint(-45.01F, 0F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(-45.01F, 0F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[48].setRotationPoint(-45.01F, -7F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[49].setRotationPoint(-45.01F, -7F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[50].setRotationPoint(-46.01F, -7F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[51].setRotationPoint(-45.01F, -7F, 3F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[52].setRotationPoint(-45.01F, -7F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[53].setRotationPoint(-45.01F, -7F, -8F);
		bodyModel[53].rotateAngleY = -3.14159265F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[54].setRotationPoint(-45.01F, -7F, 9F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[55].setRotationPoint(-43.5F, 3F, 4.3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[56].setRotationPoint(-43.25F, 4.5F, 4.55F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[57].setRotationPoint(-43.5F, 4F, 4.3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 415
		bodyModel[58].setRotationPoint(-46.25F, 1F, -2.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[59].setRotationPoint(45.5F, 3F, -1.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[60].setRotationPoint(45.01F, 1F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[61].setRotationPoint(45.01F, 7.5F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[62].setRotationPoint(45.01F, 8.5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[63].setRotationPoint(45F, 3F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[64].setRotationPoint(40F, 2F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[65].setRotationPoint(45F, 1F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[66].setRotationPoint(45F, 1F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[67].setRotationPoint(45F, 1F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[68].setRotationPoint(45.01F, 8.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[69].setRotationPoint(45.01F, 8.5F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[70].setRotationPoint(45.01F, 7F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[71].setRotationPoint(39F, 1F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[72].setRotationPoint(39F, 1F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[73].setRotationPoint(45.01F, -7F, -8F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[74].setRotationPoint(45.01F, 0F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[75].setRotationPoint(45.01F, -7F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[76].setRotationPoint(45.01F, -7F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[77].setRotationPoint(46.01F, -7F, -2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[78].setRotationPoint(45.01F, -7F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[79].setRotationPoint(45.01F, -7F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[80].setRotationPoint(45.01F, -7F, 9F);
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[81].setRotationPoint(45.01F, 0F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 616
		bodyModel[82].setRotationPoint(40F, 2F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[83].setRotationPoint(40F, 4F, -9F);
		bodyModel[83].rotateAngleY = -0.5846853F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[84].setRotationPoint(40F, 2F, -9F);
		bodyModel[84].rotateAngleY = -0.5846853F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 619
		bodyModel[85].setRotationPoint(40F, 2F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[86].setRotationPoint(40F, 2F, 9F);
		bodyModel[86].rotateAngleY = 0.5846853F;

		bodyModel[87].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[87].setRotationPoint(40F, 4F, 9F);
		bodyModel[87].rotateAngleY = 0.5846853F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[88].setRotationPoint(38F, 2F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[89].setRotationPoint(38F, 2F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[90].setRotationPoint(40F, 7.5F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[91].setRotationPoint(40F, 8.5F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[92].setRotationPoint(40F, 6.25F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[93].setRotationPoint(41F, 5.25F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[94].setRotationPoint(41F, 4.5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[95].setRotationPoint(41F, 3.5F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[96].setRotationPoint(42F, 2.75F, -7.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[97].setRotationPoint(40F, 7.5F, 9F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[98].setRotationPoint(40F, 8.5F, 9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[99].setRotationPoint(41F, 5.25F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[100].setRotationPoint(40F, 6.25F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[101].setRotationPoint(41F, 3.5F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[102].setRotationPoint(41F, 4.5F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[103].setRotationPoint(42F, 2.75F, 5.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 28, 2, 22, 0F); // Box 37
		bodyModel[104].setRotationPoint(12F, 0F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[105].setRotationPoint(24.75F, 2.75F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[106].setRotationPoint(25.25F, 2F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[107].setRotationPoint(25.25F, 2F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[108].setRotationPoint(26.25F, 2F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[109].setRotationPoint(26.25F, 2F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 24, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[110].setRotationPoint(-12F, 0F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[111].setRotationPoint(12F, 2F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[112].setRotationPoint(-16F, 2F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[113].setRotationPoint(-12F, 3.5F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[114].setRotationPoint(-12F, 3.5F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[115].setRotationPoint(12F, 2F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[116].setRotationPoint(-16F, 2F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 2, 20, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 42
		bodyModel[117].setRotationPoint(-8F, 4F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 44
		bodyModel[118].setRotationPoint(-8F, 6F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 324
		bodyModel[119].setRotationPoint(-8F, 6F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F); // Box 325
		bodyModel[120].setRotationPoint(-8F, 6F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 128 engine oil sump
		bodyModel[121].setRotationPoint(12F, 3F, -3F);
		bodyModel[121].rotateAngleZ = -1.11701072F;

		bodyModel[122].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 347
		bodyModel[122].setRotationPoint(-10F, 6.5F, -8F);
		bodyModel[122].rotateAngleZ = 0.78539816F;

		bodyModel[123].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 16, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 130
		bodyModel[123].setRotationPoint(11F, 6.5F, -8F);
		bodyModel[123].rotateAngleZ = 0.78539816F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 24, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[124].setRotationPoint(-12F, 0F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[125].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[126].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[127].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[127].setRotationPoint(-8F, 0.5F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 488 handrail extension cull
		bodyModel[128].setRotationPoint(-8F, 0.5F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526
		bodyModel[129].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527
		bodyModel[130].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[131].setRotationPoint(-4.5F, 0.5F, 9.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[132].setRotationPoint(-4.5F, 0.5F, -10.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 24, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519 frame stripe fix
		bodyModel[133].setRotationPoint(-12F, 0F, -10.51F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 24, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520 frame stripe fix
		bodyModel[134].setRotationPoint(-12F, 0F, 10.51F);

		bodyModel[135].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 142
		bodyModel[135].setRotationPoint(-10.5F, 3F, -8.01F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 4, 0, 0F); // Box 143
		bodyModel[136].setRotationPoint(-10.5F, 3F, 8.01F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[137].setRotationPoint(40F, -1F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[138].setRotationPoint(40F, -8F, 1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[139].setRotationPoint(40F, -8F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[140].setRotationPoint(39.75F, -7F, 3.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[141].setRotationPoint(39.75F, -5F, 4F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[142].setRotationPoint(42F, -8F, 2.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[143].setRotationPoint(37.5F, -12.5F, -1F);

		bodyModel[144].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[144].setRotationPoint(40.51F, -11F, -6F);
		bodyModel[144].rotateAngleY = -0.4712389F;

		bodyModel[145].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[145].setRotationPoint(40.51F, -11F, 6F);
		bodyModel[145].rotateAngleY = 0.4712389F;

		bodyModel[146].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 237
		bodyModel[146].setRotationPoint(-30F, -12.75F, -3F);

		bodyModel[147].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 238
		bodyModel[147].setRotationPoint(24F, -12.75F, -3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[148].setRotationPoint(-1F, -20F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[149].setRotationPoint(-1F, -20.5F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[150].setRotationPoint(-1F, -20.5F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[151].setRotationPoint(-1F, -20.5F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[152].setRotationPoint(-1F, -20.5F, -1F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[153].setRotationPoint(-2.5F, -14F, -2.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[154].setRotationPoint(-1.5F, -15F, 0F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[155].setRotationPoint(-2.5F, -13.5F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[156].setRotationPoint(-0.5F, -13.25F, -5F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[157].setRotationPoint(-2F, -13.25F, -7F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[158].setRotationPoint(0F, -12.5F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[159].setRotationPoint(40.5F, -8F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[160].setRotationPoint(40.5F, -6F, 10.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[161].setRotationPoint(40F, -8F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[162].setRotationPoint(40.5F, -6F, -11.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[163].setRotationPoint(40.5F, -8F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[164].setRotationPoint(40F, -8F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 55, 8, 0, 0F); // Box 92
		bodyModel[165].setRotationPoint(-15F, -8F, 11F);

		bodyModel[166].addBox(0F, 0F, 0F, 60, 8, 0, 0F); // Box 99
		bodyModel[166].setRotationPoint(-20F, -8F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[167].setRotationPoint(-45.25F, -3F, -4.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[168].setRotationPoint(-45.5F, -3F, -4.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[169].setRotationPoint(44.5F, -3F, 2.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[170].setRotationPoint(44.75F, -3F, 2.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[171].setRotationPoint(40F, -12F, 1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[172].setRotationPoint(40F, -12F, -7F);

		bodyModel[173].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 364
		bodyModel[173].setRotationPoint(40F, -12F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 365
		bodyModel[174].setRotationPoint(-43F, -12F, 1F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 13, 2, 0F); // Box 366
		bodyModel[175].setRotationPoint(-43F, -12F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[176].setRotationPoint(-43F, -12F, -7F);

		bodyModel[177].addBox(0F, 0F, 0F, 80, 12, 14, 0F); // Box 368
		bodyModel[177].setRotationPoint(-40F, -12F, -7F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 369
		bodyModel[178].setRotationPoint(-40.5F, -8F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 370
		bodyModel[179].setRotationPoint(-40.5F, -6F, -11.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 371
		bodyModel[180].setRotationPoint(-40.5F, -8F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 372
		bodyModel[181].setRotationPoint(-40.5F, -6F, 10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[182].setRotationPoint(-41F, -8F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 374
		bodyModel[183].setRotationPoint(-41F, -8F, 11F);

		bodyModel[184].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 375
		bodyModel[184].setRotationPoint(-40F, -8F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 376
		bodyModel[185].setRotationPoint(-40F, -8F, 11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 377
		bodyModel[186].setRotationPoint(47.01F, 6.5F, 0F);
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[187].setRotationPoint(47.01F, 6.5F, 8F);
		bodyModel[187].rotateAngleY = -3.14159265F;

		bodyModel[188].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 74
		bodyModel[188].setRotationPoint(-43.5F, -17.5F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[189].setRotationPoint(-40.51F, -11F, -6F);
		bodyModel[189].rotateAngleY = 0.4712389F;

		bodyModel[190].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[190].setRotationPoint(-40.51F, -11F, 6F);
		bodyModel[190].rotateAngleY = -0.4712389F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[191].setRotationPoint(-43.75F, -17.5F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[192].setRotationPoint(-43.75F, -15.5F, -1F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[193].setRotationPoint(42.5F, -17.5F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[194].setRotationPoint(42.75F, -17.5F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[195].setRotationPoint(42.75F, -15.5F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 387
		bodyModel[196].setRotationPoint(-39.5F, -12.5F, -1F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 388 cull
		bodyModel[197].setRotationPoint(-1F, -19F, -1.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 389 cull
		bodyModel[198].setRotationPoint(-42.5F, -17.5F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 390 cull
		bodyModel[199].setRotationPoint(41.5F, -17.5F, -1F);
	}

	ModelNewBlombergA1ATruck theTruck = new ModelNewBlombergA1ATruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBlombergA1ATruckSilverFncc.png"));

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/NewBlombergA1ATruckBlack.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.67, -0.02, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(3.35, 0, 0);
		theTruck.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

	}
}