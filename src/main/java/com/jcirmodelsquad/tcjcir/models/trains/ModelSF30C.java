//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.04.2020 - 14:46:40
// Last changed on: 08.04.2020 - 14:46:40

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB3;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSF30C extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSF30C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[226];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 35
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 106
		bodyModel[20] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 107
		bodyModel[21] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 122
		bodyModel[22] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 123
		bodyModel[23] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 144
		bodyModel[24] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 145
		bodyModel[25] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 149
		bodyModel[27] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 150
		bodyModel[28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 152
		bodyModel[29] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 155
		bodyModel[30] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 157
		bodyModel[31] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 158
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 159
		bodyModel[33] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 160
		bodyModel[34] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 161
		bodyModel[35] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 162
		bodyModel[36] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 163
		bodyModel[37] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 164
		bodyModel[38] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 165
		bodyModel[39] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 166
		bodyModel[40] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 167
		bodyModel[41] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 169
		bodyModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 43
		bodyModel[45] = new ModelRendererTurbo(this, 417, 49, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[46] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 118 liveryimg 2
		bodyModel[47] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 175
		bodyModel[48] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 180
		bodyModel[49] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 195
		bodyModel[50] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 196
		bodyModel[51] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 198
		bodyModel[52] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 203
		bodyModel[54] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 204
		bodyModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 205
		bodyModel[56] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 208
		bodyModel[57] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 211
		bodyModel[58] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 214
		bodyModel[59] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 215
		bodyModel[60] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 218
		bodyModel[61] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 220
		bodyModel[62] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 230
		bodyModel[63] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 232
		bodyModel[64] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 233
		bodyModel[65] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 234
		bodyModel[66] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 143
		bodyModel[67] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 61
		bodyModel[68] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 62
		bodyModel[69] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 63
		bodyModel[70] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 246
		bodyModel[72] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 247
		bodyModel[73] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 249
		bodyModel[74] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 250
		bodyModel[75] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 251
		bodyModel[76] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 256
		bodyModel[77] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 257
		bodyModel[78] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 258
		bodyModel[79] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 259
		bodyModel[80] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 260
		bodyModel[81] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 267
		bodyModel[82] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 268
		bodyModel[83] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 269
		bodyModel[84] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 148
		bodyModel[85] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 150
		bodyModel[86] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 152
		bodyModel[87] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 275
		bodyModel[88] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 276
		bodyModel[89] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 277
		bodyModel[90] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 285
		bodyModel[91] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 288
		bodyModel[92] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 297
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 298
		bodyModel[94] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 300
		bodyModel[95] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 301
		bodyModel[96] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 303
		bodyModel[97] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 19
		bodyModel[98] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 19
		bodyModel[99] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 305
		bodyModel[100] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 305
		bodyModel[101] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 19
		bodyModel[102] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 19
		bodyModel[103] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 19
		bodyModel[104] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 305
		bodyModel[105] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 305
		bodyModel[106] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 440
		bodyModel[107] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 441
		bodyModel[108] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 19
		bodyModel[109] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 19
		bodyModel[110] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 2
		bodyModel[111] = new ModelRendererTurbo(this, 17, 65, textureX, textureY, "lamp"); // Box 240 liveryimg 2
		bodyModel[112] = new ModelRendererTurbo(this, 97, 65, textureX, textureY, "lamp"); // Box 241 liveryimg 2
		bodyModel[113] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 74
		bodyModel[115] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 78
		bodyModel[116] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 78
		bodyModel[117] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 261
		bodyModel[118] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 262
		bodyModel[119] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 263
		bodyModel[120] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 265
		bodyModel[121] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 266
		bodyModel[122] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 55
		bodyModel[123] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 275
		bodyModel[124] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 276
		bodyModel[125] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 277
		bodyModel[126] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 278
		bodyModel[127] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 279
		bodyModel[128] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 280
		bodyModel[129] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 281
		bodyModel[130] = new ModelRendererTurbo(this, 257, 49, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[131] = new ModelRendererTurbo(this, 377, 49, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[132] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 224
		bodyModel[133] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 225
		bodyModel[134] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 226
		bodyModel[135] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 227
		bodyModel[136] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 228
		bodyModel[137] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 229
		bodyModel[138] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 230
		bodyModel[139] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 231
		bodyModel[140] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 232
		bodyModel[141] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 233
		bodyModel[142] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 336
		bodyModel[143] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 4
		bodyModel[144] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 236
		bodyModel[145] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 243
		bodyModel[146] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 244
		bodyModel[147] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 249
		bodyModel[148] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 250
		bodyModel[149] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 241
		bodyModel[150] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 242
		bodyModel[151] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 243
		bodyModel[152] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 244
		bodyModel[153] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 245
		bodyModel[154] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 246
		bodyModel[155] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 247
		bodyModel[156] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 248
		bodyModel[157] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 249
		bodyModel[158] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 250
		bodyModel[159] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 251
		bodyModel[160] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 252
		bodyModel[161] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 253
		bodyModel[162] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 9
		bodyModel[163] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 10
		bodyModel[164] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 15
		bodyModel[165] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 21
		bodyModel[166] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 314 door swing right
		bodyModel[167] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 315 door swing right
		bodyModel[168] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 350
		bodyModel[169] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 351
		bodyModel[170] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 262
		bodyModel[171] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 263
		bodyModel[172] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 264
		bodyModel[173] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 265
		bodyModel[174] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 81
		bodyModel[175] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 81
		bodyModel[176] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 268
		bodyModel[177] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 269
		bodyModel[178] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 270
		bodyModel[179] = new ModelRendererTurbo(this, 265, 73, textureX, textureY, "lamp"); // Box 271 lamp
		bodyModel[180] = new ModelRendererTurbo(this, 273, 73, textureX, textureY, "lamp"); // Box 272 lamp
		bodyModel[181] = new ModelRendererTurbo(this, 505, 73, textureX, textureY, "lamp"); // Box 273 lamp
		bodyModel[182] = new ModelRendererTurbo(this, 193, 81, textureX, textureY, "lamp"); // Box 274 lamp
		bodyModel[183] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 275
		bodyModel[184] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 276
		bodyModel[185] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 277
		bodyModel[186] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 278
		bodyModel[187] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 279
		bodyModel[188] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 280
		bodyModel[189] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 281
		bodyModel[190] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 282
		bodyModel[191] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 283
		bodyModel[192] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 284
		bodyModel[193] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 285
		bodyModel[194] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 286
		bodyModel[195] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 287
		bodyModel[196] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 288
		bodyModel[197] = new ModelRendererTurbo(this, 313, 81, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[198] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 165
		bodyModel[199] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 291
		bodyModel[200] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 292
		bodyModel[201] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 294
		bodyModel[202] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 295
		bodyModel[203] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 296
		bodyModel[204] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 297
		bodyModel[205] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 298
		bodyModel[206] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 299
		bodyModel[207] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 300
		bodyModel[208] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 4
		bodyModel[209] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 4
		bodyModel[210] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 4
		bodyModel[211] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 4
		bodyModel[212] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 4
		bodyModel[213] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 4
		bodyModel[214] = new ModelRendererTurbo(this, 401, 97, textureX, textureY, "lamp"); // Box 359 lamp
		bodyModel[215] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 360
		bodyModel[216] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 361
		bodyModel[217] = new ModelRendererTurbo(this, 257, 105, textureX, textureY, "lamp"); // Box 362 lamp
		bodyModel[218] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 218
		bodyModel[219] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 219
		bodyModel[220] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 220
		bodyModel[221] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 221
		bodyModel[222] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 222
		bodyModel[223] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 223
		bodyModel[224] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 224
		bodyModel[225] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 225

		bodyModel[0].addBox(0F, 0F, 0F, 87, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-36F, -7F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 23, 7, 14, 0F); // Box 2
		bodyModel[1].setRotationPoint(-4F, -4F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[2].setRotationPoint(-40.01F, -7F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 68, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-17F, -27F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 8
		bodyModel[4].setRotationPoint(-40F, -7F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 23, 4, 4, 0F); // Box 10
		bodyModel[5].setRotationPoint(-4F, -4F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[6].setRotationPoint(34F, -29.5F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(20F, -3F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		bodyModel[8].setRotationPoint(34F, -29.5F, 0F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-30F, -11F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 33
		bodyModel[10].setRotationPoint(-34F, -11F, 6F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 4, 4, 0F); // Box 35
		bodyModel[11].setRotationPoint(-17F, -11F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 36
		bodyModel[12].setRotationPoint(-17F, -11F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 37
		bodyModel[13].setRotationPoint(-12F, -9F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 38
		bodyModel[14].setRotationPoint(-4F, -9F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 61
		bodyModel[15].setRotationPoint(-44F, -3F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[16].setRotationPoint(-36F, -5F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[17].setRotationPoint(-30F, -28F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[18].setRotationPoint(-30F, -28F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[19].setRotationPoint(-18F, -28F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[20].setRotationPoint(-30F, -28F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[21].setRotationPoint(-29F, -25F, 11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[22].setRotationPoint(-29F, -25F, -12F);

		bodyModel[23].addBox(0F, 0F, 0F, 17, 2, 2, 0F); // Box 144
		bodyModel[23].setRotationPoint(34F, -28F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 17, 2, 2, 0F); // Box 145
		bodyModel[24].setRotationPoint(34F, -28F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 22, 2, 0F); // Box 148
		bodyModel[25].setRotationPoint(51F, -28F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 22, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[26].setRotationPoint(51F, -28F, 1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 22, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[27].setRotationPoint(51F, -28F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[28].setRotationPoint(51F, -29F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.4F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[29].setRotationPoint(51F, -29F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[30].setRotationPoint(-4F, 0F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 158
		bodyModel[31].setRotationPoint(-4F, 0F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 23, 4, 4, 0F); // Box 159
		bodyModel[32].setRotationPoint(-4F, -4F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[33].setRotationPoint(-29F, -29F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[34].setRotationPoint(-30F, -29F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[35].setRotationPoint(-18F, -29F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[36].setRotationPoint(-30F, -29F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[37].setRotationPoint(-18F, -29F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[38].setRotationPoint(-29F, -28F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[39].setRotationPoint(-18F, -28F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[40].setRotationPoint(-29F, -28F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(-18F, -28F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[42].setRotationPoint(-29F, -29F, 0F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[43].setRotationPoint(-31F, -29F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[44].setRotationPoint(-31F, -28F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[45].setRotationPoint(-30.05F, -28F, -6F);
		bodyModel[45].rotateAngleY = 0.19198622F;

		bodyModel[46].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2
		bodyModel[46].setRotationPoint(-30.05F, -28F, 6F);
		bodyModel[46].rotateAngleY = -0.19198622F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[47].setRotationPoint(-31F, -28F, 1F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 10, 14, 0F); // Box 180
		bodyModel[48].setRotationPoint(-30F, -20F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 195
		bodyModel[49].setRotationPoint(-37F, -5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[50].setRotationPoint(-37F, 2F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[51].setRotationPoint(-37F, 2F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[52].setRotationPoint(-40F, 1F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 203
		bodyModel[53].setRotationPoint(-40F, -7F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[54].setRotationPoint(-40F, -2F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 205
		bodyModel[55].setRotationPoint(-40F, 3F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[56].setRotationPoint(-42F, -7F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 211
		bodyModel[57].setRotationPoint(50F, -5F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 214
		bodyModel[58].setRotationPoint(51F, -5F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 215
		bodyModel[59].setRotationPoint(52F, -7F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[60].setRotationPoint(51F, 2F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[61].setRotationPoint(51F, 2F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 230
		bodyModel[62].setRotationPoint(55F, -3F, -1.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 18, 0, 0F); // Box 232
		bodyModel[63].setRotationPoint(-37F, -19F, 11F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 233
		bodyModel[64].setRotationPoint(-37F, -20F, 11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[65].setRotationPoint(-34F, -19F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[66].setRotationPoint(-40.01F, -15F, -8F);
		bodyModel[66].rotateAngleY = -3.14159265F;

		bodyModel[67].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[67].setRotationPoint(-40F, -7F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[68].setRotationPoint(-40.01F, -15F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[69].setRotationPoint(-40F, -7F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 83
		bodyModel[70].setRotationPoint(-42F, -15F, -8F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 246
		bodyModel[71].setRotationPoint(-40F, -4F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 247
		bodyModel[72].setRotationPoint(-40F, -4F, 9F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 249
		bodyModel[73].setRotationPoint(-34F, -19F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 250
		bodyModel[74].setRotationPoint(-36F, -20F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 87, 2, 16, 0F); // Box 251
		bodyModel[75].setRotationPoint(-36F, -5F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 256
		bodyModel[76].setRotationPoint(55.01F, -7F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 257
		bodyModel[77].setRotationPoint(55.01F, -4F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 258
		bodyModel[78].setRotationPoint(55.01F, -4F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 259
		bodyModel[79].setRotationPoint(55.01F, -7F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[80].setRotationPoint(55F, -15F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[81].setRotationPoint(55.01F, -15F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[82].setRotationPoint(55F, -15F, -8F);
		bodyModel[82].rotateAngleY = -3.14159265F;

		bodyModel[83].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 269
		bodyModel[83].setRotationPoint(55.01F, -7F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 8, 9, 2, 0F); // Box 148
		bodyModel[84].setRotationPoint(-30F, -18.01F, -3F);
		bodyModel[84].rotateAngleY = -0.61086524F;

		bodyModel[85].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150
		bodyModel[85].setRotationPoint(-27F, -20.01F, -5.25F);
		bodyModel[85].rotateAngleY = -0.57595865F;

		bodyModel[86].addBox(0F, 0F, 0F, 2, 10, 6, 0F); // Box 152
		bodyModel[86].setRotationPoint(-29F, -19.01F, -3F);
		bodyModel[86].rotateAngleY = 0.15707963F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275
		bodyModel[87].setRotationPoint(-29F, -19F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 276
		bodyModel[88].setRotationPoint(-34F, -18F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[89].setRotationPoint(-33F, -17F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 285
		bodyModel[90].setRotationPoint(-17F, -19F, 11F);

		bodyModel[91].addBox(0F, 0F, 0F, 51, 8, 0, 0F); // Box 288
		bodyModel[91].setRotationPoint(1F, -15F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 297
		bodyModel[92].setRotationPoint(-3F, -19F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 298
		bodyModel[93].setRotationPoint(-10F, -19F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 300
		bodyModel[94].setRotationPoint(-17F, -19F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 11, 0, 0F); // Box 301
		bodyModel[95].setRotationPoint(-12F, -18F, -11.01F);

		bodyModel[96].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 303
		bodyModel[96].setRotationPoint(-6F, -15F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[97].setRotationPoint(21F, -3F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[98].setRotationPoint(19F, -3F, -9F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[99].setRotationPoint(20F, -5F, -9.01F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[100].setRotationPoint(20F, -5F, 9.01F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[101].setRotationPoint(-6F, -3F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[102].setRotationPoint(-5F, -3F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[103].setRotationPoint(-7F, -3F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[104].setRotationPoint(-6F, -5F, -9.01F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[105].setRotationPoint(-6F, -5F, 9.01F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[106].setRotationPoint(-23F, -3F, -1F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[107].setRotationPoint(36F, -3F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[108].setRotationPoint(0F, -5F, -11.75F);
		bodyModel[108].rotateAngleX = 0.71558499F;

		bodyModel[109].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[109].setRotationPoint(0F, -5F, 11.75F);
		bodyModel[109].rotateAngleX = -0.71558499F;

		bodyModel[110].addBox(0F, -2F, 0F, 0, 2, 20, 0F); // Box 2
		bodyModel[110].setRotationPoint(55.05F, -3.75F, -10F);
		bodyModel[110].rotateAngleZ = -0.78539816F;

		bodyModel[111].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 240 liveryimg 2
		bodyModel[111].setRotationPoint(51.25F, -24F, 6F);
		bodyModel[111].rotateAngleY = 0.15707963F;

		bodyModel[112].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 241 liveryimg 2
		bodyModel[112].setRotationPoint(51.25F, -24F, -6F);
		bodyModel[112].rotateAngleY = -0.15707963F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[113].setRotationPoint(-6F, -3F, 9.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[114].setRotationPoint(-6F, -4F, 9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[115].setRotationPoint(-5.75F, -2.5F, 9.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[116].setRotationPoint(-5.75F, -5F, 7.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 261
		bodyModel[117].setRotationPoint(51F, -5F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 262
		bodyModel[118].setRotationPoint(51F, -7F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[119].setRotationPoint(50F, -5F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[120].setRotationPoint(-36F, -5F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 266
		bodyModel[121].setRotationPoint(-37F, -5F, 8F);

		bodyModel[122].addBox(0F, 0F, 0F, 7, 13, 12, 0F); // Box 55
		bodyModel[122].setRotationPoint(-37F, -20F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 275
		bodyModel[123].setRotationPoint(-37F, -7F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[124].setRotationPoint(-37F, -20F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 277
		bodyModel[125].setRotationPoint(-37F, -20F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 278
		bodyModel[126].setRotationPoint(-42F, -7F, 8F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 279
		bodyModel[127].setRotationPoint(-42F, -7F, -8F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 280
		bodyModel[128].setRotationPoint(-42F, -15F, -8F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 281
		bodyModel[129].setRotationPoint(-42F, -15F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[130].setRotationPoint(-31.25F, -29F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[131].setRotationPoint(-31.25F, -27F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[132].setRotationPoint(-37F, -21F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[133].setRotationPoint(-37F, -21F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[134].setRotationPoint(-38F, -20F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 227
		bodyModel[135].setRotationPoint(-34F, -11F, 10F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 228
		bodyModel[136].setRotationPoint(-34F, -9F, 7F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 229
		bodyModel[137].setRotationPoint(-33F, -11F, 7F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 230
		bodyModel[138].setRotationPoint(-34F, -11F, -7F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 231
		bodyModel[139].setRotationPoint(-34F, -11F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 232
		bodyModel[140].setRotationPoint(-34F, -9F, -10F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 233
		bodyModel[141].setRotationPoint(-33F, -11F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[142].setRotationPoint(-41F, -3.5F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[143].setRotationPoint(-40F, -5F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 236
		bodyModel[144].setRotationPoint(50F, -5F, -3F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 243
		bodyModel[145].setRotationPoint(52F, -15F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[146].setRotationPoint(52F, -9F, 10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[147].setRotationPoint(52F, -9F, -11.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 250
		bodyModel[148].setRotationPoint(52F, -15F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 241
		bodyModel[149].setRotationPoint(52.01F, -5F, -11F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 4, 2, 0F); // Box 242
		bodyModel[150].setRotationPoint(52.01F, -5F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[151].setRotationPoint(55F, -3.5F, -2F);

		bodyModel[152].addBox(0F, -2F, 0F, 0, 2, 6, 0F); // Box 244
		bodyModel[152].setRotationPoint(57.05F, -3F, -3F);
		bodyModel[152].rotateAngleZ = 0.78539816F;

		bodyModel[153].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 245
		bodyModel[153].setRotationPoint(-40.01F, 2F, -11F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 246
		bodyModel[154].setRotationPoint(55F, 2F, -11F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		bodyModel[155].setRotationPoint(-40F, -5F, -10F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 248
		bodyModel[156].setRotationPoint(-40F, -7F, 7F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 249
		bodyModel[157].setRotationPoint(-40F, -5F, 8F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 250
		bodyModel[158].setRotationPoint(-40F, -2F, 8F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 251
		bodyModel[159].setRotationPoint(-40F, 1F, 8F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 252
		bodyModel[160].setRotationPoint(-40F, 3F, 9F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 253
		bodyModel[161].setRotationPoint(-34F, -18F, 5.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 9
		bodyModel[162].setRotationPoint(-30F, -25F, 10F);

		bodyModel[163].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 10
		bodyModel[163].setRotationPoint(-29F, -25F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 15
		bodyModel[164].setRotationPoint(-30F, -25F, -7F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 21
		bodyModel[165].setRotationPoint(-18F, -25F, -10F);

		bodyModel[166].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[166].setRotationPoint(-17.5F, -25F, 10.5F);

		bodyModel[167].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[167].setRotationPoint(-29.5F, -25F, -10.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[168].setRotationPoint(-27F, -23F, -12F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[169].setRotationPoint(-27F, -23F, 11F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 262
		bodyModel[170].setRotationPoint(-4F, -11F, 11F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 263
		bodyModel[171].setRotationPoint(27F, -30F, -3F);

		bodyModel[172].addBox(0F, 0F, 0F, 9, 18, 1, 0F); // Box 264
		bodyModel[172].setRotationPoint(25F, -25F, -8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[173].setRotationPoint(25F, -27F, -8F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 81
		bodyModel[174].setRotationPoint(-36F, -20F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,-1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1.5F, -1F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[175].setRotationPoint(-37F, -12F, -11.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 268
		bodyModel[176].setRotationPoint(-36F, -19F, -9.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 269
		bodyModel[177].setRotationPoint(-36F, -15F, -10F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 270
		bodyModel[178].setRotationPoint(-37F, -8F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 271 lamp
		bodyModel[179].setRotationPoint(-37.25F, -18.5F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 272 lamp
		bodyModel[180].setRotationPoint(-37.25F, -20.5F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 273 lamp
		bodyModel[181].setRotationPoint(51.25F, -23F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 274 lamp
		bodyModel[182].setRotationPoint(51.25F, -25F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[183].setRotationPoint(25F, -27F, 7F);

		bodyModel[184].addBox(0F, 0F, 0F, 9, 18, 1, 0F); // Box 276
		bodyModel[184].setRotationPoint(25F, -25F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 277
		bodyModel[185].setRotationPoint(-30.5F, -30F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[186].setRotationPoint(-32F, -31F, 0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[187].setRotationPoint(-31F, -31F, -0.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[188].setRotationPoint(-31.5F, -31F, -1.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 281
		bodyModel[189].setRotationPoint(-27.5F, -30F, 0F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 0, 12, 0F); // Box 282
		bodyModel[190].setRotationPoint(-20F, -30.01F, -6F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 283
		bodyModel[191].setRotationPoint(-19F, -30F, -6F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 284
		bodyModel[192].setRotationPoint(-19F, -30F, 6F);

		bodyModel[193].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 285
		bodyModel[193].setRotationPoint(-22F, -30F, -2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[194].setRotationPoint(-21F, -31F, 0F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 287
		bodyModel[195].setRotationPoint(-29F, -29F, -5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 288
		bodyModel[196].setRotationPoint(-28.5F, -29F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162 light
		bodyModel[197].setRotationPoint(-28.68F, -31F, -4.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[198].setRotationPoint(-28.5F, -30F, -4.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[199].setRotationPoint(51F, -29F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[200].setRotationPoint(34F, -26F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 294
		bodyModel[201].setRotationPoint(34F, -26F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[202].setRotationPoint(-17F, -28F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[203].setRotationPoint(-17F, -28F, 2F);

		bodyModel[204].addBox(0F, 0F, 0F, 51, 1, 4, 0F); // Box 297
		bodyModel[204].setRotationPoint(-17F, -28F, -2F);

		bodyModel[205].addBox(0F, 0F, 0F, 17, 1, 14, 0F); // Box 298
		bodyModel[205].setRotationPoint(34F, -28F, -7F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 299
		bodyModel[206].setRotationPoint(-17F, -29F, -1.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 300
		bodyModel[207].setRotationPoint(-14F, -29F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[208].setRotationPoint(-43F, 0F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[209].setRotationPoint(-43F, -1F, 2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[210].setRotationPoint(-43F, 1F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[211].setRotationPoint(-43F, 0F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[212].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[213].setRotationPoint(-43F, 1F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 lamp
		bodyModel[214].setRotationPoint(-41.25F, -5F, -8.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[215].setRotationPoint(-41F, -5F, -8.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[216].setRotationPoint(-41F, -5F, 6.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 lamp
		bodyModel[217].setRotationPoint(-41.25F, -5F, 6.75F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 218
		bodyModel[218].setRotationPoint(52F, 3F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 219
		bodyModel[219].setRotationPoint(52F, 1F, -10F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 220
		bodyModel[220].setRotationPoint(52F, -2F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 221
		bodyModel[221].setRotationPoint(52F, -5F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 222
		bodyModel[222].setRotationPoint(52F, 3F, 9F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 223
		bodyModel[223].setRotationPoint(52F, 1F, 8F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 224
		bodyModel[224].setRotationPoint(52F, -2F, 8F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 225
		bodyModel[225].setRotationPoint(52F, -5F, 8F);
	}
	ModelFB3 theTrucks = new ModelFB3();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 226; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (GetColor(entity) == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Grey.png"));
		}
		//when you so lazy you just copy the code for multi colors and set it up to give the same result kEk
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.375F, -0.3F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-2.31F, -0.3F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public ModelRendererTurbo SF30CModel[];
}