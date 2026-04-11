//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD50-60
// Model Creator: Bida
// Created on: 04.12.2022 - 21:43:19
// Last changed on: 04.12.2022 - 21:43:19

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Late;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Mid;
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

import java.util.ArrayList;

public class ModelSD50 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD50() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[485];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[1] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[2] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[3] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 243, 82, textureX, textureY); // Box 170
		bodyModel[8] = new ModelRendererTurbo(this, 211, 237, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 294, 108, textureX, textureY); // Box 163
		bodyModel[11] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 409
		bodyModel[12] = new ModelRendererTurbo(this, 341, 70, textureX, textureY); // Box 129
		bodyModel[13] = new ModelRendererTurbo(this, 338, 108, textureX, textureY); // Box 130
		bodyModel[14] = new ModelRendererTurbo(this, 337, 70, textureX, textureY); // Box 133
		bodyModel[15] = new ModelRendererTurbo(this, 335, 108, textureX, textureY); // Box 134
		bodyModel[16] = new ModelRendererTurbo(this, 396, 108, textureX, textureY); // Box 166
		bodyModel[17] = new ModelRendererTurbo(this, 333, 207, textureX, textureY); // Box 408
		bodyModel[18] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 192
		bodyModel[19] = new ModelRendererTurbo(this, 373, 70, textureX, textureY); // Box 193
		bodyModel[20] = new ModelRendererTurbo(this, 353, 108, textureX, textureY); // Box 194
		bodyModel[21] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // Box 195
		bodyModel[22] = new ModelRendererTurbo(this, 53, 151, textureX, textureY); // Box 164
		bodyModel[23] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 259
		bodyModel[24] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[25] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[26] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[27] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[28] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 274
		bodyModel[29] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 272
		bodyModel[30] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 273
		bodyModel[31] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 400
		bodyModel[32] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 401
		bodyModel[33] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[34] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 452
		bodyModel[35] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[36] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[37] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[38] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[39] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 48, 136, textureX, textureY); // Box 143
		bodyModel[41] = new ModelRendererTurbo(this, 11, 137, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 51, 137, textureX, textureY); // Box 63
		bodyModel[43] = new ModelRendererTurbo(this, 73, 107, textureX, textureY); // Box 363
		bodyModel[44] = new ModelRendererTurbo(this, 61, 107, textureX, textureY); // Box 870
		bodyModel[45] = new ModelRendererTurbo(this, 14, 136, textureX, textureY); // Box 559
		bodyModel[46] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[47] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[48] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[50] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[51] = new ModelRendererTurbo(this, 367, 151, textureX, textureY); // Box 164
		bodyModel[52] = new ModelRendererTurbo(this, 399, 151, textureX, textureY); // Box 259
		bodyModel[53] = new ModelRendererTurbo(this, 374, 149, textureX, textureY); // Box 261
		bodyModel[54] = new ModelRendererTurbo(this, 392, 149, textureX, textureY); // Box 262
		bodyModel[55] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 264
		bodyModel[56] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 265
		bodyModel[57] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 541
		bodyModel[58] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 542
		bodyModel[59] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 543
		bodyModel[60] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 544
		bodyModel[61] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 545
		bodyModel[62] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 546
		bodyModel[63] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 553
		bodyModel[64] = new ModelRendererTurbo(this, 70, 134, textureX, textureY); // Box 554
		bodyModel[65] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 555
		bodyModel[66] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 556
		bodyModel[67] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 557
		bodyModel[68] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 558
		bodyModel[69] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 61
		bodyModel[70] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 63
		bodyModel[71] = new ModelRendererTurbo(this, 404, 168, textureX, textureY); // Box 560
		bodyModel[72] = new ModelRendererTurbo(this, 370, 168, textureX, textureY); // Box 561
		bodyModel[73] = new ModelRendererTurbo(this, 459, 71, textureX, textureY); // Box 203
		bodyModel[74] = new ModelRendererTurbo(this, 335, 123, textureX, textureY); // Box 489
		bodyModel[75] = new ModelRendererTurbo(this, 310, 153, textureX, textureY); // Box 278
		bodyModel[76] = new ModelRendererTurbo(this, 311, 159, textureX, textureY); // Box 281
		bodyModel[77] = new ModelRendererTurbo(this, 339, 127, textureX, textureY); // Box 288
		bodyModel[78] = new ModelRendererTurbo(this, 311, 124, textureX, textureY); // Box 315
		bodyModel[79] = new ModelRendererTurbo(this, 312, 131, textureX, textureY); // Box 316
		bodyModel[80] = new ModelRendererTurbo(this, 258, 129, textureX, textureY); // Box 559
		bodyModel[81] = new ModelRendererTurbo(this, 279, 164, textureX, textureY); // Box 564
		bodyModel[82] = new ModelRendererTurbo(this, 282, 176, textureX, textureY); // Box 565
		bodyModel[83] = new ModelRendererTurbo(this, 275, 160, textureX, textureY); // Box 566
		bodyModel[84] = new ModelRendererTurbo(this, 281, 171, textureX, textureY); // Box 567
		bodyModel[85] = new ModelRendererTurbo(this, 281, 166, textureX, textureY); // Box 568
		bodyModel[86] = new ModelRendererTurbo(this, 306, 171, textureX, textureY); // Box 569
		bodyModel[87] = new ModelRendererTurbo(this, 307, 176, textureX, textureY); // Box 570
		bodyModel[88] = new ModelRendererTurbo(this, 229, 149, textureX, textureY); // Box 571
		bodyModel[89] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 572
		bodyModel[90] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 573
		bodyModel[91] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 574
		bodyModel[92] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 576
		bodyModel[93] = new ModelRendererTurbo(this, 256, 156, textureX, textureY); // Box 577
		bodyModel[94] = new ModelRendererTurbo(this, 330, 147, textureX, textureY); // Box 19
		bodyModel[95] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 560
		bodyModel[96] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box airtank earluy
		bodyModel[97] = new ModelRendererTurbo(this, 272, 124, textureX, textureY); // Box airtank earluy
		bodyModel[98] = new ModelRendererTurbo(this, 231, 153, textureX, textureY); // Box 575
		bodyModel[99] = new ModelRendererTurbo(this, 25, 83, textureX, textureY, "cull"); // Box 268 anticlimber a cull all ainticlimbers
		bodyModel[100] = new ModelRendererTurbo(this, 50, 96, textureX, textureY, "cull"); // Box 269 anticlimber a
		bodyModel[101] = new ModelRendererTurbo(this, 41, 86, textureX, textureY, "cull"); // Box 431 anticlimber a
		bodyModel[102] = new ModelRendererTurbo(this, 383, 183, textureX, textureY, "cull"); // Box 394 anticlimber a
		bodyModel[103] = new ModelRendererTurbo(this, 362, 178, textureX, textureY, "cull"); // Box 395 anticlimber a
		bodyModel[104] = new ModelRendererTurbo(this, 393, 178, textureX, textureY, "cull"); // Box 396 anticlimber a
		bodyModel[105] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[106] = new ModelRendererTurbo(this, 108, 58, textureX, textureY, "cull"); // Box 346 cull rachet holder
		bodyModel[107] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[108] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 352
		bodyModel[109] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 353
		bodyModel[110] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 354
		bodyModel[111] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 356
		bodyModel[112] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 357
		bodyModel[113] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 355
		bodyModel[114] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 71 markerlight front
		bodyModel[115] = new ModelRendererTurbo(this, 1, 40, textureX, textureY, "lamp"); // Box 1208 makrerlight front
		bodyModel[116] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 1251
		bodyModel[117] = new ModelRendererTurbo(this, 106, 52, textureX, textureY); // Box 355 brakewheel
		bodyModel[118] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 545 headlight nose high b
		bodyModel[119] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 546 headlight nose high a
		bodyModel[120] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 547 headlight nose low a
		bodyModel[121] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 548 headlight nose low b
		bodyModel[122] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[123] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[124] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[125] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[126] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[127] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[128] = new ModelRendererTurbo(this, 36, 41, textureX, textureY); // Box 223
		bodyModel[129] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[130] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[131] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[132] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front cab
		bodyModel[133] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front cab
		bodyModel[134] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[135] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[136] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[137] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[138] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[139] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[140] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[141] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[142] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[143] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[144] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[145] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[146] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[147] = new ModelRendererTurbo(this, 133, 90, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[148] = new ModelRendererTurbo(this, 133, 90, textureX, textureY, "lamp"); // Box 118 numberboard front
		bodyModel[149] = new ModelRendererTurbo(this, 65, 55, textureX, textureY); // Box 133
		bodyModel[150] = new ModelRendererTurbo(this, 247, 104, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[151] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 245
		bodyModel[152] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[153] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[154] = new ModelRendererTurbo(this, 76, 122, textureX, textureY); // Box 408
		bodyModel[155] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[156] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283 this isnt used usually
		bodyModel[157] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[158] = new ModelRendererTurbo(this, 44, 65, textureX, textureY); // Box 439
		bodyModel[159] = new ModelRendererTurbo(this, 491, 71, textureX, textureY); // Box 318
		bodyModel[160] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[161] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[162] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[163] = new ModelRendererTurbo(this, 323, 34, textureX, textureY); // Box 34
		bodyModel[164] = new ModelRendererTurbo(this, 467, 94, textureX, textureY); // Box 7
		bodyModel[165] = new ModelRendererTurbo(this, 488, 94, textureX, textureY); // Box 6
		bodyModel[166] = new ModelRendererTurbo(this, 476, 75, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[167] = new ModelRendererTurbo(this, 476, 75, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[168] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 71 markerlight rear low
		bodyModel[169] = new ModelRendererTurbo(this, 454, 89, textureX, textureY, "lamp"); // Box 1208 makrerlight rear low
		bodyModel[170] = new ModelRendererTurbo(this, 460, 84, textureX, textureY, "lamp"); // Box 71 markerlight rear high
		bodyModel[171] = new ModelRendererTurbo(this, 460, 84, textureX, textureY, "lamp"); // Box 1208 makrerlight rear high
		bodyModel[172] = new ModelRendererTurbo(this, 228, 92, textureX, textureY); // Box 314 mega bubble
		bodyModel[173] = new ModelRendererTurbo(this, 226, 84, textureX, textureY); // Box 132 mega bubble
		bodyModel[174] = new ModelRendererTurbo(this, 256, 36, textureX, textureY); // Box 131 mega bubble
		bodyModel[175] = new ModelRendererTurbo(this, 226, 72, textureX, textureY); // Box 130 mega bubble
		bodyModel[176] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[177] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[178] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[179] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[180] = new ModelRendererTurbo(this, 183, 2, textureX, textureY, "cull"); // Box 1007 cull
		bodyModel[181] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 303
		bodyModel[182] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 304
		bodyModel[183] = new ModelRendererTurbo(this, 116, 107, textureX, textureY); // Box 305
		bodyModel[184] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 836
		bodyModel[185] = new ModelRendererTurbo(this, 289, 40, textureX, textureY); // Box 668
		bodyModel[186] = new ModelRendererTurbo(this, 282, 21, textureX, textureY); // Box 669 dont forget to texture the correct dynamic grid!
		bodyModel[187] = new ModelRendererTurbo(this, 242, 40, textureX, textureY); // Box 670 dont forget to texture the correct dynamic grid!
		bodyModel[188] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Box 43
		bodyModel[189] = new ModelRendererTurbo(this, 100, 58, textureX, textureY); // Box 43
		bodyModel[190] = new ModelRendererTurbo(this, 114, 217, textureX, textureY); // Box 673 dynamic grid early
		bodyModel[191] = new ModelRendererTurbo(this, 113, 226, textureX, textureY); // Box 674 dynamic grid late
		bodyModel[192] = new ModelRendererTurbo(this, 195, 219, textureX, textureY); // Box 675
		bodyModel[193] = new ModelRendererTurbo(this, 195, 213, textureX, textureY); // Box 676
		bodyModel[194] = new ModelRendererTurbo(this, 144, 212, textureX, textureY, "cull"); // Box 677 cull vent sus
		bodyModel[195] = new ModelRendererTurbo(this, 333, 22, textureX, textureY); // Box 286
		bodyModel[196] = new ModelRendererTurbo(this, 333, 22, textureX, textureY); // Box 285
		bodyModel[197] = new ModelRendererTurbo(this, 57, 110, textureX, textureY); // Box 444
		bodyModel[198] = new ModelRendererTurbo(this, 60, 103, textureX, textureY); // Box 445
		bodyModel[199] = new ModelRendererTurbo(this, 60, 112, textureX, textureY); // Box 446
		bodyModel[200] = new ModelRendererTurbo(this, 64, 104, textureX, textureY); // Box 447
		bodyModel[201] = new ModelRendererTurbo(this, 57, 110, textureX, textureY); // Box 692
		bodyModel[202] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 298
		bodyModel[203] = new ModelRendererTurbo(this, 332, 7, textureX, textureY); // Box 700
		bodyModel[204] = new ModelRendererTurbo(this, 308, 3, textureX, textureY); // Box 273
		bodyModel[205] = new ModelRendererTurbo(this, 286, 2, textureX, textureY); // ehaust silencer
		bodyModel[206] = new ModelRendererTurbo(this, 472, 12, textureX, textureY); // Box 704
		bodyModel[207] = new ModelRendererTurbo(this, 414, 12, textureX, textureY); // Box 705
		bodyModel[208] = new ModelRendererTurbo(this, 443, 12, textureX, textureY); // Box 706
		bodyModel[209] = new ModelRendererTurbo(this, 476, 5, textureX, textureY); // Box 715
		bodyModel[210] = new ModelRendererTurbo(this, 418, 5, textureX, textureY); // Box 234
		bodyModel[211] = new ModelRendererTurbo(this, 447, 5, textureX, textureY); // Box 235
		bodyModel[212] = new ModelRendererTurbo(this, 159, 177, textureX, textureY); // Box 527 cab backpannel
		bodyModel[213] = new ModelRendererTurbo(this, 144, 81, textureX, textureY); // Box 80
		bodyModel[214] = new ModelRendererTurbo(this, 131, 59, textureX, textureY); // Box 81
		bodyModel[215] = new ModelRendererTurbo(this, 131, 62, textureX, textureY); // Box 82
		bodyModel[216] = new ModelRendererTurbo(this, 130, 65, textureX, textureY); // Box 83
		bodyModel[217] = new ModelRendererTurbo(this, 130, 77, textureX, textureY); // Box 84
		bodyModel[218] = new ModelRendererTurbo(this, 130, 74, textureX, textureY); // Box 85
		bodyModel[219] = new ModelRendererTurbo(this, 144, 78, textureX, textureY); // Box 357
		bodyModel[220] = new ModelRendererTurbo(this, 130, 71, textureX, textureY); // Box 356
		bodyModel[221] = new ModelRendererTurbo(this, 130, 68, textureX, textureY); // Box 355
		bodyModel[222] = new ModelRendererTurbo(this, 139, 68, textureX, textureY); // Box 354
		bodyModel[223] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[224] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[225] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[226] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[227] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[228] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[229] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[230] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[231] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[232] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[233] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[234] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[235] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[236] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[237] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[238] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[239] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[240] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[241] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[242] = new ModelRendererTurbo(this, 164, 86, textureX, textureY); // Box 332
		bodyModel[243] = new ModelRendererTurbo(this, 164, 83, textureX, textureY); // Box 331
		bodyModel[244] = new ModelRendererTurbo(this, 144, 75, textureX, textureY); // Box 330
		bodyModel[245] = new ModelRendererTurbo(this, 163, 80, textureX, textureY); // Box 329
		bodyModel[246] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 328
		bodyModel[247] = new ModelRendererTurbo(this, 162, 74, textureX, textureY); // Box 327
		bodyModel[248] = new ModelRendererTurbo(this, 414, 6, textureX, textureY, "cull"); // Box 277 cull
		bodyModel[249] = new ModelRendererTurbo(this, 420, 2, textureX, textureY); // Box 409 commander base
		bodyModel[250] = new ModelRendererTurbo(this, 415, 2, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[251] = new ModelRendererTurbo(this, 197, 15, textureX, textureY); // Box 245
		bodyModel[252] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 78
		bodyModel[253] = new ModelRendererTurbo(this, 198, 19, textureX, textureY); // Box 74
		bodyModel[254] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 114
		bodyModel[255] = new ModelRendererTurbo(this, 152, 82, textureX, textureY); // Box 284
		bodyModel[256] = new ModelRendererTurbo(this, 153, 79, textureX, textureY); // Box 285
		bodyModel[257] = new ModelRendererTurbo(this, 152, 76, textureX, textureY); // Box 286
		bodyModel[258] = new ModelRendererTurbo(this, 152, 73, textureX, textureY); // Box 287
		bodyModel[259] = new ModelRendererTurbo(this, 152, 70, textureX, textureY); // Box 288
		bodyModel[260] = new ModelRendererTurbo(this, 153, 67, textureX, textureY); // Box 289
		bodyModel[261] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[262] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[263] = new ModelRendererTurbo(this, 176, 72, textureX, textureY); // Box 364
		bodyModel[264] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[265] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[266] = new ModelRendererTurbo(this, 176, 65, textureX, textureY); // Box 361
		bodyModel[267] = new ModelRendererTurbo(this, 173, 51, textureX, textureY); // Box 184 o2 generator
		bodyModel[268] = new ModelRendererTurbo(this, 249, 34, textureX, textureY); // Box 409 commander base
		bodyModel[269] = new ModelRendererTurbo(this, 249, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[270] = new ModelRendererTurbo(this, 244, 34, textureX, textureY); // Box 409 commander base
		bodyModel[271] = new ModelRendererTurbo(this, 244, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[272] = new ModelRendererTurbo(this, 249, 37, textureX, textureY); // Box 301
		bodyModel[273] = new ModelRendererTurbo(this, 244, 37, textureX, textureY); // Box 302
		bodyModel[274] = new ModelRendererTurbo(this, 250, 5, textureX, textureY); // Box 279
		bodyModel[275] = new ModelRendererTurbo(this, 332, 71, textureX, textureY); // Box 293
		bodyModel[276] = new ModelRendererTurbo(this, 14, 179, textureX, textureY); // Box 282
		bodyModel[277] = new ModelRendererTurbo(this, 53, 176, textureX, textureY); // Box 283
		bodyModel[278] = new ModelRendererTurbo(this, 27, 177, textureX, textureY); // Box 4
		bodyModel[279] = new ModelRendererTurbo(this, 42, 181, textureX, textureY); // Box 448
		bodyModel[280] = new ModelRendererTurbo(this, 66, 174, textureX, textureY); // Box 322
		bodyModel[281] = new ModelRendererTurbo(this, 81, 178, textureX, textureY); // Box 323
		bodyModel[282] = new ModelRendererTurbo(this, 426, 206, textureX, textureY); // Box 280
		bodyModel[283] = new ModelRendererTurbo(this, 81, 168, textureX, textureY); // Box 285
		bodyModel[284] = new ModelRendererTurbo(this, 325, 138, textureX, textureY); // Box 312
		bodyModel[285] = new ModelRendererTurbo(this, 330, 138, textureX, textureY); // Box 313
		bodyModel[286] = new ModelRendererTurbo(this, 254, 68, textureX, textureY); // Box 314 poo pipe
		bodyModel[287] = new ModelRendererTurbo(this, 247, 71, textureX, textureY); // Box 315
		bodyModel[288] = new ModelRendererTurbo(this, 19, 37, textureX, textureY); // Box 316
		bodyModel[289] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[290] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[291] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[292] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[293] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[294] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[295] = new ModelRendererTurbo(this, 247, 5, textureX, textureY); // Box 323
		bodyModel[296] = new ModelRendererTurbo(this, 244, 5, textureX, textureY); // Box 325
		bodyModel[297] = new ModelRendererTurbo(this, 241, 5, textureX, textureY); // Box 326
		bodyModel[298] = new ModelRendererTurbo(this, 161, 108, textureX, textureY); // Box 36 cr society square
		bodyModel[299] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 450
		bodyModel[300] = new ModelRendererTurbo(this, 81, 156, textureX, textureY); // Box 271
		bodyModel[301] = new ModelRendererTurbo(this, 81, 156, textureX, textureY); // Box 272
		bodyModel[302] = new ModelRendererTurbo(this, 82, 151, textureX, textureY, BoxName.ditch); // Box 273 lamp ditchlight front
		bodyModel[303] = new ModelRendererTurbo(this, 82, 151, textureX, textureY, BoxName.ditch); // Box 274 lamp ditchlight front
		bodyModel[304] = new ModelRendererTurbo(this, 440, 184, textureX, textureY); // Box 271
		bodyModel[305] = new ModelRendererTurbo(this, 440, 184, textureX, textureY); // Box 272
		bodyModel[306] = new ModelRendererTurbo(this, 441, 179, textureX, textureY, BoxName.ditch); // Box 273 lamp ditchlight front
		bodyModel[307] = new ModelRendererTurbo(this, 441, 179, textureX, textureY, BoxName.ditch); // Box 274 lamp ditchlight front
		bodyModel[308] = new ModelRendererTurbo(this, 5, 175, textureX, textureY); // Box 396
		bodyModel[309] = new ModelRendererTurbo(this, 5, 187, textureX, textureY); // Box 397
		bodyModel[310] = new ModelRendererTurbo(this, 19, 170, textureX, textureY, BoxName.ditch); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[311] = new ModelRendererTurbo(this, 19, 170, textureX, textureY, BoxName.ditch); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[312] = new ModelRendererTurbo(this, 5, 170, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[313] = new ModelRendererTurbo(this, 5, 182, textureX, textureY); // Box 399 not a ditchlight will not glow
		bodyModel[314] = new ModelRendererTurbo(this, 452, 32, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[315] = new ModelRendererTurbo(this, 245, 42, textureX, textureY); // Box 270 filter box thinggy
		bodyModel[316] = new ModelRendererTurbo(this, 239, 34, textureX, textureY); // Box 409 commander base
		bodyModel[317] = new ModelRendererTurbo(this, 139, 77, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[318] = new ModelRendererTurbo(this, 139, 74, textureX, textureY); // Box 347
		bodyModel[319] = new ModelRendererTurbo(this, 141, 64, textureX, textureY); // Box 348
		bodyModel[320] = new ModelRendererTurbo(this, 140, 58, textureX, textureY); // Box 349
		bodyModel[321] = new ModelRendererTurbo(this, 141, 61, textureX, textureY); // Box 350
		bodyModel[322] = new ModelRendererTurbo(this, 151, 58, textureX, textureY); // Box 351
		bodyModel[323] = new ModelRendererTurbo(this, 144, 71, textureX, textureY); // Box 352
		bodyModel[324] = new ModelRendererTurbo(this, 152, 64, textureX, textureY); // Box 353
		bodyModel[325] = new ModelRendererTurbo(this, 152, 61, textureX, textureY); // Box 354
		bodyModel[326] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime4); // Box 9 PRIME-4
		bodyModel[327] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime2); // Box 8 PRIME-2
		bodyModel[328] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime3); // Box 7 PRIME-3
		bodyModel[329] = new ModelRendererTurbo(this, 199, 7, textureX, textureY, BoxName.prime1); // Box 6 PRIME-1
		bodyModel[330] = new ModelRendererTurbo(this, 199, 11, textureX, textureY); // Box 421 prime base
		bodyModel[331] = new ModelRendererTurbo(this, 225, 31, textureX, textureY); // Box 570
		bodyModel[332] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[333] = new ModelRendererTurbo(this, 220, 37, textureX, textureY); // Box 895
		bodyModel[334] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 894
		bodyModel[335] = new ModelRendererTurbo(this, 257, 7, textureX, textureY); // Box 415
		bodyModel[336] = new ModelRendererTurbo(this, 257, 5, textureX, textureY); // Box 355
		bodyModel[337] = new ModelRendererTurbo(this, 125, 51, textureX, textureY, "cull"); // Box 561 cull ptc antenna shiz
		bodyModel[338] = new ModelRendererTurbo(this, 144, 51, textureX, textureY, "cull"); // Box 562 cull ptc antenna shiz
		bodyModel[339] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 563
		bodyModel[340] = new ModelRendererTurbo(this, 327, 218, textureX, textureY); // Box 564
		bodyModel[341] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 360
		bodyModel[342] = new ModelRendererTurbo(this, 92, 163, textureX, textureY); // Box 361
		bodyModel[343] = new ModelRendererTurbo(this, 92, 173, textureX, textureY); // Box 362
		bodyModel[344] = new ModelRendererTurbo(this, 168, 3, textureX, textureY); // Box 363 csx bit
		bodyModel[345] = new ModelRendererTurbo(this, 36, 56, textureX, textureY, "lamp"); // Box 364 markerlight bugeye front
		bodyModel[346] = new ModelRendererTurbo(this, 36, 56, textureX, textureY, "lamp"); // Box 364 markerlight bugeye front
		bodyModel[347] = new ModelRendererTurbo(this, 484, 77, textureX, textureY, "lamp"); // Box 364 markerlight bugeye rear
		bodyModel[348] = new ModelRendererTurbo(this, 484, 77, textureX, textureY, "lamp"); // Box 364 markerlight bugeye rear
		bodyModel[349] = new ModelRendererTurbo(this, 410, 174, textureX, textureY); // Box 392
		bodyModel[350] = new ModelRendererTurbo(this, 422, 190, textureX, textureY); // Box 393
		bodyModel[351] = new ModelRendererTurbo(this, 408, 179, textureX, textureY); // Box 394 not a ditchlight will not glow
		bodyModel[352] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 395 not a ditchlight will not glow
		bodyModel[353] = new ModelRendererTurbo(this, 415, 179, textureX, textureY, BoxName.ditch); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[354] = new ModelRendererTurbo(this, 417, 174, textureX, textureY, BoxName.ditch); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[355] = new ModelRendererTurbo(this, 268, 68, textureX, textureY); // Box 380
		bodyModel[356] = new ModelRendererTurbo(this, 263, 68, textureX, textureY); // Box 381
		bodyModel[357] = new ModelRendererTurbo(this, 441, 188, textureX, textureY); // Box 1163
		bodyModel[358] = new ModelRendererTurbo(this, 424, 185, textureX, textureY); // Box 1164
		bodyModel[359] = new ModelRendererTurbo(this, 456, 191, textureX, textureY); // Box 1165
		bodyModel[360] = new ModelRendererTurbo(this, 409, 188, textureX, textureY); // Box 1166
		bodyModel[361] = new ModelRendererTurbo(this, 34, 93, textureX, textureY, "cull"); // Box 386 anticlimber b
		bodyModel[362] = new ModelRendererTurbo(this, 46, 82, textureX, textureY, "cull"); // Box 387 anticlimber b
		bodyModel[363] = new ModelRendererTurbo(this, 176, 79, textureX, textureY); // Box 388 blacklands rr sideways ac
		bodyModel[364] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 389 blacklands rr sideways ac
		bodyModel[365] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 390 blacklands rr sideways ac
		bodyModel[366] = new ModelRendererTurbo(this, 219, 26, textureX, textureY); // Box 409 commander base csx
		bodyModel[367] = new ModelRendererTurbo(this, 219, 22, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx
		bodyModel[368] = new ModelRendererTurbo(this, 219, 26, textureX, textureY); // Box 409 commander base csx
		bodyModel[369] = new ModelRendererTurbo(this, 219, 22, textureX, textureY, BoxName.commander); // Box 410 commander beacon csx
		bodyModel[370] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[371] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[372] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[373] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[374] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[375] = new ModelRendererTurbo(this, 97, 125, textureX, textureY); // Box 267
		bodyModel[376] = new ModelRendererTurbo(this, 104, 136, textureX, textureY); // Box 260
		bodyModel[377] = new ModelRendererTurbo(this, 359, 3, textureX, textureY); // Box 402 dyn fan
		bodyModel[378] = new ModelRendererTurbo(this, 253, 5, textureX, textureY); // Box 403 cnw antenna
		bodyModel[379] = new ModelRendererTurbo(this, 252, 8, textureX, textureY, "cull"); // Box 404 cull cnw antenna
		bodyModel[380] = new ModelRendererTurbo(this, 234, 34, textureX, textureY); // Box 409 commander base
		bodyModel[381] = new ModelRendererTurbo(this, 234, 30, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[382] = new ModelRendererTurbo(this, 257, 3, textureX, textureY); // Box 407
		bodyModel[383] = new ModelRendererTurbo(this, 108, 185, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[384] = new ModelRendererTurbo(this, 102, 183, textureX, textureY); // Box 307 spedo
		bodyModel[385] = new ModelRendererTurbo(this, 441, 164, textureX, textureY, "cull"); // Box 386 anticlimber b
		bodyModel[386] = new ModelRendererTurbo(this, 418, 164, textureX, textureY, "cull"); // Box 387 anticlimber b
		bodyModel[387] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 416
		bodyModel[388] = new ModelRendererTurbo(this, 446, 208, textureX, textureY); // Box 417
		bodyModel[389] = new ModelRendererTurbo(this, 415, 204, textureX, textureY); // Box 418
		bodyModel[390] = new ModelRendererTurbo(this, 437, 208, textureX, textureY); // Box 419
		bodyModel[391] = new ModelRendererTurbo(this, 459, 208, textureX, textureY); // Box 420
		bodyModel[392] = new ModelRendererTurbo(this, 470, 206, textureX, textureY); // Box 421
		bodyModel[393] = new ModelRendererTurbo(this, 431, 179, textureX, textureY); // Box 350 mu plug
		bodyModel[394] = new ModelRendererTurbo(this, 424, 179, textureX, textureY); // Box 351 mu plug
		bodyModel[395] = new ModelRendererTurbo(this, 481, 198, textureX, textureY); // Box 352
		bodyModel[396] = new ModelRendererTurbo(this, 431, 174, textureX, textureY); // Box 350 mu plug
		bodyModel[397] = new ModelRendererTurbo(this, 424, 174, textureX, textureY); // Box 351 mu plug
		bodyModel[398] = new ModelRendererTurbo(this, 69, 150, textureX, textureY); // Box 352
		bodyModel[399] = new ModelRendererTurbo(this, 205, 76, textureX, textureY); // Box 271 your either HI or KCS to use this
		bodyModel[400] = new ModelRendererTurbo(this, 205, 81, textureX, textureY); // Box 271 your either HI or KCS to use this
		bodyModel[401] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 430
		bodyModel[402] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 431
		bodyModel[403] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 432
		bodyModel[404] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 243
		bodyModel[405] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 250
		bodyModel[406] = new ModelRendererTurbo(this, 370, 160, textureX, textureY); // Box 542
		bodyModel[407] = new ModelRendererTurbo(this, 404, 160, textureX, textureY); // Box 543
		bodyModel[408] = new ModelRendererTurbo(this, 207, 136, textureX, textureY); // Box 316
		bodyModel[409] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[410] = new ModelRendererTurbo(this, 482, 173, textureX, textureY); // Box 441
		bodyModel[411] = new ModelRendererTurbo(this, 465, 173, textureX, textureY); // Box 442
		bodyModel[412] = new ModelRendererTurbo(this, 478, 174, textureX, textureY); // Box 443
		bodyModel[413] = new ModelRendererTurbo(this, 61, 109, textureX, textureY); // Box 444
		bodyModel[414] = new ModelRendererTurbo(this, 504, 182, textureX, textureY); // Box 445
		bodyModel[415] = new ModelRendererTurbo(this, 73, 109, textureX, textureY); // Box 446
		bodyModel[416] = new ModelRendererTurbo(this, 500, 181, textureX, textureY); // Box 447
		bodyModel[417] = new ModelRendererTurbo(this, 491, 78, textureX, textureY); // Box 409 commander base
		bodyModel[418] = new ModelRendererTurbo(this, 491, 74, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[419] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 452
		bodyModel[420] = new ModelRendererTurbo(this, 133, 134, textureX, textureY); // Box 453
		bodyModel[421] = new ModelRendererTurbo(this, 139, 71, textureX, textureY); // Box 226 pw based moment
		bodyModel[422] = new ModelRendererTurbo(this, 163, 64, textureX, textureY); // Box 227 pw based moment
		bodyModel[423] = new ModelRendererTurbo(this, 162, 58, textureX, textureY); // Box 228 pw based moment
		bodyModel[424] = new ModelRendererTurbo(this, 163, 61, textureX, textureY); // Box 229 pw based moment
		bodyModel[425] = new ModelRendererTurbo(this, 54, 127, textureX, textureY); // Box 81
		bodyModel[426] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[427] = new ModelRendererTurbo(this, 48, 128, textureX, textureY); // Box 540
		bodyModel[428] = new ModelRendererTurbo(this, 14, 128, textureX, textureY); // Box 541
		bodyModel[429] = new ModelRendererTurbo(this, 126, 134, textureX, textureY); // Box 613
		bodyModel[430] = new ModelRendererTurbo(this, 99, 136, textureX, textureY); // Box 614
		bodyModel[431] = new ModelRendererTurbo(this, 292, 214, textureX, textureY); // Box 615 htcr truck mount
		bodyModel[432] = new ModelRendererTurbo(this, 283, 219, textureX, textureY); // Box 616 htcr truck mount
		bodyModel[433] = new ModelRendererTurbo(this, 283, 209, textureX, textureY); // Box 617 htcr truck mount
		bodyModel[434] = new ModelRendererTurbo(this, 283, 219, textureX, textureY); // Box 618 htcr truck mount
		bodyModel[435] = new ModelRendererTurbo(this, 292, 214, textureX, textureY); // Box 619 htcr truck mount
		bodyModel[436] = new ModelRendererTurbo(this, 284, 206, textureX, textureY); // Box 620 htcr truck mount
		bodyModel[437] = new ModelRendererTurbo(this, 285, 214, textureX, textureY); // Box 621 htcr truck mount
		bodyModel[438] = new ModelRendererTurbo(this, 283, 225, textureX, textureY); // Box 622 htcr truck mount
		bodyModel[439] = new ModelRendererTurbo(this, 254, 211, textureX, textureY); // Box 623 htcr truck mount
		bodyModel[440] = new ModelRendererTurbo(this, 283, 225, textureX, textureY); // Box 624 htcr truck mount
		bodyModel[441] = new ModelRendererTurbo(this, 285, 214, textureX, textureY); // Box 625 htcr truck mount
		bodyModel[442] = new ModelRendererTurbo(this, 284, 206, textureX, textureY); // Box 626 htcr truck mount
		bodyModel[443] = new ModelRendererTurbo(this, 106, 86, textureX, textureY); // Box 1088
		bodyModel[444] = new ModelRendererTurbo(this, 104, 91, textureX, textureY); // Box 1087
		bodyModel[445] = new ModelRendererTurbo(this, 82, 86, textureX, textureY); // Box 5
		bodyModel[446] = new ModelRendererTurbo(this, 81, 91, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[447] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Box 453
		bodyModel[448] = new ModelRendererTurbo(this, 132, 182, textureX, textureY); // Box 412 cs
		bodyModel[449] = new ModelRendererTurbo(this, 132, 202, textureX, textureY); // Box 413 cs
		bodyModel[450] = new ModelRendererTurbo(this, 144, 181, textureX, textureY); // Box 86 cs
		bodyModel[451] = new ModelRendererTurbo(this, 132, 195, textureX, textureY); // Box 531 cs
		bodyModel[452] = new ModelRendererTurbo(this, 489, 21, textureX, textureY); // Box 457 fans sd49/sd59
		bodyModel[453] = new ModelRendererTurbo(this, 482, 45, textureX, textureY); // Box 457 fans sd49/sd59
		bodyModel[454] = new ModelRendererTurbo(this, 489, 28, textureX, textureY); // Box 457 fans sd49/sd59
		bodyModel[455] = new ModelRendererTurbo(this, 482, 36, textureX, textureY); // Box 457 fans sd49/sd59
		bodyModel[456] = new ModelRendererTurbo(this, 467, 58, textureX, textureY, "cull"); // Box winnerisation sd49/sd59
		bodyModel[457] = new ModelRendererTurbo(this, 271, 25, textureX, textureY); // Box 275
		bodyModel[458] = new ModelRendererTurbo(this, 276, 18, textureX, textureY); // Box 274 gp39/40 exhaust
		bodyModel[459] = new ModelRendererTurbo(this, 271, 119, textureX, textureY); // Box airtank late
		bodyModel[460] = new ModelRendererTurbo(this, 271, 114, textureX, textureY); // Box airtank late
		bodyModel[461] = new ModelRendererTurbo(this, 133, 168, textureX, textureY); // Box 461 nose stairs hand rail inside your ass
		bodyModel[462] = new ModelRendererTurbo(this, 176, 30, textureX, textureY); // Box 364 prime base
		bodyModel[463] = new ModelRendererTurbo(this, 184, 26, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
		bodyModel[464] = new ModelRendererTurbo(this, 184, 26, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
		bodyModel[465] = new ModelRendererTurbo(this, 184, 26, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
		bodyModel[466] = new ModelRendererTurbo(this, 184, 26, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4
		bodyModel[467] = new ModelRendererTurbo(this, 177, 27, textureX, textureY, "cull"); // Box 506 cull
		bodyModel[468] = new ModelRendererTurbo(this, 160, 39, textureX, textureY); // Box 469
		bodyModel[469] = new ModelRendererTurbo(this, 160, 36, textureX, textureY); // Box 470
		bodyModel[470] = new ModelRendererTurbo(this, 160, 33, textureX, textureY); // Box 471
		bodyModel[471] = new ModelRendererTurbo(this, 160, 30, textureX, textureY); // Box 472
		bodyModel[472] = new ModelRendererTurbo(this, 208, 11, textureX, textureY); // Box 473
		bodyModel[473] = new ModelRendererTurbo(this, 208, 7, textureX, textureY, BoxName.prime1); // Box PRIME1-1
		bodyModel[474] = new ModelRendererTurbo(this, 208, 7, textureX, textureY, BoxName.prime4); // Box 475 PRIME1-4
		bodyModel[475] = new ModelRendererTurbo(this, 208, 7, textureX, textureY, BoxName.prime3); // Box 476 PRIME1-3
		bodyModel[476] = new ModelRendererTurbo(this, 208, 7, textureX, textureY, BoxName.prime2); // Box 477 PRIME1-2
		bodyModel[477] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412 ditchlight ane f
		bodyModel[478] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, BoxName.ditch); // Box 412  ditchlight ane f
		bodyModel[479] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411 ane ditchlight mount
		bodyModel[480] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410 ane ditchlight mount
		bodyModel[481] = new ModelRendererTurbo(this, 377, 174, textureX, textureY, BoxName.ditch); // Box 417 ditchlight ane r
		bodyModel[482] = new ModelRendererTurbo(this, 377, 174, textureX, textureY, BoxName.ditch); // Box 416 ditchlight ane r
		bodyModel[483] = new ModelRendererTurbo(this, 377, 179, textureX, textureY); // Box 415 ane ditchlight mount
		bodyModel[484] = new ModelRendererTurbo(this, 377, 179, textureX, textureY); // Box 414 ane ditchlight mount

		bodyModel[0].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[0].setRotationPoint(-49F, 7F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[1].setRotationPoint(-49F, 8F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 88, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[2].setRotationPoint(-44F, -0.5F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-50F, 2.5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[4].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[5].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 88, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-44F, -0.5F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 98, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[7].setRotationPoint(-49F, -0.5F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 98, 2, 12, 0F); // Box 23
		bodyModel[8].setRotationPoint(-49F, 1F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[9].setRotationPoint(-49F, 3F, -6.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[10].setRotationPoint(-32F, 3F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[11].setRotationPoint(-31.5F, 1F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 129
		bodyModel[12].setRotationPoint(-31.5F, 2F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[13].setRotationPoint(-31.5F, 2F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[14].setRotationPoint(-30.5F, 2F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 134
		bodyModel[15].setRotationPoint(-30.5F, 2F, 9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 166
		bodyModel[16].setRotationPoint(28F, 3F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[17].setRotationPoint(28.5F, 1F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[18].setRotationPoint(28.5F, 2F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[19].setRotationPoint(29.5F, 2F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		bodyModel[20].setRotationPoint(28.5F, 2F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[21].setRotationPoint(29.5F, 2F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[22].setRotationPoint(-45F, 1F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[23].setRotationPoint(-45F, 1F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 262
		bodyModel[24].setRotationPoint(-45F, -0.5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[25].setRotationPoint(-45F, 5F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[26].setRotationPoint(-45F, 5F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 261
		bodyModel[27].setRotationPoint(-45F, -0.5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[28].setRotationPoint(-49F, 3F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[29].setRotationPoint(-49F, 8F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[30].setRotationPoint(-49F, 5F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[31].setRotationPoint(-49F, 7F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[32].setRotationPoint(-49F, 4F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[33].setRotationPoint(-49F, 3F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[34].setRotationPoint(-49F, 0.5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[35].setRotationPoint(-49F, 5F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[36].setRotationPoint(-49F, 8F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[37].setRotationPoint(-49F, 7F, 9F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[38].setRotationPoint(-49F, 4F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(-49F, 3.5F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[40].setRotationPoint(-49F, -8.5F, -8F);
		bodyModel[40].rotateAngleY = -3.14159265F;

		bodyModel[41].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[41].setRotationPoint(-49F, -1.5F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[42].setRotationPoint(-49F, -1.5F, -11F);

		bodyModel[43].addShapeBox(-1F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 363
		bodyModel[43].setRotationPoint(-49.01F, -7.5F, -8F);

		bodyModel[44].addShapeBox(-1F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 870
		bodyModel[44].setRotationPoint(-49.01F, -7.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 559
		bodyModel[45].setRotationPoint(-49F, -8.5F, 9F);
		bodyModel[45].rotateAngleY = -3.14159265F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[46].setRotationPoint(49F, 8F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[47].setRotationPoint(49F, 7F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[48].setRotationPoint(49F, 2.5F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[49].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[50].setRotationPoint(49.01F, 0F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[51].setRotationPoint(44F, 1F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[52].setRotationPoint(44F, 1F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 261
		bodyModel[53].setRotationPoint(44F, -0.5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[54].setRotationPoint(44F, -0.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Box 264
		bodyModel[55].setRotationPoint(44F, 5F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[56].setRotationPoint(44F, 5F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 541
		bodyModel[57].setRotationPoint(45F, 4F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[58].setRotationPoint(45F, 5F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 543
		bodyModel[59].setRotationPoint(45F, 7F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[60].setRotationPoint(45F, 8F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[61].setRotationPoint(45F, 3F, -9F);

		bodyModel[62].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[62].setRotationPoint(45F, 0.5F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[63].setRotationPoint(45F, 3F, 7F);

		bodyModel[64].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 554
		bodyModel[64].setRotationPoint(45F, 0.5F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 555
		bodyModel[65].setRotationPoint(45F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 556
		bodyModel[66].setRotationPoint(45F, 5F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 557
		bodyModel[67].setRotationPoint(45F, 7F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 558
		bodyModel[68].setRotationPoint(45F, 8F, 9F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[69].setRotationPoint(49F, -1.5F, 10F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[70].setRotationPoint(49F, -1.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 560
		bodyModel[71].setRotationPoint(49F, -8.5F, 9F);
		bodyModel[71].rotateAngleY = -3.14159265F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 561
		bodyModel[72].setRotationPoint(49F, -8.5F, -8F);
		bodyModel[72].rotateAngleY = -3.14159265F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 203
		bodyModel[73].setRotationPoint(44F, 3F, -2.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 19, 3, 22, 0F); // Box 489
		bodyModel[74].setRotationPoint(-9.5F, 3F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[75].setRotationPoint(-9.5F, 2F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[76].setRotationPoint(-9.5F, 6F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[77].setRotationPoint(-9.5F, 6F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[78].setRotationPoint(-9.5F, 2F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 316
		bodyModel[79].setRotationPoint(-9.5F, 6F, 9F);

		bodyModel[80].addBox(0F, 0F, 0F, 19, 1, 16, 0F); // Box 559
		bodyModel[80].setRotationPoint(-9.5F, 2F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[81].setRotationPoint(9.5F, 6F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[82].setRotationPoint(9.5F, 6F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 3, 22, 0F); // Box 566
		bodyModel[83].setRotationPoint(9.5F, 3F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[84].setRotationPoint(9.5F, 2F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Box 568
		bodyModel[85].setRotationPoint(9.5F, 2F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[86].setRotationPoint(9.5F, 2F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		bodyModel[87].setRotationPoint(9.5F, 6F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[88].setRotationPoint(-11.5F, 6F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[89].setRotationPoint(-11.5F, 6F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 3, 22, 0F); // Box 573
		bodyModel[90].setRotationPoint(-11.5F, 3F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[91].setRotationPoint(-11.5F, 2F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 576
		bodyModel[92].setRotationPoint(-11.5F, 6F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[93].setRotationPoint(-11.5F, 2F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[94].setRotationPoint(-9F, 2F, -11.25F);
		bodyModel[94].rotateAngleX = 1.02974426F;

		bodyModel[95].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 560
		bodyModel[95].setRotationPoint(-9F, 2F, 11.25F);
		bodyModel[95].rotateAngleX = 1.02974426F;
		bodyModel[95].rotateAngleY = -3.14159265F;

		bodyModel[96].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank earluy
		bodyModel[96].setRotationPoint(-4F, 1.3F, -9.7F);
		bodyModel[96].rotateAngleX = 0.78539816F;

		bodyModel[97].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank earluy
		bodyModel[97].setRotationPoint(-4F, 1.3F, 9.7F);
		bodyModel[97].rotateAngleX = 0.78539816F;

		bodyModel[98].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 575
		bodyModel[98].setRotationPoint(-11.5F, 2F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 268 anticlimber a cull all ainticlimbers
		bodyModel[99].setRotationPoint(-52F, -0.5F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 269 anticlimber a
		bodyModel[100].setRotationPoint(-52F, -0.5F, 1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431 anticlimber a
		bodyModel[101].setRotationPoint(-52F, -0.5F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 394 anticlimber a
		bodyModel[102].setRotationPoint(49F, -0.5F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 395 anticlimber a
		bodyModel[103].setRotationPoint(49F, -0.5F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 396 anticlimber a
		bodyModel[104].setRotationPoint(49F, -0.5F, 1F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[105].setRotationPoint(-42.5F, -10.5F, -7.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cull rachet holder
		bodyModel[106].setRotationPoint(-44F, -9.5F, -7F);

		bodyModel[107].addBox(0F, 0F, 0F, 10, 13, 14, 0F); // Box 345
		bodyModel[107].setRotationPoint(-45F, -13.5F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[108].setRotationPoint(-48F, -8.5F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[109].setRotationPoint(-48F, -10.5F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[110].setRotationPoint(-48F, -10.5F, 1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[111].setRotationPoint(-48F, -13.5F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[112].setRotationPoint(-48F, -13.5F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[113].setRotationPoint(-48F, -8.5F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F); // Box 71 markerlight front
		bodyModel[114].setRotationPoint(-45.65F, -12.5F, -6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight front
		bodyModel[115].setRotationPoint(-45.65F, -12.5F, 4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251
		bodyModel[116].setRotationPoint(-46F, -14F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[117].setRotationPoint(-44.5F, -12.5F, -7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 headlight nose high b
		bodyModel[118].setRotationPoint(-48F, -11.5F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 headlight nose high a
		bodyModel[119].setRotationPoint(-48F, -13.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 headlight nose low a
		bodyModel[120].setRotationPoint(-48F, -12.5F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 headlight nose low b
		bodyModel[121].setRotationPoint(-48F, -10.5F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[122].setRotationPoint(-46.98F, -13.5F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[123].setRotationPoint(-48F, -13.5F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[124].setRotationPoint(-48F, -13.5F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[125].setRotationPoint(-32F, -18.5F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[126].setRotationPoint(-32F, -18.5F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[127].setRotationPoint(-35F, -21.5F, 7F);

		bodyModel[128].addShapeBox(-0.5F, 0F, -3.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[128].setRotationPoint(-23.5F, -21.5F, 10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[129].setRotationPoint(-34F, -19.5F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[130].setRotationPoint(-34F, -21.5F, -7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[131].setRotationPoint(-24F, -21.5F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front cab
		bodyModel[132].setRotationPoint(-37.25F, -19.5F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front cab
		bodyModel[133].setRotationPoint(-37.25F, -21.5F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[134].setRotationPoint(-37F, -21.5F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[135].setRotationPoint(-37F, -21.5F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[136].setRotationPoint(-37F, -21.5F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[137].setRotationPoint(-35F, -21.5F, -7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[138].setRotationPoint(-24F, -21.5F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[139].setRotationPoint(-35F, -21.5F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[140].setRotationPoint(-35F, -4.5F, -11F);

		bodyModel[141].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[141].setRotationPoint(-23.5F, -18.5F, 10.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[142].setRotationPoint(-35F, -18.5F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[143].setRotationPoint(-34F, -18.5F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[144].setRotationPoint(-34F, -18.5F, 10F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[145].setRotationPoint(-24F, -18.5F, -11F);

		bodyModel[146].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[146].setRotationPoint(-34.5F, -18.5F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 117 numberboard front
		bodyModel[147].setRotationPoint(-35.05F, -20F, -6F);
		bodyModel[147].rotateAngleY = 0.38397244F;

		bodyModel[148].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118 numberboard front
		bodyModel[148].setRotationPoint(-35.05F, -20F, 6F);
		bodyModel[148].rotateAngleY = -0.38397244F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[149].setRotationPoint(-37F, -17.5F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.75F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[150].setRotationPoint(-14F, 0.5F, 8.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 245
		bodyModel[151].setRotationPoint(-41F, -4.5F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[152].setRotationPoint(-44F, -4.5F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 281
		bodyModel[153].setRotationPoint(-43F, -4.5F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 408
		bodyModel[154].setRotationPoint(-42.5F, -2.5F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[155].setRotationPoint(-42F, -4.5F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283 this isnt used usually
		bodyModel[156].setRotationPoint(-43F, -4.5F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[157].setRotationPoint(-43F, -2.5F, 7F);

		bodyModel[158].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 439
		bodyModel[158].setRotationPoint(-44F, -13.8F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[159].setRotationPoint(45.75F, -22F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[160].setRotationPoint(47.5F, -19.5F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[161].setRotationPoint(47.5F, -19.5F, -2F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[162].setRotationPoint(46.25F, -19.5F, -2F);

		bodyModel[163].addBox(0F, 0F, 0F, 57, 21, 14, 0F); // Box 34
		bodyModel[163].setRotationPoint(-12F, -21.5F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[164].setRotationPoint(45F, -21.5F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[165].setRotationPoint(45F, -21.5F, 0F);

		bodyModel[166].addShapeBox(-1F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115 numberboard rear
		bodyModel[166].setRotationPoint(45.5F, -17F, -6F);
		bodyModel[166].rotateAngleY = -0.41887902F;

		bodyModel[167].addShapeBox(-1F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116 numberboard rear
		bodyModel[167].setRotationPoint(45.5F, -17F, 6F);
		bodyModel[167].rotateAngleY = 0.41887902F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear low
		bodyModel[168].setRotationPoint(44.7F, -13F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear low
		bodyModel[169].setRotationPoint(44.7F, -13F, 4.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -1F, -0.25F, -0.25F); // Box 71 markerlight rear high
		bodyModel[170].setRotationPoint(44.7F, -19.5F, -6.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1208 makrerlight rear high
		bodyModel[171].setRotationPoint(44.7F, -19.5F, 4.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 mega bubble
		bodyModel[172].setRotationPoint(-10F, -4.5F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 mega bubble
		bodyModel[173].setRotationPoint(-10F, -6.5F, -10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 mega bubble
		bodyModel[174].setRotationPoint(-10F, -15.5F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130 mega bubble
		bodyModel[175].setRotationPoint(-10F, -14.5F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 48, 2, 4, 0F); // Box 36
		bodyModel[176].setRotationPoint(-23F, -2.5F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[177].setRotationPoint(-13.25F, 2.75F, -10.25F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[178].setRotationPoint(-13.5F, 1.25F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[179].setRotationPoint(-13.5F, 2.25F, -10.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1007 cull
		bodyModel[180].setRotationPoint(-13.5F, 0.25F, -10.9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[181].setRotationPoint(-21F, -4.5F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 304
		bodyModel[182].setRotationPoint(-22F, -2.5F, 7F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 305
		bodyModel[183].setRotationPoint(-23F, -4.5F, 11F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 836
		bodyModel[184].setRotationPoint(-23F, -4.5F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 21, 14, 0F); // Box 668
		bodyModel[185].setRotationPoint(-23F, -21.5F, -7F);

		bodyModel[186].addBox(0F, 0F, 0F, 9, 3, 14, 0F); // Box 669 dont forget to texture the correct dynamic grid!
		bodyModel[186].setRotationPoint(-21F, -21.5F, -7F);

		bodyModel[187].addBox(0F, 0F, 0F, 9, 13, 14, 0F); // Box 670 dont forget to texture the correct dynamic grid!
		bodyModel[187].setRotationPoint(-21F, -13.5F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[188].setRotationPoint(-43F, -7F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[189].setRotationPoint(-43.5F, -9F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 3F); // Box 673 dynamic grid early
		bodyModel[190].setRotationPoint(-21F, -15.5F, -3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 674 dynamic grid late
		bodyModel[191].setRotationPoint(-21F, -15.5F, -3F);

		bodyModel[192].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 675
		bodyModel[192].setRotationPoint(-19F, -18.5F, -2.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 676
		bodyModel[193].setRotationPoint(-18F, -17.5F, -1.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 18, 10, 14, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, -5F, 0F); // Box 677 cull vent sus
		bodyModel[194].setRotationPoint(-21F, -18.5F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,-0.25F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 286
		bodyModel[195].setRotationPoint(-12F, -21F, 6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,-0.25F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -10.25F, 0F, 0F, -10.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 285
		bodyModel[196].setRotationPoint(-12F, -21F, -7.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 444
		bodyModel[197].setRotationPoint(-50F, -8.5F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[198].setRotationPoint(-51.5F, -8.5F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 446
		bodyModel[199].setRotationPoint(-51.5F, -8.5F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[200].setRotationPoint(-51.1F, -8.5F, -2F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 692
		bodyModel[201].setRotationPoint(-50F, -8.5F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 298
		bodyModel[202].setRotationPoint(19.5F, -20.5F, -7.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 9, 1, 13, 0F); // Box 700
		bodyModel[203].setRotationPoint(-21F, -22F, -6.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[204].setRotationPoint(-10.5F, -22.5F, -5F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 1, 13, 0F); // ehaust silencer
		bodyModel[205].setRotationPoint(-2F, -22.5F, -6.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 704
		bodyModel[206].setRotationPoint(36.5F, -22.25F, -3.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 705
		bodyModel[207].setRotationPoint(20F, -22.25F, -3.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 706
		bodyModel[208].setRotationPoint(28.25F, -22.25F, -3.5F);

		bodyModel[209].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 715
		bodyModel[209].setRotationPoint(36.5F, -22.25F, -3.5F);

		bodyModel[210].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 234
		bodyModel[210].setRotationPoint(20F, -22.25F, -3.5F);

		bodyModel[211].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 235
		bodyModel[211].setRotationPoint(28.25F, -22.25F, -3.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[212].setRotationPoint(-24.5F, -20.5F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[213].setRotationPoint(-35.1F, -22.5F, -0.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
		bodyModel[214].setRotationPoint(-36F, -23F, -2.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
		bodyModel[215].setRotationPoint(-36F, -23F, 1.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 83
		bodyModel[216].setRotationPoint(-37F, -23.5F, -1.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[217].setRotationPoint(-37F, -23.5F, 0.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 85
		bodyModel[218].setRotationPoint(-37F, -23.5F, -0.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[219].setRotationPoint(-36F, -22.5F, -0.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[220].setRotationPoint(-38F, -23.25F, -1.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[221].setRotationPoint(-37.5F, -23.25F, 0.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[222].setRotationPoint(-38.5F, -23.5F, -0.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[223].setRotationPoint(-30.5F, -28.5F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[224].setRotationPoint(-30.5F, -28.5F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[225].setRotationPoint(-30.5F, -27.5F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[226].setRotationPoint(-30.5F, -27.5F, -9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[227].setRotationPoint(-30.5F, -25.5F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[228].setRotationPoint(-30.5F, -25.5F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[229].setRotationPoint(-30.5F, -25.5F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[230].setRotationPoint(-30.5F, -25.5F, 7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[231].setRotationPoint(-30.5F, -27.5F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[232].setRotationPoint(-30.5F, -27.5F, 5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[233].setRotationPoint(-30.5F, -28.5F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[234].setRotationPoint(-30.5F, -28.5F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[235].setRotationPoint(-37.75F, -23.5F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[236].setRotationPoint(-37.75F, -23.5F, 0F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[237].setRotationPoint(-37F, -23.5F, -2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[238].setRotationPoint(-38.5F, -21.5F, -0.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[239].setRotationPoint(-38.25F, -19F, -0.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[240].setRotationPoint(-38.5F, -20.5F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[241].setRotationPoint(-38.5F, -19.5F, -0.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[242].setRotationPoint(7F, -24F, -7F);

		bodyModel[243].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[243].setRotationPoint(7F, -24F, -5.75F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[244].setRotationPoint(8F, -22F, -6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[245].setRotationPoint(6F, -22.75F, -7.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[246].setRotationPoint(6.5F, -22.75F, -5.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[247].setRotationPoint(5.5F, -23F, -6.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 277 cull
		bodyModel[248].setRotationPoint(15F, -21.75F, 6.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, -0.75F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[249].setRotationPoint(15.5F, -22.76F, 7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[250].setRotationPoint(15.5F, -23.76F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[251].setRotationPoint(17.5F, -22F, 6.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[252].setRotationPoint(17.75F, -19.5F, 7.95F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[253].setRotationPoint(17.5F, -21F, 7.7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[254].setRotationPoint(17.5F, -20F, 7.7F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 284
		bodyModel[255].setRotationPoint(16.95F, -22.5F, -1.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 285
		bodyModel[256].setRotationPoint(16.75F, -23F, 1.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 286
		bodyModel[257].setRotationPoint(15F, -23.5F, 0.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 287
		bodyModel[258].setRotationPoint(15F, -23F, -0.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 288
		bodyModel[259].setRotationPoint(15F, -23.5F, -1.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 289
		bodyModel[260].setRotationPoint(16.75F, -23F, -2.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[261].setRotationPoint(-33F, -22.5F, 2F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[262].setRotationPoint(-33F, -23.5F, 2F);

		bodyModel[263].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[263].setRotationPoint(-32F, -23.5F, 2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[264].setRotationPoint(-33F, -22.5F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[265].setRotationPoint(-33F, -23.5F, -6F);

		bodyModel[266].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[266].setRotationPoint(-32F, -23.5F, -6F);

		bodyModel[267].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[267].setRotationPoint(-32F, -23.25F, -4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[268].setRotationPoint(-34.5F, -23F, -6.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[269].setRotationPoint(-34.5F, -24F, -6.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[270].setRotationPoint(-34.5F, -23F, 5.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[271].setRotationPoint(-34.5F, -24F, 5.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[272].setRotationPoint(-34.5F, -22.5F, 5.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[273].setRotationPoint(-34.5F, -22.5F, -6.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[274].setRotationPoint(-25F, -23.5F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 293
		bodyModel[275].setRotationPoint(-29.5F, 1F, -11.01F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[276].setRotationPoint(-53F, 7F, 0F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[277].setRotationPoint(-53F, 7F, -10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[278].setRotationPoint(-52F, 6F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[279].setRotationPoint(-52F, 4F, 2F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[280].setRotationPoint(-52F, 6F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[281].setRotationPoint(-52F, 4F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[282].setRotationPoint(-52F, 4F, 2F);

		bodyModel[283].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[283].setRotationPoint(-52F, 4F, -8F);

		bodyModel[284].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 312
		bodyModel[284].setRotationPoint(-11F, 2F, 11.25F);
		bodyModel[284].rotateAngleX = 1.02974426F;
		bodyModel[284].rotateAngleY = -3.14159265F;

		bodyModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 313
		bodyModel[285].setRotationPoint(-11F, 2F, -11.25F);
		bodyModel[285].rotateAngleX = 1.02974426F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 poo pipe
		bodyModel[286].setRotationPoint(-42F, 0.5F, 7.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 315
		bodyModel[287].setRotationPoint(-42.25F, 0.5F, 10.25F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 316
		bodyModel[288].setRotationPoint(-42F, -12F, 6.25F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[289].setRotationPoint(-33F, -23.5F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[290].setRotationPoint(-33F, -23.5F, -8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[291].setRotationPoint(-33F, -23.5F, -8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[292].setRotationPoint(-33F, -23.5F, -8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[293].setRotationPoint(-33F, -23F, -8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[294].setRotationPoint(-33.5F, -22F, -8F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 323
		bodyModel[295].setRotationPoint(-34F, -23.5F, 0F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 325
		bodyModel[296].setRotationPoint(11F, -23.5F, 0F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 326
		bodyModel[297].setRotationPoint(5F, -23.5F, 0F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 36 cr society square
		bodyModel[298].setRotationPoint(-42F, -8.5F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[299].setRotationPoint(-29.5F, -22.5F, 2F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 271
		bodyModel[300].setRotationPoint(-51.5F, 1F, -5.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 272
		bodyModel[301].setRotationPoint(-51.5F, 1F, 3.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 273 lamp ditchlight front
		bodyModel[302].setRotationPoint(-51.75F, 1F, 3.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 274 lamp ditchlight front
		bodyModel[303].setRotationPoint(-51.75F, 1F, -5.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[304].setRotationPoint(49.5F, 1F, -5.75F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[305].setRotationPoint(49.5F, 1F, 3.75F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 273 lamp ditchlight front
		bodyModel[306].setRotationPoint(50.75F, 1F, 3.75F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 274 lamp ditchlight front
		bodyModel[307].setRotationPoint(50.75F, 1F, -5.75F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[308].setRotationPoint(-51F, -2.5F, -6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[309].setRotationPoint(-51F, -2.5F, 4F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 578 THIS IS A DITCHLIGHT IT WILL GLOWE
		bodyModel[310].setRotationPoint(-51.25F, -2.6F, -6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 579THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[311].setRotationPoint(-51.25F, -2.6F, 4F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[312].setRotationPoint(-51.25F, -2.5F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 not a ditchlight will not glow
		bodyModel[313].setRotationPoint(-51.25F, -2.5F, 4F);

		bodyModel[314].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // Box 196 winterization hatch
		bodyModel[314].setRotationPoint(17.5F, -23.25F, -4F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 270 filter box thinggy
		bodyModel[315].setRotationPoint(-23F, -10.5F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[316].setRotationPoint(-35.5F, -22.5F, -0.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[317].setRotationPoint(-35.5F, -23.5F, -0.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[318].setRotationPoint(8F, -22F, -0.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 348
		bodyModel[319].setRotationPoint(6.5F, -22.75F, 0.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 349
		bodyModel[320].setRotationPoint(5.5F, -23F, -0.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 350
		bodyModel[321].setRotationPoint(6F, -22.75F, -1.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 351
		bodyModel[322].setRotationPoint(14F, -24F, -0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 352
		bodyModel[323].setRotationPoint(16.5F, -23F, -0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 353
		bodyModel[324].setRotationPoint(14.5F, -23.75F, -1.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[325].setRotationPoint(15F, -23.75F, 0.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME-4
		bodyModel[326].setRotationPoint(-36.5F, -23F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME-2
		bodyModel[327].setRotationPoint(-36.5F, -23F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME-3
		bodyModel[328].setRotationPoint(-36.5F, -23F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME-1
		bodyModel[329].setRotationPoint(-36.5F, -23F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[330].setRotationPoint(-36.5F, -22.5F, -1F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[331].setRotationPoint(42.5F, -22.75F, 5.5F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[332].setRotationPoint(44F, -22.75F, 3.5F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[333].setRotationPoint(44F, -22F, 4.5F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[334].setRotationPoint(44F, -23F, 4.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[335].setRotationPoint(-25F, -22.5F, -5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[336].setRotationPoint(-25F, -22.5F, 5F);

		bodyModel[337].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 561 cull ptc antenna shiz
		bodyModel[337].setRotationPoint(-30F, -22F, -9.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 562 cull ptc antenna shiz
		bodyModel[338].setRotationPoint(-30F, -22F, 6.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 563
		bodyModel[339].setRotationPoint(-29.5F, -23F, -8F);

		bodyModel[340].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 564
		bodyModel[340].setRotationPoint(-29.5F, -23F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360
		bodyModel[341].setRotationPoint(-34F, -19.5F, 7F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 361
		bodyModel[342].setRotationPoint(-52F, 3F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 362
		bodyModel[343].setRotationPoint(-52F, 3F, -8F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 363 csx bit
		bodyModel[344].setRotationPoint(-24F, -22.5F, -1F);

		bodyModel[345].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye front
		bodyModel[345].setRotationPoint(-46.25F, -12F, -6F);

		bodyModel[346].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye front
		bodyModel[346].setRotationPoint(-46.25F, -12F, 5F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye rear
		bodyModel[347].setRotationPoint(45.25F, -12.5F, -6F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364 markerlight bugeye rear
		bodyModel[348].setRotationPoint(45.25F, -12.5F, 5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[349].setRotationPoint(50F, -2.5F, -5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[350].setRotationPoint(50F, -2.5F, 3F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 not a ditchlight will not glow
		bodyModel[351].setRotationPoint(50.25F, -2.5F, -5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 not a ditchlight will not glow
		bodyModel[352].setRotationPoint(50.25F, -2.5F, 3F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 580THIS IS A DITCHLIGHT IT WILL GLOW
		bodyModel[353].setRotationPoint(50.25F, -2.6F, 3F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 581YARR AHOY MATEY THIS BE ERE A DITCHLIGHT AND THAR SHE SHALL GLOWETH
		bodyModel[354].setRotationPoint(50.25F, -2.6F, -5F);

		bodyModel[355].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 380
		bodyModel[355].setRotationPoint(-7F, 2F, -11.15F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 381
		bodyModel[356].setRotationPoint(-7F, 2F, 10.15F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 1163
		bodyModel[357].setRotationPoint(52F, 7F, 0F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1164
		bodyModel[358].setRotationPoint(52F, 7F, -10F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 1165
		bodyModel[359].setRotationPoint(51F, 6F, 0F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1166
		bodyModel[360].setRotationPoint(51F, 6F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 anticlimber b
		bodyModel[361].setRotationPoint(-52F, -0.5F, -8F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 387 anticlimber b
		bodyModel[362].setRotationPoint(-52F, -0.5F, 0F);

		bodyModel[363].addBox(1F, 0F, 0F, 6, 2, 4, 0F); // Box 388 blacklands rr sideways ac
		bodyModel[363].setRotationPoint(-31F, -23.5F, 4F);
		bodyModel[363].rotateAngleY = -1.57079633F;

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 389 blacklands rr sideways ac
		bodyModel[364].setRotationPoint(-31F, -22.5F, 4F);
		bodyModel[364].rotateAngleY = -1.57079633F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390 blacklands rr sideways ac
		bodyModel[365].setRotationPoint(-31F, -23.5F, 4F);
		bodyModel[365].rotateAngleY = -1.57079633F;

		bodyModel[366].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[366].setRotationPoint(-29.5F, -20.75F, -9.5F);
		bodyModel[366].rotateAngleX = 0.64577182F;

		bodyModel[367].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[367].setRotationPoint(-29.5F, -20.75F, -9.5F);
		bodyModel[367].rotateAngleX = 0.64577182F;

		bodyModel[368].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base csx
		bodyModel[368].setRotationPoint(-29.5F, -20.75F, 9.5F);
		bodyModel[368].rotateAngleX = -0.64577182F;

		bodyModel[369].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon csx
		bodyModel[369].setRotationPoint(-29.5F, -20.75F, 9.5F);
		bodyModel[369].rotateAngleX = -0.64577182F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 1F, 0F, 0.25F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, -1F, 0F); // Box 313
		bodyModel[370].setRotationPoint(-23F, -12.5F, -11.01F);

		bodyModel[371].addBox(0F, 0F, 0F, 43, 11, 0, 0F); // Box 312
		bodyModel[371].setRotationPoint(-20F, -13.5F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, -2F, 0F); // Box 296
		bodyModel[372].setRotationPoint(-22F, -10.5F, 11.01F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[373].setRotationPoint(-23F, -12.5F, 11F);

		bodyModel[374].addBox(0F, 0F, 0F, 64, 8, 0, 0F); // Box 291
		bodyModel[374].setRotationPoint(-19F, -8.5F, 11F);

		bodyModel[375].addBox(0F, 0F, 0F, 10, 8, 0, 0F); // Box 267
		bodyModel[375].setRotationPoint(-45F, -12.5F, 11F);

		bodyModel[376].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 260
		bodyModel[376].setRotationPoint(-40F, -12.5F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 18, 0, 18, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F); // Box 402 dyn fan
		bodyModel[377].setRotationPoint(-21F, -22.01F, -4.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403 cnw antenna
		bodyModel[378].setRotationPoint(-29.5F, -24.25F, 6.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 404 cull cnw antenna
		bodyModel[379].setRotationPoint(-29.5F, -22.25F, 6F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[380].setRotationPoint(-24.5F, -22.5F, -6.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[381].setRotationPoint(-24.5F, -23.5F, -6.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[382].setRotationPoint(-26F, -22.5F, 3F);

		bodyModel[383].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[383].setRotationPoint(-31F, -16.75F, 3F);
		bodyModel[383].rotateAngleY = 0.78539816F;

		bodyModel[384].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[384].setRotationPoint(-31F, -16.75F, 3F);
		bodyModel[384].rotateAngleY = 0.78539816F;

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 386 anticlimber b
		bodyModel[385].setRotationPoint(49F, -0.5F, -8F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387 anticlimber b
		bodyModel[386].setRotationPoint(49F, -0.5F, 0F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 416
		bodyModel[387].setRotationPoint(51F, 6F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 417
		bodyModel[388].setRotationPoint(51F, 6F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 418
		bodyModel[389].setRotationPoint(51F, 5F, 2F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 419
		bodyModel[390].setRotationPoint(51F, 4F, 2F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[391].setRotationPoint(51F, 5F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[392].setRotationPoint(51F, 4F, -8F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 350 mu plug
		bodyModel[393].setRotationPoint(48.5F, 0.5F, 4F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351 mu plug
		bodyModel[394].setRotationPoint(48.5F, 0.5F, -6F);

		bodyModel[395].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[395].setRotationPoint(49.5F, 1F, -5.5F);
		bodyModel[395].rotateAngleZ = 0.40142573F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350 mu plug
		bodyModel[396].setRotationPoint(-49.5F, 0.5F, 4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 351 mu plug
		bodyModel[397].setRotationPoint(-49.5F, 0.5F, -6F);

		bodyModel[398].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352
		bodyModel[398].setRotationPoint(-49.5F, 1F, -5.5F);
		bodyModel[398].rotateAngleZ = -0.40142573F;

		bodyModel[399].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271 your either HI or KCS to use this
		bodyModel[399].setRotationPoint(-10F, -15.5F, -9F);

		bodyModel[400].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271 your either HI or KCS to use this
		bodyModel[400].setRotationPoint(-10F, -13.5F, -9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 430
		bodyModel[401].setRotationPoint(32F, -20.5F, -7.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 431
		bodyModel[402].setRotationPoint(32F, -20.5F, 6.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 24, 7, 1, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 432
		bodyModel[403].setRotationPoint(19.5F, -20.5F, 6.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[404].setRotationPoint(45F, -8.5F, 9F);

		bodyModel[405].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[405].setRotationPoint(45F, -8.5F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[406].setRotationPoint(45F, -3.5F, -11.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[407].setRotationPoint(45F, -3.5F, 10.5F);

		bodyModel[408].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[408].setRotationPoint(26F, -8.5F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, 0F, 0F); // Box 315
		bodyModel[409].setRotationPoint(23F, -10.5F, -11.01F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 441
		bodyModel[410].setRotationPoint(51.5F, -8.5F, 0F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 0, 8, 8, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[411].setRotationPoint(51.5F, -8.5F, -8F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[412].setRotationPoint(51.1F, -8.5F, -2F);

		bodyModel[413].addShapeBox(-1F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[413].setRotationPoint(49.99F, -7.5F, 8F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 445
		bodyModel[414].setRotationPoint(49F, -8.5F, 8F);

		bodyModel[415].addShapeBox(-1F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[415].setRotationPoint(49.99F, -7.5F, -8F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 447
		bodyModel[416].setRotationPoint(49F, -8.5F, -8F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[417].setRotationPoint(44F, -22.5F, -4.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[418].setRotationPoint(44F, -23.5F, -4.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 1F, 0F, 0.25F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.25F, -1F, 0F); // Box 452
		bodyModel[419].setRotationPoint(-3F, -12.5F, -11.01F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 2F, 0F); // Box 453
		bodyModel[420].setRotationPoint(-14F, -12.5F, -11.01F);

		bodyModel[421].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 226 pw based moment
		bodyModel[421].setRotationPoint(0F, -20F, -7.75F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227 pw based moment
		bodyModel[422].setRotationPoint(-2F, -21F, -8.5F);

		bodyModel[423].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 228 pw based moment
		bodyModel[423].setRotationPoint(-2.5F, -19F, -8.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 229 pw based moment
		bodyModel[424].setRotationPoint(-0.5F, -20F, -8.75F);

		bodyModel[425].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 81
		bodyModel[425].setRotationPoint(-45F, -9.5F, -11F);

		bodyModel[426].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[426].setRotationPoint(-45F, -12.5F, 9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 540
		bodyModel[427].setRotationPoint(-45F, -3.5F, -11.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 541
		bodyModel[428].setRotationPoint(-45F, -3.5F, 10.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.25F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, -2F, 0F, 0F, 2F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 2F, 0F); // Box 613
		bodyModel[429].setRotationPoint(-43F, -11.5F, -11.01F);

		bodyModel[430].addBox(0F, 0F, 0F, 2, 9, 0, 0F); // Box 614
		bodyModel[430].setRotationPoint(-45F, -9.5F, -11.01F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 615 htcr truck mount
		bodyModel[431].setRotationPoint(-24.5F, 2F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 616 htcr truck mount
		bodyModel[432].setRotationPoint(-25.5F, 2F, -10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617 htcr truck mount
		bodyModel[433].setRotationPoint(-25.5F, 1F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 618 htcr truck mount
		bodyModel[434].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 619 htcr truck mount
		bodyModel[435].setRotationPoint(-24.5F, 2F, 9F);

		bodyModel[436].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 620 htcr truck mount
		bodyModel[436].setRotationPoint(-26F, 3F, -2F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 621 htcr truck mount
		bodyModel[437].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 622 htcr truck mount
		bodyModel[438].setRotationPoint(22.5F, 2F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623 htcr truck mount
		bodyModel[439].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 624 htcr truck mount
		bodyModel[440].setRotationPoint(22.5F, 2F, 6F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 625 htcr truck mount
		bodyModel[441].setRotationPoint(23.5F, 2F, 9F);

		bodyModel[442].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 626 htcr truck mount
		bodyModel[442].setRotationPoint(22F, 3F, -2F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[443].setRotationPoint(-32F, -18.5F, -13F);

		bodyModel[444].addShapeBox(0F, 0F, -2F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		bodyModel[444].setRotationPoint(-32F, -17.5F, -13F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[445].setRotationPoint(-32F, -18.5F, 10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[446].setRotationPoint(-32F, -17.5F, 10F);

		bodyModel[447].addShapeBox(1F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[447].setRotationPoint(-50F, 0.5F, -8F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[448].setRotationPoint(-27.8F, -14.5F, 1F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[449].setRotationPoint(-34.5F, -12.5F, 3F);
		bodyModel[449].rotateAngleY = -0.45378561F;

		bodyModel[450].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[450].setRotationPoint(-34.5F, -14.5F, 3F);
		bodyModel[450].rotateAngleY = -0.45378561F;

		bodyModel[451].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[451].setRotationPoint(-34.5F, -8.5F, 3F);
		bodyModel[451].rotateAngleY = -0.45378561F;

		bodyModel[452].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 457 fans sd49/sd59
		bodyModel[452].setRotationPoint(22.25F, -22.25F, -3.5F);

		bodyModel[453].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 457 fans sd49/sd59
		bodyModel[453].setRotationPoint(22.25F, -22.25F, -3.5F);

		bodyModel[454].addShapeBox(1F, -1F, 1F, 5, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 457 fans sd49/sd59
		bodyModel[454].setRotationPoint(34.5F, -22.25F, -3.5F);

		bodyModel[455].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 457 fans sd49/sd59
		bodyModel[455].setRotationPoint(34.5F, -22.25F, -3.5F);

		bodyModel[456].addBox(0F, 0F, 0F, 10, 2, 8, 0F); // Box winnerisation sd49/sd59
		bodyModel[456].setRotationPoint(19.5F, -23.25F, -4F);

		bodyModel[457].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[457].setRotationPoint(-2F, -22F, -4F);

		bodyModel[458].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274 gp39/40 exhaust
		bodyModel[458].setRotationPoint(-1F, -22.75F, -2.5F);

		bodyModel[459].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank late
		bodyModel[459].setRotationPoint(-1F, 1.3F, -9.7F);
		bodyModel[459].rotateAngleX = 0.78539816F;

		bodyModel[460].addShapeBox(0F, -1F, -1F, 15, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box airtank late
		bodyModel[460].setRotationPoint(-1F, 1.3F, 9.7F);
		bodyModel[460].rotateAngleX = 0.78539816F;

		bodyModel[461].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 461 nose stairs hand rail inside your ass
		bodyModel[461].setRotationPoint(-34F, -11.5F, -4F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[462].setRotationPoint(-33F, -22.5F, 6F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[463].setRotationPoint(-33F, -23F, 6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[464].setRotationPoint(-33F, -23F, 6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[465].setRotationPoint(-33F, -23F, 6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[466].setRotationPoint(-33F, -23F, 6F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506 cull
		bodyModel[467].setRotationPoint(-33F, -21.5F, 7F);

		bodyModel[468].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 469
		bodyModel[468].setRotationPoint(-8F, -23.25F, -7.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 470
		bodyModel[469].setRotationPoint(-6.5F, -23.25F, -5.5F);

		bodyModel[470].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 471
		bodyModel[470].setRotationPoint(-8.5F, -23.5F, -6.5F);

		bodyModel[471].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 472
		bodyModel[471].setRotationPoint(-6F, -22.5F, -6.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[472].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box PRIME1-1
		bodyModel[473].setRotationPoint(-30.5F, -23F, -1F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 475 PRIME1-4
		bodyModel[474].setRotationPoint(-30.5F, -23F, -1F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 476 PRIME1-3
		bodyModel[475].setRotationPoint(-30.5F, -23F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 477 PRIME1-2
		bodyModel[476].setRotationPoint(-30.5F, -23F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight ane f
		bodyModel[477].setRotationPoint(-51.25F, -3.5F, 3F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412  ditchlight ane f
		bodyModel[478].setRotationPoint(-51.25F, -3.5F, -5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411 ane ditchlight mount
		bodyModel[479].setRotationPoint(-51F, -3.5F, 3F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410 ane ditchlight mount
		bodyModel[480].setRotationPoint(-51F, -3.5F, -5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight ane r
		bodyModel[481].setRotationPoint(50.25F, -3.5F, 3F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight ane r
		bodyModel[482].setRotationPoint(50.25F, -3.5F, -5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415 ane ditchlight mount
		bodyModel[483].setRotationPoint(50F, -3.5F, -5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414 ane ditchlight mount
		bodyModel[484].setRotationPoint(50F, -3.5F, 3F);
	}
	ModelFlexicoil_C_Mid flexMid = new ModelFlexicoil_C_Mid();
	ModelFlexicoil_C_Late flexLate = new ModelFlexicoil_C_Late();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 12 ||GetColor(entity) == 3 ) {//for cr early order
			//silver regular truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_c2h_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.875F, 0.0F, 0F);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.75F, 0.0F, 0);
			flexMid.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (GetColor(entity) == 5 ||GetColor(entity) == 11 ) {//i have no fuckin idea what the problem is
			//csx shid
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c2h_csxes.png"));//im gonna stab
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.875F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.75F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6|| GetColor(entity) == 228 ) {
			//silver dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_longjohns.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.875F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.75F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black dash 2 truck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexicoil_C_dash2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.875F, 0.0F, 0F);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.75F, 0.0F, 0);
			flexLate.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}