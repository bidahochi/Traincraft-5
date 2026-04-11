//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: C855b
// Model Creator: Bidahochi
// Created on: 06.03.2023 - 16:10:05
// Last changed on: 06.03.2023 - 16:10:05

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnewSmol;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.api.Locomotive;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelC855b extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelC855b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[259];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 111
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 239
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 35
		bodyModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY, "lamp"); // Box 87 headlight front vertical
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY, "lamp"); // Box 88 headlight front vertical
		bodyModel[12] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 496
		bodyModel[14] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 497
		bodyModel[15] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 498
		bodyModel[16] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 100
		bodyModel[17] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 101
		bodyModel[18] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 102
		bodyModel[19] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 104
		bodyModel[20] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 105
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 107
		bodyModel[22] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 108
		bodyModel[23] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 109
		bodyModel[24] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 110
		bodyModel[25] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 111
		bodyModel[26] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 112
		bodyModel[27] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 113
		bodyModel[28] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 114
		bodyModel[29] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 115
		bodyModel[30] = new ModelRendererTurbo(this, 313, 9, textureX, textureY, "lamp"); // Box 163 headlight r
		bodyModel[31] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 94
		bodyModel[32] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 95
		bodyModel[33] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 96
		bodyModel[34] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 97
		bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 98
		bodyModel[36] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 99
		bodyModel[37] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 101
		bodyModel[39] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 102
		bodyModel[40] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 104
		bodyModel[42] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 433, 33, textureX, textureY, "cull"); // Box 119 ladder cull
		bodyModel[44] = new ModelRendererTurbo(this, 225, 17, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[45] = new ModelRendererTurbo(this, 305, 57, textureX, textureY, "cull"); // Box 121 ladder cull
		bodyModel[46] = new ModelRendererTurbo(this, 409, 17, textureX, textureY, "cull"); // Box 122 cull
		bodyModel[47] = new ModelRendererTurbo(this, 33, 65, textureX, textureY, "cull"); // Box 119 ladder cull
		bodyModel[48] = new ModelRendererTurbo(this, 457, 17, textureX, textureY, "cull"); // Box 120 cull
		bodyModel[49] = new ModelRendererTurbo(this, 57, 89, textureX, textureY, "cull"); // Box 121 ladder cull
		bodyModel[50] = new ModelRendererTurbo(this, 473, 17, textureX, textureY, "cull"); // Box 122 cull
		bodyModel[51] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 127
		bodyModel[52] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 128
		bodyModel[53] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 129
		bodyModel[54] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 130
		bodyModel[55] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 131
		bodyModel[56] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 134
		bodyModel[57] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 135
		bodyModel[58] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 137
		bodyModel[59] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 139
		bodyModel[61] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 140
		bodyModel[62] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 141
		bodyModel[63] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 142
		bodyModel[64] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 143
		bodyModel[65] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 144
		bodyModel[66] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 145
		bodyModel[67] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 146
		bodyModel[68] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 147
		bodyModel[69] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 149
		bodyModel[70] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 150
		bodyModel[71] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 151
		bodyModel[72] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 152
		bodyModel[73] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 153
		bodyModel[74] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 154
		bodyModel[75] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 155
		bodyModel[76] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 156
		bodyModel[77] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 157
		bodyModel[78] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 162
		bodyModel[79] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 163
		bodyModel[80] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 164
		bodyModel[81] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 563
		bodyModel[82] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 166
		bodyModel[83] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 167
		bodyModel[84] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 168
		bodyModel[85] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 169
		bodyModel[86] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 170
		bodyModel[87] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 173
		bodyModel[88] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 174
		bodyModel[89] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 175
		bodyModel[90] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 176
		bodyModel[91] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 177
		bodyModel[92] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 178
		bodyModel[93] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 179
		bodyModel[94] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 180
		bodyModel[95] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 181
		bodyModel[96] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 182
		bodyModel[97] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 183
		bodyModel[98] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 184
		bodyModel[99] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 185
		bodyModel[100] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 191
		bodyModel[104] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 192
		bodyModel[105] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 193
		bodyModel[106] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 194
		bodyModel[107] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 195
		bodyModel[108] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 196
		bodyModel[109] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 199
		bodyModel[110] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 200
		bodyModel[111] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 202
		bodyModel[112] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 203
		bodyModel[113] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 204
		bodyModel[114] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 205
		bodyModel[115] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 208
		bodyModel[116] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 209
		bodyModel[117] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 210
		bodyModel[118] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 211
		bodyModel[119] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 212
		bodyModel[120] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 213
		bodyModel[121] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 214
		bodyModel[122] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 215
		bodyModel[123] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 216
		bodyModel[124] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 217
		bodyModel[125] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 218
		bodyModel[126] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 219
		bodyModel[127] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 220
		bodyModel[128] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 221
		bodyModel[129] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 222 dont forget me please
		bodyModel[130] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 223 floor cover
		bodyModel[131] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 117
		bodyModel[132] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 225
		bodyModel[133] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 226
		bodyModel[134] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 500
		bodyModel[135] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 228
		bodyModel[136] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 229
		bodyModel[137] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 231
		bodyModel[138] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 232
		bodyModel[139] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 234
		bodyModel[140] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 235
		bodyModel[141] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 236
		bodyModel[142] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 237
		bodyModel[143] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 238
		bodyModel[144] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 239
		bodyModel[145] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 240
		bodyModel[146] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 241
		bodyModel[147] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 242
		bodyModel[148] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 233
		bodyModel[149] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 234
		bodyModel[150] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 235
		bodyModel[151] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 246
		bodyModel[152] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 247
		bodyModel[153] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 248
		bodyModel[154] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 249
		bodyModel[155] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 250
		bodyModel[156] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 251
		bodyModel[157] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 253
		bodyModel[158] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 254
		bodyModel[159] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 255
		bodyModel[160] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 256
		bodyModel[161] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 257
		bodyModel[162] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 258
		bodyModel[163] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 259
		bodyModel[164] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 260
		bodyModel[165] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 261
		bodyModel[166] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 262
		bodyModel[167] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 263
		bodyModel[168] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 264
		bodyModel[169] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 265
		bodyModel[170] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 266
		bodyModel[171] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 267
		bodyModel[172] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 268
		bodyModel[173] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 269
		bodyModel[174] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 270
		bodyModel[175] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 271
		bodyModel[176] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 272
		bodyModel[177] = new ModelRendererTurbo(this, 193, 113, textureX, textureY, "cull"); // Box 273 cull
		bodyModel[178] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 274
		bodyModel[179] = new ModelRendererTurbo(this, 225, 113, textureX, textureY, "cull"); // Box 275 cull
		bodyModel[180] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 280
		bodyModel[181] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 281
		bodyModel[182] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 282
		bodyModel[183] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 283
		bodyModel[184] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 284
		bodyModel[185] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 285
		bodyModel[186] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 286
		bodyModel[187] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 287
		bodyModel[188] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 288
		bodyModel[189] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 289
		bodyModel[190] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 293
		bodyModel[191] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 294
		bodyModel[192] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 295
		bodyModel[193] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 296
		bodyModel[194] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 364 prime base
		bodyModel[195] = new ModelRendererTurbo(this, 329, 105, textureX, textureY, "prime1"); // Box 6 PRIME1-1
		bodyModel[196] = new ModelRendererTurbo(this, 345, 105, textureX, textureY, "prime3"); // Box 7 PRIME1-3
		bodyModel[197] = new ModelRendererTurbo(this, 401, 105, textureX, textureY, "prime2"); // Box 8 PRIME1-2
		bodyModel[198] = new ModelRendererTurbo(this, 25, 113, textureX, textureY, "prime4"); // Box 9 PRIME1-4
		bodyModel[199] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 311
		bodyModel[200] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 312
		bodyModel[201] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 281
		bodyModel[202] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "lamp"); // Box 282 headlight r 2
		bodyModel[203] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 283
		bodyModel[204] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 284
		bodyModel[205] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 276 lift2
		bodyModel[206] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 277 lift2
		bodyModel[207] = new ModelRendererTurbo(this, 111, 188, textureX, textureY); // Box 301
		bodyModel[208] = new ModelRendererTurbo(this, 96, 184, textureX, textureY, "cull"); // Box 302 cull
		bodyModel[209] = new ModelRendererTurbo(this, 111, 188, textureX, textureY); // Box 303
		bodyModel[210] = new ModelRendererTurbo(this, 96, 184, textureX, textureY, "cull"); // Box 304 cull
		bodyModel[211] = new ModelRendererTurbo(this, 151, 182, textureX, textureY); // Box 305
		bodyModel[212] = new ModelRendererTurbo(this, 151, 182, textureX, textureY); // Box 306
		bodyModel[213] = new ModelRendererTurbo(this, 119, 189, textureX, textureY); // Box 297
		bodyModel[214] = new ModelRendererTurbo(this, 119, 189, textureX, textureY); // Box 298
		bodyModel[215] = new ModelRendererTurbo(this, 2, 200, textureX, textureY); // Box 299
		bodyModel[216] = new ModelRendererTurbo(this, 2, 220, textureX, textureY); // Box 300
		bodyModel[217] = new ModelRendererTurbo(this, 119, 201, textureX, textureY); // Box 301
		bodyModel[218] = new ModelRendererTurbo(this, 119, 201, textureX, textureY); // Box 302
		bodyModel[219] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 303
		bodyModel[220] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 304
		bodyModel[221] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 306
		bodyModel[222] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 307
		bodyModel[223] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 308
		bodyModel[224] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 309
		bodyModel[225] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 310
		bodyModel[226] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 311
		bodyModel[227] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 312
		bodyModel[228] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 313
		bodyModel[229] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 314
		bodyModel[230] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 315
		bodyModel[231] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 316
		bodyModel[232] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 317
		bodyModel[233] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 318
		bodyModel[234] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 319
		bodyModel[235] = new ModelRendererTurbo(this, 162, 206, textureX, textureY); // Box 324
		bodyModel[236] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 325
		bodyModel[237] = new ModelRendererTurbo(this, 272, 203, textureX, textureY); // Box 326
		bodyModel[238] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 327
		bodyModel[239] = new ModelRendererTurbo(this, 198, 204, textureX, textureY); // Box 328
		bodyModel[240] = new ModelRendererTurbo(this, 237, 202, textureX, textureY); // Box 329
		bodyModel[241] = new ModelRendererTurbo(this, 237, 210, textureX, textureY); // Box 330
		bodyModel[242] = new ModelRendererTurbo(this, 253, 211, textureX, textureY); // Box 331
		bodyModel[243] = new ModelRendererTurbo(this, 297, 196, textureX, textureY); // Box 332
		bodyModel[244] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 333
		bodyModel[245] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 334
		bodyModel[246] = new ModelRendererTurbo(this, 343, 201, textureX, textureY); // Box 335
		bodyModel[247] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 336
		bodyModel[248] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 337
		bodyModel[249] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 338
		bodyModel[250] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 339
		bodyModel[251] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 340
		bodyModel[252] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 341
		bodyModel[253] = new ModelRendererTurbo(this, 305, 222, textureX, textureY); // Box 342
		bodyModel[254] = new ModelRendererTurbo(this, 325, 222, textureX, textureY); // Box 343
		bodyModel[255] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 344
		bodyModel[256] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 345
		bodyModel[257] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 346
		bodyModel[258] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 347

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[0].setRotationPoint(-65F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 111
		bodyModel[1].setRotationPoint(62F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 81, 2, 22, 0F); // Box 0
		bodyModel[2].setRotationPoint(-39F, -4F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[3].setRotationPoint(-54.5F, 0F, -3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(-60.5F, 3F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[5].setRotationPoint(-57.5F, 2F, -3F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 28
		bodyModel[6].setRotationPoint(-25.5F, 1.5F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 29
		bodyModel[7].setRotationPoint(-20.5F, 2.5F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 31
		bodyModel[8].setRotationPoint(17.5F, 2.5F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[9].setRotationPoint(57.5F, 3F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 87 headlight front vertical
		bodyModel[10].setRotationPoint(-60.75F, -23.5F, -5.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 88 headlight front vertical
		bodyModel[11].setRotationPoint(-60.75F, -21.5F, -5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 99, 20, 14, 0F); // Box 2
		bodyModel[12].setRotationPoint(-44F, -23.5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 38, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[13].setRotationPoint(-44F, -24.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 38, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[14].setRotationPoint(-44F, -24.5F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 38, 1, 4, 0F); // Box 498
		bodyModel[15].setRotationPoint(-44F, -24.5F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 100
		bodyModel[16].setRotationPoint(51F, -4F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 101
		bodyModel[17].setRotationPoint(62F, -8F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 20, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 102
		bodyModel[18].setRotationPoint(55F, -23.5F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 104
		bodyModel[19].setRotationPoint(60F, -9F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 105
		bodyModel[20].setRotationPoint(60F, -10F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 107
		bodyModel[21].setRotationPoint(64F, -18F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[22].setRotationPoint(64F, -18F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 39, 1, 4, 0F); // Box 109
		bodyModel[23].setRotationPoint(21F, -24.5F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 34, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[24].setRotationPoint(21F, -24.5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 34, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[25].setRotationPoint(21F, -24.5F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		bodyModel[26].setRotationPoint(55F, -24.5F, 2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[27].setRotationPoint(55F, -24.5F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 114
		bodyModel[28].setRotationPoint(63F, -16F, -5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 115
		bodyModel[29].setRotationPoint(63F, -16F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 headlight r
		bodyModel[30].setRotationPoint(59.25F, -23.5F, 3.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 81, 2, 12, 0F); // Box 94
		bodyModel[31].setRotationPoint(-39F, -2F, -6F);

		bodyModel[32].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 95
		bodyModel[32].setRotationPoint(-54.5F, 1F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[33].setRotationPoint(-28.5F, 1F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[34].setRotationPoint(25.5F, 1F, -3F);

		bodyModel[35].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 98
		bodyModel[35].setRotationPoint(20.5F, 1.5F, -4F);

		bodyModel[36].addBox(0F, 0F, 0F, 26, 3, 6, 0F); // Box 99
		bodyModel[36].setRotationPoint(28.5F, 1F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 100
		bodyModel[37].setRotationPoint(36.5F, 0F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		bodyModel[38].setRotationPoint(54.5F, 2F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 102
		bodyModel[39].setRotationPoint(-34F, -0.5F, -2.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 103
		bodyModel[40].setRotationPoint(-34F, 0.5F, -2.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 104
		bodyModel[41].setRotationPoint(29F, 0.5F, -2.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 105
		bodyModel[42].setRotationPoint(29F, -0.5F, -2.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 119 ladder cull
		bodyModel[43].setRotationPoint(-35F, -2F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[44].setRotationPoint(-35F, -4F, 11F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 121 ladder cull
		bodyModel[45].setRotationPoint(-35F, -2F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122 cull
		bodyModel[46].setRotationPoint(-35F, -4F, -12F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 119 ladder cull
		bodyModel[47].setRotationPoint(32F, -2F, 11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120 cull
		bodyModel[48].setRotationPoint(32F, -4F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 121 ladder cull
		bodyModel[49].setRotationPoint(32F, -2F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122 cull
		bodyModel[50].setRotationPoint(32F, -4F, -12F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 127
		bodyModel[51].setRotationPoint(43.5F, 1.5F, -4F);

		bodyModel[52].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 128
		bodyModel[52].setRotationPoint(-48.5F, 1.5F, -4F);

		bodyModel[53].addBox(0F, 0F, 0F, 9, 4, 22, 0F); // Box 129
		bodyModel[53].setRotationPoint(42F, -4F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 4, 22, 0F); // Box 130
		bodyModel[54].setRotationPoint(47F, -8F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 18, 8, 12, 0F); // Box 131
		bodyModel[55].setRotationPoint(-9F, 0F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Box 134
		bodyModel[56].setRotationPoint(-10F, 0F, -6F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 135
		bodyModel[57].setRotationPoint(-13F, 0F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[58].setRotationPoint(-6F, 8F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[59].setRotationPoint(-10F, 5F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[60].setRotationPoint(-13F, 2.01F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[61].setRotationPoint(-18F, 0F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[62].setRotationPoint(9F, 5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[63].setRotationPoint(10F, 2F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[64].setRotationPoint(13F, 0F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Box 144
		bodyModel[65].setRotationPoint(9F, 0F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box 145
		bodyModel[66].setRotationPoint(10F, 0F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 0, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[67].setRotationPoint(-6F, 9.01F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[68].setRotationPoint(-9F, 8.01F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 3, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 149
		bodyModel[69].setRotationPoint(-10F, 5.01F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -0.5F); // Box 150
		bodyModel[70].setRotationPoint(-13F, 2.02F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 0, 14, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 151
		bodyModel[71].setRotationPoint(-18F, 0.00999999999999979F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 21, 0, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 152
		bodyModel[72].setRotationPoint(-39F, 0.00999999999999979F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 153
		bodyModel[73].setRotationPoint(6F, 8.01F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 3, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 154
		bodyModel[74].setRotationPoint(10F, 5.01F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -0.5F); // Box 155
		bodyModel[75].setRotationPoint(10F, 2.02F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 0, 14, 0F,0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -0.5F); // Box 156
		bodyModel[76].setRotationPoint(13F, 0.00999999999999979F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 24, 0, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[77].setRotationPoint(18F, 0.00999999999999979F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 162
		bodyModel[78].setRotationPoint(10F, 6F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[79].setRotationPoint(9F, 7F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 164
		bodyModel[80].setRotationPoint(11F, 7F, -7F);

		bodyModel[81].addShapeBox(0F, -1.5F, -1.5F, 14, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 563
		bodyModel[81].setRotationPoint(15F, -1F, 8F);
		bodyModel[81].rotateAngleX = 0.78539816F;

		bodyModel[82].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F); // Box 166
		bodyModel[82].setRotationPoint(14F, -1F, 8F);
		bodyModel[82].rotateAngleX = 0.78539816F;

		bodyModel[83].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F); // Box 167
		bodyModel[83].setRotationPoint(29F, -1F, 8F);
		bodyModel[83].rotateAngleX = 0.78539816F;

		bodyModel[84].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F); // Box 168
		bodyModel[84].setRotationPoint(14F, -1F, -8F);
		bodyModel[84].rotateAngleX = 0.78539816F;

		bodyModel[85].addShapeBox(0F, -1.5F, -1.5F, 14, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 169
		bodyModel[85].setRotationPoint(15F, -1F, -8F);
		bodyModel[85].rotateAngleX = 0.78539816F;

		bodyModel[86].addShapeBox(0F, -1.5F, -1.5F, 1, 3, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.85F, -0.85F, 0F, -0.85F, -0.85F, 0F, -0.1F, -0.1F); // Box 170
		bodyModel[86].setRotationPoint(29F, -1F, -8F);
		bodyModel[86].rotateAngleX = 0.78539816F;

		bodyModel[87].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 173
		bodyModel[87].setRotationPoint(-30.5F, -12F, 11F);

		bodyModel[88].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 174
		bodyModel[88].setRotationPoint(-41.5F, -12F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 175
		bodyModel[89].setRotationPoint(-30.5F, -12F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 176
		bodyModel[90].setRotationPoint(24.5F, -12F, 11F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 177
		bodyModel[91].setRotationPoint(24.5F, -12F, 10F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 178
		bodyModel[92].setRotationPoint(35.5F, -12F, 11F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 179
		bodyModel[93].setRotationPoint(35.5F, -12F, 10F);

		bodyModel[94].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 180
		bodyModel[94].setRotationPoint(35.5F, -12F, -12F);

		bodyModel[95].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 181
		bodyModel[95].setRotationPoint(24.5F, -12F, -12F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 182
		bodyModel[96].setRotationPoint(24.5F, -12F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 183
		bodyModel[97].setRotationPoint(35.5F, -12F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 184
		bodyModel[98].setRotationPoint(-30.5F, -12F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 185
		bodyModel[99].setRotationPoint(-30.5F, -12F, -12F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 188
		bodyModel[100].setRotationPoint(-41.5F, -12F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 189
		bodyModel[101].setRotationPoint(-29F, -13F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 190
		bodyModel[102].setRotationPoint(-40F, -13F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 191
		bodyModel[103].setRotationPoint(-40F, -13F, -12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 192
		bodyModel[104].setRotationPoint(-29F, -13F, -12F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 193
		bodyModel[105].setRotationPoint(26F, -13F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 194
		bodyModel[106].setRotationPoint(37F, -13F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 195
		bodyModel[107].setRotationPoint(26F, -13F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 196
		bodyModel[108].setRotationPoint(37F, -13F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 93, 11, 0, 0F); // Box 199
		bodyModel[109].setRotationPoint(-42F, -15F, 11F);

		bodyModel[110].addBox(0F, 0F, 0F, 95, 11, 0, 0F); // Box 200
		bodyModel[110].setRotationPoint(-44F, -15F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[111].setRotationPoint(-25F, -14F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[112].setRotationPoint(-25F, -14F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 204
		bodyModel[113].setRotationPoint(23F, -14F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 205
		bodyModel[114].setRotationPoint(23F, -14F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 208
		bodyModel[115].setRotationPoint(51F, -15F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 209
		bodyModel[116].setRotationPoint(51F, -15F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 210
		bodyModel[117].setRotationPoint(62F, -15F, 10F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 211
		bodyModel[118].setRotationPoint(63.5F, -18F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 0F); // Box 212
		bodyModel[119].setRotationPoint(62F, -15F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 213
		bodyModel[120].setRotationPoint(63.5F, -15F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[121].setRotationPoint(63.5F, -15F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[122].setRotationPoint(63.5F, -16F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 216
		bodyModel[123].setRotationPoint(63.5F, -16F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 217
		bodyModel[124].setRotationPoint(63.25F, -4F, 5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 218
		bodyModel[125].setRotationPoint(63.25F, -4F, -7.5F);

		bodyModel[126].addBox(-3F, 0F, 0F, 3, 7, 0, 0F); // Box 219
		bodyModel[126].setRotationPoint(62F, 0F, 10F);
		bodyModel[126].rotateAngleY = -0.08726646F;

		bodyModel[127].addBox(-3F, 0F, 0F, 3, 7, 0, 0F); // Box 220
		bodyModel[127].setRotationPoint(62F, 0F, -10F);
		bodyModel[127].rotateAngleY = 0.08726646F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 221
		bodyModel[128].setRotationPoint(51F, -8F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 4, 20, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 222 dont forget me please
		bodyModel[129].setRotationPoint(59F, -8F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 11, 0, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 223 floor cover
		bodyModel[130].setRotationPoint(51F, -8F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 27, 3, 1, 0F); // Box 117
		bodyModel[131].setRotationPoint(-6F, -23.5F, -8F);

		bodyModel[132].addBox(0F, 0F, 0F, 27, 3, 1, 0F); // Box 225
		bodyModel[132].setRotationPoint(-6F, -23.5F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F); // Box 226
		bodyModel[133].setRotationPoint(-5.5F, -24F, -7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 500
		bodyModel[134].setRotationPoint(-6F, -24.75F, -2F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 228
		bodyModel[135].setRotationPoint(-5.5F, -24.25F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 229
		bodyModel[136].setRotationPoint(19.5F, -24.25F, -2F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 231
		bodyModel[137].setRotationPoint(5.5F, -24.25F, -2F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 232
		bodyModel[138].setRotationPoint(8.5F, -24.25F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F); // Box 234
		bodyModel[139].setRotationPoint(8.5F, -24F, -7.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 235
		bodyModel[140].setRotationPoint(21.25F, -26F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 236
		bodyModel[141].setRotationPoint(-11.25F, -26F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 237
		bodyModel[142].setRotationPoint(26.5F, -25.75F, -5.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 238
		bodyModel[143].setRotationPoint(-16.5F, -25.75F, -5.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 239
		bodyModel[144].setRotationPoint(28F, -26F, -3.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 240
		bodyModel[145].setRotationPoint(-15F, -26F, -3.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 241
		bodyModel[146].setRotationPoint(32F, -25.75F, -4.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 13, 2, 9, 0F); // Box 242
		bodyModel[147].setRotationPoint(36F, -25.75F, -4.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 233
		bodyModel[148].setRotationPoint(50F, -25F, -2F);

		bodyModel[149].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 234
		bodyModel[149].setRotationPoint(50F, -25F, -2F);
		bodyModel[149].rotateAngleX = 0.19198622F;

		bodyModel[150].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 235
		bodyModel[150].setRotationPoint(50F, -25F, 2F);
		bodyModel[150].rotateAngleX = -0.19198622F;

		bodyModel[151].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 246
		bodyModel[151].setRotationPoint(-20F, -25.75F, -4.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 13, 2, 9, 0F); // Box 247
		bodyModel[152].setRotationPoint(-34F, -25.75F, -4.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 248
		bodyModel[153].setRotationPoint(-43F, -25F, -2F);

		bodyModel[154].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 249
		bodyModel[154].setRotationPoint(-43F, -25F, 2F);
		bodyModel[154].rotateAngleX = -0.19198622F;

		bodyModel[155].addBox(0F, 0F, -3F, 8, 1, 3, 0F); // Box 250
		bodyModel[155].setRotationPoint(-43F, -25F, -2F);
		bodyModel[155].rotateAngleX = 0.19198622F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 251
		bodyModel[156].setRotationPoint(-1.5F, -12.5F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 253
		bodyModel[157].setRotationPoint(8.5F, -12.5F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 254
		bodyModel[158].setRotationPoint(-1.5F, -12.5F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 255
		bodyModel[159].setRotationPoint(8.5F, -12.5F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 256
		bodyModel[160].setRotationPoint(-1.75F, -13.5F, 7.25F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 257
		bodyModel[161].setRotationPoint(8.25F, -13.5F, 7.25F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 258
		bodyModel[162].setRotationPoint(13.75F, -13.5F, 6.75F);

		bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 259
		bodyModel[163].setRotationPoint(5.75F, -13.5F, 7.25F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 260
		bodyModel[164].setRotationPoint(5.75F, -13.5F, -8.25F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 261
		bodyModel[165].setRotationPoint(8.25F, -13.5F, -8.25F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 262
		bodyModel[166].setRotationPoint(13.75F, -13.5F, -8.25F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 263
		bodyModel[167].setRotationPoint(-1.75F, -13.5F, -8.25F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 264
		bodyModel[168].setRotationPoint(10F, 0F, -8.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 17, 0F); // Box 265
		bodyModel[169].setRotationPoint(10F, 7F, -8.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 266
		bodyModel[170].setRotationPoint(11F, -1F, -8.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 267
		bodyModel[171].setRotationPoint(11F, -1F, 7.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 268
		bodyModel[172].setRotationPoint(10F, 0F, 7.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 269
		bodyModel[173].setRotationPoint(8F, 3F, -7.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 270
		bodyModel[174].setRotationPoint(8F, 3F, 5.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 271
		bodyModel[175].setRotationPoint(-12F, 3F, -7.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 272
		bodyModel[176].setRotationPoint(-13F, 3F, -6.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 273 cull
		bodyModel[177].setRotationPoint(-1F, 3.5F, -7F);

		bodyModel[178].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 274
		bodyModel[178].setRotationPoint(-12F, 3F, 6.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 275 cull
		bodyModel[179].setRotationPoint(-1F, 3.5F, 6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 280
		bodyModel[180].setRotationPoint(-64.25F, -4F, 5.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 281
		bodyModel[181].setRotationPoint(-64.25F, -4F, -7.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 282
		bodyModel[182].setRotationPoint(-35F, -15F, -12F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 283
		bodyModel[183].setRotationPoint(-32F, -15F, -12F);

		bodyModel[184].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 284
		bodyModel[184].setRotationPoint(-32F, -15F, 11F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 285
		bodyModel[185].setRotationPoint(-35F, -15F, 11F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 286
		bodyModel[186].setRotationPoint(35F, -15F, 11F);

		bodyModel[187].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 287
		bodyModel[187].setRotationPoint(32F, -15F, 11F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 288
		bodyModel[188].setRotationPoint(35F, -15F, -12F);

		bodyModel[189].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 289
		bodyModel[189].setRotationPoint(32F, -15F, -12F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 293
		bodyModel[190].setRotationPoint(7F, -25F, -6.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 294
		bodyModel[191].setRotationPoint(5F, -25.75F, -7.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[192].setRotationPoint(6.5F, -26F, -6.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[193].setRotationPoint(5.5F, -25.75F, -5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[194].setRotationPoint(-53.5F, -25.5F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[195].setRotationPoint(-53.5F, -26F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[196].setRotationPoint(-53.5F, -26F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[197].setRotationPoint(-53.5F, -26F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[198].setRotationPoint(-53.5F, -26F, -1F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[199].setRotationPoint(52F, -25.5F, 5F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[200].setRotationPoint(52F, -24.5F, 5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[201].setRotationPoint(-50F, -25.5F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 282 headlight r 2
		bodyModel[202].setRotationPoint(59.25F, -21.5F, 3.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[203].setRotationPoint(-6F, -23.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		bodyModel[204].setRotationPoint(-6F, -23.5F, 8F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 276 lift2
		bodyModel[205].setRotationPoint(63.25F, -18F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 277 lift2
		bodyModel[206].setRotationPoint(63.25F, -18F, 4F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 301
		bodyModel[207].setRotationPoint(6F, 2F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302 cull
		bodyModel[208].setRotationPoint(6F, -4F, 5.25F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 303
		bodyModel[209].setRotationPoint(6F, 2F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304 cull
		bodyModel[210].setRotationPoint(6F, -4F, -11.25F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 0, 15, 0F); // Box 305
		bodyModel[211].setRotationPoint(0F, -24.01F, -7.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 0, 15, 0F); // Box 306
		bodyModel[212].setRotationPoint(14F, -24.01F, -7.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F); // Box 297
		bodyModel[213].setRotationPoint(-10F, -21F, 6.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F); // Box 298
		bodyModel[214].setRotationPoint(-10F, -21F, -7.75F);

		bodyModel[215].addBox(0F, 0F, 0F, 53, 18, 1, 0F); // Box 299
		bodyModel[215].setRotationPoint(-19F, -21.5F, 6.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 53, 18, 1, 0F); // Box 300
		bodyModel[216].setRotationPoint(-19F, -21.5F, -7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F); // Box 301
		bodyModel[217].setRotationPoint(22F, -21F, 6.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F); // Box 302
		bodyModel[218].setRotationPoint(22F, -21F, -7.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 303
		bodyModel[219].setRotationPoint(46F, -15F, 11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 304
		bodyModel[220].setRotationPoint(46F, -15F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 306
		bodyModel[221].setRotationPoint(-62F, -8F, 8F);
		bodyModel[221].rotateAngleY = -3.14159265F;

		bodyModel[222].addBox(0F, 0F, 0F, 9, 4, 22, 0F); // Box 307
		bodyModel[222].setRotationPoint(-42F, -4F, 11F);
		bodyModel[222].rotateAngleY = -3.14159265F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 308
		bodyModel[223].setRotationPoint(-51F, -4F, 10F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 309
		bodyModel[224].setRotationPoint(-63.5F, -18F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[225].setRotationPoint(-64F, -18F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 311
		bodyModel[226].setRotationPoint(-64F, -18F, 4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 312
		bodyModel[227].setRotationPoint(-64.75F, -18F, 4F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 313
		bodyModel[228].setRotationPoint(-64.75F, -18F, -6F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 314
		bodyModel[229].setRotationPoint(-64F, -16F, -5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 315
		bodyModel[230].setRotationPoint(-64F, -16F, 4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 316
		bodyModel[231].setRotationPoint(-63.5F, -15F, -8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[232].setRotationPoint(-63.5F, -15F, 6F);

		bodyModel[233].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 318
		bodyModel[233].setRotationPoint(-64F, -10F, -5F);

		bodyModel[234].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 319
		bodyModel[234].setRotationPoint(-64F, -9F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 20, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 324
		bodyModel[235].setRotationPoint(-60F, -23.5F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[236].setRotationPoint(-60F, -24.5F, -7F);

		bodyModel[237].addBox(0F, 0F, 0F, 16, 1, 4, 0F); // Box 326
		bodyModel[237].setRotationPoint(-60F, -24.5F, -2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[238].setRotationPoint(-60F, -24.5F, 2F);

		bodyModel[239].addBox(0F, 0F, 0F, 11, 20, 14, 0F); // Box 328
		bodyModel[239].setRotationPoint(-55F, -23.5F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[240].setRotationPoint(-55F, -24.5F, 2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[241].setRotationPoint(-55F, -24.5F, -7F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 4, 22, 0F); // Box 331
		bodyModel[242].setRotationPoint(-42F, -4F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 332
		bodyModel[243].setRotationPoint(-62F, -8F, -10F);

		bodyModel[244].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 333
		bodyModel[244].setRotationPoint(-41.5F, -12F, 11F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 14, 1, 0F); // Box 334
		bodyModel[245].setRotationPoint(-41.5F, -12F, -12F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 4, 22, 0F); // Box 335
		bodyModel[246].setRotationPoint(-51F, -8F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 11, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 336
		bodyModel[247].setRotationPoint(-51F, -15F, -11F);
		bodyModel[247].rotateAngleY = -3.14159265F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,-0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 337
		bodyModel[248].setRotationPoint(-64F, -15F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 7, 0, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F); // Box 338
		bodyModel[249].setRotationPoint(-64F, -15F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 11, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 339
		bodyModel[250].setRotationPoint(-51F, -15F, 11F);
		bodyModel[250].rotateAngleY = -3.14159265F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[251].setRotationPoint(-48F, -15F, 11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[252].setRotationPoint(-48F, -15F, -11F);

		bodyModel[253].addBox(0F, 0F, 0F, 9, 11, 0, 0F); // Box 342
		bodyModel[253].setRotationPoint(-51F, -15F, 11F);

		bodyModel[254].addBox(0F, 0F, 0F, 7, 11, 0, 0F); // Box 343
		bodyModel[254].setRotationPoint(-51F, -15F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[255].setRotationPoint(-63.5F, -16F, 2F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 345
		bodyModel[256].setRotationPoint(-63.5F, -16F, -4F);

		bodyModel[257].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 346
		bodyModel[257].setRotationPoint(-62F, 0F, -10F);
		bodyModel[257].rotateAngleY = -0.08726646F;

		bodyModel[258].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 347
		bodyModel[258].setRotationPoint(-62F, 0F, 10F);
		bodyModel[258].rotateAngleY = 0.08726646F;
	}
	ModelTypeBnewSmol theBetterTrucks = new ModelTypeBnewSmol();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
		}else if (GetColor(entity) == 6) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_FNCC_c855.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.45, -0.03, 0);
		theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(-1.42, 0, 0);
		theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(4.31, 0, 0);
		theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);

		GL11.glTranslated(1.43, 0, 0);
		theBetterTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}