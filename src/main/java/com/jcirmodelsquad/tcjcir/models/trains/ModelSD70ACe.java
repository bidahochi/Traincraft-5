//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: really shitty ace v2
// Model Creator: bidahochi
// Created on: 02.04.2023 - 21:00:41
// Last changed on: 02.04.2023 - 21:00:41

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelHTCR2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelHTCR2_peter_edition;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSD70ACe extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD70ACe() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[382];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 457, 148, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 146, 125, textureX, textureY); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 155, 141, textureX, textureY); // Box 63
		bodyModel[6] = new ModelRendererTurbo(this, 146, 101, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 5, 90, textureX, textureY); // Box 148
		bodyModel[8] = new ModelRendererTurbo(this, 26, 98, textureX, textureY); // Box 245
		bodyModel[9] = new ModelRendererTurbo(this, 31, 126, textureX, textureY); // Box 248
		bodyModel[10] = new ModelRendererTurbo(this, 47, 126, textureX, textureY); // Box 249
		bodyModel[11] = new ModelRendererTurbo(this, 67, 90, textureX, textureY); // Box 267
		bodyModel[12] = new ModelRendererTurbo(this, 67, 108, textureX, textureY); // Box 269
		bodyModel[13] = new ModelRendererTurbo(this, 11, 108, textureX, textureY); // Box 273
		bodyModel[14] = new ModelRendererTurbo(this, 28, 98, textureX, textureY); // Box 351 sandcap
		bodyModel[15] = new ModelRendererTurbo(this, 56, 98, textureX, textureY); // Box 279 sandcap
		bodyModel[16] = new ModelRendererTurbo(this, 55, 103, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 21, 103, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 68, 17, textureX, textureY); // Box 100
		bodyModel[19] = new ModelRendererTurbo(this, 36, 52, textureX, textureY); // Box 119
		bodyModel[20] = new ModelRendererTurbo(this, 102, 72, textureX, textureY); // Box 137
		bodyModel[21] = new ModelRendererTurbo(this, 29, 7, textureX, textureY); // Box 154
		bodyModel[22] = new ModelRendererTurbo(this, 36, 33, textureX, textureY); // Box 119
		bodyModel[23] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 314 door swing right
		bodyModel[24] = new ModelRendererTurbo(this, 6, 47, textureX, textureY); // Box 253
		bodyModel[25] = new ModelRendererTurbo(this, 24, 11, textureX, textureY); // Box 257
		bodyModel[26] = new ModelRendererTurbo(this, 24, 11, textureX, textureY); // Box 262
		bodyModel[27] = new ModelRendererTurbo(this, 6, 27, textureX, textureY); // Box 263
		bodyModel[28] = new ModelRendererTurbo(this, 94, 49, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 68, 125, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 73, 134, textureX, textureY, "lamp"); // Box 247 headlight cab
		bodyModel[31] = new ModelRendererTurbo(this, 73, 134, textureX, textureY, "lamp"); // Box 248 headlight cab
		bodyModel[32] = new ModelRendererTurbo(this, 79, 125, textureX, textureY); // Box 276
		bodyModel[33] = new ModelRendererTurbo(this, 57, 125, textureX, textureY); // Box 277
		bodyModel[34] = new ModelRendererTurbo(this, 62, 132, textureX, textureY, "lamp"); // Box 356 numberboard
		bodyModel[35] = new ModelRendererTurbo(this, 30, 23, textureX, textureY); // Box 54
		bodyModel[36] = new ModelRendererTurbo(this, 30, 1, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 62, 132, textureX, textureY, "lamp"); // Box 59 numberboard
		bodyModel[40] = new ModelRendererTurbo(this, 31, 58, textureX, textureY); // Box 60 DONT FORGET MEEE
		bodyModel[41] = new ModelRendererTurbo(this, 31, 39, textureX, textureY); // Box 61 DONT FORGET ME EITHERR
		bodyModel[42] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 68, 23, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 99, 29, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 293, 216, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 212, 186, textureX, textureY); // Box 139
		bodyModel[47] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Box 68
		bodyModel[48] = new ModelRendererTurbo(this, 230, 179, textureX, textureY); // Box 69
		bodyModel[49] = new ModelRendererTurbo(this, 230, 157, textureX, textureY); // Box 70
		bodyModel[50] = new ModelRendererTurbo(this, 311, 157, textureX, textureY); // Box 237
		bodyModel[51] = new ModelRendererTurbo(this, 191, 163, textureX, textureY); // Box 300
		bodyModel[52] = new ModelRendererTurbo(this, 194, 22, textureX, textureY); // Box 328 peenis weenis and the curse of the calypso kidneystone
		bodyModel[53] = new ModelRendererTurbo(this, 180, 38, textureX, textureY); // Box 96
		bodyModel[54] = new ModelRendererTurbo(this, 169, 58, textureX, textureY); // Box 97
		bodyModel[55] = new ModelRendererTurbo(this, 301, 38, textureX, textureY); // Box 158
		bodyModel[56] = new ModelRendererTurbo(this, 291, 20, textureX, textureY); // Exhaust
		bodyModel[57] = new ModelRendererTurbo(this, 252, 44, textureX, textureY); // Box 310
		bodyModel[58] = new ModelRendererTurbo(this, 258, 34, textureX, textureY); // Box 311
		bodyModel[59] = new ModelRendererTurbo(this, 274, 22, textureX, textureY); // Box 329
		bodyModel[60] = new ModelRendererTurbo(this, 351, 23, textureX, textureY); // Box 218
		bodyModel[61] = new ModelRendererTurbo(this, 371, 50, textureX, textureY); // Box 221
		bodyModel[62] = new ModelRendererTurbo(this, 344, 4, textureX, textureY, "cull"); // Box 222 cull radiator fan container thing
		bodyModel[63] = new ModelRendererTurbo(this, 478, 43, textureX, textureY); // Box 220
		bodyModel[64] = new ModelRendererTurbo(this, 347, 20, textureX, textureY); // Box 325
		bodyModel[65] = new ModelRendererTurbo(this, 318, 21, textureX, textureY); // Box 326
		bodyModel[66] = new ModelRendererTurbo(this, 371, 46, textureX, textureY); // Box 338
		bodyModel[67] = new ModelRendererTurbo(this, 318, 31, textureX, textureY); // Box 341
		bodyModel[68] = new ModelRendererTurbo(this, 409, 55, textureX, textureY); // Box 344
		bodyModel[69] = new ModelRendererTurbo(this, 320, 65, textureX, textureY); // Box 345
		bodyModel[70] = new ModelRendererTurbo(this, 318, 42, textureX, textureY); // Box 346
		bodyModel[71] = new ModelRendererTurbo(this, 358, 49, textureX, textureY); // Box 355 brakewheel
		bodyModel[72] = new ModelRendererTurbo(this, 343, 48, textureX, textureY); // Box 110
		bodyModel[73] = new ModelRendererTurbo(this, 441, 55, textureX, textureY); // Box 111 texture part of this away
		bodyModel[74] = new ModelRendererTurbo(this, 420, 32, textureX, textureY); // Box 112
		bodyModel[75] = new ModelRendererTurbo(this, 420, 117, textureX, textureY); // Box 113
		bodyModel[76] = new ModelRendererTurbo(this, 392, 103, textureX, textureY); // Box 114
		bodyModel[77] = new ModelRendererTurbo(this, 458, 103, textureX, textureY); // Box 115
		bodyModel[78] = new ModelRendererTurbo(this, 356, 45, textureX, textureY); // Box 116
		bodyModel[79] = new ModelRendererTurbo(this, 364, 45, textureX, textureY); // Box 117
		bodyModel[80] = new ModelRendererTurbo(this, 360, 55, textureX, textureY); // Box 118
		bodyModel[81] = new ModelRendererTurbo(this, 493, 43, textureX, textureY); // Box 119
		bodyModel[82] = new ModelRendererTurbo(this, 461, 43, textureX, textureY); // Box 120
		bodyModel[83] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 147
		bodyModel[84] = new ModelRendererTurbo(this, 28, 175, textureX, textureY); // Box 268
		bodyModel[85] = new ModelRendererTurbo(this, 440, 154, textureX, textureY); // Box 123
		bodyModel[86] = new ModelRendererTurbo(this, 444, 169, textureX, textureY); // Box 124
		bodyModel[87] = new ModelRendererTurbo(this, 289, 191, textureX, textureY); // Box 128
		bodyModel[88] = new ModelRendererTurbo(this, 247, 18, textureX, textureY); // Box 129
		bodyModel[89] = new ModelRendererTurbo(this, 160, 52, textureX, textureY); // Box 130
		bodyModel[90] = new ModelRendererTurbo(this, 147, 40, textureX, textureY); // Box 131
		bodyModel[91] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 330
		bodyModel[92] = new ModelRendererTurbo(this, 69, 181, textureX, textureY); // Box 113
		bodyModel[93] = new ModelRendererTurbo(this, 21, 181, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 191, 94, textureX, textureY); // Box 115
		bodyModel[95] = new ModelRendererTurbo(this, 191, 91, textureX, textureY); // Box 116
		bodyModel[96] = new ModelRendererTurbo(this, 194, 96, textureX, textureY); // Box 117
		bodyModel[97] = new ModelRendererTurbo(this, 194, 96, textureX, textureY); // Box 118
		bodyModel[98] = new ModelRendererTurbo(this, 29, 126, textureX, textureY, "lamp"); // Box 154 headlight nose
		bodyModel[99] = new ModelRendererTurbo(this, 24, 129, textureX, textureY, "lamp"); // Box 155 headlight nose
		bodyModel[100] = new ModelRendererTurbo(this, 47, 126, textureX, textureY, "cull"); // Box 121 cull noselight holder
		bodyModel[101] = new ModelRendererTurbo(this, 41, 126, textureX, textureY, "cull"); // Box 122 cull noselight holder
		bodyModel[102] = new ModelRendererTurbo(this, 150, 6, textureX, textureY); // Box 78
		bodyModel[103] = new ModelRendererTurbo(this, 150, 3, textureX, textureY); // Box 74
		bodyModel[104] = new ModelRendererTurbo(this, 150, 3, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 166, 5, textureX, textureY); // Box 226 pw based moment
		bodyModel[106] = new ModelRendererTurbo(this, 157, 2, textureX, textureY); // Box 227 pw based moment
		bodyModel[107] = new ModelRendererTurbo(this, 155, 8, textureX, textureY); // Box 228 pw based moment
		bodyModel[108] = new ModelRendererTurbo(this, 157, 5, textureX, textureY); // Box 229 pw based moment
		bodyModel[109] = new ModelRendererTurbo(this, 173, 8, textureX, textureY); // Box 354
		bodyModel[110] = new ModelRendererTurbo(this, 173, 5, textureX, textureY); // Box 355
		bodyModel[111] = new ModelRendererTurbo(this, 173, 11, textureX, textureY); // Box 356
		bodyModel[112] = new ModelRendererTurbo(this, 184, 5, textureX, textureY); // Box 357
		bodyModel[113] = new ModelRendererTurbo(this, 173, 14, textureX, textureY); // Box 135
		bodyModel[114] = new ModelRendererTurbo(this, 173, 2, textureX, textureY); // Box 136
		bodyModel[115] = new ModelRendererTurbo(this, 182, 9, textureX, textureY, "cull"); // Box 137 cull
		bodyModel[116] = new ModelRendererTurbo(this, 458, 94, textureX, textureY); // Box 138
		bodyModel[117] = new ModelRendererTurbo(this, 469, 90, textureX, textureY); // Box 139
		bodyModel[118] = new ModelRendererTurbo(this, 460, 90, textureX, textureY); // Box 140
		bodyModel[119] = new ModelRendererTurbo(this, 147, 109, textureX, textureY); // Box 141
		bodyModel[120] = new ModelRendererTurbo(this, 353, 109, textureX, textureY); // Box 142
		bodyModel[121] = new ModelRendererTurbo(this, 23, 76, textureX, textureY); // Box 142 highhood
		bodyModel[122] = new ModelRendererTurbo(this, 55, 76, textureX, textureY); // Box 143 highhood
		bodyModel[123] = new ModelRendererTurbo(this, 26, 78, textureX, textureY); // Box 144 highhood
		bodyModel[124] = new ModelRendererTurbo(this, 356, 55, textureX, textureY, "cull"); // Box 145 cull dynamic see thru shit
		bodyModel[125] = new ModelRendererTurbo(this, 198, 161, textureX, textureY); // Box 146 ns box
		bodyModel[126] = new ModelRendererTurbo(this, 213, 159, textureX, textureY); // Box 147 ns box
		bodyModel[127] = new ModelRendererTurbo(this, 470, 36, textureX, textureY, "lamp"); // Box 248 headlight rear
		bodyModel[128] = new ModelRendererTurbo(this, 470, 36, textureX, textureY, "lamp"); // Box 247 headlight rear
		bodyModel[129] = new ModelRendererTurbo(this, 459, 34, textureX, textureY); // Box 31 rear headlight mount
		bodyModel[130] = new ModelRendererTurbo(this, 394, 77, textureX, textureY); // Box 151 VERT dynamic fins
		bodyModel[131] = new ModelRendererTurbo(this, 409, 91, textureX, textureY, "cull"); // Box 152 cull VERT dynamic fins
		bodyModel[132] = new ModelRendererTurbo(this, 441, 91, textureX, textureY, "cull"); // Box 153 cull VERT dynamic fins
		bodyModel[133] = new ModelRendererTurbo(this, 427, 90, textureX, textureY); // Box 154 VERT dynamic fins
		bodyModel[134] = new ModelRendererTurbo(this, 22, 206, textureX, textureY); // Box 282
		bodyModel[135] = new ModelRendererTurbo(this, 46, 206, textureX, textureY); // Box 283
		bodyModel[136] = new ModelRendererTurbo(this, 9, 198, textureX, textureY); // Box 4
		bodyModel[137] = new ModelRendererTurbo(this, 25, 197, textureX, textureY); // Box 448
		bodyModel[138] = new ModelRendererTurbo(this, 59, 198, textureX, textureY); // Box 322
		bodyModel[139] = new ModelRendererTurbo(this, 51, 197, textureX, textureY); // Box 323
		bodyModel[140] = new ModelRendererTurbo(this, 14, 189, textureX, textureY); // Box 361
		bodyModel[141] = new ModelRendererTurbo(this, 62, 189, textureX, textureY); // Box 362
		bodyModel[142] = new ModelRendererTurbo(this, 240, 10, textureX, textureY); // Box 286
		bodyModel[143] = new ModelRendererTurbo(this, 270, 216, textureX, textureY); // Box 451 4 step
		bodyModel[144] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 452 4 step
		bodyModel[145] = new ModelRendererTurbo(this, 259, 215, textureX, textureY); // Box 453 4 step
		bodyModel[146] = new ModelRendererTurbo(this, 248, 214, textureX, textureY); // Box 454 4 step
		bodyModel[147] = new ModelRendererTurbo(this, 116, 136, textureX, textureY, "cull"); // Box 172 cull stairs
		bodyModel[148] = new ModelRendererTurbo(this, 121, 127, textureX, textureY, "cull"); // Box 173 cull stairs
		bodyModel[149] = new ModelRendererTurbo(this, 123, 121, textureX, textureY); // Box 174
		bodyModel[150] = new ModelRendererTurbo(this, 127, 121, textureX, textureY, "cull"); // Box 179 cull stairs
		bodyModel[151] = new ModelRendererTurbo(this, 132, 121, textureX, textureY, "cull"); // Box 180 cull stairs
		bodyModel[152] = new ModelRendererTurbo(this, 261, 238, textureX, textureY, "cull"); // Box 181 cull 4 step backpart
		bodyModel[153] = new ModelRendererTurbo(this, 286, 238, textureX, textureY, "cull"); // Box 182 cull 4 step backpart
		bodyModel[154] = new ModelRendererTurbo(this, 330, 240, textureX, textureY, "cull"); // Box 183 cull 4 step backpart
		bodyModel[155] = new ModelRendererTurbo(this, 287, 170, textureX, textureY); // Box 190
		bodyModel[156] = new ModelRendererTurbo(this, 289, 172, textureX, textureY); // Box 191
		bodyModel[157] = new ModelRendererTurbo(this, 289, 172, textureX, textureY); // Box 192
		bodyModel[158] = new ModelRendererTurbo(this, 291, 163, textureX, textureY); // Box 193
		bodyModel[159] = new ModelRendererTurbo(this, 293, 165, textureX, textureY); // Box 194
		bodyModel[160] = new ModelRendererTurbo(this, 293, 165, textureX, textureY); // Box 195
		bodyModel[161] = new ModelRendererTurbo(this, 175, 158, textureX, textureY); // Box 111 im gonna brown
		bodyModel[162] = new ModelRendererTurbo(this, 168, 158, textureX, textureY); // Box 112
		bodyModel[163] = new ModelRendererTurbo(this, 215, 236, textureX, textureY, "cull"); // Box 199 cull 5 step backpart
		bodyModel[164] = new ModelRendererTurbo(this, 222, 212, textureX, textureY); // Box 200 5 step
		bodyModel[165] = new ModelRendererTurbo(this, 194, 216, textureX, textureY); // Box 201 5 step
		bodyModel[166] = new ModelRendererTurbo(this, 201, 215, textureX, textureY); // Box 202 5 step
		bodyModel[167] = new ModelRendererTurbo(this, 208, 214, textureX, textureY); // Box 203 5 step
		bodyModel[168] = new ModelRendererTurbo(this, 215, 213, textureX, textureY); // Box 204 5 step
		bodyModel[169] = new ModelRendererTurbo(this, 192, 236, textureX, textureY, "cull"); // Box 205 cull 5 step backpart
		bodyModel[170] = new ModelRendererTurbo(this, 170, 240, textureX, textureY, "cull"); // Box 206 cull 5 step backpart
		bodyModel[171] = new ModelRendererTurbo(this, 389, 127, textureX, textureY, "cull"); // Box 208 cull stair
		bodyModel[172] = new ModelRendererTurbo(this, 355, 121, textureX, textureY); // Box 209
		bodyModel[173] = new ModelRendererTurbo(this, 378, 121, textureX, textureY, "cull"); // Box 210 cull stair
		bodyModel[174] = new ModelRendererTurbo(this, 126, 107, textureX, textureY); // Box 212
		bodyModel[175] = new ModelRendererTurbo(this, 362, 107, textureX, textureY); // Box 213
		bodyModel[176] = new ModelRendererTurbo(this, 270, 216, textureX, textureY); // Box 451 4 step
		bodyModel[177] = new ModelRendererTurbo(this, 282, 217, textureX, textureY); // Box 452 4 step
		bodyModel[178] = new ModelRendererTurbo(this, 259, 215, textureX, textureY); // Box 453 4 step
		bodyModel[179] = new ModelRendererTurbo(this, 248, 214, textureX, textureY); // Box 454 4 step
		bodyModel[180] = new ModelRendererTurbo(this, 261, 238, textureX, textureY, "cull"); // Box 181 cull 4 step backpart
		bodyModel[181] = new ModelRendererTurbo(this, 309, 240, textureX, textureY, "cull"); // Box 182 cull 4 step backpart
		bodyModel[182] = new ModelRendererTurbo(this, 351, 242, textureX, textureY, "cull"); // Box 183 cull 4 step backpart
		bodyModel[183] = new ModelRendererTurbo(this, 253, 225, textureX, textureY); // Box 221 4 step part
		bodyModel[184] = new ModelRendererTurbo(this, 253, 212, textureX, textureY); // Box 222 4 step part
		bodyModel[185] = new ModelRendererTurbo(this, 394, 128, textureX, textureY); // Box 223
		bodyModel[186] = new ModelRendererTurbo(this, 383, 122, textureX, textureY); // Box 224
		bodyModel[187] = new ModelRendererTurbo(this, 215, 236, textureX, textureY, "cull"); // Box 199 cull 5 step backpart
		bodyModel[188] = new ModelRendererTurbo(this, 222, 212, textureX, textureY); // Box 200 5 step
		bodyModel[189] = new ModelRendererTurbo(this, 195, 216, textureX, textureY); // Box 201 5 step
		bodyModel[190] = new ModelRendererTurbo(this, 201, 215, textureX, textureY); // Box 202 5 step
		bodyModel[191] = new ModelRendererTurbo(this, 208, 214, textureX, textureY); // Box 203 5 step
		bodyModel[192] = new ModelRendererTurbo(this, 215, 213, textureX, textureY); // Box 204 5 step
		bodyModel[193] = new ModelRendererTurbo(this, 192, 236, textureX, textureY, "cull"); // Box 205 cull 5 step backpart
		bodyModel[194] = new ModelRendererTurbo(this, 149, 238, textureX, textureY, "cull"); // Box 206 cull 5 step backpart
		bodyModel[195] = new ModelRendererTurbo(this, 261, 226, textureX, textureY); // Box 233 5 step part
		bodyModel[196] = new ModelRendererTurbo(this, 261, 214, textureX, textureY); // Box 234 5 step part
		bodyModel[197] = new ModelRendererTurbo(this, 16, 129, textureX, textureY); // Box 219 door schnozz
		bodyModel[198] = new ModelRendererTurbo(this, 8, 127, textureX, textureY); // Box 220 door schnozz
		bodyModel[199] = new ModelRendererTurbo(this, 8, 142, textureX, textureY); // Box 221 door schnozz
		bodyModel[200] = new ModelRendererTurbo(this, 82, 212, textureX, textureY); // Box 326
		bodyModel[201] = new ModelRendererTurbo(this, 240, 2, textureX, textureY); // Box 223
		bodyModel[202] = new ModelRendererTurbo(this, 222, 10, textureX, textureY); // Box 224
		bodyModel[203] = new ModelRendererTurbo(this, 222, 6, textureX, textureY); // Box 225
		bodyModel[204] = new ModelRendererTurbo(this, 318, 157, textureX, textureY); // Box 226 fuel cutoff UP
		bodyModel[205] = new ModelRendererTurbo(this, 208, 157, textureX, textureY); // Box 227 fuel cutoff switch UP
		bodyModel[206] = new ModelRendererTurbo(this, 275, 4, textureX, textureY); // Box 228
		bodyModel[207] = new ModelRendererTurbo(this, 275, 11, textureX, textureY); // Box 229
		bodyModel[208] = new ModelRendererTurbo(this, 343, 65, textureX, textureY); // Box 230
		bodyModel[209] = new ModelRendererTurbo(this, 475, 105, textureX, textureY, "cull"); // Box 254 cull HORIZ dynamic fins
		bodyModel[210] = new ModelRendererTurbo(this, 452, 119, textureX, textureY); // Box 255 horizontal dynamic fins part
		bodyModel[211] = new ModelRendererTurbo(this, 413, 90, textureX, textureY); // Box 262 VERT dynamic fins
		bodyModel[212] = new ModelRendererTurbo(this, 412, 18, textureX, textureY); // Box 263
		bodyModel[213] = new ModelRendererTurbo(this, 411, 12, textureX, textureY); // Box 264
		bodyModel[214] = new ModelRendererTurbo(this, 427, 12, textureX, textureY); // Box 265
		bodyModel[215] = new ModelRendererTurbo(this, 444, 18, textureX, textureY); // Box 266
		bodyModel[216] = new ModelRendererTurbo(this, 459, 12, textureX, textureY); // Box 267
		bodyModel[217] = new ModelRendererTurbo(this, 443, 12, textureX, textureY); // Box 268
		bodyModel[218] = new ModelRendererTurbo(this, 463, 27, textureX, textureY); // Box 276
		bodyModel[219] = new ModelRendererTurbo(this, 492, 27, textureX, textureY); // Box 277
		bodyModel[220] = new ModelRendererTurbo(this, 494, 21, textureX, textureY); // Box 278
		bodyModel[221] = new ModelRendererTurbo(this, 494, 35, textureX, textureY); // Box 279
		bodyModel[222] = new ModelRendererTurbo(this, 473, 43, textureX, textureY); // Box 1251 rear sand fil EARLY
		bodyModel[223] = new ModelRendererTurbo(this, 126, 67, textureX, textureY); // Box 281 cab isolation seam
		bodyModel[224] = new ModelRendererTurbo(this, 41, 69, textureX, textureY); // Box 31 highhood headlight mount
		bodyModel[225] = new ModelRendererTurbo(this, 38, 68, textureX, textureY, "lamp"); // Box 247 headlight hh
		bodyModel[226] = new ModelRendererTurbo(this, 48, 68, textureX, textureY, "lamp"); // Box 248 headlight hh
		bodyModel[227] = new ModelRendererTurbo(this, 52, 69, textureX, textureY); // Box 276 highhood mount
		bodyModel[228] = new ModelRendererTurbo(this, 30, 69, textureX, textureY); // Box 277 highhood mount
		bodyModel[229] = new ModelRendererTurbo(this, 59, 66, textureX, textureY, "lamp"); // Box 356 numberboard hh
		bodyModel[230] = new ModelRendererTurbo(this, 59, 66, textureX, textureY, "lamp"); // Box 59 numberboard hh
		bodyModel[231] = new ModelRendererTurbo(this, 142, 63, textureX, textureY); // Box 289
		bodyModel[232] = new ModelRendererTurbo(this, 39, 29, textureX, textureY); // box64 sunshield late
		bodyModel[233] = new ModelRendererTurbo(this, 39, 48, textureX, textureY); // box65 sunshield late
		bodyModel[234] = new ModelRendererTurbo(this, 489, 43, textureX, textureY, "cull"); // Box 292 cull backup horn mount
		bodyModel[235] = new ModelRendererTurbo(this, 40, 176, textureX, textureY, "cull"); // Box 293 cull anticlimber
		bodyModel[236] = new ModelRendererTurbo(this, 27, 176, textureX, textureY, "cull"); // Box 294 cull anticlimber
		bodyModel[237] = new ModelRendererTurbo(this, 53, 176, textureX, textureY, "cull"); // Box 295 cull anticlimber
		bodyModel[238] = new ModelRendererTurbo(this, 39, 177, textureX, textureY, "cull"); // Box 296 cull anticlimber support
		bodyModel[239] = new ModelRendererTurbo(this, 62, 177, textureX, textureY, "cull"); // Box 298 cull anticlimber late
		bodyModel[240] = new ModelRendererTurbo(this, 24, 177, textureX, textureY, "cull"); // Box 299 cull anticlimber late
		bodyModel[241] = new ModelRendererTurbo(this, 456, 170, textureX, textureY, "cull"); // Box 293 cull anticlimber
		bodyModel[242] = new ModelRendererTurbo(this, 469, 170, textureX, textureY, "cull"); // Box 294 cull anticlimber
		bodyModel[243] = new ModelRendererTurbo(this, 443, 170, textureX, textureY, "cull"); // Box 295 cull anticlimber
		bodyModel[244] = new ModelRendererTurbo(this, 465, 171, textureX, textureY, "cull"); // Box 296 cull anticlimber support
		bodyModel[245] = new ModelRendererTurbo(this, 436, 173, textureX, textureY, "cull"); // Box 298 cull anticlimber late
		bodyModel[246] = new ModelRendererTurbo(this, 482, 173, textureX, textureY, "cull"); // Box 299 cull anticlimber late
		bodyModel[247] = new ModelRendererTurbo(this, 161, 31, textureX, textureY); // Box 306
		bodyModel[248] = new ModelRendererTurbo(this, 109, 4, textureX, textureY); // Box 307 beansniff ptc bubble
		bodyModel[249] = new ModelRendererTurbo(this, 200, 181, textureX, textureY); // Box 204
		bodyModel[250] = new ModelRendererTurbo(this, 193, 181, textureX, textureY); // Box 205
		bodyModel[251] = new ModelRendererTurbo(this, 141, 157, textureX, textureY); // Box 516
		bodyModel[252] = new ModelRendererTurbo(this, 166, 159, textureX, textureY); // Box 517
		bodyModel[253] = new ModelRendererTurbo(this, 316, 181, textureX, textureY); // Box 284
		bodyModel[254] = new ModelRendererTurbo(this, 309, 181, textureX, textureY); // Box 285
		bodyModel[255] = new ModelRendererTurbo(this, 307, 159, textureX, textureY); // Box 286
		bodyModel[256] = new ModelRendererTurbo(this, 332, 157, textureX, textureY); // Box 287
		bodyModel[257] = new ModelRendererTurbo(this, 456, 2, textureX, textureY); // Box 402 dyn fan
		bodyModel[258] = new ModelRendererTurbo(this, 318, 165, textureX, textureY); // Box 289 filters of somesort
		bodyModel[259] = new ModelRendererTurbo(this, 208, 186, textureX, textureY); // Box 290
		bodyModel[260] = new ModelRendererTurbo(this, 167, 165, textureX, textureY); // Box 291 dont forget
		bodyModel[261] = new ModelRendererTurbo(this, 167, 167, textureX, textureY); // Box 292
		bodyModel[262] = new ModelRendererTurbo(this, 160, 186, textureX, textureY); // Box 293
		bodyModel[263] = new ModelRendererTurbo(this, 182, 179, textureX, textureY, "cull"); // Box 294 cull
		bodyModel[264] = new ModelRendererTurbo(this, 323, 179, textureX, textureY, "cull"); // Box 295 cull
		bodyModel[265] = new ModelRendererTurbo(this, 308, 167, textureX, textureY); // Box 296
		bodyModel[266] = new ModelRendererTurbo(this, 349, 186, textureX, textureY); // Box 297
		bodyModel[267] = new ModelRendererTurbo(this, 301, 186, textureX, textureY); // Box 298
		bodyModel[268] = new ModelRendererTurbo(this, 308, 165, textureX, textureY); // Box 299 dont forget
		bodyModel[269] = new ModelRendererTurbo(this, 60, 153, textureX, textureY); // Box 300
		bodyModel[270] = new ModelRendererTurbo(this, 57, 152, textureX, textureY); // Box 301
		bodyModel[271] = new ModelRendererTurbo(this, 30, 153, textureX, textureY); // Box 302
		bodyModel[272] = new ModelRendererTurbo(this, 33, 152, textureX, textureY); // Box 303
		bodyModel[273] = new ModelRendererTurbo(this, 116, 27, textureX, textureY, "lamp"); // Box 304 cn marker
		bodyModel[274] = new ModelRendererTurbo(this, 122, 27, textureX, textureY, "lamp"); // Box 305 cn marker
		bodyModel[275] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 288 e-bell
		bodyModel[276] = new ModelRendererTurbo(this, 141, 1, textureX, textureY); // Box 287 e-bell
		bodyModel[277] = new ModelRendererTurbo(this, 141, 10, textureX, textureY); // Box 136 e-bell
		bodyModel[278] = new ModelRendererTurbo(this, 203, 168, textureX, textureY); // Box 310 engine oil drain i think
		bodyModel[279] = new ModelRendererTurbo(this, 471, 33, textureX, textureY, "lamp"); // Box 311 cn marker
		bodyModel[280] = new ModelRendererTurbo(this, 466, 33, textureX, textureY); // Box 312 cn marker holder
		bodyModel[281] = new ModelRendererTurbo(this, 471, 33, textureX, textureY, "lamp"); // Box 313 cn marker
		bodyModel[282] = new ModelRendererTurbo(this, 466, 33, textureX, textureY); // Box 314 cn marker holder
		bodyModel[283] = new ModelRendererTurbo(this, 291, 157, textureX, textureY); // Box 315
		bodyModel[284] = new ModelRendererTurbo(this, 302, 159, textureX, textureY); // Box 316 fuel cutoff switch 2
		bodyModel[285] = new ModelRendererTurbo(this, 133, 9, textureX, textureY); // Box 78 am bell
		bodyModel[286] = new ModelRendererTurbo(this, 133, 6, textureX, textureY); // Box 74 am bell
		bodyModel[287] = new ModelRendererTurbo(this, 133, 6, textureX, textureY); // Box 114 am bell
		bodyModel[288] = new ModelRendererTurbo(this, 131, 1, textureX, textureY, "cull"); // Box 320 cull am bell holder
		bodyModel[289] = new ModelRendererTurbo(this, 82, 203, textureX, textureY); // Box 309
		bodyModel[290] = new ModelRendererTurbo(this, 111, 212, textureX, textureY); // Box 310
		bodyModel[291] = new ModelRendererTurbo(this, 82, 194, textureX, textureY); // Box 311
		bodyModel[292] = new ModelRendererTurbo(this, 82, 186, textureX, textureY); // Box 312
		bodyModel[293] = new ModelRendererTurbo(this, 123, 186, textureX, textureY); // Box 313
		bodyModel[294] = new ModelRendererTurbo(this, 477, 138, textureX, textureY); // Box 243
		bodyModel[295] = new ModelRendererTurbo(this, 443, 138, textureX, textureY); // Box 250
		bodyModel[296] = new ModelRendererTurbo(this, 448, 151, textureX, textureY); // Box 542
		bodyModel[297] = new ModelRendererTurbo(this, 474, 151, textureX, textureY); // Box 543
		bodyModel[298] = new ModelRendererTurbo(this, 447, 39, textureX, textureY); // Box 318 db hatch split
		bodyModel[299] = new ModelRendererTurbo(this, 406, 1, textureX, textureY); // Box 319
		bodyModel[300] = new ModelRendererTurbo(this, 438, 1, textureX, textureY); // Box 320
		bodyModel[301] = new ModelRendererTurbo(this, 494, 107, textureX, textureY, "cull"); // Box 321 cull HORIZ dynamic fins
		bodyModel[302] = new ModelRendererTurbo(this, 494, 102, textureX, textureY, "cull"); // Box 322 cull HORIZ dynamic fins
		bodyModel[303] = new ModelRendererTurbo(this, 494, 97, textureX, textureY, "cull"); // Box 323 cull HORIZ dynamic fins
		bodyModel[304] = new ModelRendererTurbo(this, 494, 92, textureX, textureY, "cull"); // Box 324 cull HORIZ dynamic fins
		bodyModel[305] = new ModelRendererTurbo(this, 494, 87, textureX, textureY, "cull"); // Box 325 cull HORIZ dynamic fins
		bodyModel[306] = new ModelRendererTurbo(this, 494, 82, textureX, textureY, "cull"); // Box 326 cull HORIZ dynamic fins
		bodyModel[307] = new ModelRendererTurbo(this, 472, 69, textureX, textureY); // Box 327
		bodyModel[308] = new ModelRendererTurbo(this, 490, 69, textureX, textureY); // Box 328
		bodyModel[309] = new ModelRendererTurbo(this, 480, 80, textureX, textureY); // Box 329
		bodyModel[310] = new ModelRendererTurbo(this, 481, 52, textureX, textureY); // Box 330 rear venty
		bodyModel[311] = new ModelRendererTurbo(this, 63, 162, textureX, textureY); // Box 332
		bodyModel[312] = new ModelRendererTurbo(this, 49, 176, textureX, textureY, "cull"); // Box 333 cull anticlimber support
		bodyModel[313] = new ModelRendererTurbo(this, 455, 170, textureX, textureY, "cull"); // Box 334 cull anticlimber support
		bodyModel[314] = new ModelRendererTurbo(this, 107, 53, textureX, textureY); // Box 335
		bodyModel[315] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 336
		bodyModel[316] = new ModelRendererTurbo(this, 70, 53, textureX, textureY); // Box 337
		bodyModel[317] = new ModelRendererTurbo(this, 72, 76, textureX, textureY); // Box 338 cab heater
		bodyModel[318] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 339 cab heater
		bodyModel[319] = new ModelRendererTurbo(this, 94, 68, textureX, textureY); // Box 340
		bodyModel[320] = new ModelRendererTurbo(this, 69, 67, textureX, textureY); // Box 341
		bodyModel[321] = new ModelRendererTurbo(this, 102, 101, textureX, textureY); // Box 342
		bodyModel[322] = new ModelRendererTurbo(this, 117, 110, textureX, textureY); // Box 343
		bodyModel[323] = new ModelRendererTurbo(this, 88, 111, textureX, textureY); // Box 344
		bodyModel[324] = new ModelRendererTurbo(this, 93, 101, textureX, textureY); // Box 345
		bodyModel[325] = new ModelRendererTurbo(this, 118, 105, textureX, textureY); // Box 346
		bodyModel[326] = new ModelRendererTurbo(this, 103, 49, textureX, textureY); // Box 347
		bodyModel[327] = new ModelRendererTurbo(this, 80, 49, textureX, textureY); // Box 348
		bodyModel[328] = new ModelRendererTurbo(this, 51, 158, textureX, textureY); // Box 445
		bodyModel[329] = new ModelRendererTurbo(this, 33, 158, textureX, textureY); // Box 446
		bodyModel[330] = new ModelRendererTurbo(this, 42, 158, textureX, textureY); // Box 447
		bodyModel[331] = new ModelRendererTurbo(this, 60, 162, textureX, textureY); // Box 352
		bodyModel[332] = new ModelRendererTurbo(this, 30, 162, textureX, textureY); // Box 353
		bodyModel[333] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Box 354
		bodyModel[334] = new ModelRendererTurbo(this, 63, 160, textureX, textureY); // Box 355
		bodyModel[335] = new ModelRendererTurbo(this, 27, 160, textureX, textureY); // Box 356
		bodyModel[336] = new ModelRendererTurbo(this, 467, 152, textureX, textureY); // Box 357
		bodyModel[337] = new ModelRendererTurbo(this, 458, 152, textureX, textureY); // Box 358
		bodyModel[338] = new ModelRendererTurbo(this, 449, 152, textureX, textureY); // Box 359
		bodyModel[339] = new ModelRendererTurbo(this, 446, 156, textureX, textureY); // Box 360
		bodyModel[340] = new ModelRendererTurbo(this, 443, 154, textureX, textureY); // Box 361
		bodyModel[341] = new ModelRendererTurbo(this, 443, 156, textureX, textureY); // Box 362
		bodyModel[342] = new ModelRendererTurbo(this, 476, 156, textureX, textureY); // Box 363
		bodyModel[343] = new ModelRendererTurbo(this, 479, 154, textureX, textureY); // Box 364
		bodyModel[344] = new ModelRendererTurbo(this, 479, 156, textureX, textureY); // Box 365
		bodyModel[345] = new ModelRendererTurbo(this, 88, 1, textureX, textureY, "cull"); // Box 366 cull bubble ptc shit
		bodyModel[346] = new ModelRendererTurbo(this, 71, 1, textureX, textureY); // Box 368 ptc block
		bodyModel[347] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Box 369 ptc block
		bodyModel[348] = new ModelRendererTurbo(this, 79, 11, textureX, textureY, "cull"); // Box 415 cull ptc sinclair
		bodyModel[349] = new ModelRendererTurbo(this, 135, 20, textureX, textureY); // Box 371 ptc
		bodyModel[350] = new ModelRendererTurbo(this, 135, 16, textureX, textureY); // Box 372 ptc
		bodyModel[351] = new ModelRendererTurbo(this, 135, 18, textureX, textureY); // Box 373 ptc
		bodyModel[352] = new ModelRendererTurbo(this, 135, 22, textureX, textureY); // Box 374 ptc
		bodyModel[353] = new ModelRendererTurbo(this, 35, 160, textureX, textureY); // Box 352 mu squiggle
		bodyModel[354] = new ModelRendererTurbo(this, 451, 154, textureX, textureY); // Box 376 mu squiggle
		bodyModel[355] = new ModelRendererTurbo(this, 28, 171, textureX, textureY); // Box 396
		bodyModel[356] = new ModelRendererTurbo(this, 28, 171, textureX, textureY); // Box 397
		bodyModel[357] = new ModelRendererTurbo(this, 21, 171, textureX, textureY, "ditch"); // Box 579 THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[358] = new ModelRendererTurbo(this, 21, 171, textureX, textureY, "ditch"); // Box 398 ditchglight front
		bodyModel[359] = new ModelRendererTurbo(this, 474, 165, textureX, textureY); // Box 392
		bodyModel[360] = new ModelRendererTurbo(this, 474, 165, textureX, textureY); // Box 393
		bodyModel[361] = new ModelRendererTurbo(this, 481, 165, textureX, textureY, "ditch"); // Box 394 ditchlight reare
		bodyModel[362] = new ModelRendererTurbo(this, 481, 165, textureX, textureY, "ditch"); // Box 395 ditchlight rear
		bodyModel[363] = new ModelRendererTurbo(this, 443, 190, textureX, textureY); // Box 132
		bodyModel[364] = new ModelRendererTurbo(this, 463, 190, textureX, textureY); // Box 133
		bodyModel[365] = new ModelRendererTurbo(this, 117, 15, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[366] = new ModelRendererTurbo(this, 122, 15, textureX, textureY, "commander"); // Box 342 commander beacon
		bodyModel[367] = new ModelRendererTurbo(this, 127, 19, textureX, textureY); // Box 409 commander base
		bodyModel[368] = new ModelRendererTurbo(this, 127, 15, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[369] = new ModelRendererTurbo(this, 418, 203, textureX, textureY, "cull"); // Box 391 cull FERROMEX EARS
		bodyModel[370] = new ModelRendererTurbo(this, 77, 155, textureX, textureY, "cull"); // Box 392 cull ferromex cartel cage
		bodyModel[371] = new ModelRendererTurbo(this, 77, 141, textureX, textureY, "cull"); // Box 393 cull ferromex cartel cage
		bodyModel[372] = new ModelRendererTurbo(this, 193, 158, textureX, textureY); // Box 372
		bodyModel[373] = new ModelRendererTurbo(this, 193, 158, textureX, textureY); // Box 373
		bodyModel[374] = new ModelRendererTurbo(this, 437, 175, textureX, textureY); // Box 374
		bodyModel[375] = new ModelRendererTurbo(this, 485, 175, textureX, textureY); // Box 375
		bodyModel[376] = new ModelRendererTurbo(this, 90, 68, textureX, textureY); // Box 380 screeens
		bodyModel[377] = new ModelRendererTurbo(this, 0, 222, textureX, textureY, "cull"); // Box 402 lots of little pipes
		bodyModel[378] = new ModelRendererTurbo(this, 0, 222, textureX, textureY, "cull"); // Box 382
		bodyModel[379] = new ModelRendererTurbo(this, 152, 179, textureX, textureY, "cull"); // Box 379 cull thundercab square mounters
		bodyModel[380] = new ModelRendererTurbo(this, 167, 179, textureX, textureY, "cull"); // Box 379 cull thundercab square mounters
		bodyModel[381] = new ModelRendererTurbo(this, 138, 170, textureX, textureY, "cull"); // Box 381 cull sd70m-2 demo shit

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(51F, 2.5F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 5
		bodyModel[1].setRotationPoint(52F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-52F, 2.5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[3].setRotationPoint(-55F, 3F, -1.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 102, 3, 12, 0F); // Box 23
		bodyModel[4].setRotationPoint(-51F, -1F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 92, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[5].setRotationPoint(-46F, 2F, -6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 92, 1, 22, 0F); // Box 0
		bodyModel[6].setRotationPoint(-46F, -2F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 13, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[7].setRotationPoint(-43F, -15F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 15, 12, 0F); // Box 245
		bodyModel[8].setRotationPoint(-47F, -17F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 248
		bodyModel[9].setRotationPoint(-48F, -17F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 249
		bodyModel[10].setRotationPoint(-48F, -17F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[11].setRotationPoint(-43F, -15F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 269
		bodyModel[12].setRotationPoint(-45F, -14F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[13].setRotationPoint(-45F, -14F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
		bodyModel[14].setRotationPoint(-45.75F, -16.5F, 6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 279 sandcap
		bodyModel[15].setRotationPoint(-45.75F, -16.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-1F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-46F, -16F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-46F, -16F, 6F);

		bodyModel[18].addShapeBox(3F, 0F, 0F, 1, 15, 14, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 100
		bodyModel[18].setRotationPoint(-32F, -22F, -7F);

		bodyModel[19].addBox(3F, 0F, 0F, 9, 13, 1, 0F); // Box 119
		bodyModel[19].setRotationPoint(-41F, -21F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 22, 6, 22, 0F); // Box 137
		bodyModel[20].setRotationPoint(-38F, -8F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 11, 1, 14, 0F); // Box 154
		bodyModel[21].setRotationPoint(-39F, -23F, -7F);

		bodyModel[22].addBox(3F, 0F, 0F, 9, 13, 1, 0F); // Box 119
		bodyModel[22].setRotationPoint(-41F, -21F, 10F);

		bodyModel[23].addBox(-0.5F, 0F, -3.5F, 1, 13, 4, 0F); // Box 314 door swing right
		bodyModel[23].setRotationPoint(-28.5F, -21F, 10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 253
		bodyModel[24].setRotationPoint(-41F, -22F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F); // Box 257
		bodyModel[25].setRotationPoint(-41F, -23F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.91F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[26].setRotationPoint(-41F, -23F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[27].setRotationPoint(-41F, -22F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 13, 4, 0F); // Box 46
		bodyModel[28].setRotationPoint(-39F, -17F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-41.25F, -23.5F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 headlight cab
		bodyModel[30].setRotationPoint(-41.5F, -23.35F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 headlight cab
		bodyModel[31].setRotationPoint(-41.5F, -23.35F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,-1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[32].setRotationPoint(-41.25F, -23.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 277
		bodyModel[33].setRotationPoint(-41.25F, -23.5F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.75F, -0.1F, -0.6F, -1.2F, -0.1F, -0.6F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.75F, -0.1F, -0.6F, -1.2F, -0.1F, -0.6F); // Box 356 numberboard
		bodyModel[34].setRotationPoint(-41.27F, -23.5F, 1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 1.09F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1.25F, -1F, 0F, 1.09F, -1F, 0F); // Box 54
		bodyModel[35].setRotationPoint(-38F, -22F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.09F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 1.09F, -1F, 0F, -1.25F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-38F, -22F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-38F, -22F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 58
		bodyModel[38].setRotationPoint(-38F, -22F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,-1.2F, -0.1F, -0.6F, 0.75F, -0.1F, -0.6F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -1.2F, -0.1F, -0.6F, 0.75F, -0.1F, -0.6F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 59 numberboard
		bodyModel[39].setRotationPoint(-41.27F, -23.5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 60 DONT FORGET MEEE
		bodyModel[40].setRotationPoint(-38F, -22F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61 DONT FORGET ME EITHERR
		bodyModel[41].setRotationPoint(-38F, -22F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[42].setRotationPoint(-29F, -23F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[43].setRotationPoint(-29F, -23F, -11F);

		bodyModel[44].addBox(3F, 0F, 0F, 1, 13, 4, 0F); // Box 64
		bodyModel[44].setRotationPoint(-32F, -21F, -11F);

		bodyModel[45].addShapeBox(0F, -1F, 0F, 26, 2, 17, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[45].setRotationPoint(-13F, 8F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 26, 2, 22, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[46].setRotationPoint(-13F, 3F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 26, 1, 14, 0F); // Box 68
		bodyModel[47].setRotationPoint(-13F, 2.25F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[48].setRotationPoint(-13F, 2.25F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[49].setRotationPoint(-13F, 2.25F, -11F);

		bodyModel[50].addBox(0F, 0F, -1F, 1, 1, 4, 0F); // Box 237
		bodyModel[50].setRotationPoint(1F, 3F, 8F);
		bodyModel[50].rotateAngleX = 0.43633231F;

		bodyModel[51].addBox(0F, 0F, -3F, 1, 1, 4, 0F); // Box 300
		bodyModel[51].setRotationPoint(1F, 3F, -8F);
		bodyModel[51].rotateAngleX = -0.43633231F;

		bodyModel[52].addBox(-1F, 0F, 0F, 19, 1, 14, 0F); // Box 328 peenis weenis and the curse of the calypso kidneystone
		bodyModel[52].setRotationPoint(-27F, -23F, -7F);

		bodyModel[53].addBox(-1F, 0F, 0F, 26, 3, 14, 0F); // Box 96
		bodyModel[53].setRotationPoint(-27F, -22F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 61, 17, 14, 0F); // Box 97
		bodyModel[54].setRotationPoint(-28F, -19F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 158
		bodyModel[55].setRotationPoint(16F, -21F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Exhaust
		bodyModel[56].setRotationPoint(-6.5F, -23.25F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 310
		bodyModel[57].setRotationPoint(-2F, -20F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, 3F); // Box 311
		bodyModel[58].setRotationPoint(-2F, -21F, -3F);

		bodyModel[59].addShapeBox(-1F, 0F, 0F, 6, 1, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 329
		bodyModel[59].setRotationPoint(-7F, -23F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 21, 1, 18, 0F); // Box 218
		bodyModel[60].setRotationPoint(17F, -22F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[61].setRotationPoint(17F, -22F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 222 cull radiator fan container thing
		bodyModel[62].setRotationPoint(17F, -22.5F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 8, 4, 0F); // Box 220
		bodyModel[63].setRotationPoint(46F, -22F, -2F);

		bodyModel[64].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 325
		bodyModel[64].setRotationPoint(17F, -21F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 21, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[65].setRotationPoint(17F, -19F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[66].setRotationPoint(17F, -22F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 21, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 341
		bodyModel[67].setRotationPoint(17F, -19F, 7F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Box 344
		bodyModel[68].setRotationPoint(38F, -22F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 5, 12, 12, 0F); // Box 345
		bodyModel[69].setRotationPoint(33F, -14F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 7, 14, 0F); // Box 346
		bodyModel[70].setRotationPoint(33F, -21F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[71].setRotationPoint(33F, -13F, 6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 110
		bodyModel[72].setRotationPoint(33F, -6F, 5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Box 111 texture part of this away
		bodyModel[73].setRotationPoint(45F, -22F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 8, 14, 0F); // Box 112
		bodyModel[74].setRotationPoint(39F, -22F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // Box 113
		bodyModel[75].setRotationPoint(39F, -3F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 114
		bodyModel[76].setRotationPoint(39F, -4F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 115
		bodyModel[77].setRotationPoint(44F, -4F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[78].setRotationPoint(33F, -14F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[79].setRotationPoint(37F, -14F, 5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 118
		bodyModel[80].setRotationPoint(35F, -11F, 4.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 20, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[81].setRotationPoint(46F, -22F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 20, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[82].setRotationPoint(46F, -22F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 147
		bodyModel[83].setRotationPoint(-51.01F, -3F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		bodyModel[84].setRotationPoint(-51.01F, 7F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 123
		bodyModel[85].setRotationPoint(51.01F, -3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 124
		bodyModel[86].setRotationPoint(51.01F, 7F, -9F);

		bodyModel[87].addShapeBox(0F, -1F, 0F, 26, 2, 21, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[87].setRotationPoint(-13F, 6F, -10.5F);

		bodyModel[88].addShapeBox(-1F, 0F, 0F, 6, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[88].setRotationPoint(-7F, -23F, -7F);

		bodyModel[89].addBox(0F, 0F, 0F, 7, 6, 4, 0F); // Box 130
		bodyModel[89].setRotationPoint(-16F, -8F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 19, 7, 4, 0F); // Box 131
		bodyModel[90].setRotationPoint(-28F, -15F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 330
		bodyModel[91].setRotationPoint(46F, -3F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[92].setRotationPoint(-51F, -2F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 114
		bodyModel[93].setRotationPoint(-51F, -2F, 6F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 6, 0, 0F); // Box 115
		bodyModel[94].setRotationPoint(-16F, -8F, 11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[95].setRotationPoint(-14F, -8F, 11.01F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 117
		bodyModel[96].setRotationPoint(-16F, -6F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 118
		bodyModel[97].setRotationPoint(-15F, -4F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154 headlight nose
		bodyModel[98].setRotationPoint(-48.75F, -16F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 155 headlight nose
		bodyModel[99].setRotationPoint(-48.75F, -14F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.35F, 0F, 0F, 0.02F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.35F, 0F, 0F); // Box 121 cull noselight holder
		bodyModel[100].setRotationPoint(-48.65F, -16F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.35F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.02F, 0F, 0F, 0.35F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.02F, 0F, 0F); // Box 122 cull noselight holder
		bodyModel[101].setRotationPoint(-48.65F, -16F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[102].setRotationPoint(-23.25F, 0.5F, 9.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[103].setRotationPoint(-23.5F, -1F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[104].setRotationPoint(-23.5F, 0F, 9F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 226 pw based moment
		bodyModel[105].setRotationPoint(-4F, -20.5F, -7.75F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 227 pw based moment
		bodyModel[106].setRotationPoint(-6F, -21.5F, -8.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 228 pw based moment
		bodyModel[107].setRotationPoint(-6.5F, -19.5F, -8.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 229 pw based moment
		bodyModel[108].setRotationPoint(-4.5F, -20.5F, -8.75F);

		bodyModel[109].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[109].setRotationPoint(5F, -24F, -0.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[110].setRotationPoint(4F, -23.75F, 0.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[111].setRotationPoint(3.5F, -23.75F, -1.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 357
		bodyModel[112].setRotationPoint(5.5F, -23F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
		bodyModel[113].setRotationPoint(4F, -23.5F, -2.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 136
		bodyModel[114].setRotationPoint(4F, -23.5F, 1.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 137 cull
		bodyModel[115].setRotationPoint(5F, -22F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 138
		bodyModel[116].setRotationPoint(39.5F, -9F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 5, 2, 0F); // Box 139
		bodyModel[117].setRotationPoint(41.5F, -8F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 140
		bodyModel[118].setRotationPoint(39.5F, -10F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[119].setRotationPoint(-51F, 2F, -2.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[120].setRotationPoint(46F, 2F, -2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 142 highhood
		bodyModel[121].setRotationPoint(-48F, -23F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 143 highhood
		bodyModel[122].setRotationPoint(-48F, -23F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 8, 6, 12, 0F); // Box 144 highhood
		bodyModel[123].setRotationPoint(-47F, -23F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 14, 22, 12, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, -11F, 0F, -7F, -11F, 0F, -7F, -11F, -2F, 0F, -11F, -2F); // Box 145 cull dynamic see thru shit
		bodyModel[124].setRotationPoint(38F, -14F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146 ns box
		bodyModel[125].setRotationPoint(5.5F, -0.75F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147 ns box
		bodyModel[126].setRotationPoint(5.5F, -0.75F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight rear
		bodyModel[127].setRotationPoint(48.5F, -18F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight rear
		bodyModel[128].setRotationPoint(48.5F, -18F, -2F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 rear headlight mount
		bodyModel[129].setRotationPoint(48.25F, -18F, -2F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 11, 14, 0F); // Box 151 VERT dynamic fins
		bodyModel[130].setRotationPoint(40F, -14F, -7F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 11, 14, 0F); // Box 152 cull VERT dynamic fins
		bodyModel[131].setRotationPoint(41F, -14F, -7F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 11, 14, 0F); // Box 153 cull VERT dynamic fins
		bodyModel[132].setRotationPoint(43F, -14F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154 VERT dynamic fins
		bodyModel[133].setRotationPoint(39F, -10.25F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[134].setRotationPoint(-55F, 7F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[135].setRotationPoint(-55F, 7F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[136].setRotationPoint(-54F, 6F, 0F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[137].setRotationPoint(-54F, 5F, 3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[138].setRotationPoint(-54F, 6F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 323
		bodyModel[139].setRotationPoint(-54F, 5F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 361
		bodyModel[140].setRotationPoint(-54F, 4F, 3F);

		bodyModel[141].addShapeBox(0F, 0F, -2F, 1, 1, 7, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 362
		bodyModel[141].setRotationPoint(-54F, 4F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,-0.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 286
		bodyModel[142].setRotationPoint(-17F, -23F, 6.6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451 4 step
		bodyModel[143].setRotationPoint(-51F, 3F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452 4 step
		bodyModel[144].setRotationPoint(-51F, 0.5F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 0, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453 4 step
		bodyModel[145].setRotationPoint(-51F, 5.5F, -9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454 4 step
		bodyModel[146].setRotationPoint(-51F, 8F, -10F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 172 cull stairs
		bodyModel[147].setRotationPoint(-46F, -1F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 173 cull stairs
		bodyModel[148].setRotationPoint(-47F, -1F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 174
		bodyModel[149].setRotationPoint(-47F, -2F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 179 cull stairs
		bodyModel[150].setRotationPoint(-46F, -1F, 10F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 180 cull stairs
		bodyModel[151].setRotationPoint(-47F, -1F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181 cull 4 step backpart
		bodyModel[152].setRotationPoint(-51F, 7F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 cull 4 step backpart
		bodyModel[153].setRotationPoint(-51F, 4.5F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 cull 4 step backpart
		bodyModel[154].setRotationPoint(-51F, 2F, -6F);

		bodyModel[155].addShapeBox(0F, -0.5F, 0F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 190
		bodyModel[155].setRotationPoint(-13.5F, 0.5F, 7F);

		bodyModel[156].addShapeBox(0F, -0.5F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 191
		bodyModel[156].setRotationPoint(-13.5F, -0.5F, 8F);

		bodyModel[157].addShapeBox(0F, -0.5F, 0F, 13, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[157].setRotationPoint(-13.5F, 2F, 8F);

		bodyModel[158].addShapeBox(0F, -0.5F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 193
		bodyModel[158].setRotationPoint(4.5F, 0.5F, 7F);

		bodyModel[159].addShapeBox(0F, -0.5F, 0F, 9, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 194
		bodyModel[159].setRotationPoint(4.5F, 2F, 8F);

		bodyModel[160].addShapeBox(0F, -0.5F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 195
		bodyModel[160].setRotationPoint(4.5F, -0.5F, 8F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 111 im gonna brown
		bodyModel[161].setRotationPoint(-42F, 0F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 112
		bodyModel[162].setRotationPoint(-42F, 0F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 cull 5 step backpart
		bodyModel[163].setRotationPoint(-51F, 7F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200 5 step
		bodyModel[164].setRotationPoint(-51F, 8F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 5 step
		bodyModel[165].setRotationPoint(-51F, 0F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202 5 step
		bodyModel[166].setRotationPoint(-51F, 2F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 0, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203 5 step
		bodyModel[167].setRotationPoint(-51F, 4F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204 5 step
		bodyModel[168].setRotationPoint(-51F, 6F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205 cull 5 step backpart
		bodyModel[169].setRotationPoint(-51F, 5F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 cull 5 step backpart
		bodyModel[170].setRotationPoint(-51F, 3F, -7F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 208 cull stair
		bodyModel[171].setRotationPoint(46F, -1F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 209
		bodyModel[172].setRotationPoint(46F, -2F, -10F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 210 cull stair
		bodyModel[173].setRotationPoint(46F, -1F, 6F);

		bodyModel[174].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 212
		bodyModel[174].setRotationPoint(-51F, -2F, -6F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 213
		bodyModel[175].setRotationPoint(47F, -2F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451 4 step
		bodyModel[176].setRotationPoint(47F, 3F, -8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452 4 step
		bodyModel[177].setRotationPoint(48F, 0.5F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 0, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453 4 step
		bodyModel[178].setRotationPoint(47F, 5.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454 4 step
		bodyModel[179].setRotationPoint(47F, 8F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181 cull 4 step backpart
		bodyModel[180].setRotationPoint(47F, 7F, -8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 cull 4 step backpart
		bodyModel[181].setRotationPoint(48F, 4.5F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 cull 4 step backpart
		bodyModel[182].setRotationPoint(48F, 2F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 221 4 step part
		bodyModel[183].setRotationPoint(47F, -2F, -7.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F); // Box 222 4 step part
		bodyModel[184].setRotationPoint(47F, -2F, 5.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 223
		bodyModel[185].setRotationPoint(48F, -2F, -7.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[186].setRotationPoint(48F, -2F, 5.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 cull 5 step backpart
		bodyModel[187].setRotationPoint(47F, 7F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200 5 step
		bodyModel[188].setRotationPoint(47F, 8F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 5 step
		bodyModel[189].setRotationPoint(48F, 0F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 0, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202 5 step
		bodyModel[190].setRotationPoint(47F, 2F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 0, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203 5 step
		bodyModel[191].setRotationPoint(47F, 4F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204 5 step
		bodyModel[192].setRotationPoint(47F, 6F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205 cull 5 step backpart
		bodyModel[193].setRotationPoint(47F, 5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 cull 5 step backpart
		bodyModel[194].setRotationPoint(48F, 3F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 233 5 step part
		bodyModel[195].setRotationPoint(47F, -2F, -7.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 234 5 step part
		bodyModel[196].setRotationPoint(47F, -2F, 5.5F);

		bodyModel[197].addShapeBox(0F, 0F, -5F, 1, 13, 5, 0F,1.8F, 0F, -0.1F, -1.8F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 1.8F, 0F, -0.1F, -1.8F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 219 door schnozz
		bodyModel[197].setRotationPoint(-47F, -16F, 6F);

		bodyModel[198].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,1.8F, -0.25F, -0.1F, -1.8F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F, 1.8F, 0F, -0.1F, -1.8F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 220 door schnozz
		bodyModel[198].setRotationPoint(-47F, -17F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,1.8F, 0F, -0.1F, -1.8F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 1.8F, -0.5F, -0.1F, -1.8F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 221 door schnozz
		bodyModel[199].setRotationPoint(-47F, -3F, 6F);

		bodyModel[200].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 326
		bodyModel[200].setRotationPoint(-28F, -16F, 11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,-0.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -8.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 223
		bodyModel[201].setRotationPoint(-17F, -23F, -7.6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[202].setRotationPoint(-23.5F, -21F, -8.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[203].setRotationPoint(-23.5F, -22F, -8.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 226 fuel cutoff UP
		bodyModel[204].setRotationPoint(0F, -1F, 8.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 227 fuel cutoff switch UP
		bodyModel[205].setRotationPoint(3F, -1F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 40, 5, 1, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0F, -4F, -20F, 0F, -4F, -20F, 0F, 4F, 0F, 0F, 4F); // Box 228
		bodyModel[206].setRotationPoint(17.5F, -18.9F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 40, 5, 1, 0F,0F, 0.1F, -1F, -20F, 0.1F, -1F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -20F, 0F, 4F, -20F, 0F, -4F, 0F, 0F, -4F); // Box 229
		bodyModel[207].setRotationPoint(17.5F, -18.9F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 10, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[208].setRotationPoint(30.5F, -13F, -7.01F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 254 cull HORIZ dynamic fins
		bodyModel[209].setRotationPoint(41F, -14F, -7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255 horizontal dynamic fins part
		bodyModel[210].setRotationPoint(40F, -4F, -7F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 0, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262 VERT dynamic fins
		bodyModel[211].setRotationPoint(39F, -6.75F, -7F);

		bodyModel[212].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 263
		bodyModel[212].setRotationPoint(17.25F, -24F, -2F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[213].setRotationPoint(20.25F, -24F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 265
		bodyModel[214].setRotationPoint(20.25F, -24F, -5F);

		bodyModel[215].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 266
		bodyModel[215].setRotationPoint(27.75F, -24F, -2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 267
		bodyModel[216].setRotationPoint(30.75F, -24F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[217].setRotationPoint(30.75F, -24F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[218].setRotationPoint(38F, -23F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[219].setRotationPoint(45F, -23F, -3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[220].setRotationPoint(45F, -23F, 3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[221].setRotationPoint(45F, -23F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1251 rear sand fil EARLY
		bodyModel[222].setRotationPoint(47F, -22.6F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0.5F, 0F, 0.02F, -1F, 5F, 0.02F, -1F, 5F, 19.02F, 0.5F, 0F, 19.02F, 0F, 0F, 0.02F, -0.5F, -5F, 0.02F, -0.5F, -5F, 19.02F, 0F, 0F, 19.02F); // Box 281 cab isolation seam
		bodyModel[223].setRotationPoint(-38F, -3F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 31 highhood headlight mount
		bodyModel[224].setRotationPoint(-49.1F, -23.5F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 headlight hh
		bodyModel[225].setRotationPoint(-49.35F, -23.35F, -2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 248 headlight hh
		bodyModel[226].setRotationPoint(-49.35F, -23.35F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,-1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276 highhood mount
		bodyModel[227].setRotationPoint(-49.1F, -23.5F, -7F);

		bodyModel[228].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 277 highhood mount
		bodyModel[228].setRotationPoint(-49.1F, -23.5F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.75F, -0.1F, -0.6F, -1.2F, -0.1F, -0.6F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.75F, -0.1F, -0.6F, -1.2F, -0.1F, -0.6F); // Box 356 numberboard hh
		bodyModel[229].setRotationPoint(-49.12F, -23.5F, 1F);

		bodyModel[230].addShapeBox(0F, 0F, 1F, 1, 2, 4, 0F,-1.2F, -0.1F, -0.6F, 0.75F, -0.1F, -0.6F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -1.2F, -0.1F, -0.6F, 0.75F, -0.1F, -0.6F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 59 numberboard hh
		bodyModel[230].setRotationPoint(-49.12F, -23.5F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 20, 8, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[231].setRotationPoint(-27F, -12F, -11.01F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64 sunshield late
		bodyModel[232].setRotationPoint(-36F, -21F, 11F);
		bodyModel[232].rotateAngleX = 0.26179939F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65 sunshield late
		bodyModel[233].setRotationPoint(-36F, -21.25F, -11.97F);
		bodyModel[233].rotateAngleX = -0.26179939F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 292 cull backup horn mount
		bodyModel[234].setRotationPoint(49F, -20F, -1F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 293 cull anticlimber
		bodyModel[235].setRotationPoint(-53F, -2F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 294 cull anticlimber
		bodyModel[236].setRotationPoint(-53F, -2F, 2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295 cull anticlimber
		bodyModel[237].setRotationPoint(-53F, -2F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0.25F, 0F, 11F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0.25F, -0.5F, 11F); // Box 296 cull anticlimber support
		bodyModel[238].setRotationPoint(-52F, -1F, -6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 298 cull anticlimber late
		bodyModel[239].setRotationPoint(-53F, -2F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -1F); // Box 299 cull anticlimber late
		bodyModel[240].setRotationPoint(-53F, -2F, 6F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 293 cull anticlimber
		bodyModel[241].setRotationPoint(51F, -2F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 294 cull anticlimber
		bodyModel[242].setRotationPoint(51F, -2F, 2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295 cull anticlimber
		bodyModel[243].setRotationPoint(51F, -2F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 11F, 0F, 0F, 11F); // Box 296 cull anticlimber support
		bodyModel[244].setRotationPoint(51F, -1F, -6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 298 cull anticlimber late
		bodyModel[245].setRotationPoint(51F, -2F, -7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.5F); // Box 299 cull anticlimber late
		bodyModel[246].setRotationPoint(51F, -2F, 6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,-0.25F, -0.25F, 0F, -7.75F, -0.25F, 0F, -7.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -7.75F, -0.25F, 0F, -7.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 306
		bodyModel[247].setRotationPoint(-16.5F, -15F, -11.25F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 307 beansniff ptc bubble
		bodyModel[248].setRotationPoint(-38F, -24F, -2.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 204
		bodyModel[249].setRotationPoint(-31F, 2F, -1F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 205
		bodyModel[250].setRotationPoint(-36F, 2F, -1F);

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 516
		bodyModel[251].setRotationPoint(-38.5F, 1F, -9F);

		bodyModel[252].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 517
		bodyModel[252].setRotationPoint(-27.5F, 1F, -9F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 284
		bodyModel[253].setRotationPoint(35F, 2F, -1F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 285
		bodyModel[254].setRotationPoint(30F, 2F, -1F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 286
		bodyModel[255].setRotationPoint(24.5F, 1F, -9F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 287
		bodyModel[256].setRotationPoint(35.5F, 1F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 18, 0, 18, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F); // Box 402 dyn fan
		bodyModel[257].setRotationPoint(38F, -22.51F, -4.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 289 filters of somesort
		bodyModel[258].setRotationPoint(-16F, -1F, 8F);
		bodyModel[258].rotateAngleY = 0.48869219F;

		bodyModel[259].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 290
		bodyModel[259].setRotationPoint(-38F, 0.5F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 291 dont forget
		bodyModel[260].setRotationPoint(-37F, -1F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[261].setRotationPoint(-37F, 0F, -10F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 293
		bodyModel[262].setRotationPoint(-38F, 0.5F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F); // Box 294 cull
		bodyModel[263].setRotationPoint(-38F, -1.5F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, 19F); // Box 295 cull
		bodyModel[264].setRotationPoint(36F, -1.5F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 2, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[265].setRotationPoint(37F, 0F, -10F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 297
		bodyModel[266].setRotationPoint(36F, 0.5F, -11F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 298
		bodyModel[267].setRotationPoint(36F, 0.5F, 10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 299 dont forget
		bodyModel[268].setRotationPoint(37F, -1F, -10F);

		bodyModel[269].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 300
		bodyModel[269].setRotationPoint(-47F, -3F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,-1F, 1F, -5F, 1F, 1F, -5F, 1F, 1F, 5F, -1F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[270].setRotationPoint(-47F, -11F, -11F);

		bodyModel[271].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 302
		bodyModel[271].setRotationPoint(-47F, -3F, 10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,-1F, 1F, 5F, 1F, 1F, 5F, 1F, 1F, -5F, -1F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[272].setRotationPoint(-47F, -11F, 10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Box 304 cn marker
		bodyModel[273].setRotationPoint(-39.5F, -22.15F, 6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Box 305 cn marker
		bodyModel[274].setRotationPoint(-39.5F, -22.15F, -7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.625F, -0.5F, -0.625F, -0.625F, -0.5F, -0.625F, -0.625F, -0.5F, -0.625F, -0.625F, -0.5F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 288 e-bell
		bodyModel[275].setRotationPoint(-24F, -0.25F, 8.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 287 e-bell
		bodyModel[276].setRotationPoint(-24F, -1.25F, 8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136 e-bell
		bodyModel[277].setRotationPoint(-24F, 0.25F, 8.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 15, 8, 0, 0F); // Box 310 engine oil drain i think
		bodyModel[278].setRotationPoint(-13.75F, 0F, -7.25F);

		bodyModel[279].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 311 cn marker
		bodyModel[279].setRotationPoint(46.35F, -21F, -6.75F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 312 cn marker holder
		bodyModel[280].setRotationPoint(46F, -21F, -6.75F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 313 cn marker
		bodyModel[281].setRotationPoint(46.35F, -21F, 5.75F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0.25F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 314 cn marker holder
		bodyModel[282].setRotationPoint(46F, -21F, 5.75F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 315
		bodyModel[283].setRotationPoint(15F, -1F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 316 fuel cutoff switch 2
		bodyModel[284].setRotationPoint(2F, -1F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 am bell
		bodyModel[285].setRotationPoint(-42.5F, -22F, -0.25F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74 am bell
		bodyModel[286].setRotationPoint(-42.75F, -23.5F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114 am bell
		bodyModel[287].setRotationPoint(-42.75F, -22.5F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, -0.5F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -1F, -0.75F, 1.5F, -1F, -0.75F, 1.5F, -0.25F, -0.75F, -0.5F); // Box 320 cull am bell holder
		bodyModel[288].setRotationPoint(-43.25F, -23.5F, -0.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 309
		bodyModel[289].setRotationPoint(-11F, -10F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 6F, 0F, -3F, 6F, 0F, 0.5F, 0F, 0F); // Box 310
		bodyModel[290].setRotationPoint(-14F, -16F, 11.01F);

		bodyModel[291].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 311
		bodyModel[291].setRotationPoint(-9F, -10F, -11F);

		bodyModel[292].addBox(0F, 0F, 0F, 20, 6, 0, 0F); // Box 312
		bodyModel[292].setRotationPoint(-28F, -21F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 313
		bodyModel[293].setRotationPoint(-9F, -15F, -11F);

		bodyModel[294].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 243
		bodyModel[294].setRotationPoint(47F, -10F, 9F);

		bodyModel[295].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 250
		bodyModel[295].setRotationPoint(47F, -10F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[296].setRotationPoint(47.01F, -4F, -11.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 543
		bodyModel[297].setRotationPoint(47.01F, -4F, 10.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 11.05F, 0F, 0F, 11.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 11.05F, 0F, 0F, 11.05F); // Box 318 db hatch split
		bodyModel[298].setRotationPoint(41.5F, -21F, -7F);

		bodyModel[299].addBox(0F, 0F, 0F, 10, 0, 10, 0F); // Box 319
		bodyModel[299].setRotationPoint(17.25F, -24.01F, -5F);

		bodyModel[300].addBox(0F, 0F, 0F, 10, 0, 10, 0F); // Box 320
		bodyModel[300].setRotationPoint(27.75F, -24.01F, -5F);

		bodyModel[301].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 321 cull HORIZ dynamic fins
		bodyModel[301].setRotationPoint(39F, -4.5F, -7F);

		bodyModel[302].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 322 cull HORIZ dynamic fins
		bodyModel[302].setRotationPoint(39F, -6F, -7F);

		bodyModel[303].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 323 cull HORIZ dynamic fins
		bodyModel[303].setRotationPoint(39F, -7.5F, -7F);

		bodyModel[304].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 324 cull HORIZ dynamic fins
		bodyModel[304].setRotationPoint(39F, -9F, -7F);

		bodyModel[305].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 325 cull HORIZ dynamic fins
		bodyModel[305].setRotationPoint(39F, -10.5F, -7F);

		bodyModel[306].addShapeBox(0F, -1F, 0F, 6, 1, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 10F, 0F, 0.5F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F); // Box 326 cull HORIZ dynamic fins
		bodyModel[306].setRotationPoint(39F, -12F, -7F);

		bodyModel[307].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 327
		bodyModel[307].setRotationPoint(46F, -14F, -2F);

		bodyModel[308].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 328
		bodyModel[308].setRotationPoint(46F, -14F, 1F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 329
		bodyModel[309].setRotationPoint(46F, -9F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 22, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, -2F, 0F, -11F, -2F); // Box 330 rear venty
		bodyModel[310].setRotationPoint(49F, -14F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -4.625F, 0F, 0F, -4.625F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[311].setRotationPoint(-51F, -10F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.25F, -0.5F, 1F); // Box 333 cull anticlimber support
		bodyModel[312].setRotationPoint(-52F, -2F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 1F, 0F, 0F, 1F); // Box 334 cull anticlimber support
		bodyModel[313].setRotationPoint(51F, -2F, -1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[314].setRotationPoint(-38F, -17F, 6F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 13, 4, 0F); // Box 336
		bodyModel[315].setRotationPoint(-39F, -17F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 337
		bodyModel[316].setRotationPoint(-38F, -17F, -10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 cab heater
		bodyModel[317].setRotationPoint(-37F, -10F, -10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339 cab heater
		bodyModel[318].setRotationPoint(-37F, -10F, 9F);

		bodyModel[319].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 340
		bodyModel[319].setRotationPoint(-37F, -9F, 3F);

		bodyModel[320].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 341
		bodyModel[320].setRotationPoint(-37F, -9F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 342
		bodyModel[321].setRotationPoint(-37F, -18F, 2F);

		bodyModel[322].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 343
		bodyModel[322].setRotationPoint(-37F, -15F, 5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 344
		bodyModel[323].setRotationPoint(-37F, -15F, -10F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 345
		bodyModel[324].setRotationPoint(-37F, -16F, -4F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 346
		bodyModel[325].setRotationPoint(-36F, -15F, 7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[326].setRotationPoint(-40F, -22F, -0.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 348
		bodyModel[327].setRotationPoint(-30F, -22F, -0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,-1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[328].setRotationPoint(-52.75F, -10F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 446
		bodyModel[329].setRotationPoint(-52.75F, -10F, 2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[330].setRotationPoint(-52.75F, -10F, -2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F); // Box 352
		bodyModel[331].setRotationPoint(-51.75F, -10F, -5.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F); // Box 353
		bodyModel[332].setRotationPoint(-51.75F, -10F, 5.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4.625F, 0F, 0F, -4.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[333].setRotationPoint(-51F, -10F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[334].setRotationPoint(-51F, -10F, -7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 356
		bodyModel[335].setRotationPoint(-51F, -10F, 6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 357
		bodyModel[336].setRotationPoint(52.75F, -10F, 2F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[337].setRotationPoint(52.75F, -10F, -2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 0, 8, 4, 0F,1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[338].setRotationPoint(52.75F, -10F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 360
		bodyModel[339].setRotationPoint(50.75F, -10F, -5.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[340].setRotationPoint(51F, -10F, -7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -4.625F, 0F, 0F, -4.625F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[341].setRotationPoint(51F, -10F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F); // Box 363
		bodyModel[342].setRotationPoint(50.75F, -10F, 5.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 364
		bodyModel[343].setRotationPoint(51F, -10F, 6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, -4.625F, 0F, 0F, -4.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[344].setRotationPoint(51F, -10F, 10F);

		bodyModel[345].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 366 cull bubble ptc shit
		bodyModel[345].setRotationPoint(-36F, -24F, -5F);

		bodyModel[346].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 368 ptc block
		bodyModel[346].setRotationPoint(-38.5F, -23.5F, -4F);

		bodyModel[347].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 369 ptc block
		bodyModel[347].setRotationPoint(-32.5F, -23.5F, -4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 415 cull ptc sinclair
		bodyModel[348].setRotationPoint(-37.5F, -24.25F, -3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371 ptc
		bodyModel[349].setRotationPoint(-37.75F, -24.25F, 0F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372 ptc
		bodyModel[350].setRotationPoint(-37.25F, -24.25F, 1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373 ptc
		bodyModel[351].setRotationPoint(-32.25F, -24.25F, 1F);
		bodyModel[351].rotateAngleY = 0.45378561F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374 ptc
		bodyModel[352].setRotationPoint(-32.25F, -24.25F, -1F);
		bodyModel[352].rotateAngleY = -0.45378561F;

		bodyModel[353].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 352 mu squiggle
		bodyModel[353].setRotationPoint(-51F, -1F, -5.5F);
		bodyModel[353].rotateAngleZ = -0.40142573F;

		bodyModel[354].addBox(0F, 0F, 0F, 0, 4, 11, 0F); // Box 376 mu squiggle
		bodyModel[354].setRotationPoint(51F, -1F, -5.5F);
		bodyModel[354].rotateAngleZ = 0.40142573F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[355].setRotationPoint(-52.25F, -4F, -6F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[356].setRotationPoint(-52.25F, -4F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 579 THIS IS A DITCHLUIGHT IT WILL GLOW
		bodyModel[357].setRotationPoint(-52.5F, -4F, 4F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 ditchglight front
		bodyModel[358].setRotationPoint(-52.5F, -4F, -6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[359].setRotationPoint(51.25F, -4F, -6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[360].setRotationPoint(51.25F, -4F, 4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 ditchlight reare
		bodyModel[361].setRotationPoint(51.5F, -4F, -6F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 395 ditchlight rear
		bodyModel[362].setRotationPoint(51.5F, -4F, 4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[363].setRotationPoint(51.01F, 5F, -7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[364].setRotationPoint(51.01F, 5F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[365].setRotationPoint(-38F, -24.75F, -6.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342 commander beacon
		bodyModel[366].setRotationPoint(-38F, -24.75F, 5.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[367].setRotationPoint(-40F, -24F, -0.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[368].setRotationPoint(-40F, -25F, -0.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 21, 11, 22, 0F,0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F); // Box 391 cull FERROMEX EARS
		bodyModel[369].setRotationPoint(17F, -19F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0F, 0F, 0.5F, -8F, 0F, 0.5F, -7.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, -5F, 0.5F, -8F, -5F, 0.5F, -7.5F, -5F, -2F, 0.5F, -5F, -2F); // Box 392 cull ferromex cartel cage
		bodyModel[370].setRotationPoint(-37F, -21F, -12F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 16, 10, 3, 0F,0.5F, 0F, -2F, -7.5F, 0F, -2F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -5F, -2F, -7.5F, -5F, -2F, -8F, -5F, 0.5F, 0F, -5F, 0.5F); // Box 393 cull ferromex cartel cage
		bodyModel[371].setRotationPoint(-37F, -21F, 9F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 372
		bodyModel[372].setRotationPoint(-0.5F, 2F, -11.1F);

		bodyModel[373].addBox(-1F, 0F, -1F, 1, 2, 1, 0F); // Box 373
		bodyModel[373].setRotationPoint(-0.5F, 2F, 10.1F);
		bodyModel[373].rotateAngleY = -3.14159265F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[374].setRotationPoint(51F, -2F, -7F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 375
		bodyModel[375].setRotationPoint(51F, -2F, 6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 0, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, -2F, -6F); // Box 380 screeens
		bodyModel[376].setRotationPoint(-36.99F, -17F, 4F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 90, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 402 lots of little pipes
		bodyModel[377].setRotationPoint(-45F, 1F, -6.4F);
		bodyModel[377].rotateAngleX = 1.93731547F;

		bodyModel[378].addShapeBox(0F, 0F, -3F, 90, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F); // Box 382
		bodyModel[378].setRotationPoint(-45F, 1F, 6.4F);
		bodyModel[378].rotateAngleX = -1.93731547F;

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 19.05F, 0F, 0F, 19.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 19.05F, 0F, 0.5F, 19.05F); // Box 379 cull thundercab square mounters
		bodyModel[379].setRotationPoint(-39F, -1F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 19.05F, 0F, 0F, 19.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 19.05F, 0F, 0.5F, 19.05F); // Box 379 cull thundercab square mounters
		bodyModel[380].setRotationPoint(35F, -1F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 381 cull sd70m-2 demo shit
		bodyModel[381].setRotationPoint(-26F, -1F, -11F);
	}
	ModelHTCR2_new bogie = new ModelHTCR2_new();
	ModelHTCR2_peter_edition bogie2 = new ModelHTCR2_peter_edition();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);
		if (GetColor(entity) == 634 ||GetColor(entity) == 124) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/ge_hiad_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 10) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_itsilver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.97F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.95F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 16) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_peter_front.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-2F, 0.0F, 0F);
			bogie2.render(entity, f, f1, f2, f3, f4, f5);

			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_peter_back.png"));
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-4F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 18 || GetColor(entity) == 19) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_bnsilver.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.97F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.95F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}else if (GetColor(entity) == 23 ||GetColor(entity) == 24
		|| GetColor(entity) == 25 || GetColor(entity) == 26) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_upgrey.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.97F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.95F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/HTCR_newer_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.97F, 0.0F, 0F);
			bogie.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glRotatef(180, 0, 1, 0);
			GL11.glTranslated(-3.95F, 0.0F, 0);
			bogie.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		}
	}
}