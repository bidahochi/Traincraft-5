//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C2H;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSDP40F extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSDP40F() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[243];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "cull"); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 112
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 164
		bodyModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 259
		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 262
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 264
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 265
		bodyModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 261
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 197
		bodyModel[16] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 159
		bodyModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 164
		bodyModel[26] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 259
		bodyModel[27] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 261
		bodyModel[28] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 262
		bodyModel[29] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 264
		bodyModel[30] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 265
		bodyModel[31] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 266
		bodyModel[32] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[34] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 234
		bodyModel[37] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 193
		bodyModel[45] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 72
		bodyModel[46] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 190
		bodyModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 316
		bodyModel[48] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 11
		bodyModel[49] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 210
		bodyModel[50] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 211
		bodyModel[51] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 48 lamp but not really lol
		bodyModel[52] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 43
		bodyModel[53] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 44
		bodyModel[54] = new ModelRendererTurbo(this, 281, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[55] = new ModelRendererTurbo(this, 393, 33, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[57] = new ModelRendererTurbo(this, 393, 9, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[58] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 219
		bodyModel[59] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 220
		bodyModel[60] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 221
		bodyModel[61] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 222
		bodyModel[62] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 223
		bodyModel[63] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 224
		bodyModel[64] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 225
		bodyModel[65] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 226
		bodyModel[66] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 229
		bodyModel[67] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 230
		bodyModel[68] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 231
		bodyModel[69] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 232
		bodyModel[70] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 233
		bodyModel[71] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 234
		bodyModel[72] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 235
		bodyModel[73] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 236
		bodyModel[74] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 255
		bodyModel[77] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 256
		bodyModel[78] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 241
		bodyModel[79] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 242
		bodyModel[80] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 243
		bodyModel[81] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 244
		bodyModel[82] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 272
		bodyModel[83] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 274
		bodyModel[85] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 268
		bodyModel[86] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 269
		bodyModel[87] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 273
		bodyModel[88] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 275
		bodyModel[89] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 276
		bodyModel[90] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 277
		bodyModel[91] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 278
		bodyModel[92] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 279
		bodyModel[93] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 280
		bodyModel[94] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 317
		bodyModel[95] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 318
		bodyModel[96] = new ModelRendererTurbo(this, 505, 1, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[97] = new ModelRendererTurbo(this, 169, 9, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[98] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 42
		bodyModel[99] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 42
		bodyModel[100] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 345
		bodyModel[101] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 74
		bodyModel[103] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 78
		bodyModel[104] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 411
		bodyModel[105] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 412
		bodyModel[106] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 413
		bodyModel[107] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 414
		bodyModel[108] = new ModelRendererTurbo(this, 257, 25, textureX, textureY, "lamp"); // Box 416 lamp
		bodyModel[109] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 417
		bodyModel[110] = new ModelRendererTurbo(this, 329, 25, textureX, textureY, "lamp"); // Box 418 lamp
		bodyModel[111] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 419
		bodyModel[112] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // box64
		bodyModel[113] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // box65
		bodyModel[114] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 350
		bodyModel[115] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 351
		bodyModel[116] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 86
		bodyModel[117] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 87
		bodyModel[118] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 86
		bodyModel[119] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 87
		bodyModel[120] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 451
		bodyModel[121] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 453
		bodyModel[122] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 454
		bodyModel[123] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 319
		bodyModel[124] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 322
		bodyModel[125] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 323
		bodyModel[126] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 326
		bodyModel[127] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 327
		bodyModel[128] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 329
		bodyModel[129] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 19
		bodyModel[130] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 334
		bodyModel[131] = new ModelRendererTurbo(this, 393, 25, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[132] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 341
		bodyModel[133] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 629
		bodyModel[134] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 630
		bodyModel[135] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 726
		bodyModel[136] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 727
		bodyModel[137] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 402
		bodyModel[138] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 220
		bodyModel[139] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 221
		bodyModel[140] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 222
		bodyModel[141] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Engieer side door
		bodyModel[142] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 72
		bodyModel[143] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Fireman side door
		bodyModel[144] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 72
		bodyModel[145] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 42
		bodyModel[146] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 42
		bodyModel[147] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 268
		bodyModel[148] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 269
		bodyModel[149] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 87
		bodyModel[150] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 345
		bodyModel[151] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 42
		bodyModel[152] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 42
		bodyModel[153] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 87
		bodyModel[154] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 45
		bodyModel[155] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 45
		bodyModel[156] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 345
		bodyModel[157] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 345
		bodyModel[158] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 318
		bodyModel[159] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 318
		bodyModel[160] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Front door
		bodyModel[161] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 72
		bodyModel[162] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 72
		bodyModel[163] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 42
		bodyModel[164] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 42
		bodyModel[165] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 7
		bodyModel[166] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Back Door
		bodyModel[167] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 7
		bodyModel[168] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 7
		bodyModel[169] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 7
		bodyModel[170] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 72
		bodyModel[171] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 72
		bodyModel[172] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 241
		bodyModel[173] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 251
		bodyModel[174] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 61
		bodyModel[175] = new ModelRendererTurbo(this, 265, 97, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[176] = new ModelRendererTurbo(this, 153, 57, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[177] = new ModelRendererTurbo(this, 249, 81, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[178] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Fireman side door
		bodyModel[179] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Fireman side door
		bodyModel[180] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Fireman side door
		bodyModel[181] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Fireman side door
		bodyModel[182] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 72
		bodyModel[183] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 72
		bodyModel[184] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 72
		bodyModel[185] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 72
		bodyModel[186] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 72
		bodyModel[187] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 72
		bodyModel[188] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 72
		bodyModel[189] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 72
		bodyModel[190] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 383
		bodyModel[191] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 384
		bodyModel[192] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 385
		bodyModel[193] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 386
		bodyModel[194] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 354
		bodyModel[195] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 355
		bodyModel[196] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 356
		bodyModel[197] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 357
		bodyModel[198] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 348
		bodyModel[199] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[200] = new ModelRendererTurbo(this, 1, 57, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[201] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 240
		bodyModel[202] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 241
		bodyModel[203] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 365
		bodyModel[204] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 251
		bodyModel[205] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 187
		bodyModel[206] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 188
		bodyModel[207] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 383
		bodyModel[208] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 384
		bodyModel[209] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 385
		bodyModel[210] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 386
		bodyModel[211] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 369
		bodyModel[212] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 370
		bodyModel[213] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 371
		bodyModel[214] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 372
		bodyModel[215] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 373
		bodyModel[216] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 374
		bodyModel[217] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 197
		bodyModel[218] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 197
		bodyModel[219] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 42
		bodyModel[220] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 42
		bodyModel[221] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 42
		bodyModel[222] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 42
		bodyModel[223] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 42
		bodyModel[224] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 42
		bodyModel[225] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 42
		bodyModel[226] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 42
		bodyModel[227] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 345
		bodyModel[228] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 197
		bodyModel[229] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 197
		bodyModel[230] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 234
		bodyModel[231] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 234
		bodyModel[232] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 234
		bodyModel[233] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 234
		bodyModel[234] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 234
		bodyModel[235] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 384
		bodyModel[236] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 273
		bodyModel[237] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 274
		bodyModel[238] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 273
		bodyModel[239] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 274
		bodyModel[240] = new ModelRendererTurbo(this, 505, 89, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[241] = new ModelRendererTurbo(this, 345, 97, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[242] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Light mount

		bodyModel[0].addBox(0F, 0F, 0F, 91, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-45.5F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 93, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-46.5F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(44.5F, -24F, 2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(44.5F, -24F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 66, 18, 22, 0F); // Box 34
		bodyModel[4].setRotationPoint(-21.5F, -24F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 26, 6, 16, 0F); // Box 112
		bodyModel[5].setRotationPoint(-13F, -3F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[6].setRotationPoint(-46.5F, -4F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 3
		bodyModel[7].setRotationPoint(-49.51F, -6F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[8].setRotationPoint(-46.5F, -4F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[9].setRotationPoint(-46.5F, -6F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[10].setRotationPoint(-46.5F, -1F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[11].setRotationPoint(-46.5F, -1F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[12].setRotationPoint(-46.5F, -6F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 61
		bodyModel[13].setRotationPoint(-49.5F, -14F, 11F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[14].setRotationPoint(-53.5F, -2F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 197
		bodyModel[15].setRotationPoint(-49.5F, -6F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-52.5F, 1F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-52.5F, 0F, 2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[18].setRotationPoint(-52.5F, 2F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[19].setRotationPoint(-52.5F, 1F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-53F, 0F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-52.5F, 2F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-50.5F, -2.5F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 91, 1, 4, 0F); // Box 159
		bodyModel[23].setRotationPoint(-45.5F, -6F, 7F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 3
		bodyModel[24].setRotationPoint(49.5F, -6F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[25].setRotationPoint(45.5F, -4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[26].setRotationPoint(45.5F, -4F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[27].setRotationPoint(45.5F, -6F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[28].setRotationPoint(45.5F, -6F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[29].setRotationPoint(45.5F, -1F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[30].setRotationPoint(45.5F, -1F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 2, 22, 0F); // Box 266
		bodyModel[31].setRotationPoint(46.5F, -6F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[32].setRotationPoint(44.5F, -4F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[33].setRotationPoint(49.5F, -2F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 61
		bodyModel[34].setRotationPoint(49.5F, -14F, 11F);

		bodyModel[35].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 63
		bodyModel[35].setRotationPoint(49.5F, -14F, -12F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 234
		bodyModel[36].setRotationPoint(51.5F, -14F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[37].setRotationPoint(49.5F, 1F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(49.5F, 0F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[39].setRotationPoint(49.5F, 2F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(49.5F, 1F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(50F, 0F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(49.5F, 2F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[43].setRotationPoint(49.5F, -2.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[44].setRotationPoint(-49.5F, -4F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 72
		bodyModel[45].setRotationPoint(-33.5F, -24F, 10F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 190
		bodyModel[46].setRotationPoint(-33.5F, -24F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[47].setRotationPoint(-36.5F, -10F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F); // Box 11
		bodyModel[48].setRotationPoint(-36.5F, -27F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[49].setRotationPoint(-21.5F, -27F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 211
		bodyModel[50].setRotationPoint(-35.5F, -27F, -7F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 48 lamp
		bodyModel[51].setRotationPoint(-37.5F, -27F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F); // Box 43
		bodyModel[52].setRotationPoint(-37.5F, -27F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 44
		bodyModel[53].setRotationPoint(-37.5F, -27F, 1F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[54].setRotationPoint(-35.6F, -26.5F, -7F);
		bodyModel[54].rotateAngleY = 0.27925268F;

		bodyModel[55].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[55].setRotationPoint(-35.6F, -26.5F, 7F);
		bodyModel[55].rotateAngleY = -0.27925268F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 186 lamp
		bodyModel[56].setRotationPoint(-38F, -27.25F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 187 lamp
		bodyModel[57].setRotationPoint(-38F, -25.75F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[58].setRotationPoint(-21.5F, -27F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 220
		bodyModel[59].setRotationPoint(-33.5F, -27F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[60].setRotationPoint(-33.5F, -27F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[61].setRotationPoint(-33.5F, -27F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[62].setRotationPoint(-21.5F, -27F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.905F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 224
		bodyModel[63].setRotationPoint(-36.5F, -27F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[64].setRotationPoint(49.5F, 2F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[65].setRotationPoint(-49.5F, 2F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 229
		bodyModel[66].setRotationPoint(-45.5F, -5F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 230
		bodyModel[67].setRotationPoint(-45.5F, -5F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 231
		bodyModel[68].setRotationPoint(14.5F, -5F, 7F);

		bodyModel[69].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 232
		bodyModel[69].setRotationPoint(14.5F, -5F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 26, 4, 3, 0F); // Box 233
		bodyModel[70].setRotationPoint(-13F, -3F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[71].setRotationPoint(-13F, 1F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 26, 4, 3, 0F); // Box 235
		bodyModel[72].setRotationPoint(-13F, -3F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 26, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		bodyModel[73].setRotationPoint(-13F, 1F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[74].setRotationPoint(-8F, -5F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[75].setRotationPoint(-8F, -4F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[76].setRotationPoint(-5.75F, -4F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[77].setRotationPoint(-5.75F, -5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[78].setRotationPoint(-14.5F, -5F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[79].setRotationPoint(-14.5F, -5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[80].setRotationPoint(13.5F, -5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[81].setRotationPoint(13.5F, -5F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 272
		bodyModel[82].setRotationPoint(-49.5F, 2F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 273
		bodyModel[83].setRotationPoint(-49.5F, -1F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 274
		bodyModel[84].setRotationPoint(-49.5F, -4F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[85].setRotationPoint(-52.5F, -6F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[86].setRotationPoint(-52.5F, -6F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[87].setRotationPoint(-19.5F, -28F, -6F);

		bodyModel[88].addBox(0F, 0F, 0F, 6, 2, 10, 0F); // Box 275
		bodyModel[88].setRotationPoint(-12F, -28.5F, -5F);

		bodyModel[89].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[89].setRotationPoint(28.5F, -28.5F, -3F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[90].setRotationPoint(20.5F, -28.5F, -3F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[91].setRotationPoint(-5.5F, -28F, -3F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[92].setRotationPoint(12.5F, -28.5F, -3F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[93].setRotationPoint(1.5F, -28F, -3F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[94].setRotationPoint(9F, -28F, -1F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[95].setRotationPoint(45.5F, -27.5F, -0.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[96].setRotationPoint(-35.75F, -25.5F, 7.5F);
		bodyModel[96].rotateAngleY = -0.2443461F;

		bodyModel[97].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[97].setRotationPoint(-35.75F, -25.5F, -7.5F);
		bodyModel[97].rotateAngleY = 0.2443461F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[98].setRotationPoint(-50F, -7F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[99].setRotationPoint(-50F, -7F, -2F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 10, 22, 0F); // Box 345
		bodyModel[100].setRotationPoint(-46.5F, -16F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[101].setRotationPoint(-15.5F, -3F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[102].setRotationPoint(-15.5F, -4F, -10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[103].setRotationPoint(-15.25F, -2.5F, -10.25F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[104].setRotationPoint(-30.5F, -4F, -11F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[105].setRotationPoint(-30.5F, -4F, 7F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[106].setRotationPoint(28.5F, -4F, 7F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[107].setRotationPoint(28.5F, -4F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp
		bodyModel[108].setRotationPoint(-50.25F, -5F, -6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[109].setRotationPoint(-50F, -5F, -6.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp
		bodyModel[110].setRotationPoint(-50.25F, -5F, 4.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[111].setRotationPoint(-50F, -5F, 4.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[112].setRotationPoint(-32.5F, -24F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[113].setRotationPoint(-32.5F, -24F, -12F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[114].setRotationPoint(-33.5F, -22F, -12F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[115].setRotationPoint(-33.5F, -22F, 11F);

		bodyModel[116].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[116].setRotationPoint(-36.6F, -18F, -5F);
		bodyModel[116].rotateAngleY = -0.38397244F;

		bodyModel[117].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[117].setRotationPoint(-36.5F, -19F, -4F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[118].setRotationPoint(-33.5F, -20F, -5.5F);
		bodyModel[118].rotateAngleY = -0.38397244F;

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[119].setRotationPoint(-35.5F, -19.75F, -4F);
		bodyModel[119].rotateAngleY = -0.38397244F;

		bodyModel[120].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 451
		bodyModel[120].setRotationPoint(-49.5F, -4F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[121].setRotationPoint(-49.5F, -1F, 8F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[122].setRotationPoint(-49.5F, 2F, 9F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 319
		bodyModel[123].setRotationPoint(46.5F, 2F, 10F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 322
		bodyModel[124].setRotationPoint(46.5F, 0F, 10F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 323
		bodyModel[125].setRotationPoint(46.5F, -2F, 10F);

		bodyModel[126].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 326
		bodyModel[126].setRotationPoint(46.5F, 2F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 327
		bodyModel[127].setRotationPoint(46.5F, 0F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 329
		bodyModel[128].setRotationPoint(46.5F, -2F, -11F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[129].setRotationPoint(-12F, -4F, -11.5F);
		bodyModel[129].rotateAngleX = 0.87266463F;

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[130].setRotationPoint(-12F, -2.5F, 8.75F);
		bodyModel[130].rotateAngleX = 0.87266463F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[131].setRotationPoint(-33F, -29F, -4.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[132].setRotationPoint(-32.82F, -28F, -4.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[133].setRotationPoint(-28.5F, -2F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[134].setRotationPoint(-35.5F, -2F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[135].setRotationPoint(33.5F, -2F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[136].setRotationPoint(26.5F, -2F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 402
		bodyModel[137].setRotationPoint(-28F, -29F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 65, 3, 14, 0F); // Box 220
		bodyModel[138].setRotationPoint(-20.5F, -27F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 65, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[139].setRotationPoint(-20.5F, -27F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 65, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[140].setRotationPoint(-20.5F, -27F, 7F);

		bodyModel[141].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Engieer side door
		bodyModel[141].setRotationPoint(-26.5F, -24F, 10F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[142].setRotationPoint(-22.5F, -24F, 10F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Fireman side door
		bodyModel[143].setRotationPoint(-26.5F, -24F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[144].setRotationPoint(-22.5F, -24F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[145].setRotationPoint(-50F, -19F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[146].setRotationPoint(-50F, -19F, -2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[147].setRotationPoint(49.5F, -6F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[148].setRotationPoint(49.5F, -6F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 87
		bodyModel[149].setRotationPoint(-34.5F, -24F, 0F);

		bodyModel[150].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 345
		bodyModel[150].setRotationPoint(-46.5F, -19F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[151].setRotationPoint(-46.5F, -19F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[152].setRotationPoint(-46.5F, -19F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 87
		bodyModel[153].setRotationPoint(-34.5F, -24F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F); // Box 45
		bodyModel[154].setRotationPoint(-49.5F, -19F, 2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[155].setRotationPoint(-49.5F, -19F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[156].setRotationPoint(-49F, -19F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[157].setRotationPoint(-48F, -7F, -2F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[158].setRotationPoint(-46.5F, -19.25F, 6.5F);
		bodyModel[158].rotateAngleX = -0.54105207F;

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[159].setRotationPoint(-46.5F, -18.65F, -7.5F);
		bodyModel[159].rotateAngleX = 0.54105207F;

		bodyModel[160].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Front door
		bodyModel[160].setRotationPoint(-49.5F, -17F, -2F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[161].setRotationPoint(-36.5F, -16F, 10F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[162].setRotationPoint(-36.5F, -16F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -3F, 0F, -2F, -3F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[163].setRotationPoint(44.5F, -27F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -0.675F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.675F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[164].setRotationPoint(44.5F, -27F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[165].setRotationPoint(44.5F, -7F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back Door
		bodyModel[166].setRotationPoint(46.5F, -21F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[167].setRotationPoint(44.5F, -27F, -2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[168].setRotationPoint(44.5F, -27F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[169].setRotationPoint(44.5F, -27F, 2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[170].setRotationPoint(-36.5F, -24F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[171].setRotationPoint(-36.5F, -24F, 10F);

		bodyModel[172].addBox(0F, 0F, -1F, 0, 11, 1, 0F); // Box 241
		bodyModel[172].setRotationPoint(-46.5F, -14F, 12F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 251
		bodyModel[173].setRotationPoint(-46.5F, -14F, -12F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 61
		bodyModel[174].setRotationPoint(-49.5F, -14F, -12F);

		bodyModel[175].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[175].setRotationPoint(45.75F, -24F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[176].setRotationPoint(47F, -24F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[177].setRotationPoint(47F, -24F, 0F);

		bodyModel[178].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[178].setRotationPoint(-26.5F, -4F, -11F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[179].setRotationPoint(18.5F, -4F, 11F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[180].setRotationPoint(-26.5F, -4F, 11F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Fireman side door
		bodyModel[181].setRotationPoint(-10.5F, -5F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[182].setRotationPoint(-22.5F, -23F, -11.75F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[183].setRotationPoint(-26.5F, -23F, -11.75F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[184].setRotationPoint(-22.5F, -23F, 10.75F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[185].setRotationPoint(-26.5F, -23F, 10.75F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 72
		bodyModel[186].setRotationPoint(-6.5F, -19F, -11.75F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 72
		bodyModel[187].setRotationPoint(-10.5F, -19F, -11.75F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[188].setRotationPoint(22.5F, -19F, 10.75F);

		bodyModel[189].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[189].setRotationPoint(18.5F, -19F, 10.75F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 383
		bodyModel[190].setRotationPoint(-36F, -28F, -1.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[191].setRotationPoint(-38F, -28.5F, 1F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[192].setRotationPoint(-37F, -29F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386
		bodyModel[193].setRotationPoint(-37F, -29F, -1F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[194].setRotationPoint(-39F, -30F, -0.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[195].setRotationPoint(-37F, -29.75F, 0.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[196].setRotationPoint(-38F, -29.75F, -1.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 357
		bodyModel[197].setRotationPoint(-36.5F, -29F, -0.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 348
		bodyModel[198].setRotationPoint(-30F, -29F, -5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[199].setRotationPoint(44.75F, -24F, 8.5F);
		bodyModel[199].rotateAngleY = 0.33161256F;

		bodyModel[200].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[200].setRotationPoint(44.75F, -24F, -8.5F);
		bodyModel[200].rotateAngleY = -0.33161256F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[201].setRotationPoint(45.5F, -14F, -11F);

		bodyModel[202].addBox(0F, 0F, -1F, 0, 11, 1, 0F); // Box 241
		bodyModel[202].setRotationPoint(45.5F, -14F, -11F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 365
		bodyModel[203].setRotationPoint(45.5F, -14F, 8F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 251
		bodyModel[204].setRotationPoint(45.5F, -14F, 11F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[205].setRotationPoint(38F, -28F, -3F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[206].setRotationPoint(41F, -28F, 1F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[207].setRotationPoint(9.5F, -28F, -5.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[208].setRotationPoint(8F, -29F, -5.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[209].setRotationPoint(10F, -29F, -4.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[210].setRotationPoint(9F, -29F, -6.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[211].setRotationPoint(-24.5F, -29F, 1F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[212].setRotationPoint(-24.5F, -29F, 1F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[213].setRotationPoint(-24.5F, -29F, 5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[214].setRotationPoint(-24.5F, -30F, 3F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[215].setRotationPoint(-21.5F, -29F, 5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[216].setRotationPoint(-21.5F, -29F, 1F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 197
		bodyModel[217].setRotationPoint(-49.5F, -6F, -11F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 197
		bodyModel[218].setRotationPoint(-49.5F, -6F, 8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 10, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.995F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.995F, 0F, 0F); // Box 42
		bodyModel[219].setRotationPoint(-48.5F, -16F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F,-1.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[220].setRotationPoint(-49.5F, -16F, -8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, -1.2F, 0F, -0.995F, -1.2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.995F, 0F, 0F); // Box 42
		bodyModel[221].setRotationPoint(-48.5F, -19F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.995F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F); // Box 42
		bodyModel[222].setRotationPoint(-48.5F, -19F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 10, 3, 0F,-0.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[223].setRotationPoint(-48.5F, -16F, 8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.995F, 0F, 0F); // Box 42
		bodyModel[224].setRotationPoint(-49.5F, -16F, 2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.995F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.995F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[225].setRotationPoint(-48.5F, -19F, 8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.335F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -0.995F, -1.2F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.995F, 0F, 0F); // Box 42
		bodyModel[226].setRotationPoint(-48.5F, -19F, 6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[227].setRotationPoint(-49.5F, -19F, -2F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 197
		bodyModel[228].setRotationPoint(-49.5F, -4F, 8F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 197
		bodyModel[229].setRotationPoint(-49.5F, -4F, -11F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 234
		bodyModel[230].setRotationPoint(49.5F, -14F, -11F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 234
		bodyModel[231].setRotationPoint(49.5F, -14F, 11F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 234
		bodyModel[232].setRotationPoint(-51.5F, -14F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 234
		bodyModel[233].setRotationPoint(-51.5F, -14F, -11F);

		bodyModel[234].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 234
		bodyModel[234].setRotationPoint(-51.5F, -14F, 11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 384
		bodyModel[235].setRotationPoint(-38F, -28.5F, -2F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 273
		bodyModel[236].setRotationPoint(-49.5F, -1F, -11F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 274
		bodyModel[237].setRotationPoint(-49.5F, -4F, -11F);

		bodyModel[238].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 273
		bodyModel[238].setRotationPoint(-49.5F, -1F, 10F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 274
		bodyModel[239].setRotationPoint(-49.5F, -4F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176 lamp
		bodyModel[240].setRotationPoint(-50F, -16.25F, -0.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 177 lamp
		bodyModel[241].setRotationPoint(-50F, -14.5F, -0.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Light mount
		bodyModel[242].setRotationPoint(-49.75F, -16.6F, -1F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 243; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		} else if (GetColor(entity) == 4 || GetColor(entity) == 11) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else if (GetColor(entity) == 12) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_BlueOTHER.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.15F, -0.32F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-2.15F, -0.32F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public ModelRendererTurbo ModelSDP40F[];
}