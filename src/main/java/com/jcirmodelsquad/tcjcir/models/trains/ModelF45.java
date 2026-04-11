//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F45
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
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelF45 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF45() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[270];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "cull"); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 112
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 164
		bodyModel[7] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 259
		bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 262
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 264
		bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 265
		bodyModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 261
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 4
		bodyModel[15] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 197
		bodyModel[16] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 159
		bodyModel[24] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 164
		bodyModel[26] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 259
		bodyModel[27] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 261
		bodyModel[28] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 262
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 264
		bodyModel[30] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 265
		bodyModel[31] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 266
		bodyModel[32] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 5
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 234
		bodyModel[38] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 193
		bodyModel[46] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 190
		bodyModel[48] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 316
		bodyModel[49] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 206
		bodyModel[50] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 207
		bodyModel[51] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 11
		bodyModel[52] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 210
		bodyModel[53] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 211
		bodyModel[54] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 48
		bodyModel[55] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 43
		bodyModel[56] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 44
		bodyModel[57] = new ModelRendererTurbo(this, 489, 25, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[58] = new ModelRendererTurbo(this, 217, 33, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[59] = new ModelRendererTurbo(this, 489, 9, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[60] = new ModelRendererTurbo(this, 153, 17, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[61] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 219
		bodyModel[62] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 220
		bodyModel[63] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 221
		bodyModel[64] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 222
		bodyModel[65] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 223
		bodyModel[66] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 224
		bodyModel[67] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 225
		bodyModel[68] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 226
		bodyModel[69] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 227
		bodyModel[70] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 229
		bodyModel[71] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 230
		bodyModel[72] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 231
		bodyModel[73] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 232
		bodyModel[74] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 233
		bodyModel[75] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 234
		bodyModel[76] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 235
		bodyModel[77] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 236
		bodyModel[78] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 86
		bodyModel[79] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 87
		bodyModel[80] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 255
		bodyModel[81] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 256
		bodyModel[82] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 241
		bodyModel[83] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 242
		bodyModel[84] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 243
		bodyModel[85] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 244
		bodyModel[86] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 271
		bodyModel[87] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 272
		bodyModel[88] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 273
		bodyModel[89] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 274
		bodyModel[90] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 277
		bodyModel[91] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 278
		bodyModel[92] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 268
		bodyModel[93] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 269
		bodyModel[94] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 273
		bodyModel[95] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 274
		bodyModel[96] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 275
		bodyModel[97] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 276
		bodyModel[98] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 277
		bodyModel[99] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 278
		bodyModel[100] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 279
		bodyModel[101] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 280
		bodyModel[102] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 317
		bodyModel[103] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 318
		bodyModel[104] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 42
		bodyModel[105] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 45
		bodyModel[106] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 42
		bodyModel[107] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 42
		bodyModel[108] = new ModelRendererTurbo(this, 465, 1, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[109] = new ModelRendererTurbo(this, 481, 1, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[110] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 42
		bodyModel[111] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 42
		bodyModel[112] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 345
		bodyModel[113] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 74
		bodyModel[115] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 78
		bodyModel[116] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 78
		bodyModel[117] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 188
		bodyModel[118] = new ModelRendererTurbo(this, 505, 25, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[119] = new ModelRendererTurbo(this, 409, 33, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[120] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 239
		bodyModel[121] = new ModelRendererTurbo(this, 449, 41, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[122] = new ModelRendererTurbo(this, 505, 41, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[123] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 242
		bodyModel[124] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 409
		bodyModel[125] = new ModelRendererTurbo(this, 177, 25, textureX, textureY, "lamp"); // Box 410 glow
		bodyModel[126] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 411
		bodyModel[127] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 412
		bodyModel[128] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 413
		bodyModel[129] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 414
		bodyModel[130] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 416 lamp
		bodyModel[131] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 417
		bodyModel[132] = new ModelRendererTurbo(this, 65, 65, textureX, textureY, "lamp"); // Box 418 lamp
		bodyModel[133] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 419
		bodyModel[134] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // box64
		bodyModel[135] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // box65
		bodyModel[136] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 350
		bodyModel[137] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 351
		bodyModel[138] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 86
		bodyModel[139] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 87
		bodyModel[140] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 86
		bodyModel[141] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 87
		bodyModel[142] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 451
		bodyModel[143] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 452
		bodyModel[144] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 453
		bodyModel[145] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 454
		bodyModel[146] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 455
		bodyModel[147] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 456
		bodyModel[148] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 319
		bodyModel[149] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 320
		bodyModel[150] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 321
		bodyModel[151] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 322
		bodyModel[152] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 323
		bodyModel[153] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 324
		bodyModel[154] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 325
		bodyModel[155] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 326
		bodyModel[156] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 327
		bodyModel[157] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 328
		bodyModel[158] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 329
		bodyModel[159] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 330
		bodyModel[160] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 19
		bodyModel[161] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 334
		bodyModel[162] = new ModelRendererTurbo(this, 393, 33, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[163] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 341
		bodyModel[164] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 629
		bodyModel[165] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 630
		bodyModel[166] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 726
		bodyModel[167] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 727
		bodyModel[168] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 402
		bodyModel[169] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 220
		bodyModel[170] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 221
		bodyModel[171] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 222
		bodyModel[172] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Engieer side door
		bodyModel[173] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 72
		bodyModel[174] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Fireman side door
		bodyModel[175] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 72
		bodyModel[176] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 42
		bodyModel[177] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 42
		bodyModel[178] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 268
		bodyModel[179] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 269
		bodyModel[180] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 87
		bodyModel[181] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 345
		bodyModel[182] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 42
		bodyModel[183] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 42
		bodyModel[184] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 87
		bodyModel[185] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 48
		bodyModel[186] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 48
		bodyModel[187] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 48
		bodyModel[188] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 45
		bodyModel[189] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 45
		bodyModel[190] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 345
		bodyModel[191] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 345
		bodyModel[192] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 318
		bodyModel[193] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 318
		bodyModel[194] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Front door
		bodyModel[195] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 72
		bodyModel[196] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 72
		bodyModel[197] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 42
		bodyModel[198] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 42
		bodyModel[199] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 7
		bodyModel[200] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Back Door
		bodyModel[201] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 7
		bodyModel[202] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 7
		bodyModel[203] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 7
		bodyModel[204] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 72
		bodyModel[205] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 72
		bodyModel[206] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 240
		bodyModel[207] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 241
		bodyModel[208] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 364
		bodyModel[209] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 365
		bodyModel[210] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 244
		bodyModel[211] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 246
		bodyModel[212] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 247
		bodyModel[213] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 251
		bodyModel[214] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 252
		bodyModel[215] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 253
		bodyModel[216] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 254
		bodyModel[217] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 255
		bodyModel[218] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 62
		bodyModel[219] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 234
		bodyModel[220] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 206
		bodyModel[221] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 246
		bodyModel[222] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 247
		bodyModel[223] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 61
		bodyModel[224] = new ModelRendererTurbo(this, 353, 81, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[225] = new ModelRendererTurbo(this, 177, 97, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[226] = new ModelRendererTurbo(this, 185, 97, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[227] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Fireman side door
		bodyModel[228] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Fireman side door
		bodyModel[229] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Fireman side door
		bodyModel[230] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Fireman side door
		bodyModel[231] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Fireman side door
		bodyModel[232] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 72
		bodyModel[233] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 72
		bodyModel[234] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 72
		bodyModel[235] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 72
		bodyModel[236] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 72
		bodyModel[237] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 72
		bodyModel[238] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 72
		bodyModel[239] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 72
		bodyModel[240] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 72
		bodyModel[241] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 72
		bodyModel[242] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 383
		bodyModel[243] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 384
		bodyModel[244] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 385
		bodyModel[245] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 386
		bodyModel[246] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 354
		bodyModel[247] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 355
		bodyModel[248] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 356
		bodyModel[249] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 357
		bodyModel[250] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 348
		bodyModel[251] = new ModelRendererTurbo(this, 1, 81, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[252] = new ModelRendererTurbo(this, 33, 81, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[253] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 279
		bodyModel[254] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 240
		bodyModel[255] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 241
		bodyModel[256] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 364
		bodyModel[257] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 365
		bodyModel[258] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 244
		bodyModel[259] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 251
		bodyModel[260] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 252
		bodyModel[261] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 253
		bodyModel[262] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 254
		bodyModel[263] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 255
		bodyModel[264] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 345
		bodyModel[265] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 345
		bodyModel[266] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 345
		bodyModel[267] = new ModelRendererTurbo(this, 233, 97, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[268] = new ModelRendererTurbo(this, 161, 105, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[269] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Light mount

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(41.5F, -24F, 2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 18, 9, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(41.5F, -24F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 61, 18, 22, 0F); // Box 34
		bodyModel[4].setRotationPoint(-19.5F, -24F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 21, 6, 16, 0F); // Box 112
		bodyModel[5].setRotationPoint(-11F, -3F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[6].setRotationPoint(-43.5F, -4F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[7].setRotationPoint(-47.51F, -6F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[8].setRotationPoint(-43.5F, -4F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[9].setRotationPoint(-43.5F, -6F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[10].setRotationPoint(-43.5F, -1F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[11].setRotationPoint(-43.5F, -1F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[12].setRotationPoint(-43.5F, -6F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 61
		bodyModel[13].setRotationPoint(-47.5F, -8F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[14].setRotationPoint(-51.5F, -2F, -1.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[15].setRotationPoint(-47.5F, -6F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[16].setRotationPoint(-50.5F, 1F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-50.5F, 0F, 2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[18].setRotationPoint(-50.5F, 2F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[19].setRotationPoint(-50.5F, 1F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-51F, 0F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(-50.5F, 2F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-48.5F, -2.5F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[23].setRotationPoint(-42.5F, -6F, 7F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[24].setRotationPoint(46.5F, -6F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[25].setRotationPoint(41.5F, -4F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[26].setRotationPoint(41.5F, -4F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[27].setRotationPoint(41.5F, -6F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[28].setRotationPoint(41.5F, -6F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[29].setRotationPoint(41.5F, -1F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[30].setRotationPoint(41.5F, -1F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[31].setRotationPoint(43.5F, -6F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[32].setRotationPoint(41.5F, -4F, -3F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[33].setRotationPoint(46.5F, -2F, -1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 61
		bodyModel[34].setRotationPoint(46.5F, -8F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[35].setRotationPoint(46.5F, -14F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 63
		bodyModel[36].setRotationPoint(46.5F, -8F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[37].setRotationPoint(48.5F, -14F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(46.5F, 1F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(46.5F, 0F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[40].setRotationPoint(46.5F, 2F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(46.5F, 1F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(47F, 0F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[43].setRotationPoint(46.5F, 2F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[44].setRotationPoint(46.5F, -2.5F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[45].setRotationPoint(-47.5F, -4F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 72
		bodyModel[46].setRotationPoint(-31.5F, -24F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 190
		bodyModel[47].setRotationPoint(-31.5F, -24F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[48].setRotationPoint(-34.5F, -10F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 206
		bodyModel[49].setRotationPoint(48.5F, -14F, 4F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[50].setRotationPoint(46.5F, 1F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.905F, 0F, 0F); // Box 11
		bodyModel[51].setRotationPoint(-34.5F, -27F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[52].setRotationPoint(-19.5F, -27F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 3, 14, 0F); // Box 211
		bodyModel[53].setRotationPoint(-33.5F, -27F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 48
		bodyModel[54].setRotationPoint(-35.5F, -27F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F); // Box 43
		bodyModel[55].setRotationPoint(-35.5F, -27F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 44
		bodyModel[56].setRotationPoint(-35.5F, -27F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[57].setRotationPoint(-33.6F, -26.5F, -7F);
		bodyModel[57].rotateAngleY = 0.27925268F;

		bodyModel[58].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[58].setRotationPoint(-33.6F, -26.5F, 7F);
		bodyModel[58].rotateAngleY = -0.27925268F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 186 lamp
		bodyModel[59].setRotationPoint(-36F, -27.25F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 187 lamp
		bodyModel[60].setRotationPoint(-36F, -25.75F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[61].setRotationPoint(-19.5F, -27F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 12, 1, 14, 0F); // Box 220
		bodyModel[62].setRotationPoint(-31.5F, -27F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[63].setRotationPoint(-31.5F, -27F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[64].setRotationPoint(-31.5F, -27F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[65].setRotationPoint(-19.5F, -27F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 224
		bodyModel[66].setRotationPoint(-34.5F, -27F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[67].setRotationPoint(46.5F, 2F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[68].setRotationPoint(-47.5F, 2F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[69].setRotationPoint(-47.5F, 1F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[70].setRotationPoint(-42.5F, -5F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[71].setRotationPoint(-42.5F, -5F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[72].setRotationPoint(11.5F, -5F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[73].setRotationPoint(11.5F, -5F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 21, 4, 3, 0F); // Box 233
		bodyModel[74].setRotationPoint(-11F, -3F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[75].setRotationPoint(-11F, 1F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 21, 4, 3, 0F); // Box 235
		bodyModel[76].setRotationPoint(-11F, -3F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 21, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		bodyModel[77].setRotationPoint(-11F, 1F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[78].setRotationPoint(-6F, -5F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[79].setRotationPoint(-6F, -4F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[80].setRotationPoint(-3.75F, -4F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[81].setRotationPoint(-3.75F, -5F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[82].setRotationPoint(-12.5F, -5F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[83].setRotationPoint(-12.5F, -5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[84].setRotationPoint(10.5F, -5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[85].setRotationPoint(10.5F, -5F, -11F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[86].setRotationPoint(-47.5F, -5F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 272
		bodyModel[87].setRotationPoint(-47.5F, 2F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 273
		bodyModel[88].setRotationPoint(-47.5F, -1F, -10F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[89].setRotationPoint(-47.5F, -3F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[90].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[91].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[92].setRotationPoint(-50.5F, -6F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[93].setRotationPoint(-50.5F, -6F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[94].setRotationPoint(-18.5F, -28F, -6F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[95].setRotationPoint(-9.5F, -28.5F, -2.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[96].setRotationPoint(-10.5F, -27.5F, -4F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[97].setRotationPoint(31.5F, -28.5F, -3F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[98].setRotationPoint(23.5F, -28.5F, -3F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[99].setRotationPoint(-4.5F, -28F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[100].setRotationPoint(15.5F, -28.5F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[101].setRotationPoint(2.5F, -28F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[102].setRotationPoint(10.5F, -28F, -1F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[103].setRotationPoint(42.5F, -27.5F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[104].setRotationPoint(-45.5F, -16F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[105].setRotationPoint(-45.5F, -16F, 2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[106].setRotationPoint(-44.5F, -19F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F); // Box 42
		bodyModel[107].setRotationPoint(-44.5F, -19F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[108].setRotationPoint(-33.75F, -25.5F, 7.5F);
		bodyModel[108].rotateAngleY = -0.2443461F;

		bodyModel[109].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[109].setRotationPoint(-33.75F, -25.5F, -7.5F);
		bodyModel[109].rotateAngleY = 0.2443461F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[110].setRotationPoint(-46F, -7F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[111].setRotationPoint(-46F, -7F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 8, 10, 22, 0F); // Box 345
		bodyModel[112].setRotationPoint(-42.5F, -16F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[113].setRotationPoint(-13.5F, -3F, -10.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[114].setRotationPoint(-13.5F, -4F, -10.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[115].setRotationPoint(-13.25F, -2.5F, -10.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[116].setRotationPoint(-49.75F, -8F, 4.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[117].setRotationPoint(-49.75F, -8F, -6.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[118].setRotationPoint(-50F, -8F, 4.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[119].setRotationPoint(-50F, -8F, -6.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[120].setRotationPoint(47.75F, -8F, -6.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[121].setRotationPoint(48F, -8F, -6.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[122].setRotationPoint(48F, -8F, 4.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[123].setRotationPoint(47.75F, -8F, 4.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[124].setRotationPoint(-33.82F, -28F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow
		bodyModel[125].setRotationPoint(-34F, -29F, -0.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[126].setRotationPoint(-28.5F, -4F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[127].setRotationPoint(-28.5F, -4F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[128].setRotationPoint(25.5F, -4F, 7F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[129].setRotationPoint(25.5F, -4F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp
		bodyModel[130].setRotationPoint(-48.25F, -5F, -6.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[131].setRotationPoint(-48F, -5F, -6.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp
		bodyModel[132].setRotationPoint(-48.25F, -5F, 4.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[133].setRotationPoint(-48F, -5F, 4.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[134].setRotationPoint(-30.5F, -24F, 11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[135].setRotationPoint(-30.5F, -24F, -12F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[136].setRotationPoint(-31.5F, -22F, -12F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[137].setRotationPoint(-31.5F, -22F, 11F);

		bodyModel[138].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[138].setRotationPoint(-34.6F, -18F, -5F);
		bodyModel[138].rotateAngleY = -0.38397244F;

		bodyModel[139].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[139].setRotationPoint(-34.5F, -19F, -4F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[140].setRotationPoint(-31.5F, -20F, -5.5F);
		bodyModel[140].rotateAngleY = -0.38397244F;

		bodyModel[141].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[141].setRotationPoint(-33.5F, -19.75F, -4F);
		bodyModel[141].rotateAngleY = -0.38397244F;

		bodyModel[142].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[142].setRotationPoint(-47.5F, -3F, 7F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[143].setRotationPoint(-47.5F, -5F, 7F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 453
		bodyModel[144].setRotationPoint(-47.5F, -1F, 8F);

		bodyModel[145].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 454
		bodyModel[145].setRotationPoint(-47.5F, 2F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[146].setRotationPoint(-43.5F, 2F, 9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[147].setRotationPoint(-43.5F, -1F, 9F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 319
		bodyModel[148].setRotationPoint(42.5F, 2F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[149].setRotationPoint(41.5F, 2F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 321
		bodyModel[150].setRotationPoint(41.5F, -1F, 9F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 322
		bodyModel[151].setRotationPoint(42.5F, -1F, 8F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 323
		bodyModel[152].setRotationPoint(42.5F, -3F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 324
		bodyModel[153].setRotationPoint(42.5F, -5F, 7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 325
		bodyModel[154].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[155].setRotationPoint(42.5F, 2F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[156].setRotationPoint(42.5F, -1F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 328
		bodyModel[157].setRotationPoint(41.5F, -1F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[158].setRotationPoint(42.5F, -3F, -9F);

		bodyModel[159].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 330
		bodyModel[159].setRotationPoint(42.5F, -5F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[160].setRotationPoint(-10F, -4F, -11.5F);
		bodyModel[160].rotateAngleX = 0.87266463F;

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[161].setRotationPoint(-10F, -2.5F, 8.75F);
		bodyModel[161].rotateAngleX = 0.87266463F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[162].setRotationPoint(-31F, -29F, -4.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[163].setRotationPoint(-30.82F, -28F, -4.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[164].setRotationPoint(-26.5F, -2F, -1F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[165].setRotationPoint(-33.5F, -2F, -1F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[166].setRotationPoint(30.5F, -2F, -1F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[167].setRotationPoint(23.5F, -2F, -1F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 402
		bodyModel[168].setRotationPoint(-24F, -29F, 0F);

		bodyModel[169].addBox(0F, 0F, 0F, 60, 3, 14, 0F); // Box 220
		bodyModel[169].setRotationPoint(-18.5F, -27F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 60, 3, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[170].setRotationPoint(-18.5F, -27F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 60, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[171].setRotationPoint(-18.5F, -27F, 7F);

		bodyModel[172].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Engieer side door
		bodyModel[172].setRotationPoint(-24.5F, -24F, 10F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[173].setRotationPoint(-20.5F, -24F, 10F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Fireman side door
		bodyModel[174].setRotationPoint(-24.5F, -24F, -11F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 72
		bodyModel[175].setRotationPoint(-20.5F, -24F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[176].setRotationPoint(-46F, -19F, 0F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[177].setRotationPoint(-46F, -19F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[178].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[179].setRotationPoint(46.5F, -6F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 87
		bodyModel[180].setRotationPoint(-32.5F, -24F, 0F);

		bodyModel[181].addBox(0F, 0F, 0F, 8, 3, 12, 0F); // Box 345
		bodyModel[181].setRotationPoint(-42.5F, -19F, -6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[182].setRotationPoint(-42.5F, -19F, 6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[183].setRotationPoint(-42.5F, -19F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 87
		bodyModel[184].setRotationPoint(-32.5F, -24F, -11F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 48
		bodyModel[185].setRotationPoint(-34.5F, -27F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[186].setRotationPoint(-35.5F, -27F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.275F, 0F, 0F); // Box 48
		bodyModel[187].setRotationPoint(-35.5F, -27F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F); // Box 45
		bodyModel[188].setRotationPoint(-45.5F, -19F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[189].setRotationPoint(-45.5F, -19F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[190].setRotationPoint(-45F, -19F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[191].setRotationPoint(-45F, -7F, -2F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[192].setRotationPoint(-42.5F, -19.25F, 6.5F);
		bodyModel[192].rotateAngleX = -0.54105207F;

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[193].setRotationPoint(-42.5F, -18.65F, -7.5F);
		bodyModel[193].rotateAngleX = 0.54105207F;

		bodyModel[194].addBox(0F, 0F, 0F, 1, 10, 4, 0F); // Front door
		bodyModel[194].setRotationPoint(-45.5F, -17F, -2F);

		bodyModel[195].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[195].setRotationPoint(-34.5F, -16F, 10F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 72
		bodyModel[196].setRotationPoint(-34.5F, -16F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.675F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[197].setRotationPoint(41.5F, -27F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, -0.675F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.675F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[198].setRotationPoint(41.5F, -27F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[199].setRotationPoint(41.5F, -7F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back Door
		bodyModel[200].setRotationPoint(43.5F, -21F, -2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[201].setRotationPoint(41.5F, -27F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[202].setRotationPoint(41.5F, -27F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[203].setRotationPoint(41.5F, -27F, 2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[204].setRotationPoint(-34.5F, -24F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[205].setRotationPoint(-34.5F, -24F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, -1F, 0, 6, 1, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[206].setRotationPoint(-43F, -14F, 11F);
		bodyModel[206].rotateAngleY = -0.33161256F;

		bodyModel[207].addBox(0F, 0F, -1F, 0, 7, 1, 0F); // Box 241
		bodyModel[207].setRotationPoint(-43F, -8F, 11F);
		bodyModel[207].rotateAngleY = -0.33161256F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[208].setRotationPoint(-43.98F, -13F, 7.15F);

		bodyModel[209].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 365
		bodyModel[209].setRotationPoint(-43.98F, -14F, 7.15F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 244
		bodyModel[210].setRotationPoint(-43.98F, -14F, 7.15F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[211].setRotationPoint(48.5F, -14F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, -1F, 0F, -3F, 1F, 0F, -3F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 247
		bodyModel[212].setRotationPoint(46.5F, -14F, -11F);

		bodyModel[213].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 251
		bodyModel[213].setRotationPoint(-43F, -8F, -11F);
		bodyModel[213].rotateAngleY = 0.33161256F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[214].setRotationPoint(-43F, -14F, -11F);
		bodyModel[214].rotateAngleY = 0.33161256F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 253
		bodyModel[215].setRotationPoint(-43.98F, -13F, -8.15F);

		bodyModel[216].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 254
		bodyModel[216].setRotationPoint(-43.98F, -14F, -8.15F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 255
		bodyModel[217].setRotationPoint(-43.98F, -14F, -7.15F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[218].setRotationPoint(-47.5F, -14F, 8F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[219].setRotationPoint(-49.5F, -14F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 206
		bodyModel[220].setRotationPoint(-49.5F, -14F, 4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[221].setRotationPoint(-49.5F, -14F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 247
		bodyModel[222].setRotationPoint(-47.5F, -14F, -11F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 61
		bodyModel[223].setRotationPoint(-47.5F, -8F, -11F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[224].setRotationPoint(42.75F, -24F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[225].setRotationPoint(44F, -24F, -2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[226].setRotationPoint(44F, -24F, 0F);

		bodyModel[227].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[227].setRotationPoint(29.5F, -4F, -11F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[228].setRotationPoint(-24.5F, -4F, -11F);

		bodyModel[229].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[229].setRotationPoint(31.5F, -4F, 11F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Fireman side door
		bodyModel[230].setRotationPoint(-24.5F, -4F, 11F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Fireman side door
		bodyModel[231].setRotationPoint(-8.5F, -5F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[232].setRotationPoint(-20.5F, -23F, -11.75F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[233].setRotationPoint(-24.5F, -23F, -11.75F);

		bodyModel[234].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[234].setRotationPoint(-20.5F, -23F, 10.75F);

		bodyModel[235].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 72
		bodyModel[235].setRotationPoint(-24.5F, -23F, 10.75F);

		bodyModel[236].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 72
		bodyModel[236].setRotationPoint(-4.5F, -19F, -11.75F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 72
		bodyModel[237].setRotationPoint(-8.5F, -19F, -11.75F);

		bodyModel[238].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[238].setRotationPoint(33.5F, -19F, -11.75F);

		bodyModel[239].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[239].setRotationPoint(29.5F, -19F, -11.75F);

		bodyModel[240].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[240].setRotationPoint(35.5F, -19F, 10.75F);

		bodyModel[241].addBox(0F, 0F, 0F, 0, 16, 1, 0F); // Box 72
		bodyModel[241].setRotationPoint(31.5F, -19F, 10.75F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[242].setRotationPoint(-29F, -27.5F, -0.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[243].setRotationPoint(-30.5F, -28.5F, -1.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[244].setRotationPoint(-29F, -28.5F, -0.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[245].setRotationPoint(-29.75F, -28.5F, 0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[246].setRotationPoint(-37F, -28.5F, -0.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[247].setRotationPoint(-35F, -28.25F, 0.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[248].setRotationPoint(-36F, -28.25F, -1.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[249].setRotationPoint(-34.5F, -27.5F, -0.5F);

		bodyModel[250].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 348
		bodyModel[250].setRotationPoint(-28F, -29F, -5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[251].setRotationPoint(41.75F, -24F, 8.5F);
		bodyModel[251].rotateAngleY = 0.33161256F;

		bodyModel[252].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[252].setRotationPoint(41.75F, -24F, -8.5F);
		bodyModel[252].rotateAngleY = -0.33161256F;

		bodyModel[253].addBox(0F, 0F, 0F, 10, 3, 8, 0F); // Box 279
		bodyModel[253].setRotationPoint(12.5F, -28.75F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, -1F, 0, 6, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[254].setRotationPoint(42.5F, -14F, -10F);
		bodyModel[254].rotateAngleY = -0.33161256F;

		bodyModel[255].addBox(0F, 0F, -1F, 0, 7, 1, 0F); // Box 241
		bodyModel[255].setRotationPoint(42.5F, -8F, -10F);
		bodyModel[255].rotateAngleY = -0.33161256F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[256].setRotationPoint(43.15F, -13F, 7.1F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 365
		bodyModel[257].setRotationPoint(43.15F, -14F, 7.1F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 244
		bodyModel[258].setRotationPoint(42.15F, -14F, 7.1F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 251
		bodyModel[259].setRotationPoint(42.5F, -8F, 10F);
		bodyModel[259].rotateAngleY = 0.33161256F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[260].setRotationPoint(42.5F, -14F, 10F);
		bodyModel[260].rotateAngleY = 0.33161256F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 253
		bodyModel[261].setRotationPoint(43.15F, -13F, -8.1F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 254
		bodyModel[262].setRotationPoint(43.15F, -14F, -8.1F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 255
		bodyModel[263].setRotationPoint(42.15F, -14F, -7.1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 345
		bodyModel[264].setRotationPoint(-48.5F, -5F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F); // Box 345
		bodyModel[265].setRotationPoint(-48.5F, -5F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[266].setRotationPoint(-48.5F, -5F, 7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176 lamp
		bodyModel[267].setRotationPoint(-46F, -16.25F, -0.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 177 lamp
		bodyModel[268].setRotationPoint(-46F, -14.5F, -0.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Light mount
		bodyModel[269].setRotationPoint(-45.75F, -16.6F, -1F);
	}

	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ModelRenderHelper.renderLocomotiveModelWithoutBeacon(bodyModel, entity, f5);
		
		if (GetColor(entity) == 15 ||GetColor(entity) == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2F, -0.32F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.95F, -0.32F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

	public ModelRendererTurbo ModelF45[];

}