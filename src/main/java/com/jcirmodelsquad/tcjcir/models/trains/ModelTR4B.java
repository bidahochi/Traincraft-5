//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.02.2021 - 19:32:16
// Last changed on: 17.02.2021 - 19:32:16

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
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelTR4B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelTR4B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[385];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 89
		bodyModel[1] = new ModelRendererTurbo(this, 216, 210, textureX, textureY); // Box 202
		bodyModel[2] = new ModelRendererTurbo(this, 175, 214, textureX, textureY); // Box 203
		bodyModel[3] = new ModelRendererTurbo(this, 18, 192, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 28, 173, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 166
		bodyModel[8] = new ModelRendererTurbo(this, 59, 76, textureX, textureY); // Box 167
		bodyModel[9] = new ModelRendererTurbo(this, 17, 76, textureX, textureY); // Box 170
		bodyModel[10] = new ModelRendererTurbo(this, 49, 156, textureX, textureY); // Box 489
		bodyModel[11] = new ModelRendererTurbo(this, 16, 97, textureX, textureY); // Box 546
		bodyModel[12] = new ModelRendererTurbo(this, 14, 174, textureX, textureY); // Box 389
		bodyModel[13] = new ModelRendererTurbo(this, 12, 177, textureX, textureY); // Box 390
		bodyModel[14] = new ModelRendererTurbo(this, 12, 171, textureX, textureY); // Box 391
		bodyModel[15] = new ModelRendererTurbo(this, 14, 168, textureX, textureY); // Box 392
		bodyModel[16] = new ModelRendererTurbo(this, 12, 165, textureX, textureY); // Box 393
		bodyModel[17] = new ModelRendererTurbo(this, 14, 162, textureX, textureY); // Box 394
		bodyModel[18] = new ModelRendererTurbo(this, 36, 156, textureX, textureY); // Box 135
		bodyModel[19] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 16, 206, textureX, textureY); // Box 146
		bodyModel[21] = new ModelRendererTurbo(this, 63, 173, textureX, textureY); // Box 184
		bodyModel[22] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 388
		bodyModel[23] = new ModelRendererTurbo(this, 49, 141, textureX, textureY); // Box 490
		bodyModel[24] = new ModelRendererTurbo(this, 36, 141, textureX, textureY); // Box 491
		bodyModel[25] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 108
		bodyModel[26] = new ModelRendererTurbo(this, 40, 190, textureX, textureY); // Box 196
		bodyModel[27] = new ModelRendererTurbo(this, 40, 188, textureX, textureY); // Box 199
		bodyModel[28] = new ModelRendererTurbo(this, 290, 164, textureX, textureY); // Box 5 hood
		bodyModel[29] = new ModelRendererTurbo(this, 298, 153, textureX, textureY); // Box 19
		bodyModel[30] = new ModelRendererTurbo(this, 298, 142, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 381, 166, textureX, textureY); // Box 107
		bodyModel[32] = new ModelRendererTurbo(this, 262, 178, textureX, textureY,"cull"); // Box 138 cull fan cover
		bodyModel[33] = new ModelRendererTurbo(this, 389, 155, textureX, textureY); // Box 396
		bodyModel[34] = new ModelRendererTurbo(this, 389, 144, textureX, textureY); // Box 397
		bodyModel[35] = new ModelRendererTurbo(this, 305, 135, textureX, textureY); // Box 390
		bodyModel[36] = new ModelRendererTurbo(this, 305, 135, textureX, textureY); // Box 391
		bodyModel[37] = new ModelRendererTurbo(this, 365, 135, textureX, textureY); // Box 392
		bodyModel[38] = new ModelRendererTurbo(this, 365, 135, textureX, textureY); // Box 393
		bodyModel[39] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 129
		bodyModel[41] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 130
		bodyModel[42] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 133
		bodyModel[43] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 134
		bodyModel[44] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 337
		bodyModel[45] = new ModelRendererTurbo(this, 1, 165, textureX, textureY); // Box 338
		bodyModel[46] = new ModelRendererTurbo(this, 3, 168, textureX, textureY); // Box 339
		bodyModel[47] = new ModelRendererTurbo(this, 1, 171, textureX, textureY); // Box 340
		bodyModel[48] = new ModelRendererTurbo(this, 3, 174, textureX, textureY); // Box 341
		bodyModel[49] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 342
		bodyModel[50] = new ModelRendererTurbo(this, 350, 10, textureX, textureY); // Box 188
		bodyModel[51] = new ModelRendererTurbo(this, 350, 25, textureX, textureY); // Box 190
		bodyModel[52] = new ModelRendererTurbo(this, 254, 157, textureX, textureY); // Box 147
		bodyModel[53] = new ModelRendererTurbo(this, 256, 153, textureX, textureY); // Box 148
		bodyModel[54] = new ModelRendererTurbo(this, 275, 153, textureX, textureY,"lamp"); // Box 171 headlight front 2beam
		bodyModel[55] = new ModelRendererTurbo(this, 275, 153, textureX, textureY,"lamp"); // Box 172 headlight front 2beam
		bodyModel[56] = new ModelRendererTurbo(this, 256, 153, textureX, textureY); // Box 173
		bodyModel[57] = new ModelRendererTurbo(this, 246, 154, textureX, textureY,"lamp"); // Box 167 numberboard front single
		bodyModel[58] = new ModelRendererTurbo(this, 246, 154, textureX, textureY,"lamp"); // Box 168 numberboard front single
		bodyModel[59] = new ModelRendererTurbo(this, 245, 157, textureX, textureY,"lamp"); // Box 169 headlight front big
		bodyModel[60] = new ModelRendererTurbo(this, 230, 10, textureX, textureY); // Box 371
		bodyModel[61] = new ModelRendererTurbo(this, 230, 8, textureX, textureY); // Box 372
		bodyModel[62] = new ModelRendererTurbo(this, 230, 25, textureX, textureY); // Box 373
		bodyModel[63] = new ModelRendererTurbo(this, 230, 23, textureX, textureY); // Box 374
		bodyModel[64] = new ModelRendererTurbo(this, 1, 214, textureX, textureY); // Box 375
		bodyModel[65] = new ModelRendererTurbo(this, 238, 8, textureX, textureY); // Box 376
		bodyModel[66] = new ModelRendererTurbo(this, 238, 23, textureX, textureY); // Box 377
		bodyModel[67] = new ModelRendererTurbo(this, 283, 157, textureX, textureY); // Box 382
		bodyModel[68] = new ModelRendererTurbo(this, 274, 158, textureX, textureY); // Box 383
		bodyModel[69] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 384
		bodyModel[70] = new ModelRendererTurbo(this, 284, 153, textureX, textureY); // Box 387
		bodyModel[71] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Box 388
		bodyModel[72] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 389
		bodyModel[73] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 390
		bodyModel[74] = new ModelRendererTurbo(this, 6, 196, textureX, textureY); // Box 391
		bodyModel[75] = new ModelRendererTurbo(this, 3, 200, textureX, textureY); // Box 392
		bodyModel[76] = new ModelRendererTurbo(this, 321, 117, textureX, textureY); // Box 383
		bodyModel[77] = new ModelRendererTurbo(this, 491, 4, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 475, 6, textureX, textureY); // Box 148
		bodyModel[79] = new ModelRendererTurbo(this, 475, 6, textureX, textureY); // Box 173
		bodyModel[80] = new ModelRendererTurbo(this, 482, 4, textureX, textureY,"lamp"); // Box 169 headlight front big
		bodyModel[81] = new ModelRendererTurbo(this, 482, 25, textureX, textureY,"lamp"); // Box 171 headlight front 2beam
		bodyModel[82] = new ModelRendererTurbo(this, 482, 25, textureX, textureY,"lamp"); // Box 172 headlight front 2beam
		bodyModel[83] = new ModelRendererTurbo(this, 490, 29, textureX, textureY); // Box 382
		bodyModel[84] = new ModelRendererTurbo(this, 481, 30, textureX, textureY); // Box 383
		bodyModel[85] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 384
		bodyModel[86] = new ModelRendererTurbo(this, 491, 25, textureX, textureY); // Box 387
		bodyModel[87] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 1081 air tank support
		bodyModel[88] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Box 398
		bodyModel[89] = new ModelRendererTurbo(this, 62, 162, textureX, textureY); // Box 399
		bodyModel[90] = new ModelRendererTurbo(this, 62, 154, textureX, textureY); // Box 400
		bodyModel[91] = new ModelRendererTurbo(this, 27, 154, textureX, textureY); // Box 401
		bodyModel[92] = new ModelRendererTurbo(this, 19, 78, textureX, textureY); // Box 1086
		bodyModel[93] = new ModelRendererTurbo(this, 241, 10, textureX, textureY); // Box 1096
		bodyModel[94] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1097
		bodyModel[95] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 184
		bodyModel[96] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 185
		bodyModel[97] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 186
		bodyModel[98] = new ModelRendererTurbo(this, 176, 228, textureX, textureY); // Box 187 air tank support
		bodyModel[99] = new ModelRendererTurbo(this, 296, 114, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 296, 111, textureX, textureY); // Box 74
		bodyModel[101] = new ModelRendererTurbo(this, 296, 117, textureX, textureY); // Box 78
		bodyModel[102] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 623
		bodyModel[103] = new ModelRendererTurbo(this, 293, 121, textureX, textureY,"lamp"); // Box 625 sp numerbboard
		bodyModel[104] = new ModelRendererTurbo(this, 293, 121, textureX, textureY,"lamp"); // Box 626 sp numberboard
		bodyModel[105] = new ModelRendererTurbo(this, 292, 125, textureX, textureY); // Box 627
		bodyModel[106] = new ModelRendererTurbo(this, 288, 134, textureX, textureY); // Box 214
		bodyModel[107] = new ModelRendererTurbo(this, 290, 134, textureX, textureY); // Box 215
		bodyModel[108] = new ModelRendererTurbo(this, 267, 158, textureX, textureY,"cull"); // Box 219 cull headlight enclosure
		bodyModel[109] = new ModelRendererTurbo(this, 474, 30, textureX, textureY,"cull"); // Box 220 cull headlight enclosure
		bodyModel[110] = new ModelRendererTurbo(this, 307, 115, textureX, textureY); // Box 538
		bodyModel[111] = new ModelRendererTurbo(this, 307, 110, textureX, textureY); // Box 539
		bodyModel[112] = new ModelRendererTurbo(this, 307, 121, textureX, textureY); // Box 540
		bodyModel[113] = new ModelRendererTurbo(this, 320, 113, textureX, textureY); // Box 240
		bodyModel[114] = new ModelRendererTurbo(this, 326, 94, textureX, textureY); // Box 523
		bodyModel[115] = new ModelRendererTurbo(this, 326, 94, textureX, textureY); // Box 524
		bodyModel[116] = new ModelRendererTurbo(this, 315, 100, textureX, textureY); // Box 525
		bodyModel[117] = new ModelRendererTurbo(this, 45, 100, textureX, textureY,"cull"); // Box 160 cull
		bodyModel[118] = new ModelRendererTurbo(this, 34, 100, textureX, textureY,"cull"); // Box 161 cull
		bodyModel[119] = new ModelRendererTurbo(this, 28, 72, textureX, textureY); // Box 590
		bodyModel[120] = new ModelRendererTurbo(this, 40, 72, textureX, textureY); // Box 591
		bodyModel[121] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Box 396
		bodyModel[122] = new ModelRendererTurbo(this, 319, 107, textureX, textureY,"cull"); // Box 260 cull
		bodyModel[123] = new ModelRendererTurbo(this, 145, 100, textureX, textureY,"cull"); // Box 263 cull
		bodyModel[124] = new ModelRendererTurbo(this, 134, 100, textureX, textureY,"cull"); // Box 264 cull
		bodyModel[125] = new ModelRendererTurbo(this, 156, 100, textureX, textureY); // Box 268
		bodyModel[126] = new ModelRendererTurbo(this, 268, 133, textureX, textureY); // Box 393
		bodyModel[127] = new ModelRendererTurbo(this, 40, 67, textureX, textureY); // Box 273
		bodyModel[128] = new ModelRendererTurbo(this, 32, 67, textureX, textureY); // Box 274
		bodyModel[129] = new ModelRendererTurbo(this, 132, 67, textureX, textureY); // Box 275
		bodyModel[130] = new ModelRendererTurbo(this, 140, 67, textureX, textureY); // Box 276
		bodyModel[131] = new ModelRendererTurbo(this, 42, 79, textureX, textureY); // Box 50
		bodyModel[132] = new ModelRendererTurbo(this, 142, 79, textureX, textureY); // Box 179
		bodyModel[133] = new ModelRendererTurbo(this, 318, 95, textureX, textureY); // Box 285
		bodyModel[134] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 287 compressed pipework
		bodyModel[135] = new ModelRendererTurbo(this, 19, 100, textureX, textureY,"cull"); // Box 186 cull
		bodyModel[136] = new ModelRendererTurbo(this, 119, 100, textureX, textureY,"cull"); // Box 289 cull
		bodyModel[137] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 78
		bodyModel[138] = new ModelRendererTurbo(this, 69, 95, textureX, textureY); // Box 188
		bodyModel[139] = new ModelRendererTurbo(this, 69, 90, textureX, textureY,"lamp"); // Box 189 ditchlight f up
		bodyModel[140] = new ModelRendererTurbo(this, 69, 90, textureX, textureY,"lamp"); // Box 190 ditchlight f up
		bodyModel[141] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 78
		bodyModel[142] = new ModelRendererTurbo(this, 83, 94, textureX, textureY); // Box 188
		bodyModel[143] = new ModelRendererTurbo(this, 83, 89, textureX, textureY,"lamp"); // Box 189 ditchlight f up2
		bodyModel[144] = new ModelRendererTurbo(this, 83, 89, textureX, textureY,"lamp"); // Box 190 ditchlight f up2
		bodyModel[145] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 239
		bodyModel[146] = new ModelRendererTurbo(this, 169, 90, textureX, textureY,"lamp"); // Box 240 ditchlight r up
		bodyModel[147] = new ModelRendererTurbo(this, 169, 90, textureX, textureY,"lamp"); // Box 241 ditchlight r up
		bodyModel[148] = new ModelRendererTurbo(this, 169, 95, textureX, textureY); // Box 242
		bodyModel[149] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 239
		bodyModel[150] = new ModelRendererTurbo(this, 183, 89, textureX, textureY,"lamp"); // Box 24 ditchlight r up2
		bodyModel[151] = new ModelRendererTurbo(this, 183, 89, textureX, textureY,"lamp"); // Box 241 ditchlight r up2
		bodyModel[152] = new ModelRendererTurbo(this, 183, 94, textureX, textureY); // Box 242
		bodyModel[153] = new ModelRendererTurbo(this, 6, 117, textureX, textureY); // Box 282
		bodyModel[154] = new ModelRendererTurbo(this, 19, 121, textureX, textureY); // Box 283
		bodyModel[155] = new ModelRendererTurbo(this, 28, 109, textureX, textureY); // Box 4
		bodyModel[156] = new ModelRendererTurbo(this, 19, 109, textureX, textureY); // Box 448
		bodyModel[157] = new ModelRendererTurbo(this, 41, 111, textureX, textureY); // Box 322
		bodyModel[158] = new ModelRendererTurbo(this, 54, 111, textureX, textureY); // Box 323
		bodyModel[159] = new ModelRendererTurbo(this, 8, 107, textureX, textureY); // Box 280
		bodyModel[160] = new ModelRendererTurbo(this, 65, 109, textureX, textureY); // Box 285
		bodyModel[161] = new ModelRendererTurbo(this, 119, 121, textureX, textureY); // Box 305
		bodyModel[162] = new ModelRendererTurbo(this, 106, 117, textureX, textureY); // Box 306
		bodyModel[163] = new ModelRendererTurbo(this, 128, 109, textureX, textureY); // Box 307
		bodyModel[164] = new ModelRendererTurbo(this, 141, 111, textureX, textureY); // Box 308
		bodyModel[165] = new ModelRendererTurbo(this, 154, 111, textureX, textureY); // Box 309
		bodyModel[166] = new ModelRendererTurbo(this, 165, 109, textureX, textureY); // Box 310
		bodyModel[167] = new ModelRendererTurbo(this, 119, 109, textureX, textureY); // Box 311
		bodyModel[168] = new ModelRendererTurbo(this, 108, 107, textureX, textureY); // Box 312
		bodyModel[169] = new ModelRendererTurbo(this, 74, 109, textureX, textureY); // Box 24
		bodyModel[170] = new ModelRendererTurbo(this, 87, 111, textureX, textureY); // Box 25
		bodyModel[171] = new ModelRendererTurbo(this, 187, 111, textureX, textureY); // Box 315
		bodyModel[172] = new ModelRendererTurbo(this, 174, 109, textureX, textureY); // Box 316
		bodyModel[173] = new ModelRendererTurbo(this, 281, 165, textureX, textureY); // Box 362 ane shit
		bodyModel[174] = new ModelRendererTurbo(this, 274, 167, textureX, textureY,"lamp"); // Box 363 ane front light gyra
		bodyModel[175] = new ModelRendererTurbo(this, 267, 167, textureX, textureY,"lamp"); // Box 364 ane front light gyra
		bodyModel[176] = new ModelRendererTurbo(this, 466, 22, textureX, textureY); // Box 365 ane shit
		bodyModel[177] = new ModelRendererTurbo(this, 452, 24, textureX, textureY,"lamp"); // Box 366 ane rear light gyra
		bodyModel[178] = new ModelRendererTurbo(this, 459, 24, textureX, textureY,"lamp"); // Box 367 ane rear light gyra
		bodyModel[179] = new ModelRendererTurbo(this, 292, 130, textureX, textureY,"cull"); // Box 354 cull
		bodyModel[180] = new ModelRendererTurbo(this, 292, 130, textureX, textureY,"cull"); // Box 355 cull
		bodyModel[181] = new ModelRendererTurbo(this, 76, 91, textureX, textureY,"lamp"); // Box 356 front ditchlight canook
		bodyModel[182] = new ModelRendererTurbo(this, 76, 91, textureX, textureY,"lamp"); // Box 357 front ditchlight canook
		bodyModel[183] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 358
		bodyModel[184] = new ModelRendererTurbo(this, 77, 96, textureX, textureY); // Box 359
		bodyModel[185] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 360
		bodyModel[186] = new ModelRendererTurbo(this, 176, 91, textureX, textureY,"lamp"); // Box 361 rear ditchlight canook
		bodyModel[187] = new ModelRendererTurbo(this, 177, 96, textureX, textureY); // Box 362
		bodyModel[188] = new ModelRendererTurbo(this, 176, 91, textureX, textureY,"lamp"); // Box 363 rear ditchlight canook
		bodyModel[189] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[190] = new ModelRendererTurbo(this, 264, 137, textureX, textureY,"lamp"); // Box Glow
		bodyModel[191] = new ModelRendererTurbo(this, 263, 133, textureX, textureY,"lamp"); // Box Glow
		bodyModel[192] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[193] = new ModelRendererTurbo(this, 307, 202, textureX, textureY); // Box 372
		bodyModel[194] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Box 373
		bodyModel[195] = new ModelRendererTurbo(this, 91, 83, textureX, textureY); // Box 374 mu box thing
		bodyModel[196] = new ModelRendererTurbo(this, 190, 92, textureX, textureY); // Box 399
		bodyModel[197] = new ModelRendererTurbo(this, 190, 87, textureX, textureY); // Box 400
		bodyModel[198] = new ModelRendererTurbo(this, 90, 92, textureX, textureY); // Box 401
		bodyModel[199] = new ModelRendererTurbo(this, 90, 87, textureX, textureY); // Box 402
		bodyModel[200] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 523
		bodyModel[201] = new ModelRendererTurbo(this, 162, 186, textureX, textureY); // Box 510
		bodyModel[202] = new ModelRendererTurbo(this, 152, 217, textureX, textureY); // Box 511 compressed pipework
		bodyModel[203] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 512
		bodyModel[204] = new ModelRendererTurbo(this, 155, 204, textureX, textureY); // Box 513
		bodyModel[205] = new ModelRendererTurbo(this, 275, 145, textureX, textureY); // Box 409 commander base
		bodyModel[206] = new ModelRendererTurbo(this, 275, 141, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[207] = new ModelRendererTurbo(this, 469, 8, textureX, textureY); // Box 409 commander base
		bodyModel[208] = new ModelRendererTurbo(this, 469, 4, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[209] = new ModelRendererTurbo(this, 12, 146, textureX, textureY); // Box 529
		bodyModel[210] = new ModelRendererTurbo(this, 14, 143, textureX, textureY); // Box 530
		bodyModel[211] = new ModelRendererTurbo(this, 14, 149, textureX, textureY); // Box 531
		bodyModel[212] = new ModelRendererTurbo(this, 12, 152, textureX, textureY); // Box 532
		bodyModel[213] = new ModelRendererTurbo(this, 14, 155, textureX, textureY); // Box 533
		bodyModel[214] = new ModelRendererTurbo(this, 12, 158, textureX, textureY); // Box 534
		bodyModel[215] = new ModelRendererTurbo(this, 1, 158, textureX, textureY); // Box 535
		bodyModel[216] = new ModelRendererTurbo(this, 3, 155, textureX, textureY); // Box 536
		bodyModel[217] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 537
		bodyModel[218] = new ModelRendererTurbo(this, 3, 149, textureX, textureY); // Box 538
		bodyModel[219] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 539
		bodyModel[220] = new ModelRendererTurbo(this, 3, 143, textureX, textureY); // Box 540
		bodyModel[221] = new ModelRendererTurbo(this, 164, 192, textureX, textureY); // Box 541
		bodyModel[222] = new ModelRendererTurbo(this, 163, 196, textureX, textureY); // Box 542
		bodyModel[223] = new ModelRendererTurbo(this, 164, 203, textureX, textureY); // Box 543
		bodyModel[224] = new ModelRendererTurbo(this, 117, 57, textureX, textureY); // Box 544
		bodyModel[225] = new ModelRendererTurbo(this, 140, 72, textureX, textureY); // Box 545
		bodyModel[226] = new ModelRendererTurbo(this, 128, 72, textureX, textureY); // Box 547
		bodyModel[227] = new ModelRendererTurbo(this, 117, 76, textureX, textureY); // Box 548
		bodyModel[228] = new ModelRendererTurbo(this, 159, 76, textureX, textureY); // Box 551
		bodyModel[229] = new ModelRendererTurbo(this, 119, 78, textureX, textureY); // Box 554
		bodyModel[230] = new ModelRendererTurbo(this, 116, 97, textureX, textureY); // Box 555
		bodyModel[231] = new ModelRendererTurbo(this, 191, 83, textureX, textureY); // Box 556 mu box thing
		bodyModel[232] = new ModelRendererTurbo(this, 262, 140, textureX, textureY); // Box 2
		bodyModel[233] = new ModelRendererTurbo(this, 264, 137, textureX, textureY,"lamp"); // Box Glow
		bodyModel[234] = new ModelRendererTurbo(this, 263, 133, textureX, textureY,"lamp"); // Box Glow
		bodyModel[235] = new ModelRendererTurbo(this, 263, 145, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 40, 68, textureX, textureY); // Box 573
		bodyModel[237] = new ModelRendererTurbo(this, 24, 68, textureX, textureY); // Box 574
		bodyModel[238] = new ModelRendererTurbo(this, 124, 68, textureX, textureY); // Box 575
		bodyModel[239] = new ModelRendererTurbo(this, 140, 68, textureX, textureY); // Box 576
		bodyModel[240] = new ModelRendererTurbo(this, 298, 228, textureX, textureY); // Box 409 vent
		bodyModel[241] = new ModelRendererTurbo(this, 319, 222, textureX, textureY); // Box 410 vent
		bodyModel[242] = new ModelRendererTurbo(this, 340, 228, textureX, textureY); // Box 411 vent
		bodyModel[243] = new ModelRendererTurbo(this, 361, 222, textureX, textureY); // Box 412 vent
		bodyModel[244] = new ModelRendererTurbo(this, 277, 234, textureX, textureY); // Box 414
		bodyModel[245] = new ModelRendererTurbo(this, 236, 185, textureX, textureY); // Box 419 fan
		bodyModel[246] = new ModelRendererTurbo(this, 275, 150, textureX, textureY,"lamp"); // Box 168 numberboard front double
		bodyModel[247] = new ModelRendererTurbo(this, 275, 150, textureX, textureY,"lamp"); // Box 167 numberboard front double
		bodyModel[248] = new ModelRendererTurbo(this, 483, 1, textureX, textureY,"lamp"); // Box 167 numberboard rear single
		bodyModel[249] = new ModelRendererTurbo(this, 483, 1, textureX, textureY,"lamp"); // Box 168 numberboard rear single
		bodyModel[250] = new ModelRendererTurbo(this, 482, 22, textureX, textureY,"lamp"); // Box 168 numberboard rear double
		bodyModel[251] = new ModelRendererTurbo(this, 482, 22, textureX, textureY,"lamp"); // Box 167 numberboard rear double
		bodyModel[252] = new ModelRendererTurbo(this, 258, 53, textureX, textureY); // Box 415
		bodyModel[253] = new ModelRendererTurbo(this, 245, 53, textureX, textureY,"lamp"); // Box 416 more sp numberboard
		bodyModel[254] = new ModelRendererTurbo(this, 284, 49, textureX, textureY,"cull"); // Box 417 cull
		bodyModel[255] = new ModelRendererTurbo(this, 271, 49, textureX, textureY,"cull"); // Box 418 cull
		bodyModel[256] = new ModelRendererTurbo(this, 258, 49, textureX, textureY); // Box 419
		bodyModel[257] = new ModelRendererTurbo(this, 245, 49, textureX, textureY,"lamp"); // Box 420 more sp numberboard
		bodyModel[258] = new ModelRendererTurbo(this, 27, 169, textureX, textureY); // Box 426 flexicoil short skirt
		bodyModel[259] = new ModelRendererTurbo(this, 66, 169, textureX, textureY); // Box 427 flexicoil short skirt
		bodyModel[260] = new ModelRendererTurbo(this, 61, 169, textureX, textureY); // Box 428 flexicoil short skirt
		bodyModel[261] = new ModelRendererTurbo(this, 32, 169, textureX, textureY); // Box 429 flexicoil short skirt
		bodyModel[262] = new ModelRendererTurbo(this, 342, 117, textureX, textureY); // Box 33 tall stack
		bodyModel[263] = new ModelRendererTurbo(this, 133, 237, textureX, textureY); // Box 409 vent
		bodyModel[264] = new ModelRendererTurbo(this, 154, 234, textureX, textureY); // Box 410 vent
		bodyModel[265] = new ModelRendererTurbo(this, 182, 237, textureX, textureY); // Box 411 vent
		bodyModel[266] = new ModelRendererTurbo(this, 219, 237, textureX, textureY); // Box 412 vent
		bodyModel[267] = new ModelRendererTurbo(this, 240, 234, textureX, textureY); // Box 414
		bodyModel[268] = new ModelRendererTurbo(this, 12, 238, textureX, textureY); // Box 409 vent
		bodyModel[269] = new ModelRendererTurbo(this, 33, 235, textureX, textureY); // Box 410 vent
		bodyModel[270] = new ModelRendererTurbo(this, 54, 238, textureX, textureY); // Box 411 vent
		bodyModel[271] = new ModelRendererTurbo(this, 75, 235, textureX, textureY); // Box 412 vent
		bodyModel[272] = new ModelRendererTurbo(this, 96, 238, textureX, textureY); // Box 414
		bodyModel[273] = new ModelRendererTurbo(this, 247, 183, textureX, textureY); // Box 655 re engineered
		bodyModel[274] = new ModelRendererTurbo(this, 252, 174, textureX, textureY); // Box 656 re engineered
		bodyModel[275] = new ModelRendererTurbo(this, 352, 115, textureX, textureY); // Box 538
		bodyModel[276] = new ModelRendererTurbo(this, 352, 110, textureX, textureY); // Box 539
		bodyModel[277] = new ModelRendererTurbo(this, 352, 121, textureX, textureY); // Box 540
		bodyModel[278] = new ModelRendererTurbo(this, 341, 113, textureX, textureY); // Box 240
		bodyModel[279] = new ModelRendererTurbo(this, 348, 94, textureX, textureY); // Box 523
		bodyModel[280] = new ModelRendererTurbo(this, 348, 94, textureX, textureY); // Box 524
		bodyModel[281] = new ModelRendererTurbo(this, 336, 100, textureX, textureY); // Box 525
		bodyModel[282] = new ModelRendererTurbo(this, 340, 107, textureX, textureY,"cull"); // Box 260 cull
		bodyModel[283] = new ModelRendererTurbo(this, 339, 95, textureX, textureY); // Box 285
		bodyModel[284] = new ModelRendererTurbo(this, 343, 78, textureX, textureY); // Box 515
		bodyModel[285] = new ModelRendererTurbo(this, 320, 78, textureX, textureY); // Box 526
		bodyModel[286] = new ModelRendererTurbo(this, 336, 71, textureX, textureY); // Box 171
		bodyModel[287] = new ModelRendererTurbo(this, 336, 66, textureX, textureY); // Box 174
		bodyModel[288] = new ModelRendererTurbo(this, 317, 71, textureX, textureY); // Box 580
		bodyModel[289] = new ModelRendererTurbo(this, 329, 78, textureX, textureY,"cull"); // Box 581 cull
		bodyModel[290] = new ModelRendererTurbo(this, 325, 66, textureX, textureY); // Box 583
		bodyModel[291] = new ModelRendererTurbo(this, 343, 84, textureX, textureY); // Box 310 nasa cap
		bodyModel[292] = new ModelRendererTurbo(this, 320, 84, textureX, textureY); // Box 311 nasa cap
		bodyModel[293] = new ModelRendererTurbo(this, 347, 139, textureX, textureY); // Box 398
		bodyModel[294] = new ModelRendererTurbo(this, 356, 139, textureX, textureY); // Box 399
		bodyModel[295] = new ModelRendererTurbo(this, 381, 196, textureX, textureY); // Box 629 dynamic brake
		bodyModel[296] = new ModelRendererTurbo(this, 412, 216, textureX, textureY); // Box 633 dynamic brake
		bodyModel[297] = new ModelRendererTurbo(this, 372, 197, textureX, textureY); // Box 278 dynamic brake fan
		bodyModel[298] = new ModelRendererTurbo(this, 383, 205, textureX, textureY); // Box 635 dynamic brake bit
		bodyModel[299] = new ModelRendererTurbo(this, 383, 205, textureX, textureY); // Box 636 dynamic brake bit
		bodyModel[300] = new ModelRendererTurbo(this, 390, 205, textureX, textureY); // Box 637 dynamic brake bit
		bodyModel[301] = new ModelRendererTurbo(this, 390, 205, textureX, textureY); // Box 638 dynamic brake bit
		bodyModel[302] = new ModelRendererTurbo(this, 379, 134, textureX, textureY); // Box 639 torpedo tube
		bodyModel[303] = new ModelRendererTurbo(this, 379, 129, textureX, textureY); // Box 640 torpedo tube
		bodyModel[304] = new ModelRendererTurbo(this, 379, 139, textureX, textureY); // Box 641 torpedo tube
		bodyModel[305] = new ModelRendererTurbo(this, 379, 118, textureX, textureY); // Box 642 torpedo tube
		bodyModel[306] = new ModelRendererTurbo(this, 379, 113, textureX, textureY); // Box 643 torpedo tube
		bodyModel[307] = new ModelRendererTurbo(this, 379, 123, textureX, textureY); // Box 644 torpedo tube
		bodyModel[308] = new ModelRendererTurbo(this, 425, 139, textureX, textureY); // Box 647
		bodyModel[309] = new ModelRendererTurbo(this, 425, 139, textureX, textureY); // Box 648
		bodyModel[310] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 649
		bodyModel[311] = new ModelRendererTurbo(this, 418, 139, textureX, textureY); // Box 650
		bodyModel[312] = new ModelRendererTurbo(this, 346, 128, textureX, textureY); // Box 561 canfor bit
		bodyModel[313] = new ModelRendererTurbo(this, 370, 122, textureX, textureY); // Box 654 canfor bit
		bodyModel[314] = new ModelRendererTurbo(this, 275, 134, textureX, textureY,"lamp"); // Box 422 crl markerlight
		bodyModel[315] = new ModelRendererTurbo(this, 275, 134, textureX, textureY,"lamp"); // Box 422 crl markerlight
		bodyModel[316] = new ModelRendererTurbo(this, 318, 87, textureX, textureY,"cull"); // Box 419 cull
		bodyModel[317] = new ModelRendererTurbo(this, 341, 87, textureX, textureY,"cull"); // Box 420 cull
		bodyModel[318] = new ModelRendererTurbo(this, 344, 8, textureX, textureY); // Box 372
		bodyModel[319] = new ModelRendererTurbo(this, 344, 23, textureX, textureY); // Box 374
		bodyModel[320] = new ModelRendererTurbo(this, 347, 8, textureX, textureY); // Box 376
		bodyModel[321] = new ModelRendererTurbo(this, 347, 23, textureX, textureY); // Box 377
		bodyModel[322] = new ModelRendererTurbo(this, 83, 162, textureX, textureY); // Box 184
		bodyModel[323] = new ModelRendererTurbo(this, 83, 154, textureX, textureY); // Box 184
		bodyModel[324] = new ModelRendererTurbo(this, 428, 168, textureX, textureY); // Box 107
		bodyModel[325] = new ModelRendererTurbo(this, 435, 159, textureX, textureY); // Box 19
		bodyModel[326] = new ModelRendererTurbo(this, 435, 150, textureX, textureY); // Box 20
		bodyModel[327] = new ModelRendererTurbo(this, 357, 137, textureX, textureY); // Box 390
		bodyModel[328] = new ModelRendererTurbo(this, 357, 137, textureX, textureY); // Box 509
		bodyModel[329] = new ModelRendererTurbo(this, 461, 29, textureX, textureY); // Box 557
		bodyModel[330] = new ModelRendererTurbo(this, 367, 171, textureX, textureY); // Box 651 yes this is a real bit
		bodyModel[331] = new ModelRendererTurbo(this, 475, 168, textureX, textureY,"cull"); // Box 107 inset gauge window thing cull
		bodyModel[332] = new ModelRendererTurbo(this, 343, 56, textureX, textureY); // UP spark arrestor stack
		bodyModel[333] = new ModelRendererTurbo(this, 336, 58, textureX, textureY); // UP spark arrestor stack
		bodyModel[334] = new ModelRendererTurbo(this, 356, 58, textureX, textureY); // UP spark arrestor stack
		bodyModel[335] = new ModelRendererTurbo(this, 345, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[336] = new ModelRendererTurbo(this, 338, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[337] = new ModelRendererTurbo(this, 354, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[338] = new ModelRendererTurbo(this, 316, 56, textureX, textureY); // UP spark arrestor stack
		bodyModel[339] = new ModelRendererTurbo(this, 309, 58, textureX, textureY); // UP spark arrestor stack
		bodyModel[340] = new ModelRendererTurbo(this, 329, 58, textureX, textureY); // UP spark arrestor stack
		bodyModel[341] = new ModelRendererTurbo(this, 318, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[342] = new ModelRendererTurbo(this, 311, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[343] = new ModelRendererTurbo(this, 327, 51, textureX, textureY); // UP spark arrestor stack
		bodyModel[344] = new ModelRendererTurbo(this, 365, 102, textureX, textureY); // UP air brake piping
		bodyModel[345] = new ModelRendererTurbo(this, 365, 108, textureX, textureY); // UP air brake piping
		bodyModel[346] = new ModelRendererTurbo(this, 376, 104, textureX, textureY); // UP air brake piping
		bodyModel[347] = new ModelRendererTurbo(this, 383, 105, textureX, textureY); // UP air brake piping
		bodyModel[348] = new ModelRendererTurbo(this, 191, 184, textureX, textureY); // Box 202
		bodyModel[349] = new ModelRendererTurbo(this, 191, 175, textureX, textureY); // Box 202
		bodyModel[350] = new ModelRendererTurbo(this, 462, 74, textureX, textureY,"cull"); // Box 1081 air tank support cull
		bodyModel[351] = new ModelRendererTurbo(this, 465, 70, textureX, textureY); // Box 541
		bodyModel[352] = new ModelRendererTurbo(this, 464, 63, textureX, textureY); // Box 542
		bodyModel[353] = new ModelRendererTurbo(this, 465, 59, textureX, textureY); // Box 543
		bodyModel[354] = new ModelRendererTurbo(this, 465, 92, textureX, textureY); // Box 541
		bodyModel[355] = new ModelRendererTurbo(this, 464, 85, textureX, textureY); // Box 542
		bodyModel[356] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 543
		bodyModel[357] = new ModelRendererTurbo(this, 462, 96, textureX, textureY,"cull"); // Box 1081 air tank support cull
		bodyModel[358] = new ModelRendererTurbo(this, 452, 92, textureX, textureY); // UP air brake piping
		bodyModel[359] = new ModelRendererTurbo(this, 492, 95, textureX, textureY); // UP air brake piping
		bodyModel[360] = new ModelRendererTurbo(this, 488, 101, textureX, textureY); // UP air brake piping
		bodyModel[361] = new ModelRendererTurbo(this, 432, 93, textureX, textureY); // UP air brake piping
		bodyModel[362] = new ModelRendererTurbo(this, 456, 103, textureX, textureY); // UP air brake piping
		bodyModel[363] = new ModelRendererTurbo(this, 472, 103, textureX, textureY); // UP air brake piping
		bodyModel[364] = new ModelRendererTurbo(this, 453, 103, textureX, textureY); // UP air brake piping
		bodyModel[365] = new ModelRendererTurbo(this, 483, 104, textureX, textureY); // UP air brake piping
		bodyModel[366] = new ModelRendererTurbo(this, 467, 104, textureX, textureY); // UP air brake piping
		bodyModel[367] = new ModelRendererTurbo(this, 477, 172, textureX, textureY); // Box 107 inset gauge strip
		bodyModel[368] = new ModelRendererTurbo(this, 436, 196, textureX, textureY); // Box 19 MILW box
		bodyModel[369] = new ModelRendererTurbo(this, 361, 106, textureX, textureY); // Box 184
		bodyModel[370] = new ModelRendererTurbo(this, 275, 131, textureX, textureY,"lamp"); // Box 422 crl markerlight
		bodyModel[371] = new ModelRendererTurbo(this, 275, 131, textureX, textureY,"lamp"); // Box 422 crl markerlight
		bodyModel[372] = new ModelRendererTurbo(this, 489, 182, textureX, textureY); // Box 43
		bodyModel[373] = new ModelRendererTurbo(this, 496, 181, textureX, textureY); // Box 2
		bodyModel[374] = new ModelRendererTurbo(this, 496, 183, textureX, textureY); // Box 43
		bodyModel[375] = new ModelRendererTurbo(this, 490, 189, textureX, textureY); // Box 43
		bodyModel[376] = new ModelRendererTurbo(this, 489, 194, textureX, textureY); // Box 43
		bodyModel[377] = new ModelRendererTurbo(this, 71, 162, textureX, textureY); // Box 188
		bodyModel[378] = new ModelRendererTurbo(this, 71, 154, textureX, textureY); // Box 190
		bodyModel[379] = new ModelRendererTurbo(this, 80, 161, textureX, textureY); // Box 276
		bodyModel[380] = new ModelRendererTurbo(this, 80, 153, textureX, textureY); // Box 383
		bodyModel[381] = new ModelRendererTurbo(this, 129, 165, textureX, textureY); // Box 409 vent
		bodyModel[382] = new ModelRendererTurbo(this, 294, 104, textureX, textureY,"cull"); // Box 245 cull
		bodyModel[383] = new ModelRendererTurbo(this, 23, 46, textureX, textureY); // Box 436 mu cable confuckery
		bodyModel[384] = new ModelRendererTurbo(this, 123, 46, textureX, textureY); // Box 437 mu cable confuckery

		bodyModel[0].addBox(0F, 0F, 0F, 10, 5, 14, 0F); // Box 89
		bodyModel[0].setRotationPoint(-5F, 3F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 202
		bodyModel[1].setRotationPoint(-5F, 7F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[2].setRotationPoint(-5F, 8F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
		bodyModel[3].setRotationPoint(-27F, 1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 1
		bodyModel[4].setRotationPoint(-31F, 1F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		bodyModel[5].setRotationPoint(-34.5F, 3F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[6].setRotationPoint(-32F, 2.5F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 166
		bodyModel[7].setRotationPoint(-31.01F, -9F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[8].setRotationPoint(-31.01F, -7F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[9].setRotationPoint(-31.01F, -7F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[10].setRotationPoint(-27F, 2F, 4.75F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 546
		bodyModel[11].setRotationPoint(-31F, -7F, -0.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 389
		bodyModel[12].setRotationPoint(-31F, 6F, 9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 390
		bodyModel[13].setRotationPoint(-31F, 8F, 9F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 391
		bodyModel[14].setRotationPoint(-31F, 6F, 7.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 392
		bodyModel[15].setRotationPoint(-31F, 4F, 7.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 393
		bodyModel[16].setRotationPoint(-31F, 4F, 6F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 394
		bodyModel[17].setRotationPoint(-31F, 2F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 135
		bodyModel[18].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
		bodyModel[19].setRotationPoint(31.5F, 3F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[20].setRotationPoint(31F, 2.5F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 184
		bodyModel[21].setRotationPoint(27F, 1F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 388
		bodyModel[22].setRotationPoint(-31F, 1.5F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[23].setRotationPoint(27F, 2F, 4.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 491
		bodyModel[24].setRotationPoint(27F, 2F, -10.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 54, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 108
		bodyModel[25].setRotationPoint(-27F, 2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[26].setRotationPoint(-27F, 2F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 54, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		bodyModel[27].setRotationPoint(-27F, 2F, 11F);

		bodyModel[28].addBox(0F, 0F, 0F, 29, 15, 16, 0F); // Box 5 hood
		bodyModel[28].setRotationPoint(-25F, -14F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[29].setRotationPoint(-25F, -15F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[30].setRotationPoint(-25F, -15F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[31].setRotationPoint(4F, -12F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 24, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 138 cull fan cover
		bodyModel[32].setRotationPoint(-26F, -11.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[33].setRotationPoint(4F, -14F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 397
		bodyModel[34].setRotationPoint(4F, -14F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 29, 0, 1, 0F); // Box 390
		bodyModel[35].setRotationPoint(-25F, -12F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 29, 0, 1, 0F); // Box 391
		bodyModel[36].setRotationPoint(-25F, -12F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 392
		bodyModel[37].setRotationPoint(4F, -12F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		bodyModel[38].setRotationPoint(4F, -12F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[39].setRotationPoint(-18F, 3.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[40].setRotationPoint(-17.5F, 2F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[41].setRotationPoint(-17.5F, 2F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 133
		bodyModel[42].setRotationPoint(-16.5F, 2F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F); // Box 134
		bodyModel[43].setRotationPoint(-16.5F, 2F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 337
		bodyModel[44].setRotationPoint(-31F, 2F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 338
		bodyModel[45].setRotationPoint(-31F, 4F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 339
		bodyModel[46].setRotationPoint(-31F, 4F, -7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 340
		bodyModel[47].setRotationPoint(-31F, 6F, -9.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 341
		bodyModel[48].setRotationPoint(-31F, 6F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 342
		bodyModel[49].setRotationPoint(-31F, 8F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 188
		bodyModel[50].setRotationPoint(21F, -7F, -11.01F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 12, 0, 0F); // Box 190
		bodyModel[51].setRotationPoint(21F, -7F, 11.01F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[52].setRotationPoint(-27F, -15F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[53].setRotationPoint(-27F, -14.5F, -2.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[54].setRotationPoint(-27.25F, -15F, -0.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.55F, 0F, -0.5F, -0.55F, 0F, -0.5F, -0.55F, -0.5F, 0F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[55].setRotationPoint(-27.25F, -13.5F, -0.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[56].setRotationPoint(-27F, -14.5F, 1.5F);

		bodyModel[57].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front single
		bodyModel[57].setRotationPoint(-27F, -14F, -1.5F);
		bodyModel[57].rotateAngleY = -0.4712389F;

		bodyModel[58].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front single
		bodyModel[58].setRotationPoint(-27F, -14F, 1.5F);
		bodyModel[58].rotateAngleY = 0.4712389F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[59].setRotationPoint(-27.25F, -14.75F, -1.25F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 371
		bodyModel[60].setRotationPoint(-28F, -7F, -11.01F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[61].setRotationPoint(-28F, -7F, -11.02F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 12, 0, 0F); // Box 373
		bodyModel[62].setRotationPoint(-28F, -7F, 11.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[63].setRotationPoint(-28F, -7F, 11.02F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 375
		bodyModel[64].setRotationPoint(27F, 1.5F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[65].setRotationPoint(-24F, -7F, -11.02F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[66].setRotationPoint(-24F, -7F, 11.02F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 382
		bodyModel[67].setRotationPoint(-26F, -15F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[68].setRotationPoint(-27F, -15F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[69].setRotationPoint(-27F, -14.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 387
		bodyModel[70].setRotationPoint(-27F, -14.5F, 1F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 388
		bodyModel[71].setRotationPoint(14F, 3.5F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[72].setRotationPoint(14.5F, 2F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 390
		bodyModel[73].setRotationPoint(15.5F, 2F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.01F, 0F, 0.25F, -0.01F); // Box 391
		bodyModel[74].setRotationPoint(15.5F, 2F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 392
		bodyModel[75].setRotationPoint(14.5F, 2F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[76].setRotationPoint(-10F, -21F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 147
		bodyModel[77].setRotationPoint(27F, -15F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[78].setRotationPoint(27F, -14.5F, -2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 173
		bodyModel[79].setRotationPoint(27F, -14.5F, 1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169 headlight front big
		bodyModel[80].setRotationPoint(28.25F, -14.75F, -1.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 171 headlight front 2beam
		bodyModel[81].setRotationPoint(28.25F, -15F, -0.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F); // Box 172 headlight front 2beam
		bodyModel[82].setRotationPoint(28.25F, -13.5F, -0.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[83].setRotationPoint(27F, -15F, -1.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 383
		bodyModel[84].setRotationPoint(27F, -15F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[85].setRotationPoint(27F, -14.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 387
		bodyModel[86].setRotationPoint(27F, -14.5F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081 air tank support
		bodyModel[87].setRotationPoint(-4F, 3.25F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[88].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[89].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[90].setRotationPoint(23F, 2F, 10.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[91].setRotationPoint(23F, 2F, -10.75F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 1086
		bodyModel[92].setRotationPoint(-31F, -0.5F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 54, 8, 0, 0F); // Box 1096
		bodyModel[93].setRotationPoint(-23F, -7F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 54, 8, 0, 0F); // Box 1097
		bodyModel[94].setRotationPoint(-23F, -7F, 11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[95].setRotationPoint(-4F, 3F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[96].setRotationPoint(-4F, 4F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 186
		bodyModel[97].setRotationPoint(-4F, 4F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187 air tank support
		bodyModel[98].setRotationPoint(-4F, 3.25F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[99].setRotationPoint(-12F, -17F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[100].setRotationPoint(-12F, -18F, -0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[101].setRotationPoint(-11.75F, -16.5F, -0.25F);

		bodyModel[102].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 623
		bodyModel[102].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[102].rotateAngleY = -0.78539816F;

		bodyModel[103].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 625 sp numerbboard
		bodyModel[103].setRotationPoint(-10.5F, -17F, -5F);
		bodyModel[103].rotateAngleY = -0.78539816F;

		bodyModel[104].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 626 sp numberboard
		bodyModel[104].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[104].rotateAngleY = 0.78539816F;

		bodyModel[105].addBox(-2.5F, 0F, -1F, 5, 2, 2, 0F); // Box 627
		bodyModel[105].setRotationPoint(-10.5F, -17F, 5F);
		bodyModel[105].rotateAngleY = 0.78539816F;

		bodyModel[106].addBox(0F, 0F, 0F, 0, 7, 6, 0F); // Box 214
		bodyModel[106].setRotationPoint(-26.5F, -6F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 215
		bodyModel[107].setRotationPoint(-26.5F, -7F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 cull headlight enclosure
		bodyModel[108].setRotationPoint(-28F, -15F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220 cull headlight enclosure
		bodyModel[109].setRotationPoint(29F, -15F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[110].setRotationPoint(-10.5F, -21F, -1.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[111].setRotationPoint(-10.5F, -22F, -1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[112].setRotationPoint(-10.5F, -19F, -1.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[113].setRotationPoint(-10.5F, -22F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[114].setRotationPoint(-7F, -22F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[115].setRotationPoint(-12F, -22F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[116].setRotationPoint(-12.5F, -19F, -1.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull
		bodyModel[117].setRotationPoint(-31.5F, -4F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull
		bodyModel[118].setRotationPoint(-31.5F, -5F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 590
		bodyModel[119].setRotationPoint(-31.01F, -9F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[120].setRotationPoint(-31.01F, -9F, -8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 396
		bodyModel[121].setRotationPoint(-30.5F, -1F, -2F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 260 cull
		bodyModel[122].setRotationPoint(-10.5F, -22F, -1.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 263 cull
		bodyModel[123].setRotationPoint(30.5F, -4F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264 cull
		bodyModel[124].setRotationPoint(30.5F, -5F, -2F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 268
		bodyModel[125].setRotationPoint(29.5F, -1F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 0, 14, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[126].setRotationPoint(-26.75F, -6F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 273
		bodyModel[127].setRotationPoint(-31.02F, 4F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[128].setRotationPoint(-31.02F, 4F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[129].setRotationPoint(31.02F, 4F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[130].setRotationPoint(31.02F, 4F, -9F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50
		bodyModel[131].setRotationPoint(-34F, 9F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 179
		bodyModel[132].setRotationPoint(31.01F, 9F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[133].setRotationPoint(-10F, -17F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 287 compressed pipework
		bodyModel[134].setRotationPoint(-5F, 3F, 11.01F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186 cull
		bodyModel[135].setRotationPoint(-33.01F, 7F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[136].setRotationPoint(31.01F, 7F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[137].setRotationPoint(-31.5F, 0F, 4.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[138].setRotationPoint(-31.5F, 0F, -6.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up
		bodyModel[139].setRotationPoint(-31.75F, 0F, 4.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up
		bodyModel[140].setRotationPoint(-31.75F, 0F, -6.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[141].setRotationPoint(-31F, -2F, 3.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[142].setRotationPoint(-31F, -2F, -5.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f up2
		bodyModel[143].setRotationPoint(-31.25F, -2F, 3.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f up2
		bodyModel[144].setRotationPoint(-31.25F, -2F, -5.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[145].setRotationPoint(30.5F, 0F, -6.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r up
		bodyModel[146].setRotationPoint(30.75F, 0F, -6.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up
		bodyModel[147].setRotationPoint(30.75F, 0F, 4.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[148].setRotationPoint(30.5F, 0F, 4.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[149].setRotationPoint(30F, -2F, -5.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 24 ditchlight r up2
		bodyModel[150].setRotationPoint(30.25F, -2F, -5.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r up2
		bodyModel[151].setRotationPoint(30.25F, -2F, 3.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[152].setRotationPoint(30F, -2F, 3.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[153].setRotationPoint(-35F, 7F, 0F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[154].setRotationPoint(-35F, 7F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[155].setRotationPoint(-34F, 6F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[156].setRotationPoint(-34F, 5F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[157].setRotationPoint(-34F, 6F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[158].setRotationPoint(-34F, 5F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[159].setRotationPoint(-34F, 4F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[160].setRotationPoint(-34F, 4F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 305
		bodyModel[161].setRotationPoint(34F, 7F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 306
		bodyModel[162].setRotationPoint(34F, 7F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 307
		bodyModel[163].setRotationPoint(33F, 6F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 308
		bodyModel[164].setRotationPoint(33F, 6F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 309
		bodyModel[165].setRotationPoint(33F, 5F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 310
		bodyModel[166].setRotationPoint(33F, 4F, 2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[167].setRotationPoint(33F, 5F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[168].setRotationPoint(33F, 4F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[169].setRotationPoint(-34F, 6F, 0F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[170].setRotationPoint(-34F, 6F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 315
		bodyModel[171].setRotationPoint(33F, 6F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 316
		bodyModel[172].setRotationPoint(33F, 6F, -10F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 362 ane shit
		bodyModel[173].setRotationPoint(-27F, -17F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 ane front light gyra
		bodyModel[174].setRotationPoint(-27.25F, -17F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 364 ane front light gyra
		bodyModel[175].setRotationPoint(-27.25F, -17F, 0F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 365 ane shit
		bodyModel[176].setRotationPoint(27F, -17F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 366 ane rear light gyra
		bodyModel[177].setRotationPoint(28.25F, -17F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 367 ane rear light gyra
		bodyModel[178].setRotationPoint(28.25F, -17F, 0F);

		bodyModel[179].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 354 cull
		bodyModel[179].setRotationPoint(-10.5F, -15F, 5F);
		bodyModel[179].rotateAngleY = 0.78539816F;

		bodyModel[180].addBox(-2.5F, 0F, -1F, 5, 1, 2, 0F); // Box 355 cull
		bodyModel[180].setRotationPoint(-10.5F, -15F, -5F);
		bodyModel[180].rotateAngleY = -0.78539816F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356 front ditchlight canook
		bodyModel[181].setRotationPoint(-31.75F, -2F, -8.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357 front ditchlight canook
		bodyModel[182].setRotationPoint(-31.75F, -2F, 6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[183].setRotationPoint(-31.25F, -1F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[184].setRotationPoint(-31.25F, -1F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[185].setRotationPoint(30.75F, -1F, -8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 361 rear ditchlight canook
		bodyModel[186].setRotationPoint(31.25F, -2F, -8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[187].setRotationPoint(30.75F, -1F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363 rear ditchlight canook
		bodyModel[188].setRotationPoint(31.25F, -2F, 6.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[189].setRotationPoint(-27.25F, -14.5F, -8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[190].setRotationPoint(-27.6F, -14F, -7.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[191].setRotationPoint(-26.75F, -14F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[192].setRotationPoint(-26.75F, -12.75F, -7.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 1.25F, 0F, 0F, 1.25F, 0F); // Box 372
		bodyModel[193].setRotationPoint(-24F, -15.26F, 0F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 22, 0, 8, 0F,0F, -1.25F, 0F, -11F, -1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -11F, 1.25F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[194].setRotationPoint(-24F, -15.26F, -8F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374 mu box thing
		bodyModel[195].setRotationPoint(-31.5F, -3F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 399
		bodyModel[196].setRotationPoint(30F, -4F, 3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 400
		bodyModel[197].setRotationPoint(30.5F, -3.5F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[198].setRotationPoint(-31F, -4F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[199].setRotationPoint(-31.5F, -3.5F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 523
		bodyModel[200].setRotationPoint(-4F, 3F, -10.47F);
		bodyModel[200].rotateAngleX = -0.78539816F;

		bodyModel[201].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Box 510
		bodyModel[201].setRotationPoint(-4F, 3F, 10.47F);
		bodyModel[201].rotateAngleX = 0.78539816F;

		bodyModel[202].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, 0F, -4F, 0F); // Box 511 compressed pipework
		bodyModel[202].setRotationPoint(-5F, 3F, -11.01F);

		bodyModel[203].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 512
		bodyModel[203].setRotationPoint(4F, 3.5F, -10.75F);
		bodyModel[203].rotateAngleX = -0.52359878F;

		bodyModel[204].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 513
		bodyModel[204].setRotationPoint(4F, 3.5F, 10.75F);
		bodyModel[204].rotateAngleX = 0.52359878F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[205].setRotationPoint(-26.9F, -16F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[206].setRotationPoint(-26.9F, -17F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[207].setRotationPoint(27.9F, -16F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[208].setRotationPoint(27.9F, -17F, -0.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 529
		bodyModel[209].setRotationPoint(27F, 4F, 6F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 530
		bodyModel[210].setRotationPoint(27F, 2F, 6F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 531
		bodyModel[211].setRotationPoint(27F, 4F, 7.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 532
		bodyModel[212].setRotationPoint(27F, 6F, 7.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 533
		bodyModel[213].setRotationPoint(27F, 6F, 9F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 534
		bodyModel[214].setRotationPoint(27F, 8F, 9F);

		bodyModel[215].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 535
		bodyModel[215].setRotationPoint(27F, 8F, -11F);

		bodyModel[216].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 536
		bodyModel[216].setRotationPoint(27F, 6F, -9F);

		bodyModel[217].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 537
		bodyModel[217].setRotationPoint(27F, 6F, -9.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 538
		bodyModel[218].setRotationPoint(27F, 4F, -7.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 539
		bodyModel[219].setRotationPoint(27F, 4F, -8F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 540
		bodyModel[220].setRotationPoint(27F, 2F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[221].setRotationPoint(-4F, 4F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[222].setRotationPoint(-4F, 3F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[223].setRotationPoint(-4F, 4F, 10F);

		bodyModel[224].addBox(0F, 0F, 0F, 0, 18, 22, 0F); // Box 544
		bodyModel[224].setRotationPoint(31.01F, -9F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[225].setRotationPoint(31.01F, -9F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 547
		bodyModel[226].setRotationPoint(31.01F, -9F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[227].setRotationPoint(31.01F, -7F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[228].setRotationPoint(31.01F, -7F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 554
		bodyModel[229].setRotationPoint(31F, -0.5F, -10F);

		bodyModel[230].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 555
		bodyModel[230].setRotationPoint(31F, -7F, -0.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 556 mu box thing
		bodyModel[231].setRotationPoint(30.5F, -3F, -3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 2
		bodyModel[232].setRotationPoint(-27.25F, -14.5F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box Glow
		bodyModel[233].setRotationPoint(-27.6F, -14F, 6.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box Glow
		bodyModel[234].setRotationPoint(-26.75F, -14F, 6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[235].setRotationPoint(-26.75F, -12.75F, 6.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[236].setRotationPoint(-31F, -9F, -10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 574
		bodyModel[237].setRotationPoint(-31F, -9F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 575
		bodyModel[238].setRotationPoint(31F, -9F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[239].setRotationPoint(31F, -9F, -10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[240].setRotationPoint(1F, -7F, -8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[241].setRotationPoint(-2F, -7F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[242].setRotationPoint(-5F, -7F, -8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[243].setRotationPoint(-8F, -7F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[244].setRotationPoint(-11F, -7F, -8F);

		bodyModel[245].addBox(0F, 0F, 0F, 0, 12, 12, 0F); // Box 419 fan
		bodyModel[245].setRotationPoint(-25.02F, -11.5F, -6F);

		bodyModel[246].addBox(0.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard front double
		bodyModel[246].setRotationPoint(-27F, -14F, 1F);
		bodyModel[246].rotateAngleY = 0.4712389F;

		bodyModel[247].addBox(0.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard front double
		bodyModel[247].setRotationPoint(-27F, -14F, -1F);
		bodyModel[247].rotateAngleY = -0.4712389F;

		bodyModel[248].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear single
		bodyModel[248].setRotationPoint(29F, -14F, -1.5F);
		bodyModel[248].rotateAngleY = 0.4712389F;

		bodyModel[249].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear single
		bodyModel[249].setRotationPoint(29F, -14F, 1.5F);
		bodyModel[249].rotateAngleY = -0.4712389F;

		bodyModel[250].addBox(-2.1F, 0F, -0.95F, 2, 1, 1, 0F); // Box 168 numberboard rear double
		bodyModel[250].setRotationPoint(29F, -14F, 1F);
		bodyModel[250].rotateAngleY = -0.4712389F;

		bodyModel[251].addBox(-2.1F, 0F, -0.05F, 2, 1, 1, 0F); // Box 167 numberboard rear double
		bodyModel[251].setRotationPoint(29F, -14F, -1F);
		bodyModel[251].rotateAngleY = 0.4712389F;

		bodyModel[252].addBox(-2.5F, 0F, -1F, 5, 2, 1, 0F); // Box 415
		bodyModel[252].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[252].rotateAngleY = -1.04719755F;

		bodyModel[253].addShapeBox(-2.5F, 0F, -1.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 416 more sp numberboard
		bodyModel[253].setRotationPoint(-22.75F, -17F, -5F);
		bodyModel[253].rotateAngleY = -1.04719755F;

		bodyModel[254].addBox(-2.5F, 0F, -1F, 5, 1, 1, 0F); // Box 417 cull
		bodyModel[254].setRotationPoint(-22.75F, -15F, -5F);
		bodyModel[254].rotateAngleY = -1.04719755F;

		bodyModel[255].addBox(-2.5F, 0F, 0F, 5, 1, 1, 0F); // Box 418 cull
		bodyModel[255].setRotationPoint(-22.75F, -15F, 5F);
		bodyModel[255].rotateAngleY = 1.04719755F;

		bodyModel[256].addBox(-2.5F, 0F, 0F, 5, 2, 1, 0F); // Box 419
		bodyModel[256].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[256].rotateAngleY = 1.04719755F;

		bodyModel[257].addShapeBox(-2.5F, 0F, 0.05F, 5, 2, 1, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 420 more sp numberboard
		bodyModel[257].setRotationPoint(-22.75F, -17F, 5F);
		bodyModel[257].rotateAngleY = 1.04719755F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 426 flexicoil short skirt
		bodyModel[258].setRotationPoint(-27F, 2F, -10.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 427 flexicoil short skirt
		bodyModel[259].setRotationPoint(-27F, 2F, 10.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 428 flexicoil short skirt
		bodyModel[260].setRotationPoint(25F, 2F, 10.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 429 flexicoil short skirt
		bodyModel[261].setRotationPoint(25F, 2F, -10.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33 tall stack
		bodyModel[262].setRotationPoint(0F, -21F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[263].setRotationPoint(1F, -11F, -8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[264].setRotationPoint(-2F, -11F, -8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[265].setRotationPoint(-5F, -11F, -8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[266].setRotationPoint(-8F, -11F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[267].setRotationPoint(-11F, -11F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 409 vent
		bodyModel[268].setRotationPoint(1F, -3F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 410 vent
		bodyModel[269].setRotationPoint(-2F, -3F, -8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 411 vent
		bodyModel[270].setRotationPoint(-5F, -3F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 412 vent
		bodyModel[271].setRotationPoint(-8F, -3F, -8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,-0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F, -0.375F, 0F, 0.05F); // Box 414
		bodyModel[272].setRotationPoint(-11F, -3F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 3F, 1F, -0.5F, 3F, 1F, -0.5F, 3F, 1F, -0.5F, 3F); // Box 655 re engineered
		bodyModel[273].setRotationPoint(-23F, -16.5F, -5F);

		bodyModel[274].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 656 re engineered
		bodyModel[274].setRotationPoint(-22F, -17.25F, -3.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 538
		bodyModel[275].setRotationPoint(-0.5F, -21F, -1.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[276].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 540
		bodyModel[277].setRotationPoint(-0.5F, -19F, -1.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 240
		bodyModel[278].setRotationPoint(-0.5F, -22F, -1F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 523
		bodyModel[279].setRotationPoint(3F, -22F, -0.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 524
		bodyModel[280].setRotationPoint(-2F, -22F, -0.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 525
		bodyModel[281].setRotationPoint(-2.5F, -19F, -1.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 260 cull
		bodyModel[282].setRotationPoint(-0.5F, -22F, -1.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 285
		bodyModel[283].setRotationPoint(0F, -17F, 0F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 515
		bodyModel[284].setRotationPoint(0F, -17F, -1F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 526
		bodyModel[285].setRotationPoint(-10F, -17F, -1F);

		bodyModel[286].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 171
		bodyModel[286].setRotationPoint(-3.5F, -19F, -1.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[287].setRotationPoint(-3.5F, -20F, -1.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 580
		bodyModel[288].setRotationPoint(-10.5F, -19F, -1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 581 cull
		bodyModel[289].setRotationPoint(-5.5F, -16.5F, -1.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 583
		bodyModel[290].setRotationPoint(-6.5F, -20F, -1.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[291].setRotationPoint(0.75F, -22.5F, -1F);
		bodyModel[291].rotateAngleZ = -0.87266463F;

		bodyModel[292].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[292].setRotationPoint(-9.25F, -22.5F, -1F);
		bodyModel[292].rotateAngleZ = -0.87266463F;

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 398
		bodyModel[293].setRotationPoint(0F, -16F, 5F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 399
		bodyModel[294].setRotationPoint(2F, -15F, 5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 629 dynamic brake
		bodyModel[295].setRotationPoint(4F, -19F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 633 dynamic brake
		bodyModel[296].setRotationPoint(4F, -20F, -8F);

		bodyModel[297].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278 dynamic brake fan
		bodyModel[297].setRotationPoint(4.5F, -20.75F, -3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 635 dynamic brake bit
		bodyModel[298].setRotationPoint(4.5F, -19F, -8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 636 dynamic brake bit
		bodyModel[299].setRotationPoint(8.5F, -19F, -7.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 637 dynamic brake bit
		bodyModel[300].setRotationPoint(8.5F, -19F, 6.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F); // Box 638 dynamic brake bit
		bodyModel[301].setRotationPoint(4.5F, -19F, 7F);

		bodyModel[302].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Box 639 torpedo tube
		bodyModel[302].setRotationPoint(-12.5F, -17F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640 torpedo tube
		bodyModel[303].setRotationPoint(-12.5F, -18F, -6F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 641 torpedo tube
		bodyModel[304].setRotationPoint(-12.5F, -16F, -6F);

		bodyModel[305].addBox(0F, 0F, 0F, 16, 1, 3, 0F); // Box 642 torpedo tube
		bodyModel[305].setRotationPoint(-12.5F, -17F, 3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643 torpedo tube
		bodyModel[306].setRotationPoint(-12.5F, -18F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 644 torpedo tube
		bodyModel[307].setRotationPoint(-12.5F, -16F, 3F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 647
		bodyModel[308].setRotationPoint(-10.5F, -16F, -5.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 648
		bodyModel[309].setRotationPoint(0.5F, -16F, -5.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 649
		bodyModel[310].setRotationPoint(0.5F, -16F, 3.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 650
		bodyModel[311].setRotationPoint(-10.5F, -16F, 3.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 561 canfor bit
		bodyModel[312].setRotationPoint(-10.5F, -19F, -1.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 654 canfor bit
		bodyModel[313].setRotationPoint(-12.5F, -21F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[314].setRotationPoint(-25.5F, -13F, -7.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[315].setRotationPoint(-25.5F, -13F, 6.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 419 cull
		bodyModel[316].setRotationPoint(-10.5F, -23F, -1.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 420 cull
		bodyModel[317].setRotationPoint(-0.5F, -23F, -1.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[318].setRotationPoint(21F, -7F, -11.02F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[319].setRotationPoint(21F, -7F, 11.02F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[320].setRotationPoint(27F, -7F, -11.02F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[321].setRotationPoint(27F, -7F, 11.02F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 184
		bodyModel[322].setRotationPoint(27F, 1F, -11F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 184
		bodyModel[323].setRotationPoint(27F, 1F, 6F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 16, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[324].setRotationPoint(11F, -12F, -7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[325].setRotationPoint(11F, -13F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[326].setRotationPoint(11F, -13F, 0F);

		bodyModel[327].addBox(0F, 0F, 0F, 10, 0, 1, 0F); // Box 390
		bodyModel[327].setRotationPoint(12F, -12F, -8F);

		bodyModel[328].addBox(0F, 0F, 0F, 10, 0, 1, 0F); // Box 509
		bodyModel[328].setRotationPoint(12F, -12F, 7F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F); // Box 557
		bodyModel[329].setRotationPoint(26F, -15F, -2.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 651 yes this is a real bit
		bodyModel[330].setRotationPoint(9F, -3F, 7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0.25F, 0.25F, -0.51F, 0.25F, 0.25F, -0.51F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.51F, 0.25F, 0.25F, -0.51F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 107 inset gauge window thing cull
		bodyModel[331].setRotationPoint(26.5F, -11F, -4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP spark arrestor stack
		bodyModel[332].setRotationPoint(0F, -19.5F, -2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // UP spark arrestor stack
		bodyModel[333].setRotationPoint(-1F, -19.5F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // UP spark arrestor stack
		bodyModel[334].setRotationPoint(2F, -19.5F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // UP spark arrestor stack
		bodyModel[335].setRotationPoint(0F, -21F, -1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // UP spark arrestor stack
		bodyModel[336].setRotationPoint(-1F, -21F, -1F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // UP spark arrestor stack
		bodyModel[337].setRotationPoint(2F, -21F, -1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP spark arrestor stack
		bodyModel[338].setRotationPoint(-10F, -19.5F, -2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // UP spark arrestor stack
		bodyModel[339].setRotationPoint(-11F, -19.5F, -1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // UP spark arrestor stack
		bodyModel[340].setRotationPoint(-8F, -19.5F, -1F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // UP spark arrestor stack
		bodyModel[341].setRotationPoint(-10F, -21F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // UP spark arrestor stack
		bodyModel[342].setRotationPoint(-11F, -21F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // UP spark arrestor stack
		bodyModel[343].setRotationPoint(-8F, -21F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // UP air brake piping
		bodyModel[344].setRotationPoint(-12F, -17.5F, -2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[345].setRotationPoint(-11.75F, -17.5F, -3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // UP air brake piping
		bodyModel[346].setRotationPoint(-11.75F, -17F, 2F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 24, 3, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[347].setRotationPoint(-11.75F, -17F, 4.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 202
		bodyModel[348].setRotationPoint(-5F, 3F, -11F);

		bodyModel[349].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 202
		bodyModel[349].setRotationPoint(-5F, 3F, 7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081 air tank support cull
		bodyModel[350].setRotationPoint(13F, -13.75F, 0.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[351].setRotationPoint(13F, -16F, 0.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[352].setRotationPoint(13F, -17F, 1.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[353].setRotationPoint(13F, -16F, 3.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 541
		bodyModel[354].setRotationPoint(13F, -16F, -4.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 542
		bodyModel[355].setRotationPoint(13F, -17F, -3.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 543
		bodyModel[356].setRotationPoint(13F, -16F, -1.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081 air tank support cull
		bodyModel[357].setRotationPoint(13F, -13.75F, -4.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[358].setRotationPoint(12.99F, -15.5F, -3F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[359].setRotationPoint(25.01F, -15.5F, 2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // UP air brake piping
		bodyModel[360].setRotationPoint(25.01F, -15.5F, -5.25F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 0, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // UP air brake piping
		bodyModel[361].setRotationPoint(12.5F, -17F, -5.25F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // UP air brake piping
		bodyModel[362].setRotationPoint(13.5F, -17F, -5.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // UP air brake piping
		bodyModel[363].setRotationPoint(19.5F, -16F, -5.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[364].setRotationPoint(12.5F, -17F, -5.25F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[365].setRotationPoint(23.5F, -15.5F, -5.25F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // UP air brake piping
		bodyModel[366].setRotationPoint(17.5F, -16F, -5.25F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 0, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107 inset gauge strip
		bodyModel[367].setRotationPoint(26.51F, -10.5F, -3.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19 MILW box
		bodyModel[368].setRotationPoint(13F, -16.25F, -5F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 184
		bodyModel[369].setRotationPoint(11F, -15F, 0F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[370].setRotationPoint(26.5F, -11.5F, -6.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 422 crl markerlight
		bodyModel[371].setRotationPoint(26.5F, -11.5F, 5.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[372].setRotationPoint(27F, -9F, -6F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 2
		bodyModel[373].setRotationPoint(27.99F, -9.75F, -6.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 43
		bodyModel[374].setRotationPoint(27.5F, -8.5F, -5.25F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[375].setRotationPoint(27F, -5F, -5.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[376].setRotationPoint(27F, -2F, -6F);

		bodyModel[377].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 188
		bodyModel[377].setRotationPoint(27F, 2F, -10.75F);

		bodyModel[378].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 190
		bodyModel[378].setRotationPoint(27F, 2F, 10.75F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 276
		bodyModel[379].setRotationPoint(31.02F, 2F, -10.75F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 383
		bodyModel[380].setRotationPoint(31.02F, 2F, 9.75F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 8, 14, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 409 vent
		bodyModel[381].setRotationPoint(14F, -11F, -7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245 cull
		bodyModel[382].setRotationPoint(-12F, -18F, -1.55F);

		bodyModel[383].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 436 mu cable confuckery
		bodyModel[383].setRotationPoint(-31.03F, 2F, -8F);

		bodyModel[384].addBox(0F, 0F, 0F, 0, 7, 16, 0F); // Box 437 mu cable confuckery
		bodyModel[384].setRotationPoint(31.03F, 2F, -8F);
	}
	ModelTypeAnew theTrucks1 = new ModelTypeAnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 123456) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_silvers_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
		/*} else if (GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeAclassico_SP.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix(); */
		 else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/TypeA_new_Black_fric.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0F ,0.0F,0F);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.0F,0.0F,0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}