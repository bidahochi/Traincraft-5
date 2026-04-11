//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 50 ton Class B Climax
// Model Creator: Bida
// Created on: 13.11.2021 - 23:28:58
// Last changed on: 13.11.2021 - 23:28:58

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelClimaxTruckEarly;
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

import java.util.ArrayList;

public class ModelClimaxB extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelClimaxB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[278];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 93
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box coupler
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box coupler
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 186
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 187
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 179
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 180
		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 181
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 182
		bodyModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 184
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 252
		bodyModel[17] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 253
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 254
		bodyModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 255
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 56
		bodyModel[40] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 193
		bodyModel[41] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 194
		bodyModel[42] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 195
		bodyModel[43] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 196
		bodyModel[44] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 197
		bodyModel[45] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 198
		bodyModel[46] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 199
		bodyModel[47] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 390
		bodyModel[48] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 391
		bodyModel[49] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 114
		bodyModel[55] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 116
		bodyModel[56] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 370
		bodyModel[57] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 46
		bodyModel[59] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 102
		bodyModel[60] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 149
		bodyModel[61] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 151
		bodyModel[62] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 152
		bodyModel[63] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 153
		bodyModel[64] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 156
		bodyModel[65] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 162
		bodyModel[66] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 163
		bodyModel[67] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 392
		bodyModel[68] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 393
		bodyModel[69] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 130
		bodyModel[70] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 132
		bodyModel[71] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 134
		bodyModel[72] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 135
		bodyModel[73] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 94
		bodyModel[74] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 96
		bodyModel[75] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 101
		bodyModel[77] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 102
		bodyModel[78] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 103
		bodyModel[79] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 104
		bodyModel[80] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 105
		bodyModel[81] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 106
		bodyModel[82] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 107
		bodyModel[83] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 108
		bodyModel[84] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 109
		bodyModel[85] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 110
		bodyModel[86] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 111
		bodyModel[87] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 112
		bodyModel[88] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 116
		bodyModel[89] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 117
		bodyModel[90] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 118
		bodyModel[91] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 119
		bodyModel[92] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 120
		bodyModel[93] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 125
		bodyModel[97] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 126
		bodyModel[98] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 131
		bodyModel[99] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 133
		bodyModel[101] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 134
		bodyModel[102] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 135
		bodyModel[103] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 136
		bodyModel[104] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 137
		bodyModel[105] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 138
		bodyModel[106] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 56
		bodyModel[107] = new ModelRendererTurbo(this, 305, 41, textureX, textureY, "lamp"); // Box 146 headlight front
		bodyModel[108] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 129
		bodyModel[109] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 130
		bodyModel[110] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 131
		bodyModel[111] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 128 siderod bit that connects wheel to piston
		bodyModel[112] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 132 piston back and forth bit
		bodyModel[113] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 134 transmission wheel Z
		bodyModel[114] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 135 crankshaft spinny Z
		bodyModel[115] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 134 transmission wheel Z
		bodyModel[116] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 141
		bodyModel[117] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 143
		bodyModel[118] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 144
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 145
		bodyModel[120] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 129 eccentric spinny
		bodyModel[121] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 130 eccentric swaaws
		bodyModel[122] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 149 eccentric touchy
		bodyModel[123] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 150 eccentric backforth inverse of the piston
		bodyModel[124] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 154
		bodyModel[125] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 155
		bodyModel[126] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 156
		bodyModel[127] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 201
		bodyModel[128] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 202
		bodyModel[129] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 229
		bodyModel[130] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 114
		bodyModel[131] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 74
		bodyModel[132] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 78
		bodyModel[133] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 117
		bodyModel[134] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 105
		bodyModel[135] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 106
		bodyModel[136] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 107
		bodyModel[137] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 108
		bodyModel[138] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 109
		bodyModel[139] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 110
		bodyModel[140] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 351
		bodyModel[141] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 352
		bodyModel[142] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 353
		bodyModel[143] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 354
		bodyModel[144] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 355
		bodyModel[145] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 189
		bodyModel[146] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 180 whistle
		bodyModel[147] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 181
		bodyModel[148] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 182
		bodyModel[149] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 183
		bodyModel[150] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 184
		bodyModel[151] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 185
		bodyModel[152] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 187
		bodyModel[153] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 188
		bodyModel[154] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 189
		bodyModel[155] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 190
		bodyModel[156] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 191
		bodyModel[157] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 192
		bodyModel[158] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 193
		bodyModel[159] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 194
		bodyModel[160] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 195
		bodyModel[161] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 196
		bodyModel[162] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 197
		bodyModel[163] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 198
		bodyModel[164] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 199
		bodyModel[165] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 200
		bodyModel[166] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 128 siderod bit that connects wheel to piston
		bodyModel[167] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 132 piston back and forth bit
		bodyModel[168] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 224
		bodyModel[169] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 225
		bodyModel[170] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 134 crankshaft gear Z
		bodyModel[171] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 117 rod
		bodyModel[172] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 238 rod swivel
		bodyModel[173] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 238 rod swivel
		bodyModel[174] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 130 rod gear
		bodyModel[175] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 230
		bodyModel[176] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 276
		bodyModel[177] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 232
		bodyModel[178] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 222
		bodyModel[179] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 283
		bodyModel[180] = new ModelRendererTurbo(this, 497, 57, textureX, textureY, "lamp"); // Box 284 headlight rear MINE
		bodyModel[181] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 285
		bodyModel[182] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 239
		bodyModel[183] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 240
		bodyModel[184] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 241
		bodyModel[185] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 242
		bodyModel[186] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 243
		bodyModel[187] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 244
		bodyModel[188] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 245
		bodyModel[189] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 246
		bodyModel[190] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 150 eccentric backforth inverse of the piston
		bodyModel[191] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 233
		bodyModel[192] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 234
		bodyModel[193] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 235
		bodyModel[194] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 236
		bodyModel[195] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 237
		bodyModel[196] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 238
		bodyModel[197] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 239
		bodyModel[198] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 240 tender box big
		bodyModel[199] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 241
		bodyModel[200] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 283
		bodyModel[201] = new ModelRendererTurbo(this, 89, 65, textureX, textureY, "lamp"); // Box 284 headlight rear other
		bodyModel[202] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 285
		bodyModel[203] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 250 tender box smol
		bodyModel[204] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 180
		bodyModel[205] = new ModelRendererTurbo(this, 1, 73, textureX, textureY, "cull"); // Box 252 cull handrails
		bodyModel[206] = new ModelRendererTurbo(this, 33, 73, textureX, textureY, "cull"); // Box 255 cull handrails
		bodyModel[207] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 256
		bodyModel[208] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 257
		bodyModel[209] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 257
		bodyModel[210] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 258
		bodyModel[211] = new ModelRendererTurbo(this, 337, 65, textureX, textureY, "cull"); // Box 259 cull ladder
		bodyModel[212] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 264
		bodyModel[213] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 265
		bodyModel[214] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 266
		bodyModel[215] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 350
		bodyModel[216] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 351
		bodyModel[217] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 352
		bodyModel[218] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 353
		bodyModel[219] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 355
		bodyModel[220] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 356
		bodyModel[221] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 357
		bodyModel[222] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 358
		bodyModel[223] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 359
		bodyModel[224] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 360
		bodyModel[225] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 361
		bodyModel[226] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 362
		bodyModel[227] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 363
		bodyModel[228] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
		bodyModel[229] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 365
		bodyModel[230] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 366
		bodyModel[231] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 579
		bodyModel[232] = new ModelRendererTurbo(this, 145, 81, textureX, textureY, "cull"); // Box 286 cull
		bodyModel[233] = new ModelRendererTurbo(this, 161, 81, textureX, textureY, "cull"); // Box 287 cull
		bodyModel[234] = new ModelRendererTurbo(this, 265, 73, textureX, textureY, "cull"); // Box 288 cull
		bodyModel[235] = new ModelRendererTurbo(this, 281, 73, textureX, textureY, "cull"); // Box 289 cull
		bodyModel[236] = new ModelRendererTurbo(this, 393, 81, textureX, textureY, "cull"); // Box 290 cull
		bodyModel[237] = new ModelRendererTurbo(this, 449, 81, textureX, textureY, "cull"); // Box 291 cull
		bodyModel[238] = new ModelRendererTurbo(this, 177, 81, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[239] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 239
		bodyModel[240] = new ModelRendererTurbo(this, 217, 81, textureX, textureY, "cull"); // Box 240 cull
		bodyModel[241] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 295
		bodyModel[242] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 296
		bodyModel[243] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 297
		bodyModel[244] = new ModelRendererTurbo(this, 273, 81, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[245] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 239
		bodyModel[246] = new ModelRendererTurbo(this, 497, 81, textureX, textureY, "cull"); // Box 240 cull
		bodyModel[247] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 201
		bodyModel[248] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 202
		bodyModel[249] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 206
		bodyModel[250] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 207
		bodyModel[251] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 208
		bodyModel[252] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 99
		bodyModel[253] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 307
		bodyModel[254] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 308
		bodyModel[255] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 324
		bodyModel[256] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 325
		bodyModel[257] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 326
		bodyModel[258] = new ModelRendererTurbo(this, 89, 89, textureX, textureY, "lamp"); // Box 154 headlight glow
		bodyModel[259] = new ModelRendererTurbo(this, 105, 89, textureX, textureY, "cull"); // Box 328 bell holder cull
		bodyModel[260] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 329
		bodyModel[261] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 330
		bodyModel[262] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 87
		bodyModel[263] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 332
		bodyModel[264] = new ModelRendererTurbo(this, 129, 89, textureX, textureY, "cull"); // Box 333 cull lamp holy
		bodyModel[265] = new ModelRendererTurbo(this, 145, 89, textureX, textureY, "cull"); // Box 334 cull lamnp holy
		bodyModel[266] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 335
		bodyModel[267] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 283
		bodyModel[268] = new ModelRendererTurbo(this, 193, 89, textureX, textureY, "lamp"); // Box 284 headlight rear other TENDOR
		bodyModel[269] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 338
		bodyModel[270] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 339
		bodyModel[271] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 340
		bodyModel[272] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 341
		bodyModel[273] = new ModelRendererTurbo(this, 305, 89, textureX, textureY, "cull"); // Box 342 cull
		bodyModel[274] = new ModelRendererTurbo(this, 57, 102, textureX, textureY); // Box 36
		bodyModel[275] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 37
		bodyModel[276] = new ModelRendererTurbo(this, 29, 96, textureX, textureY); // Box 234
		bodyModel[277] = new ModelRendererTurbo(this, 28, 103, textureX, textureY); // Box 346

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 93
		bodyModel[0].setRotationPoint(-27F, 0F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box coupler
		bodyModel[1].setRotationPoint(-31F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-28F, 1.5F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-27F, 1.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(27F, 1.5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(26F, 1.5F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box coupler
		bodyModel[6].setRotationPoint(28F, 3F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		bodyModel[7].setRotationPoint(26F, 0F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 18, 0F); // Box 186
		bodyModel[8].setRotationPoint(27F, 3F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 6, 18, 0F); // Box 187
		bodyModel[9].setRotationPoint(-27F, 3F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 26, 1, 20, 0F); // Box 18
		bodyModel[10].setRotationPoint(0F, 0F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 19, 2, 12, 0F); // Box 179
		bodyModel[11].setRotationPoint(7F, 1F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 11, 1, 0F); // Box 180
		bodyModel[12].setRotationPoint(13F, -11F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 11, 18, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 181
		bodyModel[13].setRotationPoint(25F, -11F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 12, 11, 1, 0F); // Box 182
		bodyModel[14].setRotationPoint(13F, -11F, 9F);

		bodyModel[15].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Box 184
		bodyModel[15].setRotationPoint(14F, -10.5F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 252
		bodyModel[16].setRotationPoint(26F, -9F, 2.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 253
		bodyModel[17].setRotationPoint(26F, -10F, 3.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 254
		bodyModel[18].setRotationPoint(26F, -9F, -6.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 255
		bodyModel[19].setRotationPoint(26F, -10F, -5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 17
		bodyModel[20].setRotationPoint(0F, -18F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 19
		bodyModel[21].setRotationPoint(0F, -16F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(0F, -17F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(0F, -18F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(0F, -18F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(0F, -17F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[26].setRotationPoint(-1F, -17F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 0, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[27].setRotationPoint(-1F, -17F, 3F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 35
		bodyModel[28].setRotationPoint(0F, -17F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 16, 18, 0F); // Box 30
		bodyModel[29].setRotationPoint(0F, -16F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 47
		bodyModel[30].setRotationPoint(0F, -16F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[31].setRotationPoint(1F, -17F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[32].setRotationPoint(1F, -17F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[33].setRotationPoint(-23F, -9F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(-23F, -5F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 55
		bodyModel[35].setRotationPoint(-23F, -5F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-23F, -12F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-23F, -12F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[38].setRotationPoint(-23F, -12F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[39].setRotationPoint(-23F, -5F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 193
		bodyModel[40].setRotationPoint(-15F, -16F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 194
		bodyModel[41].setRotationPoint(-13F, -16F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		bodyModel[42].setRotationPoint(-16F, -16F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 196
		bodyModel[43].setRotationPoint(-13F, -17F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 197
		bodyModel[44].setRotationPoint(-16F, -17F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 198
		bodyModel[45].setRotationPoint(-15F, -17F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 199
		bodyModel[46].setRotationPoint(-15F, -13F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 390
		bodyModel[47].setRotationPoint(-16F, -13F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 391
		bodyModel[48].setRotationPoint(-13F, -13F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 15, 12, 0F); // Box 66
		bodyModel[49].setRotationPoint(1F, -10F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[50].setRotationPoint(-23.5F, -8.5F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 111
		bodyModel[51].setRotationPoint(-23.5F, -11F, 1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[52].setRotationPoint(-23.5F, -11F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[53].setRotationPoint(-23.5F, -11F, -3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[54].setRotationPoint(-23.5F, -6F, -3.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		bodyModel[55].setRotationPoint(-23.5F, -6F, 1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 10, 10, 0F); // Box 370
		bodyModel[56].setRotationPoint(-23.01F, -12F, -5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 5, 7, 0F); // Box 75
		bodyModel[57].setRotationPoint(-20F, -5F, -3.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[58].setRotationPoint(-21F, -21F, -3.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Box 102
		bodyModel[59].setRotationPoint(-21F, -21F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[60].setRotationPoint(-21F, -19F, -2.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[61].setRotationPoint(-18F, -19F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 152
		bodyModel[62].setRotationPoint(-24F, -19F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		bodyModel[63].setRotationPoint(-21F, -20F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 156
		bodyModel[64].setRotationPoint(-23F, -21F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 162
		bodyModel[65].setRotationPoint(-18F, -21F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[66].setRotationPoint(-23F, -21.01F, -3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 392
		bodyModel[67].setRotationPoint(-24F, -20F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 393
		bodyModel[68].setRotationPoint(-18F, -20F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 130
		bodyModel[69].setRotationPoint(-13F, -13F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 132
		bodyModel[70].setRotationPoint(-13F, -10F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -2F, 3F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 134
		bodyModel[71].setRotationPoint(-13F, -14F, 5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 135
		bodyModel[72].setRotationPoint(-13F, -10F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -2F, -4F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, -2F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 94
		bodyModel[73].setRotationPoint(-13F, -14F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, -1F, -4F); // Box 96
		bodyModel[74].setRotationPoint(-13F, -5F, 5F);

		bodyModel[75].addBox(0F, 0F, 0F, 14, 3, 6, 0F); // Box 97
		bodyModel[75].setRotationPoint(-7F, -13F, -3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[76].setRotationPoint(-7F, -13F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[77].setRotationPoint(-7F, -13F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 103
		bodyModel[78].setRotationPoint(-6F, -17F, -2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 104
		bodyModel[79].setRotationPoint(-7F, -14F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 105
		bodyModel[80].setRotationPoint(-6F, -14F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 106
		bodyModel[81].setRotationPoint(-4F, -14F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 107
		bodyModel[82].setRotationPoint(-4F, -17F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 108
		bodyModel[83].setRotationPoint(-7F, -17F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 109
		bodyModel[84].setRotationPoint(-7F, -18F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 110
		bodyModel[85].setRotationPoint(-6F, -18F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 111
		bodyModel[86].setRotationPoint(-4F, -18F, -1F);

		bodyModel[87].addBox(0F, 0F, 0F, 7, 6, 12, 0F); // Box 112
		bodyModel[87].setRotationPoint(-7F, -10F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[88].setRotationPoint(-7F, -4F, -3F);

		bodyModel[89].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 117
		bodyModel[89].setRotationPoint(-22F, -7F, -5F);
		bodyModel[89].rotateAngleZ = 1.13446401F;

		bodyModel[90].addBox(-8.5F, -0.5F, -1F, 8, 1, 1, 0F); // Box 118
		bodyModel[90].setRotationPoint(-22F, -7F, -5F);
		bodyModel[90].rotateAngleZ = 1.13446401F;

		bodyModel[91].addBox(-8.5F, -0.5F, 10F, 8, 1, 1, 0F); // Box 119
		bodyModel[91].setRotationPoint(-22F, -7F, -5F);
		bodyModel[91].rotateAngleZ = 1.13446401F;

		bodyModel[92].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 120
		bodyModel[92].setRotationPoint(-26F, 0F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 130
		bodyModel[93].setRotationPoint(-25.5F, -4F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[94].setRotationPoint(-25.5F, -3F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[95].setRotationPoint(-25.5F, -3F, -7F);

		bodyModel[96].addShapeBox(0F, -0.5F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[96].setRotationPoint(-26.25F, -2F, -8F);
		bodyModel[96].rotateAngleX = -0.38397244F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[97].setRotationPoint(-21F, -21F, -1F);

		bodyModel[98].addBox(0F, -2F, 0F, 6, 4, 2, 0F); // Box 131
		bodyModel[98].setRotationPoint(-16F, -3F, -9F);
		bodyModel[98].rotateAngleZ = -0.43633231F;

		bodyModel[99].addShapeBox(0F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
		bodyModel[99].setRotationPoint(-16F, -3F, -10F);
		bodyModel[99].rotateAngleZ = -0.43633231F;

		bodyModel[100].addShapeBox(0F, -1F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[100].setRotationPoint(-16F, -3F, -7F);
		bodyModel[100].rotateAngleZ = -0.43633231F;

		bodyModel[101].addBox(1F, -4F, -1F, 4, 3, 4, 0F); // Box 134
		bodyModel[101].setRotationPoint(-16F, -3F, -9F);
		bodyModel[101].rotateAngleZ = -0.43633231F;

		bodyModel[102].addBox(1F, -4F, -1F, 4, 3, 4, 0F); // Box 135
		bodyModel[102].setRotationPoint(-16F, -3F, 7F);
		bodyModel[102].rotateAngleZ = -0.43633231F;

		bodyModel[103].addShapeBox(0F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 136
		bodyModel[103].setRotationPoint(-16F, -3F, 6F);
		bodyModel[103].rotateAngleZ = -0.43633231F;

		bodyModel[104].addBox(0F, -2F, 0F, 6, 4, 2, 0F); // Box 137
		bodyModel[104].setRotationPoint(-16F, -3F, 7F);
		bodyModel[104].rotateAngleZ = -0.43633231F;

		bodyModel[105].addShapeBox(0F, -1F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[105].setRotationPoint(-16F, -3F, 9F);
		bodyModel[105].rotateAngleZ = -0.43633231F;

		bodyModel[106].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 56
		bodyModel[106].setRotationPoint(-25F, -16F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146 headlight front
		bodyModel[107].setRotationPoint(-25.25F, -16F, -1.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 1, 5, 0F); // Box 129
		bodyModel[108].setRotationPoint(-11F, -7F, 5F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 130
		bodyModel[109].setRotationPoint(-3F, -4F, 6F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 131
		bodyModel[110].setRotationPoint(-3F, -6F, 6F);

		bodyModel[111].addShapeBox(0F, -0.5F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128 siderod bit that connects wheel to piston
		bodyModel[111].setRotationPoint(-6.5F, 1.5F, 7.5F);
		bodyModel[111].rotateAngleZ = -0.52359878F;

		bodyModel[112].addShapeBox(-5F, -0.5F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132 piston back and forth bit
		bodyModel[112].setRotationPoint(-6.5F, 1.5F, 7.5F);
		bodyModel[112].rotateAngleZ = -0.43633231F;

		bodyModel[113].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 134 transmission wheel Z
		bodyModel[113].setRotationPoint(0F, 5F, 7.5F);

		bodyModel[114].addBox(-0.5F, -0.5F, 0F, 1, 1, 15, 0F); // Box 135 crankshaft spinny Z
		bodyModel[114].setRotationPoint(0F, 5F, -7.5F);

		bodyModel[115].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 134 transmission wheel Z
		bodyModel[115].setRotationPoint(0F, 5F, -7.5F);

		bodyModel[116].addShapeBox(10F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 141
		bodyModel[116].setRotationPoint(-16F, -3F, 6F);
		bodyModel[116].rotateAngleZ = -0.43633231F;

		bodyModel[117].addBox(6F, -2F, 0F, 5, 1, 1, 0F); // Box 143
		bodyModel[117].setRotationPoint(-16F, -3F, 7F);
		bodyModel[117].rotateAngleZ = -0.43633231F;

		bodyModel[118].addBox(6F, 1F, 0F, 5, 1, 1, 0F); // Box 144
		bodyModel[118].setRotationPoint(-16F, -3F, 7F);
		bodyModel[118].rotateAngleZ = -0.43633231F;

		bodyModel[119].addBox(0F, 0F, 0F, 27, 3, 12, 0F); // Box 145
		bodyModel[119].setRotationPoint(-26F, 0F, -6F);

		bodyModel[120].addShapeBox(0.5F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 129 eccentric spinny
		bodyModel[120].setRotationPoint(0F, 5F, 8F);

		bodyModel[121].addShapeBox(-0.5F, -1.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130 eccentric swaaws
		bodyModel[121].setRotationPoint(-4F, 0.5F, 8F);
		bodyModel[121].rotateAngleZ = -0.45378561F;

		bodyModel[122].addShapeBox(0.5F, 0.5F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149 eccentric touchy
		bodyModel[122].setRotationPoint(-4F, 0.5F, 8F);
		bodyModel[122].rotateAngleZ = -0.45378561F;

		bodyModel[123].addShapeBox(-7.5F, -1.5F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150 eccentric backforth inverse of the piston
		bodyModel[123].setRotationPoint(-4F, 0.5F, 8F);
		bodyModel[123].rotateAngleZ = -0.45378561F;

		bodyModel[124].addBox(0F, 0F, 0F, 6, 1, 5, 0F); // Box 154
		bodyModel[124].setRotationPoint(-11F, -7F, -10F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 155
		bodyModel[125].setRotationPoint(-6F, -6F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 156
		bodyModel[126].setRotationPoint(-6F, -4F, -10F);

		bodyModel[127].addBox(-1F, -1F, 0F, 2, 2, 2, 0F); // Box 201
		bodyModel[127].setRotationPoint(-1.5F, -14.5F, -1F);
		bodyModel[127].rotateAngleZ = 0.78539816F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[128].setRotationPoint(-1.5F, -20F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 229
		bodyModel[129].setRotationPoint(-2F, -13.5F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[130].setRotationPoint(-10F, -15.5F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[131].setRotationPoint(-10F, -16.5F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[132].setRotationPoint(-9.75F, -15F, -0.25F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[133].setRotationPoint(-10F, -13F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 105
		bodyModel[134].setRotationPoint(-5F, -7.5F, -8F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 106
		bodyModel[135].setRotationPoint(-2.5F, -7.5F, -8F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 107
		bodyModel[136].setRotationPoint(-2.5F, -10.5F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 108
		bodyModel[137].setRotationPoint(-5F, -10.5F, -8F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 109
		bodyModel[138].setRotationPoint(-4.5F, -8.5F, -7.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 110
		bodyModel[139].setRotationPoint(-2F, -8.5F, -7.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 351
		bodyModel[140].setRotationPoint(-8F, -18F, -0.25F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 352
		bodyModel[141].setRotationPoint(-8F, -18F, -2.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 353
		bodyModel[142].setRotationPoint(-8F, -15F, -1.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 354
		bodyModel[143].setRotationPoint(-8F, -16F, 1.25F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 355
		bodyModel[144].setRotationPoint(-7F, -15F, 1.25F);

		bodyModel[145].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[145].setRotationPoint(3F, -18F, -2F);
		bodyModel[145].rotateAngleZ = 0.27925268F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 180 whistle
		bodyModel[146].setRotationPoint(-8F, -19F, 1.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[147].setRotationPoint(-23.5F, -6F, -1.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 182
		bodyModel[148].setRotationPoint(-26F, 0F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 183
		bodyModel[149].setRotationPoint(-18F, 1F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[150].setRotationPoint(-18F, 1F, 6F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 185
		bodyModel[151].setRotationPoint(-19.5F, 2.5F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 187
		bodyModel[152].setRotationPoint(-2.5F, -3F, -9F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 188
		bodyModel[153].setRotationPoint(-7F, -10F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 189
		bodyModel[154].setRotationPoint(-22F, -8F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 190
		bodyModel[155].setRotationPoint(-21F, -8F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[156].setRotationPoint(-10F, -8F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 192
		bodyModel[157].setRotationPoint(-22F, -16F, -6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[158].setRotationPoint(-22F, -19F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 194
		bodyModel[159].setRotationPoint(-22F, -21F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 195
		bodyModel[160].setRotationPoint(-22F, -14F, -1F);

		bodyModel[161].addBox(6F, 1F, 0F, 5, 1, 2, 0F); // Box 196
		bodyModel[161].setRotationPoint(-16F, -3F, -9F);
		bodyModel[161].rotateAngleZ = -0.43633231F;

		bodyModel[162].addShapeBox(10F, -1F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[162].setRotationPoint(-16F, -3F, -7F);
		bodyModel[162].rotateAngleZ = -0.43633231F;

		bodyModel[163].addBox(6F, -2F, 0F, 5, 1, 2, 0F); // Box 198
		bodyModel[163].setRotationPoint(-16F, -3F, -9F);
		bodyModel[163].rotateAngleZ = -0.43633231F;

		bodyModel[164].addShapeBox(10F, -1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 199
		bodyModel[164].setRotationPoint(-16F, -3F, -10F);
		bodyModel[164].rotateAngleZ = -0.43633231F;

		bodyModel[165].addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0F); // Box 200
		bodyModel[165].setRotationPoint(-4F, 0.5F, 8F);
		bodyModel[165].rotateAngleZ = -0.45378561F;

		bodyModel[166].addShapeBox(0F, -0.5F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128 siderod bit that connects wheel to piston
		bodyModel[166].setRotationPoint(-6.5F, 1.5F, -8.5F);
		bodyModel[166].rotateAngleZ = -0.52359878F;

		bodyModel[167].addShapeBox(-5F, -0.5F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132 piston back and forth bit
		bodyModel[167].setRotationPoint(-6.5F, 1.5F, -8.5F);
		bodyModel[167].rotateAngleZ = -0.43633231F;

		bodyModel[168].addBox(0F, 0F, 0F, 1, 4, 13, 0F); // Box 224
		bodyModel[168].setRotationPoint(2F, 2F, -6.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 3, 13, 0F); // Box 225
		bodyModel[169].setRotationPoint(-3F, 2F, -6.5F);

		bodyModel[170].addBox(-1.5F, -1.5F, 0F, 3, 3, 0, 0F); // Box 134 crankshaft gear Z
		bodyModel[170].setRotationPoint(0F, 5F, 1.5F);

		bodyModel[171].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117 rod
		bodyModel[171].setRotationPoint(-4F, 6F, 0F);
		bodyModel[171].rotateAngleX = 0.78539816F;

		bodyModel[172].addShapeBox(-3F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238 rod swivel
		bodyModel[172].setRotationPoint(-7F, 6F, 0F);

		bodyModel[173].addShapeBox(-3F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238 rod swivel
		bodyModel[173].setRotationPoint(7F, 6F, 0F);

		bodyModel[174].addShapeBox(0F, -2.5F, -2.5F, 0, 5, 5, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 130 rod gear
		bodyModel[174].setRotationPoint(-1.5F, 6F, 0F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 230
		bodyModel[175].setRotationPoint(15.5F, 2.5F, -2F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 276
		bodyModel[176].setRotationPoint(9F, 1F, -10F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 6, 0, 0F); // Box 232
		bodyModel[177].setRotationPoint(9F, 1F, 10F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 222
		bodyModel[178].setRotationPoint(-24F, -13F, -1F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 283
		bodyModel[179].setRotationPoint(21.5F, -14F, -6.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight rear MINE
		bodyModel[180].setRotationPoint(23.75F, -14F, -6.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 285
		bodyModel[181].setRotationPoint(20.5F, -11F, -6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 239
		bodyModel[182].setRotationPoint(-14F, -8F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 240
		bodyModel[183].setRotationPoint(-13F, -8F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[184].setRotationPoint(-7F, -8F, 6F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 242
		bodyModel[185].setRotationPoint(-2F, -11F, 6F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 4, 12, 0F); // Box 243
		bodyModel[186].setRotationPoint(-3F, -4F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -4F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, -1F, 3F); // Box 244
		bodyModel[187].setRotationPoint(-13F, -5F, -6F);

		bodyModel[188].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 245
		bodyModel[188].setRotationPoint(4F, 2F, 8F);
		bodyModel[188].rotateAngleX = 0.78539816F;

		bodyModel[189].addBox(-1F, -1F, 0F, 2, 2, 14, 0F); // Box 246
		bodyModel[189].setRotationPoint(-13F, -1F, -7F);
		bodyModel[189].rotateAngleZ = 0.78539816F;

		bodyModel[190].addShapeBox(-7.5F, -1.5F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 150 eccentric backforth inverse of the piston
		bodyModel[190].setRotationPoint(-4F, 0.5F, -9F);
		bodyModel[190].rotateAngleZ = -0.45378561F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[191].setRotationPoint(-19F, -1.5F, -4.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, -0.5F, -0.5F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 0.5F); // Box 234
		bodyModel[192].setRotationPoint(-18F, -1.5F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 235
		bodyModel[193].setRotationPoint(-15.5F, -0.5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, -1F, -3F, -0.5F, -1F, 3F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, -3F, -0.5F, 1F, 3F, 0.5F, 0F, -0.5F); // Box 236
		bodyModel[194].setRotationPoint(-18F, -1.5F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 237
		bodyModel[195].setRotationPoint(-19F, -1.5F, 3.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[196].setRotationPoint(-15.5F, -0.5F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 239
		bodyModel[197].setRotationPoint(-23F, -2F, -1F);

		bodyModel[198].addBox(0F, 0F, 0F, 7, 5, 18, 0F); // Box 240 tender box big
		bodyModel[198].setRotationPoint(13.5F, -15.5F, -9F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 241
		bodyModel[199].setRotationPoint(21F, -12.5F, -2F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 283
		bodyModel[200].setRotationPoint(9.5F, -21.5F, -1.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight rear other
		bodyModel[201].setRotationPoint(11.75F, -21.5F, -1.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 285
		bodyModel[202].setRotationPoint(8.5F, -18.5F, -1F);

		bodyModel[203].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 250 tender box smol
		bodyModel[203].setRotationPoint(13.5F, -14.5F, -6F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 180
		bodyModel[204].setRotationPoint(8.5F, -10.5F, 9.75F);

		bodyModel[205].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 252 cull handrails
		bodyModel[205].setRotationPoint(13.5F, -10.5F, 9.75F);

		bodyModel[206].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 255 cull handrails
		bodyModel[206].setRotationPoint(13.5F, -10.5F, -10.75F);

		bodyModel[207].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 256
		bodyModel[207].setRotationPoint(8.5F, -10.5F, -10.75F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 257
		bodyModel[208].setRotationPoint(13F, -11F, -9F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 257
		bodyModel[209].setRotationPoint(26F, -11F, 2.5F);
		bodyModel[209].rotateAngleZ = -0.76794487F;

		bodyModel[210].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 258
		bodyModel[210].setRotationPoint(26F, -11F, -6.5F);
		bodyModel[210].rotateAngleZ = -0.76794487F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 1F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 259 cull ladder
		bodyModel[211].setRotationPoint(26F, -10F, -2F);

		bodyModel[212].addBox(0F, 0F, 0F, 11, 5, 6, 0F); // Box 264
		bodyModel[212].setRotationPoint(14F, -15.5F, -9F);

		bodyModel[213].addBox(0F, 0F, 0F, 11, 5, 6, 0F); // Box 265
		bodyModel[213].setRotationPoint(14F, -15.5F, 3F);

		bodyModel[214].addBox(0F, 0F, 0F, 6, 5, 6, 0F); // Box 266
		bodyModel[214].setRotationPoint(14F, -15.5F, -3F);

		bodyModel[215].addShapeBox(-0.5F, -7F, -0.5F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 350
		bodyModel[215].setRotationPoint(7.5F, -2F, 6F);
		bodyModel[215].rotateAngleZ = -0.2268928F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 351
		bodyModel[216].setRotationPoint(7F, -2F, 5.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[217].setRotationPoint(7F, -4F, -2F);

		bodyModel[218].addShapeBox(-0.5F, -1F, -3.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[218].setRotationPoint(5F, -13F, 5F);
		bodyModel[218].rotateAngleY = 1.02974426F;

		bodyModel[219].addShapeBox(-0.5F, 0F, -6.5F, 1, 4, 7, 0F,0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 355
		bodyModel[219].setRotationPoint(1.5F, -9F, 9F);
		bodyModel[219].rotateAngleY = 0.61086524F;

		bodyModel[220].addShapeBox(-0.5F, -2F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[220].setRotationPoint(5F, -13F, 5F);
		bodyModel[220].rotateAngleY = 1.02974426F;

		bodyModel[221].addShapeBox(-0.5F, -2F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[221].setRotationPoint(5F, -13F, 5F);
		bodyModel[221].rotateAngleY = 1.02974426F;

		bodyModel[222].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 358
		bodyModel[222].setRotationPoint(9F, -8F, 2F);
		bodyModel[222].rotateAngleX = 0.34906585F;
		bodyModel[222].rotateAngleY = 0.45378561F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[223].setRotationPoint(7F, -8F, 1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[224].setRotationPoint(7F, -7.5F, -4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[225].setRotationPoint(7F, -7.5F, -2.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[226].setRotationPoint(8F, -7.5F, -3.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[227].setRotationPoint(6.5F, -6.5F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[228].setRotationPoint(6.5F, -8F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 365
		bodyModel[229].setRotationPoint(4F, -5F, 6F);

		bodyModel[230].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[230].setRotationPoint(4.5F, -6F, 6.5F);
		bodyModel[230].rotateAngleY = 2.23402144F;

		bodyModel[231].addBox(-0.5F, -4F, -1F, 0, 4, 1, 0F); // Box 579
		bodyModel[231].setRotationPoint(6F, -13F, 9F);
		bodyModel[231].rotateAngleY = 0.64577182F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 286 cull
		bodyModel[232].setRotationPoint(-7F, 2F, 6.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 287 cull
		bodyModel[233].setRotationPoint(-2F, 2F, 6.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288 cull
		bodyModel[234].setRotationPoint(3F, 4F, 6.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289 cull
		bodyModel[235].setRotationPoint(3F, 4F, -7.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 5, 4, 1, 0F); // Box 290 cull
		bodyModel[236].setRotationPoint(-2F, 2F, -7.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 291 cull
		bodyModel[237].setRotationPoint(-7F, 2F, -7.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 154 headlight glow
		bodyModel[238].setRotationPoint(-24.5F, -15.5F, -1.5F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 239
		bodyModel[239].setRotationPoint(-27F, -16F, -1.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 240 cull
		bodyModel[240].setRotationPoint(-26F, -16F, -1.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 0, 6, 0F); // Box 295
		bodyModel[241].setRotationPoint(-1F, -18F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[242].setRotationPoint(-1F, -16F, 9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 297
		bodyModel[243].setRotationPoint(-1F, -16F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 154 headlight glow
		bodyModel[244].setRotationPoint(22F, -13.5F, -6.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 239
		bodyModel[245].setRotationPoint(25.5F, -14F, -6.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 240 cull
		bodyModel[246].setRotationPoint(24.5F, -14F, -6.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 201
		bodyModel[247].setRotationPoint(-20F, -14F, -5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 202
		bodyModel[248].setRotationPoint(-19.5F, -15F, -4.5F);

		bodyModel[249].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 206
		bodyModel[249].setRotationPoint(-19F, -13.5F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[250].setRotationPoint(-19.5F, -16.5F, -5F);

		bodyModel[251].addShapeBox(0F, -3F, 0.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[251].setRotationPoint(-19.5F, -16F, -4.5F);
		bodyModel[251].rotateAngleX = -1.57079633F;

		bodyModel[252].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 99
		bodyModel[252].setRotationPoint(-30F, 9F, -9F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 307
		bodyModel[253].setRotationPoint(27F, 9F, -9F);

		bodyModel[254].addBox(1F, -0.5F, 3.5F, 8, 1, 1, 0F); // Box 308
		bodyModel[254].setRotationPoint(-26.25F, -2F, -8F);
		bodyModel[254].rotateAngleX = -0.38397244F;

		bodyModel[255].addBox(0F, -1F, -1F, 5, 2, 2, 0F); // Box 324
		bodyModel[255].setRotationPoint(8F, 2F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[256].setRotationPoint(17F, 1F, 6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 326
		bodyModel[257].setRotationPoint(17F, 1F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 154 headlight glow
		bodyModel[258].setRotationPoint(10F, -21F, -1.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 328 bell holder cull
		bodyModel[259].setRotationPoint(-10F, -17F, -1F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[260].setRotationPoint(26F, -3F, 3.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[261].setRotationPoint(26F, -3F, -5.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 87
		bodyModel[262].setRotationPoint(-26.5F, -1.5F, -9F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 2, 18, 0F); // Box 332
		bodyModel[263].setRotationPoint(26.5F, -1.5F, -9F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333 cull lamp holy
		bodyModel[264].setRotationPoint(-25F, -13F, -2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 334 cull lamnp holy
		bodyModel[265].setRotationPoint(9.5F, -18.5F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 335
		bodyModel[266].setRotationPoint(17.5F, -16.5F, -2F);

		bodyModel[267].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 283
		bodyModel[267].setRotationPoint(17.5F, -19.5F, -1.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 headlight rear other TENDOR
		bodyModel[268].setRotationPoint(19.75F, -19.5F, -1.5F);

		bodyModel[269].addBox(0F, -1F, -1F, 6, 2, 2, 0F); // Box 338
		bodyModel[269].setRotationPoint(-9F, -4.5F, 8F);
		bodyModel[269].rotateAngleX = 0.78539816F;

		bodyModel[270].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 339
		bodyModel[270].setRotationPoint(-9.5F, -5F, -7.5F);
		bodyModel[270].rotateAngleX = 0.78539816F;

		bodyModel[271].addBox(-0.01F, -2F, -1F, 0, 4, 4, 0F); // Box 340
		bodyModel[271].setRotationPoint(-16F, -3F, 7F);
		bodyModel[271].rotateAngleZ = -0.43633231F;

		bodyModel[272].addBox(-0.01F, -2F, -1F, 0, 4, 4, 0F); // Box 341
		bodyModel[272].setRotationPoint(-16F, -3F, -9F);
		bodyModel[272].rotateAngleZ = -0.43633231F;

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 342 cull
		bodyModel[273].setRotationPoint(-24.5F, -1F, -10F);

		bodyModel[274].addBox(0F, 0F, -2F, 23, 0, 3, 0F); // Box 36
		bodyModel[274].setRotationPoint(-23F, -12F, 4F);
		bodyModel[274].rotateAngleX = 0.78539816F;

		bodyModel[275].addBox(0F, 0F, -1F, 23, 0, 3, 0F); // Box 37
		bodyModel[275].setRotationPoint(-23F, -12F, -4F);
		bodyModel[275].rotateAngleX = -0.78539816F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 234
		bodyModel[276].setRotationPoint(-24F, -8.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 346
		bodyModel[277].setRotationPoint(-23.51F, -11F, -4F);
	}
	ModelClimaxTruckEarly bogie = new ModelClimaxTruckEarly();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderLocomotiveModelWithoutBeacon(bodyModel, entity, f5);

		if (GetColor(entity) == 7||GetColor(entity) == 8) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/climaxtruck_minelol.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/climaxtruck_hillcrest9.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.085, 0.00, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.085, 0.00, 0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
}