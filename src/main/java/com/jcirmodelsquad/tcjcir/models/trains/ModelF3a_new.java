//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F3a
// Model Creator: Bidahochi
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.detailkits.Modelf3a_deets_fncc;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;
import java.util.ArrayList;

public class ModelF3a_new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelF3a_new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[532];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 215, 172, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 215, 180, textureX, textureY); // Box 1 coupler
		bodyModel[3] = new ModelRendererTurbo(this, 252, 105, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 252, 78, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 214, 83, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 214, 110, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 240, 180, textureX, textureY, "cull"); // Box 1 cull rear draft gear
		bodyModel[8] = new ModelRendererTurbo(this, 235, 193, textureX, textureY); // Box 1
		bodyModel[9] = new ModelRendererTurbo(this, 250, 193, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 369, 85, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 223, 16, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 226, 10, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 227, 30, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 227, 5, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 228, 35, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 228, 2, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 357, 86, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 375, 94, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 49, 47, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 60, 39, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 74, 42, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 20, 47, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 73, 146, textureX, textureY); // Box 117
		bodyModel[26] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 118
		bodyModel[27] = new ModelRendererTurbo(this, 84, 47, textureX, textureY); // Box 129
		bodyModel[28] = new ModelRendererTurbo(this, 113, 38, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 239, 89, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 226, 75, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 239, 116, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 226, 102, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 81, 4, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 249, 46, textureX, textureY); // Box 0 dynamic fan large
		bodyModel[35] = new ModelRendererTurbo(this, 356, 211, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 306, 211, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 239, 209, textureX, textureY); // Box 139
		bodyModel[38] = new ModelRendererTurbo(this, 266, 221, textureX, textureY); // Box 140 fuel tank filler panel
		bodyModel[39] = new ModelRendererTurbo(this, 257, 221, textureX, textureY); // Box 141 fuel tank filler panel
		bodyModel[40] = new ModelRendererTurbo(this, 72, 179, textureX, textureY); // Box 151
		bodyModel[41] = new ModelRendererTurbo(this, 177, 47, textureX, textureY, "cull"); // Box 153 cull handrails
		bodyModel[42] = new ModelRendererTurbo(this, 162, 47, textureX, textureY, "cull"); // Box 154 cull handrails
		bodyModel[43] = new ModelRendererTurbo(this, 213, 103, textureX, textureY, "cull"); // Box 350 cull mirrors
		bodyModel[44] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 299 horn blat
		bodyModel[45] = new ModelRendererTurbo(this, 71, 73, textureX, textureY); // Box 300 horn blat
		bodyModel[46] = new ModelRendererTurbo(this, 60, 70, textureX, textureY); // Box 301 horn blat
		bodyModel[47] = new ModelRendererTurbo(this, 71, 70, textureX, textureY); // Box 302 horn base
		bodyModel[48] = new ModelRendererTurbo(this, 190, 47, textureX, textureY, "cull"); // Box 178 cull handrails
		bodyModel[49] = new ModelRendererTurbo(this, 149, 47, textureX, textureY, "cull"); // Box 180 cull handrails
		bodyModel[50] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 183 CNW Gong
		bodyModel[51] = new ModelRendererTurbo(this, 313, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull
		bodyModel[52] = new ModelRendererTurbo(this, 472, 176, textureX, textureY); // Box 187 Steam/HEP gen exhaust
		bodyModel[53] = new ModelRendererTurbo(this, 491, 176, textureX, textureY); // Box 188 Steam/HEP gen exhaust
		bodyModel[54] = new ModelRendererTurbo(this, 203, 47, textureX, textureY, "cull"); // Box 199 cull handrails
		bodyModel[55] = new ModelRendererTurbo(this, 140, 47, textureX, textureY, "cull"); // Box 201 cull handrails
		bodyModel[56] = new ModelRendererTurbo(this, 364, 79, textureX, textureY); // Box 202
		bodyModel[57] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 203
		bodyModel[58] = new ModelRendererTurbo(this, 182, 6, textureX, textureY); // Box 131 cs an shit
		bodyModel[59] = new ModelRendererTurbo(this, 181, 10, textureX, textureY); // Box 131 cs ab shit
		bodyModel[60] = new ModelRendererTurbo(this, 166, 11, textureX, textureY); // Box 131 cs1
		bodyModel[61] = new ModelRendererTurbo(this, 157, 9, textureX, textureY); // Box 131 cs1
		bodyModel[62] = new ModelRendererTurbo(this, 152, 11, textureX, textureY); // Box 131 cs1
		bodyModel[63] = new ModelRendererTurbo(this, 157, 4, textureX, textureY); // Box 131 cs1
		bodyModel[64] = new ModelRendererTurbo(this, 371, 81, textureX, textureY); // Box 231
		bodyModel[65] = new ModelRendererTurbo(this, 199, 166, textureX, textureY); // Box 222 mu hoses
		bodyModel[66] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 438
		bodyModel[67] = new ModelRendererTurbo(this, 396, 160, textureX, textureY); // Box 439
		bodyModel[68] = new ModelRendererTurbo(this, 57, 160, textureX, textureY); // Box 278
		bodyModel[69] = new ModelRendererTurbo(this, 37, 165, textureX, textureY); // Box 280
		bodyModel[70] = new ModelRendererTurbo(this, 55, 126, textureX, textureY); // Box 282
		bodyModel[71] = new ModelRendererTurbo(this, 126, 21, textureX, textureY); // Box 293
		bodyModel[72] = new ModelRendererTurbo(this, 85, 160, textureX, textureY); // Box 294
		bodyModel[73] = new ModelRendererTurbo(this, 113, 165, textureX, textureY); // Box 296
		bodyModel[74] = new ModelRendererTurbo(this, 20, 50, textureX, textureY); // Box 311
		bodyModel[75] = new ModelRendererTurbo(this, 218, 75, textureX, textureY); // Box 312
		bodyModel[76] = new ModelRendererTurbo(this, 60, 46, textureX, textureY); // Box 323
		bodyModel[77] = new ModelRendererTurbo(this, 73, 47, textureX, textureY); // Box 324
		bodyModel[78] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 325
		bodyModel[79] = new ModelRendererTurbo(this, 218, 102, textureX, textureY); // Box 326
		bodyModel[80] = new ModelRendererTurbo(this, 36, 46, textureX, textureY); // Box 327
		bodyModel[81] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 328
		bodyModel[82] = new ModelRendererTurbo(this, 36, 39, textureX, textureY); // Box 330
		bodyModel[83] = new ModelRendererTurbo(this, 26, 42, textureX, textureY); // Box 331
		bodyModel[84] = new ModelRendererTurbo(this, 85, 179, textureX, textureY); // Box 333
		bodyModel[85] = new ModelRendererTurbo(this, 71, 187, textureX, textureY); // Box 334
		bodyModel[86] = new ModelRendererTurbo(this, 253, 172, textureX, textureY); // Box 441
		bodyModel[87] = new ModelRendererTurbo(this, 14, 165, textureX, textureY); // Box 167
		bodyModel[88] = new ModelRendererTurbo(this, 23, 165, textureX, textureY); // Box 166
		bodyModel[89] = new ModelRendererTurbo(this, 23, 160, textureX, textureY); // Box 165
		bodyModel[90] = new ModelRendererTurbo(this, 10, 160, textureX, textureY); // Box 164
		bodyModel[91] = new ModelRendererTurbo(this, 172, 28, textureX, textureY); // Box 865
		bodyModel[92] = new ModelRendererTurbo(this, 100, 180, textureX, textureY); // Box 1296
		bodyModel[93] = new ModelRendererTurbo(this, 238, 102, textureX, textureY); // Box 329 door swing left cab
		bodyModel[94] = new ModelRendererTurbo(this, 209, 27, textureX, textureY); // Box 326
		bodyModel[95] = new ModelRendererTurbo(this, 210, 30, textureX, textureY); // Box 327
		bodyModel[96] = new ModelRendererTurbo(this, 210, 24, textureX, textureY); // Box 328
		bodyModel[97] = new ModelRendererTurbo(this, 320, 108, textureX, textureY); // Box 329 door swing left hood
		bodyModel[98] = new ModelRendererTurbo(this, 320, 81, textureX, textureY); // Box 332 door swing right hood
		bodyModel[99] = new ModelRendererTurbo(this, 332, 105, textureX, textureY); // Box 333
		bodyModel[100] = new ModelRendererTurbo(this, 332, 78, textureX, textureY); // Box 334
		bodyModel[101] = new ModelRendererTurbo(this, 320, 74, textureX, textureY); // Box 335
		bodyModel[102] = new ModelRendererTurbo(this, 320, 101, textureX, textureY); // Box 336
		bodyModel[103] = new ModelRendererTurbo(this, 320, 93, textureX, textureY); // Box 337
		bodyModel[104] = new ModelRendererTurbo(this, 320, 120, textureX, textureY); // Box 338
		bodyModel[105] = new ModelRendererTurbo(this, 100, 1, textureX, textureY); // Box 602
		bodyModel[106] = new ModelRendererTurbo(this, 108, 1, textureX, textureY); // Box 603
		bodyModel[107] = new ModelRendererTurbo(this, 92, 1, textureX, textureY); // Box 604
		bodyModel[108] = new ModelRendererTurbo(this, 136, 4, textureX, textureY); // Box 605
		bodyModel[109] = new ModelRendererTurbo(this, 116, 3, textureX, textureY); // Box 606
		bodyModel[110] = new ModelRendererTurbo(this, 62, 7, textureX, textureY); // Box 356
		bodyModel[111] = new ModelRendererTurbo(this, 73, 3, textureX, textureY); // Box 357
		bodyModel[112] = new ModelRendererTurbo(this, 61, 5, textureX, textureY); // Box 358
		bodyModel[113] = new ModelRendererTurbo(this, 125, 4, textureX, textureY); // Box 359
		bodyModel[114] = new ModelRendererTurbo(this, 172, 10, textureX, textureY); // Box 360 cs ab shit
		bodyModel[115] = new ModelRendererTurbo(this, 176, 19, textureX, textureY); // Box 361
		bodyModel[116] = new ModelRendererTurbo(this, 135, 30, textureX, textureY); // Box 362 watercooler
		bodyModel[117] = new ModelRendererTurbo(this, 8, 174, textureX, textureY, "lamp"); // Box 186 headlight 2beam top A
		bodyModel[118] = new ModelRendererTurbo(this, 8, 179, textureX, textureY, "lamp"); // Box 187 headlight 2beam top A
		bodyModel[119] = new ModelRendererTurbo(this, 31, 143, textureX, textureY); // Box 389
		bodyModel[120] = new ModelRendererTurbo(this, 30, 147, textureX, textureY); // Box 390
		bodyModel[121] = new ModelRendererTurbo(this, 21, 147, textureX, textureY); // Box 391
		bodyModel[122] = new ModelRendererTurbo(this, 22, 143, textureX, textureY); // Box 392
		bodyModel[123] = new ModelRendererTurbo(this, 7, 184, textureX, textureY, "lamp"); // Box 169 headlight big top
		bodyModel[124] = new ModelRendererTurbo(this, 13, 139, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom A
		bodyModel[125] = new ModelRendererTurbo(this, 13, 144, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom A
		bodyModel[126] = new ModelRendererTurbo(this, 12, 149, textureX, textureY, "lamp"); // Box 169 headlight big bottom
		bodyModel[127] = new ModelRendererTurbo(this, 30, 151, textureX, textureY, "lamp"); // Box 186 headlight 2beam bottom B
		bodyModel[128] = new ModelRendererTurbo(this, 21, 151, textureX, textureY, "lamp"); // Box 187 headlight 2beam bottom B
		bodyModel[129] = new ModelRendererTurbo(this, 23, 186, textureX, textureY, "lamp"); // Box 186 headlight 2beam top B
		bodyModel[130] = new ModelRendererTurbo(this, 16, 186, textureX, textureY, "lamp"); // Box 187 headlight 2beam top B
		bodyModel[131] = new ModelRendererTurbo(this, 4, 166, textureX, textureY); // Box 403 headlight cover
		bodyModel[132] = new ModelRendererTurbo(this, 9, 166, textureX, textureY); // Box 404 headlight cover
		bodyModel[133] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 405 headlight cover
		bodyModel[134] = new ModelRendererTurbo(this, 4, 169, textureX, textureY); // Box 406 headlight cover
		bodyModel[135] = new ModelRendererTurbo(this, 136, 24, textureX, textureY); // Box 407 watercooler
		bodyModel[136] = new ModelRendererTurbo(this, 118, 9, textureX, textureY); // Box 409
		bodyModel[137] = new ModelRendererTurbo(this, 100, 9, textureX, textureY); // Box 410
		bodyModel[138] = new ModelRendererTurbo(this, 107, 6, textureX, textureY); // Box 411
		bodyModel[139] = new ModelRendererTurbo(this, 61, 32, textureX, textureY); // Box 413
		bodyModel[140] = new ModelRendererTurbo(this, 37, 32, textureX, textureY); // Box 414
		bodyModel[141] = new ModelRendererTurbo(this, 50, 35, textureX, textureY); // Box 415
		bodyModel[142] = new ModelRendererTurbo(this, 74, 36, textureX, textureY); // Box 416
		bodyModel[143] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 417
		bodyModel[144] = new ModelRendererTurbo(this, 108, 182, textureX, textureY); // Box 424
		bodyModel[145] = new ModelRendererTurbo(this, 42, 182, textureX, textureY); // Box 425
		bodyModel[146] = new ModelRendererTurbo(this, 237, 54, textureX, textureY); // Box 439
		bodyModel[147] = new ModelRendererTurbo(this, 251, 101, textureX, textureY); // Box 440
		bodyModel[148] = new ModelRendererTurbo(this, 251, 74, textureX, textureY); // Box 441
		bodyModel[149] = new ModelRendererTurbo(this, 393, 86, textureX, textureY); // Box 452 some door that magically vibes in the back
		bodyModel[150] = new ModelRendererTurbo(this, 272, 56, textureX, textureY); // Box 464 gn fuckshit cube
		bodyModel[151] = new ModelRendererTurbo(this, 237, 54, textureX, textureY); // Box 484
		bodyModel[152] = new ModelRendererTurbo(this, 417, 191, textureX, textureY); // Box 5
		bodyModel[153] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 6
		bodyModel[154] = new ModelRendererTurbo(this, 409, 229, textureX, textureY); // Box 10
		bodyModel[155] = new ModelRendererTurbo(this, 358, 242, textureX, textureY); // Box 13
		bodyModel[156] = new ModelRendererTurbo(this, 461, 229, textureX, textureY); // Box 14
		bodyModel[157] = new ModelRendererTurbo(this, 471, 243, textureX, textureY); // Box 9
		bodyModel[158] = new ModelRendererTurbo(this, 466, 238, textureX, textureY); // Box 21
		bodyModel[159] = new ModelRendererTurbo(this, 94, 35, textureX, textureY); // Box 13
		bodyModel[160] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[161] = new ModelRendererTurbo(this, 370, 217, textureX, textureY); // Box 10
		bodyModel[162] = new ModelRendererTurbo(this, 417, 184, textureX, textureY); // Box 7
		bodyModel[163] = new ModelRendererTurbo(this, 95, 38, textureX, textureY); // Box 513
		bodyModel[164] = new ModelRendererTurbo(this, 373, 246, textureX, textureY); // Box 522
		bodyModel[165] = new ModelRendererTurbo(this, 392, 218, textureX, textureY); // Box 523
		bodyModel[166] = new ModelRendererTurbo(this, 113, 127, textureX, textureY); // Box 538 nose mu plug
		bodyModel[167] = new ModelRendererTurbo(this, 32, 73, textureX, textureY); // Box 468 horn gn
		bodyModel[168] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 469 horn gn
		bodyModel[169] = new ModelRendererTurbo(this, 30, 70, textureX, textureY); // Box 470 horn gn
		bodyModel[170] = new ModelRendererTurbo(this, 32, 76, textureX, textureY); // Box 471 horn gn
		bodyModel[171] = new ModelRendererTurbo(this, 22, 125, textureX, textureY); // Box 403 headlight backpart
		bodyModel[172] = new ModelRendererTurbo(this, 31, 125, textureX, textureY); // Box 404 headlight backpart
		bodyModel[173] = new ModelRendererTurbo(this, 53, 63, textureX, textureY); // Box 404 she wheel on my antenna till i wagon
		bodyModel[174] = new ModelRendererTurbo(this, 40, 63, textureX, textureY); // Box 405 she wheel on my antenna till i wagon
		bodyModel[175] = new ModelRendererTurbo(this, 220, 192, textureX, textureY); // Box 429 front mu hose extender
		bodyModel[176] = new ModelRendererTurbo(this, 227, 192, textureX, textureY); // Box 430 front mu hose extender
		bodyModel[177] = new ModelRendererTurbo(this, 1, 156, textureX, textureY, "lamp"); // Box 431 headlight nose plate
		bodyModel[178] = new ModelRendererTurbo(this, 1, 156, textureX, textureY, "lamp"); // Box 432 headlight nose plate
		bodyModel[179] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 433 nose headlight plate
		bodyModel[180] = new ModelRendererTurbo(this, 288, 57, textureX, textureY, "cull"); // Box 186 winterization hatch cull tall
		bodyModel[181] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[182] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[183] = new ModelRendererTurbo(this, 444, 158, textureX, textureY, "cull"); // Box 522 atsf tall arrestor cull
		bodyModel[184] = new ModelRendererTurbo(this, 450, 152, textureX, textureY); // Box 523 atsf tall arrestor tip
		bodyModel[185] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 412 cs2
		bodyModel[186] = new ModelRendererTurbo(this, 39, 8, textureX, textureY); // Box 413 cs2
		bodyModel[187] = new ModelRendererTurbo(this, 31, 1, textureX, textureY); // Box 86 cs2
		bodyModel[188] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 531 cs2
		bodyModel[189] = new ModelRendererTurbo(this, 198, 208, textureX, textureY); // Box 342
		bodyModel[190] = new ModelRendererTurbo(this, 191, 208, textureX, textureY); // Box 343
		bodyModel[191] = new ModelRendererTurbo(this, 229, 208, textureX, textureY); // Box 345
		bodyModel[192] = new ModelRendererTurbo(this, 200, 211, textureX, textureY); // Box 456
		bodyModel[193] = new ModelRendererTurbo(this, 198, 215, textureX, textureY); // Box 458
		bodyModel[194] = new ModelRendererTurbo(this, 229, 215, textureX, textureY); // Box 459
		bodyModel[195] = new ModelRendererTurbo(this, 191, 215, textureX, textureY); // Box 461
		bodyModel[196] = new ModelRendererTurbo(this, 197, 211, textureX, textureY); // Box 462
		bodyModel[197] = new ModelRendererTurbo(this, 227, 211, textureX, textureY); // Box 463
		bodyModel[198] = new ModelRendererTurbo(this, 200, 218, textureX, textureY); // Box 464
		bodyModel[199] = new ModelRendererTurbo(this, 227, 218, textureX, textureY); // Box 465
		bodyModel[200] = new ModelRendererTurbo(this, 197, 218, textureX, textureY); // Box 466
		bodyModel[201] = new ModelRendererTurbo(this, 338, 209, textureX, textureY); // Box 46
		bodyModel[202] = new ModelRendererTurbo(this, 339, 220, textureX, textureY); // Box 48
		bodyModel[203] = new ModelRendererTurbo(this, 313, 220, textureX, textureY); // Box 99
		bodyModel[204] = new ModelRendererTurbo(this, 312, 209, textureX, textureY); // Box 95
		bodyModel[205] = new ModelRendererTurbo(this, 277, 213, textureX, textureY); // Box 96 air tank pipe
		bodyModel[206] = new ModelRendererTurbo(this, 282, 212, textureX, textureY); // Box 130 FUCK FUCK FUCK FUCK AAAUGGGHHHH IM PRESSURIZED STEEWWWIE IM SO FULL OF COMPRESSED AIR AND CONDENSATIONS STEWWIEEE YOU NEED TO OPEN THE SPITTER VALE AND DRAIN MEEEE AUUGHHH STEWWIEEEE
		bodyModel[207] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 131
		bodyModel[208] = new ModelRendererTurbo(this, 283, 213, textureX, textureY); // Box 132
		bodyModel[209] = new ModelRendererTurbo(this, 46, 70, textureX, textureY, "cull"); // Box 483 cull horn mount gn
		bodyModel[210] = new ModelRendererTurbo(this, 112, 131, textureX, textureY); // Box 468 nose mu plug
		bodyModel[211] = new ModelRendererTurbo(this, 190, 11, textureX, textureY); // Box 474 cs1 gaugepannel
		bodyModel[212] = new ModelRendererTurbo(this, 199, -2, textureX, textureY, "lamp"); // Box 475 cs1 gaugepannel hd
		bodyModel[213] = new ModelRendererTurbo(this, 204, 16, textureX, textureY, "lamp"); // Box 591 speedoooo glowe
		bodyModel[214] = new ModelRendererTurbo(this, 220, 150, textureX, textureY); // Box 482
		bodyModel[215] = new ModelRendererTurbo(this, 243, 152, textureX, textureY); // Box 483
		bodyModel[216] = new ModelRendererTurbo(this, 230, 170, textureX, textureY); // Box 4
		bodyModel[217] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 485
		bodyModel[218] = new ModelRendererTurbo(this, 252, 189, textureX, textureY); // Box 719
		bodyModel[219] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 129
		bodyModel[220] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 130
		bodyModel[221] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 133
		bodyModel[222] = new ModelRendererTurbo(this, 392, 160, textureX, textureY); // Box 134
		bodyModel[223] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 726
		bodyModel[224] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 727
		bodyModel[225] = new ModelRendererTurbo(this, 393, 154, textureX, textureY); // Box 728
		bodyModel[226] = new ModelRendererTurbo(this, 397, 154, textureX, textureY); // Box 729
		bodyModel[227] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 730
		bodyModel[228] = new ModelRendererTurbo(this, 392, 152, textureX, textureY); // Box 731
		bodyModel[229] = new ModelRendererTurbo(this, 359, 82, textureX, textureY); // Box 734
		bodyModel[230] = new ModelRendererTurbo(this, 377, 82, textureX, textureY); // Box 735
		bodyModel[231] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 184 stack
		bodyModel[232] = new ModelRendererTurbo(this, 403, 182, textureX, textureY); // Box 185 stack
		bodyModel[233] = new ModelRendererTurbo(this, 218, 39, textureX, textureY, "cull"); // Box 501 cull pipe cooler gn thing
		bodyModel[234] = new ModelRendererTurbo(this, 261, 228, textureX, textureY); // Box 502 fuel filler no pannel
		bodyModel[235] = new ModelRendererTurbo(this, 261, 228, textureX, textureY); // Box 503 fuel filler no pannel
		bodyModel[236] = new ModelRendererTurbo(this, 3, 112, textureX, textureY); // Box 623 NJT GONG
		bodyModel[237] = new ModelRendererTurbo(this, 2, 117, textureX, textureY); // Box 624njt gong holder
		bodyModel[238] = new ModelRendererTurbo(this, 73, 231, textureX, textureY); // Box 419 pilot passenger
		bodyModel[239] = new ModelRendererTurbo(this, 421, 77, textureX, textureY); // Box 453 rear end bit
		bodyModel[240] = new ModelRendererTurbo(this, 412, 77, textureX, textureY); // Box 454 rear end bit
		bodyModel[241] = new ModelRendererTurbo(this, 423, 86, textureX, textureY); // Box 128 rear diaphram
		bodyModel[242] = new ModelRendererTurbo(this, 436, 86, textureX, textureY); // Box 153 rear diaphram
		bodyModel[243] = new ModelRendererTurbo(this, 424, 90, textureX, textureY); // Box 128 rear diaphram
		bodyModel[244] = new ModelRendererTurbo(this, 405, 79, textureX, textureY); // Box 190 rear mu plug
		bodyModel[245] = new ModelRendererTurbo(this, 149, 60, textureX, textureY, "cull"); // Box 631 cull
		bodyModel[246] = new ModelRendererTurbo(this, 136, 55, textureX, textureY, "cull"); // Box 636 cull
		bodyModel[247] = new ModelRendererTurbo(this, 162, 65, textureX, textureY, "cull"); // Box 637 cull
		bodyModel[248] = new ModelRendererTurbo(this, 203, 55, textureX, textureY, "cull"); // Box 638 cull
		bodyModel[249] = new ModelRendererTurbo(this, 190, 60, textureX, textureY, "cull"); // Box 639 cull
		bodyModel[250] = new ModelRendererTurbo(this, 177, 65, textureX, textureY, "cull"); // Box 640 cull
		bodyModel[251] = new ModelRendererTurbo(this, 81, 134, textureX, textureY); // Box 760
		bodyModel[252] = new ModelRendererTurbo(this, 81, 126, textureX, textureY); // Box 768
		bodyModel[253] = new ModelRendererTurbo(this, 17, 174, textureX, textureY); // Box 103
		bodyModel[254] = new ModelRendererTurbo(this, 16, 170, textureX, textureY); // Box 103
		bodyModel[255] = new ModelRendererTurbo(this, 23, 170, textureX, textureY); // Box 103
		bodyModel[256] = new ModelRendererTurbo(this, 24, 174, textureX, textureY); // Box 103
		bodyModel[257] = new ModelRendererTurbo(this, 17, 178, textureX, textureY); // Box 103
		bodyModel[258] = new ModelRendererTurbo(this, 24, 178, textureX, textureY); // Box 103
		bodyModel[259] = new ModelRendererTurbo(this, 16, 182, textureX, textureY); // Box 103
		bodyModel[260] = new ModelRendererTurbo(this, 23, 182, textureX, textureY); // Box 103
		bodyModel[261] = new ModelRendererTurbo(this, 73, 140, textureX, textureY); // Box 781
		bodyModel[262] = new ModelRendererTurbo(this, 103, 23, textureX, textureY); // Box 782 dont forgor meee
		bodyModel[263] = new ModelRendererTurbo(this, 122, 119, textureX, textureY); // Box 111
		bodyModel[264] = new ModelRendererTurbo(this, 122, 116, textureX, textureY); // Box 144
		bodyModel[265] = new ModelRendererTurbo(this, 117, 119, textureX, textureY); // Box 111
		bodyModel[266] = new ModelRendererTurbo(this, 117, 116, textureX, textureY); // Box 144
		bodyModel[267] = new ModelRendererTurbo(this, 117, 113, textureX, textureY, "lamp"); // Box 123 Markerlight Early
		bodyModel[268] = new ModelRendererTurbo(this, 122, 113, textureX, textureY, "lamp"); // Box 144 numberboard early
		bodyModel[269] = new ModelRendererTurbo(this, 122, 113, textureX, textureY, "lamp"); // Box 111 numberboard early
		bodyModel[270] = new ModelRendererTurbo(this, 117, 113, textureX, textureY, "lamp"); // Box 453 Markerlight Early
		bodyModel[271] = new ModelRendererTurbo(this, 99, 122, textureX, textureY); // Box 468
		bodyModel[272] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "lamp"); // Box 469 numberboard
		bodyModel[273] = new ModelRendererTurbo(this, 112, 115, textureX, textureY, "lamp"); // Box 470 markerlight
		bodyModel[274] = new ModelRendererTurbo(this, 360, 88, textureX, textureY); // Box 815
		bodyModel[275] = new ModelRendererTurbo(this, 375, 88, textureX, textureY); // Box 816
		bodyModel[276] = new ModelRendererTurbo(this, 361, 94, textureX, textureY); // Box 817
		bodyModel[277] = new ModelRendererTurbo(this, 140, 67, textureX, textureY, "cull"); // Box 821 cull forward nose stairs
		bodyModel[278] = new ModelRendererTurbo(this, 140, 63, textureX, textureY, "cull"); // Box 822 cull forward nose stairs
		bodyModel[279] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 823
		bodyModel[280] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "lamp"); // Box 824 numberboard
		bodyModel[281] = new ModelRendererTurbo(this, 112, 115, textureX, textureY, "lamp"); // Box 825 markerlight
		bodyModel[282] = new ModelRendererTurbo(this, 55, 134, textureX, textureY); // Box 827
		bodyModel[283] = new ModelRendererTurbo(this, 238, 75, textureX, textureY); // Box 828 door swing right cab
		bodyModel[284] = new ModelRendererTurbo(this, 10, 125, textureX, textureY, "cull"); // Box 149 cull nose grabs
		bodyModel[285] = new ModelRendererTurbo(this, 3, 129, textureX, textureY, "cull"); // Box 818 cull lift lugs
		bodyModel[286] = new ModelRendererTurbo(this, 3, 125, textureX, textureY, "cull"); // Box 819 cull lift lugs
		bodyModel[287] = new ModelRendererTurbo(this, 44, 165, textureX, textureY); // Box 467
		bodyModel[288] = new ModelRendererTurbo(this, 40, 146, textureX, textureY); // Box 470
		bodyModel[289] = new ModelRendererTurbo(this, 100, 165, textureX, textureY); // Box 471
		bodyModel[290] = new ModelRendererTurbo(this, 100, 146, textureX, textureY); // Box 474
		bodyModel[291] = new ModelRendererTurbo(this, 45, 157, textureX, textureY); // Box 478
		bodyModel[292] = new ModelRendererTurbo(this, 99, 157, textureX, textureY); // Box 479
		bodyModel[293] = new ModelRendererTurbo(this, 101, 140, textureX, textureY); // Box 487
		bodyModel[294] = new ModelRendererTurbo(this, 41, 140, textureX, textureY); // Box 488
		bodyModel[295] = new ModelRendererTurbo(this, 101, 131, textureX, textureY); // Box 490
		bodyModel[296] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 491
		bodyModel[297] = new ModelRendererTurbo(this, 213, 76, textureX, textureY, "cull"); // Box 493 cull mirrors
		bodyModel[298] = new ModelRendererTurbo(this, 203, 67, textureX, textureY, "cull"); // Box 494 cull
		bodyModel[299] = new ModelRendererTurbo(this, 203, 63, textureX, textureY, "cull"); // Box 495 cull
		bodyModel[300] = new ModelRendererTurbo(this, 341, 39, textureX, textureY, "cull"); // Box 444 CULL f3a mesh grill
		bodyModel[301] = new ModelRendererTurbo(this, 342, 51, textureX, textureY); // Box 445 f3a mesh grill bottom
		bodyModel[302] = new ModelRendererTurbo(this, 317, 46, textureX, textureY); // Box 683 fan
		bodyModel[303] = new ModelRendererTurbo(this, 269, 49, textureX, textureY); // Box 450 fan
		bodyModel[304] = new ModelRendererTurbo(this, 285, 46, textureX, textureY); // Box 451 fan
		bodyModel[305] = new ModelRendererTurbo(this, 301, 49, textureX, textureY); // Box 452 fan
		bodyModel[306] = new ModelRendererTurbo(this, 341, 1, textureX, textureY, "cull"); // Box 455 CULL f3a mesh grill
		bodyModel[307] = new ModelRendererTurbo(this, 342, 13, textureX, textureY); // Box 456 f3a mesh grill bottom
		bodyModel[308] = new ModelRendererTurbo(this, 253, 39, textureX, textureY); // Box 457 dynamic fan small
		bodyModel[309] = new ModelRendererTurbo(this, 285, 39, textureX, textureY); // Box 458 f3a tall fan
		bodyModel[310] = new ModelRendererTurbo(this, 301, 42, textureX, textureY); // Box 459 f3a tall fan
		bodyModel[311] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Box 460 f3a tall fan
		bodyModel[312] = new ModelRendererTurbo(this, 269, 42, textureX, textureY); // Box 461 f3a tall fan
		bodyModel[313] = new ModelRendererTurbo(this, 389, 225, textureX, textureY); // Box 298
		bodyModel[314] = new ModelRendererTurbo(this, 383, 233, textureX, textureY); // Box 299
		bodyModel[315] = new ModelRendererTurbo(this, 389, 248, textureX, textureY); // Box 300
		bodyModel[316] = new ModelRendererTurbo(this, 411, 241, textureX, textureY); // Box 465
		bodyModel[317] = new ModelRendererTurbo(this, 411, 214, textureX, textureY); // Box 466
		bodyModel[318] = new ModelRendererTurbo(this, 409, 198, textureX, textureY); // Box 467
		bodyModel[319] = new ModelRendererTurbo(this, 389, 200, textureX, textureY); // Box 468
		bodyModel[320] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 469
		bodyModel[321] = new ModelRendererTurbo(this, 372, 225, textureX, textureY); // Box 470
		bodyModel[322] = new ModelRendererTurbo(this, 411, 228, textureX, textureY); // Box 471
		bodyModel[323] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 472
		bodyModel[324] = new ModelRendererTurbo(this, 392, 194, textureX, textureY); // Box 473
		bodyModel[325] = new ModelRendererTurbo(this, 372, 231, textureX, textureY); // Box 474
		bodyModel[326] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[327] = new ModelRendererTurbo(this, 374, 240, textureX, textureY); // Box 0
		bodyModel[328] = new ModelRendererTurbo(this, 483, 229, textureX, textureY, "cull"); // Box 477 cull equipment rack
		bodyModel[329] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 478
		bodyModel[330] = new ModelRendererTurbo(this, 491, 247, textureX, textureY); // Box 479
		bodyModel[331] = new ModelRendererTurbo(this, 484, 219, textureX, textureY); // Box 480 lube filter
		bodyModel[332] = new ModelRendererTurbo(this, 468, 211, textureX, textureY); // Box 481 engine water tank
		bodyModel[333] = new ModelRendererTurbo(this, 475, 232, textureX, textureY); // Box 482
		bodyModel[334] = new ModelRendererTurbo(this, 467, 189, textureX, textureY); // Box 0 Steam/HEP gen
		bodyModel[335] = new ModelRendererTurbo(this, 486, 189, textureX, textureY); // Box 485 Steam/HEP gen
		bodyModel[336] = new ModelRendererTurbo(this, 337, 229, textureX, textureY); // Box 429 dynamics internal
		bodyModel[337] = new ModelRendererTurbo(this, 71, 35, textureX, textureY); // Box 430
		bodyModel[338] = new ModelRendererTurbo(this, 57, 179, textureX, textureY); // Box 431
		bodyModel[339] = new ModelRendererTurbo(this, 44, 180, textureX, textureY); // Box 432
		bodyModel[340] = new ModelRendererTurbo(this, 84, 142, textureX, textureY); // Box 434
		bodyModel[341] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 435
		bodyModel[342] = new ModelRendererTurbo(this, 239, 217, textureX, textureY); // Box 423
		bodyModel[343] = new ModelRendererTurbo(this, 239, 213, textureX, textureY); // Box 424
		bodyModel[344] = new ModelRendererTurbo(this, 31, 139, textureX, textureY); // Box 427
		bodyModel[345] = new ModelRendererTurbo(this, 30, 135, textureX, textureY); // Box 428
		bodyModel[346] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 429
		bodyModel[347] = new ModelRendererTurbo(this, 22, 139, textureX, textureY); // Box 430
		bodyModel[348] = new ModelRendererTurbo(this, 22, 130, textureX, textureY); // Box 431 headlight backpart
		bodyModel[349] = new ModelRendererTurbo(this, 31, 130, textureX, textureY); // Box 432 headlight backpart
		bodyModel[350] = new ModelRendererTurbo(this, 72, 162, textureX, textureY); // Box 433
		bodyModel[351] = new ModelRendererTurbo(this, 341, 65, textureX, textureY, "cull"); // Box 416 late grills CULL
		bodyModel[352] = new ModelRendererTurbo(this, 341, 26, textureX, textureY, "cull"); // Box 417 late grills CULL
		bodyModel[353] = new ModelRendererTurbo(this, 53, 224, textureX, textureY); // Box 426 pilot snow
		bodyModel[354] = new ModelRendererTurbo(this, 40, 221, textureX, textureY); // Box 428 pilot snow
		bodyModel[355] = new ModelRendererTurbo(this, 57, 215, textureX, textureY); // Box 430 pilot snow
		bodyModel[356] = new ModelRendererTurbo(this, 53, 220, textureX, textureY); // Box 431 pilot snow
		bodyModel[357] = new ModelRendererTurbo(this, 50, 216, textureX, textureY, "cull"); // Box 432 pilot snow CULL
		bodyModel[358] = new ModelRendererTurbo(this, 79, 224, textureX, textureY); // Box 433 pilot snow
		bodyModel[359] = new ModelRendererTurbo(this, 104, 221, textureX, textureY); // Box 434 pilot snow
		bodyModel[360] = new ModelRendererTurbo(this, 79, 215, textureX, textureY); // Box 435 pilot snow
		bodyModel[361] = new ModelRendererTurbo(this, 79, 220, textureX, textureY); // Box 436 pilot snow
		bodyModel[362] = new ModelRendererTurbo(this, 100, 216, textureX, textureY, "cull"); // Box 437 pilot snow CULL
		bodyModel[363] = new ModelRendererTurbo(this, 58, 229, textureX, textureY); // Box 438 pilot passenger
		bodyModel[364] = new ModelRendererTurbo(this, 44, 232, textureX, textureY); // Box 448 pilot passenger
		bodyModel[365] = new ModelRendererTurbo(this, 47, 231, textureX, textureY, "cull"); // Box 451 pilot passenger CULL
		bodyModel[366] = new ModelRendererTurbo(this, 54, 231, textureX, textureY); // Box 452 pilot passenger
		bodyModel[367] = new ModelRendererTurbo(this, 84, 229, textureX, textureY); // Box 453 pilot passenger
		bodyModel[368] = new ModelRendererTurbo(this, 106, 232, textureX, textureY); // Box 454 pilot passenger
		bodyModel[369] = new ModelRendererTurbo(this, 99, 231, textureX, textureY, "cull"); // Box 455 pilot passenger CULL
		bodyModel[370] = new ModelRendererTurbo(this, 96, 231, textureX, textureY); // Box 456 pilot passenger
		bodyModel[371] = new ModelRendererTurbo(this, 107, 239, textureX, textureY, "cull"); // Box 458 pilot passenger CULL
		bodyModel[372] = new ModelRendererTurbo(this, 41, 239, textureX, textureY, "cull"); // Box 459 pilot passenger CULL
		bodyModel[373] = new ModelRendererTurbo(this, 72, 243, textureX, textureY); // Box 460 pilot passenger coupler cover
		bodyModel[374] = new ModelRendererTurbo(this, 73, 197, textureX, textureY); // Box 464 pilot norma
		bodyModel[375] = new ModelRendererTurbo(this, 62, 191, textureX, textureY); // Box 469 pilot norma
		bodyModel[376] = new ModelRendererTurbo(this, 44, 196, textureX, textureY); // Box 472 pilot norma
		bodyModel[377] = new ModelRendererTurbo(this, 63, 200, textureX, textureY); // Box 473 pilot norma
		bodyModel[378] = new ModelRendererTurbo(this, 56, 204, textureX, textureY); // Box 474 pilot norma
		bodyModel[379] = new ModelRendererTurbo(this, 88, 202, textureX, textureY, "cull"); // Box 480 pilot normal CULL
		bodyModel[380] = new ModelRendererTurbo(this, 49, 192, textureX, textureY); // Box 481 pilot norma
		bodyModel[381] = new ModelRendererTurbo(this, 80, 191, textureX, textureY); // Box 482 pilot norma
		bodyModel[382] = new ModelRendererTurbo(this, 108, 196, textureX, textureY); // Box 483 pilot norma
		bodyModel[383] = new ModelRendererTurbo(this, 79, 200, textureX, textureY); // Box 484 pilot norma
		bodyModel[384] = new ModelRendererTurbo(this, 94, 204, textureX, textureY); // Box 485 pilot norma
		bodyModel[385] = new ModelRendererTurbo(this, 101, 203, textureX, textureY); // Box 486 pilot norma
		bodyModel[386] = new ModelRendererTurbo(this, 95, 192, textureX, textureY); // Box 487 pilot norma
		bodyModel[387] = new ModelRendererTurbo(this, 462, 94, textureX, textureY); // Box 410
		bodyModel[388] = new ModelRendererTurbo(this, 462, 100, textureX, textureY); // Box 411
		bodyModel[389] = new ModelRendererTurbo(this, 463, 83, textureX, textureY); // Box 412
		bodyModel[390] = new ModelRendererTurbo(this, 463, 88, textureX, textureY); // Box 414
		bodyModel[391] = new ModelRendererTurbo(this, 463, 106, textureX, textureY); // Box 415
		bodyModel[392] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 416 interior engine bit
		bodyModel[393] = new ModelRendererTurbo(this, 461, 112, textureX, textureY); // Box 417 interior engine bit
		bodyModel[394] = new ModelRendererTurbo(this, 227, 98, textureX, textureY); // Box 418 sandcap fill
		bodyModel[395] = new ModelRendererTurbo(this, 331, 101, textureX, textureY); // Box 419 sandcap fill
		bodyModel[396] = new ModelRendererTurbo(this, 405, 84, textureX, textureY, "lamp"); // Box 420 headlight rear very high
		bodyModel[397] = new ModelRendererTurbo(this, 261, 234, textureX, textureY); // Box 420 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[398] = new ModelRendererTurbo(this, 261, 234, textureX, textureY); // Box 421 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[399] = new ModelRendererTurbo(this, 58, 151, textureX, textureY); // Box 425
		bodyModel[400] = new ModelRendererTurbo(this, 62, 202, textureX, textureY, "cull"); // Box 427 pilot normal CULL
		bodyModel[401] = new ModelRendererTurbo(this, 47, 203, textureX, textureY); // Box 428 pilot normal
		bodyModel[402] = new ModelRendererTurbo(this, 84, 151, textureX, textureY); // Box 429
		bodyModel[403] = new ModelRendererTurbo(this, 48, 162, textureX, textureY); // Box 430
		bodyModel[404] = new ModelRendererTurbo(this, 94, 162, textureX, textureY); // Box 431
		bodyModel[405] = new ModelRendererTurbo(this, 21, 188, textureX, textureY, "lamp"); // Box 440 HEADLIGHT FULL TOP2
		bodyModel[406] = new ModelRendererTurbo(this, 28, 188, textureX, textureY, "lamp"); // Box 441 HEADLIGHT FULL TOP2
		bodyModel[407] = new ModelRendererTurbo(this, 28, 192, textureX, textureY, "lamp"); // Box 442 HEADLIGHT FULL TOP2
		bodyModel[408] = new ModelRendererTurbo(this, 21, 192, textureX, textureY, "lamp"); // Box 443 HEADLIGHT FULL TOP2
		bodyModel[409] = new ModelRendererTurbo(this, 7, 192, textureX, textureY, "lamp"); // Box 444 HEADLIGHT FULL BOTTOM
		bodyModel[410] = new ModelRendererTurbo(this, 7, 188, textureX, textureY, "lamp"); // Box 445 HEADLIGHT FULL BOTTOM
		bodyModel[411] = new ModelRendererTurbo(this, 14, 188, textureX, textureY, "lamp"); // Box 446 HEADLIGHT FULL BOTTOM
		bodyModel[412] = new ModelRendererTurbo(this, 14, 192, textureX, textureY, "lamp"); // Box 447 HEADLIGHT FULL BOTTOM
		bodyModel[413] = new ModelRendererTurbo(this, 213, 99, textureX, textureY); // Box 448 sunshield
		bodyModel[414] = new ModelRendererTurbo(this, 213, 72, textureX, textureY); // Box 449 sunshield
		bodyModel[415] = new ModelRendererTurbo(this, 208, 231, textureX, textureY); // Box 450 fuel tank embiggened
		bodyModel[416] = new ModelRendererTurbo(this, 212, 243, textureX, textureY); // Box 451 fuel tank embiggened
		bodyModel[417] = new ModelRendererTurbo(this, 210, 221, textureX, textureY); // Box 452 fuel tank embiggened
		bodyModel[418] = new ModelRendererTurbo(this, 268, 221, textureX, textureY); // Box 453 fuel tank standard
		bodyModel[419] = new ModelRendererTurbo(this, 266, 231, textureX, textureY); // Box 454 fuel tank standard
		bodyModel[420] = new ModelRendererTurbo(this, 270, 243, textureX, textureY); // Box 455 fuel tank standard
		bodyModel[421] = new ModelRendererTurbo(this, 319, 250, textureX, textureY); // Box 456 fuel tank wp extensions
		bodyModel[422] = new ModelRendererTurbo(this, 317, 244, textureX, textureY); // Box 457 fuel tank wp extensions
		bodyModel[423] = new ModelRendererTurbo(this, 57, 64, textureX, textureY); // Box 458 tall firecracker antenna
		bodyModel[424] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 439 bug deflector cnj, cei, dlw
		bodyModel[425] = new ModelRendererTurbo(this, 269, 58, textureX, textureY); // Box 440 spark arrestor cap
		bodyModel[426] = new ModelRendererTurbo(this, 269, 58, textureX, textureY); // Box 441 spark arrestor cap
		bodyModel[427] = new ModelRendererTurbo(this, 78, 72, textureX, textureY); // Box 364 prime base
		bodyModel[428] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[429] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[430] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[431] = new ModelRendererTurbo(this, 78, 68, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[432] = new ModelRendererTurbo(this, 88, 73, textureX, textureY); // Box 409 commander base
		bodyModel[433] = new ModelRendererTurbo(this, 88, 69, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[434] = new ModelRendererTurbo(this, 60, 65, textureX, textureY); // Box 449 firecracker antenna
		bodyModel[435] = new ModelRendererTurbo(this, 63, 62, textureX, textureY); // box horn sps
		bodyModel[436] = new ModelRendererTurbo(this, 63, 59, textureX, textureY); // box horn sps
		bodyModel[437] = new ModelRendererTurbo(this, 63, 56, textureX, textureY); // box horn sps
		bodyModel[438] = new ModelRendererTurbo(this, 72, 59, textureX, textureY); // box horn sps
		bodyModel[439] = new ModelRendererTurbo(this, 430, 77, textureX, textureY); // Box 454 rear end no diagphram
		bodyModel[440] = new ModelRendererTurbo(this, 412, 89, textureX, textureY, "lamp"); // Box 455 headlight rear erected outwards
		bodyModel[441] = new ModelRendererTurbo(this, 456, 77, textureX, textureY); // Box 456 rear end no diagphram
		bodyModel[442] = new ModelRendererTurbo(this, 449, 77, textureX, textureY); // Box 457 rear end no diagphram
		bodyModel[443] = new ModelRendererTurbo(this, 463, 77, textureX, textureY); // Box 458 rear end no diagphram
		bodyModel[444] = new ModelRendererTurbo(this, 463, 77, textureX, textureY); // Box 459 rear end no diagphram
		bodyModel[445] = new ModelRendererTurbo(this, 436, 82, textureX, textureY); // Box 460 rear door step
		bodyModel[446] = new ModelRendererTurbo(this, 380, 93, textureX, textureY); // Box 461 rear door top lip thing
		bodyModel[447] = new ModelRendererTurbo(this, 405, 89, textureX, textureY, "lamp"); // Box 462 headlight rear boner lower
		bodyModel[448] = new ModelRendererTurbo(this, 383, 78, textureX, textureY); // Box 463 lifting nuts
		bodyModel[449] = new ModelRendererTurbo(this, 383, 78, textureX, textureY); // Box 464 lifting nuts
		bodyModel[450] = new ModelRendererTurbo(this, 405, 94, textureX, textureY, "lamp"); // Box 465 headlight rear boner right
		bodyModel[451] = new ModelRendererTurbo(this, 448, 96, textureX, textureY); // Box 466 rear diaphram
		bodyModel[452] = new ModelRendererTurbo(this, 455, 96, textureX, textureY); // Box 467 rear diaphram
		bodyModel[453] = new ModelRendererTurbo(this, 423, 93, textureX, textureY); // Box 468 rear diaphram
		bodyModel[454] = new ModelRendererTurbo(this, 421, 83, textureX, textureY); // Box 469 rear diaphram
		bodyModel[455] = new ModelRendererTurbo(this, 94, 67, textureX, textureY); // Box 271 horn rf&p, bnb 3 chime
		bodyModel[456] = new ModelRendererTurbo(this, 94, 73, textureX, textureY); // Box 273 horn rf&p
		bodyModel[457] = new ModelRendererTurbo(this, 96, 79, textureX, textureY); // Box 533 horn rf&p
		bodyModel[458] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 534 horn rf&p
		bodyModel[459] = new ModelRendererTurbo(this, 94, 70, textureX, textureY); // Box 535 horn rf&p, bnb 3 chime
		bodyModel[460] = new ModelRendererTurbo(this, 307, 57, textureX, textureY, "cull"); // Box 478 cull trapezoid spark arrestor
		bodyModel[461] = new ModelRendererTurbo(this, 307, 57, textureX, textureY, "cull"); // Box 479 cull trapezoid spark arrestor
		bodyModel[462] = new ModelRendererTurbo(this, 88, 80, textureX, textureY); // Box 409 commander base
		bodyModel[463] = new ModelRendererTurbo(this, 88, 76, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[464] = new ModelRendererTurbo(this, 86, 83, textureX, textureY, "cull"); // Box 88 cull mkt beacon platform
		bodyModel[465] = new ModelRendererTurbo(this, 1, 149, textureX, textureY); // Box 483 f7 hitlerstache numberboard
		bodyModel[466] = new ModelRendererTurbo(this, 120, 126, textureX, textureY); // Box 190 mu plug wp
		bodyModel[467] = new ModelRendererTurbo(this, 49, 61, textureX, textureY); // Box 287 sinclair antenna PC
		bodyModel[468] = new ModelRendererTurbo(this, 103, 67, textureX, textureY); // Box 486 horn WM
		bodyModel[469] = new ModelRendererTurbo(this, 103, 73, textureX, textureY); // Box 487 horn WM
		bodyModel[470] = new ModelRendererTurbo(this, 103, 79, textureX, textureY); // Box 488 horn WM
		bodyModel[471] = new ModelRendererTurbo(this, 103, 76, textureX, textureY); // Box 489 horn WM
		bodyModel[472] = new ModelRendererTurbo(this, 103, 70, textureX, textureY); // Box 490 horn WM
		bodyModel[473] = new ModelRendererTurbo(this, 121, 131, textureX, textureY); // Box 491 low MU plug
		bodyModel[474] = new ModelRendererTurbo(this, 318, 66, textureX, textureY); // Box 492 "round" spark arrestor
		bodyModel[475] = new ModelRendererTurbo(this, 318, 66, textureX, textureY); // Box 493 "round" spark arrestor
		bodyModel[476] = new ModelRendererTurbo(this, 117, 137, textureX, textureY, "cull"); // Box 494 cull L&N super ladder
		bodyModel[477] = new ModelRendererTurbo(this, 46, 57, textureX, textureY); // Box 495 horn gn
		bodyModel[478] = new ModelRendererTurbo(this, 37, 60, textureX, textureY); // Box 496 horn gn
		bodyModel[479] = new ModelRendererTurbo(this, 37, 57, textureX, textureY); // Box 497 horn gn
		bodyModel[480] = new ModelRendererTurbo(this, 51, 57, textureX, textureY); // Box 498 horn gn
		bodyModel[481] = new ModelRendererTurbo(this, 112, 152, textureX, textureY); // Box 499 CNW MU plug
		bodyModel[482] = new ModelRendererTurbo(this, 121, 152, textureX, textureY); // Box 500 CNW MU plug
		bodyModel[483] = new ModelRendererTurbo(this, 118, 74, textureX, textureY, "cull"); // Import Box398 CULL trainphone
		bodyModel[484] = new ModelRendererTurbo(this, 85, 65, textureX, textureY); // Box 502, bnb 3 chime
		bodyModel[485] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose2
		bodyModel[486] = new ModelRendererTurbo(this, 1, 142, textureX, textureY); // Box 574 nose light2 mount
		bodyModel[487] = new ModelRendererTurbo(this, 8, 147, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose2
		bodyModel[488] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 506 tube exhaust
		bodyModel[489] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Box 507 tube exhaust
		bodyModel[490] = new ModelRendererTurbo(this, 63, 65, textureX, textureY); // Box 508 firecraker bn 626
		bodyModel[491] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 509 f3 hitlerstache numberboard
		bodyModel[492] = new ModelRendererTurbo(this, 85, 61, textureX, textureY); // Box 405 air whistle clenchfield
		bodyModel[493] = new ModelRendererTurbo(this, 226, 52, textureX, textureY, "cull"); // Box 511 CULL maine central mystery cube
		bodyModel[494] = new ModelRendererTurbo(this, 127, 126, textureX, textureY); // Box 514 MU plug BAR
		bodyModel[495] = new ModelRendererTurbo(this, 118, 66, textureX, textureY); // Box 378 bell BAR
		bodyModel[496] = new ModelRendererTurbo(this, 118, 66, textureX, textureY); // Box 380 bell BAR
		bodyModel[497] = new ModelRendererTurbo(this, 113, 66, textureX, textureY, "cull"); // Box 517 cull bell BAR
		bodyModel[498] = new ModelRendererTurbo(this, 89, 57, textureX, textureY, "commander"); // Box 498 BAR beacon
		bodyModel[499] = new ModelRendererTurbo(this, 84, 58, textureX, textureY, "cull"); // Box 499 cull BAR beacon holder

		bodyModel[0].addBox(0F, 0F, 0F, 59, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27.5F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(-35.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1 coupler
		bodyModel[2].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-11.5F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 17, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-11.5F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-25.5F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-25.5F, -10F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 1 cull rear draft gear
		bodyModel[7].setRotationPoint(31.5F, 2F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[8].setRotationPoint(31.5F, 2F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[9].setRotationPoint(31.5F, 2F, 4F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 0
		bodyModel[10].setRotationPoint(31.5F, -16F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-19.5F, -19F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 52, 1, 6, 0F); // Box 0
		bodyModel[12].setRotationPoint(-19.5F, -19F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-19.5F, -19F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-19.5F, -18.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-19.5F, -18.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-19.5F, -16F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-19.5F, -16F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[18].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(31.5F, -18F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0.5F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-24F, -18F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-21.5F, -19F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -1.75F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 1F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-21.5F, -19F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -2.5F, 0F, 1F, -1.5F, 0F, 1F, 0.5F, 0F, -0.5F, -0.75F, 0F, -1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, -0.5F, 0F, -0.5F, -0.25F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-21.5F, -18F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-20.5F, -16F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[25].setRotationPoint(-30.25F, -14.5F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 118
		bodyModel[26].setRotationPoint(-27.25F, -14.5F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[27].setRotationPoint(-20.5F, -16F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-11.5F, -18F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[29].setRotationPoint(-15.5F, -4F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(-19.5F, -15F, 10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-15.5F, -4F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-19.5F, -15F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 0
		bodyModel[33].setRotationPoint(-23F, -11.5F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0 dynamic fan large
		bodyModel[34].setRotationPoint(-9.5F, -20F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[35].setRotationPoint(-5F, 3.5F, -10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[36].setRotationPoint(-5F, 3.5F, 9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[37].setRotationPoint(-4.5F, 2F, -8.5F);
		bodyModel[37].rotateAngleY = 1.57079633F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140 fuel tank filler panel
		bodyModel[38].setRotationPoint(4F, 1.5F, -10.45F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141 fuel tank filler panel
		bodyModel[39].setRotationPoint(4F, 1.5F, 9.45F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 151
		bodyModel[40].setRotationPoint(-34F, 1.03F, -2.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 153 cull handrails
		bodyModel[41].setRotationPoint(-16F, -14.5F, -11.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 16, 1, 0F); // Box 154 cull handrails
		bodyModel[42].setRotationPoint(-16F, -14.5F, 10.75F);

		bodyModel[43].addShapeBox(0F, -4F, -1F, 1, 4, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 350 cull mirrors
		bodyModel[43].setRotationPoint(-19.6F, -11F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299 horn blat
		bodyModel[44].setRotationPoint(-17F, -20.25F, -4.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300 horn blat
		bodyModel[45].setRotationPoint(-17F, -19.25F, -4.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301 horn blat
		bodyModel[46].setRotationPoint(-17F, -20.25F, 3.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302 horn base
		bodyModel[47].setRotationPoint(-14F, -19.25F, 3.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 178 cull handrails
		bodyModel[48].setRotationPoint(20F, -9.5F, -11.75F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 180 cull handrails
		bodyModel[49].setRotationPoint(20F, -9.5F, 10.75F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 183 CNW Gong
		bodyModel[50].setRotationPoint(-32.25F, -13.5F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull
		bodyModel[51].setRotationPoint(18.9F, -21F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 187 Steam/HEP gen exhaust
		bodyModel[52].setRotationPoint(27.5F, -20F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 188 Steam/HEP gen exhaust
		bodyModel[53].setRotationPoint(29F, -20F, 1F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 199 cull handrails
		bodyModel[54].setRotationPoint(29F, -4.5F, -11.75F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 201 cull handrails
		bodyModel[55].setRotationPoint(29F, -4.5F, 10.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 202
		bodyModel[56].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[57].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 131 cs an shit
		bodyModel[58].setRotationPoint(-21F, -12.5F, 6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 131 cs ab shit
		bodyModel[59].setRotationPoint(-21.5F, -11.5F, 7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 131 cs1
		bodyModel[60].setRotationPoint(-19F, -10.5F, 1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 cs1
		bodyModel[61].setRotationPoint(-20F, -10.5F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131 cs1
		bodyModel[62].setRotationPoint(-21F, -10.5F, 1F);

		bodyModel[63].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,-0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 131 cs1
		bodyModel[63].setRotationPoint(-19.5F, -12.5F, 1.5F);
		bodyModel[63].rotateAngleY = -0.78539816F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[64].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 222 mu hoses
		bodyModel[65].setRotationPoint(32.51F, 2F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[66].setRotationPoint(18F, 2.5F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[67].setRotationPoint(-18.75F, 2.5F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 278
		bodyModel[68].setRotationPoint(-30.5F, -10F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[69].setRotationPoint(-27.5F, -10F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -4F, 1.5F, 0F); // Box 282
		bodyModel[70].setRotationPoint(-27.25F, -14.5F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 12, 4, 20, 0F); // Box 293
		bodyModel[71].setRotationPoint(-22.5F, -4F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 294
		bodyModel[72].setRotationPoint(-30.5F, -10F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[73].setRotationPoint(-27.5F, -10F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, 1F, 0F, -1.25F, 1F, 0F); // Box 311
		bodyModel[74].setRotationPoint(-23F, -15F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 312
		bodyModel[75].setRotationPoint(-22F, -15F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-3F, 0.25F, 0F, 3.25F, 0.5F, 0F, 2.5F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F); // Box 323
		bodyModel[76].setRotationPoint(-24F, -17F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3.5F, -1F, 0F, 3.5F, -1F, 0F, 3.25F, 1F, -1F, -3F, 0.75F, -1F, -1F, 2F, 0F, 1F, 2F, 0F, -0.25F, 0.5F, -1F, 0F, 0F, -1F); // Box 324
		bodyModel[77].setRotationPoint(-24F, -16.5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -1.25F, 1F, 0F, 0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, 1F, 0F); // Box 325
		bodyModel[78].setRotationPoint(-23F, -15F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 326
		bodyModel[79].setRotationPoint(-22F, -15F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-2.5F, 1F, 0F, 2.5F, 1F, 0F, 3.25F, 0.5F, 0F, -3F, 0.25F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 1F, 0F, 0F, 0.5F, 0F); // Box 327
		bodyModel[80].setRotationPoint(-24F, -17F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-3F, 0.75F, 0F, 3.25F, 1F, 0F, 3.5F, -1F, -1F, -3.5F, -1F, -1F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 1F, 2F, -1F, -1F, 2F, -1F); // Box 328
		bodyModel[81].setRotationPoint(-24F, -16.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -1.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, -0.5F, 0.75F, 0F); // Box 330
		bodyModel[82].setRotationPoint(-21.5F, -19F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.75F, 0F, 1F, 0.5F, 0F, 1F, -1.5F, 0F, -1F, -2.5F, 0F, -0.5F, -0.25F, 0F, 1F, -0.5F, 0F, 1F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 331
		bodyModel[83].setRotationPoint(-21.5F, -18F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 333
		bodyModel[84].setRotationPoint(-33.5F, 1.5F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 334
		bodyModel[85].setRotationPoint(-33.5F, 2F, -2F);

		bodyModel[86].addBox(0F, 0F, 0F, 62, 2, 12, 0F); // Box 441
		bodyModel[86].setRotationPoint(-30.5F, 0.75F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 167
		bodyModel[87].setRotationPoint(-31F, -12.5F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 166
		bodyModel[88].setRotationPoint(-31F, -12.5F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[89].setRotationPoint(-31F, -14.5F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[90].setRotationPoint(-31F, -14.5F, 0F);

		bodyModel[91].addBox(0F, 0F, 0F, 7, 2, 9, 0F); // Box 865
		bodyModel[91].setRotationPoint(-22.5F, -5.5F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-4F, 0F, -2F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, -2F, 3F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 1296
		bodyModel[92].setRotationPoint(-31.5F, 1.5F, -13F);

		bodyModel[93].addShapeBox(-4.5F, 0F, -0.5F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left cab
		bodyModel[93].setRotationPoint(-11.5F, -15F, -10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 326
		bodyModel[94].setRotationPoint(-19F, -19F, -3F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 327
		bodyModel[95].setRotationPoint(-19F, -19F, -7F);
		bodyModel[95].rotateAngleY = 1.57079633F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 328
		bodyModel[96].setRotationPoint(-19F, -19F, 2F);
		bodyModel[96].rotateAngleY = 1.57079633F;

		bodyModel[97].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329 door swing left hood
		bodyModel[97].setRotationPoint(24F, -10F, -10.5F);

		bodyModel[98].addShapeBox(-3.5F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332 door swing right hood
		bodyModel[98].setRotationPoint(24F, -10F, 10.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 333
		bodyModel[99].setRotationPoint(24.5F, -15F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 334
		bodyModel[100].setRotationPoint(24.5F, -15F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 335
		bodyModel[101].setRotationPoint(20.5F, -15F, 10F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 336
		bodyModel[102].setRotationPoint(20.5F, -15F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 337
		bodyModel[103].setRotationPoint(20.5F, 0F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 338
		bodyModel[104].setRotationPoint(20.5F, 0F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[105].setRotationPoint(-23F, -12.5F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[106].setRotationPoint(-23F, -12.5F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[107].setRotationPoint(-23F, -13.5F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[108].setRotationPoint(-23F, -13.5F, 2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[109].setRotationPoint(-25F, -13.5F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[110].setRotationPoint(-22F, -10.5F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[111].setRotationPoint(-22F, -13.5F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 358
		bodyModel[112].setRotationPoint(-22F, -12.5F, -10F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 359
		bodyModel[113].setRotationPoint(-23F, -11.5F, 2F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 360 cs ab shit
		bodyModel[114].setRotationPoint(-22F, -10.5F, 4F);

		bodyModel[115].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 361
		bodyModel[115].setRotationPoint(-22.5F, -5.5F, -10F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 362 watercooler
		bodyModel[116].setRotationPoint(-20.5F, -10F, -5F);

		bodyModel[117].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top A
		bodyModel[117].setRotationPoint(-31.3F, -12.5F, 0F);

		bodyModel[118].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top A
		bodyModel[118].setRotationPoint(-31.3F, -12.5F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 389
		bodyModel[119].setRotationPoint(-33F, -6F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[120].setRotationPoint(-33F, -5F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 391
		bodyModel[121].setRotationPoint(-33F, -5F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 392
		bodyModel[122].setRotationPoint(-33F, -6F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big top
		bodyModel[123].setRotationPoint(-31.3F, -13.75F, -1.25F);

		bodyModel[124].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom A
		bodyModel[124].setRotationPoint(-32.5F, -6F, 0F);

		bodyModel[125].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom A
		bodyModel[125].setRotationPoint(-32.5F, -6F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight big bottom
		bodyModel[126].setRotationPoint(-32.5F, -7.25F, -1.25F);

		bodyModel[127].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam bottom B
		bodyModel[127].setRotationPoint(-32.5F, -6F, 0F);
		bodyModel[127].rotateAngleX = 1.57079633F;

		bodyModel[128].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam bottom B
		bodyModel[128].setRotationPoint(-32.5F, -6F, 0F);
		bodyModel[128].rotateAngleX = 1.57079633F;

		bodyModel[129].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight 2beam top B
		bodyModel[129].setRotationPoint(-31.3F, -12.5F, 0F);
		bodyModel[129].rotateAngleX = 1.57079633F;

		bodyModel[130].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight 2beam top B
		bodyModel[130].setRotationPoint(-31.3F, -12.5F, 0F);
		bodyModel[130].rotateAngleX = 1.57079633F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight cover
		bodyModel[131].setRotationPoint(-31.76F, -14.5F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight cover
		bodyModel[132].setRotationPoint(-31.76F, -14.5F, -2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 headlight cover
		bodyModel[133].setRotationPoint(-31.76F, -12.5F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 406 headlight cover
		bodyModel[134].setRotationPoint(-31.76F, -12.5F, 0F);

		bodyModel[135].addShapeBox(-1F, 0F, -1F, 2, 3, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 407 watercooler
		bodyModel[135].setRotationPoint(-19.5F, -13F, -4F);
		bodyModel[135].rotateAngleY = -0.78539816F;

		bodyModel[136].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 409
		bodyModel[136].setRotationPoint(-25F, -13.5F, 2F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Box 410
		bodyModel[137].setRotationPoint(-25F, -13.5F, -3F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 411
		bodyModel[138].setRotationPoint(-25F, -13.5F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 413
		bodyModel[139].setRotationPoint(-19.5F, -19F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[140].setRotationPoint(-19.5F, -19F, 2F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 415
		bodyModel[141].setRotationPoint(-20F, -19.75F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 416
		bodyModel[142].setRotationPoint(-19.5F, -17.25F, -10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 417
		bodyModel[143].setRotationPoint(-19.5F, -17.25F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[144].setRotationPoint(-27.5F, 1.5F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[145].setRotationPoint(-27.5F, 1.5F, 10F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 0, 23, 0F); // Box 439
		bodyModel[146].setRotationPoint(-15F, 1F, -11.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 440
		bodyModel[147].setRotationPoint(-15F, -4.01F, -11.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 441
		bodyModel[148].setRotationPoint(-15F, -4.01F, 10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 452 some door that magically vibes in the back
		bodyModel[149].setRotationPoint(32.5F, -13F, -2F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 464 gn fuckshit cube
		bodyModel[150].setRotationPoint(-3F, -20F, -5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 23, 0F); // Box 484
		bodyModel[151].setRotationPoint(-15F, -1.5F, -11.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[152].setRotationPoint(1.5F, -14F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[153].setRotationPoint(1.5F, -14F, 2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 10
		bodyModel[154].setRotationPoint(0.5F, -16F, -2F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 13
		bodyModel[155].setRotationPoint(0.5F, -10F, -3F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[156].setRotationPoint(20.5F, -5F, -6F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[157].setRotationPoint(20.5F, -12F, -4F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[158].setRotationPoint(20.5F, -8F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 18, 12, 0F); // Box 13
		bodyModel[159].setRotationPoint(-12.5F, -18F, -6F);

		bodyModel[160].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[160].setRotationPoint(-4.5F, -13F, 2F);

		bodyModel[161].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 10
		bodyModel[161].setRotationPoint(-4.5F, -13F, -6F);

		bodyModel[162].addBox(0F, 0F, 0F, 19, 2, 4, 0F); // Box 7
		bodyModel[162].setRotationPoint(1.5F, -14F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[163].setRotationPoint(-11.5F, -18F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[164].setRotationPoint(-8.5F, -6F, -1.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 523
		bodyModel[165].setRotationPoint(-3.5F, -12F, -1.5F);

		bodyModel[166].addBox(-0.5F, -0.5F, -0.5F, 2, 2, 1, 0F); // Box 538 nose mu plug
		bodyModel[166].setRotationPoint(-30F, -12.4F, -3.25F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 468 horn gn
		bodyModel[167].setRotationPoint(1F, -22F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 469 horn gn
		bodyModel[168].setRotationPoint(2F, -21F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 470 horn gn
		bodyModel[169].setRotationPoint(-1F, -22F, 0.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 471 horn gn
		bodyModel[170].setRotationPoint(0F, -22F, -1.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 headlight backpart
		bodyModel[171].setRotationPoint(-32.25F, -8F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404 headlight backpart
		bodyModel[172].setRotationPoint(-32.25F, -8F, -2F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 404 she wheel on my antenna till i wagon
		bodyModel[173].setRotationPoint(-11F, -23F, 0F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 405 she wheel on my antenna till i wagon
		bodyModel[174].setRotationPoint(-12.5F, -21F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.875F, 0F, 0F, -0.875F, 0F, 0F); // Box 429 front mu hose extender
		bodyModel[175].setRotationPoint(-32.84F, 2.5F, 4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, 0.875F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 430 front mu hose extender
		bodyModel[176].setRotationPoint(-32.84F, 2.5F, -7F);

		bodyModel[177].addShapeBox(0F, -0.15F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 431 headlight nose plate
		bodyModel[177].setRotationPoint(-32.1F, -12.55F, 0F);

		bodyModel[178].addShapeBox(0F, -1.85F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 432 headlight nose plate
		bodyModel[178].setRotationPoint(-32.1F, -12.45F, 0F);

		bodyModel[179].addShapeBox(0F, -1.85F, -1F, 1, 4, 2, 0F,0F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 433 nose headlight plate
		bodyModel[179].setRotationPoint(-31.9F, -12.5F, 0F);

		bodyModel[180].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186 winterization hatch cull tall
		bodyModel[180].setRotationPoint(18.9F, -23F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[181].setRotationPoint(4.5F, -23F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[182].setRotationPoint(4.5F, -24F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, -4F, 0F, -4F, -4F); // Box 522 atsf tall arrestor cull
		bodyModel[183].setRotationPoint(17F, -23F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523 atsf tall arrestor tip
		bodyModel[184].setRotationPoint(17F, -24F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs2
		bodyModel[185].setRotationPoint(-15.8F, -14F, -0.0500000000000003F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs2
		bodyModel[186].setRotationPoint(-22.5F, -12F, 1.95F);
		bodyModel[186].rotateAngleY = -0.45378561F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs2
		bodyModel[187].setRotationPoint(-22.5F, -14F, 1.95F);
		bodyModel[187].rotateAngleY = -0.45378561F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs2
		bodyModel[188].setRotationPoint(-22.5F, -8F, 1.95F);
		bodyModel[188].rotateAngleY = -0.45378561F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[189].setRotationPoint(-5.5F, 2F, -10.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		bodyModel[190].setRotationPoint(-8.5F, 2F, -10.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[191].setRotationPoint(9.5F, 2F, -10.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 456
		bodyModel[192].setRotationPoint(-4.5F, 4F, -10.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 15, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[193].setRotationPoint(-5.5F, 2F, 10.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[194].setRotationPoint(9.5F, 2F, 10.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 461
		bodyModel[195].setRotationPoint(-8.5F, 2F, 10.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Box 462
		bodyModel[196].setRotationPoint(-6F, 4F, -10.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F); // Box 463
		bodyModel[197].setRotationPoint(9F, 4F, -10.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 464
		bodyModel[198].setRotationPoint(-4.5F, 4F, 10.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 465
		bodyModel[199].setRotationPoint(-6F, 4F, 10.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 466
		bodyModel[200].setRotationPoint(9F, 4F, 10.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[201].setRotationPoint(-5F, 3.5F, -9.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[202].setRotationPoint(-5F, 6.5F, -8.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 99
		bodyModel[203].setRotationPoint(-5F, 6.5F, 2.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[204].setRotationPoint(-5F, 3.5F, 2.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 96 air tank pipe
		bodyModel[205].setRotationPoint(-6F, 2F, -0.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130 FUCK FUCK FUCK FUCK AAAUGGGHHHH IM PRESSURIZED STEEWWWIE IM SO FULL OF COMPRESSED AIR AND CONDENSATIONS STEWWIEEE YOU NEED TO OPEN THE SPITTER VALE AND DRAIN MEEEE AUUGHHH STEWWIEEEE
		bodyModel[206].setRotationPoint(-5F, 4F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[207].setRotationPoint(-5F, 5F, -2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[208].setRotationPoint(-5F, 5F, 1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 483 cull horn mount gn
		bodyModel[209].setRotationPoint(1.5F, -20.5F, -2F);

		bodyModel[210].addShapeBox(-0.5F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 468 nose mu plug
		bodyModel[210].setRotationPoint(-30.35F, -11.75F, 3.5F);

		bodyModel[211].addShapeBox(0F, -2F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474 cs1 gaugepannel
		bodyModel[211].setRotationPoint(-22.75F, -10.75F, 3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, -5F); // Box 475 cs1 gaugepannel hd
		bodyModel[212].setRotationPoint(-21.73F, -13.75F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedoooo glowe
		bodyModel[213].setRotationPoint(-23.1F, -14.5F, 2.25F);
		bodyModel[213].rotateAngleY = -1.23918377F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 482
		bodyModel[214].setRotationPoint(-30.5F, 0F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.75F, 0F, -1.125F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0.75F, 0F, -1.125F, 0.75F, 0F, -1.125F, 0F, 0F, 1.875F, 0F, 0F, 1.875F, 0.75F, 0F, -1.125F); // Box 483
		bodyModel[215].setRotationPoint(-31.5F, 0F, -5.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[216].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 485
		bodyModel[217].setRotationPoint(28.5F, 2.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 62, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 719
		bodyModel[218].setRotationPoint(-30.5F, 2.75F, -6.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[219].setRotationPoint(-18.25F, 1.75F, -10.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[220].setRotationPoint(-18.25F, 1.75F, 6.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 133
		bodyModel[221].setRotationPoint(-17.25F, 2F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 134
		bodyModel[222].setRotationPoint(-17.25F, 2F, 9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[223].setRotationPoint(18.5F, 1.75F, -10.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 727
		bodyModel[224].setRotationPoint(19.5F, 2F, -10.95F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 728
		bodyModel[225].setRotationPoint(19.5F, 2F, 8.95F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 729
		bodyModel[226].setRotationPoint(18.5F, 1.75F, 6.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[227].setRotationPoint(-18.25F, 0.75F, -10.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[228].setRotationPoint(18.5F, 0.75F, -10.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[229].setRotationPoint(32.5F, -18.5F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F); // Box 735
		bodyModel[230].setRotationPoint(32.5F, -18.5F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 184 stack
		bodyModel[231].setRotationPoint(4.5F, -20.75F, -1.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,-0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F, -0.375F, -0.25F, -0.1F); // Box 185 stack
		bodyModel[232].setRotationPoint(17F, -20.75F, -1.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -5F, 0F, -0.5F, -5F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0.5F, 0F, -5F); // Box 501 cull pipe cooler gn thing
		bodyModel[233].setRotationPoint(-8F, -20.75F, -3F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 502 fuel filler no pannel
		bodyModel[234].setRotationPoint(5F, 3F, 7.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 503 fuel filler no pannel
		bodyModel[235].setRotationPoint(5F, 3F, -10.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 623 NJT GONG
		bodyModel[236].setRotationPoint(-33.75F, -2.5F, -1F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 624njt gong holder
		bodyModel[237].setRotationPoint(-33.25F, -3F, -1.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 419 pilot passenger
		bodyModel[238].setRotationPoint(-34.5F, 2.5F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453 rear end bit
		bodyModel[239].setRotationPoint(32.5F, -15F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Box 454 rear end bit
		bodyModel[240].setRotationPoint(32.5F, -15F, -3F);

		bodyModel[241].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -2F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 rear diaphram
		bodyModel[241].setRotationPoint(34F, -17F, -4F);
		bodyModel[241].rotateAngleY = 1.57079633F;

		bodyModel[242].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 rear diaphram
		bodyModel[242].setRotationPoint(34F, -17F, 0F);
		bodyModel[242].rotateAngleY = 1.57079633F;

		bodyModel[243].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128 rear diaphram
		bodyModel[243].setRotationPoint(34F, -15F, -4.5F);
		bodyModel[243].rotateAngleY = 1.57079633F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 rear mu plug
		bodyModel[244].setRotationPoint(32.5F, -15F, -2F);
		bodyModel[244].rotateAngleZ = -0.27925268F;

		bodyModel[245].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 631 cull
		bodyModel[245].setRotationPoint(20.5F, 2F, 11F);

		bodyModel[246].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 636 cull
		bodyModel[246].setRotationPoint(28.5F, 2F, 11F);

		bodyModel[247].addShapeBox(0F, 0F, -1F, 5, 6, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.25F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 637 cull
		bodyModel[247].setRotationPoint(-15.5F, 2F, 11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 638 cull
		bodyModel[248].setRotationPoint(28.5F, 2F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 639 cull
		bodyModel[249].setRotationPoint(20.5F, 2F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F); // Box 640 cull
		bodyModel[250].setRotationPoint(-15.5F, 2F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,1F, -3F, 0F, 0F, -1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[251].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[252].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[253].setRotationPoint(-31.75F, -14.5F, 1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 103
		bodyModel[254].setRotationPoint(-31.75F, -14.5F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, -0.25F, -0.35F, -0.65F, -0.25F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 103
		bodyModel[255].setRotationPoint(-31.75F, -14.5F, -2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 103
		bodyModel[256].setRotationPoint(-31.75F, -14.5F, -2F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, -0.5F, -0.65F, -0.35F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[257].setRotationPoint(-31.75F, -12.5F, 1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 103
		bodyModel[258].setRotationPoint(-31.75F, -12.5F, -2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[259].setRotationPoint(-31.75F, -11.5F, 0F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[260].setRotationPoint(-31.75F, -11.5F, -2F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[261].setRotationPoint(-23.25F, -14.5F, -2F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 782 dont forgor meee
		bodyModel[262].setRotationPoint(-25F, -1.5F, -3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 111
		bodyModel[263].setRotationPoint(-26.25F, -8.25F, -11.25F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[264].setRotationPoint(-26.25F, -8.25F, 10.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.75F); // Box 111
		bodyModel[265].setRotationPoint(-27.25F, -8.25F, -11.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F); // Box 144
		bodyModel[266].setRotationPoint(-27.25F, -8.25F, 10.25F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 123 Markerlight Early
		bodyModel[267].setRotationPoint(-26.65F, -8F, 9.9F);
		bodyModel[267].rotateAngleY = 0.64577182F;

		bodyModel[268].addShapeBox(0F, 0F, -5F, 3, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 144 numberboard early
		bodyModel[268].setRotationPoint(-26.25F, -8F, 15.3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 111 numberboard early
		bodyModel[269].setRotationPoint(-26.25F, -8F, -11.3F);

		bodyModel[270].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 453 Markerlight Early
		bodyModel[270].setRotationPoint(-26.65F, -8F, -9.9F);
		bodyModel[270].rotateAngleY = -0.64577182F;

		bodyModel[271].addShapeBox(0F, 0F, -1F, 1, 2, 5, 0F,0F, 0.125F, 0.125F, 0.225F, 0.25F, 0.375F, 0.225F, 0.25F, 0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.1F, 0.25F, 0.375F, 0.1F, 0.25F, 0.375F, 0F, 0.125F, 0.125F); // Box 468
		bodyModel[271].setRotationPoint(-28.25F, -8.5F, -10.25F);
		bodyModel[271].rotateAngleY = 0.73303829F;

		bodyModel[272].addShapeBox(0F, 0F, -1F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 469 numberboard
		bodyModel[272].setRotationPoint(-28.25F, -8.5F, -10.25F);
		bodyModel[272].rotateAngleY = 0.73303829F;

		bodyModel[273].addShapeBox(0.6F, -1.5F, 1.25F, 1, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 470 markerlight
		bodyModel[273].setRotationPoint(-28.25F, -8.5F, -10.5F);
		bodyModel[273].rotateAngleY = 0.73303829F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		bodyModel[274].setRotationPoint(31.5F, -19F, -7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		bodyModel[275].setRotationPoint(31.5F, -19F, 3F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		bodyModel[276].setRotationPoint(31.5F, -18F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, -1F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 821 cull forward nose stairs
		bodyModel[277].setRotationPoint(-25.5F, 4F, 10.75F);

		bodyModel[278].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822 cull forward nose stairs
		bodyModel[278].setRotationPoint(-25.5F, 2F, 10.75F);

		bodyModel[279].addShapeBox(0F, 0F, -4F, 1, 2, 5, 0F,0F, 0.125F, 0.125F, 0.225F, 0.25F, 0.375F, 0.225F, 0.25F, 0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.1F, 0.25F, 0.375F, 0.1F, 0.25F, 0.375F, 0F, 0.125F, 0.125F); // Box 823
		bodyModel[279].setRotationPoint(-28.25F, -8.5F, 10.25F);
		bodyModel[279].rotateAngleY = -0.73303829F;

		bodyModel[280].addShapeBox(0F, 0F, -4F, 1, 2, 5, 0F,0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F, 0.05F, -0.05F, -0.05F); // Box 824 numberboard
		bodyModel[280].setRotationPoint(-28.25F, -8.5F, 10.25F);
		bodyModel[280].rotateAngleY = -0.73303829F;

		bodyModel[281].addShapeBox(0.6F, -1.5F, -2.25F, 1, 1, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 825 markerlight
		bodyModel[281].setRotationPoint(-28.25F, -8.5F, 10.5F);
		bodyModel[281].rotateAngleY = -0.73303829F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -1.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 1.5F, 0F, 1F, 3F, 0F); // Box 827
		bodyModel[282].setRotationPoint(-27.25F, -14.5F, 2F);

		bodyModel[283].addShapeBox(-4.5F, 0F, -0.5F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 828 door swing right cab
		bodyModel[283].setRotationPoint(-11.5F, -15F, 10.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 149 cull nose grabs
		bodyModel[284].setRotationPoint(-32.25F, -8F, -3F);
		bodyModel[284].rotateAngleZ = -0.15707963F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 7F, 0F, -1F, 7F); // Box 818 cull lift lugs
		bodyModel[285].setRotationPoint(-32.85F, -8F, -4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 7F, 0F, -1F, 7F); // Box 819 cull lift lugs
		bodyModel[286].setRotationPoint(-34.25F, -1F, -4F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,-1F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -3F); // Box 467
		bodyModel[287].setRotationPoint(-29.5F, -10F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -2F, -2.75F, 0F, 0F, -2F, -3F, 0F, 1F, 0F, 0F, 0.5F, 0F, -2F, 1.75F, -1F, 0F, 1F, -3F); // Box 470
		bodyModel[288].setRotationPoint(-28.25F, -13.5F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 2F); // Box 471
		bodyModel[289].setRotationPoint(-29.5F, -10F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -2F, -3F, -2F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, -2F, 1.75F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 474
		bodyModel[290].setRotationPoint(-28.25F, -13.5F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.25F, 0.5F, -1F, -0.75F, -0.25F, -4F, -0.75F, -0.25F, 3F, -0.25F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, 3F, 0F, 0F, 0F); // Box 478
		bodyModel[291].setRotationPoint(-29.5F, -11F, 7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.25F, 3F, -0.75F, -0.25F, -4F, -1.25F, 0.5F, -1F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, -4F, -1F, 0F, -1F); // Box 479
		bodyModel[292].setRotationPoint(-29.5F, -11F, -8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.25F, -0.25F, 0F, 0.2F, 0F, 0F, -1.75F, 2F, 0F, -2.25F, 2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -2F, 0F, -2.25F, -2F, 0F); // Box 487
		bodyModel[293].setRotationPoint(-25.5F, -11F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-2.25F, 2F, 0F, -1.75F, 2F, 0F, 0.2F, 0F, 0F, -0.25F, -0.25F, 0F, -2.25F, -2F, 0F, -1.75F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[294].setRotationPoint(-25.5F, -11F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, -0.95F, 0.47F, 1.45F, 0F, 0.47F, 1.45F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 490
		bodyModel[295].setRotationPoint(-23.25F, -13.5F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.47F, 1.45F, -0.95F, 0.47F, 1.45F); // Box 491
		bodyModel[296].setRotationPoint(-23.25F, -13.5F, 2F);

		bodyModel[297].addShapeBox(0F, -4F, 1F, 1, 4, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F); // Box 493 cull mirrors
		bodyModel[297].setRotationPoint(-19.6F, -11F, 10F);

		bodyModel[298].addShapeBox(0F, 0F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 494 cull
		bodyModel[298].setRotationPoint(-25.5F, 4F, -9.75F);

		bodyModel[299].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 495 cull
		bodyModel[299].setRotationPoint(-25.5F, 2F, -9.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 444 CULL f3a mesh grill
		bodyModel[300].setRotationPoint(-10.5F, -15F, -11.01F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 445 f3a mesh grill bottom
		bodyModel[301].setRotationPoint(-10.5F, -10F, -11.01F);

		bodyModel[302].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 683 fan
		bodyModel[302].setRotationPoint(19F, -20F, -2.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 450 fan
		bodyModel[303].setRotationPoint(-0.5F, -20F, -2.5F);

		bodyModel[304].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 451 fan
		bodyModel[304].setRotationPoint(6.5F, -20F, -2.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 452 fan
		bodyModel[305].setRotationPoint(12F, -20F, -2.5F);

		bodyModel[306].addShapeBox(0F, 0F, -1F, 84, 10, 1, 0F,0F, 0F, -0.5F, -42F, 0F, -0.5F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, -42F, -5F, -0.5F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 455 CULL f3a mesh grill
		bodyModel[306].setRotationPoint(-10.5F, -15F, 11.01F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 456 f3a mesh grill bottom
		bodyModel[307].setRotationPoint(-10.5F, -10F, 11.01F);

		bodyModel[308].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 457 dynamic fan small
		bodyModel[308].setRotationPoint(-8.5F, -20F, -2.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458 f3a tall fan
		bodyModel[309].setRotationPoint(6.5F, -21F, -2.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459 f3a tall fan
		bodyModel[310].setRotationPoint(12F, -21F, -2.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460 f3a tall fan
		bodyModel[311].setRotationPoint(19F, -21F, -2.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461 f3a tall fan
		bodyModel[312].setRotationPoint(-0.5F, -21F, -2.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 298
		bodyModel[313].setRotationPoint(-5.5F, -9F, -2F);

		bodyModel[314].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Box 299
		bodyModel[314].setRotationPoint(-5.5F, -6F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[315].setRotationPoint(-5.5F, -2F, -2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 19, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 465
		bodyModel[316].setRotationPoint(1.5F, -4F, -5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 466
		bodyModel[317].setRotationPoint(1.5F, -9F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 19, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[318].setRotationPoint(1.5F, -12F, -6F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 468
		bodyModel[319].setRotationPoint(0.5F, -13F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[320].setRotationPoint(-3.5F, -10F, 3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 470
		bodyModel[321].setRotationPoint(-3.5F, -10F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 19, 2, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 471
		bodyModel[322].setRotationPoint(1.5F, -6F, -5F);

		bodyModel[323].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[323].setRotationPoint(2.5F, -15F, 0F);
		bodyModel[323].rotateAngleX = 0.78539816F;

		bodyModel[324].addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[324].setRotationPoint(12F, -15F, 0F);
		bodyModel[324].rotateAngleX = 0.78539816F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[325].setRotationPoint(-8.5F, -8.5F, -2.5F);

		bodyModel[326].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[326].setRotationPoint(-6.5F, -4.3F, 1F);
		bodyModel[326].rotateAngleX = -1.10828408F;

		bodyModel[327].addShapeBox(-1F, -3F, -1F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[327].setRotationPoint(-6.5F, -4.3F, -1F);
		bodyModel[327].rotateAngleX = 1.10828408F;

		bodyModel[328].addBox(0F, 0F, 0F, 4, 11, 6, 0F); // Box 477 cull equipment rack
		bodyModel[328].setRotationPoint(22F, -11F, -3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 478
		bodyModel[329].setRotationPoint(24F, -3F, -4F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 479
		bodyModel[330].setRotationPoint(21F, -3F, 1F);

		bodyModel[331].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 480 lube filter
		bodyModel[331].setRotationPoint(24F, -8F, -3F);
		bodyModel[331].rotateAngleZ = 0.78539816F;

		bodyModel[332].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 481 engine water tank
		bodyModel[332].setRotationPoint(23F, -16.01F, -3F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 482
		bodyModel[333].setRotationPoint(22F, -18.01F, -1F);

		bodyModel[334].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 0 Steam/HEP gen
		bodyModel[334].setRotationPoint(27F, -10F, -6F);

		bodyModel[335].addBox(0F, 0F, 0F, 4, 10, 5, 0F); // Box 485 Steam/HEP gen
		bodyModel[335].setRotationPoint(27.5F, -10F, 0F);

		bodyModel[336].addBox(0F, 0F, 0F, 9, 3, 8, 0F); // Box 429 dynamics internal
		bodyModel[336].setRotationPoint(-9F, -18F, -4F);

		bodyModel[337].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 430
		bodyModel[337].setRotationPoint(-10.5F, -2F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, -2F, -4F, 0F); // Box 431
		bodyModel[338].setRotationPoint(-33.5F, 1.5F, 2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, -4F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 3F, -4F, -3F, -4F, -4F, -2F); // Box 432
		bodyModel[339].setRotationPoint(-31.5F, 1.5F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, -1F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 434
		bodyModel[340].setRotationPoint(-29.25F, -12.5F, -8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 1.75F, 0F, 1F, 2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[341].setRotationPoint(-29.25F, -12.5F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[342].setRotationPoint(9F, 2F, -8.5F);
		bodyModel[342].rotateAngleY = 1.57079633F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[343].setRotationPoint(1F, 2F, -8.5F);
		bodyModel[343].rotateAngleY = 1.57079633F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 427
		bodyModel[344].setRotationPoint(-33F, -8F, -2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.65F, -0.25F, -0.35F, -0.65F, -0.25F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 428
		bodyModel[345].setRotationPoint(-33F, -8F, -2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.35F, -0.65F, 0F, -0.35F, -0.65F); // Box 429
		bodyModel[346].setRotationPoint(-33F, -8F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.65F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[347].setRotationPoint(-33F, -8F, 1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 431 headlight backpart
		bodyModel[348].setRotationPoint(-32.25F, -6F, 0F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 432 headlight backpart
		bodyModel[349].setRotationPoint(-32.25F, -6F, -2F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 12, 4, 0F,-2F, 0F, 0F, 1.25F, 2.5F, 0F, 1.25F, 2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[350].setRotationPoint(-33.5F, -10F, -2F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -5F, 0F, -42F, -5F, 0F, -42F, -5F, -0.35F, 0F, -5F, -0.35F); // Box 416 late grills CULL
		bodyModel[351].setRotationPoint(-10.5F, -15F, -11.15F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 84, 10, 1, 0F,0F, 0F, -0.35F, -42F, 0F, -0.35F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.35F, -42F, -5F, -0.35F, -42F, -5F, 0F, 0F, -5F, 0F); // Box 417 late grills CULL
		bodyModel[352].setRotationPoint(-10.5F, -15F, 10.15F);

		bodyModel[353].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 1.5F); // Box 426 pilot snow
		bodyModel[353].setRotationPoint(-34F, 7F, 0F);
		bodyModel[353].rotateAngleY = 1.57079633F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1.225F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 428 pilot snow
		bodyModel[354].setRotationPoint(-29.5F, 2.5F, 8F);

		bodyModel[355].addShapeBox(0F, 0F, -1F, 9, 3, 1, 0F,-0.7F, 0F, 0.13F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, -0.7F, 0F, -0.13F, 0F, 0F, 0.82F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.82F); // Box 430 pilot snow
		bodyModel[355].setRotationPoint(-34F, 2.5F, 2F);
		bodyModel[355].rotateAngleY = 1.57079633F;

		bodyModel[356].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 431 pilot snow
		bodyModel[356].setRotationPoint(-34F, 5F, 0F);
		bodyModel[356].rotateAngleY = 1.57079633F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.052F, 0F, 0F, -0.575F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.82F, 0F, 0F, -1.82F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 432 pilot snow CULL
		bodyModel[357].setRotationPoint(-31F, 8F, 9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -2.5F); // Box 433 pilot snow
		bodyModel[358].setRotationPoint(-34F, 7F, 0F);
		bodyModel[358].rotateAngleY = -1.57079633F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.225F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3.2F, 0F, 0F, 0.25F, 0F, 0F); // Box 434 pilot snow
		bodyModel[359].setRotationPoint(-29.5F, 2.5F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-0.7F, 0F, -0.13F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, -0.7F, 0F, 0.13F, 0F, 0F, -0.82F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0.82F); // Box 435 pilot snow
		bodyModel[360].setRotationPoint(-34F, 2.5F, -2F);
		bodyModel[360].rotateAngleY = -1.57079633F;

		bodyModel[361].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, 4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Box 436 pilot snow
		bodyModel[361].setRotationPoint(-34F, 5F, 0F);
		bodyModel[361].rotateAngleY = -1.57079633F;

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.575F, 0F, 0F, 0.052F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.82F, 0F, 0F, 0.82F, 0F, 0F); // Box 437 pilot snow CULL
		bodyModel[362].setRotationPoint(-31F, 8F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 438 pilot passenger
		bodyModel[363].setRotationPoint(-33.5F, 2.5F, 2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 pilot passenger
		bodyModel[364].setRotationPoint(-27.5F, 2F, 10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, -2.85F, -2.66F, 0F, -2F, 1.275F, -0.5F, 0F, -1.275F, -0.5F, 0F, 0.5F, -0.5F, -2.85F, -1.5F, -0.5F, -2F); // Box 451 pilot passenger CULL
		bodyModel[365].setRotationPoint(-31.5F, 2.5F, 8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.1F, 0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.16F, 0F, 0F, 0.25F, 0F, -0.17F, 0.5F, -2F, -1F, -0.5F, -2F, 1F, 0.3F, 0F, -0.03F); // Box 452 pilot passenger
		bodyModel[366].setRotationPoint(-29F, 2.5F, 9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 453 pilot passenger
		bodyModel[367].setRotationPoint(-33.5F, 2.5F, -8F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 pilot passenger
		bodyModel[368].setRotationPoint(-27.5F, 2F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-2.66F, 0F, -2F, 1.7F, 0F, -2.85F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -2F, 0.5F, -0.5F, -2.85F, -1.275F, -0.5F, 0F, 1.275F, -0.5F, 0F); // Box 455 pilot passenger CULL
		bodyModel[369].setRotationPoint(-31.5F, 2.5F, -12F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.16F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, -1F, -0.2F, 0F, -0.1F, 0.3F, 0F, -0.03F, -0.5F, -2F, 1F, 0.5F, -2F, -1F, 0.25F, 0F, -0.17F); // Box 456 pilot passenger
		bodyModel[370].setRotationPoint(-29F, 2.5F, -10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.225F, 0F, 0F, 1.225F, 0F, 0F, 0.225F, 0F, 0F, -0.225F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458 pilot passenger CULL
		bodyModel[371].setRotationPoint(-34F, 8F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.225F, 0F, 0F, 0.225F, 0F, 0F, 1.225F, 0F, 0F, -1.225F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 459 pilot passenger CULL
		bodyModel[372].setRotationPoint(-34F, 8F, 5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-0.75F, -0.125F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.125F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 460 pilot passenger coupler cover
		bodyModel[373].setRotationPoint(-36F, 3F, -2F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.325F, 0F, 0F, 0.325F, 0F, 0F, 0.325F, 0F, 0F, -0.325F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 464 pilot norma
		bodyModel[374].setRotationPoint(-33.5F, 6F, -2F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F); // Box 469 pilot norma
		bodyModel[375].setRotationPoint(-32.5F, 3F, 2F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 472 pilot norma
		bodyModel[376].setRotationPoint(-27.5F, 3F, 10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 3F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 473 pilot norma
		bodyModel[377].setRotationPoint(-33.5F, 4F, 2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 1.6F, -0.5F, -1.4F, -2.2F, -0.5F, -1F, 1F, 0F, 1F, -1F, 0F, 1F, -0.4F, 0F, -2.4F, -0.2F, 0F, -2F); // Box 474 pilot norma
		bodyModel[378].setRotationPoint(-31.5F, 4F, 7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 2F, 2, 2, 1, 0F,-0.3F, 0F, -0.7F, -0.05F, 0F, 0.65F, 0F, 0F, -0.7F, -0.65F, 0F, 0.1F, 0.5F, -0.2F, -1.1F, -0.05F, -0.2F, 0.5F, 0F, -0.2F, -0.6F, 0.1F, -0.2F, 0.5F); // Box 480 pilot normal CULL
		bodyModel[379].setRotationPoint(-30F, 5.4F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, -3F, -4F, 0.5F, -2F, -1F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 3F, -0.5F, -4F, -4F, -0.5F, -3F); // Box 481 pilot norma
		bodyModel[380].setRotationPoint(-31.5F, 3F, 8F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, -2F, -0.5F, -0.5F, 2F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 482 pilot norma
		bodyModel[381].setRotationPoint(-32.5F, 3F, -8F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 483 pilot norma
		bodyModel[382].setRotationPoint(-27.5F, 3F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-3F, -0.5F, -0.5F, 3F, -0.5F, -0.5F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 484 pilot norma
		bodyModel[383].setRotationPoint(-33.5F, 4F, -8F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-2.2F, -0.5F, -1F, 1.6F, -0.5F, -1.4F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.2F, 0F, -2F, -0.4F, 0F, -2.4F, -1F, 0F, 1F, 1F, 0F, 1F); // Box 485 pilot norma
		bodyModel[384].setRotationPoint(-31.5F, 4F, -9.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-3F, -0.5F, -1.5F, 2F, -0.5F, -2.5F, 0.6F, -0.5F, 0.4F, -1.2F, -0.5F, 0F, -0.2F, 0F, -3.5F, -0.4F, 0F, -3.9F, -1.4F, 0F, 1.4F, 0.8F, 0F, 1F); // Box 486 pilot norma
		bodyModel[385].setRotationPoint(-30.5F, 4F, -11.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-4F, 0.5F, -2F, 3F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4F, -0.5F, -3F, 3F, -0.5F, -4F, 1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F); // Box 487 pilot norma
		bodyModel[386].setRotationPoint(-31.5F, 3F, -13F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[387].setRotationPoint(8.5F, -13F, 11F);
		bodyModel[387].rotateAngleY = -1.57079633F;

		bodyModel[388].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[388].setRotationPoint(12.5F, -13F, 11F);
		bodyModel[388].rotateAngleY = -1.57079633F;

		bodyModel[389].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 412
		bodyModel[389].setRotationPoint(-8.5F, -14F, 11F);
		bodyModel[389].rotateAngleY = -1.57079633F;

		bodyModel[390].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 414
		bodyModel[390].setRotationPoint(-2.5F, -14F, 11F);
		bodyModel[390].rotateAngleY = -1.57079633F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 415
		bodyModel[391].setRotationPoint(23.5F, -13F, 11F);
		bodyModel[391].rotateAngleY = -1.57079633F;

		bodyModel[392].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416 interior engine bit
		bodyModel[392].setRotationPoint(0.5F, -16F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 417 interior engine bit
		bodyModel[393].setRotationPoint(0.5F, -16F, -10F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 19.01F, 0F, 0F, 19.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 418 sandcap fill
		bodyModel[394].setRotationPoint(-19F, -5.5F, 11F);
		bodyModel[394].rotateAngleY = -1.57079633F;

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 19.02F, 0F, 0F, 19.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 419 sandcap fill
		bodyModel[395].setRotationPoint(14F, -7.5F, 11F);
		bodyModel[395].rotateAngleY = -1.57079633F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 420 headlight rear very high
		bodyModel[396].setRotationPoint(32F, -18F, -1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[397].setRotationPoint(5F, 2.5F, 7.85F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 421 fuel filler with skirting OR extra thicc tank fuel filler
		bodyModel[398].setRotationPoint(5F, 2.5F, -10.85F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 425
		bodyModel[399].setRotationPoint(-30.25F, -12.5F, 2F);

		bodyModel[400].addShapeBox(0F, 0F, 2F, 2, 2, 1, 0F,-0.65F, 0F, 0.1F, 0F, 0F, -0.7F, -0.05F, 0F, 0.65F, -0.3F, 0F, -0.7F, 0.1F, -0.2F, 0.5F, 0F, -0.2F, -0.6F, -0.05F, -0.2F, 0.5F, 0.5F, -0.2F, -1.1F); // Box 427 pilot normal CULL
		bodyModel[400].setRotationPoint(-30F, 5.4F, 6F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-1.2F, -0.5F, 0F, 0.6F, -0.5F, 0.4F, 2F, -0.5F, -2.5F, -3F, -0.5F, -1.5F, 0.8F, 0F, 1F, -1.4F, 0F, 1.4F, -0.4F, 0F, -3.9F, -0.2F, 0F, -3.5F); // Box 428 pilot normal
		bodyModel[401].setRotationPoint(-30.5F, 4F, 8.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F); // Box 429
		bodyModel[402].setRotationPoint(-30.25F, -12.5F, -8F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -1.25F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 430
		bodyModel[403].setRotationPoint(-30.5F, -11F, 8F);
		bodyModel[403].rotateAngleY = -1.57079633F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 1F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 431
		bodyModel[404].setRotationPoint(-30.5F, -11F, -2F);
		bodyModel[404].rotateAngleY = -1.57079633F;

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.675F, -1.675F, 0F, -0.675F, -1.675F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.2F, 0F, -1F, -1.2F); // Box 440 HEADLIGHT FULL TOP2
		bodyModel[405].setRotationPoint(-31.25F, -14.5F, 0F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -0.675F, -0.675F, 0F, -0.675F, -0.675F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 441 HEADLIGHT FULL TOP2
		bodyModel[406].setRotationPoint(-31.25F, -14.5F, -2F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.675F, -0.675F, 0F, -1.675F, -0.675F, 0F, -1.2F, -1F, 0F, -1.2F, -1F); // Box 442 HEADLIGHT FULL TOP2
		bodyModel[407].setRotationPoint(-31.25F, -12.5F, -2F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.675F, -1.675F, 0F, -1.675F, -1.675F); // Box 443 HEADLIGHT FULL TOP2
		bodyModel[408].setRotationPoint(-31.25F, -12.5F, 0F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.675F, -1.675F, 0F, -1.675F, -1.675F); // Box 444 HEADLIGHT FULL BOTTOM
		bodyModel[409].setRotationPoint(-32.49F, -6F, 0F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.675F, -1.675F, 0F, -0.675F, -1.675F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.2F, 0F, -1F, -1.2F); // Box 445 HEADLIGHT FULL BOTTOM
		bodyModel[410].setRotationPoint(-32.49F, -8F, 0F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, -0.675F, -0.675F, 0F, -0.675F, -0.675F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 446 HEADLIGHT FULL BOTTOM
		bodyModel[411].setRotationPoint(-32.49F, -8F, -2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.675F, -0.675F, 0F, -1.675F, -0.675F, 0F, -1.2F, -1F, 0F, -1.2F, -1F); // Box 447 HEADLIGHT FULL BOTTOM
		bodyModel[412].setRotationPoint(-32.49F, -6F, -2F);

		bodyModel[413].addShapeBox(0F, 0F, -2F, 4, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448 sunshield
		bodyModel[413].setRotationPoint(-19.5F, -15F, -11F);
		bodyModel[413].rotateAngleX = 0.38397244F;

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 449 sunshield
		bodyModel[414].setRotationPoint(-19.5F, -15F, 11F);
		bodyModel[414].rotateAngleX = -0.38397244F;

		bodyModel[415].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 450 fuel tank embiggened
		bodyModel[415].setRotationPoint(8.5F, 4F, -10F);
		bodyModel[415].rotateAngleY = 1.57079633F;

		bodyModel[416].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 451 fuel tank embiggened
		bodyModel[416].setRotationPoint(8.5F, 7F, -8F);
		bodyModel[416].rotateAngleY = 1.57079633F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F); // Box 452 fuel tank embiggened
		bodyModel[417].setRotationPoint(8.5F, 3.25F, -9F);
		bodyModel[417].rotateAngleY = 1.57079633F;

		bodyModel[418].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 453 fuel tank standard
		bodyModel[418].setRotationPoint(8.5F, 3.25F, -9F);
		bodyModel[418].rotateAngleY = 1.57079633F;

		bodyModel[419].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454 fuel tank standard
		bodyModel[419].setRotationPoint(8.5F, 4F, -10F);
		bodyModel[419].rotateAngleY = 1.57079633F;

		bodyModel[420].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 455 fuel tank standard
		bodyModel[420].setRotationPoint(8.5F, 7F, -8F);
		bodyModel[420].rotateAngleY = 1.57079633F;

		bodyModel[421].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0.75F, 0F, -0.05F, 4.75F, 0F, -0.05F, 4.75F, 0F, 0.125F, 0.75F, 0F, 0.125F, 0.75F, 0F, -0.05F, 4.75F, 0F, -0.05F, 4.75F, 0F, 0.125F, 0.75F, 0F, 0.125F); // Box 456 fuel tank wp extensions
		bodyModel[421].setRotationPoint(8.5F, 2.75F, -10F);
		bodyModel[421].rotateAngleY = 1.57079633F;

		bodyModel[422].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0.75F, 0F, 0.125F, 4.75F, 0F, 0.125F, 4.75F, 0F, -0.05F, 0.75F, 0F, -0.05F, 0.75F, 0F, 0.125F, 4.75F, 0F, 0.125F, 4.75F, 0F, -0.05F, 0.75F, 0F, -0.05F); // Box 457 fuel tank wp extensions
		bodyModel[422].setRotationPoint(4.5F, 2.75F, -10F);
		bodyModel[422].rotateAngleY = 1.57079633F;

		bodyModel[423].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 458 tall firecracker antenna
		bodyModel[423].setRotationPoint(-17F, -22F, 0F);

		bodyModel[424].addBox(0F, -1F, 0F, 0, 1, 3, 0F); // Box 439 bug deflector cnj, cei, dlw
		bodyModel[424].setRotationPoint(-30F, -14.25F, -1.5F);
		bodyModel[424].rotateAngleZ = -0.41887902F;

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F); // Box 440 spark arrestor cap
		bodyModel[425].setRotationPoint(5F, -21.5F, -2F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F); // Box 441 spark arrestor cap
		bodyModel[426].setRotationPoint(17.5F, -21.5F, -2F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[427].setRotationPoint(-19.25F, -20F, -1F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[428].setRotationPoint(-19.25F, -20.5F, -1F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[429].setRotationPoint(-19.25F, -20.5F, -1F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[430].setRotationPoint(-19.25F, -20.5F, -1F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[431].setRotationPoint(-19.25F, -20.5F, -1F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 409 commander base
		bodyModel[432].setRotationPoint(-18.5F, -20.5F, -0.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[433].setRotationPoint(-18.5F, -21.5F, -0.5F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 449 firecracker antenna
		bodyModel[434].setRotationPoint(-15F, -21F, 0F);

		bodyModel[435].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn sps
		bodyModel[435].setRotationPoint(-16.25F, -20.5F, 4.25F);

		bodyModel[436].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn sps
		bodyModel[436].setRotationPoint(-15F, -20.25F, 5.25F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // box horn sps
		bodyModel[437].setRotationPoint(-15.75F, -20F, 6.25F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // box horn sps
		bodyModel[438].setRotationPoint(-14F, -19.25F, 5.25F);

		bodyModel[439].addShapeBox(0F, 0F, -2F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 454 rear end no diagphram
		bodyModel[439].setRotationPoint(32.5F, 1F, -3.5F);
		bodyModel[439].rotateAngleY = 1.57079633F;

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 455 headlight rear erected outwards
		bodyModel[440].setRotationPoint(32.5F, -12F, -9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 456 rear end no diagphram
		bodyModel[441].setRotationPoint(32.5F, -15F, -4F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457 rear end no diagphram
		bodyModel[442].setRotationPoint(32.5F, -15F, 3F);

		bodyModel[443].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,-0.5F, -1F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458 rear end no diagphram
		bodyModel[443].setRotationPoint(32.5F, -16F, -4F);
		bodyModel[443].rotateAngleY = 1.57079633F;

		bodyModel[444].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, -0.625F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.625F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 459 rear end no diagphram
		bodyModel[444].setRotationPoint(32.5F, -16F, 0F);
		bodyModel[444].rotateAngleY = 1.57079633F;

		bodyModel[445].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 460 rear door step
		bodyModel[445].setRotationPoint(32.5F, 0F, -2F);
		bodyModel[445].rotateAngleY = 1.57079633F;

		bodyModel[446].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 461 rear door top lip thing
		bodyModel[446].setRotationPoint(32.75F, -13.01F, -3F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 462 headlight rear boner lower
		bodyModel[447].setRotationPoint(32.5F, -4F, -9F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F); // Box 463 lifting nuts
		bodyModel[448].setRotationPoint(32.75F, -16F, -3.75F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, -1.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F); // Box 464 lifting nuts
		bodyModel[449].setRotationPoint(32.75F, -16F, 0.75F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 465 headlight rear boner right
		bodyModel[450].setRotationPoint(32.5F, -12F, 7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 466 rear diaphram
		bodyModel[451].setRotationPoint(34F, -14F, -5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 467 rear diaphram
		bodyModel[452].setRotationPoint(34F, -14F, 3F);

		bodyModel[453].addShapeBox(0F, 0F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 468 rear diaphram
		bodyModel[453].setRotationPoint(33.5F, 1F, -5F);
		bodyModel[453].rotateAngleY = 1.57079633F;

		bodyModel[454].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469 rear diaphram
		bodyModel[454].setRotationPoint(34F, -14F, -3F);
		bodyModel[454].rotateAngleY = 1.57079633F;

		bodyModel[455].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 271 horn rf&p, bnb 3 chime
		bodyModel[455].setRotationPoint(-16F, -20F, 4.5F);

		bodyModel[456].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273 horn rf&p
		bodyModel[456].setRotationPoint(-16F, -20F, 2.5F);

		bodyModel[457].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 533 horn rf&p
		bodyModel[457].setRotationPoint(-15F, -21.25F, 4.25F);

		bodyModel[458].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 534 horn rf&p
		bodyModel[458].setRotationPoint(-15F, -21.25F, 3F);

		bodyModel[459].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 535 horn rf&p, bnb 3 chime
		bodyModel[459].setRotationPoint(-15.75F, -20.25F, 3.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F); // Box 478 cull trapezoid spark arrestor
		bodyModel[460].setRotationPoint(4.5F, -22.75F, -1.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F); // Box 479 cull trapezoid spark arrestor
		bodyModel[461].setRotationPoint(17F, -22.75F, -1.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[462].setRotationPoint(-14.75F, -20.5F, -0.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[463].setRotationPoint(-14.75F, -21.5F, -0.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 88 cull mkt beacon platform
		bodyModel[464].setRotationPoint(-15.25F, -19.5F, -1F);

		bodyModel[465].addBox(0F, -2F, 0F, 1, 2, 4, 0F); // Box 483 f7 hitlerstache numberboard
		bodyModel[465].setRotationPoint(-31.9F, -8.5F, -2F);
		bodyModel[465].rotateAngleZ = -0.17453293F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 190 mu plug wp
		bodyModel[466].setRotationPoint(-31.3F, -11.5F, -4.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287 sinclair antenna PC
		bodyModel[467].setRotationPoint(-14F, -20F, 0F);

		bodyModel[468].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486 horn WM
		bodyModel[468].setRotationPoint(-17F, -20F, -5.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 487 horn WM
		bodyModel[469].setRotationPoint(-17F, -20F, -3.5F);

		bodyModel[470].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 488 horn WM
		bodyModel[470].setRotationPoint(-17F, -21.25F, -5.25F);

		bodyModel[471].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 489 horn WM
		bodyModel[471].setRotationPoint(-17F, -21.25F, -4F);

		bodyModel[472].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 490 horn WM
		bodyModel[472].setRotationPoint(-17.25F, -20.25F, -4.5F);

		bodyModel[473].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 491 low MU plug
		bodyModel[473].setRotationPoint(-32.1F, -2.5F, -4.25F);

		bodyModel[474].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 492 "round" spark arrestor
		bodyModel[474].setRotationPoint(4F, -22.75F, -1.5F);

		bodyModel[475].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 493 "round" spark arrestor
		bodyModel[475].setRotationPoint(16.5F, -22.75F, -1.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494 cull L&N super ladder
		bodyModel[476].setRotationPoint(-25.5F, -9F, 10.35F);

		bodyModel[477].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 495 horn gn
		bodyModel[477].setRotationPoint(-17F, -19.25F, 5.25F);

		bodyModel[478].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 496 horn gn
		bodyModel[478].setRotationPoint(-17F, -20.25F, 5.75F);

		bodyModel[479].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 497 horn gn
		bodyModel[479].setRotationPoint(-19F, -20.25F, 4.75F);

		bodyModel[480].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 498 horn gn
		bodyModel[480].setRotationPoint(-18F, -21.25F, 5.25F);

		bodyModel[481].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 499 CNW MU plug
		bodyModel[481].setRotationPoint(-32F, 3.5F, 5F);

		bodyModel[482].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 500 CNW MU plug
		bodyModel[482].setRotationPoint(-32F, 3.5F, -7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 44, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Import Box398 CULL trainphone
		bodyModel[483].setRotationPoint(-12F, -21.5F, -5F);

		bodyModel[484].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 502, bnb 3 chime
		bodyModel[484].setRotationPoint(-16F, -20.5F, 2.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose2
		bodyModel[485].setRotationPoint(-33F, -6F, -1F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574 nose light2 mount
		bodyModel[486].setRotationPoint(-32.75F, -8F, -1F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose2
		bodyModel[487].setRotationPoint(-33F, -8F, -1F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506 tube exhaust
		bodyModel[488].setRotationPoint(4.5F, -23.75F, -1F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507 tube exhaust
		bodyModel[489].setRotationPoint(17F, -23.75F, -1F);

		bodyModel[490].addBox(0F, -2F, 0F, 1, 2, 0, 0F); // Box 508 firecraker bn 626
		bodyModel[490].setRotationPoint(-17F, -19F, -2F);
		bodyModel[490].rotateAngleX = 0.12217305F;

		bodyModel[491].addBox(0F, -2F, 0F, 1, 2, 4, 0F); // Box 509 f3 hitlerstache numberboard
		bodyModel[491].setRotationPoint(-32.25F, -6.5F, -2F);
		bodyModel[491].rotateAngleZ = -0.17453293F;

		bodyModel[492].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405 air whistle clenchfield
		bodyModel[492].setRotationPoint(-15.25F, -20.75F, 2.5F);
		bodyModel[492].rotateAngleY = 1.57079633F;

		bodyModel[493].addBox(0F, 0F, -6F, 8, 2, 6, 0F); // Box 511 CULL maine central mystery cube
		bodyModel[493].setRotationPoint(-8.5F, -21F, -4F);
		bodyModel[493].rotateAngleY = 1.57079633F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 514 MU plug BAR
		bodyModel[494].setRotationPoint(-31.3F, -8.5F, -6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378 bell BAR
		bodyModel[495].setRotationPoint(-21.75F, -20.8F, -0.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380 bell BAR
		bodyModel[496].setRotationPoint(-21.75F, -19.8F, -0.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0.25F, 3F, -1F, 0.25F, 3F, -1F, 0.25F, -2F, -1F, 0.25F); // Box 517 cull bell BAR
		bodyModel[497].setRotationPoint(-21.75F, -20.82F, -0.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 498 BAR beacon
		bodyModel[498].setRotationPoint(-19F, -18.61F, -10.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 499 cull BAR beacon holder
		bodyModel[499].setRotationPoint(-19F, -16.85F, -10.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 89, 57, textureX, textureY, "commander"); // Box 500 BAR beacon
		bodyModel[501] = new ModelRendererTurbo(this, 84, 58, textureX, textureY, "cull"); // Box 501 CULL BAR beacon holder
		bodyModel[502] = new ModelRendererTurbo(this, 76, 61, textureX, textureY); // Box 503 air whistle ACL
		bodyModel[503] = new ModelRendererTurbo(this, 220, 62, textureX, textureY); // Box 504 F3 DYNAMICS
		bodyModel[504] = new ModelRendererTurbo(this, 152, 79, textureX, textureY, "cull"); // Box 505 cull mysterious F9 roof radiator pipes
		bodyModel[505] = new ModelRendererTurbo(this, 77, 83, textureX, textureY, "cull"); // Box 506 cull bn 814 becon platform
		bodyModel[506] = new ModelRendererTurbo(this, 79, 80, textureX, textureY); // Box 409 commander base
		bodyModel[507] = new ModelRendererTurbo(this, 79, 76, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[508] = new ModelRendererTurbo(this, 115, 207, textureX, textureY, "cull"); // Box 188 cull ditchlight holder EMCO
		bodyModel[509] = new ModelRendererTurbo(this, 115, 202, textureX, textureY, "ditch"); // Box 190 ditchlight EMCO
		bodyModel[510] = new ModelRendererTurbo(this, 115, 207, textureX, textureY, "cull"); // Box 511 cull ditchlight holder EMCO
		bodyModel[511] = new ModelRendererTurbo(this, 115, 202, textureX, textureY, "ditch"); // Box 512 ditchlight EMCO
		bodyModel[512] = new ModelRendererTurbo(this, 26, 57, textureX, textureY, "cull"); // Box 512 cull fmsr number mount
		bodyModel[513] = new ModelRendererTurbo(this, 26, 61, textureX, textureY, "cull"); // Box 513 cull fmsr number mount
		bodyModel[514] = new ModelRendererTurbo(this, 68, 80, textureX, textureY); // Box 364 prime base bn
		bodyModel[515] = new ModelRendererTurbo(this, 68, 76, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[516] = new ModelRendererTurbo(this, 68, 76, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[517] = new ModelRendererTurbo(this, 68, 76, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[518] = new ModelRendererTurbo(this, 68, 76, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[519] = new ModelRendererTurbo(this, 68, 84, textureX, textureY, "cull"); // Box 519 cull bn prime support
		bodyModel[520] = new ModelRendererTurbo(this, 1, 103, textureX, textureY); // Box 635 locomotive plate
		bodyModel[521] = new ModelRendererTurbo(this, 122, 207, textureX, textureY, "cull"); // Box 521 cull ditchlight mount
		bodyModel[522] = new ModelRendererTurbo(this, 122, 202, textureX, textureY, "ditch"); // Box 522 ditchlight generic
		bodyModel[523] = new ModelRendererTurbo(this, 122, 202, textureX, textureY, "ditch"); // Box 523 ditchlight generic
		bodyModel[524] = new ModelRendererTurbo(this, 122, 207, textureX, textureY, "cull"); // Box 524 cull ditchlight mount
		bodyModel[525] = new ModelRendererTurbo(this, 40, 78, textureX, textureY); // Box 184 o2 generator
		bodyModel[526] = new ModelRendererTurbo(this, 475, 52, textureX, textureY); // Box 501 cull pipe cooler MILW thing WHY DID THE MOVE THIS HERE
		bodyModel[527] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 768 stripe part cull
		bodyModel[528] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 768 stripe part cull
		bodyModel[529] = new ModelRendererTurbo(this, 76, 114, textureX, textureY); // Box 768 stripe part cull
		bodyModel[530] = new ModelRendererTurbo(this, 76, 108, textureX, textureY); // Box 768 stripe part cull
		bodyModel[531] = new ModelRendererTurbo(this, 76, 102, textureX, textureY); // Box 768 stripe part cull

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 500 BAR beacon
		bodyModel[500].setRotationPoint(-19F, -18.61F, 9.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 501 CULL BAR beacon holder
		bodyModel[501].setRotationPoint(-19F, -16.85F, 9.5F);

		bodyModel[502].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503 air whistle ACL
		bodyModel[502].setRotationPoint(-14.75F, -20.75F, -2.5F);
		bodyModel[502].rotateAngleY = -1.57079633F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 14, 0, 10, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -5F); // Box 504 F3 DYNAMICS
		bodyModel[503].setRotationPoint(-9.5F, -19.01F, -2.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 505 cull mysterious F9 roof radiator pipes
		bodyModel[504].setRotationPoint(-1.5F, -19F, -5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 506 cull bn 814 becon platform
		bodyModel[505].setRotationPoint(-12.25F, -19.5F, -1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 409 commander base
		bodyModel[506].setRotationPoint(-11.75F, -21F, -0.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[507].setRotationPoint(-11.75F, -22F, -0.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 188 cull ditchlight holder EMCO
		bodyModel[508].setRotationPoint(-31.75F, -4F, -6.75F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight EMCO
		bodyModel[509].setRotationPoint(-32F, -4F, -6.75F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 511 cull ditchlight holder EMCO
		bodyModel[510].setRotationPoint(-31.75F, -4F, 4.75F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 512 ditchlight EMCO
		bodyModel[511].setRotationPoint(-32F, -4F, 4.75F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 512 cull fmsr number mount
		bodyModel[512].setRotationPoint(-2F, -17F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513 cull fmsr number mount
		bodyModel[513].setRotationPoint(-2F, -17F, 10F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base bn
		bodyModel[514].setRotationPoint(-19F, -20.5F, -1F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[515].setRotationPoint(-19F, -21.25F, -1F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[516].setRotationPoint(-19F, -21.25F, -1F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[517].setRotationPoint(-19F, -21.25F, -1F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[518].setRotationPoint(-19F, -21.25F, -1F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 519 cull bn prime support
		bodyModel[519].setRotationPoint(-19F, -19.5F, -1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 21.02F, 0F, -0.125F, 21.02F, 0F, -3.125F, 0F, -2F, -3.125F, 0F, -2F, -3.125F, 21.02F, 0F, -3.125F, 21.02F); // Box 635 locomotive plate
		bodyModel[520].setRotationPoint(-19.5F, -9.5F, -11.01F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 521 cull ditchlight mount
		bodyModel[521].setRotationPoint(-32.5F, 0F, -6.75F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 522 ditchlight generic
		bodyModel[522].setRotationPoint(-32.75F, 0F, -6.75F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 523 ditchlight generic
		bodyModel[523].setRotationPoint(-32.75F, 0F, 4.75F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 524 cull ditchlight mount
		bodyModel[524].setRotationPoint(-32.5F, 0F, 4.75F);

		bodyModel[525].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[525].setRotationPoint(-18F, -20.75F, -4F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, -5F, 0F, -0.5F, -5F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0.5F, 0F, -5F); // Box 501 cull pipe cooler MILW thing WHY DID THE MOVE THIS HERE
		bodyModel[526].setRotationPoint(-14F, -20.75F, -3F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0.5F, 0.01F, -6F, 0F, 0.01F, -6F, 0F, 0.01F, 6F, 0.5F, 0.01F, 6F, 0F, -4.88F, -1.5F, 0F, -4.51F, 0F, 0F, -4.51F, 12F, 0F, -4.88F, 10.5F); // Box 768 stripe part cull
		bodyModel[527].setRotationPoint(-24.25F, -14.5F, -8F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.12F, -1.5F, -1F, -1.12F, -1.5F, -1F, -1.12F, 13.5F, 0F, -1.12F, 13.5F, 0F, -0.21F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 15F, 0F, -0.21F, 15F); // Box 768 stripe part cull
		bodyModel[528].setRotationPoint(-24.25F, -14.5F, -8F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.29F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, 16F, 0F, -0.29F, 16F, -0.33F, -0.25F, 0.01F, -0.67F, -0.25F, 0.01F, -0.67F, -0.25F, 17.01F, -0.33F, -0.25F, 17.01F); // Box 768 stripe part cull
		bodyModel[529].setRotationPoint(-24.25F, -13F, -9F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.33F, 0F, -1.99F, 0F, 0.76F, -3F, 0F, 0.76F, 18F, -0.33F, 0F, 19.01F, -0.98F, -2.63F, 0F, 0.98F, -2.69F, 0F, 0.98F, -2.69F, 21F, -0.98F, -2.63F, 21F); // Box 768 stripe part cull
		bodyModel[530].setRotationPoint(-24.25F, -12.25F, -11F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.76F, -3F, -1F, 0.76F, -3F, -1F, 0.76F, 18F, 0F, 0.76F, 18F, -0.98F, -2.69F, 0F, 0.95F, -2.75F, 0F, 0.95F, -2.75F, 21F, -0.98F, -2.69F, 21F); // Box 768 stripe part cull
		bodyModel[531].setRotationPoint(-23.25F, -12.25F, -11F);
	}
	ModelBlombergBnew theTrucc = new ModelBlombergBnew();
	Modelf3a_deets_fncc deets1 = new Modelf3a_deets_fncc();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 356
				|| GetColor(entity) == 16
				|| GetColor(entity) == 11
				|| GetColor(entity) == 8
				|| GetColor(entity) == 4
				|| GetColor(entity) == 5
				|| GetColor(entity) == 12
				|| GetColor(entity) == 10
			    || GetColor(entity) == 19
				|| GetColor(entity) == 20
				|| GetColor(entity) == 21
				|| GetColor(entity) == 22
				|| GetColor(entity) == 31) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.25, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
			if (((AbstractTrains) entity).getColor() == 31){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/f3a_fncc_deets.png"));
				GL11.glPushMatrix();
				deets1.render(entity, f, f1, f2, f3, f4, f5);
				GL11.glPopMatrix();
			}
		} else if (GetColor(entity) == 832) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Espee.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.25, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//front
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glTranslated(1.25, -0.025, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);//rear
			GL11.glPopMatrix();
		}
	}
}