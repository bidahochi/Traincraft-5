//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD7-SD9
// Model Creator: bidahochi, cubed
// Created on: 05.04.2024 - 22:44:01
// Last changed on: 05.04.2024 - 22:44:01

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C_Early;
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

public class ModelSD9new extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD9new() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[529];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 192, 120, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 230, 150, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 230, 150, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 232, 156, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 243, 148, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 240, 155, textureX, textureY); // Box 489
		bodyModel[7] = new ModelRendererTurbo(this, 304, 155, textureX, textureY); // Box 280
		bodyModel[8] = new ModelRendererTurbo(this, 308, 182, textureX, textureY); // Box 287
		bodyModel[9] = new ModelRendererTurbo(this, 244, 182, textureX, textureY); // Box 288
		bodyModel[10] = new ModelRendererTurbo(this, 190, 179, textureX, textureY); // Box 293
		bodyModel[11] = new ModelRendererTurbo(this, 190, 179, textureX, textureY); // Box 294
		bodyModel[12] = new ModelRendererTurbo(this, 19, 127, textureX, textureY); // Box 3
		bodyModel[13] = new ModelRendererTurbo(this, 153, 127, textureX, textureY); // Box 266
		bodyModel[14] = new ModelRendererTurbo(this, 243, 156, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 56, 145, textureX, textureY); // Box 332
		bodyModel[16] = new ModelRendererTurbo(this, 22, 145, textureX, textureY); // Box 333
		bodyModel[17] = new ModelRendererTurbo(this, 34, 128, textureX, textureY); // Box 335
		bodyModel[18] = new ModelRendererTurbo(this, 41, 131, textureX, textureY); // Box 353
		bodyModel[19] = new ModelRendererTurbo(this, 48, 140, textureX, textureY); // Box 143
		bodyModel[20] = new ModelRendererTurbo(this, 35, 131, textureX, textureY); // Box 444
		bodyModel[21] = new ModelRendererTurbo(this, 35, 133, textureX, textureY); // Box 145
		bodyModel[22] = new ModelRendererTurbo(this, 48, 137, textureX, textureY); // Box 80
		bodyModel[23] = new ModelRendererTurbo(this, 30, 137, textureX, textureY); // Box 450
		bodyModel[24] = new ModelRendererTurbo(this, 32, 140, textureX, textureY); // Box 310
		bodyModel[25] = new ModelRendererTurbo(this, 49, 132, textureX, textureY); // Box 311 mu plug
		bodyModel[26] = new ModelRendererTurbo(this, 27, 132, textureX, textureY); // Box 312 mu plog
		bodyModel[27] = new ModelRendererTurbo(this, 205, 47, textureX, textureY); // Box 215
		bodyModel[28] = new ModelRendererTurbo(this, 186, 55, textureX, textureY); // Box 216
		bodyModel[29] = new ModelRendererTurbo(this, 156, 55, textureX, textureY); // Box 217
		bodyModel[30] = new ModelRendererTurbo(this, 175, 59, textureX, textureY); // Box 218
		bodyModel[31] = new ModelRendererTurbo(this, 205, 25, textureX, textureY); // Box 350
		bodyModel[32] = new ModelRendererTurbo(this, 186, 41, textureX, textureY); // Box 351
		bodyModel[33] = new ModelRendererTurbo(this, 175, 45, textureX, textureY); // Box 352
		bodyModel[34] = new ModelRendererTurbo(this, 156, 41, textureX, textureY); // Box 353
		bodyModel[35] = new ModelRendererTurbo(this, 142, 46, textureX, textureY, "lamp"); // Box 117 numberboard front high
		bodyModel[36] = new ModelRendererTurbo(this, 142, 46, textureX, textureY, "lamp"); // Box 118 numberboard front high
		bodyModel[37] = new ModelRendererTurbo(this, 124, 39, textureX, textureY); // Box 216 regular lightkit
		bodyModel[38] = new ModelRendererTurbo(this, 117, 39, textureX, textureY, "lamp"); // Box 215 headlight front 1
		bodyModel[39] = new ModelRendererTurbo(this, 117, 39, textureX, textureY, "lamp"); // Box 217 headlight front 2
		bodyModel[40] = new ModelRendererTurbo(this, 176, 41, textureX, textureY); // Box 190
		bodyModel[41] = new ModelRendererTurbo(this, 62, 10, textureX, textureY); // Box 9
		bodyModel[42] = new ModelRendererTurbo(this, 62, 24, textureX, textureY); // Box 10
		bodyModel[43] = new ModelRendererTurbo(this, 10, 5, textureX, textureY); // Box 15
		bodyModel[44] = new ModelRendererTurbo(this, 87, 7, textureX, textureY); // Box 21
		bodyModel[45] = new ModelRendererTurbo(this, 126, 21, textureX, textureY); // Box 314 door swing right
		bodyModel[46] = new ModelRendererTurbo(this, 50, 21, textureX, textureY); // Box 315 door swing right
		bodyModel[47] = new ModelRendererTurbo(this, 7, 36, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Box 371
		bodyModel[49] = new ModelRendererTurbo(this, 3, 64, textureX, textureY); // Box 372
		bodyModel[50] = new ModelRendererTurbo(this, 45, 64, textureX, textureY); // Box 373
		bodyModel[51] = new ModelRendererTurbo(this, 12, 53, textureX, textureY); // Box 347
		bodyModel[52] = new ModelRendererTurbo(this, 400, 68, textureX, textureY); // Box 219
		bodyModel[53] = new ModelRendererTurbo(this, 419, 67, textureX, textureY); // Box 220
		bodyModel[54] = new ModelRendererTurbo(this, 430, 68, textureX, textureY); // Box 221
		bodyModel[55] = new ModelRendererTurbo(this, 253, 54, textureX, textureY); // Box 223 the hooh
		bodyModel[56] = new ModelRendererTurbo(this, 277, 28, textureX, textureY); // Box 91
		bodyModel[57] = new ModelRendererTurbo(this, 289, 19, textureX, textureY); // Box 101
		bodyModel[58] = new ModelRendererTurbo(this, 276, 19, textureX, textureY); // Box 105
		bodyModel[59] = new ModelRendererTurbo(this, 318, 19, textureX, textureY); // Box 172
		bodyModel[60] = new ModelRendererTurbo(this, 289, 24, textureX, textureY); // Box 173
		bodyModel[61] = new ModelRendererTurbo(this, 276, 24, textureX, textureY); // Box 176
		bodyModel[62] = new ModelRendererTurbo(this, 318, 24, textureX, textureY); // Box 177
		bodyModel[63] = new ModelRendererTurbo(this, 289, 44, textureX, textureY); // Box 178
		bodyModel[64] = new ModelRendererTurbo(this, 318, 44, textureX, textureY); // Box 179
		bodyModel[65] = new ModelRendererTurbo(this, 318, 48, textureX, textureY); // Box 180
		bodyModel[66] = new ModelRendererTurbo(this, 289, 48, textureX, textureY); // Box 181
		bodyModel[67] = new ModelRendererTurbo(this, 276, 48, textureX, textureY); // Box 182
		bodyModel[68] = new ModelRendererTurbo(this, 276, 44, textureX, textureY); // Box 183
		bodyModel[69] = new ModelRendererTurbo(this, 354, 46, textureX, textureY); // Box 299
		bodyModel[70] = new ModelRendererTurbo(this, 333, 22, textureX, textureY); // Box 324
		bodyModel[71] = new ModelRendererTurbo(this, 354, 43, textureX, textureY); // Box 322
		bodyModel[72] = new ModelRendererTurbo(this, 400, 37, textureX, textureY); // Box 323
		bodyModel[73] = new ModelRendererTurbo(this, 289, 12, textureX, textureY); // Box 184 stacc
		bodyModel[74] = new ModelRendererTurbo(this, 324, 12, textureX, textureY); // Box 185 stacc
		bodyModel[75] = new ModelRendererTurbo(this, 398, 95, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[76] = new ModelRendererTurbo(this, 398, 95, textureX, textureY); // Box 443 hd funky dynamic radiator
		bodyModel[77] = new ModelRendererTurbo(this, 420, 55, textureX, textureY); // Box 191
		bodyModel[78] = new ModelRendererTurbo(this, 318, 38, textureX, textureY); // Box 263
		bodyModel[79] = new ModelRendererTurbo(this, 318, 28, textureX, textureY); // Box 264
		bodyModel[80] = new ModelRendererTurbo(this, 276, 28, textureX, textureY); // Box 265
		bodyModel[81] = new ModelRendererTurbo(this, 276, 38, textureX, textureY); // Box 266
		bodyModel[82] = new ModelRendererTurbo(this, 349, 20, textureX, textureY); // Box 282
		bodyModel[83] = new ModelRendererTurbo(this, 365, 22, textureX, textureY); // Box 283
		bodyModel[84] = new ModelRendererTurbo(this, 381, 20, textureX, textureY); // Box 284
		bodyModel[85] = new ModelRendererTurbo(this, 354, 30, textureX, textureY); // Box 287
		bodyModel[86] = new ModelRendererTurbo(this, 431, 55, textureX, textureY); // Box 288
		bodyModel[87] = new ModelRendererTurbo(this, 354, 37, textureX, textureY); // Box 289
		bodyModel[88] = new ModelRendererTurbo(this, 430, 37, textureX, textureY); // Box 290
		bodyModel[89] = new ModelRendererTurbo(this, 398, 100, textureX, textureY, "cull"); // Box 293 rear side radiator cull
		bodyModel[90] = new ModelRendererTurbo(this, 398, 100, textureX, textureY, "cull"); // Box 294 rear side radiator cull
		bodyModel[91] = new ModelRendererTurbo(this, 453, 40, textureX, textureY, "lamp"); // Box 295 numberboard rear
		bodyModel[92] = new ModelRendererTurbo(this, 453, 40, textureX, textureY, "lamp"); // Box 296 numberboard rear
		bodyModel[93] = new ModelRendererTurbo(this, 401, 55, textureX, textureY); // Box 303
		bodyModel[94] = new ModelRendererTurbo(this, 332, 46, textureX, textureY); // Box 304
		bodyModel[95] = new ModelRendererTurbo(this, 332, 39, textureX, textureY); // Box 305
		bodyModel[96] = new ModelRendererTurbo(this, 370, 125, textureX, textureY, "cull"); // Box cull integrated pipes
		bodyModel[97] = new ModelRendererTurbo(this, 457, 34, textureX, textureY, "lamp"); // Box 322 sd9 markerlight
		bodyModel[98] = new ModelRendererTurbo(this, 457, 34, textureX, textureY, "lamp"); // Box 324 sd9 markerlight
		bodyModel[99] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 344 cab floor
		bodyModel[100] = new ModelRendererTurbo(this, 116, 112, textureX, textureY); // Box 345
		bodyModel[101] = new ModelRendererTurbo(this, 94, 112, textureX, textureY); // Box 346
		bodyModel[102] = new ModelRendererTurbo(this, 116, 89, textureX, textureY); // Box 362
		bodyModel[103] = new ModelRendererTurbo(this, 94, 89, textureX, textureY); // Box 363
		bodyModel[104] = new ModelRendererTurbo(this, 400, 46, textureX, textureY); // Box 286
		bodyModel[105] = new ModelRendererTurbo(this, 430, 46, textureX, textureY); // Box 291
		bodyModel[106] = new ModelRendererTurbo(this, 419, 63, textureX, textureY); // Box 338
		bodyModel[107] = new ModelRendererTurbo(this, 420, 59, textureX, textureY); // Box 268
		bodyModel[108] = new ModelRendererTurbo(this, 95, 127, textureX, textureY); // Box 3
		bodyModel[109] = new ModelRendererTurbo(this, 98, 145, textureX, textureY); // Box 330
		bodyModel[110] = new ModelRendererTurbo(this, 132, 145, textureX, textureY); // Box 331
		bodyModel[111] = new ModelRendererTurbo(this, 111, 133, textureX, textureY); // Box 251
		bodyModel[112] = new ModelRendererTurbo(this, 124, 137, textureX, textureY); // Box 252
		bodyModel[113] = new ModelRendererTurbo(this, 106, 137, textureX, textureY); // Box 254
		bodyModel[114] = new ModelRendererTurbo(this, 110, 128, textureX, textureY); // Box 256
		bodyModel[115] = new ModelRendererTurbo(this, 111, 131, textureX, textureY); // Box 257
		bodyModel[116] = new ModelRendererTurbo(this, 117, 131, textureX, textureY); // Box 258
		bodyModel[117] = new ModelRendererTurbo(this, 103, 132, textureX, textureY); // Box 394 mu plug
		bodyModel[118] = new ModelRendererTurbo(this, 125, 132, textureX, textureY); // Box 395 mu plug
		bodyModel[119] = new ModelRendererTurbo(this, 124, 140, textureX, textureY); // Box 366
		bodyModel[120] = new ModelRendererTurbo(this, 108, 140, textureX, textureY); // Box 367
		bodyModel[121] = new ModelRendererTurbo(this, 192, 159, textureX, textureY); // Box 182
		bodyModel[122] = new ModelRendererTurbo(this, 192, 159, textureX, textureY); // Box 183
		bodyModel[123] = new ModelRendererTurbo(this, 192, 159, textureX, textureY); // Box 184
		bodyModel[124] = new ModelRendererTurbo(this, 192, 159, textureX, textureY); // Box 185
		bodyModel[125] = new ModelRendererTurbo(this, 202, 169, textureX, textureY, "cull"); // Box cull tancc pipes
		bodyModel[126] = new ModelRendererTurbo(this, 202, 162, textureX, textureY, "cull"); // Box cull tancc pipes
		bodyModel[127] = new ModelRendererTurbo(this, 124, 46, textureX, textureY); // Box 188 cs/up sd7 lightkit
		bodyModel[128] = new ModelRendererTurbo(this, 117, 45, textureX, textureY, "lamp"); // Box 189 headlight front cs/up
		bodyModel[129] = new ModelRendererTurbo(this, 117, 45, textureX, textureY, "lamp"); // Box 190 headlight front cs/up
		bodyModel[130] = new ModelRendererTurbo(this, 117, 50, textureX, textureY, "lamp"); // Box 218 headlight front 1 gyra
		bodyModel[131] = new ModelRendererTurbo(this, 124, 53, textureX, textureY); // Box 219 sp lightkit
		bodyModel[132] = new ModelRendererTurbo(this, 117, 55, textureX, textureY, "lamp"); // Box 220 headlight front 2 gyra
		bodyModel[133] = new ModelRendererTurbo(this, 124, 60, textureX, textureY); // Box 194 sp lightkit
		bodyModel[134] = new ModelRendererTurbo(this, 117, 63, textureX, textureY, "lamp"); // Box 195 headlight front sp
		bodyModel[135] = new ModelRendererTurbo(this, 117, 63, textureX, textureY, "lamp"); // Box 196 headlight front sp
		bodyModel[136] = new ModelRendererTurbo(this, 289, 6, textureX, textureY); // Box 335 extendo stack
		bodyModel[137] = new ModelRendererTurbo(this, 324, 6, textureX, textureY); // Box 336 extendo stack
		bodyModel[138] = new ModelRendererTurbo(this, 135, 215, textureX, textureY, "cull"); // Box 338 stairwell cull
		bodyModel[139] = new ModelRendererTurbo(this, 135, 209, textureX, textureY); // Box 342
		bodyModel[140] = new ModelRendererTurbo(this, 136, 204, textureX, textureY); // Box 343
		bodyModel[141] = new ModelRendererTurbo(this, 142, 226, textureX, textureY, "cull"); // Box 345 stairs cull
		bodyModel[142] = new ModelRendererTurbo(this, 159, 204, textureX, textureY); // Box 349
		bodyModel[143] = new ModelRendererTurbo(this, 158, 209, textureX, textureY); // Box 350
		bodyModel[144] = new ModelRendererTurbo(this, 206, 78, textureX, textureY); // Box 359
		bodyModel[145] = new ModelRendererTurbo(this, 155, 236, textureX, textureY); // Box 363
		bodyModel[146] = new ModelRendererTurbo(this, 155, 239, textureX, textureY); // Box 364
		bodyModel[147] = new ModelRendererTurbo(this, 156, 226, textureX, textureY, "cull"); // Box 367 stairs cull
		bodyModel[148] = new ModelRendererTurbo(this, 176, 121, textureX, textureY); // Box 369
		bodyModel[149] = new ModelRendererTurbo(this, 162, 236, textureX, textureY); // Box 370
		bodyModel[150] = new ModelRendererTurbo(this, 153, 108, textureX, textureY); // Box 372
		bodyModel[151] = new ModelRendererTurbo(this, 176, 93, textureX, textureY); // Box 373
		bodyModel[152] = new ModelRendererTurbo(this, 143, 204, textureX, textureY); // Box 374
		bodyModel[153] = new ModelRendererTurbo(this, 142, 209, textureX, textureY); // Box 375
		bodyModel[154] = new ModelRendererTurbo(this, 166, 204, textureX, textureY); // Box 378
		bodyModel[155] = new ModelRendererTurbo(this, 165, 209, textureX, textureY); // Box 379
		bodyModel[156] = new ModelRendererTurbo(this, 174, 78, textureX, textureY); // Box 396
		bodyModel[157] = new ModelRendererTurbo(this, 318, 161, textureX, textureY); // Box 407 dual fueltank connector pipe
		bodyModel[158] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 408
		bodyModel[159] = new ModelRendererTurbo(this, 291, 164, textureX, textureY); // Box 409
		bodyModel[160] = new ModelRendererTurbo(this, 291, 152, textureX, textureY); // Box 410
		bodyModel[161] = new ModelRendererTurbo(this, 253, 171, textureX, textureY); // Box 411
		bodyModel[162] = new ModelRendererTurbo(this, 317, 171, textureX, textureY); // Box 412
		bodyModel[163] = new ModelRendererTurbo(this, 317, 166, textureX, textureY); // Box 413
		bodyModel[164] = new ModelRendererTurbo(this, 253, 166, textureX, textureY); // Box 414
		bodyModel[165] = new ModelRendererTurbo(this, 198, 181, textureX, textureY, "cull"); // Box 415 cull fueltank vent
		bodyModel[166] = new ModelRendererTurbo(this, 188, 181, textureX, textureY, "cull"); // Box 416 cull fueltank vent
		bodyModel[167] = new ModelRendererTurbo(this, 218, 169, textureX, textureY); // Box 419 airtank supports
		bodyModel[168] = new ModelRendererTurbo(this, 367, 158, textureX, textureY); // Box 163
		bodyModel[169] = new ModelRendererTurbo(this, 367, 158, textureX, textureY); // Box 427
		bodyModel[170] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 300
		bodyModel[171] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 301
		bodyModel[172] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 302
		bodyModel[173] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 435
		bodyModel[174] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 436
		bodyModel[175] = new ModelRendererTurbo(this, 355, 159, textureX, textureY); // Box 437
		bodyModel[176] = new ModelRendererTurbo(this, 141, 239, textureX, textureY); // Box 440
		bodyModel[177] = new ModelRendererTurbo(this, 141, 236, textureX, textureY); // Box 441
		bodyModel[178] = new ModelRendererTurbo(this, 134, 236, textureX, textureY); // Box 445
		bodyModel[179] = new ModelRendererTurbo(this, 135, 209, textureX, textureY, "cull"); // Box 448 cull stair cope cube
		bodyModel[180] = new ModelRendererTurbo(this, 31, 3, textureX, textureY); // Box 411
		bodyModel[181] = new ModelRendererTurbo(this, 108, 3, textureX, textureY); // Box 465
		bodyModel[182] = new ModelRendererTurbo(this, 96, 53, textureX, textureY, "lamp"); // Box 469 sp e gyra FRONT
		bodyModel[183] = new ModelRendererTurbo(this, 103, 53, textureX, textureY); // Box 440 sp e gyra BOX
		bodyModel[184] = new ModelRendererTurbo(this, 110, 58, textureX, textureY); // Box 471 sp e gyra HOLDER /bell holder
		bodyModel[185] = new ModelRendererTurbo(this, 137, 114, textureX, textureY); // Box 137
		bodyModel[186] = new ModelRendererTurbo(this, 155, 116, textureX, textureY); // Box 139
		bodyModel[187] = new ModelRendererTurbo(this, 150, 116, textureX, textureY); // Box 140
		bodyModel[188] = new ModelRendererTurbo(this, 153, 93, textureX, textureY); // Box 237
		bodyModel[189] = new ModelRendererTurbo(this, 150, 93, textureX, textureY); // Box 247
		bodyModel[190] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 272
		bodyModel[191] = new ModelRendererTurbo(this, 76, 116, textureX, textureY); // Box 266
		bodyModel[192] = new ModelRendererTurbo(this, 73, 116, textureX, textureY); // Box 267
		bodyModel[193] = new ModelRendererTurbo(this, 81, 114, textureX, textureY); // Box 268
		bodyModel[194] = new ModelRendererTurbo(this, 81, 91, textureX, textureY); // Box 269
		bodyModel[195] = new ModelRendererTurbo(this, 78, 93, textureX, textureY); // Box 270
		bodyModel[196] = new ModelRendererTurbo(this, 75, 93, textureX, textureY); // Box 271
		bodyModel[197] = new ModelRendererTurbo(this, 196, 29, textureX, textureY); // Box 409 commander base
		bodyModel[198] = new ModelRendererTurbo(this, 196, 25, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[199] = new ModelRendererTurbo(this, 465, 66, textureX, textureY, "lamp"); // Box 218 headligh trear 1 gyra
		bodyModel[200] = new ModelRendererTurbo(this, 449, 66, textureX, textureY); // Box 219 sp lightkit
		bodyModel[201] = new ModelRendererTurbo(this, 458, 66, textureX, textureY, "lamp"); // Box 220 headlight rear 2 gyra
		bodyModel[202] = new ModelRendererTurbo(this, 450, 73, textureX, textureY); // Box 194 sp lightkit
		bodyModel[203] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, "lamp"); // Box 195 headlight rear sp
		bodyModel[204] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, "lamp"); // Box 196 headlight rear sp
		bodyModel[205] = new ModelRendererTurbo(this, 474, 73, textureX, textureY, "lamp"); // Box 469 sp e gyra REAR
		bodyModel[206] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 440 sp e gyra BOX
		bodyModel[207] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 471 sp e gyra HOLDER 
		bodyModel[208] = new ModelRendererTurbo(this, 14, 66, textureX, textureY); // Box 283
		bodyModel[209] = new ModelRendererTurbo(this, 14, 40, textureX, textureY); // Box 284
		bodyModel[210] = new ModelRendererTurbo(this, 13, 59, textureX, textureY); // Box 287
		bodyModel[211] = new ModelRendererTurbo(this, 42, 57, textureX, textureY); // Box 288
		bodyModel[212] = new ModelRendererTurbo(this, 4, 57, textureX, textureY); // Box 290
		bodyModel[213] = new ModelRendererTurbo(this, 13, 46, textureX, textureY); // Box 291
		bodyModel[214] = new ModelRendererTurbo(this, 43, 48, textureX, textureY); // Box 292
		bodyModel[215] = new ModelRendererTurbo(this, 3, 48, textureX, textureY); // Box 293
		bodyModel[216] = new ModelRendererTurbo(this, 132, 56, textureX, textureY, "cull"); // Box 294 cull ladder front
		bodyModel[217] = new ModelRendererTurbo(this, 143, 56, textureX, textureY, "cull"); // Box 295 cull ladder front
		bodyModel[218] = new ModelRendererTurbo(this, 462, 81, textureX, textureY, "cull"); // Box 296 cull ladders rear
		bodyModel[219] = new ModelRendererTurbo(this, 451, 81, textureX, textureY, "cull"); // Box 297 cull ladders rear
		bodyModel[220] = new ModelRendererTurbo(this, 452, 35, textureX, textureY); // Box 298 marker box
		bodyModel[221] = new ModelRendererTurbo(this, 460, 35, textureX, textureY); // Box 299 marker box
		bodyModel[222] = new ModelRendererTurbo(this, 141, 41, textureX, textureY); // Box 300 marker box
		bodyModel[223] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 301 sd9 markerlight
		bodyModel[224] = new ModelRendererTurbo(this, 149, 41, textureX, textureY); // Box 302 marker box
		bodyModel[225] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 303 sd9 markerlight
		bodyModel[226] = new ModelRendererTurbo(this, 108, 46, textureX, textureY); // Box 304 up/cs gyra housing front
		bodyModel[227] = new ModelRendererTurbo(this, 94, 48, textureX, textureY, "lamp"); // Box 305 gyralight front 3
		bodyModel[228] = new ModelRendererTurbo(this, 101, 48, textureX, textureY, "lamp"); // Box 306 gyralight front 4
		bodyModel[229] = new ModelRendererTurbo(this, 87, 52, textureX, textureY); // Box 307 up/cbq gyra holder
		bodyModel[230] = new ModelRendererTurbo(this, 246, 210, textureX, textureY); // Box 282 ballast
		bodyModel[231] = new ModelRendererTurbo(this, 246, 210, textureX, textureY); // Box 283 ballast
		bodyModel[232] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 284
		bodyModel[233] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 285
		bodyModel[234] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 286
		bodyModel[235] = new ModelRendererTurbo(this, 385, 160, textureX, textureY); // Box 287
		bodyModel[236] = new ModelRendererTurbo(this, 255, 30, textureX, textureY); // Box 302 sd9e electrical cab umbrella
		bodyModel[237] = new ModelRendererTurbo(this, 255, 17, textureX, textureY); // Box 303 sd9e electrical cab umbrella
		bodyModel[238] = new ModelRendererTurbo(this, 256, 24, textureX, textureY); // Box 304 sd9e electrical cab umbrella
		bodyModel[239] = new ModelRendererTurbo(this, 404, 17, textureX, textureY, "cull"); // Box 305 winterization hatch cull
		bodyModel[240] = new ModelRendererTurbo(this, 242, 37, textureX, textureY); // Box 306 sd9e filterbox
		bodyModel[241] = new ModelRendererTurbo(this, 239, 29, textureX, textureY); // Box 234  steam gen exhaust
		bodyModel[242] = new ModelRendererTurbo(this, 241, 34, textureX, textureY); // Box 308 steam gen air intake
		bodyModel[243] = new ModelRendererTurbo(this, 93, 62, textureX, textureY); // Box 204 sp trashcan part
		bodyModel[244] = new ModelRendererTurbo(this, 94, 69, textureX, textureY); // Box 205 sp trashcan part
		bodyModel[245] = new ModelRendererTurbo(this, 94, 58, textureX, textureY); // Box 206 sp trashcan part
		bodyModel[246] = new ModelRendererTurbo(this, 104, 63, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[247] = new ModelRendererTurbo(this, 84, 61, textureX, textureY, "lamp"); // Box 208 sp trashcan light front
		bodyModel[248] = new ModelRendererTurbo(this, 153, 20, textureX, textureY, "cull"); // Box 404 cull sp wagon wheel antenna support (yes its supposed to be offcenter, see https://www.railpictures.net/photo/283932/)
		bodyModel[249] = new ModelRendererTurbo(this, 141, 26, textureX, textureY); // Box 405 sp wagon wheel antenna
		bodyModel[250] = new ModelRendererTurbo(this, 181, 5, textureX, textureY); // Box 192
		bodyModel[251] = new ModelRendererTurbo(this, 172, 8, textureX, textureY); // Box 193 sp sd7 horn
		bodyModel[252] = new ModelRendererTurbo(this, 172, 2, textureX, textureY); // Box 194 sp sd7 horn
		bodyModel[253] = new ModelRendererTurbo(this, 172, 5, textureX, textureY); // Box 195 sp sd7 horn
		bodyModel[254] = new ModelRendererTurbo(this, 18, 167, textureX, textureY); // Box 50 footboard
		bodyModel[255] = new ModelRendererTurbo(this, 94, 167, textureX, textureY); // Box 324 footboard
		bodyModel[256] = new ModelRendererTurbo(this, 64, 155, textureX, textureY, "cull"); // Box 325 cull sd7 mu cord cutout box
		bodyModel[257] = new ModelRendererTurbo(this, 6, 155, textureX, textureY, "cull"); // Box 326 cull sd7 mu cord cutout box
		bodyModel[258] = new ModelRendererTurbo(this, 140, 155, textureX, textureY, "cull"); // Box 327 cull sd7 mu cord cutout box
		bodyModel[259] = new ModelRendererTurbo(this, 82, 155, textureX, textureY, "cull"); // Box 328 cull sd7 mu cord cutout box
		bodyModel[260] = new ModelRendererTurbo(this, 140, 244, textureX, textureY, "cull"); // Box 331 cull stepbox DONT TEXTURE SIDES
		bodyModel[261] = new ModelRendererTurbo(this, 154, 244, textureX, textureY, "cull"); // Box 332 cull stepbox DONT TEXTURE SIDES
		bodyModel[262] = new ModelRendererTurbo(this, 61, 90, textureX, textureY); // Box 333 up mysterybox
		bodyModel[263] = new ModelRendererTurbo(this, 194, 92, textureX, textureY); // Box 334 experamental hd sill vents
		bodyModel[264] = new ModelRendererTurbo(this, 150, 48, textureX, textureY, "lamp"); // Box 310 sd7 markerlight
		bodyModel[265] = new ModelRendererTurbo(this, 150, 48, textureX, textureY, "lamp"); // Box 311 sd7 markerlight
		bodyModel[266] = new ModelRendererTurbo(this, 461, 42, textureX, textureY, "lamp"); // Box 312 sd7 markerlight
		bodyModel[267] = new ModelRendererTurbo(this, 461, 42, textureX, textureY, "lamp"); // Box 313 sd7 markerlight
		bodyModel[268] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 314 steam gen exhaust TALL
		bodyModel[269] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 315 NN gyra box
		bodyModel[270] = new ModelRendererTurbo(this, 133, 43, textureX, textureY, "lamp"); // Box 316 NN gyra
		bodyModel[271] = new ModelRendererTurbo(this, 337, 6, textureX, textureY, "cull"); // Box 317 cull arrestor
		bodyModel[272] = new ModelRendererTurbo(this, 337, 6, textureX, textureY, "cull"); // Box 318 cull arrestor
		bodyModel[273] = new ModelRendererTurbo(this, 17, 134, textureX, textureY, "cull"); // Box 160 cull crossover
		bodyModel[274] = new ModelRendererTurbo(this, 17, 128, textureX, textureY, "cull"); // Box 161 cull crossover
		bodyModel[275] = new ModelRendererTurbo(this, 93, 134, textureX, textureY, "cull"); // Box 321 cull crossover
		bodyModel[276] = new ModelRendererTurbo(this, 93, 128, textureX, textureY, "cull"); // Box 322 cull crossover
		bodyModel[277] = new ModelRendererTurbo(this, 51, 144, textureX, textureY); // Box 323
		bodyModel[278] = new ModelRendererTurbo(this, 27, 144, textureX, textureY); // Box 324
		bodyModel[279] = new ModelRendererTurbo(this, 127, 144, textureX, textureY); // Box 325
		bodyModel[280] = new ModelRendererTurbo(this, 103, 144, textureX, textureY); // Box 326
		bodyModel[281] = new ModelRendererTurbo(this, 393, 68, textureX, textureY); // Box 327 up/cnw winterization stick
		bodyModel[282] = new ModelRendererTurbo(this, 393, 77, textureX, textureY); // Box 328 up/cnw winterization stick
		bodyModel[283] = new ModelRendererTurbo(this, 8, 16, textureX, textureY); // Box 123
		bodyModel[284] = new ModelRendererTurbo(this, 8, 19, textureX, textureY); // Box 311
		bodyModel[285] = new ModelRendererTurbo(this, 192, 34, textureX, textureY); // Box 374
		bodyModel[286] = new ModelRendererTurbo(this, 180, 29, textureX, textureY); // Box 409 commander base
		bodyModel[287] = new ModelRendererTurbo(this, 180, 25, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[288] = new ModelRendererTurbo(this, 180, 32, textureX, textureY, "cull"); // Box 334 cull drgw sd7 beacon holder
		bodyModel[289] = new ModelRendererTurbo(this, 350, 165, textureX, textureY, "cull"); // Box 335 cull rerailer
		bodyModel[290] = new ModelRendererTurbo(this, 350, 171, textureX, textureY, "cull"); // Box 336 cull rerailer
		bodyModel[291] = new ModelRendererTurbo(this, 343, 165, textureX, textureY); // Box 337 rerailer holder
		bodyModel[292] = new ModelRendererTurbo(this, 343, 171, textureX, textureY); // Box 339
		bodyModel[293] = new ModelRendererTurbo(this, 162, 30, textureX, textureY, "cull"); // Box 418 cull platform PNWR
		bodyModel[294] = new ModelRendererTurbo(this, 167, 28, textureX, textureY); // Box 308
		bodyModel[295] = new ModelRendererTurbo(this, 244, 5, textureX, textureY); // Box 418
		bodyModel[296] = new ModelRendererTurbo(this, 235, 2, textureX, textureY); // Box 419
		bodyModel[297] = new ModelRendererTurbo(this, 233, 5, textureX, textureY); // Box 420
		bodyModel[298] = new ModelRendererTurbo(this, 235, 8, textureX, textureY); // Box 421
		bodyModel[299] = new ModelRendererTurbo(this, 274, 10, textureX, textureY); // Box 346 round stacc
		bodyModel[300] = new ModelRendererTurbo(this, 274, 10, textureX, textureY); // Box 347 rounde stacc
		bodyModel[301] = new ModelRendererTurbo(this, 270, 2, textureX, textureY); // Box 348 cylinder arrestor
		bodyModel[302] = new ModelRendererTurbo(this, 270, 2, textureX, textureY); // Box 349 cylinder arrestor
		bodyModel[303] = new ModelRendererTurbo(this, 450, 59, textureX, textureY); // Box 350 regular lightkit
		bodyModel[304] = new ModelRendererTurbo(this, 457, 59, textureX, textureY, "lamp"); // Box 351 headlight rear 1
		bodyModel[305] = new ModelRendererTurbo(this, 457, 59, textureX, textureY, "lamp"); // Box 352 headlight rear 2
		bodyModel[306] = new ModelRendererTurbo(this, 473, 51, textureX, textureY); // Box 353 els housing i think idr lol
		bodyModel[307] = new ModelRendererTurbo(this, 164, 8, textureX, textureY); // Box 403
		bodyModel[308] = new ModelRendererTurbo(this, 164, 8, textureX, textureY); // Box 404
		bodyModel[309] = new ModelRendererTurbo(this, 162, 1, textureX, textureY, "cull"); // Box 407 bell holder cull
		bodyModel[310] = new ModelRendererTurbo(this, 450, 51, textureX, textureY); // Box 360 up/cs gyra housing rear
		bodyModel[311] = new ModelRendererTurbo(this, 466, 51, textureX, textureY, "lamp"); // Box 363 gyra rear 4/els rear gyra
		bodyModel[312] = new ModelRendererTurbo(this, 459, 51, textureX, textureY, "lamp"); // Box 364 gyra rear 3
		bodyModel[313] = new ModelRendererTurbo(this, 473, 56, textureX, textureY); // Box 365 up gyra holdy
		bodyModel[314] = new ModelRendererTurbo(this, 45, 167, textureX, textureY, "cull"); // Box 456 cull mu receptical
		bodyModel[315] = new ModelRendererTurbo(this, 19, 167, textureX, textureY, "cull"); // Box 456 cull mu receptical
		bodyModel[316] = new ModelRendererTurbo(this, 13, 167, textureX, textureY, "cull"); // Box 447 cull
		bodyModel[317] = new ModelRendererTurbo(this, 95, 167, textureX, textureY, "cull"); // Box 476 cull mu receptical
		bodyModel[318] = new ModelRendererTurbo(this, 121, 167, textureX, textureY, "cull"); // Box 476 cull mu receptical
		bodyModel[319] = new ModelRendererTurbo(this, 89, 167, textureX, textureY, "cull"); // Box 479 cull
		bodyModel[320] = new ModelRendererTurbo(this, 200, 15, textureX, textureY); // Box 369
		bodyModel[321] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 370
		bodyModel[322] = new ModelRendererTurbo(this, 189, 15, textureX, textureY); // Box 371
		bodyModel[323] = new ModelRendererTurbo(this, 191, 18, textureX, textureY); // Box 372
		bodyModel[324] = new ModelRendererTurbo(this, 213, 3, textureX, textureY, "cull"); // Box 373 bell holder cull
		bodyModel[325] = new ModelRendererTurbo(this, 215, 8, textureX, textureY); // Box 374
		bodyModel[326] = new ModelRendererTurbo(this, 215, 8, textureX, textureY); // Box 375
		bodyModel[327] = new ModelRendererTurbo(this, 300, 12, textureX, textureY); // Box 377gn sd7 stacc
		bodyModel[328] = new ModelRendererTurbo(this, 313, 12, textureX, textureY); // Box 378 gn sd7 stacc
		bodyModel[329] = new ModelRendererTurbo(this, 186, 29, textureX, textureY); // Box 364 prime base
		bodyModel[330] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[331] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[332] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[333] = new ModelRendererTurbo(this, 186, 25, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[334] = new ModelRendererTurbo(this, 187, 2, textureX, textureY); // Box 570
		bodyModel[335] = new ModelRendererTurbo(this, 187, 8, textureX, textureY); // Box 567
		bodyModel[336] = new ModelRendererTurbo(this, 196, 5, textureX, textureY); // Box 895
		bodyModel[337] = new ModelRendererTurbo(this, 187, 5, textureX, textureY); // Box 894
		bodyModel[338] = new ModelRendererTurbo(this, 250, 6, textureX, textureY); // Box 388 up moment
		bodyModel[339] = new ModelRendererTurbo(this, 255, 3, textureX, textureY); // Box 389 up momen
		bodyModel[340] = new ModelRendererTurbo(this, 255, 6, textureX, textureY); // Box 390 up momen
		bodyModel[341] = new ModelRendererTurbo(this, 255, 9, textureX, textureY); // Box 391 up momen
		bodyModel[342] = new ModelRendererTurbo(this, 183, 34, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[343] = new ModelRendererTurbo(this, 183, 34, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[344] = new ModelRendererTurbo(this, 183, 34, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[345] = new ModelRendererTurbo(this, 183, 34, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[346] = new ModelRendererTurbo(this, 183, 38, textureX, textureY); // Box 428 prime base
		bodyModel[347] = new ModelRendererTurbo(this, 95, 38, textureX, textureY); // Box 74
		bodyModel[348] = new ModelRendererTurbo(this, 73, 38, textureX, textureY, "lamp"); // Box 186 headlight f chop 1
		bodyModel[349] = new ModelRendererTurbo(this, 80, 38, textureX, textureY, "lamp"); // Box 187 headlight f chop 2
		bodyModel[350] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 644
		bodyModel[351] = new ModelRendererTurbo(this, 73, 43, textureX, textureY); // Box 645
		bodyModel[352] = new ModelRendererTurbo(this, 63, 42, textureX, textureY); // Box 646
		bodyModel[353] = new ModelRendererTurbo(this, 51, 43, textureX, textureY); // Box 647
		bodyModel[354] = new ModelRendererTurbo(this, 62, 40, textureX, textureY); // Box 648
		bodyModel[355] = new ModelRendererTurbo(this, 63, 38, textureX, textureY); // Box 649
		bodyModel[356] = new ModelRendererTurbo(this, 104, 38, textureX, textureY, "lamp"); // Box 363 numberboard chop A
		bodyModel[357] = new ModelRendererTurbo(this, 104, 38, textureX, textureY, "lamp"); // Box 364 numberboard chop A
		bodyModel[358] = new ModelRendererTurbo(this, 182, 15, textureX, textureY); // Box 202 nn moment
		bodyModel[359] = new ModelRendererTurbo(this, 176, 55, textureX, textureY); // Box 409
		bodyModel[360] = new ModelRendererTurbo(this, 124, 67, textureX, textureY); // Box 410
		bodyModel[361] = new ModelRendererTurbo(this, 110, 69, textureX, textureY, "lamp"); // Box 411 headlight front chop
		bodyModel[362] = new ModelRendererTurbo(this, 117, 69, textureX, textureY, "lamp"); // Box 412 headlight front chop
		bodyModel[363] = new ModelRendererTurbo(this, 139, 8, textureX, textureY); // Box 352
		bodyModel[364] = new ModelRendererTurbo(this, 139, 11, textureX, textureY); // Box 353
		bodyModel[365] = new ModelRendererTurbo(this, 139, 8, textureX, textureY); // Box 354
		bodyModel[366] = new ModelRendererTurbo(this, 128, 2, textureX, textureY, "cull"); // Box 332 bell mount cull
		bodyModel[367] = new ModelRendererTurbo(this, 19, 123, textureX, textureY); // Box 354 NN bELL
		bodyModel[368] = new ModelRendererTurbo(this, 203, 2, textureX, textureY); // Box 419
		bodyModel[369] = new ModelRendererTurbo(this, 198, 2, textureX, textureY); // Box 420
		bodyModel[370] = new ModelRendererTurbo(this, 378, 56, textureX, textureY, "cull"); // Box cull handbrake enclousure
		bodyModel[371] = new ModelRendererTurbo(this, 385, 56, textureX, textureY); // Box 43
		bodyModel[372] = new ModelRendererTurbo(this, 390, 56, textureX, textureY); // Box 43
		bodyModel[373] = new ModelRendererTurbo(this, 225, 12, textureX, textureY); // Box 425
		bodyModel[374] = new ModelRendererTurbo(this, 225, 15, textureX, textureY); // Box 426
		bodyModel[375] = new ModelRendererTurbo(this, 225, 18, textureX, textureY); // Box 427
		bodyModel[376] = new ModelRendererTurbo(this, 234, 15, textureX, textureY); // Box 428
		bodyModel[377] = new ModelRendererTurbo(this, 1, 210, textureX, textureY); // Box 282
		bodyModel[378] = new ModelRendererTurbo(this, 14, 214, textureX, textureY); // Box 283
		bodyModel[379] = new ModelRendererTurbo(this, 1, 198, textureX, textureY); // Box 4
		bodyModel[380] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 448
		bodyModel[381] = new ModelRendererTurbo(this, 14, 202, textureX, textureY); // Box 322
		bodyModel[382] = new ModelRendererTurbo(this, 16, 191, textureX, textureY); // Box 323
		bodyModel[383] = new ModelRendererTurbo(this, 3, 223, textureX, textureY); // Box 280
		bodyModel[384] = new ModelRendererTurbo(this, 16, 227, textureX, textureY); // Box 285
		bodyModel[385] = new ModelRendererTurbo(this, 3, 177, textureX, textureY); // Box 280
		bodyModel[386] = new ModelRendererTurbo(this, 16, 181, textureX, textureY); // Box 285
		bodyModel[387] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 525
		bodyModel[388] = new ModelRendererTurbo(this, 14, 237, textureX, textureY); // Box 526
		bodyModel[389] = new ModelRendererTurbo(this, 90, 214, textureX, textureY); // Box 509
		bodyModel[390] = new ModelRendererTurbo(this, 77, 210, textureX, textureY); // Box 510
		bodyModel[391] = new ModelRendererTurbo(this, 77, 233, textureX, textureY); // Box 515
		bodyModel[392] = new ModelRendererTurbo(this, 90, 237, textureX, textureY); // Box 516
		bodyModel[393] = new ModelRendererTurbo(this, 90, 202, textureX, textureY); // Box 517
		bodyModel[394] = new ModelRendererTurbo(this, 77, 198, textureX, textureY); // Box 518
		bodyModel[395] = new ModelRendererTurbo(this, 92, 191, textureX, textureY); // Box 519
		bodyModel[396] = new ModelRendererTurbo(this, 79, 187, textureX, textureY); // Box 520
		bodyModel[397] = new ModelRendererTurbo(this, 79, 223, textureX, textureY); // Box 521
		bodyModel[398] = new ModelRendererTurbo(this, 92, 227, textureX, textureY); // Box 522
		bodyModel[399] = new ModelRendererTurbo(this, 92, 181, textureX, textureY); // Box 523
		bodyModel[400] = new ModelRendererTurbo(this, 79, 177, textureX, textureY); // Box 524
		bodyModel[401] = new ModelRendererTurbo(this, 174, 27, textureX, textureY); // Box 409 commander base
		bodyModel[402] = new ModelRendererTurbo(this, 174, 23, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[403] = new ModelRendererTurbo(this, 241, 15, textureX, textureY); // Box 455
		bodyModel[404] = new ModelRendererTurbo(this, 250, 15, textureX, textureY); // Box 456
		bodyModel[405] = new ModelRendererTurbo(this, 241, 12, textureX, textureY); // Box 457
		bodyModel[406] = new ModelRendererTurbo(this, 241, 18, textureX, textureY); // Box 458
		bodyModel[407] = new ModelRendererTurbo(this, 140, 24, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[408] = new ModelRendererTurbo(this, 140, 24, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[409] = new ModelRendererTurbo(this, 140, 24, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[410] = new ModelRendererTurbo(this, 140, 24, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[411] = new ModelRendererTurbo(this, 140, 28, textureX, textureY); // Box 428 prime base
		bodyModel[412] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 464 bell holder c ull sou
		bodyModel[413] = new ModelRendererTurbo(this, 129, 7, textureX, textureY); // Box 465 bell holder sou bit
		bodyModel[414] = new ModelRendererTurbo(this, 154, 56, textureX, textureY, "lamp"); // Box 71 markerlight twO
		bodyModel[415] = new ModelRendererTurbo(this, 154, 56, textureX, textureY, "lamp"); // Box 1208 makrerlight twO
		bodyModel[416] = new ModelRendererTurbo(this, 196, 36, textureX, textureY); // Box 308
		bodyModel[417] = new ModelRendererTurbo(this, 53, 183, textureX, textureY); // Box 78
		bodyModel[418] = new ModelRendererTurbo(this, 53, 183, textureX, textureY); // Box 188
		bodyModel[419] = new ModelRendererTurbo(this, 53, 178, textureX, textureY, BoxName.ditch); // Box 189 ditchlight front
		bodyModel[420] = new ModelRendererTurbo(this, 53, 178, textureX, textureY, BoxName.ditch); // Box 190 ditchlight front
		bodyModel[421] = new ModelRendererTurbo(this, 129, 183, textureX, textureY); // Box 78
		bodyModel[422] = new ModelRendererTurbo(this, 129, 183, textureX, textureY); // Box 188
		bodyModel[423] = new ModelRendererTurbo(this, 129, 178, textureX, textureY, BoxName.ditch); // Box 189 ditchlight r
		bodyModel[424] = new ModelRendererTurbo(this, 129, 178, textureX, textureY, BoxName.ditch); // Box 190 ditchlight r
		bodyModel[425] = new ModelRendererTurbo(this, 46, 183, textureX, textureY); // Box 252
		bodyModel[426] = new ModelRendererTurbo(this, 46, 178, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f2
		bodyModel[427] = new ModelRendererTurbo(this, 46, 178, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f2
		bodyModel[428] = new ModelRendererTurbo(this, 46, 183, textureX, textureY); // Box 447
		bodyModel[429] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 252
		bodyModel[430] = new ModelRendererTurbo(this, 122, 178, textureX, textureY, BoxName.ditch); // Box 190 ditchlight r2
		bodyModel[431] = new ModelRendererTurbo(this, 122, 178, textureX, textureY, BoxName.ditch); // Box 446 ditchlight r2
		bodyModel[432] = new ModelRendererTurbo(this, 122, 183, textureX, textureY); // Box 447
		bodyModel[433] = new ModelRendererTurbo(this, 218, 186, textureX, textureY); // Box 485 eje mystery box
		bodyModel[434] = new ModelRendererTurbo(this, 167, 15, textureX, textureY); // Box 486
		bodyModel[435] = new ModelRendererTurbo(this, 167, 12, textureX, textureY); // Box 487
		bodyModel[436] = new ModelRendererTurbo(this, 167, 18, textureX, textureY); // Box 488
		bodyModel[437] = new ModelRendererTurbo(this, 176, 15, textureX, textureY); // Box 489
		bodyModel[438] = new ModelRendererTurbo(this, 157, 5, textureX, textureY); // Box 490
		bodyModel[439] = new ModelRendererTurbo(this, 148, 8, textureX, textureY); // Box 491
		bodyModel[440] = new ModelRendererTurbo(this, 148, 5, textureX, textureY); // Box 492
		bodyModel[441] = new ModelRendererTurbo(this, 148, 2, textureX, textureY); // Box 493
		bodyModel[442] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 494 anotha mysterybox & eje shid
		bodyModel[443] = new ModelRendererTurbo(this, 415, 11, textureX, textureY); // Box 239
		bodyModel[444] = new ModelRendererTurbo(this, 415, 8, textureX, textureY); // Box 240
		bodyModel[445] = new ModelRendererTurbo(this, 410, 11, textureX, textureY); // Box 241
		bodyModel[446] = new ModelRendererTurbo(this, 222, 3, textureX, textureY, "cull"); // Box 498 bell holder cull
		bodyModel[447] = new ModelRendererTurbo(this, 224, 8, textureX, textureY); // Box 499
		bodyModel[448] = new ModelRendererTurbo(this, 224, 8, textureX, textureY); // Box 500
		bodyModel[449] = new ModelRendererTurbo(this, 64, 79, textureX, textureY); // Box 38R
		bodyModel[450] = new ModelRendererTurbo(this, 64, 102, textureX, textureY); // Box 176
		bodyModel[451] = new ModelRendererTurbo(this, 51, 102, textureX, textureY); // Box 500
		bodyModel[452] = new ModelRendererTurbo(this, 51, 79, textureX, textureY); // Box 503
		bodyModel[453] = new ModelRendererTurbo(this, 32, 102, textureX, textureY); // Box 132
		bodyModel[454] = new ModelRendererTurbo(this, 32, 79, textureX, textureY); // Box 136
		bodyModel[455] = new ModelRendererTurbo(this, 59, 88, textureX, textureY); // Box 273
		bodyModel[456] = new ModelRendererTurbo(this, 59, 111, textureX, textureY); // Box 276
		bodyModel[457] = new ModelRendererTurbo(this, 26, 77, textureX, textureY); // Box 318
		bodyModel[458] = new ModelRendererTurbo(this, 26, 100, textureX, textureY); // Box 322
		bodyModel[459] = new ModelRendererTurbo(this, 164, 103, textureX, textureY); // Box 326
		bodyModel[460] = new ModelRendererTurbo(this, 157, 99, textureX, textureY); // Box 327
		bodyModel[461] = new ModelRendererTurbo(this, 164, 100, textureX, textureY); // Box 328
		bodyModel[462] = new ModelRendererTurbo(this, 157, 76, textureX, textureY); // Box 522
		bodyModel[463] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 523
		bodyModel[464] = new ModelRendererTurbo(this, 164, 77, textureX, textureY); // Box 524
		bodyModel[465] = new ModelRendererTurbo(this, 24, 99, textureX, textureY); // Box 525
		bodyModel[466] = new ModelRendererTurbo(this, 21, 101, textureX, textureY); // Box 526
		bodyModel[467] = new ModelRendererTurbo(this, 21, 98, textureX, textureY); // Box 527
		bodyModel[468] = new ModelRendererTurbo(this, 21, 78, textureX, textureY); // Box 528
		bodyModel[469] = new ModelRendererTurbo(this, 24, 76, textureX, textureY); // Box 529
		bodyModel[470] = new ModelRendererTurbo(this, 21, 75, textureX, textureY); // Box 530
		bodyModel[471] = new ModelRendererTurbo(this, 1, 105, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[472] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 5 aww
		bodyModel[473] = new ModelRendererTurbo(this, 1, 81, textureX, textureY, "cull"); // Box 533 cull aww
		bodyModel[474] = new ModelRendererTurbo(this, 3, 76, textureX, textureY); // Box 534 aww
		bodyModel[475] = new ModelRendererTurbo(this, 215, 167, textureX, textureY); // Box 527 why dont you filter some bitches instead
		bodyModel[476] = new ModelRendererTurbo(this, 207, 15, textureX, textureY); // Box 536
		bodyModel[477] = new ModelRendererTurbo(this, 218, 15, textureX, textureY); // Box 537
		bodyModel[478] = new ModelRendererTurbo(this, 209, 18, textureX, textureY); // Box 538
		bodyModel[479] = new ModelRendererTurbo(this, 209, 12, textureX, textureY); // Box 539
		bodyModel[480] = new ModelRendererTurbo(this, 196, 34, textureX, textureY); // Box 540
		bodyModel[481] = new ModelRendererTurbo(this, 139, 32, textureX, textureY, "cull"); // Box 529 cull
		bodyModel[482] = new ModelRendererTurbo(this, 208, 25, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[483] = new ModelRendererTurbo(this, 208, 25, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[484] = new ModelRendererTurbo(this, 208, 25, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[485] = new ModelRendererTurbo(this, 208, 25, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[486] = new ModelRendererTurbo(this, 208, 29, textureX, textureY); // Box 428 prime base
		bodyModel[487] = new ModelRendererTurbo(this, 207, 33, textureX, textureY, "cull"); // Box 529 cull
		bodyModel[488] = new ModelRendererTurbo(this, 201, 29, textureX, textureY); // Box 409 commander base
		bodyModel[489] = new ModelRendererTurbo(this, 201, 25, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[490] = new ModelRendererTurbo(this, 160, 146, textureX, textureY); // Box 412 cs
		bodyModel[491] = new ModelRendererTurbo(this, 175, 153, textureX, textureY); // Box 413 cs
		bodyModel[492] = new ModelRendererTurbo(this, 171, 146, textureX, textureY); // Box 86 cs
		bodyModel[493] = new ModelRendererTurbo(this, 176, 161, textureX, textureY); // Box 531 cs
		bodyModel[494] = new ModelRendererTurbo(this, 195, 150, textureX, textureY); // Box 542 cs2
		bodyModel[495] = new ModelRendererTurbo(this, 159, 164, textureX, textureY); // Box 131 cs2
		bodyModel[496] = new ModelRendererTurbo(this, 161, 159, textureX, textureY); // Box 131 cs2
		bodyModel[497] = new ModelRendererTurbo(this, 149, 147, textureX, textureY, "lamp"); // Box 591 speedo glow
		bodyModel[498] = new ModelRendererTurbo(this, 142, 241, textureX, textureY, "cull"); // Box 344 cull stepbox DONT TEXTURE SIDES
		bodyModel[499] = new ModelRendererTurbo(this, 156, 241, textureX, textureY, "cull"); // Box 535 cull stepbox DONT TEXTURE SIDES

		bodyModel[0].addBox(0F, 0F, 0F, 78, 3, 22, 0F); // Box 1
		bodyModel[0].setRotationPoint(-39F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[1].setRotationPoint(-47F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-44F, 2.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[3].setRotationPoint(44F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[4].setRotationPoint(43F, 2.5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -4F, 0F, -0.05F); // Box 4
		bodyModel[5].setRotationPoint(38F, 3F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[6].setRotationPoint(-6.5F, 4F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F,-0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 280
		bodyModel[7].setRotationPoint(1.5F, 4F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 18, 0F,-0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 287
		bodyModel[8].setRotationPoint(1.5F, 7F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 18, 0F,0F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[9].setRotationPoint(-6.5F, 7F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 293
		bodyModel[10].setRotationPoint(-9.5F, 4F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 294
		bodyModel[11].setRotationPoint(-9.5F, 7F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 3
		bodyModel[12].setRotationPoint(-43.01F, -8F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[13].setRotationPoint(-43F, 0F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -4F, 0F, -0.05F, -4F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 4
		bodyModel[14].setRotationPoint(-43F, 3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[15].setRotationPoint(-43.01F, 8F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[16].setRotationPoint(-43.01F, 8F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 335
		bodyModel[17].setRotationPoint(-44F, 0F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[18].setRotationPoint(-44F, -0.01F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[19].setRotationPoint(-43.01F, -8F, -10F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 444
		bodyModel[20].setRotationPoint(-44F, -0.01F, 3F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[21].setRotationPoint(-44F, -8F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[22].setRotationPoint(-43F, -8F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[23].setRotationPoint(-43F, -8F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[24].setRotationPoint(-43.01F, -8F, 11F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 311 mu plug
		bodyModel[25].setRotationPoint(-43.25F, 0F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 312 mu plog
		bodyModel[26].setRotationPoint(-43.25F, 0F, 3F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 12, 14, 0F); // Box 215
		bodyModel[27].setRotationPoint(-38F, -12F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[28].setRotationPoint(-41F, -12F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 217
		bodyModel[29].setRotationPoint(-41F, -12F, 1F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 12, 2, 0F); // Box 218
		bodyModel[30].setRotationPoint(-41F, -12F, -1F);

		bodyModel[31].addBox(0F, 0F, 0F, 9, 7, 14, 0F); // Box 350
		bodyModel[31].setRotationPoint(-38F, -19F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[32].setRotationPoint(-41F, -19F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 352
		bodyModel[33].setRotationPoint(-41F, -19F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 353
		bodyModel[34].setRotationPoint(-41F, -19F, 1F);

		bodyModel[35].addBox(0F, 0F, -0.25F, 1, 2, 5, 0F); // Box 117 numberboard front high
		bodyModel[35].setRotationPoint(-38.55F, -16F, -6F);
		bodyModel[35].rotateAngleY = 0.46687557F;

		bodyModel[36].addBox(0F, 0F, -4.75F, 1, 2, 5, 0F); // Box 118 numberboard front high
		bodyModel[36].setRotationPoint(-38.55F, -16F, 6F);
		bodyModel[36].rotateAngleY = -0.46687557F;

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 216 regular lightkit
		bodyModel[37].setRotationPoint(-41.5F, -18F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 215 headlight front 1
		bodyModel[38].setRotationPoint(-42.25F, -18F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 217 headlight front 2
		bodyModel[39].setRotationPoint(-42.25F, -16F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 190
		bodyModel[40].setRotationPoint(-39F, -19.5F, -1F);

		bodyModel[41].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 9
		bodyModel[41].setRotationPoint(-28F, -16F, 10F);

		bodyModel[42].addBox(0F, 0F, 0F, 11, 12, 1, 0F); // Box 10
		bodyModel[42].setRotationPoint(-28F, -16F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 15
		bodyModel[43].setRotationPoint(-29F, -16F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 12, 18, 0F); // Box 21
		bodyModel[44].setRotationPoint(-17F, -16F, -11F);

		bodyModel[45].addBox(-0.5F, 0F, -3.5F, 1, 12, 4, 0F); // Box 314 door swing right
		bodyModel[45].setRotationPoint(-16.5F, -16F, 10.5F);

		bodyModel[46].addBox(-0.5F, 0F, -0.5F, 1, 12, 4, 0F); // Box 315 door swing right
		bodyModel[46].setRotationPoint(-28.5F, -16F, -10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[47].setRotationPoint(-29F, -19F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[48].setRotationPoint(-17F, -19F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[49].setRotationPoint(-29F, -19F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[50].setRotationPoint(-17F, -19F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[51].setRotationPoint(-29F, -20F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[52].setRotationPoint(38F, -13F, -7F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 18, 2, 0F); // Box 220
		bodyModel[53].setRotationPoint(38F, -18F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[54].setRotationPoint(38F, -13F, 1F);

		bodyModel[55].addBox(0F, 0F, 0F, 54, 19, 14, 0F); // Box 223 the hooh
		bodyModel[55].setRotationPoint(-16F, -19F, -7F);

		bodyModel[56].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 91
		bodyModel[56].setRotationPoint(0.5F, -20F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[57].setRotationPoint(0.5F, -18F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // Box 105
		bodyModel[58].setRotationPoint(-3.5F, -18F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 172
		bodyModel[59].setRotationPoint(12.5F, -18F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[60].setRotationPoint(0.5F, -20F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F); // Box 176
		bodyModel[61].setRotationPoint(-3.5F, -20F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F); // Box 177
		bodyModel[62].setRotationPoint(12.5F, -20F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 178
		bodyModel[63].setRotationPoint(0.5F, -20F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 179
		bodyModel[64].setRotationPoint(12.5F, -20F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[65].setRotationPoint(12.5F, -18F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[66].setRotationPoint(0.5F, -18F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 182
		bodyModel[67].setRotationPoint(-3.5F, -18F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 183
		bodyModel[68].setRotationPoint(-3.5F, -20F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[69].setRotationPoint(17F, -18F, -8F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 324
		bodyModel[70].setRotationPoint(17F, -19.75F, -2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.75F, -0.25F, 0.375F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[71].setRotationPoint(17F, -19F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -1F, -2F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.25F, -0.25F, -1.625F, -0.25F, -0.25F, 1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 323
		bodyModel[72].setRotationPoint(38F, -19F, -8F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 184 stacc
		bodyModel[73].setRotationPoint(-2F, -21F, -1.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 185 stacc
		bodyModel[74].setRotationPoint(13F, -21F, -1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, -8F, -0.5F, -0.75F, -8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 443 hd funky dynamic radiator
		bodyModel[75].setRotationPoint(0.5F, -18.5F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 443 hd funky dynamic radiator
		bodyModel[76].setRotationPoint(0.5F, -18.5F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 191
		bodyModel[77].setRotationPoint(38.35F, -19.5F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[78].setRotationPoint(12.5F, -20F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[79].setRotationPoint(12.5F, -20F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[80].setRotationPoint(-3.5F, -20F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[81].setRotationPoint(-3.5F, -20F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 282
		bodyModel[82].setRotationPoint(22.25F, -19.75F, -2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 283
		bodyModel[83].setRotationPoint(27.5F, -19.75F, -2.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 284
		bodyModel[84].setRotationPoint(32.75F, -19.75F, -2.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 287
		bodyModel[85].setRotationPoint(17F, -18F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 2F, 0F, 0F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 2F, 0F, 0F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 288
		bodyModel[86].setRotationPoint(38F, -18F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.375F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 289
		bodyModel[87].setRotationPoint(17F, -19F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1.625F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F); // Box 290
		bodyModel[88].setRotationPoint(38F, -19F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19.5F, 0F, 0F, -19.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -19.5F, -4F, 0F, -19.5F, -4F, 0F, 0F, -4F, 0F); // Box 293 rear side radiator cull
		bodyModel[89].setRotationPoint(19F, -17.5F, -7.87F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19.5F, 0F, 0F, -19.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -19.5F, -4F, 0F, -19.5F, -4F, 0F, 0F, -4F, 0F); // Box 294 rear side radiator cull
		bodyModel[90].setRotationPoint(19F, -17.5F, 6.87F);

		bodyModel[91].addBox(0F, 0F, -0.25F, 1, 2, 5, 0F); // Box 295 numberboard rear
		bodyModel[91].setRotationPoint(38.05F, -15.5F, -6F);
		bodyModel[91].rotateAngleY = -0.37960911F;

		bodyModel[92].addBox(0F, 0F, -4.75F, 1, 2, 5, 0F); // Box 296 numberboard rear
		bodyModel[92].setRotationPoint(38.05F, -15.5F, 6F);
		bodyModel[92].rotateAngleY = 0.37960911F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, -0.625F, 0F, -0.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.625F, 0F, -0.25F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[93].setRotationPoint(38F, -18F, -8F);

		bodyModel[94].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 304
		bodyModel[94].setRotationPoint(1F, -20.25F, -2.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 305
		bodyModel[95].setRotationPoint(7F, -20.25F, -2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 42, 1, 28, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -14F, 0F, 0F, -14F); // Box cull integrated pipes
		bodyModel[96].setRotationPoint(17.5F, -19.25F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F); // Box 322 sd9 markerlight
		bodyModel[97].setRotationPoint(38.75F, -17.25F, 5.51F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F); // Box 324 sd9 markerlight
		bodyModel[98].setRotationPoint(38.75F, -17.25F, -6.51F);

		bodyModel[99].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 344 cab floor
		bodyModel[99].setRotationPoint(-29F, -4F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 345
		bodyModel[100].setRotationPoint(-35F, -4F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 346
		bodyModel[101].setRotationPoint(-35F, -4F, 7F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 362
		bodyModel[102].setRotationPoint(-16F, -4F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 363
		bodyModel[103].setRotationPoint(-16F, -4F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.375F, -0.25F, -0.25F, -1.625F, -0.25F, -0.25F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1F, -1.625F, -0.5F, -0.25F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 286
		bodyModel[104].setRotationPoint(38F, -18.5F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, -1.625F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1.625F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 291
		bodyModel[105].setRotationPoint(38F, -18.5F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[106].setRotationPoint(38F, -19F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 268
		bodyModel[107].setRotationPoint(38F, -19F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 17, 22, 0F); // Box 3
		bodyModel[108].setRotationPoint(43.01F, -8F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[109].setRotationPoint(43.01F, 8F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 331
		bodyModel[110].setRotationPoint(43.01F, 8F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 251
		bodyModel[111].setRotationPoint(44F, -8F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[112].setRotationPoint(43F, -8F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 254
		bodyModel[113].setRotationPoint(43F, -8F, -5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 256
		bodyModel[114].setRotationPoint(43F, 0F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[115].setRotationPoint(43F, -0.01F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 258
		bodyModel[116].setRotationPoint(43F, -0.01F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 mu plug
		bodyModel[117].setRotationPoint(42.25F, 0F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 mu plug
		bodyModel[118].setRotationPoint(42.25F, 0F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[119].setRotationPoint(43.01F, -8F, 11F);
		bodyModel[119].rotateAngleY = -3.14159265F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[120].setRotationPoint(43.01F, -8F, -10F);
		bodyModel[120].rotateAngleY = -3.14159265F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 182
		bodyModel[121].setRotationPoint(-8.5F, 3F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[122].setRotationPoint(-8.5F, 5F, -9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[123].setRotationPoint(-8.5F, 8F, -9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 185
		bodyModel[124].setRotationPoint(-8.5F, 6F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull tancc pipes
		bodyModel[125].setRotationPoint(-8.5F, 3F, 8.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull tancc pipes
		bodyModel[126].setRotationPoint(-9.5F, 3F, -9.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 188 cs/up sd7 lightkit
		bodyModel[127].setRotationPoint(-41.5F, -17.5F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 189 headlight front cs/up
		bodyModel[128].setRotationPoint(-42.25F, -17.5F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 190 headlight front cs/up
		bodyModel[129].setRotationPoint(-42.25F, -15.5F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 218 headlight front 1 gyra
		bodyModel[130].setRotationPoint(-43.15F, -19F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 219 sp lightkit
		bodyModel[131].setRotationPoint(-42.5F, -19F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 220 headlight front 2 gyra
		bodyModel[132].setRotationPoint(-43.15F, -17F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 194 sp lightkit
		bodyModel[133].setRotationPoint(-41.5F, -14.5F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 195 headlight front sp
		bodyModel[134].setRotationPoint(-42.25F, -14.5F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 196 headlight front sp
		bodyModel[135].setRotationPoint(-42.25F, -12.5F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 335 extendo stack
		bodyModel[136].setRotationPoint(-2F, -23F, -1.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 336 extendo stack
		bodyModel[137].setRotationPoint(13F, -23F, -1.5F);

		bodyModel[138].addShapeBox(-1F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F); // Box 338 stairwell cull
		bodyModel[138].setRotationPoint(-39F, 3F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 342
		bodyModel[139].setRotationPoint(-39F, 0F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 343
		bodyModel[140].setRotationPoint(-40F, 0F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345 stairs cull
		bodyModel[141].setRotationPoint(-43F, 0F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 349
		bodyModel[142].setRotationPoint(-40F, 0F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[143].setRotationPoint(-39F, 0F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[144].setRotationPoint(-43F, 2F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[145].setRotationPoint(-43F, 3F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 364
		bodyModel[146].setRotationPoint(-43F, 3F, 9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367 stairs cull
		bodyModel[147].setRotationPoint(-43F, 0F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 369
		bodyModel[148].setRotationPoint(-41F, 0F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 370
		bodyModel[149].setRotationPoint(-43F, 3F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
		bodyModel[150].setRotationPoint(40F, 0F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[151].setRotationPoint(39F, 0F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[152].setRotationPoint(39F, 0F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 375
		bodyModel[153].setRotationPoint(38F, 0F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[154].setRotationPoint(39F, 0F, 8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 379
		bodyModel[155].setRotationPoint(38F, 0F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 396
		bodyModel[156].setRotationPoint(40F, 2F, -6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 407 dual fueltank connector pipe
		bodyModel[157].setRotationPoint(1F, 7F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[158].setRotationPoint(1F, 3F, -10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[159].setRotationPoint(8F, 3F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[160].setRotationPoint(-6F, 3F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 411
		bodyModel[161].setRotationPoint(-2F, 2.6F, -11.05F);
		bodyModel[161].rotateAngleX = -0.17453293F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 412
		bodyModel[162].setRotationPoint(4F, 2.6F, -11.05F);
		bodyModel[162].rotateAngleX = -0.17453293F;

		bodyModel[163].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[163].setRotationPoint(4F, 2.6F, 11.05F);
		bodyModel[163].rotateAngleX = 0.17453293F;

		bodyModel[164].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[164].setRotationPoint(-2F, 2.6F, 11.05F);
		bodyModel[164].rotateAngleX = 0.17453293F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 415 cull fueltank vent
		bodyModel[165].setRotationPoint(-9.5F, -6F, 10.25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 416 cull fueltank vent
		bodyModel[166].setRotationPoint(-9.5F, -6F, -11.25F);

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 419 airtank supports
		bodyModel[167].setRotationPoint(-9.5F, 3F, -7F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 163
		bodyModel[168].setRotationPoint(-26.5F, 3F, -2F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[169].setRotationPoint(22.5F, 3F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 300
		bodyModel[170].setRotationPoint(-34.5F, 3F, 2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[171].setRotationPoint(-17.5F, 3F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[172].setRotationPoint(-28.5F, 3F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[173].setRotationPoint(31.5F, 3F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[174].setRotationPoint(20.5F, 3F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 437
		bodyModel[175].setRotationPoint(14.5F, 3F, 2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[176].setRotationPoint(-43F, 3F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 441
		bodyModel[177].setRotationPoint(-43F, 3F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[178].setRotationPoint(-43F, 3F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 448 cull stair cope cube
		bodyModel[179].setRotationPoint(-43F, 5.5F, -7.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 411
		bodyModel[180].setRotationPoint(-29F, -19F, -7F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 465
		bodyModel[181].setRotationPoint(-17F, -19F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 469 sp e gyra FRONT
		bodyModel[182].setRotationPoint(-43.15F, -21F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F); // Box 440 sp e gyra BOX
		bodyModel[183].setRotationPoint(-42.5F, -21F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471 sp e gyra HOLDER /bell holder
		bodyModel[184].setRotationPoint(-41F, -21F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 137
		bodyModel[185].setRotationPoint(-37F, -2F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[186].setRotationPoint(-38F, -4F, -11.01F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 140
		bodyModel[187].setRotationPoint(-37F, -4F, -11.01F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[188].setRotationPoint(-9F, -4F, -11.01F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[189].setRotationPoint(-10F, -4F, -11.01F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 272
		bodyModel[190].setRotationPoint(-10F, -2F, -11F);

		bodyModel[191].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 266
		bodyModel[191].setRotationPoint(-37F, -4F, 11.01F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[192].setRotationPoint(-38F, -4F, 11.01F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 268
		bodyModel[193].setRotationPoint(-37F, -2F, 7F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 269
		bodyModel[194].setRotationPoint(-10F, -2F, 7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[195].setRotationPoint(-10F, -4F, 11.01F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[196].setRotationPoint(-9F, -4F, 11.01F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[197].setRotationPoint(-17.25F, -21.25F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[198].setRotationPoint(-17.25F, -22.25F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 218 headligh trear 1 gyra
		bodyModel[199].setRotationPoint(42.15F, -19F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 219 sp lightkit
		bodyModel[200].setRotationPoint(40.5F, -19F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 220 headlight rear 2 gyra
		bodyModel[201].setRotationPoint(42.15F, -17F, -1F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 194 sp lightkit
		bodyModel[202].setRotationPoint(40.5F, -13F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 195 headlight rear sp
		bodyModel[203].setRotationPoint(41.25F, -13F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 196 headlight rear sp
		bodyModel[204].setRotationPoint(41.25F, -11F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 469 sp e gyra REAR
		bodyModel[205].setRotationPoint(42.15F, -21F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F); // Box 440 sp e gyra BOX
		bodyModel[206].setRotationPoint(40.5F, -21F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 471 sp e gyra HOLDER 
		bodyModel[207].setRotationPoint(39F, -21F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[208].setRotationPoint(-28F, -19F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 284
		bodyModel[209].setRotationPoint(-28F, -19F, 7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[210].setRotationPoint(-28F, -20F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[211].setRotationPoint(-17F, -20F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[212].setRotationPoint(-29F, -20F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 291
		bodyModel[213].setRotationPoint(-28F, -20F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[214].setRotationPoint(-17F, -20F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[215].setRotationPoint(-29F, -20F, 2F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 294 cull ladder front
		bodyModel[216].setRotationPoint(-41F, -13.5F, 2F);
		bodyModel[216].rotateAngleY = -0.4712389F;

		bodyModel[217].addBox(0F, 0F, -4F, 1, 13, 4, 0F); // Box 295 cull ladder front
		bodyModel[217].setRotationPoint(-41F, -13.5F, -2F);
		bodyModel[217].rotateAngleY = 0.4712389F;

		bodyModel[218].addBox(-1F, 0F, 0F, 1, 12, 4, 0F); // Box 296 cull ladders rear
		bodyModel[218].setRotationPoint(41F, -12.5F, 2F);
		bodyModel[218].rotateAngleY = 0.41887902F;

		bodyModel[219].addBox(-1F, 0F, -4F, 1, 12, 4, 0F); // Box 297 cull ladders rear
		bodyModel[219].setRotationPoint(41F, -12.5F, -2F);
		bodyModel[219].rotateAngleY = -0.41887902F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F); // Box 298 marker box
		bodyModel[220].setRotationPoint(38.75F, -17.5F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F); // Box 299 marker box
		bodyModel[221].setRotationPoint(38.75F, -17.5F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F); // Box 300 marker box
		bodyModel[222].setRotationPoint(-39.5F, -18F, 4.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, -0.1F, -0.25F, -0.15F, -0.35F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, -0.15F); // Box 301 sd9 markerlight
		bodyModel[223].setRotationPoint(-39.5F, -17.75F, 4.76F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.25F); // Box 302 marker box
		bodyModel[224].setRotationPoint(-39.5F, -18F, -6.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.15F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, 0.25F, -0.1F, 0.25F, -0.15F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, -0.35F, 0.25F, 0.25F); // Box 303 sd9 markerlight
		bodyModel[225].setRotationPoint(-39.5F, -17.75F, -5.76F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 304 up/cs gyra housing front
		bodyModel[226].setRotationPoint(-42.5F, -21.5F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 305 gyralight front 3
		bodyModel[227].setRotationPoint(-43.15F, -21.5F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 306 gyralight front 4
		bodyModel[228].setRotationPoint(-43.15F, -19.5F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307 up/cbq gyra holder
		bodyModel[229].setRotationPoint(-41F, -21.5F, -1F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 72, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 282 ballast
		bodyModel[230].setRotationPoint(-36F, 3F, -10.7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 72, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 283 ballast
		bodyModel[231].setRotationPoint(-36F, 3F, 6.7F);

		bodyModel[232].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 284
		bodyModel[232].setRotationPoint(-28F, 3F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 285
		bodyModel[233].setRotationPoint(-28F, 3F, 9F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 286
		bodyModel[234].setRotationPoint(21F, 3F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 287
		bodyModel[235].setRotationPoint(21F, 3F, 9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302 sd9e electrical cab umbrella
		bodyModel[236].setRotationPoint(-16F, -20F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303 sd9e electrical cab umbrella
		bodyModel[237].setRotationPoint(-16F, -20F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304 sd9e electrical cab umbrella
		bodyModel[238].setRotationPoint(-16F, -20F, -2F);

		bodyModel[239].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Box 305 winterization hatch cull
		bodyModel[239].setRotationPoint(15.4F, -20.75F, -3.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 4, 12, 0F); // Box 306 sd9e filterbox
		bodyModel[240].setRotationPoint(-7F, -21F, -4.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234  steam gen exhaust
		bodyModel[241].setRotationPoint(-37F, -20F, -5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308 steam gen air intake
		bodyModel[242].setRotationPoint(-32F, -20F, -4.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204 sp trashcan part
		bodyModel[243].setRotationPoint(-43F, -23F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205 sp trashcan part
		bodyModel[244].setRotationPoint(-43F, -22F, 1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206 sp trashcan part
		bodyModel[245].setRotationPoint(-43F, -22F, -2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[246].setRotationPoint(-42.5F, -19.75F, -1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 208 sp trashcan light front
		bodyModel[247].setRotationPoint(-43.1F, -22.25F, -1.25F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 404 cull sp wagon wheel antenna support (yes its supposed to be offcenter, see https://www.railpictures.net/photo/283932/)
		bodyModel[248].setRotationPoint(-32F, -20.5F, -4.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 8, 0, 8, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 405 sp wagon wheel antenna
		bodyModel[249].setRotationPoint(-33.5F, -20.51F, -5.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[250].setRotationPoint(-22F, -21F, -0.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193 sp sd7 horn
		bodyModel[251].setRotationPoint(-24F, -21.75F, -1.5F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 194 sp sd7 horn
		bodyModel[252].setRotationPoint(-23.5F, -21.75F, 0.5F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 195 sp sd7 horn
		bodyModel[253].setRotationPoint(-22.5F, -21.75F, -0.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 50 footboard
		bodyModel[254].setRotationPoint(-46F, 9F, -10F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 0, 20, 0F); // Box 324 footboard
		bodyModel[255].setRotationPoint(43F, 9F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 325 cull sd7 mu cord cutout box
		bodyModel[256].setRotationPoint(-43.01F, 3.03F, -7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 326 cull sd7 mu cord cutout box
		bodyModel[257].setRotationPoint(-43.01F, 3.03F, 2F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 327 cull sd7 mu cord cutout box
		bodyModel[258].setRotationPoint(42.01F, 3.03F, 2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 328 cull sd7 mu cord cutout box
		bodyModel[259].setRotationPoint(42.01F, 3.03F, -7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 331 cull stepbox DONT TEXTURE SIDES
		bodyModel[260].setRotationPoint(-43F, 6F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 332 cull stepbox DONT TEXTURE SIDES
		bodyModel[261].setRotationPoint(-43F, 6F, 9F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 333 up mysterybox
		bodyModel[262].setRotationPoint(-31F, -10F, 7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 76, 4, 22, 0F,0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F); // Box 334 experamental hd sill vents
		bodyModel[263].setRotationPoint(-38F, -0.5F, -11F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 310 sd7 markerlight
		bodyModel[264].setRotationPoint(-39.75F, -17.5F, 4F);
		bodyModel[264].rotateAngleY = -0.46687557F;

		bodyModel[265].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 311 sd7 markerlight
		bodyModel[265].setRotationPoint(-39.75F, -17.5F, -4F);
		bodyModel[265].rotateAngleY = 0.46687557F;

		bodyModel[266].addBox(-1F, 0F, -0.25F, 1, 1, 1, 0F); // Box 312 sd7 markerlight
		bodyModel[266].setRotationPoint(40.1F, -17F, 4F);
		bodyModel[266].rotateAngleY = 0.37960911F;

		bodyModel[267].addBox(-1F, 0F, -0.75F, 1, 1, 1, 0F); // Box 313 sd7 markerlight
		bodyModel[267].setRotationPoint(40.1F, -17F, -4F);
		bodyModel[267].rotateAngleY = -0.37960911F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 steam gen exhaust TALL
		bodyModel[268].setRotationPoint(-36.5F, -21F, -4.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 315 NN gyra box
		bodyModel[269].setRotationPoint(-42.5F, -20F, -1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 316 NN gyra
		bodyModel[270].setRotationPoint(-43.1F, -20F, -1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 317 cull arrestor
		bodyModel[271].setRotationPoint(-2.5F, -22F, -1.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 318 cull arrestor
		bodyModel[272].setRotationPoint(12.5F, -22F, -1.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 160 cull crossover
		bodyModel[273].setRotationPoint(-44.5F, -3F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161 cull crossover
		bodyModel[274].setRotationPoint(-44.5F, -4F, -2F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 321 cull crossover
		bodyModel[275].setRotationPoint(43.5F, -3F, -2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322 cull crossover
		bodyModel[276].setRotationPoint(43.5F, -4F, -2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[277].setRotationPoint(-43.01F, 0F, -10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[278].setRotationPoint(-43.01F, 0F, 8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[279].setRotationPoint(43.01F, 0F, 8F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[280].setRotationPoint(43.01F, 0F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 327 up/cnw winterization stick
		bodyModel[281].setRotationPoint(29F, -18.75F, -8.25F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328 up/cnw winterization stick
		bodyModel[282].setRotationPoint(29F, -12.75F, -7.75F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[283].setRotationPoint(-27F, -16F, -11F);
		bodyModel[283].rotateAngleX = -0.6981317F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[284].setRotationPoint(-27F, -16F, 11F);
		bodyModel[284].rotateAngleX = 0.6981317F;

		bodyModel[285].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[285].setRotationPoint(-33F, -21F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[286].setRotationPoint(-28.5F, -22F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[287].setRotationPoint(-28.5F, -23F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334 cull drgw sd7 beacon holder
		bodyModel[288].setRotationPoint(-28.5F, -21F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 335 cull rerailer
		bodyModel[289].setRotationPoint(-33F, 4F, -10.7F);
		bodyModel[289].rotateAngleZ = 0.2268928F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 336 cull rerailer
		bodyModel[290].setRotationPoint(-33F, 4F, 9.7F);
		bodyModel[290].rotateAngleZ = 0.2268928F;

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 337 rerailer holder
		bodyModel[291].setRotationPoint(-32F, 3F, -10.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 339
		bodyModel[292].setRotationPoint(-32F, 3F, 9.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 418 cull platform PNWR
		bodyModel[293].setRotationPoint(-36.1F, -20.5F, -2.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[294].setRotationPoint(-35.1F, -21.5F, 0F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 418
		bodyModel[295].setRotationPoint(5.5F, -20.75F, -7.5F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[296].setRotationPoint(4F, -21.5F, -6.5F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[297].setRotationPoint(3F, -21.75F, -7.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[298].setRotationPoint(4.5F, -21.5F, -8.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 346 round stacc
		bodyModel[299].setRotationPoint(-2F, -21F, -1F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 347 rounde stacc
		bodyModel[300].setRotationPoint(13F, -21F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 348 cylinder arrestor
		bodyModel[301].setRotationPoint(-3F, -23F, -2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 349 cylinder arrestor
		bodyModel[302].setRotationPoint(12F, -23F, -2F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 350 regular lightkit
		bodyModel[303].setRotationPoint(40.5F, -17.5F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 351 headlight rear 1
		bodyModel[304].setRotationPoint(40.75F, -17.5F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 352 headlight rear 2
		bodyModel[305].setRotationPoint(40.75F, -15.5F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 353 els housing i think idr lol
		bodyModel[306].setRotationPoint(41F, -19.5F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[307].setRotationPoint(-32F, -22F, -0.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[308].setRotationPoint(-32F, -21F, -0.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407 bell holder cull
		bodyModel[309].setRotationPoint(-32F, -22F, -1.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 up/cs gyra housing rear
		bodyModel[310].setRotationPoint(41F, -21.5F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 363 gyra rear 4/els rear gyra
		bodyModel[311].setRotationPoint(41.65F, -19.5F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 364 gyra rear 3
		bodyModel[312].setRotationPoint(41.65F, -21.5F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 365 up gyra holdy
		bodyModel[313].setRotationPoint(39F, -21.5F, -1F);

		bodyModel[314].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 456 cull mu receptical
		bodyModel[314].setRotationPoint(-45.02F, 7F, -10F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 456 cull mu receptical
		bodyModel[315].setRotationPoint(-45.02F, 7F, 3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447 cull
		bodyModel[316].setRotationPoint(-45.02F, 8F, -2F);

		bodyModel[317].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 476 cull mu receptical
		bodyModel[317].setRotationPoint(43.02F, 7F, -10F);

		bodyModel[318].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 476 cull mu receptical
		bodyModel[318].setRotationPoint(43.02F, 7F, 3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479 cull
		bodyModel[319].setRotationPoint(43.02F, 8F, -2F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 369
		bodyModel[320].setRotationPoint(-10.5F, -19.75F, -5.5F);

		bodyModel[321].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 370
		bodyModel[321].setRotationPoint(-12F, -20.5F, -4.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 371
		bodyModel[322].setRotationPoint(-13F, -20.75F, -5.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 372
		bodyModel[323].setRotationPoint(-11.5F, -20.5F, -6.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373 bell holder cull
		bodyModel[324].setRotationPoint(-11F, -22F, -0.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[325].setRotationPoint(-10F, -22F, -0.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 375
		bodyModel[326].setRotationPoint(-10F, -21F, -0.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 377gn sd7 stacc
		bodyModel[327].setRotationPoint(0.5F, -21F, -1.5F);

		bodyModel[328].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 378 gn sd7 stacc
		bodyModel[328].setRotationPoint(10.5F, -21F, -1.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[329].setRotationPoint(-23.5F, -21.25F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[330].setRotationPoint(-23.5F, -21.75F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[331].setRotationPoint(-23.5F, -21.75F, -1F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[332].setRotationPoint(-23.5F, -21.75F, -1F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[333].setRotationPoint(-23.5F, -21.75F, -1F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[334].setRotationPoint(-13.5F, -20.75F, 0.5F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[335].setRotationPoint(-12F, -20.75F, -1.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[336].setRotationPoint(-12F, -20F, -0.5F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[337].setRotationPoint(-12F, -21F, -0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 388 up moment
		bodyModel[338].setRotationPoint(28.5F, -20.5F, -4.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 389 up momen
		bodyModel[339].setRotationPoint(28F, -21.25F, -3.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 390 up momen
		bodyModel[340].setRotationPoint(26F, -21.5F, -4.5F);

		bodyModel[341].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 391 up momen
		bodyModel[341].setRotationPoint(27.5F, -21.25F, -5.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[342].setRotationPoint(-35F, -20.5F, -1F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[343].setRotationPoint(-35F, -20.5F, -1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[344].setRotationPoint(-35F, -20.5F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[345].setRotationPoint(-35F, -20.5F, -1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[346].setRotationPoint(-35F, -20F, -1F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 74
		bodyModel[347].setRotationPoint(-31F, -20.25F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight f chop 1
		bodyModel[348].setRotationPoint(-31.25F, -20.25F, -1F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight f chop 2
		bodyModel[349].setRotationPoint(-31.25F, -18.25F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[350].setRotationPoint(-31F, -18.25F, -7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 645
		bodyModel[351].setRotationPoint(-31F, -20.25F, -7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 646
		bodyModel[352].setRotationPoint(-30F, -20.25F, -2F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.25F, 0F, -2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 647
		bodyModel[353].setRotationPoint(-31F, -20.25F, 1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 648
		bodyModel[354].setRotationPoint(-31F, -18.25F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 649
		bodyModel[355].setRotationPoint(-30F, -20.25F, 1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 363 numberboard chop A
		bodyModel[356].setRotationPoint(-29.4F, -18.3F, -6F);
		bodyModel[356].rotateAngleY = 0.32288591F;

		bodyModel[357].addShapeBox(0F, 0F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 364 numberboard chop A
		bodyModel[357].setRotationPoint(-29.4F, -18.3F, 6F);
		bodyModel[357].rotateAngleY = -0.32288591F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 202 nn moment
		bodyModel[358].setRotationPoint(-11.5F, -21.25F, -6.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 409
		bodyModel[359].setRotationPoint(-39F, -12.5F, -1F);

		bodyModel[360].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 410
		bodyModel[360].setRotationPoint(-41.5F, -11F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 411 headlight front chop
		bodyModel[361].setRotationPoint(-42.25F, -11F, -1F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 412 headlight front chop
		bodyModel[362].setRotationPoint(-42.25F, -9F, -1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[363].setRotationPoint(-43F, -20F, -0.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[364].setRotationPoint(-42.75F, -19.5F, -0.25F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[365].setRotationPoint(-43F, -21F, -0.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 332 bell mount cull
		bodyModel[366].setRotationPoint(-43F, -21F, -1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Box 354 NN bELL
		bodyModel[367].setRotationPoint(-45.5F, -4F, -1F);

		bodyModel[368].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[368].setRotationPoint(-15F, -21F, 4.5F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 420
		bodyModel[369].setRotationPoint(-15F, -20F, 4.5F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box cull handbrake enclousure
		bodyModel[370].setRotationPoint(35F, -8F, 6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[371].setRotationPoint(35.5F, -7.5F, 6F);

		bodyModel[372].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[372].setRotationPoint(36F, -5.5F, 6F);

		bodyModel[373].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 425
		bodyModel[373].setRotationPoint(-6.5F, -20.75F, 0.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 426
		bodyModel[374].setRotationPoint(-5.5F, -20.75F, -0.5F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 427
		bodyModel[375].setRotationPoint(-7F, -20.75F, -1.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 428
		bodyModel[376].setRotationPoint(-5F, -20F, -0.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[377].setRotationPoint(-47F, 7F, 0F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[378].setRotationPoint(-47F, 7F, -10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[379].setRotationPoint(-46F, 6F, 0F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[380].setRotationPoint(-46F, 4F, 2F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[381].setRotationPoint(-46F, 6F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[382].setRotationPoint(-46F, 4F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[383].setRotationPoint(-46F, 4F, 2F);

		bodyModel[384].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[384].setRotationPoint(-46F, 4F, -8F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[385].setRotationPoint(-46F, 3F, 2F);

		bodyModel[386].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[386].setRotationPoint(-46F, 3F, -8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 525
		bodyModel[387].setRotationPoint(-46F, 6F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[388].setRotationPoint(-46F, 6F, -10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 509
		bodyModel[389].setRotationPoint(46F, 7F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 510
		bodyModel[390].setRotationPoint(46F, 7F, -10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 515
		bodyModel[391].setRotationPoint(45F, 6F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 516
		bodyModel[392].setRotationPoint(45F, 6F, 0F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 517
		bodyModel[393].setRotationPoint(45F, 6F, 0F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 518
		bodyModel[394].setRotationPoint(45F, 6F, -10F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 519
		bodyModel[395].setRotationPoint(45F, 4F, 2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[396].setRotationPoint(45F, 4F, -10F);

		bodyModel[397].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[397].setRotationPoint(45F, 4F, -8F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 522
		bodyModel[398].setRotationPoint(45F, 4F, 2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 523
		bodyModel[399].setRotationPoint(45F, 3F, 2F);

		bodyModel[400].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[400].setRotationPoint(45F, 3F, -8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[401].setRotationPoint(-35.5F, -20F, -0.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[402].setRotationPoint(-35.5F, -21F, -0.5F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 455
		bodyModel[403].setRotationPoint(-4.5F, -20.75F, 3.5F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 456
		bodyModel[404].setRotationPoint(-4F, -20F, 3.5F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 457
		bodyModel[405].setRotationPoint(-5.5F, -20.75F, 4.5F);

		bodyModel[406].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 458
		bodyModel[406].setRotationPoint(-6F, -20.75F, 2.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[407].setRotationPoint(-35F, -21.5F, -5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[408].setRotationPoint(-35F, -21.5F, -5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[409].setRotationPoint(-35F, -21.5F, -5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[410].setRotationPoint(-35F, -21.5F, -5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[411].setRotationPoint(-35F, -21F, -5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464 bell holder c ull sou
		bodyModel[412].setRotationPoint(-43F, -21F, -1.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465 bell holder sou bit
		bodyModel[413].setRotationPoint(-43F, -18.01F, -0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F); // Box 71 markerlight twO
		bodyModel[414].setRotationPoint(-38.75F, -11F, -6.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.55F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1208 makrerlight twO
		bodyModel[415].setRotationPoint(-38.75F, -11F, 4.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[416].setRotationPoint(-25.25F, -21.25F, -2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[417].setRotationPoint(-43.5F, 0F, 5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[418].setRotationPoint(-43.5F, 0F, -7F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front
		bodyModel[419].setRotationPoint(-43.75F, 0F, 5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front
		bodyModel[420].setRotationPoint(-43.75F, 0F, -7F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[421].setRotationPoint(43F, 0F, 5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[422].setRotationPoint(43F, 0F, -7F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight r
		bodyModel[423].setRotationPoint(43.25F, 0F, 5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight r
		bodyModel[424].setRotationPoint(43.25F, 0F, -7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[425].setRotationPoint(-43F, -3F, -6F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f2
		bodyModel[426].setRotationPoint(-43.25F, -3F, -6F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f2
		bodyModel[427].setRotationPoint(-43.25F, -3F, 4F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[428].setRotationPoint(-43F, -3F, 4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 252
		bodyModel[429].setRotationPoint(42F, -3F, -6F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight r2
		bodyModel[430].setRotationPoint(42.75F, -3F, -6F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight r2
		bodyModel[431].setRotationPoint(42.75F, -3F, 4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 447
		bodyModel[432].setRotationPoint(42F, -3F, 4F);

		bodyModel[433].addBox(0F, 0F, 0F, 3, 4, 18, 0F); // Box 485 eje mystery box
		bodyModel[433].setRotationPoint(-5.5F, 4F, -9F);

		bodyModel[434].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 486
		bodyModel[434].setRotationPoint(-28.5F, -21.5F, 2.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 487
		bodyModel[435].setRotationPoint(-29.5F, -21.5F, 3.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 488
		bodyModel[436].setRotationPoint(-30F, -21.5F, 1.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 489
		bodyModel[437].setRotationPoint(-28F, -20.75F, 2.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 490
		bodyModel[438].setRotationPoint(-36F, -19.75F, 3.5F);

		bodyModel[439].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 491
		bodyModel[439].setRotationPoint(-38F, -20.5F, 2.5F);

		bodyModel[440].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 492
		bodyModel[440].setRotationPoint(-36.5F, -20.5F, 3.5F);

		bodyModel[441].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 493
		bodyModel[441].setRotationPoint(-37.5F, -20.5F, 4.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 4, 4, 18, 0F); // Box 494 anotha mysterybox & eje shid
		bodyModel[442].setRotationPoint(-2.5F, 4F, -9F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 239
		bodyModel[443].setRotationPoint(16.5F, -22.5F, -1F);

		bodyModel[444].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 240
		bodyModel[444].setRotationPoint(15F, -22.5F, 0F);

		bodyModel[445].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 241
		bodyModel[445].setRotationPoint(16.5F, -21.5F, -0.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498 bell holder cull
		bodyModel[446].setRotationPoint(5F, -22F, -0.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[447].setRotationPoint(6F, -22F, -0.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 500
		bodyModel[448].setRotationPoint(6F, -21F, -0.5F);

		bodyModel[449].addBox(0F, 0F, 0F, 46, 8, 0, 0F); // Box 38R
		bodyModel[449].setRotationPoint(-8F, -8F, 11F);

		bodyModel[450].addBox(0F, 0F, 0F, 46, 8, 0, 0F); // Box 176
		bodyModel[450].setRotationPoint(-8F, -8F, -11F);

		bodyModel[451].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 500
		bodyModel[451].setRotationPoint(-16F, -12F, -11F);

		bodyModel[452].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 503
		bodyModel[452].setRotationPoint(-16F, -12F, 11F);

		bodyModel[453].addBox(0F, 0F, 0F, 9, 12, 0, 0F); // Box 132
		bodyModel[453].setRotationPoint(-38F, -12F, -11F);

		bodyModel[454].addBox(0F, 0F, 0F, 9, 12, 0, 0F); // Box 136
		bodyModel[454].setRotationPoint(-38F, -12F, 11F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F); // Box 273
		bodyModel[455].setRotationPoint(-10F, -12F, -11.01F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0.25F, 0F, 0F); // Box 276
		bodyModel[456].setRotationPoint(-10F, -12F, 11.01F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -4F, 0F, 0.1F, -4F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[457].setRotationPoint(-38F, -8F, 11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -4F, 0F, 0.1F, -4F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[458].setRotationPoint(-38F, -8F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 326
		bodyModel[459].setRotationPoint(39.51F, -6F, -11.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 0, 13, 3, 0F); // Box 327
		bodyModel[460].setRotationPoint(39.5F, -8F, -11F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 328
		bodyModel[461].setRotationPoint(39F, -8F, -11F);

		bodyModel[462].addBox(0F, 0F, 0F, 0, 13, 3, 0F); // Box 522
		bodyModel[462].setRotationPoint(39.5F, -8F, 8F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 523
		bodyModel[463].setRotationPoint(39.51F, -6F, 10.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 524
		bodyModel[464].setRotationPoint(39F, -8F, 9F);

		bodyModel[465].addBox(0F, 0F, 0F, 0, 13, 3, 0F); // Box 525
		bodyModel[465].setRotationPoint(-39.5F, -8F, -11F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 526
		bodyModel[466].setRotationPoint(-39.51F, -6F, -11.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 527
		bodyModel[467].setRotationPoint(-39F, -8F, -11F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 528
		bodyModel[468].setRotationPoint(-39.51F, -6F, 10.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 0, 13, 3, 0F); // Box 529
		bodyModel[469].setRotationPoint(-39.5F, -8F, 8F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 530
		bodyModel[470].setRotationPoint(-39F, -8F, 9F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[471].setRotationPoint(-25F, -15F, 10F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5 aww
		bodyModel[472].setRotationPoint(-25F, -16F, 10F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533 cull aww
		bodyModel[473].setRotationPoint(-25F, -15F, -15F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534 aww
		bodyModel[474].setRotationPoint(-25F, -16F, -13F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 527 why dont you filter some bitches instead
		bodyModel[475].setRotationPoint(-6.25F, 3F, 8.5F);

		bodyModel[476].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 536
		bodyModel[476].setRotationPoint(-13F, -20.75F, 4.5F);

		bodyModel[477].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 537
		bodyModel[477].setRotationPoint(-10.5F, -19.75F, 4.5F);

		bodyModel[478].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 538
		bodyModel[478].setRotationPoint(-11.5F, -20.5F, 3.5F);

		bodyModel[479].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 539
		bodyModel[479].setRotationPoint(-12F, -20.5F, 5.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[480].setRotationPoint(-20.25F, -21.25F, 2F);

		bodyModel[481].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 529 cull
		bodyModel[481].setRotationPoint(-35F, -20F, -5.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[482].setRotationPoint(-14.5F, -22.5F, -1F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[483].setRotationPoint(-14.5F, -22.5F, -1F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[484].setRotationPoint(-14.5F, -22.5F, -1F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[485].setRotationPoint(-14.5F, -22.5F, -1F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428 prime base
		bodyModel[486].setRotationPoint(-14.5F, -22F, -1F);

		bodyModel[487].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 529 cull
		bodyModel[487].setRotationPoint(-14.5F, -21F, -1.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[488].setRotationPoint(-14F, -22F, -0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[489].setRotationPoint(-14F, -23F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[490].setRotationPoint(-21.7F, -14F, 1F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[491].setRotationPoint(-28.4F, -12F, 3F);
		bodyModel[491].rotateAngleY = -0.45378561F;

		bodyModel[492].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 86 cs
		bodyModel[492].setRotationPoint(-28.4F, -14F, 3F);
		bodyModel[492].rotateAngleY = -0.45378561F;

		bodyModel[493].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[493].setRotationPoint(-28.4F, -8F, 3F);
		bodyModel[493].rotateAngleY = -0.45378561F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 542 cs2
		bodyModel[494].setRotationPoint(-28.4F, -12F, 3F);
		bodyModel[494].rotateAngleY = -0.45378561F;

		bodyModel[495].addShapeBox(-1.5F, 0F, -1.5F, 3, 6, 3, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 131 cs2
		bodyModel[495].setRotationPoint(-27F, -10F, 7F);
		bodyModel[495].rotateAngleY = -0.64577182F;

		bodyModel[496].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,-0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Box 131 cs2
		bodyModel[496].setRotationPoint(-27F, -12F, 7F);

		bodyModel[497].addShapeBox(-0.5F, 0F, 1F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 591 speedo glow
		bodyModel[497].setRotationPoint(-29.1F, -17F, 7.25F);
		bodyModel[497].rotateAngleY = -1.57079633F;

		bodyModel[498].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 344 cull stepbox DONT TEXTURE SIDES
		bodyModel[498].setRotationPoint(-43F, 6F, -9F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 535 cull stepbox DONT TEXTURE SIDES
		bodyModel[499].setRotationPoint(-43F, 6F, 8F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 142, 226, textureX, textureY, "cull"); // Box 345 stairs cull
		bodyModel[501] = new ModelRendererTurbo(this, 155, 236, textureX, textureY); // Box 363
		bodyModel[502] = new ModelRendererTurbo(this, 155, 239, textureX, textureY); // Box 364
		bodyModel[503] = new ModelRendererTurbo(this, 156, 226, textureX, textureY, "cull"); // Box 367 stairs cull
		bodyModel[504] = new ModelRendererTurbo(this, 162, 236, textureX, textureY); // Box 370
		bodyModel[505] = new ModelRendererTurbo(this, 141, 239, textureX, textureY); // Box 440
		bodyModel[506] = new ModelRendererTurbo(this, 141, 236, textureX, textureY); // Box 441
		bodyModel[507] = new ModelRendererTurbo(this, 134, 236, textureX, textureY); // Box 445
		bodyModel[508] = new ModelRendererTurbo(this, 135, 209, textureX, textureY, "cull"); // Box 448 cull stair cope cube
		bodyModel[509] = new ModelRendererTurbo(this, 140, 244, textureX, textureY, "cull"); // Box 331 cull stepbox DONT TEXTURE SIDES
		bodyModel[510] = new ModelRendererTurbo(this, 154, 244, textureX, textureY, "cull"); // Box 332 cull stepbox DONT TEXTURE SIDES
		bodyModel[511] = new ModelRendererTurbo(this, 142, 241, textureX, textureY, "cull"); // Box 344 cull stepbox DONT TEXTURE SIDES
		bodyModel[512] = new ModelRendererTurbo(this, 156, 241, textureX, textureY, "cull"); // Box 535 cull stepbox DONT TEXTURE SIDES
		bodyModel[513] = new ModelRendererTurbo(this, 158, 215, textureX, textureY, "cull"); // Box 551 stairwell cull
		bodyModel[514] = new ModelRendererTurbo(this, 142, 215, textureX, textureY, "cull"); // Box 552 stairwell cull
		bodyModel[515] = new ModelRendererTurbo(this, 165, 215, textureX, textureY, "cull"); // Box 553 stairwell cull
		bodyModel[516] = new ModelRendererTurbo(this, 134, 192, textureX, textureY); // Box 554
		bodyModel[517] = new ModelRendererTurbo(this, 134, 192, textureX, textureY); // Box 555
		bodyModel[518] = new ModelRendererTurbo(this, 225, 74, textureX, textureY); // Box 184 o2 generator
		bodyModel[519] = new ModelRendererTurbo(this, 7, 94, textureX, textureY, "cull"); // Box 519 cull drgw chop stairs
		bodyModel[520] = new ModelRendererTurbo(this, 158, 116, textureX, textureY); // Box 520 drgw chop stair
		bodyModel[521] = new ModelRendererTurbo(this, 159, 116, textureX, textureY); // Box 521 drgw chop stair
		bodyModel[522] = new ModelRendererTurbo(this, 27, 188, textureX, textureY, "cull"); // Box 526 cull mu hoses
		bodyModel[523] = new ModelRendererTurbo(this, 103, 188, textureX, textureY, "cull"); // Box 527 cull mu hoses
		bodyModel[524] = new ModelRendererTurbo(this, 140, 19, textureX, textureY); // Box 364 prime base
		bodyModel[525] = new ModelRendererTurbo(this, 140, 15, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[526] = new ModelRendererTurbo(this, 140, 15, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[527] = new ModelRendererTurbo(this, 140, 15, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[528] = new ModelRendererTurbo(this, 140, 15, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4

		bodyModel[500].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 345 stairs cull
		bodyModel[500].setRotationPoint(40F, 0F, -8F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 363
		bodyModel[501].setRotationPoint(40F, 3F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F); // Box 364
		bodyModel[502].setRotationPoint(39F, 3F, 9F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 367 stairs cull
		bodyModel[503].setRotationPoint(40F, 0F, 7F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 370
		bodyModel[504].setRotationPoint(40F, 3F, 7F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 440
		bodyModel[505].setRotationPoint(39F, 3F, -10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 441
		bodyModel[506].setRotationPoint(40F, 3F, -9F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 445
		bodyModel[507].setRotationPoint(40F, 3F, -9F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 448 cull stair cope cube
		bodyModel[508].setRotationPoint(40F, 5.5F, -7.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 331 cull stepbox DONT TEXTURE SIDES
		bodyModel[509].setRotationPoint(39F, 6F, -11F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 332 cull stepbox DONT TEXTURE SIDES
		bodyModel[510].setRotationPoint(39F, 6F, 9F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 344 cull stepbox DONT TEXTURE SIDES
		bodyModel[511].setRotationPoint(40F, 6F, -9F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F); // Box 535 cull stepbox DONT TEXTURE SIDES
		bodyModel[512].setRotationPoint(40F, 6F, 8F);

		bodyModel[513].addShapeBox(-1F, 0F, 0F, 1, 5, 2, 0F,0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551 stairwell cull
		bodyModel[513].setRotationPoint(-39F, 3F, 9F);

		bodyModel[514].addShapeBox(-1F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 0F); // Box 552 stairwell cull
		bodyModel[514].setRotationPoint(40F, 3F, -11F);

		bodyModel[515].addShapeBox(-1F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553 stairwell cull
		bodyModel[515].setRotationPoint(40F, 3F, 9F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 0, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 554
		bodyModel[516].setRotationPoint(40F, 5.5F, -8F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 0, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[517].setRotationPoint(-43F, 5.5F, -8F);

		bodyModel[518].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[518].setRotationPoint(-25F, -21.5F, -4F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F,0.01F, 4F, 0F, 0.01F, 4F, 0F, 0.01F, 0F, 0.25F, 0.01F, 0F, 0.25F, 0.01F, -4F, 0.25F, 0.01F, -4F, 0.25F, 0.01F, 0F, 0F, 0.01F, 0F, 0F); // Box 519 cull drgw chop stairs
		bodyModel[519].setRotationPoint(-29F, -8F, -11F);
		bodyModel[519].rotateAngleY = 1.57079633F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520 drgw chop stair
		bodyModel[520].setRotationPoint(-31F, -4F, -11.01F);

		bodyModel[521].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 521 drgw chop stair
		bodyModel[521].setRotationPoint(-31F, -2F, -11F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,-1.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.75F, 0F, -1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 2F, 0F); // Box 526 cull mu hoses
		bodyModel[522].setRotationPoint(-44.5F, 4F, -7F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 0F, 0F, 0F); // Box 527 cull mu hoses
		bodyModel[523].setRotationPoint(42.5F, 4F, -7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[524].setRotationPoint(-29F, -21.25F, -1F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[525].setRotationPoint(-29F, -21.75F, -1F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[526].setRotationPoint(-29F, -21.75F, -1F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[527].setRotationPoint(-29F, -21.75F, -1F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[528].setRotationPoint(-29F, -21.75F, -1F);
	}
	ModelFlexicoil_C_Early bogie = new ModelFlexicoil_C_Early();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 6 ) {
			//silver
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c1_early_silvers.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.53F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.53F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 1 ) {
			//sp
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c1_early_sp.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.53F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.53F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (GetColor(entity) == 19 ) {
			//fuck
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c1_early_grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.53F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.53F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			//black
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/flexcoil_c1_early_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.53F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-1.53F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}