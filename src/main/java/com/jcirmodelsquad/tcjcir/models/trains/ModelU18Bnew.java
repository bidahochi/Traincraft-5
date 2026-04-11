//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U18B V2
// Model Creator: Bidahochi
// Created on: 03.03.2024 - 15:54:05
// Last changed on: 03.03.2024 - 15:54:05

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
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

public class ModelU18Bnew extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU18Bnew() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[373];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[2] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[3] = new ModelRendererTurbo(this, 440, 129, textureX, textureY); // Box 218
		bodyModel[4] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[5] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[6] = new ModelRendererTurbo(this, 209, 68, textureX, textureY, "cull"); // Box 281 cull mec ditchlight
		bodyModel[7] = new ModelRendererTurbo(this, 491, 128, textureX, textureY); // Box 263
		bodyModel[8] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[9] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[10] = new ModelRendererTurbo(this, 209, 63, textureX, textureY, "ditch"); // Box 276 ditchlight r1
		bodyModel[11] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[12] = new ModelRendererTurbo(this, 431, 128, textureX, textureY); // Box 270434
		bodyModel[13] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[14] = new ModelRendererTurbo(this, 442, 140, textureX, textureY); // Box 300
		bodyModel[15] = new ModelRendererTurbo(this, 490, 140, textureX, textureY); // Box 301
		bodyModel[16] = new ModelRendererTurbo(this, 209, 68, textureX, textureY, "cull"); // Box 442 cull mec ditchlight
		bodyModel[17] = new ModelRendererTurbo(this, 209, 63, textureX, textureY, "ditch"); // Box 443 ditchlight r1
		bodyModel[18] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[19] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[20] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[21] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[22] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[23] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[24] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[25] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[26] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[27] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[28] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[29] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[30] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[31] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[32] = new ModelRendererTurbo(this, 155, 131, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[34] = new ModelRendererTurbo(this, 152, 146, textureX, textureY); // Box 196
		bodyModel[35] = new ModelRendererTurbo(this, 133, 99, textureX, textureY); // Box 197
		bodyModel[36] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[37] = new ModelRendererTurbo(this, 134, 86, textureX, textureY); // Box 199
		bodyModel[38] = new ModelRendererTurbo(this, 133, 88, textureX, textureY); // Box 200
		bodyModel[39] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[40] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[41] = new ModelRendererTurbo(this, 142, 99, textureX, textureY); // Box 205
		bodyModel[42] = new ModelRendererTurbo(this, 101, 125, textureX, textureY); // box65
		bodyModel[43] = new ModelRendererTurbo(this, 202, 68, textureX, textureY, "cull"); // Box 252 cull mec ditchlight
		bodyModel[44] = new ModelRendererTurbo(this, 155, 145, textureX, textureY); // Box 2603
		bodyModel[45] = new ModelRendererTurbo(this, 146, 146, textureX, textureY); // Box 261
		bodyModel[46] = new ModelRendererTurbo(this, 202, 63, textureX, textureY, "ditch"); // Box 190 ditchlight f1
		bodyModel[47] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 142, 124, textureX, textureY); // Box 298
		bodyModel[49] = new ModelRendererTurbo(this, 94, 124, textureX, textureY); // Box 299
		bodyModel[50] = new ModelRendererTurbo(this, 144, 96, textureX, textureY); // Box 411
		bodyModel[51] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 412
		bodyModel[52] = new ModelRendererTurbo(this, 202, 63, textureX, textureY, "ditch"); // Box 446 ditchlight f1
		bodyModel[53] = new ModelRendererTurbo(this, 202, 68, textureX, textureY, "cull"); // Box 447 cull mec ditchlight
		bodyModel[54] = new ModelRendererTurbo(this, 111, 107, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[55] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[56] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[57] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[58] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[59] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[61] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[62] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[63] = new ModelRendererTurbo(this, 43, 152, textureX, textureY, "cull"); // Box 280 pw late plow
		bodyModel[64] = new ModelRendererTurbo(this, 89, 152, textureX, textureY, "cull"); // Box 285 pw late plow
		bodyModel[65] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 201
		bodyModel[66] = new ModelRendererTurbo(this, 142, 93, textureX, textureY); // Box 202
		bodyModel[67] = new ModelRendererTurbo(this, 135, 91, textureX, textureY); // Box 293
		bodyModel[68] = new ModelRendererTurbo(this, 144, 91, textureX, textureY); // Box 294
		bodyModel[69] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[70] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[71] = new ModelRendererTurbo(this, 223, 37, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[73] = new ModelRendererTurbo(this, 203, 173, textureX, textureY); // Box 630
		bodyModel[74] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[75] = new ModelRendererTurbo(this, 85, 54, textureX, textureY); // Box 298
		bodyModel[76] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[77] = new ModelRendererTurbo(this, 50, 57, textureX, textureY); // Box 300
		bodyModel[78] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Box 301
		bodyModel[79] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[80] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[81] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[82] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[83] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[84] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[85] = new ModelRendererTurbo(this, 10, 101, textureX, textureY, "cull"); // Box 316 cull nose handrail
		bodyModel[86] = new ModelRendererTurbo(this, 8, 96, textureX, textureY, "cull"); // Box 318 cull nose handrail
		bodyModel[87] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // Box 355 brakewheel
		bodyModel[88] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185 nose light mount block
		bodyModel[89] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[90] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[91] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[92] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 32
		bodyModel[93] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 688
		bodyModel[94] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		bodyModel[95] = new ModelRendererTurbo(this, 31, 9, textureX, textureY); // Box 24
		bodyModel[96] = new ModelRendererTurbo(this, 10, 7, textureX, textureY); // Box 28
		bodyModel[97] = new ModelRendererTurbo(this, 52, 7, textureX, textureY); // Box 30
		bodyModel[98] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[99] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[100] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[103] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[104] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[105] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[106] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[107] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[108] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[109] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[110] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[111] = new ModelRendererTurbo(this, 98, 6, textureX, textureY); // Box 52 door swing right
		bodyModel[112] = new ModelRendererTurbo(this, 56, 6, textureX, textureY); // Box 314 door swing right
		bodyModel[113] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123 sunshade fireman
		bodyModel[114] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311 sunshade engineer
		bodyModel[115] = new ModelRendererTurbo(this, 110, 3, textureX, textureY); // Box 165
		bodyModel[116] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 167
		bodyModel[117] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 117 numberboard
		bodyModel[118] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[119] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[120] = new ModelRendererTurbo(this, 16, 50, textureX, textureY); // Box 5
		bodyModel[121] = new ModelRendererTurbo(this, 18, 71, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[122] = new ModelRendererTurbo(this, 20, 66, textureX, textureY); // Box 5
		bodyModel[123] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48 ph1 headlight
		bodyModel[124] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up ph1
		bodyModel[125] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down ph1
		bodyModel[126] = new ModelRendererTurbo(this, 39, 54, textureX, textureY, "lamp"); // Box 118 numberboard
		bodyModel[127] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[128] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[129] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[130] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[131] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[132] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[133] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[134] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[135] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[136] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[137] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[138] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[139] = new ModelRendererTurbo(this, 422, 24, textureX, textureY); // Box 283
		bodyModel[140] = new ModelRendererTurbo(this, 417, 2, textureX, textureY); // Box 284
		bodyModel[141] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[142] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[143] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[144] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[145] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[146] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[147] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[148] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[149] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[150] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[151] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[152] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[153] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[154] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[155] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[156] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[157] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 paper filter (late units)
		bodyModel[158] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 165 numberboard
		bodyModel[159] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 167 numberboard
		bodyModel[160] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[161] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[162] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[163] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538 paper filter (late units)
		bodyModel[164] = new ModelRendererTurbo(this, 411, 186, textureX, textureY); // Box 547
		bodyModel[165] = new ModelRendererTurbo(this, 411, 202, textureX, textureY); // Box 548
		bodyModel[166] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[167] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114 bell hood mec
		bodyModel[168] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74 bell hood mec
		bodyModel[169] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78 bell hood mec
		bodyModel[170] = new ModelRendererTurbo(this, 190, 1, textureX, textureY); // Box 245 bell hood mec
		bodyModel[171] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 376
		bodyModel[172] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 377
		bodyModel[173] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 378
		bodyModel[174] = new ModelRendererTurbo(this, 245, 24, textureX, textureY); // Box 544
		bodyModel[175] = new ModelRendererTurbo(this, 263, 28, textureX, textureY); // Box 545
		bodyModel[176] = new ModelRendererTurbo(this, 244, 28, textureX, textureY); // Box 546
		bodyModel[177] = new ModelRendererTurbo(this, 203, 16, textureX, textureY); // Box 292
		bodyModel[178] = new ModelRendererTurbo(this, 215, 2, textureX, textureY); // Box 293
		bodyModel[179] = new ModelRendererTurbo(this, 213, 8, textureX, textureY); // Box 294
		bodyModel[180] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[181] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[182] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[183] = new ModelRendererTurbo(this, 103, 29, textureX, textureY); // Box 114
		bodyModel[184] = new ModelRendererTurbo(this, 103, 29, textureX, textureY); // Box 74
		bodyModel[185] = new ModelRendererTurbo(this, 103, 32, textureX, textureY); // Box 78
		bodyModel[186] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 19
		bodyModel[187] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 548
		bodyModel[188] = new ModelRendererTurbo(this, 238, 138, textureX, textureY); // Box 305 big fueltank holder
		bodyModel[189] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 305 
		bodyModel[190] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[191] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[192] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 19
		bodyModel[193] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 548
		bodyModel[194] = new ModelRendererTurbo(this, 322, 116, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[195] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 264
		bodyModel[196] = new ModelRendererTurbo(this, 238, 138, textureX, textureY); // Box 265 big fueltank holder
		bodyModel[197] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[198] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2 fuel tank
		bodyModel[199] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10 fuel tank
		bodyModel[200] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157 fuel tank
		bodyModel[201] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158 fuel tank
		bodyModel[202] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[203] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[204] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[205] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[206] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[207] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[208] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[209] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[210] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[211] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[212] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[213] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[214] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 18
		bodyModel[215] = new ModelRendererTurbo(this, 231, 72, textureX, textureY); // Box 21
		bodyModel[216] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[217] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[218] = new ModelRendererTurbo(this, 424, 129, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[219] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[220] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[221] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[222] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[223] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[224] = new ModelRendererTurbo(this, 90, 115, textureX, textureY); // Box 410
		bodyModel[225] = new ModelRendererTurbo(this, 90, 124, textureX, textureY); // Box 310
		bodyModel[226] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 250
		bodyModel[227] = new ModelRendererTurbo(this, 12, 136, textureX, textureY); // Box 33
		bodyModel[228] = new ModelRendererTurbo(this, 1, 130, textureX, textureY); // Box 37
		bodyModel[229] = new ModelRendererTurbo(this, 14, 130, textureX, textureY); // Box 38
		bodyModel[230] = new ModelRendererTurbo(this, 7, 127, textureX, textureY); // Box 557
		bodyModel[231] = new ModelRendererTurbo(this, 12, 127, textureX, textureY); // Box 558
		bodyModel[232] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[233] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[234] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[235] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[236] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[237] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 106 cab backbox
		bodyModel[238] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge?
		bodyModel[239] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[240] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[241] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[242] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[243] = new ModelRendererTurbo(this, 155, 79, textureX, textureY); // Box 285
		bodyModel[244] = new ModelRendererTurbo(this, 155, 90, textureX, textureY); // Box 300
		bodyModel[245] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[246] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[247] = new ModelRendererTurbo(this, 178, 81, textureX, textureY); // Box 288
		bodyModel[248] = new ModelRendererTurbo(this, 178, 90, textureX, textureY); // Box 303
		bodyModel[249] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[250] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418 horn fncc
		bodyModel[251] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419 horn fncc
		bodyModel[252] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420 horn fncc
		bodyModel[253] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421 horn fncc
		bodyModel[254] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745 horn scl mec
		bodyModel[255] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746 horn scl mec
		bodyModel[256] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747 horn scl mec
		bodyModel[257] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748 horn scl mec
		bodyModel[258] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785 sinclair fncc2
		bodyModel[259] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786 horn scl2
		bodyModel[260] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787 horn scl2
		bodyModel[261] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788 horn scl2
		bodyModel[262] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789 horn scl2
		bodyModel[263] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime1"); // Box 6 PRIME3-1
		bodyModel[264] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime3"); // Box 7 PRIME3-3
		bodyModel[265] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime2"); // Box 8 PRIME3-2
		bodyModel[266] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "prime4"); // Box 9 PRIME3-4
		bodyModel[267] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[268] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[269] = new ModelRendererTurbo(this, 136, 28, textureX, textureY); // Box 184 o2 generator
		bodyModel[270] = new ModelRendererTurbo(this, 112, 36, textureX, textureY); // Box 402 sinclair generic
		bodyModel[271] = new ModelRendererTurbo(this, 124, 68, textureX, textureY, "cull"); // Box 418 cull platform fncc
		bodyModel[272] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 308 sinclair fncc
		bodyModel[273] = new ModelRendererTurbo(this, 119, 36, textureX, textureY); // Box 438
		bodyModel[274] = new ModelRendererTurbo(this, 153, 71, textureX, textureY, "cull"); // Box 339 cull pw beacon holdy
		bodyModel[275] = new ModelRendererTurbo(this, 160, 71, textureX, textureY, "cull"); // Box 340 cull pw beacon holdy
		bodyModel[276] = new ModelRendererTurbo(this, 161, 67, textureX, textureY, "commander"); // Box 410 commander beacon pw
		bodyModel[277] = new ModelRendererTurbo(this, 154, 67, textureX, textureY, "commander"); // Box 342 commander beacon pw
		bodyModel[278] = new ModelRendererTurbo(this, 331, 117, textureX, textureY); // Box 382
		bodyModel[279] = new ModelRendererTurbo(this, 331, 117, textureX, textureY); // Box 383
		bodyModel[280] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime1"); // Box 6 PRIME4-1
		bodyModel[281] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime3"); // Box 7 PRIME4-3
		bodyModel[282] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime2"); // Box 8 PRIME4-2
		bodyModel[283] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "prime4"); // Box 9 PRIME4-4
		bodyModel[284] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428 prime base
		bodyModel[285] = new ModelRendererTurbo(this, 142, 63, textureX, textureY); // Box 279 firecraker mec ndem
		bodyModel[286] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 374 firecraker sbd
		bodyModel[287] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413 sinclair pick 9500
		bodyModel[288] = new ModelRendererTurbo(this, 177, 31, textureX, textureY); // Box 409 commander base
		bodyModel[289] = new ModelRendererTurbo(this, 177, 27, textureX, textureY, "commander"); // Box 410 commander beacon generic
		bodyModel[290] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354 horn pick 9502
		bodyModel[291] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355 horn pick 9502
		bodyModel[292] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356 horn pick 9502
		bodyModel[293] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357 horn pick 9502
		bodyModel[294] = new ModelRendererTurbo(this, 152, 42, textureX, textureY); // Box 427 horn csx sbd
		bodyModel[295] = new ModelRendererTurbo(this, 152, 45, textureX, textureY); // Box 428 horn csx sbd
		bodyModel[296] = new ModelRendererTurbo(this, 152, 48, textureX, textureY); // Box 429 horn csx sbd
		bodyModel[297] = new ModelRendererTurbo(this, 161, 45, textureX, textureY); // Box 430 horn csx sbd
		bodyModel[298] = new ModelRendererTurbo(this, 172, 31, textureX, textureY); // Box 409 commander base tall
		bodyModel[299] = new ModelRendererTurbo(this, 172, 27, textureX, textureY, "commander"); // Box 410 commander beacon mec
		bodyModel[300] = new ModelRendererTurbo(this, 245, 68, textureX, textureY); // Box 416 exhaust but taller lol
		bodyModel[301] = new ModelRendererTurbo(this, 144, 160, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[302] = new ModelRendererTurbo(this, 126, 159, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[303] = new ModelRendererTurbo(this, 148, 12, textureX, textureY); // Box 364 prime base
		bodyModel[304] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[305] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[306] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[307] = new ModelRendererTurbo(this, 148, 8, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[308] = new ModelRendererTurbo(this, 146, 16, textureX, textureY, "cull"); // Box 330 cull fncc beacon holder
		bodyModel[309] = new ModelRendererTurbo(this, 303, 204, textureX, textureY); // Box 413 smol fuel tank
		bodyModel[310] = new ModelRendererTurbo(this, 257, 197, textureX, textureY); // Box 414 smol fuel tank
		bodyModel[311] = new ModelRendererTurbo(this, 251, 218, textureX, textureY); // Box 415 smol fuel tank
		bodyModel[312] = new ModelRendererTurbo(this, 303, 219, textureX, textureY); // Box 416 smol fuel tank
		bodyModel[313] = new ModelRendererTurbo(this, 1, 186, textureX, textureY); // Box 376
		bodyModel[314] = new ModelRendererTurbo(this, 12, 188, textureX, textureY); // Box 377
		bodyModel[315] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 378 horn mount scl
		bodyModel[316] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 379 horn csx sbd
		bodyModel[317] = new ModelRendererTurbo(this, 145, 46, textureX, textureY); // Box 380 horn csx sbd
		bodyModel[318] = new ModelRendererTurbo(this, 144, 83, textureX, textureY); // Box 312 some scl units have these
		bodyModel[319] = new ModelRendererTurbo(this, 144, 83, textureX, textureY); // Box 313 some scl units have these
		bodyModel[320] = new ModelRendererTurbo(this, 135, 83, textureX, textureY); // Box 314 some scl units have these
		bodyModel[321] = new ModelRendererTurbo(this, 135, 83, textureX, textureY); // Box 315 some scl units have these
		bodyModel[322] = new ModelRendererTurbo(this, 236, 36, textureX, textureY); // Box 352 horn tugx
		bodyModel[323] = new ModelRendererTurbo(this, 227, 39, textureX, textureY); // Box 353 horn tugx
		bodyModel[324] = new ModelRendererTurbo(this, 227, 36, textureX, textureY); // Box 354 horn tugx
		bodyModel[325] = new ModelRendererTurbo(this, 227, 33, textureX, textureY); // Box 355 horn tugx
		bodyModel[326] = new ModelRendererTurbo(this, 157, 100, textureX, textureY); // Box 28 TUGX box
		bodyModel[327] = new ModelRendererTurbo(this, 185, 101, textureX, textureY); // Box 28 TXU box
		bodyModel[328] = new ModelRendererTurbo(this, 178, 103, textureX, textureY, "lamp"); // Box 28 RCO lights
		bodyModel[329] = new ModelRendererTurbo(this, 159, 102, textureX, textureY, "lamp"); // Box 28 RCO lights
		bodyModel[330] = new ModelRendererTurbo(this, 11, 76, textureX, textureY, "cull"); // Box 308 cull baffle ph2
		bodyModel[331] = new ModelRendererTurbo(this, 11, 76, textureX, textureY, "cull"); // Box 309 cull baffle ph2
		bodyModel[332] = new ModelRendererTurbo(this, 8, 51, textureX, textureY); // Box 48 ph2 headlight
		bodyModel[333] = new ModelRendererTurbo(this, 11, 66, textureX, textureY, "lamp"); // Box 186 Headlight Front up ph2
		bodyModel[334] = new ModelRendererTurbo(this, 11, 71, textureX, textureY, "lamp"); // Box 187 Headlight Front down ph2
		bodyModel[335] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 133 ph2 headlight
		bodyModel[336] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 187 ph2 headlight
		bodyModel[337] = new ModelRendererTurbo(this, 216, 69, textureX, textureY); // Box 101 pw ditchlight
		bodyModel[338] = new ModelRendererTurbo(this, 216, 64, textureX, textureY, "ditch"); // Box 278 ditchlight r2
		bodyModel[339] = new ModelRendererTurbo(this, 216, 69, textureX, textureY); // Box 440 pw ditchlight
		bodyModel[340] = new ModelRendererTurbo(this, 216, 64, textureX, textureY, "ditch"); // Box 441 ditchlight r2
		bodyModel[341] = new ModelRendererTurbo(this, 117, 40, textureX, textureY); // Box 371 sinclair pw
		bodyModel[342] = new ModelRendererTurbo(this, 195, 69, textureX, textureY); // Box 101 pw ditchlight
		bodyModel[343] = new ModelRendererTurbo(this, 195, 63, textureX, textureY, "ditch"); // Box 275 ditchlight f2
		bodyModel[344] = new ModelRendererTurbo(this, 195, 69, textureX, textureY); // Box 444 pw ditchlight
		bodyModel[345] = new ModelRendererTurbo(this, 195, 63, textureX, textureY, "ditch"); // Box 445 ditchlight f2
		bodyModel[346] = new ModelRendererTurbo(this, 127, 159, textureX, textureY); // Box 407
		bodyModel[347] = new ModelRendererTurbo(this, 445, 119, textureX, textureY); // Box 256
		bodyModel[348] = new ModelRendererTurbo(this, 97, 103, textureX, textureY); // Box 410
		bodyModel[349] = new ModelRendererTurbo(this, 80, 122, textureX, textureY); // Box 81
		bodyModel[350] = new ModelRendererTurbo(this, 77, 130, textureX, textureY); // Box 81
		bodyModel[351] = new ModelRendererTurbo(this, 77, 125, textureX, textureY); // Box 275
		bodyModel[352] = new ModelRendererTurbo(this, 77, 123, textureX, textureY); // Box 276
		bodyModel[353] = new ModelRendererTurbo(this, 144, 91, textureX, textureY); // Box 383
		bodyModel[354] = new ModelRendererTurbo(this, 142, 93, textureX, textureY); // Box 384
		bodyModel[355] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 385
		bodyModel[356] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 386
		bodyModel[357] = new ModelRendererTurbo(this, 144, 96, textureX, textureY); // Box 387
		bodyModel[358] = new ModelRendererTurbo(this, 142, 99, textureX, textureY); // Box 388
		bodyModel[359] = new ModelRendererTurbo(this, 135, 91, textureX, textureY); // Box 389
		bodyModel[360] = new ModelRendererTurbo(this, 133, 88, textureX, textureY); // Box 390
		bodyModel[361] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 391
		bodyModel[362] = new ModelRendererTurbo(this, 135, 96, textureX, textureY); // Box 392
		bodyModel[363] = new ModelRendererTurbo(this, 133, 99, textureX, textureY); // Box 393
		bodyModel[364] = new ModelRendererTurbo(this, 134, 86, textureX, textureY); // Box 394
		bodyModel[365] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 395
		bodyModel[366] = new ModelRendererTurbo(this, 235, 205, textureX, textureY); // Box 396 small fueltank holder
		bodyModel[367] = new ModelRendererTurbo(this, 235, 205, textureX, textureY); // Box 397 small fueltank holder
		bodyModel[368] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 398
		bodyModel[369] = new ModelRendererTurbo(this, 209, 140, textureX, textureY); // Box 399
		bodyModel[370] = new ModelRendererTurbo(this, 124, 171, textureX, textureY); // Box 440 honse
		bodyModel[371] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 371
		bodyModel[372] = new ModelRendererTurbo(this, 210, 55, textureX, textureY); // Box 372

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[0].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[1].setRotationPoint(37F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[2].setRotationPoint(33F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[3].setRotationPoint(33F, 7F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[4].setRotationPoint(33F, 7F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[5].setRotationPoint(37F, 8F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281 cull mec ditchlight
		bodyModel[6].setRotationPoint(36F, -4F, -5.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[7].setRotationPoint(31F, 1F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[8].setRotationPoint(33F, -1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[9].setRotationPoint(32F, 1F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[10].setRotationPoint(36.75F, -4F, -5.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[11].setRotationPoint(37F, 2.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[12].setRotationPoint(31F, 1F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[13].setRotationPoint(33F, -1F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[14].setRotationPoint(37.01F, -9F, -10F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[15].setRotationPoint(37.01F, -9F, 11F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442 cull mec ditchlight
		bodyModel[16].setRotationPoint(36F, -4F, 3.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[17].setRotationPoint(36.75F, -4F, 3.75F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[18].setRotationPoint(37F, -9F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[19].setRotationPoint(37F, -9F, 2F);

		bodyModel[20].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[20].setRotationPoint(37F, -1F, 2F);
		bodyModel[20].rotateAngleY = -3.14159265F;
		bodyModel[20].rotateAngleZ = -1.48352986F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[21].setRotationPoint(39F, 6F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[22].setRotationPoint(39F, 6F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[23].setRotationPoint(40F, 7F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[24].setRotationPoint(40F, 7F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[25].setRotationPoint(39F, 5F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[26].setRotationPoint(39F, 4F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[27].setRotationPoint(39F, 5F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[28].setRotationPoint(39F, 4F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[29].setRotationPoint(39F, 6F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[30].setRotationPoint(39F, 6F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[31].setRotationPoint(-37F, -1F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[32].setRotationPoint(-33F, 2F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[33].setRotationPoint(-34F, -1F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[34].setRotationPoint(-34F, 7F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 197
		bodyModel[35].setRotationPoint(-37F, 8F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[36].setRotationPoint(-34F, 7F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[37].setRotationPoint(-37F, -1F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[38].setRotationPoint(-37F, 2F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[39].setRotationPoint(-37F, -1F, -8F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[40].setRotationPoint(-37F, 2F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 205
		bodyModel[41].setRotationPoint(-37F, 8F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[42].setRotationPoint(-37F, 8F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252 cull mec ditchlight
		bodyModel[43].setRotationPoint(-37F, -4F, -5.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[44].setRotationPoint(-33F, 1F, 7F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[45].setRotationPoint(-34F, -1F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[46].setRotationPoint(-37.25F, -4F, -5.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[47].setRotationPoint(-38F, 2.5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[48].setRotationPoint(-37.01F, -9F, -10F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[49].setRotationPoint(-37.01F, -9F, 11F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[50].setRotationPoint(-37F, 6F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[51].setRotationPoint(-37F, 6F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[52].setRotationPoint(-37.25F, -4F, 3.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447 cull mec ditchlight
		bodyModel[53].setRotationPoint(-37F, -4F, 3.75F);

		bodyModel[54].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[54].setRotationPoint(-37F, -1F, -2F);
		bodyModel[54].rotateAngleZ = -1.48352986F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[55].setRotationPoint(-38F, -9F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[56].setRotationPoint(-38F, -9F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[57].setRotationPoint(-41F, 7F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[58].setRotationPoint(-41F, 7F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(-40F, 6F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[60].setRotationPoint(-40F, 4F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[61].setRotationPoint(-40F, 6F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[62].setRotationPoint(-40F, 4F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280 pw late plow
		bodyModel[63].setRotationPoint(-40F, 4F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285 pw late plow
		bodyModel[64].setRotationPoint(-40F, 4F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[65].setRotationPoint(-37F, 5F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[66].setRotationPoint(-37F, 5F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[67].setRotationPoint(-37F, 4F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[68].setRotationPoint(-37F, 4F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[69].setRotationPoint(-40F, 6F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[70].setRotationPoint(-40F, 6F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 66, 2, 22, 0F); // Box 0
		bodyModel[71].setRotationPoint(-33F, -1F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[72].setRotationPoint(-33F, 1.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 66, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[73].setRotationPoint(-33F, 1F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[74].setRotationPoint(-31F, -11F, 6.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 12, 14, 0F); // Box 298
		bodyModel[75].setRotationPoint(-33F, -13F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[76].setRotationPoint(-33F, -14F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[77].setRotationPoint(-33F, -14F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[78].setRotationPoint(-33F, -14F, 1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[79].setRotationPoint(-34F, -13F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[80].setRotationPoint(-34F, -13F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[81].setRotationPoint(-34F, -13F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[82].setRotationPoint(-33.85F, -12.7F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[83].setRotationPoint(-33.85F, -12.7F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[84].setRotationPoint(-32.5F, -14F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0F, 0F); // Box 316 cull nose handrail
		bodyModel[85].setRotationPoint(-32F, -13.75F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318 cull nose handrail
		bodyModel[86].setRotationPoint(-32F, -13.75F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[87].setRotationPoint(-33F, -13F, 7.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185 nose light mount block
		bodyModel[88].setRotationPoint(-33.75F, -13.75F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[89].setRotationPoint(-34.35F, -13.7F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[90].setRotationPoint(-34.35F, -13.7F, 0F);

		bodyModel[91].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[91].setRotationPoint(-31F, -5F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[92].setRotationPoint(-32F, -3F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[93].setRotationPoint(-32F, -5F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 7
		bodyModel[94].setRotationPoint(-27F, -18F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 11, 13, 1, 0F); // Box 24
		bodyModel[95].setRotationPoint(-27F, -18F, 10F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 28
		bodyModel[96].setRotationPoint(-16F, -18F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // Box 30
		bodyModel[97].setRotationPoint(-28F, -18F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[98].setRotationPoint(-28F, -21F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[99].setRotationPoint(-28F, -21F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[100].setRotationPoint(-16F, -21F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[101].setRotationPoint(-28F, -21F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[102].setRotationPoint(-27F, -22F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[103].setRotationPoint(-28F, -22F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[104].setRotationPoint(-16F, -22F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[105].setRotationPoint(-28F, -22F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[106].setRotationPoint(-16F, -22F, 1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[107].setRotationPoint(-16F, -21F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[108].setRotationPoint(-16F, -21F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[109].setRotationPoint(-27F, -22F, 1F);

		bodyModel[110].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[110].setRotationPoint(-28F, -22F, -1F);

		bodyModel[111].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 52 door swing right
		bodyModel[111].setRotationPoint(-27.5F, -18F, -10.5F);

		bodyModel[112].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[112].setRotationPoint(-15.5F, -18F, 10.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123 sunshade fireman
		bodyModel[113].setRotationPoint(-26F, -18F, -11F);
		bodyModel[113].rotateAngleX = -0.61086524F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311 sunshade engineer
		bodyModel[114].setRotationPoint(-26F, -18F, 11F);
		bodyModel[114].rotateAngleX = 0.61086524F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[115].setRotationPoint(-27F, -19F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[116].setRotationPoint(-27F, -19F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0.25F, 0F, -0.05F, 0.25F); // Box 117 numberboard
		bodyModel[117].setRotationPoint(-29.05F, -21F, -1.5F);
		bodyModel[117].rotateAngleY = 0.13089969F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 43
		bodyModel[118].setRotationPoint(-29F, -21F, -6.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[119].setRotationPoint(-24F, -17F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[120].setRotationPoint(-24F, -18F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 cull aww
		bodyModel[121].setRotationPoint(-24F, -17F, -15F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[122].setRotationPoint(-24F, -18F, -13F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48 ph1 headlight
		bodyModel[123].setRotationPoint(-29F, -22F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up ph1
		bodyModel[124].setRotationPoint(-29.1F, -22F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down ph1
		bodyModel[125].setRotationPoint(-29.1F, -20F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0.5F, 1, 2, 5, 0F,0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.25F, -0.5F, -0.05F, 0.25F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 118 numberboard
		bodyModel[126].setRotationPoint(-29.05F, -21F, 1F);
		bodyModel[126].rotateAngleY = -0.13089969F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 175
		bodyModel[127].setRotationPoint(-29F, -21F, 1F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 148
		bodyModel[128].setRotationPoint(33F, -21F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[129].setRotationPoint(33F, -21F, 1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 20, 7, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[130].setRotationPoint(33F, -21F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[131].setRotationPoint(33.1F, -16F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[132].setRotationPoint(33.1F, -18F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[133].setRotationPoint(31F, -23.5F, 3.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[134].setRotationPoint(32.5F, -22.75F, 2.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[135].setRotationPoint(31.5F, -23.5F, 1.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[136].setRotationPoint(31F, -23.75F, 2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[137].setRotationPoint(32.85F, -14F, -7F);
		bodyModel[137].rotateAngleY = -0.05235988F;

		bodyModel[138].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[138].setRotationPoint(32.85F, -14F, 7F);
		bodyModel[138].rotateAngleY = 0.05235988F;

		bodyModel[139].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 283
		bodyModel[139].setRotationPoint(12F, -18F, -7.75F);

		bodyModel[140].addBox(0F, 0F, 0F, 21, 17, 1, 0F); // Box 284
		bodyModel[140].setRotationPoint(12F, -18F, 6.75F);

		bodyModel[141].addBox(0F, 0F, 0F, 21, 3, 16, 0F); // Box 298
		bodyModel[141].setRotationPoint(12F, -21F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[142].setRotationPoint(12F, -22F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[143].setRotationPoint(12F, -22F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[144].setRotationPoint(12F, -22F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[145].setRotationPoint(32F, -22F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[146].setRotationPoint(33F, -22F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 279
		bodyModel[147].setRotationPoint(33F, -22F, 1F);

		bodyModel[148].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[148].setRotationPoint(33F, -22.25F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[149].setRotationPoint(32.8F, -20F, -7.5F);
		bodyModel[149].rotateAngleY = -0.05235988F;

		bodyModel[150].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[150].setRotationPoint(32.8F, -20F, 7.5F);
		bodyModel[150].rotateAngleY = 0.05235988F;

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[151].setRotationPoint(33.75F, -20.25F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[152].setRotationPoint(34.5F, -20.2F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[153].setRotationPoint(34.5F, -20.2F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[154].setRotationPoint(21.75F, -14F, 7.3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[155].setRotationPoint(19F, -14F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[156].setRotationPoint(16F, -14F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 paper filter (late units)
		bodyModel[157].setRotationPoint(12.5F, -8F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 165 numberboard
		bodyModel[158].setRotationPoint(33.3F, -18F, -6.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 167 numberboard
		bodyModel[159].setRotationPoint(33.3F, -18F, 1.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[160].setRotationPoint(19F, -14F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[161].setRotationPoint(21.75F, -14F, -8.3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[162].setRotationPoint(16F, -14F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538 paper filter (late units)
		bodyModel[163].setRotationPoint(12.5F, -8F, -8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 38, 0, 14, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 1F, -7F, 0F, 1F, -7F); // Box 547
		bodyModel[164].setRotationPoint(13F, -22.51F, 1F);

		bodyModel[165].addShapeBox(0F, 0F, -14F, 38, 0, 14, 0F,0F, -1F, -7F, -19F, -1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, -19F, 1F, -7F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[165].setRotationPoint(13F, -22.51F, -1F);

		bodyModel[166].addBox(0F, 0F, 0F, 47, 19, 14, 0F); // Box 6
		bodyModel[166].setRotationPoint(-15F, -20F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114 bell hood mec
		bodyModel[167].setRotationPoint(-14F, -18.25F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 bell hood mec
		bodyModel[168].setRotationPoint(-14F, -19.25F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 bell hood mec
		bodyModel[169].setRotationPoint(-13.75F, -17.75F, -8.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245 bell hood mec
		bodyModel[170].setRotationPoint(-14F, -20.25F, -8.8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[171].setRotationPoint(-13.5F, -16.5F, 6.15F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[172].setRotationPoint(-9F, -16.5F, 6.15F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[173].setRotationPoint(-13.5F, -19F, 6.15F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[174].setRotationPoint(-13.5F, -19F, -7.15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[175].setRotationPoint(-13.5F, -16.5F, -7.15F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[176].setRotationPoint(-11F, -16.5F, -7.15F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[177].setRotationPoint(-15F, -21F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[178].setRotationPoint(-15F, -21F, 3F);

		bodyModel[179].addBox(0F, 0F, 0F, 27, 1, 6, 0F); // Box 294
		bodyModel[179].setRotationPoint(-15F, -21F, -3F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[180].setRotationPoint(-8F, 4F, -9F);

		bodyModel[181].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[181].setRotationPoint(-7.5F, 6F, -9.5F);
		bodyModel[181].rotateAngleZ = 0.10471976F;

		bodyModel[182].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[182].setRotationPoint(-7.5F, 5.5F, 10.01F);
		bodyModel[182].rotateAngleZ = -0.2268928F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[183].setRotationPoint(-7.5F, 2.5F, 8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[184].setRotationPoint(-7.5F, 1.5F, 8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[185].setRotationPoint(-7.25F, 3F, 8.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[186].setRotationPoint(-9F, 5F, -9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[187].setRotationPoint(-7F, 5F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -3F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -3F, -0.125F); // Box 305 big fueltank holder
		bodyModel[188].setRotationPoint(-9F, 3F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 305 
		bodyModel[189].setRotationPoint(-9F, 2F, -6.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[190].setRotationPoint(7F, 4F, -9F);

		bodyModel[191].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[191].setRotationPoint(7.5F, 6F, -9.5F);
		bodyModel[191].rotateAngleZ = -0.10471976F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[192].setRotationPoint(6F, 5F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[193].setRotationPoint(8F, 5F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[194].setRotationPoint(6.25F, 0.5F, 8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 264
		bodyModel[195].setRotationPoint(8F, 2F, -6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -3F, -0.125F, 0F, -3F, -0.125F, 0F, -0.5F, -0.125F); // Box 265 big fueltank holder
		bodyModel[196].setRotationPoint(6F, 3F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[197].setRotationPoint(6F, 1F, 8.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Box 2 fuel tank
		bodyModel[198].setRotationPoint(-6F, 5F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 12, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10 fuel tank
		bodyModel[199].setRotationPoint(-6F, 2F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157 fuel tank
		bodyModel[200].setRotationPoint(-6F, 5F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158 fuel tank
		bodyModel[201].setRotationPoint(-6F, 5F, 8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 66, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[202].setRotationPoint(-33F, 1F, -7F);

		bodyModel[203].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[203].setRotationPoint(-27F, 1F, 9F);
		bodyModel[203].rotateAngleZ = -0.27925268F;

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[204].setRotationPoint(-30F, 1F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 66, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[205].setRotationPoint(-33F, 2.75F, -7.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[206].setRotationPoint(18.5F, 1F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[207].setRotationPoint(19.5F, 2F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[208].setRotationPoint(19.5F, 2F, 6F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[209].setRotationPoint(18.5F, 2.5F, -2F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[210].setRotationPoint(-22.5F, 2.5F, -2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[211].setRotationPoint(-22.5F, 1F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[212].setRotationPoint(-21.5F, 2F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[213].setRotationPoint(-21.5F, 2F, 6F);

		bodyModel[214].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[214].setRotationPoint(6.5F, -22.5F, -2.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[215].setRotationPoint(6F, -21.5F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[216].setRotationPoint(37F, -1F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[217].setRotationPoint(37F, -1F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[218].setRotationPoint(36.75F, -1F, -5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[219].setRotationPoint(36.75F, -1F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[220].setRotationPoint(-38F, -1F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[221].setRotationPoint(-38F, -1F, 2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[222].setRotationPoint(-37.75F, -1F, -5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[223].setRotationPoint(-37.75F, -1F, 3F);

		bodyModel[224].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[224].setRotationPoint(-33F, -13F, 11F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 17, 0, 0F); // Box 310
		bodyModel[225].setRotationPoint(-34F, -13F, 11F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 250
		bodyModel[226].setRotationPoint(-34F, -13F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 33
		bodyModel[227].setRotationPoint(-32F, -5F, 7F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[228].setRotationPoint(-6F, -3F, -10F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[229].setRotationPoint(-6F, -3F, 7F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[230].setRotationPoint(-6F, -5F, -11F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[231].setRotationPoint(-6F, -5F, 10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[232].setRotationPoint(-20.8F, -15F, 1F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[233].setRotationPoint(-27.5F, -13F, 3F);
		bodyModel[233].rotateAngleY = -0.45378561F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[234].setRotationPoint(-27.5F, -15F, 3F);
		bodyModel[234].rotateAngleY = -0.45378561F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[235].setRotationPoint(-27.5F, -9F, 3F);
		bodyModel[235].rotateAngleY = -0.45378561F;

		bodyModel[236].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[236].setRotationPoint(-27F, -18F, 6.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 12, 24, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -0.5F, 0F, -12F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -12F, -0.5F, -6F, -12F); // Box 106 cab backbox
		bodyModel[237].setRotationPoint(-17.5F, -21F, -6F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge?
		bodyModel[238].setRotationPoint(-18F, -13F, -5F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[239].setRotationPoint(34F, -9F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[240].setRotationPoint(34F, -4F, -11.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[241].setRotationPoint(34F, -4F, 10.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[242].setRotationPoint(34F, -9F, 9F);

		bodyModel[243].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[243].setRotationPoint(-15F, -13F, 11F);

		bodyModel[244].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[244].setRotationPoint(-15F, -13F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[245].setRotationPoint(-4F, -13F, -11.01F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[246].setRotationPoint(-4F, -13F, 11.01F);

		bodyModel[247].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 288
		bodyModel[247].setRotationPoint(0F, -9F, 11F);

		bodyModel[248].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 303
		bodyModel[248].setRotationPoint(0F, -9F, -11F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[249].setRotationPoint(-14F, -23F, -1.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418 horn fncc
		bodyModel[250].setRotationPoint(0.5F, -21F, -6.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419 horn fncc
		bodyModel[251].setRotationPoint(-1F, -21.75F, -5.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420 horn fncc
		bodyModel[252].setRotationPoint(-2F, -22F, -6.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421 horn fncc
		bodyModel[253].setRotationPoint(-0.5F, -21.75F, -7.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745 horn scl mec
		bodyModel[254].setRotationPoint(-11.5F, -22.25F, -0.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746 horn scl mec
		bodyModel[255].setRotationPoint(-14F, -23.25F, -0.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747 horn scl mec
		bodyModel[256].setRotationPoint(-13F, -23F, 0.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748 horn scl mec
		bodyModel[257].setRotationPoint(-12.5F, -23F, -1.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785 sinclair fncc2
		bodyModel[258].setRotationPoint(-18F, -24F, -2F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786 horn scl2
		bodyModel[259].setRotationPoint(-11.5F, -21.5F, -4.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787 horn scl2
		bodyModel[260].setRotationPoint(-12F, -22.25F, -3.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788 horn scl2
		bodyModel[261].setRotationPoint(-14F, -22.5F, -4.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789 horn scl2
		bodyModel[262].setRotationPoint(-13F, -22.25F, -5.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[263].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[264].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[265].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[266].setRotationPoint(-25F, -22.5F, 7.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[267].setRotationPoint(-25.5F, -21F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[268].setRotationPoint(-25F, -22F, 7.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[269].setRotationPoint(-25.5F, -23F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402 sinclair generic
		bodyModel[270].setRotationPoint(-19F, -23F, 0F);

		bodyModel[271].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform fncc
		bodyModel[271].setRotationPoint(-20.1F, -23F, -2.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308 sinclair fncc
		bodyModel[272].setRotationPoint(-19.1F, -24F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[273].setRotationPoint(-19F, -22F, 7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 339 cull pw beacon holdy
		bodyModel[274].setRotationPoint(-22F, -21F, 7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 cull pw beacon holdy
		bodyModel[275].setRotationPoint(-22F, -21F, -9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon pw
		bodyModel[276].setRotationPoint(-22F, -22.75F, -8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon pw
		bodyModel[277].setRotationPoint(-22F, -22.75F, 7.5F);

		bodyModel[278].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[278].setRotationPoint(-1F, 1.5F, -11.25F);
		bodyModel[278].rotateAngleX = 1.57079633F;

		bodyModel[279].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[279].setRotationPoint(-1F, 1.5F, 11.25F);
		bodyModel[279].rotateAngleX = -1.57079633F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[280].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[281].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[282].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[283].setRotationPoint(-27F, -23.5F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[284].setRotationPoint(-27F, -23F, -1F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279 firecraker mec ndem
		bodyModel[285].setRotationPoint(-23F, -24F, 0F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374 firecraker sbd
		bodyModel[286].setRotationPoint(-27F, -24F, 0F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 sinclair pick 9500
		bodyModel[287].setRotationPoint(-20F, -23F, 0F);
		bodyModel[287].rotateAngleY = -3.14159265F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[288].setRotationPoint(-22F, -23F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon generic
		bodyModel[289].setRotationPoint(-22F, -24F, -0.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354 horn pick 9502
		bodyModel[290].setRotationPoint(-29F, -23.5F, -2.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355 horn pick 9502
		bodyModel[291].setRotationPoint(-28F, -23.25F, -1.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356 horn pick 9502
		bodyModel[292].setRotationPoint(-28.5F, -23.25F, -3.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357 horn pick 9502
		bodyModel[293].setRotationPoint(-26.5F, -22.5F, -2.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427 horn csx sbd
		bodyModel[294].setRotationPoint(-29F, -23.5F, -1.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 428 horn csx sbd
		bodyModel[295].setRotationPoint(-28F, -23.5F, -0.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 429 horn csx sbd
		bodyModel[296].setRotationPoint(-29F, -23.5F, 0.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 430 horn csx sbd
		bodyModel[297].setRotationPoint(-27.5F, -22.5F, -0.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base tall
		bodyModel[298].setRotationPoint(-26F, -23F, -0.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon mec
		bodyModel[299].setRotationPoint(-26F, -24.5F, -0.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 416 exhaust but taller lol
		bodyModel[300].setRotationPoint(6.5F, -23.5F, -2.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 314 cull anticlimber
		bodyModel[301].setRotationPoint(-38F, -1F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F); // Box 315 cull anticlimber
		bodyModel[302].setRotationPoint(-39.25F, -1F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[303].setRotationPoint(-29F, -24F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[304].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[305].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[306].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[307].setRotationPoint(-29F, -24.5F, -1F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 330 cull fncc beacon holder
		bodyModel[308].setRotationPoint(-29F, -23F, -1.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 smol fuel tank
		bodyModel[309].setRotationPoint(-4F, 5F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 8, 4, 16, 0F); // Box 414 smol fuel tank
		bodyModel[310].setRotationPoint(-4F, 5F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415 smol fuel tank
		bodyModel[311].setRotationPoint(-4F, 2F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 416 smol fuel tank
		bodyModel[312].setRotationPoint(-4F, 5F, 8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 376
		bodyModel[313].setRotationPoint(-40F, 3F, 2F);

		bodyModel[314].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 377
		bodyModel[314].setRotationPoint(-40F, 3F, -8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 378 horn mount scl
		bodyModel[315].setRotationPoint(-11.5F, -21.25F, -0.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 379 horn csx sbd
		bodyModel[316].setRotationPoint(-28F, -24.5F, -1.15F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380 horn csx sbd
		bodyModel[317].setRotationPoint(-28F, -24.5F, 0.15F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312 some scl units have these
		bodyModel[318].setRotationPoint(-35F, -1F, -10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 313 some scl units have these
		bodyModel[319].setRotationPoint(-35F, -1F, 8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 314 some scl units have these
		bodyModel[320].setRotationPoint(34F, -1F, 8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315 some scl units have these
		bodyModel[321].setRotationPoint(34F, -1F, -10F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 352 horn tugx
		bodyModel[322].setRotationPoint(-25.5F, -21.25F, 6.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 353 horn tugx
		bodyModel[323].setRotationPoint(-27.5F, -22.5F, 5.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354 horn tugx
		bodyModel[324].setRotationPoint(-25.5F, -22.25F, 6.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 355 horn tugx
		bodyModel[325].setRotationPoint(-28.5F, -22F, 7.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 3, 12, 0F); // Box 28 TUGX box
		bodyModel[326].setRotationPoint(-14.5F, -22.5F, -6F);

		bodyModel[327].addBox(0F, 0F, 0F, 5, 5, 4, 0F); // Box 28 TXU box
		bodyModel[327].setRotationPoint(-14.5F, -10F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 28 RCO lights
		bodyModel[328].setRotationPoint(-10.5F, -10F, -12F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 28 RCO lights
		bodyModel[329].setRotationPoint(-31F, -10F, 10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 cull baffle ph2
		bodyModel[330].setRotationPoint(-29.85F, -18.95F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 cull baffle ph2
		bodyModel[331].setRotationPoint(-29.85F, -20.85F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48 ph2 headlight
		bodyModel[332].setRotationPoint(-29F, -21.75F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up ph2
		bodyModel[333].setRotationPoint(-29.1F, -21.85F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down ph2
		bodyModel[334].setRotationPoint(-29.1F, -19.95F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133 ph2 headlight
		bodyModel[335].setRotationPoint(-29F, -18.25F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 ph2 headlight
		bodyModel[336].setRotationPoint(-29F, -22.5F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101 pw ditchlight
		bodyModel[337].setRotationPoint(37F, -1F, -7.75F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[338].setRotationPoint(37.25F, -1F, -7.75F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440 pw ditchlight
		bodyModel[339].setRotationPoint(37F, -1F, 5.75F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[340].setRotationPoint(37.25F, -1F, 5.75F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 371 sinclair pw
		bodyModel[341].setRotationPoint(-24F, -23F, 0F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101 pw ditchlight
		bodyModel[342].setRotationPoint(-37.5F, 0F, -7.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[343].setRotationPoint(-37.75F, 0F, -7.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444 pw ditchlight
		bodyModel[344].setRotationPoint(-37.5F, 0F, 5.75F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[345].setRotationPoint(-37.75F, 0F, 5.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 407
		bodyModel[346].setRotationPoint(-39.5F, 0.25F, -3F);

		bodyModel[347].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 256
		bodyModel[347].setRotationPoint(37.01F, -9F, -11F);

		bodyModel[348].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 410
		bodyModel[348].setRotationPoint(-37.01F, -9F, -11F);

		bodyModel[349].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 81
		bodyModel[349].setRotationPoint(-34.01F, -8F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[350].setRotationPoint(-34.01F, -5F, -11.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[351].setRotationPoint(-34F, -12F, -9.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[352].setRotationPoint(-34F, -13F, -11F);

		bodyModel[353].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 383
		bodyModel[353].setRotationPoint(34F, 4F, -8F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 384
		bodyModel[354].setRotationPoint(34F, 5F, -10F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 385
		bodyModel[355].setRotationPoint(34F, 2F, -9F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 386
		bodyModel[356].setRotationPoint(34F, -1F, -8F);

		bodyModel[357].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 387
		bodyModel[357].setRotationPoint(34F, 6F, -9F);

		bodyModel[358].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 388
		bodyModel[358].setRotationPoint(34F, 8F, -11F);

		bodyModel[359].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 389
		bodyModel[359].setRotationPoint(34F, 4F, 8F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 390
		bodyModel[360].setRotationPoint(34F, 2F, 7F);

		bodyModel[361].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 391
		bodyModel[361].setRotationPoint(34F, 5F, 8F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 392
		bodyModel[362].setRotationPoint(34F, 6F, 9F);

		bodyModel[363].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 393
		bodyModel[363].setRotationPoint(34F, 8F, 9F);

		bodyModel[364].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 394
		bodyModel[364].setRotationPoint(34F, -1F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[365].setRotationPoint(-37F, 1F, -3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -2F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -2F, -0.125F); // Box 396 small fueltank holder
		bodyModel[366].setRotationPoint(-6F, 3F, -7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -2F, -0.125F, 0F, -2F, -0.125F, 0F, -0.5F, -0.125F); // Box 397 small fueltank holder
		bodyModel[367].setRotationPoint(3F, 3F, -7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 398
		bodyModel[368].setRotationPoint(-7F, 2F, -6.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 399
		bodyModel[369].setRotationPoint(6F, 2F, -6.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 0, 4, 9, 0F); // Box 440 honse
		bodyModel[370].setRotationPoint(-37.25F, 0F, -4.5F);
		bodyModel[370].rotateAngleZ = -0.31415927F;

		bodyModel[371].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 371
		bodyModel[371].setRotationPoint(-12F, -22.5F, 1.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 372
		bodyModel[372].setRotationPoint(-12F, -22.5F, -2.5F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6||GetColor(entity) == 7324) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.28, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 6324||GetColor(entity) == 2436){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 3 ||GetColor(entity) == 18){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 421 || GetColor(entity) == 923){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 22 || GetColor(entity) == 24){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/BlombergB_csxbleu.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 16){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_sv_402.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 17){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_sv_406.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glTranslated(1.28, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.58, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}