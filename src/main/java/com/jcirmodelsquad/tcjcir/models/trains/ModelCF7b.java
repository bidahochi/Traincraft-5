//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CF7B
// Model Creator: bidahochi
// Created on: 24.11.2025 - 10:43:53
// Last changed on: 24.11.2025 - 10:43:53

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelCF7b extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCF7b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[277];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 48, 150, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 28, 220, textureX, textureY); // Box 132 front triangle
		bodyModel[3] = new ModelRendererTurbo(this, 7, 220, textureX, textureY); // Box 133 front triangle
		bodyModel[4] = new ModelRendererTurbo(this, 116, 220, textureX, textureY); // Box 261
		bodyModel[5] = new ModelRendererTurbo(this, 46, 157, textureX, textureY); // Box 135
		bodyModel[6] = new ModelRendererTurbo(this, 95, 150, textureX, textureY); // Box 209
		bodyModel[7] = new ModelRendererTurbo(this, 93, 157, textureX, textureY); // Box 210
		bodyModel[8] = new ModelRendererTurbo(this, 99, 165, textureX, textureY); // Box 211
		bodyModel[9] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 109, 225, textureX, textureY); // Box 336
		bodyModel[11] = new ModelRendererTurbo(this, 123, 241, textureX, textureY); // Box 4
		bodyModel[12] = new ModelRendererTurbo(this, 85, 180, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 49, 180, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 132, 180, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 96, 180, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 93, 201, textureX, textureY); // Box 184
		bodyModel[17] = new ModelRendererTurbo(this, 31, 202, textureX, textureY); // Box 150
		bodyModel[18] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 582
		bodyModel[19] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 38
		bodyModel[20] = new ModelRendererTurbo(this, 26, 194, textureX, textureY); // Box 7
		bodyModel[21] = new ModelRendererTurbo(this, 42, 202, textureX, textureY); // Box 374
		bodyModel[22] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 43
		bodyModel[25] = new ModelRendererTurbo(this, 32, 203, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 100, 186, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 240, 194, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 4, 184, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 3, 187, textureX, textureY, "cull"); // Box 66 stairbit cull
		bodyModel[32] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 10, 187, textureX, textureY); // Box 68
		bodyModel[34] = new ModelRendererTurbo(this, 9, 184, textureX, textureY); // Box 69
		bodyModel[35] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 70
		bodyModel[36] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 71
		bodyModel[37] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 75
		bodyModel[40] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 76
		bodyModel[41] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 32, 205, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 41, 205, textureX, textureY, "cull"); // Box 79 stairbit cull
		bodyModel[44] = new ModelRendererTurbo(this, 229, 244, textureX, textureY); // Box 39
		bodyModel[45] = new ModelRendererTurbo(this, 176, 244, textureX, textureY); // Box 40
		bodyModel[46] = new ModelRendererTurbo(this, 166, 219, textureX, textureY); // Box 93
		bodyModel[47] = new ModelRendererTurbo(this, 187, 243, textureX, textureY); // Box 94
		bodyModel[48] = new ModelRendererTurbo(this, 189, 253, textureX, textureY); // Box 95
		bodyModel[49] = new ModelRendererTurbo(this, 229, 249, textureX, textureY); // Box 599
		bodyModel[50] = new ModelRendererTurbo(this, 176, 249, textureX, textureY); // Box 600
		bodyModel[51] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 95, 193, textureX, textureY); // Box 143
		bodyModel[53] = new ModelRendererTurbo(this, 31, 189, textureX, textureY); // Box 126
		bodyModel[54] = new ModelRendererTurbo(this, 9, 197, textureX, textureY); // Box 127
		bodyModel[55] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 129
		bodyModel[56] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 130
		bodyModel[57] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 131
		bodyModel[58] = new ModelRendererTurbo(this, 96, 187, textureX, textureY); // Box 132
		bodyModel[59] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 133
		bodyModel[60] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 134
		bodyModel[61] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 135
		bodyModel[62] = new ModelRendererTurbo(this, 93, 187, textureX, textureY); // Box 136
		bodyModel[63] = new ModelRendererTurbo(this, 45, 160, textureX, textureY); // Box 61
		bodyModel[64] = new ModelRendererTurbo(this, 89, 160, textureX, textureY); // Box 63
		bodyModel[65] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 83, 160, textureX, textureY); // Box 144
		bodyModel[67] = new ModelRendererTurbo(this, 63, 156, textureX, textureY); // Box 145
		bodyModel[68] = new ModelRendererTurbo(this, 54, 157, textureX, textureY); // Box 147
		bodyModel[69] = new ModelRendererTurbo(this, 51, 160, textureX, textureY); // Box 148
		bodyModel[70] = new ModelRendererTurbo(this, 86, 160, textureX, textureY); // Box 430
		bodyModel[71] = new ModelRendererTurbo(this, 48, 160, textureX, textureY); // Box 433
		bodyModel[72] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 222
		bodyModel[73] = new ModelRendererTurbo(this, 92, 160, textureX, textureY); // Box 223
		bodyModel[74] = new ModelRendererTurbo(this, 98, 160, textureX, textureY); // Box 224
		bodyModel[75] = new ModelRendererTurbo(this, 101, 157, textureX, textureY); // Box 225
		bodyModel[76] = new ModelRendererTurbo(this, 110, 156, textureX, textureY); // Box 226
		bodyModel[77] = new ModelRendererTurbo(this, 121, 157, textureX, textureY); // Box 227
		bodyModel[78] = new ModelRendererTurbo(this, 130, 160, textureX, textureY); // Box 228
		bodyModel[79] = new ModelRendererTurbo(this, 133, 160, textureX, textureY); // Box 229
		bodyModel[80] = new ModelRendererTurbo(this, 136, 160, textureX, textureY); // Box 230
		bodyModel[81] = new ModelRendererTurbo(this, 327, 204, textureX, textureY); // Box 378
		bodyModel[82] = new ModelRendererTurbo(this, 327, 210, textureX, textureY); // Box 379
		bodyModel[83] = new ModelRendererTurbo(this, 327, 207, textureX, textureY); // Box 380
		bodyModel[84] = new ModelRendererTurbo(this, 41, 192, textureX, textureY, "cull"); // Box 616 stairbit cull
		bodyModel[85] = new ModelRendererTurbo(this, 32, 192, textureX, textureY); // Box 617
		bodyModel[86] = new ModelRendererTurbo(this, 32, 190, textureX, textureY); // Box 618
		bodyModel[87] = new ModelRendererTurbo(this, 3, 200, textureX, textureY, "cull"); // Box 619 stairbit cull
		bodyModel[88] = new ModelRendererTurbo(this, 10, 198, textureX, textureY); // Box 620
		bodyModel[89] = new ModelRendererTurbo(this, 10, 200, textureX, textureY); // Box 621
		bodyModel[90] = new ModelRendererTurbo(this, 4, 197, textureX, textureY); // Box 622
		bodyModel[91] = new ModelRendererTurbo(this, 42, 189, textureX, textureY); // Box 623
		bodyModel[92] = new ModelRendererTurbo(this, 20, 210, textureX, textureY); // Box 624
		bodyModel[93] = new ModelRendererTurbo(this, 18, 212, textureX, textureY); // Box 625
		bodyModel[94] = new ModelRendererTurbo(this, 18, 207, textureX, textureY); // Box 626
		bodyModel[95] = new ModelRendererTurbo(this, 21, 205, textureX, textureY); // Box 627
		bodyModel[96] = new ModelRendererTurbo(this, 19, 202, textureX, textureY); // Box 628
		bodyModel[97] = new ModelRendererTurbo(this, 21, 200, textureX, textureY); // Box 629
		bodyModel[98] = new ModelRendererTurbo(this, 20, 197, textureX, textureY); // Box 630
		bodyModel[99] = new ModelRendererTurbo(this, 20, 192, textureX, textureY); // Box 631
		bodyModel[100] = new ModelRendererTurbo(this, 18, 194, textureX, textureY); // Box 632
		bodyModel[101] = new ModelRendererTurbo(this, 21, 187, textureX, textureY); // Box 633
		bodyModel[102] = new ModelRendererTurbo(this, 18, 189, textureX, textureY); // Box 634
		bodyModel[103] = new ModelRendererTurbo(this, 21, 182, textureX, textureY); // Box 635
		bodyModel[104] = new ModelRendererTurbo(this, 19, 184, textureX, textureY); // Box 636
		bodyModel[105] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 637
		bodyModel[106] = new ModelRendererTurbo(this, 48, 157, textureX, textureY); // Box 72
		bodyModel[107] = new ModelRendererTurbo(this, 95, 157, textureX, textureY); // Box 80
		bodyModel[108] = new ModelRendererTurbo(this, 109, 216, textureX, textureY); // Box 38
		bodyModel[109] = new ModelRendererTurbo(this, 239, 238, textureX, textureY); // Box 504
		bodyModel[110] = new ModelRendererTurbo(this, 243, 249, textureX, textureY); // Box 512
		bodyModel[111] = new ModelRendererTurbo(this, 243, 249, textureX, textureY); // Box 513
		bodyModel[112] = new ModelRendererTurbo(this, 52, 165, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 7, 144, textureX, textureY); // Box 514 brw 42 rear triangle
		bodyModel[114] = new ModelRendererTurbo(this, 28, 144, textureX, textureY); // Box 515 brw 42 rear triangle
		bodyModel[115] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 259
		bodyModel[116] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 260
		bodyModel[117] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 246
		bodyModel[118] = new ModelRendererTurbo(this, 371, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[119] = new ModelRendererTurbo(this, 371, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[120] = new ModelRendererTurbo(this, 333, 210, textureX, textureY); // Box 188 not a ditchlight mount
		bodyModel[121] = new ModelRendererTurbo(this, 333, 205, textureX, textureY); // Box 190 mu plug
		bodyModel[122] = new ModelRendererTurbo(this, 139, 158, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 142, 164, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 152, 164, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 45
		bodyModel[126] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 46
		bodyModel[127] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 48
		bodyModel[128] = new ModelRendererTurbo(this, 248, 234, textureX, textureY); // Box 50
		bodyModel[129] = new ModelRendererTurbo(this, 227, 232, textureX, textureY); // Box 99
		bodyModel[130] = new ModelRendererTurbo(this, 226, 220, textureX, textureY); // Box 95
		bodyModel[131] = new ModelRendererTurbo(this, 268, 220, textureX, textureY, "cull"); // Box 96 cull air resivour pipe
		bodyModel[132] = new ModelRendererTurbo(this, 249, 220, textureX, textureY); // Box 130
		bodyModel[133] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 131
		bodyModel[134] = new ModelRendererTurbo(this, 250, 221, textureX, textureY); // Box 132
		bodyModel[135] = new ModelRendererTurbo(this, 67, 222, textureX, textureY); // Box 42
		bodyModel[136] = new ModelRendererTurbo(this, 34, 222, textureX, textureY); // Box 324
		bodyModel[137] = new ModelRendererTurbo(this, 5, 233, textureX, textureY); // Box 506
		bodyModel[138] = new ModelRendererTurbo(this, 225, 90, textureX, textureY); // Box 262
		bodyModel[139] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 263
		bodyModel[140] = new ModelRendererTurbo(this, 195, 90, textureX, textureY); // Box 264
		bodyModel[141] = new ModelRendererTurbo(this, 244, 94, textureX, textureY); // Box 265
		bodyModel[142] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 247 Headlight Rear
		bodyModel[143] = new ModelRendererTurbo(this, 244, 101, textureX, textureY, "lamp"); // Box 248 Headlight Rear
		bodyModel[144] = new ModelRendererTurbo(this, 225, 119, textureX, textureY); // Box 252
		bodyModel[145] = new ModelRendererTurbo(this, 225, 109, textureX, textureY); // Box 253
		bodyModel[146] = new ModelRendererTurbo(this, 239, 109, textureX, textureY); // Box 254
		bodyModel[147] = new ModelRendererTurbo(this, 234, 109, textureX, textureY); // Box 43
		bodyModel[148] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Box 43
		bodyModel[149] = new ModelRendererTurbo(this, 246, 111, textureX, textureY); // Box 601
		bodyModel[150] = new ModelRendererTurbo(this, 215, 90, textureX, textureY); // Box 402
		bodyModel[151] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 117 Numberboard R
		bodyModel[152] = new ModelRendererTurbo(this, 251, 92, textureX, textureY, "lamp"); // Box 118 Numberboard R
		bodyModel[153] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Box 51
		bodyModel[154] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 186 fan
		bodyModel[155] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 682 fan
		bodyModel[156] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 683 fan
		bodyModel[157] = new ModelRendererTurbo(this, 176, 62, textureX, textureY); // Box 684 fan
		bodyModel[158] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 153 stack 1
		bodyModel[159] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 154 stack 2
		bodyModel[160] = new ModelRendererTurbo(this, 192, 82, textureX, textureY); // Box 155 stack 3
		bodyModel[161] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Box 156 stack 4
		bodyModel[162] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 316
		bodyModel[163] = new ModelRendererTurbo(this, 90, 141, textureX, textureY); // Box 193
		bodyModel[164] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // Box 343
		bodyModel[165] = new ModelRendererTurbo(this, 182, 142, textureX, textureY); // Box 90
		bodyModel[166] = new ModelRendererTurbo(this, 202, 144, textureX, textureY); // Box 91
		bodyModel[167] = new ModelRendererTurbo(this, 204, 146, textureX, textureY); // Box 414
		bodyModel[168] = new ModelRendererTurbo(this, 93, 129, textureX, textureY); // Box 526
		bodyModel[169] = new ModelRendererTurbo(this, 71, 39, textureX, textureY, "cull"); // Box 81 handrail cull
		bodyModel[170] = new ModelRendererTurbo(this, 68, 40, textureX, textureY); // Box 81
		bodyModel[171] = new ModelRendererTurbo(this, 68, 19, textureX, textureY); // Box 176
		bodyModel[172] = new ModelRendererTurbo(this, 71, 20, textureX, textureY, "cull"); // Box 177 handrail cull
		bodyModel[173] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 92
		bodyModel[175] = new ModelRendererTurbo(this, 92, 41, textureX, textureY); // Box 99
		bodyModel[176] = new ModelRendererTurbo(this, 189, 18, textureX, textureY, "cull"); // Box 243 handrail cull
		bodyModel[177] = new ModelRendererTurbo(this, 196, 19, textureX, textureY); // Box 244
		bodyModel[178] = new ModelRendererTurbo(this, 185, 40, textureX, textureY); // Box 249
		bodyModel[179] = new ModelRendererTurbo(this, 178, 39, textureX, textureY, "cull"); // Box 250 handrail cull
		bodyModel[180] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 522
		bodyModel[181] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Box 523
		bodyModel[182] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 524
		bodyModel[183] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 527
		bodyModel[184] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 292
		bodyModel[185] = new ModelRendererTurbo(this, 226, 243, textureX, textureY); // Box 101
		bodyModel[186] = new ModelRendererTurbo(this, 187, 13, textureX, textureY, "cull"); // Box 488 handrail extension cull
		bodyModel[187] = new ModelRendererTurbo(this, 220, 246, textureX, textureY, "cull"); // Box 526 cull fuel filler buildup area
		bodyModel[188] = new ModelRendererTurbo(this, 220, 246, textureX, textureY, "cull"); // Box 527 cull fuel filler buildup area
		bodyModel[189] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 528 kartrak my beloved
		bodyModel[190] = new ModelRendererTurbo(this, 213, 246, textureX, textureY); // Box 529 kartrak my beloved
		bodyModel[191] = new ModelRendererTurbo(this, 136, 53, textureX, textureY); // Box 519 frame stripe fix
		bodyModel[192] = new ModelRendererTurbo(this, 150, 32, textureX, textureY); // Box 520 frame stripe fix
		bodyModel[193] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 609
		bodyModel[194] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 610
		bodyModel[195] = new ModelRendererTurbo(this, 121, 61, textureX, textureY); // Box 256
		bodyModel[196] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 257
		bodyModel[197] = new ModelRendererTurbo(this, 13, 83, textureX, textureY); // Box 200
		bodyModel[198] = new ModelRendererTurbo(this, 30, 57, textureX, textureY); // Box 201
		bodyModel[199] = new ModelRendererTurbo(this, 11, 53, textureX, textureY); // Box 202
		bodyModel[200] = new ModelRendererTurbo(this, 41, 53, textureX, textureY); // Box 203
		bodyModel[201] = new ModelRendererTurbo(this, 337, 104, textureX, textureY); // Box 74
		bodyModel[202] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[203] = new ModelRendererTurbo(this, 348, 111, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[204] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[205] = new ModelRendererTurbo(this, 339, 99, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[206] = new ModelRendererTurbo(this, 31, 53, textureX, textureY); // Box 209
		bodyModel[207] = new ModelRendererTurbo(this, 182, 133, textureX, textureY); // Box 210
		bodyModel[208] = new ModelRendererTurbo(this, 202, 135, textureX, textureY); // Box 211
		bodyModel[209] = new ModelRendererTurbo(this, 204, 137, textureX, textureY); // Box 212
		bodyModel[210] = new ModelRendererTurbo(this, 193, 144, textureX, textureY); // Box 318
		bodyModel[211] = new ModelRendererTurbo(this, 193, 135, textureX, textureY); // Box 214
		bodyModel[212] = new ModelRendererTurbo(this, 37, 20, textureX, textureY); // Box 215
		bodyModel[213] = new ModelRendererTurbo(this, 37, 41, textureX, textureY); // Box 216
		bodyModel[214] = new ModelRendererTurbo(this, 105, 22, textureX, textureY); // Box 217
		bodyModel[215] = new ModelRendererTurbo(this, 95, 22, textureX, textureY); // Box 218
		bodyModel[216] = new ModelRendererTurbo(this, 102, 22, textureX, textureY); // Box 219
		bodyModel[217] = new ModelRendererTurbo(this, 75, 131, textureX, textureY); // Box 220
		bodyModel[218] = new ModelRendererTurbo(this, 62, 133, textureX, textureY); // Box 221
		bodyModel[219] = new ModelRendererTurbo(this, 78, 119, textureX, textureY); // Box 222
		bodyModel[220] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 225
		bodyModel[221] = new ModelRendererTurbo(this, 68, 45, textureX, textureY); // Box 226
		bodyModel[222] = new ModelRendererTurbo(this, 321, 67, textureX, textureY); // DBox 89
		bodyModel[223] = new ModelRendererTurbo(this, 294, 61, textureX, textureY); // DBox 91
		bodyModel[224] = new ModelRendererTurbo(this, 304, 51, textureX, textureY); // DBox 101
		bodyModel[225] = new ModelRendererTurbo(this, 291, 51, textureX, textureY); // DBox 105
		bodyModel[226] = new ModelRendererTurbo(this, 325, 51, textureX, textureY); // DBox 172
		bodyModel[227] = new ModelRendererTurbo(this, 304, 56, textureX, textureY); // DBox 173
		bodyModel[228] = new ModelRendererTurbo(this, 291, 56, textureX, textureY); // DBox 176
		bodyModel[229] = new ModelRendererTurbo(this, 325, 56, textureX, textureY); // DBox 177
		bodyModel[230] = new ModelRendererTurbo(this, 304, 77, textureX, textureY); // DBox 178
		bodyModel[231] = new ModelRendererTurbo(this, 325, 77, textureX, textureY); // DBox 179
		bodyModel[232] = new ModelRendererTurbo(this, 325, 82, textureX, textureY); // DBox 180
		bodyModel[233] = new ModelRendererTurbo(this, 304, 82, textureX, textureY); // DBox 181
		bodyModel[234] = new ModelRendererTurbo(this, 291, 82, textureX, textureY); // DBox 182
		bodyModel[235] = new ModelRendererTurbo(this, 291, 77, textureX, textureY); // DBox 183
		bodyModel[236] = new ModelRendererTurbo(this, 321, 62, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[237] = new ModelRendererTurbo(this, 321, 62, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[238] = new ModelRendererTurbo(this, 18, 5, textureX, textureY); // Box 243
		bodyModel[239] = new ModelRendererTurbo(this, 69, 5, textureX, textureY); // Box 244
		bodyModel[240] = new ModelRendererTurbo(this, 283, 10, textureX, textureY, "cull"); // Box 245 handrail extension cull
		bodyModel[241] = new ModelRendererTurbo(this, 79, 29, textureX, textureY); // Box 246
		bodyModel[242] = new ModelRendererTurbo(this, 82, 29, textureX, textureY); // Box 247
		bodyModel[243] = new ModelRendererTurbo(this, 205, 78, textureX, textureY, "cull"); // Box 391 cull arrestor cagy
		bodyModel[244] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 392 cull arrestor cagy
		bodyModel[245] = new ModelRendererTurbo(this, 205, 68, textureX, textureY, "cull"); // Box 393 cull arrestor cagy
		bodyModel[246] = new ModelRendererTurbo(this, 205, 78, textureX, textureY, "cull"); // Box 394 cull arrestor cagy
		bodyModel[247] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 395 cull arrestor cagy
		bodyModel[248] = new ModelRendererTurbo(this, 222, 78, textureX, textureY, "cull"); // Box 396 cull arrestor cagy
		bodyModel[249] = new ModelRendererTurbo(this, 222, 68, textureX, textureY, "cull"); // Box 397 cull arrestor cagy
		bodyModel[250] = new ModelRendererTurbo(this, 222, 78, textureX, textureY, "cull"); // Box 398 cull arrestor cagy
		bodyModel[251] = new ModelRendererTurbo(this, 182, 70, textureX, textureY, "cull"); // Box 196 winterization hatch cull
		bodyModel[252] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[253] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[254] = new ModelRendererTurbo(this, 241, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[255] = new ModelRendererTurbo(this, 247, 60, textureX, textureY); // Box 523
		bodyModel[256] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[257] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[258] = new ModelRendererTurbo(this, 266, 66, textureX, textureY, "cull"); // Box 522 tall arrestor cull
		bodyModel[259] = new ModelRendererTurbo(this, 272, 60, textureX, textureY); // Box 523
		bodyModel[260] = new ModelRendererTurbo(this, 197, 62, textureX, textureY); // Box 529 watx 6 spark arrestor
		bodyModel[261] = new ModelRendererTurbo(this, 197, 62, textureX, textureY); // Box 530 watx 6 spark arrestor
		bodyModel[262] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 531 ecrx spark arrestor
		bodyModel[263] = new ModelRendererTurbo(this, 197, 55, textureX, textureY); // Box 532 ecrx spark arrestor
		bodyModel[264] = new ModelRendererTurbo(this, 467, 223, textureX, textureY); // Box 526 CGRX 2508 batbox
		bodyModel[265] = new ModelRendererTurbo(this, 467, 223, textureX, textureY); // Box 527 CGRX 2508 batbox
		bodyModel[266] = new ModelRendererTurbo(this, 385, 219, textureX, textureY); // Box 409
		bodyModel[267] = new ModelRendererTurbo(this, 423, 230, textureX, textureY, "cull"); // Box 282 antenna plate cull
		bodyModel[268] = new ModelRendererTurbo(this, 376, 222, textureX, textureY); // Box 450
		bodyModel[269] = new ModelRendererTurbo(this, 391, 219, textureX, textureY); // Box 104 cnrc antenna
		bodyModel[270] = new ModelRendererTurbo(this, 380, 204, textureX, textureY); // Box 364 prime base tall
		bodyModel[271] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[272] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[273] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[274] = new ModelRendererTurbo(this, 389, 204, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[275] = new ModelRendererTurbo(this, 382, 181, textureX, textureY); // Box 409 commander base generic
		bodyModel[276] = new ModelRendererTurbo(this, 387, 180, textureX, textureY, "commander"); // Box 410 commander beacon generic

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[0].setRotationPoint(-39.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[1].setRotationPoint(-36.01F, 1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 front triangle
		bodyModel[2].setRotationPoint(-38.01F, 6.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133 front triangle
		bodyModel[3].setRotationPoint(-38.01F, 6.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[4].setRotationPoint(36.5F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[5].setRotationPoint(-36.01F, 7.5F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[6].setRotationPoint(36.01F, 1F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[7].setRotationPoint(36.01F, 7.5F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 211
		bodyModel[8].setRotationPoint(36.01F, 8.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 2
		bodyModel[9].setRotationPoint(36F, 3F, -2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 336
		bodyModel[10].setRotationPoint(-37F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[11].setRotationPoint(-36F, 2F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-36.01F, 8.5F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[13].setRotationPoint(-36.01F, 8.5F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[14].setRotationPoint(36.01F, 8.5F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(36.01F, 8.5F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 72, 2, 12, 0F); // Box 184
		bodyModel[16].setRotationPoint(-36F, 1F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 150
		bodyModel[17].setRotationPoint(-32F, 1F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 582
		bodyModel[18].setRotationPoint(-36F, 8.5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 38
		bodyModel[19].setRotationPoint(-36F, 7.5F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[20].setRotationPoint(-31F, 0F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[21].setRotationPoint(-30.25F, 2F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[22].setRotationPoint(-36F, 6.25F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[23].setRotationPoint(-36F, 4.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[24].setRotationPoint(-36F, 2.75F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 49
		bodyModel[25].setRotationPoint(-31F, 2F, -9F);
		bodyModel[25].rotateAngleY = 0.5846853F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[26].setRotationPoint(-36F, 5.25F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[27].setRotationPoint(-36F, 3.5F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 64, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[28].setRotationPoint(-32F, 3F, -6.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[29].setRotationPoint(9F, 0F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[30].setRotationPoint(-30.25F, 2F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66 stairbit cull
		bodyModel[31].setRotationPoint(-31F, 2F, 9F);

		bodyModel[32].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[32].setRotationPoint(-31F, 2F, 9F);
		bodyModel[32].rotateAngleY = -0.5846853F;

		bodyModel[33].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[33].setRotationPoint(-31F, 4F, 9F);
		bodyModel[33].rotateAngleY = -0.5846853F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		bodyModel[34].setRotationPoint(-32F, 1F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 70
		bodyModel[35].setRotationPoint(-36F, 8.5F, 9F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 71
		bodyModel[36].setRotationPoint(-36F, 7.5F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[37].setRotationPoint(-36F, 6.25F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[38].setRotationPoint(-36F, 5.25F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[39].setRotationPoint(-36F, 4.5F, 6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[40].setRotationPoint(-36F, 3.5F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[41].setRotationPoint(-36F, 2.75F, 5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 78
		bodyModel[42].setRotationPoint(-31F, 4F, -9F);
		bodyModel[42].rotateAngleY = 0.5846853F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79 stairbit cull
		bodyModel[43].setRotationPoint(-31F, 2F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[44].setRotationPoint(9F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[45].setRotationPoint(-13F, 2F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[46].setRotationPoint(-9F, 0F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 94
		bodyModel[47].setRotationPoint(-9F, 3.5F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[48].setRotationPoint(-9F, 3.5F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[49].setRotationPoint(9F, 2F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[50].setRotationPoint(-13F, 2F, 9F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[51].setRotationPoint(-22.75F, 2.75F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[52].setRotationPoint(18.75F, 2.75F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[53].setRotationPoint(30F, 1F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 127
		bodyModel[54].setRotationPoint(30F, 1F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[55].setRotationPoint(-22.25F, 2F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[56].setRotationPoint(-22.25F, 2F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 131
		bodyModel[57].setRotationPoint(19.25F, 2F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 132
		bodyModel[58].setRotationPoint(19.25F, 2F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[59].setRotationPoint(-21.25F, 2F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[60].setRotationPoint(-21.25F, 2F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[61].setRotationPoint(20.25F, 2F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 136
		bodyModel[62].setRotationPoint(20.25F, 2F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[63].setRotationPoint(-36.01F, 0F, 10F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[64].setRotationPoint(-36.01F, 0F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 80
		bodyModel[65].setRotationPoint(-36.01F, -7F, -7F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[66].setRotationPoint(-36.01F, -7F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 145
		bodyModel[67].setRotationPoint(-37.01F, -7F, -2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[68].setRotationPoint(-36.01F, -7F, 3F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[69].setRotationPoint(-36.01F, -7F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 430
		bodyModel[70].setRotationPoint(-36.01F, -7F, -8F);
		bodyModel[70].rotateAngleY = -3.14159265F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 433
		bodyModel[71].setRotationPoint(-36.01F, -7F, 9F);
		bodyModel[71].rotateAngleY = -3.14159265F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 222
		bodyModel[72].setRotationPoint(36.01F, -7F, -8F);
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 223
		bodyModel[73].setRotationPoint(36.01F, 0F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 224
		bodyModel[74].setRotationPoint(36.01F, -7F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 225
		bodyModel[75].setRotationPoint(36.01F, -7F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 226
		bodyModel[76].setRotationPoint(37.01F, -7F, -2.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[77].setRotationPoint(36.01F, -7F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 228
		bodyModel[78].setRotationPoint(36.01F, -7F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 229
		bodyModel[79].setRotationPoint(36.01F, -7F, 9F);
		bodyModel[79].rotateAngleY = -3.14159265F;

		bodyModel[80].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 230
		bodyModel[80].setRotationPoint(36.01F, 0F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[81].setRotationPoint(-34.5F, 3F, 4.3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[82].setRotationPoint(-34.25F, 4.5F, 4.55F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[83].setRotationPoint(-34.5F, 4F, 4.3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 616 stairbit cull
		bodyModel[84].setRotationPoint(30F, 2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 617
		bodyModel[85].setRotationPoint(31F, 4F, -9F);
		bodyModel[85].rotateAngleY = -0.5846853F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 618
		bodyModel[86].setRotationPoint(31F, 2F, -9F);
		bodyModel[86].rotateAngleY = -0.5846853F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 619 stairbit cull
		bodyModel[87].setRotationPoint(30F, 2F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[88].setRotationPoint(31F, 2F, 9F);
		bodyModel[88].rotateAngleY = 0.5846853F;

		bodyModel[89].addShapeBox(0F, 0F, -4F, 0, 5, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[89].setRotationPoint(31F, 4F, 9F);
		bodyModel[89].rotateAngleY = 0.5846853F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 622
		bodyModel[90].setRotationPoint(28.25F, 2F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 623
		bodyModel[91].setRotationPoint(28.25F, 2F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 624
		bodyModel[92].setRotationPoint(31F, 7.5F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 625
		bodyModel[93].setRotationPoint(31F, 8.5F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F); // Box 626
		bodyModel[94].setRotationPoint(31F, 6.25F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 627
		bodyModel[95].setRotationPoint(32F, 5.25F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 628
		bodyModel[96].setRotationPoint(32F, 4.5F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 629
		bodyModel[97].setRotationPoint(32F, 3.5F, -6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 630
		bodyModel[98].setRotationPoint(33F, 2.75F, -7.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 631
		bodyModel[99].setRotationPoint(31F, 7.5F, 9F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 632
		bodyModel[100].setRotationPoint(31F, 8.5F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.325F, 0F, 0F); // Box 633
		bodyModel[101].setRotationPoint(32F, 5.25F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		bodyModel[102].setRotationPoint(31F, 6.25F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 635
		bodyModel[103].setRotationPoint(32F, 3.5F, 6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 636
		bodyModel[104].setRotationPoint(32F, 4.5F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 637
		bodyModel[105].setRotationPoint(33F, 2.75F, 5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[106].setRotationPoint(-36.01F, 7F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[107].setRotationPoint(36.01F, 7F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[108].setRotationPoint(-9F, 0F, -10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 1F, 15.5F, 0F, 1F, 15.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[109].setRotationPoint(-9.25F, 3.5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 1F, 0F, 0F, 1F); // Box 512
		bodyModel[110].setRotationPoint(-9.25F, 1.5F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 15.5F, 0F, 0F, 15.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 15.5F, 0F, 1F, 15.5F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[111].setRotationPoint(-9.25F, 1.5F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 1, 16, 0F); // Box 139
		bodyModel[112].setRotationPoint(-36.01F, 8.5F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 514 brw 42 rear triangle
		bodyModel[113].setRotationPoint(38.01F, 6.5F, 0F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515 brw 42 rear triangle
		bodyModel[114].setRotationPoint(38.01F, 6.5F, 8F);
		bodyModel[114].rotateAngleY = -3.14159265F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[115].setRotationPoint(36F, 1F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[116].setRotationPoint(36F, 1F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[117].setRotationPoint(36F, 1F, 5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[118].setRotationPoint(35.5F, -3F, 2.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[119].setRotationPoint(35.75F, -3F, 2.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188 not a ditchlight mount
		bodyModel[120].setRotationPoint(-36.25F, -3F, -4.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 mu plug
		bodyModel[121].setRotationPoint(-36.5F, -3F, -4.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bodyModel[122].setRotationPoint(-37F, 1F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(-37F, 1F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 124
		bodyModel[124].setRotationPoint(-37F, 1F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[125].setRotationPoint(-8.63F, 4.5F, -10.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 46
		bodyModel[126].setRotationPoint(-8.63F, 3.5F, -9.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[127].setRotationPoint(-8.63F, 7.5F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[128].setRotationPoint(-8.63F, 4.5F, 9.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[129].setRotationPoint(-8.63F, 7.5F, 2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 95
		bodyModel[130].setRotationPoint(-8.63F, 3.5F, 2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -4F, -0.125F, -1F, -4F, -0.125F, -1F, -4F, -0.125F, 0F, -4F, -0.125F); // Box 96 cull air resivour pipe
		bodyModel[131].setRotationPoint(-9.45F, 3F, -0.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 7, 4, 2, 0F); // Box 130
		bodyModel[132].setRotationPoint(-8.63F, 4.5F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[133].setRotationPoint(-8.63F, 5.5F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[134].setRotationPoint(-8.63F, 5.5F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 10, 3, 20, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[135].setRotationPoint(-1.25F, 4.1F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[136].setRotationPoint(-1.25F, 7.1F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 506
		bodyModel[137].setRotationPoint(-1.25F, 3.85F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[138].setRotationPoint(31F, -20F, 1F);

		bodyModel[139].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[139].setRotationPoint(31F, -20F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[140].setRotationPoint(31F, -20F, -7F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[141].setRotationPoint(33.5F, -18.5F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Rear
		bodyModel[142].setRotationPoint(33.75F, -18.5F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Rear
		bodyModel[143].setRotationPoint(33.75F, -16.5F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[144].setRotationPoint(31F, -1F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[145].setRotationPoint(31F, -8F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[146].setRotationPoint(31F, -8F, 5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[147].setRotationPoint(30.75F, -7F, 3.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[148].setRotationPoint(30.75F, -5F, 4F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[149].setRotationPoint(33F, -8F, 2.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[150].setRotationPoint(30.5F, -20.5F, -1F);

		bodyModel[151].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard R
		bodyModel[151].setRotationPoint(31.51F, -17F, -6F);
		bodyModel[151].rotateAngleY = -0.4712389F;

		bodyModel[152].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard R
		bodyModel[152].setRotationPoint(31.51F, -17F, 6F);
		bodyModel[152].rotateAngleY = 0.4712389F;

		bodyModel[153].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[153].setRotationPoint(-11F, -20F, -7F);

		bodyModel[154].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 186 fan
		bodyModel[154].setRotationPoint(-3.5F, -21F, -2.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 682 fan
		bodyModel[155].setRotationPoint(-9.5F, -21F, -2.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 683 fan
		bodyModel[156].setRotationPoint(23.5F, -21F, -2.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 684 fan
		bodyModel[157].setRotationPoint(17.5F, -21F, -2.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 153 stack 1
		bodyModel[158].setRotationPoint(5.5F, -22F, -1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 154 stack 2
		bodyModel[159].setRotationPoint(8.25F, -22F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155 stack 3
		bodyModel[160].setRotationPoint(10.75F, -22F, -1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 156 stack 4
		bodyModel[161].setRotationPoint(13.5F, -22F, -1.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 316
		bodyModel[162].setRotationPoint(-26F, -5F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[163].setRotationPoint(-29F, -4F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[164].setRotationPoint(-30F, -2F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[165].setRotationPoint(-11F, -4F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[166].setRotationPoint(-11F, -5F, 11.01F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 414
		bodyModel[167].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 526
		bodyModel[168].setRotationPoint(-31F, -11F, -11.01F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81 handrail cull
		bodyModel[169].setRotationPoint(-31.5F, -11F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[170].setRotationPoint(-31.5F, -5F, -11.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[171].setRotationPoint(-31.5F, -5F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 16, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177 handrail cull
		bodyModel[172].setRotationPoint(-31.5F, -11F, 9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[173].setRotationPoint(-30F, -11F, -11F);

		bodyModel[174].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[174].setRotationPoint(-6F, -8F, 11F);

		bodyModel[175].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[175].setRotationPoint(-11F, -8F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 243 handrail cull
		bodyModel[176].setRotationPoint(31F, -8F, 9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[177].setRotationPoint(31.5F, -6F, 10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[178].setRotationPoint(31.5F, -6F, -11.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 250 handrail cull
		bodyModel[179].setRotationPoint(31F, -8F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[180].setRotationPoint(-8F, -10F, 11.01F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1.25F, -3F, 0F, -1.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, 0.25F, 0F, 0F); // Box 523
		bodyModel[181].setRotationPoint(-11F, -13F, 11.01F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 524
		bodyModel[182].setRotationPoint(-9F, -10F, 11.01F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 527
		bodyModel[183].setRotationPoint(-31.5F, -10F, -11F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[184].setRotationPoint(4F, 2.5F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[185].setRotationPoint(4F, 2.5F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 36, 1, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F); // Box 488 handrail extension cull
		bodyModel[186].setRotationPoint(-6F, 0.5F, -11F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 526 cull fuel filler buildup area
		bodyModel[187].setRotationPoint(3F, 0.5F, 9.95F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 527 cull fuel filler buildup area
		bodyModel[188].setRotationPoint(3F, 0.5F, -10.95F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 528 kartrak my beloved
		bodyModel[189].setRotationPoint(-3.5F, 0.5F, 9.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 529 kartrak my beloved
		bodyModel[190].setRotationPoint(-3.5F, 0.5F, -10.75F);

		bodyModel[191].addBox(0F, 0F, 0F, 18, 4, 0, 0F); // Box 519 frame stripe fix
		bodyModel[191].setRotationPoint(-9F, 0F, -10.51F);

		bodyModel[192].addBox(0F, 0F, 0F, 18, 4, 0, 0F); // Box 520 frame stripe fix
		bodyModel[192].setRotationPoint(-9F, 0F, 10.51F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 609
		bodyModel[193].setRotationPoint(-10F, -18.5F, 6.1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 610
		bodyModel[194].setRotationPoint(18F, -18.5F, 6.1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F, 0F); // Box 256
		bodyModel[195].setRotationPoint(18F, -18.5F, -7.1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 257
		bodyModel[196].setRotationPoint(-10F, -18.5F, -7.1F);

		bodyModel[197].addBox(0F, 0F, 0F, 20, 20, 14, 0F); // Box 200
		bodyModel[197].setRotationPoint(-31F, -20F, -7F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 201
		bodyModel[198].setRotationPoint(-34F, -20F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 202
		bodyModel[199].setRotationPoint(-34F, -20F, 1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[200].setRotationPoint(-34F, -20F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[201].setRotationPoint(-35F, -18.5F, -1F);

		bodyModel[202].addBox(-1F, 0F, 0.5F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[202].setRotationPoint(-30.51F, -17F, -6F);
		bodyModel[202].rotateAngleY = 0.4712389F;

		bodyModel[203].addBox(-1F, 0F, -5.5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[203].setRotationPoint(-30.51F, -17F, 6F);
		bodyModel[203].rotateAngleY = -0.4712389F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[204].setRotationPoint(-34.75F, -18.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[205].setRotationPoint(-34.75F, -16.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 209
		bodyModel[206].setRotationPoint(-32.5F, -20.5F, -1F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 210
		bodyModel[207].setRotationPoint(-11F, -4F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[208].setRotationPoint(-11F, -5F, -11.01F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 212
		bodyModel[209].setRotationPoint(-10F, -4F, -11.01F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[210].setRotationPoint(-10F, -2F, 7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[211].setRotationPoint(-10F, -2F, -11F);

		bodyModel[212].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 215
		bodyModel[212].setRotationPoint(-26F, -13F, 11F);

		bodyModel[213].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 216
		bodyModel[213].setRotationPoint(-26F, -13F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[214].setRotationPoint(-8F, -10F, -11.01F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1.25F, -3F, 0F, -1.25F, -3F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, 3F, 0F, 0.25F, 0F, 0F); // Box 218
		bodyModel[215].setRotationPoint(-11F, -13F, -11.01F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		bodyModel[216].setRotationPoint(-9F, -10F, -11.01F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 220
		bodyModel[217].setRotationPoint(-29F, -4F, 6F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 221
		bodyModel[218].setRotationPoint(-30F, -2F, 6F);

		bodyModel[219].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 222
		bodyModel[219].setRotationPoint(-31F, -11F, 11.01F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[220].setRotationPoint(-30F, -11F, 11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 226
		bodyModel[221].setRotationPoint(-31.5F, -10F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89
		bodyModel[222].setRotationPoint(-23.5F, -21.5F, -3F);

		bodyModel[223].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[223].setRotationPoint(-23.5F, -21F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[224].setRotationPoint(-24.5F, -19F, 7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[225].setRotationPoint(-28.5F, -19F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[226].setRotationPoint(-16.5F, -19F, 7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[227].setRotationPoint(-24.5F, -21F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[228].setRotationPoint(-28.5F, -21F, 7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[229].setRotationPoint(-16.5F, -21F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[230].setRotationPoint(-24.5F, -21F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[231].setRotationPoint(-16.5F, -21F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[232].setRotationPoint(-16.5F, -19F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[233].setRotationPoint(-24.5F, -19F, -9F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[234].setRotationPoint(-28.5F, -19F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[235].setRotationPoint(-28.5F, -21F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[236].setRotationPoint(-24.5F, -19.5F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[237].setRotationPoint(-24.5F, -19.5F, 8F);

		bodyModel[238].addBox(0F, 0F, 0F, 25, 8, 0, 0F); // Box 243
		bodyModel[238].setRotationPoint(-31F, -8F, 11F);

		bodyModel[239].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 244
		bodyModel[239].setRotationPoint(-31F, -8F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 24, 1, 22, 0F,0F, 0F, 0.05F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F, 0F, 0F, 0.015F); // Box 245 handrail extension cull
		bodyModel[240].setRotationPoint(-30F, 0.5F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 246
		bodyModel[241].setRotationPoint(-31.5F, -6F, -11.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 247
		bodyModel[242].setRotationPoint(-31.5F, -6F, 10.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 391 cull arrestor cagy
		bodyModel[243].setRotationPoint(5.5F, -21.5F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392 cull arrestor cagy
		bodyModel[244].setRotationPoint(5.5F, -23.5F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull arrestor cagy
		bodyModel[245].setRotationPoint(13.5F, -23.5F, -3F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 394 cull arrestor cagy
		bodyModel[246].setRotationPoint(13.5F, -21.5F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395 cull arrestor cagy
		bodyModel[247].setRotationPoint(10.75F, -23.5F, -3F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 396 cull arrestor cagy
		bodyModel[248].setRotationPoint(10.75F, -21.5F, -3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull arrestor cagy
		bodyModel[249].setRotationPoint(8.25F, -23.5F, -3F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398 cull arrestor cagy
		bodyModel[250].setRotationPoint(8.25F, -21.5F, -3F);

		bodyModel[251].addBox(0F, 0F, 0F, 7, 3, 7, 0F); // Box 196 winterization hatch cull
		bodyModel[251].setRotationPoint(16F, -22.5F, -3.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[252].setRotationPoint(5.5F, -24F, -2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[253].setRotationPoint(5.5F, -25F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[254].setRotationPoint(13.5F, -24F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[255].setRotationPoint(13.5F, -25F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[256].setRotationPoint(8.25F, -24F, -2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[257].setRotationPoint(8.25F, -25F, -2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 tall arrestor cull
		bodyModel[258].setRotationPoint(10.75F, -24F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[259].setRotationPoint(10.75F, -25F, -2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 529 watx 6 spark arrestor
		bodyModel[260].setRotationPoint(5F, -23F, -1.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F); // Box 530 watx 6 spark arrestor
		bodyModel[261].setRotationPoint(13F, -23F, -1.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 531 ecrx spark arrestor
		bodyModel[262].setRotationPoint(7.75F, -23F, -1.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F); // Box 532 ecrx spark arrestor
		bodyModel[263].setRotationPoint(10.25F, -23F, -1.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 7, 5, 8, 0F); // Box 526 CGRX 2508 batbox
		bodyModel[264].setRotationPoint(-8.63F, 4F, -10.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 7, 5, 8, 0F); // Box 527 CGRX 2508 batbox
		bodyModel[265].setRotationPoint(-8.63F, 4F, 2.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 409
		bodyModel[266].setRotationPoint(-13F, -24F, -2F);

		bodyModel[267].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 282 antenna plate cull
		bodyModel[267].setRotationPoint(-16F, -22F, -2.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[268].setRotationPoint(-15F, -23F, 0F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 cnrc antenna
		bodyModel[269].setRotationPoint(-15F, -26F, 0F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 364 prime base tall
		bodyModel[270].setRotationPoint(-28F, -21F, -5.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[271].setRotationPoint(-28F, -22F, -5.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[272].setRotationPoint(-28F, -22F, -5.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[273].setRotationPoint(-28F, -22F, -5.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[274].setRotationPoint(-28F, -22F, -5.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base generic
		bodyModel[275].setRotationPoint(-26F, -21F, -0.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon generic
		bodyModel[276].setRotationPoint(-26F, -22F, -0.5F);
	}
	ModelBlombergBnew theBlomb = new ModelBlombergBnew();
	ModelTypeBnew theB = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 812) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 117) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 118) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Beansniff_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 125) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 116) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_FNCC.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.025, 0);
			theB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac_SINGLESHOE.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.3, -0.02, 0);
			theBlomb.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}